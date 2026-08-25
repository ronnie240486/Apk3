package com.google.common.graph;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
interface GraphConnections<N, V> {
    void addPredecessor(N r1, V r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    V addSuccessor(N r1, V r2);

    java.util.Set<N> adjacentNodes();

    java.util.Iterator<com.google.common.graph.EndpointPair<N>> incidentEdgeIterator(N r1);

    java.util.Set<N> predecessors();

    void removePredecessor(N r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    V removeSuccessor(N r1);

    java.util.Set<N> successors();

    @javax.annotation.CheckForNull
    V value(N r1);
}
