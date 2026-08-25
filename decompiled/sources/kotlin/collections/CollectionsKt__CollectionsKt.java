package kotlin.collections;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\u0087\bø\u0001\u0000\u001aC\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\u0087\bø\u0001\u0000\u001a\u001f\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u0007H\u0087\b\u001a5\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\u0019\u001aN\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\b\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u001f\b\u0001\u0010\u001d\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u0013\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0002\b\u001fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001aF\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\b\"\u0004\b\u0000\u0010\u001b2\u001f\b\u0001\u0010\u001d\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u0013\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0002\b\u001fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\u0012\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007\u001a\u0015\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007H\u0087\b\u001a+\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\"\u001a%\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020$2\b\u0010%\u001a\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010&\u001a3\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020$2\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00070\u0018\"\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010\"\u001a\u0015\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u0007H\u0087\b\u001a+\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\"\u001a%\u0010(\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0002\b+\u001a\b\u0010,\u001a\u00020\u001eH\u0001\u001a\b\u0010-\u001a\u00020\u001eH\u0001\u001a%\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018H\u0000¢\u0006\u0002\u0010/\u001aS\u00100\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010%\u001a\u0002H\u00072\u001a\u00101\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000702j\n\u0012\u0006\b\u0000\u0012\u0002H\u0007`32\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u0006¢\u0006\u0002\u00104\u001a>\u00100\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000e\u001aE\u00100\u001a\u00020\u0006\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u000706*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\b2\b\u0010%\u001a\u0004\u0018\u0001H\u00072\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u0006¢\u0006\u0002\u00107\u001ag\u00108\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u00109*\b\u0012\u0004\u0012\u0002H906*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\u0010:\u001a\u0004\u0018\u0001H92\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\u0016\b\u0004\u0010;\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H90\u000eH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010<\u001a,\u0010=\u001a\u00020>\"\t\b\u0000\u0010\u0007¢\u0006\u0002\b?*\b\u0012\u0004\u0012\u0002H\u00070\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002H\u0087\b\u001a;\u0010@\u001a\u0002HA\"\u0010\b\u0000\u0010B*\u0006\u0012\u0002\b\u00030\u0002*\u0002HA\"\u0004\b\u0001\u0010A*\u0002HB2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HA0DH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010E\u001a\u0019\u0010F\u001a\u00020>\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0002H\u0087\b\u001a,\u0010G\u001a\u00020>\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\u001e\u0010H\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\bH\u0000\u001a!\u0010I\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\u0087\b\u001a!\u0010I\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\bH\u0087\b\u001a&\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070K2\u0006\u0010L\u001a\u00020MH\u0007\"\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"!\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006N"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "lastIndex", "", "T", "", "getLastIndex", "(Ljava/util/List;)I", "List", "size", "init", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "MutableList", "", "arrayListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "elements", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "buildList", "E", "capacity", "builderAction", "", "Lkotlin/ExtensionFunctionType;", "emptyList", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "listOfNotNull", "", "element", "(Ljava/lang/Object;)Ljava/util/List;", "mutableListOf", "rangeCheck", "fromIndex", "toIndex", "rangeCheck$CollectionsKt__CollectionsKt", "throwCountOverflow", "throwIndexOverflow", "asCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "binarySearch", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "comparison", "", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "binarySearchBy", "K", "key", "selector", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "containsAll", "", "Lkotlin/internal/OnlyInputTypes;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "optimizeReadOnlyList", "orEmpty", "shuffled", "", "random", "Lkotlin/random/Random;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__CollectionsKt extends kotlin.collections.CollectionsKt__CollectionsJVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1, reason: invalid class name */
    /* JADX INFO: compiled from: Collections.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "K", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = 176)
    public static final class AnonymousClass1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<T, java.lang.Integer> {

        /* JADX INFO: Incorrect field signature: TK; */
        public final /* synthetic */ java.lang.Comparable $key;
        public final /* synthetic */ kotlin.jvm.functions.Function1<T, K> $selector;

        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;+TK;>;TK;)V */
        public AnonymousClass1(kotlin.jvm.functions.Function1 r1, java.lang.Comparable r2) {
                r0 = this;
                r0.$selector = r1
                r0.$key = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @org.jetbrains.annotations.NotNull
        public final java.lang.Integer invoke(T r2) {
                r1 = this;
                kotlin.jvm.functions.Function1<T, K> r0 = r1.$selector
                java.lang.Object r2 = r0.invoke(r2)
                java.lang.Comparable r2 = (java.lang.Comparable) r2
                java.lang.Comparable r0 = r1.$key
                int r2 = kotlin.comparisons.ComparisonsKt.compareValues(r2, r0)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Integer r1 = r0.invoke(r1)
                return r1
        }
    }

    public CollectionsKt__CollectionsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> List(int r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r4) {
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r1 = 0
        Lb:
            if (r1 >= r3) goto L1b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r4.invoke(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto Lb
        L1b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> MutableList(int r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r4) {
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r1 = 0
        Lb:
            if (r1 >= r3) goto L1b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r4.invoke(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto Lb
        L1b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> java.util.ArrayList<T> arrayListOf() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.ArrayList<T> arrayListOf(@org.jetbrains.annotations.NotNull T... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            if (r0 != 0) goto Le
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L1a
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            kotlin.collections.ArrayAsCollection r1 = new kotlin.collections.ArrayAsCollection
            r2 = 1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            r3 = r0
        L1a:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Collection<T> asCollection(@org.jetbrains.annotations.NotNull T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.ArrayAsCollection r0 = new kotlin.collections.ArrayAsCollection
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static final <T> int binarySearch(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, int r3, int r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Integer> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "comparison"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r2.size()
            rangeCheck$CollectionsKt__CollectionsKt(r0, r3, r4)
            int r4 = r4 + (-1)
        L13:
            if (r3 > r4) goto L32
            int r0 = r3 + r4
            int r0 = r0 >>> 1
            java.lang.Object r1 = r2.get(r0)
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 >= 0) goto L2c
            int r3 = r0 + 1
            goto L13
        L2c:
            if (r1 <= 0) goto L31
            int r4 = r0 + (-1)
            goto L13
        L31:
            return r0
        L32:
            int r3 = r3 + 1
            int r2 = -r3
            return r2
    }

    public static final <T extends java.lang.Comparable<? super T>> int binarySearch(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, @org.jetbrains.annotations.Nullable T r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.size()
            rangeCheck$CollectionsKt__CollectionsKt(r0, r4, r5)
            int r5 = r5 + (-1)
        Le:
            if (r4 > r5) goto L29
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = kotlin.comparisons.ComparisonsKt.compareValues(r1, r3)
            if (r1 >= 0) goto L23
            int r4 = r0 + 1
            goto Le
        L23:
            if (r1 <= 0) goto L28
            int r5 = r0 + (-1)
            goto Le
        L28:
            return r0
        L29:
            int r4 = r4 + 1
            int r2 = -r4
            return r2
    }

    public static final <T> int binarySearch(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2, T r3, @org.jetbrains.annotations.NotNull java.util.Comparator<? super T> r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r2.size()
            rangeCheck$CollectionsKt__CollectionsKt(r0, r5, r6)
            int r6 = r6 + (-1)
        L13:
            if (r5 > r6) goto L2c
            int r0 = r5 + r6
            int r0 = r0 >>> 1
            java.lang.Object r1 = r2.get(r0)
            int r1 = r4.compare(r1, r3)
            if (r1 >= 0) goto L26
            int r5 = r0 + 1
            goto L13
        L26:
            if (r1 <= 0) goto L2b
            int r6 = r0 + (-1)
            goto L13
        L2b:
            return r0
        L2c:
            int r5 = r5 + 1
            int r2 = -r5
            return r2
    }

    public static /* synthetic */ int binarySearch$default(java.util.List r0, int r1, int r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto Ld
            int r2 = r0.size()
        Ld:
            int r0 = binarySearch(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int binarySearch$default(java.util.List r0, java.lang.Comparable r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r0.size()
        Ld:
            int r0 = binarySearch(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int binarySearch$default(java.util.List r0, java.lang.Object r1, java.util.Comparator r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 8
            if (r5 == 0) goto Ld
            int r4 = r0.size()
        Ld:
            int r0 = binarySearch(r0, r1, r2, r3, r4)
            return r0
    }

    public static final <T, K extends java.lang.Comparable<? super K>> int binarySearchBy(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1, @org.jetbrains.annotations.Nullable K r2, int r3, int r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1 r0 = new kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1
            r0.<init>(r5, r2)
            int r1 = binarySearch(r1, r3, r4, r0)
            return r1
    }

    public static /* synthetic */ int binarySearchBy$default(java.util.List r0, java.lang.Comparable r1, int r2, int r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto Ld
            int r3 = r0.size()
        Ld:
            kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1 r5 = new kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1
            r5.<init>(r4, r1)
            int r0 = binarySearch(r0, r2, r3, r5)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final <E> java.util.List<E> buildList(int r1, @kotlin.BuilderInference kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.Unit> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsJVMKt.createListBuilder(r1)
            r2.invoke(r1)
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsJVMKt.build(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @kotlin.internal.InlineOnly
    private static final <E> java.util.List<E> buildList(@kotlin.BuilderInference kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.Unit> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsJVMKt.createListBuilder()
            r1.invoke(r0)
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsJVMKt.build(r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> boolean containsAll(java.util.Collection<? extends T> r1, java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r1 = r1.containsAll(r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> emptyList() {
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.ranges.IntRange getIndices(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r2 = r2.size()
            int r2 = r2 + (-1)
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> int getLastIndex(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.size()
            int r1 = r1 + (-1)
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final java.lang.Object ifEmpty(java.util.Collection r1, kotlin.jvm.functions.Function0 r2) {
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r2.invoke()
        Lf:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> boolean isNotEmpty(java.util.Collection<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> boolean isNullOrEmpty(java.util.Collection<? extends T> r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> listOf() {
            java.util.List r0 = emptyList()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> listOf(@org.jetbrains.annotations.NotNull T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto Ld
            java.util.List r1 = kotlin.collections.ArraysKt___ArraysJvmKt.asList(r1)
            goto L11
        Ld:
            java.util.List r1 = emptyList()
        L11:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> listOfNotNull(@org.jetbrains.annotations.Nullable T r0) {
            if (r0 == 0) goto L7
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r0)
            goto Lb
        L7:
            java.util.List r0 = emptyList()
        Lb:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> listOfNotNull(@org.jetbrains.annotations.NotNull T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r1 = kotlin.collections.ArraysKt___ArraysKt.filterNotNull(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> mutableListOf() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> mutableListOf(@org.jetbrains.annotations.NotNull T... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            if (r0 != 0) goto Le
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L1a
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            kotlin.collections.ArrayAsCollection r1 = new kotlin.collections.ArrayAsCollection
            r2 = 1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            r3 = r0
        L1a:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> optimizeReadOnlyList(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L19
            r1 = 1
            if (r0 == r1) goto Lf
            goto L1d
        Lf:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r2)
            goto L1d
        L19:
            java.util.List r2 = emptyList()
        L1d:
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Collection<T> orEmpty(java.util.Collection<? extends T> r0) {
            if (r0 != 0) goto L6
            java.util.List r0 = emptyList()
        L6:
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> orEmpty(java.util.List<? extends T> r0) {
            if (r0 != 0) goto L6
            java.util.List r0 = emptyList()
        L6:
            return r0
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int r3, int r4, int r5) {
            java.lang.String r0 = ")."
            java.lang.String r1 = "fromIndex ("
            if (r4 > r5) goto L39
            if (r4 < 0) goto L2d
            if (r5 > r3) goto Lb
            return
        Lb:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "toIndex ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ") is greater than size ("
            r1.append(r5)
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        L2d:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = ") is less than zero."
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r5)
            r3.<init>(r4)
            throw r3
        L39:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = ") is greater than toIndex ("
            r2.append(r4)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r3.<init>(r4)
            throw r3
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> shuffled(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.toMutableList(r1)
            kotlin.collections.CollectionsKt___CollectionsKt.shuffle(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    public static void throwCountOverflow() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Count overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    public static void throwIndexOverflow() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
    }
}
