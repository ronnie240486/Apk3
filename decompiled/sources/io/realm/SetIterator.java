package io.realm;

/* JADX INFO: compiled from: SetValueOperator.java */
/* JADX INFO: loaded from: classes.dex */
abstract class SetIterator<E> implements java.util.Iterator<E> {
    public final io.realm.BaseRealm baseRealm;
    public final io.realm.internal.OsSet osSet;
    private int pos;

    public SetIterator(io.realm.internal.OsSet r2, io.realm.BaseRealm r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.pos = r0
            r1.osSet = r2
            r1.baseRealm = r3
            return
    }

    public E getValueAtIndex(int r2) {
            r1 = this;
            io.realm.internal.OsSet r0 = r1.osSet
            java.lang.Object r2 = r0.getValueAtIndex(r2)
            return r2
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r6 = this;
            int r0 = r6.pos
            r1 = 1
            int r0 = r0 + r1
            long r2 = (long) r0
            io.realm.internal.OsSet r0 = r6.osSet
            long r4 = r0.size()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L10
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @Override // java.util.Iterator
    public E next() {
            r6 = this;
            int r0 = r6.pos
            int r0 = r0 + 1
            r6.pos = r0
            io.realm.internal.OsSet r0 = r6.osSet
            long r0 = r0.size()
            int r2 = r6.pos
            long r3 = (long) r2
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L18
            java.lang.Object r0 = r6.getValueAtIndex(r2)
            return r0
        L18:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r3 = "Cannot access index "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r4 = r6.pos
            r3.append(r4)
            java.lang.String r4 = " when size is "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Remember to check hasNext() before using next()."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }
}
