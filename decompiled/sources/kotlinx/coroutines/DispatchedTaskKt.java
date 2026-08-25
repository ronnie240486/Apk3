package kotlinx.coroutines;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a.\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000fH\u0002\u001a\u0019\u0010\u0016\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a'\u0010\u0019\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001e"}, d2 = {"MODE_ATOMIC", "", "MODE_CANCELLABLE", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE_REUSABLE", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "isCancellableMode", "", "(I)Z", "isReusableMode", "dispatch", "", "T", "Lkotlinx/coroutines/DispatchedTask;", "mode", "resume", "delegate", "Lkotlin/coroutines/Continuation;", "undispatched", "resumeUnconfined", "resumeWithStackTrace", "exception", "", "runUnconfinedEventLoop", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "block", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DispatchedTaskKt {
    public static final int MODE_ATOMIC = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_CANCELLABLE_REUSABLE = 2;
    public static final int MODE_UNDISPATCHED = 4;
    public static final int MODE_UNINITIALIZED = -1;

    public static final <T> void dispatch(@org.jetbrains.annotations.NotNull kotlinx.coroutines.DispatchedTask<? super T> r3, int r4) {
            kotlin.coroutines.Continuation r0 = r3.getDelegate$kotlinx_coroutines_core()
            r1 = 4
            if (r4 != r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            if (r1 != 0) goto L33
            boolean r2 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r2 == 0) goto L33
            boolean r4 = isCancellableMode(r4)
            int r2 = r3.resumeMode
            boolean r2 = isCancellableMode(r2)
            if (r4 != r2) goto L33
            r4 = r0
            kotlinx.coroutines.internal.DispatchedContinuation r4 = (kotlinx.coroutines.internal.DispatchedContinuation) r4
            kotlinx.coroutines.CoroutineDispatcher r4 = r4.dispatcher
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            boolean r1 = r4.isDispatchNeeded(r0)
            if (r1 == 0) goto L2f
            r4.mo1866dispatch(r0, r3)
            goto L36
        L2f:
            resumeUnconfined(r3)
            goto L36
        L33:
            resume(r3, r0, r1)
        L36:
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getMODE_CANCELLABLE$annotations() {
            return
    }

    public static final boolean isCancellableMode(int r2) {
            r0 = 1
            if (r2 == r0) goto L8
            r1 = 2
            if (r2 != r1) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public static final boolean isReusableMode(int r1) {
            r0 = 2
            if (r1 != r0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            return r1
    }

    public static final <T> void resume(@org.jetbrains.annotations.NotNull kotlinx.coroutines.DispatchedTask<? super T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r4, boolean r5) {
            java.lang.Object r0 = r3.takeState$kotlinx_coroutines_core()
            java.lang.Throwable r1 = r3.getExceptionalResult$kotlinx_coroutines_core(r0)
            if (r1 == 0) goto L11
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r1)
            goto L17
        L11:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r3 = r3.getSuccessfulResult$kotlinx_coroutines_core(r0)
        L17:
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            if (r5 == 0) goto L55
            kotlinx.coroutines.internal.DispatchedContinuation r4 = (kotlinx.coroutines.internal.DispatchedContinuation) r4
            kotlin.coroutines.Continuation<T> r5 = r4.continuation
            java.lang.Object r0 = r4.countOrElement
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()
            java.lang.Object r0 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r1, r0)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r0 == r2) goto L34
            kotlinx.coroutines.UndispatchedCoroutine r5 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r5, r1, r0)
            goto L35
        L34:
            r5 = 0
        L35:
            kotlin.coroutines.Continuation<T> r4 = r4.continuation     // Catch: java.lang.Throwable -> L48
            r4.resumeWith(r3)     // Catch: java.lang.Throwable -> L48
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L44
            boolean r3 = r5.clearThreadContext()
            if (r3 == 0) goto L58
        L44:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r0)
            goto L58
        L48:
            r3 = move-exception
            if (r5 == 0) goto L51
            boolean r4 = r5.clearThreadContext()
            if (r4 == 0) goto L54
        L51:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r0)
        L54:
            throw r3
        L55:
            r4.resumeWith(r3)
        L58:
            return
    }

    private static final void resumeUnconfined(kotlinx.coroutines.DispatchedTask<?> r4) {
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r1 = r0.isUnconfinedLoopActive()
            if (r1 == 0) goto L10
            r0.dispatchUnconfined(r4)
            goto L2a
        L10:
            r1 = 1
            r0.incrementUseCount(r1)
            kotlin.coroutines.Continuation r2 = r4.getDelegate$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L22
            resume(r4, r2, r1)     // Catch: java.lang.Throwable -> L22
        L1b:
            boolean r2 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L1b
            goto L27
        L22:
            r2 = move-exception
            r3 = 0
            r4.handleFatalException(r2, r3)     // Catch: java.lang.Throwable -> L2b
        L27:
            r0.decrementUseCount(r1)
        L2a:
            return
        L2b:
            r4 = move-exception
            r0.decrementUseCount(r1)
            throw r4
    }

    public static final void resumeWithStackTrace(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m333constructorimpl(r2)
            r1.resumeWith(r2)
            return
    }

    public static final void runUnconfinedEventLoop(@org.jetbrains.annotations.NotNull kotlinx.coroutines.DispatchedTask<?> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.EventLoop r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r4) {
            r0 = 1
            r3.incrementUseCount(r0)
            r4.invoke()     // Catch: java.lang.Throwable -> L11
        L7:
            boolean r4 = r3.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L11
            if (r4 != 0) goto L7
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            goto L19
        L11:
            r4 = move-exception
            r1 = 0
            r2.handleFatalException(r4, r1)     // Catch: java.lang.Throwable -> L20
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
        L19:
            r3.decrementUseCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return
        L20:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r3.decrementUseCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r2
    }
}
