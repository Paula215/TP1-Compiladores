
cmake_minimum_required(VERSION 3.20)

project(BiolingoOptDemo C CXX)

set(CMAKE_BUILD_TYPE Debug)
set(CMAKE_C_STANDARD 11)
set(CMAKE_C_STANDARD_REQUIRED ON)
set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_EXPORT_COMPILE_COMMANDS ON)

# ============================
# Encontrar LLVM
# ============================
find_package(LLVM REQUIRED CONFIG)

message(STATUS "Found LLVM ${LLVM_PACKAGE_VERSION}")
message(STATUS "Using LLVMConfig.cmake in: ${LLVM_DIR}")

# ============================
# Fuentes del proyecto
# ============================
file(GLOB SOURCES "*.cpp")
add_executable(${PROJECT_NAME} ${SOURCES})

# ============================
# Configuración LLVM
# ============================
target_include_directories(${PROJECT_NAME} PRIVATE ${LLVM_INCLUDE_DIRS})
add_definitions(${LLVM_DEFINITIONS})

# ============================
# Linkear con librería monolítica LLVM
# ============================
target_link_libraries(${PROJECT_NAME} PRIVATE LLVM)

# Deshabilitar RTTI si es necesario
if(NOT LLVM_ENABLE_RTTI)
    target_compile_options(${PROJECT_NAME} PRIVATE -fno-rtti)
endif()
