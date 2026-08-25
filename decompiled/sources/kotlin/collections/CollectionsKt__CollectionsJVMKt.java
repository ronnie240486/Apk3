package kotlin.collections;

/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0080\b\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u0001\u001a?\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\b\u001a\u00020\t2\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000\u001a\u0011\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0081\b\u001a\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0081\b\u001a\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0081\b¢\u0006\u0002\u0010\u0017\u001a4\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0013\"\u0004\b\u0000\u0010\u00182\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0013H\u0081\b¢\u0006\u0002\u0010\u001a\u001a\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006\"\u0004\b\u0000\u0010\u0004H\u0001\u001a\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006\"\u0004\b\u0000\u0010\u00042\u0006\u0010\b\u001a\u00020\tH\u0001\u001a\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0003\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u001d\u001a\u0002H\u0018¢\u0006\u0002\u0010\u001e\u001a1\u0010\u001f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0013\"\u0004\b\u0000\u0010\u0018*\n\u0012\u0006\b\u0001\u0012\u0002H\u00180\u00132\u0006\u0010 \u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010!\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0003\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180#H\u0007\u001a&\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0003\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180#2\u0006\u0010$\u001a\u00020%H\u0007\u001a\u001f\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0003\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180'H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"brittleContainsOptimizationEnabled", "", "build", "", "E", "builder", "", "buildListInternal", "capacity", "", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "checkCountOverflow", "count", "checkIndexOverflow", "index", "copyToArrayImpl", "", "", "collection", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "T", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "createListBuilder", "listOf", "element", "(Ljava/lang/Object;)Ljava/util/List;", "copyToArrayOfAny", "isVarargs", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "shuffled", "", "random", "Ljava/util/Random;", "toList", "Ljava/util/Enumeration;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__CollectionsJVMKt {
    public CollectionsKt__CollectionsJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final boolean brittleContainsOptimizationEnabled() {
            boolean r0 = kotlin.collections.CollectionSystemProperties.brittleContainsOptimizationEnabled
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <E> java.util.List<E> build(@org.jetbrains.annotations.NotNull java.util.List<E> r1) {
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.collections.builders.ListBuilder r1 = (kotlin.collections.builders.ListBuilder) r1
            java.util.List r1 = r1.build()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final <E> java.util.List<E> buildListInternal(int r1, kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.Unit> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r1 = createListBuilder(r1)
            r2.invoke(r1)
            java.util.List r1 = build(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final <E> java.util.List<E> buildListInternal(kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.Unit> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r0 = createListBuilder()
            r1.invoke(r0)
            java.util.List r1 = build(r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final int checkCountOverflow(int r3) {
            if (r3 >= 0) goto L17
            r0 = 1
            r1 = 3
            r2 = 0
            boolean r0 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r0, r1, r2)
            if (r0 == 0) goto Lf
            kotlin.collections.CollectionsKt__CollectionsKt.throwCountOverflow()
            goto L17
        Lf:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r0 = "Count overflow has happened."
            r3.<init>(r0)
            throw r3
        L17:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final int checkIndexOverflow(int r3) {
            if (r3 >= 0) goto L17
            r0 = 1
            r1 = 3
            r2 = 0
            boolean r0 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r0, r1, r2)
            if (r0 == 0) goto Lf
            kotlin.collections.CollectionsKt__CollectionsKt.throwIndexOverflow()
            goto L17
        Lf:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r0 = "Index overflow has happened."
            r3.<init>(r0)
            throw r3
        L17:
            return r3
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.Object[] copyToArrayImpl(java.util.Collection<?> r1) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Object[] r1 = kotlin.jvm.internal.CollectionToArray.toArray(r1)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> T[] copyToArrayImpl(java.util.Collection<?> r1, T[] r2) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object[] r1 = kotlin.jvm.internal.CollectionToArray.toArray(r1, r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Object[] copyToArrayOfAny(@org.jetbrains.annotations.NotNull T[] r2, boolean r3) {
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            if (r3 == 0) goto L14
            java.lang.Class r3 = r2.getClass()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 == 0) goto L14
            goto L1e
        L14:
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3, r0)
            java.lang.String r3 = "copyOf(this, this.size, Array<Any?>::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        L1e:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <E> java.util.List<E> createListBuilder() {
            kotlin.collections.builders.ListBuilder r0 = new kotlin.collections.builders.ListBuilder
            r0.<init>()
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <E> java.util.List<E> createListBuilder(int r1) {
            kotlin.collections.builders.ListBuilder r0 = new kotlin.collections.builders.ListBuilder
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.List<T> listOf(T r1) {
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r0 = "singletonList(element)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> shuffled(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.toMutableList(r1)
            java.util.Collections.shuffle(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.2")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> shuffled(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull java.util.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.toMutableList(r1)
            java.util.Collections.shuffle(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.List<T> toList(java.util.Enumeration<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.ArrayList r1 = java.util.Collections.list(r1)
            java.lang.String r0 = "list(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }
}
