package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class PlaybackControlsRowPresenter extends androidx.leanback.widget.PlaybackRowPresenter {
    public static float sShadowZ;
    private int mBackgroundColor;
    private boolean mBackgroundColorSet;
    private androidx.leanback.widget.Presenter mDescriptionPresenter;
    public androidx.leanback.widget.OnActionClickedListener mOnActionClickedListener;
    private final androidx.leanback.widget.ControlBarPresenter.OnControlClickedListener mOnControlClickedListener;
    private final androidx.leanback.widget.ControlBarPresenter.OnControlSelectedListener mOnControlSelectedListener;
    public androidx.leanback.widget.PlaybackControlsPresenter mPlaybackControlsPresenter;
    private int mProgressColor;
    private boolean mProgressColorSet;
    private boolean mSecondaryActionsHidden;
    private androidx.leanback.widget.ControlBarPresenter mSecondaryControlsPresenter;




    /* JADX INFO: loaded from: classes3.dex */
    public static class BoundData extends androidx.leanback.widget.PlaybackControlsPresenter.BoundData {
        public androidx.leanback.widget.PlaybackControlsRowPresenter.ViewHolder mRowViewHolder;

        public BoundData() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ViewHolder extends androidx.leanback.widget.PlaybackRowPresenter.ViewHolder {
        public android.view.View mBgView;
        public final android.view.View mBottomSpacer;
        public final android.view.ViewGroup mCard;
        public final android.view.ViewGroup mCardRightPanel;
        public androidx.leanback.widget.PlaybackControlsRowPresenter.BoundData mControlsBoundData;
        public final android.view.ViewGroup mControlsDock;
        public int mControlsDockMarginEnd;
        public int mControlsDockMarginStart;
        public androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder mControlsVh;
        public final android.view.ViewGroup mDescriptionDock;
        public final androidx.leanback.widget.Presenter.ViewHolder mDescriptionViewHolder;
        public final android.widget.ImageView mImageView;
        public final androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback mListener;
        public androidx.leanback.widget.PlaybackControlsRowPresenter.BoundData mSecondaryBoundData;
        public final android.view.ViewGroup mSecondaryControlsDock;
        public androidx.leanback.widget.Presenter.ViewHolder mSecondaryControlsVh;
        public java.lang.Object mSelectedItem;
        public androidx.leanback.widget.Presenter.ViewHolder mSelectedViewHolder;
        public final android.view.View mSpacer;
        public final /* synthetic */ androidx.leanback.widget.PlaybackControlsRowPresenter this$0;


        public ViewHolder(androidx.leanback.widget.PlaybackControlsRowPresenter r2, android.view.View r3, androidx.leanback.widget.Presenter r4) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r3)
                androidx.leanback.widget.PlaybackControlsRowPresenter$BoundData r2 = new androidx.leanback.widget.PlaybackControlsRowPresenter$BoundData
                r2.<init>()
                r1.mControlsBoundData = r2
                androidx.leanback.widget.PlaybackControlsRowPresenter$BoundData r2 = new androidx.leanback.widget.PlaybackControlsRowPresenter$BoundData
                r2.<init>()
                r1.mSecondaryBoundData = r2
                androidx.leanback.widget.PlaybackControlsRowPresenter$ViewHolder$1 r2 = new androidx.leanback.widget.PlaybackControlsRowPresenter$ViewHolder$1
                r2.<init>(r1)
                r1.mListener = r2
                int r2 = androidx.leanback.R.id.controls_card
                android.view.View r2 = r3.findViewById(r2)
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r1.mCard = r2
                int r2 = androidx.leanback.R.id.controls_card_right_panel
                android.view.View r2 = r3.findViewById(r2)
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r1.mCardRightPanel = r2
                int r2 = androidx.leanback.R.id.image
                android.view.View r2 = r3.findViewById(r2)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r1.mImageView = r2
                int r2 = androidx.leanback.R.id.description_dock
                android.view.View r2 = r3.findViewById(r2)
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r1.mDescriptionDock = r2
                int r0 = androidx.leanback.R.id.controls_dock
                android.view.View r0 = r3.findViewById(r0)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r1.mControlsDock = r0
                int r0 = androidx.leanback.R.id.secondary_controls_dock
                android.view.View r0 = r3.findViewById(r0)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r1.mSecondaryControlsDock = r0
                int r0 = androidx.leanback.R.id.spacer
                android.view.View r0 = r3.findViewById(r0)
                r1.mSpacer = r0
                int r0 = androidx.leanback.R.id.bottom_spacer
                android.view.View r3 = r3.findViewById(r0)
                r1.mBottomSpacer = r3
                if (r4 != 0) goto L6a
                r3 = 0
                goto L6e
            L6a:
                androidx.leanback.widget.Presenter$ViewHolder r3 = r4.onCreateViewHolder(r2)
            L6e:
                r1.mDescriptionViewHolder = r3
                if (r3 == 0) goto L77
                android.view.View r3 = r3.view
                r2.addView(r3)
            L77:
                return
        }

        public final void dispatchItemSelection() {
                r4 = this;
                boolean r0 = r4.isSelected()
                if (r0 != 0) goto L7
                return
            L7:
                androidx.leanback.widget.Presenter$ViewHolder r0 = r4.mSelectedViewHolder
                if (r0 != 0) goto L1e
                androidx.leanback.widget.BaseOnItemViewSelectedListener r0 = r4.getOnItemViewSelectedListener()
                if (r0 == 0) goto L33
                androidx.leanback.widget.BaseOnItemViewSelectedListener r0 = r4.getOnItemViewSelectedListener()
                androidx.leanback.widget.Row r1 = r4.getRow()
                r2 = 0
                r0.onItemSelected(r2, r2, r4, r1)
                goto L33
            L1e:
                androidx.leanback.widget.BaseOnItemViewSelectedListener r0 = r4.getOnItemViewSelectedListener()
                if (r0 == 0) goto L33
                androidx.leanback.widget.BaseOnItemViewSelectedListener r0 = r4.getOnItemViewSelectedListener()
                androidx.leanback.widget.Presenter$ViewHolder r1 = r4.mSelectedViewHolder
                java.lang.Object r2 = r4.mSelectedItem
                androidx.leanback.widget.Row r3 = r4.getRow()
                r0.onItemSelected(r1, r2, r4, r3)
            L33:
                return
        }

        public final androidx.leanback.widget.Presenter getPresenter(boolean r4) {
                r3 = this;
                if (r4 == 0) goto Ld
                androidx.leanback.widget.Row r0 = r3.getRow()
                androidx.leanback.widget.PlaybackControlsRow r0 = (androidx.leanback.widget.PlaybackControlsRow) r0
                androidx.leanback.widget.ObjectAdapter r0 = r0.getPrimaryActionsAdapter()
                goto L17
            Ld:
                androidx.leanback.widget.Row r0 = r3.getRow()
                androidx.leanback.widget.PlaybackControlsRow r0 = (androidx.leanback.widget.PlaybackControlsRow) r0
                androidx.leanback.widget.ObjectAdapter r0 = r0.getSecondaryActionsAdapter()
            L17:
                r1 = 0
                if (r0 != 0) goto L1b
                return r1
            L1b:
                androidx.leanback.widget.PresenterSelector r2 = r0.getPresenterSelector()
                boolean r2 = r2 instanceof androidx.leanback.widget.ControlButtonPresenterSelector
                if (r2 == 0) goto L35
                androidx.leanback.widget.PresenterSelector r0 = r0.getPresenterSelector()
                androidx.leanback.widget.ControlButtonPresenterSelector r0 = (androidx.leanback.widget.ControlButtonPresenterSelector) r0
                if (r4 == 0) goto L30
                androidx.leanback.widget.Presenter r4 = r0.getPrimaryPresenter()
                goto L34
            L30:
                androidx.leanback.widget.Presenter r4 = r0.getSecondaryPresenter()
            L34:
                return r4
            L35:
                int r4 = r0.size()
                if (r4 <= 0) goto L40
                r4 = 0
                java.lang.Object r1 = r0.get(r4)
            L40:
                androidx.leanback.widget.Presenter r4 = r0.getPresenter(r1)
                return r4
        }

        public final void setOutline(android.view.View r4) {
                r3 = this;
                android.view.View r0 = r3.mBgView
                r1 = 0
                if (r0 == 0) goto Le
                r2 = 0
                androidx.leanback.widget.RoundedRectHelper.setClipToRoundedOutline(r0, r2)
                android.view.View r0 = r3.mBgView
                androidx.core.view.ViewCompat.setZ(r0, r1)
            Le:
                r3.mBgView = r4
                r0 = 1
                androidx.leanback.widget.RoundedRectHelper.setClipToRoundedOutline(r4, r0)
                float r0 = androidx.leanback.widget.PlaybackControlsRowPresenter.sShadowZ
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L27
                android.content.res.Resources r0 = r4.getResources()
                int r1 = androidx.leanback.R.dimen.lb_playback_controls_z
                int r0 = r0.getDimensionPixelSize(r1)
                float r0 = (float) r0
                androidx.leanback.widget.PlaybackControlsRowPresenter.sShadowZ = r0
            L27:
                float r0 = androidx.leanback.widget.PlaybackControlsRowPresenter.sShadowZ
                androidx.core.view.ViewCompat.setZ(r4, r0)
                return
        }
    }

    public PlaybackControlsRowPresenter() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public PlaybackControlsRowPresenter(androidx.leanback.widget.Presenter r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.mBackgroundColor = r0
            r4.mProgressColor = r0
            androidx.leanback.widget.PlaybackControlsRowPresenter$1 r1 = new androidx.leanback.widget.PlaybackControlsRowPresenter$1
            r1.<init>()
            r4.mOnControlSelectedListener = r1
            androidx.leanback.widget.PlaybackControlsRowPresenter$2 r2 = new androidx.leanback.widget.PlaybackControlsRowPresenter$2
            r2.<init>(r4)
            r4.mOnControlClickedListener = r2
            r3 = 0
            r4.setHeaderPresenter(r3)
            r4.setSelectEffectEnabled(r0)
            r4.mDescriptionPresenter = r5
            androidx.leanback.widget.PlaybackControlsPresenter r5 = new androidx.leanback.widget.PlaybackControlsPresenter
            int r0 = androidx.leanback.R.layout.lb_playback_controls
            r5.<init>(r0)
            r4.mPlaybackControlsPresenter = r5
            androidx.leanback.widget.ControlBarPresenter r5 = new androidx.leanback.widget.ControlBarPresenter
            int r0 = androidx.leanback.R.layout.lb_control_bar
            r5.<init>(r0)
            r4.mSecondaryControlsPresenter = r5
            androidx.leanback.widget.PlaybackControlsPresenter r5 = r4.mPlaybackControlsPresenter
            r5.setOnControlSelectedListener(r1)
            androidx.leanback.widget.ControlBarPresenter r5 = r4.mSecondaryControlsPresenter
            r5.setOnControlSelectedListener(r1)
            androidx.leanback.widget.PlaybackControlsPresenter r5 = r4.mPlaybackControlsPresenter
            r5.setOnControlClickedListener(r2)
            androidx.leanback.widget.ControlBarPresenter r5 = r4.mSecondaryControlsPresenter
            r5.setOnControlClickedListener(r2)
            return
    }

    private int getDefaultBackgroundColor(android.content.Context r5) {
            r4 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            int r2 = androidx.leanback.R.attr.defaultBrandColor
            r3 = 1
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L1d
            android.content.res.Resources r5 = r5.getResources()
            int r0 = r0.resourceId
            int r5 = r5.getColor(r0)
            return r5
        L1d:
            android.content.res.Resources r5 = r5.getResources()
            int r0 = androidx.leanback.R.color.lb_default_brand_color
            int r5 = r5.getColor(r0)
            return r5
    }

    private int getDefaultProgressColor(android.content.Context r5) {
            r4 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            int r2 = androidx.leanback.R.attr.playbackProgressPrimaryColor
            r3 = 1
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L1d
            android.content.res.Resources r5 = r5.getResources()
            int r0 = r0.resourceId
            int r5 = r5.getColor(r0)
            return r5
        L1d:
            android.content.res.Resources r5 = r5.getResources()
            int r0 = androidx.leanback.R.color.lb_playback_progress_color_no_theme
            int r5 = r5.getColor(r0)
            return r5
    }

    private void initRow(androidx.leanback.widget.PlaybackControlsRowPresenter.ViewHolder r4) {
            r3 = this;
            android.view.ViewGroup r0 = r4.mControlsDock
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.getMarginStart()
            r4.mControlsDockMarginStart = r1
            int r0 = r0.getMarginEnd()
            r4.mControlsDockMarginEnd = r0
            androidx.leanback.widget.PlaybackControlsPresenter r0 = r3.mPlaybackControlsPresenter
            android.view.ViewGroup r1 = r4.mControlsDock
            androidx.leanback.widget.Presenter$ViewHolder r0 = r0.onCreateViewHolder(r1)
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r0 = (androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder) r0
            r4.mControlsVh = r0
            androidx.leanback.widget.PlaybackControlsPresenter r1 = r3.mPlaybackControlsPresenter
            boolean r2 = r3.mProgressColorSet
            if (r2 == 0) goto L29
            int r2 = r3.mProgressColor
            goto L33
        L29:
            android.view.ViewGroup r2 = r4.mControlsDock
            android.content.Context r2 = r2.getContext()
            int r2 = r3.getDefaultProgressColor(r2)
        L33:
            r1.setProgressColor(r0, r2)
            androidx.leanback.widget.PlaybackControlsPresenter r0 = r3.mPlaybackControlsPresenter
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r1 = r4.mControlsVh
            boolean r2 = r3.mBackgroundColorSet
            if (r2 == 0) goto L41
            int r2 = r3.mBackgroundColor
            goto L4b
        L41:
            android.view.View r2 = r4.view
            android.content.Context r2 = r2.getContext()
            int r2 = r3.getDefaultBackgroundColor(r2)
        L4b:
            r0.setBackgroundColor(r1, r2)
            android.view.ViewGroup r0 = r4.mControlsDock
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r1 = r4.mControlsVh
            android.view.View r1 = r1.view
            r0.addView(r1)
            androidx.leanback.widget.ControlBarPresenter r0 = r3.mSecondaryControlsPresenter
            android.view.ViewGroup r1 = r4.mSecondaryControlsDock
            androidx.leanback.widget.Presenter$ViewHolder r0 = r0.onCreateViewHolder(r1)
            r4.mSecondaryControlsVh = r0
            boolean r1 = r3.mSecondaryActionsHidden
            if (r1 != 0) goto L6c
            android.view.ViewGroup r1 = r4.mSecondaryControlsDock
            android.view.View r0 = r0.view
            r1.addView(r0)
        L6c:
            android.view.View r0 = r4.view
            androidx.leanback.widget.PlaybackControlsRowView r0 = (androidx.leanback.widget.PlaybackControlsRowView) r0
            androidx.leanback.widget.PlaybackControlsRowPresenter$3 r1 = new androidx.leanback.widget.PlaybackControlsRowPresenter$3
            r1.<init>(r4)
            r0.setOnUnhandledKeyListener(r1)
            return
    }

    private void updateCardLayout(androidx.leanback.widget.PlaybackControlsRowPresenter.ViewHolder r5, int r6) {
            r4 = this;
            android.view.ViewGroup r0 = r5.mCardRightPanel
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r6
            android.view.ViewGroup r1 = r5.mCardRightPanel
            r1.setLayoutParams(r0)
            android.view.ViewGroup r0 = r5.mControlsDock
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.view.ViewGroup r1 = r5.mDescriptionDock
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r2 = -2
            r3 = 0
            if (r6 != r2) goto L3d
            r1.height = r2
            r0.setMarginStart(r3)
            r0.setMarginEnd(r3)
            android.view.ViewGroup r6 = r5.mCard
            r2 = 0
            r6.setBackground(r2)
            android.view.ViewGroup r6 = r5.mControlsDock
            r5.setOutline(r6)
            androidx.leanback.widget.PlaybackControlsPresenter r6 = r4.mPlaybackControlsPresenter
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r2 = r5.mControlsVh
            r3 = 1
            r6.enableTimeMargins(r2, r3)
            goto L6d
        L3d:
            r1.height = r3
            r6 = 1065353216(0x3f800000, float:1.0)
            r1.weight = r6
            int r6 = r5.mControlsDockMarginStart
            r0.setMarginStart(r6)
            int r6 = r5.mControlsDockMarginEnd
            r0.setMarginEnd(r6)
            android.view.ViewGroup r6 = r5.mCard
            boolean r2 = r4.mBackgroundColorSet
            if (r2 == 0) goto L56
            int r2 = r4.mBackgroundColor
            goto L5e
        L56:
            android.content.Context r2 = r6.getContext()
            int r2 = r4.getDefaultBackgroundColor(r2)
        L5e:
            r6.setBackgroundColor(r2)
            android.view.ViewGroup r6 = r5.mCard
            r5.setOutline(r6)
            androidx.leanback.widget.PlaybackControlsPresenter r6 = r4.mPlaybackControlsPresenter
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r2 = r5.mControlsVh
            r6.enableTimeMargins(r2, r3)
        L6d:
            android.view.ViewGroup r6 = r5.mDescriptionDock
            r6.setLayoutParams(r1)
            android.view.ViewGroup r5 = r5.mControlsDock
            r5.setLayoutParams(r0)
            return
    }

    public boolean areSecondaryActionsHidden() {
            r1 = this;
            boolean r0 = r1.mSecondaryActionsHidden
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final androidx.leanback.widget.RowPresenter.ViewHolder createRowViewHolder(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.leanback.R.layout.lb_playback_controls_row
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.leanback.widget.PlaybackControlsRowPresenter$ViewHolder r0 = new androidx.leanback.widget.PlaybackControlsRowPresenter$ViewHolder
            androidx.leanback.widget.Presenter r1 = r3.mDescriptionPresenter
            r0.<init>(r3, r4, r1)
            r3.initRow(r0)
            return r0
    }

    @androidx.annotation.ColorInt
    public int getBackgroundColor() {
            r1 = this;
            int r0 = r1.mBackgroundColor
            return r0
    }

    public androidx.leanback.widget.OnActionClickedListener getOnActionClickedListener() {
            r1 = this;
            androidx.leanback.widget.OnActionClickedListener r0 = r1.mOnActionClickedListener
            return r0
    }

    @androidx.annotation.ColorInt
    public int getProgressColor() {
            r1 = this;
            int r0 = r1.mProgressColor
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void onBindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r5, java.lang.Object r6) {
            r4 = this;
            super.onBindRowViewHolder(r5, r6)
            androidx.leanback.widget.PlaybackControlsRowPresenter$ViewHolder r5 = (androidx.leanback.widget.PlaybackControlsRowPresenter.ViewHolder) r5
            androidx.leanback.widget.Row r6 = r5.getRow()
            androidx.leanback.widget.PlaybackControlsRow r6 = (androidx.leanback.widget.PlaybackControlsRow) r6
            androidx.leanback.widget.PlaybackControlsPresenter r0 = r4.mPlaybackControlsPresenter
            boolean r1 = r4.mSecondaryActionsHidden
            r0.enableSecondaryActions(r1)
            java.lang.Object r0 = r6.getItem()
            r1 = 0
            if (r0 != 0) goto L26
            android.view.ViewGroup r0 = r5.mDescriptionDock
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r0 = r5.mSpacer
            r0.setVisibility(r2)
            goto L3d
        L26:
            android.view.ViewGroup r0 = r5.mDescriptionDock
            r0.setVisibility(r1)
            androidx.leanback.widget.Presenter$ViewHolder r0 = r5.mDescriptionViewHolder
            if (r0 == 0) goto L38
            androidx.leanback.widget.Presenter r2 = r4.mDescriptionPresenter
            java.lang.Object r3 = r6.getItem()
            r2.onBindViewHolder(r0, r3)
        L38:
            android.view.View r0 = r5.mSpacer
            r0.setVisibility(r1)
        L3d:
            android.graphics.drawable.Drawable r0 = r6.getImageDrawable()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r6.getItem()
            if (r0 != 0) goto L4a
            goto L5f
        L4a:
            android.widget.ImageView r0 = r5.mImageView
            android.graphics.drawable.Drawable r2 = r6.getImageDrawable()
            r0.setImageDrawable(r2)
            android.widget.ImageView r0 = r5.mImageView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.height
            r4.updateCardLayout(r5, r0)
            goto L69
        L5f:
            android.widget.ImageView r0 = r5.mImageView
            r2 = 0
            r0.setImageDrawable(r2)
            r0 = -2
            r4.updateCardLayout(r5, r0)
        L69:
            androidx.leanback.widget.PlaybackControlsRowPresenter$BoundData r0 = r5.mControlsBoundData
            androidx.leanback.widget.ObjectAdapter r2 = r6.getPrimaryActionsAdapter()
            r0.adapter = r2
            androidx.leanback.widget.PlaybackControlsRowPresenter$BoundData r0 = r5.mControlsBoundData
            androidx.leanback.widget.ObjectAdapter r2 = r6.getSecondaryActionsAdapter()
            r0.secondaryActionsAdapter = r2
            androidx.leanback.widget.PlaybackControlsRowPresenter$BoundData r0 = r5.mControlsBoundData
            r2 = 1
            androidx.leanback.widget.Presenter r2 = r5.getPresenter(r2)
            r0.presenter = r2
            androidx.leanback.widget.PlaybackControlsRowPresenter$BoundData r0 = r5.mControlsBoundData
            r0.mRowViewHolder = r5
            androidx.leanback.widget.PlaybackControlsPresenter r2 = r4.mPlaybackControlsPresenter
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r3 = r5.mControlsVh
            r2.onBindViewHolder(r3, r0)
            androidx.leanback.widget.PlaybackControlsRowPresenter$BoundData r0 = r5.mSecondaryBoundData
            androidx.leanback.widget.ObjectAdapter r2 = r6.getSecondaryActionsAdapter()
            r0.adapter = r2
            androidx.leanback.widget.PlaybackControlsRowPresenter$BoundData r0 = r5.mSecondaryBoundData
            androidx.leanback.widget.Presenter r1 = r5.getPresenter(r1)
            r0.presenter = r1
            androidx.leanback.widget.PlaybackControlsRowPresenter$BoundData r0 = r5.mSecondaryBoundData
            r0.mRowViewHolder = r5
            androidx.leanback.widget.ControlBarPresenter r1 = r4.mSecondaryControlsPresenter
            androidx.leanback.widget.Presenter$ViewHolder r2 = r5.mSecondaryControlsVh
            r1.onBindViewHolder(r2, r0)
            androidx.leanback.widget.PlaybackControlsPresenter r0 = r4.mPlaybackControlsPresenter
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r1 = r5.mControlsVh
            int r2 = r6.getTotalTime()
            r0.setTotalTime(r1, r2)
            androidx.leanback.widget.PlaybackControlsPresenter r0 = r4.mPlaybackControlsPresenter
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r1 = r5.mControlsVh
            int r2 = r6.getCurrentTime()
            r0.setCurrentTime(r1, r2)
            androidx.leanback.widget.PlaybackControlsPresenter r0 = r4.mPlaybackControlsPresenter
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r1 = r5.mControlsVh
            int r2 = r6.getBufferedProgress()
            r0.setSecondaryProgress(r1, r2)
            androidx.leanback.widget.PlaybackControlsRow$OnPlaybackProgressCallback r5 = r5.mListener
            r6.setOnPlaybackProgressChangedListener(r5)
            return
    }

    @Override // androidx.leanback.widget.PlaybackRowPresenter
    public void onReappear(androidx.leanback.widget.RowPresenter.ViewHolder r1) {
            r0 = this;
            androidx.leanback.widget.PlaybackControlsRowPresenter$ViewHolder r1 = (androidx.leanback.widget.PlaybackControlsRowPresenter.ViewHolder) r1
            r0.showPrimaryActions(r1)
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewAttachedToWindow(androidx.leanback.widget.RowPresenter.ViewHolder r2) {
            r1 = this;
            super.onRowViewAttachedToWindow(r2)
            androidx.leanback.widget.Presenter r0 = r1.mDescriptionPresenter
            if (r0 == 0) goto Le
            androidx.leanback.widget.PlaybackControlsRowPresenter$ViewHolder r2 = (androidx.leanback.widget.PlaybackControlsRowPresenter.ViewHolder) r2
            androidx.leanback.widget.Presenter$ViewHolder r2 = r2.mDescriptionViewHolder
            r0.onViewAttachedToWindow(r2)
        Le:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewDetachedFromWindow(androidx.leanback.widget.RowPresenter.ViewHolder r2) {
            r1 = this;
            super.onRowViewDetachedFromWindow(r2)
            androidx.leanback.widget.Presenter r0 = r1.mDescriptionPresenter
            if (r0 == 0) goto Le
            androidx.leanback.widget.PlaybackControlsRowPresenter$ViewHolder r2 = (androidx.leanback.widget.PlaybackControlsRowPresenter.ViewHolder) r2
            androidx.leanback.widget.Presenter$ViewHolder r2 = r2.mDescriptionViewHolder
            r0.onViewDetachedFromWindow(r2)
        Le:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewSelected(androidx.leanback.widget.RowPresenter.ViewHolder r1, boolean r2) {
            r0 = this;
            super.onRowViewSelected(r1, r2)
            if (r2 == 0) goto La
            androidx.leanback.widget.PlaybackControlsRowPresenter$ViewHolder r1 = (androidx.leanback.widget.PlaybackControlsRowPresenter.ViewHolder) r1
            r1.dispatchItemSelection()
        La:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void onUnbindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r5) {
            r4 = this;
            r0 = r5
            androidx.leanback.widget.PlaybackControlsRowPresenter$ViewHolder r0 = (androidx.leanback.widget.PlaybackControlsRowPresenter.ViewHolder) r0
            androidx.leanback.widget.Row r1 = r0.getRow()
            androidx.leanback.widget.PlaybackControlsRow r1 = (androidx.leanback.widget.PlaybackControlsRow) r1
            androidx.leanback.widget.Presenter$ViewHolder r2 = r0.mDescriptionViewHolder
            if (r2 == 0) goto L12
            androidx.leanback.widget.Presenter r3 = r4.mDescriptionPresenter
            r3.onUnbindViewHolder(r2)
        L12:
            androidx.leanback.widget.PlaybackControlsPresenter r2 = r4.mPlaybackControlsPresenter
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r3 = r0.mControlsVh
            r2.onUnbindViewHolder(r3)
            androidx.leanback.widget.ControlBarPresenter r2 = r4.mSecondaryControlsPresenter
            androidx.leanback.widget.Presenter$ViewHolder r0 = r0.mSecondaryControlsVh
            r2.onUnbindViewHolder(r0)
            r0 = 0
            r1.setOnPlaybackProgressChangedListener(r0)
            super.onUnbindRowViewHolder(r5)
            return
    }

    public void setBackgroundColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.mBackgroundColor = r1
            r1 = 1
            r0.mBackgroundColorSet = r1
            return
    }

    public void setOnActionClickedListener(androidx.leanback.widget.OnActionClickedListener r1) {
            r0 = this;
            r0.mOnActionClickedListener = r1
            return
    }

    public void setProgressColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.mProgressColor = r1
            r1 = 1
            r0.mProgressColorSet = r1
            return
    }

    public void setSecondaryActionsHidden(boolean r1) {
            r0 = this;
            r0.mSecondaryActionsHidden = r1
            return
    }

    public void showBottomSpace(androidx.leanback.widget.PlaybackControlsRowPresenter.ViewHolder r1, boolean r2) {
            r0 = this;
            android.view.View r1 = r1.mBottomSpacer
            if (r2 == 0) goto L6
            r2 = 0
            goto L8
        L6:
            r2 = 8
        L8:
            r1.setVisibility(r2)
            return
    }

    public void showPrimaryActions(androidx.leanback.widget.PlaybackControlsRowPresenter.ViewHolder r3) {
            r2 = this;
            androidx.leanback.widget.PlaybackControlsPresenter r0 = r2.mPlaybackControlsPresenter
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r1 = r3.mControlsVh
            r0.showPrimaryActions(r1)
            android.view.View r0 = r3.view
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L16
            androidx.leanback.widget.PlaybackControlsPresenter r0 = r2.mPlaybackControlsPresenter
            androidx.leanback.widget.PlaybackControlsPresenter$ViewHolder r3 = r3.mControlsVh
            r0.resetFocus(r3)
        L16:
            return
    }
}
