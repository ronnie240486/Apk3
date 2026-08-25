package com.google.common.cache;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
public final class RemovalNotification<K, V> extends java.util.AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final com.google.common.cache.RemovalCause cause;

    private RemovalNotification(@javax.annotation.CheckForNull K r1, @javax.annotation.CheckForNull V r2, com.google.common.cache.RemovalCause r3) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.cache.RemovalCause r1 = (com.google.common.cache.RemovalCause) r1
            r0.cause = r1
            return
    }

    public static <K, V> com.google.common.cache.RemovalNotification<K, V> create(@javax.annotation.CheckForNull K r1, @javax.annotation.CheckForNull V r2, com.google.common.cache.RemovalCause r3) {
            com.google.common.cache.RemovalNotification r0 = new com.google.common.cache.RemovalNotification
            r0.<init>(r1, r2, r3)
            return r0
    }

    public com.google.common.cache.RemovalCause getCause() {
            r1 = this;
            com.google.common.cache.RemovalCause r0 = r1.cause
            return r0
    }

    public boolean wasEvicted() {
            r1 = this;
            com.google.common.cache.RemovalCause r0 = r1.cause
            boolean r0 = r0.wasEvicted()
            return r0
    }
}
