package io.realm;

/* JADX INFO: compiled from: RealmAnyOperator.java */
/* JADX INFO: loaded from: classes2.dex */
final class IntegerRealmAnyOperator extends io.realm.PrimitiveRealmAnyOperator {
    public IntegerRealmAnyOperator(io.realm.internal.core.NativeRealmAny r3) {
            r2 = this;
            long r0 = r3.asLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.INTEGER
            r2.<init>(r0, r1, r3)
            return
    }

    public IntegerRealmAnyOperator(java.lang.Byte r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.INTEGER
            r1.<init>(r2, r0)
            return
    }

    public IntegerRealmAnyOperator(java.lang.Integer r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.INTEGER
            r1.<init>(r2, r0)
            return
    }

    public IntegerRealmAnyOperator(java.lang.Long r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.INTEGER
            r1.<init>(r2, r0)
            return
    }

    public IntegerRealmAnyOperator(java.lang.Short r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.INTEGER
            r1.<init>(r2, r0)
            return
    }

    @Override // io.realm.RealmAnyOperator
    public final io.realm.internal.core.NativeRealmAny createNativeRealmAny() {
            r2 = this;
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            java.lang.Object r1 = r2.getValue(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            r0.<init>(r1)
            return r0
    }

    @Override // io.realm.PrimitiveRealmAnyOperator
    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L2f
            java.lang.Class<io.realm.IntegerRealmAnyOperator> r1 = io.realm.IntegerRealmAnyOperator.class
            java.lang.Class r2 = r6.getClass()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L10
            goto L2f
        L10:
            io.realm.RealmAnyOperator r6 = (io.realm.RealmAnyOperator) r6
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            java.lang.Object r1 = r5.getValue(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Class<java.lang.Number> r3 = java.lang.Number.class
            java.lang.Object r6 = r6.getValue(r3)
            java.lang.Number r6 = (java.lang.Number) r6
            long r3 = r6.longValue()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L2f
            r0 = 1
        L2f:
            return r0
    }
}
