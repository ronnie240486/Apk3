package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/EventLoop;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class EventLoopImplPlatform extends kotlinx.coroutines.EventLoop {
    public EventLoopImplPlatform() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.Thread getThread();

    public void reschedule(long r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.EventLoopImplBase.DelayedTask r4) {
            r1 = this;
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r0.schedule(r2, r4)
            return
    }

    public final void unpark() {
            r2 = this;
            java.lang.Thread r0 = r2.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r1 == r0) goto L1c
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r1 != 0) goto L12
            r1 = 0
            goto L17
        L12:
            r1.unpark(r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L17:
            if (r1 != 0) goto L1c
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L1c:
            return
    }
}
