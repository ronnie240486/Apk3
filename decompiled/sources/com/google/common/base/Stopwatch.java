package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Stopwatch {
    private long elapsedNanos;
    private boolean isRunning;
    private long startTick;
    private final com.google.common.base.Ticker ticker;

    /* JADX INFO: renamed from: com.google.common.base.Stopwatch$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit = null;

        static {
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.base.Stopwatch.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.base.Stopwatch.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit     // Catch: java.lang.NoSuchFieldError -> L1d
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.common.base.Stopwatch.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit     // Catch: java.lang.NoSuchFieldError -> L28
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.common.base.Stopwatch.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit     // Catch: java.lang.NoSuchFieldError -> L33
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.common.base.Stopwatch.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit     // Catch: java.lang.NoSuchFieldError -> L3e
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.common.base.Stopwatch.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit     // Catch: java.lang.NoSuchFieldError -> L49
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.common.base.Stopwatch.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit     // Catch: java.lang.NoSuchFieldError -> L54
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public Stopwatch() {
            r1 = this;
            r1.<init>()
            com.google.common.base.Ticker r0 = com.google.common.base.Ticker.systemTicker()
            r1.ticker = r0
            return
    }

    public Stopwatch(com.google.common.base.Ticker r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "ticker"
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.base.Ticker r2 = (com.google.common.base.Ticker) r2
            r1.ticker = r2
            return
    }

    private static java.lang.String abbreviate(java.util.concurrent.TimeUnit r1) {
            int[] r0 = com.google.common.base.Stopwatch.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L25;
                case 2: goto L21;
                case 3: goto L1e;
                case 4: goto L1a;
                case 5: goto L17;
                case 6: goto L14;
                case 7: goto L11;
                default: goto Lb;
            }
        Lb:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L11:
            java.lang.String r1 = "d"
            return r1
        L14:
            java.lang.String r1 = "h"
            return r1
        L17:
            java.lang.String r1 = "min"
            return r1
        L1a:
            java.lang.String r1 = "s"
            return r1
        L1e:
            java.lang.String r1 = "ms"
            return r1
        L21:
            java.lang.String r1 = "μs"
            return r1
        L25:
            java.lang.String r1 = "ns"
            return r1
    }

    private static java.util.concurrent.TimeUnit chooseUnit(long r7) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r2 = r0.convert(r7, r1)
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto Lf
            return r0
        Lf:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            long r2 = r0.convert(r7, r1)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1a
            return r0
        L1a:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            long r2 = r0.convert(r7, r1)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L25
            return r0
        L25:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r0.convert(r7, r1)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L30
            return r0
        L30:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r0.convert(r7, r1)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3b
            return r0
        L3b:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r7 = r0.convert(r7, r1)
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 <= 0) goto L46
            return r0
        L46:
            return r1
    }

    public static com.google.common.base.Stopwatch createStarted() {
            com.google.common.base.Stopwatch r0 = new com.google.common.base.Stopwatch
            r0.<init>()
            com.google.common.base.Stopwatch r0 = r0.start()
            return r0
    }

    public static com.google.common.base.Stopwatch createStarted(com.google.common.base.Ticker r1) {
            com.google.common.base.Stopwatch r0 = new com.google.common.base.Stopwatch
            r0.<init>(r1)
            com.google.common.base.Stopwatch r1 = r0.start()
            return r1
    }

    public static com.google.common.base.Stopwatch createUnstarted() {
            com.google.common.base.Stopwatch r0 = new com.google.common.base.Stopwatch
            r0.<init>()
            return r0
    }

    public static com.google.common.base.Stopwatch createUnstarted(com.google.common.base.Ticker r1) {
            com.google.common.base.Stopwatch r0 = new com.google.common.base.Stopwatch
            r0.<init>(r1)
            return r0
    }

    private long elapsedNanos() {
            r4 = this;
            boolean r0 = r4.isRunning
            if (r0 == 0) goto L11
            com.google.common.base.Ticker r0 = r4.ticker
            long r0 = r0.read()
            long r2 = r4.startTick
            long r0 = r0 - r2
            long r2 = r4.elapsedNanos
            long r0 = r0 + r2
            goto L13
        L11:
            long r0 = r4.elapsedNanos
        L13:
            return r0
    }

    public long elapsed(java.util.concurrent.TimeUnit r4) {
            r3 = this;
            long r0 = r3.elapsedNanos()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r4.convert(r0, r2)
            return r0
    }

    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.isRunning
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.base.Stopwatch reset() {
            r2 = this;
            r0 = 0
            r2.elapsedNanos = r0
            r0 = 0
            r2.isRunning = r0
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.base.Stopwatch start() {
            r3 = this;
            boolean r0 = r3.isRunning
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "This stopwatch is already running."
            com.google.common.base.Preconditions.checkState(r0, r2)
            r3.isRunning = r1
            com.google.common.base.Ticker r0 = r3.ticker
            long r0 = r0.read()
            r3.startTick = r0
            return r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.common.base.Stopwatch stop() {
            r6 = this;
            com.google.common.base.Ticker r0 = r6.ticker
            long r0 = r0.read()
            boolean r2 = r6.isRunning
            java.lang.String r3 = "This stopwatch is already stopped."
            com.google.common.base.Preconditions.checkState(r2, r3)
            r2 = 0
            r6.isRunning = r2
            long r2 = r6.elapsedNanos
            long r4 = r6.startTick
            long r0 = r0 - r4
            long r0 = r0 + r2
            r6.elapsedNanos = r0
            return r6
    }

    public java.lang.String toString() {
            r6 = this;
            long r0 = r6.elapsedNanos()
            java.util.concurrent.TimeUnit r2 = chooseUnit(r0)
            double r0 = (double) r0
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            r4 = 1
            long r3 = r3.convert(r4, r2)
            double r3 = (double) r3
            double r0 = r0 / r3
            int r3 = com.google.common.base.Platform.$r8$clinit
            java.util.Locale r3 = java.util.Locale.ROOT
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r1 = 0
            r5[r1] = r0
            java.lang.String r0 = "%.4g"
            java.lang.String r0 = java.lang.String.format(r3, r0, r5)
            java.lang.String r1 = abbreviate(r2)
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r4)
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2)
            java.lang.String r3 = " "
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r0, r3, r1)
            return r0
    }
}
