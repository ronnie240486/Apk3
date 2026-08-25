package io.realm;

import io.realm.RealmModel;

/* JADX INFO: compiled from: SetValueOperator.java */
/* JADX INFO: loaded from: classes2.dex */
class RealmModelSetIterator<T extends io.realm.RealmModel> extends io.realm.SetIterator<T> {
    private final java.lang.Class<T> valueClass;

    public RealmModelSetIterator(io.realm.internal.OsSet r1, io.realm.BaseRealm r2, java.lang.Class<T> r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.valueClass = r3
            return
    }

    @Override // io.realm.SetIterator
    public final java.lang.Object getValueAtIndex(int r5) {
            r4 = this;
            io.realm.internal.OsSet r0 = r4.osSet
            long r0 = r0.getRow(r5)
            io.realm.BaseRealm r5 = r4.baseRealm
            java.lang.Class<T extends io.realm.RealmModel> r2 = r4.valueClass
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            io.realm.RealmModel r5 = r5.get(r2, r0, r3)
            return r5
    }
}
