package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u00101\u001a\u00020\u0007¢\u0006\u0004\b2\u0010+J!\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R*\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b,\u0010\u0017\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "", "expectedState", "newState", "", "updateState", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", "update", "compareAndSet", "value", "tryEmit", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetReplayCache", "()V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "sequence", "I", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "initialState", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
final class StateFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.StateFlowSlot> implements kotlinx.coroutines.flow.MutableStateFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _state;
    private int sequence;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: StateFlow.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {386, 398, 403}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public java.lang.Object L$0;
        public kotlinx.coroutines.flow.FlowCollector L$1;
        public java.lang.Object L$2;
        public kotlinx.coroutines.Job L$3;
        public java.lang.Object L$4;
        public int label;
        public /* synthetic */ java.lang.Object result;
        public final /* synthetic */ kotlinx.coroutines.flow.StateFlowImpl<T> this$0;

        public AnonymousClass1(kotlinx.coroutines.flow.StateFlowImpl<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlowImpl.AnonymousClass1> r2) {
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
                kotlinx.coroutines.flow.StateFlowImpl<T> r2 = r1.this$0
                r0 = 0
                java.lang.Object r2 = r2.collect(r0, r1)
                return r2
        }
    }

    public StateFlowImpl(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0._state = r1
            return
    }

    public static /* synthetic */ void getValue$annotations() {
            return
    }

    private final boolean updateState(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            monitor-enter(r6)
            java.lang.Object r0 = r6._state     // Catch: java.lang.Throwable -> L5b
            r1 = 0
            if (r7 == 0) goto Le
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)     // Catch: java.lang.Throwable -> L5b
            if (r7 != 0) goto Le
            monitor-exit(r6)
            return r1
        Le:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)     // Catch: java.lang.Throwable -> L5b
            r0 = 1
            if (r7 == 0) goto L17
            monitor-exit(r6)
            return r0
        L17:
            r6._state = r8     // Catch: java.lang.Throwable -> L5b
            int r7 = r6.sequence     // Catch: java.lang.Throwable -> L5b
            r8 = r7 & 1
            if (r8 != 0) goto L55
            int r7 = r7 + r0
            r6.sequence = r7     // Catch: java.lang.Throwable -> L5b
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r8 = r6.getSlots()     // Catch: java.lang.Throwable -> L5b
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r6)
        L29:
            kotlinx.coroutines.flow.StateFlowSlot[] r8 = (kotlinx.coroutines.flow.StateFlowSlot[]) r8
            if (r8 != 0) goto L2e
            goto L3d
        L2e:
            int r2 = r8.length
            r3 = 0
        L30:
            if (r3 >= r2) goto L3d
            r4 = r8[r3]
            int r3 = r3 + 1
            if (r4 != 0) goto L39
            goto L30
        L39:
            r4.makePending()
            goto L30
        L3d:
            monitor-enter(r6)
            int r8 = r6.sequence     // Catch: java.lang.Throwable -> L52
            if (r8 != r7) goto L47
            int r7 = r7 + r0
            r6.sequence = r7     // Catch: java.lang.Throwable -> L52
            monitor-exit(r6)
            return r0
        L47:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r7 = r6.getSlots()     // Catch: java.lang.Throwable -> L52
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L52
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L29
        L52:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L55:
            int r7 = r7 + 2
            r6.sequence = r7     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r6)
            return r0
        L5b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r12) {
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.StateFlowImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            r5 = 3
            r6 = 0
            if (r2 == 0) goto L6c
            if (r2 == r3) goto L59
            if (r2 == r4) goto L46
            if (r2 != r5) goto L3e
            java.lang.Object r11 = r0.L$4
            kotlinx.coroutines.Job r2 = r0.L$3
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            kotlinx.coroutines.flow.FlowCollector r7 = r0.L$1
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L69
            goto L9c
        L3e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L46:
            java.lang.Object r11 = r0.L$4
            kotlinx.coroutines.Job r2 = r0.L$3
            java.lang.Object r3 = r0.L$2
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            kotlinx.coroutines.flow.FlowCollector r7 = r0.L$1
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L69
            goto Lc7
        L59:
            java.lang.Object r11 = r0.L$2
            r3 = r11
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            kotlinx.coroutines.flow.FlowCollector r11 = r0.L$1
            java.lang.Object r2 = r0.L$0
            r8 = r2
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r11 = move-exception
            goto Le0
        L6c:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r12 = r10.allocateSlot()
            kotlinx.coroutines.flow.StateFlowSlot r12 = (kotlinx.coroutines.flow.StateFlowSlot) r12
            boolean r2 = r11 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch: java.lang.Throwable -> Le2
            if (r2 == 0) goto L8b
            r2 = r11
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch: java.lang.Throwable -> Le2
            r0.L$0 = r10     // Catch: java.lang.Throwable -> Le2
            r0.L$1 = r11     // Catch: java.lang.Throwable -> Le2
            r0.L$2 = r12     // Catch: java.lang.Throwable -> Le2
            r0.label = r3     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r2 = r2.onSubscription(r0)     // Catch: java.lang.Throwable -> Le2
            if (r2 != r1) goto L8b
            return r1
        L8b:
            r8 = r10
            r3 = r12
        L8d:
            kotlin.coroutines.CoroutineContext r12 = r0.getContext()     // Catch: java.lang.Throwable -> L69
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L69
            kotlin.coroutines.CoroutineContext$Element r12 = r12.get(r2)     // Catch: java.lang.Throwable -> L69
            r2 = r12
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2     // Catch: java.lang.Throwable -> L69
            r7 = r11
            r11 = r6
        L9c:
            java.lang.Object r12 = r8._state     // Catch: java.lang.Throwable -> L69
            if (r2 != 0) goto La1
            goto La4
        La1:
            kotlinx.coroutines.JobKt.ensureActive(r2)     // Catch: java.lang.Throwable -> L69
        La4:
            if (r11 == 0) goto Lac
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r12)     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto Lc7
        Lac:
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL     // Catch: java.lang.Throwable -> L69
            if (r12 != r11) goto Lb2
            r11 = r6
            goto Lb3
        Lb2:
            r11 = r12
        Lb3:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L69
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L69
            r0.L$2 = r3     // Catch: java.lang.Throwable -> L69
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L69
            r0.L$4 = r12     // Catch: java.lang.Throwable -> L69
            r0.label = r4     // Catch: java.lang.Throwable -> L69
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch: java.lang.Throwable -> L69
            if (r11 != r1) goto Lc6
            return r1
        Lc6:
            r11 = r12
        Lc7:
            boolean r12 = r3.takePending()     // Catch: java.lang.Throwable -> L69
            if (r12 != 0) goto L9c
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L69
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L69
            r0.L$2 = r3     // Catch: java.lang.Throwable -> L69
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L69
            r0.L$4 = r11     // Catch: java.lang.Throwable -> L69
            r0.label = r5     // Catch: java.lang.Throwable -> L69
            java.lang.Object r12 = r3.awaitPending(r0)     // Catch: java.lang.Throwable -> L69
            if (r12 != r1) goto L9c
            return r1
        Le0:
            r12 = r3
            goto Le4
        Le2:
            r11 = move-exception
            r8 = r10
        Le4:
            r8.freeSlot(r12)
            throw r11
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T r1, T r2) {
            r0 = this;
            if (r1 != 0) goto L4
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
        L4:
            if (r2 != 0) goto L8
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
        L8:
            boolean r1 = r0.updateState(r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot r0 = new kotlinx.coroutines.flow.StateFlowSlot
            r0.<init>()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] createSlotArray(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.StateFlowSlot[] r1 = new kotlinx.coroutines.flow.StateFlowSlot[r1]
            return r1
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            r0.setValue(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<T> fuse(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            kotlinx.coroutines.flow.Flow r1 = kotlinx.coroutines.flow.StateFlowKt.fuseStateFlow(r0, r1, r2, r3)
            return r1
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    @org.jetbrains.annotations.NotNull
    public java.util.List<T> getReplayCache() {
            r1 = this;
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            return r0
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
            r2 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            java.lang.Object r1 = r2._state
            if (r1 != r0) goto L7
            r1 = 0
        L7:
            return r1
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "MutableStateFlow.resetReplayCache is not supported"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T r2) {
            r1 = this;
            if (r2 != 0) goto L4
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
        L4:
            r0 = 0
            r1.updateState(r0, r2)
            return
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T r1) {
            r0 = this;
            r0.setValue(r1)
            r1 = 1
            return r1
    }
}
