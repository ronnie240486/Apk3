package com.google.common.cache;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible(emulated = true)
public final class CacheBuilder<K, V> {
    public static final com.google.common.base.Supplier<com.google.common.cache.AbstractCache.StatsCounter> CACHE_STATS_COUNTER = null;
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_EXPIRATION_NANOS = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final int DEFAULT_REFRESH_NANOS = 0;
    public static final com.google.common.cache.CacheStats EMPTY_STATS = null;
    public static final com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache.StatsCounter> NULL_STATS_COUNTER = null;
    public static final com.google.common.base.Ticker NULL_TICKER = null;
    private static final java.util.logging.Logger logger = null;
    public int concurrencyLevel;
    public long expireAfterAccessNanos;
    public long expireAfterWriteNanos;
    public int initialCapacity;
    public com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;
    public com.google.common.cache.LocalCache.Strength keyStrength;
    public long maximumSize;
    public long maximumWeight;
    public long refreshNanos;
    public com.google.common.cache.RemovalListener<? super K, ? super V> removalListener;
    public com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache.StatsCounter> statsCounterSupplier;
    public boolean strictParsing;
    public com.google.common.base.Ticker ticker;
    public com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
    public com.google.common.cache.LocalCache.Strength valueStrength;
    public com.google.common.cache.Weigher<? super K, ? super V> weigher;




    /* JADX INFO: loaded from: classes.dex */
    public static final enum NullListener extends java.lang.Enum<com.google.common.cache.CacheBuilder.NullListener> implements com.google.common.cache.RemovalListener<java.lang.Object, java.lang.Object> {
        private static final /* synthetic */ com.google.common.cache.CacheBuilder.NullListener[] $VALUES = null;
        public static final com.google.common.cache.CacheBuilder.NullListener INSTANCE = null;

        private static /* synthetic */ com.google.common.cache.CacheBuilder.NullListener[] $values() {
                r0 = 1
                com.google.common.cache.CacheBuilder$NullListener[] r0 = new com.google.common.cache.CacheBuilder.NullListener[r0]
                com.google.common.cache.CacheBuilder$NullListener r1 = com.google.common.cache.CacheBuilder.NullListener.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.cache.CacheBuilder$NullListener r0 = new com.google.common.cache.CacheBuilder$NullListener
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.cache.CacheBuilder.NullListener.INSTANCE = r0
                com.google.common.cache.CacheBuilder$NullListener[] r0 = $values()
                com.google.common.cache.CacheBuilder.NullListener.$VALUES = r0
                return
        }

        private NullListener(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.cache.CacheBuilder.NullListener valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.cache.CacheBuilder$NullListener> r0 = com.google.common.cache.CacheBuilder.NullListener.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.cache.CacheBuilder$NullListener r1 = (com.google.common.cache.CacheBuilder.NullListener) r1
                return r1
        }

        public static com.google.common.cache.CacheBuilder.NullListener[] values() {
                com.google.common.cache.CacheBuilder$NullListener[] r0 = com.google.common.cache.CacheBuilder.NullListener.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.cache.CacheBuilder$NullListener[] r0 = (com.google.common.cache.CacheBuilder.NullListener[]) r0
                return r0
        }

        @Override // com.google.common.cache.RemovalListener
        public void onRemoval(com.google.common.cache.RemovalNotification<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                return
        }
    }

    public static final enum OneWeigher extends java.lang.Enum<com.google.common.cache.CacheBuilder.OneWeigher> implements com.google.common.cache.Weigher<java.lang.Object, java.lang.Object> {
        private static final /* synthetic */ com.google.common.cache.CacheBuilder.OneWeigher[] $VALUES = null;
        public static final com.google.common.cache.CacheBuilder.OneWeigher INSTANCE = null;

