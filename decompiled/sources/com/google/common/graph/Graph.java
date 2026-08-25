package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.DoNotMock("Use GraphBuilder to create a real instance")
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public interface Graph<N> extends com.google.common.graph.BaseGraph<N> {

    /* JADX INFO: renamed from: com.google.common.graph.Graph$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<N> {
        public static /* bridge */ /* synthetic */ java.lang.Iterable $default$predecessors(com.google.common.graph.Graph r0, java.lang.Object r1) {
                java.util.Set r0 = r0.predecessors(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ java.lang.Iterable $default$successors(com.google.common.graph.Graph r0, java.lang.Object r1) {
                java.util.Set r0 = r0.successors(r1)
                return r0
        }
    }

    java.util.Set<N> adjacentNodes(N r1);

    boolean allowsSelfLoops();

    @Override // com.google.common.graph.BaseGraph
    int degree(N r1);

    @Override // com.google.common.graph.BaseGraph
    java.util.Set<com.google.common.graph.EndpointPair<N>> edges();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r1);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(N r1, N r2);

    int hashCode();

    @Override // com.google.common.graph.BaseGraph
    int inDegree(N r1);

    @Override // com.google.common.graph.BaseGraph
    com.google.common.graph.ElementOrder<N> incidentEdgeOrder();

    @Override // com.google.common.graph.BaseGraph
    java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N r1);

    boolean isDirected();

    com.google.common.graph.ElementOrder<N> nodeOrder();

    java.util.Set<N> nodes();

    @Override // com.google.common.graph.BaseGraph
    int outDegree(N r1);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    java.util.Set<N> predecessors(N r1);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    java.util.Set<N> successors(N r1);
}
