package com.flextv.livestore.helper;

/* JADX INFO: loaded from: classes2.dex */
public class StartSnapHelper extends androidx.recyclerview.widget.LinearSnapHelper {
    private androidx.recyclerview.widget.OrientationHelper mHorizontalHelper;
    private androidx.recyclerview.widget.OrientationHelper mVerticalHelper;

    public StartSnapHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private int distanceToStart(android.view.View r1, androidx.recyclerview.widget.OrientationHelper r2) {
            r0 = this;
            int r1 = r2.getDecoratedStart(r1)
            int r2 = r2.getStartAfterPadding()
            int r1 = r1 - r2
            return r1
    }

    private androidx.recyclerview.widget.OrientationHelper getHorizontalHelper(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mHorizontalHelper
            if (r0 != 0) goto La
            androidx.recyclerview.widget.OrientationHelper r2 = androidx.recyclerview.widget.OrientationHelper.createHorizontalHelper(r2)
            r1.mHorizontalHelper = r2
        La:
            androidx.recyclerview.widget.OrientationHelper r2 = r1.mHorizontalHelper
            return r2
    }

    private android.view.View getStartView(androidx.recyclerview.widget.RecyclerView.LayoutManager r7, androidx.recyclerview.widget.OrientationHelper r8) {
            r6 = this;
            boolean r0 = r7 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L4e
            r0 = r7
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.findFirstVisibleItemPosition()
            int r0 = r0.findLastCompletelyVisibleItemPosition()
            int r2 = r7.getItemCount()
            r3 = 1
            int r2 = r2 - r3
            if (r0 != r2) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            r2 = -1
            r4 = 0
            if (r1 == r2) goto L4d
            if (r0 == 0) goto L21
            goto L4d
        L21:
            android.view.View r0 = r7.findViewByPosition(r1)
            int r2 = r8.getDecoratedEnd(r0)
            int r5 = r8.getDecoratedMeasurement(r0)
            int r5 = r5 / 2
            if (r2 < r5) goto L38
            int r8 = r8.getDecoratedEnd(r0)
            if (r8 <= 0) goto L38
            return r0
        L38:
            r8 = r7
            androidx.recyclerview.widget.LinearLayoutManager r8 = (androidx.recyclerview.widget.LinearLayoutManager) r8
            int r8 = r8.findLastCompletelyVisibleItemPosition()
            int r0 = r7.getItemCount()
            int r0 = r0 - r3
            if (r8 != r0) goto L47
            return r4
        L47:
            int r1 = r1 + r3
            android.view.View r7 = r7.findViewByPosition(r1)
            return r7
        L4d:
            return r4
        L4e:
            android.view.View r7 = super.findSnapView(r7)
            return r7
    }

    private androidx.recyclerview.widget.OrientationHelper getVerticalHelper(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            androidx.recyclerview.widget.OrientationHelper r0 = r1.mVerticalHelper
            if (r0 != 0) goto La
            androidx.recyclerview.widget.OrientationHelper r2 = androidx.recyclerview.widget.OrientationHelper.createVerticalHelper(r2)
            r1.mVerticalHelper = r2
        La:
            androidx.recyclerview.widget.OrientationHelper r2 = r1.mVerticalHelper
            return r2
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView r1) throws java.lang.IllegalStateException {
            r0 = this;
            super.attachToRecyclerView(r1)
            return
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.LayoutManager r5, @androidx.annotation.NonNull android.view.View r6) {
            r4 = this;
            r0 = 2
            int[] r0 = new int[r0]
            boolean r1 = r5.canScrollHorizontally()
            r2 = 0
            if (r1 == 0) goto L15
            androidx.recyclerview.widget.OrientationHelper r1 = r4.getHorizontalHelper(r5)
            int r1 = r4.distanceToStart(r6, r1)
            r0[r2] = r1
            goto L17
        L15:
            r0[r2] = r2
        L17:
            boolean r1 = r5.canScrollVertically()
            r3 = 1
            if (r1 == 0) goto L29
            androidx.recyclerview.widget.OrientationHelper r5 = r4.getVerticalHelper(r5)
            int r5 = r4.distanceToStart(r6, r5)
            r0[r3] = r5
            goto L2b
        L29:
            r0[r3] = r2
        L2b:
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L1c
            boolean r0 = r2.canScrollHorizontally()
            if (r0 == 0) goto L13
            androidx.recyclerview.widget.OrientationHelper r0 = r1.getHorizontalHelper(r2)
            android.view.View r2 = r1.getStartView(r2, r0)
            return r2
        L13:
            androidx.recyclerview.widget.OrientationHelper r0 = r1.getVerticalHelper(r2)
            android.view.View r2 = r1.getStartView(r2, r0)
            return r2
        L1c:
            android.view.View r2 = super.findSnapView(r2)
            return r2
    }
}
