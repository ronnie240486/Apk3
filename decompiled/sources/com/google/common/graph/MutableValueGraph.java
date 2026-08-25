package com.google.common.graph;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public interface MutableValueGraph<N, V> extends com.google.common.graph.ValueGraph<N, V> {
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean addNode(N r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    V putEdgeValue(com.google.common.graph.EndpointPair<N> r1, V r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    V putEdgeValue(N r1, N r2, V r3);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    V removeEdge(com.google.common.graph.EndpointPair<N> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    V removeEdge(N r1, N r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean removeNode(N r1);
}
