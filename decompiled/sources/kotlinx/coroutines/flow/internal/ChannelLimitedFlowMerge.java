package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/channels/ReceiveChannel;", "produceImpl", "", "Lkotlinx/coroutines/flow/Flow;", "flows", "Ljava/lang/Iterable;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ChannelLimitedFlowMerge<T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Iterable<kotlinx.coroutines.flow.Flow<T>> flows;

    public ChannelLimitedFlowMerge(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.flows = r1
            return
    }

    public /* synthetic */ ChannelLimitedFlowMerge(java.lang.Iterable r1, kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r6 = r5 & 4
            if (r6 == 0) goto Lb
            r3 = -2
        Lb:
            r5 = r5 & 8
            if (r5 == 0) goto L11
            kotlinx.coroutines.channels.BufferOverflow r4 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L11:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectTo(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super T> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            r8 = this;
            kotlinx.coroutines.flow.internal.SendingCollector r10 = new kotlinx.coroutines.flow.internal.SendingCollector
            r10.<init>(r9)
            java.lang.Iterable<kotlinx.coroutines.flow.Flow<T>> r0 = r8.flows
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            r3 = 0
            r4 = 0
            kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1 r5 = new kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1
            r2 = 0
            r5.<init>(r1, r10, r2)
            r6 = 3
            r7 = 0
            r2 = r9
            kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
            goto Lb
        L26:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.internal.ChannelFlow<T> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5) {
            r2 = this;
            kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge r0 = new kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge
            java.lang.Iterable<kotlinx.coroutines.flow.Flow<T>> r1 = r2.flows
            r0.<init>(r1, r3, r4, r5)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.ReceiveChannel<T> produceImpl(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r4) {
            r3 = this;
            kotlin.coroutines.CoroutineContext r0 = r3.context
            int r1 = r3.capacity
            kotlin.jvm.functions.Function2 r2 = r3.getCollectToFun$kotlinx_coroutines_core()
            kotlinx.coroutines.channels.ReceiveChannel r4 = kotlinx.coroutines.channels.ProduceKt.produce(r4, r0, r1, r2)
            return r4
    }
}
