package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
class StandardNetwork<N, E> extends com.google.common.graph.AbstractNetwork<N, E> {
    private final boolean allowsParallelEdges;
    private final boolean allowsSelfLoops;
    private final com.google.common.graph.ElementOrder<E> edgeOrder;
    public final com.google.common.graph.MapIteratorCache<E, N> edgeToReferenceNode;
    private final boolean isDirected;
    public final com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> nodeConnections;
    private final com.google.common.graph.ElementOrder<N> nodeOrder;

    public StandardNetwork(com.google.common.graph.NetworkBuilder<? super N, ? super E> r2, java.util.Map<N, com.google.common.graph.NetworkConnections<N, E>> r3, java.util.Map<E, N> r4) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.directed
            r1.isDirected = r0
            boolean r0 = r2.allowsParallelEdges
            r1.allowsParallelEdges = r0
            boolean r0 = r2.allowsSelfLoops
            r1.allowsSelfLoops = r0
            com.google.common.graph.ElementOrder<N> r0 = r2.nodeOrder
            java.util.Objects.requireNonNull(r0)
            r1.nodeOrder = r0
            com.google.common.graph.ElementOrder<? super E> r2 = r2.edgeOrder
            java.util.Objects.requireNonNull(r2)
            r1.edgeOrder = r2
            boolean r2 = r3 instanceof java.util.TreeMap
            if (r2 == 0) goto L27
            com.google.common.graph.MapRetrievalCache r2 = new com.google.common.graph.MapRetrievalCache
            r2.<init>(r3)
            goto L2c
        L27:
            com.google.common.graph.MapIteratorCache r2 = new com.google.common.graph.MapIteratorCache
            r2.<init>(r3)
        L2c:
            r1.nodeConnections = r2
            com.google.common.graph.MapIteratorCache r2 = new com.google.common.graph.MapIteratorCache
            r2.<init>(r4)
            r1.edgeToReferenceNode = r2
            return
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<N> adjacentNodes(N r1) {
            r0 = this;
            com.google.common.graph.NetworkConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.adjacentNodes()
            return r1
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
            r1 = this;
            boolean r0 = r1.allowsParallelEdges
            return r0
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
            r1 = this;
            boolean r0 = r1.allowsSelfLoops
            return r0
    }

    public final com.google.common.graph.NetworkConnections<N, E> checkedConnections(N r4) {
            r3 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r0 = r3.nodeConnections
            java.lang.Object r0 = r0.get(r4)
            com.google.common.graph.NetworkConnections r0 = (com.google.common.graph.NetworkConnections) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Node %s is not an element of this graph."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.ElementOrder<E> edgeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder<E> r0 = r1.edgeOrder
            return r0
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> edges() {
            r2 = this;
            com.google.common.graph.MapIteratorCache<E, N> r0 = r2.edgeToReferenceNode
            java.util.Objects.requireNonNull(r0)
            com.google.common.graph.MapIteratorCache$1 r1 = new com.google.common.graph.MapIteratorCache$1
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(N r3, N r4) {
            r2 = this;
            com.google.common.graph.NetworkConnections r0 = r2.checkedConnections(r3)
            boolean r1 = r2.allowsSelfLoops
            if (r1 != 0) goto Lf
            if (r3 != r4) goto Lf
            com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of()
            return r3
        Lf:
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r3 = r2.nodeConnections
            boolean r3 = r3.containsKey(r4)
            java.lang.String r1 = "Node %s is not an element of this graph."
            com.google.common.base.Preconditions.checkArgument(r3, r1, r4)
            java.util.Set r3 = r0.edgesConnecting(r4)
            return r3
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> inEdges(N r1) {
            r0 = this;
            com.google.common.graph.NetworkConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.inEdges()
            return r1
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> incidentEdges(N r1) {
            r0 = this;
            com.google.common.graph.NetworkConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.incidentEdges()
            return r1
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.EndpointPair<N> incidentNodes(E r4) {
            r3 = this;
            com.google.common.graph.MapIteratorCache<E, N> r0 = r3.edgeToReferenceNode
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L1e
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r1 = r3.nodeConnections
            java.lang.Object r1 = r1.get(r0)
            com.google.common.graph.NetworkConnections r1 = (com.google.common.graph.NetworkConnections) r1
            java.util.Objects.requireNonNull(r1)
            com.google.common.graph.NetworkConnections r1 = (com.google.common.graph.NetworkConnections) r1
            java.lang.Object r4 = r1.adjacentNode(r4)
            com.google.common.graph.EndpointPair r4 = com.google.common.graph.EndpointPair.of(r3, r0, r4)
            return r4
        L1e:
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Edge %s is not an element of this graph."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
            r1 = this;
            boolean r0 = r1.isDirected
            return r0
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder<N> r0 = r1.nodeOrder
            return r0
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<N> nodes() {
            r2 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r0 = r2.nodeConnections
            java.util.Objects.requireNonNull(r0)
            com.google.common.graph.MapIteratorCache$1 r1 = new com.google.common.graph.MapIteratorCache$1
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> outEdges(N r1) {
            r0 = this;
            com.google.common.graph.NetworkConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.outEdges()
            return r1
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.predecessors(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public java.util.Set<N> predecessors(N r1) {
            r0 = this;
            com.google.common.graph.NetworkConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.predecessors()
            return r1
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.successors(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public java.util.Set<N> successors(N r1) {
            r0 = this;
            com.google.common.graph.NetworkConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.successors()
            return r1
    }
}
