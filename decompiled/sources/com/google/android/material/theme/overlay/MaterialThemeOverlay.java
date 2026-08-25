package com.google.android.material.theme.overlay;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialThemeOverlay {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS = null;
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR = null;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 16842752(0x1010000, float:2.3693558E-38)
            r2 = 0
            r0[r2] = r1
            int r1 = com.google.android.material.R.attr.theme
            r3 = 1
            r0[r3] = r1
            com.google.android.material.theme.overlay.MaterialThemeOverlay.ANDROID_THEME_OVERLAY_ATTRS = r0
            int[] r0 = new int[r3]
            int r1 = com.google.android.material.R.attr.materialThemeOverlay
            r0[r2] = r1
            com.google.android.material.theme.overlay.MaterialThemeOverlay.MATERIAL_THEME_OVERLAY_ATTR = r0
            return
    }

    private MaterialThemeOverlay() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.StyleRes
    private static int obtainAndroidThemeOverlayId(@androidx.annotation.NonNull android.content.Context r2, android.util.AttributeSet r3) {
            int[] r0 = com.google.android.material.theme.overlay.MaterialThemeOverlay.ANDROID_THEME_OVERLAY_ATTRS
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r3 = 0
            int r0 = r2.getResourceId(r3, r3)
            r1 = 1
            int r3 = r2.getResourceId(r1, r3)
            r2.recycle()
            if (r0 == 0) goto L16
            goto L17
        L16:
            r0 = r3
        L17:
            return r0
    }

    @androidx.annotation.StyleRes
    private static int obtainMaterialThemeOverlayId(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, @androidx.annotation.AttrRes int r3, @androidx.annotation.StyleRes int r4) {
            int[] r0 = com.google.android.material.theme.overlay.MaterialThemeOverlay.MATERIAL_THEME_OVERLAY_ATTR
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r0, r3, r4)
            r2 = 0
            int r2 = r1.getResourceId(r2, r2)
            r1.recycle()
            return r2
    }

    @androidx.annotation.NonNull
    public static android.content.Context wrap(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, @androidx.annotation.AttrRes int r3, @androidx.annotation.StyleRes int r4) {
            int r3 = obtainMaterialThemeOverlayId(r1, r2, r3, r4)
            boolean r4 = r1 instanceof androidx.appcompat.view.ContextThemeWrapper
            r0 = 1
            if (r4 == 0) goto L14
            r4 = r1
            androidx.appcompat.view.ContextThemeWrapper r4 = (androidx.appcompat.view.ContextThemeWrapper) r4
            int r4 = r4.getThemeResId()
            if (r4 != r3) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            if (r3 == 0) goto L2d
            if (r4 == 0) goto L1a
            goto L2d
        L1a:
            androidx.appcompat.view.ContextThemeWrapper r4 = new androidx.appcompat.view.ContextThemeWrapper
            r4.<init>(r1, r3)
            int r1 = obtainAndroidThemeOverlayId(r1, r2)
            if (r1 == 0) goto L2c
            android.content.res.Resources$Theme r2 = r4.getTheme()
            r2.applyStyle(r1, r0)
        L2c:
            return r4
        L2d:
            return r1
    }
}
