package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackSupportFragment extends androidx.fragment.app.Fragment {
    private static final int ANIMATING = 1;
    private static final int ANIMATION_MULTIPLIER = 1;
    public static final int BG_DARK = 1;
    public static final int BG_LIGHT = 2;
    public static final int BG_NONE = 0;
    private static final boolean DEBUG = false;
    private static final int IDLE = 0;
    private static final int START_FADE_OUT = 1;
    private static final java.lang.String TAG = "PlaybackSupportFragment";
    public androidx.leanback.widget.ObjectAdapter mAdapter;
    private final androidx.leanback.widget.ItemBridgeAdapter.AdapterListener mAdapterListener;
    public int mAnimationTranslateY;
    public int mAutohideTimerAfterPlayingInMs;
    public int mAutohideTimerAfterTickleInMs;
    public int mBackgroundType;
    public android.view.View mBackgroundView;
    public int mBgAlpha;
    public int mBgDarkColor;
    public android.animation.ValueAnimator mBgFadeInAnimator;
    public android.animation.ValueAnimator mBgFadeOutAnimator;
    public int mBgLightColor;
    public final androidx.leanback.widget.PlaybackSeekUi.Client mChainedClient;
    public android.animation.ValueAnimator mControlRowFadeInAnimator;
    public android.animation.ValueAnimator mControlRowFadeOutAnimator;
    public boolean mControlVisible;
    public boolean mControlVisibleBeforeOnCreateView;
    public androidx.leanback.widget.BaseOnItemViewClickedListener mExternalItemClickedListener;
    public androidx.leanback.widget.BaseOnItemViewSelectedListener mExternalItemSelectedListener;
    public androidx.leanback.app.PlaybackSupportFragment.OnFadeCompleteListener mFadeCompleteListener;
    private final android.animation.Animator.AnimatorListener mFadeListener;
    public boolean mFadingEnabled;
    private final android.os.Handler mHandler;
    public androidx.leanback.media.PlaybackGlueHost.HostCallback mHostCallback;
    public boolean mInSeek;
    public android.view.View.OnKeyListener mInputEventHandler;
    private android.animation.TimeInterpolator mLogAccelerateInterpolator;
    private android.animation.TimeInterpolator mLogDecelerateInterpolator;
    public int mMajorFadeTranslateY;
    public int mMinorFadeTranslateY;
    private final androidx.leanback.widget.BaseOnItemViewClickedListener mOnItemViewClickedListener;
    private final androidx.leanback.widget.BaseOnItemViewSelectedListener mOnItemViewSelectedListener;
    private final androidx.leanback.widget.BaseGridView.OnKeyInterceptListener mOnKeyInterceptListener;
    private final androidx.leanback.widget.BaseGridView.OnTouchInterceptListener mOnTouchInterceptListener;
    public android.animation.ValueAnimator mOtherRowFadeInAnimator;
    public android.animation.ValueAnimator mOtherRowFadeOutAnimator;
    public int mOtherRowsCenterToBottom;
    public int mPaddingBottom;
    public androidx.leanback.widget.BaseOnItemViewClickedListener mPlaybackItemClickedListener;
    public androidx.leanback.widget.PlaybackRowPresenter mPresenter;
    public androidx.leanback.app.ProgressBarManager mProgressBarManager;
    public android.view.View mRootView;
    public androidx.leanback.widget.Row mRow;
    public androidx.leanback.app.RowsSupportFragment mRowsSupportFragment;
    public androidx.leanback.widget.PlaybackSeekUi.Client mSeekUiClient;
    private final androidx.leanback.app.PlaybackSupportFragment.SetSelectionRunnable mSetSelectionRunnable;












    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class OnFadeCompleteListener {
        public OnFadeCompleteListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onFadeInComplete() {
                r0 = this;
                return
        }

        public void onFadeOutComplete() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SetSelectionRunnable implements java.lang.Runnable {
        public int mPosition;
        public boolean mSmooth;
        public final /* synthetic */ androidx.leanback.app.PlaybackSupportFragment this$0;

        public SetSelectionRunnable(androidx.leanback.app.PlaybackSupportFragment r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 1
                r0.mSmooth = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.leanback.app.PlaybackSupportFragment r0 = r3.this$0
                androidx.leanback.app.RowsSupportFragment r0 = r0.mRowsSupportFragment
                if (r0 != 0) goto L7
                return
            L7:
                int r1 = r3.mPosition
                boolean r2 = r3.mSmooth
                r0.setSelectedPosition(r1, r2)
                return
        }
    }

    public PlaybackSupportFragment() {
            r3 = this;
            r3.<init>()
            androidx.leanback.app.ProgressBarManager r0 = new androidx.leanback.app.ProgressBarManager
            r0.<init>()
            r3.mProgressBarManager = r0
            androidx.leanback.app.PlaybackSupportFragment$1 r0 = new androidx.leanback.app.PlaybackSupportFragment$1
            r0.<init>(r3)
            r3.mOnItemViewClickedListener = r0
            androidx.leanback.app.PlaybackSupportFragment$2 r0 = new androidx.leanback.app.PlaybackSupportFragment$2
            r0.<init>(r3)
            r3.mOnItemViewSelectedListener = r0
            androidx.leanback.app.PlaybackSupportFragment$SetSelectionRunnable r0 = new androidx.leanback.app.PlaybackSupportFragment$SetSelectionRunnable
            r0.<init>(r3)
            r3.mSetSelectionRunnable = r0
            r0 = 1
            r3.mBackgroundType = r0
            r3.mFadingEnabled = r0
            r3.mControlVisibleBeforeOnCreateView = r0
            r3.mControlVisible = r0
            androidx.leanback.app.PlaybackSupportFragment$3 r0 = new androidx.leanback.app.PlaybackSupportFragment$3
            r0.<init>(r3)
            r3.mFadeListener = r0
            androidx.leanback.app.PlaybackSupportFragment$4 r0 = new androidx.leanback.app.PlaybackSupportFragment$4
            r0.<init>(r3)
            r3.mHandler = r0
            androidx.leanback.app.PlaybackSupportFragment$5 r0 = new androidx.leanback.app.PlaybackSupportFragment$5
            r0.<init>(r3)
            r3.mOnTouchInterceptListener = r0
            androidx.leanback.app.PlaybackSupportFragment$6 r0 = new androidx.leanback.app.PlaybackSupportFragment$6
            r0.<init>(r3)
            r3.mOnKeyInterceptListener = r0
            androidx.leanback.animation.LogDecelerateInterpolator r0 = new androidx.leanback.animation.LogDecelerateInterpolator
            r1 = 100
            r2 = 0
            r0.<init>(r1, r2)
            r3.mLogDecelerateInterpolator = r0
            androidx.leanback.animation.LogAccelerateInterpolator r0 = new androidx.leanback.animation.LogAccelerateInterpolator
            r0.<init>(r1, r2)
            r3.mLogAccelerateInterpolator = r0
            androidx.leanback.app.PlaybackSupportFragment$10 r0 = new androidx.leanback.app.PlaybackSupportFragment$10
            r0.<init>(r3)
            r3.mAdapterListener = r0
            androidx.leanback.app.PlaybackSupportFragment$11 r0 = new androidx.leanback.app.PlaybackSupportFragment$11
            r0.<init>(r3)
            r3.mChainedClient = r0
            androidx.leanback.app.ProgressBarManager r0 = r3.mProgressBarManager
            r1 = 500(0x1f4, double:2.47E-321)
            r0.setInitialDelay(r1)
            return
    }

    public static void endAll(android.animation.ValueAnimator r1, android.animation.ValueAnimator r2) {
            boolean r0 = r1.isStarted()
            if (r0 == 0) goto La
            r1.end()
            goto L13
        La:
            boolean r1 = r2.isStarted()
            if (r1 == 0) goto L13
            r2.end()
        L13:
            return
    }

    private static android.animation.ValueAnimator loadAnimator(android.content.Context r4, int r5) {
            android.animation.Animator r4 = android.animation.AnimatorInflater.loadAnimator(r4, r5)
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            long r0 = r4.getDuration()
            r2 = 1
            long r0 = r0 * r2
            r4.setDuration(r0)
            return r4
    }

    private void loadBgAnimator() {
            r4 = this;
            androidx.leanback.app.PlaybackSupportFragment$7 r0 = new androidx.leanback.app.PlaybackSupportFragment$7
            r0.<init>(r4)
            android.content.Context r1 = r4.getContext()
            int r2 = androidx.leanback.R.animator.lb_playback_bg_fade_in
            android.animation.ValueAnimator r2 = loadAnimator(r1, r2)
            r4.mBgFadeInAnimator = r2
            r2.addUpdateListener(r0)
            android.animation.ValueAnimator r2 = r4.mBgFadeInAnimator
            android.animation.Animator$AnimatorListener r3 = r4.mFadeListener
            r2.addListener(r3)
            int r2 = androidx.leanback.R.animator.lb_playback_bg_fade_out
            android.animation.ValueAnimator r1 = loadAnimator(r1, r2)
            r4.mBgFadeOutAnimator = r1
            r1.addUpdateListener(r0)
            android.animation.ValueAnimator r0 = r4.mBgFadeOutAnimator
            android.animation.Animator$AnimatorListener r1 = r4.mFadeListener
            r0.addListener(r1)
            return
    }

    private void loadControlRowAnimator() {
            r4 = this;
            androidx.leanback.app.PlaybackSupportFragment$8 r0 = new androidx.leanback.app.PlaybackSupportFragment$8
            r0.<init>(r4)
            android.content.Context r1 = r4.getContext()
            int r2 = androidx.leanback.R.animator.lb_playback_controls_fade_in
            android.animation.ValueAnimator r2 = loadAnimator(r1, r2)
            r4.mControlRowFadeInAnimator = r2
            r2.addUpdateListener(r0)
            android.animation.ValueAnimator r2 = r4.mControlRowFadeInAnimator
            android.animation.TimeInterpolator r3 = r4.mLogDecelerateInterpolator
            r2.setInterpolator(r3)
            int r2 = androidx.leanback.R.animator.lb_playback_controls_fade_out
            android.animation.ValueAnimator r1 = loadAnimator(r1, r2)
            r4.mControlRowFadeOutAnimator = r1
            r1.addUpdateListener(r0)
            android.animation.ValueAnimator r0 = r4.mControlRowFadeOutAnimator
            android.animation.TimeInterpolator r1 = r4.mLogAccelerateInterpolator
            r0.setInterpolator(r1)
            return
    }

    private void loadOtherRowAnimator() {
            r4 = this;
            androidx.leanback.app.PlaybackSupportFragment$9 r0 = new androidx.leanback.app.PlaybackSupportFragment$9
            r0.<init>(r4)
            android.content.Context r1 = r4.getContext()
            int r2 = androidx.leanback.R.animator.lb_playback_controls_fade_in
            android.animation.ValueAnimator r2 = loadAnimator(r1, r2)
            r4.mOtherRowFadeInAnimator = r2
            r2.addUpdateListener(r0)
            android.animation.ValueAnimator r2 = r4.mOtherRowFadeInAnimator
            android.animation.TimeInterpolator r3 = r4.mLogDecelerateInterpolator
            r2.setInterpolator(r3)
            int r2 = androidx.leanback.R.animator.lb_playback_controls_fade_out
            android.animation.ValueAnimator r1 = loadAnimator(r1, r2)
            r4.mOtherRowFadeOutAnimator = r1
            r1.addUpdateListener(r0)
            android.animation.ValueAnimator r0 = r4.mOtherRowFadeOutAnimator
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            return
    }

    public static void reverseFirstOrStartSecond(android.animation.ValueAnimator r1, android.animation.ValueAnimator r2, boolean r3) {
            boolean r0 = r1.isStarted()
            if (r0 == 0) goto Lf
            r1.reverse()
            if (r3 != 0) goto L17
            r1.end()
            goto L17
        Lf:
            r2.start()
            if (r3 != 0) goto L17
            r2.end()
        L17:
            return
    }

    private void setupChildFragmentLayout() {
            r5 = this;
            androidx.leanback.app.RowsSupportFragment r0 = r5.mRowsSupportFragment
            androidx.leanback.widget.VerticalGridView r0 = r0.getVerticalGridView()
            if (r0 != 0) goto L9
            goto L36
        L9:
            int r1 = r5.mPaddingBottom
            int r1 = -r1
            r0.setWindowAlignmentOffset(r1)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.setWindowAlignmentOffsetPercent(r1)
            int r1 = r5.mOtherRowsCenterToBottom
            int r2 = r5.mPaddingBottom
            int r1 = r1 - r2
            r0.setItemAlignmentOffset(r1)
            r1 = 1112014848(0x42480000, float:50.0)
            r0.setItemAlignmentOffsetPercent(r1)
            int r1 = r0.getPaddingLeft()
            int r2 = r0.getPaddingTop()
            int r3 = r0.getPaddingRight()
            int r4 = r5.mPaddingBottom
            r0.setPadding(r1, r2, r3, r4)
            r1 = 2
            r0.setWindowAlignment(r1)
        L36:
            return
    }

    private void setupPresenter() {
            r3 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r3.mAdapter
            if (r0 == 0) goto L39
            androidx.leanback.widget.Row r1 = r3.mRow
            if (r1 == 0) goto L39
            androidx.leanback.widget.PlaybackRowPresenter r1 = r3.mPresenter
            if (r1 == 0) goto L39
            androidx.leanback.widget.PresenterSelector r0 = r0.getPresenterSelector()
            if (r0 != 0) goto L28
            androidx.leanback.widget.ClassPresenterSelector r0 = new androidx.leanback.widget.ClassPresenterSelector
            r0.<init>()
            androidx.leanback.widget.Row r1 = r3.mRow
            java.lang.Class r1 = r1.getClass()
            androidx.leanback.widget.PlaybackRowPresenter r2 = r3.mPresenter
            r0.addClassPresenter(r1, r2)
            androidx.leanback.widget.ObjectAdapter r1 = r3.mAdapter
            r1.setPresenterSelector(r0)
            goto L39
        L28:
            boolean r1 = r0 instanceof androidx.leanback.widget.ClassPresenterSelector
            if (r1 == 0) goto L39
            androidx.leanback.widget.ClassPresenterSelector r0 = (androidx.leanback.widget.ClassPresenterSelector) r0
            androidx.leanback.widget.Row r1 = r3.mRow
            java.lang.Class r1 = r1.getClass()
            androidx.leanback.widget.PlaybackRowPresenter r2 = r3.mPresenter
            r0.addClassPresenter(r1, r2)
        L39:
            return
    }

    private void setupRow() {
            r3 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r3.mAdapter
            boolean r1 = r0 instanceof androidx.leanback.widget.ArrayObjectAdapter
            r2 = 0
            if (r1 == 0) goto L1f
            androidx.leanback.widget.Row r1 = r3.mRow
            if (r1 == 0) goto L1f
            androidx.leanback.widget.ArrayObjectAdapter r0 = (androidx.leanback.widget.ArrayObjectAdapter) r0
            int r1 = r0.size()
            if (r1 != 0) goto L19
            androidx.leanback.widget.Row r1 = r3.mRow
            r0.add(r1)
            goto L2c
        L19:
            androidx.leanback.widget.Row r1 = r3.mRow
            r0.replace(r2, r1)
            goto L2c
        L1f:
            boolean r1 = r0 instanceof androidx.leanback.widget.SparseArrayObjectAdapter
            if (r1 == 0) goto L2c
            androidx.leanback.widget.Row r1 = r3.mRow
            if (r1 == 0) goto L2c
            androidx.leanback.widget.SparseArrayObjectAdapter r0 = (androidx.leanback.widget.SparseArrayObjectAdapter) r0
            r0.set(r2, r1)
        L2c:
            return
    }

    private void startFadeTimer(int r5) {
            r4 = this;
            android.os.Handler r0 = r4.mHandler
            if (r0 == 0) goto Le
            r1 = 1
            r0.removeMessages(r1)
            android.os.Handler r0 = r4.mHandler
            long r2 = (long) r5
            r0.sendEmptyMessageDelayed(r1, r2)
        Le:
            return
    }

    private void stopFadeTimer() {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            if (r0 == 0) goto L8
            r1 = 1
            r0.removeMessages(r1)
        L8:
            return
    }

    private void updateBackground() {
            r4 = this;
            android.view.View r0 = r4.mBackgroundView
            if (r0 == 0) goto L29
            int r1 = r4.mBgDarkColor
            int r2 = r4.mBackgroundType
            if (r2 == 0) goto L11
            r3 = 2
            if (r2 == r3) goto Le
            goto L12
        Le:
            int r1 = r4.mBgLightColor
            goto L12
        L11:
            r1 = 0
        L12:
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r1)
            r0.setBackground(r2)
            int r0 = r4.mBgAlpha
            r4.mBgAlpha = r0
            android.view.View r1 = r4.mBackgroundView
            if (r1 == 0) goto L29
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            r1.setAlpha(r0)
        L29:
            return
    }

    @java.lang.Deprecated
    public void fadeOut() {
            r1 = this;
            r0 = 0
            r1.showControlsOverlay(r0, r0)
            return
    }

    public androidx.leanback.widget.ObjectAdapter getAdapter() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            return r0
    }

    public int getBackgroundType() {
            r1 = this;
            int r0 = r1.mBackgroundType
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.leanback.app.PlaybackSupportFragment.OnFadeCompleteListener getFadeCompleteListener() {
            r1 = this;
            androidx.leanback.app.PlaybackSupportFragment$OnFadeCompleteListener r0 = r1.mFadeCompleteListener
            return r0
    }

    public androidx.leanback.app.ProgressBarManager getProgressBarManager() {
            r1 = this;
            androidx.leanback.app.ProgressBarManager r0 = r1.mProgressBarManager
            return r0
    }

    public final androidx.leanback.widget.VerticalGridView getVerticalGridView() {
            r1 = this;
            androidx.leanback.app.RowsSupportFragment r0 = r1.mRowsSupportFragment
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.leanback.widget.VerticalGridView r0 = r0.getVerticalGridView()
            return r0
    }

    public void hideControlsOverlay(boolean r2) {
            r1 = this;
            r0 = 0
            r1.showControlsOverlay(r0, r2)
            return
    }

    public boolean isControlsOverlayAutoHideEnabled() {
            r1 = this;
            boolean r0 = r1.mFadingEnabled
            return r0
    }

    public boolean isControlsOverlayVisible() {
            r1 = this;
            boolean r0 = r1.mControlVisible
            return r0
    }

    @java.lang.Deprecated
    public boolean isFadingEnabled() {
            r1 = this;
            boolean r0 = r1.isControlsOverlayAutoHideEnabled()
            return r0
    }

    public void notifyPlaybackRowChanged() {
            r3 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r3.mAdapter
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r2 = 1
            r0.notifyItemRangeChanged(r1, r2)
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            android.content.res.Resources r4 = r3.getResources()
            int r0 = androidx.leanback.R.dimen.lb_playback_other_rows_center_to_bottom
            int r4 = r4.getDimensionPixelSize(r0)
            r3.mOtherRowsCenterToBottom = r4
            android.content.res.Resources r4 = r3.getResources()
            int r0 = androidx.leanback.R.dimen.lb_playback_controls_padding_bottom
            int r4 = r4.getDimensionPixelSize(r0)
            r3.mPaddingBottom = r4
            android.content.res.Resources r4 = r3.getResources()
            int r0 = androidx.leanback.R.color.lb_playback_controls_background_dark
            int r4 = r4.getColor(r0)
            r3.mBgDarkColor = r4
            android.content.res.Resources r4 = r3.getResources()
            int r0 = androidx.leanback.R.color.lb_playback_controls_background_light
            int r4 = r4.getColor(r0)
            r3.mBgLightColor = r4
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int r1 = androidx.leanback.R.attr.playbackControlsAutoHideTimeout
            r2 = 1
            r0.resolveAttribute(r1, r4, r2)
            int r0 = r4.data
            r3.mAutohideTimerAfterPlayingInMs = r0
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int r1 = androidx.leanback.R.attr.playbackControlsAutoHideTickleTimeout
            r0.resolveAttribute(r1, r4, r2)
            int r4 = r4.data
            r3.mAutohideTimerAfterTickleInMs = r4
            android.content.res.Resources r4 = r3.getResources()
            int r0 = androidx.leanback.R.dimen.lb_playback_major_fade_translate_y
            int r4 = r4.getDimensionPixelSize(r0)
            r3.mMajorFadeTranslateY = r4
            android.content.res.Resources r4 = r3.getResources()
            int r0 = androidx.leanback.R.dimen.lb_playback_minor_fade_translate_y
            int r4 = r4.getDimensionPixelSize(r0)
            r3.mMinorFadeTranslateY = r4
            r3.loadBgAnimator()
            r3.loadControlRowAnimator()
            r3.loadOtherRowAnimator()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            int r4 = androidx.leanback.R.layout.lb_playback_fragment
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            r1.mRootView = r2
            int r3 = androidx.leanback.R.id.playback_fragment_background
            android.view.View r2 = r2.findViewById(r3)
            r1.mBackgroundView = r2
            androidx.fragment.app.FragmentManager r2 = r1.getChildFragmentManager()
            int r3 = androidx.leanback.R.id.playback_controls_dock
            androidx.fragment.app.Fragment r2 = r2.findFragmentById(r3)
            androidx.leanback.app.RowsSupportFragment r2 = (androidx.leanback.app.RowsSupportFragment) r2
            r1.mRowsSupportFragment = r2
            if (r2 != 0) goto L39
            androidx.leanback.app.RowsSupportFragment r2 = new androidx.leanback.app.RowsSupportFragment
            r2.<init>()
            r1.mRowsSupportFragment = r2
            androidx.fragment.app.FragmentManager r2 = r1.getChildFragmentManager()
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
            androidx.leanback.app.RowsSupportFragment r4 = r1.mRowsSupportFragment
            androidx.fragment.app.FragmentTransaction r2 = r2.replace(r3, r4)
            r2.commit()
        L39:
            androidx.leanback.widget.ObjectAdapter r2 = r1.mAdapter
            if (r2 != 0) goto L4b
            androidx.leanback.widget.ArrayObjectAdapter r2 = new androidx.leanback.widget.ArrayObjectAdapter
            androidx.leanback.widget.ClassPresenterSelector r3 = new androidx.leanback.widget.ClassPresenterSelector
            r3.<init>()
            r2.<init>(r3)
            r1.setAdapter(r2)
            goto L50
        L4b:
            androidx.leanback.app.RowsSupportFragment r3 = r1.mRowsSupportFragment
            r3.setAdapter(r2)
        L50:
            androidx.leanback.app.RowsSupportFragment r2 = r1.mRowsSupportFragment
            androidx.leanback.widget.BaseOnItemViewSelectedListener r3 = r1.mOnItemViewSelectedListener
            r2.setOnItemViewSelectedListener(r3)
            androidx.leanback.app.RowsSupportFragment r2 = r1.mRowsSupportFragment
            androidx.leanback.widget.BaseOnItemViewClickedListener r3 = r1.mOnItemViewClickedListener
            r2.setOnItemViewClickedListener(r3)
            r2 = 255(0xff, float:3.57E-43)
            r1.mBgAlpha = r2
            r1.updateBackground()
            androidx.leanback.app.RowsSupportFragment r2 = r1.mRowsSupportFragment
            androidx.leanback.widget.ItemBridgeAdapter$AdapterListener r3 = r1.mAdapterListener
            r2.mExternalAdapterListener = r3
            androidx.leanback.app.ProgressBarManager r2 = r1.getProgressBarManager()
            if (r2 == 0) goto L78
            android.view.View r3 = r1.mRootView
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2.setRootView(r3)
        L78:
            android.view.View r2 = r1.mRootView
            return r2
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
            r1 = this;
            androidx.leanback.media.PlaybackGlueHost$HostCallback r0 = r1.mHostCallback
            if (r0 == 0) goto L7
            r0.onHostDestroy()
        L7:
            super.onDestroy()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
            r1 = this;
            r0 = 0
            r1.mRootView = r0
            r1.mBackgroundView = r0
            super.onDestroyView()
            return
    }

    public final boolean onInterceptInputEvent(android.view.InputEvent r9) {
            r8 = this;
            boolean r0 = r8.mControlVisible
            r1 = 1
            r0 = r0 ^ r1
            boolean r2 = r9 instanceof android.view.KeyEvent
            r3 = 0
            if (r2 == 0) goto L23
            r2 = r9
            android.view.KeyEvent r2 = (android.view.KeyEvent) r2
            int r4 = r2.getKeyCode()
            int r5 = r2.getAction()
            android.view.View$OnKeyListener r6 = r8.mInputEventHandler
            if (r6 == 0) goto L21
            android.view.View r7 = r8.getView()
            boolean r2 = r6.onKey(r7, r4, r2)
            goto L26
        L21:
            r2 = 0
            goto L26
        L23:
            r2 = 0
            r4 = 0
            r5 = 0
        L26:
            r6 = 4
            if (r4 == r6) goto L42
            r6 = 111(0x6f, float:1.56E-43)
            if (r4 == r6) goto L42
            switch(r4) {
                case 19: goto L38;
                case 20: goto L38;
                case 21: goto L38;
                case 22: goto L38;
                case 23: goto L38;
                default: goto L30;
            }
        L30:
            if (r2 == 0) goto L55
            if (r5 != 0) goto L55
            r8.tickle()
            goto L55
        L38:
            if (r0 == 0) goto L3b
            goto L3c
        L3b:
            r1 = r2
        L3c:
            if (r5 != 0) goto L56
            r8.tickle()
            goto L56
        L42:
            boolean r4 = r8.mInSeek
            if (r4 == 0) goto L47
            return r3
        L47:
            if (r0 != 0) goto L55
            android.view.KeyEvent r9 = (android.view.KeyEvent) r9
            int r9 = r9.getAction()
            if (r9 != r1) goto L56
            r8.hideControlsOverlay(r1)
            goto L56
        L55:
            r1 = r2
        L56:
            return r1
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
            r2 = this;
            androidx.leanback.media.PlaybackGlueHost$HostCallback r0 = r2.mHostCallback
            if (r0 == 0) goto L7
            r0.onHostPause()
        L7:
            android.os.Handler r0 = r2.mHandler
            r1 = 1
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L15
            android.os.Handler r0 = r2.mHandler
            r0.removeMessages(r1)
        L15:
            super.onPause()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
            r2 = this;
            super.onResume()
            boolean r0 = r2.mControlVisible
            if (r0 == 0) goto L10
            boolean r0 = r2.mFadingEnabled
            if (r0 == 0) goto L10
            int r0 = r2.mAutohideTimerAfterPlayingInMs
            r2.startFadeTimer(r0)
        L10:
            androidx.leanback.widget.VerticalGridView r0 = r2.getVerticalGridView()
            androidx.leanback.widget.BaseGridView$OnTouchInterceptListener r1 = r2.mOnTouchInterceptListener
            r0.setOnTouchInterceptListener(r1)
            androidx.leanback.widget.VerticalGridView r0 = r2.getVerticalGridView()
            androidx.leanback.widget.BaseGridView$OnKeyInterceptListener r1 = r2.mOnKeyInterceptListener
            r0.setOnKeyInterceptListener(r1)
            androidx.leanback.media.PlaybackGlueHost$HostCallback r0 = r2.mHostCallback
            if (r0 == 0) goto L29
            r0.onHostResume()
        L29:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
            r2 = this;
            super.onStart()
            r2.setupChildFragmentLayout()
            androidx.leanback.app.RowsSupportFragment r0 = r2.mRowsSupportFragment
            androidx.leanback.widget.ObjectAdapter r1 = r2.mAdapter
            r0.setAdapter(r1)
            androidx.leanback.media.PlaybackGlueHost$HostCallback r0 = r2.mHostCallback
            if (r0 == 0) goto L14
            r0.onHostStart()
        L14:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
            r1 = this;
            androidx.leanback.media.PlaybackGlueHost$HostCallback r0 = r1.mHostCallback
            if (r0 == 0) goto L7
            r0.onHostStop()
        L7:
            super.onStop()
            return
    }

    public void onVideoSizeChanged(int r1, int r2) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            r1 = 1
            r0.mControlVisible = r1
            boolean r2 = r0.mControlVisibleBeforeOnCreateView
            if (r2 != 0) goto L10
            r2 = 0
            r0.showControlsOverlay(r2, r2)
            r0.mControlVisibleBeforeOnCreateView = r1
        L10:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void resetFocus() {
            r2 = this;
            androidx.leanback.widget.VerticalGridView r0 = r2.getVerticalGridView()
            r1 = 0
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.findViewHolderForAdapterPosition(r1)
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r0 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r0
            if (r0 == 0) goto L24
            androidx.leanback.widget.Presenter r1 = r0.getPresenter()
            boolean r1 = r1 instanceof androidx.leanback.widget.PlaybackRowPresenter
            if (r1 == 0) goto L24
            androidx.leanback.widget.Presenter r1 = r0.getPresenter()
            androidx.leanback.widget.PlaybackRowPresenter r1 = (androidx.leanback.widget.PlaybackRowPresenter) r1
            androidx.leanback.widget.Presenter$ViewHolder r0 = r0.getViewHolder()
            androidx.leanback.widget.RowPresenter$ViewHolder r0 = (androidx.leanback.widget.RowPresenter.ViewHolder) r0
            r1.onReappear(r0)
        L24:
            return
    }

    public void setAdapter(androidx.leanback.widget.ObjectAdapter r2) {
            r1 = this;
            r1.mAdapter = r2
            r1.setupRow()
            r1.setupPresenter()
            r1.setPlaybackRowPresenterAlignment()
            androidx.leanback.app.RowsSupportFragment r0 = r1.mRowsSupportFragment
            if (r0 == 0) goto L12
            r0.setAdapter(r2)
        L12:
            return
    }

    public void setBackgroundType(int r2) {
            r1 = this;
            if (r2 == 0) goto L11
            r0 = 1
            if (r2 == r0) goto L11
            r0 = 2
            if (r2 != r0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid background type"
            r2.<init>(r0)
            throw r2
        L11:
            int r0 = r1.mBackgroundType
            if (r2 == r0) goto L1a
            r1.mBackgroundType = r2
            r1.updateBackground()
        L1a:
            return
    }

    public void setControlsOverlayAutoHideEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mFadingEnabled
            if (r2 == r0) goto L25
            r1.mFadingEnabled = r2
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L25
            android.view.View r0 = r1.getView()
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L25
            r0 = 1
            r1.showControlsOverlay(r0)
            if (r2 == 0) goto L22
            int r2 = r1.mAutohideTimerAfterPlayingInMs
            r1.startFadeTimer(r2)
            goto L25
        L22:
            r1.stopFadeTimer()
        L25:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void setFadeCompleteListener(androidx.leanback.app.PlaybackSupportFragment.OnFadeCompleteListener r1) {
            r0 = this;
            r0.mFadeCompleteListener = r1
            return
    }

    @java.lang.Deprecated
    public void setFadingEnabled(boolean r1) {
            r0 = this;
            r0.setControlsOverlayAutoHideEnabled(r1)
            return
    }

    public void setHostCallback(androidx.leanback.media.PlaybackGlueHost.HostCallback r1) {
            r0 = this;
            r0.mHostCallback = r1
            return
    }

    public void setOnItemViewClickedListener(androidx.leanback.widget.BaseOnItemViewClickedListener r1) {
            r0 = this;
            r0.mExternalItemClickedListener = r1
            return
    }

    public void setOnItemViewSelectedListener(androidx.leanback.widget.BaseOnItemViewSelectedListener r1) {
            r0 = this;
            r0.mExternalItemSelectedListener = r1
            return
    }

    public final void setOnKeyInterceptListener(android.view.View.OnKeyListener r1) {
            r0 = this;
            r0.mInputEventHandler = r1
            return
    }

    public void setOnPlaybackItemViewClickedListener(androidx.leanback.widget.BaseOnItemViewClickedListener r1) {
            r0 = this;
            r0.mPlaybackItemClickedListener = r1
            return
    }

    public void setPlaybackRow(androidx.leanback.widget.Row r1) {
            r0 = this;
            r0.mRow = r1
            r0.setupRow()
            r0.setupPresenter()
            return
    }

    public void setPlaybackRowPresenter(androidx.leanback.widget.PlaybackRowPresenter r1) {
            r0 = this;
            r0.mPresenter = r1
            r0.setupPresenter()
            r0.setPlaybackRowPresenterAlignment()
            return
    }

    public final void setPlaybackRowPresenterAlignment() {
            r7 = this;
            java.lang.Class<androidx.leanback.widget.ItemAlignmentFacet> r0 = androidx.leanback.widget.ItemAlignmentFacet.class
            androidx.leanback.widget.ObjectAdapter r1 = r7.mAdapter
            if (r1 == 0) goto L4d
            androidx.leanback.widget.PresenterSelector r1 = r1.getPresenterSelector()
            if (r1 == 0) goto L4d
            androidx.leanback.widget.ObjectAdapter r1 = r7.mAdapter
            androidx.leanback.widget.PresenterSelector r1 = r1.getPresenterSelector()
            androidx.leanback.widget.Presenter[] r1 = r1.getPresenters()
            if (r1 == 0) goto L4d
            r2 = 0
            r3 = 0
        L1a:
            int r4 = r1.length
            if (r3 >= r4) goto L4d
            r4 = r1[r3]
            boolean r4 = r4 instanceof androidx.leanback.widget.PlaybackRowPresenter
            if (r4 == 0) goto L4a
            r4 = r1[r3]
            java.lang.Object r4 = r4.getFacet(r0)
            if (r4 != 0) goto L4a
            androidx.leanback.widget.ItemAlignmentFacet r4 = new androidx.leanback.widget.ItemAlignmentFacet
            r4.<init>()
            androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef r5 = new androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef
            r5.<init>()
            r5.setItemAlignmentOffset(r2)
            r6 = 1120403456(0x42c80000, float:100.0)
            r5.setItemAlignmentOffsetPercent(r6)
            r6 = 1
            androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef[] r6 = new androidx.leanback.widget.ItemAlignmentFacet.ItemAlignmentDef[r6]
            r6[r2] = r5
            r4.setAlignmentDefs(r6)
            r5 = r1[r3]
            r5.setFacet(r0, r4)
        L4a:
            int r3 = r3 + 1
            goto L1a
        L4d:
            return
    }

    public void setPlaybackSeekUiClient(androidx.leanback.widget.PlaybackSeekUi.Client r1) {
            r0 = this;
            r0.mSeekUiClient = r1
            return
    }

    public final void setSeekMode(boolean r5) {
            r4 = this;
            boolean r0 = r4.mInSeek
            if (r0 != r5) goto L5
            return
        L5:
            r4.mInSeek = r5
            androidx.leanback.widget.VerticalGridView r5 = r4.getVerticalGridView()
            r0 = 0
            r5.setSelectedPosition(r0)
            boolean r5 = r4.mInSeek
            if (r5 == 0) goto L16
            r4.stopFadeTimer()
        L16:
            r5 = 1
            r4.showControlsOverlay(r5)
            androidx.leanback.widget.VerticalGridView r5 = r4.getVerticalGridView()
            int r5 = r5.getChildCount()
            r1 = 0
        L23:
            if (r1 >= r5) goto L44
            androidx.leanback.widget.VerticalGridView r2 = r4.getVerticalGridView()
            android.view.View r2 = r2.getChildAt(r1)
            androidx.leanback.widget.VerticalGridView r3 = r4.getVerticalGridView()
            int r3 = r3.getChildAdapterPosition(r2)
            if (r3 <= 0) goto L41
            boolean r3 = r4.mInSeek
            if (r3 == 0) goto L3d
            r3 = 4
            goto L3e
        L3d:
            r3 = 0
        L3e:
            r2.setVisibility(r3)
        L41:
            int r1 = r1 + 1
            goto L23
        L44:
            return
    }

    public void setSelectedPosition(int r2) {
            r1 = this;
            r0 = 1
            r1.setSelectedPosition(r2, r0)
            return
    }

    public void setSelectedPosition(int r2, boolean r3) {
            r1 = this;
            androidx.leanback.app.PlaybackSupportFragment$SetSelectionRunnable r0 = r1.mSetSelectionRunnable
            r0.mPosition = r2
            r0.mSmooth = r3
            android.view.View r2 = r1.getView()
            if (r2 == 0) goto L23
            android.view.View r2 = r1.getView()
            android.os.Handler r2 = r2.getHandler()
            if (r2 == 0) goto L23
            android.view.View r2 = r1.getView()
            android.os.Handler r2 = r2.getHandler()
            androidx.leanback.app.PlaybackSupportFragment$SetSelectionRunnable r3 = r1.mSetSelectionRunnable
            r2.post(r3)
        L23:
            return
    }

    public void showControlsOverlay(boolean r2) {
            r1 = this;
            r0 = 1
            r1.showControlsOverlay(r0, r2)
            return
    }

    public final void showControlsOverlay(boolean r3, boolean r4) {
            r2 = this;
            android.view.View r0 = r2.getView()
            if (r0 != 0) goto L9
            r2.mControlVisibleBeforeOnCreateView = r3
            return
        L9:
            boolean r0 = r2.isResumed()
            if (r0 != 0) goto L10
            r4 = 0
        L10:
            boolean r0 = r2.mControlVisible
            if (r3 != r0) goto L2c
            if (r4 != 0) goto L2b
            android.animation.ValueAnimator r3 = r2.mBgFadeInAnimator
            android.animation.ValueAnimator r4 = r2.mBgFadeOutAnimator
            endAll(r3, r4)
            android.animation.ValueAnimator r3 = r2.mControlRowFadeInAnimator
            android.animation.ValueAnimator r4 = r2.mControlRowFadeOutAnimator
            endAll(r3, r4)
            android.animation.ValueAnimator r3 = r2.mOtherRowFadeInAnimator
            android.animation.ValueAnimator r4 = r2.mOtherRowFadeOutAnimator
            endAll(r3, r4)
        L2b:
            return
        L2c:
            r2.mControlVisible = r3
            if (r3 != 0) goto L33
            r2.stopFadeTimer()
        L33:
            androidx.leanback.widget.VerticalGridView r0 = r2.getVerticalGridView()
            if (r0 == 0) goto L47
            androidx.leanback.widget.VerticalGridView r0 = r2.getVerticalGridView()
            int r0 = r0.getSelectedPosition()
            if (r0 != 0) goto L44
            goto L47
        L44:
            int r0 = r2.mMinorFadeTranslateY
            goto L49
        L47:
            int r0 = r2.mMajorFadeTranslateY
        L49:
            r2.mAnimationTranslateY = r0
            if (r3 == 0) goto L63
            android.animation.ValueAnimator r0 = r2.mBgFadeOutAnimator
            android.animation.ValueAnimator r1 = r2.mBgFadeInAnimator
            reverseFirstOrStartSecond(r0, r1, r4)
            android.animation.ValueAnimator r0 = r2.mControlRowFadeOutAnimator
            android.animation.ValueAnimator r1 = r2.mControlRowFadeInAnimator
            reverseFirstOrStartSecond(r0, r1, r4)
            android.animation.ValueAnimator r0 = r2.mOtherRowFadeOutAnimator
            android.animation.ValueAnimator r1 = r2.mOtherRowFadeInAnimator
            reverseFirstOrStartSecond(r0, r1, r4)
            goto L78
        L63:
            android.animation.ValueAnimator r0 = r2.mBgFadeInAnimator
            android.animation.ValueAnimator r1 = r2.mBgFadeOutAnimator
            reverseFirstOrStartSecond(r0, r1, r4)
            android.animation.ValueAnimator r0 = r2.mControlRowFadeInAnimator
            android.animation.ValueAnimator r1 = r2.mControlRowFadeOutAnimator
            reverseFirstOrStartSecond(r0, r1, r4)
            android.animation.ValueAnimator r0 = r2.mOtherRowFadeInAnimator
            android.animation.ValueAnimator r1 = r2.mOtherRowFadeOutAnimator
            reverseFirstOrStartSecond(r0, r1, r4)
        L78:
            if (r4 == 0) goto L8c
            android.view.View r4 = r2.getView()
            if (r3 == 0) goto L83
            int r3 = androidx.leanback.R.string.lb_playback_controls_shown
            goto L85
        L83:
            int r3 = androidx.leanback.R.string.lb_playback_controls_hidden
        L85:
            java.lang.String r3 = r2.getString(r3)
            r4.announceForAccessibility(r3)
        L8c:
            return
    }

    public void tickle() {
            r2 = this;
            r2.stopFadeTimer()
            r0 = 1
            r2.showControlsOverlay(r0)
            int r0 = r2.mAutohideTimerAfterTickleInMs
            if (r0 <= 0) goto L12
            boolean r1 = r2.mFadingEnabled
            if (r1 == 0) goto L12
            r2.startFadeTimer(r0)
        L12:
            return
    }
}
