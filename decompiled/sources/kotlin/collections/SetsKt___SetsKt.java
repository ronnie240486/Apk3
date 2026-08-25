package kotlin.collections;

/* JADX INFO: compiled from: _Sets.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\r"}, d2 = {"minus", "", "T", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", "", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/SetsKt")
class SetsKt___SetsKt extends kotlin.collections.SetsKt__SetsKt {
    public SetsKt___SetsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> minus(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r3, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.Collection r4 = kotlin.collections.BrittleContainsOptimizationKt.convertToSetForSetOperationWith(r4, r3)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L19
            java.util.Set r3 = kotlin.collections.CollectionsKt___CollectionsKt.toSet(r3)
            return r3
        L19:
            boolean r0 = r4 instanceof java.util.Set
            if (r0 == 0) goto L3b
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.next()
            boolean r2 = r4.contains(r1)
            if (r2 != 0) goto L26
            r0.add(r1)
            goto L26
        L3a:
            return r0
        L3b:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r3)
            r0.removeAll(r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> minus(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r6, T r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r6.size()
            int r1 = kotlin.collections.MapsKt__MapsJVMKt.mapCapacity(r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
            r2 = 0
        L18:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r6.next()
            r4 = 1
            if (r2 != 0) goto L2d
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r7)
            if (r5 == 0) goto L2d
            r2 = 1
            r4 = 0
        L2d:
            if (r4 == 0) goto L18
            r0.add(r3)
            goto L18
        L33:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> minus(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            kotlin.collections.CollectionsKt__MutableCollectionsKt.removeAll(r0, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> minus(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r1, @org.jetbrains.annotations.NotNull T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            kotlin.collections.CollectionsKt__MutableCollectionsKt.removeAll(r0, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Set<T> minusElement(java.util.Set<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Set r1 = minus(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Set<T> plus(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r2, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Integer r0 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrNull(r3)
            if (r0 == 0) goto L1a
            int r0 = r0.intValue()
            int r1 = r2.size()
            int r1 = r1 + r0
            goto L20
        L1a:
            int r0 = r2.size()
            int r1 = r0 * 2
        L20:
            int r0 = kotlin.collections.MapsKt__MapsJVMKt.mapCapacity(r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r0)
            r1.addAll(r2)
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r1, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> plus(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            int r1 = r1 + 1
            int r1 = kotlin.collections.MapsKt__MapsJVMKt.mapCapacity(r1)
            r0.<init>(r1)
            r0.addAll(r2)
            r0.add(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> plus(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            int r1 = r1 * 2
            int r1 = kotlin.collections.MapsKt__MapsJVMKt.mapCapacity(r1)
            r0.<init>(r1)
            r0.addAll(r2)
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r0, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Set<T> plus(@org.jetbrains.annotations.NotNull java.util.Set<? extends T> r3, @org.jetbrains.annotations.NotNull T[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r3.size()
            int r2 = r4.length
            int r1 = r1 + r2
            int r1 = kotlin.collections.MapsKt__MapsJVMKt.mapCapacity(r1)
            r0.<init>(r1)
            r0.addAll(r3)
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r0, r4)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Set<T> plusElement(java.util.Set<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Set r1 = plus(r1, r2)
            return r1
    }
}
