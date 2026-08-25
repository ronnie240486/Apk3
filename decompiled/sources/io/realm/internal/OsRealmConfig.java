package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class OsRealmConfig implements io.realm.internal.NativeObject {
    public static final byte CLIENT_RESYNC_MODE_DISCARD_LOCAL = 1;
    public static final byte CLIENT_RESYNC_MODE_MANUAL = 0;
    private static final byte PROXYCONFIG_TYPE_VALUE_HTTP = 0;
    private static final byte SCHEMA_MODE_VALUE_ADDITIVE_DISCOVERED = 4;
    private static final byte SCHEMA_MODE_VALUE_ADDITIVE_EXPLICIT = 5;
    private static final byte SCHEMA_MODE_VALUE_AUTOMATIC = 0;
    private static final byte SCHEMA_MODE_VALUE_IMMUTABLE = 1;
    private static final byte SCHEMA_MODE_VALUE_MANUAL = 6;
    private static final byte SCHEMA_MODE_VALUE_READONLY = 2;
    private static final byte SCHEMA_MODE_VALUE_RESET_FILE = 3;
    private static final byte SYNCSESSION_STOP_POLICY_VALUE_AFTER_CHANGES_UPLOADED = 2;
    private static final byte SYNCSESSION_STOP_POLICY_VALUE_IMMEDIATELY = 0;
    private static final byte SYNCSESSION_STOP_POLICY_VALUE_LIVE_INDEFINETELY = 1;
    private static final long nativeFinalizerPtr = 0;
    private final io.realm.CompactOnLaunchCallback compactOnLaunchCallback;
    private final io.realm.internal.NativeContext context;
    private final io.realm.internal.OsSharedRealm.InitializationCallback initializationCallback;
    private final io.realm.internal.OsSharedRealm.MigrationCallback migrationCallback;
    private final long nativePtr;
    private final io.realm.RealmConfiguration realmConfiguration;
    private final java.net.URI resolvedRealmURI;

    /* JADX INFO: renamed from: io.realm.internal.OsRealmConfig$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$net$Proxy$Type = null;

        static {
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.realm.internal.OsRealmConfig.AnonymousClass1.$SwitchMap$java$net$Proxy$Type = r0
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                return
        }
    }

    public static class Builder {
        private boolean autoUpdateNotification;
        private io.realm.RealmConfiguration configuration;
        private java.lang.String fifoFallbackDir;
        private io.realm.internal.OsSharedRealm.InitializationCallback initializationCallback;
        private io.realm.internal.OsSharedRealm.MigrationCallback migrationCallback;
        private io.realm.internal.OsSchemaInfo schemaInfo;

        public Builder(io.realm.RealmConfiguration r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.schemaInfo = r0
                r1.migrationCallback = r0
                r1.initializationCallback = r0
                r0 = 0
                r1.autoUpdateNotification = r0
                java.lang.String r0 = ""
                r1.fifoFallbackDir = r0
                r1.configuration = r2
                return
        }

        public io.realm.internal.OsRealmConfig.Builder autoUpdateNotification(boolean r1) {
                r0 = this;
                r0.autoUpdateNotification = r1
                return r0
        }

        public io.realm.internal.OsRealmConfig build() {
                r9 = this;
                io.realm.internal.OsRealmConfig r8 = new io.realm.internal.OsRealmConfig
                io.realm.RealmConfiguration r1 = r9.configuration
                java.lang.String r2 = r9.fifoFallbackDir
                boolean r3 = r9.autoUpdateNotification
                io.realm.internal.OsSchemaInfo r4 = r9.schemaInfo
                io.realm.internal.OsSharedRealm$MigrationCallback r5 = r9.migrationCallback
                io.realm.internal.OsSharedRealm$InitializationCallback r6 = r9.initializationCallback
                r7 = 0
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public io.realm.internal.OsRealmConfig.Builder fifoFallbackDir(java.io.File r1) {
                r0 = this;
                java.lang.String r1 = r1.getAbsolutePath()
                r0.fifoFallbackDir = r1
                return r0
        }

        public io.realm.internal.OsRealmConfig.Builder initializationCallback(@javax.annotation.Nullable io.realm.internal.OsSharedRealm.InitializationCallback r1) {
                r0 = this;
                r0.initializationCallback = r1
                return r0
        }

        public io.realm.internal.OsRealmConfig.Builder migrationCallback(@javax.annotation.Nullable io.realm.internal.OsSharedRealm.MigrationCallback r1) {
                r0 = this;
                r0.migrationCallback = r1
                return r0
        }

        public io.realm.internal.OsRealmConfig.Builder schemaInfo(@javax.annotation.Nullable io.realm.internal.OsSchemaInfo r1) {
                r0 = this;
                r0.schemaInfo = r1
                return r0
        }
    }

    public static final enum Durability extends java.lang.Enum<io.realm.internal.OsRealmConfig.Durability> {
        private static final /* synthetic */ io.realm.internal.OsRealmConfig.Durability[] $VALUES = null;
        public static final io.realm.internal.OsRealmConfig.Durability FULL = null;
        public static final io.realm.internal.OsRealmConfig.Durability MEM_ONLY = null;

        static {
                io.realm.internal.OsRealmConfig$Durability r0 = new io.realm.internal.OsRealmConfig$Durability
                java.lang.String r1 = "FULL"
                r2 = 0
                r0.<init>(r1, r2, r2)
                io.realm.internal.OsRealmConfig.Durability.FULL = r0
                io.realm.internal.OsRealmConfig$Durability r1 = new io.realm.internal.OsRealmConfig$Durability
                java.lang.String r3 = "MEM_ONLY"
                r4 = 1
                r1.<init>(r3, r4, r4)
                io.realm.internal.OsRealmConfig.Durability.MEM_ONLY = r1
                r3 = 2
                io.realm.internal.OsRealmConfig$Durability[] r3 = new io.realm.internal.OsRealmConfig.Durability[r3]
                r3[r2] = r0
                r3[r4] = r1
                io.realm.internal.OsRealmConfig.Durability.$VALUES = r3
                return
        }

        private Durability(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.realm.internal.OsRealmConfig.Durability valueOf(java.lang.String r1) {
                java.lang.Class<io.realm.internal.OsRealmConfig$Durability> r0 = io.realm.internal.OsRealmConfig.Durability.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.realm.internal.OsRealmConfig$Durability r1 = (io.realm.internal.OsRealmConfig.Durability) r1
                return r1
        }

        public static io.realm.internal.OsRealmConfig.Durability[] values() {
                io.realm.internal.OsRealmConfig$Durability[] r0 = io.realm.internal.OsRealmConfig.Durability.$VALUES
                java.lang.Object r0 = r0.clone()
                io.realm.internal.OsRealmConfig$Durability[] r0 = (io.realm.internal.OsRealmConfig.Durability[]) r0
                return r0
        }
    }

    public static final enum SchemaMode extends java.lang.Enum<io.realm.internal.OsRealmConfig.SchemaMode> {
        private static final /* synthetic */ io.realm.internal.OsRealmConfig.SchemaMode[] $VALUES = null;
        public static final io.realm.internal.OsRealmConfig.SchemaMode SCHEMA_MODE_ADDITIVE_DISCOVERED = null;
        public static final io.realm.internal.OsRealmConfig.SchemaMode SCHEMA_MODE_AUTOMATIC = null;
        public static final io.realm.internal.OsRealmConfig.SchemaMode SCHEMA_MODE_IMMUTABLE = null;
        public static final io.realm.internal.OsRealmConfig.SchemaMode SCHEMA_MODE_MANUAL = null;
        public static final io.realm.internal.OsRealmConfig.SchemaMode SCHEMA_MODE_READONLY = null;
        public static final io.realm.internal.OsRealmConfig.SchemaMode SCHEMA_MODE_RESET_FILE = null;
        public final byte value;

        static {
                io.realm.internal.OsRealmConfig$SchemaMode r0 = new io.realm.internal.OsRealmConfig$SchemaMode
                java.lang.String r1 = "SCHEMA_MODE_AUTOMATIC"
                r2 = 0
                r0.<init>(r1, r2, r2)
                io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_AUTOMATIC = r0
                io.realm.internal.OsRealmConfig$SchemaMode r1 = new io.realm.internal.OsRealmConfig$SchemaMode
                java.lang.String r3 = "SCHEMA_MODE_IMMUTABLE"
                r4 = 1
                r1.<init>(r3, r4, r4)
                io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_IMMUTABLE = r1
                io.realm.internal.OsRealmConfig$SchemaMode r3 = new io.realm.internal.OsRealmConfig$SchemaMode
                java.lang.String r5 = "SCHEMA_MODE_READONLY"
                r6 = 2
                r3.<init>(r5, r6, r6)
                io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_READONLY = r3
                io.realm.internal.OsRealmConfig$SchemaMode r5 = new io.realm.internal.OsRealmConfig$SchemaMode
                java.lang.String r7 = "SCHEMA_MODE_RESET_FILE"
                r8 = 3
                r5.<init>(r7, r8, r8)
                io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_RESET_FILE = r5
                io.realm.internal.OsRealmConfig$SchemaMode r7 = new io.realm.internal.OsRealmConfig$SchemaMode
                java.lang.String r9 = "SCHEMA_MODE_ADDITIVE_DISCOVERED"
                r10 = 4
                r7.<init>(r9, r10, r10)
                io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_ADDITIVE_DISCOVERED = r7
                io.realm.internal.OsRealmConfig$SchemaMode r9 = new io.realm.internal.OsRealmConfig$SchemaMode
                java.lang.String r11 = "SCHEMA_MODE_MANUAL"
                r12 = 5
                r13 = 6
                r9.<init>(r11, r12, r13)
                io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_MANUAL = r9
                io.realm.internal.OsRealmConfig$SchemaMode[] r11 = new io.realm.internal.OsRealmConfig.SchemaMode[r13]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                io.realm.internal.OsRealmConfig.SchemaMode.$VALUES = r11
                return
        }

        private SchemaMode(java.lang.String r1, int r2, byte r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static io.realm.internal.OsRealmConfig.SchemaMode valueOf(java.lang.String r1) {
                java.lang.Class<io.realm.internal.OsRealmConfig$SchemaMode> r0 = io.realm.internal.OsRealmConfig.SchemaMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.realm.internal.OsRealmConfig$SchemaMode r1 = (io.realm.internal.OsRealmConfig.SchemaMode) r1
                return r1
        }

        public static io.realm.internal.OsRealmConfig.SchemaMode[] values() {
                io.realm.internal.OsRealmConfig$SchemaMode[] r0 = io.realm.internal.OsRealmConfig.SchemaMode.$VALUES
                java.lang.Object r0 = r0.clone()
                io.realm.internal.OsRealmConfig$SchemaMode[] r0 = (io.realm.internal.OsRealmConfig.SchemaMode[]) r0
                return r0
        }

        public byte getNativeValue() {
                r1 = this;
                byte r0 = r1.value
                return r0
        }
    }

    public static final enum SyncSessionStopPolicy extends java.lang.Enum<io.realm.internal.OsRealmConfig.SyncSessionStopPolicy> {
        private static final /* synthetic */ io.realm.internal.OsRealmConfig.SyncSessionStopPolicy[] $VALUES = null;
        public static final io.realm.internal.OsRealmConfig.SyncSessionStopPolicy AFTER_CHANGES_UPLOADED = null;
        public static final io.realm.internal.OsRealmConfig.SyncSessionStopPolicy IMMEDIATELY = null;
        public static final io.realm.internal.OsRealmConfig.SyncSessionStopPolicy LIVE_INDEFINITELY = null;
        public final byte value;

        static {
                io.realm.internal.OsRealmConfig$SyncSessionStopPolicy r0 = new io.realm.internal.OsRealmConfig$SyncSessionStopPolicy
                java.lang.String r1 = "IMMEDIATELY"
                r2 = 0
                r0.<init>(r1, r2, r2)
                io.realm.internal.OsRealmConfig.SyncSessionStopPolicy.IMMEDIATELY = r0
                io.realm.internal.OsRealmConfig$SyncSessionStopPolicy r1 = new io.realm.internal.OsRealmConfig$SyncSessionStopPolicy
                java.lang.String r3 = "LIVE_INDEFINITELY"
                r4 = 1
                r1.<init>(r3, r4, r4)
                io.realm.internal.OsRealmConfig.SyncSessionStopPolicy.LIVE_INDEFINITELY = r1
                io.realm.internal.OsRealmConfig$SyncSessionStopPolicy r3 = new io.realm.internal.OsRealmConfig$SyncSessionStopPolicy
                java.lang.String r5 = "AFTER_CHANGES_UPLOADED"
                r6 = 2
                r3.<init>(r5, r6, r6)
                io.realm.internal.OsRealmConfig.SyncSessionStopPolicy.AFTER_CHANGES_UPLOADED = r3
                r5 = 3
                io.realm.internal.OsRealmConfig$SyncSessionStopPolicy[] r5 = new io.realm.internal.OsRealmConfig.SyncSessionStopPolicy[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.realm.internal.OsRealmConfig.SyncSessionStopPolicy.$VALUES = r5
                return
        }

        private SyncSessionStopPolicy(java.lang.String r1, int r2, byte r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static io.realm.internal.OsRealmConfig.SyncSessionStopPolicy valueOf(java.lang.String r1) {
                java.lang.Class<io.realm.internal.OsRealmConfig$SyncSessionStopPolicy> r0 = io.realm.internal.OsRealmConfig.SyncSessionStopPolicy.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.realm.internal.OsRealmConfig$SyncSessionStopPolicy r1 = (io.realm.internal.OsRealmConfig.SyncSessionStopPolicy) r1
                return r1
        }

        public static io.realm.internal.OsRealmConfig.SyncSessionStopPolicy[] values() {
                io.realm.internal.OsRealmConfig$SyncSessionStopPolicy[] r0 = io.realm.internal.OsRealmConfig.SyncSessionStopPolicy.$VALUES
                java.lang.Object r0 = r0.clone()
                io.realm.internal.OsRealmConfig$SyncSessionStopPolicy[] r0 = (io.realm.internal.OsRealmConfig.SyncSessionStopPolicy[]) r0
                return r0
        }

        public byte getNativeValue() {
                r1 = this;
                byte r0 = r1.value
                return r0
        }
    }

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.OsRealmConfig.nativeFinalizerPtr = r0
            return
    }

    private OsRealmConfig(io.realm.RealmConfiguration r34, java.lang.String r35, boolean r36, @javax.annotation.Nullable io.realm.internal.OsSchemaInfo r37, @javax.annotation.Nullable io.realm.internal.OsSharedRealm.MigrationCallback r38, @javax.annotation.Nullable io.realm.internal.OsSharedRealm.InitializationCallback r39) {
            r33 = this;
            r15 = r33
            r0 = r34
            r10 = r39
            java.lang.String r14 = "Cannot create a URI from the Realm URL address"
            r33.<init>()
            io.realm.internal.NativeContext r1 = new io.realm.internal.NativeContext
            r1.<init>()
            r15.context = r1
            r15.realmConfiguration = r0
            java.lang.String r1 = r34.getPath()
            long r2 = r34.getMaxNumberOfActiveVersions()
            r4 = 1
            r5 = r35
            long r1 = nativeCreate(r1, r5, r4, r2)
            r15.nativePtr = r1
            io.realm.internal.NativeContext r1 = io.realm.internal.NativeContext.dummyContext
            r1.addReference(r15)
            io.realm.internal.ObjectServerFacade r1 = io.realm.internal.ObjectServerFacade.getSyncFacadeIfPossible()
            java.lang.Object[] r1 = r1.getSyncConfigurationOptions(r0)
            r2 = 0
            r2 = r1[r2]
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            r2 = r1[r4]
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13
            r2 = 2
            r3 = r1[r2]
            r17 = r3
            java.lang.String r17 = (java.lang.String) r17
            r3 = 3
            r3 = r1[r3]
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12
            r3 = 4
            r3 = r1[r3]
            r18 = r3
            java.lang.String r18 = (java.lang.String) r18
            r3 = 5
            r3 = r1[r3]
            r19 = r3
            java.lang.String r19 = (java.lang.String) r19
            r3 = 6
            r3 = r1[r3]
            r20 = r3
            java.lang.String r20 = (java.lang.String) r20
            r3 = 7
            r3 = r1[r3]
            r16 = r3
            java.lang.Byte r16 = (java.lang.Byte) r16
            r3 = 8
            r3 = r1[r3]
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            r3 = 9
            r3 = r1[r3]
            r21 = r3
            java.lang.String r21 = (java.lang.String) r21
            r3 = 10
            r3 = r1[r3]
            java.util.Map r3 = (java.util.Map) r3
            r4 = 11
            r4 = r1[r4]
            r22 = r4
            java.lang.Byte r22 = (java.lang.Byte) r22
            r4 = 12
            r23 = r1[r4]
            r4 = 13
            r24 = r1[r4]
            r4 = 14
            r4 = r1[r4]
            r25 = r4
            java.lang.String r25 = (java.lang.String) r25
            r4 = 15
            r26 = r1[r4]
            r4 = 16
            r1 = r1[r4]
            r27 = r1
            java.lang.Long r27 = (java.lang.Long) r27
            if (r3 == 0) goto La8
            int r1 = r3.size()
            int r1 = r1 * 2
            goto La9
        La8:
            r1 = 0
        La9:
            java.lang.String[] r7 = new java.lang.String[r1]
            if (r3 == 0) goto Ld6
            java.util.Set r1 = r3.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        Lb6:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Ld6
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r7[r3] = r5
            int r5 = r3 + 1
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r7[r5] = r4
            int r3 = r3 + r2
            goto Lb6
        Ld6:
            byte[] r1 = r34.getEncryptionKey()
            if (r1 == 0) goto Le1
            long r2 = r15.nativePtr
            nativeSetEncryptionKey(r2, r1)
        Le1:
            long r1 = r15.nativePtr
            io.realm.internal.OsRealmConfig$Durability r3 = r34.getDurability()
            io.realm.internal.OsRealmConfig$Durability r4 = io.realm.internal.OsRealmConfig.Durability.MEM_ONLY
            if (r3 != r4) goto Led
            r3 = 1
            goto Lee
        Led:
            r3 = 0
        Lee:
            nativeSetInMemory(r1, r3)
            long r1 = r15.nativePtr
            r3 = r36
            nativeEnableChangeNotification(r1, r3)
            io.realm.internal.OsRealmConfig$SchemaMode r1 = io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_MANUAL
            boolean r2 = r34.isRecoveryConfiguration()
            if (r2 == 0) goto L103
            io.realm.internal.OsRealmConfig$SchemaMode r1 = io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_IMMUTABLE
            goto L119
        L103:
            boolean r2 = r34.isReadOnly()
            if (r2 == 0) goto L10c
            io.realm.internal.OsRealmConfig$SchemaMode r1 = io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_READONLY
            goto L119
        L10c:
            if (r17 == 0) goto L111
            io.realm.internal.OsRealmConfig$SchemaMode r1 = io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_ADDITIVE_DISCOVERED
            goto L119
        L111:
            boolean r2 = r34.shouldDeleteRealmIfMigrationNeeded()
            if (r2 == 0) goto L119
            io.realm.internal.OsRealmConfig$SchemaMode r1 = io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_RESET_FILE
        L119:
            long r5 = r34.getSchemaVersion()
            if (r37 != 0) goto L122
            r2 = 0
            goto L126
        L122:
            long r2 = r37.getNativePtr()
        L126:
            r8 = r38
            r28 = r2
            r15.migrationCallback = r8
            long r2 = r15.nativePtr
            byte r4 = r1.getNativeValue()
            r1 = r33
            r30 = r7
            r7 = r28
            r35 = r9
            r9 = r38
            r1.nativeSetSchemaConfig(r2, r4, r5, r7, r9)
            io.realm.CompactOnLaunchCallback r0 = r34.getCompactOnLaunchCallback()
            r15.compactOnLaunchCallback = r0
            if (r0 == 0) goto L14c
            long r1 = r15.nativePtr
            nativeSetCompactOnLaunchCallback(r1, r0)
        L14c:
            r15.initializationCallback = r10
            if (r10 == 0) goto L155
            long r0 = r15.nativePtr
            r15.nativeSetInitializationCallback(r0, r10)
        L155:
            r28 = 0
            if (r17 == 0) goto L253
            long r2 = r27.longValue()
            long r4 = r15.nativePtr
            byte r0 = r16.byteValue()
            r10 = r12
            r12 = r0
            byte r16 = r22.byteValue()
            r1 = r33
            r6 = r17
            r7 = r11
            r8 = r13
            r9 = r18
            r0 = r10
            r10 = r19
            r11 = r20
            r13 = r35
            r31 = r14
            r14 = r21
            r15 = r30
            r17 = r23
            r18 = r24
            r19 = r25
            r20 = r26
            java.lang.String r1 = r1.nativeCreateAndSetSyncConfig(r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> L1b0
            r2.<init>()     // Catch: java.net.URISyntaxException -> L1b0
            r2.append(r0)     // Catch: java.net.URISyntaxException -> L1b0
            r3 = 1
            r0 = r35
            java.lang.String r0 = r0.substring(r3)     // Catch: java.net.URISyntaxException -> L1ae
            r2.append(r0)     // Catch: java.net.URISyntaxException -> L1ae
            java.lang.String r1 = r2.toString()     // Catch: java.net.URISyntaxException -> L1ae
            java.net.URI r0 = new java.net.URI     // Catch: java.net.URISyntaxException -> L1ae
            r0.<init>(r1)     // Catch: java.net.URISyntaxException -> L1ae
            r2 = 0
            r5 = r31
            r32 = r1
            r1 = r0
            r0 = r32
            goto L1bd
        L1ae:
            r0 = move-exception
            goto L1b2
        L1b0:
            r0 = move-exception
            r3 = 1
        L1b2:
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = r31
            io.realm.log.RealmLog.error(r0, r5, r4)
            r0 = r1
            r1 = r28
        L1bd:
            java.net.ProxySelector r4 = java.net.ProxySelector.getDefault()
            if (r1 == 0) goto L250
            if (r4 == 0) goto L250
            java.net.URI r6 = new java.net.URI     // Catch: java.net.URISyntaxException -> L1d4
            java.lang.String r7 = "ws"
            java.lang.String r8 = "http"
            java.lang.String r0 = r0.replaceFirst(r7, r8)     // Catch: java.net.URISyntaxException -> L1d4
            r6.<init>(r0)     // Catch: java.net.URISyntaxException -> L1d4
            goto L1dc
        L1d4:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]
            io.realm.log.RealmLog.error(r0, r5, r6)
            r6 = r28
        L1dc:
            java.util.List r0 = r4.select(r6)
            if (r0 == 0) goto L250
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L250
            java.lang.Object r0 = r0.get(r2)
            java.net.Proxy r0 = (java.net.Proxy) r0
            java.net.Proxy$Type r4 = r0.type()
            java.net.Proxy$Type r5 = java.net.Proxy.Type.DIRECT
            if (r4 == r5) goto L250
            r4 = -1
            int[] r5 = io.realm.internal.OsRealmConfig.AnonymousClass1.$SwitchMap$java$net$Proxy$Type
            java.net.Proxy$Type r6 = r0.type()
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r3) goto L206
            goto L207
        L206:
            r4 = 0
        L207:
            java.net.Proxy$Type r3 = r0.type()
            java.net.Proxy$Type r5 = java.net.Proxy.Type.HTTP
            if (r3 != r5) goto L246
            java.net.SocketAddress r0 = r0.address()
            boolean r3 = r0 instanceof java.net.InetSocketAddress
            if (r3 == 0) goto L229
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            r3 = r33
            long r5 = r3.nativePtr
            java.lang.String r2 = r0.getHostString()
            int r0 = r0.getPort()
            nativeSetSyncConfigProxySettings(r5, r4, r2, r0)
            goto L256
        L229:
            r3 = r33
            java.lang.String r4 = "Unsupported proxy socket address type: "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            io.realm.log.RealmLog.error(r0, r2)
            goto L256
        L246:
            r3 = r33
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "SOCKS proxies are not supported."
            io.realm.log.RealmLog.error(r2, r0)
            goto L256
        L250:
            r3 = r33
            goto L256
        L253:
            r3 = r15
            r1 = r28
        L256:
            r3.resolvedRealmURI = r1
            return
    }

    public /* synthetic */ OsRealmConfig(io.realm.RealmConfiguration r1, java.lang.String r2, boolean r3, io.realm.internal.OsSchemaInfo r4, io.realm.internal.OsSharedRealm.MigrationCallback r5, io.realm.internal.OsSharedRealm.InitializationCallback r6, io.realm.internal.OsRealmConfig.AnonymousClass1 r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private static native long nativeCreate(java.lang.String r0, java.lang.String r1, boolean r2, long r3);

    private native java.lang.String nativeCreateAndSetSyncConfig(long r1, long r3, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, byte r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14, byte r15, java.lang.Object r16, java.lang.Object r17, java.lang.String r18, java.lang.Object r19);

    private static native void nativeEnableChangeNotification(long r0, boolean r2);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long r0, io.realm.CompactOnLaunchCallback r2);

    private static native void nativeSetEncryptionKey(long r0, byte[] r2);

    private static native void nativeSetInMemory(long r0, boolean r2);

    private native void nativeSetInitializationCallback(long r1, io.realm.internal.OsSharedRealm.InitializationCallback r3);

    private native void nativeSetSchemaConfig(long r1, byte r3, long r4, long r6, @javax.annotation.Nullable io.realm.internal.OsSharedRealm.MigrationCallback r8);

    private static native void nativeSetSyncConfigProxySettings(long r0, byte r2, java.lang.String r3, int r4);

    private static native void nativeSetSyncConfigSslSettings(long r0, boolean r2, java.lang.String r3);

    public final io.realm.internal.NativeContext getContext() {
            r1 = this;
            io.realm.internal.NativeContext r0 = r1.context
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.OsRealmConfig.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public io.realm.RealmConfiguration getRealmConfiguration() {
            r1 = this;
            io.realm.RealmConfiguration r0 = r1.realmConfiguration
            return r0
    }

    public java.net.URI getResolvedRealmURI() {
            r1 = this;
            java.net.URI r0 = r1.resolvedRealmURI
            return r0
    }
}
