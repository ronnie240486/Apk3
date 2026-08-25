package kotlin.time.jdk8;

/* JADX INFO: compiled from: DurationConversions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"toJavaDuration", "Ljava/time/Duration;", "Lkotlin/time/Duration;", "toJavaDuration-LRDsOJo", "(J)Ljava/time/Duration;", "toKotlinDuration", "(Ljava/time/Duration;)J", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 6, 0}, pn = "kotlin.time", xi = 48)
@kotlin.jvm.JvmName(name = "DurationConversionsJDK8Kt")
public final class DurationConversionsJDK8Kt {
    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: toJavaDuration-LRDsOJo, reason: not valid java name */
    private static final java.time.Duration m1801toJavaDurationLRDsOJo(long r2) {
            long r0 = kotlin.time.Duration.m1666getInWholeSecondsimpl(r2)
            int r2 = kotlin.time.Duration.m1668getNanosecondsComponentimpl(r2)
            long r2 = (long) r2
            java.time.Duration r2 = java.time.Duration.ofSeconds(r0, r2)
            java.lang.String r3 = "toJavaDuration-LRDsOJo"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
    @kotlin.internal.InlineOnly
    private static final long toKotlinDuration(java.time.Duration r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = r4.getSeconds()
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.SECONDS
            long r0 = kotlin.time.DurationKt.toDuration(r0, r2)
            int r4 = r4.getNano()
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r2 = kotlin.time.DurationKt.toDuration(r4, r2)
            long r0 = kotlin.time.Duration.m1681plusLRDsOJo(r0, r2)
            return r0
    }
}
