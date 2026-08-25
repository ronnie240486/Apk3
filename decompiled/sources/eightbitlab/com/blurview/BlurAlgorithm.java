package eightbitlab.com.blurview;

/* JADX INFO: loaded from: classes3.dex */
public interface BlurAlgorithm {
    android.graphics.Bitmap blur(android.graphics.Bitmap r1, float r2);

    boolean canModifyBitmap();

    void destroy();

    @androidx.annotation.NonNull
    android.graphics.Bitmap.Config getSupportedBitmapConfig();
}
