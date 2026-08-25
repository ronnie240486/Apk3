package kotlin.jvm.internal;

/* JADX INFO: compiled from: CollectionToArray.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\f\u001a~\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00112(\u0010\u0012\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0013H\u0082\b¢\u0006\u0002\u0010\u0014\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmName(name = "CollectionToArray")
public final class CollectionToArray {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.Object[] EMPTY = null;
    private static final int MAX_SIZE = 2147483645;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            kotlin.jvm.internal.CollectionToArray.EMPTY = r0
            return
    }

    @kotlin.jvm.JvmName(name = "toArray")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object[] toArray(@org.jetbrains.annotations.NotNull java.util.Collection<?> r4) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.size()
            if (r0 != 0) goto Le
        Lb:
            java.lang.Object[] r4 = kotlin.jvm.internal.CollectionToArray.EMPTY
            goto L5f
        Le:
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L19
            goto Lb
        L19:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L1c:
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            r0[r1] = r3
            int r1 = r0.length
            if (r2 < r1) goto L50
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L2f
            r4 = r0
            goto L5f
        L2f:
            int r1 = r2 * 3
            int r1 = r1 + 1
            int r1 = r1 >>> 1
            r3 = 2147483645(0x7ffffffd, float:NaN)
            if (r1 > r2) goto L46
            if (r2 >= r3) goto L40
            r1 = 2147483645(0x7ffffffd, float:NaN)
            goto L46
        L40:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
        L46:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(result, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L60
        L50:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L60
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r0 = "copyOf(result, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
        L5f:
            return r4
        L60:
            r1 = r2
            goto L1c
    }

    @kotlin.jvm.JvmName(name = "toArray")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object[] toArray(@org.jetbrains.annotations.NotNull java.util.Collection<?> r5, @org.jetbrains.annotations.Nullable java.lang.Object[] r6) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Objects.requireNonNull(r6)
            int r0 = r5.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L17
            int r5 = r6.length
            if (r5 <= 0) goto L88
            r6[r2] = r1
            goto L88
        L17:
            java.util.Iterator r5 = r5.iterator()
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L27
            int r5 = r6.length
            if (r5 <= 0) goto L88
            r6[r2] = r1
            goto L88
        L27:
            int r3 = r6.length
            if (r0 > r3) goto L2c
            r0 = r6
            goto L3f
        L2c:
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L3f:
            int r3 = r2 + 1
            java.lang.Object r4 = r5.next()
            r0[r2] = r4
            int r2 = r0.length
            if (r3 < r2) goto L73
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L52
            r6 = r0
            goto L88
        L52:
            int r2 = r3 * 3
            int r2 = r2 + 1
            int r2 = r2 >>> 1
            r4 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 > r3) goto L69
            if (r3 >= r4) goto L63
            r2 = 2147483645(0x7ffffffd, float:NaN)
            goto L69
        L63:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
        L69:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "copyOf(result, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            goto L89
        L73:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L89
            if (r0 != r6) goto L7e
            r6[r3] = r1
            goto L88
        L7e:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r6 = "copyOf(result, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r6 = r5
        L88:
            return r6
        L89:
            r2 = r3
            goto L3f
    }

    private static final java.lang.Object[] toArrayImpl(java.util.Collection<?> r2, kotlin.jvm.functions.Function0<java.lang.Object[]> r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Object[]> r4, kotlin.jvm.functions.Function2<? super java.lang.Object[], ? super java.lang.Integer, java.lang.Object[]> r5) {
            int r0 = r2.size()
            if (r0 != 0) goto Ld
            java.lang.Object r2 = r3.invoke()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
        Ld:
            java.util.Iterator r2 = r2.iterator()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1e
            java.lang.Object r2 = r3.invoke()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
        L1e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r4.invoke(r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
        L29:
            int r0 = r4 + 1
            java.lang.Object r1 = r2.next()
            r3[r4] = r1
            int r4 = r3.length
            if (r0 < r4) goto L5c
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L3b
            return r3
        L3b:
            int r4 = r0 * 3
            int r4 = r4 + 1
            int r4 = r4 >>> 1
            r1 = 2147483645(0x7ffffffd, float:NaN)
            if (r4 > r0) goto L52
            if (r0 >= r1) goto L4c
            r4 = 2147483645(0x7ffffffd, float:NaN)
            goto L52
        L4c:
            java.lang.OutOfMemoryError r2 = new java.lang.OutOfMemoryError
            r2.<init>()
            throw r2
        L52:
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.lang.String r4 = "copyOf(result, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            goto L6d
        L5c:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L6d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r5.invoke(r3, r2)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
        L6d:
            r4 = r0
            goto L29
    }
}
