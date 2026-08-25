package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a6\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\r\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a#\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u0019*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u001b\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\u001c"}, d2 = {"NO_VALUE", "Lkotlinx/coroutines/internal/Symbol;", "getNO_VALUE$annotations", "()V", "MutableSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "T", "replay", "", "extraBufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "fuseSharedFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharedFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getBufferAt", "", "", "index", "", "([Ljava/lang/Object;J)Ljava/lang/Object;", "setBufferAt", "", "item", "([Ljava/lang/Object;JLjava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SharedFlowKt {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.Symbol NO_VALUE = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_VALUE"
            r0.<init>(r1)
            kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.MutableSharedFlow<T> MutableSharedFlow(int r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5) {
            r0 = 1
            r1 = 0
            if (r3 < 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r2 == 0) goto L4d
            if (r4 < 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L39
            if (r3 > 0) goto L1a
            if (r4 > 0) goto L1a
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r5 != r2) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L28
            int r4 = r4 + r3
            if (r4 >= 0) goto L22
            r4 = 2147483647(0x7fffffff, float:NaN)
        L22:
            kotlinx.coroutines.flow.SharedFlowImpl r0 = new kotlinx.coroutines.flow.SharedFlowImpl
            r0.<init>(r3, r4, r5)
            return r0
        L28:
            java.lang.String r3 = "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r5)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L39:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "extraBufferCapacity cannot be negative, but was "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r3)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L4d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "replay cannot be negative, but was "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r3)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public static /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow MutableSharedFlow$default(int r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r1 = 0
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lb
            r2 = 0
        Lb:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L11:
            kotlinx.coroutines.flow.MutableSharedFlow r1 = MutableSharedFlow(r1, r2, r3)
            return r1
    }

    public static final /* synthetic */ java.lang.Object access$getBufferAt(java.lang.Object[] r0, long r1) {
            java.lang.Object r0 = getBufferAt(r0, r1)
            return r0
    }

    public static final /* synthetic */ void access$setBufferAt(java.lang.Object[] r0, long r1, java.lang.Object r3) {
            setBufferAt(r0, r1, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> fuseSharedFlow(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharedFlow<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
            if (r3 == 0) goto L5
            r0 = -3
            if (r3 != r0) goto La
        L5:
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r0) goto La
            return r1
        La:
            kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl r0 = new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    private static final java.lang.Object getBufferAt(java.lang.Object[] r0, long r1) {
            int r2 = (int) r1
            int r1 = r0.length
            int r1 = r1 + (-1)
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
    }

    public static /* synthetic */ void getNO_VALUE$annotations() {
            return
    }

    private static final void setBufferAt(java.lang.Object[] r0, long r1, java.lang.Object r3) {
            int r2 = (int) r1
            int r1 = r0.length
            int r1 = r1 + (-1)
            r1 = r1 & r2
            r0[r1] = r3
            return
    }
}
