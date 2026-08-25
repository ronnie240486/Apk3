package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes2.dex */
final class CacheFileMetadataIndex {
    private static final java.lang.String[] COLUMNS = null;
    private static final int COLUMN_INDEX_LAST_TOUCH_TIMESTAMP = 2;
    private static final int COLUMN_INDEX_LENGTH = 1;
    private static final int COLUMN_INDEX_NAME = 0;
    private static final java.lang.String COLUMN_LAST_TOUCH_TIMESTAMP = "last_touch_timestamp";
    private static final java.lang.String COLUMN_LENGTH = "length";
    private static final java.lang.String COLUMN_NAME = "name";
    private static final java.lang.String TABLE_PREFIX = "ExoPlayerCacheFileMetadata";
    private static final java.lang.String TABLE_SCHEMA = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";
    private static final int TABLE_VERSION = 1;
    private static final java.lang.String WHERE_NAME_EQUALS = "name = ?";
    private final com.google.android.exoplayer2.database.DatabaseProvider databaseProvider;
    private java.lang.String tableName;

    static {
            java.lang.String r0 = "name"
            java.lang.String r1 = "length"
            java.lang.String r2 = "last_touch_timestamp"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex.COLUMNS = r0
            return
    }

    public CacheFileMetadataIndex(com.google.android.exoplayer2.database.DatabaseProvider r1) {
            r0 = this;
            r0.<init>()
            r0.databaseProvider = r1
            return
    }

