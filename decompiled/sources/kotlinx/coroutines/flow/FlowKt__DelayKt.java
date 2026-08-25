package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u001a:\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\b\b\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0007\u001a3\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0002\b\r\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0000\u001a&\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0005H\u0007\u001a3\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"debounce", "Lkotlinx/coroutines/flow/Flow;", "T", "timeoutMillis", "Lkotlin/Function1;", "", "timeout", "Lkotlin/time/Duration;", "debounceDuration", "debounce-HG0u8IE", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "debounceInternal", "timeoutMillisSelector", "debounceInternal$FlowKt__DelayKt", "fixedPeriodTicker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "Lkotlinx/coroutines/CoroutineScope;", "delayMillis", "initialDelayMillis", "sample", "periodMillis", "period", "sample-HG0u8IE", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__DelayKt {



    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", i = {0, 1, 2}, l = {314, 316, 317}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    public static final class C01593 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ long $delayMillis;
        public final /* synthetic */ long $initialDelayMillis;
        private /* synthetic */ java.lang.Object L$0;
        public int label;

        public C01593(long r1, long r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt.C01593> r5) {
                r0 = this;
                r0.$initialDelayMillis = r1
                r0.$delayMillis = r3
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r9) {
                r7 = this;
                kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3 r6 = new kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3
                long r1 = r7.$initialDelayMillis
                long r3 = r7.$delayMillis
                r0 = r6
                r5 = r9
                r0.<init>(r1, r3, r5)
                r6.L$0 = r8
                return r6
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3 r1 = (kotlinx.coroutines.flow.FlowKt__DelayKt.C01593) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L11
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
            L11:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.ResultKt.throwOnFailure(r8)
                goto L3f
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.ResultKt.throwOnFailure(r8)
                r8 = r7
                goto L51
            L2a:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                long r5 = r7.$initialDelayMillis
                r7.L$0 = r1
                r7.label = r4
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                r8 = r7
            L40:
                kotlinx.coroutines.channels.SendChannel r4 = r1.getChannel()
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r4 = r4.send(r5, r8)
                if (r4 != r0) goto L51
                return r0
            L51:
                long r4 = r8.$delayMillis
                r8.L$0 = r1
                r8.label = r2
                java.lang.Object r4 = kotlinx.coroutines.DelayKt.delay(r4, r8)
                if (r4 != r0) goto L40
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Delay.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/FlowCollector;", "downstream", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {352}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C01602<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ long $periodMillis;
        public final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_sample;
        private /* synthetic */ java.lang.Object L$0;
        public /* synthetic */ java.lang.Object L$1;
        public kotlin.jvm.internal.Ref.ObjectRef L$2;
        public kotlinx.coroutines.channels.ReceiveChannel L$3;
        public int label;

        public C01602(long r1, kotlinx.coroutines.flow.Flow<? extends T> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt.C01602> r4) {
                r0 = this;
                r0.$periodMillis = r1
                r0.$this_sample = r3
                r1 = 3
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r0 = this;
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r1 = r0.invoke(r1, r2, r3)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r6, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                r4 = this;
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2
                long r1 = r4.$periodMillis
                kotlinx.coroutines.flow.Flow<T> r3 = r4.$this_sample
                r0.<init>(r1, r3, r7)
                r0.L$0 = r5
                r0.L$1 = r6
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                java.lang.Object r5 = r0.invokeSuspend(r5)
                return r5
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.label
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L24
                if (r1 != r2) goto L1c
                kotlinx.coroutines.channels.ReceiveChannel r1 = r13.L$3
                kotlin.jvm.internal.Ref$ObjectRef r4 = r13.L$2
                java.lang.Object r5 = r13.L$1
                kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
                java.lang.Object r6 = r13.L$0
                kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                kotlin.ResultKt.throwOnFailure(r14)
                goto L52
            L1c:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L24:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r14 = r13.L$0
                kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
                java.lang.Object r1 = r13.L$1
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                r5 = 0
                r6 = -1
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1 r7 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1
                kotlinx.coroutines.flow.Flow<T> r4 = r13.$this_sample
                r7.<init>(r4, r3)
                r8 = 1
                r9 = 0
                r4 = r14
                kotlinx.coroutines.channels.ReceiveChannel r11 = kotlinx.coroutines.channels.ProduceKt.produce$default(r4, r5, r6, r7, r8, r9)
                kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
                r12.<init>()
                long r5 = r13.$periodMillis
                r7 = 0
                r9 = 2
                r10 = 0
                kotlinx.coroutines.channels.ReceiveChannel r14 = kotlinx.coroutines.flow.FlowKt.fixedPeriodTicker$default(r4, r5, r7, r9, r10)
                r6 = r1
                r5 = r11
                r4 = r12
                r1 = r14
            L52:
                T r14 = r4.element
                kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
                if (r14 == r7) goto L94
                r13.L$0 = r6
                r13.L$1 = r5
                r13.L$2 = r4
                r13.L$3 = r1
                r13.label = r2
                kotlinx.coroutines.selects.SelectBuilderImpl r14 = new kotlinx.coroutines.selects.SelectBuilderImpl
                r14.<init>(r13)
                kotlinx.coroutines.selects.SelectClause1 r7 = r5.getOnReceiveCatching()     // Catch: java.lang.Throwable -> L80
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1     // Catch: java.lang.Throwable -> L80
                r8.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> L80
                r14.invoke(r7, r8)     // Catch: java.lang.Throwable -> L80
                kotlinx.coroutines.selects.SelectClause1 r7 = r1.getOnReceive()     // Catch: java.lang.Throwable -> L80
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2     // Catch: java.lang.Throwable -> L80
                r8.<init>(r4, r6, r3)     // Catch: java.lang.Throwable -> L80
                r14.invoke(r7, r8)     // Catch: java.lang.Throwable -> L80
                goto L84
            L80:
                r7 = move-exception
                r14.handleBuilderException(r7)
            L84:
                java.lang.Object r14 = r14.getResult()
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r14 != r7) goto L91
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r13)
            L91:
                if (r14 != r0) goto L52
                return r0
            L94:
                kotlin.Unit r14 = kotlin.Unit.INSTANCE
                return r14
        }
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r3, long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L18
            if (r2 != 0) goto Le
            return r3
        Le:
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
            r0.<init>(r4)
            kotlinx.coroutines.flow.Flow r3 = debounceInternal$FlowKt__DelayKt(r3, r0)
            return r3
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Debounce timeout should not be negative"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @kotlinx.coroutines.FlowPreview
    @kotlin.OverloadResolutionByLambdaReturnType
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Long> r1) {
            kotlinx.coroutines.flow.Flow r0 = debounceInternal$FlowKt__DelayKt(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1847debounceHG0u8IE(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, long r1) {
            long r1 = kotlinx.coroutines.DelayKt.m1804toDelayMillisLRDsOJo(r1)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.debounce(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @kotlin.jvm.JvmName(name = "debounceDuration")
    @org.jetbrains.annotations.NotNull
    @kotlin.OverloadResolutionByLambdaReturnType
    public static final <T> kotlinx.coroutines.flow.Flow<T> debounceDuration(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.time.Duration> r2) {
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3
            r0.<init>(r2)
            kotlinx.coroutines.flow.Flow r1 = debounceInternal$FlowKt__DelayKt(r1, r0)
            return r1
    }

    private static final <T> kotlinx.coroutines.flow.Flow<T> debounceInternal$FlowKt__DelayKt(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Long> r3) {
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> fixedPeriodTicker(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r10, long r11, long r13) {
            r0 = 1
            r5 = 0
            r6 = 0
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 < 0) goto La
            r8 = 1
            goto Lb
        La:
            r8 = 0
        Lb:
            java.lang.String r9 = " ms"
            if (r8 == 0) goto L4c
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 < 0) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L2e
            r6 = 0
            r7 = 0
            kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3
            r5 = 0
            r0 = r8
            r1 = r13
            r3 = r11
            r0.<init>(r1, r3, r5)
            r5 = 1
            r0 = 0
            r1 = r10
            r2 = r6
            r3 = r7
            r4 = r8
            r6 = r0
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce$default(r1, r2, r3, r4, r5, r6)
            return r0
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Expected non-negative initial delay, but has "
            r0.append(r3)
            r0.append(r13)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected non-negative delay, but has "
            r0.append(r1)
            r0.append(r11)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel fixedPeriodTicker$default(kotlinx.coroutines.CoroutineScope r0, long r1, long r3, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r3 = r1
        L5:
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.flow.FlowKt.fixedPeriodTicker(r0, r1, r3)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> sample(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r3, long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L16
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2
            r1 = 0
            r0.<init>(r4, r3, r1)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(r0)
            return r3
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Sample period should be positive"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1848sampleHG0u8IE(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, long r1) {
            long r1 = kotlinx.coroutines.DelayKt.m1804toDelayMillisLRDsOJo(r1)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.sample(r0, r1)
            return r0
    }
}
