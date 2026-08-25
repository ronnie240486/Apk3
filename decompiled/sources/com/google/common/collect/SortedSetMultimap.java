package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface SortedSetMultimap<K, V> extends com.google.common.collect.SetMultimap<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.SortedSetMultimap$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public final /* synthetic */ class CC<K, V> {
        public static /* bridge */ /* synthetic */ java.util.Collection $default$get(com.google.common.collect.SortedSetMultimap r0, @com.google.common.collect.ParametricNullness java.lang.Object r1) {
                java.util.SortedSet r0 = r0.get(r1)
                return r0
        }

        /* JADX INFO: renamed from: $default$get, reason: collision with other method in class */
        public static /* bridge */ /* synthetic */ java.util.Set m304$default$get(com.google.common.collect.SortedSetMultimap r0, @com.google.common.collect.ParametricNullness java.lang.Object r1) {
                java.util.SortedSet r0 = r0.get(r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public static /* bridge */ /* synthetic */ java.util.Collection $default$removeAll(com.google.common.collect.SortedSetMultimap r0, @javax.annotation.CheckForNull java.lang.Object r1) {
                java.util.SortedSet r0 = r0.removeAll(r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        /* JADX INFO: renamed from: $default$removeAll, reason: collision with other method in class */
        public static /* bridge */ /* synthetic */ java.util.Set m305$default$removeAll(com.google.common.collect.SortedSetMultimap r0, @javax.annotation.CheckForNull java.lang.Object r1) {
                java.util.SortedSet r0 = r0.removeAll(r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public static /* bridge */ /* synthetic */ java.util.Collection $default$replaceValues(com.google.common.collect.SortedSetMultimap r0, @com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
                java.util.SortedSet r0 = r0.replaceValues(r1, r2)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        /* JADX INFO: renamed from: $default$replaceValues, reason: collision with other method in class */
        public static /* bridge */ /* synthetic */ java.util.Set m306$default$replaceValues(com.google.common.collect.SortedSetMultimap r0, @com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
                java.util.SortedSet r0 = r0.replaceValues(r1, r2)
                return r0
        }
    }

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Map<K, java.util.Collection<V>> asMap();

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ java.util.Set get(@com.google.common.collect.ParametricNullness java.lang.Object r1);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.SortedSet<V> get(@com.google.common.collect.ParametricNullness K r1);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* bridge */ /* synthetic */ java.util.Set removeAll(@javax.annotation.CheckForNull java.lang.Object r1);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.util.SortedSet<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r1);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* bridge */ /* synthetic */ java.util.Set replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.util.SortedSet<V> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2);

    @javax.annotation.CheckForNull
    java.util.Comparator<? super V> valueComparator();
}
