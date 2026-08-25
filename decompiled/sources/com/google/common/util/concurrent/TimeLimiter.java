package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
@com.google.errorprone.annotations.DoNotMock("Use FakeTimeLimiter")
public interface TimeLimiter {
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    <T> T callUninterruptiblyWithTimeout(java.util.concurrent.Callable<T> r1, long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException;

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    <T> T callWithTimeout(java.util.concurrent.Callable<T> r1, long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException, java.util.concurrent.ExecutionException;

    <T> T newProxy(T r1, java.lang.Class<T> r2, long r3, java.util.concurrent.TimeUnit r5);

    void runUninterruptiblyWithTimeout(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException;

    void runWithTimeout(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException;
}
