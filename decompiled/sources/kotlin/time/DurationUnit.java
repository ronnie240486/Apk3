package kotlin.time;

/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.SinceKotlin(version = "1.6")
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lkotlin/time/DurationUnit;", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "getTimeUnit$kotlin_stdlib", "()Ljava/util/concurrent/TimeUnit;", "NANOSECONDS", "MICROSECONDS", "MILLISECONDS", "SECONDS", "MINUTES", "HOURS", "DAYS", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
public final enum DurationUnit extends java.lang.Enum<kotlin.time.DurationUnit> {
    private static final /* synthetic */ kotlin.time.DurationUnit[] $VALUES = null;
    public static final kotlin.time.DurationUnit DAYS = null;
    public static final kotlin.time.DurationUnit HOURS = null;
    public static final kotlin.time.DurationUnit MICROSECONDS = null;
    public static final kotlin.time.DurationUnit MILLISECONDS = null;
    public static final kotlin.time.DurationUnit MINUTES = null;
    public static final kotlin.time.DurationUnit NANOSECONDS = null;
    public static final kotlin.time.DurationUnit SECONDS = null;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.TimeUnit timeUnit;

    private static final /* synthetic */ kotlin.time.DurationUnit[] $values() {
            r0 = 7
            kotlin.time.DurationUnit[] r0 = new kotlin.time.DurationUnit[r0]
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS
            r2 = 0
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MICROSECONDS
            r2 = 1
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MILLISECONDS
            r2 = 2
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
            r2 = 3
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MINUTES
            r2 = 4
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.HOURS
            r2 = 5
            r0[r2] = r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.DAYS
            r2 = 6
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.String r2 = "NANOSECONDS"
            r3 = 0
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.NANOSECONDS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            java.lang.String r2 = "MICROSECONDS"
            r3 = 1
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.MICROSECONDS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r2 = "MILLISECONDS"
            r3 = 2
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.MILLISECONDS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r2 = "SECONDS"
            r3 = 3
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.SECONDS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
            java.lang.String r2 = "MINUTES"
            r3 = 4
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.MINUTES = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS
            java.lang.String r2 = "HOURS"
            r3 = 5
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.HOURS = r0
            kotlin.time.DurationUnit r0 = new kotlin.time.DurationUnit
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS
            java.lang.String r2 = "DAYS"
            r3 = 6
            r0.<init>(r2, r3, r1)
            kotlin.time.DurationUnit.DAYS = r0
            kotlin.time.DurationUnit[] r0 = $values()
            kotlin.time.DurationUnit.$VALUES = r0
            return
    }

    private DurationUnit(java.lang.String r1, int r2, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.timeUnit = r3
            return
    }

    public static kotlin.time.DurationUnit valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.time.DurationUnit> r0 = kotlin.time.DurationUnit.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.time.DurationUnit r1 = (kotlin.time.DurationUnit) r1
            return r1
    }

    public static kotlin.time.DurationUnit[] values() {
            kotlin.time.DurationUnit[] r0 = kotlin.time.DurationUnit.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.time.DurationUnit[] r0 = (kotlin.time.DurationUnit[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.TimeUnit getTimeUnit$kotlin_stdlib() {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = r1.timeUnit
            return r0
    }
}
