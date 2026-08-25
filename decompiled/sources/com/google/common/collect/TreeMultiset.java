package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class TreeMultiset<E> extends com.google.common.collect.AbstractSortedMultiset<E> implements java.io.Serializable {
    public static final /* synthetic */ int $r8$clinit = 0;

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 1;
    private final transient com.google.common.collect.TreeMultiset.AvlNode<E> header;
    private final transient com.google.common.collect.GeneralRange<E> range;
    private final transient com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>> rootReference;


    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$2, reason: invalid class name */
    public class AnonymousClass2 implements java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> {

        @javax.annotation.CheckForNull
        public com.google.common.collect.TreeMultiset.AvlNode<E> current;

        @javax.annotation.CheckForNull
        public com.google.common.collect.Multiset.Entry<E> prevEntry;
        public final /* synthetic */ com.google.common.collect.TreeMultiset this$0;

        public AnonymousClass2(com.google.common.collect.TreeMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.common.collect.TreeMultiset$AvlNode r1 = com.google.common.collect.TreeMultiset.access$1300(r1)
                r0.current = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r3.current
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.common.collect.TreeMultiset r0 = r3.this$0
                com.google.common.collect.GeneralRange r0 = com.google.common.collect.TreeMultiset.access$1400(r0)
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r3.current
                java.lang.Object r2 = r2.getElement()
                boolean r0 = r0.tooHigh(r2)
                if (r0 == 0) goto L1c
                r0 = 0
                r3.current = r0
                return r1
            L1c:
                r0 = 1
                return r0
        }

        @Override // java.util.Iterator
        public com.google.common.collect.Multiset.Entry<E> next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L2e
                com.google.common.collect.TreeMultiset r0 = r3.this$0
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r3.current
                java.util.Objects.requireNonNull(r1)
                com.google.common.collect.Multiset$Entry r0 = com.google.common.collect.TreeMultiset.access$1500(r0, r1)
                r3.prevEntry = r0
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r3.current
                com.google.common.collect.TreeMultiset$AvlNode r1 = com.google.common.collect.TreeMultiset.AvlNode.access$700(r1)
                com.google.common.collect.TreeMultiset r2 = r3.this$0
                com.google.common.collect.TreeMultiset$AvlNode r2 = com.google.common.collect.TreeMultiset.access$1600(r2)
                if (r1 != r2) goto L25
                r1 = 0
                r3.current = r1
                goto L2d
            L25:
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r3.current
                com.google.common.collect.TreeMultiset$AvlNode r1 = com.google.common.collect.TreeMultiset.AvlNode.access$700(r1)
                r3.current = r1
            L2d:
                return r0
            L2e:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                com.google.common.collect.Multiset$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                com.google.common.collect.Multiset$Entry<E> r0 = r3.prevEntry
                r1 = 0
                if (r0 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r2 = "no calls to next() since the last call to remove()"
                com.google.common.base.Preconditions.checkState(r0, r2)
                com.google.common.collect.TreeMultiset r0 = r3.this$0
                com.google.common.collect.Multiset$Entry<E> r2 = r3.prevEntry
                java.lang.Object r2 = r2.getElement()
                r0.setCount(r2, r1)
                r0 = 0
                r3.prevEntry = r0
                return
        }
    }


    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType = null;

        static {
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.collect.TreeMultiset.AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.collect.TreeMultiset.AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public static abstract enum Aggregate extends java.lang.Enum<com.google.common.collect.TreeMultiset.Aggregate> {
        private static final /* synthetic */ com.google.common.collect.TreeMultiset.Aggregate[] $VALUES = null;
        public static final com.google.common.collect.TreeMultiset.Aggregate DISTINCT = null;
        public static final com.google.common.collect.TreeMultiset.Aggregate SIZE = null;



        private static /* synthetic */ com.google.common.collect.TreeMultiset.Aggregate[] $values() {
                r0 = 2
                com.google.common.collect.TreeMultiset$Aggregate[] r0 = new com.google.common.collect.TreeMultiset.Aggregate[r0]
                com.google.common.collect.TreeMultiset$Aggregate r1 = com.google.common.collect.TreeMultiset.Aggregate.SIZE
                r2 = 0
                r0[r2] = r1
                com.google.common.collect.TreeMultiset$Aggregate r1 = com.google.common.collect.TreeMultiset.Aggregate.DISTINCT
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.collect.TreeMultiset$Aggregate$1 r0 = new com.google.common.collect.TreeMultiset$Aggregate$1
                r0.<init>()
                com.google.common.collect.TreeMultiset.Aggregate.SIZE = r0
                com.google.common.collect.TreeMultiset$Aggregate$2 r0 = new com.google.common.collect.TreeMultiset$Aggregate$2
                r0.<init>()
                com.google.common.collect.TreeMultiset.Aggregate.DISTINCT = r0
                com.google.common.collect.TreeMultiset$Aggregate[] r0 = $values()
                com.google.common.collect.TreeMultiset.Aggregate.$VALUES = r0
                return
        }

        private Aggregate(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ Aggregate(java.lang.String r1, int r2, com.google.common.collect.TreeMultiset.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.collect.TreeMultiset.Aggregate valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.collect.TreeMultiset$Aggregate> r0 = com.google.common.collect.TreeMultiset.Aggregate.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.collect.TreeMultiset$Aggregate r1 = (com.google.common.collect.TreeMultiset.Aggregate) r1
                return r1
        }

        public static com.google.common.collect.TreeMultiset.Aggregate[] values() {
                com.google.common.collect.TreeMultiset$Aggregate[] r0 = com.google.common.collect.TreeMultiset.Aggregate.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.collect.TreeMultiset$Aggregate[] r0 = (com.google.common.collect.TreeMultiset.Aggregate[]) r0
                return r0
        }

        public abstract int nodeAggregate(com.google.common.collect.TreeMultiset.AvlNode<?> r1);

        public abstract long treeAggregate(@javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<?> r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class AvlNode<E> {
        private int distinctElements;

        @javax.annotation.CheckForNull
        private final E elem;
        private int elemCount;
        private int height;

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> left;

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> pred;

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> right;

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> succ;
        private long totalCount;

        public AvlNode() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.elem = r0
                r0 = 1
                r1.elemCount = r0
                return
        }

        public AvlNode(@com.google.common.collect.ParametricNullness E r3, int r4) {
                r2 = this;
                r2.<init>()
                r0 = 1
                if (r4 <= 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                com.google.common.base.Preconditions.checkArgument(r1)
                r2.elem = r3
                r2.elemCount = r4
                long r3 = (long) r4
                r2.totalCount = r3
                r2.distinctElements = r0
                r2.height = r0
                r3 = 0
                r2.left = r3
                r2.right = r3
                return
        }

        public static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$1000(com.google.common.collect.TreeMultiset.AvlNode r0, java.util.Comparator r1, java.lang.Object r2) {
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.ceiling(r1, r2)
                return r0
        }

        public static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$1100(com.google.common.collect.TreeMultiset.AvlNode r0, java.util.Comparator r1, java.lang.Object r2) {
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.floor(r1, r2)
                return r0
        }

        public static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$1200(com.google.common.collect.TreeMultiset.AvlNode r0) {
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.pred()
                return r0
        }

        public static /* synthetic */ int access$200(com.google.common.collect.TreeMultiset.AvlNode r0) {
                int r0 = r0.elemCount
                return r0
        }

        public static /* synthetic */ void access$202(com.google.common.collect.TreeMultiset.AvlNode r1) {
                r0 = 0
                r1.elemCount = r0
                return
        }

        public static /* synthetic */ long access$300(com.google.common.collect.TreeMultiset.AvlNode r2) {
                long r0 = r2.totalCount
                return r0
        }

        public static /* synthetic */ int access$400(com.google.common.collect.TreeMultiset.AvlNode r0) {
                int r0 = r0.distinctElements
                return r0
        }

        public static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$500(com.google.common.collect.TreeMultiset.AvlNode r0) {
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r0.left
                return r0
        }

        public static /* synthetic */ void access$502(com.google.common.collect.TreeMultiset.AvlNode r1) {
                r0 = 0
                r1.left = r0
                return
        }

        public static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$600(com.google.common.collect.TreeMultiset.AvlNode r0) {
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r0.right
                return r0
        }

        public static /* synthetic */ void access$602(com.google.common.collect.TreeMultiset.AvlNode r1) {
                r0 = 0
                r1.right = r0
                return
        }

        public static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$700(com.google.common.collect.TreeMultiset.AvlNode r0) {
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.succ()
                return r0
        }

        public static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$802(com.google.common.collect.TreeMultiset.AvlNode r0, com.google.common.collect.TreeMultiset.AvlNode r1) {
                r0.pred = r1
                return r1
        }

        public static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$902(com.google.common.collect.TreeMultiset.AvlNode r0, com.google.common.collect.TreeMultiset.AvlNode r1) {
                r0.succ = r1
                return r1
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> addLeftChild(@com.google.common.collect.ParametricNullness E r3, int r4) {
                r2 = this;
                com.google.common.collect.TreeMultiset$AvlNode r0 = new com.google.common.collect.TreeMultiset$AvlNode
                r0.<init>(r3, r4)
                r2.left = r0
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.pred()
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                com.google.common.collect.TreeMultiset.access$1800(r3, r0, r2)
                int r3 = r2.height
                r0 = 2
                int r3 = java.lang.Math.max(r0, r3)
                r2.height = r3
                int r3 = r2.distinctElements
                int r3 = r3 + 1
                r2.distinctElements = r3
                long r0 = r2.totalCount
                long r3 = (long) r4
                long r0 = r0 + r3
                r2.totalCount = r0
                return r2
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> addRightChild(@com.google.common.collect.ParametricNullness E r3, int r4) {
                r2 = this;
                com.google.common.collect.TreeMultiset$AvlNode r0 = new com.google.common.collect.TreeMultiset$AvlNode
                r0.<init>(r3, r4)
                r2.right = r0
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.succ()
                com.google.common.collect.TreeMultiset.access$1800(r2, r0, r3)
                int r3 = r2.height
                r0 = 2
                int r3 = java.lang.Math.max(r0, r3)
                r2.height = r3
                int r3 = r2.distinctElements
                int r3 = r3 + 1
                r2.distinctElements = r3
                long r0 = r2.totalCount
                long r3 = (long) r4
                long r0 = r0 + r3
                r2.totalCount = r0
                return r2
        }

        private int balanceFactor() {
                r2 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                int r0 = height(r0)
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r2.right
                int r1 = height(r1)
                int r0 = r0 - r1
                return r0
        }

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> ceiling(java.util.Comparator<? super E> r2, @com.google.common.collect.ParametricNullness E r3) {
                r1 = this;
                E r0 = r1.elem
                int r0 = r2.compare(r3, r0)
                if (r0 >= 0) goto L19
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r1.left
                if (r0 != 0) goto Le
                r2 = r1
                goto L18
            Le:
                com.google.common.collect.TreeMultiset$AvlNode r2 = r0.ceiling(r2, r3)
                java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r1)
                com.google.common.collect.TreeMultiset$AvlNode r2 = (com.google.common.collect.TreeMultiset.AvlNode) r2
            L18:
                return r2
            L19:
                if (r0 != 0) goto L1c
                return r1
            L1c:
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r1.right
                if (r0 != 0) goto L22
                r2 = 0
                goto L26
            L22:
                com.google.common.collect.TreeMultiset$AvlNode r2 = r0.ceiling(r2, r3)
            L26:
                return r2
        }

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> deleteMe() {
                r6 = this;
                int r0 = r6.elemCount
                r1 = 0
                r6.elemCount = r1
                com.google.common.collect.TreeMultiset$AvlNode r1 = r6.pred()
                com.google.common.collect.TreeMultiset$AvlNode r2 = r6.succ()
                com.google.common.collect.TreeMultiset.access$1900(r1, r2)
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r6.left
                if (r1 != 0) goto L17
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r6.right
                return r0
            L17:
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r6.right
                if (r2 != 0) goto L1c
                return r1
            L1c:
                int r1 = r1.height
                int r2 = r2.height
                if (r1 < r2) goto L43
                com.google.common.collect.TreeMultiset$AvlNode r1 = r6.pred()
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r6.left
                com.google.common.collect.TreeMultiset$AvlNode r2 = r2.removeMax(r1)
                r1.left = r2
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r6.right
                r1.right = r2
                int r2 = r6.distinctElements
                int r2 = r2 + (-1)
                r1.distinctElements = r2
                long r2 = r6.totalCount
                long r4 = (long) r0
                long r2 = r2 - r4
                r1.totalCount = r2
                com.google.common.collect.TreeMultiset$AvlNode r0 = r1.rebalance()
                return r0
            L43:
                com.google.common.collect.TreeMultiset$AvlNode r1 = r6.succ()
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r6.right
                com.google.common.collect.TreeMultiset$AvlNode r2 = r2.removeMin(r1)
                r1.right = r2
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r6.left
                r1.left = r2
                int r2 = r6.distinctElements
                int r2 = r2 + (-1)
                r1.distinctElements = r2
                long r2 = r6.totalCount
                long r4 = (long) r0
                long r2 = r2 - r4
                r1.totalCount = r2
                com.google.common.collect.TreeMultiset$AvlNode r0 = r1.rebalance()
                return r0
        }

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> floor(java.util.Comparator<? super E> r2, @com.google.common.collect.ParametricNullness E r3) {
                r1 = this;
                E r0 = r1.elem
                int r0 = r2.compare(r3, r0)
                if (r0 <= 0) goto L19
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r1.right
                if (r0 != 0) goto Le
                r2 = r1
                goto L18
            Le:
                com.google.common.collect.TreeMultiset$AvlNode r2 = r0.floor(r2, r3)
                java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r1)
                com.google.common.collect.TreeMultiset$AvlNode r2 = (com.google.common.collect.TreeMultiset.AvlNode) r2
            L18:
                return r2
            L19:
                if (r0 != 0) goto L1c
                return r1
            L1c:
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r1.left
                if (r0 != 0) goto L22
                r2 = 0
                goto L26
            L22:
                com.google.common.collect.TreeMultiset$AvlNode r2 = r0.floor(r2, r3)
            L26:
                return r2
        }

        private static int height(@javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<?> r0) {
                if (r0 != 0) goto L4
                r0 = 0
                goto L6
            L4:
                int r0 = r0.height
            L6:
                return r0
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> pred() {
                r1 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r1.pred
                java.util.Objects.requireNonNull(r0)
                return r0
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> rebalance() {
                r2 = this;
                int r0 = r2.balanceFactor()
                r1 = -2
                if (r0 == r1) goto L28
                r1 = 2
                if (r0 == r1) goto Le
                r2.recomputeHeight()
                return r2
            Le:
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                int r0 = r0.balanceFactor()
                if (r0 >= 0) goto L23
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.rotateLeft()
                r2.left = r0
            L23:
                com.google.common.collect.TreeMultiset$AvlNode r0 = r2.rotateRight()
                return r0
            L28:
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.right
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.right
                int r0 = r0.balanceFactor()
                if (r0 <= 0) goto L3d
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.right
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.rotateRight()
                r2.right = r0
            L3d:
                com.google.common.collect.TreeMultiset$AvlNode r0 = r2.rotateLeft()
                return r0
        }

        private void recompute() {
                r0 = this;
                r0.recomputeMultiset()
                r0.recomputeHeight()
                return
        }

        private void recomputeHeight() {
                r2 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                int r0 = height(r0)
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r2.right
                int r1 = height(r1)
                int r0 = java.lang.Math.max(r0, r1)
                int r0 = r0 + 1
                r2.height = r0
                return
        }

        private void recomputeMultiset() {
                r4 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r4.left
                int r1 = com.google.common.collect.TreeMultiset.$r8$clinit
                r1 = 0
                if (r0 != 0) goto L9
                r0 = 0
                goto Ld
            L9:
                int r0 = access$400(r0)
            Ld:
                int r0 = r0 + 1
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r4.right
                if (r2 != 0) goto L14
                goto L18
            L14:
                int r1 = access$400(r2)
            L18:
                int r0 = r0 + r1
                r4.distinctElements = r0
                int r0 = r4.elemCount
                long r0 = (long) r0
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r4.left
                long r2 = totalCount(r2)
                long r0 = r0 + r2
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r4.right
                long r2 = totalCount(r2)
                long r0 = r0 + r2
                r4.totalCount = r0
                return
        }

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> removeMax(com.google.common.collect.TreeMultiset.AvlNode<E> r5) {
                r4 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r4.right
                if (r0 != 0) goto L7
                com.google.common.collect.TreeMultiset$AvlNode<E> r5 = r4.left
                return r5
            L7:
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.removeMax(r5)
                r4.right = r0
                int r0 = r4.distinctElements
                int r0 = r0 + (-1)
                r4.distinctElements = r0
                long r0 = r4.totalCount
                int r5 = r5.elemCount
                long r2 = (long) r5
                long r0 = r0 - r2
                r4.totalCount = r0
                com.google.common.collect.TreeMultiset$AvlNode r5 = r4.rebalance()
                return r5
        }

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> removeMin(com.google.common.collect.TreeMultiset.AvlNode<E> r5) {
                r4 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r4.left
                if (r0 != 0) goto L7
                com.google.common.collect.TreeMultiset$AvlNode<E> r5 = r4.right
                return r5
            L7:
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.removeMin(r5)
                r4.left = r0
                int r0 = r4.distinctElements
                int r0 = r0 + (-1)
                r4.distinctElements = r0
                long r0 = r4.totalCount
                int r5 = r5.elemCount
                long r2 = (long) r5
                long r0 = r0 - r2
                r4.totalCount = r0
                com.google.common.collect.TreeMultiset$AvlNode r5 = r4.rebalance()
                return r5
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> rotateLeft() {
                r3 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r3.right
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                com.google.common.base.Preconditions.checkState(r0)
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r3.right
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r0.left
                r3.right = r1
                r0.left = r3
                long r1 = r3.totalCount
                r0.totalCount = r1
                int r1 = r3.distinctElements
                r0.distinctElements = r1
                r3.recompute()
                r0.recomputeHeight()
                return r0
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> rotateRight() {
                r3 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r3.left
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                com.google.common.base.Preconditions.checkState(r0)
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r3.left
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r0.right
                r3.left = r1
                r0.right = r3
                long r1 = r3.totalCount
                r0.totalCount = r1
                int r1 = r3.distinctElements
                r0.distinctElements = r1
                r3.recompute()
                r0.recomputeHeight()
                return r0
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> succ() {
                r1 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r1.succ
                java.util.Objects.requireNonNull(r0)
                return r0
        }

        private static long totalCount(@javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<?> r2) {
                if (r2 != 0) goto L5
                r0 = 0
                goto L7
            L5:
                long r0 = r2.totalCount
            L7:
                return r0
        }

        public final com.google.common.collect.TreeMultiset.AvlNode<E> add(java.util.Comparator<? super E> r8, @com.google.common.collect.ParametricNullness E r9, int r10, int[] r11) {
                r7 = this;
                E r0 = r7.elem
                int r0 = r8.compare(r9, r0)
                r1 = 0
                r2 = 1
                if (r0 >= 0) goto L37
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r7.left
                if (r0 != 0) goto L15
                r11[r1] = r1
                com.google.common.collect.TreeMultiset$AvlNode r8 = r7.addLeftChild(r9, r10)
                return r8
            L15:
                int r3 = r0.height
                com.google.common.collect.TreeMultiset$AvlNode r8 = r0.add(r8, r9, r10, r11)
                r7.left = r8
                r9 = r11[r1]
                if (r9 != 0) goto L26
                int r9 = r7.distinctElements
                int r9 = r9 + r2
                r7.distinctElements = r9
            L26:
                long r0 = r7.totalCount
                long r9 = (long) r10
                long r0 = r0 + r9
                r7.totalCount = r0
                int r8 = r8.height
                if (r8 != r3) goto L32
                r8 = r7
                goto L36
            L32:
                com.google.common.collect.TreeMultiset$AvlNode r8 = r7.rebalance()
            L36:
                return r8
            L37:
                if (r0 <= 0) goto L66
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r7.right
                if (r0 != 0) goto L44
                r11[r1] = r1
                com.google.common.collect.TreeMultiset$AvlNode r8 = r7.addRightChild(r9, r10)
                return r8
            L44:
                int r3 = r0.height
                com.google.common.collect.TreeMultiset$AvlNode r8 = r0.add(r8, r9, r10, r11)
                r7.right = r8
                r9 = r11[r1]
                if (r9 != 0) goto L55
                int r9 = r7.distinctElements
                int r9 = r9 + r2
                r7.distinctElements = r9
            L55:
                long r0 = r7.totalCount
                long r9 = (long) r10
                long r0 = r0 + r9
                r7.totalCount = r0
                int r8 = r8.height
                if (r8 != r3) goto L61
                r8 = r7
                goto L65
            L61:
                com.google.common.collect.TreeMultiset$AvlNode r8 = r7.rebalance()
            L65:
                return r8
            L66:
                int r8 = r7.elemCount
                r11[r1] = r8
                long r8 = (long) r8
                long r3 = (long) r10
                long r8 = r8 + r3
                r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r11 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r11 > 0) goto L75
                r1 = 1
            L75:
                com.google.common.base.Preconditions.checkArgument(r1)
                int r8 = r7.elemCount
                int r8 = r8 + r10
                r7.elemCount = r8
                long r8 = r7.totalCount
                long r8 = r8 + r3
                r7.totalCount = r8
                return r7
        }

        public final int count(java.util.Comparator<? super E> r3, @com.google.common.collect.ParametricNullness E r4) {
                r2 = this;
                E r0 = r2.elem
                int r0 = r3.compare(r4, r0)
                r1 = 0
                if (r0 >= 0) goto L13
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                if (r0 != 0) goto Le
                goto L12
            Le:
                int r1 = r0.count(r3, r4)
            L12:
                return r1
            L13:
                if (r0 <= 0) goto L1f
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.right
                if (r0 != 0) goto L1a
                goto L1e
            L1a:
                int r1 = r0.count(r3, r4)
            L1e:
                return r1
            L1f:
                int r3 = r2.elemCount
                return r3
        }

        public final int getCount() {
                r1 = this;
                int r0 = r1.elemCount
                return r0
        }

        @com.google.common.collect.ParametricNullness
        public final E getElement() {
                r1 = this;
                E r0 = r1.elem
                return r0
        }

        @javax.annotation.CheckForNull
        public final com.google.common.collect.TreeMultiset.AvlNode<E> remove(java.util.Comparator<? super E> r5, @com.google.common.collect.ParametricNullness E r6, int r7, int[] r8) {
                r4 = this;
                E r0 = r4.elem
                int r0 = r5.compare(r6, r0)
                r1 = 0
                if (r0 >= 0) goto L3e
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r4.left
                if (r0 != 0) goto L10
                r8[r1] = r1
                return r4
            L10:
                com.google.common.collect.TreeMultiset$AvlNode r5 = r0.remove(r5, r6, r7, r8)
                r4.left = r5
                r5 = r8[r1]
                if (r5 <= 0) goto L33
                r5 = r8[r1]
                if (r7 < r5) goto L2d
                int r5 = r4.distinctElements
                int r5 = r5 + (-1)
                r4.distinctElements = r5
                long r5 = r4.totalCount
                r7 = r8[r1]
                long r2 = (long) r7
                long r5 = r5 - r2
                r4.totalCount = r5
                goto L33
            L2d:
                long r5 = r4.totalCount
                long r2 = (long) r7
                long r5 = r5 - r2
                r4.totalCount = r5
            L33:
                r5 = r8[r1]
                if (r5 != 0) goto L39
                r5 = r4
                goto L3d
            L39:
                com.google.common.collect.TreeMultiset$AvlNode r5 = r4.rebalance()
            L3d:
                return r5
            L3e:
                if (r0 <= 0) goto L6f
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r4.right
                if (r0 != 0) goto L47
                r8[r1] = r1
                return r4
            L47:
                com.google.common.collect.TreeMultiset$AvlNode r5 = r0.remove(r5, r6, r7, r8)
                r4.right = r5
                r5 = r8[r1]
                if (r5 <= 0) goto L6a
                r5 = r8[r1]
                if (r7 < r5) goto L64
                int r5 = r4.distinctElements
                int r5 = r5 + (-1)
                r4.distinctElements = r5
                long r5 = r4.totalCount
                r7 = r8[r1]
                long r7 = (long) r7
                long r5 = r5 - r7
                r4.totalCount = r5
                goto L6a
            L64:
                long r5 = r4.totalCount
                long r7 = (long) r7
                long r5 = r5 - r7
                r4.totalCount = r5
            L6a:
                com.google.common.collect.TreeMultiset$AvlNode r5 = r4.rebalance()
                return r5
            L6f:
                int r5 = r4.elemCount
                r8[r1] = r5
                if (r7 < r5) goto L7a
                com.google.common.collect.TreeMultiset$AvlNode r5 = r4.deleteMe()
                return r5
            L7a:
                int r5 = r5 - r7
                r4.elemCount = r5
                long r5 = r4.totalCount
                long r7 = (long) r7
                long r5 = r5 - r7
                r4.totalCount = r5
                return r4
        }

        @javax.annotation.CheckForNull
        public final com.google.common.collect.TreeMultiset.AvlNode<E> setCount(java.util.Comparator<? super E> r9, @com.google.common.collect.ParametricNullness E r10, int r11, int r12, int[] r13) {
                r8 = this;
                E r0 = r8.elem
                int r0 = r9.compare(r10, r0)
                r1 = 0
                if (r0 >= 0) goto L4f
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r8.left
                if (r2 != 0) goto L19
                r13[r1] = r1
                if (r11 != 0) goto L18
                if (r12 <= 0) goto L18
                com.google.common.collect.TreeMultiset$AvlNode r9 = r8.addLeftChild(r10, r12)
                return r9
            L18:
                return r8
            L19:
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                com.google.common.collect.TreeMultiset$AvlNode r9 = r2.setCount(r3, r4, r5, r6, r7)
                r8.left = r9
                r9 = r13[r1]
                if (r9 != r11) goto L4a
                if (r12 != 0) goto L35
                r9 = r13[r1]
                if (r9 == 0) goto L35
                int r9 = r8.distinctElements
                int r9 = r9 + (-1)
                r8.distinctElements = r9
                goto L41
            L35:
                if (r12 <= 0) goto L41
                r9 = r13[r1]
                if (r9 != 0) goto L41
                int r9 = r8.distinctElements
                int r9 = r9 + 1
                r8.distinctElements = r9
            L41:
                long r9 = r8.totalCount
                r11 = r13[r1]
                int r12 = r12 - r11
                long r11 = (long) r12
                long r9 = r9 + r11
                r8.totalCount = r9
            L4a:
                com.google.common.collect.TreeMultiset$AvlNode r9 = r8.rebalance()
                return r9
            L4f:
                if (r0 <= 0) goto L97
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r8.right
                if (r2 != 0) goto L61
                r13[r1] = r1
                if (r11 != 0) goto L60
                if (r12 <= 0) goto L60
                com.google.common.collect.TreeMultiset$AvlNode r9 = r8.addRightChild(r10, r12)
                return r9
            L60:
                return r8
            L61:
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                com.google.common.collect.TreeMultiset$AvlNode r9 = r2.setCount(r3, r4, r5, r6, r7)
                r8.right = r9
                r9 = r13[r1]
                if (r9 != r11) goto L92
                if (r12 != 0) goto L7d
                r9 = r13[r1]
                if (r9 == 0) goto L7d
                int r9 = r8.distinctElements
                int r9 = r9 + (-1)
                r8.distinctElements = r9
                goto L89
            L7d:
                if (r12 <= 0) goto L89
                r9 = r13[r1]
                if (r9 != 0) goto L89
                int r9 = r8.distinctElements
                int r9 = r9 + 1
                r8.distinctElements = r9
            L89:
                long r9 = r8.totalCount
                r11 = r13[r1]
                int r12 = r12 - r11
                long r11 = (long) r12
                long r9 = r9 + r11
                r8.totalCount = r9
            L92:
                com.google.common.collect.TreeMultiset$AvlNode r9 = r8.rebalance()
                return r9
            L97:
                int r9 = r8.elemCount
                r13[r1] = r9
                if (r11 != r9) goto Lae
                if (r12 != 0) goto La4
                com.google.common.collect.TreeMultiset$AvlNode r9 = r8.deleteMe()
                return r9
            La4:
                long r10 = r8.totalCount
                int r9 = r12 - r9
                long r0 = (long) r9
                long r10 = r10 + r0
                r8.totalCount = r10
                r8.elemCount = r12
            Lae:
                return r8
        }

        @javax.annotation.CheckForNull
        public final com.google.common.collect.TreeMultiset.AvlNode<E> setCount(java.util.Comparator<? super E> r3, @com.google.common.collect.ParametricNullness E r4, int r5, int[] r6) {
                r2 = this;
                E r0 = r2.elem
                int r0 = r3.compare(r4, r0)
                r1 = 0
                if (r0 >= 0) goto L45
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                if (r0 != 0) goto L18
                r6[r1] = r1
                if (r5 <= 0) goto L16
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.addLeftChild(r4, r5)
                goto L17
            L16:
                r3 = r2
            L17:
                return r3
            L18:
                com.google.common.collect.TreeMultiset$AvlNode r3 = r0.setCount(r3, r4, r5, r6)
                r2.left = r3
                if (r5 != 0) goto L2b
                r3 = r6[r1]
                if (r3 == 0) goto L2b
                int r3 = r2.distinctElements
                int r3 = r3 + (-1)
                r2.distinctElements = r3
                goto L37
            L2b:
                if (r5 <= 0) goto L37
                r3 = r6[r1]
                if (r3 != 0) goto L37
                int r3 = r2.distinctElements
                int r3 = r3 + 1
                r2.distinctElements = r3
            L37:
                long r3 = r2.totalCount
                r6 = r6[r1]
                int r5 = r5 - r6
                long r5 = (long) r5
                long r3 = r3 + r5
                r2.totalCount = r3
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.rebalance()
                return r3
            L45:
                if (r0 <= 0) goto L83
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.right
                if (r0 != 0) goto L56
                r6[r1] = r1
                if (r5 <= 0) goto L54
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.addRightChild(r4, r5)
                goto L55
            L54:
                r3 = r2
            L55:
                return r3
            L56:
                com.google.common.collect.TreeMultiset$AvlNode r3 = r0.setCount(r3, r4, r5, r6)
                r2.right = r3
                if (r5 != 0) goto L69
                r3 = r6[r1]
                if (r3 == 0) goto L69
                int r3 = r2.distinctElements
                int r3 = r3 + (-1)
                r2.distinctElements = r3
                goto L75
            L69:
                if (r5 <= 0) goto L75
                r3 = r6[r1]
                if (r3 != 0) goto L75
                int r3 = r2.distinctElements
                int r3 = r3 + 1
                r2.distinctElements = r3
            L75:
                long r3 = r2.totalCount
                r6 = r6[r1]
                int r5 = r5 - r6
                long r5 = (long) r5
                long r3 = r3 + r5
                r2.totalCount = r3
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.rebalance()
                return r3
            L83:
                int r3 = r2.elemCount
                r6[r1] = r3
                if (r5 != 0) goto L8e
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.deleteMe()
                return r3
            L8e:
                long r0 = r2.totalCount
                int r3 = r5 - r3
                long r3 = (long) r3
                long r0 = r0 + r3
                r2.totalCount = r0
                r2.elemCount = r5
                return r2
        }

        public java.lang.String toString() {
                r2 = this;
                E r0 = r2.elem
                int r1 = r2.elemCount
                com.google.common.collect.Multiset$Entry r0 = com.google.common.collect.Multisets.immutableEntry(r0, r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Reference<T> {

        @javax.annotation.CheckForNull
        private T value;

        private Reference() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Reference(com.google.common.collect.TreeMultiset.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void checkAndSet(@javax.annotation.CheckForNull T r2, @javax.annotation.CheckForNull T r3) {
                r1 = this;
                T r0 = r1.value
                if (r0 != r2) goto L7
                r1.value = r3
                return
            L7:
                java.util.ConcurrentModificationException r2 = new java.util.ConcurrentModificationException
                r2.<init>()
                throw r2
        }

        public final void clear() {
                r1 = this;
                r0 = 0
                r1.value = r0
                return
        }

        @javax.annotation.CheckForNull
        public T get() {
                r1 = this;
                T r0 = r1.value
                return r0
        }
    }

    public TreeMultiset(com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>> r2, com.google.common.collect.GeneralRange<E> r3, com.google.common.collect.TreeMultiset.AvlNode<E> r4) {
            r1 = this;
            java.util.Comparator r0 = r3.comparator()
            r1.<init>(r0)
            r1.rootReference = r2
            r1.range = r3
            r1.header = r4
            return
    }

    public TreeMultiset(java.util.Comparator<? super E> r2) {
            r1 = this;
            r1.<init>(r2)
            com.google.common.collect.GeneralRange r2 = com.google.common.collect.GeneralRange.all(r2)
            r1.range = r2
            com.google.common.collect.TreeMultiset$AvlNode r2 = new com.google.common.collect.TreeMultiset$AvlNode
            r2.<init>()
            r1.header = r2
            successor(r2, r2)
            com.google.common.collect.TreeMultiset$Reference r2 = new com.google.common.collect.TreeMultiset$Reference
            r0 = 0
            r2.<init>(r0)
            r1.rootReference = r2
            return
    }

    public static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$1300(com.google.common.collect.TreeMultiset r0) {
            com.google.common.collect.TreeMultiset$AvlNode r0 = r0.firstNode()
            return r0
    }

    public static /* synthetic */ com.google.common.collect.GeneralRange access$1400(com.google.common.collect.TreeMultiset r0) {
            com.google.common.collect.GeneralRange<E> r0 = r0.range
            return r0
    }

    public static /* synthetic */ com.google.common.collect.Multiset.Entry access$1500(com.google.common.collect.TreeMultiset r0, com.google.common.collect.TreeMultiset.AvlNode r1) {
            com.google.common.collect.Multiset$Entry r0 = r0.wrapEntry(r1)
            return r0
    }

    public static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$1600(com.google.common.collect.TreeMultiset r0) {
            com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r0.header
            return r0
    }

    public static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$1700(com.google.common.collect.TreeMultiset r0) {
            com.google.common.collect.TreeMultiset$AvlNode r0 = r0.lastNode()
            return r0
    }

    public static /* synthetic */ void access$1800(com.google.common.collect.TreeMultiset.AvlNode r0, com.google.common.collect.TreeMultiset.AvlNode r1, com.google.common.collect.TreeMultiset.AvlNode r2) {
            successor(r0, r1, r2)
            return
    }

    public static /* synthetic */ void access$1900(com.google.common.collect.TreeMultiset.AvlNode r0, com.google.common.collect.TreeMultiset.AvlNode r1) {
            successor(r0, r1)
            return
    }

    private long aggregateAboveRange(com.google.common.collect.TreeMultiset.Aggregate r5, @javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<E> r6) {
            r4 = this;
            if (r6 != 0) goto L5
            r5 = 0
            return r5
        L5:
            java.util.Comparator r0 = r4.comparator()
            com.google.common.collect.GeneralRange<E> r1 = r4.range
            java.lang.Object r1 = r1.getUpperEndpoint()
            java.lang.Object r2 = r6.getElement()
            int r0 = r0.compare(r1, r2)
            if (r0 <= 0) goto L22
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$600(r6)
            long r5 = r4.aggregateAboveRange(r5, r6)
            return r5
        L22:
            if (r0 != 0) goto L56
            int[] r0 = com.google.common.collect.TreeMultiset.AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType
            com.google.common.collect.GeneralRange<E> r1 = r4.range
            com.google.common.collect.BoundType r1 = r1.getUpperBoundType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L47
            r1 = 2
            if (r0 != r1) goto L41
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$600(r6)
            long r5 = r5.treeAggregate(r6)
            return r5
        L41:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L47:
            int r0 = r5.nodeAggregate(r6)
            long r0 = (long) r0
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$600(r6)
            long r5 = r5.treeAggregate(r6)
        L54:
            long r0 = r0 + r5
            return r0
        L56:
            com.google.common.collect.TreeMultiset$AvlNode r0 = com.google.common.collect.TreeMultiset.AvlNode.access$600(r6)
            long r0 = r5.treeAggregate(r0)
            int r2 = r5.nodeAggregate(r6)
            long r2 = (long) r2
            long r0 = r0 + r2
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$500(r6)
            long r5 = r4.aggregateAboveRange(r5, r6)
            goto L54
    }

    private long aggregateBelowRange(com.google.common.collect.TreeMultiset.Aggregate r5, @javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<E> r6) {
            r4 = this;
            if (r6 != 0) goto L5
            r5 = 0
            return r5
        L5:
            java.util.Comparator r0 = r4.comparator()
            com.google.common.collect.GeneralRange<E> r1 = r4.range
            java.lang.Object r1 = r1.getLowerEndpoint()
            java.lang.Object r2 = r6.getElement()
            int r0 = r0.compare(r1, r2)
            if (r0 >= 0) goto L22
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$500(r6)
            long r5 = r4.aggregateBelowRange(r5, r6)
            return r5
        L22:
            if (r0 != 0) goto L56
            int[] r0 = com.google.common.collect.TreeMultiset.AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType
            com.google.common.collect.GeneralRange<E> r1 = r4.range
            com.google.common.collect.BoundType r1 = r1.getLowerBoundType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L47
            r1 = 2
            if (r0 != r1) goto L41
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$500(r6)
            long r5 = r5.treeAggregate(r6)
            return r5
        L41:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L47:
            int r0 = r5.nodeAggregate(r6)
            long r0 = (long) r0
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$500(r6)
            long r5 = r5.treeAggregate(r6)
        L54:
            long r0 = r0 + r5
            return r0
        L56:
            com.google.common.collect.TreeMultiset$AvlNode r0 = com.google.common.collect.TreeMultiset.AvlNode.access$500(r6)
            long r0 = r5.treeAggregate(r0)
            int r2 = r5.nodeAggregate(r6)
            long r2 = (long) r2
            long r0 = r0 + r2
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$600(r6)
            long r5 = r4.aggregateBelowRange(r5, r6)
            goto L54
    }

    private long aggregateForEntries(com.google.common.collect.TreeMultiset.Aggregate r6) {
            r5 = this;
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r5.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            long r1 = r6.treeAggregate(r0)
            com.google.common.collect.GeneralRange<E> r3 = r5.range
            boolean r3 = r3.hasLowerBound()
            if (r3 == 0) goto L19
            long r3 = r5.aggregateBelowRange(r6, r0)
            long r1 = r1 - r3
        L19:
            com.google.common.collect.GeneralRange<E> r3 = r5.range
            boolean r3 = r3.hasUpperBound()
            if (r3 == 0) goto L26
            long r3 = r5.aggregateAboveRange(r6, r0)
            long r1 = r1 - r3
        L26:
            return r1
    }

    public static <E extends java.lang.Comparable> com.google.common.collect.TreeMultiset<E> create() {
            com.google.common.collect.TreeMultiset r0 = new com.google.common.collect.TreeMultiset
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1)
            return r0
    }

    public static <E extends java.lang.Comparable> com.google.common.collect.TreeMultiset<E> create(java.lang.Iterable<? extends E> r1) {
            com.google.common.collect.TreeMultiset r0 = create()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    public static <E> com.google.common.collect.TreeMultiset<E> create(@javax.annotation.CheckForNull java.util.Comparator<? super E> r1) {
            if (r1 != 0) goto Lc
            com.google.common.collect.TreeMultiset r1 = new com.google.common.collect.TreeMultiset
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1.<init>(r0)
            goto L12
        Lc:
            com.google.common.collect.TreeMultiset r0 = new com.google.common.collect.TreeMultiset
            r0.<init>(r1)
            r1 = r0
        L12:
            return r1
    }

    @javax.annotation.CheckForNull
    private com.google.common.collect.TreeMultiset.AvlNode<E> firstNode() {
            r5 = this;
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r5.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            com.google.common.collect.GeneralRange<E> r2 = r5.range
            boolean r2 = r2.hasLowerBound()
            if (r2 == 0) goto L42
            com.google.common.collect.GeneralRange<E> r2 = r5.range
            java.lang.Object r2 = r2.getLowerEndpoint()
            java.util.Comparator r3 = r5.comparator()
            com.google.common.collect.TreeMultiset$AvlNode r0 = com.google.common.collect.TreeMultiset.AvlNode.access$1000(r0, r3, r2)
            if (r0 != 0) goto L25
            return r1
        L25:
            com.google.common.collect.GeneralRange<E> r3 = r5.range
            com.google.common.collect.BoundType r3 = r3.getLowerBoundType()
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L48
            java.util.Comparator r3 = r5.comparator()
            java.lang.Object r4 = r0.getElement()
            int r2 = r3.compare(r2, r4)
            if (r2 != 0) goto L48
            com.google.common.collect.TreeMultiset$AvlNode r0 = com.google.common.collect.TreeMultiset.AvlNode.access$700(r0)
            goto L48
        L42:
            com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r5.header
            com.google.common.collect.TreeMultiset$AvlNode r0 = com.google.common.collect.TreeMultiset.AvlNode.access$700(r0)
        L48:
            com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r5.header
            if (r0 == r2) goto L5a
            com.google.common.collect.GeneralRange<E> r2 = r5.range
            java.lang.Object r3 = r0.getElement()
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L59
            goto L5a
        L59:
            r1 = r0
        L5a:
            return r1
    }

    @javax.annotation.CheckForNull
    private com.google.common.collect.TreeMultiset.AvlNode<E> lastNode() {
            r5 = this;
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r5.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            com.google.common.collect.GeneralRange<E> r2 = r5.range
            boolean r2 = r2.hasUpperBound()
            if (r2 == 0) goto L42
            com.google.common.collect.GeneralRange<E> r2 = r5.range
            java.lang.Object r2 = r2.getUpperEndpoint()
            java.util.Comparator r3 = r5.comparator()
            com.google.common.collect.TreeMultiset$AvlNode r0 = com.google.common.collect.TreeMultiset.AvlNode.access$1100(r0, r3, r2)
            if (r0 != 0) goto L25
            return r1
        L25:
            com.google.common.collect.GeneralRange<E> r3 = r5.range
            com.google.common.collect.BoundType r3 = r3.getUpperBoundType()
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L48
            java.util.Comparator r3 = r5.comparator()
            java.lang.Object r4 = r0.getElement()
            int r2 = r3.compare(r2, r4)
            if (r2 != 0) goto L48
            com.google.common.collect.TreeMultiset$AvlNode r0 = com.google.common.collect.TreeMultiset.AvlNode.access$1200(r0)
            goto L48
        L42:
            com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r5.header
            com.google.common.collect.TreeMultiset$AvlNode r0 = com.google.common.collect.TreeMultiset.AvlNode.access$1200(r0)
        L48:
            com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r5.header
            if (r0 == r2) goto L5a
            com.google.common.collect.GeneralRange<E> r2 = r5.range
            java.lang.Object r3 = r0.getElement()
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L59
            goto L5a
        L59:
            r1 = r0
        L5a:
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r4) throws java.io.IOException, java.lang.ClassNotFoundException {
            r3 = this;
            r4.defaultReadObject()
            java.lang.Object r0 = r4.readObject()
            java.util.Comparator r0 = (java.util.Comparator) r0
            java.lang.Class<com.google.common.collect.AbstractSortedMultiset> r1 = com.google.common.collect.AbstractSortedMultiset.class
            java.lang.String r2 = "comparator"
            com.google.common.collect.Serialization$FieldSetter r1 = com.google.common.collect.Serialization.getFieldSetter(r1, r2)
            r1.set(r3, r0)
            java.lang.Class<com.google.common.collect.TreeMultiset> r1 = com.google.common.collect.TreeMultiset.class
            java.lang.String r2 = "range"
            com.google.common.collect.Serialization$FieldSetter r1 = com.google.common.collect.Serialization.getFieldSetter(r1, r2)
            com.google.common.collect.GeneralRange r0 = com.google.common.collect.GeneralRange.all(r0)
            r1.set(r3, r0)
            java.lang.Class<com.google.common.collect.TreeMultiset> r0 = com.google.common.collect.TreeMultiset.class
            java.lang.String r1 = "rootReference"
            com.google.common.collect.Serialization$FieldSetter r0 = com.google.common.collect.Serialization.getFieldSetter(r0, r1)
            com.google.common.collect.TreeMultiset$Reference r1 = new com.google.common.collect.TreeMultiset$Reference
            r2 = 0
            r1.<init>(r2)
            r0.set(r3, r1)
            com.google.common.collect.TreeMultiset$AvlNode r0 = new com.google.common.collect.TreeMultiset$AvlNode
            r0.<init>()
            java.lang.Class<com.google.common.collect.TreeMultiset> r1 = com.google.common.collect.TreeMultiset.class
            java.lang.String r2 = "header"
            com.google.common.collect.Serialization$FieldSetter r1 = com.google.common.collect.Serialization.getFieldSetter(r1, r2)
            r1.set(r3, r0)
            successor(r0, r0)
            com.google.common.collect.Serialization.populateMultiset(r3, r4)
            return
    }

    private static <T> void successor(com.google.common.collect.TreeMultiset.AvlNode<T> r0, com.google.common.collect.TreeMultiset.AvlNode<T> r1) {
            com.google.common.collect.TreeMultiset.AvlNode.access$902(r0, r1)
            com.google.common.collect.TreeMultiset.AvlNode.access$802(r1, r0)
            return
    }

    private static <T> void successor(com.google.common.collect.TreeMultiset.AvlNode<T> r0, com.google.common.collect.TreeMultiset.AvlNode<T> r1, com.google.common.collect.TreeMultiset.AvlNode<T> r2) {
            successor(r0, r1)
            successor(r1, r2)
            return
    }

    private com.google.common.collect.Multiset.Entry<E> wrapEntry(com.google.common.collect.TreeMultiset.AvlNode<E> r2) {
            r1 = this;
            com.google.common.collect.TreeMultiset$1 r0 = new com.google.common.collect.TreeMultiset$1
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            r2.defaultWriteObject()
            java.util.NavigableSet r0 = r1.elementSet()
            java.util.Comparator r0 = r0.comparator()
            r2.writeObject(r0)
            com.google.common.collect.Serialization.writeMultiset(r1, r2)
            return
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int add(@com.google.common.collect.ParametricNullness E r5, int r6) {
            r4 = this;
            java.lang.String r0 = "occurrences"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
            if (r6 != 0) goto Lc
            int r5 = r4.count(r5)
            return r5
        Lc:
            com.google.common.collect.GeneralRange<E> r0 = r4.range
            boolean r0 = r0.contains(r5)
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r4.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            r1 = 0
            if (r0 != 0) goto L37
            java.util.Comparator r2 = r4.comparator()
            r2.compare(r5, r5)
            com.google.common.collect.TreeMultiset$AvlNode r2 = new com.google.common.collect.TreeMultiset$AvlNode
            r2.<init>(r5, r6)
            com.google.common.collect.TreeMultiset$AvlNode<E> r5 = r4.header
            successor(r5, r2, r5)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r5 = r4.rootReference
            r5.checkAndSet(r0, r2)
            return r1
        L37:
            r2 = 1
            int[] r2 = new int[r2]
            java.util.Comparator r3 = r4.comparator()
            com.google.common.collect.TreeMultiset$AvlNode r5 = r0.add(r3, r5, r6, r2)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r6 = r4.rootReference
            r6.checkAndSet(r0, r5)
            r5 = r2[r1]
            return r5
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r3 = this;
            com.google.common.collect.GeneralRange<E> r0 = r3.range
            boolean r0 = r0.hasLowerBound()
            if (r0 != 0) goto L39
            com.google.common.collect.GeneralRange<E> r0 = r3.range
            boolean r0 = r0.hasUpperBound()
            if (r0 != 0) goto L39
            com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r3.header
            com.google.common.collect.TreeMultiset$AvlNode r0 = com.google.common.collect.TreeMultiset.AvlNode.access$700(r0)
        L16:
            com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r3.header
            if (r0 == r1) goto L30
            com.google.common.collect.TreeMultiset$AvlNode r1 = com.google.common.collect.TreeMultiset.AvlNode.access$700(r0)
            com.google.common.collect.TreeMultiset.AvlNode.access$202(r0)
            r2 = 0
            com.google.common.collect.TreeMultiset.AvlNode.access$502(r0)
            com.google.common.collect.TreeMultiset.AvlNode.access$602(r0)
            com.google.common.collect.TreeMultiset.AvlNode.access$802(r0, r2)
            com.google.common.collect.TreeMultiset.AvlNode.access$902(r0, r2)
            r0 = r1
            goto L16
        L30:
            successor(r1, r1)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r3.rootReference
            r0.clear()
            goto L41
        L39:
            com.google.common.collect.TreeMultiset$2 r0 = new com.google.common.collect.TreeMultiset$2
            r0.<init>(r3)
            com.google.common.collect.Iterators.clear(r0)
        L41:
            return
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Comparator comparator() {
            r1 = this;
            java.util.Comparator r0 = super.comparator()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            r0 = 0
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r1 = r3.rootReference     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1d
            com.google.common.collect.TreeMultiset$AvlNode r1 = (com.google.common.collect.TreeMultiset.AvlNode) r1     // Catch: java.lang.Throwable -> L1d
            com.google.common.collect.GeneralRange<E> r2 = r3.range     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1d
            if (r1 != 0) goto L14
            goto L1d
        L14:
            java.util.Comparator r2 = r3.comparator()     // Catch: java.lang.Throwable -> L1d
            int r4 = r1.count(r2, r4)     // Catch: java.lang.Throwable -> L1d
            return r4
        L1d:
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    public final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> descendingEntryIterator() {
            r1 = this;
            com.google.common.collect.TreeMultiset$3 r0 = new com.google.common.collect.TreeMultiset$3
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset descendingMultiset() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = super.descendingMultiset()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int distinctElements() {
            r2 = this;
            com.google.common.collect.TreeMultiset$Aggregate r0 = com.google.common.collect.TreeMultiset.Aggregate.DISTINCT
            long r0 = r2.aggregateForEntries(r0)
            int r0 = com.google.common.primitives.Ints.saturatedCast(r0)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final java.util.Iterator<E> elementIterator() {
            r2 = this;
            com.google.common.collect.TreeMultiset$2 r0 = new com.google.common.collect.TreeMultiset$2
            r0.<init>(r2)
            com.google.common.collect.Multisets$5 r1 = new com.google.common.collect.Multisets$5
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.NavigableSet elementSet() {
            r1 = this;
            java.util.NavigableSet r0 = super.elementSet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
            r1 = this;
            com.google.common.collect.TreeMultiset$2 r0 = new com.google.common.collect.TreeMultiset$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            java.util.Set r0 = super.entrySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry firstEntry() {
            r1 = this;
            com.google.common.collect.Multiset$Entry r0 = super.firstEntry()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> headMultiset(@com.google.common.collect.ParametricNullness E r5, com.google.common.collect.BoundType r6) {
            r4 = this;
            com.google.common.collect.TreeMultiset r0 = new com.google.common.collect.TreeMultiset
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r1 = r4.rootReference
            com.google.common.collect.GeneralRange<E> r2 = r4.range
            java.util.Comparator r3 = r4.comparator()
            com.google.common.collect.GeneralRange r5 = com.google.common.collect.GeneralRange.upTo(r3, r5, r6)
            com.google.common.collect.GeneralRange r5 = r2.intersect(r5)
            com.google.common.collect.TreeMultiset$AvlNode<E> r6 = r4.header
            r0.<init>(r1, r5, r6)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
            r1 = this;
            boolean r0 = super.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.util.Iterator r0 = com.google.common.collect.Multisets.iteratorImpl(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry lastEntry() {
            r1 = this;
            com.google.common.collect.Multiset$Entry r0 = super.lastEntry()
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry pollFirstEntry() {
            r1 = this;
            com.google.common.collect.Multiset$Entry r0 = super.pollFirstEntry()
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry pollLastEntry() {
            r1 = this;
            com.google.common.collect.Multiset$Entry r0 = super.pollLastEntry()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int remove(@javax.annotation.CheckForNull java.lang.Object r5, int r6) {
            r4 = this;
            java.lang.String r0 = "occurrences"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
            if (r6 != 0) goto Lc
            int r5 = r4.count(r5)
            return r5
        Lc:
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r4.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            com.google.common.collect.GeneralRange<E> r3 = r4.range     // Catch: java.lang.Throwable -> L33
            boolean r3 = r3.contains(r5)     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L33
            if (r0 != 0) goto L23
            goto L33
        L23:
            java.util.Comparator r3 = r4.comparator()     // Catch: java.lang.Throwable -> L33
            com.google.common.collect.TreeMultiset$AvlNode r5 = r0.remove(r3, r5, r6, r1)     // Catch: java.lang.Throwable -> L33
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r6 = r4.rootReference
            r6.checkAndSet(r0, r5)
            r5 = r1[r2]
            return r5
        L33:
            return r2
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int setCount(@com.google.common.collect.ParametricNullness E r5, int r6) {
            r4 = this;
            java.lang.String r0 = "count"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
            com.google.common.collect.GeneralRange<E> r0 = r4.range
            boolean r0 = r0.contains(r5)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            if (r6 != 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            com.google.common.base.Preconditions.checkArgument(r1)
            return r2
        L17:
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r4.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            if (r0 != 0) goto L27
            if (r6 <= 0) goto L26
            r4.add(r5, r6)
        L26:
            return r2
        L27:
            int[] r1 = new int[r1]
            java.util.Comparator r3 = r4.comparator()
            com.google.common.collect.TreeMultiset$AvlNode r5 = r0.setCount(r3, r5, r6, r1)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r6 = r4.rootReference
            r6.checkAndSet(r0, r5)
            r5 = r1[r2]
            return r5
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean setCount(@com.google.common.collect.ParametricNullness E r11, int r12, int r13) {
            r10 = this;
            java.lang.String r0 = "newCount"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r13, r0)
            java.lang.String r0 = "oldCount"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r12, r0)
            com.google.common.collect.GeneralRange<E> r0 = r10.range
            boolean r0 = r0.contains(r11)
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r10.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            r7 = 0
            r8 = 1
            if (r0 != 0) goto L28
            if (r12 != 0) goto L27
            if (r13 <= 0) goto L26
            r10.add(r11, r13)
        L26:
            return r8
        L27:
            return r7
        L28:
            int[] r9 = new int[r8]
            java.util.Comparator r2 = r10.comparator()
            r1 = r0
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r9
            com.google.common.collect.TreeMultiset$AvlNode r11 = r1.setCount(r2, r3, r4, r5, r6)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r13 = r10.rootReference
            r13.checkAndSet(r0, r11)
            r11 = r9[r7]
            if (r11 != r12) goto L41
            r7 = 1
        L41:
            return r7
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
            r2 = this;
            com.google.common.collect.TreeMultiset$Aggregate r0 = com.google.common.collect.TreeMultiset.Aggregate.SIZE
            long r0 = r2.aggregateForEntries(r0)
            int r0 = com.google.common.primitives.Ints.saturatedCast(r0)
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset subMultiset(@com.google.common.collect.ParametricNullness java.lang.Object r1, com.google.common.collect.BoundType r2, @com.google.common.collect.ParametricNullness java.lang.Object r3, com.google.common.collect.BoundType r4) {
            r0 = this;
            com.google.common.collect.SortedMultiset r1 = super.subMultiset(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> tailMultiset(@com.google.common.collect.ParametricNullness E r5, com.google.common.collect.BoundType r6) {
            r4 = this;
            com.google.common.collect.TreeMultiset r0 = new com.google.common.collect.TreeMultiset
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r1 = r4.rootReference
            com.google.common.collect.GeneralRange<E> r2 = r4.range
            java.util.Comparator r3 = r4.comparator()
            com.google.common.collect.GeneralRange r5 = com.google.common.collect.GeneralRange.downTo(r3, r5, r6)
            com.google.common.collect.GeneralRange r5 = r2.intersect(r5)
            com.google.common.collect.TreeMultiset$AvlNode<E> r6 = r4.header
            r0.<init>(r1, r5, r6)
            return r0
    }
}
