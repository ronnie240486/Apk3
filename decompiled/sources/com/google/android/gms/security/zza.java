package com.google.android.gms.security;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zza extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Integer> {
    public final /* synthetic */ android.content.Context zza;
    public final /* synthetic */ com.google.android.gms.security.ProviderInstaller.ProviderInstallListener zzb;

    public zza(android.content.Context r1, com.google.android.gms.security.ProviderInstaller.ProviderInstallListener r2) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.<init>()
            return
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ java.lang.Integer doInBackground(java.lang.Void[] r1) {
            r0 = this;
            java.lang.Void[] r1 = (java.lang.Void[]) r1
            android.content.Context r1 = r0.zza     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> Ld com.google.android.gms.common.GooglePlayServicesRepairableException -> L15
            com.google.android.gms.security.ProviderInstaller.installIfNeeded(r1)     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> Ld com.google.android.gms.common.GooglePlayServicesRepairableException -> L15
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L1e
        Ld:
            r1 = move-exception
            int r1 = r1.errorCode
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L1e
        L15:
            r1 = move-exception
            int r1 = r1.getConnectionStatusCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L1e:
            return r1
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Integer r5) {
            r4 = this;
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r0 = r5.intValue()
            if (r0 != 0) goto Le
            com.google.android.gms.security.ProviderInstaller$ProviderInstallListener r5 = r4.zzb
            r5.onProviderInstalled()
            return
        Le:
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.security.ProviderInstaller.zza()
            android.content.Context r1 = r4.zza
            int r2 = r5.intValue()
            java.lang.String r3 = "pi"
            android.content.Intent r0 = r0.getErrorResolutionIntent(r1, r2, r3)
            com.google.android.gms.security.ProviderInstaller$ProviderInstallListener r1 = r4.zzb
            int r5 = r5.intValue()
            r1.onProviderInstallFailed(r5, r0)
            return
    }
}
