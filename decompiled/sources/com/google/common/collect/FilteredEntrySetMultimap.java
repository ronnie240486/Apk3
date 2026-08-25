package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class FilteredEntrySetMultimap<K, V> extends com.google.common.collect.FilteredEntryMultimap<K, V> implements com.google.common.collect.FilteredSetMultimap<K, V> {
    public FilteredEntrySetMultimap(com.google.common.collect.SetMultimap<K, V> r1, com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.AbstractMultimap
    public final java.util.Collection createEntries() {
            r2 = this;
            com.google.common.collect.SetMultimap r0 = r2.unfiltered()
            java.util.Set r0 = r0.entries()
            com.google.common.base.Predicate r1 = r2.entryPredicate()
            java.util.Set r0 = com.google.common.collect.Sets.filter(r0, r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection entries() {
            r1 = this;
            java.util.Set r0 = r1.entries()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Set<java.util.Map.Entry<K, V>> entries() {
            r1 = this;
            java.util.Collection r0 = super.entries()
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Set<V> get(@com.google.common.collect.ParametricNullness K r1) {
            r0 = this;
            java.util.Collection r1 = super.get(r1)
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Set<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.util.Collection r1 = super.removeAll(r1)
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.Set r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Set<V> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.util.Collection r1 = super.replaceValues(r1, r2)
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.FilteredMultimap
    public /* bridge */ /* synthetic */ com.google.common.collect.Multimap unfiltered() {
            r1 = this;
            com.google.common.collect.SetMultimap r0 = r1.unfiltered()
            return r0
    }

    @Override // com.google.common.collect.FilteredEntryMultimap, com.google.common.collect.FilteredMultimap
    public com.google.common.collect.SetMultimap<K, V> unfiltered() {
            r1 = this;
            com.google.common.collect.Multimap<K, V> r0 = r1.unfiltered
            com.google.common.collect.SetMultimap r0 = (com.google.common.collect.SetMultimap) r0
            return r0
    }
}
