package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public interface MutableNetwork<N, E> extends com.google.common.graph.Network<N, E> {
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean addEdge(com.google.common.graph.EndpointPair<N> r1, E r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean addEdge(N r1, N r2, E r3);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean addNode(N r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean removeEdge(E r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean removeNode(N r1);
}
