package io.realm;

/* JADX INFO: loaded from: classes.dex */
public abstract class RealmMap<K, V> implements java.util.Map<K, V>, io.realm.internal.ManageableObject, io.realm.internal.Freezable<io.realm.RealmMap<K, V>> {
    public final io.realm.RealmMap.MapStrategy<K, V> mapStrategy;

    /* JADX INFO: renamed from: io.realm.RealmMap$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class ManagedMapStrategy<K, V> extends io.realm.RealmMap.MapStrategy<K, V> {
        private final io.realm.ManagedMapManager<K, V> managedMapManager;

        public ManagedMapStrategy(io.realm.ManagedMapManager<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.managedMapManager = r1
                return
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final void addChangeListener(io.realm.RealmMap<K, V> r2, io.realm.MapChangeListener<K, V> r3) {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                r0.addChangeListener(r2, r3)
                return
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final void addChangeListener(io.realm.RealmMap<K, V> r3, io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r4) {
                r2 = this;
                io.realm.ManagedMapManager<K, V> r0 = r2.managedMapManager
                java.util.Objects.requireNonNull(r0)
                io.realm.internal.ObservableMap$RealmChangeListenerWrapper r1 = new io.realm.internal.ObservableMap$RealmChangeListenerWrapper
                r1.<init>(r4)
                r0.addChangeListener(r3, r1)
                return
        }

        @Override // java.util.Map
        public void clear() {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                r0.clear()
                return
        }

        @Override // java.util.Map
        public boolean containsKey(@javax.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.Map
        public boolean containsValue(@javax.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                java.util.Set r0 = r0.entrySet()
                return r0
        }

        @Override // io.realm.internal.Freezable
        public io.realm.RealmMap<K, V> freeze() {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                io.realm.RealmMap r0 = r0.freeze()
                return r0
        }

        @Override // io.realm.internal.Freezable
        public /* bridge */ /* synthetic */ java.lang.Object freeze() {
                r1 = this;
                io.realm.RealmMap r0 = r1.freeze()
                return r0
        }

