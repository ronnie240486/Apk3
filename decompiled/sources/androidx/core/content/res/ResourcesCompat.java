package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class ResourcesCompat {

    @androidx.annotation.AnyRes
    public static final int ID_NULL = 0;
    private static final java.lang.String TAG = "ResourcesCompat";
    private static final java.lang.Object sColorStateCacheLock = null;

    @androidx.annotation.GuardedBy("sColorStateCacheLock")
    private static final java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry>> sColorStateCaches = null;
    private static final java.lang.ThreadLocal<android.util.TypedValue> sTempTypedValue = null;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(15)
    public static class Api15Impl {
        private Api15Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources r0, int r1, int r2) {
                android.graphics.drawable.Drawable r0 = r0.getDrawableForDensity(r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources r0, int r1, int r2, android.content.res.Resources.Theme r3) {
                android.graphics.drawable.Drawable r0 = r0.getDrawableForDensity(r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getColor(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                int r0 = r0.getColor(r1, r2)
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        public static android.content.res.ColorStateList getColorStateList(@androidx.annotation.NonNull android.content.res.Resources r0, @androidx.annotation.ColorRes int r1, @androidx.annotation.Nullable android.content.res.Resources.Theme r2) {
                android.content.res.ColorStateList r0 = r0.getColorStateList(r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static float getFloat(@androidx.annotation.NonNull android.content.res.Resources r0, @androidx.annotation.DimenRes int r1) {
                float r0 = r0.getFloat(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ColorStateListCacheEntry {
        public final android.content.res.Configuration mConfiguration;
        public final int mThemeHash;
        public final android.content.res.ColorStateList mValue;

        public ColorStateListCacheEntry(@androidx.annotation.NonNull android.content.res.ColorStateList r1, @androidx.annotation.NonNull android.content.res.Configuration r2, @androidx.annotation.Nullable android.content.res.Resources.Theme r3) {
                r0 = this;
                r0.<init>()
                r0.mValue = r1
                r0.mConfiguration = r2
                if (r3 != 0) goto Lb
                r1 = 0
                goto Lf
            Lb:
                int r1 = r3.hashCode()
            Lf:
                r0.mThemeHash = r1
                return
        }
    }

    public static final class ColorStateListCacheKey {
        public final android.content.res.Resources mResources;
        public final android.content.res.Resources.Theme mTheme;

        public ColorStateListCacheKey(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.Nullable android.content.res.Resources.Theme r2) {
                r0 = this;
                r0.<init>()
                r0.mResources = r1
                r0.mTheme = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L29
                java.lang.Class<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey> r2 = androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L29
            L10:
                androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r5 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey) r5
                android.content.res.Resources r2 = r4.mResources
                android.content.res.Resources r3 = r5.mResources
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L27
                android.content.res.Resources$Theme r2 = r4.mTheme
                android.content.res.Resources$Theme r5 = r5.mTheme
                boolean r5 = androidx.core.util.ObjectsCompat.equals(r2, r5)
                if (r5 == 0) goto L27
                goto L28
            L27:
                r0 = 0
            L28:
                return r0
            L29:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                android.content.res.Resources r1 = r3.mResources
                r2 = 0
                r0[r2] = r1
                android.content.res.Resources$Theme r1 = r3.mTheme
                r2 = 1
                r0[r2] = r1
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class FontCallback {
        public static /* synthetic */ void $r8$lambda$3yv7dDJDSSH8XKTxkNkwYH6nK6w(androidx.core.content.res.ResourcesCompat.FontCallback r0, int r1) {
                r0.lambda$callbackFailAsync$1(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$ogWJ7e4UAkgZnU7fNvmJ6umiBig(androidx.core.content.res.ResourcesCompat.FontCallback r0, android.graphics.Typeface r1) {
                r0.lambda$callbackSuccessAsync$0(r1)
                return
        }

        public FontCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public static android.os.Handler getHandler(@androidx.annotation.Nullable android.os.Handler r1) {
                if (r1 != 0) goto Lb
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
            Lb:
                return r1
        }

        private /* synthetic */ void lambda$callbackFailAsync$1(int r1) {
                r0 = this;
                r0.onFontRetrievalFailed(r1)
                return
        }

        private /* synthetic */ void lambda$callbackSuccessAsync$0(android.graphics.Typeface r1) {
                r0 = this;
                r0.onFontRetrieved(r1)
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(int r3, @androidx.annotation.Nullable android.os.Handler r4) {
                r2 = this;
                android.os.Handler r4 = getHandler(r4)
                androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda0 r0 = new androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda0
                r1 = 0
                r0.<init>(r2, r3, r1)
                r4.post(r0)
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@androidx.annotation.NonNull android.graphics.Typeface r3, @androidx.annotation.Nullable android.os.Handler r4) {
                r2 = this;
                android.os.Handler r4 = getHandler(r4)
                com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0
                r1 = 2
                r0.<init>(r2, r3, r1)
                r4.post(r0)
                return
        }

        public abstract void onFontRetrievalFailed(int r1);

        public abstract void onFontRetrieved(@androidx.annotation.NonNull android.graphics.Typeface r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ThemeCompat {

        /* JADX INFO: loaded from: classes2.dex */
        @androidx.annotation.RequiresApi(23)
        public static class Api23Impl {
            private static java.lang.reflect.Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final java.lang.Object sRebaseMethodLock = null;

            static {
                    java.lang.Object r0 = new java.lang.Object
                    r0.<init>()
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodLock = r0
                    return
            }

            private Api23Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @android.annotation.SuppressLint({"BanUncheckedReflection"})
            public static void rebase(@androidx.annotation.NonNull android.content.res.Resources.Theme r6) {
                    java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodLock
                    monitor-enter(r0)
                    boolean r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodFetched     // Catch: java.lang.Throwable -> L3d
                    r2 = 0
                    if (r1 != 0) goto L24
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.Throwable -> L3d
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.Throwable -> L3d
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod = r3     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.Throwable -> L3d
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L1a java.lang.Throwable -> L3d
                    goto L22
                L1a:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3d
                L22:
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodFetched = r1     // Catch: java.lang.Throwable -> L3d
                L24:
                    java.lang.reflect.Method r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod     // Catch: java.lang.Throwable -> L3d
                    if (r1 == 0) goto L3b
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30 java.lang.Throwable -> L3d
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30 java.lang.Throwable -> L3d
                    goto L3b
                L2e:
                    r6 = move-exception
                    goto L31
                L30:
                    r6 = move-exception
                L31:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3d
                    r6 = 0
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod = r6     // Catch: java.lang.Throwable -> L3d
                L3b:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
                    return
                L3d:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
                    throw r6
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        @androidx.annotation.RequiresApi(29)
        public static class Api29Impl {
            private Api29Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.DoNotInline
            public static void rebase(@androidx.annotation.NonNull android.content.res.Resources.Theme r0) {
                    r0.rebase()
                    return
            }
        }

        private ThemeCompat() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void rebase(@androidx.annotation.NonNull android.content.res.Resources.Theme r2) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto La
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api29Impl.rebase(r2)
                goto L11
            La:
                r1 = 23
                if (r0 < r1) goto L11
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.rebase(r2)
            L11:
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.content.res.ResourcesCompat.sTempTypedValue = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            androidx.core.content.res.ResourcesCompat.sColorStateCaches = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.content.res.ResourcesCompat.sColorStateCacheLock = r0
            return
    }

    private ResourcesCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addColorStateListToCache(@androidx.annotation.NonNull androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey r3, @androidx.annotation.ColorRes int r4, @androidx.annotation.NonNull android.content.res.ColorStateList r5, @androidx.annotation.Nullable android.content.res.Resources.Theme r6) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r1.get(r3)     // Catch: java.lang.Throwable -> L25
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L15
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L25
        L15:
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r1 = new androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry     // Catch: java.lang.Throwable -> L25
            android.content.res.Resources r3 = r3.mResources     // Catch: java.lang.Throwable -> L25
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Throwable -> L25
            r1.<init>(r5, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2.append(r4, r1)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    public static void clearCachesForTheme(@androidx.annotation.NonNull android.content.res.Resources.Theme r3) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L29
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L29
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L29
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r2 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey) r2     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto Ld
            android.content.res.Resources$Theme r2 = r2.mTheme     // Catch: java.lang.Throwable -> L29
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto Ld
            r1.remove()     // Catch: java.lang.Throwable -> L29
            goto Ld
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r3
    }

    @androidx.annotation.Nullable
    private static android.content.res.ColorStateList getCachedColorStateList(@androidx.annotation.NonNull androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey r5, @androidx.annotation.ColorRes int r6) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L45
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L45
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L42
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L45
            if (r2 <= 0) goto L42
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L45
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r2 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry) r2     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L42
            android.content.res.Configuration r3 = r2.mConfiguration     // Catch: java.lang.Throwable -> L45
            android.content.res.Resources r4 = r5.mResources     // Catch: java.lang.Throwable -> L45
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L45
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L3f
            android.content.res.Resources$Theme r5 = r5.mTheme     // Catch: java.lang.Throwable -> L45
            if (r5 != 0) goto L31
            int r3 = r2.mThemeHash     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L3b
        L31:
            if (r5 == 0) goto L3f
            int r3 = r2.mThemeHash     // Catch: java.lang.Throwable -> L45
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L45
            if (r3 != r5) goto L3f
        L3b:
            android.content.res.ColorStateList r5 = r2.mValue     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return r5
        L3f:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L45
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            r5 = 0
            return r5
        L45:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r5
    }

    @androidx.annotation.Nullable
    public static android.graphics.Typeface getCachedFont(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.FontRes int r9) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r0 = r8
            r1 = r9
            android.graphics.Typeface r8 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @androidx.annotation.ColorInt
    public static int getColor(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.ColorRes int r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) throws android.content.res.Resources.NotFoundException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r2 = androidx.core.content.res.ResourcesCompat.Api23Impl.getColor(r2, r3, r4)
            return r2
        Lb:
            int r2 = r2.getColor(r3)
            return r2
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getColorStateList(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.ColorRes int r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) throws android.content.res.Resources.NotFoundException {
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r0 = new androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey
            r0.<init>(r2, r4)
            android.content.res.ColorStateList r1 = getCachedColorStateList(r0, r3)
            if (r1 == 0) goto Lc
            return r1
        Lc:
            android.content.res.ColorStateList r1 = inflateColorStateList(r2, r3, r4)
            if (r1 == 0) goto L16
            addColorStateListToCache(r0, r3, r1, r4)
            return r1
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L21
            android.content.res.ColorStateList r2 = androidx.core.content.res.ResourcesCompat.Api23Impl.getColorStateList(r2, r3, r4)
            return r2
        L21:
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)
            return r2
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable getDrawable(@androidx.annotation.NonNull android.content.res.Resources r0, @androidx.annotation.DrawableRes int r1, @androidx.annotation.Nullable android.content.res.Resources.Theme r2) throws android.content.res.Resources.NotFoundException {
            android.graphics.drawable.Drawable r0 = androidx.core.content.res.ResourcesCompat.Api21Impl.getDrawable(r0, r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable getDrawableForDensity(@androidx.annotation.NonNull android.content.res.Resources r0, @androidx.annotation.DrawableRes int r1, int r2, @androidx.annotation.Nullable android.content.res.Resources.Theme r3) throws android.content.res.Resources.NotFoundException {
            android.graphics.drawable.Drawable r0 = androidx.core.content.res.ResourcesCompat.Api21Impl.getDrawableForDensity(r0, r1, r2, r3)
            return r0
    }

    public static float getFloat(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.DimenRes int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            float r2 = androidx.core.content.res.ResourcesCompat.Api29Impl.getFloat(r2, r3)
            return r2
        Lb:
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r2.getValue(r3, r0, r1)
            int r2 = r0.type
            r1 = 4
            if (r2 != r1) goto L1d
            float r2 = r0.getFloat()
            return r2
        L1d:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Resource ID #0x"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = " type #0x"
            r1.append(r3)
            int r3 = r0.type
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = " is not valid"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.Nullable
    public static android.graphics.Typeface getFont(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.FontRes int r9) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            android.graphics.Typeface r8 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static android.graphics.Typeface getFont(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.FontRes int r9, @androidx.annotation.NonNull android.util.TypedValue r10, int r11, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r12) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            r5 = 0
            r6 = 1
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            android.graphics.Typeface r8 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static void getFont(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.FontRes int r9, @androidx.annotation.NonNull androidx.core.content.res.ResourcesCompat.FontCallback r10, @androidx.annotation.Nullable android.os.Handler r11) throws android.content.res.Resources.NotFoundException {
            androidx.core.util.Preconditions.checkNotNull(r10)
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Le
            r8 = -4
            r10.callbackFailAsync(r8, r11)
            return
        Le:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r4 = r10
            r5 = r11
            loadFont(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @androidx.annotation.NonNull
    private static android.util.TypedValue getTypedValue() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.core.content.res.ResourcesCompat.sTempTypedValue
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L12
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }

    @androidx.annotation.Nullable
    private static android.content.res.ColorStateList inflateColorStateList(android.content.res.Resources r2, int r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) {
            boolean r0 = isColorInt(r2, r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.res.XmlResourceParser r3 = r2.getXml(r3)
            android.content.res.ColorStateList r2 = androidx.core.content.res.ColorStateListInflaterCompat.createFromXml(r2, r3, r4)     // Catch: java.lang.Exception -> L11
            return r2
        L11:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r4 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r4, r2)
            return r1
    }

    private static boolean isColorInt(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.ColorRes int r3) {
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r2.getValue(r3, r0, r1)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L13
            r3 = 31
            if (r2 > r3) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    private static android.graphics.Typeface loadFont(@androidx.annotation.NonNull android.content.Context r10, int r11, @androidx.annotation.NonNull android.util.TypedValue r12, int r13, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r14, @androidx.annotation.Nullable android.os.Handler r15, boolean r16, boolean r17) {
            android.content.res.Resources r1 = r10.getResources()
            r0 = 1
            r9 = r11
            r2 = r12
            r1.getValue(r11, r12, r0)
            r0 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            android.graphics.Typeface r0 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != 0) goto L3a
            if (r14 != 0) goto L3a
            if (r17 == 0) goto L1e
            goto L3a
        L1e:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r11)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3a:
            return r0
    }

    private static android.graphics.Typeface loadFont(@androidx.annotation.NonNull android.content.Context r17, android.content.res.Resources r18, @androidx.annotation.NonNull android.util.TypedValue r19, int r20, int r21, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r22, @androidx.annotation.Nullable android.os.Handler r23, boolean r24, boolean r25) {
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lbc
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L26
            if (r11 == 0) goto L25
            r11.callbackFailAsync(r15, r12)
        L25:
            return r16
        L26:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.TypefaceCompat.findFromCache(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L36
            if (r11 == 0) goto L35
            r11.callbackSuccessAsync(r2, r12)
        L35:
            return r2
        L36:
            if (r25 == 0) goto L39
            return r16
        L39:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L8b org.xmlpull.v1.XmlPullParserException -> La1
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L8b org.xmlpull.v1.XmlPullParserException -> La1
            if (r2 == 0) goto L70
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L8b org.xmlpull.v1.XmlPullParserException -> La1
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r2 = androidx.core.content.res.FontResourcesParserCompat.parse(r2, r0)     // Catch: java.io.IOException -> L8b org.xmlpull.v1.XmlPullParserException -> La1
            if (r2 != 0) goto L5a
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L8b org.xmlpull.v1.XmlPullParserException -> La1
            if (r11 == 0) goto L59
            r11.callbackFailAsync(r15, r12)     // Catch: java.io.IOException -> L8b org.xmlpull.v1.XmlPullParserException -> La1
        L59:
            return r16
        L5a:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L8b org.xmlpull.v1.XmlPullParserException -> La1
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L8b org.xmlpull.v1.XmlPullParserException -> La1
            return r0
        L70:
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L8b org.xmlpull.v1.XmlPullParserException -> La1
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8b org.xmlpull.v1.XmlPullParserException -> La1
            if (r11 == 0) goto L8a
            if (r0 == 0) goto L87
            r11.callbackSuccessAsync(r0, r12)     // Catch: java.io.IOException -> L8b org.xmlpull.v1.XmlPullParserException -> La1
            goto L8a
        L87:
            r11.callbackFailAsync(r15, r12)     // Catch: java.io.IOException -> L8b org.xmlpull.v1.XmlPullParserException -> La1
        L8a:
            return r0
        L8b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto Lb6
        La1:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        Lb6:
            if (r11 == 0) goto Lbb
            r11.callbackFailAsync(r15, r12)
        Lbb:
            return r16
        Lbc:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.String r3 = "Resource \""
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }
}
