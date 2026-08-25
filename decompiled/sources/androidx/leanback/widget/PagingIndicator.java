package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class PagingIndicator extends android.view.View {
    private static final android.animation.TimeInterpolator DECELERATE_INTERPOLATOR = null;
    private static final android.util.Property<androidx.leanback.widget.PagingIndicator.Dot, java.lang.Float> DOT_ALPHA = null;
    private static final android.util.Property<androidx.leanback.widget.PagingIndicator.Dot, java.lang.Float> DOT_DIAMETER = null;
    private static final android.util.Property<androidx.leanback.widget.PagingIndicator.Dot, java.lang.Float> DOT_TRANSLATION_X = null;
    private static final long DURATION_ALPHA = 167;
    private static final long DURATION_DIAMETER = 417;
    private static final long DURATION_TRANSLATION_X = 417;
    private final android.animation.AnimatorSet mAnimator;
    public android.graphics.Bitmap mArrow;
    public final int mArrowDiameter;
    private final int mArrowGap;
    public android.graphics.Paint mArrowPaint;
    public final int mArrowRadius;
    public final android.graphics.Rect mArrowRect;
    public final float mArrowToBgRatio;
    public final android.graphics.Paint mBgPaint;
    private int mCurrentPage;
    public int mDotCenterY;
    public final int mDotDiameter;

    @androidx.annotation.ColorInt
    public int mDotFgSelectColor;
    private final int mDotGap;
    public final int mDotRadius;
    private int[] mDotSelectedNextX;
    private int[] mDotSelectedPrevX;
    private int[] mDotSelectedX;
    private androidx.leanback.widget.PagingIndicator.Dot[] mDots;
    public final android.graphics.Paint mFgPaint;
    private final android.animation.AnimatorSet mHideAnimator;
    public boolean mIsLtr;
    private int mPageCount;
    private int mPreviousPage;
    private final int mShadowRadius;
    private final android.animation.AnimatorSet mShowAnimator;




    /* JADX INFO: loaded from: classes.dex */
    public class Dot {
        public float mAlpha;
        public float mArrowImageRadius;
        public float mCenterX;
        public float mDiameter;
        public float mDirection;

        @androidx.annotation.ColorInt
        public int mFgColor;
        public float mLayoutDirection;
        public float mRadius;
        public float mTranslationX;
        public final /* synthetic */ androidx.leanback.widget.PagingIndicator this$0;

        public Dot(androidx.leanback.widget.PagingIndicator r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.mDirection = r0
                boolean r2 = r2.mIsLtr
                if (r2 == 0) goto Le
                goto L10
            Le:
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            L10:
                r1.mLayoutDirection = r0
                return
        }

        public void adjustAlpha() {
                r4 = this;
                float r0 = r4.mAlpha
                r1 = 1132396544(0x437f0000, float:255.0)
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                androidx.leanback.widget.PagingIndicator r1 = r4.this$0
                int r1 = r1.mDotFgSelectColor
                int r1 = android.graphics.Color.red(r1)
                androidx.leanback.widget.PagingIndicator r2 = r4.this$0
                int r2 = r2.mDotFgSelectColor
                int r2 = android.graphics.Color.green(r2)
                androidx.leanback.widget.PagingIndicator r3 = r4.this$0
                int r3 = r3.mDotFgSelectColor
                int r3 = android.graphics.Color.blue(r3)
                int r0 = android.graphics.Color.argb(r0, r1, r2, r3)
                r4.mFgColor = r0
                return
        }

        public final void deselect() {
                r3 = this;
                r0 = 0
                r3.mTranslationX = r0
                r3.mCenterX = r0
                androidx.leanback.widget.PagingIndicator r1 = r3.this$0
                int r2 = r1.mDotDiameter
                float r2 = (float) r2
                r3.mDiameter = r2
                int r2 = r1.mDotRadius
                float r2 = (float) r2
                r3.mRadius = r2
                float r1 = r1.mArrowToBgRatio
                float r2 = r2 * r1
                r3.mArrowImageRadius = r2
                r3.mAlpha = r0
                r3.adjustAlpha()
                return
        }

        public float getAlpha() {
                r1 = this;
                float r0 = r1.mAlpha
                return r0
        }

        public float getDiameter() {
                r1 = this;
                float r0 = r1.mDiameter
                return r0
        }

        public float getTranslationX() {
                r1 = this;
                float r0 = r1.mTranslationX
                return r0
        }

        public void setAlpha(float r1) {
                r0 = this;
                r0.mAlpha = r1
                r0.adjustAlpha()
                androidx.leanback.widget.PagingIndicator r1 = r0.this$0
                r1.invalidate()
                return
        }

        public void setDiameter(float r3) {
                r2 = this;
                r2.mDiameter = r3
                r0 = 1073741824(0x40000000, float:2.0)
                float r3 = r3 / r0
                r2.mRadius = r3
                androidx.leanback.widget.PagingIndicator r0 = r2.this$0
                float r1 = r0.mArrowToBgRatio
                float r3 = r3 * r1
                r2.mArrowImageRadius = r3
                r0.invalidate()
                return
        }

        public void setTranslationX(float r2) {
                r1 = this;
                float r0 = r1.mDirection
                float r2 = r2 * r0
                float r0 = r1.mLayoutDirection
                float r2 = r2 * r0
                r1.mTranslationX = r2
                androidx.leanback.widget.PagingIndicator r2 = r1.this$0
                r2.invalidate()
                return
        }
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            androidx.leanback.widget.PagingIndicator.DECELERATE_INTERPOLATOR = r0
            androidx.leanback.widget.PagingIndicator$1 r0 = new androidx.leanback.widget.PagingIndicator$1
            r0.<init>()
            androidx.leanback.widget.PagingIndicator.DOT_ALPHA = r0
            androidx.leanback.widget.PagingIndicator$2 r0 = new androidx.leanback.widget.PagingIndicator$2
            r0.<init>()
            androidx.leanback.widget.PagingIndicator.DOT_DIAMETER = r0
            androidx.leanback.widget.PagingIndicator$3 r0 = new androidx.leanback.widget.PagingIndicator$3
            r0.<init>()
            androidx.leanback.widget.PagingIndicator.DOT_TRANSLATION_X = r0
            return
    }

    public PagingIndicator(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public PagingIndicator(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public PagingIndicator(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r9.mAnimator = r0
            android.content.res.Resources r1 = r9.getResources()
            int[] r2 = androidx.leanback.R.styleable.PagingIndicator
            r3 = 0
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r2, r12, r3)
            int r11 = androidx.leanback.R.styleable.PagingIndicator_lbDotRadius
            int r12 = androidx.leanback.R.dimen.lb_page_indicator_dot_radius
            int r11 = r9.getDimensionFromTypedArray(r10, r11, r12)
            r9.mDotRadius = r11
            int r12 = r11 * 2
            r9.mDotDiameter = r12
            int r12 = androidx.leanback.R.styleable.PagingIndicator_arrowRadius
            int r2 = androidx.leanback.R.dimen.lb_page_indicator_arrow_radius
            int r12 = r9.getDimensionFromTypedArray(r10, r12, r2)
            r9.mArrowRadius = r12
            int r2 = r12 * 2
            r9.mArrowDiameter = r2
            int r4 = androidx.leanback.R.styleable.PagingIndicator_dotToDotGap
            int r5 = androidx.leanback.R.dimen.lb_page_indicator_dot_gap
            int r4 = r9.getDimensionFromTypedArray(r10, r4, r5)
            r9.mDotGap = r4
            int r4 = androidx.leanback.R.styleable.PagingIndicator_dotToArrowGap
            int r5 = androidx.leanback.R.dimen.lb_page_indicator_arrow_gap
            int r4 = r9.getDimensionFromTypedArray(r10, r4, r5)
            r9.mArrowGap = r4
            int r4 = androidx.leanback.R.styleable.PagingIndicator_dotBgColor
            int r5 = androidx.leanback.R.color.lb_page_indicator_dot
            int r4 = r9.getColorFromTypedArray(r10, r4, r5)
            android.graphics.Paint r5 = new android.graphics.Paint
            r6 = 1
            r5.<init>(r6)
            r9.mBgPaint = r5
            r5.setColor(r4)
            int r4 = androidx.leanback.R.styleable.PagingIndicator_arrowBgColor
            int r5 = androidx.leanback.R.color.lb_page_indicator_arrow_background
            int r4 = r9.getColorFromTypedArray(r10, r4, r5)
            r9.mDotFgSelectColor = r4
            android.graphics.Paint r4 = r9.mArrowPaint
            if (r4 != 0) goto L75
            int r4 = androidx.leanback.R.styleable.PagingIndicator_arrowColor
            boolean r5 = r10.hasValue(r4)
            if (r5 == 0) goto L75
            int r4 = r10.getColor(r4, r3)
            r9.setArrowColor(r4)
        L75:
            r10.recycle()
            android.content.res.Configuration r10 = r1.getConfiguration()
            int r10 = r10.getLayoutDirection()
            if (r10 != 0) goto L84
            r10 = 1
            goto L85
        L84:
            r10 = 0
        L85:
            r9.mIsLtr = r10
            int r10 = androidx.leanback.R.color.lb_page_indicator_arrow_shadow
            int r10 = r1.getColor(r10)
            int r4 = androidx.leanback.R.dimen.lb_page_indicator_arrow_shadow_radius
            int r4 = r1.getDimensionPixelSize(r4)
            r9.mShadowRadius = r4
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r6)
            r9.mFgPaint = r5
            int r7 = androidx.leanback.R.dimen.lb_page_indicator_arrow_shadow_offset
            int r1 = r1.getDimensionPixelSize(r7)
            float r4 = (float) r4
            float r1 = (float) r1
            r5.setShadowLayer(r4, r1, r1, r10)
            android.graphics.Bitmap r10 = r9.loadArrow()
            r9.mArrow = r10
            android.graphics.Rect r10 = new android.graphics.Rect
            android.graphics.Bitmap r1 = r9.mArrow
            int r1 = r1.getWidth()
            android.graphics.Bitmap r4 = r9.mArrow
            int r4 = r4.getHeight()
            r10.<init>(r3, r3, r1, r4)
            r9.mArrowRect = r10
            android.graphics.Bitmap r10 = r9.mArrow
            int r10 = r10.getWidth()
            float r10 = (float) r10
            float r1 = (float) r2
            float r10 = r10 / r1
            r9.mArrowToBgRatio = r10
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            r9.mShowAnimator = r10
            r1 = 3
            android.animation.Animator[] r2 = new android.animation.Animator[r1]
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            android.animation.Animator r7 = r9.createDotAlphaAnimator(r4, r5)
            r2[r3] = r7
            int r7 = r11 * 2
            float r7 = (float) r7
            int r8 = r12 * 2
            float r8 = (float) r8
            android.animation.Animator r7 = r9.createDotDiameterAnimator(r7, r8)
            r2[r6] = r7
            android.animation.Animator r7 = r9.createDotTranslationXAnimator()
            r8 = 2
            r2[r8] = r7
            r10.playTogether(r2)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r9.mHideAnimator = r2
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            android.animation.Animator r4 = r9.createDotAlphaAnimator(r5, r4)
            r1[r3] = r4
            int r12 = r12 * 2
            float r12 = (float) r12
            int r11 = r11 * 2
            float r11 = (float) r11
            android.animation.Animator r11 = r9.createDotDiameterAnimator(r12, r11)
            r1[r6] = r11
            android.animation.Animator r11 = r9.createDotTranslationXAnimator()
            r1[r8] = r11
            r2.playTogether(r1)
            android.animation.Animator[] r11 = new android.animation.Animator[r8]
            r11[r3] = r10
            r11[r6] = r2
            r0.playTogether(r11)
            r10 = 0
            r9.setLayerType(r6, r10)
            return
    }

    private void adjustDotPosition() {
            r6 = this;
            r0 = 0
        L1:
            int r1 = r6.mCurrentPage
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= r1) goto L29
            androidx.leanback.widget.PagingIndicator$Dot[] r1 = r6.mDots
            r1 = r1[r0]
            r1.deselect()
            androidx.leanback.widget.PagingIndicator$Dot[] r1 = r6.mDots
            r4 = r1[r0]
            int r5 = r6.mPreviousPage
            if (r0 != r5) goto L19
            goto L1b
        L19:
            r2 = 1065353216(0x3f800000, float:1.0)
        L1b:
            r4.mDirection = r2
            r1 = r1[r0]
            int[] r2 = r6.mDotSelectedPrevX
            r2 = r2[r0]
            float r2 = (float) r2
            r1.mCenterX = r2
            int r0 = r0 + 1
            goto L1
        L29:
            androidx.leanback.widget.PagingIndicator$Dot[] r0 = r6.mDots
            r0 = r0[r1]
            r1 = 0
            r0.mTranslationX = r1
            r0.mCenterX = r1
            androidx.leanback.widget.PagingIndicator r1 = r0.this$0
            int r4 = r1.mArrowDiameter
            float r4 = (float) r4
            r0.mDiameter = r4
            int r4 = r1.mArrowRadius
            float r4 = (float) r4
            r0.mRadius = r4
            float r1 = r1.mArrowToBgRatio
            float r4 = r4 * r1
            r0.mArrowImageRadius = r4
            r0.mAlpha = r3
            r0.adjustAlpha()
            androidx.leanback.widget.PagingIndicator$Dot[] r0 = r6.mDots
            int r1 = r6.mCurrentPage
            r4 = r0[r1]
            int r5 = r6.mPreviousPage
            if (r5 >= r1) goto L54
            goto L56
        L54:
            r2 = 1065353216(0x3f800000, float:1.0)
        L56:
            r4.mDirection = r2
            r0 = r0[r1]
            int[] r2 = r6.mDotSelectedX
            r2 = r2[r1]
            float r2 = (float) r2
            r0.mCenterX = r2
        L61:
            int r1 = r1 + 1
            int r0 = r6.mPageCount
            if (r1 >= r0) goto L7e
            androidx.leanback.widget.PagingIndicator$Dot[] r0 = r6.mDots
            r0 = r0[r1]
            r0.deselect()
            androidx.leanback.widget.PagingIndicator$Dot[] r0 = r6.mDots
            r2 = r0[r1]
            r2.mDirection = r3
            r0 = r0[r1]
            int[] r2 = r6.mDotSelectedNextX
            r2 = r2[r1]
            float r2 = (float) r2
            r0.mCenterX = r2
            goto L61
        L7e:
            return
    }

    private void calculateDotPositions() {
            r11 = this;
            int r0 = r11.getPaddingLeft()
            int r1 = r11.getPaddingTop()
            int r2 = r11.getWidth()
            int r3 = r11.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r11.getRequiredWidth()
            int r0 = r0 + r2
            int r0 = r0 / 2
            int r2 = r11.mPageCount
            int[] r4 = new int[r2]
            r11.mDotSelectedX = r4
            int[] r5 = new int[r2]
            r11.mDotSelectedPrevX = r5
            int[] r2 = new int[r2]
            r11.mDotSelectedNextX = r2
            boolean r6 = r11.mIsLtr
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L6a
            int r3 = r3 / 2
            int r0 = r0 - r3
            int r3 = r11.mDotRadius
            int r6 = r0 + r3
            int r9 = r11.mDotGap
            int r6 = r6 - r9
            int r10 = r11.mArrowGap
            int r6 = r6 + r10
            r4[r8] = r6
            int r4 = r0 + r3
            r5[r8] = r4
            int r0 = r0 + r3
            int r9 = r9 * 2
            int r0 = r0 - r9
            int r10 = r10 * 2
            int r10 = r10 + r0
            r2[r8] = r10
        L48:
            int r0 = r11.mPageCount
            if (r7 >= r0) goto La8
            int[] r0 = r11.mDotSelectedX
            int[] r2 = r11.mDotSelectedPrevX
            int r3 = r7 + (-1)
            r4 = r2[r3]
            int r5 = r11.mArrowGap
            int r4 = r4 + r5
            r0[r7] = r4
            r4 = r2[r3]
            int r6 = r11.mDotGap
            int r4 = r4 + r6
            r2[r7] = r4
            int[] r2 = r11.mDotSelectedNextX
            r0 = r0[r3]
            int r0 = r0 + r5
            r2[r7] = r0
            int r7 = r7 + 1
            goto L48
        L6a:
            int r3 = r3 / 2
            int r3 = r3 + r0
            int r0 = r11.mDotRadius
            int r6 = r3 - r0
            int r9 = r11.mDotGap
            int r6 = r6 + r9
            int r10 = r11.mArrowGap
            int r6 = r6 - r10
            r4[r8] = r6
            int r4 = r3 - r0
            r5[r8] = r4
            int r3 = r3 - r0
            int r9 = r9 * 2
            int r9 = r9 + r3
            int r10 = r10 * 2
            int r9 = r9 - r10
            r2[r8] = r9
        L86:
            int r0 = r11.mPageCount
            if (r7 >= r0) goto La8
            int[] r0 = r11.mDotSelectedX
            int[] r2 = r11.mDotSelectedPrevX
            int r3 = r7 + (-1)
            r4 = r2[r3]
            int r5 = r11.mArrowGap
            int r4 = r4 - r5
            r0[r7] = r4
            r4 = r2[r3]
            int r6 = r11.mDotGap
            int r4 = r4 - r6
            r2[r7] = r4
            int[] r2 = r11.mDotSelectedNextX
            r0 = r0[r3]
            int r0 = r0 - r5
            r2[r7] = r0
            int r7 = r7 + 1
            goto L86
        La8:
            int r0 = r11.mArrowRadius
            int r1 = r1 + r0
            r11.mDotCenterY = r1
            r11.adjustDotPosition()
            return
    }

    private android.animation.Animator createDotAlphaAnimator(float r4, float r5) {
            r3 = this;
            android.util.Property<androidx.leanback.widget.PagingIndicator$Dot, java.lang.Float> r0 = androidx.leanback.widget.PagingIndicator.DOT_ALPHA
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r4 = 0
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r0, r1)
            r0 = 167(0xa7, double:8.25E-322)
            r4.setDuration(r0)
            android.animation.TimeInterpolator r5 = androidx.leanback.widget.PagingIndicator.DECELERATE_INTERPOLATOR
            r4.setInterpolator(r5)
            return r4
    }

    private android.animation.Animator createDotDiameterAnimator(float r4, float r5) {
            r3 = this;
            android.util.Property<androidx.leanback.widget.PagingIndicator$Dot, java.lang.Float> r0 = androidx.leanback.widget.PagingIndicator.DOT_DIAMETER
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r4 = 0
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r0, r1)
            r0 = 417(0x1a1, double:2.06E-321)
            r4.setDuration(r0)
            android.animation.TimeInterpolator r5 = androidx.leanback.widget.PagingIndicator.DECELERATE_INTERPOLATOR
            r4.setInterpolator(r5)
            return r4
    }

    private android.animation.Animator createDotTranslationXAnimator() {
            r4 = this;
            android.util.Property<androidx.leanback.widget.PagingIndicator$Dot, java.lang.Float> r0 = androidx.leanback.widget.PagingIndicator.DOT_TRANSLATION_X
            r1 = 2
            float[] r1 = new float[r1]
            int r2 = r4.mArrowGap
            int r2 = -r2
            int r3 = r4.mDotGap
            int r2 = r2 + r3
            float r2 = (float) r2
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r3 = 0
            r1[r2] = r3
            r2 = 0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r2, r0, r1)
            r1 = 417(0x1a1, double:2.06E-321)
            r0.setDuration(r1)
            android.animation.TimeInterpolator r1 = androidx.leanback.widget.PagingIndicator.DECELERATE_INTERPOLATOR
            r0.setInterpolator(r1)
            return r0
    }

    private int getColorFromTypedArray(android.content.res.TypedArray r2, int r3, int r4) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r4 = r0.getColor(r4)
            int r2 = r2.getColor(r3, r4)
            return r2
    }

    private int getDesiredHeight() {
            r2 = this;
            int r0 = r2.getPaddingTop()
            int r1 = r2.mArrowDiameter
            int r0 = r0 + r1
            int r1 = r2.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r2.mShadowRadius
            int r1 = r1 + r0
            return r1
    }

    private int getDesiredWidth() {
            r2 = this;
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getRequiredWidth()
            int r0 = r0 + r1
            int r1 = r2.getPaddingRight()
            int r1 = r1 + r0
            return r1
    }

    private int getDimensionFromTypedArray(android.content.res.TypedArray r2, int r3, int r4) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r4 = r0.getDimensionPixelOffset(r4)
            int r2 = r2.getDimensionPixelOffset(r3, r4)
            return r2
    }

    private int getRequiredWidth() {
            r3 = this;
            int r0 = r3.mDotRadius
            int r0 = r0 * 2
            int r1 = r3.mArrowGap
            int r1 = r1 * 2
            int r1 = r1 + r0
            int r0 = r3.mPageCount
            int r0 = r0 + (-3)
            int r2 = r3.mDotGap
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    private android.graphics.Bitmap loadArrow() {
            r9 = this;
            android.content.res.Resources r0 = r9.getResources()
            int r1 = androidx.leanback.R.drawable.lb_ic_nav_arrow
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            boolean r0 = r9.mIsLtr
            if (r0 == 0) goto Lf
            return r2
        Lf:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.preScale(r0, r1)
            r3 = 0
            r4 = 0
            int r5 = r2.getWidth()
            int r6 = r2.getHeight()
            r8 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private void setSelectedPage(int r2) {
            r1 = this;
            int r0 = r1.mCurrentPage
            if (r2 != r0) goto L5
            return
        L5:
            r1.mCurrentPage = r2
            r1.adjustDotPosition()
            return
    }

    @androidx.annotation.VisibleForTesting
    public int[] getDotSelectedLeftX() {
            r1 = this;
            int[] r0 = r1.mDotSelectedPrevX
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public int[] getDotSelectedRightX() {
            r1 = this;
            int[] r0 = r1.mDotSelectedNextX
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public int[] getDotSelectedX() {
            r1 = this;
            int[] r0 = r1.mDotSelectedX
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public int getPageCount() {
            r1 = this;
            int r0 = r1.mPageCount
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r11) {
            r10 = this;
            r0 = 0
        L1:
            int r1 = r10.mPageCount
            if (r0 >= r1) goto L5c
            androidx.leanback.widget.PagingIndicator$Dot[] r1 = r10.mDots
            r1 = r1[r0]
            float r2 = r1.mCenterX
            float r3 = r1.mTranslationX
            float r2 = r2 + r3
            androidx.leanback.widget.PagingIndicator r3 = r1.this$0
            int r4 = r3.mDotCenterY
            float r4 = (float) r4
            float r5 = r1.mRadius
            android.graphics.Paint r3 = r3.mBgPaint
            r11.drawCircle(r2, r4, r5, r3)
            float r3 = r1.mAlpha
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L59
            androidx.leanback.widget.PagingIndicator r3 = r1.this$0
            android.graphics.Paint r3 = r3.mFgPaint
            int r4 = r1.mFgColor
            r3.setColor(r4)
            androidx.leanback.widget.PagingIndicator r3 = r1.this$0
            int r4 = r3.mDotCenterY
            float r4 = (float) r4
            float r5 = r1.mRadius
            android.graphics.Paint r3 = r3.mFgPaint
            r11.drawCircle(r2, r4, r5, r3)
            androidx.leanback.widget.PagingIndicator r3 = r1.this$0
            android.graphics.Bitmap r4 = r3.mArrow
            android.graphics.Rect r3 = r3.mArrowRect
            android.graphics.Rect r5 = new android.graphics.Rect
            float r6 = r1.mArrowImageRadius
            float r7 = r2 - r6
            int r7 = (int) r7
            androidx.leanback.widget.PagingIndicator r8 = r1.this$0
            int r8 = r8.mDotCenterY
            float r8 = (float) r8
            float r9 = r8 - r6
            int r9 = (int) r9
            float r2 = r2 + r6
            int r2 = (int) r2
            float r8 = r8 + r6
            int r6 = (int) r8
            r5.<init>(r7, r9, r2, r6)
            androidx.leanback.widget.PagingIndicator r1 = r1.this$0
            android.graphics.Paint r1 = r1.mArrowPaint
            r11.drawBitmap(r4, r3, r5, r1)
        L59:
            int r0 = r0 + 1
            goto L1
        L5c:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            int r0 = r4.getDesiredHeight()
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L16
            if (r1 == r2) goto L11
            goto L1e
        L11:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            goto L1e
        L16:
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r0 = java.lang.Math.min(r0, r6)
        L1e:
            int r6 = r4.getDesiredWidth()
            int r1 = android.view.View.MeasureSpec.getMode(r5)
            if (r1 == r3) goto L30
            if (r1 == r2) goto L2b
            goto L38
        L2b:
            int r6 = android.view.View.MeasureSpec.getSize(r5)
            goto L38
        L30:
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r6 = java.lang.Math.min(r6, r5)
        L38:
            r4.setMeasuredDimension(r6, r0)
            return
    }

    public void onPageSelected(int r3, boolean r4) {
            r2 = this;
            int r0 = r2.mCurrentPage
            if (r0 != r3) goto L5
            return
        L5:
            android.animation.AnimatorSet r0 = r2.mAnimator
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L12
            android.animation.AnimatorSet r0 = r2.mAnimator
            r0.end()
        L12:
            int r0 = r2.mCurrentPage
            r2.mPreviousPage = r0
            if (r4 == 0) goto L2f
            android.animation.AnimatorSet r4 = r2.mHideAnimator
            androidx.leanback.widget.PagingIndicator$Dot[] r1 = r2.mDots
            r0 = r1[r0]
            r4.setTarget(r0)
            android.animation.AnimatorSet r4 = r2.mShowAnimator
            androidx.leanback.widget.PagingIndicator$Dot[] r0 = r2.mDots
            r0 = r0[r3]
            r4.setTarget(r0)
            android.animation.AnimatorSet r4 = r2.mAnimator
            r4.start()
        L2f:
            r2.setSelectedPage(r3)
            return
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r5) {
            r4 = this;
            super.onRtlPropertiesChanged(r5)
            r0 = 0
            if (r5 != 0) goto L8
            r5 = 1
            goto L9
        L8:
            r5 = 0
        L9:
            boolean r1 = r4.mIsLtr
            if (r1 == r5) goto L34
            r4.mIsLtr = r5
            android.graphics.Bitmap r5 = r4.loadArrow()
            r4.mArrow = r5
            androidx.leanback.widget.PagingIndicator$Dot[] r5 = r4.mDots
            if (r5 == 0) goto L2e
            int r1 = r5.length
        L1a:
            if (r0 >= r1) goto L2e
            r2 = r5[r0]
            androidx.leanback.widget.PagingIndicator r3 = r2.this$0
            boolean r3 = r3.mIsLtr
            if (r3 == 0) goto L27
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L29
        L27:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L29:
            r2.mLayoutDirection = r3
            int r0 = r0 + 1
            goto L1a
        L2e:
            r4.calculateDotPositions()
            r4.invalidate()
        L34:
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.setMeasuredDimension(r1, r2)
            r0.calculateDotPositions()
            return
    }

    public void setArrowBackgroundColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.mDotFgSelectColor = r1
            return
    }

    public void setArrowColor(@androidx.annotation.ColorInt int r4) {
            r3 = this;
            android.graphics.Paint r0 = r3.mArrowPaint
            if (r0 != 0) goto Lb
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.mArrowPaint = r0
        Lb:
            android.graphics.Paint r0 = r3.mArrowPaint
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r4, r2)
            r0.setColorFilter(r1)
            return
    }

    public void setDotBackgroundColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mBgPaint
            r0.setColor(r2)
            return
    }

    public void setPageCount(int r4) {
            r3 = this;
            if (r4 <= 0) goto L21
            r3.mPageCount = r4
            androidx.leanback.widget.PagingIndicator$Dot[] r4 = new androidx.leanback.widget.PagingIndicator.Dot[r4]
            r3.mDots = r4
            r4 = 0
            r0 = 0
        La:
            int r1 = r3.mPageCount
            if (r0 >= r1) goto L1a
            androidx.leanback.widget.PagingIndicator$Dot[] r1 = r3.mDots
            androidx.leanback.widget.PagingIndicator$Dot r2 = new androidx.leanback.widget.PagingIndicator$Dot
            r2.<init>(r3)
            r1[r0] = r2
            int r0 = r0 + 1
            goto La
        L1a:
            r3.calculateDotPositions()
            r3.setSelectedPage(r4)
            return
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The page count should be a positive integer"
            r4.<init>(r0)
            throw r4
    }
}
