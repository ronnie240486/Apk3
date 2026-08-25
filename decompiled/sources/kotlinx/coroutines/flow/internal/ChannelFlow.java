package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlinx.coroutines.InternalCoroutinesApi
@kotlin.Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J!\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R9\u0010 \u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001a8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", "T", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "Lkotlinx/coroutines/flow/Flow;", "dropChannelOperators", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "fuse", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/channels/ReceiveChannel;", "produceImpl", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "Lkotlin/coroutines/CoroutineContext;", "I", "Lkotlinx/coroutines/channels/BufferOverflow;", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "getCollectToFun$kotlinx_coroutines_core", "()Lkotlin/jvm/functions/Function2;", "collectToFun", "getProduceCapacity$kotlinx_coroutines_core", "()I", "produceCapacity", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class ChannelFlow<T> implements kotlinx.coroutines.flow.internal.FusibleFlow<T> {

    @kotlin.jvm.JvmField
    public final int capacity;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.CoroutineContext context;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<java.lang.Object> $collector;
        private /* synthetic */ java.lang.Object L$0;
        public int label;
        public final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlow<java.lang.Object> this$0;

        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<java.lang.Object> r1, kotlinx.coroutines.flow.internal.ChannelFlow<java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlow.AnonymousClass2> r3) {
                r0 = this;
                r0.$collector = r1
                r0.this$0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.flow.internal.ChannelFlow$collect$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlow$collect$2
                kotlinx.coroutines.flow.FlowCollector<java.lang.Object> r1 = r3.$collector
                kotlinx.coroutines.flow.internal.ChannelFlow<java.lang.Object> r2 = r3.this$0
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.internal.ChannelFlow$collect$2 r1 = (kotlinx.coroutines.flow.internal.ChannelFlow.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r5)
                goto L2f
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.L$0
                kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                kotlinx.coroutines.flow.FlowCollector<java.lang.Object> r1 = r4.$collector
                kotlinx.coroutines.flow.internal.ChannelFlow<java.lang.Object> r3 = r4.this$0
                kotlinx.coroutines.channels.ReceiveChannel r5 = r3.produceImpl(r5)
                r4.label = r2
                java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.emitAll(r1, r5, r4)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
        }
    }

    public ChannelFlow(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.capacity = r2
            r0.onBufferOverflow = r3
            return
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.String additionalToStringProps() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlinx.coroutines.flow.internal.ChannelFlow$collect$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlow$collect$2
            r1 = 0
            r0.<init>(r3, r2, r1)
            java.lang.Object r3 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L11
            goto L13
        L11:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
        L13:
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object collectTo(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2);

    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.internal.ChannelFlow<T> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3);

    @org.jetbrains.annotations.Nullable
    public kotlinx.coroutines.flow.Flow<T> dropChannelOperators() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<T> fuse(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.capacity
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r4 = r4 + r3
            if (r4 < 0) goto L20
            goto L13
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.onBufferOverflow
        L25:
            kotlin.coroutines.CoroutineContext r0 = r1.context
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.capacity
            if (r3 != r0) goto L36
            kotlinx.coroutines.channels.BufferOverflow r0 = r1.onBufferOverflow
            if (r4 != r0) goto L36
            return r1
        L36:
            kotlinx.coroutines.flow.internal.ChannelFlow r2 = r1.create(r2, r3, r4)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getCollectToFun$kotlinx_coroutines_core() {
            r2 = this;
            kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public final int getProduceCapacity$kotlinx_coroutines_core() {
            r2 = this;
            int r0 = r2.capacity
            r1 = -3
            if (r0 != r1) goto L6
            r0 = -2
        L6:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.ReceiveChannel<T> produceImpl(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r10) {
            r9 = this;
            kotlin.coroutines.CoroutineContext r1 = r9.context
            int r2 = r9.getProduceCapacity$kotlinx_coroutines_core()
            kotlinx.coroutines.channels.BufferOverflow r3 = r9.onBufferOverflow
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.ATOMIC
            kotlin.jvm.functions.Function2 r6 = r9.getCollectToFun$kotlinx_coroutines_core()
            r5 = 0
            r7 = 16
            r8 = 0
            r0 = r10
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = r7.additionalToStringProps()
            if (r1 != 0) goto Ld
            goto L10
        Ld:
            r0.add(r1)
        L10:
            kotlin.coroutines.CoroutineContext r1 = r7.context
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r1 == r2) goto L1f
            java.lang.String r2 = "context="
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r1)
            r0.add(r1)
        L1f:
            int r1 = r7.capacity
            r2 = -3
            if (r1 == r2) goto L31
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "capacity="
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r1)
            r0.add(r1)
        L31:
            kotlinx.coroutines.channels.BufferOverflow r1 = r7.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r1 == r2) goto L40
            java.lang.String r2 = "onBufferOverflow="
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r1)
            r0.add(r1)
        L40:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r7)
            r6.append(r1)
            r1 = 91
            r6.append(r1)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 62
            java.lang.String r1 = ", "
            java.lang.String r0 = kotlin.collections.CollectionsKt.joinToString$default(r0, r1, r2, r3, r4, r5)
            r6.append(r0)
            r0 = 93
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            return r0
    }
}
