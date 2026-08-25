package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
class zzn extends com.google.android.play.core.internal.zzq {
    public final com.google.android.play.core.internal.zzag zza;
    public final com.google.android.play.core.tasks.zzi zzb;
    public final /* synthetic */ com.google.android.play.core.appupdate.zzq zzc;

    public zzn(com.google.android.play.core.appupdate.zzq r1, com.google.android.play.core.internal.zzag r2, com.google.android.play.core.tasks.zzi r3) {
            r0 = this;
            r0.zzc = r1
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            return
    }

    @Override // com.google.android.play.core.internal.zzr
    public void zzb(android.os.Bundle r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.play.core.appupdate.zzq r3 = r2.zzc
            com.google.android.play.core.internal.zzas r3 = r3.zza
            com.google.android.play.core.tasks.zzi r0 = r2.zzb
            r3.zzs(r0)
            com.google.android.play.core.internal.zzag r3 = r2.zza
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "onCompleteUpdate"
            r3.zzd(r1, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzr
    public void zzc(android.os.Bundle r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.play.core.appupdate.zzq r3 = r2.zzc
            com.google.android.play.core.internal.zzas r3 = r3.zza
            com.google.android.play.core.tasks.zzi r0 = r2.zzb
            r3.zzs(r0)
            com.google.android.play.core.internal.zzag r3 = r2.zza
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "onRequestInfo"
            r3.zzd(r1, r0)
            return
    }
}
