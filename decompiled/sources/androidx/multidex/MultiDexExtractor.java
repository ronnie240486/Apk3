package androidx.multidex;

/* JADX INFO: loaded from: classes2.dex */
final class MultiDexExtractor implements java.io.Closeable {
    private static final int BUFFER_SIZE = 16384;
    private static final java.lang.String DEX_PREFIX = "classes";
    private static final java.lang.String EXTRACTED_NAME_EXT = ".classes";
    private static final java.lang.String KEY_CRC = "crc";
    private static final java.lang.String KEY_DEX_CRC = "dex.crc.";
    private static final java.lang.String KEY_DEX_NUMBER = "dex.number";
    private static final java.lang.String KEY_DEX_TIME = "dex.time.";
    private static final java.lang.String KEY_TIME_STAMP = "timestamp";
    private static final java.lang.String LOCK_FILENAME = "MultiDex.lock";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final java.lang.String PREFS_FILE = "multidex.version";
    private static final java.lang.String TAG = "MultiDex";
    private final java.nio.channels.FileLock cacheLock;
    private final java.io.File dexDir;
    private final java.nio.channels.FileChannel lockChannel;
    private final java.io.RandomAccessFile lockRaf;
    private final java.io.File sourceApk;
    private final long sourceCrc;


    /* JADX INFO: loaded from: classes.dex */
    public static class ExtractedDex extends java.io.File {
        public long crc;

        public ExtractedDex(java.io.File r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.crc = r1
                return
        }
    }

