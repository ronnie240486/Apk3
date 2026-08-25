package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class AbstractGraphBuilder<N> {
    public boolean allowsSelfLoops;
    public final boolean directed;
    public com.google.common.base.Optional<java.lang.Integer> expectedNodeCount;
    public com.google.common.graph.ElementOrder<N> incidentEdgeOrder;
    public com.google.common.graph.ElementOrder<N> nodeOrder;

    public AbstractGraphBuilder(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.allowsSelfLoops = r0
            com.google.common.graph.ElementOrder r0 = com.google.common.graph.ElementOrder.insertion()
            r1.nodeOrder = r0
            com.google.common.graph.ElementOrder r0 = com.google.common.graph.ElementOrder.unordered()
            r1.incidentEdgeOrder = r0
            com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
            r1.expectedNodeCount = r0
            r1.directed = r2
            return
    }
}
