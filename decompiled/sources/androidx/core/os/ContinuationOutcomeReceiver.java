package androidx.core.os;

import java.lang.Throwable;

/* JADX INFO: compiled from: OutcomeReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(31)
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/core/os/ContinuationOutcomeReceiver;", "R", "E", "", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "continuation", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;)V", "onError", "", "error", "(Ljava/lang/Throwable;)V", "onResult", "result", "(Ljava/lang/Object;)V", "toString", "", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class ContinuationOutcomeReceiver<R, E extends java.lang.Throwable> extends java.util.concurrent.atomic.AtomicBoolean implements android.os.OutcomeReceiver<R, E> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.Continuation<R> continuation;

    public ContinuationOutcomeReceiver(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super R> r2) {
            r1 = this;
            java.lang.String r0 = "continuation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1.<init>(r0)
            r1.continuation = r2
            return
    }

    @Override // android.os.OutcomeReceiver
    public void onError(@org.jetbrains.annotations.NotNull E r3) {
            r2 = this;
            java.lang.String r0 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L1c
            kotlin.coroutines.Continuation<R> r0 = r2.continuation
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            r0.resumeWith(r3)
        L1c:
            return
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L13
            kotlin.coroutines.Continuation<R> r0 = r2.continuation
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            r0.resumeWith(r3)
        L13:
            return
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ContinuationOutcomeReceiver(outcomeReceived = "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            boolean r1 = r2.get()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
