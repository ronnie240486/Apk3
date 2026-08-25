package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
@io.realm.internal.Keep
public final class OsSharedRealm implements java.io.Closeable, io.realm.internal.NativeObject {
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    private static final long nativeFinalizerPtr = 0;
    private static final java.util.List<io.realm.internal.OsSharedRealm> sharedRealmsUnderConstruction = null;
    private static volatile java.io.File temporaryDirectory;
    public final io.realm.internal.Capabilities capabilities;
    public final io.realm.internal.NativeContext context;
    public final java.util.List<java.lang.ref.WeakReference<io.realm.internal.OsResults.Iterator>> iterators;
    private final long nativePtr;
    private final io.realm.internal.OsRealmConfig osRealmConfig;
    private final java.util.List<java.lang.ref.WeakReference<io.realm.internal.PendingRow>> pendingRows;
    public final io.realm.internal.RealmNotifier realmNotifier;
    private final io.realm.internal.OsSchemaInfo schemaInfo;
    private final java.util.List<io.realm.internal.OsSharedRealm> tempSharedRealmsForCallback;

    @io.realm.internal.Keep
    public interface InitializationCallback {
        void onInit(io.realm.internal.OsSharedRealm r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    @io.realm.internal.Keep
    public interface MigrationCallback {
        void onMigrationNeeded(io.realm.internal.OsSharedRealm r1, long r2, long r4);
    }

    /* JADX INFO: loaded from: classes.dex */
    @io.realm.internal.Keep
    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    public static class VersionID implements java.lang.Comparable<io.realm.internal.OsSharedRealm.VersionID> {
        public static final io.realm.internal.OsSharedRealm.VersionID LIVE = null;
        public final long index;
        public final long version;

        static {
                io.realm.internal.OsSharedRealm$VersionID r0 = new io.realm.internal.OsSharedRealm$VersionID
                r1 = -1
                r0.<init>(r1, r1)
                io.realm.internal.OsSharedRealm.VersionID.LIVE = r0
                return
        }

        public VersionID(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.version = r1
                r0.index = r3
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(io.realm.internal.OsSharedRealm.VersionID r5) {
                r4 = this;
                if (r5 == 0) goto L14
                long r0 = r4.version
                long r2 = r5.version
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto Lc
                r5 = 1
                return r5
            Lc:
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 >= 0) goto L12
                r5 = -1
                return r5
            L12:
                r5 = 0
                return r5
            L14:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Version cannot be compared to a null value."
                r5.<init>(r0)
                throw r5
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(io.realm.internal.OsSharedRealm.VersionID r1) {
                r0 = this;
                io.realm.internal.OsSharedRealm$VersionID r1 = (io.realm.internal.OsSharedRealm.VersionID) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L27
                java.lang.Class r2 = r7.getClass()
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L12
                goto L27
            L12:
                io.realm.internal.OsSharedRealm$VersionID r8 = (io.realm.internal.OsSharedRealm.VersionID) r8
                long r2 = r7.version
                long r4 = r8.version
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L25
                long r2 = r7.index
                long r4 = r8.index
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 != 0) goto L25
                goto L26
            L25:
                r0 = 0
            L26:
                return r0
            L27:
                return r1
        }

        public int hashCode() {
                r7 = this;
                long r0 = r7.version
                r2 = 32
                long r3 = r0 >>> r2
                long r0 = r0 ^ r3
                int r1 = (int) r0
                int r1 = r1 * 31
                long r3 = r7.index
                long r5 = r3 >>> r2
                long r2 = r3 ^ r5
                int r0 = (int) r2
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "VersionID{version="
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                long r1 = r3.version
                r0.append(r1)
                java.lang.String r1 = ", index="
                r0.append(r1)
                long r1 = r3.index
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.OsSharedRealm.nativeFinalizerPtr = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            io.realm.internal.OsSharedRealm.sharedRealmsUnderConstruction = r0
            return
    }

    public OsSharedRealm(long r3, io.realm.internal.OsRealmConfig r5) {
            r2 = this;
            io.realm.internal.NativeContext r0 = r5.getContext()
            r2.<init>(r3, r5, r0)
            java.util.List<io.realm.internal.OsSharedRealm> r3 = io.realm.internal.OsSharedRealm.sharedRealmsUnderConstruction
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L28
            java.lang.Object r4 = r3.next()
            io.realm.internal.OsSharedRealm r4 = (io.realm.internal.OsSharedRealm) r4
            io.realm.internal.NativeContext r0 = r4.context
            io.realm.internal.NativeContext r1 = r5.getContext()
            if (r0 != r1) goto Ld
            r3 = 1
            java.util.List<io.realm.internal.OsSharedRealm> r4 = r4.tempSharedRealmsForCallback
            r4.add(r2)
            goto L29
        L28:
            r3 = 0
        L29:
            if (r3 == 0) goto L2c
            return
        L2c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot find the parent 'OsSharedRealm' which is under construction."
            r3.<init>(r4)
            throw r3
    }

    public OsSharedRealm(long r3, io.realm.internal.OsRealmConfig r5, io.realm.internal.NativeContext r6) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.tempSharedRealmsForCallback = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.pendingRows = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.iterators = r0
            r2.nativePtr = r3
            r2.osRealmConfig = r5
            io.realm.internal.OsSchemaInfo r5 = new io.realm.internal.OsSchemaInfo
            long r0 = nativeGetSchemaInfo(r3)
            r5.<init>(r0, r2)
            r2.schemaInfo = r5
            r2.context = r6
            r6.addReference(r2)
            io.realm.internal.android.AndroidCapabilities r5 = new io.realm.internal.android.AndroidCapabilities
            r5.<init>()
            r2.capabilities = r5
            r5 = 0
            r2.realmNotifier = r5
            r5 = 0
            nativeSetAutoRefresh(r3, r5)
            return
    }

    private OsSharedRealm(io.realm.internal.OsRealmConfig r13, io.realm.internal.OsSharedRealm.VersionID r14) {
            r12 = this;
            r12.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.tempSharedRealmsForCallback = r0
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r12.pendingRows = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r12.iterators = r1
            io.realm.internal.android.AndroidCapabilities r1 = new io.realm.internal.android.AndroidCapabilities
            r1.<init>()
            io.realm.internal.android.AndroidRealmNotifier r9 = new io.realm.internal.android.AndroidRealmNotifier
            r9.<init>(r12, r1)
            io.realm.internal.NativeContext r10 = r13.getContext()
            r12.context = r10
            java.util.List<io.realm.internal.OsSharedRealm> r11 = io.realm.internal.OsSharedRealm.sharedRealmsUnderConstruction
            r11.add(r12)
            long r2 = r13.getNativePtr()     // Catch: java.lang.Throwable -> L66
            long r4 = r14.version     // Catch: java.lang.Throwable -> L66
            long r6 = r14.index     // Catch: java.lang.Throwable -> L66
            r8 = r9
            long r2 = nativeGetSharedRealm(r2, r4, r6, r8)     // Catch: java.lang.Throwable -> L66
            r12.nativePtr = r2     // Catch: java.lang.Throwable -> L66
            r0.clear()
            r11.remove(r12)
            r12.osRealmConfig = r13
            io.realm.internal.OsSchemaInfo r13 = new io.realm.internal.OsSchemaInfo
            long r4 = nativeGetSchemaInfo(r2)
            r13.<init>(r4, r12)
            r12.schemaInfo = r13
            r10.addReference(r12)
            r12.capabilities = r1
            r12.realmNotifier = r9
            io.realm.internal.OsSharedRealm$VersionID r13 = io.realm.internal.OsSharedRealm.VersionID.LIVE
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L65
            boolean r13 = r1.canDeliverNotification()
            nativeSetAutoRefresh(r2, r13)
        L65:
            return
        L66:
            r13 = move-exception
            java.util.List<io.realm.internal.OsSharedRealm> r14 = r12.tempSharedRealmsForCallback     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> L84
        L6d:
            boolean r0 = r14.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L83
            java.lang.Object r0 = r14.next()     // Catch: java.lang.Throwable -> L84
            io.realm.internal.OsSharedRealm r0 = (io.realm.internal.OsSharedRealm) r0     // Catch: java.lang.Throwable -> L84
            boolean r1 = r0.isClosed()     // Catch: java.lang.Throwable -> L84
            if (r1 != 0) goto L6d
            r0.close()     // Catch: java.lang.Throwable -> L84
            goto L6d
        L83:
            throw r13     // Catch: java.lang.Throwable -> L84
        L84:
            r13 = move-exception
            java.util.List<io.realm.internal.OsSharedRealm> r14 = r12.tempSharedRealmsForCallback
            r14.clear()
            java.util.List<io.realm.internal.OsSharedRealm> r14 = io.realm.internal.OsSharedRealm.sharedRealmsUnderConstruction
            r14.remove(r12)
            throw r13
    }

    private void detachIterators() {
            r3 = this;
            java.util.List<java.lang.ref.WeakReference<io.realm.internal.OsResults$Iterator>> r0 = r3.iterators
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            io.realm.internal.OsResults$Iterator r1 = (io.realm.internal.OsResults.Iterator) r1
            if (r1 == 0) goto L6
            io.realm.internal.OsResults r2 = r1.iteratorOsResults
            io.realm.internal.OsResults r2 = r2.createSnapshot()
            r1.iteratorOsResults = r2
            goto L6
        L23:
            java.util.List<java.lang.ref.WeakReference<io.realm.internal.OsResults$Iterator>> r0 = r3.iterators
            r0.clear()
            return
    }

    private void executePendingRowQueries() {
            r2 = this;
            java.util.List<java.lang.ref.WeakReference<io.realm.internal.PendingRow>> r0 = r2.pendingRows
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            io.realm.internal.PendingRow r1 = (io.realm.internal.PendingRow) r1
            if (r1 == 0) goto L6
            r1.executeQuery()
            goto L6
        L1e:
            java.util.List<java.lang.ref.WeakReference<io.realm.internal.PendingRow>> r0 = r2.pendingRows
            r0.clear()
            return
    }

    public static io.realm.internal.OsSharedRealm getInstance(io.realm.RealmConfiguration r1, io.realm.internal.OsSharedRealm.VersionID r2) {
            io.realm.internal.OsRealmConfig$Builder r0 = new io.realm.internal.OsRealmConfig$Builder
            r0.<init>(r1)
            io.realm.internal.OsSharedRealm r1 = getInstance(r0, r2)
            return r1
    }

    public static io.realm.internal.OsSharedRealm getInstance(io.realm.internal.OsRealmConfig.Builder r1, io.realm.internal.OsSharedRealm.VersionID r2) {
            io.realm.internal.OsRealmConfig r1 = r1.build()
            io.realm.internal.ObjectServerFacade r0 = io.realm.internal.ObjectServerFacade.getSyncFacadeIfPossible()
            r0.wrapObjectStoreSessionIfRequired(r1)
            io.realm.internal.OsSharedRealm r0 = new io.realm.internal.OsSharedRealm
            r0.<init>(r1, r2)
            return r0
    }

    public static java.io.File getTemporaryDirectory() {
            java.io.File r0 = io.realm.internal.OsSharedRealm.temporaryDirectory
            return r0
    }

    public static void initialize(java.io.File r3) {
            java.io.File r0 = io.realm.internal.OsSharedRealm.temporaryDirectory
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = r3.getAbsolutePath()
            boolean r1 = r3.isDirectory()
            if (r1 != 0) goto L28
            boolean r1 = r3.mkdirs()
            if (r1 != 0) goto L28
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L1c
            goto L28
        L1c:
            io.realm.internal.IOException r3 = new io.realm.internal.IOException
            java.lang.String r1 = "failed to create temporary directory: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
            r3.<init>(r0)
            throw r3
        L28:
            java.lang.String r1 = "/"
            boolean r2 = r0.endsWith(r1)
            if (r2 != 0) goto L34
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
        L34:
            nativeInit(r0)
            io.realm.internal.OsSharedRealm.temporaryDirectory = r3
            return
    }

    private static native void nativeBeginTransaction(long r0);

    private static native void nativeCancelTransaction(long r0);

    private static native void nativeCloseSharedRealm(long r0);

    private static native void nativeCommitTransaction(long r0);

    private static native boolean nativeCompact(long r0);

    private static native long nativeCreateTable(long r0, java.lang.String r2);

    private static native long nativeCreateTableWithPrimaryKeyField(long r0, java.lang.String r2, java.lang.String r3, int r4, boolean r5);

    private static native long nativeFreeze(long r0);

    private static native long nativeGetActiveSubscriptionSet(long r0);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetLatestSubscriptionSet(long r0);

    private static native long nativeGetSchemaInfo(long r0);

    private static native long nativeGetSharedRealm(long r0, long r2, long r4, io.realm.internal.RealmNotifier r6);

    private static native long nativeGetTableRef(long r0, java.lang.String r2);

    private static native java.lang.String[] nativeGetTablesName(long r0);

    private static native long[] nativeGetVersionID(long r0);

    private static native boolean nativeHasTable(long r0, java.lang.String r2);

    private static native void nativeInit(java.lang.String r0);

    private static native boolean nativeIsAutoRefresh(long r0);

    private static native boolean nativeIsClosed(long r0);

    private static native boolean nativeIsEmpty(long r0);

    private static native boolean nativeIsFrozen(long r0);

    private static native boolean nativeIsInTransaction(long r0);

    private static native long nativeNumberOfVersions(long r0);

    private static native void nativeRefresh(long r0);

    private static native void nativeRegisterSchemaChangedCallback(long r0, io.realm.internal.OsSharedRealm.SchemaChangedCallback r2);

    private static native void nativeRenameTable(long r0, java.lang.String r2, java.lang.String r3);

    private static native void nativeSetAutoRefresh(long r0, boolean r2);

    private static native long nativeSize(long r0);

    private static native void nativeStopWaitForChange(long r0);

    private static native boolean nativeWaitForChange(long r0);

    private static native void nativeWriteCopy(long r0, java.lang.String r2, @javax.annotation.Nullable byte[] r3);

    private static void runInitializationCallback(long r1, io.realm.internal.OsRealmConfig r3, io.realm.internal.OsSharedRealm.InitializationCallback r4) {
            io.realm.internal.OsSharedRealm r0 = new io.realm.internal.OsSharedRealm
            r0.<init>(r1, r3)
            r4.onInit(r0)
            return
    }

    private static void runMigrationCallback(long r6, io.realm.internal.OsRealmConfig r8, io.realm.internal.OsSharedRealm.MigrationCallback r9, long r10) {
            io.realm.internal.OsSharedRealm r1 = new io.realm.internal.OsSharedRealm
            r1.<init>(r6, r8)
            io.realm.RealmConfiguration r6 = r8.getRealmConfiguration()
            long r4 = r6.getSchemaVersion()
            r0 = r9
            r2 = r10
            r0.onMigrationNeeded(r1, r2, r4)
            return
    }

    public void addIterator(io.realm.internal.OsResults.Iterator r3) {
            r2 = this;
            java.util.List<java.lang.ref.WeakReference<io.realm.internal.OsResults$Iterator>> r0 = r2.iterators
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
            return
    }

    public void addPendingRow(io.realm.internal.PendingRow r3) {
            r2 = this;
            java.util.List<java.lang.ref.WeakReference<io.realm.internal.PendingRow>> r0 = r2.pendingRows
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
            return
    }

    public void beginTransaction() {
            r2 = this;
            r2.detachIterators()
            r2.executePendingRowQueries()
            long r0 = r2.nativePtr
            nativeBeginTransaction(r0)
            return
    }

    public void cancelTransaction() {
            r2 = this;
            long r0 = r2.nativePtr
            nativeCancelTransaction(r0)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            io.realm.internal.RealmNotifier r0 = r3.realmNotifier
            if (r0 == 0) goto L7
            r0.close()
        L7:
            io.realm.internal.NativeContext r0 = r3.context
            monitor-enter(r0)
            long r1 = r3.nativePtr     // Catch: java.lang.Throwable -> L11
            nativeCloseSharedRealm(r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public void commitTransaction() {
            r2 = this;
            long r0 = r2.nativePtr
            nativeCommitTransaction(r0)
            return
    }

    public boolean compact() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeCompact(r0)
            return r0
    }

    public io.realm.internal.Table createTable(java.lang.String r4) {
            r3 = this;
            io.realm.internal.Table r0 = new io.realm.internal.Table
            long r1 = r3.nativePtr
            long r1 = nativeCreateTable(r1, r4)
            r0.<init>(r3, r1)
            return r0
    }

    public io.realm.internal.Table createTableWithPrimaryKey(java.lang.String r8, java.lang.String r9, io.realm.RealmFieldType r10, boolean r11) {
            r7 = this;
            io.realm.internal.Table r0 = new io.realm.internal.Table
            long r1 = r7.nativePtr
            int r5 = r10.getNativeValue()
            r3 = r8
            r4 = r9
            r6 = r11
            long r8 = nativeCreateTableWithPrimaryKeyField(r1, r3, r4, r5, r6)
            r0.<init>(r7, r8)
            return r0
    }

    public io.realm.internal.OsSharedRealm freeze() {
            r3 = this;
            io.realm.internal.OsSharedRealm r0 = new io.realm.internal.OsSharedRealm
            io.realm.internal.OsRealmConfig r1 = r3.osRealmConfig
            io.realm.internal.OsSharedRealm$VersionID r2 = r3.getVersionID()
            r0.<init>(r1, r2)
            return r0
    }

    public io.realm.RealmConfiguration getConfiguration() {
            r1 = this;
            io.realm.internal.OsRealmConfig r0 = r1.osRealmConfig
            io.realm.RealmConfiguration r0 = r0.getRealmConfiguration()
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.OsSharedRealm.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public long getNumberOfVersions() {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeNumberOfVersions(r0)
            return r0
    }

    public java.lang.String getPath() {
            r1 = this;
            io.realm.internal.OsRealmConfig r0 = r1.osRealmConfig
            io.realm.RealmConfiguration r0 = r0.getRealmConfiguration()
            java.lang.String r0 = r0.getPath()
            return r0
    }

    public io.realm.internal.OsSchemaInfo getSchemaInfo() {
            r1 = this;
            io.realm.internal.OsSchemaInfo r0 = r1.schemaInfo
            return r0
    }

    public io.realm.internal.Table getTable(java.lang.String r3) {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeGetTableRef(r0, r3)
            io.realm.internal.Table r3 = new io.realm.internal.Table
            r3.<init>(r2, r0)
            return r3
    }

    public java.lang.String[] getTablesNames() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String[] r0 = nativeGetTablesName(r0)
            if (r0 == 0) goto L9
            goto Lc
        L9:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
        Lc:
            return r0
    }

    public io.realm.internal.OsSharedRealm.VersionID getVersionID() {
            r6 = this;
            long r0 = r6.nativePtr
            long[] r0 = nativeGetVersionID(r0)
            if (r0 == 0) goto L14
            io.realm.internal.OsSharedRealm$VersionID r1 = new io.realm.internal.OsSharedRealm$VersionID
            r2 = 0
            r2 = r0[r2]
            r4 = 1
            r4 = r0[r4]
            r1.<init>(r2, r4)
            return r1
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot get versionId, this could be related to a non existing read/write transaction"
            r0.<init>(r1)
            throw r0
    }

    public boolean hasTable(java.lang.String r3) {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r3 = nativeHasTable(r0, r3)
            return r3
    }

    public void invalidateIterators() {
            r3 = this;
            java.util.List<java.lang.ref.WeakReference<io.realm.internal.OsResults$Iterator>> r0 = r3.iterators
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            io.realm.internal.OsResults$Iterator r1 = (io.realm.internal.OsResults.Iterator) r1
            if (r1 == 0) goto L6
            r2 = 0
            r1.iteratorOsResults = r2
            goto L6
        L1e:
            java.util.List<java.lang.ref.WeakReference<io.realm.internal.OsResults$Iterator>> r0 = r3.iterators
            r0.clear()
            return
    }

    public boolean isAutoRefresh() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeIsAutoRefresh(r0)
            return r0
    }

    public boolean isClosed() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeIsClosed(r0)
            return r0
    }

