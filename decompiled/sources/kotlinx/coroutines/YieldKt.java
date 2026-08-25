package kotlinx.coroutines;

/* JADX INFO: compiled from: Yield.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"yield", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class YieldKt {
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object yield(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            kotlin.coroutines.CoroutineContext r0 = r4.getContext()
            kotlinx.coroutines.JobKt.ensureActive(r0)
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r2 == 0) goto L12
            kotlinx.coroutines.internal.DispatchedContinuation r1 = (kotlinx.coroutines.internal.DispatchedContinuation) r1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 != 0) goto L18
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L49
        L18:
            kotlinx.coroutines.CoroutineDispatcher r2 = r1.dispatcher
            boolean r2 = r2.isDispatchNeeded(r0)
            if (r2 == 0) goto L26
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r1.dispatchYield$kotlinx_coroutines_core(r0, r2)
            goto L45
        L26:
            kotlinx.coroutines.YieldContext r2 = new kotlinx.coroutines.YieldContext
            r2.<init>()
            kotlin.coroutines.CoroutineContext r0 = r0.plus(r2)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            r1.dispatchYield$kotlinx_coroutines_core(r0, r3)
            boolean r0 = r2.dispatcherWasUnconfined
            if (r0 == 0) goto L45
            boolean r0 = kotlinx.coroutines.internal.DispatchedContinuationKt.yieldUndispatched(r1)
            if (r0 == 0) goto L43
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            goto L49
        L43:
            r0 = r3
            goto L49
        L45:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
        L49:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L52
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L52:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r4) goto L59
            return r0
        L59:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }
}
