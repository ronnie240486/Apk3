package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlinx.coroutines.InternalCoroutinesApi
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "()V", "loadPriority", "", "getLoadPriority", "()I", "createDispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "allFactories", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MissingMainCoroutineDispatcherFactory implements kotlinx.coroutines.internal.MainDispatcherFactory {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.MissingMainCoroutineDispatcherFactory INSTANCE = null;

    static {
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcherFactory r0 = new kotlinx.coroutines.internal.MissingMainCoroutineDispatcherFactory
            r0.<init>()
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcherFactory.INSTANCE = r0
            return
    }

    private MissingMainCoroutineDispatcherFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.MainCoroutineDispatcher createDispatcher(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlinx.coroutines.internal.MainDispatcherFactory> r3) {
            r2 = this;
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r3 = new kotlinx.coroutines.internal.MissingMainCoroutineDispatcher
            r0 = 0
            r1 = 2
            r3.<init>(r0, r0, r1, r0)
            return r3
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    @org.jetbrains.annotations.Nullable
    public java.lang.String hintOnError() {
            r1 = this;
            java.lang.String r0 = kotlinx.coroutines.internal.MainDispatcherFactory.DefaultImpls.hintOnError(r1)
            return r0
    }
}
