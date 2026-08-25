package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class EndpointPairIterator<N> extends com.google.common.collect.AbstractIterator<com.google.common.graph.EndpointPair<N>> {
    private final com.google.common.graph.BaseGraph<N> graph;

    @javax.annotation.CheckForNull
    public N node;
    private final java.util.Iterator<N> nodeIterator;
    public java.util.Iterator<N> successorIterator;

    /* JADX INFO: renamed from: com.google.common.graph.EndpointPairIterator$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Directed<N> extends com.google.common.graph.EndpointPairIterator<N> {
        private Directed(com.google.common.graph.BaseGraph<N> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public /* synthetic */ Directed(com.google.common.graph.BaseGraph r1, com.google.common.graph.EndpointPairIterator.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.AbstractIterator
        @javax.annotation.CheckForNull
        public final java.lang.Object computeNext() {
                r2 = this;
            L0:
                java.util.Iterator<N> r0 = r2.successorIterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L18
                N r0 = r2.node
                java.util.Objects.requireNonNull(r0)
                java.util.Iterator<N> r1 = r2.successorIterator
                java.lang.Object r1 = r1.next()
                com.google.common.graph.EndpointPair r0 = com.google.common.graph.EndpointPair.ordered(r0, r1)
                goto L22
            L18:
                boolean r0 = r2.advance()
                if (r0 != 0) goto L0
                r2.endOfData()
                r0 = 0
            L22:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Undirected<N> extends com.google.common.graph.EndpointPairIterator<N> {

        @javax.annotation.CheckForNull
        private java.util.Set<N> visitedNodes;

        private Undirected(com.google.common.graph.BaseGraph<N> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                java.util.Set r2 = r2.nodes()
                int r2 = r2.size()
                int r2 = r2 + 1
                java.util.HashSet r2 = com.google.common.collect.Sets.newHashSetWithExpectedSize(r2)
                r1.visitedNodes = r2
                return
        }

        public /* synthetic */ Undirected(com.google.common.graph.BaseGraph r1, com.google.common.graph.EndpointPairIterator.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.AbstractIterator
        @javax.annotation.CheckForNull
        public final java.lang.Object computeNext() {
                r2 = this;
            L0:
                java.util.Set<N> r0 = r2.visitedNodes
                java.util.Objects.requireNonNull(r0)
            L5:
                java.util.Iterator<N> r0 = r2.successorIterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L25
                java.util.Iterator<N> r0 = r2.successorIterator
                java.lang.Object r0 = r0.next()
                java.util.Set<N> r1 = r2.visitedNodes
                boolean r1 = r1.contains(r0)
                if (r1 != 0) goto L5
                N r1 = r2.node
                java.util.Objects.requireNonNull(r1)
                com.google.common.graph.EndpointPair r0 = com.google.common.graph.EndpointPair.unordered(r1, r0)
                goto L38
            L25:
                java.util.Set<N> r0 = r2.visitedNodes
                N r1 = r2.node
                r0.add(r1)
                boolean r0 = r2.advance()
                if (r0 != 0) goto L0
                r0 = 0
                r2.visitedNodes = r0
                r2.endOfData()
            L38:
                return r0
        }
    }

    private EndpointPairIterator(com.google.common.graph.BaseGraph<N> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.node = r0
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            r1.successorIterator = r0
            r1.graph = r2
            java.util.Set r2 = r2.nodes()
            java.util.Iterator r2 = r2.iterator()
            r1.nodeIterator = r2
            return
    }

    public /* synthetic */ EndpointPairIterator(com.google.common.graph.BaseGraph r1, com.google.common.graph.EndpointPairIterator.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public final boolean advance() {
            r3 = this;
            java.util.Iterator<N> r0 = r3.successorIterator
            boolean r0 = r0.hasNext()
            r1 = 1
            r0 = r0 ^ r1
            com.google.common.base.Preconditions.checkState(r0)
            java.util.Iterator<N> r0 = r3.nodeIterator
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L15
            r0 = 0
            return r0
        L15:
            java.util.Iterator<N> r0 = r3.nodeIterator
            java.lang.Object r0 = r0.next()
            r3.node = r0
            com.google.common.graph.BaseGraph<N> r2 = r3.graph
            java.util.Set r0 = r2.successors(r0)
            java.util.Iterator r0 = r0.iterator()
            r3.successorIterator = r0
            return r1
    }
}
