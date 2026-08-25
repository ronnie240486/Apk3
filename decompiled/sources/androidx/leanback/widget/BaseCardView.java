package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class BaseCardView extends android.widget.FrameLayout {
    public static final int CARD_REGION_VISIBLE_ACTIVATED = 1;
    public static final int CARD_REGION_VISIBLE_ALWAYS = 0;
    public static final int CARD_REGION_VISIBLE_SELECTED = 2;
    public static final int CARD_TYPE_INFO_OVER = 1;
    public static final int CARD_TYPE_INFO_UNDER = 2;
    public static final int CARD_TYPE_INFO_UNDER_WITH_EXTRA = 3;
    private static final int CARD_TYPE_INVALID = 4;
    public static final int CARD_TYPE_MAIN_ONLY = 0;
    private static final boolean DEBUG = false;
    private static final int[] LB_PRESSED_STATE_SET = null;
    private static final java.lang.String TAG = "BaseCardView";
    private final int mActivatedAnimDuration;
    private android.view.animation.Animation mAnim;
    private final java.lang.Runnable mAnimationTrigger;
    private int mCardType;
    private boolean mDelaySelectedAnim;
    public java.util.ArrayList<android.view.View> mExtraViewList;
    private int mExtraVisibility;
    public float mInfoAlpha;
    public float mInfoOffset;
    public java.util.ArrayList<android.view.View> mInfoViewList;
    public float mInfoVisFraction;
    private int mInfoVisibility;
    private java.util.ArrayList<android.view.View> mMainViewList;
    private int mMeasuredHeight;
    private int mMeasuredWidth;
    private final int mSelectedAnimDuration;
    private int mSelectedAnimationDelay;





    public class AnimationBase extends android.view.animation.Animation {
        public AnimationBase() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class InfoAlphaAnimation extends androidx.leanback.widget.BaseCardView.AnimationBase {
        private float mDelta;
        private float mStartValue;
        public final /* synthetic */ androidx.leanback.widget.BaseCardView this$0;

        public InfoAlphaAnimation(androidx.leanback.widget.BaseCardView r1, float r2, float r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mStartValue = r2
                float r3 = r3 - r2
                r0.mDelta = r3
                return
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float r3, android.view.animation.Transformation r4) {
                r2 = this;
                androidx.leanback.widget.BaseCardView r4 = r2.this$0
                float r0 = r2.mStartValue
                float r1 = r2.mDelta
                float r3 = r3 * r1
                float r3 = r3 + r0
                r4.mInfoAlpha = r3
                r3 = 0
            Lc:
                androidx.leanback.widget.BaseCardView r4 = r2.this$0
                java.util.ArrayList<android.view.View> r4 = r4.mInfoViewList
                int r4 = r4.size()
                if (r3 >= r4) goto L2a
                androidx.leanback.widget.BaseCardView r4 = r2.this$0
                java.util.ArrayList<android.view.View> r4 = r4.mInfoViewList
                java.lang.Object r4 = r4.get(r3)
                android.view.View r4 = (android.view.View) r4
                androidx.leanback.widget.BaseCardView r0 = r2.this$0
                float r0 = r0.mInfoAlpha
                r4.setAlpha(r0)
                int r3 = r3 + 1
                goto Lc
            L2a:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class InfoHeightAnimation extends androidx.leanback.widget.BaseCardView.AnimationBase {
        private float mDelta;
        private float mStartValue;
        public final /* synthetic */ androidx.leanback.widget.BaseCardView this$0;

        public InfoHeightAnimation(androidx.leanback.widget.BaseCardView r1, float r2, float r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mStartValue = r2
                float r3 = r3 - r2
                r0.mDelta = r3
                return
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float r3, android.view.animation.Transformation r4) {
                r2 = this;
                androidx.leanback.widget.BaseCardView r4 = r2.this$0
                float r0 = r2.mStartValue
                float r1 = r2.mDelta
                float r3 = r3 * r1
                float r3 = r3 + r0
                r4.mInfoVisFraction = r3
                r4.requestLayout()
                return
        }
    }

    public final class InfoOffsetAnimation extends androidx.leanback.widget.BaseCardView.AnimationBase {
        private float mDelta;
        private float mStartValue;
        public final /* synthetic */ androidx.leanback.widget.BaseCardView this$0;

        public InfoOffsetAnimation(androidx.leanback.widget.BaseCardView r1, float r2, float r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mStartValue = r2
                float r3 = r3 - r2
                r0.mDelta = r3
                return
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float r3, android.view.animation.Transformation r4) {
                r2 = this;
                androidx.leanback.widget.BaseCardView r4 = r2.this$0
                float r0 = r2.mStartValue
                float r1 = r2.mDelta
                float r3 = r3 * r1
                float r3 = r3 + r0
                r4.mInfoOffset = r3
                r4.requestLayout()
                return
        }
    }

    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams {
        public static final int VIEW_TYPE_EXTRA = 2;
        public static final int VIEW_TYPE_INFO = 1;
        public static final int VIEW_TYPE_MAIN = 0;

        @android.view.ViewDebug.ExportedProperty(category = "layout", mapping = {@android.view.ViewDebug.IntToString(from = 0, to = "MAIN"), @android.view.ViewDebug.IntToString(from = 1, to = "INFO"), @android.view.ViewDebug.IntToString(from = 2, to = "EXTRA")})
        public int viewType;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.viewType = r1
                return
        }

        public LayoutParams(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 0
                r2.viewType = r0
                int[] r1 = androidx.leanback.R.styleable.lbBaseCardView_Layout
                android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
                int r4 = androidx.leanback.R.styleable.lbBaseCardView_Layout_layout_viewType
                int r4 = r3.getInt(r4, r0)
                r2.viewType = r4
                r3.recycle()
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.viewType = r1
                return
        }

        public LayoutParams(androidx.leanback.widget.BaseCardView.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.viewType = r0
                int r2 = r2.viewType
                r1.viewType = r2
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842919(0x10100a7, float:2.3694026E-38)
            r0[r1] = r2
            androidx.leanback.widget.BaseCardView.LB_PRESSED_STATE_SET = r0
            return
    }

    public BaseCardView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BaseCardView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.leanback.R.attr.baseCardViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public BaseCardView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            androidx.leanback.widget.BaseCardView$1 r0 = new androidx.leanback.widget.BaseCardView$1
            r0.<init>(r2)
            r2.mAnimationTrigger = r0
            int[] r0 = androidx.leanback.R.styleable.lbBaseCardView
            r1 = 0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            int r4 = androidx.leanback.R.styleable.lbBaseCardView_cardType     // Catch: java.lang.Throwable -> La7
            int r4 = r3.getInteger(r4, r1)     // Catch: java.lang.Throwable -> La7
            r2.mCardType = r4     // Catch: java.lang.Throwable -> La7
            int r4 = androidx.leanback.R.styleable.lbBaseCardView_cardForeground     // Catch: java.lang.Throwable -> La7
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L24
            r2.setForeground(r4)     // Catch: java.lang.Throwable -> La7
        L24:
            int r4 = androidx.leanback.R.styleable.lbBaseCardView_cardBackground     // Catch: java.lang.Throwable -> La7
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L2f
            r2.setBackground(r4)     // Catch: java.lang.Throwable -> La7
        L2f:
            int r4 = androidx.leanback.R.styleable.lbBaseCardView_infoVisibility     // Catch: java.lang.Throwable -> La7
            r5 = 1
            int r4 = r3.getInteger(r4, r5)     // Catch: java.lang.Throwable -> La7
            r2.mInfoVisibility = r4     // Catch: java.lang.Throwable -> La7
            int r4 = androidx.leanback.R.styleable.lbBaseCardView_extraVisibility     // Catch: java.lang.Throwable -> La7
            r0 = 2
            int r4 = r3.getInteger(r4, r0)     // Catch: java.lang.Throwable -> La7
            r2.mExtraVisibility = r4     // Catch: java.lang.Throwable -> La7
            int r0 = r2.mInfoVisibility     // Catch: java.lang.Throwable -> La7
            if (r4 >= r0) goto L47
            r2.mExtraVisibility = r0     // Catch: java.lang.Throwable -> La7
        L47:
            int r4 = androidx.leanback.R.styleable.lbBaseCardView_selectedAnimationDelay     // Catch: java.lang.Throwable -> La7
            android.content.res.Resources r0 = r2.getResources()     // Catch: java.lang.Throwable -> La7
            int r1 = androidx.leanback.R.integer.lb_card_selected_animation_delay     // Catch: java.lang.Throwable -> La7
            int r0 = r0.getInteger(r1)     // Catch: java.lang.Throwable -> La7
            int r4 = r3.getInteger(r4, r0)     // Catch: java.lang.Throwable -> La7
            r2.mSelectedAnimationDelay = r4     // Catch: java.lang.Throwable -> La7
            int r4 = androidx.leanback.R.styleable.lbBaseCardView_selectedAnimationDuration     // Catch: java.lang.Throwable -> La7
            android.content.res.Resources r0 = r2.getResources()     // Catch: java.lang.Throwable -> La7
            int r1 = androidx.leanback.R.integer.lb_card_selected_animation_duration     // Catch: java.lang.Throwable -> La7
            int r0 = r0.getInteger(r1)     // Catch: java.lang.Throwable -> La7
            int r4 = r3.getInteger(r4, r0)     // Catch: java.lang.Throwable -> La7
            r2.mSelectedAnimDuration = r4     // Catch: java.lang.Throwable -> La7
            int r4 = androidx.leanback.R.styleable.lbBaseCardView_activatedAnimationDuration     // Catch: java.lang.Throwable -> La7
            android.content.res.Resources r0 = r2.getResources()     // Catch: java.lang.Throwable -> La7
            int r1 = androidx.leanback.R.integer.lb_card_activated_animation_duration     // Catch: java.lang.Throwable -> La7
            int r0 = r0.getInteger(r1)     // Catch: java.lang.Throwable -> La7
            int r4 = r3.getInteger(r4, r0)     // Catch: java.lang.Throwable -> La7
            r2.mActivatedAnimDuration = r4     // Catch: java.lang.Throwable -> La7
            r3.recycle()
            r2.mDelaySelectedAnim = r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mMainViewList = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mInfoViewList = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mExtraViewList = r3
            r3 = 0
            r2.mInfoOffset = r3
            float r3 = r2.getFinalInfoVisFraction()
            r2.mInfoVisFraction = r3
            float r3 = r2.getFinalInfoAlpha()
            r2.mInfoAlpha = r3
            return
        La7:
            r4 = move-exception
            r3.recycle()
            throw r4
    }

    private void animateInfoAlpha(boolean r5) {
            r4 = this;
            r4.cancelAnimations()
            if (r5 == 0) goto L1d
            r0 = 0
            r1 = 0
        L7:
            java.util.ArrayList<android.view.View> r2 = r4.mInfoViewList
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            java.util.ArrayList<android.view.View> r2 = r4.mInfoViewList
            java.lang.Object r2 = r2.get(r1)
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r0)
            int r1 = r1 + 1
            goto L7
        L1d:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            if (r5 == 0) goto L25
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L26
        L25:
            r2 = 0
        L26:
            float r3 = r4.mInfoAlpha
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L2d
            return
        L2d:
            androidx.leanback.widget.BaseCardView$InfoAlphaAnimation r2 = new androidx.leanback.widget.BaseCardView$InfoAlphaAnimation
            float r3 = r4.mInfoAlpha
            if (r5 == 0) goto L34
            goto L35
        L34:
            r0 = 0
        L35:
            r2.<init>(r4, r3, r0)
            r4.mAnim = r2
            int r5 = r4.mActivatedAnimDuration
            long r0 = (long) r5
            r2.setDuration(r0)
            android.view.animation.Animation r5 = r4.mAnim
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r5.setInterpolator(r0)
            android.view.animation.Animation r5 = r4.mAnim
            androidx.leanback.widget.BaseCardView$4 r0 = new androidx.leanback.widget.BaseCardView$4
            r0.<init>(r4)
            r5.setAnimationListener(r0)
            android.view.animation.Animation r5 = r4.mAnim
            r4.startAnimation(r5)
            return
    }

    private void animateInfoHeight(boolean r4) {
            r3 = this;
            r3.cancelAnimations()
            if (r4 == 0) goto L1d
            r0 = 0
            r1 = 0
        L7:
            java.util.ArrayList<android.view.View> r2 = r3.mInfoViewList
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            java.util.ArrayList<android.view.View> r2 = r3.mInfoViewList
            java.lang.Object r2 = r2.get(r1)
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r0)
            int r1 = r1 + 1
            goto L7
        L1d:
            if (r4 == 0) goto L22
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L23
        L22:
            r4 = 0
        L23:
            float r0 = r3.mInfoVisFraction
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L2a
            return
        L2a:
            androidx.leanback.widget.BaseCardView$InfoHeightAnimation r0 = new androidx.leanback.widget.BaseCardView$InfoHeightAnimation
            float r1 = r3.mInfoVisFraction
            r0.<init>(r3, r1, r4)
            r3.mAnim = r0
            int r4 = r3.mSelectedAnimDuration
            long r1 = (long) r4
            r0.setDuration(r1)
            android.view.animation.Animation r4 = r3.mAnim
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r4.setInterpolator(r0)
            android.view.animation.Animation r4 = r3.mAnim
            androidx.leanback.widget.BaseCardView$3 r0 = new androidx.leanback.widget.BaseCardView$3
            r0.<init>(r3)
            r4.setAnimationListener(r0)
            android.view.animation.Animation r4 = r3.mAnim
            r3.startAnimation(r4)
            return
    }

    private void applyActiveState(boolean r2) {
            r1 = this;
            boolean r2 = r1.hasInfoRegion()
            if (r2 == 0) goto L12
            int r2 = r1.mInfoVisibility
            r0 = 1
            if (r2 != r0) goto L12
            boolean r2 = r1.isRegionVisible(r2)
            r1.setInfoViewVisibility(r2)
        L12:
            return
    }

    private void applySelectedState(boolean r3) {
            r2 = this;
            java.lang.Runnable r0 = r2.mAnimationTrigger
            r2.removeCallbacks(r0)
            int r0 = r2.mCardType
            r1 = 3
            if (r0 != r1) goto L27
            if (r3 == 0) goto L22
            boolean r3 = r2.mDelaySelectedAnim
            if (r3 != 0) goto L19
            java.lang.Runnable r3 = r2.mAnimationTrigger
            r2.post(r3)
            r3 = 1
            r2.mDelaySelectedAnim = r3
            goto L2f
        L19:
            java.lang.Runnable r3 = r2.mAnimationTrigger
            int r0 = r2.mSelectedAnimationDelay
            long r0 = (long) r0
            r2.postDelayed(r3, r0)
            goto L2f
        L22:
            r3 = 0
            r2.animateInfoOffset(r3)
            goto L2f
        L27:
            int r0 = r2.mInfoVisibility
            r1 = 2
            if (r0 != r1) goto L2f
            r2.setInfoViewVisibility(r3)
        L2f:
            return
    }

    private void findChildrenViews() {
            r10 = this;
            java.util.ArrayList<android.view.View> r0 = r10.mMainViewList
            r0.clear()
            java.util.ArrayList<android.view.View> r0 = r10.mInfoViewList
            r0.clear()
            java.util.ArrayList<android.view.View> r0 = r10.mExtraViewList
            r0.clear()
            int r0 = r10.getChildCount()
            boolean r1 = r10.hasInfoRegion()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L25
            int r1 = r10.mInfoVisibility
            boolean r1 = r10.isCurrentRegionVisible(r1)
            if (r1 == 0) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = 0
        L26:
            boolean r4 = r10.hasExtraRegion()
            if (r4 == 0) goto L35
            float r4 = r10.mInfoOffset
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L35
            r4 = 1
            goto L36
        L35:
            r4 = 0
        L36:
            r5 = 0
        L37:
            if (r5 >= r0) goto L77
            android.view.View r6 = r10.getChildAt(r5)
            if (r6 != 0) goto L40
            goto L74
        L40:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.leanback.widget.BaseCardView$LayoutParams r7 = (androidx.leanback.widget.BaseCardView.LayoutParams) r7
            int r7 = r7.viewType
            r8 = 8
            if (r7 != r2) goto L5d
            float r7 = r10.mInfoAlpha
            r6.setAlpha(r7)
            java.util.ArrayList<android.view.View> r7 = r10.mInfoViewList
            r7.add(r6)
            if (r1 == 0) goto L59
            r8 = 0
        L59:
            r6.setVisibility(r8)
            goto L74
        L5d:
            r9 = 2
            if (r7 != r9) goto L6c
            java.util.ArrayList<android.view.View> r7 = r10.mExtraViewList
            r7.add(r6)
            if (r4 == 0) goto L68
            r8 = 0
        L68:
            r6.setVisibility(r8)
            goto L74
        L6c:
            java.util.ArrayList<android.view.View> r7 = r10.mMainViewList
            r7.add(r6)
            r6.setVisibility(r3)
        L74:
            int r5 = r5 + 1
            goto L37
        L77:
            return
    }

    private boolean hasExtraRegion() {
            r2 = this;
            int r0 = r2.mCardType
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private boolean hasInfoRegion() {
            r1 = this;
            int r0 = r1.mCardType
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private boolean isCurrentRegionVisible(int r4) {
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L22
            if (r4 == r0) goto L1d
            r1 = 0
            r2 = 2
            if (r4 == r2) goto La
            return r1
        La:
            int r4 = r3.mCardType
            if (r4 != r2) goto L18
            float r4 = r3.mInfoVisFraction
            r2 = 0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
        L18:
            boolean r4 = r3.isSelected()
            return r4
        L1d:
            boolean r4 = r3.isActivated()
            return r4
        L22:
            return r0
    }

    private boolean isRegionVisible(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto L14
            if (r2 == r0) goto Lf
            r0 = 2
            if (r2 == r0) goto La
            r2 = 0
            return r2
        La:
            boolean r2 = r1.isSelected()
            return r2
        Lf:
            boolean r2 = r1.isActivated()
            return r2
        L14:
            return r0
    }

    private void setInfoViewVisibility(boolean r6) {
            r5 = this;
            int r0 = r5.mCardType
            r1 = 8
            r2 = 0
            r3 = 3
            if (r0 != r3) goto L52
            if (r6 == 0) goto L21
            r6 = 0
        Lb:
            java.util.ArrayList<android.view.View> r0 = r5.mInfoViewList
            int r0 = r0.size()
            if (r6 >= r0) goto L80
            java.util.ArrayList<android.view.View> r0 = r5.mInfoViewList
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            int r6 = r6 + 1
            goto Lb
        L21:
            r6 = 0
        L22:
            java.util.ArrayList<android.view.View> r0 = r5.mInfoViewList
            int r0 = r0.size()
            if (r6 >= r0) goto L38
            java.util.ArrayList<android.view.View> r0 = r5.mInfoViewList
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            int r6 = r6 + 1
            goto L22
        L38:
            java.util.ArrayList<android.view.View> r6 = r5.mExtraViewList
            int r6 = r6.size()
            if (r2 >= r6) goto L4e
            java.util.ArrayList<android.view.View> r6 = r5.mExtraViewList
            java.lang.Object r6 = r6.get(r2)
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
            int r2 = r2 + 1
            goto L38
        L4e:
            r6 = 0
            r5.mInfoOffset = r6
            goto L80
        L52:
            r3 = 2
            if (r0 != r3) goto L7a
            int r0 = r5.mInfoVisibility
            if (r0 != r3) goto L5d
            r5.animateInfoHeight(r6)
            goto L80
        L5d:
            r0 = 0
        L5e:
            java.util.ArrayList<android.view.View> r3 = r5.mInfoViewList
            int r3 = r3.size()
            if (r0 >= r3) goto L80
            java.util.ArrayList<android.view.View> r3 = r5.mInfoViewList
            java.lang.Object r3 = r3.get(r0)
            android.view.View r3 = (android.view.View) r3
            if (r6 == 0) goto L72
            r4 = 0
            goto L74
        L72:
            r4 = 8
        L74:
            r3.setVisibility(r4)
            int r0 = r0 + 1
            goto L5e
        L7a:
            r1 = 1
            if (r0 != r1) goto L80
            r5.animateInfoAlpha(r6)
        L80:
            return
    }

    public final void animateInfoOffset(boolean r7) {
            r6 = this;
            r6.cancelAnimations()
            r0 = 0
            if (r7 == 0) goto L36
            int r1 = r6.mMeasuredWidth
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r3 = 0
            r4 = 0
        L14:
            java.util.ArrayList<android.view.View> r5 = r6.mExtraViewList
            int r5 = r5.size()
            if (r3 >= r5) goto L35
            java.util.ArrayList<android.view.View> r5 = r6.mExtraViewList
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            r5.setVisibility(r0)
            r5.measure(r1, r2)
            int r5 = r5.getMeasuredHeight()
            int r4 = java.lang.Math.max(r4, r5)
            int r3 = r3 + 1
            goto L14
        L35:
            r0 = r4
        L36:
            androidx.leanback.widget.BaseCardView$InfoOffsetAnimation r1 = new androidx.leanback.widget.BaseCardView$InfoOffsetAnimation
            float r2 = r6.mInfoOffset
            if (r7 == 0) goto L3e
            float r7 = (float) r0
            goto L3f
        L3e:
            r7 = 0
        L3f:
            r1.<init>(r6, r2, r7)
            r6.mAnim = r1
            int r7 = r6.mSelectedAnimDuration
            long r2 = (long) r7
            r1.setDuration(r2)
            android.view.animation.Animation r7 = r6.mAnim
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r7.setInterpolator(r0)
            android.view.animation.Animation r7 = r6.mAnim
            androidx.leanback.widget.BaseCardView$2 r0 = new androidx.leanback.widget.BaseCardView$2
            r0.<init>(r6)
            r7.setAnimationListener(r0)
            android.view.animation.Animation r7 = r6.mAnim
            r6.startAnimation(r7)
            return
    }

    public final void cancelAnimations() {
            r1 = this;
            android.view.animation.Animation r0 = r1.mAnim
            if (r0 == 0) goto Ld
            r0.cancel()
            r0 = 0
            r1.mAnim = r0
            r1.clearAnimation()
        Ld:
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.leanback.widget.BaseCardView.LayoutParams
            return r1
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.leanback.widget.BaseCardView$LayoutParams r0 = new androidx.leanback.widget.BaseCardView$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.leanback.widget.BaseCardView$LayoutParams r0 = new androidx.leanback.widget.BaseCardView$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.leanback.widget.BaseCardView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.leanback.widget.BaseCardView.LayoutParams
            if (r0 == 0) goto Lc
            androidx.leanback.widget.BaseCardView$LayoutParams r0 = new androidx.leanback.widget.BaseCardView$LayoutParams
            androidx.leanback.widget.BaseCardView$LayoutParams r2 = (androidx.leanback.widget.BaseCardView.LayoutParams) r2
            r0.<init>(r2)
            goto L11
        Lc:
            androidx.leanback.widget.BaseCardView$LayoutParams r0 = new androidx.leanback.widget.BaseCardView$LayoutParams
            r0.<init>(r2)
        L11:
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.leanback.widget.BaseCardView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public androidx.leanback.widget.BaseCardView.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.leanback.widget.BaseCardView$LayoutParams r0 = new androidx.leanback.widget.BaseCardView$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public int getCardType() {
            r1 = this;
            int r0 = r1.mCardType
            return r0
    }

    @java.lang.Deprecated
    public int getExtraVisibility() {
            r1 = this;
            int r0 = r1.mExtraVisibility
            return r0
    }

    public final float getFinalInfoAlpha() {
            r2 = this;
            int r0 = r2.mCardType
            r1 = 1
            if (r0 != r1) goto L12
            int r0 = r2.mInfoVisibility
            r1 = 2
            if (r0 != r1) goto L12
            boolean r0 = r2.isSelected()
            if (r0 != 0) goto L12
            r0 = 0
            goto L14
        L12:
            r0 = 1065353216(0x3f800000, float:1.0)
        L14:
            return r0
    }

    public final float getFinalInfoVisFraction() {
            r2 = this;
            int r0 = r2.mCardType
            r1 = 2
            if (r0 != r1) goto L11
            int r0 = r2.mInfoVisibility
            if (r0 != r1) goto L11
            boolean r0 = r2.isSelected()
            if (r0 != 0) goto L11
            r0 = 0
            goto L13
        L11:
            r0 = 1065353216(0x3f800000, float:1.0)
        L13:
            return r0
    }

    public int getInfoVisibility() {
            r1 = this;
            int r0 = r1.mInfoVisibility
            return r0
    }

    public boolean isSelectedAnimationDelayed() {
            r1 = this;
            boolean r0 = r1.mDelaySelectedAnim
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int r8) {
            r7 = this;
            int[] r8 = super.onCreateDrawableState(r8)
            int r0 = r8.length
            r1 = 0
            r2 = 0
            r3 = 0
        L8:
            if (r1 >= r0) goto L1e
            r4 = r8[r1]
            r5 = 16842919(0x10100a7, float:2.3694026E-38)
            r6 = 1
            if (r4 != r5) goto L13
            r2 = 1
        L13:
            r4 = r8[r1]
            r5 = 16842910(0x101009e, float:2.3694E-38)
            if (r4 != r5) goto L1b
            r3 = 1
        L1b:
            int r1 = r1 + 1
            goto L8
        L1e:
            if (r2 == 0) goto L25
            if (r3 == 0) goto L25
            int[] r8 = android.view.View.PRESSED_ENABLED_STATE_SET
            return r8
        L25:
            if (r2 == 0) goto L2a
            int[] r8 = androidx.leanback.widget.BaseCardView.LB_PRESSED_STATE_SET
            return r8
        L2a:
            if (r3 == 0) goto L2f
            int[] r8 = android.view.View.ENABLED_STATE_SET
            return r8
        L2f:
            int[] r8 = android.view.View.EMPTY_STATE_SET
            return r8
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.Runnable r0 = r1.mAnimationTrigger
            r1.removeCallbacks(r0)
            r1.cancelAnimations()
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r14, int r15, int r16, int r17, int r18) {
            r13 = this;
            r0 = r13
            int r1 = r13.getPaddingTop()
            float r1 = (float) r1
            r2 = 0
            r3 = 0
        L8:
            java.util.ArrayList<android.view.View> r4 = r0.mMainViewList
            int r4 = r4.size()
            r5 = 8
            if (r3 >= r4) goto L3f
            java.util.ArrayList<android.view.View> r4 = r0.mMainViewList
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r6 = r4.getVisibility()
            if (r6 == r5) goto L3c
            int r5 = r13.getPaddingLeft()
            int r6 = (int) r1
            int r7 = r0.mMeasuredWidth
            int r8 = r13.getPaddingLeft()
            int r8 = r8 + r7
            int r7 = r4.getMeasuredHeight()
            float r7 = (float) r7
            float r7 = r7 + r1
            int r7 = (int) r7
            r4.layout(r5, r6, r8, r7)
            int r4 = r4.getMeasuredHeight()
            float r4 = (float) r4
            float r1 = r1 + r4
        L3c:
            int r3 = r3 + 1
            goto L8
        L3f:
            boolean r3 = r13.hasInfoRegion()
            if (r3 == 0) goto Lf4
            r3 = 0
            r4 = 0
            r6 = 0
        L48:
            java.util.ArrayList<android.view.View> r7 = r0.mInfoViewList
            int r7 = r7.size()
            if (r4 >= r7) goto L61
            java.util.ArrayList<android.view.View> r7 = r0.mInfoViewList
            java.lang.Object r7 = r7.get(r4)
            android.view.View r7 = (android.view.View) r7
            int r7 = r7.getMeasuredHeight()
            float r7 = (float) r7
            float r6 = r6 + r7
            int r4 = r4 + 1
            goto L48
        L61:
            int r4 = r0.mCardType
            r7 = 1
            if (r4 != r7) goto L6d
            float r1 = r1 - r6
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto L7c
            r1 = 0
            goto L7c
        L6d:
            r7 = 2
            if (r4 != r7) goto L79
            int r4 = r0.mInfoVisibility
            if (r4 != r7) goto L7c
            float r4 = r0.mInfoVisFraction
            float r6 = r6 * r4
            goto L7c
        L79:
            float r4 = r0.mInfoOffset
            float r1 = r1 - r4
        L7c:
            r4 = 0
        L7d:
            java.util.ArrayList<android.view.View> r7 = r0.mInfoViewList
            int r7 = r7.size()
            if (r4 >= r7) goto Lb8
            java.util.ArrayList<android.view.View> r7 = r0.mInfoViewList
            java.lang.Object r7 = r7.get(r4)
            android.view.View r7 = (android.view.View) r7
            int r8 = r7.getVisibility()
            if (r8 == r5) goto Lb5
            int r8 = r7.getMeasuredHeight()
            float r9 = (float) r8
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 <= 0) goto L9d
            int r8 = (int) r6
        L9d:
            int r9 = r13.getPaddingLeft()
            int r10 = (int) r1
            int r11 = r0.mMeasuredWidth
            int r12 = r13.getPaddingLeft()
            int r12 = r12 + r11
            float r8 = (float) r8
            float r1 = r1 + r8
            int r11 = (int) r1
            r7.layout(r9, r10, r12, r11)
            float r6 = r6 - r8
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 > 0) goto Lb5
            goto Lb8
        Lb5:
            int r4 = r4 + 1
            goto L7d
        Lb8:
            boolean r3 = r13.hasExtraRegion()
            if (r3 == 0) goto Lf4
            r3 = 0
        Lbf:
            java.util.ArrayList<android.view.View> r4 = r0.mExtraViewList
            int r4 = r4.size()
            if (r3 >= r4) goto Lf4
            java.util.ArrayList<android.view.View> r4 = r0.mExtraViewList
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r6 = r4.getVisibility()
            if (r6 == r5) goto Lf1
            int r6 = r13.getPaddingLeft()
            int r7 = (int) r1
            int r8 = r0.mMeasuredWidth
            int r9 = r13.getPaddingLeft()
            int r9 = r9 + r8
            int r8 = r4.getMeasuredHeight()
            float r8 = (float) r8
            float r8 = r8 + r1
            int r8 = (int) r8
            r4.layout(r6, r7, r9, r8)
            int r4 = r4.getMeasuredHeight()
            float r4 = (float) r4
            float r1 = r1 + r4
        Lf1:
            int r3 = r3 + 1
            goto Lbf
        Lf4:
            int r1 = r17 - r15
            int r3 = r18 - r16
            r13.onSizeChanged(r2, r2, r1, r3)
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r14, int r15) {
            r13 = this;
            r0 = 0
            r13.mMeasuredWidth = r0
            r13.mMeasuredHeight = r0
            r13.findChildrenViews()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r2 = 0
            r3 = 0
            r4 = 0
        Lf:
            java.util.ArrayList<android.view.View> r5 = r13.mMainViewList
            int r5 = r5.size()
            r6 = 8
            if (r2 >= r5) goto L46
            java.util.ArrayList<android.view.View> r5 = r13.mMainViewList
            java.lang.Object r5 = r5.get(r2)
            android.view.View r5 = (android.view.View) r5
            int r7 = r5.getVisibility()
            if (r7 == r6) goto L43
            r13.measureChild(r5, r1, r1)
            int r6 = r13.mMeasuredWidth
            int r7 = r5.getMeasuredWidth()
            int r6 = java.lang.Math.max(r6, r7)
            r13.mMeasuredWidth = r6
            int r6 = r5.getMeasuredHeight()
            int r3 = r3 + r6
            int r5 = r5.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r5)
        L43:
            int r2 = r2 + 1
            goto Lf
        L46:
            int r2 = r13.mMeasuredWidth
            r5 = 2
            int r2 = r2 / r5
            float r2 = (float) r2
            r13.setPivotX(r2)
            int r2 = r3 / 2
            float r2 = (float) r2
            r13.setPivotY(r2)
            int r2 = r13.mMeasuredWidth
            r7 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r7)
            boolean r7 = r13.hasInfoRegion()
            r8 = 1
            if (r7 == 0) goto Lc4
            r7 = 0
            r9 = 0
        L65:
            java.util.ArrayList<android.view.View> r10 = r13.mInfoViewList
            int r10 = r10.size()
            if (r7 >= r10) goto L93
            java.util.ArrayList<android.view.View> r10 = r13.mInfoViewList
            java.lang.Object r10 = r10.get(r7)
            android.view.View r10 = (android.view.View) r10
            int r11 = r10.getVisibility()
            if (r11 == r6) goto L90
            r13.measureChild(r10, r2, r1)
            int r11 = r13.mCardType
            if (r11 == r8) goto L88
            int r11 = r10.getMeasuredHeight()
            int r11 = r11 + r9
            r9 = r11
        L88:
            int r10 = r10.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r10)
        L90:
            int r7 = r7 + 1
            goto L65
        L93:
            boolean r7 = r13.hasExtraRegion()
            if (r7 == 0) goto Lc5
            r7 = 0
            r10 = 0
        L9b:
            java.util.ArrayList<android.view.View> r11 = r13.mExtraViewList
            int r11 = r11.size()
            if (r7 >= r11) goto Lc6
            java.util.ArrayList<android.view.View> r11 = r13.mExtraViewList
            java.lang.Object r11 = r11.get(r7)
            android.view.View r11 = (android.view.View) r11
            int r12 = r11.getVisibility()
            if (r12 == r6) goto Lc1
            r13.measureChild(r11, r2, r1)
            int r12 = r11.getMeasuredHeight()
            int r10 = r10 + r12
            int r11 = r11.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r11)
        Lc1:
            int r7 = r7 + 1
            goto L9b
        Lc4:
            r9 = 0
        Lc5:
            r10 = 0
        Lc6:
            boolean r1 = r13.hasInfoRegion()
            if (r1 == 0) goto Ld1
            int r1 = r13.mInfoVisibility
            if (r1 != r5) goto Ld1
            r0 = 1
        Ld1:
            float r1 = (float) r3
            float r2 = (float) r9
            if (r0 == 0) goto Ld9
            float r3 = r13.mInfoVisFraction
            float r2 = r2 * r3
        Ld9:
            float r1 = r1 + r2
            float r2 = (float) r10
            float r1 = r1 + r2
            if (r0 == 0) goto Le0
            r0 = 0
            goto Le2
        Le0:
            float r0 = r13.mInfoOffset
        Le2:
            float r1 = r1 - r0
            int r0 = (int) r1
            r13.mMeasuredHeight = r0
            int r0 = r13.mMeasuredWidth
            int r1 = r13.getPaddingLeft()
            int r1 = r1 + r0
            int r0 = r13.getPaddingRight()
            int r0 = r0 + r1
            int r14 = android.view.View.resolveSizeAndState(r0, r14, r4)
            int r0 = r13.mMeasuredHeight
            int r1 = r13.getPaddingTop()
            int r1 = r1 + r0
            int r0 = r13.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = r4 << 16
            int r15 = android.view.View.resolveSizeAndState(r0, r15, r1)
            r13.setMeasuredDimension(r14, r15)
            return
    }

    @Override // android.view.View
    public void setActivated(boolean r2) {
            r1 = this;
            boolean r0 = r1.isActivated()
            if (r2 == r0) goto L10
            super.setActivated(r2)
            boolean r2 = r1.isActivated()
            r1.applyActiveState(r2)
        L10:
            return
    }

    public void setCardType(int r3) {
            r2 = this;
            int r0 = r2.mCardType
            if (r0 == r3) goto L2d
            if (r3 < 0) goto Lc
            r0 = 4
            if (r3 >= r0) goto Lc
            r2.mCardType = r3
            goto L2a
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid card type specified: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ". Defaulting to type CARD_TYPE_MAIN_ONLY."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "BaseCardView"
            android.util.Log.e(r0, r3)
            r3 = 0
            r2.mCardType = r3
        L2a:
            r2.requestLayout()
        L2d:
            return
    }

    @java.lang.Deprecated
    public void setExtraVisibility(int r2) {
            r1 = this;
            int r0 = r1.mExtraVisibility
            if (r0 == r2) goto L6
            r1.mExtraVisibility = r2
        L6:
            return
    }

    public void setInfoVisibility(int r3) {
            r2 = this;
            int r0 = r2.mInfoVisibility
            if (r0 == r3) goto L37
            r2.cancelAnimations()
            r2.mInfoVisibility = r3
            float r3 = r2.getFinalInfoVisFraction()
            r2.mInfoVisFraction = r3
            r2.requestLayout()
            float r3 = r2.getFinalInfoAlpha()
            float r0 = r2.mInfoAlpha
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L37
            r2.mInfoAlpha = r3
            r3 = 0
        L1f:
            java.util.ArrayList<android.view.View> r0 = r2.mInfoViewList
            int r0 = r0.size()
            if (r3 >= r0) goto L37
            java.util.ArrayList<android.view.View> r0 = r2.mInfoViewList
            java.lang.Object r0 = r0.get(r3)
            android.view.View r0 = (android.view.View) r0
            float r1 = r2.mInfoAlpha
            r0.setAlpha(r1)
            int r3 = r3 + 1
            goto L1f
        L37:
            return
    }

    @Override // android.view.View
    public void setSelected(boolean r2) {
            r1 = this;
            boolean r0 = r1.isSelected()
            if (r2 == r0) goto L10
            super.setSelected(r2)
            boolean r2 = r1.isSelected()
            r1.applySelectedState(r2)
        L10:
            return
    }

    public void setSelectedAnimationDelayed(boolean r1) {
            r0 = this;
            r0.mDelaySelectedAnim = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }
}
