package kotlin.time;

/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\f\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"measureTime", "Lkotlin/time/Duration;", "block", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)J", "measureTimedValue", "Lkotlin/time/TimedValue;", "T", "Lkotlin/time/TimeSource;", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)J", "Lkotlin/time/TimeSource$Monotonic;", "(Lkotlin/time/TimeSource$Monotonic;Lkotlin/jvm/functions/Function0;)J", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MeasureTimeKt {
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.time.ExperimentalTime
    public static final long measureTime(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r2) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.time.TimeSource$Monotonic r0 = kotlin.time.TimeSource.Monotonic.INSTANCE
            long r0 = r0.m1782markNowz9LOYto()
            r2.invoke()
            long r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1785elapsedNowUwyO8pc(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.time.ExperimentalTime
    public static final long measureTime(@org.jetbrains.annotations.NotNull kotlin.time.TimeSource.Monotonic r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = r2.m1782markNowz9LOYto()
            r3.invoke()
            long r2 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1785elapsedNowUwyO8pc(r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.time.ExperimentalTime
    public static final long measureTime(@org.jetbrains.annotations.NotNull kotlin.time.TimeSource r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.time.TimeMark r1 = r1.markNow()
            r2.invoke()
            long r1 = r1.mo1637elapsedNowUwyO8pc()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.time.ExperimentalTime
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.time.TimedValue<T> measureTimedValue(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r4) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.time.TimeSource$Monotonic r0 = kotlin.time.TimeSource.Monotonic.INSTANCE
            long r0 = r0.m1782markNowz9LOYto()
            java.lang.Object r4 = r4.invoke()
            kotlin.time.TimedValue r2 = new kotlin.time.TimedValue
            long r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1785elapsedNowUwyO8pc(r0)
            r3 = 0
            r2.<init>(r4, r0, r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.time.ExperimentalTime
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.time.TimedValue<T> measureTimedValue(@org.jetbrains.annotations.NotNull kotlin.time.TimeSource.Monotonic r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = r3.m1782markNowz9LOYto()
            java.lang.Object r3 = r4.invoke()
            kotlin.time.TimedValue r4 = new kotlin.time.TimedValue
            long r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1785elapsedNowUwyO8pc(r0)
            r2 = 0
            r4.<init>(r3, r0, r2)
            return r4
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.time.ExperimentalTime
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.time.TimedValue<T> measureTimedValue(@org.jetbrains.annotations.NotNull kotlin.time.TimeSource r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.time.TimeMark r3 = r3.markNow()
            java.lang.Object r4 = r4.invoke()
            kotlin.time.TimedValue r0 = new kotlin.time.TimedValue
            long r1 = r3.mo1637elapsedNowUwyO8pc()
            r3 = 0
            r0.<init>(r4, r1, r3)
            return r0
    }
}
