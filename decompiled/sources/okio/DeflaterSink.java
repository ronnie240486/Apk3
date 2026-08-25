package okio;

/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0003J\r\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u000fJ\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "sink", "deflater", "Ljava/util/zip/Deflater;", "(Lokio/Sink;Ljava/util/zip/Deflater;)V", "Lokio/BufferedSink;", "(Lokio/BufferedSink;Ljava/util/zip/Deflater;)V", "closed", "", "close", "", "deflate", "syncFlush", "finishDeflate", "finishDeflate$okio", "flush", "timeout", "Lokio/Timeout;", "toString", "", "write", "source", "Lokio/Buffer;", "byteCount", "", "okio"}, k = 1, mv = {1, 4, 1})
public final class DeflaterSink implements okio.Sink {
    private boolean closed;
    private final java.util.zip.Deflater deflater;
    private final okio.BufferedSink sink;

    public DeflaterSink(@org.jetbrains.annotations.NotNull okio.BufferedSink r2, @org.jetbrains.annotations.NotNull java.util.zip.Deflater r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "deflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.sink = r2
            r1.deflater = r3
            return
    }

    public DeflaterSink(@org.jetbrains.annotations.NotNull okio.Sink r2, @org.jetbrains.annotations.NotNull java.util.zip.Deflater r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "deflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.BufferedSink r2 = okio.Okio.buffer(r2)
            r1.<init>(r2, r3)
            return
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    private final void deflate(boolean r8) {
            r7 = this;
            okio.BufferedSink r0 = r7.sink
            okio.Buffer r0 = r0.getBuffer()
        L6:
            r1 = 1
            okio.Segment r1 = r0.writableSegment$okio(r1)
            if (r8 == 0) goto L1b
            java.util.zip.Deflater r2 = r7.deflater
            byte[] r3 = r1.data
            int r4 = r1.limit
            int r5 = 8192 - r4
            r6 = 2
            int r2 = r2.deflate(r3, r4, r5, r6)
            goto L27
        L1b:
            java.util.zip.Deflater r2 = r7.deflater
            byte[] r3 = r1.data
            int r4 = r1.limit
            int r5 = 8192 - r4
            int r2 = r2.deflate(r3, r4, r5)
        L27:
            if (r2 <= 0) goto L3d
            int r3 = r1.limit
            int r3 = r3 + r2
            r1.limit = r3
            long r3 = r0.size()
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.setSize$okio(r3)
            okio.BufferedSink r1 = r7.sink
            r1.emitCompleteSegments()
            goto L6
        L3d:
            java.util.zip.Deflater r2 = r7.deflater
            boolean r2 = r2.needsInput()
            if (r2 == 0) goto L6
            int r8 = r1.pos
            int r2 = r1.limit
            if (r8 != r2) goto L54
            okio.Segment r8 = r1.pop()
            r0.head = r8
            okio.SegmentPool.recycle(r1)
        L54:
            return
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            r2.finishDeflate$okio()     // Catch: java.lang.Throwable -> La
            goto Lb
        La:
            r0 = move-exception
        Lb:
            java.util.zip.Deflater r1 = r2.deflater     // Catch: java.lang.Throwable -> L11
            r1.end()     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r1 = move-exception
            if (r0 != 0) goto L15
            r0 = r1
        L15:
            okio.BufferedSink r1 = r2.sink     // Catch: java.lang.Throwable -> L1b
            r1.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r1 = move-exception
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            r1 = 1
            r2.closed = r1
            if (r0 != 0) goto L25
            return
        L25:
            throw r0
    }

    public final void finishDeflate$okio() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            r0.finish()
            r0 = 0
            r1.deflate(r0)
            return
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.deflate(r0)
            okio.BufferedSink r0 = r1.sink
            r0.flush()
            return
    }

    @Override // okio.Sink
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "DeflaterSink("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            okio.BufferedSink r1 = r2.sink
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // okio.Sink
    public void write(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            long r1 = r8.size()
            r3 = 0
            r5 = r9
            okio.Util.checkOffsetAndCount(r1, r3, r5)
        L10:
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L50
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r9, r1)
            int r2 = (int) r1
            java.util.zip.Deflater r1 = r7.deflater
            byte[] r3 = r0.data
            int r4 = r0.pos
            r1.setInput(r3, r4, r2)
            r1 = 0
            r7.deflate(r1)
            long r3 = r8.size()
            long r5 = (long) r2
            long r3 = r3 - r5
            r8.setSize$okio(r3)
            int r1 = r0.pos
            int r1 = r1 + r2
            r0.pos = r1
            int r2 = r0.limit
            if (r1 != r2) goto L4e
            okio.Segment r1 = r0.pop()
            r8.head = r1
            okio.SegmentPool.recycle(r0)
        L4e:
            long r9 = r9 - r5
            goto L10
        L50:
            return
    }
}
