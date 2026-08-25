package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
class EmptyImmutableListMultimap extends com.google.common.collect.ImmutableListMultimap<java.lang.Object, java.lang.Object> {
    public static final com.google.common.collect.EmptyImmutableListMultimap INSTANCE = null;
    private static final long serialVersionUID = 0;

    static {
            com.google.common.collect.EmptyImmutableListMultimap r0 = new com.google.common.collect.EmptyImmutableListMultimap
            r0.<init>()
            com.google.common.collect.EmptyImmutableListMultimap.INSTANCE = r0
            return
    }

    private EmptyImmutableListMultimap() {
            r2 = this;
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    private java.lang.Object readResolve() {
            r1 = this;
            com.google.common.collect.EmptyImmutableListMultimap r0 = com.google.common.collect.EmptyImmutableListMultimap.INSTANCE
            return r0
    }
}
