package okio.internal;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0000\u001a\r\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0080\b\u001a\r\u0010\u0014\u001a\u00020\u0012*\u00020\u0015H\u0080\b\u001a\r\u0010\u0016\u001a\u00020\u0005*\u00020\u0013H\u0080\b\u001a\r\u0010\u0017\u001a\u00020\u0013*\u00020\u0013H\u0080\b\u001a%\u0010\u0018\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0080\b\u001a\u0017\u0010\u001c\u001a\u00020\n*\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u0005*\u00020\u00152\u0006\u0010 \u001a\u00020\bH\u0080\b\u001a\u0015\u0010!\u001a\u00020\"*\u00020\u00132\u0006\u0010#\u001a\u00020\u0005H\u0080\b\u001a\r\u0010$\u001a\u00020\b*\u00020\u0013H\u0080\b\u001a%\u0010%\u001a\u00020\u0005*\u00020\u00132\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0080\b\u001a\u001d\u0010%\u001a\u00020\u0005*\u00020\u00132\u0006\u0010\u000e\u001a\u00020)2\u0006\u0010'\u001a\u00020\u0005H\u0080\b\u001a\u001d\u0010*\u001a\u00020\u0005*\u00020\u00132\u0006\u0010+\u001a\u00020)2\u0006\u0010'\u001a\u00020\u0005H\u0080\b\u001a\r\u0010,\u001a\u00020\b*\u00020\u0015H\u0080\b\u001a-\u0010-\u001a\u00020\n*\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0080\b\u001a\u0015\u0010.\u001a\u00020\b*\u00020\u00132\u0006\u0010/\u001a\u00020\u0001H\u0080\b\u001a%\u0010.\u001a\u00020\b*\u00020\u00132\u0006\u0010/\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0080\b\u001a\u001d\u0010.\u001a\u00020\u0005*\u00020\u00132\u0006\u0010/\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0005H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0005*\u00020\u00132\u0006\u0010/\u001a\u000201H\u0080\b\u001a\u0014\u00102\u001a\u00020\u0015*\u00020\u00132\u0006\u00103\u001a\u00020\u0015H\u0000\u001a\r\u00104\u001a\u00020\"*\u00020\u0013H\u0080\b\u001a\r\u00105\u001a\u00020\u0001*\u00020\u0013H\u0080\b\u001a\u0015\u00105\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0005H\u0080\b\u001a\r\u00106\u001a\u00020)*\u00020\u0013H\u0080\b\u001a\u0015\u00106\u001a\u00020)*\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0005H\u0080\b\u001a\r\u00107\u001a\u00020\u0005*\u00020\u0013H\u0080\b\u001a\u0015\u00108\u001a\u00020\u0012*\u00020\u00132\u0006\u0010/\u001a\u00020\u0001H\u0080\b\u001a\u001d\u00108\u001a\u00020\u0012*\u00020\u00132\u0006\u0010/\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0005H\u0080\b\u001a\r\u00109\u001a\u00020\u0005*\u00020\u0013H\u0080\b\u001a\r\u0010:\u001a\u00020\b*\u00020\u0013H\u0080\b\u001a\r\u0010;\u001a\u00020\u0005*\u00020\u0013H\u0080\b\u001a\r\u0010<\u001a\u00020=*\u00020\u0013H\u0080\b\u001a\u0014\u0010>\u001a\u00020\u0015*\u00020\u00132\u0006\u00103\u001a\u00020\u0015H\u0000\u001a\u0015\u0010?\u001a\u00020@*\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0005H\u0080\b\u001a\r\u0010A\u001a\u00020\b*\u00020\u0013H\u0080\b\u001a\u000f\u0010B\u001a\u0004\u0018\u00010@*\u00020\u0013H\u0080\b\u001a\u0015\u0010C\u001a\u00020@*\u00020\u00132\u0006\u0010D\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010E\u001a\u00020\u0005*\u00020\u00152\u0006\u0010F\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010G\u001a\u00020\b*\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010H\u001a\u00020\b*\u00020\u00132\u0006\u0010I\u001a\u00020JH\u0080\b\u001a\u0015\u0010K\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0005H\u0080\b\u001a\r\u0010L\u001a\u00020)*\u00020\u0013H\u0080\b\u001a\u0015\u0010L\u001a\u00020)*\u00020\u00132\u0006\u0010\u001b\u001a\u00020\bH\u0080\b\u001a\u0015\u0010M\u001a\u00020\f*\u00020\u00132\u0006\u0010N\u001a\u00020\bH\u0080\b\u001a\u0015\u0010O\u001a\u00020\u0013*\u00020\u00132\u0006\u0010P\u001a\u00020\u0001H\u0080\b\u001a%\u0010O\u001a\u00020\u0013*\u00020\u00132\u0006\u0010P\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0080\b\u001a\u001d\u0010O\u001a\u00020\u0012*\u00020\u00132\u0006\u0010P\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0005H\u0080\b\u001a)\u0010O\u001a\u00020\u0013*\u00020\u00132\u0006\u0010Q\u001a\u00020)2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\bH\u0080\b\u001a\u001d\u0010O\u001a\u00020\u0013*\u00020\u00132\u0006\u0010P\u001a\u00020R2\u0006\u0010\u001b\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010S\u001a\u00020\u0005*\u00020\u00132\u0006\u0010P\u001a\u00020RH\u0080\b\u001a\u0015\u0010T\u001a\u00020\u0013*\u00020\u00132\u0006\u0010&\u001a\u00020\bH\u0080\b\u001a\u0015\u0010U\u001a\u00020\u0013*\u00020\u00132\u0006\u0010V\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010W\u001a\u00020\u0013*\u00020\u00132\u0006\u0010V\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010X\u001a\u00020\u0013*\u00020\u00132\u0006\u0010Y\u001a\u00020\bH\u0080\b\u001a\u0015\u0010Z\u001a\u00020\u0013*\u00020\u00132\u0006\u0010V\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010[\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\\\u001a\u00020\bH\u0080\b\u001a%\u0010]\u001a\u00020\u0013*\u00020\u00132\u0006\u0010^\u001a\u00020@2\u0006\u0010_\u001a\u00020\b2\u0006\u0010`\u001a\u00020\bH\u0080\b\u001a\u0015\u0010a\u001a\u00020\u0013*\u00020\u00132\u0006\u0010b\u001a\u00020\bH\u0080\b\u001a\u0014\u0010c\u001a\u00020@*\u00020\u00132\u0006\u0010d\u001a\u00020\u0005H\u0000\u001a?\u0010e\u001a\u0002Hf\"\u0004\b\u0000\u0010f*\u00020\u00132\u0006\u0010'\u001a\u00020\u00052\u001a\u0010g\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002Hf0hH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010i\u001a\u001e\u0010j\u001a\u00020\b*\u00020\u00132\u0006\u0010I\u001a\u00020J2\b\b\u0002\u0010k\u001a\u00020\nH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006l"}, d2 = {"HEX_DIGIT_BYTES", "", "getHEX_DIGIT_BYTES", "()[B", "OVERFLOW_DIGIT_START", "", "OVERFLOW_ZONE", "SEGMENTING_THRESHOLD", "", "rangeEquals", "", "segment", "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "commonClear", "", "Lokio/Buffer;", "commonClose", "Lokio/Buffer$UnsafeCursor;", "commonCompleteSegmentByteCount", "commonCopy", "commonCopyTo", "out", "offset", "byteCount", "commonEquals", "other", "", "commonExpandBuffer", "minByteCount", "commonGet", "", "pos", "commonHashCode", "commonIndexOf", "b", "fromIndex", "toIndex", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonNext", "commonRangeEquals", "commonRead", "sink", "commonReadAll", "Lokio/Sink;", "commonReadAndWriteUnsafe", "unsafeCursor", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadLong", "commonReadShort", "", "commonReadUnsafe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonResizeBuffer", "newSize", "commonSeek", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonSnapshot", "commonWritableSegment", "minimumCapacity", "commonWrite", "source", "byteString", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteLong", "commonWriteShort", "s", "commonWriteUtf8", "string", "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "readUtf8Line", "newline", "seek", "T", "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "selectTruncated", "okio"}, k = 2, mv = {1, 4, 1})
public final class BufferKt {

    @org.jetbrains.annotations.NotNull
    private static final byte[] HEX_DIGIT_BYTES = null;
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    static {
            java.lang.String r0 = "0123456789abcdef"
            byte[] r0 = okio.Platform.asUtf8ToByteArray(r0)
            okio.internal.BufferKt.HEX_DIGIT_BYTES = r0
            return
    }

    public static final void commonClear(@org.jetbrains.annotations.NotNull okio.Buffer r2) {
            java.lang.String r0 = "$this$commonClear"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r0 = r2.size()
            r2.skip(r0)
            return
    }

    public static final void commonClose(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r3) {
            java.lang.String r0 = "$this$commonClose"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.Buffer r0 = r3.buffer
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L20
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
        L20:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "not attached to a buffer"
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public static final long commonCompleteSegmentByteCount(@org.jetbrains.annotations.NotNull okio.Buffer r5) {
            java.lang.String r0 = "$this$commonCompleteSegmentByteCount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            return r2
        L10:
            okio.Segment r5 = r5.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            okio.Segment r5 = r5.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r2 = r5.limit
            r3 = 8192(0x2000, float:1.148E-41)
            if (r2 >= r3) goto L29
            boolean r3 = r5.owner
            if (r3 == 0) goto L29
            int r5 = r5.pos
            int r2 = r2 - r5
            long r2 = (long) r2
            long r0 = r0 - r2
        L29:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonCopy(@org.jetbrains.annotations.NotNull okio.Buffer r6) {
            java.lang.String r0 = "$this$commonCopy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            long r1 = r6.size()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L15
            return r0
        L15:
            okio.Segment r1 = r6.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.Segment r2 = r1.sharedCopy()
            r0.head = r2
            r2.prev = r2
            r2.next = r2
            okio.Segment r3 = r1.next
        L26:
            if (r3 == r1) goto L3a
            okio.Segment r4 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r5 = r3.sharedCopy()
            r4.push(r5)
            okio.Segment r3 = r3.next
            goto L26
        L3a:
            long r1 = r6.size()
            r0.setSize$okio(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonCopyTo(@org.jetbrains.annotations.NotNull okio.Buffer r8, @org.jetbrains.annotations.NotNull okio.Buffer r9, long r10, long r12) {
            java.lang.String r0 = "$this$commonCopyTo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r1 = r8.size()
            r3 = r10
            r5 = r12
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 != 0) goto L1a
            return r8
        L1a:
            long r2 = r9.size()
            long r2 = r2 + r12
            r9.setSize$okio(r2)
            okio.Segment r2 = r8.head
        L24:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.limit
            int r4 = r2.pos
            int r5 = r3 - r4
            long r5 = (long) r5
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 < 0) goto L38
            int r3 = r3 - r4
            long r3 = (long) r3
            long r10 = r10 - r3
            okio.Segment r2 = r2.next
            goto L24
        L38:
            int r3 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r3 <= 0) goto L74
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
            if (r10 != 0) goto L5e
            r3.prev = r3
            r3.next = r3
            r9.head = r3
            goto L69
        L5e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            okio.Segment r10 = r10.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            r10.push(r3)
        L69:
            int r10 = r3.limit
            int r11 = r3.pos
            int r10 = r10 - r11
            long r10 = (long) r10
            long r12 = r12 - r10
            okio.Segment r2 = r2.next
            r10 = r0
            goto L38
        L74:
            return r8
    }

    public static final boolean commonEquals(@org.jetbrains.annotations.NotNull okio.Buffer r18, @org.jetbrains.annotations.Nullable java.lang.Object r19) {
            r0 = r18
            r1 = r19
            java.lang.String r2 = "$this$commonEquals"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = 1
            if (r0 != r1) goto Ld
            return r2
        Ld:
            boolean r3 = r1 instanceof okio.Buffer
            r4 = 0
            if (r3 != 0) goto L13
            return r4
        L13:
            long r5 = r18.size()
            okio.Buffer r1 = (okio.Buffer) r1
            long r7 = r1.size()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L22
            return r4
        L22:
            long r5 = r18.size()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L2d
            return r2
        L2d:
            okio.Segment r3 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r1 = r1.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r5 = r3.pos
            int r6 = r1.pos
            r9 = r7
        L3c:
            long r11 = r18.size()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L83
            int r11 = r3.limit
            int r11 = r11 - r5
            int r12 = r1.limit
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L50:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L6b
            byte[] r15 = r3.data
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.data
            int r17 = r6 + 1
            r6 = r15[r6]
            if (r5 == r6) goto L63
            return r4
        L63:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L50
        L6b:
            int r13 = r3.limit
            if (r5 != r13) goto L76
            okio.Segment r3 = r3.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r5 = r3.pos
        L76:
            int r13 = r1.limit
            if (r6 != r13) goto L81
            okio.Segment r1 = r1.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r6 = r1.pos
        L81:
            long r9 = r9 + r11
            goto L3c
        L83:
            return r2
    }

    public static final long commonExpandBuffer(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r9, int r10) {
            java.lang.String r0 = "$this$commonExpandBuffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 1
            if (r10 <= 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L69
            r1 = 8192(0x2000, float:1.148E-41)
            if (r10 > r1) goto L12
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L59
            okio.Buffer r0 = r9.buffer
            if (r0 == 0) goto L4d
            boolean r2 = r9.readWrite
            if (r2 == 0) goto L41
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
        L41:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "expandBuffer() only permitted for read/write buffers"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L4d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "not attached to a buffer"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L59:
            java.lang.String r9 = "minByteCount > Segment.SIZE: "
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L69:
            java.lang.String r9 = "minByteCount <= 0: "
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static final byte commonGet(@org.jetbrains.annotations.NotNull okio.Buffer r7, long r8) {
            java.lang.String r0 = "$this$commonGet"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            long r1 = r7.size()
            r5 = 1
            r3 = r8
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r7.head
            if (r0 == 0) goto L61
            long r1 = r7.size()
            long r1 = r1 - r8
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 >= 0) goto L3f
            long r1 = r7.size()
        L20:
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 <= 0) goto L31
            okio.Segment r0 = r0.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r7 = r0.limit
            int r3 = r0.pos
            int r7 = r7 - r3
            long r3 = (long) r7
            long r1 = r1 - r3
            goto L20
        L31:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            byte[] r7 = r0.data
            int r0 = r0.pos
            long r3 = (long) r0
            long r3 = r3 + r8
            long r3 = r3 - r1
            int r8 = (int) r3
            r7 = r7[r8]
            return r7
        L3f:
            r1 = 0
        L41:
            int r7 = r0.limit
            int r3 = r0.pos
            int r7 = r7 - r3
            long r3 = (long) r7
            long r3 = r3 + r1
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 <= 0) goto L5a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            byte[] r7 = r0.data
            int r0 = r0.pos
            long r3 = (long) r0
            long r3 = r3 + r8
            long r3 = r3 - r1
            int r8 = (int) r3
            r7 = r7[r8]
            return r7
        L5a:
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r3
            goto L41
        L61:
            r7 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            throw r7
    }

    public static final int commonHashCode(@org.jetbrains.annotations.NotNull okio.Buffer r5) {
            java.lang.String r0 = "$this$commonHashCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okio.Segment r0 = r5.head
            if (r0 == 0) goto L24
            r1 = 1
        La:
            int r2 = r0.pos
            int r3 = r0.limit
        Le:
            if (r2 >= r3) goto L1a
            int r1 = r1 * 31
            byte[] r4 = r0.data
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto Le
        L1a:
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okio.Segment r2 = r5.head
            if (r0 != r2) goto La
            return r1
        L24:
            r5 = 0
            return r5
    }

    public static final long commonIndexOf(@org.jetbrains.annotations.NotNull okio.Buffer r9, byte r10, long r11, long r13) {
            java.lang.String r0 = "$this$commonIndexOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto Lc
            goto L12
        Lc:
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 < 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto Lc6
            long r2 = r9.size()
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 <= 0) goto L21
            long r13 = r9.size()
        L21:
            r2 = -1
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 != 0) goto L28
            return r2
        L28:
            okio.Segment r4 = r9.head
            if (r4 == 0) goto Lc5
            long r5 = r9.size()
            long r5 = r5 - r11
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 >= 0) goto L7c
            long r0 = r9.size()
        L39:
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 <= 0) goto L4a
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r9 = r4.limit
            int r5 = r4.pos
            int r9 = r9 - r5
            long r5 = (long) r9
            long r0 = r0 - r5
            goto L39
        L4a:
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 >= 0) goto L7b
            byte[] r9 = r4.data
            int r5 = r4.limit
            long r5 = (long) r5
            int r7 = r4.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            long r5 = java.lang.Math.min(r5, r7)
            int r6 = (int) r5
            int r5 = r4.pos
            long r7 = (long) r5
            long r7 = r7 + r11
            long r7 = r7 - r0
            int r11 = (int) r7
        L63:
            if (r11 >= r6) goto L6d
            r12 = r9[r11]
            if (r12 != r10) goto L6a
            goto La6
        L6a:
            int r11 = r11 + 1
            goto L63
        L6d:
            int r9 = r4.limit
            int r11 = r4.pos
            int r9 = r9 - r11
            long r11 = (long) r9
            long r0 = r0 + r11
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r11 = r0
            goto L4a
        L7b:
            return r2
        L7c:
            int r9 = r4.limit
            int r5 = r4.pos
            int r9 = r9 - r5
            long r5 = (long) r9
            long r5 = r5 + r0
            int r9 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r9 <= 0) goto Lbe
        L87:
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 >= 0) goto Lbd
            byte[] r9 = r4.data
            int r5 = r4.limit
            long r5 = (long) r5
            int r7 = r4.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            long r5 = java.lang.Math.min(r5, r7)
            int r6 = (int) r5
            int r5 = r4.pos
            long r7 = (long) r5
            long r7 = r7 + r11
            long r7 = r7 - r0
            int r11 = (int) r7
        La0:
            if (r11 >= r6) goto Laf
            r12 = r9[r11]
            if (r12 != r10) goto Lac
        La6:
            int r9 = r4.pos
            int r11 = r11 - r9
            long r9 = (long) r11
            long r9 = r9 + r0
            return r9
        Lac:
            int r11 = r11 + 1
            goto La0
        Laf:
            int r9 = r4.limit
            int r11 = r4.pos
            int r9 = r9 - r11
            long r11 = (long) r9
            long r0 = r0 + r11
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r11 = r0
            goto L87
        Lbd:
            return r2
        Lbe:
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0 = r5
            goto L7c
        Lc5:
            return r2
        Lc6:
            java.lang.String r10 = "size="
            java.lang.StringBuilder r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10)
            long r0 = r9.size()
            r10.append(r0)
            java.lang.String r9 = " fromIndex="
            r10.append(r9)
            r10.append(r11)
            java.lang.String r9 = " toIndex="
            r10.append(r9)
            r10.append(r13)
            java.lang.String r9 = r10.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static final long commonIndexOf(@org.jetbrains.annotations.NotNull okio.Buffer r17, @org.jetbrains.annotations.NotNull okio.ByteString r18, long r19) {
            r0 = r17
            r1 = r19
            java.lang.String r3 = "$this$commonIndexOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "bytes"
            r4 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            int r3 = r18.size()
            r5 = 0
            if (r3 <= 0) goto L19
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
            if (r3 == 0) goto L119
            r7 = 0
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 < 0) goto L24
            r3 = 1
            goto L25
        L24:
            r3 = 0
        L25:
            if (r3 == 0) goto L109
            okio.Segment r3 = r0.head
            if (r3 == 0) goto L106
            long r9 = r17.size()
            long r9 = r9 - r1
            r11 = 1
            int r13 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r13 >= 0) goto La1
            long r7 = r17.size()
        L3a:
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 <= 0) goto L4b
            okio.Segment r3 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r9 = r3.limit
            int r10 = r3.pos
            int r9 = r9 - r10
            long r9 = (long) r9
            long r7 = r7 - r9
            goto L3a
        L4b:
            byte[] r9 = r18.internalArray$okio()
            r5 = r9[r5]
            int r4 = r18.size()
            long r13 = r17.size()
            r15 = r7
            long r6 = (long) r4
            long r13 = r13 - r6
            long r13 = r13 + r11
            r7 = r15
        L5e:
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 >= 0) goto L9e
            byte[] r0 = r3.data
            int r6 = r3.limit
            int r11 = r3.pos
            long r11 = (long) r11
            long r11 = r11 + r13
            long r11 = r11 - r7
            r17 = r13
            long r13 = (long) r6
            long r11 = java.lang.Math.min(r13, r11)
            int r6 = (int) r11
            int r11 = r3.pos
            long r11 = (long) r11
            long r11 = r11 + r1
            long r11 = r11 - r7
            int r1 = (int) r11
        L79:
            if (r1 >= r6) goto L8d
            r2 = r0[r1]
            if (r2 != r5) goto L89
            int r2 = r1 + 1
            r10 = 1
            boolean r2 = rangeEquals(r3, r2, r9, r10, r4)
            if (r2 == 0) goto L8a
            goto Le5
        L89:
            r10 = 1
        L8a:
            int r1 = r1 + 1
            goto L79
        L8d:
            r10 = 1
            int r0 = r3.limit
            int r1 = r3.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r7 = r7 + r0
            okio.Segment r3 = r3.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r13 = r17
            r1 = r7
            goto L5e
        L9e:
            r0 = -1
            return r0
        La1:
            int r6 = r3.limit
            int r9 = r3.pos
            int r6 = r6 - r9
            long r9 = (long) r6
            long r9 = r9 + r7
            int r6 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r6 <= 0) goto Lff
            byte[] r6 = r18.internalArray$okio()
            r5 = r6[r5]
            int r4 = r18.size()
            long r9 = r17.size()
            long r13 = (long) r4
            long r9 = r9 - r13
            long r9 = r9 + r11
        Lbd:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto Lfc
            byte[] r0 = r3.data
            int r11 = r3.limit
            int r12 = r3.pos
            long r12 = (long) r12
            long r12 = r12 + r9
            long r12 = r12 - r7
            long r14 = (long) r11
            long r11 = java.lang.Math.min(r14, r12)
            int r12 = (int) r11
            int r11 = r3.pos
            long r13 = (long) r11
            long r13 = r13 + r1
            long r13 = r13 - r7
            int r1 = (int) r13
        Ld6:
            if (r1 >= r12) goto Lee
            r2 = r0[r1]
            if (r2 != r5) goto Leb
            int r2 = r1 + 1
            r11 = 1
            boolean r2 = rangeEquals(r3, r2, r6, r11, r4)
            if (r2 == 0) goto Leb
        Le5:
            int r0 = r3.pos
            int r1 = r1 - r0
            long r0 = (long) r1
            long r0 = r0 + r7
            return r0
        Leb:
            int r1 = r1 + 1
            goto Ld6
        Lee:
            int r0 = r3.limit
            int r1 = r3.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r7 = r7 + r0
            okio.Segment r3 = r3.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r1 = r7
            goto Lbd
        Lfc:
            r0 = -1
            return r0
        Lff:
            okio.Segment r3 = r3.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r7 = r9
            goto La1
        L106:
            r0 = -1
            return r0
        L109:
            java.lang.String r0 = "fromIndex < 0: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L119:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bytes is empty"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final long commonIndexOfElement(@org.jetbrains.annotations.NotNull okio.Buffer r11, @org.jetbrains.annotations.NotNull okio.ByteString r12, long r13) {
            java.lang.String r0 = "$this$commonIndexOfElement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            r2 = 0
            r3 = 1
            int r4 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r4 < 0) goto L15
            r4 = 1
            goto L16
        L15:
            r4 = 0
        L16:
            if (r4 == 0) goto L13f
            okio.Segment r4 = r11.head
            r5 = -1
            if (r4 == 0) goto L13e
            long r7 = r11.size()
            long r7 = r7 - r13
            r9 = 2
            int r10 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r10 >= 0) goto Lb1
            long r0 = r11.size()
        L2c:
            int r7 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r7 <= 0) goto L3d
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r7 = r4.limit
            int r8 = r4.pos
            int r7 = r7 - r8
            long r7 = (long) r7
            long r0 = r0 - r7
            goto L2c
        L3d:
            int r7 = r12.size()
            if (r7 != r9) goto L78
            byte r2 = r12.getByte(r2)
            byte r12 = r12.getByte(r3)
        L4b:
            long r7 = r11.size()
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 >= 0) goto Lb0
            byte[] r3 = r4.data
            int r7 = r4.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r4.limit
        L5d:
            if (r13 >= r14) goto L6a
            r7 = r3[r13]
            if (r7 == r2) goto Le8
            if (r7 != r12) goto L67
            goto Le8
        L67:
            int r13 = r13 + 1
            goto L5d
        L6a:
            int r13 = r4.limit
            int r14 = r4.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r13 = r0
            goto L4b
        L78:
            byte[] r12 = r12.internalArray$okio()
        L7c:
            long r2 = r11.size()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto Lb0
            byte[] r2 = r4.data
            int r3 = r4.pos
            long r7 = (long) r3
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r4.limit
        L8e:
            if (r13 >= r14) goto La2
            r3 = r2[r13]
            int r7 = r12.length
            r8 = 0
        L94:
            if (r8 >= r7) goto L9f
            r9 = r12[r8]
            if (r3 != r9) goto L9c
            goto L11b
        L9c:
            int r8 = r8 + 1
            goto L94
        L9f:
            int r13 = r13 + 1
            goto L8e
        La2:
            int r13 = r4.limit
            int r14 = r4.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r13 = r0
            goto L7c
        Lb0:
            return r5
        Lb1:
            int r7 = r4.limit
            int r8 = r4.pos
            int r7 = r7 - r8
            long r7 = (long) r7
            long r7 = r7 + r0
            int r10 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r10 <= 0) goto L136
            int r7 = r12.size()
            if (r7 != r9) goto Lf9
            byte r2 = r12.getByte(r2)
            byte r12 = r12.getByte(r3)
        Lca:
            long r7 = r11.size()
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 >= 0) goto L135
            byte[] r3 = r4.data
            int r7 = r4.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r4.limit
        Ldc:
            if (r13 >= r14) goto Leb
            r7 = r3[r13]
            if (r7 == r2) goto Le8
            if (r7 != r12) goto Le5
            goto Le8
        Le5:
            int r13 = r13 + 1
            goto Ldc
        Le8:
            int r11 = r4.pos
            goto L11d
        Leb:
            int r13 = r4.limit
            int r14 = r4.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r13 = r0
            goto Lca
        Lf9:
            byte[] r12 = r12.internalArray$okio()
        Lfd:
            long r2 = r11.size()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L135
            byte[] r2 = r4.data
            int r3 = r4.pos
            long r7 = (long) r3
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r4.limit
        L10f:
            if (r13 >= r14) goto L127
            r3 = r2[r13]
            int r7 = r12.length
            r8 = 0
        L115:
            if (r8 >= r7) goto L124
            r9 = r12[r8]
            if (r3 != r9) goto L121
        L11b:
            int r11 = r4.pos
        L11d:
            int r13 = r13 - r11
            long r11 = (long) r13
            long r11 = r11 + r0
            return r11
        L121:
            int r8 = r8 + 1
            goto L115
        L124:
            int r13 = r13 + 1
            goto L10f
        L127:
            int r13 = r4.limit
            int r14 = r4.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r13 = r0
            goto Lfd
        L135:
            return r5
        L136:
            okio.Segment r4 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0 = r7
            goto Lb1
        L13e:
            return r5
        L13f:
            java.lang.String r11 = "fromIndex < 0: "
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r13)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    public static final int commonNext(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r5) {
            java.lang.String r0 = "$this$commonNext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = r5.offset
            okio.Buffer r2 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            long r2 = r2.size()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L30
            long r0 = r5.offset
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L24
            r0 = 0
            goto L2b
        L24:
            int r2 = r5.end
            int r3 = r5.start
            int r2 = r2 - r3
            long r2 = (long) r2
            long r0 = r0 + r2
        L2b:
            int r5 = r5.seek(r0)
            return r5
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "no more bytes"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public static final boolean commonRangeEquals(@org.jetbrains.annotations.NotNull okio.Buffer r6, long r7, @org.jetbrains.annotations.NotNull okio.ByteString r9, int r10, int r11) {
            java.lang.String r0 = "$this$commonRangeEquals"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L3e
            if (r10 < 0) goto L3e
            if (r11 < 0) goto L3e
            long r1 = r6.size()
            long r1 = r1 - r7
            long r3 = (long) r11
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L3e
            int r1 = r9.size()
            int r1 = r1 - r10
            if (r1 >= r11) goto L27
            goto L3e
        L27:
            r1 = 0
        L28:
            if (r1 >= r11) goto L3c
            long r2 = (long) r1
            long r2 = r2 + r7
            byte r2 = r6.getByte(r2)
            int r3 = r10 + r1
            byte r3 = r9.getByte(r3)
            if (r2 == r3) goto L39
            return r0
        L39:
            int r1 = r1 + 1
            goto L28
        L3c:
            r6 = 1
            return r6
        L3e:
            return r0
    }

    public static final int commonRead(@org.jetbrains.annotations.NotNull okio.Buffer r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            java.lang.String r0 = "$this$commonRead"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            r1 = 0
            int r2 = r2.read(r3, r1, r0)
            return r2
    }

    public static final int commonRead(@org.jetbrains.annotations.NotNull okio.Buffer r7, @org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
            java.lang.String r0 = "$this$commonRead"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r7.head
            if (r0 == 0) goto L46
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
            if (r8 != r9) goto L45
            okio.Segment r8 = r0.pop()
            r7.head = r8
            okio.SegmentPool.recycle(r0)
        L45:
            return r10
        L46:
            r7 = -1
            return r7
    }

    public static final long commonRead(@org.jetbrains.annotations.NotNull okio.Buffer r5, @org.jetbrains.annotations.NotNull okio.Buffer r6, long r7) {
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
            if (r2 == 0) goto L31
            long r2 = r5.size()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L21
            r5 = -1
            return r5
        L21:
            long r0 = r5.size()
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L2d
            long r7 = r5.size()
        L2d:
            r6.write(r5, r7)
            return r7
        L31:
            java.lang.String r5 = "byteCount < 0: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r7)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public static final long commonReadAll(@org.jetbrains.annotations.NotNull okio.Buffer r5, @org.jetbrains.annotations.NotNull okio.Sink r6) {
            java.lang.String r0 = "$this$commonReadAll"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L18
            r6.write(r5, r0)
        L18:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer.UnsafeCursor commonReadAndWriteUnsafe(@org.jetbrains.annotations.NotNull okio.Buffer r2, @org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r3) {
            java.lang.String r0 = "$this$commonReadAndWriteUnsafe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.Buffer r0 = r3.buffer
            r1 = 1
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L1a
            r3.buffer = r2
            r3.readWrite = r1
            return r3
        L1a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "already attached to a buffer"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static final byte commonReadByte(@org.jetbrains.annotations.NotNull okio.Buffer r9) {
            java.lang.String r0 = "$this$commonReadByte"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r0 = r9.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L37
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
            if (r4 != r2) goto L34
            okio.Segment r2 = r0.pop()
            r9.head = r2
            okio.SegmentPool.recycle(r0)
            goto L36
        L34:
            r0.pos = r4
        L36:
            return r1
        L37:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonReadByteArray(@org.jetbrains.annotations.NotNull okio.Buffer r2) {
            java.lang.String r0 = "$this$commonReadByteArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r0 = r2.size()
            byte[] r2 = r2.readByteArray(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonReadByteArray(@org.jetbrains.annotations.NotNull okio.Buffer r3, long r4) {
            java.lang.String r0 = "$this$commonReadByteArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L15
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L2d
            long r0 = r3.size()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L27
            int r5 = (int) r4
            byte[] r4 = new byte[r5]
            r3.readFully(r4)
            return r4
        L27:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L2d:
            java.lang.String r3 = "byteCount: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r4)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonReadByteString(@org.jetbrains.annotations.NotNull okio.Buffer r2) {
            java.lang.String r0 = "$this$commonReadByteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r0 = r2.size()
            okio.ByteString r2 = r2.readByteString(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonReadByteString(@org.jetbrains.annotations.NotNull okio.Buffer r3, long r4) {
            java.lang.String r0 = "$this$commonReadByteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L15
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L40
            long r0 = r3.size()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L3a
            r0 = 4096(0x1000, float:5.74E-42)
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L30
            int r0 = (int) r4
            okio.ByteString r0 = r3.snapshot(r0)
            r3.skip(r4)
            return r0
        L30:
            okio.ByteString r0 = new okio.ByteString
            byte[] r3 = r3.readByteArray(r4)
            r0.<init>(r3)
            return r0
        L3a:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L40:
            java.lang.String r3 = "byteCount: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r4)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull okio.Buffer r17) {
            r0 = r17
            java.lang.String r1 = "$this$commonReadDecimalLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            long r1 = r17.size()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lbe
            r1 = -7
            r5 = 0
            r6 = 0
            r7 = 0
        L16:
            okio.Segment r8 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            byte[] r9 = r8.data
            int r10 = r8.pos
            int r11 = r8.limit
        L21:
            if (r10 >= r11) goto L9c
            r12 = r9[r10]
            r13 = 48
            byte r13 = (byte) r13
            if (r12 < r13) goto L71
            r14 = 57
            byte r14 = (byte) r14
            if (r12 > r14) goto L71
            int r13 = r13 - r12
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 < 0) goto L48
            if (r16 != 0) goto L41
            long r14 = (long) r13
            int r16 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r16 >= 0) goto L41
            goto L48
        L41:
            r14 = 10
            long r3 = r3 * r14
            long r12 = (long) r13
            long r3 = r3 + r12
            goto L7c
        L48:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeDecimalLong(r3)
            okio.Buffer r0 = r0.writeByte(r12)
            if (r6 != 0) goto L5a
            r0.readByte()
        L5a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L71:
            r13 = 45
            byte r13 = (byte) r13
            if (r12 != r13) goto L81
            if (r5 != 0) goto L81
            r12 = 1
            long r1 = r1 - r12
            r6 = 1
        L7c:
            int r10 = r10 + 1
            int r5 = r5 + 1
            goto L21
        L81:
            if (r5 == 0) goto L85
            r7 = 1
            goto L9c
        L85:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = okio.Util.toHexString(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9c:
            if (r10 != r11) goto La8
            okio.Segment r9 = r8.pop()
            r0.head = r9
            okio.SegmentPool.recycle(r8)
            goto Laa
        La8:
            r8.pos = r10
        Laa:
            if (r7 != 0) goto Lb0
            okio.Segment r8 = r0.head
            if (r8 != 0) goto L16
        Lb0:
            long r1 = r17.size()
            long r7 = (long) r5
            long r1 = r1 - r7
            r0.setSize$okio(r1)
            if (r6 == 0) goto Lbc
            goto Lbd
        Lbc:
            long r3 = -r3
        Lbd:
            return r3
        Lbe:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    public static final void commonReadFully(@org.jetbrains.annotations.NotNull okio.Buffer r3, @org.jetbrains.annotations.NotNull okio.Buffer r4, long r5) {
            java.lang.String r0 = "$this$commonReadFully"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = r3.size()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L17
            r4.write(r3, r5)
            return
        L17:
            long r5 = r3.size()
            r4.write(r3, r5)
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
    }

    public static final void commonReadFully(@org.jetbrains.annotations.NotNull okio.Buffer r3, @org.jetbrains.annotations.NotNull byte[] r4) {
            java.lang.String r0 = "$this$commonReadFully"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
        Lc:
            int r1 = r4.length
            if (r0 >= r1) goto L20
            int r1 = r4.length
            int r1 = r1 - r0
            int r1 = r3.read(r4, r0, r1)
            r2 = -1
            if (r1 == r2) goto L1a
            int r0 = r0 + r1
            goto Lc
        L1a:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L20:
            return
    }

    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.Buffer r15) {
            java.lang.String r0 = "$this$commonReadHexadecimalUnsignedLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb4
            r0 = 0
            r1 = 0
            r4 = r2
        L12:
            okio.Segment r6 = r15.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L96
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L2e
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L2e
            int r11 = r10 - r11
            goto L47
        L2e:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L39
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L39
            goto L43
        L39:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
        L43:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L47:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L57
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L57:
            okio.Buffer r15 = new okio.Buffer
            r15.<init>()
            okio.Buffer r15 = r15.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r15 = r15.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Number too large: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r15 = r15.readUtf8()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L96
        L7f:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = okio.Util.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L96:
            if (r8 != r9) goto La2
            okio.Segment r7 = r6.pop()
            r15.head = r7
            okio.SegmentPool.recycle(r6)
            goto La4
        La2:
            r6.pos = r8
        La4:
            if (r1 != 0) goto Laa
            okio.Segment r6 = r15.head
            if (r6 != 0) goto L12
        Laa:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.setSize$okio(r1)
            return r4
        Lb4:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
    }

    public static final int commonReadInt(@org.jetbrains.annotations.NotNull okio.Buffer r8) {
            java.lang.String r0 = "$this$commonReadInt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            long r0 = r8.size()
            r2 = 4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L7b
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L41
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
            byte r8 = r8.readByte()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r8 | r0
            return r8
        L41:
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
            if (r7 != r4) goto L78
            okio.Segment r2 = r0.pop()
            r8.head = r2
            okio.SegmentPool.recycle(r0)
            goto L7a
        L78:
            r0.pos = r7
        L7a:
            return r1
        L7b:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>()
            throw r8
    }

    public static final long commonReadLong(@org.jetbrains.annotations.NotNull okio.Buffer r14) {
            java.lang.String r0 = "$this$commonReadLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            long r0 = r14.size()
            r2 = 8
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L9c
            okio.Segment r0 = r14.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            r7 = 32
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 >= 0) goto L35
            int r0 = r14.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = r0 << r7
            int r14 = r14.readInt()
            long r4 = (long) r14
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
        L35:
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
            if (r1 != r4) goto L99
            okio.Segment r1 = r0.pop()
            r14.head = r1
            okio.SegmentPool.recycle(r0)
            goto L9b
        L99:
            r0.pos = r1
        L9b:
            return r5
        L9c:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
    }

    public static final short commonReadShort(@org.jetbrains.annotations.NotNull okio.Buffer r8) {
            java.lang.String r0 = "$this$commonReadShort"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            long r0 = r8.size()
            r2 = 2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L57
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            r6 = 2
            if (r5 >= r6) goto L2e
            byte r0 = r8.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r8 = r8.readByte()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r8 | r0
            short r8 = (short) r8
            return r8
        L2e:
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
            if (r7 != r4) goto L53
            okio.Segment r2 = r0.pop()
            r8.head = r2
            okio.SegmentPool.recycle(r0)
            goto L55
        L53:
            r0.pos = r7
        L55:
            short r8 = (short) r1
            return r8
        L57:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>()
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer.UnsafeCursor commonReadUnsafe(@org.jetbrains.annotations.NotNull okio.Buffer r2, @org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r3) {
            java.lang.String r0 = "$this$commonReadUnsafe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.Buffer r0 = r3.buffer
            r1 = 0
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L1a
            r3.buffer = r2
            r3.readWrite = r1
            return r3
        L1a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "already attached to a buffer"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonReadUtf8(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
            java.lang.String r0 = "$this$commonReadUtf8"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 < 0) goto L16
            r1 = 2147483647(0x7fffffff, float:NaN)
            long r1 = (long) r1
            int r4 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r4 > 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L6d
            long r1 = r8.size()
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 < 0) goto L67
            if (r3 != 0) goto L26
            java.lang.String r8 = ""
            return r8
        L26:
            okio.Segment r1 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.pos
            long r3 = (long) r2
            long r3 = r3 + r9
            int r5 = r1.limit
            long r5 = (long) r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L41
            byte[] r8 = r8.readByteArray(r9)
            r9 = 3
            r10 = 0
            java.lang.String r8 = okio.internal._Utf8Kt.commonToUtf8String$default(r8, r0, r0, r9, r10)
            return r8
        L41:
            byte[] r0 = r1.data
            int r3 = (int) r9
            int r4 = r2 + r3
            java.lang.String r0 = okio.internal._Utf8Kt.commonToUtf8String(r0, r2, r4)
            int r2 = r1.pos
            int r2 = r2 + r3
            r1.pos = r2
            long r2 = r8.size()
            long r2 = r2 - r9
            r8.setSize$okio(r2)
            int r9 = r1.pos
            int r10 = r1.limit
            if (r9 != r10) goto L66
            okio.Segment r9 = r1.pop()
            r8.head = r9
            okio.SegmentPool.recycle(r1)
        L66:
            return r0
        L67:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>()
            throw r8
        L6d:
            java.lang.String r8 = "byteCount: "
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r8, r9)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    public static final int commonReadUtf8CodePoint(@org.jetbrains.annotations.NotNull okio.Buffer r12) {
            java.lang.String r0 = "$this$commonReadUtf8CodePoint"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            long r0 = r12.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb0
            byte r0 = r12.getByte(r2)
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r1 != 0) goto L22
            r1 = r0 & 127(0x7f, float:1.78E-43)
            r5 = 1
            r6 = 0
            goto L45
        L22:
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L2e
            r1 = r0 & 31
            r5 = 2
            r6 = 128(0x80, float:1.8E-43)
            goto L45
        L2e:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r1 != r5) goto L3a
            r1 = r0 & 15
            r5 = 3
            r6 = 2048(0x800, float:2.87E-42)
            goto L45
        L3a:
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r5 = 240(0xf0, float:3.36E-43)
            if (r1 != r5) goto Laa
            r1 = r0 & 7
            r5 = 4
            r6 = 65536(0x10000, float:9.1835E-41)
        L45:
            long r7 = r12.size()
            long r9 = (long) r5
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L7f
        L4e:
            if (r2 >= r5) goto L65
            long r7 = (long) r2
            byte r0 = r12.getByte(r7)
            r11 = r0 & 192(0xc0, float:2.69E-43)
            if (r11 != r3) goto L61
            int r1 = r1 << 6
            r0 = r0 & 63
            r1 = r1 | r0
            int r2 = r2 + 1
            goto L4e
        L61:
            r12.skip(r7)
            return r4
        L65:
            r12.skip(r9)
            r12 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 <= r12) goto L6e
            goto L7e
        L6e:
            r12 = 57343(0xdfff, float:8.0355E-41)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r0 <= r1) goto L77
            goto L7a
        L77:
            if (r12 < r1) goto L7a
            goto L7e
        L7a:
            if (r1 >= r6) goto L7d
            goto L7e
        L7d:
            r4 = r1
        L7e:
            return r4
        L7f:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.String r2 = "size < "
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r2, r5, r3)
            long r3 = r12.size()
            r2.append(r3)
            java.lang.String r12 = " (to read code point prefixed 0x"
            r2.append(r12)
            java.lang.String r12 = okio.Util.toHexString(r0)
            r2.append(r12)
            r12 = 41
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r1.<init>(r12)
            throw r1
        Laa:
            r0 = 1
            r12.skip(r0)
            return r4
        Lb0:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String commonReadUtf8Line(@org.jetbrains.annotations.NotNull okio.Buffer r5) {
            java.lang.String r0 = "$this$commonReadUtf8Line"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 10
            byte r0 = (byte) r0
            long r0 = r5.indexOf(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L17
            java.lang.String r5 = readUtf8Line(r5, r0)
            goto L2b
        L17:
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2a
            long r0 = r5.size()
            java.lang.String r5 = r5.readUtf8(r0)
            goto L2b
        L2a:
            r5 = 0
        L2b:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String commonReadUtf8LineStrict(@org.jetbrains.annotations.NotNull okio.Buffer r11, long r12) {
            java.lang.String r0 = "$this$commonReadUtf8LineStrict"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L9a
            r0 = 1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 != 0) goto L1c
            goto L1e
        L1c:
            long r2 = r12 + r0
        L1e:
            r4 = 10
            byte r10 = (byte) r4
            r6 = 0
            r4 = r11
            r5 = r10
            r8 = r2
            long r4 = r4.indexOf(r5, r6, r8)
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L35
            java.lang.String r11 = readUtf8Line(r11, r4)
            return r11
        L35:
            long r4 = r11.size()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L53
            long r0 = r2 - r0
            byte r0 = r11.getByte(r0)
            r1 = 13
            byte r1 = (byte) r1
            if (r0 != r1) goto L53
            byte r0 = r11.getByte(r2)
            if (r0 != r10) goto L53
            java.lang.String r11 = readUtf8Line(r11, r2)
            return r11
        L53:
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
            long r11 = java.lang.Math.min(r2, r12)
            r1.append(r11)
            java.lang.String r11 = " content="
            r1.append(r11)
            okio.ByteString r11 = r6.readByteString()
            java.lang.String r11 = r11.hex()
            r1.append(r11)
            r11 = 8230(0x2026, float:1.1533E-41)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L9a:
            java.lang.String r11 = "limit < 0: "
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    public static final long commonResizeBuffer(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r13, long r14) {
            java.lang.String r0 = "$this$commonResizeBuffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            okio.Buffer r0 = r13.buffer
            if (r0 == 0) goto Lae
            boolean r1 = r13.readWrite
            if (r1 == 0) goto La2
            long r1 = r0.size()
            r3 = 1
            r4 = 0
            int r6 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r6 > 0) goto L69
            int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r3 < 0) goto L1e
            r3 = 1
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L59
            long r6 = r1 - r14
        L23:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L4b
            okio.Segment r3 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r3 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r8 = r3.limit
            int r9 = r3.pos
            int r9 = r8 - r9
            long r9 = (long) r9
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 > 0) goto L47
            okio.Segment r8 = r3.pop()
            r0.head = r8
            okio.SegmentPool.recycle(r3)
            long r6 = r6 - r9
            goto L23
        L47:
            int r4 = (int) r6
            int r8 = r8 - r4
            r3.limit = r8
        L4b:
            r3 = 0
            r13.setSegment$okio(r3)
            r13.offset = r14
            r13.data = r3
            r3 = -1
            r13.start = r3
            r13.end = r3
            goto L9e
        L59:
            java.lang.String r13 = "newSize < 0: "
            java.lang.String r13 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13, r14)
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L69:
            if (r6 <= 0) goto L9e
            long r6 = r14 - r1
            r8 = 1
        L6e:
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 <= 0) goto L9e
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
            if (r8 == 0) goto L9c
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
        L9c:
            r3 = 1
            goto L6e
        L9e:
            r0.setSize$okio(r14)
            return r1
        La2:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "resizeBuffer() only permitted for read/write buffers"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        Lae:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "not attached to a buffer"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    public static final int commonSeek(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r17, long r18) {
            r0 = r17
            r1 = r18
            java.lang.String r3 = "$this$commonSeek"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            okio.Buffer r3 = r0.buffer
            if (r3 == 0) goto Lfc
            r4 = -1
            long r5 = (long) r4
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto Ld9
            long r5 = r3.size()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto Ld9
            r5 = -1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto Lcc
            long r5 = r3.size()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L2b
            goto Lcc
        L2b:
            r4 = 0
            long r6 = r3.size()
            okio.Segment r8 = r3.head
            okio.Segment r9 = r17.getSegment$okio()
            if (r9 == 0) goto L5e
            long r9 = r0.offset
            int r11 = r0.start
            okio.Segment r12 = r17.getSegment$okio()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
            int r12 = r12.pos
            int r11 = r11 - r12
            long r11 = (long) r11
            long r9 = r9 - r11
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 <= 0) goto L56
            okio.Segment r6 = r17.getSegment$okio()
            r15 = r8
            r8 = r6
            r6 = r9
            r9 = r15
            goto L5f
        L56:
            okio.Segment r4 = r17.getSegment$okio()
            r15 = r9
            r9 = r4
            r4 = r15
            goto L5f
        L5e:
            r9 = r8
        L5f:
            long r10 = r6 - r1
            long r12 = r1 - r4
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L7c
        L67:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            int r6 = r9.limit
            int r7 = r9.pos
            int r8 = r6 - r7
            long r10 = (long) r8
            long r10 = r10 + r4
            int r8 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r8 < 0) goto L92
            int r6 = r6 - r7
            long r6 = (long) r6
            long r4 = r4 + r6
            okio.Segment r9 = r9.next
            goto L67
        L7c:
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 <= 0) goto L90
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            okio.Segment r8 = r8.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            int r4 = r8.limit
            int r5 = r8.pos
            int r4 = r4 - r5
            long r4 = (long) r4
            long r6 = r6 - r4
            goto L7c
        L90:
            r4 = r6
            r9 = r8
        L92:
            boolean r6 = r0.readWrite
            if (r6 == 0) goto Lb3
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            boolean r6 = r9.shared
            if (r6 == 0) goto Lb3
            okio.Segment r6 = r9.unsharedCopy()
            okio.Segment r7 = r3.head
            if (r7 != r9) goto La7
            r3.head = r6
        La7:
            okio.Segment r9 = r9.push(r6)
            okio.Segment r3 = r9.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r3.pop()
        Lb3:
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
            int r1 = r1 - r3
            return r1
        Lcc:
            r3 = 0
            r0.setSegment$okio(r3)
            r0.offset = r1
            r0.data = r3
            r0.start = r4
            r0.end = r4
            return r4
        Ld9:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "offset="
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = " > size="
            r4.append(r1)
            long r1 = r3.size()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        Lfc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "not attached to a buffer"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final int commonSelect(@org.jetbrains.annotations.NotNull okio.Buffer r3, @org.jetbrains.annotations.NotNull okio.Options r4) {
            java.lang.String r0 = "$this$commonSelect"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 2
            r2 = 0
            int r0 = selectPrefix$default(r3, r4, r0, r1, r2)
            r1 = -1
            if (r0 != r1) goto L15
            return r1
        L15:
            okio.ByteString[] r4 = r4.getByteStrings$okio()
            r4 = r4[r0]
            int r4 = r4.size()
            long r1 = (long) r4
            r3.skip(r1)
            return r0
    }

    public static final void commonSkip(@org.jetbrains.annotations.NotNull okio.Buffer r7, long r8) {
            java.lang.String r0 = "$this$commonSkip"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
        L5:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3d
            okio.Segment r0 = r7.head
            if (r0 == 0) goto L37
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
            if (r1 != r2) goto L5
            okio.Segment r1 = r0.pop()
            r7.head = r1
            okio.SegmentPool.recycle(r0)
            goto L5
        L37:
            java.io.EOFException r7 = new java.io.EOFException
            r7.<init>()
            throw r7
        L3d:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonSnapshot(@org.jetbrains.annotations.NotNull okio.Buffer r5) {
            java.lang.String r0 = "$this$commonSnapshot"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = r5.size()
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L20
            long r0 = r5.size()
            int r1 = (int) r0
            okio.ByteString r5 = r5.snapshot(r1)
            return r5
        L20:
            java.lang.String r0 = "size > Int.MAX_VALUE: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r5.size()
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonSnapshot(@org.jetbrains.annotations.NotNull okio.Buffer r7, int r8) {
            java.lang.String r0 = "$this$commonSnapshot"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            if (r8 != 0) goto La
            okio.ByteString r7 = okio.ByteString.EMPTY
            return r7
        La:
            long r0 = r7.size()
            r2 = 0
            long r4 = (long) r8
            okio.Util.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r0 = r7.head
            r1 = 0
            r2 = 0
            r3 = 0
        L19:
            if (r2 >= r8) goto L34
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r4 = r0.limit
            int r5 = r0.pos
            if (r4 == r5) goto L2b
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            okio.Segment r0 = r0.next
            goto L19
        L2b:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "s.limit == s.pos"
            r7.<init>(r8)
            throw r7
        L34:
            byte[][] r0 = new byte[r3][]
            int r2 = r3 * 2
            int[] r2 = new int[r2]
            okio.Segment r7 = r7.head
            r4 = 0
        L3d:
            if (r1 >= r8) goto L5f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            byte[] r5 = r7.data
            r0[r4] = r5
            int r5 = r7.limit
            int r6 = r7.pos
            int r5 = r5 - r6
            int r1 = r1 + r5
            int r5 = java.lang.Math.min(r1, r8)
            r2[r4] = r5
            int r5 = r4 + r3
            int r6 = r7.pos
            r2[r5] = r6
            r5 = 1
            r7.shared = r5
            int r4 = r4 + r5
            okio.Segment r7 = r7.next
            goto L3d
        L5f:
            okio.SegmentedByteString r7 = new okio.SegmentedByteString
            r7.<init>(r0, r2)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Segment commonWritableSegment(@org.jetbrains.annotations.NotNull okio.Buffer r2, int r3) {
            java.lang.String r0 = "$this$commonWritableSegment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 8192(0x2000, float:1.148E-41)
            r1 = 1
            if (r3 < r1) goto Ld
            if (r3 > r0) goto Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 == 0) goto L39
            okio.Segment r1 = r2.head
            if (r1 != 0) goto L1f
            okio.Segment r3 = okio.SegmentPool.take()
            r2.head = r3
            r3.prev = r3
            r3.next = r3
            return r3
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.Segment r2 = r1.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r1 = r2.limit
            int r1 = r1 + r3
            if (r1 > r0) goto L30
            boolean r3 = r2.owner
            if (r3 != 0) goto L38
        L30:
            okio.Segment r3 = okio.SegmentPool.take()
            okio.Segment r2 = r2.push(r3)
        L38:
            return r2
        L39:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "unexpected capacity"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWrite(@org.jetbrains.annotations.NotNull okio.Buffer r1, @org.jetbrains.annotations.NotNull okio.ByteString r2, int r3, int r4) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r2.write$okio(r1, r3, r4)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWrite(@org.jetbrains.annotations.NotNull okio.Buffer r5, @org.jetbrains.annotations.NotNull okio.Source r6, long r7) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
        Lb:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L23
            long r0 = r6.read(r5, r7)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1d
            long r7 = r7 - r0
            goto Lb
        L1d:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L23:
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWrite(@org.jetbrains.annotations.NotNull okio.Buffer r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            r1 = 0
            okio.Buffer r2 = r2.write(r3, r1, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWrite(@org.jetbrains.annotations.NotNull okio.Buffer r9, @org.jetbrains.annotations.NotNull byte[] r10, int r11, int r12) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r10.length
            long r1 = (long) r0
            long r3 = (long) r11
            long r7 = (long) r12
            r5 = r7
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            int r12 = r12 + r11
        L14:
            if (r11 >= r12) goto L35
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
            goto L14
        L35:
            long r10 = r9.size()
            long r10 = r10 + r7
            r9.setSize$okio(r10)
            return r9
    }

    public static final void commonWrite(@org.jetbrains.annotations.NotNull okio.Buffer r8, @org.jetbrains.annotations.NotNull okio.Buffer r9, long r10) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            if (r9 == r8) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto Lc2
            long r2 = r9.size()
            r4 = 0
            r6 = r10
            okio.Util.checkOffsetAndCount(r2, r4, r6)
        L1d:
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 <= 0) goto Lc1
            okio.Segment r1 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.limit
            okio.Segment r2 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r2 = r2.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 >= 0) goto L83
            okio.Segment r1 = r8.head
            if (r1 == 0) goto L41
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.Segment r1 = r1.prev
            goto L42
        L41:
            r1 = 0
        L42:
            if (r1 == 0) goto L77
            boolean r2 = r1.owner
            if (r2 == 0) goto L77
            int r2 = r1.limit
            long r2 = (long) r2
            long r2 = r2 + r10
            boolean r4 = r1.shared
            if (r4 == 0) goto L52
            r4 = 0
            goto L54
        L52:
            int r4 = r1.pos
        L54:
            long r4 = (long) r4
            long r2 = r2 - r4
            r4 = 8192(0x2000, float:1.148E-41)
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L77
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
            return
        L77:
            okio.Segment r1 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = (int) r10
            okio.Segment r1 = r1.split(r2)
            r9.head = r1
        L83:
            okio.Segment r1 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.limit
            int r3 = r1.pos
            int r2 = r2 - r3
            long r2 = (long) r2
            okio.Segment r4 = r1.pop()
            r9.head = r4
            okio.Segment r4 = r8.head
            if (r4 != 0) goto L9f
            r8.head = r1
            r1.prev = r1
            r1.next = r1
            goto Lae
        L9f:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Segment r1 = r4.push(r1)
            r1.compact()
        Lae:
            long r4 = r9.size()
            long r4 = r4 - r2
            r9.setSize$okio(r4)
            long r4 = r8.size()
            long r4 = r4 + r2
            r8.setSize$okio(r4)
            long r10 = r10 - r2
            goto L1d
        Lc1:
            return
        Lc2:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "source == this"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer r0, okio.ByteString r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r1.size()
        Ld:
            java.lang.String r4 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            r1.write$okio(r0, r2, r3)
            return r0
    }

    public static final long commonWriteAll(@org.jetbrains.annotations.NotNull okio.Buffer r7, @org.jetbrains.annotations.NotNull okio.Source r8) {
            java.lang.String r0 = "$this$commonWriteAll"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
        Ld:
            r2 = 8192(0x2000, float:1.148E-41)
            long r2 = (long) r2
            long r2 = r8.read(r7, r2)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1b
            return r0
        L1b:
            long r0 = r0 + r2
            goto Ld
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteByte(@org.jetbrains.annotations.NotNull okio.Buffer r4, int r5) {
            java.lang.String r0 = "$this$commonWriteByte"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
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

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteDecimalLong(@org.jetbrains.annotations.NotNull okio.Buffer r12, long r13) {
            java.lang.String r0 = "$this$commonWriteDecimalLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L12
            r13 = 48
            okio.Buffer r12 = r12.writeByte(r13)
            return r12
        L12:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L23
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L22
            java.lang.String r13 = "-9223372036854775808"
            okio.Buffer r12 = r12.writeUtf8(r13)
            return r12
        L22:
            r3 = 1
        L23:
            r5 = 100000000(0x5f5e100, double:4.94065646E-316)
            r2 = 10
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 >= 0) goto L71
            r5 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4f
            r5 = 100
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 >= 0) goto L43
            r5 = 10
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 >= 0) goto L40
            goto Le9
        L40:
            r4 = 2
            goto Le9
        L43:
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L4c
            r4 = 3
            goto Le9
        L4c:
            r4 = 4
            goto Le9
        L4f:
            r4 = 1000000(0xf4240, double:4.940656E-318)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L63
            r4 = 100000(0x186a0, double:4.94066E-319)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L60
            r4 = 5
            goto Le9
        L60:
            r4 = 6
            goto Le9
        L63:
            r4 = 10000000(0x989680, double:4.9406565E-317)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L6d
            r4 = 7
            goto Le9
        L6d:
            r4 = 8
            goto Le9
        L71:
            r4 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L9f
            r4 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L90
            r4 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L8d
            r4 = 9
            goto Le9
        L8d:
            r4 = 10
            goto Le9
        L90:
            r4 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L9c
            r4 = 11
            goto Le9
        L9c:
            r4 = 12
            goto Le9
        L9f:
            r4 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lc3
            r4 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lb4
            r4 = 13
            goto Le9
        Lb4:
            r4 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lc0
            r4 = 14
            goto Le9
        Lc0:
            r4 = 15
            goto Le9
        Lc3:
            r4 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Ldb
            r4 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Ld8
            r4 = 16
            goto Le9
        Ld8:
            r4 = 17
            goto Le9
        Ldb:
            r4 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Le7
            r4 = 18
            goto Le9
        Le7:
            r4 = 19
        Le9:
            if (r3 == 0) goto Led
            int r4 = r4 + 1
        Led:
            okio.Segment r5 = r12.writableSegment$okio(r4)
            byte[] r6 = r5.data
            int r7 = r5.limit
            int r7 = r7 + r4
        Lf6:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L10a
            long r8 = (long) r2
            long r10 = r13 % r8
            int r11 = (int) r10
            int r7 = r7 + (-1)
            byte[] r10 = getHEX_DIGIT_BYTES()
            r10 = r10[r11]
            r6[r7] = r10
            long r13 = r13 / r8
            goto Lf6
        L10a:
            if (r3 == 0) goto L113
            int r7 = r7 + (-1)
            r13 = 45
            byte r13 = (byte) r13
            r6[r7] = r13
        L113:
            int r13 = r5.limit
            int r13 = r13 + r4
            r5.limit = r13
            long r13 = r12.size()
            long r0 = (long) r4
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            return r12
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.Buffer r12, long r13) {
            java.lang.String r0 = "$this$commonWriteHexadecimalUnsignedLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L12
            r13 = 48
            okio.Buffer r12 = r12.writeByte(r13)
            return r12
        L12:
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
        L67:
            if (r6 < r5) goto L79
            byte[] r0 = getHEX_DIGIT_BYTES()
            r7 = 15
            long r7 = r7 & r13
            int r8 = (int) r7
            r0 = r0[r8]
            r3[r6] = r0
            long r13 = r13 >>> r4
            int r6 = r6 + (-1)
            goto L67
        L79:
            int r13 = r2.limit
            int r13 = r13 + r1
            r2.limit = r13
            long r13 = r12.size()
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            return r12
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteInt(@org.jetbrains.annotations.NotNull okio.Buffer r5, int r6) {
            java.lang.String r0 = "$this$commonWriteInt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
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

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteLong(@org.jetbrains.annotations.NotNull okio.Buffer r9, long r10) {
            java.lang.String r0 = "$this$commonWriteLong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
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

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteShort(@org.jetbrains.annotations.NotNull okio.Buffer r5, int r6) {
            java.lang.String r0 = "$this$commonWriteShort"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
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

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteUtf8(@org.jetbrains.annotations.NotNull okio.Buffer r10, @org.jetbrains.annotations.NotNull java.lang.String r11, int r12, int r13) {
            java.lang.String r0 = "$this$commonWriteUtf8"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1
            if (r12 < 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L161
            if (r13 < r12) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 == 0) goto L14f
            int r1 = r11.length()
            if (r13 > r1) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            if (r1 == 0) goto L132
        L25:
            if (r12 >= r13) goto L131
            char r1 = r11.charAt(r12)
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r2) goto L66
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
        L44:
            r12 = r7
            if (r12 >= r6) goto L55
            char r1 = r11.charAt(r12)
            if (r1 < r2) goto L4e
            goto L55
        L4e:
            int r7 = r12 + 1
            int r12 = r12 + r5
            byte r1 = (byte) r1
            r4[r12] = r1
            goto L44
        L55:
            int r5 = r5 + r12
            int r1 = r3.limit
            int r5 = r5 - r1
            int r1 = r1 + r5
            r3.limit = r1
            long r1 = r10.size()
            long r3 = (long) r5
            long r1 = r1 + r3
            r10.setSize$okio(r1)
            goto L25
        L66:
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 >= r3) goto L91
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
            goto L12d
        L91:
            r3 = 55296(0xd800, float:7.7486E-41)
            r4 = 63
            if (r1 < r3) goto Lff
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r1 <= r3) goto L9e
            goto Lff
        L9e:
            int r5 = r12 + 1
            if (r5 >= r13) goto La7
            char r6 = r11.charAt(r5)
            goto La8
        La7:
            r6 = 0
        La8:
            r7 = 56319(0xdbff, float:7.892E-41)
            if (r1 > r7) goto Lf9
            r7 = 56320(0xdc00, float:7.8921E-41)
            if (r7 > r6) goto Lf9
            if (r3 >= r6) goto Lb5
            goto Lf9
        Lb5:
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
            goto L25
        Lf9:
            r10.writeByte(r4)
            r12 = r5
            goto L25
        Lff:
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
        L12d:
            int r12 = r12 + 1
            goto L25
        L131:
            return r10
        L132:
            java.lang.String r10 = "endIndex > string.length: "
            java.lang.String r12 = " > "
            java.lang.StringBuilder r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r10, r13, r12)
            int r11 = r11.length()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L14f:
            java.lang.String r10 = "endIndex < beginIndex: "
            java.lang.String r11 = " < "
            java.lang.String r10 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r10, r13, r11, r12)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L161:
            java.lang.String r10 = "beginIndex < 0: "
            java.lang.String r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10, r12)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.Buffer commonWriteUtf8CodePoint(@org.jetbrains.annotations.NotNull okio.Buffer r8, int r9) {
            java.lang.String r0 = "$this$commonWriteUtf8CodePoint"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 128(0x80, float:1.8E-43)
            if (r9 >= r0) goto Le
            r8.writeByte(r9)
            goto Lb6
        Le:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 63
            if (r9 >= r1) goto L3a
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
            goto Lb6
        L3a:
            r1 = 57343(0xdfff, float:8.0355E-41)
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r3 <= r9) goto L43
            goto L49
        L43:
            if (r1 < r9) goto L49
            r8.writeByte(r2)
            goto Lb6
        L49:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r1) goto L7b
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
            goto Lb6
        L7b:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r1) goto Lb7
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
        Lb6:
            return r8
        Lb7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unexpected code point: 0x"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r9 = okio.Util.toHexString(r9)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
            byte[] r0 = okio.internal.BufferKt.HEX_DIGIT_BYTES
            return r0
    }

    public static final boolean rangeEquals(@org.jetbrains.annotations.NotNull okio.Segment r5, int r6, @org.jetbrains.annotations.NotNull byte[] r7, int r8, int r9) {
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r5.limit
            byte[] r1 = r5.data
        Lf:
            if (r8 >= r9) goto L2f
            if (r6 != r0) goto L22
            okio.Segment r5 = r5.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            byte[] r6 = r5.data
            int r0 = r5.pos
            int r1 = r5.limit
            r4 = r1
            r1 = r6
            r6 = r0
            r0 = r4
        L22:
            r2 = r1[r6]
            r3 = r7[r8]
            if (r2 == r3) goto L2a
            r5 = 0
            return r5
        L2a:
            int r6 = r6 + 1
            int r8 = r8 + 1
            goto Lf
        L2f:
            r5 = 1
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String readUtf8Line(@org.jetbrains.annotations.NotNull okio.Buffer r6, long r7) {
            java.lang.String r0 = "$this$readUtf8Line"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 1
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto L22
            long r2 = r7 - r0
            byte r4 = r6.getByte(r2)
            r5 = 13
            byte r5 = (byte) r5
            if (r4 != r5) goto L22
            java.lang.String r7 = r6.readUtf8(r2)
            r0 = 2
            r6.skip(r0)
            goto L29
        L22:
            java.lang.String r7 = r6.readUtf8(r7)
            r6.skip(r0)
        L29:
            return r7
    }

    public static final <T> T seek(@org.jetbrains.annotations.NotNull okio.Buffer r5, long r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super okio.Segment, ? super java.lang.Long, ? extends T> r8) {
            java.lang.String r0 = "$this$seek"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "lambda"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            okio.Segment r0 = r5.head
            if (r0 == 0) goto L52
            long r1 = r5.size()
            long r1 = r1 - r6
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 >= 0) goto L35
            long r1 = r5.size()
        L1b:
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 <= 0) goto L2c
            okio.Segment r0 = r0.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r5 = r0.limit
            int r3 = r0.pos
            int r5 = r5 - r3
            long r3 = (long) r5
            long r1 = r1 - r3
            goto L1b
        L2c:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Object r5 = r8.invoke(r0, r5)
            return r5
        L35:
            r1 = 0
        L37:
            int r5 = r0.limit
            int r3 = r0.pos
            int r5 = r5 - r3
            long r3 = (long) r5
            long r3 = r3 + r1
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 <= 0) goto L4b
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Object r5 = r8.invoke(r0, r5)
            return r5
        L4b:
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r3
            goto L37
        L52:
            r5 = 0
            r6 = -1
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r5 = r8.invoke(r5, r6)
            return r5
    }

    public static final int selectPrefix(@org.jetbrains.annotations.NotNull okio.Buffer r17, @org.jetbrains.annotations.NotNull okio.Options r18, boolean r19) {
            r0 = r17
            java.lang.String r1 = "$this$selectPrefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            okio.Segment r0 = r0.head
            r1 = -2
            r3 = -1
            if (r0 == 0) goto Lac
            byte[] r4 = r0.data
            int r5 = r0.pos
            int r6 = r0.limit
            int[] r2 = r18.getTrie$okio()
            r7 = 0
            r9 = r0
            r8 = 0
            r10 = -1
        L22:
            int r11 = r8 + 1
            r8 = r2[r8]
            int r12 = r11 + 1
            r11 = r2[r11]
            if (r11 == r3) goto L2d
            r10 = r11
        L2d:
            if (r9 != 0) goto L30
            goto L5d
        L30:
            r11 = 0
            if (r8 >= 0) goto L7d
            int r8 = r8 * (-1)
            int r13 = r8 + r12
        L37:
            int r8 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r12 + 1
            r12 = r2[r12]
            if (r5 == r12) goto L44
            return r10
        L44:
            if (r14 != r13) goto L48
            r5 = 1
            goto L49
        L48:
            r5 = 0
        L49:
            if (r8 != r6) goto L6a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            okio.Segment r4 = r9.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r6 = r4.pos
            byte[] r8 = r4.data
            int r9 = r4.limit
            if (r4 != r0) goto L64
            if (r5 != 0) goto L61
        L5d:
            if (r19 == 0) goto L60
            return r1
        L60:
            return r10
        L61:
            r4 = r8
            r8 = r11
            goto L70
        L64:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L70
        L6a:
            r16 = r9
            r9 = r6
            r6 = r8
            r8 = r16
        L70:
            if (r5 == 0) goto L78
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto La2
        L78:
            r5 = r6
            r6 = r9
            r12 = r14
            r9 = r8
            goto L37
        L7d:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r12 + r8
        L85:
            if (r12 != r14) goto L88
            return r10
        L88:
            r15 = r2[r12]
            if (r5 != r15) goto La9
            int r12 = r12 + r8
            r5 = r2[r12]
            if (r13 != r6) goto La2
            okio.Segment r9 = r9.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            int r4 = r9.pos
            byte[] r6 = r9.data
            int r8 = r9.limit
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto La2
            r9 = r11
        La2:
            if (r5 < 0) goto La5
            return r5
        La5:
            int r8 = -r5
            r5 = r13
            goto L22
        La9:
            int r12 = r12 + 1
            goto L85
        Lac:
            if (r19 == 0) goto Laf
            goto Lb0
        Laf:
            r1 = -1
        Lb0:
            return r1
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer r0, okio.Options r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            int r0 = selectPrefix(r0, r1, r2)
            return r0
    }
}
