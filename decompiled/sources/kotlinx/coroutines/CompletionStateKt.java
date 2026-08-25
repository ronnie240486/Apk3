package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001aI\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a.\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"recoverResult", "Lkotlin/Result;", "T", "state", "", "uCont", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toState", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "caller", "Lkotlinx/coroutines/CancellableContinuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CompletionStateKt {
    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Object recoverResult(@org.jetbrains.annotations.Nullable java.lang.Object r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r1) {
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L13
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m333constructorimpl(r0)
            goto L19
        L13:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.Result.m333constructorimpl(r0)
        L19:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object toState(@org.jetbrains.annotations.NotNull java.lang.Object r3, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4) {
            java.lang.Throwable r0 = kotlin.Result.m336exceptionOrNullimpl(r3)
            if (r0 != 0) goto Lf
            if (r4 == 0) goto L17
            kotlinx.coroutines.CompletedWithCancellation r0 = new kotlinx.coroutines.CompletedWithCancellation
            r0.<init>(r3, r4)
            r3 = r0
            goto L17
        Lf:
            kotlinx.coroutines.CompletedExceptionally r3 = new kotlinx.coroutines.CompletedExceptionally
            r4 = 0
            r1 = 2
            r2 = 0
            r3.<init>(r0, r4, r1, r2)
        L17:
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object toState(@org.jetbrains.annotations.NotNull java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<?> r4) {
            java.lang.Throwable r4 = kotlin.Result.m336exceptionOrNullimpl(r3)
            if (r4 != 0) goto L7
            goto Lf
        L7:
            kotlinx.coroutines.CompletedExceptionally r3 = new kotlinx.coroutines.CompletedExceptionally
            r0 = 0
            r1 = 2
            r2 = 0
            r3.<init>(r4, r0, r1, r2)
        Lf:
            return r3
    }

    public static /* synthetic */ java.lang.Object toState$default(java.lang.Object r0, kotlin.jvm.functions.Function1 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.Object r0 = toState(r0, r1)
            return r0
    }
}
