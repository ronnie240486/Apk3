package io.realm;

import io.realm.RealmModel;

/* JADX INFO: loaded from: classes.dex */
public final class ProxyState<E extends io.realm.RealmModel> implements io.realm.internal.PendingRow.FrontEnd {
    private static io.realm.ProxyState.QueryCallback queryCallback;
    private boolean acceptDefaultValue;
    private java.util.List<java.lang.String> excludeFields;
    private E model;
    private io.realm.internal.ObserverPairList<io.realm.internal.OsObject.ObjectObserverPair> observerPairs;
    private io.realm.internal.OsObject osObject;
    private io.realm.BaseRealm realm;
    private io.realm.internal.Row row;
    private boolean underConstruction;

    /* JADX INFO: renamed from: io.realm.ProxyState$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class QueryCallback implements io.realm.internal.ObserverPairList.Callback<io.realm.internal.OsObject.ObjectObserverPair> {
        private QueryCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ QueryCallback(io.realm.ProxyState.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.realm.internal.ObserverPairList.Callback
        public /* bridge */ /* synthetic */ void onCalled(io.realm.internal.ObserverPairList.ObserverPair r1, java.lang.Object r2) {
                r0 = this;
                io.realm.internal.OsObject$ObjectObserverPair r1 = (io.realm.internal.OsObject.ObjectObserverPair) r1
                r0.onCalled(r1, r2)
                return
        }

