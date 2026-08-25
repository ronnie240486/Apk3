package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public abstract class AbstractValueGraph<N, V> extends com.google.common.graph.AbstractBaseGraph<N> implements com.google.common.graph.ValueGraph<N, V> {



    public AbstractValueGraph() {
            r0 = this;
            r0.<init>()
            return
    }

    private static <N, V> java.util.Map<com.google.common.graph.EndpointPair<N>, V> edgeValueMap(com.google.common.graph.ValueGraph<N, V> r1) {
            com.google.common.graph.AbstractValueGraph$2 r0 = new com.google.common.graph.AbstractValueGraph$2
            r0.<init>(r1)
            java.util.Set r1 = r1.edges()
            java.util.Map r1 = com.google.common.collect.Maps.asMap(r1, r0)
            return r1
    }

    @Override // com.google.common.graph.ValueGraph
    public com.google.common.graph.Graph<N> asGraph() {
            r1 = this;
            com.google.common.graph.AbstractValueGraph$1 r0 = new com.google.common.graph.AbstractValueGraph$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int degree(java.lang.Object r1) {
            r0 = this;
            int r1 = super.degree(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ java.util.Set edges() {
            r1 = this;
            java.util.Set r0 = super.edges()
            return r0
    }

    @Override // com.google.common.graph.ValueGraph
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.graph.ValueGraph
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.common.graph.ValueGraph r5 = (com.google.common.graph.ValueGraph) r5
            boolean r1 = r4.isDirected()
            boolean r3 = r5.isDirected()
            if (r1 != r3) goto L33
            java.util.Set r1 = r4.nodes()
            java.util.Set r3 = r5.nodes()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L33
            java.util.Map r1 = edgeValueMap(r4)
            java.util.Map r5 = edgeValueMap(r5)
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(com.google.common.graph.EndpointPair r1) {
            r0 = this;
            boolean r1 = super.hasEdgeConnecting(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.hasEdgeConnecting(r1, r2)
            return r1
    }

    @Override // com.google.common.graph.ValueGraph
    public final int hashCode() {
            r1 = this;
            java.util.Map r0 = edgeValueMap(r1)
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int inDegree(java.lang.Object r1) {
            r0 = this;
            int r1 = super.inDegree(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder incidentEdgeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder r0 = super.incidentEdgeOrder()
            return r0
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ java.util.Set incidentEdges(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.incidentEdges(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int outDegree(java.lang.Object r1) {
            r0 = this;
            int r1 = super.outDegree(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
            r0 = this;
            java.lang.Iterable r1 = com.google.common.graph.ValueGraph.CC.$default$predecessors(r0, r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
            r0 = this;
            java.lang.Iterable r1 = com.google.common.graph.ValueGraph.CC.$default$successors(r0, r1)
            return r1
    }

    public java.lang.String toString() {
            r6 = this;
            boolean r0 = r6.isDirected()
            boolean r1 = r6.allowsSelfLoops()
            java.util.Set r2 = r6.nodes()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.util.Map r3 = edgeValueMap(r6)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r2.length()
            int r4 = r4 + 59
            int r5 = r3.length()
            int r5 = r5 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.String r5 = "isDirected: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ", allowsSelfLoops: "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ", nodes: "
            java.lang.String r1 = ", edges: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0, r2, r1, r3)
            return r0
    }
}
