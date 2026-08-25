package io.realm;

/* JADX INFO: loaded from: classes.dex */
public class Realm extends io.realm.BaseRealm {
    public static final java.lang.String DEFAULT_REALM_NAME = "default.realm";
    public static final int ENCRYPTION_KEY_LENGTH = 64;
    private static final java.lang.String NULL_CONFIG_MSG = "A non-null RealmConfiguration must be provided";
    private static io.realm.RealmConfiguration defaultConfiguration;
    private static final java.lang.Object defaultConfigurationLock = null;
    private final io.realm.RealmSchema schema;

    /* JADX INFO: renamed from: io.realm.Realm$1, reason: invalid class name */
    public class AnonymousClass1 implements java.lang.Runnable {
        public final /* synthetic */ io.realm.Realm this$0;
        public final /* synthetic */ boolean val$canDeliverNotification;
        public final /* synthetic */ io.realm.Realm.Transaction.OnError val$onError;
        public final /* synthetic */ io.realm.Realm.Transaction.OnSuccess val$onSuccess;
        public final /* synthetic */ io.realm.RealmConfiguration val$realmConfiguration;
        public final /* synthetic */ io.realm.internal.RealmNotifier val$realmNotifier;
        public final /* synthetic */ io.realm.Realm.Transaction val$transaction;



        public AnonymousClass1(io.realm.Realm r1, io.realm.RealmConfiguration r2, io.realm.Realm.Transaction r3, boolean r4, io.realm.Realm.Transaction.OnSuccess r5, io.realm.internal.RealmNotifier r6, io.realm.Realm.Transaction.OnError r7) {
                r0 = this;
                r0.this$0 = r1
                r0.val$realmConfiguration = r2
                r0.val$transaction = r3
                r0.val$canDeliverNotification = r4
                r0.val$onSuccess = r5
                r0.val$realmNotifier = r6
                r0.val$onError = r7
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                boolean r0 = r0.isInterrupted()
                if (r0 == 0) goto Lb
                return
            Lb:
                io.realm.RealmConfiguration r0 = r5.val$realmConfiguration
                io.realm.Realm r0 = io.realm.Realm.getInstance(r0)
                r0.beginTransaction()
                r1 = 0
                io.realm.Realm$Transaction r2 = r5.val$transaction     // Catch: java.lang.Throwable -> L51
                r2.execute(r0)     // Catch: java.lang.Throwable -> L51
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L51
                boolean r2 = r2.isInterrupted()     // Catch: java.lang.Throwable -> L51
                if (r2 == 0) goto L36
                boolean r1 = r0.isInTransaction()     // Catch: java.lang.Throwable -> L31
                if (r1 == 0) goto L2d
                r0.cancelTransaction()     // Catch: java.lang.Throwable -> L31
            L2d:
                r0.close()
                return
            L31:
                r1 = move-exception
                r0.close()
                throw r1
            L36:
                r0.commitTransaction()     // Catch: java.lang.Throwable -> L51
                io.realm.internal.OsSharedRealm r2 = r0.sharedRealm     // Catch: java.lang.Throwable -> L51
                io.realm.internal.OsSharedRealm$VersionID r2 = r2.getVersionID()     // Catch: java.lang.Throwable -> L51
                boolean r3 = r0.isInTransaction()     // Catch: java.lang.Throwable -> L4c
                if (r3 == 0) goto L48
                r0.cancelTransaction()     // Catch: java.lang.Throwable -> L4c
            L48:
                r0.close()
                goto L61
            L4c:
                r1 = move-exception
                r0.close()
                throw r1
            L51:
                r2 = move-exception
                boolean r3 = r0.isInTransaction()     // Catch: java.lang.Throwable -> L8e
                if (r3 == 0) goto L5b
                r0.cancelTransaction()     // Catch: java.lang.Throwable -> L8e
            L5b:
                r0.close()
                r4 = r2
                r2 = r1
                r1 = r4
            L61:
                boolean r0 = r5.val$canDeliverNotification
                if (r0 == 0) goto L83
                if (r2 == 0) goto L76
                io.realm.Realm$Transaction$OnSuccess r0 = r5.val$onSuccess
                if (r0 == 0) goto L76
                io.realm.internal.RealmNotifier r0 = r5.val$realmNotifier
                io.realm.Realm$1$1 r1 = new io.realm.Realm$1$1
                r1.<init>(r5, r2)
                r0.post(r1)
                goto L85
            L76:
                if (r1 == 0) goto L85
                io.realm.internal.RealmNotifier r0 = r5.val$realmNotifier
                io.realm.Realm$1$2 r2 = new io.realm.Realm$1$2
                r2.<init>(r5, r1)
                r0.post(r2)
                goto L85
            L83:
                if (r1 != 0) goto L86
            L85:
                return
            L86:
                io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
                java.lang.String r2 = "Async transaction failed"
                r0.<init>(r2, r1)
                throw r0
            L8e:
                r1 = move-exception
                r0.close()
                throw r1
        }
    }


    public static abstract class Callback extends io.realm.BaseRealm.InstanceCallback<io.realm.Realm> {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.realm.BaseRealm.InstanceCallback
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                super.onError(r1)
                return
        }

        @Override // io.realm.BaseRealm.InstanceCallback
        public /* bridge */ /* synthetic */ void onSuccess(io.realm.BaseRealm r1) {
                r0 = this;
                io.realm.Realm r1 = (io.realm.Realm) r1
                r0.onSuccess(r1)
                return
        }

