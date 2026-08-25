package io.realm;

/* JADX INFO: loaded from: classes.dex */
public class DynamicRealm extends io.realm.BaseRealm {
    private final io.realm.RealmSchema schema;


    /* JADX INFO: renamed from: io.realm.DynamicRealm$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public class AnonymousClass2 implements java.lang.Runnable {
        public final /* synthetic */ io.realm.DynamicRealm this$0;
        public final /* synthetic */ boolean val$canDeliverNotification;
        public final /* synthetic */ io.realm.DynamicRealm.Transaction.OnError val$onError;
        public final /* synthetic */ io.realm.DynamicRealm.Transaction.OnSuccess val$onSuccess;
        public final /* synthetic */ io.realm.RealmConfiguration val$realmConfiguration;
        public final /* synthetic */ io.realm.internal.RealmNotifier val$realmNotifier;
        public final /* synthetic */ io.realm.DynamicRealm.Transaction val$transaction;



        public AnonymousClass2(io.realm.DynamicRealm r1, io.realm.RealmConfiguration r2, io.realm.DynamicRealm.Transaction r3, boolean r4, io.realm.DynamicRealm.Transaction.OnSuccess r5, io.realm.internal.RealmNotifier r6, io.realm.DynamicRealm.Transaction.OnError r7) {
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
                io.realm.DynamicRealm r0 = io.realm.DynamicRealm.getInstance(r0)
                r0.beginTransaction()
                r1 = 0
                io.realm.DynamicRealm$Transaction r2 = r5.val$transaction     // Catch: java.lang.Throwable -> L51
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
                io.realm.DynamicRealm$Transaction$OnSuccess r0 = r5.val$onSuccess
                if (r0 == 0) goto L76
                io.realm.internal.RealmNotifier r0 = r5.val$realmNotifier
                io.realm.DynamicRealm$2$1 r1 = new io.realm.DynamicRealm$2$1
                r1.<init>(r5, r2)
                r0.post(r1)
                goto L85
            L76:
                if (r1 == 0) goto L85
                io.realm.internal.RealmNotifier r0 = r5.val$realmNotifier
                io.realm.DynamicRealm$2$2 r2 = new io.realm.DynamicRealm$2$2
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

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class Callback extends io.realm.BaseRealm.InstanceCallback<io.realm.DynamicRealm> {
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
                io.realm.DynamicRealm r1 = (io.realm.DynamicRealm) r1
                r0.onSuccess(r1)
                return
        }

        public abstract void onSuccess(io.realm.DynamicRealm r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface Transaction {

        /* JADX INFO: loaded from: classes.dex */
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

        /* JADX INFO: loaded from: classes2.dex */
        public interface OnError {
            void onError(java.lang.Throwable r1);
        }

        /* JADX INFO: loaded from: classes2.dex */
        public interface OnSuccess {
            void onSuccess();
        }

        void execute(io.realm.DynamicRealm r1);
    }

    private DynamicRealm(io.realm.RealmCache r2, io.realm.internal.OsSharedRealm.VersionID r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            io.realm.RealmConfiguration r3 = r2.getConfiguration()
            io.realm.DynamicRealm$1 r0 = new io.realm.DynamicRealm$1
            r0.<init>(r1, r2)
            io.realm.RealmCache.invokeWithGlobalRefCount(r3, r0)
            io.realm.MutableRealmSchema r2 = new io.realm.MutableRealmSchema
            r2.<init>(r1)
            r1.schema = r2
            return
    }

    private DynamicRealm(io.realm.internal.OsSharedRealm r1) {
            r0 = this;
            r0.<init>(r1)
            io.realm.MutableRealmSchema r1 = new io.realm.MutableRealmSchema
            r1.<init>(r0)
            r0.schema = r1
            return
    }

    public static io.realm.DynamicRealm createInstance(io.realm.RealmCache r1, io.realm.internal.OsSharedRealm.VersionID r2) {
            io.realm.DynamicRealm r0 = new io.realm.DynamicRealm
            r0.<init>(r1, r2)
            return r0
    }

    public static io.realm.DynamicRealm createInstance(io.realm.internal.OsSharedRealm r1) {
            io.realm.DynamicRealm r0 = new io.realm.DynamicRealm
            r0.<init>(r1)
            return r0
    }

    public static io.realm.DynamicRealm getInstance(io.realm.RealmConfiguration r1) {
            if (r1 == 0) goto Lb
            java.lang.Class<io.realm.DynamicRealm> r0 = io.realm.DynamicRealm.class
            io.realm.BaseRealm r1 = io.realm.RealmCache.createRealmOrGetFromCache(r1, r0)
            io.realm.DynamicRealm r1 = (io.realm.DynamicRealm) r1
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A non-null RealmConfiguration must be provided"
            r1.<init>(r0)
            throw r1
    }

    public static io.realm.RealmAsyncTask getInstanceAsync(io.realm.RealmConfiguration r1, io.realm.DynamicRealm.Callback r2) {
            if (r1 == 0) goto L9
            java.lang.Class<io.realm.DynamicRealm> r0 = io.realm.DynamicRealm.class
            io.realm.RealmAsyncTask r1 = io.realm.RealmCache.createRealmOrGetFromCacheAsync(r1, r2, r0)
            return r1
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "A non-null RealmConfiguration must be provided"
            r1.<init>(r2)
            throw r1
    }

    public void addChangeListener(io.realm.RealmChangeListener<io.realm.DynamicRealm> r1) {
            r0 = this;
            r0.addListener(r1)
            return
    }

    @Override // io.realm.BaseRealm
    public io.reactivex.Flowable<io.realm.DynamicRealm> asFlowable() {
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

    public io.realm.DynamicRealmObject createEmbeddedObject(java.lang.String r11, io.realm.DynamicRealmObject r12, java.lang.String r13) {
            r10 = this;
            r10.checkIfValid()
            java.lang.String r0 = "parentObject"
            io.realm.internal.Util.checkNull(r12, r0)
            java.lang.String r0 = "parentProperty"
            io.realm.internal.Util.checkEmpty(r13, r0)
            boolean r0 = io.realm.RealmObject.isManaged(r12)
            if (r0 == 0) goto L64
            boolean r0 = io.realm.RealmObject.isValid(r12)
            if (r0 == 0) goto L64
            io.realm.internal.OsSharedRealm r0 = r10.sharedRealm
            java.lang.String r0 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r0, r11)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L4f
            java.lang.String r0 = r12.getType()
            io.realm.RealmSchema r3 = r10.schema
            io.realm.RealmObjectSchema r9 = r3.get(r0)
            if (r9 == 0) goto L3f
            io.realm.RealmSchema r8 = r10.schema
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            io.realm.internal.Row r11 = r4.getEmbeddedObjectRow(r5, r6, r7, r8, r9)
            io.realm.DynamicRealmObject r12 = new io.realm.DynamicRealmObject
            r12.<init>(r10, r11)
            return r12
        L3f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r0
            java.lang.String r13 = "No schema found for '%s'."
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r11.<init>(r12)
            throw r11
        L4f:
            io.realm.exceptions.RealmException r12 = new io.realm.exceptions.RealmException
            java.util.Locale r13 = java.util.Locale.US
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r11
            r3[r1] = r0
            java.lang.String r11 = "'%s' has a primary key field '%s', embedded objects cannot have primary keys."
            java.lang.String r11 = java.lang.String.format(r13, r11, r3)
            r12.<init>(r11)
            throw r12
        L64:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Only valid, managed objects can be a parent to an embedded object."
            r11.<init>(r12)
            throw r11
    }

    public io.realm.DynamicRealmObject createObject(java.lang.String r6) {
            r5 = this;
            r5.checkIfValid()
            io.realm.RealmSchema r0 = r5.schema
            io.realm.internal.Table r0 = r0.getTable(r6)
            io.realm.internal.OsSharedRealm r1 = r5.sharedRealm
            java.lang.String r1 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r1, r6)
            if (r1 != 0) goto L1f
            io.realm.DynamicRealmObject r6 = new io.realm.DynamicRealmObject
            io.realm.internal.UncheckedRow r0 = io.realm.internal.OsObject.create(r0)
            io.realm.internal.CheckedRow r0 = io.realm.internal.CheckedRow.getFromRow(r0)
            r6.<init>(r5, r0)
            return r6
        L1f:
            io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
            java.util.Locale r2 = java.util.Locale.US
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r6
            r6 = 1
            r3[r6] = r1
            java.lang.String r6 = "'%s' has a primary key field '%s', use  'createObject(String, Object)' instead."
            java.lang.String r6 = java.lang.String.format(r2, r6, r3)
            r0.<init>(r6)
            throw r0
    }

    public io.realm.DynamicRealmObject createObject(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            io.realm.RealmSchema r0 = r1.schema
            io.realm.internal.Table r2 = r0.getTable(r2)
            io.realm.DynamicRealmObject r0 = new io.realm.DynamicRealmObject
            io.realm.internal.UncheckedRow r2 = io.realm.internal.OsObject.createWithPrimaryKey(r2, r3)
            io.realm.internal.CheckedRow r2 = io.realm.internal.CheckedRow.getFromRow(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public void delete(java.lang.String r2) {
            r1 = this;
            r1.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            boolean r0 = r0.isInTransaction()
            if (r0 == 0) goto L15
            io.realm.RealmSchema r0 = r1.schema
            io.realm.internal.Table r2 = r0.getTable(r2)
            r2.clear()
            return
        L15:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Changing Realm data can only be done from inside a transaction."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void deleteAll() {
            r0 = this;
            super.deleteAll()
            return
    }

    public void executeTransaction(io.realm.DynamicRealm.Transaction r3) {
            r2 = this;
            if (r3 == 0) goto L23
            r2.checkAllowWritesOnUiThread()
            r2.beginTransaction()
            r3.execute(r2)     // Catch: java.lang.RuntimeException -> Lf
            r2.commitTransaction()     // Catch: java.lang.RuntimeException -> Lf
            return
        Lf:
            r3 = move-exception
            boolean r0 = r2.isInTransaction()
            if (r0 == 0) goto L1a
            r2.cancelTransaction()
            goto L22
        L1a:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Could not cancel transaction, not currently in a transaction."
            io.realm.log.RealmLog.warn(r1, r0)
        L22:
            throw r3
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Transaction should not be null"
            r3.<init>(r0)
            throw r3
    }

    public io.realm.RealmAsyncTask executeTransactionAsync(io.realm.DynamicRealm.Transaction r2) {
            r1 = this;
            r0 = 0
            io.realm.RealmAsyncTask r2 = r1.executeTransactionAsync(r2, r0, r0)
            return r2
    }

    public io.realm.RealmAsyncTask executeTransactionAsync(io.realm.DynamicRealm.Transaction r2, io.realm.DynamicRealm.Transaction.OnError r3) {
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

    public io.realm.RealmAsyncTask executeTransactionAsync(io.realm.DynamicRealm.Transaction r2, io.realm.DynamicRealm.Transaction.OnSuccess r3) {
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

    public io.realm.RealmAsyncTask executeTransactionAsync(io.realm.DynamicRealm.Transaction r11, @javax.annotation.Nullable io.realm.DynamicRealm.Transaction.OnSuccess r12, @javax.annotation.Nullable io.realm.DynamicRealm.Transaction.OnError r13) {
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
            io.realm.DynamicRealm$2 r9 = new io.realm.DynamicRealm$2
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
            io.realm.DynamicRealm r0 = r1.freeze()
            return r0
    }

    @Override // io.realm.BaseRealm
    public io.realm.DynamicRealm freeze() {
            r3 = this;
            io.realm.internal.OsSharedRealm r0 = r3.sharedRealm     // Catch: java.lang.IllegalStateException -> L7
            io.realm.internal.OsSharedRealm$VersionID r0 = r0.getVersionID()     // Catch: java.lang.IllegalStateException -> L7
            goto L10
        L7:
            r3.getVersion()
            io.realm.internal.OsSharedRealm r0 = r3.sharedRealm
            io.realm.internal.OsSharedRealm$VersionID r0 = r0.getVersionID()
        L10:
            io.realm.RealmConfiguration r1 = r3.configuration
            java.lang.Class<io.realm.DynamicRealm> r2 = io.realm.DynamicRealm.class
            io.realm.BaseRealm r0 = io.realm.RealmCache.createRealmOrGetFromCache(r1, r2, r0)
            io.realm.DynamicRealm r0 = (io.realm.DynamicRealm) r0
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

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ long getVersion() {
            r2 = this;
            long r0 = super.getVersion()
            return r0
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
            r1 = this;
            r1.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            boolean r0 = r0.isEmpty()
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

    public void removeChangeListener(io.realm.RealmChangeListener<io.realm.DynamicRealm> r1) {
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

    public io.realm.RealmQuery<io.realm.DynamicRealmObject> where(java.lang.String r3) {
            r2 = this;
            r2.checkIfValid()
            io.realm.internal.OsSharedRealm r0 = r2.sharedRealm
            java.lang.String r1 = io.realm.internal.Table.getTableNameForClass(r3)
            boolean r0 = r0.hasTable(r1)
            if (r0 == 0) goto L14
            io.realm.RealmQuery r3 = io.realm.RealmQuery.createDynamicQuery(r2, r3)
            return r3
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Class does not exist in the Realm and cannot be queried: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3)
            throw r0
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
