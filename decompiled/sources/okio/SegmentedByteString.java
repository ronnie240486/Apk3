package okio;

/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0015\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\r\u0010\u0019\u001a\u00020\u001aH\u0010¢\u0006\u0002\b\u001bJ\b\u0010\u001c\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\u001d\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0001H\u0010¢\u0006\u0002\b J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001aH\u0016J\r\u0010#\u001a\u00020\u0004H\u0010¢\u0006\u0002\b$J\u0015\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001aH\u0010¢\u0006\u0002\b(J\u0018\u0010)\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001aH\u0016J(\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001aH\u0016J(\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001aH\u0016J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u000200H\u0016J\u0018\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001aH\u0016J\b\u00104\u001a\u00020\u0001H\u0016J\b\u00105\u001a\u00020\u0001H\u0016J\b\u00106\u001a\u00020\u0004H\u0016J\b\u00107\u001a\u00020\u0001H\u0002J\b\u00108\u001a\u00020\u0010H\u0016J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0016J%\u00109\u001a\u00020:2\u0006\u0010=\u001a\u00020>2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001aH\u0010¢\u0006\u0002\b?J\b\u0010@\u001a\u00020AH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006B"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "segments", "", "", "directory", "", "([[B[I)V", "getDirectory$okio", "()[I", "getSegments$okio", "()[[B", "[[B", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "", "base64Url", "digest", "algorithm", "digest$okio", "equals", "", "other", "", "getSize", "", "getSize$okio", "hashCode", "hex", "hmac", "key", "hmac$okio", "indexOf", "fromIndex", "internalArray", "internalArray$okio", "internalGet", "", "pos", "internalGet$okio", "lastIndexOf", "rangeEquals", "offset", "otherOffset", "byteCount", "string", "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toByteString", "toString", "write", "", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$okio", "writeReplace", "Ljava/lang/Object;", "okio"}, k = 1, mv = {1, 4, 1})
public final class SegmentedByteString extends okio.ByteString {

    @org.jetbrains.annotations.NotNull
    private final transient int[] directory;

    @org.jetbrains.annotations.NotNull
    private final transient byte[][] segments;

    public SegmentedByteString(@org.jetbrains.annotations.NotNull byte[][] r2, @org.jetbrains.annotations.NotNull int[] r3) {
            r1 = this;
            java.lang.String r0 = "segments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.ByteString r0 = okio.ByteString.EMPTY
            byte[] r0 = r0.getData$okio()
            r1.<init>(r0)
            r1.segments = r2
            r1.directory = r3
            return
    }

    private final okio.ByteString toByteString() {
            r2 = this;
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = r2.toByteArray()
            r0.<init>(r1)
            return r0
    }

