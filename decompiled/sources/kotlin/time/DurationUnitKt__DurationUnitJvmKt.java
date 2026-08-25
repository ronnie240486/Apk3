package kotlin.time;

/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a \u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a\f\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"convertDurationUnit", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "", "convertDurationUnitOverflow", "toDurationUnit", "Ljava/util/concurrent/TimeUnit;", "toTimeUnit", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitJvmKt {

    /* JADX INFO: compiled from: DurationUnitJvm.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
                int r1 = r1.ordinal()
                r2 = 4
                r0[r1] = r2
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
                int r1 = r1.ordinal()
                r2 = 5
                r0[r1] = r2
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS
                int r1 = r1.ordinal()
                r2 = 6
                r0[r1] = r2
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS
                int r1 = r1.ordinal()
                r2 = 7
                r0[r1] = r2
                kotlin.time.DurationUnitKt__DurationUnitJvmKt.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public DurationUnitKt__DurationUnitJvmKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static final double convertDurationUnit(double r7, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r9, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r10) {
            java.lang.String r0 = "sourceUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "targetUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.concurrent.TimeUnit r0 = r10.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r1 = r9.getTimeUnit$kotlin_stdlib()
            r2 = 1
            long r0 = r0.convert(r2, r1)
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L22
            double r9 = (double) r0
            double r7 = r7 * r9
            return r7
        L22:
            java.util.concurrent.TimeUnit r9 = r9.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r10 = r10.getTimeUnit$kotlin_stdlib()
            long r9 = r9.convert(r2, r10)
            double r9 = (double) r9
            double r7 = r7 / r9
            return r7
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final long convertDurationUnit(long r1, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r3, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r4) {
            java.lang.String r0 = "sourceUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "targetUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.concurrent.TimeUnit r4 = r4.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r3 = r3.getTimeUnit$kotlin_stdlib()
            long r1 = r4.convert(r1, r3)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final long convertDurationUnitOverflow(long r1, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r3, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r4) {
            java.lang.String r0 = "sourceUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "targetUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.concurrent.TimeUnit r4 = r4.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r3 = r3.getTimeUnit$kotlin_stdlib()
            long r1 = r4.convert(r1, r3)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.time.ExperimentalTime
    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.DurationUnit toDurationUnit(@org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int[] r0 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                default: goto L10;
            }
        L10:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L16:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.DAYS
            goto L2a
        L19:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.HOURS
            goto L2a
        L1c:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MINUTES
            goto L2a
        L1f:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
            goto L2a
        L22:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MILLISECONDS
            goto L2a
        L25:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MICROSECONDS
            goto L2a
        L28:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS
        L2a:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.time.ExperimentalTime
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.TimeUnit toTimeUnit(@org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.concurrent.TimeUnit r1 = r1.getTimeUnit$kotlin_stdlib()
            return r1
    }
}
