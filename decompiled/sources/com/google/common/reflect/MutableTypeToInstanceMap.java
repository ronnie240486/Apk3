package com.google.common.reflect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
public final class MutableTypeToInstanceMap<B> extends com.google.common.collect.ForwardingMap<com.google.common.reflect.TypeToken<? extends B>, B> implements com.google.common.reflect.TypeToInstanceMap<B> {
    private final java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> backingMap;

    /* JADX INFO: renamed from: com.google.common.reflect.MutableTypeToInstanceMap$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class UnmodifiableEntry<K, V> extends com.google.common.collect.ForwardingMapEntry<K, V> {
        private final java.util.Map.Entry<K, V> delegate;



        private UnmodifiableEntry(java.util.Map.Entry<K, V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                r0.delegate = r1
                return
        }

        public /* synthetic */ UnmodifiableEntry(java.util.Map.Entry r1, com.google.common.reflect.MutableTypeToInstanceMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ java.util.Iterator access$000(java.util.Iterator r0) {
                java.util.Iterator r0 = transformEntries(r0)
                return r0
        }

        private static <K, V> java.util.Iterator<java.util.Map.Entry<K, V>> transformEntries(java.util.Iterator<java.util.Map.Entry<K, V>> r1) {
                com.google.common.reflect.MutableTypeToInstanceMap$UnmodifiableEntry$2 r0 = new com.google.common.reflect.MutableTypeToInstanceMap$UnmodifiableEntry$2
                r0.<init>()
                java.util.Iterator r1 = com.google.common.collect.Iterators.transform(r1, r0)
                return r1
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public final java.lang.Object delegate() {
                r1 = this;
                java.util.Map$Entry<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public final java.util.Map.Entry<K, V> delegate() {
                r1 = this;
                java.util.Map$Entry<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    public MutableTypeToInstanceMap() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = com.google.common.collect.Maps.newHashMap()
            r1.backingMap = r0
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private <T extends B> T trustedGet(com.google.common.reflect.TypeToken<T> r2) {
            r1 = this;
            java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> r0 = r1.backingMap
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private <T extends B> T trustedPut(com.google.common.reflect.TypeToken<T> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r3) {
            r1 = this;
            java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> r0 = r1.backingMap
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final java.lang.Object delegate() {
            r1 = this;
            java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> r0 = r1.backingMap
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> delegate() {
            r1 = this;
            java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> r0 = r1.backingMap
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<com.google.common.reflect.TypeToken<? extends B>, B>> entrySet() {
            r2 = this;
            java.util.Set r0 = super.entrySet()
            com.google.common.reflect.MutableTypeToInstanceMap$UnmodifiableEntry$1 r1 = new com.google.common.reflect.MutableTypeToInstanceMap$UnmodifiableEntry$1
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public <T extends B> T getInstance(com.google.common.reflect.TypeToken<T> r1) {
            r0 = this;
            r1.rejectTypeVariables()
            java.lang.Object r1 = r0.trustedGet(r1)
            return r1
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public <T extends B> T getInstance(java.lang.Class<T> r1) {
            r0 = this;
            com.google.common.reflect.TypeToken r1 = com.google.common.reflect.TypeToken.of(r1)
            java.lang.Object r1 = r0.trustedGet(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public B put(com.google.common.reflect.TypeToken<? extends B> r1, B r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please use putInstance() instead."
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            com.google.common.reflect.TypeToken r1 = (com.google.common.reflect.TypeToken) r1
            java.lang.Object r1 = r0.put(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public void putAll(java.util.Map<? extends com.google.common.reflect.TypeToken<? extends B>, ? extends B> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Please use putInstance() instead."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public <T extends B> T putInstance(com.google.common.reflect.TypeToken<T> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2) {
            r0 = this;
            r1.rejectTypeVariables()
            java.lang.Object r1 = r0.trustedPut(r1, r2)
            return r1
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public <T extends B> T putInstance(java.lang.Class<T> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2) {
            r0 = this;
            com.google.common.reflect.TypeToken r1 = com.google.common.reflect.TypeToken.of(r1)
            java.lang.Object r1 = r0.trustedPut(r1, r2)
            return r1
    }
}
