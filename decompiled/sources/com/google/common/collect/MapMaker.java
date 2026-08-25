package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class MapMaker {
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public int concurrencyLevel;
    public int initialCapacity;

    @javax.annotation.CheckForNull
    public com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;

    @javax.annotation.CheckForNull
    public com.google.common.collect.MapMakerInternalMap.Strength keyStrength;
    public boolean useCustomMap;

    @javax.annotation.CheckForNull
    public com.google.common.collect.MapMakerInternalMap.Strength valueStrength;

    /* JADX INFO: loaded from: classes3.dex */
    public static final enum Dummy extends java.lang.Enum<com.google.common.collect.MapMaker.Dummy> {
        private static final /* synthetic */ com.google.common.collect.MapMaker.Dummy[] $VALUES = null;
        public static final com.google.common.collect.MapMaker.Dummy VALUE = null;

        private static /* synthetic */ com.google.common.collect.MapMaker.Dummy[] $values() {
                r0 = 1
                com.google.common.collect.MapMaker$Dummy[] r0 = new com.google.common.collect.MapMaker.Dummy[r0]
                com.google.common.collect.MapMaker$Dummy r1 = com.google.common.collect.MapMaker.Dummy.VALUE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.collect.MapMaker$Dummy r0 = new com.google.common.collect.MapMaker$Dummy
                java.lang.String r1 = "VALUE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.collect.MapMaker.Dummy.VALUE = r0
                com.google.common.collect.MapMaker$Dummy[] r0 = $values()
                com.google.common.collect.MapMaker.Dummy.$VALUES = r0
                return
        }

        private Dummy(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.collect.MapMaker.Dummy valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.collect.MapMaker$Dummy> r0 = com.google.common.collect.MapMaker.Dummy.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.collect.MapMaker$Dummy r1 = (com.google.common.collect.MapMaker.Dummy) r1
                return r1
        }

        public static com.google.common.collect.MapMaker.Dummy[] values() {
                com.google.common.collect.MapMaker$Dummy[] r0 = com.google.common.collect.MapMaker.Dummy.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.collect.MapMaker$Dummy[] r0 = (com.google.common.collect.MapMaker.Dummy[]) r0
                return r0
        }
    }

    public MapMaker() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.initialCapacity = r0
            r1.concurrencyLevel = r0
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.collect.MapMaker concurrencyLevel(int r6) {
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

    public final com.google.common.collect.MapMakerInternalMap.Strength getKeyStrength() {
            r2 = this;
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r2.keyStrength
            com.google.common.collect.MapMakerInternalMap$Strength r1 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
            java.lang.Object r0 = com.google.common.base.MoreObjects.firstNonNull(r0, r1)
            com.google.common.collect.MapMakerInternalMap$Strength r0 = (com.google.common.collect.MapMakerInternalMap.Strength) r0
            return r0
    }

    public final com.google.common.collect.MapMakerInternalMap.Strength getValueStrength() {
            r2 = this;
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r2.valueStrength
            com.google.common.collect.MapMakerInternalMap$Strength r1 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
            java.lang.Object r0 = com.google.common.base.MoreObjects.firstNonNull(r0, r1)
            com.google.common.collect.MapMakerInternalMap$Strength r0 = (com.google.common.collect.MapMakerInternalMap.Strength) r0
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.collect.MapMaker initialCapacity(int r6) {
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

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.GwtIncompatible
    public final com.google.common.collect.MapMaker keyEquivalence(com.google.common.base.Equivalence<java.lang.Object> r5) {
            r4 = this;
            com.google.common.base.Equivalence<java.lang.Object> r0 = r4.keyEquivalence
            r1 = 1
            if (r0 != 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            java.lang.String r3 = "key equivalence was already set to %s"
            com.google.common.base.Preconditions.checkState(r2, r3, r0)
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.base.Equivalence r5 = (com.google.common.base.Equivalence) r5
            r4.keyEquivalence = r5
            r4.useCustomMap = r1
            return r4
    }

    public <K, V> java.util.concurrent.ConcurrentMap<K, V> makeMap() {
            r5 = this;
            boolean r0 = r5.useCustomMap
            if (r0 != 0) goto L18
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            int r1 = r5.initialCapacity
            r2 = -1
            if (r1 != r2) goto Ld
            r1 = 16
        Ld:
            r3 = 1061158912(0x3f400000, float:0.75)
            int r4 = r5.concurrencyLevel
            if (r4 != r2) goto L14
            r4 = 4
        L14:
            r0.<init>(r1, r3, r4)
            return r0
        L18:
            com.google.common.collect.MapMakerInternalMap r0 = com.google.common.collect.MapMakerInternalMap.create(r5)
            return r0
    }

    public final com.google.common.collect.MapMaker setKeyStrength(com.google.common.collect.MapMakerInternalMap.Strength r5) {
            r4 = this;
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r4.keyStrength
            r1 = 1
            if (r0 != 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            java.lang.String r3 = "Key strength was already set to %s"
            com.google.common.base.Preconditions.checkState(r2, r3, r0)
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.collect.MapMakerInternalMap$Strength r0 = (com.google.common.collect.MapMakerInternalMap.Strength) r0
            r4.keyStrength = r0
            com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
            if (r5 == r0) goto L1b
            r4.useCustomMap = r1
        L1b:
            return r4
    }

    public final com.google.common.collect.MapMaker setValueStrength(com.google.common.collect.MapMakerInternalMap.Strength r5) {
            r4 = this;
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r4.valueStrength
            r1 = 1
            if (r0 != 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            java.lang.String r3 = "Value strength was already set to %s"
            com.google.common.base.Preconditions.checkState(r2, r3, r0)
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.collect.MapMakerInternalMap$Strength r0 = (com.google.common.collect.MapMakerInternalMap.Strength) r0
            r4.valueStrength = r0
            com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
            if (r5 == r0) goto L1b
            r4.useCustomMap = r1
        L1b:
            return r4
    }

    public java.lang.String toString() {
            r4 = this;
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r4)
            int r1 = r4.initialCapacity
            r2 = -1
            if (r1 == r2) goto Le
            java.lang.String r3 = "initialCapacity"
            r0.add(r3, r1)
        Le:
            int r1 = r4.concurrencyLevel
            if (r1 == r2) goto L17
            java.lang.String r2 = "concurrencyLevel"
            r0.add(r2, r1)
        L17:
            com.google.common.collect.MapMakerInternalMap$Strength r1 = r4.keyStrength
            if (r1 == 0) goto L28
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r1)
            java.lang.String r2 = "keyStrength"
            r0.add(r2, r1)
        L28:
            com.google.common.collect.MapMakerInternalMap$Strength r1 = r4.valueStrength
            if (r1 == 0) goto L3a
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r1)
            java.lang.String r2 = "valueStrength"
            r0.add(r2, r1)
        L3a:
            com.google.common.base.Equivalence<java.lang.Object> r1 = r4.keyEquivalence
            if (r1 == 0) goto L43
            java.lang.String r1 = "keyEquivalence"
            r0.addValue(r1)
        L43:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.MapMaker weakKeys() {
            r1 = this;
            com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
            r1.setKeyStrength(r0)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.GwtIncompatible
    public com.google.common.collect.MapMaker weakValues() {
            r1 = this;
            com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
            r1.setValueStrength(r0)
            return r1
    }
}
