package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/BlockingEventLoop;", "Lkotlinx/coroutines/EventLoopImplBase;", "thread", "Ljava/lang/Thread;", "(Ljava/lang/Thread;)V", "getThread", "()Ljava/lang/Thread;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BlockingEventLoop extends kotlinx.coroutines.EventLoopImplBase {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Thread thread;

    public BlockingEventLoop(@org.jetbrains.annotations.NotNull java.lang.Thread r1) {
            r0 = this;
            r0.<init>()
            r0.thread = r1
            return
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    @org.jetbrains.annotations.NotNull
    public final java.lang.Thread getThread() {
            r1 = this;
            java.lang.Thread r0 = r1.thread
            return r0
    }
}
