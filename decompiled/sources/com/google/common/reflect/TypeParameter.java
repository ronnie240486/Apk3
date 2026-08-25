package com.google.common.reflect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public abstract class TypeParameter<T> extends com.google.common.reflect.TypeCapture<T> {
    public final java.lang.reflect.TypeVariable<?> typeVariable;

    public TypeParameter() {
            r3 = this;
            r3.<init>()
            java.lang.reflect.Type r0 = r3.capture()
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            java.lang.String r2 = "%s should be a type variable."
            com.google.common.base.Preconditions.checkArgument(r1, r2, r0)
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            r3.typeVariable = r0
            return
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.reflect.TypeParameter
            if (r0 == 0) goto Lf
            com.google.common.reflect.TypeParameter r2 = (com.google.common.reflect.TypeParameter) r2
            java.lang.reflect.TypeVariable<?> r0 = r1.typeVariable
            java.lang.reflect.TypeVariable<?> r2 = r2.typeVariable
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.reflect.TypeVariable<?> r0 = r1.typeVariable
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.reflect.TypeVariable<?> r0 = r1.typeVariable
            java.lang.String r0 = r0.toString()
            return r0
    }
}
