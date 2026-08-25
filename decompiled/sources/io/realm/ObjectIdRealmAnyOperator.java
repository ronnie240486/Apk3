package io.realm;

/* JADX INFO: compiled from: RealmAnyOperator.java */
/* JADX INFO: loaded from: classes3.dex */
final class ObjectIdRealmAnyOperator extends io.realm.PrimitiveRealmAnyOperator {
    public ObjectIdRealmAnyOperator(io.realm.internal.core.NativeRealmAny r3) {
            r2 = this;
            org.bson.types.ObjectId r0 = r3.asObjectId()
            io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.OBJECT_ID
            r2.<init>(r0, r1, r3)
            return
    }

    public ObjectIdRealmAnyOperator(org.bson.types.ObjectId r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.OBJECT_ID
            r1.<init>(r2, r0)
            return
    }

    @Override // io.realm.RealmAnyOperator
    public final io.realm.internal.core.NativeRealmAny createNativeRealmAny() {
            r2 = this;
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            java.lang.Class<org.bson.types.ObjectId> r1 = org.bson.types.ObjectId.class
            java.lang.Object r1 = r2.getValue(r1)
            org.bson.types.ObjectId r1 = (org.bson.types.ObjectId) r1
            r0.<init>(r1)
            return r0
    }
}
