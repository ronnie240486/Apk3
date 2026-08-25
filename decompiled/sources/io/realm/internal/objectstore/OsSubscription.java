package io.realm.internal.objectstore;

/* JADX INFO: loaded from: classes.dex */
public class OsSubscription implements io.realm.internal.NativeObject, io.realm.mongodb.sync.Subscription {
    private static final long nativeFinalizerPtr = 0;
    private final long nativePtr;

    static {
            long r0 = nativeGetFinalizerMethodPtr()
            io.realm.internal.objectstore.OsSubscription.nativeFinalizerPtr = r0
            return
    }

    public OsSubscription(long r1) {
            r0 = this;
            r0.<init>()
            r0.nativePtr = r1
            return
    }

    private static native long nativeCreatedAt(long r0);

    private static native long nativeGetFinalizerMethodPtr();

    private static native java.lang.String nativeName(long r0);

    private static native java.lang.String nativeObjectClassName(long r0);

    private static native java.lang.String nativeQueryString(long r0);

    private static native long nativeUpdatedAt(long r0);

    public java.util.Date getCreatedAt() {
            r3 = this;
            java.util.Date r0 = new java.util.Date
            long r1 = r3.nativePtr
            long r1 = nativeCreatedAt(r1)
            r0.<init>(r1)
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r0 = nativeName(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            r0 = 0
        Ld:
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.objectstore.OsSubscription.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public java.lang.String getObjectType() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r0 = nativeObjectClassName(r0)
            return r0
    }

    public java.lang.String getQuery() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r0 = nativeQueryString(r0)
            return r0
    }

    public java.util.Date getUpdatedAt() {
            r3 = this;
            java.util.Date r0 = new java.util.Date
            long r1 = r3.nativePtr
            long r1 = nativeUpdatedAt(r1)
            r0.<init>(r1)
            return r0
    }
}
