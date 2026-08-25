package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface SortedMultiset<E> extends com.google.common.collect.SortedMultisetBridge<E>, com.google.common.collect.SortedIterable<E> {

    /* JADX INFO: renamed from: com.google.common.collect.SortedMultiset$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC<E> {
        public static /* bridge */ /* synthetic */ java.util.Set $default$elementSet(com.google.common.collect.SortedMultiset r0) {
                java.util.NavigableSet r0 = r0.elementSet()
                return r0
        }

        /* JADX INFO: renamed from: $default$elementSet, reason: collision with other method in class */
        public static /* bridge */ /* synthetic */ java.util.SortedSet m303$default$elementSet(com.google.common.collect.SortedMultiset r0) {
                java.util.NavigableSet r0 = r0.elementSet()
                return r0
        }
    }

    java.util.Comparator<? super E> comparator();

    com.google.common.collect.SortedMultiset<E> descendingMultiset();

    @Override // com.google.common.collect.SortedMultisetBridge, com.google.common.collect.Multiset
    java.util.NavigableSet<E> elementSet();

    @Override // com.google.common.collect.SortedMultisetBridge, com.google.common.collect.Multiset
    /* bridge */ /* synthetic */ java.util.Set elementSet();

    @Override // com.google.common.collect.SortedMultisetBridge, com.google.common.collect.Multiset
    /* bridge */ /* synthetic */ java.util.SortedSet elementSet();

    @Override // com.google.common.collect.Multiset
    java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet();

    @javax.annotation.CheckForNull
    com.google.common.collect.Multiset.Entry<E> firstEntry();

    com.google.common.collect.SortedMultiset<E> headMultiset(@com.google.common.collect.ParametricNullness E r1, com.google.common.collect.BoundType r2);

    @Override // com.google.common.collect.Multiset, java.util.Collection, java.lang.Iterable
    java.util.Iterator<E> iterator();

    @javax.annotation.CheckForNull
    com.google.common.collect.Multiset.Entry<E> lastEntry();

    @javax.annotation.CheckForNull
    com.google.common.collect.Multiset.Entry<E> pollFirstEntry();

    @javax.annotation.CheckForNull
    com.google.common.collect.Multiset.Entry<E> pollLastEntry();

    com.google.common.collect.SortedMultiset<E> subMultiset(@com.google.common.collect.ParametricNullness E r1, com.google.common.collect.BoundType r2, @com.google.common.collect.ParametricNullness E r3, com.google.common.collect.BoundType r4);

    com.google.common.collect.SortedMultiset<E> tailMultiset(@com.google.common.collect.ParametricNullness E r1, com.google.common.collect.BoundType r2);
}
