package kotlin.io;

/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a!\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001a!\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001aB\u0010\u0010\u001a\u00020\u0001*\u00020\u000226\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001aJ\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\r26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001a7\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0002H\u0087\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0017\u0010\u001f\u001a\u00020 *\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0002\u001a\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0014\u0010$\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010%\u001a\u00020&*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001aB\u0010'\u001a\u0002H(\"\u0004\b\u0000\u0010(*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*\u0012\u0004\u0012\u0002H(0\u0019H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010+\u001a\u0012\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010.\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010/\u001a\u000200*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u0082\u0002\u000f\n\u0005\b\u009920\u0001\n\u0006\b\u0011(,0\u0001¨\u00061"}, d2 = {"appendBytes", "", "Ljava/io/File;", "array", "", "appendText", "text", "", "charset", "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "bufferedWriter", "Ljava/io/BufferedWriter;", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Requires newer compiler version to be inlined correctly.", "writeBytes", "writeText", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/io/FilesKt")
class FilesKt__FileReadWriteKt extends kotlin.io.FilesKt__FilePathComponentsKt {


    public FilesKt__FileReadWriteKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void appendBytes(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            r0.write(r3)     // Catch: java.lang.Throwable -> L1a
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            return
        L1a:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            throw r3
    }

    public static final void appendText(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            appendBytes(r1, r2)
            return
    }

