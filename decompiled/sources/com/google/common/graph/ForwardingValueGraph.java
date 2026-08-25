package com.google.common.graph;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class ForwardingValueGraph<N, V> extends com.google.common.graph.AbstractValueGraph<N, V> {
    public ForwardingValueGraph() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> adjacentNodes(N r2) {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            java.util.Set r2 = r0.adjacentNodes(r2)
            return r2
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            boolean r0 = r0.allowsSelfLoops()
            return r0
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int degree(N r2) {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            int r2 = r0.degree(r2)
            return r2
    }

    public abstract com.google.common.graph.ValueGraph<N, V> delegate();

    @Override // com.google.common.graph.AbstractBaseGraph
    public final long edgeCount() {
            r2 = this;
            com.google.common.graph.ValueGraph r0 = r2.delegate()
            java.util.Set r0 = r0.edges()
            int r0 = r0.size()
            long r0 = (long) r0
            return r0
    }

    @Override // com.google.common.graph.ValueGraph
    @javax.annotation.CheckForNull
    public V edgeValueOrDefault(com.google.common.graph.EndpointPair<N> r2, @javax.annotation.CheckForNull V r3) {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            java.lang.Object r2 = r0.edgeValueOrDefault(r2, r3)
            return r2
    }

    @Override // com.google.common.graph.ValueGraph
    @javax.annotation.CheckForNull
    public V edgeValueOrDefault(N r2, N r3, @javax.annotation.CheckForNull V r4) {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            java.lang.Object r2 = r0.edgeValueOrDefault(r2, r3, r4)
            return r2
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r2) {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            boolean r2 = r0.hasEdgeConnecting(r2)
            return r2
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N r2, N r3) {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            boolean r2 = r0.hasEdgeConnecting(r2, r3)
            return r2
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int inDegree(N r2) {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            int r2 = r0.inDegree(r2)
            return r2
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            com.google.common.graph.ElementOrder r0 = r0.incidentEdgeOrder()
            return r0
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            boolean r0 = r0.isDirected()
            return r0
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            com.google.common.graph.ElementOrder r0 = r0.nodeOrder()
            return r0
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> nodes() {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            java.util.Set r0 = r0.nodes()
            return r0
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int outDegree(N r2) {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            int r2 = r0.outDegree(r2)
            return r2
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.predecessors(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public java.util.Set<N> predecessors(N r2) {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            java.util.Set r2 = r0.predecessors(r2)
            return r2
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.successors(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public java.util.Set<N> successors(N r2) {
            r1 = this;
            com.google.common.graph.ValueGraph r0 = r1.delegate()
            java.util.Set r2 = r0.successors(r2)
            return r2
    }
}
