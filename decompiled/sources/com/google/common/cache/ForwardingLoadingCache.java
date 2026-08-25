package com.google.common.cache;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class ForwardingLoadingCache<K, V> extends com.google.common.cache.ForwardingCache<K, V> implements com.google.common.cache.LoadingCache<K, V> {

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class SimpleForwardingLoadingCache<K, V> extends com.google.common.cache.ForwardingLoadingCache<K, V> {
        private final com.google.common.cache.LoadingCache<K, V> delegate;

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final com.google.common.cache.Cache delegate() {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final com.google.common.cache.LoadingCache<K, V> delegate() {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.delegate
                return r0
        }
    }

    public ForwardingLoadingCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public V apply(K r2) {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }

    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ com.google.common.cache.Cache delegate() {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    public abstract com.google.common.cache.LoadingCache<K, V> delegate();

    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.cache.LoadingCache
    public V get(K r2) throws java.util.concurrent.ExecutionException {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.cache.LoadingCache
    public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> r2) throws java.util.concurrent.ExecutionException {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            com.google.common.collect.ImmutableMap r2 = r0.getAll(r2)
            return r2
    }

    @Override // com.google.common.cache.LoadingCache
    public V getUnchecked(K r2) {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            java.lang.Object r2 = r0.getUnchecked(r2)
            return r2
    }

    @Override // com.google.common.cache.LoadingCache
    public void refresh(K r2) {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            r0.refresh(r2)
            return
    }
}
