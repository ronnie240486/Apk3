package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzf implements com.google.android.play.core.appupdate.AppUpdateManager {
    private final com.google.android.play.core.appupdate.zzq zza;
    private final com.google.android.play.core.appupdate.zzb zzb;
    private final android.content.Context zzc;
    private final android.os.Handler zzd;

    public zzf(com.google.android.play.core.appupdate.zzq r3, com.google.android.play.core.appupdate.zzb r4, android.content.Context r5) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.zzd = r0
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            return
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> completeUpdate() {
            r2 = this;
            com.google.android.play.core.appupdate.zzq r0 = r2.zza
            android.content.Context r1 = r2.zzc
            java.lang.String r1 = r1.getPackageName()
            com.google.android.play.core.tasks.Task r0 = r0.zzf(r1)
            return r0
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final com.google.android.play.core.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo> getAppUpdateInfo() {
            r2 = this;
            com.google.android.play.core.appupdate.zzq r0 = r2.zza
            android.content.Context r1 = r2.zzc
            java.lang.String r1 = r1.getPackageName()
            com.google.android.play.core.tasks.Task r0 = r0.zzg(r1)
            return r0
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final synchronized void registerListener(com.google.android.play.core.install.InstallStateUpdatedListener r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.play.core.appupdate.zzb r0 = r1.zzb     // Catch: java.lang.Throwable -> L8
            r0.zzf(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final com.google.android.play.core.tasks.Task<java.lang.Integer> startUpdateFlow(com.google.android.play.core.appupdate.AppUpdateInfo r3, android.app.Activity r4, com.google.android.play.core.appupdate.AppUpdateOptions r5) {
            r2 = this;
            if (r3 == 0) goto L4b
            if (r4 == 0) goto L4b
            if (r5 == 0) goto L4b
            boolean r0 = r3.zzd()
            if (r0 == 0) goto Ld
            goto L4b
        Ld:
            boolean r0 = r3.isUpdateTypeAllowed(r5)
            if (r0 != 0) goto L1e
            com.google.android.play.core.install.InstallException r3 = new com.google.android.play.core.install.InstallException
            r4 = -6
            r3.<init>(r4)
            com.google.android.play.core.tasks.Task r3 = com.google.android.play.core.tasks.Tasks.zza(r3)
            return r3
        L1e:
            r3.zzc()
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.google.android.play.core.common.PlayCoreDialogWrapperActivity> r1 = com.google.android.play.core.common.PlayCoreDialogWrapperActivity.class
            r0.<init>(r4, r1)
            android.app.PendingIntent r3 = r3.zza(r5)
            java.lang.String r5 = "confirmation_intent"
            r0.putExtra(r5, r3)
            com.google.android.play.core.tasks.zzi r3 = new com.google.android.play.core.tasks.zzi
            r3.<init>()
            com.google.android.play.core.appupdate.zzd r5 = new com.google.android.play.core.appupdate.zzd
            android.os.Handler r1 = r2.zzd
            r5.<init>(r1, r3)
            java.lang.String r1 = "result_receiver"
            r0.putExtra(r1, r5)
            r4.startActivity(r0)
            com.google.android.play.core.tasks.Task r3 = r3.zza()
            return r3
        L4b:
            com.google.android.play.core.install.InstallException r3 = new com.google.android.play.core.install.InstallException
            r4 = -4
            r3.<init>(r4)
            com.google.android.play.core.tasks.Task r3 = com.google.android.play.core.tasks.Tasks.zza(r3)
            return r3
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r2, @com.google.android.play.core.install.model.AppUpdateType int r3, android.app.Activity r4, int r5) throws android.content.IntentSender.SendIntentException {
            r1 = this;
            com.google.android.play.core.appupdate.AppUpdateOptions r3 = com.google.android.play.core.appupdate.AppUpdateOptions.defaultOptions(r3)
            if (r4 != 0) goto L8
            r2 = 0
            return r2
        L8:
            com.google.android.play.core.appupdate.zze r0 = new com.google.android.play.core.appupdate.zze
            r0.<init>(r4)
            boolean r2 = r1.startUpdateFlowForResult(r2, r0, r3, r5)
            return r2
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r1, @com.google.android.play.core.install.model.AppUpdateType int r2, com.google.android.play.core.common.IntentSenderForResultStarter r3, int r4) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            com.google.android.play.core.appupdate.AppUpdateOptions r2 = com.google.android.play.core.appupdate.AppUpdateOptions.defaultOptions(r2)
            boolean r1 = r0.startUpdateFlowForResult(r1, r3, r2, r4)
            return r1
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r2, android.app.Activity r3, com.google.android.play.core.appupdate.AppUpdateOptions r4, int r5) throws android.content.IntentSender.SendIntentException {
            r1 = this;
            if (r3 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.google.android.play.core.appupdate.zze r0 = new com.google.android.play.core.appupdate.zze
            r0.<init>(r3)
            boolean r2 = r1.startUpdateFlowForResult(r2, r0, r4, r5)
            return r2
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r9, com.google.android.play.core.common.IntentSenderForResultStarter r10, com.google.android.play.core.appupdate.AppUpdateOptions r11, int r12) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            if (r9 == 0) goto L2a
            if (r10 == 0) goto L2a
            if (r11 == 0) goto L2a
            boolean r0 = r9.isUpdateTypeAllowed(r11)
            if (r0 == 0) goto L2a
            boolean r0 = r9.zzd()
            if (r0 == 0) goto L13
            goto L2a
        L13:
            r9.zzc()
            android.app.PendingIntent r9 = r9.zza(r11)
            android.content.IntentSender r1 = r9.getIntentSender()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r10
            r2 = r12
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            r9 = 1
            return r9
        L2a:
            r9 = 0
            return r9
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final synchronized void unregisterListener(com.google.android.play.core.install.InstallStateUpdatedListener r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.play.core.appupdate.zzb r0 = r1.zzb     // Catch: java.lang.Throwable -> L8
            r0.zzh(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
