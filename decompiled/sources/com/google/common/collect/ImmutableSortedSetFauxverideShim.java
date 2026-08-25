package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class ImmutableSortedSetFauxverideShim<E> extends com.google.common.collect.ImmutableSet<E> {
    public ImmutableSortedSetFauxverideShim() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.DoNotCall("Use naturalOrder")
    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet.Builder<E> builder() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.errorprone.annotations.DoNotCall("Use naturalOrder (which does not accept an expected size)")
    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet.Builder<E> builderWithExpectedSize(int r0) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.errorprone.annotations.DoNotCall("Pass parameters of type Comparable")
    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(E[] r0) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.errorprone.annotations.DoNotCall("Pass a parameter of type Comparable")
    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> of(E r0) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.errorprone.annotations.DoNotCall("Pass parameters of type Comparable")
    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> of(E r0, E r1) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.errorprone.annotations.DoNotCall("Pass parameters of type Comparable")
    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> of(E r0, E r1, E r2) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.errorprone.annotations.DoNotCall("Pass parameters of type Comparable")
    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> of(E r0, E r1, E r2, E r3) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.errorprone.annotations.DoNotCall("Pass parameters of type Comparable")
    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> of(E r0, E r1, E r2, E r3, E r4) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.errorprone.annotations.DoNotCall("Pass parameters of type Comparable")
    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet<E> of(E r0, E r1, E r2, E r3, E r4, E r5, E... r6) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
