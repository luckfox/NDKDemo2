#include "com_example_android_math_math.h"
JNIEXPORT jint JNICALL Java_com_example_android_math_math_NativeAdd(JNIEnv *env, jobject obj, jint op1, jint op2)
{
    return op1+op2;
}

JNIEXPORT jint JNICALL Java_com_example_android_math_math_NativeSub(JNIEnv *env, jobject obj, jint op1, jint op2)
{
    return op1-op2;
}