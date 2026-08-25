package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.errorprone.annotations.DoNotMock("Use ImmutableMap.of or another implementation")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableMap<K, V> implements java.util.Map<K, V>, java.io.Serializable {
    public static final java.util.Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = null;

    @com.google.j2objc.annotations.RetainedWith
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet;

    @com.google.j2objc.annotations.RetainedWith
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<K> keySet;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSetMultimap<K, V> multimapView;

    @com.google.j2objc.annotations.RetainedWith
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableCollection<V> values;


    /* JADX INFO: loaded from: classes2.dex */
    @com.google.errorprone.annotations.DoNotMock
    public static class Builder<K, V> {
        public java.lang.Object[] alternatingKeysAndValues;
        public boolean entriesUsed;
        public int size;

        @javax.annotation.CheckForNull
        public java.util.Comparator<? super V> valueComparator;

        public Builder() {
                r1 = this;
                r0 = 4
                r1.<init>(r0)
                return
        }

        public Builder(int r1) {
                r0 = this;
                r0.<init>()
                int r1 = r1 * 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r0.alternatingKeysAndValues = r1
                r1 = 0
                r0.size = r1
                r0.entriesUsed = r1
                return
        }

        private void ensureCapacity(int r3) {
                r2 = this;
                int r3 = r3 * 2
                java.lang.Object[] r0 = r2.alternatingKeysAndValues
                int r1 = r0.length
                if (r3 <= r1) goto L15
                int r1 = r0.length
                int r3 = com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(r1, r3)
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
                r2.alternatingKeysAndValues = r3
                r3 = 0
                r2.entriesUsed = r3
            L15:
                return
        }

        public com.google.common.collect.ImmutableMap<K, V> build() {
                r1 = this;
                com.google.common.collect.ImmutableMap r0 = r1.buildOrThrow()
                return r0
        }

        public com.google.common.collect.ImmutableMap<K, V> buildOrThrow() {
                r2 = this;
                r2.sortEntries()
                r0 = 1
                r2.entriesUsed = r0
                int r0 = r2.size
                java.lang.Object[] r1 = r2.alternatingKeysAndValues
                com.google.common.collect.RegularImmutableMap r0 = com.google.common.collect.RegularImmutableMap.create(r0, r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public com.google.common.collect.ImmutableMap.Builder<K, V> orderEntriesByValue(java.util.Comparator<? super V> r3) {
                r2 = this;
                java.util.Comparator<? super V> r0 = r2.valueComparator
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "valueComparator was already set"
                com.google.common.base.Preconditions.checkState(r0, r1)
                java.lang.String r0 = "valueComparator"
                java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3, r0)
                java.util.Comparator r3 = (java.util.Comparator) r3
                r2.valueComparator = r3
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMap.Builder<K, V> put(K r4, V r5) {
                r3 = this;
                int r0 = r3.size
                int r0 = r0 + 1
                r3.ensureCapacity(r0)
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
                java.lang.Object[] r0 = r3.alternatingKeysAndValues
                int r1 = r3.size
                int r2 = r1 * 2
                r0[r2] = r4
                int r4 = r1 * 2
                int r4 = r4 + 1
                r0[r4] = r5
                int r1 = r1 + 1
                r3.size = r1
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> r2) {
                r1 = this;
                java.lang.Object r0 = r2.getKey()
                java.lang.Object r2 = r2.getValue()
                com.google.common.collect.ImmutableMap$Builder r2 = r1.put(r0, r2)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public com.google.common.collect.ImmutableMap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Collection
                if (r0 == 0) goto L11
                int r0 = r2.size
                r1 = r3
                java.util.Collection r1 = (java.util.Collection) r1
                int r1 = r1.size()
                int r1 = r1 + r0
                r2.ensureCapacity(r1)
            L11:
                java.util.Iterator r3 = r3.iterator()
            L15:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L25
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r2.put(r0)
                goto L15
            L25:
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> r1) {
                r0 = this;
                java.util.Set r1 = r1.entrySet()
                com.google.common.collect.ImmutableMap$Builder r1 = r0.putAll(r1)
                return r1
        }

        public final void sortEntries() {
                r7 = this;
                java.util.Comparator<? super V> r0 = r7.valueComparator
                if (r0 == 0) goto L68
                boolean r0 = r7.entriesUsed
                if (r0 == 0) goto L14
                java.lang.Object[] r0 = r7.alternatingKeysAndValues
                int r1 = r7.size
                int r1 = r1 * 2
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
                r7.alternatingKeysAndValues = r0
            L14:
                int r0 = r7.size
                java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
                r1 = 0
                r2 = 0
            L1a:
                int r3 = r7.size
                if (r2 >= r3) goto L3a
                java.util.AbstractMap$SimpleImmutableEntry r3 = new java.util.AbstractMap$SimpleImmutableEntry
                java.lang.Object[] r4 = r7.alternatingKeysAndValues
                int r5 = r2 * 2
                r4 = r4[r5]
                java.util.Objects.requireNonNull(r4)
                java.lang.Object[] r6 = r7.alternatingKeysAndValues
                int r5 = r5 + 1
                r5 = r6[r5]
                java.util.Objects.requireNonNull(r5)
                r3.<init>(r4, r5)
                r0[r2] = r3
                int r2 = r2 + 1
                goto L1a
            L3a:
                java.util.Comparator<? super V> r2 = r7.valueComparator
                com.google.common.collect.Ordering r2 = com.google.common.collect.Ordering.from(r2)
                com.google.common.collect.Maps$EntryFunction r4 = com.google.common.collect.Maps.EntryFunction.VALUE
                com.google.common.collect.Ordering r2 = r2.onResultOf(r4)
                java.util.Arrays.sort(r0, r1, r3, r2)
            L49:
                int r2 = r7.size
                if (r1 >= r2) goto L68
                java.lang.Object[] r2 = r7.alternatingKeysAndValues
                int r3 = r1 * 2
                r4 = r0[r1]
                java.lang.Object r4 = r4.getKey()
                r2[r3] = r4
                java.lang.Object[] r2 = r7.alternatingKeysAndValues
                int r3 = r3 + 1
                r4 = r0[r1]
                java.lang.Object r4 = r4.getValue()
                r2[r3] = r4
                int r1 = r1 + 1
                goto L49
            L68:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class IteratorBasedImmutableMap<K, V> extends com.google.common.collect.ImmutableMap<K, V> {


        public IteratorBasedImmutableMap() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.ImmutableMap
        public final com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
                r1 = this;
                com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl r0 = new com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap
        public com.google.common.collect.ImmutableSet<K> createKeySet() {
                r1 = this;
                com.google.common.collect.ImmutableMapKeySet r0 = new com.google.common.collect.ImmutableMapKeySet
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap
        public final com.google.common.collect.ImmutableCollection<V> createValues() {
                r1 = this;
                com.google.common.collect.ImmutableMapValues r0 = new com.google.common.collect.ImmutableMapValues
                r0.<init>(r1)
                return r0
        }

        public abstract com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Set entrySet() {
                r1 = this;
                com.google.common.collect.ImmutableSet r0 = super.entrySet()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Set keySet() {
                r1 = this;
                com.google.common.collect.ImmutableSet r0 = super.keySet()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ java.util.Collection values() {
                r1 = this;
                com.google.common.collect.ImmutableCollection r0 = super.values()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class MapViewOfValuesAsSingletonSets extends com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K, com.google.common.collect.ImmutableSet<V>> {
        public final /* synthetic */ com.google.common.collect.ImmutableMap this$0;


        private MapViewOfValuesAsSingletonSets(com.google.common.collect.ImmutableMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ MapViewOfValuesAsSingletonSets(com.google.common.collect.ImmutableMap r1, com.google.common.collect.ImmutableMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableMap r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public final com.google.common.collect.ImmutableSet<K> createKeySet() {
                r1 = this;
                com.google.common.collect.ImmutableMap r0 = r1.this$0
                com.google.common.collect.ImmutableSet r0 = r0.keySet()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, com.google.common.collect.ImmutableSet<V>>> entryIterator() {
                r2 = this;
                com.google.common.collect.ImmutableMap r0 = r2.this$0
                com.google.common.collect.ImmutableSet r0 = r0.entrySet()
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
                com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1 r1 = new com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @javax.annotation.CheckForNull
        public com.google.common.collect.ImmutableSet<V> get(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableMap r0 = r1.this$0
                java.lang.Object r2 = r0.get(r2)
                if (r2 != 0) goto La
                r2 = 0
                goto Le
            La:
                com.google.common.collect.ImmutableSet r2 = com.google.common.collect.ImmutableSet.of(r2)
            Le:
                return r2
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.ImmutableSet r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
                r1 = this;
                com.google.common.collect.ImmutableMap r0 = r1.this$0
                int r0 = r0.hashCode()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean isHashCodeFast() {
                r1 = this;
                com.google.common.collect.ImmutableMap r0 = r1.this$0
                boolean r0 = r0.isHashCodeFast()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean isPartialView() {
                r1 = this;
                com.google.common.collect.ImmutableMap r0 = r1.this$0
                boolean r0 = r0.isPartialView()
                return r0
        }

        @Override // java.util.Map
        public int size() {
                r1 = this;
                com.google.common.collect.ImmutableMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SerializedForm<K, V> implements java.io.Serializable {
        private static final boolean USE_LEGACY_SERIALIZATION = true;
        private static final long serialVersionUID = 0;
        private final java.lang.Object keys;
        private final java.lang.Object values;
    }

    static {
            r0 = 0
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            com.google.common.collect.ImmutableMap.EMPTY_ENTRY_ARRAY = r0
            return
    }

    public ImmutableMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <K, V> com.google.common.collect.ImmutableMap.Builder<K, V> builder() {
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableMap.Builder<K, V> builderWithExpectedSize(int r1) {
            java.lang.String r0 = "expectedSize"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r1, r0)
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r2) {
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            goto Ld
        Lc:
            r0 = 4
        Ld:
            com.google.common.collect.ImmutableMap$Builder r1 = new com.google.common.collect.ImmutableMap$Builder
            r1.<init>(r0)
            r1.putAll(r2)
            com.google.common.collect.ImmutableMap r2 = r1.build()
            return r2
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> r2) {
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableMap
            if (r0 == 0) goto L12
            boolean r0 = r2 instanceof java.util.SortedMap
            if (r0 != 0) goto L12
            r0 = r2
            com.google.common.collect.ImmutableMap r0 = (com.google.common.collect.ImmutableMap) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto L12
            return r0
        L12:
            java.util.Set r2 = r2.entrySet()
            com.google.common.collect.ImmutableMap r2 = copyOf(r2)
            return r2
    }

    public static <K, V> java.util.Map.Entry<K, V> entryOf(K r1, V r2) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r1, r2)
            java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of() {
            com.google.common.collect.ImmutableMap<java.lang.Object, java.lang.Object> r0 = com.google.common.collect.RegularImmutableMap.EMPTY
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K r2, V r3) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r2, r3)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            com.google.common.collect.RegularImmutableMap r2 = com.google.common.collect.RegularImmutableMap.create(r2, r0)
            return r2
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K r2, V r3, K r4, V r5) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r2, r3)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r3 = 3
            r0[r3] = r5
            com.google.common.collect.RegularImmutableMap r2 = com.google.common.collect.RegularImmutableMap.create(r2, r0)
            return r2
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K r2, V r3, K r4, V r5, K r6, V r7) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r2, r3)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r7)
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r3 = 4
            r0[r3] = r6
            r3 = 5
            r0[r3] = r7
            com.google.common.collect.RegularImmutableMap r2 = com.google.common.collect.RegularImmutableMap.create(r2, r0)
            return r2
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K r2, V r3, K r4, V r5, K r6, V r7, K r8, V r9) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r2, r3)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r7)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r8, r9)
            r0 = 8
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r3 = 5
            r0[r3] = r7
            r3 = 6
            r0[r3] = r8
            r3 = 7
            r0[r3] = r9
            com.google.common.collect.RegularImmutableMap r2 = com.google.common.collect.RegularImmutableMap.create(r2, r0)
            return r2
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K r2, V r3, K r4, V r5, K r6, V r7, K r8, V r9, K r10, V r11) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r2, r3)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r7)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r8, r9)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r10, r11)
            r0 = 10
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r3 = 6
            r0[r3] = r8
            r3 = 7
            r0[r3] = r9
            r3 = 8
            r0[r3] = r10
            r3 = 9
            r0[r3] = r11
            com.google.common.collect.RegularImmutableMap r2 = com.google.common.collect.RegularImmutableMap.create(r2, r0)
            return r2
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K r2, V r3, K r4, V r5, K r6, V r7, K r8, V r9, K r10, V r11, K r12, V r13) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r2, r3)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r7)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r8, r9)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r10, r11)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r12, r13)
            r0 = 12
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            r3 = 7
            r0[r3] = r9
            r3 = 8
            r0[r3] = r10
            r3 = 9
            r0[r3] = r11
            r3 = 10
            r0[r3] = r12
            r3 = 11
            r0[r3] = r13
            com.google.common.collect.RegularImmutableMap r2 = com.google.common.collect.RegularImmutableMap.create(r2, r0)
            return r2
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K r2, V r3, K r4, V r5, K r6, V r7, K r8, V r9, K r10, V r11, K r12, V r13, K r14, V r15) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r2, r3)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r7)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r8, r9)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r10, r11)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r12, r13)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r14, r15)
            r0 = 14
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            r2 = 7
            r0[r2] = r9
            r3 = 8
            r0[r3] = r10
            r3 = 9
            r0[r3] = r11
            r3 = 10
            r0[r3] = r12
            r3 = 11
            r0[r3] = r13
            r3 = 12
            r0[r3] = r14
            r3 = 13
            r0[r3] = r15
            com.google.common.collect.RegularImmutableMap r2 = com.google.common.collect.RegularImmutableMap.create(r2, r0)
            return r2
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K r3, V r4, K r5, V r6, K r7, V r8, K r9, V r10, K r11, V r12, K r13, V r14, K r15, V r16, K r17, V r18) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r4)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r5, r6)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r7, r8)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r9, r10)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r11, r12)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r13, r14)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r15, r16)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r17, r18)
            r0 = 16
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r4
            r1 = 2
            r0[r1] = r5
            r1 = 3
            r0[r1] = r6
            r1 = 4
            r0[r1] = r7
            r1 = 5
            r0[r1] = r8
            r1 = 6
            r0[r1] = r9
            r1 = 7
            r0[r1] = r10
            r1 = 8
            r0[r1] = r11
            r2 = 9
            r0[r2] = r12
            r2 = 10
            r0[r2] = r13
            r2 = 11
            r0[r2] = r14
            r2 = 12
            r0[r2] = r15
            r2 = 13
            r0[r2] = r16
            r2 = 14
            r0[r2] = r17
            r2 = 15
            r0[r2] = r18
            com.google.common.collect.RegularImmutableMap r0 = com.google.common.collect.RegularImmutableMap.create(r1, r0)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K r3, V r4, K r5, V r6, K r7, V r8, K r9, V r10, K r11, V r12, K r13, V r14, K r15, V r16, K r17, V r18, K r19, V r20) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r4)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r5, r6)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r7, r8)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r9, r10)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r11, r12)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r13, r14)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r15, r16)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r17, r18)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r19, r20)
            r0 = 18
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r4
            r1 = 2
            r0[r1] = r5
            r1 = 3
            r0[r1] = r6
            r1 = 4
            r0[r1] = r7
            r1 = 5
            r0[r1] = r8
            r1 = 6
            r0[r1] = r9
            r1 = 7
            r0[r1] = r10
            r1 = 8
            r0[r1] = r11
            r1 = 9
            r0[r1] = r12
            r2 = 10
            r0[r2] = r13
            r2 = 11
            r0[r2] = r14
            r2 = 12
            r0[r2] = r15
            r2 = 13
            r0[r2] = r16
            r2 = 14
            r0[r2] = r17
            r2 = 15
            r0[r2] = r18
            r2 = 16
            r0[r2] = r19
            r2 = 17
            r0[r2] = r20
            com.google.common.collect.RegularImmutableMap r0 = com.google.common.collect.RegularImmutableMap.create(r1, r0)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableMap<K, V> of(K r3, V r4, K r5, V r6, K r7, V r8, K r9, V r10, K r11, V r12, K r13, V r14, K r15, V r16, K r17, V r18, K r19, V r20, K r21, V r22) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r4)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r5, r6)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r7, r8)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r9, r10)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r11, r12)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r13, r14)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r15, r16)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r17, r18)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r19, r20)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r21, r22)
            r0 = 20
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r4
            r1 = 2
            r0[r1] = r5
            r1 = 3
            r0[r1] = r6
            r1 = 4
            r0[r1] = r7
            r1 = 5
            r0[r1] = r8
            r1 = 6
            r0[r1] = r9
            r1 = 7
            r0[r1] = r10
            r1 = 8
            r0[r1] = r11
            r1 = 9
            r0[r1] = r12
            r1 = 10
            r0[r1] = r13
            r2 = 11
            r0[r2] = r14
            r2 = 12
            r0[r2] = r15
            r2 = 13
            r0[r2] = r16
            r2 = 14
            r0[r2] = r17
            r2 = 15
            r0[r2] = r18
            r2 = 16
            r0[r2] = r19
            r2 = 17
            r0[r2] = r20
            r2 = 18
            r0[r2] = r21
            r2 = 19
            r0[r2] = r22
            com.google.common.collect.RegularImmutableMap r0 = com.google.common.collect.RegularImmutableMap.create(r1, r0)
            return r0
    }

    @java.lang.SafeVarargs
    public static <K, V> com.google.common.collect.ImmutableMap<K, V> ofEntries(java.util.Map.Entry<? extends K, ? extends V>... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.common.collect.ImmutableMap r0 = copyOf(r0)
            return r0
    }

    public com.google.common.collect.ImmutableSetMultimap<K, V> asMultimap() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableSetMultimap r0 = com.google.common.collect.ImmutableSetMultimap.of()
            return r0
        Lb:
            com.google.common.collect.ImmutableSetMultimap<K, V> r0 = r4.multimapView
            if (r0 != 0) goto L20
            com.google.common.collect.ImmutableSetMultimap r0 = new com.google.common.collect.ImmutableSetMultimap
            com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets r1 = new com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets
            r2 = 0
            r1.<init>(r4, r2)
            int r3 = r4.size()
            r0.<init>(r1, r3, r2)
            r4.multimapView = r0
        L20:
            return r0
    }

    @Override // java.util.Map
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // java.util.Map
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.values()
            boolean r2 = r0.contains(r2)
            return r2
    }

    public abstract com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet();

    public abstract com.google.common.collect.ImmutableSet<K> createKeySet();

    public abstract com.google.common.collect.ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet<java.util.Map$Entry<K, V>> r0 = r1.entrySet
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableSet r0 = r1.createEntrySet()
            r1.entrySet = r0
        La:
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entrySet()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Maps.equalsImpl(r0, r1)
            return r1
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public abstract V get(@javax.annotation.CheckForNull java.lang.Object r1);

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public final V getOrDefault(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull V r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            return r2
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entrySet()
            int r0 = com.google.common.collect.Sets.hashCodeImpl(r0)
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isHashCodeFast() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract boolean isPartialView();

    public com.google.common.collect.UnmodifiableIterator<K> keyIterator() {
            r2 = this;
            com.google.common.collect.ImmutableSet r0 = r2.entrySet()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            com.google.common.collect.ImmutableMap$1 r1 = new com.google.common.collect.ImmutableMap$1
            r1.<init>(r0)
            return r1
    }

    @Override // java.util.Map
    public com.google.common.collect.ImmutableSet<K> keySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet<K> r0 = r1.keySet
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableSet r0 = r1.createKeySet()
            r1.keySet = r0
        La:
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.keySet()
            return r0
    }

    @Override // java.util.Map
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final V put(K r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final V remove(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.google.common.collect.Maps.toStringImpl(r1)
            return r0
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public com.google.common.collect.ImmutableCollection<V> values() {
            r1 = this;
            com.google.common.collect.ImmutableCollection<V> r0 = r1.values
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableCollection r0 = r1.createValues()
            r1.values = r0
        La:
            return r0
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.values()
            return r0
    }
}
