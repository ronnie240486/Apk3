package kotlin.collections;

/* JADX INFO: compiled from: BrittleContainsOptimization.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000\u001a,\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0000\u001a\u0018\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0002¨\u0006\u000b"}, d2 = {"convertToSetForSetOperation", "", "T", "", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "Lkotlin/sequences/Sequence;", "convertToSetForSetOperationWith", "source", "safeToConvertToSet", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class BrittleContainsOptimizationKt {
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Collection<T> convertToSetForSetOperation(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto Lc
            java.util.Collection r2 = (java.util.Collection) r2
            goto L2d
        Lc:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L20
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r1 = safeToConvertToSet(r0)
            if (r1 == 0) goto L1e
            java.util.HashSet r2 = kotlin.collections.CollectionsKt___CollectionsKt.toHashSet(r2)
            goto L2d
        L1e:
            r2 = r0
            goto L2d
        L20:
            boolean r0 = kotlin.collections.CollectionSystemProperties.brittleContainsOptimizationEnabled
            if (r0 == 0) goto L29
            java.util.HashSet r2 = kotlin.collections.CollectionsKt___CollectionsKt.toHashSet(r2)
            goto L2d
        L29:
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.toList(r2)
        L2d:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Collection<T> convertToSetForSetOperation(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = kotlin.collections.CollectionSystemProperties.brittleContainsOptimizationEnabled
            if (r0 == 0) goto Le
            java.util.HashSet r1 = kotlin.sequences.SequencesKt.toHashSet(r1)
            goto L12
        Le:
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r1)
        L12:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Collection<T> convertToSetForSetOperation(@org.jetbrains.annotations.NotNull T[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = kotlin.collections.CollectionSystemProperties.brittleContainsOptimizationEnabled
            if (r0 == 0) goto Le
            java.util.HashSet r1 = kotlin.collections.ArraysKt___ArraysKt.toHashSet(r1)
            goto L12
        Le:
            java.util.List r1 = kotlin.collections.ArraysKt___ArraysJvmKt.asList(r1)
        L12:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Collection<T> convertToSetForSetOperationWith(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto L12
            java.util.Collection r1 = (java.util.Collection) r1
            goto L43
        L12:
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L36
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L26
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r0 = 2
            if (r2 >= r0) goto L26
            java.util.Collection r1 = (java.util.Collection) r1
            goto L43
        L26:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r0 = safeToConvertToSet(r2)
            if (r0 == 0) goto L34
            java.util.HashSet r1 = kotlin.collections.CollectionsKt___CollectionsKt.toHashSet(r1)
            goto L43
        L34:
            r1 = r2
            goto L43
        L36:
            boolean r2 = kotlin.collections.CollectionSystemProperties.brittleContainsOptimizationEnabled
            if (r2 == 0) goto L3f
            java.util.HashSet r1 = kotlin.collections.CollectionsKt___CollectionsKt.toHashSet(r1)
            goto L43
        L3f:
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.toList(r1)
        L43:
            return r1
    }

    private static final <T> boolean safeToConvertToSet(java.util.Collection<? extends T> r2) {
            boolean r0 = kotlin.collections.CollectionSystemProperties.brittleContainsOptimizationEnabled
            if (r0 == 0) goto L11
            int r0 = r2.size()
            r1 = 2
            if (r0 <= r1) goto L11
            boolean r2 = r2 instanceof java.util.ArrayList
            if (r2 == 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
    }
}
