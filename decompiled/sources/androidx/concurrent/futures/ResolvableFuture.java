package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ResolvableFuture<V> extends androidx.concurrent.futures.AbstractResolvableFuture<V> {
    private ResolvableFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> androidx.concurrent.futures.ResolvableFuture<V> create() {
            androidx.concurrent.futures.ResolvableFuture r0 = new androidx.concurrent.futures.ResolvableFuture
            r0.<init>()
            return r0
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean set(@androidx.annotation.Nullable V r1) {
            r0 = this;
            boolean r1 = super.set(r1)
            return r1
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setException(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = super.setException(r1)
            return r1
    }

    public boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r6) {
            r5 = this;
            java.util.Objects.requireNonNull(r6)
            java.lang.Object r0 = r5.value
            r1 = 0
            if (r0 != 0) goto L45
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L21
            java.lang.Object r6 = androidx.concurrent.futures.AbstractResolvableFuture.getFutureValue(r6)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r0 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r6 = r0.casValue(r5, r3, r6)
            if (r6 == 0) goto L50
            androidx.concurrent.futures.AbstractResolvableFuture.complete(r5)
        L1f:
            r1 = 1
            goto L50
        L21:
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r0 = new androidx.concurrent.futures.AbstractResolvableFuture$SetFuture
            r0.<init>(r5, r6)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r4 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r3 = r4.casValue(r5, r3, r0)
            if (r3 == 0) goto L43
            androidx.concurrent.futures.DirectExecutor r1 = androidx.concurrent.futures.DirectExecutor.INSTANCE     // Catch: java.lang.Throwable -> L34
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L34
            goto L1f
        L34:
            r6 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r1 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r1 = androidx.concurrent.futures.AbstractResolvableFuture.Failure.FALLBACK_INSTANCE
        L3d:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r6 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            r6.casValue(r5, r0, r1)
            goto L1f
        L43:
            java.lang.Object r0 = r5.value
        L45:
            boolean r2 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            if (r2 == 0) goto L50
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r0 = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) r0
            boolean r0 = r0.wasInterrupted
            r6.cancel(r0)
        L50:
            return r1
    }
}
