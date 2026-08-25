package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class ImmutableAsList<E> extends com.google.common.collect.ImmutableList<E> {

    @com.google.common.annotations.GwtIncompatible
    public static class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
    }

    public ImmutableAsList() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r2) throws java.io.InvalidObjectException {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Use SerializedForm"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.delegateCollection()
            boolean r2 = r0.contains(r2)
            return r2
    }

    public abstract com.google.common.collect.ImmutableCollection<E> delegateCollection();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.delegateCollection()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.delegateCollection()
            boolean r0 = r0.isPartialView()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.delegateCollection()
            int r0 = r0.size()
            return r0
    }
}
