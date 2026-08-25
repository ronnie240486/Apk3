package io.realm;

/* JADX INFO: compiled from: SetValueOperator.java */
/* JADX INFO: loaded from: classes3.dex */
class IntegerSetIterator extends io.realm.SetIterator<java.lang.Integer> {
    public IntegerSetIterator(io.realm.internal.OsSet r1, io.realm.BaseRealm r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.realm.SetIterator
    public final java.lang.Integer getValueAtIndex(int r2) {
            r1 = this;
            io.realm.internal.OsSet r0 = r1.osSet
            java.lang.Object r2 = r0.getValueAtIndex(r2)
            if (r2 != 0) goto La
            r2 = 0
            goto L14
        La:
            java.lang.Long r2 = (java.lang.Long) r2
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L14:
            return r2
    }
}
