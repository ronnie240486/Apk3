package kotlin;

/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.5")
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001tB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u000fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0012J\u001b\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u000fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0012J\u001b\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u000fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0012J\u001b\u00102\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u0010\u000bJ\u001b\u00107\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010\u0012J\u001b\u00107\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u001fJ\u001b\u00107\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u000fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0012J\u001b\u0010?\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010\u000fJ\u001b\u0010H\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bJ\u0010\u0012J\u001b\u0010H\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u001fJ\u001b\u0010H\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0018J\u001b\u0010M\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u000fJ\u001b\u0010M\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bO\u0010\u0012J\u001b\u0010M\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u001fJ\u001b\u0010M\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0018J\u0010\u0010R\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bS\u0010\u0005J\u0010\u0010T\u001a\u00020UH\u0087\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020YH\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\rH\u0087\b¢\u0006\u0004\b]\u0010-J\u0010\u0010^\u001a\u00020_H\u0087\b¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u0016\u0010j\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010\u0005J\u0016\u0010l\u001a\u00020\u0010H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010-J\u0016\u0010n\u001a\u00020\u0013H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010aJ\u0016\u0010p\u001a\u00020\u0016H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010eJ\u001b\u0010r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bs\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006u"}, d2 = {"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "getData$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-w2LRezQ", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(BLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(B)I", "inc", "inc-w2LRezQ", "inv", "inv-w2LRezQ", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toDouble", "", "toDouble-impl", "(B)D", "toFloat", "", "toFloat-impl", "(B)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmInline
@kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
public final class UByte implements java.lang.Comparable<kotlin.UByte> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.UByte.Companion Companion = null;
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    /* JADX INFO: compiled from: UByte.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UByte$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UByte;", "B", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
            kotlin.UByte$Companion r0 = new kotlin.UByte$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.UByte.Companion = r0
            return
    }

    @kotlin.PublishedApi
    private /* synthetic */ UByte(byte r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            return
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m344and7apg3OU(byte r0, byte r1) {
            r0 = r0 & r1
            byte r0 = (byte) r0
            byte r0 = m351constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m345boximpl(byte r1) {
            kotlin.UByte r0 = new kotlin.UByte
            r0.<init>(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m346compareTo7apg3OU(byte r2) {
            r1 = this;
            byte r0 = r1.m400unboximpl()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r0, r2)
            return r2
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m347compareTo7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m348compareToVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            int r4 = kotlin.UnsignedKt.ulongCompare(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m349compareToWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            int r0 = kotlin.UnsignedKt.uintCompare(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m350compareToxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r2)
            return r1
    }

    @kotlin.PublishedApi
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m351constructorimpl(byte r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m352decw2LRezQ(byte r0) {
            int r0 = r0 + (-1)
            byte r0 = (byte) r0
            byte r0 = m351constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m353div7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r0 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m354divVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m355divWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            int r0 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m356divxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m357equalsimpl(byte r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlin.UByte
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.UByte r3 = (kotlin.UByte) r3
            byte r3 = r3.m400unboximpl()
            if (r2 == r3) goto Lf
            return r1
        Lf:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m358equalsimpl0(byte r0, byte r1) {
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
    private static final int m359floorDiv7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r0 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m360floorDivVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m361floorDivWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            int r0 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m362floorDivxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r1, r2)
            return r1
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getData$annotations() {
            return
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m363hashCodeimpl(byte r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m364incw2LRezQ(byte r0) {
            int r0 = r0 + 1
            byte r0 = (byte) r0
            byte r0 = m351constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m365invw2LRezQ(byte r0) {
            int r0 = ~r0
            byte r0 = (byte) r0
            byte r0 = m351constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m366minus7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r0 = r0 - r1
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m367minusVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r0 = r0 - r5
            long r4 = kotlin.ULong.m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m368minusWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            int r0 = r0 - r1
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m369minusxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = r1 - r2
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m370mod7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r0 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r0, r1)
            byte r0 = (byte) r0
            byte r0 = m351constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m371modVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m372modWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            int r0 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m373modxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r1, r2)
            short r1 = (short) r1
            short r1 = kotlin.UShort.m611constructorimpl(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m374or7apg3OU(byte r0, byte r1) {
            r0 = r0 | r1
            byte r0 = (byte) r0
            byte r0 = m351constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m375plus7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = r1 + r0
            int r0 = kotlin.UInt.m427constructorimpl(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m376plusVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r0 = r0 + r5
            long r4 = kotlin.ULong.m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m377plusWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            int r0 = r0 + r1
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m378plusxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r2 = r2 + r1
            int r1 = kotlin.UInt.m427constructorimpl(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final kotlin.ranges.UIntRange m379rangeTo7apg3OU(byte r2, byte r3) {
            kotlin.ranges.UIntRange r0 = new kotlin.ranges.UIntRange
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = kotlin.UInt.m427constructorimpl(r3)
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m380rem7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r0 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m381remVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m382remWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            int r0 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m383remxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m384times7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = r1 * r0
            int r0 = kotlin.UInt.m427constructorimpl(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m385timesVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r0 = r0 * r5
            long r4 = kotlin.ULong.m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m386timesWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            int r0 = r0 * r1
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m387timesxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r2 = r2 * r1
            int r1 = kotlin.UInt.m427constructorimpl(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m388toByteimpl(byte r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m389toDoubleimpl(byte r2) {
            r2 = r2 & 255(0xff, float:3.57E-43)
            double r0 = (double) r2
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m390toFloatimpl(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m391toIntimpl(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m392toLongimpl(byte r4) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m393toShortimpl(byte r0) {
            short r0 = (short) r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m394toStringimpl(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m395toUBytew2LRezQ(byte r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m396toUIntpVg5ArA(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m397toULongsVKNKU(byte r4) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m398toUShortMh2AYeg(byte r0) {
            short r0 = (short) r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            short r0 = kotlin.UShort.m611constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m399xor7apg3OU(byte r0, byte r1) {
            r0 = r0 ^ r1
            byte r0 = (byte) r0
            byte r0 = m351constructorimpl(r0)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.UByte r2) {
            r1 = this;
            kotlin.UByte r2 = (kotlin.UByte) r2
            byte r2 = r2.m400unboximpl()
            byte r0 = r1.m400unboximpl()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r0, r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            byte r0 = r1.data
            boolean r2 = m357equalsimpl(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            byte r0 = r1.data
            int r0 = m363hashCodeimpl(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            byte r0 = r1.data
            java.lang.String r0 = m394toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m400unboximpl() {
            r1 = this;
            byte r0 = r1.data
            return r0
    }
}
