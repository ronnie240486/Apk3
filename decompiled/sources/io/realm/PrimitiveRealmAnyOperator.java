package io.realm;

/* JADX INFO: compiled from: RealmAnyOperator.java */
/* JADX INFO: loaded from: classes.dex */
abstract class PrimitiveRealmAnyOperator extends io.realm.RealmAnyOperator {

    @javax.annotation.Nullable
    private final java.lang.Object value;

    public PrimitiveRealmAnyOperator(@javax.annotation.Nullable java.lang.Object r1, @javax.annotation.Nonnull io.realm.RealmAny.Type r2) {
            r0 = this;
            r0.<init>(r2)
            r0.value = r1
            return
    }

    public PrimitiveRealmAnyOperator(@javax.annotation.Nullable java.lang.Object r1, @javax.annotation.Nonnull io.realm.RealmAny.Type r2, @javax.annotation.Nonnull io.realm.internal.core.NativeRealmAny r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.value = r1
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L22
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L12
            goto L22
        L12:
            io.realm.PrimitiveRealmAnyOperator r4 = (io.realm.PrimitiveRealmAnyOperator) r4
            java.lang.Object r1 = r3.value
            java.lang.Object r4 = r4.value
            if (r1 != 0) goto L1e
            if (r4 != 0) goto L22
            r0 = 1
            goto L22
        L1e:
            boolean r0 = r1.equals(r4)
        L22:
            return r0
    }

    @Override // io.realm.RealmAnyOperator
    public final <T> T getValue(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.Object r0 = r1.value
            java.lang.Object r2 = r2.cast(r0)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.value
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.value
            java.lang.String r0 = r0.toString()
            return r0
    }
}
