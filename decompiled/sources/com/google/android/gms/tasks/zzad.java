package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zzad implements com.google.android.gms.tasks.zzae {
    private final java.util.concurrent.CountDownLatch zza;

    private zzad() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    public /* synthetic */ zzad(com.google.android.gms.tasks.zzac r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r0 = 1
            r2.<init>(r0)
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
            r1 = this;
            java.util.concurrent.CountDownLatch r0 = r1.zza
            r0.countDown()
            return
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@androidx.annotation.NonNull java.lang.Exception r1) {
            r0 = this;
            java.util.concurrent.CountDownLatch r1 = r0.zza
            r1.countDown()
            return
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(java.lang.Object r1) {
            r0 = this;
            java.util.concurrent.CountDownLatch r1 = r0.zza
            r1.countDown()
            return
    }

    public final void zza() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.CountDownLatch r0 = r1.zza
            r0.await()
            return
    }

    public final boolean zzb(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.CountDownLatch r0 = r1.zza
            boolean r2 = r0.await(r2, r4)
            return r2
    }
}
