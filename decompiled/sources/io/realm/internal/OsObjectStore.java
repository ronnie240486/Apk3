package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class OsObjectStore {
    public static final long SCHEMA_NOT_VERSIONED = -1;

    public OsObjectStore() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean callWithLock(io.realm.RealmConfiguration r0, java.lang.Runnable r1) {
            java.lang.String r0 = r0.getPath()
            boolean r0 = nativeCallWithLock(r0, r1)
            return r0
    }

    public static boolean deleteTableForObject(io.realm.internal.OsSharedRealm r2, java.lang.String r3) {
            long r0 = r2.getNativePtr()
            boolean r2 = nativeDeleteTableForObject(r0, r3)
            return r2
    }

    @javax.annotation.Nullable
    public static java.lang.String getPrimaryKeyForObject(io.realm.internal.OsSharedRealm r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.realm.internal.Util.getTablePrefix()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            long r0 = r2.getNativePtr()
            java.lang.String r2 = nativeGetPrimaryKeyForObject(r0, r3)
            return r2
    }

    public static long getSchemaVersion(io.realm.internal.OsSharedRealm r2) {
            long r0 = r2.getNativePtr()
            long r0 = nativeGetSchemaVersion(r0)
            return r0
    }

    private static native boolean nativeCallWithLock(java.lang.String r0, java.lang.Runnable r1);

    private static native boolean nativeDeleteTableForObject(long r0, java.lang.String r2);

    @javax.annotation.Nullable
    private static native java.lang.String nativeGetPrimaryKeyForObject(long r0, java.lang.String r2);

    private static native long nativeGetSchemaVersion(long r0);

    private static native void nativeSetPrimaryKeyForObject(long r0, java.lang.String r2, @javax.annotation.Nullable java.lang.String r3);

    private static native void nativeSetSchemaVersion(long r0, long r2);

    public static void setPrimaryKeyForObject(io.realm.internal.OsSharedRealm r2, java.lang.String r3, @javax.annotation.Nullable java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.realm.internal.Util.getTablePrefix()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            long r0 = r2.getNativePtr()
            nativeSetPrimaryKeyForObject(r0, r3, r4)
            return
    }

    public static void setSchemaVersion(io.realm.internal.OsSharedRealm r2, long r3) {
            long r0 = r2.getNativePtr()
            nativeSetSchemaVersion(r0, r3)
            return
    }
}
