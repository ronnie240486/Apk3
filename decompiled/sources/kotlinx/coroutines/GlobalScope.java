package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/GlobalScope;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@kotlinx.coroutines.DelicateCoroutinesApi
public final class GlobalScope implements kotlinx.coroutines.CoroutineScope {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.GlobalScope INSTANCE = null;

    static {
            kotlinx.coroutines.GlobalScope r0 = new kotlinx.coroutines.GlobalScope
            r0.<init>()
            kotlinx.coroutines.GlobalScope.INSTANCE = r0
            return
    }

    private GlobalScope() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            return r0
    }
}
