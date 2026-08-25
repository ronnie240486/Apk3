package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzo implements com.google.android.play.core.splitinstall.zzf {
    public final /* synthetic */ java.util.List zza;
    public final /* synthetic */ java.util.List zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ java.util.List zze;
    public final /* synthetic */ com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager zzf;

    public zzo(com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r1, java.util.List r2, java.util.List r3, long r4, boolean r6, java.util.List r7) {
            r0 = this;
            r0.zzf = r1
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r6
            r0.zze = r7
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zza() {
            r5 = this;
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r0 = r5.zzf
            java.util.List r1 = r5.zza
            java.util.List r2 = r5.zzb
            long r3 = r5.zzc
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.zze(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzb(int r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r0 = r1.zzf
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.zzj(r0, r2)
            return
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzc() {
            r7 = this;
            boolean r0 = r7.zzd
            if (r0 != 0) goto L11
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r1 = r7.zzf
            java.util.List r2 = r7.zze
            java.util.List r3 = r7.zza
            java.util.List r4 = r7.zzb
            long r5 = r7.zzc
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.zzd(r1, r2, r3, r4, r5)
        L11:
            return
    }
}
