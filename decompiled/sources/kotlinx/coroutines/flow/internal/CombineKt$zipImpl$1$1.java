package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
public final class CombineKt$zipImpl$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    public final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> $flow;
    public final /* synthetic */ kotlinx.coroutines.flow.Flow<T2> $flow2;
    public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
    public final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    public int label;


    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ java.lang.Object $cnt;
        public final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> $flow;
        public final /* synthetic */ kotlin.coroutines.CoroutineContext $scopeContext;
        public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
        public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
        public final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        public int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
            public final /* synthetic */ java.lang.Object $cnt;
            public final /* synthetic */ kotlin.coroutines.CoroutineContext $scopeContext;
            public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
            public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
            public final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            /* JADX INFO: loaded from: classes2.dex */
            @kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, 135, 135}, m = "invokeSuspend", n = {}, s = {})
            public static final class C00501 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                public final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
                public final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
                public final /* synthetic */ T1 $value;
                public kotlinx.coroutines.flow.FlowCollector L$0;
                public int label;

                public C00501(kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> r1, kotlinx.coroutines.flow.FlowCollector<? super R> r2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, T1 r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C00501> r5) {
                        r0 = this;
                        r0.$second = r1
                        r0.$this_unsafeFlow = r2
                        r0.$transform = r3
                        r0.$value = r4
                        r1 = 2
                        r0.<init>(r1, r5)
                        return
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.NotNull
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r8) {
                        r6 = this;
                        kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r7 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r6.$second
                        kotlinx.coroutines.flow.FlowCollector<R> r2 = r6.$this_unsafeFlow
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r6.$transform
                        T1 r4 = r6.$value
                        r0 = r7
                        r5 = r8
                        r0.<init>(r1, r2, r3, r4, r5)
                        return r7
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.Unit r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                        r0 = this;
                        kotlin.Unit r1 = (kotlin.Unit) r1
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        java.lang.Object r1 = r0.invoke2(r1, r2)
                        return r1
                }

                @org.jetbrains.annotations.Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlin.Unit r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                        r0 = this;
                        kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                        kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r1 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C00501) r1
                        kotlin.Unit r2 = kotlin.Unit.INSTANCE
                        java.lang.Object r1 = r1.invokeSuspend(r2)
                        return r1
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                        r8 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r8.label
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L2e
                        if (r1 == r5) goto L24
                        if (r1 == r4) goto L1e
                        if (r1 != r3) goto L16
                        kotlin.ResultKt.throwOnFailure(r9)
                        goto L6d
                    L16:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1e:
                        kotlinx.coroutines.flow.FlowCollector r1 = r8.L$0
                        kotlin.ResultKt.throwOnFailure(r9)
                        goto L62
                    L24:
                        kotlin.ResultKt.throwOnFailure(r9)
                        kotlinx.coroutines.channels.ChannelResult r9 = (kotlinx.coroutines.channels.ChannelResult) r9
                        java.lang.Object r9 = r9.m1838unboximpl()
                        goto L3c
                    L2e:
                        kotlin.ResultKt.throwOnFailure(r9)
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r9 = r8.$second
                        r8.label = r5
                        java.lang.Object r9 = r9.mo1819receiveCatchingJP2dKIU(r8)
                        if (r9 != r0) goto L3c
                        return r0
                    L3c:
                        kotlinx.coroutines.flow.FlowCollector<R> r1 = r8.$this_unsafeFlow
                        boolean r5 = r9 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
                        if (r5 == 0) goto L4e
                        java.lang.Throwable r9 = kotlinx.coroutines.channels.ChannelResult.m1830exceptionOrNullimpl(r9)
                        if (r9 != 0) goto L4d
                        kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r9.<init>(r1)
                    L4d:
                        throw r9
                    L4e:
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r5 = r8.$transform
                        T1 r6 = r8.$value
                        kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                        if (r9 != r7) goto L57
                        r9 = r2
                    L57:
                        r8.L$0 = r1
                        r8.label = r4
                        java.lang.Object r9 = r5.invoke(r6, r9, r8)
                        if (r9 != r0) goto L62
                        return r0
                    L62:
                        r8.L$0 = r2
                        r8.label = r3
                        java.lang.Object r9 = r1.emit(r9, r8)
                        if (r9 != r0) goto L6d
                        return r0
                    L6d:
                        kotlin.Unit r9 = kotlin.Unit.INSTANCE
                        return r9
                }
            }

            public AnonymousClass1(kotlin.coroutines.CoroutineContext r1, java.lang.Object r2, kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> r3, kotlinx.coroutines.flow.FlowCollector<? super R> r4, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
                    r0 = this;
                    r0.$scopeContext = r1
                    r0.$cnt = r2
                    r0.$second = r3
                    r0.$this_unsafeFlow = r4
                    r0.$transform = r5
                    r0.<init>()
                    return
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object emit(T1 r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
                    r12 = this;
                    boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r14
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.throwOnFailure(r14)
                    goto L51
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    kotlin.ResultKt.throwOnFailure(r14)
                    kotlin.coroutines.CoroutineContext r14 = r12.$scopeContext
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    java.lang.Object r4 = r12.$cnt
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r11 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r12.$second
                    kotlinx.coroutines.flow.FlowCollector<R> r7 = r12.$this_unsafeFlow
                    kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r12.$transform
                    r10 = 0
                    r5 = r11
                    r9 = r13
                    r5.<init>(r6, r7, r8, r9, r10)
                    r0.label = r3
                    java.lang.Object r13 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched(r14, r2, r4, r11, r0)
                    if (r13 != r1) goto L51
                    return r1
                L51:
                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                    return r13
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlin.coroutines.CoroutineContext r2, java.lang.Object r3, kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> r4, kotlinx.coroutines.flow.FlowCollector<? super R> r5, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2> r7) {
                r0 = this;
                r0.$flow = r1
                r0.$scopeContext = r2
                r0.$cnt = r3
                r0.$second = r4
                r0.$this_unsafeFlow = r5
                r0.$transform = r6
                r1 = 2
                r0.<init>(r1, r7)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r10) {
                r8 = this;
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r9 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2
                kotlinx.coroutines.flow.Flow<T1> r1 = r8.$flow
                kotlin.coroutines.CoroutineContext r2 = r8.$scopeContext
                java.lang.Object r3 = r8.$cnt
                kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r4 = r8.$second
                kotlinx.coroutines.flow.FlowCollector<R> r5 = r8.$this_unsafeFlow
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r8.$transform
                r0 = r9
                r7 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r9
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.Unit r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.Unit r1 = (kotlin.Unit) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlin.Unit r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r1 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r10)
                goto L35
            Lf:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L17:
                kotlin.ResultKt.throwOnFailure(r10)
                kotlinx.coroutines.flow.Flow<T1> r10 = r9.$flow
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1 r1 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1
                kotlin.coroutines.CoroutineContext r4 = r9.$scopeContext
                java.lang.Object r5 = r9.$cnt
                kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r9.$second
                kotlinx.coroutines.flow.FlowCollector<R> r7 = r9.$this_unsafeFlow
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r9.$transform
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                r9.label = r2
                java.lang.Object r10 = r10.collect(r1, r9)
                if (r10 != r0) goto L35
                return r0
            L35:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    public CombineKt$zipImpl$1$1(kotlinx.coroutines.flow.FlowCollector<? super R> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlinx.coroutines.flow.Flow<? extends T1> r3, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1> r5) {
            r0 = this;
            r0.$this_unsafeFlow = r1
            r0.$flow2 = r2
            r0.$flow = r3
            r0.$transform = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r9) {
            r7 = this;
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1 r6 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1
            kotlinx.coroutines.flow.FlowCollector<R> r1 = r7.$this_unsafeFlow
            kotlinx.coroutines.flow.Flow<T2> r2 = r7.$flow2
            kotlinx.coroutines.flow.Flow<T1> r3 = r7.$flow
            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r7.$transform
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
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1 r1 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
            r19 = this;
            r8 = r19
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L26
            if (r1 != r9) goto L1e
            java.lang.Object r0 = r8.L$0
            r1 = r0
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            kotlin.ResultKt.throwOnFailure(r20)     // Catch: java.lang.Throwable -> L18 kotlinx.coroutines.flow.internal.AbortFlowException -> L1b
            goto L86
        L18:
            r0 = move-exception
            goto L9e
        L1b:
            r0 = move-exception
            goto L95
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L26:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            r3 = 0
            r4 = 0
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r5 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            kotlinx.coroutines.flow.Flow<T2> r2 = r8.$flow2
            r5.<init>(r2, r10)
            r6 = 3
            r7 = 0
            r2 = r1
            kotlinx.coroutines.channels.ReceiveChannel r7 = kotlinx.coroutines.channels.ProduceKt.produce$default(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.CompletableJob r2 = kotlinx.coroutines.JobKt.Job$default(r10, r9, r10)
            r3 = r7
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1 r4 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1
            kotlinx.coroutines.flow.FlowCollector<R> r5 = r8.$this_unsafeFlow
            r4.<init>(r2, r5)
            r3.invokeOnClose(r4)
            kotlin.coroutines.CoroutineContext r13 = r1.getCoroutineContext()     // Catch: java.lang.Throwable -> L8e kotlinx.coroutines.flow.internal.AbortFlowException -> L92
            java.lang.Object r14 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r13)     // Catch: java.lang.Throwable -> L8e kotlinx.coroutines.flow.internal.AbortFlowException -> L92
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()     // Catch: java.lang.Throwable -> L8e kotlinx.coroutines.flow.internal.AbortFlowException -> L92
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r2)     // Catch: java.lang.Throwable -> L8e kotlinx.coroutines.flow.internal.AbortFlowException -> L92
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8e kotlinx.coroutines.flow.internal.AbortFlowException -> L92
            r3 = 0
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r4 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch: java.lang.Throwable -> L8e kotlinx.coroutines.flow.internal.AbortFlowException -> L92
            kotlinx.coroutines.flow.Flow<T1> r12 = r8.$flow     // Catch: java.lang.Throwable -> L8e kotlinx.coroutines.flow.internal.AbortFlowException -> L92
            kotlinx.coroutines.flow.FlowCollector<R> r5 = r8.$this_unsafeFlow     // Catch: java.lang.Throwable -> L8e kotlinx.coroutines.flow.internal.AbortFlowException -> L92
            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r8.$transform     // Catch: java.lang.Throwable -> L8e kotlinx.coroutines.flow.internal.AbortFlowException -> L92
            r18 = 0
            r11 = r4
            r15 = r7
            r16 = r5
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L8e kotlinx.coroutines.flow.internal.AbortFlowException -> L92
            r6 = 4
            r11 = 0
            r8.L$0 = r7     // Catch: java.lang.Throwable -> L8e kotlinx.coroutines.flow.internal.AbortFlowException -> L92
            r8.label = r9     // Catch: java.lang.Throwable -> L8e kotlinx.coroutines.flow.internal.AbortFlowException -> L92
            r5 = r19
            r12 = r7
            r7 = r11
            java.lang.Object r1 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched$default(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8a kotlinx.coroutines.flow.internal.AbortFlowException -> L8c
            if (r1 != r0) goto L85
            return r0
        L85:
            r1 = r12
        L86:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r1, r10, r9, r10)
            goto L9b
        L8a:
            r0 = move-exception
            goto L90
        L8c:
            r0 = move-exception
            goto L94
        L8e:
            r0 = move-exception
            r12 = r7
        L90:
            r1 = r12
            goto L9e
        L92:
            r0 = move-exception
            r12 = r7
        L94:
            r1 = r12
        L95:
            kotlinx.coroutines.flow.FlowCollector<R> r2 = r8.$this_unsafeFlow     // Catch: java.lang.Throwable -> L18
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r0, r2)     // Catch: java.lang.Throwable -> L18
            goto L86
        L9b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9e:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r1, r10, r9, r10)
            throw r0
    }
}
