package kotlinx.coroutines;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\b\u0003\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001*\u0010\b\u0007\u0010\u0007\"\u00020\u00042\u00020\u0004B\u0002\b\b¨\u0006\t"}, d2 = {"asCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "from", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/ExecutorService;", "asExecutor", "CloseableCoroutineDispatcher", "Lkotlinx/coroutines/ExperimentalCoroutinesApi;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ExecutorsKt {
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public static /* synthetic */ void CloseableCoroutineDispatcher$annotations() {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.Executor asExecutor(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineDispatcher r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.ExecutorCoroutineDispatcher
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r2
            kotlinx.coroutines.ExecutorCoroutineDispatcher r0 = (kotlinx.coroutines.ExecutorCoroutineDispatcher) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto Ld
            goto L11
        Ld:
            java.util.concurrent.Executor r1 = r0.getExecutor()
        L11:
            if (r1 != 0) goto L18
            kotlinx.coroutines.DispatcherExecutor r1 = new kotlinx.coroutines.DispatcherExecutor
            r1.<init>(r2)
        L18:
            return r1
    }

    @kotlin.jvm.JvmName(name = "from")
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CoroutineDispatcher from(@org.jetbrains.annotations.NotNull java.util.concurrent.Executor r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.DispatcherExecutor
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r2
            kotlinx.coroutines.DispatcherExecutor r0 = (kotlinx.coroutines.DispatcherExecutor) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            kotlinx.coroutines.CoroutineDispatcher r1 = r0.dispatcher
        Lf:
            if (r1 != 0) goto L16
            kotlinx.coroutines.ExecutorCoroutineDispatcherImpl r1 = new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl
            r1.<init>(r2)
        L16:
            return r1
    }

    @kotlin.jvm.JvmName(name = "from")
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher from(@org.jetbrains.annotations.NotNull java.util.concurrent.ExecutorService r1) {
            kotlinx.coroutines.ExecutorCoroutineDispatcherImpl r0 = new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl
            r0.<init>(r1)
            return r0
    }
}
