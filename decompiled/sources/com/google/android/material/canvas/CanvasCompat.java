package com.google.android.material.canvas;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class CanvasCompat {
    private CanvasCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int saveLayerAlpha(@androidx.annotation.NonNull android.graphics.Canvas r7, float r8, float r9, float r10, float r11, int r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 <= r1) goto Lb
            int r7 = r7.saveLayerAlpha(r8, r9, r10, r11, r12)
            return r7
        Lb:
            r6 = 31
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int r7 = r0.saveLayerAlpha(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static int saveLayerAlpha(@androidx.annotation.NonNull android.graphics.Canvas r2, @androidx.annotation.Nullable android.graphics.RectF r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 <= r1) goto Lb
            int r2 = r2.saveLayerAlpha(r3, r4)
            return r2
        Lb:
            r0 = 31
            int r2 = r2.saveLayerAlpha(r3, r4, r0)
            return r2
    }
}
