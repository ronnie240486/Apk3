package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public final class DataSourceUtil {
    private DataSourceUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void closeQuietly(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.DataSource r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static byte[] readExactly(com.google.android.exoplayer2.upstream.DataSource r4, int r5) throws java.io.IOException {
            byte[] r0 = new byte[r5]
            r1 = 0
        L3:
            if (r1 >= r5) goto L1e
            int r2 = r5 - r1
            int r2 = r4.read(r0, r1, r2)
            r3 = -1
            if (r2 == r3) goto L10
            int r1 = r1 + r2
            goto L3
        L10:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not enough data could be read: "
            java.lang.String r2 = " < "
            java.lang.String r5 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r0, r1, r2, r5)
            r4.<init>(r5)
            throw r4
        L1e:
            return r0
    }

    public static byte[] readToEnd(com.google.android.exoplayer2.upstream.DataSource r4) throws java.io.IOException {
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 0
        L6:
            r3 = -1
            if (r1 == r3) goto L1d
            int r1 = r0.length
            if (r2 != r1) goto L13
            int r1 = r0.length
            int r1 = r1 * 2
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
        L13:
            int r1 = r0.length
            int r1 = r1 - r2
            int r1 = r4.read(r0, r2, r1)
            if (r1 == r3) goto L6
            int r2 = r2 + r1
            goto L6
        L1d:
            byte[] r4 = java.util.Arrays.copyOf(r0, r2)
            return r4
    }
}
