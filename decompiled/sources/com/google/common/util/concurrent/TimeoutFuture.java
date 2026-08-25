package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
final class TimeoutFuture<V> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<V> {

    @javax.annotation.CheckForNull
    private com.google.common.util.concurrent.ListenableFuture<V> delegateRef;

    @javax.annotation.CheckForNull
    private java.util.concurrent.ScheduledFuture<?> timer;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.TimeoutFuture$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Fire<V> implements java.lang.Runnable {

        @javax.annotation.CheckForNull
        public com.google.common.util.concurrent.TimeoutFuture<V> timeoutFutureRef;

        public Fire(com.google.common.util.concurrent.TimeoutFuture<V> r1) {
                r0 = this;
                r0.<init>()
                r0.timeoutFutureRef = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r10 = this;
                com.google.common.util.concurrent.TimeoutFuture<V> r0 = r10.timeoutFutureRef
                if (r0 != 0) goto L5
                return
            L5:
                com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.TimeoutFuture.access$000(r0)
                if (r1 != 0) goto Lc
                return
            Lc:
                r2 = 0
                r10.timeoutFutureRef = r2
                boolean r3 = r1.isDone()
                if (r3 == 0) goto L19
                r0.setFuture(r1)
                goto L83
            L19:
                r3 = 1
                java.util.concurrent.ScheduledFuture r4 = com.google.common.util.concurrent.TimeoutFuture.access$100(r0)     // Catch: java.lang.Throwable -> L8e
                com.google.common.util.concurrent.TimeoutFuture.access$102(r0)     // Catch: java.lang.Throwable -> L8e
                java.lang.String r5 = "Timed out"
                if (r4 == 0) goto L51
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L84
                long r6 = r4.getDelay(r6)     // Catch: java.lang.Throwable -> L84
                long r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Throwable -> L84
                r8 = 10
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 <= 0) goto L51
                r4 = 75
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
                r8.<init>(r4)     // Catch: java.lang.Throwable -> L84
                r8.append(r5)     // Catch: java.lang.Throwable -> L84
                java.lang.String r4 = " (timeout delayed by "
                r8.append(r4)     // Catch: java.lang.Throwable -> L84
                r8.append(r6)     // Catch: java.lang.Throwable -> L84
                java.lang.String r4 = " ms after scheduled time)"
                r8.append(r4)     // Catch: java.lang.Throwable -> L84
                java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L84
                r5 = r4
            L51:
                java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L84
                java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L84
                int r7 = r4.length()     // Catch: java.lang.Throwable -> L84
                int r7 = r7 + 2
                int r8 = r6.length()     // Catch: java.lang.Throwable -> L84
                int r7 = r7 + r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
                r8.<init>(r7)     // Catch: java.lang.Throwable -> L84
                r8.append(r4)     // Catch: java.lang.Throwable -> L84
                java.lang.String r4 = ": "
                r8.append(r4)     // Catch: java.lang.Throwable -> L84
                r8.append(r6)     // Catch: java.lang.Throwable -> L84
                java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L84
                com.google.common.util.concurrent.TimeoutFuture$TimeoutFutureException r5 = new com.google.common.util.concurrent.TimeoutFuture$TimeoutFutureException     // Catch: java.lang.Throwable -> L8e
                r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L8e
                r0.setException(r5)     // Catch: java.lang.Throwable -> L8e
                r1.cancel(r3)
            L83:
                return
            L84:
                r4 = move-exception
                com.google.common.util.concurrent.TimeoutFuture$TimeoutFutureException r6 = new com.google.common.util.concurrent.TimeoutFuture$TimeoutFutureException     // Catch: java.lang.Throwable -> L8e
                r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L8e
                r0.setException(r6)     // Catch: java.lang.Throwable -> L8e
                throw r4     // Catch: java.lang.Throwable -> L8e
            L8e:
                r0 = move-exception
                r1.cancel(r3)
                throw r0
        }
    }

    public static final class TimeoutFutureException extends java.util.concurrent.TimeoutException {
        private TimeoutFutureException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public /* synthetic */ TimeoutFutureException(java.lang.String r1, com.google.common.util.concurrent.TimeoutFuture.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Throwable
        public synchronized java.lang.Throwable fillInStackTrace() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]     // Catch: java.lang.Throwable -> L9
                r1.setStackTrace(r0)     // Catch: java.lang.Throwable -> L9
                monitor-exit(r1)
                return r1
            L9:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }
    }

    private TimeoutFuture(com.google.common.util.concurrent.ListenableFuture<V> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r0.delegateRef = r1
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture access$000(com.google.common.util.concurrent.TimeoutFuture r0) {
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r0.delegateRef
            return r0
    }

    public static /* synthetic */ java.util.concurrent.ScheduledFuture access$100(com.google.common.util.concurrent.TimeoutFuture r0) {
            java.util.concurrent.ScheduledFuture<?> r0 = r0.timer
            return r0
    }

    public static /* synthetic */ void access$102(com.google.common.util.concurrent.TimeoutFuture r1) {
            r0 = 0
            r1.timer = r0
            return
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> create(com.google.common.util.concurrent.ListenableFuture<V> r2, long r3, java.util.concurrent.TimeUnit r5, java.util.concurrent.ScheduledExecutorService r6) {
            com.google.common.util.concurrent.TimeoutFuture r0 = new com.google.common.util.concurrent.TimeoutFuture
            r0.<init>(r2)
            com.google.common.util.concurrent.TimeoutFuture$Fire r1 = new com.google.common.util.concurrent.TimeoutFuture$Fire
            r1.<init>(r0)
            java.util.concurrent.ScheduledFuture r3 = r6.schedule(r1, r3, r5)
            r0.timer = r3
            java.util.concurrent.Executor r3 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r2.addListener(r1, r3)
            return r0
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r2.delegateRef
            r2.maybePropagateCancellationTo(r0)
            java.util.concurrent.ScheduledFuture<?> r0 = r2.timer
            if (r0 == 0) goto Ld
            r1 = 0
            r0.cancel(r1)
        Ld:
            r0 = 0
            r2.delegateRef = r0
            r2.timer = r0
            return
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @javax.annotation.CheckForNull
    public final java.lang.String pendingToString() {
            r6 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r6.delegateRef
            java.util.concurrent.ScheduledFuture<?> r1 = r6.timer
            if (r0 == 0) goto L4a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            int r2 = r2 + 14
            java.lang.String r3 = "inputFuture=["
            java.lang.String r4 = "]"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r0, r4)
            if (r1 == 0) goto L49
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r1.getDelay(r2)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L49
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            int r3 = r3 + 43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r0)
            java.lang.String r0 = ", remaining delay=["
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = " ms]"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L49:
            return r0
        L4a:
            r0 = 0
            return r0
    }
}
