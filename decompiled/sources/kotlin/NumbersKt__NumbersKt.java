package kotlin;

/* JADX INFO: compiled from: Numbers.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\b\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\r\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\t\u001a\u00020\u0003*\u00020\u0003H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0003*\u00020\u0003H\u0087\b¨\u0006\u000b"}, d2 = {"countLeadingZeroBits", "", "", "", "countOneBits", "countTrailingZeroBits", "rotateLeft", "bitCount", "rotateRight", "takeHighestOneBit", "takeLowestOneBit", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/NumbersKt")
class NumbersKt__NumbersKt extends kotlin.NumbersKt__NumbersJVMKt {
    public NumbersKt__NumbersKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final int countLeadingZeroBits(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = r0 + (-24)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final int countLeadingZeroBits(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = r1 + (-16)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final int countOneBits(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final int countOneBits(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.bitCount(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final int countTrailingZeroBits(byte r0) {
            r0 = r0 | 256(0x100, float:3.59E-43)
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final int countTrailingZeroBits(short r1) {
            r0 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 | r0
            int r1 = java.lang.Integer.numberOfTrailingZeros(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final byte rotateLeft(byte r1, int r2) {
            r2 = r2 & 7
            int r0 = r1 << r2
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = 8 - r2
            int r1 = r1 >>> r2
            r1 = r1 | r0
            byte r1 = (byte) r1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final short rotateLeft(short r2, int r3) {
            r3 = r3 & 15
            int r0 = r2 << r3
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            int r3 = 16 - r3
            int r2 = r2 >>> r3
            r2 = r2 | r0
            short r2 = (short) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final byte rotateRight(byte r1, int r2) {
            r2 = r2 & 7
            int r0 = 8 - r2
            int r0 = r1 << r0
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 >>> r2
            r1 = r1 | r0
            byte r1 = (byte) r1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final short rotateRight(short r2, int r3) {
            r3 = r3 & 15
            int r0 = 16 - r3
            int r0 = r2 << r0
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            int r2 = r2 >>> r3
            r2 = r2 | r0
            short r2 = (short) r2
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final byte takeHighestOneBit(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.highestOneBit(r0)
            byte r0 = (byte) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final short takeHighestOneBit(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.highestOneBit(r1)
            short r1 = (short) r1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final byte takeLowestOneBit(byte r0) {
            int r0 = java.lang.Integer.lowestOneBit(r0)
            byte r0 = (byte) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final short takeLowestOneBit(short r0) {
            int r0 = java.lang.Integer.lowestOneBit(r0)
            short r0 = (short) r0
            return r0
    }
}
