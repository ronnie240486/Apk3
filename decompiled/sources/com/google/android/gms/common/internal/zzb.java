package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzb extends com.google.android.gms.internal.common.zzi {
    public final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;

    public zzb(com.google.android.gms.common.internal.BaseGmsClient r1, android.os.Looper r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            return
    }

    private static final void zza(android.os.Message r0) {
            java.lang.Object r0 = r0.obj
            com.google.android.gms.common.internal.zzc r0 = (com.google.android.gms.common.internal.zzc) r0
            r0.zzc()
            r0.zzg()
            return
    }

    private static final boolean zzb(android.os.Message r2) {
            int r2 = r2.what
            r0 = 1
            r1 = 2
            if (r2 == r1) goto Le
            if (r2 == r0) goto Le
            r1 = 7
            if (r2 != r1) goto Lc
            goto Le
        Lc:
            r2 = 0
            return r2
        Le:
            return r0
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r8) {
            r7 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            java.util.concurrent.atomic.AtomicInteger r0 = r0.zzd
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L16
            boolean r0 = zzb(r8)
            if (r0 == 0) goto L15
            zza(r8)
        L15:
            return
        L16:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L2a
            r4 = 7
            if (r0 == r4) goto L2a
            if (r0 != r1) goto L28
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            java.util.Objects.requireNonNull(r0)
            goto L2a
        L28:
            if (r0 != r3) goto L32
        L2a:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            boolean r0 = r0.isConnecting()
            if (r0 == 0) goto L11e
        L32:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L7a
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r1.<init>(r8)
            com.google.android.gms.common.internal.BaseGmsClient.zzg(r0, r1)
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            boolean r8 = com.google.android.gms.common.internal.BaseGmsClient.zzo(r8)
            if (r8 == 0) goto L5b
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            boolean r0 = com.google.android.gms.common.internal.BaseGmsClient.zzm(r8)
            if (r0 == 0) goto L57
            goto L5b
        L57:
            com.google.android.gms.common.internal.BaseGmsClient.zzi(r8, r5)
            return
        L5b:
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.internal.BaseGmsClient.zza(r8)
            if (r0 == 0) goto L68
            com.google.android.gms.common.ConnectionResult r8 = com.google.android.gms.common.internal.BaseGmsClient.zza(r8)
            goto L6d
        L68:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L6d:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.zzc
            r0.onReportServiceBinding(r8)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            r0.onConnectionFailed(r8)
            return
        L7a:
            if (r0 != r3) goto L9b
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.internal.BaseGmsClient.zza(r8)
            if (r0 == 0) goto L89
            com.google.android.gms.common.ConnectionResult r8 = com.google.android.gms.common.internal.BaseGmsClient.zza(r8)
            goto L8e
        L89:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L8e:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.zzc
            r0.onReportServiceBinding(r8)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            r0.onConnectionFailed(r8)
            return
        L9b:
            if (r0 != r5) goto Lba
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto La6
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        La6:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r8 = r8.zzc
            r8.onReportServiceBinding(r0)
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            r8.onConnectionFailed(r0)
            return
        Lba:
            r1 = 6
            if (r0 != r1) goto Le0
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            com.google.android.gms.common.internal.BaseGmsClient.zzi(r0, r3)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r1 = com.google.android.gms.common.internal.BaseGmsClient.zzb(r0)
            if (r1 == 0) goto Ld3
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = com.google.android.gms.common.internal.BaseGmsClient.zzb(r0)
            int r1 = r8.arg2
            r0.onConnectionSuspended(r1)
        Ld3:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            int r8 = r8.arg2
            r0.onConnectionSuspended(r8)
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            com.google.android.gms.common.internal.BaseGmsClient.zzn(r8, r3, r2, r6)
            return
        Le0:
            r1 = 2
            if (r0 != r1) goto Lf0
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto Lec
            goto Lf0
        Lec:
            zza(r8)
            return
        Lf0:
            boolean r0 = zzb(r8)
            if (r0 == 0) goto Lfe
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.internal.zzc r8 = (com.google.android.gms.common.internal.zzc) r8
            r8.zze()
            return
        Lfe:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 45
            r0.<init>(r1)
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r0, r8)
            return
        L11e:
            zza(r8)
            return
    }
}
