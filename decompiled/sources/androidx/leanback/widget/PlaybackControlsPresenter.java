package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
class PlaybackControlsPresenter extends androidx.leanback.widget.ControlBarPresenter {
    private static int sChildMarginBigger;
    private static int sChildMarginBiggest;
    private boolean mMoreActionsEnabled;

    public static class BoundData extends androidx.leanback.widget.ControlBarPresenter.BoundData {
        public androidx.leanback.widget.ObjectAdapter secondaryActionsAdapter;

        public BoundData() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ViewHolder extends androidx.leanback.widget.ControlBarPresenter.ViewHolder {
        public final android.widget.TextView mCurrentTime;
        public long mCurrentTimeInMs;
        public int mCurrentTimeMarginStart;
        public java.lang.StringBuilder mCurrentTimeStringBuilder;
        public androidx.leanback.widget.ObjectAdapter mMoreActionsAdapter;
        public final android.widget.FrameLayout mMoreActionsDock;
        public androidx.leanback.widget.ObjectAdapter.DataObserver mMoreActionsObserver;
        public boolean mMoreActionsShowing;
        public androidx.leanback.widget.Presenter.ViewHolder mMoreActionsViewHolder;
        public final android.widget.ProgressBar mProgressBar;
        public long mSecondaryProgressInMs;
        public final android.widget.TextView mTotalTime;
        public long mTotalTimeInMs;
        public int mTotalTimeMarginEnd;
        public java.lang.StringBuilder mTotalTimeStringBuilder;
        public final /* synthetic */ androidx.leanback.widget.PlaybackControlsPresenter this$0;



        public ViewHolder(androidx.leanback.widget.PlaybackControlsPresenter r3, android.view.View r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>(r3, r4)
                r0 = -1
                r2.mCurrentTimeInMs = r0
                r2.mTotalTimeInMs = r0
                r2.mSecondaryProgressInMs = r0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r2.mTotalTimeStringBuilder = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r2.mCurrentTimeStringBuilder = r3
                int r3 = androidx.leanback.R.id.more_actions_dock
                android.view.View r3 = r4.findViewById(r3)
                android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
                r2.mMoreActionsDock = r3
                int r3 = androidx.leanback.R.id.current_time
                android.view.View r3 = r4.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.mCurrentTime = r3
                int r0 = androidx.leanback.R.id.total_time
                android.view.View r0 = r4.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r2.mTotalTime = r0
                int r1 = androidx.leanback.R.id.playback_progress
                android.view.View r4 = r4.findViewById(r1)
                android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
                r2.mProgressBar = r4
                androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder$1 r4 = new androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder$1
                r4.<init>(r2)
                r2.mMoreActionsObserver = r4
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
                int r3 = r3.getMarginStart()
                r2.mCurrentTimeMarginStart = r3
                android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
                int r3 = r3.getMarginEnd()
                r2.mTotalTimeMarginEnd = r3
                return
        }

        @Override // androidx.leanback.widget.ControlBarPresenter.ViewHolder
        public final int getChildMarginFromCenter(android.content.Context r3, int r4) {
                r2 = this;
                androidx.leanback.widget.PlaybackControlsPresenter r0 = r2.this$0
                int r0 = r0.getControlIconWidth(r3)
                r1 = 4
                if (r4 >= r1) goto L11
                androidx.leanback.widget.PlaybackControlsPresenter r4 = r2.this$0
                int r3 = r4.getChildMarginBiggest(r3)
            Lf:
                int r0 = r0 + r3
                goto L22
            L11:
                r1 = 6
                if (r4 >= r1) goto L1b
                androidx.leanback.widget.PlaybackControlsPresenter r4 = r2.this$0
                int r3 = r4.getChildMarginBigger(r3)
                goto Lf
            L1b:
                androidx.leanback.widget.PlaybackControlsPresenter r4 = r2.this$0
                int r3 = r4.getChildMarginDefault(r3)
                goto Lf
            L22:
                return r0
        }

        @Override // androidx.leanback.widget.ControlBarPresenter.ViewHolder
        public final androidx.leanback.widget.ObjectAdapter getDisplayedAdapter() {
                r1 = this;
                boolean r0 = r1.mMoreActionsShowing
                if (r0 == 0) goto L7
                androidx.leanback.widget.ObjectAdapter r0 = r1.mMoreActionsAdapter
                goto L9
            L7:
                androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            L9:
                return r0
        }
    }

