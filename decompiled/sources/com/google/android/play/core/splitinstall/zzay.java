package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzay extends com.google.android.play.core.splitinstall.zzbb {
    public zzay(com.google.android.play.core.splitinstall.zzbc r1, com.google.android.play.core.tasks.zzi r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.internal.zzcc
    public final void zzg(int r1, android.os.Bundle r2) throws android.os.RemoteException {
            r0 = this;
            super.zzg(r1, r2)
            com.google.android.play.core.tasks.zzi r1 = r0.zza
            com.google.android.play.core.splitinstall.SplitInstallSessionState r2 = com.google.android.play.core.splitinstall.SplitInstallSessionState.zzd(r2)
            r1.zze(r2)
            return
    }
}
