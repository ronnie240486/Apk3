package kotlinx.coroutines.test;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TestCoroutineContext$special$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {
    public final /* synthetic */ kotlinx.coroutines.test.TestCoroutineContext this$0;

    public TestCoroutineContext$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.Key r1, kotlinx.coroutines.test.TestCoroutineContext r2) {
            r0 = this;
            r0.this$0 = r2
            r0.<init>(r1)
            return
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r0 = this;
            kotlinx.coroutines.test.TestCoroutineContext r1 = r0.this$0
            java.util.List r1 = kotlinx.coroutines.test.TestCoroutineContext.access$getUncaughtExceptions$p(r1)
            r1.add(r2)
            return
    }
}
