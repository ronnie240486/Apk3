package com.google.common.hash;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.DoNotMock("Implement with a lambda")
@com.google.common.annotations.Beta
@com.google.common.hash.ElementTypesAreNonnullByDefault
public interface Funnel<T> extends java.io.Serializable {
    void funnel(@com.google.common.hash.ParametricNullness T r1, com.google.common.hash.PrimitiveSink r2);
}
