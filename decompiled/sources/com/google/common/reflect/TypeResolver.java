package com.google.common.reflect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.Beta
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public final class TypeResolver {
    private final com.google.common.reflect.TypeResolver.TypeTable typeTable;


    /* JADX INFO: loaded from: classes2.dex */
    public static final class TypeMappingIntrospector extends com.google.common.reflect.TypeVisitor {
        private final java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> mappings;

        private TypeMappingIntrospector() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = com.google.common.collect.Maps.newHashMap()
                r1.mappings = r0
                return
        }

        public static com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> getTypeMappings(java.lang.reflect.Type r3) {
                com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.reflect.TypeResolver$TypeMappingIntrospector r0 = new com.google.common.reflect.TypeResolver$TypeMappingIntrospector
                r0.<init>()
                r1 = 1
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                r2 = 0
                r1[r2] = r3
                r0.visit(r1)
                java.util.Map<com.google.common.reflect.TypeResolver$TypeVariableKey, java.lang.reflect.Type> r3 = r0.mappings
                com.google.common.collect.ImmutableMap r3 = com.google.common.collect.ImmutableMap.copyOf(r3)
                return r3
        }

        private void map(com.google.common.reflect.TypeResolver.TypeVariableKey r5, java.lang.reflect.Type r6) {
                r4 = this;
                java.util.Map<com.google.common.reflect.TypeResolver$TypeVariableKey, java.lang.reflect.Type> r0 = r4.mappings
                boolean r0 = r0.containsKey(r5)
                if (r0 == 0) goto L9
                return
            L9:
                r0 = r6
            La:
                if (r0 == 0) goto L41
                boolean r1 = r5.equalsType(r0)
                r2 = 0
                if (r1 == 0) goto L2d
            L13:
                if (r6 == 0) goto L2c
                java.util.Map<com.google.common.reflect.TypeResolver$TypeVariableKey, java.lang.reflect.Type> r5 = r4.mappings
                boolean r0 = r6 instanceof java.lang.reflect.TypeVariable
                if (r0 == 0) goto L23
                com.google.common.reflect.TypeResolver$TypeVariableKey r0 = new com.google.common.reflect.TypeResolver$TypeVariableKey
                java.lang.reflect.TypeVariable r6 = (java.lang.reflect.TypeVariable) r6
                r0.<init>(r6)
                goto L24
            L23:
                r0 = r2
            L24:
                java.lang.Object r5 = r5.remove(r0)
                r6 = r5
                java.lang.reflect.Type r6 = (java.lang.reflect.Type) r6
                goto L13
            L2c:
                return
            L2d:
                java.util.Map<com.google.common.reflect.TypeResolver$TypeVariableKey, java.lang.reflect.Type> r1 = r4.mappings
                boolean r3 = r0 instanceof java.lang.reflect.TypeVariable
                if (r3 == 0) goto L3a
                com.google.common.reflect.TypeResolver$TypeVariableKey r2 = new com.google.common.reflect.TypeResolver$TypeVariableKey
                java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
                r2.<init>(r0)
            L3a:
                java.lang.Object r0 = r1.get(r2)
                java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
                goto La
            L41:
                java.util.Map<com.google.common.reflect.TypeResolver$TypeVariableKey, java.lang.reflect.Type> r0 = r4.mappings
                r0.put(r5, r6)
                return
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void visitClass(java.lang.Class<?> r4) {
                r3 = this;
                r0 = 1
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                java.lang.reflect.Type r1 = r4.getGenericSuperclass()
                r2 = 0
                r0[r2] = r1
                r3.visit(r0)
                java.lang.reflect.Type[] r4 = r4.getGenericInterfaces()
                r3.visit(r4)
                return
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void visitParameterizedType(java.lang.reflect.ParameterizedType r9) {
                r8 = this;
                java.lang.reflect.Type r0 = r9.getRawType()
                java.lang.Class r0 = (java.lang.Class) r0
                java.lang.reflect.TypeVariable[] r1 = r0.getTypeParameters()
                java.lang.reflect.Type[] r2 = r9.getActualTypeArguments()
                int r3 = r1.length
                int r4 = r2.length
                r5 = 0
                r6 = 1
                if (r3 != r4) goto L16
                r3 = 1
                goto L17
            L16:
                r3 = 0
            L17:
                com.google.common.base.Preconditions.checkState(r3)
                r3 = 0
            L1b:
                int r4 = r1.length
                if (r3 >= r4) goto L2d
                com.google.common.reflect.TypeResolver$TypeVariableKey r4 = new com.google.common.reflect.TypeResolver$TypeVariableKey
                r7 = r1[r3]
                r4.<init>(r7)
                r7 = r2[r3]
                r8.map(r4, r7)
                int r3 = r3 + 1
                goto L1b
            L2d:
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r6]
                r1[r5] = r0
                r8.visit(r1)
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r6]
                java.lang.reflect.Type r9 = r9.getOwnerType()
                r0[r5] = r9
                r8.visit(r0)
                return
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void visitTypeVariable(java.lang.reflect.TypeVariable<?> r1) {
                r0 = this;
                java.lang.reflect.Type[] r1 = r1.getBounds()
                r0.visit(r1)
                return
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void visitWildcardType(java.lang.reflect.WildcardType r1) {
                r0 = this;
                java.lang.reflect.Type[] r1 = r1.getUpperBounds()
                r0.visit(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class TypeTable {
        private final com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> map;


        public TypeTable() {
                r1 = this;
                r1.<init>()
                com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
                r1.map = r0
                return
        }

        private TypeTable(com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> r1) {
                r0 = this;
                r0.<init>()
                r0.map = r1
                return
        }

        public java.lang.reflect.Type resolveInternal(java.lang.reflect.TypeVariable<?> r4, com.google.common.reflect.TypeResolver.TypeTable r5) {
                r3 = this;
                com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeResolver$TypeVariableKey, java.lang.reflect.Type> r0 = r3.map
                com.google.common.reflect.TypeResolver$TypeVariableKey r1 = new com.google.common.reflect.TypeResolver$TypeVariableKey
                r1.<init>(r4)
                java.lang.Object r0 = r0.get(r1)
                java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
                r1 = 0
                if (r0 != 0) goto L39
                java.lang.reflect.Type[] r0 = r4.getBounds()
                int r2 = r0.length
                if (r2 != 0) goto L18
                return r4
            L18:
                com.google.common.reflect.TypeResolver r2 = new com.google.common.reflect.TypeResolver
                r2.<init>(r5, r1)
                java.lang.reflect.Type[] r5 = com.google.common.reflect.TypeResolver.access$300(r2, r0)
                boolean r1 = com.google.common.reflect.Types.NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY
                if (r1 == 0) goto L2c
                boolean r0 = java.util.Arrays.equals(r0, r5)
                if (r0 == 0) goto L2c
                return r4
            L2c:
                java.lang.reflect.GenericDeclaration r0 = r4.getGenericDeclaration()
                java.lang.String r4 = r4.getName()
                java.lang.reflect.TypeVariable r4 = com.google.common.reflect.Types.newArtificialTypeVariable(r0, r4, r5)
                return r4
            L39:
                com.google.common.reflect.TypeResolver r4 = new com.google.common.reflect.TypeResolver
                r4.<init>(r5, r1)
                java.lang.reflect.Type r4 = r4.resolveType(r0)
                return r4
        }

        public final com.google.common.reflect.TypeResolver.TypeTable where(java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey, ? extends java.lang.reflect.Type> r6) {
                r5 = this;
                com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
                com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeResolver$TypeVariableKey, java.lang.reflect.Type> r1 = r5.map
                r0.putAll(r1)
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L11:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L38
                java.lang.Object r1 = r6.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                com.google.common.reflect.TypeResolver$TypeVariableKey r2 = (com.google.common.reflect.TypeResolver.TypeVariableKey) r2
                java.lang.Object r1 = r1.getValue()
                java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
                boolean r3 = r2.equalsType(r1)
                r3 = r3 ^ 1
                java.lang.String r4 = "Type variable %s bound to itself"
                com.google.common.base.Preconditions.checkArgument(r3, r4, r2)
                r0.put(r2, r1)
                goto L11
            L38:
                com.google.common.reflect.TypeResolver$TypeTable r6 = new com.google.common.reflect.TypeResolver$TypeTable
                com.google.common.collect.ImmutableMap r0 = r0.build()
                r6.<init>(r0)
                return r6
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class TypeVariableKey {
        private final java.lang.reflect.TypeVariable<?> var;

        public TypeVariableKey(java.lang.reflect.TypeVariable<?> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
                r0.var = r1
                return
        }

        private boolean equalsTypeVariable(java.lang.reflect.TypeVariable<?> r3) {
                r2 = this;
                java.lang.reflect.TypeVariable<?> r0 = r2.var
                java.lang.reflect.GenericDeclaration r0 = r0.getGenericDeclaration()
                java.lang.reflect.GenericDeclaration r1 = r3.getGenericDeclaration()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L22
                java.lang.reflect.TypeVariable<?> r0 = r2.var
                java.lang.String r0 = r0.getName()
                java.lang.String r3 = r3.getName()
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L22
                r3 = 1
                goto L23
            L22:
                r3 = 0
            L23:
                return r3
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.reflect.TypeResolver.TypeVariableKey
                if (r0 == 0) goto Ld
                com.google.common.reflect.TypeResolver$TypeVariableKey r2 = (com.google.common.reflect.TypeResolver.TypeVariableKey) r2
                java.lang.reflect.TypeVariable<?> r2 = r2.var
                boolean r2 = r1.equalsTypeVariable(r2)
                return r2
            Ld:
                r2 = 0
                return r2
        }

        public final boolean equalsType(java.lang.reflect.Type r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.TypeVariable
                if (r0 == 0) goto Lb
                java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
                boolean r2 = r1.equalsTypeVariable(r2)
                return r2
            Lb:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.reflect.TypeVariable<?> r1 = r3.var
                java.lang.reflect.GenericDeclaration r1 = r1.getGenericDeclaration()
                r2 = 0
                r0[r2] = r1
                java.lang.reflect.TypeVariable<?> r1 = r3.var
                java.lang.String r1 = r1.getName()
                r2 = 1
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.reflect.TypeVariable<?> r0 = r1.var
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class WildcardCapturer {
        public static final com.google.common.reflect.TypeResolver.WildcardCapturer INSTANCE = null;
        private final java.util.concurrent.atomic.AtomicInteger id;


        static {
                com.google.common.reflect.TypeResolver$WildcardCapturer r0 = new com.google.common.reflect.TypeResolver$WildcardCapturer
                r0.<init>()
                com.google.common.reflect.TypeResolver.WildcardCapturer.INSTANCE = r0
                return
        }

        private WildcardCapturer() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.<init>(r0)
                return
        }

        private WildcardCapturer(java.util.concurrent.atomic.AtomicInteger r1) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                return
        }

        public /* synthetic */ WildcardCapturer(java.util.concurrent.atomic.AtomicInteger r1, com.google.common.reflect.TypeResolver.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @javax.annotation.CheckForNull
        private java.lang.reflect.Type captureNullable(@javax.annotation.CheckForNull java.lang.reflect.Type r1) {
                r0 = this;
                if (r1 != 0) goto L4
                r1 = 0
                return r1
            L4:
                java.lang.reflect.Type r1 = r0.capture(r1)
                return r1
        }

        private com.google.common.reflect.TypeResolver.WildcardCapturer forTypeVariable(java.lang.reflect.TypeVariable<?> r3) {
                r2 = this;
                com.google.common.reflect.TypeResolver$WildcardCapturer$1 r0 = new com.google.common.reflect.TypeResolver$WildcardCapturer$1
                java.util.concurrent.atomic.AtomicInteger r1 = r2.id
                r0.<init>(r1, r3)
                return r0
        }

        private com.google.common.reflect.TypeResolver.WildcardCapturer notForTypeVariable() {
                r2 = this;
                com.google.common.reflect.TypeResolver$WildcardCapturer r0 = new com.google.common.reflect.TypeResolver$WildcardCapturer
                java.util.concurrent.atomic.AtomicInteger r1 = r2.id
                r0.<init>(r1)
                return r0
        }

        public final java.lang.reflect.Type capture(java.lang.reflect.Type r7) {
                r6 = this;
                com.google.common.base.Preconditions.checkNotNull(r7)
                boolean r0 = r7 instanceof java.lang.Class
                if (r0 == 0) goto L8
                return r7
            L8:
                boolean r0 = r7 instanceof java.lang.reflect.TypeVariable
                if (r0 == 0) goto Ld
                return r7
            Ld:
                boolean r0 = r7 instanceof java.lang.reflect.GenericArrayType
                if (r0 == 0) goto L24
                java.lang.reflect.GenericArrayType r7 = (java.lang.reflect.GenericArrayType) r7
                com.google.common.reflect.TypeResolver$WildcardCapturer r0 = r6.notForTypeVariable()
                java.lang.reflect.Type r7 = r7.getGenericComponentType()
                java.lang.reflect.Type r7 = r0.capture(r7)
                java.lang.reflect.Type r7 = com.google.common.reflect.Types.newArrayType(r7)
                return r7
            L24:
                boolean r0 = r7 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L5e
                java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
                java.lang.reflect.Type r0 = r7.getRawType()
                java.lang.Class r0 = (java.lang.Class) r0
                java.lang.reflect.TypeVariable[] r1 = r0.getTypeParameters()
                java.lang.reflect.Type[] r2 = r7.getActualTypeArguments()
                r3 = 0
            L39:
                int r4 = r2.length
                if (r3 >= r4) goto L4d
                r4 = r1[r3]
                com.google.common.reflect.TypeResolver$WildcardCapturer r4 = r6.forTypeVariable(r4)
                r5 = r2[r3]
                java.lang.reflect.Type r4 = r4.capture(r5)
                r2[r3] = r4
                int r3 = r3 + 1
                goto L39
            L4d:
                com.google.common.reflect.TypeResolver$WildcardCapturer r1 = r6.notForTypeVariable()
                java.lang.reflect.Type r7 = r7.getOwnerType()
                java.lang.reflect.Type r7 = r1.captureNullable(r7)
                java.lang.reflect.ParameterizedType r7 = com.google.common.reflect.Types.newParameterizedTypeWithOwner(r7, r0, r2)
                return r7
            L5e:
                boolean r0 = r7 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto L75
                r0 = r7
                java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
                java.lang.reflect.Type[] r1 = r0.getLowerBounds()
                int r1 = r1.length
                if (r1 != 0) goto L74
                java.lang.reflect.Type[] r7 = r0.getUpperBounds()
                java.lang.reflect.TypeVariable r7 = r6.captureAsTypeVariable(r7)
            L74:
                return r7
            L75:
                java.lang.AssertionError r7 = new java.lang.AssertionError
                java.lang.String r0 = "must have been one of the known types"
                r7.<init>(r0)
                throw r7
        }

        public java.lang.reflect.TypeVariable<?> captureAsTypeVariable(java.lang.reflect.Type[] r5) {
                r4 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r4.id
                int r0 = r0.incrementAndGet()
                r1 = 38
                com.google.common.base.Joiner r1 = com.google.common.base.Joiner.on(r1)
                java.lang.String r1 = r1.join(r5)
                r2 = 33
                int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "capture#"
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = "-of ? extends "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                java.lang.Class<com.google.common.reflect.TypeResolver$WildcardCapturer> r1 = com.google.common.reflect.TypeResolver.WildcardCapturer.class
                java.lang.reflect.TypeVariable r5 = com.google.common.reflect.Types.newArtificialTypeVariable(r1, r0, r5)
                return r5
        }
    }

    public TypeResolver() {
            r1 = this;
            r1.<init>()
            com.google.common.reflect.TypeResolver$TypeTable r0 = new com.google.common.reflect.TypeResolver$TypeTable
            r0.<init>()
            r1.typeTable = r0
            return
    }

    private TypeResolver(com.google.common.reflect.TypeResolver.TypeTable r1) {
            r0 = this;
            r0.<init>()
            r0.typeTable = r1
            return
    }

    public /* synthetic */ TypeResolver(com.google.common.reflect.TypeResolver.TypeTable r1, com.google.common.reflect.TypeResolver.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void access$000(java.util.Map r0, java.lang.reflect.Type r1, java.lang.reflect.Type r2) {
            populateTypeMappings(r0, r1, r2)
            return
    }

    public static /* synthetic */ java.lang.Object access$100(java.lang.Class r0, java.lang.Object r1) {
            java.lang.Object r0 = expectArgument(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.reflect.Type[] access$300(com.google.common.reflect.TypeResolver r0, java.lang.reflect.Type[] r1) {
            java.lang.reflect.Type[] r0 = r0.resolveTypes(r1)
            return r0
    }

    private static <T> T expectArgument(java.lang.Class<T> r3, java.lang.Object r4) {
            java.lang.Object r3 = r3.cast(r4)     // Catch: java.lang.ClassCastException -> L5
            return r3
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r3 = r3.getSimpleName()
            int r1 = r4.length()
            int r1 = r1 + 10
            int r2 = r3.length()
            int r2 = r2 + r1
            java.lang.String r1 = " is not a "
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r4, r1, r3)
            r0.<init>(r3)
            throw r0
    }

    private static void populateTypeMappings(java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> r1, java.lang.reflect.Type r2, java.lang.reflect.Type r3) {
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L7
            return
        L7:
            com.google.common.reflect.TypeResolver$1 r0 = new com.google.common.reflect.TypeResolver$1
            r0.<init>(r1, r3)
            r1 = 1
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r3 = 0
            r1[r3] = r2
            r0.visit(r1)
            return
    }

    private java.lang.reflect.Type resolveGenericArrayType(java.lang.reflect.GenericArrayType r1) {
            r0 = this;
            java.lang.reflect.Type r1 = r1.getGenericComponentType()
            java.lang.reflect.Type r1 = r0.resolveType(r1)
            java.lang.reflect.Type r1 = com.google.common.reflect.Types.newArrayType(r1)
            return r1
    }

    private java.lang.reflect.ParameterizedType resolveParameterizedType(java.lang.reflect.ParameterizedType r3) {
            r2 = this;
            java.lang.reflect.Type r0 = r3.getOwnerType()
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            java.lang.reflect.Type r0 = r2.resolveType(r0)
        Lc:
            java.lang.reflect.Type r1 = r3.getRawType()
            java.lang.reflect.Type r1 = r2.resolveType(r1)
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            java.lang.reflect.Type[] r3 = r2.resolveTypes(r3)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.ParameterizedType r3 = com.google.common.reflect.Types.newParameterizedTypeWithOwner(r0, r1, r3)
            return r3
    }

    private java.lang.reflect.Type[] resolveTypes(java.lang.reflect.Type[] r4) {
            r3 = this;
            int r0 = r4.length
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L12
            r2 = r4[r1]
            java.lang.reflect.Type r2 = r3.resolveType(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    private java.lang.reflect.WildcardType resolveWildcardType(java.lang.reflect.WildcardType r3) {
            r2 = this;
            java.lang.reflect.Type[] r0 = r3.getLowerBounds()
            java.lang.reflect.Type[] r3 = r3.getUpperBounds()
            com.google.common.reflect.Types$WildcardTypeImpl r1 = new com.google.common.reflect.Types$WildcardTypeImpl
            java.lang.reflect.Type[] r0 = r2.resolveTypes(r0)
            java.lang.reflect.Type[] r3 = r2.resolveTypes(r3)
            r1.<init>(r0, r3)
            return r1
    }

    public java.lang.reflect.Type resolveType(java.lang.reflect.Type r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L18
            com.google.common.reflect.TypeResolver$TypeTable r0 = r2.typeTable
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.util.Objects.requireNonNull(r0)
            com.google.common.reflect.TypeResolver$TypeTable$1 r1 = new com.google.common.reflect.TypeResolver$TypeTable$1
            r1.<init>(r3, r0)
            java.lang.reflect.Type r3 = r0.resolveInternal(r3, r1)
            return r3
        L18:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L23
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.ParameterizedType r3 = r2.resolveParameterizedType(r3)
            return r3
        L23:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L2e
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            java.lang.reflect.Type r3 = r2.resolveGenericArrayType(r3)
            return r3
        L2e:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L38
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.WildcardType r3 = r2.resolveWildcardType(r3)
        L38:
            return r3
    }

    public final java.lang.reflect.Type[] resolveTypesInPlace(java.lang.reflect.Type[] r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r3.length
            if (r0 >= r1) goto Lf
            r1 = r3[r0]
            java.lang.reflect.Type r1 = r2.resolveType(r1)
            r3[r0] = r1
            int r0 = r0 + 1
            goto L1
        Lf:
            return r3
    }

    public com.google.common.reflect.TypeResolver where(java.lang.reflect.Type r2, java.lang.reflect.Type r3) {
            r1 = this;
            java.util.HashMap r0 = com.google.common.collect.Maps.newHashMap()
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            populateTypeMappings(r0, r2, r3)
            com.google.common.reflect.TypeResolver r2 = r1.where(r0)
            return r2
    }

    public final com.google.common.reflect.TypeResolver where(java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey, ? extends java.lang.reflect.Type> r3) {
            r2 = this;
            com.google.common.reflect.TypeResolver r0 = new com.google.common.reflect.TypeResolver
            com.google.common.reflect.TypeResolver$TypeTable r1 = r2.typeTable
            com.google.common.reflect.TypeResolver$TypeTable r3 = r1.where(r3)
            r0.<init>(r3)
            return r0
    }
}
