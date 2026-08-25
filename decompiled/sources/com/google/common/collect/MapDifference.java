package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.errorprone.annotations.DoNotMock("Use Maps.difference")
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface MapDifference<K, V> {

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.errorprone.annotations.DoNotMock("Use Maps.difference")
    public interface ValueDifference<V> {
        boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

        int hashCode();

        @com.google.common.collect.ParametricNullness
        V leftValue();

        @com.google.common.collect.ParametricNullness
        V rightValue();
    }

    boolean areEqual();

    java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering();

    java.util.Map<K, V> entriesInCommon();

    java.util.Map<K, V> entriesOnlyOnLeft();

    java.util.Map<K, V> entriesOnlyOnRight();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

    int hashCode();
}
