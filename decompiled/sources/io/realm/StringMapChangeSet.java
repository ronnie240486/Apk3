package io.realm;

/* JADX INFO: compiled from: MapChangeSet.java */
/* JADX INFO: loaded from: classes.dex */
class StringMapChangeSet implements io.realm.MapChangeSet<java.lang.String> {
    private final io.realm.internal.OsMapChangeSet osMapChangeSet;

    public StringMapChangeSet(long r2) {
            r1 = this;
            r1.<init>()
            io.realm.internal.OsMapChangeSet r0 = new io.realm.internal.OsMapChangeSet
            r0.<init>(r2)
            r1.osMapChangeSet = r0
            return
    }

    @Override // io.realm.MapChangeSet
    public /* bridge */ /* synthetic */ java.lang.String[] getChanges() {
            r1 = this;
            java.lang.String[] r0 = r1.getChanges2()
            return r0
    }

    @Override // io.realm.MapChangeSet
    /* JADX INFO: renamed from: getChanges, reason: avoid collision after fix types in other method */
    public java.lang.String[] getChanges2() {
            r1 = this;
            io.realm.internal.OsMapChangeSet r0 = r1.osMapChangeSet
            java.lang.String[] r0 = r0.getStringKeyModifications()
            return r0
    }

    @Override // io.realm.MapChangeSet
    public /* bridge */ /* synthetic */ java.lang.String[] getDeletions() {
            r1 = this;
            java.lang.String[] r0 = r1.getDeletions2()
            return r0
    }

    @Override // io.realm.MapChangeSet
    /* JADX INFO: renamed from: getDeletions, reason: avoid collision after fix types in other method */
    public java.lang.String[] getDeletions2() {
            r1 = this;
            io.realm.internal.OsMapChangeSet r0 = r1.osMapChangeSet
            java.lang.String[] r0 = r0.getStringKeyDeletions()
            return r0
    }

    @Override // io.realm.MapChangeSet
    public /* bridge */ /* synthetic */ java.lang.String[] getInsertions() {
            r1 = this;
            java.lang.String[] r0 = r1.getInsertions2()
            return r0
    }

    @Override // io.realm.MapChangeSet
    /* JADX INFO: renamed from: getInsertions, reason: avoid collision after fix types in other method */
    public java.lang.String[] getInsertions2() {
            r1 = this;
            io.realm.internal.OsMapChangeSet r0 = r1.osMapChangeSet
            java.lang.String[] r0 = r0.getStringKeyInsertions()
            return r0
    }

    @Override // io.realm.MapChangeSet
    public boolean isEmpty() {
            r1 = this;
            io.realm.internal.OsMapChangeSet r0 = r1.osMapChangeSet
            boolean r0 = r0.isEmpty()
            return r0
    }
}
