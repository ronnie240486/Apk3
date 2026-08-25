package okio;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0090\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0000H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0000J$\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\fJ \u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0000H\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\b+J\u0015\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\fH\u0007¢\u0006\u0002\b-J\b\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001dH\u0002J\u000e\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00104\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)H\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\fH\u0016J \u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001dH\u0016J\u0018\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020#H\u0016J\u0006\u0010?\u001a\u00020\u001dJ\b\u0010@\u001a\u00020\u0019H\u0016J\b\u0010A\u001a\u00020\u0001H\u0016J\u0018\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J(\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020GH\u0016J \u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010H\u001a\u00020\f2\u0006\u0010E\u001a\u00020IH\u0016J\u0012\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010M\u001a\u00020)H\u0016J\b\u0010N\u001a\u00020GH\u0016J\u0010\u0010N\u001a\u00020G2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010O\u001a\u00020\u001dH\u0016J\u0010\u0010O\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010P\u001a\u00020\fH\u0016J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=J\u0016\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\fJ \u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010S\u001a\u00020#H\u0002J\u0010\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020GH\u0016J\u0018\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010U\u001a\u00020\fH\u0016J\b\u0010V\u001a\u00020/H\u0016J\b\u0010W\u001a\u00020/H\u0016J\b\u0010X\u001a\u00020\fH\u0016J\b\u0010Y\u001a\u00020\fH\u0016J\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020[H\u0016J\u0010\u0010]\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J\u0018\u0010]\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010^\u001a\u00020_H\u0016J\u0012\u0010`\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010a\u001a\u00020\u001fH\u0016J\u0010\u0010a\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010b\u001a\u00020/H\u0016J\n\u0010c\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010d\u001a\u00020\u001fH\u0016J\u0010\u0010d\u001a\u00020\u001f2\u0006\u0010e\u001a\u00020\fH\u0016J\u0010\u0010f\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010g\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010h\u001a\u00020/2\u0006\u0010i\u001a\u00020jH\u0016J\u0006\u0010k\u001a\u00020\u001dJ\u0006\u0010l\u001a\u00020\u001dJ\u0006\u0010m\u001a\u00020\u001dJ\r\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0006\u0010p\u001a\u00020\u001dJ\u000e\u0010p\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020/J\b\u0010q\u001a\u00020rH\u0016J\b\u0010s\u001a\u00020\u001fH\u0016J\u0015\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020/H\u0000¢\u0006\u0002\bvJ\u0010\u0010w\u001a\u00020/2\u0006\u0010x\u001a\u00020FH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020GH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001dH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020z2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010{\u001a\u00020\f2\u0006\u0010x\u001a\u00020zH\u0016J\u0010\u0010|\u001a\u00020\u00002\u0006\u00106\u001a\u00020/H\u0016J\u0010\u0010}\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0010\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0011\u0010\u0084\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u001a\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J,\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/2\u0006\u0010^\u001a\u00020_H\u0016J\u001b\u0010\u008c\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0012\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001fH\u0016J$\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/H\u0016J\u0012\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020/H\u0016R\u0014\u0010\u0006\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0091\u0001"}, d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "()V", "buffer", "getBuffer", "()Lokio/Buffer;", "head", "Lokio/Segment;", "<set-?>", "", "size", "()J", "setSize$okio", "(J)V", "clear", "", "clone", "close", "completeSegmentByteCount", "copy", "copyTo", "out", "Ljava/io/OutputStream;", "offset", "byteCount", "digest", "Lokio/ByteString;", "algorithm", "", "emit", "emitCompleteSegments", "equals", "", "other", "", "exhausted", "flush", "get", "", "pos", "getByte", "index", "-deprecated_getByte", "hashCode", "", "hmac", "key", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "b", "fromIndex", "toIndex", "bytes", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "md5", "outputStream", "peek", "rangeEquals", "bytesOffset", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readAndWriteUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFrom", "input", "forever", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "charset", "Ljava/nio/charset/Charset;", "readUnsafe", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "sha1", "sha256", "sha512", "-deprecated_size", "skip", "snapshot", "timeout", "Lokio/Timeout;", "toString", "writableSegment", "minimumCapacity", "writableSegment$okio", "write", "source", "byteString", "Lokio/Source;", "writeAll", "writeByte", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", "string", "beginIndex", "endIndex", "writeTo", "writeUtf8", "writeUtf8CodePoint", "codePoint", "UnsafeCursor", "okio"}, k = 1, mv = {1, 4, 1})
public final class Buffer implements okio.BufferedSource, okio.BufferedSink, java.lang.Cloneable, java.nio.channels.ByteChannel {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public okio.Segment head;
    private long size;

