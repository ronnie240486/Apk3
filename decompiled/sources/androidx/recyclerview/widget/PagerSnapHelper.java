package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes2.dex */
public class PagerSnapHelper extends androidx.recyclerview.widget.SnapHelper {
    private static final int MAX_SCROLL_ON_FLING_DURATION = 100;

    @androidx.annotation.Nullable
    private androidx.recyclerview.widget.OrientationHelper mHorizontalHelper;

    @androidx.annotation.Nullable
    private androidx.recyclerview.widget.OrientationHelper mVerticalHelper;


    public PagerSnapHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private int distanceToCenter(@androidx.annotation.NonNull android.view.View r2, androidx.recyclerview.widget.OrientationHelper r3) {
            r1 = this;
            int r0 = r3.getDecoratedStart(r2)
            int r2 = r3.getDecoratedMeasurement(r2)
            int r2 = r2 / 2
            int r2 = r2 + r0
            int r0 = r3.getStartAfterPadding()
            int r3 = r3.getTotalSpace()
            int r3 = r3 / 2
            int r3 = r3 + r0
            int r2 = r2 - r3
            return r2
    }

    @androidx.annotation.Nullable
    private android.view.View findCenterView(androidx.recyclerview.widget.RecyclerView.LayoutManager r9, androidx.recyclerview.widget.OrientationHelper r10) {
            r8 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r10.getStartAfterPadding()
            int r3 = r10.getTotalSpace()
            int r3 = r3 / 2
            int r3 = r3 + r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
        L17:
            if (r4 >= r0) goto L34
            android.view.View r5 = r9.getChildAt(r4)
            int r6 = r10.getDecoratedStart(r5)
            int r7 = r10.getDecoratedMeasurement(r5)
            int r7 = r7 / 2
            int r7 = r7 + r6
            int r7 = r7 - r3
            int r6 = java.lang.Math.abs(r7)
            if (r6 >= r2) goto L31
            r1 = r5
            r2 = r6
        L31:
            int r4 = r4 + 1
            goto L17
        L34:
            return r1
    }

    @androidx.annotation.NonNull
    private androidx.recyclerview.widget.OrientationHelper getHorizontalHelper(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mHorizontalHelper
            if (r0 == 0) goto L8
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.mLayoutManager
            if (r0 == r2) goto Le
        L8:
            androidx.recyclerview.widget.OrientationHelper r2 = androidx.recyclerview.widget.OrientationHelper.createHorizontalHelper(r2)
            r1.mHorizontalHelper = r2
        Le:
            androidx.recyclerview.widget.OrientationHelper r2 = r1.mHorizontalHelper
            return r2
    }

