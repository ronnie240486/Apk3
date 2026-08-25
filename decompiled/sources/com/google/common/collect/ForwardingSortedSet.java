package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSet<E> extends com.google.common.collect.ForwardingSet<E> implements java.util.SortedSet<E> {
    public ForwardingSortedSet() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.SortedSet
    @javax.annotation.CheckForNull
    public java.util.Comparator<? super E> comparator() {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.Set delegate() {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.SortedSet<E> delegate();

    @Override // java.util.SortedSet
    @com.google.common.collect.ParametricNullness
    public E first() {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            java.lang.Object r0 = r0.first()
            return r0
    }

    @Override // java.util.SortedSet
    public java.util.SortedSet<E> headSet(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            java.util.SortedSet r2 = r0.headSet(r2)
            return r2
    }

    @Override // java.util.SortedSet
    @com.google.common.collect.ParametricNullness
    public E last() {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            java.lang.Object r0 = r0.last()
            return r0
    }

    @Override // java.util.SortedSet
    public java.util.SortedSet<E> subSet(@com.google.common.collect.ParametricNullness E r2, @com.google.common.collect.ParametricNullness E r3) {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            java.util.SortedSet r2 = r0.subSet(r2, r3)
            return r2
    }

    @Override // java.util.SortedSet
    public java.util.SortedSet<E> tailSet(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            java.util.SortedSet r2 = r0.tailSet(r2)
            return r2
    }
}
