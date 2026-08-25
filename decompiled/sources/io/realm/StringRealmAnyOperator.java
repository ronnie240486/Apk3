package io.realm;

/* JADX INFO: compiled from: RealmAnyOperator.java */
/* JADX INFO: loaded from: classes.dex */
final class StringRealmAnyOperator extends io.realm.PrimitiveRealmAnyOperator {
    public StringRealmAnyOperator(io.realm.internal.core.NativeRealmAny r3) {
            r2 = this;
            java.lang.String r0 = r3.asString()
            io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.STRING
            r2.<init>(r0, r1, r3)
            return
    }

    public StringRealmAnyOperator(java.lang.String r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.STRING
            r1.<init>(r2, r0)
            return
    }

    @Override // io.realm.RealmAnyOperator
    public final io.realm.internal.core.NativeRealmAny createNativeRealmAny() {
            r2 = this;
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r1 = r2.getValue(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            return r0
    }
}
