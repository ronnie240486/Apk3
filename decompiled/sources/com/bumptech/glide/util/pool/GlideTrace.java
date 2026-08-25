package com.bumptech.glide.util.pool;

/* JADX INFO: loaded from: classes.dex */
public final class GlideTrace {
    private static final int MAX_LENGTH = 127;
    private static final boolean TRACING_ENABLED = false;

    private GlideTrace() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginSection(java.lang.String r0) {
            return
    }

    public static void beginSectionFormat(java.lang.String r0, java.lang.Object r1) {
            return
    }

    public static void beginSectionFormat(java.lang.String r0, java.lang.Object r1, java.lang.Object r2) {
            return
    }

    public static void beginSectionFormat(java.lang.String r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            return
    }

    public static void endSection() {
            return
    }

    private static java.lang.String truncateTag(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto Lf
            r0 = 0
            r1 = 126(0x7e, float:1.77E-43)
            java.lang.String r2 = r2.substring(r0, r1)
        Lf:
            return r2
    }
}
