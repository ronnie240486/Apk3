package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzb extends com.google.android.play.core.internal.zzx {

    @androidx.annotation.VisibleForTesting
    public final android.app.NotificationManager zza;
    private final com.google.android.play.core.internal.zzag zzb;
    private final android.content.Context zzc;
    private final com.google.android.play.core.assetpacks.zzbh zzd;
    private final com.google.android.play.core.assetpacks.zzl zze;
    private final com.google.android.play.core.assetpacks.zzci zzf;

    public zzb(android.content.Context r3, com.google.android.play.core.assetpacks.zzbh r4, com.google.android.play.core.assetpacks.zzl r5, com.google.android.play.core.assetpacks.zzci r6) {
            r2 = this;
            r2.<init>()
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "AssetPackExtractionService"
            r0.<init>(r1)
            r2.zzb = r0
            r2.zzc = r3
            r2.zzd = r4
            r2.zze = r5
            r2.zzf = r6
            java.lang.String r4 = "notification"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            r2.zza = r3
            return
    }

    @android.annotation.TargetApi(26)
    private final synchronized void zzd(@androidx.annotation.Nullable java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L5
            java.lang.String r4 = "File downloads by Play"
        L5:
            android.app.NotificationChannel r0 = new android.app.NotificationChannel     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "playcore-assetpacks-service-notification-channel"
            r2 = 2
            r0.<init>(r1, r4, r2)     // Catch: java.lang.Throwable -> L14
            android.app.NotificationManager r4 = r3.zza     // Catch: java.lang.Throwable -> L14
            r4.createNotificationChannel(r0)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            return
        L14:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    private final synchronized void zze(android.os.Bundle r11, com.google.android.play.core.internal.zzz r12) throws android.os.RemoteException {
            r10 = this;
            monitor-enter(r10)
            com.google.android.play.core.internal.zzag r0 = r10.zzb     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r1 = "updateServiceState AIDL call"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lf7
            r0.zza(r1, r3)     // Catch: java.lang.Throwable -> Lf7
            android.content.Context r0 = r10.zzc     // Catch: java.lang.Throwable -> Lf7
            boolean r0 = com.google.android.play.core.internal.zzch.zzb(r0)     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto Led
            android.content.Context r0 = r10.zzc     // Catch: java.lang.Throwable -> Lf7
            boolean r0 = com.google.android.play.core.internal.zzch.zza(r0)     // Catch: java.lang.Throwable -> Lf7
            if (r0 != 0) goto L1e
            goto Led
        L1e:
            java.lang.String r0 = "action_type"
            int r0 = r11.getInt(r0)     // Catch: java.lang.Throwable -> Lf7
            com.google.android.play.core.assetpacks.zzci r1 = r10.zzf     // Catch: java.lang.Throwable -> Lf7
            r1.zzc(r12)     // Catch: java.lang.Throwable -> Lf7
            r1 = 1
            if (r0 != r1) goto Lc5
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lf7
            r0 = 26
            if (r12 < r0) goto L3b
            java.lang.String r3 = "notification_channel_name"
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Throwable -> Lf7
            r10.zzd(r3)     // Catch: java.lang.Throwable -> Lf7
        L3b:
            com.google.android.play.core.assetpacks.zzl r3 = r10.zze     // Catch: java.lang.Throwable -> Lf7
            r3.zzg(r1)     // Catch: java.lang.Throwable -> Lf7
            com.google.android.play.core.assetpacks.zzci r3 = r10.zzf     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r4 = "notification_title"
            java.lang.String r4 = r11.getString(r4)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r5 = "notification_subtext"
            java.lang.String r5 = r11.getString(r5)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r6 = "notification_timeout"
            r7 = 600000(0x927c0, double:2.964394E-318)
            long r6 = r11.getLong(r6, r7)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r8 = "notification_on_click_intent"
            android.os.Parcelable r8 = r11.getParcelable(r8)     // Catch: java.lang.Throwable -> Lf7
            if (r12 < r0) goto L6d
            android.app.Notification$Builder r12 = new android.app.Notification$Builder     // Catch: java.lang.Throwable -> Lf7
            android.content.Context r0 = r10.zzc     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r9 = "playcore-assetpacks-service-notification-channel"
            r12.<init>(r0, r9)     // Catch: java.lang.Throwable -> Lf7
            android.app.Notification$Builder r12 = r12.setTimeoutAfter(r6)     // Catch: java.lang.Throwable -> Lf7
            goto L79
        L6d:
            android.app.Notification$Builder r12 = new android.app.Notification$Builder     // Catch: java.lang.Throwable -> Lf7
            android.content.Context r0 = r10.zzc     // Catch: java.lang.Throwable -> Lf7
            r12.<init>(r0)     // Catch: java.lang.Throwable -> Lf7
            r0 = -2
            android.app.Notification$Builder r12 = r12.setPriority(r0)     // Catch: java.lang.Throwable -> Lf7
        L79:
            boolean r0 = r8 instanceof android.app.PendingIntent     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto L82
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8     // Catch: java.lang.Throwable -> Lf7
            r12.setContentIntent(r8)     // Catch: java.lang.Throwable -> Lf7
        L82:
            r0 = 17301633(0x1080081, float:2.4979616E-38)
            android.app.Notification$Builder r0 = r12.setSmallIcon(r0)     // Catch: java.lang.Throwable -> Lf7
            android.app.Notification$Builder r0 = r0.setOngoing(r2)     // Catch: java.lang.Throwable -> Lf7
            if (r4 != 0) goto L91
            java.lang.String r4 = "Downloading additional file"
        L91:
            android.app.Notification$Builder r0 = r0.setContentTitle(r4)     // Catch: java.lang.Throwable -> Lf7
            if (r5 != 0) goto L99
            java.lang.String r5 = "Transferring"
        L99:
            r0.setSubText(r5)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = "notification_color"
            int r11 = r11.getInt(r0)     // Catch: java.lang.Throwable -> Lf7
            if (r11 == 0) goto Lac
            android.app.Notification$Builder r11 = r12.setColor(r11)     // Catch: java.lang.Throwable -> Lf7
            r0 = -1
            r11.setVisibility(r0)     // Catch: java.lang.Throwable -> Lf7
        Lac:
            android.app.Notification r11 = r12.build()     // Catch: java.lang.Throwable -> Lf7
            r3.zza(r11)     // Catch: java.lang.Throwable -> Lf7
            android.content.Intent r11 = new android.content.Intent     // Catch: java.lang.Throwable -> Lf7
            android.content.Context r12 = r10.zzc     // Catch: java.lang.Throwable -> Lf7
            java.lang.Class<com.google.android.play.core.assetpacks.ExtractionForegroundService> r0 = com.google.android.play.core.assetpacks.ExtractionForegroundService.class
            r11.<init>(r12, r0)     // Catch: java.lang.Throwable -> Lf7
            android.content.Context r12 = r10.zzc     // Catch: java.lang.Throwable -> Lf7
            com.google.android.play.core.assetpacks.zzci r0 = r10.zzf     // Catch: java.lang.Throwable -> Lf7
            r12.bindService(r11, r0, r1)     // Catch: java.lang.Throwable -> Lf7
            monitor-exit(r10)
            return
        Lc5:
            r11 = 2
            if (r0 != r11) goto Ld4
            com.google.android.play.core.assetpacks.zzl r11 = r10.zze     // Catch: java.lang.Throwable -> Lf7
            r11.zzg(r2)     // Catch: java.lang.Throwable -> Lf7
            com.google.android.play.core.assetpacks.zzci r11 = r10.zzf     // Catch: java.lang.Throwable -> Lf7
            r11.zzb()     // Catch: java.lang.Throwable -> Lf7
            monitor-exit(r10)
            return
        Ld4:
            com.google.android.play.core.internal.zzag r11 = r10.zzb     // Catch: java.lang.Throwable -> Lf7
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lf7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lf7
            r1[r2] = r0     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = "Unknown action type received: %d"
            r11.zzb(r0, r1)     // Catch: java.lang.Throwable -> Lf7
            android.os.Bundle r11 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lf7
            r11.<init>()     // Catch: java.lang.Throwable -> Lf7
            r12.zzd(r11)     // Catch: java.lang.Throwable -> Lf7
            monitor-exit(r10)
            return
        Led:
            android.os.Bundle r11 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lf7
            r11.<init>()     // Catch: java.lang.Throwable -> Lf7
            r12.zzd(r11)     // Catch: java.lang.Throwable -> Lf7
            monitor-exit(r10)
            return
        Lf7:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }

    @Override // com.google.android.play.core.internal.zzy
    public final void zzb(android.os.Bundle r3, com.google.android.play.core.internal.zzz r4) throws android.os.RemoteException {
            r2 = this;
            com.google.android.play.core.internal.zzag r3 = r2.zzb
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "clearAssetPackStorage AIDL call"
            r3.zza(r1, r0)
            android.content.Context r3 = r2.zzc
            boolean r3 = com.google.android.play.core.internal.zzch.zzb(r3)
            if (r3 == 0) goto L29
            android.content.Context r3 = r2.zzc
            boolean r3 = com.google.android.play.core.internal.zzch.zza(r3)
            if (r3 != 0) goto L1b
            goto L29
        L1b:
            com.google.android.play.core.assetpacks.zzbh r3 = r2.zzd
            r3.zzz()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4.zzc(r3)
            return
        L29:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4.zzd(r3)
            return
    }

    @Override // com.google.android.play.core.internal.zzy
    public final void zzc(android.os.Bundle r1, com.google.android.play.core.internal.zzz r2) throws android.os.RemoteException {
            r0 = this;
            r0.zze(r1, r2)
            return
    }
}
