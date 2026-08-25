package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
final class RoundedRectHelper {
    private RoundedRectHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setClipToRoundedOutline(android.view.View r2, boolean r3) {
            android.content.res.Resources r0 = r2.getResources()
            int r1 = androidx.leanback.R.dimen.lb_rounded_rect_corner_radius
            int r0 = r0.getDimensionPixelSize(r1)
            androidx.leanback.widget.RoundedRectHelperApi21.setClipToRoundedOutline(r2, r3, r0)
            return
    }
}
