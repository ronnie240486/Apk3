package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultiset<E> extends com.google.common.collect.AbstractMultiset<E> implements java.io.Serializable {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;
    public transient com.google.common.collect.ObjectCountHashMap<E> backingMap;
    public transient long size;



    /* JADX INFO: loaded from: classes.dex */
    public abstract class Itr<T> implements java.util.Iterator<T> {
        public int entryIndex;
        public int expectedModCount;
        public final /* synthetic */ com.google.common.collect.AbstractMapBasedMultiset this$0;
        public int toRemove;

        public Itr(com.google.common.collect.AbstractMapBasedMultiset r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                com.google.common.collect.ObjectCountHashMap<E> r0 = r2.backingMap
                int r0 = r0.firstIndex()
                r1.entryIndex = r0
                r0 = -1
                r1.toRemove = r0
                com.google.common.collect.ObjectCountHashMap<E> r2 = r2.backingMap
                int r2 = r2.modCount
                r1.expectedModCount = r2
                return
        }

        private void checkForConcurrentModification() {
                r2 = this;
                com.google.common.collect.AbstractMapBasedMultiset r0 = r2.this$0
                com.google.common.collect.ObjectCountHashMap<E> r0 = r0.backingMap
                int r0 = r0.modCount
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
                int r0 = r1.entryIndex
                if (r0 < 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public T next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L1b
                int r0 = r3.entryIndex
                java.lang.Object r0 = r3.result(r0)
                int r1 = r3.entryIndex
                r3.toRemove = r1
                com.google.common.collect.AbstractMapBasedMultiset r2 = r3.this$0
                com.google.common.collect.ObjectCountHashMap<E> r2 = r2.backingMap
                int r1 = r2.nextIndex(r1)
                r3.entryIndex = r1
                return r0
            L1b:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r6 = this;
                r6.checkForConcurrentModification()
                int r0 = r6.toRemove
                r1 = -1
                if (r0 == r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                com.google.common.collect.CollectPreconditions.checkRemove(r0)
                com.google.common.collect.AbstractMapBasedMultiset r0 = r6.this$0
                long r2 = r0.size
                com.google.common.collect.ObjectCountHashMap<E> r4 = r0.backingMap
                int r5 = r6.toRemove
                int r4 = r4.removeEntry(r5)
                long r4 = (long) r4
                long r2 = r2 - r4
                r0.size = r2
                com.google.common.collect.AbstractMapBasedMultiset r0 = r6.this$0
                com.google.common.collect.ObjectCountHashMap<E> r0 = r0.backingMap
                int r2 = r6.entryIndex
                int r3 = r6.toRemove
                int r0 = r0.nextIndexAfterRemove(r2, r3)
                r6.entryIndex = r0
                r6.toRemove = r1
                com.google.common.collect.AbstractMapBasedMultiset r0 = r6.this$0
                com.google.common.collect.ObjectCountHashMap<E> r0 = r0.backingMap
                int r0 = r0.modCount
                r6.expectedModCount = r0
                return
        }

        @com.google.common.collect.ParametricNullness
        public abstract T result(int r1);
    }

    public AbstractMapBasedMultiset(int r1) {
            r0 = this;
            r0.<init>()
            com.google.common.collect.ObjectCountHashMap r1 = r0.newBackingMap(r1)
            r0.backingMap = r1
            return
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r5) throws java.io.IOException, java.lang.ClassNotFoundException {
            r4 = this;
            r5.defaultReadObject()
            int r0 = r5.readInt()
            r1 = 3
            com.google.common.collect.ObjectCountHashMap r1 = r4.newBackingMap(r1)
            r4.backingMap = r1
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            java.lang.Object r2 = r5.readObject()
            int r3 = r5.readInt()
            r4.add(r2, r3)
            int r1 = r1 + 1
            goto Lf
        L1f:
            return
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r1) throws java.io.IOException {
            r0 = this;
            r1.defaultWriteObject()
            com.google.common.collect.Serialization.writeMultiset(r0, r1)
            return
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final int add(@com.google.common.collect.ParametricNullness E r10, int r11) {
            r9 = this;
            if (r11 != 0) goto L7
            int r10 = r9.count(r10)
            return r10
        L7:
            r0 = 1
            r1 = 0
            if (r11 <= 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            java.lang.String r3 = "occurrences cannot be negative: %s"
            com.google.common.base.Preconditions.checkArgument(r2, r3, r11)
            com.google.common.collect.ObjectCountHashMap<E> r2 = r9.backingMap
            int r2 = r2.indexOf(r10)
            r3 = -1
            if (r2 != r3) goto L28
            com.google.common.collect.ObjectCountHashMap<E> r0 = r9.backingMap
            r0.put(r10, r11)
            long r2 = r9.size
            long r10 = (long) r11
            long r2 = r2 + r10
            r9.size = r2
            return r1
        L28:
            com.google.common.collect.ObjectCountHashMap<E> r10 = r9.backingMap
            int r10 = r10.getValue(r2)
            long r3 = (long) r10
            long r5 = (long) r11
            long r3 = r3 + r5
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 > 0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            java.lang.String r11 = "too many occurrences: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r11, r3)
            com.google.common.collect.ObjectCountHashMap<E> r11 = r9.backingMap
            int r0 = (int) r3
            r11.setValue(r2, r0)
            long r0 = r9.size
            long r0 = r0 + r5
            r9.size = r0
            return r10
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r2 = this;
            com.google.common.collect.ObjectCountHashMap<E> r0 = r2.backingMap
            r0.clear()
            r0 = 0
            r2.size = r0
            return
    }

    @Override // com.google.common.collect.Multiset
    public final int count(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ObjectCountHashMap<E> r0 = r1.backingMap
            int r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int distinctElements() {
            r1 = this;
            com.google.common.collect.ObjectCountHashMap<E> r0 = r1.backingMap
            int r0 = r0.size
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final java.util.Iterator<E> elementIterator() {
            r1 = this;
            com.google.common.collect.AbstractMapBasedMultiset$1 r0 = new com.google.common.collect.AbstractMapBasedMultiset$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
            r1 = this;
            com.google.common.collect.AbstractMapBasedMultiset$2 r0 = new com.google.common.collect.AbstractMapBasedMultiset$2
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final java.util.Iterator<E> iterator() {
            r1 = this;
            java.util.Iterator r0 = com.google.common.collect.Multisets.iteratorImpl(r1)
            return r0
    }

    public abstract com.google.common.collect.ObjectCountHashMap<E> newBackingMap(int r1);

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final int remove(@javax.annotation.CheckForNull java.lang.Object r4, int r5) {
            r3 = this;
            if (r5 != 0) goto L7
            int r4 = r3.count(r4)
            return r4
        L7:
            r0 = 0
            if (r5 <= 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            java.lang.String r2 = "occurrences cannot be negative: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r5)
            com.google.common.collect.ObjectCountHashMap<E> r1 = r3.backingMap
            int r4 = r1.indexOf(r4)
            r1 = -1
            if (r4 != r1) goto L1c
            return r0
        L1c:
            com.google.common.collect.ObjectCountHashMap<E> r0 = r3.backingMap
            int r0 = r0.getValue(r4)
            if (r0 <= r5) goto L2c
            com.google.common.collect.ObjectCountHashMap<E> r1 = r3.backingMap
            int r2 = r0 - r5
            r1.setValue(r4, r2)
            goto L32
        L2c:
            com.google.common.collect.ObjectCountHashMap<E> r5 = r3.backingMap
            r5.removeEntry(r4)
            r5 = r0
        L32:
            long r1 = r3.size
            long r4 = (long) r5
            long r1 = r1 - r4
            r3.size = r1
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final int setCount(@com.google.common.collect.ParametricNullness E r5, int r6) {
            r4 = this;
            java.lang.String r0 = "count"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
            com.google.common.collect.ObjectCountHashMap<E> r0 = r4.backingMap
            if (r6 != 0) goto Le
            int r5 = r0.remove(r5)
            goto L12
        Le:
            int r5 = r0.put(r5, r6)
        L12:
            long r0 = r4.size
            int r6 = r6 - r5
            long r2 = (long) r6
            long r0 = r0 + r2
            r4.size = r0
            return r5
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(@com.google.common.collect.ParametricNullness E r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "oldCount"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
            java.lang.String r0 = "newCount"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r7, r0)
            com.google.common.collect.ObjectCountHashMap<E> r0 = r4.backingMap
            int r0 = r0.indexOf(r5)
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L26
            if (r6 == 0) goto L18
            return r2
        L18:
            if (r7 <= 0) goto L25
            com.google.common.collect.ObjectCountHashMap<E> r6 = r4.backingMap
            r6.put(r5, r7)
            long r5 = r4.size
            long r2 = (long) r7
            long r5 = r5 + r2
            r4.size = r5
        L25:
            return r1
        L26:
            com.google.common.collect.ObjectCountHashMap<E> r5 = r4.backingMap
            int r5 = r5.getValue(r0)
            if (r5 == r6) goto L2f
            return r2
        L2f:
            if (r7 != 0) goto L3d
            com.google.common.collect.ObjectCountHashMap<E> r5 = r4.backingMap
            r5.removeEntry(r0)
            long r2 = r4.size
            long r5 = (long) r6
            long r2 = r2 - r5
            r4.size = r2
            goto L49
        L3d:
            com.google.common.collect.ObjectCountHashMap<E> r5 = r4.backingMap
            r5.setValue(r0, r7)
            long r2 = r4.size
            int r7 = r7 - r6
            long r5 = (long) r7
            long r2 = r2 + r5
            r4.size = r2
        L49:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
            r2 = this;
            long r0 = r2.size
            int r0 = com.google.common.primitives.Ints.saturatedCast(r0)
            return r0
    }
}
