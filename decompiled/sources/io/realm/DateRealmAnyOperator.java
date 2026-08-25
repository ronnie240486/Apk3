package io.realm;

/* JADX INFO: compiled from: RealmAnyOperator.java */
/* JADX INFO: loaded from: classes.dex */
final class DateRealmAnyOperator extends io.realm.PrimitiveRealmAnyOperator {
    public DateRealmAnyOperator(io.realm.internal.core.NativeRealmAny r3) {
            r2 = this;
            java.util.Date r0 = r3.asDate()
            io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.DATE
            r2.<init>(r0, r1, r3)
            return
    }

    public DateRealmAnyOperator(java.util.Date r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.DATE
            r1.<init>(r2, r0)
            return
    }

    @Override // io.realm.RealmAnyOperator
    public final io.realm.internal.core.NativeRealmAny createNativeRealmAny() {
            r2 = this;
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            java.lang.Object r1 = r2.getValue(r1)
            java.util.Date r1 = (java.util.Date) r1
            r0.<init>(r1)
            return r0
    }
}
