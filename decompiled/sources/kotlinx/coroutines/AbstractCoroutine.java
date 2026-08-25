package kotlinx.coroutines;

/* JADX INFO: compiled from: AbstractCoroutine.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlinx.coroutines.InternalCoroutinesApi
@kotlin.Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010)\u001a\u00020\u001d\u0012\u0006\u0010*\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020&¢\u0006\u0004\b,\u0010-J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0011\u0010\u0012JO\u0010\u0016\u001a\u00020\b\"\u0004\b\u0001\u0010\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00028\u00012'\u0010\u001b\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018¢\u0006\u0002\b\u001aø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u001cR\u001d\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0014\u0010'\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lkotlinx/coroutines/AbstractCoroutine;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "", "exception", "handleOnCompletionException$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "handleOnCompletionException", "", "nameString$kotlinx_coroutines_core", "()Ljava/lang/String;", "nameString", "R", "Lkotlinx/coroutines/CoroutineStart;", "start", "receiver", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", "getCoroutineContext", "coroutineContext", "", "isActive", "()Z", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class AbstractCoroutine<T> extends kotlinx.coroutines.JobSupport implements kotlin.coroutines.Continuation<T>, kotlinx.coroutines.CoroutineScope {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.CoroutineContext context;

    public AbstractCoroutine(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            if (r2 == 0) goto L10
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r2 = r1.get(r2)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            r0.initParentJob(r2)
        L10:
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r0)
            r0.context = r1
            return
    }

    public static /* synthetic */ void getContext$annotations() {
            return
    }

    public void afterResume(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            r0.afterCompletion(r1)
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    @org.jetbrains.annotations.NotNull
    public final java.lang.String cancellationExceptionMessage() {
            r2 = this;
            java.lang.String r0 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            java.lang.String r1 = " was cancelled"
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void handleOnCompletionException$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r0, r2)
            return
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    @org.jetbrains.annotations.NotNull
    public java.lang.String nameString$kotlinx_coroutines_core() {
            r3 = this;
            kotlin.coroutines.CoroutineContext r0 = r3.context
            java.lang.String r0 = kotlinx.coroutines.CoroutineContextKt.getCoroutineName(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = super.nameString$kotlinx_coroutines_core()
            return r0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 34
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "\":"
            r1.append(r0)
            java.lang.String r0 = super.nameString$kotlinx_coroutines_core()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public void onCancelled(@org.jetbrains.annotations.NotNull java.lang.Throwable r1, boolean r2) {
            r0 = this;
            return
    }

    public void onCompleted(T r1) {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void onCompletionInternal(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L10
            kotlinx.coroutines.CompletedExceptionally r2 = (kotlinx.coroutines.CompletedExceptionally) r2
            java.lang.Throwable r0 = r2.cause
            boolean r2 = r2.getHandled()
            r1.onCancelled(r0, r2)
            goto L13
        L10:
            r1.onCompleted(r2)
        L13:
            return
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r3 = kotlinx.coroutines.CompletionStateKt.toState$default(r3, r0, r1, r0)
            java.lang.Object r3 = r2.makeCompletingOnce$kotlinx_coroutines_core(r3)
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r3 != r0) goto Lf
            return
        Lf:
            r2.afterResume(r3)
            return
    }

    public final <R> void start(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r1, R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3) {
            r0 = this;
            r1.invoke(r3, r2, r0)
            return
    }
}
