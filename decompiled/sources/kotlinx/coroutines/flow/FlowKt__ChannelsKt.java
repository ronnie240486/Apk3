package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a/\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "receiveAsFlow", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ChannelsKt {
    public static final /* synthetic */ java.lang.Object access$emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector r0, kotlinx.coroutines.channels.ReceiveChannel r1, boolean r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = emitAllImpl$FlowKt__ChannelsKt(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BroadcastChannel<T> r1) {
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> consumeAsFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends T> r9) {
            kotlinx.coroutines.flow.ChannelAsFlow r8 = new kotlinx.coroutines.flow.ChannelAsFlow
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 28
            r7 = 0
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object emitAll(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = 1
            java.lang.Object r1 = emitAllImpl$FlowKt__ChannelsKt(r1, r2, r0, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto Lc
            return r1
        Lc:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final <T> java.lang.Object emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector<? super T> r7, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r8, boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L4d
            if (r2 == r3) goto L3d
            if (r2 != r4) goto L35
            boolean r7 = r0.Z$0
            kotlinx.coroutines.channels.ReceiveChannel r8 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r9 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L8e
        L31:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L53
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            boolean r7 = r0.Z$0
            kotlinx.coroutines.channels.ReceiveChannel r8 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r9 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L8e
            kotlinx.coroutines.channels.ChannelResult r10 = (kotlinx.coroutines.channels.ChannelResult) r10     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r10 = r10.m1838unboximpl()     // Catch: java.lang.Throwable -> L8e
            goto L65
        L4d:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.flow.FlowKt.ensureActive(r7)
        L53:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L90
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L90
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L90
            r0.label = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r10 = r8.mo1819receiveCatchingJP2dKIU(r0)     // Catch: java.lang.Throwable -> L90
            if (r10 != r1) goto L62
            return r1
        L62:
            r6 = r9
            r9 = r7
            r7 = r6
        L65:
            r2 = 0
            boolean r5 = kotlinx.coroutines.channels.ChannelResult.m1834isClosedimpl(r10)     // Catch: java.lang.Throwable -> L8e
            if (r5 == 0) goto L7b
            java.lang.Throwable r9 = kotlinx.coroutines.channels.ChannelResult.m1830exceptionOrNullimpl(r10)     // Catch: java.lang.Throwable -> L8e
            if (r9 != 0) goto L7a
            if (r7 == 0) goto L77
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r2)
        L77:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L7a:
            throw r9     // Catch: java.lang.Throwable -> L8e
        L7b:
            java.lang.Object r10 = kotlinx.coroutines.channels.ChannelResult.m1832getOrThrowimpl(r10)     // Catch: java.lang.Throwable -> L8e
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L8e
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L8e
            r0.Z$0 = r7     // Catch: java.lang.Throwable -> L8e
            r0.label = r4     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r10 = r9.emit(r10, r0)     // Catch: java.lang.Throwable -> L8e
            if (r10 != r1) goto L31
            return r1
        L8e:
            r9 = move-exception
            goto L94
        L90:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L94:
            throw r9     // Catch: java.lang.Throwable -> L95
        L95:
            r10 = move-exception
            if (r7 == 0) goto L9b
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9)
        L9b:
            throw r10
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.channels.ReceiveChannel<T> produceIn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1) {
            kotlinx.coroutines.flow.internal.ChannelFlow r0 = kotlinx.coroutines.flow.internal.ChannelFlowKt.asChannelFlow(r0)
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.produceImpl(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> receiveAsFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends T> r9) {
            kotlinx.coroutines.flow.ChannelAsFlow r8 = new kotlinx.coroutines.flow.ChannelAsFlow
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 28
            r7 = 0
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }
}
