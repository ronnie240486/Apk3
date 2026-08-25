package io.realm;

/* JADX INFO: compiled from: ManagedMapManager.java */
/* JADX INFO: loaded from: classes2.dex */
class GenericPrimitiveValueOperator<K, V> extends io.realm.MapValueOperator<K, V> {
    private final io.realm.EqualsHelper<K, V> equalsHelper;

    public GenericPrimitiveValueOperator(java.lang.Class<V> r8, io.realm.BaseRealm r9, io.realm.internal.OsMap r10, io.realm.TypeSelectorForMap<K, V> r11, io.realm.RealmMapEntrySet.IteratorType r12) {
            r7 = this;
            io.realm.GenericEquals r6 = new io.realm.GenericEquals
            r6.<init>()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public GenericPrimitiveValueOperator(java.lang.Class<V> r1, io.realm.BaseRealm r2, io.realm.internal.OsMap r3, io.realm.TypeSelectorForMap<K, V> r4, io.realm.RealmMapEntrySet.IteratorType r5, io.realm.EqualsHelper<K, V> r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r0.equalsHelper = r6
            return
    }

    @Override // io.realm.MapValueOperator
    public final boolean containsValueInternal(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            io.realm.internal.OsMap r0 = r1.osMap
            boolean r2 = r0.containsPrimitiveValue(r2)
            return r2
    }

    @Override // io.realm.MapValueOperator
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r5 = this;
            io.realm.RealmMapEntrySet r0 = new io.realm.RealmMapEntrySet
            io.realm.BaseRealm r1 = r5.baseRealm
            io.realm.internal.OsMap r2 = r5.osMap
            io.realm.RealmMapEntrySet$IteratorType r3 = r5.iteratorType
            io.realm.EqualsHelper<K, V> r4 = r5.equalsHelper
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // io.realm.MapValueOperator
    @javax.annotation.Nullable
    public final V get(java.lang.Object r2) {
            r1 = this;
            io.realm.internal.OsMap r0 = r1.osMap
            java.lang.Object r2 = r0.get(r2)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.Object r2 = r1.processValue(r2)
            return r2
    }

    @javax.annotation.Nullable
    public V processValue(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    @Override // io.realm.MapValueOperator
    @javax.annotation.Nullable
    public final V put(K r3, @javax.annotation.Nullable V r4) {
            r2 = this;
            java.lang.Object r0 = r2.get(r3)
            io.realm.internal.OsMap r1 = r2.osMap
            r1.put(r3, r4)
            return r0
    }
}
