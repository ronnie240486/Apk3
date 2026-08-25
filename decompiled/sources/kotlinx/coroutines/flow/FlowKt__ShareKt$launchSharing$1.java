package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ShareKt$launchSharing$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    public final /* synthetic */ T $initialValue;
    public final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow<T> $shared;
    public final /* synthetic */ kotlinx.coroutines.flow.SharingStarted $started;
    public final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $upstream;
    public int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        public /* synthetic */ int I$0;

        public AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass1> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
                r0.<init>(r3)
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r0.I$0 = r2
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(int r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = (kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.ResultKt.throwOnFailure(r1)
                int r1 = r0.I$0
                if (r1 <= 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/SharingCommand;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.SharingCommand, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ T $initialValue;
        public final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow<T> $shared;
        public final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $upstream;
        public /* synthetic */ java.lang.Object L$0;
        public int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$WhenMappings */
        /* JADX INFO: compiled from: Share.kt */
        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    kotlinx.coroutines.flow.SharingCommand[] r0 = kotlinx.coroutines.flow.SharingCommand.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.START
                    int r1 = r1.ordinal()
                    r2 = 1
                    r0[r1] = r2
                    kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.STOP
                    int r1 = r1.ordinal()
                    r2 = 2
                    r0[r1] = r2
                    kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
                    int r1 = r1.ordinal()
                    r2 = 3
                    r0[r1] = r2
                    kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.flow.MutableSharedFlow<T> r2, T r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2> r4) {
                r0 = this;
                r0.$upstream = r1
                r0.$shared = r2
                r0.$initialValue = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
                kotlinx.coroutines.flow.Flow<T> r1 = r4.$upstream
                kotlinx.coroutines.flow.MutableSharedFlow<T> r2 = r4.$shared
                T r3 = r4.$initialValue
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.SharingCommand r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.flow.SharingCommand r1 = (kotlinx.coroutines.flow.SharingCommand) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharingCommand r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = (kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2) r1
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
                goto L4b
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                java.lang.Object r4 = r3.L$0
                kotlinx.coroutines.flow.SharingCommand r4 = (kotlinx.coroutines.flow.SharingCommand) r4
                int[] r1 = kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2.WhenMappings.$EnumSwitchMapping$0
                int r4 = r4.ordinal()
                r4 = r1[r4]
                if (r4 == r2) goto L3e
                r0 = 3
                if (r4 == r0) goto L2c
                goto L4b
            L2c:
                T r4 = r3.$initialValue
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
                if (r4 != r0) goto L38
                kotlinx.coroutines.flow.MutableSharedFlow<T> r4 = r3.$shared
                r4.resetReplayCache()
                goto L4b
            L38:
                kotlinx.coroutines.flow.MutableSharedFlow<T> r0 = r3.$shared
                r0.tryEmit(r4)
                goto L4b
            L3e:
                kotlinx.coroutines.flow.Flow<T> r4 = r3.$upstream
                kotlinx.coroutines.flow.MutableSharedFlow<T> r1 = r3.$shared
                r3.label = r2
                java.lang.Object r4 = r4.collect(r1, r3)
                if (r4 != r0) goto L4b
                return r0
            L4b:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
        }
    }

    public FlowKt__ShareKt$launchSharing$1(kotlinx.coroutines.flow.SharingStarted r1, kotlinx.coroutines.flow.Flow<? extends T> r2, kotlinx.coroutines.flow.MutableSharedFlow<T> r3, T r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1> r5) {
            r0 = this;
            r0.$started = r1
            r0.$upstream = r2
            r0.$shared = r3
            r0.$initialValue = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r8) {
            r6 = this;
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1 r7 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1
            kotlinx.coroutines.flow.SharingStarted r1 = r6.$started
            kotlinx.coroutines.flow.Flow<T> r2 = r6.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r3 = r6.$shared
            T r4 = r6.$initialValue
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
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1 r1 = (kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1) r1
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
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L21
            if (r1 != r2) goto L15
            goto L21
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5c
        L21:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L8d
        L25:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.flow.SharingStarted r8 = r7.$started
            kotlinx.coroutines.flow.SharingStarted$Companion r1 = kotlinx.coroutines.flow.SharingStarted.Companion
            kotlinx.coroutines.flow.SharingStarted r6 = r1.getEagerly()
            if (r8 != r6) goto L3f
            kotlinx.coroutines.flow.Flow<T> r8 = r7.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r1 = r7.$shared
            r7.label = r5
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto L8d
            return r0
        L3f:
            kotlinx.coroutines.flow.SharingStarted r8 = r7.$started
            kotlinx.coroutines.flow.SharingStarted r1 = r1.getLazily()
            r5 = 0
            if (r8 != r1) goto L69
            kotlinx.coroutines.flow.MutableSharedFlow<T> r8 = r7.$shared
            kotlinx.coroutines.flow.StateFlow r8 = r8.getSubscriptionCount()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r1, r7)
            if (r8 != r0) goto L5c
            return r0
        L5c:
            kotlinx.coroutines.flow.Flow<T> r8 = r7.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r1 = r7.$shared
            r7.label = r3
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto L8d
            return r0
        L69:
            kotlinx.coroutines.flow.SharingStarted r8 = r7.$started
            kotlinx.coroutines.flow.MutableSharedFlow<T> r1 = r7.$shared
            kotlinx.coroutines.flow.StateFlow r1 = r1.getSubscriptionCount()
            kotlinx.coroutines.flow.Flow r8 = r8.command(r1)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r8)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            kotlinx.coroutines.flow.Flow<T> r3 = r7.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r4 = r7.$shared
            T r6 = r7.$initialValue
            r1.<init>(r3, r4, r6, r5)
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.collectLatest(r8, r1, r7)
            if (r8 != r0) goto L8d
            return r0
        L8d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
