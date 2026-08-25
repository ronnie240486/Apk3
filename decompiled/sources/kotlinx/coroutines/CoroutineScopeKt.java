package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010\t\u001a\u00020\u0002\u001aM\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\bH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a\u001e\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u001a\n\u0010\u001c\u001a\u00020\u0015*\u00020\u0002\u001a\u0015\u0010\u001d\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002\"\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"isActive", "", "Lkotlinx/coroutines/CoroutineScope;", "isActive$annotations", "(Lkotlinx/coroutines/CoroutineScope;)V", "(Lkotlinx/coroutines/CoroutineScope;)Z", "CoroutineScope", "context", "Lkotlin/coroutines/CoroutineContext;", "MainScope", "coroutineScope", "R", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentCoroutineContext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "message", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "ensureActive", "plus", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CoroutineScopeKt {
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CoroutineScope CoroutineScope(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3) {
            kotlinx.coroutines.internal.ContextScope r0 = new kotlinx.coroutines.internal.ContextScope
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r3.get(r1)
            if (r1 == 0) goto Lb
            goto L15
        Lb:
            r1 = 1
            r2 = 0
            kotlinx.coroutines.CompletableJob r1 = kotlinx.coroutines.JobKt.Job$default(r2, r1, r2)
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r1)
        L15:
            r0.<init>(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CoroutineScope MainScope() {
            kotlinx.coroutines.internal.ContextScope r0 = new kotlinx.coroutines.internal.ContextScope
            r1 = 0
            r2 = 1
            kotlinx.coroutines.CompletableJob r1 = kotlinx.coroutines.SupervisorKt.SupervisorJob$default(r1, r2, r1)
            kotlinx.coroutines.MainCoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r2)
            r0.<init>(r1)
            return r0
    }

    public static final void cancel(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r1 = kotlinx.coroutines.ExceptionsKt.CancellationException(r1, r2)
            cancel(r0, r1)
            return
    }

    public static final void cancel(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r2, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r3) {
            kotlin.coroutines.CoroutineContext r0 = r2.getCoroutineContext()
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 == 0) goto L12
            r0.cancel(r3)
            return
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Scope cannot be cancelled because it does not have a job: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static /* synthetic */ void cancel$default(kotlinx.coroutines.CoroutineScope r0, java.lang.String r1, java.lang.Throwable r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            cancel(r0, r1, r2)
            return
    }

    public static /* synthetic */ void cancel$default(kotlinx.coroutines.CoroutineScope r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            cancel(r0, r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object coroutineScope(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super R> r3) {
            kotlinx.coroutines.internal.ScopeCoroutine r0 = new kotlinx.coroutines.internal.ScopeCoroutine
            kotlin.coroutines.CoroutineContext r1 = r3.getContext()
            r0.<init>(r1, r3)
            java.lang.Object r2 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(r0, r0, r2)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L16
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)
        L16:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object currentCoroutineContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.coroutines.CoroutineContext> r0) {
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            return r0
    }

    private static final java.lang.Object currentCoroutineContext$$forInline(kotlin.coroutines.Continuation<? super kotlin.coroutines.CoroutineContext> r0) {
            r0 = 3
            kotlin.jvm.internal.InlineMarker.mark(r0)
            r0 = 0
            throw r0
    }

    public static final void ensureActive(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r0) {
            kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
            kotlinx.coroutines.JobKt.ensureActive(r0)
            return
    }

    public static final boolean isActive(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1) {
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r0)
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 != 0) goto L10
            r1 = 1
            goto L14
        L10:
            boolean r1 = r1.isActive()
        L14:
            return r1
    }

    public static /* synthetic */ void isActive$annotations(kotlinx.coroutines.CoroutineScope r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CoroutineScope plus(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2) {
            kotlinx.coroutines.internal.ContextScope r0 = new kotlinx.coroutines.internal.ContextScope
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r2)
            r0.<init>(r1)
            return r0
    }
}
