package com.google.common.io;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
public interface LineProcessor<T> {
    @com.google.common.io.ParametricNullness
    T getResult();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean processLine(java.lang.String r1) throws java.io.IOException;
}
