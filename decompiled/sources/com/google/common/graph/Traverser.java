package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
@com.google.errorprone.annotations.DoNotMock("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
public abstract class Traverser<N> {
    private final com.google.common.graph.SuccessorsFunction<N> successorFunction;






    /* JADX INFO: loaded from: classes2.dex */
    public static abstract enum InsertionOrder extends java.lang.Enum<com.google.common.graph.Traverser.InsertionOrder> {
        private static final /* synthetic */ com.google.common.graph.Traverser.InsertionOrder[] $VALUES = null;
        public static final com.google.common.graph.Traverser.InsertionOrder BACK = null;
        public static final com.google.common.graph.Traverser.InsertionOrder FRONT = null;



        private static /* synthetic */ com.google.common.graph.Traverser.InsertionOrder[] $values() {
                r0 = 2
                com.google.common.graph.Traverser$InsertionOrder[] r0 = new com.google.common.graph.Traverser.InsertionOrder[r0]
                com.google.common.graph.Traverser$InsertionOrder r1 = com.google.common.graph.Traverser.InsertionOrder.FRONT
                r2 = 0
                r0[r2] = r1
                com.google.common.graph.Traverser$InsertionOrder r1 = com.google.common.graph.Traverser.InsertionOrder.BACK
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.graph.Traverser$InsertionOrder$1 r0 = new com.google.common.graph.Traverser$InsertionOrder$1
                r0.<init>()
                com.google.common.graph.Traverser.InsertionOrder.FRONT = r0
                com.google.common.graph.Traverser$InsertionOrder$2 r0 = new com.google.common.graph.Traverser$InsertionOrder$2
                r0.<init>()
                com.google.common.graph.Traverser.InsertionOrder.BACK = r0
                com.google.common.graph.Traverser$InsertionOrder[] r0 = $values()
                com.google.common.graph.Traverser.InsertionOrder.$VALUES = r0
                return
        }

        private InsertionOrder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ InsertionOrder(java.lang.String r1, int r2, com.google.common.graph.Traverser.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.graph.Traverser.InsertionOrder valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.graph.Traverser$InsertionOrder> r0 = com.google.common.graph.Traverser.InsertionOrder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.graph.Traverser$InsertionOrder r1 = (com.google.common.graph.Traverser.InsertionOrder) r1
                return r1
        }

        public static com.google.common.graph.Traverser.InsertionOrder[] values() {
                com.google.common.graph.Traverser$InsertionOrder[] r0 = com.google.common.graph.Traverser.InsertionOrder.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.graph.Traverser$InsertionOrder[] r0 = (com.google.common.graph.Traverser.InsertionOrder[]) r0
                return r0
        }

        public abstract <T> void insertInto(java.util.Deque<T> r1, T r2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class Traversal<N> {
        public final com.google.common.graph.SuccessorsFunction<N> successorFunction;





        public Traversal(com.google.common.graph.SuccessorsFunction<N> r1) {
                r0 = this;
                r0.<init>()
                r0.successorFunction = r1
                return
        }

        private java.util.Iterator<N> topDown(java.util.Iterator<? extends N> r2, com.google.common.graph.Traverser.InsertionOrder r3) {
                r1 = this;
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r0.add(r2)
                com.google.common.graph.Traverser$Traversal$3 r2 = new com.google.common.graph.Traverser$Traversal$3
                r2.<init>(r1, r0, r3)
                return r2
        }

        public final java.util.Iterator<N> breadthFirst(java.util.Iterator<? extends N> r2) {
                r1 = this;
                com.google.common.graph.Traverser$InsertionOrder r0 = com.google.common.graph.Traverser.InsertionOrder.BACK
                java.util.Iterator r2 = r1.topDown(r2, r0)
                return r2
        }

        public final java.util.Iterator<N> preOrder(java.util.Iterator<? extends N> r2) {
                r1 = this;
                com.google.common.graph.Traverser$InsertionOrder r0 = com.google.common.graph.Traverser.InsertionOrder.FRONT
                java.util.Iterator r2 = r1.topDown(r2, r0)
                return r2
        }

        @javax.annotation.CheckForNull
        public abstract N visitNext(java.util.Deque<java.util.Iterator<? extends N>> r1);
    }

    private Traverser(com.google.common.graph.SuccessorsFunction<N> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.graph.SuccessorsFunction r1 = (com.google.common.graph.SuccessorsFunction) r1
            r0.successorFunction = r1
            return
    }

    public /* synthetic */ Traverser(com.google.common.graph.SuccessorsFunction r1, com.google.common.graph.Traverser.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static <N> com.google.common.graph.Traverser<N> forGraph(com.google.common.graph.SuccessorsFunction<N> r1) {
            com.google.common.graph.Traverser$1 r0 = new com.google.common.graph.Traverser$1
            r0.<init>(r1, r1)
            return r0
    }

    public static <N> com.google.common.graph.Traverser<N> forTree(com.google.common.graph.SuccessorsFunction<N> r2) {
            boolean r0 = r2 instanceof com.google.common.graph.BaseGraph
            if (r0 == 0) goto L10
            r0 = r2
            com.google.common.graph.BaseGraph r0 = (com.google.common.graph.BaseGraph) r0
            boolean r0 = r0.isDirected()
            java.lang.String r1 = "Undirected graphs can never be trees."
            com.google.common.base.Preconditions.checkArgument(r0, r1)
        L10:
            boolean r0 = r2 instanceof com.google.common.graph.Network
            if (r0 == 0) goto L20
            r0 = r2
            com.google.common.graph.Network r0 = (com.google.common.graph.Network) r0
            boolean r0 = r0.isDirected()
            java.lang.String r1 = "Undirected networks can never be trees."
            com.google.common.base.Preconditions.checkArgument(r0, r1)
        L20:
            com.google.common.graph.Traverser$2 r0 = new com.google.common.graph.Traverser$2
            r0.<init>(r2, r2)
            return r0
    }

    private com.google.common.collect.ImmutableSet<N> validate(java.lang.Iterable<? extends N> r4) {
            r3 = this;
            com.google.common.collect.ImmutableSet r4 = com.google.common.collect.ImmutableSet.copyOf(r4)
            com.google.common.collect.UnmodifiableIterator r0 = r4.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.common.graph.SuccessorsFunction<N> r2 = r3.successorFunction
            r2.successors(r1)
            goto L8
        L18:
            return r4
    }

    public final java.lang.Iterable<N> breadthFirst(java.lang.Iterable<? extends N> r2) {
            r1 = this;
            com.google.common.collect.ImmutableSet r2 = r1.validate(r2)
            com.google.common.graph.Traverser$3 r0 = new com.google.common.graph.Traverser$3
            r0.<init>(r1, r2)
            return r0
    }

    public final java.lang.Iterable<N> breadthFirst(N r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.of(r1)
            java.lang.Iterable r1 = r0.breadthFirst(r1)
            return r1
    }

    public final java.lang.Iterable<N> depthFirstPostOrder(java.lang.Iterable<? extends N> r2) {
            r1 = this;
            com.google.common.collect.ImmutableSet r2 = r1.validate(r2)
            com.google.common.graph.Traverser$5 r0 = new com.google.common.graph.Traverser$5
            r0.<init>(r1, r2)
            return r0
    }

    public final java.lang.Iterable<N> depthFirstPostOrder(N r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.of(r1)
            java.lang.Iterable r1 = r0.depthFirstPostOrder(r1)
            return r1
    }

    public final java.lang.Iterable<N> depthFirstPreOrder(java.lang.Iterable<? extends N> r2) {
            r1 = this;
            com.google.common.collect.ImmutableSet r2 = r1.validate(r2)
            com.google.common.graph.Traverser$4 r0 = new com.google.common.graph.Traverser$4
            r0.<init>(r1, r2)
            return r0
    }

    public final java.lang.Iterable<N> depthFirstPreOrder(N r1) {
            r0 = this;
            com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.of(r1)
            java.lang.Iterable r1 = r0.depthFirstPreOrder(r1)
            return r1
    }

    public abstract com.google.common.graph.Traverser.Traversal<N> newTraversal();
}
