package com.getkeepsafe.relinker;

/* JADX INFO: loaded from: classes2.dex */
public class ApkLibraryInstaller implements com.getkeepsafe.relinker.ReLinker.LibraryInstaller {
    private static final int COPY_BUFFER_SIZE = 4096;
    private static final int MAX_TRIES = 5;

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

    private com.getkeepsafe.relinker.ApkLibraryInstaller.ZipFileInZipEntry findAPKWithLibrary(android.content.Context r17, java.lang.String[] r18, java.lang.String r19, com.getkeepsafe.relinker.ReLinkerInstance r20) {
            r16 = this;
            r0 = r18
            java.lang.String[] r1 = r16.sourceDirectories(r17)
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L9:
            r5 = 0
            if (r4 >= r2) goto L81
            r6 = r1[r4]
            r7 = 0
        Lf:
            int r8 = r7 + 1
            r9 = 5
            r10 = 1
            if (r7 >= r9) goto L23
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L21
            java.io.File r11 = new java.io.File     // Catch: java.io.IOException -> L21
            r11.<init>(r6)     // Catch: java.io.IOException -> L21
            r7.<init>(r11, r10)     // Catch: java.io.IOException -> L21
            r5 = r7
            goto L23
        L21:
            r7 = r8
            goto Lf
        L23:
            if (r5 != 0) goto L2a
            r12 = r19
            r15 = r20
            goto L7d
        L2a:
            r7 = 0
        L2b:
            int r8 = r7 + 1
            if (r7 >= r9) goto L76
            int r7 = r0.length
            r11 = 0
        L31:
            if (r11 >= r7) goto L6f
            r12 = r0[r11]
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
            r14[r3] = r13
            r14[r10] = r6
            java.lang.String r3 = "Looking for %s in APK %s..."
            r15 = r20
            r15.log(r3, r14)
            java.util.zip.ZipEntry r3 = r5.getEntry(r13)
            if (r3 == 0) goto L6b
            com.getkeepsafe.relinker.ApkLibraryInstaller$ZipFileInZipEntry r0 = new com.getkeepsafe.relinker.ApkLibraryInstaller$ZipFileInZipEntry
            r0.<init>(r5, r3)
            return r0
        L6b:
            int r11 = r11 + 1
            r3 = 0
            goto L31
        L6f:
            r12 = r19
            r15 = r20
            r3 = 0
            r7 = r8
            goto L2b
        L76:
            r12 = r19
            r15 = r20
            r5.close()     // Catch: java.io.IOException -> L7d
        L7d:
            int r4 = r4 + 1
            r3 = 0
            goto L9
        L81:
            return r5
    }

