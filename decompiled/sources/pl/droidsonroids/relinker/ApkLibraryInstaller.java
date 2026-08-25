package pl.droidsonroids.relinker;

/* JADX INFO: loaded from: classes3.dex */
public class ApkLibraryInstaller implements pl.droidsonroids.relinker.ReLinker.LibraryInstaller {
    private static final int COPY_BUFFER_SIZE = 4096;
    private static final int MAX_TRIES = 5;

    /* JADX INFO: loaded from: classes2.dex */
    public static class ZipFileInZipEntry {
        public java.util.zip.ZipEntry zipEntry;
        public java.util.zip.ZipFile zipFile;

        public ZipFileInZipEntry(java.util.zip.ZipFile r1, java.util.zip.ZipEntry r2) {
                r0 = this;
                r0.<init>()
                r0.zipFile = r1
                r0.zipEntry = r2
                return
        }
    }

    public ApkLibraryInstaller() {
            r0 = this;
            r0.<init>()
            return
    }

    private void closeSilently(java.io.Closeable r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    private long copy(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
            r5 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
        L6:
            int r3 = r6.read(r0)
            r4 = -1
            if (r3 != r4) goto L11
            r7.flush()
            return r1
        L11:
            r4 = 0
            r7.write(r0, r4, r3)
            long r3 = (long) r3
            long r1 = r1 + r3
            goto L6
    }

    private pl.droidsonroids.relinker.ApkLibraryInstaller.ZipFileInZipEntry findAPKWithLibrary(android.content.Context r17, java.lang.String[] r18, java.lang.String r19, pl.droidsonroids.relinker.ReLinkerInstance r20) {
            r16 = this;
            r0 = r18
            java.lang.String[] r1 = r16.sourceDirectories(r17)
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r3
        Lb:
            if (r5 >= r2) goto L82
            r7 = r1[r5]
            r8 = 0
        L10:
            int r9 = r8 + 1
            r10 = 5
            r11 = 1
            if (r8 >= r10) goto L24
            java.util.zip.ZipFile r8 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L22
            java.io.File r12 = new java.io.File     // Catch: java.io.IOException -> L22
            r12.<init>(r7)     // Catch: java.io.IOException -> L22
            r8.<init>(r12, r11)     // Catch: java.io.IOException -> L22
            r6 = r8
            goto L24
        L22:
            r8 = r9
            goto L10
        L24:
            if (r6 != 0) goto L2b
            r12 = r19
            r15 = r20
            goto L7e
        L2b:
            r8 = 0
        L2c:
            int r9 = r8 + 1
            if (r8 >= r10) goto L77
            int r8 = r0.length
            r10 = 0
        L32:
            if (r10 >= r8) goto L70
            r12 = r0[r10]
            java.lang.String r13 = "lib"
            java.lang.StringBuilder r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13)
            char r14 = java.io.File.separatorChar
            r13.append(r14)
            r13.append(r12)
            char r12 = java.io.File.separatorChar
            r13.append(r12)
            r12 = r19
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r4] = r13
            r14[r11] = r7
            java.lang.String r4 = "Looking for %s in APK %s..."
            r15 = r20
            r15.log(r4, r14)
            java.util.zip.ZipEntry r4 = r6.getEntry(r13)
            if (r4 == 0) goto L6c
            pl.droidsonroids.relinker.ApkLibraryInstaller$ZipFileInZipEntry r0 = new pl.droidsonroids.relinker.ApkLibraryInstaller$ZipFileInZipEntry
            r0.<init>(r6, r4)
            return r0
        L6c:
            int r10 = r10 + 1
            r4 = 0
            goto L32
        L70:
            r12 = r19
            r15 = r20
            r10 = 5
            r8 = r9
            goto L2c
        L77:
            r12 = r19
            r15 = r20
            r6.close()     // Catch: java.io.IOException -> L7e
        L7e:
            int r5 = r5 + 1
            r4 = 0
            goto Lb
        L82:
            return r3
    }

    private java.lang.String[] sourceDirectories(android.content.Context r5) {
            r4 = this;
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            java.lang.String[] r0 = r5.splitSourceDirs
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1a
            int r3 = r0.length
            if (r3 == 0) goto L1a
            int r3 = r0.length
            int r3 = r3 + r2
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r5 = r5.sourceDir
            r3[r1] = r5
            int r5 = r0.length
            java.lang.System.arraycopy(r0, r1, r3, r2, r5)
            return r3
        L1a:
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r5 = r5.sourceDir
            r0[r1] = r5
            return r0
    }

    @Override // pl.droidsonroids.relinker.ReLinker.LibraryInstaller
    public void installLibrary(android.content.Context r11, java.lang.String[] r12, java.lang.String r13, java.io.File r14, pl.droidsonroids.relinker.ReLinkerInstance r15) {
            r10 = this;
            r0 = 0
            pl.droidsonroids.relinker.ApkLibraryInstaller$ZipFileInZipEntry r11 = r10.findAPKWithLibrary(r11, r12, r13, r15)     // Catch: java.lang.Throwable -> L9b
            if (r11 == 0) goto L92
            r12 = 0
            r1 = 0
        L9:
            int r2 = r1 + 1
            r3 = 5
            if (r1 >= r3) goto L85
            java.lang.String r1 = "Found %s! Extracting..."
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L98
            r4[r12] = r13     // Catch: java.lang.Throwable -> L98
            r15.log(r1, r4)     // Catch: java.lang.Throwable -> L98
            boolean r1 = r14.exists()     // Catch: java.io.IOException -> L83 java.lang.Throwable -> L98
            if (r1 != 0) goto L26
            boolean r1 = r14.createNewFile()     // Catch: java.io.IOException -> L83 java.lang.Throwable -> L98
            if (r1 != 0) goto L26
            goto L83
        L26:
            java.util.zip.ZipFile r1 = r11.zipFile     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L77 java.io.FileNotFoundException -> L7d
            java.util.zip.ZipEntry r4 = r11.zipEntry     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L77 java.io.FileNotFoundException -> L7d
            java.io.InputStream r1 = r1.getInputStream(r4)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L77 java.io.FileNotFoundException -> L7d
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L6a java.io.FileNotFoundException -> L6c
            r4.<init>(r14)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L6a java.io.FileNotFoundException -> L6c
            long r5 = r10.copy(r1, r4)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L79 java.io.FileNotFoundException -> L7f
            java.io.FileDescriptor r7 = r4.getFD()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L79 java.io.FileNotFoundException -> L7f
            r7.sync()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L79 java.io.FileNotFoundException -> L7f
            long r7 = r14.length()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L79 java.io.FileNotFoundException -> L7f
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L4d
            r10.closeSilently(r1)     // Catch: java.lang.Throwable -> L98
        L49:
            r10.closeSilently(r4)     // Catch: java.lang.Throwable -> L98
            goto L83
        L4d:
            r10.closeSilently(r1)     // Catch: java.lang.Throwable -> L98
            r10.closeSilently(r4)     // Catch: java.lang.Throwable -> L98
            r14.setReadable(r3, r12)     // Catch: java.lang.Throwable -> L98
            r14.setExecutable(r3, r12)     // Catch: java.lang.Throwable -> L98
            r14.setWritable(r3)     // Catch: java.lang.Throwable -> L98
            java.util.zip.ZipFile r11 = r11.zipFile     // Catch: java.io.IOException -> L63
            if (r11 == 0) goto L63
            r11.close()     // Catch: java.io.IOException -> L63
        L63:
            return
        L64:
            r12 = move-exception
            goto L68
        L66:
            r12 = move-exception
            r4 = r0
        L68:
            r0 = r1
            goto L70
        L6a:
            r4 = r0
            goto L79
        L6c:
            r4 = r0
            goto L7f
        L6e:
            r12 = move-exception
            r4 = r0
        L70:
            r10.closeSilently(r0)     // Catch: java.lang.Throwable -> L98
            r10.closeSilently(r4)     // Catch: java.lang.Throwable -> L98
            throw r12     // Catch: java.lang.Throwable -> L98
        L77:
            r1 = r0
            r4 = r1
        L79:
            r10.closeSilently(r1)     // Catch: java.lang.Throwable -> L98
            goto L49
        L7d:
            r1 = r0
            r4 = r1
        L7f:
            r10.closeSilently(r1)     // Catch: java.lang.Throwable -> L98
            goto L49
        L83:
            r1 = r2
            goto L9
        L85:
            java.lang.String r12 = "FATAL! Couldn't extract the library from the APK!"
            r15.log(r12)     // Catch: java.lang.Throwable -> L98
            java.util.zip.ZipFile r11 = r11.zipFile     // Catch: java.io.IOException -> L91
            if (r11 == 0) goto L91
            r11.close()     // Catch: java.io.IOException -> L91
        L91:
            return
        L92:
            pl.droidsonroids.relinker.MissingLibraryException r12 = new pl.droidsonroids.relinker.MissingLibraryException     // Catch: java.lang.Throwable -> L98
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L98
            throw r12     // Catch: java.lang.Throwable -> L98
        L98:
            r12 = move-exception
            r0 = r11
            goto L9c
        L9b:
            r12 = move-exception
        L9c:
            if (r0 == 0) goto La5
            java.util.zip.ZipFile r11 = r0.zipFile     // Catch: java.io.IOException -> La5
            if (r11 == 0) goto La5
            r11.close()     // Catch: java.io.IOException -> La5
        La5:
            throw r12
    }
}
