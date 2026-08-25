package io.realm;

/* JADX INFO: compiled from: RealmAnyOperator.java */
/* JADX INFO: loaded from: classes2.dex */
final class BinaryRealmAnyOperator extends io.realm.PrimitiveRealmAnyOperator {
    public BinaryRealmAnyOperator(io.realm.internal.core.NativeRealmAny r3) {
            r2 = this;
            byte[] r0 = r3.asBinary()
            io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.BINARY
            r2.<init>(r0, r1, r3)
            return
    }

    public BinaryRealmAnyOperator(byte[] r2) {
            r1 = this;
            io.realm.RealmAny$Type r0 = io.realm.RealmAny.Type.BINARY
            r1.<init>(r2, r0)
            return
    }

    @Override // io.realm.RealmAnyOperator
    public final io.realm.internal.core.NativeRealmAny createNativeRealmAny() {
            r2 = this;
            io.realm.internal.core.NativeRealmAny r0 = new io.realm.internal.core.NativeRealmAny
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r1 = r2.getValue(r1)
            byte[] r1 = (byte[]) r1
            r0.<init>(r1)
            return r0
    }

    @Override // io.realm.PrimitiveRealmAnyOperator
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            if (r4 == 0) goto L24
            java.lang.Class<io.realm.BinaryRealmAnyOperator> r1 = io.realm.BinaryRealmAnyOperator.class
            java.lang.Class r2 = r4.getClass()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L11
            goto L24
        L11:
            io.realm.RealmAnyOperator r4 = (io.realm.RealmAnyOperator) r4
            java.lang.Object r1 = r3.getValue(r0)
            byte[] r1 = (byte[]) r1
            java.lang.Object r4 = r4.getValue(r0)
            byte[] r4 = (byte[]) r4
            boolean r4 = java.util.Arrays.equals(r1, r4)
            return r4
        L24:
            r4 = 0
            return r4
    }
}
