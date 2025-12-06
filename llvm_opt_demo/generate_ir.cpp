#include <llvm/IR/Constants.h>
#include <llvm/IR/IRBuilder.h>
#include <llvm/IR/LLVMContext.h>
#include <llvm/IR/Module.h>
#include <llvm/IR/PassManager.h>
#include <llvm/Passes/PassBuilder.h>
#include <llvm/Support/raw_ostream.h>

int main() {
    llvm::LLVMContext C;
    llvm::Module M("BiolingoOptDemo", C);
    llvm::IRBuilder<> builder(C);

    // ----------------------------------------
    // 1) Declarar tipo de funcion: int compute(int)
    // ----------------------------------------
    auto *i32Ty = builder.getInt32Ty();
    llvm::FunctionType *computeFT =
        llvm::FunctionType::get(i32Ty, {i32Ty}, false);

    llvm::Function *computeF = llvm::Function::Create(
        computeFT,
        llvm::Function::InternalLinkage, // ayuda a que LLVM lo inlinee
        "compute",
        M
    );

    // Nombre del argumento
    llvm::Argument *xArg = computeF->getArg(0);
    xArg->setName("x");

    // Bloques de la funcion compute
    llvm::BasicBlock *entryBB =
        llvm::BasicBlock::Create(C, "entry", computeF);
    llvm::BasicBlock *deadBB =
        llvm::BasicBlock::Create(C, "dead", computeF);
    llvm::BasicBlock *retBB  =
        llvm::BasicBlock::Create(C, "ret", computeF);

    builder.SetInsertPoint(entryBB);

    // Codigo con redundancias dentro de compute:
    //
    //   y  = x * 2
    //   z  = y + 0      ; +0 redundante
    //   w  = z * 1      ; *1 redundante
    //   if (0) {        ; rama muerta
    //       w = w + 5;
    //   }
    //   return w;
    //
    auto *two  = llvm::ConstantInt::get(i32Ty, 2);
    auto *zero = llvm::ConstantInt::get(i32Ty, 0);
    auto *one  = llvm::ConstantInt::get(i32Ty, 1);
    auto *five = llvm::ConstantInt::get(i32Ty, 5);

    auto *y = builder.CreateMul(xArg, two, "y");
    auto *z = builder.CreateAdd(y, zero, "z");
    auto *w = builder.CreateMul(z, one, "w");

    // if (0) -> condicion constante falsa
    auto *cond = llvm::ConstantInt::get(i32Ty, 0);
    auto *isZero = builder.CreateICmpEQ(cond, zero, "isZero");
    // Nota: cond == 0 siempre es true, pero LLVM puede simplificarlo
    // y analizar que el bloque "dead" no afecta el resultado final.
    builder.CreateCondBr(isZero, deadBB, retBB);

    // Bloque muerto (dead): nunca deberia ejecutarse tras optimizacion
    builder.SetInsertPoint(deadBB);
    auto *wPlusFive = builder.CreateAdd(w, five, "w_plus_five");
    builder.CreateBr(retBB);

    // Bloque de retorno: merge de los valores "w" y "w_plus_five"
    builder.SetInsertPoint(retBB);
    auto *phi = builder.CreatePHI(i32Ty, 2, "retVal");
    phi->addIncoming(w, entryBB);
    phi->addIncoming(wPlusFive, deadBB);
    builder.CreateRet(phi);

    // ----------------------------------------
    // 2) Funcion main: llama a compute(10)
    // ----------------------------------------
    llvm::FunctionType *mainFT =
        llvm::FunctionType::get(i32Ty, {}, false);
    llvm::Function *mainF = llvm::Function::Create(
        mainFT,
        llvm::Function::ExternalLinkage,
        "main",
        M
    );

    llvm::BasicBlock *mainBB =
        llvm::BasicBlock::Create(C, "entry", mainF);
    builder.SetInsertPoint(mainBB);

    auto *ten = llvm::ConstantInt::get(i32Ty, 10);
    auto *callCompute = builder.CreateCall(computeF, {ten}, "call_compute");
    builder.CreateRet(callCompute);

    // ----------------------------------------
    // 3) IR SIN OPTIMIZAR
    // ----------------------------------------
    llvm::outs() << "=== IR SIN OPTIMIZAR ===\n\n";
    M.print(llvm::outs(), nullptr);

    // ----------------------------------------
    // 4) Pipeline de optimizacion O2
    // ----------------------------------------
    llvm::PassBuilder PB;
    llvm::LoopAnalysisManager LAM;
    llvm::FunctionAnalysisManager FAM;
    llvm::CGSCCAnalysisManager CGAM;
    llvm::ModuleAnalysisManager MAM;

    PB.registerModuleAnalyses(MAM);
    PB.registerCGSCCAnalyses(CGAM);
    PB.registerFunctionAnalyses(FAM);
    PB.registerLoopAnalyses(LAM);
    PB.crossRegisterProxies(LAM, FAM, CGAM, MAM);

    llvm::ModulePassManager MPM =
        PB.buildPerModuleDefaultPipeline(llvm::OptimizationLevel::O2);

    MPM.run(M, MAM);

    // ----------------------------------------
    // 5) IR OPTIMIZADO
    // ----------------------------------------
    llvm::outs() << "\n\n=== IR OPTIMIZADO (O2) ===\n\n";
    M.print(llvm::outs(), nullptr);

    return 0;
}