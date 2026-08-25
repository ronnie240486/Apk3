package kotlin.time;

/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0018\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u0005HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lkotlin/time/TimedValue;", "T", "", "value", "duration", "Lkotlin/time/Duration;", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDuration-UwyO8pc", "()J", "J", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component2-UwyO8pc", "copy", "copy-RFiDyg4", "(Ljava/lang/Object;J)Lkotlin/time/TimedValue;", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.time.ExperimentalTime
public final class TimedValue<T> {
    private final long duration;
    private final T value;

    private TimedValue(T r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.duration = r2
            return
    }

    public /* synthetic */ TimedValue(java.lang.Object r1, long r2, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: copy-RFiDyg4$default, reason: not valid java name */
    public static /* synthetic */ kotlin.time.TimedValue m1797copyRFiDyg4$default(kotlin.time.TimedValue r0, java.lang.Object r1, long r2, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            T r1 = r0.value
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            long r2 = r0.duration
        Lc:
            kotlin.time.TimedValue r0 = r0.m1799copyRFiDyg4(r1, r2)
            return r0
    }

    public final T component1() {
            r1 = this;
            T r0 = r1.value
            return r0
    }

    /* JADX INFO: renamed from: component2-UwyO8pc, reason: not valid java name */
    public final long m1798component2UwyO8pc() {
            r2 = this;
            long r0 = r2.duration
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: copy-RFiDyg4, reason: not valid java name */
    public final kotlin.time.TimedValue<T> m1799copyRFiDyg4(T r3, long r4) {
            r2 = this;
            kotlin.time.TimedValue r0 = new kotlin.time.TimedValue
            r1 = 0
            r0.<init>(r3, r4, r1)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof kotlin.time.TimedValue
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.time.TimedValue r8 = (kotlin.time.TimedValue) r8
            T r1 = r7.value
            T r3 = r8.value
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.duration
            long r5 = r8.duration
            boolean r8 = kotlin.time.Duration.m1650equalsimpl0(r3, r5)
            if (r8 != 0) goto L22
            return r2
        L22:
            return r0
    }

    /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m1800getDurationUwyO8pc() {
            r2 = this;
            long r0 = r2.duration
            return r0
    }

    public final T getValue() {
            r1 = this;
            T r0 = r1.value
            return r0
    }

    public int hashCode() {
            r3 = this;
            T r0 = r3.value
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            long r1 = r3.duration
            int r1 = kotlin.time.Duration.m1673hashCodeimpl(r1)
            int r1 = r1 + r0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TimedValue(value="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            T r1 = r3.value
            r0.append(r1)
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r3.duration
            java.lang.String r1 = kotlin.time.Duration.m1694toStringimpl(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
