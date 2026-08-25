package androidx.core.os;

/* JADX INFO: compiled from: OutcomeReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(31)
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"asOutcomeReceiver", "Landroid/os/OutcomeReceiver;", "R", "E", "", "Lkotlin/coroutines/Continuation;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class OutcomeReceiverKt {
    @androidx.annotation.RequiresApi(31)
    @org.jetbrains.annotations.NotNull
    public static final <R, E extends java.lang.Throwable> android.os.OutcomeReceiver<R, E> asOutcomeReceiver(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super R> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.core.os.ContinuationOutcomeReceiver r0 = new androidx.core.os.ContinuationOutcomeReceiver
            r0.<init>(r1)
            return r0
    }
}
