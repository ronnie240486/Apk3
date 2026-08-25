package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzg extends com.google.android.gms.common.internal.zza {
    public final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zze;

    @androidx.annotation.BinderThread
    public zzg(com.google.android.gms.common.internal.BaseGmsClient r1, @androidx.annotation.Nullable int r2, android.os.Bundle r3) {
            r0 = this;
            r0.zze = r1
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zze
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zze
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.zzc
            r0.onReportServiceBinding(r2)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zze
            r0.onConnectionFailed(r2)
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zzd() {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zze
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.zzc
            com.google.android.gms.common.ConnectionResult r1 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            r0.onReportServiceBinding(r1)
            r0 = 1
            return r0
    }
}
