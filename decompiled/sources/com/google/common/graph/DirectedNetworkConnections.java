package com.google.common.graph;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class DirectedNetworkConnections<N, E> extends com.google.common.graph.AbstractDirectedNetworkConnections<N, E> {
    public DirectedNetworkConnections(java.util.Map<E, N> r1, java.util.Map<E, N> r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> edgesConnecting(N r3) {
            r2 = this;
            com.google.common.graph.EdgesConnecting r0 = new com.google.common.graph.EdgesConnecting
            java.util.Map<E, N> r1 = r2.outEdgeMap
            com.google.common.collect.BiMap r1 = (com.google.common.collect.BiMap) r1
            com.google.common.collect.BiMap r1 = r1.inverse()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> predecessors() {
            r1 = this;
            java.util.Map<E, N> r0 = r1.inEdgeMap
            com.google.common.collect.BiMap r0 = (com.google.common.collect.BiMap) r0
            java.util.Set r0 = r0.values()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> successors() {
            r1 = this;
            java.util.Map<E, N> r0 = r1.outEdgeMap
            com.google.common.collect.BiMap r0 = (com.google.common.collect.BiMap) r0
            java.util.Set r0 = r0.values()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }
}
