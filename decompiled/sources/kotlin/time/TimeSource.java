package kotlin.time;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "Companion", "Monotonic", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.time.ExperimentalTime
public interface TimeSource {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.TimeSource.Companion Companion = null;

    /* JADX INFO: compiled from: TimeSource.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/TimeSource$Companion;", "", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ kotlin.time.TimeSource.Companion $$INSTANCE = null;

        static {
                kotlin.time.TimeSource$Companion r0 = new kotlin.time.TimeSource$Companion
                r0.<init>()
                kotlin.time.TimeSource.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: TimeSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource;", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Monotonic implements kotlin.time.TimeSource {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.time.TimeSource.Monotonic INSTANCE = null;

        /* JADX INFO: compiled from: TimeSource.kt */
        @kotlin.SinceKotlin(version = "1.7")
        @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0018\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\bH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006#"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/TimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "constructor-impl", "(J)J", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "equals", "", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hasNotPassedNow", "hasNotPassedNow-impl", "(J)Z", "hasPassedNow", "hasPassedNow-impl", "hashCode", "", "hashCode-impl", "(J)I", "minus", "duration", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @kotlin.jvm.JvmInline
        @kotlin.time.ExperimentalTime
        public static final class ValueTimeMark implements kotlin.time.TimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long r1) {
                    r0 = this;
                    r0.<init>()
                    r0.reading = r1
                    return
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ kotlin.time.TimeSource.Monotonic.ValueTimeMark m1783boximpl(long r1) {
                    kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = new kotlin.time.TimeSource$Monotonic$ValueTimeMark
                    r0.<init>(r1)
                    return r0
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m1784constructorimpl(long r0) {
                    return r0
            }

            /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m1785elapsedNowUwyO8pc(long r1) {
                    kotlin.time.MonotonicTimeSource r0 = kotlin.time.MonotonicTimeSource.INSTANCE
                    long r1 = r0.m1776elapsedFrom6eNON_k(r1)
                    return r1
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m1786equalsimpl(long r4, java.lang.Object r6) {
                    boolean r0 = r6 instanceof kotlin.time.TimeSource.Monotonic.ValueTimeMark
                    r1 = 0
                    if (r0 != 0) goto L6
                    return r1
                L6:
                    kotlin.time.TimeSource$Monotonic$ValueTimeMark r6 = (kotlin.time.TimeSource.Monotonic.ValueTimeMark) r6
                    long r2 = r6.m1796unboximpl()
                    int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r6 == 0) goto L11
                    return r1
                L11:
                    r4 = 1
                    return r4
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m1787equalsimpl0(long r1, long r3) {
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 != 0) goto L6
                    r1 = 1
                    goto L7
                L6:
                    r1 = 0
                L7:
                    return r1
            }

            /* JADX INFO: renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m1788hasNotPassedNowimpl(long r0) {
                    long r0 = m1785elapsedNowUwyO8pc(r0)
                    boolean r0 = kotlin.time.Duration.m1678isNegativeimpl(r0)
                    return r0
            }

            /* JADX INFO: renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m1789hasPassedNowimpl(long r0) {
                    long r0 = m1785elapsedNowUwyO8pc(r0)
                    boolean r0 = kotlin.time.Duration.m1678isNegativeimpl(r0)
                    r0 = r0 ^ 1
                    return r0
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m1790hashCodeimpl(long r2) {
                    r0 = 32
                    long r0 = r2 >>> r0
                    long r2 = r2 ^ r0
                    int r3 = (int) r2
                    return r3
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m1791minusLRDsOJo(long r1, long r3) {
                    kotlin.time.MonotonicTimeSource r0 = kotlin.time.MonotonicTimeSource.INSTANCE
                    long r3 = kotlin.time.Duration.m1697unaryMinusUwyO8pc(r3)
                    long r1 = r0.m1775adjustReading6QKq23U(r1, r3)
                    return r1
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m1792plusLRDsOJo(long r1, long r3) {
                    kotlin.time.MonotonicTimeSource r0 = kotlin.time.MonotonicTimeSource.INSTANCE
                    long r1 = r0.m1775adjustReading6QKq23U(r1, r3)
                    return r1
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static java.lang.String m1793toStringimpl(long r2) {
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "ValueTimeMark(reading="
                    r0.append(r1)
                    r0.append(r2)
                    r2 = 41
                    r0.append(r2)
                    java.lang.String r2 = r0.toString()
                    return r2
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
            public long mo1637elapsedNowUwyO8pc() {
                    r2 = this;
                    long r0 = r2.reading
                    long r0 = m1785elapsedNowUwyO8pc(r0)
                    return r0
            }

            public boolean equals(java.lang.Object r3) {
                    r2 = this;
                    long r0 = r2.reading
                    boolean r3 = m1786equalsimpl(r0, r3)
                    return r3
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                    r2 = this;
                    long r0 = r2.reading
                    boolean r0 = m1788hasNotPassedNowimpl(r0)
                    return r0
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                    r2 = this;
                    long r0 = r2.reading
                    boolean r0 = m1789hasPassedNowimpl(r0)
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    long r0 = r2.reading
                    int r0 = m1790hashCodeimpl(r0)
                    return r0
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m1794minusLRDsOJo(long r3) {
                    r2 = this;
                    long r0 = r2.reading
                    long r3 = m1791minusLRDsOJo(r0, r3)
                    return r3
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ kotlin.time.TimeMark mo1638minusLRDsOJo(long r1) {
                    r0 = this;
                    long r1 = r0.m1794minusLRDsOJo(r1)
                    kotlin.time.TimeSource$Monotonic$ValueTimeMark r1 = m1783boximpl(r1)
                    return r1
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m1795plusLRDsOJo(long r3) {
                    r2 = this;
                    long r0 = r2.reading
                    long r3 = m1792plusLRDsOJo(r0, r3)
                    return r3
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ kotlin.time.TimeMark mo1639plusLRDsOJo(long r1) {
                    r0 = this;
                    long r1 = r0.m1795plusLRDsOJo(r1)
                    kotlin.time.TimeSource$Monotonic$ValueTimeMark r1 = m1783boximpl(r1)
                    return r1
            }

            public java.lang.String toString() {
                    r2 = this;
                    long r0 = r2.reading
                    java.lang.String r0 = m1793toStringimpl(r0)
                    return r0
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ long m1796unboximpl() {
                    r2 = this;
                    long r0 = r2.reading
                    return r0
            }
        }

        static {
                kotlin.time.TimeSource$Monotonic r0 = new kotlin.time.TimeSource$Monotonic
                r0.<init>()
                kotlin.time.TimeSource.Monotonic.INSTANCE = r0
                return
        }

        private Monotonic() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ kotlin.time.TimeMark markNow() {
                r2 = this;
                long r0 = r2.m1782markNowz9LOYto()
                kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1783boximpl(r0)
                return r0
        }

        /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m1782markNowz9LOYto() {
                r2 = this;
                kotlin.time.MonotonicTimeSource r0 = kotlin.time.MonotonicTimeSource.INSTANCE
                long r0 = r0.m1777markNowz9LOYto()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                kotlin.time.MonotonicTimeSource r0 = kotlin.time.MonotonicTimeSource.INSTANCE
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            kotlin.time.TimeSource$Companion r0 = kotlin.time.TimeSource.Companion.$$INSTANCE
            kotlin.time.TimeSource.Companion = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    kotlin.time.TimeMark markNow();
}
