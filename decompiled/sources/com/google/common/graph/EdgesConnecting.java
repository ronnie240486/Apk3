package com.google.common.graph;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class EdgesConnecting<E> extends java.util.AbstractSet<E> {
    private final java.util.Map<?, E> nodeToOutEdge;
    private final java.lang.Object targetNode;

    public EdgesConnecting(java.util.Map<?, E> r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Map r1 = (java.util.Map) r1
            r0.nodeToOutEdge = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            r0.targetNode = r1
            return
    }

    @javax.annotation.CheckForNull
    private E getConnectingEdge() {
            r2 = this;
            java.util.Map<?, E> r0 = r2.nodeToOutEdge
            java.lang.Object r1 = r2.targetNode
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.getConnectingEdge()
            if (r0 == 0) goto Le
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r1 = this;
            java.lang.Object r0 = r1.getConnectingEdge()
            if (r0 != 0) goto Lf
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            goto L13
        Lf:
            com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.singletonIterator(r0)
        L13:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            java.lang.Object r0 = r1.getConnectingEdge()
            if (r0 != 0) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = 1
        L9:
            return r0
    }
}
