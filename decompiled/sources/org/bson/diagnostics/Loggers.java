package org.bson.diagnostics;

/* JADX INFO: loaded from: classes3.dex */
public final class Loggers {
    public static final java.lang.String PREFIX = "org.bson";
    private static final boolean USE_SLF4J = false;

    static {
            boolean r0 = shouldUseSLF4J()
            org.bson.diagnostics.Loggers.USE_SLF4J = r0
            return
    }

    private Loggers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.bson.diagnostics.Logger getLogger(java.lang.String r2) {
            java.lang.String r0 = "suffix"
            org.bson.assertions.Assertions.notNull(r0, r2)
            java.lang.String r0 = "."
            boolean r1 = r2.startsWith(r0)
            if (r1 != 0) goto L2a
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "org.bson."
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2)
            boolean r0 = org.bson.diagnostics.Loggers.USE_SLF4J
            if (r0 == 0) goto L24
            org.bson.diagnostics.SLF4JLogger r0 = new org.bson.diagnostics.SLF4JLogger
            r0.<init>(r2)
            return r0
        L24:
            org.bson.diagnostics.JULLogger r0 = new org.bson.diagnostics.JULLogger
            r0.<init>(r2)
            return r0
        L2a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The suffix can not start or end with a '.'"
            r2.<init>(r0)
            throw r2
    }

    private static boolean shouldUseSLF4J() {
            java.lang.String r0 = "org.slf4j.Logger"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }
}
