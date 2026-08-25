package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class AbstractUndirectedNetworkConnections<N, E> implements com.google.common.graph.NetworkConnections<N, E> {
    public final java.util.Map<E, N> incidentEdgeMap;

    public AbstractUndirectedNetworkConnections(java.util.Map<E, N> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Map r1 = (java.util.Map) r1
            r0.incidentEdgeMap = r1
            return
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E r1, N r2, boolean r3) {
            r0 = this;
            if (r3 != 0) goto L5
            r0.addOutEdge(r1, r2)
        L5:
            return
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E r2, N r3) {
            r1 = this;
            java.util.Map<E, N> r0 = r1.incidentEdgeMap
            java.lang.Object r2 = r0.put(r2, r3)
            if (r2 != 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r2)
            return
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E r2) {
            r1 = this;
            java.util.Map<E, N> r0 = r1.incidentEdgeMap
            java.lang.Object r2 = r0.get(r2)
            java.util.Objects.requireNonNull(r2)
            return r2
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> inEdges() {
            r1 = this;
            java.util.Set r0 = r1.incidentEdges()
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> incidentEdges() {
            r1 = this;
            java.util.Map<E, N> r0 = r1.incidentEdgeMap
            java.util.Set r0 = r0.keySet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> outEdges() {
            r1 = this;
            java.util.Set r0 = r1.incidentEdges()
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> predecessors() {
            r1 = this;
            java.util.Set r0 = r1.adjacentNodes()
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    @javax.annotation.CheckForNull
    public N removeInEdge(E r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto L7
            java.lang.Object r1 = r0.removeOutEdge(r1)
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E r2) {
            r1 = this;
            java.util.Map<E, N> r0 = r1.incidentEdgeMap
            java.lang.Object r2 = r0.remove(r2)
            java.util.Objects.requireNonNull(r2)
            return r2
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> successors() {
            r1 = this;
            java.util.Set r0 = r1.adjacentNodes()
            return r0
    }
}
