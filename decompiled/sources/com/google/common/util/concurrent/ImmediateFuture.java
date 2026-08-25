package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
class ImmediateFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    public static final com.google.common.util.concurrent.ListenableFuture<?> NULL = null;
    private static final java.util.logging.Logger log = null;

    @com.google.common.util.concurrent.ParametricNullness
    private final V value;

    public static final class ImmediateCancelledFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> {
        public ImmediateCancelledFuture() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.cancel(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ImmediateFailedFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> {
        public ImmediateFailedFuture(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.setException(r1)
                return
        }
    }

    static {
            com.google.common.util.concurrent.ImmediateFuture r0 = new com.google.common.util.concurrent.ImmediateFuture
            r1 = 0
            r0.<init>(r1)
            com.google.common.util.concurrent.ImmediateFuture.NULL = r0
            java.lang.Class<com.google.common.util.concurrent.ImmediateFuture> r0 = com.google.common.util.concurrent.ImmediateFuture.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.util.concurrent.ImmediateFuture.log = r0
            return
    }

    public ImmediateFuture(@com.google.common.util.concurrent.ParametricNullness V r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable r7, java.util.concurrent.Executor r8) {
            r6 = this;
            java.lang.String r0 = "Runnable was null."
            com.google.common.base.Preconditions.checkNotNull(r7, r0)
            java.lang.String r0 = "Executor was null."
            com.google.common.base.Preconditions.checkNotNull(r8, r0)
            r8.execute(r7)     // Catch: java.lang.RuntimeException -> Le
            goto L31
        Le:
            r0 = move-exception
            java.util.logging.Logger r1 = com.google.common.util.concurrent.ImmediateFuture.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r3 = r7.length()
            int r3 = r3 + 57
            int r4 = r8.length()
            int r4 = r4 + r3
            java.lang.String r3 = "RuntimeException while executing runnable "
            java.lang.String r5 = " with executor "
            java.lang.String r7 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r3, r7, r5, r8)
            r1.log(r2, r7, r0)
        L31:
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get() {
            r1 = this;
            V r0 = r1.value
            return r0
    }

    @Override // java.util.concurrent.Future
    @com.google.common.util.concurrent.ParametricNullness
    public V get(long r1, java.util.concurrent.TimeUnit r3) throws java.util.concurrent.ExecutionException {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.Object r1 = r0.get()
            return r1
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
            r1 = this;
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = super.toString()
            V r1 = r5.value
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 27
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2)
            int r3 = r1.length()
            int r3 = r3 + r2
            java.lang.String r2 = "[status=SUCCESS, result=["
            java.lang.String r4 = "]]"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1, r4)
            return r0
    }
}
