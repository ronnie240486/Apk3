package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Lkotlin/coroutines/CoroutineContext;", "newContext", "", "collectWithContextUndispatched", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "Lkotlinx/coroutines/flow/Flow;", "flow", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class ChannelFlowOperator<S, T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<S> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2, reason: invalid class name */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"S", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> this$0;

        public AnonymousClass2(kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowOperator.AnonymousClass2> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2
                kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r1 = r2.this$0
                r0.<init>(r1, r4)
                r0.L$0 = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r1 = (kotlinx.coroutines.flow.internal.ChannelFlowOperator.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r4)
                goto L29
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                java.lang.Object r4 = r3.L$0
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r1 = r3.this$0
                r3.label = r2
                java.lang.Object r4 = r1.flowCollect(r4, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
        }
    }

    public ChannelFlowOperator(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends S> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.flow = r1
            return
    }

    public static final /* synthetic */ java.lang.Object access$collectWithContextUndispatched(kotlinx.coroutines.flow.internal.ChannelFlowOperator r0, kotlinx.coroutines.flow.FlowCollector r1, kotlin.coroutines.CoroutineContext r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r0.collectWithContextUndispatched(r1, r2, r3)
            return r0
    }

    private final java.lang.Object collectWithContextUndispatched(kotlinx.coroutines.flow.FlowCollector<? super T> r9, kotlin.coroutines.CoroutineContext r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            r8 = this;
            kotlin.coroutines.CoroutineContext r0 = r11.getContext()
            kotlinx.coroutines.flow.FlowCollector r2 = kotlinx.coroutines.flow.internal.ChannelFlowKt.access$withUndispatchedContextCollector(r9, r0)
            kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2
            r9 = 0
            r4.<init>(r8, r9)
            r3 = 0
            r6 = 4
            r7 = 0
            r1 = r10
            r5 = r11
            java.lang.Object r9 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched$default(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r10) goto L1e
            return r9
        L1e:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            r4 = this;
            int r0 = r4.capacity
            r1 = -3
            if (r0 != r1) goto L41
            kotlin.coroutines.CoroutineContext r0 = r6.getContext()
            kotlin.coroutines.CoroutineContext r1 = r4.context
            kotlin.coroutines.CoroutineContext r1 = r0.plus(r1)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r2 == 0) goto L23
            java.lang.Object r5 = r4.flowCollect(r5, r6)
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L20
            goto L4e
        L20:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L4e
        L23:
            kotlin.coroutines.ContinuationInterceptor$Key r2 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Element r3 = r1.get(r2)
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L41
            java.lang.Object r5 = r4.collectWithContextUndispatched(r5, r1, r6)
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L3e
            goto L4e
        L3e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L4e
        L41:
            java.lang.Object r5 = super.collect(r5, r6)
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L4c
            goto L4e
        L4c:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L4e:
            return r5
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectTo(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlinx.coroutines.flow.internal.SendingCollector r0 = new kotlinx.coroutines.flow.internal.SendingCollector
            r0.<init>(r2)
            java.lang.Object r2 = r1.flowCollect(r0, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L10
            goto L12
        L10:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L12:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object flowCollect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlinx.coroutines.flow.Flow<S> r1 = r2.flow
            r0.append(r1)
            java.lang.String r1 = " -> "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
