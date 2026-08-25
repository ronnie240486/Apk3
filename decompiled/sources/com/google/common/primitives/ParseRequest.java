package com.google.common.primitives;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtCompatible
final class ParseRequest {
    public final int radix;
    public final java.lang.String rawValue;

    private ParseRequest(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.rawValue = r1
            r0.radix = r2
            return
    }

    public static com.google.common.primitives.ParseRequest fromString(java.lang.String r4) {
            int r0 = r4.length()
            if (r0 == 0) goto L47
            r0 = 0
            char r0 = r4.charAt(r0)
            java.lang.String r1 = "0x"
            boolean r1 = r4.startsWith(r1)
            r2 = 16
            if (r1 != 0) goto L3c
            java.lang.String r1 = "0X"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L1e
            goto L3c
        L1e:
            r1 = 35
            r3 = 1
            if (r0 != r1) goto L28
            java.lang.String r4 = r4.substring(r3)
            goto L41
        L28:
            r1 = 48
            if (r0 != r1) goto L39
            int r0 = r4.length()
            if (r0 <= r3) goto L39
            java.lang.String r4 = r4.substring(r3)
            r2 = 8
            goto L41
        L39:
            r2 = 10
            goto L41
        L3c:
            r0 = 2
            java.lang.String r4 = r4.substring(r0)
        L41:
            com.google.common.primitives.ParseRequest r0 = new com.google.common.primitives.ParseRequest
            r0.<init>(r4, r2)
            return r0
        L47:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            java.lang.String r0 = "empty string"
            r4.<init>(r0)
            throw r4
    }
}
