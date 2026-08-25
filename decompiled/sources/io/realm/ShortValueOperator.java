package io.realm;

/* JADX INFO: compiled from: ManagedMapManager.java */
/* JADX INFO: loaded from: classes3.dex */
class ShortValueOperator<K> extends io.realm.GenericPrimitiveValueOperator<K, java.lang.Short> {
    public ShortValueOperator(io.realm.BaseRealm r7, io.realm.internal.OsMap r8, io.realm.TypeSelectorForMap<K, java.lang.Short> r9) {
            r6 = this;
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.SHORT
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // io.realm.GenericPrimitiveValueOperator
    public final java.lang.Short processValue(java.lang.Object r1) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            short r1 = r1.shortValue()
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
    }
}