    @androidx.annotation.Nullable
    private androidx.recyclerview.widget.OrientationHelper getOrientationHelper(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            boolean r0 = r2.canScrollVertically()
            if (r0 == 0) goto Lb
            androidx.recyclerview.widget.OrientationHelper r2 = r1.getVerticalHelper(r2)
            return r2
        Lb:
            boolean r0 = r2.canScrollHorizontally()
            if (r0 == 0) goto L16
            androidx.recyclerview.widget.OrientationHelper r2 = r1.getHorizontalHelper(r2)
            return r2
        L16:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    private androidx.recyclerview.widget.OrientationHelper getVerticalHelper(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mVerticalHelper
            if (r0 == 0) goto L8
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.mLayoutManager
            if (r0 == r2) goto Le
        L8:
            androidx.recyclerview.widget.OrientationHelper r2 = androidx.recyclerview.widget.OrientationHelper.createVerticalHelper(r2)
            r1.mVerticalHelper = r2
        Le:
            androidx.recyclerview.widget.OrientationHelper r2 = r1.mVerticalHelper
            return r2
    }

    private boolean isForwardFling(androidx.recyclerview.widget.RecyclerView.LayoutManager r3, int r4, int r5) {
            r2 = this;
            boolean r3 = r3.canScrollHorizontally()
            r0 = 1
            r1 = 0
            if (r3 == 0) goto Ld
            if (r4 <= 0) goto Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
        Ld:
            if (r5 <= 0) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private boolean isReverseLayout(androidx.recyclerview.widget.RecyclerView.LayoutManager r5) {
            r4 = this;
            int r0 = r5.getItemCount()
            boolean r1 = r5 instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
            r2 = 0
            if (r1 == 0) goto L21
            androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider r5 = (androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) r5
            r1 = 1
            int r0 = r0 - r1
            android.graphics.PointF r5 = r5.computeScrollVectorForPosition(r0)
            if (r5 == 0) goto L21
            float r0 = r5.x
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L20
            float r5 = r5.y
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L21
        L20:
            r2 = 1
        L21:
            return r2
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @androidx.annotation.Nullable
    public int[] calculateDistanceToFinalSnap(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager r5, @androidx.annotation.NonNull android.view.View r6) {
            r4 = this;
            r0 = 2
            int[] r0 = new int[r0]
            boolean r1 = r5.canScrollHorizontally()
            r2 = 0
            if (r1 == 0) goto L15
            androidx.recyclerview.widget.OrientationHelper r1 = r4.getHorizontalHelper(r5)
            int r1 = r4.distanceToCenter(r6, r1)
            r0[r2] = r1
            goto L17
        L15:
            r0[r2] = r2
        L17:
            boolean r1 = r5.canScrollVertically()
            r3 = 1
            if (r1 == 0) goto L29
            androidx.recyclerview.widget.OrientationHelper r5 = r4.getVerticalHelper(r5)
            int r5 = r4.distanceToCenter(r6, r5)
            r0[r3] = r5
            goto L2b
        L29:
            r0[r3] = r2
        L2b:
            return r0
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @androidx.annotation.Nullable
    public final androidx.recyclerview.widget.RecyclerView.SmoothScroller createScroller(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            boolean r2 = r2 instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
            if (r2 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.recyclerview.widget.PagerSnapHelper$1 r2 = new androidx.recyclerview.widget.PagerSnapHelper$1
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            android.content.Context r0 = r0.getContext()
            r2.<init>(r1, r0)
            return r2
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @androidx.annotation.Nullable
    public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            boolean r0 = r2.canScrollVertically()
            if (r0 == 0) goto Lf
            androidx.recyclerview.widget.OrientationHelper r0 = r1.getVerticalHelper(r2)
            android.view.View r2 = r1.findCenterView(r2, r0)
            return r2
        Lf:
            boolean r0 = r2.canScrollHorizontally()
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.OrientationHelper r0 = r1.getHorizontalHelper(r2)
            android.view.View r2 = r1.findCenterView(r2, r0)
            return r2
        L1e:
            r2 = 0
            return r2
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager r12, int r13, int r14) {
            r11 = this;
            int r0 = r12.getItemCount()
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.recyclerview.widget.OrientationHelper r2 = r11.getOrientationHelper(r12)
            if (r2 != 0) goto Lf
            return r1
        Lf:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r12.getChildCount()
            r6 = 0
            r7 = 0
            r8 = r7
        L1b:
            if (r6 >= r5) goto L37
            android.view.View r9 = r12.getChildAt(r6)
            if (r9 != 0) goto L24
            goto L34
        L24:
            int r10 = r11.distanceToCenter(r9, r2)
            if (r10 > 0) goto L2e
            if (r10 <= r3) goto L2e
            r8 = r9
            r3 = r10
        L2e:
            if (r10 < 0) goto L34
            if (r10 >= r4) goto L34
            r7 = r9
            r4 = r10
        L34:
            int r6 = r6 + 1
            goto L1b
        L37:
            boolean r13 = r11.isForwardFling(r12, r13, r14)
            if (r13 == 0) goto L44
            if (r7 == 0) goto L44
            int r12 = r12.getPosition(r7)
            return r12
        L44:
            if (r13 != 0) goto L4d
            if (r8 == 0) goto L4d
            int r12 = r12.getPosition(r8)
            return r12
        L4d:
            if (r13 == 0) goto L50
            r7 = r8
        L50:
            if (r7 != 0) goto L53
            return r1
        L53:
            int r14 = r12.getPosition(r7)
            boolean r12 = r11.isReverseLayout(r12)
            if (r12 != r13) goto L5f
            r12 = -1
            goto L60
        L5f:
            r12 = 1
        L60:
            int r14 = r14 + r12
            if (r14 < 0) goto L67
            if (r14 < r0) goto L66
            goto L67
        L66:
            return r14
        L67:
            return r1
    }
}
