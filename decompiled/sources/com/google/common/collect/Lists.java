package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Lists {

    /* JADX INFO: renamed from: com.google.common.collect.Lists$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    class AnonymousClass1 extends com.google.common.collect.Lists.RandomAccessListWrapper<java.lang.Object> {
        private static final long serialVersionUID = 0;

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<java.lang.Object> listIterator(int r1) {
                r0 = this;
                r1 = 0
                throw r1
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Lists$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    class AnonymousClass2 extends com.google.common.collect.Lists.AbstractListWrapper<java.lang.Object> {
        private static final long serialVersionUID = 0;

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<java.lang.Object> listIterator(int r1) {
                r0 = this;
                r1 = 0
                throw r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class AbstractListWrapper<E> extends java.util.AbstractList<E> {
        @Override // java.util.AbstractList, java.util.List
        public void add(int r1, @com.google.common.collect.ParametricNullness E r2) {
                r0 = this;
                r1 = 0
                throw r1
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int r1, java.util.Collection<? extends E> r2) {
                r0 = this;
                r1 = 0
                throw r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object r1) {
                r0 = this;
                r1 = 0
                throw r1
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public E get(int r1) {
                r0 = this;
                r1 = 0
                throw r1
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public E remove(int r1) {
                r0 = this;
                r1 = 0
                throw r1
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public E set(int r1, @com.google.common.collect.ParametricNullness E r2) {
                r0 = this;
                r1 = 0
                throw r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                r0 = 0
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class CharSequenceAsList extends java.util.AbstractList<java.lang.Character> {
        private final java.lang.CharSequence sequence;

        public CharSequenceAsList(java.lang.CharSequence r1) {
                r0 = this;
                r0.<init>()
                r0.sequence = r1
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Character get(int r2) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkElementIndex(r2, r0)
                java.lang.CharSequence r0 = r1.sequence
                char r2 = r0.charAt(r2)
                java.lang.Character r2 = java.lang.Character.valueOf(r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Character r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.lang.CharSequence r0 = r1.sequence
                int r0 = r0.length()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class OnePlusArrayList<E> extends java.util.AbstractList<E> implements java.io.Serializable, java.util.RandomAccess {
        private static final long serialVersionUID = 0;

        @com.google.common.collect.ParametricNullness
        public final E first;
        public final E[] rest;

        public OnePlusArrayList(@com.google.common.collect.ParametricNullness E r1, E[] r2) {
                r0 = this;
                r0.<init>()
                r0.first = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                r0.rest = r1
                return
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public E get(int r2) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkElementIndex(r2, r0)
                if (r2 != 0) goto Lc
                E r2 = r1.first
                goto L12
            Lc:
                E[] r0 = r1.rest
                int r2 = r2 + (-1)
                r2 = r0[r2]
            L12:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r2 = this;
                E[] r0 = r2.rest
                int r0 = r0.length
                r1 = 1
                int r0 = com.google.common.math.IntMath.saturatedAdd(r0, r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Partition<T> extends java.util.AbstractList<java.util.List<T>> {
        public final java.util.List<T> list;
        public final int size;

        public Partition(java.util.List<T> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.list = r1
                r0.size = r2
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.util.List r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<T> get(int r3) {
                r2 = this;
                int r0 = r2.size()
                com.google.common.base.Preconditions.checkElementIndex(r3, r0)
                int r0 = r2.size
                int r3 = r3 * r0
                int r0 = r0 + r3
                java.util.List<T> r1 = r2.list
                int r1 = r1.size()
                int r0 = java.lang.Math.min(r0, r1)
                java.util.List<T> r1 = r2.list
                java.util.List r3 = r1.subList(r3, r0)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
                r1 = this;
                java.util.List<T> r0 = r1.list
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r3 = this;
                java.util.List<T> r0 = r3.list
                int r0 = r0.size()
                int r1 = r3.size
                java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
                int r0 = com.google.common.math.IntMath.divide(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class RandomAccessListWrapper<E> extends com.google.common.collect.Lists.AbstractListWrapper<E> implements java.util.RandomAccess {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class RandomAccessPartition<T> extends com.google.common.collect.Lists.Partition<T> implements java.util.RandomAccess {
        public RandomAccessPartition(java.util.List<T> r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class RandomAccessReverseList<T> extends com.google.common.collect.Lists.ReverseList<T> implements java.util.RandomAccess {
        public RandomAccessReverseList(java.util.List<T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ReverseList<T> extends java.util.AbstractList<T> {
        private final java.util.List<T> forwardList;


        public ReverseList(java.util.List<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.List r1 = (java.util.List) r1
                r0.forwardList = r1
                return
        }

        public static /* synthetic */ int access$000(com.google.common.collect.Lists.ReverseList r0, int r1) {
                int r0 = r0.reversePosition(r1)
                return r0
        }

        private int reverseIndex(int r2) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkElementIndex(r2, r0)
                int r0 = r0 + (-1)
                int r0 = r0 - r2
                return r0
        }

        private int reversePosition(int r2) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkPositionIndex(r2, r0)
                int r0 = r0 - r2
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int r2, @com.google.common.collect.ParametricNullness T r3) {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                int r2 = r1.reversePosition(r2)
                r0.add(r2, r3)
                return
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                r0.clear()
                return
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public T get(int r2) {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                int r2 = r1.reverseIndex(r2)
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        public final java.util.List<T> getForwardList() {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                return r0
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<T> iterator() {
                r1 = this;
                java.util.ListIterator r0 = r1.listIterator()
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<T> listIterator(int r2) {
                r1 = this;
                int r2 = r1.reversePosition(r2)
                java.util.List<T> r0 = r1.forwardList
                java.util.ListIterator r2 = r0.listIterator(r2)
                com.google.common.collect.Lists$ReverseList$1 r0 = new com.google.common.collect.Lists$ReverseList$1
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public T remove(int r2) {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                int r2 = r1.reverseIndex(r2)
                java.lang.Object r2 = r0.remove(r2)
                return r2
        }

        @Override // java.util.AbstractList
        public final void removeRange(int r1, int r2) {
                r0 = this;
                java.util.List r1 = r0.subList(r1, r2)
                r1.clear()
                return
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public T set(int r2, @com.google.common.collect.ParametricNullness T r3) {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                int r2 = r1.reverseIndex(r2)
                java.lang.Object r2 = r0.set(r2, r3)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<T> subList(int r2, int r3) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r0)
                java.util.List<T> r0 = r1.forwardList
                int r3 = r1.reversePosition(r3)
                int r2 = r1.reversePosition(r2)
                java.util.List r2 = r0.subList(r3, r2)
                java.util.List r2 = com.google.common.collect.Lists.reverse(r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class StringAsImmutableList extends com.google.common.collect.ImmutableList<java.lang.Character> {
        private final java.lang.String string;

        public StringAsImmutableList(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.string = r1
                return
        }

        @Override // java.util.List
        public java.lang.Character get(int r2) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkElementIndex(r2, r0)
                java.lang.String r0 = r1.string
                char r2 = r0.charAt(r2)
                java.lang.Character r2 = java.lang.Character.valueOf(r2)
                return r2
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Character r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Character
                if (r0 == 0) goto L11
                java.lang.String r0 = r1.string
                java.lang.Character r2 = (java.lang.Character) r2
                char r2 = r2.charValue()
                int r2 = r0.indexOf(r2)
                goto L12
            L11:
                r2 = -1
            L12:
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Character
                if (r0 == 0) goto L11
                java.lang.String r0 = r1.string
                java.lang.Character r2 = (java.lang.Character) r2
                char r2 = r2.charValue()
                int r2 = r0.lastIndexOf(r2)
                goto L12
            L11:
                r2 = -1
            L12:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.lang.String r0 = r1.string
                int r0 = r0.length()
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public com.google.common.collect.ImmutableList<java.lang.Character> subList(int r2, int r3) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r0)
                java.lang.String r0 = r1.string
                java.lang.String r2 = r0.substring(r2, r3)
                com.google.common.collect.ImmutableList r2 = com.google.common.collect.Lists.charactersOf(r2)
                return r2
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
                r0 = this;
                com.google.common.collect.ImmutableList r1 = r0.subList(r1, r2)
                return r1
        }
    }

    public static class TransformingRandomAccessList<F, T> extends java.util.AbstractList<T> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final java.util.List<F> fromList;
        public final com.google.common.base.Function<? super F, ? extends T> function;


        public TransformingRandomAccessList(java.util.List<F> r1, com.google.common.base.Function<? super F, ? extends T> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.List r1 = (java.util.List) r1
                r0.fromList = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.function = r1
                return
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
                r1 = this;
                java.util.List<F> r0 = r1.fromList
                r0.clear()
                return
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public T get(int r3) {
                r2 = this;
                com.google.common.base.Function<? super F, ? extends T> r0 = r2.function
                java.util.List<F> r1 = r2.fromList
                java.lang.Object r3 = r1.get(r3)
                java.lang.Object r3 = r0.apply(r3)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
                r1 = this;
                java.util.List<F> r0 = r1.fromList
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<T> iterator() {
                r1 = this;
                java.util.ListIterator r0 = r1.listIterator()
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<T> listIterator(int r3) {
                r2 = this;
                com.google.common.collect.Lists$TransformingRandomAccessList$1 r0 = new com.google.common.collect.Lists$TransformingRandomAccessList$1
                java.util.List<F> r1 = r2.fromList
                java.util.ListIterator r3 = r1.listIterator(r3)
                r0.<init>(r2, r3)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int r3) {
                r2 = this;
                com.google.common.base.Function<? super F, ? extends T> r0 = r2.function
                java.util.List<F> r1 = r2.fromList
                java.lang.Object r3 = r1.remove(r3)
                java.lang.Object r3 = r0.apply(r3)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<F> r0 = r1.fromList
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class TransformingSequentialList<F, T> extends java.util.AbstractSequentialList<T> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        public final java.util.List<F> fromList;
        public final com.google.common.base.Function<? super F, ? extends T> function;


        public TransformingSequentialList(java.util.List<F> r1, com.google.common.base.Function<? super F, ? extends T> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.List r1 = (java.util.List) r1
                r0.fromList = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.function = r1
                return
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
                r1 = this;
                java.util.List<F> r0 = r1.fromList
                r0.clear()
                return
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public java.util.ListIterator<T> listIterator(int r3) {
                r2 = this;
                com.google.common.collect.Lists$TransformingSequentialList$1 r0 = new com.google.common.collect.Lists$TransformingSequentialList$1
                java.util.List<F> r1 = r2.fromList
                java.util.ListIterator r3 = r1.listIterator(r3)
                r0.<init>(r2, r3)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<F> r0 = r1.fromList
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class TwoPlusArrayList<E> extends java.util.AbstractList<E> implements java.io.Serializable, java.util.RandomAccess {
        private static final long serialVersionUID = 0;

        @com.google.common.collect.ParametricNullness
        public final E first;
        public final E[] rest;

        @com.google.common.collect.ParametricNullness
        public final E second;

        public TwoPlusArrayList(@com.google.common.collect.ParametricNullness E r1, @com.google.common.collect.ParametricNullness E r2, E[] r3) {
                r0 = this;
                r0.<init>()
                r0.first = r1
                r0.second = r2
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                r0.rest = r1
                return
        }

        @Override // java.util.AbstractList, java.util.List
        @com.google.common.collect.ParametricNullness
        public E get(int r2) {
                r1 = this;
                if (r2 == 0) goto L16
                r0 = 1
                if (r2 == r0) goto L13
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkElementIndex(r2, r0)
                E[] r0 = r1.rest
                int r2 = r2 + (-2)
                r2 = r0[r2]
                return r2
            L13:
                E r2 = r1.second
                return r2
            L16:
                E r2 = r1.first
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r2 = this;
                E[] r0 = r2.rest
                int r0 = r0.length
                r1 = 2
                int r0 = com.google.common.math.IntMath.saturatedAdd(r0, r1)
                return r0
        }
    }

    private Lists() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <E> java.util.List<E> asList(@com.google.common.collect.ParametricNullness E r1, @com.google.common.collect.ParametricNullness E r2, E[] r3) {
            com.google.common.collect.Lists$TwoPlusArrayList r0 = new com.google.common.collect.Lists$TwoPlusArrayList
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <E> java.util.List<E> asList(@com.google.common.collect.ParametricNullness E r1, E[] r2) {
            com.google.common.collect.Lists$OnePlusArrayList r0 = new com.google.common.collect.Lists$OnePlusArrayList
            r0.<init>(r1, r2)
            return r0
    }

    public static <B> java.util.List<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.List<? extends B>> r3) {
            int r0 = com.google.common.collect.CartesianList.$r8$clinit
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()
            java.util.List r1 = (java.util.List) r1
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L2a
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of()
            goto L37
        L2a:
            r0.add(r1)
            goto Lf
        L2e:
            com.google.common.collect.CartesianList r3 = new com.google.common.collect.CartesianList
            com.google.common.collect.ImmutableList r0 = r0.build()
            r3.<init>(r0)
        L37:
            return r3
    }

    @java.lang.SafeVarargs
    public static <B> java.util.List<java.util.List<B>> cartesianProduct(java.util.List<? extends B>... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = cartesianProduct(r0)
            return r0
    }

    public static com.google.common.collect.ImmutableList<java.lang.Character> charactersOf(java.lang.String r1) {
            com.google.common.collect.Lists$StringAsImmutableList r0 = new com.google.common.collect.Lists$StringAsImmutableList
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static java.util.List<java.lang.Character> charactersOf(java.lang.CharSequence r1) {
            com.google.common.collect.Lists$CharSequenceAsList r0 = new com.google.common.collect.Lists$CharSequenceAsList
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.<init>(r1)
            return r0
    }

    public static int indexOfImpl(java.util.List<?> r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L9
            int r1 = indexOfRandomAccess(r1, r2)
            return r1
        L9:
            java.util.ListIterator r1 = r1.listIterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            boolean r0 = com.google.common.base.Objects.equal(r2, r0)
            if (r0 == 0) goto Ld
            int r1 = r1.previousIndex()
            return r1
        L22:
            r1 = -1
            return r1
    }

    private static int indexOfRandomAccess(java.util.List<?> r3, @javax.annotation.CheckForNull java.lang.Object r4) {
            int r0 = r3.size()
            r1 = 0
            if (r4 != 0) goto L13
        L7:
            if (r1 >= r0) goto L23
            java.lang.Object r4 = r3.get(r1)
            if (r4 != 0) goto L10
            return r1
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            if (r1 >= r0) goto L23
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L20
            return r1
        L20:
            int r1 = r1 + 1
            goto L13
        L23:
            r3 = -1
            return r3
    }

    public static int lastIndexOfImpl(java.util.List<?> r1, @javax.annotation.CheckForNull java.lang.Object r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L9
            int r1 = lastIndexOfRandomAccess(r1, r2)
            return r1
        L9:
            int r0 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r0)
        L11:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.previous()
            boolean r0 = com.google.common.base.Objects.equal(r2, r0)
            if (r0 == 0) goto L11
            int r1 = r1.nextIndex()
            return r1
        L26:
            r1 = -1
            return r1
    }

    private static int lastIndexOfRandomAccess(java.util.List<?> r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            if (r3 != 0) goto L14
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L8:
            if (r3 < 0) goto L2a
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L11
            return r3
        L11:
            int r3 = r3 + (-1)
            goto L8
        L14:
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L1a:
            if (r0 < 0) goto L2a
            java.lang.Object r1 = r2.get(r0)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L27
            return r0
        L27:
            int r0 = r0 + (-1)
            goto L1a
        L2a:
            r2 = -1
            return r2
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.ArrayList<E> newArrayList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.ArrayList<E> newArrayList(java.lang.Iterable<? extends E> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lf
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            goto L17
        Lf:
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r0 = newArrayList(r1)
        L17:
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.ArrayList<E> newArrayList(java.util.Iterator<? extends E> r1) {
            java.util.ArrayList r0 = newArrayList()
            com.google.common.collect.Iterators.addAll(r0, r1)
            return r0
    }

    @java.lang.SafeVarargs
    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.ArrayList<E> newArrayList(E... r5) {
            com.google.common.base.Preconditions.checkNotNull(r5)
            int r0 = r5.length
            java.lang.String r1 = "arraySize"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r0, r1)
            long r1 = (long) r0
            r3 = 5
            long r1 = r1 + r3
            int r0 = r0 / 10
            long r3 = (long) r0
            long r1 = r1 + r3
            int r0 = com.google.common.primitives.Ints.saturatedCast(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Collections.addAll(r1, r5)
            return r1
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.ArrayList<E> newArrayListWithCapacity(int r1) {
            java.lang.String r0 = "initialArraySize"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.ArrayList<E> newArrayListWithExpectedSize(int r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "arraySize"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r5, r1)
            long r1 = (long) r5
            r3 = 5
            long r1 = r1 + r3
            int r5 = r5 / 10
            long r3 = (long) r5
            long r1 = r1 + r3
            int r5 = com.google.common.primitives.Ints.saturatedCast(r1)
            r0.<init>(r5)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.CopyOnWriteArrayList<E> newCopyOnWriteArrayList(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L7
            java.util.Collection r1 = (java.util.Collection) r1
            goto Lb
        L7:
            java.util.ArrayList r1 = newArrayList(r1)
        Lb:
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.LinkedList<E> newLinkedList() {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.LinkedList<E> newLinkedList(java.lang.Iterable<? extends E> r1) {
            java.util.LinkedList r0 = newLinkedList()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    public static <T> java.util.List<java.util.List<T>> partition(java.util.List<T> r1, int r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            if (r2 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L15
            com.google.common.collect.Lists$RandomAccessPartition r0 = new com.google.common.collect.Lists$RandomAccessPartition
            r0.<init>(r1, r2)
            goto L1a
        L15:
            com.google.common.collect.Lists$Partition r0 = new com.google.common.collect.Lists$Partition
            r0.<init>(r1, r2)
        L1a:
            return r0
    }

    public static <T> java.util.List<T> reverse(java.util.List<T> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.ImmutableList
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableList r1 = (com.google.common.collect.ImmutableList) r1
            com.google.common.collect.ImmutableList r1 = r1.reverse()
            return r1
        Lb:
            boolean r0 = r1 instanceof com.google.common.collect.Lists.ReverseList
            if (r0 == 0) goto L16
            com.google.common.collect.Lists$ReverseList r1 = (com.google.common.collect.Lists.ReverseList) r1
            java.util.List r1 = r1.getForwardList()
            return r1
        L16:
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L20
            com.google.common.collect.Lists$RandomAccessReverseList r0 = new com.google.common.collect.Lists$RandomAccessReverseList
            r0.<init>(r1)
            return r0
        L20:
            com.google.common.collect.Lists$ReverseList r0 = new com.google.common.collect.Lists$ReverseList
            r0.<init>(r1)
            return r0
    }

    public static <F, T> java.util.List<T> transform(java.util.List<F> r1, com.google.common.base.Function<? super F, ? extends T> r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto La
            com.google.common.collect.Lists$TransformingRandomAccessList r0 = new com.google.common.collect.Lists$TransformingRandomAccessList
            r0.<init>(r1, r2)
            goto Lf
        La:
            com.google.common.collect.Lists$TransformingSequentialList r0 = new com.google.common.collect.Lists$TransformingSequentialList
            r0.<init>(r1, r2)
        Lf:
            return r0
    }
}
