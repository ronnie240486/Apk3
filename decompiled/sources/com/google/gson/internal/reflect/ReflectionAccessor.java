package com.google.gson.internal.reflect;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReflectionAccessor {
    private static final com.google.gson.internal.reflect.ReflectionAccessor instance = null;

    static {
            int r0 = com.google.gson.internal.JavaVersion.getMajorJavaVersion()
            r1 = 9
            if (r0 >= r1) goto Le
            com.google.gson.internal.reflect.PreJava9ReflectionAccessor r0 = new com.google.gson.internal.reflect.PreJava9ReflectionAccessor
            r0.<init>()
            goto L13
        Le:
            com.google.gson.internal.reflect.UnsafeReflectionAccessor r0 = new com.google.gson.internal.reflect.UnsafeReflectionAccessor
            r0.<init>()
        L13:
            com.google.gson.internal.reflect.ReflectionAccessor.instance = r0
            return
    }

    public ReflectionAccessor() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.gson.internal.reflect.ReflectionAccessor getInstance() {
            com.google.gson.internal.reflect.ReflectionAccessor r0 = com.google.gson.internal.reflect.ReflectionAccessor.instance
            return r0
    }

    public abstract void makeAccessible(java.lang.reflect.AccessibleObject r1);
}
