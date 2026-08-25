package io.realm;

/* JADX INFO: compiled from: SetValueOperator.java */
/* JADX INFO: loaded from: classes.dex */
class ByteSetIterator extends io.realm.SetIterator<java.lang.Byte> {
    public ByteSetIterator(io.realm.internal.OsSet r1, io.realm.BaseRealm r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.realm.SetIterator
    public final java.lang.Byte getValueAtIndex(int r2) {
            r1 = this;
            io.realm.internal.OsSet r0 = r1.osSet
            java.lang.Object r2 = r0.getValueAtIndex(r2)
            if (r2 != 0) goto La
            r2 = 0
            goto L14
        La:
            java.lang.Long r2 = (java.lang.Long) r2
            byte r2 = r2.byteValue()
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
        L14:
            return r2
    }
}
