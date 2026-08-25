package com.google.common.graph;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
abstract class MultiEdgesConnecting<E> extends java.util.AbstractSet<E> {
    private final java.util.Map<E, ?> outEdgeToNode;
    private final java.lang.Object targetNode;


    public MultiEdgesConnecting(java.util.Map<E, ?> r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Map r1 = (java.util.Map) r1
            r0.outEdgeToNode = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            r0.targetNode = r1
            return
    }

    public static /* synthetic */ java.lang.Object access$000(com.google.common.graph.MultiEdgesConnecting r0) {
            java.lang.Object r0 = r0.targetNode
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.targetNode
            java.util.Map<E, ?> r1 = r2.outEdgeToNode
            java.lang.Object r3 = r1.get(r3)
            boolean r3 = r0.equals(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r2 = this;
            java.util.Map<E, ?> r0 = r2.outEdgeToNode
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.graph.MultiEdgesConnecting$1 r1 = new com.google.common.graph.MultiEdgesConnecting$1
            r1.<init>(r2, r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }
}
