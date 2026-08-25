package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
interface FilteredSetMultimap<K, V> extends com.google.common.collect.FilteredMultimap<K, V>, com.google.common.collect.SetMultimap<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.FilteredSetMultimap$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public final /* synthetic */ class CC<K, V> {
        public static /* bridge */ /* synthetic */ com.google.common.collect.Multimap $default$unfiltered(com.google.common.collect.FilteredSetMultimap r0) {
                com.google.common.collect.SetMultimap r0 = r0.unfiltered()
                return r0
        }
    }

    @Override // com.google.common.collect.FilteredMultimap
    /* bridge */ /* synthetic */ com.google.common.collect.Multimap unfiltered();

    @Override // com.google.common.collect.FilteredMultimap
    com.google.common.collect.SetMultimap<K, V> unfiltered();
}
