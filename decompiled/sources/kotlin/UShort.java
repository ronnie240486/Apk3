package kotlin;

/* JADX INFO: compiled from: UShort.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.5")
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001tB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\u001b\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u0010J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0013J\u001b\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u0010J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0013J\u001b\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u0013J\u001b\u00107\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010\u001fJ\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u0010J\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0013J\u001b\u0010?\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010\u0010J\u001b\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bJ\u0010\u0013J\u001b\u0010H\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u001fJ\u001b\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0018J\u001b\u0010M\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u0010J\u001b\u0010M\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bO\u0010\u0013J\u001b\u0010M\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u001fJ\u001b\u0010M\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0018J\u0010\u0010R\u001a\u00020SH\u0087\b¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\rH\u0087\b¢\u0006\u0004\b_\u0010-J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\be\u0010\u0005J\u000f\u0010f\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u0016\u0010j\u001a\u00020\u000eH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010UJ\u0016\u0010l\u001a\u00020\u0011H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010-J\u0016\u0010n\u001a\u00020\u0014H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010cJ\u0016\u0010p\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010\u0005J\u001b\u0010r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bs\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006u"}, d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "getData$annotations", "()V", "and", "other", "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-Mh2AYeg", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(S)I", "inc", "inc-Mh2AYeg", "inv", "inv-Mh2AYeg", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(SB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toDouble", "", "toDouble-impl", "(S)D", "toFloat", "", "toFloat-impl", "(S)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmInline
@kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
public final class UShort implements java.lang.Comparable<kotlin.UShort> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.UShort.Companion Companion = null;
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    /* JADX INFO: compiled from: UShort.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UShort$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UShort;", "S", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
            kotlin.UShort$Companion r0 = new kotlin.UShort$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.UShort.Companion = r0
            return
    }

    @kotlin.PublishedApi
    private /* synthetic */ UShort(short r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            return
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: and-xj2QHRw, reason: not valid java name */
    private static final short m604andxj2QHRw(short r0, short r1) {
            r0 = r0 & r1
            short r0 = (short) r0
            short r0 = m611constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m605boximpl(short r1) {
            kotlin.UShort r0 = new kotlin.UShort
            r0.<init>(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m606compareTo7apg3OU(short r1, byte r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m607compareToVKZWuLQ(short r4, long r5) {
            long r0 = (long) r4
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            int r4 = kotlin.UnsignedKt.ulongCompare(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m608compareToWZ4Q5Ns(short r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = kotlin.UnsignedKt.uintCompare(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private int m609compareToxj2QHRw(short r3) {
            r2 = this;
            short r0 = r2.m660unboximpl()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r3 = r3 & r1
            int r3 = kotlin.jvm.internal.Intrinsics.compare(r0, r3)
            return r3
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static int m610compareToxj2QHRw(short r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r2 = r2 & r0
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r2)
            return r1
    }

    @kotlin.PublishedApi
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m611constructorimpl(short r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: dec-Mh2AYeg, reason: not valid java name */
    private static final short m612decMh2AYeg(short r0) {
            int r0 = r0 + (-1)
            short r0 = (short) r0
            short r0 = m611constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m613div7apg3OU(short r1, byte r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m614divVKZWuLQ(short r4, long r5) {
            long r0 = (long) r4
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m615divWZ4Q5Ns(short r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m616divxj2QHRw(short r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m617equalsimpl(short r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlin.UShort
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.UShort r3 = (kotlin.UShort) r3
            short r3 = r3.m660unboximpl()
            if (r2 == r3) goto Lf
            return r1
        Lf:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m618equalsimpl0(short r0, short r1) {
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
    private static final int m619floorDiv7apg3OU(short r1, byte r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m620floorDivVKZWuLQ(short r4, long r5) {
            long r0 = (long) r4
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m621floorDivWZ4Q5Ns(short r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m622floorDivxj2QHRw(short r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
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
    public static int m623hashCodeimpl(short r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: inc-Mh2AYeg, reason: not valid java name */
    private static final short m624incMh2AYeg(short r0) {
            int r0 = r0 + 1
            short r0 = (short) r0
            short r0 = m611constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: inv-Mh2AYeg, reason: not valid java name */
    private static final short m625invMh2AYeg(short r0) {
            int r0 = ~r0
            short r0 = (short) r0
            short r0 = m611constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m626minus7apg3OU(short r1, byte r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = r1 - r2
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m627minusVKZWuLQ(short r4, long r5) {
            long r0 = (long) r4
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r0 = r0 - r5
            long r4 = kotlin.ULong.m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m628minusWZ4Q5Ns(short r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = r1 - r2
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m629minusxj2QHRw(short r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = r1 - r2
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m630mod7apg3OU(short r1, byte r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r1, r2)
            byte r1 = (byte) r1
            byte r1 = kotlin.UByte.m351constructorimpl(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m631modVKZWuLQ(short r4, long r5) {
            long r0 = (long) r4
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m632modWZ4Q5Ns(short r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m633modxj2QHRw(short r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r1, r2)
            short r1 = (short) r1
            short r1 = m611constructorimpl(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: or-xj2QHRw, reason: not valid java name */
    private static final short m634orxj2QHRw(short r0, short r1) {
            r0 = r0 | r1
            short r0 = (short) r0
            short r0 = m611constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m635plus7apg3OU(short r1, byte r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r2 = r2 + r1
            int r1 = kotlin.UInt.m427constructorimpl(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m636plusVKZWuLQ(short r4, long r5) {
            long r0 = (long) r4
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r0 = r0 + r5
            long r4 = kotlin.ULong.m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m637plusWZ4Q5Ns(short r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = r1 + r2
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m638plusxj2QHRw(short r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r2 = r2 + r1
            int r1 = kotlin.UInt.m427constructorimpl(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rangeTo-xj2QHRw, reason: not valid java name */
    private static final kotlin.ranges.UIntRange m639rangeToxj2QHRw(short r2, short r3) {
            kotlin.ranges.UIntRange r0 = new kotlin.ranges.UIntRange
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            r3 = r3 & r1
            int r3 = kotlin.UInt.m427constructorimpl(r3)
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m640rem7apg3OU(short r1, byte r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m641remVKZWuLQ(short r4, long r5) {
            long r0 = (long) r4
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r0, r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m642remWZ4Q5Ns(short r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m643remxj2QHRw(short r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r1 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m644times7apg3OU(short r1, byte r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r2 = r2 * r1
            int r1 = kotlin.UInt.m427constructorimpl(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m645timesVKZWuLQ(short r4, long r5) {
            long r0 = (long) r4
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            long r0 = r0 * r5
            long r4 = kotlin.ULong.m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m646timesWZ4Q5Ns(short r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = r1 * r2
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m647timesxj2QHRw(short r1, short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            int r2 = r2 * r1
            int r1 = kotlin.UInt.m427constructorimpl(r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m648toByteimpl(short r0) {
            byte r0 = (byte) r0
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m649toDoubleimpl(short r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            double r0 = (double) r2
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m650toFloatimpl(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            float r1 = (float) r1
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m651toIntimpl(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m652toLongimpl(short r4) {
            long r0 = (long) r4
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m653toShortimpl(short r0) {
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m654toStringimpl(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m655toUBytew2LRezQ(short r0) {
            byte r0 = (byte) r0
            byte r0 = kotlin.UByte.m351constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m656toUIntpVg5ArA(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m657toULongsVKNKU(short r4) {
            long r0 = (long) r4
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m658toUShortMh2AYeg(short r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: xor-xj2QHRw, reason: not valid java name */
    private static final short m659xorxj2QHRw(short r0, short r1) {
            r0 = r0 ^ r1
            short r0 = (short) r0
            short r0 = m611constructorimpl(r0)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.UShort r3) {
            r2 = this;
            kotlin.UShort r3 = (kotlin.UShort) r3
            short r3 = r3.m660unboximpl()
            short r0 = r2.m660unboximpl()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r3 = r3 & r1
            int r3 = kotlin.jvm.internal.Intrinsics.compare(r0, r3)
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            short r0 = r1.data
            boolean r2 = m617equalsimpl(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            short r0 = r1.data
            int r0 = m623hashCodeimpl(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            short r0 = r1.data
            java.lang.String r0 = m654toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m660unboximpl() {
            r1 = this;
            short r0 = r1.data
            return r0
    }
}
