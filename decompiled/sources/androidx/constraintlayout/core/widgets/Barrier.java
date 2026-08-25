package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes3.dex */
public class Barrier extends androidx.constraintlayout.core.widgets.HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private static final boolean USE_RELAX_GONE = false;
    private static final boolean USE_RESOLUTION = true;
    private boolean mAllowsGoneWidget;
    private int mBarrierType;
    private int mMargin;
    public boolean resolved;

    public Barrier() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mBarrierType = r0
            r1 = 1
            r2.mAllowsGoneWidget = r1
            r2.mMargin = r0
            r2.resolved = r0
            return
    }

    public Barrier(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mBarrierType = r0
            r1 = 1
            r2.mAllowsGoneWidget = r1
            r2.mMargin = r0
            r2.resolved = r0
            r2.setDebugName(r3)
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.core.LinearSystem r13, boolean r14) {
            r12 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r14 = r12.mListAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mLeft
            r1 = 0
            r14[r1] = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mTop
            r2 = 2
            r14[r2] = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mRight
            r3 = 1
            r14[r3] = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mBottom
            r4 = 3
            r14[r4] = r0
            r14 = 0
        L17:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            int r5 = r0.length
            if (r14 >= r5) goto L29
            r5 = r0[r14]
            r0 = r0[r14]
            androidx.constraintlayout.core.SolverVariable r0 = r13.createObjectVariable(r0)
            r5.mSolverVariable = r0
            int r14 = r14 + 1
            goto L17
        L29:
            int r14 = r12.mBarrierType
            if (r14 < 0) goto L202
            r5 = 4
            if (r14 >= r5) goto L202
            r14 = r0[r14]
            boolean r0 = r12.resolved
            if (r0 != 0) goto L39
            r12.allSolved()
        L39:
            boolean r0 = r12.resolved
            if (r0 == 0) goto L70
            r12.resolved = r1
            int r14 = r12.mBarrierType
            if (r14 == 0) goto L5d
            if (r14 != r3) goto L46
            goto L5d
        L46:
            if (r14 == r2) goto L4a
            if (r14 != r4) goto L6f
        L4a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            int r0 = r12.mY
            r13.addEquality(r14, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mBottom
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            int r0 = r12.mY
            r13.addEquality(r14, r0)
            goto L6f
        L5d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            int r0 = r12.mX
            r13.addEquality(r14, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mRight
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            int r0 = r12.mX
            r13.addEquality(r14, r0)
        L6f:
            return
        L70:
            r0 = 0
        L71:
            int r6 = r12.mWidgetsCount
            if (r0 >= r6) goto Lbe
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r6 = r12.mWidgets
            r6 = r6[r0]
            boolean r7 = r12.mAllowsGoneWidget
            if (r7 != 0) goto L84
            boolean r7 = r6.allowedInBarrier()
            if (r7 != 0) goto L84
            goto Lbb
        L84:
            int r7 = r12.mBarrierType
            if (r7 == 0) goto L8a
            if (r7 != r3) goto La0
        L8a:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r8) goto La0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r6.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto La0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r6.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto La0
        L9e:
            r0 = 1
            goto Lbf
        La0:
            int r7 = r12.mBarrierType
            if (r7 == r2) goto La6
            if (r7 != r4) goto Lbb
        La6:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r8) goto Lbb
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r6.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto Lbb
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mTarget
            if (r6 == 0) goto Lbb
            goto L9e
        Lbb:
            int r0 = r0 + 1
            goto L71
        Lbe:
            r0 = 0
        Lbf:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r12.mLeft
            boolean r6 = r6.hasCenteredDependents()
            if (r6 != 0) goto Ld2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r12.mRight
            boolean r6 = r6.hasCenteredDependents()
            if (r6 == 0) goto Ld0
            goto Ld2
        Ld0:
            r6 = 0
            goto Ld3
        Ld2:
            r6 = 1
        Ld3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r12.mTop
            boolean r7 = r7.hasCenteredDependents()
            if (r7 != 0) goto Le6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r12.mBottom
            boolean r7 = r7.hasCenteredDependents()
            if (r7 == 0) goto Le4
            goto Le6
        Le4:
            r7 = 0
            goto Le7
        Le6:
            r7 = 1
        Le7:
            if (r0 != 0) goto Lfd
            int r8 = r12.mBarrierType
            if (r8 != 0) goto Lef
            if (r6 != 0) goto Lfb
        Lef:
            if (r8 != r2) goto Lf3
            if (r7 != 0) goto Lfb
        Lf3:
            if (r8 != r3) goto Lf7
            if (r6 != 0) goto Lfb
        Lf7:
            if (r8 != r4) goto Lfd
            if (r7 == 0) goto Lfd
        Lfb:
            r6 = 1
            goto Lfe
        Lfd:
            r6 = 0
        Lfe:
            r7 = 5
            if (r6 != 0) goto L102
            r7 = 4
        L102:
            r6 = 0
        L103:
            int r8 = r12.mWidgetsCount
            if (r6 >= r8) goto L15e
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r12.mWidgets
            r8 = r8[r6]
            boolean r9 = r12.mAllowsGoneWidget
            if (r9 != 0) goto L116
            boolean r9 = r8.allowedInBarrier()
            if (r9 != 0) goto L116
            goto L15b
        L116:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r9 = r8.mListAnchors
            int r10 = r12.mBarrierType
            r9 = r9[r10]
            androidx.constraintlayout.core.SolverVariable r9 = r13.createObjectVariable(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r8.mListAnchors
            int r10 = r12.mBarrierType
            r11 = r8[r10]
            r11.mSolverVariable = r9
            r11 = r8[r10]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 == 0) goto L13c
            r11 = r8[r10]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r11.mOwner
            if (r11 != r12) goto L13c
            r8 = r8[r10]
            int r8 = r8.mMargin
            int r8 = r8 + r1
            goto L13d
        L13c:
            r8 = 0
        L13d:
            if (r10 == 0) goto L14b
            if (r10 != r2) goto L142
            goto L14b
        L142:
            androidx.constraintlayout.core.SolverVariable r10 = r14.mSolverVariable
            int r11 = r12.mMargin
            int r11 = r11 + r8
            r13.addGreaterBarrier(r10, r9, r11, r0)
            goto L153
        L14b:
            androidx.constraintlayout.core.SolverVariable r10 = r14.mSolverVariable
            int r11 = r12.mMargin
            int r11 = r11 - r8
            r13.addLowerBarrier(r10, r9, r11, r0)
        L153:
            androidx.constraintlayout.core.SolverVariable r10 = r14.mSolverVariable
            int r11 = r12.mMargin
            int r11 = r11 + r8
            r13.addEquality(r10, r9, r11, r7)
        L15b:
            int r6 = r6 + 1
            goto L103
        L15e:
            int r14 = r12.mBarrierType
            r0 = 8
            if (r14 != 0) goto L18b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mRight
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r13.addEquality(r14, r2, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r13.addEquality(r14, r0, r1, r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mLeft
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r13.addEquality(r14, r0, r1, r1)
            goto L202
        L18b:
            if (r14 != r3) goto L1b3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r12.mRight
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r13.addEquality(r14, r2, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mLeft
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r13.addEquality(r14, r0, r1, r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r13.addEquality(r14, r0, r1, r1)
            goto L202
        L1b3:
            if (r14 != r2) goto L1db
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mBottom
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r13.addEquality(r14, r2, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r13.addEquality(r14, r0, r1, r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTop
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r13.addEquality(r14, r0, r1, r1)
            goto L202
        L1db:
            if (r14 != r4) goto L202
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r12.mBottom
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r13.addEquality(r14, r2, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTop
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r13.addEquality(r14, r0, r1, r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r13.addEquality(r14, r0, r1, r1)
        L202:
            return
    }

    public boolean allSolved() {
            r8 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = 1
        L4:
            int r4 = r8.mWidgetsCount
            r5 = 3
            r6 = 2
            if (r2 >= r4) goto L37
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r8.mWidgets
            r4 = r4[r2]
            boolean r7 = r8.mAllowsGoneWidget
            if (r7 != 0) goto L19
            boolean r7 = r4.allowedInBarrier()
            if (r7 != 0) goto L19
            goto L34
        L19:
            int r7 = r8.mBarrierType
            if (r7 == 0) goto L1f
            if (r7 != r1) goto L27
        L1f:
            boolean r7 = r4.isResolvedHorizontally()
            if (r7 != 0) goto L27
        L25:
            r3 = 0
            goto L34
        L27:
            int r7 = r8.mBarrierType
            if (r7 == r6) goto L2d
            if (r7 != r5) goto L34
        L2d:
            boolean r4 = r4.isResolvedVertically()
            if (r4 != 0) goto L34
            goto L25
        L34:
            int r2 = r2 + 1
            goto L4
        L37:
            if (r3 == 0) goto Le6
            if (r4 <= 0) goto Le6
            r2 = 0
            r3 = 0
        L3d:
            int r4 = r8.mWidgetsCount
            if (r0 >= r4) goto Ld2
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r8.mWidgets
            r4 = r4[r0]
            boolean r7 = r8.mAllowsGoneWidget
            if (r7 != 0) goto L51
            boolean r7 = r4.allowedInBarrier()
            if (r7 != 0) goto L51
            goto Lce
        L51:
            if (r3 != 0) goto L89
            int r3 = r8.mBarrierType
            if (r3 != 0) goto L62
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.getAnchor(r2)
            int r2 = r2.getFinalValue()
            goto L88
        L62:
            if (r3 != r1) goto L6f
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.getAnchor(r2)
            int r2 = r2.getFinalValue()
            goto L88
        L6f:
            if (r3 != r6) goto L7c
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.getAnchor(r2)
            int r2 = r2.getFinalValue()
            goto L88
        L7c:
            if (r3 != r5) goto L88
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.getAnchor(r2)
            int r2 = r2.getFinalValue()
        L88:
            r3 = 1
        L89:
            int r7 = r8.mBarrierType
            if (r7 != 0) goto L9c
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r7)
            int r4 = r4.getFinalValue()
            int r2 = java.lang.Math.min(r2, r4)
            goto Lce
        L9c:
            if (r7 != r1) goto Lad
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r7)
            int r4 = r4.getFinalValue()
            int r2 = java.lang.Math.max(r2, r4)
            goto Lce
        Lad:
            if (r7 != r6) goto Lbe
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r7)
            int r4 = r4.getFinalValue()
            int r2 = java.lang.Math.min(r2, r4)
            goto Lce
        Lbe:
            if (r7 != r5) goto Lce
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r7)
            int r4 = r4.getFinalValue()
            int r2 = java.lang.Math.max(r2, r4)
        Lce:
            int r0 = r0 + 1
            goto L3d
        Ld2:
            int r0 = r8.mMargin
            int r2 = r2 + r0
            int r0 = r8.mBarrierType
            if (r0 == 0) goto Le0
            if (r0 != r1) goto Ldc
            goto Le0
        Ldc:
            r8.setFinalVertical(r2, r2)
            goto Le3
        Le0:
            r8.setFinalHorizontal(r2, r2)
        Le3:
            r8.resolved = r1
            return r1
        Le6:
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
            r1 = this;
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public boolean allowsGoneWidget() {
            r1 = this;
            boolean r0 = r1.mAllowsGoneWidget
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget r1, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> r2) {
            r0 = this;
            super.copy(r1, r2)
            androidx.constraintlayout.core.widgets.Barrier r1 = (androidx.constraintlayout.core.widgets.Barrier) r1
            int r2 = r1.mBarrierType
            r0.mBarrierType = r2
            boolean r2 = r1.mAllowsGoneWidget
            r0.mAllowsGoneWidget = r2
            int r1 = r1.mMargin
            r0.mMargin = r1
            return
    }

    public boolean getAllowsGoneWidget() {
            r1 = this;
            boolean r0 = r1.mAllowsGoneWidget
            return r0
    }

    public int getBarrierType() {
            r1 = this;
            int r0 = r1.mBarrierType
            return r0
    }

    public int getMargin() {
            r1 = this;
            int r0 = r1.mMargin
            return r0
    }

    public int getOrientation() {
            r3 = this;
            int r0 = r3.mBarrierType
            if (r0 == 0) goto L10
            r1 = 1
            if (r0 == r1) goto L10
            r2 = 2
            if (r0 == r2) goto Lf
            r2 = 3
            if (r0 == r2) goto Lf
            r0 = -1
            return r0
        Lf:
            return r1
        L10:
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
            r1 = this;
            boolean r0 = r1.resolved
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
            r1 = this;
            boolean r0 = r1.resolved
            return r0
    }

    public final void markWidgets() {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r6.mWidgetsCount
            if (r1 >= r2) goto L2d
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r6.mWidgets
            r2 = r2[r1]
            boolean r3 = r6.mAllowsGoneWidget
            if (r3 != 0) goto L15
            boolean r3 = r2.allowedInBarrier()
            if (r3 != 0) goto L15
            goto L2a
        L15:
            int r3 = r6.mBarrierType
            r4 = 1
            if (r3 == 0) goto L27
            if (r3 != r4) goto L1d
            goto L27
        L1d:
            r5 = 2
            if (r3 == r5) goto L23
            r5 = 3
            if (r3 != r5) goto L2a
        L23:
            r2.setInBarrier(r4, r4)
            goto L2a
        L27:
            r2.setInBarrier(r0, r4)
        L2a:
            int r1 = r1 + 1
            goto L2
        L2d:
            return
    }

    public void setAllowsGoneWidget(boolean r1) {
            r0 = this;
            r0.mAllowsGoneWidget = r1
            return
    }

    public void setBarrierType(int r1) {
            r0 = this;
            r0.mBarrierType = r1
            return
    }

    public void setMargin(int r1) {
            r0 = this;
            r0.mMargin = r1
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "[Barrier] "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.getDebugName()
            r0.append(r1)
            java.lang.String r1 = " {"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
        L17:
            int r2 = r4.mWidgetsCount
            if (r1 >= r2) goto L39
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r4.mWidgets
            r2 = r2[r1]
            if (r1 <= 0) goto L27
            java.lang.String r3 = ", "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
        L27:
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r2 = r2.getDebugName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r1 = r1 + 1
            goto L17
        L39:
            java.lang.String r1 = "}"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
            return r0
    }
}
