package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(21)
class TransitionUtils {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final int PATH_TYPE_ARC = 1;
    private static final int PATH_TYPE_LINEAR = 0;
    private static final android.graphics.RectF transformAlphaRectF = null;


    /* JADX INFO: loaded from: classes.dex */
    public interface CanvasOperation {
        void run(android.graphics.Canvas r1);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface CornerSizeBinaryOperator {
        @androidx.annotation.NonNull
        com.google.android.material.shape.CornerSize apply(@androidx.annotation.NonNull com.google.android.material.shape.CornerSize r1, @androidx.annotation.NonNull com.google.android.material.shape.CornerSize r2);
    }

    public static /* synthetic */ com.google.android.material.shape.CornerSize $r8$lambda$xRre0GXlu2BevnrBPOrArkpic2E(android.graphics.RectF r0, com.google.android.material.shape.CornerSize r1) {
            com.google.android.material.shape.CornerSize r0 = lambda$convertToRelativeCornerSizes$0(r0, r1)
            return r0
    }

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            com.google.android.material.transition.platform.TransitionUtils.transformAlphaRectF = r0
            return
    }

    private TransitionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.view.View findAncestorById(android.view.View r2, @androidx.annotation.IdRes int r3) {
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r0 = r0.getResourceName(r3)
        L8:
            if (r2 == 0) goto L1c
            int r1 = r2.getId()
            if (r1 != r3) goto L11
            return r2
        L11:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L1c
            android.view.View r2 = (android.view.View) r2
            goto L8
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = " is not a valid ancestor"
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
            r2.<init>(r3)
            throw r2
    }

    public static android.graphics.RectF getLocationOnScreen(android.view.View r4) {
            r0 = 2
            int[] r0 = new int[r0]
            r4.getLocationOnScreen(r0)
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r0 = r0[r2]
            int r2 = r4.getWidth()
            int r2 = r2 + r1
            int r4 = r4.getHeight()
            int r4 = r4 + r0
            android.graphics.RectF r3 = new android.graphics.RectF
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = (float) r2
            float r4 = (float) r4
            r3.<init>(r1, r0, r2, r4)
            return r3
    }

    private static boolean isShapeAppearanceSignificant(com.google.android.material.shape.ShapeAppearanceModel r2, android.graphics.RectF r3) {
            com.google.android.material.shape.CornerSize r0 = r2.getTopLeftCornerSize()
            float r0 = r0.getCornerSize(r3)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            com.google.android.material.shape.CornerSize r0 = r2.getTopRightCornerSize()
            float r0 = r0.getCornerSize(r3)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            com.google.android.material.shape.CornerSize r0 = r2.getBottomRightCornerSize()
            float r0 = r0.getCornerSize(r3)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            com.google.android.material.shape.CornerSize r2 = r2.getBottomLeftCornerSize()
            float r2 = r2.getCornerSize(r3)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L32
            goto L34
        L32:
            r2 = 0
            goto L35
        L34:
            r2 = 1
        L35:
            return r2
    }

    private static /* synthetic */ com.google.android.material.shape.CornerSize lambda$convertToRelativeCornerSizes$0(android.graphics.RectF r0, com.google.android.material.shape.CornerSize r1) {
            com.google.android.material.shape.RelativeCornerSize r0 = com.google.android.material.shape.RelativeCornerSize.createFromCornerSize(r0, r1)
            return r0
    }

