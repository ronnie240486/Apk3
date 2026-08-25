package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ImmutableList<E> extends com.google.common.collect.ImmutableCollection<E> implements java.util.List<E>, java.util.RandomAccess {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final com.google.common.collect.UnmodifiableListIterator<java.lang.Object> EMPTY_ITR = null;

    public static final class Builder<E> extends com.google.common.collect.ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
                r1 = this;
                r0 = 4
                r1.<init>(r0)
                return
        }

        public Builder(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.ArrayBasedBuilder add(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.ImmutableList$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object r1) {
                r0 = this;
                com.google.common.collect.ImmutableList$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object[] r1) {
                r0 = this;
                com.google.common.collect.ImmutableList$Builder r1 = r0.add(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableList.Builder<E> add(E r1) {
                r0 = this;
                super.add(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableList.Builder<E> add(E... r1) {
                r0 = this;
                super.add(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder addAll(java.lang.Iterable r1) {
                r0 = this;
                com.google.common.collect.ImmutableList$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder addAll(java.util.Iterator r1) {
                r0 = this;
                com.google.common.collect.ImmutableList$Builder r1 = r0.addAll(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableList.Builder<E> addAll(java.lang.Iterable<? extends E> r1) {
                r0 = this;
                super.addAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.collect.ImmutableList.Builder<E> addAll(java.util.Iterator<? extends E> r1) {
                r0 = this;
                super.addAll(r1)
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection build() {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.build()
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableList<E> build() {
                r2 = this;
                r0 = 1
                r2.forceCopy = r0
                java.lang.Object[] r0 = r2.contents
                int r1 = r2.size
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.asImmutableList(r0, r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Itr<E> extends com.google.common.collect.AbstractIndexedListIterator<E> {
        private final com.google.common.collect.ImmutableList<E> list;

        public Itr(com.google.common.collect.ImmutableList<E> r2, int r3) {
                r1 = this;
                int r0 = r2.size()
                r1.<init>(r0, r3)
                r1.list = r2
                return
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public final E get(int r2) {
                r1 = this;
                com.google.common.collect.ImmutableList<E> r0 = r1.list
                java.lang.Object r2 = r0.get(r2)
                return r2
        }
    }

    public static class ReverseImmutableList<E> extends com.google.common.collect.ImmutableList<E> {
        private final transient com.google.common.collect.ImmutableList<E> forwardList;

        public ReverseImmutableList(com.google.common.collect.ImmutableList<E> r1) {
                r0 = this;
                r0.<init>()
                r0.forwardList = r1
                return
        }

        private int reverseIndex(int r2) {
                r1 = this;
                int r0 = r1.size()
                int r0 = r0 + (-1)
                int r0 = r0 - r2
                return r0
        }

        private int reversePosition(int r2) {
                r1 = this;
                int r0 = r1.size()
                int r0 = r0 - r2
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableList<E> r0 = r1.forwardList
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.List
        public E get(int r2) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkElementIndex(r2, r0)
                com.google.common.collect.ImmutableList<E> r0 = r1.forwardList
                int r2 = r1.reverseIndex(r2)
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableList<E> r0 = r1.forwardList
                int r2 = r0.lastIndexOf(r2)
                if (r2 < 0) goto Ld
                int r2 = r1.reverseIndex(r2)
                goto Le
            Ld:
                r2 = -1
            Le:
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                com.google.common.collect.ImmutableList<E> r0 = r1.forwardList
                boolean r0 = r0.isPartialView()
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = super.iterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.ImmutableList<E> r0 = r1.forwardList
                int r2 = r0.indexOf(r2)
                if (r2 < 0) goto Ld
                int r2 = r1.reverseIndex(r2)
                goto Le
            Ld:
                r2 = -1
            Le:
                return r2
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableListIterator r0 = super.listIterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
                r0 = this;
                com.google.common.collect.UnmodifiableListIterator r1 = super.listIterator(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableList
        public com.google.common.collect.ImmutableList<E> reverse() {
                r1 = this;
                com.google.common.collect.ImmutableList<E> r0 = r1.forwardList
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.google.common.collect.ImmutableList<E> r0 = r1.forwardList
                int r0 = r0.size()
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public com.google.common.collect.ImmutableList<E> subList(int r2, int r3) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r0)
                com.google.common.collect.ImmutableList<E> r0 = r1.forwardList
                int r3 = r1.reversePosition(r3)
                int r2 = r1.reversePosition(r2)
                com.google.common.collect.ImmutableList r2 = r0.subList(r3, r2)
                com.google.common.collect.ImmutableList r2 = r2.reverse()
                return r2
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
                r0 = this;
                com.google.common.collect.ImmutableList r1 = r0.subList(r1, r2)
                return r1
        }
    }

    public static class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
    }

    public class SubList extends com.google.common.collect.ImmutableList<E> {
        public final transient int length;
        public final transient int offset;
        public final /* synthetic */ com.google.common.collect.ImmutableList this$0;

        public SubList(com.google.common.collect.ImmutableList r1, int r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.offset = r2
                r0.length = r3
                return
        }

        @Override // java.util.List
        public E get(int r3) {
                r2 = this;
                int r0 = r2.length
                com.google.common.base.Preconditions.checkElementIndex(r3, r0)
                com.google.common.collect.ImmutableList r0 = r2.this$0
                int r1 = r2.offset
                int r3 = r3 + r1
                java.lang.Object r3 = r0.get(r3)
                return r3
        }

        @Override // com.google.common.collect.ImmutableCollection
        @javax.annotation.CheckForNull
        public final java.lang.Object[] internalArray() {
                r1 = this;
                com.google.common.collect.ImmutableList r0 = r1.this$0
                java.lang.Object[] r0 = r0.internalArray()
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int internalArrayEnd() {
                r2 = this;
                com.google.common.collect.ImmutableList r0 = r2.this$0
                int r0 = r0.internalArrayStart()
                int r1 = r2.offset
                int r0 = r0 + r1
                int r1 = r2.length
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int internalArrayStart() {
                r2 = this;
                com.google.common.collect.ImmutableList r0 = r2.this$0
                int r0 = r0.internalArrayStart()
                int r1 = r2.offset
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableIterator r0 = super.iterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
                r1 = this;
                com.google.common.collect.UnmodifiableListIterator r0 = super.listIterator()
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
                r0 = this;
                com.google.common.collect.UnmodifiableListIterator r1 = super.listIterator(r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                int r0 = r1.length
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public com.google.common.collect.ImmutableList<E> subList(int r3, int r4) {
                r2 = this;
                int r0 = r2.length
                com.google.common.base.Preconditions.checkPositionIndexes(r3, r4, r0)
                com.google.common.collect.ImmutableList r0 = r2.this$0
                int r1 = r2.offset
                int r3 = r3 + r1
                int r4 = r4 + r1
                com.google.common.collect.ImmutableList r3 = r0.subList(r3, r4)
                return r3
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
                r0 = this;
                com.google.common.collect.ImmutableList r1 = r0.subList(r1, r2)
                return r1
        }
    }

    static {
            com.google.common.collect.ImmutableList$Itr r0 = new com.google.common.collect.ImmutableList$Itr
            com.google.common.collect.ImmutableList<java.lang.Object> r1 = com.google.common.collect.RegularImmutableList.EMPTY
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.collect.ImmutableList.EMPTY_ITR = r0
            return
    }

    public ImmutableList() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <E> com.google.common.collect.ImmutableList<E> asImmutableList(java.lang.Object[] r1, int r2) {
            if (r2 != 0) goto L7
            com.google.common.collect.ImmutableList r1 = of()
            return r1
        L7:
            com.google.common.collect.RegularImmutableList r0 = new com.google.common.collect.RegularImmutableList
            r0.<init>(r1, r2)
            return r0
    }

    public static <E> com.google.common.collect.ImmutableList.Builder<E> builder() {
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.Beta
    public static <E> com.google.common.collect.ImmutableList.Builder<E> builderWithExpectedSize(int r1) {
            java.lang.String r0 = "expectedSize"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r1, r0)
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            r0.<init>(r1)
            return r0
    }

    private static <E> com.google.common.collect.ImmutableList<E> construct(java.lang.Object... r1) {
            int r0 = r1.length
            com.google.common.collect.ObjectArrays.checkElementsNotNull(r1, r0)
            int r0 = r1.length
            com.google.common.collect.ImmutableList r1 = asImmutableList(r1, r0)
            return r1
    }

    public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.lang.Iterable<? extends E> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.Collection r1 = (java.util.Collection) r1
            com.google.common.collect.ImmutableList r1 = copyOf(r1)
            goto L16
        Le:
            java.util.Iterator r1 = r1.iterator()
            com.google.common.collect.ImmutableList r1 = copyOf(r1)
        L16:
            return r1
    }

    public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.util.Collection<? extends E> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.ImmutableCollection
            if (r0 == 0) goto L1a
            com.google.common.collect.ImmutableCollection r1 = (com.google.common.collect.ImmutableCollection) r1
            com.google.common.collect.ImmutableList r1 = r1.asList()
            boolean r0 = r1.isPartialView()
            if (r0 == 0) goto L19
            java.lang.Object[] r1 = r1.toArray()
            int r0 = r1.length
            com.google.common.collect.ImmutableList r1 = asImmutableList(r1, r0)
        L19:
            return r1
        L1a:
            java.lang.Object[] r1 = r1.toArray()
            com.google.common.collect.ImmutableList r1 = construct(r1)
            return r1
    }

    public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.util.Iterator<? extends E> r2) {
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto Lb
            com.google.common.collect.ImmutableList r2 = of()
            return r2
        Lb:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1a
            com.google.common.collect.ImmutableList r2 = of(r0)
            return r2
        L1a:
            com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
            r1.<init>()
            com.google.common.collect.ImmutableList$Builder r0 = r1.add(r0)
            com.google.common.collect.ImmutableList$Builder r2 = r0.addAll(r2)
            com.google.common.collect.ImmutableList r2 = r2.build()
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> copyOf(E[] r1) {
            int r0 = r1.length
            if (r0 != 0) goto L8
            com.google.common.collect.ImmutableList r1 = of()
            goto L12
        L8:
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            com.google.common.collect.ImmutableList r1 = construct(r1)
        L12:
            return r1
    }

    public static <E> com.google.common.collect.ImmutableList<E> of() {
            com.google.common.collect.ImmutableList<java.lang.Object> r0 = com.google.common.collect.RegularImmutableList.EMPTY
            return r0
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3) {
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3, E r4) {
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3, E r4, E r5) {
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3, E r4, E r5, E r6) {
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3, E r4, E r5, E r6, E r7) {
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3, E r4, E r5, E r6, E r7, E r8) {
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3, E r4, E r5, E r6, E r7, E r8, E r9) {
            r0 = 8
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            r2 = 7
            r0[r2] = r9
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3, E r4, E r5, E r6, E r7, E r8, E r9, E r10) {
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            r2 = 7
            r0[r2] = r9
            r2 = 8
            r0[r2] = r10
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3, E r4, E r5, E r6, E r7, E r8, E r9, E r10, E r11) {
            r0 = 10
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            r2 = 7
            r0[r2] = r9
            r2 = 8
            r0[r2] = r10
            r2 = 9
            r0[r2] = r11
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E r2, E r3, E r4, E r5, E r6, E r7, E r8, E r9, E r10, E r11, E r12) {
            r0 = 11
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            r2 = 7
            r0[r2] = r9
            r2 = 8
            r0[r2] = r10
            r2 = 9
            r0[r2] = r11
            r2 = 10
            r0[r2] = r12
            com.google.common.collect.ImmutableList r2 = construct(r0)
            return r2
    }

    @java.lang.SafeVarargs
    public static <E> com.google.common.collect.ImmutableList<E> of(E r5, E r6, E r7, E r8, E r9, E r10, E r11, E r12, E r13, E r14, E r15, E r16, E... r17) {
            r0 = r17
            int r1 = r0.length
            r2 = 1
            r3 = 0
            r4 = 2147483635(0x7ffffff3, float:NaN)
            if (r1 > r4) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            java.lang.String r4 = "the total number of elements must fit in an int"
            com.google.common.base.Preconditions.checkArgument(r1, r4)
            int r1 = r0.length
            r4 = 12
            int r1 = r1 + r4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r6
            r2 = 2
            r1[r2] = r7
            r2 = 3
            r1[r2] = r8
            r2 = 4
            r1[r2] = r9
            r2 = 5
            r1[r2] = r10
            r2 = 6
            r1[r2] = r11
            r2 = 7
            r1[r2] = r12
            r2 = 8
            r1[r2] = r13
            r2 = 9
            r1[r2] = r14
            r2 = 10
            r1[r2] = r15
            r2 = 11
            r1[r2] = r16
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r4, r2)
            com.google.common.collect.ImmutableList r0 = construct(r1)
            return r0
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.InvalidObjectException {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Use SerializedForm"
            r2.<init>(r0)
            throw r2
    }

    public static <E extends java.lang.Comparable<? super E>> com.google.common.collect.ImmutableList<E> sortedCopyOf(java.lang.Iterable<? extends E> r1) {
            r0 = 0
            java.lang.Comparable[] r0 = new java.lang.Comparable[r0]
            java.lang.Object[] r1 = com.google.common.collect.Iterables.toArray(r1, r0)
            java.lang.Comparable[] r1 = (java.lang.Comparable[]) r1
            int r0 = r1.length
            com.google.common.collect.ObjectArrays.checkElementsNotNull(r1, r0)
            java.util.Arrays.sort(r1)
            int r0 = r1.length
            com.google.common.collect.ImmutableList r1 = asImmutableList(r1, r0)
            return r1
    }

    public static <E> com.google.common.collect.ImmutableList<E> sortedCopyOf(java.util.Comparator<? super E> r1, java.lang.Iterable<? extends E> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.Object[] r2 = com.google.common.collect.Iterables.toArray(r2)
            int r0 = r2.length
            com.google.common.collect.ObjectArrays.checkElementsNotNull(r2, r0)
            java.util.Arrays.sort(r2, r1)
            int r1 = r2.length
            com.google.common.collect.ImmutableList r1 = asImmutableList(r2, r1)
            return r1
    }

    @Override // java.util.List
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.ImmutableCollection
    @com.google.errorprone.annotations.InlineMe(replacement = "this")
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableList<E> asList() {
            r0 = this;
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(java.lang.Object[] r5, int r6) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L12
            int r2 = r6 + r1
            java.lang.Object r3 = r4.get(r1)
            r5[r2] = r3
            int r1 = r1 + 1
            goto L5
        L12:
            int r6 = r6 + r0
            return r6
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r6)
            r1 = 0
            r2 = 1
            if (r7 != r0) goto La
        L8:
            r1 = 1
            goto L41
        La:
            boolean r0 = r7 instanceof java.util.List
            if (r0 != 0) goto Lf
            goto L41
        Lf:
            java.util.List r7 = (java.util.List) r7
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L1c
            goto L41
        L1c:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L35
            r3 = 0
        L21:
            if (r3 >= r0) goto L8
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = com.google.common.base.Objects.equal(r4, r5)
            if (r4 != 0) goto L32
            goto L41
        L32:
            int r3 = r3 + 1
            goto L21
        L35:
            java.util.Iterator r0 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
            boolean r1 = com.google.common.collect.Iterators.elementsEqual(r0, r7)
        L41:
            return r1
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            r2 = 0
        L6:
            if (r2 >= r0) goto L18
            int r1 = r1 * 31
            java.lang.Object r3 = r4.get(r2)
            int r3 = r3.hashCode()
            int r3 = r3 + r1
            int r1 = ~r3
            int r1 = ~r1
            int r2 = r2 + 1
            goto L6
        L18:
            return r1
    }

    @Override // java.util.List
    public int indexOf(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = -1
            goto L8
        L4:
            int r1 = com.google.common.collect.Lists.indexOfImpl(r0, r1)
        L8:
            return r1
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableListIterator r0 = r1.listIterator()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = -1
            goto L8
        L4:
            int r1 = com.google.common.collect.Lists.lastIndexOfImpl(r0, r1)
        L8:
            return r1
    }

    @Override // java.util.List
    public com.google.common.collect.UnmodifiableListIterator<E> listIterator() {
            r1 = this;
            r0 = 0
            com.google.common.collect.UnmodifiableListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.List
    public com.google.common.collect.UnmodifiableListIterator<E> listIterator(int r2) {
            r1 = this;
            int r0 = r1.size()
            com.google.common.base.Preconditions.checkPositionIndex(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L10
            com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r2 = com.google.common.collect.ImmutableList.EMPTY_ITR
            return r2
        L10:
            com.google.common.collect.ImmutableList$Itr r0 = new com.google.common.collect.ImmutableList$Itr
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableListIterator r0 = r1.listIterator()
            return r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            com.google.common.collect.UnmodifiableListIterator r1 = r0.listIterator(r1)
            return r1
    }

    @Override // java.util.List
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final E remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public com.google.common.collect.ImmutableList<E> reverse() {
            r2 = this;
            int r0 = r2.size()
            r1 = 1
            if (r0 > r1) goto L9
            r0 = r2
            goto Le
        L9:
            com.google.common.collect.ImmutableList$ReverseImmutableList r0 = new com.google.common.collect.ImmutableList$ReverseImmutableList
            r0.<init>(r2)
        Le:
            return r0
    }

    @Override // java.util.List
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.DoNotCall("Always throws UnsupportedOperationException")
    @java.lang.Deprecated
    public final E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public com.google.common.collect.ImmutableList<E> subList(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r0)
            int r3 = r3 - r2
            int r0 = r1.size()
            if (r3 != r0) goto Lf
            return r1
        Lf:
            if (r3 != 0) goto L16
            com.google.common.collect.ImmutableList r2 = of()
            return r2
        L16:
            com.google.common.collect.ImmutableList$SubList r0 = new com.google.common.collect.ImmutableList$SubList
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.subList(r1, r2)
            return r1
    }
}
