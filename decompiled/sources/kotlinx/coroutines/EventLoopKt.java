package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0019\u0010\u0002\u001a\u00020\u00032\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\b\u001a\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"createEventLoop", "Lkotlinx/coroutines/EventLoop;", "platformAutoreleasePool", "", "block", "Lkotlin/Function0;", "processNextEventInCurrentThread", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class EventLoopKt {
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.EventLoop createEventLoop() {
            kotlinx.coroutines.BlockingEventLoop r0 = new kotlinx.coroutines.BlockingEventLoop
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.<init>(r1)
            return r0
    }

    public static final void platformAutoreleasePool(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r0) {
            r0.invoke()
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public static final long processNextEventInCurrentThread() {
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.currentOrNull$kotlinx_coroutines_core()
            if (r0 != 0) goto Le
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L12
        Le:
            long r0 = r0.processNextEvent()
        L12:
            return r0
    }
}
