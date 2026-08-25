package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class RegularImmutableMap<K, V> extends com.google.common.collect.ImmutableMap<K, V> {
    private static final byte ABSENT = -1;
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 128;
    public static final com.google.common.collect.ImmutableMap<java.lang.Object, java.lang.Object> EMPTY = null;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 32768;
    private static final long serialVersionUID = 0;

    @com.google.common.annotations.VisibleForTesting
    public final transient java.lang.Object[] alternatingKeysAndValues;

    @javax.annotation.CheckForNull
    private final transient java.lang.Object hashTable;
    private final transient int size;

    /* JADX INFO: loaded from: classes.dex */
    public static class EntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {
        private final transient java.lang.Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient com.google.common.collect.ImmutableMap<K, V> map;
        private final transient int size;


        public EntrySet(com.google.common.collect.ImmutableMap<K, V> r1, java.lang.Object[] r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.map = r1
                r0.alternatingKeysAndValues = r2
                r0.keyOffset = r3
                r0.size = r4
                return
        }

        public static /* synthetic */ int access$000(com.google.common.collect.RegularImmutableMap.EntrySet r0) {
                int r0 = r0.size
                return r0
        }

        public static /* synthetic */ java.lang.Object[] access$100(com.google.common.collect.RegularImmutableMap.EntrySet r0) {
                java.lang.Object[] r0 = r0.alternatingKeysAndValues
                return r0
        }

        public static /* synthetic */ int access$200(com.google.common.collect.RegularImmutableMap.EntrySet r0) {
                int r0 = r0.keyOffset
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L1e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                if (r4 == 0) goto L1e
                com.google.common.collect.ImmutableMap<K, V> r2 = r3.map
                java.lang.Object r0 = r2.get(r0)
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L1e
                r1 = 1
            L1e:
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int copyIntoArray(java.lang.Object[] r2, int r3) {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.asList()
                int r2 = r0.copyIntoArray(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.ImmutableSet
        public final com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> createAsList() {
                r1 = this;
                com.google.common.collect.RegularImmutableMap$EntrySet$1 r0 = new com.google.common.collect.RegularImmutableMap$EntrySet$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.asList()
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
                return r0
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
                int r0 = r1.size
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class KeySet<K> extends com.google.common.collect.ImmutableSet<K> {
        private final transient com.google.common.collect.ImmutableList<K> list;
        private final transient com.google.common.collect.ImmutableMap<K, ?> map;

        public KeySet(com.google.common.collect.ImmutableMap<K, ?> r1, com.google.common.collect.ImmutableList<K> r2) {
                r0 = this;
                r0.<init>()
                r0.map = r1
                r0.list = r2
                return
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public com.google.common.collect.ImmutableList<K> asList() {
                r1 = this;
                com.google.common.collect.ImmutableList<K> r0 = r1.list
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableMap<K, ?> r0 = r1.map
                java.lang.Object r2 = r0.get(r2)
                if (r2 == 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int copyIntoArray(java.lang.Object[] r2, int r3) {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.asList()
                int r2 = r0.copyIntoArray(r2, r3)
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public com.google.common.collect.UnmodifiableIterator<K> iterator() {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.asList()
                com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
                return r0
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
                com.google.common.collect.ImmutableMap<K, ?> r0 = r1.map
                int r0 = r0.size()
                return r0
        }
    }

    public static final class KeysOrValuesAsList extends com.google.common.collect.ImmutableList<java.lang.Object> {
        private final transient java.lang.Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        public KeysOrValuesAsList(java.lang.Object[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.alternatingKeysAndValues = r1
                r0.offset = r2
                r0.size = r3
                return
        }

        @Override // java.util.List
        public java.lang.Object get(int r3) {
                r2 = this;
                int r0 = r2.size
                com.google.common.base.Preconditions.checkElementIndex(r3, r0)
                java.lang.Object[] r0 = r2.alternatingKeysAndValues
                int r3 = r3 * 2
                int r1 = r2.offset
                int r3 = r3 + r1
                r3 = r0[r3]
                java.util.Objects.requireNonNull(r3)
                return r3
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    static {
            com.google.common.collect.RegularImmutableMap r0 = new com.google.common.collect.RegularImmutableMap
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r0.<init>(r3, r2, r1)
            com.google.common.collect.RegularImmutableMap.EMPTY = r0
            return
    }

    private RegularImmutableMap(@javax.annotation.CheckForNull java.lang.Object r1, java.lang.Object[] r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.hashTable = r1
            r0.alternatingKeysAndValues = r2
            r0.size = r3
            return
    }

    public static <K, V> com.google.common.collect.RegularImmutableMap<K, V> create(int r3, java.lang.Object[] r4) {
            if (r3 != 0) goto L7
            com.google.common.collect.ImmutableMap<java.lang.Object, java.lang.Object> r3 = com.google.common.collect.RegularImmutableMap.EMPTY
            com.google.common.collect.RegularImmutableMap r3 = (com.google.common.collect.RegularImmutableMap) r3
            return r3
        L7:
            r0 = 0
            r1 = 1
            if (r3 != r1) goto L1c
            r3 = r4[r0]
            java.util.Objects.requireNonNull(r3)
            r3 = r4[r1]
            java.util.Objects.requireNonNull(r3)
            com.google.common.collect.RegularImmutableMap r3 = new com.google.common.collect.RegularImmutableMap
            r0 = 0
            r3.<init>(r0, r4, r1)
            return r3
        L1c:
            int r2 = r4.length
            int r1 = r2 >> 1
            com.google.common.base.Preconditions.checkPositionIndex(r3, r1)
            int r1 = com.google.common.collect.ImmutableSet.chooseTableSize(r3)
            java.lang.Object r0 = createHashTable(r4, r3, r1, r0)
            com.google.common.collect.RegularImmutableMap r1 = new com.google.common.collect.RegularImmutableMap
            r1.<init>(r0, r4, r3)
            return r1
    }

    @javax.annotation.CheckForNull
    public static java.lang.Object createHashTable(java.lang.Object[] r9, int r10, int r11, int r12) {
            r0 = 1
            if (r10 != r0) goto L11
            r10 = r9[r12]
            java.util.Objects.requireNonNull(r10)
            r10 = r12 ^ 1
            r9 = r9[r10]
            java.util.Objects.requireNonNull(r9)
            r9 = 0
            return r9
        L11:
            int r0 = r11 + (-1)
            r1 = 128(0x80, float:1.8E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L56
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L1e:
            if (r2 >= r10) goto L55
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            java.util.Objects.requireNonNull(r3)
            r4 = r1 ^ 1
            r4 = r9[r4]
            java.util.Objects.requireNonNull(r4)
            int r5 = r3.hashCode()
            int r5 = com.google.common.collect.Hashing.smear(r5)
        L37:
            r5 = r5 & r0
            r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L45
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L1e
        L45:
            r7 = r9[r6]
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L50
            int r5 = r5 + 1
            goto L37
        L50:
            java.lang.IllegalArgumentException r9 = duplicateKeyException(r3, r4, r9, r6)
            throw r9
        L55:
            return r11
        L56:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 > r1) goto L99
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L60:
            if (r2 >= r10) goto L98
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            java.util.Objects.requireNonNull(r3)
            r4 = r1 ^ 1
            r4 = r9[r4]
            java.util.Objects.requireNonNull(r4)
            int r5 = r3.hashCode()
            int r5 = com.google.common.collect.Hashing.smear(r5)
        L79:
            r5 = r5 & r0
            short r6 = r11[r5]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L88
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L60
        L88:
            r7 = r9[r6]
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L93
            int r5 = r5 + 1
            goto L79
        L93:
            java.lang.IllegalArgumentException r9 = duplicateKeyException(r3, r4, r9, r6)
            throw r9
        L98:
            return r11
        L99:
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L9e:
            if (r2 >= r10) goto Ld1
            int r1 = r2 * 2
            int r1 = r1 + r12
            r4 = r9[r1]
            java.util.Objects.requireNonNull(r4)
            r5 = r1 ^ 1
            r5 = r9[r5]
            java.util.Objects.requireNonNull(r5)
            int r6 = r4.hashCode()
            int r6 = com.google.common.collect.Hashing.smear(r6)
        Lb7:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 != r3) goto Lc1
            r11[r6] = r1
            int r2 = r2 + 1
            goto L9e
        Lc1:
            r8 = r9[r7]
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto Lcc
            int r6 = r6 + 1
            goto Lb7
        Lcc:
            java.lang.IllegalArgumentException r9 = duplicateKeyException(r4, r5, r9, r7)
            throw r9
        Ld1:
            return r11
    }

    private static java.lang.IllegalArgumentException duplicateKeyException(java.lang.Object r4, java.lang.Object r5, java.lang.Object[] r6, int r7) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1 = r6[r7]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7 = r7 ^ 1
            r6 = r6[r7]
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r7 = r4.length()
            int r7 = r7 + 39
            int r2 = r5.length()
            int r2 = r2 + r7
            int r7 = r1.length()
            int r7 = r7 + r2
            int r2 = r6.length()
            int r2 = r2 + r7
            java.lang.String r7 = "Multiple entries with same key: "
            java.lang.String r3 = "="
            java.lang.StringBuilder r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r2, r7, r4, r3, r5)
            java.lang.String r5 = " and "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r5, r1, r3, r6)
            r0.<init>(r4)
            return r0
    }

    @javax.annotation.CheckForNull
    public static java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r4, java.lang.Object[] r5, int r6, int r7, @javax.annotation.CheckForNull java.lang.Object r8) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r6 != r1) goto L1a
            r4 = r5[r7]
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L19
            r4 = r7 ^ 1
            r0 = r5[r4]
            java.util.Objects.requireNonNull(r0)
        L19:
            return r0
        L1a:
            if (r4 != 0) goto L1d
            return r0
        L1d:
            boolean r6 = r4 instanceof byte[]
            if (r6 == 0) goto L48
            r6 = r4
            byte[] r6 = (byte[]) r6
            int r4 = r6.length
            int r7 = r4 + (-1)
            int r4 = r8.hashCode()
            int r4 = com.google.common.collect.Hashing.smear(r4)
        L2f:
            r4 = r4 & r7
            r2 = r6[r4]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            if (r2 != r3) goto L38
            return r0
        L38:
            r3 = r5[r2]
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L45
            r4 = r2 ^ 1
            r4 = r5[r4]
            return r4
        L45:
            int r4 = r4 + 1
            goto L2f
        L48:
            boolean r6 = r4 instanceof short[]
            if (r6 == 0) goto L74
            r6 = r4
            short[] r6 = (short[]) r6
            int r4 = r6.length
            int r7 = r4 + (-1)
            int r4 = r8.hashCode()
            int r4 = com.google.common.collect.Hashing.smear(r4)
        L5a:
            r4 = r4 & r7
            short r2 = r6[r4]
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            if (r2 != r3) goto L64
            return r0
        L64:
            r3 = r5[r2]
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L71
            r4 = r2 ^ 1
            r4 = r5[r4]
            return r4
        L71:
            int r4 = r4 + 1
            goto L5a
        L74:
            int[] r4 = (int[]) r4
            int r6 = r4.length
            int r6 = r6 - r1
            int r7 = r8.hashCode()
            int r7 = com.google.common.collect.Hashing.smear(r7)
        L80:
            r7 = r7 & r6
            r2 = r4[r7]
            r3 = -1
            if (r2 != r3) goto L87
            return r0
        L87:
            r3 = r5[r2]
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L94
            r4 = r2 ^ 1
            r4 = r5[r4]
            return r4
        L94:
            int r7 = r7 + 1
            goto L80
    }

    @Override // com.google.common.collect.ImmutableMap
    public final com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> createEntrySet() {
            r4 = this;
            com.google.common.collect.RegularImmutableMap$EntrySet r0 = new com.google.common.collect.RegularImmutableMap$EntrySet
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            int r2 = r4.size
            r3 = 0
            r0.<init>(r4, r1, r3, r2)
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    public final com.google.common.collect.ImmutableSet<K> createKeySet() {
            r4 = this;
            com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList r0 = new com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            int r2 = r4.size
            r3 = 0
            r0.<init>(r1, r3, r2)
            com.google.common.collect.RegularImmutableMap$KeySet r1 = new com.google.common.collect.RegularImmutableMap$KeySet
            r1.<init>(r4, r0)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMap
    public final com.google.common.collect.ImmutableCollection<V> createValues() {
            r4 = this;
            com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList r0 = new com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            int r2 = r4.size
            r3 = 1
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.hashTable
            java.lang.Object[] r1 = r4.alternatingKeysAndValues
            int r2 = r4.size
            r3 = 0
            java.lang.Object r5 = get(r0, r1, r2, r3, r5)
            if (r5 != 0) goto Le
            r5 = 0
        Le:
            return r5
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
