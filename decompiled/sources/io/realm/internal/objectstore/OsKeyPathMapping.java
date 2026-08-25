package io.realm.internal.objectstore;

/* JADX INFO: loaded from: classes2.dex */
public class OsKeyPathMapping implements io.realm.internal.NativeObject {
    private static final long nativeFinalizerPtr = 0;
    public long mappingPointer;

    static {
            long r0 = nativeGetFinalizerMethodPtr()
            io.realm.internal.objectstore.OsKeyPathMapping.nativeFinalizerPtr = r0
            return
    }

    public OsKeyPathMapping(long r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mappingPointer = r0
            long r3 = nativeCreateMapping(r3)
            r2.mappingPointer = r3
            io.realm.internal.NativeContext r3 = io.realm.internal.NativeContext.dummyContext
            r3.addReference(r2)
            return
    }

    private static native long nativeCreateMapping(long r0);

    private static native long nativeGetFinalizerMethodPtr();

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.objectstore.OsKeyPathMapping.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.mappingPointer
            return r0
    }
}
