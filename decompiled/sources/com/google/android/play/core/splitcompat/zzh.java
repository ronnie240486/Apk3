package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzh implements com.google.android.play.core.splitcompat.zzj {
    public final /* synthetic */ java.util.Set zza;
    public final /* synthetic */ com.google.android.play.core.splitcompat.zzs zzb;
    public final /* synthetic */ com.google.android.play.core.splitcompat.zzm zzc;

    public zzh(com.google.android.play.core.splitcompat.zzm r1, java.util.Set r2, com.google.android.play.core.splitcompat.zzs r3) {
            r0 = this;
            r0.zzc = r1
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.splitcompat.zzj
    public final void zza(java.util.zip.ZipFile r4, java.util.Set r5) throws java.io.IOException {
            r3 = this;
            java.util.Set r0 = r3.zza
            com.google.android.play.core.splitcompat.zzm r1 = r3.zzc
            com.google.android.play.core.splitcompat.zzs r2 = r3.zzb
            java.util.Set r4 = com.google.android.play.core.splitcompat.zzm.zza(r1, r5, r2, r4)
            r0.addAll(r4)
            return
    }
}
