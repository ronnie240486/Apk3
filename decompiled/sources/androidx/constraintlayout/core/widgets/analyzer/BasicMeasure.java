package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes3.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer;
    private androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure mMeasure;
    private final java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> mVariableDimensionsWidgets;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;

        public Measure() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface Measurer {
        void didMeasures();

        void measure(androidx.constraintlayout.core.widgets.ConstraintWidget r1, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r2);
    }

    public BasicMeasure(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mVariableDimensionsWidgets = r0
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            r1.mMeasure = r0
            r1.constraintWidgetContainer = r2
            return
    }

    private boolean measure(androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r6, androidx.constraintlayout.core.widgets.ConstraintWidget r7, int r8) {
            r5 = this;
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r5.mMeasure
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r7.getHorizontalDimensionBehaviour()
            r0.horizontalBehavior = r1
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r5.mMeasure
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r7.getVerticalDimensionBehaviour()
            r0.verticalBehavior = r1
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r5.mMeasure
            int r1 = r7.getWidth()
            r0.horizontalDimension = r1
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r5.mMeasure
            int r1 = r7.getHeight()
            r0.verticalDimension = r1
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r5.mMeasure
            r1 = 0
            r0.measuredNeedsSolverPass = r1
            r0.measureStrategy = r8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r0.horizontalBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r3 = 1
            if (r8 != r2) goto L30
            r8 = 1
            goto L31
        L30:
            r8 = 0
        L31:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r0.verticalBehavior
            if (r4 != r2) goto L37
            r2 = 1
            goto L38
        L37:
            r2 = 0
        L38:
            r4 = 0
            if (r8 == 0) goto L43
            float r8 = r7.mDimensionRatio
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 <= 0) goto L43
            r8 = 1
            goto L44
        L43:
            r8 = 0
        L44:
            if (r2 == 0) goto L4e
            float r2 = r7.mDimensionRatio
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L4e
            r2 = 1
            goto L4f
        L4e:
            r2 = 0
        L4f:
            r4 = 4
            if (r8 == 0) goto L5c
            int[] r8 = r7.mResolvedMatchConstraintDefault
            r8 = r8[r1]
            if (r8 != r4) goto L5c
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.horizontalBehavior = r8
        L5c:
            if (r2 == 0) goto L68
            int[] r8 = r7.mResolvedMatchConstraintDefault
            r8 = r8[r3]
            if (r8 != r4) goto L68
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.verticalBehavior = r8
        L68:
            r6.measure(r7, r0)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r6 = r5.mMeasure
            int r6 = r6.measuredWidth
            r7.setWidth(r6)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r6 = r5.mMeasure
            int r6 = r6.measuredHeight
            r7.setHeight(r6)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r6 = r5.mMeasure
            boolean r6 = r6.measuredHasBaseline
            r7.setHasBaseline(r6)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r6 = r5.mMeasure
            int r6 = r6.measuredBaseline
            r7.setBaselineDistance(r6)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r6 = r5.mMeasure
            int r7 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r6.measureStrategy = r7
            boolean r6 = r6.measuredNeedsSolverPass
            return r6
    }

    private void measureChildren(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r13) {
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r13.mChildren
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.optimizeFor(r1)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r2 = r13.getMeasurer()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r13.mChildren
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.isInVirtualLayout()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r5.horizontalRun
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r7 = r5.verticalRun
            if (r7 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r7.dimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L48
            goto Lac
        L48:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.getDimensionBehaviour(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.getDimensionBehaviour(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.mMatchConstraintDefaultWidth
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.mMatchConstraintDefaultHeight
            if (r10 == r7) goto L61
            r10 = 1
            goto L62
        L61:
            r10 = 0
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.optimizeFor(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.mMatchConstraintDefaultWidth
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L7d
            r10 = 1
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.mMatchConstraintDefaultHeight
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L8c
            r10 = 1
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.mDimensionRatio
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r12.measure(r2, r5, r6)
            androidx.constraintlayout.core.Metrics r5 = r13.mMetrics
            if (r5 == 0) goto Lac
            long r6 = r5.measuredWidgets
            r8 = 1
            long r6 = r6 + r8
            r5.measuredWidgets = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.didMeasures()
            return
    }

    private void solveLinearSystem(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3, java.lang.String r4, int r5, int r6, int r7) {
            r2 = this;
            int r4 = r3.getMinWidth()
            int r0 = r3.getMinHeight()
            r1 = 0
            r3.setMinWidth(r1)
            r3.setMinHeight(r1)
            r3.setWidth(r6)
            r3.setHeight(r7)
            r3.setMinWidth(r4)
            r3.setMinHeight(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r2.constraintWidgetContainer
            r3.setPass(r5)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r2.constraintWidgetContainer
            r3.layout()
            return
    }

    public long solverMeasure(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r28
            r4 = r30
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r5 = r24.getMeasurer()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r1.mChildren
            int r6 = r6.size()
            int r7 = r24.getWidth()
            int r8 = r24.getHeight()
            r9 = 128(0x80, float:1.8E-43)
            boolean r9 = androidx.constraintlayout.core.widgets.Optimizer.enabled(r2, r9)
            r10 = 0
            if (r9 != 0) goto L30
            r12 = 64
            boolean r2 = androidx.constraintlayout.core.widgets.Optimizer.enabled(r2, r12)
            if (r2 == 0) goto L2e
            goto L30
        L2e:
            r2 = 0
            goto L31
        L30:
            r2 = 1
        L31:
            if (r2 == 0) goto L8a
            r12 = 0
        L34:
            if (r12 >= r6) goto L8a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r13 = r1.mChildren
            java.lang.Object r13 = r13.get(r12)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r13.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r14 != r15) goto L48
            r14 = 1
            goto L49
        L48:
            r14 = 0
        L49:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r13.getVerticalDimensionBehaviour()
            if (r11 != r15) goto L51
            r11 = 1
            goto L52
        L51:
            r11 = 0
        L52:
            if (r14 == 0) goto L61
            if (r11 == 0) goto L61
            float r11 = r13.getDimensionRatio()
            r14 = 0
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 <= 0) goto L61
            r11 = 1
            goto L62
        L61:
            r11 = 0
        L62:
            boolean r14 = r13.isInHorizontalChain()
            if (r14 == 0) goto L6c
            if (r11 == 0) goto L6c
        L6a:
            r2 = 0
            goto L8a
        L6c:
            boolean r14 = r13.isInVerticalChain()
            if (r14 == 0) goto L75
            if (r11 == 0) goto L75
            goto L6a
        L75:
            boolean r11 = r13 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r11 == 0) goto L7a
            goto L6a
        L7a:
            boolean r11 = r13.isInHorizontalChain()
            if (r11 != 0) goto L6a
            boolean r11 = r13.isInVerticalChain()
            if (r11 == 0) goto L87
            goto L6a
        L87:
            int r12 = r12 + 1
            goto L34
        L8a:
            r11 = 1
            if (r2 == 0) goto L97
            androidx.constraintlayout.core.Metrics r13 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r13 == 0) goto L97
            long r14 = r13.measures
            long r14 = r14 + r11
            r13.measures = r14
        L97:
            r13 = 1073741824(0x40000000, float:2.0)
            if (r3 != r13) goto L9d
            if (r4 == r13) goto L9f
        L9d:
            if (r9 == 0) goto La1
        L9f:
            r14 = 1
            goto La2
        La1:
            r14 = 0
        La2:
            r2 = r2 & r14
            r14 = 2
            if (r2 == 0) goto L10a
            int r15 = r24.getMaxWidth()
            r11 = r29
            int r11 = java.lang.Math.min(r15, r11)
            int r12 = r24.getMaxHeight()
            r15 = r31
            int r12 = java.lang.Math.min(r12, r15)
            if (r3 != r13) goto Lc8
            int r15 = r24.getWidth()
            if (r15 == r11) goto Lc8
            r1.setWidth(r11)
            r24.invalidateGraph()
        Lc8:
            if (r4 != r13) goto Ld6
            int r11 = r24.getHeight()
            if (r11 == r12) goto Ld6
            r1.setHeight(r12)
            r24.invalidateGraph()
        Ld6:
            if (r3 != r13) goto Le0
            if (r4 != r13) goto Le0
            boolean r9 = r1.directMeasure(r9)
            r12 = 2
            goto Lfa
        Le0:
            boolean r11 = r1.directMeasureSetup(r9)
            if (r3 != r13) goto Led
            boolean r12 = r1.directMeasureWithOrientation(r9, r10)
            r11 = r11 & r12
            r12 = 1
            goto Lee
        Led:
            r12 = 0
        Lee:
            if (r4 != r13) goto Lf9
            r15 = 1
            boolean r9 = r1.directMeasureWithOrientation(r9, r15)
            r9 = r9 & r11
            int r12 = r12 + 1
            goto Lfa
        Lf9:
            r9 = r11
        Lfa:
            if (r9 == 0) goto L10c
            if (r3 != r13) goto L100
            r15 = 1
            goto L101
        L100:
            r15 = 0
        L101:
            if (r4 != r13) goto L105
            r3 = 1
            goto L106
        L105:
            r3 = 0
        L106:
            r1.updateFromRuns(r15, r3)
            goto L10c
        L10a:
            r9 = 0
            r12 = 0
        L10c:
            if (r9 == 0) goto L110
            if (r12 == r14) goto L314
        L110:
            int r3 = r24.getOptimizationLevel()
            if (r6 <= 0) goto L119
            r23.measureChildren(r24)
        L119:
            r23.updateHierarchy(r24)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r4 = r0.mVariableDimensionsWidgets
            int r4 = r4.size()
            if (r6 <= 0) goto L136
            r6 = 0
            java.lang.String r9 = "First pass"
            r25 = r23
            r26 = r24
            r27 = r9
            r28 = r6
            r29 = r7
            r30 = r8
            r25.solveLinearSystem(r26, r27, r28, r29, r30)
        L136:
            if (r4 <= 0) goto L310
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r24.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r9) goto L142
            r15 = 1
            goto L143
        L142:
            r15 = 0
        L143:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r24.getVerticalDimensionBehaviour()
            if (r6 != r9) goto L14b
            r6 = 1
            goto L14c
        L14b:
            r6 = 0
        L14c:
            int r9 = r24.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r11 = r0.constraintWidgetContainer
            int r11 = r11.getMinWidth()
            int r9 = java.lang.Math.max(r9, r11)
            int r11 = r24.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r12 = r0.constraintWidgetContainer
            int r12 = r12.getMinHeight()
            int r11 = java.lang.Math.max(r11, r12)
            r12 = 0
            r13 = 0
        L16a:
            if (r12 >= r4) goto L206
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r10 = r0.mVariableDimensionsWidgets
            java.lang.Object r10 = r10.get(r12)
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r10
            boolean r14 = r10 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r14 != 0) goto L180
            r31 = r3
            r19 = r7
            r18 = r8
            goto L1fa
        L180:
            int r14 = r10.getWidth()
            r31 = r3
            int r3 = r10.getHeight()
            r18 = r8
            int r8 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
            boolean r8 = r0.measure(r5, r10, r8)
            r8 = r8 | r13
            androidx.constraintlayout.core.Metrics r13 = r1.mMetrics
            r19 = r7
            r25 = r8
            if (r13 == 0) goto L1a3
            long r7 = r13.measuredMatchWidgets
            r16 = 1
            long r7 = r7 + r16
            r13.measuredMatchWidgets = r7
        L1a3:
            int r7 = r10.getWidth()
            int r8 = r10.getHeight()
            if (r7 == r14) goto L1ce
            r10.setWidth(r7)
            if (r15 == 0) goto L1cc
            int r7 = r10.getRight()
            if (r7 <= r9) goto L1cc
            int r7 = r10.getRight()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r10.getAnchor(r13)
            int r13 = r13.getMargin()
            int r13 = r13 + r7
            int r7 = java.lang.Math.max(r9, r13)
            r9 = r7
        L1cc:
            r7 = 1
            goto L1d0
        L1ce:
            r7 = r25
        L1d0:
            if (r8 == r3) goto L1f2
            r10.setHeight(r8)
            if (r6 == 0) goto L1f1
            int r3 = r10.getBottom()
            if (r3 <= r11) goto L1f1
            int r3 = r10.getBottom()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r10.getAnchor(r7)
            int r7 = r7.getMargin()
            int r7 = r7 + r3
            int r3 = java.lang.Math.max(r11, r7)
            r11 = r3
        L1f1:
            r7 = 1
        L1f2:
            androidx.constraintlayout.core.widgets.VirtualLayout r10 = (androidx.constraintlayout.core.widgets.VirtualLayout) r10
            boolean r3 = r10.needSolverPass()
            r13 = r7 | r3
        L1fa:
            int r12 = r12 + 1
            r3 = r31
            r8 = r18
            r7 = r19
            r10 = 0
            r14 = 2
            goto L16a
        L206:
            r31 = r3
            r19 = r7
            r18 = r8
            r3 = 0
            r7 = 2
        L20e:
            if (r3 >= r7) goto L30d
            r8 = 0
        L211:
            if (r8 >= r4) goto L2e6
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r10 = r0.mVariableDimensionsWidgets
            java.lang.Object r10 = r10.get(r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r10
            boolean r12 = r10 instanceof androidx.constraintlayout.core.widgets.Helper
            if (r12 == 0) goto L223
            boolean r12 = r10 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r12 == 0) goto L248
        L223:
            boolean r12 = r10 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r12 == 0) goto L228
            goto L248
        L228:
            int r12 = r10.getVisibility()
            r14 = 8
            if (r12 != r14) goto L231
            goto L248
        L231:
            if (r2 == 0) goto L244
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r12 = r10.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r12 = r12.dimension
            boolean r12 = r12.resolved
            if (r12 == 0) goto L244
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r12 = r10.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r12 = r12.dimension
            boolean r12 = r12.resolved
            if (r12 == 0) goto L244
            goto L248
        L244:
            boolean r12 = r10 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r12 == 0) goto L252
        L248:
            r21 = r2
            r22 = r4
            r20 = r5
            r16 = 1
            goto L2db
        L252:
            int r12 = r10.getWidth()
            int r14 = r10.getHeight()
            int r7 = r10.getBaselineDistance()
            int r20 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
            r21 = r2
            r2 = 1
            if (r3 != r2) goto L267
            int r20 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
        L267:
            r2 = r20
            boolean r2 = r0.measure(r5, r10, r2)
            r2 = r2 | r13
            androidx.constraintlayout.core.Metrics r13 = r1.mMetrics
            r22 = r4
            r20 = r5
            if (r13 == 0) goto L27f
            long r4 = r13.measuredMatchWidgets
            r16 = 1
            long r4 = r4 + r16
            r13.measuredMatchWidgets = r4
            goto L281
        L27f:
            r16 = 1
        L281:
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            if (r4 == r12) goto L2aa
            r10.setWidth(r4)
            if (r15 == 0) goto L2a9
            int r2 = r10.getRight()
            if (r2 <= r9) goto L2a9
            int r2 = r10.getRight()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r10.getAnchor(r4)
            int r4 = r4.getMargin()
            int r4 = r4 + r2
            int r9 = java.lang.Math.max(r9, r4)
        L2a9:
            r2 = 1
        L2aa:
            if (r5 == r14) goto L2cc
            r10.setHeight(r5)
            if (r6 == 0) goto L2cb
            int r2 = r10.getBottom()
            if (r2 <= r11) goto L2cb
            int r2 = r10.getBottom()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r10.getAnchor(r4)
            int r4 = r4.getMargin()
            int r4 = r4 + r2
            int r2 = java.lang.Math.max(r11, r4)
            r11 = r2
        L2cb:
            r2 = 1
        L2cc:
            boolean r4 = r10.hasBaseline()
            if (r4 == 0) goto L2da
            int r4 = r10.getBaselineDistance()
            if (r7 == r4) goto L2da
            r13 = 1
            goto L2db
        L2da:
            r13 = r2
        L2db:
            int r8 = r8 + 1
            r5 = r20
            r2 = r21
            r4 = r22
            r7 = 2
            goto L211
        L2e6:
            r21 = r2
            r22 = r4
            r20 = r5
            r16 = 1
            if (r13 == 0) goto L30d
            int r3 = r3 + 1
            java.lang.String r2 = "intermediate pass"
            r25 = r23
            r26 = r24
            r27 = r2
            r28 = r3
            r29 = r19
            r30 = r18
            r25.solveLinearSystem(r26, r27, r28, r29, r30)
            r5 = r20
            r2 = r21
            r4 = r22
            r7 = 2
            r13 = 0
            goto L20e
        L30d:
            r2 = r31
            goto L311
        L310:
            r2 = r3
        L311:
            r1.setOptimizationLevel(r2)
        L314:
            r1 = 0
            return r1
    }

    public void updateHierarchy(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6) {
            r5 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r5.mVariableDimensionsWidgets
            r0.clear()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r6.mChildren
            int r0 = r0.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L2c
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r6.mChildren
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 == r4) goto L24
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.getVerticalDimensionBehaviour()
            if (r3 != r4) goto L29
        L24:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r5.mVariableDimensionsWidgets
            r3.add(r2)
        L29:
            int r1 = r1 + 1
            goto Lc
        L2c:
            r6.invalidateGraph()
            return
    }
}
