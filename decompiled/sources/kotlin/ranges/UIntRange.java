package kotlin.ranges;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.SinceKotlin(version = "1.5")
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/UIntRange;", "Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/UInt;", "start", "endInclusive", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndInclusive-pVg5ArA", "()I", "getStart-pVg5ArA", "contains", "", "value", "contains-WZ4Q5Ns", "(I)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
public final class UIntRange extends kotlin.ranges.UIntProgression implements kotlin.ranges.ClosedRange<kotlin.UInt> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.UIntRange.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.ranges.UIntRange EMPTY = null;

    /* JADX INFO: compiled from: UIntRange.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/UIntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/UIntRange;", "getEMPTY", "()Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
        public final kotlin.ranges.UIntRange getEMPTY() {
                r1 = this;
                kotlin.ranges.UIntRange r0 = kotlin.ranges.UIntRange.access$getEMPTY$cp()
                return r0
        }
    }

    static {
            kotlin.ranges.UIntRange$Companion r0 = new kotlin.ranges.UIntRange$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.UIntRange.Companion = r0
            kotlin.ranges.UIntRange r0 = new kotlin.ranges.UIntRange
            r2 = -1
            r3 = 0
            r0.<init>(r2, r3, r1)
            kotlin.ranges.UIntRange.EMPTY = r0
            return
    }

    private UIntRange(int r3, int r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public /* synthetic */ UIntRange(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static final /* synthetic */ kotlin.ranges.UIntRange access$getEMPTY$cp() {
            kotlin.ranges.UIntRange r0 = kotlin.ranges.UIntRange.EMPTY
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r1) {
            r0 = this;
            kotlin.UInt r1 = (kotlin.UInt) r1
            int r1 = r1.m478unboximpl()
            boolean r1 = r0.m1562containsWZ4Q5Ns(r1)
            return r1
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m1562containsWZ4Q5Ns(int r2) {
            r1 = this;
            int r0 = r1.m1558getFirstpVg5ArA()
            int r0 = kotlin.UnsignedKt.uintCompare(r0, r2)
            if (r0 > 0) goto L16
            int r0 = r1.m1559getLastpVg5ArA()
            int r2 = kotlin.UnsignedKt.uintCompare(r2, r0)
            if (r2 > 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Override // kotlin.ranges.UIntProgression
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.UIntRange
            if (r0 == 0) goto L2b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.UIntRange r0 = (kotlin.ranges.UIntRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
        L13:
            int r0 = r2.m1558getFirstpVg5ArA()
            kotlin.ranges.UIntRange r3 = (kotlin.ranges.UIntRange) r3
            int r1 = r3.m1558getFirstpVg5ArA()
            if (r0 != r1) goto L2b
            int r0 = r2.m1559getLastpVg5ArA()
            int r3 = r3.m1559getLastpVg5ArA()
            if (r0 != r3) goto L2b
        L29:
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            return r3
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndInclusive() {
            r1 = this;
            int r0 = r1.m1563getEndInclusivepVg5ArA()
            kotlin.UInt r0 = kotlin.UInt.m421boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: getEndInclusive-pVg5ArA, reason: not valid java name */
    public int m1563getEndInclusivepVg5ArA() {
            r1 = this;
            int r0 = r1.m1559getLastpVg5ArA()
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r1 = this;
            int r0 = r1.m1564getStartpVg5ArA()
            kotlin.UInt r0 = kotlin.UInt.m421boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: getStart-pVg5ArA, reason: not valid java name */
    public int m1564getStartpVg5ArA() {
            r1 = this;
            int r0 = r1.m1558getFirstpVg5ArA()
            return r0
    }

    @Override // kotlin.ranges.UIntProgression
    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L13
        L8:
            int r0 = r2.m1558getFirstpVg5ArA()
            int r0 = r0 * 31
            int r1 = r2.m1559getLastpVg5ArA()
            int r0 = r0 + r1
        L13:
            return r0
    }

    @Override // kotlin.ranges.UIntProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
            r2 = this;
            int r0 = r2.m1558getFirstpVg5ArA()
            int r1 = r2.m1559getLastpVg5ArA()
            int r0 = kotlin.UnsignedKt.uintCompare(r0, r1)
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // kotlin.ranges.UIntProgression
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.m1558getFirstpVg5ArA()
            java.lang.String r1 = kotlin.UInt.m472toStringimpl(r1)
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r1 = r2.m1559getLastpVg5ArA()
            java.lang.String r1 = kotlin.UInt.m472toStringimpl(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
