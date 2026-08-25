package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingCollection<E> extends com.google.common.collect.ForwardingObject implements java.util.Collection<E> {
    public ForwardingCollection() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean add(@com.google.common.collect.ParametricNullness E r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.add(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean addAll(java.util.Collection<? extends E> r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.addAll(r2)
            return r2
    }

    public void clear() {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            r0.clear()
            return
    }

    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.contains(r2)
            return r2
    }

    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.Collection<E> delegate();

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r0 = r0.isEmpty()
            return r0
    }

    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.remove(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.removeAll(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.retainAll(r2)
            return r2
    }

    @Override // java.util.Collection
    public int size() {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            int r0 = r0.size()
            return r0
    }

    public final java.lang.Object[] standardToArray() {
            r1 = this;
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    public final java.lang.String standardToString() {
            r4 = this;
            int r0 = r4.size()
            java.lang.StringBuilder r0 = com.google.common.collect.Collections2.newStringBuilderForCollection(r0)
            r1 = 91
            r0.append(r1)
            java.util.Iterator r1 = r4.iterator()
            r2 = 1
        L12:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.next()
            if (r2 != 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            r2 = 0
            if (r3 != r4) goto L2c
            java.lang.String r3 = "(this Collection)"
            r0.append(r3)
            goto L12
        L2c:
            r0.append(r3)
            goto L12
        L30:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.Object[] toArray() {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }
}
