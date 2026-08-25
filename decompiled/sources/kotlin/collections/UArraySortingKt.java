package kotlin.collections;

/* JADX INFO: compiled from: UArraySorting.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class UArraySortingKt {
    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m784partitionnroSd4(long[] r6, int r7, int r8) {
            int r0 = r7 + r8
            int r0 = r0 / 2
            long r0 = kotlin.ULongArray.m564getsVKNKU(r6, r0)
        L8:
            if (r7 > r8) goto L39
        La:
            long r2 = kotlin.ULongArray.m564getsVKNKU(r6, r7)
            int r2 = kotlin.UnsignedKt.ulongCompare(r2, r0)
            if (r2 >= 0) goto L17
            int r7 = r7 + 1
            goto La
        L17:
            long r2 = kotlin.ULongArray.m564getsVKNKU(r6, r8)
            int r2 = kotlin.UnsignedKt.ulongCompare(r2, r0)
            if (r2 <= 0) goto L24
            int r8 = r8 + (-1)
            goto L17
        L24:
            if (r7 > r8) goto L8
            long r2 = kotlin.ULongArray.m564getsVKNKU(r6, r7)
            long r4 = kotlin.ULongArray.m564getsVKNKU(r6, r8)
            kotlin.ULongArray.m569setk8EXiF4(r6, r7, r4)
            kotlin.ULongArray.m569setk8EXiF4(r6, r8, r2)
            int r7 = r7 + 1
            int r8 = r8 + (-1)
            goto L8
        L39:
            return r7
    }

    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m785partition4UcCI2c(byte[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r0 = r0 / 2
            byte r0 = kotlin.UByteArray.m408getw2LRezQ(r3, r0)
        L8:
            if (r4 > r5) goto L3f
        La:
            byte r1 = kotlin.UByteArray.m408getw2LRezQ(r3, r4)
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r2)
            if (r1 >= 0) goto L1b
            int r4 = r4 + 1
            goto La
        L1b:
            byte r1 = kotlin.UByteArray.m408getw2LRezQ(r3, r5)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r2)
            if (r1 <= 0) goto L2a
            int r5 = r5 + (-1)
            goto L1b
        L2a:
            if (r4 > r5) goto L8
            byte r1 = kotlin.UByteArray.m408getw2LRezQ(r3, r4)
            byte r2 = kotlin.UByteArray.m408getw2LRezQ(r3, r5)
            kotlin.UByteArray.m413setVurrAj0(r3, r4, r2)
            kotlin.UByteArray.m413setVurrAj0(r3, r5, r1)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L8
        L3f:
            return r4
    }

    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m786partitionAa5vz7o(short[] r4, int r5, int r6) {
            int r0 = r5 + r6
            int r0 = r0 / 2
            short r0 = kotlin.UShortArray.m668getMh2AYeg(r4, r0)
        L8:
            if (r5 > r6) goto L40
        La:
            short r1 = kotlin.UShortArray.m668getMh2AYeg(r4, r5)
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            r3 = r0 & r2
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r3)
            if (r1 >= 0) goto L1d
            int r5 = r5 + 1
            goto La
        L1d:
            short r1 = kotlin.UShortArray.m668getMh2AYeg(r4, r6)
            r1 = r1 & r2
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r3)
            if (r1 <= 0) goto L2b
            int r6 = r6 + (-1)
            goto L1d
        L2b:
            if (r5 > r6) goto L8
            short r1 = kotlin.UShortArray.m668getMh2AYeg(r4, r5)
            short r2 = kotlin.UShortArray.m668getMh2AYeg(r4, r6)
            kotlin.UShortArray.m673set01HTLdE(r4, r5, r2)
            kotlin.UShortArray.m673set01HTLdE(r4, r6, r1)
            int r5 = r5 + 1
            int r6 = r6 + (-1)
            goto L8
        L40:
            return r5
    }

    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m787partitionoBK06Vg(int[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r0 = r0 / 2
            int r0 = kotlin.UIntArray.m486getpVg5ArA(r3, r0)
        L8:
            if (r4 > r5) goto L39
        La:
            int r1 = kotlin.UIntArray.m486getpVg5ArA(r3, r4)
            int r1 = kotlin.UnsignedKt.uintCompare(r1, r0)
            if (r1 >= 0) goto L17
            int r4 = r4 + 1
            goto La
        L17:
            int r1 = kotlin.UIntArray.m486getpVg5ArA(r3, r5)
            int r1 = kotlin.UnsignedKt.uintCompare(r1, r0)
            if (r1 <= 0) goto L24
            int r5 = r5 + (-1)
            goto L17
        L24:
            if (r4 > r5) goto L8
            int r1 = kotlin.UIntArray.m486getpVg5ArA(r3, r4)
            int r2 = kotlin.UIntArray.m486getpVg5ArA(r3, r5)
            kotlin.UIntArray.m491setVXSXFK8(r3, r4, r2)
            kotlin.UIntArray.m491setVXSXFK8(r3, r5, r1)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L8
        L39:
            return r4
    }

    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m788quickSortnroSd4(long[] r2, int r3, int r4) {
            int r0 = m784partitionnroSd4(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb
            m788quickSortnroSd4(r2, r3, r1)
        Lb:
            if (r0 >= r4) goto L10
            m788quickSortnroSd4(r2, r0, r4)
        L10:
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m789quickSort4UcCI2c(byte[] r2, int r3, int r4) {
            int r0 = m785partition4UcCI2c(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb
            m789quickSort4UcCI2c(r2, r3, r1)
        Lb:
            if (r0 >= r4) goto L10
            m789quickSort4UcCI2c(r2, r0, r4)
        L10:
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m790quickSortAa5vz7o(short[] r2, int r3, int r4) {
            int r0 = m786partitionAa5vz7o(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb
            m790quickSortAa5vz7o(r2, r3, r1)
        Lb:
            if (r0 >= r4) goto L10
            m790quickSortAa5vz7o(r2, r0, r4)
        L10:
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m791quickSortoBK06Vg(int[] r2, int r3, int r4) {
            int r0 = m787partitionoBK06Vg(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb
            m791quickSortoBK06Vg(r2, r3, r1)
        Lb:
            if (r0 >= r4) goto L10
            m791quickSortoBK06Vg(r2, r0, r4)
        L10:
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m792sortArraynroSd4(@org.jetbrains.annotations.NotNull long[] r1, int r2, int r3) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r3 = r3 + (-1)
            m788quickSortnroSd4(r1, r2, r3)
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m793sortArray4UcCI2c(@org.jetbrains.annotations.NotNull byte[] r1, int r2, int r3) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r3 = r3 + (-1)
            m789quickSort4UcCI2c(r1, r2, r3)
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m794sortArrayAa5vz7o(@org.jetbrains.annotations.NotNull short[] r1, int r2, int r3) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r3 = r3 + (-1)
            m790quickSortAa5vz7o(r1, r2, r3)
            return
    }

    @kotlin.ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m795sortArrayoBK06Vg(@org.jetbrains.annotations.NotNull int[] r1, int r2, int r3) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r3 = r3 + (-1)
            m791quickSortoBK06Vg(r1, r2, r3)
            return
    }
}
