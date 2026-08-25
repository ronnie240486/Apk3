package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class FilteredKeyListMultimap<K, V> extends com.google.common.collect.FilteredKeyMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
    public FilteredKeyListMultimap(com.google.common.collect.ListMultimap<K, V> r1, com.google.common.base.Predicate<? super K> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> get(@com.google.common.collect.ParametricNullness K r1) {
            r0 = this;
            java.util.Collection r1 = super.get(r1)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.util.Collection r1 = super.removeAll(r1)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.List r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.util.Collection r1 = super.replaceValues(r1, r2)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.FilteredMultimap
    public com.google.common.collect.ListMultimap<K, V> unfiltered() {
            r1 = this;
            com.google.common.collect.Multimap r0 = super.unfiltered()
            com.google.common.collect.ListMultimap r0 = (com.google.common.collect.ListMultimap) r0
            return r0
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.FilteredMultimap
    public /* bridge */ /* synthetic */ com.google.common.collect.Multimap unfiltered() {
            r1 = this;
            com.google.common.collect.ListMultimap r0 = r1.unfiltered()
            return r0
    }
}
