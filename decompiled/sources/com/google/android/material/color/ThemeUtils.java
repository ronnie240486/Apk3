package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
final class ThemeUtils {
    private ThemeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyThemeOverlay(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.StyleRes int r3) {
            android.content.res.Resources$Theme r0 = r2.getTheme()
            r1 = 1
            r0.applyStyle(r3, r1)
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L17
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.res.Resources$Theme r2 = getWindowDecorViewTheme(r2)
            if (r2 == 0) goto L17
            r2.applyStyle(r3, r1)
        L17:
            return
    }

    @androidx.annotation.Nullable
    private static android.content.res.Resources.Theme getWindowDecorViewTheme(@androidx.annotation.NonNull android.app.Activity r0) {
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L17
            android.view.View r0 = r0.peekDecorView()
            if (r0 == 0) goto L17
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L17
            android.content.res.Resources$Theme r0 = r0.getTheme()
            return r0
        L17:
            r0 = 0
            return r0
    }
}
