package io.realm;

/* JADX INFO: loaded from: classes.dex */
public class CollectionUtils {
    public static final java.lang.String DICTIONARY_TYPE = "dictionary";
    public static final java.lang.String LIST_TYPE = "list";
    public static final java.lang.String SET_TYPE = "set";

    public CollectionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkCanObjectBeCopied(io.realm.BaseRealm r4, io.realm.RealmModel r5, java.lang.String r6, java.lang.String r7) {
            boolean r0 = r5 instanceof io.realm.internal.RealmObjectProxy
            r1 = 1
            if (r0 == 0) goto L9f
            r0 = r5
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            boolean r2 = r0 instanceof io.realm.DynamicRealmObject
            r3 = 0
            if (r2 == 0) goto L6c
            io.realm.ProxyState r2 = r0.realmGet$proxyState()
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            if (r2 != r4) goto L4c
            io.realm.DynamicRealmObject r5 = (io.realm.DynamicRealmObject) r5
            java.lang.String r4 = r5.getType()
            java.lang.Class<io.realm.RealmAny> r5 = io.realm.RealmAny.class
            java.lang.String r5 = r5.getCanonicalName()
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L4b
            boolean r5 = r6.equals(r4)
            if (r5 == 0) goto L30
            goto L4b
        L30:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Locale r0 = java.util.Locale.US
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r7
            r2[r1] = r7
            r7 = 2
            r2[r7] = r6
            r6 = 3
            r2[r6] = r4
            java.lang.String r4 = "The object has a different type from %s's. Type of the %s is '%s', type of object is '%s'."
            java.lang.String r4 = java.lang.String.format(r0, r4, r2)
            r5.<init>(r4)
            throw r5
        L4b:
            return r3
        L4c:
            long r4 = r4.threadId
            io.realm.ProxyState r6 = r0.realmGet$proxyState()
            io.realm.BaseRealm r6 = r6.getRealm$realm()
            long r6 = r6.threadId
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L64
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Cannot pass DynamicRealmObject between Realm instances."
            r4.<init>(r5)
            throw r4
        L64:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Cannot pass an object to a Realm instance created in another thread."
            r4.<init>(r5)
            throw r4
        L6c:
            io.realm.ProxyState r5 = r0.realmGet$proxyState()
            io.realm.internal.Row r5 = r5.getRow$realm()
            if (r5 == 0) goto L9f
            io.realm.ProxyState r5 = r0.realmGet$proxyState()
            io.realm.BaseRealm r5 = r5.getRealm$realm()
            java.lang.String r5 = r5.getPath()
            java.lang.String r6 = r4.getPath()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L9f
            io.realm.ProxyState r5 = r0.realmGet$proxyState()
            io.realm.BaseRealm r5 = r5.getRealm$realm()
            if (r4 != r5) goto L97
            return r3
        L97:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Cannot pass an object from another Realm instance."
            r4.<init>(r5)
            throw r4
        L9f:
            return r1
    }

    public static void checkForAddRemoveListener(io.realm.BaseRealm r0, @javax.annotation.Nullable java.lang.Object r1, boolean r2) {
            if (r2 == 0) goto Ld
            if (r1 == 0) goto L5
            goto Ld
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Listener should not be null"
            r0.<init>(r1)
            throw r0
        Ld:
            r0.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r0.sharedRealm
            io.realm.internal.Capabilities r0 = r0.capabilities
            java.lang.String r1 = "Listeners cannot be used on current thread."
            r0.checkCanDeliverNotification(r1)
            return
    }

