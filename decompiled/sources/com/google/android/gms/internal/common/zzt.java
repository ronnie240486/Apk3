package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzt extends com.google.android.gms.internal.common.zzw {
    public final /* synthetic */ com.google.android.gms.internal.common.zzu zza;

    public zzt(com.google.android.gms.internal.common.zzu r1, com.google.android.gms.internal.common.zzx r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.common.zzw
    public final int zzc(int r1) {
            r0 = this;
            int r1 = r1 + 1
            return r1
    }

    @Override // com.google.android.gms.internal.common.zzw
    public final int zzd(int r5) {
            r4 = this;
            com.google.android.gms.internal.common.zzu r0 = r4.zza
            com.google.android.gms.internal.common.zzo r0 = r0.zza
            java.lang.CharSequence r1 = r4.zzb
            int r2 = r1.length()
            java.lang.String r3 = "index"
            com.google.android.gms.internal.common.zzs.zzb(r5, r2, r3)
        Lf:
            if (r5 >= r2) goto L1e
            char r3 = r1.charAt(r5)
            boolean r3 = r0.zza(r3)
            if (r3 != 0) goto L1f
            int r5 = r5 + 1
            goto Lf
        L1e:
            r5 = -1
        L1f:
            return r5
    }
}
