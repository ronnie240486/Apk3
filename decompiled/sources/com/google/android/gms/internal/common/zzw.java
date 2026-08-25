package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzw extends com.google.android.gms.internal.common.zzj<java.lang.String> {
    public final java.lang.CharSequence zzb;
    public final boolean zzd;
    public int zze;
    public int zzf;

    public zzw(com.google.android.gms.internal.common.zzx r2, java.lang.CharSequence r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zze = r0
            com.google.android.gms.internal.common.zzx.zza(r2)
            boolean r2 = com.google.android.gms.internal.common.zzx.zzg(r2)
            r1.zzd = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.zzf = r2
            r1.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.common.zzj
    @javax.annotation.CheckForNull
    public final /* bridge */ /* synthetic */ java.lang.String zza() {
            r5 = this;
            int r0 = r5.zze
        L2:
            int r1 = r5.zze
            r2 = -1
            if (r1 == r2) goto L6c
            int r1 = r5.zzd(r1)
            if (r1 != r2) goto L17
            java.lang.CharSequence r1 = r5.zzb
            int r1 = r1.length()
            r5.zze = r2
            r3 = -1
            goto L1d
        L17:
            int r3 = r5.zzc(r1)
            r5.zze = r3
        L1d:
            if (r3 != r0) goto L2e
            int r3 = r3 + 1
            r5.zze = r3
            java.lang.CharSequence r1 = r5.zzb
            int r1 = r1.length()
            if (r3 <= r1) goto L2
            r5.zze = r2
            goto L2
        L2e:
            if (r0 >= r1) goto L35
            java.lang.CharSequence r3 = r5.zzb
            r3.charAt(r0)
        L35:
            if (r0 >= r1) goto L3e
            java.lang.CharSequence r3 = r5.zzb
            int r4 = r1 + (-1)
            r3.charAt(r4)
        L3e:
            boolean r3 = r5.zzd
            if (r3 == 0) goto L47
            if (r0 != r1) goto L47
            int r0 = r5.zze
            goto L2
        L47:
            int r3 = r5.zzf
            r4 = 1
            if (r3 != r4) goto L5e
            java.lang.CharSequence r1 = r5.zzb
            int r1 = r1.length()
            r5.zze = r2
            if (r1 <= r0) goto L61
            java.lang.CharSequence r2 = r5.zzb
            int r3 = r1 + (-1)
            r2.charAt(r3)
            goto L61
        L5e:
            int r3 = r3 + r2
            r5.zzf = r3
        L61:
            java.lang.CharSequence r2 = r5.zzb
            java.lang.CharSequence r0 = r2.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            goto L70
        L6c:
            r5.zzb()
            r0 = 0
        L70:
            return r0
    }

    public abstract int zzc(int r1);

    public abstract int zzd(int r1);
}
