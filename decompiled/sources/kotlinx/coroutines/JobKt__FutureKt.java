package kotlinx.coroutines;

/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, d2 = {"cancelFutureOnCancellation", "", "Lkotlinx/coroutines/CancellableContinuation;", "future", "Ljava/util/concurrent/Future;", "cancelFutureOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
final /* synthetic */ class JobKt__FutureKt {
    public static final void cancelFutureOnCancellation(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<?> r1, @org.jetbrains.annotations.NotNull java.util.concurrent.Future<?> r2) {
            kotlinx.coroutines.CancelFutureOnCancel r0 = new kotlinx.coroutines.CancelFutureOnCancel
            r0.<init>(r2)
            r1.invokeOnCancellation(r0)
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.DisposableHandle cancelFutureOnCompletion(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r1, @org.jetbrains.annotations.NotNull java.util.concurrent.Future<?> r2) {
            kotlinx.coroutines.CancelFutureOnCompletion r0 = new kotlinx.coroutines.CancelFutureOnCompletion
            r0.<init>(r2)
            kotlinx.coroutines.DisposableHandle r1 = r1.invokeOnCompletion(r0)
            return r1
    }
}
