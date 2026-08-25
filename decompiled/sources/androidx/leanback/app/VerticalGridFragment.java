package androidx.leanback.app;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class VerticalGridFragment extends androidx.leanback.app.BaseFragment {
    public final androidx.leanback.util.StateMachine.State STATE_SET_ENTRANCE_START_STATE;
    private androidx.leanback.widget.ObjectAdapter mAdapter;
    private final androidx.leanback.widget.OnChildLaidOutListener mChildLaidOutListener;
    private androidx.leanback.widget.VerticalGridPresenter mGridPresenter;
    public androidx.leanback.widget.VerticalGridPresenter.ViewHolder mGridViewHolder;
    private androidx.leanback.widget.OnItemViewClickedListener mOnItemViewClickedListener;
    public androidx.leanback.widget.OnItemViewSelectedListener mOnItemViewSelectedListener;
    private java.lang.Object mSceneAfterEntranceTransition;
    private int mSelectedPosition;
    private final androidx.leanback.widget.OnItemViewSelectedListener mViewSelectedListener;





    public VerticalGridFragment() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mSelectedPosition = r0
            androidx.leanback.app.VerticalGridFragment$1 r0 = new androidx.leanback.app.VerticalGridFragment$1
            r0.<init>(r1)
            r1.STATE_SET_ENTRANCE_START_STATE = r0
            androidx.leanback.app.VerticalGridFragment$2 r0 = new androidx.leanback.app.VerticalGridFragment$2
            r0.<init>(r1)
            r1.mViewSelectedListener = r0
            androidx.leanback.app.VerticalGridFragment$3 r0 = new androidx.leanback.app.VerticalGridFragment$3
            r0.<init>(r1)
            r1.mChildLaidOutListener = r0
            return
    }

    private void setupFocusSearchListener() {
            r2 = this;
            android.view.View r0 = r2.getView()
            int r1 = androidx.leanback.R.id.grid_frame
            android.view.View r0 = r0.findViewById(r1)
            androidx.leanback.widget.BrowseFrameLayout r0 = (androidx.leanback.widget.BrowseFrameLayout) r0
            androidx.leanback.widget.TitleHelper r1 = r2.getTitleHelper()
            androidx.leanback.widget.BrowseFrameLayout$OnFocusSearchListener r1 = r1.getOnFocusSearchListener()
            r0.setOnFocusSearchListener(r1)
            return
    }

    private void updateAdapter() {
            r3 = this;
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r0 = r3.mGridViewHolder
            if (r0 == 0) goto L1b
            androidx.leanback.widget.VerticalGridPresenter r1 = r3.mGridPresenter
            androidx.leanback.widget.ObjectAdapter r2 = r3.mAdapter
            r1.onBindViewHolder(r0, r2)
            int r0 = r3.mSelectedPosition
            r1 = -1
            if (r0 == r1) goto L1b
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r0 = r3.mGridViewHolder
            androidx.leanback.widget.VerticalGridView r0 = r0.getGridView()
            int r1 = r3.mSelectedPosition
            r0.setSelectedPosition(r1)
        L1b:
            return
    }

    @Override // androidx.leanback.app.BaseFragment
    public final java.lang.Object createEntranceTransition() {
            r2 = this;
            android.content.Context r0 = androidx.leanback.app.FragmentUtil.getContext(r2)
            int r1 = androidx.leanback.R.transition.lb_vertical_grid_entrance_transition
            java.lang.Object r0 = androidx.leanback.transition.TransitionHelper.loadTransition(r0, r1)
            return r0
    }

    @Override // androidx.leanback.app.BaseFragment
    public final void createStateMachineStates() {
            r2 = this;
            super.createStateMachineStates()
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_SET_ENTRANCE_START_STATE
            r0.addState(r1)
            return
    }

    @Override // androidx.leanback.app.BaseFragment
    public final void createStateMachineTransitions() {
            r4 = this;
            super.createStateMachineTransitions()
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_ON_PREPARED
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_SET_ENTRANCE_START_STATE
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_ON_CREATEVIEW
            r0.addTransition(r1, r2, r3)
            return
    }

    public androidx.leanback.widget.ObjectAdapter getAdapter() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            return r0
    }

    public androidx.leanback.widget.VerticalGridPresenter getGridPresenter() {
            r1 = this;
            androidx.leanback.widget.VerticalGridPresenter r0 = r1.mGridPresenter
            return r0
    }

    public androidx.leanback.widget.OnItemViewClickedListener getOnItemViewClickedListener() {
            r1 = this;
            androidx.leanback.widget.OnItemViewClickedListener r0 = r1.mOnItemViewClickedListener
            return r0
    }

    public final void gridOnItemSelected(int r2) {
            r1 = this;
            int r0 = r1.mSelectedPosition
            if (r2 == r0) goto L9
            r1.mSelectedPosition = r2
            r1.showOrHideTitle()
        L9:
            return
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
            r2 = this;
            int r0 = androidx.leanback.R.layout.lb_vertical_grid_fragment
            r1 = 0
            android.view.View r4 = r3.inflate(r0, r4, r1)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = androidx.leanback.R.id.grid_frame
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.installTitleView(r3, r0, r5)
            androidx.leanback.app.ProgressBarManager r3 = r2.getProgressBarManager()
            r3.setRootView(r4)
            int r3 = androidx.leanback.R.id.browse_grid_dock
            android.view.View r3 = r4.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            androidx.leanback.widget.VerticalGridPresenter r5 = r2.mGridPresenter
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r5 = r5.onCreateViewHolder(r3)
            r2.mGridViewHolder = r5
            android.view.View r5 = r5.view
            r3.addView(r5)
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r5 = r2.mGridViewHolder
            androidx.leanback.widget.VerticalGridView r5 = r5.getGridView()
            androidx.leanback.widget.OnChildLaidOutListener r0 = r2.mChildLaidOutListener
            r5.setOnChildLaidOutListener(r0)
            androidx.leanback.app.VerticalGridFragment$4 r5 = new androidx.leanback.app.VerticalGridFragment$4
            r5.<init>(r2)
            java.lang.Object r3 = androidx.leanback.transition.TransitionHelper.createScene(r3, r5)
            r2.mSceneAfterEntranceTransition = r3
            r2.updateAdapter()
            return r4
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onDestroyView() {
            r1 = this;
            super.onDestroyView()
            r0 = 0
            r1.mGridViewHolder = r0
            return
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onStart() {
            r0 = this;
            super.onStart()
            r0.setupFocusSearchListener()
            return
    }

    @Override // androidx.leanback.app.BaseFragment
    public final void runEntranceTransition(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.mSceneAfterEntranceTransition
            androidx.leanback.transition.TransitionHelper.runTransition(r0, r2)
            return
    }

    public void setAdapter(androidx.leanback.widget.ObjectAdapter r1) {
            r0 = this;
            r0.mAdapter = r1
            r0.updateAdapter()
            return
    }

    public final void setEntranceTransitionState(boolean r3) {
            r2 = this;
            androidx.leanback.widget.VerticalGridPresenter r0 = r2.mGridPresenter
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r1 = r2.mGridViewHolder
            r0.setEntranceTransitionState(r1, r3)
            return
    }

    public void setGridPresenter(androidx.leanback.widget.VerticalGridPresenter r2) {
            r1 = this;
            if (r2 == 0) goto L13
            r1.mGridPresenter = r2
            androidx.leanback.widget.OnItemViewSelectedListener r0 = r1.mViewSelectedListener
            r2.setOnItemViewSelectedListener(r0)
            androidx.leanback.widget.OnItemViewClickedListener r2 = r1.mOnItemViewClickedListener
            if (r2 == 0) goto L12
            androidx.leanback.widget.VerticalGridPresenter r0 = r1.mGridPresenter
            r0.setOnItemViewClickedListener(r2)
        L12:
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Grid presenter may not be null"
            r2.<init>(r0)
            throw r2
    }

    public void setOnItemViewClickedListener(androidx.leanback.widget.OnItemViewClickedListener r2) {
            r1 = this;
            r1.mOnItemViewClickedListener = r2
            androidx.leanback.widget.VerticalGridPresenter r0 = r1.mGridPresenter
            if (r0 == 0) goto L9
            r0.setOnItemViewClickedListener(r2)
        L9:
            return
    }

    public void setOnItemViewSelectedListener(androidx.leanback.widget.OnItemViewSelectedListener r1) {
            r0 = this;
            r0.mOnItemViewSelectedListener = r1
            return
    }

    public void setSelectedPosition(int r2) {
            r1 = this;
            r1.mSelectedPosition = r2
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r0 = r1.mGridViewHolder
            if (r0 == 0) goto L19
            androidx.leanback.widget.VerticalGridView r0 = r0.getGridView()
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            if (r0 == 0) goto L19
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r0 = r1.mGridViewHolder
            androidx.leanback.widget.VerticalGridView r0 = r0.getGridView()
            r0.setSelectedPositionSmooth(r2)
        L19:
            return
    }

    public final void showOrHideTitle() {
            r2 = this;
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r0 = r2.mGridViewHolder
            androidx.leanback.widget.VerticalGridView r0 = r0.getGridView()
            int r1 = r2.mSelectedPosition
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.findViewHolderForAdapterPosition(r1)
            if (r0 != 0) goto Lf
            return
        Lf:
            androidx.leanback.widget.VerticalGridPresenter$ViewHolder r0 = r2.mGridViewHolder
            androidx.leanback.widget.VerticalGridView r0 = r0.getGridView()
            int r1 = r2.mSelectedPosition
            boolean r0 = r0.hasPreviousViewInSameRow(r1)
            if (r0 != 0) goto L22
            r0 = 1
            r2.showTitle(r0)
            goto L26
        L22:
            r0 = 0
            r2.showTitle(r0)
        L26:
            return
    }
}
