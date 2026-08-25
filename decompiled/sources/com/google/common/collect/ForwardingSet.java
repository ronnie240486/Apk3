package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingSet<E> extends com.google.common.collect.ForwardingCollection<E> implements java.util.Set<E> {
    public ForwardingSet() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Set r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.Set r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.Set<E> delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto Lf
            java.util.Set r0 = r1.delegate()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.delegate()
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean standardRemoveAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.google.common.collect.Sets.removeAllImpl(r0, r1)
            return r1
    }
}
