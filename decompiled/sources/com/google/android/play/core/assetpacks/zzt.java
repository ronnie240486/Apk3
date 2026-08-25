package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzt implements com.google.android.play.core.internal.zzcs {
    private final com.google.android.play.core.internal.zzcs zza;
    private final com.google.android.play.core.internal.zzcs zzb;
    private final com.google.android.play.core.internal.zzcs zzc;

    public zzt(com.google.android.play.core.internal.zzcs r1, com.google.android.play.core.internal.zzcs r2, com.google.android.play.core.internal.zzcs r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.play.core.internal.zzcs
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r3 = this;
            com.google.android.play.core.internal.zzcs r0 = r3.zza
            com.google.android.play.core.assetpacks.zzu r0 = (com.google.android.play.core.assetpacks.zzu) r0
            android.content.Context r0 = r0.zzb()
            com.google.android.play.core.internal.zzcs r1 = r3.zzb
            com.google.android.play.core.internal.zzco r1 = com.google.android.play.core.internal.zzcq.zzb(r1)
            com.google.android.play.core.internal.zzcs r2 = r3.zzc
            com.google.android.play.core.internal.zzco r2 = com.google.android.play.core.internal.zzcq.zzb(r2)
            java.lang.String r0 = com.google.android.play.core.assetpacks.zzp.zzb(r0)
            if (r0 != 0) goto L21
            java.lang.Object r0 = r1.zza()
            com.google.android.play.core.assetpacks.zzy r0 = (com.google.android.play.core.assetpacks.zzy) r0
            goto L27
        L21:
            java.lang.Object r0 = r2.zza()
            com.google.android.play.core.assetpacks.zzy r0 = (com.google.android.play.core.assetpacks.zzy) r0
        L27:
            com.google.android.play.core.internal.zzcr.zza(r0)
            return r0
    }
}
