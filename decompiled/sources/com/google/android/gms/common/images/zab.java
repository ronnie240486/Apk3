package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zab implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final com.google.android.gms.common.images.zag zab;

    public zab(com.google.android.gms.common.images.ImageManager r1, com.google.android.gms.common.images.zag r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            r0.zab = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            java.lang.String r0 = "LoadImageRunnable must be executed on the main thread"
            com.google.android.gms.common.internal.Asserts.checkMainThread(r0)
            com.google.android.gms.common.images.ImageManager r0 = r8.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zag(r0)
            com.google.android.gms.common.images.zag r1 = r8.zab
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.images.ImageManager$ImageReceiver r0 = (com.google.android.gms.common.images.ImageManager.ImageReceiver) r0
            if (r0 == 0) goto L25
            com.google.android.gms.common.images.ImageManager r1 = r8.zaa
            java.util.Map r1 = com.google.android.gms.common.images.ImageManager.zag(r1)
            com.google.android.gms.common.images.zag r2 = r8.zab
            r1.remove(r2)
            com.google.android.gms.common.images.zag r1 = r8.zab
            r0.zac(r1)
        L25:
            com.google.android.gms.common.images.zag r0 = r8.zab
            com.google.android.gms.common.images.zad r1 = r0.zaa
            android.net.Uri r2 = r1.zaa
            r3 = 1
            if (r2 == 0) goto Lc6
            com.google.android.gms.common.images.ImageManager r0 = r8.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zaf(r0)
            java.lang.Object r0 = r0.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L65
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r0.longValue()
            long r4 = r4 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L5a
            com.google.android.gms.common.images.zag r0 = r8.zab
            com.google.android.gms.common.images.ImageManager r1 = r8.zaa
            android.content.Context r1 = com.google.android.gms.common.images.ImageManager.zaa(r1)
            int r2 = com.google.android.gms.common.images.ImageManager.$r8$clinit
            r0.zab(r1, r3)
            return
        L5a:
            com.google.android.gms.common.images.ImageManager r0 = r8.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zaf(r0)
            android.net.Uri r2 = r1.zaa
            r0.remove(r2)
        L65:
            com.google.android.gms.common.images.zag r0 = r8.zab
            r2 = 0
            r4 = 0
            r0.zaa(r2, r4, r3, r4)
            com.google.android.gms.common.images.ImageManager r0 = r8.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zah(r0)
            android.net.Uri r2 = r1.zaa
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.common.images.ImageManager$ImageReceiver r0 = (com.google.android.gms.common.images.ImageManager.ImageReceiver) r0
            if (r0 != 0) goto L90
            com.google.android.gms.common.images.ImageManager$ImageReceiver r0 = new com.google.android.gms.common.images.ImageManager$ImageReceiver
            com.google.android.gms.common.images.ImageManager r2 = r8.zaa
            android.net.Uri r3 = r1.zaa
            r0.<init>(r2, r3)
            com.google.android.gms.common.images.ImageManager r2 = r8.zaa
            java.util.Map r2 = com.google.android.gms.common.images.ImageManager.zah(r2)
            android.net.Uri r3 = r1.zaa
            r2.put(r3, r0)
        L90:
            com.google.android.gms.common.images.zag r2 = r8.zab
            r0.zab(r2)
            com.google.android.gms.common.images.zag r2 = r8.zab
            boolean r3 = r2 instanceof com.google.android.gms.common.images.zaf
            if (r3 != 0) goto La4
            com.google.android.gms.common.images.ImageManager r3 = r8.zaa
            java.util.Map r3 = com.google.android.gms.common.images.ImageManager.zag(r3)
            r3.put(r2, r0)
        La4:
            java.lang.Object r2 = com.google.android.gms.common.images.ImageManager.zad()
            monitor-enter(r2)
            java.util.HashSet r3 = com.google.android.gms.common.images.ImageManager.zae()     // Catch: java.lang.Throwable -> Lc3
            android.net.Uri r4 = r1.zaa     // Catch: java.lang.Throwable -> Lc3
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> Lc3
            if (r3 != 0) goto Lc1
            java.util.HashSet r3 = com.google.android.gms.common.images.ImageManager.zae()     // Catch: java.lang.Throwable -> Lc3
            android.net.Uri r1 = r1.zaa     // Catch: java.lang.Throwable -> Lc3
            r3.add(r1)     // Catch: java.lang.Throwable -> Lc3
            r0.zad()     // Catch: java.lang.Throwable -> Lc3
        Lc1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc3
            return
        Lc3:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc3
            throw r0
        Lc6:
            com.google.android.gms.common.images.ImageManager r1 = r8.zaa
            android.content.Context r1 = com.google.android.gms.common.images.ImageManager.zaa(r1)
            int r2 = com.google.android.gms.common.images.ImageManager.$r8$clinit
            r0.zab(r1, r3)
            return
    }
}
