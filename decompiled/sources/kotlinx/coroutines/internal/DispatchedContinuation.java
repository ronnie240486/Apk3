package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000O2\u00060?j\u0002`@2\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\nJH\u0010+\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2%\b\b\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010'H\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u000bH\u0086\b¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u00101J \u00102\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00101J\u0011\u00105\u001a\u0004\u0018\u00010\u000bH\u0010¢\u0006\u0004\b3\u00104J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u001b\u0010:\u001a\u0004\u0018\u00010\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u000309¢\u0006\u0004\b:\u0010;R\u001e\u0010<\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010\nR\u001c\u0010C\u001a\n\u0018\u00010?j\u0004\u0018\u0001`@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010G\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bG\u0010=R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010KR\u001a\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "", "awaitReusability", "()V", "", "takenState", "", "cause", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "Lkotlinx/coroutines/CancellableContinuationImpl;", "claimReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "dispatchYield", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "isReusable", "()Z", "postponeCancellation", "(Ljava/lang/Throwable;)Z", "release", "Lkotlin/Result;", "result", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "resumeCancellableWith", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "state", "resumeCancelled", "(Ljava/lang/Object;)Z", "resumeUndispatchedWith", "(Ljava/lang/Object;)V", "resumeWith", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CancellableContinuation;", "tryReleaseClaimedContinuation", "(Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Throwable;", "_state", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "countOrElement", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/CoroutineDispatcher;", "getReusableCancellableContinuation", "reusableCancellableContinuation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DispatchedContinuation<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _reusableCancellableContinuation$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public java.lang.Object _state;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<T> continuation;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object countOrElement;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    static {
            java.lang.Class<kotlinx.coroutines.internal.DispatchedContinuation> r0 = kotlinx.coroutines.internal.DispatchedContinuation.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_reusableCancellableContinuation"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU = r0
            return
    }

    public DispatchedContinuation(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineDispatcher r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.dispatcher = r2
            r1.continuation = r3
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            r1._state = r2
            kotlin.coroutines.CoroutineContext r2 = r1.getContext()
            java.lang.Object r2 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r2)
            r1.countOrElement = r2
            r2 = 0
            r1._reusableCancellableContinuation = r2
            return
    }

    private final kotlinx.coroutines.CancellableContinuationImpl<?> getReusableCancellableContinuation() {
            r2 = this;
            java.lang.Object r0 = r2._reusableCancellableContinuation
            boolean r1 = r0 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r1 == 0) goto L9
            kotlinx.coroutines.CancellableContinuationImpl r0 = (kotlinx.coroutines.CancellableContinuationImpl) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
            return
    }

    public final void awaitReusability() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._reusableCancellableContinuation
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            if (r0 == r1) goto L0
            return
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CompletedWithCancellation
            if (r0 == 0) goto Lb
            kotlinx.coroutines.CompletedWithCancellation r2 = (kotlinx.coroutines.CompletedWithCancellation) r2
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r2 = r2.onCancellation
            r2.invoke(r3)
        Lb:
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.CancellableContinuationImpl<T> claimReusableCancellableContinuation() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._reusableCancellableContinuation
            if (r0 != 0) goto La
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            r4._reusableCancellableContinuation = r0
            r0 = 0
            return r0
        La:
            boolean r1 = r0 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r1 == 0) goto L26
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
        L12:
            boolean r3 = r1.compareAndSet(r4, r0, r2)
            if (r3 == 0) goto L1a
            r1 = 1
            goto L21
        L1a:
            java.lang.Object r3 = r1.get(r4)
            if (r3 == r0) goto L12
            r1 = 0
        L21:
            if (r1 == 0) goto L0
            kotlinx.coroutines.CancellableContinuationImpl r0 = (kotlinx.coroutines.CancellableContinuationImpl) r0
            return r0
        L26:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            if (r0 != r1) goto L2b
            goto L0
        L2b:
            boolean r1 = r0 instanceof java.lang.Throwable
            if (r1 == 0) goto L30
            goto L0
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Inconsistent state "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final void dispatchYield$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, T r2) {
            r0 = this;
            r0._state = r2
            r2 = 1
            r0.resumeMode = r2
            kotlinx.coroutines.CoroutineDispatcher r2 = r0.dispatcher
            r2.dispatchYield(r1, r0)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.continuation
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.Continuation<T> r0 = r1.continuation
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
            r0 = this;
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean isReusable() {
            r1 = this;
            java.lang.Object r0 = r1._reusableCancellableContinuation
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean postponeCancellation(@org.jetbrains.annotations.NotNull java.lang.Throwable r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = r6._reusableCancellableContinuation
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
        Le:
            boolean r0 = r2.compareAndSet(r6, r1, r7)
            if (r0 == 0) goto L16
            r3 = 1
            goto L1c
        L16:
            java.lang.Object r0 = r2.get(r6)
            if (r0 == r1) goto Le
        L1c:
            if (r3 == 0) goto L0
            return r4
        L1f:
            boolean r1 = r0 instanceof java.lang.Throwable
            if (r1 == 0) goto L24
            return r4
        L24:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            r2 = 0
        L27:
            boolean r5 = r1.compareAndSet(r6, r0, r2)
            if (r5 == 0) goto L2e
            goto L35
        L2e:
            java.lang.Object r5 = r1.get(r6)
            if (r5 == r0) goto L27
            r4 = 0
        L35:
            if (r4 == 0) goto L0
            return r3
    }

    public final void release() {
            r1 = this;
            r1.awaitReusability()
            kotlinx.coroutines.CancellableContinuationImpl r0 = r1.getReusableCancellableContinuation()
            if (r0 != 0) goto La
            goto Ld
        La:
            r0.detachChild$kotlinx_coroutines_core()
        Ld:
            return
    }

    public final void resumeCancellableWith(@org.jetbrains.annotations.NotNull java.lang.Object r7, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r8) {
            r6 = this;
            java.lang.Object r8 = kotlinx.coroutines.CompletionStateKt.toState(r7, r8)
            kotlinx.coroutines.CoroutineDispatcher r0 = r6.dispatcher
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L20
            r6._state = r8
            r6.resumeMode = r1
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.dispatcher
            kotlin.coroutines.CoroutineContext r8 = r6.getContext()
            r7.mo1866dispatch(r8, r6)
            goto Lbf
        L20:
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r2 = r0.isUnconfinedLoopActive()
            if (r2 == 0) goto L35
            r6._state = r8
            r6.resumeMode = r1
            r0.dispatchUnconfined(r6)
            goto Lbf
        L35:
            r0.incrementUseCount(r1)
            r2 = 0
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()     // Catch: java.lang.Throwable -> Lb2
            kotlinx.coroutines.Job$Key r4 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> Lb2
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r4)     // Catch: java.lang.Throwable -> Lb2
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3     // Catch: java.lang.Throwable -> Lb2
            if (r3 == 0) goto L63
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> Lb2
            if (r4 != 0) goto L63
            java.util.concurrent.CancellationException r3 = r3.getCancellationException()     // Catch: java.lang.Throwable -> Lb2
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r3)     // Catch: java.lang.Throwable -> Lb2
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r8 = kotlin.Result.m333constructorimpl(r8)     // Catch: java.lang.Throwable -> Lb2
            r6.resumeWith(r8)     // Catch: java.lang.Throwable -> Lb2
            r8 = 1
            goto L64
        L63:
            r8 = 0
        L64:
            if (r8 != 0) goto La8
            kotlin.coroutines.Continuation<T> r8 = r6.continuation     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> Lb2
            kotlin.coroutines.CoroutineContext r4 = r8.getContext()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> Lb2
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> Lb2
            if (r3 == r5) goto L7b
            kotlinx.coroutines.UndispatchedCoroutine r8 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r8, r4, r3)     // Catch: java.lang.Throwable -> Lb2
            goto L7c
        L7b:
            r8 = r2
        L7c:
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L95
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L95
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L95
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r8 == 0) goto L8e
            boolean r7 = r8.clearThreadContext()     // Catch: java.lang.Throwable -> Lb2
            if (r7 == 0) goto L91
        L8e:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> Lb2
        L91:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)     // Catch: java.lang.Throwable -> Lb2
            goto La8
        L95:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r8 == 0) goto La1
            boolean r8 = r8.clearThreadContext()     // Catch: java.lang.Throwable -> Lb2
            if (r8 == 0) goto La4
        La1:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> Lb2
        La4:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)     // Catch: java.lang.Throwable -> Lb2
            throw r7     // Catch: java.lang.Throwable -> Lb2
        La8:
            boolean r7 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> Lb2
            if (r7 != 0) goto La8
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            goto Lb9
        Lb2:
            r7 = move-exception
            r6.handleFatalException(r7, r2)     // Catch: java.lang.Throwable -> Lc0
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
        Lb9:
            r0.decrementUseCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
        Lbf:
            return
        Lc0:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r0.decrementUseCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
    }

    public final boolean resumeCancelled(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 == 0) goto L2a
            boolean r1 = r0.isActive()
            if (r1 != 0) goto L2a
            java.util.concurrent.CancellationException r0 = r0.getCancellationException()
            r2.cancelCompletedResult$kotlinx_coroutines_core(r3, r0)
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            r2.resumeWith(r3)
            r3 = 1
            return r3
        L2a:
            r3 = 0
            return r3
    }

    public final void resumeUndispatchedWith(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            r5 = this;
            kotlin.coroutines.Continuation<T> r0 = r5.continuation
            java.lang.Object r1 = r5.countOrElement
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r2, r1)
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r1 == r3) goto L15
            kotlinx.coroutines.UndispatchedCoroutine r0 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r0, r2, r1)
            goto L16
        L15:
            r0 = 0
        L16:
            r3 = 1
            kotlin.coroutines.Continuation<T> r4 = r5.continuation     // Catch: java.lang.Throwable -> L30
            r4.resumeWith(r6)     // Catch: java.lang.Throwable -> L30
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L30
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            if (r0 == 0) goto L29
            boolean r6 = r0.clearThreadContext()
            if (r6 == 0) goto L2c
        L29:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r1)
        L2c:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return
        L30:
            r6 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            if (r0 == 0) goto L3c
            boolean r0 = r0.clearThreadContext()
            if (r0 == 0) goto L3f
        L3c:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r1)
        L3f:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r6
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            r6 = this;
            kotlin.coroutines.Continuation<T> r0 = r6.continuation
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.CompletionStateKt.toState$default(r7, r1, r2, r1)
            kotlinx.coroutines.CoroutineDispatcher r4 = r6.dispatcher
            boolean r4 = r4.isDispatchNeeded(r0)
            r5 = 0
            if (r4 == 0) goto L1f
            r6._state = r3
            r6.resumeMode = r5
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.dispatcher
            r7.mo1866dispatch(r0, r6)
            goto L5d
        L1f:
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r4 = r0.isUnconfinedLoopActive()
            if (r4 == 0) goto L33
            r6._state = r3
            r6.resumeMode = r5
            r0.dispatchUnconfined(r6)
            goto L5d
        L33:
            r0.incrementUseCount(r2)
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()     // Catch: java.lang.Throwable -> L56
            java.lang.Object r4 = r6.countOrElement     // Catch: java.lang.Throwable -> L56
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r3, r4)     // Catch: java.lang.Throwable -> L56
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L51
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L51
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L51
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r4)     // Catch: java.lang.Throwable -> L56
        L4a:
            boolean r7 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L56
            if (r7 != 0) goto L4a
            goto L5a
        L51:
            r7 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r4)     // Catch: java.lang.Throwable -> L56
            throw r7     // Catch: java.lang.Throwable -> L56
        L56:
            r7 = move-exception
            r6.handleFatalException(r7, r1)     // Catch: java.lang.Throwable -> L5e
        L5a:
            r0.decrementUseCount(r2)
        L5d:
            return
        L5e:
            r7 = move-exception
            r0.decrementUseCount(r2)
            throw r7
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @org.jetbrains.annotations.Nullable
    public java.lang.Object takeState$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.Object r0 = r2._state
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            r2._state = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "DispatchedContinuation["
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            kotlinx.coroutines.CoroutineDispatcher r1 = r2.dispatcher
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            kotlin.coroutines.Continuation<T> r1 = r2.continuation
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.toDebugString(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Throwable tryReleaseClaimedContinuation(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<?> r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = r6._reusableCancellableContinuation
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
        Lb:
            boolean r0 = r5.compareAndSet(r6, r1, r7)
            if (r0 == 0) goto L13
            r3 = 1
            goto L19
        L13:
            java.lang.Object r0 = r5.get(r6)
            if (r0 == r1) goto Lb
        L19:
            if (r3 == 0) goto L0
            return r2
        L1c:
            boolean r7 = r0 instanceof java.lang.Throwable
            if (r7 == 0) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
        L22:
            boolean r1 = r7.compareAndSet(r6, r0, r2)
            if (r1 == 0) goto L2a
            r3 = 1
            goto L30
        L2a:
            java.lang.Object r1 = r7.get(r6)
            if (r1 == r0) goto L22
        L30:
            if (r3 == 0) goto L35
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L35:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L41:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r1 = "Inconsistent state "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
    }
}
