package kotlin.time;

/* JADX INFO: compiled from: DurationUnit.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0001\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0001¨\u0006\t"}, d2 = {"durationUnitByIsoChar", "Lkotlin/time/DurationUnit;", "isoChar", "", "isTimeComponent", "", "durationUnitByShortName", "shortName", "", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitKt extends kotlin.time.DurationUnitKt__DurationUnitJvmKt {

    /* JADX INFO: compiled from: DurationUnit.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlin.time.DurationUnit[] r0 = kotlin.time.DurationUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MICROSECONDS
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MILLISECONDS
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
                int r1 = r1.ordinal()
                r2 = 4
                r0[r1] = r2
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MINUTES
                int r1 = r1.ordinal()
                r2 = 5
                r0[r1] = r2
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.HOURS
                int r1 = r1.ordinal()
                r2 = 6
                r0[r1] = r2
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.DAYS
                int r1 = r1.ordinal()
                r2 = 7
                r0[r1] = r2
                kotlin.time.DurationUnitKt__DurationUnitKt.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public DurationUnitKt__DurationUnitKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.DurationUnit durationUnitByIsoChar(char r2, boolean r3) {
            if (r3 != 0) goto L20
            r3 = 68
            if (r2 != r3) goto L9
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.DAYS
            goto L34
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid or unsupported duration ISO non-time unit: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L20:
            r3 = 72
            if (r2 != r3) goto L27
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.HOURS
            goto L34
        L27:
            r3 = 77
            if (r2 != r3) goto L2e
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MINUTES
            goto L34
        L2e:
            r3 = 83
            if (r2 != r3) goto L35
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.SECONDS
        L34:
            return r2
        L35:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid duration ISO time unit: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.DurationUnit durationUnitByShortName(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "shortName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            r1 = 100
            if (r0 == r1) goto L67
            r1 = 104(0x68, float:1.46E-43)
            if (r0 == r1) goto L5c
            r1 = 109(0x6d, float:1.53E-43)
            if (r0 == r1) goto L51
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L46
            r1 = 3494(0xda6, float:4.896E-42)
            if (r0 == r1) goto L3b
            r1 = 3525(0xdc5, float:4.94E-42)
            if (r0 == r1) goto L30
            r1 = 3742(0xe9e, float:5.244E-42)
            if (r0 != r1) goto L72
            java.lang.String r0 = "us"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MICROSECONDS
            goto L71
        L30:
            java.lang.String r0 = "ns"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            goto L71
        L3b:
            java.lang.String r0 = "ms"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MILLISECONDS
            goto L71
        L46:
            java.lang.String r0 = "s"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.SECONDS
            goto L71
        L51:
            java.lang.String r0 = "m"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MINUTES
            goto L71
        L5c:
            java.lang.String r0 = "h"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.HOURS
            goto L71
        L67:
            java.lang.String r0 = "d"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.DAYS
        L71:
            return r2
        L72:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown duration unit short name: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
            r0.<init>(r2)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String shortName(@org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int[] r0 = kotlin.time.DurationUnitKt__DurationUnitKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L2e;
                case 7: goto L2b;
                default: goto L10;
            }
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown unit: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2b:
            java.lang.String r3 = "d"
            goto L3f
        L2e:
            java.lang.String r3 = "h"
            goto L3f
        L31:
            java.lang.String r3 = "m"
            goto L3f
        L34:
            java.lang.String r3 = "s"
            goto L3f
        L37:
            java.lang.String r3 = "ms"
            goto L3f
        L3a:
            java.lang.String r3 = "us"
            goto L3f
        L3d:
            java.lang.String r3 = "ns"
        L3f:
            return r3
    }
}
