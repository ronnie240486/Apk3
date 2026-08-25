package kotlin.coroutines.intrinsics;

/* JADX INFO: compiled from: Intrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u001c\b\u0004\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0087Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u000b\"\u001a\u0010\u0000\u001a\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"COROUTINE_SUSPENDED", "", "getCOROUTINE_SUSPENDED$annotations", "()V", "getCOROUTINE_SUSPENDED", "()Ljava/lang/Object;", "suspendCoroutineUninterceptedOrReturn", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
class IntrinsicsKt__IntrinsicsKt extends kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt {
    public IntrinsicsKt__IntrinsicsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.Object getCOROUTINE_SUSPENDED() {
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static /* synthetic */ void getCOROUTINE_SUSPENDED$annotations() {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object suspendCoroutineUninterceptedOrReturn(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r0, kotlin.coroutines.Continuation<? super T> r1) {
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            java.lang.String r1 = "Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic"
            r0.<init>(r1)
            throw r0
    }
}
