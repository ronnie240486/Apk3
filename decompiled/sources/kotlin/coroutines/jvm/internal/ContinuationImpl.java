package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000fJ\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "intercepted", "Lkotlin/coroutines/CoroutineContext;", "_context", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "completion", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "(Lkotlin/coroutines/Continuation;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class ContinuationImpl extends kotlin.coroutines.jvm.internal.BaseContinuationImpl {

    @org.jetbrains.annotations.Nullable
    private final kotlin.coroutines.CoroutineContext _context;

    @org.jetbrains.annotations.Nullable
    private transient kotlin.coroutines.Continuation<java.lang.Object> intercepted;

    public ContinuationImpl(@org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<java.lang.Object> r2) {
            r1 = this;
            if (r2 == 0) goto L7
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
    }

    public ContinuationImpl(@org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<java.lang.Object> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.CoroutineContext r2) {
            r0 = this;
            r0.<init>(r1)
            r0._context = r2
            return
    }

    @Override // kotlin.coroutines.Continuation
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1._context
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<java.lang.Object> intercepted() {
            r2 = this;
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r2.intercepted
            if (r0 != 0) goto L1b
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            kotlin.coroutines.ContinuationInterceptor$Key r1 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlin.coroutines.ContinuationInterceptor r0 = (kotlin.coroutines.ContinuationInterceptor) r0
            if (r0 == 0) goto L18
            kotlin.coroutines.Continuation r0 = r0.interceptContinuation(r2)
            if (r0 != 0) goto L19
        L18:
            r0 = r2
        L19:
            r2.intercepted = r0
        L1b:
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
            r3 = this;
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r3.intercepted
            if (r0 == 0) goto L18
            if (r0 == r3) goto L18
            kotlin.coroutines.CoroutineContext r1 = r3.getContext()
            kotlin.coroutines.ContinuationInterceptor$Key r2 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            kotlin.coroutines.ContinuationInterceptor r1 = (kotlin.coroutines.ContinuationInterceptor) r1
            r1.releaseInterceptedContinuation(r0)
        L18:
            kotlin.coroutines.jvm.internal.CompletedContinuation r0 = kotlin.coroutines.jvm.internal.CompletedContinuation.INSTANCE
            r3.intercepted = r0
            return
    }
}
