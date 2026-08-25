package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/ResumeAwaitOnCompletion;", "T", "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ResumeAwaitOnCompletion<T> extends kotlinx.coroutines.JobNode {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CancellableContinuationImpl<T> continuation;

    public ResumeAwaitOnCompletion(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuationImpl<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.continuation = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.invoke2(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
            r2 = this;
            kotlinx.coroutines.JobSupport r3 = r2.getJob()
            java.lang.Object r3 = r3.getState$kotlinx_coroutines_core()
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L20
            kotlinx.coroutines.CancellableContinuationImpl<T> r0 = r2.continuation
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            java.lang.Throwable r3 = r3.cause
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            r0.resumeWith(r3)
            goto L2f
        L20:
            kotlinx.coroutines.CancellableContinuationImpl<T> r0 = r2.continuation
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.unboxState(r3)
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            r0.resumeWith(r3)
        L2f:
            return
    }
}
