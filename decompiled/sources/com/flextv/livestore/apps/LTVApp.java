package com.flextv.livestore.apps;

/* JADX INFO: loaded from: classes2.dex */
public class LTVApp extends androidx.multidex.MultiDexApplication {
    public static float SCREEN_HEIGHT = 1080.0f;
    public static float SCREEN_WIDTH = 1920.0f;
    public static long SEVER_OFFSET;
    public static java.lang.String channelName;
    public static com.flextv.livestore.apps.HomeType homeType;
    public static com.flextv.livestore.apps.LTVApp instance;
    public static java.util.List<com.flextv.livestore.models.CategoryModel> live_categories_filter;
    public static java.util.List<com.flextv.livestore.models.CategoryModel> series_categories_filter;
    public static java.lang.String version_name;
    public static java.util.List<com.flextv.livestore.models.CategoryModel> vod_categories_filter;
    private java.util.List<iptv.m3u.parser.M3UItem> m3UChannelsItems;
    private java.util.List<iptv.m3u.parser.M3UItem> m3USeriesItems;
    private java.util.List<iptv.m3u.parser.M3UItem> m3UVideosItems;

    static {
            amimo.dcc.DccApplication.initDcc()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.apps.LTVApp.vod_categories_filter = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.apps.LTVApp.live_categories_filter = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.apps.LTVApp.series_categories_filter = r0
            java.lang.String r0 = "1.0"
            com.flextv.livestore.apps.LTVApp.version_name = r0
            com.flextv.livestore.apps.HomeType r0 = com.flextv.livestore.apps.HomeType.live
            com.flextv.livestore.apps.LTVApp.homeType = r0
            return
    }

    public LTVApp() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.m3UChannelsItems = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.m3UVideosItems = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.m3USeriesItems = r0
            return
    }

    public static com.flextv.livestore.apps.LTVApp getInstance() {
            com.flextv.livestore.apps.LTVApp r0 = com.flextv.livestore.apps.LTVApp.instance
            if (r0 != 0) goto Lb
            com.flextv.livestore.apps.LTVApp r0 = new com.flextv.livestore.apps.LTVApp
            r0.<init>()
            com.flextv.livestore.apps.LTVApp.instance = r0
        Lb:
            com.flextv.livestore.apps.LTVApp r0 = com.flextv.livestore.apps.LTVApp.instance
            return r0
    }

    public java.util.List<iptv.m3u.parser.M3UItem> getM3UChannelsItems() {
            r1 = this;
            java.util.List<iptv.m3u.parser.M3UItem> r0 = r1.m3UChannelsItems
            return r0
    }

    public java.util.List<iptv.m3u.parser.M3UItem> getM3USeriesItems() {
            r1 = this;
            java.util.List<iptv.m3u.parser.M3UItem> r0 = r1.m3USeriesItems
            return r0
    }

    public java.util.List<iptv.m3u.parser.M3UItem> getM3UVideosItems() {
            r1 = this;
            java.util.List<iptv.m3u.parser.M3UItem> r0 = r1.m3UVideosItems
            return r0
    }

    public java.lang.String getM3uDate() {
            r1 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r1)
            java.lang.String r0 = r0.getSharedPreferenceLastM3uDate()
            return r0
    }

    public void getNavigationBarHeight(android.app.Activity r3) {
            r2 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.WindowManager r3 = r3.getWindowManager()
            android.view.Display r3 = r3.getDefaultDisplay()
            r3.getRealMetrics(r0)
            int r3 = r0.heightPixels
            float r3 = (float) r3
            com.flextv.livestore.apps.LTVApp.SCREEN_HEIGHT = r3
            int r0 = r0.widthPixels
            float r0 = (float) r0
            com.flextv.livestore.apps.LTVApp.SCREEN_WIDTH = r0
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 >= 0) goto L22
            com.flextv.livestore.apps.LTVApp.SCREEN_WIDTH = r3
            com.flextv.livestore.apps.LTVApp.SCREEN_HEIGHT = r0
        L22:
            return
    }

    public void getlnstance() {
            r6 = this;
            com.andyhax.Setting.Prefs$Builder r0 = new com.andyhax.Setting.Prefs$Builder
            r0.<init>()
            com.andyhax.Setting.Prefs$Builder r0 = r0.setContext(r6)
            r1 = 0
            com.andyhax.Setting.Prefs$Builder r0 = r0.setMode(r1)
            java.lang.String r2 = "vod_info"
            com.andyhax.Setting.Prefs$Builder r0 = r0.setPrefsName(r2)
            r2 = 1
            com.andyhax.Setting.Prefs$Builder r0 = r0.setUseDefaultSharedPreference(r2)
            r0.build()
            com.andyhax.Task.DownloadImageTask r0 = new com.andyhax.Task.DownloadImageTask
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = com.android.volley.Async2Cache.a
            java.lang.String r5 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r5)
            r4.append(r5)
            java.lang.String r5 = "24db3ca96568a04898ad5c708d275a88"
            java.lang.String r5 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3[r1] = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = com.android.volley.Async2Cache.a
            java.lang.String r5 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r5)
            r4.append(r5)
            java.lang.String r5 = "a9ee01e1f5533435845e3c3f2104e852"
            java.lang.String r5 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3[r2] = r4
            r0.<init>(r6, r3)
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r0.execute(r1)
            return
    }

    public void loadVersion() {
            r3 = this;
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            java.lang.String r1 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            goto L13
        Le:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
        L13:
            java.lang.String r0 = r0.versionName
            com.flextv.livestore.apps.LTVApp.version_name = r0
            return
    }

    @Override // android.app.Application
    public void onCreate() {
            r0 = this;
            super.onCreate()
            com.flextv.livestore.apps.LTVApp.instance = r0
            com.android.volley.AsyncNetwork.setNonBlockingExecutors()
            return
    }

    public void setM3UChannelsItems(java.util.List<iptv.m3u.parser.M3UItem> r1) {
            r0 = this;
            r0.m3UChannelsItems = r1
            return
    }

    public void setM3USeriesItems(java.util.List<iptv.m3u.parser.M3UItem> r1) {
            r0 = this;
            r0.m3USeriesItems = r1
            return
    }

    public void setM3UVideosItems(java.util.List<iptv.m3u.parser.M3UItem> r1) {
            r0 = this;
            r0.m3UVideosItems = r1
            return
    }

    public void setM3uDate(java.lang.String r2) {
            r1 = this;
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r1)
            r0.setSharedPreferenceLastM3uDate(r2)
            return
    }

    public void versionCheck() {
            r1 = this;
            android.os.StrictMode$ThreadPolicy$Builder r0 = new android.os.StrictMode$ThreadPolicy$Builder
            r0.<init>()
            r1.getlnstance()
            android.os.StrictMode$ThreadPolicy$Builder r0 = r0.permitAll()
            android.os.StrictMode$ThreadPolicy r0 = r0.build()
            android.os.StrictMode.setThreadPolicy(r0)
            return
    }
}