    public static <E extends io.realm.RealmModel> E copyToRealm(io.realm.BaseRealm r2, E r3) {
            io.realm.Realm r2 = (io.realm.Realm) r2
            io.realm.RealmConfiguration r0 = r2.getConfiguration()
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            java.lang.Class r1 = r3.getClass()
            java.lang.String r0 = r0.getSimpleClassName(r1)
            io.realm.internal.OsSharedRealm r1 = r2.sharedRealm
            java.lang.String r0 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r1, r0)
            r1 = 0
            if (r0 == 0) goto L22
            io.realm.ImportFlag[] r0 = new io.realm.ImportFlag[r1]
            io.realm.RealmModel r2 = r2.copyToRealmOrUpdate(r3, r0)
            return r2
        L22:
            io.realm.ImportFlag[] r0 = new io.realm.ImportFlag[r1]
            io.realm.RealmModel r2 = r2.copyToRealm(r3, r0)
            return r2
    }

    public static io.realm.RealmAny copyToRealmIfNeeded(io.realm.BaseRealm r4, io.realm.RealmAny r5) {
            io.realm.RealmAny$Type r0 = r5.getType()
            io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.OBJECT
            if (r0 != r1) goto L98
            java.lang.Class r0 = r5.getValueClass()
            io.realm.RealmModel r1 = r5.asRealmModel(r0)
            boolean r2 = r1 instanceof io.realm.internal.RealmObjectProxy
            if (r2 == 0) goto L8f
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (io.realm.internal.RealmObjectProxy) r2
            boolean r3 = r2 instanceof io.realm.DynamicRealmObject
            if (r3 == 0) goto L46
            io.realm.ProxyState r0 = r2.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            if (r0 != r4) goto L26
            return r5
        L26:
            long r4 = r4.threadId
            io.realm.ProxyState r0 = r2.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            long r0 = r0.threadId
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L3e
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Cannot copy DynamicRealmObject between Realm instances."
            r4.<init>(r5)
            throw r4
        L3e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Cannot copy an object to a Realm instance created in another thread."
            r4.<init>(r5)
            throw r4
        L46:
            io.realm.RealmSchema r3 = r4.getSchema()
            io.realm.RealmObjectSchema r0 = r3.getSchemaForClass(r0)
            boolean r0 = r0.isEmbedded()
            if (r0 != 0) goto L87
            io.realm.ProxyState r0 = r2.realmGet$proxyState()
            io.realm.internal.Row r0 = r0.getRow$realm()
            if (r0 == 0) goto L8f
            io.realm.ProxyState r0 = r2.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            java.lang.String r0 = r0.getPath()
            java.lang.String r3 = r4.getPath()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L8f
            io.realm.ProxyState r0 = r2.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            if (r4 != r0) goto L7f
            return r5
        L7f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Cannot copy an object from another Realm instance."
            r4.<init>(r5)
            throw r4
        L87:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Embedded objects are not supported by RealmAny."
            r4.<init>(r5)
            throw r4
        L8f:
            io.realm.RealmModel r4 = copyToRealm(r4, r1)
            io.realm.RealmAny r4 = io.realm.RealmAny.valueOf(r4)
            return r4
        L98:
            return r5
    }

    public static boolean isClassForRealmModel(java.lang.Class<?> r1) {
            java.lang.Class<io.realm.RealmModel> r0 = io.realm.RealmModel.class
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
    }

    public static boolean isEmbedded(io.realm.BaseRealm r1, io.realm.RealmModel r2) {
            boolean r0 = r1 instanceof io.realm.Realm
            if (r0 == 0) goto L15
            io.realm.RealmSchema r1 = r1.getSchema()
            java.lang.Class r2 = r2.getClass()
            io.realm.RealmObjectSchema r1 = r1.getSchemaForClass(r2)
            boolean r1 = r1.isEmbedded()
            return r1
        L15:
            io.realm.DynamicRealmObject r2 = (io.realm.DynamicRealmObject) r2
            java.lang.String r2 = r2.getType()
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.RealmObjectSchema r1 = r1.getSchemaForClass(r2)
            boolean r1 = r1.isEmbedded()
            return r1
    }

    public static void updateEmbeddedObject(io.realm.Realm r8, io.realm.RealmModel r9, long r10) {
            io.realm.RealmConfiguration r0 = r8.getConfiguration()
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            java.lang.Class r1 = r9.getClass()
            java.lang.Class r2 = io.realm.internal.Util.getOriginalModelClass(r1)
            io.realm.internal.Table r1 = r8.getTable(r2)
            io.realm.internal.UncheckedRow r4 = r1.getUncheckedRow(r10)
            io.realm.RealmSchema r10 = r8.getSchema()
            io.realm.internal.ColumnInfo r5 = r10.getColumnInfo(r2)
            java.util.List r7 = java.util.Collections.EMPTY_LIST
            r6 = 1
            r1 = r0
            r3 = r8
            io.realm.RealmModel r4 = r1.newInstance(r2, r3, r4, r5, r6, r7)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r6 = java.util.Collections.EMPTY_SET
            r2 = r8
            r3 = r9
            r1.updateEmbeddedObject(r2, r3, r4, r5, r6)
            return
    }
}
