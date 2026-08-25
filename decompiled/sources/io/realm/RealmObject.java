package io.realm;

/* JADX INFO: loaded from: classes2.dex */
@io.realm.annotations.RealmClass
public abstract class RealmObject implements io.realm.RealmModel, io.realm.internal.ManageableObject {
    public static final java.lang.String MSG_DELETED_OBJECT = "the object is already deleted.";
    public static final java.lang.String MSG_DYNAMIC_OBJECT = "the object is an instance of DynamicRealmObject. Use DynamicRealmObject.getDynamicRealm() instead.";
    public static final java.lang.String MSG_NULL_OBJECT = "'model' is null.";

    public RealmObject() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <E extends io.realm.RealmModel> void addChangeListener(E r1, io.realm.RealmChangeListener<E> r2) {
            io.realm.ProxyState$RealmChangeListenerWrapper r0 = new io.realm.ProxyState$RealmChangeListenerWrapper
            r0.<init>(r2)
            addChangeListener(r1, r0)
            return
    }

    public static <E extends io.realm.RealmModel> void addChangeListener(E r2, io.realm.RealmObjectChangeListener<E> r3) {
            if (r2 == 0) goto L36
            if (r3 == 0) goto L2e
            boolean r0 = r2 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L26
            io.realm.internal.RealmObjectProxy r2 = (io.realm.internal.RealmObjectProxy) r2
            io.realm.ProxyState r0 = r2.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            io.realm.internal.Capabilities r0 = r0.capabilities
            java.lang.String r1 = "Listeners cannot be used on current thread."
            r0.checkCanDeliverNotification(r1)
            io.realm.ProxyState r2 = r2.realmGet$proxyState()
            r2.addChangeListener(r3)
            return
        L26:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot add listener from this unmanaged RealmObject (created outside of Realm)"
            r2.<init>(r3)
            throw r2
        L2e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Listener should not be null"
            r2.<init>(r3)
            throw r2
        L36:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Object should not be null"
            r2.<init>(r3)
            throw r2
    }

    public static <E extends io.realm.RealmModel> io.reactivex.Observable<io.realm.rx.ObjectChange<E>> asChangesetObservable(E r2) {
            boolean r0 = r2 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L4f
            r0 = r2
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            boolean r1 = r0 instanceof io.realm.Realm
            if (r1 == 0) goto L20
            io.realm.RealmConfiguration r1 = r0.configuration
            io.realm.rx.RxObservableFactory r1 = r1.getRxFactory()
            io.realm.Realm r0 = (io.realm.Realm) r0
            io.reactivex.Observable r2 = r1.changesetsFrom(r0, r2)
            return r2
        L20:
            boolean r1 = r0 instanceof io.realm.DynamicRealm
            if (r1 == 0) goto L34
            r1 = r0
            io.realm.DynamicRealm r1 = (io.realm.DynamicRealm) r1
            io.realm.DynamicRealmObject r2 = (io.realm.DynamicRealmObject) r2
            io.realm.RealmConfiguration r0 = r0.configuration
            io.realm.rx.RxObservableFactory r0 = r0.getRxFactory()
            io.reactivex.Observable r2 = r0.changesetsFrom(r1, r2)
            return r2
        L34:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            java.lang.String r0 = " does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        L4f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot create Observables from unmanaged RealmObjects"
            r2.<init>(r0)
            throw r2
    }

    public static <E extends io.realm.RealmModel> io.reactivex.Flowable<E> asFlowable(E r2) {
            boolean r0 = r2 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L4f
            r0 = r2
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            boolean r1 = r0 instanceof io.realm.Realm
            if (r1 == 0) goto L20
            io.realm.RealmConfiguration r1 = r0.configuration
            io.realm.rx.RxObservableFactory r1 = r1.getRxFactory()
            io.realm.Realm r0 = (io.realm.Realm) r0
            io.reactivex.Flowable r2 = r1.from(r0, r2)
            return r2
        L20:
            boolean r1 = r0 instanceof io.realm.DynamicRealm
            if (r1 == 0) goto L34
            r1 = r0
            io.realm.DynamicRealm r1 = (io.realm.DynamicRealm) r1
            io.realm.DynamicRealmObject r2 = (io.realm.DynamicRealmObject) r2
            io.realm.RealmConfiguration r0 = r0.configuration
            io.realm.rx.RxObservableFactory r0 = r0.getRxFactory()
            io.reactivex.Flowable r2 = r0.from(r1, r2)
            return r2
        L34:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            java.lang.String r0 = " does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        L4f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot create Observables from unmanaged RealmObjects"
            r2.<init>(r0)
            throw r2
    }

