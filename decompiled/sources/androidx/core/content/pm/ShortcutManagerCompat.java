package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutManagerCompat {
    private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
    private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
    public static final java.lang.String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;
    private static final java.lang.String SHORTCUT_LISTENER_INTENT_FILTER_ACTION = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final java.lang.String SHORTCUT_LISTENER_META_DATA_KEY = "androidx.core.content.pm.shortcut_listener_impl";
    private static volatile java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> sShortcutInfoChangeListeners;
    private static volatile androidx.core.content.pm.ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;


    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(25)
    public static class Api25Impl {
        private Api25Impl() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ShortcutMatchFlags {
    }

    private ShortcutManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean addDynamicShortcuts(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r6) {
            r0 = 1
            java.util.List r1 = removeShortcutsExcludedFromSurface(r6, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 > r3) goto Le
            convertUriIconsToBitmapIcons(r5, r1)
        Le:
            r3 = 25
            if (r2 < r3) goto L3f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r4 = (androidx.core.content.pm.ShortcutInfoCompat) r4
            android.content.pm.ShortcutInfo r4 = r4.toShortcutInfo()
            r2.add(r4)
            goto L1b
        L2f:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r2 = r3.addDynamicShortcuts(r2)
            if (r2 != 0) goto L3f
            r5 = 0
            return r5
        L3f:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r5)
            r2.addShortcuts(r1)
            java.util.List r5 = getShortcutInfoListeners(r5)
            java.util.Iterator r5 = r5.iterator()
        L4e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r5.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onShortcutAdded(r6)
            goto L4e
        L5e:
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public static boolean convertUriIconToBitmapIcon(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.NonNull androidx.core.content.pm.ShortcutInfoCompat r7) {
            androidx.core.graphics.drawable.IconCompat r0 = r7.mIcon
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r0.mType
            r3 = 1
            r4 = 6
            if (r2 == r4) goto L10
            r5 = 4
            if (r2 == r5) goto L10
            return r3
        L10:
            java.io.InputStream r6 = r0.getUriInputStream(r6)
            if (r6 != 0) goto L17
            return r1
        L17:
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)
            if (r6 != 0) goto L1e
            return r1
        L1e:
            if (r2 != r4) goto L25
            androidx.core.graphics.drawable.IconCompat r6 = androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmap(r6)
            goto L29
        L25:
            androidx.core.graphics.drawable.IconCompat r6 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r6)
        L29:
            r7.mIcon = r6
            return r3
    }

    @androidx.annotation.VisibleForTesting
    public static void convertUriIconsToBitmapIcons(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoCompat r1 = (androidx.core.content.pm.ShortcutInfoCompat) r1
            boolean r2 = convertUriIconToBitmapIcon(r3, r1)
            if (r2 != 0) goto L9
            r4.remove(r1)
            goto L9
        L1f:
            return
    }

    @androidx.annotation.NonNull
    public static android.content.Intent createShortcutResultIntent(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.core.content.pm.ShortcutInfoCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            android.content.pm.ShortcutInfo r0 = r3.toShortcutInfo()
            android.content.Intent r2 = r2.createShortcutResultIntent(r0)
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 != 0) goto L1f
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
        L1f:
            r3.addToIntent(r2)
            return r2
    }

    public static void disableShortcuts(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.util.List<java.lang.String> r3, @androidx.annotation.Nullable java.lang.CharSequence r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L11
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.disableShortcuts(r3, r4)
        L11:
            androidx.core.content.pm.ShortcutInfoCompatSaver r4 = getShortcutInfoSaverInstance(r2)
            r4.removeShortcuts(r3)
            java.util.List r2 = getShortcutInfoListeners(r2)
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r4 = (androidx.core.content.pm.ShortcutInfoChangeListener) r4
            r4.onShortcutRemoved(r3)
            goto L20
        L30:
            return
    }

    public static void enableShortcuts(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r5) {
            r0 = 1
            java.util.List r0 = removeShortcutsExcludedFromSurface(r5, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 25
            if (r1 < r2) goto L35
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r5.size()
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()
            androidx.core.content.pm.ShortcutInfoCompat r3 = (androidx.core.content.pm.ShortcutInfoCompat) r3
            java.lang.String r3 = r3.mId
            r1.add(r3)
            goto L18
        L2a:
            java.lang.Class<android.content.pm.ShortcutManager> r2 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r4.getSystemService(r2)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            r2.enableShortcuts(r1)
        L35:
            androidx.core.content.pm.ShortcutInfoCompatSaver r1 = getShortcutInfoSaverInstance(r4)
            r1.addShortcuts(r0)
            java.util.List r4 = getShortcutInfoListeners(r4)
            java.util.Iterator r4 = r4.iterator()
        L44:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r4.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            r0.onShortcutAdded(r5)
            goto L44
        L54:
            return
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getDynamicShortcuts(@androidx.annotation.NonNull android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L39
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r4.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.List r0 = r0.getDynamicShortcuts()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            android.content.pm.ShortcutInfo r2 = (android.content.pm.ShortcutInfo) r2
            androidx.core.content.pm.ShortcutInfoCompat$Builder r3 = new androidx.core.content.pm.ShortcutInfoCompat$Builder
            r3.<init>(r4, r2)
            androidx.core.content.pm.ShortcutInfoCompat r2 = r3.build()
            r1.add(r2)
            goto L1f
        L38:
            return r1
        L39:
            androidx.core.content.pm.ShortcutInfoCompatSaver r4 = getShortcutInfoSaverInstance(r4)     // Catch: java.lang.Exception -> L42
            java.util.List r4 = r4.getShortcuts()     // Catch: java.lang.Exception -> L42
            return r4
        L42:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
    }

    private static int getIconDimensionInternal(@androidx.annotation.NonNull android.content.Context r2, boolean r3) {
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r1 = 1
            if (r0 == 0) goto L14
            boolean r0 = r0.isLowRamDevice()
            if (r0 == 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            if (r0 == 0) goto L1a
            r0 = 48
            goto L1c
        L1a:
            r0 = 96
        L1c:
            int r0 = java.lang.Math.max(r1, r0)
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            if (r3 == 0) goto L2d
            float r2 = r2.xdpi
            goto L2f
        L2d:
            float r2 = r2.ydpi
        L2f:
            r3 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 / r3
            float r3 = (float) r0
            float r3 = r3 * r2
            int r2 = (int) r3
            return r2
    }

    public static int getIconMaxHeight(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L16
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            int r2 = r2.getIconMaxHeight()
            return r2
        L16:
            r0 = 0
            int r2 = getIconDimensionInternal(r2, r0)
            return r2
    }

    public static int getIconMaxWidth(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L16
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            int r2 = r2.getIconMaxWidth()
            return r2
        L16:
            r0 = 1
            int r2 = getIconDimensionInternal(r2, r0)
            return r2
    }

    public static int getMaxShortcutCountPerActivity(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L16
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            int r2 = r2.getMaxShortcutCountPerActivity()
            return r2
        L16:
            r2 = 5
            return r2
    }

    private static java.lang.String getShortcutInfoCompatWithLowestRank(@androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r5) {
            java.util.Iterator r5 = r5.iterator()
            r0 = -1
            r1 = 0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r5.next()
            androidx.core.content.pm.ShortcutInfoCompat r2 = (androidx.core.content.pm.ShortcutInfoCompat) r2
            int r3 = r2.getRank()
            if (r3 <= r0) goto L6
            java.lang.String r0 = r2.getId()
            int r1 = r2.getRank()
            r4 = r1
            r1 = r0
            r0 = r4
            goto L6
        L24:
            return r1
    }

    private static java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> getShortcutInfoListeners(android.content.Context r8) {
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            if (r0 != 0) goto L73
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.core.content.pm.SHORTCUT_LISTENER"
            r2.<init>(r3)
            java.lang.String r3 = r8.getPackageName()
            r2.setPackage(r3)
            r3 = 128(0x80, float:1.8E-43)
            java.util.List r1 = r1.queryIntentActivities(r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r1.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 != 0) goto L36
            goto L25
        L36:
            android.os.Bundle r2 = r2.metaData
            if (r2 != 0) goto L3b
            goto L25
        L3b:
            java.lang.String r3 = "androidx.core.content.pm.shortcut_listener_impl"
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L44
            goto L25
        L44:
            java.lang.Class<androidx.core.content.pm.ShortcutManagerCompat> r3 = androidx.core.content.pm.ShortcutManagerCompat.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L6b
            r4 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch: java.lang.Exception -> L6b
            java.lang.String r3 = "getInstance"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L6b
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch: java.lang.Exception -> L6b
            java.lang.reflect.Method r2 = r2.getMethod(r3, r6)     // Catch: java.lang.Exception -> L6b
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L6b
            r5[r4] = r8     // Catch: java.lang.Exception -> L6b
            java.lang.Object r2 = r2.invoke(r3, r5)     // Catch: java.lang.Exception -> L6b
            androidx.core.content.pm.ShortcutInfoChangeListener r2 = (androidx.core.content.pm.ShortcutInfoChangeListener) r2     // Catch: java.lang.Exception -> L6b
            r0.add(r2)     // Catch: java.lang.Exception -> L6b
            goto L25
        L6b:
            goto L25
        L6d:
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r8 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            if (r8 != 0) goto L73
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners = r0
        L73:
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r8 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            return r8
    }

    private static androidx.core.content.pm.ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(android.content.Context r6) {
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            if (r0 != 0) goto L3e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L33
            java.lang.Class<androidx.core.content.pm.ShortcutManagerCompat> r0 = androidx.core.content.pm.ShortcutManagerCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "androidx.sharetarget.ShortcutInfoCompatSaverImpl"
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "getInstance"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L32
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r2] = r5     // Catch: java.lang.Exception -> L32
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch: java.lang.Exception -> L32
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L32
            r3[r2] = r6     // Catch: java.lang.Exception -> L32
            java.lang.Object r6 = r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L32
            androidx.core.content.pm.ShortcutInfoCompatSaver r6 = (androidx.core.content.pm.ShortcutInfoCompatSaver) r6     // Catch: java.lang.Exception -> L32
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r6     // Catch: java.lang.Exception -> L32
            goto L33
        L32:
        L33:
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r6 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            if (r6 != 0) goto L3e
            androidx.core.content.pm.ShortcutInfoCompatSaver$NoopImpl r6 = new androidx.core.content.pm.ShortcutInfoCompatSaver$NoopImpl
            r6.<init>()
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r6
        L3e:
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r6 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            return r6
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getShortcuts(@androidx.annotation.NonNull android.content.Context r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L17
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.List r4 = r0.getShortcuts(r4)
            java.util.List r3 = androidx.core.content.pm.ShortcutInfoCompat.fromShortcuts(r3, r4)
            return r3
        L17:
            r1 = 25
            if (r0 < r1) goto L4e
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r4 & 1
            if (r2 == 0) goto L33
            java.util.List r2 = r0.getManifestShortcuts()
            r1.addAll(r2)
        L33:
            r2 = r4 & 2
            if (r2 == 0) goto L3e
            java.util.List r2 = r0.getDynamicShortcuts()
            r1.addAll(r2)
        L3e:
            r4 = r4 & 4
            if (r4 == 0) goto L49
            java.util.List r4 = r0.getPinnedShortcuts()
            r1.addAll(r4)
        L49:
            java.util.List r3 = androidx.core.content.pm.ShortcutInfoCompat.fromShortcuts(r3, r1)
            return r3
        L4e:
            r4 = r4 & 2
            if (r4 == 0) goto L5b
            androidx.core.content.pm.ShortcutInfoCompatSaver r3 = getShortcutInfoSaverInstance(r3)     // Catch: java.lang.Exception -> L5b
            java.util.List r3 = r3.getShortcuts()     // Catch: java.lang.Exception -> L5b
            return r3
        L5b:
            java.util.List r3 = java.util.Collections.emptyList()
            return r3
    }

    public static boolean isRateLimitingActive(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L16
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            boolean r2 = r2.isRateLimitingActive()
            return r2
        L16:
            r0 = 3
            java.util.List r0 = getShortcuts(r2, r0)
            int r0 = r0.size()
            int r2 = getMaxShortcutCountPerActivity(r2)
            if (r0 != r2) goto L27
            r2 = 1
            goto L28
        L27:
            r2 = 0
        L28:
            return r2
    }

    public static boolean isRequestPinShortcutSupported(@androidx.annotation.NonNull android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r4 = r4.getSystemService(r0)
            android.content.pm.ShortcutManager r4 = (android.content.pm.ShortcutManager) r4
            boolean r4 = r4.isRequestPinShortcutSupported()
            return r4
        L13:
            java.lang.String r0 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r4, r0)
            r2 = 0
            if (r1 == 0) goto L1d
            return r2
        L1d:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r1.<init>(r3)
            java.util.List r4 = r4.queryBroadcastReceivers(r1, r2)
            java.util.Iterator r4 = r4.iterator()
        L30:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r4.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.permission
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L4c
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L30
        L4c:
            r4 = 1
            return r4
        L4e:
            return r2
    }

    public static boolean pushDynamicShortcut(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull androidx.core.content.pm.ShortcutInfoCompat r11) {
            androidx.core.util.Preconditions.checkNotNull(r10)
            androidx.core.util.Preconditions.checkNotNull(r11)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 31
            if (r0 > r2) goto L30
            boolean r2 = r11.isExcludedFromSurfaces(r1)
            if (r2 == 0) goto L30
            java.util.List r10 = getShortcutInfoListeners(r10)
            java.util.Iterator r10 = r10.iterator()
        L1b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r10.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            java.util.List r2 = java.util.Collections.singletonList(r11)
            r0.onShortcutAdded(r2)
            goto L1b
        L2f:
            return r1
        L30:
            int r2 = getMaxShortcutCountPerActivity(r10)
            r3 = 0
            if (r2 != 0) goto L38
            return r3
        L38:
            r4 = 29
            if (r0 > r4) goto L3f
            convertUriIconToBitmapIcon(r10, r11)
        L3f:
            r4 = 30
            if (r0 < r4) goto L53
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r10.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            android.content.pm.ShortcutInfo r4 = r11.toShortcutInfo()
            r0.pushDynamicShortcut(r4)
            goto Lab
        L53:
            r4 = 25
            if (r0 < r4) goto Lab
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r10.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r4 = r0.isRateLimitingActive()
            if (r4 == 0) goto L66
            return r3
        L66:
            java.util.List r4 = r0.getDynamicShortcuts()
            int r5 = r4.size()
            if (r5 < r2) goto L9c
            java.lang.String[] r5 = new java.lang.String[r1]
            java.util.Iterator r4 = r4.iterator()
            r6 = -1
            r7 = 0
        L78:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L93
            java.lang.Object r8 = r4.next()
            android.content.pm.ShortcutInfo r8 = (android.content.pm.ShortcutInfo) r8
            int r9 = r8.getRank()
            if (r9 <= r6) goto L78
            java.lang.String r7 = r8.getId()
            int r6 = r8.getRank()
            goto L78
        L93:
            r5[r3] = r7
            java.util.List r4 = java.util.Arrays.asList(r5)
            r0.removeDynamicShortcuts(r4)
        L9c:
            android.content.pm.ShortcutInfo[] r4 = new android.content.pm.ShortcutInfo[r1]
            android.content.pm.ShortcutInfo r5 = r11.toShortcutInfo()
            r4[r3] = r5
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.addDynamicShortcuts(r4)
        Lab:
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r10)
            java.util.List r4 = r0.getShortcuts()     // Catch: java.lang.Throwable -> Lf7 java.lang.Exception -> L11c
            int r5 = r4.size()     // Catch: java.lang.Throwable -> Lf7 java.lang.Exception -> L11c
            if (r5 < r2) goto Lc8
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Lf7 java.lang.Exception -> L11c
            java.lang.String r4 = getShortcutInfoCompatWithLowestRank(r4)     // Catch: java.lang.Throwable -> Lf7 java.lang.Exception -> L11c
            r2[r3] = r4     // Catch: java.lang.Throwable -> Lf7 java.lang.Exception -> L11c
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> Lf7 java.lang.Exception -> L11c
            r0.removeShortcuts(r2)     // Catch: java.lang.Throwable -> Lf7 java.lang.Exception -> L11c
        Lc8:
            androidx.core.content.pm.ShortcutInfoCompat[] r2 = new androidx.core.content.pm.ShortcutInfoCompat[r1]     // Catch: java.lang.Throwable -> Lf7 java.lang.Exception -> L11c
            r2[r3] = r11     // Catch: java.lang.Throwable -> Lf7 java.lang.Exception -> L11c
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> Lf7 java.lang.Exception -> L11c
            r0.addShortcuts(r2)     // Catch: java.lang.Throwable -> Lf7 java.lang.Exception -> L11c
            java.util.List r0 = getShortcutInfoListeners(r10)
            java.util.Iterator r0 = r0.iterator()
        Ldb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lef
            java.lang.Object r2 = r0.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r2 = (androidx.core.content.pm.ShortcutInfoChangeListener) r2
            java.util.List r3 = java.util.Collections.singletonList(r11)
            r2.onShortcutAdded(r3)
            goto Ldb
        Lef:
            java.lang.String r11 = r11.getId()
            reportShortcutUsed(r10, r11)
            return r1
        Lf7:
            r0 = move-exception
            java.util.List r1 = getShortcutInfoListeners(r10)
            java.util.Iterator r1 = r1.iterator()
        L100:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L114
            java.lang.Object r2 = r1.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r2 = (androidx.core.content.pm.ShortcutInfoChangeListener) r2
            java.util.List r3 = java.util.Collections.singletonList(r11)
            r2.onShortcutAdded(r3)
            goto L100
        L114:
            java.lang.String r11 = r11.getId()
            reportShortcutUsed(r10, r11)
            throw r0
        L11c:
            java.util.List r0 = getShortcutInfoListeners(r10)
            java.util.Iterator r0 = r0.iterator()
        L124:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L138
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            java.util.List r2 = java.util.Collections.singletonList(r11)
            r1.onShortcutAdded(r2)
            goto L124
        L138:
            java.lang.String r11 = r11.getId()
            reportShortcutUsed(r10, r11)
            return r3
    }

    public static void removeAllDynamicShortcuts(@androidx.annotation.NonNull android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L11
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeAllDynamicShortcuts()
        L11:
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r2)
            r0.removeAllShortcuts()
            java.util.List r2 = getShortcutInfoListeners(r2)
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            r0.onAllShortcutsRemoved()
            goto L20
        L30:
            return
    }

    public static void removeDynamicShortcuts(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.util.List<java.lang.String> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L11
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeDynamicShortcuts(r3)
        L11:
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r2)
            r0.removeShortcuts(r3)
            java.util.List r2 = getShortcutInfoListeners(r2)
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            r0.onShortcutRemoved(r3)
            goto L20
        L30:
            return
    }

    public static void removeLongLivedShortcuts(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.util.List<java.lang.String> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto La
            removeDynamicShortcuts(r2, r3)
            return
        La:
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeLongLivedShortcuts(r3)
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r2)
            r0.removeShortcuts(r3)
            java.util.List r2 = getShortcutInfoListeners(r2)
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            r0.onShortcutRemoved(r3)
            goto L24
        L34:
            return
    }

    @androidx.annotation.NonNull
    private static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> removeShortcutsExcludedFromSurface(@androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r3, int r4) {
            java.util.Objects.requireNonNull(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 <= r1) goto La
            return r3
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r1 = (androidx.core.content.pm.ShortcutInfoCompat) r1
            boolean r2 = r1.isExcludedFromSurfaces(r4)
            if (r2 == 0) goto L13
            r0.remove(r1)
            goto L13
        L29:
            return r0
    }

    public static void reportShortcutUsed(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.core.util.Preconditions.checkNotNull(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L17
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.reportShortcutUsed(r3)
        L17:
            java.util.List r2 = getShortcutInfoListeners(r2)
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r0 = (androidx.core.content.pm.ShortcutInfoChangeListener) r0
            java.util.List r1 = java.util.Collections.singletonList(r3)
            r0.onShortcutUsageReported(r1)
            goto L1f
        L33:
            return
    }

    public static boolean requestPinShortcut(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull androidx.core.content.pm.ShortcutInfoCompat r12, @androidx.annotation.Nullable android.content.IntentSender r13) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 31
            if (r0 > r3) goto Lf
            boolean r3 = r12.isExcludedFromSurfaces(r2)
            if (r3 == 0) goto Lf
            return r1
        Lf:
            r3 = 26
            if (r0 < r3) goto L24
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r11 = r11.getSystemService(r0)
            android.content.pm.ShortcutManager r11 = (android.content.pm.ShortcutManager) r11
            android.content.pm.ShortcutInfo r12 = r12.toShortcutInfo()
            boolean r11 = r11.requestPinShortcut(r12, r13)
            return r11
        L24:
            boolean r0 = isRequestPinShortcutSupported(r11)
            if (r0 != 0) goto L2b
            return r1
        L2b:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r0 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r4.<init>(r0)
            r12.addToIntent(r4)
            if (r13 != 0) goto L3b
            r11.sendBroadcast(r4)
            return r2
        L3b:
            r5 = 0
            androidx.core.content.pm.ShortcutManagerCompat$1 r6 = new androidx.core.content.pm.ShortcutManagerCompat$1
            r6.<init>(r13)
            r7 = 0
            r8 = -1
            r9 = 0
            r10 = 0
            r3 = r11
            r3.sendOrderedBroadcast(r4, r5, r6, r7, r8, r9, r10)
            return r2
    }

    public static boolean setDynamicShortcuts(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r6) {
            androidx.core.util.Preconditions.checkNotNull(r5)
            androidx.core.util.Preconditions.checkNotNull(r6)
            r0 = 1
            java.util.List r1 = removeShortcutsExcludedFromSurface(r6, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r2 < r3) goto L42
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r4 = (androidx.core.content.pm.ShortcutInfoCompat) r4
            android.content.pm.ShortcutInfo r4 = r4.toShortcutInfo()
            r2.add(r4)
            goto L1e
        L32:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r2 = r3.setDynamicShortcuts(r2)
            if (r2 != 0) goto L42
            r5 = 0
            return r5
        L42:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r5)
            r2.removeAllShortcuts()
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r5)
            r2.addShortcuts(r1)
            java.util.List r5 = getShortcutInfoListeners(r5)
            java.util.Iterator r5 = r5.iterator()
        L58:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r5.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onAllShortcutsRemoved()
            r1.onShortcutAdded(r6)
            goto L58
        L6b:
            return r0
    }

    public static boolean updateShortcuts(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r6) {
            r0 = 1
            java.util.List r1 = removeShortcutsExcludedFromSurface(r6, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 > r3) goto Le
            convertUriIconsToBitmapIcons(r5, r1)
        Le:
            r3 = 25
            if (r2 < r3) goto L3f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r4 = (androidx.core.content.pm.ShortcutInfoCompat) r4
            android.content.pm.ShortcutInfo r4 = r4.toShortcutInfo()
            r2.add(r4)
            goto L1b
        L2f:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r5.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r2 = r3.updateShortcuts(r2)
            if (r2 != 0) goto L3f
            r5 = 0
            return r5
        L3f:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r5)
            r2.addShortcuts(r1)
            java.util.List r5 = getShortcutInfoListeners(r5)
            java.util.Iterator r5 = r5.iterator()
        L4e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r5.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onShortcutUpdated(r6)
            goto L4e
        L5e:
            return r0
    }
}
