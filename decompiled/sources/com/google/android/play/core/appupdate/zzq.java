package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzq {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final com.google.android.play.core.internal.zzag zzb = null;
    private static final android.content.Intent zzc = null;

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    public com.google.android.play.core.internal.zzas zza;
    private final java.lang.String zzd;
    private final android.content.Context zze;
    private final com.google.android.play.core.appupdate.zzs zzf;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "AppUpdateService"
            r0.<init>(r1)
            com.google.android.play.core.appupdate.zzq.zzb = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.play.core.install.BIND_UPDATE_SERVICE"
            r0.<init>(r1)
            java.lang.String r1 = "com.android.vending"
            android.content.Intent r0 = r0.setPackage(r1)
            com.google.android.play.core.appupdate.zzq.zzc = r0
            return
    }

    public zzq(android.content.Context r8, com.google.android.play.core.appupdate.zzs r9) {
            r7 = this;
            r7.<init>()
            java.lang.String r0 = r8.getPackageName()
            r7.zzd = r0
            r7.zze = r8
            r7.zzf = r9
            boolean r9 = com.google.android.play.core.internal.zzch.zzb(r8)
            if (r9 == 0) goto L28
            com.google.android.play.core.internal.zzas r9 = new com.google.android.play.core.internal.zzas
            android.content.Context r1 = com.google.android.play.core.internal.zzce.zza(r8)
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.appupdate.zzq.zzb
            android.content.Intent r4 = com.google.android.play.core.appupdate.zzq.zzc
            com.google.android.play.core.appupdate.zzk r5 = com.google.android.play.core.appupdate.zzk.zza
            r6 = 0
            java.lang.String r3 = "AppUpdateService"
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zza = r9
        L28:
            return
    }

    public static /* bridge */ /* synthetic */ android.os.Bundle zzb(com.google.android.play.core.appupdate.zzq r2, java.lang.String r3) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = zzi()
            r0.putAll(r1)
            java.lang.String r1 = "package.name"
            r0.putString(r1, r3)
            r3 = 0
            android.content.Context r1 = r2.zze     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.Context r2 = r2.zze     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            int r2 = r2.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            goto L33
        L29:
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.appupdate.zzq.zzb
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r1 = "The current version of the app could not be retrieved"
            r2.zzb(r1, r3)
            r2 = 0
        L33:
            if (r2 == 0) goto L3e
            int r2 = r2.intValue()
            java.lang.String r3 = "app.version.code"
            r0.putInt(r3, r2)
        L3e:
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Bundle zzc() {
            android.os.Bundle r0 = zzi()
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.appupdate.AppUpdateInfo zzd(com.google.android.play.core.appupdate.zzq r21, android.os.Bundle r22, java.lang.String r23) {
            r0 = r22
            java.lang.String r1 = "version.code"
            r2 = -1
            int r4 = r0.getInt(r1, r2)
            java.lang.String r1 = "update.availability"
            int r5 = r0.getInt(r1)
            java.lang.String r1 = "install.status"
            r3 = 0
            int r6 = r0.getInt(r1, r3)
            java.lang.String r1 = "client.version.staleness"
            int r7 = r0.getInt(r1, r2)
            if (r7 != r2) goto L22
            r1 = 0
            goto L2a
        L22:
            int r1 = r0.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L2a:
            r7 = r1
            java.lang.String r1 = "in.app.update.priority"
            int r8 = r0.getInt(r1, r3)
            java.lang.String r1 = "bytes.downloaded"
            long r9 = r0.getLong(r1)
            java.lang.String r1 = "total.bytes.to.download"
            long r11 = r0.getLong(r1)
            java.lang.String r1 = "additional.size.required"
            long r13 = r0.getLong(r1)
            r1 = r21
            com.google.android.play.core.appupdate.zzs r1 = r1.zzf
            long r15 = r1.zza()
            java.lang.String r1 = "blocking.intent"
            android.os.Parcelable r1 = r0.getParcelable(r1)
            r17 = r1
            android.app.PendingIntent r17 = (android.app.PendingIntent) r17
            java.lang.String r1 = "nonblocking.intent"
            android.os.Parcelable r1 = r0.getParcelable(r1)
            r18 = r1
            android.app.PendingIntent r18 = (android.app.PendingIntent) r18
            java.lang.String r1 = "blocking.destructive.intent"
            android.os.Parcelable r1 = r0.getParcelable(r1)
            r19 = r1
            android.app.PendingIntent r19 = (android.app.PendingIntent) r19
            java.lang.String r1 = "nonblocking.destructive.intent"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r20 = r0
            android.app.PendingIntent r20 = (android.app.PendingIntent) r20
            r3 = r23
            com.google.android.play.core.appupdate.AppUpdateInfo r0 = com.google.android.play.core.appupdate.AppUpdateInfo.zzb(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r17, r18, r19, r20)
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.internal.zzag zze() {
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.appupdate.zzq.zzb
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String zzh(com.google.android.play.core.appupdate.zzq r0) {
            java.lang.String r0 = r0.zzd
            return r0
    }

    private static android.os.Bundle zzi() {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "app_update"
            android.os.Bundle r1 = com.google.android.play.core.common.PlayCoreVersion.zza(r1)
            r0.putAll(r1)
            java.lang.String r1 = "playcore.version.code"
            r2 = 11003(0x2afb, float:1.5418E-41)
            r0.putInt(r1, r2)
            return r0
    }

    private static com.google.android.play.core.tasks.Task zzj() {
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.appupdate.zzq.zzb
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = -9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = "onError(%d)"
            r0.zzb(r3, r1)
            com.google.android.play.core.install.InstallException r0 = new com.google.android.play.core.install.InstallException
            r0.<init>(r2)
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.zza(r0)
            return r0
    }

    public final com.google.android.play.core.tasks.Task zzf(java.lang.String r4) {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zza
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r4 = zzj()
            return r4
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.appupdate.zzq.zzb
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "completeUpdate(%s)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r3.zza
            com.google.android.play.core.appupdate.zzm r2 = new com.google.android.play.core.appupdate.zzm
            r2.<init>(r3, r0, r0, r4)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r4 = r0.zza()
            return r4
    }

    public final com.google.android.play.core.tasks.Task zzg(java.lang.String r4) {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zza
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r4 = zzj()
            return r4
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.appupdate.zzq.zzb
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "requestUpdateInfo(%s)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r3.zza
            com.google.android.play.core.appupdate.zzl r2 = new com.google.android.play.core.appupdate.zzl
            r2.<init>(r3, r0, r4, r0)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r4 = r0.zza()
            return r4
    }
}