    public static <E extends io.realm.RealmModel> void deleteFromRealm(E r4) {
            boolean r0 = r4 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L52
            io.realm.internal.RealmObjectProxy r4 = (io.realm.internal.RealmObjectProxy) r4
            io.realm.ProxyState r0 = r4.realmGet$proxyState()
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r0 == 0) goto L4a
            io.realm.ProxyState r0 = r4.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            if (r0 == 0) goto L42
            io.realm.ProxyState r0 = r4.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState r0 = r4.realmGet$proxyState()
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r1 = r0.getTable()
            long r2 = r0.getObjectKey()
            r1.moveLastOver(r2)
            io.realm.ProxyState r4 = r4.realmGet$proxyState()
            io.realm.internal.InvalidRow r0 = io.realm.internal.InvalidRow.INSTANCE
            r4.setRow$realm(r0)
            return
        L42:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Object malformed: missing Realm. Make sure to instantiate RealmObjects with Realm.createObject()"
            r4.<init>(r0)
            throw r4
        L4a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Object malformed: missing object in Realm. Make sure to instantiate RealmObjects with Realm.createObject()"
            r4.<init>(r0)
            throw r4
        L52:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Object not managed by Realm, so it cannot be removed."
            r4.<init>(r0)
            throw r4
    }

    public static <E extends io.realm.RealmModel> E freeze(E r10) {
            boolean r0 = r10 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L75
            r0 = r10
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r1 = r0.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            boolean r2 = r1.isFrozen()
            if (r2 == 0) goto L17
            r5 = r1
            goto L1c
        L17:
            io.realm.BaseRealm r2 = r1.freeze()
            r5 = r2
        L1c:
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.OsSharedRealm r2 = r5.sharedRealm
            io.realm.internal.Row r6 = r0.freeze(r2)
            boolean r0 = r5 instanceof io.realm.DynamicRealm
            if (r0 == 0) goto L34
            io.realm.DynamicRealmObject r10 = new io.realm.DynamicRealmObject
            r10.<init>(r5, r6)
            return r10
        L34:
            boolean r0 = r5 instanceof io.realm.Realm
            if (r0 == 0) goto L5a
            java.lang.Class r10 = r10.getClass()
            java.lang.Class r4 = r10.getSuperclass()
            io.realm.RealmConfiguration r10 = r5.getConfiguration()
            io.realm.internal.RealmProxyMediator r3 = r10.getSchemaMediator()
            io.realm.RealmSchema r10 = r1.getSchema()
            io.realm.internal.ColumnInfo r7 = r10.getColumnInfo(r4)
            r8 = 0
            java.util.List r9 = java.util.Collections.emptyList()
            io.realm.RealmModel r10 = r3.newInstance(r4, r5, r6, r7, r8, r9)
            return r10
        L5a:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Unknown Realm type: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L75:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "It is only possible to freeze valid managed Realm objects."
            r10.<init>(r0)
            throw r10
    }

    public static io.realm.Realm getRealm(io.realm.RealmModel r1) {
            if (r1 == 0) goto L35
            boolean r0 = r1 instanceof io.realm.DynamicRealmObject
            if (r0 != 0) goto L2c
            boolean r0 = r1 instanceof io.realm.internal.RealmObjectProxy
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            r0 = r1
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            boolean r1 = isValid(r1)
            if (r1 == 0) goto L23
            io.realm.Realm r0 = (io.realm.Realm) r0
            return r0
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "the object is already deleted."
            r1.<init>(r0)
            throw r1
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "the object is an instance of DynamicRealmObject. Use DynamicRealmObject.getDynamicRealm() instead."
            r1.<init>(r0)
            throw r1
        L35:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'model' is null."
            r1.<init>(r0)
            throw r1
    }

    public static <E extends io.realm.RealmModel> boolean isFrozen(E r1) {
            boolean r0 = r1 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L13
            io.realm.internal.RealmObjectProxy r1 = (io.realm.internal.RealmObjectProxy) r1
            io.realm.ProxyState r1 = r1.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            boolean r1 = r1.isFrozen()
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static <E extends io.realm.RealmModel> boolean isLoaded(E r1) {
            boolean r0 = r1 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L1a
            io.realm.internal.RealmObjectProxy r1 = (io.realm.internal.RealmObjectProxy) r1
            io.realm.ProxyState r0 = r1.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState r1 = r1.realmGet$proxyState()
            boolean r1 = r1.isLoaded()
            return r1
        L1a:
            r1 = 1
            return r1
    }

    public static <E extends io.realm.RealmModel> boolean isManaged(E r0) {
            boolean r0 = r0 instanceof io.realm.internal.RealmObjectProxy
            return r0
    }

    public static <E extends io.realm.RealmModel> boolean isValid(@javax.annotation.Nullable E r3) {
            boolean r0 = r3 instanceof io.realm.internal.RealmObjectProxy
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1b
            io.realm.internal.RealmObjectProxy r3 = (io.realm.internal.RealmObjectProxy) r3
            io.realm.ProxyState r3 = r3.realmGet$proxyState()
            io.realm.internal.Row r3 = r3.getRow$realm()
            if (r3 == 0) goto L19
            boolean r3 = r3.isValid()
            if (r3 == 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
        L1b:
            if (r3 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
    }

    public static <E extends io.realm.RealmModel> boolean load(E r2) {
            boolean r0 = isLoaded(r2)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r2 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L16
            io.realm.internal.RealmObjectProxy r2 = (io.realm.internal.RealmObjectProxy) r2
            io.realm.ProxyState r2 = r2.realmGet$proxyState()
            r2.load()
            return r1
        L16:
            r2 = 0
            return r2
    }

    public static <E extends io.realm.RealmModel> void removeAllChangeListeners(E r3) {
            boolean r0 = r3 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L2d
            io.realm.internal.RealmObjectProxy r3 = (io.realm.internal.RealmObjectProxy) r3
            io.realm.ProxyState r0 = r3.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            boolean r1 = r0.isClosed()
            if (r1 == 0) goto L25
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            io.realm.RealmConfiguration r0 = r0.configuration
            java.lang.String r0 = r0.getPath()
            r1[r2] = r0
            java.lang.String r0 = "Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm."
            io.realm.log.RealmLog.warn(r0, r1)
        L25:
            io.realm.ProxyState r3 = r3.realmGet$proxyState()
            r3.removeAllChangeListeners()
            return
        L2d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot remove listeners from this unmanaged RealmObject (created outside of Realm)"
            r3.<init>(r0)
            throw r3
    }

    public static <E extends io.realm.RealmModel> void removeChangeListener(E r1, io.realm.RealmChangeListener<E> r2) {
            io.realm.ProxyState$RealmChangeListenerWrapper r0 = new io.realm.ProxyState$RealmChangeListenerWrapper
            r0.<init>(r2)
            removeChangeListener(r1, r0)
            return
    }

    public static <E extends io.realm.RealmModel> void removeChangeListener(E r3, io.realm.RealmObjectChangeListener r4) {
            if (r3 == 0) goto L41
            if (r4 == 0) goto L39
            boolean r0 = r3 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L31
            io.realm.internal.RealmObjectProxy r3 = (io.realm.internal.RealmObjectProxy) r3
            io.realm.ProxyState r0 = r3.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            boolean r1 = r0.isClosed()
            if (r1 == 0) goto L29
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            io.realm.RealmConfiguration r0 = r0.configuration
            java.lang.String r0 = r0.getPath()
            r1[r2] = r0
            java.lang.String r0 = "Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm."
            io.realm.log.RealmLog.warn(r0, r1)
        L29:
            io.realm.ProxyState r3 = r3.realmGet$proxyState()
            r3.removeChangeListener(r4)
            return
        L31:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot remove listener from this unmanaged RealmObject (created outside of Realm)"
            r3.<init>(r4)
            throw r3
        L39:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Listener should not be null"
            r3.<init>(r4)
            throw r3
        L41:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Object should not be null"
            r3.<init>(r4)
            throw r3
    }

    public final <E extends io.realm.RealmModel> void addChangeListener(io.realm.RealmChangeListener<E> r1) {
            r0 = this;
            addChangeListener(r0, r1)
            return
    }

    public final <E extends io.realm.RealmModel> void addChangeListener(io.realm.RealmObjectChangeListener<E> r1) {
            r0 = this;
            addChangeListener(r0, r1)
            return
    }

    public final <E extends io.realm.RealmObject> io.reactivex.Observable<io.realm.rx.ObjectChange<E>> asChangesetObservable() {
            r1 = this;
            io.reactivex.Observable r0 = asChangesetObservable(r1)
            return r0
    }

    public final <E extends io.realm.RealmObject> io.reactivex.Flowable<E> asFlowable() {
            r1 = this;
            io.reactivex.Flowable r0 = asFlowable(r1)
            return r0
    }

    public final void deleteFromRealm() {
            r0 = this;
            deleteFromRealm(r0)
            return
    }

    public final <E extends io.realm.RealmModel> E freeze() {
            r1 = this;
            io.realm.RealmModel r0 = freeze(r1)
            return r0
    }

    public io.realm.Realm getRealm() {
            r1 = this;
            io.realm.Realm r0 = getRealm(r1)
            return r0
    }

    @Override // io.realm.internal.ManageableObject
    public final boolean isFrozen() {
            r1 = this;
            boolean r0 = isFrozen(r1)
            return r0
    }

    public final boolean isLoaded() {
            r1 = this;
            boolean r0 = isLoaded(r1)
            return r0
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isManaged() {
            r1 = this;
            boolean r0 = isManaged(r1)
            return r0
    }

    @Override // io.realm.internal.ManageableObject
    public final boolean isValid() {
            r1 = this;
            boolean r0 = isValid(r1)
            return r0
    }

    public final boolean load() {
            r1 = this;
            boolean r0 = load(r1)
            return r0
    }

    public final void removeAllChangeListeners() {
            r0 = this;
            removeAllChangeListeners(r0)
            return
    }

    public final void removeChangeListener(io.realm.RealmChangeListener r1) {
            r0 = this;
            removeChangeListener(r0, r1)
            return
    }

    public final void removeChangeListener(io.realm.RealmObjectChangeListener r1) {
            r0 = this;
            removeChangeListener(r0, r1)
            return
    }
}