        private static /* synthetic */ com.google.common.cache.CacheBuilder.OneWeigher[] $values() {
                r0 = 1
                com.google.common.cache.CacheBuilder$OneWeigher[] r0 = new com.google.common.cache.CacheBuilder.OneWeigher[r0]
                com.google.common.cache.CacheBuilder$OneWeigher r1 = com.google.common.cache.CacheBuilder.OneWeigher.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.cache.CacheBuilder$OneWeigher r0 = new com.google.common.cache.CacheBuilder$OneWeigher
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.cache.CacheBuilder.OneWeigher.INSTANCE = r0
                com.google.common.cache.CacheBuilder$OneWeigher[] r0 = $values()
                com.google.common.cache.CacheBuilder.OneWeigher.$VALUES = r0
                return
        }

        private OneWeigher(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.cache.CacheBuilder.OneWeigher valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.cache.CacheBuilder$OneWeigher> r0 = com.google.common.cache.CacheBuilder.OneWeigher.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.cache.CacheBuilder$OneWeigher r1 = (com.google.common.cache.CacheBuilder.OneWeigher) r1
                return r1
        }

        public static com.google.common.cache.CacheBuilder.OneWeigher[] values() {
                com.google.common.cache.CacheBuilder$OneWeigher[] r0 = com.google.common.cache.CacheBuilder.OneWeigher.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.cache.CacheBuilder$OneWeigher[] r0 = (com.google.common.cache.CacheBuilder.OneWeigher[]) r0
                return r0
        }

        @Override // com.google.common.cache.Weigher
        public int weigh(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    static {
            com.google.common.cache.CacheBuilder$1 r0 = new com.google.common.cache.CacheBuilder$1
            r0.<init>()
            com.google.common.base.Supplier r0 = com.google.common.base.Suppliers.ofInstance(r0)
            com.google.common.cache.CacheBuilder.NULL_STATS_COUNTER = r0
            com.google.common.cache.CacheStats r0 = new com.google.common.cache.CacheStats
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r1 = r0
            r1.<init>(r2, r4, r6, r8, r10, r12)
            com.google.common.cache.CacheBuilder.EMPTY_STATS = r0
            com.google.common.cache.CacheBuilder$2 r0 = new com.google.common.cache.CacheBuilder$2
            r0.<init>()
            com.google.common.cache.CacheBuilder.CACHE_STATS_COUNTER = r0
            com.google.common.cache.CacheBuilder$3 r0 = new com.google.common.cache.CacheBuilder$3
            r0.<init>()
            com.google.common.cache.CacheBuilder.NULL_TICKER = r0
            java.lang.Class<com.google.common.cache.CacheBuilder> r0 = com.google.common.cache.CacheBuilder.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.cache.CacheBuilder.logger = r0
            return
    }

    private CacheBuilder() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.strictParsing = r0
            r0 = -1
            r2.initialCapacity = r0
            r2.concurrencyLevel = r0
            r0 = -1
            r2.maximumSize = r0
            r2.maximumWeight = r0
            r2.expireAfterWriteNanos = r0
            r2.expireAfterAccessNanos = r0
            r2.refreshNanos = r0
            com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache$StatsCounter> r0 = com.google.common.cache.CacheBuilder.NULL_STATS_COUNTER
            r2.statsCounterSupplier = r0
            return
    }

    private void checkNonLoadingCache() {
            r5 = this;
            long r0 = r5.refreshNanos
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r1 = "refreshAfterWrite requires a LoadingCache"
            com.google.common.base.Preconditions.checkState(r0, r1)
            return
    }

    private void checkWeightWithWeigher() {
            r7 = this;
            com.google.common.cache.Weigher<? super K, ? super V> r0 = r7.weigher
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != 0) goto L16
            long r5 = r7.maximumWeight
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            java.lang.String r0 = "maximumWeight requires weigher"
            com.google.common.base.Preconditions.checkState(r1, r0)
            goto L38
        L16:
            boolean r0 = r7.strictParsing
            if (r0 == 0) goto L29
            long r5 = r7.maximumWeight
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            java.lang.String r0 = "weigher requires maximumWeight"
            com.google.common.base.Preconditions.checkState(r1, r0)
            goto L38
        L29:
            long r0 = r7.maximumWeight
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L38
            java.util.logging.Logger r0 = com.google.common.cache.CacheBuilder.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r2 = "ignoring weigher specified without maximumWeight"
            r0.log(r1, r2)
        L38:
            return
    }

