package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
public class FullWidthDetailsOverviewRowPresenter extends androidx.leanback.widget.RowPresenter {
    public static final int ALIGN_MODE_MIDDLE = 1;
    public static final int ALIGN_MODE_START = 0;
    public static final int STATE_FULL = 1;
    public static final int STATE_HALF = 0;
    public static final int STATE_SMALL = 2;
    public static final android.os.Handler sHandler = null;
    private static android.graphics.Rect sTmpRect;
    public androidx.leanback.widget.OnActionClickedListener mActionClickedListener;
    private int mActionsBackgroundColor;
    private boolean mActionsBackgroundColorSet;
    private int mAlignmentMode;
    private int mBackgroundColor;
    private boolean mBackgroundColorSet;
    public final androidx.leanback.widget.DetailsOverviewLogoPresenter mDetailsOverviewLogoPresenter;
    public final androidx.leanback.widget.Presenter mDetailsPresenter;
    public int mInitialState;
    private androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.Listener mListener;
    private boolean mParticipatingEntranceTransition;


    public class ActionsItemBridgeAdapter extends androidx.leanback.widget.ItemBridgeAdapter {
        public androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder mViewHolder;
        public final /* synthetic */ androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter this$0;


        public ActionsItemBridgeAdapter(androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter r1, androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mViewHolder = r2
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onAttachedToWindow(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r3) {
                r2 = this;
                android.view.View r0 = r3.itemView
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r1 = r2.mViewHolder
                android.view.View$OnLayoutChangeListener r1 = r1.mLayoutChangeListener
                r0.removeOnLayoutChangeListener(r1)
                android.view.View r3 = r3.itemView
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = r2.mViewHolder
                android.view.View$OnLayoutChangeListener r0 = r0.mLayoutChangeListener
                r3.addOnLayoutChangeListener(r0)
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onBind(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r4) {
                r3 = this;
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = r3.mViewHolder
                androidx.leanback.widget.BaseOnItemViewClickedListener r0 = r0.getOnItemViewClickedListener()
                if (r0 != 0) goto Le
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter r0 = r3.this$0
                androidx.leanback.widget.OnActionClickedListener r0 = r0.mActionClickedListener
                if (r0 == 0) goto L1e
            Le:
                androidx.leanback.widget.Presenter r0 = r4.getPresenter()
                androidx.leanback.widget.Presenter$ViewHolder r1 = r4.getViewHolder()
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ActionsItemBridgeAdapter$1 r2 = new androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ActionsItemBridgeAdapter$1
                r2.<init>(r3, r4)
                r0.setOnClickListener(r1, r2)
            L1e:
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onDetachedFromWindow(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r2) {
                r1 = this;
                android.view.View r2 = r2.itemView
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = r1.mViewHolder
                android.view.View$OnLayoutChangeListener r0 = r0.mLayoutChangeListener
                r2.removeOnLayoutChangeListener(r0)
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r2 = r1.mViewHolder
                r2.checkFirstAndLastPosition()
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onUnbind(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r3) {
                r2 = this;
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = r2.mViewHolder
                androidx.leanback.widget.BaseOnItemViewClickedListener r0 = r0.getOnItemViewClickedListener()
                if (r0 != 0) goto Le
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter r0 = r2.this$0
                androidx.leanback.widget.OnActionClickedListener r0 = r0.mActionClickedListener
                if (r0 == 0) goto L1a
            Le:
                androidx.leanback.widget.Presenter r0 = r3.getPresenter()
                androidx.leanback.widget.Presenter$ViewHolder r3 = r3.getViewHolder()
                r1 = 0
                r0.setOnClickListener(r3, r1)
            L1a:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class Listener {
        public Listener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onBindLogo(androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ViewHolder extends androidx.leanback.widget.RowPresenter.ViewHolder {
        public androidx.leanback.widget.ItemBridgeAdapter mActionBridgeAdapter;
        public final androidx.leanback.widget.HorizontalGridView mActionsRow;
        public final androidx.leanback.widget.OnChildSelectedListener mChildSelectedListener;
        public final android.view.ViewGroup mDetailsDescriptionFrame;
        public final androidx.leanback.widget.Presenter.ViewHolder mDetailsDescriptionViewHolder;
        public final androidx.leanback.widget.DetailsOverviewLogoPresenter.ViewHolder mDetailsLogoViewHolder;
        public final android.view.View.OnLayoutChangeListener mLayoutChangeListener;
        public int mNumItems;
        public final android.widget.FrameLayout mOverviewFrame;
        public final androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder.DetailsOverviewRowListener mRowListener;
        public int mState;
        public final java.lang.Runnable mUpdateDrawableCallback;
        public final /* synthetic */ androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter this$0;





        /* JADX INFO: loaded from: classes2.dex */
        public class DetailsOverviewRowListener extends androidx.leanback.widget.DetailsOverviewRow.Listener {
            public final /* synthetic */ androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder this$1;

            public DetailsOverviewRowListener(androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            @Override // androidx.leanback.widget.DetailsOverviewRow.Listener
            public void onActionsAdapterChanged(androidx.leanback.widget.DetailsOverviewRow r2) {
                    r1 = this;
                    androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = r1.this$1
                    androidx.leanback.widget.ObjectAdapter r2 = r2.getActionsAdapter()
                    r0.bindActions(r2)
                    return
            }

            @Override // androidx.leanback.widget.DetailsOverviewRow.Listener
            public void onImageDrawableChanged(androidx.leanback.widget.DetailsOverviewRow r2) {
                    r1 = this;
                    android.os.Handler r2 = androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.sHandler
                    androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = r1.this$1
                    java.lang.Runnable r0 = r0.mUpdateDrawableCallback
                    r2.removeCallbacks(r0)
                    androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = r1.this$1
                    java.lang.Runnable r0 = r0.mUpdateDrawableCallback
                    r2.post(r0)
                    return
            }

            @Override // androidx.leanback.widget.DetailsOverviewRow.Listener
            public void onItemChanged(androidx.leanback.widget.DetailsOverviewRow r3) {
                    r2 = this;
                    androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = r2.this$1
                    androidx.leanback.widget.Presenter$ViewHolder r1 = r0.mDetailsDescriptionViewHolder
                    if (r1 == 0) goto Ld
                    androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter r0 = r0.this$0
                    androidx.leanback.widget.Presenter r0 = r0.mDetailsPresenter
                    r0.onUnbindViewHolder(r1)
                Ld:
                    androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = r2.this$1
                    androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter r1 = r0.this$0
                    androidx.leanback.widget.Presenter r1 = r1.mDetailsPresenter
                    androidx.leanback.widget.Presenter$ViewHolder r0 = r0.mDetailsDescriptionViewHolder
                    java.lang.Object r3 = r3.getItem()
                    r1.onBindViewHolder(r0, r3)
                    return
            }
        }

        public ViewHolder(androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter r7, android.view.View r8, androidx.leanback.widget.Presenter r9, androidx.leanback.widget.DetailsOverviewLogoPresenter r10) {
                r6 = this;
                r6.this$0 = r7
                r6.<init>(r8)
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder$DetailsOverviewRowListener r7 = new androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder$DetailsOverviewRowListener
                r7.<init>(r6)
                r6.mRowListener = r7
                r7 = 0
                r6.mState = r7
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder$1 r0 = new androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder$1
                r0.<init>(r6)
                r6.mUpdateDrawableCallback = r0
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder$2 r0 = new androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder$2
                r0.<init>(r6)
                r6.mLayoutChangeListener = r0
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder$3 r0 = new androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder$3
                r0.<init>(r6)
                r6.mChildSelectedListener = r0
                androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder$4 r1 = new androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder$4
                r1.<init>(r6)
                int r2 = androidx.leanback.R.id.details_root
                android.view.View r2 = r8.findViewById(r2)
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                int r3 = androidx.leanback.R.id.details_frame
                android.view.View r3 = r8.findViewById(r3)
                android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
                r6.mOverviewFrame = r3
                int r4 = androidx.leanback.R.id.details_overview_description
                android.view.View r4 = r8.findViewById(r4)
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                r6.mDetailsDescriptionFrame = r4
                int r5 = androidx.leanback.R.id.details_overview_actions
                android.view.View r3 = r3.findViewById(r5)
                androidx.leanback.widget.HorizontalGridView r3 = (androidx.leanback.widget.HorizontalGridView) r3
                r6.mActionsRow = r3
                r3.setHasOverlappingRendering(r7)
                r3.setOnScrollListener(r1)
                androidx.leanback.widget.ItemBridgeAdapter r7 = r6.mActionBridgeAdapter
                r3.setAdapter(r7)
                r3.setOnChildSelectedListener(r0)
                android.content.res.Resources r7 = r8.getResources()
                int r8 = androidx.leanback.R.dimen.lb_details_overview_actions_fade_size
                int r7 = r7.getDimensionPixelSize(r8)
                r3.setFadingRightEdgeLength(r7)
                r3.setFadingLeftEdgeLength(r7)
                androidx.leanback.widget.Presenter$ViewHolder r7 = r9.onCreateViewHolder(r4)
                r6.mDetailsDescriptionViewHolder = r7
                android.view.View r7 = r7.view
                r4.addView(r7)
                androidx.leanback.widget.Presenter$ViewHolder r7 = r10.onCreateViewHolder(r2)
                androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r7 = (androidx.leanback.widget.DetailsOverviewLogoPresenter.ViewHolder) r7
                r6.mDetailsLogoViewHolder = r7
                android.view.View r7 = r7.view
                r2.addView(r7)
                return
        }

        private int getViewCenter(android.view.View r2) {
                r1 = this;
                int r0 = r2.getRight()
                int r2 = r2.getLeft()
                int r0 = r0 - r2
                int r0 = r0 / 2
                return r0
        }

        public final void bindActions(androidx.leanback.widget.ObjectAdapter r2) {
                r1 = this;
                androidx.leanback.widget.ItemBridgeAdapter r0 = r1.mActionBridgeAdapter
                r0.setAdapter(r2)
                androidx.leanback.widget.HorizontalGridView r2 = r1.mActionsRow
                androidx.leanback.widget.ItemBridgeAdapter r0 = r1.mActionBridgeAdapter
                r2.setAdapter(r0)
                androidx.leanback.widget.ItemBridgeAdapter r2 = r1.mActionBridgeAdapter
                int r2 = r2.getItemCount()
                r1.mNumItems = r2
                return
        }

        public final void checkFirstAndLastPosition() {
                r2 = this;
                androidx.leanback.widget.HorizontalGridView r0 = r2.mActionsRow
                int r1 = r2.mNumItems
                int r1 = r1 + (-1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.findViewHolderForPosition(r1)
                if (r0 == 0) goto L16
                android.view.View r0 = r0.itemView
                r0.getRight()
                androidx.leanback.widget.HorizontalGridView r0 = r2.mActionsRow
                r0.getWidth()
            L16:
                androidx.leanback.widget.HorizontalGridView r0 = r2.mActionsRow
                r1 = 0
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.findViewHolderForPosition(r1)
                if (r0 == 0) goto L24
                android.view.View r0 = r0.itemView
                r0.getLeft()
            L24:
                return
        }

        public final android.view.ViewGroup getActionsRow() {
                r1 = this;
                androidx.leanback.widget.HorizontalGridView r0 = r1.mActionsRow
                return r0
        }

        public final android.view.ViewGroup getDetailsDescriptionFrame() {
                r1 = this;
                android.view.ViewGroup r0 = r1.mDetailsDescriptionFrame
                return r0
        }

        public final androidx.leanback.widget.Presenter.ViewHolder getDetailsDescriptionViewHolder() {
                r1 = this;
                androidx.leanback.widget.Presenter$ViewHolder r0 = r1.mDetailsDescriptionViewHolder
                return r0
        }

        public final androidx.leanback.widget.DetailsOverviewLogoPresenter.ViewHolder getLogoViewHolder() {
                r1 = this;
                androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r0 = r1.mDetailsLogoViewHolder
                return r0
        }

        public final android.view.ViewGroup getOverviewView() {
                r1 = this;
                android.widget.FrameLayout r0 = r1.mOverviewFrame
                return r0
        }

        public final int getState() {
                r1 = this;
                int r0 = r1.mState
                return r0
        }
    }

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.sTmpRect = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.sHandler = r0
            return
    }

    public FullWidthDetailsOverviewRowPresenter(androidx.leanback.widget.Presenter r2) {
            r1 = this;
            androidx.leanback.widget.DetailsOverviewLogoPresenter r0 = new androidx.leanback.widget.DetailsOverviewLogoPresenter
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public FullWidthDetailsOverviewRowPresenter(androidx.leanback.widget.Presenter r3, androidx.leanback.widget.DetailsOverviewLogoPresenter r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mInitialState = r0
            r2.mBackgroundColor = r0
            r2.mActionsBackgroundColor = r0
            r1 = 0
            r2.setHeaderPresenter(r1)
            r2.setSelectEffectEnabled(r0)
            r2.mDetailsPresenter = r3
            r2.mDetailsOverviewLogoPresenter = r4
            return
    }

    private static int getNonNegativeHeight(android.graphics.drawable.Drawable r1) {
            r0 = 0
            if (r1 != 0) goto L5
            r1 = 0
            goto L9
        L5:
            int r1 = r1.getIntrinsicHeight()
        L9:
            if (r1 <= 0) goto Lc
            r0 = r1
        Lc:
            return r0
    }

    private static int getNonNegativeWidth(android.graphics.drawable.Drawable r1) {
            r0 = 0
            if (r1 != 0) goto L5
            r1 = 0
            goto L9
        L5:
            int r1 = r1.getIntrinsicWidth()
        L9:
            if (r1 <= 0) goto Lc
            r0 = r1
        Lc:
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final androidx.leanback.widget.RowPresenter.ViewHolder createRowViewHolder(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.leanback.R.layout.lb_fullwidth_details_overview
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = new androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder
            androidx.leanback.widget.Presenter r1 = r3.mDetailsPresenter
            androidx.leanback.widget.DetailsOverviewLogoPresenter r2 = r3.mDetailsOverviewLogoPresenter
            r0.<init>(r3, r4, r1, r2)
            androidx.leanback.widget.DetailsOverviewLogoPresenter r4 = r3.mDetailsOverviewLogoPresenter
            androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r1 = r0.mDetailsLogoViewHolder
            r4.setContext(r1, r0, r3)
            int r4 = r3.mInitialState
            r3.setState(r0, r4)
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ActionsItemBridgeAdapter r4 = new androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ActionsItemBridgeAdapter
            r4.<init>(r3, r0)
            r0.mActionBridgeAdapter = r4
            android.widget.FrameLayout r4 = r0.mOverviewFrame
            boolean r1 = r3.mBackgroundColorSet
            if (r1 == 0) goto L36
            int r1 = r3.mBackgroundColor
            r4.setBackgroundColor(r1)
        L36:
            boolean r1 = r3.mActionsBackgroundColorSet
            if (r1 == 0) goto L45
            int r1 = androidx.leanback.R.id.details_overview_actions_background
            android.view.View r1 = r4.findViewById(r1)
            int r2 = r3.mActionsBackgroundColor
            r1.setBackgroundColor(r2)
        L45:
            r1 = 1
            androidx.leanback.widget.RoundedRectHelper.setClipToRoundedOutline(r4, r1)
            boolean r4 = r3.getSelectEffectEnabled()
            if (r4 != 0) goto L55
            android.widget.FrameLayout r4 = r0.mOverviewFrame
            r1 = 0
            r4.setForeground(r1)
        L55:
            androidx.leanback.widget.HorizontalGridView r4 = r0.mActionsRow
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$1 r1 = new androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$1
            r1.<init>(r0)
            r4.setOnUnhandledKeyListener(r1)
            return r0
    }

    public final int getActionsBackgroundColor() {
            r1 = this;
            int r0 = r1.mActionsBackgroundColor
            return r0
    }

    public final int getAlignmentMode() {
            r1 = this;
            int r0 = r1.mAlignmentMode
            return r0
    }

    public final int getBackgroundColor() {
            r1 = this;
            int r0 = r1.mBackgroundColor
            return r0
    }

    public final int getInitialState() {
            r1 = this;
            int r0 = r1.mInitialState
            return r0
    }

    public androidx.leanback.widget.OnActionClickedListener getOnActionClickedListener() {
            r1 = this;
            androidx.leanback.widget.OnActionClickedListener r0 = r1.mActionClickedListener
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final boolean isClippingChildren() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final boolean isParticipatingEntranceTransition() {
            r1 = this;
            boolean r0 = r1.mParticipatingEntranceTransition
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final boolean isUsingDefaultSelectEffect() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void notifyOnBindLogo(androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder r3) {
            r2 = this;
            int r0 = r3.getState()
            r1 = 1
            r2.onLayoutOverviewFrame(r3, r0, r1)
            r3.getState()
            r2.onLayoutLogo(r3)
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$Listener r0 = r2.mListener
            if (r0 == 0) goto L15
            r0.onBindLogo(r3)
        L15:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onBindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r3, java.lang.Object r4) {
            r2 = this;
            super.onBindRowViewHolder(r3, r4)
            androidx.leanback.widget.DetailsOverviewRow r4 = (androidx.leanback.widget.DetailsOverviewRow) r4
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r3 = (androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder) r3
            androidx.leanback.widget.DetailsOverviewLogoPresenter r0 = r2.mDetailsOverviewLogoPresenter
            androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r1 = r3.mDetailsLogoViewHolder
            r0.onBindViewHolder(r1, r4)
            androidx.leanback.widget.Presenter r0 = r2.mDetailsPresenter
            androidx.leanback.widget.Presenter$ViewHolder r1 = r3.mDetailsDescriptionViewHolder
            java.lang.Object r4 = r4.getItem()
            r0.onBindViewHolder(r1, r4)
            androidx.leanback.widget.Row r4 = r3.getRow()
            androidx.leanback.widget.DetailsOverviewRow r4 = (androidx.leanback.widget.DetailsOverviewRow) r4
            androidx.leanback.widget.ObjectAdapter r0 = r4.getActionsAdapter()
            r3.bindActions(r0)
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder$DetailsOverviewRowListener r3 = r3.mRowListener
            r4.addListener(r3)
            return
    }

    public final void onLayoutLogo(androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder r5) {
            r4 = this;
            androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r0 = r5.getLogoViewHolder()
            android.view.View r0 = r0.view
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r4.mAlignmentMode
            r3 = 1
            if (r2 == r3) goto L1f
            android.content.res.Resources r2 = r0.getResources()
            int r3 = androidx.leanback.R.dimen.lb_details_v2_logo_margin_start
            int r2 = r2.getDimensionPixelSize(r3)
            r1.setMarginStart(r2)
            goto L2f
        L1f:
            android.content.res.Resources r2 = r0.getResources()
            int r3 = androidx.leanback.R.dimen.lb_details_v2_left
            int r2 = r2.getDimensionPixelSize(r3)
            int r3 = r1.width
            int r2 = r2 - r3
            r1.setMarginStart(r2)
        L2f:
            int r5 = r5.getState()
            if (r5 == 0) goto L4d
            r2 = 2
            if (r5 == r2) goto L49
            android.content.res.Resources r5 = r0.getResources()
            int r3 = androidx.leanback.R.dimen.lb_details_v2_blank_height
            int r5 = r5.getDimensionPixelSize(r3)
            int r3 = r1.height
            int r3 = r3 / r2
            int r5 = r5 - r3
            r1.topMargin = r5
            goto L6f
        L49:
            r5 = 0
            r1.topMargin = r5
            goto L6f
        L4d:
            android.content.res.Resources r5 = r0.getResources()
            int r2 = androidx.leanback.R.dimen.lb_details_v2_blank_height
            int r5 = r5.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r0.getResources()
            int r3 = androidx.leanback.R.dimen.lb_details_v2_actions_height
            int r2 = r2.getDimensionPixelSize(r3)
            int r2 = r2 + r5
            android.content.res.Resources r5 = r0.getResources()
            int r3 = androidx.leanback.R.dimen.lb_details_v2_description_margin_top
            int r5 = r5.getDimensionPixelSize(r3)
            int r5 = r5 + r2
            r1.topMargin = r5
        L6f:
            r0.setLayoutParams(r1)
            return
    }

    public final void onLayoutOverviewFrame(androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder r6, int r7, boolean r8) {
            r5 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r7 != r0) goto L7
            r7 = 1
            goto L8
        L7:
            r7 = 0
        L8:
            int r3 = r6.getState()
            if (r3 != r0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r7 != r0) goto L15
            if (r8 == 0) goto Lae
        L15:
            android.view.View r7 = r6.view
            android.content.res.Resources r7 = r7.getResources()
            androidx.leanback.widget.DetailsOverviewLogoPresenter r8 = r5.mDetailsOverviewLogoPresenter
            androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r3 = r6.getLogoViewHolder()
            androidx.leanback.widget.Row r4 = r6.getRow()
            androidx.leanback.widget.DetailsOverviewRow r4 = (androidx.leanback.widget.DetailsOverviewRow) r4
            boolean r8 = r8.isBoundToImage(r3, r4)
            if (r8 == 0) goto L3a
            androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r8 = r6.getLogoViewHolder()
            android.view.View r8 = r8.view
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            int r8 = r8.width
            goto L3b
        L3a:
            r8 = 0
        L3b:
            int r3 = r5.mAlignmentMode
            if (r3 == r1) goto L51
            if (r0 == 0) goto L48
            int r1 = androidx.leanback.R.dimen.lb_details_v2_logo_margin_start
            int r1 = r7.getDimensionPixelSize(r1)
            goto L62
        L48:
            int r1 = androidx.leanback.R.dimen.lb_details_v2_logo_margin_start
            int r1 = r7.getDimensionPixelSize(r1)
            int r8 = r8 + r1
        L4f:
            r1 = 0
            goto L62
        L51:
            if (r0 == 0) goto L5b
            int r1 = androidx.leanback.R.dimen.lb_details_v2_left
            int r1 = r7.getDimensionPixelSize(r1)
            int r1 = r1 - r8
            goto L62
        L5b:
            int r8 = androidx.leanback.R.dimen.lb_details_v2_left
            int r8 = r7.getDimensionPixelSize(r8)
            goto L4f
        L62:
            android.view.ViewGroup r3 = r6.getOverviewView()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            if (r0 == 0) goto L70
            r4 = 0
            goto L76
        L70:
            int r4 = androidx.leanback.R.dimen.lb_details_v2_blank_height
            int r4 = r7.getDimensionPixelSize(r4)
        L76:
            r3.topMargin = r4
            r3.rightMargin = r1
            r3.leftMargin = r1
            android.view.ViewGroup r1 = r6.getOverviewView()
            r1.setLayoutParams(r3)
            android.view.ViewGroup r1 = r6.getDetailsDescriptionFrame()
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            r3.setMarginStart(r8)
            r1.setLayoutParams(r3)
            android.view.ViewGroup r6 = r6.getActionsRow()
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.setMarginStart(r8)
            if (r0 == 0) goto La3
            goto La9
        La3:
            int r8 = androidx.leanback.R.dimen.lb_details_v2_actions_height
            int r2 = r7.getDimensionPixelSize(r8)
        La9:
            r1.height = r2
            r6.setLayoutParams(r1)
        Lae:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewAttachedToWindow(androidx.leanback.widget.RowPresenter.ViewHolder r3) {
            r2 = this;
            super.onRowViewAttachedToWindow(r3)
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r3 = (androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder) r3
            androidx.leanback.widget.Presenter r0 = r2.mDetailsPresenter
            androidx.leanback.widget.Presenter$ViewHolder r1 = r3.mDetailsDescriptionViewHolder
            r0.onViewAttachedToWindow(r1)
            androidx.leanback.widget.DetailsOverviewLogoPresenter r0 = r2.mDetailsOverviewLogoPresenter
            androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r3 = r3.mDetailsLogoViewHolder
            r0.onViewAttachedToWindow(r3)
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewDetachedFromWindow(androidx.leanback.widget.RowPresenter.ViewHolder r3) {
            r2 = this;
            super.onRowViewDetachedFromWindow(r3)
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r3 = (androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder) r3
            androidx.leanback.widget.Presenter r0 = r2.mDetailsPresenter
            androidx.leanback.widget.Presenter$ViewHolder r1 = r3.mDetailsDescriptionViewHolder
            r0.onViewDetachedFromWindow(r1)
            androidx.leanback.widget.DetailsOverviewLogoPresenter r0 = r2.mDetailsOverviewLogoPresenter
            androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r3 = r3.mDetailsLogoViewHolder
            r0.onViewDetachedFromWindow(r3)
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onSelectLevelChanged(androidx.leanback.widget.RowPresenter.ViewHolder r2) {
            r1 = this;
            super.onSelectLevelChanged(r2)
            boolean r0 = r1.getSelectEffectEnabled()
            if (r0 == 0) goto L24
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r2 = (androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder) r2
            androidx.leanback.graphics.ColorOverlayDimmer r0 = r2.mColorDimmer
            android.graphics.Paint r0 = r0.getPaint()
            int r0 = r0.getColor()
            android.widget.FrameLayout r2 = r2.mOverviewFrame
            android.graphics.drawable.Drawable r2 = r2.getForeground()
            android.graphics.drawable.Drawable r2 = r2.mutate()
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            r2.setColor(r0)
        L24:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onUnbindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r4) {
            r3 = this;
            r0 = r4
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder r0 = (androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder) r0
            androidx.leanback.widget.Row r1 = r0.getRow()
            androidx.leanback.widget.DetailsOverviewRow r1 = (androidx.leanback.widget.DetailsOverviewRow) r1
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter$ViewHolder$DetailsOverviewRowListener r2 = r0.mRowListener
            r1.removeListener(r2)
            android.os.Handler r1 = androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.sHandler
            java.lang.Runnable r2 = r0.mUpdateDrawableCallback
            r1.removeCallbacks(r2)
            androidx.leanback.widget.Presenter r1 = r3.mDetailsPresenter
            androidx.leanback.widget.Presenter$ViewHolder r2 = r0.mDetailsDescriptionViewHolder
            r1.onUnbindViewHolder(r2)
            androidx.leanback.widget.DetailsOverviewLogoPresenter r1 = r3.mDetailsOverviewLogoPresenter
            androidx.leanback.widget.DetailsOverviewLogoPresenter$ViewHolder r0 = r0.mDetailsLogoViewHolder
            r1.onUnbindViewHolder(r0)
            super.onUnbindRowViewHolder(r4)
            return
    }

    public final void setActionsBackgroundColor(int r1) {
            r0 = this;
            r0.mActionsBackgroundColor = r1
            r1 = 1
            r0.mActionsBackgroundColorSet = r1
            return
    }

    public final void setAlignmentMode(int r1) {
            r0 = this;
            r0.mAlignmentMode = r1
            return
    }

    public final void setBackgroundColor(int r1) {
            r0 = this;
            r0.mBackgroundColor = r1
            r1 = 1
            r0.mBackgroundColorSet = r1
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void setEntranceTransitionState(androidx.leanback.widget.RowPresenter.ViewHolder r2, boolean r3) {
            r1 = this;
            super.setEntranceTransitionState(r2, r3)
            boolean r0 = r1.mParticipatingEntranceTransition
            if (r0 == 0) goto L11
            android.view.View r2 = r2.view
            if (r3 == 0) goto Ld
            r3 = 0
            goto Le
        Ld:
            r3 = 4
        Le:
            r2.setVisibility(r3)
        L11:
            return
    }

    public final void setInitialState(int r1) {
            r0 = this;
            r0.mInitialState = r1
            return
    }

    public final void setListener(androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.Listener r1) {
            r0 = this;
            r0.mListener = r1
            return
    }

    public void setOnActionClickedListener(androidx.leanback.widget.OnActionClickedListener r1) {
            r0 = this;
            r0.mActionClickedListener = r1
            return
    }

    public final void setParticipatingEntranceTransition(boolean r1) {
            r0 = this;
            r0.mParticipatingEntranceTransition = r1
            return
    }

    public final void setState(androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter.ViewHolder r2, int r3) {
            r1 = this;
            int r0 = r2.getState()
            if (r0 == r3) goto L13
            int r0 = r2.getState()
            r2.mState = r3
            r3 = 0
            r1.onLayoutOverviewFrame(r2, r0, r3)
            r1.onLayoutLogo(r2)
        L13:
            return
    }
}
