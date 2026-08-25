package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
final class UuidCodecHelper {
    private UuidCodecHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void reverseByteArray(byte[] r2, int r3, int r4) {
            int r4 = r4 + r3
            int r4 = r4 + (-1)
        L3:
            if (r3 >= r4) goto L12
            r0 = r2[r3]
            r1 = r2[r4]
            r2[r3] = r1
            r2[r4] = r0
            int r3 = r3 + 1
            int r4 = r4 + (-1)
            goto L3
        L12:
            return
    }
}
