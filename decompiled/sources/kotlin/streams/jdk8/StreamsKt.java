package kotlin.streams.jdk8;

/* JADX INFO: compiled from: Streams.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0001H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u0003H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f*\u00020\u0005H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\u0007H\u0007\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007¨\u0006\r"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "", "Ljava/util/stream/DoubleStream;", "", "Ljava/util/stream/IntStream;", "", "Ljava/util/stream/LongStream;", "T", "Ljava/util/stream/Stream;", "asStream", "toList", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 6, 0}, pn = "kotlin.streams", xi = 48)
@kotlin.jvm.JvmName(name = "StreamsKt")
public final class StreamsKt {
    /* JADX INFO: renamed from: $r8$lambda$bdU4-xB_0bnfvMo-xyX7v8aTfMQ, reason: not valid java name */
    public static /* synthetic */ java.util.Spliterator m1622$r8$lambda$bdU4xB_0bnfvMoxyX7v8aTfMQ(kotlin.sequences.Sequence r0) {
            java.util.Spliterator r0 = m1623asStream$lambda4(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<java.lang.Double> asSequence(@org.jetbrains.annotations.NotNull java.util.stream.DoubleStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$4 r0 = new kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$4
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<java.lang.Integer> asSequence(@org.jetbrains.annotations.NotNull java.util.stream.IntStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$2 r0 = new kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$2
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<java.lang.Long> asSequence(@org.jetbrains.annotations.NotNull java.util.stream.LongStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$3 r0 = new kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$3
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.Sequence<T> asSequence(@org.jetbrains.annotations.NotNull java.util.stream.Stream<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$1 r0 = new kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$1
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.stream.Stream<T> asStream(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.streams.jdk8.StreamsKt$$ExternalSyntheticLambda0 r0 = new kotlin.streams.jdk8.StreamsKt$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r2 = 16
            r1 = 0
            java.util.stream.Stream r2 = java.util.stream.StreamSupport.stream(r0, r2, r1)
            java.lang.String r0 = "stream({ Spliterators.sp…literator.ORDERED, false)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: asStream$lambda-4, reason: not valid java name */
    private static final java.util.Spliterator m1623asStream$lambda4(kotlin.sequences.Sequence r1) {
            java.lang.String r0 = "$this_asStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Iterator r1 = r1.iterator()
            r0 = 16
            java.util.Spliterator r1 = java.util.Spliterators.spliteratorUnknownSize(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Double> toList(@org.jetbrains.annotations.NotNull java.util.stream.DoubleStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            double[] r1 = r1.toArray()
            java.lang.String r0 = "toArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.util.List r1 = kotlin.collections.ArraysKt.asList(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Integer> toList(@org.jetbrains.annotations.NotNull java.util.stream.IntStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int[] r1 = r1.toArray()
            java.lang.String r0 = "toArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.util.List r1 = kotlin.collections.ArraysKt.asList(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Long> toList(@org.jetbrains.annotations.NotNull java.util.stream.LongStream r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            long[] r1 = r1.toArray()
            java.lang.String r0 = "toArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.util.List r1 = kotlin.collections.ArraysKt.asList(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> toList(@org.jetbrains.annotations.NotNull java.util.stream.Stream<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r0)
            java.lang.String r0 = "collect(Collectors.toList<T>())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }
}
