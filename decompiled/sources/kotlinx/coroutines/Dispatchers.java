package kotlinx.coroutines;

/* JADX INFO: compiled from: Dispatchers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/Dispatchers;", "", "()V", "Default", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault$annotations", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "IO", "getIO$annotations", "getIO", "Main", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "getMain$annotations", "getMain", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "Unconfined", "getUnconfined$annotations", "getUnconfined", "shutdown", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Dispatchers {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.CoroutineDispatcher Default = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.Dispatchers INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.CoroutineDispatcher IO = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.CoroutineDispatcher Unconfined = null;

    static {
            kotlinx.coroutines.Dispatchers r0 = new kotlinx.coroutines.Dispatchers
            r0.<init>()
            kotlinx.coroutines.Dispatchers.INSTANCE = r0
            kotlinx.coroutines.scheduling.DefaultScheduler r0 = kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE
            kotlinx.coroutines.Dispatchers.Default = r0
            kotlinx.coroutines.Unconfined r0 = kotlinx.coroutines.Unconfined.INSTANCE
            kotlinx.coroutines.Dispatchers.Unconfined = r0
            kotlinx.coroutines.scheduling.DefaultIoScheduler r0 = kotlinx.coroutines.scheduling.DefaultIoScheduler.INSTANCE
            kotlinx.coroutines.Dispatchers.IO = r0
            return
    }

    private Dispatchers() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CoroutineDispatcher getDefault() {
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.Default
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getDefault$annotations() {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CoroutineDispatcher getIO() {
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.IO
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getIO$annotations() {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.MainCoroutineDispatcher getMain() {
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.internal.MainDispatcherLoader.dispatcher
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getMain$annotations() {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CoroutineDispatcher getUnconfined() {
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.Unconfined
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getUnconfined$annotations() {
            return
    }

    @kotlinx.coroutines.DelicateCoroutinesApi
    public final void shutdown() {
            r1 = this;
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r0.shutdown()
            kotlinx.coroutines.scheduling.DefaultScheduler r0 = kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE
            r0.shutdown$kotlinx_coroutines_core()
            return
    }
}
