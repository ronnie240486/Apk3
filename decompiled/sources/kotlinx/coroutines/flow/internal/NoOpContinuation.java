package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/NoOpContinuation;", "Lkotlin/coroutines/Continuation;", "", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class NoOpContinuation implements kotlin.coroutines.Continuation<java.lang.Object> {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.internal.NoOpContinuation INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.coroutines.CoroutineContext context = null;

    static {
            kotlinx.coroutines.flow.internal.NoOpContinuation r0 = new kotlinx.coroutines.flow.internal.NoOpContinuation
            r0.<init>()
            kotlinx.coroutines.flow.internal.NoOpContinuation.INSTANCE = r0
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.flow.internal.NoOpContinuation.context = r0
            return
    }

    private NoOpContinuation() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.coroutines.Continuation
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.flow.internal.NoOpContinuation.context
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            r0 = this;
            return
    }
}
