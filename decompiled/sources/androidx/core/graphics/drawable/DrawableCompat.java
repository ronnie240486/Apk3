package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableCompat {
    private static final java.lang.String TAG = "DrawableCompat";
    private static java.lang.reflect.Method sGetLayoutDirectionMethod;
    private static boolean sGetLayoutDirectionMethodFetched;
    private static java.lang.reflect.Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;

    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getAlpha(android.graphics.drawable.Drawable r0) {
                int r0 = r0.getAlpha()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.drawable.Drawable getChild(android.graphics.drawable.DrawableContainer.DrawableContainerState r0, int r1) {
                android.graphics.drawable.Drawable r0 = r0.getChild(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.drawable.Drawable getDrawable(android.graphics.drawable.InsetDrawable r0) {
                android.graphics.drawable.Drawable r0 = r0.getDrawable()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isAutoMirrored(android.graphics.drawable.Drawable r0) {
                boolean r0 = r0.isAutoMirrored()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setAutoMirrored(android.graphics.drawable.Drawable r0, boolean r1) {
                r0.setAutoMirrored(r1)
                return
        }
    }

    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void applyTheme(android.graphics.drawable.Drawable r0, android.content.res.Resources.Theme r1) {
                r0.applyTheme(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean canApplyTheme(android.graphics.drawable.Drawable r0) {
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.ColorFilter getColorFilter(android.graphics.drawable.Drawable r0) {
                android.graphics.ColorFilter r0 = r0.getColorFilter()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void inflate(android.graphics.drawable.Drawable r0, android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
                r0.inflate(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setHotspot(android.graphics.drawable.Drawable r0, float r1, float r2) {
                r0.setHotspot(r1, r2)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setHotspotBounds(android.graphics.drawable.Drawable r0, int r1, int r2, int r3, int r4) {
                r0.setHotspotBounds(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setTint(android.graphics.drawable.Drawable r0, int r1) {
                r0.setTint(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setTintList(android.graphics.drawable.Drawable r0, android.content.res.ColorStateList r1) {
                r0.setTintList(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setTintMode(android.graphics.drawable.Drawable r0, android.graphics.PorterDuff.Mode r1) {
                r0.setTintMode(r1)
                return
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
        public static int getLayoutDirection(android.graphics.drawable.Drawable r0) {
                int r0 = r0.getLayoutDirection()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean setLayoutDirection(android.graphics.drawable.Drawable r0, int r1) {
                boolean r0 = r0.setLayoutDirection(r1)
                return r0
        }
    }

    private DrawableCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyTheme(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, @androidx.annotation.NonNull android.content.res.Resources.Theme r1) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.applyTheme(r0, r1)
            return
    }

    public static boolean canApplyTheme(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0) {
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.Api21Impl.canApplyTheme(r0)
            return r0
    }

    public static void clearColorFilter(@androidx.annotation.NonNull android.graphics.drawable.Drawable r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            r3.clearColorFilter()
            goto L4a
        La:
            r3.clearColorFilter()
            boolean r0 = r3 instanceof android.graphics.drawable.InsetDrawable
            if (r0 == 0) goto L1b
            android.graphics.drawable.InsetDrawable r3 = (android.graphics.drawable.InsetDrawable) r3
            android.graphics.drawable.Drawable r3 = androidx.core.graphics.drawable.DrawableCompat.Api19Impl.getDrawable(r3)
            clearColorFilter(r3)
            goto L4a
        L1b:
            boolean r0 = r3 instanceof androidx.core.graphics.drawable.WrappedDrawable
            if (r0 == 0) goto L29
            androidx.core.graphics.drawable.WrappedDrawable r3 = (androidx.core.graphics.drawable.WrappedDrawable) r3
            android.graphics.drawable.Drawable r3 = r3.getWrappedDrawable()
            clearColorFilter(r3)
            goto L4a
        L29:
            boolean r0 = r3 instanceof android.graphics.drawable.DrawableContainer
            if (r0 == 0) goto L4a
            android.graphics.drawable.DrawableContainer r3 = (android.graphics.drawable.DrawableContainer) r3
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            android.graphics.drawable.DrawableContainer$DrawableContainerState r3 = (android.graphics.drawable.DrawableContainer.DrawableContainerState) r3
            if (r3 == 0) goto L4a
            r0 = 0
            int r1 = r3.getChildCount()
        L3c:
            if (r0 >= r1) goto L4a
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.Api19Impl.getChild(r3, r0)
            if (r2 == 0) goto L47
            clearColorFilter(r2)
        L47:
            int r0 = r0 + 1
            goto L3c
        L4a:
            return
    }

    public static int getAlpha(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0) {
            int r0 = androidx.core.graphics.drawable.DrawableCompat.Api19Impl.getAlpha(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.ColorFilter getColorFilter(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0) {
            android.graphics.ColorFilter r0 = androidx.core.graphics.drawable.DrawableCompat.Api21Impl.getColorFilter(r0)
            return r0
    }

    public static int getLayoutDirection(@androidx.annotation.NonNull android.graphics.drawable.Drawable r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r6 = androidx.core.graphics.drawable.DrawableCompat.Api23Impl.getLayoutDirection(r6)
            return r6
        Lb:
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethodFetched
            java.lang.String r1 = "DrawableCompat"
            r2 = 0
            if (r0 != 0) goto L2b
            r0 = 1
            java.lang.Class<android.graphics.drawable.Drawable> r3 = android.graphics.drawable.Drawable.class
            java.lang.String r4 = "getLayoutDirection"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L23
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L23
            androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethod = r3     // Catch: java.lang.NoSuchMethodException -> L23
            r3.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L23
            goto L29
        L23:
            r3 = move-exception
            java.lang.String r4 = "Failed to retrieve getLayoutDirection() method"
            android.util.Log.i(r1, r4, r3)
        L29:
            androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethodFetched = r0
        L2b:
            java.lang.reflect.Method r0 = androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethod
            if (r0 == 0) goto L45
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3c
            java.lang.Object r6 = r0.invoke(r6, r3)     // Catch: java.lang.Exception -> L3c
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Exception -> L3c
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L3c
            return r6
        L3c:
            r6 = move-exception
            java.lang.String r0 = "Failed to invoke getLayoutDirection() via reflection"
            android.util.Log.i(r1, r0, r6)
            r6 = 0
            androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethod = r6
        L45:
            return r2
    }

    public static void inflate(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, @androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r2, @androidx.annotation.NonNull android.util.AttributeSet r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.inflate(r0, r1, r2, r3, r4)
            return
    }

    public static boolean isAutoMirrored(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0) {
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.Api19Impl.isAutoMirrored(r0)
            return r0
    }

    @java.lang.Deprecated
    public static void jumpToCurrentState(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0) {
            r0.jumpToCurrentState()
            return
    }

    public static void setAutoMirrored(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, boolean r1) {
            androidx.core.graphics.drawable.DrawableCompat.Api19Impl.setAutoMirrored(r0, r1)
            return
    }

    public static void setHotspot(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, float r1, float r2) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setHotspot(r0, r1, r2)
            return
    }

    public static void setHotspotBounds(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, int r1, int r2, int r3, int r4) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setHotspotBounds(r0, r1, r2, r3, r4)
            return
    }

    public static boolean setLayoutDirection(@androidx.annotation.NonNull android.graphics.drawable.Drawable r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r7 = androidx.core.graphics.drawable.DrawableCompat.Api23Impl.setLayoutDirection(r7, r8)
            return r7
        Lb:
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethodFetched
            java.lang.String r1 = "DrawableCompat"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L30
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.String r4 = "setLayoutDirection"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L28
            r5[r2] = r6     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L28
            androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethod = r0     // Catch: java.lang.NoSuchMethodException -> L28
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L28
            goto L2e
        L28:
            r0 = move-exception
            java.lang.String r4 = "Failed to retrieve setLayoutDirection(int) method"
            android.util.Log.i(r1, r4, r0)
        L2e:
            androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethodFetched = r3
        L30:
            java.lang.reflect.Method r0 = androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethod
            if (r0 == 0) goto L49
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L40
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L40
            r4[r2] = r8     // Catch: java.lang.Exception -> L40
            r0.invoke(r7, r4)     // Catch: java.lang.Exception -> L40
            return r3
        L40:
            r7 = move-exception
            java.lang.String r8 = "Failed to invoke setLayoutDirection(int) via reflection"
            android.util.Log.i(r1, r8, r7)
            r7 = 0
            androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethod = r7
        L49:
            return r2
    }

    public static void setTint(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, @androidx.annotation.ColorInt int r1) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setTint(r0, r1)
            return
    }

    public static void setTintList(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, @androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setTintList(r0, r1)
            return
    }

    public static void setTintMode(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setTintMode(r0, r1)
            return
    }

    public static <T extends android.graphics.drawable.Drawable> T unwrap(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1) {
            boolean r0 = r1 instanceof androidx.core.graphics.drawable.WrappedDrawable
            if (r0 == 0) goto La
            androidx.core.graphics.drawable.WrappedDrawable r1 = (androidx.core.graphics.drawable.WrappedDrawable) r1
            android.graphics.drawable.Drawable r1 = r1.getWrappedDrawable()
        La:
            return r1
    }

    @androidx.annotation.NonNull
    public static android.graphics.drawable.Drawable wrap(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L7
            return r2
        L7:
            boolean r0 = r2 instanceof androidx.core.graphics.drawable.TintAwareDrawable
            if (r0 != 0) goto L11
            androidx.core.graphics.drawable.WrappedDrawableApi21 r0 = new androidx.core.graphics.drawable.WrappedDrawableApi21
            r0.<init>(r2)
            return r0
        L11:
            return r2
    }
}
