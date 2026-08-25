package io.realm;

/* JADX INFO: compiled from: RealmAnyOperator.java */
/* JADX INFO: loaded from: classes2.dex */
final class Decimal128RealmAnyOperator extends io.realm.PrimitiveRealmAnyOperator {
    public Decimal128RealmAnyOperator(io.realm.internal.core.NativeRealmAny r3) {
            r2 = this;
            org.bson.types.Decimal128 r0 = r3.asDecimal128()
            io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.DECIMAL128
            r2.<init>(r0, r1, r3)
            return
    }

    public Decimal128RealmAnyOperator(org.bson.types.Decimal128 r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.DECIMAL128
            r1.<init>(r2, r0)
            return
    }

    @Override // io.realm.RealmAnyOperator
    public final io.realm.internal.core.NativeRealmAny createNativeRealmAny() {
            r2 = this;
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            java.lang.Class<org.bson.types.Decimal128> r1 = org.bson.types.Decimal128.class
            java.lang.Object r1 = r2.getValue(r1)
            org.bson.types.Decimal128 r1 = (org.bson.types.Decimal128) r1
            r0.<init>(r1)
            return r0
    }
}
