package kotlin.collections.unsigned;

/* JADX INFO: compiled from: _UArraysJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020\u00032\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010\u001f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010\u001f\u001a\u00020\n*\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010\u001f\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u0018\u0010)\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u0018\u0010)\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u0018\u0010)\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u0018\u0010)\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a@\u00102\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a@\u00102\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a@\u00102\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a@\u00102\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a4\u0010?\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a4\u0010?\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a4\u0010?\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001a4\u0010?\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a\u0018\u0010K\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\bL\u0010+\u001a\u0018\u0010K\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010-\u001a\u0018\u0010K\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010/\u001a\u0018\u0010K\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bO\u00101\u001a@\u0010P\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u00108\u001a@\u0010P\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010:\u001a@\u0010P\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010<\u001a@\u0010P\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010>\u001a4\u0010U\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007ø\u0001\u0000¢\u0006\u0004\bV\u0010D\u001a4\u0010U\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007ø\u0001\u0000¢\u0006\u0004\bW\u0010F\u001a4\u0010U\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007ø\u0001\u0000¢\u0006\u0004\bX\u0010H\u001a4\u0010U\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007ø\u0001\u0000¢\u0006\u0004\bY\u0010J\u001a.\u0010Z\u001a\u00020[*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a.\u0010Z\u001a\u00020^*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a.\u0010Z\u001a\u00020[*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010a\u001a.\u0010Z\u001a\u00020^*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010b\u001a.\u0010Z\u001a\u00020[*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010c\u001a.\u0010Z\u001a\u00020^*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010d\u001a.\u0010Z\u001a\u00020[*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010e\u001a.\u0010Z\u001a\u00020^*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006g"}, d2 = {"asList", "", "Lkotlin/UByte;", "Lkotlin/UByteArray;", "asList-GBYM_sE", "([B)Ljava/util/List;", "Lkotlin/UInt;", "Lkotlin/UIntArray;", "asList--ajY-9A", "([I)Ljava/util/List;", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "asList-QwZRm1k", "([J)Ljava/util/List;", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "asList-rL5Bavg", "([S)Ljava/util/List;", "binarySearch", "", "element", "fromIndex", "toIndex", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-EtDCXyQ", "([SSII)I", "elementAt", "index", "elementAt-PpDY95g", "([BI)B", "elementAt-qFRl0hI", "([II)I", "elementAt-r7IrZao", "([JI)J", "elementAt-nggk6HY", "([SI)S", "max", "max-GBYM_sE", "([B)Lkotlin/UByte;", "max--ajY-9A", "([I)Lkotlin/UInt;", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min", "min-GBYM_sE", "min--ajY-9A", "min-QwZRm1k", "min-rL5Bavg", "minBy", "minBy-JOV_ifY", "minBy-jgv0xPQ", "minBy-MShoTSo", "minBy-xTcfx_M", "minWith", "minWith-XMRcp5o", "minWith-YmdZ_VM", "minWith-zrEWJaI", "minWith-eOHTfZs", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, pn = "kotlin.collections", xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
class UArraysKt___UArraysJvmKt {
    public UArraysKt___UArraysJvmKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: asList--ajY-9A, reason: not valid java name */
    public static final java.util.List<kotlin.UInt> m796asListajY9A(@org.jetbrains.annotations.NotNull int[] r1) {
            java.lang.String r0 = "$this$asList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$1 r0 = new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$1
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final java.util.List<kotlin.UByte> m797asListGBYM_sE(@org.jetbrains.annotations.NotNull byte[] r1) {
            java.lang.String r0 = "$this$asList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$3 r0 = new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$3
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final java.util.List<kotlin.ULong> m798asListQwZRm1k(@org.jetbrains.annotations.NotNull long[] r1) {
            java.lang.String r0 = "$this$asList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$2 r0 = new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$2
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final java.util.List<kotlin.UShort> m799asListrL5Bavg(@org.jetbrains.annotations.NotNull short[] r1) {
            java.lang.String r0 = "$this$asList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$4 r0 = new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$4
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m800binarySearch2fe2U9s(@org.jetbrains.annotations.NotNull int[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "$this$binarySearch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = kotlin.UIntArray.m487getSizeimpl(r2)
            r0.checkRangeIndexes$kotlin_stdlib(r4, r5, r1)
            int r5 = r5 + (-1)
        L10:
            if (r4 > r5) goto L27
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            r1 = r2[r0]
            int r1 = kotlin.UnsignedKt.uintCompare(r1, r3)
            if (r1 >= 0) goto L21
            int r4 = r0 + 1
            goto L10
        L21:
            if (r1 <= 0) goto L26
            int r5 = r0 + (-1)
            goto L10
        L26:
            return r0
        L27:
            int r4 = r4 + 1
            int r2 = -r4
            return r2
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m801binarySearch2fe2U9s$default(int[] r0, int r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = kotlin.UIntArray.m487getSizeimpl(r0)
        Ld:
            int r0 = m800binarySearch2fe2U9s(r0, r1, r2, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m802binarySearchEtDCXyQ(@org.jetbrains.annotations.NotNull short[] r2, short r3, int r4, int r5) {
            java.lang.String r0 = "$this$binarySearch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = kotlin.UShortArray.m669getSizeimpl(r2)
            r0.checkRangeIndexes$kotlin_stdlib(r4, r5, r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            int r5 = r5 + (-1)
        L14:
            if (r4 > r5) goto L2b
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            short r1 = r2[r0]
            int r1 = kotlin.UnsignedKt.uintCompare(r1, r3)
            if (r1 >= 0) goto L25
            int r4 = r0 + 1
            goto L14
        L25:
            if (r1 <= 0) goto L2a
            int r5 = r0 + (-1)
            goto L14
        L2a:
            return r0
        L2b:
            int r4 = r4 + 1
            int r2 = -r4
            return r2
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m803binarySearchEtDCXyQ$default(short[] r0, short r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = kotlin.UShortArray.m669getSizeimpl(r0)
        Ld:
            int r0 = m802binarySearchEtDCXyQ(r0, r1, r2, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m804binarySearchK6DWlUc(@org.jetbrains.annotations.NotNull long[] r3, long r4, int r6, int r7) {
            java.lang.String r0 = "$this$binarySearch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = kotlin.ULongArray.m565getSizeimpl(r3)
            r0.checkRangeIndexes$kotlin_stdlib(r6, r7, r1)
            int r7 = r7 + (-1)
        L10:
            if (r6 > r7) goto L27
            int r0 = r6 + r7
            int r0 = r0 >>> 1
            r1 = r3[r0]
            int r1 = kotlin.UnsignedKt.ulongCompare(r1, r4)
            if (r1 >= 0) goto L21
            int r6 = r0 + 1
            goto L10
        L21:
            if (r1 <= 0) goto L26
            int r7 = r0 + (-1)
            goto L10
        L26:
            return r0
        L27:
            int r6 = r6 + 1
            int r3 = -r6
            return r3
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m805binarySearchK6DWlUc$default(long[] r0, long r1, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto Ld
            int r4 = kotlin.ULongArray.m565getSizeimpl(r0)
        Ld:
            int r0 = m804binarySearchK6DWlUc(r0, r1, r3, r4)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m806binarySearchWpHrYlw(@org.jetbrains.annotations.NotNull byte[] r2, byte r3, int r4, int r5) {
            java.lang.String r0 = "$this$binarySearch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = kotlin.UByteArray.m409getSizeimpl(r2)
            r0.checkRangeIndexes$kotlin_stdlib(r4, r5, r1)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r5 + (-1)
        L12:
            if (r4 > r5) goto L29
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            r1 = r2[r0]
            int r1 = kotlin.UnsignedKt.uintCompare(r1, r3)
            if (r1 >= 0) goto L23
            int r4 = r0 + 1
            goto L12
        L23:
            if (r1 <= 0) goto L28
            int r5 = r0 + (-1)
            goto L12
        L28:
            return r0
        L29:
            int r4 = r4 + 1
            int r2 = -r4
            return r2
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m807binarySearchWpHrYlw$default(byte[] r0, byte r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = kotlin.UByteArray.m409getSizeimpl(r0)
        Ld:
            int r0 = m806binarySearchWpHrYlw(r0, r1, r2, r3)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m808elementAtPpDY95g(byte[] r1, int r2) {
            java.lang.String r0 = "$this$elementAt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte r1 = kotlin.UByteArray.m408getw2LRezQ(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m809elementAtnggk6HY(short[] r1, int r2) {
            java.lang.String r0 = "$this$elementAt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            short r1 = kotlin.UShortArray.m668getMh2AYeg(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m810elementAtqFRl0hI(int[] r1, int r2) {
            java.lang.String r0 = "$this$elementAt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = kotlin.UIntArray.m486getpVg5ArA(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m811elementAtr7IrZao(long[] r1, int r2) {
            java.lang.String r0 = "$this$elementAt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            long r1 = kotlin.ULongArray.m564getsVKNKU(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m812maxajY9A(int[] r1) {
            java.lang.String r0 = "$this$max"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UInt r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1188maxOrNullajY9A(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m813maxGBYM_sE(byte[] r1) {
            java.lang.String r0 = "$this$max"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UByte r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1189maxOrNullGBYM_sE(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m814maxQwZRm1k(long[] r1) {
            java.lang.String r0 = "$this$max"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.ULong r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1190maxOrNullQwZRm1k(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m815maxrL5Bavg(short[] r1) {
            java.lang.String r0 = "$this$max"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UShort r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1191maxOrNullrL5Bavg(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UByte m816maxByJOV_ifY(byte[] r6, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends R> r7) {
            java.lang.String r0 = "$this$maxBy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.UByteArray.m411isEmptyimpl(r6)
            if (r0 == 0) goto L13
            r6 = 0
            goto L53
        L13:
            r0 = 0
            byte r0 = kotlin.UByteArray.m408getw2LRezQ(r6, r0)
            int r1 = kotlin.collections.ArraysKt.getLastIndex(r6)
            if (r1 != 0) goto L1f
            goto L4f
        L1f:
            kotlin.UByte r2 = kotlin.UByte.m345boximpl(r0)
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            kotlin.collections.IntIterator r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1)
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4f
            int r3 = r1.nextInt()
            byte r3 = kotlin.UByteArray.m408getw2LRezQ(r6, r3)
            kotlin.UByte r4 = kotlin.UByte.m345boximpl(r3)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r2.compareTo(r4)
            if (r5 >= 0) goto L2e
            r0 = r3
            r2 = r4
            goto L2e
        L4f:
            kotlin.UByte r6 = kotlin.UByte.m345boximpl(r0)
        L53:
            return r6
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.ULong m817maxByMShoTSo(long[] r8, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends R> r9) {
            java.lang.String r0 = "$this$maxBy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = kotlin.ULongArray.m567isEmptyimpl(r8)
            if (r0 == 0) goto L13
            r8 = 0
            goto L53
        L13:
            r0 = 0
            long r0 = kotlin.ULongArray.m564getsVKNKU(r8, r0)
            int r2 = kotlin.collections.ArraysKt.getLastIndex(r8)
            if (r2 != 0) goto L1f
            goto L4f
        L1f:
            kotlin.ULong r3 = kotlin.ULong.m499boximpl(r0)
            java.lang.Object r3 = r9.invoke(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = 1
            kotlin.collections.IntIterator r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2)
        L2e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L4f
            int r4 = r2.nextInt()
            long r4 = kotlin.ULongArray.m564getsVKNKU(r8, r4)
            kotlin.ULong r6 = kotlin.ULong.m499boximpl(r4)
            java.lang.Object r6 = r9.invoke(r6)
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            int r7 = r3.compareTo(r6)
            if (r7 >= 0) goto L2e
            r0 = r4
            r3 = r6
            goto L2e
        L4f:
            kotlin.ULong r8 = kotlin.ULong.m499boximpl(r0)
        L53:
            return r8
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UInt m818maxByjgv0xPQ(int[] r6, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends R> r7) {
            java.lang.String r0 = "$this$maxBy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.UIntArray.m489isEmptyimpl(r6)
            if (r0 == 0) goto L13
            r6 = 0
            goto L53
        L13:
            r0 = 0
            int r0 = kotlin.UIntArray.m486getpVg5ArA(r6, r0)
            int r1 = kotlin.collections.ArraysKt.getLastIndex(r6)
            if (r1 != 0) goto L1f
            goto L4f
        L1f:
            kotlin.UInt r2 = kotlin.UInt.m421boximpl(r0)
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            kotlin.collections.IntIterator r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1)
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4f
            int r3 = r1.nextInt()
            int r3 = kotlin.UIntArray.m486getpVg5ArA(r6, r3)
            kotlin.UInt r4 = kotlin.UInt.m421boximpl(r3)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r2.compareTo(r4)
            if (r5 >= 0) goto L2e
            r0 = r3
            r2 = r4
            goto L2e
        L4f:
            kotlin.UInt r6 = kotlin.UInt.m421boximpl(r0)
        L53:
            return r6
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UShort m819maxByxTcfx_M(short[] r6, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends R> r7) {
            java.lang.String r0 = "$this$maxBy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.UShortArray.m671isEmptyimpl(r6)
            if (r0 == 0) goto L13
            r6 = 0
            goto L53
        L13:
            r0 = 0
            short r0 = kotlin.UShortArray.m668getMh2AYeg(r6, r0)
            int r1 = kotlin.collections.ArraysKt.getLastIndex(r6)
            if (r1 != 0) goto L1f
            goto L4f
        L1f:
            kotlin.UShort r2 = kotlin.UShort.m605boximpl(r0)
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            kotlin.collections.IntIterator r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1)
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4f
            int r3 = r1.nextInt()
            short r3 = kotlin.UShortArray.m668getMh2AYeg(r6, r3)
            kotlin.UShort r4 = kotlin.UShort.m605boximpl(r3)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r2.compareTo(r4)
            if (r5 >= 0) goto L2e
            r0 = r3
            r2 = r4
            goto L2e
        L4f:
            kotlin.UShort r6 = kotlin.UShort.m605boximpl(r0)
        L53:
            return r6
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m820maxWithXMRcp5o(byte[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$this$maxWith"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.UByte r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1196maxWithOrNullXMRcp5o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m821maxWithYmdZ_VM(int[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$this$maxWith"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.UInt r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1197maxWithOrNullYmdZ_VM(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m822maxWitheOHTfZs(short[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$this$maxWith"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.UShort r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1198maxWithOrNulleOHTfZs(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m823maxWithzrEWJaI(long[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$this$maxWith"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.ULong r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1199maxWithOrNullzrEWJaI(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m824minajY9A(int[] r1) {
            java.lang.String r0 = "$this$min"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UInt r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1244minOrNullajY9A(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m825minGBYM_sE(byte[] r1) {
            java.lang.String r0 = "$this$min"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UByte r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1245minOrNullGBYM_sE(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m826minQwZRm1k(long[] r1) {
            java.lang.String r0 = "$this$min"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.ULong r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1246minOrNullQwZRm1k(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m827minrL5Bavg(short[] r1) {
            java.lang.String r0 = "$this$min"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UShort r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1247minOrNullrL5Bavg(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UByte m828minByJOV_ifY(byte[] r6, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends R> r7) {
            java.lang.String r0 = "$this$minBy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.UByteArray.m411isEmptyimpl(r6)
            if (r0 == 0) goto L13
            r6 = 0
            goto L53
        L13:
            r0 = 0
            byte r0 = kotlin.UByteArray.m408getw2LRezQ(r6, r0)
            int r1 = kotlin.collections.ArraysKt.getLastIndex(r6)
            if (r1 != 0) goto L1f
            goto L4f
        L1f:
            kotlin.UByte r2 = kotlin.UByte.m345boximpl(r0)
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            kotlin.collections.IntIterator r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1)
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4f
            int r3 = r1.nextInt()
            byte r3 = kotlin.UByteArray.m408getw2LRezQ(r6, r3)
            kotlin.UByte r4 = kotlin.UByte.m345boximpl(r3)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r2.compareTo(r4)
            if (r5 <= 0) goto L2e
            r0 = r3
            r2 = r4
            goto L2e
        L4f:
            kotlin.UByte r6 = kotlin.UByte.m345boximpl(r0)
        L53:
            return r6
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.ULong m829minByMShoTSo(long[] r8, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends R> r9) {
            java.lang.String r0 = "$this$minBy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = kotlin.ULongArray.m567isEmptyimpl(r8)
            if (r0 == 0) goto L13
            r8 = 0
            goto L53
        L13:
            r0 = 0
            long r0 = kotlin.ULongArray.m564getsVKNKU(r8, r0)
            int r2 = kotlin.collections.ArraysKt.getLastIndex(r8)
            if (r2 != 0) goto L1f
            goto L4f
        L1f:
            kotlin.ULong r3 = kotlin.ULong.m499boximpl(r0)
            java.lang.Object r3 = r9.invoke(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = 1
            kotlin.collections.IntIterator r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2)
        L2e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L4f
            int r4 = r2.nextInt()
            long r4 = kotlin.ULongArray.m564getsVKNKU(r8, r4)
            kotlin.ULong r6 = kotlin.ULong.m499boximpl(r4)
            java.lang.Object r6 = r9.invoke(r6)
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            int r7 = r3.compareTo(r6)
            if (r7 <= 0) goto L2e
            r0 = r4
            r3 = r6
            goto L2e
        L4f:
            kotlin.ULong r8 = kotlin.ULong.m499boximpl(r0)
        L53:
            return r8
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UInt m830minByjgv0xPQ(int[] r6, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends R> r7) {
            java.lang.String r0 = "$this$minBy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.UIntArray.m489isEmptyimpl(r6)
            if (r0 == 0) goto L13
            r6 = 0
            goto L53
        L13:
            r0 = 0
            int r0 = kotlin.UIntArray.m486getpVg5ArA(r6, r0)
            int r1 = kotlin.collections.ArraysKt.getLastIndex(r6)
            if (r1 != 0) goto L1f
            goto L4f
        L1f:
            kotlin.UInt r2 = kotlin.UInt.m421boximpl(r0)
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            kotlin.collections.IntIterator r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1)
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4f
            int r3 = r1.nextInt()
            int r3 = kotlin.UIntArray.m486getpVg5ArA(r6, r3)
            kotlin.UInt r4 = kotlin.UInt.m421boximpl(r3)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r2.compareTo(r4)
            if (r5 <= 0) goto L2e
            r0 = r3
            r2 = r4
            goto L2e
        L4f:
            kotlin.UInt r6 = kotlin.UInt.m421boximpl(r0)
        L53:
            return r6
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UShort m831minByxTcfx_M(short[] r6, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends R> r7) {
            java.lang.String r0 = "$this$minBy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.UShortArray.m671isEmptyimpl(r6)
            if (r0 == 0) goto L13
            r6 = 0
            goto L53
        L13:
            r0 = 0
            short r0 = kotlin.UShortArray.m668getMh2AYeg(r6, r0)
            int r1 = kotlin.collections.ArraysKt.getLastIndex(r6)
            if (r1 != 0) goto L1f
            goto L4f
        L1f:
            kotlin.UShort r2 = kotlin.UShort.m605boximpl(r0)
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = 1
            kotlin.collections.IntIterator r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1)
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4f
            int r3 = r1.nextInt()
            short r3 = kotlin.UShortArray.m668getMh2AYeg(r6, r3)
            kotlin.UShort r4 = kotlin.UShort.m605boximpl(r3)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r2.compareTo(r4)
            if (r5 <= 0) goto L2e
            r0 = r3
            r2 = r4
            goto L2e
        L4f:
            kotlin.UShort r6 = kotlin.UShort.m605boximpl(r0)
        L53:
            return r6
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m832minWithXMRcp5o(byte[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$this$minWith"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.UByte r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1252minWithOrNullXMRcp5o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m833minWithYmdZ_VM(int[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$this$minWith"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.UInt r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1253minWithOrNullYmdZ_VM(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m834minWitheOHTfZs(short[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$this$minWith"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.UShort r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1254minWithOrNulleOHTfZs(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m835minWithzrEWJaI(long[] r1, java.util.Comparator r2) {
            java.lang.String r0 = "$this$minWith"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.ULong r1 = kotlin.collections.unsigned.UArraysKt___UArraysKt.m1255minWithOrNullzrEWJaI(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal sumOfBigDecimal(byte[] r4, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "$this$sumOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = kotlin.UByteArray.m409getSizeimpl(r4)
            r2 = 0
        L1c:
            if (r2 >= r1) goto L31
            java.lang.Object r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2, r5)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "this.add(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r2 = r2 + 1
            goto L1c
        L31:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal sumOfBigDecimal(int[] r4, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "$this$sumOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = kotlin.UIntArray.m487getSizeimpl(r4)
            r2 = 0
        L1c:
            if (r2 >= r1) goto L31
            java.lang.Object r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2, r5)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "this.add(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r2 = r2 + 1
            goto L1c
        L31:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal sumOfBigDecimal(long[] r4, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "$this$sumOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = kotlin.ULongArray.m565getSizeimpl(r4)
            r2 = 0
        L1c:
            if (r2 >= r1) goto L31
            java.lang.Object r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2, r5)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "this.add(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r2 = r2 + 1
            goto L1c
        L31:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigDecimal")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigDecimal sumOfBigDecimal(short[] r4, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends java.math.BigDecimal> r5) {
            java.lang.String r0 = "$this$sumOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = kotlin.UShortArray.m669getSizeimpl(r4)
            r2 = 0
        L1c:
            if (r2 >= r1) goto L31
            java.lang.Object r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2, r5)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r0 = r0.add(r3)
            java.lang.String r3 = "this.add(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r2 = r2 + 1
            goto L1c
        L31:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger sumOfBigInteger(byte[] r4, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "$this$sumOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = kotlin.UByteArray.m409getSizeimpl(r4)
            r2 = 0
        L1c:
            if (r2 >= r1) goto L31
            java.lang.Object r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2, r5)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "this.add(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r2 = r2 + 1
            goto L1c
        L31:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger sumOfBigInteger(int[] r4, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "$this$sumOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = kotlin.UIntArray.m487getSizeimpl(r4)
            r2 = 0
        L1c:
            if (r2 >= r1) goto L31
            java.lang.Object r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2, r5)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "this.add(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r2 = r2 + 1
            goto L1c
        L31:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger sumOfBigInteger(long[] r4, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "$this$sumOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = kotlin.ULongArray.m565getSizeimpl(r4)
            r2 = 0
        L1c:
            if (r2 >= r1) goto L31
            java.lang.Object r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2, r5)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "this.add(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r2 = r2 + 1
            goto L1c
        L31:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    @kotlin.internal.InlineOnly
    @kotlin.jvm.JvmName(name = "sumOfBigInteger")
    @kotlin.OverloadResolutionByLambdaReturnType
    private static final java.math.BigInteger sumOfBigInteger(short[] r4, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends java.math.BigInteger> r5) {
            java.lang.String r0 = "$this$sumOf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(this.toLong())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = kotlin.UShortArray.m669getSizeimpl(r4)
            r2 = 0
        L1c:
            if (r2 >= r1) goto L31
            java.lang.Object r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2, r5)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r0 = r0.add(r3)
            java.lang.String r3 = "this.add(other)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r2 = r2 + 1
            goto L1c
        L31:
            return r0
    }
}
