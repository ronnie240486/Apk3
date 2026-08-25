package kotlin.collections;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, k = 4, mv = {1, 7, 1}, xi = 49)
public final class CollectionsKt extends kotlin.collections.CollectionsKt___CollectionsKt {
    private CollectionsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* bridge */ /* synthetic */ int binarySearch$default(java.util.List r6, java.lang.Comparable r7) {
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r6
            r1 = r7
            int r6 = kotlin.collections.CollectionsKt__CollectionsKt.binarySearch$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @kotlin.PublishedApi
    public static /* bridge */ /* synthetic */ int collectionSizeOrDefault(@org.jetbrains.annotations.NotNull java.lang.Iterable r1) {
            r0 = 10
            int r1 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static /* bridge */ /* synthetic */ java.util.List dropLast(@org.jetbrains.annotations.NotNull java.util.List r1) {
            r0 = 1
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.dropLast(r1, r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ java.lang.Appendable joinTo$default(java.lang.Iterable r10, java.lang.Appendable r11, java.lang.CharSequence r12) {
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 124(0x7c, float:1.74E-43)
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            java.lang.Appendable r10 = kotlin.collections.CollectionsKt___CollectionsKt.joinTo$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public static /* bridge */ /* synthetic */ java.lang.String joinToString$default(java.lang.Iterable r9, java.lang.CharSequence r10, java.lang.CharSequence r11, java.lang.CharSequence r12, kotlin.jvm.functions.Function1 r13, int r14) {
            r4 = 0
            r5 = 0
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r13
            r7 = r14
            java.lang.String r9 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }
}
