package androidx.leanback.app;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class DetailsFragment extends androidx.leanback.app.BaseFragment {
    public final androidx.leanback.util.StateMachine.Event EVT_DETAILS_ROW_LOADED;
    public final androidx.leanback.util.StateMachine.Event EVT_ENTER_TRANSIITON_DONE;
    public final androidx.leanback.util.StateMachine.Event EVT_NO_ENTER_TRANSITION;
    public final androidx.leanback.util.StateMachine.Event EVT_ONSTART;
    public final androidx.leanback.util.StateMachine.Event EVT_SWITCH_TO_VIDEO;
    public final androidx.leanback.util.StateMachine.State STATE_ENTER_TRANSITION_ADDLISTENER;
    public final androidx.leanback.util.StateMachine.State STATE_ENTER_TRANSITION_CANCEL;
    public final androidx.leanback.util.StateMachine.State STATE_ENTER_TRANSITION_COMPLETE;
    public final androidx.leanback.util.StateMachine.State STATE_ENTER_TRANSITION_INIT;
    public final androidx.leanback.util.StateMachine.State STATE_ENTER_TRANSITION_PENDING;
    public final androidx.leanback.util.StateMachine.State STATE_ON_SAFE_START;
    public final androidx.leanback.util.StateMachine.State STATE_SET_ENTRANCE_START_STATE;
    public final androidx.leanback.util.StateMachine.State STATE_SWITCH_TO_VIDEO_IN_ON_CREATE;
    public androidx.leanback.widget.ObjectAdapter mAdapter;
    public android.graphics.drawable.Drawable mBackgroundDrawable;
    public android.view.View mBackgroundView;
    public int mContainerListAlignTop;
    public androidx.leanback.app.DetailsFragmentBackgroundController mDetailsBackgroundController;
    public androidx.leanback.widget.DetailsParallax mDetailsParallax;
    public androidx.leanback.transition.TransitionListener mEnterTransitionListener;
    public androidx.leanback.widget.BaseOnItemViewSelectedListener mExternalOnItemViewSelectedListener;
    public androidx.leanback.widget.BaseOnItemViewClickedListener mOnItemViewClickedListener;
    public final androidx.leanback.widget.BaseOnItemViewSelectedListener<java.lang.Object> mOnItemViewSelectedListener;
    public boolean mPendingFocusOnVideo;
    public androidx.leanback.transition.TransitionListener mReturnTransitionListener;
    public androidx.leanback.widget.BrowseFrameLayout mRootView;
    public androidx.leanback.app.RowsFragment mRowsFragment;
    public java.lang.Object mSceneAfterEntranceTransition;
    public final androidx.leanback.app.DetailsFragment.SetSelectionRunnable mSetSelectionRunnable;
    public android.app.Fragment mVideoFragment;
















    /* JADX INFO: loaded from: classes.dex */
    public class SetSelectionRunnable implements java.lang.Runnable {
        public int mPosition;
        public boolean mSmooth;
        public final /* synthetic */ androidx.leanback.app.DetailsFragment this$0;

        public SetSelectionRunnable(androidx.leanback.app.DetailsFragment r1) {
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
                androidx.leanback.app.DetailsFragment r0 = r3.this$0
                androidx.leanback.app.RowsFragment r0 = r0.mRowsFragment
                if (r0 != 0) goto L7
                return
            L7:
                int r1 = r3.mPosition
                boolean r2 = r3.mSmooth
                r0.setSelectedPosition(r1, r2)
                return
        }
    }

    public static class WaitEnterTransitionTimeout implements java.lang.Runnable {
        public final java.lang.ref.WeakReference<androidx.leanback.app.DetailsFragment> mRef;

        public WaitEnterTransitionTimeout(androidx.leanback.app.DetailsFragment r3) {
                r2 = this;
                r2.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r3)
                r2.mRef = r0
                android.view.View r3 = r3.getView()
                r0 = 200(0xc8, double:9.9E-322)
                r3.postDelayed(r2, r0)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.ref.WeakReference<androidx.leanback.app.DetailsFragment> r0 = r2.mRef
                java.lang.Object r0 = r0.get()
                androidx.leanback.app.DetailsFragment r0 = (androidx.leanback.app.DetailsFragment) r0
                if (r0 == 0) goto L11
                androidx.leanback.util.StateMachine r1 = r0.mStateMachine
                androidx.leanback.util.StateMachine$Event r0 = r0.EVT_ENTER_TRANSIITON_DONE
                r1.fireEvent(r0)
            L11:
                return
        }
    }

    public DetailsFragment() {
            r4 = this;
            r4.<init>()
            androidx.leanback.app.DetailsFragment$1 r0 = new androidx.leanback.app.DetailsFragment$1
            r0.<init>(r4)
            r4.STATE_SET_ENTRANCE_START_STATE = r0
            androidx.leanback.util.StateMachine$State r0 = new androidx.leanback.util.StateMachine$State
            java.lang.String r1 = "STATE_ENTER_TRANSIITON_INIT"
            r0.<init>(r1)
            r4.STATE_ENTER_TRANSITION_INIT = r0
            androidx.leanback.app.DetailsFragment$2 r0 = new androidx.leanback.app.DetailsFragment$2
            r0.<init>(r4)
            r4.STATE_SWITCH_TO_VIDEO_IN_ON_CREATE = r0
            androidx.leanback.app.DetailsFragment$3 r0 = new androidx.leanback.app.DetailsFragment$3
            r0.<init>(r4)
            r4.STATE_ENTER_TRANSITION_CANCEL = r0
            androidx.leanback.util.StateMachine$State r0 = new androidx.leanback.util.StateMachine$State
            java.lang.String r1 = "STATE_ENTER_TRANSIITON_COMPLETE"
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.STATE_ENTER_TRANSITION_COMPLETE = r0
            androidx.leanback.app.DetailsFragment$4 r0 = new androidx.leanback.app.DetailsFragment$4
            r0.<init>(r4)
            r4.STATE_ENTER_TRANSITION_ADDLISTENER = r0
            androidx.leanback.app.DetailsFragment$5 r0 = new androidx.leanback.app.DetailsFragment$5
            r0.<init>(r4)
            r4.STATE_ENTER_TRANSITION_PENDING = r0
            androidx.leanback.app.DetailsFragment$6 r0 = new androidx.leanback.app.DetailsFragment$6
            r0.<init>(r4)
            r4.STATE_ON_SAFE_START = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "onStart"
            r0.<init>(r1)
            r4.EVT_ONSTART = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "EVT_NO_ENTER_TRANSITION"
            r0.<init>(r1)
            r4.EVT_NO_ENTER_TRANSITION = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "onFirstRowLoaded"
            r0.<init>(r1)
            r4.EVT_DETAILS_ROW_LOADED = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "onEnterTransitionDone"
            r0.<init>(r1)
            r4.EVT_ENTER_TRANSIITON_DONE = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "switchToVideo"
            r0.<init>(r1)
            r4.EVT_SWITCH_TO_VIDEO = r0
            androidx.leanback.app.DetailsFragment$7 r0 = new androidx.leanback.app.DetailsFragment$7
            r0.<init>(r4)
            r4.mEnterTransitionListener = r0
            androidx.leanback.app.DetailsFragment$8 r0 = new androidx.leanback.app.DetailsFragment$8
            r0.<init>(r4)
            r4.mReturnTransitionListener = r0
            r4.mPendingFocusOnVideo = r3
            androidx.leanback.app.DetailsFragment$SetSelectionRunnable r0 = new androidx.leanback.app.DetailsFragment$SetSelectionRunnable
            r0.<init>(r4)
            r4.mSetSelectionRunnable = r0
            androidx.leanback.app.DetailsFragment$9 r0 = new androidx.leanback.app.DetailsFragment$9
            r0.<init>(r4)
            r4.mOnItemViewSelectedListener = r0
            return
    }

    private void setupChildFragmentLayout() {
            r3 = this;
            androidx.leanback.app.RowsFragment r0 = r3.mRowsFragment
            androidx.leanback.widget.VerticalGridView r0 = r0.getVerticalGridView()
            int r1 = r3.mContainerListAlignTop
            int r1 = -r1
            r0.setItemAlignmentOffset(r1)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.setItemAlignmentOffsetPercent(r1)
            r2 = 0
            r0.setWindowAlignmentOffset(r2)
            r0.setWindowAlignmentOffsetPercent(r1)
            r0.setWindowAlignment(r2)
            return
    }

    @Override // androidx.leanback.app.BaseFragment
    public final java.lang.Object createEntranceTransition() {
            r2 = this;
            android.content.Context r0 = androidx.leanback.app.FragmentUtil.getContext(r2)
            int r1 = androidx.leanback.R.transition.lb_details_enter_transition
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
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_ON_SAFE_START
            r0.addState(r1)
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_SWITCH_TO_VIDEO_IN_ON_CREATE
            r0.addState(r1)
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_ENTER_TRANSITION_INIT
            r0.addState(r1)
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_ENTER_TRANSITION_ADDLISTENER
            r0.addState(r1)
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_ENTER_TRANSITION_CANCEL
            r0.addState(r1)
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_ENTER_TRANSITION_PENDING
            r0.addState(r1)
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_ENTER_TRANSITION_COMPLETE
            r0.addState(r1)
            return
    }

    @Override // androidx.leanback.app.BaseFragment
    public final void createStateMachineTransitions() {
            r4 = this;
            super.createStateMachineTransitions()
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_START
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTER_TRANSITION_INIT
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_ON_CREATE
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTER_TRANSITION_INIT
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTER_TRANSITION_COMPLETE
            androidx.leanback.util.StateMachine$Condition r3 = r4.COND_TRANSITION_NOT_SUPPORTED
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTER_TRANSITION_INIT
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTER_TRANSITION_COMPLETE
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_NO_ENTER_TRANSITION
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTER_TRANSITION_INIT
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTER_TRANSITION_CANCEL
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_SWITCH_TO_VIDEO
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTER_TRANSITION_CANCEL
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTER_TRANSITION_COMPLETE
            r0.addTransition(r1, r2)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTER_TRANSITION_INIT
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTER_TRANSITION_ADDLISTENER
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_ON_CREATEVIEW
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTER_TRANSITION_ADDLISTENER
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTER_TRANSITION_COMPLETE
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_ENTER_TRANSIITON_DONE
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTER_TRANSITION_ADDLISTENER
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTER_TRANSITION_PENDING
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_DETAILS_ROW_LOADED
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTER_TRANSITION_PENDING
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTER_TRANSITION_COMPLETE
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_ENTER_TRANSIITON_DONE
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTER_TRANSITION_COMPLETE
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_PERFORM
            r0.addTransition(r1, r2)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_INIT
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_SWITCH_TO_VIDEO_IN_ON_CREATE
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_SWITCH_TO_VIDEO
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_SWITCH_TO_VIDEO_IN_ON_CREATE
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_COMPLETE
            r0.addTransition(r1, r2)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_COMPLETE
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_SWITCH_TO_VIDEO_IN_ON_CREATE
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_SWITCH_TO_VIDEO
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_ON_PREPARED
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_SET_ENTRANCE_START_STATE
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_ONSTART
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_START
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ON_SAFE_START
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_ONSTART
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_COMPLETE
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ON_SAFE_START
            r0.addTransition(r1, r2)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTER_TRANSITION_COMPLETE
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ON_SAFE_START
            r0.addTransition(r1, r2)
            return
    }

    public androidx.leanback.widget.ObjectAdapter getAdapter() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            return r0
    }

    public androidx.leanback.widget.BaseOnItemViewClickedListener getOnItemViewClickedListener() {
            r1 = this;
            androidx.leanback.widget.BaseOnItemViewClickedListener r0 = r1.mOnItemViewClickedListener
            return r0
    }

    public androidx.leanback.widget.DetailsParallax getParallax() {
            r2 = this;
            androidx.leanback.widget.DetailsParallax r0 = r2.mDetailsParallax
            if (r0 != 0) goto L20
            androidx.leanback.widget.DetailsParallax r0 = new androidx.leanback.widget.DetailsParallax
            r0.<init>()
            r2.mDetailsParallax = r0
            androidx.leanback.app.RowsFragment r0 = r2.mRowsFragment
            if (r0 == 0) goto L20
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L20
            androidx.leanback.widget.DetailsParallax r0 = r2.mDetailsParallax
            androidx.leanback.app.RowsFragment r1 = r2.mRowsFragment
            androidx.leanback.widget.VerticalGridView r1 = r1.getVerticalGridView()
            r0.setRecyclerView(r1)
        L20:
            androidx.leanback.widget.DetailsParallax r0 = r2.mDetailsParallax
            return r0
    }

    public androidx.leanback.app.RowsFragment getRowsFragment() {
            r1 = this;
            androidx.leanback.app.RowsFragment r0 = r1.mRowsFragment
            return r0
    }

    public final androidx.leanback.widget.VerticalGridView getVerticalGridView() {
            r1 = this;
            androidx.leanback.app.RowsFragment r0 = r1.mRowsFragment
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            androidx.leanback.widget.VerticalGridView r0 = r0.getVerticalGridView()
        La:
            return r0
    }

    @Override // androidx.leanback.app.BaseFragment, android.app.Fragment
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            android.content.res.Resources r3 = r2.getResources()
            int r0 = androidx.leanback.R.dimen.lb_details_rows_align_top
            int r3 = r3.getDimensionPixelSize(r0)
            r2.mContainerListAlignTop = r3
            android.app.Activity r3 = r2.getActivity()
            if (r3 == 0) goto L36
            android.view.Window r0 = r3.getWindow()
            java.lang.Object r0 = androidx.leanback.transition.TransitionHelper.getEnterTransition(r0)
            if (r0 != 0) goto L26
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$Event r1 = r2.EVT_NO_ENTER_TRANSITION
            r0.fireEvent(r1)
        L26:
            android.view.Window r3 = r3.getWindow()
            java.lang.Object r3 = androidx.leanback.transition.TransitionHelper.getReturnTransition(r3)
            if (r3 == 0) goto L3d
            androidx.leanback.transition.TransitionListener r0 = r2.mReturnTransitionListener
            androidx.leanback.transition.TransitionHelper.addTransitionListener(r3, r0)
            goto L3d
        L36:
            androidx.leanback.util.StateMachine r3 = r2.mStateMachine
            androidx.leanback.util.StateMachine$Event r0 = r2.EVT_NO_ENTER_TRANSITION
            r3.fireEvent(r0)
        L3d:
            return
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
            r2 = this;
            int r0 = androidx.leanback.R.layout.lb_details_fragment
            r1 = 0
            android.view.View r4 = r3.inflate(r0, r4, r1)
            androidx.leanback.widget.BrowseFrameLayout r4 = (androidx.leanback.widget.BrowseFrameLayout) r4
            r2.mRootView = r4
            int r0 = androidx.leanback.R.id.details_background_view
            android.view.View r4 = r4.findViewById(r0)
            r2.mBackgroundView = r4
            if (r4 == 0) goto L1a
            android.graphics.drawable.Drawable r0 = r2.mBackgroundDrawable
            r4.setBackground(r0)
        L1a:
            android.app.FragmentManager r4 = r2.getChildFragmentManager()
            int r0 = androidx.leanback.R.id.details_rows_dock
            android.app.Fragment r4 = r4.findFragmentById(r0)
            androidx.leanback.app.RowsFragment r4 = (androidx.leanback.app.RowsFragment) r4
            r2.mRowsFragment = r4
            if (r4 != 0) goto L42
            androidx.leanback.app.RowsFragment r4 = new androidx.leanback.app.RowsFragment
            r4.<init>()
            r2.mRowsFragment = r4
            android.app.FragmentManager r4 = r2.getChildFragmentManager()
            android.app.FragmentTransaction r4 = r4.beginTransaction()
            androidx.leanback.app.RowsFragment r1 = r2.mRowsFragment
            android.app.FragmentTransaction r4 = r4.replace(r0, r1)
            r4.commit()
        L42:
            androidx.leanback.widget.BrowseFrameLayout r4 = r2.mRootView
            r2.installTitleView(r3, r4, r5)
            androidx.leanback.app.RowsFragment r3 = r2.mRowsFragment
            androidx.leanback.widget.ObjectAdapter r4 = r2.mAdapter
            r3.setAdapter(r4)
            androidx.leanback.app.RowsFragment r3 = r2.mRowsFragment
            androidx.leanback.widget.BaseOnItemViewSelectedListener<java.lang.Object> r4 = r2.mOnItemViewSelectedListener
            r3.setOnItemViewSelectedListener(r4)
            androidx.leanback.app.RowsFragment r3 = r2.mRowsFragment
            androidx.leanback.widget.BaseOnItemViewClickedListener r4 = r2.mOnItemViewClickedListener
            r3.setOnItemViewClickedListener(r4)
            androidx.leanback.widget.BrowseFrameLayout r3 = r2.mRootView
            androidx.leanback.app.DetailsFragment$10 r4 = new androidx.leanback.app.DetailsFragment$10
            r4.<init>(r2)
            java.lang.Object r3 = androidx.leanback.transition.TransitionHelper.createScene(r3, r4)
            r2.mSceneAfterEntranceTransition = r3
            androidx.leanback.widget.BrowseFrameLayout r3 = r2.mRootView
            androidx.leanback.app.DetailsFragment$13 r4 = new androidx.leanback.app.DetailsFragment$13
            r4.<init>(r2)
            r3.setOnChildFocusListener(r4)
            androidx.leanback.widget.BrowseFrameLayout r3 = r2.mRootView
            androidx.leanback.app.DetailsFragment$14 r4 = new androidx.leanback.app.DetailsFragment$14
            r4.<init>(r2)
            r3.setOnFocusSearchListener(r4)
            androidx.leanback.widget.BrowseFrameLayout r3 = r2.mRootView
            androidx.leanback.app.DetailsFragment$15 r4 = new androidx.leanback.app.DetailsFragment$15
            r4.<init>(r2)
            r3.setOnDispatchKeyListener(r4)
            androidx.leanback.app.RowsFragment r3 = r2.mRowsFragment
            androidx.leanback.app.DetailsFragment$11 r4 = new androidx.leanback.app.DetailsFragment$11
            r4.<init>(r2)
            r3.mExternalAdapterListener = r4
            androidx.leanback.widget.BrowseFrameLayout r3 = r2.mRootView
            return r3
    }

    @Override // androidx.leanback.app.BaseFragment
    public final void onEntranceTransitionEnd() {
            r1 = this;
            androidx.leanback.app.RowsFragment r0 = r1.mRowsFragment
            r0.onTransitionEnd()
            return
    }

    @Override // androidx.leanback.app.BaseFragment
    public final void onEntranceTransitionPrepare() {
            r1 = this;
            androidx.leanback.app.RowsFragment r0 = r1.mRowsFragment
            r0.onTransitionPrepare()
            return
    }

    @Override // androidx.leanback.app.BaseFragment
    public final void onEntranceTransitionStart() {
            r1 = this;
            androidx.leanback.app.RowsFragment r0 = r1.mRowsFragment
            r0.onTransitionStart()
            return
    }

    @Override // androidx.leanback.app.BrandedFragment
    public android.view.View onInflateTitleView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            android.view.View r1 = super.onInflateTitleView(r1, r2, r3)
            return r1
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onStart() {
            r2 = this;
            super.onStart()
            r2.setupChildFragmentLayout()
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$Event r1 = r2.EVT_ONSTART
            r0.fireEvent(r1)
            androidx.leanback.widget.DetailsParallax r0 = r2.mDetailsParallax
            if (r0 == 0) goto L1a
            androidx.leanback.app.RowsFragment r1 = r2.mRowsFragment
            androidx.leanback.widget.VerticalGridView r1 = r1.getVerticalGridView()
            r0.setRecyclerView(r1)
        L1a:
            boolean r0 = r2.mPendingFocusOnVideo
            if (r0 == 0) goto L22
            r2.slideOutGridView()
            goto L35
        L22:
            android.view.View r0 = r2.getView()
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L35
            androidx.leanback.app.RowsFragment r0 = r2.mRowsFragment
            androidx.leanback.widget.VerticalGridView r0 = r0.getVerticalGridView()
            r0.requestFocus()
        L35:
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            androidx.leanback.app.DetailsFragmentBackgroundController r0 = r1.mDetailsBackgroundController
            if (r0 == 0) goto Lb
            androidx.leanback.media.PlaybackGlue r0 = r0.mPlaybackGlue
            if (r0 == 0) goto Lb
            r0.pause()
        Lb:
            super.onStop()
            return
    }

    @Override // androidx.leanback.app.BaseFragment
    public final void runEntranceTransition(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.mSceneAfterEntranceTransition
            androidx.leanback.transition.TransitionHelper.runTransition(r0, r2)
            return
    }

    public void setAdapter(androidx.leanback.widget.ObjectAdapter r11) {
            r10 = this;
            r10.mAdapter = r11
            androidx.leanback.widget.PresenterSelector r0 = r11.getPresenterSelector()
            androidx.leanback.widget.Presenter[] r0 = r0.getPresenters()
            if (r0 == 0) goto L6b
            r1 = 0
            r2 = 0
        Le:
            int r3 = r0.length
            if (r2 >= r3) goto L72
            r3 = r0[r2]
            boolean r4 = r3 instanceof androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter
            if (r4 == 0) goto L68
            androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter r3 = (androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter) r3
            androidx.leanback.widget.ItemAlignmentFacet r4 = new androidx.leanback.widget.ItemAlignmentFacet
            r4.<init>()
            androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef r5 = new androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef
            r5.<init>()
            int r6 = androidx.leanback.R.id.details_frame
            r5.setItemAlignmentViewId(r6)
            android.content.res.Resources r7 = r10.getResources()
            int r8 = androidx.leanback.R.dimen.lb_details_v2_align_pos_for_actions
            int r7 = r7.getDimensionPixelSize(r8)
            int r7 = -r7
            r5.setItemAlignmentOffset(r7)
            r7 = 0
            r5.setItemAlignmentOffsetPercent(r7)
            androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef r8 = new androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef
            r8.<init>()
            r8.setItemAlignmentViewId(r6)
            int r6 = androidx.leanback.R.id.details_overview_description
            r8.setItemAlignmentFocusViewId(r6)
            android.content.res.Resources r6 = r10.getResources()
            int r9 = androidx.leanback.R.dimen.lb_details_v2_align_pos_for_description
            int r6 = r6.getDimensionPixelSize(r9)
            int r6 = -r6
            r8.setItemAlignmentOffset(r6)
            r8.setItemAlignmentOffsetPercent(r7)
            r6 = 2
            androidx.leanback.widget.ItemAlignmentFacet$ItemAlignmentDef[] r6 = new androidx.leanback.widget.ItemAlignmentFacet.ItemAlignmentDef[r6]
            r6[r1] = r5
            r5 = 1
            r6[r5] = r8
            r4.setAlignmentDefs(r6)
            java.lang.Class<androidx.leanback.widget.ItemAlignmentFacet> r5 = androidx.leanback.widget.ItemAlignmentFacet.class
            r3.setFacet(r5, r4)
        L68:
            int r2 = r2 + 1
            goto Le
        L6b:
            java.lang.String r0 = "DetailsFragment"
            java.lang.String r1 = "PresenterSelector.getPresenters() not implemented"
            android.util.Log.e(r0, r1)
        L72:
            androidx.leanback.app.RowsFragment r0 = r10.mRowsFragment
            if (r0 == 0) goto L79
            r0.setAdapter(r11)
        L79:
            return
    }

    public void setOnItemViewClickedListener(androidx.leanback.widget.BaseOnItemViewClickedListener r2) {
            r1 = this;
            androidx.leanback.widget.BaseOnItemViewClickedListener r0 = r1.mOnItemViewClickedListener
            if (r0 == r2) goto Ld
            r1.mOnItemViewClickedListener = r2
            androidx.leanback.app.RowsFragment r0 = r1.mRowsFragment
            if (r0 == 0) goto Ld
            r0.setOnItemViewClickedListener(r2)
        Ld:
            return
    }

    public void setOnItemViewSelectedListener(androidx.leanback.widget.BaseOnItemViewSelectedListener r1) {
            r0 = this;
            r0.mExternalOnItemViewSelectedListener = r1
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
            androidx.leanback.app.DetailsFragment$SetSelectionRunnable r0 = r1.mSetSelectionRunnable
            r0.mPosition = r2
            r0.mSmooth = r3
            android.view.View r2 = r1.getView()
            if (r2 == 0) goto L23
            android.view.View r2 = r1.getView()
            android.os.Handler r2 = r2.getHandler()
            if (r2 == 0) goto L23
            android.view.View r2 = r1.getView()
            android.os.Handler r2 = r2.getHandler()
            androidx.leanback.app.DetailsFragment$SetSelectionRunnable r3 = r1.mSetSelectionRunnable
            r2.post(r3)
        L23:
            return
    }

    public final void slideOutGridView() {
            r1 = this;
            androidx.leanback.widget.VerticalGridView r0 = r1.getVerticalGridView()
            if (r0 == 0) goto Ld
            androidx.leanback.widget.VerticalGridView r0 = r1.getVerticalGridView()
            r0.animateOut()
        Ld:
            return
    }

    public final void switchToVideo() {
            r2 = this;
            android.app.Fragment r0 = r2.mVideoFragment
            if (r0 == 0) goto L14
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L14
            android.app.Fragment r0 = r2.mVideoFragment
            android.view.View r0 = r0.getView()
            r0.requestFocus()
            goto L1b
        L14:
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$Event r1 = r2.EVT_SWITCH_TO_VIDEO
            r0.fireEvent(r1)
        L1b:
            return
    }
}
