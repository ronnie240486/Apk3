package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class UndirectedGraphConnections<N, V> implements com.google.common.graph.GraphConnections<N, V> {
    private final java.util.Map<N, V> adjacentNodeValues;


    /* JADX INFO: renamed from: com.google.common.graph.UndirectedGraphConnections$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type = null;

        static {
                com.google.common.graph.ElementOrder$Type[] r0 = com.google.common.graph.ElementOrder.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.graph.UndirectedGraphConnections.AnonymousClass2.$SwitchMap$com$google$common$graph$ElementOrder$Type = r0
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.UNORDERED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.graph.UndirectedGraphConnections.AnonymousClass2.$SwitchMap$com$google$common$graph$ElementOrder$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.STABLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    private UndirectedGraphConnections(java.util.Map<N, V> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Map r1 = (java.util.Map) r1
            r0.adjacentNodeValues = r1
            return
    }

    public static <N, V> com.google.common.graph.UndirectedGraphConnections<N, V> of(com.google.common.graph.ElementOrder<N> r4) {
            int[] r0 = com.google.common.graph.UndirectedGraphConnections.AnonymousClass2.$SwitchMap$com$google$common$graph$ElementOrder$Type
            com.google.common.graph.ElementOrder$Type r1 = r4.type()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 2
            if (r0 == r1) goto L29
            if (r0 != r3) goto L1f
            com.google.common.graph.UndirectedGraphConnections r4 = new com.google.common.graph.UndirectedGraphConnections
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r3, r2)
            r4.<init>(r0)
            return r4
        L1f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            com.google.common.graph.ElementOrder$Type r4 = r4.type()
            r0.<init>(r4)
            throw r0
        L29:
            com.google.common.graph.UndirectedGraphConnections r4 = new com.google.common.graph.UndirectedGraphConnections
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r3, r2)
            r4.<init>(r0)
            return r4
    }

    public static <N, V> com.google.common.graph.UndirectedGraphConnections<N, V> ofImmutable(java.util.Map<N, V> r1) {
            com.google.common.graph.UndirectedGraphConnections r0 = new com.google.common.graph.UndirectedGraphConnections
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.copyOf(r1)
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N r1, V r2) {
            r0 = this;
            r0.addSuccessor(r1, r2)
            return
    }

    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V addSuccessor(N r2, V r3) {
            r1 = this;
            java.util.Map<N, V> r0 = r1.adjacentNodeValues
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> adjacentNodes() {
            r1 = this;
            java.util.Map<N, V> r0 = r1.adjacentNodeValues
            java.util.Set r0 = r0.keySet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Iterator<com.google.common.graph.EndpointPair<N>> incidentEdgeIterator(N r3) {
            r2 = this;
            java.util.Map<N, V> r0 = r2.adjacentNodeValues
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.graph.UndirectedGraphConnections$1 r1 = new com.google.common.graph.UndirectedGraphConnections$1
            r1.<init>(r3)
            java.util.Iterator r3 = com.google.common.collect.Iterators.transform(r0, r1)
            return r3
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> predecessors() {
            r1 = this;
            java.util.Set r0 = r1.adjacentNodes()
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N r1) {
            r0 = this;
            r0.removeSuccessor(r1)
            return
    }

    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V removeSuccessor(N r2) {
            r1 = this;
            java.util.Map<N, V> r0 = r1.adjacentNodeValues
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> successors() {
            r1 = this;
            java.util.Set r0 = r1.adjacentNodes()
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V value(N r2) {
            r1 = this;
            java.util.Map<N, V> r0 = r1.adjacentNodeValues
            java.lang.Object r2 = r0.get(r2)
            return r2
    }
}
