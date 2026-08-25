package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
final class ForegroundHelper {
    private ForegroundHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.drawable.Drawable getForeground(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.graphics.drawable.Drawable r2 = r2.getForeground()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static void setForeground(android.view.View r2, android.graphics.drawable.Drawable r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L9
            r2.setForeground(r3)
        L9:
            return
    }
}
