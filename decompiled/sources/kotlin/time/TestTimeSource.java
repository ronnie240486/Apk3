package kotlin.time;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/Duration;", "duration", "", "overflow-LRDsOJo", "(J)V", "overflow", "plusAssign-LRDsOJo", "plusAssign", "", "reading", "J", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
@kotlin.time.ExperimentalTime
public final class TestTimeSource extends kotlin.time.AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
            r1 = this;
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            r1.<init>(r0)
            return
    }

    /* JADX INFO: renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m1778overflowLRDsOJo(long r5) {
            r4 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TestTimeSource will overflow if its reading "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            long r2 = r4.reading
            r1.append(r2)
            java.lang.String r2 = "ns is advanced by "
            r1.append(r2)
            java.lang.String r5 = kotlin.time.Duration.m1694toStringimpl(r5)
            r1.append(r5)
            r5 = 46
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m1779plusAssignLRDsOJo(long r10) {
            r9 = this;
            kotlin.time.DurationUnit r0 = r9.getUnit()
            long r0 = kotlin.time.Duration.m1691toLongimpl(r10, r0)
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2c
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2c
            long r2 = r9.reading
            long r4 = r2 + r0
            long r0 = r0 ^ r2
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L48
            long r0 = r2 ^ r4
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L48
            r9.m1778overflowLRDsOJo(r10)
            goto L48
        L2c:
            kotlin.time.DurationUnit r0 = r9.getUnit()
            double r0 = kotlin.time.Duration.m1688toDoubleimpl(r10, r0)
            long r2 = r9.reading
            double r2 = (double) r2
            double r2 = r2 + r0
            r0 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L44
            r0 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L47
        L44:
            r9.m1778overflowLRDsOJo(r10)
        L47:
            long r4 = (long) r2
        L48:
            r9.reading = r4
            return
    }

    @Override // kotlin.time.AbstractLongTimeSource
    public final long read() {
            r2 = this;
            long r0 = r2.reading
            return r0
    }
}
