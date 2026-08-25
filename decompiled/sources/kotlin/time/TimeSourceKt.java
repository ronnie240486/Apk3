package kotlin.time;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u001a\u001d\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"compareTo", "", "Lkotlin/time/TimeMark;", "other", "minus", "Lkotlin/time/Duration;", "(Lkotlin/time/TimeMark;Lkotlin/time/TimeMark;)J", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TimeSourceKt {
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Comparing one TimeMark to another is not a well defined operation because these time marks could have been obtained from the different time sources.")
    @kotlin.time.ExperimentalTime
    private static final int compareTo(kotlin.time.TimeMark r1, kotlin.time.TimeMark r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r1 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "Operation is disallowed."
            r1.<init>(r2)
            throw r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Subtracting one TimeMark from another is not a well defined operation because these time marks could have been obtained from the different time sources.")
    @kotlin.time.ExperimentalTime
    private static final long minus(kotlin.time.TimeMark r1, kotlin.time.TimeMark r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r1 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "Operation is disallowed."
            r1.<init>(r2)
            throw r1
    }
}
