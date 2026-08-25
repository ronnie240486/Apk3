package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtIncompatible
class MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>> extends java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, java.io.Serializable {
    public static final com.google.common.collect.MapMakerInternalMap.WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry> UNSET_WEAK_VALUE_REFERENCE = null;
    private static final long serialVersionUID = 5;
    public final int concurrencyLevel;
    public final transient com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, E, S> entryHelper;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    public final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public transient java.util.Set<K> keySet;
    public final transient int segmentMask;
    public final transient int segmentShift;
    public final transient com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>[] segments;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public transient java.util.Collection<V> values;


    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class AbstractSerializationProxy<K, V> extends com.google.common.collect.ForwardingConcurrentMap<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 3;
        public transient java.util.concurrent.ConcurrentMap<K, V> delegate;

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.concurrent.ConcurrentMap<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.util.Map delegate() {
                r1 = this;
                java.util.concurrent.ConcurrentMap<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final java.util.concurrent.ConcurrentMap<K, V> delegate() {
                r1 = this;
                java.util.concurrent.ConcurrentMap<K, V> r0 = r1.delegate
                return r0
        }
    }

    public static abstract class AbstractStrongKeyEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> implements com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
        public final int hash;
        public final K key;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public final E next;

        public AbstractStrongKeyEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r3) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.hash = r2
                r0.next = r3
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
                r1 = this;
                int r0 = r1.hash
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
                r1 = this;
                E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E> r0 = r1.next
                return r0
        }
    }

    public static abstract class AbstractWeakKeyEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends java.lang.ref.WeakReference<K> implements com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
        public final int hash;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public final E next;

        public AbstractWeakKeyEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r4) {
                r0 = this;
                r0.<init>(r2, r1)
                r0.hash = r3
                r0.next = r4
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
                r1 = this;
                int r0 = r1.hash
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public K getKey() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
                r1 = this;
                E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E> r0 = r1.next
                return r0
        }
    }

    public static final class CleanupMapTask implements java.lang.Runnable {
        public final java.lang.ref.WeakReference<com.google.common.collect.MapMakerInternalMap<?, ?, ?, ?>> mapReference;

        public CleanupMapTask(com.google.common.collect.MapMakerInternalMap<?, ?, ?, ?> r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mapReference = r0
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.ref.WeakReference<com.google.common.collect.MapMakerInternalMap<?, ?, ?, ?>> r0 = r4.mapReference
                java.lang.Object r0 = r0.get()
                com.google.common.collect.MapMakerInternalMap r0 = (com.google.common.collect.MapMakerInternalMap) r0
                if (r0 == 0) goto L19
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r0 = r0.segments
                int r1 = r0.length
                r2 = 0
            Le:
                if (r2 >= r1) goto L18
                r3 = r0[r2]
                r3.runLockedCleanup()
                int r2 = r2 + 1
                goto Le
            L18:
                return
            L19:
                java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class DummyInternalEntry implements com.google.common.collect.MapMakerInternalMap.InternalEntry<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap.DummyInternalEntry> {
        private DummyInternalEntry() {
                r1 = this;
                r1.<init>()
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public java.lang.Object getKey() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public com.google.common.collect.MapMakerInternalMap.DummyInternalEntry getNext() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry getNext() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$DummyInternalEntry r0 = r1.getNext()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public java.lang.Object getValue() {
                r1 = this;
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }
    }

    public final class EntryIterator extends com.google.common.collect.MapMakerInternalMap<K, V, E, S>.HashIterator<java.util.Map.Entry<K, V>> {
        public EntryIterator(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WriteThroughEntry r0 = r1.nextEntry()
                return r0
        }
    }

    public final class EntrySet extends com.google.common.collect.MapMakerInternalMap.SafeToArraySet<java.util.Map.Entry<K, V>> {
        public final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;

        public EntrySet(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto Lf
                return r1
            Lf:
                com.google.common.collect.MapMakerInternalMap r2 = r3.this$0
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L28
                com.google.common.collect.MapMakerInternalMap r2 = r3.this$0
                com.google.common.base.Equivalence r2 = r2.valueEquivalence()
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.equivalent(r4, r0)
                if (r4 == 0) goto L28
                r1 = 1
            L28:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$EntryIterator r0 = new com.google.common.collect.MapMakerInternalMap$EntryIterator
                com.google.common.collect.MapMakerInternalMap r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L1b
                com.google.common.collect.MapMakerInternalMap r2 = r3.this$0
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L1b
                r1 = 1
            L1b:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public abstract class HashIterator<T> implements java.util.Iterator<T> {

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> currentSegment;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public java.util.concurrent.atomic.AtomicReferenceArray<E> currentTable;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry lastReturned;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public E nextEntry;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry nextExternal;
        public int nextSegmentIndex;
        public int nextTableIndex;
        public final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;

        public HashIterator(com.google.common.collect.MapMakerInternalMap r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r2 = r2.segments
                int r2 = r2.length
                r0 = -1
                int r2 = r2 + r0
                r1.nextSegmentIndex = r2
                r1.nextTableIndex = r0
                r1.advance()
                return
        }

        public final void advance() {
                r3 = this;
                r0 = 0
                r3.nextExternal = r0
                boolean r0 = r3.nextInChain()
                if (r0 == 0) goto La
                return
            La:
                boolean r0 = r3.nextInTable()
                if (r0 == 0) goto L11
                return
            L11:
                int r0 = r3.nextSegmentIndex
                if (r0 < 0) goto L39
                com.google.common.collect.MapMakerInternalMap r1 = r3.this$0
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r1 = r1.segments
                int r2 = r0 + (-1)
                r3.nextSegmentIndex = r2
                r0 = r1[r0]
                r3.currentSegment = r0
                int r0 = r0.count
                if (r0 == 0) goto L11
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r3.currentSegment
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r0.table
                r3.currentTable = r0
                int r0 = r0.length()
                int r0 = r0 + (-1)
                r3.nextTableIndex = r0
                boolean r0 = r3.nextInTable()
                if (r0 == 0) goto L11
            L39:
                return
        }

        public final boolean advanceTo(E r4) {
                r3 = this;
                java.lang.Object r0 = r4.getKey()     // Catch: java.lang.Throwable -> L29
                com.google.common.collect.MapMakerInternalMap r1 = r3.this$0     // Catch: java.lang.Throwable -> L29
                java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L29
                java.lang.Object r1 = r4.getKey()     // Catch: java.lang.Throwable -> L29
                if (r1 != 0) goto L11
                r4 = 0
                goto L15
            L11:
                java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L29
            L15:
                if (r4 == 0) goto L27
                com.google.common.collect.MapMakerInternalMap$WriteThroughEntry r1 = new com.google.common.collect.MapMakerInternalMap$WriteThroughEntry     // Catch: java.lang.Throwable -> L29
                com.google.common.collect.MapMakerInternalMap r2 = r3.this$0     // Catch: java.lang.Throwable -> L29
                r1.<init>(r2, r0, r4)     // Catch: java.lang.Throwable -> L29
                r3.nextExternal = r1     // Catch: java.lang.Throwable -> L29
                r4 = 1
            L21:
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r3.currentSegment
                r0.postReadCleanup()
                return r4
            L27:
                r4 = 0
                goto L21
            L29:
                r4 = move-exception
                com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r3.currentSegment
                r0.postReadCleanup()
                throw r4
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E, S>$WriteThroughEntry r0 = r1.nextExternal
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.Iterator
        public abstract T next();

        public final com.google.common.collect.MapMakerInternalMap<K, V, E, S>.WriteThroughEntry nextEntry() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E, S>$WriteThroughEntry r0 = r1.nextExternal
                if (r0 == 0) goto Lc
                r1.lastReturned = r0
                r1.advance()
                com.google.common.collect.MapMakerInternalMap<K, V, E, S>$WriteThroughEntry r0 = r1.lastReturned
                return r0
            Lc:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        public final boolean nextInChain() {
                r1 = this;
                E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E> r0 = r1.nextEntry
                if (r0 == 0) goto L19
            L4:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r0 = r0.getNext()
                r1.nextEntry = r0
                E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E> r0 = r1.nextEntry
                if (r0 == 0) goto L19
                boolean r0 = r1.advanceTo(r0)
                if (r0 == 0) goto L16
                r0 = 1
                return r0
            L16:
                E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E> r0 = r1.nextEntry
                goto L4
            L19:
                r0 = 0
                return r0
        }

        public final boolean nextInTable() {
                r3 = this;
            L0:
                int r0 = r3.nextTableIndex
                if (r0 < 0) goto L22
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r1 = r3.currentTable
                int r2 = r0 + (-1)
                r3.nextTableIndex = r2
                java.lang.Object r0 = r1.get(r0)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r0 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r0
                r3.nextEntry = r0
                if (r0 == 0) goto L0
                boolean r0 = r3.advanceTo(r0)
                if (r0 != 0) goto L20
                boolean r0 = r3.nextInChain()
                if (r0 == 0) goto L0
            L20:
                r0 = 1
                return r0
            L22:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E, S>$WriteThroughEntry r0 = r2.lastReturned
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                com.google.common.collect.CollectPreconditions.checkRemove(r0)
                com.google.common.collect.MapMakerInternalMap r0 = r2.this$0
                com.google.common.collect.MapMakerInternalMap<K, V, E, S>$WriteThroughEntry r1 = r2.lastReturned
                java.lang.Object r1 = r1.getKey()
                r0.remove(r1)
                r0 = 0
                r2.lastReturned = r0
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface InternalEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>> {
        E copy(S r1, E r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r3);

        com.google.common.collect.MapMakerInternalMap.Strength keyStrength();

        E newEntry(S r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r4);

        S newSegment(com.google.common.collect.MapMakerInternalMap<K, V, E, S> r1, int r2, int r3);

        void setValue(S r1, E r2, V r3);

        com.google.common.collect.MapMakerInternalMap.Strength valueStrength();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class KeyIterator extends com.google.common.collect.MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        public KeyIterator(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public K next() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WriteThroughEntry r0 = r1.nextEntry()
                java.lang.Object r0 = r0.getKey()
                return r0
        }
    }

    public final class KeySet extends com.google.common.collect.MapMakerInternalMap.SafeToArraySet<K> {
        public final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;

        public KeySet(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$KeyIterator r0 = new com.google.common.collect.MapMakerInternalMap$KeyIterator
                com.google.common.collect.MapMakerInternalMap r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                java.lang.Object r2 = r0.remove(r2)
                if (r2 == 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class SafeToArraySet<E> extends java.util.AbstractSet<E> {
        private SafeToArraySet() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ SafeToArraySet(com.google.common.collect.MapMakerInternalMap.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.collect.MapMakerInternalMap.access$900(r1)
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.collect.MapMakerInternalMap.access$900(r1)
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }
    }

    public static abstract class Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S>> extends java.util.concurrent.locks.ReentrantLock {
        public static final /* synthetic */ int $r8$clinit = 0;
        public volatile int count;

        @com.google.j2objc.annotations.Weak
        public final com.google.common.collect.MapMakerInternalMap<K, V, E, S> map;
        public int modCount;
        public final java.util.concurrent.atomic.AtomicInteger readCount;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public volatile java.util.concurrent.atomic.AtomicReferenceArray<E> table;
        public int threshold;

        public Segment(com.google.common.collect.MapMakerInternalMap<K, V, E, S> r2, int r3, int r4) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.readCount = r0
                r1.map = r2
                java.util.concurrent.atomic.AtomicReferenceArray r2 = new java.util.concurrent.atomic.AtomicReferenceArray
                r2.<init>(r3)
                int r3 = r2.length()
                int r3 = r3 * 3
                int r3 = r3 / 4
                r1.threshold = r3
                if (r3 != r4) goto L21
                int r3 = r3 + 1
                r1.threshold = r3
            L21:
                r1.table = r2
                return
        }

        public final <T> void clearReferenceQueue(java.lang.ref.ReferenceQueue<T> r2) {
                r1 = this;
            L0:
                java.lang.ref.Reference r0 = r2.poll()
                if (r0 == 0) goto L7
                goto L0
            L7:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final void drainKeyReferenceQueue(java.lang.ref.ReferenceQueue<K> r8) {
                r7 = this;
                r0 = 0
            L1:
                java.lang.ref.Reference r1 = r8.poll()
                if (r1 == 0) goto L55
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r1
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r2 = r7.map
                java.util.Objects.requireNonNull(r2)
                int r3 = r1.getHash()
                com.google.common.collect.MapMakerInternalMap$Segment r2 = r2.segmentFor(r3)
                r2.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r4 = r2.table     // Catch: java.lang.Throwable -> L50
                int r5 = r4.length()     // Catch: java.lang.Throwable -> L50
                int r5 = r5 + (-1)
                r3 = r3 & r5
                java.lang.Object r5 = r4.get(r3)     // Catch: java.lang.Throwable -> L50
                com.google.common.collect.MapMakerInternalMap$InternalEntry r5 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r5     // Catch: java.lang.Throwable -> L50
                r6 = r5
            L29:
                if (r6 == 0) goto L46
                if (r6 != r1) goto L41
                int r1 = r2.modCount     // Catch: java.lang.Throwable -> L50
                int r1 = r1 + 1
                r2.modCount = r1     // Catch: java.lang.Throwable -> L50
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = r2.removeFromChain(r5, r6)     // Catch: java.lang.Throwable -> L50
                int r5 = r2.count     // Catch: java.lang.Throwable -> L50
                int r5 = r5 + (-1)
                r4.set(r3, r1)     // Catch: java.lang.Throwable -> L50
                r2.count = r5     // Catch: java.lang.Throwable -> L50
                goto L46
            L41:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = r6.getNext()     // Catch: java.lang.Throwable -> L50
                goto L29
            L46:
                r2.unlock()
                int r0 = r0 + 1
                r1 = 16
                if (r0 != r1) goto L1
                goto L55
            L50:
                r8 = move-exception
                r2.unlock()
                throw r8
            L55:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final void drainValueReferenceQueue(java.lang.ref.ReferenceQueue<V> r12) {
                r11 = this;
                r0 = 0
            L1:
                java.lang.ref.Reference r1 = r12.poll()
                if (r1 == 0) goto L7a
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r1 = (com.google.common.collect.MapMakerInternalMap.WeakValueReference) r1
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r2 = r11.map
                java.util.Objects.requireNonNull(r2)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = r1.getEntry()
                int r4 = r3.getHash()
                com.google.common.collect.MapMakerInternalMap$Segment r2 = r2.segmentFor(r4)
                java.lang.Object r3 = r3.getKey()
                r2.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r5 = r2.table     // Catch: java.lang.Throwable -> L75
                int r6 = r5.length()     // Catch: java.lang.Throwable -> L75
                int r6 = r6 + (-1)
                r6 = r6 & r4
                java.lang.Object r7 = r5.get(r6)     // Catch: java.lang.Throwable -> L75
                com.google.common.collect.MapMakerInternalMap$InternalEntry r7 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r7     // Catch: java.lang.Throwable -> L75
                r8 = r7
            L31:
                if (r8 == 0) goto L6b
                java.lang.Object r9 = r8.getKey()     // Catch: java.lang.Throwable -> L75
                int r10 = r8.getHash()     // Catch: java.lang.Throwable -> L75
                if (r10 != r4) goto L66
                if (r9 == 0) goto L66
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r10 = r2.map     // Catch: java.lang.Throwable -> L75
                com.google.common.base.Equivalence<java.lang.Object> r10 = r10.keyEquivalence     // Catch: java.lang.Throwable -> L75
                boolean r9 = r10.equivalent(r3, r9)     // Catch: java.lang.Throwable -> L75
                if (r9 == 0) goto L66
                r3 = r8
                com.google.common.collect.MapMakerInternalMap$WeakValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.WeakValueEntry) r3     // Catch: java.lang.Throwable -> L75
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r3 = r3.getValueReference()     // Catch: java.lang.Throwable -> L75
                if (r3 != r1) goto L6b
                int r1 = r2.modCount     // Catch: java.lang.Throwable -> L75
                int r1 = r1 + 1
                r2.modCount = r1     // Catch: java.lang.Throwable -> L75
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = r2.removeFromChain(r7, r8)     // Catch: java.lang.Throwable -> L75
                int r3 = r2.count     // Catch: java.lang.Throwable -> L75
                int r3 = r3 + (-1)
                r5.set(r6, r1)     // Catch: java.lang.Throwable -> L75
                r2.count = r3     // Catch: java.lang.Throwable -> L75
                goto L6b
            L66:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r8 = r8.getNext()     // Catch: java.lang.Throwable -> L75
                goto L31
            L6b:
                r2.unlock()
                int r0 = r0 + 1
                r1 = 16
                if (r0 != r1) goto L1
                goto L7a
            L75:
                r12 = move-exception
                r2.unlock()
                throw r12
            L7a:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final void expand() {
                r12 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r12.table
                int r1 = r0.length()
                r2 = 1073741824(0x40000000, float:2.0)
                if (r1 < r2) goto Lb
                return
            Lb:
                int r2 = r12.count
                int r3 = r1 << 1
                java.util.concurrent.atomic.AtomicReferenceArray r4 = new java.util.concurrent.atomic.AtomicReferenceArray
                r4.<init>(r3)
                int r3 = r4.length()
                int r3 = r3 * 3
                int r3 = r3 / 4
                r12.threshold = r3
                int r3 = r4.length()
                int r3 = r3 + (-1)
                r5 = 0
            L25:
                if (r5 >= r1) goto L7b
                java.lang.Object r6 = r0.get(r5)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r6
                if (r6 == 0) goto L78
                com.google.common.collect.MapMakerInternalMap$InternalEntry r7 = r6.getNext()
                int r8 = r6.getHash()
                r8 = r8 & r3
                if (r7 != 0) goto L3e
                r4.set(r8, r6)
                goto L78
            L3e:
                r9 = r6
            L3f:
                if (r7 == 0) goto L4f
                int r10 = r7.getHash()
                r10 = r10 & r3
                if (r10 == r8) goto L4a
                r9 = r7
                r8 = r10
            L4a:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r7 = r7.getNext()
                goto L3f
            L4f:
                r4.set(r8, r9)
            L52:
                if (r6 == r9) goto L78
                int r7 = r6.getHash()
                r7 = r7 & r3
                java.lang.Object r8 = r4.get(r7)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r8 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r8
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r10 = r12.map
                com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r10 = r10.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r11 = r12.self()
                com.google.common.collect.MapMakerInternalMap$InternalEntry r8 = r10.copy(r11, r6, r8)
                if (r8 == 0) goto L71
                r4.set(r7, r8)
                goto L73
            L71:
                int r2 = r2 + (-1)
            L73:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = r6.getNext()
                goto L52
            L78:
                int r5 = r5 + 1
                goto L25
            L7b:
                r12.table = r4
                r12.count = r2
                return
        }

        public final E getEntry(java.lang.Object r4, int r5) {
                r3 = this;
                int r0 = r3.count
                if (r0 == 0) goto L36
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r3.table
                int r1 = r0.length()
                int r1 = r1 + (-1)
                r1 = r1 & r5
                java.lang.Object r0 = r0.get(r1)
                com.google.common.collect.MapMakerInternalMap$InternalEntry r0 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r0
            L13:
                if (r0 == 0) goto L36
                int r1 = r0.getHash()
                if (r1 == r5) goto L1c
                goto L31
            L1c:
                java.lang.Object r1 = r0.getKey()
                if (r1 != 0) goto L26
                r3.tryDrainReferenceQueues()
                goto L31
            L26:
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r2 = r3.map
                com.google.common.base.Equivalence<java.lang.Object> r2 = r2.keyEquivalence
                boolean r1 = r2.equivalent(r4, r1)
                if (r1 == 0) goto L31
                return r0
            L31:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r0 = r0.getNext()
                goto L13
            L36:
                r4 = 0
                return r4
        }

        public void maybeClearReferenceQueues() {
                r0 = this;
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public void maybeDrainReferenceQueues() {
                r0 = this;
                return
        }

        public final void postReadCleanup() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.readCount
                int r0 = r0.incrementAndGet()
                r0 = r0 & 63
                if (r0 != 0) goto Ld
                r1.runLockedCleanup()
            Ld:
                return
        }

        public final V put(K r9, int r10, V r11, boolean r12) {
                r8 = this;
                r8.lock()
                r8.runLockedCleanup()     // Catch: java.lang.Throwable -> L8b
                int r0 = r8.count     // Catch: java.lang.Throwable -> L8b
                int r0 = r0 + 1
                int r1 = r8.threshold     // Catch: java.lang.Throwable -> L8b
                if (r0 <= r1) goto L15
                r8.expand()     // Catch: java.lang.Throwable -> L8b
                int r0 = r8.count     // Catch: java.lang.Throwable -> L8b
                int r0 = r0 + 1
            L15:
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r1 = r8.table     // Catch: java.lang.Throwable -> L8b
                int r2 = r1.length()     // Catch: java.lang.Throwable -> L8b
                int r2 = r2 + (-1)
                r2 = r2 & r10
                java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L8b
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3     // Catch: java.lang.Throwable -> L8b
                r4 = r3
            L25:
                r5 = 0
                if (r4 == 0) goto L6d
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L8b
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L8b
                if (r7 != r10) goto L68
                if (r6 == 0) goto L68
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r7 = r8.map     // Catch: java.lang.Throwable -> L8b
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch: java.lang.Throwable -> L8b
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L8b
                if (r6 == 0) goto L68
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L8b
                if (r9 != 0) goto L55
                int r9 = r8.modCount     // Catch: java.lang.Throwable -> L8b
                int r9 = r9 + 1
                r8.modCount = r9     // Catch: java.lang.Throwable -> L8b
                r8.setValue(r4, r11)     // Catch: java.lang.Throwable -> L8b
                int r9 = r8.count     // Catch: java.lang.Throwable -> L8b
                r8.count = r9     // Catch: java.lang.Throwable -> L8b
                r8.unlock()
                return r5
            L55:
                if (r12 == 0) goto L5b
                r8.unlock()
                return r9
            L5b:
                int r10 = r8.modCount     // Catch: java.lang.Throwable -> L8b
                int r10 = r10 + 1
                r8.modCount = r10     // Catch: java.lang.Throwable -> L8b
                r8.setValue(r4, r11)     // Catch: java.lang.Throwable -> L8b
                r8.unlock()
                return r9
            L68:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r4.getNext()     // Catch: java.lang.Throwable -> L8b
                goto L25
            L6d:
                int r12 = r8.modCount     // Catch: java.lang.Throwable -> L8b
                int r12 = r12 + 1
                r8.modCount = r12     // Catch: java.lang.Throwable -> L8b
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r12 = r8.map     // Catch: java.lang.Throwable -> L8b
                com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r12 = r12.entryHelper     // Catch: java.lang.Throwable -> L8b
                com.google.common.collect.MapMakerInternalMap$Segment r4 = r8.self()     // Catch: java.lang.Throwable -> L8b
                com.google.common.collect.MapMakerInternalMap$InternalEntry r9 = r12.newEntry(r4, r9, r10, r3)     // Catch: java.lang.Throwable -> L8b
                r8.setValue(r9, r11)     // Catch: java.lang.Throwable -> L8b
                r1.set(r2, r9)     // Catch: java.lang.Throwable -> L8b
                r8.count = r0     // Catch: java.lang.Throwable -> L8b
                r8.unlock()
                return r5
            L8b:
                r9 = move-exception
                r8.unlock()
                throw r9
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final E removeFromChain(E r5, E r6) {
                r4 = this;
                int r0 = r4.count
                com.google.common.collect.MapMakerInternalMap$InternalEntry r1 = r6.getNext()
            L6:
                if (r5 == r6) goto L1f
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r2 = r4.map
                com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r2 = r2.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r3 = r4.self()
                com.google.common.collect.MapMakerInternalMap$InternalEntry r2 = r2.copy(r3, r5, r1)
                if (r2 == 0) goto L18
                r1 = r2
                goto L1a
            L18:
                int r0 = r0 + (-1)
            L1a:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r5 = r5.getNext()
                goto L6
            L1f:
                r4.count = r0
                return r1
        }

        public final void runLockedCleanup() {
                r2 = this;
                boolean r0 = r2.tryLock()
                if (r0 == 0) goto L18
                r2.maybeDrainReferenceQueues()     // Catch: java.lang.Throwable -> L13
                java.util.concurrent.atomic.AtomicInteger r0 = r2.readCount     // Catch: java.lang.Throwable -> L13
                r1 = 0
                r0.set(r1)     // Catch: java.lang.Throwable -> L13
                r2.unlock()
                goto L18
            L13:
                r0 = move-exception
                r2.unlock()
                throw r0
            L18:
                return
        }

        public abstract S self();

        public final void setValue(E r3, V r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r2.map
                com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r0.entryHelper
                com.google.common.collect.MapMakerInternalMap$Segment r1 = r2.self()
                r0.setValue(r1, r3, r4)
                return
        }

        public final void tryDrainReferenceQueues() {
                r1 = this;
                boolean r0 = r1.tryLock()
                if (r0 == 0) goto L12
                r1.maybeDrainReferenceQueues()     // Catch: java.lang.Throwable -> Ld
                r1.unlock()
                goto L12
            Ld:
                r0 = move-exception
                r1.unlock()
                throw r0
            L12:
                return
        }
    }

    public static final class SerializationProxy<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        private void readObject(java.io.ObjectInputStream r4) throws java.io.IOException, java.lang.ClassNotFoundException {
                r3 = this;
                r4.defaultReadObject()
                int r0 = r4.readInt()
                com.google.common.collect.MapMaker r1 = new com.google.common.collect.MapMaker
                r1.<init>()
                com.google.common.collect.MapMaker r0 = r1.initialCapacity(r0)
                r1 = 0
                r0.setKeyStrength(r1)
                r0.setValueStrength(r1)
                r0.keyEquivalence(r1)
                r1 = 0
                com.google.common.collect.MapMaker r0 = r0.concurrencyLevel(r1)
                java.util.concurrent.ConcurrentMap r0 = r0.makeMap()
                r3.delegate = r0
            L25:
                java.lang.Object r0 = r4.readObject()
                if (r0 != 0) goto L2c
                return
            L2c:
                java.lang.Object r1 = r4.readObject()
                java.util.concurrent.ConcurrentMap<K, V> r2 = r3.delegate
                r2.put(r0, r1)
                goto L25
        }

        private java.lang.Object readResolve() {
                r1 = this;
                java.util.concurrent.ConcurrentMap<K, V> r0 = r1.delegate
                return r0
        }

        private void writeObject(java.io.ObjectOutputStream r4) throws java.io.IOException {
                r3 = this;
                r4.defaultWriteObject()
                java.util.concurrent.ConcurrentMap<K, V> r0 = r3.delegate
                int r0 = r0.size()
                r4.writeInt(r0)
                java.util.concurrent.ConcurrentMap<K, V> r0 = r3.delegate
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L16:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L31
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                r4.writeObject(r2)
                java.lang.Object r1 = r1.getValue()
                r4.writeObject(r1)
                goto L16
            L31:
                r0 = 0
                r4.writeObject(r0)
                return
        }
    }

    public static abstract enum Strength extends java.lang.Enum<com.google.common.collect.MapMakerInternalMap.Strength> {
        private static final /* synthetic */ com.google.common.collect.MapMakerInternalMap.Strength[] $VALUES = null;
        public static final com.google.common.collect.MapMakerInternalMap.Strength STRONG = null;
        public static final com.google.common.collect.MapMakerInternalMap.Strength WEAK = null;



        private static /* synthetic */ com.google.common.collect.MapMakerInternalMap.Strength[] $values() {
                r0 = 2
                com.google.common.collect.MapMakerInternalMap$Strength[] r0 = new com.google.common.collect.MapMakerInternalMap.Strength[r0]
                com.google.common.collect.MapMakerInternalMap$Strength r1 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                r2 = 0
                r0[r2] = r1
                com.google.common.collect.MapMakerInternalMap$Strength r1 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.collect.MapMakerInternalMap$Strength$1 r0 = new com.google.common.collect.MapMakerInternalMap$Strength$1
                r0.<init>()
                com.google.common.collect.MapMakerInternalMap.Strength.STRONG = r0
                com.google.common.collect.MapMakerInternalMap$Strength$2 r0 = new com.google.common.collect.MapMakerInternalMap$Strength$2
                r0.<init>()
                com.google.common.collect.MapMakerInternalMap.Strength.WEAK = r0
                com.google.common.collect.MapMakerInternalMap$Strength[] r0 = $values()
                com.google.common.collect.MapMakerInternalMap.Strength.$VALUES = r0
                return
        }

        private Strength(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ Strength(java.lang.String r1, int r2, com.google.common.collect.MapMakerInternalMap.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.collect.MapMakerInternalMap.Strength valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.collect.MapMakerInternalMap$Strength> r0 = com.google.common.collect.MapMakerInternalMap.Strength.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.collect.MapMakerInternalMap$Strength r1 = (com.google.common.collect.MapMakerInternalMap.Strength) r1
                return r1
        }

        public static com.google.common.collect.MapMakerInternalMap.Strength[] values() {
                com.google.common.collect.MapMakerInternalMap$Strength[] r0 = com.google.common.collect.MapMakerInternalMap.Strength.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.collect.MapMakerInternalMap$Strength[] r0 = (com.google.common.collect.MapMakerInternalMap.Strength[]) r0
                return r0
        }

        public abstract com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class StrongKeyDummyValueEntry<K> extends com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>> {

        public static final class Helper<K> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> {
            private static final com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper<?> INSTANCE = null;

            static {
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper
                    r0.<init>()
                    com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper.INSTANCE = r0
                    return
            }

            public Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static <K> com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper<K> instance() {
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper<?> r0 = com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper.INSTANCE
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry copy(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) r2
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) r3
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r1 = r0.copy(r1, r2, r3)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> r2, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r2 = new com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry
                    K r0 = r3.key
                    int r3 = r3.hash
                    r2.<init>(r0, r3, r4)
                    return r2
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment r1, java.lang.Object r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r4 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) r4
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r1 = r0.newEntry(r1, r2, r3, r4)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> newEntry(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r1 = new com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry
                    r1.<init>(r2, r3, r4)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment newSegment(com.google.common.collect.MapMakerInternalMap r1, int r2, int r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment r1 = r0.newSegment(r1, r2, r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> newSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> r2, int r3, int r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, com.google.common.collect.MapMaker.Dummy r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) r2
                    com.google.common.collect.MapMaker$Dummy r3 = (com.google.common.collect.MapMaker.Dummy) r3
                    r0.setValue(r1, r2, r3)
                    return
            }

            public void setValue(com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K> r1, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> r2, com.google.common.collect.MapMaker.Dummy r3) {
                    r0 = this;
                    return
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }
        }

        public StrongKeyDummyValueEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public com.google.common.collect.MapMaker.Dummy getValue() {
                r1 = this;
                com.google.common.collect.MapMaker$Dummy r0 = com.google.common.collect.MapMaker.Dummy.VALUE
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ java.lang.Object getValue() {
                r1 = this;
                com.google.common.collect.MapMaker$Dummy r0 = r1.getValue()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class StrongKeyDummyValueSegment<K> extends com.google.common.collect.MapMakerInternalMap.Segment<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> {
        public StrongKeyDummyValueSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueSegment<K>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r1 = r0.m297castForTesting(r1)
                return r1
        }

        /* JADX INFO: renamed from: castForTesting, reason: collision with other method in class */
        public com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry<K> m297castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, com.google.common.collect.MapMaker.Dummy, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry) r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.Segment self() {
                r0 = this;
                return r0
        }
    }

    public static final class StrongKeyStrongValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>> {

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private volatile V value;

        /* JADX INFO: loaded from: classes2.dex */
        public static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper<?, ?> INSTANCE = null;

            static {
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry$Helper r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry$Helper
                    r0.<init>()
                    com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper.INSTANCE = r0
                    return
            }

            public Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static <K, V> com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper<K, V> instance() {
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry$Helper<?, ?> r0 = com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper.INSTANCE
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry copy(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) r2
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) r3
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r1 = r0.copy(r1, r2, r3)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> r1, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r1 = r2.copy(r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment r1, java.lang.Object r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r4 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) r4
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r1 = r0.newEntry(r1, r2, r3, r4)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r1 = new com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry
                    r1.<init>(r2, r3, r4)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment newSegment(com.google.common.collect.MapMakerInternalMap r1, int r2, int r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment r1 = r0.newSegment(r1, r2, r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> r2, int r3, int r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, java.lang.Object r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) r2
                    r0.setValue(r1, r2, r3)
                    return
            }

            public void setValue(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> r1, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> r2, V r3) {
                    r0 = this;
                    r2.setValue(r3)
                    return
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }
        }

        public StrongKeyStrongValueEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r1 = 0
                r0.value = r1
                return
        }

        public final com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> r4) {
                r3 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry
                K r1 = r3.key
                int r2 = r3.hash
                r0.<init>(r1, r2, r4)
                V r4 = r3.value
                r0.value = r4
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        public final void setValue(V r1) {
                r0 = this;
                r0.value = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class StrongKeyStrongValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r1 = r0.m298castForTesting(r1)
                return r1
        }

        /* JADX INFO: renamed from: castForTesting, reason: collision with other method in class */
        public com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry<K, V> m298castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry) r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.Segment self() {
                r0 = this;
                return r0
        }
    }

    public static final class StrongKeyWeakValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.WeakValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> {
        private volatile com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> valueReference;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper<?, ?> INSTANCE = null;

            static {
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper
                    r0.<init>()
                    com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper.INSTANCE = r0
                    return
            }

            public Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static <K, V> com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper<K, V> instance() {
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper<?, ?> r0 = com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper.INSTANCE
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry copy(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) r2
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) r3
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r1 = r0.copy(r1, r2, r3)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> r2, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> r4) {
                    r1 = this;
                    int r0 = com.google.common.collect.MapMakerInternalMap.Segment.$r8$clinit
                    java.lang.Object r0 = r3.getValue()
                    if (r0 != 0) goto La
                    r0 = 1
                    goto Lb
                La:
                    r0 = 0
                Lb:
                    if (r0 == 0) goto Lf
                    r2 = 0
                    return r2
                Lf:
                    java.lang.ref.ReferenceQueue r2 = com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment.access$100(r2)
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r2 = r3.copy(r2, r4)
                    return r2
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment r1, java.lang.Object r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r4 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) r4
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r1 = r0.newEntry(r1, r2, r3, r4)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r1 = new com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry
                    r1.<init>(r2, r3, r4)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment newSegment(com.google.common.collect.MapMakerInternalMap r1, int r2, int r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment r1 = r0.newSegment(r1, r2, r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> r2, int r3, int r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, java.lang.Object r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) r2
                    r0.setValue(r1, r2, r3)
                    return
            }

            public void setValue(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> r1, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> r2, V r3) {
                    r0 = this;
                    java.lang.ref.ReferenceQueue r1 = com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment.access$100(r1)
                    r2.setValue(r3, r1)
                    return
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
                    return r0
            }
        }

        public StrongKeyWeakValueEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap$DummyInternalEntry> r1 = com.google.common.collect.MapMakerInternalMap.UNSET_WEAK_VALUE_REFERENCE
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap$DummyInternalEntry> r1 = com.google.common.collect.MapMakerInternalMap.UNSET_WEAK_VALUE_REFERENCE
                r0.valueReference = r1
                return
        }

        public static /* synthetic */ com.google.common.collect.MapMakerInternalMap.WeakValueReference access$600(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry r0) {
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry<K, V>> r0 = r0.valueReference
                return r0
        }

        public static /* synthetic */ com.google.common.collect.MapMakerInternalMap.WeakValueReference access$602(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry r0, com.google.common.collect.MapMakerInternalMap.WeakValueReference r1) {
                r0.valueReference = r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public void clearValue() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry<K, V>> r0 = r1.valueReference
                r0.clear()
                return
        }

        public final com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> copy(java.lang.ref.ReferenceQueue<V> r4, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> r5) {
                r3 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry
                K r1 = r3.key
                int r2 = r3.hash
                r0.<init>(r1, r2, r5)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry<K, V>> r5 = r3.valueReference
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r4 = r5.copyFor(r4, r0)
                r0.valueReference = r4
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public V getValue() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry<K, V>> r0 = r1.valueReference
                java.lang.Object r0 = r0.get()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> getValueReference() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry<K, V>> r0 = r1.valueReference
                return r0
        }

        public final void setValue(V r3, java.lang.ref.ReferenceQueue<V> r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry<K, V>> r0 = r2.valueReference
                com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl r1 = new com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl
                r1.<init>(r4, r3, r2)
                r2.valueReference = r1
                r0.clear()
                return
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> {
        private final java.lang.ref.ReferenceQueue<V> queueForValues;

        public StrongKeyWeakValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
                r1.<init>()
                r0.queueForValues = r1
                return
        }

        public static /* synthetic */ java.lang.ref.ReferenceQueue access$100(com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueSegment r0) {
                java.lang.ref.ReferenceQueue<V> r0 = r0.queueForValues
                return r0
        }

        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r1 = r0.m299castForTesting(r1)
                return r1
        }

        /* JADX INFO: renamed from: castForTesting, reason: collision with other method in class */
        public com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V> m299castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r1 = (com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry) r1
                return r1
        }

        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r1 = r0.m299castForTesting(r1)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r1 = r1.getValueReference()
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void maybeClearReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<V> r0 = r1.queueForValues
                r1.clearReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void maybeDrainReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<V> r0 = r1.queueForValues
                r1.drainValueReferenceQueue(r0)
                return
        }

        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r3, V r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl r0 = new com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl
                java.lang.ref.ReferenceQueue<V> r1 = r2.queueForValues
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r3 = r2.m299castForTesting(r3)
                r0.<init>(r1, r4, r3)
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.Segment self() {
                r0 = this;
                return r0
        }

        public void setWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r2, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> r3) {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry r2 = r1.m299castForTesting(r2)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r0 = com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.access$600(r2)
                com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.access$602(r2, r3)
                r0.clear()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface StrongValueEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class ValueIterator extends com.google.common.collect.MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        public ValueIterator(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public V next() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WriteThroughEntry r0 = r1.nextEntry()
                java.lang.Object r0 = r0.getValue()
                return r0
        }
    }

    public final class Values extends java.util.AbstractCollection<V> {
        public final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;

        public Values(com.google.common.collect.MapMakerInternalMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$ValueIterator r0 = new com.google.common.collect.MapMakerInternalMap$ValueIterator
                com.google.common.collect.MapMakerInternalMap r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.collect.MapMakerInternalMap.access$900(r1)
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.collect.MapMakerInternalMap.access$900(r1)
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class WeakKeyDummyValueEntry<K> extends com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>> {

        /* JADX INFO: loaded from: classes.dex */
        public static final class Helper<K> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> {
            private static final com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper<?> INSTANCE = null;

            static {
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry$Helper r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry$Helper
                    r0.<init>()
                    com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper.INSTANCE = r0
                    return
            }

            public Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static <K> com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper<K> instance() {
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry$Helper<?> r0 = com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper.INSTANCE
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry copy(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) r2
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) r3
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r1 = r0.copy(r1, r2, r3)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> copy(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> r3, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> r5) {
                    r2 = this;
                    java.lang.Object r0 = r4.getKey()
                    if (r0 != 0) goto L8
                    r3 = 0
                    return r3
                L8:
                    java.lang.ref.ReferenceQueue r3 = com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment.access$200(r3)
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry
                    java.lang.Object r1 = r4.getKey()
                    int r4 = r4.hash
                    r0.<init>(r3, r1, r4, r5)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment r1, java.lang.Object r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r4 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) r4
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r1 = r0.newEntry(r1, r2, r3, r4)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> newEntry(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> r2, K r3, int r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> r5) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry
                    java.lang.ref.ReferenceQueue r2 = com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment.access$200(r2)
                    r0.<init>(r2, r3, r4, r5)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment newSegment(com.google.common.collect.MapMakerInternalMap r1, int r2, int r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment r1 = r0.newSegment(r1, r2, r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> newSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> r2, int r3, int r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, com.google.common.collect.MapMaker.Dummy r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) r2
                    com.google.common.collect.MapMaker$Dummy r3 = (com.google.common.collect.MapMaker.Dummy) r3
                    r0.setValue(r1, r2, r3)
                    return
            }

            public void setValue(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K> r1, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> r2, com.google.common.collect.MapMaker.Dummy r3) {
                    r0 = this;
                    return
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }
        }

        public WeakKeyDummyValueEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public com.google.common.collect.MapMaker.Dummy getValue() {
                r1 = this;
                com.google.common.collect.MapMaker$Dummy r0 = com.google.common.collect.MapMaker.Dummy.VALUE
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ java.lang.Object getValue() {
                r1 = this;
                com.google.common.collect.MapMaker$Dummy r0 = r1.getValue()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class WeakKeyDummyValueSegment<K> extends com.google.common.collect.MapMakerInternalMap.Segment<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> {
        private final java.lang.ref.ReferenceQueue<K> queueForKeys;

        public WeakKeyDummyValueSegment(com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K>, com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment<K>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
                r1.<init>()
                r0.queueForKeys = r1
                return
        }

        public static /* synthetic */ java.lang.ref.ReferenceQueue access$200(com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueSegment r0) {
                java.lang.ref.ReferenceQueue<K> r0 = r0.queueForKeys
                return r0
        }

        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r1 = r0.m300castForTesting(r1)
                return r1
        }

        /* JADX INFO: renamed from: castForTesting, reason: collision with other method in class */
        public com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry<K> m300castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, com.google.common.collect.MapMaker.Dummy, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry) r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void maybeClearReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                r1.clearReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void maybeDrainReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                r1.drainKeyReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.Segment self() {
                r0 = this;
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class WeakKeyStrongValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.StrongValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>> {

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private volatile V value;

        public static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper<?, ?> INSTANCE = null;

            static {
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$Helper r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$Helper
                    r0.<init>()
                    com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper.INSTANCE = r0
                    return
            }

            public Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static <K, V> com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper<K, V> instance() {
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$Helper<?, ?> r0 = com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper.INSTANCE
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry copy(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) r2
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) r3
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r1 = r0.copy(r1, r2, r3)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> r2, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> r4) {
                    r1 = this;
                    java.lang.Object r0 = r3.getKey()
                    if (r0 != 0) goto L8
                    r2 = 0
                    return r2
                L8:
                    java.lang.ref.ReferenceQueue r2 = com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment.access$300(r2)
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r2 = r3.copy(r2, r4)
                    return r2
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment r1, java.lang.Object r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r4 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) r4
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r1 = r0.newEntry(r1, r2, r3, r4)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> r2, K r3, int r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> r5) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry
                    java.lang.ref.ReferenceQueue r2 = com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment.access$300(r2)
                    r0.<init>(r2, r3, r4, r5)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment newSegment(com.google.common.collect.MapMakerInternalMap r1, int r2, int r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment r1 = r0.newSegment(r1, r2, r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> r2, int r3, int r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, java.lang.Object r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) r2
                    r0.setValue(r1, r2, r3)
                    return
            }

            public void setValue(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> r1, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> r2, V r3) {
                    r0 = this;
                    r2.setValue(r3)
                    return
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
                    return r0
            }
        }

        public WeakKeyStrongValueEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r1 = 0
                r0.value = r1
                return
        }

        public final com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> copy(java.lang.ref.ReferenceQueue<K> r4, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> r5) {
                r3 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry
                java.lang.Object r1 = r3.getKey()
                int r2 = r3.hash
                r0.<init>(r4, r1, r2, r5)
                V r4 = r3.value
                r0.value = r4
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        public final void setValue(V r1) {
                r0 = this;
                r0.value = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class WeakKeyStrongValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> {
        private final java.lang.ref.ReferenceQueue<K> queueForKeys;

        public WeakKeyStrongValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
                r1.<init>()
                r0.queueForKeys = r1
                return
        }

        public static /* synthetic */ java.lang.ref.ReferenceQueue access$300(com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueSegment r0) {
                java.lang.ref.ReferenceQueue<K> r0 = r0.queueForKeys
                return r0
        }

        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r1 = r0.m301castForTesting(r1)
                return r1
        }

        /* JADX INFO: renamed from: castForTesting, reason: collision with other method in class */
        public com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry<K, V> m301castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry) r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void maybeClearReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                r1.clearReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void maybeDrainReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                r1.drainKeyReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.Segment self() {
                r0 = this;
                return r0
        }
    }

    public static final class WeakKeyWeakValueEntry<K, V> extends com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> implements com.google.common.collect.MapMakerInternalMap.WeakValueEntry<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> {
        private volatile com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> valueReference;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class Helper<K, V> implements com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> {
            private static final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper<?, ?> INSTANCE = null;

            static {
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry$Helper r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry$Helper
                    r0.<init>()
                    com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper.INSTANCE = r0
                    return
            }

            public Helper() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static <K, V> com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper<K, V> instance() {
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry$Helper<?, ?> r0 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper.INSTANCE
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry copy(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) r2
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r3 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) r3
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r1 = r0.copy(r1, r2, r3)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> copy(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> r3, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> r5) {
                    r2 = this;
                    java.lang.Object r0 = r4.getKey()
                    r1 = 0
                    if (r0 != 0) goto L8
                    return r1
                L8:
                    int r0 = com.google.common.collect.MapMakerInternalMap.Segment.$r8$clinit
                    java.lang.Object r0 = r4.getValue()
                    if (r0 != 0) goto L12
                    r0 = 1
                    goto L13
                L12:
                    r0 = 0
                L13:
                    if (r0 == 0) goto L16
                    return r1
                L16:
                    java.lang.ref.ReferenceQueue r0 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment.access$400(r3)
                    java.lang.ref.ReferenceQueue r3 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment.access$500(r3)
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r3 = r4.copy(r0, r3, r5)
                    return r3
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength keyStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry newEntry(com.google.common.collect.MapMakerInternalMap.Segment r1, java.lang.Object r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.InternalEntry r4) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r4 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) r4
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r1 = r0.newEntry(r1, r2, r3, r4)
                    return r1
            }

            public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> newEntry(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> r2, K r3, int r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> r5) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry
                    java.lang.ref.ReferenceQueue r2 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment.access$400(r2)
                    r0.<init>(r2, r3, r4, r5)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.Segment newSegment(com.google.common.collect.MapMakerInternalMap r1, int r2, int r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment r1 = r0.newSegment(r1, r2, r3)
                    return r1
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> newSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> r2, int r3, int r4) {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment
                    r0.<init>(r2, r3, r4)
                    return r0
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(com.google.common.collect.MapMakerInternalMap.Segment r1, com.google.common.collect.MapMakerInternalMap.InternalEntry r2, java.lang.Object r3) {
                    r0 = this;
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment) r1
                    com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r2 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) r2
                    r0.setValue(r1, r2, r3)
                    return
            }

            public void setValue(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V> r1, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> r2, V r3) {
                    r0 = this;
                    java.lang.ref.ReferenceQueue r1 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment.access$500(r1)
                    r2.setValue(r3, r1)
                    return
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public com.google.common.collect.MapMakerInternalMap.Strength valueStrength() {
                    r1 = this;
                    com.google.common.collect.MapMakerInternalMap$Strength r0 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
                    return r0
            }
        }

        public WeakKeyWeakValueEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap$DummyInternalEntry> r1 = com.google.common.collect.MapMakerInternalMap.UNSET_WEAK_VALUE_REFERENCE
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<java.lang.Object, java.lang.Object, com.google.common.collect.MapMakerInternalMap$DummyInternalEntry> r1 = com.google.common.collect.MapMakerInternalMap.UNSET_WEAK_VALUE_REFERENCE
                r0.valueReference = r1
                return
        }

        public static /* synthetic */ com.google.common.collect.MapMakerInternalMap.WeakValueReference access$700(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry r0) {
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry<K, V>> r0 = r0.valueReference
                return r0
        }

        public static /* synthetic */ com.google.common.collect.MapMakerInternalMap.WeakValueReference access$702(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry r0, com.google.common.collect.MapMakerInternalMap.WeakValueReference r1) {
                r0.valueReference = r1
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public void clearValue() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry<K, V>> r0 = r1.valueReference
                r0.clear()
                return
        }

        public final com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> copy(java.lang.ref.ReferenceQueue<K> r4, java.lang.ref.ReferenceQueue<V> r5, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> r6) {
                r3 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r0 = new com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry
                java.lang.Object r1 = r3.getKey()
                int r2 = r3.hash
                r0.<init>(r4, r1, r2, r6)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry<K, V>> r4 = r3.valueReference
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r4 = r4.copyFor(r5, r0)
                r0.valueReference = r4
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public V getValue() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry<K, V>> r0 = r1.valueReference
                java.lang.Object r0 = r0.get()
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> getValueReference() {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry<K, V>> r0 = r1.valueReference
                return r0
        }

        public final void setValue(V r3, java.lang.ref.ReferenceQueue<V> r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry<K, V>> r0 = r2.valueReference
                com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl r1 = new com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl
                r1.<init>(r4, r3, r2)
                r2.valueReference = r1
                r0.clear()
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class WeakKeyWeakValueSegment<K, V> extends com.google.common.collect.MapMakerInternalMap.Segment<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> {
        private final java.lang.ref.ReferenceQueue<K> queueForKeys;
        private final java.lang.ref.ReferenceQueue<V> queueForValues;

        public WeakKeyWeakValueSegment(com.google.common.collect.MapMakerInternalMap<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment<K, V>> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
                r1.<init>()
                r0.queueForKeys = r1
                java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
                r1.<init>()
                r0.queueForValues = r1
                return
        }

        public static /* synthetic */ java.lang.ref.ReferenceQueue access$400(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment r0) {
                java.lang.ref.ReferenceQueue<K> r0 = r0.queueForKeys
                return r0
        }

        public static /* synthetic */ java.lang.ref.ReferenceQueue access$500(com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueSegment r0) {
                java.lang.ref.ReferenceQueue<V> r0 = r0.queueForValues
                return r0
        }

        public /* bridge */ /* synthetic */ com.google.common.collect.MapMakerInternalMap.InternalEntry castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r1 = r0.m302castForTesting(r1)
                return r1
        }

        /* JADX INFO: renamed from: castForTesting, reason: collision with other method in class */
        public com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V> m302castForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r1 = (com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry) r1
                return r1
        }

        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r1) {
                r0 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r1 = r0.m302castForTesting(r1)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r1 = r1.getValueReference()
                return r1
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void maybeClearReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                r1.clearReferenceQueue(r0)
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void maybeDrainReferenceQueues() {
                r1 = this;
                java.lang.ref.ReferenceQueue<K> r0 = r1.queueForKeys
                r1.drainKeyReferenceQueue(r0)
                java.lang.ref.ReferenceQueue<V> r0 = r1.queueForValues
                r1.drainValueReferenceQueue(r0)
                return
        }

        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r3, V r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl r0 = new com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl
                java.lang.ref.ReferenceQueue<V> r1 = r2.queueForValues
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r3 = r2.m302castForTesting(r3)
                r0.<init>(r1, r4, r3)
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final com.google.common.collect.MapMakerInternalMap.Segment self() {
                r0 = this;
                return r0
        }

        public void setWeakValueReferenceForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?> r2, com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>> r3) {
                r1 = this;
                com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry r2 = r1.m302castForTesting(r2)
                com.google.common.collect.MapMakerInternalMap$WeakValueReference r0 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.access$700(r2)
                com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.access$702(r2, r3)
                r0.clear()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface WeakValueEntry<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E> {
        void clearValue();

        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> getValueReference();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface WeakValueReference<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> {
        void clear();

        com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> copyFor(java.lang.ref.ReferenceQueue<V> r1, E r2);

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V get();

        E getEntry();
    }

    public static final class WeakValueReferenceImpl<K, V, E extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, E>> extends java.lang.ref.WeakReference<V> implements com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> {

        @com.google.j2objc.annotations.Weak
        public final E entry;

        public WeakValueReferenceImpl(java.lang.ref.ReferenceQueue<V> r1, V r2, E r3) {
                r0 = this;
                r0.<init>(r2, r1)
                r0.entry = r3
                return
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public com.google.common.collect.MapMakerInternalMap.WeakValueReference<K, V, E> copyFor(java.lang.ref.ReferenceQueue<V> r3, E r4) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl r0 = new com.google.common.collect.MapMakerInternalMap$WeakValueReferenceImpl
                java.lang.Object r1 = r2.get()
                r0.<init>(r3, r1, r4)
                return r0
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public E getEntry() {
                r1 = this;
                E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E> r0 = r1.entry
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class WriteThroughEntry extends com.google.common.collect.AbstractMapEntry<K, V> {
        public final K key;
        public final /* synthetic */ com.google.common.collect.MapMakerInternalMap this$0;
        public V value;

        public WriteThroughEntry(com.google.common.collect.MapMakerInternalMap r1, K r2, V r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                r0.value = r3
                return
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L20
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.key
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L20
                V r0 = r3.value
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L20
                r1 = 1
            L20:
                return r1
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public int hashCode() {
                r2 = this;
                K r0 = r2.key
                int r0 = r0.hashCode()
                V r1 = r2.value
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V r3) {
                r2 = this;
                com.google.common.collect.MapMakerInternalMap r0 = r2.this$0
                K r1 = r2.key
                java.lang.Object r0 = r0.put(r1, r3)
                r2.value = r3
                return r0
        }
    }

    static {
            com.google.common.collect.MapMakerInternalMap$1 r0 = new com.google.common.collect.MapMakerInternalMap$1
            r0.<init>()
            com.google.common.collect.MapMakerInternalMap.UNSET_WEAK_VALUE_REFERENCE = r0
            return
    }

    private MapMakerInternalMap(com.google.common.collect.MapMaker r6, com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K, V, E, S> r7) {
            r5 = this;
            r5.<init>()
            int r0 = r6.concurrencyLevel
            r1 = -1
            if (r0 != r1) goto L9
            r0 = 4
        L9:
            r2 = 65536(0x10000, float:9.1835E-41)
            int r0 = java.lang.Math.min(r0, r2)
            r5.concurrencyLevel = r0
            com.google.common.base.Equivalence<java.lang.Object> r0 = r6.keyEquivalence
            com.google.common.collect.MapMakerInternalMap$Strength r2 = r6.getKeyStrength()
            com.google.common.base.Equivalence r2 = r2.defaultEquivalence()
            java.lang.Object r0 = com.google.common.base.MoreObjects.firstNonNull(r0, r2)
            com.google.common.base.Equivalence r0 = (com.google.common.base.Equivalence) r0
            r5.keyEquivalence = r0
            r5.entryHelper = r7
            int r6 = r6.initialCapacity
            if (r6 != r1) goto L2b
            r6 = 16
        L2b:
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = java.lang.Math.min(r6, r7)
            r7 = 0
            r0 = 1
            r2 = 1
            r3 = 0
        L35:
            int r4 = r5.concurrencyLevel
            if (r2 >= r4) goto L3e
            int r3 = r3 + 1
            int r2 = r2 << 1
            goto L35
        L3e:
            int r3 = 32 - r3
            r5.segmentShift = r3
            int r3 = r2 + (-1)
            r5.segmentMask = r3
            com.google.common.collect.MapMakerInternalMap$Segment[] r3 = new com.google.common.collect.MapMakerInternalMap.Segment[r2]
            r5.segments = r3
            int r3 = r6 / r2
            int r2 = r2 * r3
            if (r2 >= r6) goto L52
            int r3 = r3 + 1
        L52:
            if (r0 >= r3) goto L57
            int r0 = r0 << 1
            goto L52
        L57:
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r6 = r5.segments
            int r2 = r6.length
            if (r7 >= r2) goto L67
            com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r2 = r5.entryHelper
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r2.newSegment(r5, r0, r1)
            r6[r7] = r2
            int r7 = r7 + 1
            goto L57
        L67:
            return
    }

    public static /* synthetic */ java.util.ArrayList access$900(java.util.Collection r0) {
            java.util.ArrayList r0 = toArrayList(r0)
            return r0
    }

    public static <K, V> com.google.common.collect.MapMakerInternalMap<K, V, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, V, ?>, ?> create(com.google.common.collect.MapMaker r3) {
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getKeyStrength()
            com.google.common.collect.MapMakerInternalMap$Strength r1 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
            if (r0 != r1) goto L18
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getValueStrength()
            if (r0 != r1) goto L18
            com.google.common.collect.MapMakerInternalMap r0 = new com.google.common.collect.MapMakerInternalMap
            com.google.common.collect.MapMakerInternalMap$StrongKeyStrongValueEntry$Helper r1 = com.google.common.collect.MapMakerInternalMap.StrongKeyStrongValueEntry.Helper.instance()
            r0.<init>(r3, r1)
            return r0
        L18:
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getKeyStrength()
            if (r0 != r1) goto L30
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getValueStrength()
            com.google.common.collect.MapMakerInternalMap$Strength r2 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
            if (r0 != r2) goto L30
            com.google.common.collect.MapMakerInternalMap r0 = new com.google.common.collect.MapMakerInternalMap
            com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper r1 = com.google.common.collect.MapMakerInternalMap.StrongKeyWeakValueEntry.Helper.instance()
            r0.<init>(r3, r1)
            return r0
        L30:
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getKeyStrength()
            com.google.common.collect.MapMakerInternalMap$Strength r2 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
            if (r0 != r2) goto L48
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getValueStrength()
            if (r0 != r1) goto L48
            com.google.common.collect.MapMakerInternalMap r0 = new com.google.common.collect.MapMakerInternalMap
            com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$Helper r1 = com.google.common.collect.MapMakerInternalMap.WeakKeyStrongValueEntry.Helper.instance()
            r0.<init>(r3, r1)
            return r0
        L48:
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getKeyStrength()
            if (r0 != r2) goto L5e
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getValueStrength()
            if (r0 != r2) goto L5e
            com.google.common.collect.MapMakerInternalMap r0 = new com.google.common.collect.MapMakerInternalMap
            com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueEntry$Helper r1 = com.google.common.collect.MapMakerInternalMap.WeakKeyWeakValueEntry.Helper.instance()
            r0.<init>(r3, r1)
            return r0
        L5e:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
    }

    public static <K> com.google.common.collect.MapMakerInternalMap<K, com.google.common.collect.MapMaker.Dummy, ? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K, com.google.common.collect.MapMaker.Dummy, ?>, ?> createWithDummyValues(com.google.common.collect.MapMaker r3) {
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getKeyStrength()
            com.google.common.collect.MapMakerInternalMap$Strength r1 = com.google.common.collect.MapMakerInternalMap.Strength.STRONG
            if (r0 != r1) goto L18
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getValueStrength()
            if (r0 != r1) goto L18
            com.google.common.collect.MapMakerInternalMap r0 = new com.google.common.collect.MapMakerInternalMap
            com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper r1 = com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry.Helper.instance()
            r0.<init>(r3, r1)
            return r0
        L18:
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getKeyStrength()
            com.google.common.collect.MapMakerInternalMap$Strength r2 = com.google.common.collect.MapMakerInternalMap.Strength.WEAK
            if (r0 != r2) goto L30
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r3.getValueStrength()
            if (r0 != r1) goto L30
            com.google.common.collect.MapMakerInternalMap r0 = new com.google.common.collect.MapMakerInternalMap
            com.google.common.collect.MapMakerInternalMap$WeakKeyDummyValueEntry$Helper r1 = com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry.Helper.instance()
            r0.<init>(r3, r1)
            return r0
        L30:
            com.google.common.collect.MapMakerInternalMap$Strength r3 = r3.getValueStrength()
            if (r3 != r2) goto L3e
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Map cannot have both weak and dummy values"
            r3.<init>(r0)
            throw r3
        L3e:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
    }

    private static <E> java.util.ArrayList<E> toArrayList(java.util.Collection<E> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
            com.google.common.collect.Iterators.addAll(r0, r2)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r8 = this;
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r0 = r8.segments
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L3c
            r4 = r0[r3]
            int r5 = r4.count
            if (r5 == 0) goto L39
            r4.lock()
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r5 = r4.table     // Catch: java.lang.Throwable -> L34
            r6 = 0
        L13:
            int r7 = r5.length()     // Catch: java.lang.Throwable -> L34
            if (r6 >= r7) goto L20
            r7 = 0
            r5.set(r6, r7)     // Catch: java.lang.Throwable -> L34
            int r6 = r6 + 1
            goto L13
        L20:
            r4.maybeClearReferenceQueues()     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.atomic.AtomicInteger r5 = r4.readCount     // Catch: java.lang.Throwable -> L34
            r5.set(r2)     // Catch: java.lang.Throwable -> L34
            int r5 = r4.modCount     // Catch: java.lang.Throwable -> L34
            int r5 = r5 + 1
            r4.modCount = r5     // Catch: java.lang.Throwable -> L34
            r4.count = r2     // Catch: java.lang.Throwable -> L34
            r4.unlock()
            goto L39
        L34:
            r0 = move-exception
            r4.unlock()
            throw r0
        L39:
            int r3 = r3 + 1
            goto L5
        L3c:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.hash(r5)
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r4.segmentFor(r1)
            java.util.Objects.requireNonNull(r2)
            int r3 = r2.count     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L20
            com.google.common.collect.MapMakerInternalMap$InternalEntry r5 = r2.getEntry(r5, r1)     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L20
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L20
            r0 = 1
        L20:
            r2.postReadCleanup()
            return r0
        L24:
            r5 = move-exception
            r2.postReadCleanup()
            throw r5
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r18) {
            r17 = this;
            r0 = r18
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = r17
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r3 = r2.segments
            r4 = -1
            r6 = 0
        Ld:
            r7 = 3
            if (r6 >= r7) goto L6d
            r7 = 0
            int r9 = r3.length
            r10 = 0
        L14:
            if (r10 >= r9) goto L63
            r11 = r3[r10]
            int r12 = r11.count
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r12 = r11.table
            r13 = 0
        L1d:
            int r14 = r12.length()
            if (r13 >= r14) goto L5b
            java.lang.Object r14 = r12.get(r13)
            com.google.common.collect.MapMakerInternalMap$InternalEntry r14 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r14
        L29:
            if (r14 == 0) goto L57
            java.lang.Object r15 = r14.getKey()
            r16 = 0
            if (r15 != 0) goto L39
            r11.tryDrainReferenceQueues()
        L36:
            r15 = r16
            goto L43
        L39:
            java.lang.Object r15 = r14.getValue()
            if (r15 != 0) goto L43
            r11.tryDrainReferenceQueues()
            goto L36
        L43:
            if (r15 == 0) goto L51
            com.google.common.base.Equivalence r1 = r17.valueEquivalence()
            boolean r1 = r1.equivalent(r0, r15)
            if (r1 == 0) goto L51
            r0 = 1
            return r0
        L51:
            com.google.common.collect.MapMakerInternalMap$InternalEntry r14 = r14.getNext()
            r1 = 0
            goto L29
        L57:
            int r13 = r13 + 1
            r1 = 0
            goto L1d
        L5b:
            int r1 = r11.modCount
            long r11 = (long) r1
            long r7 = r7 + r11
            int r10 = r10 + 1
            r1 = 0
            goto L14
        L63:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L68
            goto L6d
        L68:
            int r6 = r6 + 1
            r4 = r7
            r1 = 0
            goto Ld
        L6d:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.entrySet
            if (r0 == 0) goto L5
            goto Lc
        L5:
            com.google.common.collect.MapMakerInternalMap$EntrySet r0 = new com.google.common.collect.MapMakerInternalMap$EntrySet
            r0.<init>(r1)
            r1.entrySet = r0
        Lc:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.hash(r4)
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r3.segmentFor(r1)
            java.util.Objects.requireNonNull(r2)
            com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r2.getEntry(r4, r1)     // Catch: java.lang.Throwable -> L24
            if (r4 != 0) goto L19
        L15:
            r2.postReadCleanup()
            goto L23
        L19:
            java.lang.Object r0 = r4.getValue()     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L15
            r2.tryDrainReferenceQueues()     // Catch: java.lang.Throwable -> L24
            goto L15
        L23:
            return r0
        L24:
            r4 = move-exception
            r2.postReadCleanup()
            throw r4
    }

    public final int hash(java.lang.Object r3) {
            r2 = this;
            com.google.common.base.Equivalence<java.lang.Object> r0 = r2.keyEquivalence
            int r3 = r0.hash(r3)
            int r0 = r3 << 15
            r0 = r0 ^ (-12931(0xffffffffffffcd7d, float:NaN))
            int r3 = r3 + r0
            int r0 = r3 >>> 10
            r3 = r3 ^ r0
            int r0 = r3 << 3
            int r3 = r3 + r0
            int r0 = r3 >>> 6
            r3 = r3 ^ r0
            int r0 = r3 << 2
            int r1 = r3 << 14
            int r0 = r0 + r1
            int r0 = r0 + r3
            int r3 = r0 >>> 16
            r3 = r3 ^ r0
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
            r10 = this;
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r0 = r10.segments
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = 0
        L7:
            int r7 = r0.length
            if (r4 >= r7) goto L1a
            r7 = r0[r4]
            int r7 = r7.count
            if (r7 == 0) goto L11
            return r3
        L11:
            r7 = r0[r4]
            int r7 = r7.modCount
            long r7 = (long) r7
            long r5 = r5 + r7
            int r4 = r4 + 1
            goto L7
        L1a:
            r4 = 1
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 == 0) goto L39
            r7 = 0
        L20:
            int r8 = r0.length
            if (r7 >= r8) goto L33
            r8 = r0[r7]
            int r8 = r8.count
            if (r8 == 0) goto L2a
            return r3
        L2a:
            r8 = r0[r7]
            int r8 = r8.modCount
            long r8 = (long) r8
            long r5 = r5 - r8
            int r7 = r7 + 1
            goto L20
        L33:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L38
            r3 = 1
        L38:
            return r3
        L39:
            return r4
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set<K> r0 = r1.keySet
            if (r0 == 0) goto L5
            goto Lc
        L5:
            com.google.common.collect.MapMakerInternalMap$KeySet r0 = new com.google.common.collect.MapMakerInternalMap$KeySet
            r0.<init>(r1)
            r1.keySet = r0
        Lc:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V put(K r4, V r5) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r3.hash(r4)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r3.segmentFor(r0)
            r2 = 0
            java.lang.Object r4 = r1.put(r4, r0, r5, r2)
            return r4
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L8
        L20:
            return
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V putIfAbsent(K r4, V r5) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r3.hash(r4)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r3.segmentFor(r0)
            r2 = 1
            java.lang.Object r4 = r1.put(r4, r0, r5, r2)
            return r4
    }

    @Override // java.util.AbstractMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r11) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r10.hash(r11)
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r10.segmentFor(r1)
            r2.lock()
            r2.runLockedCleanup()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r3 = r2.table     // Catch: java.lang.Throwable -> L6b
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L6b
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Throwable -> L6b
            com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r6     // Catch: java.lang.Throwable -> L6b
            r7 = r6
        L22:
            if (r7 == 0) goto L67
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L6b
            int r9 = r7.getHash()     // Catch: java.lang.Throwable -> L6b
            if (r9 != r1) goto L62
            if (r8 == 0) goto L62
            com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r9 = r2.map     // Catch: java.lang.Throwable -> L6b
            com.google.common.base.Equivalence<java.lang.Object> r9 = r9.keyEquivalence     // Catch: java.lang.Throwable -> L6b
            boolean r8 = r9.equivalent(r11, r8)     // Catch: java.lang.Throwable -> L6b
            if (r8 == 0) goto L62
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L6b
            if (r11 == 0) goto L41
            goto L4c
        L41:
            java.lang.Object r1 = r7.getValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            if (r1 == 0) goto L67
        L4c:
            int r0 = r2.modCount     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 + r5
            r2.modCount = r0     // Catch: java.lang.Throwable -> L6b
            com.google.common.collect.MapMakerInternalMap$InternalEntry r0 = r2.removeFromChain(r6, r7)     // Catch: java.lang.Throwable -> L6b
            int r1 = r2.count     // Catch: java.lang.Throwable -> L6b
            int r1 = r1 - r5
            r3.set(r4, r0)     // Catch: java.lang.Throwable -> L6b
            r2.count = r1     // Catch: java.lang.Throwable -> L6b
            r2.unlock()
            r0 = r11
            goto L6a
        L62:
            com.google.common.collect.MapMakerInternalMap$InternalEntry r7 = r7.getNext()     // Catch: java.lang.Throwable -> L6b
            goto L22
        L67:
            r2.unlock()
        L6a:
            return r0
        L6b:
            r11 = move-exception
            r2.unlock()
            throw r11
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r11, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r12) {
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L7a
            if (r12 != 0) goto L7
            goto L7a
        L7:
            int r1 = r10.hash(r11)
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r10.segmentFor(r1)
            r2.lock()
            r2.runLockedCleanup()     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r3 = r2.table     // Catch: java.lang.Throwable -> L75
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L75
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Throwable -> L75
            com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r6     // Catch: java.lang.Throwable -> L75
            r7 = r6
        L25:
            if (r7 == 0) goto L71
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L75
            int r9 = r7.getHash()     // Catch: java.lang.Throwable -> L75
            if (r9 != r1) goto L6c
            if (r8 == 0) goto L6c
            com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r9 = r2.map     // Catch: java.lang.Throwable -> L75
            com.google.common.base.Equivalence<java.lang.Object> r9 = r9.keyEquivalence     // Catch: java.lang.Throwable -> L75
            boolean r8 = r9.equivalent(r11, r8)     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L6c
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L75
            com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r1 = r2.map     // Catch: java.lang.Throwable -> L75
            com.google.common.base.Equivalence r1 = r1.valueEquivalence()     // Catch: java.lang.Throwable -> L75
            boolean r11 = r1.equivalent(r12, r11)     // Catch: java.lang.Throwable -> L75
            if (r11 == 0) goto L4f
            r0 = 1
            goto L5a
        L4f:
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L75
            if (r11 != 0) goto L57
            r11 = 1
            goto L58
        L57:
            r11 = 0
        L58:
            if (r11 == 0) goto L71
        L5a:
            int r11 = r2.modCount     // Catch: java.lang.Throwable -> L75
            int r11 = r11 + r5
            r2.modCount = r11     // Catch: java.lang.Throwable -> L75
            com.google.common.collect.MapMakerInternalMap$InternalEntry r11 = r2.removeFromChain(r6, r7)     // Catch: java.lang.Throwable -> L75
            int r12 = r2.count     // Catch: java.lang.Throwable -> L75
            int r12 = r12 - r5
            r3.set(r4, r11)     // Catch: java.lang.Throwable -> L75
            r2.count = r12     // Catch: java.lang.Throwable -> L75
            goto L71
        L6c:
            com.google.common.collect.MapMakerInternalMap$InternalEntry r7 = r7.getNext()     // Catch: java.lang.Throwable -> L75
            goto L25
        L71:
            r2.unlock()
            return r0
        L75:
            r11 = move-exception
            r2.unlock()
            throw r11
        L7a:
            return r0
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V replace(K r11, V r12) {
            r10 = this;
            com.google.common.base.Preconditions.checkNotNull(r11)
            com.google.common.base.Preconditions.checkNotNull(r12)
            int r0 = r10.hash(r11)
            com.google.common.collect.MapMakerInternalMap$Segment r1 = r10.segmentFor(r0)
            r1.lock()
            r1.runLockedCleanup()     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r2 = r1.table     // Catch: java.lang.Throwable -> L76
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L76
            r4 = 1
            int r3 = r3 - r4
            r3 = r3 & r0
            java.lang.Object r5 = r2.get(r3)     // Catch: java.lang.Throwable -> L76
            com.google.common.collect.MapMakerInternalMap$InternalEntry r5 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r5     // Catch: java.lang.Throwable -> L76
            r6 = r5
        L24:
            r7 = 0
            if (r6 == 0) goto L72
            java.lang.Object r8 = r6.getKey()     // Catch: java.lang.Throwable -> L76
            int r9 = r6.getHash()     // Catch: java.lang.Throwable -> L76
            if (r9 != r0) goto L6d
            if (r8 == 0) goto L6d
            com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r9 = r1.map     // Catch: java.lang.Throwable -> L76
            com.google.common.base.Equivalence<java.lang.Object> r9 = r9.keyEquivalence     // Catch: java.lang.Throwable -> L76
            boolean r8 = r9.equivalent(r11, r8)     // Catch: java.lang.Throwable -> L76
            if (r8 == 0) goto L6d
            java.lang.Object r11 = r6.getValue()     // Catch: java.lang.Throwable -> L76
            if (r11 != 0) goto L60
            java.lang.Object r11 = r6.getValue()     // Catch: java.lang.Throwable -> L76
            if (r11 != 0) goto L4b
            r11 = 1
            goto L4c
        L4b:
            r11 = 0
        L4c:
            if (r11 == 0) goto L72
            int r11 = r1.modCount     // Catch: java.lang.Throwable -> L76
            int r11 = r11 + r4
            r1.modCount = r11     // Catch: java.lang.Throwable -> L76
            com.google.common.collect.MapMakerInternalMap$InternalEntry r11 = r1.removeFromChain(r5, r6)     // Catch: java.lang.Throwable -> L76
            int r12 = r1.count     // Catch: java.lang.Throwable -> L76
            int r12 = r12 - r4
            r2.set(r3, r11)     // Catch: java.lang.Throwable -> L76
            r1.count = r12     // Catch: java.lang.Throwable -> L76
            goto L72
        L60:
            int r0 = r1.modCount     // Catch: java.lang.Throwable -> L76
            int r0 = r0 + r4
            r1.modCount = r0     // Catch: java.lang.Throwable -> L76
            r1.setValue(r6, r12)     // Catch: java.lang.Throwable -> L76
            r1.unlock()
            r7 = r11
            goto L75
        L6d:
            com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = r6.getNext()     // Catch: java.lang.Throwable -> L76
            goto L24
        L72:
            r1.unlock()
        L75:
            return r7
        L76:
            r11 = move-exception
            r1.unlock()
            throw r11
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean replace(K r11, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r12, V r13) {
            r10 = this;
            com.google.common.base.Preconditions.checkNotNull(r11)
            com.google.common.base.Preconditions.checkNotNull(r13)
            r0 = 0
            if (r12 != 0) goto La
            return r0
        La:
            int r1 = r10.hash(r11)
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r10.segmentFor(r1)
            r2.lock()
            r2.runLockedCleanup()     // Catch: java.lang.Throwable -> L85
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r3 = r2.table     // Catch: java.lang.Throwable -> L85
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L85
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Throwable -> L85
            com.google.common.collect.MapMakerInternalMap$InternalEntry r6 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r6     // Catch: java.lang.Throwable -> L85
            r7 = r6
        L28:
            if (r7 == 0) goto L81
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L85
            int r9 = r7.getHash()     // Catch: java.lang.Throwable -> L85
            if (r9 != r1) goto L7c
            if (r8 == 0) goto L7c
            com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r9 = r2.map     // Catch: java.lang.Throwable -> L85
            com.google.common.base.Equivalence<java.lang.Object> r9 = r9.keyEquivalence     // Catch: java.lang.Throwable -> L85
            boolean r8 = r9.equivalent(r11, r8)     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L7c
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L85
            if (r11 != 0) goto L63
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L85
            if (r11 != 0) goto L4e
            r11 = 1
            goto L4f
        L4e:
            r11 = 0
        L4f:
            if (r11 == 0) goto L81
            int r11 = r2.modCount     // Catch: java.lang.Throwable -> L85
            int r11 = r11 + r5
            r2.modCount = r11     // Catch: java.lang.Throwable -> L85
            com.google.common.collect.MapMakerInternalMap$InternalEntry r11 = r2.removeFromChain(r6, r7)     // Catch: java.lang.Throwable -> L85
            int r12 = r2.count     // Catch: java.lang.Throwable -> L85
            int r12 = r12 - r5
            r3.set(r4, r11)     // Catch: java.lang.Throwable -> L85
            r2.count = r12     // Catch: java.lang.Throwable -> L85
            goto L81
        L63:
            com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r1 = r2.map     // Catch: java.lang.Throwable -> L85
            com.google.common.base.Equivalence r1 = r1.valueEquivalence()     // Catch: java.lang.Throwable -> L85
            boolean r11 = r1.equivalent(r12, r11)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L81
            int r11 = r2.modCount     // Catch: java.lang.Throwable -> L85
            int r11 = r11 + r5
            r2.modCount = r11     // Catch: java.lang.Throwable -> L85
            r2.setValue(r7, r13)     // Catch: java.lang.Throwable -> L85
            r2.unlock()
            r0 = 1
            goto L84
        L7c:
            com.google.common.collect.MapMakerInternalMap$InternalEntry r7 = r7.getNext()     // Catch: java.lang.Throwable -> L85
            goto L28
        L81:
            r2.unlock()
        L84:
            return r0
        L85:
            r11 = move-exception
            r2.unlock()
            throw r11
    }

    public final com.google.common.collect.MapMakerInternalMap.Segment<K, V, E, S> segmentFor(int r3) {
            r2 = this;
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r0 = r2.segments
            int r1 = r2.segmentShift
            int r3 = r3 >>> r1
            int r1 = r2.segmentMask
            r3 = r3 & r1
            r3 = r0[r3]
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r6 = this;
            com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[] r0 = r6.segments
            r1 = 0
            r3 = 0
        L5:
            int r4 = r0.length
            if (r3 >= r4) goto L11
            r4 = r0[r3]
            int r4 = r4.count
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L5
        L11:
            int r0 = com.google.common.primitives.Ints.saturatedCast(r1)
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    public final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence() {
            r1 = this;
            com.google.common.collect.MapMakerInternalMap$InternalEntryHelper<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r0 = r1.entryHelper
            com.google.common.collect.MapMakerInternalMap$Strength r0 = r0.valueStrength()
            com.google.common.base.Equivalence r0 = r0.defaultEquivalence()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection<V> r0 = r1.values
            if (r0 == 0) goto L5
            goto Lc
        L5:
            com.google.common.collect.MapMakerInternalMap$Values r0 = new com.google.common.collect.MapMakerInternalMap$Values
            r0.<init>(r1)
            r1.values = r0
        Lc:
            return r0
    }
}
