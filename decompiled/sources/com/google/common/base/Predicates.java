package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Predicates {

    /* JADX INFO: renamed from: com.google.common.base.Predicates$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class AndPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.List<? extends com.google.common.base.Predicate<? super T>> components;

        private AndPredicate(java.util.List<? extends com.google.common.base.Predicate<? super T>> r1) {
                r0 = this;
                r0.<init>()
                r0.components = r1
                return
        }

        public /* synthetic */ AndPredicate(java.util.List r1, com.google.common.base.Predicates.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.base.ParametricNullness T r4) {
                r3 = this;
                r0 = 0
                r1 = 0
            L2:
                java.util.List<? extends com.google.common.base.Predicate<? super T>> r2 = r3.components
                int r2 = r2.size()
                if (r1 >= r2) goto L1c
                java.util.List<? extends com.google.common.base.Predicate<? super T>> r2 = r3.components
                java.lang.Object r2 = r2.get(r1)
                com.google.common.base.Predicate r2 = (com.google.common.base.Predicate) r2
                boolean r2 = r2.apply(r4)
                if (r2 != 0) goto L19
                return r0
            L19:
                int r1 = r1 + 1
                goto L2
            L1c:
                r4 = 1
                return r4
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Predicates.AndPredicate
                if (r0 == 0) goto Lf
                com.google.common.base.Predicates$AndPredicate r2 = (com.google.common.base.Predicates.AndPredicate) r2
                java.util.List<? extends com.google.common.base.Predicate<? super T>> r0 = r1.components
                java.util.List<? extends com.google.common.base.Predicate<? super T>> r2 = r2.components
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r2 = this;
                java.util.List<? extends com.google.common.base.Predicate<? super T>> r0 = r2.components
                int r0 = r0.hashCode()
                r1 = 306654252(0x12472c2c, float:6.2847774E-28)
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.util.List<? extends com.google.common.base.Predicate<? super T>> r0 = r2.components
                java.lang.String r1 = "and"
                java.lang.String r0 = com.google.common.base.Predicates.access$800(r1, r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class CompositionPredicate<A, B> implements com.google.common.base.Predicate<A>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.base.Function<A, ? extends B> f;
        public final com.google.common.base.Predicate<B> p;

        private CompositionPredicate(com.google.common.base.Predicate<B> r1, com.google.common.base.Function<A, ? extends B> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Predicate r1 = (com.google.common.base.Predicate) r1
                r0.p = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.f = r1
                return
        }

        public /* synthetic */ CompositionPredicate(com.google.common.base.Predicate r1, com.google.common.base.Function r2, com.google.common.base.Predicates.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.base.ParametricNullness A r3) {
                r2 = this;
                com.google.common.base.Predicate<B> r0 = r2.p
                com.google.common.base.Function<A, ? extends B> r1 = r2.f
                java.lang.Object r3 = r1.apply(r3)
                boolean r3 = r0.apply(r3)
                return r3
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.Predicates.CompositionPredicate
                r1 = 0
                if (r0 == 0) goto L1c
                com.google.common.base.Predicates$CompositionPredicate r4 = (com.google.common.base.Predicates.CompositionPredicate) r4
                com.google.common.base.Function<A, ? extends B> r0 = r3.f
                com.google.common.base.Function<A, ? extends B> r2 = r4.f
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1c
                com.google.common.base.Predicate<B> r0 = r3.p
                com.google.common.base.Predicate<B> r4 = r4.p
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
                com.google.common.base.Predicate<B> r1 = r2.p
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                com.google.common.base.Predicate<B> r0 = r5.p
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

    @com.google.common.annotations.GwtIncompatible
    public static class ContainsPatternFromStringPredicate extends com.google.common.base.Predicates.ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        public ContainsPatternFromStringPredicate(java.lang.String r1) {
                r0 = this;
                com.google.common.base.CommonPattern r1 = com.google.common.base.Platform.compilePattern(r1)
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public java.lang.String toString() {
                r4 = this;
                com.google.common.base.CommonPattern r0 = r4.pattern
                java.lang.String r0 = r0.pattern()
                r1 = 28
                int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1)
                java.lang.String r2 = "Predicates.containsPattern("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.GwtIncompatible
    public static class ContainsPatternPredicate implements com.google.common.base.Predicate<java.lang.CharSequence>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.base.CommonPattern pattern;

        public ContainsPatternPredicate(com.google.common.base.CommonPattern r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.CommonPattern r1 = (com.google.common.base.CommonPattern) r1
                r0.pattern = r1
                return
        }

        /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
        public boolean apply2(java.lang.CharSequence r2) {
                r1 = this;
                com.google.common.base.CommonPattern r0 = r1.pattern
                com.google.common.base.CommonMatcher r2 = r0.matcher(r2)
                boolean r2 = r2.find()
                return r2
        }

        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = r0.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.Predicates.ContainsPatternPredicate
                r1 = 0
                if (r0 == 0) goto L28
                com.google.common.base.Predicates$ContainsPatternPredicate r4 = (com.google.common.base.Predicates.ContainsPatternPredicate) r4
                com.google.common.base.CommonPattern r0 = r3.pattern
                java.lang.String r0 = r0.pattern()
                com.google.common.base.CommonPattern r2 = r4.pattern
                java.lang.String r2 = r2.pattern()
                boolean r0 = com.google.common.base.Objects.equal(r0, r2)
                if (r0 == 0) goto L28
                com.google.common.base.CommonPattern r0 = r3.pattern
                int r0 = r0.flags()
                com.google.common.base.CommonPattern r4 = r4.pattern
                int r4 = r4.flags()
                if (r0 != r4) goto L28
                r1 = 1
            L28:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.google.common.base.CommonPattern r1 = r3.pattern
                java.lang.String r1 = r1.pattern()
                r2 = 0
                r0[r2] = r1
                com.google.common.base.CommonPattern r1 = r3.pattern
                int r1 = r1.flags()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                com.google.common.base.CommonPattern r0 = r4.pattern
                com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r0)
                com.google.common.base.CommonPattern r1 = r4.pattern
                java.lang.String r1 = r1.pattern()
                java.lang.String r2 = "pattern"
                com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r2, r1)
                com.google.common.base.CommonPattern r1 = r4.pattern
                int r1 = r1.flags()
                java.lang.String r2 = "pattern.flags"
                com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r2, r1)
                java.lang.String r0 = r0.toString()
                r1 = 21
                int r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1)
                java.lang.String r2 = "Predicates.contains("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    public static class InPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.Collection<?> target;

        private InPredicate(java.util.Collection<?> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Collection r1 = (java.util.Collection) r1
                r0.target = r1
                return
        }

        public /* synthetic */ InPredicate(java.util.Collection r1, com.google.common.base.Predicates.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.base.ParametricNullness T r2) {
                r1 = this;
                java.util.Collection<?> r0 = r1.target     // Catch: java.lang.Throwable -> L7
                boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L7
                return r2
            L7:
                r2 = 0
                return r2
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Predicates.InPredicate
                if (r0 == 0) goto Lf
                com.google.common.base.Predicates$InPredicate r2 = (com.google.common.base.Predicates.InPredicate) r2
                java.util.Collection<?> r0 = r1.target
                java.util.Collection<?> r2 = r2.target
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.util.Collection<?> r0 = r1.target
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.util.Collection<?> r0 = r4.target
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 15
                java.lang.String r2 = "Predicates.in("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.GwtIncompatible
    public static class InstanceOfPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.Class<?> clazz;

        private InstanceOfPredicate(java.lang.Class<?> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.Class r1 = (java.lang.Class) r1
                r0.clazz = r1
                return
        }

        public /* synthetic */ InstanceOfPredicate(java.lang.Class r1, com.google.common.base.Predicates.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.base.ParametricNullness T r2) {
                r1 = this;
                java.lang.Class<?> r0 = r1.clazz
                boolean r2 = r0.isInstance(r2)
                return r2
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.google.common.base.Predicates.InstanceOfPredicate
                r1 = 0
                if (r0 == 0) goto Le
                com.google.common.base.Predicates$InstanceOfPredicate r3 = (com.google.common.base.Predicates.InstanceOfPredicate) r3
                java.lang.Class<?> r0 = r2.clazz
                java.lang.Class<?> r3 = r3.clazz
                if (r0 != r3) goto Le
                r1 = 1
            Le:
                return r1
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class<?> r0 = r1.clazz
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.Class<?> r0 = r4.clazz
                java.lang.String r0 = r0.getName()
                int r1 = r0.length()
                int r1 = r1 + 23
                java.lang.String r2 = "Predicates.instanceOf("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class IsEqualToPredicate implements com.google.common.base.Predicate<java.lang.Object>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.Object target;

        private IsEqualToPredicate(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.target = r1
                return
        }

        public /* synthetic */ IsEqualToPredicate(java.lang.Object r1, com.google.common.base.Predicates.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                java.lang.Object r0 = r1.target
                boolean r2 = r0.equals(r2)
                return r2
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Predicates.IsEqualToPredicate
                if (r0 == 0) goto Lf
                com.google.common.base.Predicates$IsEqualToPredicate r2 = (com.google.common.base.Predicates.IsEqualToPredicate) r2
                java.lang.Object r0 = r1.target
                java.lang.Object r2 = r2.target
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.Object r0 = r1.target
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.Object r0 = r4.target
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 20
                java.lang.String r2 = "Predicates.equalTo("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class NotPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.base.Predicate<T> predicate;

        public NotPredicate(com.google.common.base.Predicate<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Predicate r1 = (com.google.common.base.Predicate) r1
                r0.predicate = r1
                return
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.base.ParametricNullness T r2) {
                r1 = this;
                com.google.common.base.Predicate<T> r0 = r1.predicate
                boolean r2 = r0.apply(r2)
                r2 = r2 ^ 1
                return r2
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Predicates.NotPredicate
                if (r0 == 0) goto Lf
                com.google.common.base.Predicates$NotPredicate r2 = (com.google.common.base.Predicates.NotPredicate) r2
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
                int r0 = ~r0
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                com.google.common.base.Predicate<T> r0 = r4.predicate
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 16
                java.lang.String r2 = "Predicates.not("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    public static abstract enum ObjectPredicate extends java.lang.Enum<com.google.common.base.Predicates.ObjectPredicate> implements com.google.common.base.Predicate<java.lang.Object> {
        private static final /* synthetic */ com.google.common.base.Predicates.ObjectPredicate[] $VALUES = null;
        public static final com.google.common.base.Predicates.ObjectPredicate ALWAYS_FALSE = null;
        public static final com.google.common.base.Predicates.ObjectPredicate ALWAYS_TRUE = null;
        public static final com.google.common.base.Predicates.ObjectPredicate IS_NULL = null;
        public static final com.google.common.base.Predicates.ObjectPredicate NOT_NULL = null;





        private static /* synthetic */ com.google.common.base.Predicates.ObjectPredicate[] $values() {
                r0 = 4
                com.google.common.base.Predicates$ObjectPredicate[] r0 = new com.google.common.base.Predicates.ObjectPredicate[r0]
                com.google.common.base.Predicates$ObjectPredicate r1 = com.google.common.base.Predicates.ObjectPredicate.ALWAYS_TRUE
                r2 = 0
                r0[r2] = r1
                com.google.common.base.Predicates$ObjectPredicate r1 = com.google.common.base.Predicates.ObjectPredicate.ALWAYS_FALSE
                r2 = 1
                r0[r2] = r1
                com.google.common.base.Predicates$ObjectPredicate r1 = com.google.common.base.Predicates.ObjectPredicate.IS_NULL
                r2 = 2
                r0[r2] = r1
                com.google.common.base.Predicates$ObjectPredicate r1 = com.google.common.base.Predicates.ObjectPredicate.NOT_NULL
                r2 = 3
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.base.Predicates$ObjectPredicate$1 r0 = new com.google.common.base.Predicates$ObjectPredicate$1
                r0.<init>()
                com.google.common.base.Predicates.ObjectPredicate.ALWAYS_TRUE = r0
                com.google.common.base.Predicates$ObjectPredicate$2 r0 = new com.google.common.base.Predicates$ObjectPredicate$2
                r0.<init>()
                com.google.common.base.Predicates.ObjectPredicate.ALWAYS_FALSE = r0
                com.google.common.base.Predicates$ObjectPredicate$3 r0 = new com.google.common.base.Predicates$ObjectPredicate$3
                r0.<init>()
                com.google.common.base.Predicates.ObjectPredicate.IS_NULL = r0
                com.google.common.base.Predicates$ObjectPredicate$4 r0 = new com.google.common.base.Predicates$ObjectPredicate$4
                r0.<init>()
                com.google.common.base.Predicates.ObjectPredicate.NOT_NULL = r0
                com.google.common.base.Predicates$ObjectPredicate[] r0 = $values()
                com.google.common.base.Predicates.ObjectPredicate.$VALUES = r0
                return
        }

        private ObjectPredicate(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public /* synthetic */ ObjectPredicate(java.lang.String r1, int r2, com.google.common.base.Predicates.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.base.Predicates.ObjectPredicate valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.base.Predicates$ObjectPredicate> r0 = com.google.common.base.Predicates.ObjectPredicate.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.base.Predicates$ObjectPredicate r1 = (com.google.common.base.Predicates.ObjectPredicate) r1
                return r1
        }

        public static com.google.common.base.Predicates.ObjectPredicate[] values() {
                com.google.common.base.Predicates$ObjectPredicate[] r0 = com.google.common.base.Predicates.ObjectPredicate.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.base.Predicates$ObjectPredicate[] r0 = (com.google.common.base.Predicates.ObjectPredicate[]) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class OrPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.List<? extends com.google.common.base.Predicate<? super T>> components;

        private OrPredicate(java.util.List<? extends com.google.common.base.Predicate<? super T>> r1) {
                r0 = this;
                r0.<init>()
                r0.components = r1
                return
        }

        public /* synthetic */ OrPredicate(java.util.List r1, com.google.common.base.Predicates.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@com.google.common.base.ParametricNullness T r4) {
                r3 = this;
                r0 = 0
                r1 = 0
            L2:
                java.util.List<? extends com.google.common.base.Predicate<? super T>> r2 = r3.components
                int r2 = r2.size()
                if (r1 >= r2) goto L1d
                java.util.List<? extends com.google.common.base.Predicate<? super T>> r2 = r3.components
                java.lang.Object r2 = r2.get(r1)
                com.google.common.base.Predicate r2 = (com.google.common.base.Predicate) r2
                boolean r2 = r2.apply(r4)
                if (r2 == 0) goto L1a
                r4 = 1
                return r4
            L1a:
                int r1 = r1 + 1
                goto L2
            L1d:
                return r0
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Predicates.OrPredicate
                if (r0 == 0) goto Lf
                com.google.common.base.Predicates$OrPredicate r2 = (com.google.common.base.Predicates.OrPredicate) r2
                java.util.List<? extends com.google.common.base.Predicate<? super T>> r0 = r1.components
                java.util.List<? extends com.google.common.base.Predicate<? super T>> r2 = r2.components
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r2 = this;
                java.util.List<? extends com.google.common.base.Predicate<? super T>> r0 = r2.components
                int r0 = r0.hashCode()
                r1 = 87855567(0x53c91cf, float:8.866498E-36)
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.util.List<? extends com.google.common.base.Predicate<? super T>> r0 = r2.components
                java.lang.String r1 = "or"
                java.lang.String r0 = com.google.common.base.Predicates.access$800(r1, r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.GwtIncompatible
    public static class SubtypeOfPredicate implements com.google.common.base.Predicate<java.lang.Class<?>>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.Class<?> clazz;

        private SubtypeOfPredicate(java.lang.Class<?> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.lang.Class r1 = (java.lang.Class) r1
                r0.clazz = r1
                return
        }

        public /* synthetic */ SubtypeOfPredicate(java.lang.Class r1, com.google.common.base.Predicates.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
        public boolean apply2(java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<?> r0 = r1.clazz
                boolean r2 = r0.isAssignableFrom(r2)
                return r2
        }

        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Class<?> r1) {
                r0 = this;
                java.lang.Class r1 = (java.lang.Class) r1
                boolean r1 = r0.apply2(r1)
                return r1
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.google.common.base.Predicates.SubtypeOfPredicate
                r1 = 0
                if (r0 == 0) goto Le
                com.google.common.base.Predicates$SubtypeOfPredicate r3 = (com.google.common.base.Predicates.SubtypeOfPredicate) r3
                java.lang.Class<?> r0 = r2.clazz
                java.lang.Class<?> r3 = r3.clazz
                if (r0 != r3) goto Le
                r1 = 1
            Le:
                return r1
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class<?> r0 = r1.clazz
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.Class<?> r0 = r4.clazz
                java.lang.String r0 = r0.getName()
                int r1 = r0.length()
                int r1 = r1 + 22
                java.lang.String r2 = "Predicates.subtypeOf("
                java.lang.String r3 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r0, r3)
                return r0
        }
    }

    private Predicates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String access$800(java.lang.String r0, java.lang.Iterable r1) {
            java.lang.String r0 = toStringHelper(r0, r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <T> com.google.common.base.Predicate<T> alwaysFalse() {
            com.google.common.base.Predicates$ObjectPredicate r0 = com.google.common.base.Predicates.ObjectPredicate.ALWAYS_FALSE
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <T> com.google.common.base.Predicate<T> alwaysTrue() {
            com.google.common.base.Predicates$ObjectPredicate r0 = com.google.common.base.Predicates.ObjectPredicate.ALWAYS_TRUE
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T> r1, com.google.common.base.Predicate<? super T> r2) {
            com.google.common.base.Predicates$AndPredicate r0 = new com.google.common.base.Predicates$AndPredicate
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Predicate r1 = (com.google.common.base.Predicate) r1
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Predicate r2 = (com.google.common.base.Predicate) r2
            java.util.List r1 = asList(r1, r2)
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.google.common.base.Predicate<T> and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> r2) {
            com.google.common.base.Predicates$AndPredicate r0 = new com.google.common.base.Predicates$AndPredicate
            java.util.List r2 = defensiveCopy(r2)
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T>... r2) {
            com.google.common.base.Predicates$AndPredicate r0 = new com.google.common.base.Predicates$AndPredicate
            java.util.List r2 = defensiveCopy(r2)
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private static <T> java.util.List<com.google.common.base.Predicate<? super T>> asList(com.google.common.base.Predicate<? super T> r2, com.google.common.base.Predicate<? super T> r3) {
            r0 = 2
            com.google.common.base.Predicate[] r0 = new com.google.common.base.Predicate[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            java.util.List r2 = java.util.Arrays.asList(r0)
            return r2
    }

    public static <A, B> com.google.common.base.Predicate<A> compose(com.google.common.base.Predicate<B> r2, com.google.common.base.Function<A, ? extends B> r3) {
            com.google.common.base.Predicates$CompositionPredicate r0 = new com.google.common.base.Predicates$CompositionPredicate
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible("java.util.regex.Pattern")
    public static com.google.common.base.Predicate<java.lang.CharSequence> contains(java.util.regex.Pattern r2) {
            com.google.common.base.Predicates$ContainsPatternPredicate r0 = new com.google.common.base.Predicates$ContainsPatternPredicate
            com.google.common.base.JdkPattern r1 = new com.google.common.base.JdkPattern
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.base.Predicate<java.lang.CharSequence> containsPattern(java.lang.String r1) {
            com.google.common.base.Predicates$ContainsPatternFromStringPredicate r0 = new com.google.common.base.Predicates$ContainsPatternFromStringPredicate
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.List<T> defensiveCopy(java.lang.Iterable<T> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            r0.add(r1)
            goto L9
        L1b:
            return r0
    }

    private static <T> java.util.List<T> defensiveCopy(T... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = defensiveCopy(r0)
            return r0
    }

    public static <T> com.google.common.base.Predicate<T> equalTo(@com.google.common.base.ParametricNullness T r2) {
            if (r2 != 0) goto L7
            com.google.common.base.Predicate r2 = isNull()
            goto Le
        L7:
            com.google.common.base.Predicates$IsEqualToPredicate r0 = new com.google.common.base.Predicates$IsEqualToPredicate
            r1 = 0
            r0.<init>(r2, r1)
            r2 = r0
        Le:
            return r2
    }

    public static <T> com.google.common.base.Predicate<T> in(java.util.Collection<? extends T> r2) {
            com.google.common.base.Predicates$InPredicate r0 = new com.google.common.base.Predicates$InPredicate
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <T> com.google.common.base.Predicate<T> instanceOf(java.lang.Class<?> r2) {
            com.google.common.base.Predicates$InstanceOfPredicate r0 = new com.google.common.base.Predicates$InstanceOfPredicate
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <T> com.google.common.base.Predicate<T> isNull() {
            com.google.common.base.Predicates$ObjectPredicate r0 = com.google.common.base.Predicates.ObjectPredicate.IS_NULL
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public static <T> com.google.common.base.Predicate<T> not(com.google.common.base.Predicate<T> r1) {
            com.google.common.base.Predicates$NotPredicate r0 = new com.google.common.base.Predicates$NotPredicate
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <T> com.google.common.base.Predicate<T> notNull() {
            com.google.common.base.Predicates$ObjectPredicate r0 = com.google.common.base.Predicates.ObjectPredicate.NOT_NULL
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T> r1, com.google.common.base.Predicate<? super T> r2) {
            com.google.common.base.Predicates$OrPredicate r0 = new com.google.common.base.Predicates$OrPredicate
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Predicate r1 = (com.google.common.base.Predicate) r1
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Predicate r2 = (com.google.common.base.Predicate) r2
            java.util.List r1 = asList(r1, r2)
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.google.common.base.Predicate<T> or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> r2) {
            com.google.common.base.Predicates$OrPredicate r0 = new com.google.common.base.Predicates$OrPredicate
            java.util.List r2 = defensiveCopy(r2)
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T>... r2) {
            com.google.common.base.Predicates$OrPredicate r0 = new com.google.common.base.Predicates$OrPredicate
            java.util.List r2 = defensiveCopy(r2)
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static com.google.common.base.Predicate<java.lang.Class<?>> subtypeOf(java.lang.Class<?> r2) {
            com.google.common.base.Predicates$SubtypeOfPredicate r0 = new com.google.common.base.Predicates$SubtypeOfPredicate
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private static java.lang.String toStringHelper(java.lang.String r2, java.lang.Iterable<?> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Predicates."
            r0.<init>(r1)
            r0.append(r2)
            r2 = 40
            r0.append(r2)
            java.util.Iterator r2 = r3.iterator()
            r3 = 1
        L14:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r2.next()
            if (r3 != 0) goto L25
            r3 = 44
            r0.append(r3)
        L25:
            r0.append(r1)
            r3 = 0
            goto L14
        L2a:
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
