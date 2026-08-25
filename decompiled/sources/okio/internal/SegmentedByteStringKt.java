package okio.internal;

/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0017\u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0080\b\u001a\r\u0010\u000b\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\r\u0010\f\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0010\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0010\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010\u0016\u001a\u00020\u0015*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0012*\u00020\bH\u0080\b\u001a%\u0010\u001a\u001a\u00020\u001b*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a]\u0010\u001e\u001a\u00020\u001b*\u00020\b2K\u0010\u001f\u001aG\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u001b0 H\u0080\bø\u0001\u0000\u001aj\u0010\u001e\u001a\u00020\u001b*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012K\u0010\u001f\u001aG\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u001b0 H\u0082\b\u001a\u0014\u0010$\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, d2 = {"binarySearch", "", "", "value", "fromIndex", "toIndex", "commonEquals", "", "Lokio/SegmentedByteString;", "other", "", "commonGetSize", "commonHashCode", "commonInternalGet", "", "pos", "commonRangeEquals", "offset", "", "otherOffset", "byteCount", "Lokio/ByteString;", "commonSubstring", "beginIndex", "endIndex", "commonToByteArray", "commonWrite", "", "buffer", "Lokio/Buffer;", "forEachSegment", "action", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "data", "segment", "okio"}, k = 2, mv = {1, 4, 1})
public final class SegmentedByteStringKt {
    public static final /* synthetic */ void access$forEachSegment(okio.SegmentedByteString r0, int r1, int r2, kotlin.jvm.functions.Function3 r3) {
            forEachSegment(r0, r1, r2, r3)
            return
    }

    public static final int binarySearch(@org.jetbrains.annotations.NotNull int[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "$this$binarySearch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r5 = r5 + (-1)
        L7:
            if (r4 > r5) goto L1c
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            r1 = r2[r0]
            if (r1 >= r3) goto L15
            int r0 = r0 + 1
            r4 = r0
            goto L7
        L15:
            if (r1 <= r3) goto L1b
            int r0 = r0 + (-1)
            r5 = r0
            goto L7
        L1b:
            return r0
        L1c:
            int r2 = -r4
            int r2 = r2 + (-1)
            return r2
    }

    public static final boolean commonEquals(@org.jetbrains.annotations.NotNull okio.SegmentedByteString r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
            java.lang.String r0 = "$this$commonEquals"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 1
            r1 = 0
            if (r5 != r4) goto La
            goto L26
        La:
            boolean r2 = r5 instanceof okio.ByteString
            if (r2 == 0) goto L25
            okio.ByteString r5 = (okio.ByteString) r5
            int r2 = r5.size()
            int r3 = r4.size()
            if (r2 != r3) goto L25
            int r2 = r4.size()
            boolean r4 = r4.rangeEquals(r1, r5, r1, r2)
            if (r4 == 0) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }

    public static final int commonGetSize(@org.jetbrains.annotations.NotNull okio.SegmentedByteString r1) {
            java.lang.String r0 = "$this$commonGetSize"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int[] r0 = r1.getDirectory$okio()
            byte[][] r1 = r1.getSegments$okio()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r1 = r0[r1]
            return r1
    }

    public static final int commonHashCode(@org.jetbrains.annotations.NotNull okio.SegmentedByteString r8) {
            java.lang.String r0 = "$this$commonHashCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.getHashCode$okio()
            if (r0 == 0) goto Lc
            return r0
        Lc:
            byte[][] r0 = r8.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = 1
            r2 = 0
            r3 = 1
        L15:
            if (r1 >= r0) goto L3c
            int[] r4 = r8.getDirectory$okio()
            int r5 = r0 + r1
            r4 = r4[r5]
            int[] r5 = r8.getDirectory$okio()
            r5 = r5[r1]
            byte[][] r6 = r8.getSegments$okio()
            r6 = r6[r1]
            int r2 = r5 - r2
            int r2 = r2 + r4
        L2e:
            if (r4 >= r2) goto L38
            int r3 = r3 * 31
            r7 = r6[r4]
            int r3 = r3 + r7
            int r4 = r4 + 1
            goto L2e
        L38:
            int r1 = r1 + 1
            r2 = r5
            goto L15
        L3c:
            r8.setHashCode$okio(r3)
            return r3
    }

    public static final byte commonInternalGet(@org.jetbrains.annotations.NotNull okio.SegmentedByteString r7, int r8) {
            java.lang.String r0 = "$this$commonInternalGet"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int[] r0 = r7.getDirectory$okio()
            byte[][] r1 = r7.getSegments$okio()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            long r1 = (long) r0
            long r3 = (long) r8
            r5 = 1
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            int r0 = segment(r7, r8)
            if (r0 != 0) goto L21
            r1 = 0
            goto L29
        L21:
            int[] r1 = r7.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L29:
            int[] r2 = r7.getDirectory$okio()
            byte[][] r3 = r7.getSegments$okio()
            int r3 = r3.length
            int r3 = r3 + r0
            r2 = r2[r3]
            byte[][] r7 = r7.getSegments$okio()
            r7 = r7[r0]
            int r8 = r8 - r1
            int r8 = r8 + r2
            r7 = r7[r8]
            return r7
    }

    public static final boolean commonRangeEquals(@org.jetbrains.annotations.NotNull okio.SegmentedByteString r6, int r7, @org.jetbrains.annotations.NotNull okio.ByteString r8, int r9, int r10) {
            java.lang.String r0 = "$this$commonRangeEquals"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            if (r7 < 0) goto L58
            int r1 = r6.size()
            int r1 = r1 - r10
            if (r7 <= r1) goto L15
            goto L58
        L15:
            int r10 = r10 + r7
            int r1 = segment(r6, r7)
        L1a:
            if (r7 >= r10) goto L56
            if (r1 != 0) goto L20
            r2 = 0
            goto L28
        L20:
            int[] r2 = r6.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L28:
            int[] r3 = r6.getDirectory$okio()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r6.getDirectory$okio()
            byte[][] r5 = r6.getSegments$okio()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r10, r3)
            int r3 = r3 - r7
            int r2 = r7 - r2
            int r2 = r2 + r4
            byte[][] r4 = r6.getSegments$okio()
            r4 = r4[r1]
            boolean r2 = r8.rangeEquals(r9, r4, r2, r3)
            if (r2 != 0) goto L51
            return r0
        L51:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L1a
        L56:
            r6 = 1
            return r6
        L58:
            return r0
    }