    /* JADX INFO: compiled from: Buffer.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "()V", "buffer", "Lokio/Buffer;", "data", "", "end", "", "offset", "", "readWrite", "", "segment", "Lokio/Segment;", "getSegment$okio", "()Lokio/Segment;", "setSegment$okio", "(Lokio/Segment;)V", "start", "close", "", "expandBuffer", "minByteCount", "next", "resizeBuffer", "newSize", "seek", "okio"}, k = 1, mv = {1, 4, 1})
    public static final class UnsafeCursor implements java.io.Closeable {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public okio.Buffer buffer;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public byte[] data;

        @kotlin.jvm.JvmField
        public int end;

        @kotlin.jvm.JvmField
        public long offset;

        @kotlin.jvm.JvmField
        public boolean readWrite;

        @org.jetbrains.annotations.Nullable
        private okio.Segment segment;

        @kotlin.jvm.JvmField
        public int start;

        public UnsafeCursor() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.offset = r0
                r0 = -1
                r2.start = r0
                r2.end = r0
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                okio.Buffer r0 = r3.buffer
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                if (r0 == 0) goto L1b
                r0 = 0
                r3.buffer = r0
                r3.setSegment$okio(r0)
                r1 = -1
                r3.offset = r1
                r3.data = r0
                r0 = -1
                r3.start = r0
                r3.end = r0
                return
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "not attached to a buffer"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final long expandBuffer(int r10) {
                r9 = this;
                r0 = 1
                if (r10 <= 0) goto L5
                r1 = 1
                goto L6
            L5:
                r1 = 0
            L6:
                if (r1 == 0) goto L64
                r1 = 8192(0x2000, float:1.148E-41)
                if (r10 > r1) goto Ld
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 == 0) goto L54
                okio.Buffer r0 = r9.buffer
                if (r0 == 0) goto L48
                boolean r2 = r9.readWrite
                if (r2 == 0) goto L3c
                long r2 = r0.size()
                okio.Segment r10 = r0.writableSegment$okio(r10)
                int r4 = r10.limit
                int r4 = 8192 - r4
                r10.limit = r1
                long r5 = (long) r4
                long r7 = r2 + r5
                r0.setSize$okio(r7)
                r9.setSegment$okio(r10)
                r9.offset = r2
                byte[] r10 = r10.data
                r9.data = r10
                int r10 = 8192 - r4
                r9.start = r10
                r9.end = r1
                return r5
            L3c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "expandBuffer() only permitted for read/write buffers"
                java.lang.String r0 = r0.toString()
                r10.<init>(r0)
                throw r10
            L48:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "not attached to a buffer"
                java.lang.String r0 = r0.toString()
                r10.<init>(r0)
                throw r10
            L54:
                java.lang.String r0 = "minByteCount > Segment.SIZE: "
                java.lang.String r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r10)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r10 = r10.toString()
                r0.<init>(r10)
                throw r0
            L64:
                java.lang.String r0 = "minByteCount <= 0: "
                java.lang.String r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r10)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r10 = r10.toString()
                r0.<init>(r10)
                throw r0
        }

        @org.jetbrains.annotations.Nullable
        public final okio.Segment getSegment$okio() {
                r1 = this;
                okio.Segment r0 = r1.segment
                return r0
        }

        public final int next() {
                r5 = this;
                long r0 = r5.offset
                okio.Buffer r2 = r5.buffer
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                long r2 = r2.size()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L11
                r0 = 1
                goto L12
            L11:
                r0 = 0
            L12:
                if (r0 == 0) goto L2b
                long r0 = r5.offset
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L1f
                r0 = 0
                goto L26
            L1f:
                int r2 = r5.end
                int r3 = r5.start
                int r2 = r2 - r3
                long r2 = (long) r2
                long r0 = r0 + r2
            L26:
                int r0 = r5.seek(r0)
                return r0
            L2b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "no more bytes"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final long resizeBuffer(long r14) {
                r13 = this;
                okio.Buffer r0 = r13.buffer
                if (r0 == 0) goto La9
                boolean r1 = r13.readWrite
                if (r1 == 0) goto L9d
                long r1 = r0.size()
                r3 = 1
                r4 = 0
                int r6 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r6 > 0) goto L64
                int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                if (r3 < 0) goto L19
                r3 = 1
                goto L1a
            L19:
                r3 = 0
            L1a:
                if (r3 == 0) goto L54
                long r6 = r1 - r14
            L1e:
                int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r3 <= 0) goto L46
                okio.Segment r3 = r0.head
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                okio.Segment r3 = r3.prev
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r8 = r3.limit
                int r9 = r3.pos
                int r9 = r8 - r9
                long r9 = (long) r9
                int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r11 > 0) goto L42
                okio.Segment r8 = r3.pop()
                r0.head = r8
                okio.SegmentPool.recycle(r3)
                long r6 = r6 - r9
                goto L1e
            L42:
                int r4 = (int) r6
                int r8 = r8 - r4
                r3.limit = r8
            L46:
                r3 = 0
                r13.setSegment$okio(r3)
                r13.offset = r14
                r13.data = r3
                r3 = -1
                r13.start = r3
                r13.end = r3
                goto L99
            L54:
                java.lang.String r0 = "newSize < 0: "
                java.lang.String r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r14)
                java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r15.<init>(r14)
                throw r15
            L64:
                if (r6 <= 0) goto L99
                long r6 = r14 - r1
                r8 = 1
            L69:
                int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r9 <= 0) goto L99
                okio.Segment r3 = r0.writableSegment$okio(r3)
                int r9 = r3.limit
                int r9 = 8192 - r9
                long r9 = (long) r9
                long r9 = java.lang.Math.min(r6, r9)
                int r10 = (int) r9
                int r9 = r3.limit
                int r9 = r9 + r10
                r3.limit = r9
                long r11 = (long) r10
                long r6 = r6 - r11
                if (r8 == 0) goto L97
                r13.setSegment$okio(r3)
                r13.offset = r1
                byte[] r8 = r3.data
                r13.data = r8
                int r3 = r3.limit
                int r8 = r3 - r10
                r13.start = r8
                r13.end = r3
                r3 = 0
                r8 = 0
            L97:
                r3 = 1
                goto L69
            L99:
                r0.setSize$okio(r14)
                return r1
            L9d:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "resizeBuffer() only permitted for read/write buffers"
                java.lang.String r15 = r15.toString()
                r14.<init>(r15)
                throw r14
            La9:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "not attached to a buffer"
                java.lang.String r15 = r15.toString()
                r14.<init>(r15)
                throw r14
        }

        public final int seek(long r18) {
                r17 = this;
                r0 = r17
                r1 = r18
                okio.Buffer r3 = r0.buffer
                if (r3 == 0) goto Lf8
                r4 = -1
                long r5 = (long) r4
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 < 0) goto Ld5
                long r5 = r3.size()
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 > 0) goto Ld5
                r5 = -1
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 == 0) goto Lc8
                long r5 = r3.size()
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 != 0) goto L26
                goto Lc8
            L26:
                r4 = 0
                long r6 = r3.size()
                okio.Segment r8 = r3.head
                okio.Segment r9 = r17.getSegment$okio()
                if (r9 == 0) goto L59
                long r9 = r0.offset
                int r11 = r0.start
                okio.Segment r12 = r17.getSegment$okio()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
                int r12 = r12.pos
                int r11 = r11 - r12
                long r11 = (long) r11
                long r9 = r9 - r11
                int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r11 <= 0) goto L51
                okio.Segment r6 = r17.getSegment$okio()
                r15 = r8
                r8 = r6
                r6 = r9
                r9 = r15
                goto L5a
            L51:
                okio.Segment r4 = r17.getSegment$okio()
                r15 = r9
                r9 = r4
                r4 = r15
                goto L5a
            L59:
                r9 = r8
            L5a:
                long r10 = r6 - r1
                long r12 = r1 - r4
                int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r14 <= 0) goto L77
            L62:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
                int r6 = r9.limit
                int r7 = r9.pos
                int r8 = r6 - r7
                long r10 = (long) r8
                long r10 = r10 + r4
                int r8 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r8 < 0) goto L8d
                int r6 = r6 - r7
                long r6 = (long) r6
                long r4 = r4 + r6
                okio.Segment r9 = r9.next
                goto L62
            L77:
                int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r4 <= 0) goto L8b
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
                okio.Segment r8 = r8.prev
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
                int r4 = r8.limit
                int r5 = r8.pos
                int r4 = r4 - r5
                long r4 = (long) r4
                long r6 = r6 - r4
                goto L77
            L8b:
                r4 = r6
                r9 = r8
            L8d:
                boolean r6 = r0.readWrite
                if (r6 == 0) goto Lae
                kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
                boolean r6 = r9.shared
                if (r6 == 0) goto Lae
                okio.Segment r6 = r9.unsharedCopy()
                okio.Segment r7 = r3.head
                if (r7 != r9) goto La2
                r3.head = r6
            La2:
                okio.Segment r9 = r9.push(r6)
                okio.Segment r3 = r9.prev
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                r3.pop()
            Lae:
                r0.setSegment$okio(r9)
                r0.offset = r1
                kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
                byte[] r3 = r9.data
                r0.data = r3
                int r3 = r9.pos
                long r1 = r1 - r4
                int r2 = (int) r1
                int r3 = r3 + r2
                r0.start = r3
                int r1 = r9.limit
                r0.end = r1
                int r4 = r1 - r3
                goto Ld4
            Lc8:
                r3 = 0
                r0.setSegment$okio(r3)
                r0.offset = r1
                r0.data = r3
                r0.start = r4
                r0.end = r4
            Ld4:
                return r4
            Ld5:
                java.lang.ArrayIndexOutOfBoundsException r4 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "offset="
                r5.append(r6)
                r5.append(r1)
                java.lang.String r1 = " > size="
                r5.append(r1)
                long r1 = r3.size()
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                r4.<init>(r1)
                throw r4
            Lf8:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "not attached to a buffer"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        public final void setSegment$okio(@org.jetbrains.annotations.Nullable okio.Segment r1) {
                r0 = this;
                r0.segment = r1
                return
        }
    }



    public Buffer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer r6, java.io.OutputStream r7, long r8, long r10, int r12, java.lang.Object r13) throws java.io.IOException {
            r13 = r12 & 2
            if (r13 == 0) goto L6
            r8 = 0
        L6:
            r2 = r8
            r8 = r12 & 4
            if (r8 == 0) goto Lf
            long r8 = r6.size
            long r10 = r8 - r2
        Lf:
            r4 = r10
            r0 = r6
            r1 = r7
            okio.Buffer r6 = r0.copyTo(r1, r2, r4)
            return r6
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer r0, okio.Buffer r1, long r2, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            r2 = 0
        L6:
            okio.Buffer r0 = r0.copyTo(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer r6, okio.Buffer r7, long r8, long r10, int r12, java.lang.Object r13) {
            r12 = r12 & 2
            if (r12 == 0) goto L6
            r8 = 0
        L6:
            r2 = r8
            r0 = r6
            r1 = r7
            r4 = r10
            okio.Buffer r6 = r0.copyTo(r1, r2, r4)
            return r6
    }

    private final okio.ByteString digest(java.lang.String r6) {
            r5 = this;
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)
            okio.Segment r0 = r5.head
            if (r0 == 0) goto L29
            byte[] r1 = r0.data
            int r2 = r0.pos
            int r3 = r0.limit
            int r3 = r3 - r2
            r6.update(r1, r2, r3)
            okio.Segment r1 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
        L17:
            if (r1 == r0) goto L29
            byte[] r2 = r1.data
            int r3 = r1.pos
            int r4 = r1.limit
            int r4 = r4 - r3
            r6.update(r2, r3, r4)
            okio.Segment r1 = r1.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            goto L17
        L29:
            okio.ByteString r0 = new okio.ByteString
            byte[] r6 = r6.digest()
            java.lang.String r1 = "messageDigest.digest()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            r0.<init>(r6)
            return r0
    }

    private final okio.ByteString hmac(java.lang.String r5, okio.ByteString r6) {
            r4 = this;
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r5)     // Catch: java.security.InvalidKeyException -> L44
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L44
            byte[] r6 = r6.internalArray$okio()     // Catch: java.security.InvalidKeyException -> L44
            r1.<init>(r6, r5)     // Catch: java.security.InvalidKeyException -> L44
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L44
            okio.Segment r5 = r4.head     // Catch: java.security.InvalidKeyException -> L44
            if (r5 == 0) goto L35
            byte[] r6 = r5.data     // Catch: java.security.InvalidKeyException -> L44
            int r1 = r5.pos     // Catch: java.security.InvalidKeyException -> L44
            int r2 = r5.limit     // Catch: java.security.InvalidKeyException -> L44
            int r2 = r2 - r1
            r0.update(r6, r1, r2)     // Catch: java.security.InvalidKeyException -> L44
            okio.Segment r6 = r5.next     // Catch: java.security.InvalidKeyException -> L44
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.security.InvalidKeyException -> L44
        L23:
            if (r6 == r5) goto L35
            byte[] r1 = r6.data     // Catch: java.security.InvalidKeyException -> L44
            int r2 = r6.pos     // Catch: java.security.InvalidKeyException -> L44
            int r3 = r6.limit     // Catch: java.security.InvalidKeyException -> L44
            int r3 = r3 - r2
            r0.update(r1, r2, r3)     // Catch: java.security.InvalidKeyException -> L44
            okio.Segment r6 = r6.next     // Catch: java.security.InvalidKeyException -> L44
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.security.InvalidKeyException -> L44
            goto L23
        L35:
            okio.ByteString r5 = new okio.ByteString     // Catch: java.security.InvalidKeyException -> L44
            byte[] r6 = r0.doFinal()     // Catch: java.security.InvalidKeyException -> L44
            java.lang.String r0 = "mac.doFinal()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)     // Catch: java.security.InvalidKeyException -> L44
            r5.<init>(r6)     // Catch: java.security.InvalidKeyException -> L44
            return r5
        L44:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
    }

    public static /* synthetic */ okio.Buffer.UnsafeCursor readAndWriteUnsafe$default(okio.Buffer r0, okio.Buffer.UnsafeCursor r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L9
            okio.Buffer$UnsafeCursor r1 = new okio.Buffer$UnsafeCursor
            r1.<init>()
        L9:
            okio.Buffer$UnsafeCursor r0 = r0.readAndWriteUnsafe(r1)
            return r0
    }

