package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public class OsCollectionChangeSet implements io.realm.OrderedCollectionChangeSet, io.realm.internal.NativeObject {
    public static final int MAX_ARRAY_LENGTH = 2147483639;
    public static final int TYPE_DELETION = 0;
    public static final int TYPE_INSERTION = 1;
    public static final int TYPE_MODIFICATION = 2;
    private static long finalizerPtr;
    private final boolean firstAsyncCallback;
    private final long nativePtr;

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.OsCollectionChangeSet.finalizerPtr = r0
            return
    }

    public OsCollectionChangeSet(long r1, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.nativePtr = r1
            r0.firstAsyncCallback = r3
            io.realm.internal.NativeContext r1 = io.realm.internal.NativeContext.dummyContext
            r1.addReference(r0)
            return
    }

    private io.realm.OrderedCollectionChangeSet.Range[] longArrayToRangeArray(int[] r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L6
            io.realm.OrderedCollectionChangeSet$Range[] r7 = new io.realm.OrderedCollectionChangeSet.Range[r0]
            return r7
        L6:
            int r1 = r7.length
            int r1 = r1 / 2
            io.realm.OrderedCollectionChangeSet$Range[] r2 = new io.realm.OrderedCollectionChangeSet.Range[r1]
        Lb:
            if (r0 >= r1) goto L1f
            io.realm.OrderedCollectionChangeSet$Range r3 = new io.realm.OrderedCollectionChangeSet$Range
            int r4 = r0 * 2
            r5 = r7[r4]
            int r4 = r4 + 1
            r4 = r7[r4]
            r3.<init>(r5, r4)
            r2[r0] = r3
            int r0 = r0 + 1
            goto Lb
        L1f:
            return r2
    }

    private static native long nativeGetFinalizerPtr();

    private static native int[] nativeGetIndices(long r0, int r2);

    private static native int[] nativeGetRanges(long r0, int r2);

    @Override // io.realm.OrderedCollectionChangeSet
    public io.realm.OrderedCollectionChangeSet.Range[] getChangeRanges() {
            r3 = this;
            long r0 = r3.nativePtr
            r2 = 2
            int[] r0 = nativeGetRanges(r0, r2)
            io.realm.OrderedCollectionChangeSet$Range[] r0 = r3.longArrayToRangeArray(r0)
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public int[] getChanges() {
            r3 = this;
            long r0 = r3.nativePtr
            r2 = 2
            int[] r0 = nativeGetIndices(r0, r2)
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public io.realm.OrderedCollectionChangeSet.Range[] getDeletionRanges() {
            r3 = this;
            long r0 = r3.nativePtr
            r2 = 0
            int[] r0 = nativeGetRanges(r0, r2)
            io.realm.OrderedCollectionChangeSet$Range[] r0 = r3.longArrayToRangeArray(r0)
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public int[] getDeletions() {
            r3 = this;
            long r0 = r3.nativePtr
            r2 = 0
            int[] r0 = nativeGetIndices(r0, r2)
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public java.lang.Throwable getError() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public io.realm.OrderedCollectionChangeSet.Range[] getInsertionRanges() {
            r3 = this;
            long r0 = r3.nativePtr
            r2 = 1
            int[] r0 = nativeGetRanges(r0, r2)
            io.realm.OrderedCollectionChangeSet$Range[] r0 = r3.longArrayToRangeArray(r0)
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public int[] getInsertions() {
            r3 = this;
            long r0 = r3.nativePtr
            r2 = 1
            int[] r0 = nativeGetIndices(r0, r2)
            return r0
    }

    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.OsCollectionChangeSet.finalizerPtr
            return r0
    }

    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public io.realm.OrderedCollectionChangeSet.State getState() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This method should be overridden in a subclass"
            r0.<init>(r1)
            throw r0
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

    public boolean isFirstAsyncCallback() {
            r1 = this;
            boolean r0 = r1.firstAsyncCallback
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            long r0 = r5.nativePtr
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            java.lang.String r0 = "Change set is empty."
            return r0
        Lb:
            java.lang.String r0 = "Deletion Ranges: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            io.realm.OrderedCollectionChangeSet$Range[] r1 = r5.getDeletionRanges()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "\nInsertion Ranges: "
            r0.append(r1)
            io.realm.OrderedCollectionChangeSet$Range[] r1 = r5.getInsertionRanges()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "\nChange Ranges: "
            r0.append(r1)
            io.realm.OrderedCollectionChangeSet$Range[] r1 = r5.getChangeRanges()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
