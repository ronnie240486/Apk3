package com.google.common.graph;

/* JADX INFO: loaded from: classes3.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"N", "E"})
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public final class ImmutableNetwork<N, E> extends com.google.common.graph.StandardNetwork<N, E> {




    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder<N, E> {
        private final com.google.common.graph.MutableNetwork<N, E> mutableNetwork;

        public Builder(com.google.common.graph.NetworkBuilder<N, E> r1) {
                r0 = this;
                r0.<init>()
                com.google.common.graph.MutableNetwork r1 = r1.build()
                r0.mutableNetwork = r1
                return
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.graph.ImmutableNetwork.Builder<N, E> addEdge(com.google.common.graph.EndpointPair<N> r2, E r3) {
                r1 = this;
                com.google.common.graph.MutableNetwork<N, E> r0 = r1.mutableNetwork
                r0.addEdge(r2, r3)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.graph.ImmutableNetwork.Builder<N, E> addEdge(N r2, N r3, E r4) {
                r1 = this;
                com.google.common.graph.MutableNetwork<N, E> r0 = r1.mutableNetwork
                r0.addEdge(r2, r3, r4)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.graph.ImmutableNetwork.Builder<N, E> addNode(N r2) {
                r1 = this;
                com.google.common.graph.MutableNetwork<N, E> r0 = r1.mutableNetwork
                r0.addNode(r2)
                return r1
        }

        public com.google.common.graph.ImmutableNetwork<N, E> build() {
                r1 = this;
                com.google.common.graph.MutableNetwork<N, E> r0 = r1.mutableNetwork
                com.google.common.graph.ImmutableNetwork r0 = com.google.common.graph.ImmutableNetwork.copyOf(r0)
                return r0
        }
    }

    private ImmutableNetwork(com.google.common.graph.Network<N, E> r3) {
            r2 = this;
            com.google.common.graph.NetworkBuilder r0 = com.google.common.graph.NetworkBuilder.from(r3)
            java.util.Map r1 = getNodeConnections(r3)
            java.util.Map r3 = getEdgeToReferenceNode(r3)
            r2.<init>(r0, r1, r3)
            return
    }

    private static <N, E> com.google.common.base.Function<E, N> adjacentNodeFn(com.google.common.graph.Network<N, E> r1, N r2) {
            com.google.common.graph.ImmutableNetwork$3 r0 = new com.google.common.graph.ImmutableNetwork$3
            r0.<init>(r1, r2)
            return r0
    }

    private static <N, E> com.google.common.graph.NetworkConnections<N, E> connectionsOf(com.google.common.graph.Network<N, E> r3, N r4) {
            boolean r0 = r3.isDirected()
            if (r0 == 0) goto L3f
            java.util.Set r0 = r3.inEdges(r4)
            com.google.common.base.Function r1 = sourceNodeFn(r3)
            java.util.Map r0 = com.google.common.collect.Maps.asMap(r0, r1)
            java.util.Set r1 = r3.outEdges(r4)
            com.google.common.base.Function r2 = targetNodeFn(r3)
            java.util.Map r1 = com.google.common.collect.Maps.asMap(r1, r2)
            java.util.Set r4 = r3.edgesConnecting(r4, r4)
            int r4 = r4.size()
            boolean r3 = r3.allowsParallelEdges()
            if (r3 == 0) goto L31
            com.google.common.graph.DirectedMultiNetworkConnections r3 = com.google.common.graph.DirectedMultiNetworkConnections.ofImmutable(r0, r1, r4)
            goto L3e
        L31:
            com.google.common.graph.DirectedNetworkConnections r3 = new com.google.common.graph.DirectedNetworkConnections
            com.google.common.collect.ImmutableBiMap r0 = com.google.common.collect.ImmutableBiMap.copyOf(r0)
            com.google.common.collect.ImmutableBiMap r1 = com.google.common.collect.ImmutableBiMap.copyOf(r1)
            r3.<init>(r0, r1, r4)
        L3e:
            return r3
        L3f:
            java.util.Set r0 = r3.incidentEdges(r4)
            com.google.common.base.Function r4 = adjacentNodeFn(r3, r4)
            java.util.Map r4 = com.google.common.collect.Maps.asMap(r0, r4)
            boolean r3 = r3.allowsParallelEdges()
            if (r3 == 0) goto L56
            com.google.common.graph.UndirectedMultiNetworkConnections r3 = com.google.common.graph.UndirectedMultiNetworkConnections.ofImmutable(r4)
            goto L5f
        L56:
            com.google.common.graph.UndirectedNetworkConnections r3 = new com.google.common.graph.UndirectedNetworkConnections
            com.google.common.collect.ImmutableBiMap r4 = com.google.common.collect.ImmutableBiMap.copyOf(r4)
            r3.<init>(r4)
        L5f:
            return r3
    }

    @java.lang.Deprecated
    public static <N, E> com.google.common.graph.ImmutableNetwork<N, E> copyOf(com.google.common.graph.ImmutableNetwork<N, E> r0) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            com.google.common.graph.ImmutableNetwork r0 = (com.google.common.graph.ImmutableNetwork) r0
            return r0
    }

    public static <N, E> com.google.common.graph.ImmutableNetwork<N, E> copyOf(com.google.common.graph.Network<N, E> r1) {
            boolean r0 = r1 instanceof com.google.common.graph.ImmutableNetwork
            if (r0 == 0) goto L7
            com.google.common.graph.ImmutableNetwork r1 = (com.google.common.graph.ImmutableNetwork) r1
            goto Ld
        L7:
            com.google.common.graph.ImmutableNetwork r0 = new com.google.common.graph.ImmutableNetwork
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }

    private static <N, E> java.util.Map<E, N> getEdgeToReferenceNode(com.google.common.graph.Network<N, E> r4) {
            com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
            java.util.Set r1 = r4.edges()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            com.google.common.graph.EndpointPair r3 = r4.incidentNodes(r2)
            java.lang.Object r3 = r3.nodeU()
            r0.put(r2, r3)
            goto Lc
        L22:
            com.google.common.collect.ImmutableMap r4 = r0.build()
            return r4
    }

    private static <N, E> java.util.Map<N, com.google.common.graph.NetworkConnections<N, E>> getNodeConnections(com.google.common.graph.Network<N, E> r4) {
            com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
            java.util.Set r1 = r4.nodes()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            com.google.common.graph.NetworkConnections r3 = connectionsOf(r4, r2)
            r0.put(r2, r3)
            goto Lc
        L1e:
            com.google.common.collect.ImmutableMap r4 = r0.build()
            return r4
    }

    private static <N, E> com.google.common.base.Function<E, N> sourceNodeFn(com.google.common.graph.Network<N, E> r1) {
            com.google.common.graph.ImmutableNetwork$1 r0 = new com.google.common.graph.ImmutableNetwork$1
            r0.<init>(r1)
            return r0
    }

    private static <N, E> com.google.common.base.Function<E, N> targetNodeFn(com.google.common.graph.Network<N, E> r1) {
            com.google.common.graph.ImmutableNetwork$2 r0 = new com.google.common.graph.ImmutableNetwork$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set adjacentNodes(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.adjacentNodes(r1)
            return r1
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean allowsParallelEdges() {
            r1 = this;
            boolean r0 = super.allowsParallelEdges()
            return r0
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
            r1 = this;
            boolean r0 = super.allowsSelfLoops()
            return r0
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ com.google.common.graph.Graph asGraph() {
            r1 = this;
            com.google.common.graph.ImmutableGraph r0 = r1.asGraph()
            return r0
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public com.google.common.graph.ImmutableGraph<N> asGraph() {
            r2 = this;
            com.google.common.graph.ImmutableGraph r0 = new com.google.common.graph.ImmutableGraph
            com.google.common.graph.Graph r1 = super.asGraph()
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder edgeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder r0 = super.edgeOrder()
            return r0
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set edges() {
            r1 = this;
            java.util.Set r0 = super.edges()
            return r0
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set edgesConnecting(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.util.Set r1 = super.edgesConnecting(r1, r2)
            return r1
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set inEdges(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.inEdges(r1)
            return r1
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set incidentEdges(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.incidentEdges(r1)
            return r1
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ com.google.common.graph.EndpointPair incidentNodes(java.lang.Object r1) {
            r0 = this;
            com.google.common.graph.EndpointPair r1 = super.incidentNodes(r1)
            return r1
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean isDirected() {
            r1 = this;
            boolean r0 = super.isDirected()
            return r0
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder nodeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder r0 = super.nodeOrder()
            return r0
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set nodes() {
            r1 = this;
            java.util.Set r0 = super.nodes()
            return r0
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ java.util.Set outEdges(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.outEdges(r1)
            return r1
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.util.Set predecessors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.predecessors(r1)
            return r1
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.util.Set successors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.successors(r1)
            return r1
    }
}
