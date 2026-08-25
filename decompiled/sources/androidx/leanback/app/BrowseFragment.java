package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class BrowseFragment extends androidx.leanback.app.BaseFragment {
    private static final java.lang.String ARG_HEADERS_STATE = null;
    private static final java.lang.String ARG_TITLE = null;
    private static final java.lang.String CURRENT_SELECTED_POSITION = "currentSelectedPosition";
    public static final int HEADERS_DISABLED = 3;
    public static final int HEADERS_ENABLED = 1;
    public static final int HEADERS_HIDDEN = 2;
    private static final java.lang.String IS_PAGE_ROW = "isPageRow";
    private static final java.lang.String LB_HEADERS_BACKSTACK = "lbHeadersBackStack_";
    public final androidx.leanback.util.StateMachine.Event EVT_HEADER_VIEW_CREATED;
    public final androidx.leanback.util.StateMachine.Event EVT_MAIN_FRAGMENT_VIEW_CREATED;
    public final androidx.leanback.util.StateMachine.Event EVT_SCREEN_DATA_READY;
    public final androidx.leanback.util.StateMachine.State STATE_SET_ENTRANCE_START_STATE;
    private androidx.leanback.widget.ObjectAdapter mAdapter;
    private androidx.leanback.widget.PresenterSelector mAdapterPresenter;
    public androidx.leanback.app.BrowseFragment.BackStackListener mBackStackChangedListener;
    private int mBrandColor;
    private boolean mBrandColorSet;
    public androidx.leanback.widget.BrowseFrameLayout mBrowseFrame;
    public androidx.leanback.app.BrowseFragment.BrowseTransitionListener mBrowseTransitionListener;
    public boolean mCanShowHeaders;
    private int mContainerListAlignTop;
    private int mContainerListMarginStart;
    public androidx.leanback.widget.OnItemViewSelectedListener mExternalOnItemViewSelectedListener;
    private androidx.leanback.app.HeadersFragment.OnHeaderClickedListener mHeaderClickedListener;
    private androidx.leanback.widget.PresenterSelector mHeaderPresenterSelector;
    private androidx.leanback.app.HeadersFragment.OnHeaderViewSelectedListener mHeaderViewSelectedListener;
    public boolean mHeadersBackStackEnabled;
    public androidx.leanback.app.HeadersFragment mHeadersFragment;
    private int mHeadersState;
    public java.lang.Object mHeadersTransition;
    public boolean mIsPageRow;
    public android.app.Fragment mMainFragment;
    public androidx.leanback.app.BrowseFragment.MainFragmentAdapter mMainFragmentAdapter;
    private androidx.leanback.app.BrowseFragment.MainFragmentAdapterRegistry mMainFragmentAdapterRegistry;
    public androidx.leanback.app.ListRowDataAdapter mMainFragmentListRowDataAdapter;
    public androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter mMainFragmentRowsAdapter;
    private boolean mMainFragmentScaleEnabled;
    private final androidx.leanback.widget.BrowseFrameLayout.OnChildFocusListener mOnChildFocusListener;
    private final androidx.leanback.widget.BrowseFrameLayout.OnFocusSearchListener mOnFocusSearchListener;
    private androidx.leanback.widget.OnItemViewClickedListener mOnItemViewClickedListener;
    public java.lang.Object mPageRow;
    private float mScaleFactor;
    private androidx.leanback.widget.ScaleFrameLayout mScaleFrameLayout;
    private java.lang.Object mSceneAfterEntranceTransition;
    public java.lang.Object mSceneWithHeaders;
    public java.lang.Object mSceneWithoutHeaders;
    private int mSelectedPosition;
    private final androidx.leanback.app.BrowseFragment.SetSelectionRunnable mSetSelectionRunnable;
    public boolean mShowingHeaders;
    public boolean mStopped;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener mWaitScrollFinishAndCommitMainFragment;
    public java.lang.String mWithHeadersBackStackName;













    public final class BackStackListener implements android.app.FragmentManager.OnBackStackChangedListener {
        public int mIndexOfHeadersBackStack;
        public int mLastEntryCount;
        public final /* synthetic */ androidx.leanback.app.BrowseFragment this$0;

        public BackStackListener(androidx.leanback.app.BrowseFragment r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                android.app.FragmentManager r1 = r1.getFragmentManager()
                int r1 = r1.getBackStackEntryCount()
                r0.mLastEntryCount = r1
                r1 = -1
                r0.mIndexOfHeadersBackStack = r1
                return
        }

        @Override // android.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChanged() {
                r4 = this;
                androidx.leanback.app.BrowseFragment r0 = r4.this$0
                android.app.FragmentManager r0 = r0.getFragmentManager()
                if (r0 != 0) goto L15
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "BrowseFragment"
                java.lang.String r2 = "getFragmentManager() is null, stack:"
                android.util.Log.w(r1, r2, r0)
                return
            L15:
                androidx.leanback.app.BrowseFragment r0 = r4.this$0
                android.app.FragmentManager r0 = r0.getFragmentManager()
                int r0 = r0.getBackStackEntryCount()
                int r1 = r4.mLastEntryCount
                if (r0 <= r1) goto L40
                androidx.leanback.app.BrowseFragment r1 = r4.this$0
                android.app.FragmentManager r1 = r1.getFragmentManager()
                int r2 = r0 + (-1)
                android.app.FragmentManager$BackStackEntry r1 = r1.getBackStackEntryAt(r2)
                androidx.leanback.app.BrowseFragment r3 = r4.this$0
                java.lang.String r3 = r3.mWithHeadersBackStackName
                java.lang.String r1 = r1.getName()
                boolean r1 = r3.equals(r1)
                if (r1 == 0) goto L71
                r4.mIndexOfHeadersBackStack = r2
                goto L71
            L40:
                if (r0 >= r1) goto L71
                int r1 = r4.mIndexOfHeadersBackStack
                if (r1 < r0) goto L71
                androidx.leanback.app.BrowseFragment r1 = r4.this$0
                boolean r1 = r1.isHeadersDataReady()
                if (r1 != 0) goto L64
                androidx.leanback.app.BrowseFragment r0 = r4.this$0
                android.app.FragmentManager r0 = r0.getFragmentManager()
                android.app.FragmentTransaction r0 = r0.beginTransaction()
                androidx.leanback.app.BrowseFragment r1 = r4.this$0
                java.lang.String r1 = r1.mWithHeadersBackStackName
                android.app.FragmentTransaction r0 = r0.addToBackStack(r1)
                r0.commit()
                return
            L64:
                r1 = -1
                r4.mIndexOfHeadersBackStack = r1
                androidx.leanback.app.BrowseFragment r1 = r4.this$0
                boolean r2 = r1.mShowingHeaders
                if (r2 != 0) goto L71
                r2 = 1
                r1.startHeadersTransitionInternal(r2)
            L71:
                r4.mLastEntryCount = r0
                return
        }
    }

    @java.lang.Deprecated
    public static class BrowseTransitionListener {
        public BrowseTransitionListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onHeadersTransitionStart(boolean r1) {
                r0 = this;
                return
        }

        public void onHeadersTransitionStop(boolean r1) {
                r0 = this;
                return
        }
    }

    public class ExpandPreLayout implements android.view.ViewTreeObserver.OnPreDrawListener {
        private final java.lang.Runnable mCallback;
        private int mState;
        private final android.view.View mView;
        private androidx.leanback.app.BrowseFragment.MainFragmentAdapter mainFragmentAdapter;
        public final /* synthetic */ androidx.leanback.app.BrowseFragment this$0;

        public ExpandPreLayout(androidx.leanback.app.BrowseFragment r1, java.lang.Runnable r2, androidx.leanback.app.BrowseFragment.MainFragmentAdapter r3, android.view.View r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mView = r4
                r0.mCallback = r2
                r0.mainFragmentAdapter = r3
                return
        }

        public final void execute() {
                r2 = this;
                android.view.View r0 = r2.mView
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.addOnPreDrawListener(r2)
                androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r2.mainFragmentAdapter
                r1 = 0
                r0.setExpand(r1)
                android.view.View r0 = r2.mView
                r0.invalidate()
                r2.mState = r1
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r2 = this;
                androidx.leanback.app.BrowseFragment r0 = r2.this$0
                android.view.View r0 = r0.getView()
                r1 = 1
                if (r0 == 0) goto L38
                androidx.leanback.app.BrowseFragment r0 = r2.this$0
                android.content.Context r0 = androidx.leanback.app.FragmentUtil.getContext(r0)
                if (r0 != 0) goto L12
                goto L38
            L12:
                int r0 = r2.mState
                if (r0 != 0) goto L23
                androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r2.mainFragmentAdapter
                r0.setExpand(r1)
                android.view.View r0 = r2.mView
                r0.invalidate()
                r2.mState = r1
                goto L36
            L23:
                if (r0 != r1) goto L36
                java.lang.Runnable r0 = r2.mCallback
                r0.run()
                android.view.View r0 = r2.mView
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnPreDrawListener(r2)
                r0 = 2
                r2.mState = r0
            L36:
                r0 = 0
                return r0
            L38:
                android.view.View r0 = r2.mView
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnPreDrawListener(r2)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.Deprecated
    public static abstract class FragmentFactory<T extends android.app.Fragment> {
        public FragmentFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract T createFragment(java.lang.Object r1);
    }

    @java.lang.Deprecated
    public interface FragmentHost {
        void notifyDataReady(androidx.leanback.app.BrowseFragment.MainFragmentAdapter r1);

        void notifyViewCreated(androidx.leanback.app.BrowseFragment.MainFragmentAdapter r1);

        void showTitleView(boolean r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public final class FragmentHostImpl implements androidx.leanback.app.BrowseFragment.FragmentHost {
        public boolean mShowTitleView;
        public final /* synthetic */ androidx.leanback.app.BrowseFragment this$0;

        public FragmentHostImpl(androidx.leanback.app.BrowseFragment r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 1
                r0.mShowTitleView = r1
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.FragmentHost
        public void notifyDataReady(androidx.leanback.app.BrowseFragment.MainFragmentAdapter r2) {
                r1 = this;
                androidx.leanback.app.BrowseFragment r2 = r1.this$0
                androidx.leanback.app.BrowseFragment$MainFragmentAdapter r2 = r2.mMainFragmentAdapter
                if (r2 == 0) goto L1b
                androidx.leanback.app.BrowseFragment$FragmentHost r2 = r2.getFragmentHost()
                if (r2 == r1) goto Ld
                goto L1b
            Ld:
                androidx.leanback.app.BrowseFragment r2 = r1.this$0
                boolean r0 = r2.mIsPageRow
                if (r0 != 0) goto L14
                return
            L14:
                androidx.leanback.util.StateMachine r0 = r2.mStateMachine
                androidx.leanback.util.StateMachine$Event r2 = r2.EVT_SCREEN_DATA_READY
                r0.fireEvent(r2)
            L1b:
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.FragmentHost
        public void notifyViewCreated(androidx.leanback.app.BrowseFragment.MainFragmentAdapter r2) {
                r1 = this;
                androidx.leanback.app.BrowseFragment r2 = r1.this$0
                androidx.leanback.util.StateMachine r0 = r2.mStateMachine
                androidx.leanback.util.StateMachine$Event r2 = r2.EVT_MAIN_FRAGMENT_VIEW_CREATED
                r0.fireEvent(r2)
                androidx.leanback.app.BrowseFragment r2 = r1.this$0
                boolean r0 = r2.mIsPageRow
                if (r0 != 0) goto L16
                androidx.leanback.util.StateMachine r0 = r2.mStateMachine
                androidx.leanback.util.StateMachine$Event r2 = r2.EVT_SCREEN_DATA_READY
                r0.fireEvent(r2)
            L16:
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.FragmentHost
        public void showTitleView(boolean r2) {
                r1 = this;
                r1.mShowTitleView = r2
                androidx.leanback.app.BrowseFragment r2 = r1.this$0
                androidx.leanback.app.BrowseFragment$MainFragmentAdapter r2 = r2.mMainFragmentAdapter
                if (r2 == 0) goto L19
                androidx.leanback.app.BrowseFragment$FragmentHost r2 = r2.getFragmentHost()
                if (r2 == r1) goto Lf
                goto L19
            Lf:
                androidx.leanback.app.BrowseFragment r2 = r1.this$0
                boolean r0 = r2.mIsPageRow
                if (r0 != 0) goto L16
                return
            L16:
                r2.updateTitleViewVisibility()
            L19:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.Deprecated
    public static class ListRowFragmentFactory extends androidx.leanback.app.BrowseFragment.FragmentFactory<androidx.leanback.app.RowsFragment> {
        public ListRowFragmentFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.leanback.app.BrowseFragment.FragmentFactory
        public /* bridge */ /* synthetic */ android.app.Fragment createFragment(java.lang.Object r1) {
                r0 = this;
                androidx.leanback.app.RowsFragment r1 = r0.createFragment(r1)
                return r1
        }

        @Override // androidx.leanback.app.BrowseFragment.FragmentFactory
        public androidx.leanback.app.RowsFragment createFragment(java.lang.Object r1) {
                r0 = this;
                androidx.leanback.app.RowsFragment r1 = new androidx.leanback.app.RowsFragment
                r1.<init>()
                return r1
        }
    }

    @java.lang.Deprecated
    public static class MainFragmentAdapter<T extends android.app.Fragment> {
        private final T mFragment;
        public androidx.leanback.app.BrowseFragment.FragmentHostImpl mFragmentHost;
        private boolean mScalingEnabled;

        public MainFragmentAdapter(T r1) {
                r0 = this;
                r0.<init>()
                r0.mFragment = r1
                return
        }

        public final T getFragment() {
                r1 = this;
                T extends android.app.Fragment r0 = r1.mFragment
                return r0
        }

        public final androidx.leanback.app.BrowseFragment.FragmentHost getFragmentHost() {
                r1 = this;
                androidx.leanback.app.BrowseFragment$FragmentHostImpl r0 = r1.mFragmentHost
                return r0
        }

        public boolean isScalingEnabled() {
                r1 = this;
                boolean r0 = r1.mScalingEnabled
                return r0
        }

        public boolean isScrolling() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void onTransitionEnd() {
                r0 = this;
                return
        }

        public boolean onTransitionPrepare() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void onTransitionStart() {
                r0 = this;
                return
        }

        public void setAlignment(int r1) {
                r0 = this;
                return
        }

        public void setEntranceTransitionState(boolean r1) {
                r0 = this;
                return
        }

        public void setExpand(boolean r1) {
                r0 = this;
                return
        }

        public void setScalingEnabled(boolean r1) {
                r0 = this;
                r0.mScalingEnabled = r1
                return
        }
    }

    @java.lang.Deprecated
    public interface MainFragmentAdapterProvider {
        androidx.leanback.app.BrowseFragment.MainFragmentAdapter getMainFragmentAdapter();
    }

    @java.lang.Deprecated
    public static final class MainFragmentAdapterRegistry {
        private static final androidx.leanback.app.BrowseFragment.FragmentFactory sDefaultFragmentFactory = null;
        private final java.util.Map<java.lang.Class, androidx.leanback.app.BrowseFragment.FragmentFactory> mItemToFragmentFactoryMapping;

        static {
                androidx.leanback.app.BrowseFragment$ListRowFragmentFactory r0 = new androidx.leanback.app.BrowseFragment$ListRowFragmentFactory
                r0.<init>()
                androidx.leanback.app.BrowseFragment.MainFragmentAdapterRegistry.sDefaultFragmentFactory = r0
                return
        }

        public MainFragmentAdapterRegistry() {
                r2 = this;
                r2.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.mItemToFragmentFactoryMapping = r0
                java.lang.Class<androidx.leanback.widget.ListRow> r0 = androidx.leanback.widget.ListRow.class
                androidx.leanback.app.BrowseFragment$FragmentFactory r1 = androidx.leanback.app.BrowseFragment.MainFragmentAdapterRegistry.sDefaultFragmentFactory
                r2.registerFragment(r0, r1)
                return
        }

        public android.app.Fragment createFragment(java.lang.Object r3) {
                r2 = this;
                if (r3 != 0) goto L5
                androidx.leanback.app.BrowseFragment$FragmentFactory r0 = androidx.leanback.app.BrowseFragment.MainFragmentAdapterRegistry.sDefaultFragmentFactory
                goto L11
            L5:
                java.util.Map<java.lang.Class, androidx.leanback.app.BrowseFragment$FragmentFactory> r0 = r2.mItemToFragmentFactoryMapping
                java.lang.Class r1 = r3.getClass()
                java.lang.Object r0 = r0.get(r1)
                androidx.leanback.app.BrowseFragment$FragmentFactory r0 = (androidx.leanback.app.BrowseFragment.FragmentFactory) r0
            L11:
                if (r0 != 0) goto L19
                boolean r1 = r3 instanceof androidx.leanback.widget.PageRow
                if (r1 != 0) goto L19
                androidx.leanback.app.BrowseFragment$FragmentFactory r0 = androidx.leanback.app.BrowseFragment.MainFragmentAdapterRegistry.sDefaultFragmentFactory
            L19:
                android.app.Fragment r3 = r0.createFragment(r3)
                return r3
        }

        public void registerFragment(java.lang.Class r2, androidx.leanback.app.BrowseFragment.FragmentFactory r3) {
                r1 = this;
                java.util.Map<java.lang.Class, androidx.leanback.app.BrowseFragment$FragmentFactory> r0 = r1.mItemToFragmentFactoryMapping
                r0.put(r2, r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class MainFragmentItemViewSelectedListener implements androidx.leanback.widget.OnItemViewSelectedListener {
        public androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter mMainFragmentRowsAdapter;
        public final /* synthetic */ androidx.leanback.app.BrowseFragment this$0;

        public MainFragmentItemViewSelectedListener(androidx.leanback.app.BrowseFragment r1, androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mMainFragmentRowsAdapter = r2
                return
        }

        /* JADX INFO: renamed from: onItemSelected, reason: avoid collision after fix types in other method */
        public void onItemSelected2(androidx.leanback.widget.Presenter.ViewHolder r3, java.lang.Object r4, androidx.leanback.widget.RowPresenter.ViewHolder r5, androidx.leanback.widget.Row r6) {
                r2 = this;
                androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapter r0 = r2.mMainFragmentRowsAdapter
                int r0 = r0.getSelectedPosition()
                androidx.leanback.app.BrowseFragment r1 = r2.this$0
                r1.onRowSelected(r0)
                androidx.leanback.app.BrowseFragment r0 = r2.this$0
                androidx.leanback.widget.OnItemViewSelectedListener r0 = r0.mExternalOnItemViewSelectedListener
                if (r0 == 0) goto L14
                r0.onItemSelected(r3, r4, r5, r6)
            L14:
                return
        }

        @Override // androidx.leanback.widget.BaseOnItemViewSelectedListener
        public /* bridge */ /* synthetic */ void onItemSelected(androidx.leanback.widget.Presenter.ViewHolder r1, java.lang.Object r2, androidx.leanback.widget.RowPresenter.ViewHolder r3, androidx.leanback.widget.Row r4) {
                r0 = this;
                androidx.leanback.widget.Row r4 = (androidx.leanback.widget.Row) r4
                r0.onItemSelected2(r1, r2, r3, r4)
                return
        }
    }

    @java.lang.Deprecated
    public static class MainFragmentRowsAdapter<T extends android.app.Fragment> {
        private final T mFragment;

        public MainFragmentRowsAdapter(T r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L8
                r1.mFragment = r2
                return
            L8:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Fragment can't be null"
                r2.<init>(r0)
                throw r2
        }

        public androidx.leanback.widget.RowPresenter.ViewHolder findRowViewHolderByPosition(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public final T getFragment() {
                r1 = this;
                T extends android.app.Fragment r0 = r1.mFragment
                return r0
        }

        public int getSelectedPosition() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void setAdapter(androidx.leanback.widget.ObjectAdapter r1) {
                r0 = this;
                return
        }

        public void setOnItemViewClickedListener(androidx.leanback.widget.OnItemViewClickedListener r1) {
                r0 = this;
                return
        }

        public void setOnItemViewSelectedListener(androidx.leanback.widget.OnItemViewSelectedListener r1) {
                r0 = this;
                return
        }

        public void setSelectedPosition(int r1, boolean r2) {
                r0 = this;
                return
        }

        public void setSelectedPosition(int r1, boolean r2, androidx.leanback.widget.Presenter.ViewHolderTask r3) {
                r0 = this;
                return
        }
    }

    @java.lang.Deprecated
    public interface MainFragmentRowsAdapterProvider {
        androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter getMainFragmentRowsAdapter();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class SetSelectionRunnable implements java.lang.Runnable {
        private int mPosition;
        private boolean mSmooth;
        private int mType;
        public final /* synthetic */ androidx.leanback.app.BrowseFragment this$0;

        public SetSelectionRunnable(androidx.leanback.app.BrowseFragment r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.reset()
                return
        }

        private void reset() {
                r1 = this;
                r0 = -1
                r1.mPosition = r0
                r1.mType = r0
                r0 = 0
                r1.mSmooth = r0
                return
        }

        public final void post(int r2, int r3, boolean r4) {
                r1 = this;
                int r0 = r1.mType
                if (r3 < r0) goto L1c
                r1.mPosition = r2
                r1.mType = r3
                r1.mSmooth = r4
                androidx.leanback.app.BrowseFragment r2 = r1.this$0
                androidx.leanback.widget.BrowseFrameLayout r2 = r2.mBrowseFrame
                r2.removeCallbacks(r1)
                androidx.leanback.app.BrowseFragment r2 = r1.this$0
                boolean r3 = r2.mStopped
                if (r3 != 0) goto L1c
                androidx.leanback.widget.BrowseFrameLayout r2 = r2.mBrowseFrame
                r2.post(r1)
            L1c:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.leanback.app.BrowseFragment r0 = r3.this$0
                int r1 = r3.mPosition
                boolean r2 = r3.mSmooth
                r0.setSelection(r1, r2)
                r3.reset()
                return
        }

        public void start() {
                r2 = this;
                int r0 = r2.mType
                r1 = -1
                if (r0 == r1) goto Lc
                androidx.leanback.app.BrowseFragment r0 = r2.this$0
                androidx.leanback.widget.BrowseFrameLayout r0 = r0.mBrowseFrame
                r0.post(r2)
            Lc:
                return
        }

        public void stop() {
                r1 = this;
                androidx.leanback.app.BrowseFragment r0 = r1.this$0
                androidx.leanback.widget.BrowseFrameLayout r0 = r0.mBrowseFrame
                r0.removeCallbacks(r1)
                return
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<androidx.leanback.app.BrowseFragment> r1 = androidx.leanback.app.BrowseFragment.class
            java.lang.String r1 = r1.getCanonicalName()
            r0.append(r1)
            java.lang.String r1 = ".title"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.leanback.app.BrowseFragment.ARG_TITLE = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<androidx.leanback.app.BrowseFragment> r1 = androidx.leanback.app.BrowseFragment.class
            java.lang.String r1 = r1.getCanonicalName()
            r0.append(r1)
            java.lang.String r1 = ".headersState"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.leanback.app.BrowseFragment.ARG_HEADERS_STATE = r0
            return
    }

    public BrowseFragment() {
            r2 = this;
            r2.<init>()
            androidx.leanback.app.BrowseFragment$1 r0 = new androidx.leanback.app.BrowseFragment$1
            r0.<init>(r2)
            r2.STATE_SET_ENTRANCE_START_STATE = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "headerFragmentViewCreated"
            r0.<init>(r1)
            r2.EVT_HEADER_VIEW_CREATED = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "mainFragmentViewCreated"
            r0.<init>(r1)
            r2.EVT_MAIN_FRAGMENT_VIEW_CREATED = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "screenDataReady"
            r0.<init>(r1)
            r2.EVT_SCREEN_DATA_READY = r0
            androidx.leanback.app.BrowseFragment$MainFragmentAdapterRegistry r0 = new androidx.leanback.app.BrowseFragment$MainFragmentAdapterRegistry
            r0.<init>()
            r2.mMainFragmentAdapterRegistry = r0
            r0 = 1
            r2.mHeadersState = r0
            r1 = 0
            r2.mBrandColor = r1
            r2.mHeadersBackStackEnabled = r0
            r2.mShowingHeaders = r0
            r2.mCanShowHeaders = r0
            r2.mMainFragmentScaleEnabled = r0
            r1 = -1
            r2.mSelectedPosition = r1
            r2.mStopped = r0
            androidx.leanback.app.BrowseFragment$SetSelectionRunnable r0 = new androidx.leanback.app.BrowseFragment$SetSelectionRunnable
            r0.<init>(r2)
            r2.mSetSelectionRunnable = r0
            androidx.leanback.app.BrowseFragment$4 r0 = new androidx.leanback.app.BrowseFragment$4
            r0.<init>(r2)
            r2.mOnFocusSearchListener = r0
            androidx.leanback.app.BrowseFragment$5 r0 = new androidx.leanback.app.BrowseFragment$5
            r0.<init>(r2)
            r2.mOnChildFocusListener = r0
            androidx.leanback.app.BrowseFragment$10 r0 = new androidx.leanback.app.BrowseFragment$10
            r0.<init>(r2)
            r2.mHeaderClickedListener = r0
            androidx.leanback.app.BrowseFragment$11 r0 = new androidx.leanback.app.BrowseFragment$11
            r0.<init>(r2)
            r2.mHeaderViewSelectedListener = r0
            androidx.leanback.app.BrowseFragment$12 r0 = new androidx.leanback.app.BrowseFragment$12
            r0.<init>(r2)
            r2.mWaitScrollFinishAndCommitMainFragment = r0
            return
    }

    public static android.os.Bundle createArgs(android.os.Bundle r1, java.lang.String r2, int r3) {
            if (r1 != 0) goto L7
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L7:
            java.lang.String r0 = androidx.leanback.app.BrowseFragment.ARG_TITLE
            r1.putString(r0, r2)
            java.lang.String r2 = androidx.leanback.app.BrowseFragment.ARG_HEADERS_STATE
            r1.putInt(r2, r3)
            return r1
    }

    private boolean createMainFragment(androidx.leanback.widget.ObjectAdapter r7, int r8) {
            r6 = this;
            boolean r0 = r6.mCanShowHeaders
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L9
            r7 = r1
            goto L21
        L9:
            if (r7 == 0) goto L77
            int r0 = r7.size()
            if (r0 != 0) goto L13
            goto L77
        L13:
            if (r8 >= 0) goto L17
            r8 = 0
            goto L1d
        L17:
            int r0 = r7.size()
            if (r8 >= r0) goto L63
        L1d:
            java.lang.Object r7 = r7.get(r8)
        L21:
            boolean r8 = r6.mIsPageRow
            java.lang.Object r0 = r6.mPageRow
            boolean r4 = r6.mCanShowHeaders
            if (r4 == 0) goto L2f
            boolean r4 = r7 instanceof androidx.leanback.widget.PageRow
            if (r4 == 0) goto L2f
            r4 = 1
            goto L30
        L2f:
            r4 = 0
        L30:
            r6.mIsPageRow = r4
            if (r4 == 0) goto L35
            r1 = r7
        L35:
            r6.mPageRow = r1
            android.app.Fragment r5 = r6.mMainFragment
            if (r5 != 0) goto L3c
            goto L48
        L3c:
            if (r8 == 0) goto L47
            if (r4 == 0) goto L48
            if (r0 != 0) goto L44
        L42:
            r2 = 0
            goto L48
        L44:
            if (r0 == r1) goto L42
            goto L48
        L47:
            r2 = r4
        L48:
            if (r2 == 0) goto L62
            androidx.leanback.app.BrowseFragment$MainFragmentAdapterRegistry r8 = r6.mMainFragmentAdapterRegistry
            android.app.Fragment r7 = r8.createFragment(r7)
            r6.mMainFragment = r7
            boolean r7 = r7 instanceof androidx.leanback.app.BrowseFragment.MainFragmentAdapterProvider
            if (r7 == 0) goto L5a
            r6.setMainFragmentAdapter()
            goto L62
        L5a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Fragment must implement MainFragmentAdapterProvider"
            r7.<init>(r8)
            throw r7
        L62:
            return r2
        L63:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0[r3] = r8
            java.lang.String r8 = "Invalid position %d requested"
            java.lang.String r8 = java.lang.String.format(r8, r0)
            r7.<init>(r8)
            throw r7
        L77:
            return r3
    }

    private void expandMainFragment(boolean r3) {
            r2 = this;
            androidx.leanback.widget.ScaleFrameLayout r0 = r2.mScaleFrameLayout
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r3 != 0) goto Ld
            int r1 = r2.mContainerListMarginStart
            goto Le
        Ld:
            r1 = 0
        Le:
            r0.setMarginStart(r1)
            androidx.leanback.widget.ScaleFrameLayout r1 = r2.mScaleFrameLayout
            r1.setLayoutParams(r0)
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r2.mMainFragmentAdapter
            r0.setExpand(r3)
            r2.setMainFragmentAlignment()
            if (r3 != 0) goto L2f
            boolean r3 = r2.mMainFragmentScaleEnabled
            if (r3 == 0) goto L2f
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r3 = r2.mMainFragmentAdapter
            boolean r3 = r3.isScalingEnabled()
            if (r3 == 0) goto L2f
            float r3 = r2.mScaleFactor
            goto L31
        L2f:
            r3 = 1065353216(0x3f800000, float:1.0)
        L31:
            androidx.leanback.widget.ScaleFrameLayout r0 = r2.mScaleFrameLayout
            r0.setLayoutScaleY(r3)
            androidx.leanback.widget.ScaleFrameLayout r0 = r2.mScaleFrameLayout
            r0.setChildScale(r3)
            return
    }

    private void onExpandTransitionStart(boolean r3, java.lang.Runnable r4) {
            r2 = this;
            if (r3 == 0) goto L6
            r4.run()
            return
        L6:
            androidx.leanback.app.BrowseFragment$ExpandPreLayout r3 = new androidx.leanback.app.BrowseFragment$ExpandPreLayout
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r2.mMainFragmentAdapter
            android.view.View r1 = r2.getView()
            r3.<init>(r2, r4, r0, r1)
            r3.execute()
            return
    }

    private void readArguments(android.os.Bundle r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = androidx.leanback.app.BrowseFragment.ARG_TITLE
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L12
            java.lang.String r0 = r3.getString(r0)
            r2.setTitle(r0)
        L12:
            java.lang.String r0 = androidx.leanback.app.BrowseFragment.ARG_HEADERS_STATE
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L21
            int r3 = r3.getInt(r0)
            r2.setHeadersState(r3)
        L21:
            return
    }

    private void replaceMainFragment(int r2) {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            boolean r2 = r1.createMainFragment(r0, r2)
            if (r2 == 0) goto L1a
            r1.swapToMainFragment()
            boolean r2 = r1.mCanShowHeaders
            if (r2 == 0) goto L16
            boolean r2 = r1.mShowingHeaders
            if (r2 != 0) goto L14
            goto L16
        L14:
            r2 = 0
            goto L17
        L16:
            r2 = 1
        L17:
            r1.expandMainFragment(r2)
        L1a:
            return
    }

    private void setHeadersOnScreen(boolean r3) {
            r2 = this;
            androidx.leanback.app.HeadersFragment r0 = r2.mHeadersFragment
            android.view.View r0 = r0.getView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r3 == 0) goto L10
            r3 = 0
            goto L13
        L10:
            int r3 = r2.mContainerListMarginStart
            int r3 = -r3
        L13:
            r1.setMarginStart(r3)
            r0.setLayoutParams(r1)
            return
    }

    private void setMainFragmentAlignment() {
            r2 = this;
            int r0 = r2.mContainerListAlignTop
            boolean r1 = r2.mMainFragmentScaleEnabled
            if (r1 == 0) goto L1a
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r1 = r2.mMainFragmentAdapter
            boolean r1 = r1.isScalingEnabled()
            if (r1 == 0) goto L1a
            boolean r1 = r2.mShowingHeaders
            if (r1 == 0) goto L1a
            float r0 = (float) r0
            float r1 = r2.mScaleFactor
            float r0 = r0 / r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
        L1a:
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r1 = r2.mMainFragmentAdapter
            r1.setAlignment(r0)
            return
    }

    private void swapToMainFragment() {
            r4 = this;
            boolean r0 = r4.mStopped
            if (r0 == 0) goto L5
            return
        L5:
            androidx.leanback.app.HeadersFragment r0 = r4.mHeadersFragment
            androidx.leanback.widget.VerticalGridView r0 = r0.getVerticalGridView()
            boolean r1 = r4.isShowingHeaders()
            if (r1 == 0) goto L3a
            if (r0 == 0) goto L3a
            int r1 = r0.getScrollState()
            if (r1 == 0) goto L3a
            android.app.FragmentManager r1 = r4.getChildFragmentManager()
            android.app.FragmentTransaction r1 = r1.beginTransaction()
            int r2 = androidx.leanback.R.id.scale_frame
            android.app.Fragment r3 = new android.app.Fragment
            r3.<init>()
            android.app.FragmentTransaction r1 = r1.replace(r2, r3)
            r1.commit()
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r1 = r4.mWaitScrollFinishAndCommitMainFragment
            r0.removeOnScrollListener(r1)
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r1 = r4.mWaitScrollFinishAndCommitMainFragment
            r0.addOnScrollListener(r1)
            goto L3d
        L3a:
            r4.commitMainFragment()
        L3d:
            return
    }

    private void updateWrapperPresenter() {
            r7 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r7.mAdapter
            if (r0 != 0) goto L8
            r0 = 0
            r7.mAdapterPresenter = r0
            return
        L8:
            androidx.leanback.widget.PresenterSelector r0 = r0.getPresenterSelector()
            if (r0 == 0) goto L37
            androidx.leanback.widget.PresenterSelector r1 = r7.mAdapterPresenter
            if (r0 != r1) goto L13
            return
        L13:
            r7.mAdapterPresenter = r0
            androidx.leanback.widget.Presenter[] r1 = r0.getPresenters()
            androidx.leanback.widget.InvisibleRowPresenter r2 = new androidx.leanback.widget.InvisibleRowPresenter
            r2.<init>()
            int r3 = r1.length
            int r3 = r3 + 1
            androidx.leanback.widget.Presenter[] r4 = new androidx.leanback.widget.Presenter[r3]
            int r5 = r1.length
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r1, r6, r5)
            int r3 = r3 + (-1)
            r4[r3] = r2
            androidx.leanback.widget.ObjectAdapter r1 = r7.mAdapter
            androidx.leanback.app.BrowseFragment$2 r3 = new androidx.leanback.app.BrowseFragment$2
            r3.<init>(r0, r2, r4)
            r1.setPresenterSelector(r3)
            return
        L37:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Adapter.getPresenterSelector() is null"
            r0.<init>(r1)
            throw r0
    }

    public final void commitMainFragment() {
            r4 = this;
            android.app.FragmentManager r0 = r4.getChildFragmentManager()
            int r1 = androidx.leanback.R.id.scale_frame
            android.app.Fragment r2 = r0.findFragmentById(r1)
            android.app.Fragment r3 = r4.mMainFragment
            if (r2 == r3) goto L1b
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            android.app.Fragment r2 = r4.mMainFragment
            android.app.FragmentTransaction r0 = r0.replace(r1, r2)
            r0.commit()
        L1b:
            return
    }

    @Override // androidx.leanback.app.BaseFragment
    public final java.lang.Object createEntranceTransition() {
            r2 = this;
            android.content.Context r0 = androidx.leanback.app.FragmentUtil.getContext(r2)
            int r1 = androidx.leanback.R.transition.lb_browse_entrance_transition
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
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_HEADER_VIEW_CREATED
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_ON_PREPARED
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_ON_PREPARED_ON_CREATEVIEW
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_MAIN_FRAGMENT_VIEW_CREATED
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_ON_PREPARED
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_PERFORM
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_SCREEN_DATA_READY
            r0.addTransition(r1, r2, r3)
            return
    }

    public void enableMainFragmentScaling(boolean r1) {
            r0 = this;
            r0.mMainFragmentScaleEnabled = r1
            return
    }

    @java.lang.Deprecated
    public void enableRowScaling(boolean r1) {
            r0 = this;
            r0.enableMainFragmentScaling(r1)
            return
    }

    public androidx.leanback.widget.ObjectAdapter getAdapter() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            return r0
    }

    @androidx.annotation.ColorInt
    public int getBrandColor() {
            r1 = this;
            int r0 = r1.mBrandColor
            return r0
    }

    public androidx.leanback.app.HeadersFragment getHeadersFragment() {
            r1 = this;
            androidx.leanback.app.HeadersFragment r0 = r1.mHeadersFragment
            return r0
    }

    public int getHeadersState() {
            r1 = this;
            int r0 = r1.mHeadersState
            return r0
    }

    public android.app.Fragment getMainFragment() {
            r1 = this;
            android.app.Fragment r0 = r1.mMainFragment
            return r0
    }

    public final androidx.leanback.app.BrowseFragment.MainFragmentAdapterRegistry getMainFragmentRegistry() {
            r1 = this;
            androidx.leanback.app.BrowseFragment$MainFragmentAdapterRegistry r0 = r1.mMainFragmentAdapterRegistry
            return r0
    }

    public androidx.leanback.widget.OnItemViewClickedListener getOnItemViewClickedListener() {
            r1 = this;
            androidx.leanback.widget.OnItemViewClickedListener r0 = r1.mOnItemViewClickedListener
            return r0
    }

    public androidx.leanback.widget.OnItemViewSelectedListener getOnItemViewSelectedListener() {
            r1 = this;
            androidx.leanback.widget.OnItemViewSelectedListener r0 = r1.mExternalOnItemViewSelectedListener
            return r0
    }

    public androidx.leanback.app.RowsFragment getRowsFragment() {
            r2 = this;
            android.app.Fragment r0 = r2.mMainFragment
            boolean r1 = r0 instanceof androidx.leanback.app.RowsFragment
            if (r1 == 0) goto L9
            androidx.leanback.app.RowsFragment r0 = (androidx.leanback.app.RowsFragment) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int getSelectedPosition() {
            r1 = this;
            int r0 = r1.mSelectedPosition
            return r0
    }

    public androidx.leanback.widget.RowPresenter.ViewHolder getSelectedRowViewHolder() {
            r2 = this;
            androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapter r0 = r2.mMainFragmentRowsAdapter
            if (r0 == 0) goto Lf
            int r0 = r0.getSelectedPosition()
            androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapter r1 = r2.mMainFragmentRowsAdapter
            androidx.leanback.widget.RowPresenter$ViewHolder r0 = r1.findRowViewHolderByPosition(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final boolean isFirstRowWithContent(int r5) {
            r4 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r4.mAdapter
            r1 = 1
            if (r0 == 0) goto L2c
            int r0 = r0.size()
            if (r0 != 0) goto Lc
            goto L2c
        Lc:
            r0 = 0
            r2 = 0
        Le:
            androidx.leanback.widget.ObjectAdapter r3 = r4.mAdapter
            int r3 = r3.size()
            if (r2 >= r3) goto L2c
            androidx.leanback.widget.ObjectAdapter r3 = r4.mAdapter
            java.lang.Object r3 = r3.get(r2)
            androidx.leanback.widget.Row r3 = (androidx.leanback.widget.Row) r3
            boolean r3 = r3.isRenderedAsRowView()
            if (r3 == 0) goto L29
            if (r5 != r2) goto L27
            goto L28
        L27:
            r1 = 0
        L28:
            return r1
        L29:
            int r2 = r2 + 1
            goto Le
        L2c:
            return r1
    }

    public final boolean isHeadersDataReady() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            if (r0 == 0) goto Lc
            int r0 = r0.size()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public final boolean isHeadersTransitionOnBackEnabled() {
            r1 = this;
            boolean r0 = r1.mHeadersBackStackEnabled
            return r0
    }

    public boolean isInHeadersTransition() {
            r1 = this;
            java.lang.Object r0 = r1.mHeadersTransition
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isShowingHeaders() {
            r1 = this;
            boolean r0 = r1.mShowingHeaders
            return r0
    }

    public final boolean isVerticalScrolling() {
            r1 = this;
            androidx.leanback.app.HeadersFragment r0 = r1.mHeadersFragment
            boolean r0 = r0.isScrolling()
            if (r0 != 0) goto L13
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r1.mMainFragmentAdapter
            boolean r0 = r0.isScrolling()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    @Override // androidx.leanback.app.BaseFragment, android.app.Fragment
    public void onCreate(android.os.Bundle r6) {
            r5 = this;
            super.onCreate(r6)
            android.content.Context r0 = androidx.leanback.app.FragmentUtil.getContext(r5)
            int[] r1 = androidx.leanback.R.styleable.LeanbackTheme
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r1)
            int r2 = androidx.leanback.R.styleable.LeanbackTheme_browseRowsMarginStart
            android.content.res.Resources r3 = r0.getResources()
            int r4 = androidx.leanback.R.dimen.lb_browse_rows_margin_start
            int r3 = r3.getDimensionPixelSize(r4)
            float r3 = (float) r3
            float r2 = r1.getDimension(r2, r3)
            int r2 = (int) r2
            r5.mContainerListMarginStart = r2
            int r2 = androidx.leanback.R.styleable.LeanbackTheme_browseRowsMarginTop
            android.content.res.Resources r0 = r0.getResources()
            int r3 = androidx.leanback.R.dimen.lb_browse_rows_margin_top
            int r0 = r0.getDimensionPixelSize(r3)
            float r0 = (float) r0
            float r0 = r1.getDimension(r2, r0)
            int r0 = (int) r0
            r5.mContainerListAlignTop = r0
            r1.recycle()
            android.os.Bundle r0 = r5.getArguments()
            r5.readArguments(r0)
            boolean r0 = r5.mCanShowHeaders
            r1 = 1
            if (r0 == 0) goto La9
            boolean r0 = r5.mHeadersBackStackEnabled
            if (r0 == 0) goto L9f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "lbHeadersBackStack_"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r5.mWithHeadersBackStackName = r0
            androidx.leanback.app.BrowseFragment$BackStackListener r0 = new androidx.leanback.app.BrowseFragment$BackStackListener
            r0.<init>(r5)
            r5.mBackStackChangedListener = r0
            android.app.FragmentManager r0 = r5.getFragmentManager()
            androidx.leanback.app.BrowseFragment$BackStackListener r2 = r5.mBackStackChangedListener
            r0.addOnBackStackChangedListener(r2)
            androidx.leanback.app.BrowseFragment$BackStackListener r0 = r5.mBackStackChangedListener
            java.util.Objects.requireNonNull(r0)
            if (r6 == 0) goto L85
            r2 = -1
            java.lang.String r3 = "headerStackIndex"
            int r6 = r6.getInt(r3, r2)
            r0.mIndexOfHeadersBackStack = r6
            androidx.leanback.app.BrowseFragment r0 = r0.this$0
            if (r6 != r2) goto L81
            r6 = 1
            goto L82
        L81:
            r6 = 0
        L82:
            r0.mShowingHeaders = r6
            goto La9
        L85:
            androidx.leanback.app.BrowseFragment r6 = r0.this$0
            boolean r2 = r6.mShowingHeaders
            if (r2 != 0) goto La9
            android.app.FragmentManager r6 = r6.getFragmentManager()
            android.app.FragmentTransaction r6 = r6.beginTransaction()
            androidx.leanback.app.BrowseFragment r0 = r0.this$0
            java.lang.String r0 = r0.mWithHeadersBackStackName
            android.app.FragmentTransaction r6 = r6.addToBackStack(r0)
            r6.commit()
            goto La9
        L9f:
            if (r6 == 0) goto La9
            java.lang.String r0 = "headerShow"
            boolean r6 = r6.getBoolean(r0)
            r5.mShowingHeaders = r6
        La9:
            android.content.res.Resources r6 = r5.getResources()
            int r0 = androidx.leanback.R.fraction.lb_browse_rows_scale
            float r6 = r6.getFraction(r0, r1, r1)
            r5.mScaleFactor = r6
            return
    }

    public androidx.leanback.app.HeadersFragment onCreateHeadersFragment() {
            r1 = this;
            androidx.leanback.app.HeadersFragment r0 = new androidx.leanback.app.HeadersFragment
            r0.<init>()
            return r0
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
            r6 = this;
            android.app.FragmentManager r0 = r6.getChildFragmentManager()
            int r1 = androidx.leanback.R.id.scale_frame
            android.app.Fragment r0 = r0.findFragmentById(r1)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L46
            androidx.leanback.app.HeadersFragment r0 = r6.onCreateHeadersFragment()
            r6.mHeadersFragment = r0
            androidx.leanback.widget.ObjectAdapter r0 = r6.mAdapter
            int r4 = r6.mSelectedPosition
            r6.createMainFragment(r0, r4)
            android.app.FragmentManager r0 = r6.getChildFragmentManager()
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            int r4 = androidx.leanback.R.id.browse_headers_dock
            androidx.leanback.app.HeadersFragment r5 = r6.mHeadersFragment
            android.app.FragmentTransaction r0 = r0.replace(r4, r5)
            android.app.Fragment r4 = r6.mMainFragment
            if (r4 == 0) goto L33
            r0.replace(r1, r4)
            goto L42
        L33:
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r4 = new androidx.leanback.app.BrowseFragment$MainFragmentAdapter
            r5 = 0
            r4.<init>(r5)
            r6.mMainFragmentAdapter = r4
            androidx.leanback.app.BrowseFragment$FragmentHostImpl r5 = new androidx.leanback.app.BrowseFragment$FragmentHostImpl
            r5.<init>(r6)
            r4.mFragmentHost = r5
        L42:
            r0.commit()
            goto L7c
        L46:
            android.app.FragmentManager r0 = r6.getChildFragmentManager()
            int r4 = androidx.leanback.R.id.browse_headers_dock
            android.app.Fragment r0 = r0.findFragmentById(r4)
            androidx.leanback.app.HeadersFragment r0 = (androidx.leanback.app.HeadersFragment) r0
            r6.mHeadersFragment = r0
            android.app.FragmentManager r0 = r6.getChildFragmentManager()
            android.app.Fragment r0 = r0.findFragmentById(r1)
            r6.mMainFragment = r0
            if (r9 == 0) goto L6a
            java.lang.String r0 = "isPageRow"
            boolean r0 = r9.getBoolean(r0, r3)
            if (r0 == 0) goto L6a
            r0 = 1
            goto L6b
        L6a:
            r0 = 0
        L6b:
            r6.mIsPageRow = r0
            if (r9 == 0) goto L76
            java.lang.String r0 = "currentSelectedPosition"
            int r0 = r9.getInt(r0, r3)
            goto L77
        L76:
            r0 = 0
        L77:
            r6.mSelectedPosition = r0
            r6.setMainFragmentAdapter()
        L7c:
            androidx.leanback.app.HeadersFragment r0 = r6.mHeadersFragment
            boolean r4 = r6.mCanShowHeaders
            r2 = r2 ^ r4
            r0.setHeadersGone(r2)
            androidx.leanback.widget.PresenterSelector r0 = r6.mHeaderPresenterSelector
            if (r0 == 0) goto L8d
            androidx.leanback.app.HeadersFragment r2 = r6.mHeadersFragment
            r2.setPresenterSelector(r0)
        L8d:
            androidx.leanback.app.HeadersFragment r0 = r6.mHeadersFragment
            androidx.leanback.widget.ObjectAdapter r2 = r6.mAdapter
            r0.setAdapter(r2)
            androidx.leanback.app.HeadersFragment r0 = r6.mHeadersFragment
            androidx.leanback.app.HeadersFragment$OnHeaderViewSelectedListener r2 = r6.mHeaderViewSelectedListener
            r0.setOnHeaderViewSelectedListener(r2)
            androidx.leanback.app.HeadersFragment r0 = r6.mHeadersFragment
            androidx.leanback.app.HeadersFragment$OnHeaderClickedListener r2 = r6.mHeaderClickedListener
            r0.setOnHeaderClickedListener(r2)
            int r0 = androidx.leanback.R.layout.lb_browse_fragment
            android.view.View r8 = r7.inflate(r0, r8, r3)
            androidx.leanback.app.ProgressBarManager r0 = r6.getProgressBarManager()
            r2 = r8
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.setRootView(r2)
            int r0 = androidx.leanback.R.id.browse_frame
            android.view.View r0 = r8.findViewById(r0)
            androidx.leanback.widget.BrowseFrameLayout r0 = (androidx.leanback.widget.BrowseFrameLayout) r0
            r6.mBrowseFrame = r0
            androidx.leanback.widget.BrowseFrameLayout$OnChildFocusListener r2 = r6.mOnChildFocusListener
            r0.setOnChildFocusListener(r2)
            androidx.leanback.widget.BrowseFrameLayout r0 = r6.mBrowseFrame
            androidx.leanback.widget.BrowseFrameLayout$OnFocusSearchListener r2 = r6.mOnFocusSearchListener
            r0.setOnFocusSearchListener(r2)
            androidx.leanback.widget.BrowseFrameLayout r0 = r6.mBrowseFrame
            r6.installTitleView(r7, r0, r9)
            android.view.View r7 = r8.findViewById(r1)
            androidx.leanback.widget.ScaleFrameLayout r7 = (androidx.leanback.widget.ScaleFrameLayout) r7
            r6.mScaleFrameLayout = r7
            r9 = 0
            r7.setPivotX(r9)
            androidx.leanback.widget.ScaleFrameLayout r7 = r6.mScaleFrameLayout
            int r9 = r6.mContainerListAlignTop
            float r9 = (float) r9
            r7.setPivotY(r9)
            boolean r7 = r6.mBrandColorSet
            if (r7 == 0) goto Lec
            androidx.leanback.app.HeadersFragment r7 = r6.mHeadersFragment
            int r9 = r6.mBrandColor
            r7.setBackgroundColor(r9)
        Lec:
            androidx.leanback.widget.BrowseFrameLayout r7 = r6.mBrowseFrame
            androidx.leanback.app.BrowseFragment$6 r9 = new androidx.leanback.app.BrowseFragment$6
            r9.<init>(r6)
            java.lang.Object r7 = androidx.leanback.transition.TransitionHelper.createScene(r7, r9)
            r6.mSceneWithHeaders = r7
            androidx.leanback.widget.BrowseFrameLayout r7 = r6.mBrowseFrame
            androidx.leanback.app.BrowseFragment$7 r9 = new androidx.leanback.app.BrowseFragment$7
            r9.<init>(r6)
            java.lang.Object r7 = androidx.leanback.transition.TransitionHelper.createScene(r7, r9)
            r6.mSceneWithoutHeaders = r7
            androidx.leanback.widget.BrowseFrameLayout r7 = r6.mBrowseFrame
            androidx.leanback.app.BrowseFragment$8 r9 = new androidx.leanback.app.BrowseFragment$8
            r9.<init>(r6)
            java.lang.Object r7 = androidx.leanback.transition.TransitionHelper.createScene(r7, r9)
            r6.mSceneAfterEntranceTransition = r7
            return r8
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r2 = this;
            androidx.leanback.app.BrowseFragment$BackStackListener r0 = r2.mBackStackChangedListener
            if (r0 == 0) goto Ld
            android.app.FragmentManager r0 = r2.getFragmentManager()
            androidx.leanback.app.BrowseFragment$BackStackListener r1 = r2.mBackStackChangedListener
            r0.removeOnBackStackChangedListener(r1)
        Ld:
            super.onDestroy()
            return
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onDestroyView() {
            r1 = this;
            r0 = 0
            r1.setMainFragmentRowsAdapter(r0)
            r1.mPageRow = r0
            r1.mMainFragmentAdapter = r0
            r1.mMainFragment = r0
            r1.mHeadersFragment = r0
            super.onDestroyView()
            return
    }

    @Override // androidx.leanback.app.BaseFragment
    public final void onEntranceTransitionEnd() {
            r1 = this;
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r1.mMainFragmentAdapter
            if (r0 == 0) goto L7
            r0.onTransitionEnd()
        L7:
            androidx.leanback.app.HeadersFragment r0 = r1.mHeadersFragment
            if (r0 == 0) goto Le
            r0.onTransitionEnd()
        Le:
            return
    }

    @Override // androidx.leanback.app.BaseFragment
    public final void onEntranceTransitionPrepare() {
            r2 = this;
            androidx.leanback.app.HeadersFragment r0 = r2.mHeadersFragment
            r0.onTransitionPrepare()
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r2.mMainFragmentAdapter
            r1 = 0
            r0.setEntranceTransitionState(r1)
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r2.mMainFragmentAdapter
            r0.onTransitionPrepare()
            return
    }

    @Override // androidx.leanback.app.BaseFragment
    public final void onEntranceTransitionStart() {
            r1 = this;
            androidx.leanback.app.HeadersFragment r0 = r1.mHeadersFragment
            r0.onTransitionStart()
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r1.mMainFragmentAdapter
            r0.onTransitionStart()
            return
    }

    public final void onRowSelected(int r4) {
            r3 = this;
            androidx.leanback.app.BrowseFragment$SetSelectionRunnable r0 = r3.mSetSelectionRunnable
            r1 = 0
            r2 = 1
            r0.post(r4, r1, r2)
            return
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            int r0 = r2.mSelectedPosition
            java.lang.String r1 = "currentSelectedPosition"
            r3.putInt(r1, r0)
            boolean r0 = r2.mIsPageRow
            java.lang.String r1 = "isPageRow"
            r3.putBoolean(r1, r0)
            androidx.leanback.app.BrowseFragment$BackStackListener r0 = r2.mBackStackChangedListener
            if (r0 == 0) goto L1d
            int r0 = r0.mIndexOfHeadersBackStack
            java.lang.String r1 = "headerStackIndex"
            r3.putInt(r1, r0)
            goto L24
        L1d:
            boolean r0 = r2.mShowingHeaders
            java.lang.String r1 = "headerShow"
            r3.putBoolean(r1, r0)
        L24:
            return
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onStart() {
            r2 = this;
            super.onStart()
            androidx.leanback.app.HeadersFragment r0 = r2.mHeadersFragment
            int r1 = r2.mContainerListAlignTop
            r0.setAlignment(r1)
            r2.setMainFragmentAlignment()
            boolean r0 = r2.mCanShowHeaders
            if (r0 == 0) goto L29
            boolean r0 = r2.mShowingHeaders
            if (r0 == 0) goto L29
            androidx.leanback.app.HeadersFragment r0 = r2.mHeadersFragment
            if (r0 == 0) goto L29
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L29
            androidx.leanback.app.HeadersFragment r0 = r2.mHeadersFragment
            android.view.View r0 = r0.getView()
            r0.requestFocus()
            goto L44
        L29:
            boolean r0 = r2.mCanShowHeaders
            if (r0 == 0) goto L31
            boolean r0 = r2.mShowingHeaders
            if (r0 != 0) goto L44
        L31:
            android.app.Fragment r0 = r2.mMainFragment
            if (r0 == 0) goto L44
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L44
            android.app.Fragment r0 = r2.mMainFragment
            android.view.View r0 = r0.getView()
            r0.requestFocus()
        L44:
            boolean r0 = r2.mCanShowHeaders
            if (r0 == 0) goto L4d
            boolean r0 = r2.mShowingHeaders
            r2.showHeaders(r0)
        L4d:
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$Event r1 = r2.EVT_HEADER_VIEW_CREATED
            r0.fireEvent(r1)
            r0 = 0
            r2.mStopped = r0
            r2.commitMainFragment()
            androidx.leanback.app.BrowseFragment$SetSelectionRunnable r0 = r2.mSetSelectionRunnable
            r0.start()
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            r0 = 1
            r1.mStopped = r0
            androidx.leanback.app.BrowseFragment$SetSelectionRunnable r0 = r1.mSetSelectionRunnable
            r0.stop()
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

    public void setAdapter(androidx.leanback.widget.ObjectAdapter r2) {
            r1 = this;
            r1.mAdapter = r2
            r1.updateWrapperPresenter()
            android.view.View r2 = r1.getView()
            if (r2 != 0) goto Lc
            return
        Lc:
            r1.updateMainFragmentRowsAdapter()
            androidx.leanback.app.HeadersFragment r2 = r1.mHeadersFragment
            androidx.leanback.widget.ObjectAdapter r0 = r1.mAdapter
            r2.setAdapter(r0)
            return
    }

    public void setBrandColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            r1.mBrandColor = r2
            r0 = 1
            r1.mBrandColorSet = r0
            androidx.leanback.app.HeadersFragment r0 = r1.mHeadersFragment
            if (r0 == 0) goto Lc
            r0.setBackgroundColor(r2)
        Lc:
            return
    }

    public void setBrowseTransitionListener(androidx.leanback.app.BrowseFragment.BrowseTransitionListener r1) {
            r0 = this;
            r0.mBrowseTransitionListener = r1
            return
    }

    public final void setEntranceTransitionEndState() {
            r2 = this;
            boolean r0 = r2.mShowingHeaders
            r2.setHeadersOnScreen(r0)
            r0 = 1
            r2.setSearchOrbViewOnScreen(r0)
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r1 = r2.mMainFragmentAdapter
            r1.setEntranceTransitionState(r0)
            return
    }

    public final void setEntranceTransitionStartState() {
            r1 = this;
            r0 = 0
            r1.setHeadersOnScreen(r0)
            r1.setSearchOrbViewOnScreen(r0)
            return
    }

    public void setHeaderPresenterSelector(androidx.leanback.widget.PresenterSelector r2) {
            r1 = this;
            r1.mHeaderPresenterSelector = r2
            androidx.leanback.app.HeadersFragment r0 = r1.mHeadersFragment
            if (r0 == 0) goto L9
            r0.setPresenterSelector(r2)
        L9:
            return
    }

    public void setHeadersState(int r5) {
            r4 = this;
            r0 = 1
            if (r5 < r0) goto L44
            r1 = 3
            if (r5 > r1) goto L44
            int r2 = r4.mHeadersState
            if (r5 == r2) goto L43
            r4.mHeadersState = r5
            if (r5 == r0) goto L35
            r2 = 2
            r3 = 0
            if (r5 == r2) goto L30
            if (r5 == r1) goto L2b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown headers state: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "BrowseFragment"
            android.util.Log.w(r1, r5)
            goto L39
        L2b:
            r4.mCanShowHeaders = r3
            r4.mShowingHeaders = r3
            goto L39
        L30:
            r4.mCanShowHeaders = r0
            r4.mShowingHeaders = r3
            goto L39
        L35:
            r4.mCanShowHeaders = r0
            r4.mShowingHeaders = r0
        L39:
            androidx.leanback.app.HeadersFragment r5 = r4.mHeadersFragment
            if (r5 == 0) goto L43
            boolean r1 = r4.mCanShowHeaders
            r0 = r0 ^ r1
            r5.setHeadersGone(r0)
        L43:
            return
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid headers state: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r5)
            r0.<init>(r5)
            throw r0
    }

    public final void setHeadersTransitionOnBackEnabled(boolean r1) {
            r0 = this;
            r0.mHeadersBackStackEnabled = r1
            return
    }

    public final void setMainFragmentAdapter() {
            r3 = this;
            android.app.Fragment r0 = r3.mMainFragment
            androidx.leanback.app.BrowseFragment$MainFragmentAdapterProvider r0 = (androidx.leanback.app.BrowseFragment.MainFragmentAdapterProvider) r0
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r0.getMainFragmentAdapter()
            r3.mMainFragmentAdapter = r0
            androidx.leanback.app.BrowseFragment$FragmentHostImpl r1 = new androidx.leanback.app.BrowseFragment$FragmentHostImpl
            r1.<init>(r3)
            r0.mFragmentHost = r1
            boolean r0 = r3.mIsPageRow
            r1 = 0
            if (r0 != 0) goto L33
            android.app.Fragment r0 = r3.mMainFragment
            boolean r2 = r0 instanceof androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapterProvider
            if (r2 == 0) goto L26
            androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapterProvider r0 = (androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapterProvider) r0
            androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapter r0 = r0.getMainFragmentRowsAdapter()
            r3.setMainFragmentRowsAdapter(r0)
            goto L29
        L26:
            r3.setMainFragmentRowsAdapter(r1)
        L29:
            androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapter r0 = r3.mMainFragmentRowsAdapter
            if (r0 != 0) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            r3.mIsPageRow = r0
            goto L36
        L33:
            r3.setMainFragmentRowsAdapter(r1)
        L36:
            return
    }

    public final void setMainFragmentRowsAdapter(androidx.leanback.app.BrowseFragment.MainFragmentRowsAdapter r3) {
            r2 = this;
            androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapter r0 = r2.mMainFragmentRowsAdapter
            if (r3 != r0) goto L5
            return
        L5:
            if (r0 == 0) goto Lb
            r1 = 0
            r0.setAdapter(r1)
        Lb:
            r2.mMainFragmentRowsAdapter = r3
            if (r3 == 0) goto L1e
            androidx.leanback.app.BrowseFragment$MainFragmentItemViewSelectedListener r0 = new androidx.leanback.app.BrowseFragment$MainFragmentItemViewSelectedListener
            r0.<init>(r2, r3)
            r3.setOnItemViewSelectedListener(r0)
            androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapter r3 = r2.mMainFragmentRowsAdapter
            androidx.leanback.widget.OnItemViewClickedListener r0 = r2.mOnItemViewClickedListener
            r3.setOnItemViewClickedListener(r0)
        L1e:
            r2.updateMainFragmentRowsAdapter()
            return
    }

    public void setOnItemViewClickedListener(androidx.leanback.widget.OnItemViewClickedListener r2) {
            r1 = this;
            r1.mOnItemViewClickedListener = r2
            androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapter r0 = r1.mMainFragmentRowsAdapter
            if (r0 == 0) goto L9
            r0.setOnItemViewClickedListener(r2)
        L9:
            return
    }

    public void setOnItemViewSelectedListener(androidx.leanback.widget.OnItemViewSelectedListener r1) {
            r0 = this;
            r0.mExternalOnItemViewSelectedListener = r1
            return
    }

    public final void setSearchOrbViewOnScreen(boolean r3) {
            r2 = this;
            androidx.leanback.widget.TitleViewAdapter r0 = r2.getTitleViewAdapter()
            android.view.View r0 = r0.getSearchAffordanceView()
            if (r0 == 0) goto L1d
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r3 == 0) goto L14
            r3 = 0
            goto L17
        L14:
            int r3 = r2.mContainerListMarginStart
            int r3 = -r3
        L17:
            r1.setMarginStart(r3)
            r0.setLayoutParams(r1)
        L1d:
            return
    }

    public void setSelectedPosition(int r2) {
            r1 = this;
            r0 = 1
            r1.setSelectedPosition(r2, r0)
            return
    }

    public void setSelectedPosition(int r3, boolean r4) {
            r2 = this;
            androidx.leanback.app.BrowseFragment$SetSelectionRunnable r0 = r2.mSetSelectionRunnable
            r1 = 1
            r0.post(r3, r1, r4)
            return
    }

    public void setSelectedPosition(int r2, boolean r3, androidx.leanback.widget.Presenter.ViewHolderTask r4) {
            r1 = this;
            androidx.leanback.app.BrowseFragment$MainFragmentAdapterRegistry r0 = r1.mMainFragmentAdapterRegistry
            if (r0 != 0) goto L5
            return
        L5:
            if (r4 == 0) goto Lb
            r0 = 0
            r1.startHeadersTransition(r0)
        Lb:
            androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapter r0 = r1.mMainFragmentRowsAdapter
            if (r0 == 0) goto L12
            r0.setSelectedPosition(r2, r3, r4)
        L12:
            return
    }

    public final void setSelection(int r3, boolean r4) {
            r2 = this;
            r0 = -1
            if (r3 != r0) goto L4
            return
        L4:
            r2.mSelectedPosition = r3
            androidx.leanback.app.HeadersFragment r0 = r2.mHeadersFragment
            if (r0 == 0) goto L1f
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r1 = r2.mMainFragmentAdapter
            if (r1 != 0) goto Lf
            goto L1f
        Lf:
            r0.setSelectedPosition(r3, r4)
            r2.replaceMainFragment(r3)
            androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapter r0 = r2.mMainFragmentRowsAdapter
            if (r0 == 0) goto L1c
            r0.setSelectedPosition(r3, r4)
        L1c:
            r2.updateTitleViewVisibility()
        L1f:
            return
    }

    public final void showHeaders(boolean r2) {
            r1 = this;
            androidx.leanback.app.HeadersFragment r0 = r1.mHeadersFragment
            r0.setHeadersEnabled(r2)
            r1.setHeadersOnScreen(r2)
            r2 = r2 ^ 1
            r1.expandMainFragment(r2)
            return
    }

    public void startHeadersTransition(boolean r2) {
            r1 = this;
            boolean r0 = r1.mCanShowHeaders
            if (r0 == 0) goto L13
            boolean r0 = r1.isInHeadersTransition()
            if (r0 != 0) goto L12
            boolean r0 = r1.mShowingHeaders
            if (r0 != r2) goto Lf
            goto L12
        Lf:
            r1.startHeadersTransitionInternal(r2)
        L12:
            return
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot start headers transition"
            r2.<init>(r0)
            throw r2
    }

    public final void startHeadersTransitionInternal(boolean r3) {
            r2 = this;
            android.app.FragmentManager r0 = r2.getFragmentManager()
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto Lb
            return
        Lb:
            boolean r0 = r2.isHeadersDataReady()
            if (r0 != 0) goto L12
            return
        L12:
            r2.mShowingHeaders = r3
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r2.mMainFragmentAdapter
            r0.onTransitionPrepare()
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r2.mMainFragmentAdapter
            r0.onTransitionStart()
            r0 = r3 ^ 1
            androidx.leanback.app.BrowseFragment$3 r1 = new androidx.leanback.app.BrowseFragment$3
            r1.<init>(r2, r3)
            r2.onExpandTransitionStart(r0, r1)
            return
    }

    public final void updateMainFragmentRowsAdapter() {
            r2 = this;
            androidx.leanback.app.ListRowDataAdapter r0 = r2.mMainFragmentListRowDataAdapter
            r1 = 0
            if (r0 == 0) goto La
            r0.detach()
            r2.mMainFragmentListRowDataAdapter = r1
        La:
            androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapter r0 = r2.mMainFragmentRowsAdapter
            if (r0 == 0) goto L1f
            androidx.leanback.widget.ObjectAdapter r0 = r2.mAdapter
            if (r0 != 0) goto L13
            goto L18
        L13:
            androidx.leanback.app.ListRowDataAdapter r1 = new androidx.leanback.app.ListRowDataAdapter
            r1.<init>(r0)
        L18:
            r2.mMainFragmentListRowDataAdapter = r1
            androidx.leanback.app.BrowseFragment$MainFragmentRowsAdapter r0 = r2.mMainFragmentRowsAdapter
            r0.setAdapter(r1)
        L1f:
            return
    }

    public final void updateTitleViewVisibility() {
            r6 = this;
            boolean r0 = r6.mShowingHeaders
            r1 = 0
            if (r0 != 0) goto L23
            boolean r0 = r6.mIsPageRow
            if (r0 == 0) goto L12
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r6.mMainFragmentAdapter
            if (r0 == 0) goto L12
            androidx.leanback.app.BrowseFragment$FragmentHostImpl r0 = r0.mFragmentHost
            boolean r0 = r0.mShowTitleView
            goto L18
        L12:
            int r0 = r6.mSelectedPosition
            boolean r0 = r6.isFirstRowWithContent(r0)
        L18:
            if (r0 == 0) goto L1f
            r0 = 6
            r6.showTitle(r0)
            goto L7a
        L1f:
            r6.showTitle(r1)
            goto L7a
        L23:
            boolean r0 = r6.mIsPageRow
            if (r0 == 0) goto L30
            androidx.leanback.app.BrowseFragment$MainFragmentAdapter r0 = r6.mMainFragmentAdapter
            if (r0 == 0) goto L30
            androidx.leanback.app.BrowseFragment$FragmentHostImpl r0 = r0.mFragmentHost
            boolean r0 = r0.mShowTitleView
            goto L36
        L30:
            int r0 = r6.mSelectedPosition
            boolean r0 = r6.isFirstRowWithContent(r0)
        L36:
            int r2 = r6.mSelectedPosition
            androidx.leanback.widget.ObjectAdapter r3 = r6.mAdapter
            if (r3 == 0) goto L67
            int r3 = r3.size()
            if (r3 != 0) goto L43
            goto L67
        L43:
            r3 = 0
        L44:
            androidx.leanback.widget.ObjectAdapter r4 = r6.mAdapter
            int r4 = r4.size()
            if (r3 >= r4) goto L67
            androidx.leanback.widget.ObjectAdapter r4 = r6.mAdapter
            java.lang.Object r4 = r4.get(r3)
            androidx.leanback.widget.Row r4 = (androidx.leanback.widget.Row) r4
            boolean r5 = r4.isRenderedAsRowView()
            if (r5 != 0) goto L62
            boolean r4 = r4 instanceof androidx.leanback.widget.PageRow
            if (r4 == 0) goto L5f
            goto L62
        L5f:
            int r3 = r3 + 1
            goto L44
        L62:
            if (r2 != r3) goto L65
            goto L67
        L65:
            r2 = 0
            goto L68
        L67:
            r2 = 1
        L68:
            if (r0 == 0) goto L6c
            r0 = 2
            goto L6d
        L6c:
            r0 = 0
        L6d:
            if (r2 == 0) goto L71
            r0 = r0 | 4
        L71:
            if (r0 == 0) goto L77
            r6.showTitle(r0)
            goto L7a
        L77:
            r6.showTitle(r1)
        L7a:
            return
    }
}
