package kotlin;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0011\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\b\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001c"}, d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "getThird", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Triple<A, B, C> implements java.io.Serializable {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A r1, B r2, C r3) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r2
            r0.third = r3
            return
    }

    public static /* synthetic */ kotlin.Triple copy$default(kotlin.Triple r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            A r1 = r0.first
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            B r2 = r0.second
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            C r3 = r0.third
        L12:
            kotlin.Triple r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final A component1() {
            r1 = this;
            A r0 = r1.first
            return r0
    }

    public final B component2() {
            r1 = this;
            B r0 = r1.second
            return r0
    }

    public final C component3() {
            r1 = this;
            C r0 = r1.third
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.Triple<A, B, C> copy(A r2, B r3, C r4) {
            r1 = this;
            kotlin.Triple r0 = new kotlin.Triple
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.Triple
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.Triple r5 = (kotlin.Triple) r5
            A r1 = r4.first
            A r3 = r5.first
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            B r1 = r4.second
            B r3 = r5.second
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            C r1 = r4.third
            C r5 = r5.third
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final A getFirst() {
            r1 = this;
            A r0 = r1.first
            return r0
    }

    public final B getSecond() {
            r1 = this;
            B r0 = r1.second
            return r0
    }

    public final C getThird() {
            r1 = this;
            C r0 = r1.third
            return r0
    }

    public int hashCode() {
            r3 = this;
            A r0 = r3.first
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            B r2 = r3.second
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            C r2 = r3.third
            if (r2 != 0) goto L1f
            goto L23
        L1f:
            int r1 = r2.hashCode()
        L23:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            A r1 = r3.first
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            B r2 = r3.second
            r0.append(r2)
            r0.append(r1)
            C r1 = r3.third
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
