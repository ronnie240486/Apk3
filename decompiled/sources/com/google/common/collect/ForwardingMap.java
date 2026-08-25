package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingMap<K, V> extends com.google.common.collect.ForwardingObject implements java.util.Map<K, V> {

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.Beta
    public abstract class StandardEntrySet extends com.google.common.collect.Maps.EntrySet<K, V> {
        public final /* synthetic */ com.google.common.collect.ForwardingMap this$0;

        public StandardEntrySet(com.google.common.collect.ForwardingMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.Maps.EntrySet
        public final java.util.Map<K, V> map() {
                r1 = this;
                com.google.common.collect.ForwardingMap r0 = r1.this$0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @com.google.common.annotations.Beta
    public class StandardKeySet extends com.google.common.collect.Maps.KeySet<K, V> {
        public StandardKeySet(com.google.common.collect.ForwardingMap r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @com.google.common.annotations.Beta
    public class StandardValues extends com.google.common.collect.Maps.Values<K, V> {
        public StandardValues(com.google.common.collect.ForwardingMap r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public ForwardingMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public void clear() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            r0.clear()
            return
    }

    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.Map<K, V> delegate();

    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto Lf
            java.util.Map r0 = r1.delegate()
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

    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            boolean r0 = r0.isEmpty()
            return r0
    }

    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V put(@com.google.common.collect.ParametricNullness K r2, @com.google.common.collect.ParametricNullness V r3) {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    public void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            r0.putAll(r2)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    public int size() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            int r0 = r0.size()
            return r0
    }

    public final boolean standardContainsValue(@javax.annotation.CheckForNull java.lang.Object r3) {
            r2 = this;
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.Maps$2 r1 = new com.google.common.collect.Maps$2
            r1.<init>(r0)
            boolean r3 = com.google.common.collect.Iterators.contains(r1, r3)
            return r3
    }

    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            java.util.Collection r0 = r0.values()
            return r0
    }
}
