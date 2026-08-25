package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public class SetChangeSet {
    private final io.realm.internal.OsCollectionChangeSet osCollectionChangeSet;

    public SetChangeSet(io.realm.internal.OsCollectionChangeSet r1) {
            r0 = this;
            r0.<init>()
            r0.osCollectionChangeSet = r1
            return
    }

    public int getNumberOfDeletions() {
            r1 = this;
            io.realm.internal.OsCollectionChangeSet r0 = r1.osCollectionChangeSet
            int[] r0 = r0.getDeletions()
            int r0 = r0.length
            return r0
    }

    public int getNumberOfInsertions() {
            r1 = this;
            io.realm.internal.OsCollectionChangeSet r0 = r1.osCollectionChangeSet
            int[] r0 = r0.getInsertions()
            int r0 = r0.length
            return r0
    }

    public boolean isEmpty() {
            r5 = this;
            io.realm.internal.OsCollectionChangeSet r0 = r5.osCollectionChangeSet
            long r0 = r0.getNativePtr()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }
}
