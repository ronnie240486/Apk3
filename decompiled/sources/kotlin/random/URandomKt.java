package kotlin.random;

/* JADX INFO: compiled from: URandom.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a2\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u001e\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a&\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010 \u001a\u0014\u0010!\u001a\u00020\b*\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\"\u001a\u001e\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0004\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a&\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u001e\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"checkUIntRangeBounds", "", "from", "Lkotlin/UInt;", "until", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "Lkotlin/ULong;", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "nextUBytes", "Lkotlin/UByteArray;", "Lkotlin/random/Random;", "size", "", "(Lkotlin/random/Random;I)[B", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "nextUInt", "(Lkotlin/random/Random;)I", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "range", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class URandomKt {
    /* JADX INFO: renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m1549checkUIntRangeBoundsJ1ME1BU(int r1, int r2) {
            int r0 = kotlin.UnsignedKt.uintCompare(r2, r1)
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Lc
            return
        Lc:
            kotlin.UInt r1 = kotlin.UInt.m421boximpl(r1)
            kotlin.UInt r2 = kotlin.UInt.m421boximpl(r2)
            java.lang.String r1 = kotlin.random.RandomKt.boundsErrorMessage(r1, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    /* JADX INFO: renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m1550checkULongRangeBoundseb3DHEI(long r1, long r3) {
            int r0 = kotlin.UnsignedKt.ulongCompare(r3, r1)
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Lc
            return
        Lc:
            kotlin.ULong r1 = kotlin.ULong.m499boximpl(r1)
            kotlin.ULong r2 = kotlin.ULong.m499boximpl(r3)
            java.lang.String r1 = kotlin.random.RandomKt.boundsErrorMessage(r1, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final byte[] nextUBytes(@org.jetbrains.annotations.NotNull kotlin.random.Random r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = r1.nextBytes(r2)
            byte[] r1 = kotlin.UByteArray.m403constructorimpl(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m1551nextUBytesEVgfTAA(@org.jetbrains.annotations.NotNull kotlin.random.Random r1, @org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "$this$nextUBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.nextBytes(r2)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m1552nextUBytesWvrt4B4(@org.jetbrains.annotations.NotNull kotlin.random.Random r1, @org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4) {
            java.lang.String r0 = "$this$nextUBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.nextBytes(r2, r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m1553nextUBytesWvrt4B4$default(kotlin.random.Random r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = kotlin.UByteArray.m409getSizeimpl(r1)
        Ld:
            byte[] r0 = m1552nextUBytesWvrt4B4(r0, r1, r2, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    public static final int nextUInt(@org.jetbrains.annotations.NotNull kotlin.random.Random r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.nextInt()
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    public static final int nextUInt(@org.jetbrains.annotations.NotNull kotlin.random.Random r2, @org.jetbrains.annotations.NotNull kotlin.ranges.UIntRange r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L57
            int r0 = r3.m1559getLastpVg5ArA()
            r1 = -1
            int r0 = kotlin.UnsignedKt.uintCompare(r0, r1)
            if (r0 >= 0) goto L2e
            int r0 = r3.m1558getFirstpVg5ArA()
            int r3 = r3.m1559getLastpVg5ArA()
            int r3 = r3 + 1
            int r3 = kotlin.UInt.m427constructorimpl(r3)
            int r2 = m1554nextUInta8DCA5k(r2, r0, r3)
            goto L56
        L2e:
            int r0 = r3.m1558getFirstpVg5ArA()
            r1 = 0
            int r0 = kotlin.UnsignedKt.uintCompare(r0, r1)
            if (r0 <= 0) goto L52
            int r0 = r3.m1558getFirstpVg5ArA()
            int r0 = r0 + (-1)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            int r3 = r3.m1559getLastpVg5ArA()
            int r2 = m1554nextUInta8DCA5k(r2, r0, r3)
            int r2 = r2 + 1
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            goto L56
        L52:
            int r2 = nextUInt(r2)
        L56:
            return r2
        L57:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot get random in empty range: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m1554nextUInta8DCA5k(@org.jetbrains.annotations.NotNull kotlin.random.Random r1, int r2, int r3) {
            java.lang.String r0 = "$this$nextUInt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            m1549checkUIntRangeBoundsJ1ME1BU(r2, r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r0
            r3 = r3 ^ r0
            int r1 = r1.nextInt(r2, r3)
            r1 = r1 ^ r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m1555nextUIntqCasIEU(@org.jetbrains.annotations.NotNull kotlin.random.Random r1, int r2) {
            java.lang.String r0 = "$this$nextUInt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            int r1 = m1554nextUInta8DCA5k(r1, r0, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    public static final long nextULong(@org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r0 = r2.nextLong()
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    public static final long nextULong(@org.jetbrains.annotations.NotNull kotlin.random.Random r10, @org.jetbrains.annotations.NotNull kotlin.ranges.ULongRange r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L6e
            long r0 = r11.m1566getLastsVKNKU()
            r2 = -1
            int r0 = kotlin.UnsignedKt.ulongCompare(r0, r2)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 1
            if (r0 >= 0) goto L3b
            long r4 = r11.m1565getFirstsVKNKU()
            long r6 = r11.m1566getLastsVKNKU()
            long r8 = (long) r3
            long r0 = r8 & r1
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r0 = r0 + r6
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r10 = m1557nextULongjmpaWc(r10, r4, r0)
            goto L6d
        L3b:
            long r4 = r11.m1565getFirstsVKNKU()
            r6 = 0
            int r0 = kotlin.UnsignedKt.ulongCompare(r4, r6)
            if (r0 <= 0) goto L69
            long r4 = r11.m1565getFirstsVKNKU()
            long r6 = (long) r3
            long r0 = r6 & r1
            long r2 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = r4 - r2
            long r2 = kotlin.ULong.m505constructorimpl(r4)
            long r4 = r11.m1566getLastsVKNKU()
            long r10 = m1557nextULongjmpaWc(r10, r2, r4)
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r0 = r0 + r10
            long r10 = kotlin.ULong.m505constructorimpl(r0)
            goto L6d
        L69:
            long r10 = nextULong(r10)
        L6d:
            return r10
        L6e:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot get random in empty range: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m1556nextULongV1Xi4fY(@org.jetbrains.annotations.NotNull kotlin.random.Random r2, long r3) {
            java.lang.String r0 = "$this$nextULong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            long r2 = m1557nextULongjmpaWc(r2, r0, r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m1557nextULongjmpaWc(@org.jetbrains.annotations.NotNull kotlin.random.Random r2, long r3, long r5) {
            java.lang.String r0 = "$this$nextULong"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            m1550checkULongRangeBoundseb3DHEI(r3, r5)
            r0 = -9223372036854775808
            long r3 = r3 ^ r0
            long r5 = r5 ^ r0
            long r2 = r2.nextLong(r3, r5)
            long r2 = r2 ^ r0
            long r2 = kotlin.ULong.m505constructorimpl(r2)
            return r2
    }
}
