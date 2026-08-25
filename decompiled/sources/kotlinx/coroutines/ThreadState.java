package kotlinx.coroutines;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\u001bj\u0002`\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0007R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/ThreadState;", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lkotlinx/coroutines/Job;)V", "", "clearInterrupt", "()V", "", "state", "", "invalidState", "(I)Ljava/lang/Void;", "", "cause", "invoke", "(Ljava/lang/Throwable;)V", "setup", "Lkotlinx/coroutines/DisposableHandle;", "cancelHandle", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Job;", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "targetThread", "Ljava/lang/Thread;", "kotlinx-coroutines-core", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ThreadState implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _state$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ int _state;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.DisposableHandle cancelHandle;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.Job job;
    private final java.lang.Thread targetThread;

    static {
            java.lang.Class<kotlinx.coroutines.ThreadState> r0 = kotlinx.coroutines.ThreadState.class
            java.lang.String r1 = "_state"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.ThreadState._state$FU = r0
            return
    }

    public ThreadState(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r1) {
            r0 = this;
            r0.<init>()
            r0.job = r1
            r1 = 0
            r0._state = r1
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.targetThread = r1
            return
    }

    private final java.lang.Void invalidState(int r3) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "Illegal state "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public final void clearInterrupt() {
            r3 = this;
        L0:
            int r0 = r3._state
            if (r0 == 0) goto L17
            r1 = 2
            if (r0 == r1) goto L0
            r1 = 3
            if (r0 != r1) goto Le
            java.lang.Thread.interrupted()
            return
        Le:
            r3.invalidState(r0)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.ThreadState._state$FU
            r2 = 1
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L0
            kotlinx.coroutines.DisposableHandle r0 = r3.cancelHandle
            if (r0 != 0) goto L25
            goto L28
        L25:
            r0.dispose()
        L28:
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.invoke2(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
            r3 = this;
        L0:
            int r4 = r3._state
            r0 = 3
            r1 = 2
            if (r4 == 0) goto L18
            r2 = 1
            if (r4 == r2) goto L17
            if (r4 == r1) goto L17
            if (r4 != r0) goto Le
            goto L17
        Le:
            r3.invalidState(r4)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L17:
            return
        L18:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.ThreadState._state$FU
            boolean r4 = r2.compareAndSet(r3, r4, r1)
            if (r4 == 0) goto L0
            java.lang.Thread r4 = r3.targetThread
            r4.interrupt()
            r3._state = r0
            return
    }

    public final void setup() {
            r3 = this;
            kotlinx.coroutines.Job r0 = r3.job
            r1 = 1
            kotlinx.coroutines.DisposableHandle r0 = r0.invokeOnCompletion(r1, r1, r3)
            r3.cancelHandle = r0
        L9:
            int r0 = r3._state
            if (r0 == 0) goto L1e
            r1 = 2
            if (r0 == r1) goto L1d
            r1 = 3
            if (r0 != r1) goto L14
            goto L1d
        L14:
            r3.invalidState(r0)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L1d:
            return
        L1e:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.ThreadState._state$FU
            r2 = 0
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L9
            return
    }
}
