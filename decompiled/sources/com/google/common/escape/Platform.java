package com.google.common.escape;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.escape.ElementTypesAreNonnullByDefault
final class Platform {
    private static final java.lang.ThreadLocal<char[]> DEST_TL = null;


    static {
            com.google.common.escape.Platform$1 r0 = new com.google.common.escape.Platform$1
            r0.<init>()
            com.google.common.escape.Platform.DEST_TL = r0
            return
    }

    private Platform() {
            r0 = this;
            r0.<init>()
            return
    }

    public static char[] charBufferFromThreadLocal() {
            java.lang.ThreadLocal<char[]> r0 = com.google.common.escape.Platform.DEST_TL
            java.lang.Object r0 = r0.get()
            char[] r0 = (char[]) r0
            return r0
    }
}
