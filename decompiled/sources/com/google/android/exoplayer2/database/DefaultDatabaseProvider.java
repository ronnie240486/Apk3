package com.google.android.exoplayer2.database;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDatabaseProvider implements com.google.android.exoplayer2.database.DatabaseProvider {
    private final android.database.sqlite.SQLiteOpenHelper sqliteOpenHelper;

    public DefaultDatabaseProvider(android.database.sqlite.SQLiteOpenHelper r1) {
            r0 = this;
            r0.<init>()
            r0.sqliteOpenHelper = r1
            return
    }

    @Override // com.google.android.exoplayer2.database.DatabaseProvider
    public android.database.sqlite.SQLiteDatabase getReadableDatabase() {
            r1 = this;
            android.database.sqlite.SQLiteOpenHelper r0 = r1.sqliteOpenHelper
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()
            return r0
    }

    @Override // com.google.android.exoplayer2.database.DatabaseProvider
    public android.database.sqlite.SQLiteDatabase getWritableDatabase() {
            r1 = this;
            android.database.sqlite.SQLiteOpenHelper r0 = r1.sqliteOpenHelper
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()
            return r0
    }
}
