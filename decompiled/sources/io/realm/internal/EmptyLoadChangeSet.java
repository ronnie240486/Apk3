package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class EmptyLoadChangeSet extends io.realm.internal.OsCollectionChangeSet {
    private static final int[] NO_INDEX_CHANGES = null;
    private static final io.realm.OrderedCollectionChangeSet.Range[] NO_RANGE_CHANGES = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            io.realm.internal.EmptyLoadChangeSet.NO_INDEX_CHANGES = r1
            io.realm.OrderedCollectionChangeSet$Range[] r0 = new io.realm.OrderedCollectionChangeSet.Range[r0]
            io.realm.internal.EmptyLoadChangeSet.NO_RANGE_CHANGES = r0
            return
    }

    public EmptyLoadChangeSet() {
            r3 = this;
            r0 = 0
            r2 = 1
            r3.<init>(r0, r2)
            return
    }

    public EmptyLoadChangeSet(boolean r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r0, r3)
            return
    }

    @Override // io.realm.internal.OsCollectionChangeSet, io.realm.OrderedCollectionChangeSet
    public io.realm.OrderedCollectionChangeSet.Range[] getChangeRanges() {
            r1 = this;
            io.realm.OrderedCollectionChangeSet$Range[] r0 = io.realm.internal.EmptyLoadChangeSet.NO_RANGE_CHANGES
            return r0
    }

    @Override // io.realm.internal.OsCollectionChangeSet, io.realm.OrderedCollectionChangeSet
    public int[] getChanges() {
            r1 = this;
            int[] r0 = io.realm.internal.EmptyLoadChangeSet.NO_INDEX_CHANGES
            return r0
    }

    @Override // io.realm.internal.OsCollectionChangeSet, io.realm.OrderedCollectionChangeSet
    public io.realm.OrderedCollectionChangeSet.Range[] getDeletionRanges() {
            r1 = this;
            io.realm.OrderedCollectionChangeSet$Range[] r0 = io.realm.internal.EmptyLoadChangeSet.NO_RANGE_CHANGES
            return r0
    }

    @Override // io.realm.internal.OsCollectionChangeSet, io.realm.OrderedCollectionChangeSet
    public int[] getDeletions() {
            r1 = this;
            int[] r0 = io.realm.internal.EmptyLoadChangeSet.NO_INDEX_CHANGES
            return r0
    }

    @Override // io.realm.internal.OsCollectionChangeSet, io.realm.OrderedCollectionChangeSet
    public java.lang.Throwable getError() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.realm.internal.OsCollectionChangeSet, io.realm.OrderedCollectionChangeSet
    public io.realm.OrderedCollectionChangeSet.Range[] getInsertionRanges() {
            r1 = this;
            io.realm.OrderedCollectionChangeSet$Range[] r0 = io.realm.internal.EmptyLoadChangeSet.NO_RANGE_CHANGES
            return r0
    }

    @Override // io.realm.internal.OsCollectionChangeSet, io.realm.OrderedCollectionChangeSet
    public int[] getInsertions() {
            r1 = this;
            int[] r0 = io.realm.internal.EmptyLoadChangeSet.NO_INDEX_CHANGES
            return r0
    }

    @Override // io.realm.internal.OsCollectionChangeSet, io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = super.getNativeFinalizerPtr()
            return r0
    }

    @Override // io.realm.internal.OsCollectionChangeSet, io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = super.getNativePtr()
            return r0
    }

    @Override // io.realm.internal.OsCollectionChangeSet, io.realm.OrderedCollectionChangeSet
    public io.realm.OrderedCollectionChangeSet.State getState() {
            r1 = this;
            io.realm.OrderedCollectionChangeSet$State r0 = io.realm.OrderedCollectionChangeSet.State.INITIAL
            return r0
    }

    @Override // io.realm.internal.OsCollectionChangeSet
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.realm.internal.OsCollectionChangeSet
    public boolean isFirstAsyncCallback() {
            r1 = this;
            boolean r0 = super.isFirstAsyncCallback()
            return r0
    }

    @Override // io.realm.internal.OsCollectionChangeSet
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }
}
