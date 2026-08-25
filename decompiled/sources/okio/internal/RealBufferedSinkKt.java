package okio.internal;

/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\t\u001a\u00020\n*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u0016\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0015H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010#\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\nH\u0080\b\u001a%\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010(\u001a\u00020\u0004*\u00020\u00022\u0006\u0010)\u001a\u00020\u000fH\u0080\b¨\u0006*"}, d2 = {"commonClose", "", "Lokio/RealBufferedSink;", "commonEmit", "Lokio/BufferedSink;", "commonEmitCompleteSegments", "commonFlush", "commonTimeout", "Lokio/Timeout;", "commonToString", "", "commonWrite", "source", "", "offset", "", "byteCount", "Lokio/Buffer;", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "b", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteIntLe", "commonWriteLong", "commonWriteLongLe", "commonWriteShort", "s", "commonWriteShortLe", "commonWriteUtf8", "string", "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "okio"}, k = 2, mv = {1, 4, 1})
public final class RealBufferedSinkKt {
    public static final void commonClose(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r6) {
            java.lang.String r0 = "$this$commonClose"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r6.closed
            if (r0 == 0) goto La
            return
        La:
            r0 = 0
            okio.Buffer r1 = r6.bufferField     // Catch: java.lang.Throwable -> L23
            long r1 = r1.size()     // Catch: java.lang.Throwable -> L23
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L24
            okio.Sink r1 = r6.sink     // Catch: java.lang.Throwable -> L23
            okio.Buffer r2 = r6.bufferField     // Catch: java.lang.Throwable -> L23
            long r3 = r2.size()     // Catch: java.lang.Throwable -> L23
            r1.write(r2, r3)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r0 = move-exception
        L24:
            okio.Sink r1 = r6.sink     // Catch: java.lang.Throwable -> L2a
            r1.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r1 = move-exception
            if (r0 != 0) goto L2e
            r0 = r1
        L2e:
            r1 = 1
            r6.closed = r1
            if (r0 != 0) goto L34
            return
        L34:
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonEmit(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r5) {
            java.lang.String r0 = "$this$commonEmit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1f
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1e
            okio.Sink r2 = r5.sink
            okio.Buffer r3 = r5.bufferField
            r2.write(r3, r0)
        L1e:
            return r5
        L1f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonEmitCompleteSegments(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r5) {
            java.lang.String r0 = "$this$commonEmitCompleteSegments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1f
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.completeSegmentByteCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1e
            okio.Sink r2 = r5.sink
            okio.Buffer r3 = r5.bufferField
            r2.write(r3, r0)
        L1e:
            return r5
        L1f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public static final void commonFlush(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r5) {
            java.lang.String r0 = "$this$commonFlush"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L28
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L22
            okio.Sink r0 = r5.sink
            okio.Buffer r1 = r5.bufferField
            long r2 = r1.size()
            r0.write(r1, r2)
        L22:
            okio.Sink r5 = r5.sink
            r5.flush()
            return
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Timeout commonTimeout(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1) {
            java.lang.String r0 = "$this$commonTimeout"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.Sink r1 = r1.sink
            okio.Timeout r1 = r1.timeout()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonToString(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r2) {
            java.lang.String r0 = "$this$commonToString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "buffer("
            r0.append(r1)
            okio.Sink r2 = r2.sink
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWrite(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull okio.ByteString r2) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            okio.Buffer r0 = r1.bufferField
            r0.write(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWrite(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull okio.ByteString r2, int r3, int r4) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3, r4)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWrite(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r5, @org.jetbrains.annotations.NotNull okio.Source r6, long r7) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
        Lb:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L28
            okio.Buffer r0 = r5.bufferField
            long r0 = r6.read(r0, r7)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L22
            long r7 = r7 - r0
            r5.emitCompleteSegments()
            goto Lb
        L22:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L28:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWrite(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1b
            okio.Buffer r0 = r1.bufferField
            r0.write(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWrite(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1b
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3, r4)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final void commonWrite(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull okio.Buffer r2, long r3) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3)
            r1.emitCompleteSegments()
            return
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final long commonWriteAll(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r7, @org.jetbrains.annotations.NotNull okio.Source r8) {
            java.lang.String r0 = "$this$commonWriteAll"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
        Ld:
            okio.Buffer r2 = r7.bufferField
            r3 = 8192(0x2000, float:1.148E-41)
            long r3 = (long) r3
            long r2 = r8.read(r2, r3)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1d
            return r0
        L1d:
            long r0 = r0 + r2
            r7.emitCompleteSegments()
            goto Ld
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteByte(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, int r2) {
            java.lang.String r0 = "$this$commonWriteByte"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.writeByte(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteDecimalLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, long r2) {
            java.lang.String r0 = "$this$commonWriteDecimalLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.writeDecimalLong(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, long r2) {
            java.lang.String r0 = "$this$commonWriteHexadecimalUnsignedLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.writeHexadecimalUnsignedLong(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteInt(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, int r2) {
            java.lang.String r0 = "$this$commonWriteInt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.writeInt(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteIntLe(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, int r2) {
            java.lang.String r0 = "$this$commonWriteIntLe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.writeIntLe(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, long r2) {
            java.lang.String r0 = "$this$commonWriteLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.writeLong(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteLongLe(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, long r2) {
            java.lang.String r0 = "$this$commonWriteLongLe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.writeLongLe(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteShort(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, int r2) {
            java.lang.String r0 = "$this$commonWriteShort"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.writeShort(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteShortLe(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, int r2) {
            java.lang.String r0 = "$this$commonWriteShortLe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.writeShortLe(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteUtf8(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "$this$commonWriteUtf8"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1b
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteUtf8(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, @org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "$this$commonWriteUtf8"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1b
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8(r2, r3, r4)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink commonWriteUtf8CodePoint(@org.jetbrains.annotations.NotNull okio.RealBufferedSink r1, int r2) {
            java.lang.String r0 = "$this$commonWriteUtf8CodePoint"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8CodePoint(r2)
            okio.BufferedSink r1 = r1.emitCompleteSegments()
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
