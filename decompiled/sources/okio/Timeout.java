package okio;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0000H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0086\bø\u0001\u0000J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lokio/Timeout;", "", "()V", "deadlineNanoTime", "", "hasDeadline", "", "timeoutNanos", "clearDeadline", "clearTimeout", "deadline", "duration", "unit", "Ljava/util/concurrent/TimeUnit;", "intersectWith", "", "other", "block", "Lkotlin/Function0;", "throwIfReached", "timeout", "waitUntilNotified", "monitor", "Companion", "okio"}, k = 1, mv = {1, 4, 1})
public class Timeout {

    @org.jetbrains.annotations.NotNull
    public static final okio.Timeout.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.Timeout NONE = null;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* JADX INFO: compiled from: Timeout.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokio/Timeout$Companion;", "", "()V", "NONE", "Lokio/Timeout;", "minTimeout", "", "aNanos", "bNanos", "okio"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final long minTimeout(long r4, long r6) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L7
                goto L11
            L7:
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 != 0) goto Lc
                goto L12
            Lc:
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 >= 0) goto L11
                goto L12
            L11:
                r4 = r6
            L12:
                return r4
        }
    }

    static {
            okio.Timeout$Companion r0 = new okio.Timeout$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Timeout.Companion = r0
            okio.Timeout$Companion$NONE$1 r0 = new okio.Timeout$Companion$NONE$1
            r0.<init>()
            okio.Timeout.NONE = r0
            return
    }

    public Timeout() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public okio.Timeout clearDeadline() {
            r1 = this;
            r0 = 0
            r1.hasDeadline = r0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public okio.Timeout clearTimeout() {
            r2 = this;
            r0 = 0
            r2.timeoutNanos = r0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Timeout deadline(long r4, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r6) {
            r3 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L1f
            long r0 = java.lang.System.nanoTime()
            long r4 = r6.toNanos(r4)
            long r4 = r4 + r0
            okio.Timeout r4 = r3.deadlineNanoTime(r4)
            return r4
        L1f:
            java.lang.String r6 = "duration <= 0: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r4)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public long deadlineNanoTime() {
            r2 = this;
            boolean r0 = r2.hasDeadline
            if (r0 == 0) goto L7
            long r0 = r2.deadlineNanoTime
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No deadline"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public okio.Timeout deadlineNanoTime(long r2) {
            r1 = this;
            r0 = 1
            r1.hasDeadline = r0
            r1.deadlineNanoTime = r2
            return r1
    }

    public boolean hasDeadline() {
            r1 = this;
            boolean r0 = r1.hasDeadline
            return r0
    }

    public final void intersectWith(@org.jetbrains.annotations.NotNull okio.Timeout r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r13) {
            r11 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            long r0 = r11.timeoutNanos()
            okio.Timeout$Companion r2 = okio.Timeout.Companion
            long r3 = r12.timeoutNanos()
            long r5 = r11.timeoutNanos()
            long r2 = r2.minTimeout(r3, r5)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.timeout(r2, r4)
            boolean r2 = r11.hasDeadline()
            r3 = 1
            if (r2 == 0) goto L6d
            long r5 = r11.deadlineNanoTime()
            boolean r2 = r12.hasDeadline()
            if (r2 == 0) goto L41
            long r7 = r11.deadlineNanoTime()
            long r9 = r12.deadlineNanoTime()
            long r7 = java.lang.Math.min(r7, r9)
            r11.deadlineNanoTime(r7)
        L41:
            r13.invoke()     // Catch: java.lang.Throwable -> L57
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r11.timeout(r0, r4)
            boolean r12 = r12.hasDeadline()
            if (r12 == 0) goto L53
            r11.deadlineNanoTime(r5)
        L53:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            goto L8f
        L57:
            r13 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.timeout(r0, r2)
            boolean r12 = r12.hasDeadline()
            if (r12 == 0) goto L69
            r11.deadlineNanoTime(r5)
        L69:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r13
        L6d:
            boolean r2 = r12.hasDeadline()
            if (r2 == 0) goto L7a
            long r5 = r12.deadlineNanoTime()
            r11.deadlineNanoTime(r5)
        L7a:
            r13.invoke()     // Catch: java.lang.Throwable -> L90
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r11.timeout(r0, r4)
            boolean r12 = r12.hasDeadline()
            if (r12 == 0) goto L8c
            r11.clearDeadline()
        L8c:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
        L8f:
            return
        L90:
            r13 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.timeout(r0, r2)
            boolean r12 = r12.hasDeadline()
            if (r12 == 0) goto La2
            r11.clearDeadline()
        La2:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r13
    }

    public void throwIfReached() throws java.io.IOException {
            r5 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L2a
            boolean r0 = r5.hasDeadline
            if (r0 == 0) goto L29
            long r0 = r5.deadlineNanoTime
            long r2 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L21
            goto L29
        L21:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "deadline reached"
            r0.<init>(r1)
            throw r0
        L29:
            return
        L2a:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "interrupted"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout(long r4, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r6) {
            r3 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L18
            long r4 = r6.toNanos(r4)
            r3.timeoutNanos = r4
            return r3
        L18:
            java.lang.String r6 = "timeout < 0: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r4)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public long timeoutNanos() {
            r2 = this;
            long r0 = r2.timeoutNanos
            return r0
    }

    public final void waitUntilNotified(@org.jetbrains.annotations.NotNull java.lang.Object r10) throws java.io.InterruptedIOException {
            r9 = this;
            java.lang.String r0 = "monitor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r9.hasDeadline()     // Catch: java.lang.InterruptedException -> L5c
            long r1 = r9.timeoutNanos()     // Catch: java.lang.InterruptedException -> L5c
            r3 = 0
            if (r0 != 0) goto L19
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L19
            r10.wait()     // Catch: java.lang.InterruptedException -> L5c
            return
        L19:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L5c
            if (r0 == 0) goto L2d
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L2d
            long r7 = r9.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L5c
            long r7 = r7 - r5
            long r1 = java.lang.Math.min(r1, r7)     // Catch: java.lang.InterruptedException -> L5c
            goto L35
        L2d:
            if (r0 == 0) goto L35
            long r0 = r9.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L5c
            long r1 = r0 - r5
        L35:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4e
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r1 / r3
            java.lang.Long.signum(r7)
            long r3 = r3 * r7
            long r3 = r1 - r3
            int r0 = (int) r3
            r10.wait(r7, r0)     // Catch: java.lang.InterruptedException -> L5c
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L5c
            long r3 = r3 - r5
        L4e:
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 >= 0) goto L53
            return
        L53:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L5c
            java.lang.String r0 = "timeout"
            r10.<init>(r0)     // Catch: java.lang.InterruptedException -> L5c
            throw r10     // Catch: java.lang.InterruptedException -> L5c
        L5c:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException
            java.lang.String r0 = "interrupted"
            r10.<init>(r0)
            throw r10
    }
}
