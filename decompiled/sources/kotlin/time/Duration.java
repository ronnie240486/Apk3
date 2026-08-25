package kotlin.time;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.6")
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 ¤\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¤\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u001b\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001e\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001e\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010QJ\u001b\u0010M\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bZ\u0010\rJ\r\u0010[\u001a\u00020U¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010`\u001a\u00020UH\u0002¢\u0006\u0004\ba\u0010]J\r\u0010b\u001a\u00020U¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020U¢\u0006\u0004\be\u0010]J\r\u0010f\u001a\u00020U¢\u0006\u0004\bg\u0010]J\u001b\u0010h\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bl\u0010jJ\u001e\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bn\u0010PJ\u001e\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bn\u0010QJ\u009d\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2u\u0010q\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0rH\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010{J\u0088\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2`\u0010q\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0|H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010}Js\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2K\u0010q\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0~H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010\u007fJ`\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p27\u0010q\u001a3\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0\u0080\u0001H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0005\bz\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\u0005J\u0011\u0010\u0092\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\u0005J\u0013\u0010\u0094\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J%\u0010\u0094\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0083\u0001\u001a\u00020=2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001J\u0018\u0010\u0098\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u0099\u0001\u0010\u0005JK\u0010\u009a\u0001\u001a\u00030\u009b\u0001*\b0\u009c\u0001j\u0003`\u009d\u00012\u0007\u0010\u009e\u0001\u001a\u00020\t2\u0007\u0010\u009f\u0001\u001a\u00020\t2\u0007\u0010 \u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u008a\u00012\u0007\u0010¡\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001R\u0017\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u001a\u00103\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006¥\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "unaryMinus", "unaryMinus-UwyO8pc", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmInline
@kotlin.WasExperimental(markerClass = {kotlin.time.ExperimentalTime.class})
public final class Duration implements java.lang.Comparable<kotlin.time.Duration> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.time.Duration.Companion Companion = null;
    private static final long INFINITE = 0;
    private static final long NEG_INFINITE = 0;
    private static final long ZERO = 0;
    private final long rawValue;

    /* JADX INFO: compiled from: Duration.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0007J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0011J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0014J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0011J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0011J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0014J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0014J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0017J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0011J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0014J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0017J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0014J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0017J\u001b\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u00108J\u001b\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b<J\u001b\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b>J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0011J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0014J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0017R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R%\u0010\f\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\f\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R%\u0010\f\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R%\u0010\u0018\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R%\u0010\u0018\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R%\u0010\u0018\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R%\u0010\u001b\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R%\u0010\u001b\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R%\u0010\u001b\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R%\u0010\u001e\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R%\u0010\u001e\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R%\u0010\u001e\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0017R%\u0010!\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R%\u0010!\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R%\u0010!\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0017R%\u0010$\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R%\u0010$\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R%\u0010$\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0017R%\u0010'\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R%\u0010'\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R%\u0010'\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0017\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006@"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "days", "", "getDays-UwyO8pc$annotations", "(D)V", "getDays-UwyO8pc", "(D)J", "", "(I)V", "(I)J", "", "(J)V", "(J)J", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "nanoseconds", "getNanoseconds-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "convert", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "days-UwyO8pc", "hours-UwyO8pc", "microseconds-UwyO8pc", "milliseconds-UwyO8pc", "minutes-UwyO8pc", "nanoseconds-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "parseOrNull", "parseOrNull-FghU774", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1700getDaysUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1701getDaysUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1702getDaysUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1703getDaysUwyO8pc$annotations(double r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1704getDaysUwyO8pc$annotations(int r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1705getDaysUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1706getHoursUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1707getHoursUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1708getHoursUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1709getHoursUwyO8pc$annotations(double r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1710getHoursUwyO8pc$annotations(int r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1711getHoursUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1712getMicrosecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1713getMicrosecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1714getMicrosecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1715getMicrosecondsUwyO8pc$annotations(double r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1716getMicrosecondsUwyO8pc$annotations(int r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1717getMicrosecondsUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1718getMillisecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1719getMillisecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1720getMillisecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1721getMillisecondsUwyO8pc$annotations(double r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1722getMillisecondsUwyO8pc$annotations(int r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1723getMillisecondsUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1724getMinutesUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1725getMinutesUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1726getMinutesUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1727getMinutesUwyO8pc$annotations(double r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1728getMinutesUwyO8pc$annotations(int r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1729getMinutesUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1730getNanosecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1731getNanosecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1732getNanosecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1733getNanosecondsUwyO8pc$annotations(double r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1734getNanosecondsUwyO8pc$annotations(int r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1735getNanosecondsUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1736getSecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1737getSecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1738getSecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1739getSecondsUwyO8pc$annotations(double r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1740getSecondsUwyO8pc$annotations(int r0) {
                return
        }

        @kotlin.internal.InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1741getSecondsUwyO8pc$annotations(long r0) {
                return
        }

        @kotlin.time.ExperimentalTime
        public final double convert(double r2, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r4, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r5) {
                r1 = this;
                java.lang.String r0 = "sourceUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "targetUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                double r2 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(r2, r4, r5)
                return r2
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final long m1742daysUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final long m1743daysUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final long m1744daysUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m1745getINFINITEUwyO8pc() {
                r2 = this;
                long r0 = kotlin.time.Duration.access$getINFINITE$cp()
                return r0
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m1746getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
                r2 = this;
                long r0 = kotlin.time.Duration.access$getNEG_INFINITE$cp()
                return r0
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m1747getZEROUwyO8pc() {
                r2 = this;
                long r0 = kotlin.time.Duration.access$getZERO$cp()
                return r0
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final long m1748hoursUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final long m1749hoursUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final long m1750hoursUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final long m1751microsecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final long m1752microsecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final long m1753microsecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final long m1754millisecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final long m1755millisecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final long m1756millisecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final long m1757minutesUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final long m1758minutesUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final long m1759minutesUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final long m1760nanosecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final long m1761nanosecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final long m1762nanosecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m1763parseUwyO8pc(@org.jetbrains.annotations.NotNull java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 0
                long r0 = kotlin.time.DurationKt.access$parseDuration(r5, r0)     // Catch: java.lang.IllegalArgumentException -> Lc
                return r0
            Lc:
                r0 = move-exception
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid duration string format: '"
                java.lang.String r3 = "'."
                java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r5, r3)
                r1.<init>(r5, r0)
                throw r1
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m1764parseIsoStringUwyO8pc(@org.jetbrains.annotations.NotNull java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 1
                long r0 = kotlin.time.DurationKt.access$parseDuration(r5, r0)     // Catch: java.lang.IllegalArgumentException -> Lc
                return r0
            Lc:
                r0 = move-exception
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid ISO duration string format: '"
                java.lang.String r3 = "'."
                java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r5, r3)
                r1.<init>(r5, r0)
                throw r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final kotlin.time.Duration m1765parseIsoStringOrNullFghU774(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 1
                long r0 = kotlin.time.DurationKt.access$parseDuration(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L10
                kotlin.time.Duration r3 = kotlin.time.Duration.m1643boximpl(r0)     // Catch: java.lang.IllegalArgumentException -> L10
                goto L11
            L10:
                r3 = 0
            L11:
                return r3
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final kotlin.time.Duration m1766parseOrNullFghU774(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                long r0 = kotlin.time.DurationKt.access$parseDuration(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L10
                kotlin.time.Duration r3 = kotlin.time.Duration.m1643boximpl(r0)     // Catch: java.lang.IllegalArgumentException -> L10
                goto L11
            L10:
                r3 = 0
            L11:
                return r3
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final long m1767secondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final long m1768secondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.SinceKotlin(version = "1.5")
        @kotlin.Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "1.6")
        @kotlin.time.ExperimentalTime
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final long m1769secondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }
    }

    static {
            kotlin.time.Duration$Companion r0 = new kotlin.time.Duration$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.time.Duration.Companion = r0
            r0 = 0
            long r0 = m1645constructorimpl(r0)
            kotlin.time.Duration.ZERO = r0
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            kotlin.time.Duration.INFINITE = r0
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            kotlin.time.Duration.NEG_INFINITE = r0
            return
    }

    private /* synthetic */ Duration(long r1) {
            r0 = this;
            r0.<init>()
            r0.rawValue = r1
            return
    }

    public static final /* synthetic */ long access$getINFINITE$cp() {
            long r0 = kotlin.time.Duration.INFINITE
            return r0
    }

    public static final /* synthetic */ long access$getNEG_INFINITE$cp() {
            long r0 = kotlin.time.Duration.NEG_INFINITE
            return r0
    }

    public static final /* synthetic */ long access$getZERO$cp() {
            long r0 = kotlin.time.Duration.ZERO
            return r0
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m1641addValuesMixedRangesUwyO8pc(long r6, long r8, long r10) {
            long r6 = kotlin.time.DurationKt.access$nanosToMillis(r10)
            long r0 = r8 + r6
            kotlin.ranges.LongRange r8 = new kotlin.ranges.LongRange
            r2 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r4 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r8.<init>(r2, r4)
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L2a
            long r6 = kotlin.time.DurationKt.access$millisToNanos(r6)
            long r10 = r10 - r6
            long r6 = kotlin.time.DurationKt.access$millisToNanos(r0)
            long r6 = r6 + r10
            long r6 = kotlin.time.DurationKt.access$durationOfNanos(r6)
            goto L3c
        L2a:
            r2 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r6 = kotlin.ranges.RangesKt.coerceIn(r0, r2, r4)
            long r6 = kotlin.time.DurationKt.access$durationOfMillis(r6)
        L3c:
            return r6
    }

    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m1642appendFractionalimpl(long r3, java.lang.StringBuilder r5, int r6, int r7, int r8, java.lang.String r9, boolean r10) {
            r5.append(r6)
            if (r7 == 0) goto L4d
            r3 = 46
            r5.append(r3)
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r4 = 48
            java.lang.String r3 = kotlin.text.StringsKt.padStart(r3, r8)
            int r6 = r3.length()
            r7 = -1
            int r6 = r6 + r7
            r8 = 0
            r0 = 1
            if (r6 < 0) goto L32
        L1e:
            int r1 = r6 + (-1)
            char r2 = r3.charAt(r6)
            if (r2 == r4) goto L28
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            if (r2 == 0) goto L2d
            r7 = r6
            goto L32
        L2d:
            if (r1 >= 0) goto L30
            goto L32
        L30:
            r6 = r1
            goto L1e
        L32:
            int r7 = r7 + r0
            java.lang.String r4 = "this.append(value, startIndex, endIndex)"
            r6 = 3
            if (r10 != 0) goto L42
            if (r7 >= r6) goto L42
            r5.append(r3, r8, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            goto L4d
        L42:
            int r7 = r7 + 2
            int r7 = r7 / r6
            int r7 = r7 * 3
            r5.append(r3, r8, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
        L4d:
            r5.append(r9)
            return
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.time.Duration m1643boximpl(long r1) {
            kotlin.time.Duration r0 = new kotlin.time.Duration
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m1644compareToLRDsOJo(long r5, long r7) {
            long r0 = r5 ^ r7
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L1d
            int r1 = (int) r0
            r0 = r1 & 1
            if (r0 != 0) goto Le
            goto L1d
        Le:
            int r0 = (int) r5
            r0 = r0 & 1
            int r8 = (int) r7
            r7 = r8 & 1
            int r0 = r0 - r7
            boolean r5 = m1678isNegativeimpl(r5)
            if (r5 == 0) goto L1c
            int r0 = -r0
        L1c:
            return r0
        L1d:
            int r5 = kotlin.jvm.internal.Intrinsics.compare(r5, r7)
            return r5
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1645constructorimpl(long r5) {
            boolean r0 = kotlin.time.DurationJvmKt.getDurationAssertionsEnabled()
            if (r0 == 0) goto Lab
            boolean r0 = m1676isInNanosimpl(r5)
            if (r0 == 0) goto L42
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r3 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            r0.<init>(r1, r3)
            long r1 = m1672getValueimpl(r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L27
            goto Lab
        L27:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r5 = m1672getValueimpl(r5)
            r1.append(r5)
            java.lang.String r5 = " ns is out of nanoseconds range"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L42:
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r0.<init>(r1, r3)
            long r1 = m1672getValueimpl(r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L90
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r3 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r0.<init>(r1, r3)
            long r1 = m1672getValueimpl(r5)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L75
            goto Lab
        L75:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r5 = m1672getValueimpl(r5)
            r1.append(r5)
            java.lang.String r5 = " ms is denormalized"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L90:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r5 = m1672getValueimpl(r5)
            r1.append(r5)
            java.lang.String r5 = " ms is out of milliseconds range"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        Lab:
            return r5
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m1646divLRDsOJo(long r2, long r4) {
            kotlin.time.DurationUnit r0 = m1670getStorageUnitimpl(r2)
            kotlin.time.DurationUnit r1 = m1670getStorageUnitimpl(r4)
            java.lang.Comparable r0 = kotlin.comparisons.ComparisonsKt.maxOf(r0, r1)
            kotlin.time.DurationUnit r0 = (kotlin.time.DurationUnit) r0
            double r2 = m1688toDoubleimpl(r2, r0)
            double r4 = m1688toDoubleimpl(r4, r0)
            double r2 = r2 / r4
            return r2
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1647divUwyO8pc(long r4, double r6) {
            int r0 = kotlin.math.MathKt.roundToInt(r6)
            double r1 = (double) r0
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L15
            if (r0 == 0) goto L15
            long r4 = m1648divUwyO8pc(r4, r0)
            return r4
        L15:
            kotlin.time.DurationUnit r0 = m1670getStorageUnitimpl(r4)
            double r4 = m1688toDoubleimpl(r4, r0)
            double r4 = r4 / r6
            long r4 = kotlin.time.DurationKt.toDuration(r4, r0)
            return r4
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1648divUwyO8pc(long r8, int r10) {
            if (r10 != 0) goto L1c
            boolean r10 = m1679isPositiveimpl(r8)
            if (r10 == 0) goto Lb
            long r8 = kotlin.time.Duration.INFINITE
            goto L13
        Lb:
            boolean r8 = m1678isNegativeimpl(r8)
            if (r8 == 0) goto L14
            long r8 = kotlin.time.Duration.NEG_INFINITE
        L13:
            return r8
        L14:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Dividing zero duration by zero yields an undefined result."
            r8.<init>(r9)
            throw r8
        L1c:
            boolean r0 = m1676isInNanosimpl(r8)
            if (r0 == 0) goto L2d
            long r8 = m1672getValueimpl(r8)
            long r0 = (long) r10
            long r8 = r8 / r0
            long r8 = kotlin.time.DurationKt.access$durationOfNanos(r8)
            return r8
        L2d:
            boolean r0 = m1677isInfiniteimpl(r8)
            if (r0 == 0) goto L3c
            int r10 = kotlin.math.MathKt.getSign(r10)
            long r8 = m1683timesUwyO8pc(r8, r10)
            return r8
        L3c:
            long r0 = m1672getValueimpl(r8)
            long r2 = (long) r10
            long r0 = r0 / r2
            kotlin.ranges.LongRange r10 = new kotlin.ranges.LongRange
            r4 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r6 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r10.<init>(r4, r6)
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L6d
            long r8 = m1672getValueimpl(r8)
            long r4 = r0 * r2
            long r8 = r8 - r4
            long r8 = kotlin.time.DurationKt.access$millisToNanos(r8)
            long r8 = r8 / r2
            long r0 = kotlin.time.DurationKt.access$millisToNanos(r0)
            long r0 = r0 + r8
            long r8 = kotlin.time.DurationKt.access$durationOfNanos(r0)
            return r8
        L6d:
            long r8 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            return r8
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1649equalsimpl(long r4, java.lang.Object r6) {
            boolean r0 = r6 instanceof kotlin.time.Duration
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.time.Duration r6 = (kotlin.time.Duration) r6
            long r2 = r6.m1699unboximpl()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L11
            return r1
        L11:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1650equalsimpl0(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m1651getAbsoluteValueUwyO8pc(long r1) {
            boolean r0 = m1678isNegativeimpl(r1)
            if (r0 == 0) goto La
            long r1 = m1697unaryMinusUwyO8pc(r1)
        La:
            return r1
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m1652getHoursComponentimpl(long r2) {
            boolean r0 = m1677isInfiniteimpl(r2)
            if (r0 == 0) goto L8
            r2 = 0
            goto L11
        L8:
            long r2 = m1661getInWholeHoursimpl(r2)
            r0 = 24
            long r0 = (long) r0
            long r2 = r2 % r0
            int r2 = (int) r2
        L11:
            return r2
    }

    @kotlin.Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getInDays$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInDays-impl, reason: not valid java name */
    public static final double m1653getInDaysimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            double r1 = m1688toDoubleimpl(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getInHours$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInHours-impl, reason: not valid java name */
    public static final double m1654getInHoursimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            double r1 = m1688toDoubleimpl(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getInMicroseconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInMicroseconds-impl, reason: not valid java name */
    public static final double m1655getInMicrosecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            double r1 = m1688toDoubleimpl(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getInMilliseconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInMilliseconds-impl, reason: not valid java name */
    public static final double m1656getInMillisecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            double r1 = m1688toDoubleimpl(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getInMinutes$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInMinutes-impl, reason: not valid java name */
    public static final double m1657getInMinutesimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            double r1 = m1688toDoubleimpl(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getInNanoseconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInNanoseconds-impl, reason: not valid java name */
    public static final double m1658getInNanosecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            double r1 = m1688toDoubleimpl(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @kotlin.time.ExperimentalTime
    public static /* synthetic */ void getInSeconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInSeconds-impl, reason: not valid java name */
    public static final double m1659getInSecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            double r1 = m1688toDoubleimpl(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m1660getInWholeDaysimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r1 = m1691toLongimpl(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m1661getInWholeHoursimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r1 = m1691toLongimpl(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m1662getInWholeMicrosecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r1 = m1691toLongimpl(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m1663getInWholeMillisecondsimpl(long r1) {
            boolean r0 = m1675isInMillisimpl(r1)
            if (r0 == 0) goto L11
            boolean r0 = m1674isFiniteimpl(r1)
            if (r0 == 0) goto L11
            long r1 = m1672getValueimpl(r1)
            goto L17
        L11:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = m1691toLongimpl(r1, r0)
        L17:
            return r1
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m1664getInWholeMinutesimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r1 = m1691toLongimpl(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m1665getInWholeNanosecondsimpl(long r3) {
            long r0 = m1672getValueimpl(r3)
            boolean r3 = m1676isInNanosimpl(r3)
            if (r3 == 0) goto Lb
            goto L2a
        Lb:
            r3 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1a
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L2a
        L1a:
            r3 = -9223372036854(0xfffff79c842fa50a, double:NaN)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L26
            r0 = -9223372036854775808
            goto L2a
        L26:
            long r0 = kotlin.time.DurationKt.access$millisToNanos(r0)
        L2a:
            return r0
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m1666getInWholeSecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r1 = m1691toLongimpl(r1, r0)
            return r1
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m1667getMinutesComponentimpl(long r2) {
            boolean r0 = m1677isInfiniteimpl(r2)
            if (r0 == 0) goto L8
            r2 = 0
            goto L11
        L8:
            long r2 = m1664getInWholeMinutesimpl(r2)
            r0 = 60
            long r0 = (long) r0
            long r2 = r2 % r0
            int r2 = (int) r2
        L11:
            return r2
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m1668getNanosecondsComponentimpl(long r2) {
            boolean r0 = m1677isInfiniteimpl(r2)
            if (r0 == 0) goto L8
            r2 = 0
            goto L25
        L8:
            boolean r0 = m1675isInMillisimpl(r2)
            if (r0 == 0) goto L1b
            long r2 = m1672getValueimpl(r2)
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 % r0
            long r2 = kotlin.time.DurationKt.access$millisToNanos(r2)
            goto L24
        L1b:
            long r2 = m1672getValueimpl(r2)
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            long r0 = (long) r0
            long r2 = r2 % r0
        L24:
            int r2 = (int) r2
        L25:
            return r2
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m1669getSecondsComponentimpl(long r2) {
            boolean r0 = m1677isInfiniteimpl(r2)
            if (r0 == 0) goto L8
            r2 = 0
            goto L11
        L8:
            long r2 = m1666getInWholeSecondsimpl(r2)
            r0 = 60
            long r0 = (long) r0
            long r2 = r2 % r0
            int r2 = (int) r2
        L11:
            return r2
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final kotlin.time.DurationUnit m1670getStorageUnitimpl(long r0) {
            boolean r0 = m1676isInNanosimpl(r0)
            if (r0 == 0) goto L9
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            goto Lb
        L9:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m1671getUnitDiscriminatorimpl(long r0) {
            int r1 = (int) r0
            r0 = r1 & 1
            return r0
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m1672getValueimpl(long r1) {
            r0 = 1
            long r1 = r1 >> r0
            return r1
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1673hashCodeimpl(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r3 = (int) r2
            return r3
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m1674isFiniteimpl(long r0) {
            boolean r0 = m1677isInfiniteimpl(r0)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m1675isInMillisimpl(long r0) {
            int r1 = (int) r0
            r0 = 1
            r1 = r1 & r0
            if (r1 != r0) goto L6
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m1676isInNanosimpl(long r0) {
            int r1 = (int) r0
            r0 = 1
            r1 = r1 & r0
            if (r1 != 0) goto L6
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m1677isInfiniteimpl(long r3) {
            long r0 = kotlin.time.Duration.INFINITE
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto Lf
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            goto Lf
        Ld:
            r3 = 0
            goto L10
        Lf:
            r3 = 1
        L10:
            return r3
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m1678isNegativeimpl(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            return r3
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m1679isPositiveimpl(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            return r3
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m1680minusLRDsOJo(long r0, long r2) {
            long r2 = m1697unaryMinusUwyO8pc(r2)
            long r0 = m1681plusLRDsOJo(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m1681plusLRDsOJo(long r7, long r9) {
            boolean r0 = m1677isInfiniteimpl(r7)
            if (r0 == 0) goto L1d
            boolean r0 = m1674isFiniteimpl(r9)
            if (r0 != 0) goto L1c
            long r9 = r9 ^ r7
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L14
            goto L1c
        L14:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Summing infinite durations of different signs yields an undefined result."
            r7.<init>(r8)
            throw r7
        L1c:
            return r7
        L1d:
            boolean r0 = m1677isInfiniteimpl(r9)
            if (r0 == 0) goto L24
            return r9
        L24:
            int r0 = (int) r7
            r0 = r0 & 1
            int r1 = (int) r9
            r1 = r1 & 1
            if (r0 != r1) goto L45
            long r0 = m1672getValueimpl(r7)
            long r9 = m1672getValueimpl(r9)
            long r0 = r0 + r9
            boolean r7 = m1676isInNanosimpl(r7)
            if (r7 == 0) goto L40
            long r7 = kotlin.time.DurationKt.access$durationOfNanosNormalized(r0)
            goto L66
        L40:
            long r7 = kotlin.time.DurationKt.access$durationOfMillisNormalized(r0)
            goto L66
        L45:
            boolean r0 = m1675isInMillisimpl(r7)
            if (r0 == 0) goto L59
            long r3 = m1672getValueimpl(r7)
            long r5 = m1672getValueimpl(r9)
            r1 = r7
            long r7 = m1641addValuesMixedRangesUwyO8pc(r1, r3, r5)
            goto L66
        L59:
            long r2 = m1672getValueimpl(r9)
            long r4 = m1672getValueimpl(r7)
            r0 = r7
            long r7 = m1641addValuesMixedRangesUwyO8pc(r0, r2, r4)
        L66:
            return r7
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1682timesUwyO8pc(long r4, double r6) {
            int r0 = kotlin.math.MathKt.roundToInt(r6)
            double r1 = (double) r0
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L13
            long r4 = m1683timesUwyO8pc(r4, r0)
            return r4
        L13:
            kotlin.time.DurationUnit r0 = m1670getStorageUnitimpl(r4)
            double r4 = m1688toDoubleimpl(r4, r0)
            double r4 = r4 * r6
            long r4 = kotlin.time.DurationKt.toDuration(r4, r0)
            return r4
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1683timesUwyO8pc(long r16, int r18) {
            r0 = r18
            boolean r1 = m1677isInfiniteimpl(r16)
            if (r1 == 0) goto L1c
            if (r0 == 0) goto L14
            if (r0 <= 0) goto Lf
            r0 = r16
            goto L13
        Lf:
            long r0 = m1697unaryMinusUwyO8pc(r16)
        L13:
            return r0
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Multiplying infinite duration by zero yields an undefined result."
            r0.<init>(r1)
            throw r0
        L1c:
            if (r0 != 0) goto L21
            long r0 = kotlin.time.Duration.ZERO
            return r0
        L21:
            long r1 = m1672getValueimpl(r16)
            long r3 = (long) r0
            long r5 = r1 * r3
            boolean r7 = m1676isInNanosimpl(r16)
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r10 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r7 == 0) goto L9b
            kotlin.ranges.LongRange r7 = new kotlin.ranges.LongRange
            r12 = -2147483647(0xffffffff80000001, double:NaN)
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r7.<init>(r12, r14)
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L4f
            long r0 = kotlin.time.DurationKt.access$durationOfNanos(r5)
            goto Lc0
        L4f:
            long r12 = r5 / r3
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r7 != 0) goto L5a
            long r0 = kotlin.time.DurationKt.access$durationOfNanosNormalized(r5)
            goto Lc0
        L5a:
            long r5 = kotlin.time.DurationKt.access$nanosToMillis(r1)
            long r12 = kotlin.time.DurationKt.access$millisToNanos(r5)
            long r12 = r1 - r12
            long r14 = r5 * r3
            long r12 = r12 * r3
            long r12 = kotlin.time.DurationKt.access$nanosToMillis(r12)
            long r12 = r12 + r14
            long r3 = r14 / r3
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L89
            long r3 = r12 ^ r14
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L89
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r0.<init>(r10, r8)
            long r0 = kotlin.ranges.RangesKt.coerceIn(r12, r0)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            goto Lc0
        L89:
            int r1 = kotlin.math.MathKt.getSign(r1)
            int r0 = kotlin.math.MathKt.getSign(r18)
            int r0 = r0 * r1
            if (r0 <= 0) goto L98
            long r0 = kotlin.time.Duration.INFINITE
            goto Lc0
        L98:
            long r0 = kotlin.time.Duration.NEG_INFINITE
            goto Lc0
        L9b:
            long r3 = r5 / r3
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 != 0) goto Laf
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r0.<init>(r10, r8)
            long r0 = kotlin.ranges.RangesKt.coerceIn(r5, r0)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            goto Lc0
        Laf:
            int r1 = kotlin.math.MathKt.getSign(r1)
            int r0 = kotlin.math.MathKt.getSign(r18)
            int r0 = r0 * r1
            if (r0 <= 0) goto Lbe
            long r0 = kotlin.time.Duration.INFINITE
            goto Lc0
        Lbe:
            long r0 = kotlin.time.Duration.NEG_INFINITE
        Lc0:
            return r0
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1684toComponentsimpl(long r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends T> r4) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = m1666getInWholeSecondsimpl(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r2 = m1668getNanosecondsComponentimpl(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1685toComponentsimpl(long r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r4) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = m1664getInWholeMinutesimpl(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r1 = m1669getSecondsComponentimpl(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = m1668getNanosecondsComponentimpl(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r0, r1, r2)
            return r2
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1686toComponentsimpl(long r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r5) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = m1661getInWholeHoursimpl(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r1 = m1667getMinutesComponentimpl(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = m1669getSecondsComponentimpl(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = m1668getNanosecondsComponentimpl(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r0, r1, r2, r3)
            return r3
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1687toComponentsimpl(long r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function5<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r10) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            long r0 = m1660getInWholeDaysimpl(r8)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            int r0 = m1652getHoursComponentimpl(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r0 = m1667getMinutesComponentimpl(r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            int r0 = m1669getSecondsComponentimpl(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r8 = m1668getNanosecondsComponentimpl(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r2 = r10
            java.lang.Object r8 = r2.invoke(r3, r4, r5, r6, r7)
            return r8
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m1688toDoubleimpl(long r3, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r5) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = kotlin.time.Duration.INFINITE
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto Lf
            r3 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L25
        Lf:
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L18
            r3 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            goto L25
        L18:
            long r0 = m1672getValueimpl(r3)
            double r0 = (double) r0
            kotlin.time.DurationUnit r3 = m1670getStorageUnitimpl(r3)
            double r3 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(r0, r3, r5)
        L25:
            return r3
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m1689toIntimpl(long r7, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r1 = m1691toLongimpl(r7, r9)
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r7 = kotlin.ranges.RangesKt.coerceIn(r1, r3, r5)
            int r8 = (int) r7
            return r8
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final java.lang.String m1690toIsoStringimpl(long r11) {
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            boolean r0 = m1678isNegativeimpl(r11)
            if (r0 == 0) goto L10
            r0 = 45
            r8.append(r0)
        L10:
            java.lang.String r0 = "PT"
            r8.append(r0)
            long r0 = m1651getAbsoluteValueUwyO8pc(r11)
            long r2 = m1661getInWholeHoursimpl(r0)
            int r4 = m1667getMinutesComponentimpl(r0)
            int r5 = m1669getSecondsComponentimpl(r0)
            int r6 = m1668getNanosecondsComponentimpl(r0)
            boolean r0 = m1677isInfiniteimpl(r11)
            if (r0 == 0) goto L34
            r2 = 9999999999999(0x9184e729fff, double:4.940656458412E-311)
        L34:
            r0 = 0
            r7 = 1
            r9 = 0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r5 != 0) goto L46
            if (r6 == 0) goto L44
            goto L46
        L44:
            r1 = 0
            goto L47
        L46:
            r1 = 1
        L47:
            if (r4 != 0) goto L4f
            if (r1 == 0) goto L4e
            if (r0 == 0) goto L4e
            goto L4f
        L4e:
            r7 = 0
        L4f:
            if (r0 == 0) goto L59
            r8.append(r2)
            r2 = 72
            r8.append(r2)
        L59:
            if (r7 == 0) goto L63
            r8.append(r4)
            r2 = 77
            r8.append(r2)
        L63:
            if (r1 != 0) goto L69
            if (r0 != 0) goto L78
            if (r7 != 0) goto L78
        L69:
            r7 = 9
            r9 = 1
            java.lang.String r10 = "S"
            r0 = r11
            r2 = r8
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r10
            r7 = r9
            m1642appendFractionalimpl(r0, r2, r3, r4, r5, r6, r7)
        L78:
            java.lang.String r11 = r8.toString()
            java.lang.String r12 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            return r11
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m1691toLongimpl(long r3, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r5) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = kotlin.time.Duration.INFINITE
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L12
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L27
        L12:
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L1b
            r3 = -9223372036854775808
            goto L27
        L1b:
            long r0 = m1672getValueimpl(r3)
            kotlin.time.DurationUnit r3 = m1670getStorageUnitimpl(r3)
            long r3 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(r0, r3, r5)
        L27:
            return r3
    }

    @kotlin.Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
    @kotlin.time.ExperimentalTime
    /* JADX INFO: renamed from: toLongMilliseconds-impl, reason: not valid java name */
    public static final long m1692toLongMillisecondsimpl(long r0) {
            long r0 = m1663getInWholeMillisecondsimpl(r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
    @kotlin.time.ExperimentalTime
    /* JADX INFO: renamed from: toLongNanoseconds-impl, reason: not valid java name */
    public static final long m1693toLongNanosecondsimpl(long r0) {
            long r0 = m1665getInWholeNanosecondsimpl(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1694toStringimpl(long r14) {
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            java.lang.String r14 = "0s"
            goto L107
        La:
            long r2 = kotlin.time.Duration.INFINITE
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 != 0) goto L14
            java.lang.String r14 = "Infinity"
            goto L107
        L14:
            long r2 = kotlin.time.Duration.NEG_INFINITE
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 != 0) goto L1e
            java.lang.String r14 = "-Infinity"
            goto L107
        L1e:
            boolean r2 = m1678isNegativeimpl(r14)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            if (r2 == 0) goto L2e
            r3 = 45
            r11.append(r3)
        L2e:
            long r3 = m1651getAbsoluteValueUwyO8pc(r14)
            long r5 = m1660getInWholeDaysimpl(r3)
            int r7 = m1652getHoursComponentimpl(r3)
            int r8 = m1667getMinutesComponentimpl(r3)
            int r9 = m1669getSecondsComponentimpl(r3)
            int r10 = m1668getNanosecondsComponentimpl(r3)
            r3 = 0
            r12 = 1
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 == 0) goto L4e
            r0 = 1
            goto L4f
        L4e:
            r0 = 0
        L4f:
            if (r7 == 0) goto L53
            r1 = 1
            goto L54
        L53:
            r1 = 0
        L54:
            if (r8 == 0) goto L58
            r4 = 1
            goto L59
        L58:
            r4 = 0
        L59:
            if (r9 != 0) goto L60
            if (r10 == 0) goto L5e
            goto L60
        L5e:
            r13 = 0
            goto L61
        L60:
            r13 = 1
        L61:
            if (r0 == 0) goto L6c
            r11.append(r5)
            r3 = 100
            r11.append(r3)
            r3 = 1
        L6c:
            r5 = 32
            if (r1 != 0) goto L76
            if (r0 == 0) goto L86
            if (r4 != 0) goto L76
            if (r13 == 0) goto L86
        L76:
            int r6 = r3 + 1
            if (r3 <= 0) goto L7d
            r11.append(r5)
        L7d:
            r11.append(r7)
            r3 = 104(0x68, float:1.46E-43)
            r11.append(r3)
            r3 = r6
        L86:
            if (r4 != 0) goto L8e
            if (r13 == 0) goto L9e
            if (r1 != 0) goto L8e
            if (r0 == 0) goto L9e
        L8e:
            int r6 = r3 + 1
            if (r3 <= 0) goto L95
            r11.append(r5)
        L95:
            r11.append(r8)
            r3 = 109(0x6d, float:1.53E-43)
            r11.append(r3)
            r3 = r6
        L9e:
            if (r13 == 0) goto Lef
            int r13 = r3 + 1
            if (r3 <= 0) goto La7
            r11.append(r5)
        La7:
            if (r9 != 0) goto Ldf
            if (r0 != 0) goto Ldf
            if (r1 != 0) goto Ldf
            if (r4 == 0) goto Lb0
            goto Ldf
        Lb0:
            r0 = 1000000(0xf4240, float:1.401298E-39)
            if (r10 < r0) goto Lc3
            int r6 = r10 / r0
            int r7 = r10 % r0
            r8 = 6
            r10 = 0
            java.lang.String r9 = "ms"
            r3 = r14
            r5 = r11
            m1642appendFractionalimpl(r3, r5, r6, r7, r8, r9, r10)
            goto Lee
        Lc3:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r10 < r0) goto Ld6
            int r6 = r10 / 1000
            int r7 = r10 % 1000
            r8 = 3
            r10 = 0
            java.lang.String r9 = "us"
            r3 = r14
            r5 = r11
            m1642appendFractionalimpl(r3, r5, r6, r7, r8, r9, r10)
            goto Lee
        Ld6:
            r11.append(r10)
            java.lang.String r14 = "ns"
            r11.append(r14)
            goto Lee
        Ldf:
            r8 = 9
            r0 = 0
            java.lang.String r1 = "s"
            r3 = r14
            r5 = r11
            r6 = r9
            r7 = r10
            r9 = r1
            r10 = r0
            m1642appendFractionalimpl(r3, r5, r6, r7, r8, r9, r10)
        Lee:
            r3 = r13
        Lef:
            if (r2 == 0) goto Lfe
            if (r3 <= r12) goto Lfe
            r14 = 40
            java.lang.StringBuilder r14 = r11.insert(r12, r14)
            r15 = 41
            r14.append(r15)
        Lfe:
            java.lang.String r14 = r11.toString()
            java.lang.String r15 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)
        L107:
            return r14
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final java.lang.String m1695toStringimpl(long r2, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r4, int r5) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r5 < 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L3a
            double r2 = m1688toDoubleimpl(r2, r4)
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 == 0) goto L1c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 12
            int r5 = kotlin.ranges.RangesKt.coerceAtMost(r5, r1)
            java.lang.String r2 = kotlin.time.DurationJvmKt.formatToExactDecimals(r2, r5)
            r0.append(r2)
            java.lang.String r2 = kotlin.time.DurationUnitKt__DurationUnitKt.shortName(r4)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L3a:
            java.lang.String r2 = "decimals must be not negative, but was "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r5)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m1696toStringimpl$default(long r0, kotlin.time.DurationUnit r2, int r3, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = m1695toStringimpl(r0, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m1697unaryMinusUwyO8pc(long r2) {
            long r0 = m1672getValueimpl(r2)
            long r0 = -r0
            int r3 = (int) r2
            r2 = r3 & 1
            long r2 = kotlin.time.DurationKt.access$durationOf(r0, r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.time.Duration r3) {
            r2 = this;
            kotlin.time.Duration r3 = (kotlin.time.Duration) r3
            long r0 = r3.m1699unboximpl()
            int r3 = r2.m1698compareToLRDsOJo(r0)
            return r3
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m1698compareToLRDsOJo(long r3) {
            r2 = this;
            long r0 = r2.rawValue
            int r3 = m1644compareToLRDsOJo(r0, r3)
            return r3
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.rawValue
            boolean r3 = m1649equalsimpl(r0, r3)
            return r3
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.rawValue
            int r0 = m1673hashCodeimpl(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.rawValue
            java.lang.String r0 = m1694toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1699unboximpl() {
            r2 = this;
            long r0 = r2.rawValue
            return r0
    }
}
