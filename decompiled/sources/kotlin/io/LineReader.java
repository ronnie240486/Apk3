package kotlin.io;

/* JADX INFO: compiled from: Console.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlin/io/LineReader;", "", "()V", "BUFFER_SIZE", "", "byteBuf", "Ljava/nio/ByteBuffer;", "bytes", "", "charBuf", "Ljava/nio/CharBuffer;", "chars", "", "decoder", "Ljava/nio/charset/CharsetDecoder;", "directEOL", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "compactBytes", "decode", "endOfInput", "decodeEndOfInput", "nBytes", "nChars", "readLine", "", "inputStream", "Ljava/io/InputStream;", "charset", "Ljava/nio/charset/Charset;", "resetAll", "", "trimStringBuilder", "updateCharset", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LineReader {
    private static final int BUFFER_SIZE = 32;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.LineReader INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.nio.ByteBuffer byteBuf = null;

    @org.jetbrains.annotations.NotNull
    private static final byte[] bytes = null;

    @org.jetbrains.annotations.NotNull
    private static final java.nio.CharBuffer charBuf = null;

    @org.jetbrains.annotations.NotNull
    private static final char[] chars = null;
    private static java.nio.charset.CharsetDecoder decoder;
    private static boolean directEOL;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.StringBuilder sb = null;

    static {
            kotlin.io.LineReader r0 = new kotlin.io.LineReader
            r0.<init>()
            kotlin.io.LineReader.INSTANCE = r0
            r0 = 32
            byte[] r1 = new byte[r0]
            kotlin.io.LineReader.bytes = r1
            char[] r0 = new char[r0]
            kotlin.io.LineReader.chars = r0
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.lang.String r2 = "wrap(bytes)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            kotlin.io.LineReader.byteBuf = r1
            java.nio.CharBuffer r0 = java.nio.CharBuffer.wrap(r0)
            java.lang.String r1 = "wrap(chars)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.io.LineReader.charBuf = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.io.LineReader.sb = r0
            return
    }

    private LineReader() {
            r0 = this;
            r0.<init>()
            return
    }

    private final int compactBytes() {
            r3 = this;
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf
            r0.compact()
            int r1 = r0.position()
            r2 = 0
            r0.position(r2)
            return r1
    }

    private final int decode(boolean r6) {
            r5 = this;
        L0:
            java.nio.charset.CharsetDecoder r0 = kotlin.io.LineReader.decoder
            if (r0 != 0) goto La
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
        La:
            java.nio.ByteBuffer r1 = kotlin.io.LineReader.byteBuf
            java.nio.CharBuffer r2 = kotlin.io.LineReader.charBuf
            java.nio.charset.CoderResult r0 = r0.decode(r1, r2, r6)
            java.lang.String r1 = "decoder.decode(byteBuf, charBuf, endOfInput)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r1 = r0.isError()
            if (r1 == 0) goto L23
            r5.resetAll()
            r0.throwException()
        L23:
            int r1 = r2.position()
            boolean r0 = r0.isOverflow()
            if (r0 != 0) goto L2e
            return r1
        L2e:
            java.lang.StringBuilder r0 = kotlin.io.LineReader.sb
            char[] r3 = kotlin.io.LineReader.chars
            int r1 = r1 + (-1)
            r4 = 0
            r0.append(r3, r4, r1)
            r2.position(r4)
            r0 = 32
            r2.limit(r0)
            char r0 = r3[r1]
            r2.put(r0)
            goto L0
    }

    private final int decodeEndOfInput(int r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf
            r0.limit(r2)
            java.nio.CharBuffer r2 = kotlin.io.LineReader.charBuf
            r2.position(r3)
            r2 = 1
            int r2 = r1.decode(r2)
            java.nio.charset.CharsetDecoder r3 = kotlin.io.LineReader.decoder
            if (r3 != 0) goto L19
            java.lang.String r3 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r3 = 0
        L19:
            r3.reset()
            r3 = 0
            r0.position(r3)
            return r2
    }

    private final void resetAll() {
            r2 = this;
            java.nio.charset.CharsetDecoder r0 = kotlin.io.LineReader.decoder
            if (r0 != 0) goto La
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
        La:
            r0.reset()
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf
            r1 = 0
            r0.position(r1)
            java.lang.StringBuilder r0 = kotlin.io.LineReader.sb
            r0.setLength(r1)
            return
    }

    private final void trimStringBuilder() {
            r2 = this;
            java.lang.StringBuilder r0 = kotlin.io.LineReader.sb
            r1 = 32
            r0.setLength(r1)
            r0.trimToSize()
            return
    }

    private final void updateCharset(java.nio.charset.Charset r5) {
            r4 = this;
            java.nio.charset.CharsetDecoder r5 = r5.newDecoder()
            java.lang.String r0 = "charset.newDecoder()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            kotlin.io.LineReader.decoder = r5
            java.nio.ByteBuffer r5 = kotlin.io.LineReader.byteBuf
            r5.clear()
            java.nio.CharBuffer r0 = kotlin.io.LineReader.charBuf
            r0.clear()
            r1 = 10
            byte r2 = (byte) r1
            r5.put(r2)
            r5.flip()
            java.nio.charset.CharsetDecoder r2 = kotlin.io.LineReader.decoder
            if (r2 != 0) goto L28
            java.lang.String r2 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r2 = 0
        L28:
            r3 = 0
            r2.decode(r5, r0, r3)
            int r5 = r0.position()
            r2 = 1
            if (r5 != r2) goto L3a
            char r5 = r0.get(r3)
            if (r5 != r1) goto L3a
            r3 = 1
        L3a:
            kotlin.io.LineReader.directEOL = r3
            r4.resetAll()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final synchronized java.lang.String readLine(@org.jetbrains.annotations.NotNull java.io.InputStream r11, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r12) {
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)     // Catch: java.lang.Throwable -> Lca
            java.nio.charset.CharsetDecoder r0 = kotlin.io.LineReader.decoder     // Catch: java.lang.Throwable -> Lca
            r1 = 0
            if (r0 == 0) goto L22
            if (r0 != 0) goto L18
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch: java.lang.Throwable -> Lca
            r0 = r1
        L18:
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> Lca
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r12)     // Catch: java.lang.Throwable -> Lca
            if (r0 != 0) goto L25
        L22:
            r10.updateCharset(r12)     // Catch: java.lang.Throwable -> Lca
        L25:
            r12 = 0
            r0 = 0
            r2 = 0
        L28:
            int r3 = r11.read()     // Catch: java.lang.Throwable -> Lca
            r4 = 32
            r5 = 10
            r6 = -1
            r7 = 1
            if (r3 != r6) goto L4c
            java.lang.StringBuilder r11 = kotlin.io.LineReader.sb     // Catch: java.lang.Throwable -> Lca
            int r11 = r11.length()     // Catch: java.lang.Throwable -> Lca
            if (r11 != 0) goto L3e
            r11 = 1
            goto L3f
        L3e:
            r11 = 0
        L3f:
            if (r11 == 0) goto L47
            if (r0 != 0) goto L47
            if (r2 != 0) goto L47
            monitor-exit(r10)
            return r1
        L47:
            int r11 = r10.decodeEndOfInput(r0, r2)     // Catch: java.lang.Throwable -> Lca
            goto L7a
        L4c:
            byte[] r6 = kotlin.io.LineReader.bytes     // Catch: java.lang.Throwable -> Lca
            int r8 = r0 + 1
            byte r9 = (byte) r3     // Catch: java.lang.Throwable -> Lca
            r6[r0] = r9     // Catch: java.lang.Throwable -> Lca
            if (r3 == r5) goto L5e
            if (r8 == r4) goto L5e
            boolean r0 = kotlin.io.LineReader.directEOL     // Catch: java.lang.Throwable -> Lca
            if (r0 != 0) goto L5c
            goto L5e
        L5c:
            r0 = r8
            goto L28
        L5e:
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf     // Catch: java.lang.Throwable -> Lca
            r0.limit(r8)     // Catch: java.lang.Throwable -> Lca
            java.nio.CharBuffer r3 = kotlin.io.LineReader.charBuf     // Catch: java.lang.Throwable -> Lca
            r3.position(r2)     // Catch: java.lang.Throwable -> Lca
            int r2 = r10.decode(r12)     // Catch: java.lang.Throwable -> Lca
            if (r2 <= 0) goto Lc4
            char[] r3 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lca
            int r6 = r2 + (-1)
            char r3 = r3[r6]     // Catch: java.lang.Throwable -> Lca
            if (r3 != r5) goto Lc4
            r0.position(r12)     // Catch: java.lang.Throwable -> Lca
            r11 = r2
        L7a:
            if (r11 <= 0) goto L92
            char[] r0 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lca
            int r1 = r11 + (-1)
            char r1 = r0[r1]     // Catch: java.lang.Throwable -> Lca
            if (r1 != r5) goto L92
            int r11 = r11 + (-1)
            if (r11 <= 0) goto L92
            int r1 = r11 + (-1)
            char r0 = r0[r1]     // Catch: java.lang.Throwable -> Lca
            r1 = 13
            if (r0 != r1) goto L92
            int r11 = r11 + (-1)
        L92:
            java.lang.StringBuilder r0 = kotlin.io.LineReader.sb     // Catch: java.lang.Throwable -> Lca
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lca
            if (r1 != 0) goto L9b
            goto L9c
        L9b:
            r7 = 0
        L9c:
            if (r7 == 0) goto La7
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lca
            char[] r1 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lca
            r0.<init>(r1, r12, r11)     // Catch: java.lang.Throwable -> Lca
            monitor-exit(r10)
            return r0
        La7:
            char[] r1 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lca
            r0.append(r1, r12, r11)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = "sb.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)     // Catch: java.lang.Throwable -> Lca
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lca
            if (r1 <= r4) goto Lbf
            r10.trimStringBuilder()     // Catch: java.lang.Throwable -> Lca
        Lbf:
            r0.setLength(r12)     // Catch: java.lang.Throwable -> Lca
            monitor-exit(r10)
            return r11
        Lc4:
            int r0 = r10.compactBytes()     // Catch: java.lang.Throwable -> Lca
            goto L28
        Lca:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }
}
