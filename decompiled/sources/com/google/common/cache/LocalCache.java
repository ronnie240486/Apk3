package com.google.common.cache;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
class LocalCache<K, V> extends java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V> {
    public static final java.util.Queue<?> DISCARDING_QUEUE = null;
    public static final com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> UNSET = null;
    public static final java.util.logging.Logger logger = null;
    public final int concurrencyLevel;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final com.google.common.cache.CacheLoader<? super K, V> defaultLoader;
    public final com.google.common.cache.LocalCache.EntryFactory entryFactory;

    @com.google.j2objc.annotations.RetainedWith
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    public final long expireAfterAccessNanos;
    public final long expireAfterWriteNanos;
    public final com.google.common.cache.AbstractCache.StatsCounter globalStatsCounter;
    public final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;

    @com.google.j2objc.annotations.RetainedWith
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.util.Set<K> keySet;
    public final com.google.common.cache.LocalCache.Strength keyStrength;
    public final long maxWeight;
    public final long refreshNanos;
    public final com.google.common.cache.RemovalListener<K, V> removalListener;
    public final java.util.Queue<com.google.common.cache.RemovalNotification<K, V>> removalNotificationQueue;
    public final int segmentMask;
    public final int segmentShift;
    public final com.google.common.cache.LocalCache.Segment<K, V>[] segments;
    public final com.google.common.base.Ticker ticker;
    public final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
    public final com.google.common.cache.LocalCache.Strength valueStrength;

    @com.google.j2objc.annotations.RetainedWith
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.util.Collection<V> values;
    public final com.google.common.cache.Weigher<K, V> weigher;



    public abstract class AbstractCacheSet<T> extends java.util.AbstractSet<T> {
        public final /* synthetic */ com.google.common.cache.LocalCache this$0;