        @Override // java.util.Map
        public V get(java.lang.Object r2) {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final java.lang.Class<V> getValueClass() {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                io.realm.TypeSelectorForMap<K, V> r0 = r0.typeSelectorForMap
                java.lang.Class r0 = r0.getValueClass()
                return r0
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final java.lang.String getValueClassName() {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                io.realm.TypeSelectorForMap<K, V> r0 = r0.typeSelectorForMap
                java.lang.String r0 = r0.getValueClassName()
                return r0
        }

        @Override // java.util.Map
        public boolean isEmpty() {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                boolean r0 = r0.isFrozen()
                return r0
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isManaged() {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                boolean r0 = r0.isManaged()
                return r0
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isValid() {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                boolean r0 = r0.isValid()
                return r0
        }

        @Override // java.util.Map
        public java.util.Set<K> keySet() {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                java.util.Set r0 = r0.keySet()
                return r0
        }

        @Override // java.util.Map
        public void putAll(java.util.Map<? extends K, ? extends V> r2) {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                r0.putAll(r2)
                return
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final V putInternal(K r2, V r3) {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                java.lang.Object r2 = r0.put(r2, r3)
                return r2
        }

        @Override // java.util.Map
        public V remove(java.lang.Object r2) {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                java.lang.Object r2 = r0.remove(r2)
                return r2
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final void removeAllChangeListeners() {
                r4 = this;
                io.realm.ManagedMapManager<K, V> r0 = r4.managedMapManager
                io.realm.BaseRealm r1 = r0.baseRealm
                r2 = 0
                r3 = 0
                io.realm.CollectionUtils.checkForAddRemoveListener(r1, r2, r3)
                io.realm.internal.ObserverPairList<io.realm.internal.ObservableMap$MapObserverPair<K, V>> r1 = r0.mapObserverPairs
                r1.clear()
                io.realm.MapValueOperator<K, V> r0 = r0.mapValueOperator
                io.realm.internal.OsMap r0 = r0.osMap
                r0.stopListening()
                return
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final void removeChangeListener(io.realm.RealmMap<K, V> r2, io.realm.MapChangeListener<K, V> r3) {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                r0.removeListener(r2, r3)
                return
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final void removeChangeListener(io.realm.RealmMap<K, V> r3, io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r4) {
                r2 = this;
                io.realm.ManagedMapManager<K, V> r0 = r2.managedMapManager
                java.util.Objects.requireNonNull(r0)
                io.realm.internal.ObservableMap$RealmChangeListenerWrapper r1 = new io.realm.internal.ObservableMap$RealmChangeListenerWrapper
                r1.<init>(r4)
                r0.removeListener(r3, r1)
                return
        }

        @Override // java.util.Map
        public int size() {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.Map
        public java.util.Collection<V> values() {
                r1 = this;
                io.realm.ManagedMapManager<K, V> r0 = r1.managedMapManager
                java.util.Collection r0 = r0.values()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class MapStrategy<K, V> implements java.util.Map<K, V>, io.realm.internal.ManageableObject, io.realm.internal.Freezable<io.realm.RealmMap<K, V>> {
        public MapStrategy() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void addChangeListener(io.realm.RealmMap<K, V> r1, io.realm.MapChangeListener<K, V> r2);

        public abstract void addChangeListener(io.realm.RealmMap<K, V> r1, io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r2);

        public abstract java.lang.Class<V> getValueClass();

        public abstract java.lang.String getValueClassName();

        @Override // java.util.Map
        public V put(K r3, V r4) {
                r2 = this;
                java.lang.String r0 = "Null keys are not allowed."
                java.util.Objects.requireNonNull(r3, r0)
                java.lang.Class r0 = r3.getClass()
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r0 != r1) goto L29
                r0 = r3
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = "."
                boolean r1 = r0.contains(r1)
                if (r1 != 0) goto L21
                java.lang.String r1 = "$"
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L21
                goto L29
            L21:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Keys containing dots ('.') or dollar signs ('$') are not allowed."
                r3.<init>(r4)
                throw r3
            L29:
                java.lang.Object r3 = r2.putInternal(r3, r4)
                return r3
        }

        public abstract V putInternal(K r1, @javax.annotation.Nullable V r2);

        public abstract void removeAllChangeListeners();

        public abstract void removeChangeListener(io.realm.RealmMap<K, V> r1, io.realm.MapChangeListener<K, V> r2);

        public abstract void removeChangeListener(io.realm.RealmMap<K, V> r1, io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class UnmanagedMapStrategy<K, V> extends io.realm.RealmMap.MapStrategy<K, V> {
        private final java.util.Map<K, V> unmanagedMap;

        private UnmanagedMapStrategy() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.unmanagedMap = r0
                return
        }

        public /* synthetic */ UnmanagedMapStrategy(io.realm.RealmMap.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final void addChangeListener(io.realm.RealmMap<K, V> r1, io.realm.MapChangeListener<K, V> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Unmanaged RealmMaps do not support change listeners."
                r1.<init>(r2)
                throw r1
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final void addChangeListener(io.realm.RealmMap<K, V> r1, io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Unmanaged RealmMaps do not support change listeners."
                r1.<init>(r2)
                throw r1
        }

        @Override // java.util.Map
        public void clear() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmanagedMap
                r0.clear()
                return
        }

        @Override // java.util.Map
        public boolean containsKey(@javax.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmanagedMap
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.Map
        public boolean containsValue(@javax.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmanagedMap
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmanagedMap
                java.util.Set r0 = r0.entrySet()
                return r0
        }

        @Override // io.realm.internal.Freezable
        public io.realm.RealmMap<K, V> freeze() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Unmanaged RealmMaps cannot be frozen."
                r0.<init>(r1)
                throw r0
        }

        @Override // io.realm.internal.Freezable
        public /* bridge */ /* synthetic */ java.lang.Object freeze() {
                r1 = this;
                io.realm.RealmMap r0 = r1.freeze()
                return r0
        }

        @Override // java.util.Map
        public V get(java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmanagedMap
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final java.lang.Class<V> getValueClass() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Unmanaged maps do not support retrieving the value class."
                r0.<init>(r1)
                throw r0
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final java.lang.String getValueClassName() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Unmanaged maps do not support retrieving the value class name."
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map
        public boolean isEmpty() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmanagedMap
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
                r1 = this;
                r0 = 0
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

        @Override // java.util.Map
        public java.util.Set<K> keySet() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmanagedMap
                java.util.Set r0 = r0.keySet()
                return r0
        }

        @Override // java.util.Map
        public void putAll(java.util.Map<? extends K, ? extends V> r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmanagedMap
                r0.putAll(r2)
                return
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final V putInternal(K r2, @javax.annotation.Nullable V r3) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmanagedMap
                java.lang.Object r2 = r0.put(r2, r3)
                return r2
        }

        @Override // java.util.Map
        public V remove(java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmanagedMap
                java.lang.Object r2 = r0.remove(r2)
                return r2
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final void removeAllChangeListeners() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Cannot remove change listener because unmanaged RealmMaps do not support change listeners."
                r0.<init>(r1)
                throw r0
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final void removeChangeListener(io.realm.RealmMap<K, V> r1, io.realm.MapChangeListener<K, V> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Cannot remove change listener because unmanaged RealmMaps do not support change listeners."
                r1.<init>(r2)
                throw r1
        }

        @Override // io.realm.RealmMap.MapStrategy
        public final void removeChangeListener(io.realm.RealmMap<K, V> r1, io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Cannot remove change listener because unmanaged RealmMaps do not support change listeners."
                r1.<init>(r2)
                throw r1
        }

        @Override // java.util.Map
        public int size() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmanagedMap
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.Map
        public java.util.Collection<V> values() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.unmanagedMap
                java.util.Collection r0 = r0.values()
                return r0
        }
    }

    public RealmMap() {
            r2 = this;
            r2.<init>()
            io.realm.RealmMap$UnmanagedMapStrategy r0 = new io.realm.RealmMap$UnmanagedMapStrategy
            r1 = 0
            r0.<init>(r1)
            r2.mapStrategy = r0
            return
    }

    public RealmMap(io.realm.RealmMap.MapStrategy<K, V> r1) {
            r0 = this;
            r0.<init>()
            r0.mapStrategy = r1
            return
    }

    public void addChangeListener(io.realm.MapChangeListener<K, V> r2) {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            r0.addChangeListener(r1, r2)
            return
    }

    public void addChangeListener(io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r2) {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            r0.addChangeListener(r1, r2)
            return
    }

    @Override // java.util.Map
    public void clear() {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(@javax.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // io.realm.internal.Freezable
    public io.realm.RealmMap<K, V> freeze() {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            java.lang.Object r0 = r0.freeze()
            io.realm.RealmMap r0 = (io.realm.RealmMap) r0
            return r0
    }

    @Override // io.realm.internal.Freezable
    public /* bridge */ /* synthetic */ java.lang.Object freeze() {
            r1 = this;
            io.realm.RealmMap r0 = r1.freeze()
            return r0
    }

    @Override // java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            boolean r0 = r0.isFrozen()
            return r0
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isManaged() {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            boolean r0 = r0.isManaged()
            return r0
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isValid() {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            boolean r0 = r0.isValid()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public V put(K r2, @javax.annotation.Nullable V r3) {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            r0.putAll(r2)
            return
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    public void removeAllChangeListeners() {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            r0.removeAllChangeListeners()
            return
    }

    public void removeChangeListener(io.realm.MapChangeListener<K, V> r2) {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            r0.removeChangeListener(r1, r2)
            return
    }

    public void removeChangeListener(io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r2) {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            r0.removeChangeListener(r1, r2)
            return
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            io.realm.RealmMap$MapStrategy<K, V> r0 = r1.mapStrategy
            java.util.Collection r0 = r0.values()
            return r0
    }
}
