package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public final class SettableFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> {
    private SettableFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> com.google.common.util.concurrent.SettableFuture<V> create() {
            com.google.common.util.concurrent.SettableFuture r0 = new com.google.common.util.concurrent.SettableFuture
            r0.<init>()
            return r0
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean set(@com.google.common.util.concurrent.ParametricNullness V r1) {
            r0 = this;
            boolean r1 = super.set(r1)
            return r1
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean setException(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = super.setException(r1)
            return r1
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r1) {
            r0 = this;
            boolean r1 = super.setFuture(r1)
            return r1
    }
}
