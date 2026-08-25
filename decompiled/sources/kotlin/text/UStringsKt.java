package kotlin.text;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0014\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u0018\u001a\u00020\n*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u0018\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u001c\u001a\u00020\r*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u001c\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a\u0011\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUByteOrNull", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toUIntOrNull", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toULongOrNull", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUShortOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmName(name = "UStringsKt")
public final class UStringsKt {
    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: toString-JSWoG40, reason: not valid java name */
    public static final java.lang.String m1633toStringJSWoG40(long r0, int r2) {
            int r2 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r2)
            java.lang.String r0 = kotlin.UnsignedKt.ulongToString(r0, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final java.lang.String m1634toStringLxnNnR4(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r1)
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final java.lang.String m1635toStringV7xB4Y4(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r4 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r5)
            java.lang.String r4 = java.lang.Long.toString(r0, r4)
            java.lang.String r5 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: toString-olVBNx4, reason: not valid java name */
    public static final java.lang.String m1636toStringolVBNx4(short r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r2 = kotlin.text.CharsKt__CharJVMKt.checkRadix(r2)
            java.lang.String r1 = java.lang.Integer.toString(r1, r2)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    public static final byte toUByte(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UByte r0 = toUByteOrNull(r1)
            if (r0 == 0) goto L10
            byte r1 = r0.m400unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt__StringNumberConversionsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    public static final byte toUByte(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UByte r2 = toUByteOrNull(r1, r2)
            if (r2 == 0) goto L10
            byte r1 = r2.m400unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt__StringNumberConversionsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @org.jetbrains.annotations.Nullable
    public static final kotlin.UByte toUByteOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            kotlin.UByte r1 = toUByteOrNull(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @org.jetbrains.annotations.Nullable
    public static final kotlin.UByte toUByteOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UInt r1 = toUIntOrNull(r1, r2)
            r2 = 0
            if (r1 == 0) goto L27
            int r1 = r1.m478unboximpl()
            r0 = 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            int r0 = kotlin.UnsignedKt.uintCompare(r1, r0)
            if (r0 <= 0) goto L1d
            return r2
        L1d:
            byte r1 = (byte) r1
            byte r1 = kotlin.UByte.m351constructorimpl(r1)
            kotlin.UByte r1 = kotlin.UByte.m345boximpl(r1)
            return r1
        L27:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    public static final int toUInt(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UInt r0 = toUIntOrNull(r1)
            if (r0 == 0) goto L10
            int r1 = r0.m478unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt__StringNumberConversionsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    public static final int toUInt(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UInt r2 = toUIntOrNull(r1, r2)
            if (r2 == 0) goto L10
            int r1 = r2.m478unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt__StringNumberConversionsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @org.jetbrains.annotations.Nullable
    public static final kotlin.UInt toUIntOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            kotlin.UInt r1 = toUIntOrNull(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @org.jetbrains.annotations.Nullable
    public static final kotlin.UInt toUIntOrNull(@org.jetbrains.annotations.NotNull java.lang.String r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.text.CharsKt__CharJVMKt.checkRadix(r11)
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r2 = -1
            r3 = 0
            char r4 = r10.charAt(r3)
            r5 = 48
            int r5 = kotlin.jvm.internal.Intrinsics.compare(r4, r5)
            r6 = 1
            if (r5 >= 0) goto L26
            if (r0 == r6) goto L25
            r5 = 43
            if (r4 == r5) goto L27
        L25:
            return r1
        L26:
            r6 = 0
        L27:
            r4 = 119304647(0x71c71c7, float:1.1769572E-34)
            int r5 = kotlin.UInt.m427constructorimpl(r11)
            r7 = 119304647(0x71c71c7, float:1.1769572E-34)
        L31:
            if (r6 >= r0) goto L6b
            char r8 = r10.charAt(r6)
            int r8 = kotlin.text.CharsKt__CharJVMKt.digitOf(r8, r11)
            if (r8 >= 0) goto L3e
            return r1
        L3e:
            int r9 = kotlin.UnsignedKt.uintCompare(r3, r7)
            if (r9 <= 0) goto L51
            if (r7 != r4) goto L50
            int r7 = kotlin.UnsignedKt.m680uintDivideJ1ME1BU(r2, r5)
            int r9 = kotlin.UnsignedKt.uintCompare(r3, r7)
            if (r9 <= 0) goto L51
        L50:
            return r1
        L51:
            int r3 = r3 * r5
            int r3 = kotlin.UInt.m427constructorimpl(r3)
            int r8 = kotlin.UInt.m427constructorimpl(r8)
            int r8 = r8 + r3
            int r8 = kotlin.UInt.m427constructorimpl(r8)
            int r3 = kotlin.UnsignedKt.uintCompare(r8, r3)
            if (r3 >= 0) goto L67
            return r1
        L67:
            int r6 = r6 + 1
            r3 = r8
            goto L31
        L6b:
            kotlin.UInt r10 = kotlin.UInt.m421boximpl(r3)
            return r10
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    public static final long toULong(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.ULong r0 = toULongOrNull(r2)
            if (r0 == 0) goto L10
            long r0 = r0.m556unboximpl()
            return r0
        L10:
            kotlin.text.StringsKt__StringNumberConversionsKt.numberFormatError(r2)
            kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
            r2.<init>()
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    public static final long toULong(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.ULong r2 = toULongOrNull(r1, r2)
            if (r2 == 0) goto L10
            long r1 = r2.m556unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt__StringNumberConversionsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @org.jetbrains.annotations.Nullable
    public static final kotlin.ULong toULongOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            kotlin.ULong r1 = toULongOrNull(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @org.jetbrains.annotations.Nullable
    public static final kotlin.ULong toULongOrNull(@org.jetbrains.annotations.NotNull java.lang.String r19, int r20) {
            r0 = r19
            r1 = r20
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlin.text.CharsKt__CharJVMKt.checkRadix(r20)
            int r2 = r19.length()
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r4 = -1
            r6 = 0
            char r7 = r0.charAt(r6)
            r8 = 48
            int r8 = kotlin.jvm.internal.Intrinsics.compare(r7, r8)
            r9 = 1
            if (r8 >= 0) goto L2e
            if (r2 == r9) goto L2d
            r6 = 43
            if (r7 == r6) goto L2b
            goto L2d
        L2b:
            r6 = 1
            goto L2e
        L2d:
            return r3
        L2e:
            r7 = 512409557603043100(0x71c71c71c71c71c, double:2.0539100454284282E-274)
            long r9 = (long) r1
            long r9 = kotlin.ULong.m505constructorimpl(r9)
            r11 = 0
            r13 = r7
        L3b:
            if (r6 >= r2) goto L85
            char r15 = r0.charAt(r6)
            int r15 = kotlin.text.CharsKt__CharJVMKt.digitOf(r15, r1)
            if (r15 >= 0) goto L48
            return r3
        L48:
            int r16 = kotlin.UnsignedKt.ulongCompare(r11, r13)
            if (r16 <= 0) goto L5d
            int r16 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r16 != 0) goto L5c
            long r13 = kotlin.UnsignedKt.m682ulongDivideeb3DHEI(r4, r9)
            int r16 = kotlin.UnsignedKt.ulongCompare(r11, r13)
            if (r16 <= 0) goto L5d
        L5c:
            return r3
        L5d:
            long r11 = r11 * r9
            long r11 = kotlin.ULong.m505constructorimpl(r11)
            int r15 = kotlin.UInt.m427constructorimpl(r15)
            long r4 = (long) r15
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r17
            long r4 = kotlin.ULong.m505constructorimpl(r4)
            long r4 = r4 + r11
            long r4 = kotlin.ULong.m505constructorimpl(r4)
            int r11 = kotlin.UnsignedKt.ulongCompare(r4, r11)
            if (r11 >= 0) goto L7f
            return r3
        L7f:
            int r6 = r6 + 1
            r11 = r4
            r4 = -1
            goto L3b
        L85:
            kotlin.ULong r0 = kotlin.ULong.m499boximpl(r11)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    public static final short toUShort(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UShort r0 = toUShortOrNull(r1)
            if (r0 == 0) goto L10
            short r1 = r0.m660unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt__StringNumberConversionsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    public static final short toUShort(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UShort r2 = toUShortOrNull(r1, r2)
            if (r2 == 0) goto L10
            short r1 = r2.m660unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt__StringNumberConversionsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @org.jetbrains.annotations.Nullable
    public static final kotlin.UShort toUShortOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            kotlin.UShort r1 = toUShortOrNull(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @org.jetbrains.annotations.Nullable
    public static final kotlin.UShort toUShortOrNull(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UInt r1 = toUIntOrNull(r1, r2)
            r2 = 0
            if (r1 == 0) goto L28
            int r1 = r1.m478unboximpl()
            r0 = 65535(0xffff, float:9.1834E-41)
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            int r0 = kotlin.UnsignedKt.uintCompare(r1, r0)
            if (r0 <= 0) goto L1e
            return r2
        L1e:
            short r1 = (short) r1
            short r1 = kotlin.UShort.m611constructorimpl(r1)
            kotlin.UShort r1 = kotlin.UShort.m605boximpl(r1)
            return r1
        L28:
            return r2
    }
}
