package okio;

/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001eH\u0016J \u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0016J \u0010\u001a\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020$2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u001bH\u0016J\u0010\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010*\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010.\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010/\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001bH\u0016J\u0010\u00102\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001bH\u0016J\u0018\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u000206H\u0016J(\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001b2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00109\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0019H\u0016J \u00109\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bH\u0016J\u0010\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "sink", "Lokio/Sink;", "(Lokio/Sink;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", "close", "", "emit", "emitCompleteSegments", "flush", "isOpen", "outputStream", "Ljava/io/OutputStream;", "timeout", "Lokio/Timeout;", "toString", "", "write", "", "source", "Ljava/nio/ByteBuffer;", "", "offset", "byteCount", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "writeAll", "writeByte", "b", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", "string", "charset", "Ljava/nio/charset/Charset;", "beginIndex", "endIndex", "writeUtf8", "writeUtf8CodePoint", "codePoint", "okio"}, k = 1, mv = {1, 4, 1})
public final class RealBufferedSink implements okio.BufferedSink {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final okio.Buffer bufferField;

    @kotlin.jvm.JvmField
    public boolean closed;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink;


    public RealBufferedSink(@org.jetbrains.annotations.NotNull okio.Sink r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.sink = r2
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            r1.bufferField = r2
            return
    }

    public static /* synthetic */ void getBuffer$annotations() {
            return
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer buffer() {
            r1 = this;
            okio.Buffer r0 = r1.bufferField
            return r0
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r6 = this;
            boolean r0 = r6.closed
            if (r0 == 0) goto L5
            goto L2e
        L5:
            r0 = 0
            okio.Buffer r1 = r6.bufferField     // Catch: java.lang.Throwable -> L1e
            long r1 = r1.size()     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L1f
            okio.Sink r1 = r6.sink     // Catch: java.lang.Throwable -> L1e
            okio.Buffer r2 = r6.bufferField     // Catch: java.lang.Throwable -> L1e
            long r3 = r2.size()     // Catch: java.lang.Throwable -> L1e
            r1.write(r2, r3)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r0 = move-exception
        L1f:
            okio.Sink r1 = r6.sink     // Catch: java.lang.Throwable -> L25
            r1.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r1 = move-exception
            if (r0 != 0) goto L29
            r0 = r1
        L29:
            r1 = 1
            r6.closed = r1
            if (r0 != 0) goto L2f
        L2e:
            return
        L2f:
            throw r0
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink emit() {
            r5 = this;
            boolean r0 = r5.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L19
            okio.Sink r2 = r5.sink
            okio.Buffer r3 = r5.bufferField
            r2.write(r3, r0)
        L19:
            return r5
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink emitCompleteSegments() {
            r5 = this;
            boolean r0 = r5.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.completeSegmentByteCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L19
            okio.Sink r2 = r5.sink
            okio.Buffer r3 = r5.bufferField
            r2.write(r3, r0)
        L19:
            return r5
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
            r5 = this;
            boolean r0 = r5.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L23
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1d
            okio.Sink r0 = r5.sink
            okio.Buffer r1 = r5.bufferField
            long r2 = r1.size()
            r0.write(r1, r2)
        L1d:
            okio.Sink r0 = r5.sink
            r0.flush()
            return
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer getBuffer() {
            r1 = this;
            okio.Buffer r0 = r1.bufferField
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            return r0
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public java.io.OutputStream outputStream() {
            r1 = this;
            okio.RealBufferedSink$outputStream$1 r0 = new okio.RealBufferedSink$outputStream$1
            r0.<init>(r1)
            return r0
    }

    @Override // okio.Sink
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.Sink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "buffer("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            okio.Sink r1 = r2.sink
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L16
            okio.Buffer r0 = r1.bufferField
            int r2 = r0.write(r2)
            r1.emitCompleteSegments()
            return r2
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink write(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.write(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L15:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink write(@org.jetbrains.annotations.NotNull okio.ByteString r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3, r4)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L15:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink write(@org.jetbrains.annotations.NotNull okio.Source r6, long r7) {
            r5 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
        L6:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L23
            okio.Buffer r0 = r5.bufferField
            long r0 = r6.read(r0, r7)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1d
            long r7 = r7 - r0
            r5.emitCompleteSegments()
            goto L6
        L1d:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L23:
            return r5
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink write(@org.jetbrains.annotations.NotNull byte[] r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L16
            okio.Buffer r0 = r1.bufferField
            r0.write(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink write(@org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L16
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3, r4)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.Sink
    public void write(@org.jetbrains.annotations.NotNull okio.Buffer r2, long r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            okio.Buffer r0 = r1.bufferField
            r0.write(r2, r3)
            r1.emitCompleteSegments()
            return
        L15:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    public long writeAll(@org.jetbrains.annotations.NotNull okio.Source r8) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
        L8:
            okio.Buffer r2 = r7.bufferField
            r3 = 8192(0x2000, float:1.148E-41)
            long r3 = (long) r3
            long r2 = r8.read(r2, r3)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L18
            return r0
        L18:
            long r0 = r0 + r2
            r7.emitCompleteSegments()
            goto L8
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeByte(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L10
            okio.Buffer r0 = r1.bufferField
            r0.writeByte(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeDecimalLong(long r2) {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L10
            okio.Buffer r0 = r1.bufferField
            r0.writeDecimalLong(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeHexadecimalUnsignedLong(long r2) {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L10
            okio.Buffer r0 = r1.bufferField
            r0.writeHexadecimalUnsignedLong(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeInt(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L10
            okio.Buffer r0 = r1.bufferField
            r0.writeInt(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeIntLe(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L10
            okio.Buffer r0 = r1.bufferField
            r0.writeIntLe(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeLong(long r2) {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L10
            okio.Buffer r0 = r1.bufferField
            r0.writeLong(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeLongLe(long r2) {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L10
            okio.Buffer r0 = r1.bufferField
            r0.writeLongLe(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeShort(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L10
            okio.Buffer r0 = r1.bufferField
            r0.writeShort(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeShortLe(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L10
            okio.Buffer r0 = r1.bufferField
            r0.writeShortLe(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeString(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r5) {
            r1 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1b
            okio.Buffer r0 = r1.bufferField
            r0.writeString(r2, r3, r4, r5)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L1b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeString(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            r1 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L1b
            okio.Buffer r0 = r1.bufferField
            r0.writeString(r2, r3)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L1b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L16
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L16
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8(r2, r3, r4)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSink writeUtf8CodePoint(int r2) {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L10
            okio.Buffer r0 = r1.bufferField
            r0.writeUtf8CodePoint(r2)
            okio.BufferedSink r2 = r1.emitCompleteSegments()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }
}
