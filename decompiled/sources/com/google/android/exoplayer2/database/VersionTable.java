package com.google.android.exoplayer2.database;

/* JADX INFO: loaded from: classes3.dex */
public final class VersionTable {
    private static final java.lang.String COLUMN_FEATURE = "feature";
    private static final java.lang.String COLUMN_INSTANCE_UID = "instance_uid";
    private static final java.lang.String COLUMN_VERSION = "version";
    public static final int FEATURE_CACHE_CONTENT_METADATA = 1;
    public static final int FEATURE_CACHE_FILE_METADATA = 2;
    public static final int FEATURE_EXTERNAL = 1000;
    public static final int FEATURE_OFFLINE = 0;
    private static final java.lang.String PRIMARY_KEY = "PRIMARY KEY (feature, instance_uid)";
    private static final java.lang.String SQL_CREATE_TABLE_IF_NOT_EXISTS = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";
    private static final java.lang.String TABLE_NAME = "ExoPlayerVersions";
    public static final int VERSION_UNSET = -1;
    private static final java.lang.String WHERE_FEATURE_AND_INSTANCE_UID_EQUALS = "feature = ? AND instance_uid = ?";

    static {
            java.lang.String r0 = "goog.exo.database"
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule(r0)
            return
    }

    private VersionTable() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String[] featureAndInstanceUidArguments(int r2, java.lang.String r3) {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r2 = java.lang.Integer.toString(r2)
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            return r0
    }

    public static int getVersion(android.database.sqlite.SQLiteDatabase r10, int r11, java.lang.String r12) throws com.google.android.exoplayer2.database.DatabaseIOException {
            java.lang.String r0 = "ExoPlayerVersions"
            boolean r0 = com.google.android.exoplayer2.util.Util.tableExists(r10, r0)     // Catch: android.database.SQLException -> L43
            r1 = -1
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r3 = "ExoPlayerVersions"
            java.lang.String r0 = "version"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: android.database.SQLException -> L43
            java.lang.String r5 = "feature = ? AND instance_uid = ?"
            java.lang.String[] r6 = featureAndInstanceUidArguments(r11, r12)     // Catch: android.database.SQLException -> L43
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: android.database.SQLException -> L43
            int r11 = r10.getCount()     // Catch: java.lang.Throwable -> L37
            if (r11 != 0) goto L2b
            r10.close()     // Catch: android.database.SQLException -> L43
            return r1
        L2b:
            r10.moveToNext()     // Catch: java.lang.Throwable -> L37
            r11 = 0
            int r11 = r10.getInt(r11)     // Catch: java.lang.Throwable -> L37
            r10.close()     // Catch: android.database.SQLException -> L43
            return r11
        L37:
            r11 = move-exception
            if (r10 == 0) goto L42
            r10.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r10 = move-exception
            r11.addSuppressed(r10)     // Catch: android.database.SQLException -> L43
        L42:
            throw r11     // Catch: android.database.SQLException -> L43
        L43:
            r10 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r11 = new com.google.android.exoplayer2.database.DatabaseIOException
            r11.<init>(r10)
            throw r11
    }

    public static void removeVersion(android.database.sqlite.SQLiteDatabase r2, int r3, java.lang.String r4) throws com.google.android.exoplayer2.database.DatabaseIOException {
            java.lang.String r0 = "ExoPlayerVersions"
            boolean r1 = com.google.android.exoplayer2.util.Util.tableExists(r2, r0)     // Catch: android.database.SQLException -> L13
            if (r1 != 0) goto L9
            return
        L9:
            java.lang.String r1 = "feature = ? AND instance_uid = ?"
            java.lang.String[] r3 = featureAndInstanceUidArguments(r3, r4)     // Catch: android.database.SQLException -> L13
            r2.delete(r0, r1, r3)     // Catch: android.database.SQLException -> L13
            return
        L13:
            r2 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r3 = new com.google.android.exoplayer2.database.DatabaseIOException
            r3.<init>(r2)
            throw r3
    }

    public static void setVersion(android.database.sqlite.SQLiteDatabase r2, int r3, java.lang.String r4, int r5) throws com.google.android.exoplayer2.database.DatabaseIOException {
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))"
            r2.execSQL(r0)     // Catch: android.database.SQLException -> L29
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: android.database.SQLException -> L29
            r0.<init>()     // Catch: android.database.SQLException -> L29
            java.lang.String r1 = "feature"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.SQLException -> L29
            r0.put(r1, r3)     // Catch: android.database.SQLException -> L29
            java.lang.String r3 = "instance_uid"
            r0.put(r3, r4)     // Catch: android.database.SQLException -> L29
            java.lang.String r3 = "version"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: android.database.SQLException -> L29
            r0.put(r3, r4)     // Catch: android.database.SQLException -> L29
            java.lang.String r3 = "ExoPlayerVersions"
            r4 = 0
            r2.replaceOrThrow(r3, r4, r0)     // Catch: android.database.SQLException -> L29
            return
        L29:
            r2 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r3 = new com.google.android.exoplayer2.database.DatabaseIOException
            r3.<init>(r2)
            throw r3
    }
}