    public static float lerp(float r6, float r7, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r8, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r9, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r10) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            float r6 = lerp(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static float lerp(float r0, float r1, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3, @androidx.annotation.FloatRange(from = 0.0d) float r4, boolean r5) {
            if (r5 == 0) goto L12
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 < 0) goto Ld
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L12
        Ld:
            float r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r4, r0)
            return r0
        L12:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 >= 0) goto L17
            return r0
        L17:
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 <= 0) goto L1c
            return r1
        L1c:
            float r4 = r4 - r2
            float r3 = r3 - r2
            float r4 = r4 / r3
            float r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0, r4, r0)
            return r0
    }

    public static int lerp(int r1, int r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r5) {
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r1
        L5:
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 <= 0) goto La
            return r2
        La:
            float r1 = (float) r1
            float r2 = (float) r2
            float r5 = r5 - r3
            float r4 = r4 - r3
            float r5 = r5 / r4
            float r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r5, r1)
            int r1 = (int) r1
            return r1
    }

    public static com.google.android.material.shape.ShapeAppearanceModel lerp(com.google.android.material.shape.ShapeAppearanceModel r7, com.google.android.material.shape.ShapeAppearanceModel r8, android.graphics.RectF r9, android.graphics.RectF r10, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r11, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r12, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r13) {
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r7
        L5:
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r0 <= 0) goto La
            return r8
        La:
            com.google.android.material.transition.platform.TransitionUtils$1 r0 = new com.google.android.material.transition.platform.TransitionUtils$1
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            boolean r9 = isShapeAppearanceSignificant(r7, r9)
            if (r9 == 0) goto L1d
            r9 = r7
            goto L1e
        L1d:
            r9 = r8
        L1e:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r9 = r9.toBuilder()
            com.google.android.material.shape.CornerSize r10 = r7.getTopLeftCornerSize()
            com.google.android.material.shape.CornerSize r11 = r8.getTopLeftCornerSize()
            com.google.android.material.shape.CornerSize r10 = r0.apply(r10, r11)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r9 = r9.setTopLeftCornerSize(r10)
            com.google.android.material.shape.CornerSize r10 = r7.getTopRightCornerSize()
            com.google.android.material.shape.CornerSize r11 = r8.getTopRightCornerSize()
            com.google.android.material.shape.CornerSize r10 = r0.apply(r10, r11)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r9 = r9.setTopRightCornerSize(r10)
            com.google.android.material.shape.CornerSize r10 = r7.getBottomLeftCornerSize()
            com.google.android.material.shape.CornerSize r11 = r8.getBottomLeftCornerSize()
            com.google.android.material.shape.CornerSize r10 = r0.apply(r10, r11)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r9 = r9.setBottomLeftCornerSize(r10)
            com.google.android.material.shape.CornerSize r7 = r7.getBottomRightCornerSize()
            com.google.android.material.shape.CornerSize r8 = r8.getBottomRightCornerSize()
            com.google.android.material.shape.CornerSize r7 = r0.apply(r7, r8)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r7 = r9.setBottomRightCornerSize(r7)
            com.google.android.material.shape.ShapeAppearanceModel r7 = r7.build()
            return r7
    }

    public static boolean maybeApplyThemeDuration(android.transition.Transition r5, android.content.Context r6, @androidx.annotation.AttrRes int r7) {
            if (r7 == 0) goto L19
            long r0 = r5.getDuration()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L19
            r0 = -1
            int r6 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r6, r7, r0)
            if (r6 == r0) goto L19
            long r6 = (long) r6
            r5.setDuration(r6)
            r5 = 1
            return r5
        L19:
            r5 = 0
            return r5
    }

    private static int saveLayerAlphaCompat(android.graphics.Canvas r1, android.graphics.Rect r2, int r3) {
            android.graphics.RectF r0 = com.google.android.material.transition.platform.TransitionUtils.transformAlphaRectF
            r0.set(r2)
            int r1 = r1.saveLayerAlpha(r0, r3)
            return r1
    }

    public static void transform(android.graphics.Canvas r1, android.graphics.Rect r2, float r3, float r4, float r5, int r6, com.google.android.material.transition.platform.TransitionUtils.CanvasOperation r7) {
            if (r6 > 0) goto L3
            return
        L3:
            int r0 = r1.save()
            r1.translate(r3, r4)
            r1.scale(r5, r5)
            r3 = 255(0xff, float:3.57E-43)
            if (r6 >= r3) goto L14
            saveLayerAlphaCompat(r1, r2, r6)
        L14:
            r7.run(r1)
            r1.restoreToCount(r0)
            return
    }
}
