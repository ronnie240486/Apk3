package io.realm;

/* JADX INFO: loaded from: classes3.dex */
abstract class ManagedMapManager<K, V> implements java.util.Map<K, V>, io.realm.internal.ManageableObject, io.realm.internal.Freezable<io.realm.RealmMap<K, V>>, io.realm.internal.ObservableMap {
    public final io.realm.BaseRealm baseRealm;
    public final io.realm.internal.ObserverPairList<io.realm.internal.ObservableMap.MapObserverPair<K, V>> mapObserverPairs;
    public final io.realm.MapValueOperator<K, V> mapValueOperator;
    public final io.realm.TypeSelectorForMap<K, V> typeSelectorForMap;

    public ManagedMapManager(io.realm.BaseRealm r2, io.realm.MapValueOperator<K, V> r3, io.realm.TypeSelectorForMap<K, V> r4) {
            r1 = this;
            r1.<init>()
            io.realm.internal.ObserverPairList r0 = new io.realm.internal.ObserverPairList
            r0.<init>()
            r1.mapObserverPairs = r0
            r1.baseRealm = r2
            r1.mapValueOperator = r3
            r1.typeSelectorForMap = r4
            return
    }

    public final void addChangeListener(io.realm.RealmMap<K, V> r3, io.realm.MapChangeListener<K, V> r4) {
            r2 = this;
            io.realm.BaseRealm r0 = r2.baseRealm
            r1 = 1
            io.realm.CollectionUtils.checkForAddRemoveListener(r0, r4, r1)
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableMap$MapObserverPair<K, V>> r0 = r2.mapObserverPairs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            io.realm.MapValueOperator<K, V> r0 = r2.mapValueOperator
            io.realm.internal.OsMap r0 = r0.osMap
            r0.startListening(r2)
        L15:
            io.realm.internal.ObservableMap$MapObserverPair r0 = new io.realm.internal.ObservableMap$MapObserverPair
            r0.<init>(r3, r4)
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableMap$MapObserverPair<K, V>> r3 = r2.mapObserverPairs
            r3.add(r0)
            return
    }

    public abstract io.realm.MapChangeSet<K> changeSetFactory(long r1);

    @Override // java.util.Map
    public void clear() {
            r1 = this;
            io.realm.MapValueOperator<K, V> r0 = r1.mapValueOperator
            io.realm.internal.OsMap r0 = r0.osMap
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(@javax.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            boolean r1 = r0.containsKeyInternal(r1)
            return r1
    }

    public abstract boolean containsKeyInternal(@javax.annotation.Nullable java.lang.Object r1);

    @Override // java.util.Map
    public boolean containsValue(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            io.realm.MapValueOperator<K, V> r0 = r1.mapValueOperator
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Map
    public abstract java.util.Set<java.util.Map.Entry<K, V>> entrySet();

    @Override // io.realm.internal.Freezable
    public io.realm.RealmMap<K, V> freeze() {
            r4 = this;
            io.realm.MapValueOperator<K, V> r0 = r4.mapValueOperator
            io.realm.BaseRealm r1 = r0.baseRealm
            io.realm.BaseRealm r1 = r1.freeze()
            io.realm.internal.util.Pair r2 = new io.realm.internal.util.Pair
            io.realm.internal.OsMap r0 = r0.osMap
            io.realm.internal.OsSharedRealm r3 = r1.sharedRealm
            io.realm.internal.OsMap r0 = r0.freeze(r3)
            r2.<init>(r1, r0)
            io.realm.RealmMap r0 = r4.freezeInternal(r2)
            return r0
    }

    @Override // io.realm.internal.Freezable
    public /* bridge */ /* synthetic */ java.lang.Object freeze() {
            r1 = this;
            io.realm.RealmMap r0 = r1.freeze()
            return r0
    }

    public abstract io.realm.RealmMap<K, V> freezeInternal(io.realm.internal.util.Pair<io.realm.BaseRealm, io.realm.internal.OsMap> r1);

    @Override // java.util.Map
    public boolean isEmpty() {
            r5 = this;
            io.realm.MapValueOperator<K, V> r0 = r5.mapValueOperator
            io.realm.internal.OsMap r0 = r0.osMap
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
            r1 = this;
            io.realm.MapValueOperator<K, V> r0 = r1.mapValueOperator
            io.realm.BaseRealm r0 = r0.baseRealm
            boolean r0 = r0.isFrozen()
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
            io.realm.MapValueOperator<K, V> r0 = r2.mapValueOperator
            io.realm.BaseRealm r1 = r0.baseRealm
            boolean r1 = r1.isClosed()
            if (r1 == 0) goto Lc
            r0 = 0
            goto L12
        Lc:
            io.realm.internal.OsMap r0 = r0.osMap
            boolean r0 = r0.isValid()
        L12:
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            io.realm.MapValueOperator<K, V> r0 = r1.mapValueOperator
            io.realm.TypeSelectorForMap<K, V> r0 = r0.typeSelectorForMap
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // io.realm.internal.ObservableMap
    public void notifyChangeListeners(long r2) {
            r1 = this;
            io.realm.MapChangeSetImpl r0 = new io.realm.MapChangeSetImpl
            io.realm.MapChangeSet r2 = r1.changeSetFactory(r2)
            r0.<init>(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L10
            return
        L10:
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableMap$MapObserverPair<K, V>> r2 = r1.mapObserverPairs
            io.realm.internal.ObservableMap$Callback r3 = new io.realm.internal.ObservableMap$Callback
            r3.<init>(r0)
            r2.foreach(r3)
            return
    }

    @Override // java.util.Map
    public abstract V put(@javax.annotation.Nullable K r1, @javax.annotation.Nullable V r2);

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r4) {
            r3 = this;
            r3.validateMap(r4)
            io.realm.MapValueOperator<K, V> r0 = r3.mapValueOperator
            java.util.Objects.requireNonNull(r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L10
        L28:
            return
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = "Null keys are not allowed."
            java.util.Objects.requireNonNull(r3, r0)
            io.realm.MapValueOperator<K, V> r0 = r2.mapValueOperator
            java.lang.Object r0 = r0.get(r3)
            io.realm.MapValueOperator<K, V> r1 = r2.mapValueOperator
            io.realm.internal.OsMap r1 = r1.osMap
            r1.remove(r3)
            return r0
    }

    public final void removeListener(io.realm.RealmMap<K, V> r2, io.realm.MapChangeListener<K, V> r3) {
            r1 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableMap$MapObserverPair<K, V>> r0 = r1.mapObserverPairs
            r0.remove(r2, r3)
            io.realm.internal.ObserverPairList<io.realm.internal.ObservableMap$MapObserverPair<K, V>> r2 = r1.mapObserverPairs
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L14
            io.realm.MapValueOperator<K, V> r2 = r1.mapValueOperator
            io.realm.internal.OsMap r2 = r2.osMap
            r2.stopListening()
        L14:
            return
    }

    @Override // java.util.Map
    public int size() {
            r2 = this;
            io.realm.MapValueOperator<K, V> r0 = r2.mapValueOperator
            io.realm.internal.OsMap r0 = r0.osMap
            long r0 = r0.size()
            int r1 = (int) r0
            return r1
    }

    public abstract void validateMap(java.util.Map<? extends K, ? extends V> r1);

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            io.realm.MapValueOperator<K, V> r0 = r1.mapValueOperator
            io.realm.TypeSelectorForMap<K, V> r0 = r0.typeSelectorForMap
            java.util.Collection r0 = r0.getValues()
            return r0
    }
}
