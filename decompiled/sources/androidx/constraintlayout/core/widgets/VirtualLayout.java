package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes3.dex */
public class VirtualLayout extends androidx.constraintlayout.core.widgets.HelperWidget {
    public androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure mMeasure;
    private int mMeasuredHeight;
    private int mMeasuredWidth;
    public androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer mMeasurer;
    private boolean mNeedsCallFromSolver;
    private int mPaddingBottom;
    private int mPaddingEnd;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingStart;
    private int mPaddingTop;
    private int mResolvedPaddingLeft;
    private int mResolvedPaddingRight;

    public VirtualLayout() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mPaddingTop = r0
            r1.mPaddingBottom = r0
            r1.mPaddingLeft = r0
            r1.mPaddingRight = r0
            r1.mPaddingStart = r0
            r1.mPaddingEnd = r0
            r1.mResolvedPaddingLeft = r0
            r1.mResolvedPaddingRight = r0
            r1.mNeedsCallFromSolver = r0
            r1.mMeasuredWidth = r0
            r1.mMeasuredHeight = r0
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            r1.mMeasure = r0
            r0 = 0
            r1.mMeasurer = r0
            return
    }

    public void applyRtl(boolean r3) {
            r2 = this;
            int r0 = r2.mPaddingStart
            if (r0 > 0) goto L8
            int r1 = r2.mPaddingEnd
            if (r1 <= 0) goto L17
        L8:
            if (r3 == 0) goto L11
            int r3 = r2.mPaddingEnd
            r2.mResolvedPaddingLeft = r3
            r2.mResolvedPaddingRight = r0
            goto L17
        L11:
            r2.mResolvedPaddingLeft = r0
            int r3 = r2.mPaddingEnd
            r2.mResolvedPaddingRight = r3
        L17:
            return
    }

    public void captureWidgets() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.mWidgetsCount
            if (r0 >= r1) goto L12
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r3.mWidgets
            r1 = r1[r0]
            if (r1 == 0) goto Lf
            r2 = 1
            r1.setInVirtualLayout(r2)
        Lf:
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    public boolean contains(java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.mWidgetsCount
            if (r1 >= r2) goto L15
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r3.mWidgets
            r2 = r2[r1]
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L12
            r4 = 1
            return r4
        L12:
            int r1 = r1 + 1
            goto L2
        L15:
            return r0
    }

    public int getMeasuredHeight() {
            r1 = this;
            int r0 = r1.mMeasuredHeight
            return r0
    }

    public int getMeasuredWidth() {
            r1 = this;
            int r0 = r1.mMeasuredWidth
            return r0
    }

    public int getPaddingBottom() {
            r1 = this;
            int r0 = r1.mPaddingBottom
            return r0
    }

    public int getPaddingLeft() {
            r1 = this;
            int r0 = r1.mResolvedPaddingLeft
            return r0
    }

    public int getPaddingRight() {
            r1 = this;
            int r0 = r1.mResolvedPaddingRight
            return r0
    }

    public int getPaddingTop() {
            r1 = this;
            int r0 = r1.mPaddingTop
            return r0
    }

    public void measure(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public final void measure(androidx.constraintlayout.core.widgets.ConstraintWidget r2, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r3, int r4, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r5, int r6) {
            r1 = this;
        L0:
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r1.mMeasurer
            if (r0 != 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.getParent()
            if (r0 == 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r0.getMeasurer()
            r1.mMeasurer = r0
            goto L0
        L17:
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r1.mMeasure
            r0.horizontalBehavior = r3
            r0.verticalBehavior = r5
            r0.horizontalDimension = r4
            r0.verticalDimension = r6
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r3 = r1.mMeasurer
            r3.measure(r2, r0)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredWidth
            r2.setWidth(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredHeight
            r2.setHeight(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            boolean r3 = r3.measuredHasBaseline
            r2.setHasBaseline(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredBaseline
            r2.setBaselineDistance(r3)
            return
    }

    public boolean needSolverPass() {
            r1 = this;
            boolean r0 = r1.mNeedsCallFromSolver
            return r0
    }

    public final void needsCallbackFromSolver(boolean r1) {
            r0 = this;
            r0.mNeedsCallFromSolver = r1
            return
    }

    public void setMeasure(int r1, int r2) {
            r0 = this;
            r0.mMeasuredWidth = r1
            r0.mMeasuredHeight = r2
            return
    }

    public void setPadding(int r1) {
            r0 = this;
            r0.mPaddingLeft = r1
            r0.mPaddingTop = r1
            r0.mPaddingRight = r1
            r0.mPaddingBottom = r1
            r0.mPaddingStart = r1
            r0.mPaddingEnd = r1
            return
    }

    public void setPaddingBottom(int r1) {
            r0 = this;
            r0.mPaddingBottom = r1
            return
    }

    public void setPaddingEnd(int r1) {
            r0 = this;
            r0.mPaddingEnd = r1
            return
    }

    public void setPaddingLeft(int r1) {
            r0 = this;
            r0.mPaddingLeft = r1
            r0.mResolvedPaddingLeft = r1
            return
    }

    public void setPaddingRight(int r1) {
            r0 = this;
            r0.mPaddingRight = r1
            r0.mResolvedPaddingRight = r1
            return
    }

    public void setPaddingStart(int r1) {
            r0 = this;
            r0.mPaddingStart = r1
            r0.mResolvedPaddingLeft = r1
            r0.mResolvedPaddingRight = r1
            return
    }

    public void setPaddingTop(int r1) {
            r0 = this;
            r0.mPaddingTop = r1
            return
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1) {
            r0 = this;
            r0.captureWidgets()
            return
    }
}
