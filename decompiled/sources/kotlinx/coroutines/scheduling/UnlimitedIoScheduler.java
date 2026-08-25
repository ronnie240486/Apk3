package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J\u001c\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0017¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/scheduling/UnlimitedIoScheduler;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class UnlimitedIoScheduler extends kotlinx.coroutines.CoroutineDispatcher {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.scheduling.UnlimitedIoScheduler INSTANCE = null;

    static {
            kotlinx.coroutines.scheduling.UnlimitedIoScheduler r0 = new kotlinx.coroutines.scheduling.UnlimitedIoScheduler
            r0.<init>()
            kotlinx.coroutines.scheduling.UnlimitedIoScheduler.INSTANCE = r0
            return
    }

    private UnlimitedIoScheduler() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1866dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, @org.jetbrains.annotations.NotNull java.lang.Runnable r4) {
            r2 = this;
            kotlinx.coroutines.scheduling.DefaultScheduler r3 = kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE
            kotlinx.coroutines.scheduling.TaskContext r0 = kotlinx.coroutines.scheduling.TasksKt.BlockingContext
            r1 = 0
            r3.dispatchWithContext$kotlinx_coroutines_core(r4, r0, r1)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @kotlinx.coroutines.InternalCoroutinesApi
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, @org.jetbrains.annotations.NotNull java.lang.Runnable r4) {
            r2 = this;
            kotlinx.coroutines.scheduling.DefaultScheduler r3 = kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE
            kotlinx.coroutines.scheduling.TaskContext r0 = kotlinx.coroutines.scheduling.TasksKt.BlockingContext
            r1 = 1
            r3.dispatchWithContext$kotlinx_coroutines_core(r4, r0, r1)
            return
    }
}
