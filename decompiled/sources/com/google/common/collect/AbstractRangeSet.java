package com.google.common.collect;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class AbstractRangeSet<C extends java.lang.Comparable> implements com.google.common.collect.RangeSet<C> {
    public AbstractRangeSet() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.RangeSet
    public void add(com.google.common.collect.Range<C> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.RangeSet
    public void addAll(com.google.common.collect.RangeSet<C> r1) {
            r0 = this;
            java.util.Set r1 = r1.asRanges()
            r0.addAll(r1)
            return
    }

    @Override // com.google.common.collect.RangeSet
    public void addAll(java.lang.Iterable<com.google.common.collect.Range<C>> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            r1.add(r0)
            goto L4
        L14:
            return
    }

    @Override // com.google.common.collect.RangeSet
    public void clear() {
            r1 = this;
            com.google.common.collect.Range r0 = com.google.common.collect.Range.all()
            r1.remove(r0)
            return
    }

    @Override // com.google.common.collect.RangeSet
    public boolean contains(C r1) {
            r0 = this;
            com.google.common.collect.Range r1 = r0.rangeContaining(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // com.google.common.collect.RangeSet
    public abstract boolean encloses(com.google.common.collect.Range<C> r1);

    @Override // com.google.common.collect.RangeSet
    public boolean enclosesAll(com.google.common.collect.RangeSet<C> r1) {
            r0 = this;
            java.util.Set r1 = r1.asRanges()
            boolean r1 = r0.enclosesAll(r1)
            return r1
    }

    @Override // com.google.common.collect.RangeSet
    public boolean enclosesAll(java.lang.Iterable<com.google.common.collect.Range<C>> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            boolean r0 = r1.encloses(r0)
            if (r0 != 0) goto L4
            r2 = 0
            return r2
        L18:
            r2 = 1
            return r2
    }

    @Override // com.google.common.collect.RangeSet
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.RangeSet
            if (r0 == 0) goto L17
            com.google.common.collect.RangeSet r2 = (com.google.common.collect.RangeSet) r2
            java.util.Set r0 = r1.asRanges()
            java.util.Set r2 = r2.asRanges()
            boolean r2 = r0.equals(r2)
            return r2
        L17:
            r2 = 0
            return r2
    }

    @Override // com.google.common.collect.RangeSet
    public final int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.asRanges()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.RangeSet
    public boolean intersects(com.google.common.collect.Range<C> r1) {
            r0 = this;
            com.google.common.collect.RangeSet r1 = r0.subRangeSet(r1)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    @Override // com.google.common.collect.RangeSet
    public boolean isEmpty() {
            r1 = this;
            java.util.Set r0 = r1.asRanges()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.RangeSet
    @javax.annotation.CheckForNull
    public abstract com.google.common.collect.Range<C> rangeContaining(C r1);

    @Override // com.google.common.collect.RangeSet
    public void remove(com.google.common.collect.Range<C> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.common.collect.RangeSet
    public void removeAll(com.google.common.collect.RangeSet<C> r1) {
            r0 = this;
            java.util.Set r1 = r1.asRanges()
            r0.removeAll(r1)
            return
    }

    @Override // com.google.common.collect.RangeSet
    public void removeAll(java.lang.Iterable<com.google.common.collect.Range<C>> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            com.google.common.collect.Range r0 = (com.google.common.collect.Range) r0
            r1.remove(r0)
            goto L4
        L14:
            return
    }

    @Override // com.google.common.collect.RangeSet
    public final java.lang.String toString() {
            r1 = this;
            java.util.Set r0 = r1.asRanges()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
