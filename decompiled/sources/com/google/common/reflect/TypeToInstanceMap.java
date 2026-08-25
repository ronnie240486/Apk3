package com.google.common.reflect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.DoNotMock("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
@com.google.common.annotations.Beta
public interface TypeToInstanceMap<B> extends java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> {
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    <T extends B> T getInstance(com.google.common.reflect.TypeToken<T> r1);

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    <T extends B> T getInstance(java.lang.Class<T> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    <T extends B> T putInstance(com.google.common.reflect.TypeToken<T> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    <T extends B> T putInstance(java.lang.Class<T> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2);
}
