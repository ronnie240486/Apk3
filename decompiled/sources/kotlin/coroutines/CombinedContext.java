package kotlin.coroutines;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0096\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", "size", "toString", "", "writeReplace", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CombinedContext implements kotlin.coroutines.CoroutineContext, java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.CoroutineContext.Element element;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.CoroutineContext left;

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Serialized implements java.io.Serializable {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.coroutines.CombinedContext.Serialized.Companion Companion = null;
        private static final long serialVersionUID = 0;

        @org.jetbrains.annotations.NotNull
        private final kotlin.coroutines.CoroutineContext[] elements;

        /* JADX INFO: compiled from: CoroutineContextImpl.kt */
        /* JADX INFO: loaded from: classes.dex */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                kotlin.coroutines.CombinedContext$Serialized$Companion r0 = new kotlin.coroutines.CombinedContext$Serialized$Companion
                r1 = 0
                r0.<init>(r1)
                kotlin.coroutines.CombinedContext.Serialized.Companion = r0
                return
        }

        public Serialized(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext[] r2) {
                r1 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.elements = r2
                return
        }

        private final java.lang.Object readResolve() {
                r5 = this;
                kotlin.coroutines.CoroutineContext[] r0 = r5.elements
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                int r2 = r0.length
                r3 = 0
            L6:
                if (r3 >= r2) goto L11
                r4 = r0[r3]
                kotlin.coroutines.CoroutineContext r1 = r1.plus(r4)
                int r3 = r3 + 1
                goto L6
            L11:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.CoroutineContext[] getElements() {
                r1 = this;
                kotlin.coroutines.CoroutineContext[] r0 = r1.elements
                return r0
        }
    }



    public CombinedContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Element r3) {
            r1 = this;
            java.lang.String r0 = "left"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.left = r2
            r1.element = r3
            return
    }

    private final boolean contains(kotlin.coroutines.CoroutineContext.Element r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext$Key r0 = r2.getKey()
            kotlin.coroutines.CoroutineContext$Element r0 = r1.get(r0)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            return r2
    }

    private final boolean containsAll(kotlin.coroutines.CombinedContext r2) {
            r1 = this;
        L0:
            kotlin.coroutines.CoroutineContext$Element r0 = r2.element
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            kotlin.coroutines.CoroutineContext r2 = r2.left
            boolean r0 = r2 instanceof kotlin.coroutines.CombinedContext
            if (r0 == 0) goto L13
            kotlin.coroutines.CombinedContext r2 = (kotlin.coroutines.CombinedContext) r2
            goto L0
        L13:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r0)
            kotlin.coroutines.CoroutineContext$Element r2 = (kotlin.coroutines.CoroutineContext.Element) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    private final int size() {
            r3 = this;
            r0 = 2
            r1 = r3
        L2:
            kotlin.coroutines.CoroutineContext r1 = r1.left
            boolean r2 = r1 instanceof kotlin.coroutines.CombinedContext
            if (r2 == 0) goto Lb
            kotlin.coroutines.CombinedContext r1 = (kotlin.coroutines.CombinedContext) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 != 0) goto Lf
            return r0
        Lf:
            int r0 = r0 + 1
            goto L2
    }

    private final java.lang.Object writeReplace() {
            r5 = this;
            int r0 = r5.size()
            kotlin.coroutines.CoroutineContext[] r1 = new kotlin.coroutines.CoroutineContext[r0]
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            kotlin.coroutines.CombinedContext$writeReplace$1 r4 = new kotlin.coroutines.CombinedContext$writeReplace$1
            r4.<init>(r1, r2)
            r5.fold(r3, r4)
            int r2 = r2.element
            if (r2 != r0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L24
            kotlin.coroutines.CombinedContext$Serialized r0 = new kotlin.coroutines.CombinedContext$Serialized
            r0.<init>(r1)
            return r0
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            if (r2 == r3) goto L1b
            boolean r0 = r3 instanceof kotlin.coroutines.CombinedContext
            if (r0 == 0) goto L19
            kotlin.coroutines.CombinedContext r3 = (kotlin.coroutines.CombinedContext) r3
            int r0 = r3.size()
            int r1 = r2.size()
            if (r0 != r1) goto L19
            boolean r3 = r3.containsAll(r2)
            if (r3 == 0) goto L19
            goto L1b
        L19:
            r3 = 0
            goto L1c
        L1b:
            r3 = 1
        L1c:
            return r3
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.coroutines.CoroutineContext r0 = r1.left
            java.lang.Object r2 = r0.fold(r2, r3)
            kotlin.coroutines.CoroutineContext$Element r0 = r1.element
            java.lang.Object r2 = r3.invoke(r2, r0)
            return r2
    }

    @Override // kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.Nullable
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
        L6:
            kotlin.coroutines.CoroutineContext$Element r1 = r0.element
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r3)
            if (r1 == 0) goto Lf
            return r1
        Lf:
            kotlin.coroutines.CoroutineContext r0 = r0.left
            boolean r1 = r0 instanceof kotlin.coroutines.CombinedContext
            if (r1 == 0) goto L18
            kotlin.coroutines.CombinedContext r0 = (kotlin.coroutines.CombinedContext) r0
            goto L6
        L18:
            kotlin.coroutines.CoroutineContext$Element r3 = r0.get(r3)
            return r3
    }

    public int hashCode() {
            r2 = this;
            kotlin.coroutines.CoroutineContext r0 = r2.left
            int r0 = r0.hashCode()
            kotlin.coroutines.CoroutineContext$Element r1 = r2.element
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.coroutines.CoroutineContext$Element r0 = r2.element
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r3)
            if (r0 == 0) goto L10
            kotlin.coroutines.CoroutineContext r3 = r2.left
            return r3
        L10:
            kotlin.coroutines.CoroutineContext r0 = r2.left
            kotlin.coroutines.CoroutineContext r3 = r0.minusKey(r3)
            kotlin.coroutines.CoroutineContext r0 = r2.left
            if (r3 != r0) goto L1c
            r3 = r2
            goto L2b
        L1c:
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r3 != r0) goto L23
            kotlin.coroutines.CoroutineContext$Element r3 = r2.element
            goto L2b
        L23:
            kotlin.coroutines.CombinedContext r0 = new kotlin.coroutines.CombinedContext
            kotlin.coroutines.CoroutineContext$Element r1 = r2.element
            r0.<init>(r3, r1)
            r3 = r0
        L2b:
            return r3
    }

    @Override // kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlin.coroutines.CoroutineContext.DefaultImpls.plus(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            kotlin.coroutines.CombinedContext$toString$1 r1 = kotlin.coroutines.CombinedContext.AnonymousClass1.INSTANCE
            java.lang.String r2 = ""
            java.lang.Object r1 = r3.fold(r2, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
