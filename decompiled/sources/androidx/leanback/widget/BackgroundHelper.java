package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class BackgroundHelper {
    private BackgroundHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setBackgroundPreservingAlpha(android.view.View r1, android.graphics.drawable.Drawable r2) {
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 == 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            int r0 = r0.getAlpha()
            r2.setAlpha(r0)
        L11:
            r1.setBackground(r2)
            return
    }
}
