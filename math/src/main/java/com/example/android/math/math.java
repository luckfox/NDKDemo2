package com.example.android.math;

/**
 * Created by administrator on 2015/7/8.
 */
public class math
{

    public static int add(int a,int b)
    {
        return NativeAdd(a,b);
    }
    public static int sub(int a,int b)
    {
        return NativeSub(a,b);
    }
    private native static int NativeAdd(int a,int b);
    private native static int NativeSub(int a,int b);
    static
    {
        System.loadLibrary("math");
    }
}
