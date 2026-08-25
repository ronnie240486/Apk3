package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectServerFacade {
    public static final int SYNC_CONFIG_OPTIONS = 17;
    private static final io.realm.internal.ObjectServerFacade nonSyncFacade = null;
    private static io.realm.internal.ObjectServerFacade syncFacade;

    public interface RealmCacheAccessor {
        io.realm.Realm createRealmOrGetFromCache(io.realm.RealmConfiguration r1, io.realm.internal.OsSharedRealm.VersionID r2);
    }

    public interface RealmInstanceFactory {
        io.realm.Realm createInstance(io.realm.internal.OsSharedRealm r1);
    }

    static {
            java.lang.String r0 = "Failed to init SyncObjectServerFacade"
            io.realm.internal.ObjectServerFacade r1 = new io.realm.internal.ObjectServerFacade
            r1.<init>()
            io.realm.internal.ObjectServerFacade.nonSyncFacade = r1
            r1 = 0
            io.realm.internal.ObjectServerFacade.syncFacade = r1
            java.lang.String r1 = "io.realm.internal.SyncObjectServerFacade"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L36 java.lang.InstantiationException -> L3d java.lang.ClassNotFoundException -> L44
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L36 java.lang.InstantiationException -> L3d java.lang.ClassNotFoundException -> L44
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L36 java.lang.InstantiationException -> L3d java.lang.ClassNotFoundException -> L44
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L36 java.lang.InstantiationException -> L3d java.lang.ClassNotFoundException -> L44
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L36 java.lang.InstantiationException -> L3d java.lang.ClassNotFoundException -> L44
            io.realm.internal.ObjectServerFacade r1 = (io.realm.internal.ObjectServerFacade) r1     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L36 java.lang.InstantiationException -> L3d java.lang.ClassNotFoundException -> L44
            io.realm.internal.ObjectServerFacade.syncFacade = r1     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.NoSuchMethodException -> L2f java.lang.IllegalAccessException -> L36 java.lang.InstantiationException -> L3d java.lang.ClassNotFoundException -> L44
            goto L44
        L24:
            r1 = move-exception
            io.realm.exceptions.RealmException r2 = new io.realm.exceptions.RealmException
            java.lang.Throwable r1 = r1.getTargetException()
            r2.<init>(r0, r1)
            throw r2
        L2f:
            r1 = move-exception
            io.realm.exceptions.RealmException r2 = new io.realm.exceptions.RealmException
            r2.<init>(r0, r1)
            throw r2
        L36:
            r1 = move-exception
            io.realm.exceptions.RealmException r2 = new io.realm.exceptions.RealmException
            r2.<init>(r0, r1)
            throw r2
        L3d:
            r1 = move-exception
            io.realm.exceptions.RealmException r2 = new io.realm.exceptions.RealmException
            r2.<init>(r0, r1)
            throw r2
        L44:
            return
    }

    public ObjectServerFacade() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.realm.internal.ObjectServerFacade getFacade(boolean r0) {
            if (r0 == 0) goto L5
            io.realm.internal.ObjectServerFacade r0 = io.realm.internal.ObjectServerFacade.syncFacade
            return r0
        L5:
            io.realm.internal.ObjectServerFacade r0 = io.realm.internal.ObjectServerFacade.nonSyncFacade
            return r0
    }

    public static io.realm.internal.ObjectServerFacade getSyncFacadeIfPossible() {
            io.realm.internal.ObjectServerFacade r0 = io.realm.internal.ObjectServerFacade.syncFacade
            if (r0 == 0) goto L5
            return r0
        L5:
            io.realm.internal.ObjectServerFacade r0 = io.realm.internal.ObjectServerFacade.nonSyncFacade
            return r0
    }

    public void checkFlexibleSyncEnabled(io.realm.RealmConfiguration r1) {
            r0 = this;
            return
    }

    public void createNativeSyncSession(io.realm.RealmConfiguration r1) {
            r0 = this;
            return
    }

    public void downloadInitialFlexibleSyncData(io.realm.Realm r1, io.realm.RealmConfiguration r2) {
            r0 = this;
            return
    }

    public void downloadInitialRemoteChanges(io.realm.RealmConfiguration r1) {
            r0 = this;
            return
    }

    public java.lang.Object[] getSyncConfigurationOptions(io.realm.RealmConfiguration r1) {
            r0 = this;
            r1 = 17
            java.lang.Object[] r1 = new java.lang.Object[r1]
            return r1
    }

    public java.lang.String getSyncServerCertificateAssetName(io.realm.RealmConfiguration r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.lang.String getSyncServerCertificateFilePath(io.realm.RealmConfiguration r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void initialize(android.content.Context r1, java.lang.String r2, io.realm.internal.ObjectServerFacade.RealmCacheAccessor r3, io.realm.internal.ObjectServerFacade.RealmInstanceFactory r4) {
            r0 = this;
            return
    }

    public void realmClosed(io.realm.RealmConfiguration r1) {
            r0 = this;
            return
    }

    public boolean wasDownloadInterrupted(java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void wrapObjectStoreSessionIfRequired(io.realm.internal.OsRealmConfig r1) {
            r0 = this;
            return
    }
}
