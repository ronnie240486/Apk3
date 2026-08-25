package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public interface MutableGraph<N> extends com.google.common.graph.Graph<N> {
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean addNode(N r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean putEdge(com.google.common.graph.EndpointPair<N> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean putEdge(N r1, N r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean removeEdge(com.google.common.graph.EndpointPair<N> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean removeEdge(N r1, N r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean removeNode(N r1);
}
