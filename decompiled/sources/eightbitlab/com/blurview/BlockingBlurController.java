package eightbitlab.com.blurview;

/* JADX INFO: loaded from: classes2.dex */
final class BlockingBlurController implements eightbitlab.com.blurview.BlurController {
    private eightbitlab.com.blurview.BlurAlgorithm blurAlgorithm;
    private boolean blurEnabled;
    private float blurRadius;
    public final android.view.View blurView;
    private final int[] blurViewLocation;
    private final android.view.ViewTreeObserver.OnPreDrawListener drawListener;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable frameClearDrawable;
    private boolean hasFixedTransformationMatrix;
    private boolean initialized;
    private android.graphics.Bitmap internalBitmap;
    private eightbitlab.com.blurview.BlurViewCanvas internalCanvas;
    private int overlayColor;
    private final android.graphics.Paint paint;
    private final int[] rootLocation;
    private final android.view.ViewGroup rootView;
    private float scaleFactor;
    private final eightbitlab.com.blurview.SizeScaler sizeScaler;


    public BlockingBlurController(@androidx.annotation.NonNull android.view.View r4, @androidx.annotation.NonNull android.view.ViewGroup r5, @androidx.annotation.ColorInt int r6) {
            r3 = this;
            r3.<init>()
            r0 = 1098907648(0x41800000, float:16.0)
            r3.blurRadius = r0
            r0 = 2
            int[] r1 = new int[r0]
            r3.rootLocation = r1
            int[] r1 = new int[r0]
            r3.blurViewLocation = r1
            eightbitlab.com.blurview.SizeScaler r1 = new eightbitlab.com.blurview.SizeScaler
            r2 = 1090519040(0x41000000, float:8.0)
            r1.<init>(r2)
            r3.sizeScaler = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.scaleFactor = r1
            eightbitlab.com.blurview.BlockingBlurController$1 r1 = new eightbitlab.com.blurview.BlockingBlurController$1
            r1.<init>(r3)
            r3.drawListener = r1
            r1 = 1
            r3.blurEnabled = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r0)
            r3.paint = r1
            r3.rootView = r5
            r3.blurView = r4
            r3.overlayColor = r6
            eightbitlab.com.blurview.NoOpBlurAlgorithm r5 = new eightbitlab.com.blurview.NoOpBlurAlgorithm
            r5.<init>()
            r3.blurAlgorithm = r5
            int r5 = r4.getMeasuredWidth()
            int r4 = r4.getMeasuredHeight()
            r3.init(r5, r4)
            return
    }

    private void allocateBitmap(int r2, int r3) {
            r1 = this;
            eightbitlab.com.blurview.SizeScaler r0 = r1.sizeScaler
            eightbitlab.com.blurview.SizeScaler$Size r2 = r0.scale(r2, r3)
            float r3 = r2.scaleFactor
            r1.scaleFactor = r3
            int r3 = r2.width
            int r2 = r2.height
            eightbitlab.com.blurview.BlurAlgorithm r0 = r1.blurAlgorithm
            android.graphics.Bitmap$Config r0 = r0.getSupportedBitmapConfig()
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r3, r2, r0)
            r1.internalBitmap = r2
            return
    }

    private void blurAndSave() {
            r3 = this;
            eightbitlab.com.blurview.BlurAlgorithm r0 = r3.blurAlgorithm
            android.graphics.Bitmap r1 = r3.internalBitmap
            float r2 = r3.blurRadius
            android.graphics.Bitmap r0 = r0.blur(r1, r2)
            r3.internalBitmap = r0
            eightbitlab.com.blurview.BlurAlgorithm r0 = r3.blurAlgorithm
            boolean r0 = r0.canModifyBitmap()
            if (r0 != 0) goto L1b
            eightbitlab.com.blurview.BlurViewCanvas r0 = r3.internalCanvas
            android.graphics.Bitmap r1 = r3.internalBitmap
            r0.setBitmap(r1)
        L1b:
            return
    }

    private void setupInternalCanvasMatrix() {
            r4 = this;
            android.view.ViewGroup r0 = r4.rootView
            int[] r1 = r4.rootLocation
            r0.getLocationOnScreen(r1)
            android.view.View r0 = r4.blurView
            int[] r1 = r4.blurViewLocation
            r0.getLocationOnScreen(r1)
            int[] r0 = r4.blurViewLocation
            r1 = 0
            r2 = r0[r1]
            int[] r3 = r4.rootLocation
            r1 = r3[r1]
            int r2 = r2 - r1
            r1 = 1
            r0 = r0[r1]
            r1 = r3[r1]
            int r0 = r0 - r1
            int r1 = -r2
            float r1 = (float) r1
            float r2 = r4.scaleFactor
            float r1 = r1 / r2
            int r0 = -r0
            float r0 = (float) r0
            float r0 = r0 / r2
            eightbitlab.com.blurview.BlurViewCanvas r2 = r4.internalCanvas
            r2.translate(r1, r0)
            eightbitlab.com.blurview.BlurViewCanvas r0 = r4.internalCanvas
            float r1 = r4.scaleFactor
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r2 / r1
            float r2 = r2 / r1
            r0.scale(r3, r2)
            return
    }

    @Override // eightbitlab.com.blurview.BlurController
    public void destroy() {
            r2 = this;
            r0 = 0
            r2.setBlurAutoUpdate(r0)
            eightbitlab.com.blurview.BlurAlgorithm r1 = r2.blurAlgorithm
            r1.destroy()
            r2.initialized = r0
            return
    }

    @Override // eightbitlab.com.blurview.BlurController
    public boolean draw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.blurEnabled
            r1 = 1
            if (r0 == 0) goto L2d
            boolean r0 = r4.initialized
            if (r0 != 0) goto La
            goto L2d
        La:
            boolean r0 = r5 instanceof eightbitlab.com.blurview.BlurViewCanvas
            if (r0 == 0) goto L10
            r5 = 0
            return r5
        L10:
            r4.updateBlur()
            r5.save()
            float r0 = r4.scaleFactor
            r5.scale(r0, r0)
            android.graphics.Bitmap r0 = r4.internalBitmap
            android.graphics.Paint r2 = r4.paint
            r3 = 0
            r5.drawBitmap(r0, r3, r3, r2)
            r5.restore()
            int r0 = r4.overlayColor
            if (r0 == 0) goto L2d
            r5.drawColor(r0)
        L2d:
            return r1
    }

    public final void init(int r4, int r5) {
            r3 = this;
            eightbitlab.com.blurview.SizeScaler r0 = r3.sizeScaler
            boolean r0 = r0.isZeroSized(r4, r5)
            r1 = 1
            if (r0 == 0) goto Lf
            android.view.View r4 = r3.blurView
            r4.setWillNotDraw(r1)
            return
        Lf:
            android.view.View r0 = r3.blurView
            r2 = 0
            r0.setWillNotDraw(r2)
            r3.allocateBitmap(r4, r5)
            eightbitlab.com.blurview.BlurViewCanvas r4 = new eightbitlab.com.blurview.BlurViewCanvas
            android.graphics.Bitmap r5 = r3.internalBitmap
            r4.<init>(r5)
            r3.internalCanvas = r4
            r3.initialized = r1
            boolean r4 = r3.hasFixedTransformationMatrix
            if (r4 == 0) goto L2a
            r3.setupInternalCanvasMatrix()
        L2a:
            return
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public eightbitlab.com.blurview.BlurViewFacade setBlurAlgorithm(eightbitlab.com.blurview.BlurAlgorithm r1) {
            r0 = this;
            r0.blurAlgorithm = r1
            return r0
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public eightbitlab.com.blurview.BlurViewFacade setBlurAutoUpdate(boolean r3) {
            r2 = this;
            android.view.View r0 = r2.blurView
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.drawListener
            r0.removeOnPreDrawListener(r1)
            if (r3 == 0) goto L18
            android.view.View r3 = r2.blurView
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r2.drawListener
            r3.addOnPreDrawListener(r0)
        L18:
            return r2
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public eightbitlab.com.blurview.BlurViewFacade setBlurEnabled(boolean r1) {
            r0 = this;
            r0.blurEnabled = r1
            r0.setBlurAutoUpdate(r1)
            android.view.View r1 = r0.blurView
            r1.invalidate()
            return r0
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public eightbitlab.com.blurview.BlurViewFacade setBlurRadius(float r1) {
            r0 = this;
            r0.blurRadius = r1
            return r0
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public eightbitlab.com.blurview.BlurViewFacade setFrameClearDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.frameClearDrawable = r1
            return r0
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public eightbitlab.com.blurview.BlurViewFacade setHasFixedTransformationMatrix(boolean r1) {
            r0 = this;
            r0.hasFixedTransformationMatrix = r1
            return r0
    }

    @Override // eightbitlab.com.blurview.BlurViewFacade
    public eightbitlab.com.blurview.BlurViewFacade setOverlayColor(int r2) {
            r1 = this;
            int r0 = r1.overlayColor
            if (r0 == r2) goto Lb
            r1.overlayColor = r2
            android.view.View r2 = r1.blurView
            r2.invalidate()
        Lb:
            return r1
    }

    public final void updateBlur() {
            r2 = this;
            boolean r0 = r2.blurEnabled
            if (r0 == 0) goto L3c
            boolean r0 = r2.initialized
            if (r0 != 0) goto L9
            goto L3c
        L9:
            android.graphics.drawable.Drawable r0 = r2.frameClearDrawable
            if (r0 != 0) goto L14
            android.graphics.Bitmap r0 = r2.internalBitmap
            r1 = 0
            r0.eraseColor(r1)
            goto L19
        L14:
            eightbitlab.com.blurview.BlurViewCanvas r1 = r2.internalCanvas
            r0.draw(r1)
        L19:
            boolean r0 = r2.hasFixedTransformationMatrix
            if (r0 == 0) goto L25
            android.view.ViewGroup r0 = r2.rootView
            eightbitlab.com.blurview.BlurViewCanvas r1 = r2.internalCanvas
            r0.draw(r1)
            goto L39
        L25:
            eightbitlab.com.blurview.BlurViewCanvas r0 = r2.internalCanvas
            r0.save()
            r2.setupInternalCanvasMatrix()
            android.view.ViewGroup r0 = r2.rootView
            eightbitlab.com.blurview.BlurViewCanvas r1 = r2.internalCanvas
            r0.draw(r1)
            eightbitlab.com.blurview.BlurViewCanvas r0 = r2.internalCanvas
            r0.restore()
        L39:
            r2.blurAndSave()
        L3c:
            return
    }

    @Override // eightbitlab.com.blurview.BlurController
    public void updateBlurViewSize() {
            r2 = this;
            android.view.View r0 = r2.blurView
            int r0 = r0.getMeasuredWidth()
            android.view.View r1 = r2.blurView
            int r1 = r1.getMeasuredHeight()
            r2.init(r0, r1)
            return
    }
}
