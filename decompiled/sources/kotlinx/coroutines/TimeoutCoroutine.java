package kotlinx.coroutines;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u0002H\u00012\b\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nJ\r\u0010\u000b\u001a\u00020\fH\u0010¢\u0006\u0002\b\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/TimeoutCoroutine;", "U", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "time", "", "uCont", "Lkotlin/coroutines/Continuation;", "(JLkotlin/coroutines/Continuation;)V", "nameString", "", "nameString$kotlinx_coroutines_core", "run", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class TimeoutCoroutine<U, T extends U> extends kotlinx.coroutines.internal.ScopeCoroutine<T> implements java.lang.Runnable {

    @kotlin.jvm.JvmField
    public final long time;

    public TimeoutCoroutine(long r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super U> r4) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r4.getContext()
            r1.<init>(r0, r4)
            r1.time = r2
            return
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport
    @org.jetbrains.annotations.NotNull
    public java.lang.String nameString$kotlinx_coroutines_core() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.nameString$kotlinx_coroutines_core()
            r0.append(r1)
            java.lang.String r1 = "(timeMillis="
            r0.append(r1)
            long r1 = r3.time
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            long r0 = r2.time
            kotlinx.coroutines.TimeoutCancellationException r0 = kotlinx.coroutines.TimeoutKt.TimeoutCancellationException(r0, r2)
            r2.cancelCoroutine(r0)
            return
    }
}
