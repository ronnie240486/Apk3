package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004/012B\u0007¢\u0006\u0004\b.\u0010\rJ\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\n\u0010\"\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(R$\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00063"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "enqueueImpl", "(Ljava/lang/Runnable;)Z", "dequeue", "()Ljava/lang/Runnable;", "", "closeQueue", "()V", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "shouldUnpark", "(Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;)Z", "", "now", "delayedTask", "", "scheduleImpl", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)I", "rescheduleAllDelayed", "shutdown", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "processNextEvent", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "enqueue", "(Ljava/lang/Runnable;)V", "schedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", "value", "isCompleted", "()Z", "setCompleted", "(Z)V", "<init>", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class EventLoopImplBase extends kotlinx.coroutines.EventLoopImplPlatform implements kotlinx.coroutines.Delay {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _delayed$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _queue$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _delayed;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ int _isCompleted;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _queue;

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class DelayedResumeTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cont;
        public final /* synthetic */ kotlinx.coroutines.EventLoopImplBase this$0;

        public DelayedResumeTask(kotlinx.coroutines.EventLoopImplBase r1, @org.jetbrains.annotations.NotNull long r2, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.cont = r4
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r3.cont
                kotlinx.coroutines.EventLoopImplBase r1 = r3.this$0
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                r0.resumeUndispatched(r1, r2)
                return
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = super.toString()
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r1 = r2.cont
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
                return r0
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "(JLjava/lang/Runnable;)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DelayedRunnableTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {

        @org.jetbrains.annotations.NotNull
        private final java.lang.Runnable block;

        public DelayedRunnableTask(long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3) {
                r0 = this;
                r0.<init>(r1)
                r0.block = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.Runnable r0 = r1.block
                r0.run()
                return
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = super.toString()
                java.lang.Runnable r1 = r2.block
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
                return r0
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u0007J\b\u0010$\u001a\u00020%H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "nanoTime", "", "(J)V", "_heap", "", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "dispose", "", "scheduleTask", "now", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class DelayedTask implements java.lang.Runnable, java.lang.Comparable<kotlinx.coroutines.EventLoopImplBase.DelayedTask>, kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.internal.ThreadSafeHeapNode {

        @org.jetbrains.annotations.Nullable
        private java.lang.Object _heap;
        private int index;

        @kotlin.jvm.JvmField
        public long nanoTime;

        public DelayedTask(long r1) {
                r0 = this;
                r0.<init>()
                r0.nanoTime = r1
                r1 = -1
                r0.index = r1
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(kotlinx.coroutines.EventLoopImplBase.DelayedTask r1) {
                r0 = this;
                kotlinx.coroutines.EventLoopImplBase$DelayedTask r1 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.EventLoopImplBase.DelayedTask r5) {
                r4 = this;
                long r0 = r4.nanoTime
                long r2 = r5.nanoTime
                long r0 = r0 - r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto Ld
                r5 = 1
                goto L12
            Ld:
                if (r5 >= 0) goto L11
                r5 = -1
                goto L12
            L11:
                r5 = 0
            L12:
                return r5
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final synchronized void dispose() {
                r2 = this;
                monitor-enter(r2)
                java.lang.Object r0 = r2._heap     // Catch: java.lang.Throwable -> L21
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L21
                if (r0 != r1) goto Lb
                monitor-exit(r2)
                return
            Lb:
                boolean r1 = r0 instanceof kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue     // Catch: java.lang.Throwable -> L21
                if (r1 == 0) goto L12
                kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0     // Catch: java.lang.Throwable -> L21
                goto L13
            L12:
                r0 = 0
            L13:
                if (r0 != 0) goto L16
                goto L19
            L16:
                r0.remove(r2)     // Catch: java.lang.Throwable -> L21
            L19:
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L21
                r2._heap = r0     // Catch: java.lang.Throwable -> L21
                monitor-exit(r2)
                return
            L21:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        @org.jetbrains.annotations.Nullable
        public kotlinx.coroutines.internal.ThreadSafeHeap<?> getHeap() {
                r2 = this;
                java.lang.Object r0 = r2._heap
                boolean r1 = r0 instanceof kotlinx.coroutines.internal.ThreadSafeHeap
                if (r1 == 0) goto L9
                kotlinx.coroutines.internal.ThreadSafeHeap r0 = (kotlinx.coroutines.internal.ThreadSafeHeap) r0
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        public final synchronized int scheduleTask(long r8, @org.jetbrains.annotations.NotNull kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue r10, @org.jetbrains.annotations.NotNull kotlinx.coroutines.EventLoopImplBase r11) {
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4d
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L4d
                if (r0 != r1) goto Lc
                r8 = 2
                monitor-exit(r7)
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4d
                kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r10.firstImpl()     // Catch: java.lang.Throwable -> L4a
                kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0     // Catch: java.lang.Throwable -> L4a
                boolean r11 = kotlinx.coroutines.EventLoopImplBase.access$isCompleted(r11)     // Catch: java.lang.Throwable -> L4a
                if (r11 == 0) goto L1d
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4d
                monitor-exit(r7)
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
                r10.timeNow = r8     // Catch: java.lang.Throwable -> L4a
                goto L38
            L24:
                long r3 = r0.nanoTime     // Catch: java.lang.Throwable -> L4a
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.timeNow     // Catch: java.lang.Throwable -> L4a
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L38
                r10.timeNow = r8     // Catch: java.lang.Throwable -> L4a
            L38:
                long r8 = r7.nanoTime     // Catch: java.lang.Throwable -> L4a
                long r3 = r10.timeNow     // Catch: java.lang.Throwable -> L4a
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L43
                r7.nanoTime = r3     // Catch: java.lang.Throwable -> L4a
            L43:
                r10.addImpl(r7)     // Catch: java.lang.Throwable -> L4a
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4d
                r8 = 0
                monitor-exit(r7)
                return r8
            L4a:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4d
                throw r8     // Catch: java.lang.Throwable -> L4d
            L4d:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(@org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.ThreadSafeHeap<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2._heap
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()
                if (r0 == r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L10
                r2._heap = r3
                return
            L10:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Failed requirement."
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int r1) {
                r0 = this;
                r0.index = r1
                return
        }

        public final boolean timeToExecute(long r4) {
                r3 = this;
                long r0 = r3.nanoTime
                long r4 = r4 - r0
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto Lb
                r4 = 1
                goto Lc
            Lb:
                r4 = 0
            Lc:
                return r4
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Delayed[nanos="
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                long r1 = r3.nanoTime
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", "", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DelayedTaskQueue extends kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.EventLoopImplBase.DelayedTask> {

        @kotlin.jvm.JvmField
        public long timeNow;

        public DelayedTaskQueue(long r1) {
                r0 = this;
                r0.<init>()
                r0.timeNow = r1
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<kotlinx.coroutines.EventLoopImplBase> r1 = kotlinx.coroutines.EventLoopImplBase.class
            java.lang.String r2 = "_queue"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.EventLoopImplBase._queue$FU = r2
            java.lang.String r2 = "_delayed"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.EventLoopImplBase._delayed$FU = r0
            return
    }

    public EventLoopImplBase() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._queue = r0
            r1._delayed = r0
            r0 = 0
            r1._isCompleted = r0
            return
    }

    public static final /* synthetic */ boolean access$isCompleted(kotlinx.coroutines.EventLoopImplBase r0) {
            boolean r0 = r0.isCompleted()
            return r0
    }

    private final void closeQueue() {
            r6 = this;
        L0:
            java.lang.Object r0 = r6._queue
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            r4 = 0
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
        Ld:
            boolean r0 = r3.compareAndSet(r6, r4, r5)
            if (r0 == 0) goto L15
            r1 = 1
            goto L1b
        L15:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto Ld
        L1b:
            if (r1 == 0) goto L0
            return
        L1e:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r3 == 0) goto L28
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            r0.close()
            return
        L28:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r3) goto L2f
            return
        L2f:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.addLast(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.EventLoopImplBase._queue$FU
        L3e:
            boolean r5 = r4.compareAndSet(r6, r0, r3)
            if (r5 == 0) goto L46
            r1 = 1
            goto L4c
        L46:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r0) goto L3e
        L4c:
            if (r1 == 0) goto L0
            return
    }

    private final java.lang.Runnable dequeue() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._queue
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r2 == 0) goto L2c
            r1 = r0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            java.lang.Object r2 = r1.removeFirstOrNull()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            if (r2 == r3) goto L18
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            return r2
        L18:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = r1.next()
        L1e:
            boolean r1 = r2.compareAndSet(r4, r0, r3)
            if (r1 == 0) goto L25
            goto L0
        L25:
            java.lang.Object r1 = r2.get(r4)
            if (r1 == r0) goto L1e
            goto L0
        L2c:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r2) goto L33
            return r1
        L33:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.EventLoopImplBase._queue$FU
        L35:
            boolean r3 = r2.compareAndSet(r4, r0, r1)
            if (r3 == 0) goto L3d
            r1 = 1
            goto L44
        L3d:
            java.lang.Object r3 = r2.get(r4)
            if (r3 == r0) goto L35
            r1 = 0
        L44:
            if (r1 == 0) goto L0
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            return r0
    }

    private final boolean enqueueImpl(java.lang.Runnable r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = r6._queue
            boolean r1 = r6.isCompleted()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            r1 = 1
            if (r0 != 0) goto L21
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            r4 = 0
        L10:
            boolean r0 = r3.compareAndSet(r6, r4, r7)
            if (r0 == 0) goto L18
            r2 = 1
            goto L1e
        L18:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L10
        L1e:
            if (r2 == 0) goto L0
            return r1
        L21:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r3 == 0) goto L4a
            r3 = r0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r3
            int r4 = r3.addLast(r7)
            if (r4 == 0) goto L49
            if (r4 == r1) goto L35
            r0 = 2
            if (r4 == r0) goto L34
            goto L0
        L34:
            return r2
        L35:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = r3.next()
        L3b:
            boolean r1 = r2.compareAndSet(r6, r0, r3)
            if (r1 == 0) goto L42
            goto L0
        L42:
            java.lang.Object r1 = r2.get(r6)
            if (r1 == r0) goto L3b
            goto L0
        L49:
            return r1
        L4a:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r3) goto L51
            return r2
        L51:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r4 = 8
            r3.<init>(r4, r1)
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.addLast(r4)
            r3.addLast(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.EventLoopImplBase._queue$FU
        L63:
            boolean r5 = r4.compareAndSet(r6, r0, r3)
            if (r5 == 0) goto L6b
            r2 = 1
            goto L71
        L6b:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r0) goto L63
        L71:
            if (r2 == 0) goto L0
            return r1
    }

    private final boolean isCompleted() {
            r1 = this;
            int r0 = r1._isCompleted
            return r0
    }

    private final void rescheduleAllDelayed() {
            r4 = this;
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            r1 = 0
            if (r0 != 0) goto L9
            r0 = r1
            goto L11
        L9:
            long r2 = r0.nanoTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
        L11:
            if (r0 != 0) goto L18
            long r2 = java.lang.System.nanoTime()
            goto L1c
        L18:
            long r2 = r0.longValue()
        L1c:
            java.lang.Object r0 = r4._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 != 0) goto L24
            r0 = r1
            goto L2a
        L24:
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r0.removeFirstOrNull()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0
        L2a:
            if (r0 != 0) goto L2d
            return
        L2d:
            r4.reschedule(r2, r0)
            goto L1c
    }

    private final int scheduleImpl(long r5, kotlinx.coroutines.EventLoopImplBase.DelayedTask r7) {
            r4 = this;
            boolean r0 = r4.isCompleted()
            if (r0 == 0) goto L8
            r5 = 1
            return r5
        L8:
            java.lang.Object r0 = r4._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 != 0) goto L2a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.EventLoopImplBase._delayed$FU
            r2 = 0
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r3 = new kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue
            r3.<init>(r5)
        L16:
            boolean r0 = r1.compareAndSet(r4, r2, r3)
            if (r0 == 0) goto L1d
            goto L23
        L1d:
            java.lang.Object r0 = r1.get(r4)
            if (r0 == 0) goto L16
        L23:
            java.lang.Object r0 = r4._delayed
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
        L2a:
            int r5 = r7.scheduleTask(r5, r0, r4)
            return r5
    }

    private final void setCompleted(boolean r1) {
            r0 = this;
            r0._isCompleted = r1
            return
    }

    private final boolean shouldUnpark(kotlinx.coroutines.EventLoopImplBase.DelayedTask r2) {
            r1 = this;
            java.lang.Object r0 = r1._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r0.peek()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0
        Le:
            if (r0 != r2) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @org.jetbrains.annotations.Nullable
    public java.lang.Object delay(long r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.Delay.DefaultImpls.delay(r0, r1, r3)
            return r1
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo1866dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            r0.enqueue(r2)
            return
    }

    public void enqueue(@org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.enqueueImpl(r2)
            if (r0 == 0) goto La
            r1.unpark()
            goto Lf
        La:
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r0.enqueue(r2)
        Lf:
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r4) {
            r0 = this;
            kotlinx.coroutines.DisposableHandle r1 = kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(r0, r1, r3, r4)
            return r1
    }

    public final boolean isEmpty() {
            r3 = this;
            boolean r0 = r3.isUnconfinedQueueEmpty()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r3._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L15
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15
            return r1
        L15:
            java.lang.Object r0 = r3._queue
            if (r0 != 0) goto L1a
            goto L2b
        L1a:
            boolean r2 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r2 == 0) goto L25
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r1 = r0.isEmpty()
            goto L2c
        L25:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r2) goto L2c
        L2b:
            r1 = 1
        L2c:
            return r1
    }

    @Override // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
            r9 = this;
            boolean r0 = r9.processUnconfinedEvent()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            r3 = 0
            if (r0 == 0) goto L5b
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L5b
            kotlinx.coroutines.AbstractTimeSource r4 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r4 != 0) goto L1e
            r4 = r3
            goto L26
        L1e:
            long r4 = r4.nanoTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L26:
            if (r4 != 0) goto L2d
            long r4 = java.lang.System.nanoTime()
            goto L31
        L2d:
            long r4 = r4.longValue()
        L31:
            monitor-enter(r0)
            kotlinx.coroutines.internal.ThreadSafeHeapNode r6 = r0.firstImpl()     // Catch: java.lang.Throwable -> L58
            if (r6 != 0) goto L3b
            monitor-exit(r0)
            r6 = r3
            goto L53
        L3b:
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r6 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r6     // Catch: java.lang.Throwable -> L58
            boolean r7 = r6.timeToExecute(r4)     // Catch: java.lang.Throwable -> L58
            r8 = 0
            if (r7 == 0) goto L49
            boolean r6 = r9.enqueueImpl(r6)     // Catch: java.lang.Throwable -> L58
            goto L4a
        L49:
            r6 = 0
        L4a:
            if (r6 == 0) goto L51
            kotlinx.coroutines.internal.ThreadSafeHeapNode r6 = r0.removeAtImpl(r8)     // Catch: java.lang.Throwable -> L58
            goto L52
        L51:
            r6 = r3
        L52:
            monitor-exit(r0)
        L53:
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r6 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r6
            if (r6 != 0) goto L31
            goto L5b
        L58:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L5b:
            java.lang.Runnable r0 = r9.dequeue()
            if (r0 == 0) goto L65
            r0.run()
            return r1
        L65:
            long r4 = super.getNextTime()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L6e
            goto Lbf
        L6e:
            java.lang.Object r0 = r9._queue
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L78
            goto L85
        L78:
            boolean r6 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r6 == 0) goto Lb8
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L85
            goto Lbf
        L85:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 != 0) goto L8d
            r0 = r3
            goto L93
        L8d:
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r0.peek()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0
        L93:
            if (r0 != 0) goto L96
            goto Lbe
        L96:
            long r4 = r0.nanoTime
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L9f
            goto La7
        L9f:
            long r6 = r0.nanoTime()
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
        La7:
            if (r3 != 0) goto Lae
            long r6 = java.lang.System.nanoTime()
            goto Lb2
        Lae:
            long r6 = r3.longValue()
        Lb2:
            long r4 = r4 - r6
            long r1 = kotlin.ranges.RangesKt.coerceAtLeast(r4, r1)
            goto Lbf
        Lb8:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r3) goto Lbf
        Lbe:
            r1 = r4
        Lbf:
            return r1
    }

    public final void resetAll() {
            r1 = this;
            r0 = 0
            r1._queue = r0
            r1._delayed = r0
            return
    }

    public final void schedule(long r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.EventLoopImplBase.DelayedTask r5) {
            r2 = this;
            int r0 = r2.scheduleImpl(r3, r5)
            if (r0 == 0) goto L1e
            r1 = 1
            if (r0 == r1) goto L1a
            r3 = 2
            if (r0 != r3) goto Ld
            goto L27
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "unexpected result"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L1a:
            r2.reschedule(r3, r5)
            goto L27
        L1e:
            boolean r3 = r2.shouldUnpark(r5)
            if (r3 == 0) goto L27
            r2.unpark()
        L27:
            return
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo1867scheduleResumeAfterDelay(long r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r6) {
            r3 = this;
            long r4 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r4)
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L34
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L15
            r0 = 0
            goto L1d
        L15:
            long r0 = r0.nanoTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L1d:
            if (r0 != 0) goto L24
            long r0 = java.lang.System.nanoTime()
            goto L28
        L24:
            long r0 = r0.longValue()
        L28:
            kotlinx.coroutines.EventLoopImplBase$DelayedResumeTask r2 = new kotlinx.coroutines.EventLoopImplBase$DelayedResumeTask
            long r4 = r4 + r0
            r2.<init>(r3, r4, r6)
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r6, r2)
            r3.schedule(r0, r2)
        L34:
            return
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
            r5 = this;
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            r0.resetEventLoop$kotlinx_coroutines_core()
            r0 = 1
            r5.setCompleted(r0)
            r5.closeQueue()
        Lc:
            long r0 = r5.processNextEvent()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L17
            goto Lc
        L17:
            r5.rescheduleAllDelayed()
            return
    }
}
