package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
class CompactHashMap<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    private static final java.lang.Object NOT_FOUND = null;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public transient int[] entries;

    @javax.annotation.CheckForNull
    private transient java.util.Set<java.util.Map.Entry<K, V>> entrySetView;

    @javax.annotation.CheckForNull
    private transient java.util.Set<K> keySetView;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public transient java.lang.Object[] keys;
    private transient int metadata;
    private transient int size;

    @javax.annotation.CheckForNull
    private transient java.lang.Object table;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public transient java.lang.Object[] values;

    @javax.annotation.CheckForNull
    private transient java.util.Collection<V> valuesView;




    /* JADX INFO: loaded from: classes.dex */
    public class EntrySetView extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        public final /* synthetic */ com.google.common.collect.CompactHashMap this$0;

        public EntrySetView(com.google.common.collect.CompactHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                com.google.common.collect.CompactHashMap r0 = r3.this$0
                java.util.Map r0 = r0.delegateOrNull()
                if (r0 == 0) goto L11
                java.util.Set r0 = r0.entrySet()
                boolean r4 = r0.contains(r4)
                return r4
            L11:
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L36
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                com.google.common.collect.CompactHashMap r0 = r3.this$0
                java.lang.Object r2 = r4.getKey()
                int r0 = com.google.common.collect.CompactHashMap.access$500(r0, r2)
                r2 = -1
                if (r0 == r2) goto L36
                com.google.common.collect.CompactHashMap r2 = r3.this$0
                java.lang.Object r0 = com.google.common.collect.CompactHashMap.access$600(r2, r0)
                java.lang.Object r4 = r4.getValue()
                boolean r4 = com.google.common.base.Objects.equal(r0, r4)
                if (r4 == 0) goto L36
                r1 = 1
            L36:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                java.util.Iterator r0 = r0.entrySetIterator()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r10) {
                r9 = this;
                com.google.common.collect.CompactHashMap r0 = r9.this$0
                java.util.Map r0 = r0.delegateOrNull()
                if (r0 == 0) goto L11
                java.util.Set r0 = r0.entrySet()
                boolean r10 = r0.remove(r10)
                return r10
            L11:
                boolean r0 = r10 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L61
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                com.google.common.collect.CompactHashMap r0 = r9.this$0
                boolean r0 = r0.needsAllocArrays()
                if (r0 == 0) goto L21
                return r1
            L21:
                com.google.common.collect.CompactHashMap r0 = r9.this$0
                int r0 = com.google.common.collect.CompactHashMap.access$700(r0)
                java.lang.Object r2 = r10.getKey()
                java.lang.Object r3 = r10.getValue()
                com.google.common.collect.CompactHashMap r10 = r9.this$0
                java.lang.Object r5 = com.google.common.collect.CompactHashMap.access$800(r10)
                com.google.common.collect.CompactHashMap r10 = r9.this$0
                int[] r6 = com.google.common.collect.CompactHashMap.access$900(r10)
                com.google.common.collect.CompactHashMap r10 = r9.this$0
                java.lang.Object[] r7 = com.google.common.collect.CompactHashMap.access$1000(r10)
                com.google.common.collect.CompactHashMap r10 = r9.this$0
                java.lang.Object[] r8 = com.google.common.collect.CompactHashMap.access$1100(r10)
                r4 = r0
                int r10 = com.google.common.collect.CompactHashing.remove(r2, r3, r4, r5, r6, r7, r8)
                r2 = -1
                if (r10 != r2) goto L50
                return r1
            L50:
                com.google.common.collect.CompactHashMap r1 = r9.this$0
                r1.moveLastEntry(r10, r0)
                com.google.common.collect.CompactHashMap r10 = r9.this$0
                com.google.common.collect.CompactHashMap.access$1210(r10)
                com.google.common.collect.CompactHashMap r10 = r9.this$0
                r10.incrementModCount()
                r10 = 1
                return r10
            L61:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    public abstract class Itr<T> implements java.util.Iterator<T> {
        public int currentIndex;
        public int expectedMetadata;
        public int indexToRemove;
        public final /* synthetic */ com.google.common.collect.CompactHashMap this$0;

        private Itr(com.google.common.collect.CompactHashMap r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                int r0 = com.google.common.collect.CompactHashMap.access$000(r2)
                r1.expectedMetadata = r0
                int r2 = r2.firstEntryIndex()
                r1.currentIndex = r2
                r2 = -1
                r1.indexToRemove = r2
                return
        }

        public /* synthetic */ Itr(com.google.common.collect.CompactHashMap r1, com.google.common.collect.CompactHashMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void checkForConcurrentModification() {
                r2 = this;
                com.google.common.collect.CompactHashMap r0 = r2.this$0
                int r0 = com.google.common.collect.CompactHashMap.access$000(r0)
                int r1 = r2.expectedMetadata
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        @com.google.common.collect.ParametricNullness
        public abstract T getOutput(int r1);

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                int r0 = r1.currentIndex
                if (r0 < 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public T next() {
                r3 = this;
                r3.checkForConcurrentModification()
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L1c
                int r0 = r3.currentIndex
                r3.indexToRemove = r0
                java.lang.Object r0 = r3.getOutput(r0)
                com.google.common.collect.CompactHashMap r1 = r3.this$0
                int r2 = r3.currentIndex
                int r1 = r1.getSuccessor(r2)
                r3.currentIndex = r1
                return r0
            L1c:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                r3.checkForConcurrentModification()
                int r0 = r3.indexToRemove
                if (r0 < 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                com.google.common.collect.CollectPreconditions.checkRemove(r0)
                int r0 = r3.expectedMetadata
                int r0 = r0 + 32
                r3.expectedMetadata = r0
                com.google.common.collect.CompactHashMap r0 = r3.this$0
                int r1 = r3.indexToRemove
                java.lang.Object r1 = com.google.common.collect.CompactHashMap.access$100(r0, r1)
                r0.remove(r1)
                com.google.common.collect.CompactHashMap r0 = r3.this$0
                int r1 = r3.currentIndex
                int r2 = r3.indexToRemove
                int r0 = r0.adjustAfterRemove(r1, r2)
                r3.currentIndex = r0
                r0 = -1
                r3.indexToRemove = r0
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class KeySetView extends java.util.AbstractSet<K> {
        public final /* synthetic */ com.google.common.collect.CompactHashMap this$0;

        public KeySetView(com.google.common.collect.CompactHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r2 = this;
                com.google.common.collect.CompactHashMap r0 = r2.this$0
                java.util.Map r1 = r0.delegateOrNull()
                if (r1 == 0) goto L11
                java.util.Set r0 = r1.keySet()
                java.util.Iterator r0 = r0.iterator()
                goto L17
            L11:
                com.google.common.collect.CompactHashMap$1 r1 = new com.google.common.collect.CompactHashMap$1
                r1.<init>(r0)
                r0 = r1
            L17:
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                java.util.Map r0 = r0.delegateOrNull()
                if (r0 == 0) goto L11
                java.util.Set r0 = r0.keySet()
                boolean r2 = r0.remove(r2)
                goto L20
            L11:
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                java.lang.Object r2 = com.google.common.collect.CompactHashMap.access$200(r0, r2)
                java.lang.Object r0 = com.google.common.collect.CompactHashMap.access$300()
                if (r2 == r0) goto L1f
                r2 = 1
                goto L20
            L1f:
                r2 = 0
            L20:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class MapEntry extends com.google.common.collect.AbstractMapEntry<K, V> {

        @com.google.common.collect.ParametricNullness
        private final K key;
        private int lastKnownIndex;
        public final /* synthetic */ com.google.common.collect.CompactHashMap this$0;

        public MapEntry(com.google.common.collect.CompactHashMap r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.collect.CompactHashMap.access$100(r1, r2)
                r0.key = r1
                r0.lastKnownIndex = r2
                return
        }

        private void updateLastKnownIndex() {
                r3 = this;
                int r0 = r3.lastKnownIndex
                r1 = -1
                if (r0 == r1) goto L1d
                com.google.common.collect.CompactHashMap r1 = r3.this$0
                int r1 = r1.size()
                if (r0 >= r1) goto L1d
                K r0 = r3.key
                com.google.common.collect.CompactHashMap r1 = r3.this$0
                int r2 = r3.lastKnownIndex
                java.lang.Object r1 = com.google.common.collect.CompactHashMap.access$100(r1, r2)
                boolean r0 = com.google.common.base.Objects.equal(r0, r1)
                if (r0 != 0) goto L27
            L1d:
                com.google.common.collect.CompactHashMap r0 = r3.this$0
                K r1 = r3.key
                int r0 = com.google.common.collect.CompactHashMap.access$500(r0, r1)
                r3.lastKnownIndex = r0
            L27:
                return
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public V getValue() {
                r2 = this;
                com.google.common.collect.CompactHashMap r0 = r2.this$0
                java.util.Map r0 = r0.delegateOrNull()
                if (r0 == 0) goto Lf
                K r1 = r2.key
                java.lang.Object r0 = r0.get(r1)
                return r0
            Lf:
                r2.updateLastKnownIndex()
                int r0 = r2.lastKnownIndex
                r1 = -1
                if (r0 != r1) goto L19
                r0 = 0
                goto L1f
            L19:
                com.google.common.collect.CompactHashMap r1 = r2.this$0
                java.lang.Object r0 = com.google.common.collect.CompactHashMap.access$600(r1, r0)
            L1f:
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public V setValue(@com.google.common.collect.ParametricNullness V r4) {
                r3 = this;
                com.google.common.collect.CompactHashMap r0 = r3.this$0
                java.util.Map r0 = r0.delegateOrNull()
                if (r0 == 0) goto Lf
                K r1 = r3.key
                java.lang.Object r4 = r0.put(r1, r4)
                return r4
            Lf:
                r3.updateLastKnownIndex()
                int r0 = r3.lastKnownIndex
                r1 = -1
                if (r0 != r1) goto L20
                com.google.common.collect.CompactHashMap r0 = r3.this$0
                K r1 = r3.key
                r0.put(r1, r4)
                r4 = 0
                return r4
            L20:
                com.google.common.collect.CompactHashMap r1 = r3.this$0
                java.lang.Object r0 = com.google.common.collect.CompactHashMap.access$600(r1, r0)
                com.google.common.collect.CompactHashMap r1 = r3.this$0
                int r2 = r3.lastKnownIndex
                com.google.common.collect.CompactHashMap.access$1300(r1, r2, r4)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ValuesView extends java.util.AbstractCollection<V> {
        public final /* synthetic */ com.google.common.collect.CompactHashMap this$0;

        public ValuesView(com.google.common.collect.CompactHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r2 = this;
                com.google.common.collect.CompactHashMap r0 = r2.this$0
                java.util.Map r1 = r0.delegateOrNull()
                if (r1 == 0) goto L11
                java.util.Collection r0 = r1.values()
                java.util.Iterator r0 = r0.iterator()
                goto L17
            L11:
                com.google.common.collect.CompactHashMap$3 r1 = new com.google.common.collect.CompactHashMap$3
                r1.<init>(r0)
                r0 = r1
            L17:
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                com.google.common.collect.CompactHashMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.common.collect.CompactHashMap.NOT_FOUND = r0
            return
    }

    public CompactHashMap() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.init(r0)
            return
    }

    public CompactHashMap(int r1) {
            r0 = this;
            r0.<init>()
            r0.init(r1)
            return
    }

    public static /* synthetic */ int access$000(com.google.common.collect.CompactHashMap r0) {
            int r0 = r0.metadata
            return r0
    }

    public static /* synthetic */ java.lang.Object access$100(com.google.common.collect.CompactHashMap r0, int r1) {
            java.lang.Object r0 = r0.key(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Object[] access$1000(com.google.common.collect.CompactHashMap r0) {
            java.lang.Object[] r0 = r0.requireKeys()
            return r0
    }

    public static /* synthetic */ java.lang.Object[] access$1100(com.google.common.collect.CompactHashMap r0) {
            java.lang.Object[] r0 = r0.requireValues()
            return r0
    }

    public static /* synthetic */ int access$1210(com.google.common.collect.CompactHashMap r2) {
            int r0 = r2.size
            int r1 = r0 + (-1)
            r2.size = r1
            return r0
    }

    public static /* synthetic */ void access$1300(com.google.common.collect.CompactHashMap r0, int r1, java.lang.Object r2) {
            r0.setValue(r1, r2)
            return
    }

    public static /* synthetic */ java.lang.Object access$200(com.google.common.collect.CompactHashMap r0, java.lang.Object r1) {
            java.lang.Object r0 = r0.removeHelper(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Object access$300() {
            java.lang.Object r0 = com.google.common.collect.CompactHashMap.NOT_FOUND
            return r0
    }

    public static /* synthetic */ int access$500(com.google.common.collect.CompactHashMap r0, java.lang.Object r1) {
            int r0 = r0.indexOf(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Object access$600(com.google.common.collect.CompactHashMap r0, int r1) {
            java.lang.Object r0 = r0.value(r1)
            return r0
    }

    public static /* synthetic */ int access$700(com.google.common.collect.CompactHashMap r0) {
            int r0 = r0.hashTableMask()
            return r0
    }

    public static /* synthetic */ java.lang.Object access$800(com.google.common.collect.CompactHashMap r0) {
            java.lang.Object r0 = r0.requireTable()
            return r0
    }

    public static /* synthetic */ int[] access$900(com.google.common.collect.CompactHashMap r0) {
            int[] r0 = r0.requireEntries()
            return r0
    }

    public static <K, V> com.google.common.collect.CompactHashMap<K, V> create() {
            com.google.common.collect.CompactHashMap r0 = new com.google.common.collect.CompactHashMap
            r0.<init>()
            return r0
    }

    public static <K, V> com.google.common.collect.CompactHashMap<K, V> createWithExpectedSize(int r1) {
            com.google.common.collect.CompactHashMap r0 = new com.google.common.collect.CompactHashMap
            r0.<init>(r1)
            return r0
    }

    private int entry(int r2) {
            r1 = this;
            int[] r0 = r1.requireEntries()
            r2 = r0[r2]
            return r2
    }

    private int hashTableMask() {
            r2 = this;
            int r0 = r2.metadata
            r0 = r0 & 31
            r1 = 1
            int r0 = r1 << r0
            int r0 = r0 - r1
            return r0
    }

    private int indexOf(@javax.annotation.CheckForNull java.lang.Object r8) {
            r7 = this;
            boolean r0 = r7.needsAllocArrays()
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = com.google.common.collect.Hashing.smearedHash(r8)
            int r2 = r7.hashTableMask()
            java.lang.Object r3 = r7.requireTable()
            r4 = r0 & r2
            int r3 = com.google.common.collect.CompactHashing.tableGet(r3, r4)
            if (r3 != 0) goto L1d
            return r1
        L1d:
            int r4 = ~r2
            r0 = r0 & r4
        L1f:
            int r3 = r3 + (-1)
            int r5 = r7.entry(r3)
            r6 = r5 & r4
            if (r6 != r0) goto L34
            java.lang.Object r6 = r7.key(r3)
            boolean r6 = com.google.common.base.Objects.equal(r8, r6)
            if (r6 == 0) goto L34
            return r3
        L34:
            r3 = r5 & r2
            if (r3 != 0) goto L1f
            return r1
    }

    private K key(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.requireKeys()
            r2 = r0[r2]
            return r2
    }

    private void readObject(java.io.ObjectInputStream r5) throws java.io.IOException, java.lang.ClassNotFoundException {
            r4 = this;
            r5.defaultReadObject()
            int r0 = r5.readInt()
            if (r0 < 0) goto L1e
            r4.init(r0)
            r1 = 0
        Ld:
            if (r1 >= r0) goto L1d
            java.lang.Object r2 = r5.readObject()
            java.lang.Object r3 = r5.readObject()
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto Ld
        L1d:
            return
        L1e:
            java.io.InvalidObjectException r5 = new java.io.InvalidObjectException
            r1 = 25
            java.lang.String r2 = "Invalid size: "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0)
            r5.<init>(r0)
            throw r5
    }

    private java.lang.Object removeHelper(@javax.annotation.CheckForNull java.lang.Object r9) {
            r8 = this;
            boolean r0 = r8.needsAllocArrays()
            if (r0 == 0) goto L9
            java.lang.Object r9 = com.google.common.collect.CompactHashMap.NOT_FOUND
            return r9
        L9:
            int r7 = r8.hashTableMask()
            r1 = 0
            java.lang.Object r3 = r8.requireTable()
            int[] r4 = r8.requireEntries()
            java.lang.Object[] r5 = r8.requireKeys()
            r6 = 0
            r0 = r9
            r2 = r7
            int r9 = com.google.common.collect.CompactHashing.remove(r0, r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r9 != r0) goto L27
            java.lang.Object r9 = com.google.common.collect.CompactHashMap.NOT_FOUND
            return r9
        L27:
            java.lang.Object r0 = r8.value(r9)
            r8.moveLastEntry(r9, r7)
            int r9 = r8.size
            int r9 = r9 + (-1)
            r8.size = r9
            r8.incrementModCount()
            return r0
    }

    private int[] requireEntries() {
            r1 = this;
            int[] r0 = r1.entries
            java.util.Objects.requireNonNull(r0)
            int[] r0 = (int[]) r0
            return r0
    }

    private java.lang.Object[] requireKeys() {
            r1 = this;
            java.lang.Object[] r0 = r1.keys
            java.util.Objects.requireNonNull(r0)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    private java.lang.Object requireTable() {
            r1 = this;
            java.lang.Object r0 = r1.table
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    private java.lang.Object[] requireValues() {
            r1 = this;
            java.lang.Object[] r0 = r1.values
            java.util.Objects.requireNonNull(r0)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    private void resizeMeMaybe(int r4) {
            r3 = this;
            int[] r0 = r3.requireEntries()
            int r0 = r0.length
            if (r4 <= r0) goto L1c
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            int r1 = r0 >>> 1
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)
            int r1 = r1 + r0
            r1 = r1 | r2
            int r4 = java.lang.Math.min(r4, r1)
            if (r4 == r0) goto L1c
            r3.resizeEntries(r4)
        L1c:
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private int resizeTable(int r9, int r10, int r11, int r12) {
            r8 = this;
            java.lang.Object r0 = com.google.common.collect.CompactHashing.createTable(r10)
            int r10 = r10 + (-1)
            if (r12 == 0) goto Le
            r11 = r11 & r10
            int r12 = r12 + 1
            com.google.common.collect.CompactHashing.tableSet(r0, r11, r12)
        Le:
            java.lang.Object r11 = r8.requireTable()
            int[] r12 = r8.requireEntries()
            r1 = 0
        L17:
            if (r1 > r9) goto L3c
            int r2 = com.google.common.collect.CompactHashing.tableGet(r11, r1)
        L1d:
            if (r2 == 0) goto L39
            int r3 = r2 + (-1)
            r4 = r12[r3]
            int r5 = ~r9
            r5 = r5 & r4
            r5 = r5 | r1
            r6 = r5 & r10
            int r7 = com.google.common.collect.CompactHashing.tableGet(r0, r6)
            com.google.common.collect.CompactHashing.tableSet(r0, r6, r2)
            int r2 = ~r10
            r2 = r2 & r5
            r5 = r7 & r10
            r2 = r2 | r5
            r12[r3] = r2
            r2 = r4 & r9
            goto L1d
        L39:
            int r1 = r1 + 1
            goto L17
        L3c:
            r8.table = r0
            r8.setHashTableMask(r10)
            return r10
    }

    private void setEntry(int r2, int r3) {
            r1 = this;
            int[] r0 = r1.requireEntries()
            r0[r2] = r3
            return
    }

    private void setHashTableMask(int r2) {
            r1 = this;
            int r2 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r2 = 32 - r2
            int r0 = r1.metadata
            r0 = r0 & (-32)
            r2 = r2 & 31
            r2 = r2 | r0
            r1.metadata = r2
            return
    }

    private void setKey(int r2, K r3) {
            r1 = this;
            java.lang.Object[] r0 = r1.requireKeys()
            r0[r2] = r3
            return
    }

    private void setValue(int r2, V r3) {
            r1 = this;
            java.lang.Object[] r0 = r1.requireValues()
            r0[r2] = r3
            return
    }

    private V value(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.requireValues()
            r2 = r0[r2]
            return r2
    }

    private void writeObject(java.io.ObjectOutputStream r4) throws java.io.IOException {
            r3 = this;
            r4.defaultWriteObject()
            int r0 = r3.size()
            r4.writeInt(r0)
            java.util.Iterator r0 = r3.entrySetIterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r4.writeObject(r2)
            java.lang.Object r1 = r1.getValue()
            r4.writeObject(r1)
            goto Le
        L29:
            return
    }

    public void accessEntry(int r1) {
            r0 = this;
            return
    }

    public int adjustAfterRemove(int r1, int r2) {
            r0 = this;
            int r1 = r1 + (-1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int allocArrays() {
            r3 = this;
            boolean r0 = r3.needsAllocArrays()
            java.lang.String r1 = "Arrays already allocated"
            com.google.common.base.Preconditions.checkState(r0, r1)
            int r0 = r3.metadata
            int r1 = com.google.common.collect.CompactHashing.tableSize(r0)
            java.lang.Object r2 = com.google.common.collect.CompactHashing.createTable(r1)
            r3.table = r2
            int r1 = r1 + (-1)
            r3.setHashTableMask(r1)
            int[] r1 = new int[r0]
            r3.entries = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r3.keys = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r3.values = r1
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r6 = this;
            boolean r0 = r6.needsAllocArrays()
            if (r0 == 0) goto L7
            return
        L7:
            r6.incrementModCount()
            java.util.Map r0 = r6.delegateOrNull()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L28
            int r3 = r6.size()
            r4 = 3
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            int r3 = com.google.common.primitives.Ints.constrainToRange(r3, r4, r5)
            r6.metadata = r3
            r0.clear()
            r6.table = r1
            r6.size = r2
            goto L4c
        L28:
            java.lang.Object[] r0 = r6.requireKeys()
            int r3 = r6.size
            java.util.Arrays.fill(r0, r2, r3, r1)
            java.lang.Object[] r0 = r6.requireValues()
            int r3 = r6.size
            java.util.Arrays.fill(r0, r2, r3, r1)
            java.lang.Object r0 = r6.requireTable()
            com.google.common.collect.CompactHashing.tableClear(r0)
            int[] r0 = r6.requireEntries()
            int r1 = r6.size
            java.util.Arrays.fill(r0, r2, r1, r2)
            r6.size = r2
        L4c:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.delegateOrNull()
            if (r0 == 0) goto Lb
            boolean r2 = r0.containsKey(r2)
            goto L15
        Lb:
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            java.util.Map r0 = r3.delegateOrNull()
            if (r0 == 0) goto Lb
            boolean r4 = r0.containsValue(r4)
            return r4
        Lb:
            r0 = 0
            r1 = 0
        Ld:
            int r2 = r3.size
            if (r1 >= r2) goto L20
            java.lang.Object r2 = r3.value(r1)
            boolean r2 = com.google.common.base.Objects.equal(r4, r2)
            if (r2 == 0) goto L1d
            r4 = 1
            return r4
        L1d:
            int r1 = r1 + 1
            goto Ld
        L20:
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.Map<K, V> convertToHashFloodingResistantImplementation() {
            r4 = this;
            int r0 = r4.hashTableMask()
            int r0 = r0 + 1
            java.util.Map r0 = r4.createHashFloodingResistantDelegate(r0)
            int r1 = r4.firstEntryIndex()
        Le:
            if (r1 < 0) goto L20
            java.lang.Object r2 = r4.key(r1)
            java.lang.Object r3 = r4.value(r1)
            r0.put(r2, r3)
            int r1 = r4.getSuccessor(r1)
            goto Le
        L20:
            r4.table = r0
            r1 = 0
            r4.entries = r1
            r4.keys = r1
            r4.values = r1
            r4.incrementModCount()
            return r0
    }

    public java.util.Map<K, V> createHashFloodingResistantDelegate(int r3) {
            r2 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r3, r1)
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public final java.util.Map<K, V> delegateOrNull() {
            r2 = this;
            java.lang.Object r0 = r2.table
            boolean r1 = r0 instanceof java.util.Map
            if (r1 == 0) goto L9
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.entrySetView
            if (r0 != 0) goto Lb
            com.google.common.collect.CompactHashMap$EntrySetView r0 = new com.google.common.collect.CompactHashMap$EntrySetView
            r0.<init>(r1)
            r1.entrySetView = r0
        Lb:
            return r0
    }

    public final java.util.Iterator<java.util.Map.Entry<K, V>> entrySetIterator() {
            r1 = this;
            java.util.Map r0 = r1.delegateOrNull()
            if (r0 == 0) goto Lf
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
        Lf:
            com.google.common.collect.CompactHashMap$2 r0 = new com.google.common.collect.CompactHashMap$2
            r0.<init>(r1)
            return r0
    }

    public int firstEntryIndex() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.delegateOrNull()
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r0.get(r2)
            return r2
        Lb:
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L14
            r2 = 0
            return r2
        L14:
            r1.accessEntry(r2)
            java.lang.Object r2 = r1.value(r2)
            return r2
    }

    public int getSuccessor(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int r0 = r1.size
            if (r2 >= r0) goto L7
            goto L8
        L7:
            r2 = -1
        L8:
            return r2
    }

    public final void incrementModCount() {
            r1 = this;
            int r0 = r1.metadata
            int r0 = r0 + 32
            r1.metadata = r0
            return
    }

    public void init(int r4) {
            r3 = this;
            r0 = 1
            if (r4 < 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.String r2 = "Expected size must be >= 0"
            com.google.common.base.Preconditions.checkArgument(r1, r2)
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            int r4 = com.google.common.primitives.Ints.constrainToRange(r4, r0, r1)
            r3.metadata = r4
            return
    }

    public void insertEntry(int r2, @com.google.common.collect.ParametricNullness K r3, @com.google.common.collect.ParametricNullness V r4, int r5, int r6) {
            r1 = this;
            int r0 = ~r6
            r5 = r5 & r0
            r0 = 0
            r6 = r6 & r0
            r5 = r5 | r6
            r1.setEntry(r2, r5)
            r1.setKey(r2, r3)
            r1.setValue(r2, r4)
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
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

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set<K> r0 = r1.keySetView
            if (r0 != 0) goto Lb
            com.google.common.collect.CompactHashMap$KeySetView r0 = new com.google.common.collect.CompactHashMap$KeySetView
            r0.<init>(r1)
            r1.keySetView = r0
        Lb:
            return r0
    }

    public void moveLastEntry(int r10, int r11) {
            r9 = this;
            java.lang.Object r0 = r9.requireTable()
            int[] r1 = r9.requireEntries()
            java.lang.Object[] r2 = r9.requireKeys()
            java.lang.Object[] r3 = r9.requireValues()
            int r4 = r9.size()
            int r4 = r4 + (-1)
            r5 = 0
            r6 = 0
            if (r10 >= r4) goto L52
            r7 = r2[r4]
            r2[r10] = r7
            r8 = r3[r4]
            r3[r10] = r8
            r2[r4] = r6
            r3[r4] = r6
            r2 = r1[r4]
            r1[r10] = r2
            r1[r4] = r5
            int r2 = com.google.common.collect.Hashing.smearedHash(r7)
            r2 = r2 & r11
            int r3 = com.google.common.collect.CompactHashing.tableGet(r0, r2)
            int r4 = r4 + 1
            if (r3 != r4) goto L3f
            int r10 = r10 + 1
            com.google.common.collect.CompactHashing.tableSet(r0, r2, r10)
            goto L58
        L3f:
            int r3 = r3 + (-1)
            r0 = r1[r3]
            r2 = r0 & r11
            if (r2 != r4) goto L50
            int r10 = r10 + 1
            int r2 = ~r11
            r0 = r0 & r2
            r10 = r10 & r11
            r10 = r10 | r0
            r1[r3] = r10
            goto L58
        L50:
            r3 = r2
            goto L3f
        L52:
            r2[r10] = r6
            r3[r10] = r6
            r1[r10] = r5
        L58:
            return
    }

    @com.google.common.annotations.VisibleForTesting
    public final boolean needsAllocArrays() {
            r1 = this;
            java.lang.Object r0 = r1.table
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V put(@com.google.common.collect.ParametricNullness K r18, @com.google.common.collect.ParametricNullness V r19) {
            r17 = this;
            r6 = r17
            r2 = r18
            r3 = r19
            boolean r0 = r17.needsAllocArrays()
            if (r0 == 0) goto Lf
            r17.allocArrays()
        Lf:
            java.util.Map r0 = r17.delegateOrNull()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r0.put(r2, r3)
            return r0
        L1a:
            int[] r0 = r17.requireEntries()
            java.lang.Object[] r1 = r17.requireKeys()
            java.lang.Object[] r4 = r17.requireValues()
            int r5 = r6.size
            int r7 = r5 + 1
            int r8 = com.google.common.collect.Hashing.smearedHash(r18)
            int r9 = r17.hashTableMask()
            r10 = r8 & r9
            java.lang.Object r11 = r17.requireTable()
            int r11 = com.google.common.collect.CompactHashing.tableGet(r11, r10)
            if (r11 != 0) goto L52
            if (r7 <= r9) goto L4a
            int r0 = com.google.common.collect.CompactHashing.newCapacity(r9)
            int r0 = r6.resizeTable(r9, r0, r8, r5)
        L48:
            r9 = r0
            goto L93
        L4a:
            java.lang.Object r0 = r17.requireTable()
            com.google.common.collect.CompactHashing.tableSet(r0, r10, r7)
            goto L93
        L52:
            int r10 = ~r9
            r12 = r8 & r10
            r13 = 0
        L56:
            int r11 = r11 + (-1)
            r14 = r0[r11]
            r15 = r14 & r10
            r16 = r10
            if (r15 != r12) goto L70
            r10 = r1[r11]
            boolean r10 = com.google.common.base.Objects.equal(r2, r10)
            if (r10 == 0) goto L70
            r0 = r4[r11]
            r4[r11] = r3
            r6.accessEntry(r11)
            return r0
        L70:
            r10 = r14 & r9
            int r13 = r13 + 1
            if (r10 != 0) goto La9
            r1 = 9
            if (r13 < r1) goto L83
            java.util.Map r0 = r17.convertToHashFloodingResistantImplementation()
            java.lang.Object r0 = r0.put(r2, r3)
            return r0
        L83:
            if (r7 <= r9) goto L8e
            int r0 = com.google.common.collect.CompactHashing.newCapacity(r9)
            int r0 = r6.resizeTable(r9, r0, r8, r5)
            goto L48
        L8e:
            r1 = r7 & r9
            r1 = r1 | r15
            r0[r11] = r1
        L93:
            r6.resizeMeMaybe(r7)
            r0 = r17
            r1 = r5
            r2 = r18
            r3 = r19
            r4 = r8
            r5 = r9
            r0.insertEntry(r1, r2, r3, r4, r5)
            r6.size = r7
            r17.incrementModCount()
            r0 = 0
            return r0
        La9:
            r11 = r10
            r10 = r16
            goto L56
    }

    @Override // java.util.AbstractMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.delegateOrNull()
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r0.remove(r2)
            return r2
        Lb:
            java.lang.Object r2 = r1.removeHelper(r2)
            java.lang.Object r0 = com.google.common.collect.CompactHashMap.NOT_FOUND
            if (r2 != r0) goto L14
            r2 = 0
        L14:
            return r2
    }

    public void resizeEntries(int r2) {
            r1 = this;
            int[] r0 = r1.requireEntries()
            int[] r0 = java.util.Arrays.copyOf(r0, r2)
            r1.entries = r0
            java.lang.Object[] r0 = r1.requireKeys()
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            r1.keys = r0
            java.lang.Object[] r0 = r1.requireValues()
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            r1.values = r2
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r1 = this;
            java.util.Map r0 = r1.delegateOrNull()
            if (r0 == 0) goto Lb
            int r0 = r0.size()
            goto Ld
        Lb:
            int r0 = r1.size
        Ld:
            return r0
    }

    public void trimToSize() {
            r3 = this;
            boolean r0 = r3.needsAllocArrays()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.Map r0 = r3.delegateOrNull()
            if (r0 == 0) goto L1b
            int r1 = r3.size()
            java.util.Map r1 = r3.createHashFloodingResistantDelegate(r1)
            r1.putAll(r0)
            r3.table = r1
            return
        L1b:
            int r0 = r3.size
            int[] r1 = r3.requireEntries()
            int r1 = r1.length
            if (r0 >= r1) goto L27
            r3.resizeEntries(r0)
        L27:
            int r0 = com.google.common.collect.CompactHashing.tableSize(r0)
            int r1 = r3.hashTableMask()
            if (r0 >= r1) goto L35
            r2 = 0
            r3.resizeTable(r1, r0, r2, r2)
        L35:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection<V> r0 = r1.valuesView
            if (r0 != 0) goto Lb
            com.google.common.collect.CompactHashMap$ValuesView r0 = new com.google.common.collect.CompactHashMap$ValuesView
            r0.<init>(r1)
            r1.valuesView = r0
        Lb:
            return r0
    }
}
