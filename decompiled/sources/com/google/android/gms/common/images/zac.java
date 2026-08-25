package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zac implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;

    @androidx.annotation.Nullable
    private final android.graphics.Bitmap zac;
    private final java.util.concurrent.CountDownLatch zad;

    public zac(com.google.android.gms.common.images.ImageManager r1, @androidx.annotation.Nullable android.net.Uri r2, android.graphics.Bitmap r3, boolean r4, java.util.concurrent.CountDownLatch r5) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            r0.zab = r2
            r0.zac = r3
            r0.zad = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            java.lang.String r0 = "OnBitmapLoadedRunnable must be executed in the main thread"
            com.google.android.gms.common.internal.Asserts.checkMainThread(r0)
            android.graphics.Bitmap r0 = r10.zac
            com.google.android.gms.common.images.ImageManager r1 = r10.zaa
            java.util.Map r1 = com.google.android.gms.common.images.ImageManager.zah(r1)
            android.net.Uri r2 = r10.zab
            java.lang.Object r1 = r1.remove(r2)
            com.google.android.gms.common.images.ImageManager$ImageReceiver r1 = (com.google.android.gms.common.images.ImageManager.ImageReceiver) r1
            if (r1 == 0) goto L77
            java.util.ArrayList r1 = com.google.android.gms.common.images.ImageManager.ImageReceiver.zaa(r1)
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L21:
            if (r4 >= r2) goto L77
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.common.images.zag r5 = (com.google.android.gms.common.images.zag) r5
            android.graphics.Bitmap r6 = r10.zac
            if (r6 == 0) goto L49
            if (r0 == 0) goto L49
            com.google.android.gms.common.images.ImageManager r7 = r10.zaa
            android.content.Context r7 = com.google.android.gms.common.images.ImageManager.zaa(r7)
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.common.internal.Asserts.checkNotNull(r6)
            android.graphics.drawable.BitmapDrawable r8 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            r8.<init>(r7, r6)
            r6 = 1
            r5.zaa(r8, r3, r3, r6)
            goto L67
        L49:
            com.google.android.gms.common.images.ImageManager r6 = r10.zaa
            java.util.Map r6 = com.google.android.gms.common.images.ImageManager.zaf(r6)
            android.net.Uri r7 = r10.zab
            long r8 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.put(r7, r8)
            com.google.android.gms.common.images.ImageManager r6 = r10.zaa
            android.content.Context r6 = com.google.android.gms.common.images.ImageManager.zaa(r6)
            int r7 = com.google.android.gms.common.images.ImageManager.$r8$clinit
            r5.zab(r6, r3)
        L67:
            boolean r6 = r5 instanceof com.google.android.gms.common.images.zaf
            if (r6 != 0) goto L74
            com.google.android.gms.common.images.ImageManager r6 = r10.zaa
            java.util.Map r6 = com.google.android.gms.common.images.ImageManager.zag(r6)
            r6.remove(r5)
        L74:
            int r4 = r4 + 1
            goto L21
        L77:
            java.util.concurrent.CountDownLatch r0 = r10.zad
            r0.countDown()
            java.lang.Object r0 = com.google.android.gms.common.images.ImageManager.zad()
            monitor-enter(r0)
            java.util.HashSet r1 = com.google.android.gms.common.images.ImageManager.zae()     // Catch: java.lang.Throwable -> L8c
            android.net.Uri r2 = r10.zab     // Catch: java.lang.Throwable -> L8c
            r1.remove(r2)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            return
        L8c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            throw r1
    }
}
