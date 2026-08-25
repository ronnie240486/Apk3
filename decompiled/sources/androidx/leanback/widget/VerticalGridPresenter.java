package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
public class VerticalGridPresenter extends androidx.leanback.widget.Presenter {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "GridPresenter";
    private int mFocusZoomFactor;
    private boolean mKeepChildForeground;
    private int mNumColumns;
    private androidx.leanback.widget.OnItemViewClickedListener mOnItemViewClickedListener;
    private androidx.leanback.widget.OnItemViewSelectedListener mOnItemViewSelectedListener;
    private boolean mRoundedCornersEnabled;
    private boolean mShadowEnabled;
    public androidx.leanback.widget.ShadowOverlayHelper mShadowOverlayHelper;
    private androidx.leanback.widget.ItemBridgeAdapter.Wrapper mShadowOverlayWrapper;
    private boolean mUseFocusDimmer;


    public class VerticalGridItemBridgeAdapter extends androidx.leanback.widget.ItemBridgeAdapter {
        public final /* synthetic */ androidx.leanback.widget.VerticalGridPresenter this$0;


        public VerticalGridItemBridgeAdapter(androidx.leanback.widget.VerticalGridPresenter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onAttachedToWindow(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r2) {
                r1 = this;
                android.view.View r2 = r2.itemView
                r0 = 1
                r2.setActivated(r0)
                return
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter
        public void onBind(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r3) {
                r2 = this;
                androidx.leanback.widget.VerticalGridPresenter r0 = r2.this$0
                androidx.leanback.widget.OnItemViewClickedListener r0 = r0.getOnItemViewClickedListener()
                if (r0 == 0) goto L14
                androidx.leanback.widget.Presenter$ViewHolder r0 = r3.mHolder
                android.view.View r0 = r0.view
                androidx.leanback.widget.VerticalGridPresenter$VerticalGridItemBridgeAdapter$1 r1 = new androidx.leanback.widget.VerticalGridPresenter$VerticalGridItemBridgeAdapter$1
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
                androidx.leanback.widget.VerticalGridPresenter r0 = r2.this$0
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
                androidx.leanback.widget.VerticalGridPresenter r0 = r1.this$0
                androidx.leanback.widget.OnItemViewClickedListener r0 = r0.getOnItemViewClickedListener()
                if (r0 == 0) goto L10
                androidx.leanback.widget.Presenter$ViewHolder r2 = r2.mHolder
                android.view.View r2 = r2.view
                r0 = 0
                r2.setOnClickListener(r0)
            L10:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ViewHolder extends androidx.leanback.widget.Presenter.ViewHolder {
        public final androidx.leanback.widget.VerticalGridView mGridView;
        public boolean mInitialized;
        public androidx.leanback.widget.ItemBridgeAdapter mItemBridgeAdapter;

        public ViewHolder(androidx.leanback.widget.VerticalGridView r1) {
                r0 = this;
                r0.<init>(r1)
                r0.mGridView = r1
                return
        }

        public androidx.leanback.widget.VerticalGridView getGridView() {
                r1 = this;
                androidx.leanback.widget.VerticalGridView r0 = r1.mGridView
                return r0
        }
    }

    public VerticalGridPresenter() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    public VerticalGridPresenter(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public VerticalGridPresenter(int r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mNumColumns = r0
            r0 = 1
            r1.mShadowEnabled = r0
            r1.mKeepChildForeground = r0
            r1.mRoundedCornersEnabled = r0
            r1.mFocusZoomFactor = r2
            r1.mUseFocusDimmer = r3
            return
    }

    public final boolean areChildRoundedCornersEnabled() {
            r1 = this;
            boolean r0 = r1.mRoundedCornersEnabled
            return r0
    }

    public final void enableChildRoundedCorners(boolean r1) {
            r0 = this;
            r0.mRoundedCornersEnabled = r1
            return
    }

    public final int getFocusZoomFactor() {
            r1 = this;
            int r0 = r1.mFocusZoomFactor
            return r0
    }

    public final boolean getKeepChildForeground() {
            r1 = this;
            boolean r0 = r1.mKeepChildForeground
            return r0
    }

    public int getNumberOfColumns() {
            r1 = this;
            int r0 = r1.mNumColumns
            return r0
    }

    public final androidx.leanback.widget.OnItemViewClickedListener getOnItemViewClickedListener() {
            r1 = this;
            androidx.leanback.widget.OnItemViewClickedListener r0 = r1.mOnItemViewClickedListener
            return r0
    }

    public final androidx.leanback.widget.OnItemViewSelectedListener getOnItemViewSelectedListener() {
            r1 = this;
            androidx.leanback.widget.OnItemViewSelectedListener r0 = r1.mOnItemViewSelectedListener
            return r0
    }

    public final boolean getShadowEnabled() {
            r1 = this;
            boolean r0 = r1.mShadowEnabled
            return r0
    }

    public final boolean isFocusDimmerUsed() {
            r1 = this;
            boolean r0 = r1.mUseFocusDimmer
            return r0
    }

    public boolean isUsingDefaultShadow() {
            r1 = this;
            boolean r0 = androidx.leanback.widget.ShadowOverlayHelper.supportsShadow()
            return r0
    }

    public boolean isUsingZOrder(android.content.Context r1) {
            r0 = this;
            androidx.leanback.system.Settings r1 = androidx.leanback.system.Settings.getInstance(r1)
            boolean r1 = r1.preferStaticShadows()
            r1 = r1 ^ 1
            return r1
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r2, java.lang.Object r3) {
            r1 = this;
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r2 = (androidx.leanback.widget.VerticalGridPresenter.ViewHolder) r2
            androidx.leanback.widget.ItemBridgeAdapter r0 = r2.mItemBridgeAdapter
            androidx.leanback.widget.ObjectAdapter r3 = (androidx.leanback.widget.ObjectAdapter) r3
            r0.setAdapter(r3)
            androidx.leanback.widget.VerticalGridView r3 = r2.getGridView()
            androidx.leanback.widget.ItemBridgeAdapter r2 = r2.mItemBridgeAdapter
            r3.setAdapter(r2)
            return
    }

    @Override // androidx.leanback.widget.Presenter
    public /* bridge */ /* synthetic */ androidx.leanback.widget.Presenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r1) {
            r0 = this;
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r1 = r0.onCreateViewHolder(r1)
            return r1
    }

    @Override // androidx.leanback.widget.Presenter
    public final androidx.leanback.widget.VerticalGridPresenter.ViewHolder onCreateViewHolder(android.view.ViewGroup r6) {
            r5 = this;
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.leanback.R.layout.lb_vertical_grid
            r2 = 0
            android.view.View r6 = r0.inflate(r1, r6, r2)
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r0 = new androidx.leanback.widget.VerticalGridPresenter$ViewHolder
            int r1 = androidx.leanback.R.id.browse_grid
            android.view.View r6 = r6.findViewById(r1)
            androidx.leanback.widget.VerticalGridView r6 = (androidx.leanback.widget.VerticalGridView) r6
            r0.<init>(r6)
            r0.mInitialized = r2
            androidx.leanback.widget.VerticalGridPresenter$VerticalGridItemBridgeAdapter r6 = new androidx.leanback.widget.VerticalGridPresenter$VerticalGridItemBridgeAdapter
            r6.<init>(r5)
            r0.mItemBridgeAdapter = r6
            int r6 = r5.mNumColumns
            r1 = -1
            if (r6 == r1) goto Ld1
            androidx.leanback.widget.VerticalGridView r6 = r0.getGridView()
            int r1 = r5.mNumColumns
            r6.setNumColumns(r1)
            r6 = 1
            r0.mInitialized = r6
            androidx.leanback.widget.VerticalGridView r1 = r0.mGridView
            android.content.Context r1 = r1.getContext()
            androidx.leanback.widget.ShadowOverlayHelper r3 = r5.mShadowOverlayHelper
            if (r3 != 0) goto L8f
            androidx.leanback.widget.ShadowOverlayHelper$Builder r3 = new androidx.leanback.widget.ShadowOverlayHelper$Builder
            r3.<init>()
            boolean r4 = r5.mUseFocusDimmer
            androidx.leanback.widget.ShadowOverlayHelper$Builder r3 = r3.needsOverlay(r4)
            boolean r4 = r5.isUsingDefaultShadow()
            if (r4 == 0) goto L59
            boolean r4 = r5.getShadowEnabled()
            if (r4 == 0) goto L59
            r4 = 1
            goto L5a
        L59:
            r4 = 0
        L5a:
            androidx.leanback.widget.ShadowOverlayHelper$Builder r3 = r3.needsShadow(r4)
            boolean r4 = r5.areChildRoundedCornersEnabled()
            androidx.leanback.widget.ShadowOverlayHelper$Builder r3 = r3.needsRoundedCorner(r4)
            boolean r4 = r5.isUsingZOrder(r1)
            androidx.leanback.widget.ShadowOverlayHelper$Builder r3 = r3.preferZOrder(r4)
            boolean r4 = r5.mKeepChildForeground
            androidx.leanback.widget.ShadowOverlayHelper$Builder r3 = r3.keepForegroundDrawable(r4)
            androidx.leanback.widget.ShadowOverlayHelper$Options r4 = androidx.leanback.widget.ShadowOverlayHelper.Options.DEFAULT
            androidx.leanback.widget.ShadowOverlayHelper$Builder r3 = r3.options(r4)
            androidx.leanback.widget.ShadowOverlayHelper r1 = r3.build(r1)
            r5.mShadowOverlayHelper = r1
            boolean r1 = r1.needsWrapper()
            if (r1 == 0) goto L8f
            androidx.leanback.widget.ItemBridgeAdapterShadowOverlayWrapper r1 = new androidx.leanback.widget.ItemBridgeAdapterShadowOverlayWrapper
            androidx.leanback.widget.ShadowOverlayHelper r3 = r5.mShadowOverlayHelper
            r1.<init>(r3)
            r5.mShadowOverlayWrapper = r1
        L8f:
            androidx.leanback.widget.ItemBridgeAdapter r1 = r0.mItemBridgeAdapter
            androidx.leanback.widget.ItemBridgeAdapter$Wrapper r3 = r5.mShadowOverlayWrapper
            r1.setWrapper(r3)
            androidx.leanback.widget.ShadowOverlayHelper r1 = r5.mShadowOverlayHelper
            androidx.leanback.widget.VerticalGridView r3 = r0.mGridView
            r1.prepareParentForShadow(r3)
            androidx.leanback.widget.VerticalGridView r1 = r0.getGridView()
            androidx.leanback.widget.ShadowOverlayHelper r3 = r5.mShadowOverlayHelper
            int r3 = r3.getShadowType()
            r4 = 3
            if (r3 == r4) goto Lab
            r2 = 1
        Lab:
            r1.setFocusDrawingOrderEnabled(r2)
            androidx.leanback.widget.ItemBridgeAdapter r6 = r0.mItemBridgeAdapter
            int r1 = r5.mFocusZoomFactor
            boolean r2 = r5.mUseFocusDimmer
            androidx.leanback.widget.FocusHighlightHelper.setupBrowseItemFocusHighlight(r6, r1, r2)
            androidx.leanback.widget.VerticalGridView r6 = r0.getGridView()
            androidx.leanback.widget.VerticalGridPresenter$1 r1 = new androidx.leanback.widget.VerticalGridPresenter$1
            r1.<init>(r5, r0)
            r6.setOnChildSelectedListener(r1)
            boolean r6 = r0.mInitialized
            if (r6 == 0) goto Lc8
            return r0
        Lc8:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "super.initializeGridViewHolder() must be called"
            r6.<init>(r0)
            throw r6
        Ld1:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Number of columns must be set"
            r6.<init>(r0)
            throw r6
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(androidx.leanback.widget.Presenter.ViewHolder r3) {
            r2 = this;
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r3 = (androidx.leanback.widget.VerticalGridPresenter.ViewHolder) r3
            androidx.leanback.widget.ItemBridgeAdapter r0 = r3.mItemBridgeAdapter
            r1 = 0
            r0.setAdapter(r1)
            androidx.leanback.widget.VerticalGridView r3 = r3.getGridView()
            r3.setAdapter(r1)
            return
    }

    public void setEntranceTransitionState(androidx.leanback.widget.VerticalGridPresenter.ViewHolder r1, boolean r2) {
            r0 = this;
            androidx.leanback.widget.VerticalGridView r1 = r1.mGridView
            if (r2 == 0) goto L6
            r2 = 0
            goto L7
        L6:
            r2 = 4
        L7:
            r1.setChildrenVisibility(r2)
            return
    }

    public final void setKeepChildForeground(boolean r1) {
            r0 = this;
            r0.mKeepChildForeground = r1
            return
    }

    public void setNumberOfColumns(int r2) {
            r1 = this;
            if (r2 < 0) goto L9
            int r0 = r1.mNumColumns
            if (r0 == r2) goto L8
            r1.mNumColumns = r2
        L8:
            return
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid number of columns"
            r2.<init>(r0)
            throw r2
    }

    public final void setOnItemViewClickedListener(androidx.leanback.widget.OnItemViewClickedListener r1) {
            r0 = this;
            r0.mOnItemViewClickedListener = r1
            return
    }

    public final void setOnItemViewSelectedListener(androidx.leanback.widget.OnItemViewSelectedListener r1) {
            r0 = this;
            r0.mOnItemViewSelectedListener = r1
            return
    }

    public final void setShadowEnabled(boolean r1) {
            r0 = this;
            r0.mShadowEnabled = r1
            return
    }
}
