package okio;

/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u0001H\u0016J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J(\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'H\u0016J \u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'2\u0006\u0010 \u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020'H\u0016J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\"H\u0016J\b\u00102\u001a\u00020\u0012H\u0016J\b\u00103\u001a\u00020\u0012H\u0016J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0018\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020\u00122\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000208H\u0016J\u0010\u0010;\u001a\u0002082\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\n\u0010=\u001a\u0004\u0018\u000108H\u0016J\b\u0010>\u001a\u000208H\u0016J\u0010\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020\u0012H\u0016J\u0010\u0010@\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010A\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u000208H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "source", "Lokio/Source;", "(Lokio/Source;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", "close", "", "exhausted", "indexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "peek", "rangeEquals", "offset", "bytesOffset", "", "byteCount", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "", "charset", "Ljava/nio/charset/Charset;", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "skip", "timeout", "Lokio/Timeout;", "toString", "okio"}, k = 1, mv = {1, 4, 1})
public final class RealBufferedSource implements okio.BufferedSource {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final okio.Buffer bufferField;

    @kotlin.jvm.JvmField
    public boolean closed;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final okio.Source source;


    public RealBufferedSource(@org.jetbrains.annotations.NotNull okio.Source r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.source = r2
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            r1.bufferField = r2
            return
    }

    public static /* synthetic */ void getBuffer$annotations() {
            return
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer buffer() {
            r1 = this;
            okio.Buffer r0 = r1.bufferField
            return r0
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 == 0) goto L5
            goto L12
        L5:
            r0 = 1
            r1.closed = r0
            okio.Source r0 = r1.source
            r0.close()
            okio.Buffer r0 = r1.bufferField
            r0.clear()
        L12:
            return
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
            r6 = this;
            boolean r0 = r6.closed
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L22
            okio.Buffer r0 = r6.bufferField
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L20
            okio.Source r0 = r6.source
            okio.Buffer r2 = r6.bufferField
            r3 = 8192(0x2000, float:1.148E-41)
            long r3 = (long) r3
            long r2 = r0.read(r2, r3)
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer getBuffer() {
            r1 = this;
            okio.Buffer r0 = r1.bufferField
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7) {
            r6 = this;
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            long r0 = r0.indexOf(r1, r2, r4)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7, long r8) {
            r6 = this;
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            long r7 = r0.indexOf(r1, r2, r4)
            return r7
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r9, long r10, long r12) {
            r8 = this;
            boolean r0 = r8.closed
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L6d
            r2 = 0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto Ld
            goto L12
        Ld:
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 < 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L4a
        L15:
            r0 = -1
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 >= 0) goto L49
            okio.Buffer r2 = r8.bufferField
            r3 = r9
            r4 = r10
            r6 = r12
            long r2 = r2.indexOf(r3, r4, r6)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L2a
            r0 = r2
            goto L49
        L2a:
            okio.Buffer r2 = r8.bufferField
            long r2 = r2.size()
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 >= 0) goto L49
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, float:1.148E-41)
            long r6 = (long) r6
            long r4 = r4.read(r5, r6)
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L44
            goto L49
        L44:
            long r10 = java.lang.Math.max(r10, r2)
            goto L15
        L49:
            return r0
        L4a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "fromIndex="
            r9.append(r0)
            r9.append(r10)
            java.lang.String r10 = " toIndex="
            r9.append(r10)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L6d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    @Override // okio.BufferedSource
    public long indexOf(@org.jetbrains.annotations.NotNull okio.ByteString r3) {
            r2 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r0 = r2.indexOf(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(@org.jetbrains.annotations.NotNull okio.ByteString r9, long r10) {
            r8 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L3d
        Lb:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOf(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            goto L2e
        L18:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, float:1.148E-41)
            long r6 = (long) r6
            long r4 = r4.read(r5, r6)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L2f
            r0 = r2
        L2e:
            return r0
        L2f:
            int r2 = r9.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            long r10 = java.lang.Math.max(r10, r0)
            goto Lb
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@org.jetbrains.annotations.NotNull okio.ByteString r3) {
            r2 = this;
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r0 = r2.indexOfElement(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@org.jetbrains.annotations.NotNull okio.ByteString r9, long r10) {
            r8 = this;
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L35
        Lc:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOfElement(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            goto L2f
        L19:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, float:1.148E-41)
            long r6 = (long) r6
            long r4 = r4.read(r5, r6)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L30
            r0 = r2
        L2f:
            return r0
        L30:
            long r10 = java.lang.Math.max(r10, r0)
            goto Lc
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.io.InputStream inputStream() {
            r1 = this;
            okio.RealBufferedSource$inputStream$1 r0 = new okio.RealBufferedSource$inputStream$1
            r0.<init>(r1)
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSource peek() {
            r1 = this;
            okio.PeekSource r0 = new okio.PeekSource
            r0.<init>(r1)
            okio.BufferedSource r0 = okio.Okio.buffer(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r8, @org.jetbrains.annotations.NotNull okio.ByteString r10) {
            r7 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r6 = r10.size()
            r5 = 0
            r1 = r7
            r2 = r8
            r4 = r10
            boolean r8 = r1.rangeEquals(r2, r4, r5, r6)
            return r8
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r8, @org.jetbrains.annotations.NotNull okio.ByteString r10, int r11, int r12) {
            r7 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r7.closed
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L41
            r2 = 0
            r0 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L3f
            if (r11 < 0) goto L3f
            if (r12 < 0) goto L3f
            int r2 = r10.size()
            int r2 = r2 - r11
            if (r2 >= r12) goto L1e
            goto L3f
        L1e:
            r2 = 0
        L1f:
            if (r2 >= r12) goto L40
            long r3 = (long) r2
            long r3 = r3 + r8
            r5 = 1
            long r5 = r5 + r3
            boolean r5 = r7.request(r5)
            if (r5 != 0) goto L2d
            goto L3f
        L2d:
            okio.Buffer r5 = r7.bufferField
            byte r3 = r5.getByte(r3)
            int r4 = r11 + r2
            byte r4 = r10.getByte(r4)
            if (r3 == r4) goto L3c
            goto L3f
        L3c:
            int r2 = r2 + 1
            goto L1f
        L3f:
            r1 = 0
        L40:
            return r1
        L41:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r6) {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L25
            okio.Source r0 = r5.source
            okio.Buffer r1 = r5.bufferField
            r2 = 8192(0x2000, float:1.148E-41)
            long r2 = (long) r2
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L25
            r6 = -1
            return r6
        L25:
            okio.Buffer r0 = r5.bufferField
            int r6 = r0.read(r6)
            return r6
    }

    @Override // okio.BufferedSource
    public int read(@org.jetbrains.annotations.NotNull byte[] r3) {
            r2 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            r1 = 0
            int r3 = r2.read(r3, r1, r0)
            return r3
    }

    @Override // okio.BufferedSource
    public int read(@org.jetbrains.annotations.NotNull byte[] r10, int r11, int r12) {
            r9 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r10.length
            long r1 = (long) r0
            long r3 = (long) r11
            long r7 = (long) r12
            r5 = r7
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            okio.Buffer r12 = r9.bufferField
            long r0 = r12.size()
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L2d
            okio.Source r12 = r9.source
            okio.Buffer r0 = r9.bufferField
            r1 = 8192(0x2000, float:1.148E-41)
            long r1 = (long) r1
            long r0 = r12.read(r0, r1)
            r2 = -1
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L2d
            r10 = -1
            goto L3e
        L2d:
            okio.Buffer r12 = r9.bufferField
            long r0 = r12.size()
            long r0 = java.lang.Math.min(r7, r0)
            int r12 = (int) r0
            okio.Buffer r0 = r9.bufferField
            int r10 = r0.read(r10, r11, r12)
        L3e:
            return r10
    }

    @Override // okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L50
            boolean r2 = r7.closed
            r2 = r2 ^ 1
            if (r2 == 0) goto L44
            okio.Buffer r2 = r7.bufferField
            long r2 = r2.size()
            r4 = -1
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L33
            okio.Source r0 = r7.source
            okio.Buffer r1 = r7.bufferField
            r2 = 8192(0x2000, float:1.148E-41)
            long r2 = (long) r2
            long r0 = r0.read(r1, r2)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L33
            goto L43
        L33:
            okio.Buffer r0 = r7.bufferField
            long r0 = r0.size()
            long r9 = java.lang.Math.min(r9, r0)
            okio.Buffer r0 = r7.bufferField
            long r4 = r0.read(r8, r9)
        L43:
            return r4
        L44:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L50:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r9)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    @Override // okio.BufferedSource
    public long readAll(@org.jetbrains.annotations.NotNull okio.Sink r10) {
            r9 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r2 = r0
        L9:
            okio.Source r4 = r9.source
            okio.Buffer r5 = r9.bufferField
            r6 = 8192(0x2000, float:1.148E-41)
            long r6 = (long) r6
            long r4 = r4.read(r5, r6)
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L2b
            okio.Buffer r4 = r9.bufferField
            long r4 = r4.completeSegmentByteCount()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L9
            long r2 = r2 + r4
            okio.Buffer r6 = r9.bufferField
            r10.write(r6, r4)
            goto L9
        L2b:
            okio.Buffer r4 = r9.bufferField
            long r4 = r4.size()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L45
            okio.Buffer r0 = r9.bufferField
            long r0 = r0.size()
            long r2 = r2 + r0
            okio.Buffer r0 = r9.bufferField
            long r4 = r0.size()
            r10.write(r0, r4)
        L45:
            return r2
    }

    @Override // okio.BufferedSource
    public byte readByte() {
            r2 = this;
            r0 = 1
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            byte r0 = r0.readByte()
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public byte[] readByteArray() {
            r2 = this;
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.bufferField
            byte[] r0 = r0.readByteArray()
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public byte[] readByteArray(long r2) {
            r1 = this;
            r1.require(r2)
            okio.Buffer r0 = r1.bufferField
            byte[] r2 = r0.readByteArray(r2)
            return r2
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public okio.ByteString readByteString() {
            r2 = this;
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.bufferField
            okio.ByteString r0 = r0.readByteString()
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public okio.ByteString readByteString(long r2) {
            r1 = this;
            r1.require(r2)
            okio.Buffer r0 = r1.bufferField
            okio.ByteString r2 = r0.readByteString(r2)
            return r2
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() {
            r10 = this;
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L55
            okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L2c
            r4 = 45
            byte r4 = (byte) r4
            if (r8 == r4) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r9 == 0) goto L2f
            goto L55
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            r2 = 16
            int r2 = kotlin.text.CharsKt.checkRadix(r2)
            int r2 = kotlin.text.CharsKt.checkRadix(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L55:
            okio.Buffer r0 = r10.bufferField
            long r0 = r0.readDecimalLong()
            return r0
    }

    @Override // okio.BufferedSource
    public void readFully(@org.jetbrains.annotations.NotNull okio.Buffer r2, long r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.require(r3)     // Catch: java.io.EOFException -> Lf
            okio.Buffer r0 = r1.bufferField
            r0.readFully(r2, r3)
            return
        Lf:
            r3 = move-exception
            okio.Buffer r4 = r1.bufferField
            r2.writeAll(r4)
            throw r3
    }

    @Override // okio.BufferedSource
    public void readFully(@org.jetbrains.annotations.NotNull byte[] r8) {
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.length     // Catch: java.io.EOFException -> L11
            long r0 = (long) r0     // Catch: java.io.EOFException -> L11
            r7.require(r0)     // Catch: java.io.EOFException -> L11
            okio.Buffer r0 = r7.bufferField
            r0.readFully(r8)
            return
        L11:
            r0 = move-exception
            r1 = 0
        L13:
            okio.Buffer r2 = r7.bufferField
            long r2 = r2.size()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L35
            okio.Buffer r2 = r7.bufferField
            long r3 = r2.size()
            int r4 = (int) r3
            int r2 = r2.read(r8, r1, r4)
            r3 = -1
            if (r2 == r3) goto L2f
            int r1 = r1 + r2
            goto L13
        L2f:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L35:
            throw r0
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() {
            r5 = this;
            r0 = 1
            r5.require(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L60
            okio.Buffer r2 = r5.bufferField
            long r3 = (long) r0
            byte r2 = r2.getByte(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L20
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L35
        L20:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L2a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L35
        L2a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L37
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L35
            goto L37
        L35:
            r0 = r1
            goto L6
        L37:
            if (r0 == 0) goto L3a
            goto L60
        L3a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            r3 = 16
            int r3 = kotlin.text.CharsKt.checkRadix(r3)
            int r3 = kotlin.text.CharsKt.checkRadix(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L60:
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.readHexadecimalUnsignedLong()
            return r0
    }

    @Override // okio.BufferedSource
    public int readInt() {
            r2 = this;
            r0 = 4
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            int r0 = r0.readInt()
            return r0
    }

    @Override // okio.BufferedSource
    public int readIntLe() {
            r2 = this;
            r0 = 4
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            int r0 = r0.readIntLe()
            return r0
    }

    @Override // okio.BufferedSource
    public long readLong() {
            r2 = this;
            r0 = 8
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            long r0 = r0.readLong()
            return r0
    }

    @Override // okio.BufferedSource
    public long readLongLe() {
            r2 = this;
            r0 = 8
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            long r0 = r0.readLongLe()
            return r0
    }

    @Override // okio.BufferedSource
    public short readShort() {
            r2 = this;
            r0 = 2
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            short r0 = r0.readShort()
            return r0
    }

    @Override // okio.BufferedSource
    public short readShortLe() {
            r2 = this;
            r0 = 2
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            short r0 = r0.readShortLe()
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.lang.String readString(long r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r4) {
            r1 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.require(r2)
            okio.Buffer r0 = r1.bufferField
            java.lang.String r2 = r0.readString(r2, r4)
            return r2
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.lang.String readString(@org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.bufferField
            java.lang.String r3 = r0.readString(r3)
            return r3
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.lang.String readUtf8() {
            r2 = this;
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.bufferField
            java.lang.String r0 = r0.readUtf8()
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.lang.String readUtf8(long r2) {
            r1 = this;
            r1.require(r2)
            okio.Buffer r0 = r1.bufferField
            java.lang.String r2 = r0.readUtf8(r2)
            return r2
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() {
            r3 = this;
            r0 = 1
            r3.require(r0)
            okio.Buffer r0 = r3.bufferField
            r1 = 0
            byte r0 = r0.getByte(r1)
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r2 = 192(0xc0, float:2.69E-43)
            if (r1 != r2) goto L19
            r0 = 2
            r3.require(r0)
            goto L30
        L19:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r2) goto L25
            r0 = 3
            r3.require(r0)
            goto L30
        L25:
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 != r1) goto L30
            r0 = 4
            r3.require(r0)
        L30:
            okio.Buffer r0 = r3.bufferField
            int r0 = r0.readUtf8CodePoint()
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.Nullable
    public java.lang.String readUtf8Line() {
            r5 = this;
            r0 = 10
            byte r0 = (byte) r0
            long r0 = r5.indexOf(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L26
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            java.lang.String r0 = r5.readUtf8(r0)
            goto L2c
        L24:
            r0 = 0
            goto L2c
        L26:
            okio.Buffer r2 = r5.bufferField
            java.lang.String r0 = okio.internal.BufferKt.readUtf8Line(r2, r0)
        L2c:
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.lang.String readUtf8LineStrict() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r0 = r2.readUtf8LineStrict(r0)
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.lang.String readUtf8LineStrict(long r14) {
            r13 = this;
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Lab
            r0 = 1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 != 0) goto L18
            r4 = r2
            goto L1a
        L18:
            long r4 = r14 + r0
        L1a:
            r6 = 10
            byte r12 = (byte) r6
            r8 = 0
            r6 = r13
            r7 = r12
            r10 = r4
            long r6 = r6.indexOf(r7, r8, r10)
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L33
            okio.Buffer r14 = r13.bufferField
            java.lang.String r14 = okio.internal.BufferKt.readUtf8Line(r14, r6)
            goto L5f
        L33:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L60
            boolean r2 = r13.request(r4)
            if (r2 == 0) goto L60
            okio.Buffer r2 = r13.bufferField
            long r6 = r4 - r0
            byte r2 = r2.getByte(r6)
            r3 = 13
            byte r3 = (byte) r3
            if (r2 != r3) goto L60
            long r0 = r0 + r4
            boolean r0 = r13.request(r0)
            if (r0 == 0) goto L60
            okio.Buffer r0 = r13.bufferField
            byte r0 = r0.getByte(r4)
            if (r0 != r12) goto L60
            okio.Buffer r14 = r13.bufferField
            java.lang.String r14 = okio.internal.BufferKt.readUtf8Line(r14, r4)
        L5f:
            return r14
        L60:
            okio.Buffer r6 = new okio.Buffer
            r6.<init>()
            okio.Buffer r0 = r13.bufferField
            r2 = 0
            r1 = 32
            long r4 = r0.size()
            long r7 = (long) r1
            long r4 = java.lang.Math.min(r7, r4)
            r1 = r6
            r0.copyTo(r1, r2, r4)
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.String r1 = "\\n not found: limit="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            okio.Buffer r2 = r13.bufferField
            long r2 = r2.size()
            long r14 = java.lang.Math.min(r2, r14)
            r1.append(r14)
            java.lang.String r14 = " content="
            r1.append(r14)
            okio.ByteString r14 = r6.readByteString()
            java.lang.String r14 = r14.hex()
            r1.append(r14)
            java.lang.String r14 = "…"
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        Lab:
            java.lang.String r0 = "limit < 0: "
            java.lang.String r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r14)
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r15.<init>(r14)
            throw r15
    }

    @Override // okio.BufferedSource
    public boolean request(long r7) {
            r6 = this;
            r0 = 0
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            if (r1 == 0) goto L3c
            boolean r1 = r6.closed
            r1 = r1 ^ 1
            if (r1 == 0) goto L30
        L12:
            okio.Buffer r1 = r6.bufferField
            long r1 = r1.size()
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 >= 0) goto L2e
            okio.Source r1 = r6.source
            okio.Buffer r2 = r6.bufferField
            r3 = 8192(0x2000, float:1.148E-41)
            long r3 = (long) r3
            long r1 = r1.read(r2, r3)
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L12
            goto L2f
        L2e:
            r0 = 1
        L2f:
            return r0
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r7)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    @Override // okio.BufferedSource
    public void require(long r1) {
            r0 = this;
            boolean r1 = r0.request(r1)
            if (r1 == 0) goto L7
            return
        L7:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    @Override // okio.BufferedSource
    public int select(@org.jetbrains.annotations.NotNull okio.Options r9) {
            r8 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.closed
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L3d
        Lb:
            okio.Buffer r0 = r8.bufferField
            int r0 = okio.internal.BufferKt.selectPrefix(r0, r9, r1)
            r2 = -2
            r3 = -1
            if (r0 == r2) goto L2a
            if (r0 == r3) goto L28
            okio.ByteString[] r9 = r9.getByteStrings$okio()
            r9 = r9[r0]
            int r9 = r9.size()
            okio.Buffer r1 = r8.bufferField
            long r2 = (long) r9
            r1.skip(r2)
            goto L3c
        L28:
            r0 = -1
            goto L3c
        L2a:
            okio.Source r0 = r8.source
            okio.Buffer r2 = r8.bufferField
            r4 = 8192(0x2000, float:1.148E-41)
            long r4 = (long) r4
            long r4 = r0.read(r2, r4)
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto Lb
            goto L28
        L3c:
            return r0
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
    }

    @Override // okio.BufferedSource
    public void skip(long r6) {
            r5 = this;
            boolean r0 = r5.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L40
        L6:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3f
            okio.Buffer r2 = r5.bufferField
            long r2 = r2.size()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L2e
            okio.Source r0 = r5.source
            okio.Buffer r1 = r5.bufferField
            r2 = 8192(0x2000, float:1.148E-41)
            long r2 = (long) r2
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L28
            goto L2e
        L28:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L2e:
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            long r0 = java.lang.Math.min(r6, r0)
            okio.Buffer r2 = r5.bufferField
            r2.skip(r0)
            long r6 = r6 - r0
            goto L6
        L3f:
            return
        L40:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "closed"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    @Override // okio.Source
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.Source r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "buffer("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            okio.Source r1 = r2.source
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
