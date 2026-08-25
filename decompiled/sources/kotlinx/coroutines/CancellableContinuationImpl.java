package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001f\u0012\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000s\u0012\u0006\u0010-\u001a\u00020'¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0017\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010\"\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J8\u0010%\u001a\u00020$2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*JZ\u00100\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\b\u0010/\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b0\u00101JH\u00102\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2%\b\u0002\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b2\u00103JJ\u00105\u001a\u0004\u0018\u0001042\b\u0010,\u001a\u0004\u0018\u00010 2\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u0002072\b\u0010,\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u001fJ\u000f\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010\u001fJ\u000f\u0010<\u001a\u00020\u0006H\u0001¢\u0006\u0004\b<\u0010\bJ\u0017\u0010?\u001a\n\u0018\u00010=j\u0004\u0018\u0001`>H\u0016¢\u0006\u0004\b?\u0010@J\u0011\u0010C\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bA\u0010BJ!\u0010G\u001a\u00020\u000e2\b\u0010D\u001a\u0004\u0018\u00010 2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bH\u0010\fJ\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\bI\u0010JJ\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020$2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0017\u0010LJ8\u0010M\u001a\u00020\u000e2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bM\u0010\u0018J\u0017\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u0011\u0010R\u001a\u0004\u0018\u00010 H\u0001¢\u0006\u0004\bR\u0010BJ \u0010U\u001a\u00020\u000e2\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000SH\u0016ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ<\u0010X\u001a\u00020\u000e2\u0006\u0010W\u001a\u00028\u00002#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\bX\u0010YJ8\u0010Z\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010]\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\\\u0010\u001fJ#\u0010\u001a\u001a\u0004\u0018\u00010 2\u0006\u0010W\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\u001a\u0010^JH\u0010\u001a\u001a\u0004\u0018\u00010 2\u0006\u0010W\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010_J\u0019\u0010a\u001a\u0004\u0018\u00010 2\u0006\u0010`\u001a\u00020\tH\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020 H\u0016¢\u0006\u0004\bd\u0010VJ\u001b\u0010f\u001a\u00020\u000e*\u00020e2\u0006\u0010W\u001a\u00028\u0000H\u0016¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u00020\u000e*\u00020e2\u0006\u0010`\u001a\u00020\tH\u0016¢\u0006\u0004\bh\u0010iJ\u001f\u0010l\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bj\u0010kJ\u001b\u0010o\u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bm\u0010nJ\u000f\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\bq\u0010rR \u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000s8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010y\u001a\u00020x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0018\u0010}\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0015\u0010\u0080\u0001\u001a\u00020p8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010rR\u0017\u0010!\u001a\u0004\u0018\u00010 8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010BR\u0016\u0010\u0082\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\bR\u0016\u0010\u0083\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\bR\u0016\u0010\u0084\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\bR\u001f\u0010\u0087\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008a\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "isReusable", "()Z", "", "cause", "cancelLater", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function0;", "", "block", "callCancelHandlerSafely", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "callCancelHandler", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "trySuspend", "tryResume", "Lkotlinx/coroutines/DisposableHandle;", "installParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "releaseClaimedReusableContinuation", "()V", "", "state", "multipleHandlersError", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "Lkotlinx/coroutines/CancelHandler;", "makeCancelHandler", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/CancelHandler;", "", "mode", "dispatchResume", "(I)V", "Lkotlinx/coroutines/NotCompleted;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "resumedState", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "resumeImpl", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/Symbol;", "", "alreadyResumedError", "(Ljava/lang/Object;)Ljava/lang/Void;", "detachChildIfNonResuable", "initCancellability", "resetStateReusable", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "cancel", "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "(Lkotlinx/coroutines/CancelHandler;Ljava/lang/Throwable;)V", "callOnCancellation", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "getResult", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "resume", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "invokeOnCancellation", "(Lkotlin/jvm/functions/Function1;)V", "detachChild$kotlinx_coroutines_core", "detachChild", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "completeResume", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getExceptionalResult", "", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/Continuation;", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "getStateDebugRepresentation", "stateDebugRepresentation", "getState$kotlinx_coroutines_core", "isActive", "isCompleted", "isCancelled", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@kotlin.PublishedApi
public class CancellableContinuationImpl<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlinx.coroutines.CancellableContinuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _decision$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ int _decision;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _state;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.CoroutineContext context;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.Continuation<T> delegate;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.DisposableHandle parentHandle;

    static {
            java.lang.Class<kotlinx.coroutines.CancellableContinuationImpl> r0 = kotlinx.coroutines.CancellableContinuationImpl.class
            java.lang.String r1 = "_decision"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.CancellableContinuationImpl._decision$FU = r0
            java.lang.Class<kotlinx.coroutines.CancellableContinuationImpl> r0 = kotlinx.coroutines.CancellableContinuationImpl.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.CancellableContinuationImpl._state$FU = r0
            return
    }

    public CancellableContinuationImpl(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r1, int r2) {
            r0 = this;
            r0.<init>(r2)
            r0.delegate = r1
            kotlin.coroutines.CoroutineContext r1 = r1.getContext()
            r0.context = r1
            r1 = 0
            r0._decision = r1
            kotlinx.coroutines.Active r1 = kotlinx.coroutines.Active.INSTANCE
            r0._state = r1
            return
    }

    private final java.lang.Void alreadyResumedError(java.lang.Object r3) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed, but proposed with update "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private final void callCancelHandler(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3, java.lang.Throwable r4) {
            r2 = this;
            r3.invoke(r4)     // Catch: java.lang.Throwable -> L4
            goto L17
        L4:
            r3 = move-exception
            kotlin.coroutines.CoroutineContext r4 = r2.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.String r1 = "Exception in invokeOnCancellation handler for "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)
            r0.<init>(r1, r3)
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r4, r0)
        L17:
            return
    }

    private final void callCancelHandlerSafely(kotlin.jvm.functions.Function0<kotlin.Unit> r4) {
            r3 = this;
            r4.invoke()     // Catch: java.lang.Throwable -> L4
            goto L17
        L4:
            r4 = move-exception
            kotlin.coroutines.CoroutineContext r0 = r3.getContext()
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r3)
            r1.<init>(r2, r4)
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r0, r1)
        L17:
            return
    }

    private final boolean cancelLater(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.isReusable()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            kotlin.coroutines.Continuation<T> r0 = r1.delegate
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            boolean r2 = r0.postponeCancellation(r2)
            return r2
    }

    private final void detachChildIfNonResuable() {
            r1 = this;
            boolean r0 = r1.isReusable()
            if (r0 != 0) goto L9
            r1.detachChild$kotlinx_coroutines_core()
        L9:
            return
    }

    private final void dispatchResume(int r2) {
            r1 = this;
            boolean r0 = r1.tryResume()
            if (r0 == 0) goto L7
            return
        L7:
            kotlinx.coroutines.DispatchedTaskKt.dispatch(r1, r2)
            return
    }

    private final java.lang.String getStateDebugRepresentation() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r1 == 0) goto Lb
            java.lang.String r0 = "Active"
            goto L14
        Lb:
            boolean r0 = r0 instanceof kotlinx.coroutines.CancelledContinuation
            if (r0 == 0) goto L12
            java.lang.String r0 = "Cancelled"
            goto L14
        L12:
            java.lang.String r0 = "Completed"
        L14:
            return r0
    }

    private final kotlinx.coroutines.DisposableHandle installParentHandle() {
            r7 = this;
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            r1 = r0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 != 0) goto L11
            r0 = 0
            return r0
        L11:
            r2 = 1
            r3 = 0
            kotlinx.coroutines.ChildContinuation r4 = new kotlinx.coroutines.ChildContinuation
            r4.<init>(r7)
            r5 = 2
            r6 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r1, r2, r3, r4, r5, r6)
            r7.parentHandle = r0
            return r0
    }

    private final boolean isReusable() {
            r1 = this;
            int r0 = r1.resumeMode
            boolean r0 = kotlinx.coroutines.DispatchedTaskKt.isReusableMode(r0)
            if (r0 == 0) goto L14
            kotlin.coroutines.Continuation<T> r0 = r1.delegate
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            boolean r0 = r0.isReusable()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    private final kotlinx.coroutines.CancelHandler makeCancelHandler(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CancelHandler
            if (r0 == 0) goto L7
            kotlinx.coroutines.CancelHandler r2 = (kotlinx.coroutines.CancelHandler) r2
            goto Ld
        L7:
            kotlinx.coroutines.InvokeOnCancel r0 = new kotlinx.coroutines.InvokeOnCancel
            r0.<init>(r2)
            r2 = r0
        Ld:
            return r2
    }

    private final void multipleHandlersError(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4, java.lang.Object r5) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "It's prohibited to register multiple handlers, tried to register "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", already has "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private final void releaseClaimedReusableContinuation() {
            r3 = this;
            kotlin.coroutines.Continuation<T> r0 = r3.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 != 0) goto Le
            goto L12
        Le:
            java.lang.Throwable r2 = r0.tryReleaseClaimedContinuation(r3)
        L12:
            if (r2 != 0) goto L15
            return
        L15:
            r3.detachChild$kotlinx_coroutines_core()
            r3.cancel(r2)
            return
    }

    private final void resumeImpl(java.lang.Object r9, int r10, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r11) {
            r8 = this;
        L0:
            java.lang.Object r0 = r8._state
            boolean r1 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r1 == 0) goto L2d
            r3 = r0
            kotlinx.coroutines.NotCompleted r3 = (kotlinx.coroutines.NotCompleted) r3
            r7 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            java.lang.Object r1 = r2.resumedState(r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
        L14:
            boolean r3 = r2.compareAndSet(r8, r0, r1)
            if (r3 == 0) goto L1c
            r0 = 1
            goto L23
        L1c:
            java.lang.Object r3 = r2.get(r8)
            if (r3 == r0) goto L14
            r0 = 0
        L23:
            if (r0 != 0) goto L26
            goto L0
        L26:
            r8.detachChildIfNonResuable()
            r8.dispatchResume(r10)
            return
        L2d:
            boolean r10 = r0 instanceof kotlinx.coroutines.CancelledContinuation
            if (r10 == 0) goto L42
            kotlinx.coroutines.CancelledContinuation r0 = (kotlinx.coroutines.CancelledContinuation) r0
            boolean r10 = r0.makeResumed()
            if (r10 == 0) goto L42
            if (r11 != 0) goto L3c
            goto L41
        L3c:
            java.lang.Throwable r9 = r0.cause
            r8.callOnCancellation(r11, r9)
        L41:
            return
        L42:
            r8.alreadyResumedError(r9)
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
    }

    public static /* synthetic */ void resumeImpl$default(kotlinx.coroutines.CancellableContinuationImpl r0, java.lang.Object r1, int r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r3 = 0
            r0.resumeImpl(r1, r2, r3)
            return
    }

    private final java.lang.Object resumedState(kotlinx.coroutines.NotCompleted r9, java.lang.Object r10, int r11, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r12, java.lang.Object r13) {
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L5
            goto L31
        L5:
            boolean r11 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r11)
            if (r11 != 0) goto Le
            if (r13 != 0) goto Le
            goto L31
        Le:
            if (r12 != 0) goto L1a
            boolean r11 = r9 instanceof kotlinx.coroutines.CancelHandler
            if (r11 == 0) goto L18
            boolean r11 = r9 instanceof kotlinx.coroutines.BeforeResumeCancelHandler
            if (r11 == 0) goto L1a
        L18:
            if (r13 == 0) goto L31
        L1a:
            kotlinx.coroutines.CompletedContinuation r11 = new kotlinx.coroutines.CompletedContinuation
            boolean r0 = r9 instanceof kotlinx.coroutines.CancelHandler
            if (r0 == 0) goto L23
            kotlinx.coroutines.CancelHandler r9 = (kotlinx.coroutines.CancelHandler) r9
            goto L24
        L23:
            r9 = 0
        L24:
            r2 = r9
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r11
            r1 = r10
            r3 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10 = r11
        L31:
            return r10
    }

    private final boolean tryResume() {
            r4 = this;
        L0:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto L9
            return r1
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._decision$FU
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L0
            return r2
    }

    private final kotlinx.coroutines.internal.Symbol tryResumeImpl(java.lang.Object r9, java.lang.Object r10, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r11) {
            r8 = this;
        L0:
            java.lang.Object r0 = r8._state
            boolean r1 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r1 == 0) goto L2d
            r3 = r0
            kotlinx.coroutines.NotCompleted r3 = (kotlinx.coroutines.NotCompleted) r3
            int r5 = r8.resumeMode
            r2 = r8
            r4 = r9
            r6 = r11
            r7 = r10
            java.lang.Object r1 = r2.resumedState(r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
        L15:
            boolean r3 = r2.compareAndSet(r8, r0, r1)
            if (r3 == 0) goto L1d
            r0 = 1
            goto L24
        L1d:
            java.lang.Object r3 = r2.get(r8)
            if (r3 == r0) goto L15
            r0 = 0
        L24:
            if (r0 != 0) goto L27
            goto L0
        L27:
            r8.detachChildIfNonResuable()
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            return r9
        L2d:
            boolean r9 = r0 instanceof kotlinx.coroutines.CompletedContinuation
            r11 = 0
            if (r9 == 0) goto L3c
            if (r10 == 0) goto L3c
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            java.lang.Object r9 = r0.idempotentResume
            if (r9 != r10) goto L3c
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
        L3c:
            return r11
    }

    private final boolean trySuspend() {
            r3 = this;
        L0:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L15
            r2 = 2
            if (r0 != r2) goto L9
            return r1
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._decision$FU
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            return r2
    }

    public final void callCancelHandler(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CancelHandler r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
            r2 = this;
            r3.invoke(r4)     // Catch: java.lang.Throwable -> L4
            goto L17
        L4:
            r3 = move-exception
            kotlin.coroutines.CoroutineContext r4 = r2.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.String r1 = "Exception in invokeOnCancellation handler for "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)
            r0.<init>(r1, r3)
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r4, r0)
        L17:
            return
    }

    public final void callOnCancellation(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3, @org.jetbrains.annotations.NotNull java.lang.Throwable r4) {
            r2 = this;
            r3.invoke(r4)     // Catch: java.lang.Throwable -> L4
            goto L17
        L4:
            r3 = move-exception
            kotlin.coroutines.CoroutineContext r4 = r2.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.String r1 = "Exception in resume onCancellation handler for "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)
            r0.<init>(r1, r3)
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r4, r0)
        L17:
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(@org.jetbrains.annotations.Nullable java.lang.Throwable r8) {
            r7 = this;
        L0:
            java.lang.Object r0 = r7._state
            boolean r1 = r0 instanceof kotlinx.coroutines.NotCompleted
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            kotlinx.coroutines.CancelledContinuation r1 = new kotlinx.coroutines.CancelledContinuation
            boolean r3 = r0 instanceof kotlinx.coroutines.CancelHandler
            r1.<init>(r7, r8, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
        L11:
            boolean r5 = r4.compareAndSet(r7, r0, r1)
            r6 = 1
            if (r5 == 0) goto L1a
            r2 = 1
            goto L20
        L1a:
            java.lang.Object r5 = r4.get(r7)
            if (r5 == r0) goto L11
        L20:
            if (r2 != 0) goto L23
            goto L0
        L23:
            if (r3 == 0) goto L28
            kotlinx.coroutines.CancelHandler r0 = (kotlinx.coroutines.CancelHandler) r0
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 != 0) goto L2c
            goto L2f
        L2c:
            r7.callCancelHandler(r0, r8)
        L2f:
            r7.detachChildIfNonResuable()
            int r8 = r7.resumeMode
            r7.dispatchResume(r8)
            return r6
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable java.lang.Object r21, @org.jetbrains.annotations.NotNull java.lang.Throwable r22) {
            r20 = this;
            r0 = r20
        L2:
            java.lang.Object r9 = r0._state
            boolean r1 = r9 instanceof kotlinx.coroutines.NotCompleted
            if (r1 != 0) goto L78
            boolean r1 = r9 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto Ld
            return
        Ld:
            boolean r1 = r9 instanceof kotlinx.coroutines.CompletedContinuation
            r10 = 0
            r11 = 1
            if (r1 == 0) goto L54
            r1 = r9
            kotlinx.coroutines.CompletedContinuation r1 = (kotlinx.coroutines.CompletedContinuation) r1
            boolean r2 = r1.getCancelled()
            r2 = r2 ^ r11
            if (r2 == 0) goto L48
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 15
            r19 = 0
            r12 = r1
            r17 = r22
            kotlinx.coroutines.CompletedContinuation r2 = kotlinx.coroutines.CompletedContinuation.copy$default(r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
        L2f:
            boolean r4 = r3.compareAndSet(r0, r9, r2)
            if (r4 == 0) goto L37
            r10 = 1
            goto L3d
        L37:
            java.lang.Object r4 = r3.get(r0)
            if (r4 == r9) goto L45
        L3d:
            r12 = r22
            if (r10 == 0) goto L2
            r1.invokeHandlers(r0, r12)
            return
        L45:
            r12 = r22
            goto L2f
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Must be called at most once"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L54:
            r12 = r22
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            kotlinx.coroutines.CompletedContinuation r14 = new kotlinx.coroutines.CompletedContinuation
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 14
            r8 = 0
            r1 = r14
            r2 = r9
            r6 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L67:
            boolean r1 = r13.compareAndSet(r0, r9, r14)
            if (r1 == 0) goto L6f
            r10 = 1
            goto L75
        L6f:
            java.lang.Object r1 = r13.get(r0)
            if (r1 == r9) goto L67
        L75:
            if (r10 == 0) goto L2
            return
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not completed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            r0 = this;
            int r1 = r0.resumeMode
            r0.dispatchResume(r1)
            return
    }

    public final void detachChild$kotlinx_coroutines_core() {
            r1 = this;
            kotlinx.coroutines.DisposableHandle r0 = r1.parentHandle
            if (r0 != 0) goto L5
            return
        L5:
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r0 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r1.parentHandle = r0
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
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
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Throwable getContinuationCancellationCause(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r1) {
            r0 = this;
            java.util.concurrent.CancellationException r1 = r1.getCancellationException()
            return r1
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
            r1 = this;
            kotlin.coroutines.Continuation<T> r0 = r1.delegate
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @org.jetbrains.annotations.Nullable
    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = super.getExceptionalResult$kotlinx_coroutines_core(r1)
            if (r1 != 0) goto L8
            r1 = 0
            goto Lb
        L8:
            r0.getDelegate$kotlinx_coroutines_core()
        Lb:
            return r1
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getResult() {
            r3 = this;
            boolean r0 = r3.isReusable()
            boolean r1 = r3.trySuspend()
            if (r1 == 0) goto L1b
            kotlinx.coroutines.DisposableHandle r1 = r3.parentHandle
            if (r1 != 0) goto L11
            r3.installParentHandle()
        L11:
            if (r0 == 0) goto L16
            r3.releaseClaimedReusableContinuation()
        L16:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
        L1b:
            if (r0 == 0) goto L20
            r3.releaseClaimedReusableContinuation()
        L20:
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L52
            int r1 = r3.resumeMode
            boolean r1 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r1)
            if (r1 == 0) goto L4d
            kotlin.coroutines.CoroutineContext r1 = r3.getContext()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 == 0) goto L4d
            boolean r2 = r1.isActive()
            if (r2 == 0) goto L45
            goto L4d
        L45:
            java.util.concurrent.CancellationException r1 = r1.getCancellationException()
            r3.cancelCompletedResult$kotlinx_coroutines_core(r0, r1)
            throw r1
        L4d:
            java.lang.Object r0 = r3.getSuccessfulResult$kotlinx_coroutines_core(r0)
            return r0
        L52:
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            throw r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getState$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Object r0 = r1._state
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CompletedContinuation
            if (r0 == 0) goto L8
            kotlinx.coroutines.CompletedContinuation r2 = (kotlinx.coroutines.CompletedContinuation) r2
            java.lang.Object r2 = r2.result
        L8:
            return r2
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
            r2 = this;
            kotlinx.coroutines.DisposableHandle r0 = r2.installParentHandle()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r2.isCompleted()
            if (r1 == 0) goto L14
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r0 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r2.parentHandle = r0
        L14:
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r14) {
            r13 = this;
            kotlinx.coroutines.CancelHandler r8 = r13.makeCancelHandler(r14)
        L4:
            java.lang.Object r9 = r13._state
            boolean r0 = r9 instanceof kotlinx.coroutines.Active
            r10 = 0
            r11 = 1
            if (r0 == 0) goto L1f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
        Le:
            boolean r1 = r0.compareAndSet(r13, r9, r8)
            if (r1 == 0) goto L16
            r10 = 1
            goto L1c
        L16:
            java.lang.Object r1 = r0.get(r13)
            if (r1 == r9) goto Le
        L1c:
            if (r10 == 0) goto L4
            return
        L1f:
            boolean r0 = r9 instanceof kotlinx.coroutines.CancelHandler
            if (r0 == 0) goto L27
            r13.multipleHandlersError(r14, r9)
            goto L4
        L27:
            boolean r0 = r9 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L49
            r1 = r9
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            boolean r2 = r1.makeHandled()
            if (r2 != 0) goto L37
            r13.multipleHandlersError(r14, r9)
        L37:
            boolean r2 = r9 instanceof kotlinx.coroutines.CancelledContinuation
            if (r2 == 0) goto L48
            r2 = 0
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            r1 = r2
        L40:
            if (r1 != 0) goto L43
            goto L45
        L43:
            java.lang.Throwable r2 = r1.cause
        L45:
            r13.callCancelHandler(r14, r2)
        L48:
            return
        L49:
            boolean r0 = r9 instanceof kotlinx.coroutines.CompletedContinuation
            if (r0 == 0) goto L87
            r0 = r9
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            kotlinx.coroutines.CancelHandler r1 = r0.cancelHandler
            if (r1 == 0) goto L57
            r13.multipleHandlersError(r14, r9)
        L57:
            boolean r1 = r8 instanceof kotlinx.coroutines.BeforeResumeCancelHandler
            if (r1 == 0) goto L5c
            return
        L5c:
            boolean r1 = r0.getCancelled()
            if (r1 == 0) goto L68
            java.lang.Throwable r0 = r0.cancelCause
            r13.callCancelHandler(r14, r0)
            return
        L68:
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 29
            r7 = 0
            r2 = r8
            kotlinx.coroutines.CompletedContinuation r0 = kotlinx.coroutines.CompletedContinuation.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
        L76:
            boolean r2 = r1.compareAndSet(r13, r9, r0)
            if (r2 == 0) goto L7e
            r10 = 1
            goto L84
        L7e:
            java.lang.Object r2 = r1.get(r13)
            if (r2 == r9) goto L76
        L84:
            if (r10 == 0) goto L4
            return
        L87:
            boolean r0 = r8 instanceof kotlinx.coroutines.BeforeResumeCancelHandler
            if (r0 == 0) goto L8c
            return
        L8c:
            kotlinx.coroutines.CompletedContinuation r12 = new kotlinx.coroutines.CompletedContinuation
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 28
            r7 = 0
            r0 = r12
            r1 = r9
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
        L9c:
            boolean r1 = r0.compareAndSet(r13, r9, r12)
            if (r1 == 0) goto La4
            r10 = 1
            goto Laa
        La4:
            java.lang.Object r1 = r0.get(r13)
            if (r1 == r9) goto L9c
        Laa:
            if (r10 == 0) goto L4
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.NotCompleted
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.CancelledContinuation
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.NotCompleted
            r0 = r0 ^ 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String nameString() {
            r1 = this;
            java.lang.String r0 = "CancellableContinuation"
            return r0
    }

    public final void parentCancelled$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.cancelLater(r2)
            if (r0 == 0) goto L7
            return
        L7:
            r1.cancel(r2)
            r1.detachChildIfNonResuable()
            return
    }

    @kotlin.jvm.JvmName(name = "resetStateReusable")
    public final boolean resetStateReusable() {
            r3 = this;
            java.lang.Object r0 = r3._state
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedContinuation
            r2 = 0
            if (r1 == 0) goto L11
            kotlinx.coroutines.CompletedContinuation r0 = (kotlinx.coroutines.CompletedContinuation) r0
            java.lang.Object r0 = r0.idempotentResume
            if (r0 == 0) goto L11
            r3.detachChild$kotlinx_coroutines_core()
            return r2
        L11:
            r3._decision = r2
            kotlinx.coroutines.Active r0 = kotlinx.coroutines.Active.INSTANCE
            r3._state = r0
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r1 = this;
            int r0 = r1.resumeMode
            r1.resumeImpl(r2, r0, r3)
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineDispatcher r7, T r8) {
            r6 = this;
            kotlin.coroutines.Continuation<T> r0 = r6.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 != 0) goto Le
            goto L10
        Le:
            kotlinx.coroutines.CoroutineDispatcher r2 = r0.dispatcher
        L10:
            if (r2 != r7) goto L15
            r7 = 4
            r2 = 4
            goto L18
        L15:
            int r7 = r6.resumeMode
            r2 = r7
        L18:
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r6
            r1 = r8
            resumeImpl$default(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineDispatcher r10, @org.jetbrains.annotations.NotNull java.lang.Throwable r11) {
            r9 = this;
            kotlin.coroutines.Continuation<T> r0 = r9.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            kotlinx.coroutines.CompletedExceptionally r4 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            r3 = 2
            r4.<init>(r11, r1, r3, r2)
            if (r0 != 0) goto L15
            goto L17
        L15:
            kotlinx.coroutines.CoroutineDispatcher r2 = r0.dispatcher
        L17:
            if (r2 != r10) goto L1c
            r10 = 4
            r5 = 4
            goto L1f
        L1c:
            int r10 = r9.resumeMode
            r5 = r10
        L1f:
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r9
            resumeImpl$default(r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            r6 = this;
            java.lang.Object r1 = kotlinx.coroutines.CompletionStateKt.toState(r7, r6)
            int r2 = r6.resumeMode
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r6
            resumeImpl$default(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @org.jetbrains.annotations.Nullable
    public java.lang.Object takeState$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.nameString()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            kotlin.coroutines.Continuation<T> r1 = r2.delegate
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.toDebugString(r1)
            r0.append(r1)
            java.lang.String r1 = "){"
            r0.append(r1)
            java.lang.String r1 = r2.getStateDebugRepresentation()
            r0.append(r1)
            java.lang.String r1 = "}@"
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    @org.jetbrains.annotations.Nullable
    public java.lang.Object tryResume(T r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            r0 = 0
            kotlinx.coroutines.internal.Symbol r2 = r1.tryResumeImpl(r2, r3, r0)
            return r2
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    @org.jetbrains.annotations.Nullable
    public java.lang.Object tryResume(T r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r0 = this;
            kotlinx.coroutines.internal.Symbol r1 = r0.tryResumeImpl(r1, r2, r3)
            return r1
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    @org.jetbrains.annotations.Nullable
    public java.lang.Object tryResumeWithException(@org.jetbrains.annotations.NotNull java.lang.Throwable r5) {
            r4 = this;
            kotlinx.coroutines.CompletedExceptionally r0 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r5, r1, r2, r3)
            kotlinx.coroutines.internal.Symbol r5 = r4.tryResumeImpl(r0, r3, r3)
            return r5
    }
}
