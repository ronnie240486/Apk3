package androidx.leanback.app;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class RowsFragment extends androidx.leanback.app.BaseRowFragment implements androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapterProvider, androidx.leanback.app.BrowseFragment.MainFragmentAdapterProvider {
    public boolean mAfterEntranceTransition;
    private int mAlignedTop;
    private final androidx.leanback.widget.ItemBridgeAdapter.AdapterListener mBridgeAdapterListener;
    public boolean mExpand;
    public androidx.leanback.widget.ItemBridgeAdapter.AdapterListener mExternalAdapterListener;
    public boolean mFreezeRows;
    private androidx.leanback.app.RowsFragment.MainFragmentAdapter mMainFragmentAdapter;
    private androidx.leanback.app.RowsFragment.MainFragmentRowsAdapter mMainFragmentRowsAdapter;
    public androidx.leanback.widget.BaseOnItemViewClickedListener mOnItemViewClickedListener;
    public androidx.leanback.widget.BaseOnItemViewSelectedListener mOnItemViewSelectedListener;
    private java.util.ArrayList<androidx.leanback.widget.Presenter> mPresenterMapper;
    private androidx.recyclerview.widget.RecyclerView.RecycledViewPool mRecycledViewPool;
    public int mSelectAnimatorDuration;
    public android.view.animation.DecelerateInterpolator mSelectAnimatorInterpolator;
    public androidx.leanback.widget.ItemBridgeAdapter.ViewHolder mSelectedViewHolder;
    private int mSubPosition;
    public boolean mViewsCreated;



    public static class MainFragmentAdapter extends androidx.leanback.app.BrowseFragment.MainFragmentAdapter<androidx.leanback.app.RowsFragment> {
        public MainFragmentAdapter(androidx.leanback.app.RowsFragment r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.setScalingEnabled(r1)
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentAdapter
        public boolean isScrolling() {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                boolean r0 = r0.isScrolling()
                return r0
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentAdapter
        public void onTransitionEnd() {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                r0.onTransitionEnd()
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentAdapter
        public boolean onTransitionPrepare() {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                boolean r0 = r0.onTransitionPrepare()
                return r0
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentAdapter
        public void onTransitionStart() {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                r0.onTransitionStart()
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentAdapter
        public void setAlignment(int r2) {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                r0.setAlignment(r2)
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentAdapter
        public void setEntranceTransitionState(boolean r2) {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                r0.setEntranceTransitionState(r2)
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentAdapter
        public void setExpand(boolean r2) {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                r0.setExpand(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.Deprecated
    public static class MainFragmentRowsAdapter extends androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter<androidx.leanback.app.RowsFragment> {
        public MainFragmentRowsAdapter(androidx.leanback.app.RowsFragment r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter
        public androidx.leanback.widget.RowPresenter.ViewHolder findRowViewHolderByPosition(int r2) {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                androidx.leanback.widget.RowPresenter$ViewHolder r2 = r0.findRowViewHolderByPosition(r2)
                return r2
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter
        public int getSelectedPosition() {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                int r0 = r0.getSelectedPosition()
                return r0
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter
        public void setAdapter(androidx.leanback.widget.ObjectAdapter r2) {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                r0.setAdapter(r2)
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter
        public void setOnItemViewClickedListener(androidx.leanback.widget.OnItemViewClickedListener r2) {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                r0.setOnItemViewClickedListener(r2)
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter
        public void setOnItemViewSelectedListener(androidx.leanback.widget.OnItemViewSelectedListener r2) {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                r0.setOnItemViewSelectedListener(r2)
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter
        public void setSelectedPosition(int r2, boolean r3) {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                r0.setSelectedPosition(r2, r3)
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter
        public void setSelectedPosition(int r2, boolean r3, androidx.leanback.widget.Presenter.ViewHolderTask r4) {
                r1 = this;
                android.app.Fragment r0 = r1.getFragment()
                androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
                r0.setSelectedPosition(r2, r3, r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class RowViewHolderExtra implements android.animation.TimeAnimator.TimeListener {
        public final androidx.leanback.widget.RowPresenter mRowPresenter;
        public final androidx.leanback.widget.Presenter.ViewHolder mRowViewHolder;
        public final android.animation.TimeAnimator mSelectAnimator;
        public int mSelectAnimatorDurationInUse;
        public android.view.animation.DecelerateInterpolator mSelectAnimatorInterpolatorInUse;
        public float mSelectLevelAnimDelta;
        public float mSelectLevelAnimStart;
        public final /* synthetic */ androidx.leanback.app.RowsFragment this$0;

        public RowViewHolderExtra(androidx.leanback.app.RowsFragment r2, androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                android.animation.TimeAnimator r2 = new android.animation.TimeAnimator
                r2.<init>()
                r1.mSelectAnimator = r2
                androidx.leanback.widget.Presenter r0 = r3.getPresenter()
                androidx.leanback.widget.RowPresenter r0 = (androidx.leanback.widget.RowPresenter) r0
                r1.mRowPresenter = r0
                androidx.leanback.widget.Presenter$ViewHolder r3 = r3.getViewHolder()
                r1.mRowViewHolder = r3
                r2.setTimeListener(r1)
                return
        }

        @Override // android.animation.TimeAnimator.TimeListener
        public void onTimeUpdate(android.animation.TimeAnimator r2, long r3, long r5) {
                r1 = this;
                android.animation.TimeAnimator r2 = r1.mSelectAnimator
                boolean r2 = r2.isRunning()
                if (r2 == 0) goto L31
                int r2 = r1.mSelectAnimatorDurationInUse
                long r5 = (long) r2
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 < 0) goto L17
                r2 = 1065353216(0x3f800000, float:1.0)
                android.animation.TimeAnimator r3 = r1.mSelectAnimator
                r3.end()
                goto L1b
            L17:
                double r3 = (double) r3
                double r5 = (double) r2
                double r3 = r3 / r5
                float r2 = (float) r3
            L1b:
                android.view.animation.DecelerateInterpolator r3 = r1.mSelectAnimatorInterpolatorInUse
                if (r3 == 0) goto L23
                float r2 = r3.getInterpolation(r2)
            L23:
                float r3 = r1.mSelectLevelAnimStart
                float r4 = r1.mSelectLevelAnimDelta
                float r2 = r2 * r4
                float r2 = r2 + r3
                androidx.leanback.widget.RowPresenter r3 = r1.mRowPresenter
                androidx.leanback.widget.Presenter$ViewHolder r4 = r1.mRowViewHolder
                r3.setSelectLevel(r4, r2)
            L31:
                return
        }
    }

    public RowsFragment() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mExpand = r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mAlignedTop = r1
            r2.mAfterEntranceTransition = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r1 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r1)
            r2.mSelectAnimatorInterpolator = r0
            androidx.leanback.app.RowsFragment$1 r0 = new androidx.leanback.app.RowsFragment$1
            r0.<init>(r2)
            r2.mBridgeAdapterListener = r0
            return
    }

    private void freezeRows(boolean r6) {
            r5 = this;
            r5.mFreezeRows = r6
            androidx.leanback.widget.VerticalGridView r0 = r5.getVerticalGridView()
            if (r0 == 0) goto L2d
            int r1 = r0.getChildCount()
            r2 = 0
        Ld:
            if (r2 >= r1) goto L2d
            android.view.View r3 = r0.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r0.getChildViewHolder(r3)
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r3 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r3
            androidx.leanback.widget.Presenter r4 = r3.getPresenter()
            androidx.leanback.widget.RowPresenter r4 = (androidx.leanback.widget.RowPresenter) r4
            androidx.leanback.widget.Presenter$ViewHolder r3 = r3.getViewHolder()
            androidx.leanback.widget.RowPresenter$ViewHolder r3 = r4.getRowViewHolder(r3)
            r4.freeze(r3, r6)
            int r2 = r2 + 1
            goto Ld
        L2d:
            return
    }

    public static androidx.leanback.widget.RowPresenter.ViewHolder getRowViewHolder(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            androidx.leanback.widget.Presenter r0 = r1.getPresenter()
            androidx.leanback.widget.RowPresenter r0 = (androidx.leanback.widget.RowPresenter) r0
            androidx.leanback.widget.Presenter$ViewHolder r1 = r1.getViewHolder()
            androidx.leanback.widget.RowPresenter$ViewHolder r1 = r0.getRowViewHolder(r1)
            return r1
    }

    public static void setRowViewSelected(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r3, boolean r4, boolean r5) {
            java.lang.Object r0 = r3.getExtraObject()
            androidx.leanback.app.RowsFragment$RowViewHolderExtra r0 = (androidx.leanback.app.RowsFragment.RowViewHolderExtra) r0
            android.animation.TimeAnimator r1 = r0.mSelectAnimator
            r1.end()
            if (r4 == 0) goto L10
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L11
        L10:
            r1 = 0
        L11:
            if (r5 == 0) goto L1b
            androidx.leanback.widget.RowPresenter r5 = r0.mRowPresenter
            androidx.leanback.widget.Presenter$ViewHolder r0 = r0.mRowViewHolder
            r5.setSelectLevel(r0, r1)
            goto L43
        L1b:
            androidx.leanback.widget.RowPresenter r5 = r0.mRowPresenter
            androidx.leanback.widget.Presenter$ViewHolder r2 = r0.mRowViewHolder
            float r5 = r5.getSelectLevel(r2)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L43
            androidx.leanback.app.RowsFragment r5 = r0.this$0
            int r2 = r5.mSelectAnimatorDuration
            r0.mSelectAnimatorDurationInUse = r2
            android.view.animation.DecelerateInterpolator r5 = r5.mSelectAnimatorInterpolator
            r0.mSelectAnimatorInterpolatorInUse = r5
            androidx.leanback.widget.RowPresenter r5 = r0.mRowPresenter
            androidx.leanback.widget.Presenter$ViewHolder r2 = r0.mRowViewHolder
            float r5 = r5.getSelectLevel(r2)
            r0.mSelectLevelAnimStart = r5
            float r1 = r1 - r5
            r0.mSelectLevelAnimDelta = r1
            android.animation.TimeAnimator r5 = r0.mSelectAnimator
            r5.start()
        L43:
            androidx.leanback.widget.Presenter r5 = r3.getPresenter()
            androidx.leanback.widget.RowPresenter r5 = (androidx.leanback.widget.RowPresenter) r5
            androidx.leanback.widget.Presenter$ViewHolder r3 = r3.getViewHolder()
            r5.setRowViewSelected(r3, r4)
            return
    }

    @java.lang.Deprecated
    public void enableRowScaling(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public final androidx.leanback.widget.VerticalGridView findGridViewFromRoot(android.view.View r2) {
            r1 = this;
            int r0 = androidx.leanback.R.id.container_list
            android.view.View r2 = r2.findViewById(r0)
            androidx.leanback.widget.VerticalGridView r2 = (androidx.leanback.widget.VerticalGridView) r2
            return r2
    }

    public androidx.leanback.widget.RowPresenter.ViewHolder findRowViewHolderByPosition(int r2) {
            r1 = this;
            androidx.leanback.widget.VerticalGridView r0 = r1.mVerticalGridView
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r0.findViewHolderForAdapterPosition(r2)
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r2 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r2
            androidx.leanback.widget.RowPresenter$ViewHolder r2 = getRowViewHolder(r2)
            return r2
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public final int getLayoutResourceId() {
            r1 = this;
            int r0 = androidx.leanback.R.layout.lb_rows_fragment
            return r0
    }

    @Override // androidx.leanback.app.BrowseFragment.MainFragmentAdapterProvider
    public androidx.leanback.app.BrowseFragment.MainFragmentAdapter getMainFragmentAdapter() {
            r1 = this;
            androidx.leanback.app.RowsFragment$MainFragmentAdapter r0 = r1.mMainFragmentAdapter
            if (r0 != 0) goto Lb
            androidx.leanback.app.RowsFragment$MainFragmentAdapter r0 = new androidx.leanback.app.RowsFragment$MainFragmentAdapter
            r0.<init>(r1)
            r1.mMainFragmentAdapter = r0
        Lb:
            androidx.leanback.app.RowsFragment$MainFragmentAdapter r0 = r1.mMainFragmentAdapter
            return r0
    }

    @Override // androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapterProvider
    public androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter getMainFragmentRowsAdapter() {
            r1 = this;
            androidx.leanback.app.RowsFragment$MainFragmentRowsAdapter r0 = r1.mMainFragmentRowsAdapter
            if (r0 != 0) goto Lb
            androidx.leanback.app.RowsFragment$MainFragmentRowsAdapter r0 = new androidx.leanback.app.RowsFragment$MainFragmentRowsAdapter
            r0.<init>(r1)
            r1.mMainFragmentRowsAdapter = r0
        Lb:
            androidx.leanback.app.RowsFragment$MainFragmentRowsAdapter r0 = r1.mMainFragmentRowsAdapter
            return r0
    }

    public androidx.leanback.widget.BaseOnItemViewClickedListener getOnItemViewClickedListener() {
            r1 = this;
            androidx.leanback.widget.BaseOnItemViewClickedListener r0 = r1.mOnItemViewClickedListener
            return r0
    }

    public androidx.leanback.widget.BaseOnItemViewSelectedListener getOnItemViewSelectedListener() {
            r1 = this;
            androidx.leanback.widget.BaseOnItemViewSelectedListener r0 = r1.mOnItemViewSelectedListener
            return r0
    }

    public androidx.leanback.widget.RowPresenter.ViewHolder getRowViewHolder(int r2) {
            r1 = this;
            androidx.leanback.widget.VerticalGridView r0 = r1.getVerticalGridView()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r0.findViewHolderForAdapterPosition(r2)
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r2 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r2
            androidx.leanback.widget.RowPresenter$ViewHolder r2 = getRowViewHolder(r2)
            return r2
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public /* bridge */ /* synthetic */ int getSelectedPosition() {
            r1 = this;
            int r0 = super.getSelectedPosition()
            return r0
    }

    public boolean isScrolling() {
            r2 = this;
            androidx.leanback.widget.VerticalGridView r0 = r2.getVerticalGridView()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.leanback.widget.VerticalGridView r0 = r2.getVerticalGridView()
            int r0 = r0.getScrollState()
            if (r0 == 0) goto L13
            r1 = 1
        L13:
            return r1
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            android.content.res.Resources r2 = r1.getResources()
            int r0 = androidx.leanback.R.integer.lb_browse_rows_anim_duration
            int r2 = r2.getInteger(r0)
            r1.mSelectAnimatorDuration = r2
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment, android.app.Fragment
    public /* bridge */ /* synthetic */ android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            android.view.View r1 = super.onCreateView(r1, r2, r3)
            return r1
    }

    @Override // androidx.leanback.app.BaseRowFragment, android.app.Fragment
    public void onDestroyView() {
            r1 = this;
            r0 = 0
            r1.mViewsCreated = r0
            super.onDestroyView()
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public final void onRowSelected(androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6, int r7) {
            r4 = this;
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r0 = r4.mSelectedViewHolder
            r1 = 0
            r2 = 1
            if (r0 != r5) goto La
            int r3 = r4.mSubPosition
            if (r3 == r7) goto L1a
        La:
            r4.mSubPosition = r7
            if (r0 == 0) goto L11
            setRowViewSelected(r0, r1, r1)
        L11:
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r5 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r5
            r4.mSelectedViewHolder = r5
            if (r5 == 0) goto L1a
            setRowViewSelected(r5, r2, r1)
        L1a:
            androidx.leanback.app.RowsFragment$MainFragmentAdapter r5 = r4.mMainFragmentAdapter
            if (r5 == 0) goto L28
            androidx.leanback.app.BrowseFragment$FragmentHost r5 = r5.getFragmentHost()
            if (r6 > 0) goto L25
            r1 = 1
        L25:
            r5.showTitleView(r1)
        L28:
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment, android.app.Fragment
    public /* bridge */ /* synthetic */ void onSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            super.onSaveInstanceState(r1)
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public void onTransitionEnd() {
            r1 = this;
            super.onTransitionEnd()
            r0 = 0
            r1.freezeRows(r0)
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public boolean onTransitionPrepare() {
            r2 = this;
            boolean r0 = super.onTransitionPrepare()
            if (r0 == 0) goto La
            r1 = 1
            r2.freezeRows(r1)
        La:
            return r0
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public /* bridge */ /* synthetic */ void onTransitionStart() {
            r0 = this;
            super.onTransitionStart()
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment, android.app.Fragment
    public void onViewCreated(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            androidx.leanback.widget.VerticalGridView r1 = r0.getVerticalGridView()
            int r2 = androidx.leanback.R.id.row_content
            r1.setItemAlignmentViewId(r2)
            androidx.leanback.widget.VerticalGridView r1 = r0.getVerticalGridView()
            r2 = 2
            r1.setSaveChildrenPolicy(r2)
            int r1 = r0.mAlignedTop
            r0.setAlignment(r1)
            r1 = 0
            r0.mRecycledViewPool = r1
            r0.mPresenterMapper = r1
            androidx.leanback.app.RowsFragment$MainFragmentAdapter r1 = r0.mMainFragmentAdapter
            if (r1 == 0) goto L2b
            androidx.leanback.app.BrowseFragment$FragmentHost r1 = r1.getFragmentHost()
            androidx.leanback.app.RowsFragment$MainFragmentAdapter r2 = r0.mMainFragmentAdapter
            r1.notifyViewCreated(r2)
        L2b:
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public void setAlignment(int r4) {
            r3 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L5
            return
        L5:
            r3.mAlignedTop = r4
            androidx.leanback.widget.VerticalGridView r4 = r3.getVerticalGridView()
            if (r4 == 0) goto L25
            r0 = 0
            r4.setItemAlignmentOffset(r0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.setItemAlignmentOffsetPercent(r1)
            r2 = 1
            r4.setItemAlignmentOffsetWithPadding(r2)
            int r2 = r3.mAlignedTop
            r4.setWindowAlignmentOffset(r2)
            r4.setWindowAlignmentOffsetPercent(r1)
            r4.setWindowAlignment(r0)
        L25:
            return
    }

    public void setEntranceTransitionState(boolean r6) {
            r5 = this;
            r5.mAfterEntranceTransition = r6
            androidx.leanback.widget.VerticalGridView r6 = r5.getVerticalGridView()
            if (r6 == 0) goto L2f
            int r0 = r6.getChildCount()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L2f
            android.view.View r2 = r6.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r6.getChildViewHolder(r2)
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r2 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r2
            androidx.leanback.widget.Presenter r3 = r2.getPresenter()
            androidx.leanback.widget.RowPresenter r3 = (androidx.leanback.widget.RowPresenter) r3
            androidx.leanback.widget.Presenter$ViewHolder r2 = r2.getViewHolder()
            androidx.leanback.widget.RowPresenter$ViewHolder r2 = r3.getRowViewHolder(r2)
            boolean r4 = r5.mAfterEntranceTransition
            r3.setEntranceTransitionState(r2, r4)
            int r1 = r1 + 1
            goto Ld
        L2f:
            return
    }

    public void setExpand(boolean r6) {
            r5 = this;
            r5.mExpand = r6
            androidx.leanback.widget.VerticalGridView r6 = r5.getVerticalGridView()
            if (r6 == 0) goto L2b
            int r0 = r6.getChildCount()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L2b
            android.view.View r2 = r6.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r6.getChildViewHolder(r2)
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r2 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r2
            boolean r3 = r5.mExpand
            androidx.leanback.widget.Presenter r4 = r2.getPresenter()
            androidx.leanback.widget.RowPresenter r4 = (androidx.leanback.widget.RowPresenter) r4
            androidx.leanback.widget.Presenter$ViewHolder r2 = r2.getViewHolder()
            r4.setRowViewExpanded(r2, r3)
            int r1 = r1 + 1
            goto Ld
        L2b:
            return
    }

    public void setOnItemViewClickedListener(androidx.leanback.widget.BaseOnItemViewClickedListener r2) {
            r1 = this;
            r1.mOnItemViewClickedListener = r2
            boolean r2 = r1.mViewsCreated
            if (r2 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Item clicked listener must be set before views are created"
            r2.<init>(r0)
            throw r2
    }

    public void setOnItemViewSelectedListener(androidx.leanback.widget.BaseOnItemViewSelectedListener r5) {
            r4 = this;
            r4.mOnItemViewSelectedListener = r5
            androidx.leanback.widget.VerticalGridView r5 = r4.getVerticalGridView()
            if (r5 == 0) goto L25
            int r0 = r5.getChildCount()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L25
            android.view.View r2 = r5.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r5.getChildViewHolder(r2)
            androidx.leanback.widget.ItemBridgeAdapter$ViewHolder r2 = (androidx.leanback.widget.ItemBridgeAdapter.ViewHolder) r2
            androidx.leanback.widget.RowPresenter$ViewHolder r2 = getRowViewHolder(r2)
            androidx.leanback.widget.BaseOnItemViewSelectedListener r3 = r4.mOnItemViewSelectedListener
            r2.setOnItemViewSelectedListener(r3)
            int r1 = r1 + 1
            goto Ld
        L25:
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public /* bridge */ /* synthetic */ void setSelectedPosition(int r1) {
            r0 = this;
            super.setSelectedPosition(r1)
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public /* bridge */ /* synthetic */ void setSelectedPosition(int r1, boolean r2) {
            r0 = this;
            super.setSelectedPosition(r1, r2)
            return
    }

    public void setSelectedPosition(int r3, boolean r4, androidx.leanback.widget.Presenter.ViewHolderTask r5) {
            r2 = this;
            androidx.leanback.widget.VerticalGridView r0 = r2.getVerticalGridView()
            if (r0 != 0) goto L7
            return
        L7:
            r1 = 0
            if (r5 == 0) goto Lf
            androidx.leanback.app.RowsFragment$2 r1 = new androidx.leanback.app.RowsFragment$2
            r1.<init>(r5)
        Lf:
            if (r4 == 0) goto L15
            r0.setSelectedPositionSmooth(r3, r1)
            goto L18
        L15:
            r0.setSelectedPosition(r3, r1)
        L18:
            return
    }

    public final void setupSharedViewPool(androidx.leanback.widget.ItemBridgeAdapter.ViewHolder r3) {
            r2 = this;
            androidx.leanback.widget.Presenter r0 = r3.getPresenter()
            androidx.leanback.widget.RowPresenter r0 = (androidx.leanback.widget.RowPresenter) r0
            androidx.leanback.widget.Presenter$ViewHolder r3 = r3.getViewHolder()
            androidx.leanback.widget.RowPresenter$ViewHolder r3 = r0.getRowViewHolder(r3)
            boolean r0 = r3 instanceof androidx.leanback.widget.ListRowPresenter.ViewHolder
            if (r0 == 0) goto L38
            androidx.leanback.widget.ListRowPresenter$ViewHolder r3 = (androidx.leanback.widget.ListRowPresenter.ViewHolder) r3
            androidx.leanback.widget.HorizontalGridView r0 = r3.getGridView()
            androidx.recyclerview.widget.RecyclerView$RecycledViewPool r1 = r2.mRecycledViewPool
            if (r1 != 0) goto L23
            androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r0.getRecycledViewPool()
            r2.mRecycledViewPool = r0
            goto L26
        L23:
            r0.setRecycledViewPool(r1)
        L26:
            androidx.leanback.widget.ItemBridgeAdapter r3 = r3.getBridgeAdapter()
            java.util.ArrayList<androidx.leanback.widget.Presenter> r0 = r2.mPresenterMapper
            if (r0 != 0) goto L35
            java.util.ArrayList r3 = r3.getPresenterMapper()
            r2.mPresenterMapper = r3
            goto L38
        L35:
            r3.setPresenterMapper(r0)
        L38:
            return
    }

    @Override // androidx.leanback.app.BaseRowFragment
    public final void updateAdapter() {
            r2 = this;
            super.updateAdapter()
            r0 = 0
            r2.mSelectedViewHolder = r0
            r0 = 0
            r2.mViewsCreated = r0
            androidx.leanback.widget.ItemBridgeAdapter r0 = r2.getBridgeAdapter()
            if (r0 == 0) goto L14
            androidx.leanback.widget.ItemBridgeAdapter$AdapterListener r1 = r2.mBridgeAdapterListener
            r0.setAdapterListener(r1)
        L14:
            return
    }
}
