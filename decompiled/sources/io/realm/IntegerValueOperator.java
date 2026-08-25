package io.realm;

/* JADX INFO: compiled from: ManagedMapManager.java */
/* JADX INFO: loaded from: classes.dex */
class IntegerValueOperator<K> extends io.realm.GenericPrimitiveValueOperator<K, java.lang.Integer> {
    public IntegerValueOperator(io.realm.BaseRealm r7, io.realm.internal.OsMap r8, io.realm.TypeSelectorForMap<K, java.lang.Integer> r9) {
            r6 = this;
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            io.realm.RealmMapEntrySet$IteratorType r5 = io.realm.RealmMapEntrySet.IteratorType.INTEGER
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // io.realm.GenericPrimitiveValueOperator
    public final java.lang.Integer processValue(java.lang.Object r1) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }
}
