package io.realm;

/* JADX INFO: compiled from: RealmAnyOperator.java */
/* JADX INFO: loaded from: classes2.dex */
final class DynamicRealmModelRealmAnyOperator extends io.realm.RealmModelOperator {
    public DynamicRealmModelRealmAnyOperator(io.realm.BaseRealm r1, io.realm.internal.core.NativeRealmAny r2) {
            r0 = this;
            io.realm.RealmModel r1 = getRealmModel(r1, r2)
            r0.<init>(r1)
            return
    }

    private static <T extends io.realm.RealmModel> T getRealmModel(io.realm.BaseRealm r4, io.realm.internal.core.NativeRealmAny r5) {
            io.realm.internal.OsSharedRealm r0 = r4.sharedRealm
            java.lang.String r0 = r5.getRealmModelTableName(r0)
            java.lang.String r0 = io.realm.internal.Table.getClassNameForTable(r0)
            java.lang.Class<io.realm.DynamicRealmObject> r1 = io.realm.DynamicRealmObject.class
            long r2 = r5.getRealmModelRowKey()
            io.realm.RealmModel r4 = r4.get(r1, r0, r2)
            return r4
    }

    @Override // io.realm.RealmModelOperator, io.realm.RealmAnyOperator
    public final java.lang.Class<?> getTypedClass() {
            r1 = this;
            java.lang.Class<io.realm.DynamicRealmObject> r0 = io.realm.DynamicRealmObject.class
            return r0
    }
}
