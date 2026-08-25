package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class LinkedHashMultimap<K, V> extends com.google.common.collect.LinkedHashMultimapGwtSerializationDependencies<K, V> {
    private static final int DEFAULT_KEY_CAPACITY = 16;
    private static final int DEFAULT_VALUE_SET_CAPACITY = 2;

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 1;
    private transient com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> multimapHeaderEntry;

    @com.google.common.annotations.VisibleForTesting
    public transient int valueSetCapacity;

    /* JADX INFO: renamed from: com.google.common.collect.LinkedHashMultimap$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public class AnonymousClass1 implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        public com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> nextEntry;
        public final /* synthetic */ com.google.common.collect.LinkedHashMultimap this$0;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> toRemove;

        public AnonymousClass1(com.google.common.collect.LinkedHashMultimap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.common.collect.LinkedHashMultimap$ValueEntry r1 = com.google.common.collect.LinkedHashMultimap.access$300(r1)
                com.google.common.collect.LinkedHashMultimap$ValueEntry r1 = r1.getSuccessorInMultimap()
                r0.nextEntry = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r0 = r2.nextEntry
                com.google.common.collect.LinkedHashMultimap r1 = r2.this$0
                com.google.common.collect.LinkedHashMultimap$ValueEntry r1 = com.google.common.collect.LinkedHashMultimap.access$300(r1)
                if (r0 == r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L11
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r0 = r2.nextEntry
                r2.toRemove = r0
                com.google.common.collect.LinkedHashMultimap$ValueEntry r1 = r0.getSuccessorInMultimap()
                r2.nextEntry = r1
                return r0
            L11:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r0 = r3.toRemove
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "no calls to next() since the last call to remove()"
                com.google.common.base.Preconditions.checkState(r0, r1)
                com.google.common.collect.LinkedHashMultimap r0 = r3.this$0
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r1 = r3.toRemove
                java.lang.Object r1 = r1.getKey()
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r2 = r3.toRemove
                java.lang.Object r2 = r2.getValue()
                r0.remove(r1, r2)
                r0 = 0
                r3.toRemove = r0
                return
        }
    }

    @com.google.common.annotations.VisibleForTesting
    public static final class ValueEntry<K, V> extends com.google.common.collect.ImmutableEntry<K, V> implements com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> {

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> nextInValueBucket;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> predecessorInMultimap;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> predecessorInValueSet;
        public final int smearedValueHash;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> successorInMultimap;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> successorInValueSet;

        public ValueEntry(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V r2, int r3, @javax.annotation.CheckForNull com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.smearedValueHash = r3
                r0.nextInValueBucket = r4
                return
        }

        public com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> getPredecessorInMultimap() {
                r2 = this;
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r0 = r2.predecessorInMultimap
                java.util.Objects.requireNonNull(r0)
                r1 = r0
                com.google.common.collect.LinkedHashMultimap$ValueEntry r1 = (com.google.common.collect.LinkedHashMultimap.ValueEntry) r1
                return r0
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> getPredecessorInValueSet() {
                r1 = this;
                com.google.common.collect.LinkedHashMultimap$ValueSetLink<K, V> r0 = r1.predecessorInValueSet
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.LinkedHashMultimap$ValueSetLink r0 = (com.google.common.collect.LinkedHashMultimap.ValueSetLink) r0
                return r0
        }

        public com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> getSuccessorInMultimap() {
                r2 = this;
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r0 = r2.successorInMultimap
                java.util.Objects.requireNonNull(r0)
                r1 = r0
                com.google.common.collect.LinkedHashMultimap$ValueEntry r1 = (com.google.common.collect.LinkedHashMultimap.ValueEntry) r1
                return r0
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> getSuccessorInValueSet() {
                r1 = this;
                com.google.common.collect.LinkedHashMultimap$ValueSetLink<K, V> r0 = r1.successorInValueSet
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.LinkedHashMultimap$ValueSetLink r0 = (com.google.common.collect.LinkedHashMultimap.ValueSetLink) r0
                return r0
        }

        public final boolean matchesValue(@javax.annotation.CheckForNull java.lang.Object r2, int r3) {
                r1 = this;
                int r0 = r1.smearedValueHash
                if (r0 != r3) goto L10
                java.lang.Object r3 = r1.getValue()
                boolean r2 = com.google.common.base.Objects.equal(r3, r2)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }

        public void setPredecessorInMultimap(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> r1) {
                r0 = this;
                r0.predecessorInMultimap = r1
                return
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setPredecessorInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> r1) {
                r0 = this;
                r0.predecessorInValueSet = r1
                return
        }

        public void setSuccessorInMultimap(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> r1) {
                r0 = this;
                r0.successorInMultimap = r1
                return
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setSuccessorInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> r1) {
                r0 = this;
                r0.successorInValueSet = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.VisibleForTesting
    public final class ValueSet extends com.google.common.collect.Sets.ImprovedAbstractSet<V> implements com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> {
        private com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> firstEntry;

        @com.google.common.annotations.VisibleForTesting
        public com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V>[] hashTable;

        @com.google.common.collect.ParametricNullness
        private final K key;
        private com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> lastEntry;
        private int modCount;
        private int size;
        public final /* synthetic */ com.google.common.collect.LinkedHashMultimap this$0;


        public ValueSet(@com.google.common.collect.ParametricNullness com.google.common.collect.LinkedHashMultimap r1, K r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.size = r1
                r0.modCount = r1
                r0.key = r2
                r0.firstEntry = r0
                r0.lastEntry = r0
                r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r1 = com.google.common.collect.Hashing.closedTableSize(r3, r1)
                com.google.common.collect.LinkedHashMultimap$ValueEntry[] r1 = new com.google.common.collect.LinkedHashMultimap.ValueEntry[r1]
                r0.hashTable = r1
                return
        }

        public static /* synthetic */ com.google.common.collect.LinkedHashMultimap.ValueSetLink access$000(com.google.common.collect.LinkedHashMultimap.ValueSet r0) {
                com.google.common.collect.LinkedHashMultimap$ValueSetLink<K, V> r0 = r0.firstEntry
                return r0
        }

        public static /* synthetic */ int access$100(com.google.common.collect.LinkedHashMultimap.ValueSet r0) {
                int r0 = r0.modCount
                return r0
        }

        private int mask() {
                r1 = this;
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V>[] r0 = r1.hashTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                return r0
        }

        private void rehashIfNecessary() {
                r9 = this;
                int r0 = r9.size
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V>[] r1 = r9.hashTable
                int r2 = r1.length
                double r3 = (double) r0
                double r5 = (double) r2
                r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r7 = r7 * r5
                r0 = 1
                int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r5 <= 0) goto L16
                r3 = 1073741824(0x40000000, float:2.0)
                if (r2 >= r3) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                if (r2 == 0) goto L36
                int r1 = r1.length
                int r1 = r1 * 2
                com.google.common.collect.LinkedHashMultimap$ValueEntry[] r2 = new com.google.common.collect.LinkedHashMultimap.ValueEntry[r1]
                r9.hashTable = r2
                int r1 = r1 - r0
                com.google.common.collect.LinkedHashMultimap$ValueSetLink<K, V> r0 = r9.firstEntry
            L23:
                if (r0 == r9) goto L36
                r3 = r0
                com.google.common.collect.LinkedHashMultimap$ValueEntry r3 = (com.google.common.collect.LinkedHashMultimap.ValueEntry) r3
                int r4 = r3.smearedValueHash
                r4 = r4 & r1
                r5 = r2[r4]
                r3.nextInValueBucket = r5
                r2[r4] = r3
                com.google.common.collect.LinkedHashMultimap$ValueSetLink r0 = r0.getSuccessorInValueSet()
                goto L23
            L36:
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@com.google.common.collect.ParametricNullness V r6) {
                r5 = this;
                int r0 = com.google.common.collect.Hashing.smearedHash(r6)
                int r1 = r5.mask()
                r1 = r1 & r0
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V>[] r2 = r5.hashTable
                r2 = r2[r1]
                r3 = r2
            Le:
                if (r3 == 0) goto L1b
                boolean r4 = r3.matchesValue(r6, r0)
                if (r4 == 0) goto L18
                r6 = 0
                return r6
            L18:
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r3 = r3.nextInValueBucket
                goto Le
            L1b:
                com.google.common.collect.LinkedHashMultimap$ValueEntry r3 = new com.google.common.collect.LinkedHashMultimap$ValueEntry
                K r4 = r5.key
                r3.<init>(r4, r6, r0, r2)
                com.google.common.collect.LinkedHashMultimap$ValueSetLink<K, V> r6 = r5.lastEntry
                com.google.common.collect.LinkedHashMultimap.access$200(r6, r3)
                com.google.common.collect.LinkedHashMultimap.access$200(r3, r5)
                com.google.common.collect.LinkedHashMultimap r6 = r5.this$0
                com.google.common.collect.LinkedHashMultimap$ValueEntry r6 = com.google.common.collect.LinkedHashMultimap.access$300(r6)
                com.google.common.collect.LinkedHashMultimap$ValueEntry r6 = r6.getPredecessorInMultimap()
                com.google.common.collect.LinkedHashMultimap.access$400(r6, r3)
                com.google.common.collect.LinkedHashMultimap r6 = r5.this$0
                com.google.common.collect.LinkedHashMultimap$ValueEntry r6 = com.google.common.collect.LinkedHashMultimap.access$300(r6)
                com.google.common.collect.LinkedHashMultimap.access$400(r3, r6)
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V>[] r6 = r5.hashTable
                r6[r1] = r3
                int r6 = r5.size
                r0 = 1
                int r6 = r6 + r0
                r5.size = r6
                int r6 = r5.modCount
                int r6 = r6 + r0
                r5.modCount = r6
                r5.rehashIfNecessary()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r2 = this;
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V>[] r0 = r2.hashTable
                r1 = 0
                java.util.Arrays.fill(r0, r1)
                r0 = 0
                r2.size = r0
                com.google.common.collect.LinkedHashMultimap$ValueSetLink<K, V> r0 = r2.firstEntry
            Lb:
                if (r0 == r2) goto L18
                r1 = r0
                com.google.common.collect.LinkedHashMultimap$ValueEntry r1 = (com.google.common.collect.LinkedHashMultimap.ValueEntry) r1
                com.google.common.collect.LinkedHashMultimap.access$600(r1)
                com.google.common.collect.LinkedHashMultimap$ValueSetLink r0 = r0.getSuccessorInValueSet()
                goto Lb
            L18:
                com.google.common.collect.LinkedHashMultimap.access$200(r2, r2)
                int r0 = r2.modCount
                int r0 = r0 + 1
                r2.modCount = r0
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                int r0 = com.google.common.collect.Hashing.smearedHash(r4)
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V>[] r1 = r3.hashTable
                int r2 = r3.mask()
                r2 = r2 & r0
                r1 = r1[r2]
            Ld:
                if (r1 == 0) goto L1a
                boolean r2 = r1.matchesValue(r4, r0)
                if (r2 == 0) goto L17
                r4 = 1
                return r4
            L17:
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r1 = r1.nextInValueBucket
                goto Ld
            L1a:
                r4 = 0
                return r4
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> getPredecessorInValueSet() {
                r1 = this;
                com.google.common.collect.LinkedHashMultimap$ValueSetLink<K, V> r0 = r1.lastEntry
                return r0
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> getSuccessorInValueSet() {
                r1 = this;
                com.google.common.collect.LinkedHashMultimap$ValueSetLink<K, V> r0 = r1.firstEntry
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<V> iterator() {
                r1 = this;
                com.google.common.collect.LinkedHashMultimap$ValueSet$1 r0 = new com.google.common.collect.LinkedHashMultimap$ValueSet$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r7) {
                r6 = this;
                int r0 = com.google.common.collect.Hashing.smearedHash(r7)
                int r1 = r6.mask()
                r1 = r1 & r0
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V>[] r2 = r6.hashTable
                r2 = r2[r1]
                r3 = 0
            Le:
                if (r2 == 0) goto L3b
                boolean r4 = r2.matchesValue(r7, r0)
                if (r4 == 0) goto L35
                if (r3 != 0) goto L1f
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V>[] r7 = r6.hashTable
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r0 = r2.nextInValueBucket
                r7[r1] = r0
                goto L23
            L1f:
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r7 = r2.nextInValueBucket
                r3.nextInValueBucket = r7
            L23:
                com.google.common.collect.LinkedHashMultimap.access$500(r2)
                com.google.common.collect.LinkedHashMultimap.access$600(r2)
                int r7 = r6.size
                r0 = 1
                int r7 = r7 - r0
                r6.size = r7
                int r7 = r6.modCount
                int r7 = r7 + r0
                r6.modCount = r7
                return r0
            L35:
                com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r3 = r2.nextInValueBucket
                r5 = r3
                r3 = r2
                r2 = r5
                goto Le
            L3b:
                r7 = 0
                return r7
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setPredecessorInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> r1) {
                r0 = this;
                r0.lastEntry = r1
                return
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setSuccessorInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> r1) {
                r0 = this;
                r0.firstEntry = r1
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    public interface ValueSetLink<K, V> {
        com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> getPredecessorInValueSet();

        com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> getSuccessorInValueSet();

        void setPredecessorInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> r1);

        void setSuccessorInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> r1);
    }

    private LinkedHashMultimap(int r2, int r3) {
            r1 = this;
            com.google.common.collect.CompactLinkedHashMap r2 = com.google.common.collect.CompactLinkedHashMap.createWithExpectedSize(r2)
            r1.<init>(r2)
            r2 = 2
            r1.valueSetCapacity = r2
            java.lang.String r2 = "expectedValuesPerKey"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r3, r2)
            r1.valueSetCapacity = r3
            com.google.common.collect.LinkedHashMultimap$ValueEntry r2 = new com.google.common.collect.LinkedHashMultimap$ValueEntry
            r3 = 0
            r0 = 0
            r2.<init>(r3, r3, r0, r3)
            r1.multimapHeaderEntry = r2
            succeedsInMultimap(r2, r2)
            return
    }

    public static /* synthetic */ void access$200(com.google.common.collect.LinkedHashMultimap.ValueSetLink r0, com.google.common.collect.LinkedHashMultimap.ValueSetLink r1) {
            succeedsInValueSet(r0, r1)
            return
    }

    public static /* synthetic */ com.google.common.collect.LinkedHashMultimap.ValueEntry access$300(com.google.common.collect.LinkedHashMultimap r0) {
            com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r0 = r0.multimapHeaderEntry
            return r0
    }

    public static /* synthetic */ void access$400(com.google.common.collect.LinkedHashMultimap.ValueEntry r0, com.google.common.collect.LinkedHashMultimap.ValueEntry r1) {
            succeedsInMultimap(r0, r1)
            return
    }

    public static /* synthetic */ void access$500(com.google.common.collect.LinkedHashMultimap.ValueSetLink r0) {
            deleteFromValueSet(r0)
            return
    }

    public static /* synthetic */ void access$600(com.google.common.collect.LinkedHashMultimap.ValueEntry r0) {
            deleteFromMultimap(r0)
            return
    }

    public static <K, V> com.google.common.collect.LinkedHashMultimap<K, V> create() {
            com.google.common.collect.LinkedHashMultimap r0 = new com.google.common.collect.LinkedHashMultimap
            r1 = 16
            r2 = 2
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.LinkedHashMultimap<K, V> create(int r1, int r2) {
            com.google.common.collect.LinkedHashMultimap r0 = new com.google.common.collect.LinkedHashMultimap
            int r1 = com.google.common.collect.Maps.capacity(r1)
            int r2 = com.google.common.collect.Maps.capacity(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.LinkedHashMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> r2) {
            java.util.Set r0 = r2.keySet()
            int r0 = r0.size()
            r1 = 2
            com.google.common.collect.LinkedHashMultimap r0 = create(r0, r1)
            r0.putAll(r2)
            return r0
    }

    private static <K, V> void deleteFromMultimap(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> r1) {
            com.google.common.collect.LinkedHashMultimap$ValueEntry r0 = r1.getPredecessorInMultimap()
            com.google.common.collect.LinkedHashMultimap$ValueEntry r1 = r1.getSuccessorInMultimap()
            succeedsInMultimap(r0, r1)
            return
    }

    private static <K, V> void deleteFromValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> r1) {
            com.google.common.collect.LinkedHashMultimap$ValueSetLink r0 = r1.getPredecessorInValueSet()
            com.google.common.collect.LinkedHashMultimap$ValueSetLink r1 = r1.getSuccessorInValueSet()
            succeedsInValueSet(r0, r1)
            return
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r7) throws java.io.IOException, java.lang.ClassNotFoundException {
            r6 = this;
            r7.defaultReadObject()
            com.google.common.collect.LinkedHashMultimap$ValueEntry r0 = new com.google.common.collect.LinkedHashMultimap$ValueEntry
            r1 = 0
            r2 = 0
            r0.<init>(r1, r1, r2, r1)
            r6.multimapHeaderEntry = r0
            succeedsInMultimap(r0, r0)
            r0 = 2
            r6.valueSetCapacity = r0
            int r0 = r7.readInt()
            r1 = 12
            com.google.common.collect.CompactLinkedHashMap r1 = com.google.common.collect.CompactLinkedHashMap.createWithExpectedSize(r1)
            r3 = 0
        L1d:
            if (r3 >= r0) goto L2d
            java.lang.Object r4 = r7.readObject()
            java.util.Collection r5 = r6.createCollection(r4)
            r1.put(r4, r5)
            int r3 = r3 + 1
            goto L1d
        L2d:
            int r0 = r7.readInt()
        L31:
            if (r2 >= r0) goto L4c
            java.lang.Object r3 = r7.readObject()
            java.lang.Object r4 = r7.readObject()
            java.lang.Object r3 = r1.get(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Objects.requireNonNull(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r4)
            int r2 = r2 + 1
            goto L31
        L4c:
            r6.setMap(r1)
            return
    }

    private static <K, V> void succeedsInMultimap(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> r0, com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> r1) {
            r0.setSuccessorInMultimap(r1)
            r1.setPredecessorInMultimap(r0)
            return
    }

    private static <K, V> void succeedsInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> r0, com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> r1) {
            r0.setSuccessorInValueSet(r1)
            r1.setPredecessorInValueSet(r0)
            return
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r4) throws java.io.IOException {
            r3 = this;
            r4.defaultWriteObject()
            java.util.Set r0 = r3.keySet()
            int r0 = r0.size()
            r4.writeInt(r0)
            java.util.Set r0 = r3.keySet()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            r4.writeObject(r1)
            goto L16
        L24:
            int r0 = r3.size()
            r4.writeInt(r0)
            java.util.Set r0 = r3.entries()
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r4.writeObject(r2)
            java.lang.Object r1 = r1.getValue()
            r4.writeObject(r1)
            goto L33
        L4e:
            return
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Map asMap() {
            r1 = this;
            java.util.Map r0 = super.asMap()
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public void clear() {
            r1 = this;
            super.clear()
            com.google.common.collect.LinkedHashMultimap$ValueEntry<K, V> r0 = r1.multimapHeaderEntry
            succeedsInMultimap(r0, r0)
            return
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.containsEntry(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsKey(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsValue(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final java.util.Collection createCollection() {
            r1 = this;
            int r0 = r1.valueSetCapacity
            com.google.common.collect.CompactLinkedHashSet r0 = com.google.common.collect.CompactLinkedHashSet.createWithExpectedSize(r0)
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final java.util.Collection<V> createCollection(@com.google.common.collect.ParametricNullness K r3) {
            r2 = this;
            com.google.common.collect.LinkedHashMultimap$ValueSet r0 = new com.google.common.collect.LinkedHashMultimap$ValueSet
            int r1 = r2.valueSetCapacity
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final java.util.Set<V> createCollection() {
            r1 = this;
            int r0 = r1.valueSetCapacity
            com.google.common.collect.CompactLinkedHashSet r0 = com.google.common.collect.CompactLinkedHashSet.createWithExpectedSize(r0)
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection entries() {
            r1 = this;
            java.util.Set r0 = r1.entries()
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Set<java.util.Map.Entry<K, V>> entries() {
            r1 = this;
            java.util.Set r0 = super.entries()
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    public final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            r1 = this;
            com.google.common.collect.LinkedHashMultimap$1 r0 = new com.google.common.collect.LinkedHashMultimap$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Set get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.get(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
            r1 = this;
            boolean r0 = super.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = super.keySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset keys() {
            r1 = this;
            com.google.common.collect.Multiset r0 = super.keys()
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(@com.google.common.collect.ParametricNullness java.lang.Object r1, @com.google.common.collect.ParametricNullness java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.put(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(com.google.common.collect.Multimap r1) {
            r0 = this;
            boolean r1 = super.putAll(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            boolean r1 = super.putAll(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.remove(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Set removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.Set r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.Set<V> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.util.Set r1 = super.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int size() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    public final java.util.Iterator<V> valueIterator() {
            r2 = this;
            com.google.common.collect.LinkedHashMultimap$1 r0 = new com.google.common.collect.LinkedHashMultimap$1
            r0.<init>(r2)
            com.google.common.collect.Maps$2 r1 = new com.google.common.collect.Maps$2
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }
}