    public boolean isEmpty() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeIsEmpty(r0)
            return r0
    }

    public boolean isFrozen() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeIsFrozen(r0)
            return r0
    }

    public boolean isInTransaction() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeIsInTransaction(r0)
            return r0
    }

    public boolean isSyncRealm() {
            r1 = this;
            io.realm.internal.OsRealmConfig r0 = r1.osRealmConfig
            java.net.URI r0 = r0.getResolvedRealmURI()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public void refresh() {
            r2 = this;
            boolean r0 = r2.isFrozen()
            if (r0 != 0) goto Lc
            long r0 = r2.nativePtr
            nativeRefresh(r0)
            return
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "It is not possible to refresh frozen Realms."
            r0.<init>(r1)
            throw r0
    }

    public void registerSchemaChangedCallback(io.realm.internal.OsSharedRealm.SchemaChangedCallback r3) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeRegisterSchemaChangedCallback(r0, r3)
            return
    }

    public void removePendingRow(io.realm.internal.PendingRow r4) {
            r3 = this;
            java.util.List<java.lang.ref.WeakReference<io.realm.internal.PendingRow>> r0 = r3.pendingRows
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            io.realm.internal.PendingRow r2 = (io.realm.internal.PendingRow) r2
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L6
        L1c:
            java.util.List<java.lang.ref.WeakReference<io.realm.internal.PendingRow>> r2 = r3.pendingRows
            r2.remove(r1)
            goto L6
        L22:
            return
    }

    public void renameTable(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            long r0 = r2.nativePtr
            nativeRenameTable(r0, r3, r4)
            return
    }

    public void setAutoRefresh(boolean r3) {
            r2 = this;
            io.realm.internal.Capabilities r0 = r2.capabilities
            r1 = 0
            r0.checkCanDeliverNotification(r1)
            long r0 = r2.nativePtr
            nativeSetAutoRefresh(r0, r3)
            return
    }

    public long size() {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeSize(r0)
            return r0
    }

    public void stopWaitForChange() {
            r2 = this;
            long r0 = r2.nativePtr
            nativeStopWaitForChange(r0)
            return
    }

    public boolean waitForChange() {
            r2 = this;
            long r0 = r2.nativePtr
            boolean r0 = nativeWaitForChange(r0)
            return r0
    }

    public void writeCopy(java.io.File r3, @javax.annotation.Nullable byte[] r4) {
            r2 = this;
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L15
            boolean r0 = r3.exists()
            if (r0 != 0) goto Ld
            goto L15
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The destination file must not exist"
            r3.<init>(r4)
            throw r3
        L15:
            boolean r0 = r2.isSyncRealm()
            if (r0 == 0) goto L21
            java.lang.String r0 = "writeCopyTo() cannot be called from the main thread when using synchronized Realms."
            io.realm.internal.Util.checkNotOnMainThread(r0)
        L21:
            long r0 = r2.nativePtr     // Catch: java.lang.RuntimeException -> L2b
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.RuntimeException -> L2b
            nativeWriteCopy(r0, r3, r4)     // Catch: java.lang.RuntimeException -> L2b
            return
        L2b:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            java.lang.String r0 = "Could not write file as not all client changes are integrated in server"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L3e
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r4)
            throw r3
        L3e:
            throw r3
    }
}
