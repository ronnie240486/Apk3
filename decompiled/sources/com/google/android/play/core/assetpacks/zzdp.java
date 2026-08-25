package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdp implements com.google.android.play.core.internal.zzcs {
    private final com.google.android.play.core.internal.zzcs zza;
    private final com.google.android.play.core.internal.zzcs zzb;
    private final com.google.android.play.core.internal.zzcs zzc;
    private final com.google.android.play.core.internal.zzcs zzd;
    private final com.google.android.play.core.internal.zzcs zze;
    private final com.google.android.play.core.internal.zzcs zzf;
    private final com.google.android.play.core.internal.zzcs zzg;

    public zzdp(com.google.android.play.core.internal.zzcs r1, com.google.android.play.core.internal.zzcs r2, com.google.android.play.core.internal.zzcs r3, com.google.android.play.core.internal.zzcs r4, com.google.android.play.core.internal.zzcs r5, com.google.android.play.core.internal.zzcs r6, com.google.android.play.core.internal.zzcs r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    @Override // com.google.android.play.core.internal.zzcs
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r13 = this;
            com.google.android.play.core.internal.zzcs r0 = r13.zza
            java.lang.Object r0 = r0.zza()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.play.core.internal.zzcs r1 = r13.zzb
            java.lang.Object r1 = r1.zza()
            com.google.android.play.core.internal.zzcs r2 = r13.zzc
            java.lang.Object r2 = r2.zza()
            com.google.android.play.core.internal.zzcs r3 = r13.zzd
            com.google.android.play.core.assetpacks.zzu r3 = (com.google.android.play.core.assetpacks.zzu) r3
            android.content.Context r8 = r3.zzb()
            com.google.android.play.core.internal.zzcs r3 = r13.zze
            java.lang.Object r3 = r3.zza()
            com.google.android.play.core.internal.zzcs r4 = r13.zzf
            com.google.android.play.core.internal.zzco r10 = com.google.android.play.core.internal.zzcq.zzb(r4)
            com.google.android.play.core.internal.zzcs r4 = r13.zzg
            java.lang.Object r4 = r4.zza()
            com.google.android.play.core.assetpacks.zzdo r12 = new com.google.android.play.core.assetpacks.zzdo
            r6 = r1
            com.google.android.play.core.assetpacks.zzbb r6 = (com.google.android.play.core.assetpacks.zzbb) r6
            r7 = r2
            com.google.android.play.core.assetpacks.zzco r7 = (com.google.android.play.core.assetpacks.zzco) r7
            r9 = r3
            com.google.android.play.core.assetpacks.zzed r9 = (com.google.android.play.core.assetpacks.zzed) r9
            r11 = r4
            com.google.android.play.core.assetpacks.zzeb r11 = (com.google.android.play.core.assetpacks.zzeb) r11
            r1 = 0
            if (r0 == 0) goto L4a
            java.io.File r2 = new java.io.File
            java.io.File r1 = r8.getExternalFilesDir(r1)
            r2.<init>(r1, r0)
            r5 = r2
            goto L4f
        L4a:
            java.io.File r0 = r8.getExternalFilesDir(r1)
            r5 = r0
        L4f:
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r12
    }
}
