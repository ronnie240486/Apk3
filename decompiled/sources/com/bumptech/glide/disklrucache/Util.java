package com.bumptech.glide.disklrucache;

/* JADX INFO: loaded from: classes2.dex */
final class Util {
    public static final java.nio.charset.Charset US_ASCII = null;
    public static final java.nio.charset.Charset UTF_8 = null;

    static {
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.bumptech.glide.disklrucache.Util.US_ASCII = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.bumptech.glide.disklrucache.Util.UTF_8 = r0
            return
    }

    private Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.RuntimeException -> L6 java.lang.Exception -> L8
            goto L8
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    public static void deleteContents(java.io.File r4) throws java.io.IOException {
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L36
            int r4 = r0.length
            r1 = 0
        L8:
            if (r1 >= r4) goto L35
            r2 = r0[r1]
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L15
            deleteContents(r2)
        L15:
            boolean r3 = r2.delete()
            if (r3 == 0) goto L1e
            int r1 = r1 + 1
            goto L8
        L1e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to delete file: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L35:
            return
        L36:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not a readable directory: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
