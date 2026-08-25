package com.google.common.graph;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public final class Graphs {

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum NodeVisitState extends java.lang.Enum<com.google.common.graph.Graphs.NodeVisitState> {
        private static final /* synthetic */ com.google.common.graph.Graphs.NodeVisitState[] $VALUES = null;
        public static final com.google.common.graph.Graphs.NodeVisitState COMPLETE = null;
        public static final com.google.common.graph.Graphs.NodeVisitState PENDING = null;

        private static /* synthetic */ com.google.common.graph.Graphs.NodeVisitState[] $values() {
                r0 = 2
                com.google.common.graph.Graphs$NodeVisitState[] r0 = new com.google.common.graph.Graphs.NodeVisitState[r0]
                com.google.common.graph.Graphs$NodeVisitState r1 = com.google.common.graph.Graphs.NodeVisitState.PENDING
                r2 = 0
                r0[r2] = r1
                com.google.common.graph.Graphs$NodeVisitState r1 = com.google.common.graph.Graphs.NodeVisitState.COMPLETE
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.graph.Graphs$NodeVisitState r0 = new com.google.common.graph.Graphs$NodeVisitState
                java.lang.String r1 = "PENDING"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.graph.Graphs.NodeVisitState.PENDING = r0
                com.google.common.graph.Graphs$NodeVisitState r0 = new com.google.common.graph.Graphs$NodeVisitState
                java.lang.String r1 = "COMPLETE"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.common.graph.Graphs.NodeVisitState.COMPLETE = r0
                com.google.common.graph.Graphs$NodeVisitState[] r0 = $values()
                com.google.common.graph.Graphs.NodeVisitState.$VALUES = r0
                return
        }

        private NodeVisitState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.graph.Graphs.NodeVisitState valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.graph.Graphs$NodeVisitState> r0 = com.google.common.graph.Graphs.NodeVisitState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.graph.Graphs$NodeVisitState r1 = (com.google.common.graph.Graphs.NodeVisitState) r1
                return r1
        }

        public static com.google.common.graph.Graphs.NodeVisitState[] values() {
                com.google.common.graph.Graphs$NodeVisitState[] r0 = com.google.common.graph.Graphs.NodeVisitState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.graph.Graphs$NodeVisitState[] r0 = (com.google.common.graph.Graphs.NodeVisitState[]) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class TransposedGraph<N> extends com.google.common.graph.ForwardingGraph<N> {
        private final com.google.common.graph.Graph<N> graph;


        public TransposedGraph(com.google.common.graph.Graph<N> r1) {
                r0 = this;
                r0.<init>()
                r0.graph = r1
                return
        }

        public static /* synthetic */ com.google.common.graph.Graph access$000(com.google.common.graph.Graphs.TransposedGraph r0) {
                com.google.common.graph.Graph<N> r0 = r0.graph
                return r0
        }

        @Override // com.google.common.graph.ForwardingGraph
        public final com.google.common.graph.BaseGraph delegate() {
                r1 = this;
                com.google.common.graph.Graph<N> r0 = r1.graph
                return r0
        }

        @Override // com.google.common.graph.ForwardingGraph
        public final com.google.common.graph.Graph<N> delegate() {
                r1 = this;
                com.google.common.graph.Graph<N> r0 = r1.graph
                return r0
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r2) {
                r1 = this;
                com.google.common.graph.Graph<N> r0 = r1.graph
                com.google.common.graph.EndpointPair r2 = com.google.common.graph.Graphs.transpose(r2)
                boolean r2 = r0.hasEdgeConnecting(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(N r2, N r3) {
                r1 = this;
                com.google.common.graph.Graph<N> r0 = r1.graph
                boolean r2 = r0.hasEdgeConnecting(r3, r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int inDegree(N r2) {
                r1 = this;
                com.google.common.graph.Graph<N> r0 = r1.graph
                int r2 = r0.outDegree(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N r2) {
                r1 = this;
                com.google.common.graph.Graphs$TransposedGraph$1 r0 = new com.google.common.graph.Graphs$TransposedGraph$1
                r0.<init>(r1, r1, r2)
                return r0
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int outDegree(N r2) {
                r1 = this;
                com.google.common.graph.Graph<N> r0 = r1.graph
                int r2 = r0.inDegree(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.predecessors(r1)
                return r1
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public java.util.Set<N> predecessors(N r2) {
                r1 = this;
                com.google.common.graph.Graph<N> r0 = r1.graph
                java.util.Set r2 = r0.successors(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.successors(r1)
                return r1
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public java.util.Set<N> successors(N r2) {
                r1 = this;
                com.google.common.graph.Graph<N> r0 = r1.graph
                java.util.Set r2 = r0.predecessors(r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class TransposedNetwork<N, E> extends com.google.common.graph.ForwardingNetwork<N, E> {
        private final com.google.common.graph.Network<N, E> network;

        public TransposedNetwork(com.google.common.graph.Network<N, E> r1) {
                r0 = this;
                r0.<init>()
                r0.network = r1
                return
        }

        public static /* synthetic */ com.google.common.graph.Network access$200(com.google.common.graph.Graphs.TransposedNetwork r0) {
                com.google.common.graph.Network<N, E> r0 = r0.network
                return r0
        }

        @Override // com.google.common.graph.ForwardingNetwork
        public final com.google.common.graph.Network<N, E> delegate() {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                return r0
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        @javax.annotation.CheckForNull
        public E edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> r2) {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                com.google.common.graph.EndpointPair r2 = com.google.common.graph.Graphs.transpose(r2)
                java.lang.Object r2 = r0.edgeConnectingOrNull(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        @javax.annotation.CheckForNull
        public E edgeConnectingOrNull(N r2, N r3) {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                java.lang.Object r2 = r0.edgeConnectingOrNull(r3, r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public java.util.Set<E> edgesConnecting(com.google.common.graph.EndpointPair<N> r2) {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                com.google.common.graph.EndpointPair r2 = com.google.common.graph.Graphs.transpose(r2)
                java.util.Set r2 = r0.edgesConnecting(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public java.util.Set<E> edgesConnecting(N r2, N r3) {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                java.util.Set r2 = r0.edgesConnecting(r3, r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r2) {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                com.google.common.graph.EndpointPair r2 = com.google.common.graph.Graphs.transpose(r2)
                boolean r2 = r0.hasEdgeConnecting(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(N r2, N r3) {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                boolean r2 = r0.hasEdgeConnecting(r3, r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int inDegree(N r2) {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                int r2 = r0.outDegree(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public java.util.Set<E> inEdges(N r2) {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                java.util.Set r2 = r0.outEdges(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public com.google.common.graph.EndpointPair<N> incidentNodes(E r3) {
                r2 = this;
                com.google.common.graph.Network<N, E> r0 = r2.network
                com.google.common.graph.EndpointPair r3 = r0.incidentNodes(r3)
                com.google.common.graph.Network<N, E> r0 = r2.network
                java.lang.Object r1 = r3.nodeV()
                java.lang.Object r3 = r3.nodeU()
                com.google.common.graph.EndpointPair r3 = com.google.common.graph.EndpointPair.of(r0, r1, r3)
                return r3
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int outDegree(N r2) {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                int r2 = r0.inDegree(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public java.util.Set<E> outEdges(N r2) {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                java.util.Set r2 = r0.inEdges(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
        public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.predecessors(r1)
                return r1
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
        public java.util.Set<N> predecessors(N r2) {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                java.util.Set r2 = r0.successors(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
        public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.successors(r1)
                return r1
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
        public java.util.Set<N> successors(N r2) {
                r1 = this;
                com.google.common.graph.Network<N, E> r0 = r1.network
                java.util.Set r2 = r0.predecessors(r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class TransposedValueGraph<N, V> extends com.google.common.graph.ForwardingValueGraph<N, V> {
        private final com.google.common.graph.ValueGraph<N, V> graph;

        public TransposedValueGraph(com.google.common.graph.ValueGraph<N, V> r1) {
                r0 = this;
                r0.<init>()
                r0.graph = r1
                return
        }

        public static /* synthetic */ com.google.common.graph.ValueGraph access$100(com.google.common.graph.Graphs.TransposedValueGraph r0) {
                com.google.common.graph.ValueGraph<N, V> r0 = r0.graph
                return r0
        }

        @Override // com.google.common.graph.ForwardingValueGraph
        public final com.google.common.graph.ValueGraph<N, V> delegate() {
                r1 = this;
                com.google.common.graph.ValueGraph<N, V> r0 = r1.graph
                return r0
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        @javax.annotation.CheckForNull
        public V edgeValueOrDefault(com.google.common.graph.EndpointPair<N> r2, @javax.annotation.CheckForNull V r3) {
                r1 = this;
                com.google.common.graph.ValueGraph<N, V> r0 = r1.graph
                com.google.common.graph.EndpointPair r2 = com.google.common.graph.Graphs.transpose(r2)
                java.lang.Object r2 = r0.edgeValueOrDefault(r2, r3)
                return r2
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        @javax.annotation.CheckForNull
        public V edgeValueOrDefault(N r2, N r3, @javax.annotation.CheckForNull V r4) {
                r1 = this;
                com.google.common.graph.ValueGraph<N, V> r0 = r1.graph
                java.lang.Object r2 = r0.edgeValueOrDefault(r3, r2, r4)
                return r2
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r2) {
                r1 = this;
                com.google.common.graph.ValueGraph<N, V> r0 = r1.graph
                com.google.common.graph.EndpointPair r2 = com.google.common.graph.Graphs.transpose(r2)
                boolean r2 = r0.hasEdgeConnecting(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(N r2, N r3) {
                r1 = this;
                com.google.common.graph.ValueGraph<N, V> r0 = r1.graph
                boolean r2 = r0.hasEdgeConnecting(r3, r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int inDegree(N r2) {
                r1 = this;
                com.google.common.graph.ValueGraph<N, V> r0 = r1.graph
                int r2 = r0.outDegree(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int outDegree(N r2) {
                r1 = this;
                com.google.common.graph.ValueGraph<N, V> r0 = r1.graph
                int r2 = r0.inDegree(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.predecessors(r1)
                return r1
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public java.util.Set<N> predecessors(N r2) {
                r1 = this;
                com.google.common.graph.ValueGraph<N, V> r0 = r1.graph
                java.util.Set r2 = r0.successors(r2)
                return r2
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
                r0 = this;
                java.util.Set r1 = r0.successors(r1)
                return r1
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public java.util.Set<N> successors(N r2) {
                r1 = this;
                com.google.common.graph.ValueGraph<N, V> r0 = r1.graph
                java.util.Set r2 = r0.predecessors(r2)
                return r2
        }
    }

    private Graphs() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean canTraverseWithoutReusingEdge(com.google.common.graph.Graph<?> r0, java.lang.Object r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            boolean r0 = r0.isDirected()
            if (r0 != 0) goto Lf
            boolean r0 = com.google.common.base.Objects.equal(r2, r1)
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static int checkNonNegative(int r2) {
            if (r2 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "Not true that %s is non-negative."
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static long checkNonNegative(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.String r1 = "Not true that %s is non-negative."
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            return r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static int checkPositive(int r2) {
            if (r2 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "Not true that %s is positive."
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            return r2
    }

    public static <N> com.google.common.graph.MutableGraph<N> copyOf(com.google.common.graph.Graph<N> r3) {
            com.google.common.graph.GraphBuilder r0 = com.google.common.graph.GraphBuilder.from(r3)
            java.util.Set r1 = r3.nodes()
            int r1 = r1.size()
            com.google.common.graph.GraphBuilder r0 = r0.expectedNodeCount(r1)
            com.google.common.graph.MutableGraph r0 = r0.build()
            java.util.Set r1 = r3.nodes()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            r0.addNode(r2)
            goto L1c
        L2a:
            java.util.Set r3 = r3.edges()
            java.util.Iterator r3 = r3.iterator()
        L32:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r3.next()
            com.google.common.graph.EndpointPair r1 = (com.google.common.graph.EndpointPair) r1
            java.lang.Object r2 = r1.nodeU()
            java.lang.Object r1 = r1.nodeV()
            r0.putEdge(r2, r1)
            goto L32
        L4a:
            return r0
    }

    public static <N, E> com.google.common.graph.MutableNetwork<N, E> copyOf(com.google.common.graph.Network<N, E> r5) {
            com.google.common.graph.NetworkBuilder r0 = com.google.common.graph.NetworkBuilder.from(r5)
            java.util.Set r1 = r5.nodes()
            int r1 = r1.size()
            com.google.common.graph.NetworkBuilder r0 = r0.expectedNodeCount(r1)
            java.util.Set r1 = r5.edges()
            int r1 = r1.size()
            com.google.common.graph.NetworkBuilder r0 = r0.expectedEdgeCount(r1)
            com.google.common.graph.MutableNetwork r0 = r0.build()
            java.util.Set r1 = r5.nodes()
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            r0.addNode(r2)
            goto L28
        L36:
            java.util.Set r1 = r5.edges()
            java.util.Iterator r1 = r1.iterator()
        L3e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.next()
            com.google.common.graph.EndpointPair r3 = r5.incidentNodes(r2)
            java.lang.Object r4 = r3.nodeU()
            java.lang.Object r3 = r3.nodeV()
            r0.addEdge(r4, r3, r2)
            goto L3e
        L58:
            return r0
    }

    public static <N, V> com.google.common.graph.MutableValueGraph<N, V> copyOf(com.google.common.graph.ValueGraph<N, V> r7) {
            com.google.common.graph.ValueGraphBuilder r0 = com.google.common.graph.ValueGraphBuilder.from(r7)
            java.util.Set r1 = r7.nodes()
            int r1 = r1.size()
            com.google.common.graph.ValueGraphBuilder r0 = r0.expectedNodeCount(r1)
            com.google.common.graph.MutableValueGraph r0 = r0.build()
            java.util.Set r1 = r7.nodes()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            r0.addNode(r2)
            goto L1c
        L2a:
            java.util.Set r1 = r7.edges()
            java.util.Iterator r1 = r1.iterator()
        L32:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r1.next()
            com.google.common.graph.EndpointPair r2 = (com.google.common.graph.EndpointPair) r2
            java.lang.Object r3 = r2.nodeU()
            java.lang.Object r4 = r2.nodeV()
            java.lang.Object r5 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            r6 = 0
            java.lang.Object r2 = r7.edgeValueOrDefault(r5, r2, r6)
            java.util.Objects.requireNonNull(r2)
            r0.putEdgeValue(r3, r4, r2)
            goto L32
        L5a:
            return r0
    }

    public static <N> boolean hasCycle(com.google.common.graph.Graph<N> r6) {
            java.util.Set r0 = r6.edges()
            int r0 = r0.size()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            boolean r2 = r6.isDirected()
            r3 = 1
            if (r2 != 0) goto L1e
            java.util.Set r2 = r6.nodes()
            int r2 = r2.size()
            if (r0 < r2) goto L1e
            return r3
        L1e:
            java.util.Set r0 = r6.nodes()
            int r0 = r0.size()
            java.util.HashMap r0 = com.google.common.collect.Maps.newHashMapWithExpectedSize(r0)
            java.util.Set r2 = r6.nodes()
            java.util.Iterator r2 = r2.iterator()
        L32:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r2.next()
            r5 = 0
            boolean r4 = subgraphHasCycle(r6, r0, r4, r5)
            if (r4 == 0) goto L32
            return r3
        L44:
            return r1
    }

    public static boolean hasCycle(com.google.common.graph.Network<?, ?> r2) {
            boolean r0 = r2.isDirected()
            if (r0 != 0) goto L24
            boolean r0 = r2.allowsParallelEdges()
            if (r0 == 0) goto L24
            java.util.Set r0 = r2.edges()
            int r0 = r0.size()
            com.google.common.graph.Graph r1 = r2.asGraph()
            java.util.Set r1 = r1.edges()
            int r1 = r1.size()
            if (r0 <= r1) goto L24
            r2 = 1
            return r2
        L24:
            com.google.common.graph.Graph r2 = r2.asGraph()
            boolean r2 = hasCycle(r2)
            return r2
    }

    public static <N> com.google.common.graph.MutableGraph<N> inducedSubgraph(com.google.common.graph.Graph<N> r5, java.lang.Iterable<? extends N> r6) {
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L18
            com.google.common.graph.GraphBuilder r0 = com.google.common.graph.GraphBuilder.from(r5)
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            com.google.common.graph.GraphBuilder r0 = r0.expectedNodeCount(r1)
            com.google.common.graph.MutableGraph r0 = r0.build()
            goto L20
        L18:
            com.google.common.graph.GraphBuilder r0 = com.google.common.graph.GraphBuilder.from(r5)
            com.google.common.graph.MutableGraph r0 = r0.build()
        L20:
            java.util.Iterator r6 = r6.iterator()
        L24:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r6.next()
            r0.addNode(r1)
            goto L24
        L32:
            java.util.Set r6 = r0.nodes()
            java.util.Iterator r6 = r6.iterator()
        L3a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r6.next()
            java.util.Set r2 = r5.successors(r1)
            java.util.Iterator r2 = r2.iterator()
        L4c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()
            java.util.Set r4 = r0.nodes()
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L4c
            r0.putEdge(r1, r3)
            goto L4c
        L64:
            return r0
    }

    public static <N, E> com.google.common.graph.MutableNetwork<N, E> inducedSubgraph(com.google.common.graph.Network<N, E> r6, java.lang.Iterable<? extends N> r7) {
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L18
            com.google.common.graph.NetworkBuilder r0 = com.google.common.graph.NetworkBuilder.from(r6)
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            com.google.common.graph.NetworkBuilder r0 = r0.expectedNodeCount(r1)
            com.google.common.graph.MutableNetwork r0 = r0.build()
            goto L20
        L18:
            com.google.common.graph.NetworkBuilder r0 = com.google.common.graph.NetworkBuilder.from(r6)
            com.google.common.graph.MutableNetwork r0 = r0.build()
        L20:
            java.util.Iterator r7 = r7.iterator()
        L24:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r7.next()
            r0.addNode(r1)
            goto L24
        L32:
            java.util.Set r7 = r0.nodes()
            java.util.Iterator r7 = r7.iterator()
        L3a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r7.next()
            java.util.Set r2 = r6.outEdges(r1)
            java.util.Iterator r2 = r2.iterator()
        L4c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()
            com.google.common.graph.EndpointPair r4 = r6.incidentNodes(r3)
            java.lang.Object r4 = r4.adjacentNode(r1)
            java.util.Set r5 = r0.nodes()
            boolean r5 = r5.contains(r4)
            if (r5 == 0) goto L4c
            r0.addEdge(r1, r4, r3)
            goto L4c
        L6c:
            return r0
    }

    public static <N, V> com.google.common.graph.MutableValueGraph<N, V> inducedSubgraph(com.google.common.graph.ValueGraph<N, V> r5, java.lang.Iterable<? extends N> r6) {
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L18
            com.google.common.graph.ValueGraphBuilder r0 = com.google.common.graph.ValueGraphBuilder.from(r5)
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            com.google.common.graph.ValueGraphBuilder r0 = r0.expectedNodeCount(r1)
            com.google.common.graph.MutableValueGraph r0 = r0.build()
            goto L20
        L18:
            com.google.common.graph.ValueGraphBuilder r0 = com.google.common.graph.ValueGraphBuilder.from(r5)
            com.google.common.graph.MutableValueGraph r0 = r0.build()
        L20:
            java.util.Iterator r6 = r6.iterator()
        L24:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r6.next()
            r0.addNode(r1)
            goto L24
        L32:
            java.util.Set r6 = r0.nodes()
            java.util.Iterator r6 = r6.iterator()
        L3a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()
            java.util.Set r2 = r5.successors(r1)
            java.util.Iterator r2 = r2.iterator()
        L4c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()
            java.util.Set r4 = r0.nodes()
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L4c
            r4 = 0
            java.lang.Object r4 = r5.edgeValueOrDefault(r1, r3, r4)
            java.util.Objects.requireNonNull(r4)
            r0.putEdgeValue(r1, r3, r4)
            goto L4c
        L6c:
            return r0
    }

    public static <N> java.util.Set<N> reachableNodes(com.google.common.graph.Graph<N> r2, N r3) {
            java.util.Set r0 = r2.nodes()
            boolean r0 = r0.contains(r3)
            java.lang.String r1 = "Node %s is not an element of this graph."
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            com.google.common.graph.Traverser r2 = com.google.common.graph.Traverser.forGraph(r2)
            java.lang.Iterable r2 = r2.breadthFirst(r3)
            com.google.common.collect.ImmutableSet r2 = com.google.common.collect.ImmutableSet.copyOf(r2)
            return r2
    }

    private static <N> boolean subgraphHasCycle(com.google.common.graph.Graph<N> r5, java.util.Map<java.lang.Object, com.google.common.graph.Graphs.NodeVisitState> r6, N r7, @javax.annotation.CheckForNull N r8) {
            java.lang.Object r0 = r6.get(r7)
            com.google.common.graph.Graphs$NodeVisitState r0 = (com.google.common.graph.Graphs.NodeVisitState) r0
            com.google.common.graph.Graphs$NodeVisitState r1 = com.google.common.graph.Graphs.NodeVisitState.COMPLETE
            r2 = 0
            if (r0 != r1) goto Lc
            return r2
        Lc:
            com.google.common.graph.Graphs$NodeVisitState r1 = com.google.common.graph.Graphs.NodeVisitState.PENDING
            r3 = 1
            if (r0 != r1) goto L12
            return r3
        L12:
            r6.put(r7, r1)
            java.util.Set r0 = r5.successors(r7)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            boolean r4 = canTraverseWithoutReusingEdge(r5, r1, r8)
            if (r4 == 0) goto L1d
            boolean r1 = subgraphHasCycle(r5, r6, r1, r7)
            if (r1 == 0) goto L1d
            return r3
        L34:
            com.google.common.graph.Graphs$NodeVisitState r5 = com.google.common.graph.Graphs.NodeVisitState.COMPLETE
            r6.put(r7, r5)
            return r2
    }

    public static <N> com.google.common.graph.Graph<N> transitiveClosure(com.google.common.graph.Graph<N> r10) {
            com.google.common.graph.GraphBuilder r0 = com.google.common.graph.GraphBuilder.from(r10)
            r1 = 1
            com.google.common.graph.GraphBuilder r0 = r0.allowsSelfLoops(r1)
            com.google.common.graph.MutableGraph r0 = r0.build()
            boolean r2 = r10.isDirected()
            if (r2 == 0) goto L3b
            java.util.Set r1 = r10.nodes()
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r1.next()
            java.util.Set r3 = reachableNodes(r10, r2)
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1b
            java.lang.Object r4 = r3.next()
            r0.putEdge(r2, r4)
            goto L2d
        L3b:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Set r3 = r10.nodes()
            java.util.Iterator r3 = r3.iterator()
        L48:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L88
            java.lang.Object r4 = r3.next()
            boolean r5 = r2.contains(r4)
            if (r5 != 0) goto L48
            java.util.Set r4 = reachableNodes(r10, r4)
            r2.addAll(r4)
            java.util.Iterator r5 = r4.iterator()
            r6 = 1
        L64:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L48
            java.lang.Object r7 = r5.next()
            int r8 = r6 + 1
            java.lang.Iterable r6 = com.google.common.collect.Iterables.limit(r4, r6)
            java.util.Iterator r6 = r6.iterator()
        L78:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L86
            java.lang.Object r9 = r6.next()
            r0.putEdge(r7, r9)
            goto L78
        L86:
            r6 = r8
            goto L64
        L88:
            return r0
    }

    public static <N> com.google.common.graph.EndpointPair<N> transpose(com.google.common.graph.EndpointPair<N> r1) {
            boolean r0 = r1.isOrdered()
            if (r0 == 0) goto L12
            java.lang.Object r0 = r1.target()
            java.lang.Object r1 = r1.source()
            com.google.common.graph.EndpointPair r1 = com.google.common.graph.EndpointPair.ordered(r0, r1)
        L12:
            return r1
    }

    public static <N> com.google.common.graph.Graph<N> transpose(com.google.common.graph.Graph<N> r1) {
            boolean r0 = r1.isDirected()
            if (r0 != 0) goto L7
            return r1
        L7:
            boolean r0 = r1 instanceof com.google.common.graph.Graphs.TransposedGraph
            if (r0 == 0) goto L12
            com.google.common.graph.Graphs$TransposedGraph r1 = (com.google.common.graph.Graphs.TransposedGraph) r1
            com.google.common.graph.Graph r1 = com.google.common.graph.Graphs.TransposedGraph.access$000(r1)
            return r1
        L12:
            com.google.common.graph.Graphs$TransposedGraph r0 = new com.google.common.graph.Graphs$TransposedGraph
            r0.<init>(r1)
            return r0
    }

    public static <N, E> com.google.common.graph.Network<N, E> transpose(com.google.common.graph.Network<N, E> r1) {
            boolean r0 = r1.isDirected()
            if (r0 != 0) goto L7
            return r1
        L7:
            boolean r0 = r1 instanceof com.google.common.graph.Graphs.TransposedNetwork
            if (r0 == 0) goto L12
            com.google.common.graph.Graphs$TransposedNetwork r1 = (com.google.common.graph.Graphs.TransposedNetwork) r1
            com.google.common.graph.Network r1 = com.google.common.graph.Graphs.TransposedNetwork.access$200(r1)
            return r1
        L12:
            com.google.common.graph.Graphs$TransposedNetwork r0 = new com.google.common.graph.Graphs$TransposedNetwork
            r0.<init>(r1)
            return r0
    }

    public static <N, V> com.google.common.graph.ValueGraph<N, V> transpose(com.google.common.graph.ValueGraph<N, V> r1) {
            boolean r0 = r1.isDirected()
            if (r0 != 0) goto L7
            return r1
        L7:
            boolean r0 = r1 instanceof com.google.common.graph.Graphs.TransposedValueGraph
            if (r0 == 0) goto L12
            com.google.common.graph.Graphs$TransposedValueGraph r1 = (com.google.common.graph.Graphs.TransposedValueGraph) r1
            com.google.common.graph.ValueGraph r1 = com.google.common.graph.Graphs.TransposedValueGraph.access$100(r1)
            return r1
        L12:
            com.google.common.graph.Graphs$TransposedValueGraph r0 = new com.google.common.graph.Graphs$TransposedValueGraph
            r0.<init>(r1)
            return r0
    }
}
