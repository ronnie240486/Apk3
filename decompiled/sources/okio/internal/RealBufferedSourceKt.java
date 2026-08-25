package okio.internal;

/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a%\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0080\b\u001a-\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u0016\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a\u001d\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001bH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u0018*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a\u001d\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010!\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010\"\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010#\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010$\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010%\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010&\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010(\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010)\u001a\u00020**\u00020\u0002H\u0080\b\u001a\u0015\u0010)\u001a\u00020**\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010+\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\u000f\u0010,\u001a\u0004\u0018\u00010**\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020**\u00020\u00022\u0006\u0010.\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00101\u001a\u00020\u0014*\u00020\u00022\u0006\u00102\u001a\u000203H\u0080\b\u001a\u0015\u00104\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u00105\u001a\u000206*\u00020\u0002H\u0080\b\u001a\r\u00107\u001a\u00020**\u00020\u0002H\u0080\b¨\u00068"}, d2 = {"commonClose", "", "Lokio/RealBufferedSource;", "commonExhausted", "", "commonIndexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonPeek", "Lokio/BufferedSource;", "commonRangeEquals", "offset", "bytesOffset", "", "byteCount", "commonRead", "sink", "", "Lokio/Buffer;", "commonReadAll", "Lokio/Sink;", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "commonReadShort", "", "commonReadShortLe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonRequest", "commonRequire", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonTimeout", "Lokio/Timeout;", "commonToString", "okio"}, k = 2, mv = {1, 4, 1})
public final class RealBufferedSourceKt {
    public static final void commonClose(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1) {
            java.lang.String r0 = "$this$commonClose"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.closed
            if (r0 == 0) goto La
            return
        La:
            r0 = 1
            r1.closed = r0
            okio.Source r0 = r1.source
            r0.close()
            okio.Buffer r1 = r1.bufferField
            r1.clear()
            return
    }

    public static final boolean commonExhausted(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r6) {
            java.lang.String r0 = "$this$commonExhausted"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r6.closed
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L27
            okio.Buffer r0 = r6.bufferField
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L25
            okio.Source r0 = r6.source
            okio.Buffer r6 = r6.bufferField
            r2 = 8192(0x2000, float:1.148E-41)
            long r2 = (long) r2
            long r2 = r0.read(r6, r2)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            return r1
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    public static final long commonIndexOf(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r8, byte r9, long r10, long r12) {
            java.lang.String r0 = "$this$commonIndexOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8.closed
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L71
            r2 = 0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L17
        L12:
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 < 0) goto L17
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 == 0) goto L4e
        L1a:
            r0 = -1
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 >= 0) goto L4d
            okio.Buffer r2 = r8.bufferField
            r3 = r9
            r4 = r10
            r6 = r12
            long r2 = r2.indexOf(r3, r4, r6)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L2e
            return r2
        L2e:
            okio.Buffer r2 = r8.bufferField
            long r2 = r2.size()
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 >= 0) goto L4d
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, float:1.148E-41)
            long r6 = (long) r6
            long r4 = r4.read(r5, r6)
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L48
            goto L4d
        L48:
            long r10 = java.lang.Math.max(r10, r2)
            goto L1a
        L4d:
            return r0
        L4e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "fromIndex="
            r8.append(r9)
            r8.append(r10)
            java.lang.String r9 = " toIndex="
            r8.append(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L71:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    public static final long commonIndexOf(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r8, @org.jetbrains.annotations.NotNull okio.ByteString r9, long r10) {
            java.lang.String r0 = "$this$commonIndexOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L41
        L10:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOf(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1d
            return r0
        L1d:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, float:1.148E-41)
            long r6 = (long) r6
            long r4 = r4.read(r5, r6)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L33
            return r2
        L33:
            int r2 = r9.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            long r10 = java.lang.Math.max(r10, r0)
            goto L10
        L41:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    public static final long commonIndexOfElement(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r8, @org.jetbrains.annotations.NotNull okio.ByteString r9, long r10) {
            java.lang.String r0 = "$this$commonIndexOfElement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L39
        L11:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOfElement(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1e
            return r0
        L1e:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, float:1.148E-41)
            long r6 = (long) r6
            long r4 = r4.read(r5, r6)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L34
            return r2
        L34:
            long r10 = java.lang.Math.max(r10, r0)
            goto L11
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSource commonPeek(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1) {
            java.lang.String r0 = "$this$commonPeek"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.PeekSource r0 = new okio.PeekSource
            r0.<init>(r1)
            okio.BufferedSource r1 = okio.Okio.buffer(r0)
            return r1
    }

    public static final boolean commonRangeEquals(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r7, long r8, @org.jetbrains.annotations.NotNull okio.ByteString r10, int r11, int r12) {
            java.lang.String r0 = "$this$commonRangeEquals"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r7.closed
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L46
            r2 = 0
            r0 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L45
            if (r11 < 0) goto L45
            if (r12 < 0) goto L45
            int r2 = r10.size()
            int r2 = r2 - r11
            if (r2 >= r12) goto L23
            goto L45
        L23:
            r2 = 0
        L24:
            if (r2 >= r12) goto L44
            long r3 = (long) r2
            long r3 = r3 + r8
            r5 = 1
            long r5 = r5 + r3
            boolean r5 = r7.request(r5)
            if (r5 != 0) goto L32
            return r0
        L32:
            okio.Buffer r5 = r7.bufferField
            byte r3 = r5.getByte(r3)
            int r4 = r11 + r2
            byte r4 = r10.getByte(r4)
            if (r3 == r4) goto L41
            return r0
        L41:
            int r2 = r2 + 1
            goto L24
        L44:
            return r1
        L45:
            return r0
        L46:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public static final int commonRead(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r9, @org.jetbrains.annotations.NotNull byte[] r10, int r11, int r12) {
            java.lang.String r0 = "$this$commonRead"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
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
            if (r12 != 0) goto L32
            okio.Source r12 = r9.source
            okio.Buffer r0 = r9.bufferField
            r1 = 8192(0x2000, float:1.148E-41)
            long r1 = (long) r1
            long r0 = r12.read(r0, r1)
            r2 = -1
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L32
            r9 = -1
            return r9
        L32:
            okio.Buffer r12 = r9.bufferField
            long r0 = r12.size()
            long r0 = java.lang.Math.min(r7, r0)
            int r12 = (int) r0
            okio.Buffer r9 = r9.bufferField
            int r9 = r9.read(r10, r11, r12)
            return r9
    }

    public static final long commonRead(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r5, @org.jetbrains.annotations.NotNull okio.Buffer r6, long r7) {
            java.lang.String r0 = "$this$commonRead"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 == 0) goto L55
            boolean r2 = r5.closed
            r2 = r2 ^ 1
            if (r2 == 0) goto L49
            okio.Buffer r2 = r5.bufferField
            long r2 = r2.size()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L38
            okio.Source r0 = r5.source
            okio.Buffer r1 = r5.bufferField
            r2 = 8192(0x2000, float:1.148E-41)
            long r2 = (long) r2
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L38
            return r2
        L38:
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            long r7 = java.lang.Math.min(r7, r0)
            okio.Buffer r5 = r5.bufferField
            long r5 = r5.read(r6, r7)
            return r5
        L49:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L55:
            java.lang.String r5 = "byteCount < 0: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r7)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public static final long commonReadAll(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r9, @org.jetbrains.annotations.NotNull okio.Sink r10) {
            java.lang.String r0 = "$this$commonReadAll"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r2 = r0
        Le:
            okio.Source r4 = r9.source
            okio.Buffer r5 = r9.bufferField
            r6 = 8192(0x2000, float:1.148E-41)
            long r6 = (long) r6
            long r4 = r4.read(r5, r6)
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L30
            okio.Buffer r4 = r9.bufferField
            long r4 = r4.completeSegmentByteCount()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto Le
            long r2 = r2 + r4
            okio.Buffer r6 = r9.bufferField
            r10.write(r6, r4)
            goto Le
        L30:
            okio.Buffer r4 = r9.bufferField
            long r4 = r4.size()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L4a
            okio.Buffer r0 = r9.bufferField
            long r0 = r0.size()
            long r2 = r2 + r0
            okio.Buffer r9 = r9.bufferField
            long r0 = r9.size()
            r10.write(r9, r0)
        L4a:
            return r2
    }

    public static final byte commonReadByte(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "$this$commonReadByte"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            byte r2 = r2.readByte()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonReadByteArray(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "$this$commonReadByteArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r2 = r2.bufferField
            byte[] r2 = r2.readByteArray()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonReadByteArray(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1, long r2) {
            java.lang.String r0 = "$this$commonReadByteArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.require(r2)
            okio.Buffer r1 = r1.bufferField
            byte[] r1 = r1.readByteArray(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonReadByteString(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "$this$commonReadByteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r2 = r2.bufferField
            okio.ByteString r2 = r2.readByteString()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonReadByteString(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1, long r2) {
            java.lang.String r0 = "$this$commonReadByteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.require(r2)
            okio.Buffer r1 = r1.bufferField
            okio.ByteString r1 = r1.readByteString(r2)
            return r1
    }

    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r10) {
            java.lang.String r0 = "$this$commonReadDecimalLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        Ld:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L5a
            okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L25
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2f
        L25:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L31
            r4 = 45
            byte r4 = (byte) r4
            if (r8 == r4) goto L2f
            goto L31
        L2f:
            r4 = r6
            goto Ld
        L31:
            if (r9 == 0) goto L34
            goto L5a
        L34:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            r1 = 16
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L5a:
            okio.Buffer r10 = r10.bufferField
            long r0 = r10.readDecimalLong()
            return r0
    }

    public static final void commonReadFully(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1, @org.jetbrains.annotations.NotNull okio.Buffer r2, long r3) {
            java.lang.String r0 = "$this$commonReadFully"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.require(r3)     // Catch: java.io.EOFException -> L14
            okio.Buffer r1 = r1.bufferField
            r1.readFully(r2, r3)
            return
        L14:
            r3 = move-exception
            okio.Buffer r1 = r1.bufferField
            r2.writeAll(r1)
            throw r3
    }

    public static final void commonReadFully(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r7, @org.jetbrains.annotations.NotNull byte[] r8) {
            java.lang.String r0 = "$this$commonReadFully"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.length     // Catch: java.io.EOFException -> L16
            long r0 = (long) r0     // Catch: java.io.EOFException -> L16
            r7.require(r0)     // Catch: java.io.EOFException -> L16
            okio.Buffer r7 = r7.bufferField
            r7.readFully(r8)
            return
        L16:
            r0 = move-exception
            r1 = 0
        L18:
            okio.Buffer r2 = r7.bufferField
            long r2 = r2.size()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3a
            okio.Buffer r2 = r7.bufferField
            long r3 = r2.size()
            int r4 = (int) r3
            int r2 = r2.read(r8, r1, r4)
            r3 = -1
            if (r2 == r3) goto L34
            int r1 = r1 + r2
            goto L18
        L34:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L3a:
            throw r0
    }

    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r5) {
            java.lang.String r0 = "$this$commonReadHexadecimalUnsignedLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1
            r5.require(r0)
            r0 = 0
        Lb:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L65
            okio.Buffer r2 = r5.bufferField
            long r3 = (long) r0
            byte r2 = r2.getByte(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L25
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L3a
        L25:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L2f
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L3a
        L2f:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L3c
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L3a
            goto L3c
        L3a:
            r0 = r1
            goto Lb
        L3c:
            if (r0 == 0) goto L3f
            goto L65
        L3f:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            r1 = 16
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L65:
            okio.Buffer r5 = r5.bufferField
            long r0 = r5.readHexadecimalUnsignedLong()
            return r0
    }

    public static final int commonReadInt(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "$this$commonReadInt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            int r2 = r2.readInt()
            return r2
    }

    public static final int commonReadIntLe(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "$this$commonReadIntLe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            int r2 = r2.readIntLe()
            return r2
    }

    public static final long commonReadLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "$this$commonReadLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 8
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            long r0 = r2.readLong()
            return r0
    }

    public static final long commonReadLongLe(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "$this$commonReadLongLe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 8
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            long r0 = r2.readLongLe()
            return r0
    }

    public static final short commonReadShort(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "$this$commonReadShort"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 2
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            short r2 = r2.readShort()
            return r2
    }

    public static final short commonReadShortLe(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "$this$commonReadShortLe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 2
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            short r2 = r2.readShortLe()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonReadUtf8(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "$this$commonReadUtf8"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r2 = r2.bufferField
            java.lang.String r2 = r2.readUtf8()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonReadUtf8(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1, long r2) {
            java.lang.String r0 = "$this$commonReadUtf8"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.require(r2)
            okio.Buffer r1 = r1.bufferField
            java.lang.String r1 = r1.readUtf8(r2)
            return r1
    }

    public static final int commonReadUtf8CodePoint(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r3) {
            java.lang.String r0 = "$this$commonReadUtf8CodePoint"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            r3.require(r0)
            okio.Buffer r0 = r3.bufferField
            r1 = 0
            byte r0 = r0.getByte(r1)
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r2 = 192(0xc0, float:2.69E-43)
            if (r1 != r2) goto L1e
            r0 = 2
            r3.require(r0)
            goto L35
        L1e:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r2) goto L2a
            r0 = 3
            r3.require(r0)
            goto L35
        L2a:
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 != r1) goto L35
            r0 = 4
            r3.require(r0)
        L35:
            okio.Buffer r3 = r3.bufferField
            int r3 = r3.readUtf8CodePoint()
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String commonReadUtf8Line(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r5) {
            java.lang.String r0 = "$this$commonReadUtf8Line"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 10
            byte r0 = (byte) r0
            long r0 = r5.indexOf(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2b
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L29
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            java.lang.String r5 = r5.readUtf8(r0)
            goto L31
        L29:
            r5 = 0
            goto L31
        L2b:
            okio.Buffer r5 = r5.bufferField
            java.lang.String r5 = okio.internal.BufferKt.readUtf8Line(r5, r0)
        L31:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonReadUtf8LineStrict(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r13, long r14) {
            java.lang.String r0 = "$this$commonReadUtf8LineStrict"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto Lb0
            r0 = 1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 != 0) goto L1d
            r4 = r2
            goto L1f
        L1d:
            long r4 = r14 + r0
        L1f:
            r6 = 10
            byte r12 = (byte) r6
            r8 = 0
            r6 = r13
            r7 = r12
            r10 = r4
            long r6 = r6.indexOf(r7, r8, r10)
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L38
            okio.Buffer r13 = r13.bufferField
            java.lang.String r13 = okio.internal.BufferKt.readUtf8Line(r13, r6)
            return r13
        L38:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L65
            boolean r2 = r13.request(r4)
            if (r2 == 0) goto L65
            okio.Buffer r2 = r13.bufferField
            long r6 = r4 - r0
            byte r2 = r2.getByte(r6)
            r3 = 13
            byte r3 = (byte) r3
            if (r2 != r3) goto L65
            long r0 = r0 + r4
            boolean r0 = r13.request(r0)
            if (r0 == 0) goto L65
            okio.Buffer r0 = r13.bufferField
            byte r0 = r0.getByte(r4)
            if (r0 != r12) goto L65
            okio.Buffer r13 = r13.bufferField
            java.lang.String r13 = okio.internal.BufferKt.readUtf8Line(r13, r4)
            return r13
        L65:
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
            okio.Buffer r13 = r13.bufferField
            long r2 = r13.size()
            long r13 = java.lang.Math.min(r2, r14)
            r1.append(r13)
            java.lang.String r13 = " content="
            r1.append(r13)
            okio.ByteString r13 = r6.readByteString()
            java.lang.String r13 = r13.hex()
            r1.append(r13)
            java.lang.String r13 = "…"
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        Lb0:
            java.lang.String r13 = "limit < 0: "
            java.lang.String r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13, r14)
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
    }

    public static final boolean commonRequest(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r7, long r8) {
            java.lang.String r0 = "$this$commonRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L40
            boolean r2 = r7.closed
            r2 = r2 ^ r1
            if (r2 == 0) goto L34
        L17:
            okio.Buffer r2 = r7.bufferField
            long r2 = r2.size()
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 >= 0) goto L33
            okio.Source r2 = r7.source
            okio.Buffer r3 = r7.bufferField
            r4 = 8192(0x2000, float:1.148E-41)
            long r4 = (long) r4
            long r2 = r2.read(r3, r4)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L17
            return r0
        L33:
            return r1
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.String r7 = "byteCount < 0: "
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7, r8)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    public static final void commonRequire(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1, long r2) {
            java.lang.String r0 = "$this$commonRequire"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r1 = r1.request(r2)
            if (r1 == 0) goto Lc
            return
        Lc:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public static final int commonSelect(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r8, @org.jetbrains.annotations.NotNull okio.Options r9) {
            java.lang.String r0 = "$this$commonSelect"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.closed
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L40
        L10:
            okio.Buffer r0 = r8.bufferField
            int r0 = okio.internal.BufferKt.selectPrefix(r0, r9, r1)
            r2 = -2
            r3 = -1
            if (r0 == r2) goto L2e
            if (r0 == r3) goto L2d
            okio.ByteString[] r9 = r9.getByteStrings$okio()
            r9 = r9[r0]
            int r9 = r9.size()
            okio.Buffer r8 = r8.bufferField
            long r1 = (long) r9
            r8.skip(r1)
            return r0
        L2d:
            return r3
        L2e:
            okio.Source r0 = r8.source
            okio.Buffer r2 = r8.bufferField
            r4 = 8192(0x2000, float:1.148E-41)
            long r4 = (long) r4
            long r4 = r0.read(r2, r4)
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L10
            return r3
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    public static final void commonSkip(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r5, long r6) {
            java.lang.String r0 = "$this$commonSkip"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5.closed
            r0 = r0 ^ 1
            if (r0 == 0) goto L45
        Lb:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L44
            okio.Buffer r2 = r5.bufferField
            long r2 = r2.size()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L33
            okio.Source r0 = r5.source
            okio.Buffer r1 = r5.bufferField
            r2 = 8192(0x2000, float:1.148E-41)
            long r2 = (long) r2
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2d
            goto L33
        L2d:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L33:
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            long r0 = java.lang.Math.min(r6, r0)
            okio.Buffer r2 = r5.bufferField
            r2.skip(r0)
            long r6 = r6 - r0
            goto Lb
        L44:
            return
        L45:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Timeout commonTimeout(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r1) {
            java.lang.String r0 = "$this$commonTimeout"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.Source r1 = r1.source
            okio.Timeout r1 = r1.timeout()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonToString(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r2) {
            java.lang.String r0 = "$this$commonToString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "buffer("
            r0.append(r1)
            okio.Source r2 = r2.source
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
