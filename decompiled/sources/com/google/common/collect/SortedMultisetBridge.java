package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
interface SortedMultisetBridge<E> extends com.google.common.collect.Multiset<E> {

    /* JADX INFO: renamed from: com.google.common.collect.SortedMultisetBridge$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<E> {
        public static /* bridge */ /* synthetic */ java.util.Set $default$elementSet(com.google.common.collect.SortedMultisetBridge r0) {
                java.util.SortedSet r0 = r0.elementSet()
                return r0
        }
    }

    @Override // com.google.common.collect.Multiset
    /* bridge */ /* synthetic */ java.util.Set elementSet();

    @Override // com.google.common.collect.Multiset
    java.util.SortedSet<E> elementSet();
}
