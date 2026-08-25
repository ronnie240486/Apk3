package io.realm;

/* JADX INFO: compiled from: SetValueOperator.java */
/* JADX INFO: loaded from: classes.dex */
class RealmAnySetIterator extends io.realm.SetIterator<io.realm.RealmAny> {
    public RealmAnySetIterator(io.realm.internal.OsSet r1, io.realm.BaseRealm r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.realm.SetIterator
    public final io.realm.RealmAny getValueAtIndex(int r4) {
            r3 = this;
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            io.realm.internal.OsSet r1 = r3.osSet
            long r1 = r1.getRealmAny(r4)
            r0.<init>(r1)
            io.realm.RealmAny r4 = new io.realm.RealmAny
            io.realm.BaseRealm r1 = r3.baseRealm
            io.realm.RealmAnyOperator r0 = io.realm.RealmAnyOperator.fromNativeRealmAny(r1, r0)
            r4.<init>(r0)
            return r4
    }
}
