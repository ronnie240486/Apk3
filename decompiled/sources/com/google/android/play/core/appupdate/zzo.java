package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzo extends com.google.android.play.core.appupdate.zzn {
    public zzo(com.google.android.play.core.appupdate.zzq r3, com.google.android.play.core.tasks.zzi r4) {
            r2 = this;
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "OnCompleteUpdateCallback"
            r0.<init>(r1)
            r2.<init>(r3, r0, r4)
            return
    }

    @Override // com.google.android.play.core.appupdate.zzn, com.google.android.play.core.internal.zzr
    public final void zzb(android.os.Bundle r5) throws android.os.RemoteException {
            r4 = this;
            super.zzb(r5)
            int r0 = com.google.android.play.core.appupdate.zzq.$r8$clinit
            java.lang.String r0 = "error.code"
            r1 = -2
            int r2 = r5.getInt(r0, r1)
            if (r2 == 0) goto L1d
            com.google.android.play.core.tasks.zzi r2 = r4.zzb
            com.google.android.play.core.install.InstallException r3 = new com.google.android.play.core.install.InstallException
            int r5 = r5.getInt(r0, r1)
            r3.<init>(r5)
            r2.zzd(r3)
            return
        L1d:
            com.google.android.play.core.tasks.zzi r5 = r4.zzb
            r0 = 0
            r5.zze(r0)
            return
    }
}
