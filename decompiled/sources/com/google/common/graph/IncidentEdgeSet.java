package com.google.common.graph;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class IncidentEdgeSet<N> extends java.util.AbstractSet<com.google.common.graph.EndpointPair<N>> {
    public final com.google.common.graph.BaseGraph<N> graph;
    public final N node;

    public IncidentEdgeSet(com.google.common.graph.BaseGraph<N> r1, N r2) {
            r0 = this;
            r0.<init>()
            r0.graph = r1
            r0.node = r2
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.google.common.graph.EndpointPair
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.common.graph.EndpointPair r6 = (com.google.common.graph.EndpointPair) r6
            com.google.common.graph.BaseGraph<N> r0 = r5.graph
            boolean r0 = r0.isDirected()
            r2 = 1
            if (r0 == 0) goto L4e
            boolean r0 = r6.isOrdered()
            if (r0 != 0) goto L18
            return r1
        L18:
            java.lang.Object r0 = r6.source()
            java.lang.Object r6 = r6.target()
            N r3 = r5.node
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L36
            com.google.common.graph.BaseGraph<N> r3 = r5.graph
            N r4 = r5.node
            java.util.Set r3 = r3.successors(r4)
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L4c
        L36:
            N r3 = r5.node
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L4d
            com.google.common.graph.BaseGraph<N> r6 = r5.graph
            N r3 = r5.node
            java.util.Set r6 = r6.predecessors(r3)
            boolean r6 = r6.contains(r0)
            if (r6 == 0) goto L4d
        L4c:
            r1 = 1
        L4d:
            return r1
        L4e:
            boolean r0 = r6.isOrdered()
            if (r0 == 0) goto L55
            return r1
        L55:
            com.google.common.graph.BaseGraph<N> r0 = r5.graph
            N r3 = r5.node
            java.util.Set r0 = r0.adjacentNodes(r3)
            java.lang.Object r3 = r6.nodeU()
            java.lang.Object r6 = r6.nodeV()
            N r4 = r5.node
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L73
            boolean r4 = r0.contains(r3)
            if (r4 != 0) goto L81
        L73:
            N r4 = r5.node
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L82
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L82
        L81:
            r1 = 1
        L82:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r3 = this;
            com.google.common.graph.BaseGraph<N> r0 = r3.graph
            boolean r0 = r0.isDirected()
            if (r0 == 0) goto L29
            com.google.common.graph.BaseGraph<N> r0 = r3.graph
            N r1 = r3.node
            int r0 = r0.inDegree(r1)
            com.google.common.graph.BaseGraph<N> r1 = r3.graph
            N r2 = r3.node
            int r1 = r1.outDegree(r2)
            int r0 = r0 + r1
            com.google.common.graph.BaseGraph<N> r1 = r3.graph
            N r2 = r3.node
            java.util.Set r1 = r1.successors(r2)
            N r2 = r3.node
            boolean r1 = r1.contains(r2)
            int r0 = r0 - r1
            return r0
        L29:
            com.google.common.graph.BaseGraph<N> r0 = r3.graph
            N r1 = r3.node
            java.util.Set r0 = r0.adjacentNodes(r1)
            int r0 = r0.size()
            return r0
    }
}
