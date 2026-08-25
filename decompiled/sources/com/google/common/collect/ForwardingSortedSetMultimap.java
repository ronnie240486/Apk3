package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSetMultimap<K, V> extends com.google.common.collect.ForwardingSetMultimap<K, V> implements com.google.common.collect.SortedSetMultimap<K, V> {
    public ForwardingSortedSetMultimap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ com.google.common.collect.Multimap delegate() {
            r1 = this;
            com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ com.google.common.collect.SetMultimap delegate() {
            r1 = this;
            com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.SortedSetMultimap<K, V> delegate();

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
            r0 = this;
            java.util.SortedSet r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Set get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
            r0 = this;
            java.util.SortedSet r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedSet<V> get(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
            java.util.SortedSet r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.util.SortedSet r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Set removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.util.SortedSet r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedSet<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
            java.util.SortedSet r2 = r0.removeAll(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.SortedSet r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Set replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.SortedSet r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.SortedSet<V> replaceValues(@com.google.common.collect.ParametricNullness K r2, java.lang.Iterable<? extends V> r3) {
            r1 = this;
            com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
            java.util.SortedSet r2 = r0.replaceValues(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.SortedSetMultimap
    @javax.annotation.CheckForNull
    public java.util.Comparator<? super V> valueComparator() {
            r1 = this;
            com.google.common.collect.SortedSetMultimap r0 = r1.delegate()
            java.util.Comparator r0 = r0.valueComparator()
            return r0
    }
}
