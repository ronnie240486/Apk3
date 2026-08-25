package org.bson.util;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractCopyOnWriteMap<K, V, M extends java.util.Map<K, V>> implements java.util.concurrent.ConcurrentMap<K, V> {
    private volatile M delegate;
    private final transient java.util.concurrent.locks.Lock lock;
    private final org.bson.util.AbstractCopyOnWriteMap.View<K, V> view;

    /* JADX INFO: renamed from: org.bson.util.AbstractCopyOnWriteMap$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class CollectionView<E> implements java.util.Collection<E> {
        public CollectionView() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Collection
        public final boolean add(E r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public final boolean addAll(java.util.Collection<? extends E> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public final boolean contains(java.lang.Object r2) {
                r1 = this;
                java.util.Collection r0 = r1.getDelegate()
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.Collection
        public final boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Collection r0 = r1.getDelegate()
                boolean r2 = r0.containsAll(r2)
                return r2
        }

        @Override // java.util.Collection
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                java.util.Collection r0 = r1.getDelegate()
                boolean r2 = r0.equals(r2)
                return r2
        }

        abstract java.util.Collection<E> getDelegate();

        @Override // java.util.Collection
        public int hashCode() {
                r1 = this;
                java.util.Collection r0 = r1.getDelegate()
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
                r1 = this;
                java.util.Collection r0 = r1.getDelegate()
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<E> iterator() {
                r2 = this;
                org.bson.util.AbstractCopyOnWriteMap$UnmodifiableIterator r0 = new org.bson.util.AbstractCopyOnWriteMap$UnmodifiableIterator
                java.util.Collection r1 = r2.getDelegate()
                java.util.Iterator r1 = r1.iterator()
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Collection
        public final int size() {
                r1 = this;
                java.util.Collection r0 = r1.getDelegate()
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.Collection
        public final java.lang.Object[] toArray() {
                r1 = this;
                java.util.Collection r0 = r1.getDelegate()
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] r2) {
                r1 = this;
                java.util.Collection r0 = r1.getDelegate()
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }

        public java.lang.String toString() {
                r1 = this;
                java.util.Collection r0 = r1.getDelegate()
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public class EntrySet extends org.bson.util.AbstractCopyOnWriteMap.CollectionView<java.util.Map.Entry<K, V>> implements java.util.Set<java.util.Map.Entry<K, V>> {
        public final /* synthetic */ org.bson.util.AbstractCopyOnWriteMap this$0;

        private EntrySet(org.bson.util.AbstractCopyOnWriteMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ EntrySet(org.bson.util.AbstractCopyOnWriteMap r1, org.bson.util.AbstractCopyOnWriteMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Collection, java.util.Set
        public void clear() {
                r2 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.lock()
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0     // Catch: java.lang.Throwable -> L25
                java.util.Map r0 = r0.copy()     // Catch: java.lang.Throwable -> L25
                java.util.Set r1 = r0.entrySet()     // Catch: java.lang.Throwable -> L25
                r1.clear()     // Catch: java.lang.Throwable -> L25
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L25
                r1.set(r0)     // Catch: java.lang.Throwable -> L25
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                return
            L25:
                r0 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0
                java.util.concurrent.locks.Lock r1 = org.bson.util.AbstractCopyOnWriteMap.access$100(r1)
                r1.unlock()
                throw r0
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.CollectionView
        public final java.util.Collection<java.util.Map.Entry<K, V>> getDelegate() {
                r1 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r1.this$0
                java.util.Map r0 = org.bson.util.AbstractCopyOnWriteMap.access$000(r0)
                java.util.Set r0 = r0.entrySet()
                return r0
        }

        @Override // java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.lock()
                boolean r0 = r2.contains(r3)     // Catch: java.lang.Throwable -> L35
                if (r0 != 0) goto L1a
                r3 = 0
            L10:
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                return r3
            L1a:
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0     // Catch: java.lang.Throwable -> L35
                java.util.Map r0 = r0.copy()     // Catch: java.lang.Throwable -> L35
                java.util.Set r1 = r0.entrySet()     // Catch: java.lang.Throwable -> L2e
                boolean r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L2e
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L35
                r1.set(r0)     // Catch: java.lang.Throwable -> L35
                goto L10
            L2e:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L35
                r1.set(r0)     // Catch: java.lang.Throwable -> L35
                throw r3     // Catch: java.lang.Throwable -> L35
            L35:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                throw r3
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r3) {
                r2 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.lock()
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                java.util.Map r0 = r0.copy()     // Catch: java.lang.Throwable -> L2d
                java.util.Set r1 = r0.entrySet()     // Catch: java.lang.Throwable -> L26
                boolean r3 = r1.removeAll(r3)     // Catch: java.lang.Throwable -> L26
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                r1.set(r0)     // Catch: java.lang.Throwable -> L2d
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                return r3
            L26:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                r1.set(r0)     // Catch: java.lang.Throwable -> L2d
                throw r3     // Catch: java.lang.Throwable -> L2d
            L2d:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                throw r3
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r3) {
                r2 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.lock()
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                java.util.Map r0 = r0.copy()     // Catch: java.lang.Throwable -> L2d
                java.util.Set r1 = r0.entrySet()     // Catch: java.lang.Throwable -> L26
                boolean r3 = r1.retainAll(r3)     // Catch: java.lang.Throwable -> L26
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                r1.set(r0)     // Catch: java.lang.Throwable -> L2d
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                return r3
            L26:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                r1.set(r0)     // Catch: java.lang.Throwable -> L2d
                throw r3     // Catch: java.lang.Throwable -> L2d
            L2d:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                throw r3
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class Immutable extends org.bson.util.AbstractCopyOnWriteMap.View<K, V> {
        public final /* synthetic */ org.bson.util.AbstractCopyOnWriteMap this$0;

        public Immutable(org.bson.util.AbstractCopyOnWriteMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
                r1 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r1.this$0
                java.util.Map r0 = org.bson.util.AbstractCopyOnWriteMap.access$000(r0)
                java.util.Set r0 = r0.entrySet()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                return r0
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        public java.util.Set<K> keySet() {
                r1 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r1.this$0
                java.util.Map r0 = org.bson.util.AbstractCopyOnWriteMap.access$000(r0)
                java.util.Set r0 = r0.keySet()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                return r0
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        public java.util.Collection<V> values() {
                r1 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r1.this$0
                java.util.Map r0 = org.bson.util.AbstractCopyOnWriteMap.access$000(r0)
                java.util.Collection r0 = r0.values()
                java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
                return r0
        }
    }

    public class KeySet extends org.bson.util.AbstractCopyOnWriteMap.CollectionView<K> implements java.util.Set<K> {
        public final /* synthetic */ org.bson.util.AbstractCopyOnWriteMap this$0;

        private KeySet(org.bson.util.AbstractCopyOnWriteMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ KeySet(org.bson.util.AbstractCopyOnWriteMap r1, org.bson.util.AbstractCopyOnWriteMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Collection, java.util.Set
        public void clear() {
                r2 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.lock()
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0     // Catch: java.lang.Throwable -> L25
                java.util.Map r0 = r0.copy()     // Catch: java.lang.Throwable -> L25
                java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> L25
                r1.clear()     // Catch: java.lang.Throwable -> L25
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L25
                r1.set(r0)     // Catch: java.lang.Throwable -> L25
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                return
            L25:
                r0 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0
                java.util.concurrent.locks.Lock r1 = org.bson.util.AbstractCopyOnWriteMap.access$100(r1)
                r1.unlock()
                throw r0
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.CollectionView
        public final java.util.Collection<K> getDelegate() {
                r1 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r1.this$0
                java.util.Map r0 = org.bson.util.AbstractCopyOnWriteMap.access$000(r0)
                java.util.Set r0 = r0.keySet()
                return r0
        }

        @Override // java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r1.this$0
                java.lang.Object r2 = r0.remove(r2)
                if (r2 == 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r3) {
                r2 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.lock()
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                java.util.Map r0 = r0.copy()     // Catch: java.lang.Throwable -> L2d
                java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> L26
                boolean r3 = r1.removeAll(r3)     // Catch: java.lang.Throwable -> L26
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                r1.set(r0)     // Catch: java.lang.Throwable -> L2d
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                return r3
            L26:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                r1.set(r0)     // Catch: java.lang.Throwable -> L2d
                throw r3     // Catch: java.lang.Throwable -> L2d
            L2d:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                throw r3
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r3) {
                r2 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.lock()
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                java.util.Map r0 = r0.copy()     // Catch: java.lang.Throwable -> L2d
                java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> L26
                boolean r3 = r1.retainAll(r3)     // Catch: java.lang.Throwable -> L26
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                r1.set(r0)     // Catch: java.lang.Throwable -> L2d
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                return r3
            L26:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                r1.set(r0)     // Catch: java.lang.Throwable -> L2d
                throw r3     // Catch: java.lang.Throwable -> L2d
            L2d:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                throw r3
        }
    }

    public final class Mutable extends org.bson.util.AbstractCopyOnWriteMap.View<K, V> {
        private final transient org.bson.util.AbstractCopyOnWriteMap<K, V, M>.EntrySet entrySet;
        private final transient org.bson.util.AbstractCopyOnWriteMap<K, V, M>.KeySet keySet;
        private final transient org.bson.util.AbstractCopyOnWriteMap<K, V, M>.Values values;

        public Mutable(org.bson.util.AbstractCopyOnWriteMap r3) {
                r2 = this;
                r2.<init>()
                org.bson.util.AbstractCopyOnWriteMap$KeySet r0 = new org.bson.util.AbstractCopyOnWriteMap$KeySet
                r1 = 0
                r0.<init>(r3, r1)
                r2.keySet = r0
                org.bson.util.AbstractCopyOnWriteMap$EntrySet r0 = new org.bson.util.AbstractCopyOnWriteMap$EntrySet
                r0.<init>(r3, r1)
                r2.entrySet = r0
                org.bson.util.AbstractCopyOnWriteMap$Values r0 = new org.bson.util.AbstractCopyOnWriteMap$Values
                r0.<init>(r3, r1)
                r2.values = r0
                return
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
                r1 = this;
                org.bson.util.AbstractCopyOnWriteMap<K, V, M>$EntrySet r0 = r1.entrySet
                return r0
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        public java.util.Set<K> keySet() {
                r1 = this;
                org.bson.util.AbstractCopyOnWriteMap<K, V, M>$KeySet r0 = r1.keySet
                return r0
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.View
        public java.util.Collection<V> values() {
                r1 = this;
                org.bson.util.AbstractCopyOnWriteMap<K, V, M>$Values r0 = r1.values
                return r0
        }
    }

    public static class UnmodifiableIterator<T> implements java.util.Iterator<T> {
        private final java.util.Iterator<T> delegate;

        public UnmodifiableIterator(java.util.Iterator<T> r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.delegate
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.delegate
                java.lang.Object r0 = r0.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class Values extends org.bson.util.AbstractCopyOnWriteMap.CollectionView<V> {
        public final /* synthetic */ org.bson.util.AbstractCopyOnWriteMap this$0;

        private Values(org.bson.util.AbstractCopyOnWriteMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ Values(org.bson.util.AbstractCopyOnWriteMap r1, org.bson.util.AbstractCopyOnWriteMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Collection
        public void clear() {
                r2 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.lock()
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0     // Catch: java.lang.Throwable -> L25
                java.util.Map r0 = r0.copy()     // Catch: java.lang.Throwable -> L25
                java.util.Collection r1 = r0.values()     // Catch: java.lang.Throwable -> L25
                r1.clear()     // Catch: java.lang.Throwable -> L25
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L25
                r1.set(r0)     // Catch: java.lang.Throwable -> L25
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                return
            L25:
                r0 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0
                java.util.concurrent.locks.Lock r1 = org.bson.util.AbstractCopyOnWriteMap.access$100(r1)
                r1.unlock()
                throw r0
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap.CollectionView
        public final java.util.Collection<V> getDelegate() {
                r1 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r1.this$0
                java.util.Map r0 = org.bson.util.AbstractCopyOnWriteMap.access$000(r0)
                java.util.Collection r0 = r0.values()
                return r0
        }

        @Override // java.util.Collection
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.lock()
                boolean r0 = r2.contains(r3)     // Catch: java.lang.Throwable -> L35
                if (r0 != 0) goto L1a
                r3 = 0
            L10:
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                return r3
            L1a:
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0     // Catch: java.lang.Throwable -> L35
                java.util.Map r0 = r0.copy()     // Catch: java.lang.Throwable -> L35
                java.util.Collection r1 = r0.values()     // Catch: java.lang.Throwable -> L2e
                boolean r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L2e
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L35
                r1.set(r0)     // Catch: java.lang.Throwable -> L35
                goto L10
            L2e:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L35
                r1.set(r0)     // Catch: java.lang.Throwable -> L35
                throw r3     // Catch: java.lang.Throwable -> L35
            L35:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                throw r3
        }

        @Override // java.util.Collection
        public boolean removeAll(java.util.Collection<?> r3) {
                r2 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.lock()
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                java.util.Map r0 = r0.copy()     // Catch: java.lang.Throwable -> L2d
                java.util.Collection r1 = r0.values()     // Catch: java.lang.Throwable -> L26
                boolean r3 = r1.removeAll(r3)     // Catch: java.lang.Throwable -> L26
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                r1.set(r0)     // Catch: java.lang.Throwable -> L2d
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                return r3
            L26:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                r1.set(r0)     // Catch: java.lang.Throwable -> L2d
                throw r3     // Catch: java.lang.Throwable -> L2d
            L2d:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                throw r3
        }

        @Override // java.util.Collection
        public boolean retainAll(java.util.Collection<?> r3) {
                r2 = this;
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.lock()
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                java.util.Map r0 = r0.copy()     // Catch: java.lang.Throwable -> L2d
                java.util.Collection r1 = r0.values()     // Catch: java.lang.Throwable -> L26
                boolean r3 = r1.retainAll(r3)     // Catch: java.lang.Throwable -> L26
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                r1.set(r0)     // Catch: java.lang.Throwable -> L2d
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                return r3
            L26:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r1 = r2.this$0     // Catch: java.lang.Throwable -> L2d
                r1.set(r0)     // Catch: java.lang.Throwable -> L2d
                throw r3     // Catch: java.lang.Throwable -> L2d
            L2d:
                r3 = move-exception
                org.bson.util.AbstractCopyOnWriteMap r0 = r2.this$0
                java.util.concurrent.locks.Lock r0 = org.bson.util.AbstractCopyOnWriteMap.access$100(r0)
                r0.unlock()
                throw r3
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class View<K, V> {

        public static abstract enum Type extends java.lang.Enum<org.bson.util.AbstractCopyOnWriteMap.View.Type> {
            private static final /* synthetic */ org.bson.util.AbstractCopyOnWriteMap.View.Type[] $VALUES = null;
            public static final org.bson.util.AbstractCopyOnWriteMap.View.Type LIVE = null;
            public static final org.bson.util.AbstractCopyOnWriteMap.View.Type STABLE = null;



            static {
                    org.bson.util.AbstractCopyOnWriteMap$View$Type$1 r0 = new org.bson.util.AbstractCopyOnWriteMap$View$Type$1
                    r0.<init>()
                    org.bson.util.AbstractCopyOnWriteMap.View.Type.STABLE = r0
                    org.bson.util.AbstractCopyOnWriteMap$View$Type$2 r1 = new org.bson.util.AbstractCopyOnWriteMap$View$Type$2
                    r1.<init>()
                    org.bson.util.AbstractCopyOnWriteMap.View.Type.LIVE = r1
                    r2 = 2
                    org.bson.util.AbstractCopyOnWriteMap$View$Type[] r2 = new org.bson.util.AbstractCopyOnWriteMap.View.Type[r2]
                    r3 = 0
                    r2[r3] = r0
                    r0 = 1
                    r2[r0] = r1
                    org.bson.util.AbstractCopyOnWriteMap.View.Type.$VALUES = r2
                    return
            }

            private Type(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public /* synthetic */ Type(java.lang.String r1, int r2, org.bson.util.AbstractCopyOnWriteMap.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static org.bson.util.AbstractCopyOnWriteMap.View.Type valueOf(java.lang.String r1) {
                    java.lang.Class<org.bson.util.AbstractCopyOnWriteMap$View$Type> r0 = org.bson.util.AbstractCopyOnWriteMap.View.Type.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    org.bson.util.AbstractCopyOnWriteMap$View$Type r1 = (org.bson.util.AbstractCopyOnWriteMap.View.Type) r1
                    return r1
            }

            public static org.bson.util.AbstractCopyOnWriteMap.View.Type[] values() {
                    org.bson.util.AbstractCopyOnWriteMap$View$Type[] r0 = org.bson.util.AbstractCopyOnWriteMap.View.Type.$VALUES
                    java.lang.Object r0 = r0.clone()
                    org.bson.util.AbstractCopyOnWriteMap$View$Type[] r0 = (org.bson.util.AbstractCopyOnWriteMap.View.Type[]) r0
                    return r0
            }

            public abstract <K, V, M extends java.util.Map<K, V>> org.bson.util.AbstractCopyOnWriteMap.View<K, V> get(org.bson.util.AbstractCopyOnWriteMap<K, V, M> r1);
        }

        public View() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.util.Set<java.util.Map.Entry<K, V>> entrySet();

        public abstract java.util.Set<K> keySet();

        public abstract java.util.Collection<V> values();
    }

    public <N extends java.util.Map<? extends K, ? extends V>> AbstractCopyOnWriteMap(N r2, org.bson.util.AbstractCopyOnWriteMap.View.Type r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.lock = r0
            java.lang.String r0 = "map"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            java.util.Map r2 = (java.util.Map) r2
            java.util.Map r2 = r1.copy(r2)
            java.lang.String r0 = "delegate"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
            java.util.Map r2 = (java.util.Map) r2
            r1.delegate = r2
            java.lang.String r2 = "viewType"
            java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r2, r3)
            org.bson.util.AbstractCopyOnWriteMap$View$Type r2 = (org.bson.util.AbstractCopyOnWriteMap.View.Type) r2
            org.bson.util.AbstractCopyOnWriteMap$View r2 = r2.get(r1)
            r1.view = r2
            return
    }

    public static /* synthetic */ java.util.Map access$000(org.bson.util.AbstractCopyOnWriteMap r0) {
            M extends java.util.Map<K, V> r0 = r0.delegate
            return r0
    }

    public static /* synthetic */ java.util.concurrent.locks.Lock access$100(org.bson.util.AbstractCopyOnWriteMap r0) {
            java.util.concurrent.locks.Lock r0 = r0.lock
            return r0
    }

    private boolean equals(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            if (r1 != 0) goto L8
            if (r2 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
        L8:
            boolean r1 = r1.equals(r2)
            return r1
    }

    @Override // java.util.Map
    public final void clear() {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.lock
            r0.lock()
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L15
            java.util.Map r0 = r2.copy(r0)     // Catch: java.lang.Throwable -> L15
            r2.delegate = r0     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.Lock r0 = r2.lock
            r0.unlock()
            return
        L15:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.lock
            r1.unlock()
            throw r0
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r2) {
            r1 = this;
            M extends java.util.Map<K, V> r0 = r1.delegate
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r2) {
            r1 = this;
            M extends java.util.Map<K, V> r0 = r1.delegate
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    public final M copy() {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.lock
            r0.lock()
            M extends java.util.Map<K, V> r0 = r2.delegate     // Catch: java.lang.Throwable -> L11
            java.util.Map r0 = r2.copy(r0)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.locks.Lock r1 = r2.lock
            r1.unlock()
            return r0
        L11:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.lock
            r1.unlock()
            throw r0
    }

    public abstract <N extends java.util.Map<? extends K, ? extends V>> M copy(N r1);

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            org.bson.util.AbstractCopyOnWriteMap$View<K, V> r0 = r1.view
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            M extends java.util.Map<K, V> r0 = r1.delegate
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.Map
    public final V get(java.lang.Object r2) {
            r1 = this;
            M extends java.util.Map<K, V> r0 = r1.delegate
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.Map
    public final int hashCode() {
            r1 = this;
            M extends java.util.Map<K, V> r0 = r1.delegate
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r1 = this;
            M extends java.util.Map<K, V> r0 = r1.delegate
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
            r1 = this;
            org.bson.util.AbstractCopyOnWriteMap$View<K, V> r0 = r1.view
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public final V put(K r2, V r3) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.lock
            r0.lock()
            java.util.Map r0 = r1.copy()     // Catch: java.lang.Throwable -> L19
            java.lang.Object r2 = r0.put(r2, r3)     // Catch: java.lang.Throwable -> L15
            r1.delegate = r0     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.locks.Lock r3 = r1.lock
            r3.unlock()
            return r2
        L15:
            r2 = move-exception
            r1.delegate = r0     // Catch: java.lang.Throwable -> L19
            throw r2     // Catch: java.lang.Throwable -> L19
        L19:
            r2 = move-exception
            java.util.concurrent.locks.Lock r3 = r1.lock
            r3.unlock()
            throw r2
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.lock
            r0.lock()
            java.util.Map r0 = r1.copy()     // Catch: java.lang.Throwable -> L14
            r0.putAll(r2)     // Catch: java.lang.Throwable -> L14
            r1.delegate = r0     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.locks.Lock r2 = r1.lock
            r2.unlock()
            return
        L14:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.lock
            r0.unlock()
            throw r2
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public V putIfAbsent(K r2, V r3) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.lock
            r0.lock()
            M extends java.util.Map<K, V> r0 = r1.delegate     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L21
            java.util.Map r0 = r1.copy()     // Catch: java.lang.Throwable -> L28
            java.lang.Object r2 = r0.put(r2, r3)     // Catch: java.lang.Throwable -> L1d
            r1.delegate = r0     // Catch: java.lang.Throwable -> L28
        L17:
            java.util.concurrent.locks.Lock r3 = r1.lock
            r3.unlock()
            return r2
        L1d:
            r2 = move-exception
            r1.delegate = r0     // Catch: java.lang.Throwable -> L28
            throw r2     // Catch: java.lang.Throwable -> L28
        L21:
            M extends java.util.Map<K, V> r3 = r1.delegate     // Catch: java.lang.Throwable -> L28
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L28
            goto L17
        L28:
            r2 = move-exception
            java.util.concurrent.locks.Lock r3 = r1.lock
            r3.unlock()
            throw r2
    }

    @Override // java.util.Map
    public final V remove(java.lang.Object r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.lock
            r0.lock()
            M extends java.util.Map<K, V> r0 = r1.delegate     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L14
            r2 = 0
        Le:
            java.util.concurrent.locks.Lock r0 = r1.lock
            r0.unlock()
            return r2
        L14:
            java.util.Map r0 = r1.copy()     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L1f
            r1.delegate = r0     // Catch: java.lang.Throwable -> L23
            goto Le
        L1f:
            r2 = move-exception
            r1.delegate = r0     // Catch: java.lang.Throwable -> L23
            throw r2     // Catch: java.lang.Throwable -> L23
        L23:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.lock
            r0.unlock()
            throw r2
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean remove(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.lock
            r0.lock()
            M extends java.util.Map<K, V> r0 = r1.delegate     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L29
            M extends java.util.Map<K, V> r0 = r1.delegate     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r1.equals(r3, r0)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L29
            java.util.Map r3 = r1.copy()     // Catch: java.lang.Throwable -> L2b
            r3.remove(r2)     // Catch: java.lang.Throwable -> L2b
            r1.delegate = r3     // Catch: java.lang.Throwable -> L2b
            r2 = 1
        L23:
            java.util.concurrent.locks.Lock r3 = r1.lock
            r3.unlock()
            return r2
        L29:
            r2 = 0
            goto L23
        L2b:
            r2 = move-exception
            java.util.concurrent.locks.Lock r3 = r1.lock
            r3.unlock()
            throw r2
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public V replace(K r2, V r3) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.lock
            r0.lock()
            M extends java.util.Map<K, V> r0 = r1.delegate     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L14
            r2 = 0
        Le:
            java.util.concurrent.locks.Lock r3 = r1.lock
            r3.unlock()
            return r2
        L14:
            java.util.Map r0 = r1.copy()     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r0.put(r2, r3)     // Catch: java.lang.Throwable -> L1f
            r1.delegate = r0     // Catch: java.lang.Throwable -> L23
            goto Le
        L1f:
            r2 = move-exception
            r1.delegate = r0     // Catch: java.lang.Throwable -> L23
            throw r2     // Catch: java.lang.Throwable -> L23
        L23:
            r2 = move-exception
            java.util.concurrent.locks.Lock r3 = r1.lock
            r3.unlock()
            throw r2
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean replace(K r2, V r3, V r4) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.lock
            r0.lock()
            M extends java.util.Map<K, V> r0 = r1.delegate     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2a
            M extends java.util.Map<K, V> r0 = r1.delegate     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r1.equals(r3, r0)     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto L1a
            goto L2a
        L1a:
            java.util.Map r3 = r1.copy()     // Catch: java.lang.Throwable -> L2c
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> L2c
            r1.delegate = r3     // Catch: java.lang.Throwable -> L2c
            r2 = 1
        L24:
            java.util.concurrent.locks.Lock r3 = r1.lock
            r3.unlock()
            return r2
        L2a:
            r2 = 0
            goto L24
        L2c:
            r2 = move-exception
            java.util.concurrent.locks.Lock r3 = r1.lock
            r3.unlock()
            throw r2
    }

    public final void set(M r1) {
            r0 = this;
            r0.delegate = r1
            return
    }

    @Override // java.util.Map
    public final int size() {
            r1 = this;
            M extends java.util.Map<K, V> r0 = r1.delegate
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            M extends java.util.Map<K, V> r0 = r1.delegate
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Collection<V> values() {
            r1 = this;
            org.bson.util.AbstractCopyOnWriteMap$View<K, V> r0 = r1.view
            java.util.Collection r0 = r0.values()
            return r0
    }
}
