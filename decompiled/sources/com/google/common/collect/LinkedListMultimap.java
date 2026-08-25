package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class LinkedListMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V>, java.io.Serializable {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.LinkedListMultimap.Node<K, V> head;
    private transient java.util.Map<K, com.google.common.collect.LinkedListMultimap.KeyList<K, V>> keyToKeyList;
    private transient int modCount;
    private transient int size;

    @javax.annotation.CheckForNull
    private transient com.google.common.collect.LinkedListMultimap.Node<K, V> tail;





    public class DistinctKeyIterator implements java.util.Iterator<K> {

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedListMultimap.Node<K, V> current;
        public int expectedModCount;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedListMultimap.Node<K, V> next;
        public final java.util.Set<K> seenKeys;
        public final /* synthetic */ com.google.common.collect.LinkedListMultimap this$0;

        private DistinctKeyIterator(com.google.common.collect.LinkedListMultimap r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.util.Set r0 = r2.keySet()
                int r0 = r0.size()
                java.util.HashSet r0 = com.google.common.collect.Sets.newHashSetWithExpectedSize(r0)
                r1.seenKeys = r0
                com.google.common.collect.LinkedListMultimap$Node r0 = com.google.common.collect.LinkedListMultimap.access$200(r2)
                r1.next = r0
                int r2 = com.google.common.collect.LinkedListMultimap.access$000(r2)
                r1.expectedModCount = r2
                return
        }

        public /* synthetic */ DistinctKeyIterator(com.google.common.collect.LinkedListMultimap r1, com.google.common.collect.LinkedListMultimap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void checkForConcurrentModification() {
                r2 = this;
                com.google.common.collect.LinkedListMultimap r0 = r2.this$0
                int r0 = com.google.common.collect.LinkedListMultimap.access$000(r0)
                int r1 = r2.expectedModCount
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                r1.checkForConcurrentModification()
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r1.next
                if (r0 == 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public K next() {
                r2 = this;
                r2.checkForConcurrentModification()
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r2.next
                if (r0 == 0) goto L27
                r2.current = r0
                java.util.Set<K> r1 = r2.seenKeys
                K r0 = r0.key
                r1.add(r0)
            L10:
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r2.next
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r0.next
                r2.next = r0
                if (r0 == 0) goto L22
                java.util.Set<K> r1 = r2.seenKeys
                K r0 = r0.key
                boolean r0 = r1.add(r0)
                if (r0 == 0) goto L10
            L22:
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r2.current
                K r0 = r0.key
                return r0
            L27:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                r2.checkForConcurrentModification()
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r2.current
                if (r0 == 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                java.lang.String r1 = "no calls to next() since the last call to remove()"
                com.google.common.base.Preconditions.checkState(r0, r1)
                com.google.common.collect.LinkedListMultimap r0 = r2.this$0
                com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r2.current
                K r1 = r1.key
                com.google.common.collect.LinkedListMultimap.access$400(r0, r1)
                r0 = 0
                r2.current = r0
                com.google.common.collect.LinkedListMultimap r0 = r2.this$0
                int r0 = com.google.common.collect.LinkedListMultimap.access$000(r0)
                r2.expectedModCount = r0
                return
        }
    }

    public static class KeyList<K, V> {
        public int count;
        public com.google.common.collect.LinkedListMultimap.Node<K, V> head;
        public com.google.common.collect.LinkedListMultimap.Node<K, V> tail;

        public KeyList(com.google.common.collect.LinkedListMultimap.Node<K, V> r2) {
                r1 = this;
                r1.<init>()
                r1.head = r2
                r1.tail = r2
                r0 = 0
                r2.previousSibling = r0
                r2.nextSibling = r0
                r2 = 1
                r1.count = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Node<K, V> extends com.google.common.collect.AbstractMapEntry<K, V> {

        @com.google.common.collect.ParametricNullness
        public final K key;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedListMultimap.Node<K, V> next;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedListMultimap.Node<K, V> nextSibling;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedListMultimap.Node<K, V> previous;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedListMultimap.Node<K, V> previousSibling;

        @com.google.common.collect.ParametricNullness
        public V value;

        public Node(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V r2) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.value = r2
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
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @com.google.common.collect.ParametricNullness
        public V setValue(@com.google.common.collect.ParametricNullness V r2) {
                r1 = this;
                V r0 = r1.value
                r1.value = r2
                return r0
        }
    }

    public class NodeIterator implements java.util.ListIterator<java.util.Map.Entry<K, V>> {

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedListMultimap.Node<K, V> current;
        public int expectedModCount;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedListMultimap.Node<K, V> next;
        public int nextIndex;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedListMultimap.Node<K, V> previous;
        public final /* synthetic */ com.google.common.collect.LinkedListMultimap this$0;

        public NodeIterator(com.google.common.collect.LinkedListMultimap r3, int r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                int r0 = com.google.common.collect.LinkedListMultimap.access$000(r3)
                r2.expectedModCount = r0
                int r0 = r3.size()
                com.google.common.base.Preconditions.checkPositionIndex(r4, r0)
                int r1 = r0 / 2
                if (r4 < r1) goto L27
                com.google.common.collect.LinkedListMultimap$Node r3 = com.google.common.collect.LinkedListMultimap.access$100(r3)
                r2.previous = r3
                r2.nextIndex = r0
            L1e:
                int r3 = r4 + 1
                if (r4 >= r0) goto L36
                r2.previous()
                r4 = r3
                goto L1e
            L27:
                com.google.common.collect.LinkedListMultimap$Node r3 = com.google.common.collect.LinkedListMultimap.access$200(r3)
                r2.next = r3
            L2d:
                int r3 = r4 + (-1)
                if (r4 <= 0) goto L36
                r2.next()
                r4 = r3
                goto L2d
            L36:
                r3 = 0
                r2.current = r3
                return
        }

        private void checkForConcurrentModification() {
                r2 = this;
                com.google.common.collect.LinkedListMultimap r0 = r2.this$0
                int r0 = com.google.common.collect.LinkedListMultimap.access$000(r0)
                int r1 = r2.expectedModCount
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(java.lang.Object r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                r0.add(r1)
                return
        }

        public void add(java.util.Map.Entry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                r1.checkForConcurrentModification()
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r1.next
                if (r0 == 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                r1.checkForConcurrentModification()
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r1.previous
                if (r0 == 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.LinkedListMultimap.Node<K, V> next() {
                r2 = this;
                r2.checkForConcurrentModification()
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r2.next
                if (r0 == 0) goto L16
                r2.current = r0
                r2.previous = r0
                com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r0.next
                r2.next = r1
                int r1 = r2.nextIndex
                int r1 = r1 + 1
                r2.nextIndex = r1
                return r0
            L16:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                com.google.common.collect.LinkedListMultimap$Node r0 = r1.next()
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.nextIndex
                return r0
        }

        @Override // java.util.ListIterator
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.LinkedListMultimap.Node<K, V> previous() {
                r2 = this;
                r2.checkForConcurrentModification()
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r2.previous
                if (r0 == 0) goto L16
                r2.current = r0
                r2.next = r0
                com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r0.previous
                r2.previous = r1
                int r1 = r2.nextIndex
                int r1 = r1 + (-1)
                r2.nextIndex = r1
                return r0
            L16:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ java.lang.Object previous() {
                r1 = this;
                com.google.common.collect.LinkedListMultimap$Node r0 = r1.previous()
                return r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.nextIndex
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r3 = this;
                r3.checkForConcurrentModification()
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r3.current
                r1 = 1
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                java.lang.String r2 = "no calls to next() since the last call to remove()"
                com.google.common.base.Preconditions.checkState(r0, r2)
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r3.current
                com.google.common.collect.LinkedListMultimap$Node<K, V> r2 = r3.next
                if (r0 == r2) goto L20
                com.google.common.collect.LinkedListMultimap$Node<K, V> r2 = r0.previous
                r3.previous = r2
                int r2 = r3.nextIndex
                int r2 = r2 - r1
                r3.nextIndex = r2
                goto L24
            L20:
                com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r0.next
                r3.next = r1
            L24:
                com.google.common.collect.LinkedListMultimap r1 = r3.this$0
                com.google.common.collect.LinkedListMultimap.access$300(r1, r0)
                r0 = 0
                r3.current = r0
                com.google.common.collect.LinkedListMultimap r0 = r3.this$0
                int r0 = com.google.common.collect.LinkedListMultimap.access$000(r0)
                r3.expectedModCount = r0
                return
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(java.lang.Object r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                r0.set(r1)
                return
        }

        public void set(java.util.Map.Entry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    public class ValueForKeyIterator implements java.util.ListIterator<V> {

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedListMultimap.Node<K, V> current;

        @com.google.common.collect.ParametricNullness
        public final K key;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedListMultimap.Node<K, V> next;
        public int nextIndex;

        @javax.annotation.CheckForNull
        public com.google.common.collect.LinkedListMultimap.Node<K, V> previous;
        public final /* synthetic */ com.google.common.collect.LinkedListMultimap this$0;

        public ValueForKeyIterator(@com.google.common.collect.ParametricNullness com.google.common.collect.LinkedListMultimap r1, K r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                java.util.Map r1 = com.google.common.collect.LinkedListMultimap.access$500(r1)
                java.lang.Object r1 = r1.get(r2)
                com.google.common.collect.LinkedListMultimap$KeyList r1 = (com.google.common.collect.LinkedListMultimap.KeyList) r1
                if (r1 != 0) goto L15
                r1 = 0
                goto L17
            L15:
                com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r1.head
            L17:
                r0.next = r1
                return
        }

        public ValueForKeyIterator(@com.google.common.collect.ParametricNullness com.google.common.collect.LinkedListMultimap r4, K r5, int r6) {
                r3 = this;
                r3.this$0 = r4
                r3.<init>()
                java.util.Map r4 = com.google.common.collect.LinkedListMultimap.access$500(r4)
                java.lang.Object r4 = r4.get(r5)
                com.google.common.collect.LinkedListMultimap$KeyList r4 = (com.google.common.collect.LinkedListMultimap.KeyList) r4
                if (r4 != 0) goto L13
                r0 = 0
                goto L15
            L13:
                int r0 = r4.count
            L15:
                com.google.common.base.Preconditions.checkPositionIndex(r6, r0)
                int r1 = r0 / 2
                r2 = 0
                if (r6 < r1) goto L30
                if (r4 != 0) goto L21
                r4 = r2
                goto L23
            L21:
                com.google.common.collect.LinkedListMultimap$Node<K, V> r4 = r4.tail
            L23:
                r3.previous = r4
                r3.nextIndex = r0
            L27:
                int r4 = r6 + 1
                if (r6 >= r0) goto L41
                r3.previous()
                r6 = r4
                goto L27
            L30:
                if (r4 != 0) goto L34
                r4 = r2
                goto L36
            L34:
                com.google.common.collect.LinkedListMultimap$Node<K, V> r4 = r4.head
            L36:
                r3.next = r4
            L38:
                int r4 = r6 + (-1)
                if (r6 <= 0) goto L41
                r3.next()
                r6 = r4
                goto L38
            L41:
                r3.key = r5
                r3.current = r2
                return
        }

        @Override // java.util.ListIterator
        public void add(@com.google.common.collect.ParametricNullness V r4) {
                r3 = this;
                com.google.common.collect.LinkedListMultimap r0 = r3.this$0
                K r1 = r3.key
                com.google.common.collect.LinkedListMultimap$Node<K, V> r2 = r3.next
                com.google.common.collect.LinkedListMultimap$Node r4 = com.google.common.collect.LinkedListMultimap.access$600(r0, r1, r4, r2)
                r3.previous = r4
                int r4 = r3.nextIndex
                int r4 = r4 + 1
                r3.nextIndex = r4
                r4 = 0
                r3.current = r4
                return
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r1.next
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r1.previous
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @com.google.common.collect.ParametricNullness
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public V next() {
                r2 = this;
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r2.next
                if (r0 == 0) goto L15
                r2.current = r0
                r2.previous = r0
                com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r0.nextSibling
                r2.next = r1
                int r1 = r2.nextIndex
                int r1 = r1 + 1
                r2.nextIndex = r1
                V r0 = r0.value
                return r0
            L15:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.nextIndex
                return r0
        }

        @Override // java.util.ListIterator
        @com.google.common.collect.ParametricNullness
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public V previous() {
                r2 = this;
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r2.previous
                if (r0 == 0) goto L15
                r2.current = r0
                r2.next = r0
                com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r0.previousSibling
                r2.previous = r1
                int r1 = r2.nextIndex
                int r1 = r1 + (-1)
                r2.nextIndex = r1
                V r0 = r0.value
                return r0
            L15:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.nextIndex
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r3 = this;
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r3.current
                r1 = 1
                if (r0 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r2 = "no calls to next() since the last call to remove()"
                com.google.common.base.Preconditions.checkState(r0, r2)
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r3.current
                com.google.common.collect.LinkedListMultimap$Node<K, V> r2 = r3.next
                if (r0 == r2) goto L1d
                com.google.common.collect.LinkedListMultimap$Node<K, V> r2 = r0.previousSibling
                r3.previous = r2
                int r2 = r3.nextIndex
                int r2 = r2 - r1
                r3.nextIndex = r2
                goto L21
            L1d:
                com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r0.nextSibling
                r3.next = r1
            L21:
                com.google.common.collect.LinkedListMultimap r1 = r3.this$0
                com.google.common.collect.LinkedListMultimap.access$300(r1, r0)
                r0 = 0
                r3.current = r0
                return
        }

        @Override // java.util.ListIterator
        public void set(@com.google.common.collect.ParametricNullness V r2) {
                r1 = this;
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r1.current
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                com.google.common.base.Preconditions.checkState(r0)
                com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r1.current
                r0.value = r2
                return
        }
    }

    private LinkedListMultimap(int r1) {
            r0 = this;
            r0.<init>()
            com.google.common.collect.CompactHashMap r1 = com.google.common.collect.CompactHashMap.createWithExpectedSize(r1)
            r0.keyToKeyList = r1
            return
    }

    private LinkedListMultimap(com.google.common.collect.Multimap<? extends K, ? extends V> r2) {
            r1 = this;
            java.util.Set r0 = r2.keySet()
            int r0 = r0.size()
            r1.<init>(r0)
            r1.putAll(r2)
            return
    }

    public static /* synthetic */ int access$000(com.google.common.collect.LinkedListMultimap r0) {
            int r0 = r0.modCount
            return r0
    }

    public static /* synthetic */ com.google.common.collect.LinkedListMultimap.Node access$100(com.google.common.collect.LinkedListMultimap r0) {
            com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r0.tail
            return r0
    }

    public static /* synthetic */ com.google.common.collect.LinkedListMultimap.Node access$200(com.google.common.collect.LinkedListMultimap r0) {
            com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r0.head
            return r0
    }

    public static /* synthetic */ void access$300(com.google.common.collect.LinkedListMultimap r0, com.google.common.collect.LinkedListMultimap.Node r1) {
            r0.removeNode(r1)
            return
    }

    public static /* synthetic */ void access$400(com.google.common.collect.LinkedListMultimap r0, java.lang.Object r1) {
            r0.removeAllNodes(r1)
            return
    }

    public static /* synthetic */ java.util.Map access$500(com.google.common.collect.LinkedListMultimap r0) {
            java.util.Map<K, com.google.common.collect.LinkedListMultimap$KeyList<K, V>> r0 = r0.keyToKeyList
            return r0
    }

    public static /* synthetic */ com.google.common.collect.LinkedListMultimap.Node access$600(com.google.common.collect.LinkedListMultimap r0, java.lang.Object r1, java.lang.Object r2, com.google.common.collect.LinkedListMultimap.Node r3) {
            com.google.common.collect.LinkedListMultimap$Node r0 = r0.addNode(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int access$800(com.google.common.collect.LinkedListMultimap r0) {
            int r0 = r0.size
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private com.google.common.collect.LinkedListMultimap.Node<K, V> addNode(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness V r3, @javax.annotation.CheckForNull com.google.common.collect.LinkedListMultimap.Node<K, V> r4) {
            r1 = this;
            com.google.common.collect.LinkedListMultimap$Node r0 = new com.google.common.collect.LinkedListMultimap$Node
            r0.<init>(r2, r3)
            com.google.common.collect.LinkedListMultimap$Node<K, V> r3 = r1.head
            if (r3 != 0) goto L1e
            r1.tail = r0
            r1.head = r0
            java.util.Map<K, com.google.common.collect.LinkedListMultimap$KeyList<K, V>> r3 = r1.keyToKeyList
            com.google.common.collect.LinkedListMultimap$KeyList r4 = new com.google.common.collect.LinkedListMultimap$KeyList
            r4.<init>(r0)
            r3.put(r2, r4)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            goto L8d
        L1e:
            if (r4 != 0) goto L5a
            com.google.common.collect.LinkedListMultimap$Node<K, V> r3 = r1.tail
            java.util.Objects.requireNonNull(r3)
            r4 = r3
            com.google.common.collect.LinkedListMultimap$Node r4 = (com.google.common.collect.LinkedListMultimap.Node) r4
            r3.next = r0
            com.google.common.collect.LinkedListMultimap$Node<K, V> r3 = r1.tail
            r0.previous = r3
            r1.tail = r0
            java.util.Map<K, com.google.common.collect.LinkedListMultimap$KeyList<K, V>> r3 = r1.keyToKeyList
            java.lang.Object r3 = r3.get(r2)
            com.google.common.collect.LinkedListMultimap$KeyList r3 = (com.google.common.collect.LinkedListMultimap.KeyList) r3
            if (r3 != 0) goto L4b
            java.util.Map<K, com.google.common.collect.LinkedListMultimap$KeyList<K, V>> r3 = r1.keyToKeyList
            com.google.common.collect.LinkedListMultimap$KeyList r4 = new com.google.common.collect.LinkedListMultimap$KeyList
            r4.<init>(r0)
            r3.put(r2, r4)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            goto L8d
        L4b:
            int r2 = r3.count
            int r2 = r2 + 1
            r3.count = r2
            com.google.common.collect.LinkedListMultimap$Node<K, V> r2 = r3.tail
            r2.nextSibling = r0
            r0.previousSibling = r2
            r3.tail = r0
            goto L8d
        L5a:
            java.util.Map<K, com.google.common.collect.LinkedListMultimap$KeyList<K, V>> r3 = r1.keyToKeyList
            java.lang.Object r2 = r3.get(r2)
            com.google.common.collect.LinkedListMultimap$KeyList r2 = (com.google.common.collect.LinkedListMultimap.KeyList) r2
            java.util.Objects.requireNonNull(r2)
            int r3 = r2.count
            int r3 = r3 + 1
            r2.count = r3
            com.google.common.collect.LinkedListMultimap$Node<K, V> r3 = r4.previous
            r0.previous = r3
            com.google.common.collect.LinkedListMultimap$Node<K, V> r3 = r4.previousSibling
            r0.previousSibling = r3
            r0.next = r4
            r0.nextSibling = r4
            com.google.common.collect.LinkedListMultimap$Node<K, V> r3 = r4.previousSibling
            if (r3 != 0) goto L7e
            r2.head = r0
            goto L80
        L7e:
            r3.nextSibling = r0
        L80:
            com.google.common.collect.LinkedListMultimap$Node<K, V> r2 = r4.previous
            if (r2 != 0) goto L87
            r1.head = r0
            goto L89
        L87:
            r2.next = r0
        L89:
            r4.previous = r0
            r4.previousSibling = r0
        L8d:
            int r2 = r1.size
            int r2 = r2 + 1
            r1.size = r2
            return r0
    }

    public static <K, V> com.google.common.collect.LinkedListMultimap<K, V> create() {
            com.google.common.collect.LinkedListMultimap r0 = new com.google.common.collect.LinkedListMultimap
            r1 = 12
            r0.<init>(r1)
            return r0
    }

    public static <K, V> com.google.common.collect.LinkedListMultimap<K, V> create(int r1) {
            com.google.common.collect.LinkedListMultimap r0 = new com.google.common.collect.LinkedListMultimap
            r0.<init>(r1)
            return r0
    }

    public static <K, V> com.google.common.collect.LinkedListMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
            com.google.common.collect.LinkedListMultimap r0 = new com.google.common.collect.LinkedListMultimap
            r0.<init>(r1)
            return r0
    }

    private java.util.List<V> getCopy(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            com.google.common.collect.LinkedListMultimap$ValueForKeyIterator r0 = new com.google.common.collect.LinkedListMultimap$ValueForKeyIterator
            r0.<init>(r1, r2)
            java.util.ArrayList r2 = com.google.common.collect.Lists.newArrayList(r0)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            return r2
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r5) throws java.io.IOException, java.lang.ClassNotFoundException {
            r4 = this;
            r5.defaultReadObject()
            com.google.common.collect.CompactLinkedHashMap r0 = com.google.common.collect.CompactLinkedHashMap.create()
            r4.keyToKeyList = r0
            int r0 = r5.readInt()
            r1 = 0
        Le:
            if (r1 >= r0) goto L1e
            java.lang.Object r2 = r5.readObject()
            java.lang.Object r3 = r5.readObject()
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto Le
        L1e:
            return
    }

    private void removeAllNodes(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            com.google.common.collect.LinkedListMultimap$ValueForKeyIterator r0 = new com.google.common.collect.LinkedListMultimap$ValueForKeyIterator
            r0.<init>(r1, r2)
            com.google.common.collect.Iterators.clear(r0)
            return
    }

    private void removeNode(com.google.common.collect.LinkedListMultimap.Node<K, V> r4) {
            r3 = this;
            com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r4.previous
            if (r0 == 0) goto L9
            com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r4.next
            r0.next = r1
            goto Ld
        L9:
            com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r4.next
            r3.head = r1
        Ld:
            com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r4.next
            if (r1 == 0) goto L14
            r1.previous = r0
            goto L16
        L14:
            r3.tail = r0
        L16:
            com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r4.previousSibling
            if (r0 != 0) goto L35
            com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r4.nextSibling
            if (r0 != 0) goto L35
            java.util.Map<K, com.google.common.collect.LinkedListMultimap$KeyList<K, V>> r0 = r3.keyToKeyList
            K r4 = r4.key
            java.lang.Object r4 = r0.remove(r4)
            com.google.common.collect.LinkedListMultimap$KeyList r4 = (com.google.common.collect.LinkedListMultimap.KeyList) r4
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            r4.count = r0
            int r4 = r3.modCount
            int r4 = r4 + 1
            r3.modCount = r4
            goto L6e
        L35:
            java.util.Map<K, com.google.common.collect.LinkedListMultimap$KeyList<K, V>> r0 = r3.keyToKeyList
            K r1 = r4.key
            java.lang.Object r0 = r0.get(r1)
            com.google.common.collect.LinkedListMultimap$KeyList r0 = (com.google.common.collect.LinkedListMultimap.KeyList) r0
            java.util.Objects.requireNonNull(r0)
            int r1 = r0.count
            int r1 = r1 + (-1)
            r0.count = r1
            com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r4.previousSibling
            if (r1 != 0) goto L57
            com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r4.nextSibling
            java.util.Objects.requireNonNull(r1)
            r2 = r1
            com.google.common.collect.LinkedListMultimap$Node r2 = (com.google.common.collect.LinkedListMultimap.Node) r2
            r0.head = r1
            goto L5b
        L57:
            com.google.common.collect.LinkedListMultimap$Node<K, V> r2 = r4.nextSibling
            r1.nextSibling = r2
        L5b:
            com.google.common.collect.LinkedListMultimap$Node<K, V> r1 = r4.nextSibling
            if (r1 != 0) goto L6a
            com.google.common.collect.LinkedListMultimap$Node<K, V> r4 = r4.previousSibling
            java.util.Objects.requireNonNull(r4)
            r1 = r4
            com.google.common.collect.LinkedListMultimap$Node r1 = (com.google.common.collect.LinkedListMultimap.Node) r1
            r0.tail = r4
            goto L6e
        L6a:
            com.google.common.collect.LinkedListMultimap$Node<K, V> r4 = r4.previousSibling
            r1.previousSibling = r4
        L6e:
            int r4 = r3.size
            int r4 = r4 + (-1)
            r3.size = r4
            return
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r4) throws java.io.IOException {
            r3 = this;
            r4.defaultWriteObject()
            int r0 = r3.size()
            r4.writeInt(r0)
            java.util.List r0 = r3.entries()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r4.writeObject(r2)
            java.lang.Object r1 = r1.getValue()
            r4.writeObject(r1)
            goto L12
        L2d:
            return
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Map asMap() {
            r1 = this;
            java.util.Map r0 = super.asMap()
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
            r1 = this;
            r0 = 0
            r1.head = r0
            r1.tail = r0
            java.util.Map<K, com.google.common.collect.LinkedListMultimap$KeyList<K, V>> r0 = r1.keyToKeyList
            r0.clear()
            r0 = 0
            r1.size = r0
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.containsEntry(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map<K, com.google.common.collect.LinkedListMultimap$KeyList<K, V>> r0 = r1.keyToKeyList
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.List r0 = r1.values()
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Map<K, java.util.Collection<V>> createAsMap() {
            r1 = this;
            com.google.common.collect.Multimaps$AsMap r0 = new com.google.common.collect.Multimaps$AsMap
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Collection createEntries() {
            r1 = this;
            com.google.common.collect.LinkedListMultimap$1EntriesImpl r0 = new com.google.common.collect.LinkedListMultimap$1EntriesImpl
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Set<K> createKeySet() {
            r1 = this;
            com.google.common.collect.LinkedListMultimap$1KeySetImpl r0 = new com.google.common.collect.LinkedListMultimap$1KeySetImpl
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final com.google.common.collect.Multiset<K> createKeys() {
            r1 = this;
            com.google.common.collect.Multimaps$Keys r0 = new com.google.common.collect.Multimaps$Keys
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Collection createValues() {
            r1 = this;
            com.google.common.collect.LinkedListMultimap$1ValuesImpl r0 = new com.google.common.collect.LinkedListMultimap$1ValuesImpl
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection entries() {
            r1 = this;
            java.util.List r0 = r1.entries()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.List<java.util.Map.Entry<K, V>> entries() {
            r1 = this;
            java.util.Collection r0 = super.entries()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> get(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            com.google.common.collect.LinkedListMultimap$1 r0 = new com.google.common.collect.LinkedListMultimap$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean isEmpty() {
            r1 = this;
            com.google.common.collect.LinkedListMultimap$Node<K, V> r0 = r1.head
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
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

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean put(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness V r3) {
            r1 = this;
            r0 = 0
            r1.addNode(r2, r3, r0)
            r2 = 1
            return r2
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

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.List<V> removeAll(java.lang.Object r2) {
            r1 = this;
            java.util.List r0 = r1.getCopy(r2)
            r1.removeAllNodes(r2)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.List r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.List<V> replaceValues(@com.google.common.collect.ParametricNullness K r3, java.lang.Iterable<? extends V> r4) {
            r2 = this;
            java.util.List r0 = r2.getCopy(r3)
            com.google.common.collect.LinkedListMultimap$ValueForKeyIterator r1 = new com.google.common.collect.LinkedListMultimap$ValueForKeyIterator
            r1.<init>(r2, r3)
            java.util.Iterator r3 = r4.iterator()
        Ld:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L24
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L24
            r1.next()
            java.lang.Object r4 = r3.next()
            r1.set(r4)
            goto Ld
        L24:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L31
            r1.next()
            r1.remove()
            goto L24
        L31:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3f
            java.lang.Object r4 = r3.next()
            r1.add(r4)
            goto L31
        L3f:
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            java.util.List r0 = r1.values()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.List<V> values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            java.util.List r0 = (java.util.List) r0
            return r0
    }
}
