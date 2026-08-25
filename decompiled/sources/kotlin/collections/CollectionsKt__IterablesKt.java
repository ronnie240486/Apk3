package kotlin.collections;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a \u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001¢\u0006\u0002\u0010\n\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a@\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\f0\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000f*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Iterable", "", "T", "iterator", "Lkotlin/Function0;", "", "collectionSizeOrDefault", "", "default", "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "flatten", "", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__IterablesKt extends kotlin.collections.CollectionsKt__CollectionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt__IterablesKt$Iterable$1, reason: invalid class name */
    /* JADX INFO: compiled from: Iterables.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 176)
    public static final class AnonymousClass1<T> implements java.lang.Iterable<T>, kotlin.jvm.internal.markers.KMappedMarker {
        public final /* synthetic */ kotlin.jvm.functions.Function0<java.util.Iterator<T>> $iterator;

        public AnonymousClass1(kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> r1) {
                r0 = this;
                r0.$iterator = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Iterable
        @org.jetbrains.annotations.NotNull
        public java.util.Iterator<T> iterator() {
                r1 = this;
                kotlin.jvm.functions.Function0<java.util.Iterator<T>> r0 = r1.$iterator
                java.lang.Object r0 = r0.invoke()
                java.util.Iterator r0 = (java.util.Iterator) r0
                return r0
        }
    }

    public CollectionsKt__IterablesKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Iterable<T> Iterable(kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> r1) {
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.collections.CollectionsKt__IterablesKt$Iterable$1 r0 = new kotlin.collections.CollectionsKt__IterablesKt$Iterable$1
            r0.<init>(r1)
            return r0
    }

    @kotlin.PublishedApi
    public static <T> int collectionSizeOrDefault(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lf
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r1.size()
        Lf:
            return r2
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Integer collectionSizeOrNull(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L14
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> flatten(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends java.lang.Iterable<? extends T>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r2.next()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r0, r1)
            goto Le
        L1e:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> unzip(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlin.Pair<? extends T, ? extends R>> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 10
            int r0 = collectionSizeOrDefault(r4, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r4.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r3 = r0.getFirst()
            r1.add(r3)
            java.lang.Object r0 = r0.getSecond()
            r2.add(r0)
            goto L19
        L34:
            kotlin.Pair r4 = kotlin.TuplesKt.to(r1, r2)
            return r4
    }
}
