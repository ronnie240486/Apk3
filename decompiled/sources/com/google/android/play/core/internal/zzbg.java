package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbg implements com.google.android.play.core.internal.zzaz {
    public zzbg() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.internal.zzaz
    public final void zza(java.lang.ClassLoader r1, java.util.Set r2) {
            r0 = this;
            com.google.android.play.core.internal.zzbf.zzd(r1, r2)
            return
    }

    @Override // com.google.android.play.core.internal.zzaz
    public final boolean zzb(java.lang.ClassLoader r8, java.io.File r9, java.io.File r10, boolean r11) {
            r7 = this;
            com.google.android.play.core.internal.zzbb r4 = new com.google.android.play.core.internal.zzbb
            r4.<init>()
            com.google.android.play.core.internal.zzbc r6 = new com.google.android.play.core.internal.zzbc
            r6.<init>()
            java.lang.String r5 = "zip"
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            boolean r8 = com.google.android.play.core.internal.zzbf.zze(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }
}
