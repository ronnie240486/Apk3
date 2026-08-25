package androidx.viewpager2.widget;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends android.view.ViewGroup {
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider mAccessibilityProvider;
    public int mCurrentItem;
    private androidx.recyclerview.widget.RecyclerView.AdapterDataObserver mCurrentItemDataSetChangeObserver;
    public boolean mCurrentItemDirty;
    private androidx.viewpager2.widget.CompositeOnPageChangeCallback mExternalPageChangeCallbacks;
    private androidx.viewpager2.widget.FakeDrag mFakeDragger;
    private androidx.recyclerview.widget.LinearLayoutManager mLayoutManager;
    private int mOffscreenPageLimit;
    private androidx.viewpager2.widget.CompositeOnPageChangeCallback mPageChangeEventDispatcher;
    private androidx.viewpager2.widget.PageTransformerAdapter mPageTransformerAdapter;
    private androidx.recyclerview.widget.PagerSnapHelper mPagerSnapHelper;
    private android.os.Parcelable mPendingAdapterState;
    private int mPendingCurrentItem;
    public androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private androidx.recyclerview.widget.RecyclerView.ItemAnimator mSavedItemAnimator;
    private boolean mSavedItemAnimatorPresent;
    public androidx.viewpager2.widget.ScrollEventAdapter mScrollEventAdapter;
    private final android.graphics.Rect mTmpChildRect;
    private final android.graphics.Rect mTmpContainerRect;
    private boolean mUserInputEnabled;





    public abstract class AccessibilityProvider {
        private AccessibilityProvider(androidx.viewpager2.widget.ViewPager2 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ AccessibilityProvider(androidx.viewpager2.widget.ViewPager2 r1, androidx.viewpager2.widget.ViewPager2.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class BasicAccessibilityProvider extends androidx.viewpager2.widget.ViewPager2.AccessibilityProvider {
        public final /* synthetic */ androidx.viewpager2.widget.ViewPager2 this$0;

        public boolean handlesLmPerformAccessibilityAction(int r2) {
                r1 = this;
                r0 = 8192(0x2000, float:1.148E-41)
                if (r2 == r0) goto L8
                r0 = 4096(0x1000, float:5.74E-42)
                if (r2 != r0) goto L12
            L8:
                androidx.viewpager2.widget.ViewPager2 r2 = r1.this$0
                boolean r2 = r2.isUserInputEnabled()
                if (r2 != 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        public boolean handlesRvGetAccessibilityClassName() {
                r1 = this;
                r0 = 1
                return r0
        }

        public void onLmInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r1.this$0
                boolean r0 = r0.isUserInputEnabled()
                if (r0 != 0) goto L16
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                r2.removeAction(r0)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD
                r2.removeAction(r0)
                r0 = 0
                r2.setScrollable(r0)
            L16:
                return
        }

        public boolean onLmPerformAccessibilityAction(int r1) {
                r0 = this;
                boolean r1 = r0.handlesLmPerformAccessibilityAction(r1)
                if (r1 == 0) goto L8
                r1 = 0
                return r1
            L8:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
        }

        public java.lang.CharSequence onRvGetAccessibilityClassName() {
                r1 = this;
                boolean r0 = r1.handlesRvGetAccessibilityClassName()
                if (r0 == 0) goto L9
                java.lang.String r0 = "androidx.viewpager.widget.ViewPager"
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class DataSetChangeObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        private DataSetChangeObserver() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ DataSetChangeObserver(androidx.viewpager2.widget.ViewPager2.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int r1, int r2, @androidx.annotation.Nullable java.lang.Object r3) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int r1, int r2, int r3) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class LinearLayoutManagerImpl extends androidx.recyclerview.widget.LinearLayoutManager {
        public final /* synthetic */ androidx.viewpager2.widget.ViewPager2 this$0;

        public LinearLayoutManagerImpl(androidx.viewpager2.widget.ViewPager2 r1, android.content.Context r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r3, @androidx.annotation.NonNull int[] r4) {
                r2 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r2.this$0
                int r0 = r0.getOffscreenPageLimit()
                r1 = -1
                if (r0 != r1) goto Ld
                super.calculateExtraLayoutSpace(r3, r4)
                return
            Ld:
                androidx.viewpager2.widget.ViewPager2 r3 = r2.this$0
                int r3 = r3.getPageSize()
                int r3 = r3 * r0
                r0 = 0
                r4[r0] = r3
                r0 = 1
                r4[r0] = r3
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r2, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3) {
                r0 = this;
                super.onInitializeAccessibilityNodeInfo(r1, r2, r3)
                androidx.viewpager2.widget.ViewPager2 r1 = r0.this$0
                androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r1 = r1.mAccessibilityProvider
                java.util.Objects.requireNonNull(r1)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Recycler r2, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.State r3, int r4, @androidx.annotation.Nullable android.os.Bundle r5) {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r1.this$0
                androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r0 = r0.mAccessibilityProvider
                java.util.Objects.requireNonNull(r0)
                boolean r2 = super.performAccessibilityAction(r2, r3, r4, r5)
                return r2
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.graphics.Rect r3, boolean r4, boolean r5) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    @androidx.annotation.IntRange(from = 1)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface OffscreenPageLimit {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class OnPageChangeCallback {
        public OnPageChangeCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onPageScrollStateChanged(int r1) {
                r0 = this;
                return
        }

        public void onPageScrolled(int r1, float r2, @androidx.annotation.Px int r3) {
                r0 = this;
                return
        }

        public void onPageSelected(int r1) {
                r0 = this;
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Orientation {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PageAwareAccessibilityProvider extends androidx.viewpager2.widget.ViewPager2.AccessibilityProvider {
        private final androidx.core.view.accessibility.AccessibilityViewCommand mActionPageBackward;
        private final androidx.core.view.accessibility.AccessibilityViewCommand mActionPageForward;
        private androidx.recyclerview.widget.RecyclerView.AdapterDataObserver mAdapterDataObserver;
        public final /* synthetic */ androidx.viewpager2.widget.ViewPager2 this$0;




        public PageAwareAccessibilityProvider(androidx.viewpager2.widget.ViewPager2 r2) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider$1 r2 = new androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider$1
                r2.<init>(r1)
                r1.mActionPageForward = r2
                androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider$2 r2 = new androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider$2
                r2.<init>(r1)
                r1.mActionPageBackward = r2
                return
        }

        private void addCollectionInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
                r3 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                r1 = 0
                if (r0 == 0) goto L2a
                androidx.viewpager2.widget.ViewPager2 r0 = r3.this$0
                int r0 = r0.getOrientation()
                r2 = 1
                if (r0 != r2) goto L1d
                androidx.viewpager2.widget.ViewPager2 r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                int r0 = r0.getItemCount()
                goto L2b
            L1d:
                androidx.viewpager2.widget.ViewPager2 r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                int r0 = r0.getItemCount()
                r2 = r0
                r0 = 0
                goto L2c
            L2a:
                r0 = 0
            L2b:
                r2 = 0
            L2c:
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r0, r2, r1, r1)
                r4.setCollectionInfo(r0)
                return
        }

        private void addScrollActions(android.view.accessibility.AccessibilityNodeInfo r4) {
                r3 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                if (r0 != 0) goto L9
                return
            L9:
                int r0 = r0.getItemCount()
                if (r0 == 0) goto L33
                androidx.viewpager2.widget.ViewPager2 r1 = r3.this$0
                boolean r1 = r1.isUserInputEnabled()
                if (r1 != 0) goto L18
                goto L33
            L18:
                androidx.viewpager2.widget.ViewPager2 r1 = r3.this$0
                int r1 = r1.mCurrentItem
                if (r1 <= 0) goto L23
                r1 = 8192(0x2000, float:1.148E-41)
                r4.addAction(r1)
            L23:
                androidx.viewpager2.widget.ViewPager2 r1 = r3.this$0
                int r1 = r1.mCurrentItem
                r2 = 1
                int r0 = r0 - r2
                if (r1 >= r0) goto L30
                r0 = 4096(0x1000, float:5.74E-42)
                r4.addAction(r0)
            L30:
                r4.setScrollable(r2)
            L33:
                return
        }

        public boolean handlesGetAccessibilityClassName() {
                r1 = this;
                r0 = 1
                return r0
        }

        public boolean handlesPerformAccessibilityAction(int r1, android.os.Bundle r2) {
                r0 = this;
                r2 = 8192(0x2000, float:1.148E-41)
                if (r1 == r2) goto Lb
                r2 = 4096(0x1000, float:5.74E-42)
                if (r1 != r2) goto L9
                goto Lb
            L9:
                r1 = 0
                goto Lc
            Lb:
                r1 = 1
            Lc:
                return r1
        }

        public void onAttachAdapter(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter<?> r2) {
                r1 = this;
                r1.updatePageAccessibilityActions()
                if (r2 == 0) goto La
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r0 = r1.mAdapterDataObserver
                r2.registerAdapterDataObserver(r0)
            La:
                return
        }

        public void onDetachAdapter(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter<?> r2) {
                r1 = this;
                if (r2 == 0) goto L7
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r0 = r1.mAdapterDataObserver
                r2.unregisterAdapterDataObserver(r0)
            L7:
                return
        }

        public java.lang.String onGetAccessibilityClassName() {
                r1 = this;
                boolean r0 = r1.handlesGetAccessibilityClassName()
                if (r0 == 0) goto L9
                java.lang.String r0 = "androidx.viewpager.widget.ViewPager"
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        public void onInitialize(@androidx.annotation.NonNull androidx.viewpager2.widget.CompositeOnPageChangeCallback r1, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                r1 = 2
                androidx.core.view.ViewCompat.setImportantForAccessibility(r2, r1)
                androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider$3 r1 = new androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider$3
                r1.<init>(r0)
                r0.mAdapterDataObserver = r1
                androidx.viewpager2.widget.ViewPager2 r1 = r0.this$0
                int r1 = androidx.core.view.ViewCompat.getImportantForAccessibility(r1)
                if (r1 != 0) goto L19
                androidx.viewpager2.widget.ViewPager2 r1 = r0.this$0
                r2 = 1
                androidx.core.view.ViewCompat.setImportantForAccessibility(r1, r2)
            L19:
                return
        }

        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
                r0 = this;
                r0.addCollectionInfo(r1)
                r0.addScrollActions(r1)
                return
        }

        public boolean onPerformAccessibilityAction(int r2, android.os.Bundle r3) {
                r1 = this;
                boolean r3 = r1.handlesPerformAccessibilityAction(r2, r3)
                if (r3 == 0) goto L1e
                r3 = 8192(0x2000, float:1.148E-41)
                r0 = 1
                if (r2 != r3) goto L13
                androidx.viewpager2.widget.ViewPager2 r2 = r1.this$0
                int r2 = r2.getCurrentItem()
                int r2 = r2 - r0
                goto L1a
            L13:
                androidx.viewpager2.widget.ViewPager2 r2 = r1.this$0
                int r2 = r2.getCurrentItem()
                int r2 = r2 + r0
            L1a:
                r1.setCurrentItemFromAccessibilityCommand(r2)
                return r0
            L1e:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>()
                throw r2
        }

        public void onRestorePendingState() {
                r0 = this;
                r0.updatePageAccessibilityActions()
                return
        }

        public void onRvInitializeAccessibilityEvent(@androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r2) {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r1.this$0
                r2.setSource(r0)
                java.lang.String r0 = r1.onGetAccessibilityClassName()
                r2.setClassName(r0)
                return
        }

        public void onSetLayoutDirection() {
                r0 = this;
                r0.updatePageAccessibilityActions()
                return
        }

        public void onSetNewCurrentItem() {
                r0 = this;
                r0.updatePageAccessibilityActions()
                return
        }

        public void onSetOrientation() {
                r0 = this;
                r0.updatePageAccessibilityActions()
                return
        }

        public void onSetUserInputEnabled() {
                r0 = this;
                r0.updatePageAccessibilityActions()
                return
        }

        public final void setCurrentItemFromAccessibilityCommand(int r3) {
                r2 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r2.this$0
                boolean r0 = r0.isUserInputEnabled()
                if (r0 == 0) goto Le
                androidx.viewpager2.widget.ViewPager2 r0 = r2.this$0
                r1 = 1
                r0.setCurrentItemInternal(r3, r1)
            Le:
                return
        }

        public final void updatePageAccessibilityActions() {
                r8 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r8.this$0
                r1 = 16908360(0x1020048, float:2.387743E-38)
                androidx.core.view.ViewCompat.removeAccessibilityAction(r0, r1)
                r2 = 16908361(0x1020049, float:2.3877434E-38)
                androidx.core.view.ViewCompat.removeAccessibilityAction(r0, r2)
                r3 = 16908358(0x1020046, float:2.3877425E-38)
                androidx.core.view.ViewCompat.removeAccessibilityAction(r0, r3)
                r4 = 16908359(0x1020047, float:2.3877428E-38)
                androidx.core.view.ViewCompat.removeAccessibilityAction(r0, r4)
                androidx.viewpager2.widget.ViewPager2 r5 = r8.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.getAdapter()
                if (r5 != 0) goto L23
                return
            L23:
                androidx.viewpager2.widget.ViewPager2 r5 = r8.this$0
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.getAdapter()
                int r5 = r5.getItemCount()
                if (r5 != 0) goto L30
                return
            L30:
                androidx.viewpager2.widget.ViewPager2 r6 = r8.this$0
                boolean r6 = r6.isUserInputEnabled()
                if (r6 != 0) goto L39
                return
            L39:
                androidx.viewpager2.widget.ViewPager2 r6 = r8.this$0
                int r6 = r6.getOrientation()
                r7 = 0
                if (r6 != 0) goto L79
                androidx.viewpager2.widget.ViewPager2 r3 = r8.this$0
                boolean r3 = r3.isRtl()
                if (r3 == 0) goto L4e
                r4 = 16908360(0x1020048, float:2.387743E-38)
                goto L51
            L4e:
                r4 = 16908361(0x1020049, float:2.3877434E-38)
            L51:
                if (r3 == 0) goto L56
                r1 = 16908361(0x1020049, float:2.3877434E-38)
            L56:
                androidx.viewpager2.widget.ViewPager2 r2 = r8.this$0
                int r2 = r2.mCurrentItem
                int r5 = r5 + (-1)
                if (r2 >= r5) goto L68
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r2.<init>(r4, r7)
                androidx.core.view.accessibility.AccessibilityViewCommand r3 = r8.mActionPageForward
                androidx.core.view.ViewCompat.replaceAccessibilityAction(r0, r2, r7, r3)
            L68:
                androidx.viewpager2.widget.ViewPager2 r2 = r8.this$0
                int r2 = r2.mCurrentItem
                if (r2 <= 0) goto L9b
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r2.<init>(r1, r7)
                androidx.core.view.accessibility.AccessibilityViewCommand r1 = r8.mActionPageBackward
                androidx.core.view.ViewCompat.replaceAccessibilityAction(r0, r2, r7, r1)
                goto L9b
            L79:
                androidx.viewpager2.widget.ViewPager2 r1 = r8.this$0
                int r1 = r1.mCurrentItem
                int r5 = r5 + (-1)
                if (r1 >= r5) goto L8b
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1.<init>(r4, r7)
                androidx.core.view.accessibility.AccessibilityViewCommand r2 = r8.mActionPageForward
                androidx.core.view.ViewCompat.replaceAccessibilityAction(r0, r1, r7, r2)
            L8b:
                androidx.viewpager2.widget.ViewPager2 r1 = r8.this$0
                int r1 = r1.mCurrentItem
                if (r1 <= 0) goto L9b
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
                r1.<init>(r3, r7)
                androidx.core.view.accessibility.AccessibilityViewCommand r2 = r8.mActionPageBackward
                androidx.core.view.ViewCompat.replaceAccessibilityAction(r0, r1, r7, r2)
            L9b:
                return
        }
    }

    public interface PageTransformer {
        void transformPage(@androidx.annotation.NonNull android.view.View r1, float r2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PagerSnapHelperImpl extends androidx.recyclerview.widget.PagerSnapHelper {
        public final /* synthetic */ androidx.viewpager2.widget.ViewPager2 this$0;

        public PagerSnapHelperImpl(androidx.viewpager2.widget.ViewPager2 r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        @androidx.annotation.Nullable
        public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r1.this$0
                boolean r0 = r0.isFakeDragging()
                if (r0 == 0) goto La
                r2 = 0
                goto Le
            La:
                android.view.View r2 = super.findSnapView(r2)
            Le:
                return r2
        }
    }

    public class RecyclerViewImpl extends androidx.recyclerview.widget.RecyclerView {
        public final /* synthetic */ androidx.viewpager2.widget.ViewPager2 this$0;

        public RecyclerViewImpl(@androidx.annotation.NonNull androidx.viewpager2.widget.ViewPager2 r1, android.content.Context r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @androidx.annotation.RequiresApi(23)
        public java.lang.CharSequence getAccessibilityClassName() {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r1.this$0
                androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r0 = r0.mAccessibilityProvider
                java.util.Objects.requireNonNull(r0)
                java.lang.CharSequence r0 = super.getAccessibilityClassName()
                return r0
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r2) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2)
                androidx.viewpager2.widget.ViewPager2 r0 = r1.this$0
                int r0 = r0.mCurrentItem
                r2.setFromIndex(r0)
                androidx.viewpager2.widget.ViewPager2 r0 = r1.this$0
                int r0 = r0.mCurrentItem
                r2.setToIndex(r0)
                androidx.viewpager2.widget.ViewPager2 r0 = r1.this$0
                androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r0 = r0.mAccessibilityProvider
                r0.onRvInitializeAccessibilityEvent(r2)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r1.this$0
                boolean r0 = r0.isUserInputEnabled()
                if (r0 == 0) goto L10
                boolean r2 = super.onInterceptTouchEvent(r2)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @android.annotation.SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(android.view.MotionEvent r2) {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = r1.this$0
                boolean r0 = r0.isUserInputEnabled()
                if (r0 == 0) goto L10
                boolean r2 = super.onTouchEvent(r2)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }
    }

    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.viewpager2.widget.ViewPager2.SavedState> CREATOR = null;
        public android.os.Parcelable mAdapterState;
        public int mCurrentItem;
        public int mRecyclerViewId;


        static {
                androidx.viewpager2.widget.ViewPager2$SavedState$1 r0 = new androidx.viewpager2.widget.ViewPager2$SavedState$1
                r0.<init>()
                androidx.viewpager2.widget.ViewPager2.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.readValues(r2, r0)
                return
        }

        @androidx.annotation.RequiresApi(24)
        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.readValues(r1, r2)
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void readValues(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                int r0 = r2.readInt()
                r1.mRecyclerViewId = r0
                int r0 = r2.readInt()
                r1.mCurrentItem = r0
                android.os.Parcelable r2 = r2.readParcelable(r3)
                r1.mAdapterState = r2
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                int r0 = r1.mRecyclerViewId
                r2.writeInt(r0)
                int r0 = r1.mCurrentItem
                r2.writeInt(r0)
                android.os.Parcelable r0 = r1.mAdapterState
                r2.writeParcelable(r0, r3)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollState {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SmoothScrollToPosition implements java.lang.Runnable {
        private final int mPosition;
        private final androidx.recyclerview.widget.RecyclerView mRecyclerView;

        public SmoothScrollToPosition(int r1, androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                r0.<init>()
                r0.mPosition = r1
                r0.mRecyclerView = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                int r1 = r2.mPosition
                r0.smoothScrollToPosition(r1)
                return
        }
    }

    public ViewPager2(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.mTmpContainerRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.mTmpChildRect = r0
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r0 = new androidx.viewpager2.widget.CompositeOnPageChangeCallback
            r0.<init>()
            r3.mExternalPageChangeCallbacks = r0
            r0 = 0
            r3.mCurrentItemDirty = r0
            androidx.viewpager2.widget.ViewPager2$1 r1 = new androidx.viewpager2.widget.ViewPager2$1
            r1.<init>(r3)
            r3.mCurrentItemDataSetChangeObserver = r1
            r1 = -1
            r3.mPendingCurrentItem = r1
            r2 = 0
            r3.mSavedItemAnimator = r2
            r3.mSavedItemAnimatorPresent = r0
            r0 = 1
            r3.mUserInputEnabled = r0
            r3.mOffscreenPageLimit = r1
            r3.initialize(r4, r2)
            return
    }

    public ViewPager2(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.Nullable android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.mTmpContainerRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.mTmpChildRect = r0
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r0 = new androidx.viewpager2.widget.CompositeOnPageChangeCallback
            r0.<init>()
            r3.mExternalPageChangeCallbacks = r0
            r0 = 0
            r3.mCurrentItemDirty = r0
            androidx.viewpager2.widget.ViewPager2$1 r1 = new androidx.viewpager2.widget.ViewPager2$1
            r1.<init>(r3)
            r3.mCurrentItemDataSetChangeObserver = r1
            r1 = -1
            r3.mPendingCurrentItem = r1
            r2 = 0
            r3.mSavedItemAnimator = r2
            r3.mSavedItemAnimatorPresent = r0
            r0 = 1
            r3.mUserInputEnabled = r0
            r3.mOffscreenPageLimit = r1
            r3.initialize(r4, r5)
            return
    }

    public ViewPager2(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r2.mTmpContainerRect = r5
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r2.mTmpChildRect = r5
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r5 = new androidx.viewpager2.widget.CompositeOnPageChangeCallback
            r5.<init>()
            r2.mExternalPageChangeCallbacks = r5
            r5 = 0
            r2.mCurrentItemDirty = r5
            androidx.viewpager2.widget.ViewPager2$1 r0 = new androidx.viewpager2.widget.ViewPager2$1
            r0.<init>(r2)
            r2.mCurrentItemDataSetChangeObserver = r0
            r0 = -1
            r2.mPendingCurrentItem = r0
            r1 = 0
            r2.mSavedItemAnimator = r1
            r2.mSavedItemAnimatorPresent = r5
            r5 = 1
            r2.mUserInputEnabled = r5
            r2.mOffscreenPageLimit = r0
            r2.initialize(r3, r4)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public ViewPager2(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r1.mTmpContainerRect = r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r1.mTmpChildRect = r4
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r4 = new androidx.viewpager2.widget.CompositeOnPageChangeCallback
            r4.<init>()
            r1.mExternalPageChangeCallbacks = r4
            r4 = 0
            r1.mCurrentItemDirty = r4
            androidx.viewpager2.widget.ViewPager2$1 r5 = new androidx.viewpager2.widget.ViewPager2$1
            r5.<init>(r1)
            r1.mCurrentItemDataSetChangeObserver = r5
            r5 = -1
            r1.mPendingCurrentItem = r5
            r0 = 0
            r1.mSavedItemAnimator = r0
            r1.mSavedItemAnimatorPresent = r4
            r4 = 1
            r1.mUserInputEnabled = r4
            r1.mOffscreenPageLimit = r5
            r1.initialize(r2, r3)
            return
    }

    private androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener enforceChildFillListener() {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2$4 r0 = new androidx.viewpager2.widget.ViewPager2$4
            r0.<init>()
            return r0
    }

    private void initialize(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r0 = new androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider
            r0.<init>(r2)
            r2.mAccessibilityProvider = r0
            androidx.viewpager2.widget.ViewPager2$RecyclerViewImpl r0 = new androidx.viewpager2.widget.ViewPager2$RecyclerViewImpl
            r0.<init>(r2, r3)
            r2.mRecyclerView = r0
            int r1 = androidx.core.view.ViewCompat.generateViewId()
            r0.setId(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r1 = 131072(0x20000, float:1.83671E-40)
            r0.setDescendantFocusability(r1)
            androidx.viewpager2.widget.ViewPager2$LinearLayoutManagerImpl r0 = new androidx.viewpager2.widget.ViewPager2$LinearLayoutManagerImpl
            r0.<init>(r2, r3)
            r2.mLayoutManager = r0
            androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
            r1.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r1 = 1
            r0.setScrollingTouchSlop(r1)
            r2.setOrientation(r3, r4)
            androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r4.<init>(r0, r0)
            r3.setLayoutParams(r4)
            androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener r4 = r2.enforceChildFillListener()
            r3.addOnChildAttachStateChangeListener(r4)
            androidx.viewpager2.widget.ScrollEventAdapter r3 = new androidx.viewpager2.widget.ScrollEventAdapter
            r3.<init>(r2)
            r2.mScrollEventAdapter = r3
            androidx.viewpager2.widget.FakeDrag r4 = new androidx.viewpager2.widget.FakeDrag
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r4.<init>(r2, r3, r0)
            r2.mFakeDragger = r4
            androidx.viewpager2.widget.ViewPager2$PagerSnapHelperImpl r3 = new androidx.viewpager2.widget.ViewPager2$PagerSnapHelperImpl
            r3.<init>(r2)
            r2.mPagerSnapHelper = r3
            androidx.recyclerview.widget.RecyclerView r4 = r2.mRecyclerView
            r3.attachToRecyclerView(r4)
            androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
            androidx.viewpager2.widget.ScrollEventAdapter r4 = r2.mScrollEventAdapter
            r3.addOnScrollListener(r4)
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r3 = new androidx.viewpager2.widget.CompositeOnPageChangeCallback
            r3.<init>()
            r2.mPageChangeEventDispatcher = r3
            androidx.viewpager2.widget.ScrollEventAdapter r4 = r2.mScrollEventAdapter
            r4.setOnPageChangeCallback(r3)
            androidx.viewpager2.widget.ViewPager2$2 r3 = new androidx.viewpager2.widget.ViewPager2$2
            r3.<init>(r2)
            androidx.viewpager2.widget.ViewPager2$3 r4 = new androidx.viewpager2.widget.ViewPager2$3
            r4.<init>(r2)
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r0 = r2.mPageChangeEventDispatcher
            r0.addOnPageChangeCallback(r3)
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r3 = r2.mPageChangeEventDispatcher
            r3.addOnPageChangeCallback(r4)
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r3 = r2.mAccessibilityProvider
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r4 = r2.mPageChangeEventDispatcher
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r3.onInitialize(r4, r0)
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r3 = r2.mPageChangeEventDispatcher
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r4 = r2.mExternalPageChangeCallbacks
            r3.addOnPageChangeCallback(r4)
            androidx.viewpager2.widget.PageTransformerAdapter r3 = new androidx.viewpager2.widget.PageTransformerAdapter
            androidx.recyclerview.widget.LinearLayoutManager r4 = r2.mLayoutManager
            r3.<init>(r4)
            r2.mPageTransformerAdapter = r3
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r4 = r2.mPageChangeEventDispatcher
            r4.addOnPageChangeCallback(r3)
            androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
            r4 = 0
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r2.attachViewToParent(r3, r4, r0)
            return
    }

    private void registerCurrentItemDataSetTracker(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter<?> r2) {
            r1 = this;
            if (r2 == 0) goto L7
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r0 = r1.mCurrentItemDataSetChangeObserver
            r2.registerAdapterDataObserver(r0)
        L7:
            return
    }

    private void restorePendingState() {
            r4 = this;
            int r0 = r4.mPendingCurrentItem
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r4.getAdapter()
            if (r0 != 0) goto Ld
            return
        Ld:
            android.os.Parcelable r2 = r4.mPendingAdapterState
            if (r2 == 0) goto L1e
            boolean r3 = r0 instanceof androidx.viewpager2.adapter.StatefulAdapter
            if (r3 == 0) goto L1b
            r3 = r0
            androidx.viewpager2.adapter.StatefulAdapter r3 = (androidx.viewpager2.adapter.StatefulAdapter) r3
            r3.restoreState(r2)
        L1b:
            r2 = 0
            r4.mPendingAdapterState = r2
        L1e:
            r2 = 0
            int r3 = r4.mPendingCurrentItem
            int r0 = r0.getItemCount()
            int r0 = r0 + r1
            int r0 = java.lang.Math.min(r3, r0)
            int r0 = java.lang.Math.max(r2, r0)
            r4.mCurrentItem = r0
            r4.mPendingCurrentItem = r1
            androidx.recyclerview.widget.RecyclerView r1 = r4.mRecyclerView
            r1.scrollToPosition(r0)
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r0 = r4.mAccessibilityProvider
            r0.onRestorePendingState()
            return
    }

    private void setOrientation(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            int[] r2 = androidx.viewpager2.R.styleable.ViewPager2
            android.content.res.TypedArray r7 = r9.obtainStyledAttributes(r10, r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L15
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r7
            r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
        L15:
            int r9 = androidx.viewpager2.R.styleable.ViewPager2_android_orientation     // Catch: java.lang.Throwable -> L23
            r10 = 0
            int r9 = r7.getInt(r9, r10)     // Catch: java.lang.Throwable -> L23
            r8.setOrientation(r9)     // Catch: java.lang.Throwable -> L23
            r7.recycle()
            return
        L23:
            r9 = move-exception
            r7.recycle()
            throw r9
    }

    private void unregisterCurrentItemDataSetTracker(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter<?> r2) {
            r1 = this;
            if (r2 == 0) goto L7
            androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r0 = r1.mCurrentItemDataSetChangeObserver
            r2.unregisterAdapterDataObserver(r0)
        L7:
            return
    }

    public void addItemDecoration(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemDecoration r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            r0.addItemDecoration(r2)
            return
    }

    public void addItemDecoration(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemDecoration r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            r0.addItemDecoration(r2, r3)
            return
    }

    public boolean beginFakeDrag() {
            r1 = this;
            androidx.viewpager2.widget.FakeDrag r0 = r1.mFakeDragger
            boolean r0 = r0.beginFakeDrag()
            return r0
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            boolean r2 = r0.canScrollHorizontally(r2)
            return r2
    }

    @Override // android.view.View
    public boolean canScrollVertically(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            boolean r2 = r0.canScrollVertically(r2)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> r4) {
            r3 = this;
            int r0 = r3.getId()
            java.lang.Object r0 = r4.get(r0)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2.SavedState
            if (r1 == 0) goto L22
            androidx.viewpager2.widget.ViewPager2$SavedState r0 = (androidx.viewpager2.widget.ViewPager2.SavedState) r0
            int r0 = r0.mRecyclerViewId
            androidx.recyclerview.widget.RecyclerView r1 = r3.mRecyclerView
            int r1 = r1.getId()
            java.lang.Object r2 = r4.get(r0)
            r4.put(r1, r2)
            r4.remove(r0)
        L22:
            super.dispatchRestoreInstanceState(r4)
            r3.restorePendingState()
            return
    }

    public boolean endFakeDrag() {
            r1 = this;
            androidx.viewpager2.widget.FakeDrag r0 = r1.mFakeDragger
            boolean r0 = r0.endFakeDrag()
            return r0
    }

    public boolean fakeDragBy(@androidx.annotation.Px @android.annotation.SuppressLint({"SupportAnnotationUsage"}) float r2) {
            r1 = this;
            androidx.viewpager2.widget.FakeDrag r0 = r1.mFakeDragger
            boolean r2 = r0.fakeDragBy(r2)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    @androidx.annotation.RequiresApi(23)
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r0 = r1.mAccessibilityProvider
            boolean r0 = r0.handlesGetAccessibilityClassName()
            if (r0 == 0) goto Lf
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r0 = r1.mAccessibilityProvider
            java.lang.String r0 = r0.onGetAccessibilityClassName()
            return r0
        Lf:
            java.lang.CharSequence r0 = super.getAccessibilityClassName()
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.recyclerview.widget.RecyclerView.Adapter getAdapter() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            return r0
    }

    public int getCurrentItem() {
            r1 = this;
            int r0 = r1.mCurrentItem
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.recyclerview.widget.RecyclerView.ItemDecoration getItemDecorationAt(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r2 = r0.getItemDecorationAt(r2)
            return r2
    }

    public int getItemDecorationCount() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            int r0 = r0.getItemDecorationCount()
            return r0
    }

    public int getOffscreenPageLimit() {
            r1 = this;
            int r0 = r1.mOffscreenPageLimit
            return r0
    }

    public int getOrientation() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.getOrientation()
            return r0
    }

    public int getPageSize() {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
            int r1 = r3.getOrientation()
            if (r1 != 0) goto L16
            int r1 = r0.getWidth()
            int r2 = r0.getPaddingLeft()
            int r1 = r1 - r2
            int r0 = r0.getPaddingRight()
            goto L23
        L16:
            int r1 = r0.getHeight()
            int r2 = r0.getPaddingTop()
            int r1 = r1 - r2
            int r0 = r0.getPaddingBottom()
        L23:
            int r1 = r1 - r0
            return r1
    }

    public int getScrollState() {
            r1 = this;
            androidx.viewpager2.widget.ScrollEventAdapter r0 = r1.mScrollEventAdapter
            int r0 = r0.getScrollState()
            return r0
    }

    public void invalidateItemDecorations() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            r0.invalidateItemDecorations()
            return
    }

    public boolean isFakeDragging() {
            r1 = this;
            androidx.viewpager2.widget.FakeDrag r0 = r1.mFakeDragger
            boolean r0 = r0.isFakeDragging()
            return r0
    }

    public final boolean isRtl() {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r2.mLayoutManager
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public boolean isUserInputEnabled() {
            r1 = this;
            boolean r0 = r1.mUserInputEnabled
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r0 = r1.mAccessibilityProvider
            r0.onInitializeAccessibilityNodeInfo(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r4 = r3.mRecyclerView
            int r4 = r4.getMeasuredWidth()
            androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
            int r0 = r0.getMeasuredHeight()
            android.graphics.Rect r1 = r3.mTmpContainerRect
            int r2 = r3.getPaddingLeft()
            r1.left = r2
            android.graphics.Rect r1 = r3.mTmpContainerRect
            int r7 = r7 - r5
            int r5 = r3.getPaddingRight()
            int r7 = r7 - r5
            r1.right = r7
            android.graphics.Rect r5 = r3.mTmpContainerRect
            int r7 = r3.getPaddingTop()
            r5.top = r7
            android.graphics.Rect r5 = r3.mTmpContainerRect
            int r8 = r8 - r6
            int r6 = r3.getPaddingBottom()
            int r8 = r8 - r6
            r5.bottom = r8
            android.graphics.Rect r5 = r3.mTmpContainerRect
            android.graphics.Rect r6 = r3.mTmpChildRect
            r7 = 8388659(0x800033, float:1.1755015E-38)
            android.view.Gravity.apply(r7, r4, r0, r5, r6)
            androidx.recyclerview.widget.RecyclerView r4 = r3.mRecyclerView
            android.graphics.Rect r5 = r3.mTmpChildRect
            int r6 = r5.left
            int r7 = r5.top
            int r8 = r5.right
            int r5 = r5.bottom
            r4.layout(r6, r7, r8, r5)
            boolean r4 = r3.mCurrentItemDirty
            if (r4 == 0) goto L50
            r3.updateCurrentItem()
        L50:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r6, int r7) {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.mRecyclerView
            r5.measureChild(r0, r6, r7)
            androidx.recyclerview.widget.RecyclerView r0 = r5.mRecyclerView
            int r0 = r0.getMeasuredWidth()
            androidx.recyclerview.widget.RecyclerView r1 = r5.mRecyclerView
            int r1 = r1.getMeasuredHeight()
            androidx.recyclerview.widget.RecyclerView r2 = r5.mRecyclerView
            int r2 = r2.getMeasuredState()
            int r3 = r5.getPaddingLeft()
            int r4 = r5.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r0
            int r0 = r5.getPaddingTop()
            int r3 = r5.getPaddingBottom()
            int r3 = r3 + r0
            int r3 = r3 + r1
            int r0 = r5.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r4, r0)
            int r1 = r5.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r3, r1)
            int r6 = android.view.View.resolveSizeAndState(r0, r6, r2)
            int r0 = r2 << 16
            int r7 = android.view.View.resolveSizeAndState(r1, r7, r0)
            r5.setMeasuredDimension(r6, r7)
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.viewpager2.widget.ViewPager2.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.viewpager2.widget.ViewPager2$SavedState r2 = (androidx.viewpager2.widget.ViewPager2.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            int r0 = r2.mCurrentItem
            r1.mPendingCurrentItem = r0
            android.os.Parcelable r2 = r2.mAdapterState
            r1.mPendingAdapterState = r2
            return
    }

    @Override // android.view.View
    @androidx.annotation.Nullable
    public final android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.viewpager2.widget.ViewPager2$SavedState r1 = new androidx.viewpager2.widget.ViewPager2$SavedState
            r1.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
            int r0 = r0.getId()
            r1.mRecyclerViewId = r0
            int r0 = r3.mPendingCurrentItem
            r2 = -1
            if (r0 != r2) goto L18
            int r0 = r3.mCurrentItem
        L18:
            r1.mCurrentItem = r0
            android.os.Parcelable r0 = r3.mPendingAdapterState
            if (r0 == 0) goto L21
            r1.mAdapterState = r0
            goto L33
        L21:
            androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            boolean r2 = r0 instanceof androidx.viewpager2.adapter.StatefulAdapter
            if (r2 == 0) goto L33
            androidx.viewpager2.adapter.StatefulAdapter r0 = (androidx.viewpager2.adapter.StatefulAdapter) r0
            android.os.Parcelable r0 = r0.saveState()
            r1.mAdapterState = r0
        L33:
            return r1
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.Class<androidx.viewpager2.widget.ViewPager2> r0 = androidx.viewpager2.widget.ViewPager2.class
            java.lang.String r0 = "ViewPager2 does not support direct child views"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View
    @androidx.annotation.RequiresApi(16)
    public boolean performAccessibilityAction(int r2, android.os.Bundle r3) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r0 = r1.mAccessibilityProvider
            boolean r0 = r0.handlesPerformAccessibilityAction(r2, r3)
            if (r0 == 0) goto Lf
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r0 = r1.mAccessibilityProvider
            boolean r2 = r0.onPerformAccessibilityAction(r2, r3)
            return r2
        Lf:
            boolean r2 = super.performAccessibilityAction(r2, r3)
            return r2
    }

    public void registerOnPageChangeCallback(@androidx.annotation.NonNull androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback r2) {
            r1 = this;
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r0 = r1.mExternalPageChangeCallbacks
            r0.addOnPageChangeCallback(r2)
            return
    }

    public void removeItemDecoration(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ItemDecoration r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            r0.removeItemDecoration(r2)
            return
    }

    public void removeItemDecorationAt(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            r0.removeItemDecorationAt(r2)
            return
    }

    public void requestTransform() {
            r5 = this;
            androidx.viewpager2.widget.PageTransformerAdapter r0 = r5.mPageTransformerAdapter
            androidx.viewpager2.widget.ViewPager2$PageTransformer r0 = r0.getPageTransformer()
            if (r0 != 0) goto L9
            return
        L9:
            androidx.viewpager2.widget.ScrollEventAdapter r0 = r5.mScrollEventAdapter
            double r0 = r0.getRelativeScrollPosition()
            int r2 = (int) r0
            double r3 = (double) r2
            double r0 = r0 - r3
            float r0 = (float) r0
            int r1 = r5.getPageSize()
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            androidx.viewpager2.widget.PageTransformerAdapter r3 = r5.mPageTransformerAdapter
            r3.onPageScrolled(r2, r0, r1)
            return
    }

    public void setAdapter(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r1 = r2.mAccessibilityProvider
            r1.onDetachAdapter(r0)
            r2.unregisterCurrentItemDataSetTracker(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.setAdapter(r3)
            r0 = 0
            r2.mCurrentItem = r0
            r2.restorePendingState()
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r0 = r2.mAccessibilityProvider
            r0.onAttachAdapter(r3)
            r2.registerCurrentItemDataSetTracker(r3)
            return
    }

    public void setCurrentItem(int r2) {
            r1 = this;
            r0 = 1
            r1.setCurrentItem(r2, r0)
            return
    }

    public void setCurrentItem(int r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.isFakeDragging()
            if (r0 != 0) goto La
            r1.setCurrentItemInternal(r2, r3)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Cannot change current item when ViewPager2 is fake dragging"
            r2.<init>(r3)
            throw r2
    }

    public final void setCurrentItemInternal(int r9, boolean r10) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r8.getAdapter()
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L13
            int r10 = r8.mPendingCurrentItem
            if (r10 == r1) goto L12
            int r9 = java.lang.Math.max(r9, r2)
            r8.mPendingCurrentItem = r9
        L12:
            return
        L13:
            int r3 = r0.getItemCount()
            if (r3 > 0) goto L1a
            return
        L1a:
            int r9 = java.lang.Math.max(r9, r2)
            int r0 = r0.getItemCount()
            int r0 = r0 + r1
            int r9 = java.lang.Math.min(r9, r0)
            int r0 = r8.mCurrentItem
            if (r9 != r0) goto L34
            androidx.viewpager2.widget.ScrollEventAdapter r0 = r8.mScrollEventAdapter
            boolean r0 = r0.isIdle()
            if (r0 == 0) goto L34
            return
        L34:
            int r0 = r8.mCurrentItem
            if (r9 != r0) goto L3b
            if (r10 == 0) goto L3b
            return
        L3b:
            double r0 = (double) r0
            r8.mCurrentItem = r9
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r2 = r8.mAccessibilityProvider
            r2.onSetNewCurrentItem()
            androidx.viewpager2.widget.ScrollEventAdapter r2 = r8.mScrollEventAdapter
            boolean r2 = r2.isIdle()
            if (r2 != 0) goto L51
            androidx.viewpager2.widget.ScrollEventAdapter r0 = r8.mScrollEventAdapter
            double r0 = r0.getRelativeScrollPosition()
        L51:
            androidx.viewpager2.widget.ScrollEventAdapter r2 = r8.mScrollEventAdapter
            r2.notifyProgrammaticScroll(r9, r10)
            if (r10 != 0) goto L5e
            androidx.recyclerview.widget.RecyclerView r10 = r8.mRecyclerView
            r10.scrollToPosition(r9)
            return
        L5e:
            double r2 = (double) r9
            double r4 = r2 - r0
            double r4 = java.lang.Math.abs(r4)
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L84
            androidx.recyclerview.widget.RecyclerView r10 = r8.mRecyclerView
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r0 = r9 + (-3)
            goto L76
        L74:
            int r0 = r9 + 3
        L76:
            r10.scrollToPosition(r0)
            androidx.recyclerview.widget.RecyclerView r10 = r8.mRecyclerView
            androidx.viewpager2.widget.ViewPager2$SmoothScrollToPosition r0 = new androidx.viewpager2.widget.ViewPager2$SmoothScrollToPosition
            r0.<init>(r9, r10)
            r10.post(r0)
            goto L89
        L84:
            androidx.recyclerview.widget.RecyclerView r10 = r8.mRecyclerView
            r10.smoothScrollToPosition(r9)
        L89:
            return
    }

    @Override // android.view.View
    @androidx.annotation.RequiresApi(17)
    public void setLayoutDirection(int r1) {
            r0 = this;
            super.setLayoutDirection(r1)
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r1 = r0.mAccessibilityProvider
            r1.onSetLayoutDirection()
            return
    }

    public void setOffscreenPageLimit(int r2) {
            r1 = this;
            r0 = 1
            if (r2 >= r0) goto Lf
            r0 = -1
            if (r2 != r0) goto L7
            goto Lf
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0"
            r2.<init>(r0)
            throw r2
        Lf:
            r1.mOffscreenPageLimit = r2
            androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
            r2.requestLayout()
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r1.mLayoutManager
            r0.setOrientation(r2)
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r2 = r1.mAccessibilityProvider
            r2.onSetOrientation()
            return
    }

    public void setPageTransformer(@androidx.annotation.Nullable androidx.viewpager2.widget.ViewPager2.PageTransformer r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L18
            boolean r1 = r3.mSavedItemAnimatorPresent
            if (r1 != 0) goto L12
            androidx.recyclerview.widget.RecyclerView r1 = r3.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r1 = r1.getItemAnimator()
            r3.mSavedItemAnimator = r1
            r1 = 1
            r3.mSavedItemAnimatorPresent = r1
        L12:
            androidx.recyclerview.widget.RecyclerView r1 = r3.mRecyclerView
            r1.setItemAnimator(r0)
            goto L28
        L18:
            boolean r1 = r3.mSavedItemAnimatorPresent
            if (r1 == 0) goto L28
            androidx.recyclerview.widget.RecyclerView r1 = r3.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r2 = r3.mSavedItemAnimator
            r1.setItemAnimator(r2)
            r3.mSavedItemAnimator = r0
            r0 = 0
            r3.mSavedItemAnimatorPresent = r0
        L28:
            androidx.viewpager2.widget.PageTransformerAdapter r0 = r3.mPageTransformerAdapter
            androidx.viewpager2.widget.ViewPager2$PageTransformer r0 = r0.getPageTransformer()
            if (r4 != r0) goto L31
            return
        L31:
            androidx.viewpager2.widget.PageTransformerAdapter r0 = r3.mPageTransformerAdapter
            r0.setPageTransformer(r4)
            r3.requestTransform()
            return
    }

    public void setUserInputEnabled(boolean r1) {
            r0 = this;
            r0.mUserInputEnabled = r1
            androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider r1 = r0.mAccessibilityProvider
            r1.onSetUserInputEnabled()
            return
    }

    public final void snapToPage() {
            r4 = this;
            androidx.recyclerview.widget.PagerSnapHelper r0 = r4.mPagerSnapHelper
            androidx.recyclerview.widget.LinearLayoutManager r1 = r4.mLayoutManager
            android.view.View r0 = r0.findSnapView(r1)
            if (r0 != 0) goto Lb
            return
        Lb:
            androidx.recyclerview.widget.PagerSnapHelper r1 = r4.mPagerSnapHelper
            androidx.recyclerview.widget.LinearLayoutManager r2 = r4.mLayoutManager
            int[] r0 = r1.calculateDistanceToFinalSnap(r2, r0)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L1d
            r2 = r0[r3]
            if (r2 == 0) goto L26
        L1d:
            androidx.recyclerview.widget.RecyclerView r2 = r4.mRecyclerView
            r1 = r0[r1]
            r0 = r0[r3]
            r2.smoothScrollBy(r1, r0)
        L26:
            return
    }

    public void unregisterOnPageChangeCallback(@androidx.annotation.NonNull androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback r2) {
            r1 = this;
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r0 = r1.mExternalPageChangeCallbacks
            r0.removeOnPageChangeCallback(r2)
            return
    }

    public final void updateCurrentItem() {
            r2 = this;
            androidx.recyclerview.widget.PagerSnapHelper r0 = r2.mPagerSnapHelper
            if (r0 == 0) goto L26
            androidx.recyclerview.widget.LinearLayoutManager r1 = r2.mLayoutManager
            android.view.View r0 = r0.findSnapView(r1)
            if (r0 != 0) goto Ld
            return
        Ld:
            androidx.recyclerview.widget.LinearLayoutManager r1 = r2.mLayoutManager
            int r0 = r1.getPosition(r0)
            int r1 = r2.mCurrentItem
            if (r0 == r1) goto L22
            int r1 = r2.getScrollState()
            if (r1 != 0) goto L22
            androidx.viewpager2.widget.CompositeOnPageChangeCallback r1 = r2.mPageChangeEventDispatcher
            r1.onPageSelected(r0)
        L22:
            r0 = 0
            r2.mCurrentItemDirty = r0
            return
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Design assumption violated."
            r0.<init>(r1)
            throw r0
    }
}
