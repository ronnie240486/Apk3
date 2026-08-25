package kotlin.collections;

/* JADX INFO: compiled from: IndexedValue.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/collections/IndexedValue;", "T", "", "index", "", "value", "(ILjava/lang/Object;)V", "getIndex", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(ILjava/lang/Object;)Lkotlin/collections/IndexedValue;", "equals", "", "other", "hashCode", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IndexedValue<T> {
    private final int index;
    private final T value;

    public IndexedValue(int r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.index = r1
            r0.value = r2
            return
    }

    public static /* synthetic */ kotlin.collections.IndexedValue copy$default(kotlin.collections.IndexedValue r0, int r1, java.lang.Object r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            int r1 = r0.index
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            T r2 = r0.value
        Lc:
            kotlin.collections.IndexedValue r0 = r0.copy(r1, r2)
            return r0
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    public final T component2() {
            r1 = this;
            T r0 = r1.value
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.IndexedValue<T> copy(int r2, T r3) {
            r1 = this;
            kotlin.collections.IndexedValue r0 = new kotlin.collections.IndexedValue
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.collections.IndexedValue
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.collections.IndexedValue r5 = (kotlin.collections.IndexedValue) r5
            int r1 = r4.index
            int r3 = r5.index
            if (r1 == r3) goto L13
            return r2
        L13:
            T r1 = r4.value
            T r5 = r5.value
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    public final T getValue() {
            r1 = this;
            T r0 = r1.value
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.index
            int r0 = r0 * 31
            T r1 = r2.value
            if (r1 != 0) goto La
            r1 = 0
            goto Le
        La:
            int r1 = r1.hashCode()
        Le:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "IndexedValue(index="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r2.index
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            T r1 = r2.value
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
