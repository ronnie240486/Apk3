package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class MinMaxPriorityQueue<E> extends java.util.AbstractQueue<E> {
    private static final int DEFAULT_CAPACITY = 11;
    private static final int EVEN_POWERS_OF_TWO = 1431655765;
    private static final int ODD_POWERS_OF_TWO = -1431655766;
    private final com.google.common.collect.MinMaxPriorityQueue<E>.Heap maxHeap;

    @com.google.common.annotations.VisibleForTesting
    public final int maximumSize;
    private final com.google.common.collect.MinMaxPriorityQueue<E>.Heap minHeap;
    private int modCount;
    private java.lang.Object[] queue;
    private int size;

    /* JADX INFO: renamed from: com.google.common.collect.MinMaxPriorityQueue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @com.google.common.annotations.Beta
    public static final class Builder<B> {
        private static final int UNSET_EXPECTED_SIZE = -1;
        private final java.util.Comparator<B> comparator;
        private int expectedSize;
        private int maximumSize;

        private Builder(java.util.Comparator<B> r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.expectedSize = r0
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.maximumSize = r0
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.Comparator r2 = (java.util.Comparator) r2
                r1.comparator = r2
                return
        }

        public /* synthetic */ Builder(java.util.Comparator r1, com.google.common.collect.MinMaxPriorityQueue.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ com.google.common.collect.Ordering access$200(com.google.common.collect.MinMaxPriorityQueue.Builder r0) {
                com.google.common.collect.Ordering r0 = r0.ordering()
                return r0
        }

        public static /* synthetic */ int access$300(com.google.common.collect.MinMaxPriorityQueue.Builder r0) {
                int r0 = r0.maximumSize
                return r0
        }

        private <T extends B> com.google.common.collect.Ordering<T> ordering() {
                r1 = this;
                java.util.Comparator<B> r0 = r1.comparator
                com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.from(r0)
                return r0
        }

        public <T extends B> com.google.common.collect.MinMaxPriorityQueue<T> create() {
                r1 = this;
                java.util.Set r0 = java.util.Collections.emptySet()
                com.google.common.collect.MinMaxPriorityQueue r0 = r1.create(r0)
                return r0
        }

        public <T extends B> com.google.common.collect.MinMaxPriorityQueue<T> create(java.lang.Iterable<? extends T> r4) {
                r3 = this;
                com.google.common.collect.MinMaxPriorityQueue r0 = new com.google.common.collect.MinMaxPriorityQueue
                int r1 = r3.expectedSize
                int r2 = r3.maximumSize
                int r1 = com.google.common.collect.MinMaxPriorityQueue.initialQueueSize(r1, r2, r4)
                r2 = 0
                r0.<init>(r3, r1, r2)
                java.util.Iterator r4 = r4.iterator()
            L12:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r4.next()
                r0.offer(r1)
                goto L12
            L20:
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.MinMaxPriorityQueue.Builder<B> expectedSize(int r2) {
                r1 = this;
                if (r2 < 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                com.google.common.base.Preconditions.checkArgument(r0)
                r1.expectedSize = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.MinMaxPriorityQueue.Builder<B> maximumSize(int r2) {
                r1 = this;
                if (r2 <= 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                com.google.common.base.Preconditions.checkArgument(r0)
                r1.maximumSize = r2
                return r1
        }
    }

    public class Heap {
        public final com.google.common.collect.Ordering<E> ordering;

        @com.google.j2objc.annotations.Weak
        public com.google.common.collect.MinMaxPriorityQueue<E>.Heap otherHeap;
        public final /* synthetic */ com.google.common.collect.MinMaxPriorityQueue this$0;

        public Heap(com.google.common.collect.MinMaxPriorityQueue r1, com.google.common.collect.Ordering<E> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.ordering = r2
                return
        }

        private int getGrandparentIndex(int r1) {
                r0 = this;
                int r1 = r0.getParentIndex(r1)
                int r1 = r0.getParentIndex(r1)
                return r1
        }

        private int getLeftChildIndex(int r1) {
                r0 = this;
                int r1 = r1 * 2
                int r1 = r1 + 1
                return r1
        }

        private int getParentIndex(int r1) {
                r0 = this;
                int r1 = r1 + (-1)
                int r1 = r1 / 2
                return r1
        }

        private int getRightChildIndex(int r1) {
                r0 = this;
                int r1 = r1 * 2
                int r1 = r1 + 2
                return r1
        }

        private boolean verifyIndex(int r4) {
                r3 = this;
                int r0 = r3.getLeftChildIndex(r4)
                com.google.common.collect.MinMaxPriorityQueue r1 = r3.this$0
                int r1 = com.google.common.collect.MinMaxPriorityQueue.access$600(r1)
                r2 = 0
                if (r0 >= r1) goto L18
                int r0 = r3.getLeftChildIndex(r4)
                int r0 = r3.compareElements(r4, r0)
                if (r0 <= 0) goto L18
                return r2
            L18:
                int r0 = r3.getRightChildIndex(r4)
                com.google.common.collect.MinMaxPriorityQueue r1 = r3.this$0
                int r1 = com.google.common.collect.MinMaxPriorityQueue.access$600(r1)
                if (r0 >= r1) goto L2f
                int r0 = r3.getRightChildIndex(r4)
                int r0 = r3.compareElements(r4, r0)
                if (r0 <= 0) goto L2f
                return r2
            L2f:
                if (r4 <= 0) goto L3c
                int r0 = r3.getParentIndex(r4)
                int r0 = r3.compareElements(r4, r0)
                if (r0 <= 0) goto L3c
                return r2
            L3c:
                r0 = 2
                if (r4 <= r0) goto L4a
                int r0 = r3.getGrandparentIndex(r4)
                int r4 = r3.compareElements(r0, r4)
                if (r4 <= 0) goto L4a
                return r2
            L4a:
                r4 = 1
                return r4
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public final int bubbleUpAlternatingLevels(int r4, E r5) {
                r3 = this;
            L0:
                r0 = 2
                if (r4 <= r0) goto L20
                int r0 = r3.getGrandparentIndex(r4)
                com.google.common.collect.MinMaxPriorityQueue r1 = r3.this$0
                java.lang.Object r1 = r1.elementData(r0)
                com.google.common.collect.Ordering<E> r2 = r3.ordering
                int r2 = r2.compare(r1, r5)
                if (r2 > 0) goto L16
                goto L20
            L16:
                com.google.common.collect.MinMaxPriorityQueue r2 = r3.this$0
                java.lang.Object[] r2 = com.google.common.collect.MinMaxPriorityQueue.access$500(r2)
                r2[r4] = r1
                r4 = r0
                goto L0
            L20:
                com.google.common.collect.MinMaxPriorityQueue r0 = r3.this$0
                java.lang.Object[] r0 = com.google.common.collect.MinMaxPriorityQueue.access$500(r0)
                r0[r4] = r5
                return r4
        }

        public final int compareElements(int r3, int r4) {
                r2 = this;
                com.google.common.collect.Ordering<E> r0 = r2.ordering
                com.google.common.collect.MinMaxPriorityQueue r1 = r2.this$0
                java.lang.Object r3 = r1.elementData(r3)
                com.google.common.collect.MinMaxPriorityQueue r1 = r2.this$0
                java.lang.Object r4 = r1.elementData(r4)
                int r3 = r0.compare(r3, r4)
                return r3
        }

        public final int crossOverUp(int r6, E r7) {
                r5 = this;
                if (r6 != 0) goto Lc
                com.google.common.collect.MinMaxPriorityQueue r6 = r5.this$0
                java.lang.Object[] r6 = com.google.common.collect.MinMaxPriorityQueue.access$500(r6)
                r0 = 0
                r6[r0] = r7
                return r0
            Lc:
                int r0 = r5.getParentIndex(r6)
                com.google.common.collect.MinMaxPriorityQueue r1 = r5.this$0
                java.lang.Object r1 = r1.elementData(r0)
                if (r0 == 0) goto L3e
                int r2 = r5.getParentIndex(r0)
                int r2 = r5.getRightChildIndex(r2)
                if (r2 == r0) goto L3e
                int r3 = r5.getLeftChildIndex(r2)
                com.google.common.collect.MinMaxPriorityQueue r4 = r5.this$0
                int r4 = com.google.common.collect.MinMaxPriorityQueue.access$600(r4)
                if (r3 < r4) goto L3e
                com.google.common.collect.MinMaxPriorityQueue r3 = r5.this$0
                java.lang.Object r3 = r3.elementData(r2)
                com.google.common.collect.Ordering<E> r4 = r5.ordering
                int r4 = r4.compare(r3, r1)
                if (r4 >= 0) goto L3e
                r0 = r2
                r1 = r3
            L3e:
                com.google.common.collect.Ordering<E> r2 = r5.ordering
                int r2 = r2.compare(r1, r7)
                if (r2 >= 0) goto L57
                com.google.common.collect.MinMaxPriorityQueue r2 = r5.this$0
                java.lang.Object[] r2 = com.google.common.collect.MinMaxPriorityQueue.access$500(r2)
                r2[r6] = r1
                com.google.common.collect.MinMaxPriorityQueue r6 = r5.this$0
                java.lang.Object[] r6 = com.google.common.collect.MinMaxPriorityQueue.access$500(r6)
                r6[r0] = r7
                return r0
            L57:
                com.google.common.collect.MinMaxPriorityQueue r0 = r5.this$0
                java.lang.Object[] r0 = com.google.common.collect.MinMaxPriorityQueue.access$500(r0)
                r0[r6] = r7
                return r6
        }

        public final int fillHoleAt(int r4) {
                r3 = this;
            L0:
                int r0 = r3.getLeftChildIndex(r4)
                if (r0 >= 0) goto L8
                r0 = -1
                goto L11
            L8:
                int r0 = r3.getLeftChildIndex(r0)
                r1 = 4
                int r0 = r3.findMin(r0, r1)
            L11:
                if (r0 <= 0) goto L23
                com.google.common.collect.MinMaxPriorityQueue r1 = r3.this$0
                java.lang.Object[] r1 = com.google.common.collect.MinMaxPriorityQueue.access$500(r1)
                com.google.common.collect.MinMaxPriorityQueue r2 = r3.this$0
                java.lang.Object r2 = r2.elementData(r0)
                r1[r4] = r2
                r4 = r0
                goto L0
            L23:
                return r4
        }

        public final int findMin(int r3, int r4) {
                r2 = this;
                com.google.common.collect.MinMaxPriorityQueue r0 = r2.this$0
                int r0 = com.google.common.collect.MinMaxPriorityQueue.access$600(r0)
                if (r3 < r0) goto La
                r3 = -1
                return r3
            La:
                if (r3 <= 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                com.google.common.base.Preconditions.checkState(r0)
                com.google.common.collect.MinMaxPriorityQueue r0 = r2.this$0
                int r0 = com.google.common.collect.MinMaxPriorityQueue.access$600(r0)
                int r0 = r0 - r4
                int r0 = java.lang.Math.min(r3, r0)
                int r0 = r0 + r4
                int r4 = r3 + 1
            L20:
                if (r4 >= r0) goto L2c
                int r1 = r2.compareElements(r4, r3)
                if (r1 >= 0) goto L29
                r3 = r4
            L29:
                int r4 = r4 + 1
                goto L20
            L2c:
                return r3
        }

        public final int swapWithConceptuallyLastElement(E r4) {
                r3 = this;
                com.google.common.collect.MinMaxPriorityQueue r0 = r3.this$0
                int r0 = com.google.common.collect.MinMaxPriorityQueue.access$600(r0)
                int r0 = r3.getParentIndex(r0)
                if (r0 == 0) goto L47
                int r1 = r3.getParentIndex(r0)
                int r1 = r3.getRightChildIndex(r1)
                if (r1 == r0) goto L47
                int r0 = r3.getLeftChildIndex(r1)
                com.google.common.collect.MinMaxPriorityQueue r2 = r3.this$0
                int r2 = com.google.common.collect.MinMaxPriorityQueue.access$600(r2)
                if (r0 < r2) goto L47
                com.google.common.collect.MinMaxPriorityQueue r0 = r3.this$0
                java.lang.Object r0 = r0.elementData(r1)
                com.google.common.collect.Ordering<E> r2 = r3.ordering
                int r2 = r2.compare(r0, r4)
                if (r2 >= 0) goto L47
                com.google.common.collect.MinMaxPriorityQueue r2 = r3.this$0
                java.lang.Object[] r2 = com.google.common.collect.MinMaxPriorityQueue.access$500(r2)
                r2[r1] = r4
                com.google.common.collect.MinMaxPriorityQueue r4 = r3.this$0
                java.lang.Object[] r4 = com.google.common.collect.MinMaxPriorityQueue.access$500(r4)
                com.google.common.collect.MinMaxPriorityQueue r2 = r3.this$0
                int r2 = com.google.common.collect.MinMaxPriorityQueue.access$600(r2)
                r4[r2] = r0
                return r1
            L47:
                com.google.common.collect.MinMaxPriorityQueue r4 = r3.this$0
                int r4 = com.google.common.collect.MinMaxPriorityQueue.access$600(r4)
                return r4
        }

        @javax.annotation.CheckForNull
        public final com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> tryCrossOverAndBubbleUp(int r4, int r5, E r6) {
                r3 = this;
                int r0 = r3.getLeftChildIndex(r5)
                r1 = 2
                int r0 = r3.findMin(r0, r1)
                if (r0 <= 0) goto L30
                com.google.common.collect.Ordering<E> r1 = r3.ordering
                com.google.common.collect.MinMaxPriorityQueue r2 = r3.this$0
                java.lang.Object r2 = r2.elementData(r0)
                int r1 = r1.compare(r2, r6)
                if (r1 >= 0) goto L30
                com.google.common.collect.MinMaxPriorityQueue r1 = r3.this$0
                java.lang.Object[] r1 = com.google.common.collect.MinMaxPriorityQueue.access$500(r1)
                com.google.common.collect.MinMaxPriorityQueue r2 = r3.this$0
                java.lang.Object r2 = r2.elementData(r0)
                r1[r5] = r2
                com.google.common.collect.MinMaxPriorityQueue r1 = r3.this$0
                java.lang.Object[] r1 = com.google.common.collect.MinMaxPriorityQueue.access$500(r1)
                r1[r0] = r6
                goto L34
            L30:
                int r0 = r3.crossOverUp(r5, r6)
            L34:
                r1 = 0
                if (r0 != r5) goto L38
                return r1
            L38:
                if (r0 >= r4) goto L41
                com.google.common.collect.MinMaxPriorityQueue r5 = r3.this$0
                java.lang.Object r5 = r5.elementData(r4)
                goto L4b
            L41:
                com.google.common.collect.MinMaxPriorityQueue r5 = r3.this$0
                int r2 = r3.getParentIndex(r4)
                java.lang.Object r5 = r5.elementData(r2)
            L4b:
                com.google.common.collect.MinMaxPriorityQueue<E>$Heap r2 = r3.otherHeap
                int r0 = r2.bubbleUpAlternatingLevels(r0, r6)
                if (r0 >= r4) goto L59
                com.google.common.collect.MinMaxPriorityQueue$MoveDesc r4 = new com.google.common.collect.MinMaxPriorityQueue$MoveDesc
                r4.<init>(r6, r5)
                return r4
            L59:
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class MoveDesc<E> {
        public final E replaced;
        public final E toTrickle;

        public MoveDesc(E r1, E r2) {
                r0 = this;
                r0.<init>()
                r0.toTrickle = r1
                r0.replaced = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class QueueIterator implements java.util.Iterator<E> {
        private boolean canRemove;
        private int cursor;
        private int expectedModCount;

        @javax.annotation.CheckForNull
        private java.util.Queue<E> forgetMeNot;

        @javax.annotation.CheckForNull
        private E lastFromForgetMeNot;
        private int nextCursor;

        @javax.annotation.CheckForNull
        private java.util.List<E> skipMe;
        public final /* synthetic */ com.google.common.collect.MinMaxPriorityQueue this$0;

        private QueueIterator(com.google.common.collect.MinMaxPriorityQueue r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = -1
                r1.cursor = r0
                r1.nextCursor = r0
                int r2 = com.google.common.collect.MinMaxPriorityQueue.access$700(r2)
                r1.expectedModCount = r2
                return
        }

        public /* synthetic */ QueueIterator(com.google.common.collect.MinMaxPriorityQueue r1, com.google.common.collect.MinMaxPriorityQueue.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void checkModCount() {
                r2 = this;
                com.google.common.collect.MinMaxPriorityQueue r0 = r2.this$0
                int r0 = com.google.common.collect.MinMaxPriorityQueue.access$700(r0)
                int r1 = r2.expectedModCount
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        private boolean foundAndRemovedExactReference(java.lang.Iterable<E> r2, E r3) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L15
                java.lang.Object r0 = r2.next()
                if (r0 != r3) goto L4
                r2.remove()
                r2 = 1
                return r2
            L15:
                r2 = 0
                return r2
        }

        private void nextNotInSkipMe(int r3) {
                r2 = this;
                int r0 = r2.nextCursor
                if (r0 >= r3) goto L23
                java.util.List<E> r0 = r2.skipMe
                if (r0 == 0) goto L21
            L8:
                com.google.common.collect.MinMaxPriorityQueue r0 = r2.this$0
                int r0 = r0.size()
                if (r3 >= r0) goto L21
                java.util.List<E> r0 = r2.skipMe
                com.google.common.collect.MinMaxPriorityQueue r1 = r2.this$0
                java.lang.Object r1 = r1.elementData(r3)
                boolean r0 = r2.foundAndRemovedExactReference(r0, r1)
                if (r0 == 0) goto L21
                int r3 = r3 + 1
                goto L8
            L21:
                r2.nextCursor = r3
            L23:
                return
        }

        private boolean removeExact(java.lang.Object r4) {
                r3 = this;
                r0 = 0
                r1 = 0
            L2:
                com.google.common.collect.MinMaxPriorityQueue r2 = r3.this$0
                int r2 = com.google.common.collect.MinMaxPriorityQueue.access$600(r2)
                if (r1 >= r2) goto L1e
                com.google.common.collect.MinMaxPriorityQueue r2 = r3.this$0
                java.lang.Object[] r2 = com.google.common.collect.MinMaxPriorityQueue.access$500(r2)
                r2 = r2[r1]
                if (r2 != r4) goto L1b
                com.google.common.collect.MinMaxPriorityQueue r4 = r3.this$0
                r4.removeAt(r1)
                r4 = 1
                return r4
            L1b:
                int r1 = r1 + 1
                goto L2
            L1e:
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                r3.checkModCount()
                int r0 = r3.cursor
                r1 = 1
                int r0 = r0 + r1
                r3.nextNotInSkipMe(r0)
                int r0 = r3.nextCursor
                com.google.common.collect.MinMaxPriorityQueue r2 = r3.this$0
                int r2 = r2.size()
                if (r0 < r2) goto L20
                java.util.Queue<E> r0 = r3.forgetMeNot
                if (r0 == 0) goto L1f
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L1f
                goto L20
            L1f:
                r1 = 0
            L20:
                return r1
        }

        @Override // java.util.Iterator
        public E next() {
                r3 = this;
                r3.checkModCount()
                int r0 = r3.cursor
                r1 = 1
                int r0 = r0 + r1
                r3.nextNotInSkipMe(r0)
                int r0 = r3.nextCursor
                com.google.common.collect.MinMaxPriorityQueue r2 = r3.this$0
                int r2 = r2.size()
                if (r0 >= r2) goto L21
                int r0 = r3.nextCursor
                r3.cursor = r0
                r3.canRemove = r1
                com.google.common.collect.MinMaxPriorityQueue r1 = r3.this$0
                java.lang.Object r0 = r1.elementData(r0)
                return r0
            L21:
                java.util.Queue<E> r0 = r3.forgetMeNot
                if (r0 == 0) goto L3a
                com.google.common.collect.MinMaxPriorityQueue r0 = r3.this$0
                int r0 = r0.size()
                r3.cursor = r0
                java.util.Queue<E> r0 = r3.forgetMeNot
                java.lang.Object r0 = r0.poll()
                r3.lastFromForgetMeNot = r0
                if (r0 == 0) goto L3a
                r3.canRemove = r1
                return r0
            L3a:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "iterator moved past last element in queue."
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                boolean r0 = r3.canRemove
                com.google.common.collect.CollectPreconditions.checkRemove(r0)
                r3.checkModCount()
                r0 = 0
                r3.canRemove = r0
                int r0 = r3.expectedModCount
                int r0 = r0 + 1
                r3.expectedModCount = r0
                int r0 = r3.cursor
                com.google.common.collect.MinMaxPriorityQueue r1 = r3.this$0
                int r1 = r1.size()
                if (r0 >= r1) goto L6b
                com.google.common.collect.MinMaxPriorityQueue r0 = r3.this$0
                int r1 = r3.cursor
                com.google.common.collect.MinMaxPriorityQueue$MoveDesc r0 = r0.removeAt(r1)
                if (r0 == 0) goto L5e
                java.util.Queue<E> r1 = r3.forgetMeNot
                if (r1 == 0) goto L2d
                java.util.List<E> r1 = r3.skipMe
                if (r1 != 0) goto L3c
            L2d:
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r3.forgetMeNot = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 3
                r1.<init>(r2)
                r3.skipMe = r1
            L3c:
                java.util.List<E> r1 = r3.skipMe
                E r2 = r0.toTrickle
                boolean r1 = r3.foundAndRemovedExactReference(r1, r2)
                if (r1 != 0) goto L4d
                java.util.Queue<E> r1 = r3.forgetMeNot
                E r2 = r0.toTrickle
                r1.add(r2)
            L4d:
                java.util.Queue<E> r1 = r3.forgetMeNot
                E r2 = r0.replaced
                boolean r1 = r3.foundAndRemovedExactReference(r1, r2)
                if (r1 != 0) goto L5e
                java.util.List<E> r1 = r3.skipMe
                E r0 = r0.replaced
                r1.add(r0)
            L5e:
                int r0 = r3.cursor
                int r0 = r0 + (-1)
                r3.cursor = r0
                int r0 = r3.nextCursor
                int r0 = r0 + (-1)
                r3.nextCursor = r0
                goto L7a
            L6b:
                E r0 = r3.lastFromForgetMeNot
                java.util.Objects.requireNonNull(r0)
                boolean r0 = r3.removeExact(r0)
                com.google.common.base.Preconditions.checkState(r0)
                r0 = 0
                r3.lastFromForgetMeNot = r0
            L7a:
                return
        }
    }

    private MinMaxPriorityQueue(com.google.common.collect.MinMaxPriorityQueue.Builder<? super E> r4, int r5) {
            r3 = this;
            r3.<init>()
            com.google.common.collect.Ordering r0 = com.google.common.collect.MinMaxPriorityQueue.Builder.access$200(r4)
            com.google.common.collect.MinMaxPriorityQueue$Heap r1 = new com.google.common.collect.MinMaxPriorityQueue$Heap
            r1.<init>(r3, r0)
            r3.minHeap = r1
            com.google.common.collect.MinMaxPriorityQueue$Heap r2 = new com.google.common.collect.MinMaxPriorityQueue$Heap
            com.google.common.collect.Ordering r0 = r0.reverse()
            r2.<init>(r3, r0)
            r3.maxHeap = r2
            r1.otherHeap = r2
            r2.otherHeap = r1
            int r4 = com.google.common.collect.MinMaxPriorityQueue.Builder.access$300(r4)
            r3.maximumSize = r4
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r3.queue = r4
            return
    }

    public /* synthetic */ MinMaxPriorityQueue(com.google.common.collect.MinMaxPriorityQueue.Builder r1, int r2, com.google.common.collect.MinMaxPriorityQueue.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ java.lang.Object[] access$500(com.google.common.collect.MinMaxPriorityQueue r0) {
            java.lang.Object[] r0 = r0.queue
            return r0
    }

    public static /* synthetic */ int access$600(com.google.common.collect.MinMaxPriorityQueue r0) {
            int r0 = r0.size
            return r0
    }

    public static /* synthetic */ int access$700(com.google.common.collect.MinMaxPriorityQueue r0) {
            int r0 = r0.modCount
            return r0
    }

    private int calculateNewCapacity() {
            r2 = this;
            java.lang.Object[] r0 = r2.queue
            int r0 = r0.length
            r1 = 64
            if (r0 >= r1) goto Lc
            int r0 = r0 + 1
            int r0 = r0 * 2
            goto L13
        Lc:
            int r0 = r0 / 2
            r1 = 3
            int r0 = com.google.common.math.IntMath.checkedMultiply(r0, r1)
        L13:
            int r1 = r2.maximumSize
            int r0 = capAtMaximumSize(r0, r1)
            return r0
    }

    private static int capAtMaximumSize(int r0, int r1) {
            int r0 = r0 + (-1)
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 + 1
            return r0
    }

    public static <E extends java.lang.Comparable<E>> com.google.common.collect.MinMaxPriorityQueue<E> create() {
            com.google.common.collect.MinMaxPriorityQueue$Builder r0 = new com.google.common.collect.MinMaxPriorityQueue$Builder
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.collect.MinMaxPriorityQueue r0 = r0.create()
            return r0
    }

    public static <E extends java.lang.Comparable<E>> com.google.common.collect.MinMaxPriorityQueue<E> create(java.lang.Iterable<? extends E> r3) {
            com.google.common.collect.MinMaxPriorityQueue$Builder r0 = new com.google.common.collect.MinMaxPriorityQueue$Builder
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.collect.MinMaxPriorityQueue r3 = r0.create(r3)
            return r3
    }

    public static com.google.common.collect.MinMaxPriorityQueue.Builder<java.lang.Comparable> expectedSize(int r3) {
            com.google.common.collect.MinMaxPriorityQueue$Builder r0 = new com.google.common.collect.MinMaxPriorityQueue$Builder
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.collect.MinMaxPriorityQueue$Builder r3 = r0.expectedSize(r3)
            return r3
    }

    @javax.annotation.CheckForNull
    private com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> fillHole(int r4, E r5) {
            r3 = this;
            com.google.common.collect.MinMaxPriorityQueue$Heap r0 = r3.heapForIndex(r4)
            int r1 = r0.fillHoleAt(r4)
            int r2 = r0.bubbleUpAlternatingLevels(r1, r5)
            if (r2 != r1) goto L13
            com.google.common.collect.MinMaxPriorityQueue$MoveDesc r4 = r0.tryCrossOverAndBubbleUp(r4, r1, r5)
            return r4
        L13:
            if (r2 >= r4) goto L1f
            com.google.common.collect.MinMaxPriorityQueue$MoveDesc r0 = new com.google.common.collect.MinMaxPriorityQueue$MoveDesc
            java.lang.Object r4 = r3.elementData(r4)
            r0.<init>(r5, r4)
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    private int getMaxElementIndex() {
            r3 = this;
            int r0 = r3.size
            r1 = 1
            if (r0 == r1) goto L13
            r2 = 2
            if (r0 == r2) goto L12
            com.google.common.collect.MinMaxPriorityQueue<E>$Heap r0 = r3.maxHeap
            int r0 = r0.compareElements(r1, r2)
            if (r0 > 0) goto L11
            goto L12
        L11:
            r1 = 2
        L12:
            return r1
        L13:
            r0 = 0
            return r0
    }

    private void growIfNeeded() {
            r4 = this;
            int r0 = r4.size
            java.lang.Object[] r1 = r4.queue
            int r1 = r1.length
            if (r0 <= r1) goto L16
            int r0 = r4.calculateNewCapacity()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r1 = r4.queue
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r4.queue = r0
        L16:
            return
    }

    private com.google.common.collect.MinMaxPriorityQueue<E>.Heap heapForIndex(int r5) {
            r4 = this;
            r0 = 1
            int r5 = r5 + r0
            int r5 = ~r5
            int r5 = ~r5
            r1 = 0
            if (r5 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = "negative index"
            com.google.common.base.Preconditions.checkState(r2, r3)
            r2 = 1431655765(0x55555555, float:1.4660155E13)
            r2 = r2 & r5
            r3 = -1431655766(0xffffffffaaaaaaaa, float:-3.0316488E-13)
            r5 = r5 & r3
            if (r2 <= r5) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L20
            com.google.common.collect.MinMaxPriorityQueue<E>$Heap r5 = r4.minHeap
            goto L22
        L20:
            com.google.common.collect.MinMaxPriorityQueue<E>$Heap r5 = r4.maxHeap
        L22:
            return r5
    }

    @com.google.common.annotations.VisibleForTesting
    public static int initialQueueSize(int r1, int r2, java.lang.Iterable<?> r3) {
            r0 = -1
            if (r1 != r0) goto L5
            r1 = 11
        L5:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L13
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            int r1 = java.lang.Math.max(r1, r3)
        L13:
            int r1 = capAtMaximumSize(r1, r2)
            return r1
    }

    public static com.google.common.collect.MinMaxPriorityQueue.Builder<java.lang.Comparable> maximumSize(int r3) {
            com.google.common.collect.MinMaxPriorityQueue$Builder r0 = new com.google.common.collect.MinMaxPriorityQueue$Builder
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.collect.MinMaxPriorityQueue$Builder r3 = r0.maximumSize(r3)
            return r3
    }

    public static <B> com.google.common.collect.MinMaxPriorityQueue.Builder<B> orderedBy(java.util.Comparator<B> r2) {
            com.google.common.collect.MinMaxPriorityQueue$Builder r0 = new com.google.common.collect.MinMaxPriorityQueue$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private E removeAndGet(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.elementData(r2)
            r1.removeAt(r2)
            return r0
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean add(E r1) {
            r0 = this;
            r0.offer(r1)
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean addAll(java.util.Collection<? extends E> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r0 = r3.next()
            r2.offer(r0)
            r0 = 1
            goto L5
        L14:
            return r0
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.size
            if (r1 >= r2) goto Le
            java.lang.Object[] r2 = r4.queue
            r3 = 0
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2
        Le:
            r4.size = r0
            return
    }

    public java.util.Comparator<? super E> comparator() {
            r1 = this;
            com.google.common.collect.MinMaxPriorityQueue<E>$Heap r0 = r1.minHeap
            com.google.common.collect.Ordering<E> r0 = r0.ordering
            return r0
    }

    public final E elementData(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.queue
            r2 = r0[r2]
            java.util.Objects.requireNonNull(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r2 = this;
            com.google.common.collect.MinMaxPriorityQueue$QueueIterator r0 = new com.google.common.collect.MinMaxPriorityQueue$QueueIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.Queue
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean offer(E r5) {
            r4 = this;
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r4.modCount
            r1 = 1
            int r0 = r0 + r1
            r4.modCount = r0
            int r0 = r4.size
            int r2 = r0 + 1
            r4.size = r2
            r4.growIfNeeded()
            com.google.common.collect.MinMaxPriorityQueue$Heap r2 = r4.heapForIndex(r0)
            int r3 = r2.crossOverUp(r0, r5)
            if (r3 != r0) goto L1d
            goto L20
        L1d:
            com.google.common.collect.MinMaxPriorityQueue<E>$Heap r2 = r2.otherHeap
            r0 = r3
        L20:
            r2.bubbleUpAlternatingLevels(r0, r5)
            int r0 = r4.size
            int r2 = r4.maximumSize
            if (r0 <= r2) goto L31
            java.lang.Object r0 = r4.pollLast()
            if (r0 == r5) goto L30
            goto L31
        L30:
            r1 = 0
        L31:
            return r1
    }

    @Override // java.util.Queue
    @javax.annotation.CheckForNull
    public E peek() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = 0
            java.lang.Object r0 = r1.elementData(r0)
        Ld:
            return r0
    }

    @javax.annotation.CheckForNull
    public E peekFirst() {
            r1 = this;
            java.lang.Object r0 = r1.peek()
            return r0
    }

    @javax.annotation.CheckForNull
    public E peekLast() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto L10
        L8:
            int r0 = r1.getMaxElementIndex()
            java.lang.Object r0 = r1.elementData(r0)
        L10:
            return r0
    }

    @Override // java.util.Queue
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public E poll() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = 0
            java.lang.Object r0 = r1.removeAndGet(r0)
        Ld:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public E pollFirst() {
            r1 = this;
            java.lang.Object r0 = r1.poll()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public E pollLast() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto L10
        L8:
            int r0 = r1.getMaxElementIndex()
            java.lang.Object r0 = r1.removeAndGet(r0)
        L10:
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public final com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> removeAt(int r7) {
            r6 = this;
            int r0 = r6.size
            com.google.common.base.Preconditions.checkPositionIndex(r7, r0)
            int r0 = r6.modCount
            int r0 = r0 + 1
            r6.modCount = r0
            int r0 = r6.size
            int r0 = r0 + (-1)
            r6.size = r0
            r1 = 0
            if (r0 != r7) goto L19
            java.lang.Object[] r7 = r6.queue
            r7[r0] = r1
            return r1
        L19:
            java.lang.Object r0 = r6.elementData(r0)
            int r2 = r6.size
            com.google.common.collect.MinMaxPriorityQueue$Heap r2 = r6.heapForIndex(r2)
            int r2 = r2.swapWithConceptuallyLastElement(r0)
            if (r2 != r7) goto L30
            java.lang.Object[] r7 = r6.queue
            int r0 = r6.size
            r7[r0] = r1
            return r1
        L30:
            int r3 = r6.size
            java.lang.Object r3 = r6.elementData(r3)
            java.lang.Object[] r4 = r6.queue
            int r5 = r6.size
            r4[r5] = r1
            com.google.common.collect.MinMaxPriorityQueue$MoveDesc r1 = r6.fillHole(r7, r3)
            if (r2 >= r7) goto L52
            if (r1 != 0) goto L4a
            com.google.common.collect.MinMaxPriorityQueue$MoveDesc r7 = new com.google.common.collect.MinMaxPriorityQueue$MoveDesc
            r7.<init>(r0, r3)
            return r7
        L4a:
            com.google.common.collect.MinMaxPriorityQueue$MoveDesc r7 = new com.google.common.collect.MinMaxPriorityQueue$MoveDesc
            E r1 = r1.replaced
            r7.<init>(r0, r1)
            return r7
        L52:
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E removeFirst() {
            r1 = this;
            java.lang.Object r0 = r1.remove()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E removeLast() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lf
            int r0 = r1.getMaxElementIndex()
            java.lang.Object r0 = r1.removeAndGet(r0)
            return r0
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public java.lang.Object[] toArray() {
            r4 = this;
            int r0 = r4.size
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r4.queue
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }
}
