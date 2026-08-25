package okio;

/* JADX INFO: compiled from: Throttler.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\fJ$\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\f\u0010\u0016\u001a\u00020\u0004*\u00020\u0004H\u0002J\f\u0010\u0017\u001a\u00020\u0004*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lokio/Throttler;", "", "()V", "allocatedUntil", "", "(J)V", "bytesPerSecond", "maxByteCount", "waitByteCount", "byteCountOrWaitNanos", "now", "byteCount", "byteCountOrWaitNanos$okio", "", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "take", "take$okio", "waitNanos", "nanosToWait", "bytesToNanos", "nanosToBytes", "okio"}, k = 1, mv = {1, 4, 1})
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private long maxByteCount;
    private long waitByteCount;



    public Throttler() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            r2.<init>(r0)
            return
    }

    public Throttler(long r1) {
            r0 = this;
            r0.<init>()
            r0.allocatedUntil = r1
            r1 = 8192(0x2000, double:4.0474E-320)
            r0.waitByteCount = r1
            r1 = 262144(0x40000, double:1.295163E-318)
            r0.maxByteCount = r1
            return
    }

    public static /* synthetic */ void bytesPerSecond$default(okio.Throttler r7, long r8, long r10, long r12, int r14, java.lang.Object r15) {
            r15 = r14 & 2
            if (r15 == 0) goto L6
            long r10 = r7.waitByteCount
        L6:
            r3 = r10
            r10 = r14 & 4
            if (r10 == 0) goto Ld
            long r12 = r7.maxByteCount
        Ld:
            r5 = r12
            r0 = r7
            r1 = r8
            r0.bytesPerSecond(r1, r3, r5)
            return
    }

    private final long bytesToNanos(long r3) {
            r2 = this;
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r3 = r3 * r0
            long r0 = r2.bytesPerSecond
            long r3 = r3 / r0
            return r3
    }

    private final long nanosToBytes(long r3) {
            r2 = this;
            long r0 = r2.bytesPerSecond
            long r3 = r3 * r0
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r3 = r3 / r0
            return r3
    }

    private final void waitNanos(long r5) {
            r4 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r5 / r0
            long r0 = r0 * r2
            long r5 = r5 - r0
            int r6 = (int) r5
            r4.wait(r2, r6)
            return
    }

    public final long byteCountOrWaitNanos$okio(long r10, long r12) {
            r9 = this;
            long r0 = r9.bytesPerSecond
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return r12
        L9:
            long r0 = r9.allocatedUntil
            long r0 = r0 - r10
            long r0 = java.lang.Math.max(r0, r2)
            long r4 = r9.maxByteCount
            long r6 = r9.nanosToBytes(r0)
            long r4 = r4 - r6
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 < 0) goto L24
            long r10 = r10 + r0
            long r0 = r9.bytesToNanos(r12)
            long r10 = r10 + r0
            r9.allocatedUntil = r10
            return r12
        L24:
            long r6 = r9.waitByteCount
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L34
            long r12 = r9.maxByteCount
            long r12 = r9.bytesToNanos(r12)
            long r10 = r10 + r12
            r9.allocatedUntil = r10
            return r4
        L34:
            long r12 = java.lang.Math.min(r6, r12)
            long r4 = r9.maxByteCount
            long r4 = r12 - r4
            long r4 = r9.bytesToNanos(r4)
            long r0 = r0 + r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L4f
            long r0 = r9.maxByteCount
            long r0 = r9.bytesToNanos(r0)
            long r10 = r10 + r0
            r9.allocatedUntil = r10
            return r12
        L4f:
            long r10 = -r0
            return r10
    }

    @kotlin.jvm.JvmOverloads
    public final void bytesPerSecond(long r10) {
            r9 = this;
            r3 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r0 = r9
            r1 = r10
            bytesPerSecond$default(r0, r1, r3, r5, r7, r8)
            return
    }

    @kotlin.jvm.JvmOverloads
    public final void bytesPerSecond(long r10, long r12) {
            r9 = this;
            r5 = 0
            r7 = 4
            r8 = 0
            r0 = r9
            r1 = r10
            r3 = r12
            bytesPerSecond$default(r0, r1, r3, r5, r7, r8)
            return
    }

    @kotlin.jvm.JvmOverloads
    public final void bytesPerSecond(long r6, long r8, long r10) {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r2 = 1
            r3 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 < 0) goto Lb
            r4 = 1
            goto Lc
        Lb:
            r4 = 0
        Lc:
            if (r4 == 0) goto L44
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 <= 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L38
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 < 0) goto L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L2c
            r5.bytesPerSecond = r6     // Catch: java.lang.Throwable -> L50
            r5.waitByteCount = r8     // Catch: java.lang.Throwable -> L50
            r5.maxByteCount = r10     // Catch: java.lang.Throwable -> L50
            r5.notifyAll()     // Catch: java.lang.Throwable -> L50
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L50
            monitor-exit(r5)
            return
        L2c:
            java.lang.String r6 = "Failed requirement."
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L50
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L50
            throw r7     // Catch: java.lang.Throwable -> L50
        L38:
            java.lang.String r6 = "Failed requirement."
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L50
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L50
            throw r7     // Catch: java.lang.Throwable -> L50
        L44:
            java.lang.String r6 = "Failed requirement."
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L50
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L50
            throw r7     // Catch: java.lang.Throwable -> L50
        L50:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink(@org.jetbrains.annotations.NotNull okio.Sink r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Throttler$sink$1 r0 = new okio.Throttler$sink$1
            r0.<init>(r1, r2, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Source source(@org.jetbrains.annotations.NotNull okio.Source r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Throttler$source$1 r0 = new okio.Throttler$source$1
            r0.<init>(r1, r2, r2)
            return r0
    }

    public final long take$okio(long r6) {
            r5 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto L22
            monitor-enter(r5)
        Lc:
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1f
            long r2 = r5.byteCountOrWaitNanos$okio(r2, r6)     // Catch: java.lang.Throwable -> L1f
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L1a
            monitor-exit(r5)
            return r2
        L1a:
            long r2 = -r2
            r5.waitNanos(r2)     // Catch: java.lang.Throwable -> L1f
            goto Lc
        L1f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L22:
            java.lang.String r6 = "Failed requirement."
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }
}
