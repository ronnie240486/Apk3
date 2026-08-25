package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class DetailsOverviewRowPresenter extends androidx.leanback.widget.RowPresenter {
    private static final long DEFAULT_TIMEOUT = 5000;
    private static final int MORE_ACTIONS_FADE_MS = 100;
    public androidx.leanback.widget.OnActionClickedListener mActionClickedListener;
    private int mBackgroundColor;
    private boolean mBackgroundColorSet;
    public final androidx.leanback.widget.Presenter mDetailsPresenter;
    private boolean mIsStyleLarge;
    private androidx.leanback.widget.DetailsOverviewSharedElementHelper mSharedElementHelper;


    public class ActionsItemBridgeAdapter extends androidx.leanback.widget.ItemBridgeAdapter {
        public androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder mViewHolder;
        public final /* synthetic */ androidx.leanback.widget.DetailsOverviewRowPresenter this$0;


        public ActionsItemBridgeAdapter(androidx.leanback.widget.DetailsOverviewRowPresenter r1, androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder r2) {
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
                androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r1 = r2.mViewHolder
                android.view.View$OnLayoutChangeListener r1 = r1.mLayoutChangeListener
                r0.removeOnLayoutChangeListener(r1)
                android.view.View r3 = r3.itemView
                androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r0 = r2.mViewHolder
                android.view.View$OnLayoutChangeListener r0 = r0.mLayoutChangeListener
                r3.addOnLayoutChangeListener(r0)
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onBind(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r4) {
                r3 = this;
                androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r0 = r3.mViewHolder
                androidx.leanback.widget.BaseOnItemViewClickedListener r0 = r0.getOnItemViewClickedListener()
                if (r0 != 0) goto Le
                androidx.leanback.widget.DetailsOverviewRowPresenter r0 = r3.this$0
                androidx.leanback.widget.OnActionClickedListener r0 = r0.mActionClickedListener
                if (r0 == 0) goto L1e
            Le:
                androidx.leanback.widget.Presenter r0 = r4.getPresenter()
                androidx.leanback.widget.Presenter$ViewHolder r1 = r4.getViewHolder()
                androidx.leanback.widget.DetailsOverviewRowPresenter$ActionsItemBridgeAdapter$1 r2 = new androidx.leanback.widget.DetailsOverviewRowPresenter$ActionsItemBridgeAdapter$1
                r2.<init>(r3, r4)
                r0.setOnClickListener(r1, r2)
            L1e:
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onDetachedFromWindow(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r2) {
                r1 = this;
                android.view.View r2 = r2.itemView
                androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r0 = r1.mViewHolder
                android.view.View$OnLayoutChangeListener r0 = r0.mLayoutChangeListener
                r2.removeOnLayoutChangeListener(r0)
                androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r2 = r1.mViewHolder
                r2.checkFirstAndLastPosition()
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onUnbind(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r3) {
                r2 = this;
                androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r0 = r2.mViewHolder
                androidx.leanback.widget.BaseOnItemViewClickedListener r0 = r0.getOnItemViewClickedListener()
                if (r0 != 0) goto Le
                androidx.leanback.widget.DetailsOverviewRowPresenter r0 = r2.this$0
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

    public final class ViewHolder extends androidx.leanback.widget.RowPresenter.ViewHolder {
        public androidx.leanback.widget.ItemBridgeAdapter mActionBridgeAdapter;
        public final androidx.leanback.widget.HorizontalGridView mActionsRow;
        public final androidx.leanback.widget.OnChildSelectedListener mChildSelectedListener;
        public final android.widget.FrameLayout mDetailsDescriptionFrame;
        public final androidx.leanback.widget.Presenter.ViewHolder mDetailsDescriptionViewHolder;
        public final android.os.Handler mHandler;
        public final android.widget.ImageView mImageView;
        public final android.view.View.OnLayoutChangeListener mLayoutChangeListener;
        public final androidx.leanback.widget.DetailsOverviewRow.Listener mListener;
        public int mNumItems;
        public final android.widget.FrameLayout mOverviewFrame;
        public final android.view.ViewGroup mOverviewView;
        public final android.view.ViewGroup mRightPanel;
        public boolean mShowMoreLeft;
        public boolean mShowMoreRight;
        public final java.lang.Runnable mUpdateDrawableCallback;
        public final /* synthetic */ androidx.leanback.widget.DetailsOverviewRowPresenter this$0;






        public ViewHolder(androidx.leanback.widget.DetailsOverviewRowPresenter r5, android.view.View r6, androidx.leanback.widget.Presenter r7) {
                r4 = this;
                r4.this$0 = r5
                r4.<init>(r6)
                android.os.Handler r5 = new android.os.Handler
                r5.<init>()
                r4.mHandler = r5
                androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder$1 r5 = new androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder$1
                r5.<init>(r4)
                r4.mUpdateDrawableCallback = r5
                androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder$2 r5 = new androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder$2
                r5.<init>(r4)
                r4.mListener = r5
                androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder$3 r5 = new androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder$3
                r5.<init>(r4)
                r4.mLayoutChangeListener = r5
                androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder$4 r5 = new androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder$4
                r5.<init>(r4)
                r4.mChildSelectedListener = r5
                androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder$5 r0 = new androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder$5
                r0.<init>(r4)
                int r1 = androidx.leanback.R.id.details_frame
                android.view.View r1 = r6.findViewById(r1)
                android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
                r4.mOverviewFrame = r1
                int r1 = androidx.leanback.R.id.details_overview
                android.view.View r1 = r6.findViewById(r1)
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r4.mOverviewView = r1
                int r1 = androidx.leanback.R.id.details_overview_image
                android.view.View r1 = r6.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r4.mImageView = r1
                int r1 = androidx.leanback.R.id.details_overview_right_panel
                android.view.View r1 = r6.findViewById(r1)
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r4.mRightPanel = r1
                int r2 = androidx.leanback.R.id.details_overview_description
                android.view.View r2 = r1.findViewById(r2)
                android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
                r4.mDetailsDescriptionFrame = r2
                int r3 = androidx.leanback.R.id.details_overview_actions
                android.view.View r1 = r1.findViewById(r3)
                androidx.leanback.widget.HorizontalGridView r1 = (androidx.leanback.widget.HorizontalGridView) r1
                r4.mActionsRow = r1
                r3 = 0
                r1.setHasOverlappingRendering(r3)
                r1.setOnScrollListener(r0)
                androidx.leanback.widget.ItemBridgeAdapter r0 = r4.mActionBridgeAdapter
                r1.setAdapter(r0)
                r1.setOnChildSelectedListener(r5)
                android.content.res.Resources r5 = r6.getResources()
                int r6 = androidx.leanback.R.dimen.lb_details_overview_actions_fade_size
                int r5 = r5.getDimensionPixelSize(r6)
                r1.setFadingRightEdgeLength(r5)
                r1.setFadingLeftEdgeLength(r5)
                androidx.leanback.widget.Presenter$ViewHolder r5 = r7.onCreateViewHolder(r2)
                r4.mDetailsDescriptionViewHolder = r5
                android.view.View r5 = r5.view
                r2.addView(r5)
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

        private void showMoreLeft(boolean r2) {
                r1 = this;
                boolean r0 = r1.mShowMoreLeft
                if (r2 == r0) goto Lb
                androidx.leanback.widget.HorizontalGridView r0 = r1.mActionsRow
                r0.setFadingLeftEdge(r2)
                r1.mShowMoreLeft = r2
            Lb:
                return
        }

        private void showMoreRight(boolean r2) {
                r1 = this;
                boolean r0 = r1.mShowMoreRight
                if (r2 == r0) goto Lb
                androidx.leanback.widget.HorizontalGridView r0 = r1.mActionsRow
                r0.setFadingRightEdge(r2)
                r1.mShowMoreRight = r2
            Lb:
                return
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
                r2 = 0
                r1.mShowMoreRight = r2
                r0 = 1
                r1.mShowMoreLeft = r0
                r1.showMoreLeft(r2)
                return
        }

        public final void checkFirstAndLastPosition() {
                r4 = this;
                androidx.leanback.widget.HorizontalGridView r0 = r4.mActionsRow
                int r1 = r4.mNumItems
                r2 = 1
                int r1 = r1 - r2
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.findViewHolderForPosition(r1)
                r1 = 0
                if (r0 == 0) goto L1e
                android.view.View r0 = r0.itemView
                int r0 = r0.getRight()
                androidx.leanback.widget.HorizontalGridView r3 = r4.mActionsRow
                int r3 = r3.getWidth()
                if (r0 <= r3) goto L1c
                goto L1e
            L1c:
                r0 = 0
                goto L1f
            L1e:
                r0 = 1
            L1f:
                androidx.leanback.widget.HorizontalGridView r3 = r4.mActionsRow
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r3.findViewHolderForPosition(r1)
                if (r3 == 0) goto L31
                android.view.View r3 = r3.itemView
                int r3 = r3.getLeft()
                if (r3 >= 0) goto L30
                goto L31
            L30:
                r2 = 0
            L31:
                r4.showMoreRight(r0)
                r4.showMoreLeft(r2)
                return
        }

        public final void dispatchItemSelection(android.view.View r4) {
                r3 = this;
                boolean r0 = r3.isSelected()
                if (r0 != 0) goto L7
                return
            L7:
                if (r4 == 0) goto L10
                androidx.leanback.widget.HorizontalGridView r0 = r3.mActionsRow
                androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r0.getChildViewHolder(r4)
                goto L1a
            L10:
                androidx.leanback.widget.HorizontalGridView r4 = r3.mActionsRow
                int r0 = r4.getSelectedPosition()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r4.findViewHolderForPosition(r0)
            L1a:
                androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r4 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r4
                if (r4 != 0) goto L31
                androidx.leanback.widget.BaseOnItemViewSelectedListener r4 = r3.getOnItemViewSelectedListener()
                if (r4 == 0) goto L4a
                androidx.leanback.widget.BaseOnItemViewSelectedListener r4 = r3.getOnItemViewSelectedListener()
                androidx.leanback.widget.Row r0 = r3.getRow()
                r1 = 0
                r4.onItemSelected(r1, r1, r3, r0)
                goto L4a
            L31:
                androidx.leanback.widget.BaseOnItemViewSelectedListener r0 = r3.getOnItemViewSelectedListener()
                if (r0 == 0) goto L4a
                androidx.leanback.widget.BaseOnItemViewSelectedListener r0 = r3.getOnItemViewSelectedListener()
                androidx.leanback.widget.Presenter$ViewHolder r1 = r4.getViewHolder()
                java.lang.Object r4 = r4.getItem()
                androidx.leanback.widget.Row r2 = r3.getRow()
                r0.onItemSelected(r1, r4, r3, r2)
            L4a:
                return
        }
    }

    public DetailsOverviewRowPresenter(androidx.leanback.widget.Presenter r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mBackgroundColor = r0
            r1 = 1
            r2.mIsStyleLarge = r1
            r1 = 0
            r2.setHeaderPresenter(r1)
            r2.setSelectEffectEnabled(r0)
            r2.mDetailsPresenter = r3
            return
    }

    private int getCardHeight(android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.mIsStyleLarge
            if (r0 == 0) goto L7
            int r0 = androidx.leanback.R.dimen.lb_details_overview_height_large
            goto L9
        L7:
            int r0 = androidx.leanback.R.dimen.lb_details_overview_height_small
        L9:
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getDimensionPixelSize(r0)
            return r2
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

    private void initDetailsOverview(androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder r4) {
            r3 = this;
            androidx.leanback.widget.DetailsOverviewRowPresenter$ActionsItemBridgeAdapter r0 = new androidx.leanback.widget.DetailsOverviewRowPresenter$ActionsItemBridgeAdapter
            r0.<init>(r3, r4)
            r4.mActionBridgeAdapter = r0
            android.widget.FrameLayout r0 = r4.mOverviewFrame
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.content.Context r2 = r0.getContext()
            int r2 = r3.getCardHeight(r2)
            r1.height = r2
            r0.setLayoutParams(r1)
            boolean r0 = r3.getSelectEffectEnabled()
            if (r0 != 0) goto L26
            android.widget.FrameLayout r0 = r4.mOverviewFrame
            r1 = 0
            r0.setForeground(r1)
        L26:
            androidx.leanback.widget.HorizontalGridView r0 = r4.mActionsRow
            androidx.leanback.widget.DetailsOverviewRowPresenter$1 r1 = new androidx.leanback.widget.DetailsOverviewRowPresenter$1
            r1.<init>(r4)
            r0.setOnUnhandledKeyListener(r1)
            return
    }

    public final void bindImageDrawable(androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder r14) {
            r13 = this;
            androidx.leanback.widget.Row r0 = r14.getRow()
            androidx.leanback.widget.DetailsOverviewRow r0 = (androidx.leanback.widget.DetailsOverviewRow) r0
            android.widget.ImageView r1 = r14.mImageView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            android.widget.ImageView r2 = r14.mImageView
            android.content.Context r2 = r2.getContext()
            int r2 = r13.getCardHeight(r2)
            android.widget.ImageView r3 = r14.mImageView
            android.content.res.Resources r3 = r3.getResources()
            int r4 = androidx.leanback.R.dimen.lb_details_overview_image_margin_vertical
            int r3 = r3.getDimensionPixelSize(r4)
            android.widget.ImageView r4 = r14.mImageView
            android.content.res.Resources r4 = r4.getResources()
            int r5 = androidx.leanback.R.dimen.lb_details_overview_image_margin_horizontal
            int r4 = r4.getDimensionPixelSize(r5)
            android.graphics.drawable.Drawable r5 = r0.getImageDrawable()
            int r5 = getNonNegativeWidth(r5)
            android.graphics.drawable.Drawable r6 = r0.getImageDrawable()
            int r6 = getNonNegativeHeight(r6)
            boolean r7 = r0.isImageScaleUpAllowed()
            android.graphics.drawable.Drawable r8 = r0.getImageDrawable()
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L7a
            if (r5 <= r6) goto L57
            boolean r8 = r13.mIsStyleLarge
            if (r8 == 0) goto L55
            r8 = 1
            r11 = 1
            goto L59
        L55:
            r8 = 1
            goto L58
        L57:
            r8 = 0
        L58:
            r11 = 0
        L59:
            if (r8 == 0) goto L5d
            if (r5 > r2) goto L61
        L5d:
            if (r8 != 0) goto L62
            if (r6 <= r2) goto L62
        L61:
            r7 = 1
        L62:
            if (r7 != 0) goto L65
            r11 = 1
        L65:
            if (r11 == 0) goto L7b
            if (r7 != 0) goto L7b
            if (r8 == 0) goto L71
            int r12 = r2 - r4
            if (r5 <= r12) goto L71
        L6f:
            r7 = 1
            goto L7b
        L71:
            if (r8 != 0) goto L7b
            int r8 = r3 * 2
            int r8 = r2 - r8
            if (r6 <= r8) goto L7b
            goto L6f
        L7a:
            r11 = 0
        L7b:
            boolean r6 = r13.mBackgroundColorSet
            if (r6 == 0) goto L82
            int r6 = r13.mBackgroundColor
            goto L8c
        L82:
            android.view.ViewGroup r6 = r14.mOverviewView
            android.content.Context r6 = r6.getContext()
            int r6 = r13.getDefaultBackgroundColor(r6)
        L8c:
            r8 = 0
            if (r11 == 0) goto La6
            r1.setMarginStart(r4)
            r1.bottomMargin = r3
            r1.topMargin = r3
            android.widget.FrameLayout r3 = r14.mOverviewFrame
            r3.setBackgroundColor(r6)
            android.view.ViewGroup r3 = r14.mRightPanel
            r3.setBackground(r8)
            android.widget.ImageView r3 = r14.mImageView
            r3.setBackground(r8)
            goto Lbb
        La6:
            r1.bottomMargin = r9
            r1.topMargin = r9
            r1.leftMargin = r9
            android.view.ViewGroup r3 = r14.mRightPanel
            r3.setBackgroundColor(r6)
            android.widget.ImageView r3 = r14.mImageView
            r3.setBackgroundColor(r6)
            android.widget.FrameLayout r3 = r14.mOverviewFrame
            r3.setBackground(r8)
        Lbb:
            android.widget.FrameLayout r3 = r14.mOverviewFrame
            androidx.leanback.widget.RoundedRectHelper.setClipToRoundedOutline(r3, r10)
            r3 = -2
            if (r7 == 0) goto Lda
            android.widget.ImageView r4 = r14.mImageView
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_START
            r4.setScaleType(r5)
            android.widget.ImageView r4 = r14.mImageView
            r4.setAdjustViewBounds(r10)
            android.widget.ImageView r4 = r14.mImageView
            r4.setMaxWidth(r2)
            r2 = -1
            r1.height = r2
            r1.width = r3
            goto Lee
        Lda:
            android.widget.ImageView r4 = r14.mImageView
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER
            r4.setScaleType(r6)
            android.widget.ImageView r4 = r14.mImageView
            r4.setAdjustViewBounds(r9)
            r1.height = r3
            int r2 = java.lang.Math.min(r2, r5)
            r1.width = r2
        Lee:
            android.widget.ImageView r2 = r14.mImageView
            r2.setLayoutParams(r1)
            android.widget.ImageView r1 = r14.mImageView
            android.graphics.drawable.Drawable r2 = r0.getImageDrawable()
            r1.setImageDrawable(r2)
            android.graphics.drawable.Drawable r0 = r0.getImageDrawable()
            if (r0 == 0) goto L127
            androidx.leanback.widget.DetailsOverviewSharedElementHelper r0 = r13.mSharedElementHelper
            if (r0 == 0) goto L127
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r1 = r0.mViewHolder
            if (r1 == 0) goto L10f
            android.widget.FrameLayout r1 = r1.mOverviewFrame
            androidx.core.view.ViewCompat.setTransitionName(r1, r8)
        L10f:
            r0.mViewHolder = r14
            android.view.ViewGroup r14 = r14.mRightPanel
            androidx.leanback.widget.DetailsOverviewSharedElementHelper$1 r1 = new androidx.leanback.widget.DetailsOverviewSharedElementHelper$1
            r1.<init>(r0)
            r14.addOnLayoutChangeListener(r1)
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r14 = r0.mViewHolder
            android.view.ViewGroup r14 = r14.mRightPanel
            androidx.leanback.widget.DetailsOverviewSharedElementHelper$2 r1 = new androidx.leanback.widget.DetailsOverviewSharedElementHelper$2
            r1.<init>(r0)
            r14.postOnAnimation(r1)
        L127:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final androidx.leanback.widget.RowPresenter.ViewHolder createRowViewHolder(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.leanback.R.layout.lb_details_overview
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r0 = new androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder
            androidx.leanback.widget.Presenter r1 = r3.mDetailsPresenter
            r0.<init>(r3, r4, r1)
            r3.initDetailsOverview(r0)
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
            androidx.leanback.widget.OnActionClickedListener r0 = r1.mActionClickedListener
            return r0
    }

    public boolean isStyleLarge() {
            r1 = this;
            boolean r0 = r1.mIsStyleLarge
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final boolean isUsingDefaultSelectEffect() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onBindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r4, java.lang.Object r5) {
            r3 = this;
            super.onBindRowViewHolder(r4, r5)
            androidx.leanback.widget.DetailsOverviewRow r5 = (androidx.leanback.widget.DetailsOverviewRow) r5
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r4 = (androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder) r4
            r3.bindImageDrawable(r4)
            androidx.leanback.widget.Presenter r0 = r3.mDetailsPresenter
            androidx.leanback.widget.Presenter$ViewHolder r1 = r4.mDetailsDescriptionViewHolder
            java.lang.Object r2 = r5.getItem()
            r0.onBindViewHolder(r1, r2)
            androidx.leanback.widget.ObjectAdapter r0 = r5.getActionsAdapter()
            r4.bindActions(r0)
            androidx.leanback.widget.DetailsOverviewRow$Listener r4 = r4.mListener
            r5.addListener(r4)
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewAttachedToWindow(androidx.leanback.widget.RowPresenter.ViewHolder r2) {
            r1 = this;
            super.onRowViewAttachedToWindow(r2)
            androidx.leanback.widget.Presenter r0 = r1.mDetailsPresenter
            if (r0 == 0) goto Le
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r2 = (androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder) r2
            androidx.leanback.widget.Presenter$ViewHolder r2 = r2.mDetailsDescriptionViewHolder
            r0.onViewAttachedToWindow(r2)
        Le:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewDetachedFromWindow(androidx.leanback.widget.RowPresenter.ViewHolder r2) {
            r1 = this;
            super.onRowViewDetachedFromWindow(r2)
            androidx.leanback.widget.Presenter r0 = r1.mDetailsPresenter
            if (r0 == 0) goto Le
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r2 = (androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder) r2
            androidx.leanback.widget.Presenter$ViewHolder r2 = r2.mDetailsDescriptionViewHolder
            r0.onViewDetachedFromWindow(r2)
        Le:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewSelected(androidx.leanback.widget.RowPresenter.ViewHolder r1, boolean r2) {
            r0 = this;
            super.onRowViewSelected(r1, r2)
            if (r2 == 0) goto Lb
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r1 = (androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder) r1
            r2 = 0
            r1.dispatchItemSelection(r2)
        Lb:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onSelectLevelChanged(androidx.leanback.widget.RowPresenter.ViewHolder r2) {
            r1 = this;
            super.onSelectLevelChanged(r2)
            boolean r0 = r1.getSelectEffectEnabled()
            if (r0 == 0) goto L24
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r2 = (androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder) r2
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
            androidx.leanback.widget.DetailsOverviewRowPresenter$ViewHolder r0 = (androidx.leanback.widget.DetailsOverviewRowPresenter.ViewHolder) r0
            androidx.leanback.widget.Row r1 = r0.getRow()
            androidx.leanback.widget.DetailsOverviewRow r1 = (androidx.leanback.widget.DetailsOverviewRow) r1
            androidx.leanback.widget.DetailsOverviewRow$Listener r2 = r0.mListener
            r1.removeListener(r2)
            androidx.leanback.widget.Presenter$ViewHolder r0 = r0.mDetailsDescriptionViewHolder
            if (r0 == 0) goto L17
            androidx.leanback.widget.Presenter r1 = r3.mDetailsPresenter
            r1.onUnbindViewHolder(r0)
        L17:
            super.onUnbindRowViewHolder(r4)
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
            r0.mActionClickedListener = r1
            return
    }

    public final void setSharedElementEnterTransition(android.app.Activity r3, java.lang.String r4) {
            r2 = this;
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.setSharedElementEnterTransition(r3, r4, r0)
            return
    }

    public final void setSharedElementEnterTransition(android.app.Activity r4, java.lang.String r5, long r6) {
            r3 = this;
            androidx.leanback.widget.DetailsOverviewSharedElementHelper r0 = r3.mSharedElementHelper
            if (r0 != 0) goto Lb
            androidx.leanback.widget.DetailsOverviewSharedElementHelper r0 = new androidx.leanback.widget.DetailsOverviewSharedElementHelper
            r0.<init>()
            r3.mSharedElementHelper = r0
        Lb:
            androidx.leanback.widget.DetailsOverviewSharedElementHelper r0 = r3.mSharedElementHelper
            java.util.Objects.requireNonNull(r0)
            if (r4 != 0) goto L18
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L21
        L18:
            if (r4 == 0) goto L27
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L21
            goto L27
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L27:
            android.app.Activity r1 = r0.mActivityToRunTransition
            if (r4 != r1) goto L34
            java.lang.String r1 = r0.mSharedElementName
            boolean r1 = android.text.TextUtils.equals(r5, r1)
            if (r1 == 0) goto L34
            goto L5b
        L34:
            android.app.Activity r1 = r0.mActivityToRunTransition
            if (r1 == 0) goto L3c
            r2 = 0
            androidx.core.app.ActivityCompat.setEnterSharedElementCallback(r1, r2)
        L3c:
            r0.mActivityToRunTransition = r4
            r0.mSharedElementName = r5
            androidx.core.app.ActivityCompat.setEnterSharedElementCallback(r4, r0)
            android.app.Activity r4 = r0.mActivityToRunTransition
            androidx.core.app.ActivityCompat.postponeEnterTransition(r4)
            r4 = 0
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L5b
            android.os.Handler r4 = new android.os.Handler
            r4.<init>()
            androidx.leanback.widget.DetailsOverviewSharedElementHelper$TransitionTimeOutRunnable r5 = new androidx.leanback.widget.DetailsOverviewSharedElementHelper$TransitionTimeOutRunnable
            r5.<init>(r0)
            r4.postDelayed(r5, r6)
        L5b:
            return
    }

    public void setStyleLarge(boolean r1) {
            r0 = this;
            r0.mIsStyleLarge = r1
            return
    }
}
