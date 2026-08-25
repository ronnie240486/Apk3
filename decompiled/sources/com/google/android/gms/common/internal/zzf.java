package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzf extends com.google.android.gms.common.internal.zza {

    @androidx.annotation.Nullable
    public final android.os.IBinder zze;
    public final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzf;

    @androidx.annotation.BinderThread
    public zzf(com.google.android.gms.common.internal.BaseGmsClient r1, @androidx.annotation.Nullable int r2, @androidx.annotation.Nullable android.os.IBinder r3, android.os.Bundle r4) {
            r0 = this;
            r0.zzf = r1
            r0.<init>(r1, r2, r4)
            r0.zze = r3
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r0)
            if (r0 == 0) goto L11
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r0)
            r0.onConnectionFailed(r2)
        L11:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zzf
            r0.onConnectionFailed(r2)
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zzd() {
            r7 = this;
            java.lang.String r0 = "GmsClient"
            r1 = 0
            android.os.IBinder r2 = r7.zze     // Catch: android.os.RemoteException -> L7e
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: android.os.RemoteException -> L7e
            java.lang.String r2 = r2.getInterfaceDescriptor()     // Catch: android.os.RemoteException -> L7e
            com.google.android.gms.common.internal.BaseGmsClient r3 = r7.zzf
            java.lang.String r3 = r3.getServiceDescriptor()
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L43
            com.google.android.gms.common.internal.BaseGmsClient r3 = r7.zzf
            java.lang.String r3 = r3.getServiceDescriptor()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 34
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "service descriptor mismatch: "
            java.lang.String r5 = " vs. "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r4, r3, r5, r2)
            android.util.Log.w(r0, r2)
            return r1
        L43:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zzf
            android.os.IBinder r2 = r7.zze
            android.os.IInterface r0 = r0.createServiceInterface(r2)
            if (r0 == 0) goto L7d
            com.google.android.gms.common.internal.BaseGmsClient r2 = r7.zzf
            r3 = 2
            r4 = 4
            boolean r2 = com.google.android.gms.common.internal.BaseGmsClient.zzn(r2, r3, r4, r0)
            if (r2 != 0) goto L60
            com.google.android.gms.common.internal.BaseGmsClient r2 = r7.zzf
            r3 = 3
            boolean r0 = com.google.android.gms.common.internal.BaseGmsClient.zzn(r2, r3, r4, r0)
            if (r0 == 0) goto L7d
        L60:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zzf
            r1 = 0
            com.google.android.gms.common.internal.BaseGmsClient.zzg(r0, r1)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zzf
            android.os.Bundle r0 = r0.getConnectionHint()
            com.google.android.gms.common.internal.BaseGmsClient r1 = r7.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r2 = com.google.android.gms.common.internal.BaseGmsClient.zzb(r1)
            if (r2 == 0) goto L7b
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r1 = com.google.android.gms.common.internal.BaseGmsClient.zzb(r1)
            r1.onConnected(r0)
        L7b:
            r0 = 1
            return r0
        L7d:
            return r1
        L7e:
            java.lang.String r2 = "service probably died"
            android.util.Log.w(r0, r2)
            return r1
    }
}
