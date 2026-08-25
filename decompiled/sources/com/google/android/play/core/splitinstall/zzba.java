package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzba extends com.google.android.play.core.splitinstall.zzbb {
    public zzba(com.google.android.play.core.splitinstall.zzbc r1, com.google.android.play.core.tasks.zzi r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.internal.zzcc
    public final void zzi(int r1, android.os.Bundle r2) throws android.os.RemoteException {
            r0 = this;
            super.zzi(r1, r2)
            com.google.android.play.core.tasks.zzi r2 = r0.zza
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.zze(r1)
            return
    }
}
