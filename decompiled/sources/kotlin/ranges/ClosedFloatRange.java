package kotlin.ranges;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ClosedFloatRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "endInclusive", "(FF)V", "_endInclusive", "_start", "getEndInclusive", "()Ljava/lang/Float;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", "a", "b", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class ClosedFloatRange implements kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> {
    private final float _endInclusive;
    private final float _start;

    public ClosedFloatRange(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0._start = r1
            r0._endInclusive = r2
            return
    }

    public boolean contains(float r2) {
            r1 = this;
            float r0 = r1._start
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Le
            float r0 = r1._endInclusive
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r1) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            boolean r1 = r0.contains(r1)
            return r1
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlin.ranges.ClosedFloatRange
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L32
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L15
            r0 = r5
            kotlin.ranges.ClosedFloatRange r0 = (kotlin.ranges.ClosedFloatRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L33
        L15:
            float r0 = r4._start
            kotlin.ranges.ClosedFloatRange r5 = (kotlin.ranges.ClosedFloatRange) r5
            float r3 = r5._start
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L32
            float r0 = r4._endInclusive
            float r5 = r5._endInclusive
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L2e
            r5 = 1
            goto L2f
        L2e:
            r5 = 0
        L2f:
            if (r5 == 0) goto L32
            goto L33
        L32:
            r1 = 0
        L33:
            return r1
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndInclusive() {
            r1 = this;
            java.lang.Float r0 = r1.getEndInclusive()
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    @org.jetbrains.annotations.NotNull
    public java.lang.Float getEndInclusive() {
            r1 = this;
            float r0 = r1._endInclusive
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r1 = this;
            java.lang.Float r0 = r1.getStart()
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    @org.jetbrains.annotations.NotNull
    public java.lang.Float getStart() {
            r1 = this;
            float r0 = r1._start
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L1f
        L8:
            float r0 = r2._start
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            float r1 = r2._endInclusive
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L1f:
            return r0
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
            r2 = this;
            float r0 = r2._start
            float r1 = r2._endInclusive
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public boolean lessThanOrEquals(float r1, float r2) {
            r0 = this;
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(java.lang.Comparable r1, java.lang.Comparable r2) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            boolean r1 = r0.lessThanOrEquals(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2._start
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            float r1 = r2._endInclusive
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
