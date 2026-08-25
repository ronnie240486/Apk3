package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public abstract class AbstractNetwork<N, E> implements com.google.common.graph.Network<N, E> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public class AnonymousClass1 extends com.google.common.graph.AbstractGraph<N> {
        public final /* synthetic */ com.google.common.graph.AbstractNetwork this$0;


        public AnonymousClass1(com.google.common.graph.AbstractNetwork r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public java.util.Set<N> adjacentNodes(N r2) {
                r1 = this;
                com.google.common.graph.AbstractNetwork r0 = r1.this$0
                java.util.Set r2 = r0.adjacentNodes(r2)
                return r2
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean allowsSelfLoops() {
                r1 = this;
                com.google.common.graph.AbstractNetwork r0 = r1.this$0
                boolean r0 = r0.allowsSelfLoops()
                return r0
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public java.util.Set<com.google.common.graph.EndpointPair<N>> edges() {
                r1 = this;
                com.google.common.graph.AbstractNetwork r0 = r1.this$0
                boolean r0 = r0.allowsParallelEdges()
                if (r0 == 0) goto Ld
                java.util.Set r0 = super.edges()
                return r0
            Ld:
                com.google.common.graph.AbstractNetwork$1$1 r0 = new com.google.common.graph.AbstractNetwork$1$1
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
                r1 = this;
                com.google.common.graph.ElementOrder r0 = com.google.common.graph.ElementOrder.unordered()
                return r0
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean isDirected() {
                r1 = this;
                com.google.common.graph.AbstractNetwork r0 = r1.this$0
                boolean r0 = r0.isDirected()
                return r0
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public com.google.common.graph.ElementOrder<N> nodeOrder() {
                r1 = this;
                com.google.common.graph.AbstractNetwork r0 = r1.this$0
                com.google.common.graph.ElementOrder r0 = r0.nodeOrder()
                return r0
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public java.util.Set<N> nodes() {
                r1 = this;
                com.google.common.graph.AbstractNetwork r0 = r1.this$0
                java.util.Set r0 = r0.nodes()
                return r0
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.predecessors(r1)
                return r1
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public java.util.Set<N> predecessors(N r2) {
                r1 = this;
                com.google.common.graph.AbstractNetwork r0 = r1.this$0
                java.util.Set r2 = r0.predecessors(r2)
                return r2
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.successors(r1)
                return r1
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public java.util.Set<N> successors(N r2) {
                r1 = this;
                com.google.common.graph.AbstractNetwork r0 = r1.this$0
                java.util.Set r2 = r0.successors(r2)
                return r2
        }
    }



    public AbstractNetwork() {
            r0 = this;
            r0.<init>()
            return
    }

    private com.google.common.base.Predicate<E> connectedPredicate(N r2, N r3) {
            r1 = this;
            com.google.common.graph.AbstractNetwork$2 r0 = new com.google.common.graph.AbstractNetwork$2
            r0.<init>(r1, r2, r3)
            return r0
    }

    private static <N, E> java.util.Map<E, com.google.common.graph.EndpointPair<N>> edgeIncidentNodesMap(com.google.common.graph.Network<N, E> r1) {
            com.google.common.graph.AbstractNetwork$3 r0 = new com.google.common.graph.AbstractNetwork$3
            r0.<init>(r1)
            java.util.Set r1 = r1.edges()
            java.util.Map r1 = com.google.common.collect.Maps.asMap(r1, r0)
            return r1
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> adjacentEdges(E r3) {
            r2 = this;
            com.google.common.graph.EndpointPair r0 = r2.incidentNodes(r3)
            java.lang.Object r1 = r0.nodeU()
            java.util.Set r1 = r2.incidentEdges(r1)
            java.lang.Object r0 = r0.nodeV()
            java.util.Set r0 = r2.incidentEdges(r0)
            com.google.common.collect.Sets$SetView r0 = com.google.common.collect.Sets.union(r1, r0)
            com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of(r3)
            com.google.common.collect.Sets$SetView r3 = com.google.common.collect.Sets.difference(r0, r3)
            return r3
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.Graph<N> asGraph() {
            r1 = this;
            com.google.common.graph.AbstractNetwork$1 r0 = new com.google.common.graph.AbstractNetwork$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.Network
    public int degree(N r2) {
            r1 = this;
            boolean r0 = r1.isDirected()
            if (r0 == 0) goto L1b
            java.util.Set r0 = r1.inEdges(r2)
            int r0 = r0.size()
            java.util.Set r2 = r1.outEdges(r2)
            int r2 = r2.size()
            int r2 = com.google.common.math.IntMath.saturatedAdd(r0, r2)
            return r2
        L1b:
            java.util.Set r0 = r1.incidentEdges(r2)
            int r0 = r0.size()
            java.util.Set r2 = r1.edgesConnecting(r2, r2)
            int r2 = r2.size()
            int r2 = com.google.common.math.IntMath.saturatedAdd(r0, r2)
            return r2
    }

    @Override // com.google.common.graph.Network
    @javax.annotation.CheckForNull
    public E edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> r2) {
            r1 = this;
            r1.validateEndpoints(r2)
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            java.lang.Object r2 = r1.edgeConnectingOrNull(r0, r2)
            return r2
    }

    @Override // com.google.common.graph.Network
    @javax.annotation.CheckForNull
    public E edgeConnectingOrNull(N r5, N r6) {
            r4 = this;
            java.util.Set r0 = r4.edgesConnecting(r5, r6)
            int r1 = r0.size()
            if (r1 == 0) goto L2a
            r2 = 1
            if (r1 != r2) goto L16
            java.util.Iterator r5 = r0.iterator()
            java.lang.Object r5 = r5.next()
            return r5
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r5
            r1[r2] = r6
            java.lang.String r5 = "Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead."
            java.lang.String r5 = java.lang.String.format(r5, r1)
            r0.<init>(r5)
            throw r0
        L2a:
            r5 = 0
            return r5
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(com.google.common.graph.EndpointPair<N> r2) {
            r1 = this;
            r1.validateEndpoints(r2)
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            java.util.Set r2 = r1.edgesConnecting(r0, r2)
            return r2
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(N r5, N r6) {
            r4 = this;
            java.util.Set r0 = r4.outEdges(r5)
            java.util.Set r1 = r4.inEdges(r6)
            int r2 = r0.size()
            int r3 = r1.size()
            if (r2 > r3) goto L1f
            com.google.common.base.Predicate r5 = r4.connectedPredicate(r5, r6)
            java.util.Set r5 = com.google.common.collect.Sets.filter(r0, r5)
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r5)
            goto L2b
        L1f:
            com.google.common.base.Predicate r5 = r4.connectedPredicate(r6, r5)
            java.util.Set r5 = com.google.common.collect.Sets.filter(r1, r5)
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r5)
        L2b:
            return r5
    }

    @Override // com.google.common.graph.Network
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.graph.Network
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.common.graph.Network r5 = (com.google.common.graph.Network) r5
            boolean r1 = r4.isDirected()
            boolean r3 = r5.isDirected()
            if (r1 != r3) goto L33
            java.util.Set r1 = r4.nodes()
            java.util.Set r3 = r5.nodes()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L33
            java.util.Map r1 = edgeIncidentNodesMap(r4)
            java.util.Map r5 = edgeIncidentNodesMap(r5)
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            boolean r0 = r3.isOrdered()
            r1 = 0
            if (r0 != 0) goto L13
            boolean r0 = r2.isDirected()
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            if (r0 != 0) goto L17
            return r1
        L17:
            java.lang.Object r0 = r3.nodeU()
            java.lang.Object r3 = r3.nodeV()
            boolean r3 = r2.hasEdgeConnecting(r0, r3)
            return r3
    }

    @Override // com.google.common.graph.Network
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

    @Override // com.google.common.graph.Network
    public final int hashCode() {
            r1 = this;
            java.util.Map r0 = edgeIncidentNodesMap(r1)
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.graph.Network
    public int inDegree(N r2) {
            r1 = this;
            boolean r0 = r1.isDirected()
            if (r0 == 0) goto Lf
            java.util.Set r2 = r1.inEdges(r2)
            int r2 = r2.size()
            goto L13
        Lf:
            int r2 = r1.degree(r2)
        L13:
            return r2
    }

    @Override // com.google.common.graph.Network
    public int outDegree(N r2) {
            r1 = this;
            boolean r0 = r1.isDirected()
            if (r0 == 0) goto Lf
            java.util.Set r2 = r1.outEdges(r2)
            int r2 = r2.size()
            goto L13
        Lf:
            int r2 = r1.degree(r2)
        L13:
            return r2
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
            r0 = this;
            java.lang.Iterable r1 = com.google.common.graph.Network.CC.$default$predecessors(r0, r1)
            return r1
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
            r0 = this;
            java.lang.Iterable r1 = com.google.common.graph.Network.CC.$default$successors(r0, r1)
            return r1
    }

    public java.lang.String toString() {
            r7 = this;
            boolean r0 = r7.isDirected()
            boolean r1 = r7.allowsParallelEdges()
            boolean r2 = r7.allowsSelfLoops()
            java.util.Set r3 = r7.nodes()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.util.Map r4 = edgeIncidentNodesMap(r7)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r3.length()
            int r5 = r5 + 87
            int r6 = r4.length()
            int r6 = r6 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            java.lang.String r6 = "isDirected: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = ", allowsParallelEdges: "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = ", allowsSelfLoops: "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = ", nodes: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = ", edges: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r0, r4)
            return r0
    }

    public final void validateEndpoints(com.google.common.graph.EndpointPair<?> r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r2 = r2.isOrdered()
            if (r2 != 0) goto L12
            boolean r2 = r1.isDirected()
            if (r2 != 0) goto L10
            goto L12
        L10:
            r2 = 0
            goto L13
        L12:
            r2 = 1
        L13:
            java.lang.String r0 = "Mismatch: unordered endpoints cannot be used with directed graphs"
            com.google.common.base.Preconditions.checkArgument(r2, r0)
            return
    }
}
