package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public class RealmSet<E> implements java.util.Set<E>, io.realm.internal.ManageableObject, io.realm.RealmCollection<E> {
    public final io.realm.RealmSet.SetStrategy<E> setStrategy;

    /* JADX INFO: renamed from: io.realm.RealmSet$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class ManagedSetStrategy<E> extends io.realm.RealmSet.SetStrategy<E> {
        private final io.realm.SetValueOperator<E> setValueOperator;
        private java.lang.Class<E> valueClass;

        public ManagedSetStrategy(io.realm.SetValueOperator<E> r2, java.lang.Class<E> r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.setValueOperator = r2
                r1.valueClass = r3
                return
        }

        private <T> void checkValidArray(T[] r5) {
                r4 = this;
                java.lang.String r0 = "Cannot pass a null array when calling 'toArray'."
                java.util.Objects.requireNonNull(r5, r0)
                java.lang.Class<E> r0 = r4.valueClass
                java.lang.String r0 = r0.getSimpleName()
                java.lang.Class r5 = r5.getClass()
                java.lang.Class r5 = r5.getComponentType()
                java.lang.String r5 = r5.getSimpleName()
                boolean r1 = r0.equals(r5)
                if (r1 == 0) goto L1e
                return
            L1e:
                java.lang.ArrayStoreException r1 = new java.lang.ArrayStoreException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Array type must be of type '"
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "' but it was of type '"
                r2.append(r0)
                r2.append(r5)
                java.lang.String r5 = "'."
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
        }

        private void checkValidCollection(java.util.Collection<?> r2) {
                r1 = this;
                java.lang.String r0 = "Collection must not be null."
                java.util.Objects.requireNonNull(r2, r0)
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(@javax.annotation.Nullable E r2) {
                r1 = this;
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                boolean r2 = r0.add(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> r2) {
                r1 = this;
                r1.checkValidCollection(r2)
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                boolean r2 = r0.addAll(r2)
                return r2
        }

        @Override // io.realm.RealmSet.SetStrategy
        public final void addChangeListener(io.realm.RealmSet<E> r3, io.realm.RealmChangeListener<io.realm.RealmSet<E>> r4) {
                r2 = this;
                io.realm.SetValueOperator<E> r0 = r2.setValueOperator
                java.util.Objects.requireNonNull(r0)
                io.realm.SetValueOperator$1 r1 = new io.realm.SetValueOperator$1
                r1.<init>(r4)
                r0.addChangeListener(r3, r1)
                return
        }

        @Override // io.realm.RealmSet.SetStrategy
        public final void addChangeListener(io.realm.RealmSet<E> r2, io.realm.SetChangeListener<E> r3) {
                r1 = this;
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                r0.addChangeListener(r2, r3)
                return
        }

        @Override // io.realm.RealmCollection
        public double average(java.lang.String r3) {
                r2 = this;
                io.realm.RealmQuery r0 = r2.where()
                double r0 = r0.average(r3)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                io.realm.internal.OsSet r0 = r0.osSet
                r0.clear()
                return
        }

        @Override // java.util.Set, java.util.Collection, io.realm.RealmCollection, java.util.List
        public boolean contains(@javax.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                r1.checkValidCollection(r2)
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                boolean r2 = r0.containsAll(r2)
                return r2
        }

        @Override // io.realm.RealmCollection
        public boolean deleteAllFromRealm() {
                r3 = this;
                io.realm.SetValueOperator<E> r0 = r3.setValueOperator
                io.realm.BaseRealm r0 = r0.baseRealm
                r0.checkIfValid()
                io.realm.SetValueOperator<E> r0 = r3.setValueOperator
                io.realm.internal.OsSet r0 = r0.osSet
                long r0 = r0.size()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                int r0 = r0.intValue()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L1d
                r0 = 1
                goto L1e
            L1d:
                r0 = 0
            L1e:
                if (r0 != 0) goto L28
                io.realm.SetValueOperator<E> r0 = r3.setValueOperator
                io.realm.internal.OsSet r0 = r0.osSet
                r0.deleteAll()
                return r1
            L28:
                return r2
        }

        @Override // io.realm.RealmSet.SetStrategy, io.realm.internal.Freezable
        public io.realm.RealmSet<E> freeze() {
                r4 = this;
                io.realm.SetValueOperator<E> r0 = r4.setValueOperator
                io.realm.BaseRealm r1 = r0.baseRealm
                io.realm.BaseRealm r1 = r1.freeze()
                io.realm.internal.OsSet r2 = r0.osSet
                io.realm.internal.OsSharedRealm r3 = r1.sharedRealm
                io.realm.internal.OsSet r2 = r2.freeze(r3)
                io.realm.RealmSet r3 = new io.realm.RealmSet
                java.lang.Class<E> r0 = r0.valueClass
                r3.<init>(r1, r2, r0)
                return r3
        }

        @Override // io.realm.RealmSet.SetStrategy, io.realm.internal.Freezable
        public /* bridge */ /* synthetic */ java.lang.Object freeze() {
                r1 = this;
                io.realm.RealmSet r0 = r1.freeze()
                return r0
        }

        @Override // io.realm.RealmSet.SetStrategy
        public final io.realm.internal.OsSet getOsSet() {
                r1 = this;
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                io.realm.internal.OsSet r0 = r0.osSet
                return r0
        }

        @Override // io.realm.RealmSet.SetStrategy
        public java.lang.Class<E> getValueClass() {
                r1 = this;
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                java.lang.Class r0 = r0.getValueClass()
                return r0
        }

        @Override // io.realm.RealmSet.SetStrategy
        public java.lang.String getValueClassName() {
                r1 = this;
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                java.lang.String r0 = r0.getValueClassName()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r2 = this;
                io.realm.SetValueOperator<E> r0 = r2.setValueOperator
                io.realm.internal.OsSet r0 = r0.osSet
                long r0 = r0.size()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                int r0 = r0.intValue()
                if (r0 != 0) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
                r1 = this;
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                io.realm.BaseRealm r0 = r0.baseRealm
                boolean r0 = r0.isFrozen()
                return r0
        }

        @Override // io.realm.RealmCollection
        public boolean isLoaded() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isManaged() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isValid() {
                r2 = this;
                io.realm.SetValueOperator<E> r0 = r2.setValueOperator
                io.realm.BaseRealm r1 = r0.baseRealm
                boolean r1 = r1.isClosed()
                if (r1 == 0) goto Lc
                r0 = 0
                goto L12
            Lc:
                io.realm.internal.OsSet r0 = r0.osSet
                boolean r0 = r0.isValid()
            L12:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<E> iterator() {
                r1 = this;
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        @Override // io.realm.RealmCollection
        public boolean load() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // io.realm.RealmCollection
        @javax.annotation.Nullable
        public java.lang.Number max(java.lang.String r2) {
                r1 = this;
                io.realm.RealmQuery r0 = r1.where()
                java.lang.Number r2 = r0.max(r2)
                return r2
        }

        @Override // io.realm.RealmCollection
        @javax.annotation.Nullable
        public java.util.Date maxDate(java.lang.String r2) {
                r1 = this;
                io.realm.RealmQuery r0 = r1.where()
                java.util.Date r2 = r0.maximumDate(r2)
                return r2
        }

        @Override // io.realm.RealmCollection
        @javax.annotation.Nullable
        public java.lang.Number min(java.lang.String r2) {
                r1 = this;
                io.realm.RealmQuery r0 = r1.where()
                java.lang.Number r2 = r0.min(r2)
                return r2
        }

        @Override // io.realm.RealmCollection
        @javax.annotation.Nullable
        public java.util.Date minDate(java.lang.String r2) {
                r1 = this;
                io.realm.RealmQuery r0 = r1.where()
                java.util.Date r2 = r0.minimumDate(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(@javax.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                boolean r2 = r0.remove(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r2) {
                r1 = this;
                r1.checkValidCollection(r2)
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                boolean r2 = r0.removeAll(r2)
                return r2
        }

        @Override // io.realm.RealmSet.SetStrategy
        public final void removeAllChangeListeners() {
                r4 = this;
                io.realm.SetValueOperator<E> r0 = r4.setValueOperator
                io.realm.BaseRealm r1 = r0.baseRealm
                r2 = 0
                r3 = 0
                io.realm.CollectionUtils.checkForAddRemoveListener(r1, r2, r3)
                io.realm.internal.ObserverPairList<io.realm.internal.ObservableSet$SetObserverPair<E>> r1 = r0.setObserverPairs
                r1.clear()
                io.realm.internal.OsSet r0 = r0.osSet
                r0.stopListening()
                return
        }

        @Override // io.realm.RealmSet.SetStrategy
        public final void removeChangeListener(io.realm.RealmSet<E> r3, io.realm.RealmChangeListener<io.realm.RealmSet<E>> r4) {
                r2 = this;
                io.realm.SetValueOperator<E> r0 = r2.setValueOperator
                java.util.Objects.requireNonNull(r0)
                io.realm.SetValueOperator$2 r1 = new io.realm.SetValueOperator$2
                r1.<init>(r4)
                io.realm.internal.ObserverPairList<io.realm.internal.ObservableSet$SetObserverPair<E>> r4 = r0.setObserverPairs
                r4.remove(r3, r1)
                io.realm.internal.ObserverPairList<io.realm.internal.ObservableSet$SetObserverPair<E>> r3 = r0.setObserverPairs
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L1c
                io.realm.internal.OsSet r3 = r0.osSet
                r3.stopListening()
            L1c:
                return
        }

        @Override // io.realm.RealmSet.SetStrategy
        public final void removeChangeListener(io.realm.RealmSet<E> r3, io.realm.SetChangeListener<E> r4) {
                r2 = this;
                io.realm.SetValueOperator<E> r0 = r2.setValueOperator
                io.realm.internal.ObserverPairList<io.realm.internal.ObservableSet$SetObserverPair<E>> r1 = r0.setObserverPairs
                r1.remove(r3, r4)
                io.realm.internal.ObserverPairList<io.realm.internal.ObservableSet$SetObserverPair<E>> r3 = r0.setObserverPairs
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L14
                io.realm.internal.OsSet r3 = r0.osSet
                r3.stopListening()
            L14:
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r2) {
                r1 = this;
                r1.checkValidCollection(r2)
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                boolean r2 = r0.retainAll(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r2 = this;
                io.realm.SetValueOperator<E> r0 = r2.setValueOperator
                io.realm.internal.OsSet r0 = r0.osSet
                long r0 = r0.size()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                int r0 = r0.intValue()
                return r0
        }

        @Override // io.realm.RealmCollection
        public java.lang.Number sum(java.lang.String r2) {
                r1 = this;
                io.realm.RealmQuery r0 = r1.where()
                java.lang.Number r2 = r0.sum(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r4 = this;
                int r0 = r4.size()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.util.Iterator r1 = r4.iterator()
                r2 = 0
            Lb:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L1a
                java.lang.Object r3 = r1.next()
                r0[r2] = r3
                int r2 = r2 + 1
                goto Lb
            L1a:
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r8) {
                r7 = this;
                r7.checkValidArray(r8)
                int r0 = r7.size()
                long r0 = (long) r0
                int r2 = r8.length
                long r2 = (long) r2
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 == 0) goto L1f
                int r2 = r8.length
                long r2 = (long) r2
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 <= 0) goto L15
                goto L1f
            L15:
                java.lang.Class<E> r2 = r7.valueClass
                int r3 = (int) r0
                java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)
                java.lang.Object[] r2 = (java.lang.Object[]) r2
                goto L20
            L1f:
                r2 = r8
            L20:
                r3 = 0
                java.util.Iterator r4 = r7.iterator()
            L25:
                boolean r5 = r4.hasNext()
                r6 = 0
                if (r5 == 0) goto L3a
                java.lang.Object r5 = r4.next()
                if (r5 != 0) goto L35
                r2[r3] = r6
                goto L37
            L35:
                r2[r3] = r5
            L37:
                int r3 = r3 + 1
                goto L25
            L3a:
                int r8 = r8.length
                long r4 = (long) r8
                int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r8 <= 0) goto L42
                r2[r3] = r6
            L42:
                return r2
        }

        @Override // io.realm.RealmCollection
        public io.realm.RealmQuery<E> where() {
                r1 = this;
                io.realm.SetValueOperator<E> r0 = r1.setValueOperator
                io.realm.RealmQuery r0 = r0.where()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class SetStrategy<E> implements java.util.Set<E>, io.realm.internal.ManageableObject, io.realm.RealmCollection<E> {
        private SetStrategy() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ SetStrategy(io.realm.RealmSet.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void addChangeListener(io.realm.RealmSet<E> r1, io.realm.RealmChangeListener<io.realm.RealmSet<E>> r2);

        public abstract void addChangeListener(io.realm.RealmSet<E> r1, io.realm.SetChangeListener<E> r2);

        public abstract io.realm.RealmSet<E> freeze();

        public /* bridge */ /* synthetic */ java.lang.Object freeze() {
                r1 = this;
                io.realm.RealmSet r0 = r1.freeze()
                return r0
        }

        public abstract io.realm.internal.OsSet getOsSet();

        public abstract java.lang.Class<E> getValueClass();

        public abstract java.lang.String getValueClassName();

        public abstract void removeAllChangeListeners();

        public abstract void removeChangeListener(io.realm.RealmSet<E> r1, io.realm.RealmChangeListener<io.realm.RealmSet<E>> r2);

        public abstract void removeChangeListener(io.realm.RealmSet<E> r1, io.realm.SetChangeListener<E> r2);
    }

    public static class UnmanagedSetStrategy<E> extends io.realm.RealmSet.SetStrategy<E> {
        private static final java.lang.String ONLY_IN_MANAGED_MODE_MESSAGE = "This method is only available in managed mode.";
        private final java.util.Set<E> unmanagedSet;

        public UnmanagedSetStrategy() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.unmanagedSet = r0
                return
        }

        public UnmanagedSetStrategy(java.util.Collection<E> r2) {
                r1 = this;
                r1.<init>()
                java.util.Set<E> r0 = r1.unmanagedSet
                r0.addAll(r2)
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(@javax.annotation.Nullable E r2) {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                boolean r2 = r0.add(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> r2) {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                boolean r2 = r0.addAll(r2)
                return r2
        }

        @Override // io.realm.RealmSet.SetStrategy
        public final void addChangeListener(io.realm.RealmSet<E> r1, io.realm.RealmChangeListener<io.realm.RealmSet<E>> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Unmanaged RealmSets do not support change listeners."
                r1.<init>(r2)
                throw r1
        }

        @Override // io.realm.RealmSet.SetStrategy
        public final void addChangeListener(io.realm.RealmSet<E> r1, io.realm.SetChangeListener<E> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Unmanaged RealmSets do not support change listeners."
                r1.<init>(r2)
                throw r1
        }

        @Override // io.realm.RealmCollection
        public double average(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "This method is only available in managed mode."
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                r0.clear()
                return
        }

        @Override // java.util.Set, java.util.Collection, io.realm.RealmCollection, java.util.List
        public boolean contains(@javax.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                boolean r2 = r0.containsAll(r2)
                return r2
        }

        @Override // io.realm.RealmCollection
        public boolean deleteAllFromRealm() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "This method is only available in managed mode."
                r0.<init>(r1)
                throw r0
        }

        @Override // io.realm.RealmSet.SetStrategy, io.realm.internal.Freezable
        public io.realm.RealmSet<E> freeze() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Unmanaged RealmSets cannot be frozen."
                r0.<init>(r1)
                throw r0
        }

        @Override // io.realm.RealmSet.SetStrategy, io.realm.internal.Freezable
        public /* bridge */ /* synthetic */ java.lang.Object freeze() {
                r1 = this;
                io.realm.RealmSet r0 = r1.freeze()
                return r0
        }

        @Override // io.realm.RealmSet.SetStrategy
        public final io.realm.internal.OsSet getOsSet() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Unmanaged RealmSets do not have a representation in native code."
                r0.<init>(r1)
                throw r0
        }

        @Override // io.realm.RealmSet.SetStrategy
        public java.lang.Class<E> getValueClass() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Unmanaged sets do not support retrieving the value class."
                r0.<init>(r1)
                throw r0
        }

        @Override // io.realm.RealmSet.SetStrategy
        public java.lang.String getValueClassName() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Unmanaged sets do not support retrieving the value class name."
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                boolean r0 = r0.isEmpty()
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

        @Override // io.realm.internal.ManageableObject
        public boolean isManaged() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isValid() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<E> iterator() {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        @Override // io.realm.RealmCollection
        public boolean load() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // io.realm.RealmCollection
        @javax.annotation.Nullable
        public java.lang.Number max(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "This method is only available in managed mode."
                r2.<init>(r0)
                throw r2
        }

        @Override // io.realm.RealmCollection
        @javax.annotation.Nullable
        public java.util.Date maxDate(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "This method is only available in managed mode."
                r2.<init>(r0)
                throw r2
        }

        @Override // io.realm.RealmCollection
        @javax.annotation.Nullable
        public java.lang.Number min(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "This method is only available in managed mode."
                r2.<init>(r0)
                throw r2
        }

        @Override // io.realm.RealmCollection
        @javax.annotation.Nullable
        public java.util.Date minDate(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "This method is only available in managed mode."
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(@javax.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                boolean r2 = r0.remove(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                boolean r2 = r0.removeAll(r2)
                return r2
        }

        @Override // io.realm.RealmSet.SetStrategy
        public final void removeAllChangeListeners() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Cannot remove change listeners because unmanaged RealmSets do not support change listeners."
                r0.<init>(r1)
                throw r0
        }

        @Override // io.realm.RealmSet.SetStrategy
        public final void removeChangeListener(io.realm.RealmSet<E> r1, io.realm.RealmChangeListener<io.realm.RealmSet<E>> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Cannot remove change listener because unmanaged RealmSets do not support change listeners."
                r1.<init>(r2)
                throw r1
        }

        @Override // io.realm.RealmSet.SetStrategy
        public final void removeChangeListener(io.realm.RealmSet<E> r1, io.realm.SetChangeListener<E> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Cannot remove change listener because unmanaged RealmSets do not support change listeners."
                r1.<init>(r2)
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                boolean r2 = r0.retainAll(r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                int r0 = r0.size()
                return r0
        }

        @Override // io.realm.RealmCollection
        public java.lang.Number sum(java.lang.String r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "This method is only available in managed mode."
                r2.<init>(r0)
                throw r2
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.util.Set<E> r0 = r1.unmanagedSet
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }

        @Override // io.realm.RealmCollection
        public io.realm.RealmQuery<E> where() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "This method is only available in managed mode."
                r0.<init>(r1)
                throw r0
        }
    }

    public RealmSet() {
            r1 = this;
            r1.<init>()
            io.realm.RealmSet$UnmanagedSetStrategy r0 = new io.realm.RealmSet$UnmanagedSetStrategy
            r0.<init>()
            r1.setStrategy = r0
            return
    }

    public RealmSet(io.realm.BaseRealm r1, io.realm.internal.OsSet r2, java.lang.Class<E> r3) {
            r0 = this;
            r0.<init>()
            io.realm.RealmSet$ManagedSetStrategy r1 = getStrategy(r1, r2, r3)
            r0.setStrategy = r1
            return
    }

    public RealmSet(io.realm.BaseRealm r1, io.realm.internal.OsSet r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            io.realm.RealmSet$ManagedSetStrategy r1 = getStrategy(r1, r2, r3)
            r0.setStrategy = r1
            return
    }

    public RealmSet(java.util.Collection<E> r2) {
            r1 = this;
            r1.<init>()
            io.realm.RealmSet$UnmanagedSetStrategy r0 = new io.realm.RealmSet$UnmanagedSetStrategy
            r0.<init>(r2)
            r1.setStrategy = r0
            return
    }

    private static <T> io.realm.RealmSet.ManagedSetStrategy<T> getStrategy(io.realm.BaseRealm r11, io.realm.internal.OsSet r12, java.lang.Class<T> r13) {
            java.lang.Class<io.realm.RealmAny> r0 = io.realm.RealmAny.class
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            java.lang.Class<java.lang.Byte> r4 = java.lang.Byte.class
            java.lang.Class<java.lang.Short> r5 = java.lang.Short.class
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
            boolean r10 = io.realm.CollectionUtils.isClassForRealmModel(r13)
            if (r10 == 0) goto L25
            io.realm.RealmSet$ManagedSetStrategy r0 = new io.realm.RealmSet$ManagedSetStrategy
            io.realm.RealmModelSetOperator r1 = new io.realm.RealmModelSetOperator
            r1.<init>(r11, r12, r13)
            r0.<init>(r1, r13)
            return r0
        L25:
            if (r13 != r9) goto L2e
            io.realm.BooleanOperator r0 = new io.realm.BooleanOperator
            r0.<init>(r11, r12)
            goto Lb5
        L2e:
            if (r13 != r8) goto L37
            io.realm.StringOperator r0 = new io.realm.StringOperator
            r0.<init>(r11, r12)
            goto Lb5
        L37:
            if (r13 != r7) goto L40
            io.realm.IntegerOperator r0 = new io.realm.IntegerOperator
            r0.<init>(r11, r12)
            goto Lb5
        L40:
            if (r13 != r6) goto L49
            io.realm.LongOperator r0 = new io.realm.LongOperator
            r0.<init>(r11, r12)
            goto Lb5
        L49:
            if (r13 != r5) goto L52
            io.realm.ShortOperator r0 = new io.realm.ShortOperator
            r0.<init>(r11, r12)
            goto Lb5
        L52:
            if (r13 != r4) goto L5a
            io.realm.ByteOperator r0 = new io.realm.ByteOperator
            r0.<init>(r11, r12)
            goto Lb5
        L5a:
            if (r13 != r3) goto L62
            io.realm.FloatOperator r0 = new io.realm.FloatOperator
            r0.<init>(r11, r12)
            goto Lb5
        L62:
            if (r13 != r2) goto L6a
            io.realm.DoubleOperator r0 = new io.realm.DoubleOperator
            r0.<init>(r11, r12)
            goto Lb5
        L6a:
            if (r13 != r1) goto L72
            io.realm.BinaryOperator r0 = new io.realm.BinaryOperator
            r0.<init>(r11, r12)
            goto Lb5
        L72:
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r13 != r1) goto L7e
            io.realm.DateOperator r0 = new io.realm.DateOperator
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            r0.<init>(r11, r12, r1)
            goto Lb5
        L7e:
            java.lang.Class<org.bson.types.Decimal128> r1 = org.bson.types.Decimal128.class
            if (r13 != r1) goto L8a
            io.realm.Decimal128Operator r0 = new io.realm.Decimal128Operator
            java.lang.Class<org.bson.types.Decimal128> r1 = org.bson.types.Decimal128.class
            r0.<init>(r11, r12, r1)
            goto Lb5
        L8a:
            java.lang.Class<org.bson.types.ObjectId> r1 = org.bson.types.ObjectId.class
            if (r13 != r1) goto L96
            io.realm.ObjectIdOperator r0 = new io.realm.ObjectIdOperator
            java.lang.Class<org.bson.types.ObjectId> r1 = org.bson.types.ObjectId.class
            r0.<init>(r11, r12, r1)
            goto Lb5
        L96:
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            if (r13 != r1) goto La2
            io.realm.UUIDOperator r0 = new io.realm.UUIDOperator
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            r0.<init>(r11, r12, r1)
            goto Lb5
        La2:
            if (r13 != r0) goto Laa
            io.realm.RealmAnySetOperator r0 = new io.realm.RealmAnySetOperator
            r0.<init>(r11, r12)
            goto Lb5
        Laa:
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            if (r13 != r0) goto Lbb
            io.realm.NumberOperator r0 = new io.realm.NumberOperator
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            r0.<init>(r11, r12, r1)
        Lb5:
            io.realm.RealmSet$ManagedSetStrategy r11 = new io.realm.RealmSet$ManagedSetStrategy
            r11.<init>(r0, r13)
            return r11
        Lbb:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "getStrategy: missing class '"
            java.lang.StringBuilder r12 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12)
            java.lang.String r13 = r13.getSimpleName()
            r12.append(r13)
            java.lang.String r13 = "'"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    private static <T> io.realm.RealmSet.ManagedSetStrategy<T> getStrategy(io.realm.BaseRealm r10, io.realm.internal.OsSet r11, java.lang.String r12) {
            java.lang.Class<io.realm.RealmAny> r0 = io.realm.RealmAny.class
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            java.lang.Class<java.lang.Byte> r4 = java.lang.Byte.class
            java.lang.Class<java.lang.Short> r5 = java.lang.Short.class
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
            java.lang.String r9 = r9.getCanonicalName()
            boolean r9 = r12.equals(r9)
            if (r9 == 0) goto L25
            io.realm.BooleanOperator r12 = new io.realm.BooleanOperator
            r12.<init>(r10, r11)
            goto L112
        L25:
            java.lang.String r8 = r8.getCanonicalName()
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L36
            io.realm.StringOperator r12 = new io.realm.StringOperator
            r12.<init>(r10, r11)
            goto L112
        L36:
            java.lang.String r7 = r7.getCanonicalName()
            boolean r7 = r12.equals(r7)
            if (r7 == 0) goto L47
            io.realm.IntegerOperator r12 = new io.realm.IntegerOperator
            r12.<init>(r10, r11)
            goto L112
        L47:
            java.lang.String r6 = r6.getCanonicalName()
            boolean r6 = r12.equals(r6)
            if (r6 == 0) goto L58
            io.realm.LongOperator r12 = new io.realm.LongOperator
            r12.<init>(r10, r11)
            goto L112
        L58:
            java.lang.String r5 = r5.getCanonicalName()
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L69
            io.realm.ShortOperator r12 = new io.realm.ShortOperator
            r12.<init>(r10, r11)
            goto L112
        L69:
            java.lang.String r4 = r4.getCanonicalName()
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L7a
            io.realm.ByteOperator r12 = new io.realm.ByteOperator
            r12.<init>(r10, r11)
            goto L112
        L7a:
            java.lang.String r3 = r3.getCanonicalName()
            boolean r3 = r12.equals(r3)
            if (r3 == 0) goto L8b
            io.realm.FloatOperator r12 = new io.realm.FloatOperator
            r12.<init>(r10, r11)
            goto L112
        L8b:
            java.lang.String r2 = r2.getCanonicalName()
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L9c
            io.realm.DoubleOperator r12 = new io.realm.DoubleOperator
            r12.<init>(r10, r11)
            goto L112
        L9c:
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto Lac
            io.realm.BinaryOperator r12 = new io.realm.BinaryOperator
            r12.<init>(r10, r11)
            goto L112
        Lac:
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto Lc0
            io.realm.DateOperator r12 = new io.realm.DateOperator
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            r12.<init>(r10, r11, r0)
            goto L112
        Lc0:
            java.lang.Class<org.bson.types.Decimal128> r1 = org.bson.types.Decimal128.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto Ld4
            io.realm.Decimal128Operator r12 = new io.realm.Decimal128Operator
            java.lang.Class<org.bson.types.Decimal128> r0 = org.bson.types.Decimal128.class
            r12.<init>(r10, r11, r0)
            goto L112
        Ld4:
            java.lang.Class<org.bson.types.ObjectId> r1 = org.bson.types.ObjectId.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto Le8
            io.realm.ObjectIdOperator r12 = new io.realm.ObjectIdOperator
            java.lang.Class<org.bson.types.ObjectId> r0 = org.bson.types.ObjectId.class
            r12.<init>(r10, r11, r0)
            goto L112
        Le8:
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            java.lang.String r1 = r1.getCanonicalName()
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto Lfc
            io.realm.UUIDOperator r12 = new io.realm.UUIDOperator
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            r12.<init>(r10, r11, r0)
            goto L112
        Lfc:
            java.lang.String r0 = r0.getCanonicalName()
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L10c
            io.realm.RealmAnySetOperator r12 = new io.realm.RealmAnySetOperator
            r12.<init>(r10, r11)
            goto L112
        L10c:
            io.realm.DynamicSetOperator r0 = new io.realm.DynamicSetOperator
            r0.<init>(r10, r11, r12)
            r12 = r0
        L112:
            io.realm.RealmSet$ManagedSetStrategy r10 = new io.realm.RealmSet$ManagedSetStrategy
            java.lang.Class r11 = r12.getValueClass()
            r10.<init>(r12, r11)
            return r10
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(@javax.annotation.Nullable E r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            boolean r2 = r0.add(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            boolean r2 = r0.addAll(r2)
            return r2
    }

    public void addChangeListener(io.realm.RealmChangeListener<io.realm.RealmSet<E>> r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            r0.addChangeListener(r1, r2)
            return
    }

    public void addChangeListener(io.realm.SetChangeListener<E> r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            r0.addChangeListener(r1, r2)
            return
    }

    @Override // io.realm.RealmCollection
    public double average(java.lang.String r3) {
            r2 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r2.setStrategy
            double r0 = r0.average(r3)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            r0.clear()
            return
    }

    @Override // java.util.Set, java.util.Collection, io.realm.RealmCollection, java.util.List
    public boolean contains(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // io.realm.RealmCollection
    public boolean deleteAllFromRealm() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            boolean r0 = r0.deleteAllFromRealm()
            return r0
    }

    @Override // io.realm.internal.Freezable
    public io.realm.RealmSet<E> freeze() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            io.realm.RealmSet r0 = r0.freeze()
            return r0
    }

    @Override // io.realm.internal.Freezable
    public /* bridge */ /* synthetic */ java.lang.Object freeze() {
            r1 = this;
            io.realm.RealmSet r0 = r1.freeze()
            return r0
    }

    public final io.realm.internal.OsSet getOsSet() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            io.realm.internal.OsSet r0 = r0.getOsSet()
            return r0
    }

    public java.lang.Class<E> getValueClass() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            java.lang.Class r0 = r0.getValueClass()
            return r0
    }

    public java.lang.String getValueClassName() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            java.lang.String r0 = r0.getValueClassName()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            boolean r0 = r0.isFrozen()
            return r0
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isManaged() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            boolean r0 = r0.isManaged()
            return r0
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isValid() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            boolean r0 = r0.isValid()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // io.realm.RealmCollection
    public boolean load() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.realm.RealmCollection
    @javax.annotation.Nullable
    public java.lang.Number max(java.lang.String r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            java.lang.Number r2 = r0.max(r2)
            return r2
    }

    @Override // io.realm.RealmCollection
    @javax.annotation.Nullable
    public java.util.Date maxDate(java.lang.String r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            java.util.Date r2 = r0.maxDate(r2)
            return r2
    }

    @Override // io.realm.RealmCollection
    @javax.annotation.Nullable
    public java.lang.Number min(java.lang.String r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            java.lang.Number r2 = r0.min(r2)
            return r2
    }

    @Override // io.realm.RealmCollection
    @javax.annotation.Nullable
    public java.util.Date minDate(java.lang.String r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            java.util.Date r2 = r0.minDate(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            boolean r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            boolean r2 = r0.removeAll(r2)
            return r2
    }

    public void removeAllChangeListeners() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            r0.removeAllChangeListeners()
            return
    }

    public void removeChangeListener(io.realm.RealmChangeListener<io.realm.RealmSet<E>> r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            r0.removeChangeListener(r1, r2)
            return
    }

    public void removeChangeListener(io.realm.SetChangeListener<E> r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            r0.removeChangeListener(r1, r2)
            return
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            boolean r2 = r0.retainAll(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            int r0 = r0.size()
            return r0
    }

    @Override // io.realm.RealmCollection
    public java.lang.Number sum(java.lang.String r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            java.lang.Number r2 = r0.sum(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }

    @Override // io.realm.RealmCollection
    public io.realm.RealmQuery<E> where() {
            r1 = this;
            io.realm.RealmSet$SetStrategy<E> r0 = r1.setStrategy
            io.realm.RealmQuery r0 = r0.where()
            return r0
    }
}
