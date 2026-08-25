package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TypefaceCompatUtil {
    private static final java.lang.String CACHE_FILE_PREFIX = ".font";
    private static final java.lang.String TAG = "TypefaceCompatUtil";

    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.os.ParcelFileDescriptor openFileDescriptor(android.content.ContentResolver r0, android.net.Uri r1, java.lang.String r2, android.os.CancellationSignal r3) throws java.io.FileNotFoundException {
                android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r1, r2, r3)
                return r0
        }
    }

    private TypefaceCompatUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void closeQuietly(@androidx.annotation.Nullable java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(19)
    public static java.nio.ByteBuffer copyToDirectBuffer(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.content.res.Resources r2, int r3) {
            java.io.File r1 = getTempFile(r1)
            r0 = 0
            if (r1 != 0) goto L8
            return r0
        L8:
            boolean r2 = copyToFile(r1, r2, r3)     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L12
            r1.delete()
            return r0
        L12:
            java.nio.ByteBuffer r2 = mmap(r1)     // Catch: java.lang.Throwable -> L1a
            r1.delete()
            return r2
        L1a:
            r2 = move-exception
            r1.delete()
            throw r2
    }

    public static boolean copyToFile(@androidx.annotation.NonNull java.io.File r0, @androidx.annotation.NonNull android.content.res.Resources r1, int r2) {
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch: java.lang.Throwable -> Le
            boolean r0 = copyToFile(r0, r1)     // Catch: java.lang.Throwable -> Lc
            closeQuietly(r1)
            return r0
        Lc:
            r0 = move-exception
            goto L10
        Le:
            r0 = move-exception
            r1 = 0
        L10:
            closeQuietly(r1)
            throw r0
    }

    public static boolean copyToFile(@androidx.annotation.NonNull java.io.File r5, @androidx.annotation.NonNull java.io.InputStream r6) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
        Lf:
            int r2 = r6.read(r5)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
            r4 = -1
            if (r2 == r4) goto L1a
            r3.write(r5, r1, r2)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
            goto Lf
        L1a:
            r5 = 1
            closeQuietly(r3)
            android.os.StrictMode.setThreadPolicy(r0)
            return r5
        L22:
            r5 = move-exception
            r2 = r3
            goto L4c
        L25:
            r5 = move-exception
            r2 = r3
            goto L2b
        L28:
            r5 = move-exception
            goto L4c
        L2a:
            r5 = move-exception
        L2b:
            java.lang.String r6 = "TypefaceCompatUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r3.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "Error copying resource contents to temp file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L28
            r3.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L28
            android.util.Log.e(r6, r5)     // Catch: java.lang.Throwable -> L28
            closeQuietly(r2)
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L4c:
            closeQuietly(r2)
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
    }

    @androidx.annotation.Nullable
    public static java.io.File getTempFile(@androidx.annotation.NonNull android.content.Context r5) {
            java.io.File r5 = r5.getCacheDir()
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = ".font"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = android.os.Process.myPid()
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            int r3 = android.os.Process.myTid()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
        L29:
            r3 = 100
            if (r2 >= r3) goto L40
            java.io.File r3 = new java.io.File
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
            r3.<init>(r5, r4)
            boolean r4 = r3.createNewFile()     // Catch: java.io.IOException -> L3d
            if (r4 == 0) goto L3d
            return r3
        L3d:
            int r2 = r2 + 1
            goto L29
        L40:
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(19)
    public static java.nio.ByteBuffer mmap(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.os.CancellationSignal r8, @androidx.annotation.NonNull android.net.Uri r9) {
            android.content.ContentResolver r7 = r7.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = androidx.core.graphics.TypefaceCompatUtil.Api19Impl.openFileDescriptor(r7, r9, r1, r8)     // Catch: java.io.IOException -> L48
            if (r7 != 0) goto L14
            if (r7 == 0) goto L13
            r7.close()     // Catch: java.io.IOException -> L48
        L13:
            return r0
        L14:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3e
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch: java.lang.Throwable -> L3e
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L3e
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch: java.lang.Throwable -> L34
            long r5 = r1.size()     // Catch: java.lang.Throwable -> L34
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L34
            r3 = 0
            java.nio.MappedByteBuffer r9 = r1.map(r2, r3, r5)     // Catch: java.lang.Throwable -> L34
            r8.close()     // Catch: java.lang.Throwable -> L3e
            r7.close()     // Catch: java.io.IOException -> L48
            return r9
        L34:
            r9 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r8 = move-exception
            r9.addSuppressed(r8)     // Catch: java.lang.Throwable -> L3e
        L3d:
            throw r9     // Catch: java.lang.Throwable -> L3e
        L3e:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: java.io.IOException -> L48
        L47:
            throw r8     // Catch: java.io.IOException -> L48
        L48:
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(19)
    private static java.nio.ByteBuffer mmap(java.io.File r7) {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L23
            r0.<init>(r7)     // Catch: java.io.IOException -> L23
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch: java.lang.Throwable -> L19
            long r5 = r1.size()     // Catch: java.lang.Throwable -> L19
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L19
            r3 = 0
            java.nio.MappedByteBuffer r7 = r1.map(r2, r3, r5)     // Catch: java.lang.Throwable -> L19
            r0.close()     // Catch: java.io.IOException -> L23
            return r7
        L19:
            r7 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.io.IOException -> L23
        L22:
            throw r7     // Catch: java.io.IOException -> L23
        L23:
            r7 = 0
            return r7
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(19)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static java.util.Map<android.net.Uri, java.nio.ByteBuffer> readFontInfoIntoByteBuffer(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontInfo[] r6, @androidx.annotation.Nullable android.os.CancellationSignal r7) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L27
            r3 = r6[r2]
            int r4 = r3.getResultCode()
            if (r4 == 0) goto L12
            goto L24
        L12:
            android.net.Uri r3 = r3.getUri()
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L1d
            goto L24
        L1d:
            java.nio.ByteBuffer r4 = mmap(r5, r7, r3)
            r0.put(r3, r4)
        L24:
            int r2 = r2 + 1
            goto L7
        L27:
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r0)
            return r5
    }
}
