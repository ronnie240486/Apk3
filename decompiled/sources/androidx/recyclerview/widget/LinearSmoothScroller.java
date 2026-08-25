package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class LinearSmoothScroller extends androidx.recyclerview.widget.RecyclerView.SmoothScroller {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    public final android.view.animation.DecelerateInterpolator mDecelerateInterpolator;
    private final android.util.DisplayMetrics mDisplayMetrics;
    private boolean mHasCalculatedMillisPerPixel;
    public int mInterimTargetDx;
    public int mInterimTargetDy;
    public final android.view.animation.LinearInterpolator mLinearInterpolator;
    private float mMillisPerPixel;
    public android.graphics.PointF mTargetVector;

    public LinearSmoothScroller(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r1.mLinearInterpolator = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.mDecelerateInterpolator = r0
            r0 = 0
            r1.mHasCalculatedMillisPerPixel = r0
            r1.mInterimTargetDx = r0
            r1.mInterimTargetDy = r0
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r1.mDisplayMetrics = r2
            return
    }

    private int clampApplyScroll(int r1, int r2) {
            r0 = this;
            int r2 = r1 - r2
            int r1 = r1 * r2
            if (r1 > 0) goto L8
            r1 = 0
            return r1
        L8:
            return r2
    }

    private float getSpeedPerPixel() {
            r1 = this;
            boolean r0 = r1.mHasCalculatedMillisPerPixel
            if (r0 != 0) goto Lf
            android.util.DisplayMetrics r0 = r1.mDisplayMetrics
            float r0 = r1.calculateSpeedPerPixel(r0)
            r1.mMillisPerPixel = r0
            r0 = 1
            r1.mHasCalculatedMillisPerPixel = r0
        Lf:
            float r0 = r1.mMillisPerPixel
            return r0
    }

    public int calculateDtToFit(int r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = -1
            if (r6 == r0) goto L1d
            if (r6 == 0) goto L13
            r2 = 1
            if (r6 != r2) goto La
            int r5 = r5 - r3
            return r5
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"
            r2.<init>(r3)
            throw r2
        L13:
            int r4 = r4 - r2
            if (r4 <= 0) goto L17
            return r4
        L17:
            int r5 = r5 - r3
            if (r5 >= 0) goto L1b
            return r5
        L1b:
            r2 = 0
            return r2
        L1d:
            int r4 = r4 - r2
            return r4
    }

    public int calculateDxToMakeVisible(android.view.View r11, int r12) {
            r10 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r10.getLayoutManager()
            if (r0 == 0) goto L38
            boolean r1 = r0.canScrollHorizontally()
            if (r1 != 0) goto Ld
            goto L38
        Ld:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            int r2 = r0.getDecoratedLeft(r11)
            int r3 = r1.leftMargin
            int r5 = r2 - r3
            int r11 = r0.getDecoratedRight(r11)
            int r1 = r1.rightMargin
            int r6 = r11 + r1
            int r7 = r0.getPaddingLeft()
            int r11 = r0.getWidth()
            int r0 = r0.getPaddingRight()
            int r8 = r11 - r0
            r4 = r10
            r9 = r12
            int r11 = r4.calculateDtToFit(r5, r6, r7, r8, r9)
            return r11
        L38:
            r11 = 0
            return r11
    }

    public int calculateDyToMakeVisible(android.view.View r11, int r12) {
            r10 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r10.getLayoutManager()
            if (r0 == 0) goto L38
            boolean r1 = r0.canScrollVertically()
            if (r1 != 0) goto Ld
            goto L38
        Ld:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            int r2 = r0.getDecoratedTop(r11)
            int r3 = r1.topMargin
            int r5 = r2 - r3
            int r11 = r0.getDecoratedBottom(r11)
            int r1 = r1.bottomMargin
            int r6 = r11 + r1
            int r7 = r0.getPaddingTop()
            int r11 = r0.getHeight()
            int r0 = r0.getPaddingBottom()
            int r8 = r11 - r0
            r4 = r10
            r9 = r12
            int r11 = r4.calculateDtToFit(r5, r6, r7, r8, r9)
            return r11
        L38:
            r11 = 0
            return r11
    }

    public float calculateSpeedPerPixel(android.util.DisplayMetrics r2) {
            r1 = this;
            int r2 = r2.densityDpi
            float r2 = (float) r2
            r0 = 1103626240(0x41c80000, float:25.0)
            float r0 = r0 / r2
            return r0
    }

    public final int calculateTimeForDeceleration(int r5) {
            r4 = this;
            int r5 = r4.calculateTimeForScrolling(r5)
            double r0 = (double) r5
            r2 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)
            int r5 = (int) r0
            return r5
    }

    public int calculateTimeForScrolling(int r3) {
            r2 = this;
            int r3 = java.lang.Math.abs(r3)
            float r3 = (float) r3
            float r0 = r2.getSpeedPerPixel()
            float r3 = r3 * r0
            double r0 = (double) r3
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public final void onSeekTargetStep(int r2, int r3, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r4) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 != 0) goto La
            r1.stop()
            return
        La:
            int r0 = r1.mInterimTargetDx
            int r2 = r1.clampApplyScroll(r0, r2)
            r1.mInterimTargetDx = r2
            int r2 = r1.mInterimTargetDy
            int r2 = r1.clampApplyScroll(r2, r3)
            r1.mInterimTargetDy = r2
            int r3 = r1.mInterimTargetDx
            if (r3 != 0) goto L23
            if (r2 != 0) goto L23
            r1.updateActionForInterimTarget(r4)
        L23:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public final void onStart() {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStop() {
            r1 = this;
            r0 = 0
            r1.mInterimTargetDy = r0
            r1.mInterimTargetDx = r0
            r0 = 0
            r1.mTargetVector = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onTargetFound(android.view.View r7, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r8) {
            r6 = this;
            android.graphics.PointF r0 = r6.mTargetVector
            r1 = -1
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = 1
            goto L16
        L13:
            r0 = -1
            goto L16
        L15:
            r0 = 0
        L16:
            int r0 = r6.calculateDxToMakeVisible(r7, r0)
            android.graphics.PointF r5 = r6.mTargetVector
            if (r5 == 0) goto L29
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L29
        L25:
            if (r4 <= 0) goto L2a
            r1 = 1
            goto L2a
        L29:
            r1 = 0
        L2a:
            int r7 = r6.calculateDyToMakeVisible(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.calculateTimeForDeceleration(r1)
            if (r1 <= 0) goto L46
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r2 = r6.mDecelerateInterpolator
            r8.update(r0, r7, r1, r2)
        L46:
            return
    }

    public void updateActionForInterimTarget(androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r5) {
            r4 = this;
            int r0 = r4.getTargetPosition()
            android.graphics.PointF r0 = r4.computeScrollVectorForPosition(r0)
            if (r0 == 0) goto L5d
            float r1 = r0.x
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 != 0) goto L18
            float r3 = r0.y
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L18
            goto L5d
        L18:
            float r1 = r1 * r1
            float r2 = r0.y
            float r2 = r2 * r2
            float r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r2 = r0.x
            float r2 = r2 / r1
            r0.x = r2
            float r3 = r0.y
            float r3 = r3 / r1
            r0.y = r3
            r4.mTargetVector = r0
            r0 = 1176256512(0x461c4000, float:10000.0)
            float r2 = r2 * r0
            int r1 = (int) r2
            r4.mInterimTargetDx = r1
            float r3 = r3 * r0
            int r0 = (int) r3
            r4.mInterimTargetDy = r0
            r0 = 10000(0x2710, float:1.4013E-41)
            int r0 = r4.calculateTimeForScrolling(r0)
            int r1 = r4.mInterimTargetDx
            float r1 = (float) r1
            r2 = 1067030938(0x3f99999a, float:1.2)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r3 = r4.mInterimTargetDy
            float r3 = (float) r3
            float r3 = r3 * r2
            int r3 = (int) r3
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = (int) r0
            android.view.animation.LinearInterpolator r2 = r4.mLinearInterpolator
            r5.update(r1, r3, r0, r2)
            return
        L5d:
            int r0 = r4.getTargetPosition()
            r5.jumpTo(r0)
            r4.stop()
            return
    }
}
