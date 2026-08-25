package kotlin.internal;

/* JADX INFO: compiled from: UProgressionUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1541differenceModuloWZ9TVnA(int r1, int r2, int r3) {
            int r1 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r1, r3)
            int r2 = kotlin.UnsignedKt.m681uintRemainderJ1ME1BU(r2, r3)
            int r0 = kotlin.UnsignedKt.uintCompare(r1, r2)
            int r1 = r1 - r2
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            if (r0 < 0) goto L14
            goto L19
        L14:
            int r1 = r1 + r3
            int r1 = kotlin.UInt.m427constructorimpl(r1)
        L19:
            return r1
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1542differenceModulosambcqE(long r1, long r3, long r5) {
            long r1 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r1, r5)
            long r3 = kotlin.UnsignedKt.m683ulongRemaindereb3DHEI(r3, r5)
            int r0 = kotlin.UnsignedKt.ulongCompare(r1, r3)
            long r1 = r1 - r3
            long r1 = kotlin.ULong.m505constructorimpl(r1)
            if (r0 < 0) goto L14
            goto L19
        L14:
            long r1 = r1 + r5
            long r1 = kotlin.ULong.m505constructorimpl(r1)
        L19:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1543getProgressionLastElement7ftBX0g(long r7, long r9, long r11) {
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1d
            int r0 = kotlin.UnsignedKt.ulongCompare(r7, r9)
            if (r0 < 0) goto Ld
            goto L36
        Ld:
            long r5 = kotlin.ULong.m505constructorimpl(r11)
            r1 = r9
            r3 = r7
            long r7 = m1542differenceModulosambcqE(r1, r3, r5)
            long r9 = r9 - r7
            long r9 = kotlin.ULong.m505constructorimpl(r9)
            goto L36
        L1d:
            if (r2 >= 0) goto L37
            int r0 = kotlin.UnsignedKt.ulongCompare(r7, r9)
            if (r0 > 0) goto L26
            goto L36
        L26:
            long r11 = -r11
            long r4 = kotlin.ULong.m505constructorimpl(r11)
            r0 = r7
            r2 = r9
            long r7 = m1542differenceModulosambcqE(r0, r2, r4)
            long r9 = r9 + r7
            long r9 = kotlin.ULong.m505constructorimpl(r9)
        L36:
            return r9
        L37:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Step is zero."
            r7.<init>(r8)
            throw r7
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1544getProgressionLastElementNkh28Cs(int r1, int r2, int r3) {
            if (r3 <= 0) goto L17
            int r0 = kotlin.UnsignedKt.uintCompare(r1, r2)
            if (r0 < 0) goto L9
            goto L2e
        L9:
            int r3 = kotlin.UInt.m427constructorimpl(r3)
            int r1 = m1541differenceModuloWZ9TVnA(r2, r1, r3)
            int r2 = r2 - r1
            int r2 = kotlin.UInt.m427constructorimpl(r2)
            goto L2e
        L17:
            if (r3 >= 0) goto L2f
            int r0 = kotlin.UnsignedKt.uintCompare(r1, r2)
            if (r0 > 0) goto L20
            goto L2e
        L20:
            int r3 = -r3
            int r3 = kotlin.UInt.m427constructorimpl(r3)
            int r1 = m1541differenceModuloWZ9TVnA(r1, r2, r3)
            int r2 = r2 + r1
            int r2 = kotlin.UInt.m427constructorimpl(r2)
        L2e:
            return r2
        L2f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Step is zero."
            r1.<init>(r2)
            throw r1
    }
}
