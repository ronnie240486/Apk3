package kotlinx.coroutines;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u0000H\u0016R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "message", "", "(Ljava/lang/String;)V", "coroutine", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Lkotlinx/coroutines/Job;)V", "createCopy", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TimeoutCancellationException extends java.util.concurrent.CancellationException implements kotlinx.coroutines.CopyableThrowable<kotlinx.coroutines.TimeoutCancellationException> {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.Job coroutine;

    public TimeoutCancellationException(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TimeoutCancellationException(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.Job r2) {
            r0 = this;
            r0.<init>(r1)
            r0.coroutine = r2
            return
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public /* bridge */ /* synthetic */ java.lang.Throwable createCopy() {
            r1 = this;
            kotlinx.coroutines.TimeoutCancellationException r0 = r1.createCopy()
            return r0
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    @org.jetbrains.annotations.Nullable
    public kotlinx.coroutines.TimeoutCancellationException createCopy() {
            r3 = this;
            kotlinx.coroutines.TimeoutCancellationException r0 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r1 = r3.getMessage()
            if (r1 != 0) goto La
            java.lang.String r1 = ""
        La:
            kotlinx.coroutines.Job r2 = r3.coroutine
            r0.<init>(r1, r2)
            r0.initCause(r3)
            return r0
    }
}
