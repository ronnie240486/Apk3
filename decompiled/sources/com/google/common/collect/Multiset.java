package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface Multiset<E> extends java.util.Collection<E> {

    public interface Entry<E> {
        boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

        int getCount();

        @com.google.common.collect.ParametricNullness
        E getElement();

        int hashCode();

        java.lang.String toString();
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    int add(@com.google.common.collect.ParametricNullness E r1, int r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean add(@com.google.common.collect.ParametricNullness E r1);

    boolean contains(@javax.annotation.CheckForNull java.lang.Object r1);

    @Override // java.util.Collection
    boolean containsAll(java.util.Collection<?> r1);

    int count(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("E") java.lang.Object r1);

    java.util.Set<E> elementSet();

    java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

    int hashCode();

    java.util.Iterator<E> iterator();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    int remove(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("E") java.lang.Object r1, int r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean remove(@javax.annotation.CheckForNull java.lang.Object r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean removeAll(java.util.Collection<?> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean retainAll(java.util.Collection<?> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    int setCount(@com.google.common.collect.ParametricNullness E r1, int r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean setCount(@com.google.common.collect.ParametricNullness E r1, int r2, int r3);

    int size();

    java.lang.String toString();
}
