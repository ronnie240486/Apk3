package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001cB\u001f\u0012\u0006\u0010G\u001a\u00020\u0016\u0012\u0006\u0010I\u001a\u00020\u0016\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\ba\u0010bJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\u000eH\u0002J\u001b\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J3\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u0014H\u0002¢\u0006\u0004\b/\u00100J!\u00104\u001a\u0002032\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0096@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u0010\nJ\u001b\u00107\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u001cJ\u000f\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b8\u00109J%\u0010>\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0006\u0010;\u001a\u00020\u000eH\u0000¢\u0006\u0004\b<\u0010=J\b\u0010?\u001a\u00020\fH\u0016J&\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u00162\u0006\u0010D\u001a\u00020CH\u0016R\u0014\u0010G\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010JR \u0010K\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0016\u0010P\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010HR\u0016\u0010Q\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010HR\u0014\u0010S\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u00109R\u0014\u0010V\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0014\u0010Z\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u00109R\u0014\u0010\\\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u00109R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006d"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "value", "", "tryEmitLocked", "(Ljava/lang/Object;)Z", "tryEmitNoCollectorsLocked", "", "dropOldestLocked", "", "newHead", "correctCollectorIndexesOnDropOldest", "", "item", "enqueueLocked", "", "curBuffer", "", "curSize", "newSize", "growBuffer", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "emitSuspend", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "emitter", "cancelEmitter", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateBufferLocked", "cleanupTailLocked", "slot", "tryTakeValue", "tryPeekLocked", "index", "getPeekedValueLockedAt", "awaitValue", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "resumesIn", "findSlotsToResumeLocked", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEmit", "emit", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "()J", "updateNewCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateCollectorIndexLocked", "resetReplayCache", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "fuse", "replay", "I", "bufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "buffer", "[Ljava/lang/Object;", "replayIndex", "J", "minCollectorIndex", "bufferSize", "queueSize", "getHead", "head", "getReplaySize", "()I", "replaySize", "getTotalSize", "totalSize", "getBufferEndIndex", "bufferEndIndex", "getQueueEndIndex", "queueEndIndex", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class SharedFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.SharedFlowSlot> implements kotlinx.coroutines.flow.MutableSharedFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {

    @org.jetbrains.annotations.Nullable
    private java.lang.Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    /* JADX INFO: compiled from: SharedFlow.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "index", "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Emitter implements kotlinx.coroutines.DisposableHandle {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> cont;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.flow.SharedFlowImpl<?> flow;

        @kotlin.jvm.JvmField
        public long index;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object value;

        public Emitter(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharedFlowImpl<?> r1, long r2, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r0 = this;
                r0.<init>()
                r0.flow = r1
                r0.index = r2
                r0.value = r4
                r0.cont = r5
                return
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
                r1 = this;
                kotlinx.coroutines.flow.SharedFlowImpl<?> r0 = r1.flow
                kotlinx.coroutines.flow.SharedFlowImpl.access$cancelEmitter(r0, r1)
                return
        }
    }

    /* JADX INFO: compiled from: SharedFlow.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.channels.BufferOverflow[] r0 = kotlinx.coroutines.channels.BufferOverflow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                kotlinx.coroutines.flow.SharedFlowImpl.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedFlow.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {373, 380, 383}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public kotlinx.coroutines.flow.SharedFlowImpl L$0;
        public kotlinx.coroutines.flow.FlowCollector L$1;
        public kotlinx.coroutines.flow.SharedFlowSlot L$2;
        public kotlinx.coroutines.Job L$3;
        public int label;
        public /* synthetic */ java.lang.Object result;
        public final /* synthetic */ kotlinx.coroutines.flow.SharedFlowImpl<T> this$0;

        public AnonymousClass1(kotlinx.coroutines.flow.SharedFlowImpl<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                kotlinx.coroutines.flow.SharedFlowImpl<T> r2 = r1.this$0
                r0 = 0
                java.lang.Object r2 = kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(r2, r0, r1)
                return r2
        }
    }

    public SharedFlowImpl(int r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            r0.<init>()
            r0.replay = r1
            r0.bufferCapacity = r2
            r0.onBufferOverflow = r3
            return
    }

    public static final /* synthetic */ java.lang.Object access$awaitValue(kotlinx.coroutines.flow.SharedFlowImpl r0, kotlinx.coroutines.flow.SharedFlowSlot r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.awaitValue(r1, r2)
            return r0
    }

    public static final /* synthetic */ void access$cancelEmitter(kotlinx.coroutines.flow.SharedFlowImpl r0, kotlinx.coroutines.flow.SharedFlowImpl.Emitter r1) {
            r0.cancelEmitter(r1)
            return
    }

    public static final /* synthetic */ java.lang.Object access$emitSuspend(kotlinx.coroutines.flow.SharedFlowImpl r0, java.lang.Object r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.emitSuspend(r1, r2)
            return r0
    }

    public static final /* synthetic */ void access$enqueueLocked(kotlinx.coroutines.flow.SharedFlowImpl r0, java.lang.Object r1) {
            r0.enqueueLocked(r1)
            return
    }

    public static final /* synthetic */ kotlin.coroutines.Continuation[] access$findSlotsToResumeLocked(kotlinx.coroutines.flow.SharedFlowImpl r0, kotlin.coroutines.Continuation[] r1) {
            kotlin.coroutines.Continuation[] r0 = r0.findSlotsToResumeLocked(r1)
            return r0
    }

    public static final /* synthetic */ int access$getBufferCapacity$p(kotlinx.coroutines.flow.SharedFlowImpl r0) {
            int r0 = r0.bufferCapacity
            return r0
    }

    public static final /* synthetic */ long access$getHead(kotlinx.coroutines.flow.SharedFlowImpl r2) {
            long r0 = r2.getHead()
            return r0
    }

    public static final /* synthetic */ int access$getQueueSize$p(kotlinx.coroutines.flow.SharedFlowImpl r0) {
            int r0 = r0.queueSize
            return r0
    }

    public static final /* synthetic */ int access$getTotalSize(kotlinx.coroutines.flow.SharedFlowImpl r0) {
            int r0 = r0.getTotalSize()
            return r0
    }

    public static final /* synthetic */ void access$setQueueSize$p(kotlinx.coroutines.flow.SharedFlowImpl r0, int r1) {
            r0.queueSize = r1
            return
    }

    public static final /* synthetic */ boolean access$tryEmitLocked(kotlinx.coroutines.flow.SharedFlowImpl r0, java.lang.Object r1) {
            boolean r0 = r0.tryEmitLocked(r1)
            return r0
    }

    public static final /* synthetic */ long access$tryPeekLocked(kotlinx.coroutines.flow.SharedFlowImpl r0, kotlinx.coroutines.flow.SharedFlowSlot r1) {
            long r0 = r0.tryPeekLocked(r1)
            return r0
    }

    private final java.lang.Object awaitValue(kotlinx.coroutines.flow.SharedFlowSlot r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            r6 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r8)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            monitor-enter(r6)
            long r1 = access$tryPeekLocked(r6, r7)     // Catch: java.lang.Throwable -> L3e
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1b
            r7.cont = r0     // Catch: java.lang.Throwable -> L3e
            goto L26
        L1b:
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3e
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r7 = kotlin.Result.m333constructorimpl(r7)     // Catch: java.lang.Throwable -> L3e
            r0.resumeWith(r7)     // Catch: java.lang.Throwable -> L3e
        L26:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L36
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r8)
        L36:
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r8) goto L3d
            return r0
        L3d:
            return r7
        L3e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    private final void cancelEmitter(kotlinx.coroutines.flow.SharedFlowImpl.Emitter r6) {
            r5 = this;
            monitor-enter(r5)
            long r0 = r6.index     // Catch: java.lang.Throwable -> L2a
            long r2 = r5.getHead()     // Catch: java.lang.Throwable -> L2a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Ld
            monitor-exit(r5)
            return
        Ld:
            java.lang.Object[] r0 = r5.buffer     // Catch: java.lang.Throwable -> L2a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L2a
            long r1 = r6.index     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 == r6) goto L1c
            monitor-exit(r5)
            return
        L1c:
            long r1 = r6.index     // Catch: java.lang.Throwable -> L2a
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE     // Catch: java.lang.Throwable -> L2a
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r0, r1, r6)     // Catch: java.lang.Throwable -> L2a
            r5.cleanupTailLocked()     // Catch: java.lang.Throwable -> L2a
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r5)
            return
        L2a:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    private final void cleanupTailLocked() {
            r5 = this;
            int r0 = r5.bufferCapacity
            if (r0 != 0) goto La
            int r0 = r5.queueSize
            r1 = 1
            if (r0 > r1) goto La
            return
        La:
            java.lang.Object[] r0 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
        Lf:
            int r1 = r5.queueSize
            if (r1 <= 0) goto L3d
            long r1 = r5.getHead()
            int r3 = r5.getTotalSize()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            java.lang.Object r1 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r1)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            if (r1 != r2) goto L3d
            int r1 = r5.queueSize
            int r1 = r1 + (-1)
            r5.queueSize = r1
            long r1 = r5.getHead()
            int r3 = r5.getTotalSize()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 0
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r0, r1, r3)
            goto Lf
        L3d:
            return
    }

    public static /* synthetic */ java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl r8, kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L58
            if (r2 == r5) goto L46
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            goto L34
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlinx.coroutines.Job r8 = r0.L$3
            kotlinx.coroutines.flow.SharedFlowSlot r9 = r0.L$2
            kotlinx.coroutines.flow.FlowCollector r2 = r0.L$1
            kotlinx.coroutines.flow.SharedFlowImpl r5 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L40
            goto L8b
        L40:
            r8 = move-exception
        L41:
            r10 = r9
            r9 = r8
            r8 = r5
            goto Lbf
        L46:
            kotlinx.coroutines.flow.SharedFlowSlot r9 = r0.L$2
            kotlinx.coroutines.flow.FlowCollector r8 = r0.L$1
            kotlinx.coroutines.flow.SharedFlowImpl r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L52
            r10 = r8
            r8 = r2
            goto L7c
        L52:
            r8 = move-exception
            r10 = r9
            r9 = r8
            r8 = r2
            goto Lbf
        L58:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r10 = r8.allocateSlot()
            kotlinx.coroutines.flow.SharedFlowSlot r10 = (kotlinx.coroutines.flow.SharedFlowSlot) r10
            boolean r2 = r9 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L79
            r2 = r9
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch: java.lang.Throwable -> L77
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L77
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L77
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L77
            r0.label = r5     // Catch: java.lang.Throwable -> L77
            java.lang.Object r2 = r2.onSubscription(r0)     // Catch: java.lang.Throwable -> L77
            if (r2 != r1) goto L79
            return r1
        L77:
            r9 = move-exception
            goto Lbf
        L79:
            r7 = r10
            r10 = r9
            r9 = r7
        L7c:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lbb
            kotlinx.coroutines.Job$Key r5 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> Lbb
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lbb
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2     // Catch: java.lang.Throwable -> Lbb
            r5 = r8
            r8 = r2
            r2 = r10
        L8b:
            java.lang.Object r10 = r5.tryTakeValue(r9)     // Catch: java.lang.Throwable -> L40
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE     // Catch: java.lang.Throwable -> L40
            if (r10 == r6) goto Laa
            if (r8 != 0) goto L96
            goto L99
        L96:
            kotlinx.coroutines.JobKt.ensureActive(r8)     // Catch: java.lang.Throwable -> L40
        L99:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L40
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L40
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L40
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L40
            r0.label = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L40
            if (r10 != r1) goto L8b
            return r1
        Laa:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L40
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L40
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L40
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L40
            r0.label = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r10 = r5.awaitValue(r9, r0)     // Catch: java.lang.Throwable -> L40
            if (r10 != r1) goto L8b
            return r1
        Lbb:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L41
        Lbf:
            r8.freeSlot(r10)
            throw r9
    }

    private final void correctCollectorIndexesOnDropOldest(long r10) {
            r9 = this;
            int r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(r9)
            if (r0 != 0) goto L7
            goto L29
        L7:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(r9)
            if (r0 != 0) goto Le
            goto L29
        Le:
            r1 = 0
            int r2 = r0.length
        L10:
            if (r1 >= r2) goto L29
            r3 = r0[r1]
            int r1 = r1 + 1
            if (r3 == 0) goto L10
            kotlinx.coroutines.flow.SharedFlowSlot r3 = (kotlinx.coroutines.flow.SharedFlowSlot) r3
            long r4 = r3.index
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L10
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 >= 0) goto L10
            r3.index = r10
            goto L10
        L29:
            r9.minCollectorIndex = r10
            return
    }

    private final void dropOldestLocked() {
            r5 = this;
            java.lang.Object[] r0 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            long r1 = r5.getHead()
            r3 = 0
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r0, r1, r3)
            int r0 = r5.bufferSize
            int r0 = r0 + (-1)
            r5.bufferSize = r0
            long r0 = r5.getHead()
            r2 = 1
            long r0 = r0 + r2
            long r2 = r5.replayIndex
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L22
            r5.replayIndex = r0
        L22:
            long r2 = r5.minCollectorIndex
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L2b
            r5.correctCollectorIndexesOnDropOldest(r0)
        L2b:
            return
    }

    private final java.lang.Object emitSuspend(T r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
            r10 = this;
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r12)
            r7 = 1
            r6.<init>(r0, r7)
            r6.initCancellability()
            kotlin.coroutines.Continuation<kotlin.Unit>[] r8 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            monitor-enter(r10)
            boolean r0 = access$tryEmitLocked(r10, r11)     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L27
            kotlin.Result$Companion r11 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L86
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L86
            java.lang.Object r11 = kotlin.Result.m333constructorimpl(r11)     // Catch: java.lang.Throwable -> L86
            r6.resumeWith(r11)     // Catch: java.lang.Throwable -> L86
            kotlin.coroutines.Continuation[] r11 = access$findSlotsToResumeLocked(r10, r8)     // Catch: java.lang.Throwable -> L86
            r0 = 0
            goto L51
        L27:
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r9 = new kotlinx.coroutines.flow.SharedFlowImpl$Emitter     // Catch: java.lang.Throwable -> L86
            long r0 = access$getHead(r10)     // Catch: java.lang.Throwable -> L86
            int r2 = access$getTotalSize(r10)     // Catch: java.lang.Throwable -> L86
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L86
            long r2 = r2 + r0
            r0 = r9
            r1 = r10
            r4 = r11
            r5 = r6
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L86
            access$enqueueLocked(r10, r9)     // Catch: java.lang.Throwable -> L86
            int r11 = access$getQueueSize$p(r10)     // Catch: java.lang.Throwable -> L86
            int r11 = r11 + r7
            access$setQueueSize$p(r10, r11)     // Catch: java.lang.Throwable -> L86
            int r11 = access$getBufferCapacity$p(r10)     // Catch: java.lang.Throwable -> L86
            if (r11 != 0) goto L4f
            kotlin.coroutines.Continuation[] r8 = access$findSlotsToResumeLocked(r10, r8)     // Catch: java.lang.Throwable -> L86
        L4f:
            r11 = r8
            r0 = r9
        L51:
            monitor-exit(r10)
            if (r0 != 0) goto L55
            goto L58
        L55:
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r6, r0)
        L58:
            r0 = 0
            int r1 = r11.length
        L5a:
            if (r0 >= r1) goto L6f
            r2 = r11[r0]
            int r0 = r0 + 1
            if (r2 != 0) goto L63
            goto L5a
        L63:
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            r2.resumeWith(r3)
            goto L5a
        L6f:
            java.lang.Object r11 = r6.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r0) goto L7c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r12)
        L7c:
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r12) goto L83
            return r11
        L83:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L86:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }

    private final void enqueueLocked(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.getTotalSize()
            java.lang.Object[] r1 = r6.buffer
            r2 = 2
            if (r1 != 0) goto L10
            r1 = 0
            r3 = 0
            java.lang.Object[] r1 = r6.growBuffer(r1, r3, r2)
            goto L1a
        L10:
            int r3 = r1.length
            if (r0 < r3) goto L1a
            int r3 = r1.length
            int r3 = r3 * 2
            java.lang.Object[] r1 = r6.growBuffer(r1, r0, r3)
        L1a:
            long r2 = r6.getHead()
            long r4 = (long) r0
            long r2 = r2 + r4
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r1, r2, r7)
            return
    }

    private final kotlin.coroutines.Continuation<kotlin.Unit>[] findSlotsToResumeLocked(kotlin.coroutines.Continuation<kotlin.Unit>[] r12) {
            r11 = this;
            int r0 = r12.length
            int r1 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(r11)
            if (r1 != 0) goto L8
            goto L4b
        L8:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r1 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(r11)
            if (r1 != 0) goto Lf
            goto L4b
        Lf:
            r2 = 0
            int r3 = r1.length
        L11:
            if (r2 >= r3) goto L4b
            r4 = r1[r2]
            int r2 = r2 + 1
            if (r4 == 0) goto L11
            kotlinx.coroutines.flow.SharedFlowSlot r4 = (kotlinx.coroutines.flow.SharedFlowSlot) r4
            kotlin.coroutines.Continuation<? super kotlin.Unit> r5 = r4.cont
            if (r5 != 0) goto L20
            goto L11
        L20:
            long r6 = r11.tryPeekLocked(r4)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L2b
            goto L11
        L2b:
            int r6 = r12.length
            if (r0 < r6) goto L3f
            int r6 = r12.length
            r7 = 2
            int r6 = r6 * 2
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r6)
        L3f:
            r6 = r12
            kotlin.coroutines.Continuation[] r6 = (kotlin.coroutines.Continuation[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.cont = r0
            r0 = r7
            goto L11
        L4b:
            kotlin.coroutines.Continuation[] r12 = (kotlin.coroutines.Continuation[]) r12
            return r12
    }

    private final long getBufferEndIndex() {
            r4 = this;
            long r0 = r4.getHead()
            int r2 = r4.bufferSize
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    private final long getHead() {
            r4 = this;
            long r0 = r4.minCollectorIndex
            long r2 = r4.replayIndex
            long r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    private final java.lang.Object getPeekedValueLockedAt(long r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.Object r2 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r2)
            boolean r3 = r2 instanceof kotlinx.coroutines.flow.SharedFlowImpl.Emitter
            if (r3 == 0) goto L11
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r2 = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) r2
            java.lang.Object r2 = r2.value
        L11:
            return r2
    }

    private final long getQueueEndIndex() {
            r4 = this;
            long r0 = r4.getHead()
            int r2 = r4.bufferSize
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = r4.queueSize
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    private final int getReplaySize() {
            r4 = this;
            long r0 = r4.getHead()
            int r2 = r4.bufferSize
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = r4.replayIndex
            long r0 = r0 - r2
            int r1 = (int) r0
            return r1
    }

    private final int getTotalSize() {
            r2 = this;
            int r0 = r2.bufferSize
            int r1 = r2.queueSize
            int r0 = r0 + r1
            return r0
    }

    private final java.lang.Object[] growBuffer(java.lang.Object[] r7, int r8, int r9) {
            r6 = this;
            r0 = 0
            if (r9 <= 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            if (r1 == 0) goto L23
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r6.buffer = r9
            if (r7 != 0) goto Lf
            return r9
        Lf:
            long r1 = r6.getHead()
        L13:
            if (r0 >= r8) goto L22
            int r3 = r0 + 1
            long r4 = (long) r0
            long r4 = r4 + r1
            java.lang.Object r0 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r7, r4)
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r9, r4, r0)
            r0 = r3
            goto L13
        L22:
            return r9
        L23:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Buffer size overflow"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    private final boolean tryEmitLocked(T r15) {
            r14 = this;
            int r0 = r14.getNCollectors()
            if (r0 != 0) goto Lb
            boolean r15 = r14.tryEmitNoCollectorsLocked(r15)
            return r15
        Lb:
            int r0 = r14.bufferSize
            int r1 = r14.bufferCapacity
            r2 = 1
            if (r0 < r1) goto L2d
            long r0 = r14.minCollectorIndex
            long r3 = r14.replayIndex
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L2d
            kotlinx.coroutines.channels.BufferOverflow r0 = r14.onBufferOverflow
            int[] r1 = kotlinx.coroutines.flow.SharedFlowImpl.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L2b
            r1 = 2
            if (r0 == r1) goto L2a
            goto L2d
        L2a:
            return r2
        L2b:
            r15 = 0
            return r15
        L2d:
            r14.enqueueLocked(r15)
            int r15 = r14.bufferSize
            int r15 = r15 + r2
            r14.bufferSize = r15
            int r0 = r14.bufferCapacity
            if (r15 <= r0) goto L3c
            r14.dropOldestLocked()
        L3c:
            int r15 = r14.getReplaySize()
            int r0 = r14.replay
            if (r15 <= r0) goto L58
            long r0 = r14.replayIndex
            r3 = 1
            long r6 = r0 + r3
            long r8 = r14.minCollectorIndex
            long r10 = r14.getBufferEndIndex()
            long r12 = r14.getQueueEndIndex()
            r5 = r14
            r5.updateBufferLocked(r6, r8, r10, r12)
        L58:
            return r2
    }

    private final boolean tryEmitNoCollectorsLocked(T r7) {
            r6 = this;
            int r0 = r6.replay
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            r6.enqueueLocked(r7)
            int r7 = r6.bufferSize
            int r7 = r7 + r1
            r6.bufferSize = r7
            int r0 = r6.replay
            if (r7 <= r0) goto L15
            r6.dropOldestLocked()
        L15:
            long r2 = r6.getHead()
            int r7 = r6.bufferSize
            long r4 = (long) r7
            long r2 = r2 + r4
            r6.minCollectorIndex = r2
            return r1
    }

    private final long tryPeekLocked(kotlinx.coroutines.flow.SharedFlowSlot r7) {
            r6 = this;
            long r0 = r7.index
            long r2 = r6.getBufferEndIndex()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto Lb
            return r0
        Lb:
            int r7 = r6.bufferCapacity
            r2 = -1
            if (r7 <= 0) goto L12
            return r2
        L12:
            long r4 = r6.getHead()
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L1b
            return r2
        L1b:
            int r7 = r6.queueSize
            if (r7 != 0) goto L20
            return r2
        L20:
            return r0
    }

    private final java.lang.Object tryTakeValue(kotlinx.coroutines.flow.SharedFlowSlot r9) {
            r8 = this;
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            monitor-enter(r8)
            long r1 = r8.tryPeekLocked(r9)     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L10
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE     // Catch: java.lang.Throwable -> L3b
            goto L22
        L10:
            long r3 = r9.index     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r0 = r8.getPeekedValueLockedAt(r1)     // Catch: java.lang.Throwable -> L3b
            r5 = 1
            long r1 = r1 + r5
            r9.index = r1     // Catch: java.lang.Throwable -> L3b
            kotlin.coroutines.Continuation[] r9 = r8.updateCollectorIndexLocked$kotlinx_coroutines_core(r3)     // Catch: java.lang.Throwable -> L3b
            r7 = r0
            r0 = r9
            r9 = r7
        L22:
            monitor-exit(r8)
            r1 = 0
            int r2 = r0.length
        L25:
            if (r1 >= r2) goto L3a
            r3 = r0[r1]
            int r1 = r1 + 1
            if (r3 != 0) goto L2e
            goto L25
        L2e:
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = kotlin.Result.m333constructorimpl(r4)
            r3.resumeWith(r4)
            goto L25
        L3a:
            return r9
        L3b:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    private final void updateBufferLocked(long r14, long r16, long r18, long r20) {
            r13 = this;
            r0 = r13
            r1 = r14
            r3 = r16
            long r5 = java.lang.Math.min(r3, r14)
            long r7 = r13.getHead()
        Lc:
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 >= 0) goto L1e
            r9 = 1
            long r9 = r9 + r7
            java.lang.Object[] r11 = r0.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            r12 = 0
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r11, r7, r12)
            r7 = r9
            goto Lc
        L1e:
            r0.replayIndex = r1
            r0.minCollectorIndex = r3
            long r1 = r18 - r5
            int r2 = (int) r1
            r0.bufferSize = r2
            long r1 = r20 - r18
            int r2 = (int) r1
            r0.queueSize = r2
            return
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r2) {
            r0 = this;
            java.lang.Object r1 = collect$suspendImpl(r0, r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.SharedFlowSlot r0 = new kotlinx.coroutines.flow.SharedFlowSlot
            r0.<init>()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] createSlotArray(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.SharedFlowSlot[] r1 = new kotlinx.coroutines.flow.SharedFlowSlot[r1]
            return r1
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            boolean r0 = r1.tryEmit(r2)
            if (r0 == 0) goto L9
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L16
        L9:
            java.lang.Object r2 = r1.emitSuspend(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L14
            goto L16
        L14:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L16:
            return r2
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<T> fuse(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            kotlinx.coroutines.flow.Flow r1 = kotlinx.coroutines.flow.SharedFlowKt.fuseSharedFlow(r0, r1, r2, r3)
            return r1
    }

    public final T getLastReplayedLocked() {
            r5 = this;
            java.lang.Object[] r0 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            long r1 = r5.replayIndex
            int r3 = r5.getReplaySize()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            java.lang.Object r0 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    @org.jetbrains.annotations.NotNull
    public java.util.List<T> getReplayCache() {
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.getReplaySize()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto Ld
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r9)
            return r0
        Ld:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object[] r2 = r9.buffer     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L2b
            r3 = 0
        L18:
            if (r3 >= r0) goto L29
            int r4 = r3 + 1
            long r5 = r9.replayIndex     // Catch: java.lang.Throwable -> L2b
            long r7 = (long) r3     // Catch: java.lang.Throwable -> L2b
            long r5 = r5 + r7
            java.lang.Object r3 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r2, r5)     // Catch: java.lang.Throwable -> L2b
            r1.add(r3)     // Catch: java.lang.Throwable -> L2b
            r3 = r4
            goto L18
        L29:
            monitor-exit(r9)
            return r1
        L2b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
            r9 = this;
            monitor-enter(r9)
            long r1 = r9.getBufferEndIndex()     // Catch: java.lang.Throwable -> L17
            long r3 = r9.minCollectorIndex     // Catch: java.lang.Throwable -> L17
            long r5 = r9.getBufferEndIndex()     // Catch: java.lang.Throwable -> L17
            long r7 = r9.getQueueEndIndex()     // Catch: java.lang.Throwable -> L17
            r0 = r9
            r0.updateBufferLocked(r1, r3, r5, r7)     // Catch: java.lang.Throwable -> L17
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L17
            monitor-exit(r9)
            return
        L17:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T r6) {
            r5 = this;
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            monitor-enter(r5)
            boolean r6 = r5.tryEmitLocked(r6)     // Catch: java.lang.Throwable -> L29
            r1 = 0
            if (r6 == 0) goto L10
            kotlin.coroutines.Continuation[] r0 = r5.findSlotsToResumeLocked(r0)     // Catch: java.lang.Throwable -> L29
            r6 = 1
            goto L11
        L10:
            r6 = 0
        L11:
            monitor-exit(r5)
            int r2 = r0.length
        L13:
            if (r1 >= r2) goto L28
            r3 = r0[r1]
            int r1 = r1 + 1
            if (r3 != 0) goto L1c
            goto L13
        L1c:
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = kotlin.Result.m333constructorimpl(r4)
            r3.resumeWith(r4)
            goto L13
        L28:
            return r6
        L29:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long r23) {
            r22 = this;
            r9 = r22
            long r0 = r9.minCollectorIndex
            int r2 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lb
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r0
        Lb:
            long r0 = r22.getHead()
            int r2 = r9.bufferSize
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r9.bufferCapacity
            r5 = 1
            if (r4 != 0) goto L1e
            int r4 = r9.queueSize
            if (r4 <= 0) goto L1e
            long r2 = r2 + r5
        L1e:
            int r4 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(r22)
            if (r4 != 0) goto L25
            goto L46
        L25:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r4 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(r22)
            if (r4 != 0) goto L2c
            goto L46
        L2c:
            int r7 = r4.length
            r8 = 0
        L2e:
            if (r8 >= r7) goto L46
            r11 = r4[r8]
            int r8 = r8 + 1
            if (r11 == 0) goto L2e
            kotlinx.coroutines.flow.SharedFlowSlot r11 = (kotlinx.coroutines.flow.SharedFlowSlot) r11
            long r11 = r11.index
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L2e
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 >= 0) goto L2e
            r2 = r11
            goto L2e
        L46:
            long r7 = r9.minCollectorIndex
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L4f
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r0
        L4f:
            long r7 = r22.getBufferEndIndex()
            int r4 = r22.getNCollectors()
            if (r4 <= 0) goto L66
            long r11 = r7 - r2
            int r4 = (int) r11
            int r11 = r9.queueSize
            int r12 = r9.bufferCapacity
            int r12 = r12 - r4
            int r4 = java.lang.Math.min(r11, r12)
            goto L68
        L66:
            int r4 = r9.queueSize
        L68:
            kotlin.coroutines.Continuation<kotlin.Unit>[] r11 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            int r12 = r9.queueSize
            long r12 = (long) r12
            long r12 = r12 + r7
            if (r4 <= 0) goto Lba
            kotlin.coroutines.Continuation[] r11 = new kotlin.coroutines.Continuation[r4]
            java.lang.Object[] r14 = r9.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            r16 = r7
            r15 = 0
        L7a:
            int r18 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r18 >= 0) goto Lb5
            long r18 = r7 + r5
            java.lang.Object r10 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r14, r7)
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            if (r10 == r5) goto Lae
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"
            java.util.Objects.requireNonNull(r10, r6)
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r10 = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) r10
            int r6 = r15 + 1
            r20 = r2
            kotlin.coroutines.Continuation<kotlin.Unit> r2 = r10.cont
            r11[r15] = r2
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r14, r7, r5)
            java.lang.Object r2 = r10.value
            r7 = r16
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r14, r7, r2)
            r2 = 1
            long r16 = r7 + r2
            if (r6 < r4) goto La8
            goto Lb7
        La8:
            r15 = r6
            r7 = r18
            r2 = r20
            goto Lb2
        Lae:
            r7 = r16
            r7 = r18
        Lb2:
            r5 = 1
            goto L7a
        Lb5:
            r20 = r2
        Lb7:
            r7 = r16
            goto Lbc
        Lba:
            r20 = r2
        Lbc:
            long r0 = r7 - r0
            int r1 = (int) r0
            int r0 = r22.getNCollectors()
            if (r0 != 0) goto Lc7
            r3 = r7
            goto Lc9
        Lc7:
            r3 = r20
        Lc9:
            long r5 = r9.replayIndex
            int r0 = r9.replay
            int r0 = java.lang.Math.min(r0, r1)
            long r0 = (long) r0
            long r0 = r7 - r0
            long r0 = java.lang.Math.max(r5, r0)
            int r2 = r9.bufferCapacity
            if (r2 != 0) goto Lf5
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto Lf5
            java.lang.Object[] r2 = r9.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Object r2 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r2, r0)
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
            if (r2 == 0) goto Lf5
            r5 = 1
            long r7 = r7 + r5
            long r0 = r0 + r5
        Lf5:
            r1 = r0
            r5 = r7
            r0 = r22
            r7 = r12
            r0.updateBufferLocked(r1, r3, r5, r7)
            r22.cleanupTailLocked()
            int r0 = r11.length
            r1 = 1
            if (r0 != 0) goto L106
            r10 = 1
            goto L107
        L106:
            r10 = 0
        L107:
            r0 = r10 ^ 1
            if (r0 == 0) goto L10f
            kotlin.coroutines.Continuation[] r11 = r9.findSlotsToResumeLocked(r11)
        L10f:
            return r11
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
            r5 = this;
            long r0 = r5.replayIndex
            long r2 = r5.minCollectorIndex
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto La
            r5.minCollectorIndex = r0
        La:
            return r0
    }
}
