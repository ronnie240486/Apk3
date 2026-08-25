package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"N"})
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public class ImmutableGraph<N> extends com.google.common.graph.ForwardingGraph<N> {
    private final com.google.common.graph.BaseGraph<N> backingGraph;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder<N> {
        private final com.google.common.graph.MutableGraph<N> mutableGraph;

        public Builder(com.google.common.graph.GraphBuilder<N> r2) {
                r1 = this;
                r1.<init>()
                com.google.common.graph.GraphBuilder r2 = r2.copy()
                com.google.common.graph.ElementOrder r0 = com.google.common.graph.ElementOrder.stable()
                com.google.common.graph.GraphBuilder r2 = r2.incidentEdgeOrder(r0)
                com.google.common.graph.MutableGraph r2 = r2.build()
                r1.mutableGraph = r2
                return
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.graph.ImmutableGraph.Builder<N> addNode(N r2) {
                r1 = this;
                com.google.common.graph.MutableGraph<N> r0 = r1.mutableGraph
                r0.addNode(r2)
                return r1
        }

        public com.google.common.graph.ImmutableGraph<N> build() {
                r1 = this;
                com.google.common.graph.MutableGraph<N> r0 = r1.mutableGraph
                com.google.common.graph.ImmutableGraph r0 = com.google.common.graph.ImmutableGraph.copyOf(r0)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.graph.ImmutableGraph.Builder<N> putEdge(com.google.common.graph.EndpointPair<N> r2) {
                r1 = this;
                com.google.common.graph.MutableGraph<N> r0 = r1.mutableGraph
                r0.putEdge(r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.graph.ImmutableGraph.Builder<N> putEdge(N r2, N r3) {
                r1 = this;
                com.google.common.graph.MutableGraph<N> r0 = r1.mutableGraph
                r0.putEdge(r2, r3)
                return r1
        }
    }

    public ImmutableGraph(com.google.common.graph.BaseGraph<N> r1) {
            r0 = this;
            r0.<init>()
            r0.backingGraph = r1
            return
    }

    private static <N> com.google.common.graph.GraphConnections<N, com.google.common.graph.GraphConstants.Presence> connectionsOf(com.google.common.graph.Graph<N> r2, N r3) {
            com.google.common.graph.GraphConstants$Presence r0 = com.google.common.graph.GraphConstants.Presence.EDGE_EXISTS
            com.google.common.base.Function r0 = com.google.common.base.Functions.constant(r0)
            boolean r1 = r2.isDirected()
            if (r1 == 0) goto L15
            java.util.Set r2 = r2.incidentEdges(r3)
            com.google.common.graph.DirectedGraphConnections r2 = com.google.common.graph.DirectedGraphConnections.ofImmutable(r3, r2, r0)
            goto L21
        L15:
            java.util.Set r2 = r2.adjacentNodes(r3)
            java.util.Map r2 = com.google.common.collect.Maps.asMap(r2, r0)
            com.google.common.graph.UndirectedGraphConnections r2 = com.google.common.graph.UndirectedGraphConnections.ofImmutable(r2)
        L21:
            return r2
    }

    public static <N> com.google.common.graph.ImmutableGraph<N> copyOf(com.google.common.graph.Graph<N> r6) {
            boolean r0 = r6 instanceof com.google.common.graph.ImmutableGraph
            if (r0 == 0) goto L7
            com.google.common.graph.ImmutableGraph r6 = (com.google.common.graph.ImmutableGraph) r6
            goto L23
        L7:
            com.google.common.graph.ImmutableGraph r0 = new com.google.common.graph.ImmutableGraph
            com.google.common.graph.StandardValueGraph r1 = new com.google.common.graph.StandardValueGraph
            com.google.common.graph.GraphBuilder r2 = com.google.common.graph.GraphBuilder.from(r6)
            com.google.common.collect.ImmutableMap r3 = getNodeConnections(r6)
            java.util.Set r6 = r6.edges()
            int r6 = r6.size()
            long r4 = (long) r6
            r1.<init>(r2, r3, r4)
            r0.<init>(r1)
            r6 = r0
        L23:
            return r6
    }

    @java.lang.Deprecated
    public static <N> com.google.common.graph.ImmutableGraph<N> copyOf(com.google.common.graph.ImmutableGraph<N> r0) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            com.google.common.graph.ImmutableGraph r0 = (com.google.common.graph.ImmutableGraph) r0
            return r0
    }

    private static <N> com.google.common.collect.ImmutableMap<N, com.google.common.graph.GraphConnections<N, com.google.common.graph.GraphConstants.Presence>> getNodeConnections(com.google.common.graph.Graph<N> r4) {
            com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
            java.util.Set r1 = r4.nodes()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            com.google.common.graph.GraphConnections r3 = connectionsOf(r4, r2)
            r0.put(r2, r3)
            goto Lc
        L1e:
            com.google.common.collect.ImmutableMap r4 = r0.build()
            return r4
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set adjacentNodes(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.adjacentNodes(r1)
            return r1
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
            r1 = this;
            boolean r0 = super.allowsSelfLoops()
            return r0
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int degree(java.lang.Object r1) {
            r0 = this;
            int r1 = super.degree(r1)
            return r1
    }

    @Override // com.google.common.graph.ForwardingGraph
    public final com.google.common.graph.BaseGraph<N> delegate() {
            r1 = this;
            com.google.common.graph.BaseGraph<N> r0 = r1.backingGraph
            return r0
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(com.google.common.graph.EndpointPair r1) {
            r0 = this;
            boolean r1 = super.hasEdgeConnecting(r1)
            return r1
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.hasEdgeConnecting(r1, r2)
            return r1
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int inDegree(java.lang.Object r1) {
            r0 = this;
            int r1 = super.inDegree(r1)
            return r1
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder r0 = com.google.common.graph.ElementOrder.stable()
            return r0
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ java.util.Set incidentEdges(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.incidentEdges(r1)
            return r1
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean isDirected() {
            r1 = this;
            boolean r0 = super.isDirected()
            return r0
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder nodeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder r0 = super.nodeOrder()
            return r0
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set nodes() {
            r1 = this;
            java.util.Set r0 = super.nodes()
            return r0
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int outDegree(java.lang.Object r1) {
            r0 = this;
            int r1 = super.outDegree(r1)
            return r1
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.util.Set predecessors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.predecessors(r1)
            return r1
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.util.Set successors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.successors(r1)
            return r1
    }
}
