package androidx.swiperefreshlayout.widget;

/* JADX INFO: loaded from: classes2.dex */
public class CircularProgressDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
    private static final int ANIMATION_DURATION = 1332;
    private static final int ARROW_HEIGHT = 5;
    private static final int ARROW_HEIGHT_LARGE = 6;
    private static final int ARROW_WIDTH = 10;
    private static final int ARROW_WIDTH_LARGE = 12;
    private static final float CENTER_RADIUS = 7.5f;
    private static final float CENTER_RADIUS_LARGE = 11.0f;
    private static final int[] COLORS = null;
    private static final float COLOR_CHANGE_OFFSET = 0.75f;
    public static final int DEFAULT = 1;
    private static final float GROUP_FULL_ROTATION = 216.0f;
    public static final int LARGE = 0;
    private static final android.view.animation.Interpolator LINEAR_INTERPOLATOR = null;
    private static final android.view.animation.Interpolator MATERIAL_INTERPOLATOR = null;
    private static final float MAX_PROGRESS_ARC = 0.8f;
    private static final float MIN_PROGRESS_ARC = 0.01f;
    private static final float RING_ROTATION = 0.20999998f;
    private static final float SHRINK_OFFSET = 0.5f;
    private static final float STROKE_WIDTH = 2.5f;
    private static final float STROKE_WIDTH_LARGE = 3.0f;
    private android.animation.Animator mAnimator;
    public boolean mFinishing;
    private android.content.res.Resources mResources;
    private final androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring mRing;
    private float mRotation;
    public float mRotationCount;



    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ProgressDrawableSize {
    }

    public static class Ring {
        public int mAlpha;
        public android.graphics.Path mArrow;
        public int mArrowHeight;
        public final android.graphics.Paint mArrowPaint;
        public float mArrowScale;
        public int mArrowWidth;
        public final android.graphics.Paint mCirclePaint;
        public int mColorIndex;
        public int[] mColors;
        public int mCurrentColor;
        public float mEndTrim;
        public final android.graphics.Paint mPaint;
        public float mRingCenterRadius;
        public float mRotation;
        public boolean mShowArrow;
        public float mStartTrim;
        public float mStartingEndTrim;
        public float mStartingRotation;
        public float mStartingStartTrim;
        public float mStrokeWidth;
        public final android.graphics.RectF mTempBounds;

        public Ring() {
                r5 = this;
                r5.<init>()
                android.graphics.RectF r0 = new android.graphics.RectF
                r0.<init>()
                r5.mTempBounds = r0
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r5.mPaint = r0
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r5.mArrowPaint = r1
                android.graphics.Paint r2 = new android.graphics.Paint
                r2.<init>()
                r5.mCirclePaint = r2
                r3 = 0
                r5.mStartTrim = r3
                r5.mEndTrim = r3
                r5.mRotation = r3
                r3 = 1084227584(0x40a00000, float:5.0)
                r5.mStrokeWidth = r3
                r3 = 1065353216(0x3f800000, float:1.0)
                r5.mArrowScale = r3
                r3 = 255(0xff, float:3.57E-43)
                r5.mAlpha = r3
                android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
                r0.setStrokeCap(r3)
                r3 = 1
                r0.setAntiAlias(r3)
                android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
                r0.setStyle(r4)
                android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
                r1.setStyle(r0)
                r1.setAntiAlias(r3)
                r0 = 0
                r2.setColor(r0)
                return
        }

        public final void setColorIndex(int r2) {
                r1 = this;
                r1.mColorIndex = r2
                int[] r0 = r1.mColors
                r2 = r0[r2]
                r1.mCurrentColor = r2
                return
        }

        public final void setShowArrow(boolean r2) {
                r1 = this;
                boolean r0 = r1.mShowArrow
                if (r0 == r2) goto L6
                r1.mShowArrow = r2
            L6:
                return
        }
    }

    static {
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            androidx.swiperefreshlayout.widget.CircularProgressDrawable.LINEAR_INTERPOLATOR = r0
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r0 = new androidx.interpolator.view.animation.FastOutSlowInInterpolator
            r0.<init>()
            androidx.swiperefreshlayout.widget.CircularProgressDrawable.MATERIAL_INTERPOLATOR = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0[r1] = r2
            androidx.swiperefreshlayout.widget.CircularProgressDrawable.COLORS = r0
            return
    }

    public CircularProgressDrawable(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.Resources r2 = r2.getResources()
            r1.mResources = r2
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r2 = new androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring
            r2.<init>()
            r1.mRing = r2
            int[] r0 = androidx.swiperefreshlayout.widget.CircularProgressDrawable.COLORS
            r2.mColors = r0
            r0 = 0
            r2.setColorIndex(r0)
            r2 = 1075838976(0x40200000, float:2.5)
            r1.setStrokeWidth(r2)
            r1.setupAnimators()
            return
    }

    private void applyFinishTranslation(float r5, androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring r6) {
            r4 = this;
            r4.updateRingColor(r5, r6)
            float r0 = r6.mStartingRotation
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            float r0 = (float) r0
            float r1 = r6.mStartingStartTrim
            float r2 = r6.mStartingEndTrim
            r3 = 1008981770(0x3c23d70a, float:0.01)
            float r3 = r2 - r3
            float r3 = r3 - r1
            float r3 = r3 * r5
            float r3 = r3 + r1
            r6.mStartTrim = r3
            r6.mEndTrim = r2
            float r1 = r6.mStartingRotation
            float r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r5, r1)
            r6.mRotation = r5
            return
    }

    private int evaluateColorChange(float r7, int r8, int r9) {
            r6 = this;
            int r0 = r8 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r8 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r8 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r3 = r9 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r9 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r9 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r3 = r3 - r0
            float r3 = (float) r3
            float r3 = r3 * r7
            int r3 = (int) r3
            int r0 = r0 + r3
            int r0 = r0 << 24
            int r4 = r4 - r1
            float r3 = (float) r4
            float r3 = r3 * r7
            int r3 = (int) r3
            int r1 = r1 + r3
            int r1 = r1 << 16
            r0 = r0 | r1
            int r5 = r5 - r2
            float r1 = (float) r5
            float r1 = r1 * r7
            int r1 = (int) r1
            int r2 = r2 + r1
            int r1 = r2 << 8
            r0 = r0 | r1
            int r9 = r9 - r8
            float r9 = (float) r9
            float r7 = r7 * r9
            int r7 = (int) r7
            int r8 = r8 + r7
            r7 = r0 | r8
            return r7
    }

    private float getRotation() {
            r1 = this;
            float r0 = r1.mRotation
            return r0
    }

    private void setRotation(float r1) {
            r0 = this;
            r0.mRotation = r1
            return
    }

    private void setSizeParameters(float r4, float r5, float r6, float r7) {
            r3 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r3.mRing
            android.content.res.Resources r1 = r3.mResources
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r5 = r5 * r1
            r0.mStrokeWidth = r5
            android.graphics.Paint r2 = r0.mPaint
            r2.setStrokeWidth(r5)
            float r4 = r4 * r1
            r0.mRingCenterRadius = r4
            r4 = 0
            r0.setColorIndex(r4)
            float r6 = r6 * r1
            float r7 = r7 * r1
            int r4 = (int) r6
            r0.mArrowWidth = r4
            int r4 = (int) r7
            r0.mArrowHeight = r4
            return
    }

    private void setupAnimators() {
            r3 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r3.mRing
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x002c: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$1 r2 = new androidx.swiperefreshlayout.widget.CircularProgressDrawable$1
            r2.<init>(r3, r0)
            r1.addUpdateListener(r2)
            r2 = -1
            r1.setRepeatCount(r2)
            r2 = 1
            r1.setRepeatMode(r2)
            android.view.animation.Interpolator r2 = androidx.swiperefreshlayout.widget.CircularProgressDrawable.LINEAR_INTERPOLATOR
            r1.setInterpolator(r2)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$2 r2 = new androidx.swiperefreshlayout.widget.CircularProgressDrawable$2
            r2.<init>(r3, r0)
            r1.addListener(r2)
            r3.mAnimator = r1
            return
    }

    public final void applyTransformation(float r8, androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring r9, boolean r10) {
            r7 = this;
            boolean r0 = r7.mFinishing
            if (r0 == 0) goto L8
            r7.applyFinishTranslation(r8, r9)
            goto L58
        L8:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 != 0) goto L10
            if (r10 == 0) goto L58
        L10:
            float r10 = r9.mStartingRotation
            r1 = 1008981770(0x3c23d70a, float:0.01)
            r2 = 1061830001(0x3f4a3d71, float:0.79)
            r3 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r4 >= 0) goto L2d
            float r0 = r8 / r3
            float r3 = r9.mStartingStartTrim
            android.view.animation.Interpolator r4 = androidx.swiperefreshlayout.widget.CircularProgressDrawable.MATERIAL_INTERPOLATOR
            float r0 = r4.getInterpolation(r0)
            float r0 = r0 * r2
            float r0 = r0 + r1
            float r0 = r0 + r3
            goto L42
        L2d:
            float r4 = r8 - r3
            float r4 = r4 / r3
            float r3 = r9.mStartingStartTrim
            float r3 = r3 + r2
            android.view.animation.Interpolator r5 = androidx.swiperefreshlayout.widget.CircularProgressDrawable.MATERIAL_INTERPOLATOR
            float r4 = r5.getInterpolation(r4)
            float r0 = r0 - r4
            float r0 = r0 * r2
            float r0 = r0 + r1
            float r0 = r3 - r0
            r6 = r3
            r3 = r0
            r0 = r6
        L42:
            r1 = 1045891644(0x3e570a3c, float:0.20999998)
            float r1 = r1 * r8
            float r1 = r1 + r10
            r10 = 1129840640(0x43580000, float:216.0)
            float r2 = r7.mRotationCount
            float r8 = r8 + r2
            float r8 = r8 * r10
            r9.mStartTrim = r3
            r9.mEndTrim = r0
            r9.mRotation = r1
            r7.setRotation(r8)
        L58:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r13) {
            r12 = this;
            android.graphics.Rect r0 = r12.getBounds()
            r13.save()
            float r1 = r12.mRotation
            float r2 = r0.exactCenterX()
            float r3 = r0.exactCenterY()
            r13.rotate(r1, r2, r3)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r1 = r12.mRing
            android.graphics.RectF r8 = r1.mTempBounds
            float r2 = r1.mRingCenterRadius
            float r3 = r1.mStrokeWidth
            r9 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r9
            float r3 = r3 + r2
            r10 = 0
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 > 0) goto L44
            int r2 = r0.width()
            int r3 = r0.height()
            int r2 = java.lang.Math.min(r2, r3)
            float r2 = (float) r2
            float r2 = r2 / r9
            int r3 = r1.mArrowWidth
            float r3 = (float) r3
            float r4 = r1.mArrowScale
            float r3 = r3 * r4
            float r3 = r3 / r9
            float r4 = r1.mStrokeWidth
            float r4 = r4 / r9
            float r3 = java.lang.Math.max(r3, r4)
            float r3 = r2 - r3
        L44:
            int r2 = r0.centerX()
            float r2 = (float) r2
            float r2 = r2 - r3
            int r4 = r0.centerY()
            float r4 = (float) r4
            float r4 = r4 - r3
            int r5 = r0.centerX()
            float r5 = (float) r5
            float r5 = r5 + r3
            int r0 = r0.centerY()
            float r0 = (float) r0
            float r0 = r0 + r3
            r8.set(r2, r4, r5, r0)
            float r0 = r1.mStartTrim
            float r2 = r1.mRotation
            float r0 = r0 + r2
            r3 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 * r3
            float r4 = r1.mEndTrim
            float r4 = r4 + r2
            float r4 = r4 * r3
            float r11 = r4 - r0
            android.graphics.Paint r2 = r1.mPaint
            int r3 = r1.mCurrentColor
            r2.setColor(r3)
            android.graphics.Paint r2 = r1.mPaint
            int r3 = r1.mAlpha
            r2.setAlpha(r3)
            float r2 = r1.mStrokeWidth
            float r2 = r2 / r9
            r8.inset(r2, r2)
            float r3 = r8.centerX()
            float r4 = r8.centerY()
            float r5 = r8.width()
            float r5 = r5 / r9
            android.graphics.Paint r6 = r1.mCirclePaint
            r13.drawCircle(r3, r4, r5, r6)
            float r2 = -r2
            r8.inset(r2, r2)
            r6 = 0
            android.graphics.Paint r7 = r1.mPaint
            r2 = r13
            r3 = r8
            r4 = r0
            r5 = r11
            r2.drawArc(r3, r4, r5, r6, r7)
            boolean r2 = r1.mShowArrow
            if (r2 == 0) goto L132
            android.graphics.Path r2 = r1.mArrow
            if (r2 != 0) goto Lb8
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r1.mArrow = r2
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.EVEN_ODD
            r2.setFillType(r3)
            goto Lbb
        Lb8:
            r2.reset()
        Lbb:
            float r2 = r8.width()
            float r3 = r8.height()
            float r2 = java.lang.Math.min(r2, r3)
            float r2 = r2 / r9
            int r3 = r1.mArrowWidth
            float r3 = (float) r3
            float r4 = r1.mArrowScale
            float r3 = r3 * r4
            float r3 = r3 / r9
            android.graphics.Path r4 = r1.mArrow
            r4.moveTo(r10, r10)
            android.graphics.Path r4 = r1.mArrow
            int r5 = r1.mArrowWidth
            float r5 = (float) r5
            float r6 = r1.mArrowScale
            float r5 = r5 * r6
            r4.lineTo(r5, r10)
            android.graphics.Path r4 = r1.mArrow
            int r5 = r1.mArrowWidth
            float r5 = (float) r5
            float r6 = r1.mArrowScale
            float r5 = r5 * r6
            float r5 = r5 / r9
            int r7 = r1.mArrowHeight
            float r7 = (float) r7
            float r7 = r7 * r6
            r4.lineTo(r5, r7)
            android.graphics.Path r4 = r1.mArrow
            float r5 = r8.centerX()
            float r5 = r5 + r2
            float r5 = r5 - r3
            float r2 = r8.centerY()
            float r3 = r1.mStrokeWidth
            float r3 = r3 / r9
            float r3 = r3 + r2
            r4.offset(r5, r3)
            android.graphics.Path r2 = r1.mArrow
            r2.close()
            android.graphics.Paint r2 = r1.mArrowPaint
            int r3 = r1.mCurrentColor
            r2.setColor(r3)
            android.graphics.Paint r2 = r1.mArrowPaint
            int r3 = r1.mAlpha
            r2.setAlpha(r3)
            r13.save()
            float r0 = r0 + r11
            float r2 = r8.centerX()
            float r3 = r8.centerY()
            r13.rotate(r0, r2, r3)
            android.graphics.Path r0 = r1.mArrow
            android.graphics.Paint r1 = r1.mArrowPaint
            r13.drawPath(r0, r1)
            r13.restore()
        L132:
            r13.restore()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            int r0 = r0.mAlpha
            return r0
    }

    public boolean getArrowEnabled() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            boolean r0 = r0.mShowArrow
            return r0
    }

    public float getArrowHeight() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            int r0 = r0.mArrowHeight
            float r0 = (float) r0
            return r0
    }

    public float getArrowScale() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            float r0 = r0.mArrowScale
            return r0
    }

    public float getArrowWidth() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            int r0 = r0.mArrowWidth
            float r0 = (float) r0
            return r0
    }

    public int getBackgroundColor() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            android.graphics.Paint r0 = r0.mCirclePaint
            int r0 = r0.getColor()
            return r0
    }

    public float getCenterRadius() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            float r0 = r0.mRingCenterRadius
            return r0
    }

    @androidx.annotation.NonNull
    public int[] getColorSchemeColors() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            int[] r0 = r0.mColors
            return r0
    }

    public float getEndTrim() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            float r0 = r0.mEndTrim
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    public float getProgressRotation() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            float r0 = r0.mRotation
            return r0
    }

    public float getStartTrim() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            float r0 = r0.mStartTrim
            return r0
    }

    @androidx.annotation.NonNull
    public android.graphics.Paint.Cap getStrokeCap() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            android.graphics.Paint r0 = r0.mPaint
            android.graphics.Paint$Cap r0 = r0.getStrokeCap()
            return r0
    }

    public float getStrokeWidth() {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            float r0 = r0.mStrokeWidth
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            android.animation.Animator r0 = r1.mAnimator
            boolean r0 = r0.isRunning()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            r0.mAlpha = r2
            r1.invalidateSelf()
            return
    }

    public void setArrowDimensions(float r2, float r3) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            int r2 = (int) r2
            r0.mArrowWidth = r2
            int r2 = (int) r3
            r0.mArrowHeight = r2
            r1.invalidateSelf()
            return
    }

    public void setArrowEnabled(boolean r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            r0.setShowArrow(r2)
            r1.invalidateSelf()
            return
    }

    public void setArrowScale(float r3) {
            r2 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r2.mRing
            float r1 = r0.mArrowScale
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto La
            r0.mArrowScale = r3
        La:
            r2.invalidateSelf()
            return
    }

    public void setBackgroundColor(int r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            android.graphics.Paint r0 = r0.mCirclePaint
            r0.setColor(r2)
            r1.invalidateSelf()
            return
    }

    public void setCenterRadius(float r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            r0.mRingCenterRadius = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            android.graphics.Paint r0 = r0.mPaint
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    public void setColorSchemeColors(@androidx.annotation.NonNull int... r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            r0.mColors = r2
            r2 = 0
            r0.setColorIndex(r2)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            r0.setColorIndex(r2)
            r1.invalidateSelf()
            return
    }

    public void setProgressRotation(float r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            r0.mRotation = r2
            r1.invalidateSelf()
            return
    }

    public void setStartEndTrim(float r2, float r3) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            r0.mStartTrim = r2
            r0.mEndTrim = r3
            r1.invalidateSelf()
            return
    }

    public void setStrokeCap(@androidx.annotation.NonNull android.graphics.Paint.Cap r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            android.graphics.Paint r0 = r0.mPaint
            r0.setStrokeCap(r2)
            r1.invalidateSelf()
            return
    }

    public void setStrokeWidth(float r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r1.mRing
            r0.mStrokeWidth = r2
            android.graphics.Paint r0 = r0.mPaint
            r0.setStrokeWidth(r2)
            r1.invalidateSelf()
            return
    }

    public void setStyle(int r4) {
            r3 = this;
            if (r4 != 0) goto Le
            r4 = 1093664768(0x41300000, float:11.0)
            r0 = 1077936128(0x40400000, float:3.0)
            r1 = 1094713344(0x41400000, float:12.0)
            r2 = 1086324736(0x40c00000, float:6.0)
            r3.setSizeParameters(r4, r0, r1, r2)
            goto L19
        Le:
            r4 = 1089470464(0x40f00000, float:7.5)
            r0 = 1075838976(0x40200000, float:2.5)
            r1 = 1092616192(0x41200000, float:10.0)
            r2 = 1084227584(0x40a00000, float:5.0)
            r3.setSizeParameters(r4, r0, r1, r2)
        L19:
            r3.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r4 = this;
            android.animation.Animator r0 = r4.mAnimator
            r0.cancel()
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r4.mRing
            float r1 = r0.mStartTrim
            r0.mStartingStartTrim = r1
            float r2 = r0.mEndTrim
            r0.mStartingEndTrim = r2
            float r3 = r0.mRotation
            r0.mStartingRotation = r3
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L27
            r0 = 1
            r4.mFinishing = r0
            android.animation.Animator r0 = r4.mAnimator
            r1 = 666(0x29a, double:3.29E-321)
            r0.setDuration(r1)
            android.animation.Animator r0 = r4.mAnimator
            r0.start()
            goto L46
        L27:
            r1 = 0
            r0.setColorIndex(r1)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r0 = r4.mRing
            r1 = 0
            r0.mStartingStartTrim = r1
            r0.mStartingEndTrim = r1
            r0.mStartingRotation = r1
            r0.mStartTrim = r1
            r0.mEndTrim = r1
            r0.mRotation = r1
            android.animation.Animator r0 = r4.mAnimator
            r1 = 1332(0x534, double:6.58E-321)
            r0.setDuration(r1)
            android.animation.Animator r0 = r4.mAnimator
            r0.start()
        L46:
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r3 = this;
            android.animation.Animator r0 = r3.mAnimator
            r0.cancel()
            r0 = 0
            r3.setRotation(r0)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r1 = r3.mRing
            r2 = 0
            r1.setShowArrow(r2)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r1 = r3.mRing
            r1.setColorIndex(r2)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable$Ring r1 = r3.mRing
            r1.mStartingStartTrim = r0
            r1.mStartingEndTrim = r0
            r1.mStartingRotation = r0
            r1.mStartTrim = r0
            r1.mEndTrim = r0
            r1.mRotation = r0
            r3.invalidateSelf()
            return
    }

    public final void updateRingColor(float r5, androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring r6) {
            r4 = this;
            r0 = 1061158912(0x3f400000, float:0.75)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 <= 0) goto L1d
            float r5 = r5 - r0
            r0 = 1048576000(0x3e800000, float:0.25)
            float r5 = r5 / r0
            int[] r0 = r6.mColors
            int r1 = r6.mColorIndex
            r2 = r0[r1]
            int r1 = r1 + 1
            int r3 = r0.length
            int r1 = r1 % r3
            r0 = r0[r1]
            int r5 = r4.evaluateColorChange(r5, r2, r0)
            r6.mCurrentColor = r5
            goto L25
        L1d:
            int[] r5 = r6.mColors
            int r0 = r6.mColorIndex
            r5 = r5[r0]
            r6.mCurrentColor = r5
        L25:
            return
    }
}
