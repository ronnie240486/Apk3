package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbp implements com.google.android.play.core.internal.zzaz {
    public zzbp() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void zzc(java.lang.ClassLoader r1, java.util.Set r2) {
            com.google.android.play.core.internal.zzbn r0 = new com.google.android.play.core.internal.zzbn
            r0.<init>()
            com.google.android.play.core.internal.zzbk.zzc(r1, r2, r0)
            return
    }

    public static boolean zzd(java.lang.ClassLoader r7, java.io.File r8, java.io.File r9, boolean r10) {
            com.google.android.play.core.internal.zzbh r4 = new com.google.android.play.core.internal.zzbh
            r4.<init>()
            com.google.android.play.core.internal.zzbo r6 = new com.google.android.play.core.internal.zzbo
            r6.<init>()
            java.lang.String r5 = "path"
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            boolean r7 = com.google.android.play.core.internal.zzbf.zze(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // com.google.android.play.core.internal.zzaz
    public final void zza(java.lang.ClassLoader r1, java.util.Set r2) {
            r0 = this;
            zzc(r1, r2)
            return
    }

    @Override // com.google.android.play.core.internal.zzaz
    public final boolean zzb(java.lang.ClassLoader r1, java.io.File r2, java.io.File r3, boolean r4) {
            r0 = this;
            boolean r1 = zzd(r1, r2, r3, r4)
            return r1
    }
}
