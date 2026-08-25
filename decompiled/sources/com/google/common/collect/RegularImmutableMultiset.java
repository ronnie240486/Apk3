package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
class RegularImmutableMultiset<E> extends com.google.common.collect.ImmutableMultiset<E> {
    public static final com.google.common.collect.RegularImmutableMultiset<java.lang.Object> EMPTY = null;
    public final transient com.google.common.collect.ObjectCountHashMap<E> contents;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<E> elementSet;
    private final transient int size;

    /* JADX INFO: renamed from: com.google.common.collect.RegularImmutableMultiset$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class ElementSet extends com.google.common.collect.IndexedImmutableSet<E> {
        public final /* synthetic */ com.google.common.collect.RegularImmutableMultiset this$0;

        private ElementSet(com.google.common.collect.RegularImmutableMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ElementSet(com.google.common.collect.RegularImmutableMultiset r1, com.google.common.collect.RegularImmutableMultiset.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.RegularImmutableMultiset r0 = r1.this$0
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final E get(int r2) {
                r1 = this;
                com.google.common.collect.RegularImmutableMultiset r0 = r1.this$0
                com.google.common.collect.ObjectCountHashMap<E> r0 = r0.contents
                java.lang.Object r2 = r0.getKey(r2)
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.RegularImmutableMultiset r0 = r1.this$0
                com.google.common.collect.ObjectCountHashMap<E> r0 = r0.contents
                int r0 = r0.size
                return r0
        }
    }

    @com.google.common.annotations.GwtIncompatible
    public static class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
    }

    static {
            com.google.common.collect.RegularImmutableMultiset r0 = new com.google.common.collect.RegularImmutableMultiset
            com.google.common.collect.ObjectCountHashMap r1 = new com.google.common.collect.ObjectCountHashMap
            r1.<init>()
            r0.<init>(r1)
            com.google.common.collect.RegularImmutableMultiset.EMPTY = r0
            return
    }

    public RegularImmutableMultiset(com.google.common.collect.ObjectCountHashMap<E> r6) {
            r5 = this;
            r5.<init>()
            r5.contents = r6
            r0 = 0
            r2 = 0
        L8:
            int r3 = r6.size
            if (r2 >= r3) goto L15
            int r3 = r6.getValue(r2)
            long r3 = (long) r3
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L8
        L15:
            int r6 = com.google.common.primitives.Ints.saturatedCast(r0)
            r5.size = r6
            return
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ObjectCountHashMap<E> r0 = r1.contents
            int r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public com.google.common.collect.ImmutableSet<E> elementSet() {
            r2 = this;
            com.google.common.collect.ImmutableSet<E> r0 = r2.elementSet
            if (r0 != 0) goto Lc
            com.google.common.collect.RegularImmutableMultiset$ElementSet r0 = new com.google.common.collect.RegularImmutableMultiset$ElementSet
            r1 = 0
            r0.<init>(r2, r1)
            r2.elementSet = r0
        Lc:
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final com.google.common.collect.Multiset.Entry<E> getEntry(int r3) {
            r2 = this;
            com.google.common.collect.ObjectCountHashMap<E> r0 = r2.contents
            int r1 = r0.size
            com.google.common.base.Preconditions.checkElementIndex(r3, r1)
            com.google.common.collect.ObjectCountHashMap$MapEntry r1 = new com.google.common.collect.ObjectCountHashMap$MapEntry
            r1.<init>(r0, r3)
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
