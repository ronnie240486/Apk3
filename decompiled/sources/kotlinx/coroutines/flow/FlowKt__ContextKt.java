package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\u0004\u001a(\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a0\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u000f"}, d2 = {"checkFlowContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "checkFlowContext$FlowKt__ContextKt", "buffer", "Lkotlinx/coroutines/flow/Flow;", "T", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "cancellable", "conflate", "flowOn", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ContextKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ kotlinx.coroutines.flow.Flow buffer(kotlinx.coroutines.flow.Flow r2, int r3) {
            r0 = 0
            r1 = 2
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.buffer$default(r2, r3, r0, r1, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> buffer(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r9, int r10, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r11) {
            r0 = 1
            r1 = 0
            r2 = -1
            if (r10 >= 0) goto Ld
            r3 = -2
            if (r10 == r3) goto Ld
            if (r10 != r2) goto Lb
            goto Ld
        Lb:
            r3 = 0
            goto Le
        Ld:
            r3 = 1
        Le:
            if (r3 == 0) goto L4d
            if (r10 != r2) goto L18
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r11 != r3) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L41
            if (r10 != r2) goto L21
            kotlinx.coroutines.channels.BufferOverflow r11 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r6 = r11
            r5 = 0
            goto L23
        L21:
            r5 = r10
            r6 = r11
        L23:
            boolean r10 = r9 instanceof kotlinx.coroutines.flow.internal.FusibleFlow
            if (r10 == 0) goto L35
            r2 = r9
            kotlinx.coroutines.flow.internal.FusibleFlow r2 = (kotlinx.coroutines.flow.internal.FusibleFlow) r2
            r3 = 0
            r9 = 1
            r7 = 0
            r4 = r5
            r5 = r6
            r6 = r9
            kotlinx.coroutines.flow.Flow r9 = kotlinx.coroutines.flow.internal.FusibleFlow.DefaultImpls.fuse$default(r2, r3, r4, r5, r6, r7)
            goto L40
        L35:
            kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl r10 = new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl
            r4 = 0
            r7 = 2
            r8 = 0
            r2 = r10
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9 = r10
        L40:
            return r9
        L41:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L4d:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            java.lang.String r10 = "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow buffer$default(kotlinx.coroutines.flow.Flow r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = -2
        L5:
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.buffer(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow buffer$default(kotlinx.coroutines.flow.Flow r0, int r1, kotlinx.coroutines.channels.BufferOverflow r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = -2
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        Lb:
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.buffer(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> cancellable(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.flow.CancellableFlow
            if (r0 == 0) goto L5
            goto Lb
        L5:
            kotlinx.coroutines.flow.CancellableFlowImpl r0 = new kotlinx.coroutines.flow.CancellableFlowImpl
            r0.<init>(r1)
            r1 = r0
        Lb:
            return r1
    }

    private static final void checkFlowContext$FlowKt__ContextKt(kotlin.coroutines.CoroutineContext r1) {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r1.get(r0)
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto Le
            return
        Le:
            java.lang.String r0 = "Flow context cannot contain job in it. Had "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> conflate(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r3) {
            r0 = -1
            r1 = 0
            r2 = 2
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.buffer$default(r3, r0, r1, r2, r1)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow<? extends T> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r9) {
            checkFlowContext$FlowKt__ContextKt(r9)
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r0)
            if (r0 == 0) goto Lc
            goto L2b
        Lc:
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.FusibleFlow
            if (r0 == 0) goto L1d
            r1 = r8
            kotlinx.coroutines.flow.internal.FusibleFlow r1 = (kotlinx.coroutines.flow.internal.FusibleFlow) r1
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r2 = r9
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.internal.FusibleFlow.DefaultImpls.fuse$default(r1, r2, r3, r4, r5, r6)
            goto L2b
        L1d:
            kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl r7 = new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8 = r7
        L2b:
            return r8
    }
}
