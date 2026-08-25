package okio;

/* JADX INFO: compiled from: BufferedSink.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0007\u001a\u00020\u0000H&J\b\u0010\b\u001a\u00020\u0000H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH&J \u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H&J \u0010\r\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0015H&J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0011H&J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0011H&J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0011H&J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0011H&J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0011H&J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H&J(\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)H&J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'H&J \u0010,\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H&J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0011H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006/"}, d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "buffer", "Lokio/Buffer;", "getBuffer", "()Lokio/Buffer;", "emit", "emitCompleteSegments", "flush", "", "outputStream", "Ljava/io/OutputStream;", "write", "source", "", "offset", "", "byteCount", "byteString", "Lokio/ByteString;", "Lokio/Source;", "", "writeAll", "writeByte", "b", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", "string", "", "charset", "Ljava/nio/charset/Charset;", "beginIndex", "endIndex", "writeUtf8", "writeUtf8CodePoint", "codePoint", "okio"}, k = 1, mv = {1, 4, 1})
public interface BufferedSink extends okio.Sink, java.nio.channels.WritableByteChannel {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @kotlin.ReplaceWith(expression = "buffer", imports = {}))
    @org.jetbrains.annotations.NotNull
    okio.Buffer buffer();

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink emit() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink emitCompleteSegments() throws java.io.IOException;

    @Override // okio.Sink, java.io.Flushable
    void flush() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.Buffer getBuffer();

    @org.jetbrains.annotations.NotNull
    java.io.OutputStream outputStream();

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink write(@org.jetbrains.annotations.NotNull okio.ByteString r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink write(@org.jetbrains.annotations.NotNull okio.ByteString r1, int r2, int r3) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink write(@org.jetbrains.annotations.NotNull okio.Source r1, long r2) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink write(@org.jetbrains.annotations.NotNull byte[] r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink write(@org.jetbrains.annotations.NotNull byte[] r1, int r2, int r3) throws java.io.IOException;

    long writeAll(@org.jetbrains.annotations.NotNull okio.Source r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeByte(int r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeDecimalLong(long r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeHexadecimalUnsignedLong(long r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeInt(int r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeIntLe(int r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeLong(long r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeLongLe(long r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeShort(int r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeShortLe(int r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeString(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, int r3, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r4) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeString(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r2) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeUtf8(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, int r3) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okio.BufferedSink writeUtf8CodePoint(int r1) throws java.io.IOException;
}
