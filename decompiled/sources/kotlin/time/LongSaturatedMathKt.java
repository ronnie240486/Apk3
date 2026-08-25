package kotlin.time;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u001a \u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"checkInfiniteSumDefined", "", "longNs", "duration", "Lkotlin/time/Duration;", "durationNs", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAdd", "saturatingAdd-pTJri5U", "(JJ)J", "saturatingAddInHalves", "saturatingAddInHalves-pTJri5U", "saturatingDiff", "valueNs", "originNs", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LongSaturatedMathKt {
    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m1772checkInfiniteSumDefinedPjuGub4(long r1, long r3, long r5) {
            boolean r3 = kotlin.time.Duration.m1677isInfiniteimpl(r3)
            if (r3 == 0) goto L17
            long r3 = r1 ^ r5
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Summing infinities of different signs"
            r1.<init>(r2)
            throw r1
        L17:
            return r1
    }

    /* JADX INFO: renamed from: saturatingAdd-pTJri5U, reason: not valid java name */
    public static final long m1773saturatingAddpTJri5U(long r9, long r11) {
            long r4 = kotlin.time.Duration.m1665getInWholeNanosecondsimpl(r11)
            r0 = 1
            long r2 = r9 - r0
            long r2 = r2 | r0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L19
            r0 = r9
            r2 = r11
            long r9 = m1772checkInfiniteSumDefinedPjuGub4(r0, r2, r4)
            return r9
        L19:
            long r2 = r4 - r0
            long r0 = r0 | r2
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L25
            long r9 = m1774saturatingAddInHalvespTJri5U(r9, r11)
            return r9
        L25:
            long r11 = r9 + r4
            long r0 = r9 ^ r11
            long r2 = r4 ^ r11
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L39
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 >= 0) goto L38
            r6 = -9223372036854775808
        L38:
            return r6
        L39:
            return r11
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-pTJri5U, reason: not valid java name */
    private static final long m1774saturatingAddInHalvespTJri5U(long r7, long r9) {
            r0 = 2
            long r0 = kotlin.time.Duration.m1648divUwyO8pc(r9, r0)
            long r2 = kotlin.time.Duration.m1665getInWholeNanosecondsimpl(r0)
            r4 = 1
            long r2 = r2 - r4
            long r2 = r2 | r4
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L20
            double r7 = (double) r7
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            double r9 = kotlin.time.Duration.m1688toDoubleimpl(r9, r0)
            double r9 = r9 + r7
            long r7 = (long) r9
            return r7
        L20:
            long r7 = m1773saturatingAddpTJri5U(r7, r0)
            long r7 = m1773saturatingAddpTJri5U(r7, r0)
            return r7
    }

    public static final long saturatingDiff(long r7, long r9) {
            r0 = 1
            long r2 = r9 - r0
            long r0 = r0 | r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L19
            kotlin.time.DurationUnit r7 = kotlin.time.DurationUnit.DAYS
            long r7 = kotlin.time.DurationKt.toDuration(r9, r7)
            long r7 = kotlin.time.Duration.m1697unaryMinusUwyO8pc(r7)
            return r7
        L19:
            long r0 = r7 - r9
            long r2 = r0 ^ r7
            long r4 = r0 ^ r9
            long r4 = ~r4
            long r2 = r2 & r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L46
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r2 = r7 / r0
            long r4 = r9 / r0
            long r2 = r2 - r4
            long r7 = r7 % r0
            long r9 = r9 % r0
            long r7 = r7 - r9
            kotlin.time.Duration$Companion r9 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r9 = kotlin.time.DurationUnit.MILLISECONDS
            long r9 = kotlin.time.DurationKt.toDuration(r2, r9)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r7 = kotlin.time.DurationKt.toDuration(r7, r0)
            long r7 = kotlin.time.Duration.m1681plusLRDsOJo(r9, r7)
            return r7
        L46:
            kotlin.time.Duration$Companion r7 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r7 = kotlin.time.DurationUnit.NANOSECONDS
            long r7 = kotlin.time.DurationKt.toDuration(r0, r7)
            return r7
    }
}
