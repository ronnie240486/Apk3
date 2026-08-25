package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class UncaughtExceptionHandlers {

    @com.google.common.annotations.VisibleForTesting
    public static final class Exiter implements java.lang.Thread.UncaughtExceptionHandler {
        private static final java.util.logging.Logger logger = null;
        private final java.lang.Runtime runtime;

        static {
                java.lang.Class<com.google.common.util.concurrent.UncaughtExceptionHandlers$Exiter> r0 = com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter.class
                java.lang.String r0 = r0.getName()
                java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
                com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter.logger = r0
                return
        }

        public Exiter(java.lang.Runtime r1) {
                r0 = this;
                r0.<init>()
                r0.runtime = r1
                return
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
                r7 = this;
                r0 = 1
                java.util.logging.Logger r1 = com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter.logger     // Catch: java.lang.Throwable -> L16
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L16
                java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L16
                java.lang.String r4 = "Caught an exception in %s.  Shutting down."
                java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L16
                r6 = 0
                r5[r6] = r8     // Catch: java.lang.Throwable -> L16
                java.lang.String r8 = java.lang.String.format(r3, r4, r5)     // Catch: java.lang.Throwable -> L16
                r1.log(r2, r8, r9)     // Catch: java.lang.Throwable -> L16
                goto L29
            L16:
                r8 = move-exception
                java.io.PrintStream r1 = java.lang.System.err     // Catch: java.lang.Throwable -> L2f
                java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L2f
                r1.println(r9)     // Catch: java.lang.Throwable -> L2f
                java.io.PrintStream r9 = java.lang.System.err     // Catch: java.lang.Throwable -> L2f
                java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2f
                r9.println(r8)     // Catch: java.lang.Throwable -> L2f
            L29:
                java.lang.Runtime r8 = r7.runtime
                r8.exit(r0)
                return
            L2f:
                r8 = move-exception
                java.lang.Runtime r9 = r7.runtime
                r9.exit(r0)
                throw r8
        }
    }

    private UncaughtExceptionHandlers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Thread.UncaughtExceptionHandler systemExit() {
            com.google.common.util.concurrent.UncaughtExceptionHandlers$Exiter r0 = new com.google.common.util.concurrent.UncaughtExceptionHandlers$Exiter
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            r0.<init>(r1)
            return r0
    }
}
