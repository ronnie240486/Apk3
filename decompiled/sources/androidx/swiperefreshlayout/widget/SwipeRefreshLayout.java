package androidx.swiperefreshlayout.widget;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeRefreshLayout extends android.view.ViewGroup implements androidx.core.view.NestedScrollingParent, androidx.core.view.NestedScrollingChild {
    private static final int ALPHA_ANIMATION_DURATION = 300;
    private static final int ANIMATE_TO_START_DURATION = 200;
    private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
    private static final int CIRCLE_BG_LIGHT = -328966;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    public static final int DEFAULT = 1;
    private static final int DEFAULT_CIRCLE_TARGET = 64;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    private static final float DRAG_RATE = 0.5f;
    private static final int INVALID_POINTER = -1;
    public static final int LARGE = 0;
    private static final int[] LAYOUT_ATTRS = null;
    private static final java.lang.String LOG_TAG = null;
    private static final int MAX_ALPHA = 255;
    private static final float MAX_PROGRESS_ANGLE = 0.8f;
    private static final int SCALE_DOWN_DURATION = 150;
    private static final int STARTING_PROGRESS_ALPHA = 76;
    private int mActivePointerId;
    private android.view.animation.Animation mAlphaMaxAnimation;
    private android.view.animation.Animation mAlphaStartAnimation;
    private final android.view.animation.Animation mAnimateToCorrectPosition;
    private final android.view.animation.Animation mAnimateToStartPosition;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnChildScrollUpCallback mChildScrollUpCallback;
    private int mCircleDiameter;
    public androidx.swiperefreshlayout.widget.CircleImageView mCircleView;
    private int mCircleViewIndex;
    public int mCurrentTargetOffsetTop;
    public int mCustomSlingshotDistance;
    private final android.view.animation.DecelerateInterpolator mDecelerateInterpolator;
    public int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    public androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    private boolean mNestedScrollInProgress;
    private final androidx.core.view.NestedScrollingChildHelper mNestedScrollingChildHelper;
    private final androidx.core.view.NestedScrollingParentHelper mNestedScrollingParentHelper;
    public boolean mNotify;
    public int mOriginalOffsetTop;
    private final int[] mParentOffsetInWindow;
    private final int[] mParentScrollConsumed;
    public androidx.swiperefreshlayout.widget.CircularProgressDrawable mProgress;
    private android.view.animation.Animation.AnimationListener mRefreshListener;
    public boolean mRefreshing;
    private boolean mReturningToStart;
    public boolean mScale;
    private android.view.animation.Animation mScaleAnimation;
    private android.view.animation.Animation mScaleDownAnimation;
    private android.view.animation.Animation mScaleDownToStartAnimation;
    public int mSpinnerOffsetEnd;
    public float mStartingScale;
    private android.view.View mTarget;
    private float mTotalDragDistance;
    private float mTotalUnconsumed;
    private int mTouchSlop;
    public boolean mUsingCustomStart;









    /* JADX INFO: loaded from: classes3.dex */
    public interface OnChildScrollUpCallback {
        boolean canChildScrollUp(@androidx.annotation.NonNull androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1, @androidx.annotation.Nullable android.view.View r2);
    }

    public interface OnRefreshListener {
        void onRefresh();
    }

    static {
            java.lang.Class<androidx.swiperefreshlayout.widget.SwipeRefreshLayout> r0 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.class
            java.lang.String r0 = "SwipeRefreshLayout"
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout.LOG_TAG = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842766(0x101000e, float:2.3693597E-38)
            r0[r1] = r2
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout.LAYOUT_ATTRS = r0
            return
    }

    public SwipeRefreshLayout(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SwipeRefreshLayout(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.Nullable android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            r0 = 0
            r4.mRefreshing = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.mTotalDragDistance = r1
            r1 = 2
            int[] r2 = new int[r1]
            r4.mParentScrollConsumed = r2
            int[] r1 = new int[r1]
            r4.mParentOffsetInWindow = r1
            r1 = -1
            r4.mActivePointerId = r1
            r4.mCircleViewIndex = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$1 r1 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$1
            r1.<init>(r4)
            r4.mRefreshListener = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$6 r1 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$6
            r1.<init>(r4)
            r4.mAnimateToCorrectPosition = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$7 r1 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$7
            r1.<init>(r4)
            r4.mAnimateToStartPosition = r1
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r5)
            int r1 = r1.getScaledTouchSlop()
            r4.mTouchSlop = r1
            android.content.res.Resources r1 = r4.getResources()
            r2 = 17694721(0x10e0001, float:2.6081284E-38)
            int r1 = r1.getInteger(r2)
            r4.mMediumAnimationDuration = r1
            r4.setWillNotDraw(r0)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r2)
            r4.mDecelerateInterpolator = r1
            android.content.res.Resources r1 = r4.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r2 = r1.density
            r3 = 1109393408(0x42200000, float:40.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            r4.mCircleDiameter = r2
            r4.createProgressView()
            r2 = 1
            r4.setChildrenDrawingOrderEnabled(r2)
            float r1 = r1.density
            r3 = 1115684864(0x42800000, float:64.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            r4.mSpinnerOffsetEnd = r1
            float r1 = (float) r1
            r4.mTotalDragDistance = r1
            androidx.core.view.NestedScrollingParentHelper r1 = new androidx.core.view.NestedScrollingParentHelper
            r1.<init>(r4)
            r4.mNestedScrollingParentHelper = r1
            androidx.core.view.NestedScrollingChildHelper r1 = new androidx.core.view.NestedScrollingChildHelper
            r1.<init>(r4)
            r4.mNestedScrollingChildHelper = r1
            r4.setNestedScrollingEnabled(r2)
            int r1 = r4.mCircleDiameter
            int r1 = -r1
            r4.mCurrentTargetOffsetTop = r1
            r4.mOriginalOffsetTop = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.moveToStart(r1)
            int[] r1 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.LAYOUT_ATTRS
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r1)
            boolean r6 = r5.getBoolean(r0, r2)
            r4.setEnabled(r6)
            r5.recycle()
            return
    }

    private void animateOffsetToCorrectPosition(int r3, android.view.animation.Animation.AnimationListener r4) {
            r2 = this;
            r2.mFrom = r3
            android.view.animation.Animation r3 = r2.mAnimateToCorrectPosition
            r3.reset()
            android.view.animation.Animation r3 = r2.mAnimateToCorrectPosition
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            android.view.animation.Animation r3 = r2.mAnimateToCorrectPosition
            android.view.animation.DecelerateInterpolator r0 = r2.mDecelerateInterpolator
            r3.setInterpolator(r0)
            if (r4 == 0) goto L1c
            androidx.swiperefreshlayout.widget.CircleImageView r3 = r2.mCircleView
            r3.setAnimationListener(r4)
        L1c:
            androidx.swiperefreshlayout.widget.CircleImageView r3 = r2.mCircleView
            r3.clearAnimation()
            androidx.swiperefreshlayout.widget.CircleImageView r3 = r2.mCircleView
            android.view.animation.Animation r4 = r2.mAnimateToCorrectPosition
            r3.startAnimation(r4)
            return
    }

    private void animateOffsetToStartPosition(int r3, android.view.animation.Animation.AnimationListener r4) {
            r2 = this;
            boolean r0 = r2.mScale
            if (r0 == 0) goto L8
            r2.startScaleDownReturnToStartAnimation(r3, r4)
            goto L30
        L8:
            r2.mFrom = r3
            android.view.animation.Animation r3 = r2.mAnimateToStartPosition
            r3.reset()
            android.view.animation.Animation r3 = r2.mAnimateToStartPosition
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            android.view.animation.Animation r3 = r2.mAnimateToStartPosition
            android.view.animation.DecelerateInterpolator r0 = r2.mDecelerateInterpolator
            r3.setInterpolator(r0)
            if (r4 == 0) goto L24
            androidx.swiperefreshlayout.widget.CircleImageView r3 = r2.mCircleView
            r3.setAnimationListener(r4)
        L24:
            androidx.swiperefreshlayout.widget.CircleImageView r3 = r2.mCircleView
            r3.clearAnimation()
            androidx.swiperefreshlayout.widget.CircleImageView r3 = r2.mCircleView
            android.view.animation.Animation r4 = r2.mAnimateToStartPosition
            r3.startAnimation(r4)
        L30:
            return
    }

    private void createProgressView() {
            r2 = this;
            androidx.swiperefreshlayout.widget.CircleImageView r0 = new androidx.swiperefreshlayout.widget.CircleImageView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.mCircleView = r0
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r0 = new androidx.swiperefreshlayout.widget.CircularProgressDrawable
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.mProgress = r0
            r1 = 1
            r0.setStyle(r1)
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r2.mCircleView
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r1 = r2.mProgress
            r0.setImageDrawable(r1)
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r2.mCircleView
            r1 = 8
            r0.setVisibility(r1)
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r2.mCircleView
            r2.addView(r0)
            return
    }

    private void ensureTarget() {
            r3 = this;
            android.view.View r0 = r3.mTarget
            if (r0 != 0) goto L1d
            r0 = 0
        L5:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L1d
            android.view.View r1 = r3.getChildAt(r0)
            androidx.swiperefreshlayout.widget.CircleImageView r2 = r3.mCircleView
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L1a
            r3.mTarget = r1
            goto L1d
        L1a:
            int r0 = r0 + 1
            goto L5
        L1d:
            return
    }

    private void finishSpinner(float r3) {
            r2 = this;
            float r0 = r2.mTotalDragDistance
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto Lb
            r3 = 1
            r2.setRefreshing(r3, r3)
            goto L28
        Lb:
            r3 = 0
            r2.mRefreshing = r3
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r0 = r2.mProgress
            r1 = 0
            r0.setStartEndTrim(r1, r1)
            r0 = 0
            boolean r1 = r2.mScale
            if (r1 != 0) goto L1e
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$5 r0 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$5
            r0.<init>(r2)
        L1e:
            int r1 = r2.mCurrentTargetOffsetTop
            r2.animateOffsetToStartPosition(r1, r0)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r0 = r2.mProgress
            r0.setArrowEnabled(r3)
        L28:
            return
    }

    private boolean isAnimationRunning(android.view.animation.Animation r2) {
            r1 = this;
            if (r2 == 0) goto L10
            boolean r0 = r2.hasStarted()
            if (r0 == 0) goto L10
            boolean r2 = r2.hasEnded()
            if (r2 != 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    private void moveSpinner(float r12) {
            r11 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r0 = r11.mProgress
            r1 = 1
            r0.setArrowEnabled(r1)
            float r0 = r11.mTotalDragDistance
            float r0 = r12 / r0
            float r0 = java.lang.Math.abs(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r1, r0)
            double r2 = (double) r0
            r4 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r2 = r2 - r4
            r4 = 0
            double r2 = java.lang.Math.max(r2, r4)
            float r2 = (float) r2
            r3 = 1084227584(0x40a00000, float:5.0)
            float r2 = r2 * r3
            r3 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 / r3
            float r3 = java.lang.Math.abs(r12)
            float r4 = r11.mTotalDragDistance
            float r3 = r3 - r4
            int r4 = r11.mCustomSlingshotDistance
            if (r4 <= 0) goto L36
        L34:
            float r4 = (float) r4
            goto L43
        L36:
            boolean r4 = r11.mUsingCustomStart
            if (r4 == 0) goto L40
            int r4 = r11.mSpinnerOffsetEnd
            int r5 = r11.mOriginalOffsetTop
            int r4 = r4 - r5
            goto L34
        L40:
            int r4 = r11.mSpinnerOffsetEnd
            goto L34
        L43:
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r4 * r5
            float r3 = java.lang.Math.min(r3, r6)
            float r3 = r3 / r4
            r6 = 0
            float r3 = java.lang.Math.max(r6, r3)
            r7 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 / r7
            double r7 = (double) r3
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r9 = java.lang.Math.pow(r7, r9)
            double r7 = r7 - r9
            float r3 = (float) r7
            float r3 = r3 * r5
            float r7 = r4 * r3
            float r7 = r7 * r5
            int r8 = r11.mOriginalOffsetTop
            float r4 = r4 * r0
            float r4 = r4 + r7
            int r0 = (int) r4
            int r8 = r8 + r0
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r11.mCircleView
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L78
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r11.mCircleView
            r4 = 0
            r0.setVisibility(r4)
        L78:
            boolean r0 = r11.mScale
            if (r0 != 0) goto L86
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r11.mCircleView
            r0.setScaleX(r1)
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r11.mCircleView
            r0.setScaleY(r1)
        L86:
            boolean r0 = r11.mScale
            if (r0 == 0) goto L95
            float r0 = r11.mTotalDragDistance
            float r0 = r12 / r0
            float r0 = java.lang.Math.min(r1, r0)
            r11.setAnimationProgress(r0)
        L95:
            float r0 = r11.mTotalDragDistance
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 >= 0) goto Lb1
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r12 = r11.mProgress
            int r12 = r12.getAlpha()
            r0 = 76
            if (r12 <= r0) goto Lc6
            android.view.animation.Animation r12 = r11.mAlphaStartAnimation
            boolean r12 = r11.isAnimationRunning(r12)
            if (r12 != 0) goto Lc6
            r11.startProgressAlphaStartAnimation()
            goto Lc6
        Lb1:
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r12 = r11.mProgress
            int r12 = r12.getAlpha()
            r0 = 255(0xff, float:3.57E-43)
            if (r12 >= r0) goto Lc6
            android.view.animation.Animation r12 = r11.mAlphaMaxAnimation
            boolean r12 = r11.isAnimationRunning(r12)
            if (r12 != 0) goto Lc6
            r11.startProgressAlphaMaxAnimation()
        Lc6:
            r12 = 1061997773(0x3f4ccccd, float:0.8)
            float r0 = r2 * r12
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r4 = r11.mProgress
            float r12 = java.lang.Math.min(r12, r0)
            r4.setStartEndTrim(r6, r12)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r12 = r11.mProgress
            float r0 = java.lang.Math.min(r1, r2)
            r12.setArrowScale(r0)
            r12 = -1098907648(0xffffffffbe800000, float:-0.25)
            r0 = 1053609165(0x3ecccccd, float:0.4)
            float r2 = r2 * r0
            float r2 = r2 + r12
            float r3 = r3 * r5
            float r3 = r3 + r2
            r12 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r12
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r12 = r11.mProgress
            r12.setProgressRotation(r3)
            int r12 = r11.mCurrentTargetOffsetTop
            int r8 = r8 - r12
            r11.setTargetOffsetTopAndBottom(r8)
            return
    }

    private void onSecondaryPointerUp(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.mActivePointerId
            if (r1 != r2) goto L17
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            int r4 = r4.getPointerId(r0)
            r3.mActivePointerId = r4
        L17:
            return
    }

    private void setColorViewAlpha(int r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r1.mCircleView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.setAlpha(r2)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r0 = r1.mProgress
            r0.setAlpha(r2)
            return
    }

    private void setRefreshing(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.mRefreshing
            if (r0 == r2) goto L1a
            r1.mNotify = r3
            r1.ensureTarget()
            r1.mRefreshing = r2
            if (r2 == 0) goto L15
            int r2 = r1.mCurrentTargetOffsetTop
            android.view.animation.Animation$AnimationListener r3 = r1.mRefreshListener
            r1.animateOffsetToCorrectPosition(r2, r3)
            goto L1a
        L15:
            android.view.animation.Animation$AnimationListener r2 = r1.mRefreshListener
            r1.startScaleDownAnimation(r2)
        L1a:
            return
    }

    private android.view.animation.Animation startAlphaAnimation(int r2, int r3) {
            r1 = this;
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$4 r0 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$4
            r0.<init>(r1, r2, r3)
            r2 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r2)
            androidx.swiperefreshlayout.widget.CircleImageView r2 = r1.mCircleView
            r3 = 0
            r2.setAnimationListener(r3)
            androidx.swiperefreshlayout.widget.CircleImageView r2 = r1.mCircleView
            r2.clearAnimation()
            androidx.swiperefreshlayout.widget.CircleImageView r2 = r1.mCircleView
            r2.startAnimation(r0)
            return r0
    }

    private void startDragging(float r4) {
            r3 = this;
            float r0 = r3.mInitialDownY
            float r4 = r4 - r0
            int r1 = r3.mTouchSlop
            float r2 = (float) r1
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            boolean r4 = r3.mIsBeingDragged
            if (r4 != 0) goto L1c
            float r4 = (float) r1
            float r0 = r0 + r4
            r3.mInitialMotionY = r0
            r4 = 1
            r3.mIsBeingDragged = r4
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r4 = r3.mProgress
            r0 = 76
            r4.setAlpha(r0)
        L1c:
            return
    }

    private void startProgressAlphaMaxAnimation() {
            r2 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r0 = r2.mProgress
            int r0 = r0.getAlpha()
            r1 = 255(0xff, float:3.57E-43)
            android.view.animation.Animation r0 = r2.startAlphaAnimation(r0, r1)
            r2.mAlphaMaxAnimation = r0
            return
    }

    private void startProgressAlphaStartAnimation() {
            r2 = this;
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r0 = r2.mProgress
            int r0 = r0.getAlpha()
            r1 = 76
            android.view.animation.Animation r0 = r2.startAlphaAnimation(r0, r1)
            r2.mAlphaStartAnimation = r0
            return
    }

    private void startScaleDownReturnToStartAnimation(int r3, android.view.animation.Animation.AnimationListener r4) {
            r2 = this;
            r2.mFrom = r3
            androidx.swiperefreshlayout.widget.CircleImageView r3 = r2.mCircleView
            float r3 = r3.getScaleX()
            r2.mStartingScale = r3
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$8 r3 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$8
            r3.<init>(r2)
            r2.mScaleDownToStartAnimation = r3
            r0 = 150(0x96, double:7.4E-322)
            r3.setDuration(r0)
            if (r4 == 0) goto L1d
            androidx.swiperefreshlayout.widget.CircleImageView r3 = r2.mCircleView
            r3.setAnimationListener(r4)
        L1d:
            androidx.swiperefreshlayout.widget.CircleImageView r3 = r2.mCircleView
            r3.clearAnimation()
            androidx.swiperefreshlayout.widget.CircleImageView r3 = r2.mCircleView
            android.view.animation.Animation r4 = r2.mScaleDownToStartAnimation
            r3.startAnimation(r4)
            return
    }

    private void startScaleUpAnimation(android.view.animation.Animation.AnimationListener r4) {
            r3 = this;
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r3.mCircleView
            r1 = 0
            r0.setVisibility(r1)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r0 = r3.mProgress
            r1 = 255(0xff, float:3.57E-43)
            r0.setAlpha(r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$2 r0 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$2
            r0.<init>(r3)
            r3.mScaleAnimation = r0
            int r1 = r3.mMediumAnimationDuration
            long r1 = (long) r1
            r0.setDuration(r1)
            if (r4 == 0) goto L21
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r3.mCircleView
            r0.setAnimationListener(r4)
        L21:
            androidx.swiperefreshlayout.widget.CircleImageView r4 = r3.mCircleView
            r4.clearAnimation()
            androidx.swiperefreshlayout.widget.CircleImageView r4 = r3.mCircleView
            android.view.animation.Animation r0 = r3.mScaleAnimation
            r4.startAnimation(r0)
            return
    }

    public boolean canChildScrollUp() {
            r3 = this;
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$OnChildScrollUpCallback r0 = r3.mChildScrollUpCallback
            if (r0 == 0) goto Lb
            android.view.View r1 = r3.mTarget
            boolean r0 = r0.canChildScrollUp(r3, r1)
            return r0
        Lb:
            android.view.View r0 = r3.mTarget
            boolean r1 = r0 instanceof android.widget.ListView
            r2 = -1
            if (r1 == 0) goto L19
            android.widget.ListView r0 = (android.widget.ListView) r0
            boolean r0 = androidx.core.widget.ListViewCompat.canScrollList(r0, r2)
            return r0
        L19:
            boolean r0 = r0.canScrollVertically(r2)
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mNestedScrollingChildHelper
            boolean r2 = r0.dispatchNestedFling(r2, r3, r4)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mNestedScrollingChildHelper
            boolean r2 = r0.dispatchNestedPreFling(r2, r3)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int r2, int r3, int[] r4, int[] r5) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mNestedScrollingChildHelper
            boolean r2 = r0.dispatchNestedPreScroll(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.mNestedScrollingChildHelper
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r2, int r3) {
            r1 = this;
            int r0 = r1.mCircleViewIndex
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r2 = r2 + (-1)
            if (r3 != r2) goto La
            return r0
        La:
            if (r3 < r0) goto Le
            int r3 = r3 + 1
        Le:
            return r3
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mNestedScrollingParentHelper
            int r0 = r0.getNestedScrollAxes()
            return r0
    }

    public int getProgressCircleDiameter() {
            r1 = this;
            int r0 = r1.mCircleDiameter
            return r0
    }

    public int getProgressViewEndOffset() {
            r1 = this;
            int r0 = r1.mSpinnerOffsetEnd
            return r0
    }

    public int getProgressViewStartOffset() {
            r1 = this;
            int r0 = r1.mOriginalOffsetTop
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mNestedScrollingChildHelper
            boolean r0 = r0.hasNestedScrollingParent()
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mNestedScrollingChildHelper
            boolean r0 = r0.isNestedScrollingEnabled()
            return r0
    }

    public boolean isRefreshing() {
            r1 = this;
            boolean r0 = r1.mRefreshing
            return r0
    }

    public final void moveToStart(float r3) {
            r2 = this;
            int r0 = r2.mFrom
            int r1 = r2.mOriginalOffsetTop
            int r1 = r1 - r0
            float r1 = (float) r1
            float r1 = r1 * r3
            int r3 = (int) r1
            int r0 = r0 + r3
            androidx.swiperefreshlayout.widget.CircleImageView r3 = r2.mCircleView
            int r3 = r3.getTop()
            int r0 = r0 - r3
            r2.setTargetOffsetTopAndBottom(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.reset()
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            r4.ensureTarget()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.mReturningToStart
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r4.mReturningToStart = r2
        L10:
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L81
            boolean r1 = r4.mReturningToStart
            if (r1 != 0) goto L81
            boolean r1 = r4.canChildScrollUp()
            if (r1 != 0) goto L81
            boolean r1 = r4.mRefreshing
            if (r1 != 0) goto L81
            boolean r1 = r4.mNestedScrollInProgress
            if (r1 == 0) goto L29
            goto L81
        L29:
            if (r0 == 0) goto L5d
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L58
            r1 = 6
            if (r0 == r1) goto L39
            goto L7e
        L39:
            r4.onSecondaryPointerUp(r5)
            goto L7e
        L3d:
            int r0 = r4.mActivePointerId
            if (r0 != r3) goto L49
            java.lang.String r5 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.LOG_TAG
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r0)
            return r2
        L49:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L50
            return r2
        L50:
            float r5 = r5.getY(r0)
            r4.startDragging(r5)
            goto L7e
        L58:
            r4.mIsBeingDragged = r2
            r4.mActivePointerId = r3
            goto L7e
        L5d:
            int r0 = r4.mOriginalOffsetTop
            androidx.swiperefreshlayout.widget.CircleImageView r1 = r4.mCircleView
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.mActivePointerId = r0
            r4.mIsBeingDragged = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L78
            return r2
        L78:
            float r5 = r5.getY(r0)
            r4.mInitialDownY = r5
        L7e:
            boolean r5 = r4.mIsBeingDragged
            return r5
        L81:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r3 = r2.getMeasuredWidth()
            int r4 = r2.getMeasuredHeight()
            int r5 = r2.getChildCount()
            if (r5 != 0) goto Lf
            return
        Lf:
            android.view.View r5 = r2.mTarget
            if (r5 != 0) goto L16
            r2.ensureTarget()
        L16:
            android.view.View r5 = r2.mTarget
            if (r5 != 0) goto L1b
            return
        L1b:
            int r6 = r2.getPaddingLeft()
            int r7 = r2.getPaddingTop()
            int r0 = r2.getPaddingLeft()
            int r0 = r3 - r0
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r2.getPaddingTop()
            int r4 = r4 - r1
            int r1 = r2.getPaddingBottom()
            int r4 = r4 - r1
            int r0 = r0 + r6
            int r4 = r4 + r7
            r5.layout(r6, r7, r0, r4)
            androidx.swiperefreshlayout.widget.CircleImageView r4 = r2.mCircleView
            int r4 = r4.getMeasuredWidth()
            androidx.swiperefreshlayout.widget.CircleImageView r5 = r2.mCircleView
            int r5 = r5.getMeasuredHeight()
            androidx.swiperefreshlayout.widget.CircleImageView r6 = r2.mCircleView
            int r3 = r3 / 2
            int r4 = r4 / 2
            int r7 = r3 - r4
            int r0 = r2.mCurrentTargetOffsetTop
            int r3 = r3 + r4
            int r5 = r5 + r0
            r6.layout(r7, r0, r3, r5)
            return
    }

    @Override // android.view.View
    public void onMeasure(int r4, int r5) {
            r3 = this;
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.mTarget
            if (r4 != 0) goto La
            r3.ensureTarget()
        La:
            android.view.View r4 = r3.mTarget
            if (r4 != 0) goto Lf
            return
        Lf:
            int r5 = r3.getMeasuredWidth()
            int r0 = r3.getPaddingLeft()
            int r5 = r5 - r0
            int r0 = r3.getPaddingRight()
            int r5 = r5 - r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            int r1 = r3.getMeasuredHeight()
            int r2 = r3.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r3.getPaddingBottom()
            int r1 = r1 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r4.measure(r5, r1)
            androidx.swiperefreshlayout.widget.CircleImageView r4 = r3.mCircleView
            int r5 = r3.mCircleDiameter
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            int r1 = r3.mCircleDiameter
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r4.measure(r5, r0)
            r4 = -1
            r3.mCircleViewIndex = r4
            r4 = 0
        L4d:
            int r5 = r3.getChildCount()
            if (r4 >= r5) goto L61
            android.view.View r5 = r3.getChildAt(r4)
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r3.mCircleView
            if (r5 != r0) goto L5e
            r3.mCircleViewIndex = r4
            goto L61
        L5e:
            int r4 = r4 + 1
            goto L4d
        L61:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            boolean r1 = r0.dispatchNestedFling(r2, r3, r4)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            boolean r1 = r0.dispatchNestedPreFling(r2, r3)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View r5, int r6, int r7, int[] r8) {
            r4 = this;
            r5 = 0
            r0 = 1
            if (r7 <= 0) goto L21
            float r1 = r4.mTotalUnconsumed
            int r2 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r2 <= 0) goto L21
            float r2 = (float) r7
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto L17
            int r1 = (int) r1
            int r1 = r7 - r1
            r8[r0] = r1
            r4.mTotalUnconsumed = r5
            goto L1c
        L17:
            float r1 = r1 - r2
            r4.mTotalUnconsumed = r1
            r8[r0] = r7
        L1c:
            float r1 = r4.mTotalUnconsumed
            r4.moveSpinner(r1)
        L21:
            boolean r1 = r4.mUsingCustomStart
            if (r1 == 0) goto L3e
            if (r7 <= 0) goto L3e
            float r1 = r4.mTotalUnconsumed
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L3e
            r5 = r8[r0]
            int r5 = r7 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r5 <= 0) goto L3e
            androidx.swiperefreshlayout.widget.CircleImageView r5 = r4.mCircleView
            r1 = 8
            r5.setVisibility(r1)
        L3e:
            int[] r5 = r4.mParentScrollConsumed
            r1 = 0
            r2 = r8[r1]
            int r6 = r6 - r2
            r2 = r8[r0]
            int r7 = r7 - r2
            r2 = 0
            boolean r6 = r4.dispatchNestedPreScroll(r6, r7, r5, r2)
            if (r6 == 0) goto L5c
            r6 = r8[r1]
            r7 = r5[r1]
            int r6 = r6 + r7
            r8[r1] = r6
            r6 = r8[r0]
            r5 = r5[r0]
            int r6 = r6 + r5
            r8[r0] = r6
        L5c:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            int[] r5 = r6.mParentOffsetInWindow
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            int[] r7 = r6.mParentOffsetInWindow
            r8 = 1
            r7 = r7[r8]
            int r11 = r11 + r7
            if (r11 >= 0) goto L25
            boolean r7 = r6.canChildScrollUp()
            if (r7 != 0) goto L25
            float r7 = r6.mTotalUnconsumed
            int r8 = java.lang.Math.abs(r11)
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.mTotalUnconsumed = r7
            r6.moveSpinner(r7)
        L25:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mNestedScrollingParentHelper
            r0.onNestedScrollAccepted(r2, r3, r4)
            r2 = r4 & 2
            r1.startNestedScroll(r2)
            r2 = 0
            r1.mTotalUnconsumed = r2
            r2 = 1
            r1.mNestedScrollInProgress = r2
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L14
            boolean r1 = r0.mReturningToStart
            if (r1 != 0) goto L14
            boolean r1 = r0.mRefreshing
            if (r1 != 0) goto L14
            r1 = r3 & 2
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View r3) {
            r2 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r2.mNestedScrollingParentHelper
            r0.onStopNestedScroll(r3)
            r3 = 0
            r2.mNestedScrollInProgress = r3
            float r3 = r2.mTotalUnconsumed
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L14
            r2.finishSpinner(r3)
            r2.mTotalUnconsumed = r0
        L14:
            r2.stopNestedScroll()
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            boolean r1 = r5.mReturningToStart
            r2 = 0
            if (r1 == 0) goto Ld
            if (r0 != 0) goto Ld
            r5.mReturningToStart = r2
        Ld:
            boolean r1 = r5.isEnabled()
            if (r1 == 0) goto Laf
            boolean r1 = r5.mReturningToStart
            if (r1 != 0) goto Laf
            boolean r1 = r5.canChildScrollUp()
            if (r1 != 0) goto Laf
            boolean r1 = r5.mRefreshing
            if (r1 != 0) goto Laf
            boolean r1 = r5.mNestedScrollInProgress
            if (r1 == 0) goto L27
            goto Laf
        L27:
            r1 = 1
            if (r0 == 0) goto La6
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 == r1) goto L80
            r4 = 2
            if (r0 == r4) goto L56
            r3 = 3
            if (r0 == r3) goto L55
            r3 = 5
            if (r0 == r3) goto L40
            r2 = 6
            if (r0 == r2) goto L3c
            goto Lae
        L3c:
            r5.onSecondaryPointerUp(r6)
            goto Lae
        L40:
            int r0 = r6.getActionIndex()
            if (r0 >= 0) goto L4e
            java.lang.String r6 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.LOG_TAG
            java.lang.String r0 = "Got ACTION_POINTER_DOWN event but have an invalid action index."
            android.util.Log.e(r6, r0)
            return r2
        L4e:
            int r6 = r6.getPointerId(r0)
            r5.mActivePointerId = r6
            goto Lae
        L55:
            return r2
        L56:
            int r0 = r5.mActivePointerId
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L66
            java.lang.String r6 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.LOG_TAG
            java.lang.String r0 = "Got ACTION_MOVE event but have an invalid active pointer id."
            android.util.Log.e(r6, r0)
            return r2
        L66:
            float r6 = r6.getY(r0)
            r5.startDragging(r6)
            boolean r0 = r5.mIsBeingDragged
            if (r0 == 0) goto Lae
            float r0 = r5.mInitialMotionY
            float r6 = r6 - r0
            float r6 = r6 * r3
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7f
            r5.moveSpinner(r6)
            goto Lae
        L7f:
            return r2
        L80:
            int r0 = r5.mActivePointerId
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L90
            java.lang.String r6 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.LOG_TAG
            java.lang.String r0 = "Got ACTION_UP event but don't have an active pointer id."
            android.util.Log.e(r6, r0)
            return r2
        L90:
            boolean r1 = r5.mIsBeingDragged
            if (r1 == 0) goto La2
            float r6 = r6.getY(r0)
            float r0 = r5.mInitialMotionY
            float r6 = r6 - r0
            float r6 = r6 * r3
            r5.mIsBeingDragged = r2
            r5.finishSpinner(r6)
        La2:
            r6 = -1
            r5.mActivePointerId = r6
            return r2
        La6:
            int r6 = r6.getPointerId(r2)
            r5.mActivePointerId = r6
            r5.mIsBeingDragged = r2
        Lae:
            return r1
        Laf:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r2) {
            r1 = this;
            android.view.View r0 = r1.mTarget
            if (r0 == 0) goto Lb
            boolean r0 = androidx.core.view.ViewCompat.isNestedScrollingEnabled(r0)
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            super.requestDisallowInterceptTouchEvent(r2)
        Le:
            return
    }

    public final void reset() {
            r2 = this;
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r2.mCircleView
            r0.clearAnimation()
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r0 = r2.mProgress
            r0.stop()
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r2.mCircleView
            r1 = 8
            r0.setVisibility(r1)
            r0 = 255(0xff, float:3.57E-43)
            r2.setColorViewAlpha(r0)
            boolean r0 = r2.mScale
            if (r0 == 0) goto L1f
            r0 = 0
            r2.setAnimationProgress(r0)
            goto L27
        L1f:
            int r0 = r2.mOriginalOffsetTop
            int r1 = r2.mCurrentTargetOffsetTop
            int r0 = r0 - r1
            r2.setTargetOffsetTopAndBottom(r0)
        L27:
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r2.mCircleView
            int r0 = r0.getTop()
            r2.mCurrentTargetOffsetTop = r0
            return
    }

    public void setAnimationProgress(float r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r1.mCircleView
            r0.setScaleX(r2)
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r1.mCircleView
            r0.setScaleY(r2)
            return
    }

    @java.lang.Deprecated
    public void setColorScheme(@androidx.annotation.ColorRes int... r1) {
            r0 = this;
            r0.setColorSchemeResources(r1)
            return
    }

    public void setColorSchemeColors(@androidx.annotation.ColorInt int... r2) {
            r1 = this;
            r1.ensureTarget()
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r0 = r1.mProgress
            r0.setColorSchemeColors(r2)
            return
    }

    public void setColorSchemeResources(@androidx.annotation.ColorRes int... r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            int r1 = r5.length
            int[] r1 = new int[r1]
            r2 = 0
        L8:
            int r3 = r5.length
            if (r2 >= r3) goto L16
            r3 = r5[r2]
            int r3 = androidx.core.content.ContextCompat.getColor(r0, r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L8
        L16:
            r4.setColorSchemeColors(r1)
            return
    }

    public void setDistanceToTriggerSync(int r1) {
            r0 = this;
            float r1 = (float) r1
            r0.mTotalDragDistance = r1
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
            r0 = this;
            super.setEnabled(r1)
            if (r1 != 0) goto L8
            r0.reset()
        L8:
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mNestedScrollingChildHelper
            r0.setNestedScrollingEnabled(r2)
            return
    }

    public void setOnChildScrollUpCallback(@androidx.annotation.Nullable androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnChildScrollUpCallback r1) {
            r0 = this;
            r0.mChildScrollUpCallback = r1
            return
    }

    public void setOnRefreshListener(@androidx.annotation.Nullable androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener r1) {
            r0 = this;
            r0.mListener = r1
            return
    }

    @java.lang.Deprecated
    public void setProgressBackgroundColor(int r1) {
            r0 = this;
            r0.setProgressBackgroundColorSchemeResource(r1)
            return
    }

    public void setProgressBackgroundColorSchemeColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r1.mCircleView
            r0.setBackgroundColor(r2)
            return
    }

    public void setProgressBackgroundColorSchemeResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.setProgressBackgroundColorSchemeColor(r2)
            return
    }

    public void setProgressViewEndTarget(boolean r1, int r2) {
            r0 = this;
            r0.mSpinnerOffsetEnd = r2
            r0.mScale = r1
            androidx.swiperefreshlayout.widget.CircleImageView r1 = r0.mCircleView
            r1.invalidate()
            return
    }

    public void setProgressViewOffset(boolean r1, int r2, int r3) {
            r0 = this;
            r0.mScale = r1
            r0.mOriginalOffsetTop = r2
            r0.mSpinnerOffsetEnd = r3
            r1 = 1
            r0.mUsingCustomStart = r1
            r0.reset()
            r1 = 0
            r0.mRefreshing = r1
            return
    }

    public void setRefreshing(boolean r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L23
            boolean r1 = r2.mRefreshing
            if (r1 == r3) goto L23
            r2.mRefreshing = r3
            boolean r3 = r2.mUsingCustomStart
            if (r3 != 0) goto L13
            int r3 = r2.mSpinnerOffsetEnd
            int r1 = r2.mOriginalOffsetTop
            int r3 = r3 + r1
            goto L15
        L13:
            int r3 = r2.mSpinnerOffsetEnd
        L15:
            int r1 = r2.mCurrentTargetOffsetTop
            int r3 = r3 - r1
            r2.setTargetOffsetTopAndBottom(r3)
            r2.mNotify = r0
            android.view.animation.Animation$AnimationListener r3 = r2.mRefreshListener
            r2.startScaleUpAnimation(r3)
            goto L26
        L23:
            r2.setRefreshing(r3, r0)
        L26:
            return
    }

    public void setSize(int r3) {
            r2 = this;
            if (r3 == 0) goto L6
            r0 = 1
            if (r3 == r0) goto L6
            return
        L6:
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r3 != 0) goto L1a
            r1 = 1113587712(0x42600000, float:56.0)
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.mCircleDiameter = r0
            goto L23
        L1a:
            r1 = 1109393408(0x42200000, float:40.0)
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.mCircleDiameter = r0
        L23:
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r2.mCircleView
            r1 = 0
            r0.setImageDrawable(r1)
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r0 = r2.mProgress
            r0.setStyle(r3)
            androidx.swiperefreshlayout.widget.CircleImageView r3 = r2.mCircleView
            androidx.swiperefreshlayout.widget.CircularProgressDrawable r0 = r2.mProgress
            r3.setImageDrawable(r0)
            return
    }

    public void setSlingshotDistance(@androidx.annotation.Px int r1) {
            r0 = this;
            r0.mCustomSlingshotDistance = r1
            return
    }

    public void setTargetOffsetTopAndBottom(int r2) {
            r1 = this;
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r1.mCircleView
            r0.bringToFront()
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r1.mCircleView
            androidx.core.view.ViewCompat.offsetTopAndBottom(r0, r2)
            androidx.swiperefreshlayout.widget.CircleImageView r2 = r1.mCircleView
            int r2 = r2.getTop()
            r1.mCurrentTargetOffsetTop = r2
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mNestedScrollingChildHelper
            boolean r2 = r0.startNestedScroll(r2)
            return r2
    }

    public final void startScaleDownAnimation(android.view.animation.Animation.AnimationListener r4) {
            r3 = this;
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$3 r0 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$3
            r0.<init>(r3)
            r3.mScaleDownAnimation = r0
            r1 = 150(0x96, double:7.4E-322)
            r0.setDuration(r1)
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r3.mCircleView
            r0.setAnimationListener(r4)
            androidx.swiperefreshlayout.widget.CircleImageView r4 = r3.mCircleView
            r4.clearAnimation()
            androidx.swiperefreshlayout.widget.CircleImageView r4 = r3.mCircleView
            android.view.animation.Animation r0 = r3.mScaleDownAnimation
            r4.startAnimation(r0)
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mNestedScrollingChildHelper
            r0.stopNestedScroll()
            return
    }
}
