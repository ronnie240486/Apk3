package kotlin.collections.builders;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0001\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00012\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\t\u001a%\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\r\u001a-\u0010\u000e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0011\u001a9\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0002\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u001a\u001a/\u0010\u001b\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"arrayOfUninitializedElements", "", "E", "size", "", "(I)[Ljava/lang/Object;", "copyOfUninitializedElements", "T", "newSize", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "resetAt", "", "index", "([Ljava/lang/Object;I)V", "resetRange", "fromIndex", "toIndex", "([Ljava/lang/Object;II)V", "subarrayContentEquals", "", "offset", "length", "other", "", "([Ljava/lang/Object;IILjava/util/List;)Z", "subarrayContentHashCode", "([Ljava/lang/Object;II)I", "subarrayContentToString", "", "([Ljava/lang/Object;II)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ListBuilderKt {
    public static final /* synthetic */ boolean access$subarrayContentEquals(java.lang.Object[] r0, int r1, int r2, java.util.List r3) {
            boolean r0 = subarrayContentEquals(r0, r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ int access$subarrayContentHashCode(java.lang.Object[] r0, int r1, int r2) {
            int r0 = subarrayContentHashCode(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.String access$subarrayContentToString(java.lang.Object[] r0, int r1, int r2) {
            java.lang.String r0 = subarrayContentToString(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> E[] arrayOfUninitializedElements(int r1) {
            if (r1 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto La
            java.lang.Object[] r1 = new java.lang.Object[r1]
            return r1
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "capacity must be non-negative."
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> T[] copyOfUninitializedElements(@org.jetbrains.annotations.NotNull T[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            return r1
    }

    public static final <E> void resetAt(@org.jetbrains.annotations.NotNull E[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            r1[r2] = r0
            return
    }

    public static final <E> void resetRange(@org.jetbrains.annotations.NotNull E[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
        L5:
            if (r2 >= r3) goto Ld
            resetAt(r1, r2)
            int r2 = r2 + 1
            goto L5
        Ld:
            return
    }

    private static final <T> boolean subarrayContentEquals(T[] r4, int r5, int r6, java.util.List<?> r7) {
            int r0 = r7.size()
            r1 = 0
            if (r6 == r0) goto L8
            return r1
        L8:
            r0 = 0
        L9:
            if (r0 >= r6) goto L1d
            int r2 = r5 + r0
            r2 = r4[r2]
            java.lang.Object r3 = r7.get(r0)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L1a
            return r1
        L1a:
            int r0 = r0 + 1
            goto L9
        L1d:
            r4 = 1
            return r4
    }

    private static final <T> int subarrayContentHashCode(T[] r4, int r5, int r6) {
            r0 = 0
            r1 = 1
            r2 = 0
        L3:
            if (r2 >= r6) goto L17
            int r3 = r5 + r2
            r3 = r4[r3]
            int r1 = r1 * 31
            if (r3 == 0) goto L12
            int r3 = r3.hashCode()
            goto L13
        L12:
            r3 = 0
        L13:
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L3
        L17:
            return r1
    }

    private static final <T> java.lang.String subarrayContentToString(T[] r3, int r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        Lf:
            if (r1 >= r5) goto L22
            if (r1 <= 0) goto L18
            java.lang.String r2 = ", "
            r0.append(r2)
        L18:
            int r2 = r4 + r1
            r2 = r3[r2]
            r0.append(r2)
            int r1 = r1 + 1
            goto Lf
        L22:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "sb.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            return r3
    }
}
