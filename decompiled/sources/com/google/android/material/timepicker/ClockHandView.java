package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends android.view.View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final android.animation.TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final java.util.List<com.google.android.material.timepicker.ClockHandView.OnRotateListener> listeners;
    private com.google.android.material.timepicker.ClockHandView.OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final android.graphics.Paint paint;
    private final android.animation.ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final android.graphics.RectF selectorBox;
    private final int selectorRadius;

    @androidx.annotation.Px
    private final int selectorStrokeWidth;


    public interface OnActionUpListener {
        void onActionUp(@androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r1, boolean r2);
    }

    public interface OnRotateListener {
        void onRotate(@androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r1, boolean r2);
    }

    /* JADX INFO: renamed from: $r8$lambda$wCFWOEU6-eiQJxdycea1a-JE7mk, reason: not valid java name */
    public static /* synthetic */ void m295$r8$lambda$wCFWOEU6eiQJxdycea1aJE7mk(com.google.android.material.timepicker.ClockHandView r0, android.animation.ValueAnimator r1) {
            r0.lambda$setHandRotation$0(r1)
            return
    }

    public ClockHandView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ClockHandView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.materialClockStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ClockHandView(android.content.Context r5, @androidx.annotation.Nullable android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            r4.rotationAnimator = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.listeners = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.paint = r0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r4.selectorBox = r1
            r1 = 1
            r4.currentLevel = r1
            int[] r2 = com.google.android.material.R.styleable.ClockHandView
            int r3 = com.google.android.material.R.style.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r2, r7, r3)
            int r7 = com.google.android.material.R.attr.motionDurationLong2
            r2 = 200(0xc8, float:2.8E-43)
            int r7 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r5, r7, r2)
            r4.animationDuration = r7
            int r7 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r7 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r5, r7, r2)
            r4.animationInterpolator = r7
            int r7 = com.google.android.material.R.styleable.ClockHandView_materialCircleRadius
            r2 = 0
            int r7 = r6.getDimensionPixelSize(r7, r2)
            r4.circleRadius = r7
            int r7 = com.google.android.material.R.styleable.ClockHandView_selectorSize
            int r7 = r6.getDimensionPixelSize(r7, r2)
            r4.selectorRadius = r7
            android.content.res.Resources r7 = r4.getResources()
            int r3 = com.google.android.material.R.dimen.material_clock_hand_stroke_width
            int r3 = r7.getDimensionPixelSize(r3)
            r4.selectorStrokeWidth = r3
            int r3 = com.google.android.material.R.dimen.material_clock_hand_center_dot_radius
            int r7 = r7.getDimensionPixelSize(r3)
            float r7 = (float) r7
            r4.centerDotRadius = r7
            int r7 = com.google.android.material.R.styleable.ClockHandView_clockHandColor
            int r7 = r6.getColor(r7, r2)
            r0.setAntiAlias(r1)
            r0.setColor(r7)
            r7 = 0
            r4.setHandRotation(r7)
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            int r5 = r5.getScaledTouchSlop()
            r4.scaledTouchSlop = r5
            r5 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r4, r5)
            r6.recycle()
            return
    }

    private void adjustLevel(float r4, float r5) {
            r3 = this;
            int r0 = r3.getWidth()
            r1 = 2
            int r0 = r0 / r1
            int r2 = r3.getHeight()
            int r2 = r2 / r1
            float r0 = (float) r0
            float r2 = (float) r2
            float r4 = com.google.android.material.math.MathUtils.dist(r0, r2, r4, r5)
            int r5 = r3.getLeveledCircleRadius(r1)
            android.content.Context r0 = r3.getContext()
            r2 = 12
            float r0 = com.google.android.material.internal.ViewUtils.dpToPx(r0, r2)
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L26
            goto L27
        L26:
            r1 = 1
        L27:
            r3.currentLevel = r1
            return
    }

    private void drawSelector(android.graphics.Canvas r12) {
            r11 = this;
            int r0 = r11.getHeight()
            int r0 = r0 / 2
            int r1 = r11.getWidth()
            int r1 = r1 / 2
            int r2 = r11.currentLevel
            int r2 = r11.getLeveledCircleRadius(r2)
            float r9 = (float) r1
            float r3 = (float) r2
            double r4 = r11.degRad
            double r4 = java.lang.Math.cos(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r4 = r4 + r9
            float r10 = (float) r0
            double r5 = r11.degRad
            double r5 = java.lang.Math.sin(r5)
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r10
            android.graphics.Paint r5 = r11.paint
            r6 = 0
            r5.setStrokeWidth(r6)
            int r5 = r11.selectorRadius
            float r5 = (float) r5
            android.graphics.Paint r6 = r11.paint
            r12.drawCircle(r4, r3, r5, r6)
            double r3 = r11.degRad
            double r3 = java.lang.Math.sin(r3)
            double r5 = r11.degRad
            double r5 = java.lang.Math.cos(r5)
            int r7 = r11.selectorRadius
            int r2 = r2 - r7
            float r2 = (float) r2
            double r7 = (double) r2
            double r5 = r5 * r7
            int r2 = (int) r5
            int r1 = r1 + r2
            float r6 = (float) r1
            double r7 = r7 * r3
            int r1 = (int) r7
            int r0 = r0 + r1
            float r7 = (float) r0
            android.graphics.Paint r0 = r11.paint
            int r1 = r11.selectorStrokeWidth
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r8 = r11.paint
            r3 = r12
            r4 = r9
            r5 = r10
            r3.drawLine(r4, r5, r6, r7, r8)
            float r0 = r11.centerDotRadius
            android.graphics.Paint r1 = r11.paint
            r12.drawCircle(r9, r10, r0, r1)
            return
    }

    private int getDegreesFromXY(float r5, float r6) {
            r4 = this;
            int r0 = r4.getWidth()
            int r0 = r0 / 2
            int r1 = r4.getHeight()
            int r1 = r1 / 2
            float r0 = (float) r0
            float r5 = r5 - r0
            double r2 = (double) r5
            float r5 = (float) r1
            float r6 = r6 - r5
            double r5 = (double) r6
            double r5 = java.lang.Math.atan2(r5, r2)
            double r5 = java.lang.Math.toDegrees(r5)
            int r5 = (int) r5
            int r5 = r5 + 90
            if (r5 >= 0) goto L21
            int r5 = r5 + 360
        L21:
            return r5
    }

    @androidx.annotation.Dimension
    private int getLeveledCircleRadius(int r2) {
            r1 = this;
            r0 = 2
            if (r2 != r0) goto L10
            int r2 = r1.circleRadius
            float r2 = (float) r2
            r0 = 1059648963(0x3f28f5c3, float:0.66)
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            goto L12
        L10:
            int r2 = r1.circleRadius
        L12:
            return r2
    }

    private android.util.Pair<java.lang.Float, java.lang.Float> getValuesForAnimation(float r5) {
            r4 = this;
            float r0 = r4.getHandRotation()
            float r1 = r0 - r5
            float r1 = java.lang.Math.abs(r1)
            r2 = 1127481344(0x43340000, float:180.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L24
            r1 = 1135869952(0x43b40000, float:360.0)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L1b
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 >= 0) goto L1b
            float r5 = r5 + r1
        L1b:
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L24
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L24
            float r0 = r0 + r1
        L24:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1.<init>(r0, r5)
            return r1
    }

    private boolean handleTouchInput(float r3, float r4, boolean r5, boolean r6, boolean r7) {
            r2 = this;
            int r3 = r2.getDegreesFromXY(r3, r4)
            float r4 = r2.getHandRotation()
            float r3 = (float) r3
            r0 = 0
            r1 = 1
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            if (r6 == 0) goto L17
            if (r4 == 0) goto L17
            return r1
        L17:
            if (r4 != 0) goto L1d
            if (r5 == 0) goto L1c
            goto L1d
        L1c:
            return r0
        L1d:
            if (r7 == 0) goto L24
            boolean r4 = r2.animatingOnTouchUp
            if (r4 == 0) goto L24
            r0 = 1
        L24:
            r2.setHandRotation(r3, r0)
            return r1
    }

    private /* synthetic */ void lambda$setHandRotation$0(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0 = 1
            r1.setHandRotationInternal(r2, r0)
            return
    }

    private void setHandRotationInternal(@androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r8, boolean r9) {
            r7 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            float r8 = r8 % r0
            r7.originalDeg = r8
            r0 = 1119092736(0x42b40000, float:90.0)
            float r0 = r8 - r0
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            r7.degRad = r0
            int r0 = r7.getHeight()
            int r0 = r0 / 2
            int r1 = r7.getWidth()
            int r1 = r1 / 2
            int r2 = r7.currentLevel
            int r2 = r7.getLeveledCircleRadius(r2)
            float r1 = (float) r1
            float r2 = (float) r2
            double r3 = r7.degRad
            double r3 = java.lang.Math.cos(r3)
            float r3 = (float) r3
            float r3 = r3 * r2
            float r3 = r3 + r1
            float r0 = (float) r0
            double r4 = r7.degRad
            double r4 = java.lang.Math.sin(r4)
            float r1 = (float) r4
            float r2 = r2 * r1
            float r2 = r2 + r0
            android.graphics.RectF r0 = r7.selectorBox
            int r1 = r7.selectorRadius
            float r4 = (float) r1
            float r4 = r3 - r4
            float r5 = (float) r1
            float r5 = r2 - r5
            float r6 = (float) r1
            float r3 = r3 + r6
            float r1 = (float) r1
            float r2 = r2 + r1
            r0.set(r4, r5, r3, r2)
            java.util.List<com.google.android.material.timepicker.ClockHandView$OnRotateListener> r0 = r7.listeners
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            com.google.android.material.timepicker.ClockHandView$OnRotateListener r1 = (com.google.android.material.timepicker.ClockHandView.OnRotateListener) r1
            r1.onRotate(r8, r9)
            goto L50
        L60:
            r7.invalidate()
            return
    }

    public void addOnRotateListener(com.google.android.material.timepicker.ClockHandView.OnRotateListener r2) {
            r1 = this;
            java.util.List<com.google.android.material.timepicker.ClockHandView$OnRotateListener> r0 = r1.listeners
            r0.add(r2)
            return
    }

    public final int getCurrentLevel() {
            r1 = this;
            int r0 = r1.currentLevel
            return r0
    }

    public android.graphics.RectF getCurrentSelectorBox() {
            r1 = this;
            android.graphics.RectF r0 = r1.selectorBox
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 360.0d)
    public float getHandRotation() {
            r1 = this;
            float r0 = r1.originalDeg
            return r0
    }

    public int getSelectorRadius() {
            r1 = this;
            int r0 = r1.selectorRadius
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            r0.drawSelector(r1)
            return
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            android.animation.ValueAnimator r1 = r0.rotationAnimator
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L12
            float r1 = r0.getHandRotation()
            r0.setHandRotation(r1)
        L12:
            return
    }

    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(android.view.MotionEvent r11) {
            r10 = this;
            int r0 = r11.getActionMasked()
            float r7 = r11.getX()
            float r11 = r11.getY()
            r1 = 0
            r8 = 1
            if (r0 == 0) goto L41
            if (r0 == r8) goto L19
            r2 = 2
            if (r0 == r2) goto L19
            r0 = 0
            r4 = 0
        L17:
            r5 = 0
            goto L4c
        L19:
            float r2 = r10.downX
            float r2 = r7 - r2
            int r2 = (int) r2
            float r3 = r10.downY
            float r3 = r11 - r3
            int r3 = (int) r3
            int r2 = r2 * r2
            int r3 = r3 * r3
            int r3 = r3 + r2
            int r2 = r10.scaledTouchSlop
            if (r3 <= r2) goto L2e
            r2 = 1
            goto L2f
        L2e:
            r2 = 0
        L2f:
            r10.isInTapRegion = r2
            boolean r2 = r10.changedDuringTouch
            if (r0 != r8) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            boolean r3 = r10.isMultiLevel
            if (r3 == 0) goto L3f
            r10.adjustLevel(r7, r11)
        L3f:
            r4 = r2
            goto L17
        L41:
            r10.downX = r7
            r10.downY = r11
            r10.isInTapRegion = r8
            r10.changedDuringTouch = r1
            r0 = 0
            r4 = 0
            r5 = 1
        L4c:
            boolean r9 = r10.changedDuringTouch
            r1 = r10
            r2 = r7
            r3 = r11
            r6 = r0
            boolean r1 = r1.handleTouchInput(r2, r3, r4, r5, r6)
            r1 = r1 | r9
            r10.changedDuringTouch = r1
            if (r1 == 0) goto L6b
            if (r0 == 0) goto L6b
            com.google.android.material.timepicker.ClockHandView$OnActionUpListener r0 = r10.onActionUpListener
            if (r0 == 0) goto L6b
            int r11 = r10.getDegreesFromXY(r7, r11)
            float r11 = (float) r11
            boolean r1 = r10.isInTapRegion
            r0.onActionUp(r11, r1)
        L6b:
            return r8
    }

    public void setAnimateOnTouchUp(boolean r1) {
            r0 = this;
            r0.animatingOnTouchUp = r1
            return
    }

    public void setCircleRadius(@androidx.annotation.Dimension int r1) {
            r0 = this;
            r0.circleRadius = r1
            r0.invalidate()
            return
    }

    public final void setCurrentLevel(int r1) {
            r0 = this;
            r0.currentLevel = r1
            r0.invalidate()
            return
    }

    public void setHandRotation(@androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r2) {
            r1 = this;
            r0 = 0
            r1.setHandRotation(r2, r0)
            return
    }

    public void setHandRotation(@androidx.annotation.FloatRange(from = 0.0d, to = 360.0d) float r4, boolean r5) {
            r3 = this;
            android.animation.ValueAnimator r0 = r3.rotationAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            r0 = 0
            if (r5 != 0) goto Le
            r3.setHandRotationInternal(r4, r0)
            return
        Le:
            android.util.Pair r4 = r3.getValuesForAnimation(r4)
            android.animation.ValueAnimator r5 = r3.rotationAnimator
            r1 = 2
            float[] r1 = new float[r1]
            java.lang.Object r2 = r4.first
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1[r0] = r2
            r0 = 1
            java.lang.Object r4 = r4.second
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r1[r0] = r4
            r5.setFloatValues(r1)
            android.animation.ValueAnimator r4 = r3.rotationAnimator
            int r5 = r3.animationDuration
            long r0 = (long) r5
            r4.setDuration(r0)
            android.animation.ValueAnimator r4 = r3.rotationAnimator
            android.animation.TimeInterpolator r5 = r3.animationInterpolator
            r4.setInterpolator(r5)
            android.animation.ValueAnimator r4 = r3.rotationAnimator
            com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0 r5 = new com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0
            r5.<init>(r3)
            r4.addUpdateListener(r5)
            android.animation.ValueAnimator r4 = r3.rotationAnimator
            com.google.android.material.timepicker.ClockHandView$1 r5 = new com.google.android.material.timepicker.ClockHandView$1
            r5.<init>()
            r4.addListener(r5)
            android.animation.ValueAnimator r4 = r3.rotationAnimator
            r4.start()
            return
    }

    public final void setMultiLevel(boolean r2) {
            r1 = this;
            boolean r0 = r1.isMultiLevel
            if (r0 == 0) goto L9
            if (r2 != 0) goto L9
            r0 = 1
            r1.currentLevel = r0
        L9:
            r1.isMultiLevel = r2
            r1.invalidate()
            return
    }

    public void setOnActionUpListener(com.google.android.material.timepicker.ClockHandView.OnActionUpListener r1) {
            r0 = this;
            r0.onActionUpListener = r1
            return
    }
}
