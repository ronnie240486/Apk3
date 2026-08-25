package kotlin;

/* JADX INFO: compiled from: UNumbers.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0004\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0007\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\n\u001a\u0017\u0010\u000e\u001a\u00020\u0001*\u00020\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\r\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0004\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a\u0017\u0010\u0013\u001a\u00020\u0001*\u00020\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\r\u001a\u001f\u0010\u0018\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u0018\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u0018\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010\u0018\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010\u001b\u001a\u001f\u0010\"\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b$\u0010\u001d\u001a\u001f\u0010\"\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b%\u0010\u001f\u001a\u001f\u0010\"\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b&\u0010!\u001a\u0017\u0010'\u001a\u00020\u0002*\u00020\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010'\u001a\u00020\u0005*\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0007\u001a\u0017\u0010'\u001a\u00020\b*\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010'\u001a\u00020\u000b*\u00020\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0017\u0010/\u001a\u00020\u0002*\u00020\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b0\u0010)\u001a\u0017\u0010/\u001a\u00020\u0005*\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010\u0007\u001a\u0017\u0010/\u001a\u00020\b*\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b2\u0010,\u001a\u0017\u0010/\u001a\u00020\u000b*\u00020\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b3\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"countLeadingZeroBits", "", "Lkotlin/UByte;", "countLeadingZeroBits-7apg3OU", "(B)I", "Lkotlin/UInt;", "countLeadingZeroBits-WZ4Q5Ns", "(I)I", "Lkotlin/ULong;", "countLeadingZeroBits-VKZWuLQ", "(J)I", "Lkotlin/UShort;", "countLeadingZeroBits-xj2QHRw", "(S)I", "countOneBits", "countOneBits-7apg3OU", "countOneBits-WZ4Q5Ns", "countOneBits-VKZWuLQ", "countOneBits-xj2QHRw", "countTrailingZeroBits", "countTrailingZeroBits-7apg3OU", "countTrailingZeroBits-WZ4Q5Ns", "countTrailingZeroBits-VKZWuLQ", "countTrailingZeroBits-xj2QHRw", "rotateLeft", "bitCount", "rotateLeft-LxnNnR4", "(BI)B", "rotateLeft-V7xB4Y4", "(II)I", "rotateLeft-JSWoG40", "(JI)J", "rotateLeft-olVBNx4", "(SI)S", "rotateRight", "rotateRight-LxnNnR4", "rotateRight-V7xB4Y4", "rotateRight-JSWoG40", "rotateRight-olVBNx4", "takeHighestOneBit", "takeHighestOneBit-7apg3OU", "(B)B", "takeHighestOneBit-WZ4Q5Ns", "takeHighestOneBit-VKZWuLQ", "(J)J", "takeHighestOneBit-xj2QHRw", "(S)S", "takeLowestOneBit", "takeLowestOneBit-7apg3OU", "takeLowestOneBit-WZ4Q5Ns", "takeLowestOneBit-VKZWuLQ", "takeLowestOneBit-xj2QHRw", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmName(name = "UNumbersKt")
public final class UNumbersKt {
    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: countLeadingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m576countLeadingZeroBits7apg3OU(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = r0 + (-24)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: countLeadingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m577countLeadingZeroBitsVKZWuLQ(long r0) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: countLeadingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m578countLeadingZeroBitsWZ4Q5Ns(int r0) {
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: countLeadingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m579countLeadingZeroBitsxj2QHRw(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = r1 + (-16)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: countOneBits-7apg3OU, reason: not valid java name */
    private static final int m580countOneBits7apg3OU(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: countOneBits-VKZWuLQ, reason: not valid java name */
    private static final int m581countOneBitsVKZWuLQ(long r0) {
            int r0 = java.lang.Long.bitCount(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: countOneBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m582countOneBitsWZ4Q5Ns(int r0) {
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: countOneBits-xj2QHRw, reason: not valid java name */
    private static final int m583countOneBitsxj2QHRw(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = java.lang.Integer.bitCount(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: countTrailingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m584countTrailingZeroBits7apg3OU(byte r0) {
            r0 = r0 | 256(0x100, float:3.59E-43)
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: countTrailingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m585countTrailingZeroBitsVKZWuLQ(long r0) {
            int r0 = java.lang.Long.numberOfTrailingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: countTrailingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m586countTrailingZeroBitsWZ4Q5Ns(int r0) {
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: countTrailingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m587countTrailingZeroBitsxj2QHRw(short r1) {
            r0 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 | r0
            int r1 = java.lang.Integer.numberOfTrailingZeros(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class, kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rotateLeft-JSWoG40, reason: not valid java name */
    private static final long m588rotateLeftJSWoG40(long r0, int r2) {
            long r0 = java.lang.Long.rotateLeft(r0, r2)
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class, kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rotateLeft-LxnNnR4, reason: not valid java name */
    private static final byte m589rotateLeftLxnNnR4(byte r0, int r1) {
            byte r0 = kotlin.NumbersKt__NumbersKt.rotateLeft(r0, r1)
            byte r0 = kotlin.UByte.m351constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class, kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rotateLeft-V7xB4Y4, reason: not valid java name */
    private static final int m590rotateLeftV7xB4Y4(int r0, int r1) {
            int r0 = java.lang.Integer.rotateLeft(r0, r1)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class, kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rotateLeft-olVBNx4, reason: not valid java name */
    private static final short m591rotateLeftolVBNx4(short r0, int r1) {
            short r0 = kotlin.NumbersKt__NumbersKt.rotateLeft(r0, r1)
            short r0 = kotlin.UShort.m611constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class, kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rotateRight-JSWoG40, reason: not valid java name */
    private static final long m592rotateRightJSWoG40(long r0, int r2) {
            long r0 = java.lang.Long.rotateRight(r0, r2)
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class, kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rotateRight-LxnNnR4, reason: not valid java name */
    private static final byte m593rotateRightLxnNnR4(byte r0, int r1) {
            byte r0 = kotlin.NumbersKt__NumbersKt.rotateRight(r0, r1)
            byte r0 = kotlin.UByte.m351constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class, kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rotateRight-V7xB4Y4, reason: not valid java name */
    private static final int m594rotateRightV7xB4Y4(int r0, int r1) {
            int r0 = java.lang.Integer.rotateRight(r0, r1)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class, kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rotateRight-olVBNx4, reason: not valid java name */
    private static final short m595rotateRightolVBNx4(short r0, int r1) {
            short r0 = kotlin.NumbersKt__NumbersKt.rotateRight(r0, r1)
            short r0 = kotlin.UShort.m611constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: takeHighestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m596takeHighestOneBit7apg3OU(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.highestOneBit(r0)
            byte r0 = (byte) r0
            byte r0 = kotlin.UByte.m351constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: takeHighestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m597takeHighestOneBitVKZWuLQ(long r0) {
            long r0 = java.lang.Long.highestOneBit(r0)
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: takeHighestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m598takeHighestOneBitWZ4Q5Ns(int r0) {
            int r0 = java.lang.Integer.highestOneBit(r0)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: takeHighestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m599takeHighestOneBitxj2QHRw(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.highestOneBit(r1)
            short r1 = (short) r1
            short r1 = kotlin.UShort.m611constructorimpl(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: takeLowestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m600takeLowestOneBit7apg3OU(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.lowestOneBit(r0)
            byte r0 = (byte) r0
            byte r0 = kotlin.UByte.m351constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: takeLowestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m601takeLowestOneBitVKZWuLQ(long r0) {
            long r0 = java.lang.Long.lowestOneBit(r0)
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: takeLowestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m602takeLowestOneBitWZ4Q5Ns(int r0) {
            int r0 = java.lang.Integer.lowestOneBit(r0)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class, kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: takeLowestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m603takeLowestOneBitxj2QHRw(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.lowestOneBit(r1)
            short r1 = (short) r1
            short r1 = kotlin.UShort.m611constructorimpl(r1)
            return r1
    }
}
