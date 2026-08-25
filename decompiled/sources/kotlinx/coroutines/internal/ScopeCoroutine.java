package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0019\u0010\r\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/internal/ScopeCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "Lkotlin/coroutines/Continuation;", "uCont", "Lkotlin/coroutines/Continuation;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlinx/coroutines/Job;", "getParent$kotlinx_coroutines_core", "()Lkotlinx/coroutines/Job;", "parent", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class ScopeCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> implements kotlin.coroutines.jvm.internal.CoroutineStackFrame {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<T> uCont;

    public ScopeCoroutine(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.uCont = r3
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    public void afterCompletion(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            kotlin.coroutines.Continuation<T> r0 = r3.uCont
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            kotlin.coroutines.Continuation<T> r1 = r3.uCont
            java.lang.Object r4 = kotlinx.coroutines.CompletionStateKt.recoverResult(r4, r1)
            r1 = 0
            r2 = 2
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith$default(r0, r4, r1, r2, r1)
            return
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void afterResume(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            kotlin.coroutines.Continuation<T> r0 = r1.uCont
            java.lang.Object r2 = kotlinx.coroutines.CompletionStateKt.recoverResult(r2, r0)
            r0.resumeWith(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.uCont
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.Job getParent$kotlinx_coroutines_core() {
            r1 = this;
            kotlinx.coroutines.ChildHandle r0 = r1.getParentHandle$kotlinx_coroutines_core()
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            kotlinx.coroutines.Job r0 = r0.getParent()
        Lc:
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public final java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean isScopedCoroutine() {
            r1 = this;
            r0 = 1
            return r0
    }
}
