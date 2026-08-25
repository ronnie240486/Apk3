package kotlin.time;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J\u001b\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/time/AdjustedTimeMark;", "Lkotlin/time/TimeMark;", "mark", "adjustment", "Lkotlin/time/Duration;", "(Lkotlin/time/TimeMark;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdjustment-UwyO8pc", "()J", "J", "getMark", "()Lkotlin/time/TimeMark;", "elapsedNow", "elapsedNow-UwyO8pc", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.time.ExperimentalTime
final class AdjustedTimeMark implements kotlin.time.TimeMark {
    private final long adjustment;

    @org.jetbrains.annotations.NotNull
    private final kotlin.time.TimeMark mark;

    private AdjustedTimeMark(kotlin.time.TimeMark r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.mark = r1
            r0.adjustment = r2
            return
    }

    public /* synthetic */ AdjustedTimeMark(kotlin.time.TimeMark r1, long r2, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    public long mo1637elapsedNowUwyO8pc() {
            r4 = this;
            kotlin.time.TimeMark r0 = r4.mark
            long r0 = r0.mo1637elapsedNowUwyO8pc()
            long r2 = r4.adjustment
            long r0 = kotlin.time.Duration.m1680minusLRDsOJo(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: getAdjustment-UwyO8pc, reason: not valid java name */
    public final long m1640getAdjustmentUwyO8pc() {
            r2 = this;
            long r0 = r2.adjustment
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.time.TimeMark getMark() {
            r1 = this;
            kotlin.time.TimeMark r0 = r1.mark
            return r0
    }

    @Override // kotlin.time.TimeMark
    public boolean hasNotPassedNow() {
            r1 = this;
            boolean r0 = kotlin.time.TimeMark.DefaultImpls.hasNotPassedNow(r1)
            return r0
    }

    @Override // kotlin.time.TimeMark
    public boolean hasPassedNow() {
            r1 = this;
            boolean r0 = kotlin.time.TimeMark.DefaultImpls.hasPassedNow(r1)
            return r0
    }

    @Override // kotlin.time.TimeMark
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo */
    public kotlin.time.TimeMark mo1638minusLRDsOJo(long r1) {
            r0 = this;
            kotlin.time.TimeMark r1 = kotlin.time.TimeMark.DefaultImpls.m1780minusLRDsOJo(r0, r1)
            return r1
    }

    @Override // kotlin.time.TimeMark
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    public kotlin.time.TimeMark mo1639plusLRDsOJo(long r5) {
            r4 = this;
            kotlin.time.AdjustedTimeMark r0 = new kotlin.time.AdjustedTimeMark
            kotlin.time.TimeMark r1 = r4.mark
            long r2 = r4.adjustment
            long r5 = kotlin.time.Duration.m1681plusLRDsOJo(r2, r5)
            r2 = 0
            r0.<init>(r1, r5, r2)
            return r0
    }
}
