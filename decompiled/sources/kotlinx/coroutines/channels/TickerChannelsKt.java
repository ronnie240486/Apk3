package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: TickerChannels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a/\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"fixedDelayTicker", "", "delayMillis", "", "initialDelayMillis", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "(JJLkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fixedPeriodTicker", "ticker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "context", "Lkotlin/coroutines/CoroutineContext;", "mode", "Lkotlinx/coroutines/channels/TickerMode;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TickerChannelsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1, reason: invalid class name */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {106, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public long J$0;
        public kotlinx.coroutines.channels.SendChannel L$0;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                r6 = this;
                r6.result = r7
                int r7 = r6.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r7 | r0
                r6.label = r7
                r0 = 0
                r2 = 0
                r4 = 0
                r5 = r6
                java.lang.Object r7 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedDelayTicker(r0, r2, r4, r5)
                return r7
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TickerChannels.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, 94, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    public static final class C01571 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        public long J$0;
        public long J$1;
        public kotlinx.coroutines.channels.SendChannel L$0;
        public int label;
        public /* synthetic */ java.lang.Object result;

        public C01571(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt.C01571> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                r6 = this;
                r6.result = r7
                int r7 = r6.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r7 | r0
                r6.label = r7
                r0 = 0
                r2 = 0
                r4 = 0
                r5 = r6
                java.lang.Object r7 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedPeriodTicker(r0, r2, r4, r5)
                return r7
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3, reason: invalid class name */
    /* JADX INFO: compiled from: TickerChannels.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ long $delayMillis;
        public final /* synthetic */ long $initialDelayMillis;
        public final /* synthetic */ kotlinx.coroutines.channels.TickerMode $mode;
        private /* synthetic */ java.lang.Object L$0;
        public int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3$WhenMappings */
        /* JADX INFO: compiled from: TickerChannels.kt */
        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    kotlinx.coroutines.channels.TickerMode[] r0 = kotlinx.coroutines.channels.TickerMode.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD
                    int r1 = r1.ordinal()
                    r2 = 1
                    r0[r1] = r2
                    kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_DELAY
                    int r1 = r1.ordinal()
                    r2 = 2
                    r0[r1] = r2
                    kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        public AnonymousClass3(kotlinx.coroutines.channels.TickerMode r1, long r2, long r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3> r6) {
                r0 = this;
                r0.$mode = r1
                r0.$delayMillis = r2
                r0.$initialDelayMillis = r4
                r1 = 2
                r0.<init>(r1, r6)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r10) {
                r8 = this;
                kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 r7 = new kotlinx.coroutines.channels.TickerChannelsKt$ticker$3
                kotlinx.coroutines.channels.TickerMode r1 = r8.$mode
                long r2 = r8.$delayMillis
                long r4 = r8.$initialDelayMillis
                r0 = r7
                r6 = r10
                r0.<init>(r1, r2, r4, r6)
                r7.L$0 = r9
                return r7
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
                kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 r1 = (kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 == r3) goto Le
                if (r1 != r2) goto L12
            Le:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L56
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
                kotlinx.coroutines.channels.TickerMode r1 = r10.$mode
                int[] r4 = kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass3.WhenMappings.$EnumSwitchMapping$0
                int r1 = r1.ordinal()
                r1 = r4[r1]
                if (r1 == r3) goto L42
                if (r1 == r2) goto L30
                goto L56
            L30:
                long r4 = r10.$delayMillis
                long r6 = r10.$initialDelayMillis
                kotlinx.coroutines.channels.SendChannel r8 = r11.getChannel()
                r10.label = r2
                r9 = r10
                java.lang.Object r11 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedDelayTicker(r4, r6, r8, r9)
                if (r11 != r0) goto L56
                return r0
            L42:
                long r1 = r10.$delayMillis
                long r4 = r10.$initialDelayMillis
                kotlinx.coroutines.channels.SendChannel r11 = r11.getChannel()
                r10.label = r3
                r3 = r4
                r5 = r11
                r6 = r10
                java.lang.Object r11 = kotlinx.coroutines.channels.TickerChannelsKt.access$fixedPeriodTicker(r1, r3, r5, r6)
                if (r11 != r0) goto L56
                return r0
            L56:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }

    public static final /* synthetic */ java.lang.Object access$fixedDelayTicker(long r0, long r2, kotlinx.coroutines.channels.SendChannel r4, kotlin.coroutines.Continuation r5) {
            java.lang.Object r0 = fixedDelayTicker(r0, r2, r4, r5)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$fixedPeriodTicker(long r0, long r2, kotlinx.coroutines.channels.SendChannel r4, kotlin.coroutines.Continuation r5) {
            java.lang.Object r0 = fixedPeriodTicker(r0, r2, r4, r5)
            return r0
    }

    private static final java.lang.Object fixedDelayTicker(long r6, long r8, kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            r5 = 3
            if (r2 == 0) goto L4b
            if (r2 == r3) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r5) goto L33
            long r6 = r0.J$0
            kotlinx.coroutines.channels.SendChannel r8 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L78
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            long r6 = r0.J$0
            kotlinx.coroutines.channels.SendChannel r8 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L6b
        L43:
            long r6 = r0.J$0
            kotlinx.coroutines.channels.SendChannel r10 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L5b
        L4b:
            kotlin.ResultKt.throwOnFailure(r11)
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r4
            java.lang.Object r8 = r10.send(r8, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            r8 = r10
        L6b:
            r0.L$0 = r8
            r0.J$0 = r6
            r0.label = r5
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            r10 = r8
            goto L5b
    }

    private static final java.lang.Object fixedPeriodTicker(long r19, long r21, kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit> r23, kotlin.coroutines.Continuation<? super kotlin.Unit> r24) {
            r0 = r24
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.TickerChannelsKt.C01571
            if (r1 == 0) goto L15
            r1 = r0
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = (kotlinx.coroutines.channels.TickerChannelsKt.C01571) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            r6 = 2
            r7 = 3
            r8 = 4
            if (r3 == 0) goto L5f
            if (r3 == r4) goto L53
            if (r3 == r6) goto L49
            if (r3 == r7) goto L39
            if (r3 != r8) goto L31
            goto L39
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            long r3 = r1.J$1
            long r9 = r1.J$0
            kotlinx.coroutines.channels.SendChannel r11 = r1.L$0
            kotlin.ResultKt.throwOnFailure(r0)
        L42:
            r17 = r3
            r3 = r9
            r9 = r17
            goto L10c
        L49:
            long r3 = r1.J$1
            long r9 = r1.J$0
            kotlinx.coroutines.channels.SendChannel r11 = r1.L$0
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lb4
        L53:
            long r3 = r1.J$1
            long r9 = r1.J$0
            kotlinx.coroutines.channels.SendChannel r11 = r1.L$0
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r11
            r11 = r9
            goto L98
        L5f:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L6a
            r0 = 0
            goto L72
        L6a:
            long r9 = r0.nanoTime()
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
        L72:
            if (r0 != 0) goto L79
            long r9 = java.lang.System.nanoTime()
            goto L7d
        L79:
            long r9 = r0.longValue()
        L7d:
            long r11 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r21)
            long r9 = r9 + r11
            r0 = r23
            r1.L$0 = r0
            r11 = r19
            r1.J$0 = r11
            r1.J$1 = r9
            r1.label = r4
            r3 = r21
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r3, r1)
            if (r3 != r2) goto L97
            return r2
        L97:
            r3 = r9
        L98:
            long r9 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r11)
        L9c:
            long r3 = r3 + r9
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            r1.L$0 = r0
            r1.J$0 = r3
            r1.J$1 = r9
            r1.label = r6
            java.lang.Object r11 = r0.send(r11, r1)
            if (r11 != r2) goto Lae
            return r2
        Lae:
            r11 = r0
            r17 = r3
            r3 = r9
            r9 = r17
        Lb4:
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto Lbc
            r0 = 0
            goto Lc4
        Lbc:
            long r12 = r0.nanoTime()
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r12)
        Lc4:
            if (r0 != 0) goto Lcb
            long r12 = java.lang.System.nanoTime()
            goto Lcf
        Lcb:
            long r12 = r0.longValue()
        Lcf:
            long r14 = r9 - r12
            r5 = 0
            long r14 = kotlin.ranges.RangesKt.coerceAtLeast(r14, r5)
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r16 != 0) goto Lf9
            int r16 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r16 == 0) goto Lf9
            long r5 = r12 - r9
            long r5 = r5 % r3
            long r5 = r3 - r5
            long r9 = r12 + r5
            long r5 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(r5)
            r1.L$0 = r11
            r1.J$0 = r9
            r1.J$1 = r3
            r1.label = r7
            java.lang.Object r5 = kotlinx.coroutines.DelayKt.delay(r5, r1)
            if (r5 != r2) goto L42
            return r2
        Lf9:
            long r5 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(r14)
            r1.L$0 = r11
            r1.J$0 = r9
            r1.J$1 = r3
            r1.label = r8
            java.lang.Object r5 = kotlinx.coroutines.DelayKt.delay(r5, r1)
            if (r5 != r2) goto L42
            return r2
        L10c:
            r0 = r11
            r6 = 2
            goto L9c
    }

    @kotlinx.coroutines.ObsoleteCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> ticker(long r11, long r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r15, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.TickerMode r16) {
            r2 = r11
            r4 = r13
            r0 = 1
            r6 = 0
            r8 = 0
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            java.lang.String r9 = " ms"
            if (r1 == 0) goto L52
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L34
            kotlinx.coroutines.GlobalScope r7 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getUnconfined()
            r1 = r15
            kotlin.coroutines.CoroutineContext r9 = r0.plus(r15)
            kotlinx.coroutines.channels.TickerChannelsKt$ticker$3 r10 = new kotlinx.coroutines.channels.TickerChannelsKt$ticker$3
            r6 = 0
            r0 = r10
            r1 = r16
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4, r6)
            kotlinx.coroutines.channels.ReceiveChannel r0 = kotlinx.coroutines.channels.ProduceKt.produce(r7, r9, r8, r10)
            return r0
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected non-negative initial delay, but has "
            r0.append(r1)
            r0.append(r13)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L52:
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

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel ticker$default(long r0, long r2, kotlin.coroutines.CoroutineContext r4, kotlinx.coroutines.channels.TickerMode r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r2 = r0
        L5:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L11
            kotlinx.coroutines.channels.TickerMode r5 = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD
        L11:
            kotlinx.coroutines.channels.ReceiveChannel r0 = ticker(r0, r2, r4, r5)
            return r0
    }
}
