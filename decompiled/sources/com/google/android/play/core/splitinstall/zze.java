package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zze implements com.google.android.play.core.splitinstall.zzp {
    private final com.google.android.play.core.splitinstall.zze zza;
    private final com.google.android.play.core.internal.zzcs zzb;
    private final com.google.android.play.core.internal.zzcs zzc;
    private final com.google.android.play.core.internal.zzcs zzd;
    private final com.google.android.play.core.internal.zzcs zze;
    private final com.google.android.play.core.internal.zzcs zzf;
    private final com.google.android.play.core.internal.zzcs zzg;
    private final com.google.android.play.core.internal.zzcs zzh;
    private final com.google.android.play.core.internal.zzcs zzi;
    private final com.google.android.play.core.internal.zzcs zzj;
    private final com.google.android.play.core.internal.zzcs zzk;
    private final com.google.android.play.core.internal.zzcs zzl;

    public /* synthetic */ zze(com.google.android.play.core.splitinstall.zzac r7) {
            r6 = this;
            r6.<init>()
            r6.zza = r6
            com.google.android.play.core.splitinstall.zzad r0 = new com.google.android.play.core.splitinstall.zzad
            r0.<init>(r7)
            r6.zzb = r0
            com.google.android.play.core.splitinstall.zzbd r1 = new com.google.android.play.core.splitinstall.zzbd
            r1.<init>(r0)
            com.google.android.play.core.internal.zzcs r1 = com.google.android.play.core.internal.zzcq.zzc(r1)
            r6.zzc = r1
            com.google.android.play.core.splitinstall.zzag r2 = new com.google.android.play.core.splitinstall.zzag
            r2.<init>(r7)
            com.google.android.play.core.internal.zzcs r2 = com.google.android.play.core.internal.zzcq.zzc(r2)
            r6.zzd = r2
            com.google.android.play.core.splitinstall.zzt r3 = new com.google.android.play.core.splitinstall.zzt
            r3.<init>(r0)
            com.google.android.play.core.internal.zzcs r3 = com.google.android.play.core.internal.zzcq.zzc(r3)
            r6.zze = r3
            com.google.android.play.core.splitinstall.zzbf r4 = new com.google.android.play.core.splitinstall.zzbf
            r4.<init>(r0)
            com.google.android.play.core.internal.zzcs r4 = com.google.android.play.core.internal.zzcq.zzc(r4)
            r6.zzf = r4
            com.google.android.play.core.splitinstall.zzab r5 = new com.google.android.play.core.splitinstall.zzab
            r5.<init>(r1, r2, r3, r4)
            com.google.android.play.core.internal.zzcs r1 = com.google.android.play.core.internal.zzcq.zzc(r5)
            r6.zzg = r1
            com.google.android.play.core.splitinstall.zzaf r2 = new com.google.android.play.core.splitinstall.zzaf
            r2.<init>(r0)
            com.google.android.play.core.internal.zzcs r2 = com.google.android.play.core.internal.zzcq.zzc(r2)
            r6.zzh = r2
            com.google.android.play.core.splitinstall.zzae r4 = new com.google.android.play.core.splitinstall.zzae
            r4.<init>(r2)
            r6.zzi = r4
            com.google.android.play.core.splitinstall.testing.zzr r5 = new com.google.android.play.core.splitinstall.testing.zzr
            r5.<init>(r0, r2, r3, r4)
            com.google.android.play.core.internal.zzcs r0 = com.google.android.play.core.internal.zzcq.zzc(r5)
            r6.zzj = r0
            com.google.android.play.core.splitinstall.zzm r3 = new com.google.android.play.core.splitinstall.zzm
            r3.<init>(r1, r0, r2)
            com.google.android.play.core.internal.zzcs r0 = com.google.android.play.core.internal.zzcq.zzc(r3)
            r6.zzk = r0
            com.google.android.play.core.splitinstall.zzah r1 = new com.google.android.play.core.splitinstall.zzah
            r1.<init>(r7, r0)
            com.google.android.play.core.internal.zzcs r7 = com.google.android.play.core.internal.zzcq.zzc(r1)
            r6.zzl = r7
            return
    }

    @Override // com.google.android.play.core.splitinstall.zzp
    public final com.google.android.play.core.splitinstall.SplitInstallManager zza() {
            r1 = this;
            com.google.android.play.core.internal.zzcs r0 = r1.zzl
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = (com.google.android.play.core.splitinstall.SplitInstallManager) r0
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.zzp
    public final java.io.File zzb() {
            r1 = this;
            com.google.android.play.core.internal.zzcs r0 = r1.zzh
            java.lang.Object r0 = r0.zza()
            java.io.File r0 = (java.io.File) r0
            return r0
    }
}
