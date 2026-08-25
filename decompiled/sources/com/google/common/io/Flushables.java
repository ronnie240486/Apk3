package com.google.common.io;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
public final class Flushables {
    private static final java.util.logging.Logger logger = null;

    static {
            java.lang.Class<com.google.common.io.Flushables> r0 = com.google.common.io.Flushables.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.io.Flushables.logger = r0
            return
    }

    private Flushables() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void flush(java.io.Flushable r2, boolean r3) throws java.io.IOException {
            r2.flush()     // Catch: java.io.IOException -> L4
            goto L10
        L4:
            r2 = move-exception
            if (r3 == 0) goto L11
            java.util.logging.Logger r3 = com.google.common.io.Flushables.logger
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            java.lang.String r1 = "IOException thrown while flushing Flushable."
            r3.log(r0, r1, r2)
        L10:
            return
        L11:
            throw r2
    }

    public static void flushQuietly(java.io.Flushable r3) {
            r0 = 1
            flush(r3, r0)     // Catch: java.io.IOException -> L5
            goto Lf
        L5:
            r3 = move-exception
            java.util.logging.Logger r0 = com.google.common.io.Flushables.logger
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.String r2 = "IOException should not have been thrown."
            r0.log(r1, r2, r3)
        Lf:
            return
    }
}
