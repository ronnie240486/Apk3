package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class ImmutableSetMultimap<K, V> extends com.google.common.collect.ImmutableMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V> {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;
    private final transient com.google.common.collect.ImmutableSet<V> emptySet;

    @com.google.j2objc.annotations.RetainedWith
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entries;

    @com.google.j2objc.annotations.RetainedWith
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSetMultimap<V, K> inverse;

    public static final class Builder<K, V> extends com.google.common.collect.ImmutableMultimap.Builder<K, V> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap build() {
                r1 = this;
                com.google.common.collect.ImmutableSetMultimap r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableSetMultimap<K, V> build() {
                r2 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r2.builderMap
                java.util.Set r0 = r0.entrySet()
                java.util.Comparator<? super K> r1 = r2.keyComparator
                if (r1 == 0) goto L16
                com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.from(r1)
                com.google.common.collect.Ordering r1 = r1.onKeys()
                com.google.common.collect.ImmutableList r0 = r1.immutableSortedCopy(r0)
            L16:
                java.util.Comparator<? super V> r1 = r2.valueComparator
                com.google.common.collect.ImmutableSetMultimap r0 = com.google.common.collect.ImmutableSetMultimap.fromMapEntries(r0, r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public final java.util.Collection<V> newMutableValueCollection() {
                r1 = this;
                com.google.common.collect.CompactHashSet r0 = com.google.common.collect.CompactHashSet.create()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder orderKeysBy(java.util.Comparator r1) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.orderKeysBy(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> orderKeysBy(java.util.Comparator<? super K> r1) {
                r0 = this;
                super.orderKeysBy(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder orderValuesBy(java.util.Comparator r1) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.orderValuesBy(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> orderValuesBy(java.util.Comparator<? super V> r1) {
                r0 = this;
                super.orderValuesBy(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.put(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder put(java.util.Map.Entry r1) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.put(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> put(K r1, V r2) {
                r0 = this;
                super.put(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> r1) {
                r0 = this;
                super.put(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(com.google.common.collect.Multimap r1) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.putAll(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object r1, java.lang.Object[] r2) {
                r0 = this;
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.putAll(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r3) {
                r2 = this;
                java.util.Map r3 = r3.asMap()
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            Lc:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L26
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.Object r0 = r0.getValue()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r2.putAll(r1, r0)
                goto Lc
            L26:
                return r2
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(K r1, java.lang.Iterable<? extends V> r2) {
                r0 = this;
                super.putAll(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableSetMultimap.Builder<K, V> putAll(K r1, V... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.putAll(r1, r2)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class EntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {

        @com.google.j2objc.annotations.Weak
        private final transient com.google.common.collect.ImmutableSetMultimap<K, V> multimap;

        public EntrySet(com.google.common.collect.ImmutableSetMultimap<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.multimap = r1
                return
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L15
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.common.collect.ImmutableSetMultimap<K, V> r0 = r2.multimap
                java.lang.Object r1 = r3.getKey()
                java.lang.Object r3 = r3.getValue()
                boolean r3 = r0.containsEntry(r1, r3)
                return r3
            L15:
                r3 = 0
                return r3
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                com.google.common.collect.ImmutableSetMultimap<K, V> r0 = r2.multimap
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.ImmutableMultimap$1 r1 = new com.google.common.collect.ImmutableMultimap$1
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.ImmutableSetMultimap<K, V> r0 = r1.multimap
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.GwtIncompatible
    public static final class SetFieldSettersHolder {
        public static final com.google.common.collect.Serialization.FieldSetter<com.google.common.collect.ImmutableSetMultimap> EMPTY_SET_FIELD_SETTER = null;

        static {
                java.lang.Class<com.google.common.collect.ImmutableSetMultimap> r0 = com.google.common.collect.ImmutableSetMultimap.class
                java.lang.String r1 = "emptySet"
                com.google.common.collect.Serialization$FieldSetter r0 = com.google.common.collect.Serialization.getFieldSetter(r0, r1)
                com.google.common.collect.ImmutableSetMultimap.SetFieldSettersHolder.EMPTY_SET_FIELD_SETTER = r0
                return
        }

        private SetFieldSettersHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ImmutableSetMultimap(com.google.common.collect.ImmutableMap<K, com.google.common.collect.ImmutableSet<V>> r1, int r2, @javax.annotation.CheckForNull java.util.Comparator<? super V> r3) {
            r0 = this;
            r0.<init>(r1, r2)
            com.google.common.collect.ImmutableSet r1 = emptySet(r3)
            r0.emptySet = r1
            return
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap.Builder<K, V> builder() {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = new com.google.common.collect.ImmutableSetMultimap$Builder
            r0.<init>()
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
            r0 = 0
            com.google.common.collect.ImmutableSetMultimap r1 = copyOf(r1, r0)
            return r1
    }

    private static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> r2, @javax.annotation.CheckForNull java.util.Comparator<? super V> r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L10
            if (r3 != 0) goto L10
            com.google.common.collect.ImmutableSetMultimap r2 = of()
            return r2
        L10:
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableSetMultimap
            if (r0 == 0) goto L1e
            r0 = r2
            com.google.common.collect.ImmutableSetMultimap r0 = (com.google.common.collect.ImmutableSetMultimap) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            java.util.Map r2 = r2.asMap()
            java.util.Set r2 = r2.entrySet()
            com.google.common.collect.ImmutableSetMultimap r2 = fromMapEntries(r2, r3)
            return r2
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = new com.google.common.collect.ImmutableSetMultimap$Builder
            r0.<init>()
            com.google.common.collect.ImmutableSetMultimap$Builder r1 = r0.putAll(r1)
            com.google.common.collect.ImmutableSetMultimap r1 = r1.build()
            return r1
    }

    private static <V> com.google.common.collect.ImmutableSet<V> emptySet(@javax.annotation.CheckForNull java.util.Comparator<? super V> r0) {
            if (r0 != 0) goto L7
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            goto Lb
        L7:
            com.google.common.collect.RegularImmutableSortedSet r0 = com.google.common.collect.ImmutableSortedSet.emptySet(r0)
        Lb:
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> fromMapEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>>> r5, @javax.annotation.CheckForNull java.util.Comparator<? super V> r6) {
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableSetMultimap r5 = of()
            return r5
        Lb:
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder
            int r1 = r5.size()
            r0.<init>(r1)
            r1 = 0
            java.util.Iterator r5 = r5.iterator()
        L19:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            com.google.common.collect.ImmutableSet r2 = valueSet(r6, r2)
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L19
            r0.put(r3, r2)
            int r2 = r2.size()
            int r2 = r2 + r1
            r1 = r2
            goto L19
        L43:
            com.google.common.collect.ImmutableSetMultimap r5 = new com.google.common.collect.ImmutableSetMultimap
            com.google.common.collect.ImmutableMap r0 = r0.build()
            r5.<init>(r0, r1, r6)
            return r5
    }

    private com.google.common.collect.ImmutableSetMultimap<V, K> invert() {
            r4 = this;
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = builder()
            com.google.common.collect.ImmutableSet r1 = r4.entries()
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Object r2 = r2.getKey()
            r0.put(r3, r2)
            goto Lc
        L24:
            com.google.common.collect.ImmutableSetMultimap r0 = r0.build()
            r0.inverse = r4
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of() {
            com.google.common.collect.EmptyImmutableSetMultimap r0 = com.google.common.collect.EmptyImmutableSetMultimap.INSTANCE
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K r1, V r2) {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            com.google.common.collect.ImmutableSetMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K r1, V r2, K r3, V r4) {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            com.google.common.collect.ImmutableSetMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K r1, V r2, K r3, V r4, K r5, V r6) {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            r0.put(r5, r6)
            com.google.common.collect.ImmutableSetMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K r1, V r2, K r3, V r4, K r5, V r6, K r7, V r8) {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            r0.put(r5, r6)
            r0.put(r7, r8)
            com.google.common.collect.ImmutableSetMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableSetMultimap<K, V> of(K r1, V r2, K r3, V r4, K r5, V r6, K r7, V r8, K r9, V r10) {
            com.google.common.collect.ImmutableSetMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            r0.put(r5, r6)
            r0.put(r7, r8)
            r0.put(r9, r10)
            com.google.common.collect.ImmutableSetMultimap r1 = r0.build()
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r11) throws java.io.IOException, java.lang.ClassNotFoundException {
            r10 = this;
            r11.defaultReadObject()
            java.lang.Object r0 = r11.readObject()
            java.util.Comparator r0 = (java.util.Comparator) r0
            int r1 = r11.readInt()
            if (r1 < 0) goto L90
            com.google.common.collect.ImmutableMap$Builder r2 = com.google.common.collect.ImmutableMap.builder()
            r3 = 0
            r4 = 0
        L15:
            if (r3 >= r1) goto L67
            java.lang.Object r5 = r11.readObject()
            int r6 = r11.readInt()
            if (r6 <= 0) goto L59
            com.google.common.collect.ImmutableSet$Builder r7 = valuesBuilder(r0)
            r8 = 0
        L26:
            if (r8 >= r6) goto L32
            java.lang.Object r9 = r11.readObject()
            r7.add(r9)
            int r8 = r8 + 1
            goto L26
        L32:
            com.google.common.collect.ImmutableSet r7 = r7.build()
            int r8 = r7.size()
            if (r8 != r6) goto L43
            r2.put(r5, r7)
            int r4 = r4 + r6
            int r3 = r3 + 1
            goto L15
        L43:
            java.io.InvalidObjectException r11 = new java.io.InvalidObjectException
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r1 = r0.length()
            int r1 = r1 + 40
            java.lang.String r2 = "Duplicate key-value pairs exist for key "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0)
            r11.<init>(r0)
            throw r11
        L59:
            java.io.InvalidObjectException r11 = new java.io.InvalidObjectException
            r0 = 31
            java.lang.String r1 = "Invalid value count "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r6)
            r11.<init>(r0)
            throw r11
        L67:
            com.google.common.collect.ImmutableMap r11 = r2.build()     // Catch: java.lang.IllegalArgumentException -> L7f
            com.google.common.collect.Serialization$FieldSetter<com.google.common.collect.ImmutableMultimap> r1 = com.google.common.collect.ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER
            r1.set(r10, r11)
            com.google.common.collect.Serialization$FieldSetter<com.google.common.collect.ImmutableMultimap> r11 = com.google.common.collect.ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER
            r11.set(r10, r4)
            com.google.common.collect.Serialization$FieldSetter<com.google.common.collect.ImmutableSetMultimap> r11 = com.google.common.collect.ImmutableSetMultimap.SetFieldSettersHolder.EMPTY_SET_FIELD_SETTER
            com.google.common.collect.ImmutableSet r0 = emptySet(r0)
            r11.set(r10, r0)
            return
        L7f:
            r11 = move-exception
            java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
            java.lang.String r1 = r11.getMessage()
            r0.<init>(r1)
            java.lang.Throwable r11 = r0.initCause(r11)
            java.io.InvalidObjectException r11 = (java.io.InvalidObjectException) r11
            throw r11
        L90:
            java.io.InvalidObjectException r11 = new java.io.InvalidObjectException
            r0 = 29
            java.lang.String r2 = "Invalid key count "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            r11.<init>(r0)
            throw r11
    }

    private static <V> com.google.common.collect.ImmutableSet<V> valueSet(@javax.annotation.CheckForNull java.util.Comparator<? super V> r0, java.util.Collection<? extends V> r1) {
            if (r0 != 0) goto L7
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.copyOf(r1)
            goto Lb
        L7:
            com.google.common.collect.ImmutableSortedSet r0 = com.google.common.collect.ImmutableSortedSet.copyOf(r0, r1)
        Lb:
            return r0
    }

    private static <V> com.google.common.collect.ImmutableSet.Builder<V> valuesBuilder(@javax.annotation.CheckForNull java.util.Comparator<? super V> r1) {
            if (r1 != 0) goto L8
            com.google.common.collect.ImmutableSet$Builder r1 = new com.google.common.collect.ImmutableSet$Builder
            r1.<init>()
            goto Le
        L8:
            com.google.common.collect.ImmutableSortedSet$Builder r0 = new com.google.common.collect.ImmutableSortedSet$Builder
            r0.<init>(r1)
            r1 = r0
        Le:
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r3) throws java.io.IOException {
            r2 = this;
            r3.defaultWriteObject()
            com.google.common.collect.ImmutableSet<V> r0 = r2.emptySet
            boolean r1 = r0 instanceof com.google.common.collect.ImmutableSortedSet
            if (r1 == 0) goto L10
            com.google.common.collect.ImmutableSortedSet r0 = (com.google.common.collect.ImmutableSortedSet) r0
            java.util.Comparator r0 = r0.comparator()
            goto L11
        L10:
            r0 = 0
        L11:
            r3.writeObject(r0)
            com.google.common.collect.Serialization.writeMultimap(r2, r3)
            return
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection entries() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entries()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> entries() {
            r1 = this;
            com.google.common.collect.ImmutableSet<java.util.Map$Entry<K, V>> r0 = r1.entries
            if (r0 != 0) goto Lb
            com.google.common.collect.ImmutableSetMultimap$EntrySet r0 = new com.google.common.collect.ImmutableSetMultimap$EntrySet
            r0.<init>(r1)
            r1.entries = r0
        Lb:
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection entries() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entries()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set entries() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.entries()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection get(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public com.google.common.collect.ImmutableSet<V> get(K r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            com.google.common.collect.ImmutableSet r2 = (com.google.common.collect.ImmutableSet) r2
            com.google.common.collect.ImmutableSet<V> r0 = r1.emptySet
            java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r0)
            com.google.common.collect.ImmutableSet r2 = (com.google.common.collect.ImmutableSet) r2
            return r2
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Set get(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap inverse() {
            r1 = this;
            com.google.common.collect.ImmutableSetMultimap r0 = r1.inverse()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public com.google.common.collect.ImmutableSetMultimap<V, K> inverse() {
            r1 = this;
            com.google.common.collect.ImmutableSetMultimap<V, K> r0 = r1.inverse
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableSetMultimap r0 = r1.invert()
            r1.inverse = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableSet<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Set removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableSet<V> replaceValues(K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Set replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = r0.replaceValues(r1, r2)
            return r1
    }
}
