package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface SetMultimap<K, V> extends com.google.common.collect.Multimap<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.SetMultimap$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public final /* synthetic */ class CC<K, V> {
        public static /* bridge */ /* synthetic */ java.util.Collection $default$entries(com.google.common.collect.SetMultimap r0) {
                java.util.Set r0 = r0.entries()
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.Collection $default$get(com.google.common.collect.SetMultimap r0, @com.google.common.collect.ParametricNullness java.lang.Object r1) {
                java.util.Set r0 = r0.get(r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public static /* bridge */ /* synthetic */ java.util.Collection $default$removeAll(com.google.common.collect.SetMultimap r0, @javax.annotation.CheckForNull java.lang.Object r1) {
                java.util.Set r0 = r0.removeAll(r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public static /* bridge */ /* synthetic */ java.util.Collection $default$replaceValues(com.google.common.collect.SetMultimap r0, @com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
                java.util.Set r0 = r0.replaceValues(r1, r2)
                return r0
        }
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Map<K, java.util.Collection<V>> asMap();

    @Override // com.google.common.collect.Multimap
    /* bridge */ /* synthetic */ java.util.Collection entries();

    @Override // com.google.common.collect.Multimap
    java.util.Set<java.util.Map.Entry<K, V>> entries();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Set<V> get(@com.google.common.collect.ParametricNullness K r1);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.util.Set<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r1);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.util.Set<V> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2);
}
