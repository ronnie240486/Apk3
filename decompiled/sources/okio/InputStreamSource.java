package okio;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lokio/InputStreamSource;", "Lokio/Source;", "input", "Ljava/io/InputStream;", "timeout", "Lokio/Timeout;", "(Ljava/io/InputStream;Lokio/Timeout;)V", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "toString", "", "okio"}, k = 1, mv = {1, 4, 1})
final class InputStreamSource implements okio.Source {
    private final java.io.InputStream input;
    private final okio.Timeout timeout;

    public InputStreamSource(@org.jetbrains.annotations.NotNull java.io.InputStream r2, @org.jetbrains.annotations.NotNull okio.Timeout r3) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "timeout"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.input = r2
            r1.timeout = r3
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.InputStream r0 = r1.input
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r4, long r5) {
            r3 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            return r0
        Ld:
            r0 = 1
            if (r2 < 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L64
            okio.Timeout r1 = r3.timeout     // Catch: java.lang.AssertionError -> L56
            r1.throwIfReached()     // Catch: java.lang.AssertionError -> L56
            okio.Segment r0 = r4.writableSegment$okio(r0)     // Catch: java.lang.AssertionError -> L56
            int r1 = r0.limit     // Catch: java.lang.AssertionError -> L56
            int r1 = 8192 - r1
            long r1 = (long) r1     // Catch: java.lang.AssertionError -> L56
            long r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.AssertionError -> L56
            int r6 = (int) r5     // Catch: java.lang.AssertionError -> L56
            java.io.InputStream r5 = r3.input     // Catch: java.lang.AssertionError -> L56
            byte[] r1 = r0.data     // Catch: java.lang.AssertionError -> L56
            int r2 = r0.limit     // Catch: java.lang.AssertionError -> L56
            int r5 = r5.read(r1, r2, r6)     // Catch: java.lang.AssertionError -> L56
            r6 = -1
            if (r5 != r6) goto L47
            int r5 = r0.pos     // Catch: java.lang.AssertionError -> L56
            int r6 = r0.limit     // Catch: java.lang.AssertionError -> L56
            if (r5 != r6) goto L44
            okio.Segment r5 = r0.pop()     // Catch: java.lang.AssertionError -> L56
            r4.head = r5     // Catch: java.lang.AssertionError -> L56
            okio.SegmentPool.recycle(r0)     // Catch: java.lang.AssertionError -> L56
        L44:
            r4 = -1
            return r4
        L47:
            int r6 = r0.limit     // Catch: java.lang.AssertionError -> L56
            int r6 = r6 + r5
            r0.limit = r6     // Catch: java.lang.AssertionError -> L56
            long r0 = r4.size()     // Catch: java.lang.AssertionError -> L56
            long r5 = (long) r5     // Catch: java.lang.AssertionError -> L56
            long r0 = r0 + r5
            r4.setSize$okio(r0)     // Catch: java.lang.AssertionError -> L56
            return r5
        L56:
            r4 = move-exception
            boolean r5 = okio.Okio.isAndroidGetsocknameError(r4)
            if (r5 == 0) goto L63
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            throw r5
        L63:
            throw r4
        L64:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r5)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // okio.Source
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.Timeout r0 = r1.timeout
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "source("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.io.InputStream r1 = r2.input
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
