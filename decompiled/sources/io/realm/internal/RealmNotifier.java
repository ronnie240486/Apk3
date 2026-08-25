package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
@io.realm.internal.Keep
public abstract class RealmNotifier implements java.io.Closeable {
    private java.util.List<java.lang.Runnable> finishedSendingNotificationsCallbacks;
    private final io.realm.internal.ObserverPairList.Callback<io.realm.internal.RealmNotifier.RealmObserverPair> onChangeCallBack;
    private io.realm.internal.ObserverPairList<io.realm.internal.RealmNotifier.RealmObserverPair> realmObserverPairs;
    private io.realm.internal.OsSharedRealm sharedRealm;
    private java.util.List<java.lang.Runnable> startSendingNotificationsCallbacks;
    private java.util.List<java.lang.Runnable> transactionCallbacks;


    public static class RealmObserverPair<T> extends io.realm.internal.ObserverPairList.ObserverPair<T, io.realm.RealmChangeListener<T>> {
        public RealmObserverPair(T r1, io.realm.RealmChangeListener<T> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ void access$100(io.realm.internal.RealmNotifier.RealmObserverPair r0, java.lang.Object r1) {
                r0.onChange(r1)
                return
        }

        private void onChange(T r2) {
                r1 = this;
                if (r2 == 0) goto L9
                S r0 = r1.listener
                io.realm.RealmChangeListener r0 = (io.realm.RealmChangeListener) r0
                r0.onChange(r2)
            L9:
                return
        }
    }

    public RealmNotifier(@javax.annotation.Nullable io.realm.internal.OsSharedRealm r2) {
            r1 = this;
            r1.<init>()
            io.realm.internal.ObserverPairList r0 = new io.realm.internal.ObserverPairList
            r0.<init>()
            r1.realmObserverPairs = r0
            io.realm.internal.RealmNotifier$1 r0 = new io.realm.internal.RealmNotifier$1
            r0.<init>(r1)
            r1.onChangeCallBack = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.transactionCallbacks = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.startSendingNotificationsCallbacks = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.finishedSendingNotificationsCallbacks = r0
            r1.sharedRealm = r2
            return
    }

    public static /* synthetic */ io.realm.internal.OsSharedRealm access$000(io.realm.internal.RealmNotifier r0) {
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            return r0
    }

    private void removeAllChangeListeners() {
            r1 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.RealmNotifier$RealmObserverPair> r0 = r1.realmObserverPairs
            r0.clear()
            return
    }

    public void addBeginSendingNotificationsCallback(java.lang.Runnable r2) {
            r1 = this;
            java.util.List<java.lang.Runnable> r0 = r1.startSendingNotificationsCallbacks
            r0.add(r2)
            return
    }

    public <T> void addChangeListener(T r2, io.realm.RealmChangeListener<T> r3) {
            r1 = this;
            io.realm.internal.RealmNotifier$RealmObserverPair r0 = new io.realm.internal.RealmNotifier$RealmObserverPair
            r0.<init>(r2, r3)
            io.realm.internal.ObserverPairList<io.realm.internal.RealmNotifier$RealmObserverPair> r2 = r1.realmObserverPairs
            r2.add(r0)
            return
    }

    public void addFinishedSendingNotificationsCallback(java.lang.Runnable r2) {
            r1 = this;
            java.util.List<java.lang.Runnable> r0 = r1.finishedSendingNotificationsCallbacks
            r0.add(r2)
            return
    }

    public void addTransactionCallback(java.lang.Runnable r2) {
            r1 = this;
            java.util.List<java.lang.Runnable> r0 = r1.transactionCallbacks
            r0.add(r2)
            return
    }

    public void beforeNotify() {
            r1 = this;
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            r0.invalidateIterators()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r1.removeAllChangeListeners()
            java.util.List<java.lang.Runnable> r0 = r1.startSendingNotificationsCallbacks
            r0.clear()
            java.util.List<java.lang.Runnable> r0 = r1.finishedSendingNotificationsCallbacks
            r0.clear()
            return
    }

    public void didChange() {
            r2 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.RealmNotifier$RealmObserverPair> r0 = r2.realmObserverPairs
            io.realm.internal.ObserverPairList$Callback<io.realm.internal.RealmNotifier$RealmObserverPair> r1 = r2.onChangeCallBack
            r0.foreach(r1)
            java.util.List<java.lang.Runnable> r0 = r2.transactionCallbacks
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2c
            java.util.List<java.lang.Runnable> r0 = r2.transactionCallbacks
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.transactionCallbacks = r1
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L1c
        L2c:
            return
    }

    public void didSendNotifications() {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<java.lang.Runnable> r1 = r2.startSendingNotificationsCallbacks
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<java.lang.Runnable> r1 = r2.finishedSendingNotificationsCallbacks
            java.lang.Object r1 = r1.get(r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    public int getListenersListSize() {
            r1 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.RealmNotifier$RealmObserverPair> r0 = r1.realmObserverPairs
            int r0 = r0.size()
            return r0
    }

    public abstract boolean post(java.lang.Runnable r1);

    public <E> void removeChangeListener(E r2, io.realm.RealmChangeListener<E> r3) {
            r1 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.RealmNotifier$RealmObserverPair> r0 = r1.realmObserverPairs
            r0.remove(r2, r3)
            return
    }

    public <E> void removeChangeListeners(E r2) {
            r1 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.RealmNotifier$RealmObserverPair> r0 = r1.realmObserverPairs
            r0.removeByObserver(r2)
            return
    }

    public void willSendNotifications() {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<java.lang.Runnable> r1 = r2.startSendingNotificationsCallbacks
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<java.lang.Runnable> r1 = r2.startSendingNotificationsCallbacks
            java.lang.Object r1 = r1.get(r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }
}
