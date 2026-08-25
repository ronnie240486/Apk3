package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/channels/ReceiveChannel;", "produceImpl", "Lkotlinx/coroutines/flow/Flow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "", "concurrency", "I", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ChannelFlowMerge<T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    private final int concurrency;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<T>> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2, reason: invalid class name */
    /* JADX INFO: compiled from: Merge.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "inner", "Lkotlinx/coroutines/flow/Flow;", "emit", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
        public final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
        public final /* synthetic */ kotlinx.coroutines.Job $job;
        public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<T> $scope;
        public final /* synthetic */ kotlinx.coroutines.sync.Semaphore $semaphore;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Merge.kt */
        @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            public final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
            public final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $inner;
            public final /* synthetic */ kotlinx.coroutines.sync.Semaphore $semaphore;
            public int label;

            public AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.flow.internal.SendingCollector<T> r2, kotlinx.coroutines.sync.Semaphore r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2.AnonymousClass1> r4) {
                    r0 = this;
                    r0.$inner = r1
                    r0.$collector = r2
                    r0.$semaphore = r3
                    r1 = 2
                    r0.<init>(r1, r4)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                    r3 = this;
                    kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
                    kotlinx.coroutines.flow.Flow<T> r0 = r3.$inner
                    kotlinx.coroutines.flow.internal.SendingCollector<T> r1 = r3.$collector
                    kotlinx.coroutines.sync.Semaphore r2 = r3.$semaphore
                    r4.<init>(r0, r1, r2, r5)
                    return r4
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
                    kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r1 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2.AnonymousClass1) r1
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
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> Lf
                    goto L29
                Lf:
                    r4 = move-exception
                    goto L31
                L11:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L19:
                    kotlin.ResultKt.throwOnFailure(r4)
                    kotlinx.coroutines.flow.Flow<T> r4 = r3.$inner     // Catch: java.lang.Throwable -> Lf
                    kotlinx.coroutines.flow.internal.SendingCollector<T> r1 = r3.$collector     // Catch: java.lang.Throwable -> Lf
                    r3.label = r2     // Catch: java.lang.Throwable -> Lf
                    java.lang.Object r4 = r4.collect(r1, r3)     // Catch: java.lang.Throwable -> Lf
                    if (r4 != r0) goto L29
                    return r0
                L29:
                    kotlinx.coroutines.sync.Semaphore r4 = r3.$semaphore
                    r4.release()
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                L31:
                    kotlinx.coroutines.sync.Semaphore r0 = r3.$semaphore
                    r0.release()
                    throw r4
            }
        }

        public AnonymousClass2(kotlinx.coroutines.Job r1, kotlinx.coroutines.sync.Semaphore r2, kotlinx.coroutines.channels.ProducerScope<? super T> r3, kotlinx.coroutines.flow.internal.SendingCollector<T> r4) {
                r0 = this;
                r0.$job = r1
                r0.$semaphore = r2
                r0.$scope = r3
                r0.$collector = r4
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r1, kotlin.coroutines.Continuation r2) {
                r0 = this;
                kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
                java.lang.Object r1 = r0.emit(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                kotlinx.coroutines.flow.Flow r8 = r0.L$1
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2) r0
                kotlin.ResultKt.throwOnFailure(r9)
                goto L52
            L2f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L37:
                kotlin.ResultKt.throwOnFailure(r9)
                kotlinx.coroutines.Job r9 = r7.$job
                if (r9 != 0) goto L3f
                goto L42
            L3f:
                kotlinx.coroutines.JobKt.ensureActive(r9)
            L42:
                kotlinx.coroutines.sync.Semaphore r9 = r7.$semaphore
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r3
                java.lang.Object r9 = r9.acquire(r0)
                if (r9 != r1) goto L51
                return r1
            L51:
                r0 = r7
            L52:
                kotlinx.coroutines.channels.ProducerScope<T> r1 = r0.$scope
                r2 = 0
                r3 = 0
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
                kotlinx.coroutines.flow.internal.SendingCollector<T> r9 = r0.$collector
                kotlinx.coroutines.sync.Semaphore r0 = r0.$semaphore
                r5 = 0
                r4.<init>(r8, r9, r0, r5)
                r5 = 3
                r6 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    public ChannelFlowMerge(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r1, int r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5) {
            r0 = this;
            r0.<init>(r3, r4, r5)
            r0.flow = r1
            r0.concurrency = r2
            return
    }

    public /* synthetic */ ChannelFlowMerge(kotlinx.coroutines.flow.Flow r7, int r8, kotlin.coroutines.CoroutineContext r9, int r10, kotlinx.coroutines.channels.BufferOverflow r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r9 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto Le
            r10 = -2
            r4 = -2
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

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.NotNull
    public final java.lang.String additionalToStringProps() {
            r2 = this;
            int r0 = r2.concurrency
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "concurrency="
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object collectTo(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            r5 = this;
            int r0 = r5.concurrency
            r1 = 0
            r2 = 2
            r3 = 0
            kotlinx.coroutines.sync.Semaphore r0 = kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(r0, r1, r2, r3)
            kotlinx.coroutines.flow.internal.SendingCollector r1 = new kotlinx.coroutines.flow.internal.SendingCollector
            r1.<init>(r6)
            kotlin.coroutines.CoroutineContext r2 = r7.getContext()
            kotlinx.coroutines.Job$Key r3 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<T>> r3 = r5.flow
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2
            r4.<init>(r2, r0, r6, r1)
            java.lang.Object r6 = r3.collect(r4, r7)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L2c
            return r6
        L2c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.internal.ChannelFlow<T> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r8, int r9, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r10) {
            r7 = this;
            kotlinx.coroutines.flow.internal.ChannelFlowMerge r6 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge
            kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<T>> r1 = r7.flow
            int r2 = r7.concurrency
            r0 = r6
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
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