    public MultiDexExtractor(java.io.File r5, java.io.File r6) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "MultiDexExtractor("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r5.getPath()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r1 = r6.getPath()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MultiDex"
            android.util.Log.i(r1, r0)
            r4.sourceApk = r5
            r4.dexDir = r6
            long r2 = getZipCrc(r5)
            r4.sourceCrc = r2
            java.io.File r5 = new java.io.File
            java.lang.String r0 = "MultiDex.lock"
            r5.<init>(r6, r0)
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r6.<init>(r5, r0)
            r4.lockRaf = r6
            java.nio.channels.FileChannel r6 = r6.getChannel()     // Catch: java.lang.Error -> L8d java.lang.RuntimeException -> L8f java.io.IOException -> L91
            r4.lockChannel = r6     // Catch: java.lang.Error -> L8d java.lang.RuntimeException -> L8f java.io.IOException -> L91
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L82 java.lang.RuntimeException -> L84 java.io.IOException -> L86
            r0.<init>()     // Catch: java.lang.Error -> L82 java.lang.RuntimeException -> L84 java.io.IOException -> L86
            java.lang.String r2 = "Blocking on lock "
            r0.append(r2)     // Catch: java.lang.Error -> L82 java.lang.RuntimeException -> L84 java.io.IOException -> L86
            java.lang.String r2 = r5.getPath()     // Catch: java.lang.Error -> L82 java.lang.RuntimeException -> L84 java.io.IOException -> L86
            r0.append(r2)     // Catch: java.lang.Error -> L82 java.lang.RuntimeException -> L84 java.io.IOException -> L86
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Error -> L82 java.lang.RuntimeException -> L84 java.io.IOException -> L86
            android.util.Log.i(r1, r0)     // Catch: java.lang.Error -> L82 java.lang.RuntimeException -> L84 java.io.IOException -> L86
            java.nio.channels.FileLock r6 = r6.lock()     // Catch: java.lang.Error -> L82 java.lang.RuntimeException -> L84 java.io.IOException -> L86
            r4.cacheLock = r6     // Catch: java.lang.Error -> L82 java.lang.RuntimeException -> L84 java.io.IOException -> L86
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L8d java.lang.RuntimeException -> L8f java.io.IOException -> L91
            r6.<init>()     // Catch: java.lang.Error -> L8d java.lang.RuntimeException -> L8f java.io.IOException -> L91
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.Error -> L8d java.lang.RuntimeException -> L8f java.io.IOException -> L91
            r6.append(r5)     // Catch: java.lang.Error -> L8d java.lang.RuntimeException -> L8f java.io.IOException -> L91
            java.lang.String r5 = " locked"
            r6.append(r5)     // Catch: java.lang.Error -> L8d java.lang.RuntimeException -> L8f java.io.IOException -> L91
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Error -> L8d java.lang.RuntimeException -> L8f java.io.IOException -> L91
            android.util.Log.i(r1, r5)     // Catch: java.lang.Error -> L8d java.lang.RuntimeException -> L8f java.io.IOException -> L91
            return
        L82:
            r5 = move-exception
            goto L87
        L84:
            r5 = move-exception
            goto L87
        L86:
            r5 = move-exception
        L87:
            java.nio.channels.FileChannel r6 = r4.lockChannel     // Catch: java.lang.Error -> L8d java.lang.RuntimeException -> L8f java.io.IOException -> L91
            closeQuietly(r6)     // Catch: java.lang.Error -> L8d java.lang.RuntimeException -> L8f java.io.IOException -> L91
            throw r5     // Catch: java.lang.Error -> L8d java.lang.RuntimeException -> L8f java.io.IOException -> L91
        L8d:
            r5 = move-exception
            goto L92
        L8f:
            r5 = move-exception
            goto L92
        L91:
            r5 = move-exception
        L92:
            java.io.RandomAccessFile r6 = r4.lockRaf
            closeQuietly(r6)
            throw r5
    }

    private void clearDexDir() {
            r8 = this;
            java.io.File r0 = r8.dexDir
            androidx.multidex.MultiDexExtractor$1 r1 = new androidx.multidex.MultiDexExtractor$1
            r1.<init>()
            java.io.File[] r0 = r0.listFiles(r1)
            java.lang.String r1 = "MultiDex"
            if (r0 != 0) goto L2b
            java.lang.String r0 = "Failed to list secondary dex dir content ("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.io.File r2 = r8.dexDir
            java.lang.String r2 = r2.getPath()
            r0.append(r2)
            java.lang.String r2 = ")."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            return
        L2b:
            int r2 = r0.length
            r3 = 0
        L2d:
            if (r3 >= r2) goto L83
            r4 = r0[r3]
            java.lang.String r5 = "Trying to delete old file "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r6 = r4.getPath()
            r5.append(r6)
            java.lang.String r6 = " of size "
            r5.append(r6)
            long r6 = r4.length()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.i(r1, r5)
            boolean r5 = r4.delete()
            if (r5 != 0) goto L6c
            java.lang.String r5 = "Failed to delete old file "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r4 = r4.getPath()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r1, r4)
            goto L80
        L6c:
            java.lang.String r5 = "Deleted old file "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r4 = r4.getPath()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.i(r1, r4)
        L80:
            int r3 = r3 + 1
            goto L2d
        L83:
            return
    }

    private static void closeQuietly(java.io.Closeable r2) {
            r2.close()     // Catch: java.io.IOException -> L4
            goto Lc
        L4:
            r2 = move-exception
            java.lang.String r0 = "MultiDex"
            java.lang.String r1 = "Failed to close resource"
            android.util.Log.w(r0, r1, r2)
        Lc:
            return
    }

    private static void extract(java.util.zip.ZipFile r5, java.util.zip.ZipEntry r6, java.io.File r7, java.lang.String r8) throws java.io.IOException, java.io.FileNotFoundException {
            java.io.InputStream r5 = r5.getInputStream(r6)
            java.lang.String r0 = "tmp-"
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r8)
            java.io.File r0 = r7.getParentFile()
            java.lang.String r1 = ".zip"
            java.io.File r8 = java.io.File.createTempFile(r8, r1, r0)
            java.lang.String r0 = "Extracting "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r8.getPath()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MultiDex"
            android.util.Log.i(r1, r0)
            java.util.zip.ZipOutputStream r0 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> Led
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Led
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Led
            r3.<init>(r8)     // Catch: java.lang.Throwable -> Led
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Led
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Led
            java.util.zip.ZipEntry r2 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> Le8
            java.lang.String r3 = "classes.dex"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le8
            long r3 = r6.getTime()     // Catch: java.lang.Throwable -> Le8
            r2.setTime(r3)     // Catch: java.lang.Throwable -> Le8
            r0.putNextEntry(r2)     // Catch: java.lang.Throwable -> Le8
            r6 = 16384(0x4000, float:2.2959E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> Le8
            int r2 = r5.read(r6)     // Catch: java.lang.Throwable -> Le8
        L53:
            r3 = -1
            if (r2 == r3) goto L5f
            r3 = 0
            r0.write(r6, r3, r2)     // Catch: java.lang.Throwable -> Le8
            int r2 = r5.read(r6)     // Catch: java.lang.Throwable -> Le8
            goto L53
        L5f:
            r0.closeEntry()     // Catch: java.lang.Throwable -> Le8
            r0.close()     // Catch: java.lang.Throwable -> Led
            boolean r6 = r8.setReadOnly()     // Catch: java.lang.Throwable -> Led
            if (r6 == 0) goto Lbc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r6.<init>()     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = "Renaming to "
            r6.append(r0)     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = r7.getPath()     // Catch: java.lang.Throwable -> Led
            r6.append(r0)     // Catch: java.lang.Throwable -> Led
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Led
            android.util.Log.i(r1, r6)     // Catch: java.lang.Throwable -> Led
            boolean r6 = r8.renameTo(r7)     // Catch: java.lang.Throwable -> Led
            if (r6 == 0) goto L90
            closeQuietly(r5)
            r8.delete()
            return
        L90:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Led
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r0.<init>()     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = "Failed to rename \""
            r0.append(r1)     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> Led
            r0.append(r1)     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = "\" to \""
            r0.append(r1)     // Catch: java.lang.Throwable -> Led
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> Led
            r0.append(r7)     // Catch: java.lang.Throwable -> Led
            java.lang.String r7 = "\""
            r0.append(r7)     // Catch: java.lang.Throwable -> Led
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> Led
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Led
            throw r6     // Catch: java.lang.Throwable -> Led
        Lbc:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Led
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r0.<init>()     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = "Failed to mark readonly \""
            r0.append(r1)     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> Led
            r0.append(r1)     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = "\" (tmp of \""
            r0.append(r1)     // Catch: java.lang.Throwable -> Led
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> Led
            r0.append(r7)     // Catch: java.lang.Throwable -> Led
            java.lang.String r7 = "\")"
            r0.append(r7)     // Catch: java.lang.Throwable -> Led
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> Led
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Led
            throw r6     // Catch: java.lang.Throwable -> Led
        Le8:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Led
            throw r6     // Catch: java.lang.Throwable -> Led
        Led:
            r6 = move-exception
            closeQuietly(r5)
            r8.delete()
            throw r6
    }

    private static android.content.SharedPreferences getMultiDexPreferences(android.content.Context r2) {
            r0 = 4
            java.lang.String r1 = "multidex.version"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r1, r0)
            return r2
    }

    private static long getTimeStamp(java.io.File r4) {
            long r0 = r4.lastModified()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            r2 = 1
            long r0 = r0 - r2
        Ld:
            return r0
    }

    private static long getZipCrc(java.io.File r10) throws java.io.IOException {
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r10, r1)
            androidx.multidex.ZipUtil$CentralDirectory r10 = androidx.multidex.ZipUtil.findCentralDirectory(r0)     // Catch: java.lang.Throwable -> L52
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32     // Catch: java.lang.Throwable -> L52
            r1.<init>()     // Catch: java.lang.Throwable -> L52
            long r2 = r10.size     // Catch: java.lang.Throwable -> L52
            long r4 = r10.offset     // Catch: java.lang.Throwable -> L52
            r0.seek(r4)     // Catch: java.lang.Throwable -> L52
            r4 = 16384(0x4000, double:8.095E-320)
            long r6 = java.lang.Math.min(r4, r2)     // Catch: java.lang.Throwable -> L52
            int r10 = (int) r6     // Catch: java.lang.Throwable -> L52
            r6 = 16384(0x4000, float:2.2959E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L52
            r7 = 0
            int r10 = r0.read(r6, r7, r10)     // Catch: java.lang.Throwable -> L52
        L28:
            r8 = -1
            if (r10 == r8) goto L41
            r1.update(r6, r7, r10)     // Catch: java.lang.Throwable -> L52
            long r8 = (long) r10     // Catch: java.lang.Throwable -> L52
            long r2 = r2 - r8
            r8 = 0
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 != 0) goto L37
            goto L41
        L37:
            long r8 = java.lang.Math.min(r4, r2)     // Catch: java.lang.Throwable -> L52
            int r10 = (int) r8     // Catch: java.lang.Throwable -> L52
            int r10 = r0.read(r6, r7, r10)     // Catch: java.lang.Throwable -> L52
            goto L28
        L41:
            long r1 = r1.getValue()     // Catch: java.lang.Throwable -> L52
            r0.close()
            r3 = -1
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 != 0) goto L51
            r3 = 1
            long r1 = r1 - r3
        L51:
            return r1
        L52:
            r10 = move-exception
            r0.close()
            throw r10
    }

    private static boolean isModified(android.content.Context r7, java.io.File r8, long r9, java.lang.String r11) {
            android.content.SharedPreferences r7 = getMultiDexPreferences(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r1 = "timestamp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = -1
            long r3 = r7.getLong(r0, r1)
            long r5 = getTimeStamp(r8)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L40
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            java.lang.String r11 = "crc"
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            long r7 = r7.getLong(r8, r1)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L3e
            goto L40
        L3e:
            r7 = 0
            goto L41
        L40:
            r7 = 1
        L41:
            return r7
    }

    private java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> loadExistingExtractions(android.content.Context r17, java.lang.String r18) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = "MultiDex"
            java.lang.String r3 = "loading existing secondary dex files"
            android.util.Log.i(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r0.sourceApk
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ".classes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.SharedPreferences r3 = getMultiDexPreferences(r17)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "dex.number"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 1
            int r4 = r3.getInt(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4 + (-1)
            r5.<init>(r6)
            r6 = 2
        L44:
            if (r6 > r4) goto L108
            java.lang.String r7 = ".zip"
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r6, r7)
            androidx.multidex.MultiDexExtractor$ExtractedDex r8 = new androidx.multidex.MultiDexExtractor$ExtractedDex
            java.io.File r9 = r0.dexDir
            r8.<init>(r9, r7)
            boolean r7 = r8.isFile()
            if (r7 == 0) goto Lec
            long r9 = getZipCrc(r8)
            r8.crc = r9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r9 = "dex.crc."
            r7.append(r9)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            r9 = -1
            long r11 = r3.getLong(r7, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r13 = "dex.time."
            r7.append(r13)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            long r9 = r3.getLong(r7, r9)
            long r13 = r8.lastModified()
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 != 0) goto Lab
            r7 = r2
            r17 = r3
            long r2 = r8.crc
            int r15 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r15 != 0) goto Lab
            r5.add(r8)
            int r6 = r6 + 1
            r3 = r17
            r2 = r7
            goto L44
        Lab:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid extracted dex: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = " (key \""
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "\"), expected modification time: "
            r3.append(r1)
            r3.append(r9)
            java.lang.String r1 = ", modification time: "
            r3.append(r1)
            r3.append(r13)
            java.lang.String r1 = ", expected crc: "
            r3.append(r1)
            r3.append(r11)
            java.lang.String r1 = ", file crc: "
            r3.append(r1)
            long r4 = r8.crc
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        Lec:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Missing extracted secondary dex file '"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r3 = r8.getPath()
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L108:
            return r5
    }

    private java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> performExtractions() throws java.io.IOException {
            r14 = this;
            java.lang.String r0 = "Failed to close resource"
            java.lang.String r1 = "MultiDex"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r14.sourceApk
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ".classes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r14.clearDexDir()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile
            java.io.File r5 = r14.sourceApk
            r4.<init>(r5)
            r5 = 2
            java.lang.String r6 = "classes2.dex"
            java.util.zip.ZipEntry r6 = r4.getEntry(r6)     // Catch: java.lang.Throwable -> L14d
        L31:
            if (r6 == 0) goto L144
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14d
            r7.<init>()     // Catch: java.lang.Throwable -> L14d
            r7.append(r2)     // Catch: java.lang.Throwable -> L14d
            r7.append(r5)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r8 = ".zip"
            r7.append(r8)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L14d
            androidx.multidex.MultiDexExtractor$ExtractedDex r8 = new androidx.multidex.MultiDexExtractor$ExtractedDex     // Catch: java.lang.Throwable -> L14d
            java.io.File r9 = r14.dexDir     // Catch: java.lang.Throwable -> L14d
            r8.<init>(r9, r7)     // Catch: java.lang.Throwable -> L14d
            r3.add(r8)     // Catch: java.lang.Throwable -> L14d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14d
            r7.<init>()     // Catch: java.lang.Throwable -> L14d
            java.lang.String r9 = "Extraction is needed for file "
            r7.append(r9)     // Catch: java.lang.Throwable -> L14d
            r7.append(r8)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L14d
            android.util.Log.i(r1, r7)     // Catch: java.lang.Throwable -> L14d
            r7 = 0
            r9 = 0
            r10 = 0
        L68:
            r11 = 3
            if (r9 >= r11) goto Lfc
            if (r10 != 0) goto Lfc
            int r9 = r9 + 1
            extract(r4, r6, r8, r2)     // Catch: java.lang.Throwable -> L14d
            long r10 = getZipCrc(r8)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L14d
            r8.crc = r10     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L14d
            r10 = 1
            goto L94
        L7a:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14d
            r11.<init>()     // Catch: java.lang.Throwable -> L14d
            java.lang.String r12 = "Failed to read crc from "
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r12 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L14d
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L14d
            android.util.Log.w(r1, r11, r10)     // Catch: java.lang.Throwable -> L14d
            r10 = 0
        L94:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14d
            r11.<init>()     // Catch: java.lang.Throwable -> L14d
            java.lang.String r12 = "Extraction "
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            if (r10 == 0) goto La4
            java.lang.String r12 = "succeeded"
            goto La6
        La4:
            java.lang.String r12 = "failed"
        La6:
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r12 = " '"
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r12 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L14d
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r12 = "': length "
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            long r12 = r8.length()     // Catch: java.lang.Throwable -> L14d
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r12 = " - crc: "
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            long r12 = r8.crc     // Catch: java.lang.Throwable -> L14d
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L14d
            android.util.Log.i(r1, r11)     // Catch: java.lang.Throwable -> L14d
            if (r10 != 0) goto L68
            r8.delete()     // Catch: java.lang.Throwable -> L14d
            boolean r11 = r8.exists()     // Catch: java.lang.Throwable -> L14d
            if (r11 == 0) goto L68
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14d
            r11.<init>()     // Catch: java.lang.Throwable -> L14d
            java.lang.String r12 = "Failed to delete corrupted secondary dex '"
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r12 = r8.getPath()     // Catch: java.lang.Throwable -> L14d
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r12 = "'"
            r11.append(r12)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L14d
            android.util.Log.w(r1, r11)     // Catch: java.lang.Throwable -> L14d
            goto L68
        Lfc:
            if (r10 == 0) goto L11c
            int r5 = r5 + 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14d
            r6.<init>()     // Catch: java.lang.Throwable -> L14d
            java.lang.String r7 = "classes"
            r6.append(r7)     // Catch: java.lang.Throwable -> L14d
            r6.append(r5)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r7 = ".dex"
            r6.append(r7)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L14d
            java.util.zip.ZipEntry r6 = r4.getEntry(r6)     // Catch: java.lang.Throwable -> L14d
            goto L31
        L11c:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L14d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14d
            r3.<init>()     // Catch: java.lang.Throwable -> L14d
            java.lang.String r6 = "Could not create zip file "
            r3.append(r6)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r6 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L14d
            r3.append(r6)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r6 = " for secondary dex ("
            r3.append(r6)     // Catch: java.lang.Throwable -> L14d
            r3.append(r5)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r5 = ")"
            r3.append(r5)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L14d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14d
            throw r2     // Catch: java.lang.Throwable -> L14d
        L144:
            r4.close()     // Catch: java.io.IOException -> L148
            goto L14c
        L148:
            r2 = move-exception
            android.util.Log.w(r1, r0, r2)
        L14c:
            return r3
        L14d:
            r2 = move-exception
            r4.close()     // Catch: java.io.IOException -> L152
            goto L156
        L152:
            r3 = move-exception
            android.util.Log.w(r1, r0, r3)
        L156:
            throw r2
    }

    private static void putStoredApkInfo(android.content.Context r2, java.lang.String r3, long r4, long r6, java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> r8) {
            android.content.SharedPreferences r2 = getMultiDexPreferences(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "timestamp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.putLong(r0, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "crc"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r3, r5)
            r2.putLong(r4, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r5 = "dex.number"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            int r5 = r8.size()
            int r5 = r5 + 1
            r2.putInt(r4, r5)
            java.util.Iterator r4 = r8.iterator()
            r5 = 2
        L4a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r4.next()
            androidx.multidex.MultiDexExtractor$ExtractedDex r6 = (androidx.multidex.MultiDexExtractor.ExtractedDex) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r8 = "dex.crc."
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            long r0 = r6.crc
            r2.putLong(r7, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r8 = "dex.time."
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            long r0 = r6.lastModified()
            r2.putLong(r7, r0)
            int r5 = r5 + 1
            goto L4a
        L8d:
            r2.commit()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.nio.channels.FileLock r0 = r1.cacheLock
            r0.release()
            java.nio.channels.FileChannel r0 = r1.lockChannel
            r0.close()
            java.io.RandomAccessFile r0 = r1.lockRaf
            r0.close()
            return
    }

    public final java.util.List<? extends java.io.File> load(android.content.Context r10, java.lang.String r11, boolean r12) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = "MultiDexExtractor.load("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.io.File r1 = r9.sourceApk
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r12)
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MultiDex"
            android.util.Log.i(r1, r0)
            java.nio.channels.FileLock r0 = r9.cacheLock
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L97
            if (r12 != 0) goto L5d
            java.io.File r0 = r9.sourceApk
            long r2 = r9.sourceCrc
            boolean r0 = isModified(r10, r0, r2, r11)
            if (r0 != 0) goto L5d
            java.util.List r10 = r9.loadExistingExtractions(r10, r11)     // Catch: java.io.IOException -> L44
            goto L7d
        L44:
            r12 = move-exception
            java.lang.String r0 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            android.util.Log.w(r1, r0, r12)
            java.util.List r12 = r9.performExtractions()
            java.io.File r0 = r9.sourceApk
            long r4 = getTimeStamp(r0)
            long r6 = r9.sourceCrc
            r2 = r10
            r3 = r11
            r8 = r12
            putStoredApkInfo(r2, r3, r4, r6, r8)
            goto L7c
        L5d:
            if (r12 == 0) goto L65
            java.lang.String r12 = "Forced extraction must be performed."
            android.util.Log.i(r1, r12)
            goto L6a
        L65:
            java.lang.String r12 = "Detected that extraction must be performed."
            android.util.Log.i(r1, r12)
        L6a:
            java.util.List r12 = r9.performExtractions()
            java.io.File r0 = r9.sourceApk
            long r4 = getTimeStamp(r0)
            long r6 = r9.sourceCrc
            r2 = r10
            r3 = r11
            r8 = r12
            putStoredApkInfo(r2, r3, r4, r6, r8)
        L7c:
            r10 = r12
        L7d:
            java.lang.String r11 = "load found "
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            int r12 = r10.size()
            r11.append(r12)
            java.lang.String r12 = " secondary dex files"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.i(r1, r11)
            return r10
        L97:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "MultiDexExtractor was closed"
            r10.<init>(r11)
            throw r10
    }
}
