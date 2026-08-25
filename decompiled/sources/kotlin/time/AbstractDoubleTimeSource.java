package kotlin.time;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource;", "Lkotlin/time/TimeMark;", "markNow", "Lkotlin/time/DurationUnit;", "unit", "Lkotlin/time/DurationUnit;", "getUnit", "()Lkotlin/time/DurationUnit;", "<init>", "(Lkotlin/time/DurationUnit;)V", "DoubleTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
@kotlin.time.ExperimentalTime
public abstract class AbstractDoubleTimeSource implements kotlin.time.TimeSource {

    @org.jetbrains.annotations.NotNull
    private final kotlin.time.DurationUnit unit;

    /* JADX INFO: compiled from: TimeSources.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0015\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0007H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource$DoubleTimeMark;", "Lkotlin/time/TimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractDoubleTimeSource;", "offset", "Lkotlin/time/Duration;", "(DLkotlin/time/AbstractDoubleTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DoubleTimeMark implements kotlin.time.TimeMark {
        private final long offset;
        private final double startedAt;

        @org.jetbrains.annotations.NotNull
        private final kotlin.time.AbstractDoubleTimeSource timeSource;

        private DoubleTimeMark(double r1, kotlin.time.AbstractDoubleTimeSource r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.startedAt = r1
                r0.timeSource = r3
                r0.offset = r4
                return
        }

        public /* synthetic */ DoubleTimeMark(double r1, kotlin.time.AbstractDoubleTimeSource r3, long r4, kotlin.jvm.internal.DefaultConstructorMarker r6) {
                r0 = this;
                r0.<init>(r1, r3, r4)
                return
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public long mo1637elapsedNowUwyO8pc() {
                r4 = this;
                kotlin.time.AbstractDoubleTimeSource r0 = r4.timeSource
                double r0 = r0.read()
                double r2 = r4.startedAt
                double r0 = r0 - r2
                kotlin.time.AbstractDoubleTimeSource r2 = r4.timeSource
                kotlin.time.DurationUnit r2 = r2.getUnit()
                long r0 = kotlin.time.DurationKt.toDuration(r0, r2)
                long r2 = r4.offset
                long r0 = kotlin.time.Duration.m1680minusLRDsOJo(r0, r2)
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
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public kotlin.time.TimeMark mo1638minusLRDsOJo(long r1) {
                r0 = this;
                kotlin.time.TimeMark r1 = kotlin.time.TimeMark.DefaultImpls.m1780minusLRDsOJo(r0, r1)
                return r1
        }

        @Override // kotlin.time.TimeMark
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public kotlin.time.TimeMark mo1639plusLRDsOJo(long r9) {
                r8 = this;
                kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark r7 = new kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark
                double r1 = r8.startedAt
                kotlin.time.AbstractDoubleTimeSource r3 = r8.timeSource
                long r4 = r8.offset
                long r4 = kotlin.time.Duration.m1681plusLRDsOJo(r4, r9)
                r6 = 0
                r0 = r7
                r0.<init>(r1, r3, r4, r6)
                return r7
        }
    }

    public AbstractDoubleTimeSource(@org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r2) {
            r1 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.unit = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.time.DurationUnit getUnit() {
            r1 = this;
            kotlin.time.DurationUnit r0 = r1.unit
            return r0
    }

    @Override // kotlin.time.TimeSource
    @org.jetbrains.annotations.NotNull
    public kotlin.time.TimeMark markNow() {
            r8 = this;
            kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark r7 = new kotlin.time.AbstractDoubleTimeSource$DoubleTimeMark
            double r1 = r8.read()
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            long r4 = r0.m1747getZEROUwyO8pc()
            r6 = 0
            r0 = r7
            r3 = r8
            r0.<init>(r1, r3, r4, r6)
            return r7
    }

    public abstract double read();
}
