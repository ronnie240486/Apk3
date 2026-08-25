package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class ThreadFactoryBuilder {

    @javax.annotation.CheckForNull
    private java.util.concurrent.ThreadFactory backingThreadFactory;

    @javax.annotation.CheckForNull
    private java.lang.Boolean daemon;

    @javax.annotation.CheckForNull
    private java.lang.String nameFormat;

    @javax.annotation.CheckForNull
    private java.lang.Integer priority;

    @javax.annotation.CheckForNull
    private java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler;


    public ThreadFactoryBuilder() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.nameFormat = r0
            r1.daemon = r0
            r1.priority = r0
            r1.uncaughtExceptionHandler = r0
            r1.backingThreadFactory = r0
            return
    }

    public static /* synthetic */ java.lang.String access$000(java.lang.String r0, java.lang.Object[] r1) {
            java.lang.String r0 = format(r0, r1)
            return r0
    }

    private static java.util.concurrent.ThreadFactory doBuild(com.google.common.util.concurrent.ThreadFactoryBuilder r9) {
            java.lang.String r2 = r9.nameFormat
            java.lang.Boolean r4 = r9.daemon
            java.lang.Integer r5 = r9.priority
            java.lang.Thread$UncaughtExceptionHandler r6 = r9.uncaughtExceptionHandler
            java.util.concurrent.ThreadFactory r9 = r9.backingThreadFactory
            if (r9 == 0) goto Ld
            goto L11
        Ld:
            java.util.concurrent.ThreadFactory r9 = java.util.concurrent.Executors.defaultThreadFactory()
        L11:
            r1 = r9
            if (r2 == 0) goto L1c
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong
            r7 = 0
            r9.<init>(r7)
            goto L1d
        L1c:
            r9 = 0
        L1d:
            r3 = r9
            com.google.common.util.concurrent.ThreadFactoryBuilder$1 r9 = new com.google.common.util.concurrent.ThreadFactoryBuilder$1
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
    }

    private static java.lang.String format(java.lang.String r1, java.lang.Object... r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = java.lang.String.format(r0, r1, r2)
            return r1
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public java.util.concurrent.ThreadFactory build() {
            r1 = this;
            java.util.concurrent.ThreadFactory r0 = doBuild(r1)
            return r0
    }

    public com.google.common.util.concurrent.ThreadFactoryBuilder setDaemon(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.daemon = r1
            return r0
    }

    public com.google.common.util.concurrent.ThreadFactoryBuilder setNameFormat(java.lang.String r4) {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0[r1] = r2
            format(r4, r0)
            r3.nameFormat = r4
            return r3
    }

    public com.google.common.util.concurrent.ThreadFactoryBuilder setPriority(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 < r1) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.String r3 = "Thread priority (%s) must be >= %s"
            com.google.common.base.Preconditions.checkArgument(r2, r3, r5, r1)
            r2 = 10
            if (r5 > r2) goto L11
            r0 = 1
        L11:
            java.lang.String r1 = "Thread priority (%s) must be <= %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r5, r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.priority = r5
            return r4
    }

    public com.google.common.util.concurrent.ThreadFactoryBuilder setThreadFactory(java.util.concurrent.ThreadFactory r1) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.concurrent.ThreadFactory r1 = (java.util.concurrent.ThreadFactory) r1
            r0.backingThreadFactory = r1
            return r0
    }

    public com.google.common.util.concurrent.ThreadFactoryBuilder setUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler r1) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.Thread$UncaughtExceptionHandler r1 = (java.lang.Thread.UncaughtExceptionHandler) r1
            r0.uncaughtExceptionHandler = r1
            return r0
    }
}
