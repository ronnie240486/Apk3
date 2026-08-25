package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public class RealmConfiguration {
    private static final java.lang.Object DEFAULT_MODULE = null;
    public static final io.realm.internal.RealmProxyMediator DEFAULT_MODULE_MEDIATOR = null;
    public static final java.lang.String DEFAULT_REALM_NAME = "default.realm";
    private final boolean allowQueriesOnUiThread;
    private final boolean allowWritesOnUiThread;
    private final java.lang.String assetFilePath;
    private final java.lang.String canonicalPath;
    private final io.realm.CompactOnLaunchCallback compactOnLaunch;
    private final boolean deleteRealmIfMigrationNeeded;
    private final io.realm.internal.OsRealmConfig.Durability durability;
    private final io.realm.coroutines.FlowFactory flowFactory;
    private final io.realm.Realm.Transaction initialDataTransaction;
    private final boolean isRecoveryConfiguration;
    private final byte[] key;
    private final long maxNumberOfActiveVersions;
    private final io.realm.RealmMigration migration;
    private final boolean readOnly;
    private final java.io.File realmDirectory;
    private final java.lang.String realmFileName;
    private final io.realm.rx.RxObservableFactory rxObservableFactory;
    private final io.realm.internal.RealmProxyMediator schemaMediator;
    private final long schemaVersion;

    public static class Builder {
        private boolean allowQueriesOnUiThread;
        private boolean allowWritesOnUiThread;
        private java.lang.String assetFilePath;
        private io.realm.CompactOnLaunchCallback compactOnLaunch;
        private java.util.HashSet<java.lang.Class<? extends io.realm.RealmModel>> debugSchema;
        private boolean deleteRealmIfMigrationNeeded;
        private java.io.File directory;
        private io.realm.internal.OsRealmConfig.Durability durability;
        private boolean excludeDebugSchema;
        private java.lang.String fileName;

        @javax.annotation.Nullable
        private io.realm.coroutines.FlowFactory flowFactory;
        private io.realm.Realm.Transaction initialDataTransaction;
        private byte[] key;
        private long maxNumberOfActiveVersions;
        private io.realm.RealmMigration migration;
        private java.util.HashSet<java.lang.Object> modules;
        private boolean readOnly;

        @javax.annotation.Nullable
        private io.realm.rx.RxObservableFactory rxFactory;
        private long schemaVersion;

        public Builder() {
                r1 = this;
                android.content.Context r0 = io.realm.BaseRealm.applicationContext
                r1.<init>(r0)
                return
        }

        public Builder(android.content.Context r3) {
                r2 = this;
                r2.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r2.modules = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r2.debugSchema = r0
                r0 = 0
                r2.excludeDebugSchema = r0
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.maxNumberOfActiveVersions = r0
                if (r3 == 0) goto L24
                io.realm.internal.RealmCore.loadLibrary(r3)
                r2.initializeBuilder(r3)
                return
            L24:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "Call `Realm.init(Context)` before creating a RealmConfiguration"
                r3.<init>(r0)
                throw r3
        }

        private void checkModule(java.lang.Object r3) {
                r2 = this;
                java.lang.Class r0 = r3.getClass()
                java.lang.Class<io.realm.annotations.RealmModule> r1 = io.realm.annotations.RealmModule.class
                boolean r0 = r0.isAnnotationPresent(r1)
                if (r0 == 0) goto Ld
                return
            Ld:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.Class r3 = r3.getClass()
                java.lang.String r3 = r3.getCanonicalName()
                r1.append(r3)
                java.lang.String r3 = " is not a RealmModule. Add @RealmModule to the class definition."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        private void initializeBuilder(android.content.Context r3) {
                r2 = this;
                java.io.File r3 = r3.getFilesDir()
                r2.directory = r3
                java.lang.String r3 = "default.realm"
                r2.fileName = r3
                r3 = 0
                r2.key = r3
                r0 = 0
                r2.schemaVersion = r0
                r2.migration = r3
                r0 = 0
                r2.deleteRealmIfMigrationNeeded = r0
                io.realm.internal.OsRealmConfig$Durability r1 = io.realm.internal.OsRealmConfig.Durability.FULL
                r2.durability = r1
                r2.readOnly = r0
                r2.compactOnLaunch = r3
                java.lang.Object r3 = io.realm.RealmConfiguration.access$000()
                if (r3 == 0) goto L2d
                java.util.HashSet<java.lang.Object> r3 = r2.modules
                java.lang.Object r1 = io.realm.RealmConfiguration.access$000()
                r3.add(r1)
            L2d:
                r2.allowWritesOnUiThread = r0
                r3 = 1
                r2.allowQueriesOnUiThread = r3
                return
        }

        public final io.realm.RealmConfiguration.Builder addModule(java.lang.Object r2) {
                r1 = this;
                if (r2 == 0) goto La
                r1.checkModule(r2)
                java.util.HashSet<java.lang.Object> r0 = r1.modules
                r0.add(r2)
            La:
                return r1
        }

        public io.realm.RealmConfiguration.Builder allowQueriesOnUiThread(boolean r1) {
                r0 = this;
                r0.allowQueriesOnUiThread = r1
                return r0
        }

        public io.realm.RealmConfiguration.Builder allowWritesOnUiThread(boolean r1) {
                r0 = this;
                r0.allowWritesOnUiThread = r1
                return r0
        }

        public io.realm.RealmConfiguration.Builder assetFile(java.lang.String r3) {
                r2 = this;
                boolean r0 = io.realm.internal.Util.isEmptyString(r3)
                if (r0 != 0) goto L23
                io.realm.internal.OsRealmConfig$Durability r0 = r2.durability
                io.realm.internal.OsRealmConfig$Durability r1 = io.realm.internal.OsRealmConfig.Durability.MEM_ONLY
                if (r0 == r1) goto L1b
                boolean r0 = r2.deleteRealmIfMigrationNeeded
                if (r0 != 0) goto L13
                r2.assetFilePath = r3
                return r2
            L13:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "Realm cannot use an asset file when previously configured to clear its schema in migration by calling deleteRealmIfMigrationNeeded()."
                r3.<init>(r0)
                throw r3
            L1b:
                io.realm.exceptions.RealmException r3 = new io.realm.exceptions.RealmException
                java.lang.String r0 = "Realm can not use in-memory configuration if asset file is present."
                r3.<init>(r0)
                throw r3
            L23:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "A non-empty asset file path must be provided"
                r3.<init>(r0)
                throw r3
        }

        public io.realm.RealmConfiguration build() {
                r23 = this;
                r0 = r23
                boolean r1 = r0.readOnly
                if (r1 == 0) goto L37
                io.realm.Realm$Transaction r1 = r0.initialDataTransaction
                if (r1 != 0) goto L2f
                java.lang.String r1 = r0.assetFilePath
                if (r1 == 0) goto L27
                boolean r1 = r0.deleteRealmIfMigrationNeeded
                if (r1 != 0) goto L1f
                io.realm.CompactOnLaunchCallback r1 = r0.compactOnLaunch
                if (r1 != 0) goto L17
                goto L37
            L17:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "'compactOnLaunch()' and read-only Realms cannot be combined"
                r1.<init>(r2)
                throw r1
            L1f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "'deleteRealmIfMigrationNeeded()' and read-only Realms cannot be combined"
                r1.<init>(r2)
                throw r1
            L27:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Only Realms provided using 'assetFile(path)' can be marked read-only. No such Realm was provided."
                r1.<init>(r2)
                throw r1
            L2f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "This Realm is marked as read-only. Read-only Realms cannot use initialData(Realm.Transaction)."
                r1.<init>(r2)
                throw r1
            L37:
                io.realm.rx.RxObservableFactory r1 = r0.rxFactory
                if (r1 != 0) goto L49
                boolean r1 = io.realm.internal.Util.isRxJavaAvailable()
                if (r1 == 0) goto L49
                io.realm.rx.RealmObservableFactory r1 = new io.realm.rx.RealmObservableFactory
                r2 = 1
                r1.<init>(r2)
                r0.rxFactory = r1
            L49:
                io.realm.coroutines.FlowFactory r1 = r0.flowFactory
                if (r1 != 0) goto L5c
                boolean r1 = io.realm.internal.Util.isCoroutinesAvailable()
                if (r1 == 0) goto L5c
                io.realm.coroutines.RealmFlowFactory r1 = new io.realm.coroutines.RealmFlowFactory
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r1.<init>(r2)
                r0.flowFactory = r1
            L5c:
                io.realm.RealmConfiguration r1 = new io.realm.RealmConfiguration
                r3 = r1
                java.io.File r2 = new java.io.File
                r4 = r2
                java.io.File r5 = r0.directory
                java.lang.String r6 = r0.fileName
                r2.<init>(r5, r6)
                java.lang.String r5 = r0.assetFilePath
                byte[] r6 = r0.key
                long r7 = r0.schemaVersion
                io.realm.RealmMigration r9 = r0.migration
                boolean r10 = r0.deleteRealmIfMigrationNeeded
                io.realm.internal.OsRealmConfig$Durability r11 = r0.durability
                java.util.HashSet<java.lang.Object> r2 = r0.modules
                java.util.HashSet<java.lang.Class<? extends io.realm.RealmModel>> r12 = r0.debugSchema
                boolean r13 = r0.excludeDebugSchema
                io.realm.internal.RealmProxyMediator r12 = io.realm.RealmConfiguration.createSchemaMediator(r2, r12, r13)
                io.realm.rx.RxObservableFactory r13 = r0.rxFactory
                io.realm.coroutines.FlowFactory r14 = r0.flowFactory
                io.realm.Realm$Transaction r15 = r0.initialDataTransaction
                boolean r2 = r0.readOnly
                r16 = r2
                io.realm.CompactOnLaunchCallback r2 = r0.compactOnLaunch
                r17 = r2
                r22 = r1
                long r1 = r0.maxNumberOfActiveVersions
                r18 = r1
                boolean r1 = r0.allowWritesOnUiThread
                r20 = r1
                boolean r1 = r0.allowQueriesOnUiThread
                r21 = r1
                r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21)
                return r22
        }

        public io.realm.RealmConfiguration.Builder compactOnLaunch() {
                r1 = this;
                io.realm.DefaultCompactOnLaunchCallback r0 = new io.realm.DefaultCompactOnLaunchCallback
                r0.<init>()
                io.realm.RealmConfiguration$Builder r0 = r1.compactOnLaunch(r0)
                return r0
        }

        public io.realm.RealmConfiguration.Builder compactOnLaunch(io.realm.CompactOnLaunchCallback r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.compactOnLaunch = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "A non-null compactOnLaunch must be provided"
                r2.<init>(r0)
                throw r2
        }

        public io.realm.RealmConfiguration.Builder deleteRealmIfMigrationNeeded() {
                r2 = this;
                java.lang.String r0 = r2.assetFilePath
                if (r0 == 0) goto L13
                int r0 = r0.length()
                if (r0 != 0) goto Lb
                goto L13
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Realm cannot clear its schema when previously configured to use an asset file by calling assetFile()."
                r0.<init>(r1)
                throw r0
            L13:
                r0 = 1
                r2.deleteRealmIfMigrationNeeded = r0
                return r2
        }

        public io.realm.RealmConfiguration.Builder directory(java.io.File r4) {
                r3 = this;
                if (r4 == 0) goto L6e
                boolean r0 = r4.isFile()
                java.lang.String r1 = "."
                if (r0 != 0) goto L54
                boolean r0 = r4.exists()
                if (r0 != 0) goto L31
                boolean r0 = r4.mkdirs()
                if (r0 == 0) goto L17
                goto L31
            L17:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Could not create the specified directory: "
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                java.lang.String r4 = r4.getAbsolutePath()
                r2.append(r4)
                r2.append(r1)
                java.lang.String r4 = r2.toString()
                r0.<init>(r4)
                throw r0
            L31:
                boolean r0 = r4.canWrite()
                if (r0 == 0) goto L3a
                r3.directory = r4
                return r3
            L3a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Realm directory is not writable: "
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                java.lang.String r4 = r4.getAbsolutePath()
                r2.append(r4)
                r2.append(r1)
                java.lang.String r4 = r2.toString()
                r0.<init>(r4)
                throw r0
            L54:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "'dir' is a file, not a directory: "
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                java.lang.String r4 = r4.getAbsolutePath()
                r2.append(r4)
                r2.append(r1)
                java.lang.String r4 = r2.toString()
                r0.<init>(r4)
                throw r0
            L6e:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Non-null 'dir' required."
                r4.<init>(r0)
                throw r4
        }

        public io.realm.RealmConfiguration.Builder encryptionKey(byte[] r6) {
                r5 = this;
                if (r6 == 0) goto L2f
                int r0 = r6.length
                r1 = 64
                if (r0 != r1) goto Lf
                int r0 = r6.length
                byte[] r6 = java.util.Arrays.copyOf(r6, r0)
                r5.key = r6
                return r5
            Lf:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.util.Locale r2 = java.util.Locale.US
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3[r4] = r1
                r1 = 1
                int r6 = r6.length
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r3[r1] = r6
                java.lang.String r6 = "The provided key must be %s bytes. Yours was: %s"
                java.lang.String r6 = java.lang.String.format(r2, r6, r3)
                r0.<init>(r6)
                throw r0
            L2f:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "A non-null key must be provided"
                r6.<init>(r0)
                throw r6
        }

        public io.realm.RealmConfiguration.Builder flowFactory(@javax.annotation.Nonnull io.realm.coroutines.FlowFactory r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.flowFactory = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The provided Flow factory must not be null."
                r2.<init>(r0)
                throw r2
        }

        public io.realm.RealmConfiguration.Builder inMemory() {
                r2 = this;
                java.lang.String r0 = r2.assetFilePath
                boolean r0 = io.realm.internal.Util.isEmptyString(r0)
                if (r0 == 0) goto Ld
                io.realm.internal.OsRealmConfig$Durability r0 = io.realm.internal.OsRealmConfig.Durability.MEM_ONLY
                r2.durability = r0
                return r2
            Ld:
                io.realm.exceptions.RealmException r0 = new io.realm.exceptions.RealmException
                java.lang.String r1 = "Realm can not use in-memory configuration if asset file is present."
                r0.<init>(r1)
                throw r0
        }

        public io.realm.RealmConfiguration.Builder initialData(io.realm.Realm.Transaction r1) {
                r0 = this;
                r0.initialDataTransaction = r1
                return r0
        }

        public io.realm.RealmConfiguration.Builder maxNumberOfActiveVersions(long r4) {
                r3 = this;
                r0 = 1
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L9
                r3.maxNumberOfActiveVersions = r4
                return r3
            L9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Only positive numbers above 0 are allowed. Yours was: "
                java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4)
                r0.<init>(r4)
                throw r0
        }

        public io.realm.RealmConfiguration.Builder migration(io.realm.RealmMigration r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.migration = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "A non-null migration must be provided"
                r2.<init>(r0)
                throw r2
        }

        public io.realm.RealmConfiguration.Builder modules(java.lang.Object r2, java.lang.Object... r3) {
                r1 = this;
                java.util.HashSet<java.lang.Object> r0 = r1.modules
                r0.clear()
                r1.addModule(r2)
                if (r3 == 0) goto L16
                r2 = 0
            Lb:
                int r0 = r3.length
                if (r2 >= r0) goto L16
                r0 = r3[r2]
                r1.addModule(r0)
                int r2 = r2 + 1
                goto Lb
            L16:
                return r1
        }

        public io.realm.RealmConfiguration.Builder name(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto Lb
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto Lb
                r1.fileName = r2
                return r1
            Lb:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "A non-empty filename must be provided"
                r2.<init>(r0)
                throw r2
        }

        public io.realm.RealmConfiguration.Builder readOnly() {
                r1 = this;
                r0 = 1
                r1.readOnly = r0
                return r1
        }

        public io.realm.RealmConfiguration.Builder rxFactory(@javax.annotation.Nonnull io.realm.rx.RxObservableFactory r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.rxFactory = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The provided Rx Observable factory must not be null."
                r2.<init>(r0)
                throw r2
        }

        public io.realm.RealmConfiguration.Builder schemaVersion(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L9
                r3.schemaVersion = r4
                return r3
            L9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Realm schema version numbers must be 0 (zero) or higher. Yours was: "
                java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4)
                r0.<init>(r4)
                throw r0
        }
    }

    static {
            java.lang.Object r0 = io.realm.Realm.getDefaultModule()
            io.realm.RealmConfiguration.DEFAULT_MODULE = r0
            if (r0 == 0) goto L25
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            io.realm.internal.RealmProxyMediator r0 = getModuleMediator(r0)
            boolean r1 = r0.transformerApplied()
            if (r1 == 0) goto L1d
            io.realm.RealmConfiguration.DEFAULT_MODULE_MEDIATOR = r0
            goto L28
        L1d:
            java.lang.ExceptionInInitializerError r0 = new java.lang.ExceptionInInitializerError
            java.lang.String r1 = "RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://docs.mongodb.com/realm/sdk/android/install/#customize-dependecies-defined-by-the-realm-gradle-plugin"
            r0.<init>(r1)
            throw r0
        L25:
            r0 = 0
            io.realm.RealmConfiguration.DEFAULT_MODULE_MEDIATOR = r0
        L28:
            return
    }

    public RealmConfiguration(java.io.File r4, @javax.annotation.Nullable java.lang.String r5, @javax.annotation.Nullable byte[] r6, long r7, @javax.annotation.Nullable io.realm.RealmMigration r9, boolean r10, io.realm.internal.OsRealmConfig.Durability r11, io.realm.internal.RealmProxyMediator r12, @javax.annotation.Nullable io.realm.rx.RxObservableFactory r13, @javax.annotation.Nullable io.realm.coroutines.FlowFactory r14, @javax.annotation.Nullable io.realm.Realm.Transaction r15, boolean r16, @javax.annotation.Nullable io.realm.CompactOnLaunchCallback r17, long r18, boolean r20, boolean r21) {
            r3 = this;
            r0 = r3
            r3.<init>()
            java.io.File r1 = r4.getParentFile()
            r0.realmDirectory = r1
            java.lang.String r1 = r4.getName()
            r0.realmFileName = r1
            java.lang.String r1 = r4.getAbsolutePath()
            r0.canonicalPath = r1
            r1 = r5
            r0.assetFilePath = r1
            r1 = r6
            r0.key = r1
            r1 = r7
            r0.schemaVersion = r1
            r1 = r9
            r0.migration = r1
            r1 = r10
            r0.deleteRealmIfMigrationNeeded = r1
            r1 = r11
            r0.durability = r1
            r1 = r12
            r0.schemaMediator = r1
            r1 = r13
            r0.rxObservableFactory = r1
            r1 = r14
            r0.flowFactory = r1
            r1 = r15
            r0.initialDataTransaction = r1
            r1 = r16
            r0.readOnly = r1
            r1 = r17
            r0.compactOnLaunch = r1
            r1 = 0
            r0.isRecoveryConfiguration = r1
            r1 = r18
            r0.maxNumberOfActiveVersions = r1
            r1 = r20
            r0.allowWritesOnUiThread = r1
            r1 = r21
            r0.allowQueriesOnUiThread = r1
            return
    }

    public static /* synthetic */ java.lang.Object access$000() {
            java.lang.Object r0 = io.realm.RealmConfiguration.DEFAULT_MODULE
            return r0
    }

    public static io.realm.internal.RealmProxyMediator createSchemaMediator(java.util.Set<java.lang.Object> r2, java.util.Set<java.lang.Class<? extends io.realm.RealmModel>> r3, boolean r4) {
            int r0 = r3.size()
            if (r0 <= 0) goto Le
            io.realm.internal.modules.FilterableMediator r2 = new io.realm.internal.modules.FilterableMediator
            io.realm.internal.RealmProxyMediator r0 = io.realm.RealmConfiguration.DEFAULT_MODULE_MEDIATOR
            r2.<init>(r0, r3, r4)
            return r2
        Le:
            int r3 = r2.size()
            r4 = 1
            if (r3 != r4) goto L2a
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            io.realm.internal.RealmProxyMediator r2 = getModuleMediator(r2)
            return r2
        L2a:
            int r3 = r2.size()
            io.realm.internal.RealmProxyMediator[] r3 = new io.realm.internal.RealmProxyMediator[r3]
            r0 = 0
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r2.next()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            io.realm.internal.RealmProxyMediator r1 = getModuleMediator(r1)
            r3[r0] = r1
            int r0 = r0 + r4
            goto L35
        L4f:
            io.realm.internal.modules.CompositeMediator r2 = new io.realm.internal.modules.CompositeMediator
            r2.<init>(r3)
            return r2
    }

    private static io.realm.internal.RealmProxyMediator getModuleMediator(java.lang.String r5) {
            java.lang.String r0 = "Could not create an instance of "
            java.lang.String r1 = "\\."
            java.lang.String[] r5 = r5.split(r1)
            int r1 = r5.length
            r2 = 1
            int r1 = r1 - r2
            r5 = r5[r1]
            java.util.Locale r1 = java.util.Locale.US
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            java.lang.String r5 = "Mediator"
            r3[r2] = r5
            java.lang.String r5 = "io.realm.%s%s"
            java.lang.String r5 = java.lang.String.format(r1, r5, r3)
            java.lang.Class r1 = java.lang.Class.forName(r5)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L40 java.lang.reflect.InvocationTargetException -> L4b java.lang.ClassNotFoundException -> L56
            java.lang.reflect.Constructor[] r1 = r1.getDeclaredConstructors()     // Catch: java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L40 java.lang.reflect.InvocationTargetException -> L4b java.lang.ClassNotFoundException -> L56
            r1 = r1[r4]     // Catch: java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L40 java.lang.reflect.InvocationTargetException -> L4b java.lang.ClassNotFoundException -> L56
            r1.setAccessible(r2)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L40 java.lang.reflect.InvocationTargetException -> L4b java.lang.ClassNotFoundException -> L56
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L40 java.lang.reflect.InvocationTargetException -> L4b java.lang.ClassNotFoundException -> L56
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L40 java.lang.reflect.InvocationTargetException -> L4b java.lang.ClassNotFoundException -> L56
            io.realm.internal.RealmProxyMediator r1 = (io.realm.internal.RealmProxyMediator) r1     // Catch: java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L40 java.lang.reflect.InvocationTargetException -> L4b java.lang.ClassNotFoundException -> L56
            return r1
        L35:
            r1 = move-exception
            io.realm.exceptions.RealmException r2 = new io.realm.exceptions.RealmException
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5)
            r2.<init>(r5, r1)
            throw r2
        L40:
            r1 = move-exception
            io.realm.exceptions.RealmException r2 = new io.realm.exceptions.RealmException
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5)
            r2.<init>(r5, r1)
            throw r2
        L4b:
            r1 = move-exception
            io.realm.exceptions.RealmException r2 = new io.realm.exceptions.RealmException
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5)
            r2.<init>(r5, r1)
            throw r2
        L56:
            r0 = move-exception
            io.realm.exceptions.RealmException r1 = new io.realm.exceptions.RealmException
            java.lang.String r2 = "Could not find "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r5)
            r1.<init>(r5, r0)
            throw r1
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto Le4
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L13
            goto Le4
        L13:
            io.realm.RealmConfiguration r8 = (io.realm.RealmConfiguration) r8
            long r2 = r7.schemaVersion
            long r4 = r8.schemaVersion
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1e
            return r1
        L1e:
            boolean r2 = r7.deleteRealmIfMigrationNeeded
            boolean r3 = r8.deleteRealmIfMigrationNeeded
            if (r2 == r3) goto L25
            return r1
        L25:
            boolean r2 = r7.readOnly
            boolean r3 = r8.readOnly
            if (r2 == r3) goto L2c
            return r1
        L2c:
            boolean r2 = r7.isRecoveryConfiguration
            boolean r3 = r8.isRecoveryConfiguration
            if (r2 == r3) goto L33
            return r1
        L33:
            java.io.File r2 = r7.realmDirectory
            if (r2 == 0) goto L40
            java.io.File r3 = r8.realmDirectory
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L45
            goto L44
        L40:
            java.io.File r2 = r8.realmDirectory
            if (r2 == 0) goto L45
        L44:
            return r1
        L45:
            java.lang.String r2 = r7.realmFileName
            if (r2 == 0) goto L52
            java.lang.String r3 = r8.realmFileName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L57
            goto L56
        L52:
            java.lang.String r2 = r8.realmFileName
            if (r2 == 0) goto L57
        L56:
            return r1
        L57:
            java.lang.String r2 = r7.canonicalPath
            java.lang.String r3 = r8.canonicalPath
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L62
            return r1
        L62:
            java.lang.String r2 = r7.assetFilePath
            if (r2 == 0) goto L6f
            java.lang.String r3 = r8.assetFilePath
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L74
            goto L73
        L6f:
            java.lang.String r2 = r8.assetFilePath
            if (r2 == 0) goto L74
        L73:
            return r1
        L74:
            byte[] r2 = r7.key
            byte[] r3 = r8.key
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L7f
            return r1
        L7f:
            io.realm.RealmMigration r2 = r7.migration
            if (r2 == 0) goto L8c
            io.realm.RealmMigration r3 = r8.migration
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L91
            goto L90
        L8c:
            io.realm.RealmMigration r2 = r8.migration
            if (r2 == 0) goto L91
        L90:
            return r1
        L91:
            io.realm.internal.OsRealmConfig$Durability r2 = r7.durability
            io.realm.internal.OsRealmConfig$Durability r3 = r8.durability
            if (r2 == r3) goto L98
            return r1
        L98:
            io.realm.internal.RealmProxyMediator r2 = r7.schemaMediator
            io.realm.internal.RealmProxyMediator r3 = r8.schemaMediator
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La3
            return r1
        La3:
            io.realm.rx.RxObservableFactory r2 = r7.rxObservableFactory
            if (r2 == 0) goto Lb0
            io.realm.rx.RxObservableFactory r3 = r8.rxObservableFactory
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lb5
            goto Lb4
        Lb0:
            io.realm.rx.RxObservableFactory r2 = r8.rxObservableFactory
            if (r2 == 0) goto Lb5
        Lb4:
            return r1
        Lb5:
            io.realm.Realm$Transaction r2 = r7.initialDataTransaction
            if (r2 == 0) goto Lc2
            io.realm.Realm$Transaction r3 = r8.initialDataTransaction
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc7
            goto Lc6
        Lc2:
            io.realm.Realm$Transaction r2 = r8.initialDataTransaction
            if (r2 == 0) goto Lc7
        Lc6:
            return r1
        Lc7:
            io.realm.CompactOnLaunchCallback r2 = r7.compactOnLaunch
            if (r2 == 0) goto Ld4
            io.realm.CompactOnLaunchCallback r3 = r8.compactOnLaunch
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Ld9
            goto Ld8
        Ld4:
            io.realm.CompactOnLaunchCallback r2 = r8.compactOnLaunch
            if (r2 == 0) goto Ld9
        Ld8:
            return r1
        Ld9:
            long r2 = r7.maxNumberOfActiveVersions
            long r4 = r8.maxNumberOfActiveVersions
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto Le2
            goto Le3
        Le2:
            r0 = 0
        Le3:
            return r0
        Le4:
            return r1
    }

    @javax.annotation.Nullable
    public java.lang.String getAssetFilePath() {
            r1 = this;
            java.lang.String r0 = r1.assetFilePath
            return r0
    }

    public io.realm.CompactOnLaunchCallback getCompactOnLaunchCallback() {
            r1 = this;
            io.realm.CompactOnLaunchCallback r0 = r1.compactOnLaunch
            return r0
    }

    public io.realm.internal.OsRealmConfig.Durability getDurability() {
            r1 = this;
            io.realm.internal.OsRealmConfig$Durability r0 = r1.durability
            return r0
    }

    public byte[] getEncryptionKey() {
            r2 = this;
            byte[] r0 = r2.key
            if (r0 != 0) goto L6
            r0 = 0
            goto Lb
        L6:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
        Lb:
            return r0
    }

    public io.realm.coroutines.FlowFactory getFlowFactory() {
            r2 = this;
            io.realm.coroutines.FlowFactory r0 = r2.flowFactory
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "The coroutines framework is missing from the classpath. Remember to add it as an implementation dependency. See https://github.com/Kotlin/kotlinx.coroutines#android for more details"
            r0.<init>(r1)
            throw r0
    }

    public final io.realm.Realm.Transaction getInitialDataTransaction() {
            r1 = this;
            io.realm.Realm$Transaction r0 = r1.initialDataTransaction
            return r0
    }

    public long getMaxNumberOfActiveVersions() {
            r2 = this;
            long r0 = r2.maxNumberOfActiveVersions
            return r0
    }

    public io.realm.RealmMigration getMigration() {
            r1 = this;
            io.realm.RealmMigration r0 = r1.migration
            return r0
    }

    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.canonicalPath
            return r0
    }

    public java.io.File getRealmDirectory() {
            r1 = this;
            java.io.File r0 = r1.realmDirectory
            return r0
    }

    public java.lang.String getRealmFileName() {
            r1 = this;
            java.lang.String r0 = r1.realmFileName
            return r0
    }

    public java.util.Set<java.lang.Class<? extends io.realm.RealmModel>> getRealmObjectClasses() {
            r1 = this;
            io.realm.internal.RealmProxyMediator r0 = r1.schemaMediator
            java.util.Set r0 = r0.getModelClasses()
            return r0
    }

    public io.realm.rx.RxObservableFactory getRxFactory() {
            r2 = this;
            io.realm.rx.RxObservableFactory r0 = r2.rxObservableFactory
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "RxJava seems to be missing from the classpath. Remember to add it as an implementation dependency. See https://github.com/realm/realm-java/tree/master/examples/rxJavaExample for more details."
            r0.<init>(r1)
            throw r0
    }

    public final io.realm.internal.RealmProxyMediator getSchemaMediator() {
            r1 = this;
            io.realm.internal.RealmProxyMediator r0 = r1.schemaMediator
            return r0
    }

    public long getSchemaVersion() {
            r2 = this;
            long r0 = r2.schemaVersion
            return r0
    }

    public boolean hasAssetFile() {
            r1 = this;
            java.lang.String r0 = r1.assetFilePath
            boolean r0 = io.realm.internal.Util.isEmptyString(r0)
            r0 = r0 ^ 1
            return r0
    }

    public int hashCode() {
            r7 = this;
            java.io.File r0 = r7.realmDirectory
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r7.realmFileName
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = 0
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r7.canonicalPath
            r3 = 31
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0, r3)
            java.lang.String r2 = r7.assetFilePath
            if (r2 == 0) goto L2b
            int r2 = r2.hashCode()
            goto L2c
        L2b:
            r2 = 0
        L2c:
            int r0 = r0 + r2
            int r0 = r0 * 31
            byte[] r2 = r7.key
            int r2 = java.util.Arrays.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * 31
            long r3 = r7.schemaVersion
            r0 = 32
            long r5 = r3 >>> r0
            long r3 = r3 ^ r5
            int r4 = (int) r3
            int r2 = r2 + r4
            int r2 = r2 * 31
            io.realm.RealmMigration r3 = r7.migration
            if (r3 == 0) goto L4c
            int r3 = r3.hashCode()
            goto L4d
        L4c:
            r3 = 0
        L4d:
            int r2 = r2 + r3
            int r2 = r2 * 31
            boolean r3 = r7.deleteRealmIfMigrationNeeded
            int r2 = r2 + r3
            int r2 = r2 * 31
            io.realm.internal.OsRealmConfig$Durability r3 = r7.durability
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            int r3 = r3 * 31
            io.realm.internal.RealmProxyMediator r2 = r7.schemaMediator
            int r2 = r2.hashCode()
            int r2 = r2 + r3
            int r2 = r2 * 31
            io.realm.rx.RxObservableFactory r3 = r7.rxObservableFactory
            if (r3 == 0) goto L70
            int r3 = r3.hashCode()
            goto L71
        L70:
            r3 = 0
        L71:
            int r2 = r2 + r3
            int r2 = r2 * 31
            io.realm.Realm$Transaction r3 = r7.initialDataTransaction
            if (r3 == 0) goto L7d
            int r3 = r3.hashCode()
            goto L7e
        L7d:
            r3 = 0
        L7e:
            int r2 = r2 + r3
            int r2 = r2 * 31
            boolean r3 = r7.readOnly
            int r2 = r2 + r3
            int r2 = r2 * 31
            io.realm.CompactOnLaunchCallback r3 = r7.compactOnLaunch
            if (r3 == 0) goto L8e
            int r1 = r3.hashCode()
        L8e:
            int r2 = r2 + r1
            int r2 = r2 * 31
            boolean r1 = r7.isRecoveryConfiguration
            int r2 = r2 + r1
            int r2 = r2 * 31
            long r3 = r7.maxNumberOfActiveVersions
            long r0 = r3 >>> r0
            long r0 = r0 ^ r3
            int r1 = (int) r0
            int r2 = r2 + r1
            return r2
    }

    public boolean isAllowQueriesOnUiThread() {
            r1 = this;
            boolean r0 = r1.allowQueriesOnUiThread
            return r0
    }

    public boolean isAllowWritesOnUiThread() {
            r1 = this;
            boolean r0 = r1.allowWritesOnUiThread
            return r0
    }

    public boolean isReadOnly() {
            r1 = this;
            boolean r0 = r1.readOnly
            return r0
    }

    public boolean isRecoveryConfiguration() {
            r1 = this;
            boolean r0 = r1.isRecoveryConfiguration
            return r0
    }

    public final boolean realmExists() {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.canonicalPath
            r0.<init>(r1)
            boolean r0 = r0.exists()
            return r0
    }

    public boolean shouldDeleteRealmIfMigrationNeeded() {
            r1 = this;
            boolean r0 = r1.deleteRealmIfMigrationNeeded
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "realmDirectory: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.io.File r1 = r5.realmDirectory
            if (r1 == 0) goto Lf
            java.lang.String r1 = r1.toString()
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r2 = "realmFileName : "
            r0.append(r2)
            java.lang.String r2 = r5.realmFileName
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "canonicalPath: "
            r0.append(r2)
            java.lang.String r2 = r5.canonicalPath
            java.lang.String r3 = "key: "
            java.lang.String r4 = "[length: "
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1, r3, r4)
            byte[] r2 = r5.key
            if (r2 != 0) goto L3a
            r2 = 0
            goto L3c
        L3a:
            r2 = 64
        L3c:
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "schemaVersion: "
            r0.append(r2)
            long r2 = r5.schemaVersion
            java.lang.String r2 = java.lang.Long.toString(r2)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "migration: "
            r0.append(r2)
            io.realm.RealmMigration r2 = r5.migration
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "deleteRealmIfMigrationNeeded: "
            r0.append(r2)
            boolean r2 = r5.deleteRealmIfMigrationNeeded
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "durability: "
            r0.append(r2)
            io.realm.internal.OsRealmConfig$Durability r2 = r5.durability
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "schemaMediator: "
            r0.append(r2)
            io.realm.internal.RealmProxyMediator r2 = r5.schemaMediator
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "readOnly: "
            r0.append(r2)
            boolean r2 = r5.readOnly
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "compactOnLaunch: "
            r0.append(r2)
            io.realm.CompactOnLaunchCallback r2 = r5.compactOnLaunch
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "maxNumberOfActiveVersions: "
            r0.append(r1)
            long r1 = r5.maxNumberOfActiveVersions
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
