package io.realm;

/* JADX INFO: compiled from: RealmAnyOperator.java */
/* JADX INFO: loaded from: classes2.dex */
final class DoubleRealmAnyOperator extends io.realm.PrimitiveRealmAnyOperator {
    public DoubleRealmAnyOperator(io.realm.internal.core.NativeRealmAny r3) {
            r2 = this;
            double r0 = r3.asDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.DOUBLE
            r2.<init>(r0, r1, r3)
            return
    }

    public DoubleRealmAnyOperator(java.lang.Double r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.DOUBLE
            r1.<init>(r2, r0)
            return
    }

    @Override // io.realm.RealmAnyOperator
    public final io.realm.internal.core.NativeRealmAny createNativeRealmAny() {
            r2 = this;
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            java.lang.Object r1 = r2.getValue(r1)
            java.lang.Double r1 = (java.lang.Double) r1
            r0.<init>(r1)
            return r0
    }
}
