package androidx.leanback.system;

/* JADX INFO: loaded from: classes3.dex */
public class Settings {
    private static final java.lang.String ACTION_PARTNER_CUSTOMIZATION = "android.support.v17.leanback.action.PARTNER_CUSTOMIZATION";
    private static final boolean DEBUG = false;
    public static final java.lang.String OUTLINE_CLIPPING_DISABLED = "OUTLINE_CLIPPING_DISABLED";
    public static final java.lang.String PREFER_STATIC_SHADOWS = "PREFER_STATIC_SHADOWS";
    private static final java.lang.String TAG = "Settings";
    private static androidx.leanback.system.Settings sInstance;
    private boolean mOutlineClippingDisabled;
    private boolean mPreferStaticShadows;

    /* JADX INFO: loaded from: classes.dex */
    public static class Customizations {
        public java.lang.String mPackageName;
        public android.content.res.Resources mResources;

        public Customizations(android.content.res.Resources r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.mResources = r1
                r0.mPackageName = r2
                return
        }

        public boolean getBoolean(java.lang.String r4, boolean r5) {
                r3 = this;
                android.content.res.Resources r0 = r3.mResources
                java.lang.String r1 = r3.mPackageName
                java.lang.String r2 = "bool"
                int r4 = r0.getIdentifier(r4, r2, r1)
                if (r4 <= 0) goto L12
                android.content.res.Resources r5 = r3.mResources
                boolean r5 = r5.getBoolean(r4)
            L12:
                return r5
        }
    }

    private Settings(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            androidx.leanback.system.Settings$Customizations r1 = r0.getCustomizations(r1)
            r0.generateSetting(r1)
            return
    }

    private void generateSetting(androidx.leanback.system.Settings.Customizations r3) {
            r2 = this;
            boolean r0 = androidx.leanback.widget.ShadowOverlayContainer.supportsDynamicShadow()
            r1 = 0
            if (r0 == 0) goto L14
            r2.mPreferStaticShadows = r1
            if (r3 == 0) goto L17
            java.lang.String r0 = "leanback_prefer_static_shadows"
            boolean r0 = r3.getBoolean(r0, r1)
            r2.mPreferStaticShadows = r0
            goto L17
        L14:
            r0 = 1
            r2.mPreferStaticShadows = r0
        L17:
            r2.mOutlineClippingDisabled = r1
            if (r3 == 0) goto L23
            java.lang.String r0 = "leanback_outline_clipping_disabled"
            boolean r3 = r3.getBoolean(r0, r1)
            r2.mOutlineClippingDisabled = r3
        L23:
            return
    }

    private androidx.leanback.system.Settings.Customizations getCustomizations(android.content.Context r6) {
            r5 = this;
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.support.v17.leanback.action.PARTNER_CUSTOMIZATION"
            r0.<init>(r1)
            r1 = 0
            java.util.List r0 = r6.queryBroadcastReceivers(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
            r3 = r2
        L17:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r3 = r0.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r4 = r3.activityInfo
            java.lang.String r4 = r4.packageName
            if (r4 == 0) goto L35
            boolean r3 = isSystemApp(r3)
            if (r3 == 0) goto L35
            android.content.res.Resources r2 = r6.getResourcesForApplication(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
            goto L35
        L34:
        L35:
            if (r2 == 0) goto L39
            r3 = r4
            goto L3b
        L39:
            r3 = r4
            goto L17
        L3b:
            if (r2 != 0) goto L3e
            goto L43
        L3e:
            androidx.leanback.system.Settings$Customizations r1 = new androidx.leanback.system.Settings$Customizations
            r1.<init>(r2, r3)
        L43:
            return r1
    }

    public static androidx.leanback.system.Settings getInstance(android.content.Context r1) {
            androidx.leanback.system.Settings r0 = androidx.leanback.system.Settings.sInstance
            if (r0 != 0) goto Lb
            androidx.leanback.system.Settings r0 = new androidx.leanback.system.Settings
            r0.<init>(r1)
            androidx.leanback.system.Settings.sInstance = r0
        Lb:
            androidx.leanback.system.Settings r1 = androidx.leanback.system.Settings.sInstance
            return r1
    }

    private static boolean isSystemApp(android.content.pm.ResolveInfo r1) {
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            r0 = 1
            if (r1 == 0) goto Ld
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo
            int r1 = r1.flags
            r1 = r1 & r0
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public boolean getBoolean(java.lang.String r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.getOrSetBoolean(r2, r0, r0)
            return r2
    }

    public final boolean getOrSetBoolean(java.lang.String r2, boolean r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "PREFER_STATIC_SHADOWS"
            int r0 = r2.compareTo(r0)
            if (r0 != 0) goto L10
            if (r3 == 0) goto Ld
            r1.mPreferStaticShadows = r4
            goto Lf
        Ld:
            boolean r4 = r1.mPreferStaticShadows
        Lf:
            return r4
        L10:
            java.lang.String r0 = "OUTLINE_CLIPPING_DISABLED"
            int r2 = r2.compareTo(r0)
            if (r2 != 0) goto L20
            if (r3 == 0) goto L1d
            r1.mOutlineClippingDisabled = r4
            goto L1f
        L1d:
            boolean r4 = r1.mOutlineClippingDisabled
        L1f:
            return r4
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid key"
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isOutlineClippingDisabled() {
            r1 = this;
            boolean r0 = r1.mOutlineClippingDisabled
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean preferStaticShadows() {
            r1 = this;
            boolean r0 = r1.mPreferStaticShadows
            return r0
    }

    public void setBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.getOrSetBoolean(r2, r0, r3)
            return
    }
}