    private final java.lang.Object writeReplace() {
            r2 = this;
            okio.ByteString r0 = r2.toByteString()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public java.nio.ByteBuffer asByteBuffer() {
            r2 = this;
            byte[] r0 = r2.toByteArray()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            java.lang.String r1 = "ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public java.lang.String base64() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.base64()
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public java.lang.String base64Url() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.base64Url()
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public okio.ByteString digest$okio(@org.jetbrains.annotations.NotNull java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)
            byte[][] r0 = r6.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L10:
            if (r1 >= r0) goto L2f
            int[] r3 = r6.getDirectory$okio()
            int r4 = r0 + r1
            r3 = r3[r4]
            int[] r4 = r6.getDirectory$okio()
            r4 = r4[r1]
            byte[][] r5 = r6.getSegments$okio()
            r5 = r5[r1]
            int r2 = r4 - r2
            r7.update(r5, r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto L10
        L2f:
            byte[] r7 = r7.digest()
            okio.ByteString r0 = new okio.ByteString
            java.lang.String r1 = "digestBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            r0.<init>(r7)
            return r0
    }

    @Override // okio.ByteString
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != r4) goto L5
            goto L21
        L5:
            boolean r2 = r5 instanceof okio.ByteString
            if (r2 == 0) goto L20
            okio.ByteString r5 = (okio.ByteString) r5
            int r2 = r5.size()
            int r3 = r4.size()
            if (r2 != r3) goto L20
            int r2 = r4.size()
            boolean r5 = r4.rangeEquals(r1, r5, r1, r2)
            if (r5 == 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final int[] getDirectory$okio() {
            r1 = this;
            int[] r0 = r1.directory
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final byte[][] getSegments$okio() {
            r1 = this;
            byte[][] r0 = r1.segments
            return r0
    }

    @Override // okio.ByteString
    public int getSize$okio() {
            r2 = this;
            int[] r0 = r2.getDirectory$okio()
            byte[][] r1 = r2.getSegments$okio()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    @Override // okio.ByteString
    public int hashCode() {
            r8 = this;
            int r0 = r8.getHashCode$okio()
            if (r0 == 0) goto L7
            goto L3a
        L7:
            byte[][] r0 = r8.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = 1
            r3 = 0
        Lf:
            if (r1 >= r0) goto L36
            int[] r4 = r8.getDirectory$okio()
            int r5 = r0 + r1
            r4 = r4[r5]
            int[] r5 = r8.getDirectory$okio()
            r5 = r5[r1]
            byte[][] r6 = r8.getSegments$okio()
            r6 = r6[r1]
            int r3 = r5 - r3
            int r3 = r3 + r4
        L28:
            if (r4 >= r3) goto L32
            int r2 = r2 * 31
            r7 = r6[r4]
            int r2 = r2 + r7
            int r4 = r4 + 1
            goto L28
        L32:
            int r1 = r1 + 1
            r3 = r5
            goto Lf
        L36:
            r8.setHashCode$okio(r2)
            r0 = r2
        L3a:
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public java.lang.String hex() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.hex()
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public okio.ByteString hmac$okio(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull okio.ByteString r7) {
            r5 = this;
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r6)     // Catch: java.security.InvalidKeyException -> L4f
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L4f
            byte[] r7 = r7.toByteArray()     // Catch: java.security.InvalidKeyException -> L4f
            r1.<init>(r7, r6)     // Catch: java.security.InvalidKeyException -> L4f
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L4f
            byte[][] r6 = r5.getSegments$okio()     // Catch: java.security.InvalidKeyException -> L4f
            int r6 = r6.length     // Catch: java.security.InvalidKeyException -> L4f
            r7 = 0
            r1 = 0
        L21:
            if (r7 >= r6) goto L40
            int[] r2 = r5.getDirectory$okio()     // Catch: java.security.InvalidKeyException -> L4f
            int r3 = r6 + r7
            r2 = r2[r3]     // Catch: java.security.InvalidKeyException -> L4f
            int[] r3 = r5.getDirectory$okio()     // Catch: java.security.InvalidKeyException -> L4f
            r3 = r3[r7]     // Catch: java.security.InvalidKeyException -> L4f
            byte[][] r4 = r5.getSegments$okio()     // Catch: java.security.InvalidKeyException -> L4f
            r4 = r4[r7]     // Catch: java.security.InvalidKeyException -> L4f
            int r1 = r3 - r1
            r0.update(r4, r2, r1)     // Catch: java.security.InvalidKeyException -> L4f
            int r7 = r7 + 1
            r1 = r3
            goto L21
        L40:
            okio.ByteString r6 = new okio.ByteString     // Catch: java.security.InvalidKeyException -> L4f
            byte[] r7 = r0.doFinal()     // Catch: java.security.InvalidKeyException -> L4f
            java.lang.String r0 = "mac.doFinal()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)     // Catch: java.security.InvalidKeyException -> L4f
            r6.<init>(r7)     // Catch: java.security.InvalidKeyException -> L4f
            return r6
        L4f:
            r6 = move-exception
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r6)
            throw r7
    }

    @Override // okio.ByteString
    public int indexOf(@org.jetbrains.annotations.NotNull byte[] r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString r0 = r1.toByteString()
            int r2 = r0.indexOf(r2, r3)
            return r2
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public byte[] internalArray$okio() {
            r1 = this;
            byte[] r0 = r1.toByteArray()
            return r0
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int r8) {
            r7 = this;
            int[] r0 = r7.getDirectory$okio()
            byte[][] r1 = r7.getSegments$okio()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            long r1 = (long) r0
            long r3 = (long) r8
            r5 = 1
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            int r0 = okio.internal.SegmentedByteStringKt.segment(r7, r8)
            if (r0 != 0) goto L1c
            r1 = 0
            goto L24
        L1c:
            int[] r1 = r7.getDirectory$okio()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L24:
            int[] r2 = r7.getDirectory$okio()
            byte[][] r3 = r7.getSegments$okio()
            int r3 = r3.length
            int r3 = r3 + r0
            r2 = r2[r3]
            byte[][] r3 = r7.getSegments$okio()
            r0 = r3[r0]
            int r8 = r8 - r1
            int r8 = r8 + r2
            r8 = r0[r8]
            return r8
    }

    @Override // okio.ByteString
    public int lastIndexOf(@org.jetbrains.annotations.NotNull byte[] r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString r0 = r1.toByteString()
            int r2 = r0.lastIndexOf(r2, r3)
            return r2
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int r7, @org.jetbrains.annotations.NotNull okio.ByteString r8, int r9, int r10) {
            r6 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            if (r7 < 0) goto L52
            int r1 = r6.size()
            int r1 = r1 - r10
            if (r7 <= r1) goto L10
            goto L52
        L10:
            int r10 = r10 + r7
            int r1 = okio.internal.SegmentedByteStringKt.segment(r6, r7)
        L15:
            if (r7 >= r10) goto L51
            if (r1 != 0) goto L1b
            r2 = 0
            goto L23
        L1b:
            int[] r2 = r6.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L23:
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
            if (r2 != 0) goto L4c
            goto L52
        L4c:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L15
        L51:
            r0 = 1
        L52:
            return r0
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int r7, @org.jetbrains.annotations.NotNull byte[] r8, int r9, int r10) {
            r6 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            if (r7 < 0) goto L58
            int r1 = r6.size()
            int r1 = r1 - r10
            if (r7 > r1) goto L58
            if (r9 < 0) goto L58
            int r1 = r8.length
            int r1 = r1 - r10
            if (r9 <= r1) goto L16
            goto L58
        L16:
            int r10 = r10 + r7
            int r1 = okio.internal.SegmentedByteStringKt.segment(r6, r7)
        L1b:
            if (r7 >= r10) goto L57
            if (r1 != 0) goto L21
            r2 = 0
            goto L29
        L21:
            int[] r2 = r6.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L29:
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
            if (r2 != 0) goto L52
            goto L58
        L52:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L1b
        L57:
            r0 = 1
        L58:
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public java.lang.String string(@org.jetbrains.annotations.NotNull java.nio.charset.Charset r2) {
            r1 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r2 = r0.string(r2)
            return r2
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public okio.ByteString substring(int r11, int r12) {
            r10 = this;
            r0 = 0
            if (r11 < 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            if (r1 == 0) goto Lb9
            int r1 = r10.size()
            if (r12 > r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            java.lang.String r2 = "endIndex="
            if (r1 == 0) goto L99
            int r1 = r12 - r11
            if (r1 < 0) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            if (r3 == 0) goto L89
            if (r11 != 0) goto L28
            int r2 = r10.size()
            if (r12 != r2) goto L28
            r11 = r10
            goto L88
        L28:
            if (r11 != r12) goto L2d
            okio.ByteString r11 = okio.ByteString.EMPTY
            goto L88
        L2d:
            int r2 = okio.internal.SegmentedByteStringKt.segment(r10, r11)
            int r12 = r12 + (-1)
            int r12 = okio.internal.SegmentedByteStringKt.segment(r10, r12)
            byte[][] r3 = r10.getSegments$okio()
            int r4 = r12 + 1
            java.lang.Object[] r3 = kotlin.collections.ArraysKt.copyOfRange(r3, r2, r4)
            byte[][] r3 = (byte[][]) r3
            int r4 = r3.length
            int r4 = r4 * 2
            int[] r4 = new int[r4]
            if (r2 > r12) goto L71
            r5 = 0
            r6 = r2
        L4c:
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
            if (r6 == r12) goto L71
            int r6 = r6 + 1
            r5 = r7
            goto L4c
        L71:
            if (r2 != 0) goto L74
            goto L7c
        L74:
            int[] r12 = r10.getDirectory$okio()
            int r2 = r2 + (-1)
            r0 = r12[r2]
        L7c:
            int r12 = r3.length
            r1 = r4[r12]
            int r11 = r11 - r0
            int r11 = r11 + r1
            r4[r12] = r11
            okio.SegmentedByteString r11 = new okio.SegmentedByteString
            r11.<init>(r3, r4)
        L88:
            return r11
        L89:
            java.lang.String r0 = " < beginIndex="
            java.lang.String r11 = androidx.emoji2.text.flatbuffer.Utf8Safe$UnpairedSurrogateException$$ExternalSyntheticOutline0.m(r2, r12, r0, r11)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L99:
            java.lang.String r11 = " > length("
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r2, r12, r11)
            int r12 = r10.size()
            r11.append(r12)
            r12 = 41
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        Lb9:
            java.lang.String r12 = "beginIndex="
            java.lang.String r0 = " < 0"
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12, r11, r0)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public okio.ByteString toAsciiLowercase() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r0 = r0.toAsciiLowercase()
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public okio.ByteString toAsciiUppercase() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r0 = r0.toAsciiUppercase()
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public byte[] toByteArray() {
            r9 = this;
            int r0 = r9.size()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r9.getSegments$okio()
            int r1 = r1.length
            r2 = 0
            r3 = 0
            r4 = 0
        Le:
            if (r2 >= r1) goto L30
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
            goto Le
        L30:
            return r0
    }

    @Override // okio.ByteString
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // okio.ByteString
    public void write(@org.jetbrains.annotations.NotNull java.io.OutputStream r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            byte[][] r0 = r6.getSegments$okio()
            int r0 = r0.length
            r1 = 0
            r2 = 0
        Lc:
            if (r1 >= r0) goto L2b
            int[] r3 = r6.getDirectory$okio()
            int r4 = r0 + r1
            r3 = r3[r4]
            int[] r4 = r6.getDirectory$okio()
            r4 = r4[r1]
            byte[][] r5 = r6.getSegments$okio()
            r5 = r5[r1]
            int r2 = r4 - r2
            r7.write(r5, r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto Lc
        L2b:
            return
    }

    @Override // okio.ByteString
    public void write$okio(@org.jetbrains.annotations.NotNull okio.Buffer r12, int r13, int r14) {
            r11 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            int r0 = r13 + r14
            int r1 = okio.internal.SegmentedByteStringKt.segment(r11, r13)
        Lb:
            if (r13 >= r0) goto L60
            if (r1 != 0) goto L11
            r2 = 0
            goto L19
        L11:
            int[] r2 = r11.getDirectory$okio()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L19:
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
            if (r4 != 0) goto L51
            r2.prev = r2
            r2.next = r2
            r12.head = r2
            goto L5c
        L51:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r4.push(r2)
        L5c:
            int r13 = r13 + r3
            int r1 = r1 + 1
            goto Lb
        L60:
            long r0 = r12.size()
            long r13 = (long) r14
            long r0 = r0 + r13
            r12.setSize$okio(r0)
            return
    }
}
