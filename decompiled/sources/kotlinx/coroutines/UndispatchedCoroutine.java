package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tR*\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "oldValue", "", "saveThreadContext", "", "clearThreadContext", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "threadStateToRecover", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class UndispatchedCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {

    @org.jetbrains.annotations.NotNull
    private java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> threadStateToRecover;

    public UndispatchedCoroutine(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r4) {
            r2 = this;
            kotlinx.coroutines.UndispatchedMarker r0 = kotlinx.coroutines.UndispatchedMarker.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r1 = r3.get(r0)
            if (r1 != 0) goto Lc
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r0)
        Lc:
            r2.<init>(r3, r4)
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2.threadStateToRecover = r3
            return
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    public final void afterResume(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r5.threadStateToRecover
            java.lang.Object r0 = r0.get()
            kotlin.Pair r0 = (kotlin.Pair) r0
            r1 = 0
            if (r0 != 0) goto Lc
            goto L1e
        Lc:
            java.lang.Object r2 = r0.component1()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            java.lang.Object r0 = r0.component2()
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r0)
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r5.threadStateToRecover
            r0.set(r1)
        L1e:
            kotlin.coroutines.Continuation<T> r0 = r5.uCont
            java.lang.Object r6 = kotlinx.coroutines.CompletionStateKt.recoverResult(r6, r0)
            kotlin.coroutines.Continuation<T> r0 = r5.uCont
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r2, r1)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r3 == r4) goto L36
            kotlinx.coroutines.UndispatchedCoroutine r1 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r0, r2, r3)
        L36:
            kotlin.coroutines.Continuation<T> r0 = r5.uCont     // Catch: java.lang.Throwable -> L49
            r0.resumeWith(r6)     // Catch: java.lang.Throwable -> L49
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L45
            boolean r6 = r1.clearThreadContext()
            if (r6 == 0) goto L48
        L45:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r3)
        L48:
            return
        L49:
            r6 = move-exception
            if (r1 == 0) goto L52
            boolean r0 = r1.clearThreadContext()
            if (r0 == 0) goto L55
        L52:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r3)
        L55:
            throw r6
    }

    public final boolean clearThreadContext() {
            r2 = this;
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r2.threadStateToRecover
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r2.threadStateToRecover
            r1 = 0
            r0.set(r1)
            r0 = 1
            return r0
    }

    public final void saveThreadContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r1.threadStateToRecover
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            r0.set(r2)
            return
    }
}