    public PlaybackControlsPresenter(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.mMoreActionsEnabled = r1
            return
    }

    public static void formatTime(long r11, java.lang.StringBuilder r13) {
            r0 = 60
            long r2 = r11 / r0
            long r4 = r2 / r0
            long r6 = r2 * r0
            long r11 = r11 - r6
            long r0 = r0 * r4
            long r2 = r2 - r0
            r0 = 0
            r13.setLength(r0)
            r0 = 48
            r6 = 10
            r1 = 58
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L29
            r13.append(r4)
            r13.append(r1)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L29
            r13.append(r0)
        L29:
            r13.append(r2)
            r13.append(r1)
            int r1 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r1 >= 0) goto L36
            r13.append(r0)
        L36:
            r13.append(r11)
            return
    }

    public boolean areMoreActionsEnabled() {
            r1 = this;
            boolean r0 = r1.mMoreActionsEnabled
            return r0
    }

    public void enableSecondaryActions(boolean r1) {
            r0 = this;
            r0.mMoreActionsEnabled = r1
            return
    }

    public void enableTimeMargins(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r4, boolean r5) {
            r3 = this;
            android.widget.TextView r0 = r4.mCurrentTime
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r1 = 0
            if (r5 == 0) goto Le
            int r2 = r4.mCurrentTimeMarginStart
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setMarginStart(r2)
            android.widget.TextView r2 = r4.mCurrentTime
            r2.setLayoutParams(r0)
            android.widget.TextView r0 = r4.mTotalTime
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r5 == 0) goto L23
            int r1 = r4.mTotalTimeMarginEnd
        L23:
            r0.setMarginEnd(r1)
            android.widget.TextView r4 = r4.mTotalTime
            r4.setLayoutParams(r0)
            return
    }

    public final int getChildMarginBigger(android.content.Context r2) {
            r1 = this;
            int r0 = androidx.leanback.widget.PlaybackControlsPresenter.sChildMarginBigger
            if (r0 != 0) goto L10
            android.content.res.Resources r2 = r2.getResources()
            int r0 = androidx.leanback.R.dimen.lb_playback_controls_child_margin_bigger
            int r2 = r2.getDimensionPixelSize(r0)
            androidx.leanback.widget.PlaybackControlsPresenter.sChildMarginBigger = r2
        L10:
            int r2 = androidx.leanback.widget.PlaybackControlsPresenter.sChildMarginBigger
            return r2
    }

    public final int getChildMarginBiggest(android.content.Context r2) {
            r1 = this;
            int r0 = androidx.leanback.widget.PlaybackControlsPresenter.sChildMarginBiggest
            if (r0 != 0) goto L10
            android.content.res.Resources r2 = r2.getResources()
            int r0 = androidx.leanback.R.dimen.lb_playback_controls_child_margin_biggest
            int r2 = r2.getDimensionPixelSize(r0)
            androidx.leanback.widget.PlaybackControlsPresenter.sChildMarginBiggest = r2
        L10:
            int r2 = androidx.leanback.widget.PlaybackControlsPresenter.sChildMarginBiggest
            return r2
    }

    public int getCurrentTime(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r3) {
            r2 = this;
            long r0 = r2.getCurrentTimeLong(r3)
            int r3 = androidx.leanback.util.MathUtil.safeLongToInt(r0)
            return r3
    }

    public long getCurrentTimeLong(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r3) {
            r2 = this;
            long r0 = r3.mTotalTimeInMs
            return r0
    }

    public int getSecondaryProgress(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r3) {
            r2 = this;
            long r0 = r2.getSecondaryProgressLong(r3)
            int r3 = androidx.leanback.util.MathUtil.safeLongToInt(r0)
            return r3
    }

    public long getSecondaryProgressLong(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r3) {
            r2 = this;
            long r0 = r3.mSecondaryProgressInMs
            return r0
    }

    public int getTotalTime(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r3) {
            r2 = this;
            long r0 = r2.getTotalTimeLong(r3)
            int r3 = androidx.leanback.util.MathUtil.safeLongToInt(r0)
            return r3
    }

    public long getTotalTimeLong(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r3) {
            r2 = this;
            long r0 = r3.mTotalTimeInMs
            return r0
    }

    @Override // androidx.leanback.widget.ControlBarPresenter, androidx.leanback.widget.Presenter
    public void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r4, java.lang.Object r5) {
            r3 = this;
            r0 = r4
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r0 = (androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder) r0
            r1 = r5
            androidx.leanback.widget.PlaybackControlsPresenter$BoundData r1 = (androidx.leanback.widget.PlaybackControlsPresenter.BoundData) r1
            androidx.leanback.widget.ObjectAdapter r2 = r0.mMoreActionsAdapter
            androidx.leanback.widget.ObjectAdapter r1 = r1.secondaryActionsAdapter
            if (r2 == r1) goto L16
            r0.mMoreActionsAdapter = r1
            androidx.leanback.widget.ObjectAdapter$DataObserver r2 = r0.mMoreActionsObserver
            r1.registerObserver(r2)
            r1 = 0
            r0.mMoreActionsShowing = r1
        L16:
            super.onBindViewHolder(r4, r5)
            boolean r4 = r3.mMoreActionsEnabled
            if (r4 == 0) goto L5b
            androidx.leanback.widget.Presenter$ViewHolder r4 = r0.mMoreActionsViewHolder
            if (r4 != 0) goto L47
            androidx.leanback.widget.PlaybackControlsRow$MoreActions r4 = new androidx.leanback.widget.PlaybackControlsRow$MoreActions
            android.widget.FrameLayout r5 = r0.mMoreActionsDock
            android.content.Context r5 = r5.getContext()
            r4.<init>(r5)
            androidx.leanback.widget.Presenter r5 = r0.mPresenter
            android.widget.FrameLayout r1 = r0.mMoreActionsDock
            androidx.leanback.widget.Presenter$ViewHolder r5 = r5.onCreateViewHolder(r1)
            r0.mMoreActionsViewHolder = r5
            androidx.leanback.widget.Presenter r1 = r0.mPresenter
            r1.onBindViewHolder(r5, r4)
            androidx.leanback.widget.Presenter r4 = r0.mPresenter
            androidx.leanback.widget.Presenter$ViewHolder r5 = r0.mMoreActionsViewHolder
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder$2 r1 = new androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder$2
            r1.<init>(r0)
            r4.setOnClickListener(r5, r1)
        L47:
            androidx.leanback.widget.Presenter$ViewHolder r4 = r0.mMoreActionsViewHolder
            android.view.View r4 = r4.view
            android.view.ViewParent r4 = r4.getParent()
            if (r4 != 0) goto L70
            android.widget.FrameLayout r4 = r0.mMoreActionsDock
            androidx.leanback.widget.Presenter$ViewHolder r5 = r0.mMoreActionsViewHolder
            android.view.View r5 = r5.view
            r4.addView(r5)
            goto L70
        L5b:
            androidx.leanback.widget.Presenter$ViewHolder r4 = r0.mMoreActionsViewHolder
            if (r4 == 0) goto L70
            android.view.View r4 = r4.view
            android.view.ViewParent r4 = r4.getParent()
            if (r4 == 0) goto L70
            android.widget.FrameLayout r4 = r0.mMoreActionsDock
            androidx.leanback.widget.Presenter$ViewHolder r5 = r0.mMoreActionsViewHolder
            android.view.View r5 = r5.view
            r4.removeView(r5)
        L70:
            return
    }

    @Override // androidx.leanback.widget.ControlBarPresenter, androidx.leanback.widget.Presenter
    public androidx.leanback.widget.Presenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.getLayoutResourceId()
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r0 = new androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder
            r0.<init>(r3, r4)
            return r0
    }

    @Override // androidx.leanback.widget.ControlBarPresenter, androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r3) {
            r2 = this;
            super.onUnbindViewHolder(r3)
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r3 = (androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder) r3
            androidx.leanback.widget.ObjectAdapter r0 = r3.mMoreActionsAdapter
            if (r0 == 0) goto L11
            androidx.leanback.widget.ObjectAdapter$DataObserver r1 = r3.mMoreActionsObserver
            r0.unregisterObserver(r1)
            r0 = 0
            r3.mMoreActionsAdapter = r0
        L11:
            return
    }

    public void resetFocus(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r1) {
            r0 = this;
            androidx.leanback.widget.ControlBar r1 = r1.mControlBar
            r1.requestFocus()
            return
    }

    public void setCurrentTime(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r3, int r4) {
            r2 = this;
            long r0 = (long) r4
            r2.setCurrentTimeLong(r3, r0)
            return
    }

    public void setCurrentTimeLong(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r6, long r7) {
            r5 = this;
            java.util.Objects.requireNonNull(r6)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r7 / r0
            long r2 = r6.mCurrentTimeInMs
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L1f
            r6.mCurrentTimeInMs = r7
            java.lang.StringBuilder r7 = r6.mCurrentTimeStringBuilder
            formatTime(r0, r7)
            android.widget.TextView r7 = r6.mCurrentTime
            java.lang.StringBuilder r8 = r6.mCurrentTimeStringBuilder
            java.lang.String r8 = r8.toString()
            r7.setText(r8)
        L1f:
            long r7 = r6.mCurrentTimeInMs
            double r7 = (double) r7
            long r0 = r6.mTotalTimeInMs
            double r0 = (double) r0
            double r7 = r7 / r0
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r7 = r7 * r0
            android.widget.ProgressBar r6 = r6.mProgressBar
            int r7 = (int) r7
            r6.setProgress(r7)
            return
    }

    public void setProgressColor(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r4, @androidx.annotation.ColorInt int r5) {
            r3 = this;
            android.graphics.drawable.ClipDrawable r0 = new android.graphics.drawable.ClipDrawable
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r5)
            r5 = 3
            r2 = 1
            r0.<init>(r1, r5, r2)
            android.widget.ProgressBar r4 = r4.mProgressBar
            android.graphics.drawable.Drawable r4 = r4.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r4 = (android.graphics.drawable.LayerDrawable) r4
            r5 = 16908301(0x102000d, float:2.3877265E-38)
            r4.setDrawableByLayerId(r5, r0)
            return
    }

    public void setSecondaryProgress(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r3, int r4) {
            r2 = this;
            long r0 = (long) r4
            r2.setSecondaryProgressLong(r3, r0)
            return
    }

    public void setSecondaryProgressLong(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r3, long r4) {
            r2 = this;
            r3.mSecondaryProgressInMs = r4
            double r4 = (double) r4
            long r0 = r3.mTotalTimeInMs
            double r0 = (double) r0
            double r4 = r4 / r0
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r4 = r4 * r0
            android.widget.ProgressBar r3 = r3.mProgressBar
            int r4 = (int) r4
            r3.setSecondaryProgress(r4)
            return
    }

    public void setTotalTime(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r3, int r4) {
            r2 = this;
            long r0 = (long) r4
            r2.setTotalTimeLong(r3, r0)
            return
    }

    public void setTotalTimeLong(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r4, long r5) {
            r3 = this;
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L13
            android.widget.TextView r5 = r4.mTotalTime
            r6 = 8
            r5.setVisibility(r6)
            android.widget.ProgressBar r4 = r4.mProgressBar
            r4.setVisibility(r6)
            goto L3b
        L13:
            android.widget.TextView r0 = r4.mTotalTime
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r4.mProgressBar
            r0.setVisibility(r1)
            r4.mTotalTimeInMs = r5
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r0
            java.lang.StringBuilder r0 = r4.mTotalTimeStringBuilder
            formatTime(r5, r0)
            android.widget.TextView r5 = r4.mTotalTime
            java.lang.StringBuilder r6 = r4.mTotalTimeStringBuilder
            java.lang.String r6 = r6.toString()
            r5.setText(r6)
            android.widget.ProgressBar r4 = r4.mProgressBar
            r5 = 2147483647(0x7fffffff, float:NaN)
            r4.setMax(r5)
        L3b:
            return
    }

    public void showPrimaryActions(androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder r2) {
            r1 = this;
            boolean r0 = r2.mMoreActionsShowing
            if (r0 == 0) goto Ld
            r0 = r0 ^ 1
            r2.mMoreActionsShowing = r0
            androidx.leanback.widget.Presenter r0 = r2.mPresenter
            r2.showControls(r0)
        Ld:
            return
    }
}