    @com.google.errorprone.annotations.CheckReturnValue
    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> from(com.google.common.cache.CacheBuilderSpec r4) {
            java.util.Objects.requireNonNull(r4)
            com.google.common.cache.CacheBuilder r0 = newBuilder()
            java.lang.Integer r1 = r4.initialCapacity
            if (r1 == 0) goto L12
            int r1 = r1.intValue()
            r0.initialCapacity(r1)
        L12:
            java.lang.Long r1 = r4.maximumSize
            if (r1 == 0) goto L1d
            long r1 = r1.longValue()
            r0.maximumSize(r1)
        L1d:
            java.lang.Long r1 = r4.maximumWeight
            if (r1 == 0) goto L28
            long r1 = r1.longValue()
            r0.maximumWeight(r1)
        L28:
            java.lang.Integer r1 = r4.concurrencyLevel
            if (r1 == 0) goto L33
            int r1 = r1.intValue()
            r0.concurrencyLevel(r1)
        L33:
            com.google.common.cache.LocalCache$Strength r1 = r4.keyStrength
            r2 = 1
            if (r1 == 0) goto L4c
            int[] r3 = com.google.common.cache.CacheBuilderSpec.AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 != r2) goto L46
            r0.weakKeys()
            goto L4c
        L46:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L4c:
            com.google.common.cache.LocalCache$Strength r1 = r4.valueStrength
            if (r1 == 0) goto L6a
            int[] r3 = com.google.common.cache.CacheBuilderSpec.AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 == r2) goto L67
            r2 = 2
            if (r1 != r2) goto L61
            r0.softValues()
            goto L6a
        L61:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L67:
            r0.weakValues()
        L6a:
            java.lang.Boolean r1 = r4.recordStats
            if (r1 == 0) goto L77
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L77
            r0.recordStats()
        L77:
            java.util.concurrent.TimeUnit r1 = r4.writeExpirationTimeUnit
            if (r1 == 0) goto L80
            long r2 = r4.writeExpirationDuration
            r0.expireAfterWrite(r2, r1)
        L80:
            java.util.concurrent.TimeUnit r1 = r4.accessExpirationTimeUnit
            if (r1 == 0) goto L89
            long r2 = r4.accessExpirationDuration
            r0.expireAfterAccess(r2, r1)
        L89:
            java.util.concurrent.TimeUnit r1 = r4.refreshTimeUnit
            if (r1 == 0) goto L92
            long r2 = r4.refreshDuration
            r0.refreshAfterWrite(r2, r1)
        L92:
            r4 = 0
            r0.strictParsing = r4
            return r0
    }

    @com.google.errorprone.annotations.CheckReturnValue
    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> from(java.lang.String r0) {
            com.google.common.cache.CacheBuilderSpec r0 = com.google.common.cache.CacheBuilderSpec.parse(r0)
            com.google.common.cache.CacheBuilder r0 = from(r0)
            return r0
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public static com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> newBuilder() {
            com.google.common.cache.CacheBuilder r0 = new com.google.common.cache.CacheBuilder
            r0.<init>()
            return r0
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public <K1 extends K, V1 extends V> com.google.common.cache.Cache<K1, V1> build() {
            r1 = this;
            r1.checkWeightWithWeigher()
            r1.checkNonLoadingCache()
            com.google.common.cache.LocalCache$LocalManualCache r0 = new com.google.common.cache.LocalCache$LocalManualCache
            r0.<init>(r1)
            return r0
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public <K1 extends K, V1 extends V> com.google.common.cache.LoadingCache<K1, V1> build(com.google.common.cache.CacheLoader<? super K1, V1> r2) {
            r1 = this;
            r1.checkWeightWithWeigher()
            com.google.common.cache.LocalCache$LocalLoadingCache r0 = new com.google.common.cache.LocalCache$LocalLoadingCache
            r0.<init>(r1, r2)
            return r0
    }

    public com.google.common.cache.CacheBuilder<K, V> concurrencyLevel(int r6) {
            r5 = this;
            int r0 = r5.concurrencyLevel
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L9
            r3 = 1
            goto La
        L9:
            r3 = 0
        La:
            java.lang.String r4 = "concurrency level was already set to %s"
            com.google.common.base.Preconditions.checkState(r3, r4, r0)
            if (r6 <= 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            com.google.common.base.Preconditions.checkArgument(r1)
            r5.concurrencyLevel = r6
            return r5
    }

    public com.google.common.cache.CacheBuilder<K, V> expireAfterAccess(long r8, java.util.concurrent.TimeUnit r10) {
            r7 = this;
            long r0 = r7.expireAfterAccessNanos
            r2 = 1
            r3 = 0
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            java.lang.String r5 = "expireAfterAccess was already set to %s ns"
            com.google.common.base.Preconditions.checkState(r4, r5, r0)
            r0 = 0
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 < 0) goto L19
            goto L1a
        L19:
            r2 = 0
        L1a:
            java.lang.String r0 = "duration cannot be negative: %s %s"
            com.google.common.base.Preconditions.checkArgument(r2, r0, r8, r10)
            long r8 = r10.toNanos(r8)
            r7.expireAfterAccessNanos = r8
            return r7
    }

    public com.google.common.cache.CacheBuilder<K, V> expireAfterWrite(long r8, java.util.concurrent.TimeUnit r10) {
            r7 = this;
            long r0 = r7.expireAfterWriteNanos
            r2 = 1
            r3 = 0
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            java.lang.String r5 = "expireAfterWrite was already set to %s ns"
            com.google.common.base.Preconditions.checkState(r4, r5, r0)
            r0 = 0
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 < 0) goto L19
            goto L1a
        L19:
            r2 = 0
        L1a:
            java.lang.String r0 = "duration cannot be negative: %s %s"
            com.google.common.base.Preconditions.checkArgument(r2, r0, r8, r10)
            long r8 = r10.toNanos(r8)
            r7.expireAfterWriteNanos = r8
            return r7
    }

    public com.google.common.cache.CacheBuilder<K, V> initialCapacity(int r6) {
            r5 = this;
            int r0 = r5.initialCapacity
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L9
            r3 = 1
            goto La
        L9:
            r3 = 0
        La:
            java.lang.String r4 = "initial capacity was already set to %s"
            com.google.common.base.Preconditions.checkState(r3, r4, r0)
            if (r6 < 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            com.google.common.base.Preconditions.checkArgument(r1)
            r5.initialCapacity = r6
            return r5
    }

    public com.google.common.cache.CacheBuilder<K, V> maximumSize(long r9) {
            r8 = this;
            long r0 = r8.maximumSize
            r2 = -1
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto Lc
            r6 = 1
            goto Ld
        Lc:
            r6 = 0
        Ld:
            java.lang.String r7 = "maximum size was already set to %s"
            com.google.common.base.Preconditions.checkState(r6, r7, r0)
            long r0 = r8.maximumWeight
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            java.lang.String r3 = "maximum weight was already set to %s"
            com.google.common.base.Preconditions.checkState(r2, r3, r0)
            com.google.common.cache.Weigher<? super K, ? super V> r0 = r8.weigher
            if (r0 != 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            java.lang.String r1 = "maximum size can not be combined with weigher"
            com.google.common.base.Preconditions.checkState(r0, r1)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L33
            goto L34
        L33:
            r4 = 0
        L34:
            java.lang.String r0 = "maximum size must not be negative"
            com.google.common.base.Preconditions.checkArgument(r4, r0)
            r8.maximumSize = r9
            return r8
    }

    @com.google.common.annotations.GwtIncompatible
    public com.google.common.cache.CacheBuilder<K, V> maximumWeight(long r9) {
            r8 = this;
            long r0 = r8.maximumWeight
            r2 = -1
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto Lc
            r6 = 1
            goto Ld
        Lc:
            r6 = 0
        Ld:
            java.lang.String r7 = "maximum weight was already set to %s"
            com.google.common.base.Preconditions.checkState(r6, r7, r0)
            long r0 = r8.maximumSize
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            java.lang.String r3 = "maximum size was already set to %s"
            com.google.common.base.Preconditions.checkState(r2, r3, r0)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L27
            goto L28
        L27:
            r4 = 0
        L28:
            java.lang.String r0 = "maximum weight must not be negative"
            com.google.common.base.Preconditions.checkArgument(r4, r0)
            r8.maximumWeight = r9
            return r8
    }

    public com.google.common.cache.CacheBuilder<K, V> recordStats() {
            r1 = this;
            com.google.common.base.Supplier<com.google.common.cache.AbstractCache$StatsCounter> r0 = com.google.common.cache.CacheBuilder.CACHE_STATS_COUNTER
            r1.statsCounterSupplier = r0
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public com.google.common.cache.CacheBuilder<K, V> refreshAfterWrite(long r8, java.util.concurrent.TimeUnit r10) {
            r7 = this;
            com.google.common.base.Preconditions.checkNotNull(r10)
            long r0 = r7.refreshNanos
            r2 = 1
            r3 = 0
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            java.lang.String r5 = "refresh was already set to %s ns"
            com.google.common.base.Preconditions.checkState(r4, r5, r0)
            r0 = 0
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 <= 0) goto L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            java.lang.String r0 = "duration must be positive: %s %s"
            com.google.common.base.Preconditions.checkArgument(r2, r0, r8, r10)
            long r8 = r10.toNanos(r8)
            r7.refreshNanos = r8
            return r7
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public <K1 extends K, V1 extends V> com.google.common.cache.CacheBuilder<K1, V1> removalListener(com.google.common.cache.RemovalListener<? super K1, ? super V1> r2) {
            r1 = this;
            com.google.common.cache.RemovalListener<? super K, ? super V> r0 = r1.removalListener
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.common.base.Preconditions.checkState(r0)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.cache.RemovalListener r2 = (com.google.common.cache.RemovalListener) r2
            r1.removalListener = r2
            return r1
    }

    public final com.google.common.cache.CacheBuilder<K, V> setKeyStrength(com.google.common.cache.LocalCache.Strength r4) {
            r3 = this;
            com.google.common.cache.LocalCache$Strength r0 = r3.keyStrength
            if (r0 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            java.lang.String r2 = "Key strength was already set to %s"
            com.google.common.base.Preconditions.checkState(r1, r2, r0)
            java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.cache.LocalCache$Strength r4 = (com.google.common.cache.LocalCache.Strength) r4
            r3.keyStrength = r4
            return r3
    }

    public final com.google.common.cache.CacheBuilder<K, V> setValueStrength(com.google.common.cache.LocalCache.Strength r4) {
            r3 = this;
            com.google.common.cache.LocalCache$Strength r0 = r3.valueStrength
            if (r0 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            java.lang.String r2 = "Value strength was already set to %s"
            com.google.common.base.Preconditions.checkState(r1, r2, r0)
            java.lang.Object r4 = com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.cache.LocalCache$Strength r4 = (com.google.common.cache.LocalCache.Strength) r4
            r3.valueStrength = r4
            return r3
    }

    @com.google.common.annotations.GwtIncompatible
    public com.google.common.cache.CacheBuilder<K, V> softValues() {
            r1 = this;
            com.google.common.cache.LocalCache$Strength r0 = com.google.common.cache.LocalCache.Strength.SOFT
            r1.setValueStrength(r0)
            return r1
    }

    public com.google.common.cache.CacheBuilder<K, V> ticker(com.google.common.base.Ticker r2) {
            r1 = this;
            com.google.common.base.Ticker r0 = r1.ticker
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.common.base.Preconditions.checkState(r0)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Ticker r2 = (com.google.common.base.Ticker) r2
            r1.ticker = r2
            return r1
    }

    public java.lang.String toString() {
            r8 = this;
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r8)
            int r1 = r8.initialCapacity
            r2 = -1
            if (r1 == r2) goto Le
            java.lang.String r3 = "initialCapacity"
            r0.add(r3, r1)
        Le:
            int r1 = r8.concurrencyLevel
            if (r1 == r2) goto L17
            java.lang.String r2 = "concurrencyLevel"
            r0.add(r2, r1)
        L17:
            long r1 = r8.maximumSize
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L24
            java.lang.String r5 = "maximumSize"
            r0.add(r5, r1)
        L24:
            long r1 = r8.maximumWeight
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            java.lang.String r5 = "maximumWeight"
            r0.add(r5, r1)
        L2f:
            long r1 = r8.expireAfterWriteNanos
            java.lang.String r5 = "ns"
            r6 = 22
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L4d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r1)
            r7.append(r5)
            java.lang.String r1 = r7.toString()
            java.lang.String r2 = "expireAfterWrite"
            r0.add(r2, r1)
        L4d:
            long r1 = r8.expireAfterAccessNanos
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "expireAfterAccess"
            r0.add(r2, r1)
        L67:
            com.google.common.cache.LocalCache$Strength r1 = r8.keyStrength
            if (r1 == 0) goto L78
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r1)
            java.lang.String r2 = "keyStrength"
            r0.add(r2, r1)
        L78:
            com.google.common.cache.LocalCache$Strength r1 = r8.valueStrength
            if (r1 == 0) goto L8a
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r1)
            java.lang.String r2 = "valueStrength"
            r0.add(r2, r1)
        L8a:
            com.google.common.base.Equivalence<java.lang.Object> r1 = r8.keyEquivalence
            if (r1 == 0) goto L93
            java.lang.String r1 = "keyEquivalence"
            r0.addValue(r1)
        L93:
            com.google.common.base.Equivalence<java.lang.Object> r1 = r8.valueEquivalence
            if (r1 == 0) goto L9d
            java.lang.String r1 = "valueEquivalence"
            r0.addValue(r1)
        L9d:
            com.google.common.cache.RemovalListener<? super K, ? super V> r1 = r8.removalListener
            if (r1 == 0) goto La6
            java.lang.String r1 = "removalListener"
            r0.addValue(r1)
        La6:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public com.google.common.cache.CacheBuilder<K, V> weakKeys() {
            r1 = this;
            com.google.common.cache.LocalCache$Strength r0 = com.google.common.cache.LocalCache.Strength.WEAK
            r1.setKeyStrength(r0)
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public com.google.common.cache.CacheBuilder<K, V> weakValues() {
            r1 = this;
            com.google.common.cache.LocalCache$Strength r0 = com.google.common.cache.LocalCache.Strength.WEAK
            r1.setValueStrength(r0)
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    public <K1 extends K, V1 extends V> com.google.common.cache.CacheBuilder<K1, V1> weigher(com.google.common.cache.Weigher<? super K1, ? super V1> r8) {
            r7 = this;
            com.google.common.cache.Weigher<? super K, ? super V> r0 = r7.weigher
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.common.base.Preconditions.checkState(r0)
            boolean r0 = r7.strictParsing
            if (r0 == 0) goto L20
            long r3 = r7.maximumSize
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            java.lang.String r0 = "weigher can not be combined with maximum size"
            com.google.common.base.Preconditions.checkState(r1, r0, r3)
        L20:
            java.lang.Object r8 = com.google.common.base.Preconditions.checkNotNull(r8)
            com.google.common.cache.Weigher r8 = (com.google.common.cache.Weigher) r8
            r7.weigher = r8
            return r7
    }
}
