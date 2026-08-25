package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public interface ListMultimap<K, V> extends com.google.common.collect.Multimap<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.ListMultimap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<K, V> {
        public static /* bridge */ /* synthetic */ java.util.Collection $default$get(com.google.common.collect.ListMultimap r0, @com.google.common.collect.ParametricNullness java.lang.Object r1) {
                java.util.List r0 = r0.get(r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public static /* bridge */ /* synthetic */ java.util.Collection $default$removeAll(com.google.common.collect.ListMultimap r0, @javax.annotation.CheckForNull java.lang.Object r1) {
                java.util.List r0 = r0.removeAll(r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public static /* bridge */ /* synthetic */ java.util.Collection $default$replaceValues(com.google.common.collect.ListMultimap r0, @com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2) {
                java.util.List r0 = r0.replaceValues(r1, r2)
                return r0
        }
    }

    java.util.Map<K, java.util.Collection<V>> asMap();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object r1);

    /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object r1);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.List<V> get(@com.google.common.collect.ParametricNullness K r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.util.List<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object r1, java.lang.Iterable r2);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    java.util.List<V> replaceValues(@com.google.common.collect.ParametricNullness K r1, java.lang.Iterable<? extends V> r2);
}
