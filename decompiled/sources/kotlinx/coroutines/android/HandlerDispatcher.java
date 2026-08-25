package kotlinx.coroutines.android;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class HandlerDispatcher extends kotlinx.coroutines.MainCoroutineDispatcher implements kotlinx.coroutines.Delay {
    private HandlerDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ HandlerDispatcher(kotlin.jvm.internal.DefaultConstructorMarker r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @org.jetbrains.annotations.Nullable
    public java.lang.Object delay(long r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.Delay.DefaultImpls.delay(r0, r1, r3)
            return r1
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.android.HandlerDispatcher getImmediate();

    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r4) {
            r0 = this;
            kotlinx.coroutines.DisposableHandle r1 = kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(r0, r1, r3, r4)
            return r1
    }
}
