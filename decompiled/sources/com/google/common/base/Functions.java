package com.google.common.base;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Functions {

    /* JADX INFO: renamed from: com.google.common.base.Functions$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ConstantFunction<E> implements com.google.common.base.Function<java.lang.Object, E>, java.io.Serializable {
        private static final long serialVersionUID = 0;

        @com.google.common.base.ParametricNullness
        private final E value;

        public ConstantFunction(@com.google.common.base.ParametricNullness E r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // com.google.common.base.Function
        @com.google.common.base.ParametricNullness
        public E apply(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                E r1 = r0.value
                return r1
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Functions.ConstantFunction
                if (r0 == 0) goto Lf
                com.google.common.base.Functions$ConstantFunction r2 = (com.google.common.base.Functions.ConstantFunction) r2
                E r0 = r1.value
                E r2 = r2.value
                boolean r2 = com.google.common.base.Objects.equal(r0, r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                E r0 = r1.value
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                E r0 = r4.value
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 20
                java.lang.String r2 = "Functions.constant("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ForMapWithDefault<K, V> implements com.google.common.base.Function<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;

        @com.google.common.base.ParametricNullness
        public final V defaultValue;
        public final java.util.Map<K, ? extends V> map;

        public ForMapWithDefault(java.util.Map<K, ? extends V> r1, @com.google.common.base.ParametricNullness V r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Map r1 = (java.util.Map) r1
                r0.map = r1
                r0.defaultValue = r2
                return
        }

        @Override // com.google.common.base.Function
        @com.google.common.base.ParametricNullness
        public V apply(@com.google.common.base.ParametricNullness K r3) {
                r2 = this;
                java.util.Map<K, ? extends V> r0 = r2.map
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L13
                java.util.Map<K, ? extends V> r1 = r2.map
                boolean r3 = r1.containsKey(r3)
                if (r3 == 0) goto L11
                goto L13
            L11:
                V r0 = r2.defaultValue
            L13:
                return r0
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.Functions.ForMapWithDefault
                r1 = 0
                if (r0 == 0) goto L1c
                com.google.common.base.Functions$ForMapWithDefault r4 = (com.google.common.base.Functions.ForMapWithDefault) r4
                java.util.Map<K, ? extends V> r0 = r3.map
                java.util.Map<K, ? extends V> r2 = r4.map
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1c
                V r0 = r3.defaultValue
                V r4 = r4.defaultValue
                boolean r4 = com.google.common.base.Objects.equal(r0, r4)
                if (r4 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.util.Map<K, ? extends V> r1 = r3.map
                r2 = 0
                r0[r2] = r1
                V r1 = r3.defaultValue
                r2 = 1
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.util.Map<K, ? extends V> r0 = r5.map
                java.lang.String r0 = java.lang.String.valueOf(r0)
                V r1 = r5.defaultValue
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 33
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = "Functions.forMap("
                java.lang.String r4 = ", defaultValue="
                java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r3, r2, r0, r4, r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class FunctionComposition<A, B, C> implements com.google.common.base.Function<A, C>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Function<A, ? extends B> f;
        private final com.google.common.base.Function<B, C> g;

        public FunctionComposition(com.google.common.base.Function<B, C> r1, com.google.common.base.Function<A, ? extends B> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.g = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.f = r1
                return
        }

        @Override // com.google.common.base.Function
        @com.google.common.base.ParametricNullness
        public C apply(@com.google.common.base.ParametricNullness A r3) {
                r2 = this;
                com.google.common.base.Function<B, C> r0 = r2.g
                com.google.common.base.Function<A, ? extends B> r1 = r2.f
                java.lang.Object r3 = r1.apply(r3)
                java.lang.Object r3 = r0.apply(r3)
                return r3
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.Functions.FunctionComposition
                r1 = 0
                if (r0 == 0) goto L1c
                com.google.common.base.Functions$FunctionComposition r4 = (com.google.common.base.Functions.FunctionComposition) r4
                com.google.common.base.Function<A, ? extends B> r0 = r3.f
                com.google.common.base.Function<A, ? extends B> r2 = r4.f
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1c
                com.google.common.base.Function<B, C> r0 = r3.g
                com.google.common.base.Function<B, C> r4 = r4.g
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
        }

        public int hashCode() {
                r2 = this;
                com.google.common.base.Function<A, ? extends B> r0 = r2.f
                int r0 = r0.hashCode()
                com.google.common.base.Function<B, C> r1 = r2.g
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                com.google.common.base.Function<B, C> r0 = r5.g
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.google.common.base.Function<A, ? extends B> r1 = r5.f
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 2
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = "("
                java.lang.String r4 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1, r4)
                return r0
        }
    }

    public static class FunctionForMapNoDefault<K, V> implements com.google.common.base.Function<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final java.util.Map<K, V> map;

        public FunctionForMapNoDefault(java.util.Map<K, V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Map r1 = (java.util.Map) r1
                r0.map = r1
                return
        }

        @Override // com.google.common.base.Function
        @com.google.common.base.ParametricNullness
        public V apply(@com.google.common.base.ParametricNullness K r4) {
                r3 = this;
                java.util.Map<K, V> r0 = r3.map
                java.lang.Object r0 = r0.get(r4)
                if (r0 != 0) goto L13
                java.util.Map<K, V> r1 = r3.map
                boolean r1 = r1.containsKey(r4)
                if (r1 == 0) goto L11
                goto L13
            L11:
                r1 = 0
                goto L14
            L13:
                r1 = 1
            L14:
                java.lang.String r2 = "Key '%s' not present in map"
                com.google.common.base.Preconditions.checkArgument(r1, r2, r4)
                return r0
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Functions.FunctionForMapNoDefault
                if (r0 == 0) goto Lf
                com.google.common.base.Functions$FunctionForMapNoDefault r2 = (com.google.common.base.Functions.FunctionForMapNoDefault) r2
                java.util.Map<K, V> r0 = r1.map
                java.util.Map<K, V> r2 = r2.map
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.map
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.util.Map<K, V> r0 = r4.map
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 18
                java.lang.String r2 = "Functions.forMap("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum IdentityFunction extends java.lang.Enum<com.google.common.base.Functions.IdentityFunction> implements com.google.common.base.Function<java.lang.Object, java.lang.Object> {
        private static final /* synthetic */ com.google.common.base.Functions.IdentityFunction[] $VALUES = null;
        public static final com.google.common.base.Functions.IdentityFunction INSTANCE = null;

        private static /* synthetic */ com.google.common.base.Functions.IdentityFunction[] $values() {
                r0 = 1
                com.google.common.base.Functions$IdentityFunction[] r0 = new com.google.common.base.Functions.IdentityFunction[r0]
                com.google.common.base.Functions$IdentityFunction r1 = com.google.common.base.Functions.IdentityFunction.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.base.Functions$IdentityFunction r0 = new com.google.common.base.Functions$IdentityFunction
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.base.Functions.IdentityFunction.INSTANCE = r0
                com.google.common.base.Functions$IdentityFunction[] r0 = $values()
                com.google.common.base.Functions.IdentityFunction.$VALUES = r0
                return
        }

        private IdentityFunction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.base.Functions.IdentityFunction valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.base.Functions$IdentityFunction> r0 = com.google.common.base.Functions.IdentityFunction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.base.Functions$IdentityFunction r1 = (com.google.common.base.Functions.IdentityFunction) r1
                return r1
        }

        public static com.google.common.base.Functions.IdentityFunction[] values() {
                com.google.common.base.Functions$IdentityFunction[] r0 = com.google.common.base.Functions.IdentityFunction.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.base.Functions$IdentityFunction[] r0 = (com.google.common.base.Functions.IdentityFunction[]) r0
                return r0
        }

        @Override // com.google.common.base.Function
        @javax.annotation.CheckForNull
        public java.lang.Object apply(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                return r1
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Functions.identity()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class PredicateFunction<T> implements com.google.common.base.Function<T, java.lang.Boolean>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Predicate<T> predicate;

        private PredicateFunction(com.google.common.base.Predicate<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Predicate r1 = (com.google.common.base.Predicate) r1
                r0.predicate = r1
                return
        }

        public /* synthetic */ PredicateFunction(com.google.common.base.Predicate r1, com.google.common.base.Functions.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Function
        public java.lang.Boolean apply(@com.google.common.base.ParametricNullness T r2) {
                r1 = this;
                com.google.common.base.Predicate<T> r0 = r1.predicate
                boolean r2 = r0.apply(r2)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ java.lang.Boolean apply(@com.google.common.base.ParametricNullness java.lang.Object r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.apply(r1)
                return r1
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Functions.PredicateFunction
                if (r0 == 0) goto Lf
                com.google.common.base.Functions$PredicateFunction r2 = (com.google.common.base.Functions.PredicateFunction) r2
                com.google.common.base.Predicate<T> r0 = r1.predicate
                com.google.common.base.Predicate<T> r2 = r2.predicate
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.google.common.base.Predicate<T> r0 = r1.predicate
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                com.google.common.base.Predicate<T> r0 = r4.predicate
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 24
                java.lang.String r2 = "Functions.forPredicate("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SupplierFunction<F, T> implements com.google.common.base.Function<F, T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Supplier<T> supplier;

        private SupplierFunction(com.google.common.base.Supplier<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.supplier = r1
                return
        }

        public /* synthetic */ SupplierFunction(com.google.common.base.Supplier r1, com.google.common.base.Functions.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.base.Function
        @com.google.common.base.ParametricNullness
        public T apply(@com.google.common.base.ParametricNullness F r1) {
                r0 = this;
                com.google.common.base.Supplier<T> r1 = r0.supplier
                java.lang.Object r1 = r1.get()
                return r1
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Functions.SupplierFunction
                if (r0 == 0) goto Lf
                com.google.common.base.Functions$SupplierFunction r2 = (com.google.common.base.Functions.SupplierFunction) r2
                com.google.common.base.Supplier<T> r0 = r1.supplier
                com.google.common.base.Supplier<T> r2 = r2.supplier
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.google.common.base.Supplier<T> r0 = r1.supplier
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                com.google.common.base.Supplier<T> r0 = r4.supplier
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 23
                java.lang.String r2 = "Functions.forSupplier("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum ToStringFunction extends java.lang.Enum<com.google.common.base.Functions.ToStringFunction> implements com.google.common.base.Function<java.lang.Object, java.lang.String> {
        private static final /* synthetic */ com.google.common.base.Functions.ToStringFunction[] $VALUES = null;
        public static final com.google.common.base.Functions.ToStringFunction INSTANCE = null;

        private static /* synthetic */ com.google.common.base.Functions.ToStringFunction[] $values() {
                r0 = 1
                com.google.common.base.Functions$ToStringFunction[] r0 = new com.google.common.base.Functions.ToStringFunction[r0]
                com.google.common.base.Functions$ToStringFunction r1 = com.google.common.base.Functions.ToStringFunction.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.base.Functions$ToStringFunction r0 = new com.google.common.base.Functions$ToStringFunction
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.base.Functions.ToStringFunction.INSTANCE = r0
                com.google.common.base.Functions$ToStringFunction[] r0 = $values()
                com.google.common.base.Functions.ToStringFunction.$VALUES = r0
                return
        }

        private ToStringFunction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.base.Functions.ToStringFunction valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.base.Functions$ToStringFunction> r0 = com.google.common.base.Functions.ToStringFunction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.base.Functions$ToStringFunction r1 = (com.google.common.base.Functions.ToStringFunction) r1
                return r1
        }

        public static com.google.common.base.Functions.ToStringFunction[] values() {
                com.google.common.base.Functions$ToStringFunction[] r0 = com.google.common.base.Functions.ToStringFunction.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.base.Functions$ToStringFunction[] r0 = (com.google.common.base.Functions.ToStringFunction[]) r0
                return r0
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ java.lang.String apply(java.lang.Object r1) {
                r0 = this;
                java.lang.String r1 = r0.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
        public java.lang.String apply2(java.lang.Object r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Functions.toStringFunction()"
                return r0
        }
    }

    private Functions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <A, B, C> com.google.common.base.Function<A, C> compose(com.google.common.base.Function<B, C> r1, com.google.common.base.Function<A, ? extends B> r2) {
            com.google.common.base.Functions$FunctionComposition r0 = new com.google.common.base.Functions$FunctionComposition
            r0.<init>(r1, r2)
            return r0
    }

    public static <E> com.google.common.base.Function<java.lang.Object, E> constant(@com.google.common.base.ParametricNullness E r1) {
            com.google.common.base.Functions$ConstantFunction r0 = new com.google.common.base.Functions$ConstantFunction
            r0.<init>(r1)
            return r0
    }

    public static <K, V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, V> r1) {
            com.google.common.base.Functions$FunctionForMapNoDefault r0 = new com.google.common.base.Functions$FunctionForMapNoDefault
            r0.<init>(r1)
            return r0
    }

    public static <K, V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, ? extends V> r1, @com.google.common.base.ParametricNullness V r2) {
            com.google.common.base.Functions$ForMapWithDefault r0 = new com.google.common.base.Functions$ForMapWithDefault
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.google.common.base.Function<T, java.lang.Boolean> forPredicate(com.google.common.base.Predicate<T> r2) {
            com.google.common.base.Functions$PredicateFunction r0 = new com.google.common.base.Functions$PredicateFunction
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <F, T> com.google.common.base.Function<F, T> forSupplier(com.google.common.base.Supplier<T> r2) {
            com.google.common.base.Functions$SupplierFunction r0 = new com.google.common.base.Functions$SupplierFunction
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <E> com.google.common.base.Function<E, E> identity() {
            com.google.common.base.Functions$IdentityFunction r0 = com.google.common.base.Functions.IdentityFunction.INSTANCE
            return r0
    }

    public static com.google.common.base.Function<java.lang.Object, java.lang.String> toStringFunction() {
            com.google.common.base.Functions$ToStringFunction r0 = com.google.common.base.Functions.ToStringFunction.INSTANCE
            return r0
    }
}
