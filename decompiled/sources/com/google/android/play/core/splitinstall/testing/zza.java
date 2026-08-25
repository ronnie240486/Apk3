package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zza extends com.google.android.play.core.splitinstall.testing.zzs {
    private java.lang.Integer zza;
    private java.util.Map zzb;

    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzs
    public final com.google.android.play.core.splitinstall.testing.zzs zza(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zza = r1
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzs
    public final com.google.android.play.core.splitinstall.testing.zzs zzb(java.util.Map r2) {
            r1 = this;
            java.lang.String r0 = "Null splitInstallErrorCodeByModule"
            java.util.Objects.requireNonNull(r2, r0)
            r1.zzb = r2
            return r1
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzs
    public final com.google.android.play.core.splitinstall.testing.zzt zzc() {
            r3 = this;
            java.util.Map r0 = r3.zzb
            if (r0 == 0) goto Le
            com.google.android.play.core.splitinstall.testing.zzc r0 = new com.google.android.play.core.splitinstall.testing.zzc
            java.lang.Integer r1 = r3.zza
            java.util.Map r2 = r3.zzb
            r0.<init>(r1, r2)
            return r0
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties: splitInstallErrorCodeByModule"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzs
    public final java.util.Map zzd() {
            r2 = this;
            java.util.Map r0 = r2.zzb
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Property \"splitInstallErrorCodeByModule\" has not been set"
            r0.<init>(r1)
            throw r0
    }
}
