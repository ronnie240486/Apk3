package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public abstract class RateLimiter {

    @javax.annotation.CheckForNull
    private volatile java.lang.Object mutexDoNotUseDirectly;
    private final com.google.common.util.concurrent.RateLimiter.SleepingStopwatch stopwatch;

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class SleepingStopwatch {


        public SleepingStopwatch() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.common.util.concurrent.RateLimiter.SleepingStopwatch createFromSystemTimer() {
                com.google.common.util.concurrent.RateLimiter$SleepingStopwatch$1 r0 = new com.google.common.util.concurrent.RateLimiter$SleepingStopwatch$1
                r0.<init>()
                return r0
        }

        public abstract long readMicros();

        public abstract void sleepMicrosUninterruptibly(long r1);
    }

    public RateLimiter(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r1 = (com.google.common.util.concurrent.RateLimiter.SleepingStopwatch) r1
            r0.stopwatch = r1
            return
    }

    private boolean canAcquire(long r3, long r5) {
            r2 = this;
            long r0 = r2.queryEarliestAvailable()
            long r0 = r0 - r5
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            return r3
    }

    private static void checkPermits(int r2) {
            if (r2 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "Requested permits (%s) must be positive"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            return
    }

    public static com.google.common.util.concurrent.RateLimiter create(double r2) {
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r0 = com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.createFromSystemTimer()
            com.google.common.util.concurrent.SmoothRateLimiter$SmoothBursty r1 = new com.google.common.util.concurrent.SmoothRateLimiter$SmoothBursty
            r1.<init>(r0)
            r1.setRate(r2)
            return r1
    }

    public static com.google.common.util.concurrent.RateLimiter create(double r3, long r5, java.util.concurrent.TimeUnit r7) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.String r1 = "warmupPeriod must not be negative: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r5)
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r0 = com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.createFromSystemTimer()
            com.google.common.util.concurrent.SmoothRateLimiter$SmoothWarmingUp r1 = new com.google.common.util.concurrent.SmoothRateLimiter$SmoothWarmingUp
            r1.<init>(r0, r5, r7)
            r1.setRate(r3)
            return r1
    }

    private java.lang.Object mutex() {
            r1 = this;
            java.lang.Object r0 = r1.mutexDoNotUseDirectly
            if (r0 != 0) goto L15
            monitor-enter(r1)
            java.lang.Object r0 = r1.mutexDoNotUseDirectly     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L10
            java.lang.Object r0 = new java.lang.Object     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            r1.mutexDoNotUseDirectly = r0     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
        L15:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public double acquire() {
            r2 = this;
            r0 = 1
            double r0 = r2.acquire(r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public double acquire(int r6) {
            r5 = this;
            checkPermits(r6)
            java.lang.Object r0 = r5.mutex()
            monitor-enter(r0)
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r1 = r5.stopwatch     // Catch: java.lang.Throwable -> L2f
            long r1 = r1.readMicros()     // Catch: java.lang.Throwable -> L2f
            long r3 = r5.reserveEarliestAvailable(r6, r1)     // Catch: java.lang.Throwable -> L2f
            long r3 = r3 - r1
            r1 = 0
            long r1 = java.lang.Math.max(r3, r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r6 = r5.stopwatch
            r6.sleepMicrosUninterruptibly(r1)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = (double) r1
            double r0 = r0 * r3
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 1
            long r2 = r6.toMicros(r2)
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
        L2f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r6
    }

    public abstract double doGetRate();

    public abstract void doSetRate(double r1, long r3);

    public final double getRate() {
            r3 = this;
            java.lang.Object r0 = r3.mutex()
            monitor-enter(r0)
            double r1 = r3.doGetRate()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public abstract long queryEarliestAvailable();

    public abstract long reserveEarliestAvailable(int r1, long r2);

    public final void setRate(double r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Le
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r1 = "rate must be positive"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            java.lang.Object r0 = r3.mutex()
            monitor-enter(r0)
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r1 = r3.stopwatch     // Catch: java.lang.Throwable -> L24
            long r1 = r1.readMicros()     // Catch: java.lang.Throwable -> L24
            r3.doSetRate(r4, r1)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            double r2 = r4.getRate()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "RateLimiter[stableRate=%3.1fqps]"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    public boolean tryAcquire() {
            r4 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            r1 = 1
            r2 = 0
            boolean r0 = r4.tryAcquire(r1, r2, r0)
            return r0
    }

    public boolean tryAcquire(int r4) {
            r3 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            r1 = 0
            boolean r4 = r3.tryAcquire(r4, r1, r0)
            return r4
    }

    public boolean tryAcquire(int r5, long r6, java.util.concurrent.TimeUnit r8) {
            r4 = this;
            long r6 = r8.toMicros(r6)
            r0 = 0
            long r6 = java.lang.Math.max(r6, r0)
            checkPermits(r5)
            java.lang.Object r8 = r4.mutex()
            monitor-enter(r8)
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r2 = r4.stopwatch     // Catch: java.lang.Throwable -> L32
            long r2 = r2.readMicros()     // Catch: java.lang.Throwable -> L32
            boolean r6 = r4.canAcquire(r2, r6)     // Catch: java.lang.Throwable -> L32
            if (r6 != 0) goto L21
            r5 = 0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L32
            return r5
        L21:
            long r5 = r4.reserveEarliestAvailable(r5, r2)     // Catch: java.lang.Throwable -> L32
            long r5 = r5 - r2
            long r5 = java.lang.Math.max(r5, r0)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L32
            com.google.common.util.concurrent.RateLimiter$SleepingStopwatch r7 = r4.stopwatch
            r7.sleepMicrosUninterruptibly(r5)
            r5 = 1
            return r5
        L32:
            r5 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L32
            throw r5
    }

    public boolean tryAcquire(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.tryAcquire(r0, r2, r4)
            return r2
    }
}
