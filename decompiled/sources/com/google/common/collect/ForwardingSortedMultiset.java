package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMultiset<E> extends com.google.common.collect.ForwardingMultiset<E> implements com.google.common.collect.SortedMultiset<E> {

    /* JADX INFO: loaded from: classes3.dex */
    public abstract class StandardDescendingMultiset extends com.google.common.collect.DescendingMultiset<E> {
        public final /* synthetic */ com.google.common.collect.ForwardingSortedMultiset this$0;

        public StandardDescendingMultiset(com.google.common.collect.ForwardingSortedMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.DescendingMultiset
        public final com.google.common.collect.SortedMultiset<E> forwardMultiset() {
                r1 = this;
                com.google.common.collect.ForwardingSortedMultiset r0 = r1.this$0
                return r0
        }
    }

    public class StandardElementSet extends com.google.common.collect.SortedMultisets.NavigableElementSet<E> {
        public StandardElementSet(com.google.common.collect.ForwardingSortedMultiset r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public ForwardingSortedMultiset() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public java.util.Comparator<? super E> comparator() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ com.google.common.collect.Multiset delegate() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.SortedMultiset<E> delegate();

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> descendingMultiset() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.SortedMultiset r0 = r0.descendingMultiset()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public java.util.NavigableSet<E> elementSet() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            java.util.NavigableSet r0 = r0.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.SortedSet elementSet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.Multiset$Entry r0 = r0.firstEntry()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> headMultiset(@com.google.common.collect.ParametricNullness E r2, com.google.common.collect.BoundType r3) {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.SortedMultiset r2 = r0.headMultiset(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.Multiset$Entry r0 = r0.lastEntry()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> pollFirstEntry() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.Multiset$Entry r0 = r0.pollFirstEntry()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.Multiset$Entry r0 = r0.pollLastEntry()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> subMultiset(@com.google.common.collect.ParametricNullness E r2, com.google.common.collect.BoundType r3, @com.google.common.collect.ParametricNullness E r4, com.google.common.collect.BoundType r5) {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.SortedMultiset r2 = r0.subMultiset(r2, r3, r4, r5)
            return r2
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> tailMultiset(@com.google.common.collect.ParametricNullness E r2, com.google.common.collect.BoundType r3) {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.SortedMultiset r2 = r0.tailMultiset(r2, r3)
            return r2
    }
}
