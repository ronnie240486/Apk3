package eightbitlab.com.blurview;

/* JADX INFO: loaded from: classes2.dex */
class NoOpBlurAlgorithm implements eightbitlab.com.blurview.BlurAlgorithm {
    public NoOpBlurAlgorithm() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public android.graphics.Bitmap blur(android.graphics.Bitmap r1, float r2) {
            r0 = this;
            return r1
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public boolean canModifyBitmap() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public void destroy() {
            r0 = this;
            return
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    @androidx.annotation.NonNull
    public android.graphics.Bitmap.Config getSupportedBitmapConfig() {
            r1 = this;
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            return r0
    }
}
