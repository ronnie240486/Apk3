package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public class StatefulCollectionChangeSet implements io.realm.OrderedCollectionChangeSet {
    private final io.realm.OrderedCollectionChangeSet changeset;
    private final java.lang.Throwable error;
    private final io.realm.OrderedCollectionChangeSet.State state;

    public StatefulCollectionChangeSet(io.realm.internal.OsCollectionChangeSet r2) {
            r1 = this;
            r1.<init>()
            r1.changeset = r2
            boolean r0 = r2.isFirstAsyncCallback()
            java.lang.Throwable r2 = r2.getError()
            r1.error = r2
            if (r2 == 0) goto L16
            io.realm.OrderedCollectionChangeSet$State r2 = io.realm.OrderedCollectionChangeSet.State.ERROR
            r1.state = r2
            goto L1f
        L16:
            if (r0 == 0) goto L1b
            io.realm.OrderedCollectionChangeSet$State r2 = io.realm.OrderedCollectionChangeSet.State.INITIAL
            goto L1d
        L1b:
            io.realm.OrderedCollectionChangeSet$State r2 = io.realm.OrderedCollectionChangeSet.State.UPDATE
        L1d:
            r1.state = r2
        L1f:
            return
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public io.realm.OrderedCollectionChangeSet.Range[] getChangeRanges() {
            r1 = this;
            io.realm.OrderedCollectionChangeSet r0 = r1.changeset
            io.realm.OrderedCollectionChangeSet$Range[] r0 = r0.getChangeRanges()
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public int[] getChanges() {
            r1 = this;
            io.realm.OrderedCollectionChangeSet r0 = r1.changeset
            int[] r0 = r0.getChanges()
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public io.realm.OrderedCollectionChangeSet.Range[] getDeletionRanges() {
            r1 = this;
            io.realm.OrderedCollectionChangeSet r0 = r1.changeset
            io.realm.OrderedCollectionChangeSet$Range[] r0 = r0.getDeletionRanges()
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public int[] getDeletions() {
            r1 = this;
            io.realm.OrderedCollectionChangeSet r0 = r1.changeset
            int[] r0 = r0.getDeletions()
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    @javax.annotation.Nullable
    public java.lang.Throwable getError() {
            r1 = this;
            java.lang.Throwable r0 = r1.error
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public io.realm.OrderedCollectionChangeSet.Range[] getInsertionRanges() {
            r1 = this;
            io.realm.OrderedCollectionChangeSet r0 = r1.changeset
            io.realm.OrderedCollectionChangeSet$Range[] r0 = r0.getInsertionRanges()
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public int[] getInsertions() {
            r1 = this;
            io.realm.OrderedCollectionChangeSet r0 = r1.changeset
            int[] r0 = r0.getInsertions()
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public io.realm.OrderedCollectionChangeSet.State getState() {
            r1 = this;
            io.realm.OrderedCollectionChangeSet$State r0 = r1.state
            return r0
    }
}
