package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Suppliers {

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.VisibleForTesting
    public static class ExpiringMemoizingSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.base.Supplier<T> delegate;
        public final long durationNanos;
        public volatile transient long expirationNanos;

        @javax.annotation.CheckForNull
        public volatile transient T value;

        public ExpiringMemoizingSupplier(com.google.common.base.Supplier<T> r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                r2.<init>()
                java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
                com.google.common.base.Supplier r3 = (com.google.common.base.Supplier) r3
                r2.delegate = r3
                long r0 = r6.toNanos(r4)
                r2.durationNanos = r0
                r0 = 0
                int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r3 <= 0) goto L19
                r3 = 1
                goto L1a
            L19:
                r3 = 0
            L1a:
                java.lang.String r0 = "duration (%s %s) must be > 0"
                com.google.common.base.Preconditions.checkArgument(r3, r0, r4, r6)
                return
        }

        @Override // com.google.common.base.Supplier
        @com.google.common.base.ParametricNullness
        public T get() {
                r9 = this;
                long r0 = r9.expirationNanos
                int r2 = com.google.common.base.Platform.$r8$clinit
                long r2 = java.lang.System.nanoTime()
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 == 0) goto L14
                long r6 = r2 - r0
                int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r8 < 0) goto L31
            L14:
                monitor-enter(r9)
                long r6 = r9.expirationNanos     // Catch: java.lang.Throwable -> L34
                int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r8 != 0) goto L30
                com.google.common.base.Supplier<T> r0 = r9.delegate     // Catch: java.lang.Throwable -> L34
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L34
                r9.value = r0     // Catch: java.lang.Throwable -> L34
                long r6 = r9.durationNanos     // Catch: java.lang.Throwable -> L34
                long r2 = r2 + r6
                int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r1 != 0) goto L2c
                r2 = 1
            L2c:
                r9.expirationNanos = r2     // Catch: java.lang.Throwable -> L34
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L34
                return r0
            L30:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L34
            L31:
                T r0 = r9.value
                return r0
            L34:
                r0 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L34
                throw r0
        }

        public java.lang.String toString() {
                r5 = this;
                com.google.common.base.Supplier<T> r0 = r5.delegate
                java.lang.String r0 = java.lang.String.valueOf(r0)
                long r1 = r5.durationNanos
                int r3 = r0.length()
                int r3 = r3 + 62
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r3)
                java.lang.String r3 = "Suppliers.memoizeWithExpiration("
                r4.append(r3)
                r4.append(r0)
                java.lang.String r0 = ", "
                r4.append(r0)
                r4.append(r1)
                java.lang.String r0 = ", NANOS)"
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.VisibleForTesting
    public static class MemoizingSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.base.Supplier<T> delegate;
        public volatile transient boolean initialized;

        @javax.annotation.CheckForNull
        public transient T value;

        public MemoizingSupplier(com.google.common.base.Supplier<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.base.Supplier
        @com.google.common.base.ParametricNullness
        public T get() {
                r2 = this;
                boolean r0 = r2.initialized
                if (r0 != 0) goto L1b
                monitor-enter(r2)
                boolean r0 = r2.initialized     // Catch: java.lang.Throwable -> L18
                if (r0 != 0) goto L16
                com.google.common.base.Supplier<T> r0 = r2.delegate     // Catch: java.lang.Throwable -> L18
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L18
                r2.value = r0     // Catch: java.lang.Throwable -> L18
                r1 = 1
                r2.initialized = r1     // Catch: java.lang.Throwable -> L18
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
                return r0
            L16:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
                goto L1b
            L18:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
                throw r0
            L1b:
                T r0 = r2.value
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                boolean r0 = r4.initialized
                if (r0 == 0) goto L19
                T r0 = r4.value
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 25
                java.lang.String r2 = "<supplier that returned "
                java.lang.String r3 = ">"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                goto L1b
            L19:
                com.google.common.base.Supplier<T> r0 = r4.delegate
            L1b:
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 19
                java.lang.String r2 = "Suppliers.memoize("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.VisibleForTesting
    public static class NonSerializableMemoizingSupplier<T> implements com.google.common.base.Supplier<T> {

        @javax.annotation.CheckForNull
        public volatile com.google.common.base.Supplier<T> delegate;
        public volatile boolean initialized;

        @javax.annotation.CheckForNull
        public T value;

        public NonSerializableMemoizingSupplier(com.google.common.base.Supplier<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.base.Supplier
        @com.google.common.base.ParametricNullness
        public T get() {
                r2 = this;
                boolean r0 = r2.initialized
                if (r0 != 0) goto L23
                monitor-enter(r2)
                boolean r0 = r2.initialized     // Catch: java.lang.Throwable -> L20
                if (r0 != 0) goto L1e
                com.google.common.base.Supplier<T> r0 = r2.delegate     // Catch: java.lang.Throwable -> L20
                java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.base.Supplier r0 = (com.google.common.base.Supplier) r0     // Catch: java.lang.Throwable -> L20
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L20
                r2.value = r0     // Catch: java.lang.Throwable -> L20
                r1 = 1
                r2.initialized = r1     // Catch: java.lang.Throwable -> L20
                r1 = 0
                r2.delegate = r1     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                return r0
            L1e:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                goto L23
            L20:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0
            L23:
                T r0 = r2.value
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                com.google.common.base.Supplier<T> r0 = r4.delegate
                if (r0 != 0) goto L18
                T r0 = r4.value
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 25
                java.lang.String r2 = "<supplier that returned "
                java.lang.String r3 = ">"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
            L18:
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 19
                java.lang.String r2 = "Suppliers.memoize("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class SupplierComposition<F, T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.base.Function<? super F, T> function;
        public final com.google.common.base.Supplier<F> supplier;

        public SupplierComposition(com.google.common.base.Function<? super F, T> r1, com.google.common.base.Supplier<F> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.function = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.supplier = r1
                return
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.Suppliers.SupplierComposition
                r1 = 0
                if (r0 == 0) goto L1c
                com.google.common.base.Suppliers$SupplierComposition r4 = (com.google.common.base.Suppliers.SupplierComposition) r4
                com.google.common.base.Function<? super F, T> r0 = r3.function
                com.google.common.base.Function<? super F, T> r2 = r4.function
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1c
                com.google.common.base.Supplier<F> r0 = r3.supplier
                com.google.common.base.Supplier<F> r4 = r4.supplier
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
        }

        @Override // com.google.common.base.Supplier
        @com.google.common.base.ParametricNullness
        public T get() {
                r2 = this;
                com.google.common.base.Function<? super F, T> r0 = r2.function
                com.google.common.base.Supplier<F> r1 = r2.supplier
                java.lang.Object r1 = r1.get()
                java.lang.Object r0 = r0.apply(r1)
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.google.common.base.Function<? super F, T> r1 = r3.function
                r2 = 0
                r0[r2] = r1
                com.google.common.base.Supplier<F> r1 = r3.supplier
                r2 = 1
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                com.google.common.base.Function<? super F, T> r0 = r5.function
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.google.common.base.Supplier<F> r1 = r5.supplier
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 21
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = "Suppliers.compose("
                java.lang.String r4 = ", "
                java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r3, r2, r0, r4, r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public interface SupplierFunction<T> extends com.google.common.base.Function<com.google.common.base.Supplier<T>, T> {
    }

    public static final enum SupplierFunctionImpl extends java.lang.Enum<com.google.common.base.Suppliers.SupplierFunctionImpl> implements com.google.common.base.Suppliers.SupplierFunction<java.lang.Object> {
        private static final /* synthetic */ com.google.common.base.Suppliers.SupplierFunctionImpl[] $VALUES = null;
        public static final com.google.common.base.Suppliers.SupplierFunctionImpl INSTANCE = null;

        private static /* synthetic */ com.google.common.base.Suppliers.SupplierFunctionImpl[] $values() {
                r0 = 1
                com.google.common.base.Suppliers$SupplierFunctionImpl[] r0 = new com.google.common.base.Suppliers.SupplierFunctionImpl[r0]
                com.google.common.base.Suppliers$SupplierFunctionImpl r1 = com.google.common.base.Suppliers.SupplierFunctionImpl.INSTANCE
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.base.Suppliers$SupplierFunctionImpl r0 = new com.google.common.base.Suppliers$SupplierFunctionImpl
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.base.Suppliers.SupplierFunctionImpl.INSTANCE = r0
                com.google.common.base.Suppliers$SupplierFunctionImpl[] r0 = $values()
                com.google.common.base.Suppliers.SupplierFunctionImpl.$VALUES = r0
                return
        }

        private SupplierFunctionImpl(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.base.Suppliers.SupplierFunctionImpl valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.base.Suppliers$SupplierFunctionImpl> r0 = com.google.common.base.Suppliers.SupplierFunctionImpl.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.base.Suppliers$SupplierFunctionImpl r1 = (com.google.common.base.Suppliers.SupplierFunctionImpl) r1
                return r1
        }

        public static com.google.common.base.Suppliers.SupplierFunctionImpl[] values() {
                com.google.common.base.Suppliers$SupplierFunctionImpl[] r0 = com.google.common.base.Suppliers.SupplierFunctionImpl.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.base.Suppliers$SupplierFunctionImpl[] r0 = (com.google.common.base.Suppliers.SupplierFunctionImpl[]) r0
                return r0
        }

        @javax.annotation.CheckForNull
        public java.lang.Object apply(com.google.common.base.Supplier<java.lang.Object> r1) {
                r0 = this;
                java.lang.Object r1 = r1.get()
                return r1
        }

        @Override // com.google.common.base.Function
        @javax.annotation.CheckForNull
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) {
                r0 = this;
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                java.lang.Object r1 = r0.apply(r1)
                return r1
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Suppliers.supplierFunction()"
                return r0
        }
    }

    public static class SupplierOfInstance<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;

        @com.google.common.base.ParametricNullness
        public final T instance;

        public SupplierOfInstance(@com.google.common.base.ParametricNullness T r1) {
                r0 = this;
                r0.<init>()
                r0.instance = r1
                return
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Suppliers.SupplierOfInstance
                if (r0 == 0) goto Lf
                com.google.common.base.Suppliers$SupplierOfInstance r2 = (com.google.common.base.Suppliers.SupplierOfInstance) r2
                T r0 = r1.instance
                T r2 = r2.instance
                boolean r2 = com.google.common.base.Objects.equal(r0, r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // com.google.common.base.Supplier
        @com.google.common.base.ParametricNullness
        public T get() {
                r1 = this;
                T r0 = r1.instance
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                T r1 = r3.instance
                r2 = 0
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                T r0 = r4.instance
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 22
                java.lang.String r2 = "Suppliers.ofInstance("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ThreadSafeSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.base.Supplier<T> delegate;

        public ThreadSafeSupplier(com.google.common.base.Supplier<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.base.Supplier
        @com.google.common.base.ParametricNullness
        public T get() {
                r2 = this;
                com.google.common.base.Supplier<T> r0 = r2.delegate
                monitor-enter(r0)
                com.google.common.base.Supplier<T> r1 = r2.delegate     // Catch: java.lang.Throwable -> Lb
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return r1
            Lb:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1
        }

        public java.lang.String toString() {
                r4 = this;
                com.google.common.base.Supplier<T> r0 = r4.delegate
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 32
                java.lang.String r2 = "Suppliers.synchronizedSupplier("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    private Suppliers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <F, T> com.google.common.base.Supplier<T> compose(com.google.common.base.Function<? super F, T> r1, com.google.common.base.Supplier<F> r2) {
            com.google.common.base.Suppliers$SupplierComposition r0 = new com.google.common.base.Suppliers$SupplierComposition
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.google.common.base.Supplier<T> memoize(com.google.common.base.Supplier<T> r1) {
            boolean r0 = r1 instanceof com.google.common.base.Suppliers.NonSerializableMemoizingSupplier
            if (r0 != 0) goto L19
            boolean r0 = r1 instanceof com.google.common.base.Suppliers.MemoizingSupplier
            if (r0 == 0) goto L9
            goto L19
        L9:
            boolean r0 = r1 instanceof java.io.Serializable
            if (r0 == 0) goto L13
            com.google.common.base.Suppliers$MemoizingSupplier r0 = new com.google.common.base.Suppliers$MemoizingSupplier
            r0.<init>(r1)
            goto L18
        L13:
            com.google.common.base.Suppliers$NonSerializableMemoizingSupplier r0 = new com.google.common.base.Suppliers$NonSerializableMemoizingSupplier
            r0.<init>(r1)
        L18:
            return r0
        L19:
            return r1
    }

    public static <T> com.google.common.base.Supplier<T> memoizeWithExpiration(com.google.common.base.Supplier<T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            com.google.common.base.Suppliers$ExpiringMemoizingSupplier r0 = new com.google.common.base.Suppliers$ExpiringMemoizingSupplier
            r0.<init>(r1, r2, r4)
            return r0
    }

    public static <T> com.google.common.base.Supplier<T> ofInstance(@com.google.common.base.ParametricNullness T r1) {
            com.google.common.base.Suppliers$SupplierOfInstance r0 = new com.google.common.base.Suppliers$SupplierOfInstance
            r0.<init>(r1)
            return r0
    }

    public static <T> com.google.common.base.Function<com.google.common.base.Supplier<T>, T> supplierFunction() {
            com.google.common.base.Suppliers$SupplierFunctionImpl r0 = com.google.common.base.Suppliers.SupplierFunctionImpl.INSTANCE
            return r0
    }

    public static <T> com.google.common.base.Supplier<T> synchronizedSupplier(com.google.common.base.Supplier<T> r1) {
            com.google.common.base.Suppliers$ThreadSafeSupplier r0 = new com.google.common.base.Suppliers$ThreadSafeSupplier
            r0.<init>(r1)
            return r0
    }
}
