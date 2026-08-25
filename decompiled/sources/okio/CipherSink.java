package okio;

/* JADX INFO: compiled from: CipherSink.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0018H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lokio/CipherSink;", "Lokio/Sink;", "sink", "Lokio/BufferedSink;", "cipher", "Ljavax/crypto/Cipher;", "(Lokio/BufferedSink;Ljavax/crypto/Cipher;)V", "blockSize", "", "getCipher", "()Ljavax/crypto/Cipher;", "closed", "", "close", "", "doFinal", "", "flush", "timeout", "Lokio/Timeout;", "update", "source", "Lokio/Buffer;", "remaining", "", "write", "byteCount", "okio"}, k = 1, mv = {1, 4, 1})
public final class CipherSink implements okio.Sink {
    private final int blockSize;

    @org.jetbrains.annotations.NotNull
    private final javax.crypto.Cipher cipher;
    private boolean closed;
    private final okio.BufferedSink sink;

    public CipherSink(@org.jetbrains.annotations.NotNull okio.BufferedSink r2, @org.jetbrains.annotations.NotNull javax.crypto.Cipher r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "cipher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.sink = r2
            r1.cipher = r3
            int r2 = r3.getBlockSize()
            r1.blockSize = r2
            if (r2 <= 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L20
            return
        L20:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Block cipher required "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private final java.lang.Throwable doFinal() {
            r8 = this;
            javax.crypto.Cipher r0 = r8.cipher
            r1 = 0
            int r0 = r0.getOutputSize(r1)
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            okio.BufferedSink r2 = r8.sink
            okio.Buffer r2 = r2.getBuffer()
            okio.Segment r0 = r2.writableSegment$okio(r0)
            javax.crypto.Cipher r3 = r8.cipher     // Catch: java.lang.Throwable -> L2e
            byte[] r4 = r0.data     // Catch: java.lang.Throwable -> L2e
            int r5 = r0.limit     // Catch: java.lang.Throwable -> L2e
            int r3 = r3.doFinal(r4, r5)     // Catch: java.lang.Throwable -> L2e
            int r4 = r0.limit     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 + r3
            r0.limit = r4     // Catch: java.lang.Throwable -> L2e
            long r4 = r2.size()     // Catch: java.lang.Throwable -> L2e
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L2e
            long r4 = r4 + r6
            r2.setSize$okio(r4)     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r1 = move-exception
        L2f:
            int r3 = r0.pos
            int r4 = r0.limit
            if (r3 != r4) goto L3e
            okio.Segment r3 = r0.pop()
            r2.head = r3
            okio.SegmentPool.recycle(r0)
        L3e:
            return r1
    }

    private final int update(okio.Buffer r9, long r10) {
            r8 = this;
            okio.Segment r0 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r10 = java.lang.Math.min(r10, r1)
            int r11 = (int) r10
            okio.BufferedSink r10 = r8.sink
            okio.Buffer r10 = r10.getBuffer()
            javax.crypto.Cipher r1 = r8.cipher
            int r1 = r1.getOutputSize(r11)
        L1c:
            r2 = 8192(0x2000, float:1.148E-41)
            if (r1 <= r2) goto L43
            int r2 = r8.blockSize
            if (r11 <= r2) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            if (r3 == 0) goto L31
            int r11 = r11 - r2
            javax.crypto.Cipher r1 = r8.cipher
            int r1 = r1.getOutputSize(r11)
            goto L1c
        L31:
            java.lang.String r9 = "Unexpected output size "
            java.lang.String r10 = " for input size "
            java.lang.String r9 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r9, r1, r10, r11)
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L43:
            okio.Segment r1 = r10.writableSegment$okio(r1)
            javax.crypto.Cipher r2 = r8.cipher
            byte[] r3 = r0.data
            int r4 = r0.pos
            byte[] r6 = r1.data
            int r7 = r1.limit
            r5 = r11
            int r2 = r2.update(r3, r4, r5, r6, r7)
            int r3 = r1.limit
            int r3 = r3 + r2
            r1.limit = r3
            long r3 = r10.size()
            long r5 = (long) r2
            long r3 = r3 + r5
            r10.setSize$okio(r3)
            int r2 = r1.pos
            int r3 = r1.limit
            if (r2 != r3) goto L73
            okio.Segment r2 = r1.pop()
            r10.head = r2
            okio.SegmentPool.recycle(r1)
        L73:
            okio.BufferedSink r10 = r8.sink
            r10.emitCompleteSegments()
            long r1 = r9.size()
            long r3 = (long) r11
            long r1 = r1 - r3
            r9.setSize$okio(r1)
            int r10 = r0.pos
            int r10 = r10 + r11
            r0.pos = r10
            int r1 = r0.limit
            if (r10 != r1) goto L93
            okio.Segment r10 = r0.pop()
            r9.head = r10
            okio.SegmentPool.recycle(r0)
        L93:
            return r11
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.closed = r0
            java.lang.Throwable r0 = r2.doFinal()
            okio.BufferedSink r1 = r2.sink     // Catch: java.lang.Throwable -> L12
            r1.close()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r1 = move-exception
            if (r0 != 0) goto L16
            r0 = r1
        L16:
            if (r0 != 0) goto L19
            return
        L19:
            throw r0
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            r0.flush()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final javax.crypto.Cipher getCipher() {
            r1 = this;
            javax.crypto.Cipher r0 = r1.cipher
            return r0
    }

    @Override // okio.Sink
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
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
            boolean r0 = r7.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L24
        L16:
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L23
            int r0 = r7.update(r8, r9)
            long r0 = (long) r0
            long r9 = r9 - r0
            goto L16
        L23:
            return
        L24:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }
}
