package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractMapEntry<K, V> implements java.util.Map.Entry<K, V> {
    public AbstractMapEntry() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Map.Entry
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L24
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r2 = r4.getKey()
            boolean r0 = com.google.common.base.Objects.equal(r0, r2)
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.getValue()
            java.lang.Object r4 = r4.getValue()
            boolean r4 = com.google.common.base.Objects.equal(r0, r4)
            if (r4 == 0) goto L24
            r1 = 1
        L24:
            return r1
    }

    @Override // java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r1 = r3.getValue()
            r2 = 0
            if (r0 != 0) goto Ld
            r0 = 0
            goto L11
        Ld:
            int r0 = r0.hashCode()
        L11:
            if (r1 != 0) goto L14
            goto L18
        L14:
            int r2 = r1.hashCode()
        L18:
            r0 = r0 ^ r2
            return r0
    }

    @Override // java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public V setValue(@com.google.common.collect.ParametricNullness V r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.Object r0 = r4.getKey()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r4.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r0.length()
            int r2 = r2 + 1
            int r3 = r1.length()
            int r3 = r3 + r2
            java.lang.String r2 = "="
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2, r1)
            return r0
    }
}
