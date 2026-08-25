package kotlinx.coroutines;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlinx.coroutines.InternalCoroutinesApi
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/Delay;", "", "delay", "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "context", "Lkotlin/coroutines/CoroutineContext;", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Delay {

    /* JADX INFO: compiled from: Delay.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object delay(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Delay r3, long r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 > 0) goto L9
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L9:
                kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
                kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r6)
                r2 = 1
                r0.<init>(r1, r2)
                r0.initCancellability()
                r3.mo1867scheduleResumeAfterDelay(r4, r0)
                java.lang.Object r3 = r0.getResult()
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r3 != r4) goto L26
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
            L26:
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r3 != r4) goto L2d
                return r3
            L2d:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public static kotlinx.coroutines.DisposableHandle invokeOnTimeout(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Delay r0, long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r4) {
                kotlinx.coroutines.Delay r0 = kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay()
                kotlinx.coroutines.DisposableHandle r0 = r0.invokeOnTimeout(r1, r3, r4)
                return r0
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @org.jetbrains.annotations.Nullable
    java.lang.Object delay(long r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3);

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r4);

    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    void mo1867scheduleResumeAfterDelay(long r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r3);
}
