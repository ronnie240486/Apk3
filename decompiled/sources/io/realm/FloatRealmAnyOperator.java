package io.realm;

/* JADX INFO: compiled from: RealmAnyOperator.java */
/* JADX INFO: loaded from: classes3.dex */
final class FloatRealmAnyOperator extends io.realm.PrimitiveRealmAnyOperator {
    public FloatRealmAnyOperator(io.realm.internal.core.NativeRealmAny r3) {
            r2 = this;
            float r0 = r3.asFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.FLOAT
            r2.<init>(r0, r1, r3)
            return
    }

    public FloatRealmAnyOperator(java.lang.Float r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.FLOAT
            r1.<init>(r2, r0)
            return
    }

    @Override // io.realm.RealmAnyOperator
    public final io.realm.internal.core.NativeRealmAny createNativeRealmAny() {
            r2 = this;
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.Object r1 = r2.getValue(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            r0.<init>(r1)
            return r0
    }
}
