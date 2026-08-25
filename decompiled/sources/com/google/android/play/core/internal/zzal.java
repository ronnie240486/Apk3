package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzal extends com.google.android.play.core.internal.zzah {
    public final /* synthetic */ com.google.android.play.core.internal.zzas zza;

    public zzal(com.google.android.play.core.internal.zzas r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.internal.zzah
    public final void zza() {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zza
            android.os.IInterface r1 = com.google.android.play.core.internal.zzas.zzd(r0)
            if (r1 == 0) goto L31
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.internal.zzas.zzf(r0)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Unbind from service."
            r0.zzd(r2, r1)
            com.google.android.play.core.internal.zzas r0 = r3.zza
            android.content.Context r1 = com.google.android.play.core.internal.zzas.zza(r0)
            android.content.ServiceConnection r0 = com.google.android.play.core.internal.zzas.zzb(r0)
            r1.unbindService(r0)
            com.google.android.play.core.internal.zzas r0 = r3.zza
            com.google.android.play.core.internal.zzas.zzk(r0)
            com.google.android.play.core.internal.zzas r0 = r3.zza
            r1 = 0
            com.google.android.play.core.internal.zzas.zzl(r0, r1)
            com.google.android.play.core.internal.zzas r0 = r3.zza
            com.google.android.play.core.internal.zzas.zzj(r0)
        L31:
            com.google.android.play.core.internal.zzas r0 = r3.zza
            com.google.android.play.core.internal.zzas.zzm(r0)
            return
    }
}
