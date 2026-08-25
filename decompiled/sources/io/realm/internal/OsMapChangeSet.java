package io.realm.internal;

/* JADX INFO: loaded from: classes3.dex */
public class OsMapChangeSet implements io.realm.internal.NativeObject {
    public static final int EMPTY_CHANGESET = 0;
    private static long finalizerPtr;
    private final long nativePtr;

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.OsMapChangeSet.finalizerPtr = r0
            return
    }

    public OsMapChangeSet(long r1) {
            r0 = this;
            r0.<init>()
            r0.nativePtr = r1
            return
    }

    private static native long nativeGetFinalizerPtr();

    private static native java.lang.String[] nativeGetStringKeyDeletions(long r0);

    private static native java.lang.String[] nativeGetStringKeyInsertions(long r0);

    private static native java.lang.String[] nativeGetStringKeyModifications(long r0);

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.OsMapChangeSet.finalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public java.lang.String[] getStringKeyDeletions() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String[] r0 = nativeGetStringKeyDeletions(r0)
            return r0
    }

    public java.lang.String[] getStringKeyInsertions() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String[] r0 = nativeGetStringKeyInsertions(r0)
            return r0
    }

    public java.lang.String[] getStringKeyModifications() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String[] r0 = nativeGetStringKeyModifications(r0)
            return r0
    }

    public boolean isEmpty() {
            r5 = this;
            long r0 = r5.nativePtr
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }
}
