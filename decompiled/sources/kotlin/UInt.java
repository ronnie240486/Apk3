package kotlin;

/* JADX INFO: compiled from: UInt.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.5")
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 y2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001yB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\rH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0005J\u001b\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000fJ\u001b\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u001b\u0010\u0019\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010\u001f\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b%\u0010\u000fJ\u001b\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b&\u0010\u000bJ\u001b\u0010$\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u001dJ\u001b\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010\u0005J\u0016\u0010+\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0005J\u0016\u0010-\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010\u0005J\u001b\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\nø\u0001\u0000¢\u0006\u0004\b0\u0010\u000fJ\u001b\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b1\u0010\u000bJ\u001b\u0010/\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b2\u0010\u001dJ\u001b\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u0016J\u001b\u00104\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u0010\u000bJ\u001b\u00104\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u0010\u001dJ\u001b\u00104\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b<\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\nø\u0001\u0000¢\u0006\u0004\b>\u0010\u000fJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u001dJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0016J\u001b\u0010B\u001a\u00020C2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\nø\u0001\u0000¢\u0006\u0004\bG\u0010\u000fJ\u001b\u0010F\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bH\u0010\u000bJ\u001b\u0010F\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010\u001dJ\u001b\u0010F\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bJ\u0010\u0016J\u001e\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0003H\u0087\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010\u000bJ\u001e\u0010N\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0003H\u0087\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010\u000bJ\u001b\u0010P\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u000fJ\u001b\u0010P\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bR\u0010\u000bJ\u001b\u0010P\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bS\u0010\u001dJ\u001b\u0010P\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bT\u0010\u0016J\u0010\u0010U\u001a\u00020VH\u0087\b¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020ZH\u0087\b¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020^H\u0087\b¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bb\u0010\u0005J\u0010\u0010c\u001a\u00020dH\u0087\b¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020hH\u0087\b¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u0016\u0010o\u001a\u00020\rH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bp\u0010XJ\u0016\u0010q\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\br\u0010\u0005J\u0016\u0010s\u001a\u00020\u0011H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bt\u0010fJ\u0016\u0010u\u001a\u00020\u0014H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bv\u0010jJ\u001b\u0010w\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bx\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006z"}, d2 = {"Lkotlin/UInt;", "", "data", "", "constructor-impl", "(I)I", "getData$annotations", "()V", "and", "other", "and-WZ4Q5Ns", "(II)I", "compareTo", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "compareTo-WZ4Q5Ns", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "dec", "dec-pVg5ArA", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(IJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(ILjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "inc", "inc-pVg5ArA", "inv", "inv-pVg5ArA", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(IB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(IS)S", "or", "or-WZ4Q5Ns", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-pVg5ArA", "shr", "shr-pVg5ArA", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(I)B", "toDouble", "", "toDouble-impl", "(I)D", "toFloat", "", "toFloat-impl", "(I)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(I)J", "toShort", "", "toShort-impl", "(I)S", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-WZ4Q5Ns", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmInline
@kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
public final class UInt implements java.lang.Comparable<kotlin.UInt> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.UInt.Companion Companion = null;
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    /* JADX INFO: compiled from: UInt.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UInt$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UInt;", "I", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.UInt$Companion r0 = new kotlin.UInt$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.UInt.Companion = r0
            return
    }

    @kotlin.PublishedApi
    private /* synthetic */ UInt(int r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            return
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: and-WZ4Q5Ns, reason: not valid java name */
    private static final int m420andWZ4Q5Ns(int r0, int r1) {
            r0 = r0 & r1
            int r0 = m427constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m421boximpl(int r1) {
            kotlin.UInt r0 = new kotlin.UInt
            r0.<init>(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m422compareTo7apg3OU(int r0, byte r1) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = m427constructorimpl(r1)
            int r0 = kotlin.UnsignedKt.uintCompare(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m423compareToVKZWuLQ(int r4, long r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            int r4 = kotlin.UnsignedKt.ulongCompare(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private int m424compareToWZ4Q5Ns(int r2) {
            r1 = this;
            int r0 = r1.m478unboximpl()
            int r2 = kotlin.UnsignedKt.uintCompare(r0, r2)
            return r2
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static int m425compareToWZ4Q5Ns(int r0, int r1) {
            int r0 = kotlin.UnsignedKt.uintCompare(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m426compareToxj2QHRw(int r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.uintCompare(r1, r2)
            return r1
    }

    @kotlin.PublishedApi
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m427constructorimpl(int r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: dec-pVg5ArA, reason: not valid java name */
    private static final int m428decpVg5ArA(int r0) {
            int r0 = r0 + (-1)
            int r0 = m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m429div7apg3OU(int r0, byte r1) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = m427constructorimpl(r1)
            int r0 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m430divVKZWuLQ(int r4, long r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m431divWZ4Q5Ns(int r0, int r1) {
            int r0 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m432divxj2QHRw(int r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m433equalsimpl(int r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlin.UInt
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.UInt r3 = (kotlin.UInt) r3
            int r3 = r3.m478unboximpl()
            if (r2 == r3) goto Lf
            return r1
        Lf:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m434equalsimpl0(int r0, int r1) {
            if (r0 != r1) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m435floorDiv7apg3OU(int r0, byte r1) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = m427constructorimpl(r1)
            int r0 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m436floorDivVKZWuLQ(int r4, long r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m437floorDivWZ4Q5Ns(int r0, int r1) {
            int r0 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m438floorDivxj2QHRw(int r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r1, r2)
            return r1
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getData$annotations() {
            return
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m439hashCodeimpl(int r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: inc-pVg5ArA, reason: not valid java name */
    private static final int m440incpVg5ArA(int r0) {
            int r0 = r0 + 1
            int r0 = m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: inv-pVg5ArA, reason: not valid java name */
    private static final int m441invpVg5ArA(int r0) {
            int r0 = ~r0
            int r0 = m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m442minus7apg3OU(int r0, byte r1) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = m427constructorimpl(r1)
            int r0 = r0 - r1
            int r0 = m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m443minusVKZWuLQ(int r4, long r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r0 = r0 - r5
            long r4 = kotlin.ULong.m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m444minusWZ4Q5Ns(int r0, int r1) {
            int r0 = r0 - r1
            int r0 = m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m445minusxj2QHRw(int r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = m427constructorimpl(r2)
            int r1 = r1 - r2
            int r1 = m427constructorimpl(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m446mod7apg3OU(int r0, byte r1) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = m427constructorimpl(r1)
            int r0 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r0, r1)
            byte r0 = (byte) r0
            byte r0 = kotlin.UByte.m351constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m447modVKZWuLQ(int r4, long r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m448modWZ4Q5Ns(int r0, int r1) {
            int r0 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m449modxj2QHRw(int r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r1, r2)
            short r1 = (short) r1
            short r1 = kotlin.UShort.m611constructorimpl(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: or-WZ4Q5Ns, reason: not valid java name */
    private static final int m450orWZ4Q5Ns(int r0, int r1) {
            r0 = r0 | r1
            int r0 = m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m451plus7apg3OU(int r0, byte r1) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = m427constructorimpl(r1)
            int r1 = r1 + r0
            int r0 = m427constructorimpl(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m452plusVKZWuLQ(int r4, long r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r0 = r0 + r5
            long r4 = kotlin.ULong.m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m453plusWZ4Q5Ns(int r0, int r1) {
            int r0 = r0 + r1
            int r0 = m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m454plusxj2QHRw(int r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = m427constructorimpl(r2)
            int r2 = r2 + r1
            int r1 = m427constructorimpl(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rangeTo-WZ4Q5Ns, reason: not valid java name */
    private static final kotlin.ranges.UIntRange m455rangeToWZ4Q5Ns(int r2, int r3) {
            kotlin.ranges.UIntRange r0 = new kotlin.ranges.UIntRange
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m456rem7apg3OU(int r0, byte r1) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = m427constructorimpl(r1)
            int r0 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m457remVKZWuLQ(int r4, long r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m458remWZ4Q5Ns(int r0, int r1) {
            int r0 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m459remxj2QHRw(int r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: shl-pVg5ArA, reason: not valid java name */
    private static final int m460shlpVg5ArA(int r0, int r1) {
            int r0 = r0 << r1
            int r0 = m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: shr-pVg5ArA, reason: not valid java name */
    private static final int m461shrpVg5ArA(int r0, int r1) {
            int r0 = r0 >>> r1
            int r0 = m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m462times7apg3OU(int r0, byte r1) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = m427constructorimpl(r1)
            int r1 = r1 * r0
            int r0 = m427constructorimpl(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m463timesVKZWuLQ(int r4, long r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r0 = r0 * r5
            long r4 = kotlin.ULong.m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m464timesWZ4Q5Ns(int r0, int r1) {
            int r0 = r0 * r1
            int r0 = m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m465timesxj2QHRw(int r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = m427constructorimpl(r2)
            int r2 = r2 * r1
            int r1 = m427constructorimpl(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m466toByteimpl(int r0) {
            byte r0 = (byte) r0
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m467toDoubleimpl(int r2) {
            double r0 = kotlin.UnsignedKt.uintToDouble(r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m468toFloatimpl(int r2) {
            double r0 = kotlin.UnsignedKt.uintToDouble(r2)
            float r2 = (float) r0
            return r2
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m469toIntimpl(int r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m470toLongimpl(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m471toShortimpl(int r0) {
            short r0 = (short) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m472toStringimpl(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            java.lang.String r4 = java.lang.String.valueOf(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m473toUBytew2LRezQ(int r0) {
            byte r0 = (byte) r0
            byte r0 = kotlin.UByte.m351constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m474toUIntpVg5ArA(int r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m475toULongsVKNKU(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m476toUShortMh2AYeg(int r0) {
            short r0 = (short) r0
            short r0 = kotlin.UShort.m611constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: xor-WZ4Q5Ns, reason: not valid java name */
    private static final int m477xorWZ4Q5Ns(int r0, int r1) {
            r0 = r0 ^ r1
            int r0 = m427constructorimpl(r0)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.UInt r2) {
            r1 = this;
            kotlin.UInt r2 = (kotlin.UInt) r2
            int r2 = r2.m478unboximpl()
            int r0 = r1.m478unboximpl()
            int r2 = kotlin.UnsignedKt.uintCompare(r0, r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.data
            boolean r2 = m433equalsimpl(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.data
            int r0 = m439hashCodeimpl(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.data
            java.lang.String r0 = m472toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m478unboximpl() {
            r1 = this;
            int r0 = r1.data
            return r0
    }
}
