package io.realm;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseRealm implements java.io.Closeable {
    private static final java.lang.String INCORRECT_THREAD_CLOSE_MESSAGE = "Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.";
    private static final java.lang.String NOT_IN_TRANSACTION_MESSAGE = "Changing Realm data can only be done from inside a transaction.";
    public static final io.realm.internal.async.RealmThreadPoolExecutor WRITE_EXECUTOR = null;
    public static volatile android.content.Context applicationContext;
    public static final io.realm.internal.async.RealmThreadPoolExecutor asyncTaskExecutor = null;
    public static final io.realm.BaseRealm.ThreadLocalRealmObjectContext objectContext = null;
    public final io.realm.RealmConfiguration configuration;
    public final boolean frozen;
    private io.realm.RealmCache realmCache;
    private io.realm.internal.OsSharedRealm.SchemaChangedCallback schemaChangedCallback;
    public io.realm.internal.OsSharedRealm sharedRealm;
    private boolean shouldCloseSharedRealm;
    public final long threadId;







    public static abstract class InstanceCallback<T extends io.realm.BaseRealm> {
        public InstanceCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
                java.lang.String r1 = "Exception happens when initializing Realm in the background thread."
                r0.<init>(r1, r3)
                throw r0
        }

        public abstract void onSuccess(T r1);
    }

    public static final class RealmObjectContext {
        private boolean acceptDefaultValue;
        private io.realm.internal.ColumnInfo columnInfo;
        private java.util.List<java.lang.String> excludeFields;
        private io.realm.BaseRealm realm;
        private io.realm.internal.Row row;

        public RealmObjectContext() {
                r0 = this;
                r0.<init>()
                return
        }

        public void clear() {
                r2 = this;
                r0 = 0
                r2.realm = r0
                r2.row = r0
                r2.columnInfo = r0
                r1 = 0
                r2.acceptDefaultValue = r1
                r2.excludeFields = r0
                return
        }

        public boolean getAcceptDefaultValue() {
                r1 = this;
                boolean r0 = r1.acceptDefaultValue
                return r0
        }

        public io.realm.internal.ColumnInfo getColumnInfo() {
                r1 = this;
                io.realm.internal.ColumnInfo r0 = r1.columnInfo
                return r0
        }

        public java.util.List<java.lang.String> getExcludeFields() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.excludeFields
                return r0
        }

        public final io.realm.BaseRealm getRealm() {
                r1 = this;
                io.realm.BaseRealm r0 = r1.realm
                return r0
        }

        public io.realm.internal.Row getRow() {
                r1 = this;
                io.realm.internal.Row r0 = r1.row
                return r0
        }

        public void set(io.realm.BaseRealm r1, io.realm.internal.Row r2, io.realm.internal.ColumnInfo r3, boolean r4, java.util.List<java.lang.String> r5) {
                r0 = this;
                r0.realm = r1
                r0.row = r2
                r0.columnInfo = r3
                r0.acceptDefaultValue = r4
                r0.excludeFields = r5
                return
        }
    }

    public static final class ThreadLocalRealmObjectContext extends java.lang.ThreadLocal<io.realm.BaseRealm.RealmObjectContext> {
        public ThreadLocalRealmObjectContext() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.ThreadLocal
        public final io.realm.BaseRealm.RealmObjectContext initialValue() {
                r1 = this;
                io.realm.BaseRealm$RealmObjectContext r0 = new io.realm.BaseRealm$RealmObjectContext
                r0.<init>()
                return r0
        }
    }

    static {
            io.realm.internal.async.RealmThreadPoolExecutor r0 = io.realm.internal.async.RealmThreadPoolExecutor.newDefaultExecutor()
            io.realm.BaseRealm.asyncTaskExecutor = r0
            io.realm.internal.async.RealmThreadPoolExecutor r0 = io.realm.internal.async.RealmThreadPoolExecutor.newSingleThreadExecutor()
            io.realm.BaseRealm.WRITE_EXECUTOR = r0
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = new io.realm.BaseRealm$ThreadLocalRealmObjectContext
            r0.<init>()
            io.realm.BaseRealm.objectContext = r0
            return
    }

    public BaseRealm(io.realm.RealmCache r7, @javax.annotation.Nullable io.realm.internal.OsSchemaInfo r8, io.realm.internal.OsSharedRealm.VersionID r9) {
            r6 = this;
            io.realm.RealmConfiguration r0 = r7.getConfiguration()
            r6.<init>()
            io.realm.BaseRealm$1 r1 = new io.realm.BaseRealm$1
            r1.<init>(r6)
            r6.schemaChangedCallback = r1
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            long r1 = r1.getId()
            r6.threadId = r1
            r6.configuration = r0
            r1 = 0
            r6.realmCache = r1
            if (r8 == 0) goto L2e
            io.realm.RealmMigration r2 = r0.getMigration()
            if (r2 == 0) goto L2e
            io.realm.RealmMigration r2 = r0.getMigration()
            io.realm.internal.OsSharedRealm$MigrationCallback r2 = createMigrationCallback(r2)
            goto L2f
        L2e:
            r2 = r1
        L2f:
            io.realm.Realm$Transaction r3 = r0.getInitialDataTransaction()
            if (r3 == 0) goto L3a
            io.realm.BaseRealm$2 r1 = new io.realm.BaseRealm$2
            r1.<init>(r6, r3)
        L3a:
            io.realm.internal.OsRealmConfig$Builder r3 = new io.realm.internal.OsRealmConfig$Builder
            r3.<init>(r0)
            java.io.File r0 = new java.io.File
            android.content.Context r4 = io.realm.BaseRealm.applicationContext
            java.io.File r4 = r4.getFilesDir()
            java.lang.String r5 = ".realm.temp"
            r0.<init>(r4, r5)
            io.realm.internal.OsRealmConfig$Builder r0 = r3.fifoFallbackDir(r0)
            r3 = 1
            io.realm.internal.OsRealmConfig$Builder r0 = r0.autoUpdateNotification(r3)
            io.realm.internal.OsRealmConfig$Builder r0 = r0.migrationCallback(r2)
            io.realm.internal.OsRealmConfig$Builder r8 = r0.schemaInfo(r8)
            io.realm.internal.OsRealmConfig$Builder r8 = r8.initializationCallback(r1)
            io.realm.internal.OsSharedRealm r8 = io.realm.internal.OsSharedRealm.getInstance(r8, r9)
            r6.sharedRealm = r8
            boolean r8 = r8.isFrozen()
            r6.frozen = r8
            r6.shouldCloseSharedRealm = r3
            io.realm.internal.OsSharedRealm r8 = r6.sharedRealm
            io.realm.internal.OsSharedRealm$SchemaChangedCallback r9 = r6.schemaChangedCallback
            r8.registerSchemaChangedCallback(r9)
            r6.realmCache = r7
            return
    }

    public BaseRealm(io.realm.internal.OsSharedRealm r3) {
            r2 = this;
            r2.<init>()
            io.realm.BaseRealm$1 r0 = new io.realm.BaseRealm$1
            r0.<init>(r2)
            r2.schemaChangedCallback = r0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            r2.threadId = r0
            io.realm.RealmConfiguration r0 = r3.getConfiguration()
            r2.configuration = r0
            r0 = 0
            r2.realmCache = r0
            r2.sharedRealm = r3
            boolean r3 = r3.isFrozen()
            r2.frozen = r3
            r3 = 0
            r2.shouldCloseSharedRealm = r3
            return
    }

    public static /* synthetic */ io.realm.internal.OsSharedRealm.MigrationCallback access$000(io.realm.RealmMigration r0) {
            io.realm.internal.OsSharedRealm$MigrationCallback r0 = createMigrationCallback(r0)
            return r0
    }

    private static io.realm.internal.OsSharedRealm.MigrationCallback createMigrationCallback(io.realm.RealmMigration r1) {
            io.realm.BaseRealm$6 r0 = new io.realm.BaseRealm$6
            r0.<init>(r1)
            return r0
    }

    public final <T extends io.realm.BaseRealm> void addListener(io.realm.RealmChangeListener<T> r3) {
            r2 = this;
            if (r3 == 0) goto L22
            r2.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r2.sharedRealm
            io.realm.internal.Capabilities r0 = r0.capabilities
            java.lang.String r1 = "Listeners cannot be used on current thread."
            r0.checkCanDeliverNotification(r1)
            boolean r0 = r2.frozen
            if (r0 != 0) goto L1a
            io.realm.internal.OsSharedRealm r0 = r2.sharedRealm
            io.realm.internal.RealmNotifier r0 = r0.realmNotifier
            r0.addChangeListener(r2, r3)
            return
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "It is not possible to add a change listener to a frozen Realm since it never changes."
            r3.<init>(r0)
            throw r3
        L22:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Listener should not be null"
            r3.<init>(r0)
            throw r3
    }

    public abstract io.reactivex.Flowable asFlowable();

    public void beginTransaction() {
            r1 = this;
            r1.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            r0.beginTransaction()
            return
    }

    public void cancelTransaction() {
            r1 = this;
            r1.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            r0.cancelTransaction()
            return
    }

    public final void checkAllowQueriesOnUiThread() {
            r2 = this;
            io.realm.internal.OsSharedRealm r0 = r2.sharedRealm
            io.realm.internal.Capabilities r0 = r0.capabilities
            boolean r0 = r0.isMainThread()
            if (r0 == 0) goto L1d
            io.realm.RealmConfiguration r0 = r2.getConfiguration()
            boolean r0 = r0.isAllowQueriesOnUiThread()
            if (r0 == 0) goto L15
            goto L1d
        L15:
            io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
            java.lang.String r1 = "Queries on the UI thread have been disabled. They can be enabled by setting 'RealmConfiguration.Builder.allowQueriesOnUiThread(true)'."
            r0.<init>(r1)
            throw r0
        L1d:
            return
    }

    public final void checkAllowWritesOnUiThread() {
            r2 = this;
            io.realm.internal.OsSharedRealm r0 = r2.sharedRealm
            io.realm.internal.Capabilities r0 = r0.capabilities
            boolean r0 = r0.isMainThread()
            if (r0 == 0) goto L1d
            io.realm.RealmConfiguration r0 = r2.getConfiguration()
            boolean r0 = r0.isAllowWritesOnUiThread()
            if (r0 == 0) goto L15
            goto L1d
        L15:
            io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
            java.lang.String r1 = "Running transactions on the UI thread has been disabled. It can be enabled by setting 'RealmConfiguration.Builder.allowWritesOnUiThread(true)'."
            r0.<init>(r1)
            throw r0
        L1d:
            return
    }

    public final void checkIfValid() {
            r5 = this;
            io.realm.internal.OsSharedRealm r0 = r5.sharedRealm
            if (r0 == 0) goto L26
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L26
            boolean r0 = r5.frozen
            if (r0 != 0) goto L25
            long r0 = r5.threadId
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r2 = r2.getId()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1d
            goto L25
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created."
            r0.<init>(r1)
            throw r0
        L25:
            return
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This Realm instance has already been closed, making it unusable."
            r0.<init>(r1)
            throw r0
    }

    public final void checkIfValidAndInTransaction() {
            r2 = this;
            boolean r0 = r2.isInTransaction()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Changing Realm data can only be done from inside a transaction."
            r0.<init>(r1)
            throw r0
    }

    public final void checkNotInSync() {
            r1 = this;
            io.realm.RealmConfiguration r0 = r1.configuration
            java.util.Objects.requireNonNull(r0)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r5 = this;
            boolean r0 = r5.frozen
            if (r0 != 0) goto L1b
            long r0 = r5.threadId
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r2 = r2.getId()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Realm access from incorrect thread. Realm instance can only be closed on the thread it was created."
            r0.<init>(r1)
            throw r0
        L1b:
            io.realm.RealmCache r0 = r5.realmCache
            if (r0 == 0) goto L23
            r0.release(r5)
            goto L33
        L23:
            r0 = 0
            r5.realmCache = r0
            io.realm.internal.OsSharedRealm r1 = r5.sharedRealm
            if (r1 == 0) goto L33
            boolean r2 = r5.shouldCloseSharedRealm
            if (r2 == 0) goto L33
            r1.close()
            r5.sharedRealm = r0
        L33:
            return
    }

    public void commitTransaction() {
            r1 = this;
            r1.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            r0.commitTransaction()
            return
    }

    public void deleteAll() {
            r3 = this;
            r3.checkIfValid()
            io.realm.RealmSchema r0 = r3.getSchema()
            java.util.Set r0 = r0.getAll()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            io.realm.RealmObjectSchema r1 = (io.realm.RealmObjectSchema) r1
            io.realm.RealmSchema r2 = r3.getSchema()
            java.lang.String r1 = r1.getClassName()
            io.realm.internal.Table r1 = r2.getTable(r1)
            r1.clear()
            goto Lf
        L2b:
            return
    }

    public final void doClose() {
            r3 = this;
            r0 = 0
            r3.realmCache = r0
            io.realm.internal.OsSharedRealm r1 = r3.sharedRealm
            if (r1 == 0) goto L10
            boolean r2 = r3.shouldCloseSharedRealm
            if (r2 == 0) goto L10
            r1.close()
            r3.sharedRealm = r0
        L10:
            return
    }

    public final void finalize() throws java.lang.Throwable {
            r3 = this;
            boolean r0 = r3.shouldCloseSharedRealm
            if (r0 == 0) goto L26
            io.realm.internal.OsSharedRealm r0 = r3.sharedRealm
            if (r0 == 0) goto L26
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L26
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            io.realm.RealmConfiguration r2 = r3.configuration
            java.lang.String r2 = r2.getPath()
            r0[r1] = r2
            java.lang.String r1 = "Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory."
            io.realm.log.RealmLog.warn(r1, r0)
            io.realm.RealmCache r0 = r3.realmCache
            if (r0 == 0) goto L26
            r0.leak()
        L26:
            super.finalize()
            return
    }

    public abstract io.realm.BaseRealm freeze();

    public final io.realm.RealmModel get(java.lang.Class r9, long r10, java.util.List r12) {
            r8 = this;
            io.realm.RealmSchema r0 = r8.getSchema()
            io.realm.internal.Table r0 = r0.getTable(r9)
            io.realm.internal.UncheckedRow r4 = r0.getUncheckedRow(r10)
            io.realm.RealmConfiguration r10 = r8.configuration
            io.realm.internal.RealmProxyMediator r1 = r10.getSchemaMediator()
            io.realm.RealmSchema r10 = r8.getSchema()
            io.realm.internal.ColumnInfo r5 = r10.getColumnInfo(r9)
            r6 = 0
            r2 = r9
            r3 = r8
            r7 = r12
            io.realm.RealmModel r9 = r1.newInstance(r2, r3, r4, r5, r6, r7)
            return r9
    }

    public final <E extends io.realm.RealmModel> E get(@javax.annotation.Nullable java.lang.Class<E> r11, @javax.annotation.Nullable java.lang.String r12, long r13) {
            r10 = this;
            if (r12 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L10
            io.realm.RealmSchema r1 = r10.getSchema()
            io.realm.internal.Table r12 = r1.getTable(r12)
            goto L18
        L10:
            io.realm.RealmSchema r12 = r10.getSchema()
            io.realm.internal.Table r12 = r12.getTable(r11)
        L18:
            r1 = -1
            if (r0 == 0) goto L2d
            io.realm.DynamicRealmObject r11 = new io.realm.DynamicRealmObject
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L27
            io.realm.internal.CheckedRow r12 = r12.getCheckedRow(r13)
            goto L29
        L27:
            io.realm.internal.InvalidRow r12 = io.realm.internal.InvalidRow.INSTANCE
        L29:
            r11.<init>(r10, r12)
            goto L52
        L2d:
            io.realm.RealmConfiguration r0 = r10.configuration
            io.realm.internal.RealmProxyMediator r3 = r0.getSchemaMediator()
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L3c
            io.realm.internal.UncheckedRow r12 = r12.getUncheckedRow(r13)
            goto L3e
        L3c:
            io.realm.internal.InvalidRow r12 = io.realm.internal.InvalidRow.INSTANCE
        L3e:
            r6 = r12
            io.realm.RealmSchema r12 = r10.getSchema()
            io.realm.internal.ColumnInfo r7 = r12.getColumnInfo(r11)
            r8 = 0
            java.util.List r9 = java.util.Collections.emptyList()
            r4 = r11
            r5 = r10
            io.realm.RealmModel r11 = r3.newInstance(r4, r5, r6, r7, r8, r9)
        L52:
            return r11
    }

    public final <E extends io.realm.RealmModel> E get(@javax.annotation.Nullable java.lang.Class<E> r8, @javax.annotation.Nullable java.lang.String r9, io.realm.internal.UncheckedRow r10) {
            r7 = this;
            if (r9 == 0) goto L4
            r9 = 1
            goto L5
        L4:
            r9 = 0
        L5:
            if (r9 == 0) goto L11
            io.realm.DynamicRealmObject r8 = new io.realm.DynamicRealmObject
            io.realm.internal.CheckedRow r9 = io.realm.internal.CheckedRow.getFromRow(r10)
            r8.<init>(r7, r9)
            goto L2b
        L11:
            io.realm.RealmConfiguration r9 = r7.configuration
            io.realm.internal.RealmProxyMediator r0 = r9.getSchemaMediator()
            io.realm.RealmSchema r9 = r7.getSchema()
            io.realm.internal.ColumnInfo r4 = r9.getColumnInfo(r8)
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()
            r1 = r8
            r2 = r7
            r3 = r10
            io.realm.RealmModel r8 = r0.newInstance(r1, r2, r3, r4, r5, r6)
        L2b:
            return r8
    }

    public io.realm.RealmConfiguration getConfiguration() {
            r1 = this;
            io.realm.RealmConfiguration r0 = r1.configuration
            return r0
    }

    public final io.realm.internal.Row getEmbeddedObjectRow(java.lang.String r8, io.realm.internal.RealmObjectProxy r9, java.lang.String r10, io.realm.RealmSchema r11, io.realm.RealmObjectSchema r12) {
            r7 = this;
            long r0 = r12.getColumnKey(r10)
            io.realm.RealmFieldType r2 = r12.getFieldType(r10)
            io.realm.ProxyState r9 = r9.realmGet$proxyState()
            io.realm.internal.Row r9 = r9.getRow$realm()
            io.realm.RealmFieldType r3 = r12.getFieldType(r10)
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.OBJECT
            r5 = 1
            r6 = 0
            if (r3 == r4) goto L21
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.LIST
            if (r3 != r4) goto L1f
            goto L21
        L1f:
            r3 = 0
            goto L22
        L21:
            r3 = 1
        L22:
            if (r3 == 0) goto L58
            java.lang.String r3 = r12.getPropertyClassName(r10)
            boolean r4 = r3.equals(r8)
            if (r4 == 0) goto L3b
            long r9 = r9.createEmbeddedObject(r0, r2)
            io.realm.internal.Table r8 = r11.getTable(r8)
            io.realm.internal.CheckedRow r8 = r8.getCheckedRow(r9)
            return r8
        L3b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r12 = r12.getClassName()
            r11[r6] = r12
            r11[r5] = r10
            r10 = 2
            r11[r10] = r3
            r10 = 3
            r11[r10] = r8
            java.lang.String r8 = "Parent type %s expects that property '%s' be of type %s but was %s."
            java.lang.String r8 = java.lang.String.format(r8, r11)
            r9.<init>(r8)
            throw r9
        L58:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r6] = r10
            java.lang.String r10 = "Field '%s' does not contain a valid link"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r8.<init>(r9)
            throw r8
    }

    public long getNumberOfActiveVersions() {
            r2 = this;
            r2.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r2.sharedRealm
            long r0 = r0.getNumberOfVersions()
            return r0
    }

    public java.lang.String getPath() {
            r1 = this;
            io.realm.RealmConfiguration r0 = r1.configuration
            java.lang.String r0 = r0.getPath()
            return r0
    }

    public abstract io.realm.RealmSchema getSchema();

    public long getVersion() {
            r2 = this;
            io.realm.internal.OsSharedRealm r0 = r2.sharedRealm
            long r0 = io.realm.internal.OsObjectStore.getSchemaVersion(r0)
            return r0
    }

    public boolean isAutoRefresh() {
            r1 = this;
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            boolean r0 = r0.isAutoRefresh()
            return r0
    }

    public boolean isClosed() {
            r5 = this;
            boolean r0 = r5.frozen
            if (r0 != 0) goto L1b
            long r0 = r5.threadId
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r2 = r2.getId()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created."
            r0.<init>(r1)
            throw r0
        L1b:
            io.realm.internal.OsSharedRealm r0 = r5.sharedRealm
            if (r0 == 0) goto L28
            boolean r0 = r0.isClosed()
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            return r0
    }

    public abstract boolean isEmpty();

    public boolean isFrozen() {
            r2 = this;
            io.realm.internal.OsSharedRealm r0 = r2.sharedRealm
            if (r0 == 0) goto Ld
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto Ld
            boolean r0 = r2.frozen
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This Realm instance has already been closed, making it unusable."
            r0.<init>(r1)
            throw r0
    }

    public boolean isInTransaction() {
            r1 = this;
            r1.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            boolean r0 = r0.isInTransaction()
            return r0
    }

    public void refresh() {
            r2 = this;
            r2.checkIfValid()
            r2.checkAllowQueriesOnUiThread()
            boolean r0 = r2.isInTransaction()
            if (r0 != 0) goto L12
            io.realm.internal.OsSharedRealm r0 = r2.sharedRealm
            r0.refresh()
            return
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot refresh a Realm instance inside a transaction."
            r0.<init>(r1)
            throw r0
    }

    public final void removeAllListeners() {
            r3 = this;
            boolean r0 = r3.isClosed()
            if (r0 == 0) goto L17
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            io.realm.RealmConfiguration r2 = r3.configuration
            java.lang.String r2 = r2.getPath()
            r0[r1] = r2
            java.lang.String r1 = "Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm."
            io.realm.log.RealmLog.warn(r1, r0)
        L17:
            io.realm.internal.OsSharedRealm r0 = r3.sharedRealm
            io.realm.internal.RealmNotifier r0 = r0.realmNotifier
            r0.removeChangeListeners(r3)
            return
    }

    public final <T extends io.realm.BaseRealm> void removeListener(io.realm.RealmChangeListener<T> r4) {
            r3 = this;
            if (r4 == 0) goto L21
            boolean r0 = r3.isClosed()
            if (r0 == 0) goto L19
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            io.realm.RealmConfiguration r2 = r3.configuration
            java.lang.String r2 = r2.getPath()
            r0[r1] = r2
            java.lang.String r1 = "Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm."
            io.realm.log.RealmLog.warn(r1, r0)
        L19:
            io.realm.internal.OsSharedRealm r0 = r3.sharedRealm
            io.realm.internal.RealmNotifier r0 = r0.realmNotifier
            r0.removeChangeListener(r3, r4)
            return
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Listener should not be null"
            r4.<init>(r0)
            throw r4
    }

    public void setAutoRefresh(boolean r2) {
            r1 = this;
            r1.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            r0.setAutoRefresh(r2)
            return
    }

    @java.lang.Deprecated
    public void stopWaitForChange() {
            r2 = this;
            io.realm.RealmCache r0 = r2.realmCache
            if (r0 == 0) goto L12
            io.realm.BaseRealm$3 r1 = new io.realm.BaseRealm$3
            r1.<init>(r2)
            monitor-enter(r0)
            r1.onCall()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This Realm instance has already been closed, making it unusable."
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public boolean waitForChange() {
            r2 = this;
            r2.checkIfValid()
            boolean r0 = r2.isInTransaction()
            if (r0 != 0) goto L25
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L1d
            io.realm.internal.OsSharedRealm r0 = r2.sharedRealm
            boolean r0 = r0.waitForChange()
            if (r0 == 0) goto L1c
            io.realm.internal.OsSharedRealm r1 = r2.sharedRealm
            r1.refresh()
        L1c:
            return r0
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot wait for changes inside a Looper thread. Use RealmChangeListeners instead."
            r0.<init>(r1)
            throw r0
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot wait for changes inside of a transaction."
            r0.<init>(r1)
            throw r0
    }

    public void writeCopyTo(java.io.File r3) {
            r2 = this;
            if (r3 == 0) goto Lc
            r2.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r2.sharedRealm
            r1 = 0
            r0.writeCopy(r3, r1)
            return
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The destination argument cannot be null"
            r3.<init>(r0)
            throw r3
    }

    public void writeEncryptedCopyTo(java.io.File r2, byte[] r3) {
            r1 = this;
            if (r2 == 0) goto Lb
            r1.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            r0.writeCopy(r2, r3)
            return
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The destination argument cannot be null"
            r2.<init>(r3)
            throw r2
    }
}
