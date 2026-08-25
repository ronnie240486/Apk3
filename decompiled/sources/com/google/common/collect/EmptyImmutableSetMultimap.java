package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
class EmptyImmutableSetMultimap extends com.google.common.collect.ImmutableSetMultimap<java.lang.Object, java.lang.Object> {
    public static final com.google.common.collect.EmptyImmutableSetMultimap INSTANCE = null;
    private static final long serialVersionUID = 0;

    static {
            com.google.common.collect.EmptyImmutableSetMultimap r0 = new com.google.common.collect.EmptyImmutableSetMultimap
            r0.<init>()
            com.google.common.collect.EmptyImmutableSetMultimap.INSTANCE = r0
            return
    }

    private EmptyImmutableSetMultimap() {
            r3 = this;
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
            r1 = 0
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
    }

    private java.lang.Object readResolve() {
            r1 = this;
            com.google.common.collect.EmptyImmutableSetMultimap r0 = com.google.common.collect.EmptyImmutableSetMultimap.INSTANCE
            return r0
    }
}
