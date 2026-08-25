package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
@java.lang.Deprecated
public final class IOUtils {
    private IOUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void closeQuietly(@javax.annotation.Nullable android.os.ParcelFileDescriptor r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void closeQuietly(@javax.annotation.Nullable java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static long copyStream(@androidx.annotation.NonNull java.io.InputStream r2, @androidx.annotation.NonNull java.io.OutputStream r3) throws java.io.IOException {
            r0 = 0
            r1 = 1024(0x400, float:1.435E-42)
            long r2 = copyStream(r2, r3, r0, r1)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static long copyStream(@androidx.annotation.NonNull java.io.InputStream r7, @androidx.annotation.NonNull java.io.OutputStream r8, boolean r9, int r10) throws java.io.IOException {
            byte[] r0 = new byte[r10]
            r1 = 0
        L4:
            r3 = 0
            int r4 = r7.read(r0, r3, r10)     // Catch: java.lang.Throwable -> L1b
            r5 = -1
            if (r4 == r5) goto L12
            long r5 = (long) r4     // Catch: java.lang.Throwable -> L1b
            long r1 = r1 + r5
            r8.write(r0, r3, r4)     // Catch: java.lang.Throwable -> L1b
            goto L4
        L12:
            if (r9 == 0) goto L1a
            closeQuietly(r7)
            closeQuietly(r8)
        L1a:
            return r1
        L1b:
            r10 = move-exception
            if (r9 != 0) goto L1f
            goto L25
        L1f:
            closeQuietly(r7)
            closeQuietly(r8)
        L25:
            throw r10
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isGzipByteBuffer(@androidx.annotation.NonNull byte[] r3) {
            int r0 = r3.length
            r1 = 0
            r2 = 1
            if (r0 <= r2) goto L16
            r0 = r3[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = r3[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r3 = r3 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r3 != r0) goto L16
            return r2
        L16:
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static byte[] readInputStreamFully(@androidx.annotation.NonNull java.io.InputStream r1) throws java.io.IOException {
            r0 = 1
            byte[] r1 = readInputStreamFully(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static byte[] readInputStreamFully(@androidx.annotation.NonNull java.io.InputStream r2, boolean r3) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            copyStream(r2, r0, r3, r1)
            byte[] r2 = r0.toByteArray()
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static byte[] toByteArray(@androidx.annotation.NonNull java.io.InputStream r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]
        Lf:
            int r2 = r4.read(r1)
            r3 = -1
            if (r2 != r3) goto L1b
            byte[] r4 = r0.toByteArray()
            return r4
        L1b:
            r3 = 0
            r0.write(r1, r3, r2)
            goto Lf
    }
}
