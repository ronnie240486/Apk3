package okio;

/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lokio/InflaterSource;", "Lokio/Source;", "source", "inflater", "Ljava/util/zip/Inflater;", "(Lokio/Source;Ljava/util/zip/Inflater;)V", "Lokio/BufferedSource;", "(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V", "bufferBytesHeldByInflater", "", "closed", "", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "readOrInflate", "refill", "releaseBytesAfterInflate", "timeout", "Lokio/Timeout;", "okio"}, k = 1, mv = {1, 4, 1})
public final class InflaterSource implements okio.Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final java.util.zip.Inflater inflater;
    private final okio.BufferedSource source;

    public InflaterSource(@org.jetbrains.annotations.NotNull okio.BufferedSource r2, @org.jetbrains.annotations.NotNull java.util.zip.Inflater r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.source = r2
            r1.inflater = r3
            return
    }

    public InflaterSource(@org.jetbrains.annotations.NotNull okio.Source r2, @org.jetbrains.annotations.NotNull java.util.zip.Inflater r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.BufferedSource r2 = okio.Okio.buffer(r2)
            r1.<init>(r2, r3)
            return
    }

    private final void releaseBytesAfterInflate() {
            r4 = this;
            int r0 = r4.bufferBytesHeldByInflater
            if (r0 != 0) goto L5
            return
        L5:
            java.util.zip.Inflater r1 = r4.inflater
            int r1 = r1.getRemaining()
            int r0 = r0 - r1
            int r1 = r4.bufferBytesHeldByInflater
            int r1 = r1 - r0
            r4.bufferBytesHeldByInflater = r1
            okio.BufferedSource r1 = r4.source
            long r2 = (long) r0
            r1.skip(r2)
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 == 0) goto L5
            return
        L5:
            java.util.zip.Inflater r0 = r1.inflater
            r0.end()
            r0 = 1
            r1.closed = r0
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r6, long r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
        L6:
            long r0 = r5.readOrInflate(r6, r7)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L11
            return r0
        L11:
            java.util.zip.Inflater r0 = r5.inflater
            boolean r0 = r0.finished()
            if (r0 != 0) goto L34
            java.util.zip.Inflater r0 = r5.inflater
            boolean r0 = r0.needsDictionary()
            if (r0 == 0) goto L22
            goto L34
        L22:
            okio.BufferedSource r0 = r5.source
            boolean r0 = r0.exhausted()
            if (r0 != 0) goto L2b
            goto L6
        L2b:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r7 = "source exhausted prematurely"
            r6.<init>(r7)
            throw r6
        L34:
            r6 = -1
            return r6
    }

    public final long readOrInflate(@org.jetbrains.annotations.NotNull okio.Buffer r6, long r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 1
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L6c
            boolean r4 = r5.closed
            r4 = r4 ^ r0
            if (r4 == 0) goto L60
            if (r3 != 0) goto L1a
            return r1
        L1a:
            okio.Segment r0 = r6.writableSegment$okio(r0)     // Catch: java.util.zip.DataFormatException -> L59
            int r3 = r0.limit     // Catch: java.util.zip.DataFormatException -> L59
            int r3 = 8192 - r3
            long r3 = (long) r3     // Catch: java.util.zip.DataFormatException -> L59
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.util.zip.DataFormatException -> L59
            int r8 = (int) r7     // Catch: java.util.zip.DataFormatException -> L59
            r5.refill()     // Catch: java.util.zip.DataFormatException -> L59
            java.util.zip.Inflater r7 = r5.inflater     // Catch: java.util.zip.DataFormatException -> L59
            byte[] r3 = r0.data     // Catch: java.util.zip.DataFormatException -> L59
            int r4 = r0.limit     // Catch: java.util.zip.DataFormatException -> L59
            int r7 = r7.inflate(r3, r4, r8)     // Catch: java.util.zip.DataFormatException -> L59
            r5.releaseBytesAfterInflate()     // Catch: java.util.zip.DataFormatException -> L59
            if (r7 <= 0) goto L49
            int r8 = r0.limit     // Catch: java.util.zip.DataFormatException -> L59
            int r8 = r8 + r7
            r0.limit = r8     // Catch: java.util.zip.DataFormatException -> L59
            long r0 = r6.size()     // Catch: java.util.zip.DataFormatException -> L59
            long r7 = (long) r7     // Catch: java.util.zip.DataFormatException -> L59
            long r0 = r0 + r7
            r6.setSize$okio(r0)     // Catch: java.util.zip.DataFormatException -> L59
            return r7
        L49:
            int r7 = r0.pos     // Catch: java.util.zip.DataFormatException -> L59
            int r8 = r0.limit     // Catch: java.util.zip.DataFormatException -> L59
            if (r7 != r8) goto L58
            okio.Segment r7 = r0.pop()     // Catch: java.util.zip.DataFormatException -> L59
            r6.head = r7     // Catch: java.util.zip.DataFormatException -> L59
            okio.SegmentPool.recycle(r0)     // Catch: java.util.zip.DataFormatException -> L59
        L58:
            return r1
        L59:
            r6 = move-exception
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        L60:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "closed"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6c:
            java.lang.String r6 = "byteCount < 0: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    public final boolean refill() throws java.io.IOException {
            r5 = this;
            java.util.zip.Inflater r0 = r5.inflater
            boolean r0 = r0.needsInput()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            okio.BufferedSource r0 = r5.source
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            okio.BufferedSource r0 = r5.source
            okio.Buffer r0 = r0.getBuffer()
            okio.Segment r0 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r2 = r0.limit
            int r3 = r0.pos
            int r2 = r2 - r3
            r5.bufferBytesHeldByInflater = r2
            java.util.zip.Inflater r4 = r5.inflater
            byte[] r0 = r0.data
            r4.setInput(r0, r3, r2)
            return r1
    }

    @Override // okio.Source
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
