package com.google.common.collect;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
@com.google.errorprone.annotations.DoNotMock("Use ImmutableRangeSet or TreeRangeSet")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface RangeSet<C extends java.lang.Comparable> {
    void add(com.google.common.collect.Range<C> r1);

    void addAll(com.google.common.collect.RangeSet<C> r1);

    void addAll(java.lang.Iterable<com.google.common.collect.Range<C>> r1);

    java.util.Set<com.google.common.collect.Range<C>> asDescendingSetOfRanges();

    java.util.Set<com.google.common.collect.Range<C>> asRanges();

    void clear();

    com.google.common.collect.RangeSet<C> complement();

    boolean contains(C r1);

    boolean encloses(com.google.common.collect.Range<C> r1);

    boolean enclosesAll(com.google.common.collect.RangeSet<C> r1);

    boolean enclosesAll(java.lang.Iterable<com.google.common.collect.Range<C>> r1);

    boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

    int hashCode();

    boolean intersects(com.google.common.collect.Range<C> r1);

    boolean isEmpty();

    @javax.annotation.CheckForNull
    com.google.common.collect.Range<C> rangeContaining(C r1);

    void remove(com.google.common.collect.Range<C> r1);

    void removeAll(com.google.common.collect.RangeSet<C> r1);

    void removeAll(java.lang.Iterable<com.google.common.collect.Range<C>> r1);

    com.google.common.collect.Range<C> span();

    com.google.common.collect.RangeSet<C> subRangeSet(com.google.common.collect.Range<C> r1);

    java.lang.String toString();
}
