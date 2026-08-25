package com.google.common.collect;

import java.lang.Enum;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ImmutableEnumMap<K extends java.lang.Enum<K>, V> extends com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K, V> {
    private final transient java.util.EnumMap<K, V> delegate;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableEnumMap$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class EnumSerializedForm<K extends java.lang.Enum<K>, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
    }

    private ImmutableEnumMap(java.util.EnumMap<K, V> r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            com.google.common.base.Preconditions.checkArgument(r1)
            return
    }

    public static <K extends java.lang.Enum<K>, V> com.google.common.collect.ImmutableMap<K, V> asImmutable(java.util.EnumMap<K, V> r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L28
            r1 = 1
            if (r0 == r1) goto Lf
            com.google.common.collect.ImmutableEnumMap r0 = new com.google.common.collect.ImmutableEnumMap
            r0.<init>(r2)
            return r0
        Lf:
            java.util.Set r2 = r2.entrySet()
            java.lang.Object r2 = com.google.common.collect.Iterables.getOnlyElement(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.Enum r0 = (java.lang.Enum) r0
            java.lang.Object r2 = r2.getValue()
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.of(r0, r2)
            return r2
        L28:
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.of()
            return r2
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r0 = r1.delegate
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
    public final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator() {
            r2 = this;
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r0 = r2.delegate
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.Maps$8 r1 = new com.google.common.collect.Maps$8
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableEnumMap
            if (r0 == 0) goto Lc
            com.google.common.collect.ImmutableEnumMap r2 = (com.google.common.collect.ImmutableEnumMap) r2
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r2 = r2.delegate
        Lc:
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r0 = r1.delegate
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r0 = r1.delegate
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    public final com.google.common.collect.UnmodifiableIterator<K> keyIterator() {
            r1 = this;
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r0 = r1.delegate
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.unmodifiableIterator(r0)
            return r0
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.EnumMap<K extends java.lang.Enum<K>, V> r0 = r1.delegate
            int r0 = r0.size()
            return r0
    }
}
