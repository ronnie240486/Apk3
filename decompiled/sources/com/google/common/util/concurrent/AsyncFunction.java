package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public interface AsyncFunction<I, O> {
    com.google.common.util.concurrent.ListenableFuture<O> apply(@com.google.common.util.concurrent.ParametricNullness I r1) throws java.lang.Exception;
}
