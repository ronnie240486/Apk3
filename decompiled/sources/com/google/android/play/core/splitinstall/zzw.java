package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzw implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.play.core.splitinstall.SplitInstallSessionState zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ com.google.android.play.core.splitinstall.zzx zzd;

    public zzw(com.google.android.play.core.splitinstall.zzx r1, com.google.android.play.core.splitinstall.SplitInstallSessionState r2, int r3, int r4) {
            r0 = this;
            r0.zzd = r1
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r15 = this;
            com.google.android.play.core.splitinstall.zzx r0 = r15.zzd
            com.google.android.play.core.splitinstall.SplitInstallSessionState r1 = r15.zza
            int r4 = r15.zzb
            int r5 = r15.zzc
            com.google.android.play.core.splitinstall.zza r14 = new com.google.android.play.core.splitinstall.zza
            int r3 = r1.sessionId()
            long r6 = r1.bytesDownloaded()
            long r8 = r1.totalBytesToDownload()
            java.util.List r10 = r1.zzb()
            java.util.List r11 = r1.zza()
            android.app.PendingIntent r12 = r1.resolutionIntent()
            java.util.List r13 = r1.zzc()
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r8, r10, r11, r12, r13)
            r0.zzm(r14)
            return
    }
}
