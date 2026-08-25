package kotlin.time;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0002\u0010&\u001a\u0018\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u0001H\u0002\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a \u00101\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0002\u00106\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u00102\u001a\u000203H\u0002\u001a)\u00108\u001a\u00020\u0005*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a)\u0010=\u001a\u000203*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a\u001f\u0010>\u001a\u00020\u0007*\u00020\b2\u0006\u0010?\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u001f\u0010>\u001a\u00020\u0007*\u00020\u00052\u0006\u0010?\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\b2\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010G\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010H\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00012\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"!\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\r\u001a\u0004\b\u000b\u0010\u000e\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010\"!\u0010\u0011\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000e\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010\"!\u0010\u0014\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000e\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0010\"!\u0010\u0017\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000e\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0010\"!\u0010\u001a\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000e\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0010\"!\u0010\u001d\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000e\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0010\"!\u0010 \u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"!\u0010 \u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000e\"!\u0010 \u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, d2 = {"MAX_MILLIS", "", "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", "", "days", "Lkotlin/time/Duration;", "", "getDays$annotations", "(D)V", "getDays", "(D)J", "(I)V", "(I)J", "(J)V", "(J)J", "hours", "getHours$annotations", "getHours", "microseconds", "getMicroseconds$annotations", "getMicroseconds", "milliseconds", "getMilliseconds$annotations", "getMilliseconds", "minutes", "getMinutes$annotations", "getMinutes", "nanoseconds", "getNanoseconds$annotations", "getNanoseconds", "seconds", "getSeconds$annotations", "getSeconds", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfMillis", "normalMillis", "durationOfMillisNormalized", "millis", "durationOfNanos", "normalNanos", "durationOfNanosNormalized", "nanos", "millisToNanos", "nanosToMillis", "parseDuration", "value", "", "strictIso", "", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "skipWhile", "startIndex", "predicate", "Lkotlin/Function1;", "", "substringWhile", "times", "duration", "times-kIfJnKk", "(DJ)J", "times-mvk6XK0", "(IJ)J", "toDuration", "unit", "Lkotlin/time/DurationUnit;", "(DLkotlin/time/DurationUnit;)J", "(ILkotlin/time/DurationUnit;)J", "(JLkotlin/time/DurationUnit;)J", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final /* synthetic */ long access$durationOf(long r0, int r2) {
            long r0 = durationOf(r0, r2)
            return r0
    }

    public static final /* synthetic */ long access$durationOfMillis(long r0) {
            long r0 = durationOfMillis(r0)
            return r0
    }

    public static final /* synthetic */ long access$durationOfMillisNormalized(long r0) {
            long r0 = durationOfMillisNormalized(r0)
            return r0
    }

    public static final /* synthetic */ long access$durationOfNanos(long r0) {
            long r0 = durationOfNanos(r0)
            return r0
    }

    public static final /* synthetic */ long access$durationOfNanosNormalized(long r0) {
            long r0 = durationOfNanosNormalized(r0)
            return r0
    }

    public static final /* synthetic */ long access$millisToNanos(long r0) {
            long r0 = millisToNanos(r0)
            return r0
    }

    public static final /* synthetic */ long access$nanosToMillis(long r0) {
            long r0 = nanosToMillis(r0)
            return r0
    }

    public static final /* synthetic */ long access$parseDuration(java.lang.String r0, boolean r1) {
            long r0 = parseDuration(r0, r1)
            return r0
    }

    private static final long durationOf(long r2, int r4) {
            r0 = 1
            long r2 = r2 << r0
            long r0 = (long) r4
            long r2 = r2 + r0
            long r2 = kotlin.time.Duration.m1645constructorimpl(r2)
            return r2
    }

    private static final long durationOfMillis(long r2) {
            r0 = 1
            long r2 = r2 << r0
            r0 = 1
            long r2 = r2 + r0
            long r2 = kotlin.time.Duration.m1645constructorimpl(r2)
            return r2
    }

    private static final long durationOfMillisNormalized(long r6) {
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r3 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r0.<init>(r1, r3)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L1e
            long r6 = millisToNanos(r6)
            long r6 = durationOfNanos(r6)
            goto L31
        L1e:
            r2 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r0 = r6
            long r6 = kotlin.ranges.RangesKt.coerceIn(r0, r2, r4)
            long r6 = durationOfMillis(r6)
        L31:
            return r6
    }

    private static final long durationOfNanos(long r1) {
            r0 = 1
            long r1 = r1 << r0
            long r1 = kotlin.time.Duration.m1645constructorimpl(r1)
            return r1
    }

    private static final long durationOfNanosNormalized(long r5) {
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r3 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            r0.<init>(r1, r3)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L1a
            long r5 = durationOfNanos(r5)
            goto L22
        L1a:
            long r5 = nanosToMillis(r5)
            long r5 = durationOfMillis(r5)
        L22:
            return r5
    }

    public static final long getDays(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final long getDays(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final long getDays(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getDays$annotations(double r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getDays$annotations(int r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getDays$annotations(long r0) {
            return
    }

    public static final long getHours(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final long getHours(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final long getHours(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getHours$annotations(double r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getHours$annotations(int r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getHours$annotations(long r0) {
            return
    }

    public static final long getMicroseconds(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final long getMicroseconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final long getMicroseconds(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(double r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(int r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(long r0) {
            return
    }

    public static final long getMilliseconds(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final long getMilliseconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final long getMilliseconds(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(double r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(int r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(long r0) {
            return
    }

    public static final long getMinutes(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final long getMinutes(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final long getMinutes(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(double r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(int r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(long r0) {
            return
    }

    public static final long getNanoseconds(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final long getNanoseconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final long getNanoseconds(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(double r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(int r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(long r0) {
            return
    }

    public static final long getSeconds(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final long getSeconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final long getSeconds(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(double r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(int r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(long r0) {
            return
    }

    private static final long millisToNanos(long r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r2 = r2 * r0
            return r2
    }

    private static final long nanosToMillis(long r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r2 = r2 / r0
            return r2
    }

    private static final long parseDuration(java.lang.String r17, boolean r18) {
            r0 = r17
            int r1 = r17.length()
            if (r1 == 0) goto L281
            kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion
            long r3 = r2.m1747getZEROUwyO8pc()
            r5 = 0
            char r5 = r0.charAt(r5)
            r6 = 43
            r7 = 45
            if (r5 != r6) goto L1a
            goto L1c
        L1a:
            if (r5 != r7) goto L1e
        L1c:
            r5 = 1
            goto L1f
        L1e:
            r5 = 0
        L1f:
            if (r5 <= 0) goto L23
            r6 = 1
            goto L24
        L23:
            r6 = 0
        L24:
            if (r6 == 0) goto L2e
            boolean r7 = kotlin.text.StringsKt.startsWith$default(r17)
            if (r7 == 0) goto L2e
            r7 = 1
            goto L2f
        L2e:
            r7 = 0
        L2f:
            java.lang.String r8 = "No components"
            if (r1 <= r5) goto L27b
            char r9 = r0.charAt(r5)
            r10 = 80
            java.lang.String r11 = "this as java.lang.String).substring(startIndex)"
            java.lang.String r12 = "Unexpected order of duration components"
            java.lang.String r13 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r14 = "null cannot be cast to non-null type java.lang.String"
            r15 = 0
            if (r9 != r10) goto L138
            int r5 = r5 + 1
            if (r5 == r1) goto L132
            r2 = 0
        L4b:
            if (r5 >= r1) goto L12e
            char r6 = r0.charAt(r5)
            r8 = 84
            if (r6 != r8) goto L63
            if (r2 != 0) goto L5d
            int r5 = r5 + 1
            if (r5 == r1) goto L5d
            r2 = 1
            goto L4b
        L5d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L63:
            r6 = r5
        L64:
            int r8 = r17.length()
            if (r6 >= r8) goto L92
            char r8 = r0.charAt(r6)
            kotlin.ranges.CharRange r9 = new kotlin.ranges.CharRange
            r10 = 57
            r16 = r7
            r7 = 48
            r9.<init>(r7, r10)
            boolean r7 = r9.contains(r8)
            if (r7 != 0) goto L8a
            java.lang.String r7 = "+-."
            boolean r7 = kotlin.text.StringsKt.contains$default(r7, r8)
            if (r7 == 0) goto L88
            goto L8a
        L88:
            r7 = 0
            goto L8b
        L8a:
            r7 = 1
        L8b:
            if (r7 == 0) goto L94
            int r6 = r6 + 1
            r7 = r16
            goto L64
        L92:
            r16 = r7
        L94:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r14)
            java.lang.String r6 = r0.substring(r5, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r13)
            int r7 = r6.length()
            if (r7 != 0) goto La6
            r7 = 1
            goto La7
        La6:
            r7 = 0
        La7:
            if (r7 != 0) goto L128
            int r7 = r6.length()
            int r7 = r7 + r5
            if (r7 < 0) goto L11c
            int r5 = kotlin.text.StringsKt.getLastIndex(r17)
            if (r7 > r5) goto L11c
            char r5 = r0.charAt(r7)
            int r7 = r7 + 1
            kotlin.time.DurationUnit r5 = kotlin.time.DurationUnitKt__DurationUnitKt.durationUnitByIsoChar(r5, r2)
            if (r15 == 0) goto Lcf
            int r8 = r15.compareTo(r5)
            if (r8 <= 0) goto Lc9
            goto Lcf
        Lc9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r12)
            throw r0
        Lcf:
            r8 = 6
            r9 = 46
            r10 = 0
            int r8 = kotlin.text.StringsKt.indexOf$default(r6, r9, r10, r8)
            kotlin.time.DurationUnit r9 = kotlin.time.DurationUnit.SECONDS
            if (r5 != r9) goto L10a
            if (r8 <= 0) goto L10a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r14)
            java.lang.String r9 = r6.substring(r10, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r13)
            long r9 = parseOverLongIsoComponent(r9)
            long r9 = toDuration(r9, r5)
            long r3 = kotlin.time.Duration.m1681plusLRDsOJo(r3, r9)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r14)
            java.lang.String r6 = r6.substring(r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r11)
            double r8 = java.lang.Double.parseDouble(r6)
            long r8 = toDuration(r8, r5)
            long r3 = kotlin.time.Duration.m1681plusLRDsOJo(r3, r8)
            goto L116
        L10a:
            long r8 = parseOverLongIsoComponent(r6)
            long r8 = toDuration(r8, r5)
            long r3 = kotlin.time.Duration.m1681plusLRDsOJo(r3, r8)
        L116:
            r15 = r5
            r5 = r7
            r7 = r16
            goto L4b
        L11c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Missing unit for value "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r6)
            r0.<init>(r1)
            throw r0
        L128:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L12e:
            r16 = r7
            goto L26e
        L132:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L138:
            r16 = r7
            if (r18 != 0) goto L275
            int r7 = r1 - r5
            r9 = 8
            int r7 = java.lang.Math.max(r7, r9)
            boolean r7 = kotlin.text.StringsKt.regionMatches(r0, r5, r7)
            if (r7 == 0) goto L150
            long r3 = r2.m1745getINFINITEUwyO8pc()
            goto L26e
        L150:
            r2 = r6 ^ 1
            if (r6 == 0) goto L172
            char r6 = r0.charAt(r5)
            r7 = 40
            if (r6 != r7) goto L172
            char r6 = kotlin.text.StringsKt.last(r17)
            r7 = 41
            if (r6 != r7) goto L172
            int r5 = r5 + 1
            int r1 = r1 + (-1)
            if (r5 == r1) goto L16c
            r2 = 1
            goto L172
        L16c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r8)
            throw r0
        L172:
            r6 = 0
        L173:
            if (r5 >= r1) goto L26e
            if (r6 == 0) goto L18f
            if (r2 == 0) goto L18f
        L179:
            int r6 = r17.length()
            if (r5 >= r6) goto L18f
            char r6 = r0.charAt(r5)
            r7 = 32
            if (r6 != r7) goto L189
            r6 = 1
            goto L18a
        L189:
            r6 = 0
        L18a:
            if (r6 == 0) goto L18f
            int r5 = r5 + 1
            goto L179
        L18f:
            r6 = r5
        L190:
            int r7 = r17.length()
            if (r6 >= r7) goto L1b6
            char r7 = r0.charAt(r6)
            kotlin.ranges.CharRange r8 = new kotlin.ranges.CharRange
            r9 = 48
            r10 = 57
            r8.<init>(r9, r10)
            boolean r8 = r8.contains(r7)
            if (r8 != 0) goto L1b0
            r8 = 46
            if (r7 != r8) goto L1ae
            goto L1b0
        L1ae:
            r7 = 0
            goto L1b1
        L1b0:
            r7 = 1
        L1b1:
            if (r7 == 0) goto L1b6
            int r6 = r6 + 1
            goto L190
        L1b6:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r14)
            java.lang.String r6 = r0.substring(r5, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r13)
            int r7 = r6.length()
            if (r7 != 0) goto L1c8
            r7 = 1
            goto L1c9
        L1c8:
            r7 = 0
        L1c9:
            if (r7 != 0) goto L268
            int r7 = r6.length()
            int r7 = r7 + r5
            r5 = r7
        L1d1:
            int r8 = r17.length()
            if (r5 >= r8) goto L1f1
            char r8 = r0.charAt(r5)
            kotlin.ranges.CharRange r9 = new kotlin.ranges.CharRange
            r10 = 97
            r18 = r2
            r2 = 122(0x7a, float:1.71E-43)
            r9.<init>(r10, r2)
            boolean r2 = r9.contains(r8)
            if (r2 == 0) goto L1f3
            int r5 = r5 + 1
            r2 = r18
            goto L1d1
        L1f1:
            r18 = r2
        L1f3:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r14)
            java.lang.String r2 = r0.substring(r7, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r13)
            int r5 = r2.length()
            int r5 = r5 + r7
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnitKt__DurationUnitKt.durationUnitByShortName(r2)
            if (r15 == 0) goto L215
            int r7 = r15.compareTo(r2)
            if (r7 <= 0) goto L20f
            goto L215
        L20f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r12)
            throw r0
        L215:
            r7 = 6
            r8 = 46
            r9 = 0
            int r7 = kotlin.text.StringsKt.indexOf$default(r6, r8, r9, r7)
            if (r7 <= 0) goto L256
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r14)
            java.lang.String r8 = r6.substring(r9, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r13)
            long r8 = java.lang.Long.parseLong(r8)
            long r8 = toDuration(r8, r2)
            long r3 = kotlin.time.Duration.m1681plusLRDsOJo(r3, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r14)
            java.lang.String r6 = r6.substring(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r11)
            double r6 = java.lang.Double.parseDouble(r6)
            long r6 = toDuration(r6, r2)
            long r3 = kotlin.time.Duration.m1681plusLRDsOJo(r3, r6)
            if (r5 < r1) goto L24e
            goto L262
        L24e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Fractional component must be last"
            r0.<init>(r1)
            throw r0
        L256:
            long r6 = java.lang.Long.parseLong(r6)
            long r6 = toDuration(r6, r2)
            long r3 = kotlin.time.Duration.m1681plusLRDsOJo(r3, r6)
        L262:
            r6 = 1
            r15 = r2
            r2 = r18
            goto L173
        L268:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L26e:
            if (r16 == 0) goto L274
            long r3 = kotlin.time.Duration.m1697unaryMinusUwyO8pc(r3)
        L274:
            return r3
        L275:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L27b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r8)
            throw r0
        L281:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The string is empty"
            r0.<init>(r1)
            throw r0
    }

    private static final long parseOverLongIsoComponent(java.lang.String r7) {
            int r0 = r7.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L16
            char r3 = r7.charAt(r2)
            java.lang.String r4 = "+-"
            boolean r3 = kotlin.text.StringsKt.contains$default(r4, r3)
            if (r3 == 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r0 = r0 - r3
            r4 = 16
            if (r0 <= r4) goto L6b
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r4 = kotlin.text.StringsKt.getLastIndex(r7)
            r0.<init>(r3, r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L33
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L33
            goto L58
        L33:
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L58
            r3 = r0
            kotlin.collections.IntIterator r3 = (kotlin.collections.IntIterator) r3
            int r3 = r3.nextInt()
            kotlin.ranges.CharRange r4 = new kotlin.ranges.CharRange
            r5 = 48
            r6 = 57
            r4.<init>(r5, r6)
            char r3 = r7.charAt(r3)
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L37
            r1 = 0
        L58:
            if (r1 == 0) goto L6b
            char r7 = r7.charAt(r2)
            r0 = 45
            if (r7 != r0) goto L65
            r0 = -9223372036854775808
            goto L6a
        L65:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6a:
            return r0
        L6b:
            java.lang.String r0 = "+"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r7, r0)
            if (r0 == 0) goto L77
            java.lang.String r7 = kotlin.text.StringsKt.drop(r7)
        L77:
            long r0 = java.lang.Long.parseLong(r7)
            return r0
    }

    private static final int skipWhile(java.lang.String r1, int r2, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r3) {
        L0:
            int r0 = r1.length()
            if (r2 >= r0) goto L1d
            char r0 = r1.charAt(r2)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            int r2 = r2 + 1
            goto L0
        L1d:
            return r2
    }

    private static final java.lang.String substringWhile(java.lang.String r2, int r3, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
            r0 = r3
        L1:
            int r1 = r2.length()
            if (r0 >= r1) goto L1e
            char r1 = r2.charAt(r0)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1e
            int r0 = r0 + 1
            goto L1
        L1e:
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
            java.lang.String r2 = r2.substring(r3, r0)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m1770timeskIfJnKk(double r0, long r2) {
            long r0 = kotlin.time.Duration.m1682timesUwyO8pc(r2, r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m1771timesmvk6XK0(int r0, long r1) {
            long r0 = kotlin.time.Duration.m1683timesUwyO8pc(r1, r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
    public static final long toDuration(double r7, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            double r0 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(r7, r9, r0)
            boolean r2 = java.lang.Double.isNaN(r0)
            r2 = r2 ^ 1
            if (r2 == 0) goto L41
            long r0 = kotlin.math.MathKt.roundToLong(r0)
            kotlin.ranges.LongRange r2 = new kotlin.ranges.LongRange
            r3 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r5 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            r2.<init>(r3, r5)
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L32
            long r7 = durationOfNanos(r0)
            goto L40
        L32:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            double r7 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(r7, r9, r0)
            long r7 = kotlin.math.MathKt.roundToLong(r7)
            long r7 = durationOfMillisNormalized(r7)
        L40:
            return r7
        L41:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Duration value cannot be NaN."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
    public static final long toDuration(int r2, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r3) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            int r0 = r3.compareTo(r0)
            if (r0 > 0) goto L1a
            long r0 = (long) r2
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r2 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(r0, r3, r2)
            long r2 = durationOfNanos(r2)
            goto L1f
        L1a:
            long r0 = (long) r2
            long r2 = toDuration(r0, r3)
        L1f:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
    public static final long toDuration(long r7, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            r1 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            long r1 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(r1, r0, r9)
            kotlin.ranges.LongRange r3 = new kotlin.ranges.LongRange
            long r4 = -r1
            r3.<init>(r4, r1)
            boolean r1 = r3.contains(r7)
            if (r1 == 0) goto L26
            long r7 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(r7, r9, r0)
            long r7 = durationOfNanos(r7)
            return r7
        L26:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(r7, r9, r0)
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r5 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r7 = kotlin.ranges.RangesKt.coerceIn(r1, r3, r5)
            long r7 = durationOfMillis(r7)
            return r7
    }
}
