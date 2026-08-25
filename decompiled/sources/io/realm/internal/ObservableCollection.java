package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
@io.realm.internal.Keep
public interface ObservableCollection {

    public static class Callback implements io.realm.internal.ObserverPairList.Callback<io.realm.internal.ObservableCollection.CollectionObserverPair> {
        private final io.realm.internal.OsCollectionChangeSet changeSet;

        public Callback(io.realm.internal.OsCollectionChangeSet r1) {
                r0 = this;
                r0.<init>()
                r0.changeSet = r1
                return
        }

        public void onCalled(io.realm.internal.ObservableCollection.CollectionObserverPair r2, java.lang.Object r3) {
                r1 = this;
                io.realm.internal.OsCollectionChangeSet r0 = r1.changeSet
                r2.onChange(r3, r0)
                return
        }

        @Override // io.realm.internal.ObserverPairList.Callback
        public /* bridge */ /* synthetic */ void onCalled(io.realm.internal.ObserverPairList.ObserverPair r1, java.lang.Object r2) {
                r0 = this;
                io.realm.internal.ObservableCollection$CollectionObserverPair r1 = (io.realm.internal.ObservableCollection.CollectionObserverPair) r1
                r0.onCalled(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class CollectionObserverPair<T> extends io.realm.internal.ObserverPairList.ObserverPair<T, java.lang.Object> {
        public CollectionObserverPair(T r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public void onChange(T r3, io.realm.internal.OsCollectionChangeSet r4) {
                r2 = this;
                S r0 = r2.listener
                boolean r1 = r0 instanceof io.realm.OrderedRealmCollectionChangeListener
                if (r1 == 0) goto L11
                io.realm.OrderedRealmCollectionChangeListener r0 = (io.realm.OrderedRealmCollectionChangeListener) r0
                io.realm.internal.StatefulCollectionChangeSet r1 = new io.realm.internal.StatefulCollectionChangeSet
                r1.<init>(r4)
                r0.onChange(r3, r1)
                goto L1a
            L11:
                boolean r4 = r0 instanceof io.realm.RealmChangeListener
                if (r4 == 0) goto L1b
                io.realm.RealmChangeListener r0 = (io.realm.RealmChangeListener) r0
                r0.onChange(r3)
            L1a:
                return
            L1b:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.String r4 = "Unsupported listener type: "
                java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
                S r0 = r2.listener
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class RealmChangeListenerWrapper<T> implements io.realm.OrderedRealmCollectionChangeListener<T> {
        private final io.realm.RealmChangeListener<T> listener;

        public RealmChangeListenerWrapper(io.realm.RealmChangeListener<T> r1) {
                r0 = this;
                r0.<init>()
                r0.listener = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof io.realm.internal.ObservableCollection.RealmChangeListenerWrapper
                if (r0 == 0) goto Le
                io.realm.RealmChangeListener<T> r0 = r1.listener
                io.realm.internal.ObservableCollection$RealmChangeListenerWrapper r2 = (io.realm.internal.ObservableCollection.RealmChangeListenerWrapper) r2
                io.realm.RealmChangeListener<T> r2 = r2.listener
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
                io.realm.RealmChangeListener<T> r0 = r1.listener
                int r0 = r0.hashCode()
                return r0
        }

        @Override // io.realm.OrderedRealmCollectionChangeListener
        public void onChange(T r1, @javax.annotation.Nullable io.realm.OrderedCollectionChangeSet r2) {
                r0 = this;
                io.realm.RealmChangeListener<T> r2 = r0.listener
                r2.onChange(r1)
                return
        }
    }

    void notifyChangeListeners(long r1);
}
