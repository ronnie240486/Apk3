package kotlin.coroutines;

/* JADX INFO: compiled from: ContinuationInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\bH&J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "releaseInterceptedContinuation", "", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ContinuationInterceptor extends kotlin.coroutines.CoroutineContext.Element {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.coroutines.ContinuationInterceptor.Key Key = null;

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(@org.jetbrains.annotations.NotNull kotlin.coroutines.ContinuationInterceptor r1, R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
                java.lang.String r0 = "operation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.Object r1 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(r1, r2, r3)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.ContinuationInterceptor r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r3) {
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = r3 instanceof kotlin.coroutines.AbstractCoroutineContextKey
                r1 = 0
                if (r0 == 0) goto L20
                kotlin.coroutines.AbstractCoroutineContextKey r3 = (kotlin.coroutines.AbstractCoroutineContextKey) r3
                kotlin.coroutines.CoroutineContext$Key r0 = r2.getKey()
                boolean r0 = r3.isSubKey$kotlin_stdlib(r0)
                if (r0 == 0) goto L1f
                kotlin.coroutines.CoroutineContext$Element r2 = r3.tryCast$kotlin_stdlib(r2)
                boolean r3 = r2 instanceof kotlin.coroutines.CoroutineContext.Element
                if (r3 == 0) goto L1f
                r1 = r2
            L1f:
                return r1
            L20:
                kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
                if (r0 != r3) goto L2a
                java.lang.String r3 = "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
                goto L2b
            L2a:
                r2 = r1
            L2b:
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.ContinuationInterceptor r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r2) {
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                boolean r0 = r2 instanceof kotlin.coroutines.AbstractCoroutineContextKey
                if (r0 == 0) goto L1e
                kotlin.coroutines.AbstractCoroutineContextKey r2 = (kotlin.coroutines.AbstractCoroutineContextKey) r2
                kotlin.coroutines.CoroutineContext$Key r0 = r1.getKey()
                boolean r0 = r2.isSubKey$kotlin_stdlib(r0)
                if (r0 == 0) goto L1d
                kotlin.coroutines.CoroutineContext$Element r2 = r2.tryCast$kotlin_stdlib(r1)
                if (r2 == 0) goto L1d
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            L1d:
                return r1
            L1e:
                kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
                if (r0 != r2) goto L24
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            L24:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.ContinuationInterceptor r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2) {
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.coroutines.CoroutineContext r1 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(r1, r2)
                return r1
        }

        public static void releaseInterceptedContinuation(@org.jetbrains.annotations.NotNull kotlin.coroutines.ContinuationInterceptor r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r1) {
                java.lang.String r0 = "continuation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                return
        }
    }

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key<kotlin.coroutines.ContinuationInterceptor> {
        public static final /* synthetic */ kotlin.coroutines.ContinuationInterceptor.Key $$INSTANCE = null;

        static {
                kotlin.coroutines.ContinuationInterceptor$Key r0 = new kotlin.coroutines.ContinuationInterceptor$Key
                r0.<init>()
                kotlin.coroutines.ContinuationInterceptor.Key.$$INSTANCE = r0
                return
        }

        private Key() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key.$$INSTANCE
            kotlin.coroutines.ContinuationInterceptor.Key = r0
            return
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.Nullable
    <E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r1);

    @org.jetbrains.annotations.NotNull
    <T> kotlin.coroutines.Continuation<T> interceptContinuation(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r1);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.NotNull
    kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r1);

    void releaseInterceptedContinuation(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r1);
}
