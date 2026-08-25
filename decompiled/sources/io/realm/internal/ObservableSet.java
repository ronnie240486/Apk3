package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
@io.realm.internal.Keep
public interface ObservableSet {

    /* JADX INFO: loaded from: classes.dex */
    public static class Callback<T> implements io.realm.internal.ObserverPairList.Callback<io.realm.internal.ObservableSet.SetObserverPair<T>> {
        private final io.realm.SetChangeSet changeSet;

        public Callback(io.realm.SetChangeSet r1) {
                r0 = this;
                r0.<init>()
                r0.changeSet = r1
                return
        }

        public void onCalled(io.realm.internal.ObservableSet.SetObserverPair<T> r2, java.lang.Object r3) {
                r1 = this;
                io.realm.SetChangeSet r0 = r1.changeSet
                r2.onChange(r3, r0)
                return
        }

        @Override // io.realm.internal.ObserverPairList.Callback
        public /* bridge */ /* synthetic */ void onCalled(io.realm.internal.ObserverPairList.ObserverPair r1, java.lang.Object r2) {
                r0 = this;
                io.realm.internal.ObservableSet$SetObserverPair r1 = (io.realm.internal.ObservableSet.SetObserverPair) r1
                r0.onCalled(r1, r2)
                return
        }
    }

    public static class SetObserverPair<T> extends io.realm.internal.ObserverPairList.ObserverPair<io.realm.RealmSet<T>, java.lang.Object> {
        public SetObserverPair(io.realm.RealmSet<T> r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public void onChange(java.lang.Object r2, io.realm.SetChangeSet r3) {
                r1 = this;
                S r0 = r1.listener
                io.realm.SetChangeListener r0 = (io.realm.SetChangeListener) r0
                io.realm.RealmSet r2 = (io.realm.RealmSet) r2
                r0.onChange(r2, r3)
                return
        }
    }

    void notifyChangeListeners(long r1);
}