    private final void readFrom(java.io.InputStream r5, long r6, boolean r8) throws java.io.IOException {
            r4 = this;
        L0:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto La
            if (r8 == 0) goto L9
            goto La
        L9:
            return
        La:
            r0 = 1
            okio.Segment r0 = r4.writableSegment$okio(r0)
            int r1 = r0.limit
            int r1 = 8192 - r1
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r6, r1)
            int r2 = (int) r1
            byte[] r1 = r0.data
            int r3 = r0.limit
            int r1 = r5.read(r1, r3, r2)
            r2 = -1
            if (r1 != r2) goto L3c
            int r5 = r0.pos
            int r6 = r0.limit
            if (r5 != r6) goto L33
            okio.Segment r5 = r0.pop()
            r4.head = r5
            okio.SegmentPool.recycle(r0)
        L33:
            if (r8 == 0) goto L36
            return
        L36:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L3c:
            int r2 = r0.limit
            int r2 = r2 + r1
            r0.limit = r2
            long r2 = r4.size
            long r0 = (long) r1
            long r2 = r2 + r0
            r4.size = r2
            long r6 = r6 - r0
            goto L0
    }

    public static /* synthetic */ okio.Buffer.UnsafeCursor readUnsafe$default(okio.Buffer r0, okio.Buffer.UnsafeCursor r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L9
            okio.Buffer$UnsafeCursor r1 = new okio.Buffer$UnsafeCursor
            r1.<init>()
        L9:
            okio.Buffer$UnsafeCursor r0 = r0.readUnsafe(r1)
            return r0
    }

    public static /* synthetic */ okio.Buffer writeTo$default(okio.Buffer r0, java.io.OutputStream r1, long r2, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            long r2 = r0.size
        L6:
            okio.Buffer r0 = r0.writeTo(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @kotlin.ReplaceWith(expression = "this[index]", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_getByte")
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m2015deprecated_getByte(long r1) {
            r0 = this;
            byte r1 = r0.getByte(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_size")
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final long m2016deprecated_size() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer buffer() {
            r0 = this;
            return r0
    }

    public final void clear() {
            r2 = this;
            long r0 = r2.size()
            r2.skip(r0)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            okio.Buffer r0 = r1.m2017clone()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public okio.Buffer m2017clone() {
            r1 = this;
            okio.Buffer r0 = r1.copy()
            return r0
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    public final long completeSegmentByteCount() {
            r5 = this;
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            goto L25
        Lb:
            okio.Segment r2 = r5.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Segment r2 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.limit
            r4 = 8192(0x2000, float:1.148E-41)
            if (r3 >= r4) goto L24
            boolean r4 = r2.owner
            if (r4 == 0) goto L24
            int r2 = r2.pos
            int r3 = r3 - r2
            long r2 = (long) r3
            long r0 = r0 - r2
        L24:
            r2 = r0
        L25:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Buffer copy() {
            r6 = this;
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            long r1 = r6.size()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L10
            goto L3c
        L10:
            okio.Segment r1 = r6.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.Segment r2 = r1.sharedCopy()
            r0.head = r2
            r2.prev = r2
            r2.next = r2
            okio.Segment r3 = r1.next
        L21:
            if (r3 == r1) goto L35
            okio.Segment r4 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r5 = r3.sharedCopy()
            r4.push(r5)
            okio.Segment r3 = r3.next
            goto L21
        L35:
            long r1 = r6.size()
            r0.setSize$okio(r1)
        L3c:
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.Buffer copyTo(@org.jetbrains.annotations.NotNull java.io.OutputStream r9) throws java.io.IOException {
            r8 = this;
            r2 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r0 = r8
            r1 = r9
            okio.Buffer r9 = copyTo$default(r0, r1, r2, r4, r6, r7)
            return r9
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.Buffer copyTo(@org.jetbrains.annotations.NotNull java.io.OutputStream r9, long r10) throws java.io.IOException {
            r8 = this;
            r4 = 0
            r6 = 4
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            okio.Buffer r9 = copyTo$default(r0, r1, r2, r4, r6, r7)
            return r9
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.Buffer copyTo(@org.jetbrains.annotations.NotNull java.io.OutputStream r9, long r10, long r12) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r1 = r8.size
            r3 = r10
            r5 = r12
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            return r8
        L13:
            okio.Segment r2 = r8.head
        L15:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.limit
            int r4 = r2.pos
            int r5 = r3 - r4
            long r5 = (long) r5
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 < 0) goto L29
            int r3 = r3 - r4
            long r3 = (long) r3
            long r10 = r10 - r3
            okio.Segment r2 = r2.next
            goto L15
        L29:
            int r3 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r3 <= 0) goto L49
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.pos
            long r3 = (long) r3
            long r3 = r3 + r10
            int r10 = (int) r3
            int r11 = r2.limit
            int r11 = r11 - r10
            long r3 = (long) r11
            long r3 = java.lang.Math.min(r3, r12)
            int r11 = (int) r3
            byte[] r3 = r2.data
            r9.write(r3, r10, r11)
            long r10 = (long) r11
            long r12 = r12 - r10
            okio.Segment r2 = r2.next
            r10 = r0
            goto L29
        L49:
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Buffer copyTo(@org.jetbrains.annotations.NotNull okio.Buffer r9, long r10) {
            r8 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r0 = r8.size
            long r6 = r0 - r10
            r2 = r8
            r3 = r9
            r4 = r10
            okio.Buffer r9 = r2.copyTo(r3, r4, r6)
            return r9
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Buffer copyTo(@org.jetbrains.annotations.NotNull okio.Buffer r9, long r10, long r12) {
            r8 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r1 = r8.size()
            r3 = r10
            r5 = r12
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 != 0) goto L15
            goto L6f
        L15:
            long r2 = r9.size()
            long r2 = r2 + r12
            r9.setSize$okio(r2)
            okio.Segment r2 = r8.head
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.limit
            int r4 = r2.pos
            int r5 = r3 - r4
            long r5 = (long) r5
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 < 0) goto L33
            int r3 = r3 - r4
            long r3 = (long) r3
            long r10 = r10 - r3
            okio.Segment r2 = r2.next
            goto L1f
        L33:
            int r3 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r3 <= 0) goto L6f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Segment r3 = r2.sharedCopy()
            int r4 = r3.pos
            int r11 = (int) r10
            int r4 = r4 + r11
            r3.pos = r4
            int r10 = (int) r12
            int r4 = r4 + r10
            int r10 = r3.limit
            int r10 = java.lang.Math.min(r4, r10)
            r3.limit = r10
            okio.Segment r10 = r9.head
            if (r10 != 0) goto L59
            r3.prev = r3
            r3.next = r3
            r9.head = r3
            goto L64
        L59:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            okio.Segment r10 = r10.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            r10.push(r3)
        L64:
            int r10 = r3.limit
            int r11 = r3.pos
            int r10 = r10 - r11
            long r10 = (long) r10
            long r12 = r12 - r10
            okio.Segment r2 = r2.next
            r10 = r0
            goto L33
        L6f:
            return r8
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer emit() {
            r0 = this;
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink emit() {
            r1 = this;
            okio.Buffer r0 = r1.emit()
            return r0
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer emitCompleteSegments() {
            r0 = this;
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink emitCompleteSegments() {
            r1 = this;
            okio.Buffer r0 = r1.emitCompleteSegments()
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Lb
        L8:
            r2 = 1
            goto L82
        Lb:
            boolean r4 = r1 instanceof okio.Buffer
            if (r4 != 0) goto L11
            goto L82
        L11:
            long r4 = r20.size()
            okio.Buffer r1 = (okio.Buffer) r1
            long r6 = r1.size()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L20
            goto L82
        L20:
            long r4 = r20.size()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L8
        L2b:
            okio.Segment r4 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Segment r1 = r1.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r5 = r4.pos
            int r8 = r1.pos
            r9 = r6
        L3a:
            long r11 = r20.size()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L8
            int r11 = r4.limit
            int r11 = r11 - r5
            int r12 = r1.limit
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L4e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L6a
            byte[] r15 = r4.data
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.data
            int r17 = r8 + 1
            r8 = r15[r8]
            if (r5 == r8) goto L61
            goto L82
        L61:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L4e
        L6a:
            int r13 = r4.limit
            if (r5 != r13) goto L75
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r5 = r4.pos
        L75:
            int r13 = r1.limit
            if (r8 != r13) goto L80
            okio.Segment r1 = r1.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r8 = r1.pos
        L80:
            long r9 = r9 + r11
            goto L3a
        L82:
            return r2
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
            r5 = this;
            long r0 = r5.size
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
            r0 = this;
            return
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer getBuffer() {
            r0 = this;
            return r0
    }

    @kotlin.jvm.JvmName(name = "getByte")
    public final byte getByte(long r7) {
            r6 = this;
            long r0 = r6.size()
            r4 = 1
            r2 = r7
            okio.Util.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r0 = r6.head
            if (r0 == 0) goto L5c
            long r1 = r6.size()
            long r1 = r1 - r7
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 >= 0) goto L3a
            long r1 = r6.size()
        L1b:
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L2c
            okio.Segment r0 = r0.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r3 = r0.limit
            int r4 = r0.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            long r1 = r1 - r3
            goto L1b
        L2c:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            byte[] r3 = r0.data
            int r0 = r0.pos
            long r4 = (long) r0
            long r4 = r4 + r7
            long r4 = r4 - r1
            int r7 = (int) r4
            r7 = r3[r7]
            goto L54
        L3a:
            r1 = 0
        L3c:
            int r3 = r0.limit
            int r4 = r0.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = r3 + r1
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L55
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            byte[] r3 = r0.data
            int r0 = r0.pos
            long r4 = (long) r0
            long r4 = r4 + r7
            long r4 = r4 - r1
            int r7 = (int) r4
            r7 = r3[r7]
        L54:
            return r7
        L55:
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r3
            goto L3c
        L5c:
            r7 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            throw r7
    }

    public int hashCode() {
            r5 = this;
            okio.Segment r0 = r5.head
            if (r0 == 0) goto L1f
            r1 = 1
        L5:
            int r2 = r0.pos
            int r3 = r0.limit
        L9:
            if (r2 >= r3) goto L15
            int r1 = r1 * 31
            byte[] r4 = r0.data
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto L9
        L15:
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okio.Segment r2 = r5.head
            if (r0 != r2) goto L5
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString hmacSha1(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA1"
            okio.ByteString r2 = r1.hmac(r0, r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString hmacSha256(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA256"
            okio.ByteString r2 = r1.hmac(r0, r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString hmacSha512(@org.jetbrains.annotations.NotNull okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA512"
            okio.ByteString r2 = r1.hmac(r0, r2)
            return r2
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
    public long indexOf(byte r11, long r12, long r14) {
            r10 = this;
            r0 = 0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L7
            goto Ld
        L7:
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 < 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto Lc1
            long r2 = r10.size()
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            long r14 = r10.size()
        L1c:
            r2 = -1
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 != 0) goto L24
            goto Lc0
        L24:
            okio.Segment r4 = r10.head
            if (r4 == 0) goto Lc0
            long r5 = r10.size()
            long r5 = r5 - r12
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 >= 0) goto L77
            long r0 = r10.size()
        L35:
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 <= 0) goto L46
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r0 = r0 - r5
            goto L35
        L46:
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 >= 0) goto Lc0
            byte[] r5 = r4.data
            int r6 = r4.limit
            long r6 = (long) r6
            int r8 = r4.pos
            long r8 = (long) r8
            long r8 = r8 + r14
            long r8 = r8 - r0
            long r6 = java.lang.Math.min(r6, r8)
            int r7 = (int) r6
            int r6 = r4.pos
            long r8 = (long) r6
            long r8 = r8 + r12
            long r8 = r8 - r0
            int r12 = (int) r8
        L5f:
            if (r12 >= r7) goto L69
            r13 = r5[r12]
            if (r13 != r11) goto L66
            goto La1
        L66:
            int r12 = r12 + 1
            goto L5f
        L69:
            int r12 = r4.limit
            int r13 = r4.pos
            int r12 = r12 - r13
            long r12 = (long) r12
            long r0 = r0 + r12
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r12 = r0
            goto L46
        L77:
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r0
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 <= 0) goto Lb9
        L82:
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 >= 0) goto Lc0
            byte[] r5 = r4.data
            int r6 = r4.limit
            long r6 = (long) r6
            int r8 = r4.pos
            long r8 = (long) r8
            long r8 = r8 + r14
            long r8 = r8 - r0
            long r6 = java.lang.Math.min(r6, r8)
            int r7 = (int) r6
            int r6 = r4.pos
            long r8 = (long) r6
            long r8 = r8 + r12
            long r8 = r8 - r0
            int r12 = (int) r8
        L9b:
            if (r12 >= r7) goto Lab
            r13 = r5[r12]
            if (r13 != r11) goto La8
        La1:
            int r11 = r4.pos
            int r12 = r12 - r11
            long r11 = (long) r12
            long r2 = r11 + r0
            goto Lc0
        La8:
            int r12 = r12 + 1
            goto L9b
        Lab:
            int r12 = r4.limit
            int r13 = r4.pos
            int r12 = r12 - r13
            long r12 = (long) r12
            long r0 = r0 + r12
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r12 = r0
            goto L82
        Lb9:
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0 = r5
            goto L77
        Lc0:
            return r2
        Lc1:
            java.lang.String r11 = "size="
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            long r0 = r10.size()
            r11.append(r0)
            java.lang.String r0 = " fromIndex="
            r11.append(r0)
            r11.append(r12)
            java.lang.String r12 = " toIndex="
            r11.append(r12)
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    @Override // okio.BufferedSource
    public long indexOf(@org.jetbrains.annotations.NotNull okio.ByteString r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r0 = r2.indexOf(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(@org.jetbrains.annotations.NotNull okio.ByteString r13, long r14) throws java.io.IOException {
            r12 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            int r0 = r13.size()
            r1 = 0
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L100
            r2 = 0
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 < 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto Lf0
            okio.Segment r0 = r12.head
            if (r0 == 0) goto Led
            long r4 = r12.size()
            long r4 = r4 - r14
            r6 = 1
            int r8 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r8 >= 0) goto L8b
            long r2 = r12.size()
        L2f:
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 <= 0) goto L40
            okio.Segment r0 = r0.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r4 = r0.limit
            int r5 = r0.pos
            int r4 = r4 - r5
            long r4 = (long) r4
            long r2 = r2 - r4
            goto L2f
        L40:
            byte[] r4 = r13.internalArray$okio()
            r1 = r4[r1]
            int r13 = r13.size()
            long r8 = r12.size()
            long r10 = (long) r13
            long r8 = r8 - r10
            long r8 = r8 + r6
        L51:
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 >= 0) goto Led
            byte[] r5 = r0.data
            int r6 = r0.limit
            int r7 = r0.pos
            long r10 = (long) r7
            long r10 = r10 + r8
            long r10 = r10 - r2
            long r6 = (long) r6
            long r6 = java.lang.Math.min(r6, r10)
            int r7 = (int) r6
            int r6 = r0.pos
            long r10 = (long) r6
            long r10 = r10 + r14
            long r10 = r10 - r2
            int r14 = (int) r10
        L6a:
            if (r14 >= r7) goto L7d
            r15 = r5[r14]
            if (r15 != r1) goto L7a
            int r15 = r14 + 1
            r6 = 1
            boolean r15 = okio.internal.BufferKt.rangeEquals(r0, r15, r4, r6, r13)
            if (r15 == 0) goto L7a
            goto Lcf
        L7a:
            int r14 = r14 + 1
            goto L6a
        L7d:
            int r14 = r0.limit
            int r15 = r0.pos
            int r14 = r14 - r15
            long r14 = (long) r14
            long r2 = r2 + r14
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r14 = r2
            goto L51
        L8b:
            int r4 = r0.limit
            int r5 = r0.pos
            int r4 = r4 - r5
            long r4 = (long) r4
            long r4 = r4 + r2
            int r8 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r8 <= 0) goto Le6
            byte[] r4 = r13.internalArray$okio()
            r1 = r4[r1]
            int r13 = r13.size()
            long r8 = r12.size()
            long r10 = (long) r13
            long r8 = r8 - r10
            long r8 = r8 + r6
        La7:
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 >= 0) goto Led
            byte[] r5 = r0.data
            int r6 = r0.limit
            int r7 = r0.pos
            long r10 = (long) r7
            long r10 = r10 + r8
            long r10 = r10 - r2
            long r6 = (long) r6
            long r6 = java.lang.Math.min(r6, r10)
            int r7 = (int) r6
            int r6 = r0.pos
            long r10 = (long) r6
            long r10 = r10 + r14
            long r10 = r10 - r2
            int r14 = (int) r10
        Lc0:
            if (r14 >= r7) goto Ld8
            r15 = r5[r14]
            if (r15 != r1) goto Ld5
            int r15 = r14 + 1
            r6 = 1
            boolean r15 = okio.internal.BufferKt.rangeEquals(r0, r15, r4, r6, r13)
            if (r15 == 0) goto Ld5
        Lcf:
            int r13 = r0.pos
            int r14 = r14 - r13
            long r13 = (long) r14
            long r13 = r13 + r2
            goto Lef
        Ld5:
            int r14 = r14 + 1
            goto Lc0
        Ld8:
            int r14 = r0.limit
            int r15 = r0.pos
            int r14 = r14 - r15
            long r14 = (long) r14
            long r2 = r2 + r14
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r14 = r2
            goto La7
        Le6:
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r2 = r4
            goto L8b
        Led:
            r13 = -1
        Lef:
            return r13
        Lf0:
            java.lang.String r13 = "fromIndex < 0: "
            java.lang.String r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13, r14)
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L100:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "bytes is empty"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
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
    public long indexOfElement(@org.jetbrains.annotations.NotNull okio.ByteString r12, long r13) {
            r11 = this;
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            r2 = 0
            r3 = 1
            int r4 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r4 < 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L138
            okio.Segment r4 = r11.head
            r5 = -1
            if (r4 == 0) goto L137
            long r7 = r11.size()
            long r7 = r7 - r13
            r9 = 2
            int r10 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r10 >= 0) goto Laa
            long r0 = r11.size()
        L26:
            int r7 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r7 <= 0) goto L37
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r7 = r4.limit
            int r8 = r4.pos
            int r7 = r7 - r8
            long r7 = (long) r7
            long r0 = r0 - r7
            goto L26
        L37:
            int r7 = r12.size()
            if (r7 != r9) goto L72
            byte r2 = r12.getByte(r2)
            byte r12 = r12.getByte(r3)
        L45:
            long r7 = r11.size()
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 >= 0) goto L137
            byte[] r3 = r4.data
            int r7 = r4.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r4.limit
        L57:
            if (r13 >= r14) goto L64
            r7 = r3[r13]
            if (r7 == r2) goto Le1
            if (r7 != r12) goto L61
            goto Le1
        L61:
            int r13 = r13 + 1
            goto L57
        L64:
            int r13 = r4.limit
            int r14 = r4.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r13 = r0
            goto L45
        L72:
            byte[] r12 = r12.internalArray$okio()
        L76:
            long r2 = r11.size()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L137
            byte[] r2 = r4.data
            int r3 = r4.pos
            long r7 = (long) r3
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r4.limit
        L88:
            if (r13 >= r14) goto L9c
            r3 = r2[r13]
            int r7 = r12.length
            r8 = 0
        L8e:
            if (r8 >= r7) goto L99
            r9 = r12[r8]
            if (r3 != r9) goto L96
            goto L114
        L96:
            int r8 = r8 + 1
            goto L8e
        L99:
            int r13 = r13 + 1
            goto L88
        L9c:
            int r13 = r4.limit
            int r14 = r4.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r13 = r0
            goto L76
        Laa:
            int r7 = r4.limit
            int r8 = r4.pos
            int r7 = r7 - r8
            long r7 = (long) r7
            long r7 = r7 + r0
            int r10 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r10 <= 0) goto L12f
            int r7 = r12.size()
            if (r7 != r9) goto Lf2
            byte r2 = r12.getByte(r2)
            byte r12 = r12.getByte(r3)
        Lc3:
            long r7 = r11.size()
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 >= 0) goto L137
            byte[] r3 = r4.data
            int r7 = r4.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r4.limit
        Ld5:
            if (r13 >= r14) goto Le4
            r7 = r3[r13]
            if (r7 == r2) goto Le1
            if (r7 != r12) goto Lde
            goto Le1
        Lde:
            int r13 = r13 + 1
            goto Ld5
        Le1:
            int r12 = r4.pos
            goto L116
        Le4:
            int r13 = r4.limit
            int r14 = r4.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r13 = r0
            goto Lc3
        Lf2:
            byte[] r12 = r12.internalArray$okio()
        Lf6:
            long r2 = r11.size()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L137
            byte[] r2 = r4.data
            int r3 = r4.pos
            long r7 = (long) r3
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r4.limit
        L108:
            if (r13 >= r14) goto L121
            r3 = r2[r13]
            int r7 = r12.length
            r8 = 0
        L10e:
            if (r8 >= r7) goto L11e
            r9 = r12[r8]
            if (r3 != r9) goto L11b
        L114:
            int r12 = r4.pos
        L116:
            int r13 = r13 - r12
            long r12 = (long) r13
            long r5 = r12 + r0
            goto L137
        L11b:
            int r8 = r8 + 1
            goto L10e
        L11e:
            int r13 = r13 + 1
            goto L108
        L121:
            int r13 = r4.limit
            int r14 = r4.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r13 = r0
            goto Lf6
        L12f:
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0 = r7
            goto Laa
        L137:
            return r5
        L138:
            java.lang.String r12 = "fromIndex < 0: "
            java.lang.String r12 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12, r13)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.io.InputStream inputStream() {
            r1 = this;
            okio.Buffer$inputStream$1 r0 = new okio.Buffer$inputStream$1
            r0.<init>(r1)
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            r0 = 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString md5() {
            r1 = this;
            java.lang.String r0 = "MD5"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public java.io.OutputStream outputStream() {
            r1 = this;
            okio.Buffer$outputStream$1 r0 = new okio.Buffer$outputStream$1
            r0.<init>(r1)
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
    public boolean rangeEquals(long r7, @org.jetbrains.annotations.NotNull okio.ByteString r9, int r10, int r11) {
            r6 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L38
            if (r10 < 0) goto L38
            if (r11 < 0) goto L38
            long r1 = r6.size()
            long r1 = r1 - r7
            long r3 = (long) r11
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L38
            int r1 = r9.size()
            int r1 = r1 - r10
            if (r1 >= r11) goto L22
            goto L38
        L22:
            r1 = 0
        L23:
            if (r1 >= r11) goto L37
            long r2 = (long) r1
            long r2 = r2 + r7
            byte r2 = r6.getByte(r2)
            int r3 = r10 + r1
            byte r3 = r9.getByte(r3)
            if (r2 == r3) goto L34
            goto L38
        L34:
            int r1 = r1 + 1
            goto L23
        L37:
            r0 = 1
        L38:
            return r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okio.Segment r0 = r6.head
            if (r0 == 0) goto L36
            int r1 = r7.remaining()
            int r2 = r0.limit
            int r3 = r0.pos
            int r2 = r2 - r3
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.data
            int r3 = r0.pos
            r7.put(r2, r3, r1)
            int r7 = r0.pos
            int r7 = r7 + r1
            r0.pos = r7
            long r2 = r6.size
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.size = r2
            int r2 = r0.limit
            if (r7 != r2) goto L35
            okio.Segment r7 = r0.pop()
            r6.head = r7
            okio.SegmentPool.recycle(r0)
        L35:
            return r1
        L36:
            r7 = -1
            return r7
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
    public int read(@org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r7.head
            if (r0 == 0) goto L40
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            int r10 = java.lang.Math.min(r10, r1)
            byte[] r1 = r0.data
            int r2 = r0.pos
            int r3 = r2 + r10
            kotlin.collections.ArraysKt.copyInto(r1, r8, r9, r2, r3)
            int r8 = r0.pos
            int r8 = r8 + r10
            r0.pos = r8
            long r8 = r7.size()
            long r1 = (long) r10
            long r8 = r8 - r1
            r7.setSize$okio(r8)
            int r8 = r0.pos
            int r9 = r0.limit
            if (r8 != r9) goto L41
            okio.Segment r8 = r0.pop()
            r7.head = r8
            okio.SegmentPool.recycle(r0)
            goto L41
        L40:
            r10 = -1
        L41:
            return r10
    }

    @Override // okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r6, long r7) {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L2c
            long r2 = r5.size()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L1b
            r6 = -1
            goto L2b
        L1b:
            long r0 = r5.size()
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L27
            long r7 = r5.size()
        L27:
            r6.write(r5, r7)
            r6 = r7
        L2b:
            return r6
        L2c:
            java.lang.String r6 = "byteCount < 0: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    @Override // okio.BufferedSource
    public long readAll(@org.jetbrains.annotations.NotNull okio.Sink r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L12
            r6.write(r5, r0)
        L12:
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.Buffer.UnsafeCursor readAndWriteUnsafe() {
            r2 = this;
            r0 = 0
            r1 = 1
            okio.Buffer$UnsafeCursor r0 = readAndWriteUnsafe$default(r2, r0, r1, r0)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.Buffer.UnsafeCursor readAndWriteUnsafe(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r2) {
            r1 = this;
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer$UnsafeCursor r2 = okio.internal.BufferKt.commonReadAndWriteUnsafe(r1, r2)
            return r2
    }

    @Override // okio.BufferedSource
    public byte readByte() throws java.io.EOFException {
            r9 = this;
            long r0 = r9.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L32
            okio.Segment r0 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r2 = r0.limit
            byte[] r3 = r0.data
            int r4 = r1 + 1
            r1 = r3[r1]
            long r5 = r9.size()
            r7 = 1
            long r5 = r5 - r7
            r9.setSize$okio(r5)
            if (r4 != r2) goto L2f
            okio.Segment r2 = r0.pop()
            r9.head = r2
            okio.SegmentPool.recycle(r0)
            goto L31
        L2f:
            r0.pos = r4
        L31:
            return r1
        L32:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public byte[] readByteArray() {
            r2 = this;
            long r0 = r2.size()
            byte[] r0 = r2.readByteArray(r0)
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public byte[] readByteArray(long r4) throws java.io.EOFException {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L10
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L28
            long r0 = r3.size()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L22
            int r5 = (int) r4
            byte[] r4 = new byte[r5]
            r3.readFully(r4)
            return r4
        L22:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L28:
            java.lang.String r0 = "byteCount: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public okio.ByteString readByteString() {
            r2 = this;
            long r0 = r2.size()
            okio.ByteString r0 = r2.readByteString(r0)
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public okio.ByteString readByteString(long r4) throws java.io.EOFException {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L10
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L3b
            long r0 = r3.size()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L35
            r0 = 4096(0x1000, float:5.74E-42)
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L2b
            int r0 = (int) r4
            okio.ByteString r0 = r3.snapshot(r0)
            r3.skip(r4)
            goto L34
        L2b:
            okio.ByteString r0 = new okio.ByteString
            byte[] r4 = r3.readByteArray(r4)
            r0.<init>(r4)
        L34:
            return r0
        L35:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L3b:
            java.lang.String r0 = "byteCount: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws java.io.EOFException {
            r17 = this;
            r0 = r17
            long r1 = r17.size()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lb9
            r1 = -7
            r5 = 0
            r6 = 0
            r7 = 0
        L11:
            okio.Segment r8 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            byte[] r9 = r8.data
            int r10 = r8.pos
            int r11 = r8.limit
        L1c:
            if (r10 >= r11) goto L97
            r12 = r9[r10]
            r13 = 48
            byte r13 = (byte) r13
            if (r12 < r13) goto L6c
            r14 = 57
            byte r14 = (byte) r14
            if (r12 > r14) goto L6c
            int r13 = r13 - r12
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 < 0) goto L43
            if (r16 != 0) goto L3c
            long r14 = (long) r13
            int r16 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r16 >= 0) goto L3c
            goto L43
        L3c:
            r14 = 10
            long r3 = r3 * r14
            long r12 = (long) r13
            long r3 = r3 + r12
            goto L77
        L43:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r1 = r1.writeDecimalLong(r3)
            okio.Buffer r1 = r1.writeByte(r12)
            if (r6 != 0) goto L55
            r1.readByte()
        L55:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = "Number too large: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r1 = r1.readUtf8()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L6c:
            r13 = 45
            byte r13 = (byte) r13
            if (r12 != r13) goto L7c
            if (r5 != 0) goto L7c
            r12 = 1
            long r1 = r1 - r12
            r6 = 1
        L77:
            int r10 = r10 + 1
            int r5 = r5 + 1
            goto L1c
        L7c:
            if (r5 == 0) goto L80
            r7 = 1
            goto L97
        L80:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r3 = okio.Util.toHexString(r12)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L97:
            if (r10 != r11) goto La3
            okio.Segment r9 = r8.pop()
            r0.head = r9
            okio.SegmentPool.recycle(r8)
            goto La5
        La3:
            r8.pos = r10
        La5:
            if (r7 != 0) goto Lab
            okio.Segment r8 = r0.head
            if (r8 != 0) goto L11
        Lab:
            long r1 = r17.size()
            long r7 = (long) r5
            long r1 = r1 - r7
            r0.setSize$okio(r1)
            if (r6 == 0) goto Lb7
            goto Lb8
        Lb7:
            long r3 = -r3
        Lb8:
            return r3
        Lb9:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Buffer readFrom(@org.jetbrains.annotations.NotNull java.io.InputStream r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 1
            r3.readFrom(r4, r0, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Buffer readFrom(@org.jetbrains.annotations.NotNull java.io.InputStream r5, long r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 < 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L15
            r4.readFrom(r5, r6, r0)
            return r4
        L15:
            java.lang.String r5 = "byteCount < 0: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    @Override // okio.BufferedSource
    public void readFully(@org.jetbrains.annotations.NotNull okio.Buffer r4, long r5) throws java.io.EOFException {
            r3 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = r3.size()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L11
            r4.write(r3, r5)
            return
        L11:
            long r5 = r3.size()
            r4.write(r3, r5)
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
    }

    @Override // okio.BufferedSource
    public void readFully(@org.jetbrains.annotations.NotNull byte[] r4) throws java.io.EOFException {
            r3 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
        L6:
            int r1 = r4.length
            if (r0 >= r1) goto L1a
            int r1 = r4.length
            int r1 = r1 - r0
            int r1 = r3.read(r4, r0, r1)
            r2 = -1
            if (r1 == r2) goto L14
            int r0 = r0 + r1
            goto L6
        L14:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L1a:
            return
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Laf
            r0 = 0
            r1 = 0
            r4 = r2
        Ld:
            okio.Segment r6 = r15.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L91
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L42
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L34
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L34
            goto L3e
        L34:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L76
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L76
        L3e:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L42:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L52
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L52:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L76:
            if (r0 == 0) goto L7a
            r1 = 1
            goto L91
        L7a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = okio.Util.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L91:
            if (r8 != r9) goto L9d
            okio.Segment r7 = r6.pop()
            r15.head = r7
            okio.SegmentPool.recycle(r6)
            goto L9f
        L9d:
            r6.pos = r8
        L9f:
            if (r1 != 0) goto La5
            okio.Segment r6 = r15.head
            if (r6 != 0) goto Ld
        La5:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.setSize$okio(r1)
            return r4
        Laf:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    public int readInt() throws java.io.EOFException {
            r8 = this;
            long r0 = r8.size()
            r2 = 4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L77
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L3c
            byte r0 = r8.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            byte r1 = r8.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            byte r1 = r8.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r1 = r8.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            goto L76
        L3c:
            byte[] r5 = r0.data
            int r6 = r1 + 1
            r1 = r5[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            int r7 = r6 + 1
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r1 = r1 | r6
            int r6 = r7 + 1
            r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r1 = r1 | r7
            int r7 = r6 + 1
            r5 = r5[r6]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r1 = r1 | r5
            long r5 = r8.size()
            long r5 = r5 - r2
            r8.setSize$okio(r5)
            if (r7 != r4) goto L73
            okio.Segment r2 = r0.pop()
            r8.head = r2
            okio.SegmentPool.recycle(r0)
            goto L75
        L73:
            r0.pos = r7
        L75:
            r0 = r1
        L76:
            return r0
        L77:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws java.io.EOFException {
            r1 = this;
            int r0 = r1.readInt()
            int r0 = okio.Util.reverseBytes(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long readLong() throws java.io.EOFException {
            r14 = this;
            long r0 = r14.size()
            r2 = 8
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L98
            okio.Segment r0 = r14.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            r7 = 32
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 >= 0) goto L30
            int r0 = r14.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = r0 << r7
            int r4 = r14.readInt()
            long r4 = (long) r4
            long r2 = r2 & r4
            long r0 = r0 | r2
            goto L97
        L30:
            byte[] r5 = r0.data
            int r6 = r1 + 1
            r1 = r5[r1]
            long r8 = (long) r1
            r10 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r10
            r1 = 56
            long r8 = r8 << r1
            int r1 = r6 + 1
            r6 = r5[r6]
            long r12 = (long) r6
            long r12 = r12 & r10
            r6 = 48
            long r12 = r12 << r6
            long r8 = r8 | r12
            int r6 = r1 + 1
            r1 = r5[r1]
            long r12 = (long) r1
            long r12 = r12 & r10
            r1 = 40
            long r12 = r12 << r1
            long r8 = r8 | r12
            int r1 = r6 + 1
            r6 = r5[r6]
            long r12 = (long) r6
            long r12 = r12 & r10
            long r6 = r12 << r7
            long r6 = r6 | r8
            int r8 = r1 + 1
            r1 = r5[r1]
            long r12 = (long) r1
            long r12 = r12 & r10
            r1 = 24
            long r12 = r12 << r1
            long r6 = r6 | r12
            int r1 = r8 + 1
            r8 = r5[r8]
            long r8 = (long) r8
            long r8 = r8 & r10
            r12 = 16
            long r8 = r8 << r12
            long r6 = r6 | r8
            int r8 = r1 + 1
            r1 = r5[r1]
            long r12 = (long) r1
            long r12 = r12 & r10
            r1 = 8
            long r12 = r12 << r1
            long r6 = r6 | r12
            int r1 = r8 + 1
            r5 = r5[r8]
            long r8 = (long) r5
            long r8 = r8 & r10
            long r5 = r6 | r8
            long r7 = r14.size()
            long r7 = r7 - r2
            r14.setSize$okio(r7)
            if (r1 != r4) goto L94
            okio.Segment r1 = r0.pop()
            r14.head = r1
            okio.SegmentPool.recycle(r0)
            goto L96
        L94:
            r0.pos = r1
        L96:
            r0 = r5
        L97:
            return r0
        L98:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws java.io.EOFException {
            r2 = this;
            long r0 = r2.readLong()
            long r0 = okio.Util.reverseBytes(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public short readShort() throws java.io.EOFException {
            r8 = this;
            long r0 = r8.size()
            r2 = 2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L52
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            r6 = 2
            if (r5 >= r6) goto L29
            byte r0 = r8.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r1 = r8.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            short r0 = (short) r0
            goto L51
        L29:
            byte[] r5 = r0.data
            int r6 = r1 + 1
            r1 = r5[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r7 = r6 + 1
            r5 = r5[r6]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r1 = r1 | r5
            long r5 = r8.size()
            long r5 = r5 - r2
            r8.setSize$okio(r5)
            if (r7 != r4) goto L4e
            okio.Segment r2 = r0.pop()
            r8.head = r2
            okio.SegmentPool.recycle(r0)
            goto L50
        L4e:
            r0.pos = r7
        L50:
            short r0 = (short) r1
        L51:
            return r0
        L52:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws java.io.EOFException {
            r1 = this;
            short r0 = r1.readShort()
            short r0 = okio.Util.reverseBytes(r0)
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.lang.String readString(long r8, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r10) throws java.io.EOFException {
            r7 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L15
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r0 = (long) r0
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 > 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L63
            long r0 = r7.size
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 < 0) goto L5d
            if (r2 != 0) goto L23
            java.lang.String r8 = ""
            return r8
        L23:
            okio.Segment r0 = r7.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            long r2 = (long) r1
            long r2 = r2 + r8
            int r4 = r0.limit
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3d
            byte[] r8 = r7.readByteArray(r8)
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8, r10)
            return r9
        L3d:
            byte[] r2 = r0.data
            int r3 = (int) r8
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2, r1, r3, r10)
            int r10 = r0.pos
            int r10 = r10 + r3
            r0.pos = r10
            long r1 = r7.size
            long r1 = r1 - r8
            r7.size = r1
            int r8 = r0.limit
            if (r10 != r8) goto L5c
            okio.Segment r8 = r0.pop()
            r7.head = r8
            okio.SegmentPool.recycle(r0)
        L5c:
            return r4
        L5d:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>()
            throw r8
        L63:
            java.lang.String r10 = "byteCount: "
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10, r8)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.lang.String readString(@org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = r2.size
            java.lang.String r3 = r2.readString(r0, r3)
            return r3
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.Buffer.UnsafeCursor readUnsafe() {
            r2 = this;
            r0 = 0
            r1 = 1
            okio.Buffer$UnsafeCursor r0 = readUnsafe$default(r2, r0, r1, r0)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.Buffer.UnsafeCursor readUnsafe(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r2) {
            r1 = this;
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer$UnsafeCursor r2 = okio.internal.BufferKt.commonReadUnsafe(r1, r2)
            return r2
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.lang.String readUtf8() {
            r3 = this;
            long r0 = r3.size
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            java.lang.String r0 = r3.readString(r0, r2)
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.lang.String readUtf8(long r2) throws java.io.EOFException {
            r1 = this;
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            java.lang.String r2 = r1.readString(r2, r0)
            return r2
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws java.io.EOFException {
            r12 = this;
            long r0 = r12.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Laa
            byte r0 = r12.getByte(r2)
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r1 != 0) goto L1d
            r1 = r0 & 127(0x7f, float:1.78E-43)
            r5 = 1
            r6 = 0
            goto L40
        L1d:
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L29
            r1 = r0 & 31
            r5 = 2
            r6 = 128(0x80, float:1.8E-43)
            goto L40
        L29:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r1 != r5) goto L35
            r1 = r0 & 15
            r5 = 3
            r6 = 2048(0x800, float:2.87E-42)
            goto L40
        L35:
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r5 = 240(0xf0, float:3.36E-43)
            if (r1 != r5) goto La4
            r1 = r0 & 7
            r5 = 4
            r6 = 65536(0x10000, float:9.1835E-41)
        L40:
            long r7 = r12.size()
            long r9 = (long) r5
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L7a
        L49:
            if (r2 >= r5) goto L60
            long r7 = (long) r2
            byte r0 = r12.getByte(r7)
            r11 = r0 & 192(0xc0, float:2.69E-43)
            if (r11 != r3) goto L5c
            int r1 = r1 << 6
            r0 = r0 & 63
            r1 = r1 | r0
            int r2 = r2 + 1
            goto L49
        L5c:
            r12.skip(r7)
            goto La9
        L60:
            r12.skip(r9)
            r0 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 <= r0) goto L69
            goto La9
        L69:
            r0 = 57343(0xdfff, float:8.0355E-41)
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r2 <= r1) goto L72
            goto L75
        L72:
            if (r0 < r1) goto L75
            goto La9
        L75:
            if (r1 >= r6) goto L78
            goto La9
        L78:
            r4 = r1
            goto La9
        L7a:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.String r2 = "size < "
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r2, r5, r3)
            long r3 = r12.size()
            r2.append(r3)
            java.lang.String r3 = " (to read code point prefixed 0x"
            r2.append(r3)
            java.lang.String r0 = okio.Util.toHexString(r0)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        La4:
            r0 = 1
            r12.skip(r0)
        La9:
            return r4
        Laa:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.Nullable
    public java.lang.String readUtf8Line() throws java.io.EOFException {
            r5 = this;
            r0 = 10
            byte r0 = (byte) r0
            long r0 = r5.indexOf(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L12
            java.lang.String r0 = okio.internal.BufferKt.readUtf8Line(r5, r0)
            goto L26
        L12:
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L25
            long r0 = r5.size()
            java.lang.String r0 = r5.readUtf8(r0)
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.lang.String readUtf8LineStrict() throws java.io.EOFException {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r0 = r2.readUtf8LineStrict(r0)
            return r0
    }

    @Override // okio.BufferedSource
    @org.jetbrains.annotations.NotNull
    public java.lang.String readUtf8LineStrict(long r12) throws java.io.EOFException {
            r11 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L95
            r0 = 1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 != 0) goto L17
            goto L19
        L17:
            long r2 = r12 + r0
        L19:
            r4 = 10
            byte r10 = (byte) r4
            r6 = 0
            r4 = r11
            r5 = r10
            r8 = r2
            long r4 = r4.indexOf(r5, r6, r8)
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L30
            java.lang.String r12 = okio.internal.BufferKt.readUtf8Line(r11, r4)
            goto L4d
        L30:
            long r4 = r11.size()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L4e
            long r0 = r2 - r0
            byte r0 = r11.getByte(r0)
            r1 = 13
            byte r1 = (byte) r1
            if (r0 != r1) goto L4e
            byte r0 = r11.getByte(r2)
            if (r0 != r10) goto L4e
            java.lang.String r12 = okio.internal.BufferKt.readUtf8Line(r11, r2)
        L4d:
            return r12
        L4e:
            okio.Buffer r6 = new okio.Buffer
            r6.<init>()
            r2 = 0
            r0 = 32
            long r4 = r11.size()
            long r0 = (long) r0
            long r4 = java.lang.Math.min(r0, r4)
            r0 = r11
            r1 = r6
            r0.copyTo(r1, r2, r4)
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.String r1 = "\\n not found: limit="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            long r2 = r11.size()
            long r12 = java.lang.Math.min(r2, r12)
            r1.append(r12)
            java.lang.String r12 = " content="
            r1.append(r12)
            okio.ByteString r12 = r6.readByteString()
            java.lang.String r12 = r12.hex()
            r1.append(r12)
            r12 = 8230(0x2026, float:1.1533E-41)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L95:
            java.lang.String r0 = "limit < 0: "
            java.lang.String r12 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r12)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
    }

    @Override // okio.BufferedSource
    public boolean request(long r4) {
            r3 = this;
            long r0 = r3.size
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L8
            r4 = 1
            goto L9
        L8:
            r4 = 0
        L9:
            return r4
    }

    @Override // okio.BufferedSource
    public void require(long r4) throws java.io.EOFException {
            r3 = this;
            long r0 = r3.size
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L7
            return
        L7:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
    }

    @Override // okio.BufferedSource
    public int select(@org.jetbrains.annotations.NotNull okio.Options r4) {
            r3 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 2
            r2 = 0
            int r0 = okio.internal.BufferKt.selectPrefix$default(r3, r4, r0, r1, r2)
            r1 = -1
            if (r0 != r1) goto L11
            r0 = -1
            goto L1f
        L11:
            okio.ByteString[] r4 = r4.getByteStrings$okio()
            r4 = r4[r0]
            int r4 = r4.size()
            long r1 = (long) r4
            r3.skip(r1)
        L1f:
            return r0
    }

    public final void setSize$okio(long r1) {
            r0 = this;
            r0.size = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString sha1() {
            r1 = this;
            java.lang.String r0 = "SHA-1"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString sha256() {
            r1 = this;
            java.lang.String r0 = "SHA-256"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString sha512() {
            r1 = this;
            java.lang.String r0 = "SHA-512"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    @kotlin.jvm.JvmName(name = "size")
    public final long size() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // okio.BufferedSource
    public void skip(long r8) throws java.io.EOFException {
            r7 = this;
        L0:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L38
            okio.Segment r0 = r7.head
            if (r0 == 0) goto L32
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r8, r1)
            int r2 = (int) r1
            long r3 = r7.size()
            long r5 = (long) r2
            long r3 = r3 - r5
            r7.setSize$okio(r3)
            long r8 = r8 - r5
            int r1 = r0.pos
            int r1 = r1 + r2
            r0.pos = r1
            int r2 = r0.limit
            if (r1 != r2) goto L0
            okio.Segment r1 = r0.pop()
            r7.head = r1
            okio.SegmentPool.recycle(r0)
            goto L0
        L32:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>()
            throw r8
        L38:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString snapshot() {
            r5 = this;
            long r0 = r5.size()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L1b
            long r0 = r5.size()
            int r1 = (int) r0
            okio.ByteString r0 = r5.snapshot(r1)
            return r0
        L1b:
            java.lang.String r0 = "size > Int.MAX_VALUE: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r5.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString snapshot(int r9) {
            r8 = this;
            if (r9 != 0) goto L5
            okio.ByteString r9 = okio.ByteString.EMPTY
            goto L5f
        L5:
            long r0 = r8.size()
            r2 = 0
            long r4 = (long) r9
            okio.Util.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r0 = r8.head
            r1 = 0
            r2 = 0
            r3 = 0
        L14:
            if (r2 >= r9) goto L2e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r4 = r0.limit
            int r5 = r0.pos
            if (r4 == r5) goto L26
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            okio.Segment r0 = r0.next
            goto L14
        L26:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r0 = "s.limit == s.pos"
            r9.<init>(r0)
            throw r9
        L2e:
            byte[][] r0 = new byte[r3][]
            int r2 = r3 * 2
            int[] r2 = new int[r2]
            okio.Segment r4 = r8.head
            r5 = r4
            r4 = 0
        L38:
            if (r1 >= r9) goto L5a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            byte[] r6 = r5.data
            r0[r4] = r6
            int r6 = r5.limit
            int r7 = r5.pos
            int r6 = r6 - r7
            int r1 = r1 + r6
            int r6 = java.lang.Math.min(r1, r9)
            r2[r4] = r6
            int r6 = r4 + r3
            int r7 = r5.pos
            r2[r6] = r7
            r6 = 1
            r5.shared = r6
            int r4 = r4 + r6
            okio.Segment r5 = r5.next
            goto L38
        L5a:
            okio.SegmentedByteString r9 = new okio.SegmentedByteString
            r9.<init>(r0, r2)
        L5f:
            return r9
    }

    @Override // okio.Source
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.Timeout r0 = okio.Timeout.NONE
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            okio.ByteString r0 = r1.snapshot()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Segment writableSegment$okio(int r4) {
            r3 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1 = 1
            if (r4 < r1) goto L8
            if (r4 > r0) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            if (r1 == 0) goto L37
            okio.Segment r1 = r3.head
            if (r1 != 0) goto L1a
            okio.Segment r4 = okio.SegmentPool.take()
            r3.head = r4
            r4.prev = r4
            r4.next = r4
            goto L36
        L1a:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.Segment r1 = r1.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.limit
            int r2 = r2 + r4
            if (r2 > r0) goto L2e
            boolean r4 = r1.owner
            if (r4 != 0) goto L2c
            goto L2e
        L2c:
            r4 = r1
            goto L36
        L2e:
            okio.Segment r4 = okio.SegmentPool.take()
            okio.Segment r4 = r1.push(r4)
        L36:
            return r4
        L37:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unexpected capacity"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.remaining()
            r1 = r0
        La:
            if (r1 <= 0) goto L27
            r2 = 1
            okio.Segment r2 = r6.writableSegment$okio(r2)
            int r3 = r2.limit
            int r3 = 8192 - r3
            int r3 = java.lang.Math.min(r1, r3)
            byte[] r4 = r2.data
            int r5 = r2.limit
            r7.get(r4, r5, r3)
            int r1 = r1 - r3
            int r4 = r2.limit
            int r4 = r4 + r3
            r2.limit = r4
            goto La
        L27:
            long r1 = r6.size
            long r3 = (long) r0
            long r1 = r1 + r3
            r6.size = r1
            return r0
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer write(@org.jetbrains.annotations.NotNull okio.ByteString r3) {
            r2 = this;
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.size()
            r1 = 0
            r3.write$okio(r2, r1, r0)
            return r2
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer write(@org.jetbrains.annotations.NotNull okio.ByteString r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r2.write$okio(r1, r3, r4)
            return r1
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer write(@org.jetbrains.annotations.NotNull okio.Source r6, long r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
        L5:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1d
            long r0 = r6.read(r5, r7)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L17
            long r7 = r7 - r0
            goto L5
        L17:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L1d:
            return r5
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer write(@org.jetbrains.annotations.NotNull byte[] r3) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            r1 = 0
            okio.Buffer r3 = r2.write(r3, r1, r0)
            return r3
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer write(@org.jetbrains.annotations.NotNull byte[] r10, int r11, int r12) {
            r9 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r10.length
            long r1 = (long) r0
            long r3 = (long) r11
            long r7 = (long) r12
            r5 = r7
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            int r12 = r12 + r11
        Le:
            if (r11 >= r12) goto L2f
            r0 = 1
            okio.Segment r0 = r9.writableSegment$okio(r0)
            int r1 = r12 - r11
            int r2 = r0.limit
            int r2 = 8192 - r2
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.data
            int r3 = r0.limit
            int r4 = r11 + r1
            kotlin.collections.ArraysKt.copyInto(r10, r2, r3, r11, r4)
            int r11 = r0.limit
            int r11 = r11 + r1
            r0.limit = r11
            r11 = r4
            goto Le
        L2f:
            long r10 = r9.size()
            long r10 = r10 + r7
            r9.setSize$okio(r10)
            return r9
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(okio.ByteString r1) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(okio.ByteString r1, int r2, int r3) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1, r2, r3)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(okio.Source r1, long r2) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1, r2)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(byte[] r1) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(byte[] r1, int r2, int r3) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1, r2, r3)
            return r1
    }

    @Override // okio.Sink
    public void write(@org.jetbrains.annotations.NotNull okio.Buffer r9, long r10) {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            if (r9 == r8) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto Lbc
            long r2 = r9.size()
            r4 = 0
            r6 = r10
            okio.Util.checkOffsetAndCount(r2, r4, r6)
        L17:
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 <= 0) goto Lbb
            okio.Segment r1 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.limit
            okio.Segment r2 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r2 = r2.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 >= 0) goto L7d
            okio.Segment r1 = r8.head
            if (r1 == 0) goto L3b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.Segment r1 = r1.prev
            goto L3c
        L3b:
            r1 = 0
        L3c:
            if (r1 == 0) goto L71
            boolean r2 = r1.owner
            if (r2 == 0) goto L71
            int r2 = r1.limit
            long r2 = (long) r2
            long r2 = r2 + r10
            boolean r4 = r1.shared
            if (r4 == 0) goto L4c
            r4 = 0
            goto L4e
        L4c:
            int r4 = r1.pos
        L4e:
            long r4 = (long) r4
            long r2 = r2 - r4
            r4 = 8192(0x2000, float:1.148E-41)
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L71
            okio.Segment r0 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r2 = (int) r10
            r0.writeTo(r1, r2)
            long r0 = r9.size()
            long r0 = r0 - r10
            r9.setSize$okio(r0)
            long r0 = r8.size()
            long r0 = r0 + r10
            r8.setSize$okio(r0)
            goto Lbb
        L71:
            okio.Segment r1 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = (int) r10
            okio.Segment r1 = r1.split(r2)
            r9.head = r1
        L7d:
            okio.Segment r1 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.limit
            int r3 = r1.pos
            int r2 = r2 - r3
            long r2 = (long) r2
            okio.Segment r4 = r1.pop()
            r9.head = r4
            okio.Segment r4 = r8.head
            if (r4 != 0) goto L99
            r8.head = r1
            r1.prev = r1
            r1.next = r1
            goto La8
        L99:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Segment r1 = r4.push(r1)
            r1.compact()
        La8:
            long r4 = r9.size()
            long r4 = r4 - r2
            r9.setSize$okio(r4)
            long r4 = r8.size()
            long r4 = r4 + r2
            r8.setSize$okio(r4)
            long r10 = r10 - r2
            goto L17
        Lbb:
            return
        Lbc:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "source == this"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    @Override // okio.BufferedSink
    public long writeAll(@org.jetbrains.annotations.NotNull okio.Source r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
        L7:
            r2 = 8192(0x2000, float:1.148E-41)
            long r2 = (long) r2
            long r2 = r8.read(r7, r2)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L15
            return r0
        L15:
            long r0 = r0 + r2
            goto L7
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeByte(int r5) {
            r4 = this;
            r0 = 1
            okio.Segment r0 = r4.writableSegment$okio(r0)
            byte[] r1 = r0.data
            int r2 = r0.limit
            int r3 = r2 + 1
            r0.limit = r3
            byte r5 = (byte) r5
            r1[r2] = r5
            long r0 = r4.size()
            r2 = 1
            long r0 = r0 + r2
            r4.setSize$okio(r0)
            return r4
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeByte(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeByte(r1)
            return r1
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeDecimalLong(long r13) {
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto Le
            r13 = 48
            okio.Buffer r13 = r12.writeByte(r13)
            goto L11f
        Le:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L20
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1f
            java.lang.String r13 = "-9223372036854775808"
            okio.Buffer r13 = r12.writeUtf8(r13)
            goto L11f
        L1f:
            r3 = 1
        L20:
            r5 = 100000000(0x5f5e100, double:4.94065646E-316)
            r2 = 10
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 >= 0) goto L6e
            r5 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4c
            r5 = 100
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 >= 0) goto L40
            r5 = 10
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 >= 0) goto L3d
            goto Le6
        L3d:
            r4 = 2
            goto Le6
        L40:
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L49
            r4 = 3
            goto Le6
        L49:
            r4 = 4
            goto Le6
        L4c:
            r4 = 1000000(0xf4240, double:4.940656E-318)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L60
            r4 = 100000(0x186a0, double:4.94066E-319)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L5d
            r4 = 5
            goto Le6
        L5d:
            r4 = 6
            goto Le6
        L60:
            r4 = 10000000(0x989680, double:4.9406565E-317)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L6a
            r4 = 7
            goto Le6
        L6a:
            r4 = 8
            goto Le6
        L6e:
            r4 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L9c
            r4 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L8d
            r4 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L8a
            r4 = 9
            goto Le6
        L8a:
            r4 = 10
            goto Le6
        L8d:
            r4 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L99
            r4 = 11
            goto Le6
        L99:
            r4 = 12
            goto Le6
        L9c:
            r4 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lc0
            r4 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lb1
            r4 = 13
            goto Le6
        Lb1:
            r4 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lbd
            r4 = 14
            goto Le6
        Lbd:
            r4 = 15
            goto Le6
        Lc0:
            r4 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Ld8
            r4 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Ld5
            r4 = 16
            goto Le6
        Ld5:
            r4 = 17
            goto Le6
        Ld8:
            r4 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Le4
            r4 = 18
            goto Le6
        Le4:
            r4 = 19
        Le6:
            if (r3 == 0) goto Lea
            int r4 = r4 + 1
        Lea:
            okio.Segment r5 = r12.writableSegment$okio(r4)
            byte[] r6 = r5.data
            int r7 = r5.limit
            int r7 = r7 + r4
        Lf3:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L107
            long r8 = (long) r2
            long r10 = r13 % r8
            int r11 = (int) r10
            int r7 = r7 + (-1)
            byte[] r10 = okio.internal.BufferKt.getHEX_DIGIT_BYTES()
            r10 = r10[r11]
            r6[r7] = r10
            long r13 = r13 / r8
            goto Lf3
        L107:
            if (r3 == 0) goto L110
            int r7 = r7 + (-1)
            r13 = 45
            byte r13 = (byte) r13
            r6[r7] = r13
        L110:
            int r13 = r5.limit
            int r13 = r13 + r4
            r5.limit = r13
            long r13 = r12.size()
            long r0 = (long) r4
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            r13 = r12
        L11f:
            return r13
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeDecimalLong(long r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeDecimalLong(r1)
            return r1
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeHexadecimalUnsignedLong(long r13) {
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            r13 = 48
            okio.Buffer r13 = r12.writeByte(r13)
            goto L83
        Ld:
            r0 = 1
            long r1 = r13 >>> r0
            long r1 = r1 | r13
            r3 = 2
            long r4 = r1 >>> r3
            long r1 = r1 | r4
            r4 = 4
            long r5 = r1 >>> r4
            long r1 = r1 | r5
            r5 = 8
            long r6 = r1 >>> r5
            long r1 = r1 | r6
            r6 = 16
            long r7 = r1 >>> r6
            long r1 = r1 | r7
            r7 = 32
            long r8 = r1 >>> r7
            long r1 = r1 | r8
            long r8 = r1 >>> r0
            r10 = 6148914691236517205(0x5555555555555555, double:1.1945305291614955E103)
            long r8 = r8 & r10
            long r1 = r1 - r8
            long r8 = r1 >>> r3
            r10 = 3689348814741910323(0x3333333333333333, double:4.667261458395856E-62)
            long r8 = r8 & r10
            long r1 = r1 & r10
            long r8 = r8 + r1
            long r1 = r8 >>> r4
            long r1 = r1 + r8
            r8 = 1085102592571150095(0xf0f0f0f0f0f0f0f, double:3.815736827118017E-236)
            long r1 = r1 & r8
            long r8 = r1 >>> r5
            long r1 = r1 + r8
            long r5 = r1 >>> r6
            long r1 = r1 + r5
            r5 = 63
            long r8 = r1 & r5
            long r1 = r1 >>> r7
            long r1 = r1 & r5
            long r8 = r8 + r1
            r1 = 3
            long r1 = (long) r1
            long r8 = r8 + r1
            long r1 = (long) r4
            long r8 = r8 / r1
            int r1 = (int) r8
            okio.Segment r2 = r12.writableSegment$okio(r1)
            byte[] r3 = r2.data
            int r5 = r2.limit
            int r6 = r5 + r1
            int r6 = r6 - r0
        L62:
            if (r6 < r5) goto L74
            byte[] r0 = okio.internal.BufferKt.getHEX_DIGIT_BYTES()
            r7 = 15
            long r7 = r7 & r13
            int r8 = (int) r7
            r0 = r0[r8]
            r3[r6] = r0
            long r13 = r13 >>> r4
            int r6 = r6 + (-1)
            goto L62
        L74:
            int r13 = r2.limit
            int r13 = r13 + r1
            r2.limit = r13
            long r13 = r12.size()
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            r13 = r12
        L83:
            return r13
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeHexadecimalUnsignedLong(long r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeHexadecimalUnsignedLong(r1)
            return r1
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeInt(int r6) {
            r5 = this;
            r0 = 4
            okio.Segment r0 = r5.writableSegment$okio(r0)
            byte[] r1 = r0.data
            int r2 = r0.limit
            int r3 = r2 + 1
            int r4 = r6 >>> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            int r4 = r6 >>> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r2 + 1
            int r4 = r6 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r3] = r6
            r0.limit = r2
            long r0 = r5.size()
            r2 = 4
            long r0 = r0 + r2
            r5.setSize$okio(r0)
            return r5
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeInt(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeInt(r1)
            return r1
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeIntLe(int r1) {
            r0 = this;
            int r1 = okio.Util.reverseBytes(r1)
            okio.Buffer r1 = r0.writeInt(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeIntLe(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeIntLe(r1)
            return r1
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeLong(long r10) {
            r9 = this;
            r0 = 8
            okio.Segment r1 = r9.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            r5 = 56
            long r5 = r10 >>> r5
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            int r6 = (int) r5
            byte r5 = (byte) r6
            r2[r3] = r5
            int r3 = r4 + 1
            r5 = 48
            long r5 = r10 >>> r5
            long r5 = r5 & r7
            int r6 = (int) r5
            byte r5 = (byte) r6
            r2[r4] = r5
            int r4 = r3 + 1
            r5 = 40
            long r5 = r10 >>> r5
            long r5 = r5 & r7
            int r6 = (int) r5
            byte r5 = (byte) r6
            r2[r3] = r5
            int r3 = r4 + 1
            r5 = 32
            long r5 = r10 >>> r5
            long r5 = r5 & r7
            int r6 = (int) r5
            byte r5 = (byte) r6
            r2[r4] = r5
            int r4 = r3 + 1
            r5 = 24
            long r5 = r10 >>> r5
            long r5 = r5 & r7
            int r6 = (int) r5
            byte r5 = (byte) r6
            r2[r3] = r5
            int r3 = r4 + 1
            r5 = 16
            long r5 = r10 >>> r5
            long r5 = r5 & r7
            int r6 = (int) r5
            byte r5 = (byte) r6
            r2[r4] = r5
            int r4 = r3 + 1
            long r5 = r10 >>> r0
            long r5 = r5 & r7
            int r0 = (int) r5
            byte r0 = (byte) r0
            r2[r3] = r0
            int r0 = r4 + 1
            long r10 = r10 & r7
            int r11 = (int) r10
            byte r10 = (byte) r11
            r2[r4] = r10
            r1.limit = r0
            long r10 = r9.size()
            r0 = 8
            long r10 = r10 + r0
            r9.setSize$okio(r10)
            return r9
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeLong(long r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeLong(r1)
            return r1
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeLongLe(long r1) {
            r0 = this;
            long r1 = okio.Util.reverseBytes(r1)
            okio.Buffer r1 = r0.writeLong(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeLongLe(long r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeLongLe(r1)
            return r1
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeShort(int r6) {
            r5 = this;
            r0 = 2
            okio.Segment r0 = r5.writableSegment$okio(r0)
            byte[] r1 = r0.data
            int r2 = r0.limit
            int r3 = r2 + 1
            int r4 = r6 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r3] = r6
            r0.limit = r2
            long r0 = r5.size()
            r2 = 2
            long r0 = r0 + r2
            r5.setSize$okio(r0)
            return r5
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeShort(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeShort(r1)
            return r1
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeShortLe(int r1) {
            r0 = this;
            short r1 = (short) r1
            short r1 = okio.Util.reverseBytes(r1)
            okio.Buffer r1 = r0.writeShort(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeShortLe(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeShortLe(r1)
            return r1
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeString(@org.jetbrains.annotations.NotNull java.lang.String r4, int r5, int r6, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r7) {
            r3 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 1
            r1 = 0
            if (r5 < 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L7d
            if (r6 < r5) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L6b
            int r2 = r4.length()
            if (r6 > r2) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L4e
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L31
            okio.Buffer r4 = r3.writeUtf8(r4, r5, r6)
            return r4
        L31:
            java.lang.String r4 = r4.substring(r5, r6)
            java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r4, r5)
            byte[] r4 = r4.getBytes(r7)
            java.lang.String r5 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            int r5 = r4.length
            okio.Buffer r4 = r3.write(r4, r1, r5)
            return r4
        L4e:
            java.lang.String r5 = "endIndex > string.length: "
            java.lang.String r7 = " > "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r5, r6, r7)
            int r4 = r4.length()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L6b:
            java.lang.String r4 = "endIndex < beginIndex: "
            java.lang.String r7 = " < "
            java.lang.String r4 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r4, r6, r7, r5)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L7d:
            java.lang.String r4 = "beginIndex < 0: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r5)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeString(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r4) {
            r2 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length()
            r1 = 0
            okio.Buffer r3 = r2.writeString(r3, r1, r0, r4)
            return r3
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeString(java.lang.String r1, int r2, int r3, java.nio.charset.Charset r4) {
            r0 = this;
            okio.Buffer r1 = r0.writeString(r1, r2, r3, r4)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeString(java.lang.String r1, java.nio.charset.Charset r2) {
            r0 = this;
            okio.Buffer r1 = r0.writeString(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.Buffer writeTo(@org.jetbrains.annotations.NotNull java.io.OutputStream r7) throws java.io.IOException {
            r6 = this;
            r2 = 0
            r4 = 2
            r5 = 0
            r0 = r6
            r1 = r7
            okio.Buffer r7 = writeTo$default(r0, r1, r2, r4, r5)
            return r7
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final okio.Buffer writeTo(@org.jetbrains.annotations.NotNull java.io.OutputStream r8, long r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            long r1 = r7.size
            r3 = 0
            r5 = r9
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r7.head
        Lf:
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 <= 0) goto L45
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r9, r1)
            int r2 = (int) r1
            byte[] r1 = r0.data
            int r3 = r0.pos
            r8.write(r1, r3, r2)
            int r1 = r0.pos
            int r1 = r1 + r2
            r0.pos = r1
            long r3 = r7.size
            long r5 = (long) r2
            long r3 = r3 - r5
            r7.size = r3
            long r9 = r9 - r5
            int r2 = r0.limit
            if (r1 != r2) goto Lf
            okio.Segment r1 = r0.pop()
            r7.head = r1
            okio.SegmentPool.recycle(r0)
            r0 = r1
            goto Lf
        L45:
            return r7
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length()
            r1 = 0
            okio.Buffer r3 = r2.writeUtf8(r3, r1, r0)
            return r3
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r11, int r12, int r13) {
            r10 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1
            if (r12 < 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L15b
            if (r13 < r12) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L149
            int r1 = r11.length()
            if (r13 > r1) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 == 0) goto L12c
        L1f:
            if (r12 >= r13) goto L12b
            char r1 = r11.charAt(r12)
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r2) goto L60
            okio.Segment r3 = r10.writableSegment$okio(r0)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r5 = r5 - r12
            int r6 = 8192 - r5
            int r6 = java.lang.Math.min(r13, r6)
            int r7 = r12 + 1
            int r12 = r12 + r5
            byte r1 = (byte) r1
            r4[r12] = r1
        L3e:
            r12 = r7
            if (r12 >= r6) goto L4f
            char r1 = r11.charAt(r12)
            if (r1 < r2) goto L48
            goto L4f
        L48:
            int r7 = r12 + 1
            int r12 = r12 + r5
            byte r1 = (byte) r1
            r4[r12] = r1
            goto L3e
        L4f:
            int r5 = r5 + r12
            int r1 = r3.limit
            int r5 = r5 - r1
            int r1 = r1 + r5
            r3.limit = r1
            long r1 = r10.size()
            long r3 = (long) r5
            long r1 = r1 + r3
            r10.setSize$okio(r1)
            goto L1f
        L60:
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 >= r3) goto L8b
            r3 = 2
            okio.Segment r4 = r10.writableSegment$okio(r3)
            byte[] r5 = r4.data
            int r6 = r4.limit
            int r7 = r1 >> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            r1 = r1 & 63
            r1 = r1 | r2
            byte r1 = (byte) r1
            r5[r7] = r1
            int r6 = r6 + r3
            r4.limit = r6
            long r1 = r10.size()
            r3 = 2
            long r1 = r1 + r3
            r10.setSize$okio(r1)
            goto L127
        L8b:
            r3 = 55296(0xd800, float:7.7486E-41)
            r4 = 63
            if (r1 < r3) goto Lf9
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r1 <= r3) goto L98
            goto Lf9
        L98:
            int r5 = r12 + 1
            if (r5 >= r13) goto La1
            char r6 = r11.charAt(r5)
            goto La2
        La1:
            r6 = 0
        La2:
            r7 = 56319(0xdbff, float:7.892E-41)
            if (r1 > r7) goto Lf3
            r7 = 56320(0xdc00, float:7.8921E-41)
            if (r7 > r6) goto Lf3
            if (r3 >= r6) goto Laf
            goto Lf3
        Laf:
            r3 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & 1023(0x3ff, float:1.434E-42)
            int r1 = r1 << 10
            r5 = r6 & 1023(0x3ff, float:1.434E-42)
            r1 = r1 | r5
            int r1 = r1 + r3
            r3 = 4
            okio.Segment r5 = r10.writableSegment$okio(r3)
            byte[] r6 = r5.data
            int r7 = r5.limit
            int r8 = r1 >> 18
            r8 = r8 | 240(0xf0, float:3.36E-43)
            byte r8 = (byte) r8
            r6[r7] = r8
            int r8 = r7 + 1
            int r9 = r1 >> 12
            r9 = r9 & r4
            r9 = r9 | r2
            byte r9 = (byte) r9
            r6[r8] = r9
            int r8 = r7 + 2
            int r9 = r1 >> 6
            r9 = r9 & r4
            r9 = r9 | r2
            byte r9 = (byte) r9
            r6[r8] = r9
            int r8 = r7 + 3
            r1 = r1 & r4
            r1 = r1 | r2
            byte r1 = (byte) r1
            r6[r8] = r1
            int r7 = r7 + r3
            r5.limit = r7
            long r1 = r10.size()
            r3 = 4
            long r1 = r1 + r3
            r10.setSize$okio(r1)
            int r12 = r12 + 2
            goto L1f
        Lf3:
            r10.writeByte(r4)
            r12 = r5
            goto L1f
        Lf9:
            r3 = 3
            okio.Segment r5 = r10.writableSegment$okio(r3)
            byte[] r6 = r5.data
            int r7 = r5.limit
            int r8 = r1 >> 12
            r8 = r8 | 224(0xe0, float:3.14E-43)
            byte r8 = (byte) r8
            r6[r7] = r8
            int r8 = r7 + 1
            int r9 = r1 >> 6
            r4 = r4 & r9
            r4 = r4 | r2
            byte r4 = (byte) r4
            r6[r8] = r4
            int r4 = r7 + 2
            r1 = r1 & 63
            r1 = r1 | r2
            byte r1 = (byte) r1
            r6[r4] = r1
            int r7 = r7 + r3
            r5.limit = r7
            long r1 = r10.size()
            r3 = 3
            long r1 = r1 + r3
            r10.setSize$okio(r1)
        L127:
            int r12 = r12 + 1
            goto L1f
        L12b:
            return r10
        L12c:
            java.lang.String r12 = "endIndex > string.length: "
            java.lang.String r0 = " > "
            java.lang.StringBuilder r12 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r12, r13, r0)
            int r11 = r11.length()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L149:
            java.lang.String r11 = "endIndex < beginIndex: "
            java.lang.String r0 = " < "
            java.lang.String r11 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r11, r13, r0, r12)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L15b:
            java.lang.String r11 = "beginIndex < 0: "
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeUtf8(java.lang.String r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeUtf8(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeUtf8(java.lang.String r1, int r2, int r3) {
            r0 = this;
            okio.Buffer r1 = r0.writeUtf8(r1, r2, r3)
            return r1
    }

    @Override // okio.BufferedSink
    @org.jetbrains.annotations.NotNull
    public okio.Buffer writeUtf8CodePoint(int r9) {
            r8 = this;
            r0 = 128(0x80, float:1.8E-43)
            if (r9 >= r0) goto L9
            r8.writeByte(r9)
            goto Lb1
        L9:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 63
            if (r9 >= r1) goto L35
            r1 = 2
            okio.Segment r3 = r8.writableSegment$okio(r1)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.limit = r5
            long r0 = r8.size()
            r2 = 2
            long r0 = r0 + r2
            r8.setSize$okio(r0)
            goto Lb1
        L35:
            r1 = 57343(0xdfff, float:8.0355E-41)
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r3 <= r9) goto L3e
            goto L44
        L3e:
            if (r1 < r9) goto L44
            r8.writeByte(r2)
            goto Lb1
        L44:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r1) goto L76
            r1 = 3
            okio.Segment r3 = r8.writableSegment$okio(r1)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r9 >> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.limit = r5
            long r0 = r8.size()
            r2 = 3
            long r0 = r0 + r2
            r8.setSize$okio(r0)
            goto Lb1
        L76:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r1) goto Lb2
            r1 = 4
            okio.Segment r3 = r8.writableSegment$okio(r1)
            byte[] r4 = r3.data
            int r5 = r3.limit
            int r6 = r9 >> 18
            r6 = r6 | 240(0xf0, float:3.36E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 12
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 3
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.limit = r5
            long r0 = r8.size()
            r2 = 4
            long r0 = r0 + r2
            r8.setSize$okio(r0)
        Lb1:
            return r8
        Lb2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unexpected code point: 0x"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r9 = okio.Util.toHexString(r9)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeUtf8CodePoint(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeUtf8CodePoint(r1)
            return r1
    }
}
