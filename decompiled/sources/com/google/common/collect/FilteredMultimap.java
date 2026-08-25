package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
interface FilteredMultimap<K, V> extends com.google.common.collect.Multimap<K, V> {
    com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate();

    com.google.common.collect.Multimap<K, V> unfiltered();
}
