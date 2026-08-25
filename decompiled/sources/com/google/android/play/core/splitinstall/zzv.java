package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzv implements com.google.android.play.core.splitinstall.zzf {
    public final /* synthetic */ com.google.android.play.core.splitinstall.SplitInstallSessionState zza;
    public final /* synthetic */ android.content.Intent zzb;
    public final /* synthetic */ android.content.Context zzc;
    public final /* synthetic */ com.google.android.play.core.splitinstall.zzx zzd;

    public zzv(com.google.android.play.core.splitinstall.zzx r1, com.google.android.play.core.splitinstall.SplitInstallSessionState r2, android.content.Intent r3, android.content.Context r4) {
            r0 = this;
            r0.zzd = r1
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zza() {
            r4 = this;
            com.google.android.play.core.splitinstall.zzx r0 = r4.zzd
            com.google.android.play.core.splitinstall.SplitInstallSessionState r1 = r4.zza
            r2 = 5
            r3 = 0
            com.google.android.play.core.splitinstall.zzx.zzd(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzb(@com.google.android.play.core.splitinstall.model.SplitInstallErrorCode int r4) {
            r3 = this;
            com.google.android.play.core.splitinstall.zzx r0 = r3.zzd
            com.google.android.play.core.splitinstall.SplitInstallSessionState r1 = r3.zza
            r2 = 6
            com.google.android.play.core.splitinstall.zzx.zzd(r0, r1, r2, r4)
            return
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzc() {
            r3 = this;
            android.content.Intent r0 = r3.zzb
            java.lang.String r1 = "triggered_from_app_after_verification"
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            if (r0 != 0) goto L1a
            android.content.Intent r0 = r3.zzb
            r2 = 1
            r0.putExtra(r1, r2)
            android.content.Context r0 = r3.zzc
            android.content.Intent r1 = r3.zzb
            r0.sendBroadcast(r1)
            return
        L1a:
            com.google.android.play.core.splitinstall.zzx r0 = r3.zzd
            com.google.android.play.core.internal.zzag r0 = r0.zza
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "Splits copied and verified more than once."
            r0.zzb(r2, r1)
            return
    }
}
