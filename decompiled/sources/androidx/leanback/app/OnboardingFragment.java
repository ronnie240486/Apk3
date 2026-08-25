package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class OnboardingFragment extends android.app.Fragment {
    private static final boolean DEBUG = false;
    private static final long DESCRIPTION_START_DELAY_MS = 33;
    private static final long HEADER_ANIMATION_DURATION_MS = 417;
    private static final long HEADER_APPEAR_DELAY_MS = 500;
    private static final android.animation.TimeInterpolator HEADER_APPEAR_INTERPOLATOR = null;
    private static final android.animation.TimeInterpolator HEADER_DISAPPEAR_INTERPOLATOR = null;
    private static final java.lang.String KEY_CURRENT_PAGE_INDEX = "leanback.onboarding.current_page_index";
    private static final java.lang.String KEY_ENTER_ANIMATION_FINISHED = "leanback.onboarding.enter_animation_finished";
    private static final java.lang.String KEY_LOGO_ANIMATION_FINISHED = "leanback.onboarding.logo_animation_finished";
    private static final long LOGO_SPLASH_PAUSE_DURATION_MS = 1333;
    private static final int SLIDE_DISTANCE = 60;
    private static final java.lang.String TAG = "OnboardingF";
    private static int sSlideDistance;
    private android.animation.AnimatorSet mAnimator;

    @androidx.annotation.ColorInt
    private int mArrowBackgroundColor;
    private boolean mArrowBackgroundColorSet;

    @androidx.annotation.ColorInt
    private int mArrowColor;
    private boolean mArrowColorSet;
    public int mCurrentPageIndex;
    public android.widget.TextView mDescriptionView;

    @androidx.annotation.ColorInt
    private int mDescriptionViewTextColor;
    private boolean mDescriptionViewTextColorSet;

    @androidx.annotation.ColorInt
    private int mDotBackgroundColor;
    private boolean mDotBackgroundColorSet;
    public boolean mEnterAnimationFinished;
    private int mIconResourceId;
    public boolean mIsLtr;
    public boolean mLogoAnimationFinished;
    private int mLogoResourceId;
    private android.widget.ImageView mLogoView;
    private android.widget.ImageView mMainIconView;
    private final android.view.View.OnClickListener mOnClickListener;
    private final android.view.View.OnKeyListener mOnKeyListener;
    public androidx.leanback.widget.PagingIndicator mPageIndicator;
    public android.view.View mStartButton;
    private java.lang.CharSequence mStartButtonText;
    private boolean mStartButtonTextSet;
    private android.view.ContextThemeWrapper mThemeWrapper;
    public android.widget.TextView mTitleView;

    @androidx.annotation.ColorInt
    private int mTitleViewTextColor;
    private boolean mTitleViewTextColorSet;









    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            androidx.leanback.app.OnboardingFragment.HEADER_APPEAR_INTERPOLATOR = r0
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            androidx.leanback.app.OnboardingFragment.HEADER_DISAPPEAR_INTERPOLATOR = r0
            return
    }

    public OnboardingFragment() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mTitleViewTextColor = r0
            r1.mDescriptionViewTextColor = r0
            r1.mDotBackgroundColor = r0
            r1.mArrowColor = r0
            r1.mArrowBackgroundColor = r0
            androidx.leanback.app.OnboardingFragment$1 r0 = new androidx.leanback.app.OnboardingFragment$1
            r0.<init>(r1)
            r1.mOnClickListener = r0
            androidx.leanback.app.OnboardingFragment$2 r0 = new androidx.leanback.app.OnboardingFragment$2
            r0.<init>(r1)
            r1.mOnKeyListener = r0
            return
    }

    private android.animation.Animator createAnimator(android.view.View r7, boolean r8, int r9, long r10) {
            r6 = this;
            android.view.View r0 = r6.getView()
            int r0 = r0.getLayoutDirection()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L16
            r3 = 8388613(0x800005, float:1.175495E-38)
            if (r9 == r3) goto L20
        L16:
            if (r0 != 0) goto L1d
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r9 == r0) goto L20
        L1d:
            r0 = 5
            if (r9 != r0) goto L22
        L20:
            r9 = 1
            goto L23
        L22:
            r9 = 0
        L23:
            r0 = 0
            r3 = 2
            if (r8 == 0) goto L50
            android.util.Property r8 = android.view.View.ALPHA
            float[] r4 = new float[r3]
            r4 = {x009e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r7, r8, r4)
            android.util.Property r4 = android.view.View.TRANSLATION_X
            float[] r5 = new float[r3]
            if (r9 == 0) goto L3b
            int r9 = androidx.leanback.app.OnboardingFragment.sSlideDistance
            goto L3e
        L3b:
            int r9 = androidx.leanback.app.OnboardingFragment.sSlideDistance
            int r9 = -r9
        L3e:
            float r9 = (float) r9
            r5[r2] = r9
            r5[r1] = r0
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r7, r4, r5)
            android.animation.TimeInterpolator r0 = androidx.leanback.app.OnboardingFragment.HEADER_APPEAR_INTERPOLATOR
            r8.setInterpolator(r0)
            r9.setInterpolator(r0)
            goto L78
        L50:
            android.util.Property r8 = android.view.View.ALPHA
            float[] r4 = new float[r3]
            r4 = {x00a6: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r7, r8, r4)
            android.util.Property r4 = android.view.View.TRANSLATION_X
            float[] r5 = new float[r3]
            r5[r2] = r0
            if (r9 == 0) goto L66
            int r9 = androidx.leanback.app.OnboardingFragment.sSlideDistance
            goto L69
        L66:
            int r9 = androidx.leanback.app.OnboardingFragment.sSlideDistance
            int r9 = -r9
        L69:
            float r9 = (float) r9
            r5[r1] = r9
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r7, r4, r5)
            android.animation.TimeInterpolator r0 = androidx.leanback.app.OnboardingFragment.HEADER_DISAPPEAR_INTERPOLATOR
            r8.setInterpolator(r0)
            r9.setInterpolator(r0)
        L78:
            r4 = 417(0x1a1, double:2.06E-321)
            r8.setDuration(r4)
            r8.setTarget(r7)
            r9.setDuration(r4)
            r9.setTarget(r7)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r3]
            r0[r2] = r8
            r0[r1] = r9
            r7.playTogether(r0)
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L9d
            r7.setStartDelay(r10)
        L9d:
            return r7
    }

    private android.view.LayoutInflater getThemeInflater(android.view.LayoutInflater r2) {
            r1 = this;
            android.view.ContextThemeWrapper r0 = r1.mThemeWrapper
            if (r0 != 0) goto L5
            goto L9
        L5:
            android.view.LayoutInflater r2 = r2.cloneInContext(r0)
        L9:
            return r2
    }

    private void onPageChangedInternal(int r11) {
            r10 = this;
            android.animation.AnimatorSet r0 = r10.mAnimator
            if (r0 == 0) goto L7
            r0.end()
        L7:
            androidx.leanback.widget.PagingIndicator r0 = r10.mPageIndicator
            int r1 = r10.mCurrentPageIndex
            r2 = 1
            r0.onPageSelected(r1, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r10.mCurrentPageIndex
            if (r11 >= r1) goto L53
            android.widget.TextView r4 = r10.mTitleView
            r5 = 0
            r6 = 8388611(0x800003, float:1.1754948E-38)
            r7 = 0
            r3 = r10
            android.animation.Animator r1 = r3.createAnimator(r4, r5, r6, r7)
            r0.add(r1)
            android.widget.TextView r4 = r10.mDescriptionView
            r7 = 33
            android.animation.Animator r1 = r3.createAnimator(r4, r5, r6, r7)
            r0.add(r1)
            android.widget.TextView r4 = r10.mTitleView
            r5 = 1
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 500(0x1f4, double:2.47E-321)
            android.animation.Animator r3 = r3.createAnimator(r4, r5, r6, r7)
            r0.add(r3)
            android.widget.TextView r5 = r10.mDescriptionView
            r6 = 1
            r7 = 8388613(0x800005, float:1.175495E-38)
            r8 = 533(0x215, double:2.633E-321)
            r4 = r10
            android.animation.Animator r3 = r4.createAnimator(r5, r6, r7, r8)
            r0.add(r3)
            goto L92
        L53:
            android.widget.TextView r5 = r10.mTitleView
            r6 = 0
            r7 = 8388613(0x800005, float:1.175495E-38)
            r8 = 0
            r4 = r10
            android.animation.Animator r1 = r4.createAnimator(r5, r6, r7, r8)
            r0.add(r1)
            android.widget.TextView r4 = r10.mDescriptionView
            r5 = 0
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 33
            r3 = r10
            android.animation.Animator r1 = r3.createAnimator(r4, r5, r6, r7)
            r0.add(r1)
            android.widget.TextView r4 = r10.mTitleView
            r5 = 1
            r6 = 8388611(0x800003, float:1.1754948E-38)
            r7 = 500(0x1f4, double:2.47E-321)
            android.animation.Animator r3 = r3.createAnimator(r4, r5, r6, r7)
            r0.add(r3)
            android.widget.TextView r5 = r10.mDescriptionView
            r6 = 1
            r7 = 8388611(0x800003, float:1.1754948E-38)
            r8 = 533(0x215, double:2.633E-321)
            r4 = r10
            android.animation.Animator r3 = r4.createAnimator(r5, r6, r7, r8)
            r0.add(r3)
        L92:
            int r3 = r10.mCurrentPageIndex
            androidx.leanback.app.OnboardingFragment$6 r4 = new androidx.leanback.app.OnboardingFragment$6
            r4.<init>(r10, r3)
            r1.addListener(r4)
            android.content.Context r1 = androidx.leanback.app.FragmentUtil.getContext(r10)
            int r3 = r10.mCurrentPageIndex
            int r4 = r10.getPageCount()
            int r4 = r4 - r2
            r5 = 0
            if (r3 != r4) goto Ld4
            android.view.View r11 = r10.mStartButton
            r11.setVisibility(r5)
            int r11 = androidx.leanback.R.animator.lb_onboarding_page_indicator_fade_out
            android.animation.Animator r11 = android.animation.AnimatorInflater.loadAnimator(r1, r11)
            androidx.leanback.widget.PagingIndicator r2 = r10.mPageIndicator
            r11.setTarget(r2)
            androidx.leanback.app.OnboardingFragment$7 r2 = new androidx.leanback.app.OnboardingFragment$7
            r2.<init>(r10)
            r11.addListener(r2)
            r0.add(r11)
            int r11 = androidx.leanback.R.animator.lb_onboarding_start_button_fade_in
            android.animation.Animator r11 = android.animation.AnimatorInflater.loadAnimator(r1, r11)
            android.view.View r1 = r10.mStartButton
            r11.setTarget(r1)
            r0.add(r11)
            goto L104
        Ld4:
            int r3 = r10.getPageCount()
            int r3 = r3 - r2
            if (r11 != r3) goto L104
            androidx.leanback.widget.PagingIndicator r11 = r10.mPageIndicator
            r11.setVisibility(r5)
            int r11 = androidx.leanback.R.animator.lb_onboarding_page_indicator_fade_in
            android.animation.Animator r11 = android.animation.AnimatorInflater.loadAnimator(r1, r11)
            androidx.leanback.widget.PagingIndicator r2 = r10.mPageIndicator
            r11.setTarget(r2)
            r0.add(r11)
            int r11 = androidx.leanback.R.animator.lb_onboarding_start_button_fade_out
            android.animation.Animator r11 = android.animation.AnimatorInflater.loadAnimator(r1, r11)
            android.view.View r1 = r10.mStartButton
            r11.setTarget(r1)
            androidx.leanback.app.OnboardingFragment$8 r1 = new androidx.leanback.app.OnboardingFragment$8
            r1.<init>(r10)
            r11.addListener(r1)
            r0.add(r11)
        L104:
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            r10.mAnimator = r11
            r11.playTogether(r0)
            android.animation.AnimatorSet r11 = r10.mAnimator
            r11.start()
            return
    }

    private void resolveTheme() {
            r5 = this;
            android.content.Context r0 = androidx.leanback.app.FragmentUtil.getContext(r5)
            int r1 = r5.onProvideTheme()
            r2 = -1
            if (r1 != r2) goto L27
            int r1 = androidx.leanback.R.attr.onboardingTheme
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r0.getTheme()
            r4 = 1
            boolean r1 = r3.resolveAttribute(r1, r2, r4)
            if (r1 == 0) goto L2e
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            int r2 = r2.resourceId
            r1.<init>(r0, r2)
            r5.mThemeWrapper = r1
            goto L2e
        L27:
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            r2.<init>(r0, r1)
            r5.mThemeWrapper = r2
        L2e:
            return
    }

    @androidx.annotation.ColorInt
    public final int getArrowBackgroundColor() {
            r1 = this;
            int r0 = r1.mArrowBackgroundColor
            return r0
    }

    @androidx.annotation.ColorInt
    public final int getArrowColor() {
            r1 = this;
            int r0 = r1.mArrowColor
            return r0
    }

    @androidx.annotation.ColorInt
    public final int getDescriptionViewTextColor() {
            r1 = this;
            int r0 = r1.mDescriptionViewTextColor
            return r0
    }

    @androidx.annotation.ColorInt
    public final int getDotBackgroundColor() {
            r1 = this;
            int r0 = r1.mDotBackgroundColor
            return r0
    }

    public final int getIconResourceId() {
            r1 = this;
            int r0 = r1.mIconResourceId
            return r0
    }

    public final int getLogoResourceId() {
            r1 = this;
            int r0 = r1.mLogoResourceId
            return r0
    }

    public abstract int getPageCount();

    public abstract java.lang.CharSequence getPageDescription();

    public abstract java.lang.CharSequence getPageTitle();

    public final java.lang.CharSequence getStartButtonText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mStartButtonText
            return r0
    }

    @androidx.annotation.ColorInt
    public final int getTitleViewTextColor() {
            r1 = this;
            int r0 = r1.mTitleViewTextColor
            return r0
    }

    public final void moveToNextPage() {
            r2 = this;
            boolean r0 = r2.mLogoAnimationFinished
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r2.mCurrentPageIndex
            int r1 = r2.getPageCount()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L1a
            int r0 = r2.mCurrentPageIndex
            int r0 = r0 + 1
            r2.mCurrentPageIndex = r0
            int r0 = r0 + (-1)
            r2.onPageChangedInternal(r0)
        L1a:
            return
    }

    public final void moveToPreviousPage() {
            r1 = this;
            boolean r0 = r1.mLogoAnimationFinished
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r1.mCurrentPageIndex
            if (r0 <= 0) goto L12
            int r0 = r0 + (-1)
            r1.mCurrentPageIndex = r0
            int r0 = r0 + 1
            r1.onPageChangedInternal(r0)
        L12:
            return
    }

    @androidx.annotation.Nullable
    public abstract android.view.View onCreateBackgroundView();

    @androidx.annotation.Nullable
    public abstract android.view.View onCreateContentView();

    @androidx.annotation.Nullable
    public abstract android.view.View onCreateForegroundView();

    @Override // android.app.Fragment
    @androidx.annotation.Nullable
    public android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            r1.resolveTheme()
            android.view.LayoutInflater r2 = r1.getThemeInflater(r2)
            int r4 = androidx.leanback.R.layout.lb_onboarding_fragment
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.content.res.Resources r3 = r1.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.getLayoutDirection()
            if (r3 != 0) goto L1f
            r0 = 1
        L1f:
            r1.mIsLtr = r0
            int r3 = androidx.leanback.R.id.page_indicator
            android.view.View r3 = r2.findViewById(r3)
            androidx.leanback.widget.PagingIndicator r3 = (androidx.leanback.widget.PagingIndicator) r3
            r1.mPageIndicator = r3
            android.view.View$OnClickListener r4 = r1.mOnClickListener
            r3.setOnClickListener(r4)
            androidx.leanback.widget.PagingIndicator r3 = r1.mPageIndicator
            android.view.View$OnKeyListener r4 = r1.mOnKeyListener
            r3.setOnKeyListener(r4)
            int r3 = androidx.leanback.R.id.button_start
            android.view.View r3 = r2.findViewById(r3)
            r1.mStartButton = r3
            android.view.View$OnClickListener r4 = r1.mOnClickListener
            r3.setOnClickListener(r4)
            android.view.View r3 = r1.mStartButton
            android.view.View$OnKeyListener r4 = r1.mOnKeyListener
            r3.setOnKeyListener(r4)
            int r3 = androidx.leanback.R.id.main_icon
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r1.mMainIconView = r3
            int r3 = androidx.leanback.R.id.logo
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r1.mLogoView = r3
            int r3 = androidx.leanback.R.id.title
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.mTitleView = r3
            int r3 = androidx.leanback.R.id.description
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.mDescriptionView = r3
            boolean r3 = r1.mTitleViewTextColorSet
            if (r3 == 0) goto L7e
            android.widget.TextView r3 = r1.mTitleView
            int r4 = r1.mTitleViewTextColor
            r3.setTextColor(r4)
        L7e:
            boolean r3 = r1.mDescriptionViewTextColorSet
            if (r3 == 0) goto L89
            android.widget.TextView r3 = r1.mDescriptionView
            int r4 = r1.mDescriptionViewTextColor
            r3.setTextColor(r4)
        L89:
            boolean r3 = r1.mDotBackgroundColorSet
            if (r3 == 0) goto L94
            androidx.leanback.widget.PagingIndicator r3 = r1.mPageIndicator
            int r4 = r1.mDotBackgroundColor
            r3.setDotBackgroundColor(r4)
        L94:
            boolean r3 = r1.mArrowColorSet
            if (r3 == 0) goto L9f
            androidx.leanback.widget.PagingIndicator r3 = r1.mPageIndicator
            int r4 = r1.mArrowColor
            r3.setArrowColor(r4)
        L9f:
            boolean r3 = r1.mArrowBackgroundColorSet
            if (r3 == 0) goto Laa
            androidx.leanback.widget.PagingIndicator r3 = r1.mPageIndicator
            int r4 = r1.mArrowBackgroundColor
            r3.setDotBackgroundColor(r4)
        Laa:
            boolean r3 = r1.mStartButtonTextSet
            if (r3 == 0) goto Lb7
            android.view.View r3 = r1.mStartButton
            android.widget.Button r3 = (android.widget.Button) r3
            java.lang.CharSequence r4 = r1.mStartButtonText
            r3.setText(r4)
        Lb7:
            android.content.Context r3 = androidx.leanback.app.FragmentUtil.getContext(r1)
            int r4 = androidx.leanback.app.OnboardingFragment.sSlideDistance
            if (r4 != 0) goto Ld0
            r4 = 1114636288(0x42700000, float:60.0)
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.scaledDensity
            float r3 = r3 * r4
            int r3 = (int) r3
            androidx.leanback.app.OnboardingFragment.sSlideDistance = r3
        Ld0:
            r2.requestFocus()
            return r2
    }

    public final void onLogoAnimationFinished() {
            r6 = this;
            android.content.Context r0 = androidx.leanback.app.FragmentUtil.getContext(r6)
            if (r0 != 0) goto L8
            goto L126
        L8:
            android.widget.ImageView r1 = r6.mLogoView
            r2 = 8
            r1.setVisibility(r2)
            int r1 = r6.mIconResourceId
            r2 = 0
            if (r1 == 0) goto L1e
            android.widget.ImageView r3 = r6.mMainIconView
            r3.setImageResource(r1)
            android.widget.ImageView r1 = r6.mMainIconView
            r1.setVisibility(r2)
        L1e:
            android.view.View r1 = r6.getView()
            android.content.Context r3 = androidx.leanback.app.FragmentUtil.getContext(r6)
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r6.getThemeInflater(r3)
            int r3 = androidx.leanback.R.id.background_container
            android.view.View r3 = r1.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r4 = r6.onCreateBackgroundView()
            if (r4 == 0) goto L41
            r3.setVisibility(r2)
            r3.addView(r4)
        L41:
            int r3 = androidx.leanback.R.id.content_container
            android.view.View r4 = r1.findViewById(r3)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r6.onCreateContentView()
            if (r5 == 0) goto L55
            r4.setVisibility(r2)
            r4.addView(r5)
        L55:
            int r4 = androidx.leanback.R.id.foreground_container
            android.view.View r4 = r1.findViewById(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r6.onCreateForegroundView()
            if (r5 == 0) goto L69
            r4.setVisibility(r2)
            r4.addView(r5)
        L69:
            int r4 = androidx.leanback.R.id.page_container
            android.view.View r4 = r1.findViewById(r4)
            r4.setVisibility(r2)
            android.view.View r1 = r1.findViewById(r3)
            r1.setVisibility(r2)
            int r1 = r6.getPageCount()
            r3 = 1
            if (r1 <= r3) goto L90
            androidx.leanback.widget.PagingIndicator r1 = r6.mPageIndicator
            int r4 = r6.getPageCount()
            r1.setPageCount(r4)
            androidx.leanback.widget.PagingIndicator r1 = r6.mPageIndicator
            int r4 = r6.mCurrentPageIndex
            r1.onPageSelected(r4, r2)
        L90:
            int r1 = r6.mCurrentPageIndex
            int r4 = r6.getPageCount()
            int r4 = r4 - r3
            if (r1 != r4) goto L9f
            android.view.View r1 = r6.mStartButton
            r1.setVisibility(r2)
            goto La4
        L9f:
            androidx.leanback.widget.PagingIndicator r1 = r6.mPageIndicator
            r1.setVisibility(r2)
        La4:
            android.widget.TextView r1 = r6.mTitleView
            java.lang.CharSequence r2 = r6.getPageTitle()
            r1.setText(r2)
            android.widget.TextView r1 = r6.mDescriptionView
            java.lang.CharSequence r2 = r6.getPageDescription()
            r1.setText(r2)
            boolean r1 = r6.mEnterAnimationFinished
            if (r1 == 0) goto Lbb
            goto L126
        Lbb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = androidx.leanback.R.animator.lb_onboarding_page_indicator_enter
            android.animation.Animator r0 = android.animation.AnimatorInflater.loadAnimator(r0, r2)
            int r2 = r6.getPageCount()
            if (r2 > r3) goto Lcf
            android.view.View r2 = r6.mStartButton
            goto Ld1
        Lcf:
            androidx.leanback.widget.PagingIndicator r2 = r6.mPageIndicator
        Ld1:
            r0.setTarget(r2)
            r1.add(r0)
            android.content.Context r0 = androidx.leanback.app.FragmentUtil.getContext(r6)
            int r2 = androidx.leanback.R.animator.lb_onboarding_title_enter
            android.animation.Animator r0 = android.animation.AnimatorInflater.loadAnimator(r0, r2)
            if (r0 == 0) goto Leb
            android.widget.TextView r2 = r6.mTitleView
            r0.setTarget(r2)
            r1.add(r0)
        Leb:
            android.content.Context r0 = androidx.leanback.app.FragmentUtil.getContext(r6)
            int r2 = androidx.leanback.R.animator.lb_onboarding_description_enter
            android.animation.Animator r0 = android.animation.AnimatorInflater.loadAnimator(r0, r2)
            if (r0 == 0) goto Lff
            android.widget.TextView r2 = r6.mDescriptionView
            r0.setTarget(r2)
            r1.add(r0)
        Lff:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L106
            goto L126
        L106:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r6.mAnimator = r0
            r0.playTogether(r1)
            android.animation.AnimatorSet r0 = r6.mAnimator
            r0.start()
            android.animation.AnimatorSet r0 = r6.mAnimator
            androidx.leanback.app.OnboardingFragment$5 r1 = new androidx.leanback.app.OnboardingFragment$5
            r1.<init>(r6)
            r0.addListener(r1)
            android.view.View r0 = r6.getView()
            r0.requestFocus()
        L126:
            return
    }

    public int onProvideTheme() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            int r0 = r2.mCurrentPageIndex
            java.lang.String r1 = "leanback.onboarding.current_page_index"
            r3.putInt(r1, r0)
            boolean r0 = r2.mLogoAnimationFinished
            java.lang.String r1 = "leanback.onboarding.logo_animation_finished"
            r3.putBoolean(r1, r0)
            boolean r0 = r2.mEnterAnimationFinished
            java.lang.String r1 = "leanback.onboarding.enter_animation_finished"
            r3.putBoolean(r1, r0)
            return
    }

    @Override // android.app.Fragment
    public void onViewCreated(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r1 = this;
            super.onViewCreated(r2, r3)
            if (r3 != 0) goto L1e
            r3 = 0
            r1.mCurrentPageIndex = r3
            r1.mLogoAnimationFinished = r3
            r1.mEnterAnimationFinished = r3
            androidx.leanback.widget.PagingIndicator r0 = r1.mPageIndicator
            r0.onPageSelected(r3, r3)
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            androidx.leanback.app.OnboardingFragment$3 r3 = new androidx.leanback.app.OnboardingFragment$3
            r3.<init>(r1)
            r2.addOnPreDrawListener(r3)
            goto L4a
        L1e:
            java.lang.String r2 = "leanback.onboarding.current_page_index"
            int r2 = r3.getInt(r2)
            r1.mCurrentPageIndex = r2
            java.lang.String r2 = "leanback.onboarding.logo_animation_finished"
            boolean r2 = r3.getBoolean(r2)
            r1.mLogoAnimationFinished = r2
            java.lang.String r2 = "leanback.onboarding.enter_animation_finished"
            boolean r2 = r3.getBoolean(r2)
            r1.mEnterAnimationFinished = r2
            boolean r2 = r1.mLogoAnimationFinished
            if (r2 != 0) goto L47
            boolean r2 = r1.startLogoAnimation()
            if (r2 != 0) goto L4a
            r2 = 1
            r1.mLogoAnimationFinished = r2
            r1.onLogoAnimationFinished()
            goto L4a
        L47:
            r1.onLogoAnimationFinished()
        L4a:
            return
    }

    public void setArrowBackgroundColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            r1.mArrowBackgroundColor = r2
            r0 = 1
            r1.mArrowBackgroundColorSet = r0
            androidx.leanback.widget.PagingIndicator r0 = r1.mPageIndicator
            if (r0 == 0) goto Lc
            r0.setArrowBackgroundColor(r2)
        Lc:
            return
    }

    public void setArrowColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            r1.mArrowColor = r2
            r0 = 1
            r1.mArrowColorSet = r0
            androidx.leanback.widget.PagingIndicator r0 = r1.mPageIndicator
            if (r0 == 0) goto Lc
            r0.setArrowColor(r2)
        Lc:
            return
    }

    public void setDescriptionViewTextColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            r1.mDescriptionViewTextColor = r2
            r0 = 1
            r1.mDescriptionViewTextColorSet = r0
            android.widget.TextView r0 = r1.mDescriptionView
            if (r0 == 0) goto Lc
            r0.setTextColor(r2)
        Lc:
            return
    }

    public void setDotBackgroundColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            r1.mDotBackgroundColor = r2
            r0 = 1
            r1.mDotBackgroundColorSet = r0
            androidx.leanback.widget.PagingIndicator r0 = r1.mPageIndicator
            if (r0 == 0) goto Lc
            r0.setDotBackgroundColor(r2)
        Lc:
            return
    }

    public final void setIconResouceId(int r2) {
            r1 = this;
            r1.mIconResourceId = r2
            android.widget.ImageView r0 = r1.mMainIconView
            if (r0 == 0) goto Lf
            r0.setImageResource(r2)
            android.widget.ImageView r2 = r1.mMainIconView
            r0 = 0
            r2.setVisibility(r0)
        Lf:
            return
    }

    public final void setLogoResourceId(int r1) {
            r0 = this;
            r0.mLogoResourceId = r1
            return
    }

    public void setStartButtonText(java.lang.CharSequence r2) {
            r1 = this;
            r1.mStartButtonText = r2
            r0 = 1
            r1.mStartButtonTextSet = r0
            android.view.View r0 = r1.mStartButton
            if (r0 == 0) goto Le
            android.widget.Button r0 = (android.widget.Button) r0
            r0.setText(r2)
        Le:
            return
    }

    public void setTitleViewTextColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            r1.mTitleViewTextColor = r2
            r0 = 1
            r1.mTitleViewTextColorSet = r0
            android.widget.TextView r0 = r1.mTitleView
            if (r0 == 0) goto Lc
            r0.setTextColor(r2)
        Lc:
            return
    }

    public final boolean startLogoAnimation() {
            r7 = this;
            android.content.Context r0 = androidx.leanback.app.FragmentUtil.getContext(r7)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r7.mLogoResourceId
            r3 = 1
            if (r2 == 0) goto L3f
            android.widget.ImageView r2 = r7.mLogoView
            r2.setVisibility(r1)
            android.widget.ImageView r2 = r7.mLogoView
            int r4 = r7.mLogoResourceId
            r2.setImageResource(r4)
            int r2 = androidx.leanback.R.animator.lb_onboarding_logo_enter
            android.animation.Animator r2 = android.animation.AnimatorInflater.loadAnimator(r0, r2)
            int r4 = androidx.leanback.R.animator.lb_onboarding_logo_exit
            android.animation.Animator r4 = android.animation.AnimatorInflater.loadAnimator(r0, r4)
            r5 = 1333(0x535, double:6.586E-321)
            r4.setStartDelay(r5)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r6 = 2
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r1] = r2
            r6[r3] = r4
            r5.playSequentially(r6)
            android.widget.ImageView r2 = r7.mLogoView
            r5.setTarget(r2)
            goto L40
        L3f:
            r5 = 0
        L40:
            if (r5 == 0) goto L4e
            androidx.leanback.app.OnboardingFragment$4 r1 = new androidx.leanback.app.OnboardingFragment$4
            r1.<init>(r7, r0)
            r5.addListener(r1)
            r5.start()
            return r3
        L4e:
            return r1
    }
}
