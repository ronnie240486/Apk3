package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzet {
    public zzet() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int zza();

    public abstract long zzb();

    @androidx.annotation.Nullable
    public abstract java.lang.String zzc();

    public abstract boolean zzd();

    public abstract boolean zze();

    @androidx.annotation.Nullable
    public abstract byte[] zzf();

    public final boolean zzg() {
            r2 = this;
            java.lang.String r0 = r2.zzc()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r2.zzc()
            java.lang.String r1 = "/"
            boolean r0 = r0.endsWith(r1)
            return r0
    }

    public final boolean zzh() {
            r1 = this;
            int r0 = r1.zza()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
