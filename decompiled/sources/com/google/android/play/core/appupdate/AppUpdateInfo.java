package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public class AppUpdateInfo {

    @androidx.annotation.NonNull
    private final java.lang.String zza;
    private final int zzb;

    @com.google.android.play.core.install.model.UpdateAvailability
    private final int zzc;

    @com.google.android.play.core.install.model.InstallStatus
    private final int zzd;

    @androidx.annotation.Nullable
    private final java.lang.Integer zze;
    private final int zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;

    @androidx.annotation.Nullable
    private final android.app.PendingIntent zzk;

    @androidx.annotation.Nullable
    private final android.app.PendingIntent zzl;

    @androidx.annotation.Nullable
    private final android.app.PendingIntent zzm;

    @androidx.annotation.Nullable
    private final android.app.PendingIntent zzn;
    private boolean zzo;

    private AppUpdateInfo(@androidx.annotation.NonNull java.lang.String r4, int r5, @com.google.android.play.core.install.model.UpdateAvailability int r6, @com.google.android.play.core.install.model.InstallStatus int r7, @androidx.annotation.Nullable java.lang.Integer r8, int r9, long r10, long r12, long r14, long r16, @androidx.annotation.Nullable android.app.PendingIntent r18, @androidx.annotation.Nullable android.app.PendingIntent r19, @androidx.annotation.Nullable android.app.PendingIntent r20, @androidx.annotation.Nullable android.app.PendingIntent r21) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = 0
            r0.zzo = r1
            r1 = r4
            r0.zza = r1
            r1 = r5
            r0.zzb = r1
            r1 = r6
            r0.zzc = r1
            r1 = r7
            r0.zzd = r1
            r1 = r8
            r0.zze = r1
            r1 = r9
            r0.zzf = r1
            r1 = r10
            r0.zzg = r1
            r1 = r12
            r0.zzh = r1
            r1 = r14
            r0.zzi = r1
            r1 = r16
            r0.zzj = r1
            r1 = r18
            r0.zzk = r1
            r1 = r19
            r0.zzl = r1
            r1 = r20
            r0.zzm = r1
            r1 = r21
            r0.zzn = r1
            return
    }

    public static com.google.android.play.core.appupdate.AppUpdateInfo zzb(@androidx.annotation.NonNull java.lang.String r20, int r21, @com.google.android.play.core.install.model.UpdateAvailability int r22, @com.google.android.play.core.install.model.InstallStatus int r23, @androidx.annotation.Nullable java.lang.Integer r24, int r25, long r26, long r28, long r30, long r32, @androidx.annotation.Nullable android.app.PendingIntent r34, @androidx.annotation.Nullable android.app.PendingIntent r35, @androidx.annotation.Nullable android.app.PendingIntent r36, @androidx.annotation.Nullable android.app.PendingIntent r37) {
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r9 = r28
            r11 = r30
            r13 = r32
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            com.google.android.play.core.appupdate.AppUpdateInfo r19 = new com.google.android.play.core.appupdate.AppUpdateInfo
            r0 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r15, r16, r17, r18)
            return r19
    }

    private final boolean zze(com.google.android.play.core.appupdate.AppUpdateOptions r5) {
            r4 = this;
            boolean r5 = r5.allowAssetPackDeletion()
            if (r5 == 0) goto L10
            long r0 = r4.zzi
            long r2 = r4.zzj
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L10
            r5 = 1
            return r5
        L10:
            r5 = 0
            return r5
    }

    public int availableVersionCode() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public long bytesDownloaded() {
            r2 = this;
            long r0 = r2.zzg
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Integer clientVersionStalenessDays() {
            r1 = this;
            java.lang.Integer r0 = r1.zze
            return r0
    }

    @com.google.android.play.core.install.model.InstallStatus
    public int installStatus() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    public boolean isUpdateTypeAllowed(@com.google.android.play.core.install.model.AppUpdateType int r1) {
            r0 = this;
            com.google.android.play.core.appupdate.AppUpdateOptions r1 = com.google.android.play.core.appupdate.AppUpdateOptions.defaultOptions(r1)
            android.app.PendingIntent r1 = r0.zza(r1)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public boolean isUpdateTypeAllowed(@androidx.annotation.NonNull com.google.android.play.core.appupdate.AppUpdateOptions r1) {
            r0 = this;
            android.app.PendingIntent r1 = r0.zza(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @androidx.annotation.NonNull
    public java.lang.String packageName() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public long totalBytesToDownload() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }

    @com.google.android.play.core.install.model.UpdateAvailability
    public int updateAvailability() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public int updatePriority() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    @androidx.annotation.Nullable
    public final android.app.PendingIntent zza(com.google.android.play.core.appupdate.AppUpdateOptions r4) {
            r3 = this;
            int r0 = r4.appUpdateType()
            r1 = 0
            if (r0 != 0) goto L16
            android.app.PendingIntent r0 = r3.zzl
            if (r0 == 0) goto Lc
            return r0
        Lc:
            boolean r4 = r3.zze(r4)
            if (r4 == 0) goto L15
            android.app.PendingIntent r4 = r3.zzn
            return r4
        L15:
            return r1
        L16:
            int r0 = r4.appUpdateType()
            r2 = 1
            if (r0 != r2) goto L2b
            android.app.PendingIntent r0 = r3.zzk
            if (r0 == 0) goto L22
            return r0
        L22:
            boolean r4 = r3.zze(r4)
            if (r4 == 0) goto L2b
            android.app.PendingIntent r4 = r3.zzm
            return r4
        L2b:
            return r1
    }

    public final void zzc() {
            r1 = this;
            r0 = 1
            r1.zzo = r0
            return
    }

    public final boolean zzd() {
            r1 = this;
            boolean r0 = r1.zzo
            return r0
    }
}
