package kotlin.ranges;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.5")
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\"\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0086\u0002ø\u0001\u0000J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0013\u0010\b\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\n\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "start", "endInclusive", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "I", "last", "getStep", "()I", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
public class UIntProgression implements java.lang.Iterable<kotlin.UInt>, kotlin.jvm.internal.markers.KMappedMarker {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.UIntProgression.Companion Companion = null;
    private final int first;
    private final int last;
    private final int step;

    /* JADX INFO: compiled from: UIntRange.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/UIntProgression;", "rangeStart", "Lkotlin/UInt;", "rangeEnd", "step", "", "fromClosedRange-Nkh28Cs", "(III)Lkotlin/ranges/UIntProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
        /* JADX INFO: renamed from: fromClosedRange-Nkh28Cs, reason: not valid java name */
        public final kotlin.ranges.UIntProgression m1560fromClosedRangeNkh28Cs(int r3, int r4, int r5) {
                r2 = this;
                kotlin.ranges.UIntProgression r0 = new kotlin.ranges.UIntProgression
                r1 = 0
                r0.<init>(r3, r4, r5, r1)
                return r0
        }
    }

    static {
            kotlin.ranges.UIntProgression$Companion r0 = new kotlin.ranges.UIntProgression$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.UIntProgression.Companion = r0
            return
    }

    private UIntProgression(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L1c
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L14
            r1.first = r2
            int r2 = kotlin.internal.UProgressionUtilKt.m1544getProgressionLastElementNkh28Cs(r2, r3, r4)
            r1.last = r2
            r1.step = r4
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            r2.<init>(r3)
            throw r2
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Step must be non-zero."
            r2.<init>(r3)
            throw r2
    }

    public /* synthetic */ UIntProgression(int r1, int r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.UIntProgression
            if (r0 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.UIntProgression r0 = (kotlin.ranges.UIntProgression) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
        L13:
            int r0 = r2.first
            kotlin.ranges.UIntProgression r3 = (kotlin.ranges.UIntProgression) r3
            int r1 = r3.first
            if (r0 != r1) goto L29
            int r0 = r2.last
            int r1 = r3.last
            if (r0 != r1) goto L29
            int r0 = r2.step
            int r3 = r3.step
            if (r0 != r3) goto L29
        L27:
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            return r3
    }

    /* JADX INFO: renamed from: getFirst-pVg5ArA, reason: not valid java name */
    public final int m1558getFirstpVg5ArA() {
            r1 = this;
            int r0 = r1.first
            return r0
    }

    /* JADX INFO: renamed from: getLast-pVg5ArA, reason: not valid java name */
    public final int m1559getLastpVg5ArA() {
            r1 = this;
            int r0 = r1.last
            return r0
    }

    public final int getStep() {
            r1 = this;
            int r0 = r1.step
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L14
        L8:
            int r0 = r2.first
            int r0 = r0 * 31
            int r1 = r2.last
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.step
            int r0 = r0 + r1
        L14:
            return r0
    }

    public boolean isEmpty() {
            r4 = this;
            int r0 = r4.step
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L11
            int r0 = r4.first
            int r3 = r4.last
            int r0 = kotlin.UnsignedKt.uintCompare(r0, r3)
            if (r0 <= 0) goto L1c
            goto L1d
        L11:
            int r0 = r4.first
            int r3 = r4.last
            int r0 = kotlin.UnsignedKt.uintCompare(r0, r3)
            if (r0 >= 0) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public final java.util.Iterator<kotlin.UInt> iterator() {
            r5 = this;
            kotlin.ranges.UIntProgressionIterator r0 = new kotlin.ranges.UIntProgressionIterator
            int r1 = r5.first
            int r2 = r5.last
            int r3 = r5.step
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.step
            java.lang.String r1 = " step "
            if (r0 <= 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.first
            java.lang.String r2 = kotlin.UInt.m472toStringimpl(r2)
            r0.append(r2)
            java.lang.String r2 = ".."
            r0.append(r2)
            int r2 = r3.last
            java.lang.String r2 = kotlin.UInt.m472toStringimpl(r2)
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.step
            goto L4a
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.first
            java.lang.String r2 = kotlin.UInt.m472toStringimpl(r2)
            r0.append(r2)
            java.lang.String r2 = " downTo "
            r0.append(r2)
            int r2 = r3.last
            java.lang.String r2 = kotlin.UInt.m472toStringimpl(r2)
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.step
            int r1 = -r1
        L4a:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
