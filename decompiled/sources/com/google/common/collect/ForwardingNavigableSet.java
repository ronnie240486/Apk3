package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableSet<E> extends com.google.common.collect.ForwardingSortedSet<E> implements java.util.NavigableSet<E> {

    @com.google.common.annotations.Beta
    public class StandardDescendingSet extends com.google.common.collect.Sets.DescendingSet<E> {
        public StandardDescendingSet(com.google.common.collect.ForwardingNavigableSet r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public ForwardingNavigableSet() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E ceiling(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.lang.Object r2 = r0.ceiling(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.NavigableSet<E> delegate();

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.Set delegate() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.SortedSet delegate() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            return r0
    }

    @Override // java.util.NavigableSet
    public java.util.Iterator<E> descendingIterator() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.util.Iterator r0 = r0.descendingIterator()
            return r0
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> descendingSet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.util.NavigableSet r0 = r0.descendingSet()
            return r0
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E floor(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.lang.Object r2 = r0.floor(r2)
            return r2
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> headSet(@com.google.common.collect.ParametricNullness E r2, boolean r3) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.util.NavigableSet r2 = r0.headSet(r2, r3)
            return r2
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E higher(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.lang.Object r2 = r0.higher(r2)
            return r2
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E lower(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.lang.Object r2 = r0.lower(r2)
            return r2
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E pollFirst() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.lang.Object r0 = r0.pollFirst()
            return r0
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public E pollLast() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.lang.Object r0 = r0.pollLast()
            return r0
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> subSet(@com.google.common.collect.ParametricNullness E r2, boolean r3, @com.google.common.collect.ParametricNullness E r4, boolean r5) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.util.NavigableSet r2 = r0.subSet(r2, r3, r4, r5)
            return r2
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> tailSet(@com.google.common.collect.ParametricNullness E r2, boolean r3) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.util.NavigableSet r2 = r0.tailSet(r2, r3)
            return r2
    }
}
