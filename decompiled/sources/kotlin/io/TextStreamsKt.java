package kotlin.io;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\u0087\b\u001a8\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001e\u0082\u0002\u000f\n\u0005\b\u009920\u0001\n\u0006\b\u0011(\u001f0\u0001¨\u0006 "}, d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", "charset", "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Requires newer compiler version to be inlined correctly.", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmName(name = "TextStreamsKt")
public final class TextStreamsKt {


    @kotlin.internal.InlineOnly
    private static final java.io.BufferedReader buffered(java.io.Reader r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedReader
            if (r0 == 0) goto Lc
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            goto L12
        Lc:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r1, r2)
            r1 = r0
        L12:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.io.BufferedWriter buffered(java.io.Writer r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedWriter
            if (r0 == 0) goto Lc
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1
            goto L12
        Lc:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r0.<init>(r1, r2)
            r1 = r0
        L12:
            return r1
    }

    public static final long copyTo(@org.jetbrains.annotations.NotNull java.io.Reader r5, @org.jetbrains.annotations.NotNull java.io.Writer r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            char[] r7 = new char[r7]
            int r0 = r5.read(r7)
            r1 = 0
        L12:
            if (r0 < 0) goto L1f
            r3 = 0
            r6.write(r7, r3, r0)
            long r3 = (long) r0
            long r1 = r1 + r3
            int r0 = r5.read(r7)
            goto L12
        L1f:
            return r1
    }

    public static /* synthetic */ long copyTo$default(java.io.Reader r0, java.io.Writer r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 8192(0x2000, float:1.148E-41)
        L6:
            long r0 = copyTo(r0, r1, r2)
            return r0
    }

    public static final void forEachLine(@org.jetbrains.annotations.NotNull java.io.Reader r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L11
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L19
        L11:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L19:
            r0 = 0
            kotlin.sequences.Sequence r1 = lineSequence(r3)     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L36
        L22:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L36
            r4.invoke(r2)     // Catch: java.lang.Throwable -> L36
            goto L22
        L30:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L36
            kotlin.io.CloseableKt.closeFinally(r3, r0)
            return
        L36:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r3, r4)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<java.lang.String> lineSequence(@org.jetbrains.annotations.NotNull java.io.BufferedReader r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.io.LinesSequence r0 = new kotlin.io.LinesSequence
            r0.<init>(r1)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.constrainOnce(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] readBytes(@org.jetbrains.annotations.NotNull java.net.URL r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.InputStream r2 = r2.openStream()
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch: java.lang.Throwable -> L17
            byte[] r0 = kotlin.io.ByteStreamsKt.readBytes(r2)     // Catch: java.lang.Throwable -> L17
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r1)
            return r0
        L17:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L19
        L19:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> readLines(@org.jetbrains.annotations.NotNull java.io.Reader r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.io.TextStreamsKt$readLines$1 r1 = new kotlin.io.TextStreamsKt$readLines$1
            r1.<init>(r0)
            forEachLine(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String readText(@org.jetbrains.annotations.NotNull java.io.Reader r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1 = 0
            r2 = 2
            r3 = 0
            copyTo$default(r4, r0, r1, r2, r3)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "buffer.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String readText(java.net.URL r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r1 = readBytes(r1)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.StringReader reader(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r1)
            return r0
    }

    public static final <T> T useLines(@org.jetbrains.annotations.NotNull java.io.Reader r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L11
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L19
        L11:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L19:
            r0 = 0
            r1 = 1
            kotlin.sequences.Sequence r2 = lineSequence(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = r4.invoke(r2)     // Catch: java.lang.Throwable -> L2d
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlin.io.CloseableKt.closeFinally(r3, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r4
        L2d:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlin.io.CloseableKt.closeFinally(r3, r4)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r0
    }
}
