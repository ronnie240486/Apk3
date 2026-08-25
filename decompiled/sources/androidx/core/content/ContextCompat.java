package androidx.core.content;

/* JADX INFO: loaded from: classes3.dex */
@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
public class ContextCompat {
    private static final java.lang.String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final java.lang.String TAG = "ContextCompat";
    private static final java.lang.Object sLock = null;
    private static final java.lang.Object sSync = null;
    private static android.util.TypedValue sTempValue;

    @androidx.annotation.RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void startActivities(android.content.Context r0, android.content.Intent[] r1, android.os.Bundle r2) {
                r0.startActivities(r1, r2)
                return
        }

        @androidx.annotation.DoNotInline
        public static void startActivity(android.content.Context r0, android.content.Intent r1, android.os.Bundle r2) {
                r0.startActivity(r1, r2)
                return
        }
    }

    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.io.File[] getExternalCacheDirs(android.content.Context r0) {
                java.io.File[] r0 = r0.getExternalCacheDirs()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.io.File[] getExternalFilesDirs(android.content.Context r0, java.lang.String r1) {
                java.io.File[] r0 = r0.getExternalFilesDirs(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.io.File[] getObbDirs(android.content.Context r0) {
                java.io.File[] r0 = r0.getObbDirs()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.io.File getCodeCacheDir(android.content.Context r0) {
                java.io.File r0 = r0.getCodeCacheDir()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.drawable.Drawable getDrawable(android.content.Context r0, int r1) {
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.io.File getNoBackupFilesDir(android.content.Context r0) {
                java.io.File r0 = r0.getNoBackupFilesDir()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getColor(android.content.Context r0, int r1) {
                int r0 = r0.getColor(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static <T> T getSystemService(android.content.Context r0, java.lang.Class<T> r1) {
                java.lang.Object r0 = r0.getSystemService(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String getSystemServiceName(android.content.Context r0, java.lang.Class<?> r1) {
                java.lang.String r0 = r0.getSystemServiceName(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.content.Context createDeviceProtectedStorageContext(android.content.Context r0) {
                android.content.Context r0 = r0.createDeviceProtectedStorageContext()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.io.File getDataDir(android.content.Context r0) {
                java.io.File r0 = r0.getDataDir()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isDeviceProtectedStorage(android.content.Context r0) {
                boolean r0 = r0.isDeviceProtectedStorage()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.content.Intent registerReceiver(android.content.Context r6, @androidx.annotation.Nullable android.content.BroadcastReceiver r7, android.content.IntentFilter r8, java.lang.String r9, android.os.Handler r10, int r11) {
                r0 = r11 & 4
                if (r0 == 0) goto Lf
                if (r9 != 0) goto Lf
                java.lang.String r9 = androidx.core.content.ContextCompat.obtainAndCheckReceiverPermission(r6)
                android.content.Intent r6 = r6.registerReceiver(r7, r8, r9, r10)
                return r6
            Lf:
                r5 = r11 & 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                android.content.Intent r6 = r0.registerReceiver(r1, r2, r3, r4, r5)
                return r6
        }

        @androidx.annotation.DoNotInline
        public static android.content.ComponentName startForegroundService(android.content.Context r0, android.content.Intent r1) {
                android.content.ComponentName r0 = r0.startForegroundService(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.util.concurrent.Executor getMainExecutor(android.content.Context r0) {
                java.util.concurrent.Executor r0 = r0.getMainExecutor()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String getAttributionTag(android.content.Context r0) {
                java.lang.String r0 = r0.getAttributionTag()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(33)
    public static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.content.Intent registerReceiver(android.content.Context r0, @androidx.annotation.Nullable android.content.BroadcastReceiver r1, android.content.IntentFilter r2, java.lang.String r3, android.os.Handler r4, int r5) {
                android.content.Intent r0 = r0.registerReceiver(r1, r2, r3, r4, r5)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class LegacyServiceMapHolder {
        public static final java.util.HashMap<java.lang.Class<?>, java.lang.String> SERVICES = null;

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES = r0
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 22
                if (r1 < r2) goto L1d
                java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
                java.lang.String r2 = "telephony_subscription_service"
                r0.put(r1, r2)
                java.lang.Class<android.app.usage.UsageStatsManager> r1 = android.app.usage.UsageStatsManager.class
                java.lang.String r2 = "usagestats"
                r0.put(r1, r2)
            L1d:
                java.lang.Class<android.appwidget.AppWidgetManager> r1 = android.appwidget.AppWidgetManager.class
                java.lang.String r2 = "appwidget"
                r0.put(r1, r2)
                java.lang.Class<android.os.BatteryManager> r1 = android.os.BatteryManager.class
                java.lang.String r2 = "batterymanager"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.camera2.CameraManager> r1 = android.hardware.camera2.CameraManager.class
                java.lang.String r2 = "camera"
                r0.put(r1, r2)
                java.lang.Class<android.app.job.JobScheduler> r1 = android.app.job.JobScheduler.class
                java.lang.String r2 = "jobscheduler"
                r0.put(r1, r2)
                java.lang.Class<android.content.pm.LauncherApps> r1 = android.content.pm.LauncherApps.class
                java.lang.String r2 = "launcherapps"
                r0.put(r1, r2)
                java.lang.Class<android.media.projection.MediaProjectionManager> r1 = android.media.projection.MediaProjectionManager.class
                java.lang.String r2 = "media_projection"
                r0.put(r1, r2)
                java.lang.Class<android.media.session.MediaSessionManager> r1 = android.media.session.MediaSessionManager.class
                java.lang.String r2 = "media_session"
                r0.put(r1, r2)
                java.lang.Class<android.content.RestrictionsManager> r1 = android.content.RestrictionsManager.class
                java.lang.String r2 = "restrictions"
                r0.put(r1, r2)
                java.lang.Class<android.telecom.TelecomManager> r1 = android.telecom.TelecomManager.class
                java.lang.String r2 = "telecom"
                r0.put(r1, r2)
                java.lang.Class<android.media.tv.TvInputManager> r1 = android.media.tv.TvInputManager.class
                java.lang.String r2 = "tv_input"
                r0.put(r1, r2)
                java.lang.Class<android.app.AppOpsManager> r1 = android.app.AppOpsManager.class
                java.lang.String r2 = "appops"
                r0.put(r1, r2)
                java.lang.Class<android.view.accessibility.CaptioningManager> r1 = android.view.accessibility.CaptioningManager.class
                java.lang.String r2 = "captioning"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.ConsumerIrManager> r1 = android.hardware.ConsumerIrManager.class
                java.lang.String r2 = "consumer_ir"
                r0.put(r1, r2)
                java.lang.Class<android.print.PrintManager> r1 = android.print.PrintManager.class
                java.lang.String r2 = "print"
                r0.put(r1, r2)
                java.lang.Class<android.bluetooth.BluetoothManager> r1 = android.bluetooth.BluetoothManager.class
                java.lang.String r2 = "bluetooth"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.display.DisplayManager> r1 = android.hardware.display.DisplayManager.class
                java.lang.String r2 = "display"
                r0.put(r1, r2)
                java.lang.Class<android.os.UserManager> r1 = android.os.UserManager.class
                java.lang.String r2 = "user"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.input.InputManager> r1 = android.hardware.input.InputManager.class
                java.lang.String r2 = "input"
                r0.put(r1, r2)
                java.lang.Class<android.media.MediaRouter> r1 = android.media.MediaRouter.class
                java.lang.String r2 = "media_router"
                r0.put(r1, r2)
                java.lang.Class<android.net.nsd.NsdManager> r1 = android.net.nsd.NsdManager.class
                java.lang.String r2 = "servicediscovery"
                r0.put(r1, r2)
                java.lang.Class<android.view.accessibility.AccessibilityManager> r1 = android.view.accessibility.AccessibilityManager.class
                java.lang.String r2 = "accessibility"
                r0.put(r1, r2)
                java.lang.Class<android.accounts.AccountManager> r1 = android.accounts.AccountManager.class
                java.lang.String r2 = "account"
                r0.put(r1, r2)
                java.lang.Class<android.app.ActivityManager> r1 = android.app.ActivityManager.class
                java.lang.String r2 = "activity"
                r0.put(r1, r2)
                java.lang.Class<android.app.AlarmManager> r1 = android.app.AlarmManager.class
                java.lang.String r2 = "alarm"
                r0.put(r1, r2)
                java.lang.Class<android.media.AudioManager> r1 = android.media.AudioManager.class
                java.lang.String r2 = "audio"
                r0.put(r1, r2)
                java.lang.Class<android.content.ClipboardManager> r1 = android.content.ClipboardManager.class
                java.lang.String r2 = "clipboard"
                r0.put(r1, r2)
                java.lang.Class<android.net.ConnectivityManager> r1 = android.net.ConnectivityManager.class
                java.lang.String r2 = "connectivity"
                r0.put(r1, r2)
                java.lang.Class<android.app.admin.DevicePolicyManager> r1 = android.app.admin.DevicePolicyManager.class
                java.lang.String r2 = "device_policy"
                r0.put(r1, r2)
                java.lang.Class<android.app.DownloadManager> r1 = android.app.DownloadManager.class
                java.lang.String r2 = "download"
                r0.put(r1, r2)
                java.lang.Class<android.os.DropBoxManager> r1 = android.os.DropBoxManager.class
                java.lang.String r2 = "dropbox"
                r0.put(r1, r2)
                java.lang.Class<android.view.inputmethod.InputMethodManager> r1 = android.view.inputmethod.InputMethodManager.class
                java.lang.String r2 = "input_method"
                r0.put(r1, r2)
                java.lang.Class<android.app.KeyguardManager> r1 = android.app.KeyguardManager.class
                java.lang.String r2 = "keyguard"
                r0.put(r1, r2)
                java.lang.Class<android.view.LayoutInflater> r1 = android.view.LayoutInflater.class
                java.lang.String r2 = "layout_inflater"
                r0.put(r1, r2)
                java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
                java.lang.String r2 = "location"
                r0.put(r1, r2)
                java.lang.Class<android.nfc.NfcManager> r1 = android.nfc.NfcManager.class
                java.lang.String r2 = "nfc"
                r0.put(r1, r2)
                java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
                java.lang.String r2 = "notification"
                r0.put(r1, r2)
                java.lang.Class<android.os.PowerManager> r1 = android.os.PowerManager.class
                java.lang.String r2 = "power"
                r0.put(r1, r2)
                java.lang.Class<android.app.SearchManager> r1 = android.app.SearchManager.class
                java.lang.String r2 = "search"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.SensorManager> r1 = android.hardware.SensorManager.class
                java.lang.String r2 = "sensor"
                r0.put(r1, r2)
                java.lang.Class<android.os.storage.StorageManager> r1 = android.os.storage.StorageManager.class
                java.lang.String r2 = "storage"
                r0.put(r1, r2)
                java.lang.Class<android.telephony.TelephonyManager> r1 = android.telephony.TelephonyManager.class
                java.lang.String r2 = "phone"
                r0.put(r1, r2)
                java.lang.Class<android.view.textservice.TextServicesManager> r1 = android.view.textservice.TextServicesManager.class
                java.lang.String r2 = "textservices"
                r0.put(r1, r2)
                java.lang.Class<android.app.UiModeManager> r1 = android.app.UiModeManager.class
                java.lang.String r2 = "uimode"
                r0.put(r1, r2)
                java.lang.Class<android.hardware.usb.UsbManager> r1 = android.hardware.usb.UsbManager.class
                java.lang.String r2 = "usb"
                r0.put(r1, r2)
                java.lang.Class<android.os.Vibrator> r1 = android.os.Vibrator.class
                java.lang.String r2 = "vibrator"
                r0.put(r1, r2)
                java.lang.Class<android.app.WallpaperManager> r1 = android.app.WallpaperManager.class
                java.lang.String r2 = "wallpaper"
                r0.put(r1, r2)
                java.lang.Class<android.net.wifi.p2p.WifiP2pManager> r1 = android.net.wifi.p2p.WifiP2pManager.class
                java.lang.String r2 = "wifip2p"
                r0.put(r1, r2)
                java.lang.Class<android.net.wifi.WifiManager> r1 = android.net.wifi.WifiManager.class
                java.lang.String r2 = "wifi"
                r0.put(r1, r2)
                java.lang.Class<android.view.WindowManager> r1 = android.view.WindowManager.class
                java.lang.String r2 = "window"
                r0.put(r1, r2)
                return
        }

        private LegacyServiceMapHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface RegisterReceiverFlags {
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.content.ContextCompat.sLock = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.content.ContextCompat.sSync = r0
            return
    }

    public ContextCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public static int checkSelfPermission(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
            java.lang.String r0 = "permission must be non-null"
            androidx.core.util.ObjectsCompat.requireNonNull(r3, r0)
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 != 0) goto L21
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L21
            androidx.core.app.NotificationManagerCompat r2 = androidx.core.app.NotificationManagerCompat.from(r2)
            boolean r2 = r2.areNotificationsEnabled()
            if (r2 == 0) goto L1f
            r2 = 0
            goto L20
        L1f:
            r2 = -1
        L20:
            return r2
        L21:
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            int r2 = r2.checkPermission(r3, r0, r1)
            return r2
    }

    @androidx.annotation.Nullable
    public static android.content.Context createDeviceProtectedStorageContext(@androidx.annotation.NonNull android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            android.content.Context r2 = androidx.core.content.ContextCompat.Api24Impl.createDeviceProtectedStorageContext(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    private static java.io.File createFilesDir(java.io.File r4) {
            java.lang.Object r0 = androidx.core.content.ContextCompat.sSync
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2b
            boolean r1 = r4.mkdirs()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return r4
        L11:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r4.getPath()     // Catch: java.lang.Throwable -> L2d
            r2.append(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L2d
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return r4
        L2d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r4
    }

    @androidx.annotation.Nullable
    public static java.lang.String getAttributionTag(@androidx.annotation.NonNull android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.String r2 = androidx.core.content.ContextCompat.Api30Impl.getAttributionTag(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    public static java.io.File getCodeCacheDir(@androidx.annotation.NonNull android.content.Context r0) {
            java.io.File r0 = androidx.core.content.ContextCompat.Api21Impl.getCodeCacheDir(r0)
            return r0
    }

    @androidx.annotation.ColorInt
    public static int getColor(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.ColorRes int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r2 = androidx.core.content.ContextCompat.Api23Impl.getColor(r2, r3)
            return r2
        Lb:
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r3)
            return r2
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getColorStateList(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.ColorRes int r2) {
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            android.content.res.ColorStateList r1 = androidx.core.content.res.ResourcesCompat.getColorStateList(r0, r2, r1)
            return r1
    }

    @androidx.annotation.Nullable
    public static java.io.File getDataDir(@androidx.annotation.NonNull android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            java.io.File r2 = androidx.core.content.ContextCompat.Api24Impl.getDataDir(r2)
            return r2
        Lb:
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.dataDir
            if (r2 == 0) goto L19
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable getDrawable(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.DrawableRes int r1) {
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.Api21Impl.getDrawable(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.io.File[] getExternalCacheDirs(@androidx.annotation.NonNull android.content.Context r0) {
            java.io.File[] r0 = androidx.core.content.ContextCompat.Api19Impl.getExternalCacheDirs(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.io.File[] getExternalFilesDirs(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.Nullable java.lang.String r1) {
            java.io.File[] r0 = androidx.core.content.ContextCompat.Api19Impl.getExternalFilesDirs(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.concurrent.Executor getMainExecutor(@androidx.annotation.NonNull android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.util.concurrent.Executor r2 = androidx.core.content.ContextCompat.Api28Impl.getMainExecutor(r2)
            return r2
        Lb:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = r2.getMainLooper()
            r0.<init>(r2)
            java.util.concurrent.Executor r2 = androidx.core.os.ExecutorCompat.create(r0)
            return r2
    }

    @androidx.annotation.Nullable
    public static java.io.File getNoBackupFilesDir(@androidx.annotation.NonNull android.content.Context r0) {
            java.io.File r0 = androidx.core.content.ContextCompat.Api21Impl.getNoBackupFilesDir(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.io.File[] getObbDirs(@androidx.annotation.NonNull android.content.Context r0) {
            java.io.File[] r0 = androidx.core.content.ContextCompat.Api19Impl.getObbDirs(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static <T> T getSystemService(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            java.lang.Object r2 = androidx.core.content.ContextCompat.Api23Impl.getSystemService(r2, r3)
            return r2
        Lb:
            java.lang.String r3 = getSystemServiceName(r2, r3)
            if (r3 == 0) goto L16
            java.lang.Object r2 = r2.getSystemService(r3)
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @androidx.annotation.Nullable
    public static java.lang.String getSystemServiceName(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.Class<?> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            java.lang.String r2 = androidx.core.content.ContextCompat.Api23Impl.getSystemServiceName(r2, r3)
            return r2
        Lb:
            java.util.HashMap<java.lang.Class<?>, java.lang.String> r2 = androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public static boolean isDeviceProtectedStorage(@androidx.annotation.NonNull android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.content.ContextCompat.Api24Impl.isDeviceProtectedStorage(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static java.lang.String obtainAndCheckReceiverPermission(android.content.Context r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getPackageName()
            r0.append(r1)
            java.lang.String r1 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r3 = androidx.core.content.PermissionChecker.checkSelfPermission(r3, r0)
            if (r3 != 0) goto L1c
            return r0
        L1c:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r1 = "Permission "
            java.lang.String r2 = " is required by your application to receive broadcasts, please add it to your manifest"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r2)
            r3.<init>(r0)
            throw r3
    }

    @androidx.annotation.Nullable
    public static android.content.Intent registerReceiver(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.Nullable android.content.BroadcastReceiver r7, @androidx.annotation.NonNull android.content.IntentFilter r8, int r9) {
            r3 = 0
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            android.content.Intent r6 = registerReceiver(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @androidx.annotation.Nullable
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public static android.content.Intent registerReceiver(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.Nullable android.content.BroadcastReceiver r7, @androidx.annotation.NonNull android.content.IntentFilter r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable android.os.Handler r10, int r11) {
            r0 = r11 & 1
            if (r0 == 0) goto L11
            r1 = r11 & 4
            if (r1 != 0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED"
            r6.<init>(r7)
            throw r6
        L11:
            if (r0 == 0) goto L15
            r11 = r11 | 2
        L15:
            r5 = r11
            r11 = r5 & 2
            if (r11 != 0) goto L27
            r0 = r5 & 4
            if (r0 == 0) goto L1f
            goto L27
        L1f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required"
            r6.<init>(r7)
            throw r6
        L27:
            if (r11 == 0) goto L36
            r11 = r5 & 4
            if (r11 != 0) goto L2e
            goto L36
        L2e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED"
            r6.<init>(r7)
            throw r6
        L36:
            boolean r11 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r11 == 0) goto L46
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            android.content.Intent r6 = androidx.core.content.ContextCompat.Api33Impl.registerReceiver(r0, r1, r2, r3, r4, r5)
            return r6
        L46:
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r11 < r0) goto L56
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            android.content.Intent r6 = androidx.core.content.ContextCompat.Api26Impl.registerReceiver(r0, r1, r2, r3, r4, r5)
            return r6
        L56:
            r11 = r5 & 4
            if (r11 == 0) goto L65
            if (r9 != 0) goto L65
            java.lang.String r9 = obtainAndCheckReceiverPermission(r6)
            android.content.Intent r6 = r6.registerReceiver(r7, r8, r9, r10)
            return r6
        L65:
            android.content.Intent r6 = r6.registerReceiver(r7, r8, r9, r10)
            return r6
    }

    public static boolean startActivities(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.content.Intent[] r2) {
            r0 = 0
            boolean r1 = startActivities(r1, r2, r0)
            return r1
    }

    public static boolean startActivities(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.NonNull android.content.Intent[] r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            androidx.core.content.ContextCompat.Api16Impl.startActivities(r0, r1, r2)
            r0 = 1
            return r0
    }

    public static void startActivity(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.NonNull android.content.Intent r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            androidx.core.content.ContextCompat.Api16Impl.startActivity(r0, r1, r2)
            return
    }

    public static void startForegroundService(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.content.Intent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.core.content.ContextCompat.Api26Impl.startForegroundService(r2, r3)
            goto Ld
        La:
            r2.startService(r3)
        Ld:
            return
    }
}
