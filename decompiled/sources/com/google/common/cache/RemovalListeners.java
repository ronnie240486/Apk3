package com.google.common.cache;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class RemovalListeners {


    private RemovalListeners() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <K, V> com.google.common.cache.RemovalListener<K, V> asynchronous(com.google.common.cache.RemovalListener<K, V> r1, java.util.concurrent.Executor r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.cache.RemovalListeners$1 r0 = new com.google.common.cache.RemovalListeners$1
            r0.<init>(r2, r1)
            return r0
    }
}
