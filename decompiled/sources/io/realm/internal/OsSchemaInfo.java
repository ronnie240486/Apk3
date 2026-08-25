package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class OsSchemaInfo implements io.realm.internal.NativeObject {
    private static final long nativeFinalizerPtr = 0;
    private long nativePtr;
    private final io.realm.internal.OsSharedRealm sharedRealm;

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.OsSchemaInfo.nativeFinalizerPtr = r0
            return
    }

    public OsSchemaInfo(long r1, io.realm.internal.OsSharedRealm r3) {
            r0 = this;
            r0.<init>()
            r0.nativePtr = r1
            r0.sharedRealm = r3
            return
    }

    public OsSchemaInfo(java.util.Collection<io.realm.internal.OsObjectSchemaInfo> r3) {
            r2 = this;
            r2.<init>()
            long[] r3 = convertObjectSchemaInfoListToNativePointerArray(r3)
            long r0 = nativeCreateFromList(r3)
            r2.nativePtr = r0
            io.realm.internal.NativeContext r3 = io.realm.internal.NativeContext.dummyContext
            r3.addReference(r2)
            r3 = 0
            r2.sharedRealm = r3
            return
    }

    private static long[] convertObjectSchemaInfoListToNativePointerArray(java.util.Collection<io.realm.internal.OsObjectSchemaInfo> r4) {
            int r0 = r4.size()
            long[] r0 = new long[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r4.next()
            io.realm.internal.OsObjectSchemaInfo r2 = (io.realm.internal.OsObjectSchemaInfo) r2
            long r2 = r2.getNativePtr()
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lb
        L20:
            return r0
    }

    private static native long nativeCreateFromList(long[] r0);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetObjectSchemaInfo(long r0, java.lang.String r2);

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.OsSchemaInfo.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public io.realm.internal.OsObjectSchemaInfo getObjectSchemaInfo(java.lang.String r4) {
            r3 = this;
            io.realm.internal.OsObjectSchemaInfo r0 = new io.realm.internal.OsObjectSchemaInfo
            long r1 = r3.nativePtr
            long r1 = nativeGetObjectSchemaInfo(r1, r4)
            r0.<init>(r1)
            return r0
    }
}
