package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class ImmutableSortedMap<K, V> extends com.google.common.collect.ImmutableSortedMapFauxverideShim<K, V> implements java.util.NavigableMap<K, V> {
    private static final com.google.common.collect.ImmutableSortedMap<java.lang.Comparable, java.lang.Object> NATURAL_EMPTY_MAP = null;
    private static final java.util.Comparator<java.lang.Comparable> NATURAL_ORDER = null;
    private static final long serialVersionUID = 0;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.ImmutableSortedMap<K, V> descendingMap;
    private final transient com.google.common.collect.RegularImmutableSortedSet<K> keySet;
    private final transient com.google.common.collect.ImmutableList<V> valueList;



    public static class Builder<K, V> extends com.google.common.collect.ImmutableMap.Builder<K, V> {
        private final java.util.Comparator<? super K> comparator;
        private transient java.lang.Object[] keys;
        private transient java.lang.Object[] values;

        public Builder(java.util.Comparator<? super K> r2) {
                r1 = this;
                r0 = 4
                r1.<init>(r2, r0)
                return
        }

        private Builder(java.util.Comparator<? super K> r1, int r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Comparator r1 = (java.util.Comparator) r1
                r0.comparator = r1
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r0.keys = r1
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r0.values = r1
                return
        }

        private void ensureCapacity(int r3) {
                r2 = this;
                java.lang.Object[] r0 = r2.keys
                int r1 = r0.length
                if (r3 <= r1) goto L1a
                int r0 = r0.length
                int r3 = com.google.common.collect.ImmutableCollection.Builder.expandedCapacity(r0, r3)
                java.lang.Object[] r0 = r2.keys
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
                r2.keys = r0
                java.lang.Object[] r0 = r2.values
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
                r2.values = r3
            L1a:
                return
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap build() {
                r1 = this;
                com.google.common.collect.ImmutableSortedMap r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap<K, V> build() {
                r1 = this;
                com.google.common.collect.ImmutableSortedMap r0 = r1.buildOrThrow()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap buildOrThrow() {
                r1 = this;
                com.google.common.collect.ImmutableSortedMap r0 = r1.buildOrThrow()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableSortedMap<K, V> buildOrThrow() {
                r8 = this;
                int r0 = r8.size
                if (r0 == 0) goto L95
                r1 = 0
                r2 = 1
                if (r0 == r2) goto L80
                java.lang.Object[] r2 = r8.keys
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
                java.util.Comparator<? super K> r2 = r8.comparator
                java.util.Arrays.sort(r0, r2)
                int r2 = r8.size
                java.lang.Object[] r3 = new java.lang.Object[r2]
            L17:
                int r4 = r8.size
                if (r1 >= r4) goto L6a
                if (r1 <= 0) goto L51
                java.util.Comparator<? super K> r4 = r8.comparator
                int r5 = r1 + (-1)
                r6 = r0[r5]
                r7 = r0[r1]
                int r4 = r4.compare(r6, r7)
                if (r4 == 0) goto L2c
                goto L51
            L2c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r3 = r0[r5]
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r0 = r0[r1]
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r3.length()
                int r1 = r1 + 57
                int r4 = r0.length()
                int r4 = r4 + r1
                java.lang.String r1 = "keys required to be distinct but compared as equal: "
                java.lang.String r5 = " and "
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r1, r3, r5, r0)
                r2.<init>(r0)
                throw r2
            L51:
                java.lang.Object[] r4 = r8.keys
                r4 = r4[r1]
                java.util.Objects.requireNonNull(r4)
                java.util.Comparator<? super K> r5 = r8.comparator
                int r4 = java.util.Arrays.binarySearch(r0, r4, r5)
                java.lang.Object[] r5 = r8.values
                r5 = r5[r1]
                java.util.Objects.requireNonNull(r5)
                r3[r4] = r5
                int r1 = r1 + 1
                goto L17
            L6a:
                com.google.common.collect.ImmutableSortedMap r1 = new com.google.common.collect.ImmutableSortedMap
                com.google.common.collect.RegularImmutableSortedSet r4 = new com.google.common.collect.RegularImmutableSortedSet
                int r5 = r0.length
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.asImmutableList(r0, r5)
                java.util.Comparator<? super K> r5 = r8.comparator
                r4.<init>(r0, r5)
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.asImmutableList(r3, r2)
                r1.<init>(r4, r0)
                return r1
            L80:
                java.util.Comparator<? super K> r0 = r8.comparator
                java.lang.Object[] r2 = r8.keys
                r2 = r2[r1]
                java.util.Objects.requireNonNull(r2)
                java.lang.Object[] r3 = r8.values
                r1 = r3[r1]
                java.util.Objects.requireNonNull(r1)
                com.google.common.collect.ImmutableSortedMap r0 = com.google.common.collect.ImmutableSortedMap.access$000(r0, r2, r1)
                return r0
            L95:
                java.util.Comparator<? super K> r0 = r8.comparator
                com.google.common.collect.ImmutableSortedMap r0 = com.google.common.collect.ImmutableSortedMap.emptyMap(r0)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.common.annotations.Beta
        @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
        @java.lang.Deprecated
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder orderEntriesByValue(java.util.Comparator r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMap$Builder r1 = r0.orderEntriesByValue(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.common.annotations.Beta
        @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
        @java.lang.Deprecated
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final com.google.common.collect.ImmutableSortedMap.Builder<K, V> orderEntriesByValue(java.util.Comparator<? super V> r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Not available on ImmutableSortedMap.Builder"
                r2.<init>(r0)
                throw r2
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMap$Builder r1 = r0.put(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder put(java.util.Map.Entry r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMap$Builder r1 = r0.put(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> put(K r3, V r4) {
                r2 = this;
                int r0 = r2.size
                int r0 = r0 + 1
                r2.ensureCapacity(r0)
                com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r4)
                java.lang.Object[] r0 = r2.keys
                int r1 = r2.size
                r0[r1] = r3
                java.lang.Object[] r3 = r2.values
                r3[r1] = r4
                int r1 = r1 + 1
                r2.size = r1
                return r2
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> r1) {
                r0 = this;
                super.put(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder putAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder putAll(java.util.Map r1) {
                r0 = this;
                com.google.common.collect.ImmutableSortedMap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSortedMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }
    }

    public static class SerializedForm<K, V> extends com.google.common.collect.ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;
        private final java.util.Comparator<? super K> comparator;
    }

    static {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.ImmutableSortedMap.NATURAL_ORDER = r0
            com.google.common.collect.ImmutableSortedMap r0 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.RegularImmutableSortedSet r1 = com.google.common.collect.ImmutableSortedSet.emptySet(r1)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            r0.<init>(r1, r2)
            com.google.common.collect.ImmutableSortedMap.NATURAL_EMPTY_MAP = r0
            return
    }

    public ImmutableSortedMap(com.google.common.collect.RegularImmutableSortedSet<K> r1, com.google.common.collect.ImmutableList<V> r2) {
            r0 = this;
            r0.<init>()
            r0.keySet = r1
            r0.valueList = r2
            r1 = 0
            r0.descendingMap = r1
            return
    }

    public ImmutableSortedMap(com.google.common.collect.RegularImmutableSortedSet<K> r1, com.google.common.collect.ImmutableList<V> r2, @javax.annotation.CheckForNull com.google.common.collect.ImmutableSortedMap<K, V> r3) {
            r0 = this;
            r0.<init>()
            r0.keySet = r1
            r0.valueList = r2
            r0.descendingMap = r3
            return
    }

    public static /* synthetic */ com.google.common.collect.ImmutableSortedMap access$000(java.util.Comparator r0, java.lang.Object r1, java.lang.Object r2) {
            com.google.common.collect.ImmutableSortedMap r0 = of(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ com.google.common.collect.RegularImmutableSortedSet access$100(com.google.common.collect.ImmutableSortedMap r0) {
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r0.keySet
            return r0
    }

    public static /* synthetic */ com.google.common.collect.ImmutableList access$200(com.google.common.collect.ImmutableSortedMap r0) {
            com.google.common.collect.ImmutableList<V> r0 = r0.valueList
            return r0
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
            java.util.Comparator<java.lang.Comparable> r0 = com.google.common.collect.ImmutableSortedMap.NATURAL_ORDER
            com.google.common.collect.Ordering r0 = (com.google.common.collect.Ordering) r0
            com.google.common.collect.ImmutableSortedMap r1 = copyOf(r1, r0)
            return r1
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1, java.util.Comparator<? super K> r2) {
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Comparator r2 = (java.util.Comparator) r2
            r0 = 0
            com.google.common.collect.ImmutableSortedMap r1 = fromEntries(r2, r0, r1)
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> r1) {
            java.util.Comparator<java.lang.Comparable> r0 = com.google.common.collect.ImmutableSortedMap.NATURAL_ORDER
            com.google.common.collect.Ordering r0 = (com.google.common.collect.Ordering) r0
            com.google.common.collect.ImmutableSortedMap r1 = copyOfInternal(r1, r0)
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> r0, java.util.Comparator<? super K> r1) {
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Comparator r1 = (java.util.Comparator) r1
            com.google.common.collect.ImmutableSortedMap r0 = copyOfInternal(r0, r1)
            return r0
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfInternal(java.util.Map<? extends K, ? extends V> r3, java.util.Comparator<? super K> r4) {
            boolean r0 = r3 instanceof java.util.SortedMap
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r3
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.Comparator r0 = r0.comparator()
            if (r0 != 0) goto L15
            java.util.Comparator<java.lang.Comparable> r0 = com.google.common.collect.ImmutableSortedMap.NATURAL_ORDER
            if (r4 != r0) goto L1a
            r0 = 1
            r1 = 1
            goto L1a
        L15:
            boolean r0 = r4.equals(r0)
            r1 = r0
        L1a:
            if (r1 == 0) goto L2a
            boolean r0 = r3 instanceof com.google.common.collect.ImmutableSortedMap
            if (r0 == 0) goto L2a
            r0 = r3
            com.google.common.collect.ImmutableSortedMap r0 = (com.google.common.collect.ImmutableSortedMap) r0
            boolean r2 = r0.isPartialView()
            if (r2 != 0) goto L2a
            return r0
        L2a:
            java.util.Set r3 = r3.entrySet()
            com.google.common.collect.ImmutableSortedMap r3 = fromEntries(r4, r1, r3)
            return r3
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfSorted(java.util.SortedMap<K, ? extends V> r3) {
            java.util.Comparator r0 = r3.comparator()
            if (r0 != 0) goto L8
            java.util.Comparator<java.lang.Comparable> r0 = com.google.common.collect.ImmutableSortedMap.NATURAL_ORDER
        L8:
            boolean r1 = r3 instanceof com.google.common.collect.ImmutableSortedMap
            if (r1 == 0) goto L16
            r1 = r3
            com.google.common.collect.ImmutableSortedMap r1 = (com.google.common.collect.ImmutableSortedMap) r1
            boolean r2 = r1.isPartialView()
            if (r2 != 0) goto L16
            return r1
        L16:
            r1 = 1
            java.util.Set r3 = r3.entrySet()
            com.google.common.collect.ImmutableSortedMap r3 = fromEntries(r0, r1, r3)
            return r3
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> emptyMap(java.util.Comparator<? super K> r2) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf
            com.google.common.collect.ImmutableSortedMap r2 = of()
            return r2
        Lf:
            com.google.common.collect.ImmutableSortedMap r0 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.RegularImmutableSortedSet r2 = com.google.common.collect.ImmutableSortedSet.emptySet(r2)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            r0.<init>(r2, r1)
            return r0
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> fromEntries(java.util.Comparator<? super K> r1, boolean r2, java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r3) {
            java.util.Map$Entry<?, ?>[] r0 = com.google.common.collect.ImmutableMap.EMPTY_ENTRY_ARRAY
            java.lang.Object[] r3 = com.google.common.collect.Iterables.toArray(r3, r0)
            java.util.Map$Entry[] r3 = (java.util.Map.Entry[]) r3
            int r0 = r3.length
            com.google.common.collect.ImmutableSortedMap r1 = fromEntries(r1, r2, r3, r0)
            return r1
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> fromEntries(java.util.Comparator<? super K> r7, boolean r8, java.util.Map.Entry<K, V>[] r9, int r10) {
            if (r10 == 0) goto Lcf
            r0 = 1
            r1 = 0
            if (r10 == r0) goto Lbb
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Object[] r2 = new java.lang.Object[r10]
            if (r8 == 0) goto L27
        Lc:
            if (r1 >= r10) goto La8
            r8 = r9[r1]
            java.util.Objects.requireNonNull(r8)
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r3 = r8.getKey()
            java.lang.Object r8 = r8.getValue()
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r8)
            r0[r1] = r3
            r2[r1] = r8
            int r1 = r1 + 1
            goto Lc
        L27:
            com.google.common.collect.ImmutableSortedMap$1 r8 = new com.google.common.collect.ImmutableSortedMap$1
            r8.<init>(r7)
            java.util.Arrays.sort(r9, r1, r10, r8)
            r8 = r9[r1]
            java.util.Objects.requireNonNull(r8)
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r3 = r8.getKey()
            r0[r1] = r3
            java.lang.Object r8 = r8.getValue()
            r2[r1] = r8
            r8 = r0[r1]
            r1 = r2[r1]
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r8, r1)
            r8 = 1
        L4a:
            if (r8 >= r10) goto La8
            int r1 = r8 + (-1)
            r1 = r9[r1]
            java.util.Objects.requireNonNull(r1)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r4 = r9[r8]
            java.util.Objects.requireNonNull(r4)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r6 = r4.getValue()
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r5, r6)
            r0[r8] = r5
            r2[r8] = r6
            int r3 = r7.compare(r3, r5)
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = 0
        L74:
            java.lang.String r6 = "key"
            if (r3 == 0) goto L7c
            int r8 = r8 + 1
            r3 = r5
            goto L4a
        L7c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = java.lang.String.valueOf(r1)
            java.lang.String r9 = java.lang.String.valueOf(r4)
            int r10 = r6.length()
            int r10 = r10 + 34
            int r0 = r8.length()
            int r0 = r0 + r10
            int r10 = r9.length()
            int r10 = r10 + r0
            java.lang.String r0 = "Multiple entries with same "
            java.lang.String r1 = ": "
            java.lang.StringBuilder r8 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r10, r0, r6, r1, r8)
            java.lang.String r10 = " and "
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r10, r9)
            r7.<init>(r8)
            throw r7
        La8:
            com.google.common.collect.ImmutableSortedMap r8 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.RegularImmutableSortedSet r9 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.asImmutableList(r0, r10)
            r9.<init>(r0, r7)
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.asImmutableList(r2, r10)
            r8.<init>(r9, r7)
            return r8
        Lbb:
            r8 = r9[r1]
            java.util.Objects.requireNonNull(r8)
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r8 = r8.getValue()
            com.google.common.collect.ImmutableSortedMap r7 = of(r7, r9, r8)
            return r7
        Lcf:
            com.google.common.collect.ImmutableSortedMap r7 = emptyMap(r7)
            return r7
    }

    private static <K extends java.lang.Comparable<? super K>, V> com.google.common.collect.ImmutableSortedMap<K, V> fromEntries(java.util.Map.Entry<K, V>... r3) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            int r1 = r3.length
            r2 = 0
            com.google.common.collect.ImmutableSortedMap r3 = fromEntries(r0, r2, r3, r1)
            return r3
    }

    private com.google.common.collect.ImmutableSortedMap<K, V> getSubMap(int r4, int r5) {
            r3 = this;
            if (r4 != 0) goto L9
            int r0 = r3.size()
            if (r5 != r0) goto L9
            return r3
        L9:
            if (r4 != r5) goto L14
            java.util.Comparator r4 = r3.comparator()
            com.google.common.collect.ImmutableSortedMap r4 = emptyMap(r4)
            return r4
        L14:
            com.google.common.collect.ImmutableSortedMap r0 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.RegularImmutableSortedSet<K> r1 = r3.keySet
            com.google.common.collect.RegularImmutableSortedSet r1 = r1.getSubSet(r4, r5)
            com.google.common.collect.ImmutableList<V> r2 = r3.valueList
            com.google.common.collect.ImmutableList r4 = r2.subList(r4, r5)
            r0.<init>(r1, r4)
            return r0
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> naturalOrder() {
            com.google.common.collect.ImmutableSortedMap$Builder r0 = new com.google.common.collect.ImmutableSortedMap$Builder
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of() {
            com.google.common.collect.ImmutableSortedMap<java.lang.Comparable, java.lang.Object> r0 = com.google.common.collect.ImmutableSortedMap.NATURAL_EMPTY_MAP
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r1, java.lang.Object r2) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.ImmutableSortedMap r1 = of(r0, r1, r2)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r1, java.lang.Object r2, java.lang.Comparable r3, java.lang.Object r4) {
            r0 = 2
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r1, r2)
            r2 = 0
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r3, r4)
            r2 = 1
            r0[r2] = r1
            com.google.common.collect.ImmutableSortedMap r1 = fromEntries(r0)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r1, java.lang.Object r2, java.lang.Comparable r3, java.lang.Object r4, java.lang.Comparable r5, java.lang.Object r6) {
            r0 = 3
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r1, r2)
            r2 = 0
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r3, r4)
            r2 = 1
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r5, r6)
            r2 = 2
            r0[r2] = r1
            com.google.common.collect.ImmutableSortedMap r1 = fromEntries(r0)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r1, java.lang.Object r2, java.lang.Comparable r3, java.lang.Object r4, java.lang.Comparable r5, java.lang.Object r6, java.lang.Comparable r7, java.lang.Object r8) {
            r0 = 4
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r1, r2)
            r2 = 0
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r3, r4)
            r2 = 1
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r5, r6)
            r2 = 2
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r7, r8)
            r2 = 3
            r0[r2] = r1
            com.google.common.collect.ImmutableSortedMap r1 = fromEntries(r0)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r1, java.lang.Object r2, java.lang.Comparable r3, java.lang.Object r4, java.lang.Comparable r5, java.lang.Object r6, java.lang.Comparable r7, java.lang.Object r8, java.lang.Comparable r9, java.lang.Object r10) {
            r0 = 5
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r1, r2)
            r2 = 0
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r3, r4)
            r2 = 1
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r5, r6)
            r2 = 2
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r7, r8)
            r2 = 3
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r9, r10)
            r2 = 4
            r0[r2] = r1
            com.google.common.collect.ImmutableSortedMap r1 = fromEntries(r0)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r1, java.lang.Object r2, java.lang.Comparable r3, java.lang.Object r4, java.lang.Comparable r5, java.lang.Object r6, java.lang.Comparable r7, java.lang.Object r8, java.lang.Comparable r9, java.lang.Object r10, java.lang.Comparable r11, java.lang.Object r12) {
            r0 = 6
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r1, r2)
            r2 = 0
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r3, r4)
            r2 = 1
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r5, r6)
            r2 = 2
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r7, r8)
            r2 = 3
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r9, r10)
            r2 = 4
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r11, r12)
            r2 = 5
            r0[r2] = r1
            com.google.common.collect.ImmutableSortedMap r1 = fromEntries(r0)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r1, java.lang.Object r2, java.lang.Comparable r3, java.lang.Object r4, java.lang.Comparable r5, java.lang.Object r6, java.lang.Comparable r7, java.lang.Object r8, java.lang.Comparable r9, java.lang.Object r10, java.lang.Comparable r11, java.lang.Object r12, java.lang.Comparable r13, java.lang.Object r14) {
            r0 = 7
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r1, r2)
            r2 = 0
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r3, r4)
            r2 = 1
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r5, r6)
            r2 = 2
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r7, r8)
            r2 = 3
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r9, r10)
            r2 = 4
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r11, r12)
            r2 = 5
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r13, r14)
            r2 = 6
            r0[r2] = r1
            com.google.common.collect.ImmutableSortedMap r1 = fromEntries(r0)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r3, java.lang.Object r4, java.lang.Comparable r5, java.lang.Object r6, java.lang.Comparable r7, java.lang.Object r8, java.lang.Comparable r9, java.lang.Object r10, java.lang.Comparable r11, java.lang.Object r12, java.lang.Comparable r13, java.lang.Object r14, java.lang.Comparable r15, java.lang.Object r16, java.lang.Comparable r17, java.lang.Object r18) {
            r0 = 8
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r3, r4)
            r2 = 0
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r5, r6)
            r2 = 1
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r7, r8)
            r2 = 2
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r9, r10)
            r2 = 3
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r11, r12)
            r2 = 4
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r13, r14)
            r2 = 5
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r15, r16)
            r2 = 6
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r17, r18)
            r2 = 7
            r0[r2] = r1
            com.google.common.collect.ImmutableSortedMap r0 = fromEntries(r0)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r3, java.lang.Object r4, java.lang.Comparable r5, java.lang.Object r6, java.lang.Comparable r7, java.lang.Object r8, java.lang.Comparable r9, java.lang.Object r10, java.lang.Comparable r11, java.lang.Object r12, java.lang.Comparable r13, java.lang.Object r14, java.lang.Comparable r15, java.lang.Object r16, java.lang.Comparable r17, java.lang.Object r18, java.lang.Comparable r19, java.lang.Object r20) {
            r0 = 9
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r3, r4)
            r2 = 0
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r5, r6)
            r2 = 1
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r7, r8)
            r2 = 2
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r9, r10)
            r2 = 3
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r11, r12)
            r2 = 4
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r13, r14)
            r2 = 5
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r15, r16)
            r2 = 6
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r17, r18)
            r2 = 7
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r19, r20)
            r2 = 8
            r0[r2] = r1
            com.google.common.collect.ImmutableSortedMap r0 = fromEntries(r0)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static com.google.common.collect.ImmutableSortedMap of(java.lang.Comparable r3, java.lang.Object r4, java.lang.Comparable r5, java.lang.Object r6, java.lang.Comparable r7, java.lang.Object r8, java.lang.Comparable r9, java.lang.Object r10, java.lang.Comparable r11, java.lang.Object r12, java.lang.Comparable r13, java.lang.Object r14, java.lang.Comparable r15, java.lang.Object r16, java.lang.Comparable r17, java.lang.Object r18, java.lang.Comparable r19, java.lang.Object r20, java.lang.Comparable r21, java.lang.Object r22) {
            r0 = 10
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r3, r4)
            r2 = 0
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r5, r6)
            r2 = 1
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r7, r8)
            r2 = 2
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r9, r10)
            r2 = 3
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r11, r12)
            r2 = 4
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r13, r14)
            r2 = 5
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r15, r16)
            r2 = 6
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r17, r18)
            r2 = 7
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r19, r20)
            r2 = 8
            r0[r2] = r1
            java.util.Map$Entry r1 = com.google.common.collect.ImmutableMap.entryOf(r21, r22)
            r2 = 9
            r0[r2] = r1
            com.google.common.collect.ImmutableSortedMap r0 = fromEntries(r0)
            return r0
    }

    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> of(java.util.Comparator<? super K> r2, K r3, V r4) {
            com.google.common.collect.ImmutableSortedMap r0 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.RegularImmutableSortedSet r1 = new com.google.common.collect.RegularImmutableSortedSet
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r3)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Comparator r2 = (java.util.Comparator) r2
            r1.<init>(r3, r2)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r4)
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> orderedBy(java.util.Comparator<K> r1) {
            com.google.common.collect.ImmutableSortedMap$Builder r0 = new com.google.common.collect.ImmutableSortedMap$Builder
            r0.<init>(r1)
            return r0
    }

    public static <K extends java.lang.Comparable<?>, V> com.google.common.collect.ImmutableSortedMap.Builder<K, V> reverseOrder() {
            com.google.common.collect.ImmutableSortedMap$Builder r0 = new com.google.common.collect.ImmutableSortedMap$Builder
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            com.google.common.collect.Ordering r1 = r1.reverse()
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> ceilingEntry(K r2) {
            r1 = this;
            r0 = 1
            com.google.common.collect.ImmutableSortedMap r2 = r1.tailMap(r2, r0)
            java.util.Map$Entry r2 = r2.firstEntry()
            return r2
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K ceilingKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.ceilingEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    @Override // java.util.SortedMap
    public java.util.Comparator<? super K> comparator() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.keySet()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    public final com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            goto L10
        Lb:
            com.google.common.collect.ImmutableSortedMap$1EntrySet r0 = new com.google.common.collect.ImmutableSortedMap$1EntrySet
            r0.<init>(r1)
        L10:
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    public final com.google.common.collect.ImmutableSet<K> createKeySet() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.collect.ImmutableMap
    public final com.google.common.collect.ImmutableCollection<V> createValues() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedSet<K> descendingKeySet() {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            com.google.common.collect.ImmutableSortedSet r0 = r0.descendingSet()
            return r0
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ java.util.NavigableSet descendingKeySet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.descendingKeySet()
            return r0
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedMap<K, V> descendingMap() {
            r3 = this;
            com.google.common.collect.ImmutableSortedMap<K, V> r0 = r3.descendingMap
            if (r0 != 0) goto L2e
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L1b
            java.util.Comparator r0 = r3.comparator()
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.from(r0)
            com.google.common.collect.Ordering r0 = r0.reverse()
            com.google.common.collect.ImmutableSortedMap r0 = emptyMap(r0)
            return r0
        L1b:
            com.google.common.collect.ImmutableSortedMap r0 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.RegularImmutableSortedSet<K> r1 = r3.keySet
            com.google.common.collect.ImmutableSortedSet r1 = r1.descendingSet()
            com.google.common.collect.RegularImmutableSortedSet r1 = (com.google.common.collect.RegularImmutableSortedSet) r1
            com.google.common.collect.ImmutableList<V> r2 = r3.valueList
            com.google.common.collect.ImmutableList r2 = r2.reverse()
            r0.<init>(r1, r2, r3)
        L2e:
            return r0
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ java.util.NavigableMap descendingMap() {
            r1 = this;
            com.google.common.collect.ImmutableSortedMap r0 = r1.descendingMap()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = super.entrySet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entrySet()
            return r0
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> firstEntry() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto L17
        L8:
            com.google.common.collect.ImmutableSet r0 = r2.entrySet()
            com.google.common.collect.ImmutableList r0 = r0.asList()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
        L17:
            return r0
    }

    @Override // java.util.SortedMap
    public K firstKey() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.keySet()
            java.lang.Object r0 = r0.first()
            return r0
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> floorEntry(K r2) {
            r1 = this;
            r0 = 1
            com.google.common.collect.ImmutableSortedMap r2 = r1.headMap(r2, r0)
            java.util.Map$Entry r2 = r2.lastEntry()
            return r2
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K floorKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.floorEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r3.keySet
            java.util.Objects.requireNonNull(r0)
            r1 = -1
            if (r4 != 0) goto L9
            goto L14
        L9:
            com.google.common.collect.ImmutableList<E> r2 = r0.elements     // Catch: java.lang.ClassCastException -> L14
            java.util.Comparator<? super E> r0 = r0.comparator     // Catch: java.lang.ClassCastException -> L14
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L14
            if (r4 < 0) goto L14
            goto L15
        L14:
            r4 = -1
        L15:
            if (r4 != r1) goto L19
            r4 = 0
            goto L1f
        L19:
            com.google.common.collect.ImmutableList<V> r0 = r3.valueList
            java.lang.Object r4 = r0.get(r4)
        L1f:
            return r4
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public com.google.common.collect.ImmutableSortedMap<K, V> headMap(K r2) {
            r1 = this;
            r0 = 0
            com.google.common.collect.ImmutableSortedMap r2 = r1.headMap(r2, r0)
            return r2
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedMap<K, V> headMap(K r2, boolean r3) {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            int r2 = r0.headIndex(r2, r3)
            r3 = 0
            com.google.common.collect.ImmutableSortedMap r2 = r1.getSubMap(r3, r2)
            return r2
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ java.util.NavigableMap headMap(java.lang.Object r1, boolean r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMap r1 = r0.headMap(r1, r2)
            return r1
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ java.util.SortedMap headMap(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMap r1 = r0.headMap(r1)
            return r1
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> higherEntry(K r2) {
            r1 = this;
            r0 = 0
            com.google.common.collect.ImmutableSortedMap r2 = r1.tailMap(r2, r0)
            java.util.Map$Entry r2 = r2.firstEntry()
            return r2
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K higherKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.higherEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean isPartialView() {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            boolean r0 = r0.isPartialView()
            if (r0 != 0) goto L13
            com.google.common.collect.ImmutableList<V> r0 = r1.valueList
            boolean r0 = r0.isPartialView()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet keySet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.keySet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public com.google.common.collect.ImmutableSortedSet<K> keySet() {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.keySet()
            return r0
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> lastEntry() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto L1c
        L8:
            com.google.common.collect.ImmutableSet r0 = r2.entrySet()
            com.google.common.collect.ImmutableList r0 = r0.asList()
            int r1 = r2.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
        L1c:
            return r0
    }

    @Override // java.util.SortedMap
    public K lastKey() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.keySet()
            java.lang.Object r0 = r0.last()
            return r0
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, V> lowerEntry(K r2) {
            r1 = this;
            r0 = 0
            com.google.common.collect.ImmutableSortedMap r2 = r1.headMap(r2, r0)
            java.util.Map$Entry r2 = r2.lastEntry()
            return r2
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public K lowerKey(K r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.lowerEntry(r1)
            java.lang.Object r1 = com.google.common.collect.Maps.keyOrNull(r1)
            return r1
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedSet<K> navigableKeySet() {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            return r0
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ java.util.NavigableSet navigableKeySet() {
            r1 = this;
            com.google.common.collect.ImmutableSortedSet r0 = r1.navigableKeySet()
            return r0
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final java.util.Map.Entry<K, V> pollFirstEntry() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final java.util.Map.Entry<K, V> pollLastEntry() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            com.google.common.collect.ImmutableList<V> r0 = r1.valueList
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public com.google.common.collect.ImmutableSortedMap<K, V> subMap(K r3, K r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            com.google.common.collect.ImmutableSortedMap r3 = r2.subMap(r3, r0, r4, r1)
            return r3
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedMap<K, V> subMap(K r3, boolean r4, K r5, boolean r6) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r5)
            java.util.Comparator r0 = r2.comparator()
            int r0 = r0.compare(r3, r5)
            if (r0 > 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            java.lang.String r1 = "expected fromKey <= toKey but %s > %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3, r5)
            com.google.common.collect.ImmutableSortedMap r5 = r2.headMap(r5, r6)
            com.google.common.collect.ImmutableSortedMap r3 = r5.tailMap(r3, r4)
            return r3
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ java.util.NavigableMap subMap(java.lang.Object r1, boolean r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMap r1 = r0.subMap(r1, r2, r3, r4)
            return r1
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ java.util.SortedMap subMap(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMap r1 = r0.subMap(r1, r2)
            return r1
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public com.google.common.collect.ImmutableSortedMap<K, V> tailMap(K r2) {
            r1 = this;
            r0 = 1
            com.google.common.collect.ImmutableSortedMap r2 = r1.tailMap(r2, r0)
            return r2
    }

    @Override // java.util.NavigableMap
    public com.google.common.collect.ImmutableSortedMap<K, V> tailMap(K r2, boolean r3) {
            r1 = this;
            com.google.common.collect.RegularImmutableSortedSet<K> r0 = r1.keySet
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            int r2 = r0.tailIndex(r2, r3)
            int r3 = r1.size()
            com.google.common.collect.ImmutableSortedMap r2 = r1.getSubMap(r2, r3)
            return r2
    }

    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ java.util.NavigableMap tailMap(java.lang.Object r1, boolean r2) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMap r1 = r0.tailMap(r1, r2)
            return r1
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ java.util.SortedMap tailMap(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSortedMap r1 = r0.tailMap(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public com.google.common.collect.ImmutableCollection<V> values() {
            r1 = this;
            com.google.common.collect.ImmutableList<V> r0 = r1.valueList
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.values()
            return r0
    }
}
