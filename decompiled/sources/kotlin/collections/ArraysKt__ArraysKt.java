package kotlin.collections;

/* JADX INFO: compiled from: Arrays.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00030\u0003¢\u0006\u0002\u0010\u0016\u001a;\u0010\u0017\u001a\u0002H\u0018\"\u0010\b\u0000\u0010\u0019*\u0006\u0012\u0002\b\u00030\u0003*\u0002H\u0018\"\u0004\b\u0001\u0010\u0018*\u0002H\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0002\u0010\u001e\u001aG\u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u00150 \"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00180 0\u0003¢\u0006\u0002\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"contentDeepEqualsImpl", "", "T", "", "other", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepToStringImpl", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringInternal", "", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", "", "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "flatten", "", "([[Ljava/lang/Object;)Ljava/util/List;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNullOrEmpty", "([Ljava/lang/Object;)Z", "unzip", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lkotlin/Pair;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/ArraysKt")
class ArraysKt__ArraysKt extends kotlin.collections.ArraysKt__ArraysJVMKt {
    public ArraysKt__ArraysKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @kotlin.jvm.JvmName(name = "contentDeepEquals")
    public static final <T> boolean contentDeepEquals(@org.jetbrains.annotations.Nullable T[] r7, @org.jetbrains.annotations.Nullable T[] r8) {
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L145
            if (r8 == 0) goto L145
            int r2 = r7.length
            int r3 = r8.length
            if (r2 == r3) goto Lf
            goto L145
        Lf:
            int r2 = r7.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L144
            r4 = r7[r3]
            r5 = r8[r3]
            if (r4 != r5) goto L1b
            goto L13f
        L1b:
            if (r4 == 0) goto L143
            if (r5 != 0) goto L21
            goto L143
        L21:
            boolean r6 = r4 instanceof java.lang.Object[]
            if (r6 == 0) goto L34
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L34
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r4 = contentDeepEquals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L34:
            boolean r6 = r4 instanceof byte[]
            if (r6 == 0) goto L47
            boolean r6 = r5 instanceof byte[]
            if (r6 == 0) goto L47
            byte[] r4 = (byte[]) r4
            byte[] r5 = (byte[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L47:
            boolean r6 = r4 instanceof short[]
            if (r6 == 0) goto L5a
            boolean r6 = r5 instanceof short[]
            if (r6 == 0) goto L5a
            short[] r4 = (short[]) r4
            short[] r5 = (short[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L5a:
            boolean r6 = r4 instanceof int[]
            if (r6 == 0) goto L6d
            boolean r6 = r5 instanceof int[]
            if (r6 == 0) goto L6d
            int[] r4 = (int[]) r4
            int[] r5 = (int[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L6d:
            boolean r6 = r4 instanceof long[]
            if (r6 == 0) goto L80
            boolean r6 = r5 instanceof long[]
            if (r6 == 0) goto L80
            long[] r4 = (long[]) r4
            long[] r5 = (long[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L80:
            boolean r6 = r4 instanceof float[]
            if (r6 == 0) goto L93
            boolean r6 = r5 instanceof float[]
            if (r6 == 0) goto L93
            float[] r4 = (float[]) r4
            float[] r5 = (float[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L93:
            boolean r6 = r4 instanceof double[]
            if (r6 == 0) goto La6
            boolean r6 = r5 instanceof double[]
            if (r6 == 0) goto La6
            double[] r4 = (double[]) r4
            double[] r5 = (double[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        La6:
            boolean r6 = r4 instanceof char[]
            if (r6 == 0) goto Lb9
            boolean r6 = r5 instanceof char[]
            if (r6 == 0) goto Lb9
            char[] r4 = (char[]) r4
            char[] r5 = (char[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        Lb9:
            boolean r6 = r4 instanceof boolean[]
            if (r6 == 0) goto Lcc
            boolean r6 = r5 instanceof boolean[]
            if (r6 == 0) goto Lcc
            boolean[] r4 = (boolean[]) r4
            boolean[] r5 = (boolean[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        Lcc:
            boolean r6 = r4 instanceof kotlin.UByteArray
            if (r6 == 0) goto Le7
            boolean r6 = r5 instanceof kotlin.UByteArray
            if (r6 == 0) goto Le7
            kotlin.UByteArray r4 = (kotlin.UByteArray) r4
            byte[] r4 = r4.m417unboximpl()
            kotlin.UByteArray r5 = (kotlin.UByteArray) r5
            byte[] r5 = r5.m417unboximpl()
            boolean r4 = kotlin.collections.unsigned.UArraysKt.m899contentEqualskV0jMPg(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        Le7:
            boolean r6 = r4 instanceof kotlin.UShortArray
            if (r6 == 0) goto L102
            boolean r6 = r5 instanceof kotlin.UShortArray
            if (r6 == 0) goto L102
            kotlin.UShortArray r4 = (kotlin.UShortArray) r4
            short[] r4 = r4.m677unboximpl()
            kotlin.UShortArray r5 = (kotlin.UShortArray) r5
            short[] r5 = r5.m677unboximpl()
            boolean r4 = kotlin.collections.unsigned.UArraysKt.m896contentEqualsFGO6Aew(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L102:
            boolean r6 = r4 instanceof kotlin.UIntArray
            if (r6 == 0) goto L11d
            boolean r6 = r5 instanceof kotlin.UIntArray
            if (r6 == 0) goto L11d
            kotlin.UIntArray r4 = (kotlin.UIntArray) r4
            int[] r4 = r4.m495unboximpl()
            kotlin.UIntArray r5 = (kotlin.UIntArray) r5
            int[] r5 = r5.m495unboximpl()
            boolean r4 = kotlin.collections.unsigned.UArraysKt.m897contentEqualsKJPZfPQ(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L11d:
            boolean r6 = r4 instanceof kotlin.ULongArray
            if (r6 == 0) goto L138
            boolean r6 = r5 instanceof kotlin.ULongArray
            if (r6 == 0) goto L138
            kotlin.ULongArray r4 = (kotlin.ULongArray) r4
            long[] r4 = r4.m573unboximpl()
            kotlin.ULongArray r5 = (kotlin.ULongArray) r5
            long[] r5 = r5.m573unboximpl()
            boolean r4 = kotlin.collections.unsigned.UArraysKt.m901contentEqualslec5QzE(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L138:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L13f:
            int r3 = r3 + 1
            goto L11
        L143:
            return r1
        L144:
            return r0
        L145:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.jvm.JvmName(name = "contentDeepToString")
    @org.jetbrains.annotations.NotNull
    @kotlin.PublishedApi
    public static final <T> java.lang.String contentDeepToString(@org.jetbrains.annotations.Nullable T[] r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "null"
            return r2
        L5:
            int r0 = r2.length
            r1 = 429496729(0x19999999, float:1.5881867E-23)
            int r0 = kotlin.ranges.RangesKt.coerceAtMost(r0, r1)
            int r0 = r0 * 5
            int r0 = r0 + 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            contentDeepToStringInternal$ArraysKt__ArraysKt(r2, r1, r0)
            java.lang.String r2 = r1.toString()
            java.lang.String r0 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
    }

    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] r5, java.lang.StringBuilder r6, java.util.List<java.lang.Object[]> r7) {
            boolean r0 = r7.contains(r5)
            if (r0 == 0) goto Lc
            java.lang.String r5 = "[...]"
            r6.append(r5)
            return
        Lc:
            r7.add(r5)
            r0 = 91
            r6.append(r0)
            r0 = 0
            int r1 = r5.length
        L16:
            if (r0 >= r1) goto L119
            if (r0 == 0) goto L1f
            java.lang.String r2 = ", "
            r6.append(r2)
        L1f:
            r2 = r5[r0]
            if (r2 != 0) goto L2a
            java.lang.String r2 = "null"
            r6.append(r2)
            goto L115
        L2a:
            boolean r3 = r2 instanceof java.lang.Object[]
            if (r3 == 0) goto L35
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            contentDeepToStringInternal$ArraysKt__ArraysKt(r2, r6, r7)
            goto L115
        L35:
            boolean r3 = r2 instanceof byte[]
            java.lang.String r4 = "toString(this)"
            if (r3 == 0) goto L4a
            byte[] r2 = (byte[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r6.append(r2)
            goto L115
        L4a:
            boolean r3 = r2 instanceof short[]
            if (r3 == 0) goto L5c
            short[] r2 = (short[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r6.append(r2)
            goto L115
        L5c:
            boolean r3 = r2 instanceof int[]
            if (r3 == 0) goto L6e
            int[] r2 = (int[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r6.append(r2)
            goto L115
        L6e:
            boolean r3 = r2 instanceof long[]
            if (r3 == 0) goto L80
            long[] r2 = (long[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r6.append(r2)
            goto L115
        L80:
            boolean r3 = r2 instanceof float[]
            if (r3 == 0) goto L92
            float[] r2 = (float[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r6.append(r2)
            goto L115
        L92:
            boolean r3 = r2 instanceof double[]
            if (r3 == 0) goto La4
            double[] r2 = (double[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r6.append(r2)
            goto L115
        La4:
            boolean r3 = r2 instanceof char[]
            if (r3 == 0) goto Lb5
            char[] r2 = (char[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r6.append(r2)
            goto L115
        Lb5:
            boolean r3 = r2 instanceof boolean[]
            if (r3 == 0) goto Lc6
            boolean[] r2 = (boolean[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r6.append(r2)
            goto L115
        Lc6:
            boolean r3 = r2 instanceof kotlin.UByteArray
            if (r3 == 0) goto Ld8
            kotlin.UByteArray r2 = (kotlin.UByteArray) r2
            byte[] r2 = r2.m417unboximpl()
            java.lang.String r2 = kotlin.collections.unsigned.UArraysKt.m913contentToString2csIQuQ(r2)
            r6.append(r2)
            goto L115
        Ld8:
            boolean r3 = r2 instanceof kotlin.UShortArray
            if (r3 == 0) goto Lea
            kotlin.UShortArray r2 = (kotlin.UShortArray) r2
            short[] r2 = r2.m677unboximpl()
            java.lang.String r2 = kotlin.collections.unsigned.UArraysKt.m917contentToStringd6D3K8(r2)
            r6.append(r2)
            goto L115
        Lea:
            boolean r3 = r2 instanceof kotlin.UIntArray
            if (r3 == 0) goto Lfc
            kotlin.UIntArray r2 = (kotlin.UIntArray) r2
            int[] r2 = r2.m495unboximpl()
            java.lang.String r2 = kotlin.collections.unsigned.UArraysKt.m916contentToStringXUkPCBk(r2)
            r6.append(r2)
            goto L115
        Lfc:
            boolean r3 = r2 instanceof kotlin.ULongArray
            if (r3 == 0) goto L10e
            kotlin.ULongArray r2 = (kotlin.ULongArray) r2
            long[] r2 = r2.m573unboximpl()
            java.lang.String r2 = kotlin.collections.unsigned.UArraysKt.m919contentToStringuLth9ew(r2)
            r6.append(r2)
            goto L115
        L10e:
            java.lang.String r2 = r2.toString()
            r6.append(r2)
        L115:
            int r0 = r0 + 1
            goto L16
        L119:
            r5 = 93
            r6.append(r5)
            int r5 = kotlin.collections.CollectionsKt__CollectionsKt.getLastIndex(r7)
            r7.remove(r5)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.List<T> flatten(@org.jetbrains.annotations.NotNull T[][] r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 0
            r3 = 0
        L9:
            if (r2 >= r0) goto L12
            r4 = r5[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L9
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            int r2 = r5.length
        L18:
            if (r1 >= r2) goto L22
            r3 = r5[r1]
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r0, r3)
            int r1 = r1 + 1
            goto L18
        L22:
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final java.lang.Object ifEmpty(java.lang.Object[] r1, kotlin.jvm.functions.Function0 r2) {
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1.length
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L11
            java.lang.Object r1 = r2.invoke()
        L11:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final boolean isNullOrEmpty(java.lang.Object[] r2) {
            r0 = 0
            r1 = 1
            if (r2 == 0) goto Lc
            int r2 = r2.length
            if (r2 != 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto Ld
        Lc:
            r0 = 1
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> unzip(@org.jetbrains.annotations.NotNull kotlin.Pair<? extends T, ? extends R>[] r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.length
            r1.<init>(r2)
            int r2 = r6.length
            r3 = 0
        L13:
            if (r3 >= r2) goto L28
            r4 = r6[r3]
            java.lang.Object r5 = r4.getFirst()
            r0.add(r5)
            java.lang.Object r4 = r4.getSecond()
            r1.add(r4)
            int r3 = r3 + 1
            goto L13
        L28:
            kotlin.Pair r6 = kotlin.TuplesKt.to(r0, r1)
            return r6
    }
}
