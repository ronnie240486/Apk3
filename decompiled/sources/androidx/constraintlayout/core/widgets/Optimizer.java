package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes2.dex */
public class Optimizer {
    public static final int OPTIMIZATION_BARRIER = 2;
    public static final int OPTIMIZATION_CACHE_MEASURES = 256;
    public static final int OPTIMIZATION_CHAIN = 4;
    public static final int OPTIMIZATION_DEPENDENCY_ORDERING = 512;
    public static final int OPTIMIZATION_DIMENSIONS = 8;
    public static final int OPTIMIZATION_DIRECT = 1;
    public static final int OPTIMIZATION_GRAPH = 64;
    public static final int OPTIMIZATION_GRAPH_WRAP = 128;
    public static final int OPTIMIZATION_GROUPING = 1024;
    public static final int OPTIMIZATION_GROUPS = 32;
    public static final int OPTIMIZATION_NONE = 0;
    public static final int OPTIMIZATION_RATIO = 16;
    public static final int OPTIMIZATION_STANDARD = 257;
    public static boolean[] flags;

    static {
            r0 = 3
            boolean[] r0 = new boolean[r0]
            androidx.constraintlayout.core.widgets.Optimizer.flags = r0
            return
    }

    public Optimizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkMatchParent(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6, androidx.constraintlayout.core.LinearSystem r7, androidx.constraintlayout.core.widgets.ConstraintWidget r8) {
            r0 = -1
            r8.mHorizontalResolution = r0
            r8.mVerticalResolution = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r6.mListDimensionBehaviors
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r3 = 2
            if (r0 == r2) goto L47
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r8.mListDimensionBehaviors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto L47
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r8.mLeft
            int r0 = r0.mMargin
            int r1 = r6.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mRight
            int r4 = r4.mMargin
            int r1 = r1 - r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mLeft
            androidx.constraintlayout.core.SolverVariable r5 = r7.createObjectVariable(r4)
            r4.mSolverVariable = r5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mRight
            androidx.constraintlayout.core.SolverVariable r5 = r7.createObjectVariable(r4)
            r4.mSolverVariable = r5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mLeft
            androidx.constraintlayout.core.SolverVariable r4 = r4.mSolverVariable
            r7.addEquality(r4, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mRight
            androidx.constraintlayout.core.SolverVariable r4 = r4.mSolverVariable
            r7.addEquality(r4, r1)
            r8.mHorizontalResolution = r3
            r8.setHorizontalDimension(r0, r1)
        L47:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r6.mListDimensionBehaviors
            r1 = 1
            r0 = r0[r1]
            if (r0 == r2) goto La4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r8.mListDimensionBehaviors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto La4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r8.mTop
            int r0 = r0.mMargin
            int r6 = r6.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mBottom
            int r1 = r1.mMargin
            int r6 = r6 - r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mTop
            androidx.constraintlayout.core.SolverVariable r2 = r7.createObjectVariable(r1)
            r1.mSolverVariable = r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mBottom
            androidx.constraintlayout.core.SolverVariable r2 = r7.createObjectVariable(r1)
            r1.mSolverVariable = r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mTop
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            r7.addEquality(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mBottom
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            r7.addEquality(r1, r6)
            int r1 = r8.mBaselineDistance
            if (r1 > 0) goto L8d
            int r1 = r8.getVisibility()
            r2 = 8
            if (r1 != r2) goto L9f
        L8d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mBaseline
            androidx.constraintlayout.core.SolverVariable r2 = r7.createObjectVariable(r1)
            r1.mSolverVariable = r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mBaseline
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            int r2 = r8.mBaselineDistance
            int r2 = r2 + r0
            r7.addEquality(r1, r2)
        L9f:
            r8.mVerticalResolution = r3
            r8.setVerticalDimension(r0, r6)
        La4:
            return
    }

    public static final boolean enabled(int r0, int r1) {
            r0 = r0 & r1
            if (r0 != r1) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }
}
