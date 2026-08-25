package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001an\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u0090\u0001\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00010\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u0001H\u000e\u0018\u00010\u00110\u001329\u0010\u0007\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u0014H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u0015*\u001c\b\u0002\u0010\u0016\"\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"zipImpl", "Lkotlinx/coroutines/flow/Flow;", "R", "T1", "T2", "flow", "flow2", "transform", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "combineInternal", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "flows", "", "arrayFactory", "Lkotlin/Function0;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;[Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Update", "Lkotlin/collections/IndexedValue;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CombineKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 79, 82}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ kotlin.jvm.functions.Function0<T[]> $arrayFactory;
        public final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;
        public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_combineInternal;
        public final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
        public int I$0;
        public int I$1;
        private /* synthetic */ java.lang.Object L$0;
        public kotlinx.coroutines.channels.Channel L$1;
        public byte[] L$2;
        public int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            public final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;
            public final /* synthetic */ int $i;
            public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger $nonClosed;
            public final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> $resultChannel;
            public int label;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            /* JADX INFO: loaded from: classes.dex */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            public static final class C00491<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
                public final /* synthetic */ int $i;
                public final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> $resultChannel;

                public C00491(kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r1, int r2) {
                        r0 = this;
                        r0.$resultChannel = r1
                        r0.$i = r2
                        r0.<init>()
                        return
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L4d
                    L38:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r8 = r6.$resultChannel
                        kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                        int r5 = r6.$i
                        r2.<init>(r5, r7)
                        r0.label = r4
                        java.lang.Object r7 = r8.send(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.label = r3
                        java.lang.Object r7 = kotlinx.coroutines.YieldKt.yield(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                }
            }

            public AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T>[] r1, int r2, java.util.concurrent.atomic.AtomicInteger r3, kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.AnonymousClass1> r5) {
                    r0 = this;
                    r0.$flows = r1
                    r0.$i = r2
                    r0.$nonClosed = r3
                    r0.$resultChannel = r4
                    r1 = 2
                    r0.<init>(r1, r5)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r8) {
                    r6 = this;
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r7 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
                    kotlinx.coroutines.flow.Flow<T>[] r1 = r6.$flows
                    int r2 = r6.$i
                    java.util.concurrent.atomic.AtomicInteger r3 = r6.$nonClosed
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r4 = r6.$resultChannel
                    r0 = r7
                    r5 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r7
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
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r1 = (kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.AnonymousClass1) r1
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r6.label
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L1a
                    if (r1 != r3) goto L12
                    kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L10
                    goto L33
                L10:
                    r7 = move-exception
                    goto L43
                L12:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1a:
                    kotlin.ResultKt.throwOnFailure(r7)
                    kotlinx.coroutines.flow.Flow<T>[] r7 = r6.$flows     // Catch: java.lang.Throwable -> L10
                    int r1 = r6.$i     // Catch: java.lang.Throwable -> L10
                    r7 = r7[r1]     // Catch: java.lang.Throwable -> L10
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1 r4 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1     // Catch: java.lang.Throwable -> L10
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r5 = r6.$resultChannel     // Catch: java.lang.Throwable -> L10
                    r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L10
                    r6.label = r3     // Catch: java.lang.Throwable -> L10
                    java.lang.Object r7 = r7.collect(r4, r6)     // Catch: java.lang.Throwable -> L10
                    if (r7 != r0) goto L33
                    return r0
                L33:
                    java.util.concurrent.atomic.AtomicInteger r7 = r6.$nonClosed
                    int r7 = r7.decrementAndGet()
                    if (r7 != 0) goto L40
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r7 = r6.$resultChannel
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r7, r2, r3, r2)
                L40:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                L43:
                    java.util.concurrent.atomic.AtomicInteger r0 = r6.$nonClosed
                    int r0 = r0.decrementAndGet()
                    if (r0 != 0) goto L50
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r0 = r6.$resultChannel
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r0, r2, r3, r2)
                L50:
                    throw r7
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T>[] r1, kotlin.jvm.functions.Function0<T[]> r2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3, kotlinx.coroutines.flow.FlowCollector<? super R> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2> r5) {
                r0 = this;
                r0.$flows = r1
                r0.$arrayFactory = r2
                r0.$transform = r3
                r0.$this_combineInternal = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r9) {
                r7 = this;
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 r6 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2
                kotlinx.coroutines.flow.Flow<T>[] r1 = r7.$flows
                kotlin.jvm.functions.Function0<T[]> r2 = r7.$arrayFactory
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r7.$transform
                kotlinx.coroutines.flow.FlowCollector<R> r4 = r7.$this_combineInternal
                r0 = r6
                r5 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                r6.L$0 = r8
                return r6
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
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 r1 = (kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r25) {
                r24 = this;
                r0 = r24
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 3
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L60
                if (r2 == r6) goto L45
                if (r2 == r3) goto L33
                if (r2 != r4) goto L2b
                int r2 = r0.I$1
                int r5 = r0.I$0
                byte[] r7 = r0.L$2
                kotlinx.coroutines.channels.Channel r8 = r0.L$1
                java.lang.Object r9 = r0.L$0
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                kotlin.ResultKt.throwOnFailure(r25)
                r10 = r0
            L24:
                r23 = r5
                r5 = r2
                r2 = r23
                goto L156
            L2b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L33:
                int r5 = r0.I$1
                int r2 = r0.I$0
                byte[] r7 = r0.L$2
                kotlinx.coroutines.channels.Channel r8 = r0.L$1
                java.lang.Object r9 = r0.L$0
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                kotlin.ResultKt.throwOnFailure(r25)
                r10 = r0
                goto Laf
            L45:
                int r2 = r0.I$1
                int r5 = r0.I$0
                byte[] r7 = r0.L$2
                kotlinx.coroutines.channels.Channel r8 = r0.L$1
                java.lang.Object r9 = r0.L$0
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                kotlin.ResultKt.throwOnFailure(r25)
                r10 = r25
                kotlinx.coroutines.channels.ChannelResult r10 = (kotlinx.coroutines.channels.ChannelResult) r10
                java.lang.Object r10 = r10.m1838unboximpl()
                r14 = r0
                r15 = r9
                goto Lcc
            L60:
                kotlin.ResultKt.throwOnFailure(r25)
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlinx.coroutines.flow.Flow<T>[] r7 = r0.$flows
                int r13 = r7.length
                if (r13 != 0) goto L6f
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            L6f:
                java.lang.Object[] r14 = new java.lang.Object[r13]
                kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED
                kotlin.collections.ArraysKt.fill$default(r14, r7)
                r7 = 6
                r8 = 0
                kotlinx.coroutines.channels.Channel r21 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r13, r8, r8, r7, r8)
                java.util.concurrent.atomic.AtomicInteger r12 = new java.util.concurrent.atomic.AtomicInteger
                r12.<init>(r13)
                r7 = 0
            L82:
                if (r7 >= r13) goto La8
                int r22 = r7 + 1
                r8 = 0
                r9 = 0
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r10 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
                kotlinx.coroutines.flow.Flow<T>[] r11 = r0.$flows
                r20 = 0
                r15 = r10
                r16 = r11
                r17 = r7
                r18 = r12
                r19 = r21
                r15.<init>(r16, r17, r18, r19, r20)
                r11 = 3
                r15 = 0
                r7 = r2
                r16 = r12
                r12 = r15
                kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
                r12 = r16
                r7 = r22
                goto L82
            La8:
                byte[] r7 = new byte[r13]
                r10 = r0
                r2 = r13
                r9 = r14
                r8 = r21
            Laf:
                int r5 = r5 + r6
                byte r5 = (byte) r5
                r10.L$0 = r9
                r10.L$1 = r8
                r10.L$2 = r7
                r10.I$0 = r2
                r10.I$1 = r5
                r10.label = r6
                java.lang.Object r11 = r8.mo1819receiveCatchingJP2dKIU(r10)
                if (r11 != r1) goto Lc4
                return r1
            Lc4:
                r15 = r9
                r14 = r10
                r10 = r11
                r23 = r5
                r5 = r2
                r2 = r23
            Lcc:
                java.lang.Object r9 = kotlinx.coroutines.channels.ChannelResult.m1831getOrNullimpl(r10)
                kotlin.collections.IndexedValue r9 = (kotlin.collections.IndexedValue) r9
                if (r9 != 0) goto Ld7
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            Ld7:
                int r10 = r9.getIndex()
                r11 = r15[r10]
                java.lang.Object r9 = r9.getValue()
                r15[r10] = r9
                kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED
                if (r11 != r9) goto Le9
                int r5 = r5 + (-1)
            Le9:
                r9 = r7[r10]
                if (r9 != r2) goto Lee
                goto Lfd
            Lee:
                byte r9 = (byte) r2
                r7[r10] = r9
                java.lang.Object r9 = r8.mo1820tryReceivePtdJZtk()
                java.lang.Object r9 = kotlinx.coroutines.channels.ChannelResult.m1831getOrNullimpl(r9)
                kotlin.collections.IndexedValue r9 = (kotlin.collections.IndexedValue) r9
                if (r9 != 0) goto Ld7
            Lfd:
                if (r5 != 0) goto L151
                kotlin.jvm.functions.Function0<T[]> r9 = r14.$arrayFactory
                java.lang.Object r9 = r9.invoke()
                r13 = r9
                java.lang.Object[] r13 = (java.lang.Object[]) r13
                if (r13 != 0) goto L129
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r9 = r14.$transform
                kotlinx.coroutines.flow.FlowCollector<R> r10 = r14.$this_combineInternal
                r14.L$0 = r15
                r14.L$1 = r8
                r14.L$2 = r7
                r14.I$0 = r5
                r14.I$1 = r2
                r14.label = r3
                java.lang.Object r9 = r9.invoke(r10, r15, r14)
                if (r9 != r1) goto L121
                return r1
            L121:
                r10 = r14
                r9 = r15
                r23 = r5
                r5 = r2
                r2 = r23
                goto Laf
            L129:
                r11 = 0
                r12 = 0
                r16 = 0
                r17 = 14
                r9 = r15
                r10 = r13
                r3 = r13
                r13 = r16
                r6 = r14
                r14 = r17
                kotlin.collections.ArraysKt.copyInto$default(r9, r10, r11, r12, r13, r14)
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r9 = r6.$transform
                kotlinx.coroutines.flow.FlowCollector<R> r10 = r6.$this_combineInternal
                r6.L$0 = r15
                r6.L$1 = r8
                r6.L$2 = r7
                r6.I$0 = r5
                r6.I$1 = r2
                r6.label = r4
                java.lang.Object r3 = r9.invoke(r10, r3, r6)
                if (r3 != r1) goto L152
                return r1
            L151:
                r6 = r14
            L152:
                r10 = r6
                r9 = r15
                goto L24
            L156:
                r3 = 2
                r6 = 1
                goto Laf
        }
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <R, T> java.lang.Object combineInternal(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super R> r7, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T>[] r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<T[]> r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 r6 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2
            r5 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r7 = kotlinx.coroutines.flow.internal.FlowCoroutineKt.flowScope(r6, r11)
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r8) goto L16
            return r7
        L16:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> zipImpl(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T1> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T2> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1
            r0.<init>(r2, r1, r3)
            return r0
    }
}
