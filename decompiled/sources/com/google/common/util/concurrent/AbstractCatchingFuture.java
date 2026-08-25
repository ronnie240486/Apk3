package com.google.common.util.concurrent;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
abstract class AbstractCatchingFuture<V, X extends java.lang.Throwable, F, T> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<V> implements java.lang.Runnable {
    public static final /* synthetic */ int $r8$clinit = 0;

    @javax.annotation.CheckForNull
    public java.lang.Class<X> exceptionType;

    @javax.annotation.CheckForNull
    public F fallback;

    @javax.annotation.CheckForNull
    public com.google.common.util.concurrent.ListenableFuture<? extends V> inputFuture;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class AsyncCatchingFuture<V, X extends java.lang.Throwable> extends com.google.common.util.concurrent.AbstractCatchingFuture<V, X, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>, com.google.common.util.concurrent.ListenableFuture<? extends V>> {
        public AsyncCatchingFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r1, java.lang.Class<X> r2, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public final java.lang.Object doFallback(java.lang.Object r2, java.lang.Throwable r3) throws java.lang.Exception {
                r1 = this;
                com.google.common.util.concurrent.AsyncFunction r2 = (com.google.common.util.concurrent.AsyncFunction) r2
                com.google.common.util.concurrent.ListenableFuture r3 = r2.apply(r3)
                java.lang.String r0 = "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"
                com.google.common.base.Preconditions.checkNotNull(r3, r0, r2)
                return r3
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public final void setResult(java.lang.Object r1) {
                r0 = this;
                com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
                r0.setFuture(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class CatchingFuture<V, X extends java.lang.Throwable> extends com.google.common.util.concurrent.AbstractCatchingFuture<V, X, com.google.common.base.Function<? super X, ? extends V>, V> {
        public CatchingFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r1, java.lang.Class<X> r2, com.google.common.base.Function<? super X, ? extends V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        @com.google.common.util.concurrent.ParametricNullness
        public final java.lang.Object doFallback(java.lang.Object r1, java.lang.Throwable r2) throws java.lang.Exception {
                r0 = this;
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                java.lang.Object r1 = r1.apply(r2)
                return r1
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public final void setResult(@com.google.common.util.concurrent.ParametricNullness V r1) {
                r0 = this;
                r0.set(r1)
                return
        }
    }

    public AbstractCatchingFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r1, java.lang.Class<X> r2, F r3) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r0.inputFuture = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Class r1 = (java.lang.Class) r1
            r0.exceptionType = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            r0.fallback = r1
            return
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r1.inputFuture
            r1.maybePropagateCancellationTo(r0)
            r0 = 0
            r1.inputFuture = r0
            r1.exceptionType = r0
            r1.fallback = r0
            return
    }

    @com.google.common.util.concurrent.ParametricNullness
    @com.google.errorprone.annotations.ForOverride
    public abstract T doFallback(F r1, X r2) throws java.lang.Exception;

    @Override // com.google.common.util.concurrent.AbstractFuture
    @javax.annotation.CheckForNull
    public final java.lang.String pendingToString() {
            r7 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r7.inputFuture
            java.lang.Class<X extends java.lang.Throwable> r1 = r7.exceptionType
            F r2 = r7.fallback
            java.lang.String r3 = super.pendingToString()
            if (r0 == 0) goto L1f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r4 = r0.length()
            int r4 = r4 + 16
            java.lang.String r5 = "inputFuture=["
            java.lang.String r6 = "], "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r5, r0, r6)
            goto L21
        L1f:
            java.lang.String r0 = ""
        L21:
            if (r1 == 0) goto L4c
            if (r2 == 0) goto L4c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3 = 29
            int r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r3)
            int r4 = r1.length()
            int r4 = r4 + r3
            int r3 = r2.length()
            int r3 = r3 + r4
            java.lang.String r4 = "exceptionType=["
            java.lang.String r5 = "], fallback=["
            java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r3, r0, r4, r1, r5)
            java.lang.String r1 = "]"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1)
            return r0
        L4c:
            if (r3 == 0) goto L64
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r3.length()
            if (r1 == 0) goto L5d
            java.lang.String r0 = r0.concat(r3)
            goto L63
        L5d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L63:
            return r0
        L64:
            r0 = 0
            return r0
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r10.inputFuture
            java.lang.Class<X extends java.lang.Throwable> r1 = r10.exceptionType
            F r2 = r10.fallback
            r3 = 1
            if (r0 != 0) goto Lb
            r4 = 1
            goto Lc
        Lb:
            r4 = 0
        Lc:
            if (r1 != 0) goto L10
            r5 = 1
            goto L11
        L10:
            r5 = 0
        L11:
            r4 = r4 | r5
            if (r2 != 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            r3 = r3 | r4
            if (r3 != 0) goto L9f
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L21
            goto L9f
        L21:
            r3 = 0
            r10.inputFuture = r3
            boolean r4 = r0 instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess     // Catch: java.lang.Throwable -> L38 java.util.concurrent.ExecutionException -> L3a
            if (r4 == 0) goto L30
            r4 = r0
            com.google.common.util.concurrent.internal.InternalFutureFailureAccess r4 = (com.google.common.util.concurrent.internal.InternalFutureFailureAccess) r4     // Catch: java.lang.Throwable -> L38 java.util.concurrent.ExecutionException -> L3a
            java.lang.Throwable r4 = com.google.common.util.concurrent.internal.InternalFutures.tryInternalFastPathGetFailure(r4)     // Catch: java.lang.Throwable -> L38 java.util.concurrent.ExecutionException -> L3a
            goto L31
        L30:
            r4 = r3
        L31:
            if (r4 != 0) goto L73
            java.lang.Object r5 = com.google.common.util.concurrent.Futures.getDone(r0)     // Catch: java.lang.Throwable -> L38 java.util.concurrent.ExecutionException -> L3a
            goto L74
        L38:
            r4 = move-exception
            goto L73
        L3a:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L72
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r7 = r7 + 35
            int r8 = r4.length()
            int r8 = r8 + r7
            java.lang.String r7 = "Future type "
            java.lang.String r9 = " threw "
            java.lang.StringBuilder r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r8, r7, r6, r9, r4)
            java.lang.String r6 = " without a cause"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
        L72:
            r4 = r5
        L73:
            r5 = r3
        L74:
            if (r4 != 0) goto L7a
            r10.set(r5)
            return
        L7a:
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L84
            r10.setFuture(r0)
            return
        L84:
            java.lang.Object r0 = r10.doFallback(r2, r4)     // Catch: java.lang.Throwable -> L90
            r10.exceptionType = r3
            r10.fallback = r3
            r10.setResult(r0)
            return
        L90:
            r0 = move-exception
            r10.setException(r0)     // Catch: java.lang.Throwable -> L99
            r10.exceptionType = r3
            r10.fallback = r3
            return
        L99:
            r0 = move-exception
            r10.exceptionType = r3
            r10.fallback = r3
            throw r0
        L9f:
            return
    }

    @com.google.errorprone.annotations.ForOverride
    public abstract void setResult(@com.google.common.util.concurrent.ParametricNullness T r1);
}
