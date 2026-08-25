package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class AbstractBaseGraph<N> implements com.google.common.graph.BaseGraph<N> {



    public AbstractBaseGraph() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N r3) {
            r2 = this;
            boolean r0 = r2.isDirected()
            if (r0 == 0) goto L1b
            java.util.Set r0 = r2.predecessors(r3)
            int r0 = r0.size()
            java.util.Set r3 = r2.successors(r3)
            int r3 = r3.size()
            int r3 = com.google.common.math.IntMath.saturatedAdd(r0, r3)
            return r3
        L1b:
            java.util.Set r0 = r2.adjacentNodes(r3)
            boolean r1 = r2.allowsSelfLoops()
            if (r1 == 0) goto L2d
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L2d
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            int r0 = r0.size()
            int r3 = com.google.common.math.IntMath.saturatedAdd(r0, r3)
            return r3
    }

    public long edgeCount() {
            r8 = this;
            java.util.Set r0 = r8.nodes()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r3 = r1
        Lb:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L1c
            java.lang.Object r5 = r0.next()
            int r5 = r8.degree(r5)
            long r5 = (long) r5
            long r3 = r3 + r5
            goto Lb
        L1c:
            r5 = 1
            long r5 = r5 & r3
            r0 = 1
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            com.google.common.base.Preconditions.checkState(r1)
            long r0 = r3 >>> r0
            return r0
    }

    @Override // com.google.common.graph.BaseGraph
    public java.util.Set<com.google.common.graph.EndpointPair<N>> edges() {
            r1 = this;
            com.google.common.graph.AbstractBaseGraph$1 r0 = new com.google.common.graph.AbstractBaseGraph$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            boolean r0 = r3.isOrderingCompatible(r4)
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.lang.Object r0 = r4.nodeU()
            java.lang.Object r4 = r4.nodeV()
            java.util.Set r2 = r3.nodes()
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L28
            java.util.Set r0 = r3.successors(r0)
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L28
            r1 = 1
        L28:
            return r1
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N r2, N r3) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Set r0 = r1.nodes()
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1c
            java.util.Set r2 = r1.successors(r2)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N r2) {
            r1 = this;
            boolean r0 = r1.isDirected()
            if (r0 == 0) goto Lf
            java.util.Set r2 = r1.predecessors(r2)
            int r2 = r2.size()
            goto L13
        Lf:
            int r2 = r1.degree(r2)
        L13:
            return r2
    }

    @Override // com.google.common.graph.BaseGraph
    public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder r0 = com.google.common.graph.ElementOrder.unordered()
            return r0
    }

    @Override // com.google.common.graph.BaseGraph
    public java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Set r0 = r2.nodes()
            boolean r0 = r0.contains(r3)
            java.lang.String r1 = "Node %s is not an element of this graph."
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            com.google.common.graph.AbstractBaseGraph$2 r0 = new com.google.common.graph.AbstractBaseGraph$2
            r0.<init>(r2, r3)
            return r0
    }

    public final boolean isOrderingCompatible(com.google.common.graph.EndpointPair<?> r1) {
            r0 = this;
            boolean r1 = r1.isOrdered()
            if (r1 != 0) goto Lf
            boolean r1 = r0.isDirected()
            if (r1 != 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N r2) {
            r1 = this;
            boolean r0 = r1.isDirected()
            if (r0 == 0) goto Lf
            java.util.Set r2 = r1.successors(r2)
            int r2 = r2.size()
            goto L13
        Lf:
            int r2 = r1.degree(r2)
        L13:
            return r2
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
            r0 = this;
            java.lang.Iterable r1 = com.google.common.graph.BaseGraph.CC.$default$predecessors(r0, r1)
            return r1
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
            r0 = this;
            java.lang.Iterable r1 = com.google.common.graph.BaseGraph.CC.$default$successors(r0, r1)
            return r1
    }

    public final void validateEndpoints(com.google.common.graph.EndpointPair<?> r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r2 = r1.isOrderingCompatible(r2)
            java.lang.String r0 = "Mismatch: unordered endpoints cannot be used with directed graphs"
            com.google.common.base.Preconditions.checkArgument(r2, r0)
            return
    }
}