        public AbstractCacheSet(com.google.common.cache.LocalCache r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.common.cache.LocalCache r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                com.google.common.cache.LocalCache r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.cache.LocalCache r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.cache.LocalCache.access$200(r1)
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] r2) {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.cache.LocalCache.access$200(r1)
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class AbstractReferenceEntry<K, V> implements com.google.common.cache.ReferenceEntry<K, V> {
        public AbstractReferenceEntry() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNext() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class AccessQueue<K, V> extends java.util.AbstractQueue<com.google.common.cache.ReferenceEntry<K, V>> {
        public final com.google.common.cache.ReferenceEntry<K, V> head;



        public AccessQueue() {
                r1 = this;
                r1.<init>()
                com.google.common.cache.LocalCache$AccessQueue$1 r0 = new com.google.common.cache.LocalCache$AccessQueue$1
                r0.<init>()
                r1.head = r0
                return
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInAccessQueue()
            L6:
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 == r1) goto L13
                com.google.common.cache.ReferenceEntry r1 = r0.getNextInAccessQueue()
                com.google.common.cache.LocalCache.nullifyAccessOrder(r0)
                r0 = r1
                goto L6
            L13:
                r1.setNextInAccessQueue(r1)
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                r0.setPreviousInAccessQueue(r0)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2
                com.google.common.cache.ReferenceEntry r2 = r2.getNextInAccessQueue()
                com.google.common.cache.LocalCache$NullEntry r0 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                if (r2 == r0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInAccessQueue()
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 != r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<com.google.common.cache.ReferenceEntry<K, V>> iterator() {
                r2 = this;
                com.google.common.cache.LocalCache$AccessQueue$2 r0 = new com.google.common.cache.LocalCache$AccessQueue$2
                com.google.common.cache.ReferenceEntry r1 = r2.peek()
                r0.<init>(r2, r1)
                return r0
        }

        public boolean offer(com.google.common.cache.ReferenceEntry<K, V> r3) {
                r2 = this;
                com.google.common.cache.ReferenceEntry r0 = r3.getPreviousInAccessQueue()
                com.google.common.cache.ReferenceEntry r1 = r3.getNextInAccessQueue()
                com.google.common.cache.LocalCache.connectAccessOrder(r0, r1)
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getPreviousInAccessQueue()
                com.google.common.cache.LocalCache.connectAccessOrder(r0, r3)
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                r3.setNextInAccessQueue(r0)
                r0.setPreviousInAccessQueue(r3)
                r3 = 1
                return r3
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ boolean offer(java.lang.Object r1) {
                r0 = this;
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1
                boolean r1 = r0.offer(r1)
                return r1
        }

        @Override // java.util.Queue
        public com.google.common.cache.ReferenceEntry<K, V> peek() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInAccessQueue()
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 != r1) goto Lb
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ java.lang.Object peek() {
                r1 = this;
                com.google.common.cache.ReferenceEntry r0 = r1.peek()
                return r0
        }

        @Override // java.util.Queue
        public com.google.common.cache.ReferenceEntry<K, V> poll() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInAccessQueue()
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 != r1) goto Lc
                r0 = 0
                return r0
            Lc:
                r2.remove(r0)
                return r0
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ java.lang.Object poll() {
                r1 = this;
                com.google.common.cache.ReferenceEntry r0 = r1.poll()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                com.google.common.cache.ReferenceEntry r3 = (com.google.common.cache.ReferenceEntry) r3
                com.google.common.cache.ReferenceEntry r0 = r3.getPreviousInAccessQueue()
                com.google.common.cache.ReferenceEntry r1 = r3.getNextInAccessQueue()
                com.google.common.cache.LocalCache.connectAccessOrder(r0, r1)
                com.google.common.cache.LocalCache.nullifyAccessOrder(r3)
                com.google.common.cache.LocalCache$NullEntry r3 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                if (r1 == r3) goto L16
                r3 = 1
                goto L17
            L16:
                r3 = 0
            L17:
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r3 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r3.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInAccessQueue()
                r1 = 0
            L7:
                com.google.common.cache.ReferenceEntry<K, V> r2 = r3.head
                if (r0 == r2) goto L12
                int r1 = r1 + 1
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInAccessQueue()
                goto L7
            L12:
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract enum EntryFactory extends java.lang.Enum<com.google.common.cache.LocalCache.EntryFactory> {
        private static final /* synthetic */ com.google.common.cache.LocalCache.EntryFactory[] $VALUES = null;
        public static final com.google.common.cache.LocalCache.EntryFactory STRONG = null;
        public static final com.google.common.cache.LocalCache.EntryFactory STRONG_ACCESS = null;
        public static final com.google.common.cache.LocalCache.EntryFactory STRONG_ACCESS_WRITE = null;
        public static final com.google.common.cache.LocalCache.EntryFactory STRONG_WRITE = null;
        public static final com.google.common.cache.LocalCache.EntryFactory WEAK = null;
        public static final com.google.common.cache.LocalCache.EntryFactory WEAK_ACCESS = null;
        public static final com.google.common.cache.LocalCache.EntryFactory WEAK_ACCESS_WRITE = null;
        public static final com.google.common.cache.LocalCache.EntryFactory WEAK_WRITE = null;
        public static final com.google.common.cache.LocalCache.EntryFactory[] factories = null;









        private static /* synthetic */ com.google.common.cache.LocalCache.EntryFactory[] $values() {
                r0 = 8
                com.google.common.cache.LocalCache$EntryFactory[] r0 = new com.google.common.cache.LocalCache.EntryFactory[r0]
                com.google.common.cache.LocalCache$EntryFactory r1 = com.google.common.cache.LocalCache.EntryFactory.STRONG
                r2 = 0
                r0[r2] = r1
                com.google.common.cache.LocalCache$EntryFactory r1 = com.google.common.cache.LocalCache.EntryFactory.STRONG_ACCESS
                r2 = 1
                r0[r2] = r1
                com.google.common.cache.LocalCache$EntryFactory r1 = com.google.common.cache.LocalCache.EntryFactory.STRONG_WRITE
                r2 = 2
                r0[r2] = r1
                com.google.common.cache.LocalCache$EntryFactory r1 = com.google.common.cache.LocalCache.EntryFactory.STRONG_ACCESS_WRITE
                r2 = 3
                r0[r2] = r1
                com.google.common.cache.LocalCache$EntryFactory r1 = com.google.common.cache.LocalCache.EntryFactory.WEAK
                r2 = 4
                r0[r2] = r1
                com.google.common.cache.LocalCache$EntryFactory r1 = com.google.common.cache.LocalCache.EntryFactory.WEAK_ACCESS
                r2 = 5
                r0[r2] = r1
                com.google.common.cache.LocalCache$EntryFactory r1 = com.google.common.cache.LocalCache.EntryFactory.WEAK_WRITE
                r2 = 6
                r0[r2] = r1
                com.google.common.cache.LocalCache$EntryFactory r1 = com.google.common.cache.LocalCache.EntryFactory.WEAK_ACCESS_WRITE
                r2 = 7
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.cache.LocalCache$EntryFactory$1 r0 = new com.google.common.cache.LocalCache$EntryFactory$1
                r0.<init>()
                com.google.common.cache.LocalCache.EntryFactory.STRONG = r0
                com.google.common.cache.LocalCache$EntryFactory$2 r1 = new com.google.common.cache.LocalCache$EntryFactory$2
                r1.<init>()
                com.google.common.cache.LocalCache.EntryFactory.STRONG_ACCESS = r1
                com.google.common.cache.LocalCache$EntryFactory$3 r2 = new com.google.common.cache.LocalCache$EntryFactory$3
                r2.<init>()
                com.google.common.cache.LocalCache.EntryFactory.STRONG_WRITE = r2
                com.google.common.cache.LocalCache$EntryFactory$4 r3 = new com.google.common.cache.LocalCache$EntryFactory$4
                r3.<init>()
                com.google.common.cache.LocalCache.EntryFactory.STRONG_ACCESS_WRITE = r3
                com.google.common.cache.LocalCache$EntryFactory$5 r4 = new com.google.common.cache.LocalCache$EntryFactory$5
                r4.<init>()
                com.google.common.cache.LocalCache.EntryFactory.WEAK = r4
                com.google.common.cache.LocalCache$EntryFactory$6 r5 = new com.google.common.cache.LocalCache$EntryFactory$6
                r5.<init>()
                com.google.common.cache.LocalCache.EntryFactory.WEAK_ACCESS = r5
                com.google.common.cache.LocalCache$EntryFactory$7 r6 = new com.google.common.cache.LocalCache$EntryFactory$7
                r6.<init>()
                com.google.common.cache.LocalCache.EntryFactory.WEAK_WRITE = r6
                com.google.common.cache.LocalCache$EntryFactory$8 r7 = new com.google.common.cache.LocalCache$EntryFactory$8
                r7.<init>()
                com.google.common.cache.LocalCache.EntryFactory.WEAK_ACCESS_WRITE = r7
                com.google.common.cache.LocalCache$EntryFactory[] r8 = $values()
                com.google.common.cache.LocalCache.EntryFactory.$VALUES = r8
                r8 = 8
                com.google.common.cache.LocalCache$EntryFactory[] r8 = new com.google.common.cache.LocalCache.EntryFactory[r8]
                r9 = 0
                r8[r9] = r0
                r0 = 1
                r8[r0] = r1
                r0 = 2
                r8[r0] = r2
                r0 = 3
                r8[r0] = r3
                r0 = 4
                r8[r0] = r4
                r0 = 5
                r8[r0] = r5
                r0 = 6
                r8[r0] = r6
                r0 = 7
                r8[r0] = r7
                com.google.common.cache.LocalCache.EntryFactory.factories = r8
                return
        }

        private EntryFactory(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ EntryFactory(java.lang.String r1, int r2, com.google.common.cache.LocalCache.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.cache.LocalCache.EntryFactory valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.cache.LocalCache$EntryFactory> r0 = com.google.common.cache.LocalCache.EntryFactory.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.cache.LocalCache$EntryFactory r1 = (com.google.common.cache.LocalCache.EntryFactory) r1
                return r1
        }

        public static com.google.common.cache.LocalCache.EntryFactory[] values() {
                com.google.common.cache.LocalCache$EntryFactory[] r0 = com.google.common.cache.LocalCache.EntryFactory.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.cache.LocalCache$EntryFactory[] r0 = (com.google.common.cache.LocalCache.EntryFactory[]) r0
                return r0
        }

        public final <K, V> void copyAccessEntry(com.google.common.cache.ReferenceEntry<K, V> r3, com.google.common.cache.ReferenceEntry<K, V> r4) {
                r2 = this;
                long r0 = r3.getAccessTime()
                r4.setAccessTime(r0)
                com.google.common.cache.ReferenceEntry r0 = r3.getPreviousInAccessQueue()
                com.google.common.cache.LocalCache.connectAccessOrder(r0, r4)
                com.google.common.cache.ReferenceEntry r0 = r3.getNextInAccessQueue()
                r4.setNextInAccessQueue(r0)
                r0.setPreviousInAccessQueue(r4)
                com.google.common.cache.LocalCache.nullifyAccessOrder(r3)
                return
        }

        public <K, V> com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.LocalCache.Segment<K, V> r2, com.google.common.cache.ReferenceEntry<K, V> r3, com.google.common.cache.ReferenceEntry<K, V> r4) {
                r1 = this;
                java.lang.Object r0 = r3.getKey()
                int r3 = r3.getHash()
                com.google.common.cache.ReferenceEntry r2 = r1.newEntry(r2, r0, r3, r4)
                return r2
        }

        public final <K, V> void copyWriteEntry(com.google.common.cache.ReferenceEntry<K, V> r3, com.google.common.cache.ReferenceEntry<K, V> r4) {
                r2 = this;
                long r0 = r3.getWriteTime()
                r4.setWriteTime(r0)
                com.google.common.cache.ReferenceEntry r0 = r3.getPreviousInWriteQueue()
                com.google.common.cache.LocalCache.connectWriteOrder(r0, r4)
                com.google.common.cache.ReferenceEntry r0 = r3.getNextInWriteQueue()
                r4.setNextInWriteQueue(r0)
                r0.setPreviousInWriteQueue(r4)
                com.google.common.cache.LocalCache.nullifyWriteOrder(r3)
                return
        }

        public abstract <K, V> com.google.common.cache.ReferenceEntry<K, V> newEntry(com.google.common.cache.LocalCache.Segment<K, V> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class EntryIterator extends com.google.common.cache.LocalCache<K, V>.HashIterator<java.util.Map.Entry<K, V>> {
        public EntryIterator(com.google.common.cache.LocalCache r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r1 = this;
                com.google.common.cache.LocalCache$WriteThroughEntry r0 = r1.nextEntry()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class EntrySet extends com.google.common.cache.LocalCache<K, V>.AbstractCacheSet<java.util.Map.Entry<K, V>> {
        public final /* synthetic */ com.google.common.cache.LocalCache this$0;

        public EntrySet(com.google.common.cache.LocalCache r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
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
                com.google.common.cache.LocalCache r2 = r3.this$0
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L26
                com.google.common.cache.LocalCache r2 = r3.this$0
                com.google.common.base.Equivalence<java.lang.Object> r2 = r2.valueEquivalence
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.equivalent(r4, r0)
                if (r4 == 0) goto L26
                r1 = 1
            L26:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                com.google.common.cache.LocalCache$EntryIterator r0 = new com.google.common.cache.LocalCache$EntryIterator
                com.google.common.cache.LocalCache r1 = r2.this$0
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
                com.google.common.cache.LocalCache r2 = r3.this$0
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L1b
                r1 = 1
            L1b:
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public abstract class HashIterator<T> implements java.util.Iterator<T> {

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public com.google.common.cache.LocalCache.Segment<K, V> currentSegment;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> currentTable;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public com.google.common.cache.LocalCache<K, V>.WriteThroughEntry lastReturned;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public com.google.common.cache.ReferenceEntry<K, V> nextEntry;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public com.google.common.cache.LocalCache<K, V>.WriteThroughEntry nextExternal;
        public int nextSegmentIndex;
        public int nextTableIndex;
        public final /* synthetic */ com.google.common.cache.LocalCache this$0;

        public HashIterator(com.google.common.cache.LocalCache r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                com.google.common.cache.LocalCache$Segment<K, V>[] r2 = r2.segments
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
                com.google.common.cache.LocalCache r1 = r3.this$0
                com.google.common.cache.LocalCache$Segment<K, V>[] r1 = r1.segments
                int r2 = r0 + (-1)
                r3.nextSegmentIndex = r2
                r0 = r1[r0]
                r3.currentSegment = r0
                int r0 = r0.count
                if (r0 == 0) goto L11
                com.google.common.cache.LocalCache$Segment<K, V> r0 = r3.currentSegment
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r0.table
                r3.currentTable = r0
                int r0 = r0.length()
                int r0 = r0 + (-1)
                r3.nextTableIndex = r0
                boolean r0 = r3.nextInTable()
                if (r0 == 0) goto L11
            L39:
                return
        }

        public final boolean advanceTo(com.google.common.cache.ReferenceEntry<K, V> r7) {
                r6 = this;
                com.google.common.cache.LocalCache r0 = r6.this$0     // Catch: java.lang.Throwable -> L40
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L40
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L40
                java.lang.Object r2 = r7.getKey()     // Catch: java.lang.Throwable -> L40
                com.google.common.cache.LocalCache r3 = r6.this$0     // Catch: java.lang.Throwable -> L40
                java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L40
                java.lang.Object r4 = r7.getKey()     // Catch: java.lang.Throwable -> L40
                r5 = 0
                if (r4 != 0) goto L19
                goto L2c
            L19:
                com.google.common.cache.LocalCache$ValueReference r4 = r7.getValueReference()     // Catch: java.lang.Throwable -> L40
                java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L40
                if (r4 != 0) goto L24
                goto L2c
            L24:
                boolean r7 = r3.isExpired(r7, r0)     // Catch: java.lang.Throwable -> L40
                if (r7 == 0) goto L2b
                goto L2c
            L2b:
                r5 = r4
            L2c:
                if (r5 == 0) goto L3e
                com.google.common.cache.LocalCache$WriteThroughEntry r7 = new com.google.common.cache.LocalCache$WriteThroughEntry     // Catch: java.lang.Throwable -> L40
                com.google.common.cache.LocalCache r0 = r6.this$0     // Catch: java.lang.Throwable -> L40
                r7.<init>(r0, r2, r5)     // Catch: java.lang.Throwable -> L40
                r6.nextExternal = r7     // Catch: java.lang.Throwable -> L40
                r7 = 1
            L38:
                com.google.common.cache.LocalCache$Segment<K, V> r0 = r6.currentSegment
                r0.postReadCleanup()
                return r7
            L3e:
                r7 = 0
                goto L38
            L40:
                r7 = move-exception
                com.google.common.cache.LocalCache$Segment<K, V> r0 = r6.currentSegment
                r0.postReadCleanup()
                throw r7
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                com.google.common.cache.LocalCache<K, V>$WriteThroughEntry r0 = r1.nextExternal
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

        public final com.google.common.cache.LocalCache<K, V>.WriteThroughEntry nextEntry() {
                r1 = this;
                com.google.common.cache.LocalCache<K, V>$WriteThroughEntry r0 = r1.nextExternal
                if (r0 == 0) goto Lc
                r1.lastReturned = r0
                r1.advance()
                com.google.common.cache.LocalCache<K, V>$WriteThroughEntry r0 = r1.lastReturned
                return r0
            Lc:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        public final boolean nextInChain() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextEntry
                if (r0 == 0) goto L19
            L4:
                com.google.common.cache.ReferenceEntry r0 = r0.getNext()
                r1.nextEntry = r0
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextEntry
                if (r0 == 0) goto L19
                boolean r0 = r1.advanceTo(r0)
                if (r0 == 0) goto L16
                r0 = 1
                return r0
            L16:
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextEntry
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
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r1 = r3.currentTable
                int r2 = r0 + (-1)
                r3.nextTableIndex = r2
                java.lang.Object r0 = r1.get(r0)
                com.google.common.cache.ReferenceEntry r0 = (com.google.common.cache.ReferenceEntry) r0
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
                com.google.common.cache.LocalCache<K, V>$WriteThroughEntry r0 = r2.lastReturned
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                com.google.common.base.Preconditions.checkState(r0)
                com.google.common.cache.LocalCache r0 = r2.this$0
                com.google.common.cache.LocalCache<K, V>$WriteThroughEntry r1 = r2.lastReturned
                java.lang.Object r1 = r1.getKey()
                r0.remove(r1)
                r0 = 0
                r2.lastReturned = r0
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class KeyIterator extends com.google.common.cache.LocalCache<K, V>.HashIterator<K> {
        public KeyIterator(com.google.common.cache.LocalCache r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public K next() {
                r1 = this;
                com.google.common.cache.LocalCache$WriteThroughEntry r0 = r1.nextEntry()
                java.lang.Object r0 = r0.getKey()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class KeySet extends com.google.common.cache.LocalCache<K, V>.AbstractCacheSet<K> {
        public final /* synthetic */ com.google.common.cache.LocalCache this$0;

        public KeySet(com.google.common.cache.LocalCache r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.common.cache.LocalCache r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r2 = this;
                com.google.common.cache.LocalCache$KeyIterator r0 = new com.google.common.cache.LocalCache$KeyIterator
                com.google.common.cache.LocalCache r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                com.google.common.cache.LocalCache r0 = r1.this$0
                java.lang.Object r2 = r0.remove(r2)
                if (r2 == 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class LoadingSerializationProxy<K, V> extends com.google.common.cache.LocalCache.ManualSerializationProxy<K, V> implements com.google.common.cache.LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public transient com.google.common.cache.LoadingCache<K, V> autoDelegate;

        private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException, java.lang.ClassNotFoundException {
                r1 = this;
                r2.defaultReadObject()
                com.google.common.cache.CacheBuilder r2 = r1.recreateCacheBuilder()
                com.google.common.cache.CacheLoader<? super K, V> r0 = r1.loader
                com.google.common.cache.LoadingCache r2 = r2.build(r0)
                r1.autoDelegate = r2
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.autoDelegate
                return r0
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K r2) {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.autoDelegate
                java.lang.Object r2 = r0.apply(r2)
                return r2
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K r2) throws java.util.concurrent.ExecutionException {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.autoDelegate
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // com.google.common.cache.LoadingCache
        public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> r2) throws java.util.concurrent.ExecutionException {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.autoDelegate
                com.google.common.collect.ImmutableMap r2 = r0.getAll(r2)
                return r2
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K r2) {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.autoDelegate
                java.lang.Object r2 = r0.getUnchecked(r2)
                return r2
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K r2) {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.autoDelegate
                r0.refresh(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class LoadingValueReference<K, V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        public final com.google.common.util.concurrent.SettableFuture<V> futureValue;
        public volatile com.google.common.cache.LocalCache.ValueReference<K, V> oldValue;
        public final com.google.common.base.Stopwatch stopwatch;


        public LoadingValueReference() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<java.lang.Object, java.lang.Object> r0 = com.google.common.cache.LocalCache.UNSET
                r1.<init>(r0)
                return
        }

        public LoadingValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> r2) {
                r1 = this;
                r1.<init>()
                com.google.common.util.concurrent.SettableFuture r0 = com.google.common.util.concurrent.SettableFuture.create()
                r1.futureValue = r0
                com.google.common.base.Stopwatch r0 = com.google.common.base.Stopwatch.createUnstarted()
                r1.stopwatch = r0
                r1.oldValue = r2
                return
        }

        private com.google.common.util.concurrent.ListenableFuture<V> fullyFailedFuture(java.lang.Throwable r1) {
                r0 = this;
                com.google.common.util.concurrent.ListenableFuture r1 = com.google.common.util.concurrent.Futures.immediateFailedFuture(r1)
                return r1
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2, com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                return r0
        }

        public long elapsedNanos() {
                r2 = this;
                com.google.common.base.Stopwatch r0 = r2.stopwatch
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                long r0 = r0.elapsed(r1)
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.oldValue
                java.lang.Object r0 = r0.get()
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
                r1 = this;
                r0 = 0
                return r0
        }

        public com.google.common.cache.LocalCache.ValueReference<K, V> getOldValue() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.oldValue
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.oldValue
                int r0 = r0.getWeight()
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.oldValue
                boolean r0 = r0.isActive()
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
                r1 = this;
                r0 = 1
                return r0
        }

        public com.google.common.util.concurrent.ListenableFuture<V> loadFuture(K r2, com.google.common.cache.CacheLoader<? super K, V> r3) {
                r1 = this;
                com.google.common.base.Stopwatch r0 = r1.stopwatch     // Catch: java.lang.Throwable -> L39
                r0.start()     // Catch: java.lang.Throwable -> L39
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.oldValue     // Catch: java.lang.Throwable -> L39
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L39
                if (r0 != 0) goto L1f
                java.lang.Object r2 = r3.load(r2)     // Catch: java.lang.Throwable -> L39
                boolean r3 = r1.set(r2)     // Catch: java.lang.Throwable -> L39
                if (r3 == 0) goto L1a
                com.google.common.util.concurrent.SettableFuture<V> r2 = r1.futureValue     // Catch: java.lang.Throwable -> L39
                goto L1e
            L1a:
                com.google.common.util.concurrent.ListenableFuture r2 = com.google.common.util.concurrent.Futures.immediateFuture(r2)     // Catch: java.lang.Throwable -> L39
            L1e:
                return r2
            L1f:
                com.google.common.util.concurrent.ListenableFuture r2 = r3.reload(r2, r0)     // Catch: java.lang.Throwable -> L39
                if (r2 != 0) goto L2b
                r2 = 0
                com.google.common.util.concurrent.ListenableFuture r2 = com.google.common.util.concurrent.Futures.immediateFuture(r2)     // Catch: java.lang.Throwable -> L39
                return r2
            L2b:
                com.google.common.cache.LocalCache$LoadingValueReference$1 r3 = new com.google.common.cache.LocalCache$LoadingValueReference$1     // Catch: java.lang.Throwable -> L39
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L39
                java.util.concurrent.Executor r0 = com.google.common.util.concurrent.MoreExecutors.directExecutor()     // Catch: java.lang.Throwable -> L39
                com.google.common.util.concurrent.ListenableFuture r2 = com.google.common.util.concurrent.Futures.transform(r2, r3, r0)     // Catch: java.lang.Throwable -> L39
                return r2
            L39:
                r2 = move-exception
                boolean r3 = r1.setException(r2)
                if (r3 == 0) goto L43
                com.google.common.util.concurrent.SettableFuture<V> r3 = r1.futureValue
                goto L47
            L43:
                com.google.common.util.concurrent.ListenableFuture r3 = r1.fullyFailedFuture(r2)
            L47:
                boolean r2 = r2 instanceof java.lang.InterruptedException
                if (r2 == 0) goto L52
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                r2.interrupt()
            L52:
                return r3
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1) {
                r0 = this;
                if (r1 == 0) goto L6
                r0.set(r1)
                goto La
            L6:
                com.google.common.cache.LocalCache$ValueReference<java.lang.Object, java.lang.Object> r1 = com.google.common.cache.LocalCache.UNSET
                r0.oldValue = r1
            La:
                return
        }

        public boolean set(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r2) {
                r1 = this;
                com.google.common.util.concurrent.SettableFuture<V> r0 = r1.futureValue
                boolean r2 = r0.set(r2)
                return r2
        }

        public boolean setException(java.lang.Throwable r2) {
                r1 = this;
                com.google.common.util.concurrent.SettableFuture<V> r0 = r1.futureValue
                boolean r2 = r0.setException(r2)
                return r2
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() throws java.util.concurrent.ExecutionException {
                r1 = this;
                com.google.common.util.concurrent.SettableFuture<V> r0 = r1.futureValue
                java.lang.Object r0 = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LocalLoadingCache<K, V> extends com.google.common.cache.LocalCache.LocalManualCache<K, V> implements com.google.common.cache.LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        public LocalLoadingCache(com.google.common.cache.CacheBuilder<? super K, ? super V> r2, com.google.common.cache.CacheLoader<? super K, V> r3) {
                r1 = this;
                com.google.common.cache.LocalCache r0 = new com.google.common.cache.LocalCache
                java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.cache.CacheLoader r3 = (com.google.common.cache.CacheLoader) r3
                r0.<init>(r2, r3)
                r2 = 0
                r1.<init>(r0, r2)
                return
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K r1) {
                r0 = this;
                java.lang.Object r1 = r0.getUnchecked(r1)
                return r1
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K r3) throws java.util.concurrent.ExecutionException {
                r2 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r2.localCache
                com.google.common.cache.CacheLoader<? super K, V> r1 = r0.defaultLoader
                java.lang.Object r3 = r0.get(r3, r1)
                return r3
        }

        @Override // com.google.common.cache.LoadingCache
        public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> r9) throws java.util.concurrent.ExecutionException {
                r8 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r8.localCache
                java.util.Objects.requireNonNull(r0)
                java.util.LinkedHashMap r1 = com.google.common.collect.Maps.newLinkedHashMap()
                java.util.LinkedHashSet r2 = com.google.common.collect.Sets.newLinkedHashSet()
                java.util.Iterator r9 = r9.iterator()
                r3 = 0
                r4 = 0
            L13:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L35
                java.lang.Object r5 = r9.next()
                java.lang.Object r6 = r0.get(r5)
                boolean r7 = r1.containsKey(r5)
                if (r7 != 0) goto L13
                r1.put(r5, r6)
                if (r6 != 0) goto L32
                int r4 = r4 + 1
                r2.add(r5)
                goto L13
            L32:
                int r3 = r3 + 1
                goto L13
            L35:
                boolean r9 = r2.isEmpty()     // Catch: java.lang.Throwable -> La3
                if (r9 != 0) goto L94
                com.google.common.cache.CacheLoader<? super K, V> r9 = r0.defaultLoader     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                java.util.Map r9 = r0.loadAll(r2, r9)     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                java.util.Iterator r5 = r2.iterator()     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
            L45:
                boolean r6 = r5.hasNext()     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                if (r6 == 0) goto L94
                java.lang.Object r6 = r5.next()     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                java.lang.Object r7 = r9.get(r6)     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                if (r7 == 0) goto L59
                r1.put(r6, r7)     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                goto L45
            L59:
                com.google.common.cache.CacheLoader$InvalidCacheLoadException r9 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                int r6 = r5.length()     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                int r6 = r6 + 37
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                r7.<init>(r6)     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                java.lang.String r6 = "loadAll failed to return a value for "
                r7.append(r6)     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                r7.append(r5)     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                java.lang.String r5 = r7.toString()     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                r9.<init>(r5)     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
                throw r9     // Catch: com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> L7a java.lang.Throwable -> La3
            L7a:
                java.util.Iterator r9 = r2.iterator()     // Catch: java.lang.Throwable -> La3
            L7e:
                boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> La3
                if (r2 == 0) goto L94
                java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> La3
                int r4 = r4 + (-1)
                com.google.common.cache.CacheLoader<? super K, V> r5 = r0.defaultLoader     // Catch: java.lang.Throwable -> La3
                java.lang.Object r5 = r0.get(r2, r5)     // Catch: java.lang.Throwable -> La3
                r1.put(r2, r5)     // Catch: java.lang.Throwable -> La3
                goto L7e
            L94:
                com.google.common.collect.ImmutableMap r9 = com.google.common.collect.ImmutableMap.copyOf(r1)     // Catch: java.lang.Throwable -> La3
                com.google.common.cache.AbstractCache$StatsCounter r1 = r0.globalStatsCounter
                r1.recordHits(r3)
                com.google.common.cache.AbstractCache$StatsCounter r0 = r0.globalStatsCounter
                r0.recordMisses(r4)
                return r9
            La3:
                r9 = move-exception
                com.google.common.cache.AbstractCache$StatsCounter r1 = r0.globalStatsCounter
                r1.recordHits(r3)
                com.google.common.cache.AbstractCache$StatsCounter r0 = r0.globalStatsCounter
                r0.recordMisses(r4)
                throw r9
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K r2) {
                r1 = this;
                java.lang.Object r2 = r1.get(r2)     // Catch: java.util.concurrent.ExecutionException -> L5
                return r2
            L5:
                r2 = move-exception
                com.google.common.util.concurrent.UncheckedExecutionException r0 = new com.google.common.util.concurrent.UncheckedExecutionException
                java.lang.Throwable r2 = r2.getCause()
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K r5) {
                r4 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r4.localCache
                java.util.Objects.requireNonNull(r0)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r5)
                int r1 = r0.hash(r1)
                com.google.common.cache.LocalCache$Segment r2 = r0.segmentFor(r1)
                com.google.common.cache.CacheLoader<? super K, V> r0 = r0.defaultLoader
                r3 = 0
                r2.refresh(r5, r1, r0, r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LocalManualCache<K, V> implements com.google.common.cache.Cache<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 1;
        public final com.google.common.cache.LocalCache<K, V> localCache;


        public LocalManualCache(com.google.common.cache.CacheBuilder<? super K, ? super V> r3) {
                r2 = this;
                com.google.common.cache.LocalCache r0 = new com.google.common.cache.LocalCache
                r1 = 0
                r0.<init>(r3, r1)
                r2.<init>(r0)
                return
        }

        private LocalManualCache(com.google.common.cache.LocalCache<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.localCache = r1
                return
        }

        public /* synthetic */ LocalManualCache(com.google.common.cache.LocalCache r1, com.google.common.cache.LocalCache.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.cache.Cache
        public java.util.concurrent.ConcurrentMap<K, V> asMap() {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                return r0
        }

        @Override // com.google.common.cache.Cache
        public void cleanUp() {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                r0.cleanUp()
                return
        }

        @Override // com.google.common.cache.Cache
        public V get(K r3, java.util.concurrent.Callable<? extends V> r4) throws java.util.concurrent.ExecutionException {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                com.google.common.cache.LocalCache<K, V> r0 = r2.localCache
                com.google.common.cache.LocalCache$LocalManualCache$1 r1 = new com.google.common.cache.LocalCache$LocalManualCache$1
                r1.<init>(r4)
                java.lang.Object r3 = r0.get(r3, r1)
                return r3
        }

        @Override // com.google.common.cache.Cache
        public com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<?> r7) {
                r6 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r6.localCache
                java.util.Objects.requireNonNull(r0)
                java.util.LinkedHashMap r1 = com.google.common.collect.Maps.newLinkedHashMap()
                java.util.Iterator r7 = r7.iterator()
                r2 = 0
                r3 = 0
            Lf:
                boolean r4 = r7.hasNext()
                if (r4 == 0) goto L28
                java.lang.Object r4 = r7.next()
                java.lang.Object r5 = r0.get(r4)
                if (r5 != 0) goto L22
                int r3 = r3 + 1
                goto Lf
            L22:
                r1.put(r4, r5)
                int r2 = r2 + 1
                goto Lf
            L28:
                com.google.common.cache.AbstractCache$StatsCounter r7 = r0.globalStatsCounter
                r7.recordHits(r2)
                com.google.common.cache.AbstractCache$StatsCounter r7 = r0.globalStatsCounter
                r7.recordMisses(r3)
                com.google.common.collect.ImmutableMap r7 = com.google.common.collect.ImmutableMap.copyOf(r1)
                return r7
        }

        @Override // com.google.common.cache.Cache
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public V getIfPresent(java.lang.Object r2) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                java.lang.Object r2 = r0.getIfPresent(r2)
                return r2
        }

        @Override // com.google.common.cache.Cache
        public void invalidate(java.lang.Object r2) {
                r1 = this;
                com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                r0.remove(r2)
                return
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll() {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                r0.clear()
                return
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll(java.lang.Iterable<?> r3) {
                r2 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r2.localCache
                java.util.Objects.requireNonNull(r0)
                java.util.Iterator r3 = r3.iterator()
            L9:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L17
                java.lang.Object r1 = r3.next()
                r0.remove(r1)
                goto L9
            L17:
                return
        }

        @Override // com.google.common.cache.Cache
        public void put(K r2, V r3) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                r0.put(r2, r3)
                return
        }

        @Override // com.google.common.cache.Cache
        public void putAll(java.util.Map<? extends K, ? extends V> r2) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.localCache
                r0.putAll(r2)
                return
        }

        @Override // com.google.common.cache.Cache
        public long size() {
                r2 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r2.localCache
                long r0 = r0.longSize()
                return r0
        }

        @Override // com.google.common.cache.Cache
        public com.google.common.cache.CacheStats stats() {
                r5 = this;
                com.google.common.cache.AbstractCache$SimpleStatsCounter r0 = new com.google.common.cache.AbstractCache$SimpleStatsCounter
                r0.<init>()
                com.google.common.cache.LocalCache<K, V> r1 = r5.localCache
                com.google.common.cache.AbstractCache$StatsCounter r1 = r1.globalStatsCounter
                r0.incrementBy(r1)
                com.google.common.cache.LocalCache<K, V> r1 = r5.localCache
                com.google.common.cache.LocalCache$Segment<K, V>[] r1 = r1.segments
                int r2 = r1.length
                r3 = 0
            L12:
                if (r3 >= r2) goto L1e
                r4 = r1[r3]
                com.google.common.cache.AbstractCache$StatsCounter r4 = r4.statsCounter
                r0.incrementBy(r4)
                int r3 = r3 + 1
                goto L12
            L1e:
                com.google.common.cache.CacheStats r0 = r0.snapshot()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ManualSerializationProxy<K, V> extends com.google.common.cache.ForwardingCache<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        public final int concurrencyLevel;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public transient com.google.common.cache.Cache<K, V> delegate;
        public final long expireAfterAccessNanos;
        public final long expireAfterWriteNanos;
        public final com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;
        public final com.google.common.cache.LocalCache.Strength keyStrength;
        public final com.google.common.cache.CacheLoader<? super K, V> loader;
        public final long maxWeight;
        public final com.google.common.cache.RemovalListener<? super K, ? super V> removalListener;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public final com.google.common.base.Ticker ticker;
        public final com.google.common.base.Equivalence<java.lang.Object> valueEquivalence;
        public final com.google.common.cache.LocalCache.Strength valueStrength;
        public final com.google.common.cache.Weigher<K, V> weigher;

        private ManualSerializationProxy(com.google.common.cache.LocalCache.Strength r1, com.google.common.cache.LocalCache.Strength r2, com.google.common.base.Equivalence<java.lang.Object> r3, com.google.common.base.Equivalence<java.lang.Object> r4, long r5, long r7, long r9, com.google.common.cache.Weigher<K, V> r11, int r12, com.google.common.cache.RemovalListener<? super K, ? super V> r13, com.google.common.base.Ticker r14, com.google.common.cache.CacheLoader<? super K, V> r15) {
                r0 = this;
                r0.<init>()
                r0.keyStrength = r1
                r0.valueStrength = r2
                r0.keyEquivalence = r3
                r0.valueEquivalence = r4
                r0.expireAfterWriteNanos = r5
                r0.expireAfterAccessNanos = r7
                r0.maxWeight = r9
                r0.weigher = r11
                r0.concurrencyLevel = r12
                r0.removalListener = r13
                com.google.common.base.Ticker r1 = com.google.common.base.Ticker.systemTicker()
                if (r14 == r1) goto L21
                com.google.common.base.Ticker r1 = com.google.common.cache.CacheBuilder.NULL_TICKER
                if (r14 != r1) goto L22
            L21:
                r14 = 0
            L22:
                r0.ticker = r14
                r0.loader = r15
                return
        }

        private void readObject(java.io.ObjectInputStream r1) throws java.io.IOException, java.lang.ClassNotFoundException {
                r0 = this;
                r1.defaultReadObject()
                com.google.common.cache.CacheBuilder r1 = r0.recreateCacheBuilder()
                com.google.common.cache.Cache r1 = r1.build()
                r0.delegate = r1
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.cache.Cache<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final com.google.common.cache.Cache<K, V> delegate() {
                r1 = this;
                com.google.common.cache.Cache<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                com.google.common.cache.Cache<K, V> r0 = r1.delegate
                return r0
        }

        public final com.google.common.cache.CacheBuilder<K, V> recreateCacheBuilder() {
                r7 = this;
                com.google.common.cache.CacheBuilder r0 = com.google.common.cache.CacheBuilder.newBuilder()
                com.google.common.cache.LocalCache$Strength r1 = r7.keyStrength
                r0.setKeyStrength(r1)
                com.google.common.cache.LocalCache$Strength r1 = r7.valueStrength
                r0.setValueStrength(r1)
                com.google.common.base.Equivalence<java.lang.Object> r1 = r7.keyEquivalence
                com.google.common.base.Equivalence<java.lang.Object> r2 = r0.keyEquivalence
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L18
                r5 = 1
                goto L19
            L18:
                r5 = 0
            L19:
                java.lang.String r6 = "key equivalence was already set to %s"
                com.google.common.base.Preconditions.checkState(r5, r6, r2)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Equivalence r1 = (com.google.common.base.Equivalence) r1
                r0.keyEquivalence = r1
                com.google.common.base.Equivalence<java.lang.Object> r1 = r7.valueEquivalence
                com.google.common.base.Equivalence<java.lang.Object> r2 = r0.valueEquivalence
                if (r2 != 0) goto L2d
                goto L2e
            L2d:
                r3 = 0
            L2e:
                java.lang.String r5 = "value equivalence was already set to %s"
                com.google.common.base.Preconditions.checkState(r3, r5, r2)
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Equivalence r1 = (com.google.common.base.Equivalence) r1
                r0.valueEquivalence = r1
                int r1 = r7.concurrencyLevel
                com.google.common.cache.CacheBuilder r0 = r0.concurrencyLevel(r1)
                com.google.common.cache.RemovalListener<? super K, ? super V> r1 = r7.removalListener
                com.google.common.cache.CacheBuilder r0 = r0.removalListener(r1)
                r0.strictParsing = r4
                long r1 = r7.expireAfterWriteNanos
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L57
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
                r0.expireAfterWrite(r1, r5)
            L57:
                long r1 = r7.expireAfterAccessNanos
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L62
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
                r0.expireAfterAccess(r1, r3)
            L62:
                com.google.common.cache.Weigher<K, V> r1 = r7.weigher
                com.google.common.cache.CacheBuilder$OneWeigher r2 = com.google.common.cache.CacheBuilder.OneWeigher.INSTANCE
                r3 = -1
                if (r1 == r2) goto L77
                r0.weigher(r1)
                long r1 = r7.maxWeight
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L80
                r0.maximumWeight(r1)
                goto L80
            L77:
                long r1 = r7.maxWeight
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L80
                r0.maximumSize(r1)
            L80:
                com.google.common.base.Ticker r1 = r7.ticker
                if (r1 == 0) goto L87
                r0.ticker(r1)
            L87:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum NullEntry extends java.lang.Enum<com.google.common.cache.LocalCache.NullEntry> implements com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> {
        private static final /* synthetic */ com.google.common.cache.LocalCache.NullEntry[] $VALUES = null;
        public static final com.google.common.cache.LocalCache.NullEntry INSTANCE = null;

        private static /* synthetic */ com.google.common.cache.LocalCache.NullEntry[] $values() {
                r0 = 1
                com.google.common.cache.LocalCache$NullEntry[] r0 = new com.google.common.cache.LocalCache.NullEntry[r0]
                com.google.common.cache.LocalCache$NullEntry r1 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.cache.LocalCache$NullEntry r0 = new com.google.common.cache.LocalCache$NullEntry
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.cache.LocalCache.NullEntry.INSTANCE = r0
                com.google.common.cache.LocalCache$NullEntry[] r0 = $values()
                com.google.common.cache.LocalCache.NullEntry.$VALUES = r0
                return
        }

        private NullEntry(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.cache.LocalCache.NullEntry valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.cache.LocalCache$NullEntry> r0 = com.google.common.cache.LocalCache.NullEntry.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.cache.LocalCache$NullEntry r1 = (com.google.common.cache.LocalCache.NullEntry) r1
                return r1
        }

        public static com.google.common.cache.LocalCache.NullEntry[] values() {
                com.google.common.cache.LocalCache$NullEntry[] r0 = com.google.common.cache.LocalCache.NullEntry.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.cache.LocalCache$NullEntry[] r0 = (com.google.common.cache.LocalCache.NullEntry[]) r0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public java.lang.Object getKey() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getNext() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getNextInAccessQueue() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getNextInWriteQueue() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getPreviousInAccessQueue() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> getPreviousInWriteQueue() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> getValueReference() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<java.lang.Object, java.lang.Object> r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Segment<K, V> extends java.util.concurrent.locks.ReentrantLock {

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> accessQueue;
        public volatile int count;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public final java.lang.ref.ReferenceQueue<K> keyReferenceQueue;

        @com.google.j2objc.annotations.Weak
        public final com.google.common.cache.LocalCache<K, V> map;
        public final long maxSegmentWeight;
        public int modCount;
        public final java.util.concurrent.atomic.AtomicInteger readCount;
        public final java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> recencyQueue;
        public final com.google.common.cache.AbstractCache.StatsCounter statsCounter;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public volatile java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> table;
        public int threshold;

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public long totalWeight;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public final java.lang.ref.ReferenceQueue<V> valueReferenceQueue;

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> writeQueue;


        public Segment(com.google.common.cache.LocalCache<K, V> r5, int r6, long r7, com.google.common.cache.AbstractCache.StatsCounter r9) {
                r4 = this;
                r4.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r4.readCount = r0
                r4.map = r5
                r4.maxSegmentWeight = r7
                java.lang.Object r9 = com.google.common.base.Preconditions.checkNotNull(r9)
                com.google.common.cache.AbstractCache$StatsCounter r9 = (com.google.common.cache.AbstractCache.StatsCounter) r9
                r4.statsCounter = r9
                java.util.concurrent.atomic.AtomicReferenceArray r9 = new java.util.concurrent.atomic.AtomicReferenceArray
                r9.<init>(r6)
                int r6 = r9.length()
                int r6 = r6 * 3
                int r6 = r6 / 4
                r4.threshold = r6
                com.google.common.cache.Weigher<K, V> r0 = r5.weigher
                com.google.common.cache.CacheBuilder$OneWeigher r1 = com.google.common.cache.CacheBuilder.OneWeigher.INSTANCE
                r2 = 1
                if (r0 == r1) goto L2e
                r0 = 1
                goto L2f
            L2e:
                r0 = 0
            L2f:
                if (r0 != 0) goto L39
                long r0 = (long) r6
                int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r3 != 0) goto L39
                int r6 = r6 + r2
                r4.threshold = r6
            L39:
                r4.table = r9
                boolean r6 = r5.usesKeyReferences()
                r7 = 0
                if (r6 == 0) goto L48
                java.lang.ref.ReferenceQueue r6 = new java.lang.ref.ReferenceQueue
                r6.<init>()
                goto L49
            L48:
                r6 = r7
            L49:
                r4.keyReferenceQueue = r6
                boolean r6 = r5.usesValueReferences()
                if (r6 == 0) goto L56
                java.lang.ref.ReferenceQueue r7 = new java.lang.ref.ReferenceQueue
                r7.<init>()
            L56:
                r4.valueReferenceQueue = r7
                boolean r6 = r5.usesAccessQueue()
                if (r6 == 0) goto L64
                java.util.concurrent.ConcurrentLinkedQueue r6 = new java.util.concurrent.ConcurrentLinkedQueue
                r6.<init>()
                goto L66
            L64:
                java.util.Queue<?> r6 = com.google.common.cache.LocalCache.DISCARDING_QUEUE
            L66:
                java.util.AbstractQueue r6 = (java.util.AbstractQueue) r6
                r4.recencyQueue = r6
                boolean r6 = r5.expiresAfterWrite()
                if (r6 == 0) goto L76
                com.google.common.cache.LocalCache$WriteQueue r6 = new com.google.common.cache.LocalCache$WriteQueue
                r6.<init>()
                goto L78
            L76:
                java.util.Queue<?> r6 = com.google.common.cache.LocalCache.DISCARDING_QUEUE
            L78:
                java.util.AbstractQueue r6 = (java.util.AbstractQueue) r6
                r4.writeQueue = r6
                boolean r5 = r5.usesAccessQueue()
                if (r5 == 0) goto L88
                com.google.common.cache.LocalCache$AccessQueue r5 = new com.google.common.cache.LocalCache$AccessQueue
                r5.<init>()
                goto L8a
            L88:
                java.util.Queue<?> r5 = com.google.common.cache.LocalCache.DISCARDING_QUEUE
            L8a:
                java.util.AbstractQueue r5 = (java.util.AbstractQueue) r5
                r4.accessQueue = r5
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final com.google.common.cache.ReferenceEntry<K, V> copyEntry(com.google.common.cache.ReferenceEntry<K, V> r5, com.google.common.cache.ReferenceEntry<K, V> r6) {
                r4 = this;
                java.lang.Object r0 = r5.getKey()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                com.google.common.cache.LocalCache$ValueReference r0 = r5.getValueReference()
                java.lang.Object r2 = r0.get()
                if (r2 != 0) goto L19
                boolean r3 = r0.isActive()
                if (r3 == 0) goto L19
                return r1
            L19:
                com.google.common.cache.LocalCache<K, V> r1 = r4.map
                com.google.common.cache.LocalCache$EntryFactory r1 = r1.entryFactory
                com.google.common.cache.ReferenceEntry r5 = r1.copyEntry(r4, r5, r6)
                java.lang.ref.ReferenceQueue<V> r6 = r4.valueReferenceQueue
                com.google.common.cache.LocalCache$ValueReference r6 = r0.copyFor(r6, r2, r5)
                r5.setValueReference(r6)
                return r5
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final void drainRecencyQueue() {
                r2 = this;
            L0:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r0 = r2.recencyQueue
                java.lang.Object r0 = r0.poll()
                com.google.common.cache.ReferenceEntry r0 = (com.google.common.cache.ReferenceEntry) r0
                if (r0 == 0) goto L18
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r1 = r2.accessQueue
                boolean r1 = r1.contains(r0)
                if (r1 == 0) goto L0
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r1 = r2.accessQueue
                r1.add(r0)
                goto L0
            L18:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final void drainReferenceQueues() {
                r15 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r15.map
                boolean r0 = r0.usesKeyReferences()
                r1 = 16
                r2 = 0
                if (r0 == 0) goto L7b
                r0 = 0
            Lc:
                java.lang.ref.ReferenceQueue<K> r3 = r15.keyReferenceQueue
                java.lang.ref.Reference r3 = r3.poll()
                if (r3 == 0) goto L7b
                com.google.common.cache.ReferenceEntry r3 = (com.google.common.cache.ReferenceEntry) r3
                com.google.common.cache.LocalCache<K, V> r4 = r15.map
                java.util.Objects.requireNonNull(r4)
                int r9 = r3.getHash()
                com.google.common.cache.LocalCache$Segment r4 = r4.segmentFor(r9)
                r4.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r13 = r4.table     // Catch: java.lang.Throwable -> L73
                int r5 = r13.length()     // Catch: java.lang.Throwable -> L73
                int r5 = r5 + (-1)
                r14 = r5 & r9
                java.lang.Object r5 = r13.get(r14)     // Catch: java.lang.Throwable -> L73
                r6 = r5
                com.google.common.cache.ReferenceEntry r6 = (com.google.common.cache.ReferenceEntry) r6     // Catch: java.lang.Throwable -> L73
                r7 = r6
            L38:
                if (r7 == 0) goto L68
                if (r7 != r3) goto L63
                int r3 = r4.modCount     // Catch: java.lang.Throwable -> L73
                int r3 = r3 + 1
                r4.modCount = r3     // Catch: java.lang.Throwable -> L73
                java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L73
                com.google.common.cache.LocalCache$ValueReference r3 = r7.getValueReference()     // Catch: java.lang.Throwable -> L73
                java.lang.Object r10 = r3.get()     // Catch: java.lang.Throwable -> L73
                com.google.common.cache.LocalCache$ValueReference r11 = r7.getValueReference()     // Catch: java.lang.Throwable -> L73
                com.google.common.cache.RemovalCause r12 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L73
                r5 = r4
                com.google.common.cache.ReferenceEntry r3 = r5.removeValueFromChain(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L73
                int r5 = r4.count     // Catch: java.lang.Throwable -> L73
                int r5 = r5 + (-1)
                r13.set(r14, r3)     // Catch: java.lang.Throwable -> L73
                r4.count = r5     // Catch: java.lang.Throwable -> L73
                goto L68
            L63:
                com.google.common.cache.ReferenceEntry r7 = r7.getNext()     // Catch: java.lang.Throwable -> L73
                goto L38
            L68:
                r4.unlock()
                r4.runUnlockedCleanup()
                int r0 = r0 + 1
                if (r0 != r1) goto Lc
                goto L7b
            L73:
                r0 = move-exception
                r4.unlock()
                r4.runUnlockedCleanup()
                throw r0
            L7b:
                com.google.common.cache.LocalCache<K, V> r0 = r15.map
                boolean r0 = r0.usesValueReferences()
                if (r0 == 0) goto L127
            L83:
                java.lang.ref.ReferenceQueue<V> r0 = r15.valueReferenceQueue
                java.lang.ref.Reference r0 = r0.poll()
                if (r0 == 0) goto L127
                r9 = r0
                com.google.common.cache.LocalCache$ValueReference r9 = (com.google.common.cache.LocalCache.ValueReference) r9
                com.google.common.cache.LocalCache<K, V> r0 = r15.map
                java.util.Objects.requireNonNull(r0)
                com.google.common.cache.ReferenceEntry r3 = r9.getEntry()
                int r7 = r3.getHash()
                com.google.common.cache.LocalCache$Segment r0 = r0.segmentFor(r7)
                java.lang.Object r3 = r3.getKey()
                r0.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r11 = r0.table     // Catch: java.lang.Throwable -> L119
                int r4 = r11.length()     // Catch: java.lang.Throwable -> L119
                int r4 = r4 + (-1)
                r12 = r4 & r7
                java.lang.Object r4 = r11.get(r12)     // Catch: java.lang.Throwable -> L119
                com.google.common.cache.ReferenceEntry r4 = (com.google.common.cache.ReferenceEntry) r4     // Catch: java.lang.Throwable -> L119
                r5 = r4
            Lb7:
                if (r5 == 0) goto L108
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L119
                int r8 = r5.getHash()     // Catch: java.lang.Throwable -> L119
                if (r8 != r7) goto L103
                if (r6 == 0) goto L103
                com.google.common.cache.LocalCache<K, V> r8 = r0.map     // Catch: java.lang.Throwable -> L119
                com.google.common.base.Equivalence<java.lang.Object> r8 = r8.keyEquivalence     // Catch: java.lang.Throwable -> L119
                boolean r8 = r8.equivalent(r3, r6)     // Catch: java.lang.Throwable -> L119
                if (r8 == 0) goto L103
                com.google.common.cache.LocalCache$ValueReference r3 = r5.getValueReference()     // Catch: java.lang.Throwable -> L119
                if (r3 != r9) goto Lf9
                int r3 = r0.modCount     // Catch: java.lang.Throwable -> L119
                int r3 = r3 + 1
                r0.modCount = r3     // Catch: java.lang.Throwable -> L119
                java.lang.Object r8 = r9.get()     // Catch: java.lang.Throwable -> L119
                com.google.common.cache.RemovalCause r10 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L119
                r3 = r0
                com.google.common.cache.ReferenceEntry r3 = r3.removeValueFromChain(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L119
                int r4 = r0.count     // Catch: java.lang.Throwable -> L119
                int r4 = r4 + (-1)
                r11.set(r12, r3)     // Catch: java.lang.Throwable -> L119
                r0.count = r4     // Catch: java.lang.Throwable -> L119
                r0.unlock()
                boolean r3 = r0.isHeldByCurrentThread()
                if (r3 != 0) goto L114
                goto L111
            Lf9:
                r0.unlock()
                boolean r3 = r0.isHeldByCurrentThread()
                if (r3 != 0) goto L114
                goto L111
            L103:
                com.google.common.cache.ReferenceEntry r5 = r5.getNext()     // Catch: java.lang.Throwable -> L119
                goto Lb7
            L108:
                r0.unlock()
                boolean r3 = r0.isHeldByCurrentThread()
                if (r3 != 0) goto L114
            L111:
                r0.runUnlockedCleanup()
            L114:
                int r2 = r2 + 1
                if (r2 != r1) goto L83
                goto L127
            L119:
                r1 = move-exception
                r0.unlock()
                boolean r2 = r0.isHeldByCurrentThread()
                if (r2 != 0) goto L126
                r0.runUnlockedCleanup()
            L126:
                throw r1
            L127:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final void enqueueNotification(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r6, int r7, com.google.common.cache.RemovalCause r8) {
                r4 = this;
                long r0 = r4.totalWeight
                long r2 = (long) r7
                long r0 = r0 - r2
                r4.totalWeight = r0
                boolean r7 = r8.wasEvicted()
                if (r7 == 0) goto L11
                com.google.common.cache.AbstractCache$StatsCounter r7 = r4.statsCounter
                r7.recordEviction()
            L11:
                com.google.common.cache.LocalCache<K, V> r7 = r4.map
                java.util.Queue<com.google.common.cache.RemovalNotification<K, V>> r7 = r7.removalNotificationQueue
                java.util.Queue<?> r0 = com.google.common.cache.LocalCache.DISCARDING_QUEUE
                if (r7 == r0) goto L24
                com.google.common.cache.RemovalNotification r5 = com.google.common.cache.RemovalNotification.create(r5, r6, r8)
                com.google.common.cache.LocalCache<K, V> r6 = r4.map
                java.util.Queue<com.google.common.cache.RemovalNotification<K, V>> r6 = r6.removalNotificationQueue
                r6.offer(r5)
            L24:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final void evictEntries(com.google.common.cache.ReferenceEntry<K, V> r6) {
                r5 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r5.map
                boolean r0 = r0.evictsBySize()
                if (r0 != 0) goto L9
                return
            L9:
                r5.drainRecencyQueue()
                com.google.common.cache.LocalCache$ValueReference r0 = r6.getValueReference()
                int r0 = r0.getWeight()
                long r0 = (long) r0
                long r2 = r5.maxSegmentWeight
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L2e
                int r0 = r6.getHash()
                com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.SIZE
                boolean r6 = r5.removeEntry(r6, r0, r1)
                if (r6 == 0) goto L28
                goto L2e
            L28:
                java.lang.AssertionError r6 = new java.lang.AssertionError
                r6.<init>()
                throw r6
            L2e:
                long r0 = r5.totalWeight
                long r2 = r5.maxSegmentWeight
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 <= 0) goto L6b
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r6 = r5.accessQueue
                java.util.Iterator r6 = r6.iterator()
            L3c:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L65
                java.lang.Object r0 = r6.next()
                com.google.common.cache.ReferenceEntry r0 = (com.google.common.cache.ReferenceEntry) r0
                com.google.common.cache.LocalCache$ValueReference r1 = r0.getValueReference()
                int r1 = r1.getWeight()
                if (r1 <= 0) goto L3c
                int r6 = r0.getHash()
                com.google.common.cache.RemovalCause r1 = com.google.common.cache.RemovalCause.SIZE
                boolean r6 = r5.removeEntry(r0, r6, r1)
                if (r6 == 0) goto L5f
                goto L2e
            L5f:
                java.lang.AssertionError r6 = new java.lang.AssertionError
                r6.<init>()
                throw r6
            L65:
                java.lang.AssertionError r6 = new java.lang.AssertionError
                r6.<init>()
                throw r6
            L6b:
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final void expand() {
                r11 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r11.table
                int r1 = r0.length()
                r2 = 1073741824(0x40000000, float:2.0)
                if (r1 < r2) goto Lb
                return
            Lb:
                int r2 = r11.count
                int r3 = r1 << 1
                java.util.concurrent.atomic.AtomicReferenceArray r4 = new java.util.concurrent.atomic.AtomicReferenceArray
                r4.<init>(r3)
                int r3 = r4.length()
                int r3 = r3 * 3
                int r3 = r3 / 4
                r11.threshold = r3
                int r3 = r4.length()
                int r3 = r3 + (-1)
                r5 = 0
            L25:
                if (r5 >= r1) goto L76
                java.lang.Object r6 = r0.get(r5)
                com.google.common.cache.ReferenceEntry r6 = (com.google.common.cache.ReferenceEntry) r6
                if (r6 == 0) goto L73
                com.google.common.cache.ReferenceEntry r7 = r6.getNext()
                int r8 = r6.getHash()
                r8 = r8 & r3
                if (r7 != 0) goto L3e
                r4.set(r8, r6)
                goto L73
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
                com.google.common.cache.ReferenceEntry r7 = r7.getNext()
                goto L3f
            L4f:
                r4.set(r8, r9)
            L52:
                if (r6 == r9) goto L73
                int r7 = r6.getHash()
                r7 = r7 & r3
                java.lang.Object r8 = r4.get(r7)
                com.google.common.cache.ReferenceEntry r8 = (com.google.common.cache.ReferenceEntry) r8
                com.google.common.cache.ReferenceEntry r8 = r11.copyEntry(r6, r8)
                if (r8 == 0) goto L69
                r4.set(r7, r8)
                goto L6e
            L69:
                r11.removeCollectedEntry(r6)
                int r2 = r2 + (-1)
            L6e:
                com.google.common.cache.ReferenceEntry r6 = r6.getNext()
                goto L52
            L73:
                int r5 = r5 + 1
                goto L25
            L76:
                r11.table = r4
                r11.count = r2
                return
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final void expireEntries(long r4) {
                r3 = this;
                r3.drainRecencyQueue()
            L3:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r0 = r3.writeQueue
                java.lang.Object r0 = r0.peek()
                com.google.common.cache.ReferenceEntry r0 = (com.google.common.cache.ReferenceEntry) r0
                if (r0 == 0) goto L28
                com.google.common.cache.LocalCache<K, V> r1 = r3.map
                boolean r1 = r1.isExpired(r0, r4)
                if (r1 == 0) goto L28
                int r1 = r0.getHash()
                com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.EXPIRED
                boolean r0 = r3.removeEntry(r0, r1, r2)
                if (r0 == 0) goto L22
                goto L3
            L22:
                java.lang.AssertionError r4 = new java.lang.AssertionError
                r4.<init>()
                throw r4
            L28:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r0 = r3.accessQueue
                java.lang.Object r0 = r0.peek()
                com.google.common.cache.ReferenceEntry r0 = (com.google.common.cache.ReferenceEntry) r0
                if (r0 == 0) goto L4d
                com.google.common.cache.LocalCache<K, V> r1 = r3.map
                boolean r1 = r1.isExpired(r0, r4)
                if (r1 == 0) goto L4d
                int r1 = r0.getHash()
                com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.EXPIRED
                boolean r0 = r3.removeEntry(r0, r1, r2)
                if (r0 == 0) goto L47
                goto L28
            L47:
                java.lang.AssertionError r4 = new java.lang.AssertionError
                r4.<init>()
                throw r4
            L4d:
                return
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public final V get(java.lang.Object r11, int r12) {
                r10 = this;
                int r0 = r10.count     // Catch: java.lang.Throwable -> L3d
                r1 = 0
                if (r0 == 0) goto L39
                com.google.common.cache.LocalCache<K, V> r0 = r10.map     // Catch: java.lang.Throwable -> L3d
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> L3d
                long r7 = r0.read()     // Catch: java.lang.Throwable -> L3d
                com.google.common.cache.ReferenceEntry r3 = r10.getLiveEntry(r11, r12, r7)     // Catch: java.lang.Throwable -> L3d
                if (r3 != 0) goto L17
                r10.postReadCleanup()
                return r1
            L17:
                com.google.common.cache.LocalCache$ValueReference r11 = r3.getValueReference()     // Catch: java.lang.Throwable -> L3d
                java.lang.Object r6 = r11.get()     // Catch: java.lang.Throwable -> L3d
                if (r6 == 0) goto L36
                r10.recordRead(r3, r7)     // Catch: java.lang.Throwable -> L3d
                java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L3d
                com.google.common.cache.LocalCache<K, V> r11 = r10.map     // Catch: java.lang.Throwable -> L3d
                com.google.common.cache.CacheLoader<? super K, V> r9 = r11.defaultLoader     // Catch: java.lang.Throwable -> L3d
                r2 = r10
                r5 = r12
                java.lang.Object r11 = r2.scheduleRefresh(r3, r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L3d
                r10.postReadCleanup()
                return r11
            L36:
                r10.tryDrainReferenceQueues()     // Catch: java.lang.Throwable -> L3d
            L39:
                r10.postReadCleanup()
                return r1
            L3d:
                r11 = move-exception
                r10.postReadCleanup()
                throw r11
        }

        public final V getAndRecordStats(K r5, int r6, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r7, com.google.common.util.concurrent.ListenableFuture<V> r8) throws java.util.concurrent.ExecutionException {
                r4 = this;
                java.lang.Object r8 = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r8)     // Catch: java.lang.Throwable -> L3b
                if (r8 == 0) goto L15
                com.google.common.cache.AbstractCache$StatsCounter r0 = r4.statsCounter     // Catch: java.lang.Throwable -> L13
                long r1 = r7.elapsedNanos()     // Catch: java.lang.Throwable -> L13
                r0.recordLoadSuccess(r1)     // Catch: java.lang.Throwable -> L13
                r4.storeLoadedValue(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L13
                return r8
            L13:
                r0 = move-exception
                goto L3d
            L15:
                com.google.common.cache.CacheLoader$InvalidCacheLoadException r0 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch: java.lang.Throwable -> L13
                java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L13
                int r2 = r1.length()     // Catch: java.lang.Throwable -> L13
                int r2 = r2 + 35
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
                r3.<init>(r2)     // Catch: java.lang.Throwable -> L13
                java.lang.String r2 = "CacheLoader returned null for key "
                r3.append(r2)     // Catch: java.lang.Throwable -> L13
                r3.append(r1)     // Catch: java.lang.Throwable -> L13
                java.lang.String r1 = "."
                r3.append(r1)     // Catch: java.lang.Throwable -> L13
                java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L13
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
                throw r0     // Catch: java.lang.Throwable -> L13
            L3b:
                r0 = move-exception
                r8 = 0
            L3d:
                if (r8 != 0) goto L4b
                com.google.common.cache.AbstractCache$StatsCounter r8 = r4.statsCounter
                long r1 = r7.elapsedNanos()
                r8.recordLoadException(r1)
                r4.removeLoadingValue(r5, r6, r7)
            L4b:
                throw r0
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public final com.google.common.cache.ReferenceEntry<K, V> getEntry(java.lang.Object r4, int r5) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r3.table
                int r1 = r0.length()
                int r1 = r1 + (-1)
                r1 = r1 & r5
                java.lang.Object r0 = r0.get(r1)
                com.google.common.cache.ReferenceEntry r0 = (com.google.common.cache.ReferenceEntry) r0
            Lf:
                if (r0 == 0) goto L32
                int r1 = r0.getHash()
                if (r1 == r5) goto L18
                goto L2d
            L18:
                java.lang.Object r1 = r0.getKey()
                if (r1 != 0) goto L22
                r3.tryDrainReferenceQueues()
                goto L2d
            L22:
                com.google.common.cache.LocalCache<K, V> r2 = r3.map
                com.google.common.base.Equivalence<java.lang.Object> r2 = r2.keyEquivalence
                boolean r1 = r2.equivalent(r4, r1)
                if (r1 == 0) goto L2d
                return r0
            L2d:
                com.google.common.cache.ReferenceEntry r0 = r0.getNext()
                goto Lf
            L32:
                r4 = 0
                return r4
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public final com.google.common.cache.ReferenceEntry<K, V> getLiveEntry(java.lang.Object r2, int r3, long r4) {
                r1 = this;
                com.google.common.cache.ReferenceEntry r2 = r1.getEntry(r2, r3)
                r3 = 0
                if (r2 != 0) goto L8
                return r3
            L8:
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                boolean r0 = r0.isExpired(r2, r4)
                if (r0 == 0) goto L23
                boolean r2 = r1.tryLock()
                if (r2 == 0) goto L22
                r1.expireEntries(r4)     // Catch: java.lang.Throwable -> L1d
                r1.unlock()
                goto L22
            L1d:
                r2 = move-exception
                r1.unlock()
                throw r2
            L22:
                return r3
            L23:
                return r2
        }

        public final V getLiveValue(com.google.common.cache.ReferenceEntry<K, V> r4, long r5) {
                r3 = this;
                java.lang.Object r0 = r4.getKey()
                r1 = 0
                if (r0 != 0) goto Lb
                r3.tryDrainReferenceQueues()
                return r1
            Lb:
                com.google.common.cache.LocalCache$ValueReference r0 = r4.getValueReference()
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L19
                r3.tryDrainReferenceQueues()
                return r1
            L19:
                com.google.common.cache.LocalCache<K, V> r2 = r3.map
                boolean r4 = r2.isExpired(r4, r5)
                if (r4 == 0) goto L34
                boolean r4 = r3.tryLock()
                if (r4 == 0) goto L33
                r3.expireEntries(r5)     // Catch: java.lang.Throwable -> L2e
                r3.unlock()
                goto L33
            L2e:
                r4 = move-exception
                r3.unlock()
                throw r4
            L33:
                return r1
            L34:
                return r0
        }

        public final V lockedGetOrLoad(K r17, int r18, com.google.common.cache.CacheLoader<? super K, V> r19) throws java.util.concurrent.ExecutionException {
                r16 = this;
                r1 = r16
                r0 = r17
                r2 = r18
                r16.lock()
                com.google.common.cache.LocalCache<K, V> r3 = r1.map     // Catch: java.lang.Throwable -> Ld1
                com.google.common.base.Ticker r3 = r3.ticker     // Catch: java.lang.Throwable -> Ld1
                long r3 = r3.read()     // Catch: java.lang.Throwable -> Ld1
                r1.runLockedCleanup(r3)     // Catch: java.lang.Throwable -> Ld1
                int r5 = r1.count     // Catch: java.lang.Throwable -> Ld1
                int r5 = r5 + (-1)
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r6 = r1.table     // Catch: java.lang.Throwable -> Ld1
                int r7 = r6.length()     // Catch: java.lang.Throwable -> Ld1
                r8 = 1
                int r7 = r7 - r8
                r7 = r7 & r2
                java.lang.Object r9 = r6.get(r7)     // Catch: java.lang.Throwable -> Ld1
                com.google.common.cache.ReferenceEntry r9 = (com.google.common.cache.ReferenceEntry) r9     // Catch: java.lang.Throwable -> Ld1
                r10 = r9
            L28:
                r11 = 0
                if (r10 == 0) goto L8f
                java.lang.Object r12 = r10.getKey()     // Catch: java.lang.Throwable -> Ld1
                int r13 = r10.getHash()     // Catch: java.lang.Throwable -> Ld1
                if (r13 != r2) goto L8a
                if (r12 == 0) goto L8a
                com.google.common.cache.LocalCache<K, V> r13 = r1.map     // Catch: java.lang.Throwable -> Ld1
                com.google.common.base.Equivalence<java.lang.Object> r13 = r13.keyEquivalence     // Catch: java.lang.Throwable -> Ld1
                boolean r13 = r13.equivalent(r0, r12)     // Catch: java.lang.Throwable -> Ld1
                if (r13 == 0) goto L8a
                com.google.common.cache.LocalCache$ValueReference r13 = r10.getValueReference()     // Catch: java.lang.Throwable -> Ld1
                boolean r14 = r13.isLoading()     // Catch: java.lang.Throwable -> Ld1
                if (r14 == 0) goto L4d
                r3 = 0
                goto L91
            L4d:
                java.lang.Object r14 = r13.get()     // Catch: java.lang.Throwable -> Ld1
                if (r14 != 0) goto L5d
                int r3 = r13.getWeight()     // Catch: java.lang.Throwable -> Ld1
                com.google.common.cache.RemovalCause r4 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> Ld1
                r1.enqueueNotification(r12, r14, r3, r4)     // Catch: java.lang.Throwable -> Ld1
                goto L6e
            L5d:
                com.google.common.cache.LocalCache<K, V> r15 = r1.map     // Catch: java.lang.Throwable -> Ld1
                boolean r15 = r15.isExpired(r10, r3)     // Catch: java.lang.Throwable -> Ld1
                if (r15 == 0) goto L7b
                int r3 = r13.getWeight()     // Catch: java.lang.Throwable -> Ld1
                com.google.common.cache.RemovalCause r4 = com.google.common.cache.RemovalCause.EXPIRED     // Catch: java.lang.Throwable -> Ld1
                r1.enqueueNotification(r12, r14, r3, r4)     // Catch: java.lang.Throwable -> Ld1
            L6e:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r3 = r1.writeQueue     // Catch: java.lang.Throwable -> Ld1
                r3.remove(r10)     // Catch: java.lang.Throwable -> Ld1
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r3 = r1.accessQueue     // Catch: java.lang.Throwable -> Ld1
                r3.remove(r10)     // Catch: java.lang.Throwable -> Ld1
                r1.count = r5     // Catch: java.lang.Throwable -> Ld1
                goto L90
            L7b:
                r1.recordLockedRead(r10, r3)     // Catch: java.lang.Throwable -> Ld1
                com.google.common.cache.AbstractCache$StatsCounter r0 = r1.statsCounter     // Catch: java.lang.Throwable -> Ld1
                r0.recordHits(r8)     // Catch: java.lang.Throwable -> Ld1
                r16.unlock()
                r16.runUnlockedCleanup()
                return r14
            L8a:
                com.google.common.cache.ReferenceEntry r10 = r10.getNext()     // Catch: java.lang.Throwable -> Ld1
                goto L28
            L8f:
                r13 = r11
            L90:
                r3 = 1
            L91:
                if (r3 == 0) goto La8
                com.google.common.cache.LocalCache$LoadingValueReference r11 = new com.google.common.cache.LocalCache$LoadingValueReference     // Catch: java.lang.Throwable -> Ld1
                r11.<init>()     // Catch: java.lang.Throwable -> Ld1
                if (r10 != 0) goto La5
                com.google.common.cache.ReferenceEntry r10 = r1.newEntry(r0, r2, r9)     // Catch: java.lang.Throwable -> Ld1
                r10.setValueReference(r11)     // Catch: java.lang.Throwable -> Ld1
                r6.set(r7, r10)     // Catch: java.lang.Throwable -> Ld1
                goto La8
            La5:
                r10.setValueReference(r11)     // Catch: java.lang.Throwable -> Ld1
            La8:
                r16.unlock()
                r16.runUnlockedCleanup()
                if (r3 == 0) goto Lcc
                monitor-enter(r10)     // Catch: java.lang.Throwable -> Lc5
                r3 = r19
                com.google.common.util.concurrent.ListenableFuture r3 = r11.loadFuture(r0, r3)     // Catch: java.lang.Throwable -> Lc2
                java.lang.Object r0 = r1.getAndRecordStats(r0, r2, r11, r3)     // Catch: java.lang.Throwable -> Lc2
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lc2
                com.google.common.cache.AbstractCache$StatsCounter r2 = r1.statsCounter
                r2.recordMisses(r8)
                return r0
            Lc2:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lc2
                throw r0     // Catch: java.lang.Throwable -> Lc5
            Lc5:
                r0 = move-exception
                com.google.common.cache.AbstractCache$StatsCounter r2 = r1.statsCounter
                r2.recordMisses(r8)
                throw r0
            Lcc:
                java.lang.Object r0 = r1.waitForLoadingValue(r10, r0, r13)
                return r0
            Ld1:
                r0 = move-exception
                r16.unlock()
                r16.runUnlockedCleanup()
                throw r0
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final com.google.common.cache.ReferenceEntry<K, V> newEntry(K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                com.google.common.cache.LocalCache$EntryFactory r0 = r0.entryFactory
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.cache.ReferenceEntry r2 = r0.newEntry(r1, r2, r3, r4)
                return r2
        }

        public final void postReadCleanup() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.readCount
                int r0 = r0.incrementAndGet()
                r0 = r0 & 63
                if (r0 != 0) goto L18
                com.google.common.cache.LocalCache<K, V> r0 = r2.map
                com.google.common.base.Ticker r0 = r0.ticker
                long r0 = r0.read()
                r2.runLockedCleanup(r0)
                r2.runUnlockedCleanup()
            L18:
                return
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public final V put(K r11, int r12, V r13, boolean r14) {
                r10 = this;
                r10.lock()
                com.google.common.cache.LocalCache<K, V> r0 = r10.map     // Catch: java.lang.Throwable -> Lcd
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> Lcd
                long r5 = r0.read()     // Catch: java.lang.Throwable -> Lcd
                r10.runLockedCleanup(r5)     // Catch: java.lang.Throwable -> Lcd
                int r0 = r10.count     // Catch: java.lang.Throwable -> Lcd
                int r0 = r0 + 1
                int r1 = r10.threshold     // Catch: java.lang.Throwable -> Lcd
                if (r0 <= r1) goto L19
                r10.expand()     // Catch: java.lang.Throwable -> Lcd
            L19:
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r10.table     // Catch: java.lang.Throwable -> Lcd
                int r1 = r0.length()     // Catch: java.lang.Throwable -> Lcd
                int r1 = r1 + (-1)
                r7 = r12 & r1
                java.lang.Object r1 = r0.get(r7)     // Catch: java.lang.Throwable -> Lcd
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1     // Catch: java.lang.Throwable -> Lcd
                r8 = r1
            L2a:
                r9 = 0
                if (r8 == 0) goto Laf
                java.lang.Object r2 = r8.getKey()     // Catch: java.lang.Throwable -> Lcd
                int r3 = r8.getHash()     // Catch: java.lang.Throwable -> Lcd
                if (r3 != r12) goto La9
                if (r2 == 0) goto La9
                com.google.common.cache.LocalCache<K, V> r3 = r10.map     // Catch: java.lang.Throwable -> Lcd
                com.google.common.base.Equivalence<java.lang.Object> r3 = r3.keyEquivalence     // Catch: java.lang.Throwable -> Lcd
                boolean r2 = r3.equivalent(r11, r2)     // Catch: java.lang.Throwable -> Lcd
                if (r2 == 0) goto La9
                com.google.common.cache.LocalCache$ValueReference r12 = r8.getValueReference()     // Catch: java.lang.Throwable -> Lcd
                java.lang.Object r0 = r12.get()     // Catch: java.lang.Throwable -> Lcd
                if (r0 != 0) goto L83
                int r14 = r10.modCount     // Catch: java.lang.Throwable -> Lcd
                int r14 = r14 + 1
                r10.modCount = r14     // Catch: java.lang.Throwable -> Lcd
                boolean r14 = r12.isActive()     // Catch: java.lang.Throwable -> Lcd
                if (r14 == 0) goto L6c
                int r12 = r12.getWeight()     // Catch: java.lang.Throwable -> Lcd
                com.google.common.cache.RemovalCause r14 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> Lcd
                r10.enqueueNotification(r11, r0, r12, r14)     // Catch: java.lang.Throwable -> Lcd
                r1 = r10
                r2 = r8
                r3 = r11
                r4 = r13
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lcd
                int r11 = r10.count     // Catch: java.lang.Throwable -> Lcd
                goto L77
            L6c:
                r1 = r10
                r2 = r8
                r3 = r11
                r4 = r13
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lcd
                int r11 = r10.count     // Catch: java.lang.Throwable -> Lcd
                int r11 = r11 + 1
            L77:
                r10.count = r11     // Catch: java.lang.Throwable -> Lcd
                r10.evictEntries(r8)     // Catch: java.lang.Throwable -> Lcd
            L7c:
                r10.unlock()
                r10.runUnlockedCleanup()
                return r9
            L83:
                if (r14 == 0) goto L8f
                r10.recordLockedRead(r8, r5)     // Catch: java.lang.Throwable -> Lcd
            L88:
                r10.unlock()
                r10.runUnlockedCleanup()
                return r0
            L8f:
                int r14 = r10.modCount     // Catch: java.lang.Throwable -> Lcd
                int r14 = r14 + 1
                r10.modCount = r14     // Catch: java.lang.Throwable -> Lcd
                int r12 = r12.getWeight()     // Catch: java.lang.Throwable -> Lcd
                com.google.common.cache.RemovalCause r14 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> Lcd
                r10.enqueueNotification(r11, r0, r12, r14)     // Catch: java.lang.Throwable -> Lcd
                r1 = r10
                r2 = r8
                r3 = r11
                r4 = r13
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lcd
                r10.evictEntries(r8)     // Catch: java.lang.Throwable -> Lcd
                goto L88
            La9:
                com.google.common.cache.ReferenceEntry r8 = r8.getNext()     // Catch: java.lang.Throwable -> Lcd
                goto L2a
            Laf:
                int r14 = r10.modCount     // Catch: java.lang.Throwable -> Lcd
                int r14 = r14 + 1
                r10.modCount = r14     // Catch: java.lang.Throwable -> Lcd
                com.google.common.cache.ReferenceEntry r12 = r10.newEntry(r11, r12, r1)     // Catch: java.lang.Throwable -> Lcd
                r1 = r10
                r2 = r12
                r3 = r11
                r4 = r13
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lcd
                r0.set(r7, r12)     // Catch: java.lang.Throwable -> Lcd
                int r11 = r10.count     // Catch: java.lang.Throwable -> Lcd
                int r11 = r11 + 1
                r10.count = r11     // Catch: java.lang.Throwable -> Lcd
                r10.evictEntries(r12)     // Catch: java.lang.Throwable -> Lcd
                goto L7c
            Lcd:
                r11 = move-exception
                r10.unlock()
                r10.runUnlockedCleanup()
                throw r11
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final void recordLockedRead(com.google.common.cache.ReferenceEntry<K, V> r2, long r3) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                boolean r0 = r0.expiresAfterAccess()
                if (r0 == 0) goto Lb
                r2.setAccessTime(r3)
            Lb:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r3 = r1.accessQueue
                r3.add(r2)
                return
        }

        public final void recordRead(com.google.common.cache.ReferenceEntry<K, V> r2, long r3) {
                r1 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r1.map
                boolean r0 = r0.expiresAfterAccess()
                if (r0 == 0) goto Lb
                r2.setAccessTime(r3)
            Lb:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r3 = r1.recencyQueue
                r3.add(r2)
                return
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public final V refresh(K r13, int r14, com.google.common.cache.CacheLoader<? super K, V> r15, boolean r16) {
                r12 = this;
                r7 = r12
                r0 = r13
                r4 = r14
                r12.lock()
                com.google.common.cache.LocalCache<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> Lb1
                com.google.common.base.Ticker r1 = r1.ticker     // Catch: java.lang.Throwable -> Lb1
                long r1 = r1.read()     // Catch: java.lang.Throwable -> Lb1
                r12.runLockedCleanup(r1)     // Catch: java.lang.Throwable -> Lb1
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r3 = r7.table     // Catch: java.lang.Throwable -> Lb1
                int r5 = r3.length()     // Catch: java.lang.Throwable -> Lb1
                int r5 = r5 + (-1)
                r5 = r5 & r4
                java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Throwable -> Lb1
                com.google.common.cache.ReferenceEntry r6 = (com.google.common.cache.ReferenceEntry) r6     // Catch: java.lang.Throwable -> Lb1
                r8 = r6
            L21:
                r9 = 0
                if (r8 == 0) goto L70
                java.lang.Object r10 = r8.getKey()     // Catch: java.lang.Throwable -> Lb1
                int r11 = r8.getHash()     // Catch: java.lang.Throwable -> Lb1
                if (r11 != r4) goto L6b
                if (r10 == 0) goto L6b
                com.google.common.cache.LocalCache<K, V> r11 = r7.map     // Catch: java.lang.Throwable -> Lb1
                com.google.common.base.Equivalence<java.lang.Object> r11 = r11.keyEquivalence     // Catch: java.lang.Throwable -> Lb1
                boolean r10 = r11.equivalent(r13, r10)     // Catch: java.lang.Throwable -> Lb1
                if (r10 == 0) goto L6b
                com.google.common.cache.LocalCache$ValueReference r3 = r8.getValueReference()     // Catch: java.lang.Throwable -> Lb1
                boolean r5 = r3.isLoading()     // Catch: java.lang.Throwable -> Lb1
                if (r5 != 0) goto L63
                if (r16 == 0) goto L54
                long r5 = r8.getWriteTime()     // Catch: java.lang.Throwable -> Lb1
                long r1 = r1 - r5
                com.google.common.cache.LocalCache<K, V> r5 = r7.map     // Catch: java.lang.Throwable -> Lb1
                long r5 = r5.refreshNanos     // Catch: java.lang.Throwable -> Lb1
                int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r10 >= 0) goto L54
                goto L63
            L54:
                int r1 = r7.modCount     // Catch: java.lang.Throwable -> Lb1
                int r1 = r1 + 1
                r7.modCount = r1     // Catch: java.lang.Throwable -> Lb1
                com.google.common.cache.LocalCache$LoadingValueReference r1 = new com.google.common.cache.LocalCache$LoadingValueReference     // Catch: java.lang.Throwable -> Lb1
                r1.<init>(r3)     // Catch: java.lang.Throwable -> Lb1
                r8.setValueReference(r1)     // Catch: java.lang.Throwable -> Lb1
                goto L85
            L63:
                r12.unlock()
                r12.runUnlockedCleanup()
                r5 = r9
                goto L8c
            L6b:
                com.google.common.cache.ReferenceEntry r8 = r8.getNext()     // Catch: java.lang.Throwable -> Lb1
                goto L21
            L70:
                int r1 = r7.modCount     // Catch: java.lang.Throwable -> Lb1
                int r1 = r1 + 1
                r7.modCount = r1     // Catch: java.lang.Throwable -> Lb1
                com.google.common.cache.LocalCache$LoadingValueReference r1 = new com.google.common.cache.LocalCache$LoadingValueReference     // Catch: java.lang.Throwable -> Lb1
                r1.<init>()     // Catch: java.lang.Throwable -> Lb1
                com.google.common.cache.ReferenceEntry r2 = r12.newEntry(r13, r14, r6)     // Catch: java.lang.Throwable -> Lb1
                r2.setValueReference(r1)     // Catch: java.lang.Throwable -> Lb1
                r3.set(r5, r2)     // Catch: java.lang.Throwable -> Lb1
            L85:
                r12.unlock()
                r12.runUnlockedCleanup()
                r5 = r1
            L8c:
                if (r5 != 0) goto L8f
                return r9
            L8f:
                r1 = r15
                com.google.common.util.concurrent.ListenableFuture r8 = r5.loadFuture(r13, r15)
                com.google.common.cache.LocalCache$Segment$1 r10 = new com.google.common.cache.LocalCache$Segment$1
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r6 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                java.util.concurrent.Executor r0 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
                r8.addListener(r10, r0)
                boolean r0 = r8.isDone()
                if (r0 == 0) goto Lb0
                java.lang.Object r0 = com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r8)     // Catch: java.lang.Throwable -> Lb0
                return r0
            Lb0:
                return r9
            Lb1:
                r0 = move-exception
                r12.unlock()
                r12.runUnlockedCleanup()
                throw r0
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final void removeCollectedEntry(com.google.common.cache.ReferenceEntry<K, V> r5) {
                r4 = this;
                java.lang.Object r0 = r5.getKey()
                r5.getHash()
                com.google.common.cache.LocalCache$ValueReference r1 = r5.getValueReference()
                java.lang.Object r1 = r1.get()
                com.google.common.cache.LocalCache$ValueReference r2 = r5.getValueReference()
                int r2 = r2.getWeight()
                com.google.common.cache.RemovalCause r3 = com.google.common.cache.RemovalCause.COLLECTED
                r4.enqueueNotification(r0, r1, r2, r3)
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r0 = r4.writeQueue
                r0.remove(r5)
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r0 = r4.accessQueue
                r0.remove(r5)
                return
        }

        @com.google.common.annotations.VisibleForTesting
        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final boolean removeEntry(com.google.common.cache.ReferenceEntry<K, V> r13, int r14, com.google.common.cache.RemovalCause r15) {
                r12 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r12.table
                int r1 = r0.length()
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)
                r5 = r3
                com.google.common.cache.ReferenceEntry r5 = (com.google.common.cache.ReferenceEntry) r5
                r6 = r5
            L11:
                if (r6 == 0) goto L3f
                if (r6 != r13) goto L3a
                int r13 = r12.modCount
                int r13 = r13 + r2
                r12.modCount = r13
                java.lang.Object r7 = r6.getKey()
                com.google.common.cache.LocalCache$ValueReference r13 = r6.getValueReference()
                java.lang.Object r9 = r13.get()
                com.google.common.cache.LocalCache$ValueReference r10 = r6.getValueReference()
                r4 = r12
                r8 = r14
                r11 = r15
                com.google.common.cache.ReferenceEntry r13 = r4.removeValueFromChain(r5, r6, r7, r8, r9, r10, r11)
                int r14 = r12.count
                int r14 = r14 - r2
                r0.set(r1, r13)
                r12.count = r14
                return r2
            L3a:
                com.google.common.cache.ReferenceEntry r6 = r6.getNext()
                goto L11
            L3f:
                r13 = 0
                return r13
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final com.google.common.cache.ReferenceEntry<K, V> removeEntryFromChain(com.google.common.cache.ReferenceEntry<K, V> r4, com.google.common.cache.ReferenceEntry<K, V> r5) {
                r3 = this;
                int r0 = r3.count
                com.google.common.cache.ReferenceEntry r1 = r5.getNext()
            L6:
                if (r4 == r5) goto L1a
                com.google.common.cache.ReferenceEntry r2 = r3.copyEntry(r4, r1)
                if (r2 == 0) goto L10
                r1 = r2
                goto L15
            L10:
                r3.removeCollectedEntry(r4)
                int r0 = r0 + (-1)
            L15:
                com.google.common.cache.ReferenceEntry r4 = r4.getNext()
                goto L6
            L1a:
                r3.count = r0
                return r1
        }

        public final boolean removeLoadingValue(K r9, int r10, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r11) {
                r8 = this;
                r8.lock()
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r8.table     // Catch: java.lang.Throwable -> L61
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L61
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L61
                com.google.common.cache.ReferenceEntry r3 = (com.google.common.cache.ReferenceEntry) r3     // Catch: java.lang.Throwable -> L61
                r4 = r3
            L13:
                r5 = 0
                if (r4 == 0) goto L5a
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L61
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L61
                if (r7 != r10) goto L55
                if (r6 == 0) goto L55
                com.google.common.cache.LocalCache<K, V> r7 = r8.map     // Catch: java.lang.Throwable -> L61
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.keyEquivalence     // Catch: java.lang.Throwable -> L61
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L61
                if (r6 == 0) goto L55
                com.google.common.cache.LocalCache$ValueReference r9 = r4.getValueReference()     // Catch: java.lang.Throwable -> L61
                if (r9 != r11) goto L4e
                boolean r9 = r11.isActive()     // Catch: java.lang.Throwable -> L61
                if (r9 == 0) goto L40
                com.google.common.cache.LocalCache$ValueReference r9 = r11.getOldValue()     // Catch: java.lang.Throwable -> L61
                r4.setValueReference(r9)     // Catch: java.lang.Throwable -> L61
                goto L47
            L40:
                com.google.common.cache.ReferenceEntry r9 = r8.removeEntryFromChain(r3, r4)     // Catch: java.lang.Throwable -> L61
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L61
            L47:
                r8.unlock()
                r8.runUnlockedCleanup()
                return r2
            L4e:
                r8.unlock()
                r8.runUnlockedCleanup()
                return r5
            L55:
                com.google.common.cache.ReferenceEntry r4 = r4.getNext()     // Catch: java.lang.Throwable -> L61
                goto L13
            L5a:
                r8.unlock()
                r8.runUnlockedCleanup()
                return r5
            L61:
                r9 = move-exception
                r8.unlock()
                r8.runUnlockedCleanup()
                throw r9
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final com.google.common.cache.ReferenceEntry<K, V> removeValueFromChain(com.google.common.cache.ReferenceEntry<K, V> r1, com.google.common.cache.ReferenceEntry<K, V> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl K r3, int r4, V r5, com.google.common.cache.LocalCache.ValueReference<K, V> r6, com.google.common.cache.RemovalCause r7) {
                r0 = this;
                int r4 = r6.getWeight()
                r0.enqueueNotification(r3, r5, r4, r7)
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r3 = r0.writeQueue
                r3.remove(r2)
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r3 = r0.accessQueue
                r3.remove(r2)
                boolean r3 = r6.isLoading()
                if (r3 == 0) goto L1c
                r2 = 0
                r6.notifyNewValue(r2)
                return r1
            L1c:
                com.google.common.cache.ReferenceEntry r1 = r0.removeEntryFromChain(r1, r2)
                return r1
        }

        public final void runLockedCleanup(long r2) {
                r1 = this;
                boolean r0 = r1.tryLock()
                if (r0 == 0) goto L1b
                r1.drainReferenceQueues()     // Catch: java.lang.Throwable -> L16
                r1.expireEntries(r2)     // Catch: java.lang.Throwable -> L16
                java.util.concurrent.atomic.AtomicInteger r2 = r1.readCount     // Catch: java.lang.Throwable -> L16
                r3 = 0
                r2.set(r3)     // Catch: java.lang.Throwable -> L16
                r1.unlock()
                goto L1b
            L16:
                r2 = move-exception
                r1.unlock()
                throw r2
            L1b:
                return
        }

        public final void runUnlockedCleanup() {
                r5 = this;
                boolean r0 = r5.isHeldByCurrentThread()
                if (r0 != 0) goto L23
                com.google.common.cache.LocalCache<K, V> r0 = r5.map
            L8:
                java.util.Queue<com.google.common.cache.RemovalNotification<K, V>> r1 = r0.removalNotificationQueue
                java.lang.Object r1 = r1.poll()
                com.google.common.cache.RemovalNotification r1 = (com.google.common.cache.RemovalNotification) r1
                if (r1 == 0) goto L23
                com.google.common.cache.RemovalListener<K, V> r2 = r0.removalListener     // Catch: java.lang.Throwable -> L18
                r2.onRemoval(r1)     // Catch: java.lang.Throwable -> L18
                goto L8
            L18:
                r1 = move-exception
                java.util.logging.Logger r2 = com.google.common.cache.LocalCache.logger
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.String r4 = "Exception thrown by removal listener"
                r2.log(r3, r4, r1)
                goto L8
            L23:
                return
        }

        public final V scheduleRefresh(com.google.common.cache.ReferenceEntry<K, V> r7, K r8, int r9, V r10, long r11, com.google.common.cache.CacheLoader<? super K, V> r13) {
                r6 = this;
                com.google.common.cache.LocalCache<K, V> r0 = r6.map
                long r0 = r0.refreshNanos
                r2 = 1
                r3 = 0
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 <= 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 == 0) goto L2e
                long r0 = r7.getWriteTime()
                long r11 = r11 - r0
                com.google.common.cache.LocalCache<K, V> r0 = r6.map
                long r0 = r0.refreshNanos
                int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r3 <= 0) goto L2e
                com.google.common.cache.LocalCache$ValueReference r7 = r7.getValueReference()
                boolean r7 = r7.isLoading()
                if (r7 != 0) goto L2e
                java.lang.Object r7 = r6.refresh(r8, r9, r13, r2)
                if (r7 == 0) goto L2e
                return r7
            L2e:
                return r10
        }

        @com.google.errorprone.annotations.concurrent.GuardedBy("this")
        public final void setValue(com.google.common.cache.ReferenceEntry<K, V> r6, K r7, V r8, long r9) {
                r5 = this;
                com.google.common.cache.LocalCache$ValueReference r0 = r6.getValueReference()
                com.google.common.cache.LocalCache<K, V> r1 = r5.map
                com.google.common.cache.Weigher<K, V> r1 = r1.weigher
                int r7 = r1.weigh(r7, r8)
                if (r7 < 0) goto L10
                r1 = 1
                goto L11
            L10:
                r1 = 0
            L11:
                java.lang.String r2 = "Weights must be non-negative"
                com.google.common.base.Preconditions.checkState(r1, r2)
                com.google.common.cache.LocalCache<K, V> r1 = r5.map
                com.google.common.cache.LocalCache$Strength r1 = r1.valueStrength
                com.google.common.cache.LocalCache$ValueReference r1 = r1.referenceValue(r5, r6, r8, r7)
                r6.setValueReference(r1)
                r5.drainRecencyQueue()
                long r1 = r5.totalWeight
                long r3 = (long) r7
                long r1 = r1 + r3
                r5.totalWeight = r1
                com.google.common.cache.LocalCache<K, V> r7 = r5.map
                boolean r7 = r7.expiresAfterAccess()
                if (r7 == 0) goto L35
                r6.setAccessTime(r9)
            L35:
                com.google.common.cache.LocalCache<K, V> r7 = r5.map
                boolean r7 = r7.recordsWrite()
                if (r7 == 0) goto L40
                r6.setWriteTime(r9)
            L40:
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r7 = r5.accessQueue
                r7.add(r6)
                java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r7 = r5.writeQueue
                r7.add(r6)
                r0.notifyNewValue(r8)
                return
        }

        public final boolean storeLoadedValue(K r12, int r13, com.google.common.cache.LocalCache.LoadingValueReference<K, V> r14, V r15) {
                r11 = this;
                r11.lock()
                com.google.common.cache.LocalCache<K, V> r0 = r11.map     // Catch: java.lang.Throwable -> Lae
                com.google.common.base.Ticker r0 = r0.ticker     // Catch: java.lang.Throwable -> Lae
                long r5 = r0.read()     // Catch: java.lang.Throwable -> Lae
                r11.runLockedCleanup(r5)     // Catch: java.lang.Throwable -> Lae
                int r0 = r11.count     // Catch: java.lang.Throwable -> Lae
                r7 = 1
                int r0 = r0 + r7
                int r1 = r11.threshold     // Catch: java.lang.Throwable -> Lae
                if (r0 <= r1) goto L1c
                r11.expand()     // Catch: java.lang.Throwable -> Lae
                int r0 = r11.count     // Catch: java.lang.Throwable -> Lae
                int r0 = r0 + r7
            L1c:
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r8 = r11.table     // Catch: java.lang.Throwable -> Lae
                int r1 = r8.length()     // Catch: java.lang.Throwable -> Lae
                int r1 = r1 - r7
                r9 = r13 & r1
                java.lang.Object r1 = r8.get(r9)     // Catch: java.lang.Throwable -> Lae
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1     // Catch: java.lang.Throwable -> Lae
                r10 = r1
            L2c:
                if (r10 == 0) goto L95
                java.lang.Object r2 = r10.getKey()     // Catch: java.lang.Throwable -> Lae
                int r3 = r10.getHash()     // Catch: java.lang.Throwable -> Lae
                if (r3 != r13) goto L90
                if (r2 == 0) goto L90
                com.google.common.cache.LocalCache<K, V> r3 = r11.map     // Catch: java.lang.Throwable -> Lae
                com.google.common.base.Equivalence<java.lang.Object> r3 = r3.keyEquivalence     // Catch: java.lang.Throwable -> Lae
                boolean r2 = r3.equivalent(r12, r2)     // Catch: java.lang.Throwable -> Lae
                if (r2 == 0) goto L90
                com.google.common.cache.LocalCache$ValueReference r13 = r10.getValueReference()     // Catch: java.lang.Throwable -> Lae
                java.lang.Object r1 = r13.get()     // Catch: java.lang.Throwable -> Lae
                if (r14 == r13) goto L62
                if (r1 != 0) goto L55
                com.google.common.cache.LocalCache$ValueReference<java.lang.Object, java.lang.Object> r2 = com.google.common.cache.LocalCache.UNSET     // Catch: java.lang.Throwable -> Lae
                if (r13 == r2) goto L55
                goto L62
            L55:
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> Lae
                r14 = 0
                r11.enqueueNotification(r12, r15, r14, r13)     // Catch: java.lang.Throwable -> Lae
                r11.unlock()
                r11.runUnlockedCleanup()
                return r14
            L62:
                int r13 = r11.modCount     // Catch: java.lang.Throwable -> Lae
                int r13 = r13 + r7
                r11.modCount = r13     // Catch: java.lang.Throwable -> Lae
                boolean r13 = r14.isActive()     // Catch: java.lang.Throwable -> Lae
                if (r13 == 0) goto L7d
                if (r1 != 0) goto L72
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> Lae
                goto L74
            L72:
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> Lae
            L74:
                int r14 = r14.getWeight()     // Catch: java.lang.Throwable -> Lae
                r11.enqueueNotification(r12, r1, r14, r13)     // Catch: java.lang.Throwable -> Lae
                int r0 = r0 + (-1)
            L7d:
                r1 = r11
                r2 = r10
                r3 = r12
                r4 = r15
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lae
                r11.count = r0     // Catch: java.lang.Throwable -> Lae
                r11.evictEntries(r10)     // Catch: java.lang.Throwable -> Lae
            L89:
                r11.unlock()
                r11.runUnlockedCleanup()
                return r7
            L90:
                com.google.common.cache.ReferenceEntry r10 = r10.getNext()     // Catch: java.lang.Throwable -> Lae
                goto L2c
            L95:
                int r14 = r11.modCount     // Catch: java.lang.Throwable -> Lae
                int r14 = r14 + r7
                r11.modCount = r14     // Catch: java.lang.Throwable -> Lae
                com.google.common.cache.ReferenceEntry r13 = r11.newEntry(r12, r13, r1)     // Catch: java.lang.Throwable -> Lae
                r1 = r11
                r2 = r13
                r3 = r12
                r4 = r15
                r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lae
                r8.set(r9, r13)     // Catch: java.lang.Throwable -> Lae
                r11.count = r0     // Catch: java.lang.Throwable -> Lae
                r11.evictEntries(r13)     // Catch: java.lang.Throwable -> Lae
                goto L89
            Lae:
                r12 = move-exception
                r11.unlock()
                r11.runUnlockedCleanup()
                throw r12
        }

        public final void tryDrainReferenceQueues() {
                r1 = this;
                boolean r0 = r1.tryLock()
                if (r0 == 0) goto L12
                r1.drainReferenceQueues()     // Catch: java.lang.Throwable -> Ld
                r1.unlock()
                goto L12
            Ld:
                r0 = move-exception
                r1.unlock()
                throw r0
            L12:
                return
        }

        public final V waitForLoadingValue(com.google.common.cache.ReferenceEntry<K, V> r5, K r6, com.google.common.cache.LocalCache.ValueReference<K, V> r7) throws java.util.concurrent.ExecutionException {
                r4 = this;
                boolean r0 = r7.isLoading()
                if (r0 == 0) goto L55
                boolean r0 = java.lang.Thread.holdsLock(r5)
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Recursive load of: %s"
                com.google.common.base.Preconditions.checkState(r0, r2, r6)
                java.lang.Object r7 = r7.waitForValue()     // Catch: java.lang.Throwable -> L4e
                if (r7 == 0) goto L28
                com.google.common.cache.LocalCache<K, V> r6 = r4.map     // Catch: java.lang.Throwable -> L4e
                com.google.common.base.Ticker r6 = r6.ticker     // Catch: java.lang.Throwable -> L4e
                long r2 = r6.read()     // Catch: java.lang.Throwable -> L4e
                r4.recordRead(r5, r2)     // Catch: java.lang.Throwable -> L4e
                com.google.common.cache.AbstractCache$StatsCounter r5 = r4.statsCounter
                r5.recordMisses(r1)
                return r7
            L28:
                com.google.common.cache.CacheLoader$InvalidCacheLoadException r5 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException     // Catch: java.lang.Throwable -> L4e
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L4e
                int r7 = r6.length()     // Catch: java.lang.Throwable -> L4e
                int r7 = r7 + 35
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
                r0.<init>(r7)     // Catch: java.lang.Throwable -> L4e
                java.lang.String r7 = "CacheLoader returned null for key "
                r0.append(r7)     // Catch: java.lang.Throwable -> L4e
                r0.append(r6)     // Catch: java.lang.Throwable -> L4e
                java.lang.String r6 = "."
                r0.append(r6)     // Catch: java.lang.Throwable -> L4e
                java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L4e
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L4e
                throw r5     // Catch: java.lang.Throwable -> L4e
            L4e:
                r5 = move-exception
                com.google.common.cache.AbstractCache$StatsCounter r6 = r4.statsCounter
                r6.recordMisses(r1)
                throw r5
            L55:
                java.lang.AssertionError r5 = new java.lang.AssertionError
                r5.<init>()
                throw r5
        }
    }

    public static class SoftValueReference<K, V> extends java.lang.ref.SoftReference<V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        public final com.google.common.cache.ReferenceEntry<K, V> entry;

        public SoftValueReference(java.lang.ref.ReferenceQueue<V> r1, V r2, com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r2, r1)
                r0.entry = r3
                return
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r2, V r3, com.google.common.cache.ReferenceEntry<K, V> r4) {
                r1 = this;
                com.google.common.cache.LocalCache$SoftValueReference r0 = new com.google.common.cache.LocalCache$SoftValueReference
                r0.<init>(r2, r3, r4)
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.entry
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract enum Strength extends java.lang.Enum<com.google.common.cache.LocalCache.Strength> {
        private static final /* synthetic */ com.google.common.cache.LocalCache.Strength[] $VALUES = null;
        public static final com.google.common.cache.LocalCache.Strength SOFT = null;
        public static final com.google.common.cache.LocalCache.Strength STRONG = null;
        public static final com.google.common.cache.LocalCache.Strength WEAK = null;




        private static /* synthetic */ com.google.common.cache.LocalCache.Strength[] $values() {
                r0 = 3
                com.google.common.cache.LocalCache$Strength[] r0 = new com.google.common.cache.LocalCache.Strength[r0]
                com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.STRONG
                r2 = 0
                r0[r2] = r1
                com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.SOFT
                r2 = 1
                r0[r2] = r1
                com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.WEAK
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.cache.LocalCache$Strength$1 r0 = new com.google.common.cache.LocalCache$Strength$1
                r0.<init>()
                com.google.common.cache.LocalCache.Strength.STRONG = r0
                com.google.common.cache.LocalCache$Strength$2 r0 = new com.google.common.cache.LocalCache$Strength$2
                r0.<init>()
                com.google.common.cache.LocalCache.Strength.SOFT = r0
                com.google.common.cache.LocalCache$Strength$3 r0 = new com.google.common.cache.LocalCache$Strength$3
                r0.<init>()
                com.google.common.cache.LocalCache.Strength.WEAK = r0
                com.google.common.cache.LocalCache$Strength[] r0 = $values()
                com.google.common.cache.LocalCache.Strength.$VALUES = r0
                return
        }

        private Strength(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ Strength(java.lang.String r1, int r2, com.google.common.cache.LocalCache.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.cache.LocalCache.Strength valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.cache.LocalCache$Strength> r0 = com.google.common.cache.LocalCache.Strength.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.cache.LocalCache$Strength r1 = (com.google.common.cache.LocalCache.Strength) r1
                return r1
        }

        public static com.google.common.cache.LocalCache.Strength[] values() {
                com.google.common.cache.LocalCache$Strength[] r0 = com.google.common.cache.LocalCache.Strength.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.cache.LocalCache$Strength[] r0 = (com.google.common.cache.LocalCache.Strength[]) r0
                return r0
        }

        public abstract com.google.common.base.Equivalence<java.lang.Object> defaultEquivalence();

        public abstract <K, V> com.google.common.cache.LocalCache.ValueReference<K, V> referenceValue(com.google.common.cache.LocalCache.Segment<K, V> r1, com.google.common.cache.ReferenceEntry<K, V> r2, V r3, int r4);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class StrongAccessEntry<K, V> extends com.google.common.cache.LocalCache.StrongEntry<K, V> {
        public volatile long accessTime;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> nextAccess;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> previousAccess;

        public StrongAccessEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.accessTime = r1
                com.google.common.cache.LocalCache$NullEntry r1 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                r0.nextAccess = r1
                r0.previousAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
                r2 = this;
                long r0 = r2.accessTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long r1) {
                r0 = this;
                r0.accessTime = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousAccess = r1
                return
        }
    }

    public static final class StrongAccessWriteEntry<K, V> extends com.google.common.cache.LocalCache.StrongEntry<K, V> {
        public volatile long accessTime;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> nextAccess;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> nextWrite;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> previousAccess;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        public volatile long writeTime;

        public StrongAccessWriteEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.accessTime = r1
                com.google.common.cache.LocalCache$NullEntry r3 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                r0.nextAccess = r3
                r0.previousAccess = r3
                r0.writeTime = r1
                r0.nextWrite = r3
                r0.previousWrite = r3
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
                r2 = this;
                long r0 = r2.accessTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
                r2 = this;
                long r0 = r2.writeTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long r1) {
                r0 = this;
                r0.accessTime = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long r1) {
                r0 = this;
                r0.writeTime = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class StrongEntry<K, V> extends com.google.common.cache.LocalCache.AbstractReferenceEntry<K, V> {
        public final int hash;
        public final K key;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public final com.google.common.cache.ReferenceEntry<K, V> next;
        public volatile com.google.common.cache.LocalCache.ValueReference<K, V> valueReference;

        public StrongEntry(K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
                r1 = this;
                r1.<init>()
                com.google.common.cache.LocalCache$ValueReference<java.lang.Object, java.lang.Object> r0 = com.google.common.cache.LocalCache.UNSET
                r1.valueReference = r0
                r1.key = r2
                r1.hash = r3
                r1.next = r4
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public int getHash() {
                r1 = this;
                int r0 = r1.hash
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNext() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.next
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.valueReference
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> r1) {
                r0 = this;
                r0.valueReference = r1
                return
        }
    }

    public static class StrongValueReference<K, V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        public final V referent;

        public StrongValueReference(V r1) {
                r0 = this;
                r0.<init>()
                r0.referent = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r1, V r2, com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
                r1 = this;
                V r0 = r1.referent
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class StrongWriteEntry<K, V> extends com.google.common.cache.LocalCache.StrongEntry<K, V> {

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> nextWrite;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        public volatile long writeTime;

        public StrongWriteEntry(K r1, int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.writeTime = r1
                com.google.common.cache.LocalCache$NullEntry r1 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                r0.nextWrite = r1
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
                r2 = this;
                long r0 = r2.writeTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long r1) {
                r0 = this;
                r0.writeTime = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class ValueIterator extends com.google.common.cache.LocalCache<K, V>.HashIterator<V> {
        public ValueIterator(com.google.common.cache.LocalCache r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public V next() {
                r1 = this;
                com.google.common.cache.LocalCache$WriteThroughEntry r0 = r1.nextEntry()
                java.lang.Object r0 = r0.getValue()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface ValueReference<K, V> {
        com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2, com.google.common.cache.ReferenceEntry<K, V> r3);

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        V get();

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        com.google.common.cache.ReferenceEntry<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1);

        V waitForValue() throws java.util.concurrent.ExecutionException;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class Values extends java.util.AbstractCollection<V> {
        public final /* synthetic */ com.google.common.cache.LocalCache this$0;

        public Values(com.google.common.cache.LocalCache r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                com.google.common.cache.LocalCache r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.common.cache.LocalCache r0 = r1.this$0
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                com.google.common.cache.LocalCache r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r2 = this;
                com.google.common.cache.LocalCache$ValueIterator r0 = new com.google.common.cache.LocalCache$ValueIterator
                com.google.common.cache.LocalCache r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                com.google.common.cache.LocalCache r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.cache.LocalCache.access$200(r1)
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] r2) {
                r1 = this;
                java.util.ArrayList r0 = com.google.common.cache.LocalCache.access$200(r1)
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class WeakAccessEntry<K, V> extends com.google.common.cache.LocalCache.WeakEntry<K, V> {
        public volatile long accessTime;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> nextAccess;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> previousAccess;

        public WeakAccessEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.accessTime = r1
                com.google.common.cache.LocalCache$NullEntry r1 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                r0.nextAccess = r1
                r0.previousAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
                r2 = this;
                long r0 = r2.accessTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long r1) {
                r0 = this;
                r0.accessTime = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousAccess = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class WeakAccessWriteEntry<K, V> extends com.google.common.cache.LocalCache.WeakEntry<K, V> {
        public volatile long accessTime;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> nextAccess;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> nextWrite;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> previousAccess;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        public volatile long writeTime;

        public WeakAccessWriteEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.accessTime = r1
                com.google.common.cache.LocalCache$NullEntry r3 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                r0.nextAccess = r3
                r0.previousAccess = r3
                r0.writeTime = r1
                r0.nextWrite = r3
                r0.previousWrite = r3
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
                r2 = this;
                long r0 = r2.accessTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousAccess
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
                r2 = this;
                long r0 = r2.writeTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long r1) {
                r0 = this;
                r0.accessTime = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousAccess = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long r1) {
                r0 = this;
                r0.writeTime = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class WeakEntry<K, V> extends java.lang.ref.WeakReference<K> implements com.google.common.cache.ReferenceEntry<K, V> {
        public final int hash;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public final com.google.common.cache.ReferenceEntry<K, V> next;
        public volatile com.google.common.cache.LocalCache.ValueReference<K, V> valueReference;

        public WeakEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r2, r1)
                com.google.common.cache.LocalCache$ValueReference<java.lang.Object, java.lang.Object> r1 = com.google.common.cache.LocalCache.UNSET
                r0.valueReference = r1
                r0.hash = r3
                r0.next = r4
                return
        }

        public long getAccessTime() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
                r1 = this;
                int r0 = r1.hash
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                return r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNext() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.next
                return r0
        }

        public com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // com.google.common.cache.ReferenceEntry
        public com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference() {
                r1 = this;
                com.google.common.cache.LocalCache$ValueReference<K, V> r0 = r1.valueReference
                return r0
        }

        public long getWriteTime() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        public void setAccessTime(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        public void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        public void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> r1) {
                r0 = this;
                r0.valueReference = r1
                return
        }

        public void setWriteTime(long r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class WeakValueReference<K, V> extends java.lang.ref.WeakReference<V> implements com.google.common.cache.LocalCache.ValueReference<K, V> {
        public final com.google.common.cache.ReferenceEntry<K, V> entry;

        public WeakValueReference(java.lang.ref.ReferenceQueue<V> r1, V r2, com.google.common.cache.ReferenceEntry<K, V> r3) {
                r0 = this;
                r0.<init>(r2, r1)
                r0.entry = r3
                return
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r2, V r3, com.google.common.cache.ReferenceEntry<K, V> r4) {
                r1 = this;
                com.google.common.cache.LocalCache$WeakValueReference r0 = new com.google.common.cache.LocalCache$WeakValueReference
                r0.<init>(r2, r3, r4)
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.ReferenceEntry<K, V> getEntry() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.entry
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V r1) {
                r0 = this;
                return
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class WeakWriteEntry<K, V> extends com.google.common.cache.LocalCache.WeakEntry<K, V> {

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> nextWrite;

        @com.google.j2objc.annotations.Weak
        public com.google.common.cache.ReferenceEntry<K, V> previousWrite;
        public volatile long writeTime;

        public WeakWriteEntry(java.lang.ref.ReferenceQueue<K> r1, K r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.ReferenceEntry<K, V> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.writeTime = r1
                com.google.common.cache.LocalCache$NullEntry r1 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                r0.nextWrite = r1
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.nextWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue() {
                r1 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r1.previousWrite
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
                r2 = this;
                long r0 = r2.writeTime
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.nextWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1) {
                r0 = this;
                r0.previousWrite = r1
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long r1) {
                r0 = this;
                r0.writeTime = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class WeightedSoftValueReference<K, V> extends com.google.common.cache.LocalCache.SoftValueReference<K, V> {
        public final int weight;

        public WeightedSoftValueReference(java.lang.ref.ReferenceQueue<V> r1, V r2, com.google.common.cache.ReferenceEntry<K, V> r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.weight = r4
                return
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r3, V r4, com.google.common.cache.ReferenceEntry<K, V> r5) {
                r2 = this;
                com.google.common.cache.LocalCache$WeightedSoftValueReference r0 = new com.google.common.cache.LocalCache$WeightedSoftValueReference
                int r1 = r2.weight
                r0.<init>(r3, r4, r5, r1)
                return r0
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                int r0 = r1.weight
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class WeightedStrongValueReference<K, V> extends com.google.common.cache.LocalCache.StrongValueReference<K, V> {
        public final int weight;

        public WeightedStrongValueReference(V r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                r0.weight = r2
                return
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                int r0 = r1.weight
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class WeightedWeakValueReference<K, V> extends com.google.common.cache.LocalCache.WeakValueReference<K, V> {
        public final int weight;

        public WeightedWeakValueReference(java.lang.ref.ReferenceQueue<V> r1, V r2, com.google.common.cache.ReferenceEntry<K, V> r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.weight = r4
                return
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public com.google.common.cache.LocalCache.ValueReference<K, V> copyFor(java.lang.ref.ReferenceQueue<V> r3, V r4, com.google.common.cache.ReferenceEntry<K, V> r5) {
                r2 = this;
                com.google.common.cache.LocalCache$WeightedWeakValueReference r0 = new com.google.common.cache.LocalCache$WeightedWeakValueReference
                int r1 = r2.weight
                r0.<init>(r3, r4, r5, r1)
                return r0
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
                r1 = this;
                int r0 = r1.weight
                return r0
        }
    }

    public static final class WriteQueue<K, V> extends java.util.AbstractQueue<com.google.common.cache.ReferenceEntry<K, V>> {
        public final com.google.common.cache.ReferenceEntry<K, V> head;



        public WriteQueue() {
                r1 = this;
                r1.<init>()
                com.google.common.cache.LocalCache$WriteQueue$1 r0 = new com.google.common.cache.LocalCache$WriteQueue$1
                r0.<init>()
                r1.head = r0
                return
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInWriteQueue()
            L6:
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 == r1) goto L13
                com.google.common.cache.ReferenceEntry r1 = r0.getNextInWriteQueue()
                com.google.common.cache.LocalCache.nullifyWriteOrder(r0)
                r0 = r1
                goto L6
            L13:
                r1.setNextInWriteQueue(r1)
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                r0.setPreviousInWriteQueue(r0)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2
                com.google.common.cache.ReferenceEntry r2 = r2.getNextInWriteQueue()
                com.google.common.cache.LocalCache$NullEntry r0 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                if (r2 == r0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInWriteQueue()
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 != r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<com.google.common.cache.ReferenceEntry<K, V>> iterator() {
                r2 = this;
                com.google.common.cache.LocalCache$WriteQueue$2 r0 = new com.google.common.cache.LocalCache$WriteQueue$2
                com.google.common.cache.ReferenceEntry r1 = r2.peek()
                r0.<init>(r2, r1)
                return r0
        }

        public boolean offer(com.google.common.cache.ReferenceEntry<K, V> r3) {
                r2 = this;
                com.google.common.cache.ReferenceEntry r0 = r3.getPreviousInWriteQueue()
                com.google.common.cache.ReferenceEntry r1 = r3.getNextInWriteQueue()
                com.google.common.cache.LocalCache.connectWriteOrder(r0, r1)
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getPreviousInWriteQueue()
                com.google.common.cache.LocalCache.connectWriteOrder(r0, r3)
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                r3.setNextInWriteQueue(r0)
                r0.setPreviousInWriteQueue(r3)
                r3 = 1
                return r3
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ boolean offer(java.lang.Object r1) {
                r0 = this;
                com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1
                boolean r1 = r0.offer(r1)
                return r1
        }

        @Override // java.util.Queue
        public com.google.common.cache.ReferenceEntry<K, V> peek() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInWriteQueue()
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 != r1) goto Lb
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ java.lang.Object peek() {
                r1 = this;
                com.google.common.cache.ReferenceEntry r0 = r1.peek()
                return r0
        }

        @Override // java.util.Queue
        public com.google.common.cache.ReferenceEntry<K, V> poll() {
                r2 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r2.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInWriteQueue()
                com.google.common.cache.ReferenceEntry<K, V> r1 = r2.head
                if (r0 != r1) goto Lc
                r0 = 0
                return r0
            Lc:
                r2.remove(r0)
                return r0
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ java.lang.Object poll() {
                r1 = this;
                com.google.common.cache.ReferenceEntry r0 = r1.poll()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                com.google.common.cache.ReferenceEntry r3 = (com.google.common.cache.ReferenceEntry) r3
                com.google.common.cache.ReferenceEntry r0 = r3.getPreviousInWriteQueue()
                com.google.common.cache.ReferenceEntry r1 = r3.getNextInWriteQueue()
                com.google.common.cache.LocalCache.connectWriteOrder(r0, r1)
                com.google.common.cache.LocalCache.nullifyWriteOrder(r3)
                com.google.common.cache.LocalCache$NullEntry r3 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
                if (r1 == r3) goto L16
                r3 = 1
                goto L17
            L16:
                r3 = 0
            L17:
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r3 = this;
                com.google.common.cache.ReferenceEntry<K, V> r0 = r3.head
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInWriteQueue()
                r1 = 0
            L7:
                com.google.common.cache.ReferenceEntry<K, V> r2 = r3.head
                if (r0 == r2) goto L12
                int r1 = r1 + 1
                com.google.common.cache.ReferenceEntry r0 = r0.getNextInWriteQueue()
                goto L7
            L12:
                return r1
        }
    }

    public final class WriteThroughEntry implements java.util.Map.Entry<K, V> {
        public final K key;
        public final /* synthetic */ com.google.common.cache.LocalCache this$0;
        public V value;

        public WriteThroughEntry(com.google.common.cache.LocalCache r1, K r2, V r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                r0.value = r3
                return
        }

        @Override // java.util.Map.Entry
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
                r2 = this;
                K r0 = r2.key
                int r0 = r0.hashCode()
                V r1 = r2.value
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r3) {
                r2 = this;
                com.google.common.cache.LocalCache r0 = r2.this$0
                K r1 = r2.key
                java.lang.Object r0 = r0.put(r1, r3)
                r2.value = r3
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.Object r0 = r4.getKey()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.Object r1 = r4.getValue()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 1
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = "="
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1)
                return r0
        }
    }

    static {
            java.lang.Class<com.google.common.cache.LocalCache> r0 = com.google.common.cache.LocalCache.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.cache.LocalCache.logger = r0
            com.google.common.cache.LocalCache$1 r0 = new com.google.common.cache.LocalCache$1
            r0.<init>()
            com.google.common.cache.LocalCache.UNSET = r0
            com.google.common.cache.LocalCache$2 r0 = new com.google.common.cache.LocalCache$2
            r0.<init>()
            com.google.common.cache.LocalCache.DISCARDING_QUEUE = r0
            return
    }

    public LocalCache(com.google.common.cache.CacheBuilder<? super K, ? super V> r19, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.cache.CacheLoader<? super K, V> r20) {
            r18 = this;
            r6 = r18
            r7 = r19
            r18.<init>()
            int r0 = r7.concurrencyLevel
            r1 = -1
            r2 = 4
            if (r0 != r1) goto Le
            r0 = 4
        Le:
            r3 = 65536(0x10000, float:9.1835E-41)
            int r0 = java.lang.Math.min(r0, r3)
            r6.concurrencyLevel = r0
            com.google.common.cache.LocalCache$Strength r0 = r7.keyStrength
            com.google.common.cache.LocalCache$Strength r3 = com.google.common.cache.LocalCache.Strength.STRONG
            java.lang.Object r0 = com.google.common.base.MoreObjects.firstNonNull(r0, r3)
            com.google.common.cache.LocalCache$Strength r0 = (com.google.common.cache.LocalCache.Strength) r0
            r6.keyStrength = r0
            com.google.common.cache.LocalCache$Strength r4 = r7.valueStrength
            java.lang.Object r4 = com.google.common.base.MoreObjects.firstNonNull(r4, r3)
            com.google.common.cache.LocalCache$Strength r4 = (com.google.common.cache.LocalCache.Strength) r4
            r6.valueStrength = r4
            com.google.common.base.Equivalence<java.lang.Object> r4 = r7.keyEquivalence
            com.google.common.cache.LocalCache$Strength r5 = r7.keyStrength
            java.lang.Object r5 = com.google.common.base.MoreObjects.firstNonNull(r5, r3)
            com.google.common.cache.LocalCache$Strength r5 = (com.google.common.cache.LocalCache.Strength) r5
            com.google.common.base.Equivalence r5 = r5.defaultEquivalence()
            java.lang.Object r4 = com.google.common.base.MoreObjects.firstNonNull(r4, r5)
            com.google.common.base.Equivalence r4 = (com.google.common.base.Equivalence) r4
            r6.keyEquivalence = r4
            com.google.common.base.Equivalence<java.lang.Object> r4 = r7.valueEquivalence
            com.google.common.cache.LocalCache$Strength r5 = r7.valueStrength
            java.lang.Object r3 = com.google.common.base.MoreObjects.firstNonNull(r5, r3)
            com.google.common.cache.LocalCache$Strength r3 = (com.google.common.cache.LocalCache.Strength) r3
            com.google.common.base.Equivalence r3 = r3.defaultEquivalence()
            java.lang.Object r3 = com.google.common.base.MoreObjects.firstNonNull(r4, r3)
            com.google.common.base.Equivalence r3 = (com.google.common.base.Equivalence) r3
            r6.valueEquivalence = r3
            long r3 = r7.expireAfterWriteNanos
            r8 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 == 0) goto L71
            long r3 = r7.expireAfterAccessNanos
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L67
            goto L71
        L67:
            com.google.common.cache.Weigher<? super K, ? super V> r3 = r7.weigher
            if (r3 != 0) goto L6e
            long r3 = r7.maximumSize
            goto L72
        L6e:
            long r3 = r7.maximumWeight
            goto L72
        L71:
            r3 = r8
        L72:
            r6.maxWeight = r3
            com.google.common.cache.Weigher<? super K, ? super V> r5 = r7.weigher
            com.google.common.cache.CacheBuilder$OneWeigher r10 = com.google.common.cache.CacheBuilder.OneWeigher.INSTANCE
            java.lang.Object r5 = com.google.common.base.MoreObjects.firstNonNull(r5, r10)
            com.google.common.cache.Weigher r5 = (com.google.common.cache.Weigher) r5
            r6.weigher = r5
            long r11 = r7.expireAfterAccessNanos
            r13 = -1
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L89
            r11 = r8
        L89:
            r6.expireAfterAccessNanos = r11
            long r11 = r7.expireAfterWriteNanos
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L92
            r11 = r8
        L92:
            r6.expireAfterWriteNanos = r11
            long r11 = r7.refreshNanos
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L9b
            goto L9c
        L9b:
            r8 = r11
        L9c:
            r6.refreshNanos = r8
            com.google.common.cache.RemovalListener<? super K, ? super V> r8 = r7.removalListener
            com.google.common.cache.CacheBuilder$NullListener r9 = com.google.common.cache.CacheBuilder.NullListener.INSTANCE
            java.lang.Object r8 = com.google.common.base.MoreObjects.firstNonNull(r8, r9)
            com.google.common.cache.RemovalListener r8 = (com.google.common.cache.RemovalListener) r8
            r6.removalListener = r8
            if (r8 != r9) goto Laf
            java.util.Queue<?> r8 = com.google.common.cache.LocalCache.DISCARDING_QUEUE
            goto Lb4
        Laf:
            java.util.concurrent.ConcurrentLinkedQueue r8 = new java.util.concurrent.ConcurrentLinkedQueue
            r8.<init>()
        Lb4:
            java.util.AbstractQueue r8 = (java.util.AbstractQueue) r8
            r6.removalNotificationQueue = r8
            boolean r8 = r18.recordsWrite()
            r9 = 0
            r11 = 1
            if (r8 != 0) goto Lc9
            boolean r8 = r18.expiresAfterAccess()
            if (r8 == 0) goto Lc7
            goto Lc9
        Lc7:
            r8 = 0
            goto Lca
        Lc9:
            r8 = 1
        Lca:
            com.google.common.base.Ticker r12 = r7.ticker
            if (r12 == 0) goto Lcf
            goto Ld9
        Lcf:
            if (r8 == 0) goto Ld6
            com.google.common.base.Ticker r8 = com.google.common.base.Ticker.systemTicker()
            goto Ld8
        Ld6:
            com.google.common.base.Ticker r8 = com.google.common.cache.CacheBuilder.NULL_TICKER
        Ld8:
            r12 = r8
        Ld9:
            r6.ticker = r12
            boolean r8 = r18.usesAccessQueue()
            if (r8 != 0) goto Lea
            boolean r8 = r18.expiresAfterAccess()
            if (r8 == 0) goto Le8
            goto Lea
        Le8:
            r8 = 0
            goto Leb
        Lea:
            r8 = 1
        Leb:
            boolean r12 = r18.expiresAfterWrite()
            if (r12 != 0) goto Lfa
            boolean r12 = r18.recordsWrite()
            if (r12 == 0) goto Lf8
            goto Lfa
        Lf8:
            r12 = 0
            goto Lfb
        Lfa:
            r12 = 1
        Lfb:
            com.google.common.cache.LocalCache$EntryFactory r13 = com.google.common.cache.LocalCache.EntryFactory.STRONG
            com.google.common.cache.LocalCache$Strength r13 = com.google.common.cache.LocalCache.Strength.WEAK
            if (r0 != r13) goto L102
            goto L103
        L102:
            r2 = 0
        L103:
            r0 = r2 | r8
            if (r12 == 0) goto L109
            r2 = 2
            goto L10a
        L109:
            r2 = 0
        L10a:
            r0 = r0 | r2
            com.google.common.cache.LocalCache$EntryFactory[] r2 = com.google.common.cache.LocalCache.EntryFactory.factories
            r0 = r2[r0]
            r6.entryFactory = r0
            com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache$StatsCounter> r0 = r7.statsCounterSupplier
            java.lang.Object r0 = r0.get()
            com.google.common.cache.AbstractCache$StatsCounter r0 = (com.google.common.cache.AbstractCache.StatsCounter) r0
            r6.globalStatsCounter = r0
            r0 = r20
            r6.defaultLoader = r0
            int r0 = r7.initialCapacity
            if (r0 != r1) goto L125
            r0 = 16
        L125:
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = java.lang.Math.min(r0, r1)
            boolean r1 = r18.evictsBySize()
            if (r1 == 0) goto L13e
            if (r5 == r10) goto L135
            r1 = 1
            goto L136
        L135:
            r1 = 0
        L136:
            if (r1 != 0) goto L13e
            long r0 = (long) r0
            long r0 = java.lang.Math.min(r0, r3)
            int r0 = (int) r0
        L13e:
            r1 = 1
            r2 = 0
        L140:
            int r3 = r6.concurrencyLevel
            if (r1 >= r3) goto L158
            boolean r3 = r18.evictsBySize()
            if (r3 == 0) goto L153
            int r3 = r1 * 20
            long r3 = (long) r3
            long r12 = r6.maxWeight
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 > 0) goto L158
        L153:
            int r2 = r2 + 1
            int r1 = r1 << 1
            goto L140
        L158:
            int r2 = 32 - r2
            r6.segmentShift = r2
            int r2 = r1 + (-1)
            r6.segmentMask = r2
            com.google.common.cache.LocalCache$Segment[] r2 = new com.google.common.cache.LocalCache.Segment[r1]
            r6.segments = r2
            int r2 = r0 / r1
            int r3 = r2 * r1
            if (r3 >= r0) goto L16c
            int r2 = r2 + 1
        L16c:
            if (r11 >= r2) goto L171
            int r11 = r11 << 1
            goto L16c
        L171:
            boolean r0 = r18.evictsBySize()
            if (r0 == 0) goto L1a9
            long r2 = r6.maxWeight
            long r0 = (long) r1
            long r4 = r2 / r0
            r12 = 1
            long r4 = r4 + r12
            long r14 = r2 % r0
        L181:
            com.google.common.cache.LocalCache$Segment<K, V>[] r8 = r6.segments
            int r0 = r8.length
            if (r9 >= r0) goto L1c7
            long r0 = (long) r9
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 != 0) goto L18c
            long r4 = r4 - r12
        L18c:
            r16 = r4
            com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache$StatsCounter> r0 = r7.statsCounterSupplier
            java.lang.Object r0 = r0.get()
            r5 = r0
            com.google.common.cache.AbstractCache$StatsCounter r5 = (com.google.common.cache.AbstractCache.StatsCounter) r5
            com.google.common.cache.LocalCache$Segment r10 = new com.google.common.cache.LocalCache$Segment
            r0 = r10
            r1 = r18
            r2 = r11
            r3 = r16
            r0.<init>(r1, r2, r3, r5)
            r8[r9] = r10
            int r9 = r9 + 1
            r4 = r16
            goto L181
        L1a9:
            com.google.common.cache.LocalCache$Segment<K, V>[] r8 = r6.segments
            int r0 = r8.length
            if (r9 >= r0) goto L1c7
            r3 = -1
            com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache$StatsCounter> r0 = r7.statsCounterSupplier
            java.lang.Object r0 = r0.get()
            r5 = r0
            com.google.common.cache.AbstractCache$StatsCounter r5 = (com.google.common.cache.AbstractCache.StatsCounter) r5
            com.google.common.cache.LocalCache$Segment r10 = new com.google.common.cache.LocalCache$Segment
            r0 = r10
            r1 = r18
            r2 = r11
            r0.<init>(r1, r2, r3, r5)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L1a9
        L1c7:
            return
    }

    public static /* synthetic */ java.util.ArrayList access$200(java.util.Collection r0) {
            java.util.ArrayList r0 = toArrayList(r0)
            return r0
    }

    public static <K, V> void connectAccessOrder(com.google.common.cache.ReferenceEntry<K, V> r0, com.google.common.cache.ReferenceEntry<K, V> r1) {
            r0.setNextInAccessQueue(r1)
            r1.setPreviousInAccessQueue(r0)
            return
    }

    public static <K, V> void connectWriteOrder(com.google.common.cache.ReferenceEntry<K, V> r0, com.google.common.cache.ReferenceEntry<K, V> r1) {
            r0.setNextInWriteQueue(r1)
            r1.setPreviousInWriteQueue(r0)
            return
    }

    public static <K, V> void nullifyAccessOrder(com.google.common.cache.ReferenceEntry<K, V> r1) {
            com.google.common.cache.LocalCache$NullEntry r0 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
            r1.setNextInAccessQueue(r0)
            r1.setPreviousInAccessQueue(r0)
            return
    }

    public static <K, V> void nullifyWriteOrder(com.google.common.cache.ReferenceEntry<K, V> r1) {
            com.google.common.cache.LocalCache$NullEntry r0 = com.google.common.cache.LocalCache.NullEntry.INSTANCE
            r1.setNextInWriteQueue(r0)
            r1.setPreviousInWriteQueue(r0)
            return
    }

    private static <E> java.util.ArrayList<E> toArrayList(java.util.Collection<E> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
            com.google.common.collect.Iterators.addAll(r0, r2)
            return r0
    }

    public void cleanUp() {
            r6 = this;
            com.google.common.cache.LocalCache$Segment<K, V>[] r0 = r6.segments
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            com.google.common.cache.LocalCache<K, V> r4 = r3.map
            com.google.common.base.Ticker r4 = r4.ticker
            long r4 = r4.read()
            r3.runLockedCleanup(r4)
            r3.runUnlockedCleanup()
            int r2 = r2 + 1
            goto L4
        L19:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r12 = this;
            com.google.common.cache.LocalCache$Segment<K, V>[] r0 = r12.segments
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto Lbc
            r4 = r0[r3]
            int r5 = r4.count
            if (r5 == 0) goto Lb8
            r4.lock()
            com.google.common.cache.LocalCache<K, V> r5 = r4.map     // Catch: java.lang.Throwable -> Lb0
            com.google.common.base.Ticker r5 = r5.ticker     // Catch: java.lang.Throwable -> Lb0
            long r5 = r5.read()     // Catch: java.lang.Throwable -> Lb0
            r4.runLockedCleanup(r5)     // Catch: java.lang.Throwable -> Lb0
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r5 = r4.table     // Catch: java.lang.Throwable -> Lb0
            r6 = 0
        L1e:
            int r7 = r5.length()     // Catch: java.lang.Throwable -> Lb0
            if (r6 >= r7) goto L62
            java.lang.Object r7 = r5.get(r6)     // Catch: java.lang.Throwable -> Lb0
            com.google.common.cache.ReferenceEntry r7 = (com.google.common.cache.ReferenceEntry) r7     // Catch: java.lang.Throwable -> Lb0
        L2a:
            if (r7 == 0) goto L5f
            com.google.common.cache.LocalCache$ValueReference r8 = r7.getValueReference()     // Catch: java.lang.Throwable -> Lb0
            boolean r8 = r8.isActive()     // Catch: java.lang.Throwable -> Lb0
            if (r8 == 0) goto L5a
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> Lb0
            com.google.common.cache.LocalCache$ValueReference r9 = r7.getValueReference()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r9 = r9.get()     // Catch: java.lang.Throwable -> Lb0
            if (r8 == 0) goto L4a
            if (r9 != 0) goto L47
            goto L4a
        L47:
            com.google.common.cache.RemovalCause r10 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> Lb0
            goto L4c
        L4a:
            com.google.common.cache.RemovalCause r10 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> Lb0
        L4c:
            r7.getHash()     // Catch: java.lang.Throwable -> Lb0
            com.google.common.cache.LocalCache$ValueReference r11 = r7.getValueReference()     // Catch: java.lang.Throwable -> Lb0
            int r11 = r11.getWeight()     // Catch: java.lang.Throwable -> Lb0
            r4.enqueueNotification(r8, r9, r11, r10)     // Catch: java.lang.Throwable -> Lb0
        L5a:
            com.google.common.cache.ReferenceEntry r7 = r7.getNext()     // Catch: java.lang.Throwable -> Lb0
            goto L2a
        L5f:
            int r6 = r6 + 1
            goto L1e
        L62:
            r6 = 0
        L63:
            int r7 = r5.length()     // Catch: java.lang.Throwable -> Lb0
            if (r6 >= r7) goto L70
            r7 = 0
            r5.set(r6, r7)     // Catch: java.lang.Throwable -> Lb0
            int r6 = r6 + 1
            goto L63
        L70:
            com.google.common.cache.LocalCache<K, V> r5 = r4.map     // Catch: java.lang.Throwable -> Lb0
            boolean r5 = r5.usesKeyReferences()     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L81
        L78:
            java.lang.ref.ReferenceQueue<K> r5 = r4.keyReferenceQueue     // Catch: java.lang.Throwable -> Lb0
            java.lang.ref.Reference r5 = r5.poll()     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L81
            goto L78
        L81:
            com.google.common.cache.LocalCache<K, V> r5 = r4.map     // Catch: java.lang.Throwable -> Lb0
            boolean r5 = r5.usesValueReferences()     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L92
        L89:
            java.lang.ref.ReferenceQueue<V> r5 = r4.valueReferenceQueue     // Catch: java.lang.Throwable -> Lb0
            java.lang.ref.Reference r5 = r5.poll()     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L92
            goto L89
        L92:
            java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r5 = r4.writeQueue     // Catch: java.lang.Throwable -> Lb0
            r5.clear()     // Catch: java.lang.Throwable -> Lb0
            java.util.Queue<com.google.common.cache.ReferenceEntry<K, V>> r5 = r4.accessQueue     // Catch: java.lang.Throwable -> Lb0
            r5.clear()     // Catch: java.lang.Throwable -> Lb0
            java.util.concurrent.atomic.AtomicInteger r5 = r4.readCount     // Catch: java.lang.Throwable -> Lb0
            r5.set(r2)     // Catch: java.lang.Throwable -> Lb0
            int r5 = r4.modCount     // Catch: java.lang.Throwable -> Lb0
            int r5 = r5 + 1
            r4.modCount = r5     // Catch: java.lang.Throwable -> Lb0
            r4.count = r2     // Catch: java.lang.Throwable -> Lb0
            r4.unlock()
            r4.runUnlockedCleanup()
            goto Lb8
        Lb0:
            r0 = move-exception
            r4.unlock()
            r4.runUnlockedCleanup()
            throw r0
        Lb8:
            int r3 = r3 + 1
            goto L5
        Lbc:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            int r1 = r5.hash(r6)
            com.google.common.cache.LocalCache$Segment r2 = r5.segmentFor(r1)
            java.util.Objects.requireNonNull(r2)
            int r3 = r2.count     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L2d
            com.google.common.cache.LocalCache<K, V> r3 = r2.map     // Catch: java.lang.Throwable -> L31
            com.google.common.base.Ticker r3 = r3.ticker     // Catch: java.lang.Throwable -> L31
            long r3 = r3.read()     // Catch: java.lang.Throwable -> L31
            com.google.common.cache.ReferenceEntry r6 = r2.getLiveEntry(r6, r1, r3)     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L22
            goto L2d
        L22:
            com.google.common.cache.LocalCache$ValueReference r6 = r6.getValueReference()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L2d
            r0 = 1
        L2d:
            r2.postReadCleanup()
            return r0
        L31:
            r6 = move-exception
            r2.postReadCleanup()
            throw r6
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            com.google.common.base.Ticker r3 = r0.ticker
            long r3 = r3.read()
            com.google.common.cache.LocalCache$Segment<K, V>[] r5 = r0.segments
            r6 = -1
            r8 = 0
        L13:
            r9 = 3
            if (r8 >= r9) goto L75
            r9 = 0
            int r11 = r5.length
            r12 = 0
        L1a:
            if (r12 >= r11) goto L63
            r13 = r5[r12]
            int r14 = r13.count
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r14 = r13.table
            r15 = 0
        L23:
            int r2 = r14.length()
            if (r15 >= r2) goto L55
            java.lang.Object r2 = r14.get(r15)
            com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2
        L2f:
            if (r2 == 0) goto L4e
            r16 = r5
            java.lang.Object r5 = r13.getLiveValue(r2, r3)
            r17 = r3
            if (r5 == 0) goto L45
            com.google.common.base.Equivalence<java.lang.Object> r3 = r0.valueEquivalence
            boolean r3 = r3.equivalent(r1, r5)
            if (r3 == 0) goto L45
            r1 = 1
            return r1
        L45:
            com.google.common.cache.ReferenceEntry r2 = r2.getNext()
            r5 = r16
            r3 = r17
            goto L2f
        L4e:
            r17 = r3
            r16 = r5
            int r15 = r15 + 1
            goto L23
        L55:
            r17 = r3
            r16 = r5
            int r2 = r13.modCount
            long r2 = (long) r2
            long r9 = r9 + r2
            int r12 = r12 + 1
            r3 = r17
            r2 = 0
            goto L1a
        L63:
            r17 = r3
            r16 = r5
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 != 0) goto L6c
            goto L75
        L6c:
            int r8 = r8 + 1
            r6 = r9
            r5 = r16
            r3 = r17
            r2 = 0
            goto L13
        L75:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    @com.google.common.annotations.GwtIncompatible
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set<java.util.Map$Entry<K, V>> r0 = r1.entrySet
            if (r0 == 0) goto L5
            goto Lc
        L5:
            com.google.common.cache.LocalCache$EntrySet r0 = new com.google.common.cache.LocalCache$EntrySet
            r0.<init>(r1)
            r1.entrySet = r0
        Lc:
            return r0
    }

    public final boolean evictsBySize() {
            r5 = this;
            long r0 = r5.maxWeight
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final boolean expiresAfterAccess() {
            r5 = this;
            long r0 = r5.expireAfterAccessNanos
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final boolean expiresAfterWrite() {
            r5 = this;
            long r0 = r5.expireAfterWriteNanos
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.hash(r3)
            com.google.common.cache.LocalCache$Segment r1 = r2.segmentFor(r0)
            java.lang.Object r3 = r1.get(r3, r0)
            return r3
    }

    public final V get(K r10, com.google.common.cache.CacheLoader<? super K, V> r11) throws java.util.concurrent.ExecutionException {
            r9 = this;
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r10)
            int r4 = r9.hash(r0)
            com.google.common.cache.LocalCache$Segment r0 = r9.segmentFor(r4)
            java.util.Objects.requireNonNull(r0)
            com.google.common.base.Preconditions.checkNotNull(r10)
            com.google.common.base.Preconditions.checkNotNull(r11)
            int r1 = r0.count     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            if (r1 == 0) goto L4d
            com.google.common.cache.ReferenceEntry r2 = r0.getEntry(r10, r4)     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            if (r2 == 0) goto L4d
            com.google.common.cache.LocalCache<K, V> r1 = r0.map     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            com.google.common.base.Ticker r1 = r1.ticker     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            long r6 = r1.read()     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            java.lang.Object r5 = r0.getLiveValue(r2, r6)     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            if (r5 == 0) goto L3e
            r0.recordRead(r2, r6)     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            com.google.common.cache.AbstractCache$StatsCounter r1 = r0.statsCounter     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            r3 = 1
            r1.recordHits(r3)     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            r1 = r0
            r3 = r10
            r8 = r11
            java.lang.Object r10 = r1.scheduleRefresh(r2, r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            goto L51
        L3e:
            com.google.common.cache.LocalCache$ValueReference r1 = r2.getValueReference()     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            boolean r3 = r1.isLoading()     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            if (r3 == 0) goto L4d
            java.lang.Object r10 = r0.waitForLoadingValue(r2, r10, r1)     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
            goto L51
        L4d:
            java.lang.Object r10 = r0.lockedGetOrLoad(r10, r4, r11)     // Catch: java.lang.Throwable -> L55 java.util.concurrent.ExecutionException -> L57
        L51:
            r0.postReadCleanup()
            return r10
        L55:
            r10 = move-exception
            goto L73
        L57:
            r10 = move-exception
            java.lang.Throwable r11 = r10.getCause()     // Catch: java.lang.Throwable -> L55
            boolean r1 = r11 instanceof java.lang.Error     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L6b
            boolean r1 = r11 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            com.google.common.util.concurrent.UncheckedExecutionException r10 = new com.google.common.util.concurrent.UncheckedExecutionException     // Catch: java.lang.Throwable -> L55
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L55
            throw r10     // Catch: java.lang.Throwable -> L55
        L6a:
            throw r10     // Catch: java.lang.Throwable -> L55
        L6b:
            com.google.common.util.concurrent.ExecutionError r10 = new com.google.common.util.concurrent.ExecutionError     // Catch: java.lang.Throwable -> L55
            java.lang.Error r11 = (java.lang.Error) r11     // Catch: java.lang.Throwable -> L55
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L55
            throw r10     // Catch: java.lang.Throwable -> L55
        L73:
            r0.postReadCleanup()
            throw r10
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V getIfPresent(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r3)
            int r0 = r2.hash(r0)
            com.google.common.cache.LocalCache$Segment r1 = r2.segmentFor(r0)
            java.lang.Object r3 = r1.get(r3, r0)
            r0 = 1
            if (r3 != 0) goto L19
            com.google.common.cache.AbstractCache$StatsCounter r1 = r2.globalStatsCounter
            r1.recordMisses(r0)
            goto L1e
        L19:
            com.google.common.cache.AbstractCache$StatsCounter r1 = r2.globalStatsCounter
            r1.recordHits(r0)
        L1e:
            return r3
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V getOrDefault(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L7
            r2 = r1
        L7:
            return r2
    }

    public final int hash(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
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
            com.google.common.cache.LocalCache$Segment<K, V>[] r0 = r10.segments
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

    public final boolean isExpired(com.google.common.cache.ReferenceEntry<K, V> r7, long r8) {
            r6 = this;
            com.google.common.base.Preconditions.checkNotNull(r7)
            boolean r0 = r6.expiresAfterAccess()
            r1 = 1
            if (r0 == 0) goto L17
            long r2 = r7.getAccessTime()
            long r2 = r8 - r2
            long r4 = r6.expireAfterAccessNanos
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L17
            return r1
        L17:
            boolean r0 = r6.expiresAfterWrite()
            if (r0 == 0) goto L29
            long r2 = r7.getWriteTime()
            long r8 = r8 - r2
            long r2 = r6.expireAfterWriteNanos
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 < 0) goto L29
            return r1
        L29:
            r7 = 0
            return r7
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set<K> r0 = r1.keySet
            if (r0 == 0) goto L5
            goto Lc
        L5:
            com.google.common.cache.LocalCache$KeySet r0 = new com.google.common.cache.LocalCache$KeySet
            r0.<init>(r1)
            r1.keySet = r0
        Lc:
            return r0
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final java.util.Map<K, V> loadAll(java.util.Set<? extends K> r6, com.google.common.cache.CacheLoader<? super K, V> r7) throws java.util.concurrent.ExecutionException {
            r5 = this;
            com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.base.Preconditions.checkNotNull(r6)
            com.google.common.base.Stopwatch r0 = com.google.common.base.Stopwatch.createStarted()
            r1 = 0
            java.util.Map r6 = r7.loadAll(r6)     // Catch: java.lang.Throwable -> L8b java.lang.Error -> L8d java.lang.Exception -> L94 java.lang.RuntimeException -> L9b java.lang.InterruptedException -> La2 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> Lb0
            if (r6 == 0) goto L6a
            r0.stop()
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            if (r4 == 0) goto L39
            if (r3 != 0) goto L35
            goto L39
        L35:
            r5.put(r4, r3)
            goto L1c
        L39:
            r1 = 1
            goto L1c
        L3b:
            if (r1 != 0) goto L49
            com.google.common.cache.AbstractCache$StatsCounter r7 = r5.globalStatsCounter
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r7.recordLoadSuccess(r0)
            return r6
        L49:
            com.google.common.cache.AbstractCache$StatsCounter r6 = r5.globalStatsCounter
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r6.recordLoadException(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r6 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r0 = r7.length()
            int r0 = r0 + 42
            java.lang.String r1 = " returned null keys or values from loadAll"
            java.lang.String r7 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r7, r1)
            r6.<init>(r7)
            throw r6
        L6a:
            com.google.common.cache.AbstractCache$StatsCounter r6 = r5.globalStatsCounter
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r6.recordLoadException(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r6 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r0 = r7.length()
            int r0 = r0 + 31
            java.lang.String r1 = " returned null map from loadAll"
            java.lang.String r7 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r7, r1)
            r6.<init>(r7)
            throw r6
        L8b:
            r6 = move-exception
            goto Lb4
        L8d:
            r6 = move-exception
            com.google.common.util.concurrent.ExecutionError r7 = new com.google.common.util.concurrent.ExecutionError     // Catch: java.lang.Throwable -> L8b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8b
            throw r7     // Catch: java.lang.Throwable -> L8b
        L94:
            r6 = move-exception
            java.util.concurrent.ExecutionException r7 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8b
            throw r7     // Catch: java.lang.Throwable -> L8b
        L9b:
            r6 = move-exception
            com.google.common.util.concurrent.UncheckedExecutionException r7 = new com.google.common.util.concurrent.UncheckedExecutionException     // Catch: java.lang.Throwable -> L8b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8b
            throw r7     // Catch: java.lang.Throwable -> L8b
        La2:
            r6 = move-exception
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L8b
            r7.interrupt()     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.ExecutionException r7 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8b
            throw r7     // Catch: java.lang.Throwable -> L8b
        Lb0:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r6 = move-exception
            r1 = 1
        Lb4:
            if (r1 != 0) goto Lc1
            com.google.common.cache.AbstractCache$StatsCounter r7 = r5.globalStatsCounter
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r7.recordLoadException(r0)
        Lc1:
            throw r6
    }

    public final long longSize() {
            r7 = this;
            com.google.common.cache.LocalCache$Segment<K, V>[] r0 = r7.segments
            r1 = 0
            r2 = 0
            r4 = 0
        L6:
            int r5 = r0.length
            if (r4 >= r5) goto L16
            r5 = r0[r4]
            int r5 = r5.count
            int r5 = java.lang.Math.max(r1, r5)
            long r5 = (long) r5
            long r2 = r2 + r5
            int r4 = r4 + 1
            goto L6
        L16:
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K r4, V r5) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r3.hash(r4)
            com.google.common.cache.LocalCache$Segment r1 = r3.segmentFor(r0)
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
    public V putIfAbsent(K r4, V r5) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r3.hash(r4)
            com.google.common.cache.LocalCache$Segment r1 = r3.segmentFor(r0)
            r2 = 1
            java.lang.Object r4 = r1.put(r4, r0, r5, r2)
            return r4
    }

    public final boolean recordsWrite() {
            r7 = this;
            boolean r0 = r7.expiresAfterWrite()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L15
            long r3 = r7.refreshNanos
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L16
        L15:
            r1 = 1
        L16:
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r13) {
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            int r5 = r12.hash(r13)
            com.google.common.cache.LocalCache$Segment r9 = r12.segmentFor(r5)
            r9.lock()
            com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch: java.lang.Throwable -> L84
            com.google.common.base.Ticker r1 = r1.ticker     // Catch: java.lang.Throwable -> L84
            long r1 = r1.read()     // Catch: java.lang.Throwable -> L84
            r9.runLockedCleanup(r1)     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r10 = r9.table     // Catch: java.lang.Throwable -> L84
            int r1 = r10.length()     // Catch: java.lang.Throwable -> L84
            int r1 = r1 + (-1)
            r11 = r1 & r5
            java.lang.Object r1 = r10.get(r11)     // Catch: java.lang.Throwable -> L84
            r2 = r1
            com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch: java.lang.Throwable -> L84
            r3 = r2
        L2c:
            if (r3 == 0) goto L7d
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L84
            int r1 = r3.getHash()     // Catch: java.lang.Throwable -> L84
            if (r1 != r5) goto L78
            if (r4 == 0) goto L78
            com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch: java.lang.Throwable -> L84
            com.google.common.base.Equivalence<java.lang.Object> r1 = r1.keyEquivalence     // Catch: java.lang.Throwable -> L84
            boolean r1 = r1.equivalent(r13, r4)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L78
            com.google.common.cache.LocalCache$ValueReference r7 = r3.getValueReference()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r13 = r7.get()     // Catch: java.lang.Throwable -> L84
            if (r13 == 0) goto L52
            com.google.common.cache.RemovalCause r0 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L84
        L50:
            r8 = r0
            goto L5b
        L52:
            boolean r1 = r7.isActive()     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L7d
            com.google.common.cache.RemovalCause r0 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L84
            goto L50
        L5b:
            int r0 = r9.modCount     // Catch: java.lang.Throwable -> L84
            int r0 = r0 + 1
            r9.modCount = r0     // Catch: java.lang.Throwable -> L84
            r1 = r9
            r6 = r13
            com.google.common.cache.ReferenceEntry r0 = r1.removeValueFromChain(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L84
            int r1 = r9.count     // Catch: java.lang.Throwable -> L84
            int r1 = r1 + (-1)
            r10.set(r11, r0)     // Catch: java.lang.Throwable -> L84
            r9.count = r1     // Catch: java.lang.Throwable -> L84
            r9.unlock()
            r9.runUnlockedCleanup()
            r0 = r13
            goto L83
        L78:
            com.google.common.cache.ReferenceEntry r3 = r3.getNext()     // Catch: java.lang.Throwable -> L84
            goto L2c
        L7d:
            r9.unlock()
            r9.runUnlockedCleanup()
        L83:
            return r0
        L84:
            r13 = move-exception
            r9.unlock()
            r9.runUnlockedCleanup()
            throw r13
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r14, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r15) {
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L93
            if (r15 != 0) goto L7
            goto L93
        L7:
            int r5 = r13.hash(r14)
            com.google.common.cache.LocalCache$Segment r9 = r13.segmentFor(r5)
            r9.lock()
            com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch: java.lang.Throwable -> L8b
            com.google.common.base.Ticker r1 = r1.ticker     // Catch: java.lang.Throwable -> L8b
            long r1 = r1.read()     // Catch: java.lang.Throwable -> L8b
            r9.runLockedCleanup(r1)     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r10 = r9.table     // Catch: java.lang.Throwable -> L8b
            int r1 = r10.length()     // Catch: java.lang.Throwable -> L8b
            r11 = 1
            int r1 = r1 - r11
            r12 = r1 & r5
            java.lang.Object r1 = r10.get(r12)     // Catch: java.lang.Throwable -> L8b
            r2 = r1
            com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch: java.lang.Throwable -> L8b
            r3 = r2
        L2f:
            if (r3 == 0) goto L84
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L8b
            int r1 = r3.getHash()     // Catch: java.lang.Throwable -> L8b
            if (r1 != r5) goto L7f
            if (r4 == 0) goto L7f
            com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch: java.lang.Throwable -> L8b
            com.google.common.base.Equivalence<java.lang.Object> r1 = r1.keyEquivalence     // Catch: java.lang.Throwable -> L8b
            boolean r1 = r1.equivalent(r14, r4)     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L7f
            com.google.common.cache.LocalCache$ValueReference r7 = r3.getValueReference()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L8b
            com.google.common.cache.LocalCache<K, V> r14 = r9.map     // Catch: java.lang.Throwable -> L8b
            com.google.common.base.Equivalence<java.lang.Object> r14 = r14.valueEquivalence     // Catch: java.lang.Throwable -> L8b
            boolean r14 = r14.equivalent(r15, r6)     // Catch: java.lang.Throwable -> L8b
            if (r14 == 0) goto L5c
            com.google.common.cache.RemovalCause r14 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L8b
            goto L66
        L5c:
            if (r6 != 0) goto L84
            boolean r14 = r7.isActive()     // Catch: java.lang.Throwable -> L8b
            if (r14 == 0) goto L84
            com.google.common.cache.RemovalCause r14 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L8b
        L66:
            int r15 = r9.modCount     // Catch: java.lang.Throwable -> L8b
            int r15 = r15 + r11
            r9.modCount = r15     // Catch: java.lang.Throwable -> L8b
            r1 = r9
            r8 = r14
            com.google.common.cache.ReferenceEntry r15 = r1.removeValueFromChain(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8b
            int r1 = r9.count     // Catch: java.lang.Throwable -> L8b
            int r1 = r1 - r11
            r10.set(r12, r15)     // Catch: java.lang.Throwable -> L8b
            r9.count = r1     // Catch: java.lang.Throwable -> L8b
            com.google.common.cache.RemovalCause r15 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L8b
            if (r14 != r15) goto L84
            r0 = 1
            goto L84
        L7f:
            com.google.common.cache.ReferenceEntry r3 = r3.getNext()     // Catch: java.lang.Throwable -> L8b
            goto L2f
        L84:
            r9.unlock()
            r9.runUnlockedCleanup()
            return r0
        L8b:
            r14 = move-exception
            r9.unlock()
            r9.runUnlockedCleanup()
            throw r14
        L93:
            return r0
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K r17, V r18) {
            r16 = this;
            r0 = r17
            com.google.common.base.Preconditions.checkNotNull(r17)
            com.google.common.base.Preconditions.checkNotNull(r18)
            int r4 = r16.hash(r17)
            r8 = r16
            com.google.common.cache.LocalCache$Segment r9 = r8.segmentFor(r4)
            r9.lock()
            com.google.common.cache.LocalCache<K, V> r1 = r9.map     // Catch: java.lang.Throwable -> La4
            com.google.common.base.Ticker r1 = r1.ticker     // Catch: java.lang.Throwable -> La4
            long r5 = r1.read()     // Catch: java.lang.Throwable -> La4
            r9.runLockedCleanup(r5)     // Catch: java.lang.Throwable -> La4
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r10 = r9.table     // Catch: java.lang.Throwable -> La4
            int r1 = r10.length()     // Catch: java.lang.Throwable -> La4
            int r1 = r1 + (-1)
            r11 = r4 & r1
            java.lang.Object r1 = r10.get(r11)     // Catch: java.lang.Throwable -> La4
            com.google.common.cache.ReferenceEntry r1 = (com.google.common.cache.ReferenceEntry) r1     // Catch: java.lang.Throwable -> La4
            r7 = r1
        L31:
            r12 = 0
            if (r7 == 0) goto L9d
            java.lang.Object r3 = r7.getKey()     // Catch: java.lang.Throwable -> La4
            int r2 = r7.getHash()     // Catch: java.lang.Throwable -> La4
            if (r2 != r4) goto L98
            if (r3 == 0) goto L98
            com.google.common.cache.LocalCache<K, V> r2 = r9.map     // Catch: java.lang.Throwable -> La4
            com.google.common.base.Equivalence<java.lang.Object> r2 = r2.keyEquivalence     // Catch: java.lang.Throwable -> La4
            boolean r2 = r2.equivalent(r0, r3)     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L98
            com.google.common.cache.LocalCache$ValueReference r13 = r7.getValueReference()     // Catch: java.lang.Throwable -> La4
            java.lang.Object r14 = r13.get()     // Catch: java.lang.Throwable -> La4
            if (r14 != 0) goto L75
            boolean r0 = r13.isActive()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L9d
            int r0 = r9.modCount     // Catch: java.lang.Throwable -> La4
            int r0 = r0 + 1
            r9.modCount = r0     // Catch: java.lang.Throwable -> La4
            com.google.common.cache.RemovalCause r15 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> La4
            r0 = r9
            r2 = r7
            r5 = r14
            r6 = r13
            r7 = r15
            com.google.common.cache.ReferenceEntry r0 = r0.removeValueFromChain(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La4
            int r1 = r9.count     // Catch: java.lang.Throwable -> La4
            int r1 = r1 + (-1)
            r10.set(r11, r0)     // Catch: java.lang.Throwable -> La4
            r9.count = r1     // Catch: java.lang.Throwable -> La4
            goto L9d
        L75:
            int r1 = r9.modCount     // Catch: java.lang.Throwable -> La4
            int r1 = r1 + 1
            r9.modCount = r1     // Catch: java.lang.Throwable -> La4
            int r1 = r13.getWeight()     // Catch: java.lang.Throwable -> La4
            com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> La4
            r9.enqueueNotification(r0, r14, r1, r2)     // Catch: java.lang.Throwable -> La4
            r1 = r9
            r2 = r7
            r3 = r17
            r4 = r18
            r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La4
            r9.evictEntries(r7)     // Catch: java.lang.Throwable -> La4
            r9.unlock()
            r9.runUnlockedCleanup()
            r12 = r14
            goto La3
        L98:
            com.google.common.cache.ReferenceEntry r7 = r7.getNext()     // Catch: java.lang.Throwable -> La4
            goto L31
        L9d:
            r9.unlock()
            r9.runUnlockedCleanup()
        La3:
            return r12
        La4:
            r0 = move-exception
            r9.unlock()
            r9.runUnlockedCleanup()
            throw r0
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K r17, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r18, V r19) {
            r16 = this;
            r0 = r17
            r1 = r18
            com.google.common.base.Preconditions.checkNotNull(r17)
            com.google.common.base.Preconditions.checkNotNull(r19)
            r2 = 0
            if (r1 != 0) goto Le
            return r2
        Le:
            int r7 = r16.hash(r17)
            r11 = r16
            com.google.common.cache.LocalCache$Segment r12 = r11.segmentFor(r7)
            r12.lock()
            com.google.common.cache.LocalCache<K, V> r3 = r12.map     // Catch: java.lang.Throwable -> Lb2
            com.google.common.base.Ticker r3 = r3.ticker     // Catch: java.lang.Throwable -> Lb2
            long r5 = r3.read()     // Catch: java.lang.Throwable -> Lb2
            r12.runLockedCleanup(r5)     // Catch: java.lang.Throwable -> Lb2
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r13 = r12.table     // Catch: java.lang.Throwable -> Lb2
            int r3 = r13.length()     // Catch: java.lang.Throwable -> Lb2
            int r3 = r3 + (-1)
            r14 = r7 & r3
            java.lang.Object r3 = r13.get(r14)     // Catch: java.lang.Throwable -> Lb2
            r4 = r3
            com.google.common.cache.ReferenceEntry r4 = (com.google.common.cache.ReferenceEntry) r4     // Catch: java.lang.Throwable -> Lb2
            r8 = r4
        L38:
            r9 = 1
            if (r8 == 0) goto Lb4
            java.lang.Object r10 = r8.getKey()     // Catch: java.lang.Throwable -> Lb2
            int r3 = r8.getHash()     // Catch: java.lang.Throwable -> Lb2
            if (r3 != r7) goto Lad
            if (r10 == 0) goto Lad
            com.google.common.cache.LocalCache<K, V> r3 = r12.map     // Catch: java.lang.Throwable -> Lb2
            com.google.common.base.Equivalence<java.lang.Object> r3 = r3.keyEquivalence     // Catch: java.lang.Throwable -> Lb2
            boolean r3 = r3.equivalent(r0, r10)     // Catch: java.lang.Throwable -> Lb2
            if (r3 == 0) goto Lad
            com.google.common.cache.LocalCache$ValueReference r15 = r8.getValueReference()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r3 = r15.get()     // Catch: java.lang.Throwable -> Lb2
            if (r3 != 0) goto L7d
            boolean r0 = r15.isActive()     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto Lb4
            int r0 = r12.modCount     // Catch: java.lang.Throwable -> Lb2
            int r0 = r0 + r9
            r12.modCount = r0     // Catch: java.lang.Throwable -> Lb2
            com.google.common.cache.RemovalCause r0 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> Lb2
            r1 = r3
            r3 = r12
            r5 = r8
            r6 = r10
            r8 = r1
            r9 = r15
            r10 = r0
            com.google.common.cache.ReferenceEntry r0 = r3.removeValueFromChain(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb2
            int r1 = r12.count     // Catch: java.lang.Throwable -> Lb2
            int r1 = r1 + (-1)
            r13.set(r14, r0)     // Catch: java.lang.Throwable -> Lb2
            r12.count = r1     // Catch: java.lang.Throwable -> Lb2
            goto Lb4
        L7d:
            com.google.common.cache.LocalCache<K, V> r4 = r12.map     // Catch: java.lang.Throwable -> Lb2
            com.google.common.base.Equivalence<java.lang.Object> r4 = r4.valueEquivalence     // Catch: java.lang.Throwable -> Lb2
            boolean r1 = r4.equivalent(r1, r3)     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto La9
            int r1 = r12.modCount     // Catch: java.lang.Throwable -> Lb2
            int r1 = r1 + r9
            r12.modCount = r1     // Catch: java.lang.Throwable -> Lb2
            int r1 = r15.getWeight()     // Catch: java.lang.Throwable -> Lb2
            com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> Lb2
            r12.enqueueNotification(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> Lb2
            r1 = r12
            r2 = r8
            r3 = r17
            r4 = r19
            r1.setValue(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb2
            r12.evictEntries(r8)     // Catch: java.lang.Throwable -> Lb2
            r12.unlock()
            r12.runUnlockedCleanup()
            r2 = 1
            goto Lba
        La9:
            r12.recordLockedRead(r8, r5)     // Catch: java.lang.Throwable -> Lb2
            goto Lb4
        Lad:
            com.google.common.cache.ReferenceEntry r8 = r8.getNext()     // Catch: java.lang.Throwable -> Lb2
            goto L38
        Lb2:
            r0 = move-exception
            goto Lbb
        Lb4:
            r12.unlock()
            r12.runUnlockedCleanup()
        Lba:
            return r2
        Lbb:
            r12.unlock()
            r12.runUnlockedCleanup()
            throw r0
    }

    public final com.google.common.cache.LocalCache.Segment<K, V> segmentFor(int r3) {
            r2 = this;
            com.google.common.cache.LocalCache$Segment<K, V>[] r0 = r2.segments
            int r1 = r2.segmentShift
            int r3 = r3 >>> r1
            int r1 = r2.segmentMask
            r3 = r3 & r1
            r3 = r0[r3]
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r2 = this;
            long r0 = r2.longSize()
            int r0 = com.google.common.primitives.Ints.saturatedCast(r0)
            return r0
    }

    public final boolean usesAccessQueue() {
            r1 = this;
            boolean r0 = r1.expiresAfterAccess()
            if (r0 != 0) goto Lf
            boolean r0 = r1.evictsBySize()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    public final boolean usesKeyReferences() {
            r2 = this;
            com.google.common.cache.LocalCache$Strength r0 = r2.keyStrength
            com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.STRONG
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final boolean usesValueReferences() {
            r2 = this;
            com.google.common.cache.LocalCache$Strength r0 = r2.valueStrength
            com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.STRONG
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection<V> r0 = r1.values
            if (r0 == 0) goto L5
            goto Lc
        L5:
            com.google.common.cache.LocalCache$Values r0 = new com.google.common.cache.LocalCache$Values
            r0.<init>(r1)
            r1.values = r0
        Lc:
            return r0
    }
}
