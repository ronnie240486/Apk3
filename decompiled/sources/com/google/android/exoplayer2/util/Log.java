package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static final java.lang.Object lock = null;

    @androidx.annotation.GuardedBy("lock")
    private static int logLevel = 0;

    @androidx.annotation.GuardedBy("lock")
    private static boolean logStackTraces = true;

    @androidx.annotation.GuardedBy("lock")
    private static com.google.android.exoplayer2.util.Log.Logger logger;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Logger {
        public static final com.google.android.exoplayer2.util.Log.Logger DEFAULT = null;


        static {
                com.google.android.exoplayer2.util.Log$Logger$1 r0 = new com.google.android.exoplayer2.util.Log$Logger$1
                r0.<init>()
                com.google.android.exoplayer2.util.Log.Logger.DEFAULT = r0
                return
        }

        void d(java.lang.String r1, java.lang.String r2);

        void e(java.lang.String r1, java.lang.String r2);

        void i(java.lang.String r1, java.lang.String r2);

        void w(java.lang.String r1, java.lang.String r2);
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.exoplayer2.util.Log.lock = r0
            com.google.android.exoplayer2.util.Log$Logger r0 = com.google.android.exoplayer2.util.Log.Logger.DEFAULT
            com.google.android.exoplayer2.util.Log.logger = r0
            return
    }

    private Log() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.checkerframework.dataflow.qual.Pure
    private static java.lang.String appendThrowableString(java.lang.String r2, @androidx.annotation.Nullable java.lang.Throwable r3) {
            java.lang.String r3 = getThrowableString(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L22
            java.lang.String r0 = "\n  "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r2, r0)
            java.lang.String r1 = "\n"
            java.lang.String r3 = r3.replace(r1, r0)
            r2.append(r3)
            r3 = 10
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L22:
            return r2
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void d(@androidx.annotation.Size(max = 23) java.lang.String r2, java.lang.String r3) {
            java.lang.Object r0 = com.google.android.exoplayer2.util.Log.lock
            monitor-enter(r0)
            int r1 = com.google.android.exoplayer2.util.Log.logLevel     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto Lc
            com.google.android.exoplayer2.util.Log$Logger r1 = com.google.android.exoplayer2.util.Log.logger     // Catch: java.lang.Throwable -> Le
            r1.d(r2, r3)     // Catch: java.lang.Throwable -> Le
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void d(@androidx.annotation.Size(max = 23) java.lang.String r0, java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
            java.lang.String r1 = appendThrowableString(r1, r2)
            d(r0, r1)
            return
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void e(@androidx.annotation.Size(max = 23) java.lang.String r3, java.lang.String r4) {
            java.lang.Object r0 = com.google.android.exoplayer2.util.Log.lock
            monitor-enter(r0)
            int r1 = com.google.android.exoplayer2.util.Log.logLevel     // Catch: java.lang.Throwable -> Lf
            r2 = 3
            if (r1 > r2) goto Ld
            com.google.android.exoplayer2.util.Log$Logger r1 = com.google.android.exoplayer2.util.Log.logger     // Catch: java.lang.Throwable -> Lf
            r1.e(r3, r4)     // Catch: java.lang.Throwable -> Lf
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void e(@androidx.annotation.Size(max = 23) java.lang.String r0, java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
            java.lang.String r1 = appendThrowableString(r1, r2)
            e(r0, r1)
            return
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int getLogLevel() {
            java.lang.Object r0 = com.google.android.exoplayer2.util.Log.lock
            monitor-enter(r0)
            int r1 = com.google.android.exoplayer2.util.Log.logLevel     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @androidx.annotation.Nullable
    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String getThrowableString(@androidx.annotation.Nullable java.lang.Throwable r3) {
            java.lang.Object r0 = com.google.android.exoplayer2.util.Log.lock
            monitor-enter(r0)
            if (r3 != 0) goto L8
            r3 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return r3
        L8:
            boolean r1 = isCausedByUnknownHostException(r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L12
            java.lang.String r3 = "UnknownHostException (no network)"
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return r3
        L12:
            boolean r1 = com.google.android.exoplayer2.util.Log.logStackTraces     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L1c
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return r3
        L1c:
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "\t"
            java.lang.String r2 = "    "
            java.lang.String r3 = r3.replace(r1, r2)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return r3
        L2e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r3
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void i(@androidx.annotation.Size(max = 23) java.lang.String r3, java.lang.String r4) {
            java.lang.Object r0 = com.google.android.exoplayer2.util.Log.lock
            monitor-enter(r0)
            int r1 = com.google.android.exoplayer2.util.Log.logLevel     // Catch: java.lang.Throwable -> Lf
            r2 = 1
            if (r1 > r2) goto Ld
            com.google.android.exoplayer2.util.Log$Logger r1 = com.google.android.exoplayer2.util.Log.logger     // Catch: java.lang.Throwable -> Lf
            r1.i(r3, r4)     // Catch: java.lang.Throwable -> Lf
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void i(@androidx.annotation.Size(max = 23) java.lang.String r0, java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
            java.lang.String r1 = appendThrowableString(r1, r2)
            i(r0, r1)
            return
    }

    @org.checkerframework.dataflow.qual.Pure
    private static boolean isCausedByUnknownHostException(@androidx.annotation.Nullable java.lang.Throwable r1) {
        L0:
            if (r1 == 0) goto Ld
            boolean r0 = r1 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            java.lang.Throwable r1 = r1.getCause()
            goto L0
        Ld:
            r1 = 0
            return r1
    }

    public static void setLogLevel(int r1) {
            java.lang.Object r0 = com.google.android.exoplayer2.util.Log.lock
            monitor-enter(r0)
            com.google.android.exoplayer2.util.Log.logLevel = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static void setLogStackTraces(boolean r1) {
            java.lang.Object r0 = com.google.android.exoplayer2.util.Log.lock
            monitor-enter(r0)
            com.google.android.exoplayer2.util.Log.logStackTraces = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static void setLogger(com.google.android.exoplayer2.util.Log.Logger r1) {
            java.lang.Object r0 = com.google.android.exoplayer2.util.Log.lock
            monitor-enter(r0)
            com.google.android.exoplayer2.util.Log.logger = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void w(@androidx.annotation.Size(max = 23) java.lang.String r3, java.lang.String r4) {
            java.lang.Object r0 = com.google.android.exoplayer2.util.Log.lock
            monitor-enter(r0)
            int r1 = com.google.android.exoplayer2.util.Log.logLevel     // Catch: java.lang.Throwable -> Lf
            r2 = 2
            if (r1 > r2) goto Ld
            com.google.android.exoplayer2.util.Log$Logger r1 = com.google.android.exoplayer2.util.Log.logger     // Catch: java.lang.Throwable -> Lf
            r1.w(r3, r4)     // Catch: java.lang.Throwable -> Lf
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void w(@androidx.annotation.Size(max = 23) java.lang.String r0, java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
            java.lang.String r1 = appendThrowableString(r1, r2)
            w(r0, r1)
            return
    }
}