        public void onCalled(io.realm.internal.OsObject.ObjectObserverPair r2, java.lang.Object r3) {
                r1 = this;
                io.realm.RealmModel r3 = (io.realm.RealmModel) r3
                r0 = 0
                r2.onChange(r3, r0)
                return
        }
    }

    public static class RealmChangeListenerWrapper<T extends io.realm.RealmModel> implements io.realm.RealmObjectChangeListener<T> {
        private final io.realm.RealmChangeListener<T> listener;

        public RealmChangeListenerWrapper(io.realm.RealmChangeListener<T> r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L8
                r1.listener = r2
                return
            L8:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Listener should not be null"
                r2.<init>(r0)
                throw r2
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof io.realm.ProxyState.RealmChangeListenerWrapper
                if (r0 == 0) goto Le
                io.realm.RealmChangeListener<T extends io.realm.RealmModel> r0 = r1.listener
                io.realm.ProxyState$RealmChangeListenerWrapper r2 = (io.realm.ProxyState.RealmChangeListenerWrapper) r2
                io.realm.RealmChangeListener<T extends io.realm.RealmModel> r2 = r2.listener
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
                io.realm.RealmChangeListener<T extends io.realm.RealmModel> r0 = r1.listener
                int r0 = r0.hashCode()
                return r0
        }

        @Override // io.realm.RealmObjectChangeListener
        public void onChange(T r1, @javax.annotation.Nullable io.realm.ObjectChangeSet r2) {
                r0 = this;
                io.realm.RealmChangeListener<T extends io.realm.RealmModel> r2 = r0.listener
                r2.onChange(r1)
                return
        }
    }

    static {
            io.realm.ProxyState$QueryCallback r0 = new io.realm.ProxyState$QueryCallback
            r1 = 0
            r0.<init>(r1)
            io.realm.ProxyState.queryCallback = r0
            return
    }

    public ProxyState() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.underConstruction = r0
            io.realm.internal.ObserverPairList r0 = new io.realm.internal.ObserverPairList
            r0.<init>()
            r1.observerPairs = r0
            return
    }

    public ProxyState(E r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.underConstruction = r0
            io.realm.internal.ObserverPairList r0 = new io.realm.internal.ObserverPairList
            r0.<init>()
            r1.observerPairs = r0
            r1.model = r2
            return
    }

    private void notifyQueryFinished() {
            r2 = this;
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r0 = r2.observerPairs
            io.realm.ProxyState$QueryCallback r1 = io.realm.ProxyState.queryCallback
            r0.foreach(r1)
            return
    }

    private void registerToObjectNotifier() {
            r3 = this;
            io.realm.BaseRealm r0 = r3.realm
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            if (r0 == 0) goto L30
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L30
            io.realm.internal.Row r0 = r3.row
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L15
            goto L30
        L15:
            io.realm.internal.OsObject r0 = r3.osObject
            if (r0 != 0) goto L30
            io.realm.internal.OsObject r0 = new io.realm.internal.OsObject
            io.realm.BaseRealm r1 = r3.realm
            io.realm.internal.OsSharedRealm r1 = r1.sharedRealm
            io.realm.internal.Row r2 = r3.row
            io.realm.internal.UncheckedRow r2 = (io.realm.internal.UncheckedRow) r2
            r0.<init>(r1, r2)
            r3.osObject = r0
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r1 = r3.observerPairs
            r0.setObserverPairs(r1)
            r0 = 0
            r3.observerPairs = r0
        L30:
            return
    }

    public void addChangeListener(io.realm.RealmObjectChangeListener<E> r4) {
            r3 = this;
            io.realm.internal.Row r0 = r3.row
            boolean r1 = r0 instanceof io.realm.internal.PendingRow
            if (r1 == 0) goto L13
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r0 = r3.observerPairs
            io.realm.internal.OsObject$ObjectObserverPair r1 = new io.realm.internal.OsObject$ObjectObserverPair
            E extends io.realm.RealmModel r2 = r3.model
            r1.<init>(r2, r4)
            r0.add(r1)
            goto L23
        L13:
            boolean r0 = r0 instanceof io.realm.internal.UncheckedRow
            if (r0 == 0) goto L23
            r3.registerToObjectNotifier()
            io.realm.internal.OsObject r0 = r3.osObject
            if (r0 == 0) goto L23
            E extends io.realm.RealmModel r1 = r3.model
            r0.addListener(r1, r4)
        L23:
            return
    }

    public void checkValidObject(io.realm.RealmModel r2) {
            r1 = this;
            boolean r0 = io.realm.RealmObject.isValid(r2)
            if (r0 == 0) goto L25
            boolean r0 = io.realm.RealmObject.isManaged(r2)
            if (r0 == 0) goto L25
            io.realm.internal.RealmObjectProxy r2 = (io.realm.internal.RealmObjectProxy) r2
            io.realm.ProxyState r2 = r2.realmGet$proxyState()
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            io.realm.BaseRealm r0 = r1.getRealm$realm()
            if (r2 != r0) goto L1d
            return
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'value' belongs to a different Realm."
            r2.<init>(r0)
            throw r2
        L25:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'value' is not a valid managed object."
            r2.<init>(r0)
            throw r2
    }

    public boolean getAcceptDefaultValue$realm() {
            r1 = this;
            boolean r0 = r1.acceptDefaultValue
            return r0
    }

    public java.util.List<java.lang.String> getExcludeFields$realm() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.excludeFields
            return r0
    }

    public io.realm.BaseRealm getRealm$realm() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.realm
            return r0
    }

    public io.realm.internal.Row getRow$realm() {
            r1 = this;
            io.realm.internal.Row r0 = r1.row
            return r0
    }

    public boolean isLoaded() {
            r1 = this;
            io.realm.internal.Row r0 = r1.row
            boolean r0 = r0.isLoaded()
            return r0
    }

    public boolean isUnderConstruction() {
            r1 = this;
            boolean r0 = r1.underConstruction
            return r0
    }

    public void load() {
            r2 = this;
            io.realm.internal.Row r0 = r2.row
            boolean r1 = r0 instanceof io.realm.internal.PendingRow
            if (r1 == 0) goto Lb
            io.realm.internal.PendingRow r0 = (io.realm.internal.PendingRow) r0
            r0.executeQuery()
        Lb:
            return
    }

    @Override // io.realm.internal.PendingRow.FrontEnd
    public void onQueryFinished(io.realm.internal.Row r1) {
            r0 = this;
            r0.row = r1
            r0.notifyQueryFinished()
            boolean r1 = r1.isValid()
            if (r1 == 0) goto Le
            r0.registerToObjectNotifier()
        Le:
            return
    }

    public void removeAllChangeListeners() {
            r2 = this;
            io.realm.internal.OsObject r0 = r2.osObject
            if (r0 == 0) goto La
            E extends io.realm.RealmModel r1 = r2.model
            r0.removeListener(r1)
            goto Lf
        La:
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r0 = r2.observerPairs
            r0.clear()
        Lf:
            return
    }

    public void removeChangeListener(io.realm.RealmObjectChangeListener<E> r3) {
            r2 = this;
            io.realm.internal.OsObject r0 = r2.osObject
            if (r0 == 0) goto La
            E extends io.realm.RealmModel r1 = r2.model
            r0.removeListener(r1, r3)
            goto L11
        La:
            io.realm.internal.ObserverPairList<io.realm.internal.OsObject$ObjectObserverPair> r0 = r2.observerPairs
            E extends io.realm.RealmModel r1 = r2.model
            r0.remove(r1, r3)
        L11:
            return
    }

    public void setAcceptDefaultValue$realm(boolean r1) {
            r0 = this;
            r0.acceptDefaultValue = r1
            return
    }

    public void setConstructionFinished() {
            r1 = this;
            r0 = 0
            r1.underConstruction = r0
            r0 = 0
            r1.excludeFields = r0
            return
    }

    public void setExcludeFields$realm(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.excludeFields = r1
            return
    }

    public void setRealm$realm(io.realm.BaseRealm r1) {
            r0 = this;
            r0.realm = r1
            return
    }

    public void setRow$realm(io.realm.internal.Row r1) {
            r0 = this;
            r0.row = r1
            return
    }
}
