package com.google.common.graph;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.DoNotMock("Use NetworkBuilder to create a real instance")
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public interface Network<N, E> extends com.google.common.graph.SuccessorsFunction<N>, com.google.common.graph.PredecessorsFunction<N> {

    /* JADX INFO: renamed from: com.google.common.graph.Network$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<N, E> {
        public static /* bridge */ /* synthetic */ java.lang.Iterable $default$predecessors(com.google.common.graph.Network r0, java.lang.Object r1) {
                java.util.Set r0 = r0.predecessors(r1)
                return r0
        }

        public static /* bridge */ /* synthetic */ java.lang.Iterable $default$successors(com.google.common.graph.Network r0, java.lang.Object r1) {
                java.util.Set r0 = r0.successors(r1)
                return r0
        }
    }

    java.util.Set<E> adjacentEdges(E r1);

    java.util.Set<N> adjacentNodes(N r1);

    boolean allowsParallelEdges();

    boolean allowsSelfLoops();

    com.google.common.graph.Graph<N> asGraph();

    int degree(N r1);

    @javax.annotation.CheckForNull
    E edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> r1);

    @javax.annotation.CheckForNull
    E edgeConnectingOrNull(N r1, N r2);

    com.google.common.graph.ElementOrder<E> edgeOrder();

    java.util.Set<E> edges();

    java.util.Set<E> edgesConnecting(com.google.common.graph.EndpointPair<N> r1);

    java.util.Set<E> edgesConnecting(N r1, N r2);

    boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

    boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r1);

    boolean hasEdgeConnecting(N r1, N r2);

    int hashCode();

    int inDegree(N r1);

    java.util.Set<E> inEdges(N r1);

    java.util.Set<E> incidentEdges(N r1);

    com.google.common.graph.EndpointPair<N> incidentNodes(E r1);

    boolean isDirected();

    com.google.common.graph.ElementOrder<N> nodeOrder();

    java.util.Set<N> nodes();

    int outDegree(N r1);

    java.util.Set<E> outEdges(N r1);

    /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1);

    @Override // com.google.common.graph.PredecessorsFunction
    java.util.Set<N> predecessors(N r1);

    @Override // com.google.common.graph.SuccessorsFunction
    /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1);

    @Override // com.google.common.graph.SuccessorsFunction
    java.util.Set<N> successors(N r1);
}
