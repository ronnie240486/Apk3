package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RequiresApi(18)
class ViewOverlayApi18 implements androidx.transition.ViewOverlayImpl {
    private final android.view.ViewOverlay mViewOverlay;

    public ViewOverlayApi18(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            r0.<init>()
            android.view.ViewOverlay r1 = r1.getOverlay()
            r0.mViewOverlay = r1
            return
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void add(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewOverlay r0 = r1.mViewOverlay
            r0.add(r2)
            return
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void remove(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewOverlay r0 = r1.mViewOverlay
            r0.remove(r2)
            return
    }
}
