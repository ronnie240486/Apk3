package com.google.android.exoplayer2.database;

/* JADX INFO: loaded from: classes3.dex */
public final class DatabaseIOException extends java.io.IOException {
    public DatabaseIOException(android.database.SQLException r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public DatabaseIOException(android.database.SQLException r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2, r1)
            return
    }
}
