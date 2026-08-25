package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class UsingToStringOrdering extends com.google.common.collect.Ordering<java.lang.Object> implements java.io.Serializable {
    public static final com.google.common.collect.UsingToStringOrdering INSTANCE = null;
    private static final long serialVersionUID = 0;

    static {
            com.google.common.collect.UsingToStringOrdering r0 = new com.google.common.collect.UsingToStringOrdering
            r0.<init>()
            com.google.common.collect.UsingToStringOrdering.INSTANCE = r0
            return
    }

    private UsingToStringOrdering() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object readResolve() {
            r1 = this;
            com.google.common.collect.UsingToStringOrdering r0 = com.google.common.collect.UsingToStringOrdering.INSTANCE
            return r0
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r2.toString()
            int r1 = r1.compareTo(r2)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Ordering.usingToString()"
            return r0
    }
}
