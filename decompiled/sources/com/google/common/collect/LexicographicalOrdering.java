package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class LexicographicalOrdering<T> extends com.google.common.collect.Ordering<java.lang.Iterable<T>> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final java.util.Comparator<? super T> elementOrder;

    public LexicographicalOrdering(java.util.Comparator<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.elementOrder = r1
            return
    }

    public int compare(java.lang.Iterable<T> r4, java.lang.Iterable<T> r5) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L27
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L16
            r4 = 1
            return r4
        L16:
            java.util.Comparator<? super T> r0 = r3.elementOrder
            java.lang.Object r1 = r4.next()
            java.lang.Object r2 = r5.next()
            int r0 = r0.compare(r1, r2)
            if (r0 == 0) goto L8
            return r0
        L27:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L2f
            r4 = -1
            return r4
        L2f:
            r4 = 0
            return r4
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r1 = r0.compare(r1, r2)
            return r1
    }

    @Override // java.util.Comparator
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.LexicographicalOrdering
            if (r0 == 0) goto L13
            com.google.common.collect.LexicographicalOrdering r2 = (com.google.common.collect.LexicographicalOrdering) r2
            java.util.Comparator<? super T> r0 = r1.elementOrder
            java.util.Comparator<? super T> r2 = r2.elementOrder
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.util.Comparator<? super T> r0 = r2.elementOrder
            int r0 = r0.hashCode()
            r1 = 2075626741(0x7bb78cf5, float:1.9060985E36)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.util.Comparator<? super T> r0 = r3.elementOrder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 18
            java.lang.String r2 = ".lexicographical()"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r0, r2)
            return r0
    }
}
