package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface Multimap<K, V> {
    java.util.Map<K, java.util.Collection<V>> asMap();

    void clear();

    boolean containsEntry(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("K") java.lang.Object r1, @javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("V") java.lang.Object r2);

    boolean containsKey(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("K") java.lang.Object r1);

    boolean containsValue(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("V") java.lang.Object r1);

    java.util.Collection<java.util.Map.Entry<K, V>> entries();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

    java.util.Collection<V> get(@com.google.common.collect.ParametricNullness K r1);

    int hashCode();

    boolean isEmpty();

    java.util.Set<K> keySet();

    com.google.common.collect.Multiset<K> keys();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean put(@com.google.common.collect.ParametricNullness K r1, @com.google.common.collect.ParametricNullness V r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean putAll(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean remove(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("K") java.lang.Object r1, @javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("V") java.lang.Object r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.util.Collection<V> removeAll(@javax.annotation.CheckForNull @com.google.errorprone.annotations.CompatibleWith("K") java.lang.Object r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.util.Collection<V> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2);

    int size();

    java.util.Collection<V> values();
}
