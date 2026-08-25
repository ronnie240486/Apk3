package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingMultimap<K, V> extends com.google.common.collect.ForwardingObject implements com.google.common.collect.Multimap<K, V> {
    public ForwardingMultimap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Map<K, java.util.Collection<V>> asMap() {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            java.util.Map r0 = r0.asMap()
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            r0.clear()
            return
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            boolean r2 = r0.containsEntry(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.Multimap<K, V> delegate();

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            java.util.Collection r0 = r0.entries()
            return r0
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto Lf
            com.google.common.collect.Multimap r0 = r1.delegate()
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

    public java.util.Collection<V> get(@com.google.common.collect.ParametricNullness K r2) {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            java.util.Collection r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Set<K> keySet() {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public com.google.common.collect.Multiset<K> keys() {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            com.google.common.collect.Multiset r0 = r0.keys()
            return r0
    }

    @Override // com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean put(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness V r3) {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            boolean r2 = r0.put(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> r2) {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            boolean r2 = r0.putAll(r2)
            return r2
    }

    @Override // com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean putAll(@com.google.common.collect.ParametricNullness K r2, java.lang.Iterable<? extends V> r3) {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            boolean r2 = r0.putAll(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object r2, @javax.annotation.CheckForNull java.lang.Object r3) {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            boolean r2 = r0.remove(r2, r3)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.Collection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            java.util.Collection r2 = r0.removeAll(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.Collection<V> replaceValues(@com.google.common.collect.ParametricNullness K r2, java.lang.Iterable<? extends V> r3) {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            java.util.Collection r2 = r0.replaceValues(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<V> values() {
            r1 = this;
            com.google.common.collect.Multimap r0 = r1.delegate()
            java.util.Collection r0 = r0.values()
            return r0
    }
}
