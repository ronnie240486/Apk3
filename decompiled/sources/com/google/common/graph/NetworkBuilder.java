package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public final class NetworkBuilder<N, E> extends com.google.common.graph.AbstractGraphBuilder<N> {
    public boolean allowsParallelEdges;
    public com.google.common.graph.ElementOrder<? super E> edgeOrder;
    public com.google.common.base.Optional<java.lang.Integer> expectedEdgeCount;

    private NetworkBuilder(boolean r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.allowsParallelEdges = r1
            com.google.common.graph.ElementOrder r1 = com.google.common.graph.ElementOrder.insertion()
            r0.edgeOrder = r1
            com.google.common.base.Optional r1 = com.google.common.base.Optional.absent()
            r0.expectedEdgeCount = r1
            return
    }

    private <N1 extends N, E1 extends E> com.google.common.graph.NetworkBuilder<N1, E1> cast() {
            r0 = this;
            return r0
    }

    public static com.google.common.graph.NetworkBuilder<java.lang.Object, java.lang.Object> directed() {
            com.google.common.graph.NetworkBuilder r0 = new com.google.common.graph.NetworkBuilder
            r1 = 1
            r0.<init>(r1)
            return r0
    }

    public static <N, E> com.google.common.graph.NetworkBuilder<N, E> from(com.google.common.graph.Network<N, E> r2) {
            com.google.common.graph.NetworkBuilder r0 = new com.google.common.graph.NetworkBuilder
            boolean r1 = r2.isDirected()
            r0.<init>(r1)
            boolean r1 = r2.allowsParallelEdges()
            com.google.common.graph.NetworkBuilder r0 = r0.allowsParallelEdges(r1)
            boolean r1 = r2.allowsSelfLoops()
            com.google.common.graph.NetworkBuilder r0 = r0.allowsSelfLoops(r1)
            com.google.common.graph.ElementOrder r1 = r2.nodeOrder()
            com.google.common.graph.NetworkBuilder r0 = r0.nodeOrder(r1)
            com.google.common.graph.ElementOrder r2 = r2.edgeOrder()
            com.google.common.graph.NetworkBuilder r2 = r0.edgeOrder(r2)
            return r2
    }

    public static com.google.common.graph.NetworkBuilder<java.lang.Object, java.lang.Object> undirected() {
            com.google.common.graph.NetworkBuilder r0 = new com.google.common.graph.NetworkBuilder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public com.google.common.graph.NetworkBuilder<N, E> allowsParallelEdges(boolean r1) {
            r0 = this;
            r0.allowsParallelEdges = r1
            return r0
    }

    public com.google.common.graph.NetworkBuilder<N, E> allowsSelfLoops(boolean r1) {
            r0 = this;
            r0.allowsSelfLoops = r1
            return r0
    }

    public <N1 extends N, E1 extends E> com.google.common.graph.MutableNetwork<N1, E1> build() {
            r1 = this;
            com.google.common.graph.StandardMutableNetwork r0 = new com.google.common.graph.StandardMutableNetwork
            r0.<init>(r1)
            return r0
    }

    public <E1 extends E> com.google.common.graph.NetworkBuilder<N, E1> edgeOrder(com.google.common.graph.ElementOrder<E1> r2) {
            r1 = this;
            com.google.common.graph.NetworkBuilder r0 = r1.cast()
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.graph.ElementOrder r2 = (com.google.common.graph.ElementOrder) r2
            r0.edgeOrder = r2
            return r0
    }

    public com.google.common.graph.NetworkBuilder<N, E> expectedEdgeCount(int r1) {
            r0 = this;
            com.google.common.graph.Graphs.checkNonNegative(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.common.base.Optional r1 = com.google.common.base.Optional.of(r1)
            r0.expectedEdgeCount = r1
            return r0
    }

    public com.google.common.graph.NetworkBuilder<N, E> expectedNodeCount(int r1) {
            r0 = this;
            com.google.common.graph.Graphs.checkNonNegative(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.common.base.Optional r1 = com.google.common.base.Optional.of(r1)
            r0.expectedNodeCount = r1
            return r0
    }

    public <N1 extends N, E1 extends E> com.google.common.graph.ImmutableNetwork.Builder<N1, E1> immutable() {
            r2 = this;
            com.google.common.graph.NetworkBuilder r0 = r2.cast()
            com.google.common.graph.ImmutableNetwork$Builder r1 = new com.google.common.graph.ImmutableNetwork$Builder
            r1.<init>(r0)
            return r1
    }

    public <N1 extends N> com.google.common.graph.NetworkBuilder<N1, E> nodeOrder(com.google.common.graph.ElementOrder<N1> r2) {
            r1 = this;
            com.google.common.graph.NetworkBuilder r0 = r1.cast()
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.graph.ElementOrder r2 = (com.google.common.graph.ElementOrder) r2
            r0.nodeOrder = r2
            return r0
    }
}
