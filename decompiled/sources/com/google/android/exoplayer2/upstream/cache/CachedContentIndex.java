package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes.dex */
class CachedContentIndex {
    private static final int INCREMENTAL_METADATA_READ_LENGTH = 10485760;
    private final android.util.SparseArray<java.lang.String> idToKey;
    private final java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> keyToContent;
    private final android.util.SparseBooleanArray newIds;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage previousStorage;
    private final android.util.SparseBooleanArray removedIds;
    private com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage storage;

    public static final class DatabaseStorage implements com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage {
        private static final java.lang.String[] COLUMNS = null;
        private static final java.lang.String COLUMN_ID = "id";
        private static final int COLUMN_INDEX_ID = 0;
        private static final int COLUMN_INDEX_KEY = 1;
        private static final int COLUMN_INDEX_METADATA = 2;
        private static final java.lang.String COLUMN_KEY = "key";
        private static final java.lang.String COLUMN_METADATA = "metadata";
        private static final java.lang.String TABLE_PREFIX = "ExoPlayerCacheIndex";
        private static final java.lang.String TABLE_SCHEMA = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";
        private static final int TABLE_VERSION = 1;
        private static final java.lang.String WHERE_ID_EQUALS = "id = ?";
        private final com.google.android.exoplayer2.database.DatabaseProvider databaseProvider;
        private java.lang.String hexUid;
        private final android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.CachedContent> pendingUpdates;
        private java.lang.String tableName;

        static {
                java.lang.String r0 = "id"
                java.lang.String r1 = "key"
                java.lang.String r2 = "metadata"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
                com.google.android.exoplayer2.upstream.cache.CachedContentIndex.DatabaseStorage.COLUMNS = r0
                return
        }

        public DatabaseStorage(com.google.android.exoplayer2.database.DatabaseProvider r1) {
                r0 = this;
                r0.<init>()
                r0.databaseProvider = r1
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r0.pendingUpdates = r1
                return
        }

        private void addOrUpdateRow(android.database.sqlite.SQLiteDatabase r5, com.google.android.exoplayer2.upstream.cache.CachedContent r6) throws java.io.IOException {
                r4 = this;
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
                r0.<init>()
                com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r1 = r6.getMetadata()
                java.io.DataOutputStream r2 = new java.io.DataOutputStream
                r2.<init>(r0)
                com.google.android.exoplayer2.upstream.cache.CachedContentIndex.access$200(r1, r2)
                byte[] r0 = r0.toByteArray()
                android.content.ContentValues r1 = new android.content.ContentValues
                r1.<init>()
                int r2 = r6.id
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.String r3 = "id"
                r1.put(r3, r2)
                java.lang.String r6 = r6.key
                java.lang.String r2 = "key"
                r1.put(r2, r6)
                java.lang.String r6 = "metadata"
                r1.put(r6, r0)
                java.lang.String r6 = r4.tableName
                java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
                java.lang.String r6 = (java.lang.String) r6
                r0 = 0
                r5.replaceOrThrow(r6, r0, r1)
                return
        }

        public static void delete(com.google.android.exoplayer2.database.DatabaseProvider r0, long r1) throws com.google.android.exoplayer2.database.DatabaseIOException {
                java.lang.String r1 = java.lang.Long.toHexString(r1)
                delete(r0, r1)
                return
        }

        private static void delete(com.google.android.exoplayer2.database.DatabaseProvider r2, java.lang.String r3) throws com.google.android.exoplayer2.database.DatabaseIOException {
                java.lang.String r0 = getTableName(r3)     // Catch: android.database.SQLException -> L1e
                android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: android.database.SQLException -> L1e
                r2.beginTransactionNonExclusive()     // Catch: android.database.SQLException -> L1e
                r1 = 1
                com.google.android.exoplayer2.database.VersionTable.removeVersion(r2, r1, r3)     // Catch: java.lang.Throwable -> L19
                dropTable(r2, r0)     // Catch: java.lang.Throwable -> L19
                r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L19
                r2.endTransaction()     // Catch: android.database.SQLException -> L1e
                return
            L19:
                r3 = move-exception
                r2.endTransaction()     // Catch: android.database.SQLException -> L1e
                throw r3     // Catch: android.database.SQLException -> L1e
            L1e:
                r2 = move-exception
                com.google.android.exoplayer2.database.DatabaseIOException r3 = new com.google.android.exoplayer2.database.DatabaseIOException
                r3.<init>(r2)
                throw r3
        }

        private void deleteRow(android.database.sqlite.SQLiteDatabase r4, int r5) {
                r3 = this;
                java.lang.String r0 = r3.tableName
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1 = 1
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.String r5 = java.lang.Integer.toString(r5)
                r2 = 0
                r1[r2] = r5
                java.lang.String r5 = "id = ?"
                r4.delete(r0, r5, r1)
                return
        }

        private static void dropTable(android.database.sqlite.SQLiteDatabase r2, java.lang.String r3) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DROP TABLE IF EXISTS "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.execSQL(r3)
                return
        }