    public static final boolean commonRangeEquals(@org.jetbrains.annotations.NotNull okio.SegmentedByteString r6, int r7, @org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
            java.lang.String r0 = "$this$commonRangeEquals"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            if (r7 < 0) goto L5e
            int r1 = r6.size()
            int r1 = r1 - r10
            if (r7 > r1) goto L5e
            if (r9 < 0) goto L5e
            int r1 = r8.length
            int r1 = r1 - r10
            if (r9 <= r1) goto L1b
            goto L5e
        L1b:
            int r10 = r10 + r7
            int r1 = segment(r6, r7)
        L20:
            if (r7 >= r10) goto L5c
            if (r1 != 0) goto L26
            r2 = 0
            goto L2e
        L26:
            int[] r2 = r6.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L2e:
            int[] r3 = r6.getDirectory$okio()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r6.getDirectory$okio()
            byte[][] r5 = r6.getSegments$okio()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r10, r3)
            int r3 = r3 - r7
            int r2 = r7 - r2
            int r2 = r2 + r4
            byte[][] r4 = r6.getSegments$okio()
            r4 = r4[r1]
            boolean r2 = okio.Util.arrayRangeEquals(r4, r2, r8, r9, r3)
            if (r2 != 0) goto L57
            return r0
        L57:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L20
        L5c:
            r6 = 1
            return r6
        L5e:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString commonSubstring(@org.jetbrains.annotations.NotNull okio.SegmentedByteString r10, int r11, int r12) {
            java.lang.String r0 = "$this$commonSubstring"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            if (r11 < 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto Lbd
            int r1 = r10.size()
            if (r12 > r1) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            java.lang.String r2 = "endIndex="
            if (r1 == 0) goto L9d
            int r1 = r12 - r11
            if (r1 < 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r3 == 0) goto L8d
            if (r11 != 0) goto L2c
            int r2 = r10.size()
            if (r12 != r2) goto L2c
            return r10
        L2c:
            if (r11 != r12) goto L31
            okio.ByteString r10 = okio.ByteString.EMPTY
            return r10
        L31:
            int r2 = segment(r10, r11)
            int r12 = r12 + (-1)
            int r12 = segment(r10, r12)
            byte[][] r3 = r10.getSegments$okio()
            int r4 = r12 + 1
            java.lang.Object[] r3 = kotlin.collections.ArraysKt.copyOfRange(r3, r2, r4)
            byte[][] r3 = (byte[][]) r3
            int r4 = r3.length
            int r4 = r4 * 2
            int[] r4 = new int[r4]
            if (r2 > r12) goto L75
            r5 = 0
            r6 = r2
        L50:
            int[] r7 = r10.getDirectory$okio()
            r7 = r7[r6]
            int r7 = r7 - r11
            int r7 = java.lang.Math.min(r7, r1)
            r4[r5] = r7
            int r7 = r5 + 1
            int r8 = r3.length
            int r5 = r5 + r8
            int[] r8 = r10.getDirectory$okio()
            byte[][] r9 = r10.getSegments$okio()
            int r9 = r9.length
            int r9 = r9 + r6
            r8 = r8[r9]
            r4[r5] = r8
            if (r6 == r12) goto L75
            int r6 = r6 + 1
            r5 = r7
            goto L50
        L75:
            if (r2 != 0) goto L78
            goto L80
        L78:
            int[] r10 = r10.getDirectory$okio()
            int r2 = r2 + (-1)
            r0 = r10[r2]
        L80:
            int r10 = r3.length
            r12 = r4[r10]
            int r11 = r11 - r0
            int r11 = r11 + r12
            r4[r10] = r11
            okio.SegmentedByteString r10 = new okio.SegmentedByteString
            r10.<init>(r3, r4)
            return r10
        L8d:
            java.lang.String r10 = " < beginIndex="
            java.lang.String r10 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r2, r12, r10, r11)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L9d:
            java.lang.String r11 = " > length("
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r2, r12, r11)
            int r10 = r10.size()
            r11.append(r10)
            r10 = 41
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        Lbd:
            java.lang.String r10 = "beginIndex="
            java.lang.String r12 = " < 0"
            java.lang.String r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r10, r11, r12)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] commonToByteArray(@org.jetbrains.annotations.NotNull okio.SegmentedByteString r9) {
            java.lang.String r0 = "$this$commonToByteArray"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r0 = r9.size()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r9.getSegments$okio()
            int r1 = r1.length
            r2 = 0
            r3 = 0
            r4 = 0
        L13:
            if (r2 >= r1) goto L35
            int[] r5 = r9.getDirectory$okio()
            int r6 = r1 + r2
            r5 = r5[r6]
            int[] r6 = r9.getDirectory$okio()
            r6 = r6[r2]
            byte[][] r7 = r9.getSegments$okio()
            r7 = r7[r2]
            int r3 = r6 - r3
            int r8 = r5 + r3
            kotlin.collections.ArraysKt.copyInto(r7, r0, r4, r5, r8)
            int r4 = r4 + r3
            int r2 = r2 + 1
            r3 = r6
            goto L13
        L35:
            return r0
    }

    public static final void commonWrite(@org.jetbrains.annotations.NotNull okio.SegmentedByteString r11, @org.jetbrains.annotations.NotNull okio.Buffer r12, int r13, int r14) {
            java.lang.String r0 = "$this$commonWrite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            int r0 = r13 + r14
            int r1 = segment(r11, r13)
        L10:
            if (r13 >= r0) goto L65
            if (r1 != 0) goto L16
            r2 = 0
            goto L1e
        L16:
            int[] r2 = r11.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L1e:
            int[] r3 = r11.getDirectory$okio()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r11.getDirectory$okio()
            byte[][] r5 = r11.getSegments$okio()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r0, r3)
            int r3 = r3 - r13
            int r2 = r13 - r2
            int r7 = r2 + r4
            byte[][] r2 = r11.getSegments$okio()
            r6 = r2[r1]
            okio.Segment r2 = new okio.Segment
            int r8 = r7 + r3
            r9 = 1
            r10 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            okio.Segment r4 = r12.head
            if (r4 != 0) goto L56
            r2.prev = r2
            r2.next = r2
            r12.head = r2
            goto L61
        L56:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r4.push(r2)
        L61:
            int r13 = r13 + r3
            int r1 = r1 + 1
            goto L10
        L65:
            long r0 = r12.size()
            long r13 = (long) r14
            long r0 = r0 + r13
            r12.setSize$okio(r0)
            return
    }

    private static final void forEachSegment(okio.SegmentedByteString r5, int r6, int r7, kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r8) {
            int r0 = segment(r5, r6)
        L4:
            if (r6 >= r7) goto L43
            if (r0 != 0) goto La
            r1 = 0
            goto L12
        La:
            int[] r1 = r5.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L12:
            int[] r2 = r5.getDirectory$okio()
            r2 = r2[r0]
            int r2 = r2 - r1
            int[] r3 = r5.getDirectory$okio()
            byte[][] r4 = r5.getSegments$okio()
            int r4 = r4.length
            int r4 = r4 + r0
            r3 = r3[r4]
            int r2 = r2 + r1
            int r2 = java.lang.Math.min(r7, r2)
            int r2 = r2 - r6
            int r1 = r6 - r1
            int r1 = r1 + r3
            byte[][] r3 = r5.getSegments$okio()
            r3 = r3[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r8.invoke(r3, r1, r4)
            int r6 = r6 + r2
            int r0 = r0 + 1
            goto L4
        L43:
            return
    }

    public static final void forEachSegment(@org.jetbrains.annotations.NotNull okio.SegmentedByteString r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r7) {
            java.lang.String r0 = "$this$forEachSegment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            byte[][] r0 = r6.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L11:
            if (r1 >= r0) goto L38
            int[] r3 = r6.getDirectory$okio()
            int r4 = r0 + r1
            r3 = r3[r4]
            int[] r4 = r6.getDirectory$okio()
            r4 = r4[r1]
            byte[][] r5 = r6.getSegments$okio()
            r5 = r5[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r4 - r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.invoke(r5, r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto L11
        L38:
            return
    }

    public static final int segment(@org.jetbrains.annotations.NotNull okio.SegmentedByteString r2, int r3) {
            java.lang.String r0 = "$this$segment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int[] r0 = r2.getDirectory$okio()
            int r3 = r3 + 1
            byte[][] r2 = r2.getSegments$okio()
            int r2 = r2.length
            r1 = 0
            int r2 = binarySearch(r0, r3, r1, r2)
            if (r2 < 0) goto L18
            goto L19
        L18:
            int r2 = ~r2
        L19:
            return r2
    }
}