        public abstract void onSuccess(io.realm.Realm r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Transaction {

        public static class Callback {
            public Callback() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public void onError(java.lang.Exception r1) {
                    r0 = this;
                    return
            }

            public void onSuccess() {
                    r0 = this;
                    return
            }
        }

        /* JADX INFO: loaded from: classes.dex */
        public interface OnError {
            void onError(java.lang.Throwable r1);
        }

        /* JADX INFO: loaded from: classes.dex */
        public interface OnSuccess {
            void onSuccess();
        }

        void execute(io.realm.Realm r1);
    }

    /* JADX INFO: renamed from: $r8$lambda$97tHgREF1GSOYJgJYrGM_bP-Eng, reason: not valid java name */
    public static /* synthetic */ io.realm.Realm m308$r8$lambda$97tHgREF1GSOYJgJYrGM_bPEng(io.realm.RealmConfiguration r0, io.realm.internal.OsSharedRealm.VersionID r1) {
            io.realm.Realm r0 = lambda$initializeRealm$0(r0, r1)
            return r0
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.realm.Realm.defaultConfigurationLock = r0
            return
    }

    private Realm(io.realm.RealmCache r5, io.realm.internal.OsSharedRealm.VersionID r6) {
            r4 = this;
            io.realm.RealmConfiguration r0 = r5.getConfiguration()
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            io.realm.internal.OsSchemaInfo r0 = createExpectedSchemaInfo(r0)
            r4.<init>(r5, r0, r6)
            io.realm.ImmutableRealmSchema r5 = new io.realm.ImmutableRealmSchema
            io.realm.internal.ColumnIndices r6 = new io.realm.internal.ColumnIndices
            io.realm.RealmConfiguration r0 = r4.configuration
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            io.realm.internal.OsSharedRealm r1 = r4.sharedRealm
            io.realm.internal.OsSchemaInfo r1 = r1.getSchemaInfo()
            r6.<init>(r0, r1)
            r5.<init>(r4, r6)
            r4.schema = r5
            io.realm.RealmConfiguration r5 = r4.configuration
            boolean r5 = r5.isReadOnly()
            if (r5 == 0) goto L7d
            io.realm.RealmConfiguration r5 = r4.configuration
            io.realm.internal.RealmProxyMediator r5 = r5.getSchemaMediator()
            java.util.Set r6 = r5.getModelClasses()
            java.util.Iterator r6 = r6.iterator()
        L3d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r6.next()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r5.getSimpleClassName(r0)
            java.lang.String r0 = io.realm.internal.Table.getTableNameForClass(r0)
            io.realm.internal.OsSharedRealm r1 = r4.sharedRealm
            boolean r1 = r1.hasTable(r0)
            if (r1 == 0) goto L5a
            goto L3d
        L5a:
            io.realm.internal.OsSharedRealm r5 = r4.sharedRealm
            r5.close()
            io.realm.exceptions.RealmMigrationNeededException r5 = new io.realm.exceptions.RealmMigrationNeededException
            io.realm.RealmConfiguration r6 = r4.configuration
            java.lang.String r6 = r6.getPath()
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = io.realm.internal.Table.getClassNameForTable(r0)
            r2[r3] = r0
            java.lang.String r0 = "Cannot open the read only Realm. '%s' is missing."
            java.lang.String r0 = java.lang.String.format(r1, r0, r2)
            r5.<init>(r6, r0)
            throw r5
        L7d:
            return
    }

    private Realm(io.realm.internal.OsSharedRealm r4) {
            r3 = this;
            r3.<init>(r4)
            io.realm.ImmutableRealmSchema r0 = new io.realm.ImmutableRealmSchema
            io.realm.internal.ColumnIndices r1 = new io.realm.internal.ColumnIndices
            io.realm.RealmConfiguration r2 = r3.configuration
            io.realm.internal.RealmProxyMediator r2 = r2.getSchemaMediator()
            io.realm.internal.OsSchemaInfo r4 = r4.getSchemaInfo()
            r1.<init>(r2, r4)
            r0.<init>(r3, r1)
            r3.schema = r0
            return
    }

    private static void checkFilesDirAvailable(android.content.Context r8) {
            java.io.File r0 = r8.getFilesDir()
            if (r0 == 0) goto L12
            boolean r1 = r0.exists()
            if (r1 == 0) goto Ld
            return
        Ld:
            r0.mkdirs()     // Catch: java.lang.SecurityException -> L11
            goto L12
        L11:
        L12:
            if (r0 == 0) goto L1a
            boolean r0 = r0.exists()
            if (r0 != 0) goto L46
        L1a:
            r0 = 5
            long[] r0 = new long[r0]
            r0 = {x0074: FILL_ARRAY_DATA , data: [1, 2, 5, 10, 16} // fill-array
            r1 = 200(0xc8, double:9.9E-322)
            r3 = 0
            r5 = -1
        L25:
            java.io.File r6 = r8.getFilesDir()
            if (r6 == 0) goto L35
            java.io.File r6 = r8.getFilesDir()
            boolean r6 = r6.exists()
            if (r6 != 0) goto L46
        L35:
            int r5 = r5 + 1
            r6 = 4
            int r6 = java.lang.Math.min(r5, r6)
            r6 = r0[r6]
            android.os.SystemClock.sleep(r6)
            long r3 = r3 + r6
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 <= 0) goto L25
        L46:
            java.io.File r0 = r8.getFilesDir()
            if (r0 == 0) goto L57
            java.io.File r0 = r8.getFilesDir()
            boolean r0 = r0.exists()
            if (r0 == 0) goto L57
            return
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Context.getFilesDir() returns "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.io.File r8 = r8.getFilesDir()
            r1.append(r8)
            java.lang.String r8 = " which is not an existing directory. See https://issuetracker.google.com/issues/36918154"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    private void checkHasPrimaryKey(java.lang.Class<? extends io.realm.RealmModel> r3) {
            r2 = this;
            io.realm.RealmConfiguration r0 = r2.configuration
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            boolean r0 = r0.hasPrimaryKey(r3)
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "A RealmObject with no @PrimaryKey cannot be updated: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private void checkMaxDepth(int r3) {
            r2 = this;
            if (r3 < 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxDepth must be > 0. It was: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    private <E extends io.realm.RealmModel> void checkNotNullObject(E r2) {
            r1 = this;
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Null objects cannot be copied into Realm."
            r2.<init>(r0)
            throw r2
    }

    private <E extends io.realm.RealmModel> void checkValidObjectForDetach(E r2) {
            r1 = this;
            if (r2 == 0) goto L23
            boolean r0 = io.realm.RealmObject.isManaged(r2)
            if (r0 == 0) goto L1b
            boolean r0 = io.realm.RealmObject.isValid(r2)
            if (r0 == 0) goto L1b
            boolean r2 = r2 instanceof io.realm.DynamicRealmObject
            if (r2 != 0) goto L13
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "DynamicRealmObject cannot be copied from Realm."
            r2.<init>(r0)
            throw r2
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only valid managed objects can be copied from Realm."
            r2.<init>(r0)
            throw r2
        L23:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Null objects cannot be copied from Realm."
            r2.<init>(r0)
            throw r2
    }

    public static boolean compactRealm(io.realm.RealmConfiguration r1) {
            io.realm.internal.OsSharedRealm$VersionID r0 = io.realm.internal.OsSharedRealm.VersionID.LIVE
            io.realm.internal.OsSharedRealm r1 = io.realm.internal.OsSharedRealm.getInstance(r1, r0)
            boolean r0 = r1.compact()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.close()
            boolean r1 = r0.booleanValue()
            return r1
    }

    private <E extends io.realm.RealmModel> E copyOrUpdate(E r8, boolean r9, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r10, java.util.Set<io.realm.ImportFlag> r11) {
            r7 = this;
            r7.checkIfValid()
            boolean r0 = r7.isInTransaction()
            if (r0 == 0) goto L4d
            io.realm.RealmConfiguration r0 = r7.configuration
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            java.lang.Class r1 = r8.getClass()
            java.lang.Class r1 = io.realm.internal.Util.getOriginalModelClass(r1)
            boolean r0 = r0.isEmbedded(r1)
            if (r0 != 0) goto L45
            io.realm.RealmConfiguration r0 = r7.configuration     // Catch: java.lang.IllegalStateException -> L2d
            io.realm.internal.RealmProxyMediator r1 = r0.getSchemaMediator()     // Catch: java.lang.IllegalStateException -> L2d
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            io.realm.RealmModel r8 = r1.copyOrUpdate(r2, r3, r4, r5, r6)     // Catch: java.lang.IllegalStateException -> L2d
            return r8
        L2d:
            r8 = move-exception
            java.lang.String r9 = r8.getMessage()
            java.lang.String r10 = "Attempting to create an object of type"
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L44
            io.realm.exceptions.RealmPrimaryKeyConstraintException r9 = new io.realm.exceptions.RealmPrimaryKeyConstraintException
            java.lang.String r8 = r8.getMessage()
            r9.<init>(r8)
            throw r9
        L44:
            throw r8
        L45:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "`copyOrUpdate` can only be called inside a write transaction."
            r8.<init>(r9)
            throw r8
    }

    private <E extends io.realm.RealmModel> E createDetachedCopy(E r2, int r3, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy.CacheData<io.realm.RealmModel>> r4) {
            r1 = this;
            r1.checkIfValid()
            io.realm.RealmConfiguration r0 = r1.configuration
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            io.realm.RealmModel r2 = r0.createDetachedCopy(r2, r3, r4)
            return r2
    }

    private static io.realm.internal.OsSchemaInfo createExpectedSchemaInfo(io.realm.internal.RealmProxyMediator r1) {
            io.realm.internal.OsSchemaInfo r0 = new io.realm.internal.OsSchemaInfo
            java.util.Map r1 = r1.getExpectedObjectSchemaInfoMap()
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            return r0
    }

    public static io.realm.Realm createInstance(io.realm.RealmCache r1, io.realm.internal.OsSharedRealm.VersionID r2) {
            io.realm.Realm r0 = new io.realm.Realm
            r0.<init>(r1, r2)
            return r0
    }

    public static io.realm.Realm createInstance(io.realm.internal.OsSharedRealm r1) {
            io.realm.Realm r0 = new io.realm.Realm
            r0.<init>(r1)
            return r0
    }

    public static boolean deleteRealm(io.realm.RealmConfiguration r2) {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            io.realm.BaseRealm$4 r1 = new io.realm.BaseRealm$4
            r1.<init>(r2, r0)
            boolean r1 = io.realm.internal.OsObjectStore.callWithLock(r2, r1)
            if (r1 == 0) goto L16
            boolean r2 = r0.get()
            return r2
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "It's not allowed to delete the file associated with an open Realm. Remember to close() all the instances of the Realm before deleting its file: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    @javax.annotation.Nullable
    public static android.content.Context getApplicationContext() {
            android.content.Context r0 = io.realm.BaseRealm.applicationContext
            return r0
    }

    @javax.annotation.Nullable
    public static io.realm.RealmConfiguration getDefaultConfiguration() {
            java.lang.Object r0 = io.realm.Realm.defaultConfigurationLock
            monitor-enter(r0)
            io.realm.RealmConfiguration r1 = io.realm.Realm.defaultConfiguration     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static io.realm.Realm getDefaultInstance() {
            io.realm.RealmConfiguration r0 = getDefaultConfiguration()
            if (r0 != 0) goto L1a
            android.content.Context r0 = io.realm.BaseRealm.applicationContext
            if (r0 != 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Call `Realm.init(Context)` before calling this method."
            r0.<init>(r1)
            throw r0
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Set default configuration by using `Realm.setDefaultConfiguration(RealmConfiguration)`."
            r0.<init>(r1)
            throw r0
        L1a:
            java.lang.Class<io.realm.Realm> r1 = io.realm.Realm.class
            io.realm.BaseRealm r0 = io.realm.RealmCache.createRealmOrGetFromCache(r0, r1)
            io.realm.Realm r0 = (io.realm.Realm) r0
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.Object getDefaultModule() {
            java.lang.String r0 = "Could not create an instance of io.realm.DefaultRealmModule"
            java.lang.Class<io.realm.DefaultRealmModule> r1 = io.realm.DefaultRealmModule.class
            java.lang.reflect.Constructor[] r1 = r1.getDeclaredConstructors()     // Catch: java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L1d java.lang.reflect.InvocationTargetException -> L24 java.lang.ClassNotFoundException -> L2b
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L1d java.lang.reflect.InvocationTargetException -> L24 java.lang.ClassNotFoundException -> L2b
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L1d java.lang.reflect.InvocationTargetException -> L24 java.lang.ClassNotFoundException -> L2b
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L1d java.lang.reflect.InvocationTargetException -> L24 java.lang.ClassNotFoundException -> L2b
            java.lang.Object r0 = r1.newInstance(r2)     // Catch: java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L1d java.lang.reflect.InvocationTargetException -> L24 java.lang.ClassNotFoundException -> L2b
            return r0
        L16:
            r1 = move-exception
            io.realm.exceptions.RealmException r2 = new io.realm.exceptions.RealmException
            r2.<init>(r0, r1)
            throw r2
        L1d:
            r1 = move-exception
            io.realm.exceptions.RealmException r2 = new io.realm.exceptions.RealmException
            r2.<init>(r0, r1)
            throw r2
        L24:
            r1 = move-exception
            io.realm.exceptions.RealmException r2 = new io.realm.exceptions.RealmException
            r2.<init>(r0, r1)
            throw r2
        L2b:
            r0 = 0
            return r0
    }

    private java.util.Scanner getFullStringScanner(java.io.InputStream r3) {
            r2 = this;
            java.util.Scanner r0 = new java.util.Scanner
            java.lang.String r1 = "UTF-8"
            r0.<init>(r3, r1)
            java.lang.String r3 = "\\A"
            java.util.Scanner r3 = r0.useDelimiter(r3)
            return r3
    }

    public static int getGlobalInstanceCount(io.realm.RealmConfiguration r2) {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            io.realm.Realm$2 r1 = new io.realm.Realm$2
            r1.<init>(r0)
            io.realm.RealmCache.invokeWithGlobalRefCount(r2, r1)
            int r2 = r0.get()
            return r2
    }

    public static io.realm.Realm getInstance(io.realm.RealmConfiguration r1) {
            if (r1 == 0) goto Lb
            java.lang.Class<io.realm.Realm> r0 = io.realm.Realm.class
            io.realm.BaseRealm r1 = io.realm.RealmCache.createRealmOrGetFromCache(r1, r0)
            io.realm.Realm r1 = (io.realm.Realm) r1
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A non-null RealmConfiguration must be provided"
            r1.<init>(r0)
            throw r1
    }

    public static io.realm.RealmAsyncTask getInstanceAsync(io.realm.RealmConfiguration r1, io.realm.Realm.Callback r2) {
            if (r1 == 0) goto L9
            java.lang.Class<io.realm.Realm> r0 = io.realm.Realm.class
            io.realm.RealmAsyncTask r1 = io.realm.RealmCache.createRealmOrGetFromCacheAsync(r1, r2, r0)
            return r1
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "A non-null RealmConfiguration must be provided"
            r1.<init>(r2)
            throw r1
    }

    public static int getLocalInstanceCount(io.realm.RealmConfiguration r0) {
            int r0 = io.realm.RealmCache.getLocalThreadCount(r0)
            return r0
    }

    public static synchronized void init(android.content.Context r2) {
            java.lang.Class<io.realm.Realm> r0 = io.realm.Realm.class
            monitor-enter(r0)
            java.lang.String r1 = ""
            initializeRealm(r2, r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    private static void initializeRealm(android.content.Context r3, java.lang.String r4) {
            android.content.Context r0 = io.realm.BaseRealm.applicationContext
            if (r0 != 0) goto L49
            if (r3 == 0) goto L41
            checkFilesDirAvailable(r3)
            io.realm.internal.RealmCore.loadLibrary(r3)
            io.realm.RealmConfiguration$Builder r0 = new io.realm.RealmConfiguration$Builder
            r0.<init>(r3)
            io.realm.RealmConfiguration r0 = r0.build()
            setDefaultConfiguration(r0)
            io.realm.internal.ObjectServerFacade r0 = io.realm.internal.ObjectServerFacade.getSyncFacadeIfPossible()
            io.realm.Realm$$ExternalSyntheticLambda0 r1 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE
            io.realm.Realm$$ExternalSyntheticLambda0 r2 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$28
            r0.initialize(r3, r4, r1, r2)
            android.content.Context r4 = r3.getApplicationContext()
            if (r4 == 0) goto L30
            android.content.Context r4 = r3.getApplicationContext()
            io.realm.BaseRealm.applicationContext = r4
            goto L32
        L30:
            io.realm.BaseRealm.applicationContext = r3
        L32:
            java.io.File r4 = new java.io.File
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r0 = ".realm.temp"
            r4.<init>(r3, r0)
            io.realm.internal.OsSharedRealm.initialize(r4)
            goto L49
        L41:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Non-null context required."
            r3.<init>(r4)
            throw r3
        L49:
            return
    }

    private static /* synthetic */ io.realm.Realm lambda$initializeRealm$0(io.realm.RealmConfiguration r1, io.realm.internal.OsSharedRealm.VersionID r2) {
            java.lang.Class<io.realm.Realm> r0 = io.realm.Realm.class
            io.realm.BaseRealm r1 = io.realm.RealmCache.createRealmOrGetFromCache(r1, r0, r2)
            io.realm.Realm r1 = (io.realm.Realm) r1
            return r1
    }

    public static void migrateRealm(io.realm.RealmConfiguration r1) throws java.io.FileNotFoundException {
            r0 = 0
            migrateRealm(r1, r0)
            return
    }

    public static void migrateRealm(io.realm.RealmConfiguration r2, @javax.annotation.Nullable io.realm.RealmMigration r3) throws java.io.FileNotFoundException {
            if (r2 == 0) goto L43
            if (r3 != 0) goto L17
            io.realm.RealmMigration r0 = r2.getMigration()
            if (r0 == 0) goto Lb
            goto L17
        Lb:
            io.realm.exceptions.RealmMigrationNeededException r3 = new io.realm.exceptions.RealmMigrationNeededException
            java.lang.String r2 = r2.getPath()
            java.lang.String r0 = "RealmMigration must be provided."
            r3.<init>(r2, r0)
            throw r3
        L17:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            io.realm.BaseRealm$5 r1 = new io.realm.BaseRealm$5
            r1.<init>(r2, r0, r3)
            io.realm.RealmCache.invokeWithGlobalRefCount(r2, r1)
            boolean r3 = r0.get()
            if (r3 != 0) goto L2c
            return
        L2c:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r0 = "Cannot migrate a Realm file which doesn't exist: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r2 = r2.getPath()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L43:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "RealmConfiguration must be provided"
            r2.<init>(r3)
            throw r2
    }

    public static void removeDefaultConfiguration() {
            java.lang.Object r0 = io.realm.Realm.defaultConfigurationLock
            monitor-enter(r0)
            r1 = 0
            io.realm.Realm.defaultConfiguration = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    public static void setDefaultConfiguration(io.realm.RealmConfiguration r1) {
            if (r1 == 0) goto Lc
            java.lang.Object r0 = io.realm.Realm.defaultConfigurationLock
            monitor-enter(r0)
            io.realm.Realm.defaultConfiguration = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A non-null RealmConfiguration must be provided"
            r1.<init>(r0)
            throw r1
    }

    public void addChangeListener(io.realm.RealmChangeListener<io.realm.Realm> r1) {
            r0 = this;
            r0.addListener(r1)
            return
    }

    @Override // io.realm.BaseRealm
    public io.reactivex.Flowable<io.realm.Realm> asFlowable() {
            r1 = this;
            io.realm.RealmConfiguration r0 = r1.configuration
            io.realm.rx.RxObservableFactory r0 = r0.getRxFactory()
            io.reactivex.Flowable r0 = r0.from(r1)
            return r0
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void beginTransaction() {
            r0 = this;
            super.beginTransaction()
            return
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void cancelTransaction() {
            r0 = this;
            super.cancelTransaction()
            return
    }

    @Override // io.realm.BaseRealm, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
            r0 = this;
            super.close()
            return
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void commitTransaction() {
            r0 = this;
            super.commitTransaction()
            return
    }

    public <E extends io.realm.RealmModel> E copyFromRealm(E r2) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            io.realm.RealmModel r2 = r1.copyFromRealm(r2, r0)
            return r2
    }

    public <E extends io.realm.RealmModel> E copyFromRealm(E r2, int r3) {
            r1 = this;
            r1.checkMaxDepth(r3)
            r1.checkValidObjectForDetach(r2)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            io.realm.RealmModel r2 = r1.createDetachedCopy(r2, r3, r0)
            return r2
    }

    public <E extends io.realm.RealmModel> java.util.List<E> copyFromRealm(java.lang.Iterable<E> r2) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r2 = r1.copyFromRealm(r2, r0)
            return r2
    }

    public <E extends io.realm.RealmModel> java.util.List<E> copyFromRealm(java.lang.Iterable<E> r4, int r5) {
            r3 = this;
            r3.checkMaxDepth(r5)
            if (r4 != 0) goto Lc
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 0
            r4.<init>(r5)
            return r4
        Lc:
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L1d
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r0.<init>(r1)
            goto L22
        L1d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L22:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L2b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r4.next()
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            r3.checkValidObjectForDetach(r2)
            io.realm.RealmModel r2 = r3.createDetachedCopy(r2, r5, r1)
            r0.add(r2)
            goto L2b
        L42:
            return r0
    }

    public <E extends io.realm.RealmModel> E copyToRealm(E r3, io.realm.ImportFlag... r4) {
            r2 = this;
            r2.checkNotNullObject(r3)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r4 = io.realm.internal.Util.toSet(r4)
            r1 = 0
            io.realm.RealmModel r3 = r2.copyOrUpdate(r3, r1, r0, r4)
            return r3
    }

    public <E extends io.realm.RealmModel> java.util.List<E> copyToRealm(java.lang.Iterable<E> r6, io.realm.ImportFlag... r7) {
            r5 = this;
            if (r6 != 0) goto L8
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            return r6
        L8:
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L19
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r0.<init>(r1)
            goto L1e
        L19:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L1e:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L27:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r6.next()
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            r5.checkNotNullObject(r2)
            r3 = 0
            java.util.Set r4 = io.realm.internal.Util.toSet(r7)
            io.realm.RealmModel r2 = r5.copyOrUpdate(r2, r3, r1, r4)
            r0.add(r2)
            goto L27
        L43:
            return r0
    }

    public <E extends io.realm.RealmModel> E copyToRealmOrUpdate(E r3, io.realm.ImportFlag... r4) {
            r2 = this;
            r2.checkNotNullObject(r3)
            java.lang.Class r0 = r3.getClass()
            r2.checkHasPrimaryKey(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r4 = io.realm.internal.Util.toSet(r4)
            r1 = 1
            io.realm.RealmModel r3 = r2.copyOrUpdate(r3, r1, r0, r4)
            return r3
    }

    public <E extends io.realm.RealmModel> java.util.List<E> copyToRealmOrUpdate(java.lang.Iterable<E> r5, io.realm.ImportFlag... r6) {
            r4 = this;
            if (r5 != 0) goto L9
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 0
            r5.<init>(r6)
            return r5
        L9:
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r5
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r0.<init>(r1)
            goto L1f
        L1a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L1f:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r6 = io.realm.internal.Util.toSet(r6)
            java.util.Iterator r5 = r5.iterator()
        L2c:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r5.next()
            io.realm.RealmModel r2 = (io.realm.RealmModel) r2
            r4.checkNotNullObject(r2)
            r3 = 1
            io.realm.RealmModel r2 = r4.copyOrUpdate(r2, r3, r1, r6)
            r0.add(r2)
            goto L2c
        L44:
            return r0
    }

    public <E extends io.realm.RealmModel> void createAllFromJson(java.lang.Class<E> r4, java.io.InputStream r5) throws java.io.IOException {
            r3 = this;
            if (r4 == 0) goto L33
            if (r5 != 0) goto L5
            goto L33
        L5:
            r3.checkIfValid()
            android.util.JsonReader r0 = new android.util.JsonReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "UTF-8"
            r1.<init>(r5, r2)
            r0.<init>(r1)
            r0.beginArray()     // Catch: java.lang.Throwable -> L2e
        L17:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L27
            io.realm.RealmConfiguration r5 = r3.configuration     // Catch: java.lang.Throwable -> L2e
            io.realm.internal.RealmProxyMediator r5 = r5.getSchemaMediator()     // Catch: java.lang.Throwable -> L2e
            r5.createUsingJsonStream(r4, r3, r0)     // Catch: java.lang.Throwable -> L2e
            goto L17
        L27:
            r0.endArray()     // Catch: java.lang.Throwable -> L2e
            r0.close()
            return
        L2e:
            r4 = move-exception
            r0.close()
            throw r4
        L33:
            return
    }

    public <E extends io.realm.RealmModel> void createAllFromJson(java.lang.Class<E> r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L1d
            if (r3 == 0) goto L1d
            int r0 = r3.length()
            if (r0 != 0) goto Lb
            goto L1d
        Lb:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L14
            r0.<init>(r3)     // Catch: org.json.JSONException -> L14
            r1.createAllFromJson(r2, r0)
            return
        L14:
            r2 = move-exception
            io.realm.exceptions.RealmException r3 = new io.realm.exceptions.RealmException
            java.lang.String r0 = "Could not create JSON array from string"
            r3.<init>(r0, r2)
            throw r3
        L1d:
            return
    }

    public <E extends io.realm.RealmModel> void createAllFromJson(java.lang.Class<E> r5, org.json.JSONArray r6) {
            r4 = this;
            if (r5 == 0) goto L29
            if (r6 != 0) goto L5
            goto L29
        L5:
            r4.checkIfValid()
            r0 = 0
            r1 = 0
        La:
            int r2 = r6.length()
            if (r1 >= r2) goto L29
            io.realm.RealmConfiguration r2 = r4.configuration     // Catch: org.json.JSONException -> L20
            io.realm.internal.RealmProxyMediator r2 = r2.getSchemaMediator()     // Catch: org.json.JSONException -> L20
            org.json.JSONObject r3 = r6.getJSONObject(r1)     // Catch: org.json.JSONException -> L20
            r2.createOrUpdateUsingJsonObject(r5, r4, r3, r0)     // Catch: org.json.JSONException -> L20
            int r1 = r1 + 1
            goto La
        L20:
            r5 = move-exception
            io.realm.exceptions.RealmException r6 = new io.realm.exceptions.RealmException
            java.lang.String r0 = "Could not map JSON"
            r6.<init>(r0, r5)
            throw r6
        L29:
            return
    }

    public <E extends io.realm.RealmModel> E createEmbeddedObject(java.lang.Class<E> r9, io.realm.RealmModel r10, java.lang.String r11) {
            r8 = this;
            r8.checkIfValid()
            java.lang.String r1 = "parentObject"
            io.realm.internal.Util.checkNull(r10, r1)
            java.lang.String r1 = "parentProperty"
            io.realm.internal.Util.checkEmpty(r11, r1)
            boolean r1 = io.realm.RealmObject.isManaged(r10)
            if (r1 == 0) goto L4f
            boolean r1 = io.realm.RealmObject.isValid(r10)
            if (r1 == 0) goto L4f
            io.realm.RealmSchema r1 = r8.schema
            io.realm.RealmObjectSchema r1 = r1.getSchemaForClass(r9)
            java.lang.String r1 = r1.getClassName()
            java.lang.Class r2 = r10.getClass()
            io.realm.RealmSchema r4 = r8.schema
            io.realm.RealmObjectSchema r5 = r4.getSchemaForClass(r2)
            r2 = r10
            io.realm.internal.RealmObjectProxy r2 = (io.realm.internal.RealmObjectProxy) r2
            io.realm.RealmSchema r4 = r8.schema
            r0 = r8
            r3 = r11
            io.realm.internal.Row r3 = r0.getEmbeddedObjectRow(r1, r2, r3, r4, r5)
            io.realm.RealmConfiguration r0 = r8.configuration
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            io.realm.RealmSchema r1 = r8.schema
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo(r9)
            r5 = 1
            java.util.List r7 = java.util.Collections.EMPTY_LIST
            r1 = r9
            r2 = r8
            r6 = r7
            io.realm.RealmModel r0 = r0.newInstance(r1, r2, r3, r4, r5, r6)
            return r0
        L4f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Only valid, managed objects can be a parent to an embedded object."
            r0.<init>(r1)
            throw r0
    }

    public <E extends io.realm.RealmModel> E createObject(java.lang.Class<E> r4) {
            r3 = this;
            r3.checkIfValid()
            io.realm.RealmConfiguration r0 = r3.configuration
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            boolean r1 = r0.isEmbedded(r4)
            if (r1 != 0) goto L18
            java.util.List r0 = java.util.Collections.emptyList()
            io.realm.RealmModel r4 = r3.createObjectInternal(r4, r0)
            return r4
        L18:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "This class is marked embedded. Use `createEmbeddedObject(class, parent, property)` instead:  "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r4 = r0.getSimpleClassName(r4)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    public <E extends io.realm.RealmModel> E createObject(java.lang.Class<E> r10, @javax.annotation.Nullable java.lang.Object r11) {
            r9 = this;
            r9.checkIfValid()
            io.realm.RealmConfiguration r0 = r9.configuration
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            boolean r1 = r0.isEmbedded(r10)
            if (r1 != 0) goto L31
            r7 = 1
            java.util.List r8 = java.util.Collections.emptyList()
            io.realm.RealmSchema r0 = r9.schema
            io.realm.internal.Table r0 = r0.getTable(r10)
            io.realm.RealmConfiguration r1 = r9.configuration
            io.realm.internal.RealmProxyMediator r2 = r1.getSchemaMediator()
            io.realm.internal.UncheckedRow r5 = io.realm.internal.OsObject.createWithPrimaryKey(r0, r11)
            io.realm.RealmSchema r11 = r9.schema
            io.realm.internal.ColumnInfo r6 = r11.getColumnInfo(r10)
            r3 = r10
            r4 = r9
            io.realm.RealmModel r10 = r2.newInstance(r3, r4, r5, r6, r7, r8)
            return r10
        L31:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "This class is marked embedded. Use `createEmbeddedObject(class, parent, property)` instead:  "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r10 = r0.getSimpleClassName(r10)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r11.<init>(r10)
            throw r11
    }

    @javax.annotation.Nullable
    public <E extends io.realm.RealmModel> E createObjectFromJson(java.lang.Class<E> r4, java.io.InputStream r5) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L67
            if (r5 != 0) goto L6
            goto L67
        L6:
            r3.checkIfValid()
            io.realm.internal.OsSharedRealm r1 = r3.sharedRealm
            io.realm.RealmConfiguration r2 = r3.configuration
            io.realm.internal.RealmProxyMediator r2 = r2.getSchemaMediator()
            java.lang.String r2 = r2.getSimpleClassName(r4)
            java.lang.String r1 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r1, r2)
            if (r1 == 0) goto L48
            java.util.Scanner r0 = r3.getFullStringScanner(r5)     // Catch: java.lang.Throwable -> L37 org.json.JSONException -> L39
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L37 org.json.JSONException -> L39
            java.lang.String r1 = r0.next()     // Catch: java.lang.Throwable -> L37 org.json.JSONException -> L39
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L37 org.json.JSONException -> L39
            io.realm.RealmConfiguration r1 = r3.configuration     // Catch: java.lang.Throwable -> L37 org.json.JSONException -> L39
            io.realm.internal.RealmProxyMediator r1 = r1.getSchemaMediator()     // Catch: java.lang.Throwable -> L37 org.json.JSONException -> L39
            r2 = 0
            io.realm.RealmModel r4 = r1.createOrUpdateUsingJsonObject(r4, r3, r5, r2)     // Catch: java.lang.Throwable -> L37 org.json.JSONException -> L39
            r0.close()
            goto L61
        L37:
            r4 = move-exception
            goto L42
        L39:
            r4 = move-exception
            io.realm.exceptions.RealmException r5 = new io.realm.exceptions.RealmException     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "Failed to read JSON"
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L37
            throw r5     // Catch: java.lang.Throwable -> L37
        L42:
            if (r0 == 0) goto L47
            r0.close()
        L47:
            throw r4
        L48:
            android.util.JsonReader r0 = new android.util.JsonReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "UTF-8"
            r1.<init>(r5, r2)
            r0.<init>(r1)
            io.realm.RealmConfiguration r5 = r3.configuration     // Catch: java.lang.Throwable -> L62
            io.realm.internal.RealmProxyMediator r5 = r5.getSchemaMediator()     // Catch: java.lang.Throwable -> L62
            io.realm.RealmModel r4 = r5.createUsingJsonStream(r4, r3, r0)     // Catch: java.lang.Throwable -> L62
            r0.close()
        L61:
            return r4
        L62:
            r4 = move-exception
            r0.close()
            throw r4
        L67:
            return r0
    }

    @javax.annotation.Nullable
    public <E extends io.realm.RealmModel> E createObjectFromJson(java.lang.Class<E> r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L1e
            if (r3 == 0) goto L1e
            int r0 = r3.length()
            if (r0 != 0) goto Lb
            goto L1e
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L15
            r0.<init>(r3)     // Catch: org.json.JSONException -> L15
            io.realm.RealmModel r2 = r1.createObjectFromJson(r2, r0)
            return r2
        L15:
            r2 = move-exception
            io.realm.exceptions.RealmException r3 = new io.realm.exceptions.RealmException
            java.lang.String r0 = "Could not create Json object from string"
            r3.<init>(r0, r2)
            throw r3
        L1e:
            r2 = 0
            return r2
    }

    @javax.annotation.Nullable
    public <E extends io.realm.RealmModel> E createObjectFromJson(java.lang.Class<E> r3, org.json.JSONObject r4) {
            r2 = this;
            if (r3 == 0) goto L1d
            if (r4 != 0) goto L5
            goto L1d
        L5:
            r2.checkIfValid()
            io.realm.RealmConfiguration r0 = r2.configuration     // Catch: org.json.JSONException -> L14
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()     // Catch: org.json.JSONException -> L14
            r1 = 0
            io.realm.RealmModel r3 = r0.createOrUpdateUsingJsonObject(r3, r2, r4, r1)     // Catch: org.json.JSONException -> L14
            return r3
        L14:
            r3 = move-exception
            io.realm.exceptions.RealmException r4 = new io.realm.exceptions.RealmException
            java.lang.String r0 = "Could not map JSON"
            r4.<init>(r0, r3)
            throw r4
        L1d:
            r3 = 0
            return r3
    }

    public final io.realm.RealmModel createObjectInternal(java.lang.Class r10, java.util.List r11) {
            r9 = this;
            io.realm.RealmSchema r0 = r9.schema
            io.realm.internal.Table r0 = r0.getTable(r10)
            io.realm.internal.OsSharedRealm r1 = r9.sharedRealm
            io.realm.RealmConfiguration r2 = r9.configuration
            io.realm.internal.RealmProxyMediator r2 = r2.getSchemaMediator()
            java.lang.String r2 = r2.getSimpleClassName(r10)
            java.lang.String r1 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r1, r2)
            if (r1 != 0) goto L31
            io.realm.RealmConfiguration r1 = r9.configuration
            io.realm.internal.RealmProxyMediator r2 = r1.getSchemaMediator()
            io.realm.internal.UncheckedRow r5 = io.realm.internal.OsObject.create(r0)
            io.realm.RealmSchema r0 = r9.schema
            io.realm.internal.ColumnInfo r6 = r0.getColumnInfo(r10)
            r7 = 1
            r3 = r10
            r4 = r9
            r8 = r11
            io.realm.RealmModel r10 = r2.newInstance(r3, r4, r5, r6, r7, r8)
            return r10
        L31:
            io.realm.exceptions.RealmException r10 = new io.realm.exceptions.RealmException
            java.util.Locale r11 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r0 = r0.getClassName()
            r1[r2] = r0
            java.lang.String r0 = "'%s' has a primary key, use 'createObject(Class<E>, Object)' instead."
            java.lang.String r11 = java.lang.String.format(r11, r0, r1)
            r10.<init>(r11)
            throw r10
    }

    public <E extends io.realm.RealmModel> void createOrUpdateAllFromJson(java.lang.Class<E> r6, java.io.InputStream r7) {
            r5 = this;
            if (r6 == 0) goto L46
            if (r7 != 0) goto L5
            goto L46
        L5:
            r5.checkIfValid()
            r5.checkHasPrimaryKey(r6)
            r0 = 0
            java.util.Scanner r0 = r5.getFullStringScanner(r7)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            java.lang.String r1 = r0.next()     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            r1 = 0
        L1a:
            int r2 = r7.length()     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            if (r1 >= r2) goto L31
            io.realm.RealmConfiguration r2 = r5.configuration     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            io.realm.internal.RealmProxyMediator r2 = r2.getSchemaMediator()     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            org.json.JSONObject r3 = r7.getJSONObject(r1)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            r4 = 1
            r2.createOrUpdateUsingJsonObject(r6, r5, r3, r4)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            int r1 = r1 + 1
            goto L1a
        L31:
            r0.close()
            return
        L35:
            r6 = move-exception
            goto L40
        L37:
            r6 = move-exception
            io.realm.exceptions.RealmException r7 = new io.realm.exceptions.RealmException     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "Failed to read JSON"
            r7.<init>(r1, r6)     // Catch: java.lang.Throwable -> L35
            throw r7     // Catch: java.lang.Throwable -> L35
        L40:
            if (r0 == 0) goto L45
            r0.close()
        L45:
            throw r6
        L46:
            return
    }

    public <E extends io.realm.RealmModel> void createOrUpdateAllFromJson(java.lang.Class<E> r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L23
            if (r3 == 0) goto L23
            int r0 = r3.length()
            if (r0 != 0) goto Lb
            goto L23
        Lb:
            r1.checkIfValid()
            r1.checkHasPrimaryKey(r2)
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L1a
            r0.<init>(r3)     // Catch: org.json.JSONException -> L1a
            r1.createOrUpdateAllFromJson(r2, r0)
            return
        L1a:
            r2 = move-exception
            io.realm.exceptions.RealmException r3 = new io.realm.exceptions.RealmException
            java.lang.String r0 = "Could not create JSON array from string"
            r3.<init>(r0, r2)
            throw r3
        L23:
            return
    }

    public <E extends io.realm.RealmModel> void createOrUpdateAllFromJson(java.lang.Class<E> r5, org.json.JSONArray r6) {
            r4 = this;
            if (r5 == 0) goto L2c
            if (r6 != 0) goto L5
            goto L2c
        L5:
            r4.checkIfValid()
            r4.checkHasPrimaryKey(r5)
            r0 = 0
        Lc:
            int r1 = r6.length()
            if (r0 >= r1) goto L2c
            io.realm.RealmConfiguration r1 = r4.configuration     // Catch: org.json.JSONException -> L23
            io.realm.internal.RealmProxyMediator r1 = r1.getSchemaMediator()     // Catch: org.json.JSONException -> L23
            org.json.JSONObject r2 = r6.getJSONObject(r0)     // Catch: org.json.JSONException -> L23
            r3 = 1
            r1.createOrUpdateUsingJsonObject(r5, r4, r2, r3)     // Catch: org.json.JSONException -> L23
            int r0 = r0 + 1
            goto Lc
        L23:
            r5 = move-exception
            io.realm.exceptions.RealmException r6 = new io.realm.exceptions.RealmException
            java.lang.String r0 = "Could not map JSON"
            r6.<init>(r0, r5)
            throw r6
        L2c:
            return
    }

    public <E extends io.realm.RealmModel> E createOrUpdateObjectFromJson(java.lang.Class<E> r3, java.io.InputStream r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L32
            if (r4 != 0) goto L6
            goto L32
        L6:
            r2.checkIfValid()
            r2.checkHasPrimaryKey(r3)
            java.util.Scanner r0 = r2.getFullStringScanner(r4)     // Catch: java.lang.Throwable -> L21 org.json.JSONException -> L23
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21 org.json.JSONException -> L23
            java.lang.String r1 = r0.next()     // Catch: java.lang.Throwable -> L21 org.json.JSONException -> L23
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L21 org.json.JSONException -> L23
            io.realm.RealmModel r3 = r2.createOrUpdateObjectFromJson(r3, r4)     // Catch: java.lang.Throwable -> L21 org.json.JSONException -> L23
            r0.close()
            return r3
        L21:
            r3 = move-exception
            goto L2c
        L23:
            r3 = move-exception
            io.realm.exceptions.RealmException r4 = new io.realm.exceptions.RealmException     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "Failed to read JSON"
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L21
            throw r4     // Catch: java.lang.Throwable -> L21
        L2c:
            if (r0 == 0) goto L31
            r0.close()
        L31:
            throw r3
        L32:
            return r0
    }

    public <E extends io.realm.RealmModel> E createOrUpdateObjectFromJson(java.lang.Class<E> r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L24
            if (r3 == 0) goto L24
            int r0 = r3.length()
            if (r0 != 0) goto Lb
            goto L24
        Lb:
            r1.checkIfValid()
            r1.checkHasPrimaryKey(r2)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1b
            r0.<init>(r3)     // Catch: org.json.JSONException -> L1b
            io.realm.RealmModel r2 = r1.createOrUpdateObjectFromJson(r2, r0)
            return r2
        L1b:
            r2 = move-exception
            io.realm.exceptions.RealmException r3 = new io.realm.exceptions.RealmException
            java.lang.String r0 = "Could not create Json object from string"
            r3.<init>(r0, r2)
            throw r3
        L24:
            r2 = 0
            return r2
    }

    public <E extends io.realm.RealmModel> E createOrUpdateObjectFromJson(java.lang.Class<E> r3, org.json.JSONObject r4) {
            r2 = this;
            if (r3 == 0) goto L20
            if (r4 != 0) goto L5
            goto L20
        L5:
            r2.checkIfValid()
            r2.checkHasPrimaryKey(r3)
            io.realm.RealmConfiguration r0 = r2.configuration     // Catch: org.json.JSONException -> L17
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()     // Catch: org.json.JSONException -> L17
            r1 = 1
            io.realm.RealmModel r3 = r0.createOrUpdateUsingJsonObject(r3, r2, r4, r1)     // Catch: org.json.JSONException -> L17
            return r3
        L17:
            r3 = move-exception
            io.realm.exceptions.RealmException r4 = new io.realm.exceptions.RealmException
            java.lang.String r0 = "Could not map JSON"
            r4.<init>(r0, r3)
            throw r4
        L20:
            r3 = 0
            return r3
    }

    public void delete(java.lang.Class<? extends io.realm.RealmModel> r2) {
            r1 = this;
            r1.checkIfValid()
            io.realm.RealmSchema r0 = r1.schema
            io.realm.internal.Table r2 = r0.getTable(r2)
            r2.clear()
            return
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void deleteAll() {
            r0 = this;
            super.deleteAll()
            return
    }

    public void executeTransaction(io.realm.Realm.Transaction r3) {
            r2 = this;
            if (r3 == 0) goto L26
            r2.checkIfValid()
            r2.checkAllowWritesOnUiThread()
            r2.beginTransaction()
            r3.execute(r2)     // Catch: java.lang.Throwable -> L12
            r2.commitTransaction()     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            boolean r0 = r2.isInTransaction()
            if (r0 == 0) goto L1d
            r2.cancelTransaction()
            goto L25
        L1d:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Could not cancel transaction, not currently in a transaction."
            io.realm.log.RealmLog.warn(r1, r0)
        L25:
            throw r3
        L26:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Transaction should not be null"
            r3.<init>(r0)
            throw r3
    }

    public io.realm.RealmAsyncTask executeTransactionAsync(io.realm.Realm.Transaction r2) {
            r1 = this;
            r0 = 0
            io.realm.RealmAsyncTask r2 = r1.executeTransactionAsync(r2, r0, r0)
            return r2
    }

    public io.realm.RealmAsyncTask executeTransactionAsync(io.realm.Realm.Transaction r2, io.realm.Realm.Transaction.OnError r3) {
            r1 = this;
            if (r3 == 0) goto L8
            r0 = 0
            io.realm.RealmAsyncTask r2 = r1.executeTransactionAsync(r2, r0, r3)
            return r2
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "onError callback can't be null"
            r2.<init>(r3)
            throw r2
    }

    public io.realm.RealmAsyncTask executeTransactionAsync(io.realm.Realm.Transaction r2, io.realm.Realm.Transaction.OnSuccess r3) {
            r1 = this;
            if (r3 == 0) goto L8
            r0 = 0
            io.realm.RealmAsyncTask r2 = r1.executeTransactionAsync(r2, r3, r0)
            return r2
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "onSuccess callback can't be null"
            r2.<init>(r3)
            throw r2
    }

    public io.realm.RealmAsyncTask executeTransactionAsync(io.realm.Realm.Transaction r11, @javax.annotation.Nullable io.realm.Realm.Transaction.OnSuccess r12, @javax.annotation.Nullable io.realm.Realm.Transaction.OnError r13) {
            r10 = this;
            r10.checkIfValid()
            if (r11 == 0) goto L46
            boolean r0 = r10.isFrozen()
            if (r0 != 0) goto L3e
            io.realm.internal.OsSharedRealm r0 = r10.sharedRealm
            io.realm.internal.Capabilities r0 = r0.capabilities
            boolean r5 = r0.canDeliverNotification()
            if (r12 != 0) goto L17
            if (r13 == 0) goto L20
        L17:
            io.realm.internal.OsSharedRealm r0 = r10.sharedRealm
            io.realm.internal.Capabilities r0 = r0.capabilities
            java.lang.String r1 = "Callback cannot be delivered on current thread."
            r0.checkCanDeliverNotification(r1)
        L20:
            io.realm.RealmConfiguration r3 = r10.getConfiguration()
            io.realm.internal.OsSharedRealm r0 = r10.sharedRealm
            io.realm.internal.RealmNotifier r7 = r0.realmNotifier
            io.realm.internal.async.RealmThreadPoolExecutor r0 = io.realm.BaseRealm.asyncTaskExecutor
            io.realm.Realm$1 r9 = new io.realm.Realm$1
            r1 = r9
            r2 = r10
            r4 = r11
            r6 = r12
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Future r11 = r0.submitTransaction(r9)
            io.realm.internal.async.RealmAsyncTaskImpl r12 = new io.realm.internal.async.RealmAsyncTaskImpl
            r12.<init>(r11, r0)
            return r12
        L3e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Write transactions on a frozen Realm is not allowed."
            r11.<init>(r12)
            throw r11
        L46:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Transaction should not be null"
            r11.<init>(r12)
            throw r11
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ io.realm.BaseRealm freeze() {
            r1 = this;
            io.realm.Realm r0 = r1.freeze()
            return r0
    }

    @Override // io.realm.BaseRealm
    public io.realm.Realm freeze() {
            r3 = this;
            io.realm.RealmConfiguration r0 = r3.configuration
            java.lang.Class<io.realm.Realm> r1 = io.realm.Realm.class
            io.realm.internal.OsSharedRealm r2 = r3.sharedRealm
            io.realm.internal.OsSharedRealm$VersionID r2 = r2.getVersionID()
            io.realm.BaseRealm r0 = io.realm.RealmCache.createRealmOrGetFromCache(r0, r1, r2)
            io.realm.Realm r0 = (io.realm.Realm) r0
            return r0
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ io.realm.RealmConfiguration getConfiguration() {
            r1 = this;
            io.realm.RealmConfiguration r0 = super.getConfiguration()
            return r0
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ long getNumberOfActiveVersions() {
            r2 = this;
            long r0 = super.getNumberOfActiveVersions()
            return r0
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = super.getPath()
            return r0
    }

    @Override // io.realm.BaseRealm
    public io.realm.RealmSchema getSchema() {
            r1 = this;
            io.realm.RealmSchema r0 = r1.schema
            return r0
    }

    public final io.realm.internal.Table getTable(java.lang.Class<? extends io.realm.RealmModel> r2) {
            r1 = this;
            io.realm.RealmSchema r0 = r1.schema
            io.realm.internal.Table r2 = r0.getTable(r2)
            return r2
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ long getVersion() {
            r2 = this;
            long r0 = super.getVersion()
            return r0
    }

    public void insert(io.realm.RealmModel r3) {
            r2 = this;
            r2.checkIfValidAndInTransaction()
            if (r3 == 0) goto L14
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            io.realm.RealmConfiguration r1 = r2.configuration
            io.realm.internal.RealmProxyMediator r1 = r1.getSchemaMediator()
            r1.insert(r2, r3, r0)
            return
        L14:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Null object cannot be inserted into Realm."
            r3.<init>(r0)
            throw r3
    }

    public void insert(java.util.Collection<? extends io.realm.RealmModel> r2) {
            r1 = this;
            r1.checkIfValidAndInTransaction()
            if (r2 == 0) goto L16
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc
            return
        Lc:
            io.realm.RealmConfiguration r0 = r1.configuration
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            r0.insert(r1, r2)
            return
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Null objects cannot be inserted into Realm."
            r2.<init>(r0)
            throw r2
    }

    public void insertOrUpdate(io.realm.RealmModel r3) {
            r2 = this;
            r2.checkIfValidAndInTransaction()
            if (r3 == 0) goto L14
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            io.realm.RealmConfiguration r1 = r2.configuration
            io.realm.internal.RealmProxyMediator r1 = r1.getSchemaMediator()
            r1.insertOrUpdate(r2, r3, r0)
            return
        L14:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Null object cannot be inserted into Realm."
            r3.<init>(r0)
            throw r3
    }

    public void insertOrUpdate(java.util.Collection<? extends io.realm.RealmModel> r2) {
            r1 = this;
            r1.checkIfValidAndInTransaction()
            if (r2 == 0) goto L16
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc
            return
        Lc:
            io.realm.RealmConfiguration r0 = r1.configuration
            io.realm.internal.RealmProxyMediator r0 = r0.getSchemaMediator()
            r0.insertOrUpdate(r1, r2)
            return
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Null objects cannot be inserted into Realm."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isAutoRefresh() {
            r1 = this;
            boolean r0 = super.isAutoRefresh()
            return r0
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isClosed() {
            r1 = this;
            boolean r0 = super.isClosed()
            return r0
    }

    @Override // io.realm.BaseRealm
    public boolean isEmpty() {
            r6 = this;
            r6.checkIfValid()
            io.realm.RealmSchema r0 = r6.schema
            java.util.Set r0 = r0.getAll()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            io.realm.RealmObjectSchema r1 = (io.realm.RealmObjectSchema) r1
            java.lang.String r2 = r1.getClassName()
            java.lang.String r3 = "__"
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto Ld
            io.realm.internal.Table r1 = r1.table
            long r1 = r1.size()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto Ld
            r0 = 0
            return r0
        L33:
            r0 = 1
            return r0
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isFrozen() {
            r1 = this;
            boolean r0 = super.isFrozen()
            return r0
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isInTransaction() {
            r1 = this;
            boolean r0 = super.isInTransaction()
            return r0
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void refresh() {
            r0 = this;
            super.refresh()
            return
    }

    public void removeAllChangeListeners() {
            r0 = this;
            r0.removeAllListeners()
            return
    }

    public void removeChangeListener(io.realm.RealmChangeListener<io.realm.Realm> r1) {
            r0 = this;
            r0.removeListener(r1)
            return
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void setAutoRefresh(boolean r1) {
            r0 = this;
            super.setAutoRefresh(r1)
            return
    }

    @Override // io.realm.BaseRealm
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ void stopWaitForChange() {
            r0 = this;
            super.stopWaitForChange()
            return
    }

    @Override // io.realm.BaseRealm
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ boolean waitForChange() {
            r1 = this;
            boolean r0 = super.waitForChange()
            return r0
    }

    public <E extends io.realm.RealmModel> io.realm.RealmQuery<E> where(java.lang.Class<E> r1) {
            r0 = this;
            r0.checkIfValid()
            io.realm.RealmQuery r1 = io.realm.RealmQuery.createQuery(r0, r1)
            return r1
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void writeCopyTo(java.io.File r1) {
            r0 = this;
            super.writeCopyTo(r1)
            return
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void writeEncryptedCopyTo(java.io.File r1, byte[] r2) {
            r0 = this;
            super.writeEncryptedCopyTo(r1, r2)
            return
    }
}
