package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public class GoogleApiAvailability extends com.google.android.gms.common.GoogleApiAvailabilityLight {

    @androidx.annotation.NonNull
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    private static final java.lang.Object zaa = null;
    private static final com.google.android.gms.common.GoogleApiAvailability zab = null;

    @androidx.annotation.GuardedBy("mLock")
    private java.lang.String zac;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.GoogleApiAvailability.zaa = r0
            com.google.android.gms.common.GoogleApiAvailability r0 = new com.google.android.gms.common.GoogleApiAvailability
            r0.<init>()
            com.google.android.gms.common.GoogleApiAvailability.zab = r0
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE = r0
            return
    }

    public GoogleApiAvailability() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.GoogleApiAvailability getInstance() {
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.zab
            return r0
    }

    @androidx.annotation.NonNull
    public static final com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> zai(@androidx.annotation.NonNull com.google.android.gms.common.api.HasApiKey<?> r4, @androidx.annotation.NonNull com.google.android.gms.common.api.HasApiKey<?>... r5) {
            java.lang.String r0 = "Requested API must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r5[r2]
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            int r2 = r2 + 1
            goto L7
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r4)
            java.util.List r4 = java.util.Arrays.asList(r5)
            r0.addAll(r4)
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zal()
            com.google.android.gms.tasks.Task r4 = r4.zao(r0)
            return r4
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<java.lang.Void> checkApiAvailability(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi<?> r1, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi<?>... r2) {
            r0 = this;
            com.google.android.gms.tasks.Task r1 = zai(r1, r2)
            com.google.android.gms.common.zab r2 = com.google.android.gms.common.zab.zaa
            com.google.android.gms.tasks.Task r1 = r1.onSuccessTask(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.tasks.Task<java.lang.Void> checkApiAvailability(@androidx.annotation.NonNull com.google.android.gms.common.api.HasApiKey<?> r1, @androidx.annotation.NonNull com.google.android.gms.common.api.HasApiKey<?>... r2) {
            r0 = this;
            com.google.android.gms.tasks.Task r1 = zai(r1, r2)
            com.google.android.gms.common.zaa r2 = com.google.android.gms.common.zaa.zaa
            com.google.android.gms.tasks.Task r1 = r1.onSuccessTask(r2)
            return r1
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public int getClientVersion(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            int r1 = super.getClientVersion(r1)
            return r1
    }

    @androidx.annotation.Nullable
    public android.app.Dialog getErrorDialog(@androidx.annotation.NonNull android.app.Activity r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            android.app.Dialog r2 = r1.getErrorDialog(r2, r3, r4, r0)
            return r2
    }

    @androidx.annotation.Nullable
    public android.app.Dialog getErrorDialog(@androidx.annotation.NonNull android.app.Activity r2, int r3, int r4, @androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r5) {
            r1 = this;
            java.lang.String r0 = "d"
            android.content.Intent r0 = r1.getErrorResolutionIntent(r2, r3, r0)
            com.google.android.gms.common.internal.zag r4 = com.google.android.gms.common.internal.zag.zab(r2, r0, r4)
            android.app.Dialog r2 = r1.zaa(r2, r3, r4, r5)
            return r2
    }

    @androidx.annotation.Nullable
    public android.app.Dialog getErrorDialog(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            android.app.Dialog r2 = r1.getErrorDialog(r2, r3, r4, r0)
            return r2
    }

    @androidx.annotation.Nullable
    public android.app.Dialog getErrorDialog(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3, int r4, int r5, @androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r6) {
            r2 = this;
            android.content.Context r0 = r3.requireContext()
            java.lang.String r1 = "d"
            android.content.Intent r0 = r2.getErrorResolutionIntent(r0, r4, r1)
            android.content.Context r1 = r3.requireContext()
            com.google.android.gms.common.internal.zag r3 = com.google.android.gms.common.internal.zag.zac(r3, r0, r5)
            android.app.Dialog r3 = r2.zaa(r1, r4, r3, r6)
            return r3
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Intent getErrorResolutionIntent(@androidx.annotation.Nullable android.content.Context r1, int r2, @androidx.annotation.Nullable java.lang.String r3) {
            r0 = this;
            android.content.Intent r1 = super.getErrorResolutionIntent(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @androidx.annotation.Nullable
    public android.app.PendingIntent getErrorResolutionPendingIntent(@androidx.annotation.NonNull android.content.Context r1, int r2, int r3) {
            r0 = this;
            android.app.PendingIntent r1 = super.getErrorResolutionPendingIntent(r1, r2, r3)
            return r1
    }

    @androidx.annotation.Nullable
    public android.app.PendingIntent getErrorResolutionPendingIntent(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r3) {
            r1 = this;
            boolean r0 = r3.hasResolution()
            if (r0 == 0) goto Lb
            android.app.PendingIntent r2 = r3.getResolution()
            return r2
        Lb:
            int r3 = r3.getErrorCode()
            r0 = 0
            android.app.PendingIntent r2 = r1.getErrorResolutionPendingIntent(r2, r3, r0)
            return r2
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @androidx.annotation.NonNull
    public final java.lang.String getErrorString(int r1) {
            r0 = this;
            java.lang.String r1 = super.getErrorString(r1)
            return r1
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @com.google.android.gms.common.internal.HideFirstParty
    public int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            int r1 = super.isGooglePlayServicesAvailable(r1)
            return r1
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r1, int r2) {
            r0 = this;
            int r1 = super.isGooglePlayServicesAvailable(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int r1) {
            r0 = this;
            boolean r1 = super.isUserResolvableError(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    public com.google.android.gms.tasks.Task<java.lang.Void> makeGooglePlayServicesAvailable(@androidx.annotation.NonNull android.app.Activity r4) {
            r3 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE
            java.lang.String r1 = "makeGooglePlayServicesAvailable must be called from the main thread"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r1)
            int r0 = r3.isGooglePlayServicesAvailable(r4, r0)
            r1 = 0
            if (r0 != 0) goto L13
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.forResult(r1)
            goto L24
        L13:
            com.google.android.gms.common.api.internal.zacc r4 = com.google.android.gms.common.api.internal.zacc.zaa(r4)
            com.google.android.gms.common.ConnectionResult r2 = new com.google.android.gms.common.ConnectionResult
            r2.<init>(r0, r1)
            r0 = 0
            r4.zah(r2, r0)
            com.google.android.gms.tasks.Task r4 = r4.zad()
        L24:
            return r4
    }

    @android.annotation.TargetApi(26)
    public void setDefaultNotificationChannelId(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r0 == 0) goto L19
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            android.app.NotificationChannel r2 = r2.getNotificationChannel(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
        L19:
            java.lang.Object r2 = com.google.android.gms.common.GoogleApiAvailability.zaa
            monitor-enter(r2)
            r1.zac = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    public boolean showErrorDialogFragment(@androidx.annotation.NonNull android.app.Activity r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.showErrorDialogFragment(r2, r3, r4, r0)
            return r2
    }

    public boolean showErrorDialogFragment(@androidx.annotation.NonNull android.app.Activity r1, int r2, int r3, @androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r4) {
            r0 = this;
            android.app.Dialog r2 = r0.getErrorDialog(r1, r2, r3, r4)
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r3 = "GooglePlayServicesErrorDialog"
            r0.zad(r1, r2, r3, r4)
            r1 = 1
            return r1
    }

    public void showErrorNotification(@androidx.annotation.NonNull android.content.Context r3, int r4) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "n"
            android.app.PendingIntent r0 = r2.getErrorResolutionPendingIntent(r3, r4, r0, r1)
            r2.zae(r3, r4, r0)
            return
    }

    public void showErrorNotification(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r3) {
            r1 = this;
            android.app.PendingIntent r0 = r1.getErrorResolutionPendingIntent(r2, r3)
            int r3 = r3.getErrorCode()
            r1.zae(r2, r3, r0)
            return
    }

    @androidx.annotation.Nullable
    public final android.app.Dialog zaa(@androidx.annotation.NonNull android.content.Context r6, int r7, com.google.android.gms.common.internal.zag r8, @androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r9) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r3 = 16843529(0x1010309, float:2.3695736E-38)
            r4 = 1
            r2.resolveAttribute(r3, r1, r4)
            android.content.res.Resources r2 = r6.getResources()
            int r1 = r1.resourceId
            java.lang.String r1 = r2.getResourceEntryName(r1)
            java.lang.String r2 = "Theme.Dialog.Alert"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2c
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r1 = 5
            r0.<init>(r6, r1)
        L2c:
            if (r0 != 0) goto L33
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r6)
        L33:
            java.lang.String r1 = com.google.android.gms.common.internal.zac.zad(r6, r7)
            r0.setMessage(r1)
            if (r9 == 0) goto L3f
            r0.setOnCancelListener(r9)
        L3f:
            java.lang.String r9 = com.google.android.gms.common.internal.zac.zac(r6, r7)
            if (r9 == 0) goto L48
            r0.setPositiveButton(r9, r8)
        L48:
            java.lang.String r6 = com.google.android.gms.common.internal.zac.zag(r6, r7)
            if (r6 == 0) goto L51
            r0.setTitle(r6)
        L51:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r8 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r8] = r7
            java.lang.String r7 = "Creating dialog for Google Play services availability issue. ConnectionResult=%s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            java.lang.String r8 = "GoogleApiAvailability"
            android.util.Log.w(r8, r6, r7)
            android.app.AlertDialog r6 = r0.create()
            return r6
    }

    @androidx.annotation.NonNull
    public final android.app.Dialog zab(@androidx.annotation.NonNull android.app.Activity r4, @androidx.annotation.NonNull android.content.DialogInterface.OnCancelListener r5) {
            r3 = this;
            android.widget.ProgressBar r0 = new android.widget.ProgressBar
            r1 = 0
            r2 = 16842874(0x101007a, float:2.36939E-38)
            r0.<init>(r4, r1, r2)
            r2 = 1
            r0.setIndeterminate(r2)
            r2 = 0
            r0.setVisibility(r2)
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r4)
            r2.setView(r0)
            r0 = 18
            java.lang.String r0 = com.google.android.gms.common.internal.zac.zad(r4, r0)
            r2.setMessage(r0)
            java.lang.String r0 = ""
            r2.setPositiveButton(r0, r1)
            android.app.AlertDialog r0 = r2.create()
            java.lang.String r1 = "GooglePlayServicesUpdatingDialog"
            r3.zad(r4, r0, r1, r5)
            return r0
    }

    @androidx.annotation.Nullable
    public final com.google.android.gms.common.api.internal.zabx zac(android.content.Context r3, com.google.android.gms.common.api.internal.zabw r4) {
            r2 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.PACKAGE_ADDED"
            r0.<init>(r1)
            java.lang.String r1 = "package"
            r0.addDataScheme(r1)
            com.google.android.gms.common.api.internal.zabx r1 = new com.google.android.gms.common.api.internal.zabx
            r1.<init>(r4)
            r3.registerReceiver(r1, r0)
            r1.zaa(r3)
            java.lang.String r0 = "com.google.android.gms"
            boolean r3 = r2.isUninstalledAppPossiblyUpdating(r3, r0)
            if (r3 != 0) goto L27
            r4.zaa()
            r1.zab()
            r3 = 0
            return r3
        L27:
            return r1
    }

    public final void zad(android.app.Activity r2, android.app.Dialog r3, java.lang.String r4, @androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r5) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentActivity     // Catch: java.lang.NoClassDefFoundError -> L12
            if (r0 == 0) goto L12
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            androidx.fragment.app.FragmentManager r2 = r2.getSupportFragmentManager()
            com.google.android.gms.common.SupportErrorDialogFragment r3 = com.google.android.gms.common.SupportErrorDialogFragment.newInstance(r3, r5)
            r3.show(r2, r4)
            return
        L12:
            android.app.FragmentManager r2 = r2.getFragmentManager()
            com.google.android.gms.common.ErrorDialogFragment r3 = com.google.android.gms.common.ErrorDialogFragment.newInstance(r3, r5)
            r3.show(r2, r4)
            return
    }

    @android.annotation.TargetApi(20)
    public final void zae(android.content.Context r10, int r11, @androidx.annotation.Nullable android.app.PendingIntent r12) {
            r9 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r4 = 0
            r1[r2] = r4
            java.lang.String r4 = "GMS core API Availability. ConnectionResult=%s, tag=%s"
            java.lang.String r1 = java.lang.String.format(r4, r1)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            java.lang.String r5 = "GoogleApiAvailability"
            android.util.Log.w(r5, r1, r4)
            r1 = 18
            if (r11 != r1) goto L2e
            com.google.android.gms.common.zac r11 = new com.google.android.gms.common.zac
            r11.<init>(r9, r10)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r11.sendEmptyMessageDelayed(r2, r0)
            return
        L2e:
            if (r12 != 0) goto L3b
            r10 = 6
            if (r11 != r10) goto L3a
            java.lang.String r10 = "GoogleApiAvailability"
            java.lang.String r11 = "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead."
            android.util.Log.w(r10, r11)
        L3a:
            return
        L3b:
            java.lang.String r1 = com.google.android.gms.common.internal.zac.zaf(r10, r11)
            java.lang.String r4 = com.google.android.gms.common.internal.zac.zae(r10, r11)
            android.content.res.Resources r5 = r10.getResources()
            java.lang.String r6 = "notification"
            java.lang.Object r6 = r10.getSystemService(r6)
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            android.app.NotificationManager r6 = (android.app.NotificationManager) r6
            androidx.core.app.NotificationCompat$Builder r7 = new androidx.core.app.NotificationCompat$Builder
            r7.<init>(r10)
            androidx.core.app.NotificationCompat$Builder r7 = r7.setLocalOnly(r2)
            androidx.core.app.NotificationCompat$Builder r7 = r7.setAutoCancel(r2)
            androidx.core.app.NotificationCompat$Builder r1 = r7.setContentTitle(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r7 = new androidx.core.app.NotificationCompat$BigTextStyle
            r7.<init>()
            androidx.core.app.NotificationCompat$BigTextStyle r7 = r7.bigText(r4)
            androidx.core.app.NotificationCompat$Builder r1 = r1.setStyle(r7)
            boolean r7 = com.google.android.gms.common.util.DeviceProperties.isWearable(r10)
            if (r7 == 0) goto La1
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKatWatch()
            com.google.android.gms.common.internal.Preconditions.checkState(r4)
            android.content.pm.ApplicationInfo r4 = r10.getApplicationInfo()
            int r4 = r4.icon
            androidx.core.app.NotificationCompat$Builder r4 = r1.setSmallIcon(r4)
            r4.setPriority(r0)
            boolean r4 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r10)
            if (r4 == 0) goto L9d
            int r4 = com.google.android.gms.base.R.drawable.common_full_open_on_phone
            int r7 = com.google.android.gms.base.R.string.common_open_on_phone
            java.lang.String r5 = r5.getString(r7)
            r1.addAction(r4, r5, r12)
            goto Lc1
        L9d:
            r1.setContentIntent(r12)
            goto Lc1
        La1:
            r7 = 17301642(0x108008a, float:2.4979642E-38)
            androidx.core.app.NotificationCompat$Builder r7 = r1.setSmallIcon(r7)
            int r8 = com.google.android.gms.base.R.string.common_google_play_services_notification_ticker
            java.lang.String r5 = r5.getString(r8)
            androidx.core.app.NotificationCompat$Builder r5 = r7.setTicker(r5)
            long r7 = java.lang.System.currentTimeMillis()
            androidx.core.app.NotificationCompat$Builder r5 = r5.setWhen(r7)
            androidx.core.app.NotificationCompat$Builder r12 = r5.setContentIntent(r12)
            r12.setContentText(r4)
        Lc1:
            boolean r12 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r12 != 0) goto Lc8
            goto L100
        Lc8:
            boolean r12 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            com.google.android.gms.common.internal.Preconditions.checkState(r12)
            java.lang.Object r12 = com.google.android.gms.common.GoogleApiAvailability.zaa
            monitor-enter(r12)
            java.lang.String r4 = r9.zac     // Catch: java.lang.Throwable -> L11a
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L11a
            if (r4 != 0) goto Lfd
            java.lang.String r4 = "com.google.android.gms.availability"
            android.app.NotificationChannel r12 = r6.getNotificationChannel(r4)
            java.lang.String r10 = com.google.android.gms.common.internal.zac.zab(r10)
            if (r12 != 0) goto Led
            android.app.NotificationChannel r12 = new android.app.NotificationChannel
            r5 = 4
            r12.<init>(r4, r10, r5)
            r6.createNotificationChannel(r12)
            goto Lfd
        Led:
            java.lang.CharSequence r5 = r12.getName()
            boolean r5 = r10.contentEquals(r5)
            if (r5 != 0) goto Lfd
            r12.setName(r10)
            r6.createNotificationChannel(r12)
        Lfd:
            r1.setChannelId(r4)
        L100:
            android.app.Notification r10 = r1.build()
            if (r11 == r2) goto L10f
            if (r11 == r0) goto L10f
            r12 = 3
            if (r11 == r12) goto L10f
            r11 = 39789(0x9b6d, float:5.5756E-41)
            goto L116
        L10f:
            java.util.concurrent.atomic.AtomicBoolean r11 = com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification
            r11.set(r3)
            r11 = 10436(0x28c4, float:1.4624E-41)
        L116:
            r6.notify(r11, r10)
            return
        L11a:
            r10 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L11a
            throw r10
    }

    public final boolean zag(@androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.LifecycleFragment r3, int r4, int r5, @androidx.annotation.Nullable android.content.DialogInterface.OnCancelListener r6) {
            r1 = this;
            java.lang.String r5 = "d"
            android.content.Intent r5 = r1.getErrorResolutionIntent(r2, r4, r5)
            r0 = 2
            com.google.android.gms.common.internal.zag r3 = com.google.android.gms.common.internal.zag.zad(r3, r5, r0)
            android.app.Dialog r3 = r1.zaa(r2, r4, r3, r6)
            if (r3 != 0) goto L13
            r2 = 0
            return r2
        L13:
            java.lang.String r4 = "GooglePlayServicesErrorDialog"
            r1.zad(r2, r3, r4, r6)
            r2 = 1
            return r2
    }

    public final boolean zah(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r6, int r7) {
            r4 = this;
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.app.PendingIntent r0 = r4.getErrorResolutionPendingIntent(r5, r6)
            if (r0 == 0) goto L24
            int r6 = r6.getErrorCode()
            r2 = 1
            android.content.Intent r7 = com.google.android.gms.common.api.GoogleApiActivity.zaa(r5, r0, r7, r2)
            int r0 = com.google.android.gms.internal.base.zal.zaa
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 | r3
            android.app.PendingIntent r7 = com.google.android.gms.internal.base.zal.zaa(r5, r1, r7, r0)
            r4.zae(r5, r6, r7)
            return r2
        L24:
            return r1
    }
}
