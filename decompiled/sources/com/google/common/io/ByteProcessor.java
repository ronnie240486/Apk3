package com.google.common.io;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.errorprone.annotations.DoNotMock("Implement it normally")
public interface ByteProcessor<T> {
    @com.google.common.io.ParametricNullness
    T getResult();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean processBytes(byte[] r1, int r2, int r3) throws java.io.IOException;
}
