package com.google.android.play.core.missingsplits;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzb implements com.google.android.play.core.missingsplits.MissingSplitsManager {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final android.content.Context zzb;
    private final java.lang.Runtime zzc;
    private final com.google.android.play.core.missingsplits.zza zzd;
    private final java.util.concurrent.atomic.AtomicReference zze;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "MissingSplitsManagerImpl"
            r0.<init>(r1)
            com.google.android.play.core.missingsplits.zzb.zza = r0
            return
    }

    public zzb(android.content.Context r1, java.lang.Runtime r2, com.google.android.play.core.missingsplits.zza r3, java.util.concurrent.atomic.AtomicReference r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            return
    }

    @android.annotation.TargetApi(21)
    private final java.util.List zza() {
            r2 = this;
            android.content.Context r0 = r2.zzb
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getAppTasks()
            if (r0 == 0) goto L11
            return r0
        L11:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    @Override // com.google.android.play.core.missingsplits.MissingSplitsManager
    public final boolean disableAppIfMissingRequiredSplits() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r7.zze
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r7.zze     // Catch: java.lang.Throwable -> L1b6
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1b6
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L1b6
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L9c
            java.util.concurrent.atomic.AtomicReference r1 = r7.zze     // Catch: java.lang.Throwable -> L1b6
            android.content.Context r4 = r7.zzb     // Catch: java.lang.Throwable -> L1b6
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L1b6
            android.content.Context r5 = r7.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83 java.lang.Throwable -> L1b6
            java.lang.String r5 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83 java.lang.Throwable -> L1b6
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83 java.lang.Throwable -> L1b6
            if (r4 == 0) goto L81
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83 java.lang.Throwable -> L1b6
            if (r4 == 0) goto L81
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83 java.lang.Throwable -> L1b6
            java.lang.String r6 = "com.android.vending.splits.required"
            java.lang.Object r4 = r4.get(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83 java.lang.Throwable -> L1b6
            boolean r4 = r5.equals(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83 java.lang.Throwable -> L1b6
            if (r4 == 0) goto L81
            android.content.Context r4 = r7.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> L1b6
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> L1b6
            android.content.Context r5 = r7.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> L1b6
            java.lang.String r5 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> L1b6
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> L1b6
            java.util.HashSet r5 = new java.util.HashSet     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> L1b6
            r5.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> L1b6
            if (r4 == 0) goto L6b
            java.lang.String[] r4 = r4.splitNames     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> L1b6
            if (r4 == 0) goto L6b
            java.util.Collections.addAll(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> L1b6
            goto L6b
        L56:
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.missingsplits.zzb.zza     // Catch: java.lang.Throwable -> L1b6
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1b6
            android.content.Context r6 = r7.zzb     // Catch: java.lang.Throwable -> L1b6
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> L1b6
            r5[r3] = r6     // Catch: java.lang.Throwable -> L1b6
            java.lang.String r6 = "App '%s' is not found in PackageManager"
            r4.zze(r6, r5)     // Catch: java.lang.Throwable -> L1b6
            java.util.Set r5 = java.util.Collections.emptySet()     // Catch: java.lang.Throwable -> L1b6
        L6b:
            boolean r4 = r5.isEmpty()     // Catch: java.lang.Throwable -> L1b6
            if (r4 != 0) goto L7f
            int r4 = r5.size()     // Catch: java.lang.Throwable -> L1b6
            if (r4 != r2) goto L81
            java.lang.String r4 = ""
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> L1b6
            if (r4 == 0) goto L81
        L7f:
            r4 = 1
            goto L95
        L81:
            r4 = 0
            goto L95
        L83:
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.missingsplits.zzb.zza     // Catch: java.lang.Throwable -> L1b6
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1b6
            android.content.Context r6 = r7.zzb     // Catch: java.lang.Throwable -> L1b6
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> L1b6
            r5[r3] = r6     // Catch: java.lang.Throwable -> L1b6
            java.lang.String r6 = "App '%s' is not found in the PackageManager"
            r4.zze(r6, r5)     // Catch: java.lang.Throwable -> L1b6
            goto L81
        L95:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L1b6
            r1.set(r4)     // Catch: java.lang.Throwable -> L1b6
        L9c:
            java.util.concurrent.atomic.AtomicReference r1 = r7.zze     // Catch: java.lang.Throwable -> L1b6
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1b6
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L1b6
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L1b6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b6
            if (r1 == 0) goto L1a3
            java.util.List r0 = r7.zza()
            java.util.Iterator r0 = r0.iterator()
        Lb3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf5
            java.lang.Object r1 = r0.next()
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r4 = r1.getTaskInfo()
            if (r4 == 0) goto Lb3
            android.app.ActivityManager$RecentTaskInfo r4 = r1.getTaskInfo()
            android.content.Intent r4 = r4.baseIntent
            if (r4 == 0) goto Lb3
            android.app.ActivityManager$RecentTaskInfo r4 = r1.getTaskInfo()
            android.content.Intent r4 = r4.baseIntent
            android.content.ComponentName r4 = r4.getComponent()
            if (r4 == 0) goto Lb3
            android.app.ActivityManager$RecentTaskInfo r1 = r1.getTaskInfo()
            android.content.Intent r1 = r1.baseIntent
            android.content.ComponentName r1 = r1.getComponent()
            java.lang.String r1 = r1.getClassName()
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r4 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            java.lang.String r4 = r4.getName()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto Lb3
            goto L1a2
        Lf5:
            java.util.List r0 = r7.zza()
            java.util.Iterator r0 = r0.iterator()
        Lfd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L157
            java.lang.Object r1 = r0.next()
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r1 = r1.getTaskInfo()
            if (r1 == 0) goto Lfd
            android.content.Intent r4 = r1.baseIntent
            if (r4 == 0) goto Lfd
            android.content.ComponentName r4 = r4.getComponent()
            if (r4 == 0) goto Lfd
            android.content.Intent r1 = r1.baseIntent
            android.content.ComponentName r1 = r1.getComponent()
            java.lang.String r4 = r1.getClassName()
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L13d
        L127:
            if (r1 == 0) goto Lfd
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L133
        L131:
            r0 = 1
            goto L158
        L133:
            java.lang.Class r4 = r1.getSuperclass()
            if (r4 == r1) goto L13b
            r1 = r4
            goto L127
        L13b:
            r1 = 0
            goto L127
        L13d:
            com.google.android.play.core.internal.zzag r5 = com.google.android.play.core.missingsplits.zzb.zza
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r3] = r4
            java.lang.String r4 = "ClassNotFoundException when scanning class hierarchy of '%s'"
            r5.zze(r4, r6)
            android.content.Context r4 = r7.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L155
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L155
            android.content.pm.ActivityInfo r1 = r4.getActivityInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L155
            if (r1 == 0) goto Lfd
            goto L131
        L155:
            goto Lfd
        L157:
            r0 = 0
        L158:
            com.google.android.play.core.missingsplits.zza r1 = r7.zzd
            r1.zza()
            java.util.List r1 = r7.zza()
            java.util.Iterator r1 = r1.iterator()
        L165:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L175
            java.lang.Object r4 = r1.next()
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4
            r4.finishAndRemoveTask()
            goto L165
        L175:
            if (r0 == 0) goto L19d
            android.content.Context r0 = r7.zzb
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r4 = r7.zzb
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r5 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r1.<init>(r4, r5)
            r0.setComponentEnabledSetting(r1, r2, r2)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r7.zzb
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r4 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r0.<init>(r1, r4)
            r1 = 884998144(0x34c00000, float:3.5762787E-7)
            android.content.Intent r0 = r0.addFlags(r1)
            android.content.Context r1 = r7.zzb
            r1.startActivity(r0)
        L19d:
            java.lang.Runtime r0 = r7.zzc
            r0.exit(r3)
        L1a2:
            return r2
        L1a3:
            com.google.android.play.core.missingsplits.zza r0 = r7.zzd
            boolean r0 = r0.zzc()
            if (r0 == 0) goto L1b5
            com.google.android.play.core.missingsplits.zza r0 = r7.zzd
            r0.zzb()
            java.lang.Runtime r0 = r7.zzc
            r0.exit(r3)
        L1b5:
            return r3
        L1b6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b6
            throw r1
    }

    @Override // com.google.android.play.core.missingsplits.MissingSplitsManager
    public final boolean isMissingRequiredSplits() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r7.zze
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r7.zze     // Catch: java.lang.Throwable -> La9
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> La9
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> La9
            if (r1 != 0) goto L9b
            java.util.concurrent.atomic.AtomicReference r1 = r7.zze     // Catch: java.lang.Throwable -> La9
            android.content.Context r2 = r7.zzb     // Catch: java.lang.Throwable -> La9
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> La9
            r3 = 1
            r4 = 0
            android.content.Context r5 = r7.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82 java.lang.Throwable -> La9
            java.lang.String r5 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82 java.lang.Throwable -> La9
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82 java.lang.Throwable -> La9
            if (r2 == 0) goto L80
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82 java.lang.Throwable -> La9
            if (r2 == 0) goto L80
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82 java.lang.Throwable -> La9
            java.lang.String r6 = "com.android.vending.splits.required"
            java.lang.Object r2 = r2.get(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82 java.lang.Throwable -> La9
            boolean r2 = r5.equals(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82 java.lang.Throwable -> La9
            if (r2 == 0) goto L80
            android.content.Context r2 = r7.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> La9
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> La9
            android.content.Context r5 = r7.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> La9
            java.lang.String r5 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> La9
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> La9
            java.util.HashSet r5 = new java.util.HashSet     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> La9
            r5.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> La9
            if (r2 == 0) goto L6b
            java.lang.String[] r2 = r2.splitNames     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> La9
            if (r2 == 0) goto L6b
            java.util.Collections.addAll(r5, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56 java.lang.Throwable -> La9
            goto L6b
        L56:
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.missingsplits.zzb.zza     // Catch: java.lang.Throwable -> La9
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La9
            android.content.Context r6 = r7.zzb     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> La9
            r5[r4] = r6     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = "App '%s' is not found in PackageManager"
            r2.zze(r6, r5)     // Catch: java.lang.Throwable -> La9
            java.util.Set r5 = java.util.Collections.emptySet()     // Catch: java.lang.Throwable -> La9
        L6b:
            boolean r2 = r5.isEmpty()     // Catch: java.lang.Throwable -> La9
            if (r2 != 0) goto L94
            int r2 = r5.size()     // Catch: java.lang.Throwable -> La9
            if (r2 != r3) goto L80
            java.lang.String r2 = ""
            boolean r2 = r5.contains(r2)     // Catch: java.lang.Throwable -> La9
            if (r2 == 0) goto L80
            goto L94
        L80:
            r3 = 0
            goto L94
        L82:
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.missingsplits.zzb.zza     // Catch: java.lang.Throwable -> La9
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La9
            android.content.Context r5 = r7.zzb     // Catch: java.lang.Throwable -> La9
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> La9
            r3[r4] = r5     // Catch: java.lang.Throwable -> La9
            java.lang.String r5 = "App '%s' is not found in the PackageManager"
            r2.zze(r5, r3)     // Catch: java.lang.Throwable -> La9
            goto L80
        L94:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> La9
            r1.set(r2)     // Catch: java.lang.Throwable -> La9
        L9b:
            java.util.concurrent.atomic.AtomicReference r1 = r7.zze     // Catch: java.lang.Throwable -> La9
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> La9
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> La9
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> La9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            return r1
        La9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            throw r1
    }
}
