package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleListRetriever extends android.os.Binder {
    private static final int REPLY_BREAK = 2;
    private static final int REPLY_CONTINUE = 1;
    private static final int REPLY_END_OF_LIST = 0;
    private static final int SUGGESTED_MAX_IPC_SIZE = 0;
    private final com.google.common.collect.ImmutableList<android.os.Bundle> list;

    static {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            int r0 = android.os.IBinder.getSuggestedMaxIpcSizeBytes()
            goto Ld
        Lb:
            r0 = 65536(0x10000, float:9.1835E-41)
        Ld:
            com.google.android.exoplayer2.BundleListRetriever.SUGGESTED_MAX_IPC_SIZE = r0
            return
    }

    public BundleListRetriever(java.util.List<android.os.Bundle> r1) {
            r0 = this;
            r0.<init>()
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
            r0.list = r1
            return
    }

    public static com.google.common.collect.ImmutableList<android.os.Bundle> getList(android.os.IBinder r7) {
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            r1 = 0
            r2 = 1
            r3 = 1
            r4 = 0
        L8:
            if (r3 == 0) goto L45
            android.os.Parcel r3 = android.os.Parcel.obtain()
            android.os.Parcel r5 = android.os.Parcel.obtain()
            r3.writeInt(r4)     // Catch: java.lang.Throwable -> L3d
            r7.transact(r2, r3, r5, r1)     // Catch: android.os.RemoteException -> L36 java.lang.Throwable -> L3d
        L18:
            int r6 = r5.readInt()     // Catch: java.lang.Throwable -> L3d
            if (r6 != r2) goto L2e
            android.os.Bundle r6 = r5.readBundle()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)     // Catch: java.lang.Throwable -> L3d
            android.os.Bundle r6 = (android.os.Bundle) r6     // Catch: java.lang.Throwable -> L3d
            r0.add(r6)     // Catch: java.lang.Throwable -> L3d
            int r4 = r4 + 1
            goto L18
        L2e:
            r5.recycle()
            r3.recycle()
            r3 = r6
            goto L8
        L36:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        L3d:
            r7 = move-exception
            r5.recycle()
            r3.recycle()
            throw r7
        L45:
            com.google.common.collect.ImmutableList r7 = r0.build()
            return r7
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, android.os.Parcel r5, @androidx.annotation.Nullable android.os.Parcel r6, int r7) throws android.os.RemoteException {
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L8
            boolean r4 = super.onTransact(r4, r5, r6, r7)
            return r4
        L8:
            r4 = 0
            if (r6 != 0) goto Lc
            return r4
        Lc:
            com.google.common.collect.ImmutableList<android.os.Bundle> r7 = r3.list
            int r7 = r7.size()
            int r5 = r5.readInt()
        L16:
            if (r5 >= r7) goto L31
            int r1 = r6.dataSize()
            int r2 = com.google.android.exoplayer2.BundleListRetriever.SUGGESTED_MAX_IPC_SIZE
            if (r1 >= r2) goto L31
            r6.writeInt(r0)
            com.google.common.collect.ImmutableList<android.os.Bundle> r1 = r3.list
            java.lang.Object r1 = r1.get(r5)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r6.writeBundle(r1)
            int r5 = r5 + 1
            goto L16
        L31:
            if (r5 >= r7) goto L34
            r4 = 2
        L34:
            r6.writeInt(r4)
            return r0
    }
}
