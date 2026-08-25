package kotlin.time;

/* JADX INFO: compiled from: MonoTimeSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u0006H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource;", "()V", "zero", "", "adjustReading", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "timeMark", "duration", "Lkotlin/time/Duration;", "adjustReading-6QKq23U", "(JJ)J", "elapsedFrom", "elapsedFrom-6eNON_k", "(J)J", "markNow", "markNow-z9LOYto", "()J", "read", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.time.ExperimentalTime
public final class MonotonicTimeSource implements kotlin.time.TimeSource {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.MonotonicTimeSource INSTANCE = null;
    private static final long zero = 0;

    static {
            kotlin.time.MonotonicTimeSource r0 = new kotlin.time.MonotonicTimeSource
            r0.<init>()
            kotlin.time.MonotonicTimeSource.INSTANCE = r0
            long r0 = java.lang.System.nanoTime()
            kotlin.time.MonotonicTimeSource.zero = r0
            return
    }

    private MonotonicTimeSource() {
            r0 = this;
            r0.<init>()
            return
    }

    private final long read() {
            r4 = this;
            long r0 = java.lang.System.nanoTime()
            long r2 = kotlin.time.MonotonicTimeSource.zero
            long r0 = r0 - r2
            return r0
    }

    /* JADX INFO: renamed from: adjustReading-6QKq23U, reason: not valid java name */
    public final long m1775adjustReading6QKq23U(long r1, long r3) {
            r0 = this;
            long r1 = kotlin.time.LongSaturatedMathKt.m1773saturatingAddpTJri5U(r1, r3)
            long r1 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1784constructorimpl(r1)
            return r1
    }

    /* JADX INFO: renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m1776elapsedFrom6eNON_k(long r3) {
            r2 = this;
            long r0 = r2.read()
            long r3 = kotlin.time.LongSaturatedMathKt.saturatingDiff(r0, r3)
            return r3
    }

    @Override // kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ kotlin.time.TimeMark markNow() {
            r2 = this;
            long r0 = r2.m1777markNowz9LOYto()
            kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1783boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m1777markNowz9LOYto() {
            r2 = this;
            long r0 = r2.read()
            long r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1784constructorimpl(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "TimeSource(System.nanoTime())"
            return r0
    }
}
