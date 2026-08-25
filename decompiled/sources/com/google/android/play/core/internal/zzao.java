package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzao extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ android.os.IBinder zza;
    public final /* synthetic */ com.google.android.play.core.internal.zzar zzb;

    public zzao(com.google.android.play.core.internal.zzar r1, android.os.IBinder r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.internal.zzah
    public final void zza() {
            r3 = this;
            com.google.android.play.core.internal.zzar r0 = r3.zzb
            com.google.android.play.core.internal.zzas r0 = r0.zza
            com.google.android.play.core.internal.zzan r1 = com.google.android.play.core.internal.zzas.zzg(r0)
            android.os.IBinder r2 = r3.zza
            java.lang.Object r1 = r1.zza(r2)
            android.os.IInterface r1 = (android.os.IInterface) r1
            com.google.android.play.core.internal.zzas.zzl(r0, r1)
            com.google.android.play.core.internal.zzar r0 = r3.zzb
            com.google.android.play.core.internal.zzas r0 = r0.zza
            com.google.android.play.core.internal.zzas.zzo(r0)
            com.google.android.play.core.internal.zzar r0 = r3.zzb
            com.google.android.play.core.internal.zzas r0 = r0.zza
            com.google.android.play.core.internal.zzas.zzk(r0)
            com.google.android.play.core.internal.zzar r0 = r3.zzb
            com.google.android.play.core.internal.zzas r0 = r0.zza
            java.util.List r0 = com.google.android.play.core.internal.zzas.zzh(r0)
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L2d
        L3d:
            com.google.android.play.core.internal.zzar r0 = r3.zzb
            com.google.android.play.core.internal.zzas r0 = r0.zza
            java.util.List r0 = com.google.android.play.core.internal.zzas.zzh(r0)
            r0.clear()
            return
    }
}
