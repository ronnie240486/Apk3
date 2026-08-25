package kotlin;

/* JADX INFO: compiled from: ULong.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.SinceKotlin(version = "1.5")
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 |2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001|B\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001dJ\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u001fJ\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010\u000bJ\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0016\u00102\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0005J\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001dJ\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u001fJ\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b7\u0010\u000bJ\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b8\u0010\"J\u001b\u00109\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001b\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010\u0013J\u001b\u00109\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010\u000bJ\u001b\u00109\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bA\u0010\u000bJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u001dJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bD\u0010\u001fJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bE\u0010\u000bJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010\"J\u001b\u0010G\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u001b\u0010K\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u001dJ\u001b\u0010K\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bM\u0010\u001fJ\u001b\u0010K\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u000bJ\u001b\u0010K\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bO\u0010\"J\u001e\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\rH\u0087\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010\u001fJ\u001e\u0010S\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\rH\u0087\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010\u001fJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bV\u0010\u001dJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bW\u0010\u001fJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bX\u0010\u000bJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bY\u0010\"J\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020_H\u0087\b¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\rH\u0087\b¢\u0006\u0004\bg\u0010/J\u0010\u0010h\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bi\u0010\u0005J\u0010\u0010j\u001a\u00020kH\u0087\b¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020oH\u0016¢\u0006\u0004\bp\u0010qJ\u0016\u0010r\u001a\u00020\u000eH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010]J\u0016\u0010t\u001a\u00020\u0011H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bu\u0010/J\u0016\u0010v\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bw\u0010\u0005J\u0016\u0010x\u001a\u00020\u0016H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\by\u0010mJ\u001b\u0010z\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b{\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006}"}, d2 = {"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "getData$annotations", "()V", "and", "other", "and-VKZWuLQ", "(JJ)J", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-s-VKNKU", "div", "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(J)I", "inc", "inc-s-VKNKU", "inv", "inv-s-VKNKU", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(JB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(JS)S", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(J)B", "toDouble", "", "toDouble-impl", "(J)D", "toFloat", "", "toFloat-impl", "(J)F", "toInt", "toInt-impl", "toLong", "toLong-impl", "toShort", "", "toShort-impl", "(J)S", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmInline
@kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
public final class ULong implements java.lang.Comparable<kotlin.ULong> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ULong.Companion Companion = null;
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    /* JADX INFO: compiled from: ULong.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/ULong$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/ULong;", "J", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
            kotlin.ULong$Companion r0 = new kotlin.ULong$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ULong.Companion = r0
            return
    }

    @kotlin.PublishedApi
    private /* synthetic */ ULong(long r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            return
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: and-VKZWuLQ, reason: not valid java name */
    private static final long m498andVKZWuLQ(long r0, long r2) {
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m499boximpl(long r1) {
            kotlin.ULong r0 = new kotlin.ULong
            r0.<init>(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m500compareTo7apg3OU(long r4, byte r6) {
            long r0 = (long) r6
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            int r4 = kotlin.UnsignedKt.ulongCompare(r4, r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private int m501compareToVKZWuLQ(long r3) {
            r2 = this;
            long r0 = r2.m556unboximpl()
            int r3 = kotlin.UnsignedKt.ulongCompare(r0, r3)
            return r3
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static int m502compareToVKZWuLQ(long r0, long r2) {
            int r0 = kotlin.UnsignedKt.ulongCompare(r0, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m503compareToWZ4Q5Ns(long r4, int r6) {
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            int r4 = kotlin.UnsignedKt.ulongCompare(r4, r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m504compareToxj2QHRw(long r4, short r6) {
            long r0 = (long) r6
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            int r4 = kotlin.UnsignedKt.ulongCompare(r4, r0)
            return r4
    }

    @kotlin.PublishedApi
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m505constructorimpl(long r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: dec-s-VKNKU, reason: not valid java name */
    private static final long m506decsVKNKU(long r2) {
            r0 = -1
            long r2 = r2 + r0
            long r2 = m505constructorimpl(r2)
            return r2
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final long m507div7apg3OU(long r4, byte r6) {
            long r0 = (long) r6
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r4, r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m508divVKZWuLQ(long r0, long r2) {
            long r0 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r0, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final long m509divWZ4Q5Ns(long r4, int r6) {
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r4, r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final long m510divxj2QHRw(long r4, short r6) {
            long r0 = (long) r6
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r4, r0)
            return r4
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m511equalsimpl(long r4, java.lang.Object r6) {
            boolean r0 = r6 instanceof kotlin.ULong
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.ULong r6 = (kotlin.ULong) r6
            long r2 = r6.m556unboximpl()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L11
            return r1
        L11:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m512equalsimpl0(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final long m513floorDiv7apg3OU(long r4, byte r6) {
            long r0 = (long) r6
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r4, r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m514floorDivVKZWuLQ(long r0, long r2) {
            long r0 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r0, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final long m515floorDivWZ4Q5Ns(long r4, int r6) {
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r4, r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final long m516floorDivxj2QHRw(long r4, short r6) {
            long r0 = (long) r6
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r4, r0)
            return r4
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getData$annotations() {
            return
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m517hashCodeimpl(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r3 = (int) r2
            return r3
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: inc-s-VKNKU, reason: not valid java name */
    private static final long m518incsVKNKU(long r2) {
            r0 = 1
            long r2 = r2 + r0
            long r2 = m505constructorimpl(r2)
            return r2
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: inv-s-VKNKU, reason: not valid java name */
    private static final long m519invsVKNKU(long r0) {
            long r0 = ~r0
            long r0 = m505constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final long m520minus7apg3OU(long r4, byte r6) {
            long r0 = (long) r6
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = r4 - r0
            long r4 = m505constructorimpl(r4)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m521minusVKZWuLQ(long r0, long r2) {
            long r0 = r0 - r2
            long r0 = m505constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final long m522minusWZ4Q5Ns(long r4, int r6) {
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = r4 - r0
            long r4 = m505constructorimpl(r4)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final long m523minusxj2QHRw(long r4, short r6) {
            long r0 = (long) r6
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = r4 - r0
            long r4 = m505constructorimpl(r4)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m524mod7apg3OU(long r4, byte r6) {
            long r0 = (long) r6
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r4, r0)
            int r5 = (int) r4
            byte r4 = (byte) r5
            byte r4 = kotlin.UByte.m351constructorimpl(r4)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m525modVKZWuLQ(long r0, long r2) {
            long r0 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r0, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m526modWZ4Q5Ns(long r4, int r6) {
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r4, r0)
            int r5 = (int) r4
            int r4 = kotlin.UInt.m427constructorimpl(r5)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m527modxj2QHRw(long r4, short r6) {
            long r0 = (long) r6
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r4, r0)
            int r5 = (int) r4
            short r4 = (short) r5
            short r4 = kotlin.UShort.m611constructorimpl(r4)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: or-VKZWuLQ, reason: not valid java name */
    private static final long m528orVKZWuLQ(long r0, long r2) {
            long r0 = r0 | r2
            long r0 = m505constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final long m529plus7apg3OU(long r4, byte r6) {
            long r0 = (long) r6
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r0 = r0 + r4
            long r4 = m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m530plusVKZWuLQ(long r0, long r2) {
            long r0 = r0 + r2
            long r0 = m505constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final long m531plusWZ4Q5Ns(long r4, int r6) {
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r0 = r0 + r4
            long r4 = m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final long m532plusxj2QHRw(long r4, short r6) {
            long r0 = (long) r6
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r0 = r0 + r4
            long r4 = m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rangeTo-VKZWuLQ, reason: not valid java name */
    private static final kotlin.ranges.ULongRange m533rangeToVKZWuLQ(long r7, long r9) {
            kotlin.ranges.ULongRange r6 = new kotlin.ranges.ULongRange
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r0.<init>(r1, r3, r5)
            return r6
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final long m534rem7apg3OU(long r4, byte r6) {
            long r0 = (long) r6
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r4, r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m535remVKZWuLQ(long r0, long r2) {
            long r0 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r0, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final long m536remWZ4Q5Ns(long r4, int r6) {
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r4, r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final long m537remxj2QHRw(long r4, short r6) {
            long r0 = (long) r6
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r4 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r4, r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: shl-s-VKNKU, reason: not valid java name */
    private static final long m538shlsVKNKU(long r0, int r2) {
            long r0 = r0 << r2
            long r0 = m505constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: shr-s-VKNKU, reason: not valid java name */
    private static final long m539shrsVKNKU(long r0, int r2) {
            long r0 = r0 >>> r2
            long r0 = m505constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final long m540times7apg3OU(long r4, byte r6) {
            long r0 = (long) r6
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r0 = r0 * r4
            long r4 = m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m541timesVKZWuLQ(long r0, long r2) {
            long r0 = r0 * r2
            long r0 = m505constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final long m542timesWZ4Q5Ns(long r4, int r6) {
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r0 = r0 * r4
            long r4 = m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final long m543timesxj2QHRw(long r4, short r6) {
            long r0 = (long) r6
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = m505constructorimpl(r0)
            long r0 = r0 * r4
            long r4 = m505constructorimpl(r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m544toByteimpl(long r0) {
            int r1 = (int) r0
            byte r0 = (byte) r1
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m545toDoubleimpl(long r0) {
            double r0 = kotlin.UnsignedKt.ulongToDouble(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m546toFloatimpl(long r0) {
            double r0 = kotlin.UnsignedKt.ulongToDouble(r0)
            float r0 = (float) r0
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m547toIntimpl(long r0) {
            int r1 = (int) r0
            return r1
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m548toLongimpl(long r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m549toShortimpl(long r0) {
            int r1 = (int) r0
            short r0 = (short) r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m550toStringimpl(long r0) {
            java.lang.String r0 = kotlin.UnsignedKt.ulongToString(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m551toUBytew2LRezQ(long r0) {
            int r1 = (int) r0
            byte r0 = (byte) r1
            byte r0 = kotlin.UByte.m351constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m552toUIntpVg5ArA(long r0) {
            int r1 = (int) r0
            int r0 = kotlin.UInt.m427constructorimpl(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m553toULongsVKNKU(long r0) {
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m554toUShortMh2AYeg(long r0) {
            int r1 = (int) r0
            short r0 = (short) r1
            short r0 = kotlin.UShort.m611constructorimpl(r0)
            return r0
    }

    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: xor-VKZWuLQ, reason: not valid java name */
    private static final long m555xorVKZWuLQ(long r0, long r2) {
            long r0 = r0 ^ r2
            long r0 = m505constructorimpl(r0)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.ULong r5) {
            r4 = this;
            kotlin.ULong r5 = (kotlin.ULong) r5
            long r0 = r5.m556unboximpl()
            long r2 = r4.m556unboximpl()
            int r5 = kotlin.UnsignedKt.ulongCompare(r2, r0)
            return r5
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.data
            boolean r3 = m511equalsimpl(r0, r3)
            return r3
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.data
            int r0 = m517hashCodeimpl(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.data
            java.lang.String r0 = m550toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m556unboximpl() {
            r2 = this;
            long r0 = r2.data
            return r0
    }
}
