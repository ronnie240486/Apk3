package kotlinx.coroutines;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\u0000H\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u0010\u0010\b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "message", "", "cause", "", "job", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "createCopy", "equals", "", "other", "", "fillInStackTrace", "hashCode", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class JobCancellationException extends java.util.concurrent.CancellationException implements kotlinx.coroutines.CopyableThrowable<kotlinx.coroutines.JobCancellationException> {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job job;

    public JobCancellationException(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.Throwable r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r3) {
            r0 = this;
            r0.<init>(r1)
            r0.job = r3
            if (r2 == 0) goto La
            r0.initCause(r2)
        La:
            return
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public /* bridge */ /* synthetic */ java.lang.Throwable createCopy() {
            r1 = this;
            kotlinx.coroutines.JobCancellationException r0 = r1.createCopy()
            return r0
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    @org.jetbrains.annotations.Nullable
    public kotlinx.coroutines.JobCancellationException createCopy() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L31
            boolean r0 = r3 instanceof kotlinx.coroutines.JobCancellationException
            if (r0 == 0) goto L2f
            kotlinx.coroutines.JobCancellationException r3 = (kotlinx.coroutines.JobCancellationException) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L2f
            kotlinx.coroutines.Job r0 = r3.job
            kotlinx.coroutines.Job r1 = r2.job
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r0 = r2.getCause()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            r3 = 0
            goto L32
        L31:
            r3 = 1
        L32:
            return r3
    }

    @Override // java.lang.Throwable
    @org.jetbrains.annotations.NotNull
    public java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kotlinx.coroutines.Job r1 = r2.job
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Throwable r0 = r2.getCause()
            if (r0 != 0) goto L1e
            r0 = 0
            goto L22
        L1e:
            int r0 = r0.hashCode()
        L22:
            int r1 = r1 + r0
            return r1
    }

    @Override // java.lang.Throwable
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "; job="
            r0.append(r1)
            kotlinx.coroutines.Job r1 = r2.job
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