    private java.lang.String[] getSupportedABIs(android.content.Context r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = "lib"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            char r1 = java.io.File.separatorChar
            r0.append(r1)
            java.lang.String r1 = "([^\\"
            r0.append(r1)
            char r1 = java.io.File.separatorChar
            r0.append(r1)
            java.lang.String r1 = "]*)"
            r0.append(r1)
            char r1 = java.io.File.separatorChar
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String[] r8 = r7.sourceDirectories(r8)
            int r1 = r8.length
            r2 = 0
        L35:
            if (r2 >= r1) goto L6d
            r3 = r8[r2]
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L6a
            java.io.File r5 = new java.io.File     // Catch: java.io.IOException -> L6a
            r5.<init>(r3)     // Catch: java.io.IOException -> L6a
            r3 = 1
            r4.<init>(r5, r3)     // Catch: java.io.IOException -> L6a
            java.util.Enumeration r4 = r4.entries()
        L48:
            boolean r5 = r4.hasMoreElements()
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r4.nextElement()
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5
            java.lang.String r5 = r5.getName()
            java.util.regex.Matcher r5 = r9.matcher(r5)
            boolean r6 = r5.matches()
            if (r6 == 0) goto L48
            java.lang.String r5 = r5.group(r3)
            r0.add(r5)
            goto L48
        L6a:
            int r2 = r2 + 1
            goto L35
        L6d:
            int r8 = r0.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
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

    @Override // com.getkeepsafe.relinker.ReLinker.LibraryInstaller
    public void installLibrary(android.content.Context r11, java.lang.String[] r12, java.lang.String r13, java.io.File r14, com.getkeepsafe.relinker.ReLinkerInstance r15) {
            r10 = this;
            r0 = 0
            com.getkeepsafe.relinker.ApkLibraryInstaller$ZipFileInZipEntry r1 = r10.findAPKWithLibrary(r11, r12, r13, r15)     // Catch: java.lang.Throwable -> Laa
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L92
            r11 = 0
        La:
            int r12 = r11 + 1
            r4 = 5
            if (r11 >= r4) goto L85
            java.lang.String r11 = "Found %s! Extracting..."
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L97
            r4[r2] = r13     // Catch: java.lang.Throwable -> L97
            r15.log(r11, r4)     // Catch: java.lang.Throwable -> L97
            boolean r11 = r14.exists()     // Catch: java.io.IOException -> L83 java.lang.Throwable -> L97
            if (r11 != 0) goto L26
            boolean r11 = r14.createNewFile()     // Catch: java.io.IOException -> L83 java.lang.Throwable -> L97
            if (r11 != 0) goto L26
            goto L83
        L26:
            java.util.zip.ZipFile r11 = r1.zipFile     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L77 java.io.FileNotFoundException -> L7d
            java.util.zip.ZipEntry r4 = r1.zipEntry     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L77 java.io.FileNotFoundException -> L7d
            java.io.InputStream r11 = r11.getInputStream(r4)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L77 java.io.FileNotFoundException -> L7d
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L6a java.io.FileNotFoundException -> L6c
            r4.<init>(r14)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L6a java.io.FileNotFoundException -> L6c
            long r5 = r10.copy(r11, r4)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L79 java.io.FileNotFoundException -> L7f
            java.io.FileDescriptor r7 = r4.getFD()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L79 java.io.FileNotFoundException -> L7f
            r7.sync()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L79 java.io.FileNotFoundException -> L7f
            long r7 = r14.length()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L79 java.io.FileNotFoundException -> L7f
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L4d
            r10.closeSilently(r11)     // Catch: java.lang.Throwable -> L97
        L49:
            r10.closeSilently(r4)     // Catch: java.lang.Throwable -> L97
            goto L83
        L4d:
            r10.closeSilently(r11)     // Catch: java.lang.Throwable -> L97
            r10.closeSilently(r4)     // Catch: java.lang.Throwable -> L97
            r14.setReadable(r3, r2)     // Catch: java.lang.Throwable -> L97
            r14.setExecutable(r3, r2)     // Catch: java.lang.Throwable -> L97
            r14.setWritable(r3)     // Catch: java.lang.Throwable -> L97
            java.util.zip.ZipFile r11 = r1.zipFile     // Catch: java.io.IOException -> L63
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
            r0 = r11
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
            r10.closeSilently(r0)     // Catch: java.lang.Throwable -> L97
            r10.closeSilently(r4)     // Catch: java.lang.Throwable -> L97
            throw r12     // Catch: java.lang.Throwable -> L97
        L77:
            r11 = r0
            r4 = r11
        L79:
            r10.closeSilently(r11)     // Catch: java.lang.Throwable -> L97
            goto L49
        L7d:
            r11 = r0
            r4 = r11
        L7f:
            r10.closeSilently(r11)     // Catch: java.lang.Throwable -> L97
            goto L49
        L83:
            r11 = r12
            goto La
        L85:
            java.lang.String r11 = "FATAL! Couldn't extract the library from the APK!"
            r15.log(r11)     // Catch: java.lang.Throwable -> L97
            java.util.zip.ZipFile r11 = r1.zipFile     // Catch: java.io.IOException -> L91
            if (r11 == 0) goto L91
            r11.close()     // Catch: java.io.IOException -> L91
        L91:
            return
        L92:
            java.lang.String[] r11 = r10.getSupportedABIs(r11, r13)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9a
            goto La4
        L97:
            r11 = move-exception
            r0 = r1
            goto Lab
        L9a:
            r11 = move-exception
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L97
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L97
            r14[r2] = r11     // Catch: java.lang.Throwable -> L97
            r11 = r14
        La4:
            com.getkeepsafe.relinker.MissingLibraryException r14 = new com.getkeepsafe.relinker.MissingLibraryException     // Catch: java.lang.Throwable -> L97
            r14.<init>(r13, r12, r11)     // Catch: java.lang.Throwable -> L97
            throw r14     // Catch: java.lang.Throwable -> L97
        Laa:
            r11 = move-exception
        Lab:
            if (r0 == 0) goto Lb4
            java.util.zip.ZipFile r12 = r0.zipFile     // Catch: java.io.IOException -> Lb4
            if (r12 == 0) goto Lb4
            r12.close()     // Catch: java.io.IOException -> Lb4
        Lb4:
            throw r11
    }
}
