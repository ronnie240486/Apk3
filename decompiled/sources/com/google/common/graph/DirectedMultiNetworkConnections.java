package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class DirectedMultiNetworkConnections<N, E> extends com.google.common.graph.AbstractDirectedNetworkConnections<N, E> {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.lang.ref.Reference<com.google.common.collect.Multiset<N>> predecessorsReference;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.lang.ref.Reference<com.google.common.collect.Multiset<N>> successorsReference;


    private DirectedMultiNetworkConnections(java.util.Map<E, N> r1, java.util.Map<E, N> r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ com.google.common.collect.Multiset access$000(com.google.common.graph.DirectedMultiNetworkConnections r0) {
            com.google.common.collect.Multiset r0 = r0.successorsMultiset()
            return r0
    }

    @javax.annotation.CheckForNull
    private static <T> T getReference(@javax.annotation.CheckForNull java.lang.ref.Reference<T> r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.lang.Object r0 = r0.get()
        L8:
            return r0
    }

    public static <N, E> com.google.common.graph.DirectedMultiNetworkConnections<N, E> of() {
            com.google.common.graph.DirectedMultiNetworkConnections r0 = new com.google.common.graph.DirectedMultiNetworkConnections
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 2
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r3)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r2, r3)
            r2 = 0
            r0.<init>(r1, r4, r2)
            return r0
    }

    public static <N, E> com.google.common.graph.DirectedMultiNetworkConnections<N, E> ofImmutable(java.util.Map<E, N> r1, java.util.Map<E, N> r2, int r3) {
            com.google.common.graph.DirectedMultiNetworkConnections r0 = new com.google.common.graph.DirectedMultiNetworkConnections
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.copyOf(r1)
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.copyOf(r2)
            r0.<init>(r1, r2, r3)
            return r0
    }

    private com.google.common.collect.Multiset<N> predecessorsMultiset() {
            r2 = this;
            java.lang.ref.Reference<com.google.common.collect.Multiset<N>> r0 = r2.predecessorsReference
            java.lang.Object r0 = getReference(r0)
            com.google.common.collect.Multiset r0 = (com.google.common.collect.Multiset) r0
            if (r0 != 0) goto L1b
            java.util.Map<E, N> r0 = r2.inEdgeMap
            java.util.Collection r0 = r0.values()
            com.google.common.collect.HashMultiset r0 = com.google.common.collect.HashMultiset.create(r0)
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
            r1.<init>(r0)
            r2.predecessorsReference = r1
        L1b:
            return r0
    }

    private com.google.common.collect.Multiset<N> successorsMultiset() {
            r2 = this;
            java.lang.ref.Reference<com.google.common.collect.Multiset<N>> r0 = r2.successorsReference
            java.lang.Object r0 = getReference(r0)
            com.google.common.collect.Multiset r0 = (com.google.common.collect.Multiset) r0
            if (r0 != 0) goto L1b
            java.util.Map<E, N> r0 = r2.outEdgeMap
            java.util.Collection r0 = r0.values()
            com.google.common.collect.HashMultiset r0 = com.google.common.collect.HashMultiset.create(r0)
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
            r1.<init>(r0)
            r2.successorsReference = r1
        L1b:
            return r0
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addInEdge(E r1, N r2, boolean r3) {
            r0 = this;
            super.addInEdge(r1, r2, r3)
            java.lang.ref.Reference<com.google.common.collect.Multiset<N>> r1 = r0.predecessorsReference
            java.lang.Object r1 = getReference(r1)
            com.google.common.collect.Multiset r1 = (com.google.common.collect.Multiset) r1
            if (r1 == 0) goto L14
            boolean r1 = r1.add(r2)
            com.google.common.base.Preconditions.checkState(r1)
        L14:
            return
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addOutEdge(E r1, N r2) {
            r0 = this;
            super.addOutEdge(r1, r2)
            java.lang.ref.Reference<com.google.common.collect.Multiset<N>> r1 = r0.successorsReference
            java.lang.Object r1 = getReference(r1)
            com.google.common.collect.Multiset r1 = (com.google.common.collect.Multiset) r1
            if (r1 == 0) goto L14
            boolean r1 = r1.add(r2)
            com.google.common.base.Preconditions.checkState(r1)
        L14:
            return
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> edgesConnecting(N r3) {
            r2 = this;
            com.google.common.graph.DirectedMultiNetworkConnections$1 r0 = new com.google.common.graph.DirectedMultiNetworkConnections$1
            java.util.Map<E, N> r1 = r2.outEdgeMap
            r0.<init>(r2, r1, r3, r3)
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> predecessors() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.predecessorsMultiset()
            java.util.Set r0 = r0.elementSet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeInEdge(E r1, boolean r2) {
            r0 = this;
            java.lang.Object r1 = super.removeInEdge(r1, r2)
            java.lang.ref.Reference<com.google.common.collect.Multiset<N>> r2 = r0.predecessorsReference
            java.lang.Object r2 = getReference(r2)
            com.google.common.collect.Multiset r2 = (com.google.common.collect.Multiset) r2
            if (r2 == 0) goto L15
            boolean r2 = r2.remove(r1)
            com.google.common.base.Preconditions.checkState(r2)
        L15:
            return r1
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeOutEdge(E r2) {
            r1 = this;
            java.lang.Object r2 = super.removeOutEdge(r2)
            java.lang.ref.Reference<com.google.common.collect.Multiset<N>> r0 = r1.successorsReference
            java.lang.Object r0 = getReference(r0)
            com.google.common.collect.Multiset r0 = (com.google.common.collect.Multiset) r0
            if (r0 == 0) goto L15
            boolean r0 = r0.remove(r2)
            com.google.common.base.Preconditions.checkState(r0)
        L15:
            return r2
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> successors() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.successorsMultiset()
            java.util.Set r0 = r0.elementSet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }
}
