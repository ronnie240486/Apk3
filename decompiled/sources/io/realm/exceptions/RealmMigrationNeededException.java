package io.realm.exceptions;

/* JADX INFO: loaded from: classes2.dex */
@io.realm.internal.Keep
public final class RealmMigrationNeededException extends java.lang.RuntimeException {
    private final java.lang.String canonicalRealmPath;

    public RealmMigrationNeededException(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.canonicalRealmPath = r1
            return
    }

    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.canonicalRealmPath
            return r0
    }
}
