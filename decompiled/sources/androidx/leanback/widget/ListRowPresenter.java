package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class ListRowPresenter extends androidx.leanback.widget.RowPresenter {
    private static final boolean DEBUG = false;
    private static final int DEFAULT_RECYCLED_POOL_SIZE = 24;
    private static final java.lang.String TAG = "ListRowPresenter";
    private static int sExpandedRowNoHovercardBottomPadding;
    private static int sExpandedSelectedRowTopPadding;
    private static int sSelectedRowTopPadding;
    private int mBrowseRowsFadingEdgeLength;
    private int mExpandedRowHeight;
    private int mFocusZoomFactor;
    private androidx.leanback.widget.PresenterSelector mHoverCardPresenterSelector;
    private boolean mKeepChildForeground;
    private int mNumRows;
    private java.util.HashMap<androidx.leanback.widget.Presenter, java.lang.Integer> mRecycledPoolSize;
    private boolean mRoundedCornersEnabled;
    private int mRowHeight;
    private boolean mShadowEnabled;
    public androidx.leanback.widget.ShadowOverlayHelper mShadowOverlayHelper;
    private androidx.leanback.widget.ItemBridgeAdapter.Wrapper mShadowOverlayWrapper;
    private boolean mUseFocusDimmer;



    public class ListRowPresenterItemBridgeAdapter extends androidx.leanback.widget.ItemBridgeAdapter {
        public androidx.leanback.widget.ListRowPresenter.ViewHolder mRowViewHolder;
        public final /* synthetic */ androidx.leanback.widget.ListRowPresenter this$0;


        public ListRowPresenterItemBridgeAdapter(androidx.leanback.widget.ListRowPresenter r1, androidx.leanback.widget.ListRowPresenter.ViewHolder r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mRowViewHolder = r2
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onAddPresenter(androidx.leanback.widget.Presenter r3, int r4) {
                r2 = this;
                androidx.leanback.widget.ListRowPresenter$ViewHolder r0 = r2.mRowViewHolder
                androidx.leanback.widget.HorizontalGridView r0 = r0.getGridView()
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r0.getRecycledViewPool()
                androidx.leanback.widget.ListRowPresenter r1 = r2.this$0
                int r3 = r1.getRecycledPoolSize(r3)
                r0.setMaxRecycledViews(r4, r3)
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onAttachedToWindow(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r4) {
                r3 = this;
                androidx.leanback.widget.ListRowPresenter r0 = r3.this$0
                androidx.leanback.widget.ListRowPresenter$ViewHolder r1 = r3.mRowViewHolder
                android.view.View r2 = r4.itemView
                r0.applySelectLevelToChild(r1, r2)
                androidx.leanback.widget.ListRowPresenter$ViewHolder r0 = r3.mRowViewHolder
                android.view.View r4 = r4.itemView
                r0.syncActivatedStatus(r4)
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onBind(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r3) {
                r2 = this;
                androidx.leanback.widget.ListRowPresenter$ViewHolder r0 = r2.mRowViewHolder
                androidx.leanback.widget.BaseOnItemViewClickedListener r0 = r0.getOnItemViewClickedListener()
                if (r0 == 0) goto L14
                androidx.leanback.widget.Presenter$ViewHolder r0 = r3.mHolder
                android.view.View r0 = r0.view
                androidx.leanback.widget.ListRowPresenter$ListRowPresenterItemBridgeAdapter$1 r1 = new androidx.leanback.widget.ListRowPresenter$ListRowPresenterItemBridgeAdapter$1
                r1.<init>(r2, r3)
                r0.setOnClickListener(r1)
            L14:
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public final void onCreate(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r3) {
                r2 = this;
                android.view.View r0 = r3.itemView
                boolean r1 = r0 instanceof android.view.ViewGroup
                if (r1 == 0) goto Lc
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r1 = 1
                androidx.leanback.transition.TransitionHelper.setTransitionGroup(r0, r1)
            Lc:
                androidx.leanback.widget.ListRowPresenter r0 = r2.this$0
                androidx.leanback.widget.ShadowOverlayHelper r0 = r0.mShadowOverlayHelper
                if (r0 == 0) goto L17
                android.view.View r3 = r3.itemView
                r0.onViewCreated(r3)
            L17:
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onUnbind(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r2) {
                r1 = this;
                androidx.leanback.widget.ListRowPresenter$ViewHolder r0 = r1.mRowViewHolder
                androidx.leanback.widget.BaseOnItemViewClickedListener r0 = r0.getOnItemViewClickedListener()
                if (r0 == 0) goto L10
                androidx.leanback.widget.Presenter$ViewHolder r2 = r2.mHolder
                android.view.View r2 = r2.view
                r0 = 0
                r2.setOnClickListener(r0)
            L10:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SelectItemViewHolderTask extends androidx.leanback.widget.Presenter.ViewHolderTask {
        private int mItemPosition;
        public androidx.leanback.widget.Presenter.ViewHolderTask mItemTask;
        private boolean mSmoothScroll;


        public SelectItemViewHolderTask(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mSmoothScroll = r0
                r1.setItemPosition(r2)
                return
        }

        public int getItemPosition() {
                r1 = this;
                int r0 = r1.mItemPosition
                return r0
        }

        public androidx.leanback.widget.Presenter.ViewHolderTask getItemTask() {
                r1 = this;
                androidx.leanback.widget.Presenter$ViewHolderTask r0 = r1.mItemTask
                return r0
        }

        public boolean isSmoothScroll() {
                r1 = this;
                boolean r0 = r1.mSmoothScroll
                return r0
        }

        @Override // androidx.leanback.widget.Presenter.ViewHolderTask
        public void run(androidx.leanback.widget.Presenter.ViewHolder r3) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.leanback.widget.ListRowPresenter.ViewHolder
                if (r0 == 0) goto L25
                androidx.leanback.widget.ListRowPresenter$ViewHolder r3 = (androidx.leanback.widget.ListRowPresenter.ViewHolder) r3
                androidx.leanback.widget.HorizontalGridView r3 = r3.getGridView()
                r0 = 0
                androidx.leanback.widget.Presenter$ViewHolderTask r1 = r2.mItemTask
                if (r1 == 0) goto L14
                androidx.leanback.widget.ListRowPresenter$SelectItemViewHolderTask$1 r0 = new androidx.leanback.widget.ListRowPresenter$SelectItemViewHolderTask$1
                r0.<init>(r2)
            L14:
                boolean r1 = r2.isSmoothScroll()
                if (r1 == 0) goto L20
                int r1 = r2.mItemPosition
                r3.setSelectedPositionSmooth(r1, r0)
                goto L25
            L20:
                int r1 = r2.mItemPosition
                r3.setSelectedPosition(r1, r0)
            L25:
                return
        }

        public void setItemPosition(int r1) {
                r0 = this;
                r0.mItemPosition = r1
                return
        }

        public void setItemTask(androidx.leanback.widget.Presenter.ViewHolderTask r1) {
                r0 = this;
                r0.mItemTask = r1
                return
        }

        public void setSmoothScroll(boolean r1) {
                r0 = this;
                r0.mSmoothScroll = r1
                return
        }
    }

    public static class ViewHolder extends androidx.leanback.widget.RowPresenter.ViewHolder {
        public final androidx.leanback.widget.HorizontalGridView mGridView;
        public final androidx.leanback.widget.HorizontalHoverCardSwitcher mHoverCardViewSwitcher;
        public androidx.leanback.widget.ItemBridgeAdapter mItemBridgeAdapter;
        public final androidx.leanback.widget.ListRowPresenter mListRowPresenter;
        public final int mPaddingBottom;
        public final int mPaddingLeft;
        public final int mPaddingRight;
        public final int mPaddingTop;

        public ViewHolder(android.view.View r1, androidx.leanback.widget.HorizontalGridView r2, androidx.leanback.widget.ListRowPresenter r3) {
                r0 = this;
                r0.<init>(r1)
                androidx.leanback.widget.HorizontalHoverCardSwitcher r1 = new androidx.leanback.widget.HorizontalHoverCardSwitcher
                r1.<init>()
                r0.mHoverCardViewSwitcher = r1
                r0.mGridView = r2
                r0.mListRowPresenter = r3
                int r1 = r2.getPaddingTop()
                r0.mPaddingTop = r1
                int r1 = r2.getPaddingBottom()
                r0.mPaddingBottom = r1
                int r1 = r2.getPaddingLeft()
                r0.mPaddingLeft = r1
                int r1 = r2.getPaddingRight()
                r0.mPaddingRight = r1
                return
        }

        public final androidx.leanback.widget.ItemBridgeAdapter getBridgeAdapter() {
                r1 = this;
                androidx.leanback.widget.ItemBridgeAdapter r0 = r1.mItemBridgeAdapter
                return r0
        }

        public final androidx.leanback.widget.HorizontalGridView getGridView() {
                r1 = this;
                androidx.leanback.widget.HorizontalGridView r0 = r1.mGridView
                return r0
        }

        public androidx.leanback.widget.Presenter.ViewHolder getItemViewHolder(int r2) {
                r1 = this;
                androidx.leanback.widget.HorizontalGridView r0 = r1.mGridView
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r0.findViewHolderForAdapterPosition(r2)
                androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r2 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r2
                if (r2 != 0) goto Lc
                r2 = 0
                return r2
            Lc:
                androidx.leanback.widget.Presenter$ViewHolder r2 = r2.getViewHolder()
                return r2
        }

        public final androidx.leanback.widget.ListRowPresenter getListRowPresenter() {
                r1 = this;
                androidx.leanback.widget.ListRowPresenter r0 = r1.mListRowPresenter
                return r0
        }

        @Override // androidx.leanback.widget.RowPresenter.ViewHolder
        public java.lang.Object getSelectedItem() {
                r2 = this;
                androidx.leanback.widget.HorizontalGridView r0 = r2.mGridView
                int r1 = r2.getSelectedPosition()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.findViewHolderForAdapterPosition(r1)
                androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r0 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r0
                if (r0 != 0) goto L10
                r0 = 0
                return r0
            L10:
                java.lang.Object r0 = r0.getItem()
                return r0
        }

        @Override // androidx.leanback.widget.RowPresenter.ViewHolder
        public androidx.leanback.widget.Presenter.ViewHolder getSelectedItemViewHolder() {
                r1 = this;
                int r0 = r1.getSelectedPosition()
                androidx.leanback.widget.Presenter$ViewHolder r0 = r1.getItemViewHolder(r0)
                return r0
        }

        public int getSelectedPosition() {
                r1 = this;
                androidx.leanback.widget.HorizontalGridView r0 = r1.mGridView
                int r0 = r0.getSelectedPosition()
                return r0
        }
    }

    public ListRowPresenter() {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            return
    }

    public ListRowPresenter(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ListRowPresenter(int r3, boolean r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mNumRows = r0
            r2.mShadowEnabled = r0
            r1 = -1
            r2.mBrowseRowsFadingEdgeLength = r1
            r2.mRoundedCornersEnabled = r0
            r2.mKeepChildForeground = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mRecycledPoolSize = r1
            if (r3 == 0) goto L20
            int r1 = androidx.leanback.widget.FocusHighlightHelper.getResId(r3)
            if (r1 <= 0) goto L1f
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L27
            r2.mFocusZoomFactor = r3
            r2.mUseFocusDimmer = r4
            return
        L27:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Unhandled zoom factor"
            r3.<init>(r4)
            throw r3
    }

    private int getSpaceUnderBaseline(androidx.leanback.widget.ListRowPresenter.ViewHolder r2) {
            r1 = this;
            androidx.leanback.widget.RowHeaderPresenter$ViewHolder r2 = r2.getHeaderViewHolder()
            if (r2 == 0) goto L1c
            androidx.leanback.widget.RowHeaderPresenter r0 = r1.getHeaderPresenter()
            if (r0 == 0) goto L15
            androidx.leanback.widget.RowHeaderPresenter r0 = r1.getHeaderPresenter()
            int r2 = r0.getSpaceUnderBaseline(r2)
            return r2
        L15:
            android.view.View r2 = r2.view
            int r2 = r2.getPaddingBottom()
            return r2
        L1c:
            r2 = 0
            return r2
    }

    private static void initStatics(android.content.Context r2) {
            int r0 = androidx.leanback.widget.ListRowPresenter.sSelectedRowTopPadding
            if (r0 != 0) goto L28
            android.content.res.Resources r0 = r2.getResources()
            int r1 = androidx.leanback.R.dimen.lb_browse_selected_row_top_padding
            int r0 = r0.getDimensionPixelSize(r1)
            androidx.leanback.widget.ListRowPresenter.sSelectedRowTopPadding = r0
            android.content.res.Resources r0 = r2.getResources()
            int r1 = androidx.leanback.R.dimen.lb_browse_expanded_selected_row_top_padding
            int r0 = r0.getDimensionPixelSize(r1)
            androidx.leanback.widget.ListRowPresenter.sExpandedSelectedRowTopPadding = r0
            android.content.res.Resources r2 = r2.getResources()
            int r0 = androidx.leanback.R.dimen.lb_browse_expanded_row_no_hovercard_bottom_padding
            int r2 = r2.getDimensionPixelSize(r0)
            androidx.leanback.widget.ListRowPresenter.sExpandedRowNoHovercardBottomPadding = r2
        L28:
            return
    }

    private void setVerticalPadding(androidx.leanback.widget.ListRowPresenter.ViewHolder r5) {
            r4 = this;
            boolean r0 = r5.isExpanded()
            if (r0 == 0) goto L20
            int r0 = r4.getSpaceUnderBaseline(r5)
            boolean r1 = r5.isSelected()
            if (r1 == 0) goto L13
            int r1 = androidx.leanback.widget.ListRowPresenter.sExpandedSelectedRowTopPadding
            goto L15
        L13:
            int r1 = r5.mPaddingTop
        L15:
            int r1 = r1 - r0
            androidx.leanback.widget.PresenterSelector r0 = r4.mHoverCardPresenterSelector
            if (r0 != 0) goto L1d
            int r0 = androidx.leanback.widget.ListRowPresenter.sExpandedRowNoHovercardBottomPadding
            goto L30
        L1d:
            int r0 = r5.mPaddingBottom
            goto L30
        L20:
            boolean r0 = r5.isSelected()
            if (r0 == 0) goto L2d
            int r0 = androidx.leanback.widget.ListRowPresenter.sSelectedRowTopPadding
            int r1 = r5.mPaddingBottom
            int r1 = r0 - r1
            goto L30
        L2d:
            r1 = 0
            int r0 = r5.mPaddingBottom
        L30:
            androidx.leanback.widget.HorizontalGridView r2 = r5.getGridView()
            int r3 = r5.mPaddingLeft
            int r5 = r5.mPaddingRight
            r2.setPadding(r3, r1, r5, r0)
            return
    }

    private void setupFadingEffect(androidx.leanback.widget.ListRowView r4) {
            r3 = this;
            androidx.leanback.widget.HorizontalGridView r4 = r4.getGridView()
            int r0 = r3.mBrowseRowsFadingEdgeLength
            if (r0 >= 0) goto L1f
            android.content.Context r0 = r4.getContext()
            int[] r1 = androidx.leanback.R.styleable.LeanbackTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            int r1 = androidx.leanback.R.styleable.LeanbackTheme_browseRowsFadingEdgeLength
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r1 = (int) r1
            r3.mBrowseRowsFadingEdgeLength = r1
            r0.recycle()
        L1f:
            int r0 = r3.mBrowseRowsFadingEdgeLength
            r4.setFadingLeftEdgeLength(r0)
            return
    }

    private void updateFooterViewSwitcher(androidx.leanback.widget.ListRowPresenter.ViewHolder r4) {
            r3 = this;
            boolean r0 = r4.mExpanded
            if (r0 == 0) goto L2c
            boolean r0 = r4.mSelected
            if (r0 == 0) goto L2c
            androidx.leanback.widget.PresenterSelector r0 = r3.mHoverCardPresenterSelector
            if (r0 == 0) goto L15
            androidx.leanback.widget.HorizontalHoverCardSwitcher r1 = r4.mHoverCardViewSwitcher
            android.view.View r2 = r4.view
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.init(r2, r0)
        L15:
            androidx.leanback.widget.HorizontalGridView r0 = r4.mGridView
            int r1 = r0.getSelectedPosition()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.findViewHolderForPosition(r1)
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r0 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r0
            if (r0 != 0) goto L25
            r0 = 0
            goto L27
        L25:
            android.view.View r0 = r0.itemView
        L27:
            r1 = 0
            r3.selectChildView(r4, r0, r1)
            goto L35
        L2c:
            androidx.leanback.widget.PresenterSelector r0 = r3.mHoverCardPresenterSelector
            if (r0 == 0) goto L35
            androidx.leanback.widget.HorizontalHoverCardSwitcher r4 = r4.mHoverCardViewSwitcher
            r4.unselect()
        L35:
            return
    }

    public final void applySelectLevelToChild(androidx.leanback.widget.ListRowPresenter.ViewHolder r2, android.view.View r3) {
            r1 = this;
            androidx.leanback.widget.ShadowOverlayHelper r0 = r1.mShadowOverlayHelper
            if (r0 == 0) goto L19
            boolean r0 = r0.needsOverlay()
            if (r0 == 0) goto L19
            androidx.leanback.graphics.ColorOverlayDimmer r2 = r2.mColorDimmer
            android.graphics.Paint r2 = r2.getPaint()
            int r2 = r2.getColor()
            androidx.leanback.widget.ShadowOverlayHelper r0 = r1.mShadowOverlayHelper
            r0.setOverlayColor(r3, r2)
        L19:
            return
    }

    public final boolean areChildRoundedCornersEnabled() {
            r1 = this;
            boolean r0 = r1.mRoundedCornersEnabled
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final androidx.leanback.widget.RowPresenter.ViewHolder createRowViewHolder(android.view.ViewGroup r3) {
            r2 = this;
            android.content.Context r0 = r3.getContext()
            initStatics(r0)
            androidx.leanback.widget.ListRowView r0 = new androidx.leanback.widget.ListRowView
            android.content.Context r3 = r3.getContext()
            r0.<init>(r3)
            r2.setupFadingEffect(r0)
            int r3 = r2.mRowHeight
            if (r3 == 0) goto L20
            androidx.leanback.widget.HorizontalGridView r3 = r0.getGridView()
            int r1 = r2.mRowHeight
            r3.setRowHeight(r1)
        L20:
            androidx.leanback.widget.ListRowPresenter$ViewHolder r3 = new androidx.leanback.widget.ListRowPresenter$ViewHolder
            androidx.leanback.widget.HorizontalGridView r1 = r0.getGridView()
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void dispatchItemSelectedListener(androidx.leanback.widget.RowPresenter.ViewHolder r4, boolean r5) {
            r3 = this;
            r0 = r4
            androidx.leanback.widget.ListRowPresenter$ViewHolder r0 = (androidx.leanback.widget.ListRowPresenter.ViewHolder) r0
            androidx.leanback.widget.HorizontalGridView r1 = r0.mGridView
            int r2 = r1.getSelectedPosition()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r1.findViewHolderForPosition(r2)
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r1 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r1
            if (r1 != 0) goto L20
            if (r5 == 0) goto L1f
            androidx.leanback.widget.BaseOnItemViewSelectedListener r5 = r4.mOnItemViewSelectedListener
            if (r5 == 0) goto L1f
            java.lang.Object r0 = r4.getRowObject()
            r1 = 0
            r5.onItemSelected(r1, r1, r4, r0)
        L1f:
            return
        L20:
            if (r5 == 0) goto L39
            androidx.leanback.widget.BaseOnItemViewSelectedListener r5 = r4.getOnItemViewSelectedListener()
            if (r5 == 0) goto L39
            androidx.leanback.widget.BaseOnItemViewSelectedListener r4 = r4.getOnItemViewSelectedListener()
            androidx.leanback.widget.Presenter$ViewHolder r5 = r1.getViewHolder()
            java.lang.Object r1 = r1.mItem
            androidx.leanback.widget.Row r2 = r0.getRow()
            r4.onItemSelected(r5, r1, r0, r2)
        L39:
            return
    }

    public final void enableChildRoundedCorners(boolean r1) {
            r0 = this;
            r0.mRoundedCornersEnabled = r1
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void freeze(androidx.leanback.widget.RowPresenter.ViewHolder r3, boolean r4) {
            r2 = this;
            androidx.leanback.widget.ListRowPresenter$ViewHolder r3 = (androidx.leanback.widget.ListRowPresenter.ViewHolder) r3
            androidx.leanback.widget.HorizontalGridView r0 = r3.mGridView
            r1 = r4 ^ 1
            r0.setScrollEnabled(r1)
            androidx.leanback.widget.HorizontalGridView r3 = r3.mGridView
            r4 = r4 ^ 1
            r3.setAnimateChildLayout(r4)
            return
    }

    public int getExpandedRowHeight() {
            r1 = this;
            int r0 = r1.mExpandedRowHeight
            if (r0 == 0) goto L5
            goto L7
        L5:
            int r0 = r1.mRowHeight
        L7:
            return r0
    }

    public final int getFocusZoomFactor() {
            r1 = this;
            int r0 = r1.mFocusZoomFactor
            return r0
    }

    public final androidx.leanback.widget.PresenterSelector getHoverCardPresenterSelector() {
            r1 = this;
            androidx.leanback.widget.PresenterSelector r0 = r1.mHoverCardPresenterSelector
            return r0
    }

    public int getRecycledPoolSize(androidx.leanback.widget.Presenter r2) {
            r1 = this;
            java.util.HashMap<androidx.leanback.widget.Presenter, java.lang.Integer> r0 = r1.mRecycledPoolSize
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L15
            java.util.HashMap<androidx.leanback.widget.Presenter, java.lang.Integer> r0 = r1.mRecycledPoolSize
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L17
        L15:
            r2 = 24
        L17:
            return r2
    }

    public int getRowHeight() {
            r1 = this;
            int r0 = r1.mRowHeight
            return r0
    }

    public final boolean getShadowEnabled() {
            r1 = this;
            boolean r0 = r1.mShadowEnabled
            return r0
    }

    @java.lang.Deprecated
    public final int getZoomFactor() {
            r1 = this;
            int r0 = r1.mFocusZoomFactor
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void initializeRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r6) {
            r5 = this;
            super.initializeRowViewHolder(r6)
            r0 = r6
            androidx.leanback.widget.ListRowPresenter$ViewHolder r0 = (androidx.leanback.widget.ListRowPresenter.ViewHolder) r0
            android.view.View r6 = r6.view
            android.content.Context r6 = r6.getContext()
            androidx.leanback.widget.ShadowOverlayHelper r1 = r5.mShadowOverlayHelper
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L79
            androidx.leanback.widget.ShadowOverlayHelper$Builder r1 = new androidx.leanback.widget.ShadowOverlayHelper$Builder
            r1.<init>()
            boolean r4 = r5.isUsingDefaultListSelectEffect()
            if (r4 == 0) goto L25
            boolean r4 = r5.getSelectEffectEnabled()
            if (r4 == 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            androidx.leanback.widget.ShadowOverlayHelper$Builder r1 = r1.needsOverlay(r4)
            boolean r4 = r5.isUsingDefaultShadow()
            if (r4 == 0) goto L38
            boolean r4 = r5.getShadowEnabled()
            if (r4 == 0) goto L38
            r4 = 1
            goto L39
        L38:
            r4 = 0
        L39:
            androidx.leanback.widget.ShadowOverlayHelper$Builder r1 = r1.needsShadow(r4)
            boolean r4 = r5.isUsingOutlineClipping(r6)
            if (r4 == 0) goto L4b
            boolean r4 = r5.areChildRoundedCornersEnabled()
            if (r4 == 0) goto L4b
            r4 = 1
            goto L4c
        L4b:
            r4 = 0
        L4c:
            androidx.leanback.widget.ShadowOverlayHelper$Builder r1 = r1.needsRoundedCorner(r4)
            boolean r4 = r5.isUsingZOrder(r6)
            androidx.leanback.widget.ShadowOverlayHelper$Builder r1 = r1.preferZOrder(r4)
            boolean r4 = r5.mKeepChildForeground
            androidx.leanback.widget.ShadowOverlayHelper$Builder r1 = r1.keepForegroundDrawable(r4)
            androidx.leanback.widget.ShadowOverlayHelper$Options r4 = androidx.leanback.widget.ShadowOverlayHelper.Options.DEFAULT
            androidx.leanback.widget.ShadowOverlayHelper$Builder r1 = r1.options(r4)
            androidx.leanback.widget.ShadowOverlayHelper r6 = r1.build(r6)
            r5.mShadowOverlayHelper = r6
            boolean r6 = r6.needsWrapper()
            if (r6 == 0) goto L79
            androidx.leanback.widget.ItemBridgeAdapterShadowOverlayWrapper r6 = new androidx.leanback.widget.ItemBridgeAdapterShadowOverlayWrapper
            androidx.leanback.widget.ShadowOverlayHelper r1 = r5.mShadowOverlayHelper
            r6.<init>(r1)
            r5.mShadowOverlayWrapper = r6
        L79:
            androidx.leanback.widget.ListRowPresenter$ListRowPresenterItemBridgeAdapter r6 = new androidx.leanback.widget.ListRowPresenter$ListRowPresenterItemBridgeAdapter
            r6.<init>(r5, r0)
            r0.mItemBridgeAdapter = r6
            androidx.leanback.widget.ItemBridgeAdapter$Wrapper r1 = r5.mShadowOverlayWrapper
            r6.setWrapper(r1)
            androidx.leanback.widget.ShadowOverlayHelper r6 = r5.mShadowOverlayHelper
            androidx.leanback.widget.HorizontalGridView r1 = r0.mGridView
            r6.prepareParentForShadow(r1)
            androidx.leanback.widget.ItemBridgeAdapter r6 = r0.mItemBridgeAdapter
            int r1 = r5.mFocusZoomFactor
            boolean r4 = r5.mUseFocusDimmer
            androidx.leanback.widget.FocusHighlightHelper.setupBrowseItemFocusHighlight(r6, r1, r4)
            androidx.leanback.widget.HorizontalGridView r6 = r0.mGridView
            androidx.leanback.widget.ShadowOverlayHelper r1 = r5.mShadowOverlayHelper
            int r1 = r1.getShadowType()
            r4 = 3
            if (r1 == r4) goto La1
            r2 = 1
        La1:
            r6.setFocusDrawingOrderEnabled(r2)
            androidx.leanback.widget.HorizontalGridView r6 = r0.mGridView
            androidx.leanback.widget.ListRowPresenter$1 r1 = new androidx.leanback.widget.ListRowPresenter$1
            r1.<init>(r5, r0)
            r6.setOnChildSelectedListener(r1)
            androidx.leanback.widget.HorizontalGridView r6 = r0.mGridView
            androidx.leanback.widget.ListRowPresenter$2 r1 = new androidx.leanback.widget.ListRowPresenter$2
            r1.<init>(r0)
            r6.setOnUnhandledKeyListener(r1)
            androidx.leanback.widget.HorizontalGridView r6 = r0.mGridView
            int r0 = r5.mNumRows
            r6.setNumRows(r0)
            return
    }

    public final boolean isFocusDimmerUsed() {
            r1 = this;
            boolean r0 = r1.mUseFocusDimmer
            return r0
    }

    public final boolean isKeepChildForeground() {
            r1 = this;
            boolean r0 = r1.mKeepChildForeground
            return r0
    }

    public boolean isUsingDefaultListSelectEffect() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final boolean isUsingDefaultSelectEffect() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isUsingDefaultShadow() {
            r1 = this;
            boolean r0 = androidx.leanback.widget.ShadowOverlayHelper.supportsShadow()
            return r0
    }

    public boolean isUsingOutlineClipping(android.content.Context r1) {
            r0 = this;
            androidx.leanback.system.Settings r1 = androidx.leanback.system.Settings.getInstance(r1)
            boolean r1 = r1.isOutlineClippingDisabled()
            r1 = r1 ^ 1
            return r1
    }

    public boolean isUsingZOrder(android.content.Context r1) {
            r0 = this;
            androidx.leanback.system.Settings r1 = androidx.leanback.system.Settings.getInstance(r1)
            boolean r1 = r1.preferStaticShadows()
            r1 = r1 ^ 1
            return r1
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onBindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r3, java.lang.Object r4) {
            r2 = this;
            super.onBindRowViewHolder(r3, r4)
            androidx.leanback.widget.ListRowPresenter$ViewHolder r3 = (androidx.leanback.widget.ListRowPresenter.ViewHolder) r3
            androidx.leanback.widget.ListRow r4 = (androidx.leanback.widget.ListRow) r4
            androidx.leanback.widget.ItemBridgeAdapter r0 = r3.mItemBridgeAdapter
            androidx.leanback.widget.ObjectAdapter r1 = r4.getAdapter()
            r0.setAdapter(r1)
            androidx.leanback.widget.HorizontalGridView r0 = r3.mGridView
            androidx.leanback.widget.ItemBridgeAdapter r1 = r3.mItemBridgeAdapter
            r0.setAdapter(r1)
            androidx.leanback.widget.HorizontalGridView r3 = r3.mGridView
            java.lang.CharSequence r4 = r4.getContentDescription()
            r3.setContentDescription(r4)
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewExpanded(androidx.leanback.widget.RowPresenter.ViewHolder r3, boolean r4) {
            r2 = this;
            super.onRowViewExpanded(r3, r4)
            androidx.leanback.widget.ListRowPresenter$ViewHolder r3 = (androidx.leanback.widget.ListRowPresenter.ViewHolder) r3
            int r0 = r2.getRowHeight()
            int r1 = r2.getExpandedRowHeight()
            if (r0 == r1) goto L21
            if (r4 == 0) goto L16
            int r4 = r2.getExpandedRowHeight()
            goto L1a
        L16:
            int r4 = r2.getRowHeight()
        L1a:
            androidx.leanback.widget.HorizontalGridView r0 = r3.getGridView()
            r0.setRowHeight(r4)
        L21:
            r2.setVerticalPadding(r3)
            r2.updateFooterViewSwitcher(r3)
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewSelected(androidx.leanback.widget.RowPresenter.ViewHolder r1, boolean r2) {
            r0 = this;
            super.onRowViewSelected(r1, r2)
            androidx.leanback.widget.ListRowPresenter$ViewHolder r1 = (androidx.leanback.widget.ListRowPresenter.ViewHolder) r1
            r0.setVerticalPadding(r1)
            r0.updateFooterViewSwitcher(r1)
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onSelectLevelChanged(androidx.leanback.widget.RowPresenter.ViewHolder r4) {
            r3 = this;
            super.onSelectLevelChanged(r4)
            androidx.leanback.widget.ListRowPresenter$ViewHolder r4 = (androidx.leanback.widget.ListRowPresenter.ViewHolder) r4
            androidx.leanback.widget.HorizontalGridView r0 = r4.mGridView
            int r0 = r0.getChildCount()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1a
            androidx.leanback.widget.HorizontalGridView r2 = r4.mGridView
            android.view.View r2 = r2.getChildAt(r1)
            r3.applySelectLevelToChild(r4, r2)
            int r1 = r1 + 1
            goto Lc
        L1a:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onUnbindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r4) {
            r3 = this;
            r0 = r4
            androidx.leanback.widget.ListRowPresenter$ViewHolder r0 = (androidx.leanback.widget.ListRowPresenter.ViewHolder) r0
            androidx.leanback.widget.HorizontalGridView r1 = r0.mGridView
            r2 = 0
            r1.setAdapter(r2)
            androidx.leanback.widget.ItemBridgeAdapter r0 = r0.mItemBridgeAdapter
            r0.clear()
            super.onUnbindRowViewHolder(r4)
            return
    }

    public final void selectChildView(androidx.leanback.widget.ListRowPresenter.ViewHolder r5, android.view.View r6, boolean r7) {
            r4 = this;
            if (r6 == 0) goto L31
            boolean r0 = r5.mSelected
            if (r0 == 0) goto L4c
            androidx.leanback.widget.HorizontalGridView r0 = r5.mGridView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.getChildViewHolder(r6)
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r0 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r0
            androidx.leanback.widget.PresenterSelector r1 = r4.mHoverCardPresenterSelector
            if (r1 == 0) goto L1b
            androidx.leanback.widget.HorizontalHoverCardSwitcher r1 = r5.mHoverCardViewSwitcher
            androidx.leanback.widget.HorizontalGridView r2 = r5.mGridView
            java.lang.Object r3 = r0.mItem
            r1.select(r2, r6, r3)
        L1b:
            if (r7 == 0) goto L4c
            androidx.leanback.widget.BaseOnItemViewSelectedListener r6 = r5.getOnItemViewSelectedListener()
            if (r6 == 0) goto L4c
            androidx.leanback.widget.BaseOnItemViewSelectedListener r6 = r5.getOnItemViewSelectedListener()
            androidx.leanback.widget.Presenter$ViewHolder r7 = r0.mHolder
            java.lang.Object r0 = r0.mItem
            androidx.leanback.widget.Row r1 = r5.mRow
            r6.onItemSelected(r7, r0, r5, r1)
            goto L4c
        L31:
            androidx.leanback.widget.PresenterSelector r6 = r4.mHoverCardPresenterSelector
            if (r6 == 0) goto L3a
            androidx.leanback.widget.HorizontalHoverCardSwitcher r6 = r5.mHoverCardViewSwitcher
            r6.unselect()
        L3a:
            if (r7 == 0) goto L4c
            androidx.leanback.widget.BaseOnItemViewSelectedListener r6 = r5.getOnItemViewSelectedListener()
            if (r6 == 0) goto L4c
            androidx.leanback.widget.BaseOnItemViewSelectedListener r6 = r5.getOnItemViewSelectedListener()
            androidx.leanback.widget.Row r7 = r5.mRow
            r0 = 0
            r6.onItemSelected(r0, r0, r5, r7)
        L4c:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void setEntranceTransitionState(androidx.leanback.widget.RowPresenter.ViewHolder r1, boolean r2) {
            r0 = this;
            super.setEntranceTransitionState(r1, r2)
            androidx.leanback.widget.ListRowPresenter$ViewHolder r1 = (androidx.leanback.widget.ListRowPresenter.ViewHolder) r1
            androidx.leanback.widget.HorizontalGridView r1 = r1.mGridView
            if (r2 == 0) goto Lb
            r2 = 0
            goto Lc
        Lb:
            r2 = 4
        Lc:
            r1.setChildrenVisibility(r2)
            return
    }

    public void setExpandedRowHeight(int r1) {
            r0 = this;
            r0.mExpandedRowHeight = r1
            return
    }

    public final void setHoverCardPresenterSelector(androidx.leanback.widget.PresenterSelector r1) {
            r0 = this;
            r0.mHoverCardPresenterSelector = r1
            return
    }

    public final void setKeepChildForeground(boolean r1) {
            r0 = this;
            r0.mKeepChildForeground = r1
            return
    }

    public void setNumRows(int r1) {
            r0 = this;
            r0.mNumRows = r1
            return
    }

    public void setRecycledPoolSize(androidx.leanback.widget.Presenter r2, int r3) {
            r1 = this;
            java.util.HashMap<androidx.leanback.widget.Presenter, java.lang.Integer> r0 = r1.mRecycledPoolSize
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public void setRowHeight(int r1) {
            r0 = this;
            r0.mRowHeight = r1
            return
    }

    public final void setShadowEnabled(boolean r1) {
            r0 = this;
            r0.mShadowEnabled = r1
            return
    }
}
