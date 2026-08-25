package com.google.android.material.color;

/* JADX INFO: loaded from: classes2.dex */
public class DynamicColors {
    private static final com.google.android.material.color.DynamicColors.DeviceSupportCondition DEFAULT_DEVICE_SUPPORT_CONDITION = null;
    private static final java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors.DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_BRANDS = null;
    private static final java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors.DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = null;
    private static final int[] DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = null;

    @android.annotation.SuppressLint({"PrivateApi"})
    private static final com.google.android.material.color.DynamicColors.DeviceSupportCondition SAMSUNG_DEVICE_SUPPORT_CONDITION = null;
    private static final int USE_DEFAULT_THEME_OVERLAY = 0;



    public interface DeviceSupportCondition {
        boolean isSupported();
    }

    public static class DynamicColorsActivityLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        private final com.google.android.material.color.DynamicColorsOptions dynamicColorsOptions;

        public DynamicColorsActivityLifecycleCallbacks(@androidx.annotation.NonNull com.google.android.material.color.DynamicColorsOptions r1) {
                r0 = this;
                r0.<init>()
                r0.dynamicColorsOptions = r1
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.Nullable android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.Nullable android.os.Bundle r2) {
                r0 = this;
                com.google.android.material.color.DynamicColorsOptions r2 = r0.dynamicColorsOptions
                com.google.android.material.color.DynamicColors.applyToActivityIfAvailable(r1, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@androidx.annotation.NonNull android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    public interface OnAppliedCallback {
        void onApplied(@androidx.annotation.NonNull android.app.Activity r1);
    }

    public interface Precondition {
        boolean shouldApplyDynamicColors(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.StyleRes int r2);
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            int r1 = com.google.android.material.R.attr.dynamicColorThemeOverlay
            r2 = 0
            r0[r2] = r1
            com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = r0
            com.google.android.material.color.DynamicColors$1 r0 = new com.google.android.material.color.DynamicColors$1
            r0.<init>()
            com.google.android.material.color.DynamicColors.DEFAULT_DEVICE_SUPPORT_CONDITION = r0
            com.google.android.material.color.DynamicColors$2 r1 = new com.google.android.material.color.DynamicColors$2
            r1.<init>()
            com.google.android.material.color.DynamicColors.SAMSUNG_DEVICE_SUPPORT_CONDITION = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "fcnt"
            r2.put(r3, r0)
            java.lang.String r3 = "google"
            r2.put(r3, r0)
            java.lang.String r3 = "hmd global"
            r2.put(r3, r0)
            java.lang.String r3 = "infinix"
            r2.put(r3, r0)
            java.lang.String r3 = "infinix mobility limited"
            r2.put(r3, r0)
            java.lang.String r3 = "itel"
            r2.put(r3, r0)
            java.lang.String r3 = "kyocera"
            r2.put(r3, r0)
            java.lang.String r3 = "lenovo"
            r2.put(r3, r0)
            java.lang.String r3 = "lge"
            r2.put(r3, r0)
            java.lang.String r3 = "motorola"
            r2.put(r3, r0)
            java.lang.String r3 = "nothing"
            r2.put(r3, r0)
            java.lang.String r3 = "oneplus"
            r2.put(r3, r0)
            java.lang.String r3 = "oppo"
            r2.put(r3, r0)
            java.lang.String r3 = "realme"
            r2.put(r3, r0)
            java.lang.String r3 = "robolectric"
            r2.put(r3, r0)
            java.lang.String r3 = "samsung"
            r2.put(r3, r1)
            java.lang.String r1 = "sharp"
            r2.put(r1, r0)
            java.lang.String r1 = "sony"
            r2.put(r1, r0)
            java.lang.String r1 = "tcl"
            r2.put(r1, r0)
            java.lang.String r1 = "tecno"
            r2.put(r1, r0)
            java.lang.String r1 = "tecno mobile limited"
            r2.put(r1, r0)
            java.lang.String r1 = "vivo"
            r2.put(r1, r0)
            java.lang.String r1 = "wingtech"
            r2.put(r1, r0)
            java.lang.String r1 = "xiaomi"
            r2.put(r1, r0)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r2)
            com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "asus"
            r1.put(r2, r0)
            java.lang.String r2 = "jio"
            r1.put(r2, r0)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
            com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_BRANDS = r0
            return
    }

    private DynamicColors() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(@androidx.annotation.NonNull android.app.Activity r0) {
            applyToActivityIfAvailable(r0)
            return
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.StyleRes int r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setThemeOverlay(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivityIfAvailable(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull com.google.android.material.color.DynamicColors.Precondition r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setPrecondition(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivityIfAvailable(r1, r2)
            return
    }

    public static void applyToActivitiesIfAvailable(@androidx.annotation.NonNull android.app.Application r1) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions r0 = r0.build()
            applyToActivitiesIfAvailable(r1, r0)
            return
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(@androidx.annotation.NonNull android.app.Application r1, @androidx.annotation.StyleRes int r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setThemeOverlay(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivitiesIfAvailable(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(@androidx.annotation.NonNull android.app.Application r1, @androidx.annotation.StyleRes int r2, @androidx.annotation.NonNull com.google.android.material.color.DynamicColors.Precondition r3) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setThemeOverlay(r2)
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r2.setPrecondition(r3)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivitiesIfAvailable(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(@androidx.annotation.NonNull android.app.Application r1, @androidx.annotation.NonNull com.google.android.material.color.DynamicColors.Precondition r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setPrecondition(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivitiesIfAvailable(r1, r2)
            return
    }

    public static void applyToActivitiesIfAvailable(@androidx.annotation.NonNull android.app.Application r1, @androidx.annotation.NonNull com.google.android.material.color.DynamicColorsOptions r2) {
            com.google.android.material.color.DynamicColors$DynamicColorsActivityLifecycleCallbacks r0 = new com.google.android.material.color.DynamicColors$DynamicColorsActivityLifecycleCallbacks
            r0.<init>(r2)
            r1.registerActivityLifecycleCallbacks(r0)
            return
    }

    public static void applyToActivityIfAvailable(@androidx.annotation.NonNull android.app.Activity r1) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions r0 = r0.build()
            applyToActivityIfAvailable(r1, r0)
            return
    }

    public static void applyToActivityIfAvailable(@androidx.annotation.NonNull android.app.Activity r5, @androidx.annotation.NonNull com.google.android.material.color.DynamicColorsOptions r6) {
            boolean r0 = isDynamicColorAvailable()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            java.lang.Integer r1 = r6.getContentBasedSeedColor()
            if (r1 != 0) goto L1d
            int r0 = r6.getThemeOverlay()
            if (r0 != 0) goto L19
            int r0 = getDefaultThemeOverlay(r5)
            goto L1d
        L19:
            int r0 = r6.getThemeOverlay()
        L1d:
            com.google.android.material.color.DynamicColors$Precondition r1 = r6.getPrecondition()
            boolean r1 = r1.shouldApplyDynamicColors(r5, r0)
            if (r1 == 0) goto L226
            java.lang.Integer r1 = r6.getContentBasedSeedColor()
            if (r1 == 0) goto L21c
            int r0 = com.google.android.material.R.attr.isLightTheme
            r1 = 1
            boolean r0 = com.google.android.material.resources.MaterialAttributes.resolveBoolean(r5, r0, r1)
            if (r0 == 0) goto L43
            java.lang.Integer r0 = r6.getContentBasedSeedColor()
            int r0 = r0.intValue()
            com.google.android.material.color.utilities.Scheme r0 = com.google.android.material.color.utilities.Scheme.lightContent(r0)
            goto L4f
        L43:
            java.lang.Integer r0 = r6.getContentBasedSeedColor()
            int r0 = r0.intValue()
            com.google.android.material.color.utilities.Scheme r0 = com.google.android.material.color.utilities.Scheme.darkContent(r0)
        L4f:
            com.google.android.material.color.ColorResourcesOverride r1 = com.google.android.material.color.ColorResourcesOverride.CC.getInstance()
            if (r1 != 0) goto L56
            return
        L56:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r3 = com.google.android.material.R.color.material_personalized_color_primary
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getPrimary()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_on_primary
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getOnPrimary()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_primary_inverse
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getInversePrimary()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_primary_container
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getPrimaryContainer()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_on_primary_container
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getOnPrimaryContainer()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_secondary
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getSecondary()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_on_secondary
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getOnSecondary()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_secondary_container
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getSecondaryContainer()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_on_secondary_container
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getOnSecondaryContainer()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_tertiary
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getTertiary()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_on_tertiary
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getOnTertiary()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_tertiary_container
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getTertiaryContainer()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_on_tertiary_container
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getOnTertiaryContainer()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_background
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getBackground()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_on_background
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getOnBackground()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_surface
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getSurface()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_on_surface
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getOnSurface()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_surface_variant
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getSurfaceVariant()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_on_surface_variant
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getOnSurfaceVariant()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_surface_inverse
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getInverseSurface()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_on_surface_inverse
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getInverseOnSurface()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_surface_outline
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getOutline()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_error
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getError()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_on_error
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getOnError()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_error_container
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.getErrorContainer()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r3 = com.google.android.material.R.color.material_personalized_color_on_error_container
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = r0.getOnErrorContainer()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r3, r0)
            boolean r0 = r1.applyIfPossible(r5, r2)
            if (r0 != 0) goto L21f
            return
        L21c:
            com.google.android.material.color.ThemeUtils.applyThemeOverlay(r5, r0)
        L21f:
            com.google.android.material.color.DynamicColors$OnAppliedCallback r6 = r6.getOnAppliedCallback()
            r6.onApplied(r5)
        L226:
            return
    }

    private static int getDefaultThemeOverlay(@androidx.annotation.NonNull android.content.Context r1) {
            int[] r0 = com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            r0 = 0
            int r0 = r1.getResourceId(r0, r0)
            r1.recycle()
            return r0
    }

    @androidx.annotation.ChecksSdkIntAtLeast(api = 31)
    @android.annotation.SuppressLint({"DefaultLocale"})
    public static boolean isDynamicColorAvailable() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 31
            if (r0 >= r2) goto L8
            return r1
        L8:
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            r2 = 1
            if (r0 == 0) goto L10
            return r2
        L10:
            java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors$DeviceSupportCondition> r0 = com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r3 = r3.toLowerCase()
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.color.DynamicColors$DeviceSupportCondition r0 = (com.google.android.material.color.DynamicColors.DeviceSupportCondition) r0
            if (r0 != 0) goto L2e
            java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors$DeviceSupportCondition> r0 = com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_BRANDS
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r3 = r3.toLowerCase()
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.color.DynamicColors$DeviceSupportCondition r0 = (com.google.android.material.color.DynamicColors.DeviceSupportCondition) r0
        L2e:
            if (r0 == 0) goto L37
            boolean r0 = r0.isSupported()
            if (r0 == 0) goto L37
            r1 = 1
        L37:
            return r1
    }

    @androidx.annotation.NonNull
    public static android.content.Context wrapContextIfAvailable(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = 0
            android.content.Context r1 = wrapContextIfAvailable(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static android.content.Context wrapContextIfAvailable(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.StyleRes int r2) {
            boolean r0 = isDynamicColorAvailable()
            if (r0 != 0) goto L7
            return r1
        L7:
            if (r2 != 0) goto Ld
            int r2 = getDefaultThemeOverlay(r1)
        Ld:
            if (r2 != 0) goto L10
            goto L16
        L10:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r1, r2)
            r1 = r0
        L16:
            return r1
    }
}
