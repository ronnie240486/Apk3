package kotlin.ranges;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.SinceKotlin(version = "1.5")
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\"\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0086\u0002ø\u0001\u0000J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\b\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\n\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "start", "endInclusive", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "J", "last", "getStep", "()J", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
public class ULongProgression implements java.lang.Iterable<kotlin.ULong>, kotlin.jvm.internal.markers.KMappedMarker {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.ULongProgression.Companion Companion = null;
    private final long first;
    private final long last;
    private final long step;

    /* JADX INFO: compiled from: ULongRange.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/ULongProgression;", "rangeStart", "Lkotlin/ULong;", "rangeEnd", "step", "", "fromClosedRange-7ftBX0g", "(JJJ)Lkotlin/ranges/ULongProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
        /* JADX INFO: renamed from: fromClosedRange-7ftBX0g, reason: not valid java name */
        public final kotlin.ranges.ULongProgression m1567fromClosedRange7ftBX0g(long r10, long r12, long r14) {
                r9 = this;
                kotlin.ranges.ULongProgression r8 = new kotlin.ranges.ULongProgression
                r7 = 0
                r0 = r8
                r1 = r10
                r3 = r12
                r5 = r14
                r0.<init>(r1, r3, r5, r7)
                return r8
        }
    }

    static {
            kotlin.ranges.ULongProgression$Companion r0 = new kotlin.ranges.ULongProgression$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.ULongProgression.Companion = r0
            return
    }

    private ULongProgression(long r4, long r6, long r8) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L22
            r0 = -9223372036854775808
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L1a
            r3.first = r4
            long r4 = kotlin.internal.UProgressionUtilKt.m1543getProgressionLastElement7ftBX0g(r4, r6, r8)
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

    public /* synthetic */ ULongProgression(long r1, long r3, long r5, kotlin.jvm.internal.DefaultConstructorMarker r7) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlin.ranges.ULongProgression
            if (r0 == 0) goto L2f
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.ranges.ULongProgression r0 = (kotlin.ranges.ULongProgression) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            long r0 = r5.first
            kotlin.ranges.ULongProgression r6 = (kotlin.ranges.ULongProgression) r6
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

    /* JADX INFO: renamed from: getFirst-s-VKNKU, reason: not valid java name */
    public final long m1565getFirstsVKNKU() {
            r2 = this;
            long r0 = r2.first
            return r0
    }

    /* JADX INFO: renamed from: getLast-s-VKNKU, reason: not valid java name */
    public final long m1566getLastsVKNKU() {
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
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L33
        L8:
            long r0 = r7.first
            r2 = 32
            long r3 = r0 >>> r2
            long r3 = kotlin.ULong.m505constructorimpl(r3)
            long r0 = r0 ^ r3
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            int r1 = (int) r0
            int r1 = r1 * 31
            long r3 = r7.last
            long r5 = r3 >>> r2
            long r5 = kotlin.ULong.m505constructorimpl(r5)
            long r3 = r3 ^ r5
            long r3 = kotlin.ULong.m505constructorimpl(r3)
            int r0 = (int) r3
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r3 = r7.step
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r0 = (int) r2
            int r0 = r0 + r1
        L33:
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
            int r0 = kotlin.UnsignedKt.ulongCompare(r0, r4)
            if (r6 <= 0) goto L15
            if (r0 <= 0) goto L18
            goto L19
        L15:
            if (r0 >= 0) goto L18
            goto L19
        L18:
            r2 = 0
        L19:
            return r2
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public final java.util.Iterator<kotlin.ULong> iterator() {
            r9 = this;
            kotlin.ranges.ULongProgressionIterator r8 = new kotlin.ranges.ULongProgressionIterator
            long r1 = r9.first
            long r3 = r9.last
            long r5 = r9.step
            r7 = 0
            r0 = r8
            r0.<init>(r1, r3, r5, r7)
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r6 = this;
            long r0 = r6.step
            java.lang.String r2 = " step "
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r5 <= 0) goto L2c
            r0.<init>()
            long r3 = r6.first
            java.lang.String r1 = kotlin.ULong.m550toStringimpl(r3)
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            long r3 = r6.last
            java.lang.String r1 = kotlin.ULong.m550toStringimpl(r3)
            r0.append(r1)
            r0.append(r2)
            long r1 = r6.step
            goto L4c
        L2c:
            r0.<init>()
            long r3 = r6.first
            java.lang.String r1 = kotlin.ULong.m550toStringimpl(r3)
            r0.append(r1)
            java.lang.String r1 = " downTo "
            r0.append(r1)
            long r3 = r6.last
            java.lang.String r1 = kotlin.ULong.m550toStringimpl(r3)
            r0.append(r1)
            r0.append(r2)
            long r1 = r6.step
            long r1 = -r1
        L4c:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
