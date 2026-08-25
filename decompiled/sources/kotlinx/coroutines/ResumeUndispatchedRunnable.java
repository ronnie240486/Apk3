package kotlinx.coroutines;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/ResumeUndispatchedRunnable;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CancellableContinuation;)V", "run", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ResumeUndispatchedRunnable implements java.lang.Runnable {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> continuation;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    public ResumeUndispatchedRunnable(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineDispatcher r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r2) {
            r0 = this;
            r0.<init>()
            r0.dispatcher = r1
            r0.continuation = r2
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r3.continuation
            kotlinx.coroutines.CoroutineDispatcher r1 = r3.dispatcher
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r0.resumeUndispatched(r1, r2)
            return
    }
}
