package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzg implements com.google.android.play.core.internal.zzcs {
    private final com.google.android.play.core.internal.zzcs zza;
    private final com.google.android.play.core.internal.zzcs zzb;
    private final com.google.android.play.core.internal.zzcs zzc;

    public zzg(com.google.android.play.core.internal.zzcs r1, com.google.android.play.core.internal.zzcs r2, com.google.android.play.core.internal.zzcs r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.play.core.internal.zzcs
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r4 = this;
            com.google.android.play.core.internal.zzcs r0 = r4.zza
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.internal.zzcs r1 = r4.zzb
            java.lang.Object r1 = r1.zza()
            com.google.android.play.core.appupdate.zzb r1 = (com.google.android.play.core.appupdate.zzb) r1
            com.google.android.play.core.internal.zzcs r2 = r4.zzc
            com.google.android.play.core.appupdate.zzj r2 = (com.google.android.play.core.appupdate.zzj) r2
            android.content.Context r2 = r2.zzb()
            com.google.android.play.core.appupdate.zzf r3 = new com.google.android.play.core.appupdate.zzf
            com.google.android.play.core.appupdate.zzq r0 = (com.google.android.play.core.appupdate.zzq) r0
            r3.<init>(r0, r1, r2)
            return r3
    }
}
