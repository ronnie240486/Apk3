package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zza extends com.google.android.gms.common.internal.zzc<java.lang.Boolean> {
    public final int zza;

    @androidx.annotation.Nullable
    public final android.os.Bundle zzb;
    public final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzc;

    @androidx.annotation.BinderThread
    public zza(com.google.android.gms.common.internal.BaseGmsClient r2, @androidx.annotation.Nullable int r3, android.os.Bundle r4) {
            r1 = this;
            r1.zzc = r2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.<init>(r2, r0)
            r1.zza = r3
            r1.zzb = r4
            return
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void zza() {
            r3 = this;
            int r0 = r3.zza
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1c
            boolean r0 = r3.zzd()
            if (r0 != 0) goto L1b
            com.google.android.gms.common.internal.BaseGmsClient r0 = r3.zzc
            com.google.android.gms.common.internal.BaseGmsClient.zzi(r0, r1)
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 8
            r0.<init>(r1, r2)
            r3.zzb(r0)
        L1b:
            return
        L1c:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r3.zzc
            com.google.android.gms.common.internal.BaseGmsClient.zzi(r0, r1)
            android.os.Bundle r0 = r3.zzb
            if (r0 == 0) goto L2e
            java.lang.String r1 = "pendingIntent"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r2 = r0
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
        L2e:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r1 = r3.zza
            r0.<init>(r1, r2)
            r3.zzb(r0)
            return
    }

    public abstract void zzb(com.google.android.gms.common.ConnectionResult r1);

    @Override // com.google.android.gms.common.internal.zzc
    public final void zzc() {
            r0 = this;
            return
    }

    public abstract boolean zzd();
}
