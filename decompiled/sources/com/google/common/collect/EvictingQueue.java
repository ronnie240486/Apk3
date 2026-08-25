package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class EvictingQueue<E> extends com.google.common.collect.ForwardingQueue<E> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.util.Queue<E> delegate;

    @com.google.common.annotations.VisibleForTesting
    public final int maxSize;

    private EvictingQueue(int r3) {
            r2 = this;
            r2.<init>()
            if (r3 < 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "maxSize (%s) must >= 0"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>(r3)
            r2.delegate = r0
            r2.maxSize = r3
            return
    }

    public static <E> com.google.common.collect.EvictingQueue<E> create(int r1) {
            com.google.common.collect.EvictingQueue r0 = new com.google.common.collect.EvictingQueue
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean add(E r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            int r0 = r3.maxSize
            r1 = 1
            if (r0 != 0) goto L9
            return r1
        L9:
            int r0 = r3.size()
            int r2 = r3.maxSize
            if (r0 != r2) goto L16
            java.util.Queue<E> r0 = r3.delegate
            r0.remove()
        L16:
            java.util.Queue<E> r0 = r3.delegate
            r0.add(r4)
            return r1
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean addAll(java.util.Collection<? extends E> r3) {
            r2 = this;
            int r0 = r3.size()
            int r1 = r2.maxSize
            if (r0 < r1) goto L17
            r2.clear()
            int r1 = r2.maxSize
            int r0 = r0 - r1
            java.lang.Iterable r3 = com.google.common.collect.Iterables.skip(r3, r0)
            boolean r3 = com.google.common.collect.Iterables.addAll(r2, r3)
            return r3
        L17:
            java.util.Iterator r3 = r3.iterator()
            boolean r3 = com.google.common.collect.Iterators.addAll(r2, r3)
            return r3
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final java.lang.Object delegate() {
            r1 = this;
            java.util.Queue<E> r0 = r1.delegate
            return r0
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final java.util.Collection delegate() {
            r1 = this;
            java.util.Queue<E> r0 = r1.delegate
            return r0
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final java.util.Queue<E> delegate() {
            r1 = this;
            java.util.Queue<E> r0 = r1.delegate
            return r0
    }

    @Override // com.google.common.collect.ForwardingQueue, java.util.Queue
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean offer(E r1) {
            r0 = this;
            boolean r1 = r0.add(r1)
            return r1
    }

    public int remainingCapacity() {
            r2 = this;
            int r0 = r2.maxSize
            int r1 = r2.size()
            int r0 = r0 - r1
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = super.toArray()
            return r0
    }
}
