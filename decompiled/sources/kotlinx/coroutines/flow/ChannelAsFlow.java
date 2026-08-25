package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/flow/ChannelAsFlow;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "", "markConsumed", "()V", "Lkotlinx/coroutines/flow/Flow;", "dropChannelOperators", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/channels/ReceiveChannel;", "produceImpl", "(Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "channel", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "consume", "Z", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
final class ChannelAsFlow<T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater consumed$FU = null;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.ReceiveChannel<T> channel;
    private final boolean consume;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ int consumed;

    static {
            java.lang.Class<kotlinx.coroutines.flow.ChannelAsFlow> r0 = kotlinx.coroutines.flow.ChannelAsFlow.class
            java.lang.String r1 = "consumed"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.flow.ChannelAsFlow.consumed$FU = r0
            return
    }

    public ChannelAsFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends T> r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5) {
            r0 = this;
            r0.<init>(r3, r4, r5)
            r0.channel = r1
            r0.consume = r2
            r1 = 0
            r0.consumed = r1
            return
    }

    public /* synthetic */ ChannelAsFlow(kotlinx.coroutines.channels.ReceiveChannel r7, boolean r8, kotlin.coroutines.CoroutineContext r9, int r10, kotlinx.coroutines.channels.BufferOverflow r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r9 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto Le
            r10 = -3
            r4 = -3
            goto Lf
        Le:
            r4 = r10
        Lf:
            r9 = r12 & 16
            if (r9 == 0) goto L15
            kotlinx.coroutines.channels.BufferOverflow r11 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L15:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private final void markConsumed() {
            r2 = this;
            boolean r0 = r2.consume
            if (r0 == 0) goto L1e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.flow.ChannelAsFlow.consumed$FU
            r1 = 1
            int r0 = r0.getAndSet(r2, r1)
            if (r0 != 0) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L12
            goto L1e
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ReceiveChannel.consumeAsFlow can be collected just once"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1e:
            return
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.NotNull
    public final java.lang.String additionalToStringProps() {
            r2 = this;
            kotlinx.coroutines.channels.ReceiveChannel<T> r0 = r2.channel
            java.lang.String r1 = "channel="
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            int r0 = r2.capacity
            r1 = -3
            if (r0 != r1) goto L1a
            r2.markConsumed()
            kotlinx.coroutines.channels.ReceiveChannel<T> r0 = r2.channel
            boolean r1 = r2.consume
            java.lang.Object r3 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.access$emitAllImpl$FlowKt__ChannelsKt(r3, r0, r1, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L17
            return r3
        L17:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L1a:
            java.lang.Object r3 = super.collect(r3, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L25
            return r3
        L25:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectTo(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlinx.coroutines.flow.internal.SendingCollector r0 = new kotlinx.coroutines.flow.internal.SendingCollector
            r0.<init>(r3)
            kotlinx.coroutines.channels.ReceiveChannel<T> r3 = r2.channel
            boolean r1 = r2.consume
            java.lang.Object r3 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.access$emitAllImpl$FlowKt__ChannelsKt(r0, r3, r1, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L14
            return r3
        L14:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.internal.ChannelFlow<T> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r8, int r9, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r10) {
            r7 = this;
            kotlinx.coroutines.flow.ChannelAsFlow r6 = new kotlinx.coroutines.flow.ChannelAsFlow
            kotlinx.coroutines.channels.ReceiveChannel<T> r1 = r7.channel
            boolean r2 = r7.consume
            r0 = r6
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<T> dropChannelOperators() {
            r9 = this;
            kotlinx.coroutines.flow.ChannelAsFlow r8 = new kotlinx.coroutines.flow.ChannelAsFlow
            kotlinx.coroutines.channels.ReceiveChannel<T> r1 = r9.channel
            boolean r2 = r9.consume
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 28
            r7 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.ReceiveChannel<T> produceImpl(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r3) {
            r2 = this;
            r2.markConsumed()
            int r0 = r2.capacity
            r1 = -3
            if (r0 != r1) goto Lb
            kotlinx.coroutines.channels.ReceiveChannel<T> r3 = r2.channel
            goto Lf
        Lb:
            kotlinx.coroutines.channels.ReceiveChannel r3 = super.produceImpl(r3)
        Lf:
            return r3
    }
}