        private android.database.Cursor getCursor() {
                r9 = this;
                com.google.android.exoplayer2.database.DatabaseProvider r0 = r9.databaseProvider
                android.database.sqlite.SQLiteDatabase r1 = r0.getReadableDatabase()
                java.lang.String r0 = r9.tableName
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                r2 = r0
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String[] r3 = com.google.android.exoplayer2.upstream.cache.CachedContentIndex.DatabaseStorage.COLUMNS
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        private static java.lang.String getTableName(java.lang.String r1) {
                java.lang.String r0 = "ExoPlayerCacheIndex"
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
                return r1
        }

        private void initializeTable(android.database.sqlite.SQLiteDatabase r3) throws com.google.android.exoplayer2.database.DatabaseIOException {
                r2 = this;
                java.lang.String r0 = r2.hexUid
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1 = 1
                com.google.android.exoplayer2.database.VersionTable.setVersion(r3, r1, r0, r1)
                java.lang.String r0 = r2.tableName
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                java.lang.String r0 = (java.lang.String) r0
                dropTable(r3, r0)
                java.lang.String r0 = "CREATE TABLE "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r1 = r2.tableName
                r0.append(r1)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.execSQL(r0)
                return
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void delete() throws com.google.android.exoplayer2.database.DatabaseIOException {
                r2 = this;
                com.google.android.exoplayer2.database.DatabaseProvider r0 = r2.databaseProvider
                java.lang.String r1 = r2.hexUid
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                java.lang.String r1 = (java.lang.String) r1
                delete(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public boolean exists() throws com.google.android.exoplayer2.database.DatabaseIOException {
                r3 = this;
                com.google.android.exoplayer2.database.DatabaseProvider r0 = r3.databaseProvider     // Catch: android.database.SQLException -> L19
                android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch: android.database.SQLException -> L19
                java.lang.String r1 = r3.hexUid     // Catch: android.database.SQLException -> L19
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: android.database.SQLException -> L19
                java.lang.String r1 = (java.lang.String) r1     // Catch: android.database.SQLException -> L19
                r2 = 1
                int r0 = com.google.android.exoplayer2.database.VersionTable.getVersion(r0, r2, r1)     // Catch: android.database.SQLException -> L19
                r1 = -1
                if (r0 == r1) goto L17
                goto L18
            L17:
                r2 = 0
            L18:
                return r2
            L19:
                r0 = move-exception
                com.google.android.exoplayer2.database.DatabaseIOException r1 = new com.google.android.exoplayer2.database.DatabaseIOException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void initialize(long r1) {
                r0 = this;
                java.lang.String r1 = java.lang.Long.toHexString(r1)
                r0.hexUid = r1
                java.lang.String r1 = getTableName(r1)
                r0.tableName = r1
                return
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void load(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r8, android.util.SparseArray<java.lang.String> r9) throws java.io.IOException {
                r7 = this;
                android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.CachedContent> r0 = r7.pendingUpdates
                int r0 = r0.size()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.database.DatabaseProvider r0 = r7.databaseProvider     // Catch: android.database.sqlite.SQLiteException -> L89
                android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L89
                java.lang.String r3 = r7.hexUid     // Catch: android.database.sqlite.SQLiteException -> L89
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)     // Catch: android.database.sqlite.SQLiteException -> L89
                java.lang.String r3 = (java.lang.String) r3     // Catch: android.database.sqlite.SQLiteException -> L89
                int r0 = com.google.android.exoplayer2.database.VersionTable.getVersion(r0, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L89
                if (r0 == r2) goto L3c
                com.google.android.exoplayer2.database.DatabaseProvider r0 = r7.databaseProvider     // Catch: android.database.sqlite.SQLiteException -> L89
                android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L89
                r0.beginTransactionNonExclusive()     // Catch: android.database.sqlite.SQLiteException -> L89
                r7.initializeTable(r0)     // Catch: java.lang.Throwable -> L37
                r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L37
                r0.endTransaction()     // Catch: android.database.sqlite.SQLiteException -> L89
                goto L3c
            L37:
                r1 = move-exception
                r0.endTransaction()     // Catch: android.database.sqlite.SQLiteException -> L89
                throw r1     // Catch: android.database.sqlite.SQLiteException -> L89
            L3c:
                android.database.Cursor r0 = r7.getCursor()     // Catch: android.database.sqlite.SQLiteException -> L89
            L40:
                boolean r3 = r0.moveToNext()     // Catch: java.lang.Throwable -> L7d
                if (r3 == 0) goto L79
                int r3 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L7d
                java.lang.String r4 = r0.getString(r2)     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L7d
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L7d
                r5 = 2
                byte[] r5 = r0.getBlob(r5)     // Catch: java.lang.Throwable -> L7d
                java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L7d
                r6.<init>(r5)     // Catch: java.lang.Throwable -> L7d
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L7d
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L7d
                com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r5 = com.google.android.exoplayer2.upstream.cache.CachedContentIndex.access$100(r5)     // Catch: java.lang.Throwable -> L7d
                com.google.android.exoplayer2.upstream.cache.CachedContent r6 = new com.google.android.exoplayer2.upstream.cache.CachedContent     // Catch: java.lang.Throwable -> L7d
                r6.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L7d
                java.lang.String r3 = r6.key     // Catch: java.lang.Throwable -> L7d
                r8.put(r3, r6)     // Catch: java.lang.Throwable -> L7d
                int r3 = r6.id     // Catch: java.lang.Throwable -> L7d
                java.lang.String r4 = r6.key     // Catch: java.lang.Throwable -> L7d
                r9.put(r3, r4)     // Catch: java.lang.Throwable -> L7d
                goto L40
            L79:
                r0.close()     // Catch: android.database.sqlite.SQLiteException -> L89
                return
            L7d:
                r1 = move-exception
                if (r0 == 0) goto L88
                r0.close()     // Catch: java.lang.Throwable -> L84
                goto L88
            L84:
                r0 = move-exception
                r1.addSuppressed(r0)     // Catch: android.database.sqlite.SQLiteException -> L89
            L88:
                throw r1     // Catch: android.database.sqlite.SQLiteException -> L89
            L89:
                r0 = move-exception
                r8.clear()
                r9.clear()
                com.google.android.exoplayer2.database.DatabaseIOException r8 = new com.google.android.exoplayer2.database.DatabaseIOException
                r8.<init>(r0)
                throw r8
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void onRemove(com.google.android.exoplayer2.upstream.cache.CachedContent r2, boolean r3) {
                r1 = this;
                if (r3 == 0) goto La
                android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.CachedContent> r3 = r1.pendingUpdates
                int r2 = r2.id
                r3.delete(r2)
                goto L12
            La:
                android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.CachedContent> r3 = r1.pendingUpdates
                int r2 = r2.id
                r0 = 0
                r3.put(r2, r0)
            L12:
                return
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void onUpdate(com.google.android.exoplayer2.upstream.cache.CachedContent r3) {
                r2 = this;
                android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.CachedContent> r0 = r2.pendingUpdates
                int r1 = r3.id
                r0.put(r1, r3)
                return
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void storeFully(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r3) throws java.io.IOException {
                r2 = this;
                com.google.android.exoplayer2.database.DatabaseProvider r0 = r2.databaseProvider     // Catch: android.database.SQLException -> L35
                android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: android.database.SQLException -> L35
                r0.beginTransactionNonExclusive()     // Catch: android.database.SQLException -> L35
                r2.initializeTable(r0)     // Catch: java.lang.Throwable -> L30
                java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L30
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L30
            L14:
                boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L30
                if (r1 == 0) goto L24
                java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L30
                com.google.android.exoplayer2.upstream.cache.CachedContent r1 = (com.google.android.exoplayer2.upstream.cache.CachedContent) r1     // Catch: java.lang.Throwable -> L30
                r2.addOrUpdateRow(r0, r1)     // Catch: java.lang.Throwable -> L30
                goto L14
            L24:
                r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L30
                android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.CachedContent> r3 = r2.pendingUpdates     // Catch: java.lang.Throwable -> L30
                r3.clear()     // Catch: java.lang.Throwable -> L30
                r0.endTransaction()     // Catch: android.database.SQLException -> L35
                return
            L30:
                r3 = move-exception
                r0.endTransaction()     // Catch: android.database.SQLException -> L35
                throw r3     // Catch: android.database.SQLException -> L35
            L35:
                r3 = move-exception
                com.google.android.exoplayer2.database.DatabaseIOException r0 = new com.google.android.exoplayer2.database.DatabaseIOException
                r0.<init>(r3)
                throw r0
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void storeIncremental(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r3) throws java.io.IOException {
                r2 = this;
                android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.CachedContent> r3 = r2.pendingUpdates
                int r3 = r3.size()
                if (r3 != 0) goto L9
                return
            L9:
                com.google.android.exoplayer2.database.DatabaseProvider r3 = r2.databaseProvider     // Catch: android.database.SQLException -> L46
                android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch: android.database.SQLException -> L46
                r3.beginTransactionNonExclusive()     // Catch: android.database.SQLException -> L46
                r0 = 0
            L13:
                android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.CachedContent> r1 = r2.pendingUpdates     // Catch: java.lang.Throwable -> L41
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L41
                if (r0 >= r1) goto L35
                android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.CachedContent> r1 = r2.pendingUpdates     // Catch: java.lang.Throwable -> L41
                java.lang.Object r1 = r1.valueAt(r0)     // Catch: java.lang.Throwable -> L41
                com.google.android.exoplayer2.upstream.cache.CachedContent r1 = (com.google.android.exoplayer2.upstream.cache.CachedContent) r1     // Catch: java.lang.Throwable -> L41
                if (r1 != 0) goto L2f
                android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.CachedContent> r1 = r2.pendingUpdates     // Catch: java.lang.Throwable -> L41
                int r1 = r1.keyAt(r0)     // Catch: java.lang.Throwable -> L41
                r2.deleteRow(r3, r1)     // Catch: java.lang.Throwable -> L41
                goto L32
            L2f:
                r2.addOrUpdateRow(r3, r1)     // Catch: java.lang.Throwable -> L41
            L32:
                int r0 = r0 + 1
                goto L13
            L35:
                r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L41
                android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.CachedContent> r0 = r2.pendingUpdates     // Catch: java.lang.Throwable -> L41
                r0.clear()     // Catch: java.lang.Throwable -> L41
                r3.endTransaction()     // Catch: android.database.SQLException -> L46
                return
            L41:
                r0 = move-exception
                r3.endTransaction()     // Catch: android.database.SQLException -> L46
                throw r0     // Catch: android.database.SQLException -> L46
            L46:
                r3 = move-exception
                com.google.android.exoplayer2.database.DatabaseIOException r0 = new com.google.android.exoplayer2.database.DatabaseIOException
                r0.<init>(r3)
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LegacyStorage implements com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage {
        private static final int FLAG_ENCRYPTED_INDEX = 1;
        private static final int VERSION = 2;
        private static final int VERSION_METADATA_INTRODUCED = 2;
        private final com.google.android.exoplayer2.util.AtomicFile atomicFile;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream bufferedOutputStream;
        private boolean changed;

        @androidx.annotation.Nullable
        private final javax.crypto.Cipher cipher;
        private final boolean encrypt;

        @androidx.annotation.Nullable
        private final java.security.SecureRandom random;

        @androidx.annotation.Nullable
        private final javax.crypto.spec.SecretKeySpec secretKeySpec;

        public LegacyStorage(java.io.File r6, @androidx.annotation.Nullable byte[] r7, boolean r8) {
                r5 = this;
                r5.<init>()
                r0 = 0
                r1 = 1
                if (r7 != 0) goto Lc
                if (r8 != 0) goto La
                goto Lc
            La:
                r2 = 0
                goto Ld
            Lc:
                r2 = 1
            Ld:
                com.google.android.exoplayer2.util.Assertions.checkState(r2)
                r2 = 0
                if (r7 == 0) goto L31
                int r3 = r7.length
                r4 = 16
                if (r3 != r4) goto L19
                r0 = 1
            L19:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                javax.crypto.Cipher r0 = com.google.android.exoplayer2.upstream.cache.CachedContentIndex.access$000()     // Catch: javax.crypto.NoSuchPaddingException -> L28 java.security.NoSuchAlgorithmException -> L2a
                javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: javax.crypto.NoSuchPaddingException -> L28 java.security.NoSuchAlgorithmException -> L2a
                java.lang.String r3 = "AES"
                r1.<init>(r7, r3)     // Catch: javax.crypto.NoSuchPaddingException -> L28 java.security.NoSuchAlgorithmException -> L2a
                goto L38
            L28:
                r6 = move-exception
                goto L2b
            L2a:
                r6 = move-exception
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r7.<init>(r6)
                throw r7
            L31:
                r7 = r8 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkArgument(r7)
                r0 = r2
                r1 = r0
            L38:
                r5.encrypt = r8
                r5.cipher = r0
                r5.secretKeySpec = r1
                if (r8 == 0) goto L45
                java.security.SecureRandom r2 = new java.security.SecureRandom
                r2.<init>()
            L45:
                r5.random = r2
                com.google.android.exoplayer2.util.AtomicFile r7 = new com.google.android.exoplayer2.util.AtomicFile
                r7.<init>(r6)
                r5.atomicFile = r7
                return
        }

        private int hashCachedContent(com.google.android.exoplayer2.upstream.cache.CachedContent r5, int r6) {
                r4 = this;
                int r0 = r5.id
                int r0 = r0 * 31
                java.lang.String r1 = r5.key
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                r0 = 2
                if (r6 >= r0) goto L20
                com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r5 = r5.getMetadata()
                long r5 = com.google.android.exoplayer2.upstream.cache.ContentMetadata.CC.getContentLength(r5)
                int r1 = r1 * 31
                r0 = 32
                long r2 = r5 >>> r0
                long r5 = r5 ^ r2
                int r6 = (int) r5
                int r1 = r1 + r6
                goto L2b
            L20:
                int r1 = r1 * 31
                com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r5 = r5.getMetadata()
                int r5 = r5.hashCode()
                int r1 = r1 + r5
            L2b:
                return r1
        }

        private com.google.android.exoplayer2.upstream.cache.CachedContent readCachedContent(int r4, java.io.DataInputStream r5) throws java.io.IOException {
                r3 = this;
                int r0 = r5.readInt()
                java.lang.String r1 = r5.readUTF()
                r2 = 2
                if (r4 >= r2) goto L1e
                long r4 = r5.readLong()
                com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations r2 = new com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations
                r2.<init>()
                com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations.setContentLength(r2, r4)
                com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r4 = com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata.EMPTY
                com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r4 = r4.copyWithMutationsApplied(r2)
                goto L22
            L1e:
                com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r4 = com.google.android.exoplayer2.upstream.cache.CachedContentIndex.access$100(r5)
            L22:
                com.google.android.exoplayer2.upstream.cache.CachedContent r5 = new com.google.android.exoplayer2.upstream.cache.CachedContent
                r5.<init>(r0, r1, r4)
                return r5
        }

        private boolean readFile(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r11, android.util.SparseArray<java.lang.String> r12) {
                r10 = this;
                com.google.android.exoplayer2.util.AtomicFile r0 = r10.atomicFile
                boolean r0 = r0.exists()
                r1 = 1
                if (r0 != 0) goto La
                return r1
            La:
                r0 = 0
                r2 = 0
                java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lb7
                com.google.android.exoplayer2.util.AtomicFile r4 = r10.atomicFile     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lb7
                java.io.InputStream r4 = r4.openRead()     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lb7
                r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lb7
                java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lb7
                r4.<init>(r3)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lb7
                int r0 = r4.readInt()     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                if (r0 < 0) goto La7
                r5 = 2
                if (r0 <= r5) goto L27
                goto La7
            L27:
                int r6 = r4.readInt()     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                r6 = r6 & r1
                if (r6 == 0) goto L66
                javax.crypto.Cipher r6 = r10.cipher     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                if (r6 != 0) goto L36
                com.google.android.exoplayer2.util.Util.closeQuietly(r4)
                return r2
            L36:
                r6 = 16
                byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                r4.readFully(r6)     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                r7.<init>(r6)     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                javax.crypto.Cipher r6 = r10.cipher     // Catch: java.security.InvalidAlgorithmParameterException -> L5d java.security.InvalidKeyException -> L5f java.lang.Throwable -> Lab java.io.IOException -> Lae
                javax.crypto.spec.SecretKeySpec r8 = r10.secretKeySpec     // Catch: java.security.InvalidAlgorithmParameterException -> L5d java.security.InvalidKeyException -> L5f java.lang.Throwable -> Lab java.io.IOException -> Lae
                java.lang.Object r8 = com.google.android.exoplayer2.util.Util.castNonNull(r8)     // Catch: java.security.InvalidAlgorithmParameterException -> L5d java.security.InvalidKeyException -> L5f java.lang.Throwable -> Lab java.io.IOException -> Lae
                java.security.Key r8 = (java.security.Key) r8     // Catch: java.security.InvalidAlgorithmParameterException -> L5d java.security.InvalidKeyException -> L5f java.lang.Throwable -> Lab java.io.IOException -> Lae
                r6.init(r5, r8, r7)     // Catch: java.security.InvalidAlgorithmParameterException -> L5d java.security.InvalidKeyException -> L5f java.lang.Throwable -> Lab java.io.IOException -> Lae
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                javax.crypto.Cipher r7 = r10.cipher     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                r6.<init>(r3, r7)     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                r5.<init>(r6)     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                r4 = r5
                goto L6c
            L5d:
                r11 = move-exception
                goto L60
            L5f:
                r11 = move-exception
            L60:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                r12.<init>(r11)     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                throw r12     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
            L66:
                boolean r3 = r10.encrypt     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                if (r3 == 0) goto L6c
                r10.changed = r1     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
            L6c:
                int r3 = r4.readInt()     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                r5 = 0
                r6 = 0
            L72:
                if (r5 >= r3) goto L8c
                com.google.android.exoplayer2.upstream.cache.CachedContent r7 = r10.readCachedContent(r0, r4)     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                java.lang.String r8 = r7.key     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                r11.put(r8, r7)     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                int r8 = r7.id     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                java.lang.String r9 = r7.key     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                r12.put(r8, r9)     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                int r7 = r10.hashCachedContent(r7, r0)     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                int r6 = r6 + r7
                int r5 = r5 + 1
                goto L72
            L8c:
                int r11 = r4.readInt()     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                int r12 = r4.read()     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lae
                r0 = -1
                if (r12 != r0) goto L99
                r12 = 1
                goto L9a
            L99:
                r12 = 0
            L9a:
                if (r11 != r6) goto La3
                if (r12 != 0) goto L9f
                goto La3
            L9f:
                com.google.android.exoplayer2.util.Util.closeQuietly(r4)
                return r1
            La3:
                com.google.android.exoplayer2.util.Util.closeQuietly(r4)
                return r2
            La7:
                com.google.android.exoplayer2.util.Util.closeQuietly(r4)
                return r2
            Lab:
                r11 = move-exception
                r0 = r4
                goto Lb1
            Lae:
                r0 = r4
                goto Lb8
            Lb0:
                r11 = move-exception
            Lb1:
                if (r0 == 0) goto Lb6
                com.google.android.exoplayer2.util.Util.closeQuietly(r0)
            Lb6:
                throw r11
            Lb7:
            Lb8:
                if (r0 == 0) goto Lbd
                com.google.android.exoplayer2.util.Util.closeQuietly(r0)
            Lbd:
                return r2
        }

        private void writeCachedContent(com.google.android.exoplayer2.upstream.cache.CachedContent r2, java.io.DataOutputStream r3) throws java.io.IOException {
                r1 = this;
                int r0 = r2.id
                r3.writeInt(r0)
                java.lang.String r0 = r2.key
                r3.writeUTF(r0)
                com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r2 = r2.getMetadata()
                com.google.android.exoplayer2.upstream.cache.CachedContentIndex.access$200(r2, r3)
                return
        }

        private void writeFile(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r10) throws java.io.IOException {
                r9 = this;
                r0 = 0
                com.google.android.exoplayer2.util.AtomicFile r1 = r9.atomicFile     // Catch: java.lang.Throwable -> La8
                java.io.OutputStream r1 = r1.startWrite()     // Catch: java.lang.Throwable -> La8
                com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream r2 = r9.bufferedOutputStream     // Catch: java.lang.Throwable -> La8
                if (r2 != 0) goto L13
                com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream r2 = new com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream     // Catch: java.lang.Throwable -> La8
                r2.<init>(r1)     // Catch: java.lang.Throwable -> La8
                r9.bufferedOutputStream = r2     // Catch: java.lang.Throwable -> La8
                goto L16
            L13:
                r2.reset(r1)     // Catch: java.lang.Throwable -> La8
            L16:
                com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream r1 = r9.bufferedOutputStream     // Catch: java.lang.Throwable -> La8
                java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> La8
                r2.<init>(r1)     // Catch: java.lang.Throwable -> La8
                r3 = 2
                r2.writeInt(r3)     // Catch: java.lang.Throwable -> La5
                boolean r4 = r9.encrypt     // Catch: java.lang.Throwable -> La5
                r5 = 1
                r6 = 0
                if (r4 == 0) goto L29
                r4 = 1
                goto L2a
            L29:
                r4 = 0
            L2a:
                r2.writeInt(r4)     // Catch: java.lang.Throwable -> La5
                boolean r4 = r9.encrypt     // Catch: java.lang.Throwable -> La5
                if (r4 == 0) goto L75
                r4 = 16
                byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> La5
                java.security.SecureRandom r7 = r9.random     // Catch: java.lang.Throwable -> La5
                java.lang.Object r7 = com.google.android.exoplayer2.util.Util.castNonNull(r7)     // Catch: java.lang.Throwable -> La5
                java.security.SecureRandom r7 = (java.security.SecureRandom) r7     // Catch: java.lang.Throwable -> La5
                r7.nextBytes(r4)     // Catch: java.lang.Throwable -> La5
                r2.write(r4)     // Catch: java.lang.Throwable -> La5
                javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> La5
                r7.<init>(r4)     // Catch: java.lang.Throwable -> La5
                javax.crypto.Cipher r4 = r9.cipher     // Catch: java.security.InvalidAlgorithmParameterException -> L6c java.security.InvalidKeyException -> L6e java.lang.Throwable -> La5
                java.lang.Object r4 = com.google.android.exoplayer2.util.Util.castNonNull(r4)     // Catch: java.security.InvalidAlgorithmParameterException -> L6c java.security.InvalidKeyException -> L6e java.lang.Throwable -> La5
                javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4     // Catch: java.security.InvalidAlgorithmParameterException -> L6c java.security.InvalidKeyException -> L6e java.lang.Throwable -> La5
                javax.crypto.spec.SecretKeySpec r8 = r9.secretKeySpec     // Catch: java.security.InvalidAlgorithmParameterException -> L6c java.security.InvalidKeyException -> L6e java.lang.Throwable -> La5
                java.lang.Object r8 = com.google.android.exoplayer2.util.Util.castNonNull(r8)     // Catch: java.security.InvalidAlgorithmParameterException -> L6c java.security.InvalidKeyException -> L6e java.lang.Throwable -> La5
                java.security.Key r8 = (java.security.Key) r8     // Catch: java.security.InvalidAlgorithmParameterException -> L6c java.security.InvalidKeyException -> L6e java.lang.Throwable -> La5
                r4.init(r5, r8, r7)     // Catch: java.security.InvalidAlgorithmParameterException -> L6c java.security.InvalidKeyException -> L6e java.lang.Throwable -> La5
                r2.flush()     // Catch: java.lang.Throwable -> La5
                java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> La5
                javax.crypto.CipherOutputStream r5 = new javax.crypto.CipherOutputStream     // Catch: java.lang.Throwable -> La5
                javax.crypto.Cipher r7 = r9.cipher     // Catch: java.lang.Throwable -> La5
                r5.<init>(r1, r7)     // Catch: java.lang.Throwable -> La5
                r4.<init>(r5)     // Catch: java.lang.Throwable -> La5
                r2 = r4
                goto L75
            L6c:
                r10 = move-exception
                goto L6f
            L6e:
                r10 = move-exception
            L6f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La5
                r0.<init>(r10)     // Catch: java.lang.Throwable -> La5
                throw r0     // Catch: java.lang.Throwable -> La5
            L75:
                int r1 = r10.size()     // Catch: java.lang.Throwable -> La5
                r2.writeInt(r1)     // Catch: java.lang.Throwable -> La5
                java.util.Collection r10 = r10.values()     // Catch: java.lang.Throwable -> La5
                java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> La5
            L84:
                boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> La5
                if (r1 == 0) goto L99
                java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> La5
                com.google.android.exoplayer2.upstream.cache.CachedContent r1 = (com.google.android.exoplayer2.upstream.cache.CachedContent) r1     // Catch: java.lang.Throwable -> La5
                r9.writeCachedContent(r1, r2)     // Catch: java.lang.Throwable -> La5
                int r1 = r9.hashCachedContent(r1, r3)     // Catch: java.lang.Throwable -> La5
                int r6 = r6 + r1
                goto L84
            L99:
                r2.writeInt(r6)     // Catch: java.lang.Throwable -> La5
                com.google.android.exoplayer2.util.AtomicFile r10 = r9.atomicFile     // Catch: java.lang.Throwable -> La5
                r10.endWrite(r2)     // Catch: java.lang.Throwable -> La5
                com.google.android.exoplayer2.util.Util.closeQuietly(r0)
                return
            La5:
                r10 = move-exception
                r0 = r2
                goto La9
            La8:
                r10 = move-exception
            La9:
                com.google.android.exoplayer2.util.Util.closeQuietly(r0)
                throw r10
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void delete() {
                r1 = this;
                com.google.android.exoplayer2.util.AtomicFile r0 = r1.atomicFile
                r0.delete()
                return
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public boolean exists() {
                r1 = this;
                com.google.android.exoplayer2.util.AtomicFile r0 = r1.atomicFile
                boolean r0 = r0.exists()
                return r0
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void initialize(long r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void load(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r2, android.util.SparseArray<java.lang.String> r3) {
                r1 = this;
                boolean r0 = r1.changed
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                boolean r0 = r1.readFile(r2, r3)
                if (r0 != 0) goto L18
                r2.clear()
                r3.clear()
                com.google.android.exoplayer2.util.AtomicFile r2 = r1.atomicFile
                r2.delete()
            L18:
                return
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void onRemove(com.google.android.exoplayer2.upstream.cache.CachedContent r1, boolean r2) {
                r0 = this;
                r1 = 1
                r0.changed = r1
                return
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void onUpdate(com.google.android.exoplayer2.upstream.cache.CachedContent r1) {
                r0 = this;
                r1 = 1
                r0.changed = r1
                return
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void storeFully(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r1) throws java.io.IOException {
                r0 = this;
                r0.writeFile(r1)
                r1 = 0
                r0.changed = r1
                return
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void storeIncremental(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r2) throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.changed
                if (r0 != 0) goto L5
                return
            L5:
                r1.storeFully(r2)
                return
        }
    }

    public interface Storage {
        void delete() throws java.io.IOException;

        boolean exists() throws java.io.IOException;

        void initialize(long r1);

        void load(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r1, android.util.SparseArray<java.lang.String> r2) throws java.io.IOException;

        void onRemove(com.google.android.exoplayer2.upstream.cache.CachedContent r1, boolean r2);

        void onUpdate(com.google.android.exoplayer2.upstream.cache.CachedContent r1);

        void storeFully(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r1) throws java.io.IOException;

        void storeIncremental(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r1) throws java.io.IOException;
    }

    public CachedContentIndex(com.google.android.exoplayer2.database.DatabaseProvider r7) {
            r6 = this;
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public CachedContentIndex(@androidx.annotation.Nullable com.google.android.exoplayer2.database.DatabaseProvider r4, @androidx.annotation.Nullable java.io.File r5, @androidx.annotation.Nullable byte[] r6, boolean r7, boolean r8) {
            r3 = this;
            r3.<init>()
            if (r4 != 0) goto La
            if (r5 == 0) goto L8
            goto La
        L8:
            r0 = 0
            goto Lb
        La:
            r0 = 1
        Lb:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.keyToContent = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.idToKey = r0
            android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
            r0.<init>()
            r3.removedIds = r0
            android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
            r0.<init>()
            r3.newIds = r0
            r0 = 0
            if (r4 == 0) goto L33
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$DatabaseStorage r1 = new com.google.android.exoplayer2.upstream.cache.CachedContentIndex$DatabaseStorage
            r1.<init>(r4)
            goto L34
        L33:
            r1 = r0
        L34:
            if (r5 == 0) goto L42
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$LegacyStorage r0 = new com.google.android.exoplayer2.upstream.cache.CachedContentIndex$LegacyStorage
            java.io.File r4 = new java.io.File
            java.lang.String r2 = "cached_content_index.exi"
            r4.<init>(r5, r2)
            r0.<init>(r4, r6, r7)
        L42:
            if (r1 == 0) goto L4e
            if (r0 == 0) goto L49
            if (r8 == 0) goto L49
            goto L4e
        L49:
            r3.storage = r1
            r3.previousStorage = r0
            goto L58
        L4e:
            java.lang.Object r4 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r4 = (com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage) r4
            r3.storage = r4
            r3.previousStorage = r1
        L58:
            return
    }

    public static /* synthetic */ javax.crypto.Cipher access$000() throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException {
            javax.crypto.Cipher r0 = getCipher()
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata access$100(java.io.DataInputStream r0) throws java.io.IOException {
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r0 = readContentMetadata(r0)
            return r0
    }

    public static /* synthetic */ void access$200(com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r0, java.io.DataOutputStream r1) throws java.io.IOException {
            writeContentMetadata(r0, r1)
            return
    }

    private com.google.android.exoplayer2.upstream.cache.CachedContent addNew(java.lang.String r6) {
            r5 = this;
            android.util.SparseArray<java.lang.String> r0 = r5.idToKey
            int r1 = r0.size()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lc
            r4 = 0
            goto L13
        Lc:
            int r4 = r1 + (-1)
            int r4 = r0.keyAt(r4)
            int r4 = r4 + r3
        L13:
            if (r4 >= 0) goto L22
        L15:
            if (r2 >= r1) goto L21
            int r4 = r0.keyAt(r2)
            if (r2 == r4) goto L1e
            goto L21
        L1e:
            int r2 = r2 + 1
            goto L15
        L21:
            r4 = r2
        L22:
            com.google.android.exoplayer2.upstream.cache.CachedContent r0 = new com.google.android.exoplayer2.upstream.cache.CachedContent
            r0.<init>(r4, r6)
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r1 = r5.keyToContent
            r1.put(r6, r0)
            android.util.SparseArray<java.lang.String> r1 = r5.idToKey
            r1.put(r4, r6)
            android.util.SparseBooleanArray r6 = r5.newIds
            r6.put(r4, r3)
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r6 = r5.storage
            r6.onUpdate(r0)
            return r0
    }

    @androidx.annotation.WorkerThread
    public static void delete(com.google.android.exoplayer2.database.DatabaseProvider r0, long r1) throws com.google.android.exoplayer2.database.DatabaseIOException {
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex.DatabaseStorage.delete(r0, r1)
            return
    }

    @android.annotation.SuppressLint({"GetInstance"})
    private static javax.crypto.Cipher getCipher() throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            java.lang.String r1 = "AES/CBC/PKCS5PADDING"
            r2 = 18
            if (r0 != r2) goto Lf
            java.lang.String r0 = "BC"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r1, r0)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r1)
            return r0
    }

    public static boolean isIndexFile(java.lang.String r1) {
            java.lang.String r0 = "cached_content_index.exi"
            boolean r1 = r1.startsWith(r0)
            return r1
    }

    private static com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata readContentMetadata(java.io.DataInputStream r10) throws java.io.IOException {
            int r0 = r10.readInt()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
        La:
            if (r2 >= r0) goto L44
            java.lang.String r3 = r10.readUTF()
            int r4 = r10.readInt()
            if (r4 < 0) goto L38
            r5 = 10485760(0xa00000, float:1.469368E-38)
            int r6 = java.lang.Math.min(r4, r5)
            byte[] r7 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
            r8 = 0
        L1f:
            if (r8 == r4) goto L32
            int r9 = r8 + r6
            byte[] r7 = java.util.Arrays.copyOf(r7, r9)
            r10.readFully(r7, r8, r6)
            int r6 = r4 - r9
            int r6 = java.lang.Math.min(r6, r5)
            r8 = r9
            goto L1f
        L32:
            r1.put(r3, r7)
            int r2 = r2 + 1
            goto La
        L38:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r0 = "Invalid value size: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4)
            r10.<init>(r0)
            throw r10
        L44:
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r10 = new com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata
            r10.<init>(r1)
            return r10
    }

    private static void writeContentMetadata(com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r2, java.io.DataOutputStream r3) throws java.io.IOException {
            java.util.Set r2 = r2.entrySet()
            int r0 = r2.size()
            r3.writeInt(r0)
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r3.writeUTF(r1)
            java.lang.Object r0 = r0.getValue()
            byte[] r0 = (byte[]) r0
            int r1 = r0.length
            r3.writeInt(r1)
            r3.write(r0)
            goto Lf
        L32:
            return
    }

    public void applyContentMetadataMutations(java.lang.String r1, com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations r2) {
            r0 = this;
            com.google.android.exoplayer2.upstream.cache.CachedContent r1 = r0.getOrAdd(r1)
            boolean r2 = r1.applyMetadataMutations(r2)
            if (r2 == 0) goto Lf
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r2 = r0.storage
            r2.onUpdate(r1)
        Lf:
            return
    }

    public int assignIdForKey(java.lang.String r1) {
            r0 = this;
            com.google.android.exoplayer2.upstream.cache.CachedContent r1 = r0.getOrAdd(r1)
            int r1 = r1.id
            return r1
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.upstream.cache.CachedContent get(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r0 = r1.keyToContent
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.upstream.cache.CachedContent r2 = (com.google.android.exoplayer2.upstream.cache.CachedContent) r2
            return r2
    }

    public java.util.Collection<com.google.android.exoplayer2.upstream.cache.CachedContent> getAll() {
            r1 = this;
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r0 = r1.keyToContent
            java.util.Collection r0 = r0.values()
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            return r0
    }

    public com.google.android.exoplayer2.upstream.cache.ContentMetadata getContentMetadata(java.lang.String r1) {
            r0 = this;
            com.google.android.exoplayer2.upstream.cache.CachedContent r1 = r0.get(r1)
            if (r1 == 0) goto Lb
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r1 = r1.getMetadata()
            goto Ld
        Lb:
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r1 = com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata.EMPTY
        Ld:
            return r1
    }

    @androidx.annotation.Nullable
    public java.lang.String getKeyForId(int r2) {
            r1 = this;
            android.util.SparseArray<java.lang.String> r0 = r1.idToKey
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public java.util.Set<java.lang.String> getKeys() {
            r1 = this;
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r0 = r1.keyToContent
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public com.google.android.exoplayer2.upstream.cache.CachedContent getOrAdd(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r0 = r1.keyToContent
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.upstream.cache.CachedContent r0 = (com.google.android.exoplayer2.upstream.cache.CachedContent) r0
            if (r0 != 0) goto Le
            com.google.android.exoplayer2.upstream.cache.CachedContent r0 = r1.addNew(r2)
        Le:
            return r0
    }

    @androidx.annotation.WorkerThread
    public void initialize(long r2) throws java.io.IOException {
            r1 = this;
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r0 = r1.storage
            r0.initialize(r2)
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r0 = r1.previousStorage
            if (r0 == 0) goto Lc
            r0.initialize(r2)
        Lc:
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r2 = r1.storage
            boolean r2 = r2.exists()
            if (r2 != 0) goto L2f
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r2 = r1.previousStorage
            if (r2 == 0) goto L2f
            boolean r2 = r2.exists()
            if (r2 == 0) goto L2f
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r2 = r1.previousStorage
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r3 = r1.keyToContent
            android.util.SparseArray<java.lang.String> r0 = r1.idToKey
            r2.load(r3, r0)
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r2 = r1.storage
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r3 = r1.keyToContent
            r2.storeFully(r3)
            goto L38
        L2f:
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r2 = r1.storage
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r3 = r1.keyToContent
            android.util.SparseArray<java.lang.String> r0 = r1.idToKey
            r2.load(r3, r0)
        L38:
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r2 = r1.previousStorage
            if (r2 == 0) goto L42
            r2.delete()
            r2 = 0
            r1.previousStorage = r2
        L42:
            return
    }

    public void maybeRemove(java.lang.String r4) {
            r3 = this;
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r0 = r3.keyToContent
            java.lang.Object r0 = r0.get(r4)
            com.google.android.exoplayer2.upstream.cache.CachedContent r0 = (com.google.android.exoplayer2.upstream.cache.CachedContent) r0
            if (r0 == 0) goto L41
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L41
            boolean r1 = r0.isFullyUnlocked()
            if (r1 == 0) goto L41
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r1 = r3.keyToContent
            r1.remove(r4)
            int r4 = r0.id
            android.util.SparseBooleanArray r1 = r3.newIds
            boolean r1 = r1.get(r4)
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r2 = r3.storage
            r2.onRemove(r0, r1)
            if (r1 == 0) goto L35
            android.util.SparseArray<java.lang.String> r0 = r3.idToKey
            r0.remove(r4)
            android.util.SparseBooleanArray r0 = r3.newIds
            r0.delete(r4)
            goto L41
        L35:
            android.util.SparseArray<java.lang.String> r0 = r3.idToKey
            r1 = 0
            r0.put(r4, r1)
            android.util.SparseBooleanArray r0 = r3.removedIds
            r1 = 1
            r0.put(r4, r1)
        L41:
            return
    }

    public void removeEmpty() {
            r2 = this;
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r0 = r2.keyToContent
            java.util.Set r0 = r0.keySet()
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.copyOf(r0)
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2.maybeRemove(r1)
            goto Le
        L1e:
            return
    }

    @androidx.annotation.WorkerThread
    public void store() throws java.io.IOException {
            r4 = this;
            com.google.android.exoplayer2.upstream.cache.CachedContentIndex$Storage r0 = r4.storage
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.CachedContent> r1 = r4.keyToContent
            r0.storeIncremental(r1)
            android.util.SparseBooleanArray r0 = r4.removedIds
            int r0 = r0.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L1e
            android.util.SparseArray<java.lang.String> r2 = r4.idToKey
            android.util.SparseBooleanArray r3 = r4.removedIds
            int r3 = r3.keyAt(r1)
            r2.remove(r3)
            int r1 = r1 + 1
            goto Le
        L1e:
            android.util.SparseBooleanArray r0 = r4.removedIds
            r0.clear()
            android.util.SparseBooleanArray r0 = r4.newIds
            r0.clear()
            return
    }
}