    public static /* synthetic */ void appendText$default(java.io.File r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            appendText(r0, r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final java.io.BufferedReader bufferedReader(java.io.File r2, java.nio.charset.Charset r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L1b
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L21
        L1b:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0, r4)
            r0 = r2
        L21:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.BufferedWriter bufferedWriter(java.io.File r2, java.nio.charset.Charset r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            boolean r2 = r0 instanceof java.io.BufferedWriter
            if (r2 == 0) goto L1b
            java.io.BufferedWriter r0 = (java.io.BufferedWriter) r0
            goto L21
        L1b:
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            r2.<init>(r0, r4)
            r0 = r2
        L21:
            return r0
    }

    public static final void forEachBlock(@org.jetbrains.annotations.NotNull java.io.File r1, int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.Unit> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 512(0x200, float:7.17E-43)
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast(r2, r0)
            byte[] r2 = new byte[r2]
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
        L17:
            int r1 = r0.read(r2)     // Catch: java.lang.Throwable -> L2c
            if (r1 > 0) goto L24
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2c
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return
        L24:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2c
            r3.invoke(r2, r1)     // Catch: java.lang.Throwable -> L2c
            goto L17
        L2c:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L2e
        L2e:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
    }

    public static final void forEachBlock(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4096(0x1000, float:5.74E-42)
            forEachBlock(r1, r0, r2)
            return
    }

    public static final void forEachLine(@org.jetbrains.annotations.NotNull java.io.File r3, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            r1.<init>(r2, r4)
            r0.<init>(r1)
            kotlin.io.TextStreamsKt.forEachLine(r0, r5)
            return
    }

    public static /* synthetic */ void forEachLine$default(java.io.File r0, java.nio.charset.Charset r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            forEachLine(r0, r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final java.io.FileInputStream inputStream(java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.FileOutputStream outputStream(java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.PrintWriter printWriter(java.io.File r3, java.nio.charset.Charset r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.PrintWriter r0 = new java.io.PrintWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r3)
            r1.<init>(r2, r4)
            boolean r3 = r1 instanceof java.io.BufferedWriter
            if (r3 == 0) goto L1d
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1
            goto L25
        L1d:
            java.io.BufferedWriter r3 = new java.io.BufferedWriter
            r4 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r1, r4)
            r1 = r3
        L25:
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] readBytes(@org.jetbrains.annotations.NotNull java.io.File r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            long r1 = r10.length()     // Catch: java.lang.Throwable -> La5
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.String r5 = "File "
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L83
            int r2 = (int) r1
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> La5
            r3 = 0
            r4 = r2
            r6 = 0
        L1d:
            if (r4 <= 0) goto L28
            int r7 = r0.read(r1, r6, r4)     // Catch: java.lang.Throwable -> La5
            if (r7 < 0) goto L28
            int r4 = r4 - r7
            int r6 = r6 + r7
            goto L1d
        L28:
            java.lang.String r7 = "copyOf(this, newSize)"
            r8 = 0
            if (r4 <= 0) goto L35
            byte[] r1 = java.util.Arrays.copyOf(r1, r6)     // Catch: java.lang.Throwable -> La5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)     // Catch: java.lang.Throwable -> La5
            goto L65
        L35:
            int r4 = r0.read()     // Catch: java.lang.Throwable -> La5
            r6 = -1
            if (r4 != r6) goto L3d
            goto L65
        L3d:
            kotlin.io.ExposingBufferByteArrayOutputStream r6 = new kotlin.io.ExposingBufferByteArrayOutputStream     // Catch: java.lang.Throwable -> La5
            r9 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r9)     // Catch: java.lang.Throwable -> La5
            r6.write(r4)     // Catch: java.lang.Throwable -> La5
            r4 = 2
            kotlin.io.ByteStreamsKt.copyTo$default(r0, r6, r3, r4, r8)     // Catch: java.lang.Throwable -> La5
            int r4 = r6.size()     // Catch: java.lang.Throwable -> La5
            int r4 = r4 + r2
            if (r4 < 0) goto L69
            byte[] r10 = r6.getBuffer()     // Catch: java.lang.Throwable -> La5
            byte[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch: java.lang.Throwable -> La5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)     // Catch: java.lang.Throwable -> La5
            int r4 = r6.size()     // Catch: java.lang.Throwable -> La5
            byte[] r1 = kotlin.collections.ArraysKt.copyInto(r10, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> La5
        L65:
            kotlin.io.CloseableKt.closeFinally(r0, r8)
            return r1
        L69:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
            r2.<init>()     // Catch: java.lang.Throwable -> La5
            r2.append(r5)     // Catch: java.lang.Throwable -> La5
            r2.append(r10)     // Catch: java.lang.Throwable -> La5
            java.lang.String r10 = " is too big to fit in memory."
            r2.append(r10)     // Catch: java.lang.Throwable -> La5
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> La5
            r1.<init>(r10)     // Catch: java.lang.Throwable -> La5
            throw r1     // Catch: java.lang.Throwable -> La5
        L83:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
            r4.<init>()     // Catch: java.lang.Throwable -> La5
            r4.append(r5)     // Catch: java.lang.Throwable -> La5
            r4.append(r10)     // Catch: java.lang.Throwable -> La5
            java.lang.String r10 = " is too big ("
            r4.append(r10)     // Catch: java.lang.Throwable -> La5
            r4.append(r1)     // Catch: java.lang.Throwable -> La5
            java.lang.String r10 = " bytes) to fit in memory."
            r4.append(r10)     // Catch: java.lang.Throwable -> La5
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> La5
            r3.<init>(r10)     // Catch: java.lang.Throwable -> La5
            throw r3     // Catch: java.lang.Throwable -> La5
        La5:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> La7
        La7:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r10)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> readLines(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.io.FilesKt__FileReadWriteKt$readLines$1 r1 = new kotlin.io.FilesKt__FileReadWriteKt$readLines$1
            r1.<init>(r0)
            forEachLine(r2, r3, r1)
            return r0
    }

    public static /* synthetic */ java.util.List readLines$default(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.util.List r0 = readLines(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String readText(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = kotlin.io.TextStreamsKt.readText(r0)     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            return r2
        L1d:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            throw r3
    }

    public static /* synthetic */ java.lang.String readText$default(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r0 = readText(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.InputStreamReader reader(java.io.File r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }

    public static final <T> T useLines(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L20
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L28
        L20:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r3 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r0, r3)
            r0 = r2
        L28:
            r2 = 0
            r3 = 1
            kotlin.sequences.Sequence r1 = kotlin.io.TextStreamsKt.lineSequence(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r4 = r4.invoke(r1)     // Catch: java.lang.Throwable -> L3c
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r4
        L3c:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L3e
        L3e:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r4
    }

    public static /* synthetic */ java.lang.Object useLines$default(java.io.File r2, java.nio.charset.Charset r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L6
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
        L6:
            r5 = 8192(0x2000, float:1.148E-41)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L19
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L1f
        L19:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0, r5)
            r0 = r2
        L1f:
            r2 = 0
            kotlin.sequences.Sequence r3 = kotlin.io.TextStreamsKt.lineSequence(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L32
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            return r3
        L32:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L34
        L34:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            throw r3
    }

    public static final void writeBytes(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch: java.lang.Throwable -> L19
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L19
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return
        L19:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1b
        L1b:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
    }

    public static final void writeText(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            writeBytes(r1, r2)
            return
    }

    public static /* synthetic */ void writeText$default(java.io.File r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            writeText(r0, r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final java.io.OutputStreamWriter writer(java.io.File r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }
}
