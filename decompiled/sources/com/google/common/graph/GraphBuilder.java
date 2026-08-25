package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.DoNotMock
@com.google.common.annotations.Beta
@com.google.common.graph.ElementTypesAreNonnullByDefault
public final class GraphBuilder<N> extends com.google.common.graph.AbstractGraphBuilder<N> {
    private GraphBuilder(boolean r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private <N1 extends N> com.google.common.graph.GraphBuilder<N1> cast() {
            r0 = this;
            return r0
    }

    public static com.google.common.graph.GraphBuilder<java.lang.Object> directed() {
            com.google.common.graph.GraphBuilder r0 = new com.google.common.graph.GraphBuilder
            r1 = 1
            r0.<init>(r1)
            return r0
    }

    public static <N> com.google.common.graph.GraphBuilder<N> from(com.google.common.graph.Graph<N> r2) {
            com.google.common.graph.GraphBuilder r0 = new com.google.common.graph.GraphBuilder
            boolean r1 = r2.isDirected()
            r0.<init>(r1)
            boolean r1 = r2.allowsSelfLoops()
            com.google.common.graph.GraphBuilder r0 = r0.allowsSelfLoops(r1)
            com.google.common.graph.ElementOrder r1 = r2.nodeOrder()
            com.google.common.graph.GraphBuilder r0 = r0.nodeOrder(r1)
            com.google.common.graph.ElementOrder r2 = r2.incidentEdgeOrder()
            com.google.common.graph.GraphBuilder r2 = r0.incidentEdgeOrder(r2)
            return r2
    }

    public static com.google.common.graph.GraphBuilder<java.lang.Object> undirected() {
            com.google.common.graph.GraphBuilder r0 = new com.google.common.graph.GraphBuilder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public com.google.common.graph.GraphBuilder<N> allowsSelfLoops(boolean r1) {
            r0 = this;
            r0.allowsSelfLoops = r1
            return r0
    }

    public <N1 extends N> com.google.common.graph.MutableGraph<N1> build() {
            r1 = this;
            com.google.common.graph.StandardMutableGraph r0 = new com.google.common.graph.StandardMutableGraph
            r0.<init>(r1)
            return r0
    }

    public final com.google.common.graph.GraphBuilder<N> copy() {
            r2 = this;
            com.google.common.graph.GraphBuilder r0 = new com.google.common.graph.GraphBuilder
            boolean r1 = r2.directed
            r0.<init>(r1)
            boolean r1 = r2.allowsSelfLoops
            r0.allowsSelfLoops = r1
            com.google.common.graph.ElementOrder<N> r1 = r2.nodeOrder
            r0.nodeOrder = r1
            com.google.common.base.Optional<java.lang.Integer> r1 = r2.expectedNodeCount
            r0.expectedNodeCount = r1
            com.google.common.graph.ElementOrder<N> r1 = r2.incidentEdgeOrder
            r0.incidentEdgeOrder = r1
            return r0
    }

    public com.google.common.graph.GraphBuilder<N> expectedNodeCount(int r1) {
            r0 = this;
            com.google.common.graph.Graphs.checkNonNegative(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.common.base.Optional r1 = com.google.common.base.Optional.of(r1)
            r0.expectedNodeCount = r1
            return r0
    }

    public <N1 extends N> com.google.common.graph.ImmutableGraph.Builder<N1> immutable() {
            r2 = this;
            com.google.common.graph.GraphBuilder r0 = r2.cast()
            com.google.common.graph.ImmutableGraph$Builder r1 = new com.google.common.graph.ImmutableGraph$Builder
            r1.<init>(r0)
            return r1
    }

    public <N1 extends N> com.google.common.graph.GraphBuilder<N1> incidentEdgeOrder(com.google.common.graph.ElementOrder<N1> r3) {
            r2 = this;
            com.google.common.graph.ElementOrder$Type r0 = r3.type()
            com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.UNORDERED
            if (r0 == r1) goto L13
            com.google.common.graph.ElementOrder$Type r0 = r3.type()
            com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.STABLE
            if (r0 != r1) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            java.lang.String r1 = "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable()."
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            com.google.common.graph.GraphBuilder r0 = r2.cast()
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.graph.ElementOrder r3 = (com.google.common.graph.ElementOrder) r3
            r0.incidentEdgeOrder = r3
            return r0
    }

    public <N1 extends N> com.google.common.graph.GraphBuilder<N1> nodeOrder(com.google.common.graph.ElementOrder<N1> r2) {
            r1 = this;
            com.google.common.graph.GraphBuilder r0 = r1.cast()
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.graph.ElementOrder r2 = (com.google.common.graph.ElementOrder) r2
            r0.nodeOrder = r2
            return r0
    }
}
