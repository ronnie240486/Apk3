package kotlin.time;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0001J\u0014\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "hasNotPassedNow", "", "hasPassedNow", "minus", "duration", "plus", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.time.ExperimentalTime
public interface TimeMark {

    /* JADX INFO: compiled from: TimeSource.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(@org.jetbrains.annotations.NotNull kotlin.time.TimeMark r2) {
                long r0 = r2.mo1637elapsedNowUwyO8pc()
                boolean r2 = kotlin.time.Duration.m1678isNegativeimpl(r0)
                return r2
        }

        public static boolean hasPassedNow(@org.jetbrains.annotations.NotNull kotlin.time.TimeMark r2) {
                long r0 = r2.mo1637elapsedNowUwyO8pc()
                boolean r2 = kotlin.time.Duration.m1678isNegativeimpl(r0)
                r2 = r2 ^ 1
                return r2
        }

        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static kotlin.time.TimeMark m1780minusLRDsOJo(@org.jetbrains.annotations.NotNull kotlin.time.TimeMark r0, long r1) {
                long r1 = kotlin.time.Duration.m1697unaryMinusUwyO8pc(r1)
                kotlin.time.TimeMark r0 = r0.mo1639plusLRDsOJo(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public static kotlin.time.TimeMark m1781plusLRDsOJo(@org.jetbrains.annotations.NotNull kotlin.time.TimeMark r2, long r3) {
                kotlin.time.AdjustedTimeMark r0 = new kotlin.time.AdjustedTimeMark
                r1 = 0
                r0.<init>(r2, r3, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    long mo1637elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo */
    kotlin.time.TimeMark mo1638minusLRDsOJo(long r1);

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    kotlin.time.TimeMark mo1639plusLRDsOJo(long r1);
}
