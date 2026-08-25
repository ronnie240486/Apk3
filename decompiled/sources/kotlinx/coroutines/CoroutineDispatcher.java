package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0017J \u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\u0002J\u0012\u0010\u0017\u001a\u00020\u00052\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0016¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "isDispatchNeeded", "", "limitedParallelism", "parallelism", "", "plus", "other", "releaseInterceptedContinuation", "toString", "", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class CoroutineDispatcher extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlin.coroutines.ContinuationInterceptor {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CoroutineDispatcher.Key Key = null;

    /* JADX INFO: compiled from: CoroutineDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @kotlin.ExperimentalStdlibApi
    public static final class Key extends kotlin.coroutines.AbstractCoroutineContextKey<kotlin.coroutines.ContinuationInterceptor, kotlinx.coroutines.CoroutineDispatcher> {


        private Key() {
                r2 = this;
                kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
                kotlinx.coroutines.CoroutineDispatcher$Key$1 r1 = kotlinx.coroutines.CoroutineDispatcher.Key.AnonymousClass1.INSTANCE
                r2.<init>(r0, r1)
                return
        }

        public /* synthetic */ Key(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.CoroutineDispatcher$Key r0 = new kotlinx.coroutines.CoroutineDispatcher$Key
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.CoroutineDispatcher.Key = r0
            return
    }

    public CoroutineDispatcher() {
            r1 = this;
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
            r1.<init>(r0)
            return
    }

    /* JADX INFO: renamed from: dispatch */
    public abstract void mo1866dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2);

    @kotlinx.coroutines.InternalCoroutinesApi
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            r0.mo1866dispatch(r1, r2)
            return
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.Nullable
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext$Element r1 = kotlin.coroutines.ContinuationInterceptor.DefaultImpls.get(r0, r1)
            return r1
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    @org.jetbrains.annotations.NotNull
    public final <T> kotlin.coroutines.Continuation<T> interceptContinuation(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r2) {
            r1 = this;
            kotlinx.coroutines.internal.DispatchedContinuation r0 = new kotlinx.coroutines.internal.DispatchedContinuation
            r0.<init>(r1, r2)
            return r0
    }

    public boolean isDispatchNeeded(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(r2)
            kotlinx.coroutines.internal.LimitedDispatcher r0 = new kotlinx.coroutines.internal.LimitedDispatcher
            r0.<init>(r1, r2)
            return r0
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlin.coroutines.ContinuationInterceptor.DefaultImpls.minusKey(r0, r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher plus(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineDispatcher r1) {
            r0 = this;
            return r1
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r1) {
            r0 = this;
            kotlinx.coroutines.internal.DispatchedContinuation r1 = (kotlinx.coroutines.internal.DispatchedContinuation) r1
            r1.release()
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
