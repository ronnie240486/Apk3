package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
class StandardValueGraph<N, V> extends com.google.common.graph.AbstractValueGraph<N, V> {
    private final boolean allowsSelfLoops;
    public long edgeCount;
    private final boolean isDirected;
    public final com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> nodeConnections;
    private final com.google.common.graph.ElementOrder<N> nodeOrder;


    public StandardValueGraph(com.google.common.graph.AbstractGraphBuilder<? super N> r2, java.util.Map<N, com.google.common.graph.GraphConnections<N, V>> r3, long r4) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.directed
            r1.isDirected = r0
            boolean r0 = r2.allowsSelfLoops
            r1.allowsSelfLoops = r0
            com.google.common.graph.ElementOrder<N> r2 = r2.nodeOrder
            java.util.Objects.requireNonNull(r2)
            r1.nodeOrder = r2
            boolean r2 = r3 instanceof java.util.TreeMap
            if (r2 == 0) goto L1c
            com.google.common.graph.MapRetrievalCache r2 = new com.google.common.graph.MapRetrievalCache
            r2.<init>(r3)
            goto L21
        L1c:
            com.google.common.graph.MapIteratorCache r2 = new com.google.common.graph.MapIteratorCache
            r2.<init>(r3)
        L21:
            r1.nodeConnections = r2
            com.google.common.graph.Graphs.checkNonNegative(r4)
            r1.edgeCount = r4
            return
    }

    private final com.google.common.graph.GraphConnections<N, V> checkedConnections(N r5) {
            r4 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r4.nodeConnections
            java.lang.Object r0 = r0.get(r5)
            com.google.common.graph.GraphConnections r0 = (com.google.common.graph.GraphConnections) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            com.google.common.base.Preconditions.checkNotNull(r5)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r1 = r5.length()
            int r1 = r1 + 38
            java.lang.String r2 = "Node "
            java.lang.String r3 = " is not an element of this graph."
            java.lang.String r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r5, r3)
            r0.<init>(r5)
            throw r0
    }

    @javax.annotation.CheckForNull
    private final V edgeValueOrDefaultInternal(N r2, N r3, @javax.annotation.CheckForNull V r4) {
            r1 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r1.nodeConnections
            java.lang.Object r2 = r0.get(r2)
            com.google.common.graph.GraphConnections r2 = (com.google.common.graph.GraphConnections) r2
            if (r2 != 0) goto Lc
            r2 = 0
            goto L10
        Lc:
            java.lang.Object r2 = r2.value(r3)
        L10:
            if (r2 != 0) goto L13
            return r4
        L13:
            return r2
    }

    private final boolean hasEdgeConnectingInternal(N r2, N r3) {
            r1 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r1.nodeConnections
            java.lang.Object r2 = r0.get(r2)
            com.google.common.graph.GraphConnections r2 = (com.google.common.graph.GraphConnections) r2
            if (r2 == 0) goto L16
            java.util.Set r2 = r2.successors()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> adjacentNodes(N r1) {
            r0 = this;
            com.google.common.graph.GraphConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.adjacentNodes()
            return r1
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
            r1 = this;
            boolean r0 = r1.allowsSelfLoops
            return r0
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    public final long edgeCount() {
            r2 = this;
            long r0 = r2.edgeCount
            return r0
    }

    @javax.annotation.CheckForNull
    public V edgeValueOrDefault(com.google.common.graph.EndpointPair<N> r2, @javax.annotation.CheckForNull V r3) {
            r1 = this;
            r1.validateEndpoints(r2)
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            java.lang.Object r2 = r1.edgeValueOrDefaultInternal(r0, r2, r3)
            return r2
    }

    @javax.annotation.CheckForNull
    public V edgeValueOrDefault(N r1, N r2, @javax.annotation.CheckForNull V r3) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Object r1 = r0.edgeValueOrDefaultInternal(r1, r2, r3)
            return r1
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r1.isOrderingCompatible(r2)
            if (r0 == 0) goto L19
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            boolean r2 = r1.hasEdgeConnectingInternal(r0, r2)
            if (r2 == 0) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            return r2
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N r1, N r2) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r1 = r0.hasEdgeConnectingInternal(r1, r2)
            return r1
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N r3) {
            r2 = this;
            com.google.common.graph.GraphConnections r0 = r2.checkedConnections(r3)
            com.google.common.graph.StandardValueGraph$1 r1 = new com.google.common.graph.StandardValueGraph$1
            r1.<init>(r2, r3, r0)
            return r1
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
            r1 = this;
            boolean r0 = r1.isDirected
            return r0
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder<N> r0 = r1.nodeOrder
            return r0
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> nodes() {
            r2 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r2.nodeConnections
            java.util.Objects.requireNonNull(r0)
            com.google.common.graph.MapIteratorCache$1 r1 = new com.google.common.graph.MapIteratorCache$1
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.predecessors(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public java.util.Set<N> predecessors(N r1) {
            r0 = this;
            com.google.common.graph.GraphConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.predecessors()
            return r1
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.successors(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public java.util.Set<N> successors(N r1) {
            r0 = this;
            com.google.common.graph.GraphConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.successors()
            return r1
    }
}
