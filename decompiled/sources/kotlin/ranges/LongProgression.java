package kotlin.ranges;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "(JJJ)V", "first", "getFirst", "()J", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "Lkotlin/collections/LongIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class LongProgression implements java.lang.Iterable<java.lang.Long>, kotlin.jvm.internal.markers.KMappedMarker {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.LongProgression.Companion Companion = null;
    private final long first;
    private final long last;
    private final long step;

    /* JADX INFO: compiled from: Progressions.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/LongProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.ranges.LongProgression fromClosedRange(long r9, long r11, long r13) {
                r8 = this;
                kotlin.ranges.LongProgression r7 = new kotlin.ranges.LongProgression
                r0 = r7
                r1 = r9
                r3 = r11
                r5 = r13
                r0.<init>(r1, r3, r5)
                return r7
        }
    }

    static {
            kotlin.ranges.LongProgression$Companion r0 = new kotlin.ranges.LongProgression$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.LongProgression.Companion = r0
            return
    }

    public LongProgression(long r4, long r6, long r8) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L22
            r0 = -9223372036854775808
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L1a
            r3.first = r4
            long r4 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(r4, r6, r8)
            r3.last = r4
            r3.step = r8
            return
        L1a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Step must be greater than Long.MIN_VALUE to avoid overflow on negation."
            r4.<init>(r5)
            throw r4
        L22:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Step must be non-zero."
            r4.<init>(r5)
            throw r4
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlin.ranges.LongProgression
            if (r0 == 0) goto L2f
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.ranges.LongProgression r0 = (kotlin.ranges.LongProgression) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            long r0 = r5.first
            kotlin.ranges.LongProgression r6 = (kotlin.ranges.LongProgression) r6
            long r2 = r6.first
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            long r0 = r5.last
            long r2 = r6.last
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            long r0 = r5.step
            long r2 = r6.step
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L2f
        L2d:
            r6 = 1
            goto L30
        L2f:
            r6 = 0
        L30:
            return r6
    }

    public final long getFirst() {
            r2 = this;
            long r0 = r2.first
            return r0
    }

    public final long getLast() {
            r2 = this;
            long r0 = r2.last
            return r0
    }

    public final long getStep() {
            r2 = this;
            long r0 = r2.step
            return r0
    }

    public int hashCode() {
            r9 = this;
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L23
        L8:
            r0 = 31
            long r0 = (long) r0
            long r2 = r9.first
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            long r2 = r2 * r0
            long r5 = r9.last
            long r7 = r5 >>> r4
            long r5 = r5 ^ r7
            long r2 = r2 + r5
            long r2 = r2 * r0
            long r0 = r9.step
            long r4 = r0 >>> r4
            long r0 = r0 ^ r4
            long r2 = r2 + r0
            int r0 = (int) r2
        L23:
            return r0
    }

    public boolean isEmpty() {
            r7 = this;
            long r0 = r7.step
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            long r0 = r7.first
            long r4 = r7.last
            if (r6 <= 0) goto L13
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L18
            goto L19
        L13:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L18
            goto L19
        L18:
            r2 = 0
        L19:
            return r2
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Long> iterator() {
            r1 = this;
            kotlin.collections.LongIterator r0 = r1.iterator2()
            return r0
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public java.util.Iterator<java.lang.Long> iterator2() {
            r8 = this;
            kotlin.ranges.LongProgressionIterator r7 = new kotlin.ranges.LongProgressionIterator
            long r1 = r8.first
            long r3 = r8.last
            long r5 = r8.step
            r0 = r7
            r0.<init>(r1, r3, r5)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r6 = this;
            long r0 = r6.step
            java.lang.String r2 = " step "
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r5 <= 0) goto L24
            r0.<init>()
            long r3 = r6.first
            r0.append(r3)
            java.lang.String r1 = ".."
            r0.append(r1)
            long r3 = r6.last
            r0.append(r3)
            r0.append(r2)
            long r1 = r6.step
            goto L3c
        L24:
            r0.<init>()
            long r3 = r6.first
            r0.append(r3)
            java.lang.String r1 = " downTo "
            r0.append(r1)
            long r3 = r6.last
            r0.append(r3)
            r0.append(r2)
            long r1 = r6.step
            long r1 = -r1
        L3c:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
