package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkedHashTreeMap<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    private static final java.util.Comparator<java.lang.Comparable> NATURAL_ORDER = null;
    public java.util.Comparator<? super K> comparator;
    private com.google.gson.internal.LinkedHashTreeMap<K, V>.EntrySet entrySet;
    public final com.google.gson.internal.LinkedHashTreeMap.Node<K, V> header;
    private com.google.gson.internal.LinkedHashTreeMap<K, V>.KeySet keySet;
    public int modCount;
    public int size;
    public com.google.gson.internal.LinkedHashTreeMap.Node<K, V>[] table;
    public int threshold;


    public static final class AvlBuilder<K, V> {
        private int leavesSkipped;
        private int leavesToSkip;
        private int size;
        private com.google.gson.internal.LinkedHashTreeMap.Node<K, V> stack;

        public AvlBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        public final void add(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r6) {
                r5 = this;
                r0 = 0
                r6.right = r0
                r6.parent = r0
                r6.left = r0
                r0 = 1
                r6.height = r0
                int r1 = r5.leavesToSkip
                if (r1 <= 0) goto L1f
                int r2 = r5.size
                r3 = r2 & 1
                if (r3 != 0) goto L1f
                int r2 = r2 + r0
                r5.size = r2
                int r1 = r1 - r0
                r5.leavesToSkip = r1
                int r1 = r5.leavesSkipped
                int r1 = r1 + r0
                r5.leavesSkipped = r1
            L1f:
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r5.stack
                r6.parent = r1
                r5.stack = r6
                int r6 = r5.size
                int r6 = r6 + r0
                r5.size = r6
                int r1 = r5.leavesToSkip
                if (r1 <= 0) goto L3d
                r2 = r6 & 1
                if (r2 != 0) goto L3d
                int r6 = r6 + r0
                r5.size = r6
                int r1 = r1 - r0
                r5.leavesToSkip = r1
                int r6 = r5.leavesSkipped
                int r6 = r6 + r0
                r5.leavesSkipped = r6
            L3d:
                r6 = 4
            L3e:
                int r1 = r5.size
                int r2 = r6 + (-1)
                r1 = r1 & r2
                if (r1 != r2) goto L80
                int r1 = r5.leavesSkipped
                if (r1 != 0) goto L63
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r5.stack
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r1.parent
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r2.parent
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r4 = r3.parent
                r2.parent = r4
                r5.stack = r2
                r2.left = r3
                r2.right = r1
                int r4 = r1.height
                int r4 = r4 + r0
                r2.height = r4
                r3.parent = r2
                r1.parent = r2
                goto L7d
            L63:
                r2 = 0
                if (r1 != r0) goto L78
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r5.stack
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r1.parent
                r5.stack = r3
                r3.right = r1
                int r4 = r1.height
                int r4 = r4 + r0
                r3.height = r4
                r1.parent = r3
                r5.leavesSkipped = r2
                goto L7d
            L78:
                r3 = 2
                if (r1 != r3) goto L7d
                r5.leavesSkipped = r2
            L7d:
                int r6 = r6 * 2
                goto L3e
            L80:
                return
        }

        public final void reset(int r2) {
                r1 = this;
                int r0 = java.lang.Integer.highestOneBit(r2)
                int r0 = r0 * 2
                int r0 = r0 + (-1)
                int r0 = r0 - r2
                r1.leavesToSkip = r0
                r2 = 0
                r1.size = r2
                r1.leavesSkipped = r2
                r2 = 0
                r1.stack = r2
                return
        }

        public final com.google.gson.internal.LinkedHashTreeMap.Node<K, V> root() {
                r2 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r2.stack
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.parent
                if (r1 != 0) goto L7
                return r0
            L7:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class AvlIterator<K, V> {
        private com.google.gson.internal.LinkedHashTreeMap.Node<K, V> stackTop;

        public AvlIterator() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> next() {
                r4 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r4.stackTop
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r0.parent
                r0.parent = r1
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.right
            Lc:
                r3 = r2
                r2 = r1
                r1 = r3
                if (r2 == 0) goto L16
                r2.parent = r1
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r2.left
                goto Lc
            L16:
                r4.stackTop = r1
                return r0
        }

        public final void reset(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r3) {
                r2 = this;
                r0 = 0
            L1:
                if (r3 == 0) goto Lb
                r3.parent = r0
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.left
                r1 = r0
                r0 = r3
                r3 = r1
                goto L1
            Lb:
                r2.stackTop = r0
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        public final /* synthetic */ com.google.gson.internal.LinkedHashTreeMap this$0;


        public EntrySet(com.google.gson.internal.LinkedHashTreeMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.util.Map.Entry
                if (r0 == 0) goto L10
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                com.google.gson.internal.LinkedHashTreeMap$Node r2 = r0.findByEntry(r2)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap$EntrySet$1 r0 = new com.google.gson.internal.LinkedHashTreeMap$EntrySet$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.gson.internal.LinkedHashTreeMap r0 = r2.this$0
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.gson.internal.LinkedHashTreeMap$Node r3 = r0.findByEntry(r3)
                if (r3 != 0) goto L11
                return r1
            L11:
                com.google.gson.internal.LinkedHashTreeMap r0 = r2.this$0
                r1 = 1
                r0.removeInternal(r3, r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                int r0 = r0.size
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class KeySet extends java.util.AbstractSet<K> {
        public final /* synthetic */ com.google.gson.internal.LinkedHashTreeMap this$0;


        public KeySet(com.google.gson.internal.LinkedHashTreeMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap$KeySet$1 r0 = new com.google.gson.internal.LinkedHashTreeMap$KeySet$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r2.this$0
                com.google.gson.internal.LinkedHashTreeMap$Node r3 = r0.findByObject(r3)
                r1 = 1
                if (r3 == 0) goto Lc
                r0.removeInternal(r3, r1)
            Lc:
                if (r3 == 0) goto Lf
                goto L10
            Lf:
                r1 = 0
            L10:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                int r0 = r0.size
                return r0
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements java.util.Iterator<T> {
        public int expectedModCount;
        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> lastReturned;
        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> next;
        public final /* synthetic */ com.google.gson.internal.LinkedHashTreeMap this$0;

        public LinkedTreeMapIterator(com.google.gson.internal.LinkedHashTreeMap r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r2.header
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r0.next
                r1.next = r0
                r0 = 0
                r1.lastReturned = r0
                int r2 = r2.modCount
                r1.expectedModCount = r2
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r2.next
                com.google.gson.internal.LinkedHashTreeMap r1 = r2.this$0
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r1.header
                if (r0 == r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        public final com.google.gson.internal.LinkedHashTreeMap.Node<K, V> nextNode() {
                r3 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.next
                com.google.gson.internal.LinkedHashTreeMap r1 = r3.this$0
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r1.header
                if (r0 == r2) goto L1b
                int r1 = r1.modCount
                int r2 = r3.expectedModCount
                if (r1 != r2) goto L15
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.next
                r3.next = r1
                r3.lastReturned = r0
                return r0
            L15:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
            L1b:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public final void remove() {
                r3 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.lastReturned
                if (r0 == 0) goto L14
                com.google.gson.internal.LinkedHashTreeMap r1 = r3.this$0
                r2 = 1
                r1.removeInternal(r0, r2)
                r0 = 0
                r3.lastReturned = r0
                com.google.gson.internal.LinkedHashTreeMap r0 = r3.this$0
                int r0 = r0.modCount
                r3.expectedModCount = r0
                return
            L14:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Node<K, V> implements java.util.Map.Entry<K, V> {
        public final int hash;
        public int height;
        public final K key;
        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> left;
        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> next;
        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> parent;
        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> prev;
        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> right;
        public V value;

        public Node() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.key = r0
                r0 = -1
                r1.hash = r0
                r1.prev = r1
                r1.next = r1
                return
        }

        public Node(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r1, K r2, int r3, com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r4, com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r5) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.key = r2
                r0.hash = r3
                r1 = 1
                r0.height = r1
                r0.next = r4
                r0.prev = r5
                r5.next = r0
                r4.prev = r0
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L32
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.key
                if (r0 != 0) goto L12
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L32
                goto L1c
            L12:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L32
            L1c:
                V r0 = r3.value
                if (r0 != 0) goto L27
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L32
                goto L31
            L27:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L32
            L31:
                r1 = 1
            L32:
                return r1
        }

        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> first() {
                r3 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.left
                r1 = r3
            L3:
                if (r0 == 0) goto Lb
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.left
                r2 = r1
                r1 = r0
                r0 = r2
                goto L3
            Lb:
                return r1
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r3 = this;
                K r0 = r3.key
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                V r2 = r3.value
                if (r2 != 0) goto L10
                goto L14
            L10:
                int r1 = r2.hashCode()
            L14:
                r0 = r0 ^ r1
                return r0
        }

        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> last() {
                r3 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.right
                r1 = r3
            L3:
                if (r0 == 0) goto Lb
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.right
                r2 = r1
                r1 = r0
                r0 = r2
                goto L3
            Lb:
                return r1
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                V r0 = r1.value
                r1.value = r2
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K r1 = r2.key
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                V r1 = r2.value
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<com.google.gson.internal.LinkedHashTreeMap> r0 = com.google.gson.internal.LinkedHashTreeMap.class
            com.google.gson.internal.LinkedHashTreeMap$1 r0 = new com.google.gson.internal.LinkedHashTreeMap$1
            r0.<init>()
            com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER = r0
            return
    }

    public LinkedHashTreeMap() {
            r1 = this;
            java.util.Comparator<java.lang.Comparable> r0 = com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER
            r1.<init>(r0)
            return
    }

    public LinkedHashTreeMap(java.util.Comparator<? super K> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.size = r0
            r1.modCount = r0
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            java.util.Comparator<java.lang.Comparable> r2 = com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER
        Ld:
            r1.comparator = r2
            com.google.gson.internal.LinkedHashTreeMap$Node r2 = new com.google.gson.internal.LinkedHashTreeMap$Node
            r2.<init>()
            r1.header = r2
            r2 = 16
            com.google.gson.internal.LinkedHashTreeMap$Node[] r2 = new com.google.gson.internal.LinkedHashTreeMap.Node[r2]
            r1.table = r2
            int r0 = r2.length
            int r0 = r0 / 2
            int r2 = r2.length
            int r2 = r2 / 4
            int r2 = r2 + r0
            r1.threshold = r2
            return
    }

    private void doubleCapacity() {
            r12 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r0 = r12.table
            int r1 = r0.length
            int r2 = r1 * 2
            com.google.gson.internal.LinkedHashTreeMap$Node[] r2 = new com.google.gson.internal.LinkedHashTreeMap.Node[r2]
            com.google.gson.internal.LinkedHashTreeMap$AvlIterator r3 = new com.google.gson.internal.LinkedHashTreeMap$AvlIterator
            r3.<init>()
            com.google.gson.internal.LinkedHashTreeMap$AvlBuilder r4 = new com.google.gson.internal.LinkedHashTreeMap$AvlBuilder
            r4.<init>()
            com.google.gson.internal.LinkedHashTreeMap$AvlBuilder r5 = new com.google.gson.internal.LinkedHashTreeMap$AvlBuilder
            r5.<init>()
            r6 = 0
            r7 = 0
        L18:
            if (r7 >= r1) goto L69
            r8 = r0[r7]
            if (r8 != 0) goto L1f
            goto L66
        L1f:
            r3.reset(r8)
            r9 = 0
            r10 = 0
        L24:
            com.google.gson.internal.LinkedHashTreeMap$Node r11 = r3.next()
            if (r11 == 0) goto L35
            int r11 = r11.hash
            r11 = r11 & r1
            if (r11 != 0) goto L32
            int r9 = r9 + 1
            goto L24
        L32:
            int r10 = r10 + 1
            goto L24
        L35:
            r4.reset(r9)
            r5.reset(r10)
            r3.reset(r8)
        L3e:
            com.google.gson.internal.LinkedHashTreeMap$Node r8 = r3.next()
            if (r8 == 0) goto L51
            int r11 = r8.hash
            r11 = r11 & r1
            if (r11 != 0) goto L4d
            r4.add(r8)
            goto L3e
        L4d:
            r5.add(r8)
            goto L3e
        L51:
            r8 = 0
            if (r9 <= 0) goto L59
            com.google.gson.internal.LinkedHashTreeMap$Node r9 = r4.root()
            goto L5a
        L59:
            r9 = r8
        L5a:
            r2[r7] = r9
            int r9 = r7 + r1
            if (r10 <= 0) goto L64
            com.google.gson.internal.LinkedHashTreeMap$Node r8 = r5.root()
        L64:
            r2[r9] = r8
        L66:
            int r7 = r7 + 1
            goto L18
        L69:
            r12.table = r2
            int r0 = r2.length
            int r0 = r0 / 2
            int r1 = r2.length
            int r1 = r1 / 4
            int r1 = r1 + r0
            r12.threshold = r1
            return
    }

    private boolean equal(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            if (r1 == r2) goto Ld
            if (r1 == 0) goto Lb
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            return r1
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Deserialization is unsupported"
            r2.<init>(r0)
            throw r2
    }

    private void rebalance(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r8, boolean r9) {
            r7 = this;
        L0:
            if (r8 == 0) goto L79
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r8.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r8.right
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.height
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.height
            goto L13
        L12:
            r4 = 0
        L13:
            int r5 = r3 - r4
            r6 = -2
            if (r5 != r6) goto L3c
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r1.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r1.right
            if (r3 == 0) goto L21
            int r3 = r3.height
            goto L22
        L21:
            r3 = 0
        L22:
            if (r0 == 0) goto L26
            int r2 = r0.height
        L26:
            int r2 = r2 - r3
            r0 = -1
            if (r2 == r0) goto L36
            if (r2 != 0) goto L2f
            if (r9 != 0) goto L2f
            goto L36
        L2f:
            r7.rotateRight(r1)
            r7.rotateLeft(r8)
            goto L39
        L36:
            r7.rotateLeft(r8)
        L39:
            if (r9 == 0) goto L76
            goto L79
        L3c:
            r1 = 2
            r6 = 1
            if (r5 != r1) goto L63
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r0.right
            if (r3 == 0) goto L49
            int r3 = r3.height
            goto L4a
        L49:
            r3 = 0
        L4a:
            if (r1 == 0) goto L4e
            int r2 = r1.height
        L4e:
            int r2 = r2 - r3
            if (r2 == r6) goto L5d
            if (r2 != 0) goto L56
            if (r9 != 0) goto L56
            goto L5d
        L56:
            r7.rotateLeft(r0)
            r7.rotateRight(r8)
            goto L60
        L5d:
            r7.rotateRight(r8)
        L60:
            if (r9 == 0) goto L76
            goto L79
        L63:
            if (r5 != 0) goto L6c
            int r3 = r3 + 1
            r8.height = r3
            if (r9 == 0) goto L76
            goto L79
        L6c:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r6
            r8.height = r0
            if (r9 != 0) goto L76
            goto L79
        L76:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r8.parent
            goto L0
        L79:
            return
    }

    private void replaceInParent(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r3, com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r4) {
            r2 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.parent
            r1 = 0
            r3.parent = r1
            if (r4 == 0) goto L9
            r4.parent = r0
        L9:
            if (r0 == 0) goto L15
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.left
            if (r1 != r3) goto L12
            r0.left = r4
            goto L1f
        L12:
            r0.right = r4
            goto L1f
        L15:
            int r3 = r3.hash
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r0 = r2.table
            int r1 = r0.length
            int r1 = r1 + (-1)
            r3 = r3 & r1
            r0[r3] = r4
        L1f:
            return
    }

    private void rotateLeft(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r6) {
            r5 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r6.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.right
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r1.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r1.right
            r6.right = r2
            if (r2 == 0) goto Le
            r2.parent = r6
        Le:
            r5.replaceInParent(r6, r1)
            r1.left = r6
            r6.parent = r1
            r4 = 0
            if (r0 == 0) goto L1b
            int r0 = r0.height
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r2 == 0) goto L21
            int r2 = r2.height
            goto L22
        L21:
            r2 = 0
        L22:
            int r0 = java.lang.Math.max(r0, r2)
            int r0 = r0 + 1
            r6.height = r0
            if (r3 == 0) goto L2e
            int r4 = r3.height
        L2e:
            int r6 = java.lang.Math.max(r0, r4)
            int r6 = r6 + 1
            r1.height = r6
            return
    }

    private void rotateRight(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r6) {
            r5 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r6.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.right
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r0.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r0.right
            r6.left = r3
            if (r3 == 0) goto Le
            r3.parent = r6
        Le:
            r5.replaceInParent(r6, r0)
            r0.right = r6
            r6.parent = r0
            r4 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.height
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r3 == 0) goto L21
            int r3 = r3.height
            goto L22
        L21:
            r3 = 0
        L22:
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + 1
            r6.height = r1
            if (r2 == 0) goto L2e
            int r4 = r2.height
        L2e:
            int r6 = java.lang.Math.max(r1, r4)
            int r6 = r6 + 1
            r0.height = r6
            return
    }

    private static int secondaryHash(int r2) {
            int r0 = r2 >>> 20
            int r1 = r2 >>> 12
            r0 = r0 ^ r1
            r2 = r2 ^ r0
            int r0 = r2 >>> 7
            r0 = r0 ^ r2
            int r2 = r2 >>> 4
            r2 = r2 ^ r0
            return r2
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            r1 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r4 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r0 = r4.table
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r0 = 0
            r4.size = r0
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r4.header
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r0.next
        L13:
            if (r2 == r0) goto L1d
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r2.next
            r2.prev = r1
            r2.next = r1
            r2 = r3
            goto L13
        L1d:
            r0.prev = r0
            r0.next = r0
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node r1 = r0.findByObject(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            com.google.gson.internal.LinkedHashTreeMap<K, V>$EntrySet r0 = r1.entrySet
            if (r0 == 0) goto L5
            goto Lc
        L5:
            com.google.gson.internal.LinkedHashTreeMap$EntrySet r0 = new com.google.gson.internal.LinkedHashTreeMap$EntrySet
            r0.<init>(r1)
            r1.entrySet = r0
        Lc:
            return r0
    }

    public final com.google.gson.internal.LinkedHashTreeMap.Node<K, V> find(K r13, boolean r14) {
            r12 = this;
            java.util.Comparator<? super K> r0 = r12.comparator
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r1 = r12.table
            int r2 = r13.hashCode()
            int r6 = secondaryHash(r2)
            int r2 = r1.length
            r9 = 1
            int r2 = r2 - r9
            r2 = r2 & r6
            r3 = r1[r2]
            r4 = 0
            if (r3 == 0) goto L3e
            java.util.Comparator<java.lang.Comparable> r5 = com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER
            if (r0 != r5) goto L1d
            r5 = r13
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            goto L1e
        L1d:
            r5 = r4
        L1e:
            if (r5 == 0) goto L27
            K r7 = r3.key
            int r7 = r5.compareTo(r7)
            goto L2d
        L27:
            K r7 = r3.key
            int r7 = r0.compare(r13, r7)
        L2d:
            if (r7 != 0) goto L30
            return r3
        L30:
            if (r7 >= 0) goto L35
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r3.left
            goto L37
        L35:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r3.right
        L37:
            if (r8 != 0) goto L3c
            r10 = r3
            r11 = r7
            goto L41
        L3c:
            r3 = r8
            goto L1e
        L3e:
            r7 = 0
            r10 = r3
            r11 = 0
        L41:
            if (r14 != 0) goto L44
            return r4
        L44:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r7 = r12.header
            if (r10 != 0) goto L7d
            java.util.Comparator<java.lang.Comparable> r14 = com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER
            if (r0 != r14) goto L70
            boolean r14 = r13 instanceof java.lang.Comparable
            if (r14 == 0) goto L51
            goto L70
        L51:
            java.lang.ClassCastException r14 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getName()
            r0.append(r13)
            java.lang.String r13 = " is not Comparable"
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L70:
            com.google.gson.internal.LinkedHashTreeMap$Node r14 = new com.google.gson.internal.LinkedHashTreeMap$Node
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r7.prev
            r3 = r14
            r4 = r10
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r1[r2] = r14
            goto L91
        L7d:
            com.google.gson.internal.LinkedHashTreeMap$Node r14 = new com.google.gson.internal.LinkedHashTreeMap$Node
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r7.prev
            r3 = r14
            r4 = r10
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            if (r11 >= 0) goto L8c
            r10.left = r14
            goto L8e
        L8c:
            r10.right = r14
        L8e:
            r12.rebalance(r10, r9)
        L91:
            int r13 = r12.size
            int r0 = r13 + 1
            r12.size = r0
            int r0 = r12.threshold
            if (r13 <= r0) goto L9e
            r12.doubleCapacity()
        L9e:
            int r13 = r12.modCount
            int r13 = r13 + r9
            r12.modCount = r13
            return r14
    }

    public final com.google.gson.internal.LinkedHashTreeMap.Node<K, V> findByEntry(java.util.Map.Entry<?, ?> r3) {
            r2 = this;
            java.lang.Object r0 = r3.getKey()
            com.google.gson.internal.LinkedHashTreeMap$Node r0 = r2.findByObject(r0)
            if (r0 == 0) goto L18
            V r1 = r0.value
            java.lang.Object r3 = r3.getValue()
            boolean r3 = r2.equal(r1, r3)
            if (r3 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    public final com.google.gson.internal.LinkedHashTreeMap.Node<K, V> findByObject(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.gson.internal.LinkedHashTreeMap$Node r0 = r2.find(r3, r1)     // Catch: java.lang.ClassCastException -> L9
        L9:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object r1) {
            r0 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node r1 = r0.findByObject(r1)
            if (r1 == 0) goto L9
            V r1 = r1.value
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            com.google.gson.internal.LinkedHashTreeMap<K, V>$KeySet r0 = r1.keySet
            if (r0 == 0) goto L5
            goto Lc
        L5:
            com.google.gson.internal.LinkedHashTreeMap$KeySet r0 = new com.google.gson.internal.LinkedHashTreeMap$KeySet
            r0.<init>(r1)
            r1.keySet = r0
        Lc:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K r2, V r3) {
            r1 = this;
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r2, r0)
            r0 = 1
            com.google.gson.internal.LinkedHashTreeMap$Node r2 = r1.find(r2, r0)
            V r0 = r2.value
            r2.value = r3
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node r2 = r1.findByObject(r2)
            if (r2 == 0) goto La
            r0 = 1
            r1.removeInternal(r2, r0)
        La:
            if (r2 == 0) goto Lf
            V r2 = r2.value
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    public final void removeInternal(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r6, boolean r7) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L11
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r7 = r6.prev
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.next
            r7.next = r1
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.next
            r1.prev = r7
            r6.prev = r0
            r6.next = r0
        L11:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r7 = r6.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.right
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r6.parent
            r3 = 0
            if (r7 == 0) goto L54
            if (r1 == 0) goto L54
            int r2 = r7.height
            int r4 = r1.height
            if (r2 <= r4) goto L27
            com.google.gson.internal.LinkedHashTreeMap$Node r7 = r7.last()
            goto L2b
        L27:
            com.google.gson.internal.LinkedHashTreeMap$Node r7 = r1.first()
        L2b:
            r5.removeInternal(r7, r3)
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.left
            if (r1 == 0) goto L3b
            int r2 = r1.height
            r7.left = r1
            r1.parent = r7
            r6.left = r0
            goto L3c
        L3b:
            r2 = 0
        L3c:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.right
            if (r1 == 0) goto L48
            int r3 = r1.height
            r7.right = r1
            r1.parent = r7
            r6.right = r0
        L48:
            int r0 = java.lang.Math.max(r2, r3)
            int r0 = r0 + 1
            r7.height = r0
            r5.replaceInParent(r6, r7)
            return
        L54:
            if (r7 == 0) goto L5c
            r5.replaceInParent(r6, r7)
            r6.left = r0
            goto L67
        L5c:
            if (r1 == 0) goto L64
            r5.replaceInParent(r6, r1)
            r6.right = r0
            goto L67
        L64:
            r5.replaceInParent(r6, r0)
        L67:
            r5.rebalance(r2, r3)
            int r6 = r5.size
            int r6 = r6 + (-1)
            r5.size = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
