package io.realm;

/* JADX INFO: compiled from: MapChangeSet.java */
/* JADX INFO: loaded from: classes.dex */
class MapChangeSetImpl<K> implements io.realm.MapChangeSet<K> {
    private final io.realm.MapChangeSet<K> delegate;

    public MapChangeSetImpl(io.realm.MapChangeSet<K> r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    @Override // io.realm.MapChangeSet
    public K[] getChanges() {
            r1 = this;
            io.realm.MapChangeSet<K> r0 = r1.delegate
            java.lang.Object[] r0 = r0.getChanges()
            return r0
    }

    @Override // io.realm.MapChangeSet
    public K[] getDeletions() {
            r1 = this;
            io.realm.MapChangeSet<K> r0 = r1.delegate
            java.lang.Object[] r0 = r0.getDeletions()
            return r0
    }

    @Override // io.realm.MapChangeSet
    public K[] getInsertions() {
            r1 = this;
            io.realm.MapChangeSet<K> r0 = r1.delegate
            java.lang.Object[] r0 = r0.getInsertions()
            return r0
    }

    @Override // io.realm.MapChangeSet
    public boolean isEmpty() {
            r1 = this;
            io.realm.MapChangeSet<K> r0 = r1.delegate
            boolean r0 = r0.isEmpty()
            return r0
    }
}
