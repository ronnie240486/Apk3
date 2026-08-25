package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0010R\u0014\u0010\u0003\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/ThreadLocalEventLoop;", "", "()V", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "getEventLoop$kotlinx_coroutines_core", "()Lkotlinx/coroutines/EventLoop;", "ref", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "currentOrNull", "currentOrNull$kotlinx_coroutines_core", "resetEventLoop", "", "resetEventLoop$kotlinx_coroutines_core", "setEventLoop", "setEventLoop$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ThreadLocalEventLoop {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.ThreadLocalEventLoop INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.ThreadLocal<kotlinx.coroutines.EventLoop> ref = null;

    static {
            kotlinx.coroutines.ThreadLocalEventLoop r0 = new kotlinx.coroutines.ThreadLocalEventLoop
            r0.<init>()
            kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            kotlinx.coroutines.ThreadLocalEventLoop.ref = r0
            return
    }

    private ThreadLocalEventLoop() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.EventLoop currentOrNull$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.ThreadLocal<kotlinx.coroutines.EventLoop> r0 = kotlinx.coroutines.ThreadLocalEventLoop.ref
            java.lang.Object r0 = r0.get()
            kotlinx.coroutines.EventLoop r0 = (kotlinx.coroutines.EventLoop) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.EventLoop getEventLoop$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.ThreadLocal<kotlinx.coroutines.EventLoop> r0 = kotlinx.coroutines.ThreadLocalEventLoop.ref
            java.lang.Object r1 = r0.get()
            kotlinx.coroutines.EventLoop r1 = (kotlinx.coroutines.EventLoop) r1
            if (r1 != 0) goto L11
            kotlinx.coroutines.EventLoop r1 = kotlinx.coroutines.EventLoopKt.createEventLoop()
            r0.set(r1)
        L11:
            return r1
    }

    public final void resetEventLoop$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.ThreadLocal<kotlinx.coroutines.EventLoop> r0 = kotlinx.coroutines.ThreadLocalEventLoop.ref
            r1 = 0
            r0.set(r1)
            return
    }

    public final void setEventLoop$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull kotlinx.coroutines.EventLoop r2) {
            r1 = this;
            java.lang.ThreadLocal<kotlinx.coroutines.EventLoop> r0 = kotlinx.coroutines.ThreadLocalEventLoop.ref
            r0.set(r2)
            return
    }
}
