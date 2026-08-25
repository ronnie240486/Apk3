package kotlin.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CoroutineContext {

    /* JADX INFO: compiled from: CoroutineContext.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2) {
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                if (r2 != r0) goto La
                goto L12
            La:
                kotlin.coroutines.CoroutineContext$plus$1 r0 = kotlin.coroutines.CoroutineContext.AnonymousClass1.INSTANCE
                java.lang.Object r1 = r2.fold(r1, r0)
                kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            L12:
                return r1
        }
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Element extends kotlin.coroutines.CoroutineContext {

        /* JADX INFO: compiled from: CoroutineContext.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class DefaultImpls {
            public static <R> R fold(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Element r1, R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
                    java.lang.String r0 = "operation"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    java.lang.Object r1 = r3.invoke(r2, r1)
                    return r1
            }

            @org.jetbrains.annotations.Nullable
            public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Element r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r2) {
                    java.lang.String r0 = "key"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    kotlin.coroutines.CoroutineContext$Key r0 = r1.getKey()
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L15
                    java.lang.String r2 = "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get"
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                    goto L16
                L15:
                    r1 = 0
                L16:
                    return r1
            }

            @org.jetbrains.annotations.NotNull
            public static kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Element r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r2) {
                    java.lang.String r0 = "key"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    kotlin.coroutines.CoroutineContext$Key r0 = r1.getKey()
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L11
                    kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                L11:
                    return r1
            }

            @org.jetbrains.annotations.NotNull
            public static kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Element r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2) {
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    kotlin.coroutines.CoroutineContext r1 = kotlin.coroutines.CoroutineContext.DefaultImpls.plus(r1, r2)
                    return r1
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        <R> R fold(R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2);

        @Override // kotlin.coroutines.CoroutineContext
        @org.jetbrains.annotations.Nullable
        <E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r1);

        @org.jetbrains.annotations.NotNull
        kotlin.coroutines.CoroutineContext.Key<?> getKey();

        @Override // kotlin.coroutines.CoroutineContext
        @org.jetbrains.annotations.NotNull
        kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r1);
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Key<E extends kotlin.coroutines.CoroutineContext.Element> {
    }


    <R> R fold(R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2);

    @org.jetbrains.annotations.Nullable
    <E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r1);

    @org.jetbrains.annotations.NotNull
    kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r1);

    @org.jetbrains.annotations.NotNull
    kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1);
}
