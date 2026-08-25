package pl.droidsonroids.gif.transforms;

/* JADX INFO: loaded from: classes2.dex */
public interface Transform {
    void onBoundsChange(android.graphics.Rect r1);

    void onDraw(android.graphics.Canvas r1, android.graphics.Paint r2, android.graphics.Bitmap r3);
}
