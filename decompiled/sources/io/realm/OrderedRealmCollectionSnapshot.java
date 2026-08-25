package io.realm;

/* JADX INFO: loaded from: classes.dex */
public class OrderedRealmCollectionSnapshot<E> extends io.realm.OrderedRealmCollectionImpl<E> {
    private int size;

    public OrderedRealmCollectionSnapshot(io.realm.BaseRealm r1, io.realm.internal.OsResults r2, java.lang.Class<E> r3) {
            r0 = this;
            io.realm.internal.OsResults r2 = r2.createSnapshot()
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.size = r1
            return
    }

    public OrderedRealmCollectionSnapshot(io.realm.BaseRealm r1, io.realm.internal.OsResults r2, java.lang.String r3) {
            r0 = this;
            io.realm.internal.OsResults r2 = r2.createSnapshot()
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.size = r1
            return
    }

    private java.lang.UnsupportedOperationException getUnsupportedException(java.lang.String r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r3 = 1
            r2[r3] = r5
            java.lang.String r5 = "'%s()' is not supported by OrderedRealmCollectionSnapshot. Call '%s()' on the original 'RealmCollection' instead."
            java.lang.String r5 = java.lang.String.format(r1, r5, r2)
            r0.<init>(r5)
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            super.add(r1, r2)
            return
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.add(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            boolean r1 = super.addAll(r1, r2)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.addAll(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ double average(java.lang.String r3) {
            r2 = this;
            double r0 = super.average(r3)
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ void clear() {
            r0 = this;
            super.clear()
            return
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean contains(@javax.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public io.realm.OrderedRealmCollectionSnapshot<E> createSnapshot() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValid()
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public boolean deleteAllFromRealm() {
            r1 = this;
            boolean r0 = super.deleteAllFromRealm()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public boolean deleteFirstFromRealm() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            io.realm.internal.OsResults r0 = r1.osResults
            io.realm.internal.UncheckedRow r0 = r0.firstUncheckedRow()
            if (r0 == 0) goto L1d
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L1d
            io.realm.internal.OsResults r0 = r1.osResults
            boolean r0 = r0.deleteFirst()
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public void deleteFromRealm(int r4) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            r0.checkIfValidAndInTransaction()
            io.realm.internal.OsResults r0 = r3.osResults
            io.realm.internal.UncheckedRow r0 = r0.getUncheckedRow(r4)
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L17
            io.realm.internal.OsResults r0 = r3.osResults
            long r1 = (long) r4
            r0.delete(r1)
        L17:
            return
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public boolean deleteLastFromRealm() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            io.realm.internal.OsResults r0 = r1.osResults
            io.realm.internal.UncheckedRow r0 = r0.lastUncheckedRow()
            if (r0 == 0) goto L1d
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L1d
            io.realm.internal.OsResults r0 = r1.osResults
            boolean r0 = r0.deleteLast()
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object first() {
            r1 = this;
            java.lang.Object r0 = super.first()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object first(@javax.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = super.first(r1)
            return r1
    }

    @Override // io.realm.internal.Freezable
    public io.realm.OrderedRealmCollection<E> freeze() {
            r1 = this;
            java.lang.String r0 = "freeze"
            java.lang.UnsupportedOperationException r0 = r1.getUnsupportedException(r0)
            throw r0
    }

    @Override // io.realm.internal.Freezable
    public /* bridge */ /* synthetic */ java.lang.Object freeze() {
            r1 = this;
            io.realm.OrderedRealmCollection r0 = r1.freeze()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl
    public /* bridge */ /* synthetic */ io.realm.Realm getRealm() {
            r1 = this;
            io.realm.Realm r0 = super.getRealm()
            return r0
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection, io.realm.internal.ManageableObject
    public /* bridge */ /* synthetic */ boolean isManaged() {
            r1 = this;
            boolean r0 = super.isManaged()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection, io.realm.internal.ManageableObject
    public /* bridge */ /* synthetic */ boolean isValid() {
            r1 = this;
            boolean r0 = super.isValid()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            java.util.Iterator r0 = super.iterator()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object last() {
            r1 = this;
            java.lang.Object r0 = super.last()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object last(@javax.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = super.last(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            java.util.ListIterator r0 = super.listIterator()
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            java.util.ListIterator r1 = super.listIterator(r1)
            return r1
    }

    @Override // io.realm.RealmCollection
    public boolean load() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ java.lang.Number max(java.lang.String r1) {
            r0 = this;
            java.lang.Number r1 = super.max(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.util.Date maxDate(java.lang.String r1) {
            r0 = this;
            java.util.Date r1 = super.maxDate(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ java.lang.Number min(java.lang.String r1) {
            r0 = this;
            java.lang.Number r1 = super.min(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ java.util.Date minDate(java.lang.String r1) {
            r0 = this;
            java.util.Date r1 = super.minDate(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean remove(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.removeAll(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.retainAll(r1)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = super.set(r1, r2)
            return r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r2 = this;
            int r0 = r2.size
            r1 = -1
            if (r0 != r1) goto Lb
            int r0 = super.size()
            r2.size = r0
        Lb:
            int r0 = r2.size
            return r0
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public io.realm.RealmResults<E> sort(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = "sort"
            java.lang.UnsupportedOperationException r1 = r0.getUnsupportedException(r1)
            throw r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public io.realm.RealmResults<E> sort(java.lang.String r1, io.realm.Sort r2) {
            r0 = this;
            java.lang.String r1 = "sort"
            java.lang.UnsupportedOperationException r1 = r0.getUnsupportedException(r1)
            throw r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public io.realm.RealmResults<E> sort(java.lang.String r1, io.realm.Sort r2, java.lang.String r3, io.realm.Sort r4) {
            r0 = this;
            java.lang.String r1 = "sort"
            java.lang.UnsupportedOperationException r1 = r0.getUnsupportedException(r1)
            throw r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public io.realm.RealmResults<E> sort(java.lang.String[] r1, io.realm.Sort[] r2) {
            r0 = this;
            java.lang.String r1 = "sort"
            java.lang.UnsupportedOperationException r1 = r0.getUnsupportedException(r1)
            throw r1
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ java.lang.Number sum(java.lang.String r1) {
            r0 = this;
            java.lang.Number r1 = super.sum(r1)
            return r1
    }

    @Override // io.realm.RealmCollection
    @java.lang.Deprecated
    public io.realm.RealmQuery<E> where() {
            r1 = this;
            java.lang.String r0 = "where"
            java.lang.UnsupportedOperationException r0 = r1.getUnsupportedException(r0)
            throw r0
    }
}
