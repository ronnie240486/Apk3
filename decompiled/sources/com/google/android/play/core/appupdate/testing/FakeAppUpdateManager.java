package com.google.android.play.core.appupdate.testing;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public class FakeAppUpdateManager implements com.google.android.play.core.appupdate.AppUpdateManager {
    private final com.google.android.play.core.appupdate.zzb zza;
    private final android.content.Context zzb;
    private final java.util.List zzc;

    @com.google.android.play.core.install.model.InstallStatus
    private int zzd;

    @com.google.android.play.core.install.model.InstallErrorCode
    private int zze;
    private boolean zzf;
    private int zzg;

    @androidx.annotation.Nullable
    private java.lang.Integer zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;

    @androidx.annotation.Nullable
    @com.google.android.play.core.install.model.AppUpdateType
    private java.lang.Integer zzo;

    public FakeAppUpdateManager(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.zzc = r0
            r0 = 0
            r3.zzd = r0
            r3.zze = r0
            r3.zzf = r0
            r3.zzg = r0
            r1 = 0
            r3.zzh = r1
            r3.zzi = r0
            r1 = 0
            r3.zzj = r1
            r3.zzk = r1
            r3.zzl = r0
            r3.zzm = r0
            r3.zzn = r0
            com.google.android.play.core.appupdate.zzb r0 = new com.google.android.play.core.appupdate.zzb
            r0.<init>(r4)
            r3.zza = r0
            r3.zzb = r4
            return
    }

    private static int zza() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L9
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @com.google.android.play.core.install.model.UpdateAvailability
    private final int zzb() {
            r2 = this;
            boolean r0 = r2.zzf
            if (r0 == 0) goto L16
            int r0 = r2.zzd
            if (r0 == 0) goto L14
            r1 = 4
            if (r0 == r1) goto L14
            r1 = 5
            if (r0 == r1) goto L14
            r1 = 6
            if (r0 != r1) goto L12
            goto L14
        L12:
            r0 = 3
            return r0
        L14:
            r0 = 2
            return r0
        L16:
            r0 = 1
            return r0
    }

    private final void zzc() {
            r8 = this;
            com.google.android.play.core.appupdate.zzb r0 = r8.zza
            int r1 = r8.zzd
            long r2 = r8.zzj
            long r4 = r8.zzk
            int r6 = r8.zze
            android.content.Context r7 = r8.zzb
            java.lang.String r7 = r7.getPackageName()
            com.google.android.play.core.install.InstallState r1 = com.google.android.play.core.install.InstallState.zza(r1, r2, r4, r6, r7)
            r0.zzi(r1)
            return
    }

    private final boolean zzd(com.google.android.play.core.appupdate.AppUpdateInfo r3, com.google.android.play.core.appupdate.AppUpdateOptions r4) {
            r2 = this;
            boolean r0 = r3.isUpdateTypeAllowed(r4)
            r1 = 0
            if (r0 != 0) goto L21
            int r0 = r4.appUpdateType()
            com.google.android.play.core.appupdate.AppUpdateOptions r0 = com.google.android.play.core.appupdate.AppUpdateOptions.defaultOptions(r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L20
            int r0 = r4.appUpdateType()
            boolean r3 = r3.isUpdateTypeAllowed(r0)
            if (r3 == 0) goto L20
            goto L21
        L20:
            return r1
        L21:
            int r3 = r4.appUpdateType()
            r4 = 1
            if (r3 != r4) goto L31
            r2.zzm = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.zzo = r3
            goto L39
        L31:
            r2.zzl = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.zzo = r3
        L39:
            return r4
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public com.google.android.play.core.tasks.Task<java.lang.Void> completeUpdate() {
            r3 = this;
            int r0 = r3.zze
            if (r0 == 0) goto Le
            com.google.android.play.core.install.InstallException r1 = new com.google.android.play.core.install.InstallException
            r1.<init>(r0)
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.zza(r1)
            return r0
        Le:
            int r0 = r3.zzd
            r1 = 11
            r2 = 3
            if (r0 != r1) goto L30
            r3.zzd = r2
            r0 = 1
            r3.zzn = r0
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = r3.zzo
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
            r3.zzc()
        L2a:
            r0 = 0
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.zzb(r0)
            return r0
        L30:
            if (r0 != r2) goto L3d
            com.google.android.play.core.install.InstallException r0 = new com.google.android.play.core.install.InstallException
            r1 = -8
            r0.<init>(r1)
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.zza(r0)
            return r0
        L3d:
            com.google.android.play.core.install.InstallException r0 = new com.google.android.play.core.install.InstallException
            r1 = -7
            r0.<init>(r1)
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.zza(r0)
            return r0
    }

    public void downloadCompletes() {
            r4 = this;
            int r0 = r4.zzd
            r1 = 1
            r2 = 2
            if (r0 == r2) goto L8
            if (r0 != r1) goto L32
        L8:
            r0 = 11
            r4.zzd = r0
            r2 = 0
            r4.zzj = r2
            r4.zzk = r2
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = r4.zzo
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L23
            r4.zzc()
            return
        L23:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = r4.zzo
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L32
            r4.completeUpdate()
        L32:
            return
    }

    public void downloadFails() {
            r3 = this;
            int r0 = r3.zzd
            r1 = 1
            if (r0 == r1) goto La
            r1 = 2
            if (r0 != r1) goto L9
            goto La
        L9:
            return
        La:
            r0 = 5
            r3.zzd = r0
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = r3.zzo
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1d
            r3.zzc()
        L1d:
            r1 = 0
            r3.zzo = r1
            r3.zzm = r0
            r3.zzd = r0
            return
    }

    public void downloadStarts() {
            r2 = this;
            int r0 = r2.zzd
            r1 = 1
            if (r0 != r1) goto L18
            r0 = 2
            r2.zzd = r0
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = r2.zzo
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            r2.zzc()
        L18:
            return
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public com.google.android.play.core.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo> getAppUpdateInfo() {
            r23 = this;
            r0 = r23
            int r1 = r0.zze
            if (r1 == 0) goto L10
            com.google.android.play.core.install.InstallException r2 = new com.google.android.play.core.install.InstallException
            r2.<init>(r1)
            com.google.android.play.core.tasks.Task r1 = com.google.android.play.core.tasks.Tasks.zza(r2)
            return r1
        L10:
            int r1 = r23.zzb()
            r2 = 2
            r3 = 0
            if (r1 != r2) goto L81
            java.util.List r1 = r0.zzc
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L44
            android.content.Context r1 = r0.zzb
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            int r5 = zza()
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r1, r2, r4, r5)
            android.content.Context r4 = r0.zzb
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            int r6 = zza()
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r4, r2, r5, r6)
            goto L46
        L44:
            r1 = r3
            r4 = r1
        L46:
            java.util.List r5 = r0.zzc
            r6 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L78
            android.content.Context r3 = r0.zzb
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            int r6 = zza()
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r3, r2, r5, r6)
            android.content.Context r5 = r0.zzb
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            int r7 = zza()
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r5, r2, r6, r7)
            r20 = r1
            r21 = r2
            r19 = r3
            goto L7e
        L78:
            r20 = r1
            r19 = r3
            r21 = r19
        L7e:
            r22 = r4
            goto L89
        L81:
            r19 = r3
            r20 = r19
            r21 = r20
            r22 = r21
        L89:
            android.content.Context r1 = r0.zzb
            java.lang.String r5 = r1.getPackageName()
            int r6 = r0.zzg
            int r7 = r23.zzb()
            int r8 = r0.zzd
            java.lang.Integer r9 = r0.zzh
            int r10 = r0.zzi
            long r11 = r0.zzj
            long r13 = r0.zzk
            r15 = 0
            r17 = 0
            com.google.android.play.core.appupdate.AppUpdateInfo r1 = com.google.android.play.core.appupdate.AppUpdateInfo.zzb(r5, r6, r7, r8, r9, r10, r11, r13, r15, r17, r19, r20, r21, r22)
            com.google.android.play.core.tasks.Task r1 = com.google.android.play.core.tasks.Tasks.zzb(r1)
            return r1
    }

    @androidx.annotation.Nullable
    @com.google.android.play.core.install.model.AppUpdateType
    public java.lang.Integer getTypeForUpdateInProgress() {
            r1 = this;
            java.lang.Integer r0 = r1.zzo
            return r0
    }

    public void installCompletes() {
            r4 = this;
            int r0 = r4.zzd
            r1 = 3
            if (r0 != r1) goto L2f
            r0 = 4
            r4.zzd = r0
            r0 = 0
            r4.zzf = r0
            r4.zzg = r0
            r1 = 0
            r4.zzh = r1
            r4.zzi = r0
            r2 = 0
            r4.zzj = r2
            r4.zzk = r2
            r4.zzm = r0
            r4.zzn = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r3 = r4.zzo
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2b
            r4.zzc()
        L2b:
            r4.zzo = r1
            r4.zzd = r0
        L2f:
            return
    }

    public void installFails() {
            r3 = this;
            int r0 = r3.zzd
            r1 = 3
            if (r0 != r1) goto L21
            r0 = 5
            r3.zzd = r0
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = r3.zzo
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L18
            r3.zzc()
        L18:
            r1 = 0
            r3.zzo = r1
            r3.zzn = r0
            r3.zzm = r0
            r3.zzd = r0
        L21:
            return
    }

    public boolean isConfirmationDialogVisible() {
            r1 = this;
            boolean r0 = r1.zzl
            return r0
    }

    public boolean isImmediateFlowVisible() {
            r1 = this;
            boolean r0 = r1.zzm
            return r0
    }

    public boolean isInstallSplashScreenVisible() {
            r1 = this;
            boolean r0 = r1.zzn
            return r0
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public void registerListener(com.google.android.play.core.install.InstallStateUpdatedListener r2) {
            r1 = this;
            com.google.android.play.core.appupdate.zzb r0 = r1.zza
            r0.zzf(r2)
            return
    }

    public void setBytesDownloaded(long r4) {
            r3 = this;
            int r0 = r3.zzd
            r1 = 2
            if (r0 != r1) goto L1d
            long r0 = r3.zzk
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L1d
            r3.zzj = r4
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = r3.zzo
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L1d
            r3.zzc()
        L1d:
            return
    }

    public void setClientVersionStalenessDays(@androidx.annotation.Nullable java.lang.Integer r2) {
            r1 = this;
            boolean r0 = r1.zzf
            if (r0 == 0) goto L6
            r1.zzh = r2
        L6:
            return
    }

    public void setInstallErrorCode(@com.google.android.play.core.install.model.InstallErrorCode int r1) {
            r0 = this;
            r0.zze = r1
            return
    }

    public void setTotalBytesToDownload(long r3) {
            r2 = this;
            int r0 = r2.zzd
            r1 = 2
            if (r0 != r1) goto L17
            r2.zzk = r3
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = r2.zzo
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L17
            r2.zzc()
        L17:
            return
    }

    public void setUpdateAvailable(int r4) {
            r3 = this;
            r0 = 1
            r3.zzf = r0
            java.util.List r1 = r3.zzc
            r1.clear()
            java.util.List r1 = r3.zzc
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            java.util.List r1 = r3.zzc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            r3.zzg = r4
            return
    }

    public void setUpdateAvailable(int r2, @com.google.android.play.core.install.model.AppUpdateType int r3) {
            r1 = this;
            r0 = 1
            r1.zzf = r0
            java.util.List r0 = r1.zzc
            r0.clear()
            java.util.List r0 = r1.zzc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            r1.zzg = r2
            return
    }

    public void setUpdateNotAvailable() {
            r1 = this;
            r0 = 0
            r1.zzf = r0
            r0 = 0
            r1.zzh = r0
            return
    }

    public void setUpdatePriority(int r2) {
            r1 = this;
            boolean r0 = r1.zzf
            if (r0 == 0) goto L6
            r1.zzi = r2
        L6:
            return
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final com.google.android.play.core.tasks.Task<java.lang.Integer> startUpdateFlow(com.google.android.play.core.appupdate.AppUpdateInfo r1, android.app.Activity r2, com.google.android.play.core.appupdate.AppUpdateOptions r3) {
            r0 = this;
            boolean r1 = r0.zzd(r1, r3)
            if (r1 == 0) goto L10
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.play.core.tasks.Task r1 = com.google.android.play.core.tasks.Tasks.zzb(r1)
            return r1
        L10:
            com.google.android.play.core.install.InstallException r1 = new com.google.android.play.core.install.InstallException
            r2 = -6
            r1.<init>(r2)
            com.google.android.play.core.tasks.Task r1 = com.google.android.play.core.tasks.Tasks.zza(r1)
            return r1
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r1, @com.google.android.play.core.install.model.AppUpdateType int r2, android.app.Activity r3, int r4) {
            r0 = this;
            com.google.android.play.core.appupdate.AppUpdateOptions$Builder r2 = com.google.android.play.core.appupdate.AppUpdateOptions.newBuilder(r2)
            com.google.android.play.core.appupdate.AppUpdateOptions r2 = r2.build()
            boolean r1 = r0.zzd(r1, r2)
            return r1
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r1, @com.google.android.play.core.install.model.AppUpdateType int r2, com.google.android.play.core.common.IntentSenderForResultStarter r3, int r4) {
            r0 = this;
            com.google.android.play.core.appupdate.AppUpdateOptions$Builder r2 = com.google.android.play.core.appupdate.AppUpdateOptions.newBuilder(r2)
            com.google.android.play.core.appupdate.AppUpdateOptions r2 = r2.build()
            boolean r1 = r0.zzd(r1, r2)
            return r1
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r1, android.app.Activity r2, com.google.android.play.core.appupdate.AppUpdateOptions r3, int r4) {
            r0 = this;
            boolean r1 = r0.zzd(r1, r3)
            return r1
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r1, com.google.android.play.core.common.IntentSenderForResultStarter r2, com.google.android.play.core.appupdate.AppUpdateOptions r3, int r4) {
            r0 = this;
            boolean r1 = r0.zzd(r1, r3)
            return r1
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public void unregisterListener(com.google.android.play.core.install.InstallStateUpdatedListener r2) {
            r1 = this;
            com.google.android.play.core.appupdate.zzb r0 = r1.zza
            r0.zzh(r2)
            return
    }

    public void userAcceptsUpdate() {
            r2 = this;
            boolean r0 = r2.zzl
            if (r0 != 0) goto L8
            boolean r0 = r2.zzm
            if (r0 == 0) goto L1d
        L8:
            r0 = 0
            r2.zzl = r0
            r1 = 1
            r2.zzd = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = r2.zzo
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1d
            r2.zzc()
        L1d:
            return
    }

    public void userCancelsDownload() {
            r3 = this;
            int r0 = r3.zzd
            r1 = 1
            if (r0 == r1) goto La
            r1 = 2
            if (r0 != r1) goto L9
            goto La
        L9:
            return
        La:
            r0 = 6
            r3.zzd = r0
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = r3.zzo
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1d
            r3.zzc()
        L1d:
            r1 = 0
            r3.zzo = r1
            r3.zzm = r0
            r3.zzd = r0
            return
    }

    public void userRejectsUpdate() {
            r2 = this;
            boolean r0 = r2.zzl
            if (r0 != 0) goto La
            boolean r0 = r2.zzm
            if (r0 == 0) goto L9
            goto La
        L9:
            return
        La:
            r0 = 0
            r2.zzl = r0
            r2.zzm = r0
            r1 = 0
            r2.zzo = r1
            r2.zzd = r0
            return
    }
}
