package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000\u001a3\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0018\u0010\u000f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"getOrCreateCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "delegate", "Lkotlin/coroutines/Continuation;", "suspendCancellableCoroutine", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendCancellableCoroutineReusable", "disposeOnCancellation", "handle", "Lkotlinx/coroutines/DisposableHandle;", "removeOnCancellation", "node", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CancellableContinuationKt {
    @kotlinx.coroutines.InternalCoroutinesApi
    public static final void disposeOnCancellation(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<?> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.DisposableHandle r2) {
            kotlinx.coroutines.DisposeOnCancel r0 = new kotlinx.coroutines.DisposeOnCancel
            r0.<init>(r2)
            r1.invokeOnCancellation(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.CancellableContinuationImpl<T> getOrCreateCancellableContinuation(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 != 0) goto Lb
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            r1 = 1
            r0.<init>(r3, r1)
            return r0
        Lb:
            r0 = r3
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            kotlinx.coroutines.CancellableContinuationImpl r0 = r0.claimReusableCancellableContinuation()
            r1 = 0
            if (r0 != 0) goto L17
        L15:
            r0 = r1
            goto L1d
        L17:
            boolean r2 = r0.resetStateReusable()
            if (r2 == 0) goto L15
        L1d:
            if (r0 != 0) goto L25
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            r1 = 2
            r0.<init>(r3, r1)
        L25:
            return r0
    }

    public static final void removeOnCancellation(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<?> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            kotlinx.coroutines.RemoveOnCancel r0 = new kotlinx.coroutines.RemoveOnCancel
            r0.<init>(r2)
            r1.invokeOnCancellation(r0)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object suspendCancellableCoroutine(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super T>, kotlin.Unit> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r4) {
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            r3.invoke(r0)
            java.lang.Object r3 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r0) goto L1d
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L1d:
            return r3
    }

    private static final <T> java.lang.Object suspendCancellableCoroutine$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super T>, kotlin.Unit> r3, kotlin.coroutines.Continuation<? super T> r4) {
            r0 = 0
            kotlin.jvm.internal.InlineMarker.mark(r0)
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            r3.invoke(r0)
            java.lang.Object r3 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r0) goto L21
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L21:
            kotlin.jvm.internal.InlineMarker.mark(r2)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object suspendCancellableCoroutineReusable(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super T>, kotlin.Unit> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r2) {
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)
            kotlinx.coroutines.CancellableContinuationImpl r0 = getOrCreateCancellableContinuation(r0)
            r1.invoke(r0)
            java.lang.Object r1 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L18
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r2)
        L18:
            return r1
    }

    private static final <T> java.lang.Object suspendCancellableCoroutineReusable$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super T>, kotlin.Unit> r1, kotlin.coroutines.Continuation<? super T> r2) {
            r0 = 0
            kotlin.jvm.internal.InlineMarker.mark(r0)
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)
            kotlinx.coroutines.CancellableContinuationImpl r0 = getOrCreateCancellableContinuation(r0)
            r1.invoke(r0)
            java.lang.Object r1 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L1c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r2)
        L1c:
            r2 = 1
            kotlin.jvm.internal.InlineMarker.mark(r2)
            return r1
    }
}
