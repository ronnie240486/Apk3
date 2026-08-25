package com.google.android.play.core.splitcompat;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzf implements com.google.android.play.core.splitcompat.zzk {
    public final /* synthetic */ com.google.android.play.core.splitcompat.zzg zza;

    public zzf(com.google.android.play.core.splitcompat.zzg r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.splitcompat.zzk
    public final void zza(com.google.android.play.core.splitcompat.zzl r1, java.io.File r2, boolean r3) throws java.io.IOException {
            r0 = this;
            com.google.android.play.core.splitcompat.zzg r1 = r0.zza
            java.util.Set r1 = r1.zzb
            r1.add(r2)
            if (r3 != 0) goto L11
            com.google.android.play.core.splitcompat.zzg r1 = r0.zza
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.zzc
            r2 = 0
            r1.set(r2)
        L11:
            return
    }
}
