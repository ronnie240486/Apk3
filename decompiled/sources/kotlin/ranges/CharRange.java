package kotlin.ranges;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(CC)V", "getEndInclusive", "()Ljava/lang/Character;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CharRange extends kotlin.ranges.CharProgression implements kotlin.ranges.ClosedRange<java.lang.Character> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.CharRange.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.ranges.CharRange EMPTY = null;

    /* JADX INFO: compiled from: Ranges.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/CharRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/CharRange;", "getEMPTY", "()Lkotlin/ranges/CharRange;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
        public final kotlin.ranges.CharRange getEMPTY() {
                r1 = this;
                kotlin.ranges.CharRange r0 = kotlin.ranges.CharRange.access$getEMPTY$cp()
                return r0
        }
    }

    static {
            kotlin.ranges.CharRange$Companion r0 = new kotlin.ranges.CharRange$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.ranges.CharRange.Companion = r0
            kotlin.ranges.CharRange r0 = new kotlin.ranges.CharRange
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.ranges.CharRange.EMPTY = r0
            return
    }

    public CharRange(char r2, char r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public static final /* synthetic */ kotlin.ranges.CharRange access$getEMPTY$cp() {
            kotlin.ranges.CharRange r0 = kotlin.ranges.CharRange.EMPTY
            return r0
    }

    public boolean contains(char r2) {
            r1 = this;
            char r0 = r1.getFirst()
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r2)
            if (r0 > 0) goto L16
            char r0 = r1.getLast()
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r2, r0)
            if (r2 > 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable r1) {
            r0 = this;
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            boolean r1 = r0.contains(r1)
            return r1
    }

    @Override // kotlin.ranges.CharProgression
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.CharRange
            if (r0 == 0) goto L2b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            kotlin.ranges.CharRange r0 = (kotlin.ranges.CharRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
        L13:
            char r0 = r2.getFirst()
            kotlin.ranges.CharRange r3 = (kotlin.ranges.CharRange) r3
            char r1 = r3.getFirst()
            if (r0 != r1) goto L2b
            char r0 = r2.getLast()
            char r3 = r3.getLast()
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
    @org.jetbrains.annotations.NotNull
    public java.lang.Character getEndInclusive() {
            r1 = this;
            char r0 = r1.getLast()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getEndInclusive() {
            r1 = this;
            java.lang.Character r0 = r1.getEndInclusive()
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    @org.jetbrains.annotations.NotNull
    public java.lang.Character getStart() {
            r1 = this;
            char r0 = r1.getFirst()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
            r1 = this;
            java.lang.Character r0 = r1.getStart()
            return r0
    }

    @Override // kotlin.ranges.CharProgression
    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L13
        L8:
            char r0 = r2.getFirst()
            int r0 = r0 * 31
            char r1 = r2.getLast()
            int r0 = r0 + r1
        L13:
            return r0
    }

    @Override // kotlin.ranges.CharProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
            r2 = this;
            char r0 = r2.getFirst()
            char r1 = r2.getLast()
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // kotlin.ranges.CharProgression
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r2.getFirst()
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            char r1 = r2.getLast()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
