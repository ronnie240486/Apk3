package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes2.dex */
public final class LogTime {
    private static final double MILLIS_MULTIPLIER = 0.0d;

    static {
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            r4 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r2 = java.lang.Math.pow(r2, r4)
            double r0 = r0 / r2
            com.bumptech.glide.util.LogTime.MILLIS_MULTIPLIER = r0
            return
    }

    private LogTime() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double getElapsedMillis(long r2) {
            long r0 = getLogTime()
            long r0 = r0 - r2
            double r2 = (double) r0
            double r0 = com.bumptech.glide.util.LogTime.MILLIS_MULTIPLIER
            double r2 = r2 * r0
            return r2
    }

    @android.annotation.TargetApi(17)
    public static long getLogTime() {
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            return r0
    }
}
