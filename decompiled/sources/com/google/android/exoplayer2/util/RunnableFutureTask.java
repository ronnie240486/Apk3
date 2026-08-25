package com.google.android.exoplayer2.util;

import java.lang.Exception;

/* JADX INFO: loaded from: classes.dex */
public abstract class RunnableFutureTask<R, E extends java.lang.Exception> implements java.util.concurrent.RunnableFuture<R> {
    private final java.lang.Object cancelLock;
    private boolean canceled;

    @androidx.annotation.Nullable
    private java.lang.Exception exception;
    private final com.google.android.exoplayer2.util.ConditionVariable finished;

    @androidx.annotation.Nullable
    private R result;
    private final com.google.android.exoplayer2.util.ConditionVariable started;

    @androidx.annotation.Nullable
    private java.lang.Thread workThread;

    public RunnableFutureTask() {
            r1 = this;
            r1.<init>()
            com.google.android.exoplayer2.util.ConditionVariable r0 = new com.google.android.exoplayer2.util.ConditionVariable
            r0.<init>()
            r1.started = r0
            com.google.android.exoplayer2.util.ConditionVariable r0 = new com.google.android.exoplayer2.util.ConditionVariable
            r0.<init>()
            r1.finished = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.cancelLock = r0
            return
    }

    @com.google.android.exoplayer2.util.UnknownNull
    private R getResult() throws java.util.concurrent.ExecutionException {
            r2 = this;
            boolean r0 = r2.canceled
            if (r0 != 0) goto L13
            java.lang.Exception r0 = r2.exception
            if (r0 != 0) goto Lb
            R r0 = r2.result
            return r0
        Lb:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            java.lang.Exception r1 = r2.exception
            r0.<init>(r1)
            throw r0
        L13:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>()
            throw r0
    }

    public final void blockUntilFinished() {
            r1 = this;
            com.google.android.exoplayer2.util.ConditionVariable r0 = r1.finished
            r0.blockUninterruptible()
            return
    }

    public final void blockUntilStarted() {
            r1 = this;
            com.google.android.exoplayer2.util.ConditionVariable r0 = r1.started
            r0.blockUninterruptible()
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r4) {
            r3 = this;
            java.lang.Object r0 = r3.cancelLock
            monitor-enter(r0)
            boolean r1 = r3.canceled     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2c
            com.google.android.exoplayer2.util.ConditionVariable r1 = r3.finished     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r1.isOpen()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L10
            goto L2c
        L10:
            r1 = 1
            r3.canceled = r1     // Catch: java.lang.Throwable -> L2f
            r3.cancelWork()     // Catch: java.lang.Throwable -> L2f
            java.lang.Thread r2 = r3.workThread     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L20
            if (r4 == 0) goto L2a
            r2.interrupt()     // Catch: java.lang.Throwable -> L2f
            goto L2a
        L20:
            com.google.android.exoplayer2.util.ConditionVariable r4 = r3.started     // Catch: java.lang.Throwable -> L2f
            r4.open()     // Catch: java.lang.Throwable -> L2f
            com.google.android.exoplayer2.util.ConditionVariable r4 = r3.finished     // Catch: java.lang.Throwable -> L2f
            r4.open()     // Catch: java.lang.Throwable -> L2f
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r1
        L2c:
            r4 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r4
        L2f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r4
    }

    public void cancelWork() {
            r0 = this;
            return
    }

    @com.google.android.exoplayer2.util.UnknownNull
    public abstract R doWork() throws java.lang.Exception;

    @Override // java.util.concurrent.Future
    @com.google.android.exoplayer2.util.UnknownNull
    public final R get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            r1 = this;
            com.google.android.exoplayer2.util.ConditionVariable r0 = r1.finished
            r0.block()
            java.lang.Object r0 = r1.getResult()
            return r0
    }

    @Override // java.util.concurrent.Future
    @com.google.android.exoplayer2.util.UnknownNull
    public final R get(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r0.convert(r2, r4)
            com.google.android.exoplayer2.util.ConditionVariable r4 = r1.finished
            boolean r2 = r4.block(r2)
            if (r2 == 0) goto L13
            java.lang.Object r2 = r1.getResult()
            return r2
        L13:
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            r2.<init>()
            throw r2
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            boolean r0 = r1.canceled
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r1 = this;
            com.google.android.exoplayer2.util.ConditionVariable r0 = r1.finished
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
            r4 = this;
            java.lang.Object r0 = r4.cancelLock
            monitor-enter(r0)
            boolean r1 = r4.canceled     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            return
        L9:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L57
            r4.workThread = r1     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            com.google.android.exoplayer2.util.ConditionVariable r0 = r4.started
            r0.open()
            r0 = 0
            java.lang.Object r1 = r4.doWork()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r4.result = r1     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.Object r1 = r4.cancelLock
            monitor-enter(r1)
            com.google.android.exoplayer2.util.ConditionVariable r2 = r4.finished     // Catch: java.lang.Throwable -> L2b
            r2.open()     // Catch: java.lang.Throwable -> L2b
            r4.workThread = r0     // Catch: java.lang.Throwable -> L2b
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            goto L41
        L2b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r0
        L2e:
            r1 = move-exception
            goto L45
        L30:
            r1 = move-exception
            r4.exception = r1     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r1 = r4.cancelLock
            monitor-enter(r1)
            com.google.android.exoplayer2.util.ConditionVariable r2 = r4.finished     // Catch: java.lang.Throwable -> L42
            r2.open()     // Catch: java.lang.Throwable -> L42
            r4.workThread = r0     // Catch: java.lang.Throwable -> L42
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L42
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
        L41:
            return
        L42:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            throw r0
        L45:
            java.lang.Object r2 = r4.cancelLock
            monitor-enter(r2)
            com.google.android.exoplayer2.util.ConditionVariable r3 = r4.finished     // Catch: java.lang.Throwable -> L54
            r3.open()     // Catch: java.lang.Throwable -> L54
            r4.workThread = r0     // Catch: java.lang.Throwable -> L54
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            throw r1
        L54:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            throw r0
        L57:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r1
    }
}
