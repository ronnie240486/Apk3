package kotlinx.coroutines;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u001b\u001a\u00020\fJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001dR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelCompletedResult", "", "takenState", "", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "getExceptionalResult", "state", "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", "exception", "finallyException", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class DispatchedTask<T> extends kotlinx.coroutines.scheduling.Task {

    @kotlin.jvm.JvmField
    public int resumeMode;

    public DispatchedTask(int r1) {
            r0 = this;
            r0.<init>()
            r0.resumeMode = r1
            return
    }

    public void cancelCompletedResult$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r0 = this;
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core();

    @org.jetbrains.annotations.Nullable
    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L8
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 != 0) goto Lc
            goto Le
        Lc:
            java.lang.Throwable r1 = r3.cause
        Le:
            return r1
    }

    public <T> T getSuccessfulResult$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            return r1
    }

    public final void handleFatalException(@org.jetbrains.annotations.Nullable java.lang.Throwable r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
            r2 = this;
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            return
        L5:
            if (r3 == 0) goto Lc
            if (r4 == 0) goto Lc
            kotlin.ExceptionsKt.addSuppressed(r3, r4)
        Lc:
            if (r3 != 0) goto Lf
            r3 = r4
        Lf:
            kotlinx.coroutines.CoroutinesInternalError r4 = new kotlinx.coroutines.CoroutinesInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fatal exception in coroutines machinery for "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r4.<init>(r0, r3)
            kotlin.coroutines.Continuation r3 = r2.getDelegate$kotlinx_coroutines_core()
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r4)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            kotlinx.coroutines.scheduling.TaskContext r0 = r10.taskContext
            kotlin.coroutines.Continuation r1 = r10.getDelegate$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> Lb0
            kotlinx.coroutines.internal.DispatchedContinuation r1 = (kotlinx.coroutines.internal.DispatchedContinuation) r1     // Catch: java.lang.Throwable -> Lb0
            kotlin.coroutines.Continuation<T> r2 = r1.continuation     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r1 = r1.countOrElement     // Catch: java.lang.Throwable -> Lb0
            kotlin.coroutines.CoroutineContext r3 = r2.getContext()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r3, r1)     // Catch: java.lang.Throwable -> Lb0
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> Lb0
            r5 = 0
            if (r1 == r4) goto L1e
            kotlinx.coroutines.UndispatchedCoroutine r4 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r2, r3, r1)     // Catch: java.lang.Throwable -> Lb0
            goto L1f
        L1e:
            r4 = r5
        L1f:
            kotlin.coroutines.CoroutineContext r6 = r2.getContext()     // Catch: java.lang.Throwable -> La3
            java.lang.Object r7 = r10.takeState$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> La3
            java.lang.Throwable r8 = r10.getExceptionalResult$kotlinx_coroutines_core(r7)     // Catch: java.lang.Throwable -> La3
            if (r8 != 0) goto L3e
            int r9 = r10.resumeMode     // Catch: java.lang.Throwable -> La3
            boolean r9 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r9)     // Catch: java.lang.Throwable -> La3
            if (r9 == 0) goto L3e
            kotlinx.coroutines.Job$Key r9 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> La3
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r9)     // Catch: java.lang.Throwable -> La3
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6     // Catch: java.lang.Throwable -> La3
            goto L3f
        L3e:
            r6 = r5
        L3f:
            if (r6 == 0) goto L5c
            boolean r9 = r6.isActive()     // Catch: java.lang.Throwable -> La3
            if (r9 != 0) goto L5c
            java.util.concurrent.CancellationException r6 = r6.getCancellationException()     // Catch: java.lang.Throwable -> La3
            r10.cancelCompletedResult$kotlinx_coroutines_core(r7, r6)     // Catch: java.lang.Throwable -> La3
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La3
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)     // Catch: java.lang.Throwable -> La3
            java.lang.Object r6 = kotlin.Result.m333constructorimpl(r6)     // Catch: java.lang.Throwable -> La3
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> La3
            goto L79
        L5c:
            if (r8 == 0) goto L6c
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La3
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r8)     // Catch: java.lang.Throwable -> La3
            java.lang.Object r6 = kotlin.Result.m333constructorimpl(r6)     // Catch: java.lang.Throwable -> La3
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> La3
            goto L79
        L6c:
            java.lang.Object r6 = r10.getSuccessfulResult$kotlinx_coroutines_core(r7)     // Catch: java.lang.Throwable -> La3
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La3
            java.lang.Object r6 = kotlin.Result.m333constructorimpl(r6)     // Catch: java.lang.Throwable -> La3
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> La3
        L79:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L83
            boolean r4 = r4.clearThreadContext()     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L86
        L83:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r1)     // Catch: java.lang.Throwable -> Lb0
        L86:
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L90
            r0.afterTask()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = kotlin.Result.m333constructorimpl(r2)     // Catch: java.lang.Throwable -> L90
            goto L9b
        L90:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m333constructorimpl(r0)
        L9b:
            java.lang.Throwable r0 = kotlin.Result.m336exceptionOrNullimpl(r0)
            r10.handleFatalException(r5, r0)
            goto Lcf
        La3:
            r2 = move-exception
            if (r4 == 0) goto Lac
            boolean r4 = r4.clearThreadContext()     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto Laf
        Lac:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r1)     // Catch: java.lang.Throwable -> Lb0
        Laf:
            throw r2     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Lbd
            r0.afterTask()     // Catch: java.lang.Throwable -> Lbd
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = kotlin.Result.m333constructorimpl(r0)     // Catch: java.lang.Throwable -> Lbd
            goto Lc8
        Lbd:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m333constructorimpl(r0)
        Lc8:
            java.lang.Throwable r0 = kotlin.Result.m336exceptionOrNullimpl(r0)
            r10.handleFatalException(r1, r0)
        Lcf:
            return
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object takeState$kotlinx_coroutines_core();
}
