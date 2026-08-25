package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclerView extends android.view.ViewGroup implements androidx.core.view.ScrollingView, androidx.core.view.NestedScrollingChild2, androidx.core.view.NestedScrollingChild3 {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = false;
    public static final boolean ALLOW_THREAD_GAP_WORK = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final java.lang.Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = null;
    private static final int[] NESTED_SCROLLING_ATTRS = null;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION = false;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    private static final java.lang.String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    private static final java.lang.String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final java.lang.String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;
    public static final android.view.animation.Interpolator sQuinticInterpolator = null;
    public androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager;
    public androidx.recyclerview.widget.RecyclerView.Adapter mAdapter;
    public androidx.recyclerview.widget.AdapterHelper mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private android.widget.EdgeEffect mBottomGlow;
    private androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
    public androidx.recyclerview.widget.ChildHelper mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @androidx.annotation.NonNull
    private androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory mEdgeEffectFactory;

    @androidx.annotation.VisibleForTesting
    public boolean mFirstLayoutComplete;
    public androidx.recyclerview.widget.GapWorker mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private androidx.recyclerview.widget.RecyclerView.OnItemTouchListener mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public androidx.recyclerview.widget.RecyclerView.ItemAnimator mItemAnimator;
    private androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private java.lang.Runnable mItemAnimatorRunner;
    public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ItemDecoration> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;

    @androidx.annotation.VisibleForTesting
    public androidx.recyclerview.widget.RecyclerView.LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private android.widget.EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final androidx.recyclerview.widget.RecyclerView.RecyclerViewDataObserver mObserver;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private androidx.recyclerview.widget.RecyclerView.OnFlingListener mOnFlingListener;
    private final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.OnItemTouchListener> mOnItemTouchListeners;

    @androidx.annotation.VisibleForTesting
    public final java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> mPendingAccessibilityImportanceChange;
    public androidx.recyclerview.widget.RecyclerView.SavedState mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public androidx.recyclerview.widget.GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final androidx.recyclerview.widget.RecyclerView.Recycler mRecycler;
    public androidx.recyclerview.widget.RecyclerView.RecyclerListener mRecyclerListener;
    public final java.util.List<androidx.recyclerview.widget.RecyclerView.RecyclerListener> mRecyclerListeners;
    public final int[] mReusableIntPair;
    private android.widget.EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private androidx.recyclerview.widget.RecyclerView.OnScrollListener mScrollListener;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.NestedScrollingChildHelper mScrollingChildHelper;
    public final androidx.recyclerview.widget.RecyclerView.State mState;
    public final android.graphics.Rect mTempRect;
    private final android.graphics.Rect mTempRect2;
    public final android.graphics.RectF mTempRectF;
    private android.widget.EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final java.lang.Runnable mUpdateChildViewsRunnable;
    private android.view.VelocityTracker mVelocityTracker;
    public final androidx.recyclerview.widget.RecyclerView.ViewFlinger mViewFlinger;
    private final androidx.recyclerview.widget.ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    public final androidx.recyclerview.widget.ViewInfoStore mViewInfoStore;







    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy = null;

        static {
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.recyclerview.widget.RecyclerView.AnonymousClass7.$SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy = r0
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.recyclerview.widget.RecyclerView.AnonymousClass7.$SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public static abstract class Adapter<VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        private boolean mHasStableIds;
        private final androidx.recyclerview.widget.RecyclerView.AdapterDataObservable mObservable;
        private androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy mStateRestorationPolicy;

        public static final enum StateRestorationPolicy extends java.lang.Enum<androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy> {
            private static final /* synthetic */ androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy[] $VALUES = null;
            public static final androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy ALLOW = null;
            public static final androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy PREVENT = null;
            public static final androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy PREVENT_WHEN_EMPTY = null;

            static {
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = new androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy
                    java.lang.String r1 = "ALLOW"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.ALLOW = r0
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = new androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy
                    java.lang.String r3 = "PREVENT_WHEN_EMPTY"
                    r4 = 1
                    r1.<init>(r3, r4)
                    androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY = r1
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r3 = new androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy
                    java.lang.String r5 = "PREVENT"
                    r6 = 2
                    r3.<init>(r5, r6)
                    androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT = r3
                    r5 = 3
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r5 = new androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy[r5]
                    r5[r2] = r0
                    r5[r4] = r1
                    r5[r6] = r3
                    androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.$VALUES = r5
                    return
            }

            private StateRestorationPolicy(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy> r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = (androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy) r1
                    return r1
            }

            public static androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy[] values() {
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = (androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy[]) r0
                    return r0
            }
        }

        public Adapter() {
                r1 = this;
                r1.<init>()
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = new androidx.recyclerview.widget.RecyclerView$AdapterDataObservable
                r0.<init>()
                r1.mObservable = r0
                r0 = 0
                r1.mHasStableIds = r0
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.ALLOW
                r1.mStateRestorationPolicy = r0
                return
        }

        public final void bindViewHolder(@androidx.annotation.NonNull VH r5, int r6) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$Adapter<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r5.mBindingAdapter
                r1 = 1
                if (r0 != 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                if (r0 == 0) goto L22
                r5.mPosition = r6
                boolean r2 = r4.hasStableIds()
                if (r2 == 0) goto L18
                long r2 = r4.getItemId(r6)
                r5.mItemId = r2
            L18:
                r2 = 519(0x207, float:7.27E-43)
                r5.setFlags(r1, r2)
                java.lang.String r2 = "RV OnBindView"
                androidx.core.os.TraceCompat.beginSection(r2)
            L22:
                r5.mBindingAdapter = r4
                java.util.List r2 = r5.getUnmodifiedPayloads()
                r4.onBindViewHolder(r5, r6, r2)
                if (r0 == 0) goto L4b
                java.util.List<java.lang.Object> r6 = r5.mPayloads
                if (r6 == 0) goto L34
                r6.clear()
            L34:
                int r6 = r5.mFlags
                r6 = r6 & (-1025(0xfffffffffffffbff, float:NaN))
                r5.mFlags = r6
                android.view.View r5 = r5.itemView
                android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
                boolean r6 = r5 instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams
                if (r6 == 0) goto L48
                androidx.recyclerview.widget.RecyclerView$LayoutParams r5 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r5
                r5.mInsetsDirty = r1
            L48:
                androidx.core.os.TraceCompat.endSection()
            L4b:
                return
        }

        public final boolean canRestoreState() {
                r4 = this;
                int[] r0 = androidx.recyclerview.widget.RecyclerView.AnonymousClass7.$SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = r4.mStateRestorationPolicy
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 0
                r2 = 1
                if (r0 == r2) goto L19
                r3 = 2
                if (r0 == r3) goto L12
                return r2
            L12:
                int r0 = r4.getItemCount()
                if (r0 <= 0) goto L19
                r1 = 1
            L19:
                return r1
        }

        @androidx.annotation.NonNull
        public final VH createViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r2, int r3) {
                r1 = this;
                java.lang.String r0 = "RV CreateView"
                androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L1f
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.onCreateViewHolder(r2, r3)     // Catch: java.lang.Throwable -> L1f
                android.view.View r0 = r2.itemView     // Catch: java.lang.Throwable -> L1f
                android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Throwable -> L1f
                if (r0 != 0) goto L17
                r2.mItemViewType = r3     // Catch: java.lang.Throwable -> L1f
                androidx.core.os.TraceCompat.endSection()
                return r2
            L17:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
                java.lang.String r3 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L1f
                throw r2     // Catch: java.lang.Throwable -> L1f
            L1f:
                r2 = move-exception
                androidx.core.os.TraceCompat.endSection()
                throw r2
        }

        public int findRelativeAdapterPositionIn(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3) {
                r0 = this;
                if (r1 != r0) goto L3
                return r3
            L3:
                r1 = -1
                return r1
        }

        public abstract int getItemCount();

        public long getItemId(int r3) {
                r2 = this;
                r0 = -1
                return r0
        }

        public int getItemViewType(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @androidx.annotation.NonNull
        public final androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy getStateRestorationPolicy() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = r1.mStateRestorationPolicy
                return r0
        }

        public final boolean hasObservers() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                boolean r0 = r0.hasObservers()
                return r0
        }

        public final boolean hasStableIds() {
                r1 = this;
                boolean r0 = r1.mHasStableIds
                return r0
        }

        public final void notifyDataSetChanged() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.notifyChanged()
                return
        }

        public final void notifyItemChanged(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r2.mObservable
                r1 = 1
                r0.notifyItemRangeChanged(r3, r1)
                return
        }

        public final void notifyItemChanged(int r3, @androidx.annotation.Nullable java.lang.Object r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r2.mObservable
                r1 = 1
                r0.notifyItemRangeChanged(r3, r1, r4)
                return
        }

        public final void notifyItemInserted(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r2.mObservable
                r1 = 1
                r0.notifyItemRangeInserted(r3, r1)
                return
        }

        public final void notifyItemMoved(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.notifyItemMoved(r2, r3)
                return
        }

        public final void notifyItemRangeChanged(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.notifyItemRangeChanged(r2, r3)
                return
        }

        public final void notifyItemRangeChanged(int r2, int r3, @androidx.annotation.Nullable java.lang.Object r4) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.notifyItemRangeChanged(r2, r3, r4)
                return
        }

        public final void notifyItemRangeInserted(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.notifyItemRangeInserted(r2, r3)
                return
        }

        public final void notifyItemRangeRemoved(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.notifyItemRangeRemoved(r2, r3)
                return
        }

        public final void notifyItemRemoved(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r2.mObservable
                r1 = 1
                r0.notifyItemRangeRemoved(r3, r1)
                return
        }

        public void onAttachedToRecyclerView(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        public abstract void onBindViewHolder(@androidx.annotation.NonNull VH r1, int r2);

        public void onBindViewHolder(@androidx.annotation.NonNull VH r1, int r2, @androidx.annotation.NonNull java.util.List<java.lang.Object> r3) {
                r0 = this;
                r0.onBindViewHolder(r1, r2)
                return
        }

        @androidx.annotation.NonNull
        public abstract VH onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2);

        public void onDetachedFromRecyclerView(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        public boolean onFailedToRecycleView(@androidx.annotation.NonNull VH r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onViewAttachedToWindow(@androidx.annotation.NonNull VH r1) {
                r0 = this;
                return
        }

        public void onViewDetachedFromWindow(@androidx.annotation.NonNull VH r1) {
                r0 = this;
                return
        }

        public void onViewRecycled(@androidx.annotation.NonNull VH r1) {
                r0 = this;
                return
        }

        public void registerAdapterDataObserver(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.AdapterDataObserver r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.registerObserver(r2)
                return
        }

        public void setHasStableIds(boolean r2) {
                r1 = this;
                boolean r0 = r1.hasObservers()
                if (r0 != 0) goto L9
                r1.mHasStableIds = r2
                return
            L9:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot change whether this adapter has stable IDs while the adapter has registered observers."
                r2.<init>(r0)
                throw r2
        }

        public void setStateRestorationPolicy(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy r1) {
                r0 = this;
                r0.mStateRestorationPolicy = r1
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r1 = r0.mObservable
                r1.notifyStateRestorationPolicyChanged()
                return
        }

        public void unregisterAdapterDataObserver(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.AdapterDataObserver r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$AdapterDataObservable r0 = r1.mObservable
                r0.unregisterObserver(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class AdapterDataObservable extends android.database.Observable<androidx.recyclerview.widget.RecyclerView.AdapterDataObserver> {
        public AdapterDataObservable() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean hasObservers() {
                r1 = this;
                java.util.ArrayList r0 = r1.mObservers
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                return r0
        }

        public void notifyChanged() {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = (androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) r1
                r1.onChanged()
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemMoved(int r4, int r5) {
                r3 = this;
                java.util.ArrayList r0 = r3.mObservers
                int r0 = r0.size()
                r1 = 1
                int r0 = r0 - r1
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r2 = r3.mObservers
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r2 = (androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) r2
                r2.onItemRangeMoved(r4, r5, r1)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemRangeChanged(int r2, int r3) {
                r1 = this;
                r0 = 0
                r1.notifyItemRangeChanged(r2, r3, r0)
                return
        }

        public void notifyItemRangeChanged(int r3, int r4, @androidx.annotation.Nullable java.lang.Object r5) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = (androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) r1
                r1.onItemRangeChanged(r3, r4, r5)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemRangeInserted(int r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = (androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) r1
                r1.onItemRangeInserted(r3, r4)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyItemRangeRemoved(int r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = (androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) r1
                r1.onItemRangeRemoved(r3, r4)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        public void notifyStateRestorationPolicyChanged() {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r1 = (androidx.recyclerview.widget.RecyclerView.AdapterDataObserver) r1
                r1.onStateRestorationPolicyChanged()
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class AdapterDataObserver {
        public AdapterDataObserver() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onChanged() {
                r0 = this;
                return
        }

        public void onItemRangeChanged(int r1, int r2) {
                r0 = this;
                return
        }

        public void onItemRangeChanged(int r1, int r2, @androidx.annotation.Nullable java.lang.Object r3) {
                r0 = this;
                r0.onItemRangeChanged(r1, r2)
                return
        }

        public void onItemRangeInserted(int r1, int r2) {
                r0 = this;
                return
        }

        public void onItemRangeMoved(int r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void onItemRangeRemoved(int r1, int r2) {
                r0 = this;
                return
        }

        public void onStateRestorationPolicyChanged() {
                r0 = this;
                return
        }
    }

    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int r1, int r2);
    }

    public static class EdgeEffectFactory {
        public static final int DIRECTION_BOTTOM = 3;
        public static final int DIRECTION_LEFT = 0;
        public static final int DIRECTION_RIGHT = 2;
        public static final int DIRECTION_TOP = 1;

        /* JADX INFO: loaded from: classes.dex */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        public EdgeEffectFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public final android.widget.EdgeEffect createEdgeEffect(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
                android.content.Context r2 = r2.getContext()
                r0.<init>(r2)
                return r0
        }
    }

    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private long mAddDuration;
        private long mChangeDuration;
        private java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> mFinishedListeners;
        private androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener mListener;
        private long mMoveDuration;
        private long mRemoveDuration;

        /* JADX INFO: loaded from: classes.dex */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        public interface ItemAnimatorListener {
            void onAnimationFinished(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1);
        }

        /* JADX INFO: loaded from: classes.dex */
        public static class ItemHolderInfo {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;
            public int top;

            public ItemHolderInfo() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.NonNull
            public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo setFrom(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                    r1 = this;
                    r0 = 0
                    androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r2 = r1.setFrom(r2, r0)
                    return r2
            }

            @androidx.annotation.NonNull
            public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo setFrom(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                    r0 = this;
                    android.view.View r1 = r1.itemView
                    int r2 = r1.getLeft()
                    r0.left = r2
                    int r2 = r1.getTop()
                    r0.top = r2
                    int r2 = r1.getRight()
                    r0.right = r2
                    int r1 = r1.getBottom()
                    r0.bottom = r1
                    return r0
            }
        }

        public ItemAnimator() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mListener = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mFinishedListeners = r0
                r0 = 120(0x78, double:5.93E-322)
                r2.mAddDuration = r0
                r2.mRemoveDuration = r0
                r0 = 250(0xfa, double:1.235E-321)
                r2.mMoveDuration = r0
                r2.mChangeDuration = r0
                return
        }

        public static int buildAdapterChangeFlagsForAnimations(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
                int r0 = r3.mFlags
                r0 = r0 & 14
                boolean r1 = r3.isInvalid()
                if (r1 == 0) goto Lc
                r3 = 4
                return r3
            Lc:
                r1 = r0 & 4
                if (r1 != 0) goto L21
                int r1 = r3.getOldPosition()
                int r3 = r3.getAbsoluteAdapterPosition()
                r2 = -1
                if (r1 == r2) goto L21
                if (r3 == r2) goto L21
                if (r1 == r3) goto L21
                r0 = r0 | 2048(0x800, float:2.87E-42)
            L21:
                return r0
        }

        public abstract boolean animateAppearance(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3);

        public abstract boolean animateChange(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r4);

        public abstract boolean animateDisappearance(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r2, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3);

        public abstract boolean animatePersistence(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3);

        public boolean canReuseUpdatedViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        public boolean canReuseUpdatedViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, @androidx.annotation.NonNull java.util.List<java.lang.Object> r2) {
                r0 = this;
                boolean r1 = r0.canReuseUpdatedViewHolder(r1)
                return r1
        }

        public final void dispatchAnimationFinished(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r1 = this;
                r1.onAnimationFinished(r2)
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorListener r0 = r1.mListener
                if (r0 == 0) goto La
                r0.onAnimationFinished(r2)
            La:
                return
        }

        public final void dispatchAnimationStarted(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                r0.onAnimationStarted(r1)
                return
        }

        public final void dispatchAnimationsFinished() {
                r3 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener> r0 = r3.mFinishedListeners
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener> r2 = r3.mFinishedListeners
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener r2 = (androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener) r2
                r2.onAnimationsFinished()
                int r1 = r1 + 1
                goto L7
            L17:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener> r0 = r3.mFinishedListeners
                r0.clear()
                return
        }

        public abstract void endAnimation(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1);

        public abstract void endAnimations();

        public long getAddDuration() {
                r2 = this;
                long r0 = r2.mAddDuration
                return r0
        }

        public long getChangeDuration() {
                r2 = this;
                long r0 = r2.mChangeDuration
                return r0
        }

        public long getMoveDuration() {
                r2 = this;
                long r0 = r2.mMoveDuration
                return r0
        }

        public long getRemoveDuration() {
                r2 = this;
                long r0 = r2.mRemoveDuration
                return r0
        }

        public abstract boolean isRunning();

        public final boolean isRunning(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener r3) {
                r2 = this;
                boolean r0 = r2.isRunning()
                if (r3 == 0) goto L11
                if (r0 != 0) goto Lc
                r3.onAnimationsFinished()
                goto L11
            Lc:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener> r1 = r2.mFinishedListeners
                r1.add(r3)
            L11:
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo obtainHolderInfo() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r0 = new androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo
                r0.<init>()
                return r0
        }

        public void onAnimationFinished(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                return
        }

        public void onAnimationStarted(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                return
        }

        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPostLayoutInformation(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r1 = r0.obtainHolderInfo()
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r1 = r1.setFrom(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3, @androidx.annotation.NonNull java.util.List<java.lang.Object> r4) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r1 = r0.obtainHolderInfo()
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r1 = r1.setFrom(r2)
                return r1
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long r1) {
                r0 = this;
                r0.mAddDuration = r1
                return
        }

        public void setChangeDuration(long r1) {
                r0 = this;
                r0.mChangeDuration = r1
                return
        }

        public final void setListener(androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener r1) {
                r0 = this;
                r0.mListener = r1
                return
        }

        public void setMoveDuration(long r1) {
                r0 = this;
                r0.mMoveDuration = r1
                return
        }

        public void setRemoveDuration(long r1) {
                r0 = this;
                r0.mRemoveDuration = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ItemAnimatorRestoreListener implements androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener {
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView this$0;

        public ItemAnimatorRestoreListener(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        public void onAnimationFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder r6) {
                r5 = this;
                r0 = 1
                r6.setIsRecyclable(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r6.mShadowedHolder
                r2 = 0
                if (r1 == 0) goto Lf
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r6.mShadowingHolder
                if (r1 != 0) goto Lf
                r6.mShadowedHolder = r2
            Lf:
                r6.mShadowingHolder = r2
                int r1 = r6.mFlags
                r1 = r1 & 16
                r2 = 0
                if (r1 == 0) goto L19
                goto L1a
            L19:
                r0 = 0
            L1a:
                if (r0 != 0) goto L4d
                androidx.recyclerview.widget.RecyclerView r0 = r5.this$0
                android.view.View r1 = r6.itemView
                r0.startInterceptRequestLayout()
                androidx.recyclerview.widget.ChildHelper r3 = r0.mChildHelper
                boolean r3 = r3.removeViewIfHidden(r1)
                if (r3 == 0) goto L39
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r1)
                androidx.recyclerview.widget.RecyclerView$Recycler r4 = r0.mRecycler
                r4.unscrapView(r1)
                androidx.recyclerview.widget.RecyclerView$Recycler r4 = r0.mRecycler
                r4.recycleViewHolderInternal(r1)
            L39:
                r1 = r3 ^ 1
                r0.stopInterceptRequestLayout(r1)
                if (r3 != 0) goto L4d
                boolean r0 = r6.isTmpDetached()
                if (r0 == 0) goto L4d
                androidx.recyclerview.widget.RecyclerView r0 = r5.this$0
                android.view.View r6 = r6.itemView
                r0.removeDetachedView(r6, r2)
            L4d:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class ItemDecoration {
        public ItemDecoration() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        public void getItemOffsets(@androidx.annotation.NonNull android.graphics.Rect r1, int r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r3) {
                r0 = this;
                r2 = 0
                r1.set(r2, r2, r2, r2)
                return
        }

        public void getItemOffsets(@androidx.annotation.NonNull android.graphics.Rect r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r4) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r2
                int r2 = r2.getViewLayoutPosition()
                r0.getItemOffsets(r1, r2, r3)
                return
        }

        @java.lang.Deprecated
        public void onDraw(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                return
        }

        public void onDraw(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r3) {
                r0 = this;
                r0.onDraw(r1, r2)
                return
        }

        @java.lang.Deprecated
        public void onDrawOver(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                return
        }

        public void onDrawOver(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r3) {
                r0 = this;
                r0.onDrawOver(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class LayoutManager {
        public boolean mAutoMeasure;
        public androidx.recyclerview.widget.ChildHelper mChildHelper;
        private int mHeight;
        private int mHeightMode;
        public androidx.recyclerview.widget.ViewBoundsCheck mHorizontalBoundCheck;
        private final androidx.recyclerview.widget.ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
        public boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        public int mPrefetchMaxCountObserved;
        public boolean mPrefetchMaxObservedInInitialPrefetch;
        public androidx.recyclerview.widget.RecyclerView mRecyclerView;
        public boolean mRequestedSimpleAnimations;

        @androidx.annotation.Nullable
        public androidx.recyclerview.widget.RecyclerView.SmoothScroller mSmoothScroller;
        public androidx.recyclerview.widget.ViewBoundsCheck mVerticalBoundCheck;
        private final androidx.recyclerview.widget.ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;



        /* JADX INFO: loaded from: classes2.dex */
        public interface LayoutPrefetchRegistry {
            void addPosition(int r1, int r2);
        }

        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;

            public Properties() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public LayoutManager() {
                r3 = this;
                r3.<init>()
                androidx.recyclerview.widget.RecyclerView$LayoutManager$1 r0 = new androidx.recyclerview.widget.RecyclerView$LayoutManager$1
                r0.<init>(r3)
                r3.mHorizontalBoundCheckCallback = r0
                androidx.recyclerview.widget.RecyclerView$LayoutManager$2 r1 = new androidx.recyclerview.widget.RecyclerView$LayoutManager$2
                r1.<init>(r3)
                r3.mVerticalBoundCheckCallback = r1
                androidx.recyclerview.widget.ViewBoundsCheck r2 = new androidx.recyclerview.widget.ViewBoundsCheck
                r2.<init>(r0)
                r3.mHorizontalBoundCheck = r2
                androidx.recyclerview.widget.ViewBoundsCheck r0 = new androidx.recyclerview.widget.ViewBoundsCheck
                r0.<init>(r1)
                r3.mVerticalBoundCheck = r0
                r0 = 0
                r3.mRequestedSimpleAnimations = r0
                r3.mIsAttachedToWindow = r0
                r3.mAutoMeasure = r0
                r0 = 1
                r3.mMeasurementCacheEnabled = r0
                r3.mItemPrefetchEnabled = r0
                return
        }

        private void addViewInt(android.view.View r5, int r6, boolean r7) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r5)
                if (r7 != 0) goto L15
                boolean r7 = r0.isRemoved()
                if (r7 == 0) goto Ld
                goto L15
            Ld:
                androidx.recyclerview.widget.RecyclerView r7 = r4.mRecyclerView
                androidx.recyclerview.widget.ViewInfoStore r7 = r7.mViewInfoStore
                r7.removeFromDisappearedInLayout(r0)
                goto L1c
            L15:
                androidx.recyclerview.widget.RecyclerView r7 = r4.mRecyclerView
                androidx.recyclerview.widget.ViewInfoStore r7 = r7.mViewInfoStore
                r7.addToDisappearedInLayout(r0)
            L1c:
                android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r7 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r7
                boolean r1 = r0.wasReturnedFromScrap()
                r2 = 0
                if (r1 != 0) goto L86
                boolean r1 = r0.isScrap()
                if (r1 == 0) goto L30
                goto L86
            L30:
                android.view.ViewParent r1 = r5.getParent()
                androidx.recyclerview.widget.RecyclerView r3 = r4.mRecyclerView
                if (r1 != r3) goto L6e
                androidx.recyclerview.widget.ChildHelper r1 = r4.mChildHelper
                int r1 = r1.indexOfChild(r5)
                r3 = -1
                if (r6 != r3) goto L47
                androidx.recyclerview.widget.ChildHelper r6 = r4.mChildHelper
                int r6 = r6.getChildCount()
            L47:
                if (r1 == r3) goto L53
                if (r1 == r6) goto L9c
                androidx.recyclerview.widget.RecyclerView r5 = r4.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r5.mLayout
                r5.moveView(r1, r6)
                goto L9c
            L53:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
                java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
                androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
                int r5 = r0.indexOfChild(r5)
                r7.append(r5)
                androidx.recyclerview.widget.RecyclerView r5 = r4.mRecyclerView
                java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r7)
                r6.<init>(r5)
                throw r6
            L6e:
                androidx.recyclerview.widget.ChildHelper r1 = r4.mChildHelper
                r1.addView(r5, r6, r2)
                r6 = 1
                r7.mInsetsDirty = r6
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r6 = r4.mSmoothScroller
                if (r6 == 0) goto L9c
                boolean r6 = r6.isRunning()
                if (r6 == 0) goto L9c
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r6 = r4.mSmoothScroller
                r6.onChildAttachedToWindow(r5)
                goto L9c
            L86:
                boolean r1 = r0.isScrap()
                if (r1 == 0) goto L90
                r0.unScrap()
                goto L93
            L90:
                r0.clearReturnedFromScrapFlag()
            L93:
                androidx.recyclerview.widget.ChildHelper r1 = r4.mChildHelper
                android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
                r1.attachViewToParent(r5, r6, r3, r2)
            L9c:
                boolean r5 = r7.mPendingInvalidate
                if (r5 == 0) goto La7
                android.view.View r5 = r0.itemView
                r5.invalidate()
                r7.mPendingInvalidate = r2
            La7:
                return
        }

        public static int chooseSize(int r2, int r3, int r4) {
                int r0 = android.view.View.MeasureSpec.getMode(r2)
                int r2 = android.view.View.MeasureSpec.getSize(r2)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L15
                r1 = 1073741824(0x40000000, float:2.0)
                if (r0 == r1) goto L14
                int r2 = java.lang.Math.max(r3, r4)
            L14:
                return r2
            L15:
                int r3 = java.lang.Math.max(r3, r4)
                int r2 = java.lang.Math.min(r2, r3)
                return r2
        }

        private void detachViewInternal(int r1, @androidx.annotation.NonNull android.view.View r2) {
                r0 = this;
                androidx.recyclerview.widget.ChildHelper r2 = r0.mChildHelper
                r2.detachViewFromParent(r1)
                return
        }

        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
        }

        @java.lang.Deprecated
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = 0
                goto L21
            Lf:
                if (r3 < 0) goto L14
            L11:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L21
            L14:
                r4 = -1
                if (r3 != r4) goto L1b
                r2 = 1073741824(0x40000000, float:2.0)
            L19:
                r3 = r1
                goto L21
            L1b:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L19
            L21:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
        }

        private int[] getChildRectangleOnScreenScrollAmount(android.view.View r10, android.graphics.Rect r11) {
                r9 = this;
                r0 = 2
                int[] r0 = new int[r0]
                int r1 = r9.getPaddingLeft()
                int r2 = r9.getPaddingTop()
                int r3 = r9.getWidth()
                int r4 = r9.getPaddingRight()
                int r3 = r3 - r4
                int r4 = r9.getHeight()
                int r5 = r9.getPaddingBottom()
                int r4 = r4 - r5
                int r5 = r10.getLeft()
                int r6 = r11.left
                int r5 = r5 + r6
                int r6 = r10.getScrollX()
                int r5 = r5 - r6
                int r6 = r10.getTop()
                int r7 = r11.top
                int r6 = r6 + r7
                int r10 = r10.getScrollY()
                int r6 = r6 - r10
                int r10 = r11.width()
                int r10 = r10 + r5
                int r11 = r11.height()
                int r11 = r11 + r6
                int r5 = r5 - r1
                r1 = 0
                int r7 = java.lang.Math.min(r1, r5)
                int r6 = r6 - r2
                int r2 = java.lang.Math.min(r1, r6)
                int r10 = r10 - r3
                int r3 = java.lang.Math.max(r1, r10)
                int r11 = r11 - r4
                int r11 = java.lang.Math.max(r1, r11)
                int r4 = r9.getLayoutDirection()
                r8 = 1
                if (r4 != r8) goto L63
                if (r3 == 0) goto L5e
                goto L6b
            L5e:
                int r3 = java.lang.Math.max(r7, r10)
                goto L6b
            L63:
                if (r7 == 0) goto L66
                goto L6a
            L66:
                int r7 = java.lang.Math.min(r5, r3)
            L6a:
                r3 = r7
            L6b:
                if (r2 == 0) goto L6e
                goto L72
            L6e:
                int r2 = java.lang.Math.min(r6, r11)
            L72:
                r0[r1] = r3
                r0[r8] = r2
                return r0
        }

        public static androidx.recyclerview.widget.RecyclerView.LayoutManager.Properties getProperties(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4, int r5) {
                androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties r0 = new androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties
                r0.<init>()
                int[] r1 = androidx.recyclerview.R.styleable.RecyclerView
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r1, r4, r5)
                int r3 = androidx.recyclerview.R.styleable.RecyclerView_android_orientation
                r4 = 1
                int r3 = r2.getInt(r3, r4)
                r0.orientation = r3
                int r3 = androidx.recyclerview.R.styleable.RecyclerView_spanCount
                int r3 = r2.getInt(r3, r4)
                r0.spanCount = r3
                int r3 = androidx.recyclerview.R.styleable.RecyclerView_reverseLayout
                r4 = 0
                boolean r3 = r2.getBoolean(r3, r4)
                r0.reverseLayout = r3
                int r3 = androidx.recyclerview.R.styleable.RecyclerView_stackFromEnd
                boolean r3 = r2.getBoolean(r3, r4)
                r0.stackFromEnd = r3
                r2.recycle()
                return r0
        }

        private boolean isFocusedChildVisibleAfterScrolling(androidx.recyclerview.widget.RecyclerView r7, int r8, int r9) {
                r6 = this;
                android.view.View r7 = r7.getFocusedChild()
                r0 = 0
                if (r7 != 0) goto L8
                return r0
            L8:
                int r1 = r6.getPaddingLeft()
                int r2 = r6.getPaddingTop()
                int r3 = r6.getWidth()
                int r4 = r6.getPaddingRight()
                int r3 = r3 - r4
                int r4 = r6.getHeight()
                int r5 = r6.getPaddingBottom()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r6.mRecyclerView
                android.graphics.Rect r5 = r5.mTempRect
                r6.getDecoratedBoundsWithMargins(r7, r5)
                int r7 = r5.left
                int r7 = r7 - r8
                if (r7 >= r3) goto L40
                int r7 = r5.right
                int r7 = r7 - r8
                if (r7 <= r1) goto L40
                int r7 = r5.top
                int r7 = r7 - r9
                if (r7 >= r4) goto L40
                int r7 = r5.bottom
                int r7 = r7 - r9
                if (r7 > r2) goto L3e
                goto L40
            L3e:
                r7 = 1
                return r7
            L40:
                return r0
        }

        private static boolean isMeasurementUpToDate(int r3, int r4, int r5) {
                int r0 = android.view.View.MeasureSpec.getMode(r4)
                int r4 = android.view.View.MeasureSpec.getSize(r4)
                r1 = 0
                if (r5 <= 0) goto Le
                if (r3 == r5) goto Le
                return r1
            Le:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 1
                if (r0 == r5) goto L1f
                if (r0 == 0) goto L1e
                r5 = 1073741824(0x40000000, float:2.0)
                if (r0 == r5) goto L1a
                return r1
            L1a:
                if (r4 != r3) goto L1d
                r1 = 1
            L1d:
                return r1
            L1e:
                return r2
            L1f:
                if (r4 < r3) goto L22
                r1 = 1
            L22:
                return r1
        }

        private void scrapOrRecycleView(androidx.recyclerview.widget.RecyclerView.Recycler r3, int r4, android.view.View r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r5)
                boolean r1 = r0.shouldIgnore()
                if (r1 == 0) goto Lb
                return
            Lb:
                boolean r1 = r0.isInvalid()
                if (r1 == 0) goto L28
                boolean r1 = r0.isRemoved()
                if (r1 != 0) goto L28
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.mAdapter
                boolean r1 = r1.hasStableIds()
                if (r1 != 0) goto L28
                r2.removeViewAt(r4)
                r3.recycleViewHolderInternal(r0)
                goto L35
            L28:
                r2.detachViewAt(r4)
                r3.scrapView(r5)
                androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
                androidx.recyclerview.widget.ViewInfoStore r3 = r3.mViewInfoStore
                r3.onViewDetached(r0)
            L35:
                return
        }

        public void addDisappearingView(android.view.View r2) {
                r1 = this;
                r0 = -1
                r1.addDisappearingView(r2, r0)
                return
        }

        public void addDisappearingView(android.view.View r2, int r3) {
                r1 = this;
                r0 = 1
                r1.addViewInt(r2, r3, r0)
                return
        }

        public void addView(android.view.View r2) {
                r1 = this;
                r0 = -1
                r1.addView(r2, r0)
                return
        }

        public void addView(android.view.View r2, int r3) {
                r1 = this;
                r0 = 0
                r1.addViewInt(r2, r3, r0)
                return
        }

        public void assertInLayoutOrScroll(java.lang.String r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                if (r0 == 0) goto L2a
                boolean r1 = r0.isComputingLayout()
                if (r1 != 0) goto L2a
                if (r3 != 0) goto L1c
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r1 = "Cannot call this method unless RecyclerView is computing a layout or scrolling"
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
                r3.<init>(r0)
                throw r3
            L1c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
                r1.<init>(r3)
                throw r1
            L2a:
                return
        }

        public void assertNotInLayoutOrScroll(java.lang.String r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.assertNotInLayoutOrScroll(r2)
            L7:
                return
        }

        public void attachView(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                r0 = -1
                r1.attachView(r2, r0)
                return
        }

        public void attachView(@androidx.annotation.NonNull android.view.View r2, int r3) {
                r1 = this;
                android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                r1.attachView(r2, r3, r0)
                return
        }

        public void attachView(@androidx.annotation.NonNull android.view.View r3, int r4, androidx.recyclerview.widget.RecyclerView.LayoutParams r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
                boolean r1 = r0.isRemoved()
                if (r1 == 0) goto L12
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                androidx.recyclerview.widget.ViewInfoStore r1 = r1.mViewInfoStore
                r1.addToDisappearedInLayout(r0)
                goto L19
            L12:
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                androidx.recyclerview.widget.ViewInfoStore r1 = r1.mViewInfoStore
                r1.removeFromDisappearedInLayout(r0)
            L19:
                androidx.recyclerview.widget.ChildHelper r1 = r2.mChildHelper
                boolean r0 = r0.isRemoved()
                r1.attachViewToParent(r3, r4, r5, r0)
                return
        }

        public void calculateItemDecorationsForChild(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 != 0) goto L9
                r2 = 0
                r3.set(r2, r2, r2, r2)
                return
            L9:
                android.graphics.Rect r2 = r0.getItemDecorInsetsForChild(r2)
                r3.set(r2)
                return
        }

        public boolean canScrollHorizontally() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean canScrollVertically() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
                r0 = this;
                if (r1 == 0) goto L4
                r1 = 1
                goto L5
            L4:
                r1 = 0
            L5:
                return r1
        }

        public void collectAdjacentPrefetchPositions(int r1, int r2, androidx.recyclerview.widget.RecyclerView.State r3, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r4) {
                r0 = this;
                return
        }

        public void collectInitialPrefetchPositions(int r1, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r2) {
                r0 = this;
                return
        }

        public int computeHorizontalScrollExtent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeHorizontalScrollOffset(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeHorizontalScrollRange(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeVerticalScrollExtent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeVerticalScrollOffset(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeVerticalScrollRange(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void detachAndScrapAttachedViews(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r3) {
                r2 = this;
                int r0 = r2.getChildCount()
                int r0 = r0 + (-1)
            L6:
                if (r0 < 0) goto L12
                android.view.View r1 = r2.getChildAt(r0)
                r2.scrapOrRecycleView(r3, r0, r1)
                int r0 = r0 + (-1)
                goto L6
            L12:
                return
        }

        public void detachAndScrapView(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r3) {
                r1 = this;
                androidx.recyclerview.widget.ChildHelper r0 = r1.mChildHelper
                int r0 = r0.indexOfChild(r2)
                r1.scrapOrRecycleView(r3, r0, r2)
                return
        }

        public void detachAndScrapViewAt(int r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r3) {
                r1 = this;
                android.view.View r0 = r1.getChildAt(r2)
                r1.scrapOrRecycleView(r3, r2, r0)
                return
        }

        public void detachView(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.ChildHelper r0 = r1.mChildHelper
                int r0 = r0.indexOfChild(r2)
                if (r0 < 0) goto Lb
                r1.detachViewInternal(r0, r2)
            Lb:
                return
        }

        public void detachViewAt(int r2) {
                r1 = this;
                android.view.View r0 = r1.getChildAt(r2)
                r1.detachViewInternal(r2, r0)
                return
        }

        public void endAnimation(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r0.mItemAnimator
                if (r0 == 0) goto Ld
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                r0.endAnimation(r2)
            Ld:
                return
        }

        @androidx.annotation.Nullable
        public android.view.View findContainingItemView(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.view.View r3 = r0.findContainingItemView(r3)
                if (r3 != 0) goto Ld
                return r1
            Ld:
                androidx.recyclerview.widget.ChildHelper r0 = r2.mChildHelper
                boolean r0 = r0.isHidden(r3)
                if (r0 == 0) goto L16
                return r1
            L16:
                return r3
        }

        @androidx.annotation.Nullable
        public android.view.View findViewByPosition(int r6) {
                r5 = this;
                int r0 = r5.getChildCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L32
                android.view.View r2 = r5.getChildAt(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                if (r3 != 0) goto L12
                goto L2f
            L12:
                int r4 = r3.getLayoutPosition()
                if (r4 != r6) goto L2f
                boolean r4 = r3.shouldIgnore()
                if (r4 != 0) goto L2f
                androidx.recyclerview.widget.RecyclerView r4 = r5.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$State r4 = r4.mState
                boolean r4 = r4.isPreLayout()
                if (r4 != 0) goto L2e
                boolean r3 = r3.isRemoved()
                if (r3 != 0) goto L2f
            L2e:
                return r2
            L2f:
                int r1 = r1 + 1
                goto L5
            L32:
                r6 = 0
                return r6
        }

        public abstract androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams();

        public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r0.<init>(r2, r3)
                return r0
        }

        public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams
                if (r0 == 0) goto Lc
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r2
                r0.<init>(r2)
                return r0
            Lc:
                boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r0 == 0) goto L18
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
                r0.<init>(r2)
                return r0
            L18:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r0.<init>(r2)
                return r0
        }

        public int getBaseline() {
                r1 = this;
                r0 = -1
                return r0
        }

        public int getBottomDecorationHeight(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.graphics.Rect r1 = r1.mDecorInsets
                int r1 = r1.bottom
                return r1
        }

        @androidx.annotation.Nullable
        public android.view.View getChildAt(int r2) {
                r1 = this;
                androidx.recyclerview.widget.ChildHelper r0 = r1.mChildHelper
                if (r0 == 0) goto L9
                android.view.View r2 = r0.getChildAt(r2)
                goto La
            L9:
                r2 = 0
            La:
                return r2
        }

        public int getChildCount() {
                r1 = this;
                androidx.recyclerview.widget.ChildHelper r0 = r1.mChildHelper
                if (r0 == 0) goto L9
                int r0 = r0.getChildCount()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        public boolean getClipToPadding() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto La
                boolean r0 = r0.mClipToPadding
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        public int getColumnCountForAccessibility(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2) {
                r0 = this;
                r1 = -1
                return r1
        }

        public int getDecoratedBottom(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                int r0 = r2.getBottom()
                int r2 = r1.getBottomDecorationHeight(r2)
                int r2 = r2 + r0
                return r2
        }

        public void getDecoratedBoundsWithMargins(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.graphics.Rect r2) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(r1, r2)
                return
        }

        public int getDecoratedLeft(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                int r0 = r2.getLeft()
                int r2 = r1.getLeftDecorationWidth(r2)
                int r0 = r0 - r2
                return r0
        }

        public int getDecoratedMeasuredHeight(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                android.graphics.Rect r0 = r0.mDecorInsets
                int r3 = r3.getMeasuredHeight()
                int r1 = r0.top
                int r3 = r3 + r1
                int r0 = r0.bottom
                int r3 = r3 + r0
                return r3
        }

        public int getDecoratedMeasuredWidth(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                android.graphics.Rect r0 = r0.mDecorInsets
                int r3 = r3.getMeasuredWidth()
                int r1 = r0.left
                int r3 = r3 + r1
                int r0 = r0.right
                int r3 = r3 + r0
                return r3
        }

        public int getDecoratedRight(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                int r0 = r2.getRight()
                int r2 = r1.getRightDecorationWidth(r2)
                int r2 = r2 + r0
                return r2
        }

        public int getDecoratedTop(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                int r0 = r2.getTop()
                int r2 = r1.getTopDecorationHeight(r2)
                int r0 = r0 - r2
                return r0
        }

        @androidx.annotation.Nullable
        public android.view.View getFocusedChild() {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.view.View r0 = r0.getFocusedChild()
                if (r0 == 0) goto L16
                androidx.recyclerview.widget.ChildHelper r2 = r3.mChildHelper
                boolean r2 = r2.isHidden(r0)
                if (r2 == 0) goto L15
                goto L16
            L15:
                return r0
            L16:
                return r1
        }

        @androidx.annotation.Px
        public int getHeight() {
                r1 = this;
                int r0 = r1.mHeight
                return r0
        }

        public int getHeightMode() {
                r1 = this;
                int r0 = r1.mHeightMode
                return r0
        }

        public int getItemCount() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                goto La
            L9:
                r0 = 0
            La:
                if (r0 == 0) goto L11
                int r0 = r0.getItemCount()
                goto L12
            L11:
                r0 = 0
            L12:
                return r0
        }

        public int getItemViewType(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r1)
                int r1 = r1.getItemViewType()
                return r1
        }

        public int getLayoutDirection() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
                return r0
        }

        public int getLeftDecorationWidth(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.graphics.Rect r1 = r1.mDecorInsets
                int r1 = r1.left
                return r1
        }

        @androidx.annotation.Px
        public int getMinimumHeight() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r0)
                return r0
        }

        @androidx.annotation.Px
        public int getMinimumWidth() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                int r0 = androidx.core.view.ViewCompat.getMinimumWidth(r0)
                return r0
        }

        @androidx.annotation.Px
        public int getPaddingBottom() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingBottom()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @androidx.annotation.Px
        public int getPaddingEnd() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = androidx.core.view.ViewCompat.getPaddingEnd(r0)
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @androidx.annotation.Px
        public int getPaddingLeft() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingLeft()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @androidx.annotation.Px
        public int getPaddingRight() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingRight()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @androidx.annotation.Px
        public int getPaddingStart() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = androidx.core.view.ViewCompat.getPaddingStart(r0)
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @androidx.annotation.Px
        public int getPaddingTop() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingTop()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        public int getPosition(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                int r1 = r1.getViewLayoutPosition()
                return r1
        }

        public int getRightDecorationWidth(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.graphics.Rect r1 = r1.mDecorInsets
                int r1 = r1.right
                return r1
        }

        public int getRowCountForAccessibility(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2) {
                r0 = this;
                r1 = -1
                return r1
        }

        public int getSelectionModeForAccessibility(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int getTopDecorationHeight(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.graphics.Rect r1 = r1.mDecorInsets
                int r1 = r1.top
                return r1
        }

        public void getTransformedBoundingBox(@androidx.annotation.NonNull android.view.View r6, boolean r7, @androidx.annotation.NonNull android.graphics.Rect r8) {
                r5 = this;
                if (r7 == 0) goto L22
                android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r7 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r7
                android.graphics.Rect r7 = r7.mDecorInsets
                int r0 = r7.left
                int r0 = -r0
                int r1 = r7.top
                int r1 = -r1
                int r2 = r6.getWidth()
                int r3 = r7.right
                int r2 = r2 + r3
                int r3 = r6.getHeight()
                int r7 = r7.bottom
                int r3 = r3 + r7
                r8.set(r0, r1, r2, r3)
                goto L2e
            L22:
                int r7 = r6.getWidth()
                int r0 = r6.getHeight()
                r1 = 0
                r8.set(r1, r1, r7, r0)
            L2e:
                androidx.recyclerview.widget.RecyclerView r7 = r5.mRecyclerView
                if (r7 == 0) goto L6b
                android.graphics.Matrix r7 = r6.getMatrix()
                if (r7 == 0) goto L6b
                boolean r0 = r7.isIdentity()
                if (r0 != 0) goto L6b
                androidx.recyclerview.widget.RecyclerView r0 = r5.mRecyclerView
                android.graphics.RectF r0 = r0.mTempRectF
                r0.set(r8)
                r7.mapRect(r0)
                float r7 = r0.left
                double r1 = (double) r7
                double r1 = java.lang.Math.floor(r1)
                int r7 = (int) r1
                float r1 = r0.top
                double r1 = (double) r1
                double r1 = java.lang.Math.floor(r1)
                int r1 = (int) r1
                float r2 = r0.right
                double r2 = (double) r2
                double r2 = java.lang.Math.ceil(r2)
                int r2 = (int) r2
                float r0 = r0.bottom
                double r3 = (double) r0
                double r3 = java.lang.Math.ceil(r3)
                int r0 = (int) r3
                r8.set(r7, r1, r2, r0)
            L6b:
                int r7 = r6.getLeft()
                int r6 = r6.getTop()
                r8.offset(r7, r6)
                return
        }

        @androidx.annotation.Px
        public int getWidth() {
                r1 = this;
                int r0 = r1.mWidth
                return r0
        }

        public int getWidthMode() {
                r1 = this;
                int r0 = r1.mWidthMode
                return r0
        }

        public boolean hasFocus() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto Lc
                boolean r0 = r0.hasFocus()
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public void ignoreView(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                android.view.ViewParent r0 = r3.getParent()
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                if (r0 != r1) goto L20
                int r0 = r1.indexOfChild(r3)
                r1 = -1
                if (r0 == r1) goto L20
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
                r0 = 128(0x80, float:1.8E-43)
                r3.addFlags(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.ViewInfoStore r0 = r0.mViewInfoStore
                r0.removeViewHolder(r3)
                return
            L20:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "View should be fully attached to be ignored"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
                r3.<init>(r0)
                throw r3
        }

        public boolean isAttachedToWindow() {
                r1 = this;
                boolean r0 = r1.mIsAttachedToWindow
                return r0
        }

        public boolean isAutoMeasureEnabled() {
                r1 = this;
                boolean r0 = r1.mAutoMeasure
                return r0
        }

        public boolean isFocused() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto Lc
                boolean r0 = r0.isFocused()
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final boolean isItemPrefetchEnabled() {
                r1 = this;
                boolean r0 = r1.mItemPrefetchEnabled
                return r0
        }

        public boolean isLayoutHierarchical(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean isMeasurementCacheEnabled() {
                r1 = this;
                boolean r0 = r1.mMeasurementCacheEnabled
                return r0
        }

        public boolean isSmoothScrolling() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r0 = r1.mSmoothScroller
                if (r0 == 0) goto Lc
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public boolean isViewPartiallyVisible(@androidx.annotation.NonNull android.view.View r2, boolean r3, boolean r4) {
                r1 = this;
                androidx.recyclerview.widget.ViewBoundsCheck r4 = r1.mHorizontalBoundCheck
                boolean r4 = r4.isViewWithinBoundFlags(r2)
                r0 = 1
                if (r4 == 0) goto L13
                androidx.recyclerview.widget.ViewBoundsCheck r4 = r1.mVerticalBoundCheck
                boolean r2 = r4.isViewWithinBoundFlags(r2)
                if (r2 == 0) goto L13
                r2 = 1
                goto L14
            L13:
                r2 = 0
            L14:
                if (r3 == 0) goto L17
                return r2
            L17:
                r2 = r2 ^ r0
                return r2
        }

        public void layoutDecorated(@androidx.annotation.NonNull android.view.View r3, int r4, int r5, int r6, int r7) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                android.graphics.Rect r0 = r0.mDecorInsets
                int r1 = r0.left
                int r4 = r4 + r1
                int r1 = r0.top
                int r5 = r5 + r1
                int r1 = r0.right
                int r6 = r6 - r1
                int r0 = r0.bottom
                int r7 = r7 - r0
                r3.layout(r4, r5, r6, r7)
                return
        }

        public void layoutDecoratedWithMargins(@androidx.annotation.NonNull android.view.View r4, int r5, int r6, int r7, int r8) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                android.graphics.Rect r1 = r0.mDecorInsets
                int r2 = r1.left
                int r5 = r5 + r2
                int r2 = r0.leftMargin
                int r5 = r5 + r2
                int r2 = r1.top
                int r6 = r6 + r2
                int r2 = r0.topMargin
                int r6 = r6 + r2
                int r2 = r1.right
                int r7 = r7 - r2
                int r2 = r0.rightMargin
                int r7 = r7 - r2
                int r1 = r1.bottom
                int r8 = r8 - r1
                int r0 = r0.bottomMargin
                int r8 = r8 - r0
                r4.layout(r5, r6, r7, r8)
                return
        }

        public void measureChild(@androidx.annotation.NonNull android.view.View r6, int r7, int r8) {
                r5 = this;
                android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                androidx.recyclerview.widget.RecyclerView r1 = r5.mRecyclerView
                android.graphics.Rect r1 = r1.getItemDecorInsetsForChild(r6)
                int r2 = r1.left
                int r3 = r1.right
                int r2 = r2 + r3
                int r2 = r2 + r7
                int r7 = r1.top
                int r1 = r1.bottom
                int r7 = r7 + r1
                int r7 = r7 + r8
                int r8 = r5.getWidth()
                int r1 = r5.getWidthMode()
                int r3 = r5.getPaddingLeft()
                int r4 = r5.getPaddingRight()
                int r4 = r4 + r3
                int r4 = r4 + r2
                int r2 = r0.width
                boolean r3 = r5.canScrollHorizontally()
                int r8 = getChildMeasureSpec(r8, r1, r4, r2, r3)
                int r1 = r5.getHeight()
                int r2 = r5.getHeightMode()
                int r3 = r5.getPaddingTop()
                int r4 = r5.getPaddingBottom()
                int r4 = r4 + r3
                int r4 = r4 + r7
                int r7 = r0.height
                boolean r3 = r5.canScrollVertically()
                int r7 = getChildMeasureSpec(r1, r2, r4, r7, r3)
                boolean r0 = r5.shouldMeasureChild(r6, r8, r7, r0)
                if (r0 == 0) goto L59
                r6.measure(r8, r7)
            L59:
                return
        }

        public void measureChildWithMargins(@androidx.annotation.NonNull android.view.View r6, int r7, int r8) {
                r5 = this;
                android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
                androidx.recyclerview.widget.RecyclerView r1 = r5.mRecyclerView
                android.graphics.Rect r1 = r1.getItemDecorInsetsForChild(r6)
                int r2 = r1.left
                int r3 = r1.right
                int r2 = r2 + r3
                int r2 = r2 + r7
                int r7 = r1.top
                int r1 = r1.bottom
                int r7 = r7 + r1
                int r7 = r7 + r8
                int r8 = r5.getWidth()
                int r1 = r5.getWidthMode()
                int r3 = r5.getPaddingLeft()
                int r4 = r5.getPaddingRight()
                int r4 = r4 + r3
                int r3 = r0.leftMargin
                int r4 = r4 + r3
                int r3 = r0.rightMargin
                int r4 = r4 + r3
                int r4 = r4 + r2
                int r2 = r0.width
                boolean r3 = r5.canScrollHorizontally()
                int r8 = getChildMeasureSpec(r8, r1, r4, r2, r3)
                int r1 = r5.getHeight()
                int r2 = r5.getHeightMode()
                int r3 = r5.getPaddingTop()
                int r4 = r5.getPaddingBottom()
                int r4 = r4 + r3
                int r3 = r0.topMargin
                int r4 = r4 + r3
                int r3 = r0.bottomMargin
                int r4 = r4 + r3
                int r4 = r4 + r7
                int r7 = r0.height
                boolean r3 = r5.canScrollVertically()
                int r7 = getChildMeasureSpec(r1, r2, r4, r7, r3)
                boolean r0 = r5.shouldMeasureChild(r6, r8, r7, r0)
                if (r0 == 0) goto L65
                r6.measure(r8, r7)
            L65:
                return
        }

        public void moveView(int r3, int r4) {
                r2 = this;
                android.view.View r0 = r2.getChildAt(r3)
                if (r0 == 0) goto Ld
                r2.detachViewAt(r3)
                r2.attachView(r0, r4)
                return
            Ld:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot move a child from non-existing index:"
                r0.append(r1)
                r0.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
                java.lang.String r3 = r3.toString()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }

        public void offsetChildrenHorizontal(@androidx.annotation.Px int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.offsetChildrenHorizontal(r2)
            L7:
                return
        }

        public void offsetChildrenVertical(@androidx.annotation.Px int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.offsetChildrenVertical(r2)
            L7:
                return
        }

        public void onAdapterChanged(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r1, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r2) {
                r0 = this;
                return
        }

        public boolean onAddFocusables(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull java.util.ArrayList<android.view.View> r2, int r3, int r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @androidx.annotation.CallSuper
        public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        @java.lang.Deprecated
        public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        @androidx.annotation.CallSuper
        public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.Recycler r2) {
                r0 = this;
                r0.onDetachedFromWindow(r1)
                return
        }

        @androidx.annotation.Nullable
        public android.view.View onFocusSearchFailed(@androidx.annotation.NonNull android.view.View r1, int r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onInitializeAccessibilityEvent(@androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$Recycler r1 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                r2.onInitializeAccessibilityEvent(r1, r0, r3)
                return
        }

        public void onInitializeAccessibilityEvent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r3, @androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                if (r2 == 0) goto L39
                if (r4 != 0) goto L7
                goto L39
            L7:
                r3 = 1
                boolean r2 = r2.canScrollVertically(r3)
                if (r2 != 0) goto L29
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                r0 = -1
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 != 0) goto L29
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                boolean r2 = r2.canScrollHorizontally(r0)
                if (r2 != 0) goto L29
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                boolean r2 = r2.canScrollHorizontally(r3)
                if (r2 == 0) goto L28
                goto L29
            L28:
                r3 = 0
            L29:
                r4.setScrollable(r3)
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$Adapter r2 = r2.mAdapter
                if (r2 == 0) goto L39
                int r2 = r2.getItemCount()
                r4.setItemCount(r2)
            L39:
                return
        }

        public void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r4, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r5, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r6) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                r1 = -1
                boolean r0 = r0.canScrollVertically(r1)
                r2 = 1
                if (r0 != 0) goto L12
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                boolean r0 = r0.canScrollHorizontally(r1)
                if (r0 == 0) goto L1a
            L12:
                r0 = 8192(0x2000, float:1.148E-41)
                r6.addAction(r0)
                r6.setScrollable(r2)
            L1a:
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                boolean r0 = r0.canScrollVertically(r2)
                if (r0 != 0) goto L2a
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                boolean r0 = r0.canScrollHorizontally(r2)
                if (r0 == 0) goto L32
            L2a:
                r0 = 4096(0x1000, float:5.74E-42)
                r6.addAction(r0)
                r6.setScrollable(r2)
            L32:
                int r0 = r3.getRowCountForAccessibility(r4, r5)
                int r1 = r3.getColumnCountForAccessibility(r4, r5)
                boolean r2 = r3.isLayoutHierarchical(r4, r5)
                int r4 = r3.getSelectionModeForAccessibility(r4, r5)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r0, r1, r2, r4)
                r6.setCollectionInfo(r4)
                return
        }

        public final void onInitializeAccessibilityNodeInfoForItem(android.view.View r3, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
                if (r0 == 0) goto L1f
                boolean r1 = r0.isRemoved()
                if (r1 != 0) goto L1f
                androidx.recyclerview.widget.ChildHelper r1 = r2.mChildHelper
                android.view.View r0 = r0.itemView
                boolean r0 = r1.isHidden(r0)
                if (r0 != 0) goto L1f
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$Recycler r1 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                r2.onInitializeAccessibilityNodeInfoForItem(r1, r0, r3, r4)
            L1f:
                return
        }

        public void onInitializeAccessibilityNodeInfoForItem(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
                r0 = this;
                return
        }

        @androidx.annotation.Nullable
        public android.view.View onInterceptFocusSearch(@androidx.annotation.NonNull android.view.View r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onItemsAdded(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void onItemsChanged(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        public void onItemsMoved(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        public void onItemsRemoved(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void onItemsUpdated(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void onItemsUpdated(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, @androidx.annotation.Nullable java.lang.Object r4) {
                r0 = this;
                r0.onItemsUpdated(r1, r2, r3)
                return
        }

        public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r1, androidx.recyclerview.widget.RecyclerView.State r2) {
                r0 = this;
                java.lang.String r1 = "RecyclerView"
                java.lang.String r2 = "You must override onLayoutChildren(Recycler recycler, State state) "
                android.util.Log.e(r1, r2)
                return
        }

        public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State r1) {
                r0 = this;
                return
        }

        public void onMeasure(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2, int r3, int r4) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
                r1.defaultOnMeasure(r3, r4)
                return
        }

        @java.lang.Deprecated
        public boolean onRequestChildFocus(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.view.View r3) {
                r0 = this;
                boolean r2 = r0.isSmoothScrolling()
                if (r2 != 0) goto Lf
                boolean r1 = r1.isComputingLayout()
                if (r1 == 0) goto Ld
                goto Lf
            Ld:
                r1 = 0
                goto L10
            Lf:
                r1 = 1
            L10:
                return r1
        }

        public boolean onRequestChildFocus(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.Nullable android.view.View r4) {
                r0 = this;
                boolean r1 = r0.onRequestChildFocus(r1, r3, r4)
                return r1
        }

        public void onRestoreInstanceState(android.os.Parcelable r1) {
                r0 = this;
                return
        }

        @androidx.annotation.Nullable
        public android.os.Parcelable onSaveInstanceState() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void onScrollStateChanged(int r1) {
                r0 = this;
                return
        }

        public boolean performAccessibilityAction(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r8, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r9, int r10, @androidx.annotation.Nullable android.os.Bundle r11) {
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.mRecyclerView
                r9 = 0
                if (r8 != 0) goto L6
                return r9
            L6:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L42
                r11 = 8192(0x2000, float:1.148E-41)
                if (r10 == r11) goto L12
                r2 = 0
                r3 = 0
                goto L73
            L12:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L29
                int r8 = r7.getHeight()
                int r11 = r7.getPaddingTop()
                int r8 = r8 - r11
                int r11 = r7.getPaddingBottom()
                int r8 = r8 - r11
                int r8 = -r8
                goto L2a
            L29:
                r8 = 0
            L2a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.mRecyclerView
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L71
                int r10 = r7.getWidth()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
                int r10 = -r10
                goto L6e
            L42:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L57
                int r8 = r7.getHeight()
                int r10 = r7.getPaddingTop()
                int r8 = r8 - r10
                int r10 = r7.getPaddingBottom()
                int r8 = r8 - r10
                goto L58
            L57:
                r8 = 0
            L58:
                androidx.recyclerview.widget.RecyclerView r10 = r7.mRecyclerView
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L71
                int r10 = r7.getWidth()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
            L6e:
                r3 = r8
                r2 = r10
                goto L73
            L71:
                r3 = r8
                r2 = 0
            L73:
                if (r3 != 0) goto L78
                if (r2 != 0) goto L78
                return r9
            L78:
                androidx.recyclerview.widget.RecyclerView r1 = r7.mRecyclerView
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
        }

        public boolean performAccessibilityActionForItem(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2, @androidx.annotation.NonNull android.view.View r3, int r4, @androidx.annotation.Nullable android.os.Bundle r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void postOnAnimation(java.lang.Runnable r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                androidx.core.view.ViewCompat.postOnAnimation(r0, r2)
            L7:
                return
        }

        public void removeAllViews() {
                r2 = this;
                int r0 = r2.getChildCount()
                int r0 = r0 + (-1)
            L6:
                if (r0 < 0) goto L10
                androidx.recyclerview.widget.ChildHelper r1 = r2.mChildHelper
                r1.removeViewAt(r0)
                int r0 = r0 + (-1)
                goto L6
            L10:
                return
        }

        public void removeAndRecycleAllViews(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r3) {
                r2 = this;
                int r0 = r2.getChildCount()
                int r0 = r0 + (-1)
            L6:
                if (r0 < 0) goto L1c
                android.view.View r1 = r2.getChildAt(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r1)
                boolean r1 = r1.shouldIgnore()
                if (r1 != 0) goto L19
                r2.removeAndRecycleViewAt(r0, r3)
            L19:
                int r0 = r0 + (-1)
                goto L6
            L1c:
                return
        }

        public final void removeAndRecycleScrapInt(androidx.recyclerview.widget.RecyclerView.Recycler r7) {
                r6 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r7.mAttachedScrap
                int r0 = r0.size()
                int r1 = r0 + (-1)
            L8:
                if (r1 < 0) goto L4d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r7.mAttachedScrap
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
                android.view.View r2 = r2.itemView
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                boolean r4 = r3.shouldIgnore()
                if (r4 == 0) goto L1f
                goto L4a
            L1f:
                r4 = 0
                r3.setIsRecyclable(r4)
                boolean r5 = r3.isTmpDetached()
                if (r5 == 0) goto L2e
                androidx.recyclerview.widget.RecyclerView r5 = r6.mRecyclerView
                r5.removeDetachedView(r2, r4)
            L2e:
                androidx.recyclerview.widget.RecyclerView r5 = r6.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r5 = r5.mItemAnimator
                if (r5 == 0) goto L37
                r5.endAnimation(r3)
            L37:
                r5 = 1
                r3.setIsRecyclable(r5)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                r3 = 0
                r2.mScrapContainer = r3
                r2.mInChangeScrap = r4
                r2.clearReturnedFromScrapFlag()
                r7.recycleViewHolderInternal(r2)
            L4a:
                int r1 = r1 + (-1)
                goto L8
            L4d:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r7.mAttachedScrap
                r1.clear()
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r7 = r7.mChangedScrap
                if (r7 == 0) goto L59
                r7.clear()
            L59:
                if (r0 <= 0) goto L60
                androidx.recyclerview.widget.RecyclerView r7 = r6.mRecyclerView
                r7.invalidate()
            L60:
                return
        }

        public void removeAndRecycleView(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r2) {
                r0 = this;
                r0.removeView(r1)
                r2.recycleView(r1)
                return
        }

        public void removeAndRecycleViewAt(int r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r3) {
                r1 = this;
                android.view.View r0 = r1.getChildAt(r2)
                r1.removeViewAt(r2)
                r3.recycleView(r0)
                return
        }

        public boolean removeCallbacks(java.lang.Runnable r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                boolean r2 = r0.removeCallbacks(r2)
                return r2
            L9:
                r2 = 0
                return r2
        }

        public void removeDetachedView(@androidx.annotation.NonNull android.view.View r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                r1 = 0
                r0.removeDetachedView(r3, r1)
                return
        }

        public void removeView(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.ChildHelper r0 = r1.mChildHelper
                r0.removeView(r2)
                return
        }

        public void removeViewAt(int r2) {
                r1 = this;
                android.view.View r0 = r1.getChildAt(r2)
                if (r0 == 0) goto Lb
                androidx.recyclerview.widget.ChildHelper r0 = r1.mChildHelper
                r0.removeViewAt(r2)
            Lb:
                return
        }

        public boolean requestChildRectangleOnScreen(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r7, @androidx.annotation.NonNull android.view.View r8, @androidx.annotation.NonNull android.graphics.Rect r9, boolean r10) {
                r6 = this;
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                boolean r7 = r0.requestChildRectangleOnScreen(r1, r2, r3, r4, r5)
                return r7
        }

        public boolean requestChildRectangleOnScreen(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r3, @androidx.annotation.NonNull android.view.View r4, @androidx.annotation.NonNull android.graphics.Rect r5, boolean r6, boolean r7) {
                r2 = this;
                int[] r4 = r2.getChildRectangleOnScreenScrollAmount(r4, r5)
                r5 = 0
                r0 = r4[r5]
                r1 = 1
                r4 = r4[r1]
                if (r7 == 0) goto L12
                boolean r7 = r2.isFocusedChildVisibleAfterScrolling(r3, r0, r4)
                if (r7 == 0) goto L17
            L12:
                if (r0 != 0) goto L18
                if (r4 == 0) goto L17
                goto L18
            L17:
                return r5
            L18:
                if (r6 == 0) goto L1e
                r3.scrollBy(r0, r4)
                goto L21
            L1e:
                r3.smoothScrollBy(r0, r4)
            L21:
                return r1
        }

        public void requestLayout() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.requestLayout()
            L7:
                return
        }

        public void requestSimpleAnimationsInNextLayout() {
                r1 = this;
                r0 = 1
                r1.mRequestedSimpleAnimations = r0
                return
        }

        public int scrollHorizontallyBy(int r1, androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void scrollToPosition(int r1) {
                r0 = this;
                return
        }

        public int scrollVerticallyBy(int r1, androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @java.lang.Deprecated
        public void setAutoMeasureEnabled(boolean r1) {
                r0 = this;
                r0.mAutoMeasure = r1
                return
        }

        public final void setExactMeasureSpecsFrom(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                int r0 = r3.getWidth()
                r1 = 1073741824(0x40000000, float:2.0)
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
                int r3 = r3.getHeight()
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
                r2.setMeasureSpecs(r0, r3)
                return
        }

        public final void setItemPrefetchEnabled(boolean r2) {
                r1 = this;
                boolean r0 = r1.mItemPrefetchEnabled
                if (r2 == r0) goto L12
                r1.mItemPrefetchEnabled = r2
                r2 = 0
                r1.mPrefetchMaxCountObserved = r2
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                if (r2 == 0) goto L12
                androidx.recyclerview.widget.RecyclerView$Recycler r2 = r2.mRecycler
                r2.updateViewCacheSize()
            L12:
                return
        }

        public final void setMeasureSpecs(int r2, int r3) {
                r1 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r2)
                r1.mWidth = r0
                int r2 = android.view.View.MeasureSpec.getMode(r2)
                r1.mWidthMode = r2
                r0 = 0
                if (r2 != 0) goto L15
                boolean r2 = androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC
                if (r2 != 0) goto L15
                r1.mWidth = r0
            L15:
                int r2 = android.view.View.MeasureSpec.getSize(r3)
                r1.mHeight = r2
                int r2 = android.view.View.MeasureSpec.getMode(r3)
                r1.mHeightMode = r2
                if (r2 != 0) goto L29
                boolean r2 = androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC
                if (r2 != 0) goto L29
                r1.mHeight = r0
            L29:
                return
        }

        public void setMeasuredDimension(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView.access$300(r0, r2, r3)
                return
        }

        public void setMeasuredDimension(android.graphics.Rect r3, int r4, int r5) {
                r2 = this;
                int r0 = r3.width()
                int r1 = r2.getPaddingLeft()
                int r1 = r1 + r0
                int r0 = r2.getPaddingRight()
                int r0 = r0 + r1
                int r3 = r3.height()
                int r1 = r2.getPaddingTop()
                int r1 = r1 + r3
                int r3 = r2.getPaddingBottom()
                int r3 = r3 + r1
                int r1 = r2.getMinimumWidth()
                int r4 = chooseSize(r4, r0, r1)
                int r0 = r2.getMinimumHeight()
                int r3 = chooseSize(r5, r3, r0)
                r2.setMeasuredDimension(r4, r3)
                return
        }

        public final void setMeasuredDimensionFromChildren(int r9, int r10) {
                r8 = this;
                int r0 = r8.getChildCount()
                if (r0 != 0) goto Lc
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                r0.defaultOnMeasure(r9, r10)
                return
            Lc:
                r1 = 0
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 2147483647(0x7fffffff, float:NaN)
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
            L19:
                if (r1 >= r0) goto L3d
                android.view.View r6 = r8.getChildAt(r1)
                androidx.recyclerview.widget.RecyclerView r7 = r8.mRecyclerView
                android.graphics.Rect r7 = r7.mTempRect
                r8.getDecoratedBoundsWithMargins(r6, r7)
                int r6 = r7.left
                if (r6 >= r2) goto L2b
                r2 = r6
            L2b:
                int r6 = r7.right
                if (r6 <= r4) goto L30
                r4 = r6
            L30:
                int r6 = r7.top
                if (r6 >= r3) goto L35
                r3 = r6
            L35:
                int r6 = r7.bottom
                if (r6 <= r5) goto L3a
                r5 = r6
            L3a:
                int r1 = r1 + 1
                goto L19
            L3d:
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                android.graphics.Rect r0 = r0.mTempRect
                r0.set(r2, r3, r4, r5)
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                android.graphics.Rect r0 = r0.mTempRect
                r8.setMeasuredDimension(r0, r9, r10)
                return
        }

        public void setMeasurementCacheEnabled(boolean r1) {
                r0 = this;
                r0.mMeasurementCacheEnabled = r1
                return
        }

        public final void setRecyclerView(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                if (r2 != 0) goto Ld
                r2 = 0
                r1.mRecyclerView = r2
                r1.mChildHelper = r2
                r2 = 0
                r1.mWidth = r2
                r1.mHeight = r2
                goto L1f
            Ld:
                r1.mRecyclerView = r2
                androidx.recyclerview.widget.ChildHelper r0 = r2.mChildHelper
                r1.mChildHelper = r0
                int r0 = r2.getWidth()
                r1.mWidth = r0
                int r2 = r2.getHeight()
                r1.mHeight = r2
            L1f:
                r2 = 1073741824(0x40000000, float:2.0)
                r1.mWidthMode = r2
                r1.mHeightMode = r2
                return
        }

        public final boolean shouldMeasureChild(android.view.View r3, int r4, int r5, androidx.recyclerview.widget.RecyclerView.LayoutParams r6) {
                r2 = this;
                boolean r0 = r3.isLayoutRequested()
                if (r0 != 0) goto L25
                boolean r0 = r2.mMeasurementCacheEnabled
                if (r0 == 0) goto L25
                int r0 = r3.getWidth()
                int r1 = r6.width
                boolean r4 = isMeasurementUpToDate(r0, r4, r1)
                if (r4 == 0) goto L25
                int r3 = r3.getHeight()
                int r4 = r6.height
                boolean r3 = isMeasurementUpToDate(r3, r5, r4)
                if (r3 != 0) goto L23
                goto L25
            L23:
                r3 = 0
                goto L26
            L25:
                r3 = 1
            L26:
                return r3
        }

        public boolean shouldMeasureTwice() {
                r1 = this;
                r0 = 0
                return r0
        }

        public final boolean shouldReMeasureChild(android.view.View r3, int r4, int r5, androidx.recyclerview.widget.RecyclerView.LayoutParams r6) {
                r2 = this;
                boolean r0 = r2.mMeasurementCacheEnabled
                if (r0 == 0) goto L1f
                int r0 = r3.getMeasuredWidth()
                int r1 = r6.width
                boolean r4 = isMeasurementUpToDate(r0, r4, r1)
                if (r4 == 0) goto L1f
                int r3 = r3.getMeasuredHeight()
                int r4 = r6.height
                boolean r3 = isMeasurementUpToDate(r3, r5, r4)
                if (r3 != 0) goto L1d
                goto L1f
            L1d:
                r3 = 0
                goto L20
            L1f:
                r3 = 1
            L20:
                return r3
        }

        public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.State r2, int r3) {
                r0 = this;
                java.lang.String r1 = "RecyclerView"
                java.lang.String r2 = "You must override smoothScrollToPosition to support smooth scrolling"
                android.util.Log.e(r1, r2)
                return
        }

        public void startSmoothScroll(androidx.recyclerview.widget.RecyclerView.SmoothScroller r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r0 = r1.mSmoothScroller
                if (r0 == 0) goto L11
                if (r2 == r0) goto L11
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto L11
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r0 = r1.mSmoothScroller
                r0.stop()
            L11:
                r1.mSmoothScroller = r2
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                r2.start(r0, r1)
                return
        }

        public void stopIgnoringView(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                int r0 = r2.mFlags
                r0 = r0 & (-129(0xffffffffffffff7f, float:NaN))
                r2.mFlags = r0
                r2.resetInternal()
                r0 = 4
                r2.addFlags(r0)
                return
        }

        public boolean supportsPredictiveItemAnimations() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public final android.graphics.Rect mDecorInsets;
        public boolean mInsetsDirty;
        public boolean mPendingInvalidate;
        public androidx.recyclerview.widget.RecyclerView.ViewHolder mViewHolder;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mDecorInsets = r1
                r1 = 1
                r0.mInsetsDirty = r1
                r1 = 0
                r0.mPendingInvalidate = r1
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mDecorInsets = r1
                r1 = 1
                r0.mInsetsDirty = r1
                r1 = 0
                r0.mPendingInvalidate = r1
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mDecorInsets = r1
                r1 = 1
                r0.mInsetsDirty = r1
                r1 = 0
                r0.mPendingInvalidate = r1
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mDecorInsets = r1
                r1 = 1
                r0.mInsetsDirty = r1
                r1 = 0
                r0.mPendingInvalidate = r1
                return
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mDecorInsets = r1
                r1 = 1
                r0.mInsetsDirty = r1
                r1 = 0
                r0.mPendingInvalidate = r1
                return
        }

        public int getAbsoluteAdapterPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                int r0 = r0.getAbsoluteAdapterPosition()
                return r0
        }

        public int getBindingAdapterPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                int r0 = r0.getBindingAdapterPosition()
                return r0
        }

        @java.lang.Deprecated
        public int getViewAdapterPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                int r0 = r0.getBindingAdapterPosition()
                return r0
        }

        public int getViewLayoutPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                int r0 = r0.getLayoutPosition()
                return r0
        }

        @java.lang.Deprecated
        public int getViewPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                int r0 = r0.getPosition()
                return r0
        }

        public boolean isItemChanged() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                boolean r0 = r0.isUpdated()
                return r0
        }

        public boolean isItemRemoved() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                boolean r0 = r0.isRemoved()
                return r0
        }

        public boolean isViewInvalid() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                boolean r0 = r0.isInvalid()
                return r0
        }

        public boolean viewNeedsUpdate() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.mViewHolder
                boolean r0 = r0.needsUpdate()
                return r0
        }
    }

    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(@androidx.annotation.NonNull android.view.View r1);

        void onChildViewDetachedFromWindow(@androidx.annotation.NonNull android.view.View r1);
    }

    public static abstract class OnFlingListener {
        public OnFlingListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean onFling(int r1, int r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull android.view.MotionEvent r2);

        void onRequestDisallowInterceptTouchEvent(boolean r1);

        void onTouchEvent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull android.view.MotionEvent r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class OnScrollListener {
        public OnScrollListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onScrollStateChanged(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2) {
                r0 = this;
                return
        }

        public void onScrolled(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Orientation {
    }

    public static class RecycledViewPool {
        private static final int DEFAULT_MAX_SCRAP = 5;
        private int mAttachCount;
        public android.util.SparseArray<androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData> mScrap;

        public static class ScrapData {
            public long mBindRunningAverageNs;
            public long mCreateRunningAverageNs;
            public int mMaxScrap;
            public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mScrapHeap;

            public ScrapData() {
                    r2 = this;
                    r2.<init>()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r2.mScrapHeap = r0
                    r0 = 5
                    r2.mMaxScrap = r0
                    r0 = 0
                    r2.mCreateRunningAverageNs = r0
                    r2.mBindRunningAverageNs = r0
                    return
            }
        }

        public RecycledViewPool() {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mScrap = r0
                r0 = 0
                r1.mAttachCount = r0
                return
        }

        private androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData getScrapDataForType(int r3) {
                r2 = this;
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r0 = r2.mScrap
                java.lang.Object r0 = r0.get(r3)
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r0 = (androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData) r0
                if (r0 != 0) goto L14
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r0 = new androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData
                r0.<init>()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r1 = r2.mScrap
                r1.put(r3, r0)
            L14:
                return r0
        }

        public final void attach() {
                r1 = this;
                int r0 = r1.mAttachCount
                int r0 = r0 + 1
                r1.mAttachCount = r0
                return
        }

        public void clear() {
                r2 = this;
                r0 = 0
            L1:
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r1 = r2.mScrap
                int r1 = r1.size()
                if (r0 >= r1) goto L19
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r1 = r2.mScrap
                java.lang.Object r1 = r1.valueAt(r0)
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r1 = (androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData) r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r1.mScrapHeap
                r1.clear()
                int r0 = r0 + 1
                goto L1
            L19:
                return
        }

        public final void detach() {
                r1 = this;
                int r0 = r1.mAttachCount
                int r0 = r0 + (-1)
                r1.mAttachCount = r0
                return
        }

        public final void factorInBindTime(int r7, long r8) {
                r6 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r7 = r6.getScrapDataForType(r7)
                long r0 = r7.mBindRunningAverageNs
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Ld
                goto L16
            Ld:
                r2 = 4
                long r0 = r0 / r2
                r4 = 3
                long r0 = r0 * r4
                long r8 = r8 / r2
                long r8 = r8 + r0
            L16:
                r7.mBindRunningAverageNs = r8
                return
        }

        public final void factorInCreateTime(int r7, long r8) {
                r6 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r7 = r6.getScrapDataForType(r7)
                long r0 = r7.mCreateRunningAverageNs
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Ld
                goto L16
            Ld:
                r2 = 4
                long r0 = r0 / r2
                r4 = 3
                long r0 = r0 * r4
                long r8 = r8 / r2
                long r8 = r8 + r0
            L16:
                r7.mCreateRunningAverageNs = r8
                return
        }

        @androidx.annotation.Nullable
        public androidx.recyclerview.widget.RecyclerView.ViewHolder getRecycledView(int r3) {
                r2 = this;
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r0 = r2.mScrap
                java.lang.Object r3 = r0.get(r3)
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r3 = (androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData) r3
                if (r3 == 0) goto L32
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r3.mScrapHeap
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L32
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r3.mScrapHeap
                int r0 = r3.size()
                int r0 = r0 + (-1)
            L1a:
                if (r0 < 0) goto L32
                java.lang.Object r1 = r3.get(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r1
                boolean r1 = r1.isAttachedToTransitionOverlay()
                if (r1 != 0) goto L2f
                java.lang.Object r3 = r3.remove(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r3
                return r3
            L2f:
                int r0 = r0 + (-1)
                goto L1a
            L32:
                r3 = 0
                return r3
        }

        public int getRecycledViewCount(int r1) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r1 = r0.getScrapDataForType(r1)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r1.mScrapHeap
                int r1 = r1.size()
                return r1
        }

        public final void onAdapterChanged(androidx.recyclerview.widget.RecyclerView.Adapter r1, androidx.recyclerview.widget.RecyclerView.Adapter r2, boolean r3) {
                r0 = this;
                if (r1 == 0) goto L8
                int r1 = r0.mAttachCount
                int r1 = r1 + (-1)
                r0.mAttachCount = r1
            L8:
                if (r3 != 0) goto L11
                int r1 = r0.mAttachCount
                if (r1 != 0) goto L11
                r0.clear()
            L11:
                if (r2 == 0) goto L19
                int r1 = r0.mAttachCount
                int r1 = r1 + 1
                r0.mAttachCount = r1
            L19:
                return
        }

        public void putRecycledView(androidx.recyclerview.widget.RecyclerView.ViewHolder r4) {
                r3 = this;
                int r0 = r4.getItemViewType()
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r1 = r3.getScrapDataForType(r0)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r1.mScrapHeap
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData> r2 = r3.mScrap
                java.lang.Object r0 = r2.get(r0)
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r0 = (androidx.recyclerview.widget.RecyclerView.RecycledViewPool.ScrapData) r0
                int r0 = r0.mMaxScrap
                int r2 = r1.size()
                if (r0 > r2) goto L1b
                return
            L1b:
                r4.resetInternal()
                r1.add(r4)
                return
        }

        public void setMaxRecycledViews(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r2 = r1.getScrapDataForType(r2)
                r2.mMaxScrap = r3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r2.mScrapHeap
            L8:
                int r0 = r2.size()
                if (r0 <= r3) goto L18
                int r0 = r2.size()
                int r0 = r0 + (-1)
                r2.remove(r0)
                goto L8
            L18:
                return
        }

        public final boolean willBindInTime(int r5, long r6, long r8) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r5 = r4.getScrapDataForType(r5)
                long r0 = r5.mBindRunningAverageNs
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L14
                long r6 = r6 + r0
                int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r5 >= 0) goto L12
                goto L14
            L12:
                r5 = 0
                goto L15
            L14:
                r5 = 1
            L15:
                return r5
        }

        public final boolean willCreateInTime(int r5, long r6, long r8) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool$ScrapData r5 = r4.getScrapDataForType(r5)
                long r0 = r5.mCreateRunningAverageNs
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L14
                long r6 = r6 + r0
                int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r5 >= 0) goto L12
                goto L14
            L12:
                r5 = 0
                goto L15
            L14:
                r5 = 1
            L15:
                return r5
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public final class Recycler {
        public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mAttachedScrap;
        public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mCachedViews;
        public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mChangedScrap;
        public androidx.recyclerview.widget.RecyclerView.RecycledViewPool mRecyclerPool;
        private int mRequestedCacheMax;
        private final java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> mUnmodifiableAttachedScrap;
        private androidx.recyclerview.widget.RecyclerView.ViewCacheExtension mViewCacheExtension;
        public int mViewCacheMax;
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView this$0;

        public Recycler(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.mAttachedScrap = r2
                r0 = 0
                r1.mChangedScrap = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCachedViews = r0
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.mUnmodifiableAttachedScrap = r2
                r2 = 2
                r1.mRequestedCacheMax = r2
                r1.mViewCacheMax = r2
                return
        }

        private void attachAccessibilityDelegateOnBind(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                boolean r0 = r0.isAccessibilityEnabled()
                if (r0 == 0) goto L2c
                android.view.View r3 = r3.itemView
                int r0 = androidx.core.view.ViewCompat.getImportantForAccessibility(r3)
                if (r0 != 0) goto L14
                r0 = 1
                androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r0)
            L14:
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r0 = r0.mAccessibilityDelegate
                if (r0 != 0) goto L1b
                return
            L1b:
                androidx.core.view.AccessibilityDelegateCompat r0 = r0.getItemDelegate()
                boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate
                if (r1 == 0) goto L29
                r1 = r0
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate$ItemDelegate r1 = (androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate) r1
                r1.saveOriginalDelegate(r3)
            L29:
                androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r0)
            L2c:
                return
        }

        private void invalidateDisplayListInt(android.view.ViewGroup r5, boolean r6) {
                r4 = this;
                int r0 = r5.getChildCount()
                r1 = 1
                int r0 = r0 - r1
            L6:
                if (r0 < 0) goto L18
                android.view.View r2 = r5.getChildAt(r0)
                boolean r3 = r2 instanceof android.view.ViewGroup
                if (r3 == 0) goto L15
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r4.invalidateDisplayListInt(r2, r1)
            L15:
                int r0 = r0 + (-1)
                goto L6
            L18:
                if (r6 != 0) goto L1b
                return
            L1b:
                int r6 = r5.getVisibility()
                r0 = 4
                if (r6 != r0) goto L2a
                r6 = 0
                r5.setVisibility(r6)
                r5.setVisibility(r0)
                goto L34
            L2a:
                int r6 = r5.getVisibility()
                r5.setVisibility(r0)
                r5.setVisibility(r6)
            L34:
                return
        }

        private void invalidateDisplayListInt(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r1 = this;
                android.view.View r2 = r2.itemView
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto Lc
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
                r1.invalidateDisplayListInt(r2, r0)
            Lc:
                return
        }

        private boolean tryBindViewHolderByDeadline(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r10, int r11, int r12, long r13) {
                r9 = this;
                r0 = 0
                r10.mBindingAdapter = r0
                androidx.recyclerview.widget.RecyclerView r0 = r9.this$0
                r10.mOwnerRecyclerView = r0
                int r2 = r10.getItemViewType()
                androidx.recyclerview.widget.RecyclerView r0 = r9.this$0
                long r7 = r0.getNanoTime()
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r3 == 0) goto L26
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r1 = r9.mRecyclerPool
                r3 = r7
                r5 = r13
                boolean r13 = r1.willBindInTime(r2, r3, r5)
                if (r13 != 0) goto L26
                r10 = 0
                return r10
            L26:
                androidx.recyclerview.widget.RecyclerView r13 = r9.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r13 = r13.mAdapter
                r13.bindViewHolder(r10, r11)
                androidx.recyclerview.widget.RecyclerView r11 = r9.this$0
                long r13 = r11.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r11 = r9.mRecyclerPool
                int r0 = r10.getItemViewType()
                long r13 = r13 - r7
                r11.factorInBindTime(r0, r13)
                r9.attachAccessibilityDelegateOnBind(r10)
                androidx.recyclerview.widget.RecyclerView r11 = r9.this$0
                androidx.recyclerview.widget.RecyclerView$State r11 = r11.mState
                boolean r11 = r11.isPreLayout()
                if (r11 == 0) goto L4c
                r10.mPreLayoutPosition = r12
            L4c:
                r10 = 1
                return r10
        }

        public final void addViewHolderToRecycledViewPool(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r5, boolean r6) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView.clearNestedRecyclerViewIfNotNested(r5)
                android.view.View r0 = r5.itemView
                androidx.recyclerview.widget.RecyclerView r1 = r4.this$0
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r1 = r1.mAccessibilityDelegate
                r2 = 0
                if (r1 == 0) goto L1f
                androidx.core.view.AccessibilityDelegateCompat r1 = r1.getItemDelegate()
                boolean r3 = r1 instanceof androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate
                if (r3 == 0) goto L1b
                androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate$ItemDelegate r1 = (androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate) r1
                androidx.core.view.AccessibilityDelegateCompat r1 = r1.getAndRemoveOriginalDelegateForItem(r0)
                goto L1c
            L1b:
                r1 = r2
            L1c:
                androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            L1f:
                if (r6 == 0) goto L59
                androidx.recyclerview.widget.RecyclerView r6 = r4.this$0
                androidx.recyclerview.widget.RecyclerView$RecyclerListener r6 = r6.mRecyclerListener
                if (r6 == 0) goto L2a
                r6.onViewRecycled(r5)
            L2a:
                androidx.recyclerview.widget.RecyclerView r6 = r4.this$0
                java.util.List<androidx.recyclerview.widget.RecyclerView$RecyclerListener> r6 = r6.mRecyclerListeners
                int r6 = r6.size()
                r0 = 0
            L33:
                if (r0 >= r6) goto L45
                androidx.recyclerview.widget.RecyclerView r1 = r4.this$0
                java.util.List<androidx.recyclerview.widget.RecyclerView$RecyclerListener> r1 = r1.mRecyclerListeners
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$RecyclerListener r1 = (androidx.recyclerview.widget.RecyclerView.RecyclerListener) r1
                r1.onViewRecycled(r5)
                int r0 = r0 + 1
                goto L33
            L45:
                androidx.recyclerview.widget.RecyclerView r6 = r4.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r6 = r6.mAdapter
                if (r6 == 0) goto L4e
                r6.onViewRecycled(r5)
            L4e:
                androidx.recyclerview.widget.RecyclerView r6 = r4.this$0
                androidx.recyclerview.widget.RecyclerView$State r0 = r6.mState
                if (r0 == 0) goto L59
                androidx.recyclerview.widget.ViewInfoStore r6 = r6.mViewInfoStore
                r6.removeViewHolder(r5)
            L59:
                r5.mBindingAdapter = r2
                r5.mOwnerRecyclerView = r2
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r6 = r4.getRecycledViewPool()
                r6.putRecycledView(r5)
                return
        }

        public void bindViewToPosition(@androidx.annotation.NonNull android.view.View r8, int r9) {
                r7 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r8 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r8)
                if (r8 == 0) goto L86
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                r6 = 0
                int r2 = r0.findPositionOffset(r9, r6)
                if (r2 < 0) goto L65
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                int r0 = r0.getItemCount()
                if (r2 >= r0) goto L65
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0 = r7
                r1 = r8
                r3 = r9
                r0.tryBindViewHolderByDeadline(r1, r2, r3, r4)
                android.view.View r9 = r8.itemView
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                if (r9 != 0) goto L3c
                androidx.recyclerview.widget.RecyclerView r9 = r7.this$0
                android.view.ViewGroup$LayoutParams r9 = r9.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r9 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r9
                android.view.View r0 = r8.itemView
                r0.setLayoutParams(r9)
                goto L54
            L3c:
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                boolean r0 = r0.checkLayoutParams(r9)
                if (r0 != 0) goto L52
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                android.view.ViewGroup$LayoutParams r9 = r0.generateLayoutParams(r9)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r9 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r9
                android.view.View r0 = r8.itemView
                r0.setLayoutParams(r9)
                goto L54
            L52:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r9 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r9
            L54:
                r0 = 1
                r9.mInsetsDirty = r0
                r9.mViewHolder = r8
                android.view.View r8 = r8.itemView
                android.view.ViewParent r8 = r8.getParent()
                if (r8 != 0) goto L62
                r6 = 1
            L62:
                r9.mPendingInvalidate = r6
                return
            L65:
                java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
                java.lang.String r0 = "Inconsistency detected. Invalid item position "
                java.lang.String r1 = "(offset:"
                java.lang.String r3 = ").state:"
                java.lang.StringBuilder r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r9, r1, r2, r3)
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                int r0 = r0.getItemCount()
                r9.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r9)
                r8.<init>(r9)
                throw r8
            L86:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
                java.lang.StringBuilder r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9)
                androidx.recyclerview.widget.RecyclerView r0 = r7.this$0
                java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r9)
                r8.<init>(r9)
                throw r8
        }

        public void clear() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mAttachedScrap
                r0.clear()
                r1.recycleAndClearCachedViews()
                return
        }

        public int convertPreLayoutPositionToPostLayout(int r4) {
                r3 = this;
                if (r4 < 0) goto L21
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                int r0 = r0.getItemCount()
                if (r4 >= r0) goto L21
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                boolean r0 = r0.isPreLayout()
                if (r0 != 0) goto L17
                return r4
            L17:
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                r1 = 0
                int r4 = r0.findPositionOffset(r4, r1)
                return r4
            L21:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "invalid position "
                java.lang.String r2 = ". State item count is "
                java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r1, r4, r2)
                androidx.recyclerview.widget.RecyclerView r1 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$State r1 = r1.mState
                int r1 = r1.getItemCount()
                r4.append(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r3.this$0
                java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4)
                r0.<init>(r4)
                throw r0
        }

        public final androidx.recyclerview.widget.RecyclerView.RecycledViewPool getRecycledViewPool() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r1.mRecyclerPool
                if (r0 != 0) goto Lb
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = new androidx.recyclerview.widget.RecyclerView$RecycledViewPool
                r0.<init>()
                r1.mRecyclerPool = r0
            Lb:
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r1.mRecyclerPool
                return r0
        }

        @androidx.annotation.NonNull
        public java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> getScrapList() {
                r1 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mUnmodifiableAttachedScrap
                return r0
        }

        @androidx.annotation.NonNull
        public android.view.View getViewForPosition(int r3) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r2.tryGetViewHolderForPositionByDeadline(r3, r0)
                android.view.View r3 = r3.itemView
                return r3
        }

        public final void recycleAndClearCachedViews() {
                r3 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r3.mCachedViews
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L10
                r3.recycleCachedViewAt(r0)
                int r0 = r0 + (-1)
                goto L8
            L10:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r3.mCachedViews
                r0.clear()
                boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r0 == 0) goto L28
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r0 = r0.mPrefetchRegistry
                int[] r1 = r0.mPrefetchArray
                if (r1 == 0) goto L25
                r2 = -1
                java.util.Arrays.fill(r1, r2)
            L25:
                r1 = 0
                r0.mCount = r1
            L28:
                return
        }

        public final void recycleCachedViewAt(int r3) {
                r2 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.mCachedViews
                java.lang.Object r0 = r0.get(r3)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r0
                r1 = 1
                r2.addViewHolderToRecycledViewPool(r0, r1)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.mCachedViews
                r0.remove(r3)
                return
        }

        public void recycleView(@androidx.annotation.NonNull android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r4)
                boolean r1 = r0.isTmpDetached()
                if (r1 == 0) goto L10
                androidx.recyclerview.widget.RecyclerView r1 = r3.this$0
                r2 = 0
                r1.removeDetachedView(r4, r2)
            L10:
                boolean r4 = r0.isScrap()
                if (r4 == 0) goto L1a
                r0.unScrap()
                goto L23
            L1a:
                boolean r4 = r0.wasReturnedFromScrap()
                if (r4 == 0) goto L23
                r0.clearReturnedFromScrapFlag()
            L23:
                r3.recycleViewHolderInternal(r0)
                androidx.recyclerview.widget.RecyclerView r4 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r4 = r4.mItemAnimator
                if (r4 == 0) goto L39
                boolean r4 = r0.isRecyclable()
                if (r4 != 0) goto L39
                androidx.recyclerview.widget.RecyclerView r4 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r4 = r4.mItemAnimator
                r4.endAnimation(r0)
            L39:
                return
        }

        public final void recycleViewHolderInternal(androidx.recyclerview.widget.RecyclerView.ViewHolder r6) {
                r5 = this;
                boolean r0 = r6.isScrap()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto Le3
                android.view.View r0 = r6.itemView
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L12
                goto Le3
            L12:
                boolean r0 = r6.isTmpDetached()
                if (r0 != 0) goto Lca
                boolean r0 = r6.shouldIgnore()
                if (r0 != 0) goto Lb8
                int r0 = r6.mFlags
                r0 = r0 & 16
                if (r0 != 0) goto L2e
                android.view.View r0 = r6.itemView
                boolean r0 = androidx.core.view.ViewCompat.hasTransientState(r0)
                if (r0 == 0) goto L2e
                r0 = 1
                goto L2f
            L2e:
                r0 = 0
            L2f:
                androidx.recyclerview.widget.RecyclerView r3 = r5.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r3 = r3.mAdapter
                if (r3 == 0) goto L3f
                if (r0 == 0) goto L3f
                boolean r3 = r3.onFailedToRecycleView(r6)
                if (r3 == 0) goto L3f
                r3 = 1
                goto L40
            L3f:
                r3 = 0
            L40:
                if (r3 != 0) goto L4b
                boolean r3 = r6.isRecyclable()
                if (r3 == 0) goto L49
                goto L4b
            L49:
                r1 = 0
                goto La2
            L4b:
                int r3 = r5.mViewCacheMax
                if (r3 <= 0) goto L9a
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r6.hasAnyOfTheFlags(r3)
                if (r3 != 0) goto L9a
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r5.mCachedViews
                int r3 = r3.size()
                int r4 = r5.mViewCacheMax
                if (r3 < r4) goto L68
                if (r3 <= 0) goto L68
                r5.recycleCachedViewAt(r2)
                int r3 = r3 + (-1)
            L68:
                boolean r2 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r2 == 0) goto L93
                if (r3 <= 0) goto L93
                androidx.recyclerview.widget.RecyclerView r2 = r5.this$0
                androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r2 = r2.mPrefetchRegistry
                int r4 = r6.mPosition
                boolean r2 = r2.lastPrefetchIncludedPosition(r4)
                if (r2 != 0) goto L93
            L7a:
                int r3 = r3 + (-1)
                if (r3 < 0) goto L92
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r5.mCachedViews
                java.lang.Object r2 = r2.get(r3)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
                int r2 = r2.mPosition
                androidx.recyclerview.widget.RecyclerView r4 = r5.this$0
                androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r4 = r4.mPrefetchRegistry
                boolean r2 = r4.lastPrefetchIncludedPosition(r2)
                if (r2 != 0) goto L7a
            L92:
                int r3 = r3 + r1
            L93:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r5.mCachedViews
                r2.add(r3, r6)
                r2 = 1
                goto L9b
            L9a:
                r2 = 0
            L9b:
                if (r2 != 0) goto La1
                r5.addViewHolderToRecycledViewPool(r6, r1)
                goto La5
            La1:
                r1 = r2
            La2:
                r2 = 0
                r2 = r1
                r1 = 0
            La5:
                androidx.recyclerview.widget.RecyclerView r3 = r5.this$0
                androidx.recyclerview.widget.ViewInfoStore r3 = r3.mViewInfoStore
                r3.removeViewHolder(r6)
                if (r2 != 0) goto Lb7
                if (r1 != 0) goto Lb7
                if (r0 == 0) goto Lb7
                r0 = 0
                r6.mBindingAdapter = r0
                r6.mOwnerRecyclerView = r0
            Lb7:
                return
            Lb8:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                androidx.recyclerview.widget.RecyclerView r1 = r5.this$0
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
                r6.<init>(r0)
                throw r6
            Lca:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r6)
                androidx.recyclerview.widget.RecyclerView r6 = r5.this$0
                java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r1)
                r0.<init>(r6)
                throw r0
            Le3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Scrapped or attached views may not be recycled. isScrap:"
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                boolean r3 = r6.isScrap()
                r2.append(r3)
                java.lang.String r3 = " isAttached:"
                r2.append(r3)
                android.view.View r6 = r6.itemView
                android.view.ViewParent r6 = r6.getParent()
                if (r6 == 0) goto L100
                goto L101
            L100:
                r1 = 0
            L101:
                r2.append(r1)
                androidx.recyclerview.widget.RecyclerView r6 = r5.this$0
                java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r2)
                r0.<init>(r6)
                throw r0
        }

        public final void scrapView(android.view.View r5) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r5)
                r0 = 12
                boolean r0 = r5.hasAnyOfTheFlags(r0)
                r1 = 0
                if (r0 != 0) goto L40
                boolean r0 = r5.isUpdated()
                if (r0 == 0) goto L40
                androidx.recyclerview.widget.RecyclerView r0 = r4.this$0
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r0.mItemAnimator
                r2 = 1
                if (r0 == 0) goto L27
                java.util.List r3 = r5.getUnmodifiedPayloads()
                boolean r0 = r0.canReuseUpdatedViewHolder(r5, r3)
                if (r0 == 0) goto L25
                goto L27
            L25:
                r0 = 0
                goto L28
            L27:
                r0 = 1
            L28:
                if (r0 == 0) goto L2b
                goto L40
            L2b:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r4.mChangedScrap
                if (r0 != 0) goto L36
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.mChangedScrap = r0
            L36:
                r5.mScrapContainer = r4
                r5.mInChangeScrap = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r4.mChangedScrap
                r0.add(r5)
                goto L72
            L40:
                boolean r0 = r5.isInvalid()
                if (r0 == 0) goto L69
                boolean r0 = r5.isRemoved()
                if (r0 != 0) goto L69
                androidx.recyclerview.widget.RecyclerView r0 = r4.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto L57
                goto L69
            L57:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                androidx.recyclerview.widget.RecyclerView r1 = r4.this$0
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
                r5.<init>(r0)
                throw r5
            L69:
                r5.mScrapContainer = r4
                r5.mInChangeScrap = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r4.mAttachedScrap
                r0.add(r5)
            L72:
                return
        }

        public final void setViewCacheExtension(androidx.recyclerview.widget.RecyclerView.ViewCacheExtension r1) {
                r0 = this;
                r0.mViewCacheExtension = r1
                return
        }

        public void setViewCacheSize(int r1) {
                r0 = this;
                r0.mRequestedCacheMax = r1
                r0.updateViewCacheSize()
                return
        }

        @androidx.annotation.Nullable
        public final androidx.recyclerview.widget.RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline(int r17, long r18) {
                r16 = this;
                r6 = r16
                r3 = r17
                if (r3 < 0) goto L43a
                androidx.recyclerview.widget.RecyclerView r0 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                int r0 = r0.getItemCount()
                if (r3 >= r0) goto L43a
                androidx.recyclerview.widget.RecyclerView r0 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                boolean r0 = r0.isPreLayout()
                r1 = 32
                r2 = 0
                r7 = 0
                if (r0 == 0) goto L93
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r6.mChangedScrap
                if (r0 == 0) goto L8e
                int r0 = r0.size()
                if (r0 != 0) goto L29
                goto L8e
            L29:
                r4 = 0
            L2a:
                if (r4 >= r0) goto L47
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r5 = r6.mChangedScrap
                java.lang.Object r5 = r5.get(r4)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r5
                boolean r8 = r5.wasReturnedFromScrap()
                if (r8 != 0) goto L44
                int r8 = r5.getLayoutPosition()
                if (r8 != r3) goto L44
                r5.addFlags(r1)
                goto L8f
            L44:
                int r4 = r4 + 1
                goto L2a
            L47:
                androidx.recyclerview.widget.RecyclerView r4 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r4 = r4.mAdapter
                boolean r4 = r4.hasStableIds()
                if (r4 == 0) goto L8e
                androidx.recyclerview.widget.RecyclerView r4 = r6.this$0
                androidx.recyclerview.widget.AdapterHelper r4 = r4.mAdapterHelper
                int r4 = r4.findPositionOffset(r3, r7)
                if (r4 <= 0) goto L8e
                androidx.recyclerview.widget.RecyclerView r5 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.mAdapter
                int r5 = r5.getItemCount()
                if (r4 >= r5) goto L8e
                androidx.recyclerview.widget.RecyclerView r5 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.mAdapter
                long r4 = r5.getItemId(r4)
                r8 = 0
            L6e:
                if (r8 >= r0) goto L8e
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r9 = r6.mChangedScrap
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r9
                boolean r10 = r9.wasReturnedFromScrap()
                if (r10 != 0) goto L8b
                long r10 = r9.getItemId()
                int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r12 != 0) goto L8b
                r9.addFlags(r1)
                r5 = r9
                goto L8f
            L8b:
                int r8 = r8 + 1
                goto L6e
            L8e:
                r5 = r2
            L8f:
                if (r5 == 0) goto L94
                r0 = 1
                goto L95
            L93:
                r5 = r2
            L94:
                r0 = 0
            L95:
                r4 = -1
                if (r5 != 0) goto L20b
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r5 = r6.mAttachedScrap
                int r5 = r5.size()
                r8 = 0
            L9f:
                if (r8 >= r5) goto Ld1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r9 = r6.mAttachedScrap
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r9
                boolean r10 = r9.wasReturnedFromScrap()
                if (r10 != 0) goto Lce
                int r10 = r9.getLayoutPosition()
                if (r10 != r3) goto Lce
                boolean r10 = r9.isInvalid()
                if (r10 != 0) goto Lce
                androidx.recyclerview.widget.RecyclerView r10 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$State r10 = r10.mState
                boolean r10 = r10.mInPreLayout
                if (r10 != 0) goto Lc9
                boolean r10 = r9.isRemoved()
                if (r10 != 0) goto Lce
            Lc9:
                r9.addFlags(r1)
                goto L16b
            Lce:
                int r8 = r8 + 1
                goto L9f
            Ld1:
                androidx.recyclerview.widget.RecyclerView r5 = r6.this$0
                androidx.recyclerview.widget.ChildHelper r5 = r5.mChildHelper
                java.util.List<android.view.View> r8 = r5.mHiddenViews
                int r8 = r8.size()
                r9 = 0
            Ldc:
                if (r9 >= r8) goto L102
                java.util.List<android.view.View> r10 = r5.mHiddenViews
                java.lang.Object r10 = r10.get(r9)
                android.view.View r10 = (android.view.View) r10
                androidx.recyclerview.widget.ChildHelper$Callback r11 = r5.mCallback
                androidx.recyclerview.widget.RecyclerView$ViewHolder r11 = r11.getChildViewHolder(r10)
                int r12 = r11.getLayoutPosition()
                if (r12 != r3) goto Lff
                boolean r12 = r11.isInvalid()
                if (r12 != 0) goto Lff
                boolean r11 = r11.isRemoved()
                if (r11 != 0) goto Lff
                goto L103
            Lff:
                int r9 = r9 + 1
                goto Ldc
            L102:
                r10 = r2
            L103:
                if (r10 == 0) goto L143
                androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r10)
                androidx.recyclerview.widget.RecyclerView r8 = r6.this$0
                androidx.recyclerview.widget.ChildHelper r8 = r8.mChildHelper
                r8.unhide(r10)
                androidx.recyclerview.widget.RecyclerView r8 = r6.this$0
                androidx.recyclerview.widget.ChildHelper r8 = r8.mChildHelper
                int r8 = r8.indexOfChild(r10)
                if (r8 == r4) goto L12a
                androidx.recyclerview.widget.RecyclerView r9 = r6.this$0
                androidx.recyclerview.widget.ChildHelper r9 = r9.mChildHelper
                r9.detachViewFromParent(r8)
                r6.scrapView(r10)
                r8 = 8224(0x2020, float:1.1524E-41)
                r5.addFlags(r8)
                goto L171
            L12a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "layout index should not be -1 after unhiding a view:"
                r1.append(r2)
                r1.append(r5)
                androidx.recyclerview.widget.RecyclerView r2 = r6.this$0
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
                r0.<init>(r1)
                throw r0
            L143:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r5 = r6.mCachedViews
                int r5 = r5.size()
                r8 = 0
            L14a:
                if (r8 >= r5) goto L170
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r9 = r6.mCachedViews
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r9
                boolean r10 = r9.isInvalid()
                if (r10 != 0) goto L16d
                int r10 = r9.getLayoutPosition()
                if (r10 != r3) goto L16d
                boolean r10 = r9.isAttachedToTransitionOverlay()
                if (r10 != 0) goto L16d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r5 = r6.mCachedViews
                r5.remove(r8)
            L16b:
                r5 = r9
                goto L171
            L16d:
                int r8 = r8 + 1
                goto L14a
            L170:
                r5 = r2
            L171:
                if (r5 == 0) goto L20b
                boolean r8 = r5.isRemoved()
                if (r8 == 0) goto L182
                androidx.recyclerview.widget.RecyclerView r8 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$State r8 = r8.mState
                boolean r8 = r8.isPreLayout()
                goto L1cb
            L182:
                int r8 = r5.mPosition
                if (r8 < 0) goto L1f2
                androidx.recyclerview.widget.RecyclerView r9 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.mAdapter
                int r9 = r9.getItemCount()
                if (r8 >= r9) goto L1f2
                androidx.recyclerview.widget.RecyclerView r8 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$State r8 = r8.mState
                boolean r8 = r8.isPreLayout()
                if (r8 != 0) goto L1ab
                androidx.recyclerview.widget.RecyclerView r8 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r8 = r8.mAdapter
                int r9 = r5.mPosition
                int r8 = r8.getItemViewType(r9)
                int r9 = r5.getItemViewType()
                if (r8 == r9) goto L1ab
                goto L1c8
            L1ab:
                androidx.recyclerview.widget.RecyclerView r8 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r8 = r8.mAdapter
                boolean r8 = r8.hasStableIds()
                if (r8 == 0) goto L1ca
                long r8 = r5.getItemId()
                androidx.recyclerview.widget.RecyclerView r10 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.mAdapter
                int r11 = r5.mPosition
                long r10 = r10.getItemId(r11)
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 != 0) goto L1c8
                goto L1ca
            L1c8:
                r8 = 0
                goto L1cb
            L1ca:
                r8 = 1
            L1cb:
                if (r8 != 0) goto L1f0
                r8 = 4
                r5.addFlags(r8)
                boolean r8 = r5.isScrap()
                if (r8 == 0) goto L1e2
                androidx.recyclerview.widget.RecyclerView r8 = r6.this$0
                android.view.View r9 = r5.itemView
                r8.removeDetachedView(r9, r7)
                r5.unScrap()
                goto L1eb
            L1e2:
                boolean r8 = r5.wasReturnedFromScrap()
                if (r8 == 0) goto L1eb
                r5.clearReturnedFromScrapFlag()
            L1eb:
                r6.recycleViewHolderInternal(r5)
                r5 = r2
                goto L20b
            L1f0:
                r0 = 1
                goto L20b
            L1f2:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid view holder adapter position"
                r1.append(r2)
                r1.append(r5)
                androidx.recyclerview.widget.RecyclerView r2 = r6.this$0
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
                r0.<init>(r1)
                throw r0
            L20b:
                if (r5 != 0) goto L38d
                androidx.recyclerview.widget.RecyclerView r8 = r6.this$0
                androidx.recyclerview.widget.AdapterHelper r8 = r8.mAdapterHelper
                int r8 = r8.findPositionOffset(r3, r7)
                if (r8 < 0) goto L36c
                androidx.recyclerview.widget.RecyclerView r9 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.mAdapter
                int r9 = r9.getItemCount()
                if (r8 >= r9) goto L36c
                androidx.recyclerview.widget.RecyclerView r9 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.mAdapter
                int r9 = r9.getItemViewType(r8)
                androidx.recyclerview.widget.RecyclerView r10 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.mAdapter
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L2d3
                androidx.recyclerview.widget.RecyclerView r5 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.mAdapter
                long r10 = r5.getItemId(r8)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r5 = r6.mAttachedScrap
                int r5 = r5.size()
                int r5 = r5 + r4
            L242:
                if (r5 < 0) goto L29a
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r12 = r6.mAttachedScrap
                java.lang.Object r12 = r12.get(r5)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r12 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r12
                long r13 = r12.getItemId()
                int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
                if (r15 != 0) goto L297
                boolean r13 = r12.wasReturnedFromScrap()
                if (r13 != 0) goto L297
                int r13 = r12.getItemViewType()
                if (r9 != r13) goto L27b
                r12.addFlags(r1)
                boolean r1 = r12.isRemoved()
                if (r1 == 0) goto L279
                androidx.recyclerview.widget.RecyclerView r1 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$State r1 = r1.mState
                boolean r1 = r1.isPreLayout()
                if (r1 != 0) goto L279
                r1 = 2
                r4 = 14
                r12.setFlags(r1, r4)
            L279:
                r5 = r12
                goto L2ce
            L27b:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r13 = r6.mAttachedScrap
                r13.remove(r5)
                androidx.recyclerview.widget.RecyclerView r13 = r6.this$0
                android.view.View r14 = r12.itemView
                r13.removeDetachedView(r14, r7)
                android.view.View r12 = r12.itemView
                androidx.recyclerview.widget.RecyclerView$ViewHolder r12 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r12)
                r12.mScrapContainer = r2
                r12.mInChangeScrap = r7
                r12.clearReturnedFromScrapFlag()
                r6.recycleViewHolderInternal(r12)
            L297:
                int r5 = r5 + (-1)
                goto L242
            L29a:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r6.mCachedViews
                int r1 = r1.size()
                int r1 = r1 + r4
            L2a1:
                if (r1 < 0) goto L2cd
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r4 = r6.mCachedViews
                java.lang.Object r4 = r4.get(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r4
                long r12 = r4.getItemId()
                int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r5 != 0) goto L2ca
                boolean r5 = r4.isAttachedToTransitionOverlay()
                if (r5 != 0) goto L2ca
                int r5 = r4.getItemViewType()
                if (r9 != r5) goto L2c6
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r5 = r6.mCachedViews
                r5.remove(r1)
                r5 = r4
                goto L2ce
            L2c6:
                r6.recycleCachedViewAt(r1)
                goto L2cd
            L2ca:
                int r1 = r1 + (-1)
                goto L2a1
            L2cd:
                r5 = r2
            L2ce:
                if (r5 == 0) goto L2d3
                r5.mPosition = r8
                r0 = 1
            L2d3:
                if (r5 != 0) goto L312
                androidx.recyclerview.widget.RecyclerView$ViewCacheExtension r1 = r6.mViewCacheExtension
                if (r1 == 0) goto L312
                android.view.View r1 = r1.getViewForPositionAndType(r6, r3, r9)
                if (r1 == 0) goto L312
                androidx.recyclerview.widget.RecyclerView r4 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = r4.getChildViewHolder(r1)
                if (r5 == 0) goto L300
                boolean r1 = r5.shouldIgnore()
                if (r1 != 0) goto L2ee
                goto L312
            L2ee:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                androidx.recyclerview.widget.RecyclerView r2 = r6.this$0
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
                r0.<init>(r1)
                throw r0
            L300:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                androidx.recyclerview.widget.RecyclerView r2 = r6.this$0
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
                r0.<init>(r1)
                throw r0
            L312:
                if (r5 != 0) goto L324
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r1 = r16.getRecycledViewPool()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r1.getRecycledView(r9)
                if (r1 == 0) goto L323
                r1.resetInternal()
                boolean r4 = androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC
            L323:
                r5 = r1
            L324:
                if (r5 != 0) goto L38d
                androidx.recyclerview.widget.RecyclerView r1 = r6.this$0
                long r4 = r1.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r1 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
                if (r1 == 0) goto L342
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r10 = r6.mRecyclerPool
                r11 = r9
                r12 = r4
                r14 = r18
                boolean r1 = r10.willCreateInTime(r11, r12, r14)
                if (r1 != 0) goto L342
                return r2
            L342:
                androidx.recyclerview.widget.RecyclerView r1 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r2 = r1.mAdapter
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r2.createViewHolder(r1, r9)
                boolean r2 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r2 == 0) goto L35d
                android.view.View r2 = r1.itemView
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r2)
                if (r2 == 0) goto L35d
                java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
                r8.<init>(r2)
                r1.mNestedRecyclerView = r8
            L35d:
                androidx.recyclerview.widget.RecyclerView r2 = r6.this$0
                long r10 = r2.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$RecycledViewPool r2 = r6.mRecyclerPool
                long r10 = r10 - r4
                r2.factorInCreateTime(r9, r10)
                r8 = r0
                r9 = r1
                goto L38f
            L36c:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "Inconsistency detected. Invalid item position "
                java.lang.String r2 = "(offset:"
                java.lang.String r4 = ").state:"
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2, r8, r4)
                androidx.recyclerview.widget.RecyclerView r2 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$State r2 = r2.mState
                int r2 = r2.getItemCount()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = r6.this$0
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
                r0.<init>(r1)
                throw r0
            L38d:
                r8 = r0
                r9 = r5
            L38f:
                if (r8 == 0) goto L3c7
                androidx.recyclerview.widget.RecyclerView r0 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                boolean r0 = r0.isPreLayout()
                if (r0 != 0) goto L3c7
                r0 = 8192(0x2000, float:1.148E-41)
                boolean r1 = r9.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L3c7
                r9.setFlags(r7, r0)
                androidx.recyclerview.widget.RecyclerView r0 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                boolean r0 = r0.mRunSimpleAnimations
                if (r0 == 0) goto L3c7
                int r0 = androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r2 = r1.mItemAnimator
                androidx.recyclerview.widget.RecyclerView$State r1 = r1.mState
                java.util.List r4 = r9.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r0 = r2.recordPreLayoutInformation(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = r6.this$0
                r1.recordAnimationInfoIfBouncedHiddenView(r9, r0)
            L3c7:
                androidx.recyclerview.widget.RecyclerView r0 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                boolean r0 = r0.isPreLayout()
                if (r0 == 0) goto L3da
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L3da
                r9.mPreLayoutPosition = r3
                goto L3ed
            L3da:
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L3ef
                boolean r0 = r9.needsUpdate()
                if (r0 != 0) goto L3ef
                boolean r0 = r9.isInvalid()
                if (r0 == 0) goto L3ed
                goto L3ef
            L3ed:
                r0 = 0
                goto L402
            L3ef:
                androidx.recyclerview.widget.RecyclerView r0 = r6.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                int r2 = r0.findPositionOffset(r3, r7)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r18
                boolean r0 = r0.tryBindViewHolderByDeadline(r1, r2, r3, r4)
            L402:
                android.view.View r1 = r9.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L418
                androidx.recyclerview.widget.RecyclerView r1 = r6.this$0
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L430
            L418:
                androidx.recyclerview.widget.RecyclerView r2 = r6.this$0
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L42e
                androidx.recyclerview.widget.RecyclerView r2 = r6.this$0
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams(r1)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L430
            L42e:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            L430:
                r1.mViewHolder = r9
                if (r8 == 0) goto L437
                if (r0 == 0) goto L437
                r7 = 1
            L437:
                r1.mPendingInvalidate = r7
                return r9
            L43a:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "Invalid item position "
                java.lang.String r2 = "("
                java.lang.String r4 = "). Item count:"
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2, r3, r4)
                androidx.recyclerview.widget.RecyclerView r2 = r6.this$0
                androidx.recyclerview.widget.RecyclerView$State r2 = r2.mState
                int r2 = r2.getItemCount()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = r6.this$0
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
                r0.<init>(r1)
                throw r0
        }

        public final void unscrapView(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r1 = this;
                boolean r0 = r2.mInChangeScrap
                if (r0 == 0) goto La
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mChangedScrap
                r0.remove(r2)
                goto Lf
            La:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mAttachedScrap
                r0.remove(r2)
            Lf:
                r0 = 0
                r2.mScrapContainer = r0
                r0 = 0
                r2.mInChangeScrap = r0
                r2.clearReturnedFromScrapFlag()
                return
        }

        public final void updateViewCacheSize() {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.mLayout
                if (r0 == 0) goto L9
                int r0 = r0.mPrefetchMaxCountObserved
                goto La
            L9:
                r0 = 0
            La:
                int r1 = r3.mRequestedCacheMax
                int r1 = r1 + r0
                r3.mViewCacheMax = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r3.mCachedViews
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L17:
                if (r0 < 0) goto L29
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r3.mCachedViews
                int r1 = r1.size()
                int r2 = r3.mViewCacheMax
                if (r1 <= r2) goto L29
                r3.recycleCachedViewAt(r0)
                int r0 = r0 + (-1)
                goto L17
            L29:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface RecyclerListener {
        void onViewRecycled(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class RecyclerViewDataObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView this$0;

        public RecyclerViewDataObserver(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$State r1 = r0.mState
                r2 = 1
                r1.mStructureChanged = r2
                r0.processDataSetCompletelyChanged(r2)
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                boolean r0 = r0.hasPendingUpdates()
                if (r0 != 0) goto L1f
                androidx.recyclerview.widget.RecyclerView r0 = r3.this$0
                r0.requestLayout()
            L1f:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int r3, int r4, java.lang.Object r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                boolean r3 = r0.onItemRangeChanged(r3, r4, r5)
                if (r3 == 0) goto L13
                r2.triggerUpdateProcessor()
            L13:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int r3, int r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                boolean r3 = r0.onItemRangeInserted(r3, r4)
                if (r3 == 0) goto L13
                r2.triggerUpdateProcessor()
            L13:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int r3, int r4, int r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                boolean r3 = r0.onItemRangeMoved(r3, r4, r5)
                if (r3 == 0) goto L13
                r2.triggerUpdateProcessor()
            L13:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int r3, int r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.AdapterHelper r0 = r0.mAdapterHelper
                boolean r3 = r0.onItemRangeRemoved(r3, r4)
                if (r3 == 0) goto L13
                r2.triggerUpdateProcessor()
            L13:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                androidx.recyclerview.widget.RecyclerView$SavedState r1 = r0.mPendingSavedState
                if (r1 != 0) goto L7
                return
            L7:
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
                if (r0 == 0) goto L16
                boolean r0 = r0.canRestoreState()
                if (r0 == 0) goto L16
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                r0.requestLayout()
            L16:
                return
        }

        public final void triggerUpdateProcessor() {
                r2 = this;
                boolean r0 = androidx.recyclerview.widget.RecyclerView.POST_UPDATES_ON_ANIMATION
                if (r0 == 0) goto L14
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                boolean r1 = r0.mHasFixedSize
                if (r1 == 0) goto L14
                boolean r1 = r0.mIsAttached
                if (r1 == 0) goto L14
                java.lang.Runnable r1 = r0.mUpdateChildViewsRunnable
                androidx.core.view.ViewCompat.postOnAnimation(r0, r1)
                goto L1c
            L14:
                androidx.recyclerview.widget.RecyclerView r0 = r2.this$0
                r1 = 1
                r0.mAdapterUpdateDuringMeasure = r1
                r0.requestLayout()
            L1c:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.RecyclerView.SavedState> CREATOR = null;
        public android.os.Parcelable mLayoutState;


        static {
                androidx.recyclerview.widget.RecyclerView$SavedState$1 r0 = new androidx.recyclerview.widget.RecyclerView$SavedState$1
                r0.<init>()
                androidx.recyclerview.widget.RecyclerView.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 == 0) goto L6
                goto Lc
            L6:
                java.lang.Class<androidx.recyclerview.widget.RecyclerView$LayoutManager> r2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
            Lc:
                android.os.Parcelable r1 = r1.readParcelable(r2)
                r0.mLayoutState = r1
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                android.os.Parcelable r3 = r1.mLayoutState
                r0 = 0
                r2.writeParcelable(r3, r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class SimpleOnItemTouchListener implements androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
        public SimpleOnItemTouchListener() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull android.view.MotionEvent r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean r1) {
                r0 = this;
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull android.view.MotionEvent r2) {
                r0 = this;
                return
        }
    }

    public static abstract class SmoothScroller {
        private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private androidx.recyclerview.widget.RecyclerView mRecyclerView;
        private final androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action mRecyclingAction;
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition;
        private android.view.View mTargetView;

        /* JADX INFO: loaded from: classes.dex */
        public static class Action {
            public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
            private boolean mChanged;
            private int mConsecutiveUpdates;
            private int mDuration;
            private int mDx;
            private int mDy;
            private android.view.animation.Interpolator mInterpolator;
            private int mJumpToPosition;

            public Action(@androidx.annotation.Px int r3, @androidx.annotation.Px int r4) {
                    r2 = this;
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = 0
                    r2.<init>(r3, r4, r0, r1)
                    return
            }

            public Action(@androidx.annotation.Px int r2, @androidx.annotation.Px int r3, int r4) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r4, r0)
                    return
            }

            public Action(@androidx.annotation.Px int r2, @androidx.annotation.Px int r3, int r4, @androidx.annotation.Nullable android.view.animation.Interpolator r5) {
                    r1 = this;
                    r1.<init>()
                    r0 = -1
                    r1.mJumpToPosition = r0
                    r0 = 0
                    r1.mChanged = r0
                    r1.mConsecutiveUpdates = r0
                    r1.mDx = r2
                    r1.mDy = r3
                    r1.mDuration = r4
                    r1.mInterpolator = r5
                    return
            }

            private void validate() {
                    r2 = this;
                    android.view.animation.Interpolator r0 = r2.mInterpolator
                    r1 = 1
                    if (r0 == 0) goto L12
                    int r0 = r2.mDuration
                    if (r0 < r1) goto La
                    goto L12
                La:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "If you provide an interpolator, you must set a positive duration"
                    r0.<init>(r1)
                    throw r0
                L12:
                    int r0 = r2.mDuration
                    if (r0 < r1) goto L17
                    return
                L17:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Scroll duration must be a positive number"
                    r0.<init>(r1)
                    throw r0
            }

            public int getDuration() {
                    r1 = this;
                    int r0 = r1.mDuration
                    return r0
            }

            @androidx.annotation.Px
            public int getDx() {
                    r1 = this;
                    int r0 = r1.mDx
                    return r0
            }

            @androidx.annotation.Px
            public int getDy() {
                    r1 = this;
                    int r0 = r1.mDy
                    return r0
            }

            @androidx.annotation.Nullable
            public android.view.animation.Interpolator getInterpolator() {
                    r1 = this;
                    android.view.animation.Interpolator r0 = r1.mInterpolator
                    return r0
            }

            public final boolean hasJumpTarget() {
                    r1 = this;
                    int r0 = r1.mJumpToPosition
                    if (r0 < 0) goto L6
                    r0 = 1
                    goto L7
                L6:
                    r0 = 0
                L7:
                    return r0
            }

            public void jumpTo(int r1) {
                    r0 = this;
                    r0.mJumpToPosition = r1
                    return
            }

            public final void runIfNecessary(androidx.recyclerview.widget.RecyclerView r6) {
                    r5 = this;
                    int r0 = r5.mJumpToPosition
                    r1 = 0
                    if (r0 < 0) goto Le
                    r2 = -1
                    r5.mJumpToPosition = r2
                    r6.jumpToPositionForSmoothScroller(r0)
                    r5.mChanged = r1
                    return
                Le:
                    boolean r0 = r5.mChanged
                    if (r0 == 0) goto L36
                    r5.validate()
                    androidx.recyclerview.widget.RecyclerView$ViewFlinger r6 = r6.mViewFlinger
                    int r0 = r5.mDx
                    int r2 = r5.mDy
                    int r3 = r5.mDuration
                    android.view.animation.Interpolator r4 = r5.mInterpolator
                    r6.smoothScrollBy(r0, r2, r3, r4)
                    int r6 = r5.mConsecutiveUpdates
                    int r6 = r6 + 1
                    r5.mConsecutiveUpdates = r6
                    r0 = 10
                    if (r6 <= r0) goto L33
                    java.lang.String r6 = "RecyclerView"
                    java.lang.String r0 = "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"
                    android.util.Log.e(r6, r0)
                L33:
                    r5.mChanged = r1
                    goto L38
                L36:
                    r5.mConsecutiveUpdates = r1
                L38:
                    return
            }

            public void setDuration(int r2) {
                    r1 = this;
                    r0 = 1
                    r1.mChanged = r0
                    r1.mDuration = r2
                    return
            }

            public void setDx(@androidx.annotation.Px int r2) {
                    r1 = this;
                    r0 = 1
                    r1.mChanged = r0
                    r1.mDx = r2
                    return
            }

            public void setDy(@androidx.annotation.Px int r2) {
                    r1 = this;
                    r0 = 1
                    r1.mChanged = r0
                    r1.mDy = r2
                    return
            }

            public void setInterpolator(@androidx.annotation.Nullable android.view.animation.Interpolator r2) {
                    r1 = this;
                    r0 = 1
                    r1.mChanged = r0
                    r1.mInterpolator = r2
                    return
            }

            public void update(@androidx.annotation.Px int r1, @androidx.annotation.Px int r2, int r3, @androidx.annotation.Nullable android.view.animation.Interpolator r4) {
                    r0 = this;
                    r0.mDx = r1
                    r0.mDy = r2
                    r0.mDuration = r3
                    r0.mInterpolator = r4
                    r1 = 1
                    r0.mChanged = r1
                    return
            }
        }

        /* JADX INFO: loaded from: classes.dex */
        public interface ScrollVectorProvider {
            @androidx.annotation.Nullable
            android.graphics.PointF computeScrollVectorForPosition(int r1);
        }

        public SmoothScroller() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.mTargetPosition = r0
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action r0 = new androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action
                r1 = 0
                r0.<init>(r1, r1)
                r2.mRecyclingAction = r0
                return
        }

        @androidx.annotation.Nullable
        public android.graphics.PointF computeScrollVectorForPosition(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.getLayoutManager()
                boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
                if (r1 == 0) goto Lf
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider r0 = (androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) r0
                android.graphics.PointF r3 = r0.computeScrollVectorForPosition(r3)
                return r3
            Lf:
                java.lang.String r3 = "You should override computeScrollVectorForPosition when the LayoutManager does not implement "
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                java.lang.Class<androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider> r0 = androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider.class
                java.lang.String r0 = r0.getCanonicalName()
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = "RecyclerView"
                android.util.Log.w(r0, r3)
                r3 = 0
                return r3
        }

        public android.view.View findViewByPosition(int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.mLayout
                android.view.View r2 = r0.findViewByPosition(r2)
                return r2
        }

        public int getChildCount() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.mLayout
                int r0 = r0.getChildCount()
                return r0
        }

        public int getChildPosition(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                int r2 = r0.getChildLayoutPosition(r2)
                return r2
        }

        @androidx.annotation.Nullable
        public androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayoutManager
                return r0
        }

        public int getTargetPosition() {
                r1 = this;
                int r0 = r1.mTargetPosition
                return r0
        }

        @java.lang.Deprecated
        public void instantScrollToPosition(int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                r0.scrollToPosition(r2)
                return
        }

        public boolean isPendingInitialRun() {
                r1 = this;
                boolean r0 = r1.mPendingInitialRun
                return r0
        }

        public boolean isRunning() {
                r1 = this;
                boolean r0 = r1.mRunning
                return r0
        }

        public final void onAnimation(int r7, int r8) {
                r6 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r6.mRecyclerView
                int r1 = r6.mTargetPosition
                r2 = -1
                if (r1 == r2) goto L9
                if (r0 != 0) goto Lc
            L9:
                r6.stop()
            Lc:
                boolean r1 = r6.mPendingInitialRun
                r2 = 0
                if (r1 == 0) goto L3d
                android.view.View r1 = r6.mTargetView
                if (r1 != 0) goto L3d
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r6.mLayoutManager
                if (r1 == 0) goto L3d
                int r1 = r6.mTargetPosition
                android.graphics.PointF r1 = r6.computeScrollVectorForPosition(r1)
                if (r1 == 0) goto L3d
                float r3 = r1.x
                r4 = 0
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 != 0) goto L2e
                float r5 = r1.y
                int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r4 == 0) goto L3d
            L2e:
                float r3 = java.lang.Math.signum(r3)
                int r3 = (int) r3
                float r1 = r1.y
                float r1 = java.lang.Math.signum(r1)
                int r1 = (int) r1
                r0.scrollStep(r3, r1, r2)
            L3d:
                r1 = 0
                r6.mPendingInitialRun = r1
                android.view.View r1 = r6.mTargetView
                if (r1 == 0) goto L67
                int r1 = r6.getChildPosition(r1)
                int r3 = r6.mTargetPosition
                if (r1 != r3) goto L5e
                android.view.View r1 = r6.mTargetView
                androidx.recyclerview.widget.RecyclerView$State r2 = r0.mState
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action r2 = r6.mRecyclingAction
                r6.onTargetFound(r1, r2)
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action r1 = r6.mRecyclingAction
                r1.runIfNecessary(r0)
                r6.stop()
                goto L67
            L5e:
                java.lang.String r1 = "RecyclerView"
                java.lang.String r3 = "Passed over target position while smooth scrolling."
                android.util.Log.e(r1, r3)
                r6.mTargetView = r2
            L67:
                boolean r1 = r6.mRunning
                if (r1 == 0) goto L8b
                androidx.recyclerview.widget.RecyclerView$State r1 = r0.mState
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action r1 = r6.mRecyclingAction
                r6.onSeekTargetStep(r7, r8, r1)
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action r7 = r6.mRecyclingAction
                boolean r7 = r7.hasJumpTarget()
                androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action r8 = r6.mRecyclingAction
                r8.runIfNecessary(r0)
                if (r7 == 0) goto L8b
                boolean r7 = r6.mRunning
                if (r7 == 0) goto L8b
                r7 = 1
                r6.mPendingInitialRun = r7
                androidx.recyclerview.widget.RecyclerView$ViewFlinger r7 = r0.mViewFlinger
                r7.postOnAnimation()
            L8b:
                return
        }

        public final void onChildAttachedToWindow(android.view.View r3) {
                r2 = this;
                int r0 = r2.getChildPosition(r3)
                int r1 = r2.getTargetPosition()
                if (r0 != r1) goto Lc
                r2.mTargetView = r3
            Lc:
                return
        }

        public abstract void onSeekTargetStep(@androidx.annotation.Px int r1, @androidx.annotation.Px int r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r3);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r2);

        public void setTargetPosition(int r1) {
                r0 = this;
                r0.mTargetPosition = r1
                return
        }

        public final void start(androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.LayoutManager r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ViewFlinger r0 = r3.mViewFlinger
                r0.stop()
                boolean r0 = r2.mStarted
                if (r0 == 0) goto L38
                java.lang.String r0 = "An instance of "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.Class r1 = r2.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = " was started more than once. Each instance of"
                r0.append(r1)
                java.lang.Class r1 = r2.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = " is intended to only be used once. You should create a new instance for each use."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "RecyclerView"
                android.util.Log.w(r1, r0)
            L38:
                r2.mRecyclerView = r3
                r2.mLayoutManager = r4
                int r4 = r2.mTargetPosition
                r0 = -1
                if (r4 == r0) goto L61
                androidx.recyclerview.widget.RecyclerView$State r3 = r3.mState
                r3.mTargetPosition = r4
                r3 = 1
                r2.mRunning = r3
                r2.mPendingInitialRun = r3
                int r4 = r2.getTargetPosition()
                android.view.View r4 = r2.findViewByPosition(r4)
                r2.mTargetView = r4
                r2.onStart()
                androidx.recyclerview.widget.RecyclerView r4 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ViewFlinger r4 = r4.mViewFlinger
                r4.postOnAnimation()
                r2.mStarted = r3
                return
            L61:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Invalid target position"
                r3.<init>(r4)
                throw r3
        }

        public final void stop() {
                r3 = this;
                boolean r0 = r3.mRunning
                if (r0 != 0) goto L5
                return
            L5:
                r0 = 0
                r3.mRunning = r0
                r3.onStop()
                androidx.recyclerview.widget.RecyclerView r1 = r3.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$State r1 = r1.mState
                r2 = -1
                r1.mTargetPosition = r2
                r1 = 0
                r3.mTargetView = r1
                r3.mTargetPosition = r2
                r3.mPendingInitialRun = r0
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayoutManager
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r2 = r0.mSmoothScroller
                if (r2 != r3) goto L21
                r0.mSmoothScroller = r1
            L21:
                r3.mLayoutManager = r1
                r3.mRecyclerView = r1
                return
        }
    }

    public static class State {
        private android.util.SparseArray<java.lang.Object> mData;
        public int mDeletedInvisibleItemCountSincePreviousLayout;
        public long mFocusedItemId;
        public int mFocusedItemPosition;
        public int mFocusedSubChildId;
        public boolean mInPreLayout;
        public boolean mIsMeasuring;
        public int mItemCount;
        public int mLayoutStep;
        public int mPreviousLayoutItemCount;
        public int mRemainingScrollHorizontal;
        public int mRemainingScrollVertical;
        public boolean mRunPredictiveAnimations;
        public boolean mRunSimpleAnimations;
        public boolean mStructureChanged;
        public int mTargetPosition;
        public boolean mTrackOldChangeHolders;

        public State() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.mTargetPosition = r0
                r0 = 0
                r2.mPreviousLayoutItemCount = r0
                r2.mDeletedInvisibleItemCountSincePreviousLayout = r0
                r1 = 1
                r2.mLayoutStep = r1
                r2.mItemCount = r0
                r2.mStructureChanged = r0
                r2.mInPreLayout = r0
                r2.mTrackOldChangeHolders = r0
                r2.mIsMeasuring = r0
                r2.mRunSimpleAnimations = r0
                r2.mRunPredictiveAnimations = r0
                return
        }

        public final void assertLayoutStep(int r3) {
                r2 = this;
                int r0 = r2.mLayoutStep
                r0 = r0 & r3
                if (r0 == 0) goto L6
                return
            L6:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Layout state should be one of "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.String r3 = java.lang.Integer.toBinaryString(r3)
                r1.append(r3)
                java.lang.String r3 = " but it is "
                r1.append(r3)
                int r3 = r2.mLayoutStep
                java.lang.String r3 = java.lang.Integer.toBinaryString(r3)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public boolean didStructureChange() {
                r1 = this;
                boolean r0 = r1.mStructureChanged
                return r0
        }

        public <T> T get(int r2) {
                r1 = this;
                android.util.SparseArray<java.lang.Object> r0 = r1.mData
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        public int getItemCount() {
                r2 = this;
                boolean r0 = r2.mInPreLayout
                if (r0 == 0) goto La
                int r0 = r2.mPreviousLayoutItemCount
                int r1 = r2.mDeletedInvisibleItemCountSincePreviousLayout
                int r0 = r0 - r1
                goto Lc
            La:
                int r0 = r2.mItemCount
            Lc:
                return r0
        }

        public int getRemainingScrollHorizontal() {
                r1 = this;
                int r0 = r1.mRemainingScrollHorizontal
                return r0
        }

        public int getRemainingScrollVertical() {
                r1 = this;
                int r0 = r1.mRemainingScrollVertical
                return r0
        }

        public int getTargetScrollPosition() {
                r1 = this;
                int r0 = r1.mTargetPosition
                return r0
        }

        public boolean hasTargetScrollPosition() {
                r2 = this;
                int r0 = r2.mTargetPosition
                r1 = -1
                if (r0 == r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        public boolean isMeasuring() {
                r1 = this;
                boolean r0 = r1.mIsMeasuring
                return r0
        }

        public boolean isPreLayout() {
                r1 = this;
                boolean r0 = r1.mInPreLayout
                return r0
        }

        public void put(int r2, java.lang.Object r3) {
                r1 = this;
                android.util.SparseArray<java.lang.Object> r0 = r1.mData
                if (r0 != 0) goto Lb
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mData = r0
            Lb:
                android.util.SparseArray<java.lang.Object> r0 = r1.mData
                r0.put(r2, r3)
                return
        }

        public void remove(int r2) {
                r1 = this;
                android.util.SparseArray<java.lang.Object> r0 = r1.mData
                if (r0 != 0) goto L5
                return
            L5:
                r0.remove(r2)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "State{mTargetPosition="
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                int r1 = r2.mTargetPosition
                r0.append(r1)
                java.lang.String r1 = ", mData="
                r0.append(r1)
                android.util.SparseArray<java.lang.Object> r1 = r2.mData
                r0.append(r1)
                java.lang.String r1 = ", mItemCount="
                r0.append(r1)
                int r1 = r2.mItemCount
                r0.append(r1)
                java.lang.String r1 = ", mIsMeasuring="
                r0.append(r1)
                boolean r1 = r2.mIsMeasuring
                r0.append(r1)
                java.lang.String r1 = ", mPreviousLayoutItemCount="
                r0.append(r1)
                int r1 = r2.mPreviousLayoutItemCount
                r0.append(r1)
                java.lang.String r1 = ", mDeletedInvisibleItemCountSincePreviousLayout="
                r0.append(r1)
                int r1 = r2.mDeletedInvisibleItemCountSincePreviousLayout
                r0.append(r1)
                java.lang.String r1 = ", mStructureChanged="
                r0.append(r1)
                boolean r1 = r2.mStructureChanged
                r0.append(r1)
                java.lang.String r1 = ", mInPreLayout="
                r0.append(r1)
                boolean r1 = r2.mInPreLayout
                r0.append(r1)
                java.lang.String r1 = ", mRunSimpleAnimations="
                r0.append(r1)
                boolean r1 = r2.mRunSimpleAnimations
                r0.append(r1)
                java.lang.String r1 = ", mRunPredictiveAnimations="
                r0.append(r1)
                boolean r1 = r2.mRunPredictiveAnimations
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public boolean willRunPredictiveAnimations() {
                r1 = this;
                boolean r0 = r1.mRunPredictiveAnimations
                return r0
        }

        public boolean willRunSimpleAnimations() {
                r1 = this;
                boolean r0 = r1.mRunSimpleAnimations
                return r0
        }
    }

    public static abstract class ViewCacheExtension {
        public ViewCacheExtension() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public abstract android.view.View getViewForPositionAndType(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, int r2, int r3);
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ViewFlinger implements java.lang.Runnable {
        private boolean mEatRunOnAnimationRequest;
        public android.view.animation.Interpolator mInterpolator;
        private int mLastFlingX;
        private int mLastFlingY;
        public android.widget.OverScroller mOverScroller;
        private boolean mReSchedulePostAnimationCallback;
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView this$0;

        public ViewFlinger(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                android.view.animation.Interpolator r0 = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator
                r2.mInterpolator = r0
                r1 = 0
                r2.mEatRunOnAnimationRequest = r1
                r2.mReSchedulePostAnimationCallback = r1
                android.widget.OverScroller r1 = new android.widget.OverScroller
                android.content.Context r3 = r3.getContext()
                r1.<init>(r3, r0)
                r2.mOverScroller = r1
                return
        }

        private int computeScrollDuration(int r3, int r4) {
                r2 = this;
                int r3 = java.lang.Math.abs(r3)
                int r4 = java.lang.Math.abs(r4)
                if (r3 <= r4) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                androidx.recyclerview.widget.RecyclerView r1 = r2.this$0
                if (r0 == 0) goto L16
                int r1 = r1.getWidth()
                goto L1a
            L16:
                int r1 = r1.getHeight()
            L1a:
                if (r0 == 0) goto L1d
                goto L1e
            L1d:
                r3 = r4
            L1e:
                float r3 = (float) r3
                float r4 = (float) r1
                float r3 = r3 / r4
                r4 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 + r4
                r4 = 1133903872(0x43960000, float:300.0)
                float r3 = r3 * r4
                int r3 = (int) r3
                r4 = 2000(0x7d0, float:2.803E-42)
                int r3 = java.lang.Math.min(r3, r4)
                return r3
        }

        private void internalPostOnAnimation() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.this$0
                r0.removeCallbacks(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r1.this$0
                androidx.core.view.ViewCompat.postOnAnimation(r0, r1)
                return
        }

        public void fling(int r13, int r14) {
                r12 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r12.this$0
                r1 = 2
                r0.setScrollState(r1)
                r0 = 0
                r12.mLastFlingY = r0
                r12.mLastFlingX = r0
                android.view.animation.Interpolator r0 = r12.mInterpolator
                android.view.animation.Interpolator r1 = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator
                if (r0 == r1) goto L20
                r12.mInterpolator = r1
                android.widget.OverScroller r0 = new android.widget.OverScroller
                androidx.recyclerview.widget.RecyclerView r2 = r12.this$0
                android.content.Context r2 = r2.getContext()
                r0.<init>(r2, r1)
                r12.mOverScroller = r0
            L20:
                android.widget.OverScroller r3 = r12.mOverScroller
                r4 = 0
                r5 = 0
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 2147483647(0x7fffffff, float:NaN)
                r10 = -2147483648(0xffffffff80000000, float:-0.0)
                r11 = 2147483647(0x7fffffff, float:NaN)
                r6 = r13
                r7 = r14
                r3.fling(r4, r5, r6, r7, r8, r9, r10, r11)
                r12.postOnAnimation()
                return
        }

        public final void postOnAnimation() {
                r1 = this;
                boolean r0 = r1.mEatRunOnAnimationRequest
                if (r0 == 0) goto L8
                r0 = 1
                r1.mReSchedulePostAnimationCallback = r0
                goto Lb
            L8:
                r1.internalPostOnAnimation()
            Lb:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r22 = this;
                r0 = r22
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r1.mLayout
                if (r2 != 0) goto Lc
                r22.stop()
                return
            Lc:
                r2 = 0
                r0.mReSchedulePostAnimationCallback = r2
                r3 = 1
                r0.mEatRunOnAnimationRequest = r3
                r1.consumePendingUpdateOperations()
                android.widget.OverScroller r1 = r0.mOverScroller
                boolean r4 = r1.computeScrollOffset()
                if (r4 == 0) goto L170
                int r4 = r1.getCurrX()
                int r5 = r1.getCurrY()
                int r6 = r0.mLastFlingX
                int r6 = r4 - r6
                int r7 = r0.mLastFlingY
                int r13 = r5 - r7
                r0.mLastFlingX = r4
                r0.mLastFlingY = r5
                androidx.recyclerview.widget.RecyclerView r7 = r0.this$0
                int[] r10 = r7.mReusableIntPair
                r10[r2] = r2
                r10[r3] = r2
                r11 = 0
                r12 = 1
                r8 = r6
                r9 = r13
                boolean r4 = r7.dispatchNestedPreScroll(r8, r9, r10, r11, r12)
                if (r4 == 0) goto L4d
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                int[] r4 = r4.mReusableIntPair
                r5 = r4[r2]
                int r6 = r6 - r5
                r4 = r4[r3]
                int r13 = r13 - r4
            L4d:
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                int r4 = r4.getOverScrollMode()
                r5 = 2
                if (r4 == r5) goto L5b
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                r4.considerReleasingGlowsOnScroll(r6, r13)
            L5b:
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r7 = r4.mAdapter
                if (r7 == 0) goto La6
                int[] r7 = r4.mReusableIntPair
                r7[r2] = r2
                r7[r3] = r2
                r4.scrollStep(r6, r13, r7)
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                int[] r7 = r4.mReusableIntPair
                r8 = r7[r2]
                r7 = r7[r3]
                int r6 = r6 - r8
                int r13 = r13 - r7
                androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.mLayout
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r4 = r4.mSmoothScroller
                if (r4 == 0) goto La8
                boolean r9 = r4.isPendingInitialRun()
                if (r9 != 0) goto La8
                boolean r9 = r4.isRunning()
                if (r9 == 0) goto La8
                androidx.recyclerview.widget.RecyclerView r9 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$State r9 = r9.mState
                int r9 = r9.getItemCount()
                if (r9 != 0) goto L94
                r4.stop()
                goto La8
            L94:
                int r10 = r4.getTargetPosition()
                if (r10 < r9) goto La2
                int r9 = r9 - r3
                r4.setTargetPosition(r9)
                r4.onAnimation(r8, r7)
                goto La8
            La2:
                r4.onAnimation(r8, r7)
                goto La8
            La6:
                r7 = 0
                r8 = 0
            La8:
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r4 = r4.mItemDecorations
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto Lb7
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                r4.invalidate()
            Lb7:
                androidx.recyclerview.widget.RecyclerView r14 = r0.this$0
                int[] r4 = r14.mReusableIntPair
                r4[r2] = r2
                r4[r3] = r2
                r19 = 0
                r20 = 1
                r15 = r8
                r16 = r7
                r17 = r6
                r18 = r13
                r21 = r4
                r14.dispatchNestedScroll(r15, r16, r17, r18, r19, r20, r21)
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                int[] r9 = r4.mReusableIntPair
                r10 = r9[r2]
                int r6 = r6 - r10
                r9 = r9[r3]
                int r13 = r13 - r9
                if (r8 != 0) goto Ldd
                if (r7 == 0) goto Le0
            Ldd:
                r4.dispatchOnScrolled(r8, r7)
            Le0:
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                boolean r4 = androidx.recyclerview.widget.RecyclerView.access$200(r4)
                if (r4 != 0) goto Led
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                r4.invalidate()
            Led:
                int r4 = r1.getCurrX()
                int r9 = r1.getFinalX()
                if (r4 != r9) goto Lf9
                r4 = 1
                goto Lfa
            Lf9:
                r4 = 0
            Lfa:
                int r9 = r1.getCurrY()
                int r10 = r1.getFinalY()
                if (r9 != r10) goto L106
                r9 = 1
                goto L107
            L106:
                r9 = 0
            L107:
                boolean r10 = r1.isFinished()
                if (r10 != 0) goto L118
                if (r4 != 0) goto L111
                if (r6 == 0) goto L116
            L111:
                if (r9 != 0) goto L118
                if (r13 == 0) goto L116
                goto L118
            L116:
                r4 = 0
                goto L119
            L118:
                r4 = 1
            L119:
                androidx.recyclerview.widget.RecyclerView r9 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$LayoutManager r9 = r9.mLayout
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r9 = r9.mSmoothScroller
                if (r9 == 0) goto L129
                boolean r9 = r9.isPendingInitialRun()
                if (r9 == 0) goto L129
                r9 = 1
                goto L12a
            L129:
                r9 = 0
            L12a:
                if (r9 != 0) goto L164
                if (r4 == 0) goto L164
                androidx.recyclerview.widget.RecyclerView r4 = r0.this$0
                int r4 = r4.getOverScrollMode()
                if (r4 == r5) goto L151
                float r1 = r1.getCurrVelocity()
                int r1 = (int) r1
                if (r6 >= 0) goto L13f
                int r4 = -r1
                goto L144
            L13f:
                if (r6 <= 0) goto L143
                r4 = r1
                goto L144
            L143:
                r4 = 0
            L144:
                if (r13 >= 0) goto L148
                int r1 = -r1
                goto L14c
            L148:
                if (r13 <= 0) goto L14b
                goto L14c
            L14b:
                r1 = 0
            L14c:
                androidx.recyclerview.widget.RecyclerView r5 = r0.this$0
                r5.absorbGlows(r4, r1)
            L151:
                boolean r1 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r1 == 0) goto L170
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r1 = r1.mPrefetchRegistry
                int[] r4 = r1.mPrefetchArray
                if (r4 == 0) goto L161
                r5 = -1
                java.util.Arrays.fill(r4, r5)
            L161:
                r1.mCount = r2
                goto L170
            L164:
                r22.postOnAnimation()
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                androidx.recyclerview.widget.GapWorker r4 = r1.mGapWorker
                if (r4 == 0) goto L170
                r4.postFromTraversal(r1, r8, r7)
            L170:
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.mLayout
                androidx.recyclerview.widget.RecyclerView$SmoothScroller r1 = r1.mSmoothScroller
                if (r1 == 0) goto L181
                boolean r4 = r1.isPendingInitialRun()
                if (r4 == 0) goto L181
                r1.onAnimation(r2, r2)
            L181:
                r0.mEatRunOnAnimationRequest = r2
                boolean r1 = r0.mReSchedulePostAnimationCallback
                if (r1 == 0) goto L18b
                r22.internalPostOnAnimation()
                goto L195
            L18b:
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                r1.setScrollState(r2)
                androidx.recyclerview.widget.RecyclerView r1 = r0.this$0
                r1.stopNestedScroll(r3)
            L195:
                return
        }

        public void smoothScrollBy(int r7, int r8, int r9, @androidx.annotation.Nullable android.view.animation.Interpolator r10) {
                r6 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r9 != r0) goto L8
                int r9 = r6.computeScrollDuration(r7, r8)
            L8:
                r5 = r9
                if (r10 != 0) goto Ld
                android.view.animation.Interpolator r10 = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator
            Ld:
                android.view.animation.Interpolator r9 = r6.mInterpolator
                if (r9 == r10) goto L20
                r6.mInterpolator = r10
                android.widget.OverScroller r9 = new android.widget.OverScroller
                androidx.recyclerview.widget.RecyclerView r0 = r6.this$0
                android.content.Context r0 = r0.getContext()
                r9.<init>(r0, r10)
                r6.mOverScroller = r9
            L20:
                r9 = 0
                r6.mLastFlingY = r9
                r6.mLastFlingX = r9
                androidx.recyclerview.widget.RecyclerView r9 = r6.this$0
                r10 = 2
                r9.setScrollState(r10)
                android.widget.OverScroller r0 = r6.mOverScroller
                r1 = 0
                r2 = 0
                r3 = r7
                r4 = r8
                r0.startScroll(r1, r2, r3, r4, r5)
                int r7 = android.os.Build.VERSION.SDK_INT
                r8 = 23
                if (r7 >= r8) goto L3f
                android.widget.OverScroller r7 = r6.mOverScroller
                r7.computeScrollOffset()
            L3f:
                r6.postOnAnimation()
                return
        }

        public void stop() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.this$0
                r0.removeCallbacks(r1)
                android.widget.OverScroller r0 = r1.mOverScroller
                r0.abortAnimation()
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class ViewHolder {
        private static final java.util.List<java.lang.Object> FULLUPDATE_PAYLOADS = null;

        @androidx.annotation.NonNull
        public final android.view.View itemView;
        public androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> mBindingAdapter;
        public int mFlags;
        public boolean mInChangeScrap;
        private int mIsRecyclableCount;
        public long mItemId;
        public int mItemViewType;
        public java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> mNestedRecyclerView;
        public int mOldPosition;
        public androidx.recyclerview.widget.RecyclerView mOwnerRecyclerView;
        public java.util.List<java.lang.Object> mPayloads;

        @androidx.annotation.VisibleForTesting
        public int mPendingAccessibilityState;
        public int mPosition;
        public int mPreLayoutPosition;
        public androidx.recyclerview.widget.RecyclerView.Recycler mScrapContainer;
        public androidx.recyclerview.widget.RecyclerView.ViewHolder mShadowedHolder;
        public androidx.recyclerview.widget.RecyclerView.ViewHolder mShadowingHolder;
        public java.util.List<java.lang.Object> mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        static {
                java.util.List r0 = java.util.Collections.emptyList()
                androidx.recyclerview.widget.RecyclerView.ViewHolder.FULLUPDATE_PAYLOADS = r0
                return
        }

        public ViewHolder(@androidx.annotation.NonNull android.view.View r4) {
                r3 = this;
                r3.<init>()
                r0 = -1
                r3.mPosition = r0
                r3.mOldPosition = r0
                r1 = -1
                r3.mItemId = r1
                r3.mItemViewType = r0
                r3.mPreLayoutPosition = r0
                r1 = 0
                r3.mShadowedHolder = r1
                r3.mShadowingHolder = r1
                r3.mPayloads = r1
                r3.mUnmodifiedPayloads = r1
                r2 = 0
                r3.mIsRecyclableCount = r2
                r3.mScrapContainer = r1
                r3.mInChangeScrap = r2
                r3.mWasImportantForAccessibilityBeforeHidden = r2
                r3.mPendingAccessibilityState = r0
                if (r4 == 0) goto L29
                r3.itemView = r4
                return
            L29:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "itemView may not be null"
                r4.<init>(r0)
                throw r4
        }

        private void createPayloadsIfNeeded() {
                r1 = this;
                java.util.List<java.lang.Object> r0 = r1.mPayloads
                if (r0 != 0) goto L11
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mPayloads = r0
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.mUnmodifiedPayloads = r0
            L11:
                return
        }

        public final void addChangePayload(java.lang.Object r3) {
                r2 = this;
                r0 = 1024(0x400, float:1.435E-42)
                if (r3 != 0) goto L8
                r2.addFlags(r0)
                goto L15
            L8:
                int r1 = r2.mFlags
                r0 = r0 & r1
                if (r0 != 0) goto L15
                r2.createPayloadsIfNeeded()
                java.util.List<java.lang.Object> r0 = r2.mPayloads
                r0.add(r3)
            L15:
                return
        }

        public final void addFlags(int r2) {
                r1 = this;
                int r0 = r1.mFlags
                r2 = r2 | r0
                r1.mFlags = r2
                return
        }

        public final void clearOldPosition() {
                r1 = this;
                r0 = -1
                r1.mOldPosition = r0
                r1.mPreLayoutPosition = r0
                return
        }

        public final void clearReturnedFromScrapFlag() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & (-33)
                r1.mFlags = r0
                return
        }

        public final int getAbsoluteAdapterPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mOwnerRecyclerView
                if (r0 != 0) goto L6
                r0 = -1
                return r0
            L6:
                int r0 = r0.getAdapterPositionInRecyclerView(r1)
                return r0
        }

        @java.lang.Deprecated
        public final int getAdapterPosition() {
                r1 = this;
                int r0 = r1.getBindingAdapterPosition()
                return r0
        }

        @androidx.annotation.Nullable
        public final androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> getBindingAdapter() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$Adapter<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mBindingAdapter
                return r0
        }

        public final int getBindingAdapterPosition() {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$Adapter<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r3.mBindingAdapter
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.recyclerview.widget.RecyclerView r0 = r3.mOwnerRecyclerView
                if (r0 != 0) goto Lb
                return r1
            Lb:
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                if (r0 != 0) goto L12
                return r1
            L12:
                androidx.recyclerview.widget.RecyclerView r2 = r3.mOwnerRecyclerView
                int r2 = r2.getAdapterPositionInRecyclerView(r3)
                if (r2 != r1) goto L1b
                return r1
            L1b:
                androidx.recyclerview.widget.RecyclerView$Adapter<? extends androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r3.mBindingAdapter
                int r0 = r0.findRelativeAdapterPositionIn(r1, r3, r2)
                return r0
        }

        public final long getItemId() {
                r2 = this;
                long r0 = r2.mItemId
                return r0
        }

        public final int getItemViewType() {
                r1 = this;
                int r0 = r1.mItemViewType
                return r0
        }

        public final int getLayoutPosition() {
                r2 = this;
                int r0 = r2.mPreLayoutPosition
                r1 = -1
                if (r0 != r1) goto L7
                int r0 = r2.mPosition
            L7:
                return r0
        }

        public final int getOldPosition() {
                r1 = this;
                int r0 = r1.mOldPosition
                return r0
        }

        @java.lang.Deprecated
        public final int getPosition() {
                r2 = this;
                int r0 = r2.mPreLayoutPosition
                r1 = -1
                if (r0 != r1) goto L7
                int r0 = r2.mPosition
            L7:
                return r0
        }

        public final java.util.List<java.lang.Object> getUnmodifiedPayloads() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 != 0) goto L17
                java.util.List<java.lang.Object> r0 = r1.mPayloads
                if (r0 == 0) goto L14
                int r0 = r0.size()
                if (r0 != 0) goto L11
                goto L14
            L11:
                java.util.List<java.lang.Object> r0 = r1.mUnmodifiedPayloads
                return r0
            L14:
                java.util.List<java.lang.Object> r0 = androidx.recyclerview.widget.RecyclerView.ViewHolder.FULLUPDATE_PAYLOADS
                return r0
            L17:
                java.util.List<java.lang.Object> r0 = androidx.recyclerview.widget.RecyclerView.ViewHolder.FULLUPDATE_PAYLOADS
                return r0
        }

        public final boolean hasAnyOfTheFlags(int r2) {
                r1 = this;
                int r0 = r1.mFlags
                r2 = r2 & r0
                if (r2 == 0) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                return r2
        }

        public final boolean isAttachedToTransitionOverlay() {
                r2 = this;
                android.view.View r0 = r2.itemView
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L14
                android.view.View r0 = r2.itemView
                android.view.ViewParent r0 = r0.getParent()
                androidx.recyclerview.widget.RecyclerView r1 = r2.mOwnerRecyclerView
                if (r0 == r1) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }

        public final boolean isBound() {
                r2 = this;
                int r0 = r2.mFlags
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        public final boolean isInvalid() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 4
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isRecyclable() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 16
                if (r0 != 0) goto L10
                android.view.View r0 = r1.itemView
                boolean r0 = androidx.core.view.ViewCompat.hasTransientState(r0)
                if (r0 != 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        public final boolean isRemoved() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 8
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isScrap() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$Recycler r0 = r1.mScrapContainer
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public final boolean isTmpDetached() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isUpdated() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean needsUpdate() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final void offsetPosition(int r3, boolean r4) {
                r2 = this;
                int r0 = r2.mOldPosition
                r1 = -1
                if (r0 != r1) goto L9
                int r0 = r2.mPosition
                r2.mOldPosition = r0
            L9:
                int r0 = r2.mPreLayoutPosition
                if (r0 != r1) goto L11
                int r0 = r2.mPosition
                r2.mPreLayoutPosition = r0
            L11:
                if (r4 == 0) goto L18
                int r4 = r2.mPreLayoutPosition
                int r4 = r4 + r3
                r2.mPreLayoutPosition = r4
            L18:
                int r4 = r2.mPosition
                int r4 = r4 + r3
                r2.mPosition = r4
                android.view.View r3 = r2.itemView
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                if (r3 == 0) goto L30
                android.view.View r3 = r2.itemView
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r3
                r4 = 1
                r3.mInsetsDirty = r4
            L30:
                return
        }

        public final void onEnteredHiddenState(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                int r0 = r2.mPendingAccessibilityState
                r1 = -1
                if (r0 == r1) goto L8
                r2.mWasImportantForAccessibilityBeforeHidden = r0
                goto L10
            L8:
                android.view.View r0 = r2.itemView
                int r0 = androidx.core.view.ViewCompat.getImportantForAccessibility(r0)
                r2.mWasImportantForAccessibilityBeforeHidden = r0
            L10:
                r0 = 4
                r3.setChildImportantForAccessibilityInternal(r2, r0)
                return
        }

        public final void onLeftHiddenState(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                int r0 = r1.mWasImportantForAccessibilityBeforeHidden
                r2.setChildImportantForAccessibilityInternal(r1, r0)
                r2 = 0
                r1.mWasImportantForAccessibilityBeforeHidden = r2
                return
        }

        public final void resetInternal() {
                r4 = this;
                r0 = 0
                r4.mFlags = r0
                r1 = -1
                r4.mPosition = r1
                r4.mOldPosition = r1
                r2 = -1
                r4.mItemId = r2
                r4.mPreLayoutPosition = r1
                r4.mIsRecyclableCount = r0
                r2 = 0
                r4.mShadowedHolder = r2
                r4.mShadowingHolder = r2
                java.util.List<java.lang.Object> r2 = r4.mPayloads
                if (r2 == 0) goto L1c
                r2.clear()
            L1c:
                int r2 = r4.mFlags
                r2 = r2 & (-1025(0xfffffffffffffbff, float:NaN))
                r4.mFlags = r2
                r4.mWasImportantForAccessibilityBeforeHidden = r0
                r4.mPendingAccessibilityState = r1
                androidx.recyclerview.widget.RecyclerView.clearNestedRecyclerViewIfNotNested(r4)
                return
        }

        public final void setFlags(int r3, int r4) {
                r2 = this;
                int r0 = r2.mFlags
                int r1 = ~r4
                r0 = r0 & r1
                r3 = r3 & r4
                r3 = r3 | r0
                r2.mFlags = r3
                return
        }

        public final void setIsRecyclable(boolean r3) {
                r2 = this;
                r0 = 1
                int r1 = r2.mIsRecyclableCount
                if (r3 == 0) goto L7
                int r1 = r1 - r0
                goto L8
            L7:
                int r1 = r1 + r0
            L8:
                r2.mIsRecyclableCount = r1
                if (r1 >= 0) goto L26
                r3 = 0
                r2.mIsRecyclableCount = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "
                r3.append(r0)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = "View"
                android.util.Log.e(r0, r3)
                goto L3b
            L26:
                if (r3 != 0) goto L31
                if (r1 != r0) goto L31
                int r3 = r2.mFlags
                r3 = r3 | 16
                r2.mFlags = r3
                goto L3b
            L31:
                if (r3 == 0) goto L3b
                if (r1 != 0) goto L3b
                int r3 = r2.mFlags
                r3 = r3 & (-17)
                r2.mFlags = r3
            L3b:
                return
        }

        public final boolean shouldIgnore() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 128(0x80, float:1.8E-43)
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.Class r0 = r4.getClass()
                boolean r0 = r0.isAnonymousClass()
                if (r0 == 0) goto Ld
                java.lang.String r0 = "ViewHolder"
                goto L15
            Ld:
                java.lang.Class r0 = r4.getClass()
                java.lang.String r0 = r0.getSimpleName()
            L15:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "{"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r2)
                int r2 = r4.hashCode()
                java.lang.String r2 = java.lang.Integer.toHexString(r2)
                r0.append(r2)
                java.lang.String r2 = " position="
                r0.append(r2)
                int r2 = r4.mPosition
                r0.append(r2)
                java.lang.String r2 = " id="
                r0.append(r2)
                long r2 = r4.mItemId
                r0.append(r2)
                java.lang.String r2 = ", oldPos="
                r0.append(r2)
                int r2 = r4.mOldPosition
                r0.append(r2)
                java.lang.String r2 = ", pLpos:"
                r0.append(r2)
                int r2 = r4.mPreLayoutPosition
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                boolean r0 = r4.isScrap()
                if (r0 == 0) goto L6f
                java.lang.String r0 = " scrap "
                r1.append(r0)
                boolean r0 = r4.mInChangeScrap
                if (r0 == 0) goto L6a
                java.lang.String r0 = "[changeScrap]"
                goto L6c
            L6a:
                java.lang.String r0 = "[attachedScrap]"
            L6c:
                r1.append(r0)
            L6f:
                boolean r0 = r4.isInvalid()
                if (r0 == 0) goto L7a
                java.lang.String r0 = " invalid"
                r1.append(r0)
            L7a:
                boolean r0 = r4.isBound()
                if (r0 != 0) goto L85
                java.lang.String r0 = " unbound"
                r1.append(r0)
            L85:
                boolean r0 = r4.needsUpdate()
                if (r0 == 0) goto L90
                java.lang.String r0 = " update"
                r1.append(r0)
            L90:
                boolean r0 = r4.isRemoved()
                if (r0 == 0) goto L9b
                java.lang.String r0 = " removed"
                r1.append(r0)
            L9b:
                boolean r0 = r4.shouldIgnore()
                if (r0 == 0) goto La6
                java.lang.String r0 = " ignored"
                r1.append(r0)
            La6:
                boolean r0 = r4.isTmpDetached()
                if (r0 == 0) goto Lb1
                java.lang.String r0 = " tmpDetached"
                r1.append(r0)
            Lb1:
                boolean r0 = r4.isRecyclable()
                if (r0 != 0) goto Lce
                java.lang.String r0 = " not recyclable("
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                int r2 = r4.mIsRecyclableCount
                r0.append(r2)
                java.lang.String r2 = ")"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r1.append(r0)
            Lce:
                int r0 = r4.mFlags
                r0 = r0 & 512(0x200, float:7.17E-43)
                if (r0 != 0) goto Ldd
                boolean r0 = r4.isInvalid()
                if (r0 == 0) goto Ldb
                goto Ldd
            Ldb:
                r0 = 0
                goto Lde
            Ldd:
                r0 = 1
            Lde:
                if (r0 == 0) goto Le5
                java.lang.String r0 = " undefined adapter position"
                r1.append(r0)
            Le5:
                android.view.View r0 = r4.itemView
                android.view.ViewParent r0 = r0.getParent()
                if (r0 != 0) goto Lf2
                java.lang.String r0 = " no parent"
                r1.append(r0)
            Lf2:
                java.lang.String r0 = "}"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }

        public final void unScrap() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$Recycler r0 = r1.mScrapContainer
                r0.unscrapView(r1)
                return
        }

        public final boolean wasReturnedFromScrap() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 32
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            androidx.recyclerview.widget.RecyclerView.NESTED_SCROLLING_ATTRS = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r1
            androidx.recyclerview.widget.RecyclerView.POST_UPDATES_ON_ANIMATION = r0
            androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK = r0
            androidx.recyclerview.widget.RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION = r2
            androidx.recyclerview.widget.RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD = r2
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            androidx.recyclerview.widget.RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r1
            androidx.recyclerview.widget.RecyclerView$3 r0 = new androidx.recyclerview.widget.RecyclerView$3
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator = r0
            return
    }

    public RecyclerView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public RecyclerView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.recyclerview.R.attr.recyclerViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public RecyclerView(@androidx.annotation.NonNull android.content.Context r18, @androidx.annotation.Nullable android.util.AttributeSet r19, int r20) {
            r17 = this;
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r17.<init>(r18, r19, r20)
            androidx.recyclerview.widget.RecyclerView$RecyclerViewDataObserver r0 = new androidx.recyclerview.widget.RecyclerView$RecyclerViewDataObserver
            r0.<init>(r9)
            r9.mObserver = r0
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = new androidx.recyclerview.widget.RecyclerView$Recycler
            r0.<init>(r9)
            r9.mRecycler = r0
            androidx.recyclerview.widget.ViewInfoStore r0 = new androidx.recyclerview.widget.ViewInfoStore
            r0.<init>()
            r9.mViewInfoStore = r0
            androidx.recyclerview.widget.RecyclerView$1 r0 = new androidx.recyclerview.widget.RecyclerView$1
            r0.<init>(r9)
            r9.mUpdateChildViewsRunnable = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.mTempRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.mTempRect2 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r9.mTempRectF = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mRecyclerListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mItemDecorations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mOnItemTouchListeners = r0
            r13 = 0
            r9.mInterceptRequestLayoutDepth = r13
            r9.mDataSetHasChangedAfterLayout = r13
            r9.mDispatchItemsChangedEvent = r13
            r9.mLayoutOrScrollCounter = r13
            r9.mDispatchScrollCounter = r13
            androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory r0 = new androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory
            r0.<init>()
            r9.mEdgeEffectFactory = r0
            androidx.recyclerview.widget.DefaultItemAnimator r0 = new androidx.recyclerview.widget.DefaultItemAnimator
            r0.<init>()
            r9.mItemAnimator = r0
            r9.mScrollState = r13
            r7 = -1
            r9.mScrollPointerId = r7
            r0 = 1
            r9.mScaledHorizontalScrollFactor = r0
            r9.mScaledVerticalScrollFactor = r0
            r14 = 1
            r9.mPreserveFocusAfterLayout = r14
            androidx.recyclerview.widget.RecyclerView$ViewFlinger r0 = new androidx.recyclerview.widget.RecyclerView$ViewFlinger
            r0.<init>(r9)
            r9.mViewFlinger = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L88
            androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r0 = new androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl
            r0.<init>()
            goto L89
        L88:
            r0 = 0
        L89:
            r9.mPrefetchRegistry = r0
            androidx.recyclerview.widget.RecyclerView$State r0 = new androidx.recyclerview.widget.RecyclerView$State
            r0.<init>()
            r9.mState = r0
            r9.mItemsAddedOrRemoved = r13
            r9.mItemsChanged = r13
            androidx.recyclerview.widget.RecyclerView$ItemAnimatorRestoreListener r0 = new androidx.recyclerview.widget.RecyclerView$ItemAnimatorRestoreListener
            r0.<init>(r9)
            r9.mItemAnimatorListener = r0
            r9.mPostedAnimatorRunner = r13
            r0 = 2
            int[] r1 = new int[r0]
            r9.mMinMaxLayoutPositions = r1
            int[] r1 = new int[r0]
            r9.mScrollOffset = r1
            int[] r1 = new int[r0]
            r9.mNestedOffsets = r1
            int[] r1 = new int[r0]
            r9.mReusableIntPair = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.mPendingAccessibilityImportanceChange = r1
            androidx.recyclerview.widget.RecyclerView$2 r1 = new androidx.recyclerview.widget.RecyclerView$2
            r1.<init>(r9)
            r9.mItemAnimatorRunner = r1
            r9.mLastAutoMeasureNonExactMeasuredWidth = r13
            r9.mLastAutoMeasureNonExactMeasuredHeight = r13
            androidx.recyclerview.widget.RecyclerView$4 r1 = new androidx.recyclerview.widget.RecyclerView$4
            r1.<init>(r9)
            r9.mViewInfoProcessCallback = r1
            r9.setScrollContainer(r14)
            r9.setFocusableInTouchMode(r14)
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r18)
            int r2 = r1.getScaledTouchSlop()
            r9.mTouchSlop = r2
            float r2 = androidx.core.view.ViewConfigurationCompat.getScaledHorizontalScrollFactor(r1, r10)
            r9.mScaledHorizontalScrollFactor = r2
            float r2 = androidx.core.view.ViewConfigurationCompat.getScaledVerticalScrollFactor(r1, r10)
            r9.mScaledVerticalScrollFactor = r2
            int r2 = r1.getScaledMinimumFlingVelocity()
            r9.mMinFlingVelocity = r2
            int r1 = r1.getScaledMaximumFlingVelocity()
            r9.mMaxFlingVelocity = r1
            int r1 = r17.getOverScrollMode()
            if (r1 != r0) goto Lf9
            r0 = 1
            goto Lfa
        Lf9:
            r0 = 0
        Lfa:
            r9.setWillNotDraw(r0)
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r9.mItemAnimator
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorListener r1 = r9.mItemAnimatorListener
            r0.setListener(r1)
            androidx.recyclerview.widget.AdapterHelper r0 = new androidx.recyclerview.widget.AdapterHelper
            androidx.recyclerview.widget.RecyclerView$6 r1 = new androidx.recyclerview.widget.RecyclerView$6
            r1.<init>(r9)
            r0.<init>(r1)
            r9.mAdapterHelper = r0
            r17.initChildrenHelper()
            r17.initAutofill()
            int r0 = androidx.core.view.ViewCompat.getImportantForAccessibility(r17)
            if (r0 != 0) goto L11f
            androidx.core.view.ViewCompat.setImportantForAccessibility(r9, r14)
        L11f:
            android.content.Context r0 = r17.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r9.mAccessibilityManager = r0
            androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r0 = new androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
            r0.<init>(r9)
            r9.setAccessibilityDelegateCompat(r0)
            int[] r2 = androidx.recyclerview.R.styleable.RecyclerView
            android.content.res.TypedArray r15 = r10.obtainStyledAttributes(r11, r2, r12, r13)
            r6 = 0
            r0 = r17
            r1 = r18
            r3 = r19
            r4 = r15
            r5 = r20
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r0, r1, r2, r3, r4, r5, r6)
            int r0 = androidx.recyclerview.R.styleable.RecyclerView_layoutManager
            java.lang.String r16 = r15.getString(r0)
            int r0 = androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability
            int r0 = r15.getInt(r0, r7)
            if (r0 != r7) goto L15b
            r0 = 262144(0x40000, float:3.67342E-40)
            r9.setDescendantFocusability(r0)
        L15b:
            int r0 = androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding
            boolean r0 = r15.getBoolean(r0, r14)
            r9.mClipToPadding = r0
            int r0 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled
            boolean r0 = r15.getBoolean(r0, r13)
            if (r0 == 0) goto L1c4
            int r0 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable
            android.graphics.drawable.Drawable r0 = r15.getDrawable(r0)
            r2 = r0
            android.graphics.drawable.StateListDrawable r2 = (android.graphics.drawable.StateListDrawable) r2
            int r0 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable
            android.graphics.drawable.Drawable r3 = r15.getDrawable(r0)
            int r0 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable
            android.graphics.drawable.Drawable r0 = r15.getDrawable(r0)
            r4 = r0
            android.graphics.drawable.StateListDrawable r4 = (android.graphics.drawable.StateListDrawable) r4
            int r0 = androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable
            android.graphics.drawable.Drawable r5 = r15.getDrawable(r0)
            if (r2 == 0) goto L1b4
            if (r3 == 0) goto L1b4
            if (r4 == 0) goto L1b4
            if (r5 == 0) goto L1b4
            android.content.Context r0 = r17.getContext()
            android.content.res.Resources r0 = r0.getResources()
            androidx.recyclerview.widget.FastScroller r1 = new androidx.recyclerview.widget.FastScroller
            int r6 = androidx.recyclerview.R.dimen.fastscroll_default_thickness
            int r6 = r0.getDimensionPixelSize(r6)
            int r7 = androidx.recyclerview.R.dimen.fastscroll_minimum_range
            int r7 = r0.getDimensionPixelSize(r7)
            int r8 = androidx.recyclerview.R.dimen.fastscroll_margin
            int r8 = r0.getDimensionPixelOffset(r8)
            r0 = r1
            r1 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L1c4
        L1b4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set fast scroller without both required drawables."
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r1)
            r0.<init>(r1)
            throw r0
        L1c4:
            r15.recycle()
            r5 = 0
            r0 = r17
            r1 = r18
            r2 = r16
            r3 = r19
            r4 = r20
            r0.createLayoutManager(r1, r2, r3, r4, r5)
            int[] r2 = androidx.recyclerview.widget.RecyclerView.NESTED_SCROLLING_ATTRS
            android.content.res.TypedArray r7 = r10.obtainStyledAttributes(r11, r2, r12, r13)
            r6 = 0
            r4 = r7
            r5 = r20
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = r7.getBoolean(r13, r14)
            r7.recycle()
            r9.setNestedScrollingEnabled(r0)
            return
    }

    public static /* synthetic */ void access$000(androidx.recyclerview.widget.RecyclerView r0, android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0.attachViewToParent(r1, r2, r3)
            return
    }

    public static /* synthetic */ void access$100(androidx.recyclerview.widget.RecyclerView r0, int r1) {
            r0.detachViewFromParent(r1)
            return
    }

    public static /* synthetic */ boolean access$200(androidx.recyclerview.widget.RecyclerView r0) {
            boolean r0 = r0.awakenScrollBars()
            return r0
    }

    public static /* synthetic */ void access$300(androidx.recyclerview.widget.RecyclerView r0, int r1, int r2) {
            r0.setMeasuredDimension(r1, r2)
            return
    }

    private void addAnimatingView(androidx.recyclerview.widget.RecyclerView.ViewHolder r6) {
            r5 = this;
            android.view.View r0 = r6.itemView
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            if (r1 != r5) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            androidx.recyclerview.widget.RecyclerView$Recycler r3 = r5.mRecycler
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r5.getChildViewHolder(r0)
            r3.unscrapView(r4)
            boolean r6 = r6.isTmpDetached()
            r3 = -1
            if (r6 == 0) goto L26
            androidx.recyclerview.widget.ChildHelper r6 = r5.mChildHelper
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r6.attachViewToParent(r0, r3, r1, r2)
            goto L33
        L26:
            if (r1 != 0) goto L2e
            androidx.recyclerview.widget.ChildHelper r6 = r5.mChildHelper
            r6.addView(r0, r3, r2)
            goto L33
        L2e:
            androidx.recyclerview.widget.ChildHelper r6 = r5.mChildHelper
            r6.hide(r0)
        L33:
            return
    }

    private void animateChange(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r3, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r4, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r5, boolean r6, boolean r7) {
            r1 = this;
            r0 = 0
            r2.setIsRecyclable(r0)
            if (r6 == 0) goto L9
            r1.addAnimatingView(r2)
        L9:
            if (r2 == r3) goto L1f
            if (r7 == 0) goto L10
            r1.addAnimatingView(r3)
        L10:
            r2.mShadowedHolder = r3
            r1.addAnimatingView(r2)
            androidx.recyclerview.widget.RecyclerView$Recycler r6 = r1.mRecycler
            r6.unscrapView(r2)
            r3.setIsRecyclable(r0)
            r3.mShadowingHolder = r2
        L1f:
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r6 = r1.mItemAnimator
            boolean r2 = r6.animateChange(r2, r3, r4, r5)
            if (r2 == 0) goto L2a
            r1.postAnimationRunner()
        L2a:
            return
    }

    private void cancelScroll() {
            r1 = this;
            r1.resetScroll()
            r0 = 0
            r1.setScrollState(r0)
            return
    }

    public static void clearNestedRecyclerViewIfNotNested(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r0 = r3.mNestedRecyclerView
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        La:
            r1 = 0
            if (r0 == 0) goto L1f
            android.view.View r2 = r3.itemView
            if (r0 != r2) goto L12
            return
        L12:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L1d
            android.view.View r0 = (android.view.View) r0
            goto La
        L1d:
            r0 = r1
            goto La
        L1f:
            r3.mNestedRecyclerView = r1
        L21:
            return
    }

    private void createLayoutManager(android.content.Context r8, java.lang.String r9, android.util.AttributeSet r10, int r11, int r12) {
            r7 = this;
            java.lang.String r0 = ": Could not instantiate the LayoutManager: "
            if (r9 == 0) goto L11d
            java.lang.String r9 = r9.trim()
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L11d
            java.lang.String r9 = r7.getFullClassName(r8, r9)
            boolean r1 = r7.isInEditMode()     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            if (r1 == 0) goto L21
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            goto L25
        L21:
            java.lang.ClassLoader r1 = r8.getClassLoader()     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
        L25:
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r9, r2, r1)     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            java.lang.Class<androidx.recyclerview.widget.RecyclerView$LayoutManager> r3 = androidx.recyclerview.widget.RecyclerView.LayoutManager.class
            java.lang.Class r1 = r1.asSubclass(r3)     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r3 = 0
            r4 = 1
            java.lang.Class<?>[] r5 = androidx.recyclerview.widget.RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE     // Catch: java.lang.NoSuchMethodException -> L4f java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            java.lang.reflect.Constructor r5 = r1.getConstructor(r5)     // Catch: java.lang.NoSuchMethodException -> L4f java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.NoSuchMethodException -> L4f java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r6[r2] = r8     // Catch: java.lang.NoSuchMethodException -> L4f java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r6[r4] = r10     // Catch: java.lang.NoSuchMethodException -> L4f java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r8 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.NoSuchMethodException -> L4f java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r6[r8] = r11     // Catch: java.lang.NoSuchMethodException -> L4f java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r8 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.NoSuchMethodException -> L4f java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r6[r8] = r11     // Catch: java.lang.NoSuchMethodException -> L4f java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r3 = r6
            goto L56
        L4f:
            r8 = move-exception
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            java.lang.reflect.Constructor r5 = r1.getConstructor(r11)     // Catch: java.lang.NoSuchMethodException -> L64 java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
        L56:
            r5.setAccessible(r4)     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            java.lang.Object r8 = r5.newInstance(r3)     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            androidx.recyclerview.widget.RecyclerView$LayoutManager r8 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r8     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r7.setLayoutManager(r8)     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            goto L11d
        L64:
            r11 = move-exception
            r11.initCause(r8)     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r12.<init>()     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            java.lang.String r1 = r10.getPositionDescription()     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r12.append(r1)     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            java.lang.String r1 = ": Error creating LayoutManager "
            r12.append(r1)     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r12.append(r9)     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            java.lang.String r12 = r12.toString()     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            r8.<init>(r12, r11)     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
            throw r8     // Catch: java.lang.ClassCastException -> L86 java.lang.IllegalAccessException -> La5 java.lang.InstantiationException -> Lc4 java.lang.reflect.InvocationTargetException -> Le1 java.lang.ClassNotFoundException -> Lfe
        L86:
            r8 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r12.append(r10)
            java.lang.String r10 = ": Class is not a LayoutManager "
            r12.append(r10)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9, r8)
            throw r11
        La5:
            r8 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r12.append(r10)
            java.lang.String r10 = ": Cannot access non-public constructor "
            r12.append(r10)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9, r8)
            throw r11
        Lc4:
            r8 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r12.append(r10)
            r12.append(r0)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9, r8)
            throw r11
        Le1:
            r8 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r12.append(r10)
            r12.append(r0)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9, r8)
            throw r11
        Lfe:
            r8 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r12.append(r10)
            java.lang.String r10 = ": Unable to find LayoutManager "
            r12.append(r10)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9, r8)
            throw r11
        L11d:
            return
    }

    private boolean didChildRangeChange(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.mMinMaxLayoutPositions
            r4.findMinMaxChildLayoutPositions(r0)
            int[] r0 = r4.mMinMaxLayoutPositions
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != r5) goto L11
            r5 = r0[r3]
            if (r5 == r6) goto L12
        L11:
            r1 = 1
        L12:
            return r1
    }

    private void dispatchContentChangedIfNecessary() {
            r3 = this;
            int r0 = r3.mEatenAccessibilityChangeFlags
            r1 = 0
            r3.mEatenAccessibilityChangeFlags = r1
            if (r0 == 0) goto L23
            android.view.accessibility.AccessibilityManager r2 = r3.mAccessibilityManager
            if (r2 == 0) goto L12
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L12
            r1 = 1
        L12:
            if (r1 == 0) goto L23
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r2 = 2048(0x800, float:2.87E-42)
            r1.setEventType(r2)
            androidx.core.view.accessibility.AccessibilityEventCompat.setContentChangeTypes(r1, r0)
            r3.sendAccessibilityEventUnchecked(r1)
        L23:
            return
    }

    private void dispatchLayoutStep1() {
            r10 = this;
            androidx.recyclerview.widget.RecyclerView$State r0 = r10.mState
            r1 = 1
            r0.assertLayoutStep(r1)
            androidx.recyclerview.widget.RecyclerView$State r0 = r10.mState
            r10.fillRemainingScrollValues(r0)
            androidx.recyclerview.widget.RecyclerView$State r0 = r10.mState
            r2 = 0
            r0.mIsMeasuring = r2
            r10.startInterceptRequestLayout()
            androidx.recyclerview.widget.ViewInfoStore r0 = r10.mViewInfoStore
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r3 = r0.mLayoutHolderMap
            r3.clear()
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r0.mOldChangedHolders
            r0.clear()
            r10.onEnterLayoutOrScroll()
            r10.processAdapterUpdatesAndSetAnimationFlags()
            r10.saveFocusInfo()
            androidx.recyclerview.widget.RecyclerView$State r0 = r10.mState
            boolean r3 = r0.mRunSimpleAnimations
            if (r3 == 0) goto L34
            boolean r3 = r10.mItemsChanged
            if (r3 == 0) goto L34
            r3 = 1
            goto L35
        L34:
            r3 = 0
        L35:
            r0.mTrackOldChangeHolders = r3
            r10.mItemsChanged = r2
            r10.mItemsAddedOrRemoved = r2
            boolean r3 = r0.mRunPredictiveAnimations
            r0.mInPreLayout = r3
            androidx.recyclerview.widget.RecyclerView$Adapter r3 = r10.mAdapter
            int r3 = r3.getItemCount()
            r0.mItemCount = r3
            int[] r0 = r10.mMinMaxLayoutPositions
            r10.findMinMaxChildLayoutPositions(r0)
            androidx.recyclerview.widget.RecyclerView$State r0 = r10.mState
            boolean r0 = r0.mRunSimpleAnimations
            if (r0 == 0) goto Lbb
            androidx.recyclerview.widget.ChildHelper r0 = r10.mChildHelper
            int r0 = r0.getChildCount()
            r3 = 0
        L59:
            if (r3 >= r0) goto Lbb
            androidx.recyclerview.widget.ChildHelper r4 = r10.mChildHelper
            android.view.View r4 = r4.getChildAt(r3)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = getChildViewHolderInt(r4)
            boolean r5 = r4.shouldIgnore()
            if (r5 != 0) goto Lb8
            boolean r5 = r4.isInvalid()
            if (r5 == 0) goto L7a
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r10.mAdapter
            boolean r5 = r5.hasStableIds()
            if (r5 != 0) goto L7a
            goto Lb8
        L7a:
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r5 = r10.mItemAnimator
            androidx.recyclerview.widget.RecyclerView$State r6 = r10.mState
            int r7 = androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(r4)
            java.util.List r8 = r4.getUnmodifiedPayloads()
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r5 = r5.recordPreLayoutInformation(r6, r4, r7, r8)
            androidx.recyclerview.widget.ViewInfoStore r6 = r10.mViewInfoStore
            r6.addToPreLayout(r4, r5)
            androidx.recyclerview.widget.RecyclerView$State r5 = r10.mState
            boolean r5 = r5.mTrackOldChangeHolders
            if (r5 == 0) goto Lb8
            boolean r5 = r4.isUpdated()
            if (r5 == 0) goto Lb8
            boolean r5 = r4.isRemoved()
            if (r5 != 0) goto Lb8
            boolean r5 = r4.shouldIgnore()
            if (r5 != 0) goto Lb8
            boolean r5 = r4.isInvalid()
            if (r5 != 0) goto Lb8
            long r5 = r10.getChangedHolderKey(r4)
            androidx.recyclerview.widget.ViewInfoStore r7 = r10.mViewInfoStore
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r7 = r7.mOldChangedHolders
            r7.put(r5, r4)
        Lb8:
            int r3 = r3 + 1
            goto L59
        Lbb:
            androidx.recyclerview.widget.RecyclerView$State r0 = r10.mState
            boolean r0 = r0.mRunPredictiveAnimations
            r3 = 2
            if (r0 == 0) goto L16c
            androidx.recyclerview.widget.ChildHelper r0 = r10.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r4 = 0
        Lc9:
            if (r4 >= r0) goto Le7
            androidx.recyclerview.widget.ChildHelper r5 = r10.mChildHelper
            android.view.View r5 = r5.getUnfilteredChildAt(r4)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = getChildViewHolderInt(r5)
            boolean r6 = r5.shouldIgnore()
            if (r6 != 0) goto Le4
            int r6 = r5.mOldPosition
            r7 = -1
            if (r6 != r7) goto Le4
            int r6 = r5.mPosition
            r5.mOldPosition = r6
        Le4:
            int r4 = r4 + 1
            goto Lc9
        Le7:
            androidx.recyclerview.widget.RecyclerView$State r0 = r10.mState
            boolean r4 = r0.mStructureChanged
            r0.mStructureChanged = r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r10.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r6 = r10.mRecycler
            r5.onLayoutChildren(r6, r0)
            androidx.recyclerview.widget.RecyclerView$State r0 = r10.mState
            r0.mStructureChanged = r4
            r0 = 0
        Lf9:
            androidx.recyclerview.widget.ChildHelper r4 = r10.mChildHelper
            int r4 = r4.getChildCount()
            if (r0 >= r4) goto L168
            androidx.recyclerview.widget.ChildHelper r4 = r10.mChildHelper
            android.view.View r4 = r4.getChildAt(r0)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = getChildViewHolderInt(r4)
            boolean r5 = r4.shouldIgnore()
            if (r5 == 0) goto L112
            goto L165
        L112:
            androidx.recyclerview.widget.ViewInfoStore r5 = r10.mViewInfoStore
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r5 = r5.mLayoutHolderMap
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r5 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r5
            if (r5 == 0) goto L126
            int r5 = r5.flags
            r5 = r5 & 4
            if (r5 == 0) goto L126
            r5 = 1
            goto L127
        L126:
            r5 = 0
        L127:
            if (r5 != 0) goto L165
            int r5 = androidx.recyclerview.widget.RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations(r4)
            r6 = 8192(0x2000, float:1.148E-41)
            boolean r6 = r4.hasAnyOfTheFlags(r6)
            if (r6 != 0) goto L137
            r5 = r5 | 4096(0x1000, float:5.74E-42)
        L137:
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r7 = r10.mItemAnimator
            androidx.recyclerview.widget.RecyclerView$State r8 = r10.mState
            java.util.List r9 = r4.getUnmodifiedPayloads()
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r5 = r7.recordPreLayoutInformation(r8, r4, r5, r9)
            if (r6 == 0) goto L149
            r10.recordAnimationInfoIfBouncedHiddenView(r4, r5)
            goto L165
        L149:
            androidx.recyclerview.widget.ViewInfoStore r6 = r10.mViewInfoStore
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r7 = r6.mLayoutHolderMap
            java.lang.Object r7 = r7.get(r4)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r7 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r7
            if (r7 != 0) goto L15e
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r7 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.obtain()
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r6 = r6.mLayoutHolderMap
            r6.put(r4, r7)
        L15e:
            int r4 = r7.flags
            r4 = r4 | r3
            r7.flags = r4
            r7.preInfo = r5
        L165:
            int r0 = r0 + 1
            goto Lf9
        L168:
            r10.clearOldPositions()
            goto L16f
        L16c:
            r10.clearOldPositions()
        L16f:
            r10.onExitLayoutOrScroll(r1)
            r10.stopInterceptRequestLayout(r2)
            androidx.recyclerview.widget.RecyclerView$State r0 = r10.mState
            r0.mLayoutStep = r3
            return
    }

    private void dispatchLayoutStep2() {
            r4 = this;
            r4.startInterceptRequestLayout()
            r4.onEnterLayoutOrScroll()
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            r1 = 6
            r0.assertLayoutStep(r1)
            androidx.recyclerview.widget.AdapterHelper r0 = r4.mAdapterHelper
            r0.consumeUpdatesInOnePass()
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r4.mAdapter
            int r1 = r1.getItemCount()
            r0.mItemCount = r1
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            r1 = 0
            r0.mDeletedInvisibleItemCountSincePreviousLayout = r1
            androidx.recyclerview.widget.RecyclerView$SavedState r0 = r4.mPendingSavedState
            if (r0 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r4.mAdapter
            boolean r0 = r0.canRestoreState()
            if (r0 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView$SavedState r0 = r4.mPendingSavedState
            android.os.Parcelable r0 = r0.mLayoutState
            if (r0 == 0) goto L37
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r4.mLayout
            r2.onRestoreInstanceState(r0)
        L37:
            r0 = 0
            r4.mPendingSavedState = r0
        L3a:
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            r0.mInPreLayout = r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r4.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r3 = r4.mRecycler
            r2.onLayoutChildren(r3, r0)
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            r0.mStructureChanged = r1
            boolean r2 = r0.mRunSimpleAnimations
            r3 = 1
            if (r2 == 0) goto L54
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r2 = r4.mItemAnimator
            if (r2 == 0) goto L54
            r2 = 1
            goto L55
        L54:
            r2 = 0
        L55:
            r0.mRunSimpleAnimations = r2
            r2 = 4
            r0.mLayoutStep = r2
            r4.onExitLayoutOrScroll(r3)
            r4.stopInterceptRequestLayout(r1)
            return
    }

    private void dispatchLayoutStep3() {
            r12 = this;
            androidx.recyclerview.widget.RecyclerView$State r0 = r12.mState
            r1 = 4
            r0.assertLayoutStep(r1)
            r12.startInterceptRequestLayout()
            r12.onEnterLayoutOrScroll()
            androidx.recyclerview.widget.RecyclerView$State r0 = r12.mState
            r1 = 1
            r0.mLayoutStep = r1
            boolean r0 = r0.mRunSimpleAnimations
            r2 = 0
            if (r0 == 0) goto L11a
            androidx.recyclerview.widget.ChildHelper r0 = r12.mChildHelper
            int r0 = r0.getChildCount()
            int r0 = r0 - r1
        L1d:
            if (r0 < 0) goto La9
            androidx.recyclerview.widget.ChildHelper r3 = r12.mChildHelper
            android.view.View r3 = r3.getChildAt(r0)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = getChildViewHolderInt(r3)
            boolean r3 = r6.shouldIgnore()
            if (r3 == 0) goto L31
            goto La5
        L31:
            long r3 = r12.getChangedHolderKey(r6)
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r5 = r12.mItemAnimator
            androidx.recyclerview.widget.RecyclerView$State r7 = r12.mState
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r5 = r5.recordPostLayoutInformation(r7, r6)
            androidx.recyclerview.widget.ViewInfoStore r7 = r12.mViewInfoStore
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r7 = r7.mOldChangedHolders
            java.lang.Object r7 = r7.get(r3)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r7 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r7
            if (r7 == 0) goto La0
            boolean r8 = r7.shouldIgnore()
            if (r8 != 0) goto La0
            androidx.recyclerview.widget.ViewInfoStore r8 = r12.mViewInfoStore
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r8 = r8.mLayoutHolderMap
            java.lang.Object r8 = r8.get(r7)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r8 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r8
            if (r8 == 0) goto L62
            int r8 = r8.flags
            r8 = r8 & r1
            if (r8 == 0) goto L62
            r9 = 1
            goto L63
        L62:
            r9 = 0
        L63:
            androidx.recyclerview.widget.ViewInfoStore r8 = r12.mViewInfoStore
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r8 = r8.mLayoutHolderMap
            java.lang.Object r8 = r8.get(r6)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r8 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r8
            if (r8 == 0) goto L76
            int r8 = r8.flags
            r8 = r8 & r1
            if (r8 == 0) goto L76
            r10 = 1
            goto L77
        L76:
            r10 = 0
        L77:
            if (r9 == 0) goto L81
            if (r7 != r6) goto L81
            androidx.recyclerview.widget.ViewInfoStore r3 = r12.mViewInfoStore
            r3.addToPostLayout(r6, r5)
            goto La5
        L81:
            androidx.recyclerview.widget.ViewInfoStore r8 = r12.mViewInfoStore
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r8 = r8.popFromPreLayout(r7)
            androidx.recyclerview.widget.ViewInfoStore r11 = r12.mViewInfoStore
            r11.addToPostLayout(r6, r5)
            androidx.recyclerview.widget.ViewInfoStore r5 = r12.mViewInfoStore
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r11 = r5.popFromPostLayout(r6)
            if (r8 != 0) goto L98
            r12.handleMissingPreInfoForChangeError(r3, r6, r7)
            goto La5
        L98:
            r4 = r12
            r5 = r7
            r7 = r8
            r8 = r11
            r4.animateChange(r5, r6, r7, r8, r9, r10)
            goto La5
        La0:
            androidx.recyclerview.widget.ViewInfoStore r3 = r12.mViewInfoStore
            r3.addToPostLayout(r6, r5)
        La5:
            int r0 = r0 + (-1)
            goto L1d
        La9:
            androidx.recyclerview.widget.ViewInfoStore r0 = r12.mViewInfoStore
            androidx.recyclerview.widget.ViewInfoStore$ProcessCallback r3 = r12.mViewInfoProcessCallback
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r4 = r0.mLayoutHolderMap
            int r4 = r4.size()
        Lb3:
            int r4 = r4 + (-1)
            if (r4 < 0) goto L11a
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r5 = r0.mLayoutHolderMap
            java.lang.Object r5 = r5.keyAt(r4)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r5
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r6 = r0.mLayoutHolderMap
            java.lang.Object r6 = r6.removeAt(r4)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r6 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r6
            int r7 = r6.flags
            r8 = r7 & 3
            r9 = 3
            if (r8 != r9) goto Ld2
            r3.unused(r5)
            goto L116
        Ld2:
            r8 = r7 & 1
            if (r8 == 0) goto Le4
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r7 = r6.preInfo
            if (r7 != 0) goto Lde
            r3.unused(r5)
            goto L116
        Lde:
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r8 = r6.postInfo
            r3.processDisappeared(r5, r7, r8)
            goto L116
        Le4:
            r8 = r7 & 14
            r9 = 14
            if (r8 != r9) goto Lf2
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r7 = r6.preInfo
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r8 = r6.postInfo
            r3.processAppeared(r5, r7, r8)
            goto L116
        Lf2:
            r8 = r7 & 12
            r9 = 12
            if (r8 != r9) goto L100
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r7 = r6.preInfo
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r8 = r6.postInfo
            r3.processPersistent(r5, r7, r8)
            goto L116
        L100:
            r8 = r7 & 4
            if (r8 == 0) goto L10b
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r7 = r6.preInfo
            r8 = 0
            r3.processDisappeared(r5, r7, r8)
            goto L116
        L10b:
            r7 = r7 & 8
            if (r7 == 0) goto L116
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r7 = r6.preInfo
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r8 = r6.postInfo
            r3.processAppeared(r5, r7, r8)
        L116:
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.recycle(r6)
            goto Lb3
        L11a:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r12.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r3 = r12.mRecycler
            r0.removeAndRecycleScrapInt(r3)
            androidx.recyclerview.widget.RecyclerView$State r0 = r12.mState
            int r3 = r0.mItemCount
            r0.mPreviousLayoutItemCount = r3
            r12.mDataSetHasChangedAfterLayout = r2
            r12.mDispatchItemsChangedEvent = r2
            r0.mRunSimpleAnimations = r2
            r0.mRunPredictiveAnimations = r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r12.mLayout
            r0.mRequestedSimpleAnimations = r2
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r12.mRecycler
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r0.mChangedScrap
            if (r0 == 0) goto L13c
            r0.clear()
        L13c:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r12.mLayout
            boolean r3 = r0.mPrefetchMaxObservedInInitialPrefetch
            if (r3 == 0) goto L14b
            r0.mPrefetchMaxCountObserved = r2
            r0.mPrefetchMaxObservedInInitialPrefetch = r2
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r12.mRecycler
            r0.updateViewCacheSize()
        L14b:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r12.mLayout
            androidx.recyclerview.widget.RecyclerView$State r3 = r12.mState
            r0.onLayoutCompleted(r3)
            r12.onExitLayoutOrScroll(r1)
            r12.stopInterceptRequestLayout(r2)
            androidx.recyclerview.widget.ViewInfoStore r0 = r12.mViewInfoStore
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r3 = r0.mLayoutHolderMap
            r3.clear()
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r0.mOldChangedHolders
            r0.clear()
            int[] r0 = r12.mMinMaxLayoutPositions
            r3 = r0[r2]
            r0 = r0[r1]
            boolean r0 = r12.didChildRangeChange(r3, r0)
            if (r0 == 0) goto L173
            r12.dispatchOnScrolled(r2, r2)
        L173:
            r12.recoverFocusFromState()
            r12.resetFocusInfo()
            return
    }

    private boolean dispatchToOnItemTouchListeners(android.view.MotionEvent r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$OnItemTouchListener r0 = r2.mInterceptingOnItemTouchListener
            if (r0 != 0) goto L11
            int r0 = r3.getAction()
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            boolean r3 = r2.findInterceptingOnItemTouchListener(r3)
            return r3
        L11:
            r0.onTouchEvent(r2, r3)
            int r3 = r3.getAction()
            r0 = 3
            r1 = 1
            if (r3 == r0) goto L1e
            if (r3 != r1) goto L21
        L1e:
            r3 = 0
            r2.mInterceptingOnItemTouchListener = r3
        L21:
            return r1
    }

    private boolean findInterceptingOnItemTouchListener(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getAction()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$OnItemTouchListener> r1 = r6.mOnItemTouchListeners
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L26
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$OnItemTouchListener> r4 = r6.mOnItemTouchListeners
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.RecyclerView$OnItemTouchListener r4 = (androidx.recyclerview.widget.RecyclerView.OnItemTouchListener) r4
            boolean r5 = r4.onInterceptTouchEvent(r6, r7)
            if (r5 == 0) goto L23
            r5 = 3
            if (r0 == r5) goto L23
            r6.mInterceptingOnItemTouchListener = r4
            r7 = 1
            return r7
        L23:
            int r3 = r3 + 1
            goto Lc
        L26:
            return r2
    }

    private void findMinMaxChildLayoutPositions(int[] r9) {
            r8 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r8.mChildHelper
            int r0 = r0.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = -1
            r9[r2] = r0
            r9[r1] = r0
            return
        L10:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
        L16:
            if (r5 >= r0) goto L36
            androidx.recyclerview.widget.ChildHelper r6 = r8.mChildHelper
            android.view.View r6 = r6.getChildAt(r5)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = getChildViewHolderInt(r6)
            boolean r7 = r6.shouldIgnore()
            if (r7 == 0) goto L29
            goto L33
        L29:
            int r6 = r6.getLayoutPosition()
            if (r6 >= r3) goto L30
            r3 = r6
        L30:
            if (r6 <= r4) goto L33
            r4 = r6
        L33:
            int r5 = r5 + 1
            goto L16
        L36:
            r9[r2] = r3
            r9[r1] = r4
            return
    }

    @androidx.annotation.Nullable
    public static androidx.recyclerview.widget.RecyclerView findNestedRecyclerView(@androidx.annotation.NonNull android.view.View r4) {
            boolean r0 = r4 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r4 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto Ld
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            return r4
        Ld:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = 0
        L14:
            if (r2 >= r0) goto L24
            android.view.View r3 = r4.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView r3 = findNestedRecyclerView(r3)
            if (r3 == 0) goto L21
            return r3
        L21:
            int r2 = r2 + 1
            goto L14
        L24:
            return r1
    }

    @androidx.annotation.Nullable
    private android.view.View findNextViewToFocus() {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$State r0 = r5.mState
            int r1 = r0.mFocusedItemPosition
            r2 = -1
            if (r1 == r2) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            int r0 = r0.getItemCount()
            r2 = r1
        Le:
            if (r2 >= r0) goto L25
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r5.findViewHolderForAdapterPosition(r2)
            if (r3 != 0) goto L17
            goto L25
        L17:
            android.view.View r4 = r3.itemView
            boolean r4 = r4.hasFocusable()
            if (r4 == 0) goto L22
            android.view.View r0 = r3.itemView
            return r0
        L22:
            int r2 = r2 + 1
            goto Le
        L25:
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 + (-1)
        L2b:
            r1 = 0
            if (r0 < 0) goto L43
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r5.findViewHolderForAdapterPosition(r0)
            if (r2 != 0) goto L35
            return r1
        L35:
            android.view.View r1 = r2.itemView
            boolean r1 = r1.hasFocusable()
            if (r1 == 0) goto L40
            android.view.View r0 = r2.itemView
            return r0
        L40:
            int r0 = r0 + (-1)
            goto L2b
        L43:
            return r1
    }

    public static androidx.recyclerview.widget.RecyclerView.ViewHolder getChildViewHolderInt(android.view.View r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.mViewHolder
            return r0
    }

    public static void getDecoratedBoundsWithMarginsInt(android.view.View r6, android.graphics.Rect r7) {
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            android.graphics.Rect r1 = r0.mDecorInsets
            int r2 = r6.getLeft()
            int r3 = r1.left
            int r2 = r2 - r3
            int r3 = r0.leftMargin
            int r2 = r2 - r3
            int r3 = r6.getTop()
            int r4 = r1.top
            int r3 = r3 - r4
            int r4 = r0.topMargin
            int r3 = r3 - r4
            int r4 = r6.getRight()
            int r5 = r1.right
            int r4 = r4 + r5
            int r5 = r0.rightMargin
            int r4 = r4 + r5
            int r6 = r6.getBottom()
            int r1 = r1.bottom
            int r6 = r6 + r1
            int r0 = r0.bottomMargin
            int r6 = r6 + r0
            r7.set(r2, r3, r4, r6)
            return
    }

    private int getDeepestFocusedViewWithId(android.view.View r4) {
            r3 = this;
            int r0 = r4.getId()
        L4:
            boolean r1 = r4.isFocused()
            if (r1 != 0) goto L26
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L26
            boolean r1 = r4.hasFocus()
            if (r1 == 0) goto L26
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r4 = r4.getFocusedChild()
            int r1 = r4.getId()
            r2 = -1
            if (r1 == r2) goto L4
            int r0 = r4.getId()
            goto L4
        L26:
            return r0
    }

    private java.lang.String getFullClassName(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            char r0 = r4.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.getPackageName()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L1d:
            java.lang.String r3 = "."
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L26
            return r4
        L26:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r0 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r0 = r0.getPackage()
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private androidx.core.view.NestedScrollingChildHelper getScrollingChildHelper() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mScrollingChildHelper
            if (r0 != 0) goto Lb
            androidx.core.view.NestedScrollingChildHelper r0 = new androidx.core.view.NestedScrollingChildHelper
            r0.<init>(r1)
            r1.mScrollingChildHelper = r0
        Lb:
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mScrollingChildHelper
            return r0
    }

    private void handleMissingPreInfoForChangeError(long r7, androidx.recyclerview.widget.RecyclerView.ViewHolder r9, androidx.recyclerview.widget.RecyclerView.ViewHolder r10) {
            r6 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r6.mChildHelper
            int r0 = r0.getChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L67
            androidx.recyclerview.widget.ChildHelper r2 = r6.mChildHelper
            android.view.View r2 = r2.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = getChildViewHolderInt(r2)
            if (r2 != r9) goto L16
            goto L64
        L16:
            long r3 = r6.getChangedHolderKey(r2)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L64
            androidx.recyclerview.widget.RecyclerView$Adapter r7 = r6.mAdapter
            java.lang.String r8 = " \n View Holder 2:"
            if (r7 == 0) goto L47
            boolean r7 = r7.hasStableIds()
            if (r7 == 0) goto L47
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r10.append(r0)
            r10.append(r2)
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r10)
            r7.<init>(r8)
            throw r7
        L47:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r10.append(r0)
            r10.append(r2)
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r10)
            r7.<init>(r8)
            throw r7
        L64:
            int r1 = r1 + 1
            goto L7
        L67:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r7.append(r8)
            r7.append(r10)
            java.lang.String r8 = " cannot be found but it is necessary for "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r8 = r6.exceptionLabel()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "RecyclerView"
            android.util.Log.e(r8, r7)
            return
    }

    private boolean hasUpdatedView() {
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.getChildCount()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L28
            androidx.recyclerview.widget.ChildHelper r3 = r5.mChildHelper
            android.view.View r3 = r3.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L25
            boolean r4 = r3.shouldIgnore()
            if (r4 == 0) goto L1d
            goto L25
        L1d:
            boolean r3 = r3.isUpdated()
            if (r3 == 0) goto L25
            r0 = 1
            return r0
        L25:
            int r2 = r2 + 1
            goto L8
        L28:
            return r1
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    private void initAutofill() {
            r1 = this;
            int r0 = androidx.core.view.ViewCompat.getImportantForAutofill(r1)
            if (r0 != 0) goto Lb
            r0 = 8
            androidx.core.view.ViewCompat.setImportantForAutofill(r1, r0)
        Lb:
            return
    }

    private void initChildrenHelper() {
            r2 = this;
            androidx.recyclerview.widget.ChildHelper r0 = new androidx.recyclerview.widget.ChildHelper
            androidx.recyclerview.widget.RecyclerView$5 r1 = new androidx.recyclerview.widget.RecyclerView$5
            r1.<init>(r2)
            r0.<init>(r1)
            r2.mChildHelper = r0
            return
    }

    private boolean isPreferredNextFocus(android.view.View r10, android.view.View r11, int r12) {
            r9 = this;
            r0 = 0
            if (r11 == 0) goto Ldb
            if (r11 == r9) goto Ldb
            if (r11 != r10) goto L9
            goto Ldb
        L9:
            android.view.View r1 = r9.findContainingItemView(r11)
            if (r1 != 0) goto L10
            return r0
        L10:
            r1 = 1
            if (r10 != 0) goto L14
            return r1
        L14:
            android.view.View r2 = r9.findContainingItemView(r10)
            if (r2 != 0) goto L1b
            return r1
        L1b:
            android.graphics.Rect r2 = r9.mTempRect
            int r3 = r10.getWidth()
            int r4 = r10.getHeight()
            r2.set(r0, r0, r3, r4)
            android.graphics.Rect r2 = r9.mTempRect2
            int r3 = r11.getWidth()
            int r4 = r11.getHeight()
            r2.set(r0, r0, r3, r4)
            android.graphics.Rect r2 = r9.mTempRect
            r9.offsetDescendantRectToMyCoords(r10, r2)
            android.graphics.Rect r10 = r9.mTempRect2
            r9.offsetDescendantRectToMyCoords(r11, r10)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r9.mLayout
            int r10 = r10.getLayoutDirection()
            r11 = -1
            if (r10 != r1) goto L4a
            r10 = -1
            goto L4b
        L4a:
            r10 = 1
        L4b:
            android.graphics.Rect r2 = r9.mTempRect
            int r3 = r2.left
            android.graphics.Rect r4 = r9.mTempRect2
            int r5 = r4.left
            if (r3 < r5) goto L59
            int r6 = r2.right
            if (r6 > r5) goto L61
        L59:
            int r6 = r2.right
            int r7 = r4.right
            if (r6 >= r7) goto L61
            r3 = 1
            goto L6e
        L61:
            int r6 = r2.right
            int r7 = r4.right
            if (r6 > r7) goto L69
            if (r3 < r7) goto L6d
        L69:
            if (r3 <= r5) goto L6d
            r3 = -1
            goto L6e
        L6d:
            r3 = 0
        L6e:
            int r5 = r2.top
            int r6 = r4.top
            if (r5 < r6) goto L78
            int r7 = r2.bottom
            if (r7 > r6) goto L80
        L78:
            int r7 = r2.bottom
            int r8 = r4.bottom
            if (r7 >= r8) goto L80
            r11 = 1
            goto L8c
        L80:
            int r2 = r2.bottom
            int r4 = r4.bottom
            if (r2 > r4) goto L88
            if (r5 < r4) goto L8b
        L88:
            if (r5 <= r6) goto L8b
            goto L8c
        L8b:
            r11 = 0
        L8c:
            if (r12 == r1) goto Ld2
            r1 = 2
            if (r12 == r1) goto Lc8
            r10 = 17
            if (r12 == r10) goto Lc4
            r10 = 33
            if (r12 == r10) goto Lc0
            r10 = 66
            if (r12 == r10) goto Lbc
            r10 = 130(0x82, float:1.82E-43)
            if (r12 != r10) goto La5
            if (r11 <= 0) goto La4
            r0 = 1
        La4:
            return r0
        La5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Invalid direction: "
            r11.append(r0)
            r11.append(r12)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r11)
            r10.<init>(r11)
            throw r10
        Lbc:
            if (r3 <= 0) goto Lbf
            r0 = 1
        Lbf:
            return r0
        Lc0:
            if (r11 >= 0) goto Lc3
            r0 = 1
        Lc3:
            return r0
        Lc4:
            if (r3 >= 0) goto Lc7
            r0 = 1
        Lc7:
            return r0
        Lc8:
            if (r11 > 0) goto Ld0
            if (r11 != 0) goto Ld1
            int r3 = r3 * r10
            if (r3 <= 0) goto Ld1
        Ld0:
            r0 = 1
        Ld1:
            return r0
        Ld2:
            if (r11 < 0) goto Lda
            if (r11 != 0) goto Ldb
            int r3 = r3 * r10
            if (r3 >= 0) goto Ldb
        Lda:
            r0 = 1
        Ldb:
            return r0
    }

    private void nestedScrollByInternal(int r12, int r13, @androidx.annotation.Nullable android.view.MotionEvent r14, int r15) {
            r11 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r11.mLayout
            if (r0 != 0) goto Lc
            java.lang.String r12 = "RecyclerView"
            java.lang.String r13 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r12, r13)
            return
        Lc:
            boolean r1 = r11.mLayoutSuppressed
            if (r1 == 0) goto L11
            return
        L11:
            int[] r1 = r11.mReusableIntPair
            r2 = 0
            r1[r2] = r2
            r3 = 1
            r1[r3] = r2
            boolean r0 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r11.mLayout
            boolean r1 = r1.canScrollVertically()
            if (r1 == 0) goto L28
            r4 = r0 | 2
            goto L29
        L28:
            r4 = r0
        L29:
            r11.startNestedScroll(r4, r15)
            if (r0 == 0) goto L30
            r6 = r12
            goto L31
        L30:
            r6 = 0
        L31:
            if (r1 == 0) goto L35
            r7 = r13
            goto L36
        L35:
            r7 = 0
        L36:
            int[] r8 = r11.mReusableIntPair
            int[] r9 = r11.mScrollOffset
            r5 = r11
            r10 = r15
            boolean r4 = r5.dispatchNestedPreScroll(r6, r7, r8, r9, r10)
            if (r4 == 0) goto L4a
            int[] r4 = r11.mReusableIntPair
            r5 = r4[r2]
            int r12 = r12 - r5
            r3 = r4[r3]
            int r13 = r13 - r3
        L4a:
            if (r0 == 0) goto L4e
            r0 = r12
            goto L4f
        L4e:
            r0 = 0
        L4f:
            if (r1 == 0) goto L52
            r2 = r13
        L52:
            r11.scrollByInternal(r0, r2, r14, r15)
            androidx.recyclerview.widget.GapWorker r14 = r11.mGapWorker
            if (r14 == 0) goto L60
            if (r12 != 0) goto L5d
            if (r13 == 0) goto L60
        L5d:
            r14.postFromTraversal(r11, r12, r13)
        L60:
            r11.stopNestedScroll(r15)
            return
    }

    private void onPointerUp(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.mScrollPointerId
            if (r1 != r2) goto L2d
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            int r1 = r4.getPointerId(r0)
            r3.mScrollPointerId = r1
            float r1 = r4.getX(r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.mLastTouchX = r1
            r3.mInitialTouchX = r1
            float r4 = r4.getY(r0)
            float r4 = r4 + r2
            int r4 = (int) r4
            r3.mLastTouchY = r4
            r3.mInitialTouchY = r4
        L2d:
            return
    }

    private boolean predictiveItemAnimationsEnabled() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r1.mItemAnimator
            if (r0 == 0) goto Le
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            boolean r0 = r0.supportsPredictiveItemAnimations()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
            r6 = this;
            boolean r0 = r6.mDataSetHasChangedAfterLayout
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.AdapterHelper r0 = r6.mAdapterHelper
            r0.reset()
            boolean r0 = r6.mDispatchItemsChangedEvent
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r6.mLayout
            r0.onItemsChanged(r6)
        L12:
            boolean r0 = r6.predictiveItemAnimationsEnabled()
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.AdapterHelper r0 = r6.mAdapterHelper
            r0.preProcess()
            goto L23
        L1e:
            androidx.recyclerview.widget.AdapterHelper r0 = r6.mAdapterHelper
            r0.consumeUpdatesInOnePass()
        L23:
            boolean r0 = r6.mItemsAddedOrRemoved
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L30
            boolean r0 = r6.mItemsChanged
            if (r0 == 0) goto L2e
            goto L30
        L2e:
            r0 = 0
            goto L31
        L30:
            r0 = 1
        L31:
            androidx.recyclerview.widget.RecyclerView$State r3 = r6.mState
            boolean r4 = r6.mFirstLayoutComplete
            if (r4 == 0) goto L53
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r4 = r6.mItemAnimator
            if (r4 == 0) goto L53
            boolean r4 = r6.mDataSetHasChangedAfterLayout
            if (r4 != 0) goto L47
            if (r0 != 0) goto L47
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r6.mLayout
            boolean r5 = r5.mRequestedSimpleAnimations
            if (r5 == 0) goto L53
        L47:
            if (r4 == 0) goto L51
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = r6.mAdapter
            boolean r4 = r4.hasStableIds()
            if (r4 == 0) goto L53
        L51:
            r4 = 1
            goto L54
        L53:
            r4 = 0
        L54:
            r3.mRunSimpleAnimations = r4
            androidx.recyclerview.widget.RecyclerView$State r3 = r6.mState
            boolean r4 = r3.mRunSimpleAnimations
            if (r4 == 0) goto L69
            if (r0 == 0) goto L69
            boolean r0 = r6.mDataSetHasChangedAfterLayout
            if (r0 != 0) goto L69
            boolean r0 = r6.predictiveItemAnimationsEnabled()
            if (r0 == 0) goto L69
            r1 = 1
        L69:
            r3.mRunPredictiveAnimations = r1
            return
    }

    private void pullGlows(float r7, float r8, float r9, float r10) {
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.EdgeEffectCompat.onPull(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.EdgeEffectCompat.onPull(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.EdgeEffectCompat.onPull(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.EdgeEffectCompat.onPull(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r6)
        L7f:
            return
    }

    private void recoverFocusFromState() {
            r7 = this;
            boolean r0 = r7.mPreserveFocusAfterLayout
            if (r0 == 0) goto Lb1
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.mAdapter
            if (r0 == 0) goto Lb1
            boolean r0 = r7.hasFocus()
            if (r0 == 0) goto Lb1
            int r0 = r7.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto Lb1
            int r0 = r7.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L26
            boolean r0 = r7.isFocused()
            if (r0 == 0) goto L26
            goto Lb1
        L26:
            boolean r0 = r7.isFocused()
            if (r0 != 0) goto L55
            android.view.View r0 = r7.getFocusedChild()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD
            if (r1 == 0) goto L4c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L40
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L4c
        L40:
            androidx.recyclerview.widget.ChildHelper r0 = r7.mChildHelper
            int r0 = r0.getChildCount()
            if (r0 != 0) goto L55
            r7.requestFocus()
            return
        L4c:
            androidx.recyclerview.widget.ChildHelper r1 = r7.mChildHelper
            boolean r0 = r1.isHidden(r0)
            if (r0 != 0) goto L55
            return
        L55:
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            long r0 = r0.mFocusedItemId
            r2 = -1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L71
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.mAdapter
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L71
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            long r0 = r0.mFocusedItemId
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r7.findViewHolderForItemId(r0)
            goto L72
        L71:
            r0 = r4
        L72:
            if (r0 == 0) goto L8a
            androidx.recyclerview.widget.ChildHelper r1 = r7.mChildHelper
            android.view.View r5 = r0.itemView
            boolean r1 = r1.isHidden(r5)
            if (r1 != 0) goto L8a
            android.view.View r1 = r0.itemView
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L87
            goto L8a
        L87:
            android.view.View r4 = r0.itemView
            goto L96
        L8a:
            androidx.recyclerview.widget.ChildHelper r0 = r7.mChildHelper
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L96
            android.view.View r4 = r7.findNextViewToFocus()
        L96:
            if (r4 == 0) goto Lb1
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            int r0 = r0.mFocusedSubChildId
            long r5 = (long) r0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto Lae
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto Lae
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto Lae
            r4 = r0
        Lae:
            r4.requestFocus()
        Lb1:
            return
    }

    private void releaseGlows() {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            if (r0 == 0) goto Le
            r0.onRelease()
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            boolean r0 = r0.isFinished()
            goto Lf
        Le:
            r0 = 0
        Lf:
            android.widget.EdgeEffect r1 = r2.mTopGlow
            if (r1 == 0) goto L1d
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.mTopGlow
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L1d:
            android.widget.EdgeEffect r1 = r2.mRightGlow
            if (r1 == 0) goto L2b
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.mRightGlow
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L2b:
            android.widget.EdgeEffect r1 = r2.mBottomGlow
            if (r1 == 0) goto L39
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.mBottomGlow
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L39:
            if (r0 == 0) goto L3e
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        L3e:
            return
    }

    private void requestChildOnScreen(@androidx.annotation.NonNull android.view.View r12, @androidx.annotation.Nullable android.view.View r13) {
            r11 = this;
            if (r13 == 0) goto L4
            r0 = r13
            goto L5
        L4:
            r0 = r12
        L5:
            android.graphics.Rect r1 = r11.mTempRect
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r4 = 0
            r1.set(r4, r4, r2, r3)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams
            if (r1 == 0) goto L41
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            boolean r1 = r0.mInsetsDirty
            if (r1 != 0) goto L41
            android.graphics.Rect r0 = r0.mDecorInsets
            android.graphics.Rect r1 = r11.mTempRect
            int r2 = r1.left
            int r3 = r0.left
            int r2 = r2 - r3
            r1.left = r2
            int r2 = r1.right
            int r3 = r0.right
            int r2 = r2 + r3
            r1.right = r2
            int r2 = r1.top
            int r3 = r0.top
            int r2 = r2 - r3
            r1.top = r2
            int r2 = r1.bottom
            int r0 = r0.bottom
            int r2 = r2 + r0
            r1.bottom = r2
        L41:
            if (r13 == 0) goto L4d
            android.graphics.Rect r0 = r11.mTempRect
            r11.offsetDescendantRectToMyCoords(r13, r0)
            android.graphics.Rect r0 = r11.mTempRect
            r11.offsetRectIntoDescendantCoords(r12, r0)
        L4d:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r11.mLayout
            android.graphics.Rect r8 = r11.mTempRect
            boolean r0 = r11.mFirstLayoutComplete
            r1 = 1
            r9 = r0 ^ 1
            if (r13 != 0) goto L5a
            r10 = 1
            goto L5b
        L5a:
            r10 = 0
        L5b:
            r6 = r11
            r7 = r12
            r5.requestChildRectangleOnScreen(r6, r7, r8, r9, r10)
            return
    }

    private void resetFocusInfo() {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$State r0 = r3.mState
            r1 = -1
            r0.mFocusedItemId = r1
            r1 = -1
            r0.mFocusedItemPosition = r1
            r0.mFocusedSubChildId = r1
            return
    }

    private void resetScroll() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            r1.stopNestedScroll(r0)
            r1.releaseGlows()
            return
    }

    private void saveFocusInfo() {
            r4 = this;
            boolean r0 = r4.mPreserveFocusAfterLayout
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r4.hasFocus()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r4.mAdapter
            if (r0 == 0) goto L14
            android.view.View r0 = r4.getFocusedChild()
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 != 0) goto L18
            goto L1c
        L18:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r4.findContainingViewHolder(r0)
        L1c:
            if (r1 != 0) goto L22
            r4.resetFocusInfo()
            goto L56
        L22:
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r4.mAdapter
            boolean r2 = r2.hasStableIds()
            if (r2 == 0) goto L31
            long r2 = r1.getItemId()
            goto L33
        L31:
            r2 = -1
        L33:
            r0.mFocusedItemId = r2
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            boolean r2 = r4.mDataSetHasChangedAfterLayout
            if (r2 == 0) goto L3d
            r2 = -1
            goto L4a
        L3d:
            boolean r2 = r1.isRemoved()
            if (r2 == 0) goto L46
            int r2 = r1.mOldPosition
            goto L4a
        L46:
            int r2 = r1.getAbsoluteAdapterPosition()
        L4a:
            r0.mFocusedItemPosition = r2
            androidx.recyclerview.widget.RecyclerView$State r0 = r4.mState
            android.view.View r1 = r1.itemView
            int r1 = r4.getDeepestFocusedViewWithId(r1)
            r0.mFocusedSubChildId = r1
        L56:
            return
    }

    private void setAdapterInternal(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r3, boolean r4, boolean r5) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.mAdapter
            if (r0 == 0) goto Le
            androidx.recyclerview.widget.RecyclerView$RecyclerViewDataObserver r1 = r2.mObserver
            r0.unregisterAdapterDataObserver(r1)
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.mAdapter
            r0.onDetachedFromRecyclerView(r2)
        Le:
            if (r4 == 0) goto L12
            if (r5 == 0) goto L15
        L12:
            r2.removeAndRecycleViews()
        L15:
            androidx.recyclerview.widget.AdapterHelper r5 = r2.mAdapterHelper
            r5.reset()
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r2.mAdapter
            r2.mAdapter = r3
            if (r3 == 0) goto L28
            androidx.recyclerview.widget.RecyclerView$RecyclerViewDataObserver r0 = r2.mObserver
            r3.registerAdapterDataObserver(r0)
            r3.onAttachedToRecyclerView(r2)
        L28:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r2.mLayout
            if (r3 == 0) goto L31
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.mAdapter
            r3.onAdapterChanged(r5, r0)
        L31:
            androidx.recyclerview.widget.RecyclerView$Recycler r3 = r2.mRecycler
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.mAdapter
            r3.clear()
            androidx.recyclerview.widget.RecyclerView$RecycledViewPool r3 = r3.getRecycledViewPool()
            r3.onAdapterChanged(r5, r0, r4)
            androidx.recyclerview.widget.RecyclerView$State r3 = r2.mState
            r4 = 1
            r3.mStructureChanged = r4
            return
    }

    private void stopScrollersInternal() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ViewFlinger r0 = r1.mViewFlinger
            r0.stop()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            if (r0 == 0) goto L10
            androidx.recyclerview.widget.RecyclerView$SmoothScroller r0 = r0.mSmoothScroller
            if (r0 == 0) goto L10
            r0.stop()
        L10:
            return
    }

    public final void absorbGlows(int r3, int r4) {
            r2 = this;
            if (r3 >= 0) goto L14
            r2.ensureLeftGlow()
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L26
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            int r1 = -r3
            r0.onAbsorb(r1)
            goto L26
        L14:
            if (r3 <= 0) goto L26
            r2.ensureRightGlow()
            android.widget.EdgeEffect r0 = r2.mRightGlow
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L26
            android.widget.EdgeEffect r0 = r2.mRightGlow
            r0.onAbsorb(r3)
        L26:
            if (r4 >= 0) goto L3a
            r2.ensureTopGlow()
            android.widget.EdgeEffect r0 = r2.mTopGlow
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L4c
            android.widget.EdgeEffect r0 = r2.mTopGlow
            int r1 = -r4
            r0.onAbsorb(r1)
            goto L4c
        L3a:
            if (r4 <= 0) goto L4c
            r2.ensureBottomGlow()
            android.widget.EdgeEffect r0 = r2.mBottomGlow
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L4c
            android.widget.EdgeEffect r0 = r2.mBottomGlow
            r0.onAbsorb(r4)
        L4c:
            if (r3 != 0) goto L50
            if (r4 == 0) goto L53
        L50:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        L53:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r2, int r3, int r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            if (r0 == 0) goto La
            boolean r0 = r0.onAddFocusables(r1, r2, r3, r4)
            if (r0 != 0) goto Ld
        La:
            super.addFocusables(r2, r3, r4)
        Ld:
            return
    }

    public void addItemDecoration(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemDecoration r2) {
            r1 = this;
            r0 = -1
            r1.addItemDecoration(r2, r0)
            return
    }

    public void addItemDecoration(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemDecoration r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L9
            java.lang.String r1 = "Cannot add item decoration during a scroll  or layout"
            r0.assertNotInLayoutOrScroll(r1)
        L9:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r2.mItemDecorations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            r0 = 0
            r2.setWillNotDraw(r0)
        L15:
            if (r4 >= 0) goto L1d
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r4 = r2.mItemDecorations
            r4.add(r3)
            goto L22
        L1d:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r2.mItemDecorations
            r0.add(r4, r3)
        L22:
            r2.markItemDecorInsetsDirty()
            r2.requestLayout()
            return
    }

    public void addOnChildAttachStateChangeListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r0 = r1.mOnChildAttachStateListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnChildAttachStateListeners = r0
        Lb:
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r0 = r1.mOnChildAttachStateListeners
            r0.add(r2)
            return
    }

    public void addOnItemTouchListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OnItemTouchListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$OnItemTouchListener> r0 = r1.mOnItemTouchListeners
            r0.add(r2)
            return
    }

    public void addOnScrollListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OnScrollListener r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r0 = r1.mScrollListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mScrollListeners = r0
        Lb:
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r0 = r1.mScrollListeners
            r0.add(r2)
            return
    }

    public void addRecyclerListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.RecyclerListener r3) {
            r2 = this;
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "'listener' arg cannot be null."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            java.util.List<androidx.recyclerview.widget.RecyclerView$RecyclerListener> r0 = r2.mRecyclerListeners
            r0.add(r3)
            return
    }

    public final void animateDisappearance(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r4) {
            r1 = this;
            r1.addAnimatingView(r2)
            r0 = 0
            r2.setIsRecyclable(r0)
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r1.mItemAnimator
            boolean r2 = r0.animateDisappearance(r2, r3, r4)
            if (r2 == 0) goto L12
            r1.postAnimationRunner()
        L12:
            return
    }

    public final void assertNotInLayoutOrScroll(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isComputingLayout()
            if (r0 == 0) goto L1e
            if (r3 != 0) goto L18
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call this method while RecyclerView is computing a layout or scrolling"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
            r3.<init>(r0)
            throw r3
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L1e:
            int r3 = r2.mDispatchScrollCounter
            if (r3 <= 0) goto L38
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
            r3.<init>(r0)
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame."
            android.util.Log.w(r0, r1, r3)
        L38:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams
            if (r0 == 0) goto L10
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r2
            boolean r2 = r0.checkLayoutParams(r2)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    public final void clearOldPositions() {
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L20
            androidx.recyclerview.widget.ChildHelper r3 = r5.mChildHelper
            android.view.View r3 = r3.getUnfilteredChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            boolean r4 = r3.shouldIgnore()
            if (r4 != 0) goto L1d
            r3.clearOldPosition()
        L1d:
            int r2 = r2 + 1
            goto L8
        L20:
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r5.mRecycler
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r0.mCachedViews
            int r2 = r2.size()
            r3 = 0
        L29:
            if (r3 >= r2) goto L39
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r4 = r0.mCachedViews
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r4
            r4.clearOldPosition()
            int r3 = r3 + 1
            goto L29
        L39:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r0.mAttachedScrap
            int r2 = r2.size()
            r3 = 0
        L40:
            if (r3 >= r2) goto L50
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r4 = r0.mAttachedScrap
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r4
            r4.clearOldPosition()
            int r3 = r3 + 1
            goto L40
        L50:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r0.mChangedScrap
            if (r2 == 0) goto L68
            int r2 = r2.size()
        L58:
            if (r1 >= r2) goto L68
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r0.mChangedScrap
            java.lang.Object r3 = r3.get(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r3
            r3.clearOldPosition()
            int r1 = r1 + 1
            goto L58
        L68:
            return
    }

    public void clearOnChildAttachStateChangeListeners() {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r0 = r1.mOnChildAttachStateListeners
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    public void clearOnScrollListeners() {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r0 = r1.mScrollListeners
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            int r1 = r0.computeHorizontalScrollExtent(r1)
        L14:
            return r1
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            int r1 = r0.computeHorizontalScrollOffset(r1)
        L14:
            return r1
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            int r1 = r0.computeHorizontalScrollRange(r1)
        L14:
            return r1
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            int r1 = r0.computeVerticalScrollExtent(r1)
        L14:
            return r1
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            int r1 = r0.computeVerticalScrollOffset(r1)
        L14:
            return r1
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            int r1 = r0.computeVerticalScrollRange(r1)
        L14:
            return r1
    }

    public final void considerReleasingGlowsOnScroll(int r3, int r4) {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            if (r0 == 0) goto L18
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L18
            if (r3 <= 0) goto L18
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            r0.onRelease()
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            boolean r0 = r0.isFinished()
            goto L19
        L18:
            r0 = 0
        L19:
            android.widget.EdgeEffect r1 = r2.mRightGlow
            if (r1 == 0) goto L31
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L31
            if (r3 >= 0) goto L31
            android.widget.EdgeEffect r3 = r2.mRightGlow
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.mRightGlow
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L31:
            android.widget.EdgeEffect r3 = r2.mTopGlow
            if (r3 == 0) goto L49
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L49
            if (r4 <= 0) goto L49
            android.widget.EdgeEffect r3 = r2.mTopGlow
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.mTopGlow
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L49:
            android.widget.EdgeEffect r3 = r2.mBottomGlow
            if (r3 == 0) goto L61
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L61
            if (r4 >= 0) goto L61
            android.widget.EdgeEffect r3 = r2.mBottomGlow
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.mBottomGlow
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L61:
            if (r0 == 0) goto L66
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        L66:
            return
    }

    public final void consumePendingUpdateOperations() {
            r3 = this;
            boolean r0 = r3.mFirstLayoutComplete
            java.lang.String r1 = "RV FullInvalidate"
            if (r0 == 0) goto L67
            boolean r0 = r3.mDataSetHasChangedAfterLayout
            if (r0 == 0) goto Lb
            goto L67
        Lb:
            androidx.recyclerview.widget.AdapterHelper r0 = r3.mAdapterHelper
            boolean r0 = r0.hasPendingUpdates()
            if (r0 != 0) goto L14
            return
        L14:
            androidx.recyclerview.widget.AdapterHelper r0 = r3.mAdapterHelper
            r2 = 4
            boolean r0 = r0.hasAnyUpdateTypes(r2)
            if (r0 == 0) goto L55
            androidx.recyclerview.widget.AdapterHelper r0 = r3.mAdapterHelper
            r2 = 11
            boolean r0 = r0.hasAnyUpdateTypes(r2)
            if (r0 != 0) goto L55
            java.lang.String r0 = "RV PartialInvalidate"
            androidx.core.os.TraceCompat.beginSection(r0)
            r3.startInterceptRequestLayout()
            r3.onEnterLayoutOrScroll()
            androidx.recyclerview.widget.AdapterHelper r0 = r3.mAdapterHelper
            r0.preProcess()
            boolean r0 = r3.mLayoutWasDefered
            if (r0 != 0) goto L4a
            boolean r0 = r3.hasUpdatedView()
            if (r0 == 0) goto L45
            r3.dispatchLayout()
            goto L4a
        L45:
            androidx.recyclerview.widget.AdapterHelper r0 = r3.mAdapterHelper
            r0.consumePostponedUpdates()
        L4a:
            r0 = 1
            r3.stopInterceptRequestLayout(r0)
            r3.onExitLayoutOrScroll(r0)
            androidx.core.os.TraceCompat.endSection()
            goto L66
        L55:
            androidx.recyclerview.widget.AdapterHelper r0 = r3.mAdapterHelper
            boolean r0 = r0.hasPendingUpdates()
            if (r0 == 0) goto L66
            androidx.core.os.TraceCompat.beginSection(r1)
            r3.dispatchLayout()
            androidx.core.os.TraceCompat.endSection()
        L66:
            return
        L67:
            androidx.core.os.TraceCompat.beginSection(r1)
            r3.dispatchLayout()
            androidx.core.os.TraceCompat.endSection()
            return
    }

    public final void defaultOnMeasure(int r3, int r4) {
            r2 = this;
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r1 = r1 + r0
            int r0 = androidx.core.view.ViewCompat.getMinimumWidth(r2)
            int r3 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r3, r1, r0)
            int r0 = r2.getPaddingTop()
            int r1 = r2.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r2)
            int r4 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r4, r1, r0)
            r2.setMeasuredDimension(r3, r4)
            return
    }

    public final void dispatchChildAttached(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = getChildViewHolderInt(r3)
            r2.onChildAttachedToWindow(r3)
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r2.mAdapter
            if (r1 == 0) goto L10
            if (r0 == 0) goto L10
            r1.onViewAttachedToWindow(r0)
        L10:
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r0 = r2.mOnChildAttachStateListeners
            if (r0 == 0) goto L28
            int r0 = r0.size()
        L18:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L28
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r1 = r2.mOnChildAttachStateListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener r1 = (androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener) r1
            r1.onChildViewAttachedToWindow(r3)
            goto L18
        L28:
            return
    }

    public final void dispatchChildDetached(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = getChildViewHolderInt(r3)
            r2.onChildDetachedFromWindow(r3)
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r2.mAdapter
            if (r1 == 0) goto L10
            if (r0 == 0) goto L10
            r1.onViewDetachedFromWindow(r0)
        L10:
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r0 = r2.mOnChildAttachStateListeners
            if (r0 == 0) goto L2a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1a:
            if (r0 < 0) goto L2a
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r1 = r2.mOnChildAttachStateListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener r1 = (androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener) r1
            r1.onChildViewDetachedFromWindow(r3)
            int r0 = r0 + (-1)
            goto L1a
        L2a:
            return
    }

    public final void dispatchLayout() {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r5.mAdapter
            java.lang.String r1 = "RecyclerView"
            if (r0 != 0) goto Lc
            java.lang.String r0 = "No adapter attached; skipping layout"
            android.util.Log.w(r1, r0)
            return
        Lc:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            if (r0 != 0) goto L16
            java.lang.String r0 = "No layout manager attached; skipping layout"
            android.util.Log.e(r1, r0)
            return
        L16:
            androidx.recyclerview.widget.RecyclerView$State r0 = r5.mState
            r1 = 0
            r0.mIsMeasuring = r1
            boolean r0 = r5.mLastAutoMeasureSkippedDueToExact
            r2 = 1
            if (r0 == 0) goto L32
            int r0 = r5.mLastAutoMeasureNonExactMeasuredWidth
            int r3 = r5.getWidth()
            if (r0 != r3) goto L30
            int r0 = r5.mLastAutoMeasureNonExactMeasuredHeight
            int r3 = r5.getHeight()
            if (r0 == r3) goto L32
        L30:
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            r5.mLastAutoMeasureNonExactMeasuredWidth = r1
            r5.mLastAutoMeasureNonExactMeasuredHeight = r1
            r5.mLastAutoMeasureSkippedDueToExact = r1
            androidx.recyclerview.widget.RecyclerView$State r3 = r5.mState
            int r3 = r3.mLayoutStep
            if (r3 != r2) goto L4b
            r5.dispatchLayoutStep1()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            r0.setExactMeasureSpecsFrom(r5)
            r5.dispatchLayoutStep2()
            goto L89
        L4b:
            androidx.recyclerview.widget.AdapterHelper r3 = r5.mAdapterHelper
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r4 = r3.mPostponedList
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L5e
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r3 = r3.mPendingUpdates
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L5e
            r1 = 1
        L5e:
            if (r1 != 0) goto L81
            if (r0 != 0) goto L81
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            int r0 = r0.getWidth()
            int r1 = r5.getWidth()
            if (r0 != r1) goto L81
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            int r0 = r0.getHeight()
            int r1 = r5.getHeight()
            if (r0 == r1) goto L7b
            goto L81
        L7b:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            r0.setExactMeasureSpecsFrom(r5)
            goto L89
        L81:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            r0.setExactMeasureSpecsFrom(r5)
            r5.dispatchLayoutStep2()
        L89:
            r5.dispatchLayoutStep3()
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.dispatchNestedFling(r2, r3, r4)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.dispatchNestedPreFling(r2, r3)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int r2, int r3, int[] r4, int[] r5) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.dispatchNestedPreScroll(r2, r3, r4, r5)
            return r2
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10, int r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.getScrollingChildHelper()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13, int r14, @androidx.annotation.NonNull int[] r15) {
            r8 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r8.getScrollingChildHelper()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.getScrollingChildHelper()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int r8, int r9, int r10, int r11, int[] r12, int r13) {
            r7 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r7.getScrollingChildHelper()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r8 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public final void dispatchOnScrolled(int r5, int r6) {
            r4 = this;
            int r0 = r4.mDispatchScrollCounter
            int r0 = r0 + 1
            r4.mDispatchScrollCounter = r0
            int r0 = r4.getScrollX()
            int r1 = r4.getScrollY()
            int r2 = r0 - r5
            int r3 = r1 - r6
            r4.onScrollChanged(r0, r1, r2, r3)
            r4.onScrolled(r5, r6)
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r0 = r4.mScrollListener
            if (r0 == 0) goto L1f
            r0.onScrolled(r4, r5, r6)
        L1f:
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r0 = r4.mScrollListeners
            if (r0 == 0) goto L39
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L29:
            if (r0 < 0) goto L39
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r1 = r4.mScrollListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r1 = (androidx.recyclerview.widget.RecyclerView.OnScrollListener) r1
            r1.onScrolled(r4, r5, r6)
            int r0 = r0 + (-1)
            goto L29
        L39:
            int r5 = r4.mDispatchScrollCounter
            int r5 = r5 + (-1)
            r4.mDispatchScrollCounter = r5
            return
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r0.onPopulateAccessibilityEvent(r1)
            r1 = 1
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> r1) {
            r0 = this;
            r0.dispatchThawSelfOnly(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> r1) {
            r0 = this;
            r0.dispatchFreezeSelfOnly(r1)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r8) {
            r7 = this;
            super.draw(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r7.mItemDecorations
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L1d
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r3 = r7.mItemDecorations
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r3 = (androidx.recyclerview.widget.RecyclerView.ItemDecoration) r3
            androidx.recyclerview.widget.RecyclerView$State r4 = r7.mState
            r3.onDrawOver(r8, r7, r4)
            int r2 = r2 + 1
            goto Lb
        L1d:
            android.widget.EdgeEffect r0 = r7.mLeftGlow
            r2 = 1
            if (r0 == 0) goto L57
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L57
            int r0 = r8.save()
            boolean r3 = r7.mClipToPadding
            if (r3 == 0) goto L35
            int r3 = r7.getPaddingBottom()
            goto L36
        L35:
            r3 = 0
        L36:
            r4 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r4)
            int r4 = r7.getHeight()
            int r4 = -r4
            int r4 = r4 + r3
            float r3 = (float) r4
            r4 = 0
            r8.translate(r3, r4)
            android.widget.EdgeEffect r3 = r7.mLeftGlow
            if (r3 == 0) goto L52
            boolean r3 = r3.draw(r8)
            if (r3 == 0) goto L52
            r3 = 1
            goto L53
        L52:
            r3 = 0
        L53:
            r8.restoreToCount(r0)
            goto L58
        L57:
            r3 = 0
        L58:
            android.widget.EdgeEffect r0 = r7.mTopGlow
            if (r0 == 0) goto L88
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L88
            int r0 = r8.save()
            boolean r4 = r7.mClipToPadding
            if (r4 == 0) goto L77
            int r4 = r7.getPaddingLeft()
            float r4 = (float) r4
            int r5 = r7.getPaddingTop()
            float r5 = (float) r5
            r8.translate(r4, r5)
        L77:
            android.widget.EdgeEffect r4 = r7.mTopGlow
            if (r4 == 0) goto L83
            boolean r4 = r4.draw(r8)
            if (r4 == 0) goto L83
            r4 = 1
            goto L84
        L83:
            r4 = 0
        L84:
            r3 = r3 | r4
            r8.restoreToCount(r0)
        L88:
            android.widget.EdgeEffect r0 = r7.mRightGlow
            if (r0 == 0) goto Lc0
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto Lc0
            int r0 = r8.save()
            int r4 = r7.getWidth()
            boolean r5 = r7.mClipToPadding
            if (r5 == 0) goto La3
            int r5 = r7.getPaddingTop()
            goto La4
        La3:
            r5 = 0
        La4:
            r6 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r6)
            float r5 = (float) r5
            int r4 = -r4
            float r4 = (float) r4
            r8.translate(r5, r4)
            android.widget.EdgeEffect r4 = r7.mRightGlow
            if (r4 == 0) goto Lbb
            boolean r4 = r4.draw(r8)
            if (r4 == 0) goto Lbb
            r4 = 1
            goto Lbc
        Lbb:
            r4 = 0
        Lbc:
            r3 = r3 | r4
            r8.restoreToCount(r0)
        Lc0:
            android.widget.EdgeEffect r0 = r7.mBottomGlow
            if (r0 == 0) goto L10f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L10f
            int r0 = r8.save()
            r4 = 1127481344(0x43340000, float:180.0)
            r8.rotate(r4)
            boolean r4 = r7.mClipToPadding
            if (r4 == 0) goto Lf1
            int r4 = r7.getWidth()
            int r4 = -r4
            int r5 = r7.getPaddingRight()
            int r5 = r5 + r4
            float r4 = (float) r5
            int r5 = r7.getHeight()
            int r5 = -r5
            int r6 = r7.getPaddingBottom()
            int r6 = r6 + r5
            float r5 = (float) r6
            r8.translate(r4, r5)
            goto L100
        Lf1:
            int r4 = r7.getWidth()
            int r4 = -r4
            float r4 = (float) r4
            int r5 = r7.getHeight()
            int r5 = -r5
            float r5 = (float) r5
            r8.translate(r4, r5)
        L100:
            android.widget.EdgeEffect r4 = r7.mBottomGlow
            if (r4 == 0) goto L10b
            boolean r4 = r4.draw(r8)
            if (r4 == 0) goto L10b
            r1 = 1
        L10b:
            r3 = r3 | r1
            r8.restoreToCount(r0)
        L10f:
            if (r3 != 0) goto L126
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r8 = r7.mItemAnimator
            if (r8 == 0) goto L126
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r8 = r7.mItemDecorations
            int r8 = r8.size()
            if (r8 <= 0) goto L126
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r8 = r7.mItemAnimator
            boolean r8 = r8.isRunning()
            if (r8 == 0) goto L126
            goto L127
        L126:
            r2 = r3
        L127:
            if (r2 == 0) goto L12c
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r7)
        L12c:
            return
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas r1, android.view.View r2, long r3) {
            r0 = this;
            boolean r1 = super.drawChild(r1, r2, r3)
            return r1
    }

    public final void ensureBottomGlow() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.mBottomGlow
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory r0 = r4.mEdgeEffectFactory
            android.widget.EdgeEffect r0 = r0.createEdgeEffect(r4)
            r4.mBottomGlow = r0
            boolean r1 = r4.mClipToPadding
            if (r1 == 0) goto L31
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            goto L3c
        L31:
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
            r0.setSize(r1, r2)
        L3c:
            return
    }

    public final void ensureLeftGlow() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.mLeftGlow
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory r0 = r4.mEdgeEffectFactory
            android.widget.EdgeEffect r0 = r0.createEdgeEffect(r4)
            r4.mLeftGlow = r0
            boolean r1 = r4.mClipToPadding
            if (r1 == 0) goto L31
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            goto L3c
        L31:
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getMeasuredWidth()
            r0.setSize(r1, r2)
        L3c:
            return
    }

    public final void ensureRightGlow() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.mRightGlow
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory r0 = r4.mEdgeEffectFactory
            android.widget.EdgeEffect r0 = r0.createEdgeEffect(r4)
            r4.mRightGlow = r0
            boolean r1 = r4.mClipToPadding
            if (r1 == 0) goto L31
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            goto L3c
        L31:
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getMeasuredWidth()
            r0.setSize(r1, r2)
        L3c:
            return
    }

    public final void ensureTopGlow() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.mTopGlow
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory r0 = r4.mEdgeEffectFactory
            android.widget.EdgeEffect r0 = r0.createEdgeEffect(r4)
            r4.mTopGlow = r0
            boolean r1 = r4.mClipToPadding
            if (r1 == 0) goto L31
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            goto L3c
        L31:
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
            r0.setSize(r1, r2)
        L3c:
            return
    }

    public final java.lang.String exceptionLabel() {
            r2 = this;
            java.lang.String r0 = " "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", adapter:"
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r2.mAdapter
            r0.append(r1)
            java.lang.String r1 = ", layout:"
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r2.mLayout
            r0.append(r1)
            java.lang.String r1 = ", context:"
            r0.append(r1)
            android.content.Context r1 = r2.getContext()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void fillRemainingScrollValues(androidx.recyclerview.widget.RecyclerView.State r4) {
            r3 = this;
            int r0 = r3.getScrollState()
            r1 = 2
            if (r0 != r1) goto L22
            androidx.recyclerview.widget.RecyclerView$ViewFlinger r0 = r3.mViewFlinger
            android.widget.OverScroller r0 = r0.mOverScroller
            int r1 = r0.getFinalX()
            int r2 = r0.getCurrX()
            int r1 = r1 - r2
            r4.mRemainingScrollHorizontal = r1
            int r1 = r0.getFinalY()
            int r0 = r0.getCurrY()
            int r1 = r1 - r0
            r4.mRemainingScrollVertical = r1
            goto L27
        L22:
            r0 = 0
            r4.mRemainingScrollHorizontal = r0
            r4.mRemainingScrollVertical = r0
        L27:
            return
    }

    @androidx.annotation.Nullable
    public android.view.View findChildViewUnder(float r6, float r7) {
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.getChildCount()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L44
            androidx.recyclerview.widget.ChildHelper r1 = r5.mChildHelper
            android.view.View r1 = r1.getChildAt(r0)
            float r2 = r1.getTranslationX()
            float r3 = r1.getTranslationY()
            int r4 = r1.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r2
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L41
            int r4 = r1.getRight()
            float r4 = (float) r4
            float r4 = r4 + r2
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto L41
            int r2 = r1.getTop()
            float r2 = (float) r2
            float r2 = r2 + r3
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 < 0) goto L41
            int r2 = r1.getBottom()
            float r2 = (float) r2
            float r2 = r2 + r3
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 > 0) goto L41
            return r1
        L41:
            int r0 = r0 + (-1)
            goto L8
        L44:
            r6 = 0
            return r6
    }

    @androidx.annotation.Nullable
    public android.view.View findContainingItemView(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.ViewHolder findContainingViewHolder(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            android.view.View r1 = r0.findContainingItemView(r1)
            if (r1 != 0) goto L8
            r1 = 0
            goto Lc
        L8:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r0.getChildViewHolder(r1)
        Lc:
            return r1
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForAdapterPosition(int r6) {
            r5 = this;
            boolean r0 = r5.mDataSetHasChangedAfterLayout
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L37
            androidx.recyclerview.widget.ChildHelper r3 = r5.mChildHelper
            android.view.View r3 = r3.getUnfilteredChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L34
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L34
            int r4 = r5.getAdapterPositionInRecyclerView(r3)
            if (r4 != r6) goto L34
            androidx.recyclerview.widget.ChildHelper r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.isHidden(r4)
            if (r1 == 0) goto L33
            r1 = r3
            goto L34
        L33:
            return r3
        L34:
            int r2 = r2 + 1
            goto Ld
        L37:
            return r1
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForItemId(long r8) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.mAdapter
            r1 = 0
            if (r0 == 0) goto L3f
            boolean r0 = r0.hasStableIds()
            if (r0 != 0) goto Lc
            goto L3f
        Lc:
            androidx.recyclerview.widget.ChildHelper r0 = r7.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r2 = 0
        L13:
            if (r2 >= r0) goto L3f
            androidx.recyclerview.widget.ChildHelper r3 = r7.mChildHelper
            android.view.View r3 = r3.getUnfilteredChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L3c
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L3c
            long r4 = r3.getItemId()
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 != 0) goto L3c
            androidx.recyclerview.widget.ChildHelper r1 = r7.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.isHidden(r4)
            if (r1 == 0) goto L3b
            r1 = r3
            goto L3c
        L3b:
            return r3
        L3c:
            int r2 = r2 + 1
            goto L13
        L3f:
            return r1
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForLayoutPosition(int r2) {
            r1 = this;
            r0 = 0
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.findViewHolderForPosition(r2, r0)
            return r2
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForPosition(int r2) {
            r1 = this;
            r0 = 0
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.findViewHolderForPosition(r2, r0)
            return r2
    }

    @androidx.annotation.Nullable
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForPosition(int r6, boolean r7) {
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.ChildHelper r3 = r5.mChildHelper
            android.view.View r3 = r3.getUnfilteredChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.ChildHelper r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.isHidden(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
    }

    public boolean fling(int r8, int r9) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            r1 = 0
            if (r0 != 0) goto Ld
            java.lang.String r8 = "RecyclerView"
            java.lang.String r9 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r8, r9)
            return r1
        Ld:
            boolean r2 = r7.mLayoutSuppressed
            if (r2 == 0) goto L12
            return r1
        L12:
            boolean r0 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r7.mLayout
            boolean r2 = r2.canScrollVertically()
            if (r0 == 0) goto L26
            int r3 = java.lang.Math.abs(r8)
            int r4 = r7.mMinFlingVelocity
            if (r3 >= r4) goto L27
        L26:
            r8 = 0
        L27:
            if (r2 == 0) goto L31
            int r3 = java.lang.Math.abs(r9)
            int r4 = r7.mMinFlingVelocity
            if (r3 >= r4) goto L32
        L31:
            r9 = 0
        L32:
            if (r8 != 0) goto L37
            if (r9 != 0) goto L37
            return r1
        L37:
            float r3 = (float) r8
            float r4 = (float) r9
            boolean r5 = r7.dispatchNestedPreFling(r3, r4)
            if (r5 != 0) goto L7b
            r5 = 1
            if (r0 != 0) goto L47
            if (r2 == 0) goto L45
            goto L47
        L45:
            r6 = 0
            goto L48
        L47:
            r6 = 1
        L48:
            r7.dispatchNestedFling(r3, r4, r6)
            androidx.recyclerview.widget.RecyclerView$OnFlingListener r3 = r7.mOnFlingListener
            if (r3 == 0) goto L56
            boolean r3 = r3.onFling(r8, r9)
            if (r3 == 0) goto L56
            return r5
        L56:
            if (r6 == 0) goto L7b
            if (r2 == 0) goto L5c
            r0 = r0 | 2
        L5c:
            r7.startNestedScroll(r0, r5)
            int r0 = r7.mMaxFlingVelocity
            int r1 = -r0
            int r8 = java.lang.Math.min(r8, r0)
            int r8 = java.lang.Math.max(r1, r8)
            int r0 = r7.mMaxFlingVelocity
            int r1 = -r0
            int r9 = java.lang.Math.min(r9, r0)
            int r9 = java.lang.Math.max(r1, r9)
            androidx.recyclerview.widget.RecyclerView$ViewFlinger r0 = r7.mViewFlinger
            r0.fling(r8, r9)
            return r5
        L7b:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.View focusSearch(android.view.View r9, int r10) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            android.view.View r0 = r0.onInterceptFocusSearch(r9, r10)
            if (r0 == 0) goto L9
            return r0
        L9:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r8.mAdapter
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1f
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            if (r0 == 0) goto L1f
            boolean r0 = r8.isComputingLayout()
            if (r0 != 0) goto L1f
            boolean r0 = r8.mLayoutSuppressed
            if (r0 != 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 0
            if (r0 == 0) goto L9b
            r5 = 2
            if (r10 == r5) goto L2c
            if (r10 != r1) goto L9b
        L2c:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L4a
            if (r10 != r5) goto L39
            r0 = 130(0x82, float:1.82E-43)
            goto L3b
        L39:
            r0 = 33
        L3b:
            android.view.View r6 = r3.findNextFocus(r8, r9, r0)
            if (r6 != 0) goto L43
            r6 = 1
            goto L44
        L43:
            r6 = 0
        L44:
            boolean r7 = androidx.recyclerview.widget.RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION
            if (r7 == 0) goto L4b
            r10 = r0
            goto L4b
        L4a:
            r6 = 0
        L4b:
            if (r6 != 0) goto L7b
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L7b
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            int r0 = r0.getLayoutDirection()
            if (r0 != r1) goto L5f
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            if (r10 != r5) goto L64
            r5 = 1
            goto L65
        L64:
            r5 = 0
        L65:
            r0 = r0 ^ r5
            if (r0 == 0) goto L6b
            r0 = 66
            goto L6d
        L6b:
            r0 = 17
        L6d:
            android.view.View r5 = r3.findNextFocus(r8, r9, r0)
            if (r5 != 0) goto L74
            goto L75
        L74:
            r1 = 0
        L75:
            boolean r5 = androidx.recyclerview.widget.RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION
            if (r5 == 0) goto L7a
            r10 = r0
        L7a:
            r6 = r1
        L7b:
            if (r6 == 0) goto L96
            r8.consumePendingUpdateOperations()
            android.view.View r0 = r8.findContainingItemView(r9)
            if (r0 != 0) goto L87
            return r4
        L87:
            r8.startInterceptRequestLayout()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r8.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r5 = r8.mState
            r0.onFocusSearchFailed(r9, r10, r1, r5)
            r8.stopInterceptRequestLayout(r2)
        L96:
            android.view.View r0 = r3.findNextFocus(r8, r9, r10)
            goto Lbf
        L9b:
            android.view.View r1 = r3.findNextFocus(r8, r9, r10)
            if (r1 != 0) goto Lbe
            if (r0 == 0) goto Lbe
            r8.consumePendingUpdateOperations()
            android.view.View r0 = r8.findContainingItemView(r9)
            if (r0 != 0) goto Lad
            return r4
        Lad:
            r8.startInterceptRequestLayout()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r8.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r3 = r8.mState
            android.view.View r0 = r0.onFocusSearchFailed(r9, r10, r1, r3)
            r8.stopInterceptRequestLayout(r2)
            goto Lbf
        Lbe:
            r0 = r1
        Lbf:
            if (r0 == 0) goto Ld6
            boolean r1 = r0.hasFocusable()
            if (r1 != 0) goto Ld6
            android.view.View r1 = r8.getFocusedChild()
            if (r1 != 0) goto Ld2
            android.view.View r9 = super.focusSearch(r9, r10)
            return r9
        Ld2:
            r8.requestChildOnScreen(r0, r4)
            return r9
        Ld6:
            boolean r1 = r8.isPreferredNextFocus(r9, r0, r10)
            if (r1 == 0) goto Ldd
            goto Le1
        Ldd:
            android.view.View r0 = super.focusSearch(r9, r10)
        Le1:
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L9
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = r0.generateDefaultLayoutParams()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView has no LayoutManager"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto Ld
            android.content.Context r1 = r2.getContext()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = r0.generateLayoutParams(r1, r3)
            return r3
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "RecyclerView has no LayoutManager"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0)
            r3.<init>(r0)
            throw r3
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            if (r0 == 0) goto L9
            androidx.recyclerview.widget.RecyclerView$LayoutParams r2 = r0.generateLayoutParams(r2)
            return r2
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "RecyclerView has no LayoutManager"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.String r0 = "androidx.recyclerview.widget.RecyclerView"
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.Adapter getAdapter() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r1.mAdapter
            return r0
    }

    public final int getAdapterPositionInRecyclerView(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            r0 = 524(0x20c, float:7.34E-43)
            boolean r0 = r2.hasAnyOfTheFlags(r0)
            if (r0 != 0) goto L18
            boolean r0 = r2.isBound()
            if (r0 != 0) goto Lf
            goto L18
        Lf:
            androidx.recyclerview.widget.AdapterHelper r0 = r1.mAdapterHelper
            int r2 = r2.mPosition
            int r2 = r0.applyPendingUpdatesToPosition(r2)
            return r2
        L18:
            r2 = -1
            return r2
    }

    @Override // android.view.View
    public int getBaseline() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            if (r0 == 0) goto L9
            int r0 = r0.getBaseline()
            return r0
        L9:
            int r0 = super.getBaseline()
            return r0
    }

    public final long getChangedHolderKey(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r2.mAdapter
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto Ld
            long r0 = r3.getItemId()
            goto L10
        Ld:
            int r3 = r3.mPosition
            long r0 = (long) r3
        L10:
            return r0
    }

    public int getChildAdapterPosition(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = getChildViewHolderInt(r1)
            if (r1 == 0) goto Lb
            int r1 = r1.getAbsoluteAdapterPosition()
            goto Lc
        Lb:
            r1 = -1
        Lc:
            return r1
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ChildDrawingOrderCallback r0 = r1.mChildDrawingOrderCallback
            if (r0 != 0) goto L9
            int r2 = super.getChildDrawingOrder(r2, r3)
            return r2
        L9:
            int r2 = r0.onGetChildDrawingOrder(r2, r3)
            return r2
    }

    public long getChildItemId(@androidx.annotation.NonNull android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r3.mAdapter
            r1 = -1
            if (r0 == 0) goto L17
            boolean r0 = r0.hasStableIds()
            if (r0 != 0) goto Ld
            goto L17
        Ld:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = getChildViewHolderInt(r4)
            if (r4 == 0) goto L17
            long r1 = r4.getItemId()
        L17:
            return r1
    }

    public int getChildLayoutPosition(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = getChildViewHolderInt(r1)
            if (r1 == 0) goto Lb
            int r1 = r1.getLayoutPosition()
            goto Lc
        Lb:
            r1 = -1
        Lc:
            return r1
    }

    @java.lang.Deprecated
    public int getChildPosition(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            int r1 = r0.getChildAdapterPosition(r1)
            return r1
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder getChildViewHolder(@androidx.annotation.NonNull android.view.View r4) {
            r3 = this;
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L28
            if (r0 != r3) goto L9
            goto L28
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not a direct child of "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L28:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = getChildViewHolderInt(r4)
            return r4
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
            r1 = this;
            boolean r0 = r1.mClipToPadding
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r0 = r1.mAccessibilityDelegate
            return r0
    }

    public void getDecoratedBoundsWithMargins(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.graphics.Rect r2) {
            r0 = this;
            getDecoratedBoundsWithMarginsInt(r1, r2)
            return
    }

    @androidx.annotation.NonNull
    public androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory getEdgeEffectFactory() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory r0 = r1.mEdgeEffectFactory
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.ItemAnimator getItemAnimator() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r1.mItemAnimator
            return r0
    }

    public final android.graphics.Rect getItemDecorInsetsForChild(android.view.View r9) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            boolean r1 = r0.mInsetsDirty
            if (r1 != 0) goto Ld
            android.graphics.Rect r9 = r0.mDecorInsets
            return r9
        Ld:
            androidx.recyclerview.widget.RecyclerView$State r1 = r8.mState
            boolean r1 = r1.isPreLayout()
            if (r1 == 0) goto L24
            boolean r1 = r0.isItemChanged()
            if (r1 != 0) goto L21
            boolean r1 = r0.isViewInvalid()
            if (r1 == 0) goto L24
        L21:
            android.graphics.Rect r9 = r0.mDecorInsets
            return r9
        L24:
            android.graphics.Rect r1 = r0.mDecorInsets
            r2 = 0
            r1.set(r2, r2, r2, r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r3 = r8.mItemDecorations
            int r3 = r3.size()
            r4 = 0
        L31:
            if (r4 >= r3) goto L68
            android.graphics.Rect r5 = r8.mTempRect
            r5.set(r2, r2, r2, r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r5 = r8.mItemDecorations
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r5 = (androidx.recyclerview.widget.RecyclerView.ItemDecoration) r5
            android.graphics.Rect r6 = r8.mTempRect
            androidx.recyclerview.widget.RecyclerView$State r7 = r8.mState
            r5.getItemOffsets(r6, r9, r8, r7)
            int r5 = r1.left
            android.graphics.Rect r6 = r8.mTempRect
            int r7 = r6.left
            int r5 = r5 + r7
            r1.left = r5
            int r5 = r1.top
            int r7 = r6.top
            int r5 = r5 + r7
            r1.top = r5
            int r5 = r1.right
            int r7 = r6.right
            int r5 = r5 + r7
            r1.right = r5
            int r5 = r1.bottom
            int r6 = r6.bottom
            int r5 = r5 + r6
            r1.bottom = r5
            int r4 = r4 + 1
            goto L31
        L68:
            r0.mInsetsDirty = r2
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.recyclerview.widget.RecyclerView.ItemDecoration getItemDecorationAt(int r4) {
            r3 = this;
            int r0 = r3.getItemDecorationCount()
            if (r4 < 0) goto L11
            if (r4 >= r0) goto L11
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r3.mItemDecorations
            java.lang.Object r4 = r0.get(r4)
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r4 = (androidx.recyclerview.widget.RecyclerView.ItemDecoration) r4
            return r4
        L11:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " is an invalid index for size "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    public int getItemDecorationCount() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r1.mItemDecorations
            int r0 = r0.size()
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            return r0
    }

    public int getMaxFlingVelocity() {
            r1 = this;
            int r0 = r1.mMaxFlingVelocity
            return r0
    }

    public int getMinFlingVelocity() {
            r1 = this;
            int r0 = r1.mMinFlingVelocity
            return r0
    }

    long getNanoTime() {
            r2 = this;
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L9
            long r0 = java.lang.System.nanoTime()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.OnFlingListener getOnFlingListener() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$OnFlingListener r0 = r1.mOnFlingListener
            return r0
    }

    public boolean getPreserveFocusAfterLayout() {
            r1 = this;
            boolean r0 = r1.mPreserveFocusAfterLayout
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.recyclerview.widget.RecyclerView.RecycledViewPool getRecycledViewPool() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r1.mRecycler
            androidx.recyclerview.widget.RecyclerView$RecycledViewPool r0 = r0.getRecycledViewPool()
            return r0
    }

    public int getScrollState() {
            r1 = this;
            int r0 = r1.mScrollState
            return r0
    }

    public boolean hasFixedSize() {
            r1 = this;
            boolean r0 = r1.mHasFixedSize
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r0 = r0.hasNestedScrollingParent()
            return r0
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.hasNestedScrollingParent(r2)
            return r2
    }

    public boolean hasPendingAdapterUpdates() {
            r1 = this;
            boolean r0 = r1.mFirstLayoutComplete
            if (r0 == 0) goto L13
            boolean r0 = r1.mDataSetHasChangedAfterLayout
            if (r0 != 0) goto L13
            androidx.recyclerview.widget.AdapterHelper r0 = r1.mAdapterHelper
            boolean r0 = r0.hasPendingUpdates()
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

    public final void invalidateGlows() {
            r1 = this;
            r0 = 0
            r1.mBottomGlow = r0
            r1.mTopGlow = r0
            r1.mRightGlow = r0
            r1.mLeftGlow = r0
            return
    }

    public void invalidateItemDecorations() {
            r2 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r2.mItemDecorations
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L12
            java.lang.String r1 = "Cannot invalidate item decorations during a scroll or layout"
            r0.assertNotInLayoutOrScroll(r1)
        L12:
            r2.markItemDecorInsetsDirty()
            r2.requestLayout()
            return
    }

    public final boolean isAccessibilityEnabled() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.mAccessibilityManager
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isAnimating() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r1.mItemAnimator
            if (r0 == 0) goto Lc
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
            r1 = this;
            boolean r0 = r1.mIsAttached
            return r0
    }

    public boolean isComputingLayout() {
            r1 = this;
            int r0 = r1.mLayoutOrScrollCounter
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @java.lang.Deprecated
    public boolean isLayoutFrozen() {
            r1 = this;
            boolean r0 = r1.isLayoutSuppressed()
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
            r1 = this;
            boolean r0 = r1.mLayoutSuppressed
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r0 = r0.isNestedScrollingEnabled()
            return r0
    }

    public final void jumpToPositionForSmoothScroller(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            r1.setScrollState(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            r0.scrollToPosition(r2)
            r1.awakenScrollBars()
            return
    }

    public final void markItemDecorInsetsDirty() {
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r1 = 0
            r2 = 0
        L8:
            r3 = 1
            if (r2 >= r0) goto L1c
            androidx.recyclerview.widget.ChildHelper r4 = r5.mChildHelper
            android.view.View r4 = r4.getUnfilteredChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r4
            r4.mInsetsDirty = r3
            int r2 = r2 + 1
            goto L8
        L1c:
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r5.mRecycler
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r0.mCachedViews
            int r2 = r2.size()
        L24:
            if (r1 >= r2) goto L3d
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r4 = r0.mCachedViews
            java.lang.Object r4 = r4.get(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r4
            android.view.View r4 = r4.itemView
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r4
            if (r4 == 0) goto L3a
            r4.mInsetsDirty = r3
        L3a:
            int r1 = r1 + 1
            goto L24
        L3d:
            return
    }

    public void nestedScrollBy(int r3, int r4) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.nestedScrollByInternal(r3, r4, r0, r1)
            return
    }

    public void offsetChildrenHorizontal(@androidx.annotation.Px int r4) {
            r3 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r3.mChildHelper
            int r0 = r0.getChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            androidx.recyclerview.widget.ChildHelper r2 = r3.mChildHelper
            android.view.View r2 = r2.getChildAt(r1)
            r2.offsetLeftAndRight(r4)
            int r1 = r1 + 1
            goto L7
        L15:
            return
    }

    public void offsetChildrenVertical(@androidx.annotation.Px int r4) {
            r3 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r3.mChildHelper
            int r0 = r0.getChildCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            androidx.recyclerview.widget.ChildHelper r2 = r3.mChildHelper
            android.view.View r2 = r2.getChildAt(r1)
            r2.offsetTopAndBottom(r4)
            int r1 = r1 + 1
            goto L7
        L15:
            return
    }

    public final void offsetPositionRecordsForRemove(int r9, int r10, boolean r11) {
            r8 = this;
            int r0 = r9 + r10
            androidx.recyclerview.widget.ChildHelper r1 = r8.mChildHelper
            int r1 = r1.getUnfilteredChildCount()
            r2 = 0
        L9:
            r3 = 8
            if (r2 >= r1) goto L41
            androidx.recyclerview.widget.ChildHelper r4 = r8.mChildHelper
            android.view.View r4 = r4.getUnfilteredChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = getChildViewHolderInt(r4)
            if (r4 == 0) goto L3e
            boolean r5 = r4.shouldIgnore()
            if (r5 != 0) goto L3e
            int r5 = r4.mPosition
            r6 = 1
            if (r5 < r0) goto L2d
            int r3 = -r10
            r4.offsetPosition(r3, r11)
            androidx.recyclerview.widget.RecyclerView$State r3 = r8.mState
            r3.mStructureChanged = r6
            goto L3e
        L2d:
            if (r5 < r9) goto L3e
            int r5 = r9 + (-1)
            int r7 = -r10
            r4.addFlags(r3)
            r4.offsetPosition(r7, r11)
            r4.mPosition = r5
            androidx.recyclerview.widget.RecyclerView$State r3 = r8.mState
            r3.mStructureChanged = r6
        L3e:
            int r2 = r2 + 1
            goto L9
        L41:
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r8.mRecycler
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r1.mCachedViews
            int r2 = r2.size()
        L49:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L69
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r4 = r1.mCachedViews
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r4
            if (r4 == 0) goto L49
            int r5 = r4.mPosition
            if (r5 < r0) goto L60
            int r5 = -r10
            r4.offsetPosition(r5, r11)
            goto L49
        L60:
            if (r5 < r9) goto L49
            r4.addFlags(r3)
            r1.recycleCachedViewAt(r2)
            goto L49
        L69:
            r8.requestLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.mLayoutOrScrollCounter = r0
            r1 = 1
            r4.mIsAttached = r1
            boolean r2 = r4.mFirstLayoutComplete
            if (r2 == 0) goto L15
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r4.mFirstLayoutComplete = r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r4.mLayout
            if (r2 == 0) goto L21
            r2.mIsAttachedToWindow = r1
            r2.onAttachedToWindow(r4)
        L21:
            r4.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L64
            java.lang.ThreadLocal<androidx.recyclerview.widget.GapWorker> r0 = androidx.recyclerview.widget.GapWorker.sGapWorker
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.GapWorker r1 = (androidx.recyclerview.widget.GapWorker) r1
            r4.mGapWorker = r1
            if (r1 != 0) goto L5f
            androidx.recyclerview.widget.GapWorker r1 = new androidx.recyclerview.widget.GapWorker
            r1.<init>()
            r4.mGapWorker = r1
            android.view.Display r1 = androidx.core.view.ViewCompat.getDisplay(r4)
            r2 = 1114636288(0x42700000, float:60.0)
            boolean r3 = r4.isInEditMode()
            if (r3 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r3 = 1106247680(0x41f00000, float:30.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L53
            r2 = r1
        L53:
            androidx.recyclerview.widget.GapWorker r1 = r4.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r2
            long r2 = (long) r3
            r1.mFrameIntervalNs = r2
            r0.set(r1)
        L5f:
            androidx.recyclerview.widget.GapWorker r0 = r4.mGapWorker
            r0.add(r4)
        L64:
            return
    }

    public void onChildAttachedToWindow(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            return
    }

    public void onChildDetachedFromWindow(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r3.mItemAnimator
            if (r0 == 0) goto La
            r0.endAnimations()
        La:
            r3.stopScroll()
            r0 = 0
            r3.mIsAttached = r0
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r3.mLayout
            if (r1 == 0) goto L1b
            androidx.recyclerview.widget.RecyclerView$Recycler r2 = r3.mRecycler
            r1.mIsAttachedToWindow = r0
            r1.onDetachedFromWindow(r3, r2)
        L1b:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r3.mPendingAccessibilityImportanceChange
            r0.clear()
            java.lang.Runnable r0 = r3.mItemAnimatorRunner
            r3.removeCallbacks(r0)
            androidx.recyclerview.widget.ViewInfoStore r0 = r3.mViewInfoStore
            java.util.Objects.requireNonNull(r0)
        L2a:
            androidx.core.util.Pools$Pool<androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.sPool
            java.lang.Object r0 = r0.acquire()
            if (r0 == 0) goto L33
            goto L2a
        L33:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L41
            androidx.recyclerview.widget.GapWorker r0 = r3.mGapWorker
            if (r0 == 0) goto L41
            r0.remove(r3)
            r0 = 0
            r3.mGapWorker = r0
        L41:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r4.mItemDecorations
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r2 = r4.mItemDecorations
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r2 = (androidx.recyclerview.widget.RecyclerView.ItemDecoration) r2
            androidx.recyclerview.widget.RecyclerView$State r3 = r4.mState
            r2.onDraw(r5, r4, r3)
            int r1 = r1 + 1
            goto La
        L1c:
            return
    }

    public final void onEnterLayoutOrScroll() {
            r1 = this;
            int r0 = r1.mLayoutOrScrollCounter
            int r0 = r0 + 1
            r1.mLayoutOrScrollCounter = r0
            return
    }

    public final void onExitLayoutOrScroll(boolean r5) {
            r4 = this;
            int r0 = r4.mLayoutOrScrollCounter
            r1 = 1
            int r0 = r0 - r1
            r4.mLayoutOrScrollCounter = r0
            if (r0 >= r1) goto L44
            r0 = 0
            r4.mLayoutOrScrollCounter = r0
            if (r5 == 0) goto L44
            r4.dispatchContentChangedIfNecessary()
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r5 = r4.mPendingAccessibilityImportanceChange
            int r5 = r5.size()
            r0 = -1
            int r5 = r5 + r0
        L18:
            if (r5 < 0) goto L3f
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r4.mPendingAccessibilityImportanceChange
            java.lang.Object r1 = r1.get(r5)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r1
            android.view.View r2 = r1.itemView
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != r4) goto L3c
            boolean r2 = r1.shouldIgnore()
            if (r2 == 0) goto L31
            goto L3c
        L31:
            int r2 = r1.mPendingAccessibilityState
            if (r2 == r0) goto L3c
            android.view.View r3 = r1.itemView
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r2)
            r1.mPendingAccessibilityState = r0
        L3c:
            int r5 = r5 + (-1)
            goto L18
        L3f:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r5 = r4.mPendingAccessibilityImportanceChange
            r5.clear()
        L44:
            return
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6a:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
            r8 = this;
            boolean r0 = r8.mLayoutSuppressed
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 0
            r8.mInterceptingOnItemTouchListener = r0
            boolean r0 = r8.findInterceptingOnItemTouchListener(r9)
            r2 = 1
            if (r0 == 0) goto L14
            r8.cancelScroll()
            return r2
        L14:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r8.mLayout
            if (r0 != 0) goto L19
            return r1
        L19:
            boolean r0 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r8.mLayout
            boolean r3 = r3.canScrollVertically()
            android.view.VelocityTracker r4 = r8.mVelocityTracker
            if (r4 != 0) goto L2d
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r8.mVelocityTracker = r4
        L2d:
            android.view.VelocityTracker r4 = r8.mVelocityTracker
            r4.addMovement(r9)
            int r4 = r9.getActionMasked()
            int r5 = r9.getActionIndex()
            r6 = 2
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto Ld9
            if (r4 == r2) goto Ld0
            if (r4 == r6) goto L74
            r0 = 3
            if (r4 == r0) goto L6f
            r0 = 5
            if (r4 == r0) goto L53
            r0 = 6
            if (r4 == r0) goto L4e
            goto L117
        L4e:
            r8.onPointerUp(r9)
            goto L117
        L53:
            int r0 = r9.getPointerId(r5)
            r8.mScrollPointerId = r0
            float r0 = r9.getX(r5)
            float r0 = r0 + r7
            int r0 = (int) r0
            r8.mLastTouchX = r0
            r8.mInitialTouchX = r0
            float r9 = r9.getY(r5)
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.mLastTouchY = r9
            r8.mInitialTouchY = r9
            goto L117
        L6f:
            r8.cancelScroll()
            goto L117
        L74:
            int r4 = r8.mScrollPointerId
            int r4 = r9.findPointerIndex(r4)
            if (r4 >= 0) goto L96
            java.lang.String r9 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9)
            int r0 = r8.mScrollPointerId
            r9.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r9)
            return r1
        L96:
            float r5 = r9.getX(r4)
            float r5 = r5 + r7
            int r5 = (int) r5
            float r9 = r9.getY(r4)
            float r9 = r9 + r7
            int r9 = (int) r9
            int r4 = r8.mScrollState
            if (r4 == r2) goto L117
            int r4 = r8.mInitialTouchX
            int r4 = r5 - r4
            int r6 = r8.mInitialTouchY
            int r6 = r9 - r6
            if (r0 == 0) goto Lbc
            int r0 = java.lang.Math.abs(r4)
            int r4 = r8.mTouchSlop
            if (r0 <= r4) goto Lbc
            r8.mLastTouchX = r5
            r0 = 1
            goto Lbd
        Lbc:
            r0 = 0
        Lbd:
            if (r3 == 0) goto Lca
            int r3 = java.lang.Math.abs(r6)
            int r4 = r8.mTouchSlop
            if (r3 <= r4) goto Lca
            r8.mLastTouchY = r9
            r0 = 1
        Lca:
            if (r0 == 0) goto L117
            r8.setScrollState(r2)
            goto L117
        Ld0:
            android.view.VelocityTracker r9 = r8.mVelocityTracker
            r9.clear()
            r8.stopNestedScroll(r1)
            goto L117
        Ld9:
            boolean r4 = r8.mIgnoreMotionEventTillDown
            if (r4 == 0) goto Ldf
            r8.mIgnoreMotionEventTillDown = r1
        Ldf:
            int r4 = r9.getPointerId(r1)
            r8.mScrollPointerId = r4
            float r4 = r9.getX()
            float r4 = r4 + r7
            int r4 = (int) r4
            r8.mLastTouchX = r4
            r8.mInitialTouchX = r4
            float r9 = r9.getY()
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.mLastTouchY = r9
            r8.mInitialTouchY = r9
            int r9 = r8.mScrollState
            if (r9 != r6) goto L10a
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r2)
            r8.setScrollState(r2)
            r8.stopNestedScroll(r2)
        L10a:
            int[] r9 = r8.mNestedOffsets
            r9[r2] = r1
            r9[r1] = r1
            if (r3 == 0) goto L114
            r0 = r0 | 2
        L114:
            r8.startNestedScroll(r0, r1)
        L117:
            int r9 = r8.mScrollState
            if (r9 != r2) goto L11c
            r1 = 1
        L11c:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            java.lang.String r1 = "RV OnLayout"
            androidx.core.os.TraceCompat.beginSection(r1)
            r0.dispatchLayout()
            androidx.core.os.TraceCompat.endSection()
            r1 = 1
            r0.mFirstLayoutComplete = r1
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r8, int r9) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            if (r0 != 0) goto L8
            r7.defaultOnMeasure(r8, r9)
            return
        L8:
            boolean r0 = r0.isAutoMeasureEnabled()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L82
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r3 = android.view.View.MeasureSpec.getMode(r9)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r7.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r5 = r7.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r6 = r7.mState
            r4.onMeasure(r5, r6, r8, r9)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r4) goto L28
            if (r3 != r4) goto L28
            r2 = 1
        L28:
            r7.mLastAutoMeasureSkippedDueToExact = r2
            if (r2 != 0) goto L81
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.mAdapter
            if (r0 != 0) goto L31
            goto L81
        L31:
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            int r0 = r0.mLayoutStep
            if (r0 != r1) goto L3a
            r7.dispatchLayoutStep1()
        L3a:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            r0.setMeasureSpecs(r8, r9)
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            r0.mIsMeasuring = r1
            r7.dispatchLayoutStep2()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            r0.setMeasuredDimensionFromChildren(r8, r9)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            boolean r0 = r0.shouldMeasureTwice()
            if (r0 == 0) goto L74
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            int r2 = r7.getMeasuredWidth()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            int r3 = r7.getMeasuredHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            r0.setMeasureSpecs(r2, r3)
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            r0.mIsMeasuring = r1
            r7.dispatchLayoutStep2()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            r0.setMeasuredDimensionFromChildren(r8, r9)
        L74:
            int r8 = r7.getMeasuredWidth()
            r7.mLastAutoMeasureNonExactMeasuredWidth = r8
            int r8 = r7.getMeasuredHeight()
            r7.mLastAutoMeasureNonExactMeasuredHeight = r8
            goto Lee
        L81:
            return
        L82:
            boolean r0 = r7.mHasFixedSize
            if (r0 == 0) goto L90
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r7.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r2 = r7.mState
            r0.onMeasure(r1, r2, r8, r9)
            return
        L90:
            boolean r0 = r7.mAdapterUpdateDuringMeasure
            if (r0 == 0) goto Lb8
            r7.startInterceptRequestLayout()
            r7.onEnterLayoutOrScroll()
            r7.processAdapterUpdatesAndSetAnimationFlags()
            r7.onExitLayoutOrScroll(r1)
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            boolean r3 = r0.mRunPredictiveAnimations
            if (r3 == 0) goto La9
            r0.mInPreLayout = r1
            goto Lb2
        La9:
            androidx.recyclerview.widget.AdapterHelper r0 = r7.mAdapterHelper
            r0.consumeUpdatesInOnePass()
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            r0.mInPreLayout = r2
        Lb2:
            r7.mAdapterUpdateDuringMeasure = r2
            r7.stopInterceptRequestLayout(r2)
            goto Lca
        Lb8:
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            boolean r0 = r0.mRunPredictiveAnimations
            if (r0 == 0) goto Lca
            int r8 = r7.getMeasuredWidth()
            int r9 = r7.getMeasuredHeight()
            r7.setMeasuredDimension(r8, r9)
            return
        Lca:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r7.mAdapter
            if (r0 == 0) goto Ld7
            androidx.recyclerview.widget.RecyclerView$State r1 = r7.mState
            int r0 = r0.getItemCount()
            r1.mItemCount = r0
            goto Ldb
        Ld7:
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            r0.mItemCount = r2
        Ldb:
            r7.startInterceptRequestLayout()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r7.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r7.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r3 = r7.mState
            r0.onMeasure(r1, r3, r8, r9)
            r7.stopInterceptRequestLayout(r2)
            androidx.recyclerview.widget.RecyclerView$State r8 = r7.mState
            r8.mInPreLayout = r2
        Lee:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int r2, android.graphics.Rect r3) {
            r1 = this;
            boolean r0 = r1.isComputingLayout()
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r2 = super.onRequestFocusInDescendants(r2, r3)
            return r2
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.recyclerview.widget.RecyclerView$SavedState r2 = (androidx.recyclerview.widget.RecyclerView.SavedState) r2
            r1.mPendingSavedState = r2
            android.os.Parcelable r2 = r2.getSuperState()
            super.onRestoreInstanceState(r2)
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$SavedState r0 = new androidx.recyclerview.widget.RecyclerView$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.recyclerview.widget.RecyclerView$SavedState r1 = r2.mPendingSavedState
            if (r1 == 0) goto L12
            android.os.Parcelable r1 = r1.mLayoutState
            r0.mLayoutState = r1
            goto L20
        L12:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r2.mLayout
            if (r1 == 0) goto L1d
            android.os.Parcelable r1 = r1.onSaveInstanceState()
            r0.mLayoutState = r1
            goto L20
        L1d:
            r1 = 0
            r0.mLayoutState = r1
        L20:
            return r0
    }

    public void onScrollStateChanged(int r1) {
            r0 = this;
            return
    }

    public void onScrolled(@androidx.annotation.Px int r1, @androidx.annotation.Px int r2) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 != r3) goto L7
            if (r2 == r4) goto La
        L7:
            r0.invalidateGlows()
        La:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r18) {
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L1dd
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto Lf
            goto L1dd
        Lf:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L1a
            r17.cancelScroll()
            return r9
        L1a:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r6.mLayout
            if (r0 != 0) goto L1f
            return r8
        L1f:
            boolean r10 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r6.mLayout
            boolean r11 = r0.canScrollVertically()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L33
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L33:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L43
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L43:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L1b1
            if (r0 == r9) goto L16f
            r3 = 2
            if (r0 == r3) goto L8c
            r3 = 3
            if (r0 == r3) goto L87
            r3 = 5
            if (r0 == r3) goto L6b
            r1 = 6
            if (r0 == r1) goto L66
            goto L1d2
        L66:
            r17.onPointerUp(r18)
            goto L1d2
        L6b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L1d2
        L87:
            r17.cancelScroll()
            goto L1d2
        L8c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto Lae
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        Lae:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto Lf7
            if (r10 == 0) goto Ldb
            if (r0 <= 0) goto Ld0
            int r2 = r6.mTouchSlop
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto Ld7
        Ld0:
            int r2 = r6.mTouchSlop
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        Ld7:
            if (r0 == 0) goto Ldb
            r2 = 1
            goto Ldc
        Ldb:
            r2 = 0
        Ldc:
            if (r11 == 0) goto Lf2
            if (r1 <= 0) goto Le8
            int r3 = r6.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto Lef
        Le8:
            int r3 = r6.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        Lef:
            if (r1 == 0) goto Lf2
            r2 = 1
        Lf2:
            if (r2 == 0) goto Lf7
            r6.setScrollState(r9)
        Lf7:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L1d2
            int[] r3 = r6.mReusableIntPair
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L108
            r1 = r15
            goto L10a
        L108:
            r0 = 0
            r1 = 0
        L10a:
            if (r11 == 0) goto L10f
            r2 = r16
            goto L111
        L10f:
            r0 = 0
            r2 = 0
        L111:
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L13e
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L13e:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L150
            r1 = r15
            goto L151
        L150:
            r1 = 0
        L151:
            if (r11 == 0) goto L155
            r2 = r0
            goto L156
        L155:
            r2 = 0
        L156:
            boolean r1 = r6.scrollByInternal(r1, r2, r7, r8)
            if (r1 == 0) goto L163
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L163:
            androidx.recyclerview.widget.GapWorker r1 = r6.mGapWorker
            if (r1 == 0) goto L1d2
            if (r15 != 0) goto L16b
            if (r0 == 0) goto L1d2
        L16b:
            r1.postFromTraversal(r6, r15, r0)
            goto L1d2
        L16f:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L18b
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L18c
        L18b:
            r1 = 0
        L18c:
            if (r11 == 0) goto L198
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L199
        L198:
            r2 = 0
        L199:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L1a1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L1a9
        L1a1:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L1ac
        L1a9:
            r6.setScrollState(r8)
        L1ac:
            r17.resetScroll()
            r8 = 1
            goto L1d2
        L1b1:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r11 == 0) goto L1cf
            r10 = r10 | 2
        L1cf:
            r6.startNestedScroll(r10, r8)
        L1d2:
            if (r8 != 0) goto L1d9
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L1d9:
            r12.recycle()
            return r9
        L1dd:
            return r8
    }

    public final void postAnimationRunner() {
            r1 = this;
            boolean r0 = r1.mPostedAnimatorRunner
            if (r0 != 0) goto L10
            boolean r0 = r1.mIsAttached
            if (r0 == 0) goto L10
            java.lang.Runnable r0 = r1.mItemAnimatorRunner
            androidx.core.view.ViewCompat.postOnAnimation(r1, r0)
            r0 = 1
            r1.mPostedAnimatorRunner = r0
        L10:
            return
    }

    public final void processDataSetCompletelyChanged(boolean r6) {
            r5 = this;
            boolean r0 = r5.mDispatchItemsChangedEvent
            r6 = r6 | r0
            r5.mDispatchItemsChangedEvent = r6
            r6 = 1
            r5.mDataSetHasChangedAfterLayout = r6
            androidx.recyclerview.widget.ChildHelper r6 = r5.mChildHelper
            int r6 = r6.getUnfilteredChildCount()
            r0 = 0
            r1 = 0
        L10:
            r2 = 6
            if (r1 >= r6) goto L2b
            androidx.recyclerview.widget.ChildHelper r3 = r5.mChildHelper
            android.view.View r3 = r3.getUnfilteredChildAt(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L28
            boolean r4 = r3.shouldIgnore()
            if (r4 != 0) goto L28
            r3.addFlags(r2)
        L28:
            int r1 = r1 + 1
            goto L10
        L2b:
            r5.markItemDecorInsetsDirty()
            androidx.recyclerview.widget.RecyclerView$Recycler r6 = r5.mRecycler
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r6.mCachedViews
            int r1 = r1.size()
        L36:
            if (r0 >= r1) goto L4c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r6.mCachedViews
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r3
            if (r3 == 0) goto L49
            r3.addFlags(r2)
            r4 = 0
            r3.addChangePayload(r4)
        L49:
            int r0 = r0 + 1
            goto L36
        L4c:
            androidx.recyclerview.widget.RecyclerView r0 = r6.this$0
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.mAdapter
            if (r0 == 0) goto L58
            boolean r0 = r0.hasStableIds()
            if (r0 != 0) goto L5b
        L58:
            r6.recycleAndClearCachedViews()
        L5b:
            return
    }

    public final void recordAnimationInfoIfBouncedHiddenView(androidx.recyclerview.widget.RecyclerView.ViewHolder r4, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r5) {
            r3 = this;
            r0 = 0
            r1 = 8192(0x2000, float:1.148E-41)
            r4.setFlags(r0, r1)
            androidx.recyclerview.widget.RecyclerView$State r0 = r3.mState
            boolean r0 = r0.mTrackOldChangeHolders
            if (r0 == 0) goto L29
            boolean r0 = r4.isUpdated()
            if (r0 == 0) goto L29
            boolean r0 = r4.isRemoved()
            if (r0 != 0) goto L29
            boolean r0 = r4.shouldIgnore()
            if (r0 != 0) goto L29
            long r0 = r3.getChangedHolderKey(r4)
            androidx.recyclerview.widget.ViewInfoStore r2 = r3.mViewInfoStore
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r2.mOldChangedHolders
            r2.put(r0, r4)
        L29:
            androidx.recyclerview.widget.ViewInfoStore r0 = r3.mViewInfoStore
            r0.addToPreLayout(r4, r5)
            return
    }

    public final void removeAndRecycleViews() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r2.mItemAnimator
            if (r0 == 0) goto L7
            r0.endAnimations()
        L7:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L17
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r2.mRecycler
            r0.removeAndRecycleAllViews(r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r2.mRecycler
            r0.removeAndRecycleScrapInt(r1)
        L17:
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r2.mRecycler
            r0.clear()
            return
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(android.view.View r3, boolean r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = getChildViewHolderInt(r3)
            if (r0 == 0) goto L31
            boolean r1 = r0.isTmpDetached()
            if (r1 == 0) goto L13
            int r1 = r0.mFlags
            r1 = r1 & (-257(0xfffffffffffffeff, float:NaN))
            r0.mFlags = r1
            goto L31
        L13:
            boolean r1 = r0.shouldIgnore()
            if (r1 == 0) goto L1a
            goto L31
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Called removeDetachedView with a view which is not flagged as tmp detached."
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r4)
            r3.<init>(r4)
            throw r3
        L31:
            r3.clearAnimation()
            r2.dispatchChildDetached(r3)
            super.removeDetachedView(r3, r4)
            return
    }

    public void removeItemDecoration(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemDecoration r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L9
            java.lang.String r1 = "Cannot remove item decoration during a scroll  or layout"
            r0.assertNotInLayoutOrScroll(r1)
        L9:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r2.mItemDecorations
            r0.remove(r3)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r3 = r2.mItemDecorations
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L23
            int r3 = r2.getOverScrollMode()
            r0 = 2
            if (r3 != r0) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            r2.setWillNotDraw(r3)
        L23:
            r2.markItemDecorInsetsDirty()
            r2.requestLayout()
            return
    }

    public void removeItemDecorationAt(int r4) {
            r3 = this;
            int r0 = r3.getItemDecorationCount()
            if (r4 < 0) goto L10
            if (r4 >= r0) goto L10
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r4 = r3.getItemDecorationAt(r4)
            r3.removeItemDecoration(r4)
            return
        L10:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " is an invalid index for size "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    public void removeOnChildAttachStateChangeListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener> r0 = r1.mOnChildAttachStateListeners
            if (r0 != 0) goto L5
            return
        L5:
            r0.remove(r2)
            return
    }

    public void removeOnItemTouchListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OnItemTouchListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$OnItemTouchListener> r0 = r1.mOnItemTouchListeners
            r0.remove(r2)
            androidx.recyclerview.widget.RecyclerView$OnItemTouchListener r0 = r1.mInterceptingOnItemTouchListener
            if (r0 != r2) goto Lc
            r2 = 0
            r1.mInterceptingOnItemTouchListener = r2
        Lc:
            return
    }

    public void removeOnScrollListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.OnScrollListener r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r0 = r1.mScrollListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    public void removeRecyclerListener(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.RecyclerListener r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$RecyclerListener> r0 = r1.mRecyclerListeners
            r0.remove(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r3, android.view.View r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            boolean r0 = r0.onRequestChildFocus(r2, r1, r3, r4)
            if (r0 != 0) goto Lf
            if (r4 == 0) goto Lf
            r2.requestChildOnScreen(r3, r4)
        Lf:
            super.requestChildFocus(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r2, android.graphics.Rect r3, boolean r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            boolean r2 = r0.requestChildRectangleOnScreen(r1, r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r4) {
            r3 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$OnItemTouchListener> r0 = r3.mOnItemTouchListeners
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$OnItemTouchListener> r2 = r3.mOnItemTouchListeners
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.RecyclerView$OnItemTouchListener r2 = (androidx.recyclerview.widget.RecyclerView.OnItemTouchListener) r2
            r2.onRequestDisallowInterceptTouchEvent(r4)
            int r1 = r1 + 1
            goto L7
        L17:
            super.requestDisallowInterceptTouchEvent(r4)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            int r0 = r1.mInterceptRequestLayoutDepth
            if (r0 != 0) goto Lc
            boolean r0 = r1.mLayoutSuppressed
            if (r0 != 0) goto Lc
            super.requestLayout()
            goto Lf
        Lc:
            r0 = 1
            r1.mLayoutWasDefered = r0
        Lf:
            return
    }

    @Override // android.view.View
    public void scrollBy(int r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            if (r0 != 0) goto Lc
            java.lang.String r4 = "RecyclerView"
            java.lang.String r5 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r4, r5)
            return
        Lc:
            boolean r1 = r3.mLayoutSuppressed
            if (r1 == 0) goto L11
            return
        L11:
            boolean r0 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r3.mLayout
            boolean r1 = r1.canScrollVertically()
            if (r0 != 0) goto L1f
            if (r1 == 0) goto L2c
        L1f:
            r2 = 0
            if (r0 == 0) goto L23
            goto L24
        L23:
            r4 = 0
        L24:
            if (r1 == 0) goto L27
            goto L28
        L27:
            r5 = 0
        L28:
            r0 = 0
            r3.scrollByInternal(r4, r5, r0, r2)
        L2c:
            return
    }

    public final boolean scrollByInternal(int r19, int r20, android.view.MotionEvent r21, int r22) {
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r18.consumePendingUpdateOperations()
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r8.mAdapter
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L2b
            int[] r0 = r8.mReusableIntPair
            r0[r13] = r13
            r0[r12] = r13
            r8.scrollStep(r9, r10, r0)
            int[] r0 = r8.mReusableIntPair
            r1 = r0[r13]
            r0 = r0[r12]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L31
        L2b:
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L31:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ItemDecoration> r0 = r8.mItemDecorations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3c
            r18.invalidate()
        L3c:
            int[] r7 = r8.mReusableIntPair
            r7[r13] = r13
            r7[r12] = r13
            int[] r5 = r8.mScrollOffset
            r0 = r18
            r1 = r15
            r2 = r14
            r3 = r16
            r4 = r17
            r6 = r22
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.mReusableIntPair
            r1 = r0[r13]
            int r1 = r16 - r1
            r2 = r0[r12]
            int r2 = r17 - r2
            r3 = r0[r13]
            if (r3 != 0) goto L66
            r0 = r0[r12]
            if (r0 == 0) goto L64
            goto L66
        L64:
            r0 = 0
            goto L67
        L66:
            r0 = 1
        L67:
            int r3 = r8.mLastTouchX
            int[] r4 = r8.mScrollOffset
            r5 = r4[r13]
            int r3 = r3 - r5
            r8.mLastTouchX = r3
            int r3 = r8.mLastTouchY
            r5 = r4[r12]
            int r3 = r3 - r5
            r8.mLastTouchY = r3
            int[] r3 = r8.mNestedOffsets
            r5 = r3[r13]
            r6 = r4[r13]
            int r5 = r5 + r6
            r3[r13] = r5
            r5 = r3[r12]
            r4 = r4[r12]
            int r5 = r5 + r4
            r3[r12] = r5
            int r3 = r18.getOverScrollMode()
            r4 = 2
            if (r3 == r4) goto La8
            if (r11 == 0) goto La5
            r3 = 8194(0x2002, float:1.1482E-41)
            boolean r3 = androidx.core.view.MotionEventCompat.isFromSource(r11, r3)
            if (r3 != 0) goto La5
            float r3 = r21.getX()
            float r1 = (float) r1
            float r4 = r21.getY()
            float r2 = (float) r2
            r8.pullGlows(r3, r1, r4, r2)
        La5:
            r18.considerReleasingGlowsOnScroll(r19, r20)
        La8:
            if (r15 != 0) goto Lac
            if (r14 == 0) goto Laf
        Lac:
            r8.dispatchOnScrolled(r15, r14)
        Laf:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto Lb8
            r18.invalidate()
        Lb8:
            if (r0 != 0) goto Lc0
            if (r15 != 0) goto Lc0
            if (r14 == 0) goto Lbf
            goto Lc0
        Lbf:
            r12 = 0
        Lc0:
            return r12
    }

    public final void scrollStep(int r9, int r10, @androidx.annotation.Nullable int[] r11) {
            r8 = this;
            r8.startInterceptRequestLayout()
            r8.onEnterLayoutOrScroll()
            java.lang.String r0 = "RV Scroll"
            androidx.core.os.TraceCompat.beginSection(r0)
            androidx.recyclerview.widget.RecyclerView$State r0 = r8.mState
            r8.fillRemainingScrollValues(r0)
            r0 = 0
            if (r9 == 0) goto L1e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r8.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r2 = r8.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r3 = r8.mState
            int r9 = r1.scrollHorizontallyBy(r9, r2, r3)
            goto L1f
        L1e:
            r9 = 0
        L1f:
            if (r10 == 0) goto L2c
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r8.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r2 = r8.mRecycler
            androidx.recyclerview.widget.RecyclerView$State r3 = r8.mState
            int r10 = r1.scrollVerticallyBy(r10, r2, r3)
            goto L2d
        L2c:
            r10 = 0
        L2d:
            androidx.core.os.TraceCompat.endSection()
            androidx.recyclerview.widget.ChildHelper r1 = r8.mChildHelper
            int r1 = r1.getChildCount()
            r2 = 0
        L37:
            if (r2 >= r1) goto L6f
            androidx.recyclerview.widget.ChildHelper r3 = r8.mChildHelper
            android.view.View r3 = r3.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r8.getChildViewHolder(r3)
            if (r4 == 0) goto L6c
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r4.mShadowingHolder
            if (r4 == 0) goto L6c
            android.view.View r4 = r4.itemView
            int r5 = r3.getLeft()
            int r3 = r3.getTop()
            int r6 = r4.getLeft()
            if (r5 != r6) goto L5f
            int r6 = r4.getTop()
            if (r3 == r6) goto L6c
        L5f:
            int r6 = r4.getWidth()
            int r6 = r6 + r5
            int r7 = r4.getHeight()
            int r7 = r7 + r3
            r4.layout(r5, r3, r6, r7)
        L6c:
            int r2 = r2 + 1
            goto L37
        L6f:
            r1 = 1
            r8.onExitLayoutOrScroll(r1)
            r8.stopInterceptRequestLayout(r0)
            if (r11 == 0) goto L7c
            r11[r0] = r9
            r11[r1] = r10
        L7c:
            return
    }

    @Override // android.view.View
    public void scrollTo(int r1, int r2) {
            r0 = this;
            java.lang.String r1 = "RecyclerView"
            java.lang.String r2 = "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead"
            android.util.Log.w(r1, r2)
            return
    }

    public void scrollToPosition(int r2) {
            r1 = this;
            boolean r0 = r1.mLayoutSuppressed
            if (r0 == 0) goto L5
            return
        L5:
            r1.stopScroll()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.mLayout
            if (r0 != 0) goto L14
            java.lang.String r2 = "RecyclerView"
            java.lang.String r0 = "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r2, r0)
            return
        L14:
            r0.scrollToPosition(r2)
            r1.awakenScrollBars()
            return
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            boolean r0 = r2.isComputingLayout()
            r1 = 0
            if (r0 == 0) goto L19
            if (r3 == 0) goto Le
            int r0 = androidx.core.view.accessibility.AccessibilityEventCompat.getContentChangeTypes(r3)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L12
            goto L13
        L12:
            r1 = r0
        L13:
            int r0 = r2.mEatenAccessibilityChangeFlags
            r0 = r0 | r1
            r2.mEatenAccessibilityChangeFlags = r0
            r1 = 1
        L19:
            if (r1 == 0) goto L1c
            return
        L1c:
            super.sendAccessibilityEventUnchecked(r3)
            return
    }

    public void setAccessibilityDelegateCompat(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate r1) {
            r0 = this;
            r0.mAccessibilityDelegate = r1
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            return
    }

    public void setAdapter(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r3) {
            r2 = this;
            r0 = 0
            r2.setLayoutFrozen(r0)
            r1 = 1
            r2.setAdapterInternal(r3, r0, r1)
            r2.processDataSetCompletelyChanged(r0)
            r2.requestLayout()
            return
    }

    public void setChildDrawingOrderCallback(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ChildDrawingOrderCallback r0 = r1.mChildDrawingOrderCallback
            if (r2 != r0) goto L5
            return
        L5:
            r1.mChildDrawingOrderCallback = r2
            if (r2 == 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setChildrenDrawingOrderEnabled(r2)
            return
    }

    @androidx.annotation.VisibleForTesting
    public final boolean setChildImportantForAccessibilityInternal(androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3) {
            r1 = this;
            boolean r0 = r1.isComputingLayout()
            if (r0 == 0) goto Lf
            r2.mPendingAccessibilityState = r3
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r1.mPendingAccessibilityImportanceChange
            r3.add(r2)
            r2 = 0
            return r2
        Lf:
            android.view.View r2 = r2.itemView
            androidx.core.view.ViewCompat.setImportantForAccessibility(r2, r3)
            r2 = 1
            return r2
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.mClipToPadding
            if (r2 == r0) goto L7
            r1.invalidateGlows()
        L7:
            r1.mClipToPadding = r2
            super.setClipToPadding(r2)
            boolean r2 = r1.mFirstLayoutComplete
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setEdgeEffectFactory(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory r1) {
            r0 = this;
            androidx.core.util.Preconditions.checkNotNull(r1)
            r0.mEdgeEffectFactory = r1
            r0.invalidateGlows()
            return
    }

    public void setHasFixedSize(boolean r1) {
            r0 = this;
            r0.mHasFixedSize = r1
            return
    }

    public void setItemAnimator(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ItemAnimator r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r2.mItemAnimator
            if (r0 == 0) goto Ld
            r0.endAnimations()
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r2.mItemAnimator
            r1 = 0
            r0.setListener(r1)
        Ld:
            r2.mItemAnimator = r3
            if (r3 == 0) goto L16
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorListener r0 = r2.mItemAnimatorListener
            r3.setListener(r0)
        L16:
            return
    }

    public void setItemViewCacheSize(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r1.mRecycler
            r0.setViewCacheSize(r2)
            return
    }

    @java.lang.Deprecated
    public void setLayoutFrozen(boolean r1) {
            r0 = this;
            r0.suppressLayout(r1)
            return
    }

    public void setLayoutManager(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.LayoutManager r5) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            if (r5 != r0) goto L5
            return
        L5:
            r4.stopScroll()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            if (r0 == 0) goto L3d
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r4.mItemAnimator
            if (r0 == 0) goto L13
            r0.endAnimations()
        L13:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r4.mRecycler
            r0.removeAndRecycleAllViews(r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r4.mRecycler
            r0.removeAndRecycleScrapInt(r1)
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r4.mRecycler
            r0.clear()
            boolean r0 = r4.mIsAttached
            if (r0 == 0) goto L34
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r4.mRecycler
            r2 = 0
            r0.mIsAttachedToWindow = r2
            r0.onDetachedFromWindow(r4, r1)
        L34:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            r1 = 0
            r0.setRecyclerView(r1)
            r4.mLayout = r1
            goto L42
        L3d:
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r4.mRecycler
            r0.clear()
        L42:
            androidx.recyclerview.widget.ChildHelper r0 = r4.mChildHelper
            androidx.recyclerview.widget.ChildHelper$Bucket r1 = r0.mBucket
            r2 = 0
            r1.mData = r2
            androidx.recyclerview.widget.ChildHelper$Bucket r1 = r1.mNext
            if (r1 == 0) goto L51
            r1.reset()
        L51:
            java.util.List<android.view.View> r1 = r0.mHiddenViews
            int r1 = r1.size()
        L57:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L6e
            androidx.recyclerview.widget.ChildHelper$Callback r2 = r0.mCallback
            java.util.List<android.view.View> r3 = r0.mHiddenViews
            java.lang.Object r3 = r3.get(r1)
            android.view.View r3 = (android.view.View) r3
            r2.onLeftHiddenState(r3)
            java.util.List<android.view.View> r2 = r0.mHiddenViews
            r2.remove(r1)
            goto L57
        L6e:
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r0.mCallback
            r0.removeAllViews()
            r4.mLayout = r5
            if (r5 == 0) goto La9
            androidx.recyclerview.widget.RecyclerView r0 = r5.mRecyclerView
            if (r0 != 0) goto L8b
            r5.setRecyclerView(r4)
            boolean r5 = r4.mIsAttached
            if (r5 == 0) goto La9
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r4.mLayout
            r0 = 1
            r5.mIsAttachedToWindow = r0
            r5.onAttachedToWindow(r4)
            goto La9
        L8b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LayoutManager "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " is already attached to a RecyclerView:"
            r1.append(r2)
            androidx.recyclerview.widget.RecyclerView r5 = r5.mRecyclerView
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r1)
            r0.<init>(r5)
            throw r0
        La9:
            androidx.recyclerview.widget.RecyclerView$Recycler r5 = r4.mRecycler
            r5.updateViewCacheSize()
            r4.requestLayout()
            return
    }

    @Override // android.view.ViewGroup
    @java.lang.Deprecated
    public void setLayoutTransition(android.animation.LayoutTransition r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            super.setLayoutTransition(r2)
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            r0.setNestedScrollingEnabled(r2)
            return
    }

    public void setOnFlingListener(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.OnFlingListener r1) {
            r0 = this;
            r0.mOnFlingListener = r1
            return
    }

    @java.lang.Deprecated
    public void setOnScrollListener(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.OnScrollListener r1) {
            r0 = this;
            r0.mScrollListener = r1
            return
    }

    public void setPreserveFocusAfterLayout(boolean r1) {
            r0 = this;
            r0.mPreserveFocusAfterLayout = r1
            return
    }

    public void setRecycledViewPool(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.RecycledViewPool r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r2.mRecycler
            androidx.recyclerview.widget.RecyclerView$RecycledViewPool r1 = r0.mRecyclerPool
            if (r1 == 0) goto L9
            r1.detach()
        L9:
            r0.mRecyclerPool = r3
            if (r3 == 0) goto L1a
            androidx.recyclerview.widget.RecyclerView r3 = r0.this$0
            androidx.recyclerview.widget.RecyclerView$Adapter r3 = r3.getAdapter()
            if (r3 == 0) goto L1a
            androidx.recyclerview.widget.RecyclerView$RecycledViewPool r3 = r0.mRecyclerPool
            r3.attach()
        L1a:
            return
    }

    @java.lang.Deprecated
    public void setRecyclerListener(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.RecyclerListener r1) {
            r0 = this;
            r0.mRecyclerListener = r1
            return
    }

    void setScrollState(int r3) {
            r2 = this;
            int r0 = r2.mScrollState
            if (r3 != r0) goto L5
            return
        L5:
            r2.mScrollState = r3
            r0 = 2
            if (r3 == r0) goto Ld
            r2.stopScrollersInternal()
        Ld:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 == 0) goto L14
            r0.onScrollStateChanged(r3)
        L14:
            r2.onScrollStateChanged(r3)
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r0 = r2.mScrollListener
            if (r0 == 0) goto L1e
            r0.onScrollStateChanged(r2, r3)
        L1e:
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r0 = r2.mScrollListeners
            if (r0 == 0) goto L36
            int r0 = r0.size()
        L26:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L36
            java.util.List<androidx.recyclerview.widget.RecyclerView$OnScrollListener> r1 = r2.mScrollListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r1 = (androidx.recyclerview.widget.RecyclerView.OnScrollListener) r1
            r1.onScrollStateChanged(r2, r3)
            goto L26
        L36:
            return
    }

    public void setScrollingTouchSlop(int r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            if (r4 == 0) goto L31
            r1 = 1
            if (r4 == r1) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setScrollingTouchSlop(): bad argument constant "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "; using default value"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.w(r1, r4)
            goto L31
        L2a:
            int r4 = r0.getScaledPagingTouchSlop()
            r3.mTouchSlop = r4
            goto L37
        L31:
            int r4 = r0.getScaledTouchSlop()
            r3.mTouchSlop = r4
        L37:
            return
    }

    public void setViewCacheExtension(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ViewCacheExtension r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r1.mRecycler
            r0.setViewCacheExtension(r2)
            return
    }

    public void smoothScrollBy(@androidx.annotation.Px int r2, @androidx.annotation.Px int r3) {
            r1 = this;
            r0 = 0
            r1.smoothScrollBy(r2, r3, r0)
            return
    }

    public void smoothScrollBy(@androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Nullable android.view.animation.Interpolator r4) {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.smoothScrollBy(r2, r3, r4, r0)
            return
    }

    public void smoothScrollBy(@androidx.annotation.Px int r7, @androidx.annotation.Px int r8, @androidx.annotation.Nullable android.view.animation.Interpolator r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.smoothScrollBy(r1, r2, r3, r4, r5)
            return
    }

    public final void smoothScrollBy(@androidx.annotation.Px int r4, @androidx.annotation.Px int r5, @androidx.annotation.Nullable android.view.animation.Interpolator r6, int r7, boolean r8) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            if (r0 != 0) goto Lc
            java.lang.String r4 = "RecyclerView"
            java.lang.String r5 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r4, r5)
            return
        Lc:
            boolean r1 = r3.mLayoutSuppressed
            if (r1 == 0) goto L11
            return
        L11:
            boolean r0 = r0.canScrollHorizontally()
            r1 = 0
            if (r0 != 0) goto L19
            r4 = 0
        L19:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 != 0) goto L22
            r5 = 0
        L22:
            if (r4 != 0) goto L26
            if (r5 == 0) goto L48
        L26:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            if (r7 == r0) goto L30
            if (r7 <= 0) goto L2e
            goto L30
        L2e:
            r0 = 0
            goto L31
        L30:
            r0 = 1
        L31:
            if (r0 == 0) goto L45
            if (r8 == 0) goto L3f
            if (r4 == 0) goto L38
            r1 = 1
        L38:
            if (r5 == 0) goto L3c
            r1 = r1 | 2
        L3c:
            r3.startNestedScroll(r1, r2)
        L3f:
            androidx.recyclerview.widget.RecyclerView$ViewFlinger r8 = r3.mViewFlinger
            r8.smoothScrollBy(r4, r5, r7, r6)
            goto L48
        L45:
            r3.scrollBy(r4, r5)
        L48:
            return
    }

    public void smoothScrollToPosition(int r3) {
            r2 = this;
            boolean r0 = r2.mLayoutSuppressed
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.mLayout
            if (r0 != 0) goto L11
            java.lang.String r3 = "RecyclerView"
            java.lang.String r0 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r3, r0)
            return
        L11:
            androidx.recyclerview.widget.RecyclerView$State r1 = r2.mState
            r0.smoothScrollToPosition(r2, r1, r3)
            return
    }

    public final void startInterceptRequestLayout() {
            r2 = this;
            int r0 = r2.mInterceptRequestLayoutDepth
            r1 = 1
            int r0 = r0 + r1
            r2.mInterceptRequestLayoutDepth = r0
            if (r0 != r1) goto Lf
            boolean r0 = r2.mLayoutSuppressed
            if (r0 != 0) goto Lf
            r0 = 0
            r2.mLayoutWasDefered = r0
        Lf:
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.startNestedScroll(r2)
            return r2
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int r2, int r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.startNestedScroll(r2, r3)
            return r2
    }

    public final void stopInterceptRequestLayout(boolean r4) {
            r3 = this;
            int r0 = r3.mInterceptRequestLayoutDepth
            r1 = 1
            if (r0 >= r1) goto L7
            r3.mInterceptRequestLayoutDepth = r1
        L7:
            r0 = 0
            if (r4 != 0) goto L10
            boolean r2 = r3.mLayoutSuppressed
            if (r2 != 0) goto L10
            r3.mLayoutWasDefered = r0
        L10:
            int r2 = r3.mInterceptRequestLayoutDepth
            if (r2 != r1) goto L2f
            if (r4 == 0) goto L29
            boolean r4 = r3.mLayoutWasDefered
            if (r4 == 0) goto L29
            boolean r4 = r3.mLayoutSuppressed
            if (r4 != 0) goto L29
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r3.mLayout
            if (r4 == 0) goto L29
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = r3.mAdapter
            if (r4 == 0) goto L29
            r3.dispatchLayout()
        L29:
            boolean r4 = r3.mLayoutSuppressed
            if (r4 != 0) goto L2f
            r3.mLayoutWasDefered = r0
        L2f:
            int r4 = r3.mInterceptRequestLayoutDepth
            int r4 = r4 - r1
            r3.mInterceptRequestLayoutDepth = r4
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            r0.stopNestedScroll()
            return
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.getScrollingChildHelper()
            r0.stopNestedScroll(r2)
            return
    }

    public void stopScroll() {
            r1 = this;
            r0 = 0
            r1.setScrollState(r0)
            r1.stopScrollersInternal()
            return
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean r10) {
            r9 = this;
            boolean r0 = r9.mLayoutSuppressed
            if (r10 == r0) goto L38
            java.lang.String r0 = "Do not suppressLayout in layout or scroll"
            r9.assertNotInLayoutOrScroll(r0)
            if (r10 != 0) goto L20
            r10 = 0
            r9.mLayoutSuppressed = r10
            boolean r0 = r9.mLayoutWasDefered
            if (r0 == 0) goto L1d
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r9.mLayout
            if (r0 == 0) goto L1d
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r9.mAdapter
            if (r0 == 0) goto L1d
            r9.requestLayout()
        L1d:
            r9.mLayoutWasDefered = r10
            goto L38
        L20:
            long r3 = android.os.SystemClock.uptimeMillis()
            r5 = 3
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r3
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            r9.onTouchEvent(r10)
            r10 = 1
            r9.mLayoutSuppressed = r10
            r9.mIgnoreMotionEventTillDown = r10
            r9.stopScroll()
        L38:
            return
    }

    public void swapAdapter(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.setLayoutFrozen(r0)
            r0 = 1
            r1.setAdapterInternal(r2, r0, r3)
            r1.processDataSetCompletelyChanged(r0)
            r1.requestLayout()
            return
    }
}
