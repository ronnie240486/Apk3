package com.google.common.cache;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
public abstract class CacheLoader<K, V> {


    /* JADX INFO: loaded from: classes.dex */
    public static final class FunctionToCacheLoader<K, V> extends com.google.common.cache.CacheLoader<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Function<K, V> computingFunction;

        public FunctionToCacheLoader(com.google.common.base.Function<K, V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.computingFunction = r1
                return
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K r2) {
                r1 = this;
                com.google.common.base.Function<K, V> r0 = r1.computingFunction
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.Object r2 = r0.apply(r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class InvalidCacheLoadException extends java.lang.RuntimeException {
        public InvalidCacheLoadException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class SupplierToCacheLoader<V> extends com.google.common.cache.CacheLoader<java.lang.Object, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Supplier<V> computingSupplier;

        public SupplierToCacheLoader(com.google.common.base.Supplier<V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.computingSupplier = r1
                return
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(java.lang.Object r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Supplier<V> r1 = r0.computingSupplier
                java.lang.Object r1 = r1.get()
                return r1
        }
    }

    public static final class UnsupportedLoadingOperationException extends java.lang.UnsupportedOperationException {
        public UnsupportedLoadingOperationException() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public CacheLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.CheckReturnValue
    @com.google.common.annotations.GwtIncompatible
    public static <K, V> com.google.common.cache.CacheLoader<K, V> asyncReloading(com.google.common.cache.CacheLoader<K, V> r1, java.util.concurrent.Executor r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.cache.CacheLoader$1 r0 = new com.google.common.cache.CacheLoader$1
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public static <K, V> com.google.common.cache.CacheLoader<K, V> from(com.google.common.base.Function<K, V> r1) {
            com.google.common.cache.CacheLoader$FunctionToCacheLoader r0 = new com.google.common.cache.CacheLoader$FunctionToCacheLoader
            r0.<init>(r1)
            return r0
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public static <V> com.google.common.cache.CacheLoader<java.lang.Object, V> from(com.google.common.base.Supplier<V> r1) {
            com.google.common.cache.CacheLoader$SupplierToCacheLoader r0 = new com.google.common.cache.CacheLoader$SupplierToCacheLoader
            r0.<init>(r1)
            return r0
    }

    public abstract V load(K r1) throws java.lang.Exception;

    public java.util.Map<K, V> loadAll(java.lang.Iterable<? extends K> r1) throws java.lang.Exception {
            r0 = this;
            com.google.common.cache.CacheLoader$UnsupportedLoadingOperationException r1 = new com.google.common.cache.CacheLoader$UnsupportedLoadingOperationException
            r1.<init>()
            throw r1
    }

    @com.google.common.annotations.GwtIncompatible
    public com.google.common.util.concurrent.ListenableFuture<V> reload(K r1, V r2) throws java.lang.Exception {
            r0 = this;
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Object r1 = r0.load(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.immediateFuture(r1)
            return r1
    }
}
