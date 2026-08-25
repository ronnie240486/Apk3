package io.realm;

/* JADX INFO: compiled from: RealmAnyOperator.java */
/* JADX INFO: loaded from: classes.dex */
final class NullRealmAnyOperator extends io.realm.RealmAnyOperator {
    public NullRealmAnyOperator() {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.NULL
            r1.<init>(r0)
            return
    }

    public NullRealmAnyOperator(io.realm.internal.core.NativeRealmAny r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.NULL
            r1.<init>(r0, r2)
            return
    }

    @Override // io.realm.RealmAnyOperator
    public final io.realm.internal.core.NativeRealmAny createNativeRealmAny() {
            r1 = this;
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            r0.<init>()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L10
            java.lang.Class<io.realm.NullRealmAnyOperator> r0 = io.realm.NullRealmAnyOperator.class
            java.lang.Class r2 = r2.getClass()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    @Override // io.realm.RealmAnyOperator
    public <T> T getValue(java.lang.Class<T> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "null"
            return r0
    }
}
