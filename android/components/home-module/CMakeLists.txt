cmake_minimum_required(VERSION 3.4.1)
set(CMAKE_VERBOSE_MAKEFILE on)
#set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR}/ypose/main/jniLibs/${ANDROID_ABI})
message(gif--->${CMAKE_LIBRARY_OUTPUT_DIRECTORY})
#set(lib_build_dir $ENV{HOME}/tmp/${ANDROID_ABI})
#set(lib_build_dir ${CMAKE_CURRENT_SOURCE_DIR}/.cxx/tmp/${ANDROID_ABI})
#file(MAKE_DIRECTORY ${lib_build_dir})

add_library(client_key SHARED
        ${CMAKE_CURRENT_SOURCE_DIR}/src/main/jni/client_key.cpp
        )
find_library( # Sets the name of the path variable.
        log-lib
        log)
#target_include_directories(client_key PRIVATE
#
#        ${ANDROID_NDK}/sources/android/native_app_glue
#        ../codec/include
#        ../utils/include
#        )

target_link_libraries( # Specifies the target library.
        client_key
        ${log-lib}
        )
