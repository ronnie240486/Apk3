package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class LinkedHashMultiset<E> extends com.google.common.collect.AbstractMapBasedMultiset<E> {
    public LinkedHashMultiset(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static <E> com.google.common.collect.LinkedHashMultiset<E> create() {
            r0 = 3
            com.google.common.collect.LinkedHashMultiset r0 = create(r0)
            return r0
    }

    public static <E> com.google.common.collect.LinkedHashMultiset<E> create(int r1) {
            com.google.common.collect.LinkedHashMultiset r0 = new com.google.common.collect.LinkedHashMultiset
            r0.<init>(r1)
            return r0
    }

    public static <E> com.google.common.collect.LinkedHashMultiset<E> create(java.lang.Iterable<? extends E> r1) {
            int r0 = com.google.common.collect.Multisets.inferDistinctElements(r1)
            com.google.common.collect.LinkedHashMultiset r0 = create(r0)
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            java.util.Set r0 = super.elementSet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            java.util.Set r0 = super.entrySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
            r1 = this;
            boolean r0 = super.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultiset
    public final com.google.common.collect.ObjectCountHashMap<E> newBackingMap(int r2) {
            r1 = this;
            com.google.common.collect.ObjectCountLinkedHashMap r0 = new com.google.common.collect.ObjectCountLinkedHashMap
            r0.<init>(r2)
            return r0
    }
}
