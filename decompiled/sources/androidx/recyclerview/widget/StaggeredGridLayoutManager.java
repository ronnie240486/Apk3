package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager implements androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider {

    @java.lang.Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final java.lang.String TAG = "StaggeredGridLManager";
    public static final int VERTICAL = 1;
    private final androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo mAnchorInfo;
    private final java.lang.Runnable mCheckForGapsRunnable;
    private int mFullSizeSpec;
    private int mGapStrategy;
    private boolean mLaidOutInvalidFullSpan;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;

    @androidx.annotation.NonNull
    private final androidx.recyclerview.widget.LayoutState mLayoutState;
    public androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup mLazySpanLookup;
    private int mOrientation;
    private androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    private int[] mPrefetchDistances;

    @androidx.annotation.NonNull
    public androidx.recyclerview.widget.OrientationHelper mPrimaryOrientation;
    private java.util.BitSet mRemainingSpans;
    public boolean mReverseLayout;

    @androidx.annotation.NonNull
    public androidx.recyclerview.widget.OrientationHelper mSecondaryOrientation;
    public boolean mShouldReverseLayout;
    private int mSizePerSpan;
    private boolean mSmoothScrollbarEnabled;
    private int mSpanCount;
    public androidx.recyclerview.widget.StaggeredGridLayoutManager.Span[] mSpans;
    private final android.graphics.Rect mTmpRect;


    /* JADX INFO: loaded from: classes3.dex */
    public class AnchorInfo {
        public boolean mInvalidateOffsets;
        public boolean mLayoutFromEnd;
        public int mOffset;
        public int mPosition;
        public int[] mSpanReferenceLines;
        public boolean mValid;
        public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager this$0;

        public AnchorInfo(androidx.recyclerview.widget.StaggeredGridLayoutManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.reset()
                return
        }

        public final void assignCoordinateFromPadding() {
                r1 = this;
                boolean r0 = r1.mLayoutFromEnd
                if (r0 == 0) goto Ld
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.this$0
                androidx.recyclerview.widget.OrientationHelper r0 = r0.mPrimaryOrientation
                int r0 = r0.getEndAfterPadding()
                goto L15
            Ld:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.this$0
                androidx.recyclerview.widget.OrientationHelper r0 = r0.mPrimaryOrientation
                int r0 = r0.getStartAfterPadding()
            L15:
                r1.mOffset = r0
                return
        }

        public final void reset() {
                r2 = this;
                r0 = -1
                r2.mPosition = r0
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2.mOffset = r1
                r1 = 0
                r2.mLayoutFromEnd = r1
                r2.mInvalidateOffsets = r1
                r2.mValid = r1
                int[] r1 = r2.mSpanReferenceLines
                if (r1 == 0) goto L15
                java.util.Arrays.fill(r1, r0)
            L15:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        public boolean mFullSpan;
        public androidx.recyclerview.widget.StaggeredGridLayoutManager.Span mSpan;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public final int getSpanIndex() {
                r1 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r0 = r1.mSpan
                if (r0 != 0) goto L6
                r0 = -1
                return r0
            L6:
                int r0 = r0.mIndex
                return r0
        }

        public boolean isFullSpan() {
                r1 = this;
                boolean r0 = r1.mFullSpan
                return r0
        }

        public void setFullSpan(boolean r1) {
                r0 = this;
                r0.mFullSpan = r1
                return
        }
    }

    public static class LazySpanLookup {
        private static final int MIN_SIZE = 10;
        public int[] mData;
        public java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> mFullSpanItems;

        @android.annotation.SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> CREATOR = null;
            public int mGapDir;
            public int[] mGapPerSpan;
            public boolean mHasUnwantedGapAfter;
            public int mPosition;


            static {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1
                    r0.<init>()
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.CREATOR = r0
                    return
            }

            public FullSpanItem() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public FullSpanItem(android.os.Parcel r3) {
                    r2 = this;
                    r2.<init>()
                    int r0 = r3.readInt()
                    r2.mPosition = r0
                    int r0 = r3.readInt()
                    r2.mGapDir = r0
                    int r0 = r3.readInt()
                    r1 = 1
                    if (r0 != r1) goto L17
                    goto L18
                L17:
                    r1 = 0
                L18:
                    r2.mHasUnwantedGapAfter = r1
                    int r0 = r3.readInt()
                    if (r0 <= 0) goto L27
                    int[] r0 = new int[r0]
                    r2.mGapPerSpan = r0
                    r3.readIntArray(r0)
                L27:
                    return
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    java.lang.String r0 = "FullSpanItem{mPosition="
                    java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                    int r1 = r2.mPosition
                    r0.append(r1)
                    java.lang.String r1 = ", mGapDir="
                    r0.append(r1)
                    int r1 = r2.mGapDir
                    r0.append(r1)
                    java.lang.String r1 = ", mHasUnwantedGapAfter="
                    r0.append(r1)
                    boolean r1 = r2.mHasUnwantedGapAfter
                    r0.append(r1)
                    java.lang.String r1 = ", mGapPerSpan="
                    r0.append(r1)
                    int[] r1 = r2.mGapPerSpan
                    java.lang.String r1 = java.util.Arrays.toString(r1)
                    r0.append(r1)
                    r1 = 125(0x7d, float:1.75E-43)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel r2, int r3) {
                    r1 = this;
                    int r3 = r1.mPosition
                    r2.writeInt(r3)
                    int r3 = r1.mGapDir
                    r2.writeInt(r3)
                    boolean r3 = r1.mHasUnwantedGapAfter
                    r2.writeInt(r3)
                    int[] r3 = r1.mGapPerSpan
                    if (r3 == 0) goto L20
                    int r0 = r3.length
                    if (r0 <= 0) goto L20
                    int r3 = r3.length
                    r2.writeInt(r3)
                    int[] r3 = r1.mGapPerSpan
                    r2.writeIntArray(r3)
                    goto L24
                L20:
                    r3 = 0
                    r2.writeInt(r3)
                L24:
                    return
            }
        }

        public LazySpanLookup() {
                r0 = this;
                r0.<init>()
                return
        }

        private int invalidateFullSpansAfter(int r5) {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.mFullSpanItems
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.getFullSpanItem(r5)
                if (r0 == 0) goto L11
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.mFullSpanItems
                r2.remove(r0)
            L11:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.mFullSpanItems
                int r0 = r0.size()
                r2 = 0
            L18:
                if (r2 >= r0) goto L2a
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.mFullSpanItems
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.mPosition
                if (r3 < r5) goto L27
                goto L2b
            L27:
                int r2 = r2 + 1
                goto L18
            L2a:
                r2 = -1
            L2b:
                if (r2 == r1) goto L3d
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r5 = r4.mFullSpanItems
                java.lang.Object r5 = r5.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r5
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.mFullSpanItems
                r0.remove(r2)
                int r5 = r5.mPosition
                return r5
            L3d:
                return r1
        }

        private void offsetFullSpansForAddition(int r4, int r5) {
                r3 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r3.mFullSpanItems
                if (r0 != 0) goto L5
                return
            L5:
                int r0 = r0.size()
                int r0 = r0 + (-1)
            Lb:
                if (r0 < 0) goto L20
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r1 = r3.mFullSpanItems
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r1
                int r2 = r1.mPosition
                if (r2 >= r4) goto L1a
                goto L1d
            L1a:
                int r2 = r2 + r5
                r1.mPosition = r2
            L1d:
                int r0 = r0 + (-1)
                goto Lb
            L20:
                return
        }

        private void offsetFullSpansForRemoval(int r5, int r6) {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.mFullSpanItems
                if (r0 != 0) goto L5
                return
            L5:
                int r1 = r5 + r6
                int r0 = r0.size()
                int r0 = r0 + (-1)
            Ld:
                if (r0 < 0) goto L2a
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.mFullSpanItems
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r2
                int r3 = r2.mPosition
                if (r3 >= r5) goto L1c
                goto L27
            L1c:
                if (r3 >= r1) goto L24
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.mFullSpanItems
                r2.remove(r0)
                goto L27
            L24:
                int r3 = r3 - r6
                r2.mPosition = r3
            L27:
                int r0 = r0 + (-1)
                goto Ld
            L2a:
                return
        }

        public void addFullSpanItem(androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem r6) {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.mFullSpanItems
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mFullSpanItems = r0
            Lb:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.mFullSpanItems
                int r0 = r0.size()
                r1 = 0
            L12:
                if (r1 >= r0) goto L36
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r5.mFullSpanItems
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r2
                int r3 = r2.mPosition
                int r4 = r6.mPosition
                if (r3 != r4) goto L27
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.mFullSpanItems
                r3.remove(r1)
            L27:
                int r2 = r2.mPosition
                int r3 = r6.mPosition
                if (r2 < r3) goto L33
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.mFullSpanItems
                r0.add(r1, r6)
                return
            L33:
                int r1 = r1 + 1
                goto L12
            L36:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.mFullSpanItems
                r0.add(r6)
                return
        }

        public final void clear() {
                r2 = this;
                int[] r0 = r2.mData
                if (r0 == 0) goto L8
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            L8:
                r0 = 0
                r2.mFullSpanItems = r0
                return
        }

        public final void ensureSize(int r5) {
                r4 = this;
                int[] r0 = r4.mData
                r1 = -1
                if (r0 != 0) goto L15
                r0 = 10
                int r5 = java.lang.Math.max(r5, r0)
                int r5 = r5 + 1
                int[] r5 = new int[r5]
                r4.mData = r5
                java.util.Arrays.fill(r5, r1)
                goto L2e
            L15:
                int r2 = r0.length
                if (r5 < r2) goto L2e
                int r2 = r0.length
            L19:
                if (r2 > r5) goto L1e
                int r2 = r2 * 2
                goto L19
            L1e:
                int[] r5 = new int[r2]
                r4.mData = r5
                int r2 = r0.length
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r5, r3, r2)
                int[] r5 = r4.mData
                int r0 = r0.length
                int r2 = r5.length
                java.util.Arrays.fill(r5, r0, r2, r1)
            L2e:
                return
        }

        public final int forceInvalidateAfter(int r3) {
                r2 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r2.mFullSpanItems
                if (r0 == 0) goto L1e
                int r0 = r0.size()
            L8:
                int r0 = r0 + (-1)
                if (r0 < 0) goto L1e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r1 = r2.mFullSpanItems
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r1
                int r1 = r1.mPosition
                if (r1 < r3) goto L8
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r1 = r2.mFullSpanItems
                r1.remove(r0)
                goto L8
            L1e:
                int r3 = r2.invalidateAfter(r3)
                return r3
        }

        public androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem getFirstFullSpanItemInRange(int r6, int r7, int r8, boolean r9) {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.mFullSpanItems
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.size()
                r2 = 0
            Lb:
                if (r2 >= r0) goto L2c
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.mFullSpanItems
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r4 = r3.mPosition
                if (r4 < r7) goto L1a
                return r1
            L1a:
                if (r4 < r6) goto L29
                if (r8 == 0) goto L28
                int r4 = r3.mGapDir
                if (r4 == r8) goto L28
                if (r9 == 0) goto L29
                boolean r4 = r3.mHasUnwantedGapAfter
                if (r4 == 0) goto L29
            L28:
                return r3
            L29:
                int r2 = r2 + 1
                goto Lb
            L2c:
                return r1
        }

        public androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem getFullSpanItem(int r5) {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.mFullSpanItems
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.size()
                int r0 = r0 + (-1)
            Lc:
                if (r0 < 0) goto L1e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.mFullSpanItems
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r2
                int r3 = r2.mPosition
                if (r3 != r5) goto L1b
                return r2
            L1b:
                int r0 = r0 + (-1)
                goto Lc
            L1e:
                return r1
        }

        public final int invalidateAfter(int r4) {
                r3 = this;
                int[] r0 = r3.mData
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r4 < r0) goto La
                return r1
            La:
                int r0 = r3.invalidateFullSpansAfter(r4)
                if (r0 != r1) goto L1a
                int[] r0 = r3.mData
                int r2 = r0.length
                java.util.Arrays.fill(r0, r4, r2, r1)
                int[] r4 = r3.mData
                int r4 = r4.length
                return r4
            L1a:
                int r0 = r0 + 1
                int[] r2 = r3.mData
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r3.mData
                java.util.Arrays.fill(r2, r4, r0, r1)
                return r0
        }

        public final void offsetForAddition(int r4, int r5) {
                r3 = this;
                int[] r0 = r3.mData
                if (r0 == 0) goto L1e
                int r0 = r0.length
                if (r4 < r0) goto L8
                goto L1e
            L8:
                int r0 = r4 + r5
                r3.ensureSize(r0)
                int[] r1 = r3.mData
                int r2 = r1.length
                int r2 = r2 - r4
                int r2 = r2 - r5
                java.lang.System.arraycopy(r1, r4, r1, r0, r2)
                int[] r1 = r3.mData
                r2 = -1
                java.util.Arrays.fill(r1, r4, r0, r2)
                r3.offsetFullSpansForAddition(r4, r5)
            L1e:
                return
        }

        public final void offsetForRemoval(int r5, int r6) {
                r4 = this;
                int[] r0 = r4.mData
                if (r0 == 0) goto L21
                int r0 = r0.length
                if (r5 < r0) goto L8
                goto L21
            L8:
                int r0 = r5 + r6
                r4.ensureSize(r0)
                int[] r1 = r4.mData
                int r2 = r1.length
                int r2 = r2 - r5
                int r2 = r2 - r6
                java.lang.System.arraycopy(r1, r0, r1, r5, r2)
                int[] r0 = r4.mData
                int r1 = r0.length
                int r1 = r1 - r6
                int r2 = r0.length
                r3 = -1
                java.util.Arrays.fill(r0, r1, r2, r3)
                r4.offsetFullSpansForRemoval(r5, r6)
            L21:
                return
        }
    }

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState> CREATOR = null;
        public boolean mAnchorLayoutFromEnd;
        public int mAnchorPosition;
        public java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> mFullSpanItems;
        public boolean mLastLayoutRTL;
        public boolean mReverseLayout;
        public int[] mSpanLookup;
        public int mSpanLookupSize;
        public int[] mSpanOffsets;
        public int mSpanOffsetsSize;
        public int mVisibleAnchorPosition;


        static {
                androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$1 r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$1
                r0.<init>()
                androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.CREATOR = r0
                return
        }

        public SavedState() {
                r0 = this;
                r0.<init>()
                return
        }

        public SavedState(android.os.Parcel r4) {
                r3 = this;
                r3.<init>()
                int r0 = r4.readInt()
                r3.mAnchorPosition = r0
                int r0 = r4.readInt()
                r3.mVisibleAnchorPosition = r0
                int r0 = r4.readInt()
                r3.mSpanOffsetsSize = r0
                if (r0 <= 0) goto L1e
                int[] r0 = new int[r0]
                r3.mSpanOffsets = r0
                r4.readIntArray(r0)
            L1e:
                int r0 = r4.readInt()
                r3.mSpanLookupSize = r0
                if (r0 <= 0) goto L2d
                int[] r0 = new int[r0]
                r3.mSpanLookup = r0
                r4.readIntArray(r0)
            L2d:
                int r0 = r4.readInt()
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L37
                r0 = 1
                goto L38
            L37:
                r0 = 0
            L38:
                r3.mReverseLayout = r0
                int r0 = r4.readInt()
                if (r0 != r2) goto L42
                r0 = 1
                goto L43
            L42:
                r0 = 0
            L43:
                r3.mAnchorLayoutFromEnd = r0
                int r0 = r4.readInt()
                if (r0 != r2) goto L4c
                r1 = 1
            L4c:
                r3.mLastLayoutRTL = r1
                java.lang.Class<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.util.ArrayList r4 = r4.readArrayList(r0)
                r3.mFullSpanItems = r4
                return
        }

        public SavedState(androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.mSpanOffsetsSize
                r1.mSpanOffsetsSize = r0
                int r0 = r2.mAnchorPosition
                r1.mAnchorPosition = r0
                int r0 = r2.mVisibleAnchorPosition
                r1.mVisibleAnchorPosition = r0
                int[] r0 = r2.mSpanOffsets
                r1.mSpanOffsets = r0
                int r0 = r2.mSpanLookupSize
                r1.mSpanLookupSize = r0
                int[] r0 = r2.mSpanLookup
                r1.mSpanLookup = r0
                boolean r0 = r2.mReverseLayout
                r1.mReverseLayout = r0
                boolean r0 = r2.mAnchorLayoutFromEnd
                r1.mAnchorLayoutFromEnd = r0
                boolean r0 = r2.mLastLayoutRTL
                r1.mLastLayoutRTL = r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r2.mFullSpanItems
                r1.mFullSpanItems = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public final void invalidateAnchorPositionInfo() {
                r1 = this;
                r0 = 0
                r1.mSpanOffsets = r0
                r0 = 0
                r1.mSpanOffsetsSize = r0
                r0 = -1
                r1.mAnchorPosition = r0
                r1.mVisibleAnchorPosition = r0
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.mAnchorPosition
                r1.writeInt(r2)
                int r2 = r0.mVisibleAnchorPosition
                r1.writeInt(r2)
                int r2 = r0.mSpanOffsetsSize
                r1.writeInt(r2)
                int r2 = r0.mSpanOffsetsSize
                if (r2 <= 0) goto L18
                int[] r2 = r0.mSpanOffsets
                r1.writeIntArray(r2)
            L18:
                int r2 = r0.mSpanLookupSize
                r1.writeInt(r2)
                int r2 = r0.mSpanLookupSize
                if (r2 <= 0) goto L26
                int[] r2 = r0.mSpanLookup
                r1.writeIntArray(r2)
            L26:
                boolean r2 = r0.mReverseLayout
                r1.writeInt(r2)
                boolean r2 = r0.mAnchorLayoutFromEnd
                r1.writeInt(r2)
                boolean r2 = r0.mLastLayoutRTL
                r1.writeInt(r2)
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r0.mFullSpanItems
                r1.writeList(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Span {
        public int mCachedEnd;
        public int mCachedStart;
        public int mDeletedSize;
        public final int mIndex;
        public java.util.ArrayList<android.view.View> mViews;
        public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager this$0;

        public Span(androidx.recyclerview.widget.StaggeredGridLayoutManager r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.mViews = r1
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0.mCachedStart = r1
                r0.mCachedEnd = r1
                r1 = 0
                r0.mDeletedSize = r1
                r0.mIndex = r2
                return
        }

        public final void appendToSpan(android.view.View r5) {
                r4 = this;
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r0
                r0.mSpan = r4
                java.util.ArrayList<android.view.View> r1 = r4.mViews
                r1.add(r5)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r4.mCachedEnd = r1
                java.util.ArrayList<android.view.View> r2 = r4.mViews
                int r2 = r2.size()
                r3 = 1
                if (r2 != r3) goto L1c
                r4.mCachedStart = r1
            L1c:
                boolean r1 = r0.isItemRemoved()
                if (r1 != 0) goto L28
                boolean r0 = r0.isItemChanged()
                if (r0 == 0) goto L35
            L28:
                int r0 = r4.mDeletedSize
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r4.this$0
                androidx.recyclerview.widget.OrientationHelper r1 = r1.mPrimaryOrientation
                int r5 = r1.getDecoratedMeasurement(r5)
                int r5 = r5 + r0
                r4.mDeletedSize = r5
            L35:
                return
        }

        public final void calculateCachedEnd() {
                r4 = this;
                java.util.ArrayList<android.view.View> r0 = r4.mViews
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object r0 = r0.get(r1)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r1 = r4.getLayoutParams(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r4.this$0
                androidx.recyclerview.widget.OrientationHelper r3 = r3.mPrimaryOrientation
                int r0 = r3.getDecoratedEnd(r0)
                r4.mCachedEnd = r0
                boolean r0 = r1.mFullSpan
                if (r0 == 0) goto L41
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r4.this$0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r0.mLazySpanLookup
                int r1 = r1.getViewLayoutPosition()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r0.getFullSpanItem(r1)
                if (r0 == 0) goto L41
                int r1 = r0.mGapDir
                if (r1 != r2) goto L41
                int r1 = r4.mCachedEnd
                int r2 = r4.mIndex
                int[] r0 = r0.mGapPerSpan
                if (r0 != 0) goto L3c
                r0 = 0
                goto L3e
            L3c:
                r0 = r0[r2]
            L3e:
                int r1 = r1 + r0
                r4.mCachedEnd = r1
            L41:
                return
        }

        public final void calculateCachedStart() {
                r4 = this;
                java.util.ArrayList<android.view.View> r0 = r4.mViews
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r2 = r4.getLayoutParams(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r4.this$0
                androidx.recyclerview.widget.OrientationHelper r3 = r3.mPrimaryOrientation
                int r0 = r3.getDecoratedStart(r0)
                r4.mCachedStart = r0
                boolean r0 = r2.mFullSpan
                if (r0 == 0) goto L3c
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r4.this$0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r0.mLazySpanLookup
                int r2 = r2.getViewLayoutPosition()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r0.getFullSpanItem(r2)
                if (r0 == 0) goto L3c
                int r2 = r0.mGapDir
                r3 = -1
                if (r2 != r3) goto L3c
                int r2 = r4.mCachedStart
                int r3 = r4.mIndex
                int[] r0 = r0.mGapPerSpan
                if (r0 != 0) goto L37
                goto L39
            L37:
                r1 = r0[r3]
            L39:
                int r2 = r2 - r1
                r4.mCachedStart = r2
            L3c:
                return
        }

        public final void clear() {
                r1 = this;
                java.util.ArrayList<android.view.View> r0 = r1.mViews
                r0.clear()
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.mCachedStart = r0
                r1.mCachedEnd = r0
                r0 = 0
                r1.mDeletedSize = r0
                return
        }

        public int findFirstCompletelyVisibleItemPosition() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.this$0
                boolean r0 = r0.mReverseLayout
                r1 = 1
                if (r0 == 0) goto L14
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r0 - r1
                r2 = -1
                int r0 = r3.findOneVisibleChild(r0, r2, r1)
                goto L1f
            L14:
                r0 = 0
                java.util.ArrayList<android.view.View> r2 = r3.mViews
                int r2 = r2.size()
                int r0 = r3.findOneVisibleChild(r0, r2, r1)
            L1f:
                return r0
        }

        public int findFirstPartiallyVisibleItemPosition() {
                r2 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r2.this$0
                boolean r0 = r0.mReverseLayout
                if (r0 == 0) goto L14
                java.util.ArrayList<android.view.View> r0 = r2.mViews
                int r0 = r0.size()
                int r0 = r0 + (-1)
                r1 = -1
                int r0 = r2.findOnePartiallyVisibleChild(r0, r1)
                goto L1f
            L14:
                r0 = 0
                java.util.ArrayList<android.view.View> r1 = r2.mViews
                int r1 = r1.size()
                int r0 = r2.findOnePartiallyVisibleChild(r0, r1)
            L1f:
                return r0
        }

        public int findFirstVisibleItemPosition() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.this$0
                boolean r0 = r0.mReverseLayout
                r1 = 0
                if (r0 == 0) goto L15
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r0 + (-1)
                r2 = -1
                int r0 = r3.findOneVisibleChild(r0, r2, r1)
                goto L1f
            L15:
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r3.findOneVisibleChild(r1, r0, r1)
            L1f:
                return r0
        }

        public int findLastCompletelyVisibleItemPosition() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.this$0
                boolean r0 = r0.mReverseLayout
                r1 = 1
                if (r0 == 0) goto L13
                r0 = 0
                java.util.ArrayList<android.view.View> r2 = r3.mViews
                int r2 = r2.size()
                int r0 = r3.findOneVisibleChild(r0, r2, r1)
                goto L1f
            L13:
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r0 - r1
                r2 = -1
                int r0 = r3.findOneVisibleChild(r0, r2, r1)
            L1f:
                return r0
        }

        public int findLastPartiallyVisibleItemPosition() {
                r2 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r2.this$0
                boolean r0 = r0.mReverseLayout
                if (r0 == 0) goto L12
                r0 = 0
                java.util.ArrayList<android.view.View> r1 = r2.mViews
                int r1 = r1.size()
                int r0 = r2.findOnePartiallyVisibleChild(r0, r1)
                goto L1f
            L12:
                java.util.ArrayList<android.view.View> r0 = r2.mViews
                int r0 = r0.size()
                int r0 = r0 + (-1)
                r1 = -1
                int r0 = r2.findOnePartiallyVisibleChild(r0, r1)
            L1f:
                return r0
        }

        public int findLastVisibleItemPosition() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.this$0
                boolean r0 = r0.mReverseLayout
                r1 = 0
                if (r0 == 0) goto L12
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r3.findOneVisibleChild(r1, r0, r1)
                goto L1f
            L12:
                java.util.ArrayList<android.view.View> r0 = r3.mViews
                int r0 = r0.size()
                int r0 = r0 + (-1)
                r2 = -1
                int r0 = r3.findOneVisibleChild(r0, r2, r1)
            L1f:
                return r0
        }

        public final int findOnePartiallyOrCompletelyVisibleChild(int r11, int r12, boolean r13, boolean r14, boolean r15) {
                r10 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r10.this$0
                androidx.recyclerview.widget.OrientationHelper r0 = r0.mPrimaryOrientation
                int r0 = r0.getStartAfterPadding()
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r10.this$0
                androidx.recyclerview.widget.OrientationHelper r1 = r1.mPrimaryOrientation
                int r1 = r1.getEndAfterPadding()
                r2 = -1
                r3 = 1
                if (r12 <= r11) goto L16
                r4 = 1
                goto L17
            L16:
                r4 = -1
            L17:
                if (r11 == r12) goto L6d
                java.util.ArrayList<android.view.View> r5 = r10.mViews
                java.lang.Object r5 = r5.get(r11)
                android.view.View r5 = (android.view.View) r5
                androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = r10.this$0
                androidx.recyclerview.widget.OrientationHelper r6 = r6.mPrimaryOrientation
                int r6 = r6.getDecoratedStart(r5)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = r10.this$0
                androidx.recyclerview.widget.OrientationHelper r7 = r7.mPrimaryOrientation
                int r7 = r7.getDecoratedEnd(r5)
                r8 = 0
                if (r15 == 0) goto L37
                if (r6 > r1) goto L3b
                goto L39
            L37:
                if (r6 >= r1) goto L3b
            L39:
                r9 = 1
                goto L3c
            L3b:
                r9 = 0
            L3c:
                if (r15 == 0) goto L41
                if (r7 < r0) goto L44
                goto L43
            L41:
                if (r7 <= r0) goto L44
            L43:
                r8 = 1
            L44:
                if (r9 == 0) goto L6b
                if (r8 == 0) goto L6b
                if (r13 == 0) goto L57
                if (r14 == 0) goto L57
                if (r6 < r0) goto L6b
                if (r7 > r1) goto L6b
                androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = r10.this$0
                int r11 = r11.getPosition(r5)
                return r11
            L57:
                if (r14 == 0) goto L60
                androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = r10.this$0
                int r11 = r11.getPosition(r5)
                return r11
            L60:
                if (r6 < r0) goto L64
                if (r7 <= r1) goto L6b
            L64:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = r10.this$0
                int r11 = r11.getPosition(r5)
                return r11
            L6b:
                int r11 = r11 + r4
                goto L17
            L6d:
                return r2
        }

        public final int findOnePartiallyVisibleChild(int r7, int r8) {
                r6 = this;
                r3 = 0
                r4 = 0
                r5 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                int r7 = r0.findOnePartiallyOrCompletelyVisibleChild(r1, r2, r3, r4, r5)
                return r7
        }

        public final int findOneVisibleChild(int r7, int r8, boolean r9) {
                r6 = this;
                r4 = 1
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                int r7 = r0.findOnePartiallyOrCompletelyVisibleChild(r1, r2, r3, r4, r5)
                return r7
        }

        public int getDeletedSize() {
                r1 = this;
                int r0 = r1.mDeletedSize
                return r0
        }

        public final int getEndLine(int r3) {
                r2 = this;
                int r0 = r2.mCachedEnd
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L7
                return r0
            L7:
                java.util.ArrayList<android.view.View> r0 = r2.mViews
                int r0 = r0.size()
                if (r0 != 0) goto L10
                return r3
            L10:
                r2.calculateCachedEnd()
                int r3 = r2.mCachedEnd
                return r3
        }

        public android.view.View getFocusableViewAfter(int r6, int r7) {
                r5 = this;
                r0 = -1
                r1 = 0
                if (r7 != r0) goto L38
                java.util.ArrayList<android.view.View> r7 = r5.mViews
                int r7 = r7.size()
                r0 = 0
            Lb:
                if (r0 >= r7) goto L6d
                java.util.ArrayList<android.view.View> r2 = r5.mViews
                java.lang.Object r2 = r2.get(r0)
                android.view.View r2 = (android.view.View) r2
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r5.this$0
                boolean r4 = r3.mReverseLayout
                if (r4 == 0) goto L21
                int r3 = r3.getPosition(r2)
                if (r3 <= r6) goto L6d
            L21:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r5.this$0
                boolean r4 = r3.mReverseLayout
                if (r4 != 0) goto L2e
                int r3 = r3.getPosition(r2)
                if (r3 < r6) goto L2e
                goto L6d
            L2e:
                boolean r3 = r2.hasFocusable()
                if (r3 == 0) goto L6d
                int r0 = r0 + 1
                r1 = r2
                goto Lb
            L38:
                java.util.ArrayList<android.view.View> r7 = r5.mViews
                int r7 = r7.size()
                int r7 = r7 + (-1)
            L40:
                if (r7 < 0) goto L6d
                java.util.ArrayList<android.view.View> r0 = r5.mViews
                java.lang.Object r0 = r0.get(r7)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r5.this$0
                boolean r3 = r2.mReverseLayout
                if (r3 == 0) goto L56
                int r2 = r2.getPosition(r0)
                if (r2 >= r6) goto L6d
            L56:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r5.this$0
                boolean r3 = r2.mReverseLayout
                if (r3 != 0) goto L63
                int r2 = r2.getPosition(r0)
                if (r2 > r6) goto L63
                goto L6d
            L63:
                boolean r2 = r0.hasFocusable()
                if (r2 == 0) goto L6d
                int r7 = r7 + (-1)
                r1 = r0
                goto L40
            L6d:
                return r1
        }

        public final androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams getLayoutParams(android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r1
                return r1
        }

        public final int getStartLine(int r3) {
                r2 = this;
                int r0 = r2.mCachedStart
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L7
                return r0
            L7:
                java.util.ArrayList<android.view.View> r0 = r2.mViews
                int r0 = r0.size()
                if (r0 != 0) goto L10
                return r3
            L10:
                r2.calculateCachedStart()
                int r3 = r2.mCachedStart
                return r3
        }

        public final void popEnd() {
                r4 = this;
                java.util.ArrayList<android.view.View> r0 = r4.mViews
                int r0 = r0.size()
                java.util.ArrayList<android.view.View> r1 = r4.mViews
                int r2 = r0 + (-1)
                java.lang.Object r1 = r1.remove(r2)
                android.view.View r1 = (android.view.View) r1
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r2 = r4.getLayoutParams(r1)
                r3 = 0
                r2.mSpan = r3
                boolean r3 = r2.isItemRemoved()
                if (r3 != 0) goto L23
                boolean r2 = r2.isItemChanged()
                if (r2 == 0) goto L30
            L23:
                int r2 = r4.mDeletedSize
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r4.this$0
                androidx.recyclerview.widget.OrientationHelper r3 = r3.mPrimaryOrientation
                int r1 = r3.getDecoratedMeasurement(r1)
                int r2 = r2 - r1
                r4.mDeletedSize = r2
            L30:
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 1
                if (r0 != r2) goto L37
                r4.mCachedStart = r1
            L37:
                r4.mCachedEnd = r1
                return
        }

        public final void popStart() {
                r4 = this;
                java.util.ArrayList<android.view.View> r0 = r4.mViews
                r1 = 0
                java.lang.Object r0 = r0.remove(r1)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r1 = r4.getLayoutParams(r0)
                r2 = 0
                r1.mSpan = r2
                java.util.ArrayList<android.view.View> r2 = r4.mViews
                int r2 = r2.size()
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != 0) goto L1c
                r4.mCachedEnd = r3
            L1c:
                boolean r2 = r1.isItemRemoved()
                if (r2 != 0) goto L28
                boolean r1 = r1.isItemChanged()
                if (r1 == 0) goto L35
            L28:
                int r1 = r4.mDeletedSize
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r4.this$0
                androidx.recyclerview.widget.OrientationHelper r2 = r2.mPrimaryOrientation
                int r0 = r2.getDecoratedMeasurement(r0)
                int r1 = r1 - r0
                r4.mDeletedSize = r1
            L35:
                r4.mCachedStart = r3
                return
        }

        public final void prependToSpan(android.view.View r5) {
                r4 = this;
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r0
                r0.mSpan = r4
                java.util.ArrayList<android.view.View> r1 = r4.mViews
                r2 = 0
                r1.add(r2, r5)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r4.mCachedStart = r1
                java.util.ArrayList<android.view.View> r2 = r4.mViews
                int r2 = r2.size()
                r3 = 1
                if (r2 != r3) goto L1d
                r4.mCachedEnd = r1
            L1d:
                boolean r1 = r0.isItemRemoved()
                if (r1 != 0) goto L29
                boolean r0 = r0.isItemChanged()
                if (r0 == 0) goto L36
            L29:
                int r0 = r4.mDeletedSize
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r4.this$0
                androidx.recyclerview.widget.OrientationHelper r1 = r1.mPrimaryOrientation
                int r5 = r1.getDecoratedMeasurement(r5)
                int r5 = r5 + r0
                r4.mDeletedSize = r5
            L36:
                return
        }
    }

    public StaggeredGridLayoutManager(int r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mSpanCount = r0
            r1 = 0
            r2.mReverseLayout = r1
            r2.mShouldReverseLayout = r1
            r2.mPendingScrollPosition = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mPendingScrollPositionOffset = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup
            r0.<init>()
            r2.mLazySpanLookup = r0
            r0 = 2
            r2.mGapStrategy = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTmpRect = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo
            r0.<init>(r2)
            r2.mAnchorInfo = r0
            r2.mLaidOutInvalidFullSpan = r1
            r0 = 1
            r2.mSmoothScrollbarEnabled = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$1 r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$1
            r0.<init>(r2)
            r2.mCheckForGapsRunnable = r0
            r2.mOrientation = r4
            r2.setSpanCount(r3)
            androidx.recyclerview.widget.LayoutState r3 = new androidx.recyclerview.widget.LayoutState
            r3.<init>()
            r2.mLayoutState = r3
            r2.createOrientationHelpers()
            return
    }

    public StaggeredGridLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mSpanCount = r0
            r1 = 0
            r2.mReverseLayout = r1
            r2.mShouldReverseLayout = r1
            r2.mPendingScrollPosition = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mPendingScrollPositionOffset = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup
            r0.<init>()
            r2.mLazySpanLookup = r0
            r0 = 2
            r2.mGapStrategy = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTmpRect = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo
            r0.<init>(r2)
            r2.mAnchorInfo = r0
            r2.mLaidOutInvalidFullSpan = r1
            r0 = 1
            r2.mSmoothScrollbarEnabled = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$1 r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$1
            r0.<init>(r2)
            r2.mCheckForGapsRunnable = r0
            androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties r3 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getProperties(r3, r4, r5, r6)
            int r4 = r3.orientation
            r2.setOrientation(r4)
            int r4 = r3.spanCount
            r2.setSpanCount(r4)
            boolean r3 = r3.reverseLayout
            r2.setReverseLayout(r3)
            androidx.recyclerview.widget.LayoutState r3 = new androidx.recyclerview.widget.LayoutState
            r3.<init>()
            r2.mLayoutState = r3
            r2.createOrientationHelpers()
            return
    }

    private void appendViewToAllSpans(android.view.View r3) {
            r2 = this;
            int r0 = r2.mSpanCount
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r2.mSpans
            r1 = r1[r0]
            r1.appendToSpan(r3)
            int r0 = r0 + (-1)
            goto L4
        L10:
            return
    }

    private void applyPendingSavedState(androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo r5) {
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r4.mPendingSavedState
            int r1 = r0.mSpanOffsetsSize
            if (r1 <= 0) goto L4c
            int r2 = r4.mSpanCount
            r3 = 0
            if (r1 != r2) goto L3d
        Lb:
            int r0 = r4.mSpanCount
            if (r3 >= r0) goto L4c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r4.mSpans
            r0 = r0[r3]
            r0.clear()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r4.mPendingSavedState
            int[] r1 = r0.mSpanOffsets
            r1 = r1[r3]
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L32
            boolean r0 = r0.mAnchorLayoutFromEnd
            if (r0 == 0) goto L2b
            androidx.recyclerview.widget.OrientationHelper r0 = r4.mPrimaryOrientation
            int r0 = r0.getEndAfterPadding()
            goto L31
        L2b:
            androidx.recyclerview.widget.OrientationHelper r0 = r4.mPrimaryOrientation
            int r0 = r0.getStartAfterPadding()
        L31:
            int r1 = r1 + r0
        L32:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r4.mSpans
            r0 = r0[r3]
            r0.mCachedStart = r1
            r0.mCachedEnd = r1
            int r3 = r3 + 1
            goto Lb
        L3d:
            r1 = 0
            r0.mSpanOffsets = r1
            r0.mSpanOffsetsSize = r3
            r0.mSpanLookupSize = r3
            r0.mSpanLookup = r1
            r0.mFullSpanItems = r1
            int r1 = r0.mVisibleAnchorPosition
            r0.mAnchorPosition = r1
        L4c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r4.mPendingSavedState
            boolean r1 = r0.mLastLayoutRTL
            r4.mLastLayoutRTL = r1
            boolean r0 = r0.mReverseLayout
            r4.setReverseLayout(r0)
            r4.resolveShouldLayoutReverse()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r4.mPendingSavedState
            int r1 = r0.mAnchorPosition
            r2 = -1
            if (r1 == r2) goto L68
            r4.mPendingScrollPosition = r1
            boolean r1 = r0.mAnchorLayoutFromEnd
            r5.mLayoutFromEnd = r1
            goto L6c
        L68:
            boolean r1 = r4.mShouldReverseLayout
            r5.mLayoutFromEnd = r1
        L6c:
            int r5 = r0.mSpanLookupSize
            r1 = 1
            if (r5 <= r1) goto L7b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r4.mLazySpanLookup
            int[] r1 = r0.mSpanLookup
            r5.mData = r1
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r0.mFullSpanItems
            r5.mFullSpanItems = r0
        L7b:
            return
    }

    private void attachViewToSpans(android.view.View r2, androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams r3, androidx.recyclerview.widget.LayoutState r4) {
            r1 = this;
            int r4 = r4.mLayoutDirection
            r0 = 1
            if (r4 != r0) goto L13
            boolean r4 = r3.mFullSpan
            if (r4 == 0) goto Ld
            r1.appendViewToAllSpans(r2)
            goto L20
        Ld:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r3 = r3.mSpan
            r3.appendToSpan(r2)
            goto L20
        L13:
            boolean r4 = r3.mFullSpan
            if (r4 == 0) goto L1b
            r1.prependViewToAllSpans(r2)
            goto L20
        L1b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r3 = r3.mSpan
            r3.prependToSpan(r2)
        L20:
            return
    }

    private int calculateScrollDirectionForPosition(int r4) {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.mShouldReverseLayout
            if (r4 == 0) goto Ld
            r1 = 1
        Ld:
            return r1
        Le:
            int r0 = r3.getFirstChildPosition()
            if (r4 >= r0) goto L16
            r4 = 1
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.mShouldReverseLayout
            if (r4 == r0) goto L1c
            goto L1d
        L1c:
            r1 = 1
        L1d:
            return r1
    }

    private boolean checkSpanForGap(androidx.recyclerview.widget.StaggeredGridLayoutManager.Span r4) {
            r3 = this;
            boolean r0 = r3.mShouldReverseLayout
            r1 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L30
            int r0 = r4.mCachedEnd
            if (r0 == r2) goto Lc
            goto L11
        Lc:
            r4.calculateCachedEnd()
            int r0 = r4.mCachedEnd
        L11:
            androidx.recyclerview.widget.OrientationHelper r2 = r3.mPrimaryOrientation
            int r2 = r2.getEndAfterPadding()
            if (r0 >= r2) goto L53
            java.util.ArrayList<android.view.View> r0 = r4.mViews
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r4 = r4.getLayoutParams(r0)
            boolean r4 = r4.mFullSpan
            r4 = r4 ^ 1
            return r4
        L30:
            int r0 = r4.mCachedStart
            if (r0 == r2) goto L35
            goto L3a
        L35:
            r4.calculateCachedStart()
            int r0 = r4.mCachedStart
        L3a:
            androidx.recyclerview.widget.OrientationHelper r2 = r3.mPrimaryOrientation
            int r2 = r2.getStartAfterPadding()
            if (r0 <= r2) goto L53
            java.util.ArrayList<android.view.View> r0 = r4.mViews
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r4 = r4.getLayoutParams(r0)
            boolean r4 = r4.mFullSpan
            r4 = r4 ^ 1
            return r4
        L53:
            return r1
    }

    private int computeScrollExtent(androidx.recyclerview.widget.RecyclerView.State r7) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mPrimaryOrientation
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r2 = r6.findFirstVisibleItemClosestToStart(r0)
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r3 = r6.findFirstVisibleItemClosestToEnd(r0)
            boolean r5 = r6.mSmoothScrollbarEnabled
            r0 = r7
            r4 = r6
            int r7 = androidx.recyclerview.widget.ScrollbarHelper.computeScrollExtent(r0, r1, r2, r3, r4, r5)
            return r7
    }

    private int computeScrollOffset(androidx.recyclerview.widget.RecyclerView.State r8) {
            r7 = this;
            int r0 = r7.getChildCount()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            androidx.recyclerview.widget.OrientationHelper r1 = r7.mPrimaryOrientation
            boolean r0 = r7.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r2 = r7.findFirstVisibleItemClosestToStart(r0)
            boolean r0 = r7.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r3 = r7.findFirstVisibleItemClosestToEnd(r0)
            boolean r5 = r7.mSmoothScrollbarEnabled
            boolean r6 = r7.mShouldReverseLayout
            r0 = r8
            r4 = r7
            int r8 = androidx.recyclerview.widget.ScrollbarHelper.computeScrollOffset(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    private int computeScrollRange(androidx.recyclerview.widget.RecyclerView.State r7) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mPrimaryOrientation
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r2 = r6.findFirstVisibleItemClosestToStart(r0)
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ 1
            android.view.View r3 = r6.findFirstVisibleItemClosestToEnd(r0)
            boolean r5 = r6.mSmoothScrollbarEnabled
            r0 = r7
            r4 = r6
            int r7 = androidx.recyclerview.widget.ScrollbarHelper.computeScrollRange(r0, r1, r2, r3, r4, r5)
            return r7
    }

    private int convertFocusDirectionToLayoutDirection(int r5) {
            r4 = this;
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L47
            r2 = 2
            if (r5 == r2) goto L3a
            r2 = 17
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L32
            r2 = 33
            if (r5 == r2) goto L2a
            r0 = 66
            if (r5 == r0) goto L22
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L1a
            return r3
        L1a:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L1f
            goto L21
        L1f:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L21:
            return r1
        L22:
            int r5 = r4.mOrientation
            if (r5 != 0) goto L27
            goto L29
        L27:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L29:
            return r1
        L2a:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L2f
            goto L31
        L2f:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L31:
            return r0
        L32:
            int r5 = r4.mOrientation
            if (r5 != 0) goto L37
            goto L39
        L37:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L39:
            return r0
        L3a:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L3f
            return r1
        L3f:
            boolean r5 = r4.isLayoutRTL()
            if (r5 == 0) goto L46
            return r0
        L46:
            return r1
        L47:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L4c
            return r0
        L4c:
            boolean r5 = r4.isLayoutRTL()
            if (r5 == 0) goto L53
            return r1
        L53:
            return r0
    }

    private androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int r5) {
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r0.<init>()
            int r1 = r4.mSpanCount
            int[] r1 = new int[r1]
            r0.mGapPerSpan = r1
            r1 = 0
        Lc:
            int r2 = r4.mSpanCount
            if (r1 >= r2) goto L21
            int[] r2 = r0.mGapPerSpan
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r3 = r4.mSpans
            r3 = r3[r1]
            int r3 = r3.getEndLine(r5)
            int r3 = r5 - r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lc
        L21:
            return r0
    }

    private androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int r5) {
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r0.<init>()
            int r1 = r4.mSpanCount
            int[] r1 = new int[r1]
            r0.mGapPerSpan = r1
            r1 = 0
        Lc:
            int r2 = r4.mSpanCount
            if (r1 >= r2) goto L20
            int[] r2 = r0.mGapPerSpan
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r3 = r4.mSpans
            r3 = r3[r1]
            int r3 = r3.getStartLine(r5)
            int r3 = r3 - r5
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lc
        L20:
            return r0
    }

    private void createOrientationHelpers() {
            r1 = this;
            int r0 = r1.mOrientation
            androidx.recyclerview.widget.OrientationHelper r0 = androidx.recyclerview.widget.OrientationHelper.createOrientationHelper(r1, r0)
            r1.mPrimaryOrientation = r0
            int r0 = r1.mOrientation
            int r0 = 1 - r0
            androidx.recyclerview.widget.OrientationHelper r0 = androidx.recyclerview.widget.OrientationHelper.createOrientationHelper(r1, r0)
            r1.mSecondaryOrientation = r0
            return
    }

    private int fill(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.LayoutState r19, androidx.recyclerview.widget.RecyclerView.State r20) {
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = r19
            java.util.BitSet r0 = r6.mRemainingSpans
            int r1 = r6.mSpanCount
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            androidx.recyclerview.widget.LayoutState r0 = r6.mLayoutState
            boolean r0 = r0.mInfinite
            if (r0 == 0) goto L23
            int r0 = r8.mLayoutDirection
            if (r0 != r10) goto L20
            r0 = 2147483647(0x7fffffff, float:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L33
        L20:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L33
        L23:
            int r0 = r8.mLayoutDirection
            if (r0 != r10) goto L2d
            int r0 = r8.mEndLine
            int r1 = r8.mAvailable
            int r0 = r0 + r1
            goto L32
        L2d:
            int r0 = r8.mStartLine
            int r1 = r8.mAvailable
            int r0 = r0 - r1
        L32:
            r12 = r0
        L33:
            int r0 = r8.mLayoutDirection
            r6.updateAllRemainingSpans(r0, r12)
            boolean r0 = r6.mShouldReverseLayout
            if (r0 == 0) goto L43
            androidx.recyclerview.widget.OrientationHelper r0 = r6.mPrimaryOrientation
            int r0 = r0.getEndAfterPadding()
            goto L49
        L43:
            androidx.recyclerview.widget.OrientationHelper r0 = r6.mPrimaryOrientation
            int r0 = r0.getStartAfterPadding()
        L49:
            r13 = r0
            r0 = 0
        L4b:
            int r1 = r8.mCurrentPosition
            if (r1 < 0) goto L57
            int r2 = r20.getItemCount()
            if (r1 >= r2) goto L57
            r1 = 1
            goto L58
        L57:
            r1 = 0
        L58:
            r2 = -1
            if (r1 == 0) goto L235
            androidx.recyclerview.widget.LayoutState r1 = r6.mLayoutState
            boolean r1 = r1.mInfinite
            if (r1 != 0) goto L69
            java.util.BitSet r1 = r6.mRemainingSpans
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L235
        L69:
            int r0 = r8.mCurrentPosition
            android.view.View r14 = r7.getViewForPosition(r0)
            int r0 = r8.mCurrentPosition
            int r1 = r8.mItemDirection
            int r0 = r0 + r1
            r8.mCurrentPosition = r0
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            r15 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r15 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r15
            int r0 = r15.getViewLayoutPosition()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.mLazySpanLookup
            int[] r1 = r1.mData
            if (r1 == 0) goto L8e
            int r3 = r1.length
            if (r0 < r3) goto L8b
            goto L8e
        L8b:
            r1 = r1[r0]
            goto L8f
        L8e:
            r1 = -1
        L8f:
            if (r1 != r2) goto L93
            r3 = 1
            goto L94
        L93:
            r3 = 0
        L94:
            if (r3 == 0) goto Laf
            boolean r1 = r15.mFullSpan
            if (r1 == 0) goto L9f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r6.mSpans
            r1 = r1[r9]
            goto La3
        L9f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r1 = r6.getNextSpan(r8)
        La3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.mLazySpanLookup
            r4.ensureSize(r0)
            int[] r4 = r4.mData
            int r5 = r1.mIndex
            r4[r0] = r5
            goto Lb3
        Laf:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r4 = r6.mSpans
            r1 = r4[r1]
        Lb3:
            r5 = r1
            r15.mSpan = r5
            int r1 = r8.mLayoutDirection
            if (r1 != r10) goto Lbe
            r6.addView(r14)
            goto Lc1
        Lbe:
            r6.addView(r14, r9)
        Lc1:
            r6.measureChildWithDecorationsAndMargin(r14, r15, r9)
            int r1 = r8.mLayoutDirection
            if (r1 != r10) goto Lf2
            boolean r1 = r15.mFullSpan
            if (r1 == 0) goto Ld1
            int r1 = r6.getMaxEnd(r13)
            goto Ld5
        Ld1:
            int r1 = r5.getEndLine(r13)
        Ld5:
            androidx.recyclerview.widget.OrientationHelper r4 = r6.mPrimaryOrientation
            int r4 = r4.getDecoratedMeasurement(r14)
            int r4 = r4 + r1
            if (r3 == 0) goto Lef
            boolean r11 = r15.mFullSpan
            if (r11 == 0) goto Lef
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r11 = r6.createFullSpanItemFromEnd(r1)
            r11.mGapDir = r2
            r11.mPosition = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.addFullSpanItem(r11)
        Lef:
            r9 = r4
            r4 = r1
            goto L11b
        Lf2:
            boolean r1 = r15.mFullSpan
            if (r1 == 0) goto Lfb
            int r1 = r6.getMinStart(r13)
            goto Lff
        Lfb:
            int r1 = r5.getStartLine(r13)
        Lff:
            androidx.recyclerview.widget.OrientationHelper r4 = r6.mPrimaryOrientation
            int r4 = r4.getDecoratedMeasurement(r14)
            int r4 = r1 - r4
            if (r3 == 0) goto L11a
            boolean r9 = r15.mFullSpan
            if (r9 == 0) goto L11a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r9 = r6.createFullSpanItemFromStart(r1)
            r9.mGapDir = r10
            r9.mPosition = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r11 = r6.mLazySpanLookup
            r11.addFullSpanItem(r9)
        L11a:
            r9 = r1
        L11b:
            boolean r1 = r15.mFullSpan
            if (r1 == 0) goto L183
            int r1 = r8.mItemDirection
            if (r1 != r2) goto L183
            if (r3 == 0) goto L128
            r6.mLaidOutInvalidFullSpan = r10
            goto L183
        L128:
            int r1 = r8.mLayoutDirection
            if (r1 != r10) goto L152
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r6.mSpans
            r2 = 0
            r1 = r1[r2]
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1.getEndLine(r2)
            r3 = 1
        L138:
            int r11 = r6.mSpanCount
            if (r3 >= r11) goto L14d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r11 = r6.mSpans
            r11 = r11[r3]
            int r11 = r11.getEndLine(r2)
            if (r11 == r1) goto L148
            r1 = 0
            goto L14e
        L148:
            int r3 = r3 + 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L138
        L14d:
            r1 = 1
        L14e:
            r1 = r1 ^ r10
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L174
        L152:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r6.mSpans
            r2 = 0
            r1 = r1[r2]
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1.getStartLine(r11)
            r2 = 1
        L15e:
            int r3 = r6.mSpanCount
            if (r2 >= r3) goto L171
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r3 = r6.mSpans
            r3 = r3[r2]
            int r3 = r3.getStartLine(r11)
            if (r3 == r1) goto L16e
            r2 = 0
            goto L172
        L16e:
            int r2 = r2 + 1
            goto L15e
        L171:
            r2 = 1
        L172:
            r1 = r2 ^ 1
        L174:
            if (r1 == 0) goto L185
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.mLazySpanLookup
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r1.getFullSpanItem(r0)
            if (r0 == 0) goto L180
            r0.mHasUnwantedGapAfter = r10
        L180:
            r6.mLaidOutInvalidFullSpan = r10
            goto L185
        L183:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
        L185:
            r6.attachViewToSpans(r14, r15, r8)
            boolean r0 = r17.isLayoutRTL()
            if (r0 == 0) goto L1ba
            int r0 = r6.mOrientation
            if (r0 != r10) goto L1ba
            boolean r0 = r15.mFullSpan
            if (r0 == 0) goto L19d
            androidx.recyclerview.widget.OrientationHelper r0 = r6.mSecondaryOrientation
            int r0 = r0.getEndAfterPadding()
            goto L1ae
        L19d:
            androidx.recyclerview.widget.OrientationHelper r0 = r6.mSecondaryOrientation
            int r0 = r0.getEndAfterPadding()
            int r1 = r6.mSpanCount
            int r1 = r1 - r10
            int r2 = r5.mIndex
            int r1 = r1 - r2
            int r2 = r6.mSizePerSpan
            int r1 = r1 * r2
            int r0 = r0 - r1
        L1ae:
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mSecondaryOrientation
            int r1 = r1.getDecoratedMeasurement(r14)
            int r1 = r0 - r1
            r16 = r0
            r3 = r1
            goto L1dc
        L1ba:
            boolean r0 = r15.mFullSpan
            if (r0 == 0) goto L1c5
            androidx.recyclerview.widget.OrientationHelper r0 = r6.mSecondaryOrientation
            int r0 = r0.getStartAfterPadding()
            goto L1d2
        L1c5:
            int r0 = r5.mIndex
            int r1 = r6.mSizePerSpan
            int r0 = r0 * r1
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mSecondaryOrientation
            int r1 = r1.getStartAfterPadding()
            int r0 = r0 + r1
        L1d2:
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mSecondaryOrientation
            int r1 = r1.getDecoratedMeasurement(r14)
            int r1 = r1 + r0
            r3 = r0
            r16 = r1
        L1dc:
            int r0 = r6.mOrientation
            if (r0 != r10) goto L1ed
            r0 = r17
            r1 = r14
            r2 = r3
            r3 = r4
            r4 = r16
            r10 = r5
            r5 = r9
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            goto L1f8
        L1ed:
            r10 = r5
            r0 = r17
            r1 = r14
            r2 = r4
            r4 = r9
            r5 = r16
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
        L1f8:
            boolean r0 = r15.mFullSpan
            if (r0 == 0) goto L204
            androidx.recyclerview.widget.LayoutState r0 = r6.mLayoutState
            int r0 = r0.mLayoutDirection
            r6.updateAllRemainingSpans(r0, r12)
            goto L20b
        L204:
            androidx.recyclerview.widget.LayoutState r0 = r6.mLayoutState
            int r0 = r0.mLayoutDirection
            r6.updateRemainingSpans(r10, r0, r12)
        L20b:
            androidx.recyclerview.widget.LayoutState r0 = r6.mLayoutState
            r6.recycle(r7, r0)
            androidx.recyclerview.widget.LayoutState r0 = r6.mLayoutState
            boolean r0 = r0.mStopInFocusable
            if (r0 == 0) goto L22f
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L22f
            boolean r0 = r15.mFullSpan
            if (r0 == 0) goto L226
            java.util.BitSet r0 = r6.mRemainingSpans
            r0.clear()
            goto L22f
        L226:
            java.util.BitSet r0 = r6.mRemainingSpans
            int r1 = r10.mIndex
            r3 = 0
            r0.set(r1, r3)
            goto L230
        L22f:
            r3 = 0
        L230:
            r0 = 1
            r9 = 0
            r10 = 1
            goto L4b
        L235:
            r3 = 0
            if (r0 != 0) goto L23d
            androidx.recyclerview.widget.LayoutState r0 = r6.mLayoutState
            r6.recycle(r7, r0)
        L23d:
            androidx.recyclerview.widget.LayoutState r0 = r6.mLayoutState
            int r0 = r0.mLayoutDirection
            if (r0 != r2) goto L255
            androidx.recyclerview.widget.OrientationHelper r0 = r6.mPrimaryOrientation
            int r0 = r0.getStartAfterPadding()
            int r0 = r6.getMinStart(r0)
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mPrimaryOrientation
            int r1 = r1.getStartAfterPadding()
            int r1 = r1 - r0
            goto L267
        L255:
            androidx.recyclerview.widget.OrientationHelper r0 = r6.mPrimaryOrientation
            int r0 = r0.getEndAfterPadding()
            int r0 = r6.getMaxEnd(r0)
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mPrimaryOrientation
            int r1 = r1.getEndAfterPadding()
            int r1 = r0 - r1
        L267:
            if (r1 <= 0) goto L270
            int r0 = r8.mAvailable
            int r9 = java.lang.Math.min(r0, r1)
            goto L271
        L270:
            r9 = 0
        L271:
            return r9
    }

    private int findFirstReferenceChildPosition(int r5) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L18
            android.view.View r3 = r4.getChildAt(r2)
            int r3 = r4.getPosition(r3)
            if (r3 < 0) goto L15
            if (r3 >= r5) goto L15
            return r3
        L15:
            int r2 = r2 + 1
            goto L6
        L18:
            return r1
    }

    private int findLastReferenceChildPosition(int r3) {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L18
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r2.getPosition(r1)
            if (r1 < 0) goto L15
            if (r1 >= r3) goto L15
            return r1
        L15:
            int r0 = r0 + (-1)
            goto L6
        L18:
            r3 = 0
            return r3
    }

    private void fixEndGap(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4, boolean r5) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r2.getMaxEnd(r0)
            if (r1 != r0) goto L9
            return
        L9:
            androidx.recyclerview.widget.OrientationHelper r0 = r2.mPrimaryOrientation
            int r0 = r0.getEndAfterPadding()
            int r0 = r0 - r1
            if (r0 <= 0) goto L22
            int r1 = -r0
            int r3 = r2.scrollBy(r1, r3, r4)
            int r3 = -r3
            int r0 = r0 - r3
            if (r5 == 0) goto L22
            if (r0 <= 0) goto L22
            androidx.recyclerview.widget.OrientationHelper r3 = r2.mPrimaryOrientation
            r3.offsetChildren(r0)
        L22:
            return
    }

    private void fixStartGap(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4, boolean r5) {
            r2 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r2.getMinStart(r0)
            if (r1 != r0) goto La
            return
        La:
            androidx.recyclerview.widget.OrientationHelper r0 = r2.mPrimaryOrientation
            int r0 = r0.getStartAfterPadding()
            int r1 = r1 - r0
            if (r1 <= 0) goto L22
            int r3 = r2.scrollBy(r1, r3, r4)
            int r1 = r1 - r3
            if (r5 == 0) goto L22
            if (r1 <= 0) goto L22
            androidx.recyclerview.widget.OrientationHelper r3 = r2.mPrimaryOrientation
            int r4 = -r1
            r3.offsetChildren(r4)
        L22:
            return
    }

    private int getMaxEnd(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r3.mSpans
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.getEndLine(r4)
            r1 = 1
        La:
            int r2 = r3.mSpanCount
            if (r1 >= r2) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r3.mSpans
            r2 = r2[r1]
            int r2 = r2.getEndLine(r4)
            if (r2 <= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    private int getMaxStart(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r3.mSpans
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.getStartLine(r4)
            r1 = 1
        La:
            int r2 = r3.mSpanCount
            if (r1 >= r2) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r3.mSpans
            r2 = r2[r1]
            int r2 = r2.getStartLine(r4)
            if (r2 <= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    private int getMinEnd(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r3.mSpans
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.getEndLine(r4)
            r1 = 1
        La:
            int r2 = r3.mSpanCount
            if (r1 >= r2) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r3.mSpans
            r2 = r2[r1]
            int r2 = r2.getEndLine(r4)
            if (r2 >= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    private int getMinStart(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r3.mSpans
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.getStartLine(r4)
            r1 = 1
        La:
            int r2 = r3.mSpanCount
            if (r1 >= r2) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r3.mSpans
            r2 = r2[r1]
            int r2 = r2.getStartLine(r4)
            if (r2 >= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    private androidx.recyclerview.widget.StaggeredGridLayoutManager.Span getNextSpan(androidx.recyclerview.widget.LayoutState r8) {
            r7 = this;
            int r0 = r8.mLayoutDirection
            boolean r0 = r7.preferLastSpan(r0)
            r1 = -1
            r2 = 1
            if (r0 == 0) goto Lf
            int r0 = r7.mSpanCount
            int r0 = r0 - r2
            r3 = -1
            goto L13
        Lf:
            r0 = 0
            int r1 = r7.mSpanCount
            r3 = 1
        L13:
            int r8 = r8.mLayoutDirection
            r4 = 0
            if (r8 != r2) goto L32
            r8 = 2147483647(0x7fffffff, float:NaN)
            androidx.recyclerview.widget.OrientationHelper r2 = r7.mPrimaryOrientation
            int r2 = r2.getStartAfterPadding()
        L21:
            if (r0 == r1) goto L31
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r7.mSpans
            r5 = r5[r0]
            int r6 = r5.getEndLine(r2)
            if (r6 >= r8) goto L2f
            r4 = r5
            r8 = r6
        L2f:
            int r0 = r0 + r3
            goto L21
        L31:
            return r4
        L32:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            androidx.recyclerview.widget.OrientationHelper r2 = r7.mPrimaryOrientation
            int r2 = r2.getEndAfterPadding()
        L3a:
            if (r0 == r1) goto L4a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r7.mSpans
            r5 = r5[r0]
            int r6 = r5.getStartLine(r2)
            if (r6 <= r8) goto L48
            r4 = r5
            r8 = r6
        L48:
            int r0 = r0 + r3
            goto L3a
        L4a:
            return r4
    }

    private void handleUpdate(int r7, int r8, int r9) {
            r6 = this;
            boolean r0 = r6.mShouldReverseLayout
            if (r0 == 0) goto L9
            int r0 = r6.getLastChildPosition()
            goto Ld
        L9:
            int r0 = r6.getFirstChildPosition()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.mLazySpanLookup
            r4.invalidateAfter(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.offsetForRemoval(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.mLazySpanLookup
            r7.offsetForAddition(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.offsetForRemoval(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.mLazySpanLookup
            r9.offsetForAddition(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.mShouldReverseLayout
            if (r7 == 0) goto L4d
            int r7 = r6.getFirstChildPosition()
            goto L51
        L4d:
            int r7 = r6.getLastChildPosition()
        L51:
            if (r3 > r7) goto L56
            r6.requestLayout()
        L56:
            return
    }

    private void measureChildWithDecorationsAndMargin(android.view.View r5, int r6, int r7, boolean r8) {
            r4 = this;
            android.graphics.Rect r0 = r4.mTmpRect
            r4.calculateItemDecorationsForChild(r5, r0)
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r0
            int r1 = r0.leftMargin
            android.graphics.Rect r2 = r4.mTmpRect
            int r3 = r2.left
            int r1 = r1 + r3
            int r3 = r0.rightMargin
            int r2 = r2.right
            int r3 = r3 + r2
            int r6 = r4.updateSpecWithExtra(r6, r1, r3)
            int r1 = r0.topMargin
            android.graphics.Rect r2 = r4.mTmpRect
            int r3 = r2.top
            int r1 = r1 + r3
            int r3 = r0.bottomMargin
            int r2 = r2.bottom
            int r3 = r3 + r2
            int r7 = r4.updateSpecWithExtra(r7, r1, r3)
            if (r8 == 0) goto L32
            boolean r8 = r4.shouldReMeasureChild(r5, r6, r7, r0)
            goto L36
        L32:
            boolean r8 = r4.shouldMeasureChild(r5, r6, r7, r0)
        L36:
            if (r8 == 0) goto L3b
            r5.measure(r6, r7)
        L3b:
            return
    }

    private void measureChildWithDecorationsAndMargin(android.view.View r7, androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams r8, boolean r9) {
            r6 = this;
            boolean r0 = r8.mFullSpan
            r1 = 1
            if (r0 == 0) goto L43
            int r0 = r6.mOrientation
            if (r0 != r1) goto L26
            int r0 = r6.mFullSizeSpec
            int r2 = r6.getHeight()
            int r3 = r6.getHeightMode()
            int r4 = r6.getPaddingTop()
            int r5 = r6.getPaddingBottom()
            int r5 = r5 + r4
            int r8 = r8.height
            int r8 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r2, r3, r5, r8, r1)
            r6.measureChildWithDecorationsAndMargin(r7, r0, r8, r9)
            goto L95
        L26:
            int r0 = r6.getWidth()
            int r2 = r6.getWidthMode()
            int r3 = r6.getPaddingLeft()
            int r4 = r6.getPaddingRight()
            int r4 = r4 + r3
            int r8 = r8.width
            int r8 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r0, r2, r4, r8, r1)
            int r0 = r6.mFullSizeSpec
            r6.measureChildWithDecorationsAndMargin(r7, r8, r0, r9)
            goto L95
        L43:
            int r0 = r6.mOrientation
            r2 = 0
            if (r0 != r1) goto L6f
            int r0 = r6.mSizePerSpan
            int r3 = r6.getWidthMode()
            int r4 = r8.width
            int r0 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r0, r3, r2, r4, r2)
            int r2 = r6.getHeight()
            int r3 = r6.getHeightMode()
            int r4 = r6.getPaddingTop()
            int r5 = r6.getPaddingBottom()
            int r5 = r5 + r4
            int r8 = r8.height
            int r8 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r2, r3, r5, r8, r1)
            r6.measureChildWithDecorationsAndMargin(r7, r0, r8, r9)
            goto L95
        L6f:
            int r0 = r6.getWidth()
            int r3 = r6.getWidthMode()
            int r4 = r6.getPaddingLeft()
            int r5 = r6.getPaddingRight()
            int r5 = r5 + r4
            int r4 = r8.width
            int r0 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r0, r3, r5, r4, r1)
            int r1 = r6.mSizePerSpan
            int r3 = r6.getHeightMode()
            int r8 = r8.height
            int r8 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r1, r3, r2, r8, r2)
            r6.measureChildWithDecorationsAndMargin(r7, r0, r8, r9)
        L95:
            return
    }

    private void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r12, androidx.recyclerview.widget.RecyclerView.State r13, boolean r14) {
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r0 = r11.mAnchorInfo
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r11.mPendingSavedState
            r2 = -1
            if (r1 != 0) goto Lb
            int r1 = r11.mPendingScrollPosition
            if (r1 == r2) goto L18
        Lb:
            int r1 = r13.getItemCount()
            if (r1 != 0) goto L18
            r11.removeAndRecycleAllViews(r12)
            r0.reset()
            return
        L18:
            boolean r1 = r0.mValid
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L29
            int r1 = r11.mPendingScrollPosition
            if (r1 != r2) goto L29
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r11.mPendingSavedState
            if (r1 == 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L148
            r0.reset()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.mPendingSavedState
            if (r6 == 0) goto L39
            r11.applyPendingSavedState(r0)
            goto L40
        L39:
            r11.resolveShouldLayoutReverse()
            boolean r6 = r11.mShouldReverseLayout
            r0.mLayoutFromEnd = r6
        L40:
            boolean r6 = r13.isPreLayout()
            if (r6 != 0) goto L136
            int r6 = r11.mPendingScrollPosition
            if (r6 != r2) goto L4c
            goto L136
        L4c:
            if (r6 < 0) goto L132
            int r7 = r13.getItemCount()
            if (r6 < r7) goto L56
            goto L132
        L56:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.mPendingSavedState
            if (r6 == 0) goto L6b
            int r7 = r6.mAnchorPosition
            if (r7 == r2) goto L6b
            int r6 = r6.mSpanOffsetsSize
            if (r6 >= r4) goto L63
            goto L6b
        L63:
            r0.mOffset = r5
            int r6 = r11.mPendingScrollPosition
            r0.mPosition = r6
            goto L130
        L6b:
            int r6 = r11.mPendingScrollPosition
            android.view.View r6 = r11.findViewByPosition(r6)
            if (r6 == 0) goto Lfc
            boolean r7 = r11.mShouldReverseLayout
            if (r7 == 0) goto L7c
            int r7 = r11.getLastChildPosition()
            goto L80
        L7c:
            int r7 = r11.getFirstChildPosition()
        L80:
            r0.mPosition = r7
            int r7 = r11.mPendingScrollPositionOffset
            if (r7 == r5) goto Lb2
            boolean r7 = r0.mLayoutFromEnd
            if (r7 == 0) goto L9e
            androidx.recyclerview.widget.OrientationHelper r7 = r11.mPrimaryOrientation
            int r7 = r7.getEndAfterPadding()
            int r8 = r11.mPendingScrollPositionOffset
            int r7 = r7 - r8
            androidx.recyclerview.widget.OrientationHelper r8 = r11.mPrimaryOrientation
            int r6 = r8.getDecoratedEnd(r6)
            int r7 = r7 - r6
            r0.mOffset = r7
            goto L130
        L9e:
            androidx.recyclerview.widget.OrientationHelper r7 = r11.mPrimaryOrientation
            int r7 = r7.getStartAfterPadding()
            int r8 = r11.mPendingScrollPositionOffset
            int r7 = r7 + r8
            androidx.recyclerview.widget.OrientationHelper r8 = r11.mPrimaryOrientation
            int r6 = r8.getDecoratedStart(r6)
            int r7 = r7 - r6
            r0.mOffset = r7
            goto L130
        Lb2:
            androidx.recyclerview.widget.OrientationHelper r7 = r11.mPrimaryOrientation
            int r7 = r7.getDecoratedMeasurement(r6)
            androidx.recyclerview.widget.OrientationHelper r8 = r11.mPrimaryOrientation
            int r8 = r8.getTotalSpace()
            if (r7 <= r8) goto Ld4
            boolean r6 = r0.mLayoutFromEnd
            if (r6 == 0) goto Lcb
            androidx.recyclerview.widget.OrientationHelper r6 = r11.mPrimaryOrientation
            int r6 = r6.getEndAfterPadding()
            goto Ld1
        Lcb:
            androidx.recyclerview.widget.OrientationHelper r6 = r11.mPrimaryOrientation
            int r6 = r6.getStartAfterPadding()
        Ld1:
            r0.mOffset = r6
            goto L130
        Ld4:
            androidx.recyclerview.widget.OrientationHelper r7 = r11.mPrimaryOrientation
            int r7 = r7.getDecoratedStart(r6)
            androidx.recyclerview.widget.OrientationHelper r8 = r11.mPrimaryOrientation
            int r8 = r8.getStartAfterPadding()
            int r7 = r7 - r8
            if (r7 >= 0) goto Le7
            int r6 = -r7
            r0.mOffset = r6
            goto L130
        Le7:
            androidx.recyclerview.widget.OrientationHelper r7 = r11.mPrimaryOrientation
            int r7 = r7.getEndAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r8 = r11.mPrimaryOrientation
            int r6 = r8.getDecoratedEnd(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto Lf9
            r0.mOffset = r7
            goto L130
        Lf9:
            r0.mOffset = r5
            goto L130
        Lfc:
            int r6 = r11.mPendingScrollPosition
            r0.mPosition = r6
            int r7 = r11.mPendingScrollPositionOffset
            if (r7 != r5) goto L113
            int r6 = r11.calculateScrollDirectionForPosition(r6)
            if (r6 != r4) goto L10c
            r6 = 1
            goto L10d
        L10c:
            r6 = 0
        L10d:
            r0.mLayoutFromEnd = r6
            r0.assignCoordinateFromPadding()
            goto L12e
        L113:
            boolean r6 = r0.mLayoutFromEnd
            if (r6 == 0) goto L123
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = r0.this$0
            androidx.recyclerview.widget.OrientationHelper r6 = r6.mPrimaryOrientation
            int r6 = r6.getEndAfterPadding()
            int r6 = r6 - r7
            r0.mOffset = r6
            goto L12e
        L123:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = r0.this$0
            androidx.recyclerview.widget.OrientationHelper r6 = r6.mPrimaryOrientation
            int r6 = r6.getStartAfterPadding()
            int r6 = r6 + r7
            r0.mOffset = r6
        L12e:
            r0.mInvalidateOffsets = r4
        L130:
            r6 = 1
            goto L137
        L132:
            r11.mPendingScrollPosition = r2
            r11.mPendingScrollPositionOffset = r5
        L136:
            r6 = 0
        L137:
            if (r6 == 0) goto L13a
            goto L146
        L13a:
            boolean r6 = r11.updateAnchorFromChildren(r13, r0)
            if (r6 == 0) goto L141
            goto L146
        L141:
            r0.assignCoordinateFromPadding()
            r0.mPosition = r3
        L146:
            r0.mValid = r4
        L148:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.mPendingSavedState
            if (r6 != 0) goto L165
            int r6 = r11.mPendingScrollPosition
            if (r6 != r2) goto L165
            boolean r6 = r0.mLayoutFromEnd
            boolean r7 = r11.mLastLayoutFromEnd
            if (r6 != r7) goto L15e
            boolean r6 = r11.isLayoutRTL()
            boolean r7 = r11.mLastLayoutRTL
            if (r6 == r7) goto L165
        L15e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r11.mLazySpanLookup
            r6.clear()
            r0.mInvalidateOffsets = r4
        L165:
            int r6 = r11.getChildCount()
            if (r6 <= 0) goto L21d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.mPendingSavedState
            if (r6 == 0) goto L173
            int r6 = r6.mSpanOffsetsSize
            if (r6 >= r4) goto L21d
        L173:
            boolean r6 = r0.mInvalidateOffsets
            if (r6 == 0) goto L192
            r1 = 0
        L178:
            int r6 = r11.mSpanCount
            if (r1 >= r6) goto L21d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r6 = r11.mSpans
            r6 = r6[r1]
            r6.clear()
            int r6 = r0.mOffset
            if (r6 == r5) goto L18f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r7 = r11.mSpans
            r7 = r7[r1]
            r7.mCachedStart = r6
            r7.mCachedEnd = r6
        L18f:
            int r1 = r1 + 1
            goto L178
        L192:
            if (r1 != 0) goto L1b4
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r1 = r11.mAnchorInfo
            int[] r1 = r1.mSpanReferenceLines
            if (r1 != 0) goto L19b
            goto L1b4
        L19b:
            r1 = 0
        L19c:
            int r5 = r11.mSpanCount
            if (r1 >= r5) goto L21d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r11.mSpans
            r5 = r5[r1]
            r5.clear()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r6 = r11.mAnchorInfo
            int[] r6 = r6.mSpanReferenceLines
            r6 = r6[r1]
            r5.mCachedStart = r6
            r5.mCachedEnd = r6
            int r1 = r1 + 1
            goto L19c
        L1b4:
            r1 = 0
        L1b5:
            int r6 = r11.mSpanCount
            if (r1 >= r6) goto L1f5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r6 = r11.mSpans
            r6 = r6[r1]
            boolean r7 = r11.mShouldReverseLayout
            int r8 = r0.mOffset
            if (r7 == 0) goto L1c8
            int r9 = r6.getEndLine(r5)
            goto L1cc
        L1c8:
            int r9 = r6.getStartLine(r5)
        L1cc:
            r6.clear()
            if (r9 != r5) goto L1d2
            goto L1f2
        L1d2:
            if (r7 == 0) goto L1de
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = r6.this$0
            androidx.recyclerview.widget.OrientationHelper r10 = r10.mPrimaryOrientation
            int r10 = r10.getEndAfterPadding()
            if (r9 < r10) goto L1f2
        L1de:
            if (r7 != 0) goto L1eb
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = r6.this$0
            androidx.recyclerview.widget.OrientationHelper r7 = r7.mPrimaryOrientation
            int r7 = r7.getStartAfterPadding()
            if (r9 <= r7) goto L1eb
            goto L1f2
        L1eb:
            if (r8 == r5) goto L1ee
            int r9 = r9 + r8
        L1ee:
            r6.mCachedEnd = r9
            r6.mCachedStart = r9
        L1f2:
            int r1 = r1 + 1
            goto L1b5
        L1f5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r1 = r11.mAnchorInfo
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r6 = r11.mSpans
            java.util.Objects.requireNonNull(r1)
            int r7 = r6.length
            int[] r8 = r1.mSpanReferenceLines
            if (r8 == 0) goto L204
            int r8 = r8.length
            if (r8 >= r7) goto L20d
        L204:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = r1.this$0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r8 = r8.mSpans
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.mSpanReferenceLines = r8
        L20d:
            r8 = 0
        L20e:
            if (r8 >= r7) goto L21d
            int[] r9 = r1.mSpanReferenceLines
            r10 = r6[r8]
            int r10 = r10.getStartLine(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L20e
        L21d:
            r11.detachAndScrapAttachedViews(r12)
            androidx.recyclerview.widget.LayoutState r1 = r11.mLayoutState
            r1.mRecycle = r3
            r11.mLaidOutInvalidFullSpan = r3
            androidx.recyclerview.widget.OrientationHelper r1 = r11.mSecondaryOrientation
            int r1 = r1.getTotalSpace()
            int r5 = r11.mSpanCount
            int r5 = r1 / r5
            r11.mSizePerSpan = r5
            androidx.recyclerview.widget.OrientationHelper r5 = r11.mSecondaryOrientation
            int r5 = r5.getMode()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            r11.mFullSizeSpec = r1
            int r1 = r0.mPosition
            r11.updateLayoutState(r1, r13)
            boolean r1 = r0.mLayoutFromEnd
            if (r1 == 0) goto L25f
            r11.setLayoutStateDirection(r2)
            androidx.recyclerview.widget.LayoutState r1 = r11.mLayoutState
            r11.fill(r12, r1, r13)
            r11.setLayoutStateDirection(r4)
            androidx.recyclerview.widget.LayoutState r1 = r11.mLayoutState
            int r2 = r0.mPosition
            int r5 = r1.mItemDirection
            int r2 = r2 + r5
            r1.mCurrentPosition = r2
            r11.fill(r12, r1, r13)
            goto L276
        L25f:
            r11.setLayoutStateDirection(r4)
            androidx.recyclerview.widget.LayoutState r1 = r11.mLayoutState
            r11.fill(r12, r1, r13)
            r11.setLayoutStateDirection(r2)
            androidx.recyclerview.widget.LayoutState r1 = r11.mLayoutState
            int r2 = r0.mPosition
            int r5 = r1.mItemDirection
            int r2 = r2 + r5
            r1.mCurrentPosition = r2
            r11.fill(r12, r1, r13)
        L276:
            r11.repositionToWrapContentIfNecessary()
            int r1 = r11.getChildCount()
            if (r1 <= 0) goto L290
            boolean r1 = r11.mShouldReverseLayout
            if (r1 == 0) goto L28a
            r11.fixEndGap(r12, r13, r4)
            r11.fixStartGap(r12, r13, r3)
            goto L290
        L28a:
            r11.fixStartGap(r12, r13, r4)
            r11.fixEndGap(r12, r13, r3)
        L290:
            if (r14 == 0) goto L2bd
            boolean r14 = r13.isPreLayout()
            if (r14 != 0) goto L2bd
            int r14 = r11.mGapStrategy
            if (r14 == 0) goto L2ae
            int r14 = r11.getChildCount()
            if (r14 <= 0) goto L2ae
            boolean r14 = r11.mLaidOutInvalidFullSpan
            if (r14 != 0) goto L2ac
            android.view.View r14 = r11.hasGapsToFix()
            if (r14 == 0) goto L2ae
        L2ac:
            r14 = 1
            goto L2af
        L2ae:
            r14 = 0
        L2af:
            if (r14 == 0) goto L2bd
            java.lang.Runnable r14 = r11.mCheckForGapsRunnable
            r11.removeCallbacks(r14)
            boolean r14 = r11.checkForGaps()
            if (r14 == 0) goto L2bd
            goto L2be
        L2bd:
            r4 = 0
        L2be:
            boolean r14 = r13.isPreLayout()
            if (r14 == 0) goto L2c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r14 = r11.mAnchorInfo
            r14.reset()
        L2c9:
            boolean r14 = r0.mLayoutFromEnd
            r11.mLastLayoutFromEnd = r14
            boolean r14 = r11.isLayoutRTL()
            r11.mLastLayoutRTL = r14
            if (r4 == 0) goto L2dd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r14 = r11.mAnchorInfo
            r14.reset()
            r11.onLayoutChildren(r12, r13, r3)
        L2dd:
            return
    }

    private boolean preferLastSpan(int r5) {
            r4 = this;
            int r0 = r4.mOrientation
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L13
            if (r5 != r1) goto Lb
            r5 = 1
            goto Lc
        Lb:
            r5 = 0
        Lc:
            boolean r0 = r4.mShouldReverseLayout
            if (r5 == r0) goto L11
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
        L13:
            if (r5 != r1) goto L17
            r5 = 1
            goto L18
        L17:
            r5 = 0
        L18:
            boolean r0 = r4.mShouldReverseLayout
            if (r5 != r0) goto L1e
            r5 = 1
            goto L1f
        L1e:
            r5 = 0
        L1f:
            boolean r0 = r4.isLayoutRTL()
            if (r5 != r0) goto L26
            goto L27
        L26:
            r2 = 0
        L27:
            return r2
    }

    private void prependViewToAllSpans(android.view.View r3) {
            r2 = this;
            int r0 = r2.mSpanCount
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r2.mSpans
            r1 = r1[r0]
            r1.prependToSpan(r3)
            int r0 = r0 + (-1)
            goto L4
        L10:
            return
    }

    private void recycle(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.LayoutState r4) {
            r2 = this;
            boolean r0 = r4.mRecycle
            if (r0 == 0) goto L56
            boolean r0 = r4.mInfinite
            if (r0 == 0) goto L9
            goto L56
        L9:
            int r0 = r4.mAvailable
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.mLayoutDirection
            if (r0 != r1) goto L18
            int r4 = r4.mEndLine
            r2.recycleFromEnd(r3, r4)
            goto L56
        L18:
            int r4 = r4.mStartLine
            r2.recycleFromStart(r3, r4)
            goto L56
        L1e:
            int r0 = r4.mLayoutDirection
            if (r0 != r1) goto L3c
            int r0 = r4.mStartLine
            int r1 = r2.getMaxStart(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2e
            int r4 = r4.mEndLine
            goto L38
        L2e:
            int r1 = r4.mEndLine
            int r4 = r4.mAvailable
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
        L38:
            r2.recycleFromEnd(r3, r4)
            goto L56
        L3c:
            int r0 = r4.mEndLine
            int r0 = r2.getMinEnd(r0)
            int r1 = r4.mEndLine
            int r0 = r0 - r1
            if (r0 >= 0) goto L4a
            int r4 = r4.mStartLine
            goto L53
        L4a:
            int r1 = r4.mStartLine
            int r4 = r4.mAvailable
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
        L53:
            r2.recycleFromStart(r3, r4)
        L56:
            return
    }

    private void recycleFromEnd(androidx.recyclerview.widget.RecyclerView.Recycler r7, int r8) {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 1
            int r0 = r0 - r1
        L6:
            if (r0 < 0) goto L60
            android.view.View r2 = r6.getChildAt(r0)
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mPrimaryOrientation
            int r3 = r3.getDecoratedStart(r2)
            if (r3 < r8) goto L60
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mPrimaryOrientation
            int r3 = r3.getTransformedStartWithDecoration(r2)
            if (r3 < r8) goto L60
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r3
            boolean r4 = r3.mFullSpan
            if (r4 == 0) goto L4a
            r3 = 0
            r4 = 0
        L28:
            int r5 = r6.mSpanCount
            if (r4 >= r5) goto L3c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r5 = r6.mSpans
            r5 = r5[r4]
            java.util.ArrayList<android.view.View> r5 = r5.mViews
            int r5 = r5.size()
            if (r5 != r1) goto L39
            return
        L39:
            int r4 = r4 + 1
            goto L28
        L3c:
            int r4 = r6.mSpanCount
            if (r3 >= r4) goto L5a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r4 = r6.mSpans
            r4 = r4[r3]
            r4.popEnd()
            int r3 = r3 + 1
            goto L3c
        L4a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r4 = r3.mSpan
            java.util.ArrayList<android.view.View> r4 = r4.mViews
            int r4 = r4.size()
            if (r4 != r1) goto L55
            return
        L55:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r3 = r3.mSpan
            r3.popEnd()
        L5a:
            r6.removeAndRecycleView(r2, r7)
            int r0 = r0 + (-1)
            goto L6
        L60:
            return
    }

    private void recycleFromStart(androidx.recyclerview.widget.RecyclerView.Recycler r6, int r7) {
            r5 = this;
        L0:
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L5d
            r0 = 0
            android.view.View r1 = r5.getChildAt(r0)
            androidx.recyclerview.widget.OrientationHelper r2 = r5.mPrimaryOrientation
            int r2 = r2.getDecoratedEnd(r1)
            if (r2 > r7) goto L5d
            androidx.recyclerview.widget.OrientationHelper r2 = r5.mPrimaryOrientation
            int r2 = r2.getTransformedEndWithDecoration(r1)
            if (r2 > r7) goto L5d
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r2
            boolean r3 = r2.mFullSpan
            r4 = 1
            if (r3 == 0) goto L49
            r2 = 0
        L27:
            int r3 = r5.mSpanCount
            if (r2 >= r3) goto L3b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r3 = r5.mSpans
            r3 = r3[r2]
            java.util.ArrayList<android.view.View> r3 = r3.mViews
            int r3 = r3.size()
            if (r3 != r4) goto L38
            return
        L38:
            int r2 = r2 + 1
            goto L27
        L3b:
            int r2 = r5.mSpanCount
            if (r0 >= r2) goto L59
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r5.mSpans
            r2 = r2[r0]
            r2.popStart()
            int r0 = r0 + 1
            goto L3b
        L49:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r0 = r2.mSpan
            java.util.ArrayList<android.view.View> r0 = r0.mViews
            int r0 = r0.size()
            if (r0 != r4) goto L54
            return
        L54:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r0 = r2.mSpan
            r0.popStart()
        L59:
            r5.removeAndRecycleView(r1, r6)
            goto L0
        L5d:
            return
    }

    private void repositionToWrapContentIfNecessary() {
            r9 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r9.mSecondaryOrientation
            int r0 = r0.getMode()
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto Lb
            return
        Lb:
            r0 = 0
            int r1 = r9.getChildCount()
            r2 = 0
            r3 = 0
        L12:
            if (r3 >= r1) goto L3f
            android.view.View r4 = r9.getChildAt(r3)
            androidx.recyclerview.widget.OrientationHelper r5 = r9.mSecondaryOrientation
            int r5 = r5.getDecoratedMeasurement(r4)
            float r5 = (float) r5
            int r6 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r6 >= 0) goto L24
            goto L3c
        L24:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r4
            boolean r4 = r4.isFullSpan()
            if (r4 == 0) goto L38
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r4
            int r4 = r9.mSpanCount
            float r4 = (float) r4
            float r5 = r5 / r4
        L38:
            float r0 = java.lang.Math.max(r0, r5)
        L3c:
            int r3 = r3 + 1
            goto L12
        L3f:
            int r3 = r9.mSizePerSpan
            int r4 = r9.mSpanCount
            float r4 = (float) r4
            float r0 = r0 * r4
            int r0 = java.lang.Math.round(r0)
            androidx.recyclerview.widget.OrientationHelper r4 = r9.mSecondaryOrientation
            int r4 = r4.getMode()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r5) goto L5e
            androidx.recyclerview.widget.OrientationHelper r4 = r9.mSecondaryOrientation
            int r4 = r4.getTotalSpace()
            int r0 = java.lang.Math.min(r0, r4)
        L5e:
            int r4 = r9.mSpanCount
            int r4 = r0 / r4
            r9.mSizePerSpan = r4
            androidx.recyclerview.widget.OrientationHelper r4 = r9.mSecondaryOrientation
            int r4 = r4.getMode()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r9.mFullSizeSpec = r0
            int r0 = r9.mSizePerSpan
            if (r0 != r3) goto L75
            return
        L75:
            if (r2 >= r1) goto Lc3
            android.view.View r0 = r9.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r4
            boolean r5 = r4.mFullSpan
            if (r5 == 0) goto L86
            goto Lc0
        L86:
            boolean r5 = r9.isLayoutRTL()
            r6 = 1
            if (r5 == 0) goto La9
            int r5 = r9.mOrientation
            if (r5 != r6) goto La9
            int r5 = r9.mSpanCount
            int r7 = r5 + (-1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r4 = r4.mSpan
            int r4 = r4.mIndex
            int r7 = r7 - r4
            int r7 = -r7
            int r8 = r9.mSizePerSpan
            int r7 = r7 * r8
            int r5 = r5 - r6
            int r5 = r5 - r4
            int r4 = -r5
            int r4 = r4 * r3
            int r7 = r7 - r4
            r0.offsetLeftAndRight(r7)
            goto Lc0
        La9:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r4 = r4.mSpan
            int r4 = r4.mIndex
            int r5 = r9.mSizePerSpan
            int r5 = r5 * r4
            int r4 = r4 * r3
            int r7 = r9.mOrientation
            if (r7 != r6) goto Lbc
            int r5 = r5 - r4
            r0.offsetLeftAndRight(r5)
            goto Lc0
        Lbc:
            int r5 = r5 - r4
            r0.offsetTopAndBottom(r5)
        Lc0:
            int r2 = r2 + 1
            goto L75
        Lc3:
            return
    }

    private void resolveShouldLayoutReverse() {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 == r1) goto L12
            boolean r0 = r2.isLayoutRTL()
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r2.mReverseLayout
            r0 = r0 ^ r1
            r2.mShouldReverseLayout = r0
            goto L16
        L12:
            boolean r0 = r2.mReverseLayout
            r2.mShouldReverseLayout = r0
        L16:
            return
    }

    private void setLayoutStateDirection(int r5) {
            r4 = this;
            androidx.recyclerview.widget.LayoutState r0 = r4.mLayoutState
            r0.mLayoutDirection = r5
            boolean r1 = r4.mShouldReverseLayout
            r2 = 1
            r3 = -1
            if (r5 != r3) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != r5) goto L10
            goto L11
        L10:
            r2 = -1
        L11:
            r0.mItemDirection = r2
            return
    }

    private void updateAllRemainingSpans(int r3, int r4) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.mSpanCount
            if (r0 >= r1) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r2.mSpans
            r1 = r1[r0]
            java.util.ArrayList<android.view.View> r1 = r1.mViews
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
            goto L19
        L12:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r2.mSpans
            r1 = r1[r0]
            r2.updateRemainingSpans(r1, r3, r4)
        L19:
            int r0 = r0 + 1
            goto L1
        L1c:
            return
    }

    private boolean updateAnchorFromChildren(androidx.recyclerview.widget.RecyclerView.State r2, androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo r3) {
            r1 = this;
            boolean r0 = r1.mLastLayoutFromEnd
            if (r0 == 0) goto Ld
            int r2 = r2.getItemCount()
            int r2 = r1.findLastReferenceChildPosition(r2)
            goto L15
        Ld:
            int r2 = r2.getItemCount()
            int r2 = r1.findFirstReferenceChildPosition(r2)
        L15:
            r3.mPosition = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.mOffset = r2
            r2 = 1
            return r2
    }

    private void updateLayoutState(int r5, androidx.recyclerview.widget.RecyclerView.State r6) {
            r4 = this;
            androidx.recyclerview.widget.LayoutState r0 = r4.mLayoutState
            r1 = 0
            r0.mAvailable = r1
            r0.mCurrentPosition = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.getTargetScrollPosition()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.mShouldReverseLayout
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.OrientationHelper r5 = r4.mPrimaryOrientation
            int r5 = r5.getTotalSpace()
            goto L2f
        L25:
            androidx.recyclerview.widget.OrientationHelper r5 = r4.mPrimaryOrientation
            int r5 = r5.getTotalSpace()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.LayoutState r0 = r4.mLayoutState
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mPrimaryOrientation
            int r3 = r3.getStartAfterPadding()
            int r3 = r3 - r6
            r0.mStartLine = r3
            androidx.recyclerview.widget.LayoutState r6 = r4.mLayoutState
            androidx.recyclerview.widget.OrientationHelper r0 = r4.mPrimaryOrientation
            int r0 = r0.getEndAfterPadding()
            int r0 = r0 + r5
            r6.mEndLine = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.LayoutState r0 = r4.mLayoutState
            androidx.recyclerview.widget.OrientationHelper r3 = r4.mPrimaryOrientation
            int r3 = r3.getEnd()
            int r3 = r3 + r5
            r0.mEndLine = r3
            androidx.recyclerview.widget.LayoutState r5 = r4.mLayoutState
            int r6 = -r6
            r5.mStartLine = r6
        L5d:
            androidx.recyclerview.widget.LayoutState r5 = r4.mLayoutState
            r5.mStopInFocusable = r1
            r5.mRecycle = r2
            androidx.recyclerview.widget.OrientationHelper r6 = r4.mPrimaryOrientation
            int r6 = r6.getMode()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.OrientationHelper r6 = r4.mPrimaryOrientation
            int r6 = r6.getEnd()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.mInfinite = r1
            return
    }

    private void updateRemainingSpans(androidx.recyclerview.widget.StaggeredGridLayoutManager.Span r5, int r6, int r7) {
            r4 = this;
            int r0 = r5.getDeletedSize()
            r1 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -1
            if (r6 != r3) goto L1f
            int r6 = r5.mCachedStart
            if (r6 == r2) goto Lf
            goto L14
        Lf:
            r5.calculateCachedStart()
            int r6 = r5.mCachedStart
        L14:
            int r6 = r6 + r0
            if (r6 > r7) goto L33
            java.util.BitSet r6 = r4.mRemainingSpans
            int r5 = r5.mIndex
            r6.set(r5, r1)
            goto L33
        L1f:
            int r6 = r5.mCachedEnd
            if (r6 == r2) goto L24
            goto L29
        L24:
            r5.calculateCachedEnd()
            int r6 = r5.mCachedEnd
        L29:
            int r6 = r6 - r0
            if (r6 < r7) goto L33
            java.util.BitSet r6 = r4.mRemainingSpans
            int r5 = r5.mIndex
            r6.set(r5, r1)
        L33:
            return
    }

    private int updateSpecWithExtra(int r3, int r4, int r5) {
            r2 = this;
            if (r4 != 0) goto L5
            if (r5 != 0) goto L5
            return r3
        L5:
            int r0 = android.view.View.MeasureSpec.getMode(r3)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L13
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L12
            goto L13
        L12:
            return r3
        L13:
            r1 = 0
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = r3 - r4
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r1, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(java.lang.String r2) {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r1.mPendingSavedState
            if (r0 != 0) goto L7
            super.assertNotInLayoutOrScroll(r2)
        L7:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public final boolean checkForGaps() {
            r7 = this;
            int r0 = r7.getChildCount()
            r1 = 0
            if (r0 == 0) goto L7d
            int r0 = r7.mGapStrategy
            if (r0 == 0) goto L7d
            boolean r0 = r7.isAttachedToWindow()
            if (r0 != 0) goto L12
            goto L7d
        L12:
            boolean r0 = r7.mShouldReverseLayout
            if (r0 == 0) goto L1f
            int r0 = r7.getLastChildPosition()
            int r2 = r7.getFirstChildPosition()
            goto L27
        L1f:
            int r0 = r7.getFirstChildPosition()
            int r2 = r7.getLastChildPosition()
        L27:
            r3 = 1
            if (r0 != 0) goto L3c
            android.view.View r4 = r7.hasGapsToFix()
            if (r4 == 0) goto L3c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r7.mLazySpanLookup
            r0.clear()
            r7.requestSimpleAnimationsInNextLayout()
            r7.requestLayout()
            return r3
        L3c:
            boolean r4 = r7.mLaidOutInvalidFullSpan
            if (r4 != 0) goto L41
            return r1
        L41:
            boolean r4 = r7.mShouldReverseLayout
            r5 = -1
            if (r4 == 0) goto L48
            r4 = -1
            goto L49
        L48:
            r4 = 1
        L49:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r7.mLazySpanLookup
            int r2 = r2 + r3
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r6 = r6.getFirstFullSpanItemInRange(r0, r2, r4, r3)
            if (r6 != 0) goto L5a
            r7.mLaidOutInvalidFullSpan = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r7.mLazySpanLookup
            r0.forceInvalidateAfter(r2)
            return r1
        L5a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r7.mLazySpanLookup
            int r2 = r6.mPosition
            int r4 = r4 * (-1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r1.getFirstFullSpanItemInRange(r0, r2, r4, r3)
            if (r0 != 0) goto L6e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r7.mLazySpanLookup
            int r1 = r6.mPosition
            r0.forceInvalidateAfter(r1)
            goto L76
        L6e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r7.mLazySpanLookup
            int r0 = r0.mPosition
            int r0 = r0 + r3
            r1.forceInvalidateAfter(r0)
        L76:
            r7.requestSimpleAnimationsInNextLayout()
            r7.requestLayout()
            return r3
        L7d:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int r5, int r6, androidx.recyclerview.widget.RecyclerView.State r7, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r8) {
            r4 = this;
            int r0 = r4.mOrientation
            if (r0 != 0) goto L5
            goto L6
        L5:
            r5 = r6
        L6:
            int r6 = r4.getChildCount()
            if (r6 == 0) goto L85
            if (r5 != 0) goto L10
            goto L85
        L10:
            r4.prepareLayoutStateForDelta(r5, r7)
            int[] r5 = r4.mPrefetchDistances
            if (r5 == 0) goto L1c
            int r5 = r5.length
            int r6 = r4.mSpanCount
            if (r5 >= r6) goto L22
        L1c:
            int r5 = r4.mSpanCount
            int[] r5 = new int[r5]
            r4.mPrefetchDistances = r5
        L22:
            r5 = 0
            r6 = 0
            r0 = 0
        L25:
            int r1 = r4.mSpanCount
            if (r6 >= r1) goto L55
            androidx.recyclerview.widget.LayoutState r1 = r4.mLayoutState
            int r2 = r1.mItemDirection
            r3 = -1
            if (r2 != r3) goto L3b
            int r1 = r1.mStartLine
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r4.mSpans
            r2 = r2[r6]
            int r2 = r2.getStartLine(r1)
            goto L49
        L3b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r4.mSpans
            r2 = r2[r6]
            int r1 = r1.mEndLine
            int r1 = r2.getEndLine(r1)
            androidx.recyclerview.widget.LayoutState r2 = r4.mLayoutState
            int r2 = r2.mEndLine
        L49:
            int r1 = r1 - r2
            if (r1 < 0) goto L52
            int[] r2 = r4.mPrefetchDistances
            r2[r0] = r1
            int r0 = r0 + 1
        L52:
            int r6 = r6 + 1
            goto L25
        L55:
            int[] r6 = r4.mPrefetchDistances
            java.util.Arrays.sort(r6, r5, r0)
            r6 = 0
        L5b:
            if (r6 >= r0) goto L85
            androidx.recyclerview.widget.LayoutState r1 = r4.mLayoutState
            int r1 = r1.mCurrentPosition
            if (r1 < 0) goto L6b
            int r2 = r7.getItemCount()
            if (r1 >= r2) goto L6b
            r1 = 1
            goto L6c
        L6b:
            r1 = 0
        L6c:
            if (r1 == 0) goto L85
            androidx.recyclerview.widget.LayoutState r1 = r4.mLayoutState
            int r1 = r1.mCurrentPosition
            int[] r2 = r4.mPrefetchDistances
            r2 = r2[r6]
            r8.addPosition(r1, r2)
            androidx.recyclerview.widget.LayoutState r1 = r4.mLayoutState
            int r2 = r1.mCurrentPosition
            int r3 = r1.mItemDirection
            int r2 = r2 + r3
            r1.mCurrentPosition = r2
            int r6 = r6 + 1
            goto L5b
        L85:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollExtent(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollOffset(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollRange(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public android.graphics.PointF computeScrollVectorForPosition(int r4) {
            r3 = this;
            int r4 = r3.calculateScrollDirectionForPosition(r4)
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            if (r4 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            int r1 = r3.mOrientation
            r2 = 0
            if (r1 != 0) goto L18
            float r4 = (float) r4
            r0.x = r4
            r0.y = r2
            goto L1d
        L18:
            r0.x = r2
            float r4 = (float) r4
            r0.y = r4
        L1d:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollExtent(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollOffset(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            int r1 = r0.computeScrollRange(r1)
            return r1
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] r4) {
            r3 = this;
            if (r4 != 0) goto L7
            int r4 = r3.mSpanCount
            int[] r4 = new int[r4]
            goto Lc
        L7:
            int r0 = r4.length
            int r1 = r3.mSpanCount
            if (r0 < r1) goto L1f
        Lc:
            r0 = 0
        Ld:
            int r1 = r3.mSpanCount
            if (r0 >= r1) goto L1e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r3.mSpans
            r1 = r1[r0]
            int r1 = r1.findFirstCompletelyVisibleItemPosition()
            r4[r0] = r1
            int r0 = r0 + 1
            goto Ld
        L1e:
            return r4
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Provided int[]'s size must be more than or equal to span count. Expected:"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r3.mSpanCount
            r1.append(r2)
            java.lang.String r2 = ", array size:"
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final android.view.View findFirstVisibleItemClosestToEnd(boolean r8) {
            r7 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r7.mPrimaryOrientation
            int r0 = r0.getStartAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r1 = r7.mPrimaryOrientation
            int r1 = r1.getEndAfterPadding()
            int r2 = r7.getChildCount()
            int r2 = r2 + (-1)
            r3 = 0
        L13:
            if (r2 < 0) goto L37
            android.view.View r4 = r7.getChildAt(r2)
            androidx.recyclerview.widget.OrientationHelper r5 = r7.mPrimaryOrientation
            int r5 = r5.getDecoratedStart(r4)
            androidx.recyclerview.widget.OrientationHelper r6 = r7.mPrimaryOrientation
            int r6 = r6.getDecoratedEnd(r4)
            if (r6 <= r0) goto L34
            if (r5 < r1) goto L2a
            goto L34
        L2a:
            if (r6 <= r1) goto L33
            if (r8 != 0) goto L2f
            goto L33
        L2f:
            if (r3 != 0) goto L34
            r3 = r4
            goto L34
        L33:
            return r4
        L34:
            int r2 = r2 + (-1)
            goto L13
        L37:
            return r3
    }

    public final android.view.View findFirstVisibleItemClosestToStart(boolean r9) {
            r8 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r8.mPrimaryOrientation
            int r0 = r0.getStartAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r1 = r8.mPrimaryOrientation
            int r1 = r1.getEndAfterPadding()
            int r2 = r8.getChildCount()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r2) goto L36
            android.view.View r5 = r8.getChildAt(r4)
            androidx.recyclerview.widget.OrientationHelper r6 = r8.mPrimaryOrientation
            int r6 = r6.getDecoratedStart(r5)
            androidx.recyclerview.widget.OrientationHelper r7 = r8.mPrimaryOrientation
            int r7 = r7.getDecoratedEnd(r5)
            if (r7 <= r0) goto L33
            if (r6 < r1) goto L29
            goto L33
        L29:
            if (r6 >= r0) goto L32
            if (r9 != 0) goto L2e
            goto L32
        L2e:
            if (r3 != 0) goto L33
            r3 = r5
            goto L33
        L32:
            return r5
        L33:
            int r4 = r4 + 1
            goto L12
        L36:
            return r3
    }

    public int[] findFirstVisibleItemPositions(int[] r4) {
            r3 = this;
            if (r4 != 0) goto L7
            int r4 = r3.mSpanCount
            int[] r4 = new int[r4]
            goto Lc
        L7:
            int r0 = r4.length
            int r1 = r3.mSpanCount
            if (r0 < r1) goto L1f
        Lc:
            r0 = 0
        Ld:
            int r1 = r3.mSpanCount
            if (r0 >= r1) goto L1e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r3.mSpans
            r1 = r1[r0]
            int r1 = r1.findFirstVisibleItemPosition()
            r4[r0] = r1
            int r0 = r0 + 1
            goto Ld
        L1e:
            return r4
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Provided int[]'s size must be more than or equal to span count. Expected:"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r3.mSpanCount
            r1.append(r2)
            java.lang.String r2 = ", array size:"
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] r4) {
            r3 = this;
            if (r4 != 0) goto L7
            int r4 = r3.mSpanCount
            int[] r4 = new int[r4]
            goto Lc
        L7:
            int r0 = r4.length
            int r1 = r3.mSpanCount
            if (r0 < r1) goto L1f
        Lc:
            r0 = 0
        Ld:
            int r1 = r3.mSpanCount
            if (r0 >= r1) goto L1e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r3.mSpans
            r1 = r1[r0]
            int r1 = r1.findLastCompletelyVisibleItemPosition()
            r4[r0] = r1
            int r0 = r0 + 1
            goto Ld
        L1e:
            return r4
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Provided int[]'s size must be more than or equal to span count. Expected:"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r3.mSpanCount
            r1.append(r2)
            java.lang.String r2 = ", array size:"
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public int[] findLastVisibleItemPositions(int[] r4) {
            r3 = this;
            if (r4 != 0) goto L7
            int r4 = r3.mSpanCount
            int[] r4 = new int[r4]
            goto Lc
        L7:
            int r0 = r4.length
            int r1 = r3.mSpanCount
            if (r0 < r1) goto L1f
        Lc:
            r0 = 0
        Ld:
            int r1 = r3.mSpanCount
            if (r0 >= r1) goto L1e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r3.mSpans
            r1 = r1[r0]
            int r1 = r1.findLastVisibleItemPosition()
            r4[r0] = r1
            int r0 = r0 + 1
            goto Ld
        L1e:
            return r4
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Provided int[]'s size must be more than or equal to span count. Expected:"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r3.mSpanCount
            r1.append(r2)
            java.lang.String r2 = ", array size:"
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = -2
            r2 = -1
            if (r0 != 0) goto Lc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams
            r0.<init>(r1, r2)
            return r0
        Lc:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams
            r0.<init>(r2, r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams
            r0.<init>(r2)
            return r0
    }

    public final int getFirstChildPosition() {
            r2 = this;
            int r0 = r2.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            goto L10
        L8:
            android.view.View r0 = r2.getChildAt(r1)
            int r1 = r2.getPosition(r0)
        L10:
            return r1
    }

    public int getGapStrategy() {
            r1 = this;
            int r0 = r1.mGapStrategy
            return r0
    }

    public final int getLastChildPosition() {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            goto L12
        L8:
            int r0 = r0 + (-1)
            android.view.View r0 = r1.getChildAt(r0)
            int r0 = r1.getPosition(r0)
        L12:
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public boolean getReverseLayout() {
            r1 = this;
            boolean r0 = r1.mReverseLayout
            return r0
    }

    public int getSpanCount() {
            r1 = this;
            int r0 = r1.mSpanCount
            return r0
    }

    public final android.view.View hasGapsToFix() {
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.mSpanCount
            r2.<init>(r3)
            int r3 = r12.mSpanCount
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.mOrientation
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.mShouldReverseLayout
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r8.mSpan
            int r9 = r9.mIndex
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r8.mSpan
            boolean r9 = r12.checkSpanForGap(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r8.mSpan
            int r9 = r9.mIndex
            r2.clear(r9)
        L54:
            boolean r9 = r8.mFullSpan
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.mShouldReverseLayout
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.OrientationHelper r10 = r12.mPrimaryOrientation
            int r10 = r10.getDecoratedEnd(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.mPrimaryOrientation
            int r11 = r11.getDecoratedEnd(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.OrientationHelper r10 = r12.mPrimaryOrientation
            int r10 = r10.getDecoratedStart(r7)
            androidx.recyclerview.widget.OrientationHelper r11 = r12.mPrimaryOrientation
            int r11 = r11.getDecoratedStart(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r8 = r8.mSpan
            int r8 = r8.mIndex
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r9 = r9.mSpan
            int r9 = r9.mIndex
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
    }

    public void invalidateSpanAssignments() {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r1.mLazySpanLookup
            r0.clear()
            r1.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
            r1 = this;
            int r0 = r1.mGapStrategy
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean isLayoutRTL() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int r5) {
            r4 = this;
            super.offsetChildrenHorizontal(r5)
            r0 = 0
        L4:
            int r1 = r4.mSpanCount
            if (r0 >= r1) goto L1f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r4.mSpans
            r1 = r1[r0]
            int r2 = r1.mCachedStart
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.mCachedStart = r2
        L15:
            int r2 = r1.mCachedEnd
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.mCachedEnd = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int r5) {
            r4 = this;
            super.offsetChildrenVertical(r5)
            r0 = 0
        L4:
            int r1 = r4.mSpanCount
            if (r0 >= r1) goto L1f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r4.mSpans
            r1 = r1[r0]
            int r2 = r1.mCachedStart
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.mCachedStart = r2
        L15:
            int r2 = r1.mCachedEnd
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.mCachedEnd = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r1, @androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.Adapter r2) {
            r0 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r0.mLazySpanLookup
            r1.clear()
            r1 = 0
        L6:
            int r2 = r0.mSpanCount
            if (r1 >= r2) goto L14
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r2 = r0.mSpans
            r2 = r2[r1]
            r2.clear()
            int r1 = r1 + 1
            goto L6
        L14:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.Recycler r3) {
            r1 = this;
            super.onDetachedFromWindow(r2, r3)
            java.lang.Runnable r3 = r1.mCheckForGapsRunnable
            r1.removeCallbacks(r3)
            r3 = 0
        L9:
            int r0 = r1.mSpanCount
            if (r3 >= r0) goto L17
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r1.mSpans
            r0 = r0[r3]
            r0.clear()
            int r3 = r3 + 1
            goto L9
        L17:
            r2.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @androidx.annotation.Nullable
    public android.view.View onFocusSearchFailed(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.Recycler r11, androidx.recyclerview.widget.RecyclerView.State r12) {
            r8 = this;
            int r0 = r8.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r9 = r8.findContainingItemView(r9)
            if (r9 != 0) goto Lf
            return r1
        Lf:
            r8.resolveShouldLayoutReverse()
            int r10 = r8.convertFocusDirectionToLayoutDirection(r10)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r0) goto L1b
            return r1
        L1b:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r0
            boolean r2 = r0.mFullSpan
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r0 = r0.mSpan
            r3 = 1
            if (r10 != r3) goto L2d
            int r4 = r8.getLastChildPosition()
            goto L31
        L2d:
            int r4 = r8.getFirstChildPosition()
        L31:
            r8.updateLayoutState(r4, r12)
            r8.setLayoutStateDirection(r10)
            androidx.recyclerview.widget.LayoutState r5 = r8.mLayoutState
            int r6 = r5.mItemDirection
            int r6 = r6 + r4
            r5.mCurrentPosition = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.OrientationHelper r7 = r8.mPrimaryOrientation
            int r7 = r7.getTotalSpace()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.mAvailable = r6
            androidx.recyclerview.widget.LayoutState r5 = r8.mLayoutState
            r5.mStopInFocusable = r3
            r6 = 0
            r5.mRecycle = r6
            r8.fill(r11, r5, r12)
            boolean r11 = r8.mShouldReverseLayout
            r8.mLastLayoutFromEnd = r11
            if (r2 != 0) goto L66
            android.view.View r11 = r0.getFocusableViewAfter(r4, r10)
            if (r11 == 0) goto L66
            if (r11 == r9) goto L66
            return r11
        L66:
            boolean r11 = r8.preferLastSpan(r10)
            if (r11 == 0) goto L81
            int r11 = r8.mSpanCount
            int r11 = r11 - r3
        L6f:
            if (r11 < 0) goto L96
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r12 = r8.mSpans
            r12 = r12[r11]
            android.view.View r12 = r12.getFocusableViewAfter(r4, r10)
            if (r12 == 0) goto L7e
            if (r12 == r9) goto L7e
            return r12
        L7e:
            int r11 = r11 + (-1)
            goto L6f
        L81:
            r11 = 0
        L82:
            int r12 = r8.mSpanCount
            if (r11 >= r12) goto L96
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r12 = r8.mSpans
            r12 = r12[r11]
            android.view.View r12 = r12.getFocusableViewAfter(r4, r10)
            if (r12 == 0) goto L93
            if (r12 == r9) goto L93
            return r12
        L93:
            int r11 = r11 + 1
            goto L82
        L96:
            boolean r11 = r8.mReverseLayout
            r11 = r11 ^ r3
            r12 = -1
            if (r10 != r12) goto L9e
            r12 = 1
            goto L9f
        L9e:
            r12 = 0
        L9f:
            if (r11 != r12) goto La3
            r11 = 1
            goto La4
        La3:
            r11 = 0
        La4:
            if (r2 != 0) goto Lba
            if (r11 == 0) goto Lad
            int r12 = r0.findFirstPartiallyVisibleItemPosition()
            goto Lb1
        Lad:
            int r12 = r0.findLastPartiallyVisibleItemPosition()
        Lb1:
            android.view.View r12 = r8.findViewByPosition(r12)
            if (r12 == 0) goto Lba
            if (r12 == r9) goto Lba
            return r12
        Lba:
            boolean r10 = r8.preferLastSpan(r10)
            if (r10 == 0) goto Le9
            int r10 = r8.mSpanCount
            int r10 = r10 - r3
        Lc3:
            if (r10 < 0) goto L10c
            int r12 = r0.mIndex
            if (r10 != r12) goto Lca
            goto Le6
        Lca:
            if (r11 == 0) goto Ld5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r12 = r8.mSpans
            r12 = r12[r10]
            int r12 = r12.findFirstPartiallyVisibleItemPosition()
            goto Ldd
        Ld5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r12 = r8.mSpans
            r12 = r12[r10]
            int r12 = r12.findLastPartiallyVisibleItemPosition()
        Ldd:
            android.view.View r12 = r8.findViewByPosition(r12)
            if (r12 == 0) goto Le6
            if (r12 == r9) goto Le6
            return r12
        Le6:
            int r10 = r10 + (-1)
            goto Lc3
        Le9:
            int r10 = r8.mSpanCount
            if (r6 >= r10) goto L10c
            if (r11 == 0) goto Lf8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r10 = r8.mSpans
            r10 = r10[r6]
            int r10 = r10.findFirstPartiallyVisibleItemPosition()
            goto L100
        Lf8:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r10 = r8.mSpans
            r10 = r10[r6]
            int r10 = r10.findLastPartiallyVisibleItemPosition()
        L100:
            android.view.View r10 = r8.findViewByPosition(r10)
            if (r10 == 0) goto L109
            if (r10 == r9) goto L109
            return r10
        L109:
            int r6 = r6 + 1
            goto Le9
        L10c:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.onInitializeAccessibilityEvent(r3)
            int r0 = r2.getChildCount()
            if (r0 <= 0) goto L2f
            r0 = 0
            android.view.View r1 = r2.findFirstVisibleItemClosestToStart(r0)
            android.view.View r0 = r2.findFirstVisibleItemClosestToEnd(r0)
            if (r1 == 0) goto L2f
            if (r0 != 0) goto L17
            goto L2f
        L17:
            int r1 = r2.getPosition(r1)
            int r0 = r2.getPosition(r0)
            if (r1 >= r0) goto L28
            r3.setFromIndex(r1)
            r3.setToIndex(r0)
            goto L2f
        L28:
            r3.setFromIndex(r0)
            r3.setToIndex(r1)
        L2f:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            r1 = 1
            r0.handleUpdate(r2, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r0.mLazySpanLookup
            r1.clear()
            r0.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, int r4) {
            r0 = this;
            r1 = 8
            r0.handleUpdate(r2, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            r1 = 2
            r0.handleUpdate(r2, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            r1 = 4
            r0.handleUpdate(r2, r3, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r1 = this;
            r0 = 1
            r1.onLayoutChildren(r2, r3, r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            super.onLayoutCompleted(r1)
            r1 = -1
            r0.mPendingScrollPosition = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.mPendingScrollPositionOffset = r1
            r1 = 0
            r0.mPendingSavedState = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$AnchorInfo r1 = r0.mAnchorInfo
            r1.reset()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState
            if (r0 == 0) goto L21
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState) r3
            r2.mPendingSavedState = r3
            int r0 = r2.mPendingScrollPosition
            r1 = -1
            if (r0 == r1) goto L1e
            r3.invalidateAnchorPositionInfo()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r3 = r2.mPendingSavedState
            r0 = 0
            r3.mSpanOffsets = r0
            r1 = 0
            r3.mSpanOffsetsSize = r1
            r3.mSpanLookupSize = r1
            r3.mSpanLookup = r0
            r3.mFullSpanItems = r0
        L1e:
            r2.requestLayout()
        L21:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.os.Parcelable onSaveInstanceState() {
            r5 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r5.mPendingSavedState
            if (r0 == 0) goto La
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            r1.<init>(r0)
            return r1
        La:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            r0.<init>()
            boolean r1 = r5.mReverseLayout
            r0.mReverseLayout = r1
            boolean r1 = r5.mLastLayoutFromEnd
            r0.mAnchorLayoutFromEnd = r1
            boolean r1 = r5.mLastLayoutRTL
            r0.mLastLayoutRTL = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r5.mLazySpanLookup
            r2 = 0
            if (r1 == 0) goto L2e
            int[] r3 = r1.mData
            if (r3 == 0) goto L2e
            r0.mSpanLookup = r3
            int r3 = r3.length
            r0.mSpanLookupSize = r3
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r1 = r1.mFullSpanItems
            r0.mFullSpanItems = r1
            goto L30
        L2e:
            r0.mSpanLookupSize = r2
        L30:
            int r1 = r5.getChildCount()
            r3 = -1
            if (r1 <= 0) goto L98
            boolean r1 = r5.mLastLayoutFromEnd
            if (r1 == 0) goto L40
            int r1 = r5.getLastChildPosition()
            goto L44
        L40:
            int r1 = r5.getFirstChildPosition()
        L44:
            r0.mAnchorPosition = r1
            boolean r1 = r5.mShouldReverseLayout
            r4 = 1
            if (r1 == 0) goto L50
            android.view.View r1 = r5.findFirstVisibleItemClosestToEnd(r4)
            goto L54
        L50:
            android.view.View r1 = r5.findFirstVisibleItemClosestToStart(r4)
        L54:
            if (r1 != 0) goto L57
            goto L5b
        L57:
            int r3 = r5.getPosition(r1)
        L5b:
            r0.mVisibleAnchorPosition = r3
            int r1 = r5.mSpanCount
            r0.mSpanOffsetsSize = r1
            int[] r1 = new int[r1]
            r0.mSpanOffsets = r1
        L65:
            int r1 = r5.mSpanCount
            if (r2 >= r1) goto L9e
            boolean r1 = r5.mLastLayoutFromEnd
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L80
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r5.mSpans
            r1 = r1[r2]
            int r1 = r1.getEndLine(r3)
            if (r1 == r3) goto L91
            androidx.recyclerview.widget.OrientationHelper r3 = r5.mPrimaryOrientation
            int r3 = r3.getEndAfterPadding()
            goto L90
        L80:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r1 = r5.mSpans
            r1 = r1[r2]
            int r1 = r1.getStartLine(r3)
            if (r1 == r3) goto L91
            androidx.recyclerview.widget.OrientationHelper r3 = r5.mPrimaryOrientation
            int r3 = r3.getStartAfterPadding()
        L90:
            int r1 = r1 - r3
        L91:
            int[] r3 = r0.mSpanOffsets
            r3[r2] = r1
            int r2 = r2 + 1
            goto L65
        L98:
            r0.mAnchorPosition = r3
            r0.mVisibleAnchorPosition = r3
            r0.mSpanOffsetsSize = r2
        L9e:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r0.checkForGaps()
        L5:
            return
    }

    public final void prepareLayoutStateForDelta(int r5, androidx.recyclerview.widget.RecyclerView.State r6) {
            r4 = this;
            r0 = 1
            if (r5 <= 0) goto L9
            int r1 = r4.getLastChildPosition()
            r2 = 1
            goto L10
        L9:
            r1 = -1
            int r2 = r4.getFirstChildPosition()
            r1 = r2
            r2 = -1
        L10:
            androidx.recyclerview.widget.LayoutState r3 = r4.mLayoutState
            r3.mRecycle = r0
            r4.updateLayoutState(r1, r6)
            r4.setLayoutStateDirection(r2)
            androidx.recyclerview.widget.LayoutState r6 = r4.mLayoutState
            int r0 = r6.mItemDirection
            int r1 = r1 + r0
            r6.mCurrentPosition = r1
            int r5 = java.lang.Math.abs(r5)
            r6.mAvailable = r5
            return
    }

    public final int scrollBy(int r3, androidx.recyclerview.widget.RecyclerView.Recycler r4, androidx.recyclerview.widget.RecyclerView.State r5) {
            r2 = this;
            int r0 = r2.getChildCount()
            r1 = 0
            if (r0 == 0) goto L31
            if (r3 != 0) goto La
            goto L31
        La:
            r2.prepareLayoutStateForDelta(r3, r5)
            androidx.recyclerview.widget.LayoutState r0 = r2.mLayoutState
            int r5 = r2.fill(r4, r0, r5)
            androidx.recyclerview.widget.LayoutState r0 = r2.mLayoutState
            int r0 = r0.mAvailable
            if (r0 >= r5) goto L1a
            goto L1f
        L1a:
            if (r3 >= 0) goto L1e
            int r3 = -r5
            goto L1f
        L1e:
            r3 = r5
        L1f:
            androidx.recyclerview.widget.OrientationHelper r5 = r2.mPrimaryOrientation
            int r0 = -r3
            r5.offsetChildren(r0)
            boolean r5 = r2.mShouldReverseLayout
            r2.mLastLayoutFromEnd = r5
            androidx.recyclerview.widget.LayoutState r5 = r2.mLayoutState
            r5.mAvailable = r1
            r2.recycle(r4, r5)
            return r3
        L31:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int r1, androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r0 = this;
            int r1 = r0.scrollBy(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int r3) {
            r2 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r2.mPendingSavedState
            if (r0 == 0) goto Lb
            int r1 = r0.mAnchorPosition
            if (r1 == r3) goto Lb
            r0.invalidateAnchorPositionInfo()
        Lb:
            r2.mPendingScrollPosition = r3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mPendingScrollPositionOffset = r3
            r2.requestLayout()
            return
    }

    public void scrollToPositionWithOffset(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r1.mPendingSavedState
            if (r0 == 0) goto L7
            r0.invalidateAnchorPositionInfo()
        L7:
            r1.mPendingScrollPosition = r2
            r1.mPendingScrollPositionOffset = r3
            r1.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int r1, androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r0 = this;
            int r1 = r0.scrollBy(r1, r2, r3)
            return r1
    }

    public void setGapStrategy(int r2) {
            r1 = this;
            r0 = 0
            r1.assertNotInLayoutOrScroll(r0)
            int r0 = r1.mGapStrategy
            if (r2 != r0) goto L9
            return
        L9:
            if (r2 == 0) goto L17
            r0 = 2
            if (r2 != r0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS"
            r2.<init>(r0)
            throw r2
        L17:
            r1.mGapStrategy = r2
            r1.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.getPaddingLeft()
            int r1 = r4.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r4.getPaddingTop()
            int r2 = r4.getPaddingBottom()
            int r2 = r2 + r0
            int r0 = r4.mOrientation
            r3 = 1
            if (r0 != r3) goto L34
            int r5 = r5.height()
            int r5 = r5 + r2
            int r0 = r4.getMinimumHeight()
            int r5 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r7, r5, r0)
            int r7 = r4.mSizePerSpan
            int r0 = r4.mSpanCount
            int r7 = r7 * r0
            int r7 = r7 + r1
            int r0 = r4.getMinimumWidth()
            int r6 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r6, r7, r0)
            goto L50
        L34:
            int r5 = r5.width()
            int r5 = r5 + r1
            int r0 = r4.getMinimumWidth()
            int r6 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r6, r5, r0)
            int r5 = r4.mSizePerSpan
            int r0 = r4.mSpanCount
            int r5 = r5 * r0
            int r5 = r5 + r2
            int r0 = r4.getMinimumHeight()
            int r5 = androidx.recyclerview.widget.RecyclerView.LayoutManager.chooseSize(r7, r5, r0)
        L50:
            r4.setMeasuredDimension(r6, r5)
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            if (r2 == 0) goto Le
            r0 = 1
            if (r2 != r0) goto L6
            goto Le
        L6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid orientation."
            r2.<init>(r0)
            throw r2
        Le:
            r0 = 0
            r1.assertNotInLayoutOrScroll(r0)
            int r0 = r1.mOrientation
            if (r2 != r0) goto L17
            return
        L17:
            r1.mOrientation = r2
            androidx.recyclerview.widget.OrientationHelper r2 = r1.mPrimaryOrientation
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mSecondaryOrientation
            r1.mPrimaryOrientation = r0
            r1.mSecondaryOrientation = r2
            r1.requestLayout()
            return
    }

    public void setReverseLayout(boolean r3) {
            r2 = this;
            r0 = 0
            r2.assertNotInLayoutOrScroll(r0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r2.mPendingSavedState
            if (r0 == 0) goto Le
            boolean r1 = r0.mReverseLayout
            if (r1 == r3) goto Le
            r0.mReverseLayout = r3
        Le:
            r2.mReverseLayout = r3
            r2.requestLayout()
            return
    }

    public void setSpanCount(int r3) {
            r2 = this;
            r0 = 0
            r2.assertNotInLayoutOrScroll(r0)
            int r0 = r2.mSpanCount
            if (r3 == r0) goto L30
            r2.invalidateSpanAssignments()
            r2.mSpanCount = r3
            java.util.BitSet r3 = new java.util.BitSet
            int r0 = r2.mSpanCount
            r3.<init>(r0)
            r2.mRemainingSpans = r3
            int r3 = r2.mSpanCount
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r3 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.Span[r3]
            r2.mSpans = r3
            r3 = 0
        L1d:
            int r0 = r2.mSpanCount
            if (r3 >= r0) goto L2d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span[] r0 = r2.mSpans
            androidx.recyclerview.widget.StaggeredGridLayoutManager$Span r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$Span
            r1.<init>(r2, r3)
            r0[r3] = r1
            int r3 = r3 + 1
            goto L1d
        L2d:
            r2.requestLayout()
        L30:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.State r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.LinearSmoothScroller r2 = new androidx.recyclerview.widget.LinearSmoothScroller
            android.content.Context r1 = r1.getContext()
            r2.<init>(r1)
            r2.setTargetPosition(r3)
            r0.startSmoothScroll(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r1.mPendingSavedState
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
