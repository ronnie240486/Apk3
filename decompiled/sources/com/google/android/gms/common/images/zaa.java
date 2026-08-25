package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zaa implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;

    @androidx.annotation.Nullable
    private final android.os.ParcelFileDescriptor zac;

    public zaa(com.google.android.gms.common.images.ImageManager r1, @androidx.annotation.Nullable android.net.Uri r2, android.os.ParcelFileDescriptor r3) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            r0.zab = r2
            r0.zac = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            java.lang.String r0 = "LoadBitmapFromDiskRunnable can't be executed in the main thread"
            com.google.android.gms.common.internal.Asserts.checkNotMainThread(r0)
            android.os.ParcelFileDescriptor r0 = r12.zac
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.String r4 = "ImageManager"
            if (r0 == 0) goto L38
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch: java.lang.OutOfMemoryError -> L18
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r0)     // Catch: java.lang.OutOfMemoryError -> L18
            r2 = r0
            goto L29
        L18:
            r0 = move-exception
            android.net.Uri r3 = r12.zab
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "OOM while loading bitmap for uri: "
            java.lang.String r3 = r5.concat(r3)
            android.util.Log.e(r4, r3, r0)
            r3 = 1
        L29:
            android.os.ParcelFileDescriptor r0 = r12.zac     // Catch: java.io.IOException -> L2f
            r0.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r0 = move-exception
            java.lang.String r5 = "closed failed"
            android.util.Log.e(r4, r5, r0)
        L35:
            r9 = r2
            r10 = r3
            goto L3a
        L38:
            r9 = r2
            r10 = 0
        L3a:
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r1)
            com.google.android.gms.common.images.ImageManager r7 = r12.zaa
            android.os.Handler r1 = com.google.android.gms.common.images.ImageManager.zab(r7)
            com.google.android.gms.common.images.zac r2 = new com.google.android.gms.common.images.zac
            android.net.Uri r8 = r12.zab
            r6 = r2
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            r1.post(r2)
            r0.await()     // Catch: java.lang.InterruptedException -> L55
            return
        L55:
            android.net.Uri r0 = r12.zab
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Latch interrupted while posting "
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r4, r0)
            return
    }
}
