package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class StandardMutableValueGraph<N, V> extends com.google.common.graph.StandardValueGraph<N, V> implements com.google.common.graph.MutableValueGraph<N, V> {
    private final com.google.common.graph.ElementOrder<N> incidentEdgeOrder;

    public StandardMutableValueGraph(com.google.common.graph.AbstractGraphBuilder<? super N> r4) {
            r3 = this;
            com.google.common.graph.ElementOrder<N> r0 = r4.nodeOrder
            com.google.common.base.Optional<java.lang.Integer> r1 = r4.expectedNodeCount
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.or(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.Map r0 = r0.createMap(r1)
            r1 = 0
            r3.<init>(r4, r0, r1)
            com.google.common.graph.ElementOrder<N> r4 = r4.incidentEdgeOrder
            java.util.Objects.requireNonNull(r4)
            r3.incidentEdgeOrder = r4
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private com.google.common.graph.GraphConnections<N, V> addNodeInternal(N r3) {
            r2 = this;
            com.google.common.graph.GraphConnections r0 = r2.newConnections()
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r1 = r2.nodeConnections
            java.lang.Object r3 = r1.put(r3, r0)
            if (r3 != 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            com.google.common.base.Preconditions.checkState(r3)
            return r0
    }

    private com.google.common.graph.GraphConnections<N, V> newConnections() {
            r1 = this;
            boolean r0 = r1.isDirected()
            if (r0 == 0) goto Ld
            com.google.common.graph.ElementOrder<N> r0 = r1.incidentEdgeOrder
            com.google.common.graph.DirectedGraphConnections r0 = com.google.common.graph.DirectedGraphConnections.of(r0)
            goto L13
        Ld:
            com.google.common.graph.ElementOrder<N> r0 = r1.incidentEdgeOrder
            com.google.common.graph.UndirectedGraphConnections r0 = com.google.common.graph.UndirectedGraphConnections.of(r0)
        L13:
            return r0
    }

    @Override // com.google.common.graph.MutableValueGraph
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean addNode(N r2) {
            r1 = this;
            java.lang.String r0 = "node"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r1.nodeConnections
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto Lf
            r2 = 0
            return r2
        Lf:
            r1.addNodeInternal(r2)
            r2 = 1
            return r2
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder<N> r0 = r1.incidentEdgeOrder
            return r0
    }

    @Override // com.google.common.graph.MutableValueGraph
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V putEdgeValue(com.google.common.graph.EndpointPair<N> r2, V r3) {
            r1 = this;
            r1.validateEndpoints(r2)
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            java.lang.Object r2 = r1.putEdgeValue(r0, r2, r3)
            return r2
    }

    @Override // com.google.common.graph.MutableValueGraph
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V putEdgeValue(N r5, N r6, V r7) {
            r4 = this;
            java.lang.String r0 = "nodeU"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "nodeV"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            java.lang.String r0 = "value"
            com.google.common.base.Preconditions.checkNotNull(r7, r0)
            boolean r0 = r4.allowsSelfLoops()
            r1 = 1
            if (r0 != 0) goto L21
            boolean r0 = r5.equals(r6)
            r0 = r0 ^ r1
            java.lang.String r2 = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder."
            com.google.common.base.Preconditions.checkArgument(r0, r2, r5)
        L21:
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r4.nodeConnections
            java.lang.Object r0 = r0.get(r5)
            com.google.common.graph.GraphConnections r0 = (com.google.common.graph.GraphConnections) r0
            if (r0 != 0) goto L2f
            com.google.common.graph.GraphConnections r0 = r4.addNodeInternal(r5)
        L2f:
            java.lang.Object r0 = r0.addSuccessor(r6, r7)
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r2 = r4.nodeConnections
            java.lang.Object r2 = r2.get(r6)
            com.google.common.graph.GraphConnections r2 = (com.google.common.graph.GraphConnections) r2
            if (r2 != 0) goto L41
            com.google.common.graph.GraphConnections r2 = r4.addNodeInternal(r6)
        L41:
            r2.addPredecessor(r5, r7)
            if (r0 != 0) goto L5a
            long r5 = r4.edgeCount
            r2 = 1
            long r5 = r5 + r2
            r4.edgeCount = r5
            r2 = 0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L54
            goto L55
        L54:
            r1 = 0
        L55:
            java.lang.String r7 = "Not true that %s is positive."
            com.google.common.base.Preconditions.checkArgument(r1, r7, r5)
        L5a:
            return r0
    }

    @Override // com.google.common.graph.MutableValueGraph
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V removeEdge(com.google.common.graph.EndpointPair<N> r2) {
            r1 = this;
            r1.validateEndpoints(r2)
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            java.lang.Object r2 = r1.removeEdge(r0, r2)
            return r2
    }

    @Override // com.google.common.graph.MutableValueGraph
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V removeEdge(N r5, N r6) {
            r4 = this;
            java.lang.String r0 = "nodeU"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "nodeV"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r4.nodeConnections
            java.lang.Object r0 = r0.get(r5)
            com.google.common.graph.GraphConnections r0 = (com.google.common.graph.GraphConnections) r0
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r1 = r4.nodeConnections
            java.lang.Object r1 = r1.get(r6)
            com.google.common.graph.GraphConnections r1 = (com.google.common.graph.GraphConnections) r1
            if (r0 == 0) goto L33
            if (r1 != 0) goto L1f
            goto L33
        L1f:
            java.lang.Object r6 = r0.removeSuccessor(r6)
            if (r6 == 0) goto L32
            r1.removePredecessor(r5)
            long r0 = r4.edgeCount
            r2 = 1
            long r0 = r0 - r2
            r4.edgeCount = r0
            com.google.common.graph.Graphs.checkNonNegative(r0)
        L32:
            return r6
        L33:
            r5 = 0
            return r5
    }

    @Override // com.google.common.graph.MutableValueGraph
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean removeNode(N r9) {
            r8 = this;
            java.lang.String r0 = "node"
            com.google.common.base.Preconditions.checkNotNull(r9, r0)
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r8.nodeConnections
            java.lang.Object r0 = r0.get(r9)
            com.google.common.graph.GraphConnections r0 = (com.google.common.graph.GraphConnections) r0
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            boolean r2 = r8.allowsSelfLoops()
            r3 = 1
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.removeSuccessor(r9)
            if (r2 == 0) goto L27
            r0.removePredecessor(r9)
            long r5 = r8.edgeCount
            long r5 = r5 - r3
            r8.edgeCount = r5
        L27:
            java.util.Set r2 = r0.successors()
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r2.next()
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r6 = r8.nodeConnections
            java.lang.Object r5 = r6.getWithoutCaching(r5)
            com.google.common.graph.GraphConnections r5 = (com.google.common.graph.GraphConnections) r5
            java.util.Objects.requireNonNull(r5)
            com.google.common.graph.GraphConnections r5 = (com.google.common.graph.GraphConnections) r5
            r5.removePredecessor(r9)
            long r5 = r8.edgeCount
            long r5 = r5 - r3
            r8.edgeCount = r5
            goto L2f
        L4f:
            boolean r2 = r8.isDirected()
            r5 = 1
            if (r2 == 0) goto L87
            java.util.Set r0 = r0.predecessors()
            java.util.Iterator r0 = r0.iterator()
        L5e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L87
            java.lang.Object r2 = r0.next()
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r6 = r8.nodeConnections
            java.lang.Object r2 = r6.getWithoutCaching(r2)
            com.google.common.graph.GraphConnections r2 = (com.google.common.graph.GraphConnections) r2
            java.util.Objects.requireNonNull(r2)
            com.google.common.graph.GraphConnections r2 = (com.google.common.graph.GraphConnections) r2
            java.lang.Object r2 = r2.removeSuccessor(r9)
            if (r2 == 0) goto L7d
            r2 = 1
            goto L7e
        L7d:
            r2 = 0
        L7e:
            com.google.common.base.Preconditions.checkState(r2)
            long r6 = r8.edgeCount
            long r6 = r6 - r3
            r8.edgeCount = r6
            goto L5e
        L87:
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r8.nodeConnections
            r0.remove(r9)
            long r0 = r8.edgeCount
            com.google.common.graph.Graphs.checkNonNegative(r0)
            return r5
    }
}
