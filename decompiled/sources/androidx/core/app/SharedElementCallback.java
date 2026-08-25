package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SharedElementCallback {
    private static final java.lang.String BUNDLE_SNAPSHOT_BITMAP = "sharedElement:snapshot:bitmap";
    private static final java.lang.String BUNDLE_SNAPSHOT_IMAGE_MATRIX = "sharedElement:snapshot:imageMatrix";
    private static final java.lang.String BUNDLE_SNAPSHOT_IMAGE_SCALETYPE = "sharedElement:snapshot:imageScaleType";
    private static final int MAX_IMAGE_SIZE = 1048576;
    private android.graphics.Matrix mTempMatrix;

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnSharedElementsReadyListener {
        void onSharedElementsReady();
    }

    public SharedElementCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.graphics.Bitmap createDrawableBitmap(android.graphics.drawable.Drawable r9) {
            int r0 = r9.getIntrinsicWidth()
            int r1 = r9.getIntrinsicHeight()
            if (r0 <= 0) goto L52
            if (r1 > 0) goto Ld
            goto L52
        Ld:
            r2 = 1233125376(0x49800000, float:1048576.0)
            int r3 = r0 * r1
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r3, r2)
            boolean r4 = r9 instanceof android.graphics.drawable.BitmapDrawable
            if (r4 == 0) goto L28
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L28
            android.graphics.drawable.BitmapDrawable r9 = (android.graphics.drawable.BitmapDrawable) r9
            android.graphics.Bitmap r9 = r9.getBitmap()
            return r9
        L28:
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = (int) r0
            float r1 = (float) r1
            float r1 = r1 * r2
            int r1 = (int) r1
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            android.graphics.Rect r4 = r9.getBounds()
            int r5 = r4.left
            int r6 = r4.top
            int r7 = r4.right
            int r4 = r4.bottom
            r8 = 0
            r9.setBounds(r8, r8, r0, r1)
            r9.draw(r3)
            r9.setBounds(r5, r6, r7, r4)
            return r2
        L52:
            r9 = 0
            return r9
    }

    public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View r6, android.graphics.Matrix r7, android.graphics.RectF r8) {
            r5 = this;
            boolean r0 = r6 instanceof android.widget.ImageView
            if (r0 == 0) goto L4c
            r0 = r6
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r1 == 0) goto L4c
            if (r2 != 0) goto L4c
            android.graphics.Bitmap r1 = createDrawableBitmap(r1)
            if (r1 == 0) goto L4c
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "sharedElement:snapshot:bitmap"
            r6.putParcelable(r7, r1)
            android.widget.ImageView$ScaleType r7 = r0.getScaleType()
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "sharedElement:snapshot:imageScaleType"
            r6.putString(r8, r7)
            android.widget.ImageView$ScaleType r7 = r0.getScaleType()
            android.widget.ImageView$ScaleType r8 = android.widget.ImageView.ScaleType.MATRIX
            if (r7 != r8) goto L4b
            android.graphics.Matrix r7 = r0.getImageMatrix()
            r8 = 9
            float[] r8 = new float[r8]
            r7.getValues(r8)
            java.lang.String r7 = "sharedElement:snapshot:imageMatrix"
            r6.putFloatArray(r7, r8)
        L4b:
            return r6
        L4c:
            float r0 = r8.width()
            int r0 = java.lang.Math.round(r0)
            float r1 = r8.height()
            int r1 = java.lang.Math.round(r1)
            r2 = 0
            if (r0 <= 0) goto La8
            if (r1 <= 0) goto La8
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1233125376(0x49800000, float:1048576.0)
            int r4 = r0 * r1
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = java.lang.Math.min(r2, r3)
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = (int) r0
            float r1 = (float) r1
            float r1 = r1 * r2
            int r1 = (int) r1
            android.graphics.Matrix r3 = r5.mTempMatrix
            if (r3 != 0) goto L80
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r5.mTempMatrix = r3
        L80:
            android.graphics.Matrix r3 = r5.mTempMatrix
            r3.set(r7)
            android.graphics.Matrix r7 = r5.mTempMatrix
            float r3 = r8.left
            float r3 = -r3
            float r8 = r8.top
            float r8 = -r8
            r7.postTranslate(r3, r8)
            android.graphics.Matrix r7 = r5.mTempMatrix
            r7.postScale(r2, r2)
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r7)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r2)
            android.graphics.Matrix r8 = r5.mTempMatrix
            r7.concat(r8)
            r6.draw(r7)
        La8:
            return r2
    }

    public android.view.View onCreateSnapshotView(android.content.Context r3, android.os.Parcelable r4) {
            r2 = this;
            boolean r0 = r4 instanceof android.os.Bundle
            r1 = 0
            if (r0 == 0) goto L44
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r0 = "sharedElement:snapshot:bitmap"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 != 0) goto L13
            return r1
        L13:
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r3)
            r1.setImageBitmap(r0)
            java.lang.String r3 = "sharedElement:snapshot:imageScaleType"
            java.lang.String r3 = r4.getString(r3)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.valueOf(r3)
            r1.setScaleType(r3)
            android.widget.ImageView$ScaleType r3 = r1.getScaleType()
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            if (r3 != r0) goto L52
            java.lang.String r3 = "sharedElement:snapshot:imageMatrix"
            float[] r3 = r4.getFloatArray(r3)
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r4.setValues(r3)
            r1.setImageMatrix(r4)
            goto L52
        L44:
            boolean r0 = r4 instanceof android.graphics.Bitmap
            if (r0 == 0) goto L52
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r3)
            r1.setImageBitmap(r4)
        L52:
            return r1
    }

    public void onMapSharedElements(java.util.List<java.lang.String> r1, java.util.Map<java.lang.String, android.view.View> r2) {
            r0 = this;
            return
    }

    public void onRejectSharedElements(java.util.List<android.view.View> r1) {
            r0 = this;
            return
    }

    public void onSharedElementEnd(java.util.List<java.lang.String> r1, java.util.List<android.view.View> r2, java.util.List<android.view.View> r3) {
            r0 = this;
            return
    }

    public void onSharedElementStart(java.util.List<java.lang.String> r1, java.util.List<android.view.View> r2, java.util.List<android.view.View> r3) {
            r0 = this;
            return
    }

    public void onSharedElementsArrived(java.util.List<java.lang.String> r1, java.util.List<android.view.View> r2, androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener r3) {
            r0 = this;
            r3.onSharedElementsReady()
            return
    }
}
