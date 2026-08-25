package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
abstract class SmoothRateLimiter extends com.google.common.util.concurrent.RateLimiter {
    public double maxPermits;
    private long nextFreeTicketMicros;
    public double stableIntervalMicros;
    public double storedPermits;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.SmoothRateLimiter$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SmoothBursty extends com.google.common.util.concurrent.SmoothRateLimiter {
        public final double maxBurstSeconds;

        public SmoothBursty(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch r3) {
                r2 = this;
                r0 = 0
                r2.<init>(r3, r0)
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r2.maxBurstSeconds = r0
                return
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public final double coolDownIntervalMicros() {
                r2 = this;
                double r0 = r2.stableIntervalMicros
                return r0
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public final void doSetRate(double r4, double r6) {
                r3 = this;
                double r6 = r3.maxPermits
                double r0 = r3.maxBurstSeconds
                double r0 = r0 * r4
                r3.maxPermits = r0
                r4 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
                int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r2 != 0) goto L11
                r3.storedPermits = r0
                goto L1f
            L11:
                r4 = 0
                int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r2 != 0) goto L18
                goto L1d
            L18:
                double r4 = r3.storedPermits
                double r4 = r4 * r0
                double r4 = r4 / r6
            L1d:
                r3.storedPermits = r4
            L1f:
                return
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public final long storedPermitsToWaitTime(double r1, double r3) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public static final class SmoothWarmingUp extends com.google.common.util.concurrent.SmoothRateLimiter {
        private double coldFactor;
        private double slope;
        private double thresholdPermits;
        private final long warmupPeriodMicros;

        public SmoothWarmingUp(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch r2, long r3, java.util.concurrent.TimeUnit r5) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                long r2 = r5.toMicros(r3)
                r1.warmupPeriodMicros = r2
                r2 = 4613937818241073152(0x4008000000000000, double:3.0)
                r1.coldFactor = r2
                return
        }

        private double permitsToTime(double r5) {
                r4 = this;
                double r0 = r4.stableIntervalMicros
                double r2 = r4.slope
                double r5 = r5 * r2
                double r5 = r5 + r0
                return r5
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public final double coolDownIntervalMicros() {
                r4 = this;
                long r0 = r4.warmupPeriodMicros
                double r0 = (double) r0
                double r2 = r4.maxPermits
                double r0 = r0 / r2
                return r0
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public final void doSetRate(double r9, double r11) {
                r8 = this;
                double r9 = r8.maxPermits
                double r0 = r8.coldFactor
                double r0 = r0 * r11
                long r2 = r8.warmupPeriodMicros
                double r2 = (double) r2
                r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r4 = r4 * r2
                double r4 = r4 / r11
                r8.thresholdPermits = r4
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r2 = r2 * r6
                double r6 = r11 + r0
                double r2 = r2 / r6
                double r2 = r2 + r4
                r8.maxPermits = r2
                double r0 = r0 - r11
                double r11 = r2 - r4
                double r0 = r0 / r11
                r8.slope = r0
                r11 = 0
                r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
                int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r4 != 0) goto L2b
                r8.storedPermits = r11
                goto L38
            L2b:
                int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r0 != 0) goto L30
                goto L36
            L30:
                double r11 = r8.storedPermits
                double r11 = r11 * r2
                double r2 = r11 / r9
            L36:
                r8.storedPermits = r2
            L38:
                return
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        public final long storedPermitsToWaitTime(double r5, double r7) {
                r4 = this;
                double r0 = r4.thresholdPermits
                double r5 = r5 - r0
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 <= 0) goto L1f
                double r0 = java.lang.Math.min(r5, r7)
                double r2 = r4.permitsToTime(r5)
                double r5 = r5 - r0
                double r5 = r4.permitsToTime(r5)
                double r2 = r2 + r5
                double r2 = r2 * r0
                r5 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r2 = r2 / r5
                long r5 = (long) r2
                double r7 = r7 - r0
                goto L21
            L1f:
                r5 = 0
            L21:
                double r0 = r4.stableIntervalMicros
                double r0 = r0 * r7
                long r7 = (long) r0
                long r5 = r5 + r7
                return r5
        }
    }

    private SmoothRateLimiter(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.nextFreeTicketMicros = r0
            return
    }

    public /* synthetic */ SmoothRateLimiter(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch r1, com.google.common.util.concurrent.SmoothRateLimiter.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public abstract double coolDownIntervalMicros();

    @Override // com.google.common.util.concurrent.RateLimiter
    public final double doGetRate() {
            r4 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r0 = r0.toMicros(r1)
            double r0 = (double) r0
            double r2 = r4.stableIntervalMicros
            double r0 = r0 / r2
            return r0
    }

    public abstract void doSetRate(double r1, double r3);

    @Override // com.google.common.util.concurrent.RateLimiter
    public final void doSetRate(double r3, long r5) {
            r2 = this;
            r2.resync(r5)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 1
            long r5 = r5.toMicros(r0)
            double r5 = (double) r5
            double r5 = r5 / r3
            r2.stableIntervalMicros = r5
            r2.doSetRate(r3, r5)
            return
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final long queryEarliestAvailable() {
            r2 = this;
            long r0 = r2.nextFreeTicketMicros
            return r0
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    public final long reserveEarliestAvailable(int r9, long r10) {
            r8 = this;
            r8.resync(r10)
            long r10 = r8.nextFreeTicketMicros
            double r0 = (double) r9
            double r2 = r8.storedPermits
            double r2 = java.lang.Math.min(r0, r2)
            double r0 = r0 - r2
            double r4 = r8.storedPermits
            long r4 = r8.storedPermitsToWaitTime(r4, r2)
            double r6 = r8.stableIntervalMicros
            double r0 = r0 * r6
            long r0 = (long) r0
            long r4 = r4 + r0
            long r0 = r8.nextFreeTicketMicros
            long r0 = com.google.common.math.LongMath.saturatedAdd(r0, r4)
            r8.nextFreeTicketMicros = r0
            double r0 = r8.storedPermits
            double r0 = r0 - r2
            r8.storedPermits = r0
            return r10
    }

    public final void resync(long r7) {
            r6 = this;
            long r0 = r6.nextFreeTicketMicros
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1b
            long r0 = r7 - r0
            double r0 = (double) r0
            double r2 = r6.coolDownIntervalMicros()
            double r0 = r0 / r2
            double r2 = r6.maxPermits
            double r4 = r6.storedPermits
            double r4 = r4 + r0
            double r0 = java.lang.Math.min(r2, r4)
            r6.storedPermits = r0
            r6.nextFreeTicketMicros = r7
        L1b:
            return
    }

    public abstract long storedPermitsToWaitTime(double r1, double r3);
}
