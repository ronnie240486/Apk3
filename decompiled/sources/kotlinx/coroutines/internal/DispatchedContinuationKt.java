package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082\b\u001aU\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u0012\u0010\u001d\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00100\bH\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "getREUSABLE_CLAIMED$annotations", "()V", "UNDEFINED", "getUNDEFINED$annotations", "executeUnconfined", "", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "contState", "", "mode", "", "doYield", "block", "Lkotlin/Function0;", "", "resumeCancellableWith", "T", "Lkotlin/coroutines/Continuation;", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "yieldUndispatched", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DispatchedContinuationKt {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.Symbol REUSABLE_CLAIMED = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol UNDEFINED = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "UNDEFINED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.DispatchedContinuationKt.UNDEFINED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "REUSABLE_CLAIMED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getUNDEFINED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.DispatchedContinuationKt.UNDEFINED
            return r0
    }

    private static final boolean executeUnconfined(kotlinx.coroutines.internal.DispatchedContinuation<?> r3, java.lang.Object r4, int r5, boolean r6, kotlin.jvm.functions.Function0<kotlin.Unit> r7) {
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            r1 = 0
            if (r6 == 0) goto L10
            boolean r6 = r0.isUnconfinedQueueEmpty()
            if (r6 == 0) goto L10
            return r1
        L10:
            boolean r6 = r0.isUnconfinedLoopActive()
            r2 = 1
            if (r6 == 0) goto L20
            r3._state = r4
            r3.resumeMode = r5
            r0.dispatchUnconfined(r3)
            r1 = 1
            goto L3e
        L20:
            r0.incrementUseCount(r2)
            r7.invoke()     // Catch: java.lang.Throwable -> L30
        L26:
            boolean r4 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L26
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            goto L38
        L30:
            r4 = move-exception
            r5 = 0
            r3.handleFatalException(r4, r5)     // Catch: java.lang.Throwable -> L3f
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
        L38:
            r0.decrementUseCount(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
        L3e:
            return r1
        L3f:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r0.decrementUseCount(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static /* synthetic */ void getREUSABLE_CLAIMED$annotations() {
            return
    }

    private static /* synthetic */ void getUNDEFINED$annotations() {
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public static final <T> void resumeCancellableWith(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r6, @org.jetbrains.annotations.NotNull java.lang.Object r7, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r8) {
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto Lb6
            kotlinx.coroutines.internal.DispatchedContinuation r6 = (kotlinx.coroutines.internal.DispatchedContinuation) r6
            java.lang.Object r8 = kotlinx.coroutines.CompletionStateKt.toState(r7, r8)
            kotlinx.coroutines.CoroutineDispatcher r0 = r6.dispatcher
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6._state = r8
            r6.resumeMode = r1
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.dispatcher
            kotlin.coroutines.CoroutineContext r8 = r6.getContext()
            r7.mo1866dispatch(r8, r6)
            goto Lb9
        L26:
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r2 = r0.isUnconfinedLoopActive()
            if (r2 == 0) goto L3b
            r6._state = r8
            r6.resumeMode = r1
            r0.dispatchUnconfined(r6)
            goto Lb9
        L3b:
            r0.incrementUseCount(r1)
            r2 = 0
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()     // Catch: java.lang.Throwable -> La9
            kotlinx.coroutines.Job$Key r4 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> La9
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r4)     // Catch: java.lang.Throwable -> La9
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto L69
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> La9
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r3 = r3.getCancellationException()     // Catch: java.lang.Throwable -> La9
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r3)     // Catch: java.lang.Throwable -> La9
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La9
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.Object r8 = kotlin.Result.m333constructorimpl(r8)     // Catch: java.lang.Throwable -> La9
            r6.resumeWith(r8)     // Catch: java.lang.Throwable -> La9
            r8 = 1
            goto L6a
        L69:
            r8 = 0
        L6a:
            if (r8 != 0) goto La2
            kotlin.coroutines.Continuation<T> r8 = r6.continuation     // Catch: java.lang.Throwable -> La9
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> La9
            kotlin.coroutines.CoroutineContext r4 = r8.getContext()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> La9
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> La9
            if (r3 == r5) goto L81
            kotlinx.coroutines.UndispatchedCoroutine r8 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r8, r4, r3)     // Catch: java.lang.Throwable -> La9
            goto L82
        L81:
            r8 = r2
        L82:
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L95
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L95
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L91
            boolean r7 = r8.clearThreadContext()     // Catch: java.lang.Throwable -> La9
            if (r7 == 0) goto La2
        L91:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> La9
            goto La2
        L95:
            r7 = move-exception
            if (r8 == 0) goto L9e
            boolean r8 = r8.clearThreadContext()     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto La1
        L9e:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> La9
        La1:
            throw r7     // Catch: java.lang.Throwable -> La9
        La2:
            boolean r7 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> La9
            if (r7 != 0) goto La2
            goto Lad
        La9:
            r7 = move-exception
            r6.handleFatalException(r7, r2)     // Catch: java.lang.Throwable -> Lb1
        Lad:
            r0.decrementUseCount(r1)
            goto Lb9
        Lb1:
            r6 = move-exception
            r0.decrementUseCount(r1)
            throw r6
        Lb6:
            r6.resumeWith(r7)
        Lb9:
            return
    }

    public static /* synthetic */ void resumeCancellableWith$default(kotlin.coroutines.Continuation r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            resumeCancellableWith(r0, r1, r2)
            return
    }

    public static final boolean yieldUndispatched(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.DispatchedContinuation<? super kotlin.Unit> r5) {
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            kotlinx.coroutines.ThreadLocalEventLoop r1 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r1 = r1.getEventLoop$kotlinx_coroutines_core()
            boolean r2 = r1.isUnconfinedQueueEmpty()
            r3 = 0
            if (r2 == 0) goto L10
            goto L35
        L10:
            boolean r2 = r1.isUnconfinedLoopActive()
            r4 = 1
            if (r2 == 0) goto L20
            r5._state = r0
            r5.resumeMode = r4
            r1.dispatchUnconfined(r5)
            r3 = 1
            goto L35
        L20:
            r1.incrementUseCount(r4)
            r5.run()     // Catch: java.lang.Throwable -> L2d
        L26:
            boolean r0 = r1.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L26
            goto L32
        L2d:
            r0 = move-exception
            r2 = 0
            r5.handleFatalException(r0, r2)     // Catch: java.lang.Throwable -> L36
        L32:
            r1.decrementUseCount(r4)
        L35:
            return r3
        L36:
            r5 = move-exception
            r1.decrementUseCount(r4)
            throw r5
    }
}
