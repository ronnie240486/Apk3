package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzg implements com.google.android.play.core.splitcompat.zzj {
    public final /* synthetic */ com.google.android.play.core.splitcompat.zzs zza;
    public final /* synthetic */ java.util.Set zzb;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzc;
    public final /* synthetic */ com.google.android.play.core.splitcompat.zzm zzd;

    public zzg(com.google.android.play.core.splitcompat.zzm r1, com.google.android.play.core.splitcompat.zzs r2, java.util.Set r3, java.util.concurrent.atomic.AtomicBoolean r4) {
            r0 = this;
            r0.zzd = r1
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.splitcompat.zzj
    public final void zza(java.util.zip.ZipFile r3, java.util.Set r4) throws java.io.IOException {
            r2 = this;
            com.google.android.play.core.splitcompat.zzm r3 = r2.zzd
            com.google.android.play.core.splitcompat.zzs r0 = r2.zza
            com.google.android.play.core.splitcompat.zzf r1 = new com.google.android.play.core.splitcompat.zzf
            r1.<init>(r2)
            com.google.android.play.core.splitcompat.zzm.zzd(r3, r0, r4, r1)
            return
    }
}
