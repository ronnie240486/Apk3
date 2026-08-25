package kotlin.ranges;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.SinceKotlin(version = "1.5")
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "start", "endInclusive", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndInclusive-s-VKNKU", "()J", "getStart-s-VKNKU", "contains", "", "value", "contains-VKZWuLQ", "(J)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
public final class ULongRange extends kotlin.ranges.ULongProgression implements kotlin.ranges.ClosedRange<kotlin.ULong> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.ULongRange.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.ranges.ULongRange EMPTY = null;

    /* JADX INFO: compiled from: ULongRange.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
        public final kotlin.ranges.ULongRange getEMPTY() {
                r1 = this;
                kotlin.ranges.ULongRange r0 = kotlin.ranges.ULongRange.access$getEMPTY$cp()
                return r0
        }
    }

    static {
            kotlin.ranges.ULongRange$Companion r0 = new kotlin.ranges.ULongRange$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.ULongRange.Companion = r0
            kotlin.ranges.ULongRange r0 = new kotlin.ranges.ULongRange
            r3 = -1
            r5 = 0
            r7 = 0
            r2 = r0
            r2.<init>(r3, r5, r7)
            kotlin.ranges.ULongRange.EMPTY = r0
            return
    }

    private ULongRange(long r9, long r11) {
            r8 = this;
            r5 = 1
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r0.<init>(r1, r3, r5, r7)
            return
    }

    public /* synthetic */ ULongRange(long r1, long r3, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    public static final /* synthetic */ kotlin.ranges.ULongRange access$getEMPTY$cp() {
            kotlin.ranges.ULongRange r0 = kotlin.ranges.ULongRange.EMPTY
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r3) {
            r2 = this;
            kotlin.ULong r3 = (kotlin.ULong) r3
            long r0 = r3.m556unboximpl()
            boolean r3 = r2.m1569containsVKZWuLQ(r0)
            return r3
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m1569containsVKZWuLQ(long r3) {
            r2 = this;
            long r0 = r2.m1565getFirstsVKNKU()
            int r0 = kotlin.UnsignedKt.ulongCompare(r0, r3)
            if (r0 > 0) goto L16
            long r0 = r2.m1566getLastsVKNKU()
            int r3 = kotlin.UnsignedKt.ulongCompare(r3, r0)
            if (r3 > 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }

    @Override // kotlin.ranges.ULongProgression
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlin.ranges.ULongRange
            if (r0 == 0) goto L2f
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.ranges.ULongRange r0 = (kotlin.ranges.ULongRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
        L13:
            long r0 = r5.m1565getFirstsVKNKU()
            kotlin.ranges.ULongRange r6 = (kotlin.ranges.ULongRange) r6
            long r2 = r6.m1565getFirstsVKNKU()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            long r0 = r5.m1566getLastsVKNKU()
            long r2 = r6.m1566getLastsVKNKU()
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

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndInclusive() {
            r2 = this;
            long r0 = r2.m1570getEndInclusivesVKNKU()
            kotlin.ULong r0 = kotlin.ULong.m499boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: getEndInclusive-s-VKNKU, reason: not valid java name */
    public long m1570getEndInclusivesVKNKU() {
            r2 = this;
            long r0 = r2.m1566getLastsVKNKU()
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r2 = this;
            long r0 = r2.m1571getStartsVKNKU()
            kotlin.ULong r0 = kotlin.ULong.m499boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: getStart-s-VKNKU, reason: not valid java name */
    public long m1571getStartsVKNKU() {
            r2 = this;
            long r0 = r2.m1565getFirstsVKNKU()
            return r0
    }

    @Override // kotlin.ranges.ULongProgression
    public int hashCode() {
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L34
        L8:
            long r0 = r7.m1565getFirstsVKNKU()
            long r2 = r7.m1565getFirstsVKNKU()
            r4 = 32
            long r2 = r2 >>> r4
            long r2 = kotlin.ULong.m505constructorimpl(r2)
            long r0 = r0 ^ r2
            long r0 = kotlin.ULong.m505constructorimpl(r0)
            int r1 = (int) r0
            int r1 = r1 * 31
            long r2 = r7.m1566getLastsVKNKU()
            long r5 = r7.m1566getLastsVKNKU()
            long r4 = r5 >>> r4
            long r4 = kotlin.ULong.m505constructorimpl(r4)
            long r2 = r2 ^ r4
            long r2 = kotlin.ULong.m505constructorimpl(r2)
            int r0 = (int) r2
            int r0 = r0 + r1
        L34:
            return r0
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
            r4 = this;
            long r0 = r4.m1565getFirstsVKNKU()
            long r2 = r4.m1566getLastsVKNKU()
            int r0 = kotlin.UnsignedKt.ulongCompare(r0, r2)
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // kotlin.ranges.ULongProgression
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.m1565getFirstsVKNKU()
            java.lang.String r1 = kotlin.ULong.m550toStringimpl(r1)
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            long r1 = r3.m1566getLastsVKNKU()
            java.lang.String r1 = kotlin.ULong.m550toStringimpl(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
