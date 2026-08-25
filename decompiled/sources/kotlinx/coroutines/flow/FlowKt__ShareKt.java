package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\b\f\u001aM\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u001cH\u0002¢\u0006\u0002\b\u001d\u001aS\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012-\u0010\u001f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\"\u0012\u0006\u0012\u0004\u0018\u00010#0 ¢\u0006\u0002\b$ø\u0001\u0000¢\u0006\u0002\u0010%\u001a6\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a/\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010)\u001a9\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0002¢\u0006\u0002\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"asSharedFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "T", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "asStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "configureSharing", "Lkotlinx/coroutines/flow/SharingConfig;", "Lkotlinx/coroutines/flow/Flow;", "replay", "", "configureSharing$FlowKt__ShareKt", "launchSharing", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "upstream", "shared", "started", "Lkotlinx/coroutines/flow/SharingStarted;", "initialValue", "launchSharing$FlowKt__ShareKt", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/Job;", "launchSharingDeferred", "", "result", "Lkotlinx/coroutines/CompletableDeferred;", "launchSharingDeferred$FlowKt__ShareKt", "onSubscription", "action", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/SharedFlow;", "shareIn", "scope", "stateIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ShareKt {
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> asSharedFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.MutableSharedFlow<T> r2) {
            kotlinx.coroutines.flow.ReadonlySharedFlow r0 = new kotlinx.coroutines.flow.ReadonlySharedFlow
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.StateFlow<T> asStateFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.MutableStateFlow<T> r2) {
            kotlinx.coroutines.flow.ReadonlyStateFlow r0 = new kotlinx.coroutines.flow.ReadonlyStateFlow
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private static final <T> kotlinx.coroutines.flow.SharingConfig<T> configureSharing$FlowKt__ShareKt(kotlinx.coroutines.flow.Flow<? extends T> r7, int r8) {
            kotlinx.coroutines.channels.Channel$Factory r0 = kotlinx.coroutines.channels.Channel.Factory
            int r0 = r0.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            int r0 = kotlin.ranges.RangesKt.coerceAtLeast(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r1 == 0) goto L3d
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            kotlinx.coroutines.flow.Flow r2 = r1.dropChannelOperators()
            if (r2 == 0) goto L3d
            kotlinx.coroutines.flow.SharingConfig r7 = new kotlinx.coroutines.flow.SharingConfig
            int r3 = r1.capacity
            r4 = -3
            r5 = 0
            if (r3 == r4) goto L27
            r4 = -2
            if (r3 == r4) goto L27
            if (r3 == 0) goto L27
            r0 = r3
            goto L35
        L27:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r6 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r6) goto L30
            if (r3 != 0) goto L35
            goto L34
        L30:
            if (r8 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.onBufferOverflow
            kotlin.coroutines.CoroutineContext r1 = r1.context
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3d:
            kotlinx.coroutines.flow.SharingConfig r8 = new kotlinx.coroutines.flow.SharingConfig
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r8.<init>(r7, r0, r1, r2)
            return r8
    }

    private static final <T> kotlinx.coroutines.Job launchSharing$FlowKt__ShareKt(kotlinx.coroutines.CoroutineScope r8, kotlin.coroutines.CoroutineContext r9, kotlinx.coroutines.flow.Flow<? extends T> r10, kotlinx.coroutines.flow.MutableSharedFlow<T> r11, kotlinx.coroutines.flow.SharingStarted r12, T r13) {
            kotlinx.coroutines.flow.SharingStarted$Companion r0 = kotlinx.coroutines.flow.SharingStarted.Companion
            kotlinx.coroutines.flow.SharingStarted r0 = r0.getEagerly()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r0)
            if (r0 == 0) goto Lf
            kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.DEFAULT
            goto L11
        Lf:
            kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
        L11:
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1 r7 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1
            r6 = 0
            r1 = r7
            r2 = r12
            r3 = r10
            r4 = r11
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            kotlinx.coroutines.Job r8 = kotlinx.coroutines.BuildersKt.launch(r8, r9, r0, r7)
            return r8
    }

    private static final <T> void launchSharingDeferred$FlowKt__ShareKt(kotlinx.coroutines.CoroutineScope r6, kotlin.coroutines.CoroutineContext r7, kotlinx.coroutines.flow.Flow<? extends T> r8, kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r9) {
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 r3 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1
            r0 = 0
            r3.<init>(r8, r9, r0)
            r2 = 0
            r4 = 2
            r5 = 0
            r0 = r6
            r1 = r7
            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> onSubscription(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharedFlow<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.SubscribedSharedFlow r0 = new kotlinx.coroutines.flow.SubscribedSharedFlow
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> shareIn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r8, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r9, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharingStarted r10, int r11) {
            kotlinx.coroutines.flow.SharingConfig r8 = configureSharing$FlowKt__ShareKt(r8, r11)
            int r0 = r8.extraBufferCapacity
            kotlinx.coroutines.channels.BufferOverflow r1 = r8.onBufferOverflow
            kotlinx.coroutines.flow.MutableSharedFlow r11 = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(r11, r0, r1)
            kotlin.coroutines.CoroutineContext r3 = r8.context
            kotlinx.coroutines.flow.Flow<T> r4 = r8.upstream
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            r2 = r9
            r5 = r11
            r6 = r10
            kotlinx.coroutines.Job r8 = launchSharing$FlowKt__ShareKt(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.ReadonlySharedFlow r9 = new kotlinx.coroutines.flow.ReadonlySharedFlow
            r9.<init>(r11, r8)
            return r9
    }

    public static /* synthetic */ kotlinx.coroutines.flow.SharedFlow shareIn$default(kotlinx.coroutines.flow.Flow r0, kotlinx.coroutines.CoroutineScope r1, kotlinx.coroutines.flow.SharingStarted r2, int r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            kotlinx.coroutines.flow.SharedFlow r0 = kotlinx.coroutines.flow.FlowKt.shareIn(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object stateIn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlow<? extends T>> r4) {
            r0 = 1
            kotlinx.coroutines.flow.SharingConfig r2 = configureSharing$FlowKt__ShareKt(r2, r0)
            r1 = 0
            kotlinx.coroutines.CompletableDeferred r0 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r1, r0, r1)
            kotlin.coroutines.CoroutineContext r1 = r2.context
            kotlinx.coroutines.flow.Flow<T> r2 = r2.upstream
            launchSharingDeferred$FlowKt__ShareKt(r3, r1, r2, r0)
            java.lang.Object r2 = r0.await(r4)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.StateFlow<T> stateIn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r7, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r8, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharingStarted r9, T r10) {
            r0 = 1
            kotlinx.coroutines.flow.SharingConfig r7 = configureSharing$FlowKt__ShareKt(r7, r0)
            kotlinx.coroutines.flow.MutableStateFlow r6 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r10)
            kotlin.coroutines.CoroutineContext r1 = r7.context
            kotlinx.coroutines.flow.Flow<T> r2 = r7.upstream
            r0 = r8
            r3 = r6
            r4 = r9
            r5 = r10
            kotlinx.coroutines.Job r7 = launchSharing$FlowKt__ShareKt(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.flow.ReadonlyStateFlow r8 = new kotlinx.coroutines.flow.ReadonlyStateFlow
            r8.<init>(r6, r7)
            return r8
    }
}
