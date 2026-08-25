package eightbitlab.com.blurview;

/* JADX INFO: loaded from: classes2.dex */
interface BlurController extends eightbitlab.com.blurview.BlurViewFacade {
    public static final float DEFAULT_BLUR_RADIUS = 16.0f;
    public static final float DEFAULT_SCALE_FACTOR = 8.0f;

    void destroy();

    boolean draw(android.graphics.Canvas r1);

    void updateBlurViewSize();
}
