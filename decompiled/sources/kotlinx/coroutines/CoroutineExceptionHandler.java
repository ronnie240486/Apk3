package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext$Element;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface CoroutineExceptionHandler extends kotlin.coroutines.CoroutineContext.Element {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CoroutineExceptionHandler.Key Key = null;

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineExceptionHandler r0, R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2) {
                java.lang.Object r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(r0, r1, r2)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineExceptionHandler r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r1) {
                kotlin.coroutines.CoroutineContext$Element r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineExceptionHandler r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r1) {
                kotlin.coroutines.CoroutineContext r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineExceptionHandler r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
                kotlin.coroutines.CoroutineContext r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(r0, r1)
                return r0
        }
    }

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.CoroutineExceptionHandler> {
        public static final /* synthetic */ kotlinx.coroutines.CoroutineExceptionHandler.Key $$INSTANCE = null;

        static {
                kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = new kotlinx.coroutines.CoroutineExceptionHandler$Key
                r0.<init>()
                kotlinx.coroutines.CoroutineExceptionHandler.Key.$$INSTANCE = r0
                return
        }

        private Key() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = kotlinx.coroutines.CoroutineExceptionHandler.Key.$$INSTANCE
            kotlinx.coroutines.CoroutineExceptionHandler.Key = r0
            return
    }

    void handleException(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2);
}
