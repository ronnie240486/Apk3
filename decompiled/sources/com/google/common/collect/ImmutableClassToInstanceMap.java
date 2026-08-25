package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"B"})
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class ImmutableClassToInstanceMap<B> extends com.google.common.collect.ForwardingMap<java.lang.Class<? extends B>, B> implements com.google.common.collect.ClassToInstanceMap<B>, java.io.Serializable {
    private static final com.google.common.collect.ImmutableClassToInstanceMap<java.lang.Object> EMPTY = null;
    private final com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>, B> delegate;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableClassToInstanceMap$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder<B> {
        private final com.google.common.collect.ImmutableMap.Builder<java.lang.Class<? extends B>, B> mapBuilder;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
                r1.mapBuilder = r0
                return
        }

        private static <B, T extends B> T cast(java.lang.Class<T> r0, B r1) {
                java.lang.Class r0 = com.google.common.primitives.Primitives.wrap(r0)
                java.lang.Object r0 = r0.cast(r1)
                return r0
        }

        public com.google.common.collect.ImmutableClassToInstanceMap<B> build() {
                r3 = this;
                com.google.common.collect.ImmutableMap$Builder<java.lang.Class<? extends B>, B> r0 = r3.mapBuilder
                com.google.common.collect.ImmutableMap r0 = r0.build()
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L11
                com.google.common.collect.ImmutableClassToInstanceMap r0 = com.google.common.collect.ImmutableClassToInstanceMap.of()
                return r0
            L11:
                com.google.common.collect.ImmutableClassToInstanceMap r1 = new com.google.common.collect.ImmutableClassToInstanceMap
                r2 = 0
                r1.<init>(r0, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public <T extends B> com.google.common.collect.ImmutableClassToInstanceMap.Builder<B> put(java.lang.Class<T> r2, T r3) {
                r1 = this;
                com.google.common.collect.ImmutableMap$Builder<java.lang.Class<? extends B>, B> r0 = r1.mapBuilder
                r0.put(r2, r3)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public <T extends B> com.google.common.collect.ImmutableClassToInstanceMap.Builder<B> putAll(java.util.Map<? extends java.lang.Class<? extends T>, ? extends T> r4) {
                r3 = this;
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L8:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L28
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.Class r1 = (java.lang.Class) r1
                java.lang.Object r0 = r0.getValue()
                com.google.common.collect.ImmutableMap$Builder<java.lang.Class<? extends B>, B> r2 = r3.mapBuilder
                java.lang.Object r0 = cast(r1, r0)
                r2.put(r1, r0)
                goto L8
            L28:
                return r3
        }
    }

    static {
            com.google.common.collect.ImmutableClassToInstanceMap r0 = new com.google.common.collect.ImmutableClassToInstanceMap
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.of()
            r0.<init>(r1)
            com.google.common.collect.ImmutableClassToInstanceMap.EMPTY = r0
            return
    }

    private ImmutableClassToInstanceMap(com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>, B> r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    public /* synthetic */ ImmutableClassToInstanceMap(com.google.common.collect.ImmutableMap r1, com.google.common.collect.ImmutableClassToInstanceMap.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static <B> com.google.common.collect.ImmutableClassToInstanceMap.Builder<B> builder() {
            com.google.common.collect.ImmutableClassToInstanceMap$Builder r0 = new com.google.common.collect.ImmutableClassToInstanceMap$Builder
            r0.<init>()
            return r0
    }

    public static <B, S extends B> com.google.common.collect.ImmutableClassToInstanceMap<B> copyOf(java.util.Map<? extends java.lang.Class<? extends S>, ? extends S> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.ImmutableClassToInstanceMap
            if (r0 == 0) goto L7
            com.google.common.collect.ImmutableClassToInstanceMap r1 = (com.google.common.collect.ImmutableClassToInstanceMap) r1
            return r1
        L7:
            com.google.common.collect.ImmutableClassToInstanceMap$Builder r0 = new com.google.common.collect.ImmutableClassToInstanceMap$Builder
            r0.<init>()
            com.google.common.collect.ImmutableClassToInstanceMap$Builder r1 = r0.putAll(r1)
            com.google.common.collect.ImmutableClassToInstanceMap r1 = r1.build()
            return r1
    }

    public static <B> com.google.common.collect.ImmutableClassToInstanceMap<B> of() {
            com.google.common.collect.ImmutableClassToInstanceMap<java.lang.Object> r0 = com.google.common.collect.ImmutableClassToInstanceMap.EMPTY
            return r0
    }

    public static <B, T extends B> com.google.common.collect.ImmutableClassToInstanceMap<B> of(java.lang.Class<T> r0, T r1) {
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of(r0, r1)
            com.google.common.collect.ImmutableClassToInstanceMap r1 = new com.google.common.collect.ImmutableClassToInstanceMap
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final java.lang.Object delegate() {
            r1 = this;
            com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>, B> r0 = r1.delegate
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final java.util.Map<java.lang.Class<? extends B>, B> delegate() {
            r1 = this;
            com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>, B> r0 = r1.delegate
            return r0
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    @javax.annotation.CheckForNull
    public <T extends B> T getInstance(java.lang.Class<T> r2) {
            r1 = this;
            com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>, B> r0 = r1.delegate
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public <T extends B> T putInstance(java.lang.Class<T> r1, T r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