    @androidx.annotation.WorkerThread
    public static void delete(com.google.android.exoplayer2.database.DatabaseProvider r1, long r2) throws com.google.android.exoplayer2.database.DatabaseIOException {
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r3 = getTableName(r2)     // Catch: android.database.SQLException -> L22
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: android.database.SQLException -> L22
            r1.beginTransactionNonExclusive()     // Catch: android.database.SQLException -> L22
            r0 = 2
            com.google.android.exoplayer2.database.VersionTable.removeVersion(r1, r0, r2)     // Catch: java.lang.Throwable -> L1d
            dropTable(r1, r3)     // Catch: java.lang.Throwable -> L1d
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1d
            r1.endTransaction()     // Catch: android.database.SQLException -> L22
            return
        L1d:
            r2 = move-exception
            r1.endTransaction()     // Catch: android.database.SQLException -> L22
            throw r2     // Catch: android.database.SQLException -> L22
        L22:
            r1 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r2 = new com.google.android.exoplayer2.database.DatabaseIOException
            r2.<init>(r1)
            throw r2
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
            java.lang.String r0 = r9.tableName
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.database.DatabaseProvider r0 = r9.databaseProvider
            android.database.sqlite.SQLiteDatabase r1 = r0.getReadableDatabase()
            java.lang.String r2 = r9.tableName
            java.lang.String[] r3 = com.google.android.exoplayer2.upstream.cache.CacheFileMetadataIndex.COLUMNS
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private static java.lang.String getTableName(java.lang.String r1) {
            java.lang.String r0 = "ExoPlayerCacheFileMetadata"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
            return r1
    }

    @androidx.annotation.WorkerThread
    public java.util.Map<java.lang.String, com.google.android.exoplayer2.upstream.cache.CacheFileMetadata> getAll() throws com.google.android.exoplayer2.database.DatabaseIOException {
            r8 = this;
            android.database.Cursor r0 = r8.getCursor()     // Catch: android.database.SQLException -> L41
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L35
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L35
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L35
        Ld:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L31
            r2 = 0
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L35
            r3 = 1
            long r3 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L35
            r5 = 2
            long r5 = r0.getLong(r5)     // Catch: java.lang.Throwable -> L35
            com.google.android.exoplayer2.upstream.cache.CacheFileMetadata r7 = new com.google.android.exoplayer2.upstream.cache.CacheFileMetadata     // Catch: java.lang.Throwable -> L35
            r7.<init>(r3, r5)     // Catch: java.lang.Throwable -> L35
            r1.put(r2, r7)     // Catch: java.lang.Throwable -> L35
            goto Ld
        L31:
            r0.close()     // Catch: android.database.SQLException -> L41
            return r1
        L35:
            r1 = move-exception
            if (r0 == 0) goto L40
            r0.close()     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: android.database.SQLException -> L41
        L40:
            throw r1     // Catch: android.database.SQLException -> L41
        L41:
            r0 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r1 = new com.google.android.exoplayer2.database.DatabaseIOException
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.WorkerThread
    public void initialize(long r3) throws com.google.android.exoplayer2.database.DatabaseIOException {
            r2 = this;
            java.lang.String r3 = java.lang.Long.toHexString(r3)     // Catch: android.database.SQLException -> L56
            java.lang.String r4 = getTableName(r3)     // Catch: android.database.SQLException -> L56
            r2.tableName = r4     // Catch: android.database.SQLException -> L56
            com.google.android.exoplayer2.database.DatabaseProvider r4 = r2.databaseProvider     // Catch: android.database.SQLException -> L56
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()     // Catch: android.database.SQLException -> L56
            r0 = 2
            int r4 = com.google.android.exoplayer2.database.VersionTable.getVersion(r4, r0, r3)     // Catch: android.database.SQLException -> L56
            r1 = 1
            if (r4 == r1) goto L55
            com.google.android.exoplayer2.database.DatabaseProvider r4 = r2.databaseProvider     // Catch: android.database.SQLException -> L56
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()     // Catch: android.database.SQLException -> L56
            r4.beginTransactionNonExclusive()     // Catch: android.database.SQLException -> L56
            com.google.android.exoplayer2.database.VersionTable.setVersion(r4, r0, r3, r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = r2.tableName     // Catch: java.lang.Throwable -> L50
            dropTable(r4, r3)     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r3.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "CREATE TABLE "
            r3.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r2.tableName     // Catch: java.lang.Throwable -> L50
            r3.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = " "
            r3.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)"
            r3.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L50
            r4.execSQL(r3)     // Catch: java.lang.Throwable -> L50
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L50
            r4.endTransaction()     // Catch: android.database.SQLException -> L56
            goto L55
        L50:
            r3 = move-exception
            r4.endTransaction()     // Catch: android.database.SQLException -> L56
            throw r3     // Catch: android.database.SQLException -> L56
        L55:
            return
        L56:
            r3 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r4 = new com.google.android.exoplayer2.database.DatabaseIOException
            r4.<init>(r3)
            throw r4
    }

    @androidx.annotation.WorkerThread
    public void remove(java.lang.String r6) throws com.google.android.exoplayer2.database.DatabaseIOException {
            r5 = this;
            java.lang.String r0 = r5.tableName
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.database.DatabaseProvider r0 = r5.databaseProvider     // Catch: android.database.SQLException -> L19
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: android.database.SQLException -> L19
            java.lang.String r1 = r5.tableName     // Catch: android.database.SQLException -> L19
            java.lang.String r2 = "name = ?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: android.database.SQLException -> L19
            r4 = 0
            r3[r4] = r6     // Catch: android.database.SQLException -> L19
            r0.delete(r1, r2, r3)     // Catch: android.database.SQLException -> L19
            return
        L19:
            r6 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r0 = new com.google.android.exoplayer2.database.DatabaseIOException
            r0.<init>(r6)
            throw r0
    }

    @androidx.annotation.WorkerThread
    public void removeAll(java.util.Set<java.lang.String> r7) throws com.google.android.exoplayer2.database.DatabaseIOException {
            r6 = this;
            java.lang.String r0 = r6.tableName
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.database.DatabaseProvider r0 = r6.databaseProvider     // Catch: android.database.SQLException -> L38
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: android.database.SQLException -> L38
            r0.beginTransactionNonExclusive()     // Catch: android.database.SQLException -> L38
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L33
        L12:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r6.tableName     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "name = ?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L33
            r5 = 0
            r4[r5] = r1     // Catch: java.lang.Throwable -> L33
            r0.delete(r2, r3, r4)     // Catch: java.lang.Throwable -> L33
            goto L12
        L2c:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L33
            r0.endTransaction()     // Catch: android.database.SQLException -> L38
            return
        L33:
            r7 = move-exception
            r0.endTransaction()     // Catch: android.database.SQLException -> L38
            throw r7     // Catch: android.database.SQLException -> L38
        L38:
            r7 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r0 = new com.google.android.exoplayer2.database.DatabaseIOException
            r0.<init>(r7)
            throw r0
    }

    @androidx.annotation.WorkerThread
    public void set(java.lang.String r4, long r5, long r7) throws com.google.android.exoplayer2.database.DatabaseIOException {
            r3 = this;
            java.lang.String r0 = r3.tableName
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.database.DatabaseProvider r0 = r3.databaseProvider     // Catch: android.database.SQLException -> L2e
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: android.database.SQLException -> L2e
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: android.database.SQLException -> L2e
            r1.<init>()     // Catch: android.database.SQLException -> L2e
            java.lang.String r2 = "name"
            r1.put(r2, r4)     // Catch: android.database.SQLException -> L2e
            java.lang.String r4 = "length"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: android.database.SQLException -> L2e
            r1.put(r4, r5)     // Catch: android.database.SQLException -> L2e
            java.lang.String r4 = "last_touch_timestamp"
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch: android.database.SQLException -> L2e
            r1.put(r4, r5)     // Catch: android.database.SQLException -> L2e
            java.lang.String r4 = r3.tableName     // Catch: android.database.SQLException -> L2e
            r5 = 0
            r0.replaceOrThrow(r4, r5, r1)     // Catch: android.database.SQLException -> L2e
            return
        L2e:
            r4 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r5 = new com.google.android.exoplayer2.database.DatabaseIOException
            r5.<init>(r4)
            throw r5
    }
}
