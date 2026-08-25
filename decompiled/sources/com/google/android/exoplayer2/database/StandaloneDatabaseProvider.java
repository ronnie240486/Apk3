package com.google.android.exoplayer2.database;

/* JADX INFO: loaded from: classes.dex */
public class StandaloneDatabaseProvider extends android.database.sqlite.SQLiteOpenHelper implements com.google.android.exoplayer2.database.DatabaseProvider {
    public static final java.lang.String DATABASE_NAME = "exoplayer_internal.db";
    private static final java.lang.String TAG = "SADatabaseProvider";
    private static final int VERSION = 1;

    public StandaloneDatabaseProvider(android.content.Context r4) {
            r3 = this;
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r0 = "exoplayer_internal.db"
            r1 = 0
            r2 = 1
            r3.<init>(r4, r0, r1, r2)
            return
    }

    private static void wipeDatabase(android.database.sqlite.SQLiteDatabase r10) {
            java.lang.String r0 = "type"
            java.lang.String r1 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1}
            java.lang.String r3 = "sqlite_master"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7, r8, r9)
        L16:
            boolean r1 = r0.moveToNext()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L64
            r1 = 0
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L68
            r2 = 1
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = "sqlite_sequence"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L68
            if (r3 != 0) goto L16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r3.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = "DROP "
            r3.append(r4)     // Catch: java.lang.Throwable -> L68
            r3.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = " IF EXISTS "
            r3.append(r1)     // Catch: java.lang.Throwable -> L68
            r3.append(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L68
            r10.execSQL(r1)     // Catch: android.database.SQLException -> L4c java.lang.Throwable -> L68
            goto L16
        L4c:
            r2 = move-exception
            java.lang.String r3 = "SADatabaseProvider"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r4.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = "Error executing "
            r4.append(r5)     // Catch: java.lang.Throwable -> L68
            r4.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L68
            com.google.android.exoplayer2.util.Log.e(r3, r1, r2)     // Catch: java.lang.Throwable -> L68
            goto L16
        L64:
            r0.close()
            return
        L68:
            r10 = move-exception
            if (r0 == 0) goto L73
            r0.close()     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r0 = move-exception
            r10.addSuppressed(r0)
        L73:
            throw r10
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            wipeDatabase(r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }
}
