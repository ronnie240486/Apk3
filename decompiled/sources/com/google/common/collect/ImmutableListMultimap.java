package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public class ImmutableListMultimap<K, V> extends com.google.common.collect.ImmutableMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;

    @com.google.j2objc.annotations.RetainedWith
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableListMultimap<V, K> inverse;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Builder<K, V> extends com.google.common.collect.ImmutableMultimap.Builder<K, V> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public com.google.common.collect.ImmutableListMultimap<K, V> build() {
                r1 = this;
                com.google.common.collect.ImmutableMultimap r0 = super.build()
                com.google.common.collect.ImmutableListMultimap r0 = (com.google.common.collect.ImmutableListMultimap) r0
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap build() {
                r1 = this;
                com.google.common.collect.ImmutableListMultimap r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> orderKeysBy(java.util.Comparator<? super K> r1) {
                r0 = this;
                super.orderKeysBy(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder orderKeysBy(java.util.Comparator r1) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.orderKeysBy(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> orderValuesBy(java.util.Comparator<? super V> r1) {
                r0 = this;
                super.orderValuesBy(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder orderValuesBy(java.util.Comparator r1) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.orderValuesBy(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> put(K r1, V r2) {
                r0 = this;
                super.put(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> r1) {
                r0 = this;
                super.put(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.put(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder put(java.util.Map.Entry r1) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.put(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(K r1, java.lang.Iterable<? extends V> r2) {
                r0 = this;
                super.putAll(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableListMultimap.Builder<K, V> putAll(K r1, V... r2) {
                r0 = this;
                super.putAll(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(com.google.common.collect.Multimap r1) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object r1, java.lang.Iterable r2) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.putAll(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap.Builder putAll(java.lang.Object r1, java.lang.Object[] r2) {
                r0 = this;
                com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.putAll(r1, r2)
                return r1
        }
    }

    public ImmutableListMultimap(com.google.common.collect.ImmutableMap<K, com.google.common.collect.ImmutableList<V>> r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap.Builder<K, V> builder() {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = new com.google.common.collect.ImmutableListMultimap$Builder
            r0.<init>()
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(com.google.common.collect.Multimap<? extends K, ? extends V> r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableListMultimap r2 = of()
            return r2
        Lb:
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableListMultimap
            if (r0 == 0) goto L19
            r0 = r2
            com.google.common.collect.ImmutableListMultimap r0 = (com.google.common.collect.ImmutableListMultimap) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto L19
            return r0
        L19:
            java.util.Map r2 = r2.asMap()
            java.util.Set r2 = r2.entrySet()
            r0 = 0
            com.google.common.collect.ImmutableListMultimap r2 = fromMapEntries(r2, r0)
            return r2
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = new com.google.common.collect.ImmutableListMultimap$Builder
            r0.<init>()
            com.google.common.collect.ImmutableListMultimap$Builder r1 = r0.putAll(r1)
            com.google.common.collect.ImmutableListMultimap r1 = r1.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> fromMapEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends java.util.Collection<? extends V>>> r5, java.util.Comparator<? super V> r6) {
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableListMultimap r5 = of()
            return r5
        Lb:
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder
            int r1 = r5.size()
            r0.<init>(r1)
            r1 = 0
            java.util.Iterator r5 = r5.iterator()
        L19:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            if (r6 != 0) goto L36
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r2)
            goto L3a
        L36:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.sortedCopyOf(r6, r2)
        L3a:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L19
            r0.put(r3, r2)
            int r2 = r2.size()
            int r2 = r2 + r1
            r1 = r2
            goto L19
        L4a:
            com.google.common.collect.ImmutableListMultimap r5 = new com.google.common.collect.ImmutableListMultimap
            com.google.common.collect.ImmutableMap r6 = r0.build()
            r5.<init>(r6, r1)
            return r5
    }

    private com.google.common.collect.ImmutableListMultimap<V, K> invert() {
            r4 = this;
            com.google.common.collect.ImmutableListMultimap$Builder r0 = builder()
            com.google.common.collect.ImmutableCollection r1 = r4.entries()
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Object r2 = r2.getKey()
            r0.put(r3, r2)
            goto Lc
        L24:
            com.google.common.collect.ImmutableListMultimap r0 = r0.build()
            r0.inverse = r4
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of() {
            com.google.common.collect.EmptyImmutableListMultimap r0 = com.google.common.collect.EmptyImmutableListMultimap.INSTANCE
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K r1, V r2) {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            com.google.common.collect.ImmutableListMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K r1, V r2, K r3, V r4) {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            com.google.common.collect.ImmutableListMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K r1, V r2, K r3, V r4, K r5, V r6) {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            r0.put(r5, r6)
            com.google.common.collect.ImmutableListMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K r1, V r2, K r3, V r4, K r5, V r6, K r7, V r8) {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            r0.put(r5, r6)
            r0.put(r7, r8)
            com.google.common.collect.ImmutableListMultimap r1 = r0.build()
            return r1
    }

    public static <K, V> com.google.common.collect.ImmutableListMultimap<K, V> of(K r1, V r2, K r3, V r4, K r5, V r6, K r7, V r8, K r9, V r10) {
            com.google.common.collect.ImmutableListMultimap$Builder r0 = builder()
            r0.put(r1, r2)
            r0.put(r3, r4)
            r0.put(r5, r6)
            r0.put(r7, r8)
            r0.put(r9, r10)
            com.google.common.collect.ImmutableListMultimap r1 = r0.build()
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r10) throws java.io.IOException, java.lang.ClassNotFoundException {
            r9 = this;
            r10.defaultReadObject()
            int r0 = r10.readInt()
            if (r0 < 0) goto L65
            com.google.common.collect.ImmutableMap$Builder r1 = com.google.common.collect.ImmutableMap.builder()
            r2 = 0
            r3 = 0
        Lf:
            if (r2 >= r0) goto L45
            java.lang.Object r4 = r10.readObject()
            int r5 = r10.readInt()
            if (r5 <= 0) goto L37
            com.google.common.collect.ImmutableList$Builder r6 = com.google.common.collect.ImmutableList.builder()
            r7 = 0
        L20:
            if (r7 >= r5) goto L2c
            java.lang.Object r8 = r10.readObject()
            r6.add(r8)
            int r7 = r7 + 1
            goto L20
        L2c:
            com.google.common.collect.ImmutableList r6 = r6.build()
            r1.put(r4, r6)
            int r3 = r3 + r5
            int r2 = r2 + 1
            goto Lf
        L37:
            java.io.InvalidObjectException r10 = new java.io.InvalidObjectException
            r0 = 31
            java.lang.String r1 = "Invalid value count "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r5)
            r10.<init>(r0)
            throw r10
        L45:
            com.google.common.collect.ImmutableMap r10 = r1.build()     // Catch: java.lang.IllegalArgumentException -> L54
            com.google.common.collect.Serialization$FieldSetter<com.google.common.collect.ImmutableMultimap> r0 = com.google.common.collect.ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER
            r0.set(r9, r10)
            com.google.common.collect.Serialization$FieldSetter<com.google.common.collect.ImmutableMultimap> r10 = com.google.common.collect.ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER
            r10.set(r9, r3)
            return
        L54:
            r10 = move-exception
            java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
            java.lang.String r1 = r10.getMessage()
            r0.<init>(r1)
            java.lang.Throwable r10 = r0.initCause(r10)
            java.io.InvalidObjectException r10 = (java.io.InvalidObjectException) r10
            throw r10
        L65:
            java.io.InvalidObjectException r10 = new java.io.InvalidObjectException
            r1 = 29
            java.lang.String r2 = "Invalid key count "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0)
            r10.<init>(r0)
            throw r10
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r1) throws java.io.IOException {
            r0 = this;
            r1.defaultWriteObject()
            com.google.common.collect.Serialization.writeMultimap(r0, r1)
            return
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection get(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public com.google.common.collect.ImmutableList<V> get(K r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<K, ? extends com.google.common.collect.ImmutableCollection<V>> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            com.google.common.collect.ImmutableList r2 = (com.google.common.collect.ImmutableList) r2
            if (r2 != 0) goto Le
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
        Le:
            return r2
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.List get(java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public com.google.common.collect.ImmutableListMultimap<V, K> inverse() {
            r1 = this;
            com.google.common.collect.ImmutableListMultimap<V, K> r0 = r1.inverse
            if (r0 != 0) goto La
            com.google.common.collect.ImmutableListMultimap r0 = r1.invert()
            r1.inverse = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultimap inverse() {
            r1 = this;
            com.google.common.collect.ImmutableListMultimap r0 = r1.inverse()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableList<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.List removeAll(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableList<V> replaceValues(K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.util.List replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.replaceValues(r1, r2)
            return r1
    }
}
