package com.google.common.reflect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
abstract class TypeCapture<T> {
    public TypeCapture() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.reflect.Type capture() {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            java.lang.String r2 = "%s isn't parameterized"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r0)
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            return r0
    }
}
