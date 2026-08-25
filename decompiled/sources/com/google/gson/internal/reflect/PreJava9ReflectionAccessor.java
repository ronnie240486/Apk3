package com.google.gson.internal.reflect;

/* JADX INFO: loaded from: classes3.dex */
final class PreJava9ReflectionAccessor extends com.google.gson.internal.reflect.ReflectionAccessor {
    public PreJava9ReflectionAccessor() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.gson.internal.reflect.ReflectionAccessor
    public void makeAccessible(java.lang.reflect.AccessibleObject r2) {
            r1 = this;
            r0 = 1
            r2.setAccessible(r0)
            return
    }
}
