package com.flextv.livestore.utils;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    private static final java.lang.String AMAZON_TV_YOUTUBE = "com.amazon.firetv.youtube";
    private static final java.lang.String ANDROID_TV_BOX_YOUTUBE = "com.google.android.youtube";
    private static final java.lang.String ANDROID_TV_YOUTUBE = "com.google.android.youtube.tv";
    private static final com.flextv.livestore.utils.Utils.VLCPackageInfo[] PACKAGES = null;
    public static final com.flextv.livestore.utils.Utils.MXPackageInfo[] PACKAGES1 = null;
    public static final com.flextv.livestore.utils.Utils.YoutubePackageInfo[] PACKAGE_INFOS = null;
    private static final java.lang.String PACKAGE_NAME = "org.videolan.vlc";
    private static final java.lang.String PACKAGE_NAME_AD = "com.mxtech.videoplayer.ad";
    private static final java.lang.String PACKAGE_NAME_PRO = "com.mxtech.videoplayer.pro";
    private static final java.lang.String PLAYBACK_ACTIVITY = "org.videolan.vlc.gui.video.VideoPlayerActivity";
    private static final java.lang.String PLAYBACK_ACTIVITY_AD = "com.mxtech.videoplayer.ad.ActivityScreen";
    private static final java.lang.String PLAYBACK_ACTIVITY_PRO = "com.mxtech.videoplayer.ActivityScreen";
    private static final java.lang.String SMART_YOUTUBE_TV = "com.liskovsoft.videomanager";
    private static java.text.SimpleDateFormat getTimeZoneFormat = null;
    public static java.lang.String play_list = "log.txt";

    /* JADX INFO: loaded from: classes2.dex */
    public static class MXPackageInfo {
        public final java.lang.String activityName;
        public final java.lang.String packageName;

        public MXPackageInfo(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.packageName = r1
                r0.activityName = r2
                return
        }
    }

    public static class VLCPackageInfo {
        public final java.lang.String packageName;

        public VLCPackageInfo() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "org.videolan.vlc"
                r1.packageName = r0
                return
        }
    }

    public static class YoutubePackageInfo {
        public final java.lang.String packageName;

        public YoutubePackageInfo(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.packageName = r1
                return
        }
    }

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "yyyyMMddHHmmss Z"
            r0.<init>(r2, r1)
            com.flextv.livestore.utils.Utils.getTimeZoneFormat = r0
            r0 = 1
            com.flextv.livestore.utils.Utils$VLCPackageInfo[] r1 = new com.flextv.livestore.utils.Utils.VLCPackageInfo[r0]
            com.flextv.livestore.utils.Utils$VLCPackageInfo r2 = new com.flextv.livestore.utils.Utils$VLCPackageInfo
            r2.<init>()
            r3 = 0
            r1[r3] = r2
            com.flextv.livestore.utils.Utils.PACKAGES = r1
            r1 = 2
            com.flextv.livestore.utils.Utils$MXPackageInfo[] r2 = new com.flextv.livestore.utils.Utils.MXPackageInfo[r1]
            com.flextv.livestore.utils.Utils$MXPackageInfo r4 = new com.flextv.livestore.utils.Utils$MXPackageInfo
            java.lang.String r5 = "com.mxtech.videoplayer.pro"
            java.lang.String r6 = "com.mxtech.videoplayer.ActivityScreen"
            r4.<init>(r5, r6)
            r2[r3] = r4
            com.flextv.livestore.utils.Utils$MXPackageInfo r4 = new com.flextv.livestore.utils.Utils$MXPackageInfo
            java.lang.String r5 = "com.mxtech.videoplayer.ad"
            java.lang.String r6 = "com.mxtech.videoplayer.ad.ActivityScreen"
            r4.<init>(r5, r6)
            r2[r0] = r4
            com.flextv.livestore.utils.Utils.PACKAGES1 = r2
            r2 = 4
            com.flextv.livestore.utils.Utils$YoutubePackageInfo[] r2 = new com.flextv.livestore.utils.Utils.YoutubePackageInfo[r2]
            com.flextv.livestore.utils.Utils$YoutubePackageInfo r4 = new com.flextv.livestore.utils.Utils$YoutubePackageInfo
            java.lang.String r5 = "com.google.android.youtube.tv"
            r4.<init>(r5)
            r2[r3] = r4
            com.flextv.livestore.utils.Utils$YoutubePackageInfo r3 = new com.flextv.livestore.utils.Utils$YoutubePackageInfo
            java.lang.String r4 = "com.google.android.youtube"
            r3.<init>(r4)
            r2[r0] = r3
            com.flextv.livestore.utils.Utils$YoutubePackageInfo r0 = new com.flextv.livestore.utils.Utils$YoutubePackageInfo
            java.lang.String r3 = "com.amazon.firetv.youtube"
            r0.<init>(r3)
            r2[r1] = r0
            com.flextv.livestore.utils.Utils$YoutubePackageInfo r0 = new com.flextv.livestore.utils.Utils$YoutubePackageInfo
            java.lang.String r1 = "com.liskovsoft.videomanager"
            r0.<init>(r1)
            r1 = 3
            r2[r1] = r0
            com.flextv.livestore.utils.Utils.PACKAGE_INFOS = r2
            return
    }

    public Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void FullScreenCall(android.app.Activity r3) {
            android.view.Window r0 = r3.getWindow()
            r1 = 1024(0x400, float:1.435E-42)
            r0.setFlags(r1, r1)
            android.view.Window r0 = r3.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.addFlags(r1)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 4098(0x1002, float:5.743E-42)
            r0.setSystemUiVisibility(r1)
            android.os.StrictMode$ThreadPolicy$Builder r0 = new android.os.StrictMode$ThreadPolicy$Builder
            r0.<init>()
            android.os.StrictMode$ThreadPolicy$Builder r0 = r0.permitAll()
            android.os.StrictMode$ThreadPolicy r0 = r0.build()
            android.os.StrictMode.setThreadPolicy(r0)
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L62
            java.lang.String r0 = "rtl"
            java.lang.String r1 = "ltr"
            android.util.Log.e(r0, r1)
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r1 = java.util.Locale.getDefault()
            r0.setLocale(r1)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "en"
            r1.<init>(r2)
            r0.setLayoutDirection(r1)
            r3.createConfigurationContext(r0)
        L62:
            return
    }

    public static boolean IsAmazonDevice() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "amazon"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFT"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            return r0
    }

    public static java.lang.String Offset(long r1, android.content.Context r3) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r1)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = com.flextv.livestore.helper.GetSharedInfo.getCurrentTimeFormat(r3)
            r1.<init>(r2)
            java.util.Date r2 = r0.getTime()
            java.lang.String r1 = r1.format(r2)
            return r1
    }

    public static java.lang.String ReadFile() {
            java.lang.String r0 = "com.flextv.livestore.utils.Utils"
            java.lang.String r1 = ""
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            com.flextv.livestore.apps.LTVApp r3 = com.flextv.livestore.apps.LTVApp.getInstance()     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            r4 = 0
            java.io.File r3 = r3.getExternalFilesDir(r4)     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            java.lang.String r4 = com.flextv.livestore.utils.Utils.play_list     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            r2.<init>(r3, r4)     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            r3.<init>(r2)     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            r2.<init>(r3)     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            r4.<init>(r2)     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            r2.<init>()     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
        L28:
            java.lang.String r1 = r4.readLine()     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            if (r1 == 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            r5.<init>()     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            r5.append(r1)     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            java.lang.String r6 = "line.separator"
            java.lang.String r6 = java.lang.System.getProperty(r6)     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            r5.append(r6)     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            r2.append(r5)     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            goto L28
        L47:
            r3.close()     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            java.lang.String r1 = r2.toString()     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            r4.close()     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L5b
            goto L63
        L52:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            android.util.Log.e(r0, r2)
            goto L63
        L5b:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            android.util.Log.e(r0, r2)
        L63:
            return r1
    }

    private static boolean canHandleCameraIntent(android.content.Context r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.media.action.IMAGE_CAPTURE"
            r0.<init>(r1)
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            r2 = 0
            java.util.List r0 = r1.queryIntentActivities(r0, r2)
            int r0 = r0.size()
            if (r0 <= 0) goto L29
            boolean r0 = isUsbAvailable(r3)
            if (r0 == 0) goto L28
            boolean r0 = isEthernetAvailable(r3)
            if (r0 == 0) goto L28
            boolean r3 = isTouchAvailable(r3)
            if (r3 == 0) goto L29
        L28:
            r2 = 1
        L29:
            return r2
    }

    public static boolean checkIsTelevision(android.content.Context r2) {
            java.lang.String r0 = "uimode"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0
            if (r0 == 0) goto L12
            int r0 = r0.getCurrentModeType()
            r1 = 4
            if (r0 == r1) goto L27
        L12:
            boolean r0 = isHdmiSwitchSet()
            if (r0 != 0) goto L27
            boolean r0 = IsAmazonDevice()
            if (r0 != 0) goto L27
            boolean r2 = canHandleCameraIntent(r2)
            if (r2 != 0) goto L25
            goto L27
        L25:
            r2 = 0
            goto L28
        L27:
            r2 = 1
        L28:
            return r2
    }

    public static java.lang.String decode64String(java.lang.String r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L11
            r1 = 0
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch: java.lang.Exception -> L11
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L11
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = r0.trim()     // Catch: java.lang.Exception -> L11
            return r2
        L11:
            r2 = move-exception
            r2.printStackTrace()
            java.lang.String r2 = ""
            return r2
    }

    public static int dp2px(android.content.Context r1, int r2) {
            float r2 = (float) r2
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = (int) r1
            return r1
    }

    public static java.lang.String formatDateFromString(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.getDefault()
            r0.<init>(r2, r1)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.getDefault()
            r2.<init>(r3, r1)
            java.util.Date r3 = r0.parse(r4)     // Catch: java.text.ParseException -> L1b
            java.lang.String r2 = r2.format(r3)     // Catch: java.text.ParseException -> L1b
            goto L1d
        L1b:
            java.lang.String r2 = ""
        L1d:
            return r2
    }

    public static java.lang.String formateDateFromstring(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.getDefault()
            r0.<init>(r2, r1)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.getDefault()
            r2.<init>(r3, r1)
            java.util.Date r3 = r0.parse(r4)     // Catch: java.text.ParseException -> L1b
            java.lang.String r2 = r2.format(r3)     // Catch: java.text.ParseException -> L1b
            goto L1d
        L1b:
            java.lang.String r2 = ""
        L1d:
            return r2
    }

    public static java.lang.String getDate(long r3) {
            java.util.Locale r0 = java.util.Locale.FRANCE
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            r0.setTimeInMillis(r3)
            java.lang.String r3 = "dd/MM/yyyy"
            java.lang.CharSequence r3 = android.text.format.DateFormat.format(r3, r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static java.lang.String getDate(java.lang.Long r6) {
            java.lang.String r0 = "unlimited"
            if (r6 != 0) goto L6
            return r0
        L6:
            long r1 = r6.longValue()     // Catch: java.lang.Exception -> L34
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L2f
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)     // Catch: java.lang.Exception -> L2f
            long r2 = r6.longValue()     // Catch: java.lang.Exception -> L2f
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r1.setTimeInMillis(r2)     // Catch: java.lang.Exception -> L2f
            java.lang.String r6 = "dd/MM/yyyy"
            java.lang.CharSequence r6 = android.text.format.DateFormat.format(r6, r1)     // Catch: java.lang.Exception -> L2f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L2f
            r0 = r6
            goto L38
        L2f:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Exception -> L34
            goto L38
        L34:
            r6 = move-exception
            r6.printStackTrace()
        L38:
            return r0
    }

    public static java.lang.String getDateFromMillisecond(java.lang.String r2, long r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.getDefault()
            r0.<init>(r2, r1)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r3)
            java.lang.String r2 = r0.format(r2)
            return r2
    }

    public static java.util.Date getDateFromString(java.lang.String r3, java.lang.String r4) {
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r2 = java.util.Locale.getDefault()
            r1.<init>(r3, r2)
            java.util.Date r0 = r1.parse(r4)     // Catch: java.text.ParseException -> L12
        L12:
            return r0
    }

    @android.annotation.SuppressLint({"HardwareIds"})
    public static java.lang.String getDeviceId(android.content.Context r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r0 = "android_id"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r0)
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r0)
            java.lang.String r0 = new java.lang.String
            r1 = 0
            byte[] r2 = android.util.Base64.encode(r2, r1)
            r0.<init>(r2)
            java.lang.String r2 = r0.trim()
            return r2
    }

    public static java.lang.String getLanguageNameFromCode(java.lang.String r1) {
            if (r1 == 0) goto L13
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L13
        L9:
            java.util.Locale r0 = new java.util.Locale     // Catch: java.lang.Exception -> L12
            r0.<init>(r1)     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = r0.getDisplayName(r0)     // Catch: java.lang.Exception -> L12
        L12:
            return r1
        L13:
            java.lang.String r1 = "und"
            return r1
    }

    public static com.flextv.livestore.utils.Utils.MXPackageInfo getMXPackageInfo(android.content.Context r7) {
            com.flextv.livestore.utils.Utils$MXPackageInfo[] r0 = com.flextv.livestore.utils.Utils.PACKAGES1
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L1b
            r4 = r0[r3]
            android.content.pm.PackageManager r5 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            java.lang.String r6 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r6, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            boolean r5 = r5.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            if (r5 == 0) goto L18
            return r4
        L18:
            int r3 = r3 + 1
            goto L5
        L1b:
            r7 = 0
            return r7
    }

    public static int getProgressPercentage(long r2, long r4) {
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            int r3 = (int) r2
            long r2 = (long) r3
            long r4 = r4 / r0
            int r5 = (int) r4
            long r4 = (long) r5
            double r2 = (double) r2
            double r4 = (double) r4
            double r2 = r2 / r4
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r4
            int r2 = (int) r2
            return r2
    }

    public static java.lang.String getSamsungMac(java.lang.String r2) {
            r0 = 2
            com.google.common.base.Splitter r0 = com.google.common.base.Splitter.fixedLength(r0)
            java.lang.Iterable r2 = r0.split(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            goto L12
        L27:
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = method(r2)
            return r2
    }

    public static long getTimeInLocalMilli(java.lang.String r2) {
            if (r2 == 0) goto L11
            java.text.SimpleDateFormat r0 = com.flextv.livestore.utils.Utils.getTimeZoneFormat     // Catch: java.lang.Exception -> Ld
            java.util.Date r2 = r0.parse(r2)     // Catch: java.lang.Exception -> Ld
            long r0 = r2.getTime()     // Catch: java.lang.Exception -> Ld
            goto L13
        Ld:
            r2 = move-exception
            r2.printStackTrace()
        L11:
            r0 = -1
        L13:
            return r0
    }

    public static java.lang.String getUserId(java.lang.String r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = ":"
            java.lang.String r2 = r2.replaceAll(r1, r0)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "/"
            java.lang.String r2 = r2.replaceAll(r1, r0)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "\\."
            java.lang.String r2 = r2.replaceAll(r1, r0)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "\\?"
            java.lang.String r2 = r2.replaceAll(r1, r0)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "="
            java.lang.String r2 = r2.replaceAll(r1, r0)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "\\&"
            java.lang.String r2 = r2.replaceAll(r1, r0)     // Catch: java.lang.Exception -> L27
            return r2
        L27:
            java.lang.String r2 = "m3u"
            return r2
    }

    public static com.flextv.livestore.utils.Utils.VLCPackageInfo getVlcPackageInfo(android.content.Context r4) {
            com.flextv.livestore.utils.Utils$VLCPackageInfo[] r0 = com.flextv.livestore.utils.Utils.PACKAGES
            int r1 = r0.length
            r2 = 0
            if (r1 <= 0) goto L18
            r1 = 0
            r0 = r0[r1]
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            java.lang.String r3 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            boolean r4 = r4.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            if (r4 == 0) goto L18
            return r0
        L18:
            return r2
    }

    public static com.flextv.livestore.utils.Utils.YoutubePackageInfo getYoutubePackageInfo(android.content.Context r7) {
            com.flextv.livestore.utils.Utils$YoutubePackageInfo[] r0 = com.flextv.livestore.utils.Utils.PACKAGE_INFOS
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L1b
            r4 = r0[r3]
            android.content.pm.PackageManager r5 = r7.getPackageManager()     // Catch: java.lang.Exception -> L18
            java.lang.String r6 = r4.packageName     // Catch: java.lang.Exception -> L18
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r6, r2)     // Catch: java.lang.Exception -> L18
            boolean r5 = r5.enabled     // Catch: java.lang.Exception -> L18
            if (r5 == 0) goto L18
            return r4
        L18:
            int r3 = r3 + 1
            goto L5
        L1b:
            r7 = 0
            return r7
    }

    private static boolean isEthernetAvailable(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L11
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "android.hardware.ethernet"
            boolean r2 = r2.hasSystemFeature(r0)
            return r2
        L11:
            r2 = 0
            return r2
    }

    public static boolean isHdmiSwitchSet() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/sys/devices/virtual/switch/hdmi/state"
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L14
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/sys/class/switch/hdmi/state"
            r0.<init>(r1)
        L14:
            r1 = 0
            java.util.Scanner r2 = new java.util.Scanner     // Catch: java.lang.Exception -> L24
            r2.<init>(r0)     // Catch: java.lang.Exception -> L24
            int r0 = r2.nextInt()     // Catch: java.lang.Exception -> L24
            r2.close()     // Catch: java.lang.Exception -> L24
            if (r0 <= 0) goto L24
            r1 = 1
        L24:
            return r1
    }

    private static boolean isTouchAvailable(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.touchscreen
            r0 = 1
            if (r1 == r0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private static boolean isUsbAvailable(android.content.Context r1) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r0 = "android.hardware.usb.host"
            boolean r1 = r1.hasSystemFeature(r0)
            return r1
    }

    private static java.lang.String method(java.lang.String r2) {
            if (r2 == 0) goto L22
            int r0 = r2.length()
            if (r0 <= 0) goto L22
            int r0 = r2.length()
            int r0 = r0 + (-1)
            char r0 = r2.charAt(r0)
            r1 = 58
            if (r0 != r1) goto L22
            r0 = 0
            int r1 = r2.length()
            int r1 = r1 + (-1)
            java.lang.String r2 = r2.substring(r0, r1)
            goto L24
        L22:
            java.lang.String r2 = ""
        L24:
            return r2
    }

    public static java.lang.String milliSecondsToTimer(long r6) {
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L9
            java.lang.String r6 = "00:00"
            return r6
        L9:
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r2 = r6 / r0
            int r3 = (int) r2
            long r6 = r6 % r0
            int r0 = (int) r6
            r1 = 60000(0xea60, float:8.4078E-41)
            int r0 = r0 / r1
            r1 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 % r1
            r1 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r1
            int r7 = (int) r6
            java.lang.String r6 = ":"
            java.lang.String r1 = "0"
            r2 = 10
            java.lang.String r4 = ""
            if (r3 <= 0) goto L3e
            if (r3 >= r2) goto L2e
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r6)
            goto L3f
        L2e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            goto L3f
        L3e:
            r3 = r4
        L3f:
            if (r0 >= r2) goto L46
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
            goto L4a
        L46:
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0)
        L4a:
            if (r7 >= r2) goto L51
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r7)
            goto L55
        L51:
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r7)
        L55:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            return r6
    }

    public static void navToLauncherTask(android.content.Context r3) {
            java.lang.String r0 = "activity"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r3 = r3.getAppTasks()
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            android.app.ActivityManager$AppTask r0 = (android.app.ActivityManager.AppTask) r0
            android.app.ActivityManager$RecentTaskInfo r1 = r0.getTaskInfo()
            android.content.Intent r1 = r1.baseIntent
            java.util.Set r1 = r1.getCategories()
            if (r1 == 0) goto L10
            java.lang.String r2 = "android.intent.category.LAUNCHER"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L10
            r0.moveToFront()
        L33:
            return
    }

    public static int progressToTimer(int r4, long r5) {
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r0
            int r6 = (int) r5
            long r5 = (long) r6
            double r0 = (double) r4
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r2
            double r4 = (double) r5
            double r0 = r0 * r4
            int r4 = (int) r0
            int r4 = r4 * 1000
            return r4
    }

    public static void saveToFile(com.flextv.livestore.models.AppInfoModel r5) {
            java.lang.String r0 = "com.flextv.livestore.utils.Utils"
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            com.flextv.livestore.apps.LTVApp r3 = com.flextv.livestore.apps.LTVApp.getInstance()     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            r4 = 0
            java.io.File r3 = r3.getExternalFilesDir(r4)     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            java.lang.String r4 = com.flextv.livestore.utils.Utils.play_list     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            r2.<init>(r3, r4)     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            boolean r3 = r2.exists()     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            if (r3 == 0) goto L20
            r2.delete()     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
        L20:
            r2.createNewFile()     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            r4 = 1
            r3.<init>(r2, r4)     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            r2.<init>()     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            java.lang.String r4 = new java.lang.String     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            java.lang.String r5 = r1.toJson(r5)     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            byte[] r5 = r5.getBytes(r1)     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            r1 = 0
            byte[] r5 = android.util.Base64.encode(r5, r1)     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            r4.<init>(r5)     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            java.lang.String r5 = r4.trim()     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            r2.append(r5)     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            java.lang.String r5 = "line.separator"
            java.lang.String r5 = java.lang.System.getProperty(r5)     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            r2.append(r5)     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            java.lang.String r5 = r2.toString()     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            byte[] r5 = r5.getBytes()     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            r3.write(r5)     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L67
            goto L6f
        L5e:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            android.util.Log.e(r0, r5)
            goto L6f
        L67:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            android.util.Log.e(r0, r5)
        L6f:
            return
    }
}
