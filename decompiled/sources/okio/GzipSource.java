package okio;

/* JADX INFO: compiled from: GzipSource.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lokio/GzipSource;", "Lokio/Source;", "source", "(Lokio/Source;)V", "crc", "Ljava/util/zip/CRC32;", "inflater", "Ljava/util/zip/Inflater;", "inflaterSource", "Lokio/InflaterSource;", "section", "", "Lokio/RealBufferedSource;", "checkEqual", "", "name", "", "expected", "", "actual", "close", "consumeHeader", "consumeTrailer", "read", "", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "updateCrc", "buffer", "offset", "okio"}, k = 1, mv = {1, 4, 1})
public final class GzipSource implements okio.Source {
    private final java.util.zip.CRC32 crc;
    private final java.util.zip.Inflater inflater;
    private final okio.InflaterSource inflaterSource;
    private byte section;
    private final okio.RealBufferedSource source;

    public GzipSource(@org.jetbrains.annotations.NotNull okio.Source r3) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            okio.RealBufferedSource r0 = new okio.RealBufferedSource
            r0.<init>(r3)
            r2.source = r0
            java.util.zip.Inflater r3 = new java.util.zip.Inflater
            r1 = 1
            r3.<init>(r1)
            r2.inflater = r3
            okio.InflaterSource r1 = new okio.InflaterSource
            r1.<init>(r0, r3)
            r2.inflaterSource = r1
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32
            r3.<init>()
            r2.crc = r3
            return
    }

    private final void checkEqual(java.lang.String r5, int r6, int r7) {
            r4 = this;
            if (r7 != r6) goto L3
            return
        L3:
            java.io.IOException r0 = new java.io.IOException
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r5] = r7
            r5 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r5] = r6
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r6 = "%s: actual 0x%08x != expected 0x%08x"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.String r6 = "java.lang.String.format(this, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.<init>(r5)
            throw r0
    }

    private final void consumeHeader() throws java.io.IOException {
            r17 = this;
            r6 = r17
            okio.RealBufferedSource r0 = r6.source
            r1 = 10
            r0.require(r1)
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r0 = r0.bufferField
            r1 = 3
            byte r7 = r0.getByte(r1)
            int r0 = r7 >> 1
            r8 = 1
            r0 = r0 & r8
            r9 = 0
            if (r0 != r8) goto L1c
            r10 = 1
            goto L1d
        L1c:
            r10 = 0
        L1d:
            if (r10 == 0) goto L2c
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            r4 = 10
            r0 = r17
            r0.updateCrc(r1, r2, r4)
        L2c:
            okio.RealBufferedSource r0 = r6.source
            short r0 = r0.readShort()
            r1 = 8075(0x1f8b, float:1.1315E-41)
            java.lang.String r2 = "ID1ID2"
            r6.checkEqual(r2, r1, r0)
            okio.RealBufferedSource r0 = r6.source
            r1 = 8
            r0.skip(r1)
            int r0 = r7 >> 2
            r0 = r0 & r8
            if (r0 != r8) goto L47
            r0 = 1
            goto L48
        L47:
            r0 = 0
        L48:
            if (r0 == 0) goto L81
            okio.RealBufferedSource r0 = r6.source
            r1 = 2
            r0.require(r1)
            if (r10 == 0) goto L60
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            r4 = 2
            r0 = r17
            r0.updateCrc(r1, r2, r4)
        L60:
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r0 = r0.bufferField
            short r0 = r0.readShortLe()
            long r11 = (long) r0
            okio.RealBufferedSource r0 = r6.source
            r0.require(r11)
            if (r10 == 0) goto L7c
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            r0 = r17
            r4 = r11
            r0.updateCrc(r1, r2, r4)
        L7c:
            okio.RealBufferedSource r0 = r6.source
            r0.skip(r11)
        L81:
            int r0 = r7 >> 3
            r0 = r0 & r8
            if (r0 != r8) goto L88
            r0 = 1
            goto L89
        L88:
            r0 = 0
        L89:
            r11 = -1
            r13 = 1
            if (r0 == 0) goto Lb6
            okio.RealBufferedSource r0 = r6.source
            long r15 = r0.indexOf(r9)
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 == 0) goto Lb0
            if (r10 == 0) goto La8
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            long r4 = r15 + r13
            r0 = r17
            r0.updateCrc(r1, r2, r4)
        La8:
            okio.RealBufferedSource r0 = r6.source
            long r1 = r15 + r13
            r0.skip(r1)
            goto Lb6
        Lb0:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Lb6:
            int r0 = r7 >> 4
            r0 = r0 & r8
            if (r0 != r8) goto Lbc
            goto Lbd
        Lbc:
            r8 = 0
        Lbd:
            if (r8 == 0) goto Le5
            okio.RealBufferedSource r0 = r6.source
            long r7 = r0.indexOf(r9)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 == 0) goto Ldf
            if (r10 == 0) goto Ld8
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            long r4 = r7 + r13
            r0 = r17
            r0.updateCrc(r1, r2, r4)
        Ld8:
            okio.RealBufferedSource r0 = r6.source
            long r7 = r7 + r13
            r0.skip(r7)
            goto Le5
        Ldf:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Le5:
            if (r10 == 0) goto Lff
            okio.RealBufferedSource r0 = r6.source
            short r0 = r0.readShortLe()
            java.util.zip.CRC32 r1 = r6.crc
            long r1 = r1.getValue()
            int r2 = (int) r1
            short r1 = (short) r2
            java.lang.String r2 = "FHCRC"
            r6.checkEqual(r2, r0, r1)
            java.util.zip.CRC32 r0 = r6.crc
            r0.reset()
        Lff:
            return
    }

    private final void consumeTrailer() throws java.io.IOException {
            r3 = this;
            okio.RealBufferedSource r0 = r3.source
            int r0 = r0.readIntLe()
            java.util.zip.CRC32 r1 = r3.crc
            long r1 = r1.getValue()
            int r2 = (int) r1
            java.lang.String r1 = "CRC"
            r3.checkEqual(r1, r0, r2)
            okio.RealBufferedSource r0 = r3.source
            int r0 = r0.readIntLe()
            java.util.zip.Inflater r1 = r3.inflater
            long r1 = r1.getBytesWritten()
            int r2 = (int) r1
            java.lang.String r1 = "ISIZE"
            r3.checkEqual(r1, r0, r2)
            return
    }

    private final void updateCrc(okio.Buffer r6, long r7, long r9) {
            r5 = this;
            okio.Segment r6 = r6.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
        L5:
            int r0 = r6.limit
            int r1 = r6.pos
            int r2 = r0 - r1
            long r2 = (long) r2
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L19
            int r0 = r0 - r1
            long r0 = (long) r0
            long r7 = r7 - r0
            okio.Segment r6 = r6.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            goto L5
        L19:
            r0 = 0
        L1b:
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3d
            int r2 = r6.pos
            long r2 = (long) r2
            long r2 = r2 + r7
            int r7 = (int) r2
            int r8 = r6.limit
            int r8 = r8 - r7
            long r2 = (long) r8
            long r2 = java.lang.Math.min(r2, r9)
            int r8 = (int) r2
            java.util.zip.CRC32 r2 = r5.crc
            byte[] r3 = r6.data
            r2.update(r3, r7, r8)
            long r7 = (long) r8
            long r9 = r9 - r7
            okio.Segment r6 = r6.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r7 = r0
            goto L1b
        L3d:
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.InflaterSource r0 = r1.inflaterSource
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r12, long r13) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            r2 = 1
            int r3 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r3 < 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L58
            if (r3 != 0) goto L15
            return r0
        L15:
            byte r0 = r11.section
            if (r0 != 0) goto L1e
            r11.consumeHeader()
            r11.section = r2
        L1e:
            byte r0 = r11.section
            r3 = -1
            r1 = 2
            if (r0 != r2) goto L3c
            long r7 = r12.size()
            okio.InflaterSource r0 = r11.inflaterSource
            long r13 = r0.read(r12, r13)
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 == 0) goto L3a
            r5 = r11
            r6 = r12
            r9 = r13
            r5.updateCrc(r6, r7, r9)
            return r13
        L3a:
            r11.section = r1
        L3c:
            byte r12 = r11.section
            if (r12 != r1) goto L57
            r11.consumeTrailer()
            r12 = 3
            r11.section = r12
            okio.RealBufferedSource r12 = r11.source
            boolean r12 = r12.exhausted()
            if (r12 == 0) goto L4f
            goto L57
        L4f:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "gzip finished without exhausting source"
            r12.<init>(r13)
            throw r12
        L57:
            return r3
        L58:
            java.lang.String r12 = "byteCount < 0: "
            java.lang.String r12 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12, r13)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
    }

    @Override // okio.Source
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.RealBufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
