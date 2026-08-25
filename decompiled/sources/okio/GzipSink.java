package okio;

/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lokio/GzipSink;", "Lokio/Sink;", "sink", "(Lokio/Sink;)V", "closed", "", "crc", "Ljava/util/zip/CRC32;", "deflater", "Ljava/util/zip/Deflater;", "()Ljava/util/zip/Deflater;", "deflaterSink", "Lokio/DeflaterSink;", "Lokio/RealBufferedSink;", "close", "", "-deprecated_deflater", "flush", "timeout", "Lokio/Timeout;", "updateCrc", "buffer", "Lokio/Buffer;", "byteCount", "", "write", "source", "writeFooter", "okio"}, k = 1, mv = {1, 4, 1})
public final class GzipSink implements okio.Sink {
    private boolean closed;
    private final java.util.zip.CRC32 crc;

    @org.jetbrains.annotations.NotNull
    private final java.util.zip.Deflater deflater;
    private final okio.DeflaterSink deflaterSink;
    private final okio.RealBufferedSink sink;

    public GzipSink(@org.jetbrains.annotations.NotNull okio.Sink r4) {
            r3 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.<init>()
            okio.RealBufferedSink r0 = new okio.RealBufferedSink
            r0.<init>(r4)
            r3.sink = r0
            java.util.zip.Deflater r4 = new java.util.zip.Deflater
            r1 = -1
            r2 = 1
            r4.<init>(r1, r2)
            r3.deflater = r4
            okio.DeflaterSink r1 = new okio.DeflaterSink
            r1.<init>(r0, r4)
            r3.deflaterSink = r1
            java.util.zip.CRC32 r4 = new java.util.zip.CRC32
            r4.<init>()
            r3.crc = r4
            okio.Buffer r4 = r0.bufferField
            r0 = 8075(0x1f8b, float:1.1315E-41)
            r4.writeShort(r0)
            r0 = 8
            r4.writeByte(r0)
            r0 = 0
            r4.writeByte(r0)
            r4.writeInt(r0)
            r4.writeByte(r0)
            r4.writeByte(r0)
            return
    }

    private final void updateCrc(okio.Buffer r5, long r6) {
            r4 = this;
            okio.Segment r5 = r5.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
        L5:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L27
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r0 = java.lang.Math.min(r6, r0)
            int r1 = (int) r0
            java.util.zip.CRC32 r0 = r4.crc
            byte[] r2 = r5.data
            int r3 = r5.pos
            r0.update(r2, r3, r1)
            long r0 = (long) r1
            long r6 = r6 - r0
            okio.Segment r5 = r5.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            goto L5
        L27:
            return
    }

    private final void writeFooter() {
            r3 = this;
            okio.RealBufferedSink r0 = r3.sink
            java.util.zip.CRC32 r1 = r3.crc
            long r1 = r1.getValue()
            int r2 = (int) r1
            r0.writeIntLe(r2)
            okio.RealBufferedSink r0 = r3.sink
            java.util.zip.Deflater r1 = r3.deflater
            long r1 = r1.getBytesRead()
            int r2 = (int) r1
            r0.writeIntLe(r2)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "deflater", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_deflater")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_deflater, reason: not valid java name */
    public final java.util.zip.Deflater m2030deprecated_deflater() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            return r0
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            okio.DeflaterSink r1 = r2.deflaterSink     // Catch: java.lang.Throwable -> Lf
            r1.finishDeflate$okio()     // Catch: java.lang.Throwable -> Lf
            r2.writeFooter()     // Catch: java.lang.Throwable -> Lf
            goto L10
        Lf:
            r0 = move-exception
        L10:
            java.util.zip.Deflater r1 = r2.deflater     // Catch: java.lang.Throwable -> L16
            r1.end()     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r1 = move-exception
            if (r0 != 0) goto L1a
            r0 = r1
        L1a:
            okio.RealBufferedSink r1 = r2.sink     // Catch: java.lang.Throwable -> L20
            r1.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r1 = move-exception
            if (r0 != 0) goto L24
            r0 = r1
        L24:
            r1 = 1
            r2.closed = r1
            if (r0 != 0) goto L2a
            return
        L2a:
            throw r0
    }

    @kotlin.jvm.JvmName(name = "deflater")
    @org.jetbrains.annotations.NotNull
    public final java.util.zip.Deflater deflater() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            return r0
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            okio.DeflaterSink r0 = r1.deflaterSink
            r0.flush()
            return
    }

    @Override // okio.Sink
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.RealBufferedSink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    @Override // okio.Sink
    public void write(@org.jetbrains.annotations.NotNull okio.Buffer r4, long r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L1c
            if (r2 != 0) goto L13
            return
        L13:
            r3.updateCrc(r4, r5)
            okio.DeflaterSink r0 = r3.deflaterSink
            r0.write(r4, r5)
            return
        L1c:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r5)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }
}
