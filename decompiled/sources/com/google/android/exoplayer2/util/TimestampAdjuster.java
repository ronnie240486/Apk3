package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;

    @androidx.annotation.GuardedBy("this")
    private long firstSampleTimestampUs;

    @androidx.annotation.GuardedBy("this")
    private long lastUnadjustedTimestampUs;
    private final java.lang.ThreadLocal<java.lang.Long> nextSampleTimestampUs;

    @androidx.annotation.GuardedBy("this")
    private long timestampOffsetUs;

    public TimestampAdjuster(long r2) {
            r1 = this;
            r1.<init>()
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.nextSampleTimestampUs = r0
            r1.reset(r2)
            return
    }

    public static long ptsToUs(long r2) {
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            r0 = 90000(0x15f90, double:4.4466E-319)
            long r2 = r2 / r0
            return r2
    }

    public static long usToNonWrappedPts(long r2) {
            r0 = 90000(0x15f90, double:4.4466E-319)
            long r2 = r2 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r0
            return r2
    }

    public static long usToWrappedPts(long r2) {
            long r2 = usToNonWrappedPts(r2)
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            long r2 = r2 % r0
            return r2
    }

    public synchronized long adjustSampleTimestamp(long r6) {
            r5 = this;
            monitor-enter(r5)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            monitor-exit(r5)
            return r0
        Lc:
            long r2 = r5.timestampOffsetUs     // Catch: java.lang.Throwable -> L3c
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L35
            long r0 = r5.firstSampleTimestampUs     // Catch: java.lang.Throwable -> L3c
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            java.lang.ThreadLocal<java.lang.Long> r0 = r5.nextSampleTimestampUs     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L3c
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L3c
        L2f:
            long r0 = r0 - r6
            r5.timestampOffsetUs = r0     // Catch: java.lang.Throwable -> L3c
            r5.notifyAll()     // Catch: java.lang.Throwable -> L3c
        L35:
            r5.lastUnadjustedTimestampUs = r6     // Catch: java.lang.Throwable -> L3c
            long r0 = r5.timestampOffsetUs     // Catch: java.lang.Throwable -> L3c
            long r6 = r6 + r0
            monitor-exit(r5)
            return r6
        L3c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public synchronized long adjustTsTimestamp(long r9) {
            r8 = this;
            monitor-enter(r8)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            monitor-exit(r8)
            return r0
        Lc:
            long r2 = r8.lastUnadjustedTimestampUs     // Catch: java.lang.Throwable -> L49
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L3f
            long r0 = usToNonWrappedPts(r2)     // Catch: java.lang.Throwable -> L49
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = r2 + r0
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            long r2 = r2 / r4
            r6 = 1
            long r6 = r2 - r6
            long r6 = r6 * r4
            long r6 = r6 + r9
            long r2 = r2 * r4
            long r2 = r2 + r9
            long r9 = r6 - r0
            long r9 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> L49
            long r0 = r2 - r0
            long r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L49
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 >= 0) goto L3e
            r9 = r6
            goto L3f
        L3e:
            r9 = r2
        L3f:
            long r9 = ptsToUs(r9)     // Catch: java.lang.Throwable -> L49
            long r9 = r8.adjustSampleTimestamp(r9)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r8)
            return r9
        L49:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    public synchronized long getFirstSampleTimestampUs() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.firstSampleTimestampUs     // Catch: java.lang.Throwable -> L1c
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L15
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
        L15:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L1a:
            monitor-exit(r5)
            return r0
        L1c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public synchronized long getLastAdjustedTimestampUs() {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.lastUnadjustedTimestampUs     // Catch: java.lang.Throwable -> L16
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L10
            long r2 = r5.timestampOffsetUs     // Catch: java.lang.Throwable -> L16
            long r0 = r0 + r2
            goto L14
        L10:
            long r0 = r5.getFirstSampleTimestampUs()     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r5)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public synchronized long getTimestampOffsetUs() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.timestampOffsetUs     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized void reset(long r6) {
            r5 = this;
            monitor-enter(r5)
            r5.firstSampleTimestampUs = r6     // Catch: java.lang.Throwable -> L1b
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L14
            r6 = 0
            goto L15
        L14:
            r6 = r2
        L15:
            r5.timestampOffsetUs = r6     // Catch: java.lang.Throwable -> L1b
            r5.lastUnadjustedTimestampUs = r2     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r5)
            return
        L1b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public synchronized void sharedInitializeOrWait(boolean r6, long r7) throws java.lang.InterruptedException {
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.firstSampleTimestampUs     // Catch: java.lang.Throwable -> L37
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)     // Catch: java.lang.Throwable -> L37
            long r0 = r5.timestampOffsetUs     // Catch: java.lang.Throwable -> L37
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1f
            monitor-exit(r5)
            return
        L1f:
            if (r6 == 0) goto L2b
            java.lang.ThreadLocal<java.lang.Long> r6 = r5.nextSampleTimestampUs     // Catch: java.lang.Throwable -> L37
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L37
            r6.set(r7)     // Catch: java.lang.Throwable -> L37
            goto L35
        L2b:
            long r6 = r5.timestampOffsetUs     // Catch: java.lang.Throwable -> L37
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L35
            r5.wait()     // Catch: java.lang.Throwable -> L37
            goto L2b
        L35:
            monitor-exit(r5)
            return
        L37:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
