package androidx.core.util;

/* JADX INFO: compiled from: Runnable.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"asRunnable", "Ljava/lang/Runnable;", "Lkotlin/coroutines/Continuation;", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class RunnableKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Runnable asRunnable(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.core.util.ContinuationRunnable r0 = new androidx.core.util.ContinuationRunnable
            r0.<init>(r1)
            return r0
    }
}
