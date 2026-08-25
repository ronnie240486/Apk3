package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.util.VisibleForTesting
public final class zzd extends com.google.android.gms.common.internal.zzab {

    @androidx.annotation.Nullable
    private com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zzd(@androidx.annotation.NonNull com.google.android.gms.common.internal.BaseGmsClient r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @androidx.annotation.BinderThread
    public final void onPostInitComplete(int r5, @androidx.annotation.NonNull android.os.IBinder r6, @androidx.annotation.Nullable android.os.Bundle r7) {
            r4 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r4.zza
            java.lang.String r1 = "onPostInitComplete can be called only once per call to getRemoteService"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r4.zza
            int r1 = r4.zzb
            android.os.Handler r2 = r0.zzb
            com.google.android.gms.common.internal.zzf r3 = new com.google.android.gms.common.internal.zzf
            r3.<init>(r0, r5, r6, r7)
            r5 = 1
            r6 = -1
            android.os.Message r5 = r2.obtainMessage(r5, r1, r6, r3)
            r2.sendMessage(r5)
            r5 = 0
            r4.zza = r5
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @androidx.annotation.BinderThread
    public final void zzb(int r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r1 = this;
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r3 = "GmsClient"
            java.lang.String r0 = "received deprecated onAccountValidationComplete callback, ignoring"
            android.util.Log.wtf(r3, r0, r2)
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @androidx.annotation.BinderThread
    public final void zzc(int r3, @androidx.annotation.NonNull android.os.IBinder r4, @androidx.annotation.NonNull com.google.android.gms.common.internal.zzj r5) {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
            java.lang.String r1 = "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.internal.BaseGmsClient.zzj(r0, r5)
            android.os.Bundle r5 = r5.zza
            r2.onPostInitComplete(r3, r4, r5)
            return
    }
}
