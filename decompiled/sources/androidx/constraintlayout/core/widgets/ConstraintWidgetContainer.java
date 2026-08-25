package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidgetContainer extends androidx.constraintlayout.core.widgets.WidgetContainer {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_LAYOUT = false;
    private static final int MAX_ITERATIONS = 8;
    private java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> horizontalWrapMax;
    private java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> horizontalWrapMin;
    public androidx.constraintlayout.core.widgets.analyzer.BasicMeasure mBasicMeasureSolver;
    public androidx.constraintlayout.core.widgets.analyzer.DependencyGraph mDependencyGraph;
    public boolean mGroupsWrapOptimized;
    private boolean mHeightMeasuredTooSmall;
    public androidx.constraintlayout.core.widgets.ChainHead[] mHorizontalChainsArray;
    public int mHorizontalChainsSize;
    public boolean mHorizontalWrapOptimized;
    private boolean mIsRtl;
    public androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure mMeasure;
    public androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer mMeasurer;
    public androidx.constraintlayout.core.Metrics mMetrics;
    private int mOptimizationLevel;
    public int mPaddingLeft;
    public int mPaddingTop;
    public boolean mSkipSolver;
    public androidx.constraintlayout.core.LinearSystem mSystem;
    public androidx.constraintlayout.core.widgets.ChainHead[] mVerticalChainsArray;
    public int mVerticalChainsSize;
    public boolean mVerticalWrapOptimized;
    private boolean mWidthMeasuredTooSmall;
    public int mWrapFixedHeight;
    public int mWrapFixedWidth;
    private int pass;
    private java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> verticalWrapMax;
    private java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> verticalWrapMin;
    public java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> widgetsToAdd;

    public ConstraintWidgetContainer() {
            r4 = this;
            r4.<init>()
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure r0 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure
            r0.<init>(r4)
            r4.mBasicMeasureSolver = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyGraph r0 = new androidx.constraintlayout.core.widgets.analyzer.DependencyGraph
            r0.<init>(r4)
            r4.mDependencyGraph = r0
            r0 = 0
            r4.mMeasurer = r0
            r1 = 0
            r4.mIsRtl = r1
            androidx.constraintlayout.core.LinearSystem r2 = new androidx.constraintlayout.core.LinearSystem
            r2.<init>()
            r4.mSystem = r2
            r4.mHorizontalChainsSize = r1
            r4.mVerticalChainsSize = r1
            r2 = 4
            androidx.constraintlayout.core.widgets.ChainHead[] r3 = new androidx.constraintlayout.core.widgets.ChainHead[r2]
            r4.mVerticalChainsArray = r3
            androidx.constraintlayout.core.widgets.ChainHead[] r2 = new androidx.constraintlayout.core.widgets.ChainHead[r2]
            r4.mHorizontalChainsArray = r2
            r4.mGroupsWrapOptimized = r1
            r4.mHorizontalWrapOptimized = r1
            r4.mVerticalWrapOptimized = r1
            r4.mWrapFixedWidth = r1
            r4.mWrapFixedHeight = r1
            r2 = 257(0x101, float:3.6E-43)
            r4.mOptimizationLevel = r2
            r4.mSkipSolver = r1
            r4.mWidthMeasuredTooSmall = r1
            r4.mHeightMeasuredTooSmall = r1
            r4.verticalWrapMin = r0
            r4.horizontalWrapMin = r0
            r4.verticalWrapMax = r0
            r4.horizontalWrapMax = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.widgetsToAdd = r0
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            r4.mMeasure = r0
            return
    }

    public ConstraintWidgetContainer(int r3, int r4) {
            r2 = this;
            r2.<init>(r3, r4)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure r3 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure
            r3.<init>(r2)
            r2.mBasicMeasureSolver = r3
            androidx.constraintlayout.core.widgets.analyzer.DependencyGraph r3 = new androidx.constraintlayout.core.widgets.analyzer.DependencyGraph
            r3.<init>(r2)
            r2.mDependencyGraph = r3
            r3 = 0
            r2.mMeasurer = r3
            r4 = 0
            r2.mIsRtl = r4
            androidx.constraintlayout.core.LinearSystem r0 = new androidx.constraintlayout.core.LinearSystem
            r0.<init>()
            r2.mSystem = r0
            r2.mHorizontalChainsSize = r4
            r2.mVerticalChainsSize = r4
            r0 = 4
            androidx.constraintlayout.core.widgets.ChainHead[] r1 = new androidx.constraintlayout.core.widgets.ChainHead[r0]
            r2.mVerticalChainsArray = r1
            androidx.constraintlayout.core.widgets.ChainHead[] r0 = new androidx.constraintlayout.core.widgets.ChainHead[r0]
            r2.mHorizontalChainsArray = r0
            r2.mGroupsWrapOptimized = r4
            r2.mHorizontalWrapOptimized = r4
            r2.mVerticalWrapOptimized = r4
            r2.mWrapFixedWidth = r4
            r2.mWrapFixedHeight = r4
            r0 = 257(0x101, float:3.6E-43)
            r2.mOptimizationLevel = r0
            r2.mSkipSolver = r4
            r2.mWidthMeasuredTooSmall = r4
            r2.mHeightMeasuredTooSmall = r4
            r2.verticalWrapMin = r3
            r2.horizontalWrapMin = r3
            r2.verticalWrapMax = r3
            r2.horizontalWrapMax = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.widgetsToAdd = r3
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r3.<init>()
            r2.mMeasure = r3
            return
    }

    public ConstraintWidgetContainer(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure r1 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure
            r1.<init>(r0)
            r0.mBasicMeasureSolver = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyGraph r1 = new androidx.constraintlayout.core.widgets.analyzer.DependencyGraph
            r1.<init>(r0)
            r0.mDependencyGraph = r1
            r1 = 0
            r0.mMeasurer = r1
            r2 = 0
            r0.mIsRtl = r2
            androidx.constraintlayout.core.LinearSystem r3 = new androidx.constraintlayout.core.LinearSystem
            r3.<init>()
            r0.mSystem = r3
            r0.mHorizontalChainsSize = r2
            r0.mVerticalChainsSize = r2
            r3 = 4
            androidx.constraintlayout.core.widgets.ChainHead[] r4 = new androidx.constraintlayout.core.widgets.ChainHead[r3]
            r0.mVerticalChainsArray = r4
            androidx.constraintlayout.core.widgets.ChainHead[] r3 = new androidx.constraintlayout.core.widgets.ChainHead[r3]
            r0.mHorizontalChainsArray = r3
            r0.mGroupsWrapOptimized = r2
            r0.mHorizontalWrapOptimized = r2
            r0.mVerticalWrapOptimized = r2
            r0.mWrapFixedWidth = r2
            r0.mWrapFixedHeight = r2
            r3 = 257(0x101, float:3.6E-43)
            r0.mOptimizationLevel = r3
            r0.mSkipSolver = r2
            r0.mWidthMeasuredTooSmall = r2
            r0.mHeightMeasuredTooSmall = r2
            r0.verticalWrapMin = r1
            r0.horizontalWrapMin = r1
            r0.verticalWrapMax = r1
            r0.horizontalWrapMax = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.widgetsToAdd = r1
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r1 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r1.<init>()
            r0.mMeasure = r1
            return
    }

    public ConstraintWidgetContainer(java.lang.String r3, int r4, int r5) {
            r2 = this;
            r2.<init>(r4, r5)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure r4 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure
            r4.<init>(r2)
            r2.mBasicMeasureSolver = r4
            androidx.constraintlayout.core.widgets.analyzer.DependencyGraph r4 = new androidx.constraintlayout.core.widgets.analyzer.DependencyGraph
            r4.<init>(r2)
            r2.mDependencyGraph = r4
            r4 = 0
            r2.mMeasurer = r4
            r5 = 0
            r2.mIsRtl = r5
            androidx.constraintlayout.core.LinearSystem r0 = new androidx.constraintlayout.core.LinearSystem
            r0.<init>()
            r2.mSystem = r0
            r2.mHorizontalChainsSize = r5
            r2.mVerticalChainsSize = r5
            r0 = 4
            androidx.constraintlayout.core.widgets.ChainHead[] r1 = new androidx.constraintlayout.core.widgets.ChainHead[r0]
            r2.mVerticalChainsArray = r1
            androidx.constraintlayout.core.widgets.ChainHead[] r0 = new androidx.constraintlayout.core.widgets.ChainHead[r0]
            r2.mHorizontalChainsArray = r0
            r2.mGroupsWrapOptimized = r5
            r2.mHorizontalWrapOptimized = r5
            r2.mVerticalWrapOptimized = r5
            r2.mWrapFixedWidth = r5
            r2.mWrapFixedHeight = r5
            r0 = 257(0x101, float:3.6E-43)
            r2.mOptimizationLevel = r0
            r2.mSkipSolver = r5
            r2.mWidthMeasuredTooSmall = r5
            r2.mHeightMeasuredTooSmall = r5
            r2.verticalWrapMin = r4
            r2.horizontalWrapMin = r4
            r2.verticalWrapMax = r4
            r2.horizontalWrapMax = r4
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r2.widgetsToAdd = r4
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r4.<init>()
            r2.mMeasure = r4
            r2.setDebugName(r3)
            return
    }

    private void addHorizontalChain(androidx.constraintlayout.core.widgets.ConstraintWidget r6) {
            r5 = this;
            int r0 = r5.mHorizontalChainsSize
            int r0 = r0 + 1
            androidx.constraintlayout.core.widgets.ChainHead[] r1 = r5.mHorizontalChainsArray
            int r2 = r1.length
            if (r0 < r2) goto L14
            int r0 = r1.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            androidx.constraintlayout.core.widgets.ChainHead[] r0 = (androidx.constraintlayout.core.widgets.ChainHead[]) r0
            r5.mHorizontalChainsArray = r0
        L14:
            androidx.constraintlayout.core.widgets.ChainHead[] r0 = r5.mHorizontalChainsArray
            int r1 = r5.mHorizontalChainsSize
            androidx.constraintlayout.core.widgets.ChainHead r2 = new androidx.constraintlayout.core.widgets.ChainHead
            r3 = 0
            boolean r4 = r5.isRtl()
            r2.<init>(r6, r3, r4)
            r0[r1] = r2
            int r6 = r5.mHorizontalChainsSize
            int r6 = r6 + 1
            r5.mHorizontalChainsSize = r6
            return
    }

    private void addMaxWrap(androidx.constraintlayout.core.widgets.ConstraintAnchor r4, androidx.constraintlayout.core.SolverVariable r5) {
            r3 = this;
            androidx.constraintlayout.core.LinearSystem r0 = r3.mSystem
            androidx.constraintlayout.core.SolverVariable r4 = r0.createObjectVariable(r4)
            androidx.constraintlayout.core.LinearSystem r0 = r3.mSystem
            r1 = 0
            r2 = 5
            r0.addGreaterThan(r5, r4, r1, r2)
            return
    }

    private void addMinWrap(androidx.constraintlayout.core.widgets.ConstraintAnchor r4, androidx.constraintlayout.core.SolverVariable r5) {
            r3 = this;
            androidx.constraintlayout.core.LinearSystem r0 = r3.mSystem
            androidx.constraintlayout.core.SolverVariable r4 = r0.createObjectVariable(r4)
            androidx.constraintlayout.core.LinearSystem r0 = r3.mSystem
            r1 = 0
            r2 = 5
            r0.addGreaterThan(r4, r5, r1, r2)
            return
    }

    private void addVerticalChain(androidx.constraintlayout.core.widgets.ConstraintWidget r6) {
            r5 = this;
            int r0 = r5.mVerticalChainsSize
            r1 = 1
            int r0 = r0 + r1
            androidx.constraintlayout.core.widgets.ChainHead[] r2 = r5.mVerticalChainsArray
            int r3 = r2.length
            if (r0 < r3) goto L14
            int r0 = r2.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            androidx.constraintlayout.core.widgets.ChainHead[] r0 = (androidx.constraintlayout.core.widgets.ChainHead[]) r0
            r5.mVerticalChainsArray = r0
        L14:
            androidx.constraintlayout.core.widgets.ChainHead[] r0 = r5.mVerticalChainsArray
            int r2 = r5.mVerticalChainsSize
            androidx.constraintlayout.core.widgets.ChainHead r3 = new androidx.constraintlayout.core.widgets.ChainHead
            boolean r4 = r5.isRtl()
            r3.<init>(r6, r1, r4)
            r0[r2] = r3
            int r6 = r5.mVerticalChainsSize
            int r6 = r6 + r1
            r5.mVerticalChainsSize = r6
            return
    }

    public static boolean measure(int r5, androidx.constraintlayout.core.widgets.ConstraintWidget r6, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r7, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r8, int r9) {
            r5 = 0
            if (r7 != 0) goto L4
            return r5
        L4:
            int r0 = r6.getVisibility()
            r1 = 8
            if (r0 == r1) goto L134
            boolean r0 = r6 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r0 != 0) goto L134
            boolean r0 = r6 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r0 == 0) goto L16
            goto L134
        L16:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r6.getHorizontalDimensionBehaviour()
            r8.horizontalBehavior = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r6.getVerticalDimensionBehaviour()
            r8.verticalBehavior = r0
            int r0 = r6.getWidth()
            r8.horizontalDimension = r0
            int r0 = r6.getHeight()
            r8.verticalDimension = r0
            r8.measuredNeedsSolverPass = r5
            r8.measureStrategy = r9
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r8.horizontalBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r1 = 1
            if (r9 != r0) goto L3b
            r9 = 1
            goto L3c
        L3b:
            r9 = 0
        L3c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r8.verticalBehavior
            if (r2 != r0) goto L42
            r0 = 1
            goto L43
        L42:
            r0 = 0
        L43:
            r2 = 0
            if (r9 == 0) goto L4e
            float r3 = r6.mDimensionRatio
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 <= 0) goto L4e
            r3 = 1
            goto L4f
        L4e:
            r3 = 0
        L4f:
            if (r0 == 0) goto L59
            float r4 = r6.mDimensionRatio
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L59
            r2 = 1
            goto L5a
        L59:
            r2 = 0
        L5a:
            if (r9 == 0) goto L77
            boolean r4 = r6.hasDanglingDimension(r5)
            if (r4 == 0) goto L77
            int r4 = r6.mMatchConstraintDefaultWidth
            if (r4 != 0) goto L77
            if (r3 != 0) goto L77
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r8.horizontalBehavior = r9
            if (r0 == 0) goto L76
            int r9 = r6.mMatchConstraintDefaultHeight
            if (r9 != 0) goto L76
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8.horizontalBehavior = r9
        L76:
            r9 = 0
        L77:
            if (r0 == 0) goto L94
            boolean r4 = r6.hasDanglingDimension(r1)
            if (r4 == 0) goto L94
            int r4 = r6.mMatchConstraintDefaultHeight
            if (r4 != 0) goto L94
            if (r2 != 0) goto L94
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r8.verticalBehavior = r0
            if (r9 == 0) goto L93
            int r0 = r6.mMatchConstraintDefaultWidth
            if (r0 != 0) goto L93
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8.verticalBehavior = r0
        L93:
            r0 = 0
        L94:
            boolean r4 = r6.isResolvedHorizontally()
            if (r4 == 0) goto L9f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8.horizontalBehavior = r9
            r9 = 0
        L9f:
            boolean r4 = r6.isResolvedVertically()
            if (r4 == 0) goto Laa
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8.verticalBehavior = r0
            r0 = 0
        Laa:
            r4 = 4
            if (r3 == 0) goto Ld8
            int[] r3 = r6.mResolvedMatchConstraintDefault
            r5 = r3[r5]
            if (r5 != r4) goto Lb8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8.horizontalBehavior = r5
            goto Ld8
        Lb8:
            if (r0 != 0) goto Ld8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = r8.verticalBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r0) goto Lc3
            int r5 = r8.verticalDimension
            goto Lcc
        Lc3:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r8.horizontalBehavior = r5
            r7.measure(r6, r8)
            int r5 = r8.measuredHeight
        Lcc:
            r8.horizontalBehavior = r0
            float r0 = r6.getDimensionRatio()
            float r5 = (float) r5
            float r0 = r0 * r5
            int r5 = (int) r0
            r8.horizontalDimension = r5
        Ld8:
            if (r2 == 0) goto L116
            int[] r5 = r6.mResolvedMatchConstraintDefault
            r5 = r5[r1]
            if (r5 != r4) goto Le5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8.verticalBehavior = r5
            goto L116
        Le5:
            if (r9 != 0) goto L116
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = r8.horizontalBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r9) goto Lf0
            int r5 = r8.horizontalDimension
            goto Lf9
        Lf0:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r8.verticalBehavior = r5
            r7.measure(r6, r8)
            int r5 = r8.measuredWidth
        Lf9:
            r8.verticalBehavior = r9
            int r9 = r6.getDimensionRatioSide()
            r0 = -1
            if (r9 != r0) goto L10c
            float r5 = (float) r5
            float r9 = r6.getDimensionRatio()
            float r5 = r5 / r9
            int r5 = (int) r5
            r8.verticalDimension = r5
            goto L116
        L10c:
            float r9 = r6.getDimensionRatio()
            float r5 = (float) r5
            float r9 = r9 * r5
            int r5 = (int) r9
            r8.verticalDimension = r5
        L116:
            r7.measure(r6, r8)
            int r5 = r8.measuredWidth
            r6.setWidth(r5)
            int r5 = r8.measuredHeight
            r6.setHeight(r5)
            boolean r5 = r8.measuredHasBaseline
            r6.setHasBaseline(r5)
            int r5 = r8.measuredBaseline
            r6.setBaselineDistance(r5)
            int r5 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r8.measureStrategy = r5
            boolean r5 = r8.measuredNeedsSolverPass
            return r5
        L134:
            r8.measuredWidth = r5
            r8.measuredHeight = r5
            return r5
    }

    private void resetChains() {
            r1 = this;
            r0 = 0
            r1.mHorizontalChainsSize = r0
            r1.mVerticalChainsSize = r0
            return
    }

    public final void addChain(androidx.constraintlayout.core.widgets.ConstraintWidget r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L6
            r1.addHorizontalChain(r2)
            goto Lc
        L6:
            r0 = 1
            if (r3 != r0) goto Lc
            r1.addVerticalChain(r2)
        Lc:
            return
    }

    public boolean addChildrenToSolver(androidx.constraintlayout.core.LinearSystem r13) {
            r12 = this;
            r0 = 64
            boolean r0 = r12.optimizeFor(r0)
            r12.addToSolver(r13, r0)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r12.mChildren
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r4 = 0
        L12:
            r5 = 1
            if (r3 >= r1) goto L2b
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r12.mChildren
            java.lang.Object r6 = r6.get(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
            r6.setInBarrier(r2, r2)
            r6.setInBarrier(r5, r2)
            boolean r6 = r6 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r6 == 0) goto L28
            r4 = 1
        L28:
            int r3 = r3 + 1
            goto L12
        L2b:
            if (r4 == 0) goto L44
            r3 = 0
        L2e:
            if (r3 >= r1) goto L44
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r4 = r12.mChildren
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r4
            boolean r6 = r4 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r6 == 0) goto L41
            androidx.constraintlayout.core.widgets.Barrier r4 = (androidx.constraintlayout.core.widgets.Barrier) r4
            r4.markWidgets()
        L41:
            int r3 = r3 + 1
            goto L2e
        L44:
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r12.widgetsToAdd
            r3.clear()
            r3 = 0
        L4a:
            if (r3 >= r1) goto L6a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r4 = r12.mChildren
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r4
            boolean r6 = r4.addFirst()
            if (r6 == 0) goto L67
            boolean r6 = r4 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r6 == 0) goto L64
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r12.widgetsToAdd
            r6.add(r4)
            goto L67
        L64:
            r4.addToSolver(r13, r0)
        L67:
            int r3 = r3 + 1
            goto L4a
        L6a:
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r12.widgetsToAdd
            int r3 = r3.size()
            if (r3 <= 0) goto Lc0
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r12.widgetsToAdd
            int r3 = r3.size()
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r4 = r12.widgetsToAdd
            java.util.Iterator r4 = r4.iterator()
        L7e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L9c
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
            androidx.constraintlayout.core.widgets.VirtualLayout r6 = (androidx.constraintlayout.core.widgets.VirtualLayout) r6
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r7 = r12.widgetsToAdd
            boolean r7 = r6.contains(r7)
            if (r7 == 0) goto L7e
            r6.addToSolver(r13, r0)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r4 = r12.widgetsToAdd
            r4.remove(r6)
        L9c:
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r4 = r12.widgetsToAdd
            int r4 = r4.size()
            if (r3 != r4) goto L6a
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r12.widgetsToAdd
            java.util.Iterator r3 = r3.iterator()
        Laa:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lba
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r4
            r4.addToSolver(r13, r0)
            goto Laa
        Lba:
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r12.widgetsToAdd
            r3.clear()
            goto L6a
        Lc0:
            boolean r3 = androidx.constraintlayout.core.LinearSystem.USE_DEPENDENCY_ORDERING
            if (r3 == 0) goto L10a
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4 = 0
        Lca:
            if (r4 >= r1) goto Le0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r12.mChildren
            java.lang.Object r6 = r6.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
            boolean r7 = r6.addFirst()
            if (r7 != 0) goto Ldd
            r3.add(r6)
        Ldd:
            int r4 = r4 + 1
            goto Lca
        Le0:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r12.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r4) goto Lea
            r10 = 0
            goto Leb
        Lea:
            r10 = 1
        Leb:
            r11 = 0
            r6 = r12
            r7 = r12
            r8 = r13
            r9 = r3
            r6.addChildrenToSolverByDependency(r7, r8, r9, r10, r11)
            java.util.Iterator r1 = r3.iterator()
        Lf7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L14c
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            androidx.constraintlayout.core.widgets.Optimizer.checkMatchParent(r12, r13, r3)
            r3.addToSolver(r13, r0)
            goto Lf7
        L10a:
            r3 = 0
        L10b:
            if (r3 >= r1) goto L14c
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r4 = r12.mChildren
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r4
            boolean r6 = r4 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r6 == 0) goto L13d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r4.mListDimensionBehaviors
            r7 = r6[r2]
            r6 = r6[r5]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 != r8) goto L128
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4.setHorizontalDimensionBehaviour(r9)
        L128:
            if (r6 != r8) goto L12f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4.setVerticalDimensionBehaviour(r9)
        L12f:
            r4.addToSolver(r13, r0)
            if (r7 != r8) goto L137
            r4.setHorizontalDimensionBehaviour(r7)
        L137:
            if (r6 != r8) goto L149
            r4.setVerticalDimensionBehaviour(r6)
            goto L149
        L13d:
            androidx.constraintlayout.core.widgets.Optimizer.checkMatchParent(r12, r13, r4)
            boolean r6 = r4.addFirst()
            if (r6 != 0) goto L149
            r4.addToSolver(r13, r0)
        L149:
            int r3 = r3 + 1
            goto L10b
        L14c:
            int r0 = r12.mHorizontalChainsSize
            r1 = 0
            if (r0 <= 0) goto L154
            androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(r12, r13, r1, r2)
        L154:
            int r0 = r12.mVerticalChainsSize
            if (r0 <= 0) goto L15b
            androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(r12, r13, r1, r5)
        L15b:
            return r5
    }

    public void addHorizontalWrapMaxVariable(androidx.constraintlayout.core.widgets.ConstraintAnchor r3) {
            r2 = this;
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.horizontalWrapMax
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1c
            int r0 = r3.getFinalValue()
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r1 = r2.horizontalWrapMax
            java.lang.Object r1 = r1.get()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r1
            int r1 = r1.getFinalValue()
            if (r0 <= r1) goto L23
        L1c:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.horizontalWrapMax = r0
        L23:
            return
    }

    public void addHorizontalWrapMinVariable(androidx.constraintlayout.core.widgets.ConstraintAnchor r3) {
            r2 = this;
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.horizontalWrapMin
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1c
            int r0 = r3.getFinalValue()
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r1 = r2.horizontalWrapMin
            java.lang.Object r1 = r1.get()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r1
            int r1 = r1.getFinalValue()
            if (r0 <= r1) goto L23
        L1c:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.horizontalWrapMin = r0
        L23:
            return
    }

    public final void addVerticalWrapMaxVariable(androidx.constraintlayout.core.widgets.ConstraintAnchor r3) {
            r2 = this;
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.verticalWrapMax
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1c
            int r0 = r3.getFinalValue()
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r1 = r2.verticalWrapMax
            java.lang.Object r1 = r1.get()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r1
            int r1 = r1.getFinalValue()
            if (r0 <= r1) goto L23
        L1c:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.verticalWrapMax = r0
        L23:
            return
    }

    public final void addVerticalWrapMinVariable(androidx.constraintlayout.core.widgets.ConstraintAnchor r3) {
            r2 = this;
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.verticalWrapMin
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1c
            int r0 = r3.getFinalValue()
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r1 = r2.verticalWrapMin
            java.lang.Object r1 = r1.get()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r1
            int r1 = r1.getFinalValue()
            if (r0 <= r1) goto L23
        L1c:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.verticalWrapMin = r0
        L23:
            return
    }

    public void defineTerminalWidgets() {
            r3 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyGraph r0 = r3.mDependencyGraph
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r3.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r3.getVerticalDimensionBehaviour()
            r0.defineTerminalWidgets(r1, r2)
            return
    }

    public boolean directMeasure(boolean r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyGraph r0 = r1.mDependencyGraph
            boolean r2 = r0.directMeasure(r2)
            return r2
    }

    public boolean directMeasureSetup(boolean r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyGraph r0 = r1.mDependencyGraph
            boolean r2 = r0.directMeasureSetup(r2)
            return r2
    }

    public boolean directMeasureWithOrientation(boolean r2, int r3) {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyGraph r0 = r1.mDependencyGraph
            boolean r2 = r0.directMeasureWithOrientation(r2, r3)
            return r2
    }

    public void fillMetrics(androidx.constraintlayout.core.Metrics r2) {
            r1 = this;
            r1.mMetrics = r2
            androidx.constraintlayout.core.LinearSystem r0 = r1.mSystem
            r0.fillMetrics(r2)
            return
    }

    public java.util.ArrayList<androidx.constraintlayout.core.widgets.Guideline> getHorizontalGuidelines() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r5.mChildren
            int r1 = r1.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L28
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r5.mChildren
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r4 == 0) goto L25
            androidx.constraintlayout.core.widgets.Guideline r3 = (androidx.constraintlayout.core.widgets.Guideline) r3
            int r4 = r3.getOrientation()
            if (r4 != 0) goto L25
            r0.add(r3)
        L25:
            int r2 = r2 + 1
            goto Lc
        L28:
            return r0
    }

    public androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer getMeasurer() {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r1.mMeasurer
            return r0
    }

    public int getOptimizationLevel() {
            r1 = this;
            int r0 = r1.mOptimizationLevel
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void getSceneString(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.stringId
            r0.append(r1)
            java.lang.String r1 = ":{\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "  actualWidth:"
            r0.append(r1)
            int r1 = r3.mWidth
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = "\n"
            r4.append(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "  actualHeight:"
            r1.append(r2)
            int r2 = r3.mHeight
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.append(r1)
            r4.append(r0)
            java.util.ArrayList r0 = r3.getChildren()
            java.util.Iterator r0 = r0.iterator()
        L52:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
            r1.getSceneString(r4)
            java.lang.String r1 = ",\n"
            r4.append(r1)
            goto L52
        L67:
            java.lang.String r0 = "}"
            r4.append(r0)
            return
    }

    public androidx.constraintlayout.core.LinearSystem getSystem() {
            r1 = this;
            androidx.constraintlayout.core.LinearSystem r0 = r1.mSystem
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "ConstraintLayout"
            return r0
    }

    public java.util.ArrayList<androidx.constraintlayout.core.widgets.Guideline> getVerticalGuidelines() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r6.mChildren
            int r1 = r1.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L29
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r6.mChildren
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r4 == 0) goto L26
            androidx.constraintlayout.core.widgets.Guideline r3 = (androidx.constraintlayout.core.widgets.Guideline) r3
            int r4 = r3.getOrientation()
            r5 = 1
            if (r4 != r5) goto L26
            r0.add(r3)
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            return r0
    }

    public boolean handlesInternalConstraints() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void invalidateGraph() {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyGraph r0 = r1.mDependencyGraph
            r0.invalidateGraph()
            return
    }

    public void invalidateMeasures() {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyGraph r0 = r1.mDependencyGraph
            r0.invalidateMeasures()
            return
    }

    public boolean isHeightMeasuredTooSmall() {
            r1 = this;
            boolean r0 = r1.mHeightMeasuredTooSmall
            return r0
    }

    public boolean isRtl() {
            r1 = this;
            boolean r0 = r1.mIsRtl
            return r0
    }

    public boolean isWidthMeasuredTooSmall() {
            r1 = this;
            boolean r0 = r1.mWidthMeasuredTooSmall
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.WidgetContainer
    public void layout() {
            r18 = this;
            r1 = r18
            r2 = 0
            r1.mX = r2
            r1.mY = r2
            r1.mWidthMeasuredTooSmall = r2
            r1.mHeightMeasuredTooSmall = r2
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.mChildren
            int r3 = r0.size()
            int r0 = r18.getWidth()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.getHeight()
            int r4 = java.lang.Math.max(r2, r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.mListDimensionBehaviors
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            androidx.constraintlayout.core.Metrics r8 = r1.mMetrics
            if (r8 == 0) goto L33
            long r9 = r8.layouts
            r11 = 1
            long r9 = r9 + r11
            r8.layouts = r9
        L33:
            int r8 = r1.pass
            if (r8 != 0) goto L93
            int r8 = r1.mOptimizationLevel
            boolean r8 = androidx.constraintlayout.core.widgets.Optimizer.enabled(r8, r6)
            if (r8 == 0) goto L93
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r8 = r18.getMeasurer()
            androidx.constraintlayout.core.widgets.analyzer.Direct.solvingPass(r1, r8)
            r8 = 0
        L47:
            if (r8 >= r3) goto L93
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r9 = r1.mChildren
            java.lang.Object r9 = r9.get(r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r10 = r9.isMeasureRequested()
            if (r10 == 0) goto L90
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r10 != 0) goto L90
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r10 != 0) goto L90
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r10 != 0) goto L90
            boolean r10 = r9.isInVirtualLayout()
            if (r10 != 0) goto L90
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r9.getDimensionBehaviour(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.getDimensionBehaviour(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r12) goto L81
            int r10 = r9.mMatchConstraintDefaultWidth
            if (r10 == r6) goto L81
            if (r11 != r12) goto L81
            int r10 = r9.mMatchConstraintDefaultHeight
            if (r10 == r6) goto L81
            r10 = 1
            goto L82
        L81:
            r10 = 0
        L82:
            if (r10 != 0) goto L90
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r10 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r10.<init>()
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r11 = r1.mMeasurer
            int r12 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            measure(r2, r9, r11, r10, r12)
        L90:
            int r8 = r8 + 1
            goto L47
        L93:
            r8 = 2
            if (r3 <= r8) goto Ldc
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r9) goto L9c
            if (r7 != r9) goto Ldc
        L9c:
            int r10 = r1.mOptimizationLevel
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = androidx.constraintlayout.core.widgets.Optimizer.enabled(r10, r11)
            if (r10 == 0) goto Ldc
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r10 = r18.getMeasurer()
            boolean r10 = androidx.constraintlayout.core.widgets.analyzer.Grouping.simpleSolvingPass(r1, r10)
            if (r10 == 0) goto Ldc
            if (r5 != r9) goto Lc4
            int r10 = r18.getWidth()
            if (r0 >= r10) goto Lc0
            if (r0 <= 0) goto Lc0
            r1.setWidth(r0)
            r1.mWidthMeasuredTooSmall = r6
            goto Lc4
        Lc0:
            int r0 = r18.getWidth()
        Lc4:
            if (r7 != r9) goto Ld8
            int r9 = r18.getHeight()
            if (r4 >= r9) goto Ld4
            if (r4 <= 0) goto Ld4
            r1.setHeight(r4)
            r1.mHeightMeasuredTooSmall = r6
            goto Ld8
        Ld4:
            int r4 = r18.getHeight()
        Ld8:
            r9 = r4
            r4 = r0
            r0 = 1
            goto Ldf
        Ldc:
            r9 = r4
            r4 = r0
            r0 = 0
        Ldf:
            r10 = 64
            boolean r11 = r1.optimizeFor(r10)
            if (r11 != 0) goto Lf2
            r11 = 128(0x80, float:1.8E-43)
            boolean r11 = r1.optimizeFor(r11)
            if (r11 == 0) goto Lf0
            goto Lf2
        Lf0:
            r11 = 0
            goto Lf3
        Lf2:
            r11 = 1
        Lf3:
            androidx.constraintlayout.core.LinearSystem r12 = r1.mSystem
            r12.graphOptimizer = r2
            r12.newgraphOptimizer = r2
            int r13 = r1.mOptimizationLevel
            if (r13 == 0) goto L101
            if (r11 == 0) goto L101
            r12.newgraphOptimizer = r6
        L101:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r11 = r1.mChildren
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r18.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r13) goto L114
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r18.getVerticalDimensionBehaviour()
            if (r12 != r13) goto L112
            goto L114
        L112:
            r12 = 0
            goto L115
        L114:
            r12 = 1
        L115:
            r18.resetChains()
            r13 = 0
        L119:
            if (r13 >= r3) goto L12f
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r14 = r1.mChildren
            java.lang.Object r14 = r14.get(r13)
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r14
            boolean r15 = r14 instanceof androidx.constraintlayout.core.widgets.WidgetContainer
            if (r15 == 0) goto L12c
            androidx.constraintlayout.core.widgets.WidgetContainer r14 = (androidx.constraintlayout.core.widgets.WidgetContainer) r14
            r14.layout()
        L12c:
            int r13 = r13 + 1
            goto L119
        L12f:
            boolean r10 = r1.optimizeFor(r10)
            r13 = r0
            r0 = 0
            r14 = 1
        L136:
            if (r14 == 0) goto L324
            int r15 = r0 + 1
            androidx.constraintlayout.core.LinearSystem r0 = r1.mSystem     // Catch: java.lang.Exception -> L1e7
            r0.reset()     // Catch: java.lang.Exception -> L1e7
            r18.resetChains()     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.LinearSystem r0 = r1.mSystem     // Catch: java.lang.Exception -> L1e7
            r1.createObjectVariables(r0)     // Catch: java.lang.Exception -> L1e7
            r0 = 0
        L148:
            if (r0 >= r3) goto L15c
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r1.mChildren     // Catch: java.lang.Exception -> L1e7
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.LinearSystem r2 = r1.mSystem     // Catch: java.lang.Exception -> L1e7
            r6.createObjectVariables(r2)     // Catch: java.lang.Exception -> L1e7
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L148
        L15c:
            androidx.constraintlayout.core.LinearSystem r0 = r1.mSystem     // Catch: java.lang.Exception -> L1e7
            boolean r14 = r1.addChildrenToSolver(r0)     // Catch: java.lang.Exception -> L1e7
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.verticalWrapMin     // Catch: java.lang.Exception -> L1e7
            r2 = 0
            if (r0 == 0) goto L182
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1e7
            if (r0 == 0) goto L182
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.verticalWrapMin     // Catch: java.lang.Exception -> L1e7
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.LinearSystem r6 = r1.mSystem     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.mTop     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.SolverVariable r6 = r6.createObjectVariable(r8)     // Catch: java.lang.Exception -> L1e7
            r1.addMinWrap(r0, r6)     // Catch: java.lang.Exception -> L1e7
            r1.verticalWrapMin = r2     // Catch: java.lang.Exception -> L1e7
        L182:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.verticalWrapMax     // Catch: java.lang.Exception -> L1e7
            if (r0 == 0) goto L1a1
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1e7
            if (r0 == 0) goto L1a1
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.verticalWrapMax     // Catch: java.lang.Exception -> L1e7
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.LinearSystem r6 = r1.mSystem     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.mBottom     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.SolverVariable r6 = r6.createObjectVariable(r8)     // Catch: java.lang.Exception -> L1e7
            r1.addMaxWrap(r0, r6)     // Catch: java.lang.Exception -> L1e7
            r1.verticalWrapMax = r2     // Catch: java.lang.Exception -> L1e7
        L1a1:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.horizontalWrapMin     // Catch: java.lang.Exception -> L1e7
            if (r0 == 0) goto L1c0
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1e7
            if (r0 == 0) goto L1c0
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.horizontalWrapMin     // Catch: java.lang.Exception -> L1e7
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.LinearSystem r6 = r1.mSystem     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.mLeft     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.SolverVariable r6 = r6.createObjectVariable(r8)     // Catch: java.lang.Exception -> L1e7
            r1.addMinWrap(r0, r6)     // Catch: java.lang.Exception -> L1e7
            r1.horizontalWrapMin = r2     // Catch: java.lang.Exception -> L1e7
        L1c0:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.horizontalWrapMax     // Catch: java.lang.Exception -> L1e7
            if (r0 == 0) goto L1df
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1e7
            if (r0 == 0) goto L1df
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.horizontalWrapMax     // Catch: java.lang.Exception -> L1e7
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.LinearSystem r6 = r1.mSystem     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.mRight     // Catch: java.lang.Exception -> L1e7
            androidx.constraintlayout.core.SolverVariable r6 = r6.createObjectVariable(r8)     // Catch: java.lang.Exception -> L1e7
            r1.addMaxWrap(r0, r6)     // Catch: java.lang.Exception -> L1e7
            r1.horizontalWrapMax = r2     // Catch: java.lang.Exception -> L1e7
        L1df:
            if (r14 == 0) goto L201
            androidx.constraintlayout.core.LinearSystem r0 = r1.mSystem     // Catch: java.lang.Exception -> L1e7
            r0.minimize()     // Catch: java.lang.Exception -> L1e7
            goto L201
        L1e7:
            r0 = move-exception
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L201:
            if (r14 == 0) goto L20c
            androidx.constraintlayout.core.LinearSystem r0 = r1.mSystem
            boolean[] r2 = androidx.constraintlayout.core.widgets.Optimizer.flags
            boolean r0 = r1.updateChildrenFromSolver(r0, r2)
            goto L225
        L20c:
            androidx.constraintlayout.core.LinearSystem r0 = r1.mSystem
            r1.updateFromSolver(r0, r10)
            r0 = 0
        L212:
            if (r0 >= r3) goto L224
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r1.mChildren
            java.lang.Object r2 = r2.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.LinearSystem r6 = r1.mSystem
            r2.updateFromSolver(r6, r10)
            int r0 = r0 + 1
            goto L212
        L224:
            r0 = 0
        L225:
            r2 = 8
            if (r12 == 0) goto L296
            if (r15 >= r2) goto L296
            boolean[] r6 = androidx.constraintlayout.core.widgets.Optimizer.flags
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L296
            r6 = 0
            r8 = 0
            r14 = 0
        L235:
            if (r6 >= r3) goto L25f
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r1.mChildren
            java.lang.Object r2 = r2.get(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            r16 = r0
            int r0 = r2.mX
            int r17 = r2.getWidth()
            int r0 = r17 + r0
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.mY
            int r2 = r2.getHeight()
            int r2 = r2 + r0
            int r8 = java.lang.Math.max(r8, r2)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L235
        L25f:
            r16 = r0
            int r0 = r1.mMinWidth
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.mMinHeight
            int r2 = java.lang.Math.max(r2, r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 != r6) goto L282
            int r8 = r18.getWidth()
            if (r8 >= r0) goto L282
            r1.setWidth(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L282:
            if (r7 != r6) goto L298
            int r0 = r18.getHeight()
            if (r0 >= r2) goto L298
            r1.setHeight(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L298
        L296:
            r16 = r0
        L298:
            int r0 = r1.mMinWidth
            int r2 = r18.getWidth()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.getWidth()
            if (r0 <= r2) goto L2b5
            r1.setWidth(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L2b5:
            int r0 = r1.mMinHeight
            int r2 = r18.getHeight()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.getHeight()
            if (r0 <= r2) goto L2d3
            r1.setHeight(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = 1
            r16 = 1
            goto L2d5
        L2d3:
            r6 = 1
            r2 = r13
        L2d5:
            if (r2 != 0) goto L314
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            r8 = 0
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L2f6
            if (r4 <= 0) goto L2f6
            int r0 = r18.getWidth()
            if (r0 <= r4) goto L2f6
            r1.mWidthMeasuredTooSmall = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r8] = r2
            r1.setWidth(r4)
            r2 = 1
            r16 = 1
        L2f6:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            r0 = r0[r6]
            if (r0 != r13) goto L314
            if (r9 <= 0) goto L314
            int r0 = r18.getHeight()
            if (r0 <= r9) goto L314
            r1.mHeightMeasuredTooSmall = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r6] = r2
            r1.setHeight(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L319
        L314:
            r13 = r2
            r2 = r16
            r0 = 8
        L319:
            if (r15 <= r0) goto L31d
            r14 = 0
            goto L31e
        L31d:
            r14 = r2
        L31e:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L136
        L324:
            r1.mChildren = r11
            if (r13 == 0) goto L330
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.mListDimensionBehaviors
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L330:
            androidx.constraintlayout.core.LinearSystem r0 = r1.mSystem
            androidx.constraintlayout.core.Cache r0 = r0.getCache()
            r1.resetSolverVariables(r0)
            return
    }

    public long measure(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21) {
            r12 = this;
            r11 = r12
            r3 = r20
            r11.mPaddingLeft = r3
            r4 = r21
            r11.mPaddingTop = r4
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure r0 = r11.mBasicMeasureSolver
            r1 = r12
            r2 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            long r0 = r0.solverMeasure(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public boolean optimizeFor(int r2) {
            r1 = this;
            int r0 = r1.mOptimizationLevel
            r0 = r0 & r2
            if (r0 != r2) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    @Override // androidx.constraintlayout.core.widgets.WidgetContainer, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void reset() {
            r1 = this;
            androidx.constraintlayout.core.LinearSystem r0 = r1.mSystem
            r0.reset()
            r0 = 0
            r1.mPaddingLeft = r0
            r1.mPaddingTop = r0
            r1.mSkipSolver = r0
            super.reset()
            return
    }

    public void setMeasurer(androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r2) {
            r1 = this;
            r1.mMeasurer = r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyGraph r0 = r1.mDependencyGraph
            r0.setMeasurer(r2)
            return
    }

    public void setOptimizationLevel(int r1) {
            r0 = this;
            r0.mOptimizationLevel = r1
            r1 = 512(0x200, float:7.17E-43)
            boolean r1 = r0.optimizeFor(r1)
            androidx.constraintlayout.core.LinearSystem.USE_DEPENDENCY_ORDERING = r1
            return
    }

    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.mPaddingLeft = r1
            r0.mPaddingTop = r2
            return
    }

    public void setPass(int r1) {
            r0 = this;
            r0.pass = r1
            return
    }

    public void setRtl(boolean r1) {
            r0 = this;
            r0.mIsRtl = r1
            return
    }

    public boolean updateChildrenFromSolver(androidx.constraintlayout.core.LinearSystem r5, boolean[] r6) {
            r4 = this;
            r0 = 2
            r1 = 0
            r6[r0] = r1
            r6 = 64
            boolean r6 = r4.optimizeFor(r6)
            r4.updateFromSolver(r5, r6)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r4.mChildren
            int r0 = r0.size()
            r2 = 0
        L14:
            if (r1 >= r0) goto L2b
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r4.mChildren
            java.lang.Object r3 = r3.get(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            r3.updateFromSolver(r5, r6)
            boolean r3 = r3.hasDimensionOverride()
            if (r3 == 0) goto L28
            r2 = 1
        L28:
            int r1 = r1 + 1
            goto L14
        L2b:
            return r2
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void updateFromRuns(boolean r4, boolean r5) {
            r3 = this;
            super.updateFromRuns(r4, r5)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r3.mChildren
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r3.mChildren
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            r2.updateFromRuns(r4, r5)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    public void updateHierarchy() {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure r0 = r1.mBasicMeasureSolver
            r0.updateHierarchy(r1)
            return
    }
}
