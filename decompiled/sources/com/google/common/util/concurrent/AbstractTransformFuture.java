package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
abstract class AbstractTransformFuture<I, O, F, T> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<O> implements java.lang.Runnable {
    public static final /* synthetic */ int $r8$clinit = 0;

    @javax.annotation.CheckForNull
    public F function;

    @javax.annotation.CheckForNull
    public com.google.common.util.concurrent.ListenableFuture<? extends I> inputFuture;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class AsyncTransformFuture<I, O> extends com.google.common.util.concurrent.AbstractTransformFuture<I, O, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.ListenableFuture<? extends O>> {
        public AsyncTransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> r1, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final java.lang.Object doTransform(java.lang.Object r2, @com.google.common.util.concurrent.ParametricNullness java.lang.Object r3) throws java.lang.Exception {
                r1 = this;
                com.google.common.util.concurrent.AsyncFunction r2 = (com.google.common.util.concurrent.AsyncFunction) r2
                com.google.common.util.concurrent.ListenableFuture r3 = r2.apply(r3)
                java.lang.String r0 = "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"
                com.google.common.base.Preconditions.checkNotNull(r3, r0, r2)
                return r3
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final void setResult(java.lang.Object r1) {
                r0 = this;
                com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
                r0.setFuture(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class TransformFuture<I, O> extends com.google.common.util.concurrent.AbstractTransformFuture<I, O, com.google.common.base.Function<? super I, ? extends O>, O> {
        public TransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> r1, com.google.common.base.Function<? super I, ? extends O> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        @com.google.common.util.concurrent.ParametricNullness
        public final java.lang.Object doTransform(java.lang.Object r1, @com.google.common.util.concurrent.ParametricNullness java.lang.Object r2) throws java.lang.Exception {
                r0 = this;
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                java.lang.Object r1 = r1.apply(r2)
                return r1
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final void setResult(@com.google.common.util.concurrent.ParametricNullness O r1) {
                r0 = this;
                r0.set(r1)
                return
        }
    }

    public AbstractTransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> r1, F r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r0.inputFuture = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            r0.function = r1
            return
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends I> r0 = r1.inputFuture
            r1.maybePropagateCancellationTo(r0)
            r0 = 0
            r1.inputFuture = r0
            r1.function = r0
            return
    }

    @com.google.common.util.concurrent.ParametricNullness
    @com.google.errorprone.annotations.ForOverride
    public abstract T doTransform(F r1, @com.google.common.util.concurrent.ParametricNullness I r2) throws java.lang.Exception;

    @Override // com.google.common.util.concurrent.AbstractFuture
    @javax.annotation.CheckForNull
    public final java.lang.String pendingToString() {
            r6 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends I> r0 = r6.inputFuture
            F r1 = r6.function
            java.lang.String r2 = super.pendingToString()
            if (r0 == 0) goto L1d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            int r3 = r3 + 16
            java.lang.String r4 = "inputFuture=["
            java.lang.String r5 = "], "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r4, r0, r5)
            goto L1f
        L1d:
            java.lang.String r0 = ""
        L1f:
            if (r1 == 0) goto L39
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 11
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2)
            int r3 = r1.length()
            int r3 = r3 + r2
            java.lang.String r2 = "function=["
            java.lang.String r4 = "]"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1, r4)
            return r0
        L39:
            if (r2 == 0) goto L51
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r2.length()
            if (r1 == 0) goto L4a
            java.lang.String r0 = r0.concat(r2)
            goto L50
        L4a:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L50:
            return r0
        L51:
            r0 = 0
            return r0
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            com.google.common.util.concurrent.ListenableFuture<? extends I> r0 = r6.inputFuture
            F r1 = r6.function
            boolean r2 = r6.isCancelled()
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Le
            r5 = 1
            goto Lf
        Le:
            r5 = 0
        Lf:
            r2 = r2 | r5
            if (r1 != 0) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            r2 = r2 | r3
            if (r2 == 0) goto L18
            return
        L18:
            r2 = 0
            r6.inputFuture = r2
            boolean r3 = r0.isCancelled()
            if (r3 == 0) goto L25
            r6.setFuture(r0)
            return
        L25:
            java.lang.Object r0 = com.google.common.util.concurrent.Futures.getDone(r0)     // Catch: java.lang.Error -> L3e java.lang.RuntimeException -> L43 java.util.concurrent.ExecutionException -> L48 java.util.concurrent.CancellationException -> L51
            java.lang.Object r0 = r6.doTransform(r1, r0)     // Catch: java.lang.Throwable -> L33
            r6.function = r2
            r6.setResult(r0)
            return
        L33:
            r0 = move-exception
            r6.setException(r0)     // Catch: java.lang.Throwable -> L3a
            r6.function = r2
            return
        L3a:
            r0 = move-exception
            r6.function = r2
            throw r0
        L3e:
            r0 = move-exception
            r6.setException(r0)
            return
        L43:
            r0 = move-exception
            r6.setException(r0)
            return
        L48:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            r6.setException(r0)
            return
        L51:
            r6.cancel(r4)
            return
    }

    @com.google.errorprone.annotations.ForOverride
    public abstract void setResult(@com.google.common.util.concurrent.ParametricNullness T r1);
}
