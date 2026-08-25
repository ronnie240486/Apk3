package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzq implements android.os.Handler.Callback {
    public final /* synthetic */ com.google.android.gms.common.internal.zzr zza;

    public /* synthetic */ zzq(com.google.android.gms.common.internal.zzr r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r8) {
            r7 = this;
            int r0 = r8.what
            r1 = 1
            if (r0 == 0) goto L71
            if (r0 == r1) goto L9
            r8 = 0
            return r8
        L9:
            com.google.android.gms.common.internal.zzr r0 = r7.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzr.zzh(r0)
            monitor-enter(r0)
            java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.common.internal.zzn r8 = (com.google.android.gms.common.internal.zzn) r8     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.common.internal.zzr r2 = r7.zza     // Catch: java.lang.Throwable -> L6e
            java.util.HashMap r2 = com.google.android.gms.common.internal.zzr.zzh(r2)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.common.internal.zzo r2 = (com.google.android.gms.common.internal.zzo) r2     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L6c
            int r3 = r2.zza()     // Catch: java.lang.Throwable -> L6e
            r4 = 3
            if (r3 != r4) goto L6c
            java.lang.String r3 = "GmsClientSupervisor"
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L6e
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L6e
            int r5 = r5 + 47
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = "Timeout waiting for ServiceConnection callback "
            r6.append(r5)     // Catch: java.lang.Throwable -> L6e
            r6.append(r4)     // Catch: java.lang.Throwable -> L6e
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Throwable -> L6e
            r4.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L6e
            android.util.Log.e(r3, r5, r4)     // Catch: java.lang.Throwable -> L6e
            android.content.ComponentName r3 = r2.zzb()     // Catch: java.lang.Throwable -> L6e
            if (r3 != 0) goto L58
            android.content.ComponentName r3 = r8.zzb()     // Catch: java.lang.Throwable -> L6e
        L58:
            if (r3 != 0) goto L69
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L6e
            java.lang.String r8 = r8.zzd()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "unknown"
            r3.<init>(r8, r4)     // Catch: java.lang.Throwable -> L6e
        L69:
            r2.onServiceDisconnected(r3)     // Catch: java.lang.Throwable -> L6e
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return r1
        L6e:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r8
        L71:
            com.google.android.gms.common.internal.zzr r0 = r7.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzr.zzh(r0)
            monitor-enter(r0)
            java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.common.internal.zzn r8 = (com.google.android.gms.common.internal.zzn) r8     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.common.internal.zzr r2 = r7.zza     // Catch: java.lang.Throwable -> La6
            java.util.HashMap r2 = com.google.android.gms.common.internal.zzr.zzh(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.common.internal.zzo r2 = (com.google.android.gms.common.internal.zzo) r2     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto La4
            boolean r3 = r2.zzi()     // Catch: java.lang.Throwable -> La6
            if (r3 == 0) goto La4
            boolean r3 = r2.zzj()     // Catch: java.lang.Throwable -> La6
            if (r3 == 0) goto L9b
            java.lang.String r3 = "GmsClientSupervisor"
            r2.zzg(r3)     // Catch: java.lang.Throwable -> La6
        L9b:
            com.google.android.gms.common.internal.zzr r2 = r7.zza     // Catch: java.lang.Throwable -> La6
            java.util.HashMap r2 = com.google.android.gms.common.internal.zzr.zzh(r2)     // Catch: java.lang.Throwable -> La6
            r2.remove(r8)     // Catch: java.lang.Throwable -> La6
        La4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            return r1
        La6:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            throw r8
    }
}
