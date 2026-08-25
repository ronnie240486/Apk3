package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0013B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f0\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0002J\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "<init>", "()V", "Lkotlinx/coroutines/flow/StateFlowImpl;", "flow", "", "allocateLocked", "(Lkotlinx/coroutines/flow/StateFlowImpl;)Z", "", "awaitPending", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlin/coroutines/Continuation;", "freeLocked", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "makePending", "takePending", "()Z", "kotlinx-coroutines-core", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class StateFlowSlot extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlinx.coroutines.flow.StateFlowImpl<?>> {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;

    @org.jetbrains.annotations.NotNull
    public volatile /* synthetic */ java.lang.Object _state;

    static {
            java.lang.Class<kotlinx.coroutines.flow.StateFlowSlot> r0 = kotlinx.coroutines.flow.StateFlowSlot.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.flow.StateFlowSlot._state$FU = r0
            return
    }

    public StateFlowSlot() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._state = r0
            return
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ boolean allocateLocked(kotlinx.coroutines.flow.StateFlowImpl<?> r1) {
            r0 = this;
            kotlinx.coroutines.flow.StateFlowImpl r1 = (kotlinx.coroutines.flow.StateFlowImpl) r1
            boolean r1 = r0.allocateLocked2(r1)
            return r1
    }

    /* JADX INFO: renamed from: allocateLocked, reason: avoid collision after fix types in other method */
    public boolean allocateLocked2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.StateFlowImpl<?> r1) {
            r0 = this;
            java.lang.Object r1 = r0._state
            if (r1 == 0) goto L6
            r1 = 0
            return r1
        L6:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            r0._state = r1
            r1 = 1
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object awaitPending(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            r5 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
        L13:
            boolean r4 = r1.compareAndSet(r5, r3, r0)
            if (r4 == 0) goto L1a
            goto L21
        L1a:
            java.lang.Object r4 = r1.get(r5)
            if (r4 == r3) goto L13
            r2 = 0
        L21:
            if (r2 == 0) goto L24
            goto L2f
        L24:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)
            r0.resumeWith(r1)
        L2f:
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L3c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L3c:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r6) goto L43
            return r0
        L43:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ kotlin.coroutines.Continuation[] freeLocked(kotlinx.coroutines.flow.StateFlowImpl<?> r1) {
            r0 = this;
            kotlinx.coroutines.flow.StateFlowImpl r1 = (kotlinx.coroutines.flow.StateFlowImpl) r1
            kotlin.coroutines.Continuation[] r1 = r0.freeLocked2(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: freeLocked, reason: avoid collision after fix types in other method */
    public kotlin.coroutines.Continuation<kotlin.Unit>[] freeLocked2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.StateFlowImpl<?> r1) {
            r0 = this;
            r1 = 0
            r0._state = r1
            kotlin.coroutines.Continuation<kotlin.Unit>[] r1 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r1
    }

    public final void makePending() {
            r6 = this;
        L0:
            java.lang.Object r0 = r6._state
            if (r0 != 0) goto L5
            return
        L5:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r0 != r1) goto Lc
            return
        Lc:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
        L1a:
            boolean r5 = r1.compareAndSet(r6, r0, r4)
            if (r5 == 0) goto L22
            r2 = 1
            goto L28
        L22:
            java.lang.Object r5 = r1.get(r6)
            if (r5 == r0) goto L1a
        L28:
            if (r2 == 0) goto L0
            return
        L2b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
        L31:
            boolean r5 = r1.compareAndSet(r6, r0, r4)
            if (r5 == 0) goto L39
            r2 = 1
            goto L3f
        L39:
            java.lang.Object r5 = r1.get(r6)
            if (r5 == r0) goto L31
        L3f:
            if (r2 == 0) goto L0
            kotlinx.coroutines.CancellableContinuationImpl r0 = (kotlinx.coroutines.CancellableContinuationImpl) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = kotlin.Result.m333constructorimpl(r1)
            r0.resumeWith(r1)
            return
    }

    public final boolean takePending() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r0 != r1) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }
}
