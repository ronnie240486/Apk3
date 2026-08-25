package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class NullsLastOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final com.google.common.collect.Ordering<? super T> ordering;

    public NullsLastOrdering(com.google.common.collect.Ordering<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.ordering = r1
            return
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@javax.annotation.CheckForNull T r2, @javax.annotation.CheckForNull T r3) {
            r1 = this;
            if (r2 != r3) goto L4
            r2 = 0
            return r2
        L4:
            if (r2 != 0) goto L8
            r2 = 1
            return r2
        L8:
            if (r3 != 0) goto Lc
            r2 = -1
            return r2
        Lc:
            com.google.common.collect.Ordering<? super T> r0 = r1.ordering
            int r2 = r0.compare(r2, r3)
            return r2
    }

    @Override // java.util.Comparator
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.NullsLastOrdering
            if (r0 == 0) goto L13
            com.google.common.collect.NullsLastOrdering r2 = (com.google.common.collect.NullsLastOrdering) r2
            com.google.common.collect.Ordering<? super T> r0 = r1.ordering
            com.google.common.collect.Ordering<? super T> r2 = r2.ordering
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            com.google.common.collect.Ordering<? super T> r0 = r2.ordering
            int r0 = r0.hashCode()
            r1 = -921210296(0xffffffffc9177248, float:-620324.5)
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> com.google.common.collect.Ordering<S> nullsFirst() {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.ordering
            com.google.common.collect.Ordering r0 = r0.nullsFirst()
            return r0
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> com.google.common.collect.Ordering<S> nullsLast() {
            r0 = this;
            return r0
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> com.google.common.collect.Ordering<S> reverse() {
            r1 = this;
            com.google.common.collect.Ordering<? super T> r0 = r1.ordering
            com.google.common.collect.Ordering r0 = r0.reverse()
            com.google.common.collect.Ordering r0 = r0.nullsFirst()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.common.collect.Ordering<? super T> r0 = r3.ordering
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 12
            java.lang.String r2 = ".nullsLast()"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r0, r2)
            return r0
    }
}
