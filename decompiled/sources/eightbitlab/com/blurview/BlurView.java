package eightbitlab.com.blurview;

/* JADX INFO: loaded from: classes.dex */
public class BlurView extends android.widget.FrameLayout {
    private static final java.lang.String TAG = null;
    public eightbitlab.com.blurview.BlurController blurController;

    @androidx.annotation.ColorInt
    private int overlayColor;

    static {
            java.lang.Class<eightbitlab.com.blurview.BlurView> r0 = eightbitlab.com.blurview.BlurView.class
            java.lang.String r0 = "BlurView"
            eightbitlab.com.blurview.BlurView.TAG = r0
            return
    }

    public BlurView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            eightbitlab.com.blurview.NoOpController r2 = new eightbitlab.com.blurview.NoOpController
            r2.<init>()
            r1.blurController = r2
            r2 = 0
            r0 = 0
            r1.init(r2, r0)
            return
    }

    public BlurView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            eightbitlab.com.blurview.NoOpController r1 = new eightbitlab.com.blurview.NoOpController
            r1.<init>()
            r0.blurController = r1
            r1 = 0
            r0.init(r2, r1)
            return
    }

    public BlurView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            eightbitlab.com.blurview.NoOpController r1 = new eightbitlab.com.blurview.NoOpController
            r1.<init>()
            r0.blurController = r1
            r0.init(r2, r3)
            return
    }

    private void init(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int[] r1 = eightbitlab.com.blurview.R.styleable.BlurView
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = eightbitlab.com.blurview.R.styleable.BlurView_blurOverlayColor
            int r5 = r4.getColor(r5, r2)
            r3.overlayColor = r5
            r4.recycle()
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            eightbitlab.com.blurview.BlurController r0 = r1.blurController
            boolean r0 = r0.draw(r2)
            if (r0 == 0) goto Lb
            super.draw(r2)
        Lb:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            boolean r0 = r2.isHardwareAccelerated()
            if (r0 != 0) goto L11
            java.lang.String r0 = eightbitlab.com.blurview.BlurView.TAG
            java.lang.String r1 = "BlurView can't be used in not hardware-accelerated window!"
            android.util.Log.e(r0, r1)
            goto L17
        L11:
            eightbitlab.com.blurview.BlurController r0 = r2.blurController
            r1 = 1
            r0.setBlurAutoUpdate(r1)
        L17:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            eightbitlab.com.blurview.BlurController r0 = r2.blurController
            r1 = 0
            r0.setBlurAutoUpdate(r1)
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            eightbitlab.com.blurview.BlurController r1 = r0.blurController
            r1.updateBlurViewSize()
            return
    }

    public eightbitlab.com.blurview.BlurViewFacade setBlurAutoUpdate(boolean r2) {
            r1 = this;
            eightbitlab.com.blurview.BlurController r0 = r1.blurController
            eightbitlab.com.blurview.BlurViewFacade r2 = r0.setBlurAutoUpdate(r2)
            return r2
    }

    public eightbitlab.com.blurview.BlurViewFacade setBlurEnabled(boolean r2) {
            r1 = this;
            eightbitlab.com.blurview.BlurController r0 = r1.blurController
            eightbitlab.com.blurview.BlurViewFacade r2 = r0.setBlurEnabled(r2)
            return r2
    }

    public eightbitlab.com.blurview.BlurViewFacade setBlurRadius(float r2) {
            r1 = this;
            eightbitlab.com.blurview.BlurController r0 = r1.blurController
            eightbitlab.com.blurview.BlurViewFacade r2 = r0.setBlurRadius(r2)
            return r2
    }

    public eightbitlab.com.blurview.BlurViewFacade setOverlayColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            r1.overlayColor = r2
            eightbitlab.com.blurview.BlurController r0 = r1.blurController
            eightbitlab.com.blurview.BlurViewFacade r2 = r0.setOverlayColor(r2)
            return r2
    }

    public eightbitlab.com.blurview.BlurViewFacade setupWith(@androidx.annotation.NonNull android.view.ViewGroup r3) {
            r2 = this;
            eightbitlab.com.blurview.BlockingBlurController r0 = new eightbitlab.com.blurview.BlockingBlurController
            int r1 = r2.overlayColor
            r0.<init>(r2, r3, r1)
            eightbitlab.com.blurview.BlurController r3 = r2.blurController
            r3.destroy()
            r2.blurController = r0
            return r0
    }
}
