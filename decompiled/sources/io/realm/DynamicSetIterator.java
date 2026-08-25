package io.realm;

/* JADX INFO: compiled from: SetValueOperator.java */
/* JADX INFO: loaded from: classes.dex */
class DynamicSetIterator extends io.realm.SetIterator<io.realm.DynamicRealmObject> {
    private final java.lang.String className;

    public DynamicSetIterator(io.realm.internal.OsSet r1, io.realm.BaseRealm r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.className = r3
            return
    }

    @Override // io.realm.SetIterator
    public final io.realm.DynamicRealmObject getValueAtIndex(int r5) {
            r4 = this;
            io.realm.internal.OsSet r0 = r4.osSet
            long r0 = r0.getRow(r5)
            io.realm.BaseRealm r5 = r4.baseRealm
            java.lang.Class<io.realm.DynamicRealmObject> r2 = io.realm.DynamicRealmObject.class
            java.lang.String r3 = r4.className
            io.realm.RealmModel r5 = r5.get(r2, r3, r0)
            io.realm.DynamicRealmObject r5 = (io.realm.DynamicRealmObject) r5
            return r5
    }
}
