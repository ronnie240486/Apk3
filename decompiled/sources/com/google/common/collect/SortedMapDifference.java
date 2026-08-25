package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface SortedMapDifference<K, V> extends com.google.common.collect.MapDifference<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.SortedMapDifference$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC<K, V> {
        public static /* bridge */ /* synthetic */ java.util.Map $default$entriesDiffering(com.google.common.collect.SortedMapDifference r0) {
                java.util.SortedMap r0 = r0.entriesDiffering()
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.Map $default$entriesInCommon(com.google.common.collect.SortedMapDifference r0) {
                java.util.SortedMap r0 = r0.entriesInCommon()
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.Map $default$entriesOnlyOnLeft(com.google.common.collect.SortedMapDifference r0) {
                java.util.SortedMap r0 = r0.entriesOnlyOnLeft()
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.Map $default$entriesOnlyOnRight(com.google.common.collect.SortedMapDifference r0) {
                java.util.SortedMap r0 = r0.entriesOnlyOnRight()
                return r0
        }
    }

    @Override // com.google.common.collect.MapDifference
    /* bridge */ /* synthetic */ java.util.Map entriesDiffering();

    @Override // com.google.common.collect.MapDifference
    java.util.SortedMap<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering();

    @Override // com.google.common.collect.MapDifference
    /* bridge */ /* synthetic */ java.util.Map entriesInCommon();

    @Override // com.google.common.collect.MapDifference
    java.util.SortedMap<K, V> entriesInCommon();

    @Override // com.google.common.collect.MapDifference
    /* bridge */ /* synthetic */ java.util.Map entriesOnlyOnLeft();

    @Override // com.google.common.collect.MapDifference
    java.util.SortedMap<K, V> entriesOnlyOnLeft();

    @Override // com.google.common.collect.MapDifference
    /* bridge */ /* synthetic */ java.util.Map entriesOnlyOnRight();

    @Override // com.google.common.collect.MapDifference
    java.util.SortedMap<K, V> entriesOnlyOnRight();
}
