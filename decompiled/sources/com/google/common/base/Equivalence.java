package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class Equivalence<T> {

    /* JADX INFO: renamed from: com.google.common.base.Equivalence$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Equals extends com.google.common.base.Equivalence<java.lang.Object> implements java.io.Serializable {
        public static final com.google.common.base.Equivalence.Equals INSTANCE = null;
        private static final long serialVersionUID = 1;

        static {
                com.google.common.base.Equivalence$Equals r0 = new com.google.common.base.Equivalence$Equals
                r0.<init>()
                com.google.common.base.Equivalence.Equals.INSTANCE = r0
                return
        }

        public Equals() {
                r0 = this;
                r0.<init>()
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.base.Equivalence$Equals r0 = com.google.common.base.Equivalence.Equals.INSTANCE
                return r0
        }

        @Override // com.google.common.base.Equivalence
        public final boolean doEquivalent(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                boolean r1 = r1.equals(r2)
                return r1
        }

        @Override // com.google.common.base.Equivalence
        public final int doHash(java.lang.Object r1) {
                r0 = this;
                int r1 = r1.hashCode()
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class EquivalentToPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Equivalence<T> equivalence;

        @javax.annotation.CheckForNull
        private final T target;

        public EquivalentToPredicate(com.google.common.base.Equivalence<T> r1, @javax.annotation.CheckForNull T r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Equivalence r1 = (com.google.common.base.Equivalence) r1
                r0.equivalence = r1
                r0.target = r2
                return
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@javax.annotation.CheckForNull T r3) {
                r2 = this;
                com.google.common.base.Equivalence<T> r0 = r2.equivalence
                T r1 = r2.target
                boolean r3 = r0.equivalent(r3, r1)
                return r3
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.common.base.Equivalence.EquivalentToPredicate
                r2 = 0
                if (r1 == 0) goto L22
                com.google.common.base.Equivalence$EquivalentToPredicate r5 = (com.google.common.base.Equivalence.EquivalentToPredicate) r5
                com.google.common.base.Equivalence<T> r1 = r4.equivalence
                com.google.common.base.Equivalence<T> r3 = r5.equivalence
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L20
                T r1 = r4.target
                T r5 = r5.target
                boolean r5 = com.google.common.base.Objects.equal(r1, r5)
                if (r5 == 0) goto L20
                goto L21
            L20:
                r0 = 0
            L21:
                return r0
            L22:
                return r2
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.google.common.base.Equivalence<T> r1 = r3.equivalence
                r2 = 0
                r0[r2] = r1
                T r1 = r3.target
                r2 = 1
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                com.google.common.base.Equivalence<T> r0 = r5.equivalence
                java.lang.String r0 = java.lang.String.valueOf(r0)
                T r1 = r5.target
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 15
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = ".equivalentTo("
                java.lang.String r4 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1, r4)
                return r0
        }
    }

    public static final class Identity extends com.google.common.base.Equivalence<java.lang.Object> implements java.io.Serializable {
        public static final com.google.common.base.Equivalence.Identity INSTANCE = null;
        private static final long serialVersionUID = 1;

        static {
                com.google.common.base.Equivalence$Identity r0 = new com.google.common.base.Equivalence$Identity
                r0.<init>()
                com.google.common.base.Equivalence.Identity.INSTANCE = r0
                return
        }

        public Identity() {
                r0 = this;
                r0.<init>()
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.base.Equivalence$Identity r0 = com.google.common.base.Equivalence.Identity.INSTANCE
                return r0
        }

        @Override // com.google.common.base.Equivalence
        public final boolean doEquivalent(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.google.common.base.Equivalence
        public final int doHash(java.lang.Object r1) {
                r0 = this;
                int r1 = java.lang.System.identityHashCode(r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Wrapper<T> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Equivalence<? super T> equivalence;

        @com.google.common.base.ParametricNullness
        private final T reference;

        private Wrapper(com.google.common.base.Equivalence<? super T> r1, @com.google.common.base.ParametricNullness T r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Equivalence r1 = (com.google.common.base.Equivalence) r1
                r0.equivalence = r1
                r0.reference = r2
                return
        }

        public /* synthetic */ Wrapper(com.google.common.base.Equivalence r1, java.lang.Object r2, com.google.common.base.Equivalence.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                if (r3 != r2) goto L4
                r3 = 1
                return r3
            L4:
                boolean r0 = r3 instanceof com.google.common.base.Equivalence.Wrapper
                if (r0 == 0) goto L1f
                com.google.common.base.Equivalence$Wrapper r3 = (com.google.common.base.Equivalence.Wrapper) r3
                com.google.common.base.Equivalence<? super T> r0 = r2.equivalence
                com.google.common.base.Equivalence<? super T> r1 = r3.equivalence
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1f
                com.google.common.base.Equivalence<? super T> r0 = r2.equivalence
                T r1 = r2.reference
                T r3 = r3.reference
                boolean r3 = r0.equivalent(r1, r3)
                return r3
            L1f:
                r3 = 0
                return r3
        }

        @com.google.common.base.ParametricNullness
        public T get() {
                r1 = this;
                T r0 = r1.reference
                return r0
        }

        public int hashCode() {
                r2 = this;
                com.google.common.base.Equivalence<? super T> r0 = r2.equivalence
                T r1 = r2.reference
                int r0 = r0.hash(r1)
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                com.google.common.base.Equivalence<? super T> r0 = r5.equivalence
                java.lang.String r0 = java.lang.String.valueOf(r0)
                T r1 = r5.reference
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 7
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = ".wrap("
                java.lang.String r4 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1, r4)
                return r0
        }
    }

    public Equivalence() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.base.Equivalence<java.lang.Object> equals() {
            com.google.common.base.Equivalence$Equals r0 = com.google.common.base.Equivalence.Equals.INSTANCE
            return r0
    }

    public static com.google.common.base.Equivalence<java.lang.Object> identity() {
            com.google.common.base.Equivalence$Identity r0 = com.google.common.base.Equivalence.Identity.INSTANCE
            return r0
    }

    @com.google.errorprone.annotations.ForOverride
    public abstract boolean doEquivalent(T r1, T r2);

    @com.google.errorprone.annotations.ForOverride
    public abstract int doHash(T r1);

    public final boolean equivalent(@javax.annotation.CheckForNull T r1, @javax.annotation.CheckForNull T r2) {
            r0 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            if (r1 == 0) goto Le
            if (r2 != 0) goto L9
            goto Le
        L9:
            boolean r1 = r0.doEquivalent(r1, r2)
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final com.google.common.base.Predicate<T> equivalentTo(@javax.annotation.CheckForNull T r2) {
            r1 = this;
            com.google.common.base.Equivalence$EquivalentToPredicate r0 = new com.google.common.base.Equivalence$EquivalentToPredicate
            r0.<init>(r1, r2)
            return r0
    }

    public final int hash(@javax.annotation.CheckForNull T r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            int r1 = r0.doHash(r1)
            return r1
    }

    public final <F> com.google.common.base.Equivalence<F> onResultOf(com.google.common.base.Function<? super F, ? extends T> r2) {
            r1 = this;
            com.google.common.base.FunctionalEquivalence r0 = new com.google.common.base.FunctionalEquivalence
            r0.<init>(r2, r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public final <S extends T> com.google.common.base.Equivalence<java.lang.Iterable<S>> pairwise() {
            r1 = this;
            com.google.common.base.PairwiseEquivalence r0 = new com.google.common.base.PairwiseEquivalence
            r0.<init>(r1)
            return r0
    }

    public final <S extends T> com.google.common.base.Equivalence.Wrapper<S> wrap(@com.google.common.base.ParametricNullness S r3) {
            r2 = this;
            com.google.common.base.Equivalence$Wrapper r0 = new com.google.common.base.Equivalence$Wrapper
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }
}
