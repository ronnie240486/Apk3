package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class Converter<A, B> implements com.google.common.base.Function<A, B> {
    private final boolean handleNullAutomatically;

    @com.google.j2objc.annotations.RetainedWith
    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.base.Converter<B, A> reverse;


    public static final class ConverterComposition<A, B, C> extends com.google.common.base.Converter<A, C> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.base.Converter<A, B> first;
        public final com.google.common.base.Converter<B, C> second;

        public ConverterComposition(com.google.common.base.Converter<A, B> r1, com.google.common.base.Converter<B, C> r2) {
                r0 = this;
                r0.<init>()
                r0.first = r1
                r0.second = r2
                return
        }

        @Override // com.google.common.base.Converter
        @javax.annotation.CheckForNull
        public final A correctedDoBackward(@javax.annotation.CheckForNull C r3) {
                r2 = this;
                com.google.common.base.Converter<A, B> r0 = r2.first
                com.google.common.base.Converter<B, C> r1 = r2.second
                java.lang.Object r3 = r1.correctedDoBackward(r3)
                java.lang.Object r3 = r0.correctedDoBackward(r3)
                return r3
        }

        @Override // com.google.common.base.Converter
        @javax.annotation.CheckForNull
        public final C correctedDoForward(@javax.annotation.CheckForNull A r3) {
                r2 = this;
                com.google.common.base.Converter<B, C> r0 = r2.second
                com.google.common.base.Converter<A, B> r1 = r2.first
                java.lang.Object r3 = r1.correctedDoForward(r3)
                java.lang.Object r3 = r0.correctedDoForward(r3)
                return r3
        }

        @Override // com.google.common.base.Converter
        public final A doBackward(C r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.base.Converter
        public final C doForward(A r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.Converter.ConverterComposition
                r1 = 0
                if (r0 == 0) goto L1c
                com.google.common.base.Converter$ConverterComposition r4 = (com.google.common.base.Converter.ConverterComposition) r4
                com.google.common.base.Converter<A, B> r0 = r3.first
                com.google.common.base.Converter<A, B> r2 = r4.first
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1c
                com.google.common.base.Converter<B, C> r0 = r3.second
                com.google.common.base.Converter<B, C> r4 = r4.second
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
        }

        public int hashCode() {
                r2 = this;
                com.google.common.base.Converter<A, B> r0 = r2.first
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                com.google.common.base.Converter<B, C> r1 = r2.second
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r5 = this;
                com.google.common.base.Converter<A, B> r0 = r5.first
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.google.common.base.Converter<B, C> r1 = r5.second
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 10
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = ".andThen("
                java.lang.String r4 = ")"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1, r4)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class FunctionBasedConverter<A, B> extends com.google.common.base.Converter<A, B> implements java.io.Serializable {
        private final com.google.common.base.Function<? super B, ? extends A> backwardFunction;
        private final com.google.common.base.Function<? super A, ? extends B> forwardFunction;

        private FunctionBasedConverter(com.google.common.base.Function<? super A, ? extends B> r1, com.google.common.base.Function<? super B, ? extends A> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.forwardFunction = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.backwardFunction = r1
                return
        }

        public /* synthetic */ FunctionBasedConverter(com.google.common.base.Function r1, com.google.common.base.Function r2, com.google.common.base.Converter.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.base.Converter
        public final A doBackward(B r2) {
                r1 = this;
                com.google.common.base.Function<? super B, ? extends A> r0 = r1.backwardFunction
                java.lang.Object r2 = r0.apply(r2)
                return r2
        }

        @Override // com.google.common.base.Converter
        public final B doForward(A r2) {
                r1 = this;
                com.google.common.base.Function<? super A, ? extends B> r0 = r1.forwardFunction
                java.lang.Object r2 = r0.apply(r2)
                return r2
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.base.Converter.FunctionBasedConverter
                r1 = 0
                if (r0 == 0) goto L1c
                com.google.common.base.Converter$FunctionBasedConverter r4 = (com.google.common.base.Converter.FunctionBasedConverter) r4
                com.google.common.base.Function<? super A, ? extends B> r0 = r3.forwardFunction
                com.google.common.base.Function<? super A, ? extends B> r2 = r4.forwardFunction
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1c
                com.google.common.base.Function<? super B, ? extends A> r0 = r3.backwardFunction
                com.google.common.base.Function<? super B, ? extends A> r4 = r4.backwardFunction
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
        }

        public int hashCode() {
                r2 = this;
                com.google.common.base.Function<? super A, ? extends B> r0 = r2.forwardFunction
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                com.google.common.base.Function<? super B, ? extends A> r1 = r2.backwardFunction
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r5 = this;
                com.google.common.base.Function<? super A, ? extends B> r0 = r5.forwardFunction
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.google.common.base.Function<? super B, ? extends A> r1 = r5.backwardFunction
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r0.length()
                int r2 = r2 + 18
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.String r2 = "Converter.from("
                java.lang.String r4 = ", "
                java.lang.StringBuilder r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m1624m(r3, r2, r0, r4, r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static final class IdentityConverter<T> extends com.google.common.base.Converter<T, T> implements java.io.Serializable {
        public static final com.google.common.base.Converter.IdentityConverter<?> INSTANCE = null;
        private static final long serialVersionUID = 0;

        static {
                com.google.common.base.Converter$IdentityConverter r0 = new com.google.common.base.Converter$IdentityConverter
                r0.<init>()
                com.google.common.base.Converter.IdentityConverter.INSTANCE = r0
                return
        }

        private IdentityConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                com.google.common.base.Converter$IdentityConverter<?> r0 = com.google.common.base.Converter.IdentityConverter.INSTANCE
                return r0
        }

        @Override // com.google.common.base.Converter
        public final <S> com.google.common.base.Converter<T, S> doAndThen(com.google.common.base.Converter<T, S> r2) {
                r1 = this;
                java.lang.String r0 = "otherConverter"
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2, r0)
                com.google.common.base.Converter r2 = (com.google.common.base.Converter) r2
                return r2
        }

        @Override // com.google.common.base.Converter
        public final T doBackward(T r1) {
                r0 = this;
                return r1
        }

        @Override // com.google.common.base.Converter
        public final T doForward(T r1) {
                r0 = this;
                return r1
        }

        @Override // com.google.common.base.Converter
        public com.google.common.base.Converter.IdentityConverter<T> reverse() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ com.google.common.base.Converter reverse() {
                r1 = this;
                com.google.common.base.Converter$IdentityConverter r0 = r1.reverse()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Converter.identity()"
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ReverseConverter<A, B> extends com.google.common.base.Converter<B, A> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final com.google.common.base.Converter<A, B> original;

        public ReverseConverter(com.google.common.base.Converter<A, B> r1) {
                r0 = this;
                r0.<init>()
                r0.original = r1
                return
        }

        @Override // com.google.common.base.Converter
        @javax.annotation.CheckForNull
        public final B correctedDoBackward(@javax.annotation.CheckForNull A r2) {
                r1 = this;
                com.google.common.base.Converter<A, B> r0 = r1.original
                java.lang.Object r2 = r0.correctedDoForward(r2)
                return r2
        }

        @Override // com.google.common.base.Converter
        @javax.annotation.CheckForNull
        public final A correctedDoForward(@javax.annotation.CheckForNull B r2) {
                r1 = this;
                com.google.common.base.Converter<A, B> r0 = r1.original
                java.lang.Object r2 = r0.correctedDoBackward(r2)
                return r2
        }

        @Override // com.google.common.base.Converter
        public final B doBackward(A r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.base.Converter
        public final A doForward(B r1) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.common.base.Converter.ReverseConverter
                if (r0 == 0) goto Lf
                com.google.common.base.Converter$ReverseConverter r2 = (com.google.common.base.Converter.ReverseConverter) r2
                com.google.common.base.Converter<A, B> r0 = r1.original
                com.google.common.base.Converter<A, B> r2 = r2.original
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.google.common.base.Converter<A, B> r0 = r1.original
                int r0 = r0.hashCode()
                int r0 = ~r0
                return r0
        }

        @Override // com.google.common.base.Converter
        public com.google.common.base.Converter<A, B> reverse() {
                r1 = this;
                com.google.common.base.Converter<A, B> r0 = r1.original
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                com.google.common.base.Converter<A, B> r0 = r3.original
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                int r1 = r1 + 10
                java.lang.String r2 = ".reverse()"
                java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r0, r2)
                return r0
        }
    }

    public Converter() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.handleNullAutomatically = r0
            return
    }

    public static <A, B> com.google.common.base.Converter<A, B> from(com.google.common.base.Function<? super A, ? extends B> r2, com.google.common.base.Function<? super B, ? extends A> r3) {
            com.google.common.base.Converter$FunctionBasedConverter r0 = new com.google.common.base.Converter$FunctionBasedConverter
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static <T> com.google.common.base.Converter<T, T> identity() {
            com.google.common.base.Converter$IdentityConverter<?> r0 = com.google.common.base.Converter.IdentityConverter.INSTANCE
            return r0
    }

    @javax.annotation.CheckForNull
    private A unsafeDoBackward(@javax.annotation.CheckForNull B r1) {
            r0 = this;
            java.lang.Object r1 = r0.doBackward(r1)
            return r1
    }

    @javax.annotation.CheckForNull
    private B unsafeDoForward(@javax.annotation.CheckForNull A r1) {
            r0 = this;
            java.lang.Object r1 = r0.doForward(r1)
            return r1
    }

    public final <C> com.google.common.base.Converter<A, C> andThen(com.google.common.base.Converter<B, C> r1) {
            r0 = this;
            com.google.common.base.Converter r1 = r0.doAndThen(r1)
            return r1
    }

    @Override // com.google.common.base.Function
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final B apply(@javax.annotation.CheckForNull A r1) {
            r0 = this;
            java.lang.Object r1 = r0.convert(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public final B convert(@javax.annotation.CheckForNull A r1) {
            r0 = this;
            java.lang.Object r1 = r0.correctedDoForward(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.lang.Iterable<B> convertAll(java.lang.Iterable<? extends A> r2) {
            r1 = this;
            java.lang.String r0 = "fromIterable"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.base.Converter$1 r0 = new com.google.common.base.Converter$1
            r0.<init>(r1, r2)
            return r0
    }

    @javax.annotation.CheckForNull
    public A correctedDoBackward(@javax.annotation.CheckForNull B r2) {
            r1 = this;
            boolean r0 = r1.handleNullAutomatically
            if (r0 == 0) goto L11
            if (r2 != 0) goto L8
            r2 = 0
            goto L10
        L8:
            java.lang.Object r2 = r1.doBackward(r2)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
        L10:
            return r2
        L11:
            java.lang.Object r2 = r1.unsafeDoBackward(r2)
            return r2
    }

    @javax.annotation.CheckForNull
    public B correctedDoForward(@javax.annotation.CheckForNull A r2) {
            r1 = this;
            boolean r0 = r1.handleNullAutomatically
            if (r0 == 0) goto L11
            if (r2 != 0) goto L8
            r2 = 0
            goto L10
        L8:
            java.lang.Object r2 = r1.doForward(r2)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
        L10:
            return r2
        L11:
            java.lang.Object r2 = r1.unsafeDoForward(r2)
            return r2
    }

    public <C> com.google.common.base.Converter<A, C> doAndThen(com.google.common.base.Converter<B, C> r2) {
            r1 = this;
            com.google.common.base.Converter$ConverterComposition r0 = new com.google.common.base.Converter$ConverterComposition
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Converter r2 = (com.google.common.base.Converter) r2
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.errorprone.annotations.ForOverride
    public abstract A doBackward(B r1);

    @com.google.errorprone.annotations.ForOverride
    public abstract B doForward(A r1);

    @Override // com.google.common.base.Function
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.base.Converter<B, A> reverse() {
            r1 = this;
            com.google.common.base.Converter<B, A> r0 = r1.reverse
            if (r0 != 0) goto Lb
            com.google.common.base.Converter$ReverseConverter r0 = new com.google.common.base.Converter$ReverseConverter
            r0.<init>(r1)
            r1.reverse = r0
        Lb:
            return r0
    }
}
