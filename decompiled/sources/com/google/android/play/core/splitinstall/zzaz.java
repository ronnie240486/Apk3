package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaz extends com.google.android.play.core.splitinstall.zzbb {
    public zzaz(com.google.android.play.core.splitinstall.zzbc r1, com.google.android.play.core.tasks.zzi r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.internal.zzcc
    public final void zzh(java.util.List r3) throws android.os.RemoteException {
            r2 = this;
            super.zzh(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r3.next()
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.play.core.splitinstall.SplitInstallSessionState r1 = com.google.android.play.core.splitinstall.SplitInstallSessionState.zzd(r1)
            r0.add(r1)
            goto L10
        L24:
            com.google.android.play.core.tasks.zzi r3 = r2.zza
            r3.zze(r0)
            return
    }
}
