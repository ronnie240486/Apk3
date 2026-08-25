package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableBiMap<K, V> extends com.google.common.collect.ImmutableMap<K, V> implements com.google.common.collect.BiMap<K, V> {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Builder<K, V> extends com.google.common.collect.ImmutableMap.Builder<K, V> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public Builder(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableBiMap<K, V> build() {
                r1 = this;
                com.google.common.collect.ImmutableBiMap r0 = r1.buildOrThrow()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap build() {
                r1 = this;
                com.google.common.collect.ImmutableBiMap r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public com.google.common.collect.ImmutableBiMap<K, V> buildOrThrow() {
                r3 = this;
                int r0 = r3.size
                if (r0 != 0) goto L9
                com.google.common.collect.ImmutableBiMap r0 = com.google.common.collect.ImmutableBiMap.of()
                return r0
            L9:
                r3.sortEntries()
                r0 = 1
                r3.entriesUsed = r0
                com.google.common.collect.RegularImmutableBiMap r0 = new com.google.common.collect.RegularImmutableBiMap
                java.lang.Object[] r1 = r3.alternatingKeysAndValues
                int r2 = r3.size
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap buildOrThrow() {
                r1 = this;
                com.google.common.collect.ImmutableBiMap r0 = r1.buildOrThrow()
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public com.google.common.collect.ImmutableBiMap.Builder<K, V> orderEntriesByValue(java.util.Comparator<? super V> r1) {
                r0 = this;
                super.orderEntriesByValue(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder orderEntriesByValue(java.util.Comparator r1) {
                r0 = this;
                com.google.common.collect.ImmutableBiMap$Builder r1 = r0.orderEntriesByValue(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableBiMap.Builder<K, V> put(K r1, V r2) {
                r0 = this;
                super.put(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableBiMap.Builder<K, V> put(java.util.Map.Entry<? extends K, ? extends V> r1) {
                r0 = this;
                super.put(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                com.google.common.collect.ImmutableBiMap$Builder r1 = r0.put(r1, r2)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder put(java.util.Map.Entry r1) {
                r0 = this;
                com.google.common.collect.ImmutableBiMap$Builder r1 = r0.put(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public com.google.common.collect.ImmutableBiMap.Builder<K, V> putAll(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableBiMap.Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.common.annotations.Beta
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder putAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableBiMap$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.Builder putAll(java.util.Map r1) {
                r0 = this;
                com.google.common.collect.ImmutableBiMap$Builder r1 = r0.putAll(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SerializedForm<K, V> extends com.google.common.collect.ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;
    }

    public ImmutableBiMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap.Builder<K, V> builder() {
            com.google.common.collect.ImmutableBiMap$Builder r0 = new com.google.common.collect.ImmutableBiMap$Builder
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableBiMap.Builder<K, V> builderWithExpectedSize(int r1) {
            java.lang.String r0 = "expectedSize"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r1, r0)
            com.google.common.collect.ImmutableBiMap$Builder r0 = new com.google.common.collect.ImmutableBiMap$Builder
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r2) {
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto Lc
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            goto Ld
        Lc:
            r0 = 4
        Ld:
            com.google.common.collect.ImmutableBiMap$Builder r1 = new com.google.common.collect.ImmutableBiMap$Builder
            r1.<init>(r0)
            com.google.common.collect.ImmutableBiMap$Builder r2 = r1.putAll(r2)
            com.google.common.collect.ImmutableBiMap r2 = r2.build()
            return r2
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> r2) {
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableBiMap
            if (r0 == 0) goto Le
            r0 = r2
            com.google.common.collect.ImmutableBiMap r0 = (com.google.common.collect.ImmutableBiMap) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto Le
            return r0
        Le:
            java.util.Set r2 = r2.entrySet()
            com.google.common.collect.ImmutableBiMap r2 = copyOf(r2)
            return r2
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of() {
            com.google.common.collect.RegularImmutableBiMap<java.lang.Object, java.lang.Object> r0 = com.google.common.collect.RegularImmutableBiMap.EMPTY
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K r3, V r4) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r4)
            com.google.common.collect.RegularImmutableBiMap r0 = new com.google.common.collect.RegularImmutableBiMap
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r0.<init>(r1, r3)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K r3, V r4, K r5, V r6) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r4)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r5, r6)
            com.google.common.collect.RegularImmutableBiMap r0 = new com.google.common.collect.RegularImmutableBiMap
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r4 = 3
            r1[r4] = r6
            r0.<init>(r1, r3)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K r3, V r4, K r5, V r6, K r7, V r8) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r4)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r5, r6)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r7, r8)
            com.google.common.collect.RegularImmutableBiMap r0 = new com.google.common.collect.RegularImmutableBiMap
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r4 = 4
            r1[r4] = r7
            r4 = 5
            r1[r4] = r8
            r0.<init>(r1, r3)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K r3, V r4, K r5, V r6, K r7, V r8, K r9, V r10) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r4)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r5, r6)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r7, r8)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r9, r10)
            com.google.common.collect.RegularImmutableBiMap r0 = new com.google.common.collect.RegularImmutableBiMap
            r1 = 8
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r4 = 5
            r1[r4] = r8
            r4 = 6
            r1[r4] = r9
            r4 = 7
            r1[r4] = r10
            r0.<init>(r1, r3)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K r3, V r4, K r5, V r6, K r7, V r8, K r9, V r10, K r11, V r12) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r4)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r5, r6)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r7, r8)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r9, r10)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r11, r12)
            com.google.common.collect.RegularImmutableBiMap r0 = new com.google.common.collect.RegularImmutableBiMap
            r1 = 10
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            r4 = 6
            r1[r4] = r9
            r4 = 7
            r1[r4] = r10
            r4 = 8
            r1[r4] = r11
            r4 = 9
            r1[r4] = r12
            r0.<init>(r1, r3)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K r3, V r4, K r5, V r6, K r7, V r8, K r9, V r10, K r11, V r12, K r13, V r14) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r3, r4)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r5, r6)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r7, r8)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r9, r10)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r11, r12)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r13, r14)
            com.google.common.collect.RegularImmutableBiMap r0 = new com.google.common.collect.RegularImmutableBiMap
            r1 = 12
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            r3 = 6
            r1[r3] = r9
            r4 = 7
            r1[r4] = r10
            r4 = 8
            r1[r4] = r11
            r4 = 9
            r1[r4] = r12
            r4 = 10
            r1[r4] = r13
            r4 = 11
            r1[r4] = r14
            r0.<init>(r1, r3)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K r4, V r5, K r6, V r7, K r8, V r9, K r10, V r11, K r12, V r13, K r14, V r15, K r16, V r17) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r7)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r8, r9)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r10, r11)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r12, r13)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r14, r15)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r16, r17)
            com.google.common.collect.RegularImmutableBiMap r0 = new com.google.common.collect.RegularImmutableBiMap
            r1 = 14
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            r2 = 2
            r1[r2] = r6
            r2 = 3
            r1[r2] = r7
            r2 = 4
            r1[r2] = r8
            r2 = 5
            r1[r2] = r9
            r2 = 6
            r1[r2] = r10
            r2 = 7
            r1[r2] = r11
            r3 = 8
            r1[r3] = r12
            r3 = 9
            r1[r3] = r13
            r3 = 10
            r1[r3] = r14
            r3 = 11
            r1[r3] = r15
            r3 = 12
            r1[r3] = r16
            r3 = 13
            r1[r3] = r17
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K r4, V r5, K r6, V r7, K r8, V r9, K r10, V r11, K r12, V r13, K r14, V r15, K r16, V r17, K r18, V r19) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r7)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r8, r9)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r10, r11)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r12, r13)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r14, r15)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r16, r17)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r18, r19)
            com.google.common.collect.RegularImmutableBiMap r0 = new com.google.common.collect.RegularImmutableBiMap
            r1 = 16
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            r2 = 2
            r1[r2] = r6
            r2 = 3
            r1[r2] = r7
            r2 = 4
            r1[r2] = r8
            r2 = 5
            r1[r2] = r9
            r2 = 6
            r1[r2] = r10
            r2 = 7
            r1[r2] = r11
            r2 = 8
            r1[r2] = r12
            r3 = 9
            r1[r3] = r13
            r3 = 10
            r1[r3] = r14
            r3 = 11
            r1[r3] = r15
            r3 = 12
            r1[r3] = r16
            r3 = 13
            r1[r3] = r17
            r3 = 14
            r1[r3] = r18
            r3 = 15
            r1[r3] = r19
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K r4, V r5, K r6, V r7, K r8, V r9, K r10, V r11, K r12, V r13, K r14, V r15, K r16, V r17, K r18, V r19, K r20, V r21) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r7)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r8, r9)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r10, r11)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r12, r13)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r14, r15)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r16, r17)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r18, r19)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r20, r21)
            com.google.common.collect.RegularImmutableBiMap r0 = new com.google.common.collect.RegularImmutableBiMap
            r1 = 18
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            r2 = 2
            r1[r2] = r6
            r2 = 3
            r1[r2] = r7
            r2 = 4
            r1[r2] = r8
            r2 = 5
            r1[r2] = r9
            r2 = 6
            r1[r2] = r10
            r2 = 7
            r1[r2] = r11
            r2 = 8
            r1[r2] = r12
            r2 = 9
            r1[r2] = r13
            r3 = 10
            r1[r3] = r14
            r3 = 11
            r1[r3] = r15
            r3 = 12
            r1[r3] = r16
            r3 = 13
            r1[r3] = r17
            r3 = 14
            r1[r3] = r18
            r3 = 15
            r1[r3] = r19
            r3 = 16
            r1[r3] = r20
            r3 = 17
            r1[r3] = r21
            r0.<init>(r1, r2)
            return r0
    }

    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> of(K r4, V r5, K r6, V r7, K r8, V r9, K r10, V r11, K r12, V r13, K r14, V r15, K r16, V r17, K r18, V r19, K r20, V r21, K r22, V r23) {
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r4, r5)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r7)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r8, r9)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r10, r11)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r12, r13)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r14, r15)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r16, r17)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r18, r19)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r20, r21)
            com.google.common.collect.CollectPreconditions.checkEntryNotNull(r22, r23)
            com.google.common.collect.RegularImmutableBiMap r0 = new com.google.common.collect.RegularImmutableBiMap
            r1 = 20
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            r2 = 2
            r1[r2] = r6
            r2 = 3
            r1[r2] = r7
            r2 = 4
            r1[r2] = r8
            r2 = 5
            r1[r2] = r9
            r2 = 6
            r1[r2] = r10
            r2 = 7
            r1[r2] = r11
            r2 = 8
            r1[r2] = r12
            r2 = 9
            r1[r2] = r13
            r2 = 10
            r1[r2] = r14
            r3 = 11
            r1[r3] = r15
            r3 = 12
            r1[r3] = r16
            r3 = 13
            r1[r3] = r17
            r3 = 14
            r1[r3] = r18
            r3 = 15
            r1[r3] = r19
            r3 = 16
            r1[r3] = r20
            r3 = 17
            r1[r3] = r21
            r3 = 18
            r1[r3] = r22
            r3 = 19
            r1[r3] = r23
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.SafeVarargs
    public static <K, V> com.google.common.collect.ImmutableBiMap<K, V> ofEntries(java.util.Map.Entry<? extends K, ? extends V>... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.common.collect.ImmutableBiMap r0 = copyOf(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap
    public final com.google.common.collect.ImmutableCollection createValues() {
            r2 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "should never be called"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final V forcePut(K r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ com.google.common.collect.BiMap inverse() {
            r1 = this;
            com.google.common.collect.ImmutableBiMap r0 = r1.inverse()
            return r0
    }

    @Override // com.google.common.collect.BiMap
    public abstract com.google.common.collect.ImmutableBiMap<V, K> inverse();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection values() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.values()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public com.google.common.collect.ImmutableSet<V> values() {
            r1 = this;
            com.google.common.collect.ImmutableBiMap r0 = r1.inverse()
            com.google.common.collect.ImmutableSet r0 = r0.keySet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.values()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ java.util.Set values() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.values()
            return r0
    }
}
