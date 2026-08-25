package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzt {
    public static final com.google.android.play.core.splitinstall.testing.zzt zza = null;

    static {
            com.google.android.play.core.splitinstall.testing.zza r0 = new com.google.android.play.core.splitinstall.testing.zza
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzb(r1)
            java.util.Map r1 = r0.zzd()
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.zzb(r1)
            com.google.android.play.core.splitinstall.testing.zzt r0 = r0.zzc()
            com.google.android.play.core.splitinstall.testing.zzt.zza = r0
            return
    }

    public zzt() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.play.core.splitinstall.model.SplitInstallErrorCode
    public abstract java.lang.Integer zza();

    public abstract java.util.Map zzb();
}
