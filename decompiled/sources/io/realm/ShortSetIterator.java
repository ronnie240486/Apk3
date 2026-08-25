package io.realm;

/* JADX INFO: compiled from: SetValueOperator.java */
/* JADX INFO: loaded from: classes2.dex */
class ShortSetIterator extends io.realm.SetIterator<java.lang.Short> {
    public ShortSetIterator(io.realm.internal.OsSet r1, io.realm.BaseRealm r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // io.realm.SetIterator
    public final java.lang.Short getValueAtIndex(int r2) {
            r1 = this;
            io.realm.internal.OsSet r0 = r1.osSet
            java.lang.Object r2 = r0.getValueAtIndex(r2)
            if (r2 != 0) goto La
            r2 = 0
            goto L14
        La:
            java.lang.Long r2 = (java.lang.Long) r2
            short r2 = r2.shortValue()
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
        L14:
            return r2
    }
}
