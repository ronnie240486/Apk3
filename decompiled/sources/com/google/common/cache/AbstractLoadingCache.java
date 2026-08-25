package com.google.common.cache;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class AbstractLoadingCache<K, V> extends com.google.common.cache.AbstractCache<K, V> implements com.google.common.cache.LoadingCache<K, V> {
    public AbstractLoadingCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public final V apply(K r1) {
            r0 = this;
            java.lang.Object r1 = r0.getUnchecked(r1)
            return r1
    }

    @Override // com.google.common.cache.LoadingCache
    public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> r4) throws java.util.concurrent.ExecutionException {
            r3 = this;
            java.util.LinkedHashMap r0 = com.google.common.collect.Maps.newLinkedHashMap()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r4.next()
            boolean r2 = r0.containsKey(r1)
            if (r2 != 0) goto L8
            java.lang.Object r2 = r3.get(r1)
            r0.put(r1, r2)
            goto L8
        L20:
            com.google.common.collect.ImmutableMap r4 = com.google.common.collect.ImmutableMap.copyOf(r0)
            return r4
    }

    @Override // com.google.common.cache.LoadingCache
    public V getUnchecked(K r2) {
            r1 = this;
            java.lang.Object r2 = r1.get(r2)     // Catch: java.util.concurrent.ExecutionException -> L5
            return r2
        L5:
            r2 = move-exception
            com.google.common.util.concurrent.UncheckedExecutionException r0 = new com.google.common.util.concurrent.UncheckedExecutionException
            java.lang.Throwable r2 = r2.getCause()
            r0.<init>(r2)
            throw r0
    }

    @Override // com.google.common.cache.LoadingCache
    public void refresh(K r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
