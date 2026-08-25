package kotlin.collections;

/* JADX INFO: compiled from: GroupingJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\u001a0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u0005H\u0007\u001aZ\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\b*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\u00072\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\f\u0012\u0004\u0012\u0002H\b0\u000bH\u0081\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"eachCount", "", "K", "", "T", "Lkotlin/collections/Grouping;", "mapValuesInPlace", "", "R", "V", "f", "Lkotlin/Function1;", "", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/GroupingKt")
class GroupingKt__GroupingJVMKt {
    public GroupingKt__GroupingJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.NotNull
    public static final <T, K> java.util.Map<K, java.lang.Integer> eachCount(@org.jetbrains.annotations.NotNull kotlin.collections.Grouping<T, ? extends K> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r6.sourceIterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.lang.Object r2 = r6.keyOf(r2)
            java.lang.Object r3 = r0.get(r2)
            r4 = 1
            if (r3 != 0) goto L2b
            boolean r5 = r0.containsKey(r2)
            if (r5 != 0) goto L2b
            r5 = 1
            goto L2c
        L2b:
            r5 = 0
        L2c:
            if (r5 == 0) goto L33
            kotlin.jvm.internal.Ref$IntRef r3 = new kotlin.jvm.internal.Ref$IntRef
            r3.<init>()
        L33:
            kotlin.jvm.internal.Ref$IntRef r3 = (kotlin.jvm.internal.Ref.IntRef) r3
            int r5 = r3.element
            int r5 = r5 + r4
            r3.element = r5
            r0.put(r2, r3)
            goto Le
        L3e:
            java.util.Set r6 = r0.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L46:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            java.util.Map$Entry r2 = kotlin.jvm.internal.TypeIntrinsics.asMutableMapEntry(r1)
            java.lang.Object r1 = r1.getValue()
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            int r1 = r1.element
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.setValue(r1)
            goto L46
        L6b:
            java.util.Map r6 = kotlin.jvm.internal.TypeIntrinsics.asMutableMap(r0)
            return r6
    }

    @kotlin.PublishedApi
    @kotlin.internal.InlineOnly
    private static final <K, V, R> java.util.Map<K, R> mapValuesInPlace(java.util.Map<K, V> r3, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            java.util.Map$Entry r2 = kotlin.jvm.internal.TypeIntrinsics.asMutableMapEntry(r1)
            java.lang.Object r1 = r4.invoke(r1)
            r2.setValue(r1)
            goto L12
        L2f:
            java.util.Map r3 = kotlin.jvm.internal.TypeIntrinsics.asMutableMap(r3)
            return r3
    }
}
