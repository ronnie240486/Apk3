package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzr implements com.google.android.play.core.internal.zzcs {
    private final com.google.android.play.core.internal.zzcs zza;
    private final com.google.android.play.core.internal.zzcs zzb;
    private final com.google.android.play.core.internal.zzcs zzc;
    private final com.google.android.play.core.internal.zzcs zzd;

    public zzr(com.google.android.play.core.internal.zzcs r1, com.google.android.play.core.internal.zzcs r2, com.google.android.play.core.internal.zzcs r3, com.google.android.play.core.internal.zzcs r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.play.core.internal.zzcs
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r5 = this;
            com.google.android.play.core.internal.zzcs r0 = r5.zza
            com.google.android.play.core.splitinstall.zzad r0 = (com.google.android.play.core.splitinstall.zzad) r0
            android.content.Context r0 = r0.zzb()
            com.google.android.play.core.internal.zzcs r1 = r5.zzb
            java.lang.Object r1 = r1.zza()
            java.io.File r1 = (java.io.File) r1
            com.google.android.play.core.internal.zzcs r2 = r5.zzc
            java.lang.Object r2 = r2.zza()
            com.google.android.play.core.splitinstall.zzs r2 = (com.google.android.play.core.splitinstall.zzs) r2
            com.google.android.play.core.internal.zzcs r3 = r5.zzd
            com.google.android.play.core.internal.zzco r3 = com.google.android.play.core.internal.zzcq.zzb(r3)
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager r4 = new com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager
            r4.<init>(r0, r1, r2, r3)
            return r4
    }
}
