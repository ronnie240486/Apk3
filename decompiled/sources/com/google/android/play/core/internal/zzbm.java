package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbm implements com.google.android.play.core.internal.zzaz {
    public zzbm() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.internal.zzaz
    public final void zza(java.lang.ClassLoader r2, java.util.Set r3) {
            r1 = this;
            com.google.android.play.core.internal.zzbi r0 = new com.google.android.play.core.internal.zzbi
            r0.<init>()
            com.google.android.play.core.internal.zzbk.zzc(r2, r3, r0)
            return
    }

    @Override // com.google.android.play.core.internal.zzaz
    public final boolean zzb(java.lang.ClassLoader r2, java.io.File r3, java.io.File r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "zip"
            boolean r2 = com.google.android.play.core.internal.zzbk.zzd(r2, r3, r4, r5, r0)
            return r2
    }
}
