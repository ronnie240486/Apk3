package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class TransitionUtils {
    private static final boolean HAS_IS_ATTACHED_TO_WINDOW = false;
    private static final boolean HAS_OVERLAY = false;
    private static final boolean HAS_PICTURE_BITMAP = false;
    private static final int MAX_IMAGE_SIZE = 1048576;

    /* JADX INFO: loaded from: classes3.dex */
    public static class MatrixEvaluator implements android.animation.TypeEvaluator<android.graphics.Matrix> {
        public final float[] mTempEndValues;
        public final android.graphics.Matrix mTempMatrix;
        public final float[] mTempStartValues;

        public MatrixEvaluator() {
                r2 = this;
                r2.<init>()
                r0 = 9
                float[] r1 = new float[r0]
                r2.mTempStartValues = r1
                float[] r0 = new float[r0]
                r2.mTempEndValues = r0
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r2.mTempMatrix = r0
                return
        }

        /* JADX INFO: renamed from: evaluate, reason: avoid collision after fix types in other method */
        public android.graphics.Matrix evaluate2(float r4, android.graphics.Matrix r5, android.graphics.Matrix r6) {
                r3 = this;
                float[] r0 = r3.mTempStartValues
                r5.getValues(r0)
                float[] r5 = r3.mTempEndValues
                r6.getValues(r5)
                r5 = 0
            Lb:
                r6 = 9
                if (r5 >= r6) goto L22
                float[] r6 = r3.mTempEndValues
                r0 = r6[r5]
                float[] r1 = r3.mTempStartValues
                r2 = r1[r5]
                float r0 = r0 - r2
                r1 = r1[r5]
                float r0 = r0 * r4
                float r0 = r0 + r1
                r6[r5] = r0
                int r5 = r5 + 1
                goto Lb
            L22:
                android.graphics.Matrix r4 = r3.mTempMatrix
                float[] r5 = r3.mTempEndValues
                r4.setValues(r5)
                android.graphics.Matrix r4 = r3.mTempMatrix
                return r4
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ android.graphics.Matrix evaluate(float r1, android.graphics.Matrix r2, android.graphics.Matrix r3) {
                r0 = this;
                android.graphics.Matrix r2 = (android.graphics.Matrix) r2
                android.graphics.Matrix r3 = (android.graphics.Matrix) r3
                android.graphics.Matrix r1 = r0.evaluate2(r1, r2, r3)
                return r1
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            androidx.transition.TransitionUtils.HAS_IS_ATTACHED_TO_WINDOW = r1
            androidx.transition.TransitionUtils.HAS_OVERLAY = r1
            r2 = 28
            if (r0 < r2) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            androidx.transition.TransitionUtils.HAS_PICTURE_BITMAP = r1
            return
    }

    private TransitionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.view.View copyViewImage(android.view.ViewGroup r7, android.view.View r8, android.view.View r9) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r9.getScrollX()
            int r1 = -r1
            float r1 = (float) r1
            int r9 = r9.getScrollY()
            int r9 = -r9
            float r9 = (float) r9
            r0.setTranslate(r1, r9)
            androidx.transition.ViewUtils.transformMatrixToGlobal(r8, r0)
            androidx.transition.ViewUtils.transformMatrixToLocal(r7, r0)
            android.graphics.RectF r9 = new android.graphics.RectF
            int r1 = r8.getWidth()
            float r1 = (float) r1
            int r2 = r8.getHeight()
            float r2 = (float) r2
            r3 = 0
            r9.<init>(r3, r3, r1, r2)
            r0.mapRect(r9)
            float r1 = r9.left
            int r1 = java.lang.Math.round(r1)
            float r2 = r9.top
            int r2 = java.lang.Math.round(r2)
            float r3 = r9.right
            int r3 = java.lang.Math.round(r3)
            float r4 = r9.bottom
            int r4 = java.lang.Math.round(r4)
            android.widget.ImageView r5 = new android.widget.ImageView
            android.content.Context r6 = r8.getContext()
            r5.<init>(r6)
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            r5.setScaleType(r6)
            android.graphics.Bitmap r7 = createViewBitmap(r8, r0, r9, r7)
            if (r7 == 0) goto L5c
            r5.setImageBitmap(r7)
        L5c:
            int r7 = r3 - r1
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            int r9 = r4 - r2
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r8)
            r5.measure(r7, r8)
            r5.layout(r1, r2, r3, r4)
            return r5
    }

    private static android.graphics.Bitmap createViewBitmap(android.view.View r9, android.graphics.Matrix r10, android.graphics.RectF r11, android.view.ViewGroup r12) {
            boolean r0 = androidx.transition.TransitionUtils.HAS_IS_ATTACHED_TO_WINDOW
            r1 = 0
            if (r0 == 0) goto L13
            boolean r0 = r9.isAttachedToWindow()
            r0 = r0 ^ 1
            if (r12 != 0) goto Le
            goto L14
        Le:
            boolean r2 = r12.isAttachedToWindow()
            goto L15
        L13:
            r0 = 0
        L14:
            r2 = 0
        L15:
            boolean r3 = androidx.transition.TransitionUtils.HAS_OVERLAY
            r4 = 0
            if (r3 == 0) goto L31
            if (r0 == 0) goto L31
            if (r2 != 0) goto L1f
            return r4
        L1f:
            android.view.ViewParent r1 = r9.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.indexOfChild(r9)
            android.view.ViewGroupOverlay r5 = r12.getOverlay()
            r5.add(r9)
            goto L33
        L31:
            r1 = r4
            r2 = 0
        L33:
            float r5 = r11.width()
            int r5 = java.lang.Math.round(r5)
            float r6 = r11.height()
            int r6 = java.lang.Math.round(r6)
            if (r5 <= 0) goto L99
            if (r6 <= 0) goto L99
            r4 = 1065353216(0x3f800000, float:1.0)
            r7 = 1233125376(0x49800000, float:1048576.0)
            int r8 = r5 * r6
            float r8 = (float) r8
            float r7 = r7 / r8
            float r4 = java.lang.Math.min(r4, r7)
            float r5 = (float) r5
            float r5 = r5 * r4
            int r5 = java.lang.Math.round(r5)
            float r6 = (float) r6
            float r6 = r6 * r4
            int r6 = java.lang.Math.round(r6)
            float r7 = r11.left
            float r7 = -r7
            float r11 = r11.top
            float r11 = -r11
            r10.postTranslate(r7, r11)
            r10.postScale(r4, r4)
            boolean r11 = androidx.transition.TransitionUtils.HAS_PICTURE_BITMAP
            if (r11 == 0) goto L88
            android.graphics.Picture r11 = new android.graphics.Picture
            r11.<init>()
            android.graphics.Canvas r4 = r11.beginRecording(r5, r6)
            r4.concat(r10)
            r9.draw(r4)
            r11.endRecording()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r11)
            goto L99
        L88:
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5, r6, r11)
            android.graphics.Canvas r11 = new android.graphics.Canvas
            r11.<init>(r4)
            r11.concat(r10)
            r9.draw(r11)
        L99:
            if (r3 == 0) goto La7
            if (r0 == 0) goto La7
            android.view.ViewGroupOverlay r10 = r12.getOverlay()
            r10.remove(r9)
            r1.addView(r9, r2)
        La7:
            return r4
    }

    public static android.animation.Animator mergeAnimators(android.animation.Animator r3, android.animation.Animator r4) {
            if (r3 != 0) goto L3
            return r4
        L3:
            if (r4 != 0) goto L6
            return r3
        L6:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1 = 2
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r0.playTogether(r1)
            return r0
    }
}
