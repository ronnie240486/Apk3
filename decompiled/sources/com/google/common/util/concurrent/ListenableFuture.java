package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.DoNotMock("Use the methods in Futures (like immediateFuture) or SettableFuture")
public interface ListenableFuture<V> extends java.util.concurrent.Future<V> {
    void addListener(java.lang.Runnable r1, java.util.concurrent.Executor r2);
}
