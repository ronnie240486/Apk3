package io.realm;

/* JADX INFO: compiled from: SetValueOperator.java */
/* JADX INFO: loaded from: classes.dex */
class BinarySetIterator extends io.realm.SetIterator<byte[]> {
    public BinarySetIterator(io.realm.internal.OsSet r1, io.realm.BaseRealm r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.realm.SetIterator
    public final byte[] getValueAtIndex(int r2) {
            r1 = this;
            io.realm.internal.OsSet r0 = r1.osSet
            java.lang.Object r2 = r0.getValueAtIndex(r2)
            if (r2 != 0) goto La
            r2 = 0
            goto Lc
        La:
            byte[] r2 = (byte[]) r2
        Lc:
            return r2
    }
}
