package com.google.common.graph;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class ForwardingNetwork<N, E> extends com.google.common.graph.AbstractNetwork<N, E> {
    public ForwardingNetwork() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> adjacentEdges(E r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.util.Set r2 = r0.adjacentEdges(r2)
            return r2
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<N> adjacentNodes(N r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.util.Set r2 = r0.adjacentNodes(r2)
            return r2
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            boolean r0 = r0.allowsParallelEdges()
            return r0
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            boolean r0 = r0.allowsSelfLoops()
            return r0
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int degree(N r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            int r2 = r0.degree(r2)
            return r2
    }

    public abstract com.google.common.graph.Network<N, E> delegate();

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    @javax.annotation.CheckForNull
    public E edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.lang.Object r2 = r0.edgeConnectingOrNull(r2)
            return r2
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    @javax.annotation.CheckForNull
    public E edgeConnectingOrNull(N r2, N r3) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.lang.Object r2 = r0.edgeConnectingOrNull(r2, r3)
            return r2
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.ElementOrder<E> edgeOrder() {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            com.google.common.graph.ElementOrder r0 = r0.edgeOrder()
            return r0
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> edges() {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.util.Set r0 = r0.edges()
            return r0
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(com.google.common.graph.EndpointPair<N> r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.util.Set r2 = r0.edgesConnecting(r2)
            return r2
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(N r2, N r3) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.util.Set r2 = r0.edgesConnecting(r2, r3)
            return r2
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            boolean r2 = r0.hasEdgeConnecting(r2)
            return r2
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(N r2, N r3) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            boolean r2 = r0.hasEdgeConnecting(r2, r3)
            return r2
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int inDegree(N r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            int r2 = r0.inDegree(r2)
            return r2
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> inEdges(N r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.util.Set r2 = r0.inEdges(r2)
            return r2
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> incidentEdges(N r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.util.Set r2 = r0.incidentEdges(r2)
            return r2
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.EndpointPair<N> incidentNodes(E r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            com.google.common.graph.EndpointPair r2 = r0.incidentNodes(r2)
            return r2
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            boolean r0 = r0.isDirected()
            return r0
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            com.google.common.graph.ElementOrder r0 = r0.nodeOrder()
            return r0
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<N> nodes() {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.util.Set r0 = r0.nodes()
            return r0
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int outDegree(N r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            int r2 = r0.outDegree(r2)
            return r2
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> outEdges(N r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.util.Set r2 = r0.outEdges(r2)
            return r2
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.predecessors(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public java.util.Set<N> predecessors(N r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.util.Set r2 = r0.predecessors(r2)
            return r2
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.successors(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public java.util.Set<N> successors(N r2) {
            r1 = this;
            com.google.common.graph.Network r0 = r1.delegate()
            java.util.Set r2 = r0.successors(r2)
            return r2
    }
}
