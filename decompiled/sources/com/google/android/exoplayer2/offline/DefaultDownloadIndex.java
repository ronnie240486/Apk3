package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDownloadIndex implements com.google.android.exoplayer2.offline.WritableDownloadIndex {
    private static final java.lang.String[] COLUMNS = null;
    private static final java.lang.String COLUMN_BYTES_DOWNLOADED = "bytes_downloaded";
    private static final java.lang.String COLUMN_CONTENT_LENGTH = "content_length";
    private static final java.lang.String COLUMN_CUSTOM_CACHE_KEY = "custom_cache_key";
    private static final java.lang.String COLUMN_DATA = "data";
    private static final java.lang.String COLUMN_FAILURE_REASON = "failure_reason";
    private static final java.lang.String COLUMN_ID = "id";
    private static final int COLUMN_INDEX_BYTES_DOWNLOADED = 13;
    private static final int COLUMN_INDEX_CONTENT_LENGTH = 9;
    private static final int COLUMN_INDEX_CUSTOM_CACHE_KEY = 4;
    private static final int COLUMN_INDEX_DATA = 5;
    private static final int COLUMN_INDEX_FAILURE_REASON = 11;
    private static final int COLUMN_INDEX_ID = 0;
    private static final int COLUMN_INDEX_KEY_SET_ID = 14;
    private static final int COLUMN_INDEX_MIME_TYPE = 1;
    private static final int COLUMN_INDEX_PERCENT_DOWNLOADED = 12;
    private static final int COLUMN_INDEX_START_TIME_MS = 7;
    private static final int COLUMN_INDEX_STATE = 6;
    private static final int COLUMN_INDEX_STOP_REASON = 10;
    private static final int COLUMN_INDEX_STREAM_KEYS = 3;
    private static final int COLUMN_INDEX_UPDATE_TIME_MS = 8;
    private static final int COLUMN_INDEX_URI = 2;
    private static final java.lang.String COLUMN_KEY_SET_ID = "key_set_id";
    private static final java.lang.String COLUMN_MIME_TYPE = "mime_type";
    private static final java.lang.String COLUMN_PERCENT_DOWNLOADED = "percent_downloaded";
    private static final java.lang.String COLUMN_START_TIME_MS = "start_time_ms";
    private static final java.lang.String COLUMN_STATE = "state";
    private static final java.lang.String COLUMN_STOP_REASON = "stop_reason";
    private static final java.lang.String COLUMN_STREAM_KEYS = "stream_keys";
    private static final java.lang.String COLUMN_UPDATE_TIME_MS = "update_time_ms";
    private static final java.lang.String COLUMN_URI = "uri";
    private static final java.lang.String TABLE_PREFIX = "ExoPlayerDownloads";
    private static final java.lang.String TABLE_SCHEMA = "(id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)";
    private static final java.lang.String TRUE = "1";
    private static final java.lang.String WHERE_ID_EQUALS = "id = ?";
    private static final java.lang.String WHERE_STATE_IS_DOWNLOADING = "state = 2";
    private static final java.lang.String WHERE_STATE_IS_TERMINAL = null;
    private final com.google.android.exoplayer2.database.DatabaseProvider databaseProvider;
    private final java.lang.Object initializationLock;

    @androidx.annotation.GuardedBy("initializationLock")
    private boolean initialized;
    private final java.lang.String name;
    private final java.lang.String tableName;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DefaultDownloadIndex$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class DownloadCursorImpl implements com.google.android.exoplayer2.offline.DownloadCursor {
        private final android.database.Cursor cursor;

        private DownloadCursorImpl(android.database.Cursor r1) {
                r0 = this;
                r0.<init>()
                r0.cursor = r1
                return
        }

        public /* synthetic */ DownloadCursorImpl(android.database.Cursor r1, com.google.android.exoplayer2.offline.DefaultDownloadIndex.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                android.database.Cursor r0 = r1.cursor
                r0.close()
                return
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public int getCount() {
                r1 = this;
                android.database.Cursor r0 = r1.cursor
                int r0 = r0.getCount()
                return r0
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public com.google.android.exoplayer2.offline.Download getDownload() {
                r1 = this;
                android.database.Cursor r0 = r1.cursor
                com.google.android.exoplayer2.offline.Download r0 = com.google.android.exoplayer2.offline.DefaultDownloadIndex.access$100(r0)
                return r0
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public int getPosition() {
                r1 = this;
                android.database.Cursor r0 = r1.cursor
                int r0 = r0.getPosition()
                return r0
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public final /* synthetic */ boolean isAfterLast() {
                r1 = this;
                boolean r0 = com.google.android.exoplayer2.offline.DownloadCursor.CC.$default$isAfterLast(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public final /* synthetic */ boolean isBeforeFirst() {
                r1 = this;
                boolean r0 = com.google.android.exoplayer2.offline.DownloadCursor.CC.$default$isBeforeFirst(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public boolean isClosed() {
                r1 = this;
                android.database.Cursor r0 = r1.cursor
                boolean r0 = r0.isClosed()
                return r0
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public final /* synthetic */ boolean isFirst() {
                r1 = this;
                boolean r0 = com.google.android.exoplayer2.offline.DownloadCursor.CC.$default$isFirst(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public final /* synthetic */ boolean isLast() {
                r1 = this;
                boolean r0 = com.google.android.exoplayer2.offline.DownloadCursor.CC.$default$isLast(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public final /* synthetic */ boolean moveToFirst() {
                r1 = this;
                boolean r0 = com.google.android.exoplayer2.offline.DownloadCursor.CC.$default$moveToFirst(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public final /* synthetic */ boolean moveToLast() {
                r1 = this;
                boolean r0 = com.google.android.exoplayer2.offline.DownloadCursor.CC.$default$moveToLast(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public final /* synthetic */ boolean moveToNext() {
                r1 = this;
                boolean r0 = com.google.android.exoplayer2.offline.DownloadCursor.CC.$default$moveToNext(r1)
                return r0
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public boolean moveToPosition(int r2) {
                r1 = this;
                android.database.Cursor r0 = r1.cursor
                boolean r2 = r0.moveToPosition(r2)
                return r2
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public final /* synthetic */ boolean moveToPrevious() {
                r1 = this;
                boolean r0 = com.google.android.exoplayer2.offline.DownloadCursor.CC.$default$moveToPrevious(r1)
                return r0
        }
    }

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0038: FILL_ARRAY_DATA , data: [3, 4} // fill-array
            java.lang.String r0 = getStateQuery(r0)
            com.google.android.exoplayer2.offline.DefaultDownloadIndex.WHERE_STATE_IS_TERMINAL = r0
            java.lang.String r1 = "id"
            java.lang.String r2 = "mime_type"
            java.lang.String r3 = "uri"
            java.lang.String r4 = "stream_keys"
            java.lang.String r5 = "custom_cache_key"
            java.lang.String r6 = "data"
            java.lang.String r7 = "state"
            java.lang.String r8 = "start_time_ms"
            java.lang.String r9 = "update_time_ms"
            java.lang.String r10 = "content_length"
            java.lang.String r11 = "stop_reason"
            java.lang.String r12 = "failure_reason"
            java.lang.String r13 = "percent_downloaded"
            java.lang.String r14 = "bytes_downloaded"
            java.lang.String r15 = "key_set_id"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            com.google.android.exoplayer2.offline.DefaultDownloadIndex.COLUMNS = r0
            return
    }

    public DefaultDownloadIndex(com.google.android.exoplayer2.database.DatabaseProvider r2) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r2, r0)
            return
    }

    public DefaultDownloadIndex(com.google.android.exoplayer2.database.DatabaseProvider r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.name = r2
            r0.databaseProvider = r1
            java.lang.String r1 = "ExoPlayerDownloads"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2)
            r0.tableName = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.initializationLock = r1
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.offline.Download access$100(android.database.Cursor r0) {
            com.google.android.exoplayer2.offline.Download r0 = getDownloadForCurrentRow(r0)
            return r0
    }

    private static java.util.List<com.google.android.exoplayer2.offline.StreamKey> decodeStreamKeys(@androidx.annotation.Nullable java.lang.String r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto Lc
            return r0
        Lc:
            java.lang.String r1 = ","
            java.lang.String[] r9 = com.google.android.exoplayer2.util.Util.split(r9, r1)
            int r1 = r9.length
            r2 = 0
            r3 = 0
        L15:
            if (r3 >= r1) goto L48
            r4 = r9[r3]
            java.lang.String r5 = "\\."
            java.lang.String[] r4 = com.google.android.exoplayer2.util.Util.split(r4, r5)
            int r5 = r4.length
            r6 = 3
            r7 = 1
            if (r5 != r6) goto L26
            r5 = 1
            goto L27
        L26:
            r5 = 0
        L27:
            com.google.android.exoplayer2.util.Assertions.checkState(r5)
            com.google.android.exoplayer2.offline.StreamKey r5 = new com.google.android.exoplayer2.offline.StreamKey
            r6 = r4[r2]
            int r6 = java.lang.Integer.parseInt(r6)
            r7 = r4[r7]
            int r7 = java.lang.Integer.parseInt(r7)
            r8 = 2
            r4 = r4[r8]
            int r4 = java.lang.Integer.parseInt(r4)
            r5.<init>(r6, r7, r4)
            r0.add(r5)
            int r3 = r3 + 1
            goto L15
        L48:
            return r0
    }

    private void ensureInitialized() throws com.google.android.exoplayer2.database.DatabaseIOException {
            r6 = this;
            java.lang.Object r0 = r6.initializationLock
            monitor-enter(r0)
            boolean r1 = r6.initialized     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            return
        L9:
            com.google.android.exoplayer2.database.DatabaseProvider r1 = r6.databaseProvider     // Catch: android.database.SQLException -> L8f java.lang.Throwable -> L96
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()     // Catch: android.database.SQLException -> L8f java.lang.Throwable -> L96
            java.lang.String r2 = r6.name     // Catch: android.database.SQLException -> L8f java.lang.Throwable -> L96
            r3 = 0
            int r1 = com.google.android.exoplayer2.database.VersionTable.getVersion(r1, r3, r2)     // Catch: android.database.SQLException -> L8f java.lang.Throwable -> L96
            r2 = 3
            if (r1 == r2) goto L8a
            com.google.android.exoplayer2.database.DatabaseProvider r4 = r6.databaseProvider     // Catch: android.database.SQLException -> L8f java.lang.Throwable -> L96
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()     // Catch: android.database.SQLException -> L8f java.lang.Throwable -> L96
            r4.beginTransactionNonExclusive()     // Catch: android.database.SQLException -> L8f java.lang.Throwable -> L96
            java.lang.String r5 = r6.name     // Catch: java.lang.Throwable -> L85
            com.google.android.exoplayer2.database.VersionTable.setVersion(r4, r3, r5, r2)     // Catch: java.lang.Throwable -> L85
            r2 = 2
            if (r1 != r2) goto L2f
            java.util.List r1 = r6.loadDownloadsFromVersion2(r4)     // Catch: java.lang.Throwable -> L85
            goto L34
        L2f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
        L34:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = "DROP TABLE IF EXISTS "
            r2.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = r6.tableName     // Catch: java.lang.Throwable -> L85
            r2.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L85
            r4.execSQL(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = "CREATE TABLE "
            r2.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = r6.tableName     // Catch: java.lang.Throwable -> L85
            r2.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = " "
            r2.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = "(id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)"
            r2.append(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L85
            r4.execSQL(r2)     // Catch: java.lang.Throwable -> L85
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L85
        L6e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L85
            com.google.android.exoplayer2.offline.Download r2 = (com.google.android.exoplayer2.offline.Download) r2     // Catch: java.lang.Throwable -> L85
            r6.putDownloadInternal(r2, r4)     // Catch: java.lang.Throwable -> L85
            goto L6e
        L7e:
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L85
            r4.endTransaction()     // Catch: android.database.SQLException -> L8f java.lang.Throwable -> L96
            goto L8a
        L85:
            r1 = move-exception
            r4.endTransaction()     // Catch: android.database.SQLException -> L8f java.lang.Throwable -> L96
            throw r1     // Catch: android.database.SQLException -> L8f java.lang.Throwable -> L96
        L8a:
            r1 = 1
            r6.initialized = r1     // Catch: android.database.SQLException -> L8f java.lang.Throwable -> L96
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            return
        L8f:
            r1 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r2 = new com.google.android.exoplayer2.database.DatabaseIOException     // Catch: java.lang.Throwable -> L96
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L96
            throw r2     // Catch: java.lang.Throwable -> L96
        L96:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            throw r1
    }

    private android.database.Cursor getCursor(java.lang.String r9, @androidx.annotation.Nullable java.lang.String[] r10) throws com.google.android.exoplayer2.database.DatabaseIOException {
            r8 = this;
            java.lang.String r7 = "start_time_ms ASC"
            com.google.android.exoplayer2.database.DatabaseProvider r0 = r8.databaseProvider     // Catch: android.database.sqlite.SQLiteException -> L16
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L16
            java.lang.String r1 = r8.tableName     // Catch: android.database.sqlite.SQLiteException -> L16
            java.lang.String[] r2 = com.google.android.exoplayer2.offline.DefaultDownloadIndex.COLUMNS     // Catch: android.database.sqlite.SQLiteException -> L16
            r5 = 0
            r6 = 0
            r3 = r9
            r4 = r10
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L16
            return r9
        L16:
            r9 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r10 = new com.google.android.exoplayer2.database.DatabaseIOException
            r10.<init>(r9)
            throw r10
    }

    private static com.google.android.exoplayer2.offline.Download getDownloadForCurrentRow(android.database.Cursor r15) {
            r0 = 14
            byte[] r0 = r15.getBlob(r0)
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r1 = new com.google.android.exoplayer2.offline.DownloadRequest$Builder
            r2 = 0
            java.lang.String r3 = r15.getString(r2)
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 2
            java.lang.String r4 = r15.getString(r4)
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            java.lang.String r4 = (java.lang.String) r4
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r1.<init>(r3, r4)
            r3 = 1
            java.lang.String r3 = r15.getString(r3)
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r1 = r1.setMimeType(r3)
            r3 = 3
            java.lang.String r3 = r15.getString(r3)
            java.util.List r3 = decodeStreamKeys(r3)
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r1 = r1.setStreamKeys(r3)
            int r3 = r0.length
            if (r3 <= 0) goto L3f
            goto L40
        L3f:
            r0 = 0
        L40:
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r0 = r1.setKeySetId(r0)
            r1 = 4
            java.lang.String r3 = r15.getString(r1)
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r0 = r0.setCustomCacheKey(r3)
            r3 = 5
            byte[] r3 = r15.getBlob(r3)
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r0 = r0.setData(r3)
            com.google.android.exoplayer2.offline.DownloadRequest r4 = r0.build()
            com.google.android.exoplayer2.offline.DownloadProgress r14 = new com.google.android.exoplayer2.offline.DownloadProgress
            r14.<init>()
            r0 = 13
            long r5 = r15.getLong(r0)
            r14.bytesDownloaded = r5
            r0 = 12
            float r0 = r15.getFloat(r0)
            r14.percentDownloaded = r0
            r0 = 6
            int r5 = r15.getInt(r0)
            if (r5 != r1) goto L7e
            r0 = 11
            int r2 = r15.getInt(r0)
            r13 = r2
            goto L7f
        L7e:
            r13 = 0
        L7f:
            com.google.android.exoplayer2.offline.Download r0 = new com.google.android.exoplayer2.offline.Download
            r1 = 7
            long r6 = r15.getLong(r1)
            r1 = 8
            long r8 = r15.getLong(r1)
            r1 = 9
            long r10 = r15.getLong(r1)
            r1 = 10
            int r12 = r15.getInt(r1)
            r3 = r0
            r3.<init>(r4, r5, r6, r8, r10, r12, r13, r14)
            return r0
    }

    private static com.google.android.exoplayer2.offline.Download getDownloadForCurrentRowV2(android.database.Cursor r15) {
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r0 = new com.google.android.exoplayer2.offline.DownloadRequest$Builder
            r1 = 0
            java.lang.String r2 = r15.getString(r1)
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 2
            java.lang.String r3 = r15.getString(r3)
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r0.<init>(r2, r3)
            r2 = 1
            java.lang.String r2 = r15.getString(r2)
            java.lang.String r2 = inferMimeType(r2)
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r0 = r0.setMimeType(r2)
            r2 = 3
            java.lang.String r2 = r15.getString(r2)
            java.util.List r2 = decodeStreamKeys(r2)
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r0 = r0.setStreamKeys(r2)
            r2 = 4
            java.lang.String r3 = r15.getString(r2)
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r0 = r0.setCustomCacheKey(r3)
            r3 = 5
            byte[] r3 = r15.getBlob(r3)
            com.google.android.exoplayer2.offline.DownloadRequest$Builder r0 = r0.setData(r3)
            com.google.android.exoplayer2.offline.DownloadRequest r4 = r0.build()
            com.google.android.exoplayer2.offline.DownloadProgress r14 = new com.google.android.exoplayer2.offline.DownloadProgress
            r14.<init>()
            r0 = 13
            long r5 = r15.getLong(r0)
            r14.bytesDownloaded = r5
            r0 = 12
            float r0 = r15.getFloat(r0)
            r14.percentDownloaded = r0
            r0 = 6
            int r5 = r15.getInt(r0)
            if (r5 != r2) goto L73
            r0 = 11
            int r1 = r15.getInt(r0)
            r13 = r1
            goto L74
        L73:
            r13 = 0
        L74:
            com.google.android.exoplayer2.offline.Download r0 = new com.google.android.exoplayer2.offline.Download
            r1 = 7
            long r6 = r15.getLong(r1)
            r1 = 8
            long r8 = r15.getLong(r1)
            r1 = 9
            long r10 = r15.getLong(r1)
            r1 = 10
            int r12 = r15.getInt(r1)
            r3 = r0
            r3.<init>(r4, r5, r6, r8, r10, r12, r13, r14)
            return r0
    }

    private static java.lang.String getStateQuery(int... r3) {
            int r0 = r3.length
            if (r0 != 0) goto L6
            java.lang.String r3 = "1"
            return r3
        L6:
            java.lang.String r0 = "state"
            java.lang.String r1 = " IN ("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r1)
            r1 = 0
        L10:
            int r2 = r3.length
            if (r1 >= r2) goto L22
            if (r1 <= 0) goto L1a
            r2 = 44
            r0.append(r2)
        L1a:
            r2 = r3[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L10
        L22:
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String inferMimeType(@androidx.annotation.Nullable java.lang.String r1) {
            java.lang.String r0 = "dash"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            java.lang.String r1 = "application/dash+xml"
            return r1
        Lb:
            java.lang.String r0 = "hls"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            java.lang.String r1 = "application/x-mpegURL"
            return r1
        L16:
            java.lang.String r0 = "ss"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L22
            java.lang.String r1 = "application/vnd.ms-sstr+xml"
            return r1
        L22:
            java.lang.String r1 = "video/x-unknown"
            return r1
    }

    private java.util.List<com.google.android.exoplayer2.offline.Download> loadDownloadsFromVersion2(android.database.sqlite.SQLiteDatabase r19) {
            r18 = this;
            r1 = r18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = r1.tableName
            r3 = r19
            boolean r2 = com.google.android.exoplayer2.util.Util.tableExists(r3, r2)
            if (r2 != 0) goto L12
            return r0
        L12:
            java.lang.String r4 = "id"
            java.lang.String r5 = "title"
            java.lang.String r6 = "uri"
            java.lang.String r7 = "stream_keys"
            java.lang.String r8 = "custom_cache_key"
            java.lang.String r9 = "data"
            java.lang.String r10 = "state"
            java.lang.String r11 = "start_time_ms"
            java.lang.String r12 = "update_time_ms"
            java.lang.String r13 = "content_length"
            java.lang.String r14 = "stop_reason"
            java.lang.String r15 = "failure_reason"
            java.lang.String r16 = "percent_downloaded"
            java.lang.String r17 = "bytes_downloaded"
            java.lang.String[] r5 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
            java.lang.String r4 = r1.tableName
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r19
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)
        L46:
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L54
            com.google.android.exoplayer2.offline.Download r3 = getDownloadForCurrentRowV2(r2)     // Catch: java.lang.Throwable -> L58
            r0.add(r3)     // Catch: java.lang.Throwable -> L58
            goto L46
        L54:
            r2.close()
            return r0
        L58:
            r0 = move-exception
            r3 = r0
            if (r2 == 0) goto L65
            r2.close()     // Catch: java.lang.Throwable -> L60
            goto L65
        L60:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)
        L65:
            throw r3
    }

    private void putDownloadInternal(com.google.android.exoplayer2.offline.Download r9, android.database.sqlite.SQLiteDatabase r10) {
            r8 = this;
            com.google.android.exoplayer2.offline.DownloadRequest r0 = r9.request
            byte[] r0 = r0.keySetId
            if (r0 != 0) goto L8
            byte[] r0 = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY
        L8:
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            com.google.android.exoplayer2.offline.DownloadRequest r2 = r9.request
            java.lang.String r2 = r2.id
            java.lang.String r3 = "id"
            r1.put(r3, r2)
            com.google.android.exoplayer2.offline.DownloadRequest r2 = r9.request
            java.lang.String r2 = r2.mimeType
            java.lang.String r3 = "mime_type"
            r1.put(r3, r2)
            com.google.android.exoplayer2.offline.DownloadRequest r2 = r9.request
            android.net.Uri r2 = r2.uri
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "uri"
            r1.put(r3, r2)
            com.google.android.exoplayer2.offline.DownloadRequest r2 = r9.request
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> r2 = r2.streamKeys
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
        L37:
            int r5 = r2.size()
            if (r4 >= r5) goto L62
            java.lang.Object r5 = r2.get(r4)
            com.google.android.exoplayer2.offline.StreamKey r5 = (com.google.android.exoplayer2.offline.StreamKey) r5
            int r6 = r5.periodIndex
            r3.append(r6)
            r6 = 46
            r3.append(r6)
            int r7 = r5.groupIndex
            r3.append(r7)
            r3.append(r6)
            int r5 = r5.streamIndex
            r3.append(r5)
            r5 = 44
            r3.append(r5)
            int r4 = r4 + 1
            goto L37
        L62:
            int r2 = r3.length()
            if (r2 <= 0) goto L71
            int r2 = r3.length()
            int r2 = r2 + (-1)
            r3.setLength(r2)
        L71:
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "stream_keys"
            r1.put(r3, r2)
            com.google.android.exoplayer2.offline.DownloadRequest r2 = r9.request
            java.lang.String r2 = r2.customCacheKey
            java.lang.String r3 = "custom_cache_key"
            r1.put(r3, r2)
            com.google.android.exoplayer2.offline.DownloadRequest r2 = r9.request
            byte[] r2 = r2.data
            java.lang.String r3 = "data"
            r1.put(r3, r2)
            int r2 = r9.state
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "state"
            r1.put(r3, r2)
            long r2 = r9.startTimeMs
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "start_time_ms"
            r1.put(r3, r2)
            long r2 = r9.updateTimeMs
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "update_time_ms"
            r1.put(r3, r2)
            long r2 = r9.contentLength
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "content_length"
            r1.put(r3, r2)
            int r2 = r9.stopReason
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "stop_reason"
            r1.put(r3, r2)
            int r2 = r9.failureReason
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "failure_reason"
            r1.put(r3, r2)
            float r2 = r9.getPercentDownloaded()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.String r3 = "percent_downloaded"
            r1.put(r3, r2)
            long r2 = r9.getBytesDownloaded()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "bytes_downloaded"
            r1.put(r2, r9)
            java.lang.String r9 = "key_set_id"
            r1.put(r9, r0)
            java.lang.String r9 = r8.tableName
            r0 = 0
            r10.replaceOrThrow(r9, r0, r1)
            return
    }

    @Override // com.google.android.exoplayer2.offline.DownloadIndex
    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.offline.Download getDownload(java.lang.String r4) throws com.google.android.exoplayer2.database.DatabaseIOException {
            r3 = this;
            r3.ensureInitialized()
            java.lang.String r0 = "id = ?"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: android.database.sqlite.SQLiteException -> L31
            r2 = 0
            r1[r2] = r4     // Catch: android.database.sqlite.SQLiteException -> L31
            android.database.Cursor r4 = r3.getCursor(r0, r1)     // Catch: android.database.sqlite.SQLiteException -> L31
            int r0 = r4.getCount()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L1a
            r0 = 0
            r4.close()     // Catch: android.database.sqlite.SQLiteException -> L31
            return r0
        L1a:
            r4.moveToNext()     // Catch: java.lang.Throwable -> L25
            com.google.android.exoplayer2.offline.Download r0 = getDownloadForCurrentRow(r4)     // Catch: java.lang.Throwable -> L25
            r4.close()     // Catch: android.database.sqlite.SQLiteException -> L31
            return r0
        L25:
            r0 = move-exception
            if (r4 == 0) goto L30
            r4.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: android.database.sqlite.SQLiteException -> L31
        L30:
            throw r0     // Catch: android.database.sqlite.SQLiteException -> L31
        L31:
            r4 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r0 = new com.google.android.exoplayer2.database.DatabaseIOException
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.android.exoplayer2.offline.DownloadIndex
    public com.google.android.exoplayer2.offline.DownloadCursor getDownloads(int... r3) throws com.google.android.exoplayer2.database.DatabaseIOException {
            r2 = this;
            r2.ensureInitialized()
            java.lang.String r3 = getStateQuery(r3)
            r0 = 0
            android.database.Cursor r3 = r2.getCursor(r3, r0)
            com.google.android.exoplayer2.offline.DefaultDownloadIndex$DownloadCursorImpl r1 = new com.google.android.exoplayer2.offline.DefaultDownloadIndex$DownloadCursorImpl
            r1.<init>(r3, r0)
            return r1
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void putDownload(com.google.android.exoplayer2.offline.Download r2) throws com.google.android.exoplayer2.database.DatabaseIOException {
            r1 = this;
            r1.ensureInitialized()
            com.google.android.exoplayer2.database.DatabaseProvider r0 = r1.databaseProvider     // Catch: android.database.sqlite.SQLiteException -> Ld
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> Ld
            r1.putDownloadInternal(r2, r0)     // Catch: android.database.sqlite.SQLiteException -> Ld
            return
        Ld:
            r2 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r0 = new com.google.android.exoplayer2.database.DatabaseIOException
            r0.<init>(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void removeDownload(java.lang.String r6) throws com.google.android.exoplayer2.database.DatabaseIOException {
            r5 = this;
            r5.ensureInitialized()
            com.google.android.exoplayer2.database.DatabaseProvider r0 = r5.databaseProvider     // Catch: android.database.sqlite.SQLiteException -> L17
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L17
            java.lang.String r1 = r5.tableName     // Catch: android.database.sqlite.SQLiteException -> L17
            java.lang.String r2 = "id = ?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: android.database.sqlite.SQLiteException -> L17
            r4 = 0
            r3[r4] = r6     // Catch: android.database.sqlite.SQLiteException -> L17
            r0.delete(r1, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L17
            return
        L17:
            r6 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r0 = new com.google.android.exoplayer2.database.DatabaseIOException
            r0.<init>(r6)
            throw r0
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void setDownloadingStatesToQueued() throws com.google.android.exoplayer2.database.DatabaseIOException {
            r5 = this;
            r5.ensureInitialized()
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: android.database.SQLException -> L23
            r0.<init>()     // Catch: android.database.SQLException -> L23
            java.lang.String r1 = "state"
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.SQLException -> L23
            r0.put(r1, r2)     // Catch: android.database.SQLException -> L23
            com.google.android.exoplayer2.database.DatabaseProvider r1 = r5.databaseProvider     // Catch: android.database.SQLException -> L23
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: android.database.SQLException -> L23
            java.lang.String r2 = r5.tableName     // Catch: android.database.SQLException -> L23
            java.lang.String r3 = "state = 2"
            r4 = 0
            r1.update(r2, r0, r3, r4)     // Catch: android.database.SQLException -> L23
            return
        L23:
            r0 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r1 = new com.google.android.exoplayer2.database.DatabaseIOException
            r1.<init>(r0)
            throw r1
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void setStatesToRemoving() throws com.google.android.exoplayer2.database.DatabaseIOException {
            r4 = this;
            r4.ensureInitialized()
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: android.database.SQLException -> L2a
            r0.<init>()     // Catch: android.database.SQLException -> L2a
            java.lang.String r1 = "state"
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.SQLException -> L2a
            r0.put(r1, r2)     // Catch: android.database.SQLException -> L2a
            java.lang.String r1 = "failure_reason"
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.SQLException -> L2a
            r0.put(r1, r2)     // Catch: android.database.SQLException -> L2a
            com.google.android.exoplayer2.database.DatabaseProvider r1 = r4.databaseProvider     // Catch: android.database.SQLException -> L2a
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: android.database.SQLException -> L2a
            java.lang.String r2 = r4.tableName     // Catch: android.database.SQLException -> L2a
            r3 = 0
            r1.update(r2, r0, r3, r3)     // Catch: android.database.SQLException -> L2a
            return
        L2a:
            r0 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r1 = new com.google.android.exoplayer2.database.DatabaseIOException
            r1.<init>(r0)
            throw r1
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void setStopReason(int r5) throws com.google.android.exoplayer2.database.DatabaseIOException {
            r4 = this;
            r4.ensureInitialized()
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: android.database.SQLException -> L21
            r0.<init>()     // Catch: android.database.SQLException -> L21
            java.lang.String r1 = "stop_reason"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: android.database.SQLException -> L21
            r0.put(r1, r5)     // Catch: android.database.SQLException -> L21
            com.google.android.exoplayer2.database.DatabaseProvider r5 = r4.databaseProvider     // Catch: android.database.SQLException -> L21
            android.database.sqlite.SQLiteDatabase r5 = r5.getWritableDatabase()     // Catch: android.database.SQLException -> L21
            java.lang.String r1 = r4.tableName     // Catch: android.database.SQLException -> L21
            java.lang.String r2 = com.google.android.exoplayer2.offline.DefaultDownloadIndex.WHERE_STATE_IS_TERMINAL     // Catch: android.database.SQLException -> L21
            r3 = 0
            r5.update(r1, r0, r2, r3)     // Catch: android.database.SQLException -> L21
            return
        L21:
            r5 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r0 = new com.google.android.exoplayer2.database.DatabaseIOException
            r0.<init>(r5)
            throw r0
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void setStopReason(java.lang.String r6, int r7) throws com.google.android.exoplayer2.database.DatabaseIOException {
            r5 = this;
            r5.ensureInitialized()
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: android.database.SQLException -> L3c
            r0.<init>()     // Catch: android.database.SQLException -> L3c
            java.lang.String r1 = "stop_reason"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: android.database.SQLException -> L3c
            r0.put(r1, r7)     // Catch: android.database.SQLException -> L3c
            com.google.android.exoplayer2.database.DatabaseProvider r7 = r5.databaseProvider     // Catch: android.database.SQLException -> L3c
            android.database.sqlite.SQLiteDatabase r7 = r7.getWritableDatabase()     // Catch: android.database.SQLException -> L3c
            java.lang.String r1 = r5.tableName     // Catch: android.database.SQLException -> L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> L3c
            r2.<init>()     // Catch: android.database.SQLException -> L3c
            java.lang.String r3 = com.google.android.exoplayer2.offline.DefaultDownloadIndex.WHERE_STATE_IS_TERMINAL     // Catch: android.database.SQLException -> L3c
            r2.append(r3)     // Catch: android.database.SQLException -> L3c
            java.lang.String r3 = " AND "
            r2.append(r3)     // Catch: android.database.SQLException -> L3c
            java.lang.String r3 = "id = ?"
            r2.append(r3)     // Catch: android.database.SQLException -> L3c
            java.lang.String r2 = r2.toString()     // Catch: android.database.SQLException -> L3c
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: android.database.SQLException -> L3c
            r4 = 0
            r3[r4] = r6     // Catch: android.database.SQLException -> L3c
            r7.update(r1, r0, r2, r3)     // Catch: android.database.SQLException -> L3c
            return
        L3c:
            r6 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r7 = new com.google.android.exoplayer2.database.DatabaseIOException
            r7.<init>(r6)
            throw r7
    }
}
