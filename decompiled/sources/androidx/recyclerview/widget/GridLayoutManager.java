package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes2.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final java.lang.String TAG = "GridLayoutManager";
    public int[] mCachedBorders;
    public final android.graphics.Rect mDecorInsets;
    public boolean mPendingSpanCountChange;
    public final android.util.SparseIntArray mPreLayoutSpanIndexCache;
    public final android.util.SparseIntArray mPreLayoutSpanSizeCache;
    public android.view.View[] mSet;
    public int mSpanCount;
    public androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup mSpanSizeLookup;
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    public static final class DefaultSpanSizeLookup extends androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup {
        public DefaultSpanSizeLookup() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanIndex(int r1, int r2) {
                r0 = this;
                int r1 = r1 % r2
                return r1
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        public int mSpanIndex;
        public int mSpanSize;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.mSpanIndex = r1
                r1 = 0
                r0.mSpanSize = r1
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.mSpanIndex = r1
                r1 = 0
                r0.mSpanSize = r1
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.mSpanIndex = r1
                r1 = 0
                r0.mSpanSize = r1
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.mSpanIndex = r1
                r1 = 0
                r0.mSpanSize = r1
                return
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.mSpanIndex = r1
                r1 = 0
                r0.mSpanSize = r1
                return
        }

        public int getSpanIndex() {
                r1 = this;
                int r0 = r1.mSpanIndex
                return r0
        }

        public int getSpanSize() {
                r1 = this;
                int r0 = r1.mSpanSize
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class SpanSizeLookup {
        private boolean mCacheSpanGroupIndices;
        private boolean mCacheSpanIndices;
        public final android.util.SparseIntArray mSpanGroupIndexCache;
        public final android.util.SparseIntArray mSpanIndexCache;

        public SpanSizeLookup() {
                r1 = this;
                r1.<init>()
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                r1.mSpanIndexCache = r0
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                r1.mSpanGroupIndexCache = r0
                r0 = 0
                r1.mCacheSpanIndices = r0
                r1.mCacheSpanGroupIndices = r0
                return
        }

        public static int findFirstKeyLessThan(android.util.SparseIntArray r4, int r5) {
                int r0 = r4.size()
                int r0 = r0 + (-1)
                r1 = 0
            L7:
                if (r1 > r0) goto L1b
                int r2 = r1 + r0
                int r2 = r2 >>> 1
                int r3 = r4.keyAt(r2)
                if (r3 >= r5) goto L17
                int r2 = r2 + 1
                r1 = r2
                goto L7
            L17:
                int r2 = r2 + (-1)
                r0 = r2
                goto L7
            L1b:
                int r1 = r1 + (-1)
                if (r1 < 0) goto L2a
                int r5 = r4.size()
                if (r1 >= r5) goto L2a
                int r4 = r4.keyAt(r1)
                return r4
            L2a:
                r4 = -1
                return r4
        }

        public final int getCachedSpanGroupIndex(int r3, int r4) {
                r2 = this;
                boolean r0 = r2.mCacheSpanGroupIndices
                if (r0 != 0) goto L9
                int r3 = r2.getSpanGroupIndex(r3, r4)
                return r3
            L9:
                android.util.SparseIntArray r0 = r2.mSpanGroupIndexCache
                r1 = -1
                int r0 = r0.get(r3, r1)
                if (r0 == r1) goto L13
                return r0
            L13:
                int r4 = r2.getSpanGroupIndex(r3, r4)
                android.util.SparseIntArray r0 = r2.mSpanGroupIndexCache
                r0.put(r3, r4)
                return r4
        }

        public final int getCachedSpanIndex(int r3, int r4) {
                r2 = this;
                boolean r0 = r2.mCacheSpanIndices
                if (r0 != 0) goto L9
                int r3 = r2.getSpanIndex(r3, r4)
                return r3
            L9:
                android.util.SparseIntArray r0 = r2.mSpanIndexCache
                r1 = -1
                int r0 = r0.get(r3, r1)
                if (r0 == r1) goto L13
                return r0
            L13:
                int r4 = r2.getSpanIndex(r3, r4)
                android.util.SparseIntArray r0 = r2.mSpanIndexCache
                r0.put(r3, r4)
                return r4
        }

        public int getSpanGroupIndex(int r7, int r8) {
                r6 = this;
                boolean r0 = r6.mCacheSpanGroupIndices
                r1 = 0
                if (r0 == 0) goto L25
                android.util.SparseIntArray r0 = r6.mSpanGroupIndexCache
                int r0 = findFirstKeyLessThan(r0, r7)
                r2 = -1
                if (r0 == r2) goto L25
                android.util.SparseIntArray r2 = r6.mSpanGroupIndexCache
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.getCachedSpanIndex(r0, r8)
                int r0 = r6.getSpanSize(r0)
                int r0 = r0 + r4
                if (r0 != r8) goto L28
                int r2 = r2 + 1
                r0 = 0
                goto L28
            L25:
                r0 = 0
                r2 = 0
                r3 = 0
            L28:
                int r4 = r6.getSpanSize(r7)
            L2c:
                if (r3 >= r7) goto L41
                int r5 = r6.getSpanSize(r3)
                int r0 = r0 + r5
                if (r0 != r8) goto L39
                int r2 = r2 + 1
                r0 = 0
                goto L3e
            L39:
                if (r0 <= r8) goto L3e
                int r2 = r2 + 1
                r0 = r5
            L3e:
                int r3 = r3 + 1
                goto L2c
            L41:
                int r0 = r0 + r4
                if (r0 <= r8) goto L46
                int r2 = r2 + 1
            L46:
                return r2
        }

        public int getSpanIndex(int r6, int r7) {
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r4 = r4 + r3
                goto L30
            L20:
                r2 = 0
                r4 = 0
            L22:
                if (r2 >= r6) goto L33
                int r3 = r5.getSpanSize(r2)
                int r4 = r4 + r3
                if (r4 != r7) goto L2d
                r4 = 0
                goto L30
            L2d:
                if (r4 <= r7) goto L30
                r4 = r3
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r4
                if (r0 > r7) goto L37
                return r4
            L37:
                return r1
        }

        public abstract int getSpanSize(int r1);

        public void invalidateSpanGroupIndexCache() {
                r1 = this;
                android.util.SparseIntArray r0 = r1.mSpanGroupIndexCache
                r0.clear()
                return
        }

        public void invalidateSpanIndexCache() {
                r1 = this;
                android.util.SparseIntArray r0 = r1.mSpanIndexCache
                r0.clear()
                return
        }

        public boolean isSpanGroupIndexCacheEnabled() {
                r1 = this;
                boolean r0 = r1.mCacheSpanGroupIndices
                return r0
        }

        public boolean isSpanIndexCacheEnabled() {
                r1 = this;
                boolean r0 = r1.mCacheSpanIndices
                return r0
        }

        public void setSpanGroupIndexCacheEnabled(boolean r2) {
                r1 = this;
                if (r2 != 0) goto L7
                android.util.SparseIntArray r0 = r1.mSpanGroupIndexCache
                r0.clear()
            L7:
                r1.mCacheSpanGroupIndices = r2
                return
        }

        public void setSpanIndexCacheEnabled(boolean r2) {
                r1 = this;
                if (r2 != 0) goto L7
                android.util.SparseIntArray r0 = r1.mSpanGroupIndexCache
                r0.clear()
            L7:
                r1.mCacheSpanIndices = r2
                return
        }
    }

    public GridLayoutManager(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.mPendingSpanCountChange = r1
            r1 = -1
            r0.mSpanCount = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.mPreLayoutSpanSizeCache = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.mPreLayoutSpanIndexCache = r1
            androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup r1 = new androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup
            r1.<init>()
            r0.mSpanSizeLookup = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.mDecorInsets = r1
            r0.setSpanCount(r2)
            return
    }

    public GridLayoutManager(android.content.Context r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r1 = 0
            r0.mPendingSpanCountChange = r1
            r1 = -1
            r0.mSpanCount = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.mPreLayoutSpanSizeCache = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.mPreLayoutSpanIndexCache = r1
            androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup r1 = new androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup
            r1.<init>()
            r0.mSpanSizeLookup = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.mDecorInsets = r1
            r0.setSpanCount(r2)
            return
    }

    public GridLayoutManager(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            r0 = 0
            r1.mPendingSpanCountChange = r0
            r0 = -1
            r1.mSpanCount = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.mPreLayoutSpanSizeCache = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.mPreLayoutSpanIndexCache = r0
            androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup r0 = new androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup
            r0.<init>()
            r1.mSpanSizeLookup = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mDecorInsets = r0
            androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties r2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getProperties(r2, r3, r4, r5)
            int r2 = r2.spanCount
            r1.setSpanCount(r2)
            return
    }

    private void assignSpans(androidx.recyclerview.widget.RecyclerView.Recycler r5, androidx.recyclerview.widget.RecyclerView.State r6, int r7, boolean r8) {
            r4 = this;
            r0 = 0
            r1 = -1
            if (r8 == 0) goto L9
            r1 = 1
            r1 = r7
            r7 = 0
            r8 = 1
            goto Lc
        L9:
            int r7 = r7 + (-1)
            r8 = -1
        Lc:
            if (r7 == r1) goto L27
            android.view.View[] r2 = r4.mSet
            r2 = r2[r7]
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r3 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r3
            int r2 = r4.getPosition(r2)
            int r2 = r4.getSpanSize(r5, r6, r2)
            r3.mSpanSize = r2
            r3.mSpanIndex = r0
            int r0 = r0 + r2
            int r7 = r7 + r8
            goto Lc
        L27:
            return
    }

    private void cachePreLayoutSpanMapping() {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2a
            android.view.View r2 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r2 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r2
            int r3 = r2.getViewLayoutPosition()
            android.util.SparseIntArray r4 = r6.mPreLayoutSpanSizeCache
            int r5 = r2.getSpanSize()
            r4.put(r3, r5)
            android.util.SparseIntArray r4 = r6.mPreLayoutSpanIndexCache
            int r2 = r2.getSpanIndex()
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto L5
        L2a:
            return
    }

    private void calculateItemBorders(int r8) {
            r7 = this;
            int[] r0 = r7.mCachedBorders
            int r1 = r7.mSpanCount
            r2 = 1
            if (r0 == 0) goto L12
            int r3 = r0.length
            int r4 = r1 + 1
            if (r3 != r4) goto L12
            int r3 = r0.length
            int r3 = r3 - r2
            r3 = r0[r3]
            if (r3 == r8) goto L16
        L12:
            int r0 = r1 + 1
            int[] r0 = new int[r0]
        L16:
            r3 = 0
            r0[r3] = r3
            int r4 = r8 / r1
            int r8 = r8 % r1
            r5 = 0
        L1d:
            if (r2 > r1) goto L31
            int r3 = r3 + r8
            if (r3 <= 0) goto L2a
            int r6 = r1 - r3
            if (r6 >= r8) goto L2a
            int r6 = r4 + 1
            int r3 = r3 - r1
            goto L2b
        L2a:
            r6 = r4
        L2b:
            int r5 = r5 + r6
            r0[r2] = r5
            int r2 = r2 + 1
            goto L1d
        L31:
            r7.mCachedBorders = r0
            return
    }

    private void clearPreLayoutSpanMappingCache() {
            r1 = this;
            android.util.SparseIntArray r0 = r1.mPreLayoutSpanSizeCache
            r0.clear()
            android.util.SparseIntArray r0 = r1.mPreLayoutSpanIndexCache
            r0.clear()
            return
    }

    private int computeScrollOffsetWithSpanInfo(androidx.recyclerview.widget.RecyclerView.State r9) {
            r8 = this;
            int r0 = r8.getChildCount()
            r1 = 0
            if (r0 == 0) goto Laf
            int r0 = r9.getItemCount()
            if (r0 != 0) goto Lf
            goto Laf
        Lf:
            r8.ensureLayoutState()
            boolean r0 = r8.isSmoothScrollbarEnabled()
            r2 = r0 ^ 1
            android.view.View r3 = r8.findFirstVisibleChildClosestToStart(r2)
            android.view.View r2 = r8.findFirstVisibleChildClosestToEnd(r2)
            if (r3 == 0) goto Laf
            if (r2 != 0) goto L26
            goto Laf
        L26:
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r4 = r8.mSpanSizeLookup
            int r5 = r8.getPosition(r3)
            int r6 = r8.mSpanCount
            int r4 = r4.getCachedSpanGroupIndex(r5, r6)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r5 = r8.mSpanSizeLookup
            int r6 = r8.getPosition(r2)
            int r7 = r8.mSpanCount
            int r5 = r5.getCachedSpanGroupIndex(r6, r7)
            int r6 = java.lang.Math.min(r4, r5)
            int r4 = java.lang.Math.max(r4, r5)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r5 = r8.mSpanSizeLookup
            int r9 = r9.getItemCount()
            int r9 = r9 + (-1)
            int r7 = r8.mSpanCount
            int r9 = r5.getCachedSpanGroupIndex(r9, r7)
            int r9 = r9 + 1
            boolean r5 = r8.mShouldReverseLayout
            if (r5 == 0) goto L62
            int r9 = r9 - r4
            int r9 = r9 + (-1)
            int r9 = java.lang.Math.max(r1, r9)
            goto L66
        L62:
            int r9 = java.lang.Math.max(r1, r6)
        L66:
            if (r0 != 0) goto L69
            return r9
        L69:
            androidx.recyclerview.widget.OrientationHelper r0 = r8.mOrientationHelper
            int r0 = r0.getDecoratedEnd(r2)
            androidx.recyclerview.widget.OrientationHelper r1 = r8.mOrientationHelper
            int r1 = r1.getDecoratedStart(r3)
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r8.mSpanSizeLookup
            int r4 = r8.getPosition(r3)
            int r5 = r8.mSpanCount
            int r1 = r1.getCachedSpanGroupIndex(r4, r5)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r4 = r8.mSpanSizeLookup
            int r2 = r8.getPosition(r2)
            int r5 = r8.mSpanCount
            int r2 = r4.getCachedSpanGroupIndex(r2, r5)
            int r2 = r2 - r1
            int r2 = r2 + 1
            float r0 = (float) r0
            float r1 = (float) r2
            float r0 = r0 / r1
            float r9 = (float) r9
            float r9 = r9 * r0
            androidx.recyclerview.widget.OrientationHelper r0 = r8.mOrientationHelper
            int r0 = r0.getStartAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r1 = r8.mOrientationHelper
            int r1 = r1.getDecoratedStart(r3)
            int r0 = r0 - r1
            float r0 = (float) r0
            float r9 = r9 + r0
            int r9 = java.lang.Math.round(r9)
            return r9
        Laf:
            return r1
    }

    private int computeScrollRangeWithSpanInfo(androidx.recyclerview.widget.RecyclerView.State r6) {
            r5 = this;
            int r0 = r5.getChildCount()
            if (r0 == 0) goto L80
            int r0 = r6.getItemCount()
            if (r0 != 0) goto Ld
            goto L80
        Ld:
            r5.ensureLayoutState()
            boolean r0 = r5.isSmoothScrollbarEnabled()
            r0 = r0 ^ 1
            android.view.View r0 = r5.findFirstVisibleChildClosestToStart(r0)
            boolean r1 = r5.isSmoothScrollbarEnabled()
            r1 = r1 ^ 1
            android.view.View r1 = r5.findFirstVisibleChildClosestToEnd(r1)
            if (r0 == 0) goto L80
            if (r1 != 0) goto L29
            goto L80
        L29:
            boolean r2 = r5.isSmoothScrollbarEnabled()
            if (r2 != 0) goto L40
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r0 = r5.mSpanSizeLookup
            int r6 = r6.getItemCount()
            int r6 = r6 + (-1)
            int r1 = r5.mSpanCount
            int r6 = r0.getCachedSpanGroupIndex(r6, r1)
            int r6 = r6 + 1
            return r6
        L40:
            androidx.recyclerview.widget.OrientationHelper r2 = r5.mOrientationHelper
            int r2 = r2.getDecoratedEnd(r1)
            androidx.recyclerview.widget.OrientationHelper r3 = r5.mOrientationHelper
            int r3 = r3.getDecoratedStart(r0)
            int r2 = r2 - r3
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r3 = r5.mSpanSizeLookup
            int r0 = r5.getPosition(r0)
            int r4 = r5.mSpanCount
            int r0 = r3.getCachedSpanGroupIndex(r0, r4)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r3 = r5.mSpanSizeLookup
            int r1 = r5.getPosition(r1)
            int r4 = r5.mSpanCount
            int r1 = r3.getCachedSpanGroupIndex(r1, r4)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r3 = r5.mSpanSizeLookup
            int r6 = r6.getItemCount()
            int r6 = r6 + (-1)
            int r4 = r5.mSpanCount
            int r6 = r3.getCachedSpanGroupIndex(r6, r4)
            int r6 = r6 + 1
            int r1 = r1 - r0
            int r1 = r1 + 1
            float r0 = (float) r2
            float r1 = (float) r1
            float r0 = r0 / r1
            float r6 = (float) r6
            float r0 = r0 * r6
            int r6 = (int) r0
            return r6
        L80:
            r6 = 0
            return r6
    }

    private void ensureAnchorIsInCorrectSpan(androidx.recyclerview.widget.RecyclerView.Recycler r5, androidx.recyclerview.widget.RecyclerView.State r6, androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo r7, int r8) {
            r4 = this;
            r0 = 1
            if (r8 != r0) goto L5
            r8 = 1
            goto L6
        L5:
            r8 = 0
        L6:
            int r1 = r7.mPosition
            int r1 = r4.getSpanIndex(r5, r6, r1)
            if (r8 == 0) goto L1d
        Le:
            if (r1 <= 0) goto L33
            int r8 = r7.mPosition
            if (r8 <= 0) goto L33
            int r8 = r8 + (-1)
            r7.mPosition = r8
            int r1 = r4.getSpanIndex(r5, r6, r8)
            goto Le
        L1d:
            int r8 = r6.getItemCount()
            int r8 = r8 - r0
            int r0 = r7.mPosition
        L24:
            if (r0 >= r8) goto L31
            int r2 = r0 + 1
            int r3 = r4.getSpanIndex(r5, r6, r2)
            if (r3 <= r1) goto L31
            r0 = r2
            r1 = r3
            goto L24
        L31:
            r7.mPosition = r0
        L33:
            return
    }

    private void ensureViewSet() {
            r2 = this;
            android.view.View[] r0 = r2.mSet
            if (r0 == 0) goto L9
            int r0 = r0.length
            int r1 = r2.mSpanCount
            if (r0 == r1) goto Lf
        L9:
            int r0 = r2.mSpanCount
            android.view.View[] r0 = new android.view.View[r0]
            r2.mSet = r0
        Lf:
            return
    }

    private int getSpanGroupIndex(androidx.recyclerview.widget.RecyclerView.Recycler r1, androidx.recyclerview.widget.RecyclerView.State r2, int r3) {
            r0 = this;
            boolean r2 = r2.isPreLayout()
            if (r2 != 0) goto Lf
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            int r2 = r0.mSpanCount
            int r1 = r1.getCachedSpanGroupIndex(r3, r2)
            return r1
        Lf:
            int r1 = r1.convertPreLayoutPositionToPostLayout(r3)
            r2 = -1
            if (r1 != r2) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot find span size for pre layout position. "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GridLayoutManager"
            android.util.Log.w(r2, r1)
            r1 = 0
            return r1
        L2e:
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r2 = r0.mSpanSizeLookup
            int r3 = r0.mSpanCount
            int r1 = r2.getCachedSpanGroupIndex(r1, r3)
            return r1
    }

    private int getSpanIndex(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3, int r4) {
            r1 = this;
            boolean r3 = r3.isPreLayout()
            if (r3 != 0) goto Lf
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r2 = r1.mSpanSizeLookup
            int r3 = r1.mSpanCount
            int r2 = r2.getCachedSpanIndex(r4, r3)
            return r2
        Lf:
            android.util.SparseIntArray r3 = r1.mPreLayoutSpanIndexCache
            r0 = -1
            int r3 = r3.get(r4, r0)
            if (r3 == r0) goto L19
            return r3
        L19:
            int r2 = r2.convertPreLayoutPositionToPostLayout(r4)
            if (r2 != r0) goto L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
        L37:
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r3 = r1.mSpanSizeLookup
            int r4 = r1.mSpanCount
            int r2 = r3.getCachedSpanIndex(r2, r4)
            return r2
    }

    private int getSpanSize(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3, int r4) {
            r1 = this;
            boolean r3 = r3.isPreLayout()
            if (r3 != 0) goto Ld
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r2 = r1.mSpanSizeLookup
            int r2 = r2.getSpanSize(r4)
            return r2
        Ld:
            android.util.SparseIntArray r3 = r1.mPreLayoutSpanSizeCache
            r0 = -1
            int r3 = r3.get(r4, r0)
            if (r3 == r0) goto L17
            return r3
        L17:
            int r2 = r2.convertPreLayoutPositionToPostLayout(r4)
            if (r2 != r0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 1
            return r2
        L35:
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r3 = r1.mSpanSizeLookup
            int r2 = r3.getSpanSize(r2)
            return r2
    }

    private void guessMeasurement(float r2, int r3) {
            r1 = this;
            int r0 = r1.mSpanCount
            float r0 = (float) r0
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            int r2 = java.lang.Math.max(r2, r3)
            r1.calculateItemBorders(r2)
            return
    }

    private void measureChild(android.view.View r9, int r10, boolean r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r0
            android.graphics.Rect r1 = r0.mDecorInsets
            int r2 = r1.top
            int r3 = r1.bottom
            int r2 = r2 + r3
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            int r3 = r1.left
            int r1 = r1.right
            int r3 = r3 + r1
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r1 = r0.rightMargin
            int r3 = r3 + r1
            int r1 = r0.mSpanIndex
            int r4 = r0.mSpanSize
            int r1 = r8.getSpaceForSpanRange(r1, r4)
            int r4 = r8.mOrientation
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L43
            int r4 = r0.width
            int r10 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r1, r10, r3, r4, r5)
            androidx.recyclerview.widget.OrientationHelper r1 = r8.mOrientationHelper
            int r1 = r1.getTotalSpace()
            int r3 = r8.getHeightMode()
            int r0 = r0.height
            int r0 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r1, r3, r2, r0, r6)
            goto L5c
        L43:
            int r4 = r0.height
            int r10 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r1, r10, r2, r4, r5)
            androidx.recyclerview.widget.OrientationHelper r1 = r8.mOrientationHelper
            int r1 = r1.getTotalSpace()
            int r2 = r8.getWidthMode()
            int r0 = r0.width
            int r0 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r1, r2, r3, r0, r6)
            r7 = r0
            r0 = r10
            r10 = r7
        L5c:
            r8.measureChildWithDecorationsAndMargin(r9, r10, r0, r11)
            return
    }

    private void measureChildWithDecorationsAndMargin(android.view.View r2, int r3, int r4, boolean r5) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            if (r5 == 0) goto Ld
            boolean r5 = r1.shouldReMeasureChild(r2, r3, r4, r0)
            goto L11
        Ld:
            boolean r5 = r1.shouldMeasureChild(r2, r3, r4, r0)
        L11:
            if (r5 == 0) goto L16
            r2.measure(r3, r4)
        L16:
            return
    }

    private void updateMeasurements() {
            r2 = this;
            int r0 = r2.getOrientation()
            r1 = 1
            if (r0 != r1) goto L15
            int r0 = r2.getWidth()
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r2.getPaddingLeft()
            goto L22
        L15:
            int r0 = r2.getHeight()
            int r1 = r2.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r2.getPaddingTop()
        L22:
            int r0 = r0 - r1
            r2.calculateItemBorders(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(androidx.recyclerview.widget.RecyclerView.State r6, androidx.recyclerview.widget.LinearLayoutManager.LayoutState r7, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r8) {
            r5 = this;
            int r0 = r5.mSpanCount
            r1 = 0
            r2 = 0
        L4:
            int r3 = r5.mSpanCount
            if (r2 >= r3) goto L2c
            boolean r3 = r7.hasMore(r6)
            if (r3 == 0) goto L2c
            if (r0 <= 0) goto L2c
            int r3 = r7.mCurrentPosition
            int r4 = r7.mScrollingOffset
            int r4 = java.lang.Math.max(r1, r4)
            r8.addPosition(r3, r4)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r4 = r5.mSpanSizeLookup
            int r3 = r4.getSpanSize(r3)
            int r0 = r0 - r3
            int r3 = r7.mCurrentPosition
            int r4 = r7.mItemDirection
            int r3 = r3 + r4
            r7.mCurrentPosition = r3
            int r2 = r2 + 1
            goto L4
        L2c:
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            boolean r0 = r1.mUsingSpansToEstimateScrollBarDimensions
            if (r0 == 0) goto L9
            int r2 = r1.computeScrollOffsetWithSpanInfo(r2)
            return r2
        L9:
            int r2 = super.computeHorizontalScrollOffset(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            boolean r0 = r1.mUsingSpansToEstimateScrollBarDimensions
            if (r0 == 0) goto L9
            int r2 = r1.computeScrollRangeWithSpanInfo(r2)
            return r2
        L9:
            int r2 = super.computeHorizontalScrollRange(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            boolean r0 = r1.mUsingSpansToEstimateScrollBarDimensions
            if (r0 == 0) goto L9
            int r2 = r1.computeScrollOffsetWithSpanInfo(r2)
            return r2
        L9:
            int r2 = super.computeVerticalScrollOffset(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            boolean r0 = r1.mUsingSpansToEstimateScrollBarDimensions
            if (r0 == 0) goto L9
            int r2 = r1.computeScrollRangeWithSpanInfo(r2)
            return r2
        L9:
            int r2 = super.computeVerticalScrollRange(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final android.view.View findReferenceChild(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10, boolean r11, boolean r12) {
            r8 = this;
            int r11 = r8.getChildCount()
            r0 = -1
            r1 = 1
            if (r12 == 0) goto L10
            int r11 = r8.getChildCount()
            int r11 = r11 - r1
            r12 = r11
            r11 = -1
            goto L12
        L10:
            r12 = 0
            r0 = 1
        L12:
            int r1 = r10.getItemCount()
            r8.ensureLayoutState()
            androidx.recyclerview.widget.OrientationHelper r2 = r8.mOrientationHelper
            int r2 = r2.getStartAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r3 = r8.mOrientationHelper
            int r3 = r3.getEndAfterPadding()
            r4 = 0
            r5 = r4
        L27:
            if (r12 == r11) goto L63
            android.view.View r6 = r8.getChildAt(r12)
            int r7 = r8.getPosition(r6)
            if (r7 < 0) goto L61
            if (r7 >= r1) goto L61
            int r7 = r8.getSpanIndex(r9, r10, r7)
            if (r7 == 0) goto L3c
            goto L61
        L3c:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r7 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r7
            boolean r7 = r7.isItemRemoved()
            if (r7 == 0) goto L4c
            if (r5 != 0) goto L61
            r5 = r6
            goto L61
        L4c:
            androidx.recyclerview.widget.OrientationHelper r7 = r8.mOrientationHelper
            int r7 = r7.getDecoratedStart(r6)
            if (r7 >= r3) goto L5e
            androidx.recyclerview.widget.OrientationHelper r7 = r8.mOrientationHelper
            int r7 = r7.getDecoratedEnd(r6)
            if (r7 >= r2) goto L5d
            goto L5e
        L5d:
            return r6
        L5e:
            if (r4 != 0) goto L61
            r4 = r6
        L61:
            int r12 = r12 + r0
            goto L27
        L63:
            if (r4 == 0) goto L66
            goto L67
        L66:
            r4 = r5
        L67:
            return r4
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = -2
            r2 = -1
            if (r0 != 0) goto Lc
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
            r0.<init>(r1, r2)
            return r0
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
            r0.<init>(r2, r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L8
            int r3 = r2.mSpanCount
            return r3
        L8:
            int r0 = r4.getItemCount()
            if (r0 >= r1) goto L10
            r3 = 0
            return r3
        L10:
            int r0 = r4.getItemCount()
            int r0 = r0 - r1
            int r3 = r2.getSpanGroupIndex(r3, r4, r0)
            int r3 = r3 + r1
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r2 = this;
            int r0 = r2.mOrientation
            if (r0 != 0) goto L7
            int r3 = r2.mSpanCount
            return r3
        L7:
            int r0 = r4.getItemCount()
            r1 = 1
            if (r0 >= r1) goto L10
            r3 = 0
            return r3
        L10:
            int r0 = r4.getItemCount()
            int r0 = r0 - r1
            int r3 = r2.getSpanGroupIndex(r3, r4, r0)
            int r3 = r3 + r1
            return r3
    }

    public final int getSpaceForSpanRange(int r4, int r5) {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = 1
            if (r0 != r1) goto L19
            boolean r0 = r3.isLayoutRTL()
            if (r0 == 0) goto L19
            int[] r0 = r3.mCachedBorders
            int r1 = r3.mSpanCount
            int r2 = r1 - r4
            r2 = r0[r2]
            int r1 = r1 - r4
            int r1 = r1 - r5
            r4 = r0[r1]
            int r2 = r2 - r4
            return r2
        L19:
            int[] r0 = r3.mCachedBorders
            int r5 = r5 + r4
            r5 = r0[r5]
            r4 = r0[r4]
            int r5 = r5 - r4
            return r5
    }

    public int getSpanCount() {
            r1 = this;
            int r0 = r1.mSpanCount
            return r0
    }

    public androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup getSpanSizeLookup() {
            r1 = this;
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r0 = r1.mSpanSizeLookup
            return r0
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
            r1 = this;
            boolean r0 = r1.mUsingSpansToEstimateScrollBarDimensions
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(androidx.recyclerview.widget.RecyclerView.Recycler r19, androidx.recyclerview.widget.RecyclerView.State r20, androidx.recyclerview.widget.LinearLayoutManager.LayoutState r21, androidx.recyclerview.widget.LinearLayoutManager.LayoutChunkResult r22) {
            r18 = this;
            r6 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mOrientationHelper
            int r3 = r3.getModeInOther()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L18
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            int r9 = r18.getChildCount()
            if (r9 <= 0) goto L26
            int[] r9 = r6.mCachedBorders
            int r10 = r6.mSpanCount
            r9 = r9[r10]
            goto L27
        L26:
            r9 = 0
        L27:
            if (r4 == 0) goto L2c
            r18.updateMeasurements()
        L2c:
            int r10 = r2.mItemDirection
            if (r10 != r8) goto L32
            r10 = 1
            goto L33
        L32:
            r10 = 0
        L33:
            int r11 = r6.mSpanCount
            if (r10 != 0) goto L44
            int r11 = r2.mCurrentPosition
            int r11 = r6.getSpanIndex(r0, r1, r11)
            int r12 = r2.mCurrentPosition
            int r12 = r6.getSpanSize(r0, r1, r12)
            int r11 = r11 + r12
        L44:
            r12 = 0
        L45:
            int r13 = r6.mSpanCount
            if (r12 >= r13) goto L85
            boolean r13 = r2.hasMore(r1)
            if (r13 == 0) goto L85
            if (r11 <= 0) goto L85
            int r13 = r2.mCurrentPosition
            int r14 = r6.getSpanSize(r0, r1, r13)
            int r15 = r6.mSpanCount
            if (r14 > r15) goto L6d
            int r11 = r11 - r14
            if (r11 >= 0) goto L5f
            goto L85
        L5f:
            android.view.View r13 = r2.next(r0)
            if (r13 != 0) goto L66
            goto L85
        L66:
            android.view.View[] r14 = r6.mSet
            r14[r12] = r13
            int r12 = r12 + 1
            goto L45
        L6d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Item at position "
            java.lang.String r2 = " requires "
            java.lang.String r3 = " spans but GridLayoutManager has only "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r13, r2, r14, r3)
            int r2 = r6.mSpanCount
            java.lang.String r3 = " spans."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L85:
            if (r12 != 0) goto L8a
            r7.mFinished = r8
            return
        L8a:
            r11 = 0
            r6.assignSpans(r0, r1, r12, r10)
            r0 = 0
            r1 = 0
        L90:
            if (r0 >= r12) goto Ldc
            android.view.View[] r13 = r6.mSet
            r13 = r13[r0]
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r14 = r2.mScrapList
            if (r14 != 0) goto La4
            if (r10 == 0) goto La0
            r6.addView(r13)
            goto Lad
        La0:
            r6.addView(r13, r5)
            goto Lad
        La4:
            if (r10 == 0) goto Laa
            r6.addDisappearingView(r13)
            goto Lad
        Laa:
            r6.addDisappearingView(r13, r5)
        Lad:
            android.graphics.Rect r14 = r6.mDecorInsets
            r6.calculateItemDecorationsForChild(r13, r14)
            r6.measureChild(r13, r3, r5)
            androidx.recyclerview.widget.OrientationHelper r5 = r6.mOrientationHelper
            int r5 = r5.getDecoratedMeasurement(r13)
            if (r5 <= r1) goto Lbe
            r1 = r5
        Lbe:
            android.view.ViewGroup$LayoutParams r5 = r13.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            r14 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.OrientationHelper r15 = r6.mOrientationHelper
            int r13 = r15.getDecoratedMeasurementInOther(r13)
            float r13 = (float) r13
            float r13 = r13 * r14
            int r5 = r5.mSpanSize
            float r5 = (float) r5
            float r13 = r13 / r5
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 <= 0) goto Ld8
            r11 = r13
        Ld8:
            int r0 = r0 + 1
            r5 = 0
            goto L90
        Ldc:
            if (r4 == 0) goto Lfa
            r6.guessMeasurement(r11, r9)
            r0 = 0
            r1 = 0
        Le3:
            if (r0 >= r12) goto Lfa
            android.view.View[] r3 = r6.mSet
            r3 = r3[r0]
            r4 = 1073741824(0x40000000, float:2.0)
            r6.measureChild(r3, r4, r8)
            androidx.recyclerview.widget.OrientationHelper r4 = r6.mOrientationHelper
            int r3 = r4.getDecoratedMeasurement(r3)
            if (r3 <= r1) goto Lf7
            r1 = r3
        Lf7:
            int r0 = r0 + 1
            goto Le3
        Lfa:
            r0 = 0
        Lfb:
            if (r0 >= r12) goto L159
            android.view.View[] r3 = r6.mSet
            r3 = r3[r0]
            androidx.recyclerview.widget.OrientationHelper r4 = r6.mOrientationHelper
            int r4 = r4.getDecoratedMeasurement(r3)
            if (r4 == r1) goto L156
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r4 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r4
            android.graphics.Rect r5 = r4.mDecorInsets
            int r9 = r5.top
            int r10 = r5.bottom
            int r9 = r9 + r10
            int r10 = r4.topMargin
            int r9 = r9 + r10
            int r10 = r4.bottomMargin
            int r9 = r9 + r10
            int r10 = r5.left
            int r5 = r5.right
            int r10 = r10 + r5
            int r5 = r4.leftMargin
            int r10 = r10 + r5
            int r5 = r4.rightMargin
            int r10 = r10 + r5
            int r5 = r4.mSpanIndex
            int r11 = r4.mSpanSize
            int r5 = r6.getSpaceForSpanRange(r5, r11)
            int r11 = r6.mOrientation
            if (r11 != r8) goto L143
            int r4 = r4.width
            r11 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            int r4 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r5, r11, r10, r4, r13)
            int r5 = r1 - r9
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L153
        L143:
            r11 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            int r10 = r1 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r4 = r4.height
            int r5 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r5, r11, r9, r4, r13)
            r4 = r10
        L153:
            r6.measureChildWithDecorationsAndMargin(r3, r4, r5, r8)
        L156:
            int r0 = r0 + 1
            goto Lfb
        L159:
            r0 = 0
            r7.mConsumed = r1
            int r3 = r6.mOrientation
            r4 = -1
            if (r3 != r8) goto L175
            int r3 = r2.mLayoutDirection
            if (r3 != r4) goto L16a
            int r2 = r2.mOffset
            int r1 = r2 - r1
            goto L172
        L16a:
            int r2 = r2.mOffset
            int r1 = r1 + r2
            r17 = r2
            r2 = r1
            r1 = r17
        L172:
            r3 = 0
            r4 = 0
            goto L187
        L175:
            int r3 = r2.mLayoutDirection
            if (r3 != r4) goto L180
            int r2 = r2.mOffset
            int r1 = r2 - r1
            r4 = r1
            r3 = r2
            goto L185
        L180:
            int r2 = r2.mOffset
            int r1 = r1 + r2
            r3 = r1
            r4 = r2
        L185:
            r2 = 0
            r1 = 0
        L187:
            r9 = 0
        L188:
            if (r9 >= r12) goto L210
            android.view.View[] r0 = r6.mSet
            r10 = r0[r9]
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            r11 = r0
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r11 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r11
            int r0 = r6.mOrientation
            if (r0 != r8) goto L1ce
            boolean r0 = r18.isLayoutRTL()
            if (r0 == 0) goto L1b6
            int r0 = r18.getPaddingLeft()
            int[] r3 = r6.mCachedBorders
            int r4 = r6.mSpanCount
            int r5 = r11.mSpanIndex
            int r4 = r4 - r5
            r3 = r3[r4]
            int r0 = r0 + r3
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mOrientationHelper
            int r3 = r3.getDecoratedMeasurementInOther(r10)
            int r3 = r0 - r3
            goto L1c8
        L1b6:
            int r0 = r18.getPaddingLeft()
            int[] r3 = r6.mCachedBorders
            int r4 = r11.mSpanIndex
            r3 = r3[r4]
            int r3 = r3 + r0
            androidx.recyclerview.widget.OrientationHelper r0 = r6.mOrientationHelper
            int r0 = r0.getDecoratedMeasurementInOther(r10)
            int r0 = r0 + r3
        L1c8:
            r15 = r0
            r13 = r1
            r14 = r2
            r16 = r3
            goto L1e5
        L1ce:
            int r0 = r18.getPaddingTop()
            int[] r1 = r6.mCachedBorders
            int r2 = r11.mSpanIndex
            r1 = r1[r2]
            int r0 = r0 + r1
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mOrientationHelper
            int r1 = r1.getDecoratedMeasurementInOther(r10)
            int r1 = r1 + r0
            r13 = r0
            r14 = r1
            r15 = r3
            r16 = r4
        L1e5:
            r0 = r18
            r1 = r10
            r2 = r16
            r3 = r13
            r4 = r15
            r5 = r14
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            boolean r0 = r11.isItemRemoved()
            if (r0 != 0) goto L1fc
            boolean r0 = r11.isItemChanged()
            if (r0 == 0) goto L1fe
        L1fc:
            r7.mIgnoreConsumed = r8
        L1fe:
            boolean r0 = r7.mFocusable
            boolean r1 = r10.hasFocusable()
            r0 = r0 | r1
            r7.mFocusable = r0
            int r9 = r9 + 1
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            goto L188
        L210:
            android.view.View[] r0 = r6.mSet
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3, androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo r4, int r5) {
            r1 = this;
            r1.updateMeasurements()
            int r0 = r3.getItemCount()
            if (r0 <= 0) goto L12
            boolean r0 = r3.isPreLayout()
            if (r0 != 0) goto L12
            r1.ensureAnchorIsInCorrectSpan(r2, r3, r4, r5)
        L12:
            r1.ensureViewSet()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.Recycler r26, androidx.recyclerview.widget.RecyclerView.State r27) {
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.findContainingItemView(r24)
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.mSpanIndex
            int r5 = r5.mSpanSize
            int r5 = r5 + r6
            android.view.View r7 = super.onFocusSearchFailed(r24, r25, r26, r27)
            if (r7 != 0) goto L20
            return r4
        L20:
            r7 = r25
            int r7 = r0.convertFocusDirectionToLayoutDirection(r7)
            r9 = 1
            if (r7 != r9) goto L2b
            r7 = 1
            goto L2c
        L2b:
            r7 = 0
        L2c:
            boolean r10 = r0.mShouldReverseLayout
            if (r7 == r10) goto L32
            r7 = 1
            goto L33
        L32:
            r7 = 0
        L33:
            r10 = -1
            if (r7 == 0) goto L3e
            int r7 = r23.getChildCount()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L45
        L3e:
            int r7 = r23.getChildCount()
            r11 = r7
            r7 = 0
            r12 = 1
        L45:
            int r13 = r0.mOrientation
            if (r13 != r9) goto L51
            boolean r13 = r23.isLayoutRTL()
            if (r13 == 0) goto L51
            r13 = 1
            goto L52
        L51:
            r13 = 0
        L52:
            int r14 = r0.getSpanGroupIndex(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L5e:
            if (r10 == r11) goto L149
            int r9 = r0.getSpanGroupIndex(r1, r2, r10)
            android.view.View r1 = r0.getChildAt(r10)
            if (r1 != r3) goto L6c
            goto L149
        L6c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L86
            if (r9 == r14) goto L86
            if (r4 == 0) goto L78
            goto L149
        L78:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L135
        L86:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.mSpanIndex
            r18 = r3
            int r3 = r9.mSpanSize
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L9e
            if (r2 != r6) goto L9e
            if (r3 != r5) goto L9e
            return r1
        L9e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto La6
            if (r4 == 0) goto Lae
        La6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto Lba
            if (r7 != 0) goto Lba
        Lae:
            r21 = r7
        Lb0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        Lb8:
            r11 = 1
            goto L105
        Lba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Ld9
            if (r7 <= r8) goto Lcf
        Lce:
            goto Lb0
        Lcf:
            if (r7 != r8) goto Lfc
            if (r2 <= r15) goto Ld5
            r7 = 1
            goto Ld6
        Ld5:
            r7 = 0
        Ld6:
            if (r13 != r7) goto Lfc
            goto Lce
        Ld9:
            if (r4 != 0) goto Lfc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.isViewPartiallyVisible(r1, r8, r11)
            if (r22 == 0) goto L100
            r8 = r17
            if (r7 <= r8) goto Lee
            r7 = r16
            goto L105
        Lee:
            if (r7 != r8) goto Lf9
            r7 = r16
            if (r2 <= r7) goto Lf5
            goto Lf6
        Lf5:
            r11 = 0
        Lf6:
            if (r13 != r11) goto L104
            goto Lb8
        Lf9:
            r7 = r16
            goto L104
        Lfc:
            r19 = r8
            r20 = r11
        L100:
            r7 = r16
            r8 = r17
        L104:
            r11 = 0
        L105:
            if (r11 == 0) goto L135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L123
            int r4 = r9.mSpanIndex
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L13d
        L123:
            int r7 = r9.mSpanIndex
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L13d
        L135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L13d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L5e
        L149:
            r21 = r7
            if (r4 == 0) goto L14e
            goto L150
        L14e:
            r4 = r21
        L150:
            return r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(androidx.recyclerview.widget.RecyclerView.Recycler r8, androidx.recyclerview.widget.RecyclerView.State r9, android.view.View r10, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r11) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams
            if (r1 != 0) goto Lc
            r7.onInitializeAccessibilityNodeInfoForItem(r10, r11)
            return
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r0
            int r10 = r0.getViewLayoutPosition()
            int r8 = r7.getSpanGroupIndex(r8, r9, r10)
            int r9 = r7.mOrientation
            if (r9 != 0) goto L2e
            int r1 = r0.getSpanIndex()
            int r2 = r0.getSpanSize()
            r4 = 1
            r5 = 0
            r6 = 0
            r3 = r8
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r8 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r1, r2, r3, r4, r5, r6)
            r11.setCollectionItemInfo(r8)
            goto L41
        L2e:
            r2 = 1
            int r3 = r0.getSpanIndex()
            int r4 = r0.getSpanSize()
            r5 = 0
            r6 = 0
            r1 = r8
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r8 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r1, r2, r3, r4, r5, r6)
            r11.setCollectionItemInfo(r8)
        L41:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanIndexCache()
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanGroupIndexCache()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanIndexCache()
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanGroupIndexCache()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, int r4) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanIndexCache()
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanGroupIndexCache()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanIndexCache()
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanGroupIndexCache()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanIndexCache()
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanGroupIndexCache()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r1 = this;
            boolean r0 = r3.isPreLayout()
            if (r0 == 0) goto L9
            r1.cachePreLayoutSpanMapping()
        L9:
            super.onLayoutChildren(r2, r3)
            r1.clearPreLayoutSpanMappingCache()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            super.onLayoutCompleted(r1)
            r1 = 0
            r0.mPendingSpanCountChange = r1
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int r1, androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r0 = this;
            r0.updateMeasurements()
            r0.ensureViewSet()
            int r1 = super.scrollHorizontallyBy(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int r1, androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r0 = this;
            r0.updateMeasurements()
            r0.ensureViewSet()
            int r1 = super.scrollVerticallyBy(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int[] r0 = r4.mCachedBorders
            if (r0 != 0) goto L7
            super.setMeasuredDimension(r5, r6, r7)
        L7:
            int r0 = r4.getPaddingLeft()
            int r1 = r4.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r4.getPaddingTop()
            int r2 = r4.getPaddingBottom()
            int r2 = r2 + r0
            int r0 = r4.mOrientation
            r3 = 1
            if (r0 != r3) goto L3b
            int r5 = r5.height()
            int r5 = r5 + r2
            int r0 = r4.getMinimumHeight()
            int r5 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r7, r5, r0)
            int[] r7 = r4.mCachedBorders
            int r0 = r7.length
            int r0 = r0 - r3
            r7 = r7[r0]
            int r7 = r7 + r1
            int r0 = r4.getMinimumWidth()
            int r6 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r6, r7, r0)
            goto L57
        L3b:
            int r5 = r5.width()
            int r5 = r5 + r1
            int r0 = r4.getMinimumWidth()
            int r6 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r6, r5, r0)
            int[] r5 = r4.mCachedBorders
            int r0 = r5.length
            int r0 = r0 - r3
            r5 = r5[r0]
            int r5 = r5 + r2
            int r0 = r4.getMinimumHeight()
            int r5 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r7, r5, r0)
        L57:
            r4.setMeasuredDimension(r6, r5)
            return
    }

    public void setSpanCount(int r3) {
            r2 = this;
            int r0 = r2.mSpanCount
            if (r3 != r0) goto L5
            return
        L5:
            r0 = 1
            r2.mPendingSpanCountChange = r0
            if (r3 < r0) goto L15
            r2.mSpanCount = r3
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r3 = r2.mSpanSizeLookup
            r3.invalidateSpanIndexCache()
            r2.requestLayout()
            return
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Span count should be at least 1. Provided "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    public void setSpanSizeLookup(androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup r1) {
            r0 = this;
            r0.mSpanSizeLookup = r1
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            super.setStackFromEnd(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "GridLayoutManager does not support stack from end. Consider using reverse layout"
            r2.<init>(r0)
            throw r2
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean r1) {
            r0 = this;
            r0.mUsingSpansToEstimateScrollBarDimensions = r1
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r1.mPendingSavedState
            if (r0 != 0) goto La
            boolean r0 = r1.mPendingSpanCountChange
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }
}
