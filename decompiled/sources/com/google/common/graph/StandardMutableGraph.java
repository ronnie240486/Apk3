package com.google.common.graph;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class StandardMutableGraph<N> extends com.google.common.graph.ForwardingGraph<N> implements com.google.common.graph.MutableGraph<N> {
    private final com.google.common.graph.MutableValueGraph<N, com.google.common.graph.GraphConstants.Presence> backingValueGraph;

    public StandardMutableGraph(com.google.common.graph.AbstractGraphBuilder<? super N> r2) {
            r1 = this;
            r1.<init>()
            com.google.common.graph.StandardMutableValueGraph r0 = new com.google.common.graph.StandardMutableValueGraph
            r0.<init>(r2)
            r1.backingValueGraph = r0
            return
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean addNode(N r2) {
            r1 = this;
            com.google.common.graph.MutableValueGraph<N, com.google.common.graph.GraphConstants$Presence> r0 = r1.backingValueGraph
            boolean r2 = r0.addNode(r2)
            return r2
    }

    @Override // com.google.common.graph.ForwardingGraph
    public final com.google.common.graph.BaseGraph<N> delegate() {
            r1 = this;
            com.google.common.graph.MutableValueGraph<N, com.google.common.graph.GraphConstants$Presence> r0 = r1.backingValueGraph
            return r0
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(com.google.common.graph.EndpointPair<N> r2) {
            r1 = this;
            r1.validateEndpoints(r2)
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            boolean r2 = r1.putEdge(r0, r2)
            return r2
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(N r3, N r4) {
            r2 = this;
            com.google.common.graph.MutableValueGraph<N, com.google.common.graph.GraphConstants$Presence> r0 = r2.backingValueGraph
            com.google.common.graph.GraphConstants$Presence r1 = com.google.common.graph.GraphConstants.Presence.EDGE_EXISTS
            java.lang.Object r3 = r0.putEdgeValue(r3, r4, r1)
            if (r3 != 0) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            return r3
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(com.google.common.graph.EndpointPair<N> r2) {
            r1 = this;
            r1.validateEndpoints(r2)
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            boolean r2 = r1.removeEdge(r0, r2)
            return r2
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(N r2, N r3) {
            r1 = this;
            com.google.common.graph.MutableValueGraph<N, com.google.common.graph.GraphConstants$Presence> r0 = r1.backingValueGraph
            java.lang.Object r2 = r0.removeEdge(r2, r3)
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeNode(N r2) {
            r1 = this;
            com.google.common.graph.MutableValueGraph<N, com.google.common.graph.GraphConstants$Presence> r0 = r1.backingValueGraph
            boolean r2 = r0.removeNode(r2)
            return r2
    }
}
