package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public interface AsyncCallable<V> {
    com.google.common.util.concurrent.ListenableFuture<V> call() throws java.lang.Exception;
}
