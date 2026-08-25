package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingMultiset<E> extends com.google.common.collect.ForwardingCollection<E> implements com.google.common.collect.Multiset<E> {

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.Beta
    public class StandardElementSet extends com.google.common.collect.Multisets.ElementSet<E> {
        public final /* synthetic */ com.google.common.collect.ForwardingMultiset this$0;

        public StandardElementSet(com.google.common.collect.ForwardingMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
                r2 = this;
                com.google.common.collect.ForwardingMultiset r0 = r2.this$0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                com.google.common.collect.Multisets$5 r1 = new com.google.common.collect.Multisets$5
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public final com.google.common.collect.Multiset<E> multiset() {
                r1 = this;
                com.google.common.collect.ForwardingMultiset r0 = r1.this$0
                return r0
        }
    }

    public ForwardingMultiset() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int add(@com.google.common.collect.ParametricNullness E r2, int r3) {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            int r2 = r0.add(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            int r2 = r0.count(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.Multiset<E> delegate();

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            return r0
    }

    public java.util.Set<E> elementSet() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            java.util.Set r0 = r0.elementSet()
            return r0
    }

    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto Lf
            com.google.common.collect.Multiset r0 = r1.delegate()
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

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int remove(@javax.annotation.CheckForNull java.lang.Object r2, int r3) {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            int r2 = r0.remove(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int setCount(@com.google.common.collect.ParametricNullness E r2, int r3) {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            int r2 = r0.setCount(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean setCount(@com.google.common.collect.ParametricNullness E r2, int r3, int r4) {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            boolean r2 = r0.setCount(r2, r3, r4)
            return r2
    }
}
