package com.google.common.collect;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
@com.google.errorprone.annotations.DoNotMock("Use ImmutableRangeMap or TreeRangeMap")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface RangeMap<K extends java.lang.Comparable, V> {
    java.util.Map<com.google.common.collect.Range<K>, V> asDescendingMapOfRanges();

    java.util.Map<com.google.common.collect.Range<K>, V> asMapOfRanges();

    void clear();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

    @javax.annotation.CheckForNull
    V get(K r1);

    @javax.annotation.CheckForNull
    java.util.Map.Entry<com.google.common.collect.Range<K>, V> getEntry(K r1);

    int hashCode();

    void put(com.google.common.collect.Range<K> r1, V r2);

    void putAll(com.google.common.collect.RangeMap<K, V> r1);

    void putCoalescing(com.google.common.collect.Range<K> r1, V r2);

    void remove(com.google.common.collect.Range<K> r1);

    com.google.common.collect.Range<K> span();

    com.google.common.collect.RangeMap<K, V> subRangeMap(com.google.common.collect.Range<K> r1);

    java.lang.String toString();
}
