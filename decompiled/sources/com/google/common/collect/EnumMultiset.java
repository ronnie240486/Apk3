package com.google.common.collect;

import java.lang.Enum;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class EnumMultiset<E extends java.lang.Enum<E>> extends com.google.common.collect.AbstractMultiset<E> implements java.io.Serializable {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;
    private transient int[] counts;
    private transient int distinctElements;
    private transient E[] enumConstants;
    private transient long size;
    private transient java.lang.Class<E> type;



    /* JADX INFO: loaded from: classes.dex */
    public abstract class Itr<T> implements java.util.Iterator<T> {
        public int index;
        public final /* synthetic */ com.google.common.collect.EnumMultiset this$0;
        public int toRemove;

        public Itr(com.google.common.collect.EnumMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.index = r1
                r1 = -1
                r0.toRemove = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
            L0:
                int r0 = r2.index
                com.google.common.collect.EnumMultiset r1 = r2.this$0
                java.lang.Enum[] r1 = com.google.common.collect.EnumMultiset.access$000(r1)
                int r1 = r1.length
                if (r0 >= r1) goto L1e
                com.google.common.collect.EnumMultiset r0 = r2.this$0
                int[] r0 = com.google.common.collect.EnumMultiset.access$100(r0)
                int r1 = r2.index
                r0 = r0[r1]
                if (r0 <= 0) goto L19
                r0 = 1
                return r0
            L19:
                int r1 = r1 + 1
                r2.index = r1
                goto L0
            L1e:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L15
                int r0 = r2.index
                java.lang.Object r0 = r2.output(r0)
                int r1 = r2.index
                r2.toRemove = r1
                int r1 = r1 + 1
                r2.index = r1
                return r0
            L15:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        public abstract T output(int r1);

        @Override // java.util.Iterator
        public void remove() {
                r4 = this;
                int r0 = r4.toRemove
                r1 = 0
                if (r0 < 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                com.google.common.collect.CollectPreconditions.checkRemove(r0)
                com.google.common.collect.EnumMultiset r0 = r4.this$0
                int[] r0 = com.google.common.collect.EnumMultiset.access$100(r0)
                int r2 = r4.toRemove
                r0 = r0[r2]
                if (r0 <= 0) goto L34
                com.google.common.collect.EnumMultiset r0 = r4.this$0
                com.google.common.collect.EnumMultiset.access$210(r0)
                com.google.common.collect.EnumMultiset r0 = r4.this$0
                int[] r2 = com.google.common.collect.EnumMultiset.access$100(r0)
                int r3 = r4.toRemove
                r2 = r2[r3]
                long r2 = (long) r2
                com.google.common.collect.EnumMultiset.access$322(r0, r2)
                com.google.common.collect.EnumMultiset r0 = r4.this$0
                int[] r0 = com.google.common.collect.EnumMultiset.access$100(r0)
                int r2 = r4.toRemove
                r0[r2] = r1
            L34:
                r0 = -1
                r4.toRemove = r0
                return
        }
    }

    private EnumMultiset(java.lang.Class<E> r2) {
            r1 = this;
            r1.<init>()
            r1.type = r2
            boolean r0 = r2.isEnum()
            com.google.common.base.Preconditions.checkArgument(r0)
            java.lang.Object[] r2 = r2.getEnumConstants()
            java.lang.Enum[] r2 = (java.lang.Enum[]) r2
            r1.enumConstants = r2
            int r2 = r2.length
            int[] r2 = new int[r2]
            r1.counts = r2
            return
    }

    public static /* synthetic */ java.lang.Enum[] access$000(com.google.common.collect.EnumMultiset r0) {
            E extends java.lang.Enum<E>[] r0 = r0.enumConstants
            return r0
    }

    public static /* synthetic */ int[] access$100(com.google.common.collect.EnumMultiset r0) {
            int[] r0 = r0.counts
            return r0
    }

    public static /* synthetic */ int access$210(com.google.common.collect.EnumMultiset r2) {
            int r0 = r2.distinctElements
            int r1 = r0 + (-1)
            r2.distinctElements = r1
            return r0
    }

    public static /* synthetic */ long access$322(com.google.common.collect.EnumMultiset r2, long r3) {
            long r0 = r2.size
            long r0 = r0 - r3
            r2.size = r0
            return r0
    }

    private void checkIsE(java.lang.Object r6) {
            r5 = this;
            com.google.common.base.Preconditions.checkNotNull(r6)
            boolean r0 = r5.isActuallyE(r6)
            if (r0 == 0) goto La
            return
        La:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            java.lang.Class<E extends java.lang.Enum<E>> r1 = r5.type
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r2 = r1.length()
            int r2 = r2 + 21
            int r3 = r6.length()
            int r3 = r3 + r2
            java.lang.String r2 = "Expected an "
            java.lang.String r4 = " but got "
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r2, r1, r4, r6)
            r0.<init>(r6)
            throw r0
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.EnumMultiset<E> create(java.lang.Class<E> r1) {
            com.google.common.collect.EnumMultiset r0 = new com.google.common.collect.EnumMultiset
            r0.<init>(r1)
            return r0
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.EnumMultiset<E> create(java.lang.Iterable<E> r3) {
            java.util.Iterator r0 = r3.iterator()
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "EnumMultiset constructor passed empty Iterable"
            com.google.common.base.Preconditions.checkArgument(r1, r2)
            com.google.common.collect.EnumMultiset r1 = new com.google.common.collect.EnumMultiset
            java.lang.Object r0 = r0.next()
            java.lang.Enum r0 = (java.lang.Enum) r0
            java.lang.Class r0 = r0.getDeclaringClass()
            r1.<init>(r0)
            com.google.common.collect.Iterables.addAll(r1, r3)
            return r1
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.EnumMultiset<E> create(java.lang.Iterable<E> r0, java.lang.Class<E> r1) {
            com.google.common.collect.EnumMultiset r1 = create(r1)
            com.google.common.collect.Iterables.addAll(r1, r0)
            return r1
    }

    private boolean isActuallyE(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r0 = r5.ordinal()
            E extends java.lang.Enum<E>[] r2 = r4.enumConstants
            int r3 = r2.length
            if (r0 >= r3) goto L15
            r0 = r2[r0]
            if (r0 != r5) goto L15
            r1 = 1
        L15:
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException, java.lang.ClassNotFoundException {
            r1 = this;
            r2.defaultReadObject()
            java.lang.Object r0 = r2.readObject()
            java.lang.Class r0 = (java.lang.Class) r0
            r1.type = r0
            java.lang.Object[] r0 = r0.getEnumConstants()
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            r1.enumConstants = r0
            int r0 = r0.length
            int[] r0 = new int[r0]
            r1.counts = r0
            com.google.common.collect.Serialization.populateMultiset(r1, r2)
            return
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            r2.defaultWriteObject()
            java.lang.Class<E extends java.lang.Enum<E>> r0 = r1.type
            r2.writeObject(r0)
            com.google.common.collect.Serialization.writeMultiset(r1, r2)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int add(E r9, int r10) {
            r8 = this;
            r8.checkIsE(r9)
            java.lang.String r0 = "occurrences"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r10, r0)
            if (r10 != 0) goto Lf
            int r9 = r8.count(r9)
            return r9
        Lf:
            int r9 = r9.ordinal()
            int[] r0 = r8.counts
            r0 = r0[r9]
            long r1 = (long) r0
            long r3 = (long) r10
            long r1 = r1 + r3
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r10 = 1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L24
            r5 = 1
            goto L25
        L24:
            r5 = 0
        L25:
            java.lang.String r6 = "too many occurrences: %s"
            com.google.common.base.Preconditions.checkArgument(r5, r6, r1)
            int[] r5 = r8.counts
            int r2 = (int) r1
            r5[r9] = r2
            if (r0 != 0) goto L36
            int r9 = r8.distinctElements
            int r9 = r9 + r10
            r8.distinctElements = r9
        L36:
            long r9 = r8.size
            long r9 = r9 + r3
            r8.size = r9
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ int add(java.lang.Object r1, int r2) {
            r0 = this;
            java.lang.Enum r1 = (java.lang.Enum) r1
            int r1 = r0.add(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r4 = this;
            int[] r0 = r4.counts
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r2 = 0
            r4.size = r2
            r4.distinctElements = r1
            return
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L14
            boolean r0 = r1.isActuallyE(r2)
            if (r0 != 0) goto L9
            goto L14
        L9:
            java.lang.Enum r2 = (java.lang.Enum) r2
            int[] r0 = r1.counts
            int r2 = r2.ordinal()
            r2 = r0[r2]
            return r2
        L14:
            r2 = 0
            return r2
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int distinctElements() {
            r1 = this;
            int r0 = r1.distinctElements
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final java.util.Iterator<E> elementIterator() {
            r1 = this;
            com.google.common.collect.EnumMultiset$1 r0 = new com.google.common.collect.EnumMultiset$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            java.util.Set r0 = super.elementSet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
            r1 = this;
            com.google.common.collect.EnumMultiset$2 r0 = new com.google.common.collect.EnumMultiset$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            java.util.Set r0 = super.entrySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
            r1 = this;
            boolean r0 = super.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.util.Iterator r0 = com.google.common.collect.Multisets.iteratorImpl(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int remove(@javax.annotation.CheckForNull java.lang.Object r4, int r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L40
            boolean r1 = r3.isActuallyE(r4)
            if (r1 != 0) goto La
            goto L40
        La:
            r1 = r4
            java.lang.Enum r1 = (java.lang.Enum) r1
            java.lang.String r2 = "occurrences"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r5, r2)
            if (r5 != 0) goto L19
            int r4 = r3.count(r4)
            return r4
        L19:
            int r4 = r1.ordinal()
            int[] r1 = r3.counts
            r2 = r1[r4]
            if (r2 != 0) goto L24
            return r0
        L24:
            if (r2 > r5) goto L35
            r1[r4] = r0
            int r4 = r3.distinctElements
            int r4 = r4 + (-1)
            r3.distinctElements = r4
            long r4 = r3.size
            long r0 = (long) r2
            long r4 = r4 - r0
            r3.size = r4
            goto L3f
        L35:
            int r0 = r2 - r5
            r1[r4] = r0
            long r0 = r3.size
            long r4 = (long) r5
            long r0 = r0 - r4
            r3.size = r0
        L3f:
            return r2
        L40:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int setCount(E r7, int r8) {
            r6 = this;
            r6.checkIsE(r7)
            java.lang.String r0 = "count"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r8, r0)
            int r7 = r7.ordinal()
            int[] r0 = r6.counts
            r1 = r0[r7]
            r0[r7] = r8
            long r2 = r6.size
            int r7 = r8 - r1
            long r4 = (long) r7
            long r2 = r2 + r4
            r6.size = r2
            if (r1 != 0) goto L25
            if (r8 <= 0) goto L25
            int r7 = r6.distinctElements
            int r7 = r7 + 1
            r6.distinctElements = r7
            goto L2f
        L25:
            if (r1 <= 0) goto L2f
            if (r8 != 0) goto L2f
            int r7 = r6.distinctElements
            int r7 = r7 + (-1)
            r6.distinctElements = r7
        L2f:
            return r1
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ int setCount(java.lang.Object r1, int r2) {
            r0 = this;
            java.lang.Enum r1 = (java.lang.Enum) r1
            int r1 = r0.setCount(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean setCount(@com.google.common.collect.ParametricNullness java.lang.Object r1, int r2, int r3) {
            r0 = this;
            boolean r1 = super.setCount(r1, r2, r3)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
            r2 = this;
            long r0 = r2.size
            int r0 = com.google.common.primitives.Ints.saturatedCast(r0)
            return r0
    }
}
