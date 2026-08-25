package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
@io.realm.internal.Keep
public interface ObservableMap {

    /* JADX INFO: loaded from: classes.dex */
    public static class Callback<K, V> implements io.realm.internal.ObserverPairList.Callback<io.realm.internal.ObservableMap.MapObserverPair<K, V>> {
        private final io.realm.MapChangeSet<K> changeSet;

        public Callback(io.realm.MapChangeSet<K> r1) {
                r0 = this;
                r0.<init>()
                r0.changeSet = r1
                return
        }

        public void onCalled(io.realm.internal.ObservableMap.MapObserverPair<K, V> r2, java.lang.Object r3) {
                r1 = this;
                io.realm.MapChangeSet<K> r0 = r1.changeSet
                r2.onChange(r3, r0)
                return
        }

        @Override // io.realm.internal.ObserverPairList.Callback
        public /* bridge */ /* synthetic */ void onCalled(io.realm.internal.ObserverPairList.ObserverPair r1, java.lang.Object r2) {
                r0 = this;
                io.realm.internal.ObservableMap$MapObserverPair r1 = (io.realm.internal.ObservableMap.MapObserverPair) r1
                r0.onCalled(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class MapObserverPair<K, V> extends io.realm.internal.ObserverPairList.ObserverPair<io.realm.RealmMap<K, V>, java.lang.Object> {
        public MapObserverPair(io.realm.RealmMap<K, V> r1, io.realm.MapChangeListener<K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public void onChange(java.lang.Object r2, io.realm.MapChangeSet<K> r3) {
                r1 = this;
                S r0 = r1.listener
                io.realm.MapChangeListener r0 = (io.realm.MapChangeListener) r0
                io.realm.RealmMap r2 = (io.realm.RealmMap) r2
                r0.onChange(r2, r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class RealmChangeListenerWrapper<K, V> implements io.realm.MapChangeListener<K, V> {
        private final io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> listener;

        public RealmChangeListenerWrapper(io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r1) {
                r0 = this;
                r0.<init>()
                r0.listener = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof io.realm.internal.ObservableMap.RealmChangeListenerWrapper
                if (r0 == 0) goto Le
                io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r0 = r1.listener
                io.realm.internal.ObservableMap$RealmChangeListenerWrapper r2 = (io.realm.internal.ObservableMap.RealmChangeListenerWrapper) r2
                io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r2 = r2.listener
                if (r0 != r2) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        public int hashCode() {
                r1 = this;
                io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r0 = r1.listener
                int r0 = r0.hashCode()
                return r0
        }

        @Override // io.realm.MapChangeListener
        public void onChange(io.realm.RealmMap<K, V> r1, @org.jetbrains.annotations.Nullable io.realm.MapChangeSet<K> r2) {
                r0 = this;
                io.realm.RealmChangeListener<io.realm.RealmMap<K, V>> r2 = r0.listener
                r2.onChange(r1)
                return
        }
    }

    void notifyChangeListeners(long r1);
}
