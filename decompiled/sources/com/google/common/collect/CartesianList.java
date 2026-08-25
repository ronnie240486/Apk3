package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class CartesianList<E> extends java.util.AbstractList<java.util.List<E>> implements java.util.RandomAccess {
    public static final /* synthetic */ int $r8$clinit = 0;
    private final transient com.google.common.collect.ImmutableList<java.util.List<E>> axes;
    private final transient int[] axesSizeProduct;


    public CartesianList(com.google.common.collect.ImmutableList<java.util.List<E>> r5) {
            r4 = this;
            r4.<init>()
            r4.axes = r5
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            int r2 = r5.size()
            r0[r2] = r1
            int r2 = r5.size()     // Catch: java.lang.ArithmeticException -> L34
            int r2 = r2 - r1
        L18:
            if (r2 < 0) goto L31
            int r1 = r2 + 1
            r1 = r0[r1]     // Catch: java.lang.ArithmeticException -> L34
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.ArithmeticException -> L34
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.ArithmeticException -> L34
            int r3 = r3.size()     // Catch: java.lang.ArithmeticException -> L34
            int r1 = com.google.common.math.IntMath.checkedMultiply(r1, r3)     // Catch: java.lang.ArithmeticException -> L34
            r0[r2] = r1     // Catch: java.lang.ArithmeticException -> L34
            int r2 = r2 + (-1)
            goto L18
        L31:
            r4.axesSizeProduct = r0
            return
        L34:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cartesian product too large; must have size at most Integer.MAX_VALUE"
            r5.<init>(r0)
            throw r5
    }

    public static /* synthetic */ com.google.common.collect.ImmutableList access$000(com.google.common.collect.CartesianList r0) {
            com.google.common.collect.ImmutableList<java.util.List<E>> r0 = r0.axes
            return r0
    }

    public static /* synthetic */ int access$100(com.google.common.collect.CartesianList r0, int r1, int r2) {
            int r0 = r0.getAxisIndexForProductIndex(r1, r2)
            return r0
    }

    private int getAxisIndexForProductIndex(int r3, int r4) {
            r2 = this;
            int[] r0 = r2.axesSizeProduct
            int r1 = r4 + 1
            r0 = r0[r1]
            int r3 = r3 / r0
            com.google.common.collect.ImmutableList<java.util.List<E>> r0 = r2.axes
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            int r3 = r3 % r4
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.util.List
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            com.google.common.collect.ImmutableList<java.util.List<E>> r2 = r4.axes
            int r2 = r2.size()
            if (r0 == r2) goto L15
            return r1
        L15:
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L1a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r5.next()
            com.google.common.collect.ImmutableList<java.util.List<E>> r3 = r4.axes
            java.lang.Object r3 = r3.get(r0)
            java.util.List r3 = (java.util.List) r3
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L33
            return r1
        L33:
            int r0 = r0 + 1
            goto L1a
        L36:
            r5 = 1
            return r5
    }

    @Override // java.util.AbstractList, java.util.List
    public com.google.common.collect.ImmutableList<E> get(int r2) {
            r1 = this;
            int r0 = r1.size()
            com.google.common.base.Preconditions.checkElementIndex(r2, r0)
            com.google.common.collect.CartesianList$1 r0 = new com.google.common.collect.CartesianList$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(@javax.annotation.CheckForNull java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof java.util.List
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            com.google.common.collect.ImmutableList<java.util.List<E>> r2 = r5.axes
            int r2 = r2.size()
            if (r0 == r2) goto L15
            return r1
        L15:
            java.util.ListIterator r6 = r6.listIterator()
            r0 = 0
        L1a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L41
            int r2 = r6.nextIndex()
            com.google.common.collect.ImmutableList<java.util.List<E>> r3 = r5.axes
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r6.next()
            int r3 = r3.indexOf(r4)
            if (r3 != r1) goto L37
            return r1
        L37:
            int[] r4 = r5.axesSizeProduct
            int r2 = r2 + 1
            r2 = r4[r2]
            int r3 = r3 * r2
            int r0 = r0 + r3
            goto L1a
        L41:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof java.util.List
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            com.google.common.collect.ImmutableList<java.util.List<E>> r2 = r5.axes
            int r2 = r2.size()
            if (r0 == r2) goto L15
            return r1
        L15:
            java.util.ListIterator r6 = r6.listIterator()
            r0 = 0
        L1a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L41
            int r2 = r6.nextIndex()
            com.google.common.collect.ImmutableList<java.util.List<E>> r3 = r5.axes
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r6.next()
            int r3 = r3.lastIndexOf(r4)
            if (r3 != r1) goto L37
            return r1
        L37:
            int[] r4 = r5.axesSizeProduct
            int r2 = r2 + 1
            r2 = r4[r2]
            int r3 = r3 * r2
            int r0 = r0 + r3
            goto L1a
        L41:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r2 = this;
            int[] r0 = r2.axesSizeProduct
            r1 = 0
            r0 = r0[r1]
            return r0
    }
}
