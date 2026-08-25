package com.google.common.graph;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
interface NetworkConnections<N, E> {
    void addInEdge(E r1, N r2, boolean r3);

    void addOutEdge(E r1, N r2);

    N adjacentNode(E r1);

    java.util.Set<N> adjacentNodes();

    java.util.Set<E> edgesConnecting(N r1);

    java.util.Set<E> inEdges();

    java.util.Set<E> incidentEdges();

    java.util.Set<E> outEdges();

    java.util.Set<N> predecessors();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    N removeInEdge(E r1, boolean r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    N removeOutEdge(E r1);

    java.util.Set<N> successors();
}
