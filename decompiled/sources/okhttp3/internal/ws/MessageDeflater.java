package okhttp3.internal.ws;

/* JADX INFO: compiled from: MessageDeflater.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006J\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "noContextTakeover", "", "(Z)V", "deflatedBytes", "Lokio/Buffer;", "deflater", "Ljava/util/zip/Deflater;", "deflaterSink", "Lokio/DeflaterSink;", "close", "", "deflate", "buffer", "endsWith", "suffix", "Lokio/ByteString;", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class MessageDeflater implements java.io.Closeable {
    private final okio.Buffer deflatedBytes;
    private final java.util.zip.Deflater deflater;
    private final okio.DeflaterSink deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean r4) {
            r3 = this;
            r3.<init>()
            r3.noContextTakeover = r4
            okio.Buffer r4 = new okio.Buffer
            r4.<init>()
            r3.deflatedBytes = r4
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = -1
            r2 = 1
            r0.<init>(r1, r2)
            r3.deflater = r0
            okio.DeflaterSink r1 = new okio.DeflaterSink
            r1.<init>(r4, r0)
            r3.deflaterSink = r1
            return
    }

    private final boolean endsWith(okio.Buffer r5, okio.ByteString r6) {
            r4 = this;
            long r0 = r5.size()
            int r2 = r6.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            boolean r5 = r5.rangeEquals(r0, r6)
            return r5
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.DeflaterSink r0 = r1.deflaterSink
            r0.close()
            return
    }

    public final void deflate(@org.jetbrains.annotations.NotNull okio.Buffer r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            okio.Buffer r0 = r7.deflatedBytes
            long r0 = r0.size()
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L68
            boolean r0 = r7.noContextTakeover
            if (r0 == 0) goto L21
            java.util.zip.Deflater r0 = r7.deflater
            r0.reset()
        L21:
            okio.DeflaterSink r0 = r7.deflaterSink
            long r4 = r8.size()
            r0.write(r8, r4)
            okio.DeflaterSink r0 = r7.deflaterSink
            r0.flush()
            okio.Buffer r0 = r7.deflatedBytes
            okio.ByteString r1 = okhttp3.internal.ws.MessageDeflaterKt.access$getEMPTY_DEFLATE_BLOCK$p()
            boolean r0 = r7.endsWith(r0, r1)
            if (r0 == 0) goto L59
            okio.Buffer r0 = r7.deflatedBytes
            long r0 = r0.size()
            r3 = 4
            long r3 = (long) r3
            long r0 = r0 - r3
            okio.Buffer r3 = r7.deflatedBytes
            r4 = 0
            okio.Buffer$UnsafeCursor r2 = okio.Buffer.readAndWriteUnsafe$default(r3, r4, r2, r4)
            r2.resizeBuffer(r0)     // Catch: java.lang.Throwable -> L52
            kotlin.io.CloseableKt.closeFinally(r2, r4)
            goto L5e
        L52:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L54
        L54:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r8)
            throw r0
        L59:
            okio.Buffer r0 = r7.deflatedBytes
            r0.writeByte(r3)
        L5e:
            okio.Buffer r0 = r7.deflatedBytes
            long r1 = r0.size()
            r8.write(r0, r1)
            return
        L68:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }
}
