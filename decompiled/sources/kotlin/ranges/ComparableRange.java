package kotlin.ranges;

import java.lang.Comparable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0005\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Lkotlin/ranges/ComparableRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "start", "endInclusive", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "getEndInclusive", "()Ljava/lang/Comparable;", "Ljava/lang/Comparable;", "getStart", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
class ComparableRange<T extends java.lang.Comparable<? super T>> implements kotlin.ranges.ClosedRange<T> {

    @org.jetbrains.annotations.NotNull
    private final T endInclusive;

    @org.jetbrains.annotations.NotNull
    private final T start;

    public ComparableRange(@org.jetbrains.annotations.NotNull T r2, @org.jetbrains.annotations.NotNull T r3) {
            r1 = this;
            java.lang.String r0 = "start"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "endInclusive"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.start = r2
            r1.endInclusive = r3
            return
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean contains(@org.jetbrains.annotations.NotNull T r1) {
            r0 = this;
            boolean r1 = kotlin.ranges.ClosedRange.DefaultImpls.contains(r0, r1)
            return r1
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.ComparableRange
            if (r0 == 0) goto L33
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.ComparableRange r0 = (kotlin.ranges.ComparableRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L31
        L13:
            java.lang.Comparable r0 = r2.getStart()
            kotlin.ranges.ComparableRange r3 = (kotlin.ranges.ComparableRange) r3
            java.lang.Comparable r1 = r3.getStart()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L33
            java.lang.Comparable r0 = r2.getEndInclusive()
            java.lang.Comparable r3 = r3.getEndInclusive()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L33
        L31:
            r3 = 1
            goto L34
        L33:
            r3 = 0
        L34:
            return r3
    }

    @Override // kotlin.ranges.ClosedRange
    @org.jetbrains.annotations.NotNull
    public T getEndInclusive() {
            r1 = this;
            T extends java.lang.Comparable<? super T> r0 = r1.endInclusive
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    @org.jetbrains.annotations.NotNull
    public T getStart() {
            r1 = this;
            T extends java.lang.Comparable<? super T> r0 = r1.start
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L1b
        L8:
            java.lang.Comparable r0 = r2.getStart()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Comparable r1 = r2.getEndInclusive()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L1b:
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean isEmpty() {
            r1 = this;
            boolean r0 = kotlin.ranges.ClosedRange.DefaultImpls.isEmpty(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Comparable r1 = r2.getStart()
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            java.lang.Comparable r1 = r2.getEndInclusive()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
