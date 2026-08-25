package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.util.VisibleForTesting
public final class zze implements android.content.ServiceConnection {
    public final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zze(com.google.android.gms.common.internal.BaseGmsClient r1, int r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
            r4 = this;
            com.google.android.gms.common.internal.BaseGmsClient r5 = r4.zza
            if (r6 != 0) goto L8
            com.google.android.gms.common.internal.BaseGmsClient.zzk(r5)
            return
        L8:
            java.lang.Object r5 = com.google.android.gms.common.internal.BaseGmsClient.zzd(r5)
            monitor-enter(r5)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r4.zza     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "com.google.android.gms.common.internal.IGmsServiceBroker"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L1e
            boolean r2 = r1 instanceof com.google.android.gms.common.internal.IGmsServiceBroker     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L1e
            com.google.android.gms.common.internal.IGmsServiceBroker r1 = (com.google.android.gms.common.internal.IGmsServiceBroker) r1     // Catch: java.lang.Throwable -> L3e
            goto L23
        L1e:
            com.google.android.gms.common.internal.zzac r1 = new com.google.android.gms.common.internal.zzac     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3e
        L23:
            com.google.android.gms.common.internal.BaseGmsClient.zzh(r0, r1)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.common.internal.BaseGmsClient r5 = r4.zza
            r6 = 0
            int r0 = r4.zzb
            android.os.Handler r1 = r5.zzb
            com.google.android.gms.common.internal.zzg r2 = new com.google.android.gms.common.internal.zzg
            r3 = 0
            r2.<init>(r5, r6, r3)
            r5 = 7
            r6 = -1
            android.os.Message r5 = r1.obtainMessage(r5, r0, r6, r2)
            r1.sendMessage(r5)
            return
        L3e:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3e
            throw r6
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r4) {
            r3 = this;
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zza
            java.lang.Object r4 = com.google.android.gms.common.internal.BaseGmsClient.zzd(r4)
            monitor-enter(r4)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r3.zza     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            com.google.android.gms.common.internal.BaseGmsClient.zzh(r0, r1)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zza
            android.os.Handler r4 = r4.zzb
            r0 = 6
            int r1 = r3.zzb
            r2 = 1
            android.os.Message r0 = r4.obtainMessage(r0, r1, r2)
            r4.sendMessage(r0)
            return
        L1e:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }
}
